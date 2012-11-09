SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
DROP PROCEDURE xisDominioParametro
GO
CREATE PROCEDURE xisDominioParametro AS
BEGIN
DECLARE @insertst varchar(8000)
DECLARE @selectst varchar(8000)
SET @insertst = "
INSERT
INTO	dominio_parametro (id_dominio_parametro, id_dominio, id_parametro, numero_tipo_parametro_dom)
"
SET @selectst = "
select	100*id_dominio+numero_tipo_parametro_dom AS id_dominio_parametro, id_dominio, id_parametro,	numero_tipo_parametro_dom
from	dominio, tipo_parametro_dom, parametro, xdbScriptPrimaryKeys
where	numero_tipo_parametro_dom IN (1,9)
and		100*id_dominio+numero_tipo_parametro_dom NOT IN (select id_dominio_parametro from dominio_parametro)
and		colname = parametro.codigo_parametro
and		tabname = dominio.codigo_dominio
and		(
		parametro.codigo_parametro = codigo_tipo_parametro_dom + '_' + codigo_dominio
or		parametro.codigo_parametro = codigo_tipo_parametro_dom + '_' + nombre_tabla
		)
UNION
select	100*id_dominio+numero_tipo_parametro_dom AS id_dominio_parametro, id_dominio, id_parametro,	numero_tipo_parametro_dom
from	dominio, tipo_parametro_dom, parametro, xdbScriptUniqueKeys
where	numero_tipo_parametro_dom = 3
and		100*id_dominio+numero_tipo_parametro_dom NOT IN (select id_dominio_parametro from dominio_parametro)
and		colname = parametro.codigo_parametro
and		tabname = dominio.codigo_dominio
and		(
		parametro.codigo_parametro = codigo_tipo_parametro_dom + '_' + codigo_dominio
or		parametro.codigo_parametro = codigo_tipo_parametro_dom + '_' + nombre_tabla
		)
UNION
select	100*id_dominio+numero_tipo_parametro_dom AS id_dominio_parametro, id_dominio, id_parametro,	numero_tipo_parametro_dom
from	dominio, tipo_parametro_dom, parametro, xdbJavaDataProviders11
where	numero_tipo_parametro_dom IN (2,4)
and		100*id_dominio+numero_tipo_parametro_dom NOT IN (select id_dominio_parametro from dominio_parametro)
and		colname = parametro.codigo_parametro
and		tabname = dominio.codigo_dominio
and		(
		parametro.codigo_parametro = codigo_tipo_parametro_dom + '_' + codigo_dominio
or		parametro.codigo_parametro = codigo_tipo_parametro_dom + '_' + nombre_tabla
		)
UNION
select 	100*id_dominio+numero_tipo_parametro_dom AS id_dominio_parametro, id_dominio, id_parametro,	numero_tipo_parametro_dom
from	dominio, tipo_parametro_dom, parametro, xdbJavaDataProviders11
where	numero_tipo_parametro_dom = 7
and		100*id_dominio+numero_tipo_parametro_dom NOT IN (select id_dominio_parametro from dominio_parametro)
and		colname = parametro.codigo_parametro
and		tabname = dominio.codigo_dominio
and		(
		parametro.codigo_parametro = 'id_' + codigo_dominio + '_' + codigo_tipo_parametro_dom
or		parametro.codigo_parametro = 'id_' + nombre_tabla + '_' + codigo_tipo_parametro_dom
		)
UNION
select 	100*id_dominio+numero_tipo_parametro_dom AS id_dominio_parametro, id_dominio, id_parametro,	numero_tipo_parametro_dom
from	dominio, tipo_parametro_dom, parametro, xdbJavaDataProviders11
where	numero_tipo_parametro_dom = 8
and		100*id_dominio+numero_tipo_parametro_dom NOT IN (select id_dominio_parametro from dominio_parametro)
and		colname = parametro.codigo_parametro
and		tabname = dominio.codigo_dominio
and		(
		parametro.codigo_parametro LIKE 'es_' + codigo_dominio + '_inactiv_'
or		parametro.codigo_parametro LIKE 'es_' + nombre_tabla + '_inactiv_'
		)
UNION
select 	100*id_dominio+numero_tipo_parametro_dom AS id_dominio_parametro, id_dominio, parametro.id_parametro, numero_tipo_parametro_dom
from	dominio, tipo_parametro_dom, parametro, clase_recurso_par
where	numero_tipo_parametro_dom = 6
and		100*id_dominio+numero_tipo_parametro_dom NOT IN (select id_dominio_parametro from dominio_parametro)
and		clase_recurso_par.id_parametro = parametro.id_parametro
and		clase_recurso_par.id_clase_recurso = dominio.id_clase_recurso
and		clase_recurso_par.es_parametro_segmento=1
order 	by 1
"
EXECUTE xis @insertst, @selectst
SET @selectst = "
select	100*id_dominio+numero_tipo_parametro_dom AS id_dominio_parametro, id_dominio, id_parametro,	numero_tipo_parametro_dom
from	dominio, tipo_parametro_dom, parametro, xdbJavaDataProviders11
where	numero_tipo_parametro_dom IN (1,9)
and		100*id_dominio+numero_tipo_parametro_dom NOT IN (select id_dominio_parametro from dominio_parametro)
and		colid   = 1
and		colname = parametro.codigo_parametro
and		tabname = dominio.codigo_dominio
and		(
		parametro.codigo_parametro = codigo_tipo_parametro_dom + '_' + codigo_dominio
or		parametro.codigo_parametro = codigo_tipo_parametro_dom + '_' + nombre_tabla
		)
order 	by 1
"
EXECUTE xis @insertst, @selectst
END
GO
SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
