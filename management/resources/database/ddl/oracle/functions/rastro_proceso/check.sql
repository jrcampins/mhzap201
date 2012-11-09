create or replace function rastro_proceso_check(id number, condicion number) return number is
    retcode     number;
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000); -- a character string of at most 2048 bytes
    row_grupo_proceso grupo_proceso%rowtype;
    row_rastro_proceso rastro_proceso%rowtype;
begin
    begin
        select  *
        into    row_rastro_proceso
        from    rastro_proceso
        where   id_rastro_proceso = id;
    exception
        when no_data_found then
            msg_string := 'proceso ' || id || ' no existe';
            raise_application_error(err_number, msg_string, true);
    end;
    if (row_rastro_proceso.numero_condicion_eje_fun <> condicion) then
        msg_string := 'proceso ' || id;
        msg_string := msg_string || ' no se encuentra en condicion ' || condicion;
        msg_string := msg_string || ' sino en condicion ' || row_rastro_proceso.numero_condicion_eje_fun;
        raise_application_error(err_number, msg_string, true);
    elsif (row_rastro_proceso.id_rastro_proceso_superior is not null) then
        retcode := rastro_proceso_check(row_rastro_proceso.id_rastro_proceso_superior, 12);
    elsif (row_rastro_proceso.id_grupo_proceso is not null) then
        begin
            select  *
            into    row_grupo_proceso
            from    grupo_proceso
            where   id_grupo_proceso = row_rastro_proceso.id_grupo_proceso;
        exception
            when no_data_found then
                msg_string := 'grupo ' || row_rastro_proceso.id_grupo_proceso || ' no existe';
                raise_application_error(err_number, msg_string, true);
        end;
        if (row_grupo_proceso.id_rastro_proceso is null 
        or  row_grupo_proceso.id_rastro_proceso <> row_rastro_proceso.id_rastro_proceso) then
            msg_string := 'grupo '   || row_rastro_proceso.id_grupo_proceso;
            msg_string := msg_string || ' no esta ejecutando el proceso '|| row_rastro_proceso.id_rastro_proceso;
            raise_application_error(err_number, msg_string, true);
        elsif (row_grupo_proceso.numero_condicion_eje_fun is null or row_grupo_proceso.numero_condicion_eje_fun > 12) then
            msg_string := 'grupo '   || row_rastro_proceso.id_grupo_proceso;
            msg_string := msg_string || ' no esta ejecutando el proceso ' || row_rastro_proceso.id_rastro_proceso;
            raise_application_error(err_number, msg_string, true);
        else
            retcode := row_grupo_proceso.numero_condicion_eje_fun;
        end if;
    else
        retcode := condicion;
    end if;
    /**/
    return retcode;
end;
/
show errors
