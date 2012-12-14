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

	SELECT @y = REPLACE(@y, ' Aba '			, ' Abastecimiento ')
	SELECT @y = REPLACE(@y, ' Academica '	, ' Acad�mica ')
	SELECT @y = REPLACE(@y, ' Acc '			, ' Accidente ')
	SELECT @y = REPLACE(@y, ' Act '			, ' Actualizaci�n ')
	SELECT @y = REPLACE(@y, ' Activ '		, ' Activo ')
	SELECT @y = REPLACE(@y, ' Ano '			, ' A�o ')
	SELECT @y = REPLACE(@y, ' Anos '		, ' A�os ')
	SELECT @y = REPLACE(@y, ' Antiguedad '	, ' Antig�edad ')
	SELECT @y = REPLACE(@y, ' Anul '		, ' Anulaci�n ')
	SELECT @y = REPLACE(@y, ' Any '			, ' A�o ')
	SELECT @y = REPLACE(@y, ' Anys '		, ' A�os ')
	SELECT @y = REPLACE(@y, ' Apr '			, ' Aprobaci�n ')
	SELECT @y = REPLACE(@y, ' Arc '			, ' Archivo ')
	SELECT @y = REPLACE(@y, ' Banarse '		, ' Ba�arse ')
	SELECT @y = REPLACE(@y, ' Bano '		, ' Ba�o ')
	SELECT @y = REPLACE(@y, ' Bas '			, ' Basura ')
	SELECT @y = REPLACE(@y, ' Ben '			, ' Beneficiario ')
	SELECT @y = REPLACE(@y, ' Categoria '	, ' Categor�a ')
	SELECT @y = REPLACE(@y, ' Ced '			, ' C�dula ')
	SELECT @y = REPLACE(@y, ' Cen '			, ' Censo ')
	SELECT @y = REPLACE(@y, ' Cer '			, ' Certificado ')
	SELECT @y = REPLACE(@y, ' Clausula '	, ' Cl�usula ')
	SELECT @y = REPLACE(@y, ' Codigo '		, ' C�digo ')
	SELECT @y = REPLACE(@y, ' Con '			, ' con ')
	SELECT @y = REPLACE(@y, ' Contrasena '	, ' Contrase�a ')
	SELECT @y = REPLACE(@y, ' Credito '		, ' Cr�dito ')
	SELECT @y = REPLACE(@y, ' Curriculo '	, ' Curr�culo ')
	SELECT @y = REPLACE(@y, ' Dat '			, ' Datos ')
	SELECT @y = REPLACE(@y, ' Deficit '		, ' D�ficit ')
	SELECT @y = REPLACE(@y, ' Den '			, ' Denegaci�n ')
	SELECT @y = REPLACE(@y, ' Denu '		, ' Denuncia ')
	SELECT @y = REPLACE(@y, ' Deposito '	, ' Dep�sito ')
	SELECT @y = REPLACE(@y, ' Des '			, ' Desmentido ')
	SELECT @y = REPLACE(@y, ' Desempeno '	, ' Desempe�o ')
	SELECT @y = REPLACE(@y, ' Dia '			, ' D�a ')
	SELECT @y = REPLACE(@y, ' Dif '			, ' Dificultad ')
	SELECT @y = REPLACE(@y, ' Digitos '		, ' D�gitos ')
	SELECT @y = REPLACE(@y, ' Edu '			, ' Educativo ')
	SELECT @y = REPLACE(@y, ' El '			, ' el ')
	SELECT @y = REPLACE(@y, ' Ele '			, ' Elegibilidad ')
	SELECT @y = REPLACE(@y, ' Electronica '	, ' Electr�nica ')
	SELECT @y = REPLACE(@y, ' Electronico '	, ' Electr�nico ')
	SELECT @y = REPLACE(@y, ' En '			, ' en ')
	SELECT @y = REPLACE(@y, ' Energia '		, ' Energ�a ')
	SELECT @y = REPLACE(@y, ' Enf '			, ' Enfermedad ')
	SELECT @y = REPLACE(@y, ' Esc '			, ' Escolar ')
	SELECT @y = REPLACE(@y, ' Escalafon '	, ' Escalaf�n ')
	SELECT @y = REPLACE(@y, ' Examen '		, ' Ex�men ')
	SELECT @y = REPLACE(@y, ' Ext '			, ' Externos ')
	SELECT @y = REPLACE(@y, ' Exter '		, ' Exterior ')
	SELECT @y = REPLACE(@y, ' Fam '			, ' Familiar ')
	SELECT @y = REPLACE(@y, ' Fec '			, ' Fecha ')
	SELECT @y = REPLACE(@y, ' Ff Pp '		, ' Fondos Propios ')
	SELECT @y = REPLACE(@y, ' FF.PP. '		, ' Fondos Propios ')
	SELECT @y = REPLACE(@y, ' Gps '			, ' GPS ')
	SELECT @y = REPLACE(@y, ' G.P.S. '		, ' GPS ')
	SELECT @y = REPLACE(@y, ' Historico '	, ' Hist�rico ')
	SELECT @y = REPLACE(@y, ' Icv '			, ' ICV ')
	SELECT @y = REPLACE(@y, ' I.C.V. '		, ' ICV ')
	SELECT @y = REPLACE(@y, ' Ina '			, ' Inasistencia ')
	SELECT @y = REPLACE(@y, ' Inv '			, ' Invalidaci�n ')
	SELECT @y = REPLACE(@y, ' Ips '			, ' IPS ')
	SELECT @y = REPLACE(@y, ' I.P.S. '		, ' IPS ')
	SELECT @y = REPLACE(@y, ' Islr '		, ' ISLR ')
	SELECT @y = REPLACE(@y, ' I.S.L.R. '	, ' ISLR ')
	SELECT @y = REPLACE(@y, ' Iva '			, ' IVA ')
	SELECT @y = REPLACE(@y, ' I.V.A. '		, ' IVA ')
	SELECT @y = REPLACE(@y, ' Jupe '		, ' JUPE ')
	SELECT @y = REPLACE(@y, ' J.U.P.E. '	, ' JUPE ')
	SELECT @y = REPLACE(@y, ' Jur '			, ' Jurada ')
	SELECT @y = REPLACE(@y, ' La '			, ' la ')
	SELECT @y = REPLACE(@y, ' Lab '			, ' Laboral ')
	SELECT @y = REPLACE(@y, ' Limite '		, ' L�mite ')
	SELECT @y = REPLACE(@y, ' Mat '			, ' Material ')
	SELECT @y = REPLACE(@y, ' Matricula '	, ' Matr�cula ')
	SELECT @y = REPLACE(@y, ' Maxima '		, ' M�xima ')
	SELECT @y = REPLACE(@y, ' Maximo '		, ' M�ximo ')
	SELECT @y = REPLACE(@y, ' Mec '			, ' MEC ')
	SELECT @y = REPLACE(@y, ' M.E.C. '		, ' MEC ')
	SELECT @y = REPLACE(@y, ' Menu '		, ' Men� ')
	SELECT @y = REPLACE(@y, ' Merito '		, ' M�rito ')
	SELECT @y = REPLACE(@y, ' Mh '			, ' MH ')
	SELECT @y = REPLACE(@y, ' M.H. '		, ' MH ')
	SELECT @y = REPLACE(@y, ' Minima '		, ' M�nima ')
	SELECT @y = REPLACE(@y, ' Minimo '		, ' M�nimo ')
	SELECT @y = REPLACE(@y, ' Modulo '		, ' M�dulo ')
	SELECT @y = REPLACE(@y, ' Mov '			, ' Movimiento ')
	SELECT @y = REPLACE(@y, ' Multiple '	, ' M�ltiple ')
	SELECT @y = REPLACE(@y, ' Nomina '		, ' N�mina ')
	SELECT @y = REPLACE(@y, ' Numero '		, ' N�mero ')
	SELECT @y = REPLACE(@y, ' O '			, ' o ')
	SELECT @y = REPLACE(@y, ' Obj '			, ' Objeci�n ')
	SELECT @y = REPLACE(@y, ' Pagina '		, ' P�gina ')
	SELECT @y = REPLACE(@y, ' Para '		, ' para ')
	SELECT @y = REPLACE(@y, ' Parametro '	, ' Par�metro ')
	SELECT @y = REPLACE(@y, ' Password '	, ' Contrase�a ')
	SELECT @y = REPLACE(@y, ' Pen '			, ' Pensi�n ')
	SELECT @y = REPLACE(@y, ' Periodo '		, ' Per�odo ')
	SELECT @y = REPLACE(@y, ' Plus '		, ' ')
	SELECT @y = REPLACE(@y, ' Pot '			, ' Potencial ')
	SELECT @y = REPLACE(@y, ' Presup '		, ' Presupuesto ')
	SELECT @y = REPLACE(@y, ' Programatica ', ' Program�tica ')
	SELECT @y = REPLACE(@y, ' Programatico ', ' Program�tico ')
	SELECT @y = REPLACE(@y, ' Publica '		, ' P�blica ')
	SELECT @y = REPLACE(@y, ' Publico '		, ' P�blico ')
	SELECT @y = REPLACE(@y, ' Recl '		, ' Reclamo ')
	SELECT @y = REPLACE(@y, ' Reco '		, ' Reconsideraci�n ')
	SELECT @y = REPLACE(@y, ' Reg '			, ' Registro ')
	SELECT @y = REPLACE(@y, ' Renglon '		, ' Rengl�n ')
	SELECT @y = REPLACE(@y, ' Rev '			, ' Revocaci�n ')
	SELECT @y = REPLACE(@y, ' Ruc '			, ' RUC ')
	SELECT @y = REPLACE(@y, ' R.U.C. '		, ' RUC ')
	SELECT @y = REPLACE(@y, ' San '			, ' Sanitario ')
	SELECT @y = REPLACE(@y, ' Sin '			, ' sin ')
	SELECT @y = REPLACE(@y, ' Siono '		, ' S� o No ')
	SELECT @y = REPLACE(@y, ' S�/No '		, ' S� o No ')
	SELECT @y = REPLACE(@y, ' S�/no '		, ' S� o No ')
	SELECT @y = REPLACE(@y, ' Subcategoria ', ' Subcategor�a ')
	SELECT @y = REPLACE(@y, ' Super '		, ' S�per ')
	SELECT @y = REPLACE(@y, ' Telefono'		, ' Tel�fono')
	SELECT @y = REPLACE(@y, ' Titulo '		, ' T�tulo ')
	SELECT @y = REPLACE(@y, ' Tlf'			, ' Tel�fono')
	SELECT @y = REPLACE(@y, ' Ult '			, ' Ultima ')
	SELECT @y = REPLACE(@y, ' Unica '		, ' �nica ')
	SELECT @y = REPLACE(@y, ' Unico '		, ' �nico ')
	SELECT @y = REPLACE(@y, ' Url '			, ' URL ')
	SELECT @y = REPLACE(@y, ' U.R.L. '		, ' URL ')
	SELECT @y = REPLACE(@y, ' Utm '			, ' UTM ')
	SELECT @y = REPLACE(@y, ' U.T.M. '		, ' UTM ')
	SELECT @y = REPLACE(@y, ' Valida '		, ' V�lida ')
	SELECT @y = REPLACE(@y, ' Via '			, ' V�a ')
	SELECT @y = REPLACE(@y, ' Viv '			, ' Vivienda ')
	SELECT @y = REPLACE(@y, ' Y '			, ' y ')

	SELECT @y = REPLACE(@y, 'on ', '�n ')
	SELECT @y = REPLACE(@y, ' c�n ', ' con ')
	SELECT @y = LTRIM(RTRIM(@y))
	RETURN @y
END
GO
SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
