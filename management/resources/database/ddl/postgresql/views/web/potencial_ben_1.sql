/**/
DROP VIEW IF EXISTS consulta_potencial_ben_1;
/**/
CREATE OR REPLACE VIEW consulta_potencial_ben_1 AS
SELECT
	potencial_ben.id_potencial_ben AS id_potencial_ben,
	potencial_ben.version_potencial_ben AS version_potencial_ben,
	potencial_ben.codigo_potencial_ben AS codigo_potencial_ben,
	potencial_ben.nombre_potencial_ben AS nombre_potencial_ben,
	potencial_ben.numero_tipo_reg_pot_ben AS numero_tipo_reg_pot_ben,
		tipo_reg_pot_ben_1x1.codigo_tipo_reg_pot_ben AS codigo_tipo_reg_pot_ben_1x1y2,
	potencial_ben.id_persona AS id_persona,
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
		persona_1x2.id_manzana AS id_manzana_1x2y26,
		persona_1x2.manzana AS manzana_1x2y27,
		persona_1x2.direccion AS direccion_1x2y28,
		persona_1x2.numero_telefono_linea_baja AS numero_telefono_linea_b_1x2y29,
		persona_1x2.numero_telefono_celular AS numero_telefono_celular_1x2y30,
		persona_1x2.certificado_vida AS certificado_vida_1x2y31,
		persona_1x2.fecha_certificado_vida AS fecha_certificado_vida_1x2y32,
		persona_1x2.es_certificado_vida_anulado AS es_certificado_vida_anu_1x2y33,
		persona_1x2.comentarios_anul_cer_vida AS comentarios_anul_cer_vi_1x2y34,
		persona_1x2.certificado_defuncion AS certificado_defuncion_1x2y35,
		persona_1x2.fecha_certificado_defuncion AS fecha_certificado_defun_1x2y36,
		persona_1x2.es_cer_defuncion_anulado AS es_cer_defuncion_anulad_1x2y37,
		persona_1x2.comentarios_anul_cer_defuncion AS comentarios_anul_cer_de_1x2y38,
		persona_1x2.es_persona_con_empleo AS es_persona_con_empleo_1x2y39,
		persona_1x2.es_persona_con_jubilacion AS es_persona_con_jubilaci_1x2y40,
		persona_1x2.es_persona_con_pension AS es_persona_con_pension_1x2y41,
		persona_1x2.es_persona_con_subsidio AS es_persona_con_subsidio_1x2y42,
		persona_1x2.es_persona_con_deuda AS es_persona_con_deuda_1x2y43,
		persona_1x2.es_persona_con_pena_judicial AS es_persona_con_pena_jud_1x2y44,
		persona_1x2.es_persona_con_cer_vida AS es_persona_con_cer_vida_1x2y45,
		persona_1x2.es_persona_con_carta_renuncia AS es_persona_con_carta_re_1x2y46,
		persona_1x2.es_persona_elegible_para_pen AS es_persona_elegible_par_1x2y47,
		persona_1x2.es_persona_acreditada_para_pen AS es_persona_acreditada_p_1x2y48,
		persona_1x2.es_persona_con_copia_cedula AS es_persona_con_copia_ce_1x2y49,
		persona_1x2.es_persona_con_declaracion_jur AS es_persona_con_declarac_1x2y50,
		persona_1x2.monto_pension AS monto_pension_1x2y51,
		persona_1x2.numero_condicion_pension AS numero_condicion_pensio_1x2y52,
		persona_1x2.lugar_solicitud_pension AS lugar_solicitud_pension_1x2y53,
		persona_1x2.fecha_solicitud_pension AS fecha_solicitud_pension_1x2y54,
		persona_1x2.comentarios_solicitud_pension AS comentarios_solicitud_p_1x2y55,
		persona_1x2.fecha_aprobacion_pension AS fecha_aprobacion_pensio_1x2y56,
		persona_1x2.comentarios_aprobacion_pension AS comentarios_aprobacion__1x2y57,
		persona_1x2.fecha_otorgamiento_pen AS fecha_otorgamiento_pen_1x2y58,
		persona_1x2.numero_resolucion_otor_pen AS numero_resolucion_otor__1x2y59,
		persona_1x2.fecha_resolucion_otor_pen AS fecha_resolucion_otor_p_1x2y60,
		persona_1x2.comentarios_otorgamiento_pen AS comentarios_otorgamient_1x2y61,
		persona_1x2.fecha_objecion_pension AS fecha_objecion_pension_1x2y62,
		persona_1x2.numero_causa_den_pension AS numero_causa_den_pensio_1x2y63,
		persona_1x2.otra_causa_den_pension AS otra_causa_den_pension_1x2y64,
		persona_1x2.comentarios_objecion_pension AS comentarios_objecion_pe_1x2y65,
		persona_1x2.fecha_denegacion_pension AS fecha_denegacion_pensio_1x2y66,
		persona_1x2.numero_resolucion_den_pen AS numero_resolucion_den_p_1x2y67,
		persona_1x2.fecha_resolucion_den_pen AS fecha_resolucion_den_pe_1x2y68,
		persona_1x2.comentarios_denegacion_pension AS comentarios_denegacion__1x2y69,
		persona_1x2.fecha_revocacion_pension AS fecha_revocacion_pensio_1x2y70,
		persona_1x2.numero_causa_rev_pension AS numero_causa_rev_pensio_1x2y71,
		persona_1x2.otra_causa_rev_pension AS otra_causa_rev_pension_1x2y72,
		persona_1x2.comentarios_revocacion_pension AS comentarios_revocacion__1x2y73,
		persona_1x2.numero_condicion_reco_pen AS numero_condicion_reco_p_1x2y74,
		persona_1x2.fecha_solicitud_reco_pen AS fecha_solicitud_reco_pe_1x2y75,
		persona_1x2.comentarios_solicitud_reco_pen AS comentarios_solicitud_r_1x2y76,
		persona_1x2.fecha_aprobacion_reco_pen AS fecha_aprobacion_reco_p_1x2y77,
		persona_1x2.comentarios_apr_reco_pen AS comentarios_apr_reco_pe_1x2y78,
		persona_1x2.fecha_denegacion_reco_pen AS fecha_denegacion_reco_p_1x2y79,
		persona_1x2.numero_causa_den_reco_pen AS numero_causa_den_reco_p_1x2y80,
		persona_1x2.otra_causa_den_reco_pen AS otra_causa_den_reco_pen_1x2y81,
		persona_1x2.comentarios_den_reco_pen AS comentarios_den_reco_pe_1x2y82,
		persona_1x2.numero_condicion_denu_pen AS numero_condicion_denu_p_1x2y83,
		persona_1x2.fecha_registro_denuncia_pen AS fecha_registro_denuncia_1x2y84,
		persona_1x2.comentarios_registro_denu_pen AS comentarios_registro_de_1x2y85,
		persona_1x2.fecha_confirmacion_denu_pen AS fecha_confirmacion_denu_1x2y86,
		persona_1x2.comentarios_conf_denu_pen AS comentarios_conf_denu_p_1x2y87,
		persona_1x2.fecha_desmentido_denuncia_pen AS fecha_desmentido_denunc_1x2y88,
		persona_1x2.comentarios_des_denu_pen AS comentarios_des_denu_pe_1x2y89,
		persona_1x2.id_ficha_persona AS id_ficha_persona_1x2y90,
		persona_1x2.fecha_ficha_persona AS fecha_ficha_persona_1x2y91,
		persona_1x2.indice_calidad_vida AS indice_calidad_vida_1x2y92,
		persona_1x2.fecha_ultimo_cobro_pension AS fecha_ultimo_cobro_pens_1x2y93,
		persona_1x2.notas_anul_fec_ult_cob_pen AS notas_anul_fec_ult_cob__1x2y94,
		persona_1x2.numero_tipo_act_jupe AS numero_tipo_act_jupe_1x2y95,
		persona_1x2.fecha_hora_ult_act_jupe AS fecha_hora_ult_act_jupe_1x2y96,
		persona_1x2.lote AS lote_1x2y97,
		persona_1x2.codigo_sime AS codigo_sime_1x2y98,
	potencial_ben.numero_cedula AS numero_cedula,
	potencial_ben.letra_cedula AS letra_cedula,
	potencial_ben.fecha_expedicion_cedula AS fecha_expedicion_cedula,
	potencial_ben.fecha_vencimiento_cedula AS fecha_vencimiento_cedula,
	potencial_ben.primer_nombre AS primer_nombre,
	potencial_ben.segundo_nombre AS segundo_nombre,
	potencial_ben.primer_apellido AS primer_apellido,
	potencial_ben.segundo_apellido AS segundo_apellido,
	potencial_ben.apellido_casada AS apellido_casada,
	potencial_ben.apodo AS apodo,
	potencial_ben.fecha_nacimiento AS fecha_nacimiento,
	potencial_ben.edad AS edad,
	potencial_ben.es_paraguayo_natural AS es_paraguayo_natural,
	potencial_ben.es_indigena AS es_indigena,
	potencial_ben.id_etnia_indigena AS id_etnia_indigena,
		etnia_indigena_1x3.codigo_etnia_indigena AS codigo_etnia_indigena_1x3y3,
		etnia_indigena_1x3.nombre_etnia_indigena AS nombre_etnia_indigena_1x3y4,
		etnia_indigena_1x3.descripcion_etnia_indigena AS descripcion_etnia_indige_1x3y5,
	potencial_ben.nombre_comunidad_indigena AS nombre_comunidad_indigena,
	potencial_ben.id_departamento AS id_departamento,
		ubicacion_1x4.codigo_ubicacion AS codigo_ubicacion_1x4y3,
		ubicacion_1x4.nombre_ubicacion AS nombre_ubicacion_1x4y4,
		ubicacion_1x4.id_ubicacion_superior AS id_ubicacion_superior_1x4y5,
		ubicacion_1x4.numero_tipo_nodo AS numero_tipo_nodo_1x4y6,
		ubicacion_1x4.numero_nivel_ubicacion AS numero_nivel_ubicacion_1x4y7,
		ubicacion_1x4.secuencia_ubicacion AS secuencia_ubicacion_1x4y8,
		ubicacion_1x4.clave_ubicacion AS clave_ubicacion_1x4y9,
		ubicacion_1x4.numero_tipo_area AS numero_tipo_area_1x4y10,
	potencial_ben.id_distrito AS id_distrito,
		ubicacion_1x5.codigo_ubicacion AS codigo_ubicacion_1x5y3,
		ubicacion_1x5.nombre_ubicacion AS nombre_ubicacion_1x5y4,
		ubicacion_1x5.id_ubicacion_superior AS id_ubicacion_superior_1x5y5,
		ubicacion_1x5.numero_tipo_nodo AS numero_tipo_nodo_1x5y6,
		ubicacion_1x5.numero_nivel_ubicacion AS numero_nivel_ubicacion_1x5y7,
		ubicacion_1x5.secuencia_ubicacion AS secuencia_ubicacion_1x5y8,
		ubicacion_1x5.clave_ubicacion AS clave_ubicacion_1x5y9,
		ubicacion_1x5.numero_tipo_area AS numero_tipo_area_1x5y10,
	potencial_ben.numero_tipo_area AS numero_tipo_area,
		tipo_area_1x6.codigo_tipo_area AS codigo_tipo_area_1x6y2,
		tipo_area_1x6.limite_indice_calidad_vida AS limite_indice_calidad_vi_1x6y3,
	potencial_ben.id_barrio AS id_barrio,
		ubicacion_1x7.codigo_ubicacion AS codigo_ubicacion_1x7y3,
		ubicacion_1x7.nombre_ubicacion AS nombre_ubicacion_1x7y4,
		ubicacion_1x7.id_ubicacion_superior AS id_ubicacion_superior_1x7y5,
		ubicacion_1x7.numero_tipo_nodo AS numero_tipo_nodo_1x7y6,
		ubicacion_1x7.numero_nivel_ubicacion AS numero_nivel_ubicacion_1x7y7,
		ubicacion_1x7.secuencia_ubicacion AS secuencia_ubicacion_1x7y8,
		ubicacion_1x7.clave_ubicacion AS clave_ubicacion_1x7y9,
		ubicacion_1x7.numero_tipo_area AS numero_tipo_area_1x7y10,
	potencial_ben.id_manzana AS id_manzana,
		ubicacion_1x8.codigo_ubicacion AS codigo_ubicacion_1x8y3,
		ubicacion_1x8.nombre_ubicacion AS nombre_ubicacion_1x8y4,
		ubicacion_1x8.id_ubicacion_superior AS id_ubicacion_superior_1x8y5,
		ubicacion_1x8.numero_tipo_nodo AS numero_tipo_nodo_1x8y6,
		ubicacion_1x8.numero_nivel_ubicacion AS numero_nivel_ubicacion_1x8y7,
		ubicacion_1x8.secuencia_ubicacion AS secuencia_ubicacion_1x8y8,
		ubicacion_1x8.clave_ubicacion AS clave_ubicacion_1x8y9,
		ubicacion_1x8.numero_tipo_area AS numero_tipo_area_1x8y10,
	potencial_ben.manzana AS manzana,
	potencial_ben.compania AS compania,
	potencial_ben.direccion AS direccion,
	potencial_ben.nombre_responsable_hogar AS nombre_responsable_hogar,
	potencial_ben.numero_telefono_resp_hogar AS numero_telefono_resp_hogar,
	potencial_ben.es_persona_con_empleo AS es_persona_con_empleo,
	potencial_ben.es_persona_con_jubilacion AS es_persona_con_jubilacion,
	potencial_ben.es_persona_con_pension AS es_persona_con_pension,
	potencial_ben.es_persona_con_subsidio AS es_persona_con_subsidio,
	potencial_ben.es_persona_con_deuda AS es_persona_con_deuda,
	potencial_ben.es_persona_con_pena_judicial AS es_persona_con_pena_judicial,
	potencial_ben.es_persona_con_cer_vida AS es_persona_con_cer_vida,
	potencial_ben.es_persona_con_carta_renuncia AS es_persona_con_carta_renuncia,
	potencial_ben.nombre_referente AS nombre_referente,
	potencial_ben.numero_telefono_referente AS numero_telefono_referente,
	potencial_ben.numero_condicion_censo AS numero_condicion_censo,
		condicion_censo_1x9.codigo_condicion_censo AS codigo_condicion_censo_1x9y2,
	potencial_ben.fecha_validacion_censo AS fecha_validacion_censo,
	potencial_ben.id_funcionario_validacion_cen AS id_funcionario_validacion_cen,
		funcionario_1x10.codigo_funcionario AS codigo_funcionario_1x10y3,
		funcionario_1x10.nombre_funcionario AS nombre_funcionario_1x10y4,
		funcionario_1x10.numero_cedula AS numero_cedula_1x10y5,
		funcionario_1x10.letra_cedula AS letra_cedula_1x10y6,
		funcionario_1x10.primer_nombre AS primer_nombre_1x10y7,
		funcionario_1x10.segundo_nombre AS segundo_nombre_1x10y8,
		funcionario_1x10.primer_apellido AS primer_apellido_1x10y9,
		funcionario_1x10.segundo_apellido AS segundo_apellido_1x10y10,
		funcionario_1x10.apellido_casada AS apellido_casada_1x10y11,
	potencial_ben.numero_causa_inv_censo AS numero_causa_inv_censo,
		causa_inv_censo_1x11.codigo_causa_inv_censo AS codigo_causa_inv_censo_1x11y2,
	potencial_ben.otra_causa_inv_censo AS otra_causa_inv_censo,
	potencial_ben.comentarios_validacion_censo AS comentarios_validacion_censo,
	potencial_ben.id_ficha_persona AS id_ficha_persona,
		ficha_persona_1x12.codigo_ficha_persona AS codigo_ficha_persona_1x12y3,
		ficha_persona_1x12.nombre_ficha_persona AS nombre_ficha_persona_1x12y4,
		ficha_persona_1x12.es_respondente AS es_respondente_1x12y5,
		ficha_persona_1x12.id_ficha_hogar AS id_ficha_hogar_1x12y6,
		ficha_persona_1x12.numero_orden_identificacion AS numero_orden_identifica_1x12y7,
		ficha_persona_1x12.primer_nombre AS primer_nombre_1x12y8,
		ficha_persona_1x12.segundo_nombre AS segundo_nombre_1x12y9,
		ficha_persona_1x12.primer_apellido AS primer_apellido_1x12y10,
		ficha_persona_1x12.segundo_apellido AS segundo_apellido_1x12y11,
		ficha_persona_1x12.apellido_casada AS apellido_casada_1x12y12,
		ficha_persona_1x12.apodo AS apodo_1x12y13,
		ficha_persona_1x12.edad AS edad_1x12y14,
		ficha_persona_1x12.numero_sexo_persona AS numero_sexo_persona_1x12y15,
		ficha_persona_1x12.numero_estado_civil AS numero_estado_civil_1x12y16,
		ficha_persona_1x12.numero_tipo_persona_hogar AS numero_tipo_persona_ho_1x12y17,
		ficha_persona_1x12.numero_siono_miembro_hogar AS numero_siono_miembro_h_1x12y18,
		ficha_persona_1x12.numero_orden_iden_conyuge AS numero_orden_iden_cony_1x12y19,
		ficha_persona_1x12.numero_orden_iden_padre AS numero_orden_iden_padr_1x12y20,
		ficha_persona_1x12.numero_orden_iden_madre AS numero_orden_iden_madr_1x12y21,
		ficha_persona_1x12.numero_cedula AS numero_cedula_1x12y22,
		ficha_persona_1x12.letra_cedula AS letra_cedula_1x12y23,
		ficha_persona_1x12.numero_tipo_excepcion_ced AS numero_tipo_excepcion__1x12y24,
		ficha_persona_1x12.fecha_nacimiento AS fecha_nacimiento_1x12y25,
		ficha_persona_1x12.id_departamento_nacimiento AS id_departamento_nacimi_1x12y26,
		ficha_persona_1x12.id_distrito_nacimiento AS id_distrito_nacimiento_1x12y27,
		ficha_persona_1x12.numero_tipo_area_lugar_nac AS numero_tipo_area_lugar_1x12y28,
		ficha_persona_1x12.numero_idioma_hogar AS numero_idioma_hogar_1x12y29,
		ficha_persona_1x12.otro_idioma_hogar AS otro_idioma_hogar_1x12y30,
		ficha_persona_1x12.numero_siono_asistencia_esc AS numero_siono_asistenci_1x12y31,
		ficha_persona_1x12.numero_motivo_ina_esc AS numero_motivo_ina_esc_1x12y32,
		ficha_persona_1x12.otro_motivo_ina_esc AS otro_motivo_ina_esc_1x12y33,
		ficha_persona_1x12.numero_siono_matriculacion_esc AS numero_siono_matricula_1x12y34,
		ficha_persona_1x12.ultimo_curso_aprobado AS ultimo_curso_aprobado_1x12y35,
		ficha_persona_1x12.numero_nivel_edu_ult_cur_aprob AS numero_nivel_edu_ult_c_1x12y36,
		ficha_persona_1x12.numero_siono_curso_no_formal AS numero_siono_curso_no__1x12y37,
		ficha_persona_1x12.numero_tipo_seguro_medico AS numero_tipo_seguro_med_1x12y38,
		ficha_persona_1x12.numero_estado_salud AS numero_estado_salud_1x12y39,
		ficha_persona_1x12.numero_clase_enf_acc AS numero_clase_enf_acc_1x12y40,
		ficha_persona_1x12.otra_clase_enf_acc AS otra_clase_enf_acc_1x12y41,
		ficha_persona_1x12.numero_clase_enf_cronica AS numero_clase_enf_croni_1x12y42,
		ficha_persona_1x12.otra_clase_enf_cronica AS otra_clase_enf_cronica_1x12y43,
		ficha_persona_1x12.numero_siono_atencion_medica AS numero_siono_atencion__1x12y44,
		ficha_persona_1x12.numero_motivo_no_atencion AS numero_motivo_no_atenc_1x12y45,
		ficha_persona_1x12.otro_motivo_no_atencion AS otro_motivo_no_atencio_1x12y46,
		ficha_persona_1x12.numero_siono_carnet_vacunacion AS numero_siono_carnet_va_1x12y47,
		ficha_persona_1x12.numero_clase_impedimento AS numero_clase_impedimen_1x12y48,
		ficha_persona_1x12.otra_clase_impedimento AS otra_clase_impedimento_1x12y49,
		ficha_persona_1x12.numero_causa_impedimento AS numero_causa_impedimen_1x12y50,
		ficha_persona_1x12.otra_causa_impedimento AS otra_causa_impedimento_1x12y51,
		ficha_persona_1x12.numero_siono_dif_para_caminar AS numero_siono_dif_para__1x12y52,
		ficha_persona_1x12.numero_siono_dif_para_vestirse AS numero_siono_dif_para__1x12y53,
		ficha_persona_1x12.numero_siono_dif_para_banarse AS numero_siono_dif_para__1x12y54,
		ficha_persona_1x12.numero_siono_dif_para_comer AS numero_siono_dif_para__1x12y55,
		ficha_persona_1x12.numero_siono_dif_para_la_cama AS numero_siono_dif_para__1x12y56,
		ficha_persona_1x12.numero_siono_dif_para_el_bano AS numero_siono_dif_para__1x12y57,
		ficha_persona_1x12.numero_siono_trabajo AS numero_siono_trabajo_1x12y58,
		ficha_persona_1x12.numero_motivo_no_trabajo AS numero_motivo_no_traba_1x12y59,
		ficha_persona_1x12.otro_motivo_no_trabajo AS otro_motivo_no_trabajo_1x12y60,
		ficha_persona_1x12.descripcion_ocupacion_prin AS descripcion_ocupacion__1x12y61,
		ficha_persona_1x12.descripcion_dedicacion_prin AS descripcion_dedicacion_1x12y62,
		ficha_persona_1x12.numero_tipo_relacion_lab AS numero_tipo_relacion_l_1x12y63,
		ficha_persona_1x12.monto_ingreso_ocupacion_prin AS monto_ingreso_ocupacio_1x12y64,
		ficha_persona_1x12.monto_ingreso_ocupacion_secun AS monto_ingreso_ocupacio_1x12y65,
		ficha_persona_1x12.monto_ingreso_otras_ocup AS monto_ingreso_otras_oc_1x12y66,
		ficha_persona_1x12.monto_ingreso_alquileres AS monto_ingreso_alquiler_1x12y67,
		ficha_persona_1x12.monto_ingreso_intereses AS monto_ingreso_interese_1x12y68,
		ficha_persona_1x12.monto_ingreso_ayuda_fam_pais AS monto_ingreso_ayuda_fa_1x12y69,
		ficha_persona_1x12.monto_ingreso_ayuda_fam_exter AS monto_ingreso_ayuda_fa_1x12y70,
		ficha_persona_1x12.monto_ingreso_jubilacion AS monto_ingreso_jubilaci_1x12y71,
		ficha_persona_1x12.monto_ingreso_pensiones AS monto_ingreso_pensione_1x12y72,
		ficha_persona_1x12.monto_ingreso_tekopora AS monto_ingreso_tekopora_1x12y73,
		ficha_persona_1x12.monto_ingreso_programas AS monto_ingreso_programa_1x12y74,
		ficha_persona_1x12.monto_ingreso_adicional AS monto_ingreso_adiciona_1x12y75,
		ficha_persona_1x12.total_ingreso_mensual AS total_ingreso_mensual_1x12y76,
		ficha_persona_1x12.id_potencial_ben AS id_potencial_ben_1x12y77,
		ficha_persona_1x12.es_ficha_persona_inactiva AS es_ficha_persona_inact_1x12y78,
	potencial_ben.numero_condicion_recl_cen AS numero_condicion_recl_cen,
		condicion_recl_cen_1x13.codigo_condicion_recl_cen AS codigo_condicion_recl_c_1x13y2,
	potencial_ben.fecha_reclamo_censo AS fecha_reclamo_censo,
	potencial_ben.comentarios_reclamo_censo AS comentarios_reclamo_censo,
	potencial_ben.fecha_aprobacion_reclamo_censo AS fecha_aprobacion_reclamo_censo,
	potencial_ben.comentarios_apr_recl_cen AS comentarios_apr_recl_cen,
	potencial_ben.fecha_denegacion_reclamo_censo AS fecha_denegacion_reclamo_censo,
	potencial_ben.numero_causa_den_recl_cen AS numero_causa_den_recl_cen,
		causa_den_recl_cen_1x14.codigo_causa_den_recl_cen AS codigo_causa_den_recl_c_1x14y2,
	potencial_ben.otra_causa_den_recl_cen AS otra_causa_den_recl_cen,
	potencial_ben.comentarios_den_recl_cen AS comentarios_den_recl_cen,
	potencial_ben.fecha_registro_pot_ben AS fecha_registro_pot_ben,
	potencial_ben.id_usuario_reg_pot_ben AS id_usuario_reg_pot_ben,
		usuario_1x15.codigo_usuario AS codigo_usuario_1x15y3,
		usuario_1x15.nombre_usuario AS nombre_usuario_1x15y4,
		usuario_1x15.password_usuario AS password_usuario_1x15y5,
		usuario_1x15.correo_electronico AS correo_electronico_1x15y6,
		usuario_1x15.id_usuario_supervisor AS id_usuario_supervisor_1x15y7,
		usuario_1x15.es_super_usuario AS es_super_usuario_1x15y8,
		usuario_1x15.es_usuario_especial AS es_usuario_especial_1x15y9,
		usuario_1x15.es_usuario_inactivo AS es_usuario_inactivo_1x15y10,
		usuario_1x15.es_usuario_modificado AS es_usuario_modificado_1x15y11,
	potencial_ben.es_potencial_ben_inactivo AS es_potencial_ben_inactivo,
	potencial_ben.fecha_ultima_visita_censo AS fecha_ultima_visita_censo,
	potencial_ben.observaciones_ult_visita_cen AS observaciones_ult_visita_cen,
	potencial_ben.id_funcionario_ult_visita_cen AS id_funcionario_ult_visita_cen,
		funcionario_1x16.codigo_funcionario AS codigo_funcionario_1x16y3,
		funcionario_1x16.nombre_funcionario AS nombre_funcionario_1x16y4,
		funcionario_1x16.numero_cedula AS numero_cedula_1x16y5,
		funcionario_1x16.letra_cedula AS letra_cedula_1x16y6,
		funcionario_1x16.primer_nombre AS primer_nombre_1x16y7,
		funcionario_1x16.segundo_nombre AS segundo_nombre_1x16y8,
		funcionario_1x16.primer_apellido AS primer_apellido_1x16y9,
		funcionario_1x16.segundo_apellido AS segundo_apellido_1x16y10,
		funcionario_1x16.apellido_casada AS apellido_casada_1x16y11,
	potencial_ben.referencia_direccion AS referencia_direccion,
	potencial_ben.indice_calidad_vida AS indice_calidad_vida,
	potencial_ben.es_potencial_ben_migrado AS es_potencial_ben_migrado,
	potencial_ben.lote AS lote
FROM
	potencial_ben potencial_ben
	INNER JOIN tipo_reg_pot_ben tipo_reg_pot_ben_1x1 ON tipo_reg_pot_ben_1x1.numero_tipo_reg_pot_ben = potencial_ben.numero_tipo_reg_pot_ben
	LEFT OUTER JOIN persona persona_1x2 ON persona_1x2.id_persona = potencial_ben.id_persona
	LEFT OUTER JOIN etnia_indigena etnia_indigena_1x3 ON etnia_indigena_1x3.id_etnia_indigena = potencial_ben.id_etnia_indigena
	LEFT OUTER JOIN ubicacion ubicacion_1x4 ON ubicacion_1x4.id_ubicacion = potencial_ben.id_departamento
	LEFT OUTER JOIN ubicacion ubicacion_1x5 ON ubicacion_1x5.id_ubicacion = potencial_ben.id_distrito
	LEFT OUTER JOIN tipo_area tipo_area_1x6 ON tipo_area_1x6.numero_tipo_area = potencial_ben.numero_tipo_area
	LEFT OUTER JOIN ubicacion ubicacion_1x7 ON ubicacion_1x7.id_ubicacion = potencial_ben.id_barrio
	LEFT OUTER JOIN ubicacion ubicacion_1x8 ON ubicacion_1x8.id_ubicacion = potencial_ben.id_manzana
	LEFT OUTER JOIN condicion_censo condicion_censo_1x9 ON condicion_censo_1x9.numero_condicion_censo = potencial_ben.numero_condicion_censo
	LEFT OUTER JOIN funcionario funcionario_1x10 ON funcionario_1x10.id_funcionario = potencial_ben.id_funcionario_validacion_cen
	LEFT OUTER JOIN causa_inv_censo causa_inv_censo_1x11 ON causa_inv_censo_1x11.numero_causa_inv_censo = potencial_ben.numero_causa_inv_censo
	LEFT OUTER JOIN ficha_persona ficha_persona_1x12 ON ficha_persona_1x12.id_ficha_persona = potencial_ben.id_ficha_persona
	LEFT OUTER JOIN condicion_recl_cen condicion_recl_cen_1x13 ON condicion_recl_cen_1x13.numero_condicion_recl_cen = potencial_ben.numero_condicion_recl_cen
	LEFT OUTER JOIN causa_den_recl_cen causa_den_recl_cen_1x14 ON causa_den_recl_cen_1x14.numero_causa_den_recl_cen = potencial_ben.numero_causa_den_recl_cen
	LEFT OUTER JOIN usuario usuario_1x15 ON usuario_1x15.id_usuario = potencial_ben.id_usuario_reg_pot_ben
	LEFT OUTER JOIN funcionario funcionario_1x16 ON funcionario_1x16.id_funcionario = potencial_ben.id_funcionario_ult_visita_cen;

