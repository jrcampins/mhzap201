-- Este procedimiento calcula el icv de una ficha hogar utilizando las ponderaciones de un area rural
-- @param ficha_hogar: Fila con los datos de la ficha hogar a calcularle el icv
-- @param out icv: campo en el que se almacena el valor de icv calculado con las ponderaciones
-- @param out puntajes (): Arreglo con los 28 puntajes de cada variable. Los puntajes no influyen directamente sobre el valor de icv, se usan para comparar variables
-- @param out ponderaciones (): Arreglo con las 28 ponderaciones de cada variable.
-- @return el valor del icv 

--create or replace TYPE array_number IS VARRAY(28) OF NUMBER;

procedure calcular_icv_area_rural (row_ficha_hogar ficha_hogar%rowtype, icv out number, puntajes out array_number, ponderaciones out array_number) is
        --Se utiliza un cursor para explorar las fichas de personas que viven en el hogar
        cursor cursor_ficha_persona(id_hogar in number)  is
                            select * from ficha_persona p 
                            where p.id_ficha_hogar=id_hogar;
        row_ficha_persona ficha_persona%ROWTYPE;
        total_miembros_hogar number:=0;
        total_ninos_hogar number:=0;
        numero_hijos_6a24 number:=0;
        ultimo_grado_aprobado number:=0;
        nivel_grado_aprobado number :=0;
        anos_estudio number:=0;
        anos_estudio_jefe number:=0;
        total_an_est_p_h number:=0;
        coef_est_p_h number;
        anos_estudio_conyuge number;
        idioma_jefe number:=0;
        idioma_conyuge number:=0;
        asistencia_escolar number;
        numero_seguros number:=0;
        n_enf_90_dias number:=0;
        numero_asistencias_cs number:=0;
        numero_ninos_vacunados number:=0;
        trabajo_30_dias_jefe number:=0;
        cargo_trabajo_jefe number:=0;
        diferencia_vacunados number;
        hacinamiento number;
        telefono number;
        celular number;
        linea_baja number;
    begin
        icv:=0;
        puntajes:=array_number();
        puntajes.extend(28);
        ponderaciones:=array_number();
        ponderaciones.extend(28);
        for i in 1..ponderaciones.count loop
            ponderaciones(i):=0;
        end loop;
        for i in 1..puntajes.count loop
            puntajes(i):=0;
        end loop;
        --Se abre el cursor para que apunte a las fichas persona asociadas
        open cursor_ficha_persona(row_ficha_hogar.id_ficha_hogar);
        --Variable 1: Hacinamiento.  
        hacinamiento:=row_ficha_hogar.cantidad_dormitorios/row_ficha_hogar.total_personas;
        if hacinamiento <=3 then
            puntajes(1):=1;
            ponderaciones(1):=2.98;
        elsif hacinamiento>3 and hacinamiento <=5 then
            puntajes(1):=2;
            ponderaciones(1):=1.26;
        else
            puntajes(1):=3;
            ponderaciones(1):=0;
        end if;
        --Variable 2: Tipo de Pared.
        case row_ficha_hogar.numero_tipo_mat_paredes
            when 1 then
               puntajes(2):=1;
               ponderaciones(2):=0.61;
            when 2 then
               puntajes(2):=1;
               ponderaciones(2):=0.61;
            when 3 then
               puntajes(2):=2;
               ponderaciones(2):=2.03;
            when 4 then
               puntajes(2):=3;
               ponderaciones(2):=3.99;
            when 5 then
               puntajes(2):=3;
               ponderaciones(2):=3.99;
            when 6 then
               puntajes(2):=4;
               ponderaciones(2):=0;
            when 7 then
               puntajes(2):=4;
               ponderaciones(2):=0;
            else
               puntajes(2):=3;
               ponderaciones(2):=3.99;
        end case;
        --Variable 3: Tipo de Piso.
        case row_ficha_hogar.numero_tipo_mat_piso
            when 1 then
               puntajes(3):=1;
               ponderaciones(3):=0;
            when 2 then
               puntajes(3):=2;
               ponderaciones(3):=3.06;
            when 3 then
               puntajes(3):=3;
               ponderaciones(3):=2.04;
            when 4 then
               puntajes(3):=4;
               ponderaciones(3):=2.74;
            when 5 then
               puntajes(3):=5;
               ponderaciones(3):=5.12;
            when 6 then
               puntajes(3):=6;
               ponderaciones(3):=5.52;
            when 7 then
               puntajes(3):=7;
               ponderaciones(3):=6.16;
            else
               puntajes(3):=6;
               ponderaciones(3):=5.52;
        end case;
        --Variable 4: Tipo de Techo.
        case row_ficha_hogar.numero_tipo_mat_techo
            when 1 then
               puntajes(4):=1;
               ponderaciones(4):=0;
            when 2 then
               puntajes(4):=2;
               ponderaciones(4):=3.24;
            when 3 then
               puntajes(4):=3;
               ponderaciones(4):=2.04;
            when 4 then
               puntajes(4):=3;
               ponderaciones(4):=2.04;
            else
               puntajes(4):=2;
               ponderaciones(4):=3.24;
        end case;
        --Variable 5: Cocina
        case row_ficha_hogar.numero_siono_pieza_cocina
            when 1 then
               puntajes(5):=2;
               ponderaciones(5):=1.28;
            when 6 then
               puntajes(5):=1;
               ponderaciones(5):=0;
            else
               puntajes(5):=2;
               ponderaciones(5):=1.28;
        end case;
        --Variable 6: Combustible Cocina
        case row_ficha_hogar.numero_tipo_combustible
            when 1 then
               puntajes(6):=1;
               ponderaciones(6):=0;
            when 2 then
               puntajes(6):=1;
               ponderaciones(6):=0;
            when 4 then
               puntajes(6):=1;
               ponderaciones(6):=0;
            when 3 then
               puntajes(6):=2;
               ponderaciones(6):=3.44;
            when 5 then
               puntajes(6):=2;
               ponderaciones(6):=3.44;
            when 6 then
               puntajes(6):=3;
               ponderaciones(6):=0.6;
            else
               puntajes(6):=2;
               ponderaciones(6):=3.18;
        end case;
        --Variable 7: Tipo de Pieza Baño
        case row_ficha_hogar.numero_tipo_pieza_bano
            when 1 then
               puntajes(7):=2;
               ponderaciones(7):=2.94;
            when 2 then
               puntajes(7):=2;
               ponderaciones(7):=2.94;
            when 3 then
               puntajes(7):=2;
               ponderaciones(7):=2.94;
            when 4 then
               puntajes(7):=2;
               ponderaciones(7):=2.94;
            else
               puntajes(7):=1;
               ponderaciones(7):=0;
        end case;
        --Variable 8: Tipo de Servicio Sanitario
        case row_ficha_hogar.numero_tipo_servicio_san
            when 1 then
               puntajes(8):=1;
               ponderaciones(8):=5.74;
            when 2 then
               puntajes(8):=2;
               ponderaciones(8):=4.76;
            when 3 then
               puntajes(8):=3;
               ponderaciones(8):=2.33;
            when 4 then
               puntajes(8):=4;
               ponderaciones(8):=0.9;
            when 5 then
               puntajes(8):=5;
               ponderaciones(8):=0;
            when 6 then
               puntajes(8):=5;
               ponderaciones(8):=0;
            else
               puntajes(8):=1;
               ponderaciones(8):=5.74;
         end case;
         --Variable 9: Tipo de Servicio de Agua
         case row_ficha_hogar.numero_tipo_servicio_agua
            when 1 then
               puntajes(9):=1;
               ponderaciones(9):=2.76;
            when 2 then
               puntajes(9):=1;
               ponderaciones(9):=2.76;
            when 3 then
               puntajes(9):=2;
               ponderaciones(9):=3.01;
            when 4 then
               puntajes(9):=3;
               ponderaciones(9):=0;
            when 5 then
               puntajes(9):=3;
               ponderaciones(9):=0;
            when 6 then
               puntajes(9):=3;
               ponderaciones(9):=0;
            when 7 then
               puntajes(9):=3;
               ponderaciones(9):=0;
            else
               puntajes(9):=1;
               ponderaciones(9):=2.76;
         end case;
         --Variable 10: Tipo de Abastecimiento de Agua
         case row_ficha_hogar.numero_tipo_aba_agua
            when 1 then
               puntajes(10):=1;
               ponderaciones(10):=4.49;
            when 2 then
               puntajes(10):=2;
               ponderaciones(10):=0.82;
            when 3 then
               puntajes(10):=3;
               ponderaciones(10):=0;
            else
               puntajes(10):=1;
               ponderaciones(10):=4.49;
         end case;
         --Variable 11: Luz Eléctrica
         case row_ficha_hogar.numero_siono_corriente_elec
            when 1 then
               puntajes(11):=2;
               ponderaciones(11):=2.79;
            when 6 then
               puntajes(11):=1;
               ponderaciones(11):=0;
            else
               puntajes(11):=2;
               ponderaciones(11):=2.79;
         end case;
         --Variable 12: Desechos de Basura
         case row_ficha_hogar.numero_tipo_desecho_bas
            when 1 then
               puntajes(12):=3;
               ponderaciones(12):=4.59;
            when 6 then
               puntajes(12):=3;
               ponderaciones(12):=4.59;
            when 2 then
               puntajes(12):=2;
               ponderaciones(12):=0.96;
            when 3 then
               puntajes(12):=1;
               ponderaciones(12):=1.26;
            when 4 then
               puntajes(12):=4;
               ponderaciones(12):=0;
            when 5 then
               puntajes(12):=4;
               ponderaciones(12):=0;
            else
               puntajes(12):=3;
               ponderaciones(12):=4.59;
         end case;
         --Variable 13: Teléfono (Composicion de linea baja y celular)
         case row_ficha_hogar.numero_siono_telefono_celular
            when 1 then
               celular:=1;
            when 6 then
               celular:=0;
            else
               celular:=1;
         end case;
         case row_ficha_hogar.numero_siono_tlf_linea_baja 
            when 1 then
               linea_baja:=1;
            when 6 then
               linea_baja:=0;
            else
               linea_baja:=1;
         end case;
         telefono:=celular*2+linea_baja+1;
         case telefono
            when 1 then
               puntajes(13):=1;
               ponderaciones(13):=0;
            when 2 then
               puntajes(13):=2;
               ponderaciones(13):=4.04;
            when 3 then
               puntajes(13):=3;
               ponderaciones(13):=2.82;
            when 4 then
               puntajes(13):=4;
               ponderaciones(13):=4.88;
         end case;
         --Variable 14: Heladera
         case row_ficha_hogar.numero_siono_disp_heladera 
            when 1 then
               puntajes(14):=2;
               ponderaciones(14):=3.02;
            else
               puntajes(14):=1;
               ponderaciones(14):=0;
         end case;
         --Variable 15: Lavarropas
         case row_ficha_hogar.numero_siono_disp_lavarropas
            when 1 then
               puntajes(15):=2;
               ponderaciones(15):=3.36;
            else
               puntajes(15):=1;
               ponderaciones(15):=0;
         end case;
         --Variable 16: Termocalefón
         case row_ficha_hogar.numero_siono_disp_termo
            when 1 then
               puntajes(16):=2;
               ponderaciones(16):=5.46;
            else
               puntajes(16):=1;
               ponderaciones(16):=0;
         end case;
         --Variable 17: Aire acondicionado
         case row_ficha_hogar.numero_siono_disp_aire_acon
            when 1 then
               puntajes(17):=2;
               ponderaciones(17):=2.79;
            else
               puntajes(17):=1;
               ponderaciones(17):=0;
         end case;
         --Variable 18: Automovil
         case row_ficha_hogar.numero_siono_disp_automovil 
            when 1 then
               puntajes(18):=2;
               ponderaciones(18):=3.28;
            else
               puntajes(18):=1;
               ponderaciones(18):=0;
         end case;
         --Variable 19: Camión
         case row_ficha_hogar.numero_siono_disp_camion
            when 1 then
               puntajes(19):=2;
               ponderaciones(19):=3.67;
            else
               puntajes(19):=1;
               ponderaciones(19):=0;
         end case;
         --Variables intermedias que dependen de los miembros del hogar.
         loop
            fetch cursor_ficha_persona into row_ficha_persona;
            exit when cursor_ficha_persona%notfound;
            --Los que no pertenezcan al hogar se ignoran
            continue when row_ficha_persona.numero_siono_miembro_hogar <>1;
            --Se actualizan numero de miembros del hogar
            total_miembros_hogar:=total_miembros_hogar+1;
            --Se obtiene numero ultimo año aprobado
            if row_ficha_persona.ultimo_curso_aprobado>=0 and row_ficha_persona.ultimo_curso_aprobado<=9 then
                ultimo_grado_aprobado:=row_ficha_persona.ultimo_curso_aprobado;
            elsif row_ficha_persona.ultimo_curso_aprobado>=10 and row_ficha_persona.ultimo_curso_aprobado<=11 then
                ultimo_grado_aprobado:=0;
            elsif row_ficha_persona.ultimo_curso_aprobado=99 or row_ficha_persona.ultimo_curso_aprobado is null and row_ficha_persona.edad>=5 then
                ultimo_grado_aprobado:=99;
            else
                ultimo_grado_aprobado:=88;
            end if;
            --Se obtiene nivel de ultimo_grado_aprobado
            nivel_grado_aprobado:=row_ficha_persona.numero_nivel_edu_ult_cur_aprob;
            --Se calcula la variable intermedia de Años de Estudio
            case row_ficha_persona.numero_siono_asistencia_esc
                when 1 then
                    asistencia_escolar:=1;
                else
                    asistencia_escolar:=6;
            end case;
            if nivel_grado_aprobado = 0 or nivel_grado_aprobado = 1 or nivel_grado_aprobado= 2 or nivel_grado_aprobado = 17 or nivel_grado_aprobado = 99  then
                anos_estudio:=0;
            elsif nivel_grado_aprobado = 3 or nivel_grado_aprobado = 4 then
                anos_estudio:=ultimo_grado_aprobado;
            elsif nivel_grado_aprobado >=5 and nivel_grado_aprobado<=8 then
                anos_estudio:=ultimo_grado_aprobado+6;
            elsif nivel_grado_aprobado >=9 and nivel_grado_aprobado<=10 then
                anos_estudio:=ultimo_grado_aprobado+9;
            elsif nivel_grado_aprobado =11 and ultimo_grado_aprobado=1 then
                anos_estudio:=2;
            elsif nivel_grado_aprobado =11 and ultimo_grado_aprobado=2 then
                anos_estudio:=5;
            elsif nivel_grado_aprobado =11 and ultimo_grado_aprobado=3 or nivel_grado_aprobado =15 and ultimo_grado_aprobado=3 then
                anos_estudio:=7;
            elsif nivel_grado_aprobado =11 and ultimo_grado_aprobado=3  then
                anos_estudio:=9;
            elsif nivel_grado_aprobado =12 then
                anos_estudio:=ultimo_grado_aprobado+8;
            elsif nivel_grado_aprobado =13 then
                anos_estudio:=ultimo_grado_aprobado+6;
            elsif nivel_grado_aprobado =14 then
                anos_estudio:=ultimo_grado_aprobado+9;
            elsif nivel_grado_aprobado =16 then
                anos_estudio:=2;
            elsif nivel_grado_aprobado=18 or nivel_grado_aprobado=19 or nivel_grado_aprobado=21 or nivel_grado_aprobado=22 then
                anos_estudio:=ultimo_grado_aprobado+12;
            elsif nivel_grado_aprobado =20 and ultimo_grado_aprobado<4 then
                anos_estudio:=ultimo_grado_aprobado+11;
            elsif nivel_grado_aprobado =20 and ultimo_grado_aprobado>=4 then
                anos_estudio:=14;
            elsif nivel_grado_aprobado =20 and ultimo_grado_aprobado=6 then
                anos_estudio:=ultimo_grado_aprobado+15;
            elsif row_ficha_persona.edad>=5 and asistencia_escolar=6 then
                anos_estudio:=0;
            end if;
            --Se actualizan numero de niños del hogar
            if row_ficha_persona.edad<=5 then
                total_ninos_hogar:=total_ninos_hogar+1;
            end if;
            --Se actualiza años de estudio e idioma para jefe del hogar
            if row_ficha_persona.numero_tipo_persona_hogar=1 then
                --Idioma del Jefe del Hogar
                if row_ficha_persona.numero_idioma_hogar>=1 and row_ficha_persona.numero_idioma_hogar<=5 then
                    idioma_jefe:=row_ficha_persona.numero_idioma_hogar;
                else
                    idioma_jefe:=3;
                end if;
                --Años de Estudio del Jefe del Hogar
                anos_estudio_jefe:=anos_estudio;
            --Se actualiza años de estudio e idioma para conyuge
            elsif row_ficha_persona.numero_tipo_persona_hogar=2 then    
                --Idioma del Jefe del Hogar
                if row_ficha_persona.numero_idioma_hogar>=1 and row_ficha_persona.numero_idioma_hogar<=5 then
                    idioma_conyuge:=row_ficha_persona.numero_idioma_hogar;
                else
                    idioma_conyuge:=3;
                end if;
                --Años de Estudio del Jefe del Hogar
                anos_estudio_conyuge:=anos_estudio;
            --Se actualiza numero de hijos (de 6 a 24) y años de estudio perdidos por hijos
            elsif row_ficha_persona.numero_tipo_persona_hogar=3 then            
                if row_ficha_persona.edad>=6 and row_ficha_persona.edad<=24 then
                    numero_hijos_6a24:=numero_hijos_6a24+1;
                    total_an_est_p_h:= total_an_est_p_h+(row_ficha_persona.edad-anos_estudio-6);
                end if;    
            end if;
            --Se actualiza contador de seguros
            if row_ficha_persona.numero_tipo_seguro_medico<>6 then
                numero_seguros:=numero_seguros+1;
            end if;
            --Se actualiza enfermedad en los ultimos dias y asistencias a centros sanitarios
            if row_ficha_persona.numero_estado_salud>=1 and row_ficha_persona.numero_estado_salud<=3 then
                n_enf_90_dias:=n_enf_90_dias+1;
                if row_ficha_persona.numero_siono_atencion_medica=1 then
                    numero_asistencias_cs:=numero_asistencias_cs+1;
                end if;
            end if;
            --Se actualiza número de vacunas
            if row_ficha_persona.edad<=5 and row_ficha_persona.numero_siono_carnet_vacunacion<>6 then
                numero_ninos_vacunados:=numero_ninos_vacunados+1;            
            end if;
            --Se actualiza estado de trabajo del jefe del hogar
            if row_ficha_persona.numero_tipo_persona_hogar=1 then
                --Se actualiza la condicion de trabajo los ultimos 30 dias
                if row_ficha_persona.numero_siono_trabajo=1 then
                    trabajo_30_dias_jefe:=1;
                else
                    trabajo_30_dias_jefe:=6;
                end if;
                --Se actualiza el cargo de trabajo
                if trabajo_30_dias_jefe =1 then
                    if row_ficha_persona.numero_tipo_relacion_lab>=1 and row_ficha_persona.numero_tipo_relacion_lab<=8 then
                        cargo_trabajo_jefe:=row_ficha_persona.numero_tipo_relacion_lab;
                    else
                        cargo_trabajo_jefe:=5;
                    end if;
                else
                    cargo_trabajo_jefe:=1; 
                end if;
            end if;
        end loop;
        --Variable 20: Cantidad de Niños
        case total_ninos_hogar
            when 0 then
                puntajes(20):=1;
                ponderaciones(20):=1.89;
            when 1 then
                puntajes(20):=2;
                ponderaciones(20):=1.89;
            when 2 then
                puntajes(20):=3;
                ponderaciones(20):=1.16;
            else
                puntajes(20):=4;
                ponderaciones(20):=0;
        end case;
        --Variable 21: Idiomas Jefe y Cónyuge
        if (idioma_jefe=1 and idioma_conyuge=1)or(idioma_jefe=1 and idioma_conyuge=5)or(idioma_jefe=5 and idioma_conyuge=1)or(idioma_jefe=5 and idioma_conyuge=5) then
            puntajes(21):=3;
            ponderaciones(21):=0.05;
        elsif (idioma_jefe=1 and idioma_conyuge=0) or (idioma_jefe=5 and idioma_conyuge=0)then
            puntajes(21):=4;
            ponderaciones(21):=0;
        elsif (idioma_jefe<>1 and idioma_conyuge=0) then
            puntajes(21):=5;
            ponderaciones(21):=1.93;
        elsif (idioma_jefe>1 and idioma_jefe<5) and (idioma_conyuge>1 and idioma_conyuge<5) then
            puntajes(21):=1;
            ponderaciones(21):=3;
        else
            puntajes(21):=2;
            ponderaciones(21):=2.67;
        end if;
        --Variable 22: Años de Estudio del Jefe del Hogar
        case anos_estudio_jefe
            when 0 then
                puntajes(22):=1;
                ponderaciones(22):=0;
            when 1 then
                puntajes(22):=2;
                ponderaciones(22):=0.53;
            when 2 then
                puntajes(22):=2;
                ponderaciones(22):=0.53;
            when 3 then
                puntajes(22):=3;
                ponderaciones(22):=0.99;
            when 4 then
                puntajes(22):=4;
                ponderaciones(22):=1.23;
            when 5 then
                puntajes(22):=4;
                ponderaciones(22):=1.23;
            when 6 then
                puntajes(22):=5;
                ponderaciones(22):=1.92;
            when 7 then
                puntajes(22):=6;
                ponderaciones(22):=3.03;
            when 8 then
                puntajes(22):=6;
                ponderaciones(22):=3.03;
            when 9 then
                puntajes(22):=6;
                ponderaciones(22):=3.03;
            when 10 then
                puntajes(22):=6;
                ponderaciones(22):=3.03;
            when 11 then
                puntajes(22):=6;
                ponderaciones(22):=3.03;
            when 12 then
                puntajes(22):=7;
                ponderaciones(22):=4.9;
            else
                puntajes(22):=8;
                ponderaciones(22):=5.42;
        end case;
        --Variable 23: Años de Estudio del Conyuge
        if anos_estudio_conyuge is null then
            puntajes(23):=9;
            ponderaciones(23):=1.42;
        else
            case anos_estudio_conyuge
                when 0 then
                    puntajes(23):=1;
                    ponderaciones(23):=0;
                when 1 then
                    puntajes(23):=2;
                    ponderaciones(23):=0.77;
                when 2 then
                    puntajes(23):=2;
                    ponderaciones(23):=0.77;
                when 3 then
                    puntajes(23):=3;
                    ponderaciones(23):=0.82;
                when 4 then
                    puntajes(23):=4;
                    ponderaciones(23):=1.79;
                when 5 then
                    puntajes(23):=4;
                    ponderaciones(23):=1.79;
                when 6 then
                    puntajes(23):=5;
                    ponderaciones(23):=2.52;
                when 7 then
                    puntajes(23):=6;
                    ponderaciones(23):=3.04;
                when 8 then
                    puntajes(23):=6;
                    ponderaciones(23):=3.04;
                when 9 then
                    puntajes(23):=6;
                    ponderaciones(23):=3.04;
                when 10 then
                    puntajes(23):=6;
                    ponderaciones(23):=3.04;
                when 11 then
                    puntajes(23):=6;
                    ponderaciones(23):=3.04;
                when 12 then
                    puntajes(23):=7;
                    ponderaciones(23):=5.67;
                else
                    puntajes(23):=8;
                    ponderaciones(23):=5.67;
            end case;
        end if;
        --Variable 24: Coeficiente de Estudio Perdido de Hijos
        if numero_hijos_6a24=0 then
            puntajes(24):=4;
            ponderaciones(24):=0.99;
        else
            coef_est_p_h:=total_an_est_p_h/numero_hijos_6a24;
            if coef_est_p_h<1 then
                puntajes(24):=1;
                ponderaciones(24):=2.11;
            elsif coef_est_p_h<=3 then
                puntajes(24):=2;
                ponderaciones(24):=0.52;
            else
                puntajes(24):=3;
                ponderaciones(24):=0;
            end if; 
        end if;
        --Variable 25: Cobertura del Seguro
        if numero_seguros=0 then
            puntajes(25):=1;
            ponderaciones(25):=0;
        elsif numero_seguros<total_miembros_hogar then
            puntajes(25):=2;
            ponderaciones(25):=1.65;
        else
            puntajes(25):=3;
            ponderaciones(25):=2.59;
        end if;
        --Variable 26: Atención Médica
        if n_enf_90_dias=0 then
            puntajes(26):=4;
            ponderaciones(26):=1.37; 
        elsif n_enf_90_dias>numero_asistencias_cs then
            puntajes(26):=3;
            ponderaciones(26):=1.5;
        elsif n_enf_90_dias=numero_asistencias_cs then
            puntajes(26):=2;
            ponderaciones(26):=0.77;
        elsif n_enf_90_dias>0 and numero_asistencias_cs=0 then
            puntajes(26):=1;
            ponderaciones(26):=0;
        end if;
        --Variable 27: Niños Vacunados
        diferencia_vacunados:=total_ninos_hogar-numero_ninos_vacunados;
        case diferencia_vacunados
            when 0 then
                puntajes(27):=3;
                ponderaciones(27):=2.27;
            when 1 then
                puntajes(27):=2;
                ponderaciones(27):=1.64;
            when 2 then
                puntajes(27):=2;
                ponderaciones(27):=1.64;
            else
                puntajes(27):=1;
                ponderaciones(27):=0;
        end case;
        --Variable 28: Cargo Jefe
        case cargo_trabajo_jefe
            when 1 then
                puntajes(28):=1;
                ponderaciones(28):=4.17;
            when 2 then
                puntajes(28):=1;
                ponderaciones(28):=4.17;
            when 3 then
                puntajes(28):=2;
                ponderaciones(28):=1.05;
            when 4 then
                puntajes(28):=2;
                ponderaciones(28):=1.05;
            when 9 then
                puntajes(28):=2;
                ponderaciones(28):=1.05;
            when 5 then
                puntajes(28):=3;
                ponderaciones(28):=2.3;
            when 6 then
                puntajes(28):=4;
                ponderaciones(28):=0;
            else
                puntajes(28):=6;
                ponderaciones(28):=0.49;
        end case;
        for i in 1..ponderaciones.count() loop
            icv:=icv+ponderaciones(i);
        end loop;
        close cursor_ficha_persona;
end;