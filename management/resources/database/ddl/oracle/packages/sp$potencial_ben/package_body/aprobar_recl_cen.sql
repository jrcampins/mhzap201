--
--Descripción: Este procedimiento permite aprobar un reclamo de censo, cuando se aprueba un reclamo, la condicion de censo del potencial beneficiario pasa a censar
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@param comentarios: Comentarios de la aprobación
--@return: mensaje indicando resultado
--
function aprobar_recl_cen(beneficiario_consultado number, comentarios varchar2) return varchar2 is
    mensaje varchar2(2000);
    row_potencial_ben potencial_ben%rowtype;
    row_persona persona%rowtype;
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000);
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
    --Si no hay un reclamo solicitado no se procesa
    if row_potencial_ben.numero_condicion_recl_cen<>1 then
        msg_string:='Persona no tiene Reclamo registrado';
        raise_application_error(err_number, msg_string, true);
    end if;
    --Se actualiza el estado del potencial beneficiario como a censar con reclamo aprobado
    update potencial_ben
    set    numero_condicion_censo=1,
           numero_condicion_recl_cen = 2,
           fecha_aprobacion_reclamo_censo  = CURRENT_TIMESTAMP,
           comentarios_apr_recl_cen =comentarios
    where  id_potencial_ben=beneficiario_consultado;
    mensaje:='Reclamo de Censo Aprobado';
    return mensaje;
end;