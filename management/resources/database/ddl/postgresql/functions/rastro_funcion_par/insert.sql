create or replace function rastro_funcion_par_insert
(
serial bigint,
rastro bigint,
parametro bigint,
valor_parametro varchar
)
returns bigint as $$
declare
	row_rastro_funcion_par rastro_funcion_par;
begin
--	row_rastro_funcion_par.id_rastro_funcion_par = nextval('id_rastro_funcion_par');
--	row_rastro_funcion_par.id_rastro_funcion_par = EXTRACT(EPOCH FROM CURRENT_TIMESTAMP);
	row_rastro_funcion_par.id_rastro_funcion_par = serial;
	row_rastro_funcion_par.id_rastro_funcion     = rastro;
	row_rastro_funcion_par.id_parametro          = parametro;
	row_rastro_funcion_par.valor_parametro       = cast(valor_parametro as varchar(100));
	/**/
	insert into rastro_funcion_par select row_rastro_funcion_par.*;
	/**/
	return row_rastro_funcion_par.id_rastro_funcion_par;
end;
$$ language plpgsql;
