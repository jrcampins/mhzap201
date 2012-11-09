create or replace function rastro_funcion_insert
(
rastro  bigint, 
usuario bigint, 
funcion bigint, 
recurso bigint, 
version_recurso bigint,
codigo_recurso varchar, 
nombre_recurso varchar, 
propietario_recurso bigint, 
segmento_recurso bigint, 
numero_error integer,
descripcion_error varchar
)
returns bigint as $$
declare
	row_rastro_funcion rastro_funcion;
begin
--	row_rastro_funcion.id_rastro_funcion      = nextval('id_rastro_funcion');
--	row_rastro_funcion.id_rastro_funcion      = EXTRACT(EPOCH FROM CURRENT_TIMESTAMP);
	row_rastro_funcion.id_rastro_funcion      = rastro;
	row_rastro_funcion.fecha_hora_ejecucion   = CURRENT_TIMESTAMP;
	row_rastro_funcion.id_usuario             = usuario;
	row_rastro_funcion.id_funcion             = funcion;
	row_rastro_funcion.id_recurso             = recurso;
	row_rastro_funcion.version_recurso        = version_recurso;
	row_rastro_funcion.codigo_recurso         = cast(codigo_recurso as varchar(100));
	row_rastro_funcion.nombre_recurso         = cast(nombre_recurso as varchar(100));
	row_rastro_funcion.id_propietario_recurso = propietario_recurso;
	row_rastro_funcion.id_segmento_recurso    = segmento_recurso;
	row_rastro_funcion.numero_error           = numero_error;
	row_rastro_funcion.descripcion_error      = cast(descripcion_error as varchar(2000));
	/**/
	insert into rastro_funcion select row_rastro_funcion.*;
	/**/
	return row_rastro_funcion.id_rastro_funcion;
end;
$$ language plpgsql;
