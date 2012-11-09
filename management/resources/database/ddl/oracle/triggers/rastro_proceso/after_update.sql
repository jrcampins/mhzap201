create or replace trigger rastro_proceso_after_update
after update on rastro_proceso
for each row
declare
    rutina      varchar2(200);
    argumento   varchar2(200);
    resultado   varchar2(4000);
begin
    if (:new.id_rastro_proceso_superior is null and :new.id_grupo_proceso is not null) then
        if (:old.numero_condicion_eje_fun < :new.numero_condicion_eje_fun) then
            update  grupo_proceso
            set     numero_condicion_eje_fun = :new.numero_condicion_eje_fun
            where   id_grupo_proceso = :new.id_grupo_proceso
            and     id_rastro_proceso = :new.id_rastro_proceso;			
        end if;
    elsif (:new.id_rastro_proceso_superior is not null) then
        if (:old.numero_condicion_eje_fun = 11 and :new.numero_condicion_eje_fun = 12) then
            update  rastro_proceso
            set     subprocesos_pendientes  = subprocesos_pendientes  - 1,
                    subprocesos_en_progreso = subprocesos_en_progreso + 1
            where   id_rastro_proceso = :new.id_rastro_proceso_superior;			
        elsif (:old.numero_condicion_eje_fun = 12 and :new.numero_condicion_eje_fun = 21) then
            update  rastro_proceso
            set     subprocesos_en_progreso = subprocesos_en_progreso - 1,
                    subprocesos_sin_errores = subprocesos_sin_errores + 1
            where   id_rastro_proceso = :new.id_rastro_proceso_superior;			
        elsif (:old.numero_condicion_eje_fun = 12 and :new.numero_condicion_eje_fun = 22) then
            update  rastro_proceso
            set     subprocesos_en_progreso = subprocesos_en_progreso - 1,
                    subprocesos_con_errores = subprocesos_con_errores + 1
            where   id_rastro_proceso = :new.id_rastro_proceso_superior;			
        elsif (:old.numero_condicion_eje_fun = 11 and :new.numero_condicion_eje_fun = 23) then
            update  rastro_proceso
            set     subprocesos_pendientes  = subprocesos_pendientes  - 1,
                    subprocesos_cancelados  = subprocesos_cancelados  + 1
            where   id_rastro_proceso = :new.id_rastro_proceso_superior;			
        elsif (:old.numero_condicion_eje_fun = 12 and :new.numero_condicion_eje_fun = 23) then
            update  rastro_proceso
            set     subprocesos_en_progreso = subprocesos_en_progreso - 1,
                    subprocesos_cancelados  = subprocesos_cancelados  + 1
            where   id_rastro_proceso = :new.id_rastro_proceso_superior;			
        end if;
    end if;
    if (:old.numero_condicion_eje_fun < :new.numero_condicion_eje_fun
    and :old.procedimiento_after_update is not null 
    and :new.procedimiento_after_update is not null
    and :new.procedimiento_after_update = :old.procedimiento_after_update) then
        rutina    := :new.procedimiento_after_update;
        argumento := :new.id_rastro_proceso||'';
        resultado := utils.execute_procedure(rutina, argumento);
    end if;
end;
/
show errors
