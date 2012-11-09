SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
DROP PROCEDURE xusClaseRecurso
GO
CREATE PROCEDURE xusClaseRecurso AS
BEGIN
DECLARE @updatest varchar(8000)
DECLARE @selectst varchar(8000)
SET @updatest = "
update	clase_recurso
set		id_funcion_seleccion = 10000*id_clase_recurso+101
"
SET @selectst = "
select	* 
from	clase_recurso
where	id_funcion_seleccion is null 
and		exists
		(
		select 1 from funcion 
		where funcion.id_dominio=100*clase_recurso.id_clase_recurso+1
		and funcion.id_funcion=10000*clase_recurso.id_clase_recurso+101
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
