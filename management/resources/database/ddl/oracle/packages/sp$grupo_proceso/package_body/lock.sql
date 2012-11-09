function do_lock(rastro number, f number) return number is
    grupo       number;
    codigo      varchar2(200);
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000); -- a character string of at most 2048 bytes
begin
    begin
        select id_grupo_proceso into grupo from funcion where id_funcion = f;
    exception
        when no_data_found then
            msg_string := 'funcion ' || coalesce(f||'', '?') || ' no existe';
            raise_application_error(err_number, msg_string, true);
    end;
    if (grupo is not null) then
        begin
            select codigo_grupo_proceso into codigo from grupo_proceso where id_grupo_proceso = grupo;
        exception
            when no_data_found then
                msg_string := 'grupo ' || grupo || ' no existe';
                raise_application_error(err_number, msg_string, true);
        end;
        update grupo_proceso
        set id_rastro_proceso = rastro, numero_condicion_eje_fun = 11
        where id_grupo_proceso = grupo 
        and (numero_condicion_eje_fun is null or numero_condicion_eje_fun > 12);
        if not sql%found then
            msg_string := 'en este momento no se puede ejecutar otro proceso del grupo "' || codigo || '"';
            raise_application_error(err_number, msg_string, true);
        end if;
    end if;
    return grupo;
end;
