-- Este procedimiento calcula el icv de una ficha hogar, explorando las fichas persona asociadas
-- y determinando el valor de las 28 variables que luego son sumadas para calcular el icv.
-- @param id_ficha_hogar: La ficha hogar a la que se le calculará el icv
-- @returns el valor del icv 
create or replace function ficha_hogar_calcular_icv_track (id_ficha bigint) returns record as $$
declare
    row_ficha_hogar ficha_hogar%ROWTYPE;
    puntajes integer[28];
    ponderaciones real[28];
    icv real:=0;
    resultado record;
begin
    select * 
    into row_ficha_hogar
    from ficha_hogar f where f.id_ficha_hogar=id_ficha;
    if row_ficha_hogar.numero_tipo_area=1 then
       select * from  calcular_icv_area_urbana(row_ficha_hogar) into resultado; 
    else
       select * from calcular_icv_area_rural(row_ficha_hogar) into resultado;
    end if;
    return resultado;
end;
$$ language plpgsql;