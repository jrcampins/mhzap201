--Esta tabla registra la importación de potenciales beneficiarios
--Antes de ejecutar el procedimiento se crea una tabla de rastro que permitira 
--auditar la importación
create table log_imp_pot(
                id_log_imp_pot number,
                departamento varchar2(255),
                distrito varchar2(255),
                nombres_apellidos varchar2(255),
                apodo varchar2(255),
                edad varchar2(255),
                fecha_nacimiento varchar2(255),
                numero_cedula varchar2(255),
                numero_telefono varchar2(255),
                direccion varchar2(255),
                referencia varchar2(255),
                barrio varchar2(255),
                nombre_referente varchar2(255),
                numero_telefono_referente varchar2(255),
                importado number,
                observacion varchar2(2000),
                fecha_transaccion timestamp with time zone,
                nombre_archivo varchar2(2000),
                codigo_archivo varchar2(2000),
                constraint pk_log_imp_pot  primary key (id_log_imp_pot)
                );
