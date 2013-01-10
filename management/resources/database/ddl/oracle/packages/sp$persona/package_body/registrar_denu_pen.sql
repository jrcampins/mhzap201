--
--Descripción: Este procedimiento permite denunciar una pensión. Para ello verifica que la pensión ya haya sido aprobada
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@param comentarios: Comentarios de la solicitud
--@return: 0 si no se produjo ninguna excepcion.
--
function registrar_denu_pen(persona_consultada number, comentarios varchar2) return varchar2 is
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
    --Solo se aceptan denuncias respecto a pensiones aprobadas
    elsif row_persona.numero_condicion_pension <>2 and row_persona.numero_condicion_pension <>5 then
        msg_string := 'Persona no tiene pensión aprobada ni otorgada. No se puede registrar denuncia';
        raise_application_error(err_number, msg_string, true);
    --Solo se permite registrar una denuncia a la vez
    elsif row_persona.numero_condicion_denu_pen=1 then
        msg_string := 'Persona ya tiene denuncia registrada';
        raise_application_error(err_number, msg_string, true);
    else
        --Se actualiza el estado de la denuncia, registrando los valores indicados por el usuario
        update persona 
        set    numero_condicion_denu_pen = 1,
               fecha_registro_denuncia_pen = trunc(current_timestamp),
               comentarios_registro_denu_pen = comentarios
        where  id_persona = persona_consultada;
        mensaje:='Denuncia Registrada';
    end if;
    return mensaje;
end;