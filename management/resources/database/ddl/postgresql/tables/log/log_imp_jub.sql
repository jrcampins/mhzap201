--Esta tabla registra la importación de jubilados y pensionados
--Antes de ejecutar el procedimiento se crea una tabla de rastro que permitira 
--auditar la importación
create table log_imp_jub( 
             id_log_imp_jub serial,
             cedula character varying (15),
             primer_nombre character varying (300),
             segundo_nombre character varying (50),
             primer_apellido character varying (300),
             segundo_apellido character varying (50),
             apellido_casada character varying(50),
             tipo_registro character varying (50),
             importado integer,
             observacion character varying,
             fecha_transaccion timestamp with time zone,
             nombre_archivo character varying,
             codigo_archivo character varying,
             constraint pk_log_imp_jub primary key (id_log_imp_jub)
);
