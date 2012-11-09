/**/
exec xsp.dropone('view','consulta_tipo_persona_hogar_1');
/**/
CREATE VIEW consulta_tipo_persona_hogar_1 AS
SELECT
	tipo_persona_hogar.numero_tipo_persona_hogar AS numero_tipo_persona_hogar,
	tipo_persona_hogar.codigo_tipo_persona_hogar AS codigo_tipo_persona_hogar
FROM
	tipo_persona_hogar tipo_persona_hogar;

