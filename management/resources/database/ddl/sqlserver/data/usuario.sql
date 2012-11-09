SET DATEFORMAT ymd
GO
INSERT INTO usuario (id_usuario, version_usuario, codigo_usuario, nombre_usuario, password_usuario, correo_electronico, id_usuario_supervisor, es_super_usuario, es_usuario_especial, es_usuario_inactivo, es_usuario_modificado)
VALUES (101, 0, 'admin', 'Administrador', '08b34b490b607342b007843310a284c6', NULL, NULL, 1, 1, 0, 0);
INSERT INTO usuario (id_usuario, version_usuario, codigo_usuario, nombre_usuario, password_usuario, correo_electronico, id_usuario_supervisor, es_super_usuario, es_usuario_especial, es_usuario_inactivo, es_usuario_modificado)
VALUES (102, 0, 'audit', 'Auditor', '08b34b490b607342b007843310a284c6', NULL, NULL, 0, 1, 0, 0);
INSERT INTO usuario (id_usuario, version_usuario, codigo_usuario, nombre_usuario, password_usuario, correo_electronico, id_usuario_supervisor, es_super_usuario, es_usuario_especial, es_usuario_inactivo, es_usuario_modificado)
VALUES (103, 0, 'oper', 'Operador', '08b34b490b607342b007843310a284c6', NULL, NULL, 0, 1, 0, 0);
GO
