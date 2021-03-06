/**/
DROP VIEW IF EXISTS consulta_log_pro_acr_pot_ben_1;
/**/
CREATE OR REPLACE VIEW consulta_log_pro_acr_pot_ben_1 AS
SELECT
	log_pro_acr_pot_ben.id_log_pro_acr_pot_ben AS id_log_pro_acr_pot_ben,
	log_pro_acr_pot_ben.version_log_pro_acr_pot_ben AS version_log_pro_acr_pot_ben,
	log_pro_acr_pot_ben.id_potencial_ben AS id_potencial_ben,
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
		potencial_ben_1x1.lote AS lote_1x1y68,
	log_pro_acr_pot_ben.nombre_potencial_ben AS nombre_potencial_ben,
	log_pro_acr_pot_ben.codigo_potencial_ben AS codigo_potencial_ben,
	log_pro_acr_pot_ben.fecha_registro_pot_ben AS fecha_registro_pot_ben,
	log_pro_acr_pot_ben.id_persona AS id_persona,
		persona_1x2.codigo_persona AS codigo_persona_1x2y3,
		persona_1x2.nombre_persona AS nombre_persona_1x2y4,
		persona_1x2.numero_cedula AS numero_cedula_1x2y5,
		persona_1x2.letra_cedula AS letra_cedula_1x2y6,
		persona_1x2.fecha_expedicion_cedula AS fecha_expedicion_cedula_1x2y7,
		persona_1x2.fecha_vencimiento_cedula AS fecha_vencimiento_cedula_1x2y8,
		persona_1x2.primer_nombre AS primer_nombre_1x2y9,
		persona_1x2.segundo_nombre AS segundo_nombre_1x2y10,
		persona_1x2.primer_apellido AS primer_apellido_1x2y11,
		persona_1x2.segundo_apellido AS segundo_apellido_1x2y12,
		persona_1x2.apellido_casada AS apellido_casada_1x2y13,
		persona_1x2.apodo AS apodo_1x2y14,
		persona_1x2.fecha_nacimiento AS fecha_nacimiento_1x2y15,
		persona_1x2.numero_sexo_persona AS numero_sexo_persona_1x2y16,
		persona_1x2.numero_estado_civil AS numero_estado_civil_1x2y17,
		persona_1x2.es_paraguayo_natural AS es_paraguayo_natural_1x2y18,
		persona_1x2.es_indigena AS es_indigena_1x2y19,
		persona_1x2.id_etnia_indigena AS id_etnia_indigena_1x2y20,
		persona_1x2.nombre_comunidad_indigena AS nombre_comunidad_indige_1x2y21,
		persona_1x2.id_departamento AS id_departamento_1x2y22,
		persona_1x2.id_distrito AS id_distrito_1x2y23,
		persona_1x2.numero_tipo_area AS numero_tipo_area_1x2y24,
		persona_1x2.id_barrio AS id_barrio_1x2y25,
		persona_1x2.direccion AS direccion_1x2y26,
		persona_1x2.numero_telefono_linea_baja AS numero_telefono_linea_b_1x2y27,
		persona_1x2.numero_telefono_celular AS numero_telefono_celular_1x2y28,
		persona_1x2.certificado_vida AS certificado_vida_1x2y29,
		persona_1x2.fecha_certificado_vida AS fecha_certificado_vida_1x2y30,
		persona_1x2.dias_vigencia_certificado_vida AS dias_vigencia_certifica_1x2y31,
		persona_1x2.es_certificado_vida_anulado AS es_certificado_vida_anu_1x2y32,
		persona_1x2.certificado_defuncion AS certificado_defuncion_1x2y33,
		persona_1x2.fecha_certificado_defuncion AS fecha_certificado_defun_1x2y34,
		persona_1x2.es_cer_defuncion_anulado AS es_cer_defuncion_anulad_1x2y35,
		persona_1x2.es_persona_con_empleo AS es_persona_con_empleo_1x2y36,
		persona_1x2.es_persona_con_jubilacion AS es_persona_con_jubilaci_1x2y37,
		persona_1x2.es_persona_con_pension AS es_persona_con_pension_1x2y38,
		persona_1x2.es_persona_con_subsidio AS es_persona_con_subsidio_1x2y39,
		persona_1x2.es_persona_con_deuda AS es_persona_con_deuda_1x2y40,
		persona_1x2.es_persona_con_pena_judicial AS es_persona_con_pena_jud_1x2y41,
		persona_1x2.es_persona_con_cer_vida AS es_persona_con_cer_vida_1x2y42,
		persona_1x2.es_persona_con_carta_renuncia AS es_persona_con_carta_re_1x2y43,
		persona_1x2.es_persona_elegible_para_pen AS es_persona_elegible_par_1x2y44,
		persona_1x2.es_persona_acreditada_para_pen AS es_persona_acreditada_p_1x2y45,
		persona_1x2.es_persona_con_copia_cedula AS es_persona_con_copia_ce_1x2y46,
		persona_1x2.es_persona_con_declaracion_jur AS es_persona_con_declarac_1x2y47,
		persona_1x2.monto_pension AS monto_pension_1x2y48,
		persona_1x2.numero_condicion_pension AS numero_condicion_pensio_1x2y49,
		persona_1x2.fecha_solicitud_pension AS fecha_solicitud_pension_1x2y50,
		persona_1x2.comentarios_solicitud_pension AS comentarios_solicitud_p_1x2y51,
		persona_1x2.fecha_aprobacion_pension AS fecha_aprobacion_pensio_1x2y52,
		persona_1x2.comentarios_aprobacion_pension AS comentarios_aprobacion__1x2y53,
		persona_1x2.fecha_otorgamiento_pen AS fecha_otorgamiento_pen_1x2y54,
		persona_1x2.numero_resolucion_otor_pen AS numero_resolucion_otor__1x2y55,
		persona_1x2.fecha_resolucion_otor_pen AS fecha_resolucion_otor_p_1x2y56,
		persona_1x2.comentarios_otorgamiento_pen AS comentarios_otorgamient_1x2y57,
		persona_1x2.fecha_objecion_pension AS fecha_objecion_pension_1x2y58,
		persona_1x2.numero_causa_den_pension AS numero_causa_den_pensio_1x2y59,
		persona_1x2.otra_causa_den_pension AS otra_causa_den_pension_1x2y60,
		persona_1x2.comentarios_objecion_pension AS comentarios_objecion_pe_1x2y61,
		persona_1x2.fecha_denegacion_pension AS fecha_denegacion_pensio_1x2y62,
		persona_1x2.numero_resolucion_den_pen AS numero_resolucion_den_p_1x2y63,
		persona_1x2.fecha_resolucion_den_pen AS fecha_resolucion_den_pe_1x2y64,
		persona_1x2.comentarios_denegacion_pension AS comentarios_denegacion__1x2y65,
		persona_1x2.fecha_revocacion_pension AS fecha_revocacion_pensio_1x2y66,
		persona_1x2.numero_causa_rev_pension AS numero_causa_rev_pensio_1x2y67,
		persona_1x2.otra_causa_rev_pension AS otra_causa_rev_pension_1x2y68,
		persona_1x2.numero_resolucion_rev_pen AS numero_resolucion_rev_p_1x2y69,
		persona_1x2.fecha_resolucion_rev_pen AS fecha_resolucion_rev_pe_1x2y70,
		persona_1x2.comentarios_revocacion_pension AS comentarios_revocacion__1x2y71,
		persona_1x2.numero_condicion_reco_pen AS numero_condicion_reco_p_1x2y72,
		persona_1x2.fecha_solicitud_reco_pen AS fecha_solicitud_reco_pe_1x2y73,
		persona_1x2.comentarios_solicitud_reco_pen AS comentarios_solicitud_r_1x2y74,
		persona_1x2.fecha_aprobacion_reco_pen AS fecha_aprobacion_reco_p_1x2y75,
		persona_1x2.comentarios_apr_reco_pen AS comentarios_apr_reco_pe_1x2y76,
		persona_1x2.fecha_denegacion_reco_pen AS fecha_denegacion_reco_p_1x2y77,
		persona_1x2.numero_causa_den_reco_pen AS numero_causa_den_reco_p_1x2y78,
		persona_1x2.otra_causa_den_reco_pen AS otra_causa_den_reco_pen_1x2y79,
		persona_1x2.comentarios_den_reco_pen AS comentarios_den_reco_pe_1x2y80,
		persona_1x2.numero_condicion_denu_pen AS numero_condicion_denu_p_1x2y81,
		persona_1x2.fecha_registro_denuncia_pen AS fecha_registro_denuncia_1x2y82,
		persona_1x2.comentarios_registro_denu_pen AS comentarios_registro_de_1x2y83,
		persona_1x2.fecha_confirmacion_denu_pen AS fecha_confirmacion_denu_1x2y84,
		persona_1x2.comentarios_conf_denu_pen AS comentarios_conf_denu_p_1x2y85,
		persona_1x2.fecha_desmentido_denuncia_pen AS fecha_desmentido_denunc_1x2y86,
		persona_1x2.comentarios_des_denu_pen AS comentarios_des_denu_pe_1x2y87,
		persona_1x2.id_ficha_persona AS id_ficha_persona_1x2y88,
		persona_1x2.fecha_ficha_persona AS fecha_ficha_persona_1x2y89,
		persona_1x2.indice_calidad_vida AS indice_calidad_vida_1x2y90,
		persona_1x2.fecha_ultimo_cobro_pension AS fecha_ultimo_cobro_pens_1x2y91,
		persona_1x2.notas_anul_fec_ult_cob_pen AS notas_anul_fec_ult_cob__1x2y92,
		persona_1x2.numero_tipo_act_jupe AS numero_tipo_act_jupe_1x2y93,
		persona_1x2.fecha_hora_ult_act_jupe AS fecha_hora_ult_act_jupe_1x2y94,
		persona_1x2.lote AS lote_1x2y95,
		persona_1x2.codigo_sime AS codigo_sime_1x2y96,
		persona_1x2.codigo_sime_reco_pen AS codigo_sime_reco_pen_1x2y97,
		persona_1x2.comentarios_entrega_documentos AS comentarios_entrega_doc_1x2y98,
		persona_1x2.comentarios_insercion_jupe AS comentarios_insercion_j_1x2y99,
	log_pro_acr_pot_ben.nombre_persona AS nombre_persona,
	log_pro_acr_pot_ben.codigo_persona AS codigo_persona,
	log_pro_acr_pot_ben.id_departamento AS id_departamento,
		ubicacion_1x3.codigo_ubicacion AS codigo_ubicacion_1x3y3,
		ubicacion_1x3.nombre_ubicacion AS nombre_ubicacion_1x3y4,
		ubicacion_1x3.id_ubicacion_superior AS id_ubicacion_superior_1x3y5,
		ubicacion_1x3.numero_tipo_nodo AS numero_tipo_nodo_1x3y6,
		ubicacion_1x3.numero_nivel_ubicacion AS numero_nivel_ubicacion_1x3y7,
		ubicacion_1x3.secuencia_ubicacion AS secuencia_ubicacion_1x3y8,
		ubicacion_1x3.clave_ubicacion AS clave_ubicacion_1x3y9,
		ubicacion_1x3.numero_tipo_area AS numero_tipo_area_1x3y10,
		ubicacion_1x3.codigo_ubicacion_jupe AS codigo_ubicacion_jupe_1x3y11,
	log_pro_acr_pot_ben.id_distrito AS id_distrito,
		ubicacion_1x4.codigo_ubicacion AS codigo_ubicacion_1x4y3,
		ubicacion_1x4.nombre_ubicacion AS nombre_ubicacion_1x4y4,
		ubicacion_1x4.id_ubicacion_superior AS id_ubicacion_superior_1x4y5,
		ubicacion_1x4.numero_tipo_nodo AS numero_tipo_nodo_1x4y6,
		ubicacion_1x4.numero_nivel_ubicacion AS numero_nivel_ubicacion_1x4y7,
		ubicacion_1x4.secuencia_ubicacion AS secuencia_ubicacion_1x4y8,
		ubicacion_1x4.clave_ubicacion AS clave_ubicacion_1x4y9,
		ubicacion_1x4.numero_tipo_area AS numero_tipo_area_1x4y10,
		ubicacion_1x4.codigo_ubicacion_jupe AS codigo_ubicacion_jupe_1x4y11,
	log_pro_acr_pot_ben.id_barrio AS id_barrio,
		ubicacion_1x5.codigo_ubicacion AS codigo_ubicacion_1x5y3,
		ubicacion_1x5.nombre_ubicacion AS nombre_ubicacion_1x5y4,
		ubicacion_1x5.id_ubicacion_superior AS id_ubicacion_superior_1x5y5,
		ubicacion_1x5.numero_tipo_nodo AS numero_tipo_nodo_1x5y6,
		ubicacion_1x5.numero_nivel_ubicacion AS numero_nivel_ubicacion_1x5y7,
		ubicacion_1x5.secuencia_ubicacion AS secuencia_ubicacion_1x5y8,
		ubicacion_1x5.clave_ubicacion AS clave_ubicacion_1x5y9,
		ubicacion_1x5.numero_tipo_area AS numero_tipo_area_1x5y10,
		ubicacion_1x5.codigo_ubicacion_jupe AS codigo_ubicacion_jupe_1x5y11,
	log_pro_acr_pot_ben.id_ficha_persona AS id_ficha_persona,
		ficha_persona_1x6.codigo_ficha_persona AS codigo_ficha_persona_1x6y3,
		ficha_persona_1x6.nombre_ficha_persona AS nombre_ficha_persona_1x6y4,
		ficha_persona_1x6.es_respondente AS es_respondente_1x6y5,
		ficha_persona_1x6.id_ficha_hogar AS id_ficha_hogar_1x6y6,
		ficha_persona_1x6.numero_orden_identificacion AS numero_orden_identificac_1x6y7,
		ficha_persona_1x6.primer_nombre AS primer_nombre_1x6y8,
		ficha_persona_1x6.segundo_nombre AS segundo_nombre_1x6y9,
		ficha_persona_1x6.primer_apellido AS primer_apellido_1x6y10,
		ficha_persona_1x6.segundo_apellido AS segundo_apellido_1x6y11,
		ficha_persona_1x6.apellido_casada AS apellido_casada_1x6y12,
		ficha_persona_1x6.apodo AS apodo_1x6y13,
		ficha_persona_1x6.edad AS edad_1x6y14,
		ficha_persona_1x6.numero_sexo_persona AS numero_sexo_persona_1x6y15,
		ficha_persona_1x6.numero_estado_civil AS numero_estado_civil_1x6y16,
		ficha_persona_1x6.numero_tipo_persona_hogar AS numero_tipo_persona_hog_1x6y17,
		ficha_persona_1x6.numero_siono_miembro_hogar AS numero_siono_miembro_ho_1x6y18,
		ficha_persona_1x6.numero_orden_iden_conyuge AS numero_orden_iden_conyu_1x6y19,
		ficha_persona_1x6.numero_orden_iden_padre AS numero_orden_iden_padre_1x6y20,
		ficha_persona_1x6.numero_orden_iden_madre AS numero_orden_iden_madre_1x6y21,
		ficha_persona_1x6.numero_cedula AS numero_cedula_1x6y22,
		ficha_persona_1x6.letra_cedula AS letra_cedula_1x6y23,
		ficha_persona_1x6.numero_tipo_excepcion_ced AS numero_tipo_excepcion_c_1x6y24,
		ficha_persona_1x6.fecha_nacimiento AS fecha_nacimiento_1x6y25,
		ficha_persona_1x6.id_departamento_nacimiento AS id_departamento_nacimie_1x6y26,
		ficha_persona_1x6.id_distrito_nacimiento AS id_distrito_nacimiento_1x6y27,
		ficha_persona_1x6.numero_tipo_area_lugar_nac AS numero_tipo_area_lugar__1x6y28,
		ficha_persona_1x6.numero_idioma_hogar AS numero_idioma_hogar_1x6y29,
		ficha_persona_1x6.otro_idioma_hogar AS otro_idioma_hogar_1x6y30,
		ficha_persona_1x6.numero_siono_asistencia_esc AS numero_siono_asistencia_1x6y31,
		ficha_persona_1x6.numero_motivo_ina_esc AS numero_motivo_ina_esc_1x6y32,
		ficha_persona_1x6.otro_motivo_ina_esc AS otro_motivo_ina_esc_1x6y33,
		ficha_persona_1x6.numero_siono_matriculacion_esc AS numero_siono_matriculac_1x6y34,
		ficha_persona_1x6.ultimo_curso_aprobado AS ultimo_curso_aprobado_1x6y35,
		ficha_persona_1x6.numero_nivel_edu_ult_cur_aprob AS numero_nivel_edu_ult_cu_1x6y36,
		ficha_persona_1x6.numero_siono_curso_no_formal AS numero_siono_curso_no_f_1x6y37,
		ficha_persona_1x6.numero_tipo_seguro_medico AS numero_tipo_seguro_medi_1x6y38,
		ficha_persona_1x6.numero_estado_salud AS numero_estado_salud_1x6y39,
		ficha_persona_1x6.numero_clase_enf_acc AS numero_clase_enf_acc_1x6y40,
		ficha_persona_1x6.otra_clase_enf_acc AS otra_clase_enf_acc_1x6y41,
		ficha_persona_1x6.numero_clase_enf_cronica AS numero_clase_enf_cronic_1x6y42,
		ficha_persona_1x6.otra_clase_enf_cronica AS otra_clase_enf_cronica_1x6y43,
		ficha_persona_1x6.numero_siono_atencion_medica AS numero_siono_atencion_m_1x6y44,
		ficha_persona_1x6.numero_motivo_no_atencion AS numero_motivo_no_atenci_1x6y45,
		ficha_persona_1x6.otro_motivo_no_atencion AS otro_motivo_no_atencion_1x6y46,
		ficha_persona_1x6.numero_siono_carnet_vacunacion AS numero_siono_carnet_vac_1x6y47,
		ficha_persona_1x6.numero_clase_impedimento AS numero_clase_impediment_1x6y48,
		ficha_persona_1x6.otra_clase_impedimento AS otra_clase_impedimento_1x6y49,
		ficha_persona_1x6.numero_causa_impedimento AS numero_causa_impediment_1x6y50,
		ficha_persona_1x6.otra_causa_impedimento AS otra_causa_impedimento_1x6y51,
		ficha_persona_1x6.numero_siono_dif_para_caminar AS numero_siono_dif_para_c_1x6y52,
		ficha_persona_1x6.numero_siono_dif_para_vestirse AS numero_siono_dif_para_v_1x6y53,
		ficha_persona_1x6.numero_siono_dif_para_banarse AS numero_siono_dif_para_b_1x6y54,
		ficha_persona_1x6.numero_siono_dif_para_comer AS numero_siono_dif_para_c_1x6y55,
		ficha_persona_1x6.numero_siono_dif_para_la_cama AS numero_siono_dif_para_l_1x6y56,
		ficha_persona_1x6.numero_siono_dif_para_el_bano AS numero_siono_dif_para_e_1x6y57,
		ficha_persona_1x6.numero_siono_trabajo AS numero_siono_trabajo_1x6y58,
		ficha_persona_1x6.numero_motivo_no_trabajo AS numero_motivo_no_trabaj_1x6y59,
		ficha_persona_1x6.otro_motivo_no_trabajo AS otro_motivo_no_trabajo_1x6y60,
		ficha_persona_1x6.descripcion_ocupacion_prin AS descripcion_ocupacion_p_1x6y61,
		ficha_persona_1x6.descripcion_dedicacion_prin AS descripcion_dedicacion__1x6y62,
		ficha_persona_1x6.numero_tipo_relacion_lab AS numero_tipo_relacion_la_1x6y63,
		ficha_persona_1x6.monto_ingreso_ocupacion_prin AS monto_ingreso_ocupacion_1x6y64,
		ficha_persona_1x6.monto_ingreso_ocupacion_secun AS monto_ingreso_ocupacion_1x6y65,
		ficha_persona_1x6.monto_ingreso_otras_ocup AS monto_ingreso_otras_ocu_1x6y66,
		ficha_persona_1x6.monto_ingreso_alquileres AS monto_ingreso_alquilere_1x6y67,
		ficha_persona_1x6.monto_ingreso_intereses AS monto_ingreso_intereses_1x6y68,
		ficha_persona_1x6.monto_ingreso_ayuda_fam_pais AS monto_ingreso_ayuda_fam_1x6y69,
		ficha_persona_1x6.monto_ingreso_ayuda_fam_exter AS monto_ingreso_ayuda_fam_1x6y70,
		ficha_persona_1x6.monto_ingreso_jubilacion AS monto_ingreso_jubilacio_1x6y71,
		ficha_persona_1x6.monto_ingreso_pensiones AS monto_ingreso_pensiones_1x6y72,
		ficha_persona_1x6.monto_ingreso_tekopora AS monto_ingreso_tekopora_1x6y73,
		ficha_persona_1x6.monto_ingreso_programas AS monto_ingreso_programas_1x6y74,
		ficha_persona_1x6.monto_ingreso_adicional AS monto_ingreso_adicional_1x6y75,
		ficha_persona_1x6.total_ingreso_mensual AS total_ingreso_mensual_1x6y76,
		ficha_persona_1x6.id_potencial_ben AS id_potencial_ben_1x6y77,
		ficha_persona_1x6.es_ficha_persona_inactiva AS es_ficha_persona_inacti_1x6y78,
		ficha_persona_1x6.es_ficha_persona_importada AS es_ficha_persona_import_1x6y79,
		ficha_persona_1x6.fecha_importacion AS fecha_importacion_1x6y80,
	log_pro_acr_pot_ben.codigo_ficha_persona AS codigo_ficha_persona,
	log_pro_acr_pot_ben.nombre_ficha_persona AS nombre_ficha_persona,
	log_pro_acr_pot_ben.id_ficha_hogar AS id_ficha_hogar,
		ficha_hogar_1x7.codigo_ficha_hogar AS codigo_ficha_hogar_1x7y3,
		ficha_hogar_1x7.fecha_entrevista AS fecha_entrevista_1x7y4,
		ficha_hogar_1x7.id_funcionario_censista AS id_funcionario_censista_1x7y5,
		ficha_hogar_1x7.id_funcionario_supervisor AS id_funcionario_superviso_1x7y6,
		ficha_hogar_1x7.id_funcionario_critico_deco AS id_funcionario_critico_d_1x7y7,
		ficha_hogar_1x7.id_funcionario_digitador AS id_funcionario_digitador_1x7y8,
		ficha_hogar_1x7.observaciones AS observaciones_1x7y9,
		ficha_hogar_1x7.huso_utm AS huso_utm_1x7y10,
		ficha_hogar_1x7.franja_utm AS franja_utm_1x7y11,
		ficha_hogar_1x7.distancia_este_utm AS distancia_este_utm_1x7y12,
		ficha_hogar_1x7.distancia_norte_utm AS distancia_norte_utm_1x7y13,
		ficha_hogar_1x7.numero_formulario AS numero_formulario_1x7y14,
		ficha_hogar_1x7.numero_vivienda AS numero_vivienda_1x7y15,
		ficha_hogar_1x7.numero_hogar AS numero_hogar_1x7y16,
		ficha_hogar_1x7.id_departamento AS id_departamento_1x7y17,
		ficha_hogar_1x7.id_distrito AS id_distrito_1x7y18,
		ficha_hogar_1x7.numero_tipo_area AS numero_tipo_area_1x7y19,
		ficha_hogar_1x7.id_barrio AS id_barrio_1x7y20,
		ficha_hogar_1x7.id_manzana AS id_manzana_1x7y21,
		ficha_hogar_1x7.manzana AS manzana_1x7y22,
		ficha_hogar_1x7.direccion AS direccion_1x7y23,
		ficha_hogar_1x7.total_personas AS total_personas_1x7y24,
		ficha_hogar_1x7.total_hombres AS total_hombres_1x7y25,
		ficha_hogar_1x7.total_mujeres AS total_mujeres_1x7y26,
		ficha_hogar_1x7.numero_tipo_mat_paredes AS numero_tipo_mat_paredes_1x7y27,
		ficha_hogar_1x7.numero_tipo_mat_piso AS numero_tipo_mat_piso_1x7y28,
		ficha_hogar_1x7.numero_tipo_mat_techo AS numero_tipo_mat_techo_1x7y29,
		ficha_hogar_1x7.numero_tipo_ocupacion_viv AS numero_tipo_ocupacion_v_1x7y30,
		ficha_hogar_1x7.otro_tipo_ocupacion_viv AS otro_tipo_ocupacion_viv_1x7y31,
		ficha_hogar_1x7.cantidad_piezas AS cantidad_piezas_1x7y32,
		ficha_hogar_1x7.cantidad_dormitorios AS cantidad_dormitorios_1x7y33,
		ficha_hogar_1x7.numero_siono_pieza_cocina AS numero_siono_pieza_coci_1x7y34,
		ficha_hogar_1x7.numero_tipo_combustible AS numero_tipo_combustible_1x7y35,
		ficha_hogar_1x7.numero_tipo_pieza_bano AS numero_tipo_pieza_bano_1x7y36,
		ficha_hogar_1x7.numero_tipo_servicio_san AS numero_tipo_servicio_sa_1x7y37,
		ficha_hogar_1x7.numero_tipo_servicio_agua AS numero_tipo_servicio_ag_1x7y38,
		ficha_hogar_1x7.numero_tipo_aba_agua AS numero_tipo_aba_agua_1x7y39,
		ficha_hogar_1x7.numero_siono_corriente_elec AS numero_siono_corriente__1x7y40,
		ficha_hogar_1x7.numero_tipo_desecho_bas AS numero_tipo_desecho_bas_1x7y41,
		ficha_hogar_1x7.numero_siono_telefono_celular AS numero_siono_telefono_c_1x7y42,
		ficha_hogar_1x7.numero_telefono_celular AS numero_telefono_celular_1x7y43,
		ficha_hogar_1x7.numero_siono_tlf_linea_baja AS numero_siono_tlf_linea__1x7y44,
		ficha_hogar_1x7.numero_telefono_linea_baja AS numero_telefono_linea_b_1x7y45,
		ficha_hogar_1x7.numero_siono_disp_heladera AS numero_siono_disp_helad_1x7y46,
		ficha_hogar_1x7.numero_siono_disp_lavarropas AS numero_siono_disp_lavar_1x7y47,
		ficha_hogar_1x7.numero_siono_disp_termo AS numero_siono_disp_termo_1x7y48,
		ficha_hogar_1x7.numero_siono_disp_aire_acon AS numero_siono_disp_aire__1x7y49,
		ficha_hogar_1x7.numero_siono_disp_automovil AS numero_siono_disp_autom_1x7y50,
		ficha_hogar_1x7.numero_siono_disp_camion AS numero_siono_disp_camio_1x7y51,
		ficha_hogar_1x7.numero_siono_disp_motocicleta AS numero_siono_disp_motoc_1x7y52,
		ficha_hogar_1x7.nombre_jefe_hogar AS nombre_jefe_hogar_1x7y53,
		ficha_hogar_1x7.numero_cedula_jefe_hogar AS numero_cedula_jefe_hoga_1x7y54,
		ficha_hogar_1x7.letra_cedula_jefe_hogar AS letra_cedula_jefe_hogar_1x7y55,
		ficha_hogar_1x7.numero_orden_iden_jefe_hogar AS numero_orden_iden_jefe__1x7y56,
		ficha_hogar_1x7.nombre_respondente AS nombre_respondente_1x7y57,
		ficha_hogar_1x7.numero_cedula_respondente AS numero_cedula_responden_1x7y58,
		ficha_hogar_1x7.letra_cedula_respondente AS letra_cedula_respondent_1x7y59,
		ficha_hogar_1x7.numero_orden_iden_respondente AS numero_orden_iden_respo_1x7y60,
		ficha_hogar_1x7.id_proveedor_dat_ext AS id_proveedor_dat_ext_1x7y61,
		ficha_hogar_1x7.indice_calidad_vida AS indice_calidad_vida_1x7y62,
		ficha_hogar_1x7.es_ficha_hogar_inactiva AS es_ficha_hogar_inactiva_1x7y63,
	log_pro_acr_pot_ben.codigo_ficha_hogar AS codigo_ficha_hogar,
	log_pro_acr_pot_ben.indice_calidad_vida AS indice_calidad_vida,
	log_pro_acr_pot_ben.es_procesado AS es_procesado,
	log_pro_acr_pot_ben.observacion AS observacion,
	log_pro_acr_pot_ben.fecha_hora_transaccion AS fecha_hora_transaccion
FROM
	log_pro_acr_pot_ben log_pro_acr_pot_ben
	LEFT OUTER JOIN potencial_ben potencial_ben_1x1 ON potencial_ben_1x1.id_potencial_ben = log_pro_acr_pot_ben.id_potencial_ben
	LEFT OUTER JOIN persona persona_1x2 ON persona_1x2.id_persona = log_pro_acr_pot_ben.id_persona
	LEFT OUTER JOIN ubicacion ubicacion_1x3 ON ubicacion_1x3.id_ubicacion = log_pro_acr_pot_ben.id_departamento
	LEFT OUTER JOIN ubicacion ubicacion_1x4 ON ubicacion_1x4.id_ubicacion = log_pro_acr_pot_ben.id_distrito
	LEFT OUTER JOIN ubicacion ubicacion_1x5 ON ubicacion_1x5.id_ubicacion = log_pro_acr_pot_ben.id_barrio
	LEFT OUTER JOIN ficha_persona ficha_persona_1x6 ON ficha_persona_1x6.id_ficha_persona = log_pro_acr_pot_ben.id_ficha_persona
	LEFT OUTER JOIN ficha_hogar ficha_hogar_1x7 ON ficha_hogar_1x7.id_ficha_hogar = log_pro_acr_pot_ben.id_ficha_hogar;

