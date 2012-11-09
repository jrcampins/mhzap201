SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
DROP PROCEDURE xisPaginaFuncion
GO
CREATE PROCEDURE xisPaginaFuncion AS
BEGIN
DECLARE @rehearsal integer
SELECT 	@rehearsal = id_dual FROM dual 
DECLARE	pagina_funcion_cursor CURSOR FOR
select	id_pagina, id_funcion 
from	pagina, funcion, dominio, clase_recurso 
where	pagina.numero_tipo_pagina < 4
and		funcion.id_dominio = pagina.id_dominio
and		dominio.id_dominio = pagina.id_dominio
and		dominio.id_clase_recurso = clase_recurso.id_clase_recurso
and		(
		clase_recurso.numero_tipo_recurso <> 12 or funcion.numero_tipo_funcion not in (31,33)
		)
and		id_funcion not in
		(
		select	id_funcion
		from	pagina_funcion
		where	id_pagina = pagina.id_pagina
		)
UNION
select	id_pagina, id_funcion 
from	pagina, funcion 
where	pagina.numero_tipo_pagina > 4
and		funcion.id_dominio = pagina.id_dominio
and		funcion.numero_tipo_funcion in (21,22,23)
and		id_funcion not in
		(
		select	id_funcion
		from	pagina_funcion
		where	id_pagina = pagina.id_pagina
		)
UNION
select	id_pagina, id_funcion 
from	xdb10102 pagina, funcion -- xdbProcessTables2
where	funcion.codigo_funcion = pagina.lastname
and		funcion.id_dominio = pagina.id_dominio
and		funcion.id_funcion not in
		(
		select	id_funcion
		from	pagina_funcion
		where	id_pagina = pagina.id_pagina
		)
order 	by 1,2
OPEN pagina_funcion_cursor
DECLARE @id bigint
DECLARE @pagina bigint
DECLARE @funcion bigint
DECLARE @pp bigint
SET @id = 0
SET @pp = 0
FETCH NEXT FROM pagina_funcion_cursor INTO @pagina, @funcion
WHILE (@@FETCH_STATUS <> -1)
BEGIN
	IF (@@FETCH_STATUS <> -2)
	BEGIN
		IF (@pp <> @pagina)
			BEGIN
			SELECT @id = MAX(id_pagina_funcion) FROM pagina_funcion WHERE id_pagina = @pagina
			IF (@id IS NULL) SET @id = 100*@pagina
			END
		SET @id = @id + 1
		SET @pp = @pagina
		PRINT CAST(@id AS VARCHAR) + ' ' + CAST(@pagina AS VARCHAR) + ' ' + CAST(@funcion AS VARCHAR)
		IF (@rehearsal = 0)
			INSERT
			INTO pagina_funcion (id_pagina_funcion, id_pagina, id_funcion)
			VALUES (@id, @pagina, @funcion)
	END
	FETCH NEXT FROM pagina_funcion_cursor INTO @pagina, @funcion
END
CLOSE pagina_funcion_cursor
DEALLOCATE pagina_funcion_cursor
END
GO
SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
