--Esta tabla registra el proceso de verificar los elegibles para pension
--Antes de ejecutar el procedimiento se crea una tabla de rastro que permitira 
--auditar la importación
create table log_pro_ver_ele_pen(
                id_log_pro_ver_ele_pen bigint,
                id_persona bigint,
                codigo_persona varchar,
                nombre_persona varchar,
                id_departamento bigint,
                id_distrito bigint,
                id_barrio bigint,
                indice_calidad_vida numeric(7,4),
                numero_condicion_pension integer,
                numero_condicion_denu_pen integer,
                numero_condicion_reco_pen integer,
                procesado integer,
                observacion character varying,
                fecha_transaccion timestamp with time zone,
                constraint pk_log_pro_ver_ele_pen primary key (id_log_pro_ver_ele_pen)
                );
