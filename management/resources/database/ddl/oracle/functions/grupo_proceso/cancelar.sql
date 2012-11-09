create or replace function grupo_proceso_cancelar(rastro number, g number) return number is
    retcode number;
begin
    retcode := sp$grupo_proceso.do_unlock(g);
    retcode := rastro_proceso_update(rastro, 21, null, 'la ejecución del proceso ha sido cancelada');
    return 0;
end;
/
show errors
