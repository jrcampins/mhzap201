--
--Descripción: Este procedimiento anula el último cobro de una pensión
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@param comentarios_anulacion: Comentarios donde el usuario indica las razones de la anulacion
--@return: Mensaje indicando que se actualizó la persona, si no se produjo ninguna excepción.
--
function anul_fec_ult_cob_pen(persona_consultada number, comentarios varchar2) return varchar2 is
    mensaje varchar2(200);
    row_persona persona%rowtype;
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000); -- a character string of at most 2048 bytes
begin
    begin
        select * into row_persona from persona p where  p.id_persona = persona_consultada;
    exception
        when no_data_found then null;
    end;
    if not sql%found then
        msg_string := 'Persona no existe (id='||persona_consultada||')';
        raise_application_error(err_number, msg_string, true);
    --
    --No tiene fecha de cobro: no hay nada que procesar.
    --
    elsif row_persona.fecha_ultimo_cobro_pension is null then
        msg_string := 'Persona no tiene Fecha de Cobro a Anular';
        raise_application_error(err_number, msg_string, true);
    --
    --Se anula la fecha de ultimo cobro
    --
    else
        update persona 
        set fecha_ultimo_cobro_pension=null,
            notas_anul_fec_ult_cob_pen=comentarios
        where  id_persona = persona_consultada;
        mensaje:='Fecha de cobro de última pensión anulado para '||row_persona.id_persona;
    end if;
    return mensaje;
end;
