create or replace trigger potencial_ben_before_insert
for insert on potencial_ben
compound trigger
    type tabla_bigints is table of potencial_ben.id_potencial_ben%type      index by binary_integer;
    type tabla_codigos is table of potencial_ben.codigo_potencial_ben%type  index by binary_integer;
    tipo_area number;
    xnew        potencial_ben%rowtype;
    row_persona persona%rowtype;
    id          tabla_bigints;
    codigo      tabla_codigos;
    indice      binary_integer := 0;
    pdq         number;
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000); -- a character string of at most 2048 bytes

before each row is
begin
    /**/
--  :new := sp$potencial_ben.copia_datos_persona(:new);
    if (:new.id_persona is not null) then
        begin
            select *
            into   row_persona
            from   persona
            where  id_persona = :new.id_persona;
        exception
            when no_data_found then
                msg_string := 'persona ' || :new.id_persona || ' no existe';
                raise_application_error(err_number, msg_string, true);
        end;
        /**/
        --el método original fue modificado 
        --Se copian aquellos datos que siempre estarán actualizados en persona
        :new.primer_nombre := row_persona.primer_nombre;
        :new.segundo_nombre := row_persona.segundo_nombre;
        :new.primer_apellido := row_persona.primer_apellido;
        :new.segundo_apellido := row_persona.segundo_apellido;
        :new.apellido_casada := row_persona.apellido_casada;
        :new.fecha_nacimiento := row_persona.fecha_nacimiento;
        :new.edad := utils.years_since(:new.fecha_nacimiento);
        :new.es_paraguayo_natural := row_persona.es_paraguayo_natural;
        :new.numero_cedula := row_persona.numero_cedula;
        :new.letra_cedula := row_persona.letra_cedula;
        :new.id_ficha_persona := row_persona.id_ficha_persona;
        :new.es_persona_con_empleo := row_persona.es_persona_con_empleo;
        :new.es_persona_con_deuda := row_persona.es_persona_con_deuda;
        :new.es_persona_con_pena_judicial := row_persona.es_persona_con_pena_judicial;
        :new.es_persona_con_cer_vida := row_persona.es_persona_con_cer_vida;
        :new.es_persona_con_carta_renuncia := row_persona.es_persona_con_carta_renuncia;
        :new.apodo := row_persona.apodo;
        :new.fecha_expedicion_cedula := row_persona.fecha_expedicion_cedula;
        :new.fecha_vencimiento_cedula := row_persona.fecha_vencimiento_cedula;
        :new.es_indigena := row_persona.es_indigena;
        :new.id_etnia_indigena := row_persona.id_etnia_indigena;
        :new.nombre_comunidad_indigena := row_persona.nombre_comunidad_indigena;
        --Aquellos campos que no provengan del repositorio de identificaciones son obtenidos desde potencial_ben
        if (:new.id_departamento is null) then
            :new.id_departamento := row_persona.id_departamento;
        end if;
        if (:new.id_distrito is null) then
            :new.id_distrito := row_persona.id_distrito;
        end if;
        if (:new.id_barrio is null) then
            :new.id_barrio := row_persona.id_barrio; 
        end if;
        if (:new.manzana is null) then
            :new.manzana := row_persona.manzana;
        end if;
        if (:new.direccion is null) then
            :new.direccion := row_persona.direccion;
        end if;
        if (:new.es_persona_con_subsidio is null) then
            :new.es_persona_con_subsidio := row_persona.es_persona_con_subsidio ;
        end if;
        if (:new.es_persona_con_pension is null) then
            :new.es_persona_con_pension := row_persona.es_persona_con_pension ;
        end if;
        if (:new.es_persona_con_jubilacion is null) then
            :new.es_persona_con_jubilacion := row_persona.es_persona_con_jubilacion ;
        end if;
        /**/
    end if;
    
    if(:new.id_barrio is not null) then
        begin
            select u.numero_tipo_area into tipo_area from ubicacion u where u.id_ubicacion=:new.id_barrio;
        exception
            when no_data_found then null;
        end;
        if not sql%found then
            msg_string := 'Tipo de área no existe para barrio ' || :new.id_barrio ;
            raise_application_error(err_number, msg_string, true);
        end if;
        :new.numero_tipo_area:=tipo_area;
    end if;
    /**/
    xnew.id_potencial_ben := :new.id_potencial_ben;                            
    xnew.version_potencial_ben := :new.version_potencial_ben;                  
    xnew.codigo_potencial_ben := :new.codigo_potencial_ben;                    
    xnew.nombre_potencial_ben := :new.nombre_potencial_ben;                    
    xnew.numero_tipo_reg_pot_ben := :new.numero_tipo_reg_pot_ben;              
    xnew.id_persona := :new.id_persona;                                        
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
    xnew.edad := :new.edad;                                                    
    xnew.es_paraguayo_natural := :new.es_paraguayo_natural;                    
    xnew.es_indigena := :new.es_indigena;                                      
    xnew.id_etnia_indigena := :new.id_etnia_indigena;                          
    xnew.nombre_comunidad_indigena := :new.nombre_comunidad_indigena;          
    xnew.id_departamento := :new.id_departamento;                              
    xnew.id_distrito := :new.id_distrito;                                      
    xnew.numero_tipo_area := :new.numero_tipo_area;                            
    xnew.id_barrio := :new.id_barrio;                                          
    xnew.id_manzana := :new.id_manzana;                                        
    xnew.manzana := :new.manzana;                                              
    xnew.direccion := :new.direccion;                                          
    xnew.nombre_responsable_hogar := :new.nombre_responsable_hogar;            
    xnew.numero_telefono_resp_hogar := :new.numero_telefono_resp_hogar;        
    xnew.es_persona_con_empleo := :new.es_persona_con_empleo;                  
    xnew.es_persona_con_jubilacion := :new.es_persona_con_jubilacion;          
    xnew.es_persona_con_pension := :new.es_persona_con_pension;                
    xnew.es_persona_con_subsidio := :new.es_persona_con_subsidio;              
    xnew.es_persona_con_deuda := :new.es_persona_con_deuda;                    
    xnew.es_persona_con_pena_judicial := :new.es_persona_con_pena_judicial;    
    xnew.es_persona_con_cer_vida := :new.es_persona_con_cer_vida;              
    xnew.es_persona_con_carta_renuncia := :new.es_persona_con_carta_renuncia;  
    xnew.nombre_referente := :new.nombre_referente;                            
    xnew.numero_telefono_referente := :new.numero_telefono_referente;          
    xnew.numero_condicion_censo := :new.numero_condicion_censo;                
    xnew.fecha_validacion_censo := :new.fecha_validacion_censo;                
    xnew.id_funcionario_validacion_cen := :new.id_funcionario_validacion_cen;  
    xnew.numero_causa_inv_censo := :new.numero_causa_inv_censo;                
    xnew.otra_causa_inv_censo := :new.otra_causa_inv_censo;                    
    xnew.comentarios_validacion_censo := :new.comentarios_validacion_censo;    
    xnew.id_ficha_persona := :new.id_ficha_persona;                            
    xnew.numero_condicion_recl_cen := :new.numero_condicion_recl_cen;          
    xnew.fecha_reclamo_censo := :new.fecha_reclamo_censo;                      
    xnew.comentarios_reclamo_censo := :new.comentarios_reclamo_censo;          
    xnew.fecha_aprobacion_reclamo_censo := :new.fecha_aprobacion_reclamo_censo;
    xnew.comentarios_apr_recl_cen := :new.comentarios_apr_recl_cen;            
    xnew.fecha_denegacion_reclamo_censo := :new.fecha_denegacion_reclamo_censo;
    xnew.numero_causa_den_recl_cen := :new.numero_causa_den_recl_cen;          
    xnew.otra_causa_den_recl_cen := :new.otra_causa_den_recl_cen;              
    xnew.comentarios_den_recl_cen := :new.comentarios_den_recl_cen;            
    xnew.fecha_registro_pot_ben := :new.fecha_registro_pot_ben;                
    xnew.es_potencial_ben_inactivo := :new.es_potencial_ben_inactivo;          
    xnew.fecha_ultima_visita_censo := :new.fecha_ultima_visita_censo;          
    xnew.observaciones_ult_visita_cen := :new.observaciones_ult_visita_cen;    
    xnew.id_funcionario_ult_visita_cen := :new.id_funcionario_ult_visita_cen;  
    xnew.referencia_direccion := :new.referencia_direccion;                    
    /**/
    :new.codigo_potencial_ben   := sp$potencial_ben.concat_codigo(xnew);
    :new.nombre_potencial_ben   := sp$potencial_ben.concat_nombre(xnew);
    :new.numero_condicion_censo := sp$potencial_ben.actualizar_condicion_censo(xnew);
    :new.fecha_registro_pot_ben := current_timestamp;
--  if :new.es_paraguayo_natural=0 then
--      raise exception 'Error al insertar Potencial Beneficiario: no es Paraguayo natural';
--  end if;
--  if (:new.fecha_nacimiento is not null)then
--      if (date_part('year',age(:new.fecha_nacimiento))<65) then
--          raise exception 'Error al insertar Potencial Beneficiario: no es mayor de 65 años';
--      end if;
--  end if;
end before each row;

after each row is
begin
    indice         := indice + 1;
    id(indice)     := :new.id_potencial_ben;
    codigo(indice) := :new.codigo_potencial_ben;
    ----dbms_output.put_line(indice||', '||id(indice)||', '||codigo(indice));
end after each row;

after statement is
begin
    indice := 0;
    msg_string := '';
    ----dbms_output.put_line('after  statement (count='||id.count||') ');
    for i in 1..id.count
    loop
        indice := i;
        ----dbms_output.put_line('after  row '||i||', '||id(i)||', '||codigo(i));
        begin
            select count(*)
            into   pdq
            from   potencial_ben
            where  codigo_potencial_ben = codigo(i)
            and    id_potencial_ben <> id(i);
        exception
            when no_data_found then pdq := 0;
        end;
        if pdq > 0 then
            msg_string := 'Ya existe otro registro de Potencial Beneficiario con cedula ' || codigo(i);
            raise_application_error(err_number, msg_string, true);
        end if;
    end loop;
exception
    when others then
        msg_string := trim(replace(replace(replace(--dbms_UTILITY.FORMAT_ERROR_STACK,
            chr(13), ''), chr(10), ''), 'ORA'||err_number||':', ''));
        if (indice >= 1 and indice <= id.count) then
            msg_string := msg_string||'; no es posible actualizar el Potencial Beneficiario #'||id(indice)
                ||', cedula "'||codigo(indice)||'"';
        end if;
        raise_application_error(err_number, msg_string, true);
end after statement;

end potencial_ben_before_insert;
/
show errors
