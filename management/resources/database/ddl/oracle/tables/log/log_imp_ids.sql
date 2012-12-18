--Esta tabla registra la importación de identificaciones
--Antes de ejecutar el procedimiento se crea una tabla de rastro que permitira 
--auditar la importación
create  table log_imp_ids(
                id_log_imp_ids number,
                cedula varchar2(255),
                letra_cedula varchar2(255),
                apellidos varchar2(255),
                nombres varchar2(255),
                fecha_nacimiento varchar2(255),
                sexo varchar2(255),
                nacionalidad varchar2(255),
                estado_civil varchar2(255),
                lugar_nacimiento varchar2(255),
                es_indigena varchar2(255),
                importado number,
                observacion varchar2(2000),
                fecha_transaccion timestamp with time zone,
                nombre_archivo varchar2(2000),
                codigo_archivo varchar2(2000),
                constraint pk_log_imp_ids  primary key (id_log_imp_ids)
                );
