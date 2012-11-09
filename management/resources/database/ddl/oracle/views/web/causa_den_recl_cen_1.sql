/**/
exec xsp.dropone('view','consulta_causa_den_recl_cen_1');
/**/
CREATE VIEW consulta_causa_den_recl_cen_1 AS
SELECT
	causa_den_recl_cen.numero_causa_den_recl_cen AS numero_causa_den_recl_cen,
	causa_den_recl_cen.codigo_causa_den_recl_cen AS codigo_causa_den_recl_cen
FROM
	causa_den_recl_cen causa_den_recl_cen;

