create or replace function extract_estado_salud(str varchar) returns integer as $$
declare
    --Se retorna 99 si no responde
    estado_salud integer:= 6;
begin
    if str is not null then
        estado_salud:=cast_varchar_as_integer(str);
        if estado_salud>=1 and estado_salud<=3 then
            return estado_salud;
        else
            return 6;
        end if;
    end if;
return estado_salud;
end;
$$ language'plpgsql';