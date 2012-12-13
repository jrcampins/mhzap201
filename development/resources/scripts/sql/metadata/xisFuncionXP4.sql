SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
DROP PROCEDURE xisFuncionXP4
GO
CREATE PROCEDURE xisFuncionXP4 AS
BEGIN
DECLARE @rehearsal integer
SELECT 	@rehearsal = id_dual FROM dual 
DECLARE	funcion_cursor CURSOR FOR
select	tabid, tabname, firstname, middlename, lastname, label, id_dominio, numero_tipo_funcion, es_segmentada
from	xdb10102 -- xdbProcessTables2
order by firstname, tabid
OPEN funcion_cursor
DECLARE @tabid int
DECLARE @tabname varchar(128)
DECLARE @firstname varchar(128)
DECLARE @middlename varchar(128)
DECLARE @lastname varchar(128)
DECLARE @label varchar(128)
DECLARE @codigo varchar(100)
DECLARE @nombre varchar(100)
DECLARE @dominio bigint
DECLARE @tipo int
DECLARE @segmentada int
DECLARE @rc int
DECLARE @id bigint
DECLARE @pp bigint
DECLARE @xs bigint
DECLARE @insertst varchar(8000)
DECLARE @selectst varchar(8000)
SET @rc = 0
SET @id = 0
SET @pp = 0
PRINT	'UPDATE xdb102-1'
/*
update	xdb102
set	refname = codigo_clase_recurso
from	xdb102, clase_recurso
where	xdb102.refname is null and (colname = 'id_' + codigo_clase_recurso or colname = 'numero_' + codigo_clase_recurso)
*/
update	xdb102
set	xdb102.refname = codigo_clase_recurso
from	xdb102, clase_recurso, xdbScriptPrimaryKeys SPK
where	xdb102.refname is null and (xdb102.colname = 'id_' + codigo_clase_recurso or xdb102.colname = 'numero_' + codigo_clase_recurso)
and	SPK.tabname = codigo_clase_recurso and SPK.colname = xdb102.colname
PRINT	'UPDATE xdb102-2'
update	xdb102
set	refname = (select max(SFK.refname) from xdbScriptForeignKeys SFK where SFK.colname = xdb102.colname)
from	xdb102, xdbScriptForeignKeys SFK
where	xdb102.refname is null and (SFK.colname = xdb102.colname)
--
FETCH NEXT FROM funcion_cursor INTO @tabid, @tabname, @firstname, @middlename, @lastname, @label, @dominio, @tipo, @segmentada
WHILE (@@FETCH_STATUS <> -1)
	BEGIN
	IF (@@FETCH_STATUS <> -2)
		BEGIN
		IF (@pp <> @dominio)
			BEGIN
			SELECT @id = MAX(id_funcion) FROM funcion WHERE id_dominio = @dominio
			IF (@id IS NULL OR @id < 100*@dominio+50) SET @id = 100*@dominio+50
			END
		SET @rc = @rc + 1
		SET @id = @id + 1
		SET @pp = @dominio
		SET @codigo = @lastname
		SET @nombre = @label
		SET @xs = NULL
		SELECT @xs = id_funcion FROM funcion WHERE codigo_funcion=@codigo -- AND id_dominio=@dominio
--		PRINT ''
--		PRINT CAST(@rc AS VARCHAR) + ', ' + @tabname + ' ' + CAST(@dominio AS VARCHAR) + ' ' + @firstname + ' ' + @middlename + ' ' + CAST(@id AS VARCHAR) + ' ' + @codigo
		IF (@xs IS NULL)
			BEGIN
			PRINT CAST(@rc AS VARCHAR) + ', ' + @tabname + ' ' + CAST(@dominio AS VARCHAR) + ' ' + @firstname + ' ' + @middlename + ' ' + CAST(@id AS VARCHAR) + ' ' + @codigo
			IF (@rehearsal = 0)
				BEGIN
				IF @tipo <> 13 SET @segmentada = 0
				INSERT 
				INTO	funcion (id_funcion, codigo_funcion, nombre_funcion, numero_tipo_funcion, numero_tipo_rastro_fun, id_dominio, es_segmentada)
				VALUES (@id, @codigo, @nombre, @tipo, 1, @dominio, @segmentada)
				/**/
				INSERT
				INTO	funcion_parametro
						(
						id_funcion_parametro, id_funcion, id_parametro, numero_tipo_parametro, valor_omision, 
						id_funcion_referencia, id_clase_recurso_valor, numero_tipo_valor
						)
				SELECT	id_funcion_parametro, id_funcion, id_parametro, numero_tipo_parametro, valor_omision,
						id_funcion_referencia, id_clase_recurso_valor, numero_tipo_valor
				FROM	xdb10201
				WHERE	id_funcion=@id
				AND		id_funcion_parametro NOT IN (SELECT id_funcion_parametro FROM funcion_parametro)
				ORDER BY id_funcion_parametro
				/**/
				INSERT
				INTO	filtro_cla_rec_fun
						(
						id_filtro_cla_rec_fun, id_funcion, id_clase_recurso_par_columna,
						numero_operador_com, id_clase_recurso_par_valor, valor
						)
				SELECT	id_filtro_cla_rec_fun, id_funcion, id_clase_recurso_par_columna,
						numero_operador_com, id_clase_recurso_par_valor, valor
				FROM	xdb10301
				WHERE	id_funcion=@id
				AND	id_filtro_cla_rec_fun NOT IN (SELECT id_filtro_cla_rec_fun FROM filtro_cla_rec_fun)
				ORDER BY id_filtro_cla_rec_fun
				END
			END
		END
	FETCH NEXT FROM funcion_cursor INTO @tabid, @tabname, @firstname, @middlename, @lastname, @label, @dominio, @tipo, @segmentada
	END
/**/
CLOSE funcion_cursor
DEALLOCATE funcion_cursor
END
GO
SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
