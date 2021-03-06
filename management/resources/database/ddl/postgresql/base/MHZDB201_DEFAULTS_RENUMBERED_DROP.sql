ALTER TABLE aplicacion ALTER COLUMN version_aplicacion DROP DEFAULT ;
ALTER TABLE aplicacion ALTER COLUMN es_publica DROP DEFAULT ;
ALTER TABLE archivo_datos_ext ALTER COLUMN version_archivo_datos_ext DROP DEFAULT ;
ALTER TABLE archivo_datos_ext ALTER COLUMN es_archivo_datos_ext_importado DROP DEFAULT ;
ALTER TABLE archivo_datos_ext ALTER COLUMN es_archivo_datos_ext_inactivo DROP DEFAULT ;
ALTER TABLE clase_recurso ALTER COLUMN version_clase_recurso DROP DEFAULT ;
ALTER TABLE clase_recurso ALTER COLUMN es_clase_recurso_independiente DROP DEFAULT ;
ALTER TABLE clase_recurso ALTER COLUMN es_clase_recurso_sin_detalle DROP DEFAULT ;
ALTER TABLE clase_recurso ALTER COLUMN es_clase_recurso_con_arbol DROP DEFAULT ;
ALTER TABLE clase_recurso ALTER COLUMN numero_tipo_clase_recurso DROP DEFAULT ;
ALTER TABLE clase_recurso ALTER COLUMN es_clase_recurso_insertable DROP DEFAULT ;
ALTER TABLE clase_recurso ALTER COLUMN es_clase_recurso_modificable DROP DEFAULT ;
ALTER TABLE clase_recurso ALTER COLUMN es_clase_recurso_eliminable DROP DEFAULT ;
ALTER TABLE clase_recurso ALTER COLUMN es_clase_recurso_extendida DROP DEFAULT ;
ALTER TABLE clase_recurso ALTER COLUMN es_enumerador_con_numero DROP DEFAULT ;
ALTER TABLE clase_recurso_par ALTER COLUMN version_clase_recurso_par DROP DEFAULT ;
ALTER TABLE clase_recurso_par ALTER COLUMN numero_tipo_valor DROP DEFAULT ;
ALTER TABLE clase_recurso_par ALTER COLUMN es_parametro_omisible DROP DEFAULT ;
ALTER TABLE clase_recurso_par ALTER COLUMN es_parametro_inmutable DROP DEFAULT ;
ALTER TABLE clase_recurso_par ALTER COLUMN es_parametro_submit DROP DEFAULT ;
ALTER TABLE clase_recurso_par ALTER COLUMN es_parametro_primordial DROP DEFAULT ;
ALTER TABLE clase_recurso_par ALTER COLUMN es_parametro_maestro DROP DEFAULT ;
ALTER TABLE clase_recurso_par ALTER COLUMN es_parametro_segmento DROP DEFAULT ;
ALTER TABLE clase_recurso_par ALTER COLUMN es_parametro_sin_rastro DROP DEFAULT ;
ALTER TABLE clase_recurso_par ALTER COLUMN es_parametro_sincronizado DROP DEFAULT ;
ALTER TABLE clase_recurso_par ALTER COLUMN orden_presentacion DROP DEFAULT ;
ALTER TABLE clase_recurso_par ALTER COLUMN es_referencia_alternativa DROP DEFAULT ;
ALTER TABLE clase_recurso_par ALTER COLUMN orden_pagina_seleccion DROP DEFAULT ;
ALTER TABLE clase_recurso_sec ALTER COLUMN version_clase_recurso_sec DROP DEFAULT ;
ALTER TABLE clase_recurso_sec ALTER COLUMN orden_presentacion DROP DEFAULT ;
ALTER TABLE clase_recurso_sec ALTER COLUMN es_pestana_detalle DROP DEFAULT ;
ALTER TABLE conjunto_segmento ALTER COLUMN version_conjunto_segmento DROP DEFAULT ;
ALTER TABLE dominio ALTER COLUMN version_dominio DROP DEFAULT ;
ALTER TABLE dominio_paquete ALTER COLUMN version_dominio_paquete DROP DEFAULT ;
ALTER TABLE dominio_parametro ALTER COLUMN version_dominio_parametro DROP DEFAULT ;
ALTER TABLE elemento_segmento ALTER COLUMN version_elemento_segmento DROP DEFAULT ;
ALTER TABLE etnia_indigena ALTER COLUMN version_etnia_indigena DROP DEFAULT ;
ALTER TABLE ficha_hogar ALTER COLUMN version_ficha_hogar DROP DEFAULT ;
ALTER TABLE ficha_hogar ALTER COLUMN es_ficha_hogar_inactiva DROP DEFAULT ;
ALTER TABLE ficha_persona ALTER COLUMN version_ficha_persona DROP DEFAULT ;
ALTER TABLE ficha_persona ALTER COLUMN es_respondente DROP DEFAULT ;
ALTER TABLE ficha_persona ALTER COLUMN numero_siono_miembro_hogar DROP DEFAULT ;
ALTER TABLE ficha_persona ALTER COLUMN es_ficha_persona_inactiva DROP DEFAULT ;
ALTER TABLE ficha_persona ALTER COLUMN es_ficha_persona_importada DROP DEFAULT ;
ALTER TABLE filtro_cla_rec_fun ALTER COLUMN version_filtro_cla_rec_fun DROP DEFAULT ;
ALTER TABLE filtro_cla_rec_fun ALTER COLUMN numero_operador_com DROP DEFAULT ;
ALTER TABLE filtro_cla_rec_par ALTER COLUMN version_filtro_cla_rec_par DROP DEFAULT ;
ALTER TABLE filtro_cla_rec_par ALTER COLUMN numero_operador_com DROP DEFAULT ;
ALTER TABLE filtro_cla_rec_sec ALTER COLUMN version_filtro_cla_rec_sec DROP DEFAULT ;
ALTER TABLE filtro_cla_rec_sec ALTER COLUMN numero_operador_com DROP DEFAULT ;
ALTER TABLE filtro_cla_rec_vin ALTER COLUMN version_filtro_cla_rec_vin DROP DEFAULT ;
ALTER TABLE filtro_cla_rec_vin ALTER COLUMN numero_operador_com DROP DEFAULT ;
ALTER TABLE filtro_funcion ALTER COLUMN version_filtro_funcion DROP DEFAULT ;
ALTER TABLE filtro_funcion ALTER COLUMN es_publico DROP DEFAULT ;
ALTER TABLE filtro_funcion_par ALTER COLUMN version_filtro_funcion_par DROP DEFAULT ;
ALTER TABLE filtro_funcion_par ALTER COLUMN numero_operador_com DROP DEFAULT ;
ALTER TABLE funcion ALTER COLUMN version_funcion DROP DEFAULT ;
ALTER TABLE funcion ALTER COLUMN numero_tipo_rastro_fun DROP DEFAULT ;
ALTER TABLE funcion ALTER COLUMN es_publica DROP DEFAULT ;
ALTER TABLE funcion ALTER COLUMN es_programatica DROP DEFAULT ;
ALTER TABLE funcion ALTER COLUMN es_personalizada DROP DEFAULT ;
ALTER TABLE funcion ALTER COLUMN es_segmentada DROP DEFAULT ;
ALTER TABLE funcion_parametro ALTER COLUMN version_funcion_parametro DROP DEFAULT ;
ALTER TABLE funcion_parametro ALTER COLUMN numero_tipo_valor DROP DEFAULT ;
ALTER TABLE funcion_parametro ALTER COLUMN es_parametro_sin_rastro DROP DEFAULT ;
ALTER TABLE funcion_parametro ALTER COLUMN es_parametro_segmento DROP DEFAULT ;
ALTER TABLE funcionario ALTER COLUMN version_funcionario DROP DEFAULT ;
ALTER TABLE grupo_aplicacion ALTER COLUMN version_grupo_aplicacion DROP DEFAULT ;
ALTER TABLE grupo_proceso ALTER COLUMN version_grupo_proceso DROP DEFAULT ;
ALTER TABLE informe ALTER COLUMN version_informe DROP DEFAULT ;
ALTER TABLE log_imp_cen ALTER COLUMN version_log_imp_cen DROP DEFAULT ;
ALTER TABLE log_imp_cen ALTER COLUMN es_importado DROP DEFAULT ;
ALTER TABLE log_imp_cen ALTER COLUMN fecha_hora_transaccion DROP DEFAULT ;
ALTER TABLE log_imp_deu ALTER COLUMN version_log_imp_deu DROP DEFAULT ;
ALTER TABLE log_imp_deu ALTER COLUMN es_importado DROP DEFAULT ;
ALTER TABLE log_imp_deu ALTER COLUMN fecha_hora_transaccion DROP DEFAULT ;
ALTER TABLE log_imp_emp ALTER COLUMN version_log_imp_emp DROP DEFAULT ;
ALTER TABLE log_imp_emp ALTER COLUMN es_importado DROP DEFAULT ;
ALTER TABLE log_imp_emp ALTER COLUMN fecha_hora_transaccion DROP DEFAULT ;
ALTER TABLE log_imp_fal ALTER COLUMN version_log_imp_fal DROP DEFAULT ;
ALTER TABLE log_imp_fal ALTER COLUMN es_importado DROP DEFAULT ;
ALTER TABLE log_imp_fal ALTER COLUMN fecha_hora_transaccion DROP DEFAULT ;
ALTER TABLE log_imp_hog ALTER COLUMN version_log_imp_hog DROP DEFAULT ;
ALTER TABLE log_imp_hog ALTER COLUMN es_importado DROP DEFAULT ;
ALTER TABLE log_imp_hog ALTER COLUMN fecha_hora_transaccion DROP DEFAULT ;
ALTER TABLE log_imp_hog_eec ALTER COLUMN version_log_imp_hog_eec DROP DEFAULT ;
ALTER TABLE log_imp_hog_eec ALTER COLUMN es_importado DROP DEFAULT ;
ALTER TABLE log_imp_hog_eec ALTER COLUMN fecha_hora_transaccion DROP DEFAULT ;
ALTER TABLE log_imp_ids ALTER COLUMN version_log_imp_ids DROP DEFAULT ;
ALTER TABLE log_imp_ids ALTER COLUMN es_importado DROP DEFAULT ;
ALTER TABLE log_imp_ids ALTER COLUMN fecha_hora_transaccion DROP DEFAULT ;
ALTER TABLE log_imp_jub ALTER COLUMN version_log_imp_jub DROP DEFAULT ;
ALTER TABLE log_imp_jub ALTER COLUMN es_importado DROP DEFAULT ;
ALTER TABLE log_imp_jub ALTER COLUMN fecha_hora_transaccion DROP DEFAULT ;
ALTER TABLE log_imp_pen ALTER COLUMN version_log_imp_pen DROP DEFAULT ;
ALTER TABLE log_imp_pen ALTER COLUMN es_importado DROP DEFAULT ;
ALTER TABLE log_imp_pen ALTER COLUMN fecha_hora_transaccion DROP DEFAULT ;
ALTER TABLE log_imp_per ALTER COLUMN version_log_imp_per DROP DEFAULT ;
ALTER TABLE log_imp_per ALTER COLUMN es_importado DROP DEFAULT ;
ALTER TABLE log_imp_per ALTER COLUMN fecha_hora_transaccion DROP DEFAULT ;
ALTER TABLE log_imp_per_eec ALTER COLUMN version_log_imp_per_eec DROP DEFAULT ;
ALTER TABLE log_imp_per_eec ALTER COLUMN es_importado DROP DEFAULT ;
ALTER TABLE log_imp_per_eec ALTER COLUMN fecha_hora_transaccion DROP DEFAULT ;
ALTER TABLE log_imp_pot ALTER COLUMN version_log_imp_pot DROP DEFAULT ;
ALTER TABLE log_imp_pot ALTER COLUMN es_importado DROP DEFAULT ;
ALTER TABLE log_imp_pot ALTER COLUMN fecha_hora_transaccion DROP DEFAULT ;
ALTER TABLE log_imp_sub ALTER COLUMN version_log_imp_sub DROP DEFAULT ;
ALTER TABLE log_imp_sub ALTER COLUMN es_importado DROP DEFAULT ;
ALTER TABLE log_imp_sub ALTER COLUMN fecha_hora_transaccion DROP DEFAULT ;
ALTER TABLE log_imp_ubi ALTER COLUMN version_log_imp_ubi DROP DEFAULT ;
ALTER TABLE log_imp_ubi ALTER COLUMN es_importado DROP DEFAULT ;
ALTER TABLE log_imp_ubi ALTER COLUMN fecha_hora_transaccion DROP DEFAULT ;
ALTER TABLE log_pro_acr_pot_ben ALTER COLUMN version_log_pro_acr_pot_ben DROP DEFAULT ;
ALTER TABLE log_pro_acr_pot_ben ALTER COLUMN fecha_registro_pot_ben DROP DEFAULT ;
ALTER TABLE log_pro_acr_pot_ben ALTER COLUMN es_procesado DROP DEFAULT ;
ALTER TABLE log_pro_acr_pot_ben ALTER COLUMN fecha_hora_transaccion DROP DEFAULT ;
ALTER TABLE log_pro_act_jupe ALTER COLUMN version_log_pro_act_jupe DROP DEFAULT ;
ALTER TABLE log_pro_act_jupe ALTER COLUMN es_procesado DROP DEFAULT ;
ALTER TABLE log_pro_act_jupe ALTER COLUMN fecha_hora_transaccion DROP DEFAULT ;
ALTER TABLE log_pro_den_pen_obj ALTER COLUMN version_log_pro_den_pen_obj DROP DEFAULT ;
ALTER TABLE log_pro_den_pen_obj ALTER COLUMN es_procesado DROP DEFAULT ;
ALTER TABLE log_pro_den_pen_obj ALTER COLUMN fecha_hora_transaccion DROP DEFAULT ;
ALTER TABLE log_pro_imp_arc_ext ALTER COLUMN version_log_pro_imp_arc_ext DROP DEFAULT ;
ALTER TABLE log_pro_imp_arc_ext ALTER COLUMN es_importado DROP DEFAULT ;
ALTER TABLE log_pro_imp_arc_ext ALTER COLUMN fecha_hora_transaccion DROP DEFAULT ;
ALTER TABLE log_pro_oto_pen_apr ALTER COLUMN version_log_pro_oto_pen_apr DROP DEFAULT ;
ALTER TABLE log_pro_oto_pen_apr ALTER COLUMN es_procesado DROP DEFAULT ;
ALTER TABLE log_pro_oto_pen_apr ALTER COLUMN fecha_hora_transaccion DROP DEFAULT ;
ALTER TABLE log_pro_pre_pro_pag ALTER COLUMN version_log_pro_pre_pro_pag DROP DEFAULT ;
ALTER TABLE log_pro_pre_pro_pag ALTER COLUMN fecha_solicitud_pension DROP DEFAULT ;
ALTER TABLE log_pro_pre_pro_pag ALTER COLUMN es_procesado DROP DEFAULT ;
ALTER TABLE log_pro_pre_pro_pag ALTER COLUMN fecha_hora_transaccion DROP DEFAULT ;
ALTER TABLE log_pro_ver_ele_pen ALTER COLUMN version_log_pro_ver_ele_pen DROP DEFAULT ;
ALTER TABLE log_pro_ver_ele_pen ALTER COLUMN es_procesado DROP DEFAULT ;
ALTER TABLE log_pro_ver_ele_pen ALTER COLUMN fecha_hora_transaccion DROP DEFAULT ;
ALTER TABLE mensaje ALTER COLUMN version_mensaje DROP DEFAULT ;
ALTER TABLE nivel_opcion_menu ALTER COLUMN digitos_nivel_opcion_menu DROP DEFAULT ;
ALTER TABLE nivel_ubicacion ALTER COLUMN digitos_nivel_ubicacion DROP DEFAULT ;
ALTER TABLE objecion_ele_pen ALTER COLUMN version_objecion_ele_pen DROP DEFAULT ;
ALTER TABLE objecion_ele_pen ALTER COLUMN es_objecion_ele_pen_inactiva DROP DEFAULT ;
ALTER TABLE opcion_menu ALTER COLUMN version_opcion_menu DROP DEFAULT ;
ALTER TABLE opcion_menu ALTER COLUMN es_opcion_menu_inactiva DROP DEFAULT ;
ALTER TABLE opcion_menu ALTER COLUMN es_opcion_menu_sincronizada DROP DEFAULT ;
ALTER TABLE opcion_menu_plus ALTER COLUMN version_opcion_menu DROP DEFAULT ;
ALTER TABLE opcion_sistema ALTER COLUMN version_opcion_sistema DROP DEFAULT ;
ALTER TABLE pagina ALTER COLUMN version_pagina DROP DEFAULT ;
ALTER TABLE pagina ALTER COLUMN es_publica DROP DEFAULT ;
ALTER TABLE pagina_funcion ALTER COLUMN version_pagina_funcion DROP DEFAULT ;
ALTER TABLE pagina_funcion ALTER COLUMN es_funcion_inicial DROP DEFAULT ;
ALTER TABLE pagina_usuario ALTER COLUMN version_pagina_usuario DROP DEFAULT ;
ALTER TABLE paquete ALTER COLUMN version_paquete DROP DEFAULT ;
ALTER TABLE parametro ALTER COLUMN version_parametro DROP DEFAULT ;
ALTER TABLE parametro_global ALTER COLUMN es_control_cer_vida_activo DROP DEFAULT ;
ALTER TABLE parametro_global ALTER COLUMN es_control_cobro_pension_activ DROP DEFAULT ;
ALTER TABLE parametro_global ALTER COLUMN es_control_reproceso_pen_activ DROP DEFAULT ;
ALTER TABLE parametro_global ALTER COLUMN limite_pensiones DROP DEFAULT ;
ALTER TABLE persona ALTER COLUMN version_persona DROP DEFAULT ;
ALTER TABLE persona ALTER COLUMN es_paraguayo_natural DROP DEFAULT ;
ALTER TABLE persona ALTER COLUMN es_indigena DROP DEFAULT ;
ALTER TABLE persona ALTER COLUMN es_certificado_vida_anulado DROP DEFAULT ;
ALTER TABLE persona ALTER COLUMN es_cer_defuncion_anulado DROP DEFAULT ;
ALTER TABLE persona ALTER COLUMN es_persona_con_empleo DROP DEFAULT ;
ALTER TABLE persona ALTER COLUMN es_persona_con_jubilacion DROP DEFAULT ;
ALTER TABLE persona ALTER COLUMN es_persona_con_pension DROP DEFAULT ;
ALTER TABLE persona ALTER COLUMN es_persona_con_subsidio DROP DEFAULT ;
ALTER TABLE persona ALTER COLUMN es_persona_con_deuda DROP DEFAULT ;
ALTER TABLE persona ALTER COLUMN es_persona_con_pena_judicial DROP DEFAULT ;
ALTER TABLE persona ALTER COLUMN es_persona_con_cer_vida DROP DEFAULT ;
ALTER TABLE persona ALTER COLUMN es_persona_con_carta_renuncia DROP DEFAULT ;
ALTER TABLE persona ALTER COLUMN es_persona_elegible_para_pen DROP DEFAULT ;
ALTER TABLE persona ALTER COLUMN es_persona_acreditada_para_pen DROP DEFAULT ;
ALTER TABLE persona ALTER COLUMN es_persona_con_copia_cedula DROP DEFAULT ;
ALTER TABLE persona ALTER COLUMN es_persona_con_declaracion_jur DROP DEFAULT ;
ALTER TABLE persona_anotada ALTER COLUMN version_persona_anotada DROP DEFAULT ;
ALTER TABLE potencial_ben ALTER COLUMN version_potencial_ben DROP DEFAULT ;
ALTER TABLE potencial_ben ALTER COLUMN es_paraguayo_natural DROP DEFAULT ;
ALTER TABLE potencial_ben ALTER COLUMN es_indigena DROP DEFAULT ;
ALTER TABLE potencial_ben ALTER COLUMN es_persona_con_empleo DROP DEFAULT ;
ALTER TABLE potencial_ben ALTER COLUMN es_persona_con_jubilacion DROP DEFAULT ;
ALTER TABLE potencial_ben ALTER COLUMN es_persona_con_pension DROP DEFAULT ;
ALTER TABLE potencial_ben ALTER COLUMN es_persona_con_subsidio DROP DEFAULT ;
ALTER TABLE potencial_ben ALTER COLUMN es_persona_con_deuda DROP DEFAULT ;
ALTER TABLE potencial_ben ALTER COLUMN es_persona_con_pena_judicial DROP DEFAULT ;
ALTER TABLE potencial_ben ALTER COLUMN es_persona_con_cer_vida DROP DEFAULT ;
ALTER TABLE potencial_ben ALTER COLUMN es_persona_con_carta_renuncia DROP DEFAULT ;
ALTER TABLE potencial_ben ALTER COLUMN fecha_registro_pot_ben DROP DEFAULT ;
ALTER TABLE potencial_ben ALTER COLUMN es_potencial_ben_inactivo DROP DEFAULT ;
ALTER TABLE potencial_ben ALTER COLUMN es_potencial_ben_migrado DROP DEFAULT ;
ALTER TABLE proceso ALTER COLUMN version_proceso DROP DEFAULT ;
ALTER TABLE proveedor_dat_ext ALTER COLUMN version_proveedor_dat_ext DROP DEFAULT ;
ALTER TABLE rastro_funcion ALTER COLUMN fecha_hora_ejecucion DROP DEFAULT ;
ALTER TABLE rastro_informe ALTER COLUMN version_rastro_informe DROP DEFAULT ;
ALTER TABLE rastro_informe ALTER COLUMN fecha_hora_inicio_ejecucion DROP DEFAULT ;
ALTER TABLE rastro_informe ALTER COLUMN numero_condicion_eje_fun DROP DEFAULT ;
ALTER TABLE rastro_proceso ALTER COLUMN version_rastro_proceso DROP DEFAULT ;
ALTER TABLE rastro_proceso ALTER COLUMN fecha_hora_inicio_ejecucion DROP DEFAULT ;
ALTER TABLE rastro_proceso ALTER COLUMN numero_condicion_eje_fun DROP DEFAULT ;
ALTER TABLE rastro_proceso ALTER COLUMN subprocesos DROP DEFAULT ;
ALTER TABLE rastro_proceso ALTER COLUMN subprocesos_pendientes DROP DEFAULT ;
ALTER TABLE rastro_proceso ALTER COLUMN subprocesos_en_progreso DROP DEFAULT ;
ALTER TABLE rastro_proceso ALTER COLUMN subprocesos_sin_errores DROP DEFAULT ;
ALTER TABLE rastro_proceso ALTER COLUMN subprocesos_con_errores DROP DEFAULT ;
ALTER TABLE rastro_proceso ALTER COLUMN subprocesos_cancelados DROP DEFAULT ;
ALTER TABLE recurso ALTER COLUMN version_recurso DROP DEFAULT ;
ALTER TABLE recurso ALTER COLUMN es_recurso_inactivo DROP DEFAULT ;
ALTER TABLE rol ALTER COLUMN version_rol DROP DEFAULT ;
ALTER TABLE rol_aplicacion ALTER COLUMN version_rol_aplicacion DROP DEFAULT ;
ALTER TABLE rol_filtro_funcion ALTER COLUMN version_rol_filtro_funcion DROP DEFAULT ;
ALTER TABLE rol_funcion ALTER COLUMN version_rol_funcion DROP DEFAULT ;
ALTER TABLE rol_pagina ALTER COLUMN version_rol_pagina DROP DEFAULT ;
ALTER TABLE rol_usuario ALTER COLUMN version_rol_usuario DROP DEFAULT ;
ALTER TABLE ubicacion ALTER COLUMN version_ubicacion DROP DEFAULT ;
ALTER TABLE ubicacion_plus ALTER COLUMN version_ubicacion DROP DEFAULT ;
ALTER TABLE usuario ALTER COLUMN version_usuario DROP DEFAULT ;
ALTER TABLE usuario ALTER COLUMN es_super_usuario DROP DEFAULT ;
ALTER TABLE usuario ALTER COLUMN es_usuario_especial DROP DEFAULT ;
ALTER TABLE usuario ALTER COLUMN es_usuario_inactivo DROP DEFAULT ;
ALTER TABLE usuario ALTER COLUMN es_usuario_modificado DROP DEFAULT ;
ALTER TABLE visita_censo ALTER COLUMN version_visita_censo DROP DEFAULT ;
