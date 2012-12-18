--Esta tabla registra el proceso de acreditar potenciales beneficiarios
--Antes de ejecutar el procedimiento se crea una tabla de rastro que permitira 
--auditar la importación
create table log_pro_acr_pot_ben(
                id_log_pro_acr_pot_ben number,
                id_potencial_ben number,
                nombre_potencial_ben  varchar2(2000),
                codigo_potencial_ben  varchar2(2000),
                fecha_registro_pot_ben timestamp,
                id_persona number,
                nombre_persona   varchar2(2000),
                codigo_persona  varchar2(2000),
                id_distrito number,
                id_departamento number,
                id_barrio number,
                id_ficha_persona number,
                codigo_ficha_persona  varchar2(2000),
                nombre_ficha_persona  varchar2(2000),
                id_ficha_hogar number,
                codigo_ficha_hogar  varchar2(2000),
                indice_calidad_vida number,
                procesado number,
                observacion  varchar2(2000),
                fecha_transaccion timestamp,
                constraint pk_log_pro_acr_pot_ben primary key (id_log_pro_acr_pot_ben)
                );
