create or replace function get_id_departamento(departamento varchar) returns bigint as $$
declare
    id_departamento_retornar bigint:= 0;
begin
    if departamento is not null then
        select id_ubicacion into id_departamento_retornar from ubicacion where id_ubicacion_superior is null and nombre_ubicacion ilike departamento ;
        if not found then
            id_departamento_retornar:=0;
        end if;
    end if;
return id_departamento_retornar;
end;
$$ language'plpgsql';