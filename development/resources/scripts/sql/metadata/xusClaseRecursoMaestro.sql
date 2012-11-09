SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
DROP PROCEDURE xusClaseRecursoMaestro
GO
CREATE PROCEDURE xusClaseRecursoMaestro AS
BEGIN
DECLARE @clasebase bigint
SELECT	@clasebase = 20000
DECLARE @rehearsal integer
SELECT 	@rehearsal = id_dual FROM dual 
DECLARE	tablenames_cursor CURSOR FOR
select	distinct
		tabclass.id_clase_recurso, tabclass.codigo_clase_recurso, 
		refclass.id_clase_recurso, refclass.codigo_clase_recurso
from	xdbScriptForeignKeys
inner
join	clase_recurso tabclass
on		tabclass.codigo_clase_recurso = tabname
inner
join	clase_recurso refclass
on		refclass.codigo_clase_recurso = refname
where	tabclass.id_clase_recurso > @clasebase
and		tabclass.numero_tipo_recurso = 21
and		refclass.numero_tipo_recurso = 21
order 	by 1,3
OPEN tablenames_cursor
DECLARE @tabid bigint
DECLARE @tabname varchar(30)
DECLARE @refid bigint
DECLARE @refname varchar(30)
DECLARE @pretabid bigint
DECLARE @es integer
SET @pretabid = 0
FETCH NEXT FROM tablenames_cursor INTO @tabid, @tabname, @refid, @refname
WHILE (@@FETCH_STATUS <> -1)
BEGIN
	IF (@@FETCH_STATUS <> -2)
	BEGIN
		IF (@refid = @tabid) SET @es = 1 ELSE SET @es = 0
		PRINT CAST(@tabid AS VARCHAR) + ' ' + @tabname + ' ' + CAST(@refid AS VARCHAR) + ' ' + @refname + ' ' + CAST(@es AS VARCHAR)
		IF (@rehearsal = 0)
			BEGIN
			IF (@pretabid = @tabid AND @refid <> @tabid)
				update	clase_recurso
				set		es_clase_recurso_independiente = 0,
						id_clase_recurso_maestro = NULL
				where	id_clase_recurso = @tabid
				and		id_clase_recurso_maestro IS NOT NULL
				and		id_clase_recurso_maestro <> @tabid
			ELSE
				update	clase_recurso
				set		es_clase_recurso_independiente = @es,
						id_clase_recurso_maestro = @refid
				where	id_clase_recurso = @tabid
			END
		SET @pretabid = @tabid
	END
	FETCH NEXT FROM tablenames_cursor INTO @tabid, @tabname, @refid, @refname
END
CLOSE tablenames_cursor
DEALLOCATE tablenames_cursor
IF (@rehearsal = 0)
--	update	clase_recurso
--	set		es_clase_recurso_independiente = 1
--	where	id_clase_recurso >= @clasebase
--	and		codigo_clase_recurso IN
--	(
--	select	refname
--	from	xdbScriptForeignKeys
--	)
	UPDATE clase_recurso
	SET numero_tipo_recurso = 13
	WHERE id_clase_recurso >= @clasebase
	AND numero_tipo_recurso = 21
	AND es_clase_recurso_independiente = 1
	UPDATE clase_recurso
	SET numero_tipo_recurso = 14
	WHERE id_clase_recurso >= @clasebase
	AND numero_tipo_recurso = 22
	AND es_clase_recurso_independiente = 1
	AND codigo_clase_recurso like '%plus'
	UPDATE clase_recurso
	SET es_clase_recurso_sin_detalle = 1
	WHERE numero_tipo_recurso not in (12,22) 
	AND es_clase_recurso_independiente=0 
	AND es_clase_recurso_sin_detalle=0
	AND codigo_clase_recurso NOT IN (SELECT tabname FROM xdbscripttables WHERE isnullable = 1)
END
GO
SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
