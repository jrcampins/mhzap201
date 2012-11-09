if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[xfnNombrePropio]') and xtype in (N'FN', N'IF', N'TF'))
drop function [dbo].[xfnNombrePropio]
GO

SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
CREATE FUNCTION xfnNombrePropio(@x varchar(100)) RETURNS varchar(100) AS
BEGIN
	DECLARE @b bit
	DECLARE @i integer
	DECLARE @n integer
	DECLARE @c varchar(1)
	DECLARE @y varchar(100)
	SELECT @x = LTRIM(RTRIM(@x))
	SELECT @y = ''
	SELECT @i = 0
	SELECT @n = LEN(@x)
	WHILE (@i < @n)
		BEGIN
		SELECT @i = @i + 1
	    SELECT @c = SUBSTRING(@x, @i, 1)
	    IF (@c = '.' OR @c = ' ')
			BEGIN
	        SELECT @b = 1
           	SELECT @y = @y + @c
			END
		ELSE
		    IF (@c = '_')
				BEGIN
		        SELECT @b = 1
				SELECT @y = @y + ' '
				END
		    ELSE
				IF (@b = 1)
					BEGIN
		            SELECT @b = 0
		            SELECT @y = @y + UPPER(@c)
					END
		        ELSE
	            	SELECT @y = @y + LOWER(@c)
		END

	SELECT @y = ' ' + @y + ' '

	SELECT @y = REPLACE(@y, ' Clausula ', ' Cl�usula ')
	SELECT @y = REPLACE(@y, ' Contrasena ', ' Contrase�a ')
	SELECT @y = REPLACE(@y, ' Digitos ', ' D�gitos ')
	SELECT @y = REPLACE(@y, ' Electronica ', ' Electr�nica ')
	SELECT @y = REPLACE(@y, ' Electronico ', ' Electr�nico ')
	SELECT @y = REPLACE(@y, ' Menu ', ' Men� ')
	SELECT @y = REPLACE(@y, ' Modulo ', ' M�dulo ')
	SELECT @y = REPLACE(@y, ' Multiple ', ' M�ltiple ')
	SELECT @y = REPLACE(@y, ' Nomina ', ' N�mina ')
	SELECT @y = REPLACE(@y, ' Pagina ', ' P�gina ')
	SELECT @y = REPLACE(@y, ' Parametro ', ' Par�metro ')
	SELECT @y = REPLACE(@y, ' Password ', ' Contrase�a ')
	SELECT @y = REPLACE(@y, ' Programatica ', ' Program�tica ')
	SELECT @y = REPLACE(@y, ' Programatico ', ' Program�tico ')
	SELECT @y = REPLACE(@y, ' Publica ', ' P�blica ')
	SELECT @y = REPLACE(@y, ' Publico ', ' P�blico ')
	SELECT @y = REPLACE(@y, ' Super ', ' S�per ')
	SELECT @y = REPLACE(@y, ' Unica ', ' �nica ')
	SELECT @y = REPLACE(@y, ' Unico ', ' �nico ')

	SELECT @y = REPLACE(@y, ' Academica ', ' Acad�mica ')
	SELECT @y = REPLACE(@y, ' Antiguedad ', ' Antig�edad ')
	SELECT @y = REPLACE(@y, ' Categoria ', ' Categor�a ')
	SELECT @y = REPLACE(@y, ' Credito ', ' Cr�dito ')
	SELECT @y = REPLACE(@y, ' Curriculo ', ' Curr�culo ')
	SELECT @y = REPLACE(@y, ' Deficit ', ' D�ficit ')
	SELECT @y = REPLACE(@y, ' Deposito ', ' Dep�sito ')
	SELECT @y = REPLACE(@y, ' Desempeno ', ' Desempe�o ')
	SELECT @y = REPLACE(@y, ' Energia ', ' Energ�a ')
	SELECT @y = REPLACE(@y, ' Escalafon ', ' Escalaf�n ')
	SELECT @y = REPLACE(@y, ' Examen ', ' Ex�men ')
	SELECT @y = REPLACE(@y, ' Historico ', ' Hist�rico ')
	SELECT @y = REPLACE(@y, ' Matricula ', ' Matr�cula ')
	SELECT @y = REPLACE(@y, ' Merito ', ' M�rito ')
	SELECT @y = REPLACE(@y, ' Periodo ', ' Per�odo ')
	SELECT @y = REPLACE(@y, ' Renglon ', ' Rengl�n ')
	SELECT @y = REPLACE(@y, ' Subcategoria ', ' Subcategor�a ')
	SELECT @y = REPLACE(@y, ' Telefono', ' Tel�fono')
	SELECT @y = REPLACE(@y, ' Titulo ', ' T�tulo ')
	SELECT @y = REPLACE(@y, ' Valida ', ' V�lida ')
	SELECT @y = REPLACE(@y, ' Via ', ' V�a ')

	SELECT @y = REPLACE(@y, ' Ano ', ' A�o ')
	SELECT @y = REPLACE(@y, ' Anos ', ' A�os ')
	SELECT @y = REPLACE(@y, ' Any ', ' A�o ')
	SELECT @y = REPLACE(@y, ' Anys ', ' A�os ')
	SELECT @y = REPLACE(@y, ' Codigo ', ' C�digo ')
	SELECT @y = REPLACE(@y, ' Dia ', ' D�a ')
	SELECT @y = REPLACE(@y, ' Limite ', ' L�mite ')
	SELECT @y = REPLACE(@y, ' Maxima ', ' M�xima ')
	SELECT @y = REPLACE(@y, ' Maximo ', ' M�ximo ')
	SELECT @y = REPLACE(@y, ' Minima ', ' M�nima ')
	SELECT @y = REPLACE(@y, ' Minimo ', ' M�nimo ')
	SELECT @y = REPLACE(@y, ' Numero ', ' N�mero ')

	SELECT @y = REPLACE(@y, ' Ff Pp ', ' FF.PP. ')
	SELECT @y = REPLACE(@y, ' Gps ', ' G.P.S. ')
	SELECT @y = REPLACE(@y, ' Ips ', ' I.P.S. ')
	SELECT @y = REPLACE(@y, ' Islr ', ' I.S.L.R. ')
	SELECT @y = REPLACE(@y, ' Iva ', ' I.V.A. ')
	SELECT @y = REPLACE(@y, ' Mec ', ' M.E.C. ')
	SELECT @y = REPLACE(@y, ' Mh ', ' M.H. ')
	SELECT @y = REPLACE(@y, ' Mov ', ' Movimiento ')
	SELECT @y = REPLACE(@y, ' Presup ', ' Presupuesto ')
	SELECT @y = REPLACE(@y, ' Ruc ', ' R.U.C. ')
	SELECT @y = REPLACE(@y, ' Url ', ' U.R.L. ')

	SELECT @y = REPLACE(@y, 'on ', '�n ')
	SELECT @y = REPLACE(@y, ' C�n ', ' con ')
	SELECT @y = REPLACE(@y, ' Sin ', ' sin ')
	SELECT @y = REPLACE(@y, ' En ', ' en ')

	SELECT @y = REPLACE(@y, ' Url ', ' U.R.L. ')
	SELECT @y = REPLACE(@y, ' Plus ', ' ')
	SELECT @y = LTRIM(RTRIM(@y))
	RETURN @y
END
GO
SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
