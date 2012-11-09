SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
DROP PROCEDURE xisFuncion
GO
CREATE PROCEDURE xisFuncion AS
BEGIN
DECLARE @insertst varchar(8000)
DECLARE @selectst varchar(8000)
SET @insertst = "
INSERT 
INTO	funcion (id_funcion, codigo_funcion, numero_tipo_funcion, numero_tipo_rastro_fun, id_dominio, es_publica, es_segmentada)
"
SET @selectst = "
SELECT	100 * id_dominio + 1 AS id_funcion, 
		'consultar' + '_' + codigo_dominio AS codigo_funcion, 
		21 AS numero_tipo_funcion, 
		0  AS numero_tipo_rastro_fun,
		id_dominio,
		case when clase_recurso.numero_tipo_recurso in (11,12,13,14) then 1 else 0 end as es_publica,
		case when clase_recurso.id_clase_recurso_segmento is null then 0 else 1 end as es_segmentada
FROM	dominio
INNER
JOIN	clase_recurso ON dominio.id_clase_recurso = clase_recurso.id_clase_recurso
WHERE  	numero_tipo_dominio = numero_tipo_clase_recurso
-- AND	numero_tipo_recurso NOT IN (14, 22)
AND 	codigo_dominio NOT LIKE'%plus'
AND		100 * id_dominio + 1 NOT IN (SELECT id_funcion FROM funcion)
UNION
SELECT 	100 * id_dominio + 2 AS id_funcion, 
		'crear' + '_' + codigo_dominio AS codigo_funcion, 
		31 AS numero_tipo_funcion, 
		1  AS numero_tipo_rastro_fun,
		id_dominio,
		0  AS es_publica,
		case when clase_recurso.id_clase_recurso_segmento is null then 0 else 1 end as es_segmentada
FROM	dominio
INNER
JOIN	clase_recurso ON dominio.id_clase_recurso = clase_recurso.id_clase_recurso
WHERE  	numero_tipo_dominio = numero_tipo_clase_recurso
AND		numero_tipo_recurso NOT IN (14, 22)
AND 	codigo_dominio NOT LIKE'%plus'
AND		100 * id_dominio + 2 NOT IN (SELECT id_funcion FROM funcion)
UNION
SELECT 	100 * id_dominio + 3 AS id_funcion, 
		'modificar' + '_' + codigo_dominio AS codigo_funcion, 
		32 AS numero_tipo_funcion, 
		1  AS numero_tipo_rastro_fun,
		id_dominio,
		0  AS es_publica,
		case when clase_recurso.id_clase_recurso_segmento is null then 0 else 1 end as es_segmentada
FROM	dominio
INNER
JOIN	clase_recurso ON dominio.id_clase_recurso = clase_recurso.id_clase_recurso
WHERE   numero_tipo_dominio = numero_tipo_clase_recurso
AND		numero_tipo_recurso NOT IN (14, 22)
AND 	codigo_dominio NOT LIKE'%plus'
AND		100 * id_dominio + 3 NOT IN (SELECT id_funcion FROM funcion)
UNION
SELECT 	100 * id_dominio + 4 AS id_funcion, 
		'eliminar' + '_' + codigo_dominio AS codigo_funcion, 
		33 AS numero_tipo_funcion, 
		1  AS numero_tipo_rastro_fun,
		id_dominio,
		0  AS es_publica,
		case when clase_recurso.id_clase_recurso_segmento is null then 0 else 1 end as es_segmentada
FROM   	dominio
INNER
JOIN	clase_recurso ON dominio.id_clase_recurso = clase_recurso.id_clase_recurso
WHERE   numero_tipo_dominio = numero_tipo_clase_recurso
AND		numero_tipo_recurso NOT IN (14, 22)
AND 	codigo_dominio NOT LIKE'%plus'
AND		100 * id_dominio + 4 NOT IN (SELECT id_funcion FROM funcion)
ORDER 	BY 1
"
EXECUTE xis @insertst, @selectst
END
GO
SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
