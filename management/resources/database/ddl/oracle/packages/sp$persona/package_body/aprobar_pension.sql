--
--Descripci�n: Este procedimiento aprueba una solicitud de pensi�n, verificando que la persona sea elegible
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@param comentarios: Comentarios del usuario
--@return: Mensaje indicando que se aprob� la pensi�n, si no se produjo ninguna excepci�n.
--
function aprobar_pension(persona_consultada number, comentarios varchar2) return varchar2 is
    row_persona persona%rowtype;
    mensaje varchar2 (200):='';
    condicion_elegibilidad number:=0;
    acreditacion number:=0;
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
    --No ha solicitado pensi�n: No hay nada que hacer
    elsif (row_persona.numero_condicion_pension is null or row_persona.numero_condicion_pension <>1) then
        msg_string := 'Persona no tiene pensi�n solicitada';
        raise_application_error(err_number, msg_string, true);
    --Persona no acreditada: No hay nada que hacer
    elsif (row_persona.es_persona_acreditada_para_pen=0) then
        msg_string := 'Persona no est� acreditada';
        raise_application_error(err_number, msg_string, true);
    else
        --Actualiza elegibilidad de la persona 
        condicion_elegibilidad:=sp$persona.act_persona_elegible(persona_consultada);
        --La persona es elegible (condicion_elegibilidad=0): Se aprueba la pensi�n
        if (condicion_elegibilidad=0) then  
            update persona 
            set    numero_condicion_pension = 2,
            fecha_aprobacion_pension = trunc(current_timestamp),
            comentarios_aprobacion_pension=comentarios
            where  id_persona = persona_consultada;
            mensaje:='Pensi�n Aprobada';
        else
            --La persona no es elegible 
            mensaje:='No se pudo aprobar la pensi�n';
        end if;
    end if;
    return mensaje;
end;