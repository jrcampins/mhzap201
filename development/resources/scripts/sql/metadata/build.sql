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
