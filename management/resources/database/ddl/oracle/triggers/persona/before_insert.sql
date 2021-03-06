create or replace trigger persona_before_insert
before insert on persona
for each row
declare
    xnew persona%rowtype;
    tipo_area number;
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000); -- a character string of at most 2048 bytes
    icv number;
    fecha_ent date;
begin
    --Se actualiza el tipo de area desde el barrio
    if (:new.id_barrio is not null) then
        begin
            select u.numero_tipo_area into tipo_area from ubicacion u where u.id_ubicacion=:new.id_barrio;
        exception
            when no_data_found then null;
        end;
        if not sql%found then
            msg_string := 'Tipo de �rea no existe para barrio ' || :new.id_barrio ;
            raise_application_error(err_number, msg_string, true);
        end if;
        :new.numero_tipo_area:=tipo_area; 
    end if;
    /**/
    xnew.id_persona := :new.id_persona;                                        
    xnew.version_persona := :new.version_persona;                              
    xnew.codigo_persona := :new.codigo_persona;                                
    xnew.nombre_persona := :new.nombre_persona;                                
    xnew.numero_cedula := :new.numero_cedula;                                  
    xnew.letra_cedula := :new.letra_cedula;                                    
    xnew.fecha_expedicion_cedula := :new.fecha_expedicion_cedula;              
    xnew.fecha_vencimiento_cedula := :new.fecha_vencimiento_cedula;            
    xnew.primer_nombre := :new.primer_nombre;                                  
    xnew.segundo_nombre := :new.segundo_nombre;                                
    xnew.primer_apellido := :new.primer_apellido;                              
    xnew.segundo_apellido := :new.segundo_apellido;                            
    xnew.apellido_casada := :new.apellido_casada;                              
    xnew.apodo := :new.apodo;                                                  
    xnew.fecha_nacimiento := :new.fecha_nacimiento;                            
    xnew.numero_sexo_persona := :new.numero_sexo_persona;                      
    xnew.numero_estado_civil := :new.numero_estado_civil;                      
    xnew.es_paraguayo_natural := :new.es_paraguayo_natural;                    
    xnew.es_indigena := :new.es_indigena;                                      
    xnew.id_etnia_indigena := :new.id_etnia_indigena;                          
    xnew.nombre_comunidad_indigena := :new.nombre_comunidad_indigena;          
    xnew.id_departamento := :new.id_departamento;                              
    xnew.id_distrito := :new.id_distrito;                                      
    xnew.numero_tipo_area := :new.numero_tipo_area;                            
    xnew.id_barrio := :new.id_barrio;                                                                                                                           
    xnew.direccion := :new.direccion;                                          
    xnew.numero_telefono_linea_baja := :new.numero_telefono_linea_baja;        
    xnew.numero_telefono_celular := :new.numero_telefono_celular;              
    xnew.certificado_vida := :new.certificado_vida;                            
    xnew.fecha_certificado_vida := :new.fecha_certificado_vida;                
    xnew.es_certificado_vida_anulado := :new.es_certificado_vida_anulado;            
    xnew.certificado_defuncion := :new.certificado_defuncion;                  
    xnew.fecha_certificado_defuncion := :new.fecha_certificado_defuncion;      
    xnew.es_cer_defuncion_anulado := :new.es_cer_defuncion_anulado;            
    xnew.es_persona_con_empleo := :new.es_persona_con_empleo;                  
    xnew.es_persona_con_jubilacion := :new.es_persona_con_jubilacion;          
    xnew.es_persona_con_pension := :new.es_persona_con_pension;                
    xnew.es_persona_con_subsidio := :new.es_persona_con_subsidio;              
    xnew.es_persona_con_deuda := :new.es_persona_con_deuda;                    
    xnew.es_persona_con_pena_judicial := :new.es_persona_con_pena_judicial;    
    xnew.es_persona_con_cer_vida := :new.es_persona_con_cer_vida;              
    xnew.es_persona_con_carta_renuncia := :new.es_persona_con_carta_renuncia;  
    xnew.es_persona_elegible_para_pen := :new.es_persona_elegible_para_pen;    
    xnew.es_persona_acreditada_para_pen := :new.es_persona_acreditada_para_pen;
    xnew.monto_pension := :new.monto_pension;                                  
    xnew.numero_condicion_pension := :new.numero_condicion_pension;                         
    xnew.fecha_solicitud_pension := :new.fecha_solicitud_pension;              
    xnew.comentarios_solicitud_pension := :new.comentarios_solicitud_pension;  
    xnew.fecha_aprobacion_pension := :new.fecha_aprobacion_pension;            
    xnew.comentarios_aprobacion_pension := :new.comentarios_aprobacion_pension;
    xnew.fecha_otorgamiento_pen := :new.fecha_otorgamiento_pen;                
    xnew.comentarios_otorgamiento_pen := :new.comentarios_otorgamiento_pen;    
    xnew.fecha_denegacion_pension := :new.fecha_denegacion_pension;            
    xnew.numero_causa_den_pension := :new.numero_causa_den_pension;            
    xnew.otra_causa_den_pension := :new.otra_causa_den_pension;                
    xnew.comentarios_denegacion_pension := :new.comentarios_denegacion_pension;
    xnew.fecha_revocacion_pension := :new.fecha_revocacion_pension;            
    xnew.numero_causa_rev_pension := :new.numero_causa_rev_pension;            
    xnew.otra_causa_rev_pension := :new.otra_causa_rev_pension;                
    xnew.comentarios_revocacion_pension := :new.comentarios_revocacion_pension;
    xnew.numero_condicion_reco_pen := :new.numero_condicion_reco_pen;          
    xnew.fecha_solicitud_reco_pen := :new.fecha_solicitud_reco_pen;            
    xnew.comentarios_solicitud_reco_pen := :new.comentarios_solicitud_reco_pen;
    xnew.fecha_aprobacion_reco_pen := :new.fecha_aprobacion_reco_pen;          
    xnew.comentarios_apr_reco_pen := :new.comentarios_apr_reco_pen;            
    xnew.fecha_denegacion_reco_pen := :new.fecha_denegacion_reco_pen;          
    xnew.numero_causa_den_reco_pen := :new.numero_causa_den_reco_pen;          
    xnew.otra_causa_den_reco_pen := :new.otra_causa_den_reco_pen;              
    xnew.comentarios_den_reco_pen := :new.comentarios_den_reco_pen;            
    xnew.numero_condicion_denu_pen := :new.numero_condicion_denu_pen;          
    xnew.fecha_registro_denuncia_pen := :new.fecha_registro_denuncia_pen;      
    xnew.comentarios_registro_denu_pen := :new.comentarios_registro_denu_pen;  
    xnew.fecha_confirmacion_denu_pen := :new.fecha_confirmacion_denu_pen;      
    xnew.comentarios_conf_denu_pen := :new.comentarios_conf_denu_pen;          
    xnew.fecha_desmentido_denuncia_pen := :new.fecha_desmentido_denuncia_pen;  
    xnew.comentarios_des_denu_pen := :new.comentarios_des_denu_pen;            
    xnew.id_ficha_persona := :new.id_ficha_persona;                            
    xnew.fecha_ficha_persona := :new.fecha_ficha_persona;                      
    xnew.indice_calidad_vida := :new.indice_calidad_vida;                      
    xnew.fecha_ultimo_cobro_pension := :new.fecha_ultimo_cobro_pension;        
    xnew.notas_anul_fec_ult_cob_pen := :new.notas_anul_fec_ult_cob_pen;        
    xnew.numero_tipo_act_jupe := :new.numero_tipo_act_jupe;                    
    xnew.fecha_hora_ult_act_jupe := :new.fecha_hora_ult_act_jupe;              
    xnew.numero_resolucion_otor_pen := :new.numero_resolucion_otor_pen;        
    xnew.fecha_resolucion_otor_pen := :new.fecha_resolucion_otor_pen;          
    /**/
    :new.codigo_persona := sp$persona.concat_codigo(xnew);
    :new.nombre_persona := sp$persona.concat_nombre(xnew);
    xnew.codigo_persona:=:new.codigo_persona;
    xnew.nombre_persona:=:new.nombre_persona;
    /**/
    :new.id_ficha_persona:=sp$persona.get_last_ficha_persona(xnew);
    if :new.id_ficha_persona is not null then
        --Tomamos el icv
        begin
            select indice_calidad_vida into icv from ficha_persona fp left join ficha_hogar fh on fp.id_ficha_hogar=fh.id_ficha_hogar where fp.id_ficha_persona=:new.id_ficha_persona;
        exception
            when no_data_found then
                null;
        end;
        if sql%found then
            :new.indice_calidad_vida:=icv;
        end if;
        --Tomamos la fecha
        begin
            select fecha_entrevista into fecha_ent from ficha_persona fp left join ficha_hogar fh on fp.id_ficha_hogar=fh.id_ficha_hogar where fp.id_ficha_persona=:new.id_ficha_persona;
        exception
            when no_data_found then
                null;
        end;
        if sql%found then
            :new.fecha_ficha_persona:=fecha_ent;
            :new.es_persona_acreditada_para_pen:=0;
        end if;
    end if;
    if :new.fecha_nacimiento > sysdate then
        msg_string := 'la fecha de nacimiento no puede ser mayor que la fecha de hoy';
        raise_application_error(err_number, msg_string, true);
    end if;
    /**/
end;
/
show errors
