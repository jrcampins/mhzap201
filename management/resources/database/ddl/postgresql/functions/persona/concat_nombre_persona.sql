create or replace function persona_concat_nombre_persona (row_persona persona) returns varchar as $$
declare
    nombre varchar;
begin
    if(row_persona.primer_nombre is null 
       or row_persona.primer_apellido is null) then
        nombre = row_persona.nombre_persona;
    else
        nombre = btrim(row_persona.primer_apellido)
                || concat_or_empty(' ',    btrim(row_persona.segundo_apellido))
                || concat_or_empty(' ', btrim(row_persona.apellido_casada))
                || ', ' || btrim(row_persona.primer_nombre)
                || concat_or_empty(' ',    btrim(row_persona.segundo_nombre))
                || concat_or_empty(' (',   btrim(row_persona.apodo), ')');
    end if;
    return cast(nombre as varchar(100));
end;
$$ language 'plpgsql' volatile called on null input security invoker;
