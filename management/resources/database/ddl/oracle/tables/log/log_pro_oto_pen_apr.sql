--Esta tabla registra el proceso de otorgar pensiones aprobadas
--Antes de ejecutar el procedimiento se crea una tabla de rastro que permitira 
--auditar la importación
create table log_pro_oto_pen_apr(
                id_log_pro_oto_pen_apr number,
                id_persona number,
                codigo_persona varchar2(2000),
                nombre_persona varchar2(2000),
                id_departamento number,
                id_distrito number,
                id_barrio number,
                numero_condicion_pension number,
                procesado number,
                observacion varchar2(2000),
                fecha_transaccion timestamp,
                constraint pk_log_pro_oto_pen_apr primary key (id_log_pro_oto_pen_apr)
                );
