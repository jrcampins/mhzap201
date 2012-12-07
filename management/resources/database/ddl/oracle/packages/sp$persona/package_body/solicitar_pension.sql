--
--Descripci�n: Este procedimiento solicita una pensi�n a una persona, verificando que la persona 
--cumpla los requisitos personales est� acreditada y sea elegible
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@param comentarios: Comentarios de la revocaci�n
--@return: mensaje indicando el resultado de la acreditaci�n
--
function solicitar_pension(persona_consultada number, comentarios varchar2) return varchar2 is
    mensaje varchar2 (200):='';
    row_persona persona%rowtype;
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000);
    condicion_elegibilidad number:=0;
    requisitos_personales number:=0;
begin
    begin
        select * into row_persona from persona p where  p.id_persona = persona_consultada;
    exception
        when no_data_found then null;
    end;
    if not sql%found then
        msg_string := 'Persona no existe (id='||persona_consultada||')';
        raise_application_error(err_number, msg_string, true);
    --Si la persona tiene pensi�n solicitada no puede volver a solicitarla
    elsif row_persona.numero_condicion_pension =1 then
        msg_string := 'Persona ya tiene pensi�n solicitada';
        raise_application_error(err_number, msg_string, true);
    --Si la persona ya tiene pensi�n aprobada no puede volver a solicitarla
    elsif row_persona.numero_condicion_pension =2 then
        msg_string := 'Persona ya tiene pensi�n aprobada';
        raise_application_error(err_number, msg_string, true);
    --Si la persona ya tiene pensi�n denegada no puede volver a solicitarla, 
    --el proceso de reconsideraciones se encargar� de reprocesar esa solicitud
    elsif row_persona.numero_condicion_pension =3 then
        msg_string := 'Persona ya tiene pensi�n denegada';
        raise_application_error(err_number, msg_string, true);
    --Si la persona ya tiene pensi�n revocada no puede volver a solicitarla, 
    --el proceso de reconsideraciones se encargar� de reprocesar esa solicitud
    elsif row_persona.numero_condicion_pension =4 then
        msg_string := 'Persona ya tiene pensi�n denegada';
        raise_application_error(err_number, msg_string, true);
    --Si la persona ya tiene pensi�n otorgada no puede volver a solicitarla, 
    elsif row_persona.numero_condicion_pension =4 then
        msg_string := 'Persona ya tiene pensi�n otorgada';
        raise_application_error(err_number, msg_string, true);
    else
        --Si la persona no cumple requisitos personales no se le puede solicitar la pensi�n
        requisitos_personales:=sp$persona.consultar_req_pers(persona_consultada);
        if (requisitos_personales=12) then
            msg_string := 'Persona Fallecida';
            raise_application_error(err_number, msg_string, true);
        elsif (requisitos_personales=13) then
            msg_string := 'Persona no es Paraguayo Natural';
            raise_application_error(err_number, msg_string, true);
        elsif (requisitos_personales=14) then
            msg_string := 'Persona no es mayor de 65 a�os';
            raise_application_error(err_number, msg_string, true);
        end if;
        --Se solicita la pensi�n de la persona
        update persona 
        set    numero_condicion_pension = 1,
           fecha_solicitud_pension = CURRENT_TIMESTAMP,
           comentarios_solicitud_pension=comentarios
        where  id_persona = persona_consultada;
        mensaje:='Pensi�n solicitada';
    end if;
    return mensaje;
end;

