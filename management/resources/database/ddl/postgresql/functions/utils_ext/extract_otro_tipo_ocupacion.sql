create or replace function extract_otro_tipo_ocupacion(str1 varchar,str2 varchar) returns varchar as $$
declare
    otro_tipo_ocupacion varchar:= null;
begin
    if str1='6' and str2 is not null then
        otro_tipo_ocupacion:=str2;
        return otro_tipo_ocupacion;
    elsif str1='6' and str2 is null then
        otro_tipo_ocupacion:='NO ESPECIFICADA';
        return otro_tipo_ocupacion;
    else
        return null;
    end if;
return otro_tipo_ocupacion;
end;
$$ language'plpgsql';