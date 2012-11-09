create or replace function funcionario_concat_codigo_funcionario (row_funcionario funcionario) returns varchar as $$
declare
    codigo varchar;
begin
    if (row_funcionario.numero_cedula is null) then
        codigo = 'X' || cast(row_funcionario.id_funcionario as varchar);
    else
        codigo = cast(row_funcionario.numero_cedula as varchar) || concat_or_empty('-', btrim(row_funcionario.letra_cedula));
    end if;
    return cast(codigo as varchar(30));
end;
$$ language 'plpgsql' volatile called on null input security invoker;
