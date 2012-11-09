SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
DROP PROCEDURE xusFuncionParametro
GO
CREATE PROCEDURE xusFuncionParametro AS
BEGIN
DECLARE @updatest varchar(8000)
DECLARE @selectst varchar(8000)
------------------------------------------------------------------------------------------------------------------------
SET @updatest = "
update	funcion_parametro
set		id_funcion_referencia	= 100100101,
		id_clase_recurso_valor	= 10010,
		numero_tipo_valor		= 23
"
SET @selectst = "
select	CRX.codigo_clase_recurso, 
		P_X.codigo_parametro, 
		F_X.codigo_funcion,		
		FPX.id_funcion_referencia, 
		FPX.id_clase_recurso_valor,
		FPX.numero_tipo_valor
from	funcion_parametro FPX, parametro P_X, funcion as F_X, dominio as DFX, clase_recurso CRX, xdbScriptColumnChecks SCC
where 	FPX.id_parametro		= P_X.id_parametro
and 	FPX.id_funcion			= F_X.id_funcion
and 	DFX.id_dominio			= F_X.id_dominio
and 	DFX.id_clase_recurso 	= CRX.id_clase_recurso
and 	SCC.tabname				= CRX.codigo_clase_recurso
and		SCC.colname				= P_X.codigo_parametro
and		(
		SCC.consttext			= '([' + P_X.codigo_parametro + '] = 0 or [' + P_X.codigo_parametro + '] = 1)' or
		SCC.consttext			= '([' + P_X.codigo_parametro + '] = 1 or [' + P_X.codigo_parametro + '] = 0)' or
		SCC.consttext			= '([' + P_X.codigo_parametro + '] >= 0 and [' + P_X.codigo_parametro + '] <= 1)'
		)
and		(
		(
		FPX.id_funcion_referencia	is null or FPX.id_funcion_referencia	<> 100100101
		)
	or
		(
		FPX.id_clase_recurso_valor	is null or FPX.id_clase_recurso_valor	<> 10010
		)
	or
		(
		FPX.numero_tipo_valor		is null or FPX.numero_tipo_valor		<> 23
		)
		)
and		CRX.numero_tipo_clase_recurso = 1
order by 1, 2, 3, 4
"
EXECUTE xus @updatest, @selectst, 'from'
------------------------------------------------------------------------------------------------------------------------
SET @selectst = "
select	CRX.codigo_clase_recurso, 
		P_X.codigo_parametro, 
		F_X.codigo_funcion,		
		FPX.id_funcion_referencia, 
		FPX.id_clase_recurso_valor,
		FPX.numero_tipo_valor
from	funcion_parametro FPX, parametro P_X, funcion as F_X, dominio as DFX, clase_recurso CRV, clase_recurso CRX, xdbScriptColumnChecks SCC
where 	FPX.id_parametro		= P_X.id_parametro
and 	FPX.id_funcion			= F_X.id_funcion
and 	DFX.id_dominio			= F_X.id_dominio
and 	DFX.id_clase_recurso 	= CRV.id_clase_recurso
and 	CRX.id_clase_recurso 	= CRV.id_clase_recurso_base
and 	SCC.tabname				= CRX.codigo_clase_recurso
and		SCC.colname				= P_X.codigo_parametro
and		(
		SCC.consttext			= '([' + P_X.codigo_parametro + '] = 0 or [' + P_X.codigo_parametro + '] = 1)' or
		SCC.consttext			= '([' + P_X.codigo_parametro + '] = 1 or [' + P_X.codigo_parametro + '] = 0)' or
		SCC.consttext			= '([' + P_X.codigo_parametro + '] >= 0 and [' + P_X.codigo_parametro + '] <= 1)'
		)
and		(
		(
		FPX.id_funcion_referencia	is null or FPX.id_funcion_referencia	<> 100100101
		)
	or
		(
		FPX.id_clase_recurso_valor	is null or FPX.id_clase_recurso_valor	<> 10010
		)
	or
		(
		FPX.numero_tipo_valor		is null or FPX.numero_tipo_valor		<> 23
		)
		)
and		CRV.numero_tipo_clase_recurso = 2
and		CRX.numero_tipo_clase_recurso = 1
order by 1, 2, 3, 4
"
EXECUTE xus @updatest, @selectst, 'from'
------------------------------------------------------------------------------------------------------------------------
SET @updatest = "
update	funcion_parametro
set		id_funcion_referencia	= F_Y.id_funcion,
		id_clase_recurso_valor	= DFY.id_clase_recurso,
		numero_tipo_valor		= 23
"
SET @selectst = "
select	CRX.codigo_clase_recurso, 
		P_X.codigo_parametro, 
		F_X.codigo_funcion,		
		FPX.id_funcion_referencia, 
		FPX.id_clase_recurso_valor,
		FPX.numero_tipo_valor,
		CRY.codigo_clase_recurso,
		F_Y.codigo_funcion
from	funcion_parametro FPX, parametro P_X, funcion as F_X, dominio as DFX, clase_recurso CRX, xdbScriptForeignKeys SFK, 
		clase_recurso CRY, dominio as DFY, funcion as F_Y
where 	FPX.id_parametro		= P_X.id_parametro
and 	FPX.id_funcion			= F_X.id_funcion
and 	DFX.id_dominio			= F_X.id_dominio
and 	DFX.id_clase_recurso 	= CRX.id_clase_recurso
and 	SFK.tabname				= CRX.codigo_clase_recurso
and		SFK.colname				= P_X.codigo_parametro
and 	SFK.refname				= CRY.codigo_clase_recurso
and 	DFY.id_clase_recurso 	= CRY.id_clase_recurso
and 	DFY.id_dominio			= F_Y.id_dominio
and 	F_Y.id_funcion			= 100*F_Y.id_dominio+1 
and		F_Y.numero_tipo_funcion	= 21 
and		(
		(
		FPX.id_funcion_referencia	is null -- or FPX.id_funcion_referencia	<> F_Y.id_funcion
		)
	or
		(
		FPX.id_clase_recurso_valor	is null -- or FPX.id_clase_recurso_valor <> F_Y.id_clase_recurso
		)
		)
and		CRX.numero_tipo_clase_recurso = 1
order by 1, 2, 3, 4
"
EXECUTE xus @updatest, @selectst, 'from'
------------------------------------------------------------------------------------------------------------------------
SET @selectst = "
select	CRX.codigo_clase_recurso, 
		P_X.codigo_parametro, 
		F_X.codigo_funcion,		
		FPX.id_funcion_referencia, 
		FPX.id_clase_recurso_valor,
		FPX.numero_tipo_valor,
		CRY.codigo_clase_recurso,
		F_Y.codigo_funcion
from	funcion_parametro FPX, parametro P_X, funcion as F_X, dominio as DFX, clase_recurso CRV, clase_recurso CRX, xdbScriptForeignKeys SFK, 
		clase_recurso CRY, dominio as DFY, funcion as F_Y
where 	FPX.id_parametro		= P_X.id_parametro
and 	FPX.id_funcion			= F_X.id_funcion
and 	DFX.id_dominio			= F_X.id_dominio
and 	DFX.id_clase_recurso 	= CRV.id_clase_recurso
and 	CRX.id_clase_recurso 	= CRV.id_clase_recurso_base
and 	SFK.tabname				= CRX.codigo_clase_recurso
and		SFK.colname				= P_X.codigo_parametro
and 	SFK.refname				= CRY.codigo_clase_recurso
and 	DFY.id_clase_recurso 	= CRY.id_clase_recurso
and 	DFY.id_dominio			= F_Y.id_dominio
and 	F_Y.id_funcion			= 100*F_Y.id_dominio+1 
and		F_Y.numero_tipo_funcion	= 21 
and		(
		(
		FPX.id_funcion_referencia	is null -- or FPX.id_funcion_referencia	<> F_Y.id_funcion
		)
	or
		(
		FPX.id_clase_recurso_valor	is null -- or FPX.id_clase_recurso_valor <> F_Y.id_clase_recurso
		)
		)
and		CRV.numero_tipo_clase_recurso = 2
and		CRX.numero_tipo_clase_recurso = 1
order by 1, 2, 3, 4
"
EXECUTE xus @updatest, @selectst, 'from'
------------------------------------------------------------------------------------------------------------------------
SET @updatest = "
update	funcion_parametro
set		numero_tipo_parametro=3
"
SET @selectst = "
select	CRX.codigo_clase_recurso, 
		P_X.codigo_parametro, 
		F_X.codigo_funcion,		
		F_X.numero_tipo_funcion,		
		FPX.numero_tipo_parametro
from	funcion_parametro FPX, parametro P_X, funcion as F_X, dominio as DFX, clase_recurso CRX, xdbScriptPrimaryKeys SPK
where 	FPX.id_parametro		= P_X.id_parametro
and 	FPX.id_funcion			= F_X.id_funcion
and 	DFX.id_dominio			= F_X.id_dominio
and 	DFX.id_clase_recurso 	= CRX.id_clase_recurso
and 	SPK.tabname				= CRX.codigo_clase_recurso
and		SPK.colname				= P_X.codigo_parametro
and		F_X.numero_tipo_funcion	= 21 -- in (21,22,23)
and		FPX.numero_tipo_parametro <> 3
and		CRX.numero_tipo_clase_recurso = 1
order by 1, 2, 3, 4
"
EXECUTE xus @updatest, @selectst, 'from'
------------------------------------------------------------------------------------------------------------------------
SET @selectst = "
select	CRX.codigo_clase_recurso, 
		P_X.codigo_parametro, 
		F_X.codigo_funcion,		
		F_X.numero_tipo_funcion,		
		FPX.numero_tipo_parametro
from	funcion_parametro FPX, parametro P_X, funcion as F_X, dominio as DFX, clase_recurso CRV, clase_recurso CRX, xdbScriptPrimaryKeys SPK
where 	FPX.id_parametro		= P_X.id_parametro
and 	FPX.id_funcion			= F_X.id_funcion
and 	DFX.id_dominio			= F_X.id_dominio
and 	DFX.id_clase_recurso 	= CRV.id_clase_recurso
and 	CRX.id_clase_recurso 	= CRV.id_clase_recurso_base
and 	SPK.tabname				= CRX.codigo_clase_recurso
and		SPK.colname				= P_X.codigo_parametro
and		F_X.numero_tipo_funcion	= 21 -- in (21,22,23)
and		FPX.numero_tipo_parametro <> 3
and		CRV.numero_tipo_clase_recurso = 2
and		CRX.numero_tipo_clase_recurso = 1
order by 1, 2, 3, 4
"
EXECUTE xus @updatest, @selectst, 'from'
------------------------------------------------------------------------------------------------------------------------
SET @updatest = "
update	funcion_parametro
set		numero_tipo_parametro=1
"
SET @selectst = "
select	CRX.codigo_clase_recurso, 
		P_X.codigo_parametro, 
		F_X.codigo_funcion,		
		F_X.numero_tipo_funcion,		
		FPX.numero_tipo_parametro
from	funcion_parametro FPX, parametro P_X, funcion as F_X, dominio as DFX, clase_recurso CRX, xdbScriptPrimaryKeys SPK
where 	FPX.id_parametro		= P_X.id_parametro
and 	FPX.id_funcion			= F_X.id_funcion
and 	DFX.id_dominio			= F_X.id_dominio
and 	DFX.id_clase_recurso 	= CRX.id_clase_recurso
and 	SPK.tabname				= CRX.codigo_clase_recurso
and		SPK.colname				= P_X.codigo_parametro
and		F_X.numero_tipo_funcion	in (31,32,33)
and		FPX.numero_tipo_parametro not in (1,4) -- ¿<> 1?
and		CRX.numero_tipo_clase_recurso = 1
order by 1, 2, 3, 4
"
EXECUTE xus @updatest, @selectst, 'from'
------------------------------------------------------------------------------------------------------------------------
SET @selectst = "
select	CRX.codigo_clase_recurso, 
		P_X.codigo_parametro, 
		F_X.codigo_funcion,		
		F_X.numero_tipo_funcion,		
		FPX.numero_tipo_parametro
from	funcion_parametro FPX, parametro P_X, funcion as F_X, dominio as DFX, clase_recurso CRV, clase_recurso CRX, xdbScriptPrimaryKeys SPK
where 	FPX.id_parametro		= P_X.id_parametro
and 	FPX.id_funcion			= F_X.id_funcion
and 	DFX.id_dominio			= F_X.id_dominio
and 	DFX.id_clase_recurso 	= CRV.id_clase_recurso
and 	CRX.id_clase_recurso 	= CRV.id_clase_recurso_base
and 	SPK.tabname				= CRX.codigo_clase_recurso
and		SPK.colname				= P_X.codigo_parametro
and		F_X.numero_tipo_funcion	in (31,32,33)
and		FPX.numero_tipo_parametro not in (1,4) -- ¿<> 1?
and		CRV.numero_tipo_clase_recurso = 2
and		CRX.numero_tipo_clase_recurso = 1
order by 1, 2, 3, 4
"
EXECUTE xus @updatest, @selectst, 'from'
------------------------------------------------------------------------------------------------------------------------
SET @updatest = "
update	funcion_parametro
set		numero_tipo_parametro=1
"
SET @selectst = "
select	CRX.codigo_clase_recurso, 
		P_X.codigo_parametro, 
		F_X.codigo_funcion,		
		F_X.numero_tipo_funcion,		
		FPX.numero_tipo_parametro
from	funcion_parametro FPX, parametro P_X, funcion as F_X, dominio as DFX, clase_recurso CRX, xdbScriptTables STB
where 	FPX.id_parametro		= P_X.id_parametro
and 	FPX.id_funcion			= F_X.id_funcion
and 	DFX.id_dominio			= F_X.id_dominio
and 	DFX.id_clase_recurso 	= CRX.id_clase_recurso
and 	STB.tabname				= CRX.codigo_clase_recurso
and		STB.colname				= P_X.codigo_parametro
and		STB.isnullable			= 0
and		F_X.numero_tipo_funcion	in (31,32)
and		FPX.numero_tipo_parametro not in (1,4) -- ¿<> 1?
and		CRX.numero_tipo_clase_recurso = 1
order by 1, 2, 3, 4
"
EXECUTE xus @updatest, @selectst, 'from'
------------------------------------------------------------------------------------------------------------------------
SET @selectst = "
select	CRX.codigo_clase_recurso, 
		P_X.codigo_parametro, 
		F_X.codigo_funcion,		
		F_X.numero_tipo_funcion,		
		FPX.numero_tipo_parametro
from	funcion_parametro FPX, parametro P_X, funcion as F_X, dominio as DFX, clase_recurso CRV, clase_recurso CRX, xdbScriptTables STB
where 	FPX.id_parametro		= P_X.id_parametro
and 	FPX.id_funcion			= F_X.id_funcion
and 	DFX.id_dominio			= F_X.id_dominio
and 	DFX.id_clase_recurso 	= CRV.id_clase_recurso
and 	CRX.id_clase_recurso 	= CRV.id_clase_recurso_base
and 	STB.tabname				= CRX.codigo_clase_recurso
and		STB.colname				= P_X.codigo_parametro
and		STB.isnullable			= 0
and		F_X.numero_tipo_funcion	in (31,32)
and		FPX.numero_tipo_parametro not in (1,4) -- ¿<> 1?
and		CRV.numero_tipo_clase_recurso = 2
and		CRX.numero_tipo_clase_recurso = 1
order by 1, 2, 3, 4
"
EXECUTE xus @updatest, @selectst, 'from'
------------------------------------------------------------------------------------------------------------------------
SET @updatest = "
update	funcion_parametro
set		numero_tipo_parametro=4
"
SET @selectst = "
select	CRX.codigo_clase_recurso, 
		P_X.codigo_parametro, 
		F_X.codigo_funcion,		
		F_X.numero_tipo_funcion,		
		FPX.numero_tipo_parametro
from	funcion_parametro FPX, parametro P_X, funcion as F_X, dominio as DFX, clase_recurso CRX, xdbScriptTables STB
where 	FPX.id_parametro		= P_X.id_parametro
and 	FPX.id_funcion			= F_X.id_funcion
and 	DFX.id_dominio			= F_X.id_dominio
and 	DFX.id_clase_recurso 	= CRX.id_clase_recurso
and 	STB.tabname				= CRX.codigo_clase_recurso
and		STB.colname				= P_X.codigo_parametro
and		STB.isnullable			= 0
and		STB.autonumber			= 1
and		F_X.numero_tipo_funcion = 31
and		FPX.numero_tipo_parametro <> 4
and		CRX.numero_tipo_clase_recurso = 1
order by 1, 2, 3, 4
"
EXECUTE xus @updatest, @selectst, 'from'
------------------------------------------------------------------------------------------------------------------------
SET @selectst = "
select	CRX.codigo_clase_recurso, 
		P_X.codigo_parametro, 
		F_X.codigo_funcion,		
		F_X.numero_tipo_funcion,		
		FPX.numero_tipo_parametro
from	funcion_parametro FPX, parametro P_X, funcion as F_X, dominio as DFX, clase_recurso CRV, clase_recurso CRX, xdbScriptTables STB
where 	FPX.id_parametro		= P_X.id_parametro
and 	FPX.id_funcion			= F_X.id_funcion
and 	DFX.id_dominio			= F_X.id_dominio
and 	DFX.id_clase_recurso 	= CRV.id_clase_recurso
and 	CRX.id_clase_recurso 	= CRV.id_clase_recurso_base
and 	STB.tabname				= CRX.codigo_clase_recurso
and		STB.colname				= P_X.codigo_parametro
and		STB.isnullable			= 0
and		STB.autonumber			= 1
and		F_X.numero_tipo_funcion = 31
and		FPX.numero_tipo_parametro <> 4
and		CRV.numero_tipo_clase_recurso = 2
and		CRX.numero_tipo_clase_recurso = 1
order by 1, 2, 3, 4
"
EXECUTE xus @updatest, @selectst, 'from'
------------------------------------------------------------------------------------------------------------------------
END
GO
SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
