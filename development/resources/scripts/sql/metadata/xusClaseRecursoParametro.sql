SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
DROP PROCEDURE xusClaseRecursoParametro
GO
CREATE PROCEDURE xusClaseRecursoParametro AS
BEGIN
------------------------------------------------------------------------------------------------------------------------
/*
update	clase_recurso_par
set		numero_tipo_valor      = numero_tipo_valor_alternativo,
		id_funcion_referencia  = id_funcion_referencia_alternativa,
		id_lista_valor         = id_lista_valor_alternativa,
		id_clase_objeto_valor  = id_clase_objeto_valor_alternativa,
		id_clase_recurso_valor = id_clase_recurso_valor_alternativa
where	es_parametro_sincronizado=1
and		es_referencia_alternativa=1
*/
------------------------------------------------------------------------------------------------------------------------
DECLARE @updatest varchar(8000)
DECLARE @selectst varchar(8000)
------------------------------------------------------------------------------------------------------------------------
SET @updatest = "
update	clase_recurso_par
set		id_funcion_referencia	= 100100101,
		id_clase_recurso_valor	= 10010,
		numero_tipo_valor		= 23
"
SET @selectst = "
select	CRX.codigo_clase_recurso, 
		P_X.codigo_parametro, 
		CRP.id_funcion_referencia, 
		CRP.id_clase_recurso_valor,
		CRP.numero_tipo_valor
from	clase_recurso_par CRP, parametro P_X, clase_recurso CRX, xdbScriptColumnChecks SCC
where 	CRP.id_parametro		= P_X.id_parametro
and 	CRP.id_clase_recurso	= CRX.id_clase_recurso
and 	SCC.tabname				= CRX.codigo_clase_recurso
and		SCC.colname				= P_X.codigo_parametro
and		(
		SCC.consttext			= '([' + P_X.codigo_parametro + '] = 0 or [' + P_X.codigo_parametro + '] = 1)' or
		SCC.consttext			= '([' + P_X.codigo_parametro + '] = 1 or [' + P_X.codigo_parametro + '] = 0)' or
		SCC.consttext			= '([' + P_X.codigo_parametro + '] >= 0 and [' + P_X.codigo_parametro + '] <= 1)'
		)
and		(
		(
		CRP.id_funcion_referencia	is null or CRP.id_funcion_referencia	<> 100100101
		)
	or
		(
		CRP.id_clase_recurso_valor	is null or CRP.id_clase_recurso_valor	<> 10010
		)
	or
		(
		CRP.numero_tipo_valor		is null or CRP.numero_tipo_valor		<> 23
		)
		)
and		CRX.numero_tipo_clase_recurso = 1
order by 1, 2
"
EXECUTE xus @updatest, @selectst, 'from'
------------------------------------------------------------------------------------------------------------------------
SET @updatest = "
update	clase_recurso_par
set		id_funcion_referencia	= 100100101,
		id_clase_recurso_valor	= 10010,
		numero_tipo_valor		= 23
"
SET @selectst = "
select	CRX.codigo_clase_recurso, 
		P_X.codigo_parametro, 
		CRP.id_funcion_referencia, 
		CRP.id_clase_recurso_valor,
		CRP.numero_tipo_valor
from	clase_recurso_par CRP, parametro P_X, clase_recurso CRV, clase_recurso CRX, xdbScriptColumnChecks SCC
where 	CRP.id_parametro		= P_X.id_parametro
and 	CRP.id_clase_recurso	= CRV.id_clase_recurso
and 	CRX.id_clase_recurso	= CRV.id_clase_recurso_base
and 	SCC.tabname				= CRX.codigo_clase_recurso
and		SCC.colname				= P_X.codigo_parametro
and		(
		SCC.consttext			= '([' + P_X.codigo_parametro + '] = 0 or [' + P_X.codigo_parametro + '] = 1)' or
		SCC.consttext			= '([' + P_X.codigo_parametro + '] = 1 or [' + P_X.codigo_parametro + '] = 0)' or
		SCC.consttext			= '([' + P_X.codigo_parametro + '] >= 0 and [' + P_X.codigo_parametro + '] <= 1)'
		)
and		(
		(
		CRP.id_funcion_referencia	is null or CRP.id_funcion_referencia	<> 100100101
		)
	or
		(
		CRP.id_clase_recurso_valor	is null or CRP.id_clase_recurso_valor	<> 10010
		)
	or
		(
		CRP.numero_tipo_valor		is null or CRP.numero_tipo_valor		<> 23
		)
		)
and		CRV.numero_tipo_clase_recurso = 2
and		CRX.numero_tipo_clase_recurso = 1
order by 1, 2
"
EXECUTE xus @updatest, @selectst, 'from'
------------------------------------------------------------------------------------------------------------------------
SET @updatest = "
update	clase_recurso_par
set		id_funcion_referencia	= F_Y.id_funcion,
		id_clase_recurso_valor	= DFY.id_clase_recurso,
		numero_tipo_valor		= 23
"
SET @selectst = "
select	CRX.codigo_clase_recurso, 
		P_X.codigo_parametro, 
		CRP.id_funcion_referencia, 
		CRP.id_clase_recurso_valor,
		CRP.numero_tipo_valor,
		CRY.codigo_clase_recurso,
		F_Y.codigo_funcion
from	clase_recurso_par CRP, parametro P_X, clase_recurso CRX, xdbScriptForeignKeys SFK, 
		clase_recurso CRY, dominio as DFY, funcion as F_Y
where 	CRP.id_parametro		= P_X.id_parametro
and 	CRP.id_clase_recurso	= CRX.id_clase_recurso
and 	SFK.tabname				= CRX.codigo_clase_recurso
and		SFK.colname				= P_X.codigo_parametro
and 	SFK.refname				= CRY.codigo_clase_recurso
and 	DFY.id_clase_recurso 	= CRY.id_clase_recurso
and 	DFY.id_dominio			= F_Y.id_dominio
and 	F_Y.id_funcion			= 100*F_Y.id_dominio+1 
and		F_Y.numero_tipo_funcion	= 21 
and		(
		(
		CRP.id_funcion_referencia	is null -- or CRP.id_funcion_referencia	<> F_Y.id_funcion
		)
	or
		(
		CRP.id_clase_recurso_valor	is null -- or CRP.id_clase_recurso_valor <> F_Y.id_clase_recurso
		)
		)
and		CRX.numero_tipo_clase_recurso = 1
order by 1, 2
"
EXECUTE xus @updatest, @selectst, 'from'
------------------------------------------------------------------------------------------------------------------------
SET @updatest = "
update	clase_recurso_par
set		id_funcion_referencia	= F_Y.id_funcion,
		id_clase_recurso_valor	= DFY.id_clase_recurso,
		numero_tipo_valor		= 23
"
SET @selectst = "
select	CRX.codigo_clase_recurso, 
		P_X.codigo_parametro, 
		CRP.id_funcion_referencia, 
		CRP.id_clase_recurso_valor,
		CRP.numero_tipo_valor,
		CRY.codigo_clase_recurso,
		F_Y.codigo_funcion
from	clase_recurso_par CRP, parametro P_X, clase_recurso CRV, clase_recurso CRX, xdbScriptForeignKeys SFK, 
		clase_recurso CRY, dominio as DFY, funcion as F_Y
where 	CRP.id_parametro		= P_X.id_parametro
and 	CRP.id_clase_recurso	= CRV.id_clase_recurso
and 	CRX.id_clase_recurso	= CRV.id_clase_recurso_base
and 	SFK.tabname				= CRX.codigo_clase_recurso
and		SFK.colname				= P_X.codigo_parametro
and 	SFK.refname				= CRY.codigo_clase_recurso
and 	DFY.id_clase_recurso 	= CRY.id_clase_recurso
and 	DFY.id_dominio			= F_Y.id_dominio
and 	F_Y.id_funcion			= 100*F_Y.id_dominio+1 
and		F_Y.numero_tipo_funcion	= 21 
and		(
		(
		CRP.id_funcion_referencia	is null -- or CRP.id_funcion_referencia	<> F_Y.id_funcion
		)
	or
		(
		CRP.id_clase_recurso_valor	is null -- or CRP.id_clase_recurso_valor <> F_Y.id_clase_recurso
		)
		)
and		CRV.numero_tipo_clase_recurso = 2
and		CRX.numero_tipo_clase_recurso = 1
order by 1, 2
"
EXECUTE xus @updatest, @selectst, 'from'
------------------------------------------------------------------------------------------------------------------------
--		clave primaria NO gestión manual -> parametro obligatorio y primordial
------------------------------------------------------------------------------------------------------------------------
SET @updatest = "
update	clase_recurso_par
set		numero_tipo_parametro=1, es_parametro_primordial=1
"
SET @selectst = "
select	CRX.codigo_clase_recurso, 
		SPK.keyno,
		P_X.codigo_parametro, 
		CRP.numero_tipo_parametro
from	clase_recurso_par CRP, parametro P_X, clase_recurso CRX, xdbScriptPrimaryKeys SPK
where 	CRP.id_parametro		= P_X.id_parametro
and 	CRP.id_clase_recurso	= CRX.id_clase_recurso
and 	SPK.tabname				= CRX.codigo_clase_recurso
and		SPK.colname				= P_X.codigo_parametro
and		CRP.numero_tipo_parametro <> 1
and		CRP.es_parametro_sincronizado = 0
and		CRX.numero_tipo_clase_recurso = 1
and		CRX.numero_tipo_recurso <> 21
order by 1, 2
"
EXECUTE xus @updatest, @selectst, 'from'
SET @selectst = "
select	CRX.codigo_clase_recurso, 
		SPK.keyno,
		P_X.codigo_parametro, 
		CRP.numero_tipo_parametro
from	clase_recurso_par CRP, parametro P_X, clase_recurso CRV, clase_recurso CRX, xdbScriptPrimaryKeys SPK
where 	CRP.id_parametro		= P_X.id_parametro
and 	CRP.id_clase_recurso	= CRV.id_clase_recurso
and 	CRX.id_clase_recurso	= CRV.id_clase_recurso_base
and 	SPK.tabname				= CRX.codigo_clase_recurso
and		SPK.colname				= P_X.codigo_parametro
and		CRP.numero_tipo_parametro <> 1
and		CRP.es_parametro_sincronizado = 0
and		CRV.numero_tipo_clase_recurso = 2
and		CRV.numero_tipo_recurso <> 21
and		CRX.numero_tipo_clase_recurso = 1
order by 1, 2
"
EXECUTE xus @updatest, @selectst, 'from'
------------------------------------------------------------------------------------------------------------------------
--		clave primaria de gestión manual -> parametro obligatorio y NO primordial (crear en P2)
------------------------------------------------------------------------------------------------------------------------
SET @updatest = "
update	clase_recurso_par
set		numero_tipo_parametro=1, es_parametro_primordial=0
"
SET @selectst = "
select	CRX.codigo_clase_recurso, 
		SPK.keyno,
		P_X.codigo_parametro, 
		CRP.numero_tipo_parametro
from	clase_recurso_par CRP, parametro P_X, clase_recurso CRX, xdbScriptPrimaryKeys SPK
where 	CRP.id_parametro		= P_X.id_parametro
and 	CRP.id_clase_recurso	= CRX.id_clase_recurso
and 	SPK.tabname				= CRX.codigo_clase_recurso
and		SPK.colname				= P_X.codigo_parametro
and		CRP.numero_tipo_parametro <> 1
and		CRP.es_parametro_sincronizado = 0
and		CRX.numero_tipo_clase_recurso = 1
and		CRX.numero_tipo_recurso = 21
order by 1, 2
"
EXECUTE xus @updatest, @selectst, 'from'
SET @selectst = "
select	CRX.codigo_clase_recurso, 
		SPK.keyno,
		P_X.codigo_parametro, 
		CRP.numero_tipo_parametro
from	clase_recurso_par CRP, parametro P_X, clase_recurso CRV, clase_recurso CRX, xdbScriptPrimaryKeys SPK
where 	CRP.id_parametro		= P_X.id_parametro
and 	CRP.id_clase_recurso	= CRV.id_clase_recurso
and 	CRX.id_clase_recurso	= CRV.id_clase_recurso_base
and 	SPK.tabname				= CRX.codigo_clase_recurso
and		SPK.colname				= P_X.codigo_parametro
and		CRP.numero_tipo_parametro <> 1
and		CRP.es_parametro_sincronizado = 0
and		CRV.numero_tipo_clase_recurso = 2
and		CRV.numero_tipo_recurso = 21
and		CRX.numero_tipo_clase_recurso = 1
order by 1, 2
"
EXECUTE xus @updatest, @selectst, 'from'
------------------------------------------------------------------------------------------------------------------------
--		columna no nula y sin default -> parametro obligatorio
------------------------------------------------------------------------------------------------------------------------
SET @updatest = "
update	clase_recurso_par
set		numero_tipo_parametro=1, es_parametro_primordial=1
"
SET @selectst = "
select	CRX.codigo_clase_recurso, 
		STB.colid,
		P_X.codigo_parametro, 
		CRP.numero_tipo_parametro
from	clase_recurso_par CRP, parametro P_X, clase_recurso CRX, xdbScriptTables STB
where 	CRP.id_parametro		= P_X.id_parametro
and 	CRP.id_clase_recurso	= CRX.id_clase_recurso
and 	STB.tabname				= CRX.codigo_clase_recurso
and		STB.colname				= P_X.codigo_parametro
and		STB.isnullable			= 0
and		STB.colid not in (select colid from xdbScriptColumnDefaults where tabname = STB.tabname)
and		CRP.numero_tipo_parametro <> 1
and		CRP.es_parametro_sincronizado = 0
and		CRX.numero_tipo_clase_recurso = 1
order by 1, 2
"
EXECUTE xus @updatest, @selectst, 'from'
SET @selectst = "
select	CRX.codigo_clase_recurso, 
		STB.colid,
		P_X.codigo_parametro, 
		CRP.numero_tipo_parametro
from	clase_recurso_par CRP, parametro P_X, clase_recurso CRV, clase_recurso CRX, xdbScriptTables STB
where 	CRP.id_parametro		= P_X.id_parametro
and 	CRP.id_clase_recurso	= CRV.id_clase_recurso
and 	CRX.id_clase_recurso	= CRV.id_clase_recurso_base
and 	STB.tabname				= CRX.codigo_clase_recurso
and		STB.colname				= P_X.codigo_parametro
and		STB.isnullable			= 0
and		STB.colid not in (select colid from xdbScriptColumnDefaults where tabname = STB.tabname)
and		CRP.numero_tipo_parametro <> 1
and		CRP.es_parametro_sincronizado = 0
and		CRV.numero_tipo_clase_recurso = 2
and		CRX.numero_tipo_clase_recurso = 1
order by 1, 2
"
EXECUTE xus @updatest, @selectst, 'from'
------------------------------------------------------------------------------------------------------------------------
--		columna autonumerica -> parametro programatico
------------------------------------------------------------------------------------------------------------------------
SET @updatest = "
update	clase_recurso_par
set		numero_tipo_parametro=4
"
SET @selectst = "
select	CRX.codigo_clase_recurso, 
		STB.colid,
		P_X.codigo_parametro, 
		CRP.numero_tipo_parametro
from	clase_recurso_par CRP, parametro P_X, clase_recurso CRX, xdbScriptTables STB
where 	CRP.id_parametro		= P_X.id_parametro
and 	CRP.id_clase_recurso	= CRX.id_clase_recurso
and 	STB.tabname				= CRX.codigo_clase_recurso
and		STB.colname				= P_X.codigo_parametro
-- and	STB.isnullable			= 0
and		STB.autonumber			= 1
and		CRP.numero_tipo_parametro <> 4
and		CRP.es_parametro_sincronizado = 0
and		CRX.numero_tipo_clase_recurso = 1
order by 1, 2
"
EXECUTE xus @updatest, @selectst, 'from'
SET @selectst = "
select	CRX.codigo_clase_recurso, 
		STB.colid,
		P_X.codigo_parametro, 
		CRP.numero_tipo_parametro
from	clase_recurso_par CRP, parametro P_X, clase_recurso CRV, clase_recurso CRX, xdbScriptTables STB
where 	CRP.id_parametro		= P_X.id_parametro
and 	CRP.id_clase_recurso	= CRV.id_clase_recurso
and 	CRX.id_clase_recurso	= CRV.id_clase_recurso_base
and 	STB.tabname				= CRX.codigo_clase_recurso
and		STB.colname				= P_X.codigo_parametro
-- and	STB.isnullable			= 0
and		STB.autonumber			= 1
and		CRP.numero_tipo_parametro <> 4
and		CRP.es_parametro_sincronizado = 0
and		CRV.numero_tipo_clase_recurso = 2
and		CRX.numero_tipo_clase_recurso = 1
order by 1, 2
"
EXECUTE xus @updatest, @selectst, 'from'
------------------------------------------------------------------------------------------------------------------------
--		columna programatica -> parametro programatico
------------------------------------------------------------------------------------------------------------------------
SET @updatest = "
update	clase_recurso_par
set		numero_tipo_parametro=4
"
SET @selectst = "
select	CRX.codigo_clase_recurso, 
		STB.colid,
		P_X.codigo_parametro, 
		CRP.numero_tipo_parametro
from	clase_recurso_par CRP, parametro P_X, clase_recurso CRX, xdbScriptTables STB
where 	CRP.id_parametro		= P_X.id_parametro
and 	CRP.id_clase_recurso	= CRX.id_clase_recurso
and 	STB.tabname				= CRX.codigo_clase_recurso
and		STB.colname				= P_X.codigo_parametro
and		P_X.codigo_parametro not in (select colname from xdbScriptPrimaryKeys where tabname = CRX.codigo_clase_recurso)
and		CRP.id_parametro in
(
select	funcion_parametro.id_parametro
from	dominio, funcion, funcion_parametro
where	dominio.id_clase_recurso = CRX.id_clase_recurso
and		funcion.id_dominio = dominio.id_dominio
and		funcion.numero_tipo_funcion = 13
and		funcion.es_programatica = 0
and		funcion_parametro.id_funcion = funcion.id_funcion
)
and		CRP.numero_tipo_parametro <> 4
and		CRP.es_parametro_sincronizado = 0
and		CRX.numero_tipo_clase_recurso = 1
order by 1, 2
"
EXECUTE xus @updatest, @selectst, 'from'
SET @selectst = "
select	CRX.codigo_clase_recurso, 
		STB.colid,
		P_X.codigo_parametro, 
		CRP.numero_tipo_parametro
from	clase_recurso_par CRP, parametro P_X, clase_recurso CRV, clase_recurso CRX, xdbScriptTables STB
where 	CRP.id_parametro		= P_X.id_parametro
and 	CRP.id_clase_recurso	= CRX.id_clase_recurso
and 	STB.tabname				= CRX.codigo_clase_recurso
and		STB.colname				= P_X.codigo_parametro
and		P_X.codigo_parametro not in (select colname from xdbScriptPrimaryKeys where tabname = CRX.codigo_clase_recurso)
and		CRP.id_parametro in
(
select	funcion_parametro.id_parametro
from	dominio, funcion, funcion_parametro
where	dominio.id_clase_recurso = CRV.id_clase_recurso
and 	CRX.id_clase_recurso = CRV.id_clase_recurso_base
and		funcion.id_dominio = dominio.id_dominio
and		funcion.numero_tipo_funcion = 13
and		funcion.es_programatica = 0
and		funcion_parametro.id_funcion = funcion.id_funcion
)
and		CRP.numero_tipo_parametro <> 4
and		CRP.es_parametro_sincronizado = 0
and		CRV.numero_tipo_clase_recurso = 2
and		CRX.numero_tipo_clase_recurso = 1
order by 1, 2
"
EXECUTE xus @updatest, @selectst, 'from'
------------------------------------------------------------------------------------------------------------------------
SET @updatest = "
update	clase_recurso_par
set		es_parametro_sincronizado=1
"
SET @selectst = "
select	CRX.codigo_clase_recurso, 
		STB.colid,
		P_X.codigo_parametro, 
		CRP.numero_tipo_parametro
from	clase_recurso_par CRP, parametro P_X, clase_recurso CRX, xdbScriptTables STB
where 	CRP.id_parametro		= P_X.id_parametro
and 	CRP.id_clase_recurso	= CRX.id_clase_recurso
and 	STB.tabname				= CRX.codigo_clase_recurso
and		STB.colname				= P_X.codigo_parametro
and		CRP.es_parametro_sincronizado = 0
and		CRX.numero_tipo_clase_recurso = 1
order by 1,2
"
EXECUTE xus @updatest, @selectst, 'from'
------------------------------------------------------------------------------------------------------------------------
SET @updatest = "
update	clase_recurso_par
set		es_parametro_sincronizado=1
"
SET @selectst = "
select	CRX.codigo_clase_recurso, 
		STB.colid,
		P_X.codigo_parametro, 
		CRP.numero_tipo_parametro
from	clase_recurso_par CRP, parametro P_X, clase_recurso CRV, clase_recurso CRX, xdbScriptTables STB
where 	CRP.id_parametro		= P_X.id_parametro
and 	CRP.id_clase_recurso	= CRV.id_clase_recurso
and 	CRX.id_clase_recurso	= CRV.id_clase_recurso_base
and 	STB.tabname				= CRX.codigo_clase_recurso
and		STB.colname				= P_X.codigo_parametro
and		CRP.es_parametro_sincronizado = 0
and		CRV.numero_tipo_clase_recurso = 2
and		CRX.numero_tipo_clase_recurso = 1
order by 1,2
"
EXECUTE xus @updatest, @selectst, 'from'
------------------------------------------------------------------------------------------------------------------------
END
GO
SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
