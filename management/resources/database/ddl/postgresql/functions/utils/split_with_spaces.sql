CREATE OR REPLACE FUNCTION split_with_spaces(str varchar) RETURNS varchar[] AS $$
declare
    aux varchar[];
begin
    if str is null then
        return null;
    end if;
    str:=trim(both ' ' from str);
    aux:=regexp_split_to_array(str, E'\\s+');
return aux;
end;
$$ LANGUAGE 'plpgsql';