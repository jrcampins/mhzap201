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
	SELECT @y = REPLACE(@y, ' Academica '	, ' Académica ')
	SELECT @y = REPLACE(@y, ' Acc '			, ' Accidente ')
	SELECT @y = REPLACE(@y, ' Act '			, ' Actualización ')
	SELECT @y = REPLACE(@y, ' Activ '		, ' Activo ')
	SELECT @y = REPLACE(@y, ' Ano '			, ' Año ')
	SELECT @y = REPLACE(@y, ' Anos '		, ' Años ')
	SELECT @y = REPLACE(@y, ' Antiguedad '	, ' Antigüedad ')
	SELECT @y = REPLACE(@y, ' Anul '		, ' Anulación ')
	SELECT @y = REPLACE(@y, ' Any '			, ' Año ')
	SELECT @y = REPLACE(@y, ' Anys '		, ' Años ')
	SELECT @y = REPLACE(@y, ' Apr '			, ' Aprobación ')
	SELECT @y = REPLACE(@y, ' Arc '			, ' Archivo ')
	SELECT @y = REPLACE(@y, ' Banarse '		, ' Bañarse ')
	SELECT @y = REPLACE(@y, ' Bano '		, ' Baño ')
	SELECT @y = REPLACE(@y, ' Bas '			, ' Basura ')
	SELECT @y = REPLACE(@y, ' Ben '			, ' Beneficiario ')
	SELECT @y = REPLACE(@y, ' Categoria '	, ' Categoría ')
	SELECT @y = REPLACE(@y, ' Ced '			, ' Cédula ')
	SELECT @y = REPLACE(@y, ' Cen '			, ' Censo ')
	SELECT @y = REPLACE(@y, ' Cer '			, ' Certificado ')
	SELECT @y = REPLACE(@y, ' Clausula '	, ' Cláusula ')
	SELECT @y = REPLACE(@y, ' Codigo '		, ' Código ')
	SELECT @y = REPLACE(@y, ' Con '			, ' con ')
	SELECT @y = REPLACE(@y, ' Contrasena '	, ' Contraseña ')
	SELECT @y = REPLACE(@y, ' Credito '		, ' Crédito ')
	SELECT @y = REPLACE(@y, ' Curriculo '	, ' Currículo ')
	SELECT @y = REPLACE(@y, ' Dat '			, ' Datos ')
	SELECT @y = REPLACE(@y, ' Deficit '		, ' Déficit ')
	SELECT @y = REPLACE(@y, ' Den '			, ' Denegación ')
	SELECT @y = REPLACE(@y, ' Denu '		, ' Denuncia ')
	SELECT @y = REPLACE(@y, ' Deposito '	, ' Depósito ')
	SELECT @y = REPLACE(@y, ' Des '			, ' Desmentido ')
	SELECT @y = REPLACE(@y, ' Desempeno '	, ' Desempeño ')
	SELECT @y = REPLACE(@y, ' Dia '			, ' Día ')
	SELECT @y = REPLACE(@y, ' Dif '			, ' Dificultad ')
	SELECT @y = REPLACE(@y, ' Digitos '		, ' Dígitos ')
	SELECT @y = REPLACE(@y, ' Edu '			, ' Educativo ')
	SELECT @y = REPLACE(@y, ' El '			, ' el ')
	SELECT @y = REPLACE(@y, ' Ele '			, ' Elegibilidad ')
	SELECT @y = REPLACE(@y, ' Electronica '	, ' Electrónica ')
	SELECT @y = REPLACE(@y, ' Electronico '	, ' Electrónico ')
	SELECT @y = REPLACE(@y, ' En '			, ' en ')
	SELECT @y = REPLACE(@y, ' Energia '		, ' Energía ')
	SELECT @y = REPLACE(@y, ' Enf '			, ' Enfermedad ')
	SELECT @y = REPLACE(@y, ' Esc '			, ' Escolar ')
	SELECT @y = REPLACE(@y, ' Escalafon '	, ' Escalafón ')
	SELECT @y = REPLACE(@y, ' Examen '		, ' Exámen ')
	SELECT @y = REPLACE(@y, ' Ext '			, ' Externos ')
	SELECT @y = REPLACE(@y, ' Exter '		, ' Exterior ')
	SELECT @y = REPLACE(@y, ' Fam '			, ' Familiar ')
	SELECT @y = REPLACE(@y, ' Fec '			, ' Fecha ')
	SELECT @y = REPLACE(@y, ' Ff Pp '		, ' Fondos Propios ')
	SELECT @y = REPLACE(@y, ' FF.PP. '		, ' Fondos Propios ')
	SELECT @y = REPLACE(@y, ' Gps '			, ' GPS ')
	SELECT @y = REPLACE(@y, ' G.P.S. '		, ' GPS ')
	SELECT @y = REPLACE(@y, ' Historico '	, ' Histórico ')
	SELECT @y = REPLACE(@y, ' Icv '			, ' ICV ')
	SELECT @y = REPLACE(@y, ' I.C.V. '		, ' ICV ')
	SELECT @y = REPLACE(@y, ' Ina '			, ' Inasistencia ')
	SELECT @y = REPLACE(@y, ' Inv '			, ' Invalidación ')
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
	SELECT @y = REPLACE(@y, ' Limite '		, ' Límite ')
	SELECT @y = REPLACE(@y, ' Mat '			, ' Material ')
	SELECT @y = REPLACE(@y, ' Matricula '	, ' Matrícula ')
	SELECT @y = REPLACE(@y, ' Maxima '		, ' Máxima ')
	SELECT @y = REPLACE(@y, ' Maximo '		, ' Máximo ')
	SELECT @y = REPLACE(@y, ' Mec '			, ' MEC ')
	SELECT @y = REPLACE(@y, ' M.E.C. '		, ' MEC ')
	SELECT @y = REPLACE(@y, ' Menu '		, ' Menú ')
	SELECT @y = REPLACE(@y, ' Merito '		, ' Mérito ')
	SELECT @y = REPLACE(@y, ' Mh '			, ' MH ')
	SELECT @y = REPLACE(@y, ' M.H. '		, ' MH ')
	SELECT @y = REPLACE(@y, ' Minima '		, ' Mínima ')
	SELECT @y = REPLACE(@y, ' Minimo '		, ' Mínimo ')
	SELECT @y = REPLACE(@y, ' Modulo '		, ' Módulo ')
	SELECT @y = REPLACE(@y, ' Mov '			, ' Movimiento ')
	SELECT @y = REPLACE(@y, ' Multiple '	, ' Múltiple ')
	SELECT @y = REPLACE(@y, ' Nomina '		, ' Nómina ')
	SELECT @y = REPLACE(@y, ' Numero '		, ' Número ')
	SELECT @y = REPLACE(@y, ' O '			, ' o ')
	SELECT @y = REPLACE(@y, ' Obj '			, ' Objeción ')
	SELECT @y = REPLACE(@y, ' Pagina '		, ' Página ')
	SELECT @y = REPLACE(@y, ' Para '		, ' para ')
	SELECT @y = REPLACE(@y, ' Parametro '	, ' Parámetro ')
	SELECT @y = REPLACE(@y, ' Password '	, ' Contraseña ')
	SELECT @y = REPLACE(@y, ' Pen '			, ' Pensión ')
	SELECT @y = REPLACE(@y, ' Periodo '		, ' Período ')
	SELECT @y = REPLACE(@y, ' Plus '		, ' ')
	SELECT @y = REPLACE(@y, ' Pot '			, ' Potencial ')
	SELECT @y = REPLACE(@y, ' Presup '		, ' Presupuesto ')
	SELECT @y = REPLACE(@y, ' Programatica ', ' Programática ')
	SELECT @y = REPLACE(@y, ' Programatico ', ' Programático ')
	SELECT @y = REPLACE(@y, ' Publica '		, ' Pública ')
	SELECT @y = REPLACE(@y, ' Publico '		, ' Público ')
	SELECT @y = REPLACE(@y, ' Recl '		, ' Reclamo ')
	SELECT @y = REPLACE(@y, ' Reco '		, ' Reconsideración ')
	SELECT @y = REPLACE(@y, ' Reg '			, ' Registro ')
	SELECT @y = REPLACE(@y, ' Renglon '		, ' Renglón ')
	SELECT @y = REPLACE(@y, ' Rev '			, ' Revocación ')
	SELECT @y = REPLACE(@y, ' Ruc '			, ' RUC ')
	SELECT @y = REPLACE(@y, ' R.U.C. '		, ' RUC ')
	SELECT @y = REPLACE(@y, ' San '			, ' Sanitario ')
	SELECT @y = REPLACE(@y, ' Sin '			, ' sin ')
	SELECT @y = REPLACE(@y, ' Siono '		, ' Sí o No ')
	SELECT @y = REPLACE(@y, ' Sí/No '		, ' Sí o No ')
	SELECT @y = REPLACE(@y, ' Sí/no '		, ' Sí o No ')
	SELECT @y = REPLACE(@y, ' Subcategoria ', ' Subcategoría ')
	SELECT @y = REPLACE(@y, ' Super '		, ' Súper ')
	SELECT @y = REPLACE(@y, ' Telefono'		, ' Teléfono')
	SELECT @y = REPLACE(@y, ' Titulo '		, ' Título ')
	SELECT @y = REPLACE(@y, ' Tlf'			, ' Teléfono')
	SELECT @y = REPLACE(@y, ' Ult '			, ' Ultima ')
	SELECT @y = REPLACE(@y, ' Unica '		, ' Única ')
	SELECT @y = REPLACE(@y, ' Unico '		, ' Único ')
	SELECT @y = REPLACE(@y, ' Url '			, ' URL ')
	SELECT @y = REPLACE(@y, ' U.R.L. '		, ' URL ')
	SELECT @y = REPLACE(@y, ' Utm '			, ' UTM ')
	SELECT @y = REPLACE(@y, ' U.T.M. '		, ' UTM ')
	SELECT @y = REPLACE(@y, ' Valida '		, ' Válida ')
	SELECT @y = REPLACE(@y, ' Via '			, ' Vía ')
	SELECT @y = REPLACE(@y, ' Viv '			, ' Vivienda ')
	SELECT @y = REPLACE(@y, ' Y '			, ' y ')

	SELECT @y = REPLACE(@y, 'on ', 'ón ')
	SELECT @y = REPLACE(@y, ' cón ', ' con ')
	SELECT @y = LTRIM(RTRIM(@y))
	RETURN @y
END
GO
SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
