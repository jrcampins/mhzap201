/**/
exec xsp.dropone('view','consulta_opcion_sistema_1');
/**/
CREATE VIEW consulta_opcion_sistema_1 AS
SELECT
	opcion_sistema.id_opcion_sistema AS id_opcion_sistema,
	opcion_sistema.version_opcion_sistema AS version_opcion_sistema,
	opcion_sistema.clave_opcion_sistema AS clave_opcion_sistema,
	opcion_sistema.valor_opcion_sistema AS valor_opcion_sistema,
	opcion_sistema.significado_opcion_sistema AS significado_opcion_sistema
FROM
	opcion_sistema opcion_sistema;

