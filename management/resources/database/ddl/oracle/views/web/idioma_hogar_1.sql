/**/
exec xsp.dropone('view','consulta_idioma_hogar_1');
/**/
CREATE VIEW consulta_idioma_hogar_1 AS
SELECT
	idioma_hogar.numero_idioma_hogar AS numero_idioma_hogar,
	idioma_hogar.codigo_idioma_hogar AS codigo_idioma_hogar
FROM
	idioma_hogar idioma_hogar;

