create or replace function rastro_informe_insert(rastro bigint, usuario bigint, funcion bigint) returns bigint as $$
declare
	row_rastro_informe rastro_informe;
begin
--	row_rastro_informe.id_rastro_informe                  = nextval('id_rastro_informe');
--	row_rastro_informe.id_rastro_informe                  = EXTRACT(EPOCH FROM CURRENT_TIMESTAMP);
	row_rastro_informe.id_rastro_informe                  = rastro;
	row_rastro_informe.version_rastro_informe             = 0;
	row_rastro_informe.fecha_hora_inicio_ejecucion        = CURRENT_TIMESTAMP;
	row_rastro_informe.id_usuario                         = usuario;
	row_rastro_informe.id_funcion                         = funcion;
	row_rastro_informe.numero_condicion_eje_fun = 11;
	/**/
	insert into rastro_informe select row_rastro_informe.*;
	/**/
	return row_rastro_informe.id_rastro_informe;
end;
$$ language plpgsql;
