create or replace trigger rastro_proceso_before_update
before update on rastro_proceso
for each row
declare
    suma_vieja number;
    suma_nueva number;
begin
    if (:old.subprocesos = :new.subprocesos and :new.subprocesos > 0 
    and :old.numero_condicion_eje_fun = :new.numero_condicion_eje_fun and :new.numero_condicion_eje_fun = 12) then
        suma_vieja := :old.subprocesos_sin_errores + :old.subprocesos_con_errores + :old.subprocesos_cancelados;
        suma_nueva := :new.subprocesos_sin_errores + :new.subprocesos_con_errores + :new.subprocesos_cancelados;
        if (suma_vieja < suma_nueva and suma_nueva = :new.subprocesos) then
            :new.fecha_hora_fin_ejecucion := CURRENT_TIMESTAMP;
            :new.descripcion_error := 'ejecucion del proceso ' || :new.id_rastro_proceso || ' finalizada';
            if (:new.subprocesos_cancelados > 0) then
                :new.numero_condicion_eje_fun := 23;
            elsif (:new.subprocesos_con_errores > 0) then
                :new.numero_condicion_eje_fun := 22;
            else
                :new.numero_condicion_eje_fun := 21;
            end if;
        end if;
    end if;
end;
/
show errors
