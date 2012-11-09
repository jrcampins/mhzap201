SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
DROP PROCEDURE xusDominioParametro
GO
CREATE PROCEDURE xusDominioParametro AS
BEGIN
DECLARE @updatest varchar(8000)
DECLARE @selectst varchar(8000)
SET @updatest = "
update	dominio_parametro
set		dominio_parametro.etiqueta_parametro = parametro.nombre_parametro
"
SET @selectst = "
select	tipo_parametro_dom.numero_tipo_parametro_dom,
 		dominio_parametro.etiqueta_parametro,
 		parametro.codigo_parametro, 
 		parametro.nombre_parametro 
from	dominio_parametro, parametro, tipo_parametro_dom
where	dominio_parametro.id_parametro=parametro.id_parametro
and 	dominio_parametro.etiqueta_parametro is null
and 	dominio_parametro.numero_tipo_parametro_dom=tipo_parametro_dom.numero_tipo_parametro_dom
and 	parametro.codigo_parametro NOT like tipo_parametro_dom.codigo_tipo_parametro_dom + '%'
order	by 1
"
EXECUTE xus @updatest, @selectst, 'from'
END
GO
SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
