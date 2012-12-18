--Esta tabla registra la importaci�n de fallecidos
--Antes de ejecutar el procedimiento se crea una tabla de rastro que permitira 
--auditar la importaci�n
create table log_imp_fal(
            id_log_imp_fal number,
            cedula varchar2(255),
            primer_nombre varchar2(255),
            segundo_nombre varchar2(255),
            primer_apellido varchar2(255),
            segundo_apellido varchar2(255),
            apellido_casada varchar2(255),
            fecha_defuncion varchar2(255),
            importado number,
            observacion varchar2(2000),
            fecha_transaccion timestamp with time zone,
            nombre_archivo varchar2(2000),
            codigo_archivo varchar2(2000),
            constraint pk_log_imp_fal primary key (id_log_imp_fal)
);
