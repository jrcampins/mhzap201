--
--Descripción: Este procedimiento permite registrar un reclamo relacionado con un censo. Un reclamo puede deberse a: icv no corresponde, persona no censada, datos del censo erroneos
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@param comentarios: Comentarios de la solicitud
--@return: 0 si no se produjo ninguna excepcion.
--
function reg_recl_cen(beneficiario_consultado number, comentarios varchar2) return varchar2 is
    mensaje varchar2(2000);
    row_potencial_ben potencial_ben%rowtype;
    row_persona persona%rowtype;
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000); -- a character string of at most 2048 bytes
begin
    --Se recupera al potencial beneficiario
    begin
        select * into   row_potencial_ben from   potencial_ben where  id_potencial_ben = beneficiario_consultado;
    exception
        when no_data_found then null;
    end;
    --Si no se encuentra un registro, no se hace nada
    if not sql%found then
        msg_string:='Potencial beneficiario no existe';
        raise_application_error(err_number, msg_string, true);
    end if;
    --Los reclamos solo son pertinentes para: 
    --beneficiarios que no fueron acreditados, 
    --beneficiarios que no fueron validados y 
    --beneficiarios que no se les realizo el censo
    --Beneficiarios que no fueron acreditados (si persona asociada es acreditada no es pertinente)
    if row_potencial_ben.id_persona is not null then
        begin
            select * into row_persona from persona p where  p.id_persona = row_potencial_ben.id_persona;
        exception
            when no_data_found then null;
        end;
        if not sql%found then
            msg_string := 'Persona no existe (id='||row_potencial_ben.id_persona||')';
            raise_application_error(err_number, msg_string, true);
        elsif row_persona.es_persona_acreditada_para_pen=1 then
            msg_string:='Potencial Beneficiario ya fue censado y acreditado para pension';
            raise_application_error(err_number, msg_string, true);
        end if;
    end if;
    --Beneficiarios que no fueron validados (si condicion_censo=validado no es pertinente)
    if row_potencial_ben.numero_condicion_censo=3 then
        msg_string:='ICV del Potencial Beneficiario ya fue validado';
        raise_application_error(err_number, msg_string, true);
    end if;
    --Beneficiarios que no fueron censados (si condicion_censo=Censado no es pertinente)
    if row_potencial_ben.numero_condicion_censo=5 then
        msg_string:='Potencial Beneficiario ya fue censado';
        raise_application_error(err_number, msg_string, true);
    end if;
    --Solo se permite registrar un reclamo a la vez
    if row_potencial_ben.numero_condicion_recl_cen=1 then
        msg_string:='Persona ya tiene reclamo registrado';
        raise_application_error(err_number, msg_string, true);
    end if;
    --Se actualiza el estado del potencial beneficiario, registrando un reclamo para el censo
    update potencial_ben
    set    numero_condicion_recl_cen = 1,
           fecha_reclamo_censo = trunc(current_timestamp),
           comentarios_reclamo_censo =comentarios
    where  id_potencial_ben=beneficiario_consultado;
    mensaje:='Reclamo de Censo Registrado: '||row_potencial_ben.nombre_potencial_ben;
    return mensaje;
end;