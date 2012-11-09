create or replace function rastro_funcion_par_insert
(
id number,
rastro number,
parametro number,
valor_parametro varchar2
)
return number is
begin
    insert into rastro_funcion_par
        (
        id_rastro_funcion_par,
        id_rastro_funcion,
        id_parametro,
        valor_parametro
        )
    values
        (
        id,
        rastro,
        parametro,
        cast(valor_parametro as varchar2(200))
        );
    /**/
    return 0;
end;
/
show errors
