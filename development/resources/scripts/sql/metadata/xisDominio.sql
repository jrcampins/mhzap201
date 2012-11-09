SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
DROP PROCEDURE xisDominio
GO
CREATE PROCEDURE xisDominio AS
BEGIN
DECLARE @insertst varchar(8000)
DECLARE @selectst varchar(8000)
SET @insertst = "
INSERT
INTO	dominio
		(
		id_dominio,
		codigo_dominio,
		nombre_dominio,
		descripcion_dominio,
		numero_tipo_dominio,
		nombre_tabla,
		id_clase_recurso,
		id_paquete
		)
"
SET @selectst = "
SELECT	1 + 100*id_clase_recurso AS id_dominio, 
		codigo_clase_recurso AS codigo_dominio, 
		dbo.xfnNombrePlural(nombre_clase_recurso) AS nombre_dominio, 
		descripcion_clase_recurso AS descripcion_dominio,
		numero_tipo_clase_recurso AS numero_tipo_dominio,
		NULL AS nombre_tabla,
		id_clase_recurso,
		CASE
		WHEN id_clase_recurso <  20000 THEN 1
  		WHEN id_clase_recurso >= 20000 AND id_clase_recurso < 30000 THEN 2
		WHEN id_clase_recurso >= 30000 THEN 3
		ELSE 3
		END AS id_paquete
FROM	clase_recurso
WHERE	id_clase_recurso NOT IN (10000,10200) -- sesion y recurso
AND		numero_tipo_clase_recurso = 1
AND		1 + 100*id_clase_recurso NOT IN (SELECT id_dominio FROM dominio)
ORDER	BY 1
"
EXECUTE xis @insertst, @selectst
SET @selectst = "
SELECT	1 + 100*vista.id_clase_recurso AS id_dominio, 
		vista.codigo_clase_recurso AS codigo_dominio, 
		dbo.xfnNombrePlural(vista.nombre_clase_recurso) AS nombre_dominio, 
		vista.descripcion_clase_recurso AS descripcion_dominio,
		vista.numero_tipo_clase_recurso AS numero_tipo_dominio,
		tabla.codigo_clase_recurso AS nombre_tabla,
		vista.id_clase_recurso,
		CASE
		WHEN vista.id_clase_recurso <  20000 THEN 1
  		WHEN vista.id_clase_recurso >= 20000 AND vista.id_clase_recurso < 30000 THEN 2
		WHEN vista.id_clase_recurso >= 30000 THEN 3
		ELSE 3
		END AS id_paquete
FROM	clase_recurso vista inner join clase_recurso tabla on vista.id_clase_recurso_base = tabla.id_clase_recurso
WHERE	vista.id_clase_recurso NOT IN (10000,10200) -- sesion y recurso
AND		vista.numero_tipo_clase_recurso = 2
AND		1 + 100*vista.id_clase_recurso NOT IN (SELECT id_dominio FROM dominio)
ORDER	BY 1
"
EXECUTE xis @insertst, @selectst
END
GO
SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
