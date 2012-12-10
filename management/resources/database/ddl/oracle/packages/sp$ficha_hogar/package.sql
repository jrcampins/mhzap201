function concat_codigo(xrow ficha_hogar%rowtype) return varchar2;
function desactivar(ficha number) return varchar2;
function reactivar(ficha number) return varchar2;
TYPE array_number IS VARRAY(29) OF NUMBER;
procedure calcular_icv_area_rural (row_ficha_hogar ficha_hogar%rowtype, icv out number, puntajes out array_number, ponderaciones out array_number);
procedure calcular_icv_area_urbana (row_ficha_hogar ficha_hogar%rowtype, icv out number, puntajes out array_number, ponderaciones out array_number);
function calcular_icv (id_ficha number) return varchar2;