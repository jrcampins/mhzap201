create or replace function rastro_proceso_check_update(id number) return number is
    retcode     number;
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000); -- a character string of at most 2048 bytes
begin
    retcode := rastro_proceso_check(id, 11);
    /**/
    update  rastro_proceso
    set     numero_condicion_eje_fun = 12,
            descripcion_error = 'ejecucion del proceso ' || id || ' en progreso'
    where   id_rastro_proceso = id
    and     numero_condicion_eje_fun = 11;
    /**/
    if not sql%found then
        msg_string := 'proceso ' || id || ' no existe o no se puede colocar en condicion "en progreso" (12)';
        raise_application_error(err_number, msg_string, true);
    end if;
    /**/
    return 0;
end;
/
show errors
