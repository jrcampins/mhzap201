/**/
exec xsp.dropone('view','consulta_log_imp_per_eec_1');
/**/
CREATE VIEW consulta_log_imp_per_eec_1 AS
SELECT
	log_imp_per_eec.id_log_imp_per_eec AS id_log_imp_per_eec,
	log_imp_per_eec.version_log_imp_per_eec AS version_log_imp_per_eec,
	log_imp_per_eec.dptod AS dptod,
	log_imp_per_eec.distritod AS distritod,
	log_imp_per_eec.distripg AS distripg,
	log_imp_per_eec.area AS area,
	log_imp_per_eec.barrio AS barrio,
	log_imp_per_eec.manzana AS manzana,
	log_imp_per_eec.formulario AS formulario,
	log_imp_per_eec.vivi AS vivi,
	log_imp_per_eec.hogar AS hogar,
	log_imp_per_eec.orden AS orden,
	log_imp_per_eec.p30 AS p30,
	log_imp_per_eec.p31 AS p31,
	log_imp_per_eec.p32 AS p32,
	log_imp_per_eec.p33 AS p33,
	log_imp_per_eec.p34 AS p34,
	log_imp_per_eec.p35 AS p35,
	log_imp_per_eec.p36_orden_conyugue AS p36_orden_conyugue,
	log_imp_per_eec.p36_orden_padre AS p36_orden_padre,
	log_imp_per_eec.p36_orden_madre AS p36_orden_madre,
	log_imp_per_eec.p37 AS p37,
	log_imp_per_eec.p37_cedula AS p37_cedula,
	log_imp_per_eec.p38_dia AS p38_dia,
	log_imp_per_eec.p38_mes AS p38_mes,
	log_imp_per_eec.p38_ano AS p38_ano,
	log_imp_per_eec.p39pais AS p39pais,
	log_imp_per_eec.p39dpto AS p39dpto,
	log_imp_per_eec.p39dist AS p39dist,
	log_imp_per_eec.p39area AS p39area,
	log_imp_per_eec.p40_idioma AS p40_idioma,
	log_imp_per_eec.p40otr AS p40otr,
	log_imp_per_eec.p41 AS p41,
	log_imp_per_eec.p42 AS p42,
	log_imp_per_eec.p43 AS p43,
	log_imp_per_eec.p44_45t AS p44_45t,
	log_imp_per_eec.p44 AS p44,
	log_imp_per_eec.p45 AS p45,
	log_imp_per_eec.p46 AS p46,
	log_imp_per_eec.p47 AS p47,
	log_imp_per_eec.p48 AS p48,
	log_imp_per_eec.p49 AS p49,
	log_imp_per_eec.p49_otr AS p49_otr,
	log_imp_per_eec.p50 AS p50,
	log_imp_per_eec.p50_otr AS p50_otr,
	log_imp_per_eec.p51 AS p51,
	log_imp_per_eec.p52 AS p52,
	log_imp_per_eec.p52_otr AS p52_otr,
	log_imp_per_eec.p53 AS p53,
	log_imp_per_eec.p54 AS p54,
	log_imp_per_eec.p54a AS p54a,
	log_imp_per_eec.p54_otr AS p54_otr,
	log_imp_per_eec.p55 AS p55,
	log_imp_per_eec.p55_otr AS p55_otr,
	log_imp_per_eec.p56 AS p56,
	log_imp_per_eec.p57 AS p57,
	log_imp_per_eec.p58 AS p58,
	log_imp_per_eec.p59 AS p59,
	log_imp_per_eec.p60 AS p60,
	log_imp_per_eec.p61 AS p61,
	log_imp_per_eec.p62 AS p62,
	log_imp_per_eec.p63 AS p63,
	log_imp_per_eec.p63_especificar AS p63_especificar,
	log_imp_per_eec.p64des AS p64des,
	log_imp_per_eec.p64c AS p64c,
	log_imp_per_eec.p65des AS p65des,
	log_imp_per_eec.p65c AS p65c,
	log_imp_per_eec.p66 AS p66,
	log_imp_per_eec.p67a AS p67a,
	log_imp_per_eec.p67b AS p67b,
	log_imp_per_eec.p67c AS p67c,
	log_imp_per_eec.p67d AS p67d,
	log_imp_per_eec.p67e AS p67e,
	log_imp_per_eec.p67f AS p67f,
	log_imp_per_eec.p67g AS p67g,
	log_imp_per_eec.p67h AS p67h,
	log_imp_per_eec.p67i AS p67i,
	log_imp_per_eec.p67j AS p67j,
	log_imp_per_eec.p67k AS p67k,
	log_imp_per_eec.p67l AS p67l,
	log_imp_per_eec.p67tot AS p67tot,
	log_imp_per_eec.es_importado AS es_importado,
	log_imp_per_eec.observacion AS observacion,
	log_imp_per_eec.fecha_hora_transaccion AS fecha_hora_transaccion,
	log_imp_per_eec.nombre_archivo AS nombre_archivo,
	log_imp_per_eec.codigo_archivo AS codigo_archivo,
	log_imp_per_eec.id_ficha_persona AS id_ficha_persona,
		ficha_persona_1x1.codigo_ficha_persona AS codigo_ficha_persona_1x1y3,
		ficha_persona_1x1.nombre_ficha_persona AS nombre_ficha_persona_1x1y4,
		ficha_persona_1x1.es_respondente AS es_respondente_1x1y5,
		ficha_persona_1x1.id_ficha_hogar AS id_ficha_hogar_1x1y6,
		ficha_persona_1x1.numero_orden_identificacion AS numero_orden_identificac_1x1y7,
		ficha_persona_1x1.primer_nombre AS primer_nombre_1x1y8,
		ficha_persona_1x1.segundo_nombre AS segundo_nombre_1x1y9,
		ficha_persona_1x1.primer_apellido AS primer_apellido_1x1y10,
		ficha_persona_1x1.segundo_apellido AS segundo_apellido_1x1y11,
		ficha_persona_1x1.apellido_casada AS apellido_casada_1x1y12,
		ficha_persona_1x1.apodo AS apodo_1x1y13,
		ficha_persona_1x1.edad AS edad_1x1y14,
		ficha_persona_1x1.numero_sexo_persona AS numero_sexo_persona_1x1y15,
		ficha_persona_1x1.numero_estado_civil AS numero_estado_civil_1x1y16,
		ficha_persona_1x1.numero_tipo_persona_hogar AS numero_tipo_persona_hog_1x1y17,
		ficha_persona_1x1.numero_siono_miembro_hogar AS numero_siono_miembro_ho_1x1y18,
		ficha_persona_1x1.numero_orden_iden_conyuge AS numero_orden_iden_conyu_1x1y19,
		ficha_persona_1x1.numero_orden_iden_padre AS numero_orden_iden_padre_1x1y20,
		ficha_persona_1x1.numero_orden_iden_madre AS numero_orden_iden_madre_1x1y21,
		ficha_persona_1x1.numero_cedula AS numero_cedula_1x1y22,
		ficha_persona_1x1.letra_cedula AS letra_cedula_1x1y23,
		ficha_persona_1x1.numero_tipo_excepcion_ced AS numero_tipo_excepcion_c_1x1y24,
		ficha_persona_1x1.fecha_nacimiento AS fecha_nacimiento_1x1y25,
		ficha_persona_1x1.id_departamento_nacimiento AS id_departamento_nacimie_1x1y26,
		ficha_persona_1x1.id_distrito_nacimiento AS id_distrito_nacimiento_1x1y27,
		ficha_persona_1x1.numero_tipo_area_lugar_nac AS numero_tipo_area_lugar__1x1y28,
		ficha_persona_1x1.numero_idioma_hogar AS numero_idioma_hogar_1x1y29,
		ficha_persona_1x1.otro_idioma_hogar AS otro_idioma_hogar_1x1y30,
		ficha_persona_1x1.numero_siono_asistencia_esc AS numero_siono_asistencia_1x1y31,
		ficha_persona_1x1.numero_motivo_ina_esc AS numero_motivo_ina_esc_1x1y32,
		ficha_persona_1x1.otro_motivo_ina_esc AS otro_motivo_ina_esc_1x1y33,
		ficha_persona_1x1.numero_siono_matriculacion_esc AS numero_siono_matriculac_1x1y34,
		ficha_persona_1x1.ultimo_curso_aprobado AS ultimo_curso_aprobado_1x1y35,
		ficha_persona_1x1.numero_nivel_edu_ult_cur_aprob AS numero_nivel_edu_ult_cu_1x1y36,
		ficha_persona_1x1.numero_siono_curso_no_formal AS numero_siono_curso_no_f_1x1y37,
		ficha_persona_1x1.numero_tipo_seguro_medico AS numero_tipo_seguro_medi_1x1y38,
		ficha_persona_1x1.numero_estado_salud AS numero_estado_salud_1x1y39,
		ficha_persona_1x1.numero_clase_enf_acc AS numero_clase_enf_acc_1x1y40,
		ficha_persona_1x1.otra_clase_enf_acc AS otra_clase_enf_acc_1x1y41,
		ficha_persona_1x1.numero_clase_enf_cronica AS numero_clase_enf_cronic_1x1y42,
		ficha_persona_1x1.otra_clase_enf_cronica AS otra_clase_enf_cronica_1x1y43,
		ficha_persona_1x1.numero_siono_atencion_medica AS numero_siono_atencion_m_1x1y44,
		ficha_persona_1x1.numero_motivo_no_atencion AS numero_motivo_no_atenci_1x1y45,
		ficha_persona_1x1.otro_motivo_no_atencion AS otro_motivo_no_atencion_1x1y46,
		ficha_persona_1x1.numero_siono_carnet_vacunacion AS numero_siono_carnet_vac_1x1y47,
		ficha_persona_1x1.numero_clase_impedimento AS numero_clase_impediment_1x1y48,
		ficha_persona_1x1.otra_clase_impedimento AS otra_clase_impedimento_1x1y49,
		ficha_persona_1x1.numero_causa_impedimento AS numero_causa_impediment_1x1y50,
		ficha_persona_1x1.otra_causa_impedimento AS otra_causa_impedimento_1x1y51,
		ficha_persona_1x1.numero_siono_dif_para_caminar AS numero_siono_dif_para_c_1x1y52,
		ficha_persona_1x1.numero_siono_dif_para_vestirse AS numero_siono_dif_para_v_1x1y53,
		ficha_persona_1x1.numero_siono_dif_para_banarse AS numero_siono_dif_para_b_1x1y54,
		ficha_persona_1x1.numero_siono_dif_para_comer AS numero_siono_dif_para_c_1x1y55,
		ficha_persona_1x1.numero_siono_dif_para_la_cama AS numero_siono_dif_para_l_1x1y56,
		ficha_persona_1x1.numero_siono_dif_para_el_bano AS numero_siono_dif_para_e_1x1y57,
		ficha_persona_1x1.numero_siono_trabajo AS numero_siono_trabajo_1x1y58,
		ficha_persona_1x1.numero_motivo_no_trabajo AS numero_motivo_no_trabaj_1x1y59,
		ficha_persona_1x1.otro_motivo_no_trabajo AS otro_motivo_no_trabajo_1x1y60,
		ficha_persona_1x1.descripcion_ocupacion_prin AS descripcion_ocupacion_p_1x1y61,
		ficha_persona_1x1.descripcion_dedicacion_prin AS descripcion_dedicacion__1x1y62,
		ficha_persona_1x1.numero_tipo_relacion_lab AS numero_tipo_relacion_la_1x1y63,
		ficha_persona_1x1.monto_ingreso_ocupacion_prin AS monto_ingreso_ocupacion_1x1y64,
		ficha_persona_1x1.monto_ingreso_ocupacion_secun AS monto_ingreso_ocupacion_1x1y65,
		ficha_persona_1x1.monto_ingreso_otras_ocup AS monto_ingreso_otras_ocu_1x1y66,
		ficha_persona_1x1.monto_ingreso_alquileres AS monto_ingreso_alquilere_1x1y67,
		ficha_persona_1x1.monto_ingreso_intereses AS monto_ingreso_intereses_1x1y68,
		ficha_persona_1x1.monto_ingreso_ayuda_fam_pais AS monto_ingreso_ayuda_fam_1x1y69,
		ficha_persona_1x1.monto_ingreso_ayuda_fam_exter AS monto_ingreso_ayuda_fam_1x1y70,
		ficha_persona_1x1.monto_ingreso_jubilacion AS monto_ingreso_jubilacio_1x1y71,
		ficha_persona_1x1.monto_ingreso_pensiones AS monto_ingreso_pensiones_1x1y72,
		ficha_persona_1x1.monto_ingreso_tekopora AS monto_ingreso_tekopora_1x1y73,
		ficha_persona_1x1.monto_ingreso_programas AS monto_ingreso_programas_1x1y74,
		ficha_persona_1x1.monto_ingreso_adicional AS monto_ingreso_adicional_1x1y75,
		ficha_persona_1x1.total_ingreso_mensual AS total_ingreso_mensual_1x1y76,
		ficha_persona_1x1.id_potencial_ben AS id_potencial_ben_1x1y77,
		ficha_persona_1x1.es_ficha_persona_inactiva AS es_ficha_persona_inacti_1x1y78,
		ficha_persona_1x1.es_ficha_persona_importada AS es_ficha_persona_import_1x1y79,
		ficha_persona_1x1.fecha_importacion AS fecha_importacion_1x1y80
FROM
	log_imp_per_eec log_imp_per_eec
	LEFT OUTER JOIN ficha_persona ficha_persona_1x1 ON ficha_persona_1x1.id_ficha_persona = log_imp_per_eec.id_ficha_persona;

