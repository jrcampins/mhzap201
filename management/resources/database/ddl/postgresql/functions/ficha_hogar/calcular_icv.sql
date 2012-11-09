-- 
-- Este procedimiento calcula el icv de una ficha hogar
-- @param rastro: Identificador del proceso ejecutado.
-- @param id_ficha_hogar: La ficha hogar a la que se le calculará el icv
-- @returns el valor del icv 
--
create or replace function ficha_hogar_calcular_icv(rastro bigint, ficha_hogar bigint)returns integer as $$
declare
    mensaje varchar:='';
begin
    select ficha_hogar_calcular_icv(ficha_hogar) into mensaje;       
    return rastro_proceso_update(rastro, 21, null, mensaje);        
end;
$$ language plpgsql;
--
-- Este procedimiento calcula el icv de una ficha hogar, explorando las fichas persona asociadas
-- y determinando el valor de las 28 variables que luego son sumadas para calcular el icv.
-- @param id_ficha_hogar: La ficha hogar a la que se le calculará el icv
-- @returns el valor del icv 
--
create or replace function ficha_hogar_calcular_icv (id_ficha bigint) returns varchar as $$
declare
    row_ficha_hogar ficha_hogar%ROWTYPE;
    row_ficha_persona ficha_persona;
    puntajes integer[28];
    ponderaciones real[28];
    icv real:=0;
    resultado record;
begin
    select * 
    into row_ficha_hogar
    from ficha_hogar f where f.id_ficha_hogar=id_ficha;
    --Solo se calcula icv para fichas activas
    if row_ficha_hogar.es_ficha_hogar_inactiva=1 then
        raise exception 'Ficha Hogar Inactiva. No se puede calcular ICV';
    end if;
    --Solo se calcula el icv para pensiones no aprobadas
    --El calculo de icv en area urbana tiene distintas ponderaciones
    if row_ficha_hogar.numero_tipo_area=1 then
       resultado:=calcular_icv_area_urbana(row_ficha_hogar); 
    --El calculo de icv en area rural tiene otras ponderaciones
    else
       resultado:=calcular_icv_area_rural(row_ficha_hogar);
    end if;
    --La variable resultado almacena los valores de cada variable y el icv
    icv:=resultado.icv;
    --Se actualiza la ficha hogar con el icv y se inactiva para no ser modificado ese valor
    update ficha_hogar 
    set indice_calidad_vida=icv,
    es_ficha_hogar_inactiva=1
    where id_ficha_hogar=id_ficha;
    --Se inactivan las ficha de personas asociadas
    update ficha_persona
    set es_ficha_persona_inactiva=1
    where id_ficha_hogar=id_ficha;
    --Se actualiz el icv de las personas asociadas
    for row_ficha_persona in select * from ficha_persona where id_ficha_hogar=id_ficha loop
        update persona
        set indice_calidad_vida=icv
        where id_ficha_persona=row_ficha_persona.id_ficha_persona;
    end loop;
    return icv;
end;
$$ language plpgsql;