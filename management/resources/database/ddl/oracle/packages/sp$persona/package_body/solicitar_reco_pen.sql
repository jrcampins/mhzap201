--
--Descripción: Este procedimiento registra una solicitud de reconsideración de pensión. La pensión debe haber sido negada o revocada
--@param rastro: Identificador del proceso ejecutado.
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@param comentarios: Comentarios de la solicitud
--@return: 0 si no se produjo ninguna excepcion.
--
function solicitar_reco_pen(persona_consultada number, comentarios varchar2) return varchar2 is
    mensaje varchar2(200);
    mensaje_int varchar2(200);
    row_persona persona%rowtype;
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000);
begin
    begin
        select *  into   row_persona from   persona p where  p.id_persona = persona_consultada;
    exception
        when no_data_found then null;
    end;
    if not sql%found then
        msg_string := 'Persona no existe (id='||persona_consultada||')';
        raise_application_error(err_number, msg_string, true);
    --Solo se reconsideran pensiones negadas o revocadas
    elsif row_persona.numero_condicion_pension <>3 and row_persona.numero_condicion_pension <>4 then
        msg_string :='Persona no tiene pensión denegada ni revocada. No se puede reconsiderar';
        raise_application_error(err_number, msg_string, true);
    --Solo se puede solicitar una reconsideracion. Si ya hay una solicitada se rechaza la solicitud
    elsif row_persona.numero_condicion_reco_pen=1 then
        msg_string :='Persona ya tiene reconsideracion solicitada';
        raise_application_error(err_number, msg_string, true);
    --Se registra la solicitud de reconsideración. Se queda a la espera que se apruebe o deniegue
    else
        update persona 
        set    numero_condicion_reco_pen = 1,
               fecha_solicitud_reco_pen = trunc(current_timestamp),
               comentarios_solicitud_reco_pen =comentarios
        where  id_persona = persona_consultada;
        mensaje:='Reconsideración solicitada';
    end if;
    return mensaje;
end;
