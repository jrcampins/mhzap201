/**/
DROP VIEW IF EXISTS consulta_objecion_ele_pen_1;
/**/
CREATE OR REPLACE VIEW consulta_objecion_ele_pen_1 AS
SELECT
	objecion_ele_pen.id_objecion_ele_pen AS id_objecion_ele_pen,
	objecion_ele_pen.version_objecion_ele_pen AS version_objecion_ele_pen,
	objecion_ele_pen.id_persona AS id_persona,
		persona_1x1.codigo_persona AS codigo_persona_1x1y3,
		persona_1x1.nombre_persona AS nombre_persona_1x1y4,
		persona_1x1.numero_cedula AS numero_cedula_1x1y5,
		persona_1x1.letra_cedula AS letra_cedula_1x1y6,
		persona_1x1.fecha_expedicion_cedula AS fecha_expedicion_cedula_1x1y7,
		persona_1x1.fecha_vencimiento_cedula AS fecha_vencimiento_cedula_1x1y8,
		persona_1x1.primer_nombre AS primer_nombre_1x1y9,
		persona_1x1.segundo_nombre AS segundo_nombre_1x1y10,
		persona_1x1.primer_apellido AS primer_apellido_1x1y11,
		persona_1x1.segundo_apellido AS segundo_apellido_1x1y12,
		persona_1x1.apellido_casada AS apellido_casada_1x1y13,
		persona_1x1.apodo AS apodo_1x1y14,
		persona_1x1.fecha_nacimiento AS fecha_nacimiento_1x1y15,
		persona_1x1.numero_sexo_persona AS numero_sexo_persona_1x1y16,
		persona_1x1.numero_estado_civil AS numero_estado_civil_1x1y17,
		persona_1x1.es_paraguayo_natural AS es_paraguayo_natural_1x1y18,
		persona_1x1.es_indigena AS es_indigena_1x1y19,
		persona_1x1.id_etnia_indigena AS id_etnia_indigena_1x1y20,
		persona_1x1.nombre_comunidad_indigena AS nombre_comunidad_indige_1x1y21,
		persona_1x1.id_departamento AS id_departamento_1x1y22,
		persona_1x1.id_distrito AS id_distrito_1x1y23,
		persona_1x1.numero_tipo_area AS numero_tipo_area_1x1y24,
		persona_1x1.id_barrio AS id_barrio_1x1y25,
		persona_1x1.id_manzana AS id_manzana_1x1y26,
		persona_1x1.manzana AS manzana_1x1y27,
		persona_1x1.direccion AS direccion_1x1y28,
		persona_1x1.numero_telefono_linea_baja AS numero_telefono_linea_b_1x1y29,
		persona_1x1.numero_telefono_celular AS numero_telefono_celular_1x1y30,
		persona_1x1.certificado_vida AS certificado_vida_1x1y31,
		persona_1x1.fecha_certificado_vida AS fecha_certificado_vida_1x1y32,
		persona_1x1.es_certificado_vida_anulado AS es_certificado_vida_anu_1x1y33,
		persona_1x1.comentarios_anul_cer_vida AS comentarios_anul_cer_vi_1x1y34,
		persona_1x1.certificado_defuncion AS certificado_defuncion_1x1y35,
		persona_1x1.fecha_certificado_defuncion AS fecha_certificado_defun_1x1y36,
		persona_1x1.es_cer_defuncion_anulado AS es_cer_defuncion_anulad_1x1y37,
		persona_1x1.comentarios_anul_cer_defuncion AS comentarios_anul_cer_de_1x1y38,
		persona_1x1.es_persona_con_empleo AS es_persona_con_empleo_1x1y39,
		persona_1x1.es_persona_con_jubilacion AS es_persona_con_jubilaci_1x1y40,
		persona_1x1.es_persona_con_pension AS es_persona_con_pension_1x1y41,
		persona_1x1.es_persona_con_subsidio AS es_persona_con_subsidio_1x1y42,
		persona_1x1.es_persona_con_deuda AS es_persona_con_deuda_1x1y43,
		persona_1x1.es_persona_con_pena_judicial AS es_persona_con_pena_jud_1x1y44,
		persona_1x1.es_persona_con_cer_vida AS es_persona_con_cer_vida_1x1y45,
		persona_1x1.es_persona_con_carta_renuncia AS es_persona_con_carta_re_1x1y46,
		persona_1x1.es_persona_elegible_para_pen AS es_persona_elegible_par_1x1y47,
		persona_1x1.es_persona_acreditada_para_pen AS es_persona_acreditada_p_1x1y48,
		persona_1x1.es_persona_con_copia_cedula AS es_persona_con_copia_ce_1x1y49,
		persona_1x1.es_persona_con_declaracion_jur AS es_persona_con_declarac_1x1y50,
		persona_1x1.monto_pension AS monto_pension_1x1y51,
		persona_1x1.numero_condicion_pension AS numero_condicion_pensio_1x1y52,
		persona_1x1.lugar_solicitud_pension AS lugar_solicitud_pension_1x1y53,
		persona_1x1.fecha_solicitud_pension AS fecha_solicitud_pension_1x1y54,
		persona_1x1.comentarios_solicitud_pension AS comentarios_solicitud_p_1x1y55,
		persona_1x1.fecha_aprobacion_pension AS fecha_aprobacion_pensio_1x1y56,
		persona_1x1.comentarios_aprobacion_pension AS comentarios_aprobacion__1x1y57,
		persona_1x1.fecha_otorgamiento_pen AS fecha_otorgamiento_pen_1x1y58,
		persona_1x1.numero_resolucion_otor_pen AS numero_resolucion_otor__1x1y59,
		persona_1x1.fecha_resolucion_otor_pen AS fecha_resolucion_otor_p_1x1y60,
		persona_1x1.comentarios_otorgamiento_pen AS comentarios_otorgamient_1x1y61,
		persona_1x1.fecha_objecion_pension AS fecha_objecion_pension_1x1y62,
		persona_1x1.numero_causa_den_pension AS numero_causa_den_pensio_1x1y63,
		persona_1x1.otra_causa_den_pension AS otra_causa_den_pension_1x1y64,
		persona_1x1.comentarios_objecion_pension AS comentarios_objecion_pe_1x1y65,
		persona_1x1.fecha_denegacion_pension AS fecha_denegacion_pensio_1x1y66,
		persona_1x1.numero_resolucion_den_pen AS numero_resolucion_den_p_1x1y67,
		persona_1x1.fecha_resolucion_den_pen AS fecha_resolucion_den_pe_1x1y68,
		persona_1x1.comentarios_denegacion_pension AS comentarios_denegacion__1x1y69,
		persona_1x1.fecha_revocacion_pension AS fecha_revocacion_pensio_1x1y70,
		persona_1x1.numero_causa_rev_pension AS numero_causa_rev_pensio_1x1y71,
		persona_1x1.otra_causa_rev_pension AS otra_causa_rev_pension_1x1y72,
		persona_1x1.comentarios_revocacion_pension AS comentarios_revocacion__1x1y73,
		persona_1x1.numero_condicion_reco_pen AS numero_condicion_reco_p_1x1y74,
		persona_1x1.fecha_solicitud_reco_pen AS fecha_solicitud_reco_pe_1x1y75,
		persona_1x1.comentarios_solicitud_reco_pen AS comentarios_solicitud_r_1x1y76,
		persona_1x1.fecha_aprobacion_reco_pen AS fecha_aprobacion_reco_p_1x1y77,
		persona_1x1.comentarios_apr_reco_pen AS comentarios_apr_reco_pe_1x1y78,
		persona_1x1.fecha_denegacion_reco_pen AS fecha_denegacion_reco_p_1x1y79,
		persona_1x1.numero_causa_den_reco_pen AS numero_causa_den_reco_p_1x1y80,
		persona_1x1.otra_causa_den_reco_pen AS otra_causa_den_reco_pen_1x1y81,
		persona_1x1.comentarios_den_reco_pen AS comentarios_den_reco_pe_1x1y82,
		persona_1x1.numero_condicion_denu_pen AS numero_condicion_denu_p_1x1y83,
		persona_1x1.fecha_registro_denuncia_pen AS fecha_registro_denuncia_1x1y84,
		persona_1x1.comentarios_registro_denu_pen AS comentarios_registro_de_1x1y85,
		persona_1x1.fecha_confirmacion_denu_pen AS fecha_confirmacion_denu_1x1y86,
		persona_1x1.comentarios_conf_denu_pen AS comentarios_conf_denu_p_1x1y87,
		persona_1x1.fecha_desmentido_denuncia_pen AS fecha_desmentido_denunc_1x1y88,
		persona_1x1.comentarios_des_denu_pen AS comentarios_des_denu_pe_1x1y89,
		persona_1x1.id_ficha_persona AS id_ficha_persona_1x1y90,
		persona_1x1.fecha_ficha_persona AS fecha_ficha_persona_1x1y91,
		persona_1x1.indice_calidad_vida AS indice_calidad_vida_1x1y92,
		persona_1x1.fecha_ultimo_cobro_pension AS fecha_ultimo_cobro_pens_1x1y93,
		persona_1x1.notas_anul_fec_ult_cob_pen AS notas_anul_fec_ult_cob__1x1y94,
		persona_1x1.numero_tipo_act_jupe AS numero_tipo_act_jupe_1x1y95,
		persona_1x1.fecha_hora_ult_act_jupe AS fecha_hora_ult_act_jupe_1x1y96,
		persona_1x1.lote AS lote_1x1y97,
		persona_1x1.codigo_sime AS codigo_sime_1x1y98,
		persona_1x1.comentarios_entrega_documentos AS comentarios_entrega_doc_1x1y99,
	objecion_ele_pen.id_proveedor_dat_ext AS id_proveedor_dat_ext,
		proveedor_dat_ext_1x2.codigo_proveedor_dat_ext AS codigo_proveedor_dat_ext_1x2y3,
		proveedor_dat_ext_1x2.nombre_proveedor_dat_ext AS nombre_proveedor_dat_ext_1x2y4,
	objecion_ele_pen.numero_tipo_obj_ele_pen AS numero_tipo_obj_ele_pen,
		tipo_obj_ele_pen_1x3.codigo_tipo_obj_ele_pen AS codigo_tipo_obj_ele_pen_1x3y2,
	objecion_ele_pen.es_objecion_ele_pen_inactiva AS es_objecion_ele_pen_inactiva,
	objecion_ele_pen.fecha_ultima_actualizacion AS fecha_ultima_actualizacion,
	objecion_ele_pen.nombre_archivo_ultima_act AS nombre_archivo_ultima_act,
	objecion_ele_pen.observaciones AS observaciones
FROM
	objecion_ele_pen objecion_ele_pen
	INNER JOIN persona persona_1x1 ON persona_1x1.id_persona = objecion_ele_pen.id_persona
	INNER JOIN proveedor_dat_ext proveedor_dat_ext_1x2 ON proveedor_dat_ext_1x2.id_proveedor_dat_ext = objecion_ele_pen.id_proveedor_dat_ext
	INNER JOIN tipo_obj_ele_pen tipo_obj_ele_pen_1x3 ON tipo_obj_ele_pen_1x3.numero_tipo_obj_ele_pen = objecion_ele_pen.numero_tipo_obj_ele_pen;

