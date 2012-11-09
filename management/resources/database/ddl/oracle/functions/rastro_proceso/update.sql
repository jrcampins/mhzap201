create or replace function rastro_proceso_update(id number, condicion number, archivo varchar2, mensaje varchar2) return number is
    ts          timestamp := null;
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000); -- a character string of at most 2048 bytes
begin
    if (condicion > 12) then
        ts := CURRENT_TIMESTAMP;
    end if;
    /**/
    update  rastro_proceso
    set     fecha_hora_fin_ejecucion = ts,
            numero_condicion_eje_fun = condicion,
            nombre_archivo = cast(archivo as varchar2(200)),
            descripcion_error = cast(mensaje as varchar2(4000))
    where   id_rastro_proceso = id
    and     numero_condicion_eje_fun < condicion;
    /**/
    if not sql%found then
        msg_string := 'proceso ' || id || ' no existe o no se puede colocar en condicion ' || condicion;
        raise_application_error(err_number, msg_string, true);
    end if;
    /**/
    return 0;
end;
/
show errors
