SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
DROP PROCEDURE xdbMetadataClean
GO
CREATE PROCEDURE xdbMetadataClean AS
BEGIN
update clase_recurso set id_pagina_seleccion=null where id_clase_recurso>=20000 -- or id_aplicacion_web=41100
update clase_recurso set id_pagina_detalle=null where id_clase_recurso>=20000 -- or id_aplicacion_web=41100
delete from rol where id_rol>=10000
delete from aplicacion where id_aplicacion>=20000 and id_aplicacion<>41100
------------------------------------------------------------------------------------------------------------------------
update clase_recurso set id_funcion_seleccion=null where id_clase_recurso>=20000
update dominio set id_funcion_seleccion=null where id_clase_recurso
	in (select id_clase_recurso from clase_recurso where id_clase_recurso>=20000)
update funcion_parametro set id_funcion_referencia=null where id_funcion_referencia
	in (select id_funcion from funcion, dominio where funcion.id_dominio=dominio.id_dominio and dominio.id_clase_recurso
	in (select id_clase_recurso from clase_recurso where id_clase_recurso>=20000))
update funcion_parametro set id_clase_recurso_valor=null,numero_tipo_valor=11 where id_clase_recurso_valor
	in (select id_clase_recurso from clase_recurso where id_clase_recurso>=20000)
------------------------------------------------------------------------------------------------------------------------
/*
update	clase_recurso_par set
	numero_tipo_valor_alternativo      = numero_tipo_valor,
	id_funcion_referencia_alternativa  = id_funcion_referencia,
	id_lista_valor_alternativa         = id_lista_valor,
	id_clase_objeto_valor_alternativa  = id_clase_objeto_valor,
	id_clase_recurso_valor_alternativa = id_clase_recurso_valor
where	es_parametro_sincronizado=1
and	es_referencia_alternativa=1
and	numero_tipo_valor <> 11
*/
------------------------------------------------------------------------------------------------------------------------
update clase_recurso_par set id_funcion_referencia=null where id_funcion_referencia
	in (select id_funcion from funcion, dominio where funcion.id_dominio=dominio.id_dominio and dominio.id_clase_recurso
	in (select id_clase_recurso from clase_recurso where id_clase_recurso>=20000))
update clase_recurso_par set id_clase_recurso_valor=null,numero_tipo_valor=11 where id_clase_recurso_valor
	in (select id_clase_recurso from clase_recurso where id_clase_recurso>=20000)
--
delete from filtro_funcion;
delete from funcion_parametro where id_funcion
	in (select id_funcion from funcion, dominio where funcion.id_dominio=dominio.id_dominio and dominio.id_clase_recurso
	in (select id_clase_recurso from clase_recurso where id_clase_recurso>=20000))
delete from funcion where id_funcion
	in (select id_funcion from funcion, dominio where funcion.id_dominio=dominio.id_dominio and dominio.id_clase_recurso
	in (select id_clase_recurso from clase_recurso where id_clase_recurso>=20000))
delete from dominio where id_clase_recurso>=20000
------------------------------------------------------------------------------------------------------------------------
delete
from parametro
where id_parametro>=20000
and id_parametro not in (select id_parametro from dominio_parametro)
and id_parametro not in (select id_parametro from funcion_parametro)
and id_parametro not in (select id_parametro from clase_recurso_par)
and codigo_parametro not in (select colname from xdbScriptTables)
------------------------------------------------------------------------------------------------------------------------
END
GO
SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
