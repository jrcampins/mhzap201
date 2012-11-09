create or replace function ficha_persona_concat_codigo_ficha_persona (row_ficha_persona ficha_persona) returns varchar as $$
declare
    codigo varchar;
begin
    select codigo_ficha_hogar
    into   codigo
    from   ficha_hogar
    where  id_ficha_hogar = row_ficha_persona.id_ficha_hogar;
    /**/
    if not found then
        raise exception 'ficha hogar no existe (id=%)', row_ficha_persona.id_ficha_hogar;
    end if;
    /**/
    codigo = codigo || '-' || row_ficha_persona.numero_orden_identificacion;
    /**/
    return cast(codigo as varchar(30));
end;
$$ language 'plpgsql' volatile called on null input security invoker;
