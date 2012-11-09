create or replace function extract_telefono(str1 varchar,str2 varchar) returns varchar as $$
declare
    numero_celular varchar:= null;
begin
    if str1='1' and str2 is not null then
        numero_celular:=str2;
        return numero_celular;
    elsif str1='1' and str2 is null then
        numero_celular:='?';
        return numero_celular;
    else
        return null;
    end if;
return numero_celular;
end;
$$ language'plpgsql';