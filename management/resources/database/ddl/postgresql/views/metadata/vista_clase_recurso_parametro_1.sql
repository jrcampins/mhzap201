DROP VIEW IF EXISTS vista_clase_recurso_parametro_1;
CREATE OR REPLACE VIEW vista_clase_recurso_parametro_1 AS
SELECT
    clase_recurso_parametro.*
FROM
    clase_recurso_parametro
LEFT OUTER JOIN
    clase_recurso_seccion
ON
    clase_recurso_seccion.id_clase_recurso_seccion = clase_recurso_parametro.id_clase_recurso_seccion
ORDER BY
    clase_recurso_parametro.id_clase_recurso,
    clase_recurso_seccion.orden_presentacion,
    clase_recurso_seccion.id_clase_recurso_seccion,
    clase_recurso_parametro.orden_presentacion,
    clase_recurso_parametro.id_clase_recurso_parametro;
