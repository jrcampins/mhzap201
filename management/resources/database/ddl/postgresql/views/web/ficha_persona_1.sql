/**/
DROP VIEW IF EXISTS consulta_ficha_persona_1;
/**/
CREATE OR REPLACE VIEW consulta_ficha_persona_1 AS
SELECT
	ficha_persona.id_ficha_persona AS id_ficha_persona,
	ficha_persona.version_ficha_persona AS version_ficha_persona,
	ficha_persona.codigo_ficha_persona AS codigo_ficha_persona,
	ficha_persona.nombre_ficha_persona AS nombre_ficha_persona,
	ficha_persona.es_respondente AS es_respondente,
	ficha_persona.id_ficha_hogar AS id_ficha_hogar,
		ficha_hogar_1x1.codigo_ficha_hogar AS codigo_ficha_hogar_1x1y3,
		ficha_hogar_1x1.fecha_entrevista AS fecha_entrevista_1x1y4,
		ficha_hogar_1x1.id_funcionario_censista AS id_funcionario_censista_1x1y5,
		ficha_hogar_1x1.id_funcionario_supervisor AS id_funcionario_superviso_1x1y6,
		ficha_hogar_1x1.id_funcionario_critico_deco AS id_funcionario_critico_d_1x1y7,
		ficha_hogar_1x1.id_funcionario_digitador AS id_funcionario_digitador_1x1y8,
		ficha_hogar_1x1.observaciones AS observaciones_1x1y9,
		ficha_hogar_1x1.huso_utm AS huso_utm_1x1y10,
		ficha_hogar_1x1.franja_utm AS franja_utm_1x1y11,
		ficha_hogar_1x1.distancia_este_utm AS distancia_este_utm_1x1y12,
		ficha_hogar_1x1.distancia_norte_utm AS distancia_norte_utm_1x1y13,
		ficha_hogar_1x1.numero_formulario AS numero_formulario_1x1y14,
		ficha_hogar_1x1.numero_vivienda AS numero_vivienda_1x1y15,
		ficha_hogar_1x1.numero_hogar AS numero_hogar_1x1y16,
		ficha_hogar_1x1.id_departamento AS id_departamento_1x1y17,
		ficha_hogar_1x1.id_distrito AS id_distrito_1x1y18,
		ficha_hogar_1x1.numero_tipo_area AS numero_tipo_area_1x1y19,
		ficha_hogar_1x1.id_barrio AS id_barrio_1x1y20,
		ficha_hogar_1x1.id_manzana AS id_manzana_1x1y21,
		ficha_hogar_1x1.manzana AS manzana_1x1y22,
		ficha_hogar_1x1.direccion AS direccion_1x1y23,
		ficha_hogar_1x1.total_personas AS total_personas_1x1y24,
		ficha_hogar_1x1.total_hombres AS total_hombres_1x1y25,
		ficha_hogar_1x1.total_mujeres AS total_mujeres_1x1y26,
		ficha_hogar_1x1.numero_tipo_mat_paredes AS numero_tipo_mat_paredes_1x1y27,
		ficha_hogar_1x1.numero_tipo_mat_piso AS numero_tipo_mat_piso_1x1y28,
		ficha_hogar_1x1.numero_tipo_mat_techo AS numero_tipo_mat_techo_1x1y29,
		ficha_hogar_1x1.numero_tipo_ocupacion_viv AS numero_tipo_ocupacion_v_1x1y30,
		ficha_hogar_1x1.otro_tipo_ocupacion_viv AS otro_tipo_ocupacion_viv_1x1y31,
		ficha_hogar_1x1.cantidad_piezas AS cantidad_piezas_1x1y32,
		ficha_hogar_1x1.cantidad_dormitorios AS cantidad_dormitorios_1x1y33,
		ficha_hogar_1x1.numero_siono_pieza_cocina AS numero_siono_pieza_coci_1x1y34,
		ficha_hogar_1x1.numero_tipo_combustible AS numero_tipo_combustible_1x1y35,
		ficha_hogar_1x1.numero_tipo_pieza_bano AS numero_tipo_pieza_bano_1x1y36,
		ficha_hogar_1x1.numero_tipo_servicio_san AS numero_tipo_servicio_sa_1x1y37,
		ficha_hogar_1x1.numero_tipo_servicio_agua AS numero_tipo_servicio_ag_1x1y38,
		ficha_hogar_1x1.numero_tipo_aba_agua AS numero_tipo_aba_agua_1x1y39,
		ficha_hogar_1x1.numero_siono_corriente_elec AS numero_siono_corriente__1x1y40,
		ficha_hogar_1x1.numero_tipo_desecho_bas AS numero_tipo_desecho_bas_1x1y41,
		ficha_hogar_1x1.numero_siono_telefono_celular AS numero_siono_telefono_c_1x1y42,
		ficha_hogar_1x1.numero_telefono_celular AS numero_telefono_celular_1x1y43,
		ficha_hogar_1x1.numero_siono_tlf_linea_baja AS numero_siono_tlf_linea__1x1y44,
		ficha_hogar_1x1.numero_telefono_linea_baja AS numero_telefono_linea_b_1x1y45,
		ficha_hogar_1x1.numero_siono_disp_heladera AS numero_siono_disp_helad_1x1y46,
		ficha_hogar_1x1.numero_siono_disp_lavarropas AS numero_siono_disp_lavar_1x1y47,
		ficha_hogar_1x1.numero_siono_disp_termo AS numero_siono_disp_termo_1x1y48,
		ficha_hogar_1x1.numero_siono_disp_aire_acon AS numero_siono_disp_aire__1x1y49,
		ficha_hogar_1x1.numero_siono_disp_automovil AS numero_siono_disp_autom_1x1y50,
		ficha_hogar_1x1.numero_siono_disp_camion AS numero_siono_disp_camio_1x1y51,
		ficha_hogar_1x1.numero_siono_disp_motocicleta AS numero_siono_disp_motoc_1x1y52,
		ficha_hogar_1x1.nombre_jefe_hogar AS nombre_jefe_hogar_1x1y53,
		ficha_hogar_1x1.numero_cedula_jefe_hogar AS numero_cedula_jefe_hoga_1x1y54,
		ficha_hogar_1x1.letra_cedula_jefe_hogar AS letra_cedula_jefe_hogar_1x1y55,
		ficha_hogar_1x1.numero_orden_iden_jefe_hogar AS numero_orden_iden_jefe__1x1y56,
		ficha_hogar_1x1.nombre_respondente AS nombre_respondente_1x1y57,
		ficha_hogar_1x1.numero_cedula_respondente AS numero_cedula_responden_1x1y58,
		ficha_hogar_1x1.letra_cedula_respondente AS letra_cedula_respondent_1x1y59,
		ficha_hogar_1x1.numero_orden_iden_respondente AS numero_orden_iden_respo_1x1y60,
		ficha_hogar_1x1.id_proveedor_dat_ext AS id_proveedor_dat_ext_1x1y61,
		ficha_hogar_1x1.indice_calidad_vida AS indice_calidad_vida_1x1y62,
		ficha_hogar_1x1.es_ficha_hogar_inactiva AS es_ficha_hogar_inactiva_1x1y63,
	ficha_persona.numero_orden_identificacion AS numero_orden_identificacion,
	ficha_persona.primer_nombre AS primer_nombre,
	ficha_persona.segundo_nombre AS segundo_nombre,
	ficha_persona.primer_apellido AS primer_apellido,
	ficha_persona.segundo_apellido AS segundo_apellido,
	ficha_persona.apellido_casada AS apellido_casada,
	ficha_persona.apodo AS apodo,
	ficha_persona.edad AS edad,
	ficha_persona.numero_sexo_persona AS numero_sexo_persona,
		sexo_persona_1x2.codigo_sexo_persona AS codigo_sexo_persona_1x2y2,
	ficha_persona.numero_estado_civil AS numero_estado_civil,
		estado_civil_1x3.codigo_estado_civil AS codigo_estado_civil_1x3y2,
	ficha_persona.numero_tipo_persona_hogar AS numero_tipo_persona_hogar,
		tipo_persona_hogar_1x4.codigo_tipo_persona_hogar AS codigo_tipo_persona_hoga_1x4y2,
	ficha_persona.numero_siono_miembro_hogar AS numero_siono_miembro_hogar,
		siono_1x5.codigo_siono AS codigo_siono_1x5y2,
	ficha_persona.numero_orden_iden_conyuge AS numero_orden_iden_conyuge,
	ficha_persona.numero_orden_iden_padre AS numero_orden_iden_padre,
	ficha_persona.numero_orden_iden_madre AS numero_orden_iden_madre,
	ficha_persona.numero_cedula AS numero_cedula,
	ficha_persona.letra_cedula AS letra_cedula,
	ficha_persona.numero_tipo_excepcion_ced AS numero_tipo_excepcion_ced,
		tipo_excepcion_ced_1x6.codigo_tipo_excepcion_ced AS codigo_tipo_excepcion_ce_1x6y2,
	ficha_persona.fecha_nacimiento AS fecha_nacimiento,
	ficha_persona.id_departamento_nacimiento AS id_departamento_nacimiento,
		ubicacion_1x7.codigo_ubicacion AS codigo_ubicacion_1x7y3,
		ubicacion_1x7.nombre_ubicacion AS nombre_ubicacion_1x7y4,
		ubicacion_1x7.id_ubicacion_superior AS id_ubicacion_superior_1x7y5,
		ubicacion_1x7.numero_tipo_nodo AS numero_tipo_nodo_1x7y6,
		ubicacion_1x7.numero_nivel_ubicacion AS numero_nivel_ubicacion_1x7y7,
		ubicacion_1x7.secuencia_ubicacion AS secuencia_ubicacion_1x7y8,
		ubicacion_1x7.clave_ubicacion AS clave_ubicacion_1x7y9,
		ubicacion_1x7.numero_tipo_area AS numero_tipo_area_1x7y10,
		ubicacion_1x7.codigo_ubicacion_jupe AS codigo_ubicacion_jupe_1x7y11,
	ficha_persona.id_distrito_nacimiento AS id_distrito_nacimiento,
		ubicacion_1x8.codigo_ubicacion AS codigo_ubicacion_1x8y3,
		ubicacion_1x8.nombre_ubicacion AS nombre_ubicacion_1x8y4,
		ubicacion_1x8.id_ubicacion_superior AS id_ubicacion_superior_1x8y5,
		ubicacion_1x8.numero_tipo_nodo AS numero_tipo_nodo_1x8y6,
		ubicacion_1x8.numero_nivel_ubicacion AS numero_nivel_ubicacion_1x8y7,
		ubicacion_1x8.secuencia_ubicacion AS secuencia_ubicacion_1x8y8,
		ubicacion_1x8.clave_ubicacion AS clave_ubicacion_1x8y9,
		ubicacion_1x8.numero_tipo_area AS numero_tipo_area_1x8y10,
		ubicacion_1x8.codigo_ubicacion_jupe AS codigo_ubicacion_jupe_1x8y11,
	ficha_persona.numero_tipo_area_lugar_nac AS numero_tipo_area_lugar_nac,
		tipo_area_1x9.codigo_tipo_area AS codigo_tipo_area_1x9y2,
		tipo_area_1x9.limite_indice_calidad_vida AS limite_indice_calidad_vi_1x9y3,
	ficha_persona.numero_idioma_hogar AS numero_idioma_hogar,
		idioma_hogar_1x10.codigo_idioma_hogar AS codigo_idioma_hogar_1x10y2,
	ficha_persona.otro_idioma_hogar AS otro_idioma_hogar,
	ficha_persona.numero_siono_asistencia_esc AS numero_siono_asistencia_esc,
		siono_1x11.codigo_siono AS codigo_siono_1x11y2,
	ficha_persona.numero_motivo_ina_esc AS numero_motivo_ina_esc,
		motivo_ina_esc_1x12.codigo_motivo_ina_esc AS codigo_motivo_ina_esc_1x12y2,
	ficha_persona.otro_motivo_ina_esc AS otro_motivo_ina_esc,
	ficha_persona.numero_siono_matriculacion_esc AS numero_siono_matriculacion_esc,
		siono_1x13.codigo_siono AS codigo_siono_1x13y2,
	ficha_persona.ultimo_curso_aprobado AS ultimo_curso_aprobado,
	ficha_persona.numero_nivel_edu_ult_cur_aprob AS numero_nivel_edu_ult_cur_aprob,
		nivel_educativo_1x14.codigo_nivel_educativo AS codigo_nivel_educativo_1x14y2,
		nivel_educativo_1x14.primer_curso AS primer_curso_1x14y3,
		nivel_educativo_1x14.ultimo_curso AS ultimo_curso_1x14y4,
	ficha_persona.numero_siono_curso_no_formal AS numero_siono_curso_no_formal,
		siono_1x15.codigo_siono AS codigo_siono_1x15y2,
	ficha_persona.numero_tipo_seguro_medico AS numero_tipo_seguro_medico,
		tipo_seguro_medico_1x16.codigo_tipo_seguro_medico AS codigo_tipo_seguro_medi_1x16y2,
	ficha_persona.numero_estado_salud AS numero_estado_salud,
		estado_salud_1x17.codigo_estado_salud AS codigo_estado_salud_1x17y2,
	ficha_persona.numero_clase_enf_acc AS numero_clase_enf_acc,
		clase_enf_acc_1x18.codigo_clase_enf_acc AS codigo_clase_enf_acc_1x18y2,
	ficha_persona.otra_clase_enf_acc AS otra_clase_enf_acc,
	ficha_persona.numero_clase_enf_cronica AS numero_clase_enf_cronica,
		clase_enf_cronica_1x19.codigo_clase_enf_cronica AS codigo_clase_enf_cronic_1x19y2,
	ficha_persona.otra_clase_enf_cronica AS otra_clase_enf_cronica,
	ficha_persona.numero_siono_atencion_medica AS numero_siono_atencion_medica,
		siono_1x20.codigo_siono AS codigo_siono_1x20y2,
	ficha_persona.numero_motivo_no_atencion AS numero_motivo_no_atencion,
		motivo_no_atencion_1x21.codigo_motivo_no_atencion AS codigo_motivo_no_atenci_1x21y2,
	ficha_persona.otro_motivo_no_atencion AS otro_motivo_no_atencion,
	ficha_persona.numero_siono_carnet_vacunacion AS numero_siono_carnet_vacunacion,
		siono_1x22.codigo_siono AS codigo_siono_1x22y2,
	ficha_persona.numero_clase_impedimento AS numero_clase_impedimento,
		clase_impedimento_1x23.codigo_clase_impedimento AS codigo_clase_impediment_1x23y2,
	ficha_persona.otra_clase_impedimento AS otra_clase_impedimento,
	ficha_persona.numero_causa_impedimento AS numero_causa_impedimento,
		causa_impedimento_1x24.codigo_causa_impedimento AS codigo_causa_impediment_1x24y2,
	ficha_persona.otra_causa_impedimento AS otra_causa_impedimento,
	ficha_persona.numero_siono_dif_para_caminar AS numero_siono_dif_para_caminar,
		siono_1x25.codigo_siono AS codigo_siono_1x25y2,
	ficha_persona.numero_siono_dif_para_vestirse AS numero_siono_dif_para_vestirse,
		siono_1x26.codigo_siono AS codigo_siono_1x26y2,
	ficha_persona.numero_siono_dif_para_banarse AS numero_siono_dif_para_banarse,
		siono_1x27.codigo_siono AS codigo_siono_1x27y2,
	ficha_persona.numero_siono_dif_para_comer AS numero_siono_dif_para_comer,
		siono_1x28.codigo_siono AS codigo_siono_1x28y2,
	ficha_persona.numero_siono_dif_para_la_cama AS numero_siono_dif_para_la_cama,
		siono_1x29.codigo_siono AS codigo_siono_1x29y2,
	ficha_persona.numero_siono_dif_para_el_bano AS numero_siono_dif_para_el_bano,
		siono_1x30.codigo_siono AS codigo_siono_1x30y2,
	ficha_persona.numero_siono_trabajo AS numero_siono_trabajo,
		siono_1x31.codigo_siono AS codigo_siono_1x31y2,
	ficha_persona.numero_motivo_no_trabajo AS numero_motivo_no_trabajo,
		motivo_no_trabajo_1x32.codigo_motivo_no_trabajo AS codigo_motivo_no_trabaj_1x32y2,
	ficha_persona.otro_motivo_no_trabajo AS otro_motivo_no_trabajo,
	ficha_persona.descripcion_ocupacion_prin AS descripcion_ocupacion_prin,
	ficha_persona.descripcion_dedicacion_prin AS descripcion_dedicacion_prin,
	ficha_persona.numero_tipo_relacion_lab AS numero_tipo_relacion_lab,
		tipo_relacion_lab_1x33.codigo_tipo_relacion_lab AS codigo_tipo_relacion_la_1x33y2,
	ficha_persona.monto_ingreso_ocupacion_prin AS monto_ingreso_ocupacion_prin,
	ficha_persona.monto_ingreso_ocupacion_secun AS monto_ingreso_ocupacion_secun,
	ficha_persona.monto_ingreso_otras_ocup AS monto_ingreso_otras_ocup,
	ficha_persona.monto_ingreso_alquileres AS monto_ingreso_alquileres,
	ficha_persona.monto_ingreso_intereses AS monto_ingreso_intereses,
	ficha_persona.monto_ingreso_ayuda_fam_pais AS monto_ingreso_ayuda_fam_pais,
	ficha_persona.monto_ingreso_ayuda_fam_exter AS monto_ingreso_ayuda_fam_exter,
	ficha_persona.monto_ingreso_jubilacion AS monto_ingreso_jubilacion,
	ficha_persona.monto_ingreso_pensiones AS monto_ingreso_pensiones,
	ficha_persona.monto_ingreso_tekopora AS monto_ingreso_tekopora,
	ficha_persona.monto_ingreso_programas AS monto_ingreso_programas,
	ficha_persona.monto_ingreso_adicional AS monto_ingreso_adicional,
	ficha_persona.total_ingreso_mensual AS total_ingreso_mensual,
	ficha_persona.id_potencial_ben AS id_potencial_ben,
		potencial_ben_1x34.codigo_potencial_ben AS codigo_potencial_ben_1x34y3,
		potencial_ben_1x34.nombre_potencial_ben AS nombre_potencial_ben_1x34y4,
		potencial_ben_1x34.numero_tipo_reg_pot_ben AS numero_tipo_reg_pot_ben_1x34y5,
		potencial_ben_1x34.id_persona AS id_persona_1x34y6,
		potencial_ben_1x34.numero_cedula AS numero_cedula_1x34y7,
		potencial_ben_1x34.letra_cedula AS letra_cedula_1x34y8,
		potencial_ben_1x34.fecha_expedicion_cedula AS fecha_expedicion_cedula_1x34y9,
		potencial_ben_1x34.fecha_vencimiento_cedula AS fecha_vencimiento_cedu_1x34y10,
		potencial_ben_1x34.primer_nombre AS primer_nombre_1x34y11,
		potencial_ben_1x34.segundo_nombre AS segundo_nombre_1x34y12,
		potencial_ben_1x34.primer_apellido AS primer_apellido_1x34y13,
		potencial_ben_1x34.segundo_apellido AS segundo_apellido_1x34y14,
		potencial_ben_1x34.apellido_casada AS apellido_casada_1x34y15,
		potencial_ben_1x34.apodo AS apodo_1x34y16,
		potencial_ben_1x34.fecha_nacimiento AS fecha_nacimiento_1x34y17,
		potencial_ben_1x34.edad AS edad_1x34y18,
		potencial_ben_1x34.es_paraguayo_natural AS es_paraguayo_natural_1x34y19,
		potencial_ben_1x34.es_indigena AS es_indigena_1x34y20,
		potencial_ben_1x34.id_etnia_indigena AS id_etnia_indigena_1x34y21,
		potencial_ben_1x34.nombre_comunidad_indigena AS nombre_comunidad_indig_1x34y22,
		potencial_ben_1x34.id_departamento AS id_departamento_1x34y23,
		potencial_ben_1x34.id_distrito AS id_distrito_1x34y24,
		potencial_ben_1x34.numero_tipo_area AS numero_tipo_area_1x34y25,
		potencial_ben_1x34.id_barrio AS id_barrio_1x34y26,
		potencial_ben_1x34.id_manzana AS id_manzana_1x34y27,
		potencial_ben_1x34.manzana AS manzana_1x34y28,
		potencial_ben_1x34.compania AS compania_1x34y29,
		potencial_ben_1x34.direccion AS direccion_1x34y30,
		potencial_ben_1x34.nombre_responsable_hogar AS nombre_responsable_hog_1x34y31,
		potencial_ben_1x34.numero_telefono_resp_hogar AS numero_telefono_resp_h_1x34y32,
		potencial_ben_1x34.es_persona_con_empleo AS es_persona_con_empleo_1x34y33,
		potencial_ben_1x34.es_persona_con_jubilacion AS es_persona_con_jubilac_1x34y34,
		potencial_ben_1x34.es_persona_con_pension AS es_persona_con_pension_1x34y35,
		potencial_ben_1x34.es_persona_con_subsidio AS es_persona_con_subsidi_1x34y36,
		potencial_ben_1x34.es_persona_con_deuda AS es_persona_con_deuda_1x34y37,
		potencial_ben_1x34.es_persona_con_pena_judicial AS es_persona_con_pena_ju_1x34y38,
		potencial_ben_1x34.es_persona_con_cer_vida AS es_persona_con_cer_vid_1x34y39,
		potencial_ben_1x34.es_persona_con_carta_renuncia AS es_persona_con_carta_r_1x34y40,
		potencial_ben_1x34.nombre_referente AS nombre_referente_1x34y41,
		potencial_ben_1x34.numero_telefono_referente AS numero_telefono_refere_1x34y42,
		potencial_ben_1x34.numero_condicion_censo AS numero_condicion_censo_1x34y43,
		potencial_ben_1x34.fecha_validacion_censo AS fecha_validacion_censo_1x34y44,
		potencial_ben_1x34.id_funcionario_validacion_cen AS id_funcionario_validac_1x34y45,
		potencial_ben_1x34.numero_causa_inv_censo AS numero_causa_inv_censo_1x34y46,
		potencial_ben_1x34.otra_causa_inv_censo AS otra_causa_inv_censo_1x34y47,
		potencial_ben_1x34.comentarios_validacion_censo AS comentarios_validacion_1x34y48,
		potencial_ben_1x34.id_ficha_persona AS id_ficha_persona_1x34y49,
		potencial_ben_1x34.numero_condicion_recl_cen AS numero_condicion_recl__1x34y50,
		potencial_ben_1x34.fecha_reclamo_censo AS fecha_reclamo_censo_1x34y51,
		potencial_ben_1x34.comentarios_reclamo_censo AS comentarios_reclamo_ce_1x34y52,
		potencial_ben_1x34.fecha_aprobacion_reclamo_censo AS fecha_aprobacion_recla_1x34y53,
		potencial_ben_1x34.comentarios_apr_recl_cen AS comentarios_apr_recl_c_1x34y54,
		potencial_ben_1x34.fecha_denegacion_reclamo_censo AS fecha_denegacion_recla_1x34y55,
		potencial_ben_1x34.numero_causa_den_recl_cen AS numero_causa_den_recl__1x34y56,
		potencial_ben_1x34.otra_causa_den_recl_cen AS otra_causa_den_recl_ce_1x34y57,
		potencial_ben_1x34.comentarios_den_recl_cen AS comentarios_den_recl_c_1x34y58,
		potencial_ben_1x34.fecha_registro_pot_ben AS fecha_registro_pot_ben_1x34y59,
		potencial_ben_1x34.id_usuario_reg_pot_ben AS id_usuario_reg_pot_ben_1x34y60,
		potencial_ben_1x34.es_potencial_ben_inactivo AS es_potencial_ben_inact_1x34y61,
		potencial_ben_1x34.fecha_ultima_visita_censo AS fecha_ultima_visita_ce_1x34y62,
		potencial_ben_1x34.observaciones_ult_visita_cen AS observaciones_ult_visi_1x34y63,
		potencial_ben_1x34.id_funcionario_ult_visita_cen AS id_funcionario_ult_vis_1x34y64,
		potencial_ben_1x34.referencia_direccion AS referencia_direccion_1x34y65,
		potencial_ben_1x34.indice_calidad_vida AS indice_calidad_vida_1x34y66,
		potencial_ben_1x34.es_potencial_ben_migrado AS es_potencial_ben_migra_1x34y67,
		potencial_ben_1x34.lote AS lote_1x34y68,
	ficha_persona.es_ficha_persona_inactiva AS es_ficha_persona_inactiva,
	ficha_persona.es_ficha_persona_importada AS es_ficha_persona_importada,
	ficha_persona.fecha_importacion AS fecha_importacion
FROM
	ficha_persona ficha_persona
	INNER JOIN ficha_hogar ficha_hogar_1x1 ON ficha_hogar_1x1.id_ficha_hogar = ficha_persona.id_ficha_hogar
	LEFT OUTER JOIN sexo_persona sexo_persona_1x2 ON sexo_persona_1x2.numero_sexo_persona = ficha_persona.numero_sexo_persona
	LEFT OUTER JOIN estado_civil estado_civil_1x3 ON estado_civil_1x3.numero_estado_civil = ficha_persona.numero_estado_civil
	INNER JOIN tipo_persona_hogar tipo_persona_hogar_1x4 ON tipo_persona_hogar_1x4.numero_tipo_persona_hogar = ficha_persona.numero_tipo_persona_hogar
	INNER JOIN siono siono_1x5 ON siono_1x5.numero_siono = ficha_persona.numero_siono_miembro_hogar
	LEFT OUTER JOIN tipo_excepcion_ced tipo_excepcion_ced_1x6 ON tipo_excepcion_ced_1x6.numero_tipo_excepcion_ced = ficha_persona.numero_tipo_excepcion_ced
	LEFT OUTER JOIN ubicacion ubicacion_1x7 ON ubicacion_1x7.id_ubicacion = ficha_persona.id_departamento_nacimiento
	LEFT OUTER JOIN ubicacion ubicacion_1x8 ON ubicacion_1x8.id_ubicacion = ficha_persona.id_distrito_nacimiento
	LEFT OUTER JOIN tipo_area tipo_area_1x9 ON tipo_area_1x9.numero_tipo_area = ficha_persona.numero_tipo_area_lugar_nac
	LEFT OUTER JOIN idioma_hogar idioma_hogar_1x10 ON idioma_hogar_1x10.numero_idioma_hogar = ficha_persona.numero_idioma_hogar
	LEFT OUTER JOIN siono siono_1x11 ON siono_1x11.numero_siono = ficha_persona.numero_siono_asistencia_esc
	LEFT OUTER JOIN motivo_ina_esc motivo_ina_esc_1x12 ON motivo_ina_esc_1x12.numero_motivo_ina_esc = ficha_persona.numero_motivo_ina_esc
	LEFT OUTER JOIN siono siono_1x13 ON siono_1x13.numero_siono = ficha_persona.numero_siono_matriculacion_esc
	LEFT OUTER JOIN nivel_educativo nivel_educativo_1x14 ON nivel_educativo_1x14.numero_nivel_educativo = ficha_persona.numero_nivel_edu_ult_cur_aprob
	LEFT OUTER JOIN siono siono_1x15 ON siono_1x15.numero_siono = ficha_persona.numero_siono_curso_no_formal
	LEFT OUTER JOIN tipo_seguro_medico tipo_seguro_medico_1x16 ON tipo_seguro_medico_1x16.numero_tipo_seguro_medico = ficha_persona.numero_tipo_seguro_medico
	LEFT OUTER JOIN estado_salud estado_salud_1x17 ON estado_salud_1x17.numero_estado_salud = ficha_persona.numero_estado_salud
	LEFT OUTER JOIN clase_enf_acc clase_enf_acc_1x18 ON clase_enf_acc_1x18.numero_clase_enf_acc = ficha_persona.numero_clase_enf_acc
	LEFT OUTER JOIN clase_enf_cronica clase_enf_cronica_1x19 ON clase_enf_cronica_1x19.numero_clase_enf_cronica = ficha_persona.numero_clase_enf_cronica
	LEFT OUTER JOIN siono siono_1x20 ON siono_1x20.numero_siono = ficha_persona.numero_siono_atencion_medica
	LEFT OUTER JOIN motivo_no_atencion motivo_no_atencion_1x21 ON motivo_no_atencion_1x21.numero_motivo_no_atencion = ficha_persona.numero_motivo_no_atencion
	LEFT OUTER JOIN siono siono_1x22 ON siono_1x22.numero_siono = ficha_persona.numero_siono_carnet_vacunacion
	LEFT OUTER JOIN clase_impedimento clase_impedimento_1x23 ON clase_impedimento_1x23.numero_clase_impedimento = ficha_persona.numero_clase_impedimento
	LEFT OUTER JOIN causa_impedimento causa_impedimento_1x24 ON causa_impedimento_1x24.numero_causa_impedimento = ficha_persona.numero_causa_impedimento
	LEFT OUTER JOIN siono siono_1x25 ON siono_1x25.numero_siono = ficha_persona.numero_siono_dif_para_caminar
	LEFT OUTER JOIN siono siono_1x26 ON siono_1x26.numero_siono = ficha_persona.numero_siono_dif_para_vestirse
	LEFT OUTER JOIN siono siono_1x27 ON siono_1x27.numero_siono = ficha_persona.numero_siono_dif_para_banarse
	LEFT OUTER JOIN siono siono_1x28 ON siono_1x28.numero_siono = ficha_persona.numero_siono_dif_para_comer
	LEFT OUTER JOIN siono siono_1x29 ON siono_1x29.numero_siono = ficha_persona.numero_siono_dif_para_la_cama
	LEFT OUTER JOIN siono siono_1x30 ON siono_1x30.numero_siono = ficha_persona.numero_siono_dif_para_el_bano
	LEFT OUTER JOIN siono siono_1x31 ON siono_1x31.numero_siono = ficha_persona.numero_siono_trabajo
	LEFT OUTER JOIN motivo_no_trabajo motivo_no_trabajo_1x32 ON motivo_no_trabajo_1x32.numero_motivo_no_trabajo = ficha_persona.numero_motivo_no_trabajo
	LEFT OUTER JOIN tipo_relacion_lab tipo_relacion_lab_1x33 ON tipo_relacion_lab_1x33.numero_tipo_relacion_lab = ficha_persona.numero_tipo_relacion_lab
	LEFT OUTER JOIN potencial_ben potencial_ben_1x34 ON potencial_ben_1x34.id_potencial_ben = ficha_persona.id_potencial_ben;

