--Esta tabla registra la importación de potenciales beneficiarios
--Antes de ejecutar el procedimiento se crea una tabla de rastro que permitira 
--auditar la importación
create table log_imp_pot(
                id_log_imp_pot number,
                departamento varchar2(50),
                distrito varchar2(50),
                nombres_apellidos varchar2 (100),
                apodo varchar2 (50),
                edad varchar2 (4),
                fecha_nacimiento varchar2 (15),
                numero_cedula varchar2 (15),
                numero_telefono varchar2 (50),
                direccion varchar2(2000),
                referencia varchar2(2000),
                barrio varchar2(50),
                nombre_referente varchar2(200),
                numero_telefono_referente varchar2 (50),
                importado number,
                observacion varchar2(2000),
                fecha_transaccion timestamp with time zone,
                nombre_archivo varchar2(2000),
                codigo_archivo varchar2(2000),
                constraint pk_log_imp_pot  primary key (id_log_imp_pot)
                );
