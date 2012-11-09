SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
DROP PROCEDURE xisClaseRecursoParametro
GO
CREATE PROCEDURE xisClaseRecursoParametro AS
BEGIN
DECLARE @updatest varchar(8000)
DECLARE @insertst varchar(8000)
DECLARE @selectst varchar(8000)
DECLARE @rehearsal integer
------------------------------------------------------------------------------------------------------------------------
SET @updatest = "
update	clase_recurso_par
set		es_parametro_sincronizado=0
"
SET @selectst = "
select	CRX.codigo_clase_recurso, 
		STB.colid,
		P_X.codigo_parametro, 
		CRP.numero_tipo_parametro,
		CRP.es_parametro_sincronizado
from	clase_recurso_par CRP
inner	join parametro P_X on CRP.id_parametro = P_X.id_parametro
inner	join clase_recurso CRX on CRP.id_clase_recurso = CRX.id_clase_recurso
left	outer join xdbScriptTables STB on STB.tabname = CRX.codigo_clase_recurso and STB.colname = P_X.codigo_parametro
where	STB.colid IS NULL
and		CRP.es_parametro_sincronizado = 1
and		CRX.numero_tipo_clase_recurso = 1
order by 1,2
"
EXECUTE xus @updatest, @selectst, 'from'
------------------------------------------------------------------------------------------------------------------------
SET @selectst = "
select	CRX.codigo_clase_recurso, 
		STB.colid,
		P_X.codigo_parametro, 
		CRP.numero_tipo_parametro,
		CRP.es_parametro_sincronizado
from	clase_recurso_par CRP
inner	join parametro P_X on CRP.id_parametro = P_X.id_parametro
inner	join clase_recurso CRV on CRP.id_clase_recurso = CRV.id_clase_recurso
inner	join clase_recurso CRX on CRX.id_clase_recurso = CRV.id_clase_recurso_base
left	outer join xdbScriptTables STB on STB.tabname = CRX.codigo_clase_recurso and STB.colname = P_X.codigo_parametro
where	STB.colid IS NULL
and		CRP.es_parametro_sincronizado = 1
and		CRV.numero_tipo_clase_recurso = 2
and		CRX.numero_tipo_clase_recurso = 1
order by 1,2
"
EXECUTE xus @updatest, @selectst, 'from'
------------------------------------------------------------------------------------------------------------------------
SELECT 	@rehearsal = id_dual FROM dual 
SET @updatest = "
DELETE FROM clase_recurso_par WHERE es_parametro_sincronizado = 0
"
IF (@rehearsal = 0)
	BEGIN
	PRINT @updatest
	EXEC (@updatest)
	END
------------------------------------------------------------------------------------------------------------------------
SET @insertst = "
INSERT
INTO	clase_recurso_par (id_clase_recurso_par, id_clase_recurso, id_parametro, numero_tipo_parametro)
"
SET @selectst = "
SELECT	dbo.xfnClaseRecursoParametro(id_clase_recurso, colid) AS id_clase_recurso_par, 
		id_clase_recurso, 
--		codigo_clase_recurso, numero_tipo_recurso, colid, colname, 
		id_parametro, 
		case 
--		when colname = 'version' + '_' + tabname then 2 else 3 end as numero_tipo_parametro
		when colname like 'version[_]%' then 2 else 3 end as numero_tipo_parametro
FROM 	clase_recurso CRX
INNER	JOIN xdbJavaDataProviders11 ON tabname = codigo_clase_recurso
INNER	JOIN parametro ON colname = codigo_parametro
WHERE	id_parametro NOT IN (SELECT id_parametro FROM clase_recurso_par where id_clase_recurso = CRX.id_clase_recurso)
ORDER	BY id_clase_recurso, colid
"
EXECUTE xis @insertst, @selectst
END
GO
DROP FUNCTION xfnClaseRecursoParametro
GO
------------------------------------------------------------------------------------------------------------------------
CREATE FUNCTION xfnClaseRecursoParametro(@tabid bigint, @colid integer) RETURNS bigint AS
BEGIN
IF (@tabid IS NULL) RETURN NULL
DECLARE @id1 bigint
DECLARE @id2 bigint
DECLARE @id3 bigint
SET @id1 = 10000*@tabid + 100*@colid
SET @id2 = @id1 + 99
SELECT @id3 = MAX(id_clase_recurso_par) FROM clase_recurso_par WHERE id_clase_recurso_par BETWEEN @id1 AND @id2
IF (@id3 IS NULL) RETURN @id1
RETURN @id3 + 1
END
GO
SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
