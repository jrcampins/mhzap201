--Esta tabla registra el proceso de acreditar potenciales beneficiarios
--Antes de ejecutar el procedimiento se crea una tabla de rastro que permitira 
--auditar la importación
create table log_pro_acr_pot_ben(
                id_log_pro_acr_pot_ben bigint,
                id_potencial_ben bigint,
                nombre_potencial_ben varchar,
                codigo_potencial_ben varchar,
                fecha_registro_pot_ben timestamp,
                id_persona bigint,
                nombre_persona varchar,
                codigo_persona varchar,
                id_distrito bigint,
                id_departamento bigint,
                id_barrio bigint,
                id_ficha_persona bigint,
                codigo_ficha_persona varchar,
                nombre_ficha_persona varchar,
                id_ficha_hogar bigint,
                codigo_ficha_hogar varchar,
                indice_calidad_vida numeric(7,4),
                procesado integer,
                observacion character varying,
                fecha_transaccion timestamp with time zone,
                constraint pk_log_pro_acr_pot_ben primary key (id_log_pro_acr_pot_ben)
                );
