--
--Descripción: Este procedimiento anula un certificado de defuncion, revirtiendo la denegación o revocación de la pensión según corresponda
--@param rastro: Identificador del proceso ejecutado.
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@param comentarios_anulacion: Comentarios donde el usuario indica las razones de la anulacion
--@return: 0 si no se produjo ninguna excepción.
--
create or replace function persona_anular_cer_defun(rastro bigint, persona_consultada bigint, comentarios varchar) returns integer as $$
declare
mensaje varchar:='';
begin
    select persona_anular_cer_defun(persona_consultada,comentarios) into mensaje;
    return rastro_proceso_update(rastro, 21, null, mensaje);
end;
$$ language plpgsql;
--
--Descripción: Este procedimiento anula un certificado de defuncion, revirtiendo la denegación o revocación de la pensión según corresponda
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@param comentarios_anulacion: Comentarios donde el usuario indica las razones de la anulacion
--@return: Mensaje indicando que se actualizó la persona, si no se produjo ninguna excepción.
--
create or replace function persona_anular_cer_defun(persona_consultada bigint, comentarios varchar) returns varchar as $$
declare
    mensaje varchar:='';
    row_persona persona;
begin
    select * 
    into row_persona
    from   persona as p
    where  p.id_persona = persona_consultada;
    if not found then
        raise exception 'Persona no existe (id=%)', persona_consultada;
    end if;
    --
    --No tiene certificado de defunción: no hay nada que procesar.
    --
    if row_persona.certificado_defuncion is null then
        raise exception 'Persona no tiene Certificado de Defunción a Anular';
    end if;
    --
    --Pensión revocada: Se retorna al estado aprobada (queda pendente de otorgar)
    --
    if row_persona.numero_condicion_pension =4 and row_persona.numero_causa_rev_pension = 12 then
        update persona 
        set numero_condicion_pension =2,
            numero_causa_rev_pension =null,
            fecha_revocacion_pension=null,
            comentarios_revocacion_pension=null,
            certificado_defuncion=null,
            fecha_certificado_defuncion=null,
            es_cer_defuncion_anulado=1,
            comentarios_anul_cer_defuncion=comentarios
        where  id_persona = persona_consultada;
    --
    --Pensión denegada: Se retorna al estado solicitada (su estado anterior)
    --
    elsif row_persona.numero_condicion_pension =3 and row_persona.numero_causa_den_pension = 12 then
        update persona 
        set numero_condicion_pension =1,
            numero_causa_den_pension =null,
            fecha_denegacion_pension=null,
            comentarios_denegacion_pension=null,
            certificado_defuncion=null,
            fecha_certificado_defuncion=null,
            es_cer_defuncion_anulado=1,
            comentarios_anul_cer_defuncion=comentarios
        where  id_persona = persona_consultada;
    --
    --En cualquier otro caso, solamente se anula el certificado de defunción.
    --
    else
        update persona 
        set certificado_defuncion=null,
            fecha_certificado_defuncion=null,
            es_cer_defuncion_anulado=1,
            comentarios_anul_cer_defuncion=comentarios
        where  id_persona = persona_consultada;
    end if;
    mensaje:='Certificado de Defunción Anulado para Persona '||row_persona.id_persona;
    return mensaje;
end;
$$ language plpgsql;