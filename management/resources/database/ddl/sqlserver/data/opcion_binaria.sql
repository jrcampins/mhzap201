SET DATEFORMAT ymd
GO
INSERT INTO opcion_binaria (numero_opcion_binaria, codigo_opcion_si_no, codigo_opcion_activo_inactivo, codigo_opcion_enc_apa, codigo_opcion_presente_ausente, codigo_opcion_pos_neg, codigo_opcion_verdadero_falso)
VALUES (0, 'No', 'Inactivo', 'Apagado', 'Ausente', 'Negativo', 'Falso');
INSERT INTO opcion_binaria (numero_opcion_binaria, codigo_opcion_si_no, codigo_opcion_activo_inactivo, codigo_opcion_enc_apa, codigo_opcion_presente_ausente, codigo_opcion_pos_neg, codigo_opcion_verdadero_falso)
VALUES (1, 'Si', 'Activo', 'Encendido', 'Presente', 'Positivo', 'Verdadero');
GO
