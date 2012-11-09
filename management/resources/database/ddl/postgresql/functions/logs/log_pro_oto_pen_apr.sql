--Esta tabla registra el proceso de otorgar pensiones aprobadas
--Antes de ejecutar el procedimiento se crea una tabla de rastro que permitira 
--auditar la importación
create table log_pro_oto_pen_apr(
                id_log_pro_oto_pen_apr bigint,
                id_persona bigint,
                codigo_persona varchar,
                nombre_persona varchar,
                id_departamento bigint,
                id_distrito bigint,
                id_barrio bigint,
                numero_condicion_pension integer,
                procesado integer,
                observacion character varying,
                constraint pk_log_pro_oto_pen_apr primary key (id_log_pro_oto_pen_apr)
                );
