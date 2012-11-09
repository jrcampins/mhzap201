--
--Este procedimiento desactiva un potencial beneficiario
--@param rastro: Identificador del proceso ejecutado.
--@param beneficiario: Id del potencial beneficiario sobre el que se ejecuta el proceso.
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function potencial_ben_desactivar(rastro bigint, beneficiario bigint) returns integer as $$
declare
    mensaje varchar:='';
begin
    select potencial_ben_desactivar(beneficiario) into mensaje;
    return  rastro_proceso_update(rastro, 21, null, mensaje);
end;
$$ language plpgsql;
--
--Este procedimiento desactiva un potencial beneficiario, eliminando el vinculo entre la ficha_persona correspondiente
--@param beneficiario: Id del potencial beneficiario sobre el que se ejecuta el proceso
--@return: mensaje indicando si se pudo desactivar .
--
create or replace function potencial_ben_desactivar(beneficiario bigint) returns varchar as $$
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
    --Solo se puede desactivar un potencial beneficiario inactivo
    if row_potencial_ben.es_potencial_ben_inactivo=1 then
        raise exception 'Potencial Beneficiario ya fue desactivado (%)',ficha;
    end if;
    --Se determina la ficha_persona que apunta al Potencial_ben
    select * 
    into row_ficha_persona
    from ficha_persona
    where id_potencial_ben=beneficiario;
    --Si se consigue se elimina el vinculo.
    if found then
        if row_ficha_persona.es_ficha_persona_inactiva=1 then
            --Se reactiva para modificar
            update ficha_persona
            set es_ficha_persona_inactiva=0,
            id_potencial_ben=null
            where id_ficha_persona=row_ficha_persona.id_ficha_persona;
            --Se vuelve a desactivar
            update ficha_persona
            set es_ficha_persona_inactiva=1
            where id_ficha_persona=row_ficha_persona.id_ficha_persona;
        else
            --No hace falta reactivar para modificar
            update ficha_persona
            set id_potencial_ben=null
            where id_ficha_persona=row_ficha_persona.id_ficha_persona;
        end if;
    end if;
    --Se desactiva el potencial_ben
    update potencial_ben
    set es_potencial_ben_inactivo=1
    where id_potencial_ben=beneficiario;
    mensaje:='Se desactivó el Potencial Beneficiario: '||row_potencial_ben.codigo_potencial_ben;
    return mensaje;
end;
$$ language plpgsql;