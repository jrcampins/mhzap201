function do_unlock(g number) return number is
begin
    update  grupo_proceso
    set     id_rastro_proceso = null,
            numero_condicion_eje_fun = null
    where   id_grupo_proceso = g;
    /**/
    return  0;
end;
