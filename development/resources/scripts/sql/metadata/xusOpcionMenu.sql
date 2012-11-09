SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
DROP PROCEDURE xusOpcionMenu
GO
CREATE PROCEDURE xusOpcionMenu AS
BEGIN
DECLARE @rehearsal integer
SELECT 	@rehearsal = id_dual FROM dual 
DECLARE	cursor1 CURSOR FOR
SELECT	id_opcion_menu,
		codigo_opcion_menu,
		nombre_opcion_menu,
		id_opcion_menu_superior
FROM	opcion_menu
WHERE	id_opcion_menu_superior BETWEEN 1 AND 99999
AND		url_opcion_menu LIKE'redirect%'
AND		es_opcion_menu_sincronizada=0
ORDER BY
		id_opcion_menu_superior,
		nombre_opcion_menu,
		id_opcion_menu
OPEN cursor1
DECLARE @id bigint
DECLARE @codigo varchar(30)
DECLARE @nombre varchar(200)
DECLARE @superior bigint
DECLARE @secuencia integer
DECLARE @superiorAnterior bigint
DECLARE @varchar5 varchar(5)
DECLARE @varchar9 varchar(9)
DECLARE @nuevoCodigo varchar(30)
SET @superiorAnterior = -1
FETCH NEXT FROM cursor1 INTO @id, @codigo, @nombre, @superior
WHILE (@@FETCH_STATUS <> -1)
BEGIN
	IF (@@FETCH_STATUS <> -2)
	BEGIN
		IF (@superiorAnterior <> @superior) SET @secuencia = 0
		SET @superiorAnterior =  @superior
		SET @secuencia = @secuencia + 10
		SET @varchar5 = RIGHT(CAST(    100000 + @superior  AS VARCHAR(10)), 5) 
		SET @varchar9 = RIGHT(CAST(1000000000 + @secuencia AS VARCHAR(10)), 9)
		SET @nuevoCodigo = "N" + @varchar5 + @varchar9
		PRINT CAST(@superior AS VARCHAR) + ' ' + @varchar9 + ' ' + CAST(@id AS VARCHAR) + ' ' + @codigo + ' ' + @nombre + ' ' + @varchar5 + ' ' + @nuevoCodigo
		IF (@rehearsal = 0)
			update	opcion_menu
			set		secuencia_opcion_menu = @secuencia,
					codigo_opcion_menu = "N" + @varchar5 + @varchar9
			where	id_opcion_menu = @id
	END
	FETCH NEXT FROM cursor1 INTO @id, @codigo, @nombre, @superior
END
CLOSE cursor1
DEALLOCATE cursor1
END
GO
SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
