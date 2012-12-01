--Esta tabla registra la importación de deudores
--Antes de ejecutar el procedimiento se crea una tabla de rastro que permitira 
--auditar la importación
create table log_imp_deu( 
    id_log_imp_deu serial,
    cedula character varying (15),
    primer_nombre character varying (300),
    segundo_nombre character varying (50),
    primer_apellido character varying (300),
    segundo_apellido character varying (50),
    apellido_casada character varying(50),
    importado integer,
    observacion character varying,
    fecha_transaccion timestamp with time zone,
    nombre_archivo character varying,
    codigo_archivo character varying,
    constraint pk_log_imp_deu primary key (id_log_imp_deu)
);
