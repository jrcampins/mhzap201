--
--Descripci�n: Este procedimiento deniega una solicitud de pensi�n. Para ello registra los motivos indicados por el usuario
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@param numero_causa: numero de la causa de denegaci�n
--@param otra_causa: descripcion de otra causa de denegaci�n
--@param comentarios: Comentarios de la solicitud
--@return: mensaje indicando la condici�n de ejecuci�n del proceso
--
function denegar_pension(persona_consultada number, numero_causa integer, otra_causa varchar2, comentarios varchar2) return varchar2 is
    mensaje_denegacion_pension varchar2(200):='';
    mensaje varchar2 (200):='';
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
    elsif (row_persona.numero_condicion_pension <>1) then
        msg_string := 'Persona no tiene pensi�n solicitada';
        raise_application_error(err_number, msg_string, true);
    --
    --Se determina el mensaje de denegacion de la pensi�n
    --
    else
        begin
            select cdp.codigo_causa_den_pension into mensaje_denegacion_pension from causa_den_pension cdp where cdp.numero_causa_den_pension=numero_causa;
        exception
            when no_data_found then null;
        end;
        if not sql%found then
            msg_string := 'Causa de denegaci�n inv�lida (c�digo='||numero_causa||')';
            raise_application_error(err_number, msg_string, true);
        end if;
        --
        --Este proceso no hace ninguna validaci�n, solo se registran los datos indicados por el usuario.
        --
        update persona 
        set numero_condicion_pension = 3,
            fecha_denegacion_pension = CURRENT_TIMESTAMP,
            numero_causa_den_pension=numero_causa,
            comentarios_denegacion_pension=comentarios,
            otra_causa_den_pension = otra_causa
        where  id_persona = persona_consultada;
        mensaje:='Pensi�n Denegada: '||mensaje_denegacion_pension;
    end if;
    return mensaje;
end;
