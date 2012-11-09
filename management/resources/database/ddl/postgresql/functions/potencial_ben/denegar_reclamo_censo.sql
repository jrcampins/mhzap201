--
--Descripción: Este procedimiento deniega un reclamo de censo
--@param rastro: Identificador del proceso ejecutado.
--@param beneficiario_consultado: id del potencial beneficiario sobre el que se ejecutara la funcion
--@param numero_causa: numero de la causa de denegación
--@param otra_causa: descripcion de otra causa de denegación
--@param comentarios: Comentarios de la denegacion
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function potencial_ben_denegar_recl_cen(rastro bigint, beneficiario_consultado bigint, numero_causa integer, otra_causa varchar, comentarios varchar) returns integer as $$
declare
    mensaje varchar:='';
begin
    select potencial_ben_denegar_recl_cen(beneficiario_consultado, numero_causa, otra_causa, comentarios) into mensaje;
    return rastro_proceso_update(rastro, 21, null, mensaje);
end;
$$ language plpgsql;
--
--Descripción: Este procedimiento deniega una solicitud de reconsideración de pensión. Para ello registra los motivos indicados por el usuario
--@param rastro: Identificador del proceso ejecutado.
--@param beneficiario_consultado: id del potencial beneficiario sobre el que se ejecutara la funcion
--@param numero_causa: numero de la causa de denegación
--@param otra_causa: descripcion de otra causa de denegación
--@param comentarios: Comentarios de la denegacion
--@return: mensaje indicando resultado de la ejecucion del proceso.
--
create or replace function potencial_ben_denegar_recl_cen(beneficiario_consultado bigint, numero_causa integer, otra_causa varchar, comentarios varchar) returns varchar as $$
declare
    row_potencial_ben potencial_ben;
    mensaje varchar:='';
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
        raise exception'Persona no tiene reclamo registrado';
    end if;
    --Se actualiza el estado del potencial beneficiario como a censar con reclamo aprobado
    update potencial_ben
    set    numero_condicion_recl_cen = 3,
           numero_causa_den_recl_cen=numero_causa,
           otra_causa_den_recl_cen=otra_causa,
           fecha_denegacion_reclamo_censo  = CURRENT_TIMESTAMP,
           comentarios_den_recl_cen =comentarios
    where  id_potencial_ben=beneficiario_consultado;
    mensaje:='Reclamo de Censo Negado';
    return mensaje;
end;
$$ language plpgsql;