SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
DROP PROCEDURE xusDominio
GO
CREATE PROCEDURE xusDominio AS
BEGIN
DECLARE @updatest varchar(8000)
DECLARE @selectst varchar(8000)
SET @updatest = "
update	dx
set		id_dominio_segmento = dy.id_dominio
"
SET @selectst = "
select	dx.codigo_dominio, dy.codigo_dominio
from	dominio dx
inner	join clase_recurso crx on crx.id_clase_recurso = dx.id_clase_recurso
inner	join clase_recurso cry on cry.id_clase_recurso = crx.id_clase_recurso_segmento
inner	join dominio dy on dy.id_clase_recurso = cry.id_clase_recurso and dy.codigo_dominio = cry.codigo_clase_recurso
where	dx.id_dominio_segmento is null 
-- and	dx.numero_tipo_dominio=1
-- and	dy.numero_tipo_dominio=1
order	by 1
"
EXECUTE xus @updatest, @selectst, 'from'
SET @updatest = "
update	dominio
set		id_funcion_seleccion = 100*dominio.id_dominio+1
"
SET @selectst = "
select	*
from	dominio
where	id_funcion_seleccion is null 
-- and	numero_tipo_dominio=1
and		exists
		(
		select 1 from funcion 
		where funcion.id_dominio=dominio.id_dominio 
		and funcion.id_funcion=100*dominio.id_dominio+1
		)
order	by 1
"
EXECUTE xus @updatest, @selectst, 'where'
END
GO
SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
