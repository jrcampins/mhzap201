--
--Descripción: Este procedimiento deniega una solicitud de reconsideración de pensión. Para ello registra los motivos indicados por el usuario
--@param rastro: Identificador del proceso ejecutado.
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@param numero_causa: numero de la causa de denegación
--@param otra_causa: descripcion de otra causa de denegación
--@param comentarios: Comentarios de la denegacion
--@return: mensaje indicando resultado de la ejecucion del proceso
--
function denegar_reco_pen(persona_consultada number, numero_causa number, otra_causa varchar2, comentarios varchar2) return varchar2 is
    row_persona persona%rowtype;
    mensaje_den varchar2(2000);
    mensaje varchar2 (200):='';
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
    --Solo se procesan reconsideraciones solicitadas
    elsif row_persona.numero_condicion_reco_pen<>1 then
        msg_string := 'Persona no tiene reconsideración solicitada';
        raise_application_error(err_number, msg_string, true);
    else
        --Se determina el mensaje de denegacion de la reconsideración de pensión
        select cdp.codigo_causa_den_reco_pen  
        into mensaje_den 
        from causa_den_reco_pen  cdp
        where cdp.numero_causa_den_reco_pen =numero_causa;
        --Se deniega la reconsideración de la pensión con los parámetros recibidos
        update persona 
        set    numero_condicion_reco_pen = 3,
           fecha_denegacion_reco_pen = trunc(current_timestamp),
           numero_causa_den_reco_pen =numero_causa,
           comentarios_den_reco_pen=comentarios,
           otra_causa_den_reco_pen = otra_causa
        where  id_persona = persona_consultada;
        mensaje:='Reconsideración Negada: '||mensaje_den;
    end if;
    return mensaje;
end;