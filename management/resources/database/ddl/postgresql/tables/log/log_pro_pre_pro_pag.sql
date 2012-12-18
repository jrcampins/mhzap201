--Esta tabla registra el proceso de preparar el proximo pago
--Antes de ejecutar el procedimiento se crea una tabla de rastro que permitira 
--auditar la importación
create table log_pro_pre_pro_pag(
                id_log_pro_pre_pro_pag bigint,
                id_persona bigint,
                codigo_persona varchar,
                nombre_persona varchar,
                id_departamento bigint,
                id_distrito bigint,
                id_barrio bigint,
                numero_condicion_pension integer,
                fecha_solicitud_pension timestamp,
                numero_condicion_denu_pen integer,
                numero_condicion_reco_pen integer,
                procesado integer,
                observacion character varying,
                constraint pk_log_pro_pre_pro_pag primary key (id_log_pro_pre_pro_pag)
                );
