--Esta tabla registra la importación de identificaciones
--Antes de ejecutar el procedimiento se crea una tabla de rastro que permitira 
--auditar la importación
create  table log_imp_ids(
                id_log_imp_ids number,
                cedula varchar2 (15),
                letra_cedula varchar2 (2),
                apellidos varchar2 (100),
                nombres varchar2 (100),
                fecha_nacimiento varchar2 (15),
                sexo varchar2 (2),
                nacionalidad varchar2 (4),
                estado_civil varchar2 (2),
                lugar_nacimiento varchar2 (100),
                es_indigena varchar2 (2),
                importado number,
                observacion varchar2(2000),
                fecha_transaccion timestamp with time zone,
                nombre_archivo varchar2(2000),
                codigo_archivo varchar2(2000),
                constraint pk_log_imp_ids  primary key (id_log_imp_ids)
                );
