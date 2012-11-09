/**/
DROP VIEW IF EXISTS consulta_etnia_indigena_1;
/**/
CREATE OR REPLACE VIEW consulta_etnia_indigena_1 AS
SELECT
	etnia_indigena.id_etnia_indigena AS id_etnia_indigena,
	etnia_indigena.version_etnia_indigena AS version_etnia_indigena,
	etnia_indigena.codigo_etnia_indigena AS codigo_etnia_indigena,
	etnia_indigena.nombre_etnia_indigena AS nombre_etnia_indigena,
	etnia_indigena.descripcion_etnia_indigena AS descripcion_etnia_indigena
FROM
	etnia_indigena etnia_indigena;

