--Esta tabla registra la importación de empleados
--Antes de ejecutar el procedimiento se crea una tabla de rastro que permitira 
--auditar la importación
create table log_imp_emp( 
             id_log_imp_emp number,
             cedula varchar2 (15),
             primer_nombre varchar2 (300),
             segundo_nombre varchar2 (50),
             primer_apellido varchar2 (300),
             segundo_apellido varchar2 (50),
             apellido_casada varchar2(50),
             importado number,
             observacion varchar2(2000),
             fecha_transaccion timestamp with time zone,
             nombre_archivo varchar2(2000),
             codigo_archivo varchar2(2000),
             constraint pk_log_imp_emp primary key (id_log_imp_emp)
);
