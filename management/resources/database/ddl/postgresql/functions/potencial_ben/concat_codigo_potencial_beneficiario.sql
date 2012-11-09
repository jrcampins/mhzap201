create or replace function potencial_ben_concat_codigo_potencial_ben (row_potencial_ben potencial_ben) returns varchar as $$
declare
    codigo varchar;
    id$ bigint;
begin
    --El codigo de potencial beneficiario sin cedula es una X precediendo su id
    if (row_potencial_ben.numero_cedula is null) then
        codigo = 'X' || cast(row_potencial_ben.id_potencial_ben as varchar);
    else
    --El codigo de potencial beneficiario con cedula es su numero de cedula seguido con un guion y su letra de cedula 
        codigo = cast(row_potencial_ben.numero_cedula as varchar) 
        || concat_or_empty('-',btrim(row_potencial_ben.letra_cedula));
        --Se verifica que el potencial beneficiario no exista
        select id_potencial_ben
        into   id$
        from   potencial_ben
        where  codigo_potencial_ben = codigo;
        /**/
        if found then
            if (row_potencial_ben.id_potencial_ben <> id$) then
                raise exception 'ya existe un registro de Potencial Beneficiario con cédula %', codigo;
            end if;
        end if;
    end if;
    return cast(codigo as varchar(30));
end;
$$ language 'plpgsql' volatile called on null input security invoker;
