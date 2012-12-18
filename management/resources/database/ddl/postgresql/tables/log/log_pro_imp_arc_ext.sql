--Esta tabla registra el proceso de importar archivos externos
--Antes de ejecutar el procedimiento se crea una tabla de rastro que permitira 
--auditar la importación
create table log_pro_imp_arc_ext(
             id_log_pro_imp_arc_ext bigint,
             id_archivo_datos_ext bigint,
             codigo_tipo_arc_dat_ext varchar,
             numero_tipo_arc_dat_ext integer,
             nombre_proveedor_dat_ext varchar,
             codigo_proveedor_dat_ext integer,
             codigo_archivo_datos_ext varchar,
             ruta_archivo_datos_ext varchar,
             importado integer,
             observacion character varying,
             fecha_transaccion timestamp with time zone,
             constraint pk_log_pro_imp_arc_ext primary key (id_log_pro_imp_arc_ext)
);
