USE MHZMD201
GO
EXEC xdbTablesReload
GO
EXEC xdbViewsReload
GO
BEGIN TRANSACTION
DELETE FROM opcion_menu where url_opcion_menu like'redirect%' and es_opcion_menu_sincronizada=0
EXEC xdbMetadataClean
EXEC xdbMetadataBuild
COMMIT TRANSACTION
GO
SELECT 'OK'
GO
insert into dominio_parametro (id_dominio_parametro, id_dominio, id_parametro, numero_tipo_parametro_dom, etiqueta_parametro)
select	100*id_dominio+numero_tipo_parametro_dom, id_dominio, id_parametro, numero_tipo_parametro_dom, 'Usuario'
from dominio, parametro, tipo_parametro_dom
where codigo_dominio='persona_seleccionada' and codigo_parametro='id_usuario' and codigo_tipo_parametro_dom='propietario'
go
update funcion set es_personalizada=1
from funcion inner join dominio on dominio.id_dominio=funcion.id_dominio
where codigo_dominio='persona_seleccionada'
go
SELECT 'OK+'
GO
