--
--Este procedimiento reactiva una ficha_hogar y sus fichas_persona
--@param rastro: Identificador del proceso ejecutado.
--@param ficha: Id de la ficha sobre la que se ejecuta el proceso.
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function ficha_hogar_reactivar(rastro bigint, ficha bigint) returns integer as $$
declare
    mensaje varchar:='';
begin
    select ficha_hogar_reactivar(ficha) into mensaje;
    return  rastro_proceso_update(rastro, 21, null, mensaje);
end;
$$ language plpgsql;
--
--Este procedimiento reactiva una ficha_hogar, para permitir cualquier modificacion posterior
--@param ficha: Id de la ficha sobre la que se ejecuta el proceso.
--@return: mensaje indicando si se pudo desactivar .
--
create or replace function ficha_hogar_reactivar(ficha bigint) returns varchar as $$
declare
    mensaje varchar:='';
    row_ficha_hogar ficha_hogar;
    row_ficha_persona ficha_persona;
    conta integer:=0;
begin
    select * 
    into row_ficha_hogar
    from ficha_hogar
    where id_ficha_hogar=ficha;
    if not found then
        raise exception 'Ficha Hogar no encontrada (%)',ficha;
    end if;
    --Solo se puede reactivar una ficha hogar inactiva
    if row_ficha_hogar.es_ficha_hogar_inactiva=0 then
        raise exception 'Ficha Hogar ya se encuentra activa (%)',ficha;
    end if;
    --Al reactivar la ficha_hogar, se reactivan las ficha_persona asociadas
    update ficha_persona
    set es_ficha_persona_inactiva=0,
    id_potencial_ben=null
    where id_ficha_hogar=ficha;
    --Se reactiva la ficha_hogar y se anula el icv
    update ficha_hogar
    set es_ficha_hogar_inactiva=0,
    indice_calidad_vida=null
    where id_ficha_hogar=ficha;
    --Se desvinculan las ficha_persona
    for row_ficha_persona in select * 
                             from ficha_persona 
                             where id_ficha_hogar=ficha loop
        --Se desvincula las ficha_persona de persona
        update persona
        set id_ficha_persona=null
        where id_ficha_persona=row_ficha_persona.id_ficha_persona ;        
        --Se reactiva las ficha_persona
        update ficha_persona
        set es_ficha_persona_inactiva=0
        where id_ficha_persona=row_ficha_persona.id_ficha_persona;
        --se cuentan las fichas inactivadas
        conta:=conta+1;  
    end loop;
    mensaje:='Se reactivó la ficha_hogar: '||row_ficha_hogar.codigo_ficha_hogar||'. Se desvincularon '||conta||' Personas';
    return mensaje;
end;
$$ language plpgsql;