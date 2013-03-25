/**/
exec xsp.dropone('view','consulta_persona_1');
/**/
CREATE VIEW consulta_persona_1 AS
SELECT
	persona.id_persona AS id_persona,
	persona.version_persona AS version_persona,
	persona.codigo_persona AS codigo_persona,
	persona.nombre_persona AS nombre_persona,
	persona.numero_cedula AS numero_cedula,
	persona.letra_cedula AS letra_cedula,
	persona.fecha_expedicion_cedula AS fecha_expedicion_cedula,
	persona.fecha_vencimiento_cedula AS fecha_vencimiento_cedula,
	persona.primer_nombre AS primer_nombre,
	persona.segundo_nombre AS segundo_nombre,
	persona.primer_apellido AS primer_apellido,
	persona.segundo_apellido AS segundo_apellido,
	persona.apellido_casada AS apellido_casada,
	persona.apodo AS apodo,
	persona.fecha_nacimiento AS fecha_nacimiento,
	persona.numero_sexo_persona AS numero_sexo_persona,
		sexo_persona_1x1.codigo_sexo_persona AS codigo_sexo_persona_1x1y2,
	persona.numero_estado_civil AS numero_estado_civil,
		estado_civil_1x2.codigo_estado_civil AS codigo_estado_civil_1x2y2,
	persona.es_paraguayo_natural AS es_paraguayo_natural,
	persona.es_indigena AS es_indigena,
	persona.id_etnia_indigena AS id_etnia_indigena,
		etnia_indigena_1x3.codigo_etnia_indigena AS codigo_etnia_indigena_1x3y3,
		etnia_indigena_1x3.nombre_etnia_indigena AS nombre_etnia_indigena_1x3y4,
		etnia_indigena_1x3.descripcion_etnia_indigena AS descripcion_etnia_indige_1x3y5,
	persona.nombre_comunidad_indigena AS nombre_comunidad_indigena,
	persona.id_departamento AS id_departamento,
		ubicacion_1x4.codigo_ubicacion AS codigo_ubicacion_1x4y3,
		ubicacion_1x4.nombre_ubicacion AS nombre_ubicacion_1x4y4,
		ubicacion_1x4.id_ubicacion_superior AS id_ubicacion_superior_1x4y5,
		ubicacion_1x4.numero_tipo_nodo AS numero_tipo_nodo_1x4y6,
		ubicacion_1x4.numero_nivel_ubicacion AS numero_nivel_ubicacion_1x4y7,
		ubicacion_1x4.secuencia_ubicacion AS secuencia_ubicacion_1x4y8,
		ubicacion_1x4.clave_ubicacion AS clave_ubicacion_1x4y9,
		ubicacion_1x4.numero_tipo_area AS numero_tipo_area_1x4y10,
		ubicacion_1x4.codigo_ubicacion_jupe AS codigo_ubicacion_jupe_1x4y11,
	persona.id_distrito AS id_distrito,
		ubicacion_1x5.codigo_ubicacion AS codigo_ubicacion_1x5y3,
		ubicacion_1x5.nombre_ubicacion AS nombre_ubicacion_1x5y4,
		ubicacion_1x5.id_ubicacion_superior AS id_ubicacion_superior_1x5y5,
		ubicacion_1x5.numero_tipo_nodo AS numero_tipo_nodo_1x5y6,
		ubicacion_1x5.numero_nivel_ubicacion AS numero_nivel_ubicacion_1x5y7,
		ubicacion_1x5.secuencia_ubicacion AS secuencia_ubicacion_1x5y8,
		ubicacion_1x5.clave_ubicacion AS clave_ubicacion_1x5y9,
		ubicacion_1x5.numero_tipo_area AS numero_tipo_area_1x5y10,
		ubicacion_1x5.codigo_ubicacion_jupe AS codigo_ubicacion_jupe_1x5y11,
	persona.numero_tipo_area AS numero_tipo_area,
		tipo_area_1x6.codigo_tipo_area AS codigo_tipo_area_1x6y2,
		tipo_area_1x6.limite_indice_calidad_vida AS limite_indice_calidad_vi_1x6y3,
	persona.id_barrio AS id_barrio,
		ubicacion_1x7.codigo_ubicacion AS codigo_ubicacion_1x7y3,
		ubicacion_1x7.nombre_ubicacion AS nombre_ubicacion_1x7y4,
		ubicacion_1x7.id_ubicacion_superior AS id_ubicacion_superior_1x7y5,
		ubicacion_1x7.numero_tipo_nodo AS numero_tipo_nodo_1x7y6,
		ubicacion_1x7.numero_nivel_ubicacion AS numero_nivel_ubicacion_1x7y7,
		ubicacion_1x7.secuencia_ubicacion AS secuencia_ubicacion_1x7y8,
		ubicacion_1x7.clave_ubicacion AS clave_ubicacion_1x7y9,
		ubicacion_1x7.numero_tipo_area AS numero_tipo_area_1x7y10,
		ubicacion_1x7.codigo_ubicacion_jupe AS codigo_ubicacion_jupe_1x7y11,
	persona.id_manzana AS id_manzana,
		ubicacion_1x8.codigo_ubicacion AS codigo_ubicacion_1x8y3,
		ubicacion_1x8.nombre_ubicacion AS nombre_ubicacion_1x8y4,
		ubicacion_1x8.id_ubicacion_superior AS id_ubicacion_superior_1x8y5,
		ubicacion_1x8.numero_tipo_nodo AS numero_tipo_nodo_1x8y6,
		ubicacion_1x8.numero_nivel_ubicacion AS numero_nivel_ubicacion_1x8y7,
		ubicacion_1x8.secuencia_ubicacion AS secuencia_ubicacion_1x8y8,
		ubicacion_1x8.clave_ubicacion AS clave_ubicacion_1x8y9,
		ubicacion_1x8.numero_tipo_area AS numero_tipo_area_1x8y10,
		ubicacion_1x8.codigo_ubicacion_jupe AS codigo_ubicacion_jupe_1x8y11,
	persona.manzana AS manzana,
	persona.direccion AS direccion,
	persona.numero_telefono_linea_baja AS numero_telefono_linea_baja,
	persona.numero_telefono_celular AS numero_telefono_celular,
	persona.certificado_vida AS certificado_vida,
	persona.fecha_certificado_vida AS fecha_certificado_vida,
	persona.es_certificado_vida_anulado AS es_certificado_vida_anulado,
	persona.comentarios_anul_cer_vida AS comentarios_anul_cer_vida,
	persona.certificado_defuncion AS certificado_defuncion,
	persona.fecha_certificado_defuncion AS fecha_certificado_defuncion,
	persona.es_cer_defuncion_anulado AS es_cer_defuncion_anulado,
	persona.comentarios_anul_cer_defuncion AS comentarios_anul_cer_defuncion,
	persona.es_persona_con_empleo AS es_persona_con_empleo,
	persona.es_persona_con_jubilacion AS es_persona_con_jubilacion,
	persona.es_persona_con_pension AS es_persona_con_pension,
	persona.es_persona_con_subsidio AS es_persona_con_subsidio,
	persona.es_persona_con_deuda AS es_persona_con_deuda,
	persona.es_persona_con_pena_judicial AS es_persona_con_pena_judicial,
	persona.es_persona_con_cer_vida AS es_persona_con_cer_vida,
	persona.es_persona_con_carta_renuncia AS es_persona_con_carta_renuncia,
	persona.es_persona_elegible_para_pen AS es_persona_elegible_para_pen,
	persona.es_persona_acreditada_para_pen AS es_persona_acreditada_para_pen,
	persona.es_persona_con_copia_cedula AS es_persona_con_copia_cedula,
	persona.es_persona_con_declaracion_jur AS es_persona_con_declaracion_jur,
	persona.monto_pension AS monto_pension,
	persona.numero_condicion_pension AS numero_condicion_pension,
		condicion_pension_1x9.codigo_condicion_pension AS codigo_condicion_pension_1x9y2,
	persona.lugar_solicitud_pension AS lugar_solicitud_pension,
	persona.fecha_solicitud_pension AS fecha_solicitud_pension,
	persona.comentarios_solicitud_pension AS comentarios_solicitud_pension,
	persona.fecha_aprobacion_pension AS fecha_aprobacion_pension,
	persona.comentarios_aprobacion_pension AS comentarios_aprobacion_pension,
	persona.fecha_otorgamiento_pen AS fecha_otorgamiento_pen,
	persona.numero_resolucion_otor_pen AS numero_resolucion_otor_pen,
	persona.fecha_resolucion_otor_pen AS fecha_resolucion_otor_pen,
	persona.comentarios_otorgamiento_pen AS comentarios_otorgamiento_pen,
	persona.fecha_objecion_pension AS fecha_objecion_pension,
	persona.numero_causa_den_pension AS numero_causa_den_pension,
		causa_den_pension_1x10.codigo_causa_den_pension AS codigo_causa_den_pensio_1x10y2,
	persona.otra_causa_den_pension AS otra_causa_den_pension,
	persona.comentarios_objecion_pension AS comentarios_objecion_pension,
	persona.fecha_denegacion_pension AS fecha_denegacion_pension,
	persona.numero_resolucion_den_pen AS numero_resolucion_den_pen,
	persona.fecha_resolucion_den_pen AS fecha_resolucion_den_pen,
	persona.comentarios_denegacion_pension AS comentarios_denegacion_pension,
	persona.fecha_revocacion_pension AS fecha_revocacion_pension,
	persona.numero_causa_rev_pension AS numero_causa_rev_pension,
		causa_rev_pension_1x11.codigo_causa_rev_pension AS codigo_causa_rev_pensio_1x11y2,
	persona.otra_causa_rev_pension AS otra_causa_rev_pension,
	persona.comentarios_revocacion_pension AS comentarios_revocacion_pension,
	persona.numero_condicion_reco_pen AS numero_condicion_reco_pen,
		condicion_reco_pen_1x12.codigo_condicion_reco_pen AS codigo_condicion_reco_p_1x12y2,
	persona.fecha_solicitud_reco_pen AS fecha_solicitud_reco_pen,
	persona.comentarios_solicitud_reco_pen AS comentarios_solicitud_reco_pen,
	persona.fecha_aprobacion_reco_pen AS fecha_aprobacion_reco_pen,
	persona.comentarios_apr_reco_pen AS comentarios_apr_reco_pen,
	persona.fecha_denegacion_reco_pen AS fecha_denegacion_reco_pen,
	persona.numero_causa_den_reco_pen AS numero_causa_den_reco_pen,
		causa_den_reco_pen_1x13.codigo_causa_den_reco_pen AS codigo_causa_den_reco_p_1x13y2,
	persona.otra_causa_den_reco_pen AS otra_causa_den_reco_pen,
	persona.comentarios_den_reco_pen AS comentarios_den_reco_pen,
	persona.numero_condicion_denu_pen AS numero_condicion_denu_pen,
		condicion_denu_pen_1x14.codigo_condicion_denu_pen AS codigo_condicion_denu_p_1x14y2,
	persona.fecha_registro_denuncia_pen AS fecha_registro_denuncia_pen,
	persona.comentarios_registro_denu_pen AS comentarios_registro_denu_pen,
	persona.fecha_confirmacion_denu_pen AS fecha_confirmacion_denu_pen,
	persona.comentarios_conf_denu_pen AS comentarios_conf_denu_pen,
	persona.fecha_desmentido_denuncia_pen AS fecha_desmentido_denuncia_pen,
	persona.comentarios_des_denu_pen AS comentarios_des_denu_pen,
	persona.id_ficha_persona AS id_ficha_persona,
		ficha_persona_1x15.codigo_ficha_persona AS codigo_ficha_persona_1x15y3,
		ficha_persona_1x15.nombre_ficha_persona AS nombre_ficha_persona_1x15y4,
		ficha_persona_1x15.es_respondente AS es_respondente_1x15y5,
		ficha_persona_1x15.id_ficha_hogar AS id_ficha_hogar_1x15y6,
		ficha_persona_1x15.numero_orden_identificacion AS numero_orden_identifica_1x15y7,
		ficha_persona_1x15.primer_nombre AS primer_nombre_1x15y8,
		ficha_persona_1x15.segundo_nombre AS segundo_nombre_1x15y9,
		ficha_persona_1x15.primer_apellido AS primer_apellido_1x15y10,
		ficha_persona_1x15.segundo_apellido AS segundo_apellido_1x15y11,
		ficha_persona_1x15.apellido_casada AS apellido_casada_1x15y12,
		ficha_persona_1x15.apodo AS apodo_1x15y13,
		ficha_persona_1x15.edad AS edad_1x15y14,
		ficha_persona_1x15.numero_sexo_persona AS numero_sexo_persona_1x15y15,
		ficha_persona_1x15.numero_estado_civil AS numero_estado_civil_1x15y16,
		ficha_persona_1x15.numero_tipo_persona_hogar AS numero_tipo_persona_ho_1x15y17,
		ficha_persona_1x15.numero_siono_miembro_hogar AS numero_siono_miembro_h_1x15y18,
		ficha_persona_1x15.numero_orden_iden_conyuge AS numero_orden_iden_cony_1x15y19,
		ficha_persona_1x15.numero_orden_iden_padre AS numero_orden_iden_padr_1x15y20,
		ficha_persona_1x15.numero_orden_iden_madre AS numero_orden_iden_madr_1x15y21,
		ficha_persona_1x15.numero_cedula AS numero_cedula_1x15y22,
		ficha_persona_1x15.letra_cedula AS letra_cedula_1x15y23,
		ficha_persona_1x15.numero_tipo_excepcion_ced AS numero_tipo_excepcion__1x15y24,
		ficha_persona_1x15.fecha_nacimiento AS fecha_nacimiento_1x15y25,
		ficha_persona_1x15.id_departamento_nacimiento AS id_departamento_nacimi_1x15y26,
		ficha_persona_1x15.id_distrito_nacimiento AS id_distrito_nacimiento_1x15y27,
		ficha_persona_1x15.numero_tipo_area_lugar_nac AS numero_tipo_area_lugar_1x15y28,
		ficha_persona_1x15.numero_idioma_hogar AS numero_idioma_hogar_1x15y29,
		ficha_persona_1x15.otro_idioma_hogar AS otro_idioma_hogar_1x15y30,
		ficha_persona_1x15.numero_siono_asistencia_esc AS numero_siono_asistenci_1x15y31,
		ficha_persona_1x15.numero_motivo_ina_esc AS numero_motivo_ina_esc_1x15y32,
		ficha_persona_1x15.otro_motivo_ina_esc AS otro_motivo_ina_esc_1x15y33,
		ficha_persona_1x15.numero_siono_matriculacion_esc AS numero_siono_matricula_1x15y34,
		ficha_persona_1x15.ultimo_curso_aprobado AS ultimo_curso_aprobado_1x15y35,
		ficha_persona_1x15.numero_nivel_edu_ult_cur_aprob AS numero_nivel_edu_ult_c_1x15y36,
		ficha_persona_1x15.numero_siono_curso_no_formal AS numero_siono_curso_no__1x15y37,
		ficha_persona_1x15.numero_tipo_seguro_medico AS numero_tipo_seguro_med_1x15y38,
		ficha_persona_1x15.numero_estado_salud AS numero_estado_salud_1x15y39,
		ficha_persona_1x15.numero_clase_enf_acc AS numero_clase_enf_acc_1x15y40,
		ficha_persona_1x15.otra_clase_enf_acc AS otra_clase_enf_acc_1x15y41,
		ficha_persona_1x15.numero_clase_enf_cronica AS numero_clase_enf_croni_1x15y42,
		ficha_persona_1x15.otra_clase_enf_cronica AS otra_clase_enf_cronica_1x15y43,
		ficha_persona_1x15.numero_siono_atencion_medica AS numero_siono_atencion__1x15y44,
		ficha_persona_1x15.numero_motivo_no_atencion AS numero_motivo_no_atenc_1x15y45,
		ficha_persona_1x15.otro_motivo_no_atencion AS otro_motivo_no_atencio_1x15y46,
		ficha_persona_1x15.numero_siono_carnet_vacunacion AS numero_siono_carnet_va_1x15y47,
		ficha_persona_1x15.numero_clase_impedimento AS numero_clase_impedimen_1x15y48,
		ficha_persona_1x15.otra_clase_impedimento AS otra_clase_impedimento_1x15y49,
		ficha_persona_1x15.numero_causa_impedimento AS numero_causa_impedimen_1x15y50,
		ficha_persona_1x15.otra_causa_impedimento AS otra_causa_impedimento_1x15y51,
		ficha_persona_1x15.numero_siono_dif_para_caminar AS numero_siono_dif_para__1x15y52,
		ficha_persona_1x15.numero_siono_dif_para_vestirse AS numero_siono_dif_para__1x15y53,
		ficha_persona_1x15.numero_siono_dif_para_banarse AS numero_siono_dif_para__1x15y54,
		ficha_persona_1x15.numero_siono_dif_para_comer AS numero_siono_dif_para__1x15y55,
		ficha_persona_1x15.numero_siono_dif_para_la_cama AS numero_siono_dif_para__1x15y56,
		ficha_persona_1x15.numero_siono_dif_para_el_bano AS numero_siono_dif_para__1x15y57,
		ficha_persona_1x15.numero_siono_trabajo AS numero_siono_trabajo_1x15y58,
		ficha_persona_1x15.numero_motivo_no_trabajo AS numero_motivo_no_traba_1x15y59,
		ficha_persona_1x15.otro_motivo_no_trabajo AS otro_motivo_no_trabajo_1x15y60,
		ficha_persona_1x15.descripcion_ocupacion_prin AS descripcion_ocupacion__1x15y61,
		ficha_persona_1x15.descripcion_dedicacion_prin AS descripcion_dedicacion_1x15y62,
		ficha_persona_1x15.numero_tipo_relacion_lab AS numero_tipo_relacion_l_1x15y63,
		ficha_persona_1x15.monto_ingreso_ocupacion_prin AS monto_ingreso_ocupacio_1x15y64,
		ficha_persona_1x15.monto_ingreso_ocupacion_secun AS monto_ingreso_ocupacio_1x15y65,
		ficha_persona_1x15.monto_ingreso_otras_ocup AS monto_ingreso_otras_oc_1x15y66,
		ficha_persona_1x15.monto_ingreso_alquileres AS monto_ingreso_alquiler_1x15y67,
		ficha_persona_1x15.monto_ingreso_intereses AS monto_ingreso_interese_1x15y68,
		ficha_persona_1x15.monto_ingreso_ayuda_fam_pais AS monto_ingreso_ayuda_fa_1x15y69,
		ficha_persona_1x15.monto_ingreso_ayuda_fam_exter AS monto_ingreso_ayuda_fa_1x15y70,
		ficha_persona_1x15.monto_ingreso_jubilacion AS monto_ingreso_jubilaci_1x15y71,
		ficha_persona_1x15.monto_ingreso_pensiones AS monto_ingreso_pensione_1x15y72,
		ficha_persona_1x15.monto_ingreso_tekopora AS monto_ingreso_tekopora_1x15y73,
		ficha_persona_1x15.monto_ingreso_programas AS monto_ingreso_programa_1x15y74,
		ficha_persona_1x15.monto_ingreso_adicional AS monto_ingreso_adiciona_1x15y75,
		ficha_persona_1x15.total_ingreso_mensual AS total_ingreso_mensual_1x15y76,
		ficha_persona_1x15.id_potencial_ben AS id_potencial_ben_1x15y77,
		ficha_persona_1x15.es_ficha_persona_inactiva AS es_ficha_persona_inact_1x15y78,
	persona.fecha_ficha_persona AS fecha_ficha_persona,
	persona.indice_calidad_vida AS indice_calidad_vida,
	persona.fecha_ultimo_cobro_pension AS fecha_ultimo_cobro_pension,
	persona.notas_anul_fec_ult_cob_pen AS notas_anul_fec_ult_cob_pen,
	persona.numero_tipo_act_jupe AS numero_tipo_act_jupe,
		tipo_act_jupe_1x16.codigo_tipo_act_jupe AS codigo_tipo_act_jupe_1x16y2,
	persona.fecha_hora_ult_act_jupe AS fecha_hora_ult_act_jupe,
	persona.lote AS lote,
	persona.codigo_sime AS codigo_sime,
	persona.comentarios_entrega_documentos AS comentarios_entrega_documentos
FROM
	persona persona
	LEFT OUTER JOIN sexo_persona sexo_persona_1x1 ON sexo_persona_1x1.numero_sexo_persona = persona.numero_sexo_persona
	LEFT OUTER JOIN estado_civil estado_civil_1x2 ON estado_civil_1x2.numero_estado_civil = persona.numero_estado_civil
	LEFT OUTER JOIN etnia_indigena etnia_indigena_1x3 ON etnia_indigena_1x3.id_etnia_indigena = persona.id_etnia_indigena
	LEFT OUTER JOIN ubicacion ubicacion_1x4 ON ubicacion_1x4.id_ubicacion = persona.id_departamento
	LEFT OUTER JOIN ubicacion ubicacion_1x5 ON ubicacion_1x5.id_ubicacion = persona.id_distrito
	LEFT OUTER JOIN tipo_area tipo_area_1x6 ON tipo_area_1x6.numero_tipo_area = persona.numero_tipo_area
	LEFT OUTER JOIN ubicacion ubicacion_1x7 ON ubicacion_1x7.id_ubicacion = persona.id_barrio
	LEFT OUTER JOIN ubicacion ubicacion_1x8 ON ubicacion_1x8.id_ubicacion = persona.id_manzana
	LEFT OUTER JOIN condicion_pension condicion_pension_1x9 ON condicion_pension_1x9.numero_condicion_pension = persona.numero_condicion_pension
	LEFT OUTER JOIN causa_den_pension causa_den_pension_1x10 ON causa_den_pension_1x10.numero_causa_den_pension = persona.numero_causa_den_pension
	LEFT OUTER JOIN causa_rev_pension causa_rev_pension_1x11 ON causa_rev_pension_1x11.numero_causa_rev_pension = persona.numero_causa_rev_pension
	LEFT OUTER JOIN condicion_reco_pen condicion_reco_pen_1x12 ON condicion_reco_pen_1x12.numero_condicion_reco_pen = persona.numero_condicion_reco_pen
	LEFT OUTER JOIN causa_den_reco_pen causa_den_reco_pen_1x13 ON causa_den_reco_pen_1x13.numero_causa_den_reco_pen = persona.numero_causa_den_reco_pen
	LEFT OUTER JOIN condicion_denu_pen condicion_denu_pen_1x14 ON condicion_denu_pen_1x14.numero_condicion_denu_pen = persona.numero_condicion_denu_pen
	LEFT OUTER JOIN ficha_persona ficha_persona_1x15 ON ficha_persona_1x15.id_ficha_persona = persona.id_ficha_persona
	LEFT OUTER JOIN tipo_act_jupe tipo_act_jupe_1x16 ON tipo_act_jupe_1x16.numero_tipo_act_jupe = persona.numero_tipo_act_jupe;

