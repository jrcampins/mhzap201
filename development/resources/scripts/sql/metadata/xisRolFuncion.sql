SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
DROP PROCEDURE xisRolFuncion
GO
CREATE PROCEDURE xisRolFuncion AS
BEGIN
DECLARE @rehearsal integer
SELECT 	@rehearsal = id_dual FROM dual 
DECLARE	rol_funcion_cursor CURSOR FOR
select	distinct rol.id_rol, funcion.id_funcion
from	rol, xdbPagina pagina, pagina_funcion, funcion
where	rol.id_grupo_aplicacion = pagina.id_grupo_aplicacion_rol
and		rol.numero_tipo_rol in (2,16)
and		pagina.id_pagina = pagina_funcion.id_pagina
and		pagina_funcion.id_funcion = funcion.id_funcion
and		funcion.numero_tipo_funcion in (11,12,13)
and		funcion.es_publica=0
and		funcion.es_programatica=0
and		funcion.id_funcion not in (select id_funcion from rol_funcion where id_rol=rol.id_rol)
UNION
select	distinct rol.id_rol, funcion.id_funcion
from	rol, xdbPagina pagina, pagina_funcion, funcion
where	rol.id_grupo_aplicacion = pagina.id_grupo_aplicacion_rol
and		rol.numero_tipo_rol in (1,2,4,16)
and		pagina.id_pagina = pagina_funcion.id_pagina
and		pagina_funcion.id_funcion = funcion.id_funcion
and		funcion.numero_tipo_funcion in (21,22,23)
and		funcion.es_publica=0
and		funcion.es_programatica=0
and		funcion.id_funcion not in (select id_funcion from rol_funcion where id_rol=rol.id_rol)
UNION
select	distinct rol.id_rol, funcion.id_funcion
from	rol, xdbPagina pagina, pagina_funcion, funcion
where	rol.id_grupo_aplicacion = pagina.id_grupo_aplicacion_rol
and		rol.numero_tipo_rol in (1,16)
and		pagina.id_pagina = pagina_funcion.id_pagina
and		pagina_funcion.id_funcion = funcion.id_funcion
and		pagina.numero_tipo_recurso=21
and		funcion.numero_tipo_funcion in (31,32,33)
and		funcion.es_publica=0
and		funcion.es_programatica=0
and		funcion.id_funcion not in (select id_funcion from rol_funcion where id_rol=rol.id_rol)
UNION
select	distinct rol.id_rol, funcion.id_funcion
from	rol, xdbPagina pagina, pagina_funcion, funcion
where	rol.id_grupo_aplicacion = pagina.id_grupo_aplicacion_rol
and		rol.numero_tipo_rol in (8,16)
and		pagina.id_pagina = pagina_funcion.id_pagina
and		pagina_funcion.id_funcion = funcion.id_funcion
and		pagina.numero_tipo_recurso in (11,12,13,14)
and		funcion.es_publica=0
and		funcion.es_programatica=0
and		funcion.id_funcion not in (select id_funcion from rol_funcion where id_rol=rol.id_rol)
order by 1
OPEN rol_funcion_cursor
DECLARE @id bigint
DECLARE @rol bigint
DECLARE @funcion bigint
DECLARE @pp bigint
SET @id = 0
SET @pp = 0
FETCH NEXT FROM rol_funcion_cursor INTO @rol, @funcion
WHILE (@@FETCH_STATUS <> -1)
BEGIN
	IF (@@FETCH_STATUS <> -2)
	BEGIN
		IF (@pp <> @rol)
			BEGIN
			SELECT @id = MAX(id_rol_funcion) FROM rol_funcion WHERE id_rol = @rol
			IF (@id IS NULL) SET @id = 1000*@rol
			END
		SET @id = @id + 1
		SET @pp = @rol
		PRINT CAST(@id AS VARCHAR) + ' ' + CAST(@rol AS VARCHAR) + ' ' + CAST(@funcion AS VARCHAR)
		IF (@rehearsal = 0)
			INSERT
			INTO	rol_funcion (id_rol_funcion, id_rol, id_funcion)
			VALUES (@id, @rol, @funcion)
	END
	FETCH NEXT FROM rol_funcion_cursor INTO @rol, @funcion
END
CLOSE rol_funcion_cursor
DEALLOCATE rol_funcion_cursor
END
GO
SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
