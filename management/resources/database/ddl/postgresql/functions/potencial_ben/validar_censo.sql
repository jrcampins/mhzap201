--
--Este procedimiento valida el icv de un potencial beneficiario
--@param rastro: Identificador del proceso ejecutado.
--@param beneficiario: Id del potencial beneficiario a validar
--@param funcionario: Id del funcionario responsable de la validación
--@param comentarios: Comentarios de validación del icv
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function potencial_ben_validar_censo(rastro bigint, beneficiario bigint, funcionario bigint, comentarios varchar) returns integer as $$
declare
    mensaje varchar:='';
begin
    select potencial_ben_validar_censo(beneficiario,funcionario,comentarios) into mensaje;
    return rastro_proceso_update(rastro, 21, null, mensaje);
end;
$$ language plpgsql;
--
--Este procedimiento valida el valor de icv de un potencial beneficiario. 
--El valor se valida cuando un censo proviene de otra fuente diferente a la DGEEC
--@param beneficiario: Id del potencial beneficiario a validar
--@param funcionario: Id del funcionario responsable de la validación
--@param comentarios: Comentarios de validación del icv
--@return: mensaje indicando la condición de ejecución del proceso.
--
create or replace function potencial_ben_validar_censo(beneficiario bigint, funcionario bigint, comentarios varchar) returns varchar as $$
declare
    mensaje varchar:='';
    row_potencial_ben potencial_ben;
    row_persona persona;
begin
    select * 
    into row_potencial_ben 
    from potencial_ben 
    where id_potencial_ben=beneficiario;
    if not found then
        raise exception 'Potencial Beneficiario no existe (id=%)', beneficiario;
    end if;
    --El potencial beneficiario debe tener numero_condicion_censo=censado no validado (2)
    if row_potencial_ben.numero_condicion_censo<>2 then
        raise exception 'Potencial Beneficiario no tiene Censo a Validar';
    --Se actualiza el numero de condicion de censo del potencial beneficiario
    else
        update potencial_ben 
        set numero_condicion_censo=3,
            fecha_validacion_censo=current_timestamp,
            id_funcionario_validacion_cen=funcionario,
            comentarios_validacion_censo=comentarios
        where id_potencial_ben=beneficiario;
        mensaje:='Censo de Potencial Beneficiario Validado con éxito';
    end if;
    return mensaje;
end;
$$ language plpgsql;