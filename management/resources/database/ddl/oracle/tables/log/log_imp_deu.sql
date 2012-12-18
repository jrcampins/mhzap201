--Esta tabla registra la importaci�n de deudores
--Antes de ejecutar el procedimiento se crea una tabla de rastro que permitira 
--auditar la importaci�n
create table log_imp_deu( 
    id_log_imp_deu number,
    cedula varchar2(255),
    primer_nombre varchar2(255),
    segundo_nombre varchar2(255),
    primer_apellido varchar2(255),
    segundo_apellido varchar2(255),
    apellido_casada varchar2(255),
    importado number,
    observacion varchar2(2000),
    fecha_transaccion timestamp with time zone,
    nombre_archivo varchar2(2000),
    codigo_archivo varchar2(2000),
    constraint pk_log_imp_deu primary key (id_log_imp_deu)
);

