USE MHZMD201
GO

SELECT DISTINCT [codigo_grupo_aplicacion] 
FROM [xdbPagina] JOIN [grupo_aplicacion] ON [grupo_aplicacion].[id_grupo_aplicacion] = [id_grupo_aplicacion_rol] 
order by 1 -- [codigo_grupo_aplicacion], [codigo_pagina]
GO
SELECT 'else if (jsp == ''' + [codigo_pagina] + ''') htm = ''' + [codigo_grupo_aplicacion] + ''';' 
-- [id_pagina], [version_pagina], 
-- [codigo_pagina], -- [nombre_pagina], [descripcion_pagina], [url_pagina], 
-- [id_aplicacion], [es_publica], [numero_tipo_pagina], [id_dominio], [id_dominio_maestro], [id_parametro], 
-- [codigo_aplicacion], -- [nombre_aplicacion], [es_aplicacion_publica], 
-- [codigo_clase_recurso], [nombre_clase_recurso], [es_clase_recurso_independiente], [es_clase_recurso_sin_detalle], [es_clase_recurso_con_arbol], 
-- [numero_tipo_recurso], [numero_tipo_clase_recurso], 
-- [id_grupo_aplicacion], [id_grupo_aplicacion_clase_recurso], 
-- [id_grupo_aplicacion_rol], [codigo_grupo_aplicacion] 
FROM [xdbPagina] JOIN [grupo_aplicacion] ON [grupo_aplicacion].[id_grupo_aplicacion] = [id_grupo_aplicacion_rol] 
order by 1 -- [codigo_grupo_aplicacion], [codigo_pagina]
GO
