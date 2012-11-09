SET DATEFORMAT ymd
GO
INSERT INTO tipo_parametro_dom (numero_tipo_parametro_dom, codigo_tipo_parametro_dom, codigo_propiedad_interfaz, nombre_interfaz, etiqueta_parametro)
VALUES (1, 'id', 'identificacion_recurso', 'RecursoIdentificable', 'Identificación');
INSERT INTO tipo_parametro_dom (numero_tipo_parametro_dom, codigo_tipo_parametro_dom, codigo_propiedad_interfaz, nombre_interfaz, etiqueta_parametro)
VALUES (2, 'version', 'version_recurso', 'RecursoVersionable', 'Versión');
INSERT INTO tipo_parametro_dom (numero_tipo_parametro_dom, codigo_tipo_parametro_dom, codigo_propiedad_interfaz, nombre_interfaz, etiqueta_parametro)
VALUES (3, 'codigo', 'codigo_recurso', 'RecursoCodificable', 'Código');
INSERT INTO tipo_parametro_dom (numero_tipo_parametro_dom, codigo_tipo_parametro_dom, codigo_propiedad_interfaz, nombre_interfaz, etiqueta_parametro)
VALUES (4, 'nombre', 'nombre_recurso', 'RecursoNombrable', 'Nombre');
INSERT INTO tipo_parametro_dom (numero_tipo_parametro_dom, codigo_tipo_parametro_dom, codigo_propiedad_interfaz, nombre_interfaz, etiqueta_parametro)
VALUES (5, 'propietario', 'propietario_recurso', 'RecursoPersonalizable', 'Propietario');
INSERT INTO tipo_parametro_dom (numero_tipo_parametro_dom, codigo_tipo_parametro_dom, codigo_propiedad_interfaz, nombre_interfaz, etiqueta_parametro)
VALUES (6, 'segmento', 'segmento_recurso', 'RecursoSegmentable', 'Segmento');
INSERT INTO tipo_parametro_dom (numero_tipo_parametro_dom, codigo_tipo_parametro_dom, codigo_propiedad_interfaz, nombre_interfaz, etiqueta_parametro)
VALUES (7, 'superior', 'recurso_superior', 'RecursoJerarquizable', 'Superior');
INSERT INTO tipo_parametro_dom (numero_tipo_parametro_dom, codigo_tipo_parametro_dom, codigo_propiedad_interfaz, nombre_interfaz, etiqueta_parametro)
VALUES (8, 'inactivo', 'es_recurso_inactivo', 'RecursoDesactivable', 'Inactivo');
INSERT INTO tipo_parametro_dom (numero_tipo_parametro_dom, codigo_tipo_parametro_dom, codigo_propiedad_interfaz, nombre_interfaz, etiqueta_parametro)
VALUES (9, 'numero', 'numero_recurso', 'RecursoEnumerable', 'Número');
GO
