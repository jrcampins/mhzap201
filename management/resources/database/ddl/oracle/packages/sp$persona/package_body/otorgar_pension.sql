--
--Descripción: Este procedimiento aprueba una solicitud de pensión, verificando que la persona sea elegible
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@param numero_resolucion: numero de la resolución en la que se otorga la pensión
--@param fecha_resolucion: fecha de la resolución en la que se otorga la pensión
--@param comentarios: Comentarios del usuario
--@return: Mensaje indicando que se aprobó la pensión, si no se produjo ninguna excepción.
function otorgar_pension(persona_consultada number, numero_resolucion varchar2, fecha_resolucion timestamp, comentarios varchar2) return varchar2 is
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
    --No tiene pension aprobada: No hay nada que hacer
    elsif (row_persona.numero_condicion_pension is null or row_persona.numero_condicion_pension <>2) then
        msg_string :='Persona no tiene pensión aprobada';
        raise_application_error(err_number, msg_string, true);
    --La pensión es otorgada sin validar, las validaciones se hicieron en los procesos anteriores
    else
        update persona 
        set    numero_condicion_pension = 5,
               fecha_otorgamiento_pen = trunc(current_timestamp),
               numero_resolucion_otor_pen=numero_resolucion,
               fecha_resolucion_otor_pen=fecha_resolucion
        where  id_persona = persona_consultada;
        mensaje:='Pensión Otorgada';
    end if;
    return mensaje;
end;

