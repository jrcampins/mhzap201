--Esta tabla registra la importación de deudores
--Antes de ejecutar el procedimiento se crea una tabla de rastro que permitira 
--auditar la importación
create table log_imp_deu( 
    id_log_imp_deu number,
    cedula varchar2(15),
    primer_nombre varchar2(300),
    segundo_nombre varchar2(50),
    primer_apellido varchar2(300),
    segundo_apellido varchar2(50),
    apellido_casada varchar2(50),
    importado number,
    observacion varchar2(2000),
    fecha_transaccion timestamp with time zone,
    nombre_archivo varchar2(500),
    codigo_archivo varchar2(15),
    constraint pk_log_imp_deu primary key (id_log_imp_deu)
);

