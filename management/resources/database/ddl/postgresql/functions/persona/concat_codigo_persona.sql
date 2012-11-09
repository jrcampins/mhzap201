create or replace function persona_concat_codigo_persona (row_persona persona) returns varchar as $$
declare
    codigo varchar;
begin
    if (row_persona.numero_cedula is null) then
        codigo = 'X' || cast(row_persona.id_persona as varchar);
    else
        codigo =concat_or_empty(btrim(row_persona.letra_cedula),'-') || cast(row_persona.numero_cedula as varchar) ;
    end if;
    return cast(codigo as varchar(30));
end;
$$ language 'plpgsql' volatile called on null input security invoker;
