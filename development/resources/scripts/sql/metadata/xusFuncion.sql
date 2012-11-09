SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
DROP PROCEDURE xusFuncion
GO
CREATE PROCEDURE xusFuncion AS
BEGIN
DECLARE @updatest varchar(8000)
DECLARE @selectst varchar(8000)
------------------------------------------------------------------------------------------------------------------------
SET @updatest = "
update	funcion 
set		nombre_funcion=dbo.xfnNombrePropio('_' + codigo_funcion)
"
SET @selectst = "
select	funcion.codigo_funcion, funcion.nombre_funcion, dbo.xfnNombrePropio('_' + codigo_funcion) as nombre_propio
from	funcion
where 	funcion.nombre_funcion is null -- or funcion.nombre_funcion <> dbo.xfnNombrePropio('_' + codigo_funcion)
order	by 1
"
EXECUTE xus @updatest, @selectst, 'where'
------------------------------------------------------------------------------------------------------------------------
SET @updatest = "
update	funcion 
set		funcion.clausula_order=xdbScriptTables.colname
"
SET @selectst = "
select	funcion.codigo_funcion, xdbScriptTables.colname, funcion.clausula_order, xdbScriptTables.colname
from	funcion, dominio, xdbScriptTables 
where 	funcion.numero_tipo_funcion IN (21,22,23)
and		funcion.clausula_order is null
and		dominio.id_dominio=funcion.id_dominio 
and		xdbScriptTables.tabname=dominio.codigo_dominio 
and		xdbScriptTables.colid=1
order	by 1
"
EXECUTE xus @updatest, @selectst, 'from'
------------------------------------------------------------------------------------------------------------------------
SET @updatest = "
update	funcion 
set		funcion.clausula_order=syscolumns.name
"
SET @selectst = "
select	funcion.codigo_funcion, syscolumns.name, funcion.clausula_order, syscolumns.name
from	funcion, dominio, sysobjects, syscolumns
where 	funcion.numero_tipo_funcion IN (21,22,23)
and		funcion.clausula_order is null
and		dominio.id_dominio=funcion.id_dominio 
and		sysobjects.xtype='V'
and		sysobjects.name=dominio.codigo_dominio
and		sysobjects.id = syscolumns.id 
and		syscolumns.colid=1
order 	by 1
"
EXECUTE xus @updatest, @selectst, 'from'
------------------------------------------------------------------------------------------------------------------------
END
GO
SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
