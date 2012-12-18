--Esta tabla registra la importación de identificaciones
--Antes de ejecutar el procedimiento se crea una tabla de rastro que permitira 
--auditar la importación
create  table log_imp_ids(
                id_log_imp_ids serial,
                cedula character varying (15),
                letra_cedula character varying (2),
                apellidos character varying (100),
                nombres character varying (100),
                fecha_nacimiento character varying (15),
                sexo character varying (2),
                nacionalidad character varying (4),
                estado_civil character varying (2),
                lugar_nacimiento character varying (100),
                es_indigena character varying (2),
                importado integer,
                observacion character varying,
                fecha_transaccion timestamp with time zone,
                nombre_archivo character varying,
                codigo_archivo character varying,
                constraint pk_log_imp_ids  primary key (id_log_imp_ids)
                );
