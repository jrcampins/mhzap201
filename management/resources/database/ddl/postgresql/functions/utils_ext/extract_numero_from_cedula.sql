CREATE OR REPLACE FUNCTION extract_numero_from_cedula(ced varchar) RETURNS integer AS $$
declare
    num_cedula integer:=null;
    cedula varchar:='';
begin
    cedula:=ced;
    if cedula is not null then
        num_cedula:=cast_varchar_as_integer(btrim(cedula,'abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_. '));
    end if;
return num_cedula;
end;
$$ LANGUAGE 'plpgsql';