SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
DROP PROCEDURE xisPagina
GO
CREATE PROCEDURE xisPagina AS
BEGIN
DECLARE @insertst varchar(8000)
DECLARE @updatest varchar(8000)
DECLARE @selectst varchar(8000)
------------------------------------------------------------------------------------------------------------------------
-- SET @selectst = "
-- "
-- EXECUTE xis @insertst, @selectst
------------------------------------------------------------------------------------------------------------------------
SET @insertst = "
INSERT
INTO	pagina
		(
		id_pagina,
		version_pagina,
		codigo_pagina, 
		nombre_pagina, 
		descripcion_pagina, 
		url_pagina, 
		id_aplicacion, 
		id_dominio, 
		id_dominio_maestro, 
		numero_tipo_pagina,
		id_parametro
		)
"
------------------------------------------------------------------------------------------------------------------------
--		paginas maestras de recursos independientes
------------------------------------------------------------------------------------------------------------------------
SET @selectst = "
select	10000*cr.id_clase_recurso+tp.numero_tipo_pagina as id_pagina, 1 as version_pagina,
		dbo.xfnCamelCase('_' + cr.codigo_clase_recurso) + CAST(tp.numero_tipo_pagina AS VARCHAR) as codigo_pagina,
		dbo.xfnNombrePagina(dr.nombre_dominio,1) as nombre_pagina,
		dr.descripcion_dominio as descripcion_pagina,
		'/faces/' + 
		dbo.xfnCamelCase('_' + cr.codigo_clase_recurso) + CAST(tp.numero_tipo_pagina AS VARCHAR) + '.jsp' as url_pagina,
		ap.id_aplicacion as id_aplicacion,
		dr.id_dominio as id_dominio,
		NULL as id_dominio_maestro,
		tp.numero_tipo_pagina as numero_tipo_pagina,
		NULL
from	aplicacion ap, clase_recurso cr, dominio dr, tipo_pagina tp
where	cr.id_clase_recurso > 9999
and		cr.numero_tipo_recurso IN (11,13,21)
and		ap.id_aplicacion = dbo.xfnAplicacionClaseRecursoRaiz(cr.id_clase_recurso)
and		cr.id_clase_recurso = dr.id_clase_recurso
and		dr.id_dominio = 100*cr.id_clase_recurso+1
and		cr.es_clase_recurso_independiente=1
and		tp.numero_tipo_pagina <= case when cr.id_clase_recurso_maestro IS NULL or cr.id_clase_recurso_maestro <> cr.id_clase_recurso or cr.es_clase_recurso_con_arbol = 0 then 2 else 3 end
and		10000*cr.id_clase_recurso+tp.numero_tipo_pagina not in (select id_pagina from pagina)
order	by ap.id_aplicacion, cr.id_clase_recurso, tp.numero_tipo_pagina
"
EXECUTE xis @insertst, @selectst
------------------------------------------------------------------------------------------------------------------------
--		paginas maestro/detalle de tablas dependientes de una unica tabla
------------------------------------------------------------------------------------------------------------------------
SET @selectst = "
select	10000*cr.id_clase_recurso+100*fk.colid+tp.numero_tipo_pagina as id_pagina, 2 as version_pagina,
		dbo.xfnCamelCase('_' + cr.codigo_clase_recurso + '_' + REPLACE(px.codigo_parametro, 'id_', 'por_')) + 
		CAST(tp.numero_tipo_pagina AS VARCHAR) as codigo_pagina,
		dbo.xfnNombrePagina(dbo.xfnNombreAsociaciones(dr.nombre_dominio, cm.codigo_clase_recurso),1) as nombre_pagina,
		dbo.xfnNombreAsociaciones(dr.nombre_dominio, cm.codigo_clase_recurso) + ' por ' +  px.nombre_parametro as descripcion_pagina,
		'/faces/' + 
		dbo.xfnCamelCase('_' + cr.codigo_clase_recurso + '_' + REPLACE(px.codigo_parametro, 'id_', 'por_')) + 
		CAST(tp.numero_tipo_pagina AS VARCHAR) + '.jsp' as url_pagina,
		ap.id_aplicacion as id_aplicacion,
		dr.id_dominio as id_dominio,
		dm.id_dominio as id_dominio_maestro,
		tp.numero_tipo_pagina as numero_tipo_pagina,
		px.id_parametro
-- from	aplicacion ap, clase_recurso cr, dominio dr, dominio dm, tipo_pagina tp, xdbScriptForeignKeys fk, parametro px, clase_recurso cm
from	aplicacion ap, clase_recurso cr, dominio dr, dominio dm, tipo_pagina tp, xdbScriptForeignKeys fk, parametro px, clase_recurso_par crp, clase_recurso cm
where	cr.id_clase_recurso > 9999
and		cr.numero_tipo_clase_recurso=1
and		cm.numero_tipo_clase_recurso=1 -- OJO
and		cr.numero_tipo_recurso IN (11,13,21,22) and (cr.numero_tipo_recurso=cm.numero_tipo_recurso)
and		ap.id_aplicacion = dbo.xfnAplicacionClaseRecursoRaiz(cr.id_clase_recurso_maestro)
and		cr.id_clase_recurso = dr.id_clase_recurso
and		dr.id_dominio = 100*cr.id_clase_recurso+1
and		cr.id_clase_recurso_maestro = dm.id_clase_recurso
and		dm.id_dominio = 100*cr.id_clase_recurso_maestro+1
and		cr.es_clase_recurso_independiente=0
and		tp.numero_tipo_pagina <= case when cr.es_clase_recurso_sin_detalle = 1 then 1 else 2 end
and		fk.tabname = cr.codigo_clase_recurso
and		fk.refname = cm.codigo_clase_recurso
and		fk.colname = px.codigo_parametro
and		crp.id_clase_recurso = cr.id_clase_recurso
and		crp.id_parametro = px.id_parametro
and		crp.es_parametro_maestro = 1
and		cm.id_clase_recurso = cr.id_clase_recurso_maestro
and		cm.id_clase_recurso = dm.id_clase_recurso
and		dm.id_dominio = 100*cm.id_clase_recurso+1
and		10000*cr.id_clase_recurso+100*fk.colid+tp.numero_tipo_pagina not in (select id_pagina from pagina)
order	by ap.id_aplicacion, cr.id_clase_recurso, tp.numero_tipo_pagina
"
EXECUTE xis @insertst, @selectst
------------------------------------------------------------------------------------------------------------------------
--		paginas maestro/detalle de tablas dependientes de varios tablas
------------------------------------------------------------------------------------------------------------------------
SET @selectst = "
select	10000*cr.id_clase_recurso+100*fk.colid+tp.numero_tipo_pagina as id_pagina, 3 as version_pagina,
		dbo.xfnCamelCase('_' + cr.codigo_clase_recurso + '_' + REPLACE(px.codigo_parametro, 'id_', 'por_')) + 
		CAST(tp.numero_tipo_pagina AS VARCHAR) as codigo_pagina,
		dbo.xfnNombrePagina(dbo.xfnNombreAsociaciones(dr.nombre_dominio, cm.codigo_clase_recurso),1) as nombre_pagina,
		dbo.xfnNombreAsociaciones(dr.nombre_dominio, cm.codigo_clase_recurso) + ' por ' +  px.nombre_parametro as descripcion_pagina,
		'/faces/' + 
		dbo.xfnCamelCase('_' + cr.codigo_clase_recurso + '_' + REPLACE(px.codigo_parametro, 'id_', 'por_')) + 
		CAST(tp.numero_tipo_pagina AS VARCHAR) + '.jsp' as url_pagina,
		ap.id_aplicacion as id_aplicacion,
		dr.id_dominio as id_dominio,
		dm.id_dominio as id_dominio_maestro,
		tp.numero_tipo_pagina as numero_tipo_pagina,
		px.id_parametro
-- from	clase_recurso cr, dominio dr, tipo_pagina tp, xdbScriptForeignKeys fk, parametro px, clase_recurso cm, dominio dm, aplicacion ap
from	clase_recurso cr, dominio dr, tipo_pagina tp, xdbScriptForeignKeys fk, parametro px, clase_recurso_par crp, clase_recurso cm, dominio dm, aplicacion ap
where	cr.id_clase_recurso > 9999
and		cr.numero_tipo_clase_recurso=1
and		cr.numero_tipo_recurso IN (11,13,21,22) and (cr.numero_tipo_recurso=cm.numero_tipo_recurso)
and		dbo.xfnClaseRecursoRaiz(cr.id_clase_recurso_maestro) IS NULL
and		cr.id_clase_recurso = dr.id_clase_recurso
and		dr.id_dominio = 100*cr.id_clase_recurso+1
and		cr.es_clase_recurso_independiente=0
and		tp.numero_tipo_pagina <= case when cr.es_clase_recurso_sin_detalle = 1 then 1 else 2 end
and		fk.tabname = cr.codigo_clase_recurso
and		fk.refname = cm.codigo_clase_recurso
and		fk.colname = px.codigo_parametro
and		crp.id_clase_recurso = cr.id_clase_recurso
and		crp.id_parametro = px.id_parametro
and		crp.es_parametro_maestro = 1
and		cm.id_clase_recurso = dm.id_clase_recurso
and		dm.id_dominio = 100*cm.id_clase_recurso+1
and		ap.id_aplicacion = dbo.xfnAplicacionClaseRecursoRaiz(cm.id_clase_recurso)
and		10000*cr.id_clase_recurso+100*fk.colid+tp.numero_tipo_pagina not in (select id_pagina from pagina)
order	by cr.id_clase_recurso,tp.numero_tipo_pagina,cm.id_clase_recurso,fk.colid
"
EXECUTE xis @insertst, @selectst
------------------------------------------------------------------------------------------------------------------------
--		paginas maestro/detalle de "arboles"
------------------------------------------------------------------------------------------------------------------------
SET @selectst = "
select	10000*cr.id_clase_recurso+100*fk.colid+tp.numero_tipo_pagina as id_pagina, 4 as version_pagina,
		dbo.xfnCamelCase('_' + cr.codigo_clase_recurso + '_' + REPLACE(px.codigo_parametro, 'id_', 'por_')) + 
		CAST(tp.numero_tipo_pagina AS VARCHAR) as codigo_pagina,
		dbo.xfnNombrePagina(dbo.xfnNombreAsociaciones(dr.nombre_dominio, cm.codigo_clase_recurso),1) as nombre_pagina,
		dbo.xfnNombreAsociaciones(dr.nombre_dominio, cm.codigo_clase_recurso) + ' por ' +  px.nombre_parametro as descripcion_pagina,
		'/faces/' + 
		dbo.xfnCamelCase('_' + cr.codigo_clase_recurso + '_' + REPLACE(px.codigo_parametro, 'id_', 'por_')) + 
		CAST(tp.numero_tipo_pagina AS VARCHAR) + '.jsp' as url_pagina,
		ap.id_aplicacion as id_aplicacion,
		dr.id_dominio as id_dominio,
		dm.id_dominio as id_dominio_maestro,
		NULL as numero_tipo_pagina,--tp.numero_tipo_pagina as numero_tipo_pagina,
		px.id_parametro
-- from	clase_recurso cr, dominio dr, tipo_pagina tp, xdbScriptForeignKeys fk, parametro px, clase_recurso cm, dominio dm, aplicacion ap
from	clase_recurso cr, dominio dr, tipo_pagina tp, xdbScriptForeignKeys fk, parametro px, clase_recurso_par crp, clase_recurso cm, dominio dm, aplicacion ap
where	cr.id_clase_recurso > 9999
and		cr.numero_tipo_recurso IN (11,13,21,22) and (cr.numero_tipo_recurso=cm.numero_tipo_recurso)
and		dbo.xfnClaseRecursoRaiz(cr.id_clase_recurso_maestro) IS NULL
and		cr.id_clase_recurso = dr.id_clase_recurso
and		dr.id_dominio = 100*cr.id_clase_recurso+1
and		cr.es_clase_recurso_independiente=1
and		tp.numero_tipo_pagina=1
and		fk.tabname = cr.codigo_clase_recurso
and		fk.refname = cm.codigo_clase_recurso
and		fk.colname = px.codigo_parametro
and		crp.id_clase_recurso = cr.id_clase_recurso
and		crp.id_parametro = px.id_parametro
and		crp.es_parametro_maestro = 1
and		cm.id_clase_recurso = cr.id_clase_recurso
and		cm.id_clase_recurso = dm.id_clase_recurso
and		dm.id_dominio = 100*cm.id_clase_recurso+1
and		ap.id_aplicacion = dbo.xfnAplicacionClaseRecursoRaiz(cm.id_clase_recurso)
and		10000*cr.id_clase_recurso+100*fk.colid+tp.numero_tipo_pagina not in (select id_pagina from pagina)
order	by cr.id_clase_recurso,tp.numero_tipo_pagina,cm.id_clase_recurso,fk.colid
"
-- EXECUTE xis @insertst, @selectst
------------------------------------------------------------------------------------------------------------------------
--		paginas maestro/detalle de recursos independientes con relacion 1:1
------------------------------------------------------------------------------------------------------------------------
SET @selectst = "
select	10000*cr.id_clase_recurso+100*fk.colid+tp.numero_tipo_pagina as id_pagina, 5 as version_pagina,
		dbo.xfnCamelCase('_' + cr.codigo_clase_recurso + '_' + REPLACE(px.codigo_parametro, 'id_', 'por_')) + 
		CAST(tp.numero_tipo_pagina AS VARCHAR) as codigo_pagina,
		dbo.xfnNombrePagina(dbo.xfnNombreAsociaciones(dr.nombre_dominio, cm.codigo_clase_recurso),1) as nombre_pagina,
		dbo.xfnNombreAsociaciones(dr.nombre_dominio, cm.codigo_clase_recurso) + ' por ' +  px.nombre_parametro as descripcion_pagina,
		'/faces/' + 
		dbo.xfnCamelCase('_' + cr.codigo_clase_recurso + '_' + REPLACE(px.codigo_parametro, 'id_', 'por_')) + 
		CAST(tp.numero_tipo_pagina AS VARCHAR) + '.jsp' as url_pagina,
		ap.id_aplicacion as id_aplicacion,
		dr.id_dominio as id_dominio,
		dm.id_dominio as id_dominio_maestro,
		NULL as numero_tipo_pagina,
		px.id_parametro
-- from	clase_recurso cr, dominio dr, tipo_pagina tp, xdbScriptForeignKeys fk, parametro px, clase_recurso cm, dominio dm, aplicacion ap
from	clase_recurso cr, dominio dr, tipo_pagina tp, xdbScriptForeignKeys fk, parametro px, clase_recurso_par crp, clase_recurso cm, dominio dm, aplicacion ap
where	cr.id_clase_recurso > 9999
and		cr.numero_tipo_recurso IN (11,13,21,22) and (cr.numero_tipo_recurso=cm.numero_tipo_recurso)
and		dbo.xfnClaseRecursoRaiz(cr.id_clase_recurso_maestro) IS NULL
and		cr.id_clase_recurso = dr.id_clase_recurso
and		dr.id_dominio = 100*cr.id_clase_recurso+1
and		cr.es_clase_recurso_independiente=1
and		tp.numero_tipo_pagina=1
and		fk.tabname = cr.codigo_clase_recurso
and		fk.refname = cm.codigo_clase_recurso
and		fk.colname = px.codigo_parametro
and		fk.colname in (select colname from xdbScriptPrimaryKeys where tabname = fk.tabname)
and		crp.id_clase_recurso = cr.id_clase_recurso
and		crp.id_parametro = px.id_parametro
and		crp.es_parametro_maestro = 1
and		cm.id_clase_recurso <> cr.id_clase_recurso
and		cm.id_clase_recurso = dm.id_clase_recurso
and		dm.id_dominio = 100*cm.id_clase_recurso+1
and		ap.id_aplicacion = dbo.xfnAplicacionClaseRecursoRaiz(cm.id_clase_recurso)
and		10000*cr.id_clase_recurso+100*fk.colid+tp.numero_tipo_pagina not in (select id_pagina from pagina)
order	by cr.id_clase_recurso,tp.numero_tipo_pagina,cm.id_clase_recurso,fk.colid
"
-- EXECUTE xis @insertst, @selectst
------------------------------------------------------------------------------------------------------------------------
--		paginas maestro/detalle de tablas independientes con relacion 1:N
------------------------------------------------------------------------------------------------------------------------
SET @selectst = "
select	10000*cr.id_clase_recurso+100*fk.colid+tp.numero_tipo_pagina as id_pagina, 6 as version_pagina,
		dbo.xfnCamelCase('_' + cr.codigo_clase_recurso + '_' + REPLACE(px.codigo_parametro, 'id_', 'por_')) + 
		CAST(tp.numero_tipo_pagina AS VARCHAR) as codigo_pagina,
		dbo.xfnNombrePagina(dbo.xfnNombreAsociaciones(dr.nombre_dominio, cm.codigo_clase_recurso),1) as nombre_pagina,
		dbo.xfnNombreAsociaciones(dr.nombre_dominio, cm.codigo_clase_recurso) + ' por ' +  px.nombre_parametro as descripcion_pagina,
		'/faces/' + 
		dbo.xfnCamelCase('_' + cr.codigo_clase_recurso + '_' + REPLACE(px.codigo_parametro, 'id_', 'por_')) + 
		CAST(tp.numero_tipo_pagina AS VARCHAR) + '.jsp' as url_pagina,
		ap.id_aplicacion as id_aplicacion,
		dr.id_dominio as id_dominio,
		dm.id_dominio as id_dominio_maestro,
		tp.numero_tipo_pagina as numero_tipo_pagina,
		px.id_parametro
-- from	clase_recurso cr, dominio dr, tipo_pagina tp, xdbScriptForeignKeys fk, parametro px, clase_recurso cm, dominio dm, aplicacion ap
from	clase_recurso cr, dominio dr, tipo_pagina tp, xdbScriptForeignKeys fk, parametro px, clase_recurso_par crp, clase_recurso cm, dominio dm, aplicacion ap
where	cr.id_clase_recurso > 9999
and		cr.numero_tipo_clase_recurso=1
and		cr.numero_tipo_recurso IN (11,13,21,22) and (cr.numero_tipo_recurso=cm.numero_tipo_recurso)
and		dbo.xfnClaseRecursoRaiz(cr.id_clase_recurso_maestro) IS NULL
and		cr.id_clase_recurso = dr.id_clase_recurso
and		dr.id_dominio = 100*cr.id_clase_recurso+1
and		cr.es_clase_recurso_independiente=1
and		tp.numero_tipo_pagina=1
and		fk.tabname = cr.codigo_clase_recurso
and		fk.refname = cm.codigo_clase_recurso
and		fk.colname = px.codigo_parametro
and		fk.colname not in (select colname from xdbScriptPrimaryKeys where tabname = fk.tabname)
and		crp.id_clase_recurso = cr.id_clase_recurso
and		crp.id_parametro = px.id_parametro
and		crp.es_parametro_maestro = 1
and		cm.id_clase_recurso <> cr.id_clase_recurso
and		cm.id_clase_recurso = dm.id_clase_recurso
and		dm.id_dominio = 100*cm.id_clase_recurso+1
and		ap.id_aplicacion = dbo.xfnAplicacionClaseRecursoRaiz(cm.id_clase_recurso)
and		10000*cr.id_clase_recurso+100*fk.colid+tp.numero_tipo_pagina not in (select id_pagina from pagina)
order	by cr.id_clase_recurso,tp.numero_tipo_pagina,cm.id_clase_recurso,fk.colid
"
EXECUTE xis @insertst, @selectst
------------------------------------------------------------------------------------------------------------------------
--		paginas maestro/detalle de vistas dependientes de una unica tabla
------------------------------------------------------------------------------------------------------------------------
SET @selectst = "
select	10000*cr.id_clase_recurso+100*fk.colid+tp.numero_tipo_pagina as id_pagina, 7 as version_pagina,
		dbo.xfnCamelCase('_' + cr.codigo_clase_recurso + '_' + REPLACE(px.codigo_parametro, 'id_', 'por_')) + 
		CAST(tp.numero_tipo_pagina AS VARCHAR) as codigo_pagina,
		dbo.xfnNombrePagina(dbo.xfnNombreAsociaciones(dr.nombre_dominio, cm.codigo_clase_recurso),1) as nombre_pagina,
		dbo.xfnNombreAsociaciones(dr.nombre_dominio, cm.codigo_clase_recurso) + ' por ' +  px.nombre_parametro as descripcion_pagina,
		'/faces/' + 
		dbo.xfnCamelCase('_' + cr.codigo_clase_recurso + '_' + REPLACE(px.codigo_parametro, 'id_', 'por_')) + 
		CAST(tp.numero_tipo_pagina AS VARCHAR) + '.jsp' as url_pagina,
		ap.id_aplicacion as id_aplicacion,
		dr.id_dominio as id_dominio,
		dm.id_dominio as id_dominio_maestro,
		tp.numero_tipo_pagina as numero_tipo_pagina,
		px.id_parametro
-- from	aplicacion ap, clase_recurso cr, dominio dr, dominio dm, tipo_pagina tp, xdbScriptForeignKeys fk, parametro px, clase_recurso cm
-- from	aplicacion ap, clase_recurso cr, dominio dr, dominio dm, tipo_pagina tp, xdbScriptForeignKeys fk, parametro px, clase_recurso_par crp, clase_recurso cm
from	aplicacion ap, clase_recurso cr, clase_recurso cb, dominio dr, dominio dm, tipo_pagina tp, xdbScriptForeignKeys fk, parametro px, clase_recurso_par crp, clase_recurso cm
where	cr.id_clase_recurso > 9999
and		cb.id_clase_recurso = cr.id_clase_recurso_base
and		cr.numero_tipo_clase_recurso=2
and		cb.numero_tipo_clase_recurso=1
and		cr.numero_tipo_recurso IN (11,13,21,22) and (cr.numero_tipo_recurso=cm.numero_tipo_recurso)
and		ap.id_aplicacion = dbo.xfnAplicacionClaseRecursoRaiz(cr.id_clase_recurso_maestro)
and		cr.id_clase_recurso = dr.id_clase_recurso
and		dr.id_dominio = 100*cr.id_clase_recurso+1
and		cr.id_clase_recurso_maestro = dm.id_clase_recurso
and		dm.id_dominio = 100*cr.id_clase_recurso_maestro+1
and		cr.es_clase_recurso_independiente=0
and		tp.numero_tipo_pagina <= case when cr.es_clase_recurso_sin_detalle = 1 then 1 else 2 end
and		fk.tabname = cb.codigo_clase_recurso
and		fk.refname = cm.codigo_clase_recurso
and		fk.colname = px.codigo_parametro
and		crp.id_clase_recurso = cr.id_clase_recurso
and		crp.id_parametro = px.id_parametro
and		crp.es_parametro_maestro = 1
and		cm.id_clase_recurso = cr.id_clase_recurso_maestro
and		cm.id_clase_recurso = dm.id_clase_recurso
and		dm.id_dominio = 100*cm.id_clase_recurso+1
and		10000*cr.id_clase_recurso+100*fk.colid+tp.numero_tipo_pagina not in (select id_pagina from pagina)
order	by ap.id_aplicacion, cr.id_clase_recurso, tp.numero_tipo_pagina
"
EXECUTE xis @insertst, @selectst
------------------------------------------------------------------------------------------------------------------------
--		paginas maestro/detalle de vistas dependientes de varias tablas
------------------------------------------------------------------------------------------------------------------------
SET @selectst = "
select	10000*cr.id_clase_recurso+100*fk.colid+tp.numero_tipo_pagina as id_pagina, 8 as version_pagina,
		dbo.xfnCamelCase('_' + cr.codigo_clase_recurso + '_' + REPLACE(px.codigo_parametro, 'id_', 'por_')) + 
		CAST(tp.numero_tipo_pagina AS VARCHAR) as codigo_pagina,
		dbo.xfnNombrePagina(dbo.xfnNombreAsociaciones(dr.nombre_dominio, cm.codigo_clase_recurso),1) as nombre_pagina,
		dbo.xfnNombreAsociaciones(dr.nombre_dominio, cm.codigo_clase_recurso) + ' por ' +  px.nombre_parametro as descripcion_pagina,
		'/faces/' + 
		dbo.xfnCamelCase('_' + cr.codigo_clase_recurso + '_' + REPLACE(px.codigo_parametro, 'id_', 'por_')) + 
		CAST(tp.numero_tipo_pagina AS VARCHAR) + '.jsp' as url_pagina,
		ap.id_aplicacion as id_aplicacion,
		dr.id_dominio as id_dominio,
		dm.id_dominio as id_dominio_maestro,
		tp.numero_tipo_pagina as numero_tipo_pagina,
		px.id_parametro
-- from	clase_recurso cr, dominio dr, tipo_pagina tp, xdbScriptForeignKeys fk, parametro px, clase_recurso cm, dominio dm, aplicacion ap
-- from	clase_recurso cr, dominio dr, tipo_pagina tp, xdbScriptForeignKeys fk, parametro px, clase_recurso_par crp, clase_recurso cm, dominio dm, aplicacion ap
from	clase_recurso cr, clase_recurso cb, dominio dr, tipo_pagina tp, xdbScriptForeignKeys fk, parametro px, clase_recurso_par crp, clase_recurso cm, dominio dm, aplicacion ap
where	cr.id_clase_recurso > 9999
and		cb.id_clase_recurso = cr.id_clase_recurso_base
and		cr.numero_tipo_clase_recurso=2
and		cb.numero_tipo_clase_recurso=1
and		cr.numero_tipo_recurso IN (11,13,21,22) and (cr.numero_tipo_recurso=cm.numero_tipo_recurso)
and		dbo.xfnClaseRecursoRaiz(cr.id_clase_recurso_maestro) IS NULL
and		cr.id_clase_recurso = dr.id_clase_recurso
and		dr.id_dominio = 100*cr.id_clase_recurso+1
and		cr.es_clase_recurso_independiente=0
and		tp.numero_tipo_pagina <= case when cr.es_clase_recurso_sin_detalle = 1 then 1 else 2 end
and		fk.tabname = cb.codigo_clase_recurso
and		fk.refname = cm.codigo_clase_recurso
and		fk.colname = px.codigo_parametro
and		crp.id_clase_recurso = cr.id_clase_recurso
and		crp.id_parametro = px.id_parametro
and		crp.es_parametro_maestro = 1
and		cm.id_clase_recurso = dm.id_clase_recurso
and		dm.id_dominio = 100*cm.id_clase_recurso+1
and		ap.id_aplicacion = dbo.xfnAplicacionClaseRecursoRaiz(cm.id_clase_recurso)
and		10000*cr.id_clase_recurso+100*fk.colid+tp.numero_tipo_pagina not in (select id_pagina from pagina)
order	by cr.id_clase_recurso,tp.numero_tipo_pagina,cm.id_clase_recurso,fk.colid
"
EXECUTE xis @insertst, @selectst
------------------------------------------------------------------------------------------------------------------------
--		paginas maestro/detalle de vistas independientes con relacion 1:N
------------------------------------------------------------------------------------------------------------------------
SET @selectst = "
select	10000*cr.id_clase_recurso+100*fk.colid+tp.numero_tipo_pagina as id_pagina, 9 as version_pagina,
		dbo.xfnCamelCase('_' + cr.codigo_clase_recurso + '_' + REPLACE(px.codigo_parametro, 'id_', 'por_')) + 
		CAST(tp.numero_tipo_pagina AS VARCHAR) as codigo_pagina,
		dbo.xfnNombrePagina(dbo.xfnNombreAsociaciones(dr.nombre_dominio, cm.codigo_clase_recurso),1) as nombre_pagina,
		dbo.xfnNombreAsociaciones(dr.nombre_dominio, cm.codigo_clase_recurso) + ' por ' +  px.nombre_parametro as descripcion_pagina,
		'/faces/' + 
		dbo.xfnCamelCase('_' + cr.codigo_clase_recurso + '_' + REPLACE(px.codigo_parametro, 'id_', 'por_')) + 
		CAST(tp.numero_tipo_pagina AS VARCHAR) + '.jsp' as url_pagina,
		ap.id_aplicacion as id_aplicacion,
		dr.id_dominio as id_dominio,
		dm.id_dominio as id_dominio_maestro,
		tp.numero_tipo_pagina as numero_tipo_pagina,
		px.id_parametro
-- from	clase_recurso cr, dominio dr, tipo_pagina tp, xdbScriptForeignKeys fk, parametro px, clase_recurso cm, dominio dm, aplicacion ap
from	clase_recurso cr, clase_recurso cb, dominio dr, tipo_pagina tp, xdbScriptForeignKeys fk, parametro px, clase_recurso_par crp, clase_recurso cm, dominio dm, aplicacion ap
where	cr.id_clase_recurso > 9999
and		cb.id_clase_recurso = cr.id_clase_recurso_base
and		cr.numero_tipo_clase_recurso=2
and		cb.numero_tipo_clase_recurso=1
and		cr.numero_tipo_recurso IN (11,13,21,22) and (cr.numero_tipo_recurso=cm.numero_tipo_recurso)
and		dbo.xfnClaseRecursoRaiz(cr.id_clase_recurso_maestro) IS NULL
and		cr.id_clase_recurso = dr.id_clase_recurso
and		dr.id_dominio = 100*cr.id_clase_recurso+1
and		cr.es_clase_recurso_independiente=1
and		tp.numero_tipo_pagina=1
and		fk.tabname = cb.codigo_clase_recurso
and		fk.refname = cm.codigo_clase_recurso
and		fk.colname = px.codigo_parametro
and		fk.colname not in (select colname from xdbScriptPrimaryKeys where tabname = fk.tabname)
and		crp.id_clase_recurso = cr.id_clase_recurso
and		crp.id_parametro = px.id_parametro
and		crp.es_parametro_maestro = 1
and		cm.id_clase_recurso <> cr.id_clase_recurso
and		cm.id_clase_recurso = dm.id_clase_recurso
and		dm.id_dominio = 100*cm.id_clase_recurso+1
and		ap.id_aplicacion = dbo.xfnAplicacionClaseRecursoRaiz(cm.id_clase_recurso)
and		10000*cr.id_clase_recurso+100*fk.colid+tp.numero_tipo_pagina not in (select id_pagina from pagina)
order	by cr.id_clase_recurso,tp.numero_tipo_pagina,cm.id_clase_recurso,fk.colid
"
EXECUTE xis @insertst, @selectst
------------------------------------------------------------------------------------------------------------------------
--		paginas de procesos de negocio (51000)
------------------------------------------------------------------------------------------------------------------------
SET @selectst = "
select	distinct id_pagina, 10 as version_pagina,
		codigo_pagina, dbo.xfnNombrePagina(nombre_pagina,2), descripcion_pagina, url_pagina,
		id_aplicacion, id_dominio, id_dominio_maestro, numero_tipo_pagina, id_parametro
from	xdb10102 -- xdbProcessTables2
where	id_pagina not in (select id_pagina from pagina)
order	by id_pagina
"
EXECUTE xis @insertst, @selectst
------------------------------------------------------------------------------------------------------------------------
--		paginas de consultas e informes (52000)
------------------------------------------------------------------------------------------------------------------------
SET @selectst = "
select	10000*cr.id_clase_recurso+tp.numero_tipo_pagina as id_pagina, 11 as version_pagina,
		dbo.xfnCamelCase('_' + cr.codigo_clase_recurso) + CAST(tp.numero_tipo_pagina AS VARCHAR) as codigo_pagina,
		dbo.xfnNombrePagina(dr.nombre_dominio,3) as nombre_pagina,
		dr.descripcion_dominio as descripcion_pagina,
		'/faces/' + 
		dbo.xfnCamelCase('_' + cr.codigo_clase_recurso) + CAST(tp.numero_tipo_pagina AS VARCHAR) + '.jsp' as url_pagina,
		52000 as id_aplicacion,
		dr.id_dominio as id_dominio,
		NULL as id_dominio_maestro,
		tp.numero_tipo_pagina as numero_tipo_pagina,
		NULL
from	clase_recurso cr, dominio dr, tipo_pagina tp
where	cr.id_clase_recurso > 19999
and		cr.numero_tipo_recurso in (13, 21, 22)
and 	cr.id_clase_recurso = dr.id_clase_recurso
and 	dr.id_dominio = 100*cr.id_clase_recurso+1
and		tp.numero_tipo_pagina > 4
and		tp.numero_tipo_pagina <= case
			when cr.es_clase_recurso_sin_detalle = 1 and (cr.id_clase_recurso_maestro IS NULL or cr.id_clase_recurso_maestro <> cr.id_clase_recurso or cr.es_clase_recurso_con_arbol = 0) then 5
			when cr.es_clase_recurso_sin_detalle = 0 and (cr.id_clase_recurso_maestro IS NULL or cr.id_clase_recurso_maestro <> cr.id_clase_recurso or cr.es_clase_recurso_con_arbol = 0) then 6
			else 7 end
and		10000*cr.id_clase_recurso+tp.numero_tipo_pagina not in (select id_pagina from pagina)
order	by cr.id_clase_recurso, tp.numero_tipo_pagina
"
EXECUTE xis @insertst, @selectst
------------------------------------------------------------------------------------------------------------------------
--		paginas de recursos de configuracion fija (41200)
------------------------------------------------------------------------------------------------------------------------
SET @selectst = "
select	10000*cr.id_clase_recurso+1 as id_pagina, 12 as version_pagina,
		dbo.xfnCamelCase('_' + cr.codigo_clase_recurso) + CAST(1 AS VARCHAR) as codigo_pagina,
		dbo.xfnNombrePagina(dr.nombre_dominio,1) as nombre_pagina,
		dr.descripcion_dominio as descripcion_pagina,
		'/faces/' + 
		dbo.xfnCamelCase('_' + cr.codigo_clase_recurso) + CAST(1 AS VARCHAR) + '.jsp' as url_pagina,
		41200 as id_aplicacion,
		dr.id_dominio as id_dominio,
		NULL as id_dominio_maestro,
		1 as numero_tipo_pagina,
		NULL
from	clase_recurso cr, dominio dr
where	cr.id_clase_recurso > 19999
and		cr.numero_tipo_recurso = 12
and		cr.id_clase_recurso = dr.id_clase_recurso
and		dr.id_dominio = 100*cr.id_clase_recurso+1
and		cr.es_clase_recurso_independiente=1
and		10000*cr.id_clase_recurso+1 not in (select id_pagina from pagina)
order	by cr.id_clase_recurso
"
EXECUTE xis @insertst, @selectst
------------------------------------------------------------------------------------------------------------------------
--		paginas maestro/detalle de tablas dependientes de una unica vista
------------------------------------------------------------------------------------------------------------------------
SET @selectst = "
select	10000*cr.id_clase_recurso+100*fk.colid+tp.numero_tipo_pagina as id_pagina, 13 as version_pagina,
		dbo.xfnCamelCase('_' + cr.codigo_clase_recurso + '_' + REPLACE(px.codigo_parametro, 'id_', 'por_')) + 
		CAST(tp.numero_tipo_pagina AS VARCHAR) as codigo_pagina,
		dbo.xfnNombrePagina(dbo.xfnNombreAsociaciones(dr.nombre_dominio, cm.codigo_clase_recurso),1) as nombre_pagina,
		dbo.xfnNombreAsociaciones(dr.nombre_dominio, cm.codigo_clase_recurso) + ' por ' +  px.nombre_parametro as descripcion_pagina,
		'/faces/' + 
		dbo.xfnCamelCase('_' + cr.codigo_clase_recurso + '_' + REPLACE(px.codigo_parametro, 'id_', 'por_')) + 
		CAST(tp.numero_tipo_pagina AS VARCHAR) + '.jsp' as url_pagina,
		ap.id_aplicacion as id_aplicacion,
		dr.id_dominio as id_dominio,
		dm.id_dominio as id_dominio_maestro,
		tp.numero_tipo_pagina as numero_tipo_pagina,
		px.id_parametro
-- from	aplicacion ap, clase_recurso cr, dominio dr, dominio dm, tipo_pagina tp, xdbScriptForeignKeys fk, parametro px, clase_recurso cm
from	aplicacion ap, clase_recurso cr, dominio dr, dominio dm, tipo_pagina tp, xdbScriptForeignKeys fk, parametro px, clase_recurso_par crp, clase_recurso cm, clase_recurso bm
where	cr.id_clase_recurso > 9999
and		cr.numero_tipo_clase_recurso=1
and		cm.numero_tipo_clase_recurso=2 -- OJO
and		bm.id_clase_recurso = dbo.xfnClaseRecursoRaiz(cm.id_clase_recurso_base) -- OJO
and		cr.numero_tipo_recurso IN (11,13,21,22) and (cr.numero_tipo_recurso=cm.numero_tipo_recurso)
and		ap.id_aplicacion = dbo.xfnAplicacionClaseRecursoRaiz(cr.id_clase_recurso_maestro)
and		cr.id_clase_recurso = dr.id_clase_recurso
and		dr.id_dominio = 100*cr.id_clase_recurso+1
and		cr.id_clase_recurso_maestro = dm.id_clase_recurso
and		dm.id_dominio = 100*cr.id_clase_recurso_maestro+1
and		cr.es_clase_recurso_independiente=0
and		tp.numero_tipo_pagina <= case when cr.es_clase_recurso_sin_detalle = 1 then 1 else 2 end
and		fk.tabname = cr.codigo_clase_recurso
and		fk.refname = bm.codigo_clase_recurso -- OJO: cm -> bm
and		fk.colname = px.codigo_parametro
and		crp.id_clase_recurso = cr.id_clase_recurso
and		crp.id_parametro = px.id_parametro
and		crp.es_parametro_maestro = 1
and		cm.id_clase_recurso = cr.id_clase_recurso_maestro
and		cm.id_clase_recurso = dm.id_clase_recurso
and		dm.id_dominio = 100*cm.id_clase_recurso+1
and		10000*cr.id_clase_recurso+100*fk.colid+tp.numero_tipo_pagina not in (select id_pagina from pagina)
order	by ap.id_aplicacion, cr.id_clase_recurso, tp.numero_tipo_pagina
"
EXECUTE xis @insertst, @selectst
------------------------------------------------------------------------------------------------------------------------
SET @updatest = "
update	pagina
set		descripcion_pagina=nombre_pagina
"
SET @selectst = "
select	id_aplicacion, id_pagina, codigo_pagina, nombre_pagina, numero_tipo_pagina
from	pagina
where	descripcion_pagina is null
order	by 1,2
"
EXECUTE xus @updatest, @selectst, 'where'
------------------------------------------------------------------------------------------------------------------------
END
GO
SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
