/**/
exec xsp.dropone('view','consulta_tipo_act_jupe_1');
/**/
CREATE VIEW consulta_tipo_act_jupe_1 AS
SELECT
	tipo_act_jupe.numero_tipo_act_jupe AS numero_tipo_act_jupe,
	tipo_act_jupe.codigo_tipo_act_jupe AS codigo_tipo_act_jupe
FROM
	tipo_act_jupe tipo_act_jupe;

