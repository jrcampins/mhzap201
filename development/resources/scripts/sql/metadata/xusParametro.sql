SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
DROP PROCEDURE xusParametro
GO
CREATE PROCEDURE xusParametro AS
BEGIN
DECLARE @updatest varchar(8000)
DECLARE @selectst varchar(8000)
------------------------------------------------------------------------------------------------------------------------
SET @updatest = "
update	parametro
set		nombre_parametro = REPLACE(nombre_parametro,'es ','')
"
SET @selectst = "
select	codigo_parametro, nombre_parametro, REPLACE(nombre_parametro,'es ','')
from	parametro
where	codigo_parametro like'es%'
and		nombre_parametro like'es %'
order by 1
"
EXECUTE xus @updatest, @selectst, 'where'
------------------------------------------------------------------------------------------------------------------------
SET @updatest = "
update	parametro
set		nombre_parametro = REPLACE(nombre_parametro,'id ','')
"
SET @selectst = "
select	codigo_parametro, nombre_parametro, REPLACE(nombre_parametro,'id ','')
from	parametro
where	codigo_parametro like'id%'
and		nombre_parametro like'id %'
order by 1
"
EXECUTE xus @updatest, @selectst, 'where'
------------------------------------------------------------------------------------------------------------------------
SET @updatest = "
update	parametro
set		nombre_parametro = REPLACE(nombre_parametro,'número ','')
"
SET @selectst = "
select	codigo_parametro, nombre_parametro, REPLACE(nombre_parametro,'número ','')
from	parametro
where	codigo_parametro like'numero%'
and		nombre_parametro like'número %'
and		codigo_parametro in (select colname from xdbScriptTables where colid=1)
order by 1
"
EXECUTE xus @updatest, @selectst, 'where'
------------------------------------------------------------------------------------------------------------------------
SET @updatest = "
update	parametro
set		nombre_parametro = dbo.xfnNombrePropio('_' + nombre_parametro)
"
SET @selectst = "
select	codigo_parametro, nombre_parametro, dbo.xfnNombrePropio('_' + nombre_parametro)
from	parametro
where	nombre_parametro <> dbo.xfnNombrePropio('_' + nombre_parametro)
order by 1
"
EXECUTE xus @updatest, @selectst, 'where'
------------------------------------------------------------------------------------------------------------------------
SET @updatest = "
update	parametro
set		detalle_parametro = LOWER(nombre_parametro)
"
SET @selectst = "
select	codigo_parametro, nombre_parametro, detalle_parametro
from	parametro
where	detalle_parametro is null
order by 1
"
EXECUTE xus @updatest, @selectst, 'where'
------------------------------------------------------------------------------------------------------------------------
SET @updatest = "
update	parametro
set		descripcion_parametro = coldescription
"
SET @selectst = "
select	codigo_parametro, descripcion_parametro, coldescription
from	parametro, xdbScriptTables
where	codigo_parametro = colname
and		descripcion_parametro is null
and		coldescription is not null
and		coldescription not like '%(*)%'
order by 1
"
EXECUTE xus @updatest, @selectst, 'from'
END
GO
SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
