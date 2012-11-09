create or replace function funcionario_before_insert () returns trigger as $$
begin
    new.codigo_funcionario = funcionario_concat_codigo_funcionario(new);
    new.nombre_funcionario = funcionario_concat_nombre_funcionario(new);
    return new;
end;
$$ language 'plpgsql' volatile called on null input security invoker;
