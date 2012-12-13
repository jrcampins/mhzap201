--Esta tabla registra el proceso de verificar los elegibles para pension
--Antes de ejecutar el procedimiento se crea una tabla de rastro que permitira 
--auditar la importación
create table log_pro_ver_ele_pen(
                id_log_pro_ver_ele_pen number,
                id_persona number,
                codigo_persona varchar2(2000),
                nombre_persona varchar2(2000),
                id_departamento number,
                id_distrito number,
                id_barrio number,
                indice_calidad_vida number,
                numero_condicion_pension number,
                numero_condicion_denu_pen number,
                numero_condicion_reco_pen number,
                procesado number,
                observacion varchar2(2000),
                fecha_transaccion timestamp,
                constraint pk_log_pro_ver_ele_pen primary key (id_log_pro_ver_ele_pen)
                );
