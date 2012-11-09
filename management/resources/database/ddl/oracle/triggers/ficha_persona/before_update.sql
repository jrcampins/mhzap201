create or replace trigger ficha_persona_before_update
before update on ficha_persona
for each row
declare
    xnew ficha_persona%rowtype;
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000); -- a character string of at most 2048 bytes
begin
    if (:old.es_ficha_persona_inactiva=1 and :new.es_ficha_persona_inactiva=1) then
        msg_string := 'La Ficha Persona está inactiva. No se puede actualizar';
        raise_application_error(err_number, msg_string, true);
    end if;
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
end;
/
show errors
