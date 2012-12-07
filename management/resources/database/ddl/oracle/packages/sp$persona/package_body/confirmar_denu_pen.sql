--
--Descripción: Este procedimiento permite confirmar una denuncia de una pensión ya aprobada, en caso de confirmarla revoca la pensión ya aprobada
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@param numero_causa: Número de causa por la que se revoca la pensión
--@param otra_causa: En caso de que la causa sea otra, se especifica
--@param comentarios: Comentarios de la confirmación de denuncia
--@return: Mensaje indicando que se confirmó la denuncia, si no se produjo ninguna excepcion.
--
function confirmar_denu_pen(persona_consultada number, numero_causa number, otra_causa varchar2, comentarios varchar2) return varchar2 is
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
    --Solamente se pueden confirmar denuncias registradas
    elsif row_persona.numero_condicion_denu_pen<>1 then
        msg_string := 'Persona no tiene denuncia registrada';
        raise_application_error(err_number, msg_string, true);
    else
        begin
            --Se determina el mensaje de confirmación de la denuncia
            select crp.codigo_causa_rev_pension into mensaje_den from causa_rev_pension crp where crp.numero_causa_rev_pension=numero_causa;
        exception
            when no_data_found then null;
        end;
        if not sql%found then
            msg_string := 'Causa de denegación inválida';
            raise_application_error(err_number, msg_string, true);
        else
            --Se confirma la denuncia y se revoca la pension
            update persona 
            set    numero_condicion_pension =4,
               numero_causa_rev_pension=numero_causa,
               otra_causa_rev_pension=otra_causa,
               fecha_revocacion_pension = CURRENT_TIMESTAMP,
               comentarios_revocacion_pension='Pensión revocada por denuncia',
               numero_condicion_denu_pen = 2,
               fecha_confirmacion_denu_pen  = CURRENT_TIMESTAMP,
               comentarios_conf_denu_pen= comentarios
            where  id_persona = persona_consultada;
            mensaje:='Denuncia Confirmada, Pensión Revocada: '||mensaje_den ;
        end if;
    end if;
    return mensaje;
end;