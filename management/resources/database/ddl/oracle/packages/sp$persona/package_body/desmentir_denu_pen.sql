--
--Descripción: Este procedimiento desmiente una denuncia asociada con una pensión aprobada
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@comentarios: Comentarios para desmentir la denuncia
--@return: 0 si no se produjo ninguna excepcion.
--
function desmentir_denu_pen(persona_consultada number, comentarios varchar2) return varchar2 is
    acreditacion number;
    requisitos_personales number;
    condicion_elegibilidad number;
    fecha_icv timestamp;
    fecha_reconsideracion timestamp;
    row_persona persona%rowtype;
    mensaje varchar2 (200):='';
    mensaje_den varchar2(200):='';
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
    --Solo se desmienten denuncias registradas
    elsif row_persona.numero_condicion_denu_pen<>1 then
        msg_string := 'Persona no tiene denuncia registrada';
        raise_application_error(err_number, msg_string, true);
    else
        --Se actualiza el estado de la denuncia a desmentida
        condicion_elegibilidad:=act_persona_elegible(persona_consultada);
        --Si la persona no es elegible se actualiza su estado
        if condicion_elegibilidad=0 then  
            update persona 
            set  numero_condicion_denu_pen = 3,
                 fecha_desmentido_denuncia_pen = CURRENT_TIMESTAMP,
                 comentarios_des_denu_pen=comentarios
            where  id_persona = persona_consultada;
            mensaje:='Denuncia Desmentida';
        else
            mensaje:='No se pudo desmentir la denuncia';
        end if;
    end if;
    return mensaje; 
end;
