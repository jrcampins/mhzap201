--Esta tabla registra la importación de potenciales beneficiarios
--Antes de ejecutar el procedimiento se crea una tabla de rastro que permitira 
--auditar la importación
create table log_imp_pot(
                id_log_imp_pot serial,
                departamento character varying(50),
                distrito character varying(50),
                nombres_apellidos character varying (100),
                apodo character varying (50),
                edad character varying (4),
                fecha_nacimiento character varying (15),
                numero_cedula character varying (15),
                numero_telefono character varying (50),
                direccion character varying,
                referencia character varying,
                barrio character varying(50),
                nombre_referente character varying(200),
                numero_telefono_referente character varying (50),
                importado integer,
                observacion character varying,
                fecha_transaccion timestamp with time zone,
                nombre_archivo character varying,
                codigo_archivo character varying,
                constraint pk_log_imp_pot  primary key (id_log_imp_pot)
                );
