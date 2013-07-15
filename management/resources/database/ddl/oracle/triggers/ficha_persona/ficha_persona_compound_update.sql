create or replace trigger ficha_persona_compound_update
for update on ficha_persona
compound trigger
    type tabla_bigints is table of ficha_persona.id_ficha_persona%type      index by binary_integer;
    type tabla_codigos is table of ficha_persona.codigo_ficha_persona%type  index by binary_integer;
    
    ids    tabla_bigints;
    olds tabla_bigints;
    codigos tabla_codigos;
    xnew ficha_persona%rowtype;
    xold ficha_persona%rowtype;
    cambios number;
    row_ficha_persona ficha_persona%rowtype;
    old_ficha_persona ficha_persona%rowtype;
    indice      binary_integer := 0;
    nivel       number;
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000); -- a character string of at most 2048 bytes    
after each row is
begin
    indice         := indice + 1;
    ids(indice)     := :new.id_ficha_persona;
    codigos(indice) := :new.codigo_ficha_persona;
end after each row;

after statement is
begin
    indice := 0;
    msg_string := '';
    ----dbms_output.put_line('after  statement (count='||ids.count||') ');
    for i in 1..ids.count
    loop
        indice := i;
        ----dbms_output.put_line('after  row '||i||', '||ids(i)||', '||codigos(i));
        /**/
        begin
            select *
            into   row_ficha_persona
            from   ficha_persona
            where  id_ficha_persona = ids(i);
        exception
            when no_data_found then null;
        end;
        --dbms_output.put_line('el old '||:old.nombre_ficha_persona);
        xold.id_ficha_persona := :old.id_ficha_persona;                            
        xold.version_ficha_persona := :old.version_ficha_persona;                  
        xold.codigo_ficha_persona := :old.codigo_ficha_persona;                    
        xold.nombre_ficha_persona := :old.nombre_ficha_persona;                    
        xold.es_respondente := :old.es_respondente;                                
        xold.id_ficha_hogar := :old.id_ficha_hogar;                                
        xold.numero_orden_identificacion := :old.numero_orden_identificacion;      
        xold.primer_nombre := :old.primer_nombre;                                  
        xold.segundo_nombre := :old.segundo_nombre;                                
        xold.primer_apellido := :old.primer_apellido;                              
        xold.segundo_apellido := :old.segundo_apellido;                            
        xold.apellido_casada := :old.apellido_casada;                              
        xold.apodo := :old.apodo;                                                  
        xold.edad := :old.edad;                                                    
        xold.numero_sexo_persona := :old.numero_sexo_persona;                      
        xold.numero_estado_civil := :old.numero_estado_civil;                      
        xold.numero_tipo_persona_hogar := :old.numero_tipo_persona_hogar;          
        xold.numero_siono_miembro_hogar := :old.numero_siono_miembro_hogar;        
        xold.numero_orden_iden_conyuge := :old.numero_orden_iden_conyuge;          
        xold.numero_orden_iden_padre := :old.numero_orden_iden_padre;              
        xold.numero_orden_iden_madre := :old.numero_orden_iden_madre;              
        xold.numero_cedula := :old.numero_cedula;                                  
        xold.letra_cedula := :old.letra_cedula;                                    
        xold.numero_tipo_excepcion_ced := :old.numero_tipo_excepcion_ced;          
        xold.fecha_nacimiento := :old.fecha_nacimiento;                            
        xold.id_departamento_nacimiento := :old.id_departamento_nacimiento;        
        xold.id_distrito_nacimiento := :old.id_distrito_nacimiento;                
        xold.numero_tipo_area_lugar_nac := :old.numero_tipo_area_lugar_nac;        
        xold.numero_idioma_hogar := :old.numero_idioma_hogar;                      
        xold.otro_idioma_hogar := :old.otro_idioma_hogar;                          
        xold.numero_siono_asistencia_esc := :old.numero_siono_asistencia_esc;      
        xold.numero_motivo_ina_esc := :old.numero_motivo_ina_esc;                  
        xold.otro_motivo_ina_esc := :old.otro_motivo_ina_esc;                      
        xold.numero_siono_matriculacion_esc := :old.numero_siono_matriculacion_esc;
        xold.ultimo_curso_aprobado := :old.ultimo_curso_aprobado;                  
        xold.numero_nivel_edu_ult_cur_aprob := :old.numero_nivel_edu_ult_cur_aprob;
        xold.numero_siono_curso_no_formal := :old.numero_siono_curso_no_formal;    
        xold.numero_tipo_seguro_medico := :old.numero_tipo_seguro_medico;          
        xold.numero_estado_salud := :old.numero_estado_salud;                      
        xold.numero_clase_enf_acc := :old.numero_clase_enf_acc;                    
        xold.otra_clase_enf_acc := :old.otra_clase_enf_acc;                        
        xold.numero_clase_enf_cronica := :old.numero_clase_enf_cronica;            
        xold.otra_clase_enf_cronica := :old.otra_clase_enf_cronica;                
        xold.numero_siono_atencion_medica := :old.numero_siono_atencion_medica;    
        xold.numero_motivo_no_atencion := :old.numero_motivo_no_atencion;          
        xold.otro_motivo_no_atencion := :old.otro_motivo_no_atencion;              
        xold.numero_siono_carnet_vacunacion := :old.numero_siono_carnet_vacunacion;
        xold.numero_clase_impedimento := :old.numero_clase_impedimento;            
        xold.otra_clase_impedimento := :old.otra_clase_impedimento;                
        xold.numero_causa_impedimento := :old.numero_causa_impedimento;            
        xold.otra_causa_impedimento := :old.otra_causa_impedimento;                
        xold.numero_siono_dif_para_caminar := :old.numero_siono_dif_para_caminar;  
        xold.numero_siono_dif_para_vestirse := :old.numero_siono_dif_para_vestirse;
        xold.numero_siono_dif_para_banarse := :old.numero_siono_dif_para_banarse;  
        xold.numero_siono_dif_para_comer := :old.numero_siono_dif_para_comer;      
        xold.numero_siono_dif_para_la_cama := :old.numero_siono_dif_para_la_cama;  
        xold.numero_siono_dif_para_el_bano := :old.numero_siono_dif_para_el_bano;  
        xold.numero_siono_trabajo := :old.numero_siono_trabajo;                    
        xold.numero_motivo_no_trabajo := :old.numero_motivo_no_trabajo;            
        xold.otro_motivo_no_trabajo := :old.otro_motivo_no_trabajo;                
        xold.descripcion_ocupacion_prin := :old.descripcion_ocupacion_prin;        
        xold.descripcion_dedicacion_prin := :old.descripcion_dedicacion_prin;      
        xold.numero_tipo_relacion_lab := :old.numero_tipo_relacion_lab;            
        xold.monto_ingreso_ocupacion_prin := :old.monto_ingreso_ocupacion_prin;    
        xold.monto_ingreso_ocupacion_secun := :old.monto_ingreso_ocupacion_secun;  
        xold.monto_ingreso_otras_ocup := :old.monto_ingreso_otras_ocup;            
        xold.monto_ingreso_alquileres := :old.monto_ingreso_alquileres;            
        xold.monto_ingreso_intereses := :old.monto_ingreso_intereses;              
        xold.monto_ingreso_ayuda_fam_pais := :old.monto_ingreso_ayuda_fam_pais;    
        xold.monto_ingreso_ayuda_fam_exter := :old.monto_ingreso_ayuda_fam_exter;  
        xold.monto_ingreso_jubilacion := :old.monto_ingreso_jubilacion;            
        xold.monto_ingreso_pensiones := :old.monto_ingreso_pensiones;              
        xold.monto_ingreso_tekopora := :old.monto_ingreso_tekopora;                
        xold.monto_ingreso_programas := :old.monto_ingreso_programas;              
        xold.monto_ingreso_adicional := :old.monto_ingreso_adicional;              
        xold.total_ingreso_mensual := :old.total_ingreso_mensual;                  
        xold.id_potencial_ben := :old.id_potencial_ben;                            
        xold.es_ficha_persona_inactiva := :old.es_ficha_persona_inactiva;

        --dbms_output.put_line('el new '||:new.nombre_ficha_persona);
        xnew.id_ficha_persona := :new.id_ficha_persona;                            
        xnew.version_ficha_persona := :new.version_ficha_persona;                  
        xnew.codigo_ficha_persona := :new.codigo_ficha_persona;                    
        xnew.nombre_ficha_persona := :new.nombre_ficha_persona;                    
        xnew.es_respondente := :new.es_respondente;                                
        xnew.id_ficha_hogar := :new.id_ficha_hogar;                                
        xnew.numero_orden_identificacion := :new.numero_orden_identificacion;      
        xnew.primer_nombre := :new.primer_nombre;                                  
        xnew.segundo_nombre := :new.segundo_nombre;                                
        xnew.primer_apellido := :new.primer_apellido;                              
        xnew.segundo_apellido := :new.segundo_apellido;                            
        xnew.apellido_casada := :new.apellido_casada;                              
        xnew.apodo := :new.apodo;                                                  
        xnew.edad := :new.edad;                                                    
        xnew.numero_sexo_persona := :new.numero_sexo_persona;                      
        xnew.numero_estado_civil := :new.numero_estado_civil;                      
        xnew.numero_tipo_persona_hogar := :new.numero_tipo_persona_hogar;          
        xnew.numero_siono_miembro_hogar := :new.numero_siono_miembro_hogar;        
        xnew.numero_orden_iden_conyuge := :new.numero_orden_iden_conyuge;          
        xnew.numero_orden_iden_padre := :new.numero_orden_iden_padre;              
        xnew.numero_orden_iden_madre := :new.numero_orden_iden_madre;              
        xnew.numero_cedula := :new.numero_cedula;                                  
        xnew.letra_cedula := :new.letra_cedula;                                    
        xnew.numero_tipo_excepcion_ced := :new.numero_tipo_excepcion_ced;          
        xnew.fecha_nacimiento := :new.fecha_nacimiento;                            
        xnew.id_departamento_nacimiento := :new.id_departamento_nacimiento;        
        xnew.id_distrito_nacimiento := :new.id_distrito_nacimiento;                
        xnew.numero_tipo_area_lugar_nac := :new.numero_tipo_area_lugar_nac;        
        xnew.numero_idioma_hogar := :new.numero_idioma_hogar;                      
        xnew.otro_idioma_hogar := :new.otro_idioma_hogar;                          
        xnew.numero_siono_asistencia_esc := :new.numero_siono_asistencia_esc;      
        xnew.numero_motivo_ina_esc := :new.numero_motivo_ina_esc;                  
        xnew.otro_motivo_ina_esc := :new.otro_motivo_ina_esc;                      
        xnew.numero_siono_matriculacion_esc := :new.numero_siono_matriculacion_esc;
        xnew.ultimo_curso_aprobado := :new.ultimo_curso_aprobado;                  
        xnew.numero_nivel_edu_ult_cur_aprob := :new.numero_nivel_edu_ult_cur_aprob;
        xnew.numero_siono_curso_no_formal := :new.numero_siono_curso_no_formal;    
        xnew.numero_tipo_seguro_medico := :new.numero_tipo_seguro_medico;          
        xnew.numero_estado_salud := :new.numero_estado_salud;                      
        xnew.numero_clase_enf_acc := :new.numero_clase_enf_acc;                    
        xnew.otra_clase_enf_acc := :new.otra_clase_enf_acc;                        
        xnew.numero_clase_enf_cronica := :new.numero_clase_enf_cronica;            
        xnew.otra_clase_enf_cronica := :new.otra_clase_enf_cronica;                
        xnew.numero_siono_atencion_medica := :new.numero_siono_atencion_medica;    
        xnew.numero_motivo_no_atencion := :new.numero_motivo_no_atencion;          
        xnew.otro_motivo_no_atencion := :new.otro_motivo_no_atencion;              
        xnew.numero_siono_carnet_vacunacion := :new.numero_siono_carnet_vacunacion;
        xnew.numero_clase_impedimento := :new.numero_clase_impedimento;            
        xnew.otra_clase_impedimento := :new.otra_clase_impedimento;                
        xnew.numero_causa_impedimento := :new.numero_causa_impedimento;            
        xnew.otra_causa_impedimento := :new.otra_causa_impedimento;                
        xnew.numero_siono_dif_para_caminar := :new.numero_siono_dif_para_caminar;  
        xnew.numero_siono_dif_para_vestirse := :new.numero_siono_dif_para_vestirse;
        xnew.numero_siono_dif_para_banarse := :new.numero_siono_dif_para_banarse;  
        xnew.numero_siono_dif_para_comer := :new.numero_siono_dif_para_comer;      
        xnew.numero_siono_dif_para_la_cama := :new.numero_siono_dif_para_la_cama;  
        xnew.numero_siono_dif_para_el_bano := :new.numero_siono_dif_para_el_bano;  
        xnew.numero_siono_trabajo := :new.numero_siono_trabajo;                    
        xnew.numero_motivo_no_trabajo := :new.numero_motivo_no_trabajo;            
        xnew.otro_motivo_no_trabajo := :new.otro_motivo_no_trabajo;                
        xnew.descripcion_ocupacion_prin := :new.descripcion_ocupacion_prin;        
        xnew.descripcion_dedicacion_prin := :new.descripcion_dedicacion_prin;      
        xnew.numero_tipo_relacion_lab := :new.numero_tipo_relacion_lab;            
        xnew.monto_ingreso_ocupacion_prin := :new.monto_ingreso_ocupacion_prin;    
        xnew.monto_ingreso_ocupacion_secun := :new.monto_ingreso_ocupacion_secun;  
        xnew.monto_ingreso_otras_ocup := :new.monto_ingreso_otras_ocup;            
        xnew.monto_ingreso_alquileres := :new.monto_ingreso_alquileres;            
        xnew.monto_ingreso_intereses := :new.monto_ingreso_intereses;              
        xnew.monto_ingreso_ayuda_fam_pais := :new.monto_ingreso_ayuda_fam_pais;    
        xnew.monto_ingreso_ayuda_fam_exter := :new.monto_ingreso_ayuda_fam_exter;  
        xnew.monto_ingreso_jubilacion := :new.monto_ingreso_jubilacion;            
        xnew.monto_ingreso_pensiones := :new.monto_ingreso_pensiones;              
        xnew.monto_ingreso_tekopora := :new.monto_ingreso_tekopora;                
        xnew.monto_ingreso_programas := :new.monto_ingreso_programas;              
        xnew.monto_ingreso_adicional := :new.monto_ingreso_adicional;              
        xnew.total_ingreso_mensual := :new.total_ingreso_mensual;                  
        xnew.id_potencial_ben := :new.id_potencial_ben;                            
        xnew.es_ficha_persona_inactiva := :new.es_ficha_persona_inactiva;          
        /**/
        /**/
        --Si cambia cualquier información que pueda desvincular a la persona
        --dbms_output.put_line('entro?');
        cambios:=sp$ficha_persona.verificar_cambio_vinculo(xold,xnew);
        --Si no hay cambios no se hace nada
         if(cambios<>0) then
             --Si hay cambios se desvincula y luego se vincula
             sp$ficha_persona.eliminar_vinculos(xold);
             sp$ficha_persona.actualizar_vinculos(xnew);
         end if;
end loop;
exception
    when others then
        msg_string := trim(replace(replace(replace(DBMS_UTILITY.FORMAT_ERROR_STACK,
            chr(13), ''), chr(10), ''), 'ORA'||err_number||':', ''));
        if (indice >= 1 and indice <= ids.count) then
            msg_string := msg_string||'; no es posible actualizar la Persona #'||ids(indice)
                ||'"';
        end if;
        raise_application_error(err_number, msg_string, true);
end after statement;
end ficha_persona_compound_update;
/
show errors