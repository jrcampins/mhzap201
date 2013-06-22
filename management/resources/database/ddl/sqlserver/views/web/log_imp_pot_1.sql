if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[consulta_log_imp_pot_1]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[consulta_log_imp_pot_1]
GO

SET QUOTED_IDENTIFIER ON 
GO

SET ANSI_NULLS ON 
GO

CREATE VIEW [dbo].[consulta_log_imp_pot_1] AS
SELECT
	log_imp_pot.id_log_imp_pot AS id_log_imp_pot,
	log_imp_pot.version_log_imp_pot AS version_log_imp_pot,
	log_imp_pot.departamento AS departamento,
	log_imp_pot.distrito AS distrito,
	log_imp_pot.nombres_apellidos AS nombres_apellidos,
	log_imp_pot.apodo AS apodo,
	log_imp_pot.edad_a_la_fecha AS edad_a_la_fecha,
	log_imp_pot.nacimiento AS nacimiento,
	log_imp_pot.cedula AS cedula,
	log_imp_pot.telefono AS telefono,
	log_imp_pot.direccion AS direccion,
	log_imp_pot.referencia AS referencia,
	log_imp_pot.barrio AS barrio,
	log_imp_pot.nombre_referente AS nombre_referente,
	log_imp_pot.telefono_referente AS telefono_referente,
	log_imp_pot.es_importado AS es_importado,
	log_imp_pot.observacion AS observacion,
	log_imp_pot.fecha_hora_transaccion AS fecha_hora_transaccion,
	log_imp_pot.nombre_archivo AS nombre_archivo,
	log_imp_pot.codigo_archivo AS codigo_archivo,
	log_imp_pot.id_potencial_ben AS id_potencial_ben,
		potencial_ben_1x1.codigo_potencial_ben AS codigo_potencial_ben_1x1y3,
		potencial_ben_1x1.nombre_potencial_ben AS nombre_potencial_ben_1x1y4,
		potencial_ben_1x1.numero_tipo_reg_pot_ben AS numero_tipo_reg_pot_ben_1x1y5,
		potencial_ben_1x1.id_persona AS id_persona_1x1y6,
		potencial_ben_1x1.numero_cedula AS numero_cedula_1x1y7,
		potencial_ben_1x1.letra_cedula AS letra_cedula_1x1y8,
		potencial_ben_1x1.fecha_expedicion_cedula AS fecha_expedicion_cedula_1x1y9,
		potencial_ben_1x1.fecha_vencimiento_cedula AS fecha_vencimiento_cedul_1x1y10,
		potencial_ben_1x1.primer_nombre AS primer_nombre_1x1y11,
		potencial_ben_1x1.segundo_nombre AS segundo_nombre_1x1y12,
		potencial_ben_1x1.primer_apellido AS primer_apellido_1x1y13,
		potencial_ben_1x1.segundo_apellido AS segundo_apellido_1x1y14,
		potencial_ben_1x1.apellido_casada AS apellido_casada_1x1y15,
		potencial_ben_1x1.apodo AS apodo_1x1y16,
		potencial_ben_1x1.fecha_nacimiento AS fecha_nacimiento_1x1y17,
		potencial_ben_1x1.edad AS edad_1x1y18,
		potencial_ben_1x1.es_paraguayo_natural AS es_paraguayo_natural_1x1y19,
		potencial_ben_1x1.es_indigena AS es_indigena_1x1y20,
		potencial_ben_1x1.id_etnia_indigena AS id_etnia_indigena_1x1y21,
		potencial_ben_1x1.nombre_comunidad_indigena AS nombre_comunidad_indige_1x1y22,
		potencial_ben_1x1.id_departamento AS id_departamento_1x1y23,
		potencial_ben_1x1.id_distrito AS id_distrito_1x1y24,
		potencial_ben_1x1.numero_tipo_area AS numero_tipo_area_1x1y25,
		potencial_ben_1x1.id_barrio AS id_barrio_1x1y26,
		potencial_ben_1x1.id_manzana AS id_manzana_1x1y27,
		potencial_ben_1x1.manzana AS manzana_1x1y28,
		potencial_ben_1x1.compania AS compania_1x1y29,
		potencial_ben_1x1.direccion AS direccion_1x1y30,
		potencial_ben_1x1.nombre_responsable_hogar AS nombre_responsable_hoga_1x1y31,
		potencial_ben_1x1.numero_telefono_resp_hogar AS numero_telefono_resp_ho_1x1y32,
		potencial_ben_1x1.es_persona_con_empleo AS es_persona_con_empleo_1x1y33,
		potencial_ben_1x1.es_persona_con_jubilacion AS es_persona_con_jubilaci_1x1y34,
		potencial_ben_1x1.es_persona_con_pension AS es_persona_con_pension_1x1y35,
		potencial_ben_1x1.es_persona_con_subsidio AS es_persona_con_subsidio_1x1y36,
		potencial_ben_1x1.es_persona_con_deuda AS es_persona_con_deuda_1x1y37,
		potencial_ben_1x1.es_persona_con_pena_judicial AS es_persona_con_pena_jud_1x1y38,
		potencial_ben_1x1.es_persona_con_cer_vida AS es_persona_con_cer_vida_1x1y39,
		potencial_ben_1x1.es_persona_con_carta_renuncia AS es_persona_con_carta_re_1x1y40,
		potencial_ben_1x1.nombre_referente AS nombre_referente_1x1y41,
		potencial_ben_1x1.numero_telefono_referente AS numero_telefono_referen_1x1y42,
		potencial_ben_1x1.numero_condicion_censo AS numero_condicion_censo_1x1y43,
		potencial_ben_1x1.fecha_validacion_censo AS fecha_validacion_censo_1x1y44,
		potencial_ben_1x1.id_funcionario_validacion_cen AS id_funcionario_validaci_1x1y45,
		potencial_ben_1x1.numero_causa_inv_censo AS numero_causa_inv_censo_1x1y46,
		potencial_ben_1x1.otra_causa_inv_censo AS otra_causa_inv_censo_1x1y47,
		potencial_ben_1x1.comentarios_validacion_censo AS comentarios_validacion__1x1y48,
		potencial_ben_1x1.id_ficha_persona AS id_ficha_persona_1x1y49,
		potencial_ben_1x1.numero_condicion_recl_cen AS numero_condicion_recl_c_1x1y50,
		potencial_ben_1x1.fecha_reclamo_censo AS fecha_reclamo_censo_1x1y51,
		potencial_ben_1x1.comentarios_reclamo_censo AS comentarios_reclamo_cen_1x1y52,
		potencial_ben_1x1.fecha_aprobacion_reclamo_censo AS fecha_aprobacion_reclam_1x1y53,
		potencial_ben_1x1.comentarios_apr_recl_cen AS comentarios_apr_recl_ce_1x1y54,
		potencial_ben_1x1.fecha_denegacion_reclamo_censo AS fecha_denegacion_reclam_1x1y55,
		potencial_ben_1x1.numero_causa_den_recl_cen AS numero_causa_den_recl_c_1x1y56,
		potencial_ben_1x1.otra_causa_den_recl_cen AS otra_causa_den_recl_cen_1x1y57,
		potencial_ben_1x1.comentarios_den_recl_cen AS comentarios_den_recl_ce_1x1y58,
		potencial_ben_1x1.fecha_registro_pot_ben AS fecha_registro_pot_ben_1x1y59,
		potencial_ben_1x1.id_usuario_reg_pot_ben AS id_usuario_reg_pot_ben_1x1y60,
		potencial_ben_1x1.es_potencial_ben_inactivo AS es_potencial_ben_inacti_1x1y61,
		potencial_ben_1x1.fecha_ultima_visita_censo AS fecha_ultima_visita_cen_1x1y62,
		potencial_ben_1x1.observaciones_ult_visita_cen AS observaciones_ult_visit_1x1y63,
		potencial_ben_1x1.id_funcionario_ult_visita_cen AS id_funcionario_ult_visi_1x1y64,
		potencial_ben_1x1.referencia_direccion AS referencia_direccion_1x1y65,
		potencial_ben_1x1.indice_calidad_vida AS indice_calidad_vida_1x1y66,
		potencial_ben_1x1.es_potencial_ben_migrado AS es_potencial_ben_migrad_1x1y67,
		potencial_ben_1x1.lote AS lote_1x1y68
FROM
	log_imp_pot log_imp_pot
	LEFT OUTER JOIN potencial_ben potencial_ben_1x1 ON potencial_ben_1x1.id_potencial_ben = log_imp_pot.id_potencial_ben
GO

SET QUOTED_IDENTIFIER OFF 
GO

SET ANSI_NULLS ON 
GO
