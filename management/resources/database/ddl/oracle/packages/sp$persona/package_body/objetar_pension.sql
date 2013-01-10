--
--Descripción: Este procedimiento deniega una solicitud de pensión. Para ello registra los motivos indicados por el usuario
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@param numero_causa: numero de la causa de denegación
--@param otra_causa: descripcion de otra causa de denegación
--@param comentarios: Comentarios de la solicitud
--@return: mensaje indicando la condición de ejecución del proceso
--
function objetar_pension(persona_consultada number, numero_causa number, otra_causa varchar2, comentarios varchar2) return varchar2 is
    v_numero_causa number;
    v_otra_causa varchar2(200);
    mensaje_denegacion_pension varchar2(200) := '';
    mensaje varchar2 (200) := '';
    row_persona persona%rowtype;
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000);
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
    --Solo se deniegan pensiones solicitadas.
    --
    elsif (row_persona.numero_condicion_pension <> 1) then
        msg_string := 'Persona no tiene pensión solicitada';
        raise_application_error(err_number, msg_string, true);
    --
    --Se determina el mensaje de denegacion de la pensión
    --
    else
        if numero_causa is null then
            v_numero_causa := 99;
        else
            v_numero_causa := numero_causa;
        end if;
        if v_numero_causa = 99 then
            v_otra_causa := trim(otra_causa);
            if v_otra_causa is null or v_otra_causa = '' then
                v_otra_causa := 'Causa no especificada';
            end if;
        end if;
        begin
            select cdp.codigo_causa_den_pension
            into mensaje_denegacion_pension
            from causa_den_pension cdp
            where cdp.numero_causa_den_pension = v_numero_causa;
        exception
            when no_data_found then
                msg_string := 'Causa de denegación inválida (código='||v_numero_causa||')';
                raise_application_error(err_number, msg_string, true);
        end;
        --
        update persona 
        set    numero_condicion_pension = 3,
               fecha_objecion_pension = trunc(current_timestamp),
               numero_causa_den_pension = v_numero_causa,
               otra_causa_den_pension = v_otra_causa,
               comentarios_objecion_pension = comentarios
        where  id_persona = persona_consultada;
        --
        mensaje:='Pensión Objetada. Causa: '||mensaje_denegacion_pension;
    end if;
    return mensaje;
end;
