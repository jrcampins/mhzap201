--
-- Este procedimiento calcula el icv de una ficha hogar, explorando las fichas persona asociadas
-- y determinando el valor de las 28 variables que luego son sumadas para calcular el icv.
-- @param id_ficha_hogar: La ficha hogar a la que se le calculará el icv
-- @returns el valor del icv 
--
function calcular_icv (id_ficha number) return varchar2 is
    row_ficha_hogar ficha_hogar%ROWTYPE;
    row_ficha_persona ficha_persona%rowtype;
    puntajes array_number;
    ponderaciones array_number;
    icv number:=0;
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000); -- a character string of at most 2048 bytes
begin
    begin
        select * into row_ficha_hogar from ficha_hogar where id_ficha_hogar=id_ficha;
    exception
        when no_data_found then null;
    end;
    if not sql%found then
        msg_string := 'Ficha Hogar no encontrada';
        raise_application_error(err_number, msg_string, true);
    end if;
    puntajes:=array_number();
    ponderaciones:=array_number();
    --Solo se calcula el icv para pensiones no aprobadas
    --El calculo de icv en area urbana tiene distintas ponderaciones
    if row_ficha_hogar.numero_tipo_area=1 then
    --
       calcular_icv_area_urbana(row_ficha_hogar,icv,puntajes,ponderaciones); 
    --El calculo de icv en area rural tiene otras ponderaciones
    else
    --
       calcular_icv_area_rural(row_ficha_hogar,icv,puntajes,ponderaciones);
    end if;
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
    for row_ficha_persona in (select * from ficha_persona where id_ficha_hogar=id_ficha) loop
        update persona
        set indice_calidad_vida=icv
        where id_ficha_persona=row_ficha_persona.id_ficha_persona;
    end loop;
    return icv;
end;