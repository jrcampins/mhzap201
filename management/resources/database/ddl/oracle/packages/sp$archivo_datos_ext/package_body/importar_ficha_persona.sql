procedure importar_ficha_persona(nombre_archivo varchar2, codigo_archivo varchar2, retorno out number) as
    --retorno number:=0;
    i number:=0;
    nombre_tabla varchar2(200):='csv_log_imp_per';
    tipo_arch varchar2(10);
    numero_cedula number;
    letra_cedula char;
    current_row log_imp_per%rowtype;
    new_ficha_persona ficha_persona%rowtype;
    row_ficha_hogar ficha_hogar%rowtype;
    mensaje varchar2(2000):='';
    array_nombres sp$utils.t_array;
    array_apellidos sp$utils.t_array;
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000); -- a character string of at most 2048 bytes
    texto_fecha varchar2(100);
    texto_formulario varchar2(100);
    --Estas variables permiten identificar el id de ficha hogar asociada
    id_departamento_consultar number;
    id_distrito_consultar number;
    id_barrio_consultar number;
    numero_formulario_consultar number;
    texto_formulario varchar2(2000):='';
    numero_vivienda_consultar number;
    numero_hogar_consultar number;
    numero_respondente number;
    id_ubicacion_retornado number;
    secuencia varchar2(2000):=' ';
    secuencia_anterior varchar2(2000):=' ';
    actualizar_ficha_hogar number:=0;
begin
    retorno:=0;
    if nombre_archivo is null then
        msg_string := 'archivo no existe';
        raise_application_error(err_number, msg_string, true);
    end if;
    if codigo_archivo is null then
        msg_string := 'codigo de archivo no existe';
        raise_application_error(err_number, msg_string, true);
    else
        begin
            select numero_tipo_arc_dat_ext into tipo_arch from archivo_datos_ext where codigo_archivo_datos_ext=codigo_archivo;
        exception
            when no_data_found then
            msg_string := 'Archivo ' || codigo_archivo || ' no existe ';
            raise_application_error(err_number, msg_string, true);
        end;
        if sql%found then
            if tipo_arch!='402' then
                msg_string := 'Archivo ' || codigo_archivo || ' NO es de Ficha Persona ';
                raise_application_error(err_number, msg_string, true);
            end if;
        end if;
    end if;
    
    update archivo_datos_ext set es_archivo_datos_ext_importado=1, fecha_hora_ultima_importacion=current_timestamp where codigo_archivo_datos_ext=codigo_archivo;
    --creamos y llenamos la tabla externa csv_log_imp_per
    sp$100.create_csv_log_imp_per(nombre_archivo, 'WE8ISO8859P1', '1', ';', '"');
    insert into log_imp_per
        (   id_log_imp_per,
            P01A ,
            P01B ,
            P01C ,
            P01D ,
            P02 ,
            P03 ,
            P104 ,
            P43 ,
            P45A ,
            P45B ,
            P44A ,
            P44B ,
            VAR00001 ,
            VAR00002 ,
            P46 ,
            P47 ,
            VAR00030 ,
            P48 ,
            P49 ,
            P50A ,
            P50B ,
            P50C ,
            P51 ,
            VAR00003 ,
            VAR00004 ,
            P52D ,
            P52M ,
            P52A ,
            P53A ,
            P53B ,
            P53C ,
            P53Z ,
            P54 ,
            P54E ,
            P56 ,
            P58 ,
            P58E ,
            P59 ,
            P60 ,
            P61 ,
            P62 ,
            P63 ,
            P64 ,
            P65 ,
            P65E ,
            P66 ,
            P66E ,
            P67 ,
            P68 ,
            P68E ,
            P73 ,
            P74 ,
            VAR00006 ,
            VAR00007 ,
            VAR00008 ,
            VAR00009 ,
            VAR00010 ,
            VAR00011 ,
            VAR00031 ,
            VAR00012 ,
            VAR00013 ,
            P86 ,
            P87 ,
            P87E ,
            P88 ,
            P88E ,
            P91 ,
            VAR00017 ,
            VAR00018 ,
            VAR00019 ,
            VAR00020 ,
            VAR00021 ,
            VAR00022 ,
            VAR00023 ,
            VAR00024 ,
            VAR00025 ,
            VAR00026 ,
            VAR00027 ,
            VAR00028 ,
            P92,
            ICV,
            ficha_activa)
    select
            utils.bigintid(),
            p01a ,
            p01b ,
            p01c ,
            p01d ,
            p02 ,
            p03 ,
            p104 ,
            p43 ,
            p45a ,
            p45b ,
            p44a ,
            p44b ,
            var00001 ,
            var00002 ,
            p46 ,
            p47 ,
            var00030 ,
            p48 ,
            p49 ,
            p50a ,
            p50b ,
            p50c ,
            p51 ,
            var00003 ,
            var00004 ,
            p52d ,
            p52m ,
            p52a ,
            p53a ,
            p53b ,
            p53c ,
            p53z ,
            p54 ,
            p54e ,
            p56 ,
            p58 ,
            p58e ,
            p59 ,
            p60 ,
            p61 ,
            p62 ,
            p63 ,
            p64 ,
            p65 ,
            p65e ,
            p66 ,
            p66e ,
            p67 ,
            p68 ,
            p68e ,
            p73 ,
            p74 ,
            var00006 ,
            var00007 ,
            var00008 ,
            var00009 ,
            var00010 ,
            var00011 ,
            var00031 ,
            var00012 ,
            var00013 ,
            p86 ,
            p87 ,
            p87e ,
            p88 ,
            p88e ,
            p91 ,
            var00017 ,
            var00018 ,
            var00019 ,
            var00020 ,
            var00021 ,
            var00022 ,
            var00023 ,
            var00024 ,
            var00025 ,
            var00026 ,
            var00027 ,
            var00028 ,
            p92,
            icv,
            ficha_activa
          from csv_log_imp_per;
    for current_row in (select * from log_imp_per where es_importado=0)
    loop
       begin
            --Reiniciar los valores de la nueva ficha para cada registro a importar
            new_ficha_persona.id_ficha_persona:=utils.bigintid();
            new_ficha_persona.version_ficha_persona:=0;
            new_ficha_persona.id_departamento_nacimiento:=null;
            new_ficha_persona.id_distrito_nacimiento:=null;
            new_ficha_persona.numero_tipo_area_lugar_nac:=null;
            new_ficha_persona.otra_clase_enf_cronica:=null;
            if current_row.P01A is null or current_row.P01B is null or current_row.P01C is null or current_row.P01D is null or current_row.P02 is null or current_row.P03 is null then
                msg_string:='Clave de Ficha Persona Inválida (Alguno de los campos es nulo)';
                raise_application_error(err_number, msg_string, true);
            end if;
            --Se determina la secuencia de campos claves
            secuencia:=current_row.P01A||current_row.P01B||current_row.P01C||current_row.P01D||current_row.P02||current_row.P03;
            --Si la secuencia es igual a la anterior no debo actualizar nada
            if secuencia<>secuencia_anterior then
                secuencia_anterior:=secuencia;          
                --Se ubica el id del departamento (P01A)
                id_departamento_consultar:= sp$utils.extract_id_departamento(current_row.P01A);
                if id_departamento_consultar is null then
                    msg_string:= 'Numero de Departamento No puede ser nulo';
                    raise_application_error(err_number, msg_string, true);
                end if;
                --Se ubica el id del distrito (P01B)
                id_distrito_consultar:= sp$utils.extract_id_distrito(current_row.P01A,current_row.P01B);
                if id_distrito_consultar is null then
                    msg_string:= 'Numero de Distrito No puede ser nulo';
                    raise_application_error(err_number, msg_string, true);
                end if;
                --Se ubica el id del barrio (P01C)
                id_barrio_consultar:= sp$utils.extract_id_barrio(current_row.P01A,current_row.P01B,current_row.P01C);
                if id_barrio_consultar is null then
                    msg_string:='Numero de Barrio No puede ser nulo';
                    raise_application_error(err_number, msg_string, true);
                end if;
                --Se ubica el numero de formulario (P01D)
                numero_formulario_consultar:= to_number(current_row.P01D);
                if numero_formulario_consultar is null then
                    msg_string:='Numero de Formulario No puede ser nulo';
                    raise_application_error(err_number, msg_string, true);
                end if;
                --Se convierte el texto recibido en numero de vivienda
                numero_vivienda_consultar:=sp$utils.extract_numero_vivienda(current_row.P02);
                if numero_vivienda_consultar is null then
                    msg_String:= 'Numero de Vivienda No puede ser nulo';
                    raise_application_error(err_number, msg_string, true);
                end if;
                --Se convierte el texto recibido en distancia_este_utm (P03)
                numero_hogar_consultar:=sp$utils.extract_numero_hogar(current_row.P03);
                if numero_hogar_consultar is null then
                    msg_String:= 'Numero de Hogar No puede ser nulo';
                    raise_application_error(err_number, msg_string, true);
                end if;
                --Se determina la ficha hogar asociada
                begin
                    select * into row_ficha_hogar from ficha_hogar  
                    where id_departamento=id_departamento_consultar
                    and id_distrito=id_distrito_consultar
                    and id_barrio=id_barrio_consultar
                    and numero_formulario=numero_formulario_consultar
                    and numero_vivienda=numero_vivienda_consultar
                    and numero_hogar=numero_hogar_consultar;
                --Si no hay ficha hogar, no tiene sentido procesar la ficha
                exception
                    when no_data_found then 
                        msg_string:= 'No hay Ficha Hogar asociada a la Persona';
                        raise_application_error(err_number, msg_string, true);
                    when others then 
                        msg_string:= 'Error recuperando ficha hogar';
                        raise_application_error(err_number, msg_string, true);
                end;
                if not sql%found then
                    msg_string:= 'No hay Ficha Hogar asociada a la Persona';
                    raise_application_error(err_number, msg_string, true);
                end if;
                --Se indica que más adelante hay que actualizar
                 actualizar_ficha_hogar:=1;
             end if;
            --Se copia el id de ficha hogar
            if row_ficha_hogar.id_ficha_hogar is not null then
                new_ficha_persona.id_ficha_hogar:=row_ficha_hogar.id_ficha_hogar;
            else
                msg_string:='No hay Id de Ficha hogar asociado a la Persona';
                raise_application_error(err_number, msg_string, true);
            end if;
            --Se toma el numero del respondente
            numero_respondente:=to_number(current_row.P104);
            if numero_respondente is null then
                msg_string:= 'Numero de Respondente No puede ser nulo';
                raise_application_error(err_number, msg_string, true);
            end if;
            --Se toma el orden de identificacion
            new_ficha_persona.numero_orden_identificacion:=to_number(current_row.P43);
            if new_ficha_persona.numero_orden_identificacion is null then
                msg_string:='Numero de Orden de Identificación No puede ser nulo';
                raise_application_error(err_number, msg_string, true);
            end if;
            --Se determina si la persona es el respondente
            if numero_respondente=new_ficha_persona.numero_orden_identificacion then
                new_ficha_persona.es_respondente:=1;
            else
                new_ficha_persona.es_respondente:=0;
            end if;
            --Nombres (P44,P45,VAR00001 y VAR00002)
            new_ficha_persona.primer_nombre:=current_row.P45A;
            new_ficha_persona.segundo_nombre:=current_row.P45B;
            new_ficha_persona.primer_apellido:=current_row.P44A;
            new_ficha_persona.segundo_apellido:=current_row.P44B;
            new_ficha_persona.apellido_casada:=current_row.VAR00001;
            new_ficha_persona.apodo:=current_row.VAR00002;
            --Edad (P46)
            new_ficha_persona.edad:=to_number(current_row.P46);
            --Sexo (P47)
            new_ficha_persona.numero_sexo_persona:=sp$utils.extract_sexo_ficha_persona(current_row.P47);
            --Estado civil (VAR00030)
            new_ficha_persona.numero_estado_civil:=sp$utils.extract_estado_civil(current_row.VAR00030);
            --Parentesco con el Jefe del Hogar (P48)
            new_ficha_persona.numero_tipo_persona_hogar :=sp$utils.extract_tipo_persona_hogar(current_row.P48);
            --Es miembro del hogar (P49)
            new_ficha_persona.numero_siono_miembro_hogar :=sp$utils.extract_siono(current_row.P49);
            --Numero de orden del conyuge(P50A)
            new_ficha_persona.numero_orden_iden_conyuge :=sp$utils.extract_numero_orden_id(current_row.P50A);
            --´Numero de orden del padre(P50B)
            new_ficha_persona.numero_orden_iden_padre :=sp$utils.extract_numero_orden_id(current_row.P50A);
            -- Numero de orden de la madre (P50C)
            new_ficha_persona.numero_orden_iden_madre :=sp$utils.extract_numero_orden_id(current_row.P50C);
            -- Numero de cedula (P51) 
            new_ficha_persona.numero_cedula:=sp$utils.extract_numero_from_cedula(current_row.P51);
            -- Letra de cedula (VAR00003)
            new_ficha_persona.letra_cedula:=sp$utils.extract_letra_from_cedula(current_row.VAR00003);
            -- Numero de tipo de excepcion de cedula (VAR000004)
            new_ficha_persona.numero_tipo_excepcion_ced:=sp$utils.extract_letra_from_cedula(current_row.VAR00004);
            -- Fecha de Nacimiento (P52D,P52M,P52A)
            new_ficha_persona.fecha_nacimiento:=sp$utils.extract_fecha(current_row.P52D,current_row.P52M,current_row.P52A);
            -- Nombre de departamento de nacimiento (P53A)
            id_ubicacion_retornado:=sp$utils.get_id_departamento_sw(current_row.P53A);
            if id_ubicacion_retornado<>0 then
                 new_ficha_persona.id_departamento_nacimiento:=id_ubicacion_retornado;
            end if;
            --Nombre de distrito de nacimiento (P53B)
            id_ubicacion_retornado:=sp$utils.get_id_distrito_sw(current_row.P53A,current_row.P53B);
            if id_ubicacion_retornado<>0 then
                 new_ficha_persona.id_distrito_nacimiento:=id_ubicacion_retornado;
            end if;
            --Codigo del distrito de nacimiento (P53C)No se utiliza
            --Tipo de Area de Nacimiento (P53Z)
            new_ficha_persona.numero_tipo_area_lugar_nac :=sp$utils.extract_tipo_area(current_row.P53Z);
            --Idioma que habla el mayor tiempo (P54)
            new_ficha_persona.numero_idioma_hogar:=sp$utils.extract_idioma_hogar(current_row.P54);
            if new_ficha_persona.numero_idioma_hogar=4 then
                --Otro idioma (P54E)
                new_ficha_persona.otro_idioma_hogar:=current_row.P54E;
            end if;
            --Asisitio a instituto (P56)
            new_ficha_persona.numero_siono_asistencia_esc:=sp$utils.extract_siono(current_row.P56);
            --Motivo de inasistencia (P58)
            new_ficha_persona.numero_motivo_ina_esc:=sp$utils.extract_motivo_ina_esc(current_row.P58);
            if new_ficha_persona.numero_motivo_ina_esc=25 then
                --Otro motivo de inasistencia (P58E)
                new_ficha_persona.otro_motivo_ina_esc:=current_row.P58E;
            end if;
            --Piensa Matricularse este año (P59)
            new_ficha_persona.numero_siono_matriculacion_esc:=sp$utils.extract_siono(current_row.P59);
            --Ultimo grado aprobado (P60)
            new_ficha_persona.ultimo_curso_aprobado:=sp$utils.extract_ultimo_curso_aprobado(current_row.P60);
            --Nivel del ultimo curso aprobado (P61)
            new_ficha_persona.numero_nivel_edu_ult_cur_aprob:=sp$utils. extract_nivel_educ(current_row.P61);
            --Realizo curso no formal  (P62)
            new_ficha_persona.numero_siono_curso_no_formal:=sp$utils.extract_siono(current_row.P62);
            --Tiene seguro medico vigente (P63)
            new_ficha_persona.numero_tipo_seguro_medico:=sp$utils.extract_tipo_seguro_medico(current_row.P63);
            --Estado de salud general (P64)
            new_ficha_persona.numero_estado_salud:=sp$utils.extract_estado_salud(current_row.P64);
            --Clase de enfermedad (P65)
            new_ficha_persona.numero_clase_enf_acc:=sp$utils.extract_clase_enf_acc(current_row.P65);
            if new_ficha_persona.numero_clase_enf_acc=44 then
                --Otro tipo de enfermedad accidente (P65E)
                new_ficha_persona.otra_clase_enf_acc :=current_row.P65E;
            end if;
            --Clase de enfermedad cronica (P66)
            new_ficha_persona.numero_clase_enf_cronica:=sp$utils.extract_clase_enf_cronica(current_row.P66);
            if new_ficha_persona.numero_clase_enf_cronica=42 then
                --Otro tipo de enfermedad cronica (P66E)
                new_ficha_persona.otra_clase_enf_cronica :=current_row.P66E;
            end if;
            --Recibio atencion para accidente (P67)
            new_ficha_persona.numero_siono_atencion_medica:=sp$utils.extract_siono(current_row.P67);
            --Motivo de no atencion medica (P68)
            new_ficha_persona.numero_motivo_no_atencion :=sp$utils.extract_motivo_no_atencion(current_row.P68);
            if new_ficha_persona.numero_motivo_no_atencion=42 then
                --Otro motivo de no asistencia (P68E)
                new_ficha_persona.otro_motivo_no_atencion :=current_row.P68E;
            end if;
            --Tiene carner te vacunacion(P73)
            new_ficha_persona.numero_siono_carnet_vacunacion:=sp$utils.extract_siono(current_row.P73);
            --Clase de impedimento (P74)
            new_ficha_persona.numero_clase_impedimento:=sp$utils.extract_clase_impedimento(current_row.P74);
            if new_ficha_persona.numero_clase_impedimento=13 then
                --Otra clase de impedimento (VAR00006)
                new_ficha_persona.otra_clase_impedimento  :=current_row.VAR00006;
            end if;
            --Causa de impedimento (VAR00007)
            new_ficha_persona.numero_causa_impedimento  :=sp$utils.extract_causa_impedimento(current_row.VAR00007);
            if new_ficha_persona.numero_causa_impedimento=5 then
                --Otra causa de impedimento (VAR00008)
                new_ficha_persona.otra_clase_impedimento  :=current_row.VAR00008;
            end if;
            --Dificultad para caminar (VAR00009)
            new_ficha_persona.numero_siono_dif_para_caminar:=sp$utils.extract_siono(current_row.VAR00009);
            --Dificultad para vestirse (VAR00010)
            new_ficha_persona.numero_siono_dif_para_vestirse:=sp$utils.extract_siono(current_row.VAR00010);
            --Dificultad para bañarse (VAR00011)
            new_ficha_persona.numero_siono_dif_para_banarse:=sp$utils.extract_siono(current_row.VAR00011);
            --Dificultad para comer (VAR00031)
            new_ficha_persona.numero_siono_dif_para_comer:=sp$utils.extract_siono(current_row.VAR00031);
            --Dificultad para la cama (VAR00012)
            new_ficha_persona.numero_siono_dif_para_la_cama:=sp$utils.extract_siono(current_row.VAR00012);
            --Dificultad ir al baño (VAR00013
            new_ficha_persona.numero_siono_dif_para_el_bano:=sp$utils.extract_siono(current_row.VAR00013);
            --Tiene Trabajo (P86)
            new_ficha_persona.numero_siono_trabajo:=sp$utils.extract_siono(current_row.P86);
            --Motivo de No Trabajo (P87)
            new_ficha_persona.numero_motivo_no_trabajo:=sp$utils.extract_motivo_no_trabajo(current_row.P87);
            if new_ficha_persona.numero_motivo_no_trabajo=9 then
                --Otro motivo de no trabajo (P87E)
                new_ficha_persona.otro_motivo_no_trabajo:=current_row.P87E;
            end if;
            --Descripción de ocupacion principal (P88)
            new_ficha_persona.descripcion_ocupacion_prin:=current_row.P88;
            --Descripción de dedicacion principal (P88E)
            new_ficha_persona.descripcion_dedicacion_prin:=current_row.P88E;
            --Tipo de relacion laboral (P91)
            new_ficha_persona.numero_tipo_relacion_lab:=sp$utils.extract_tipo_relacion_lab(current_row.P91);
            --Monto de Ingreso ocupacion principal (VAR00017)
            new_ficha_persona.monto_ingreso_ocupacion_prin:=to_number(current_row.VAR00017);
            --Monto de Ingreso ocupacion secundaria (VAR00018)
            new_ficha_persona.monto_ingreso_ocupacion_secun:=to_number(current_row.VAR00018);
            --Monto de Ingreso otras ocupaciones (VAR00019)
            new_ficha_persona.monto_ingreso_otras_ocup:=to_number(current_row.VAR00019);
            --Monto de Ingreso por alquileres (VAR00020)
            new_ficha_persona.monto_ingreso_alquileres:=to_number(current_row.VAR00020);
            --Monto de Ingreso por Intereses (VAR00021)
            new_ficha_persona.monto_ingreso_intereses:=to_number(current_row.VAR00021);
            --Monto de Ingreso por ayuda familiar pais(VAR00022)
            new_ficha_persona.monto_ingreso_ayuda_fam_pais:=to_number(current_row.VAR00022);
            --Monto de Ingreso por ayuda familiar exterior(VAR00023)
            new_ficha_persona.monto_ingreso_ayuda_fam_exter:=to_number(current_row.VAR00023);
            --Monto de Ingreso por jubilacion (VAR00024)
            new_ficha_persona.monto_ingreso_jubilacion:=to_number(current_row.VAR00024);
            --Monto de Ingreso por pensiones (VAR00025)
            new_ficha_persona.monto_ingreso_pensiones:=to_number(current_row.VAR00025);
            --Monto de Ingreso por tekopora (VAR00026)
            new_ficha_persona.monto_ingreso_tekopora:=to_number(current_row.VAR00026);
            --Monto Ingreso por programas (VAR00027)
            new_ficha_persona.monto_ingreso_programas:=to_number(current_row.VAR00027);
            --Monto Ingreso adicional (VAR00028)
            new_ficha_persona.monto_ingreso_adicional:=to_number(current_row.VAR00028);
            --Monto Ingreso total mensual (P92)
            new_ficha_persona.total_ingreso_mensual:=to_number(current_row.P92);
            --Se copia el id de ficha hogar
            new_ficha_persona.id_ficha_hogar:=row_ficha_hogar.id_ficha_hogar;
            --Se inactiva la ficha persona para evitar calcular de nuevo ICV
            new_ficha_persona.es_ficha_persona_inactiva:=1;
            --Si hay que actualizar, se actualiza la ficha hogar
            if actualizar_ficha_hogar=1 then
                --Indice de Calidad de Vida de Ficha Hogar
                row_ficha_hogar.indice_calidad_vida:=to_number(current_row.icv);
                --Se actualiza el icv
                update ficha_hogar 
                set indice_calidad_vida=row_ficha_hogar.indice_calidad_vida, 
                es_ficha_hogar_inactiva=0
                where id_ficha_hogar=row_ficha_hogar.id_ficha_hogar;
                --Se inactiva la ficha_hogar
                update ficha_hogar 
                set es_ficha_hogar_inactiva=1
                where id_ficha_hogar=row_ficha_hogar.id_ficha_hogar;
                actualizar_ficha_hogar:=0;
            end if;
                --Se inserta la ficha persona
            insert into ficha_persona values new_ficha_persona;
                --Se incrementa el numero de insertados
            retorno:=retorno+1;
            
            update log_imp_per set es_importado=1, 
                                nombre_archivo=nombre_Archivo, 
                                codigo_archivo=codigo_archivo, 
                                fecha_hora_transaccion= current_timestamp 
            where id_log_imp_per=current_row.id_log_imp_per;
        exception
                when others then
                    mensaje:='Error '||SQLCODE||'('||SQLERRM||')';
                    update log_imp_per set es_importado=0, nombre_archivo=nombre_Archivo, codigo_archivo=codigo_archivo, fecha_hora_transaccion= current_timestamp, observacion=mensaje where id_log_imp_per=current_row.id_log_imp_per;
                continue;
        end;
    end loop;
end;