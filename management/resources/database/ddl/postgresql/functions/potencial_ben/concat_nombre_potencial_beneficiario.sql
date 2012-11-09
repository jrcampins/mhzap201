create or replace function potencial_ben_concat_nombre_potencial_ben (row_potencial_ben potencial_ben) returns varchar as $$
declare
    nombre varchar;
begin
    if(row_potencial_ben.primer_apellido is null 
       or row_potencial_ben.primer_nombre is null
       and row_potencial_ben.nombre_potencial_ben is not null) then
        nombre = row_potencial_ben.nombre_potencial_ben;
    else
    --El nombre se obtiene como el primer apellido, seguido del segundo apellido, seguido del apellido de casada, seguido del primer nombre, el segundo nombre y el apodo entre parentesis
        nombre = btrim(row_potencial_ben.primer_apellido)
        || concat_or_empty(' ',    btrim(row_potencial_ben.segundo_apellido))
        || concat_or_empty(' ', btrim(row_potencial_ben.apellido_casada))
        || ', ' || btrim(row_potencial_ben.primer_nombre)
        || concat_or_empty(' ',    btrim(row_potencial_ben.segundo_nombre))
        || concat_or_empty(' (',   btrim(row_potencial_ben.apodo), ')');
    end if;
    return cast(nombre as varchar);
end;
$$ language 'plpgsql' volatile called on null input security invoker;
