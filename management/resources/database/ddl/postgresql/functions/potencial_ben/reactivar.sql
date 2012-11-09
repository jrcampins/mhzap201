--
--Este procedimiento reactiva un potencial beneficiario
--@param rastro: Identificador del proceso ejecutado.
--@param beneficiario: Id del potencial beneficiario sobre el que se ejecuta el proceso.
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function potencial_ben_reactivar(rastro bigint, beneficiario bigint) returns integer as $$
declare
    mensaje varchar:='';
begin
    select potencial_ben_reactivar(beneficiario) into mensaje;
    return  rastro_proceso_update(rastro, 21, null, mensaje);
end;
$$ language plpgsql;
--
--Este procedimiento reactiva un potencial beneficiario
--@param beneficiario: Id del potencial beneficiario sobre el que se ejecuta el proceso
--@return: mensaje indicando si se pudo reactivar .
--
create or replace function potencial_ben_reactivar(beneficiario bigint) returns varchar as $$
declare
    mensaje varchar:='';
    row_potencial_ben potencial_ben;
    row_ficha_persona ficha_persona;
begin
    select * 
    into row_potencial_ben
    from potencial_ben
    where id_potencial_ben=beneficiario;
    if not found then
        raise exception 'Potencial Beneficiario No encontrado (%)',beneficiario;
    end if;
    --Solo se puede reactivar un potencial_ben inactivo
    if row_potencial_ben.es_potencial_ben_inactivo=0 then
        raise exception 'Potencial Beneficiario ya fue reactivado (%)',ficha;
    end if;
    --Se determina la ficha_persona que apunta al Potencial_ben
    select * 
    into row_ficha_persona
    from ficha_persona
    where id_ficha_persona=row_potencial_ben.id_ficha_persona;
    --Si se consigue se elimina el vinculo.
    if found then
        if row_ficha_persona.es_ficha_persona_inactiva=1 then
            --Se reactiva para modificar
            update ficha_persona
            set es_ficha_persona_inactiva=0,
            id_potencial_ben=beneficiario
            where id_ficha_persona=row_ficha_persona.id_ficha_persona;
            --Se vuelve a reactivar
            update ficha_persona
            set es_ficha_persona_inactiva=1
            where id_ficha_persona=row_ficha_persona.id_ficha_persona;
        else
            --No hace falta reactivar para modificar
            update ficha_persona
            set id_potencial_ben=beneficiario
            where id_ficha_persona=row_ficha_persona.id_ficha_persona;
        end if;
    end if;
    --Se reactiva el potencial_ben
    update potencial_ben
    set es_potencial_ben_inactivo=0
    where id_potencial_ben=beneficiario;
    mensaje:='Se reactivó el Potencial Beneficiario: '||row_potencial_ben.codigo_potencial_ben;
    return mensaje;
end;
$$ language plpgsql;