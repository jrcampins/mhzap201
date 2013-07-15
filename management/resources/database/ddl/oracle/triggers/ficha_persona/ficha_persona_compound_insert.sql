create or replace trigger ficha_persona_compound_insert 
for insert on ficha_persona
compound trigger
    type tabla_bigints is table of ficha_persona.id_ficha_persona%type      index by binary_integer;
    type tabla_codigos is table of ficha_persona.codigo_ficha_persona%type  index by binary_integer;
    
    ids    tabla_bigints;
    var number;
    codigos tabla_codigos;
    xnew ficha_persona%rowtype;
    row_ficha_persona ficha_persona%rowtype;
    indice      binary_integer := 0;
    nivel       number;
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000); -- a character string of at most 2048 bytes
before each row is
begin
    ----dbms_output.put_line('Insertando '||:new.id_ficha_persona);
/**/
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
    :new.codigo_ficha_persona := sp$ficha_persona.concat_codigo(xnew);
    :new.nombre_ficha_persona := sp$ficha_persona.concat_nombre(xnew);
end before each row;

after each row is
begin
    indice         := indice + 1;
    ids(indice)     := :new.id_ficha_persona;
    codigos(indice) := :new.codigo_ficha_persona;
    ----dbms_output.put_line(indice||', '||ids(indice)||', '||codigos(indice));
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
        xnew.id_ficha_persona := row_ficha_persona.id_ficha_persona;                            
        xnew.version_ficha_persona := row_ficha_persona.version_ficha_persona;                  
        xnew.codigo_ficha_persona := row_ficha_persona.codigo_ficha_persona;                    
        xnew.nombre_ficha_persona := row_ficha_persona.nombre_ficha_persona;                    
        xnew.es_respondente := row_ficha_persona.es_respondente;                                
        xnew.id_ficha_hogar := row_ficha_persona.id_ficha_hogar;                                
        xnew.numero_orden_identificacion := row_ficha_persona.numero_orden_identificacion;      
        xnew.primer_nombre := row_ficha_persona.primer_nombre;                                  
        xnew.segundo_nombre := row_ficha_persona.segundo_nombre;                                
        xnew.primer_apellido := row_ficha_persona.primer_apellido;                              
        xnew.segundo_apellido := row_ficha_persona.segundo_apellido;                            
        xnew.apellido_casada := row_ficha_persona.apellido_casada;                              
        xnew.apodo := row_ficha_persona.apodo;                                                  
        xnew.edad := row_ficha_persona.edad;                                                    
        xnew.numero_sexo_persona := row_ficha_persona.numero_sexo_persona;                      
        xnew.numero_estado_civil := row_ficha_persona.numero_estado_civil;                      
        xnew.numero_tipo_persona_hogar := row_ficha_persona.numero_tipo_persona_hogar;          
        xnew.numero_siono_miembro_hogar := row_ficha_persona.numero_siono_miembro_hogar;        
        xnew.numero_orden_iden_conyuge := row_ficha_persona.numero_orden_iden_conyuge;          
        xnew.numero_orden_iden_padre := row_ficha_persona.numero_orden_iden_padre;              
        xnew.numero_orden_iden_madre := row_ficha_persona.numero_orden_iden_madre;              
        xnew.numero_cedula := row_ficha_persona.numero_cedula;                                  
        xnew.letra_cedula := row_ficha_persona.letra_cedula;                                    
        xnew.numero_tipo_excepcion_ced := row_ficha_persona.numero_tipo_excepcion_ced;          
        xnew.fecha_nacimiento := row_ficha_persona.fecha_nacimiento;                            
        xnew.id_departamento_nacimiento := row_ficha_persona.id_departamento_nacimiento;        
        xnew.id_distrito_nacimiento := row_ficha_persona.id_distrito_nacimiento;                
        xnew.numero_tipo_area_lugar_nac := row_ficha_persona.numero_tipo_area_lugar_nac;        
        xnew.numero_idioma_hogar := row_ficha_persona.numero_idioma_hogar;                      
        xnew.otro_idioma_hogar := row_ficha_persona.otro_idioma_hogar;                          
        xnew.numero_siono_asistencia_esc := row_ficha_persona.numero_siono_asistencia_esc;      
        xnew.numero_motivo_ina_esc := row_ficha_persona.numero_motivo_ina_esc;                  
        xnew.otro_motivo_ina_esc := row_ficha_persona.otro_motivo_ina_esc;                      
        xnew.numero_siono_matriculacion_esc := row_ficha_persona.numero_siono_matriculacion_esc;
        xnew.ultimo_curso_aprobado := row_ficha_persona.ultimo_curso_aprobado;                  
        xnew.numero_nivel_edu_ult_cur_aprob := row_ficha_persona.numero_nivel_edu_ult_cur_aprob;
        xnew.numero_siono_curso_no_formal := row_ficha_persona.numero_siono_curso_no_formal;    
        xnew.numero_tipo_seguro_medico := row_ficha_persona.numero_tipo_seguro_medico;          
        xnew.numero_estado_salud := row_ficha_persona.numero_estado_salud;                      
        xnew.numero_clase_enf_acc := row_ficha_persona.numero_clase_enf_acc;                    
        xnew.otra_clase_enf_acc := row_ficha_persona.otra_clase_enf_acc;                        
        xnew.numero_clase_enf_cronica := row_ficha_persona.numero_clase_enf_cronica;            
        xnew.otra_clase_enf_cronica := row_ficha_persona.otra_clase_enf_cronica;                
        xnew.numero_siono_atencion_medica := row_ficha_persona.numero_siono_atencion_medica;    
        xnew.numero_motivo_no_atencion := row_ficha_persona.numero_motivo_no_atencion;          
        xnew.otro_motivo_no_atencion := row_ficha_persona.otro_motivo_no_atencion;              
        xnew.numero_siono_carnet_vacunacion := row_ficha_persona.numero_siono_carnet_vacunacion;
        xnew.numero_clase_impedimento := row_ficha_persona.numero_clase_impedimento;            
        xnew.otra_clase_impedimento := row_ficha_persona.otra_clase_impedimento;                
        xnew.numero_causa_impedimento := row_ficha_persona.numero_causa_impedimento;            
        xnew.otra_causa_impedimento := row_ficha_persona.otra_causa_impedimento;                
        xnew.numero_siono_dif_para_caminar := row_ficha_persona.numero_siono_dif_para_caminar;  
        xnew.numero_siono_dif_para_vestirse := row_ficha_persona.numero_siono_dif_para_vestirse;
        xnew.numero_siono_dif_para_banarse := row_ficha_persona.numero_siono_dif_para_banarse;  
        xnew.numero_siono_dif_para_comer := row_ficha_persona.numero_siono_dif_para_comer;      
        xnew.numero_siono_dif_para_la_cama := row_ficha_persona.numero_siono_dif_para_la_cama;  
        xnew.numero_siono_dif_para_el_bano := row_ficha_persona.numero_siono_dif_para_el_bano;  
        xnew.numero_siono_trabajo := row_ficha_persona.numero_siono_trabajo;                    
        xnew.numero_motivo_no_trabajo := row_ficha_persona.numero_motivo_no_trabajo;            
        xnew.otro_motivo_no_trabajo := row_ficha_persona.otro_motivo_no_trabajo;                
        xnew.descripcion_ocupacion_prin := row_ficha_persona.descripcion_ocupacion_prin;        
        xnew.descripcion_dedicacion_prin := row_ficha_persona.descripcion_dedicacion_prin;      
        xnew.numero_tipo_relacion_lab := row_ficha_persona.numero_tipo_relacion_lab;            
        xnew.monto_ingreso_ocupacion_prin := row_ficha_persona.monto_ingreso_ocupacion_prin;    
        xnew.monto_ingreso_ocupacion_secun := row_ficha_persona.monto_ingreso_ocupacion_secun;  
        xnew.monto_ingreso_otras_ocup := row_ficha_persona.monto_ingreso_otras_ocup;            
        xnew.monto_ingreso_alquileres := row_ficha_persona.monto_ingreso_alquileres;            
        xnew.monto_ingreso_intereses := row_ficha_persona.monto_ingreso_intereses;              
        xnew.monto_ingreso_ayuda_fam_pais := row_ficha_persona.monto_ingreso_ayuda_fam_pais;    
        xnew.monto_ingreso_ayuda_fam_exter := row_ficha_persona.monto_ingreso_ayuda_fam_exter;  
        xnew.monto_ingreso_jubilacion := row_ficha_persona.monto_ingreso_jubilacion;            
        xnew.monto_ingreso_pensiones := row_ficha_persona.monto_ingreso_pensiones;              
        xnew.monto_ingreso_tekopora := row_ficha_persona.monto_ingreso_tekopora;                
        xnew.monto_ingreso_programas := row_ficha_persona.monto_ingreso_programas;              
        xnew.monto_ingreso_adicional := row_ficha_persona.monto_ingreso_adicional;              
        xnew.total_ingreso_mensual := row_ficha_persona.total_ingreso_mensual;                  
        xnew.id_potencial_ben := row_ficha_persona.id_potencial_ben;                            
        xnew.es_ficha_persona_inactiva := row_ficha_persona.es_ficha_persona_inactiva;          
        /**/
        sp$ficha_persona.actualizar_vinculos(xnew);
end loop;
exception
    when others then
        msg_string := trim(replace(replace(replace(DBMS_UTILITY.FORMAT_ERROR_STACK,
            chr(13), ''), chr(10), ''), 'ORA'||err_number||':', ''));
        if (indice >= 1 and indice <= ids.count) then
            msg_string := msg_string||'; no es posible actualizar la Persona #'||ids(indice)
                ||', cedula "'||codigos(indice)||'"';
        end if;
        raise_application_error(err_number, msg_string, true);
end after statement;
end ficha_persona_compound_insert;
/
show errors