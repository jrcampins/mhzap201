--Esta tabla registra el proceso de preparar el proximo pago
--Antes de ejecutar el procedimiento se crea una tabla de rastro que permitira 
--auditar la importación
create table log_pro_pre_pro_pag(
                id_log_pro_pre_pro_pag number,
                id_persona number,
                codigo_persona varchar2(2000),
                nombre_persona varchar2(2000),
                id_departamento number,
                id_distrito number,
                id_barrio number,
                numero_condicion_pension number,
                fecha_solicitud_pension timestamp,
                numero_condicion_denu_pen number,
                numero_condicion_reco_pen number,
                procesado number,
                observacion varchar2(2000),
                fecha_transaccion timestamp,
                constraint pk_log_pro_pre_pro_pag primary key (id_log_pro_pre_pro_pag)
                );
