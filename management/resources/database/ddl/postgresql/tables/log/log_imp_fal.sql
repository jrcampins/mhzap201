--Esta tabla registra la importación de fallecidos
--Antes de ejecutar el procedimiento se crea una tabla de rastro que permitira 
--auditar la importación
create table log_imp_fal(
            id_log_imp_fal serial,
            cedula character varying (15),
            primer_nombre character varying (300),
            segundo_nombre character varying (50),
            primer_apellido character varying (300),
            segundo_apellido character varying (50),
            apellido_casada character varying(50),
            fecha_defuncion character varying(15),
            importado integer,
            observacion character varying,
            fecha_transaccion timestamp with time zone,
            nombre_archivo character varying,
            codigo_archivo character varying,
            constraint pk_log_imp_fal primary key (id_log_imp_fal)
);
