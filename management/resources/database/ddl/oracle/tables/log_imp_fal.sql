--Esta tabla registra la importación de fallecidos
--Antes de ejecutar el procedimiento se crea una tabla de rastro que permitira 
--auditar la importación
create table log_imp_fal(
            id_log_imp_fal number,
            cedula varchar2 (15),
            primer_nombre varchar2 (300),
            segundo_nombre varchar2 (50),
            primer_apellido varchar2 (300),
            segundo_apellido varchar2 (50),
            apellido_casada varchar2(50),
            fecha_defuncion varchar2(15),
            importado number,
            observacion varchar2(2000),
            fecha_transaccion timestamp with time zone,
            nombre_archivo varchar2(2000),
            codigo_archivo varchar2(2000),
            constraint pk_log_imp_fal primary key (id_log_imp_fal)
);
