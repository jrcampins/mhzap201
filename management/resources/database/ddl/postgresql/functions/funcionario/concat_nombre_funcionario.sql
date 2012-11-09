create or replace function funcionario_concat_nombre_funcionario (row_funcionario funcionario) returns varchar as $$
declare
    nombre varchar;
begin
    nombre = btrim(row_funcionario.primer_apellido)
        || concat_or_empty(' ',    btrim(row_funcionario.segundo_apellido))
        || concat_or_empty(' de ', btrim(row_funcionario.apellido_casada))
        || ', ' || btrim(row_funcionario.primer_nombre)
        || concat_or_empty(' ',    btrim(row_funcionario.segundo_nombre));

    return cast(nombre as varchar(100));
end;
$$ language 'plpgsql' volatile called on null input security invoker;
