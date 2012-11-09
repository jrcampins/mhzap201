/**/
exec xsp.dropone('view','consulta_clase_enf_acc_1');
/**/
CREATE VIEW consulta_clase_enf_acc_1 AS
SELECT
	clase_enf_acc.numero_clase_enf_acc AS numero_clase_enf_acc,
	clase_enf_acc.codigo_clase_enf_acc AS codigo_clase_enf_acc
FROM
	clase_enf_acc clase_enf_acc;

