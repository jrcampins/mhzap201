/**/
DROP VIEW IF EXISTS consulta_parametro_global_1;
/**/
CREATE OR REPLACE VIEW consulta_parametro_global_1 AS
SELECT
	parametro_global.numero_parametro_global AS numero_parametro_global,
	parametro_global.codigo_parametro_global AS codigo_parametro_global,
	parametro_global.monto_salario_minimo AS monto_salario_minimo,
	parametro_global.porcentaje_pension_alimentaria AS porcentaje_pension_alimentaria,
	parametro_global.es_control_cer_vida_activo AS es_control_cer_vida_activo,
	parametro_global.meses_validez_certificado_vida AS meses_validez_certificado_vida,
	parametro_global.es_control_cobro_pension_activ AS es_control_cobro_pension_activ,
	parametro_global.meses_ultimo_cobro_pension AS meses_ultimo_cobro_pension,
	parametro_global.es_control_reproceso_pen_activ AS es_control_reproceso_pen_activ,
	parametro_global.limite_indice_calidad_vida AS limite_indice_calidad_vida,
	parametro_global.limite_pensiones AS limite_pensiones
FROM
	parametro_global parametro_global;

