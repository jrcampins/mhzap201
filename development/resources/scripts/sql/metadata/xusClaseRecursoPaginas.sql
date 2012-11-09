SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
DROP PROCEDURE xusClaseRecursoPaginas
GO
CREATE PROCEDURE xusClaseRecursoPaginas AS
BEGIN
DECLARE @clasebase bigint
SELECT	@clasebase = 10000
DECLARE @rehearsal integer
SELECT 	@rehearsal = id_dual FROM dual 
IF (@rehearsal = 0)
	UPDATE clase_recurso
	SET id_pagina_seleccion = 10000*id_clase_recurso+1
	WHERE id_clase_recurso >= @clasebase
	AND EXISTS (SELECT 1 FROM pagina WHERE id_pagina = 10000*clase_recurso.id_clase_recurso+numero_tipo_pagina and numero_tipo_pagina=1)
	UPDATE clase_recurso
	SET id_pagina_detalle = 10000*id_clase_recurso+2
	WHERE id_clase_recurso >= @clasebase
	AND EXISTS (SELECT 2 FROM pagina WHERE id_pagina = 10000*clase_recurso.id_clase_recurso+numero_tipo_pagina and numero_tipo_pagina=2)
END
GO
SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
