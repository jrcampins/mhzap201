--
--Descripción: Este procedimiento registra el ultimo cobro de la pension de una persona
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@param fecha_cobro: Fecha de cobro
--@return: Mensaje indicando que se actualizo la persona, si no se produjo ninguna excepcion.
--
function act_fec_ult_cob_pen(persona_consultada number, fecha_cobro timestamp) return varchar2 is
    mensaje varchar2 (200):='';
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
    --Persona debe tener pensión aprobada
    --
    elsif row_persona.numero_condicion_pension is null or row_persona.numero_condicion_pension<>2 then
        msg_string := 'Error: Persona no tiene pensión aprobada (id='|| persona_consultada||')';
        raise_application_error(err_number, msg_string, true);
    --
    --Se reemplaza la fecha de cobro por la recibida
    --
    else
        update persona 
        set fecha_ultimo_cobro_pension = fecha_cobro
        where  id_persona = persona_consultada;
        mensaje:='Último Cobro Registrado ';
    end if;
    return mensaje;
end;