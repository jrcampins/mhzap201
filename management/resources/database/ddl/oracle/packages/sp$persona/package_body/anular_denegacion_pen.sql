function anular_denegacion_pen(persona_consultada number) return varchar2 is 
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
    --No tiene certificado de defunción: no hay nada que procesar.
    --
    elsif row_persona.numero_condicion_pension is null or row_persona.numero_condicion_pension!=6 then 
        msg_string :='Persona no tiene pensión denegada';
        raise_application_error(err_number, msg_string, true);

    elsif row_persona.numero_condicion_pension=6then
        update persona 
        set numero_condicion_pension =3,
            fecha_objecion_pension=sysdate,
            comentarios_objecion_pension='Pensión con denegación anulada'
        where  id_persona = persona_consultada;
        mensaje:='Denegación anulada. Pensión vuelve a estar objetada';
    end if;
    return mensaje;
end;