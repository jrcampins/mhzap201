create or replace function extract_estado_civil(str1 varchar) returns integer as $$
declare
    valor integer:= null;
    retorno integer:=null;
begin
    valor:=cast_varchar_as_integer(str1);
    if valor>=1 and valor<=6 then
        --1 Y 6 = 1   SOLTERO
        if valor=1 or valor=6 then
            retorno:=1;
        --2 = 2 CASADO
        elsif valor= 2 then
            retorno:=2;
        --3 = NULL NO DEFINIDO
        elsif valor= 3 then
            retorno:=null;
        --4 = 4 DIVORCIADO
        elsif valor= 4 then
            retorno:=4;
        --5 = 3 VIUDO
        elsif valor= 5 then
            retorno:=3;
        end if;
    else
        return null;
    end if;
return retorno;
exception
	when others then
		return null;
end;
$$ language'plpgsql';