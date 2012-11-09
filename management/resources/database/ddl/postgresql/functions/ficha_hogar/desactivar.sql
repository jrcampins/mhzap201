--
--Este procedimiento desactiva una ficha_hogar y sus fichas_persona
--@param rastro: Identificador del proceso ejecutado.
--@param ficha: Id de la ficha sobre la que se ejecuta el proceso.
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function ficha_hogar_desactivar(rastro bigint, ficha bigint) returns integer as $$
declare
    mensaje varchar:='';
begin
    select ficha_persona_desactivar(ficha) into mensaje;
    return  rastro_proceso_update(rastro, 21, null, mensaje);
end;
$$ language plpgsql;
--
--Este procedimiento desactiva una ficha_hogar, para evitar cualquier modificacion posterior
--@param ficha: Id de la ficha sobre la que se ejecuta el proceso.
--@return: mensaje indicando si se pudo desactivar .
--
create or replace function ficha_persona_desactivar(ficha bigint) returns varchar as $$
declare
    mensaje varchar:='';
    row_ficha_hogar ficha_hogar;
begin
    select * 
    into row_ficha_hogar
    from ficha_hogar
    where id_ficha_hogar=ficha;
    if not found then
        raise exception 'Ficha Hogar no encontrada (%)',ficha;
    end if;
    --Solo se puede desactivar una ficha hogar activa
    if row_ficha_hogar.es_ficha_hogar_inactiva=1 then
        raise exception 'Ficha Hogar ya fue desactivada (%)',ficha;
    end if;
    --Al desactivar la ficha_hogar, se desactivan las ficha_persona asociadas
    update ficha_persona
    set es_ficha_persona_inactiva=1
    where id_ficha_hogar=ficha;
    --Se desactiva la ficha_hogar
    update ficha_hogar
    set es_ficha_hogar_inactiva=1
    where id_ficha_hogar=ficha;
    mensaje:='Se desactivó la ficha_hogar: '||row_ficha_hogar.codigo;
    return mensaje;
end;
$$ language plpgsql;