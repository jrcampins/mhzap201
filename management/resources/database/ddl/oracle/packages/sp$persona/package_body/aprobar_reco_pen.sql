--
--Descripción: Este procedimiento aprueba una solicitud de reconsideración de pensión. Para ello se verifican los requisitos personales, la elegibilidad y la vigencia de la pensión
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@param comentarios: Comentarios de la solicitud
--@return: 0 si no se produjo ninguna excepcion.
--
function aprobar_reco_pen(persona_consultada number, comentarios varchar2) return varchar2 is
    row_persona persona%rowtype;
    mensaje varchar2 (200):='';
    condicion_elegibilidad number:=0;
    vigencia_pension number:=0;
    requisitos_personales number:=0;
    fecha_icv timestamp;
    fecha_reconsideracion timestamp;
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000);
begin
    begin
        select * into   row_persona from persona p where  p.id_persona = persona_consultada;
    exception
        when no_data_found then null;
    end;
    if not sql%found then
        msg_string := 'Persona no existe (id='||persona_consultada||')';
        raise_application_error(err_number, msg_string, true);
        --Solo se aprueba una reconsideración solicitada
    elsif row_persona.numero_condicion_reco_pen<>1 then
        msg_string := 'Persona no tiene reconsideración solicitada ';
        raise_application_error(err_number, msg_string, true);
    else
        --Solo se aprueban reconsideraciones de personas que cumplen con requisitos personales
        requisitos_personales:=sp$persona.consultar_req_pers(persona_consultada);
        --Solo se aprueban reconsideraciones de personas elegibles
        condicion_elegibilidad:=sp$persona.act_persona_elegible(persona_consultada);
        --Cuando se aprueba una reconsideración se aprueba la pensión
        if requisitos_personales=0 and condicion_elegibilidad=0 and vigencia_pension=0 then  
            update persona 
            set  numero_condicion_pension=2,
                fecha_aprobacion_pension=CURRENT_TIMESTAMP,
                comentarios_aprobacion_pension='Pensión Aprobada por reconsideración',
                numero_condicion_reco_pen = 2,
                fecha_aprobacion_reco_pen = CURRENT_TIMESTAMP,
                comentarios_apr_reco_pen=comentarios
            where  id_persona = persona_consultada;
            mensaje:='Reconsideración Aprobada, Pensión Aprobada';
        else
            mensaje:='No se pudo aprobar la reconsideración';
        end if;
    end if;
    return mensaje; 
end;

