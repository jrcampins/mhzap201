create or replace function ficha_persona_concat_nombre_ficha_persona (row_ficha_persona ficha_persona) returns varchar as $$
declare
    nombre varchar;
begin
    nombre = btrim(row_ficha_persona.primer_apellido)
        || concat_or_empty(' ',    btrim(row_ficha_persona.segundo_apellido))
        || concat_or_empty(' de ', btrim(row_ficha_persona.apellido_casada))
        || ', ' || btrim(row_ficha_persona.primer_nombre)
        || concat_or_empty(' ',    btrim(row_ficha_persona.segundo_nombre))
        || concat_or_empty(' (',   btrim(row_ficha_persona.apodo), ')');
    return cast(nombre as varchar(100));
end;
$$ language 'plpgsql' volatile called on null input security invoker;
