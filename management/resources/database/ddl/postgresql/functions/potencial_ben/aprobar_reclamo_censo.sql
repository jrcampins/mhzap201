--
--Descripción: Este procedimiento permite aprobar un reclamo relacionado con un censo
--@param rastro: Identificador del proceso ejecutado.
--@param beneficiario_consultado: id del potencial beneficiario sobre el que se ejecutara la funcion
--@param comentarios: Comentarios de la aprobacion
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function potencial_ben_aprobar_recl_cen(rastro bigint, beneficiario_consultado bigint, comentarios varchar) returns integer as $$
declare
    mensaje varchar:='';
begin
    select potencial_ben_aprobar_recl_cen(beneficiario_consultado,comentarios) into mensaje;
    return rastro_proceso_update(rastro, 21, null, mensaje);
end;
$$ language plpgsql;
--
--Descripción: Este procedimiento permite aprobar un reclamo de censo, cuando se aprueba un reclamo, la condicion de censo del potencial beneficiario pasa a censar
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@param comentarios: Comentarios de la aprobación
--@return: mensaje indicando resultado
--
create or replace function potencial_ben_aprobar_recl_cen(beneficiario_consultado bigint, comentarios varchar) returns varchar as $$
declare
    mensaje varchar:='';
    row_potencial_ben potencial_ben;
    row_persona persona;
begin
    select *
    into   row_potencial_ben
    from   potencial_ben as p
    where  p.id_potencial_ben= beneficiario_consultado;
    if not found then
        raise exception 'Potencial Beneficiario no existe (id=%)', beneficiario_consultado;
    end if;
    --Si no hay un reclamo solicitado no se procesa
    if row_potencial_ben.numero_condicion_recl_cen<>1 then
        raise exception'Persona no tiene Reclamo registrado';
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
$$ language plpgsql;