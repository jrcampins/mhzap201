ALTER TABLE aplicacion MODIFY (version_aplicacion DEFAULT (0));
ALTER TABLE aplicacion MODIFY (es_publica DEFAULT (0));
ALTER TABLE archivo_datos_ext MODIFY (version_archivo_datos_ext DEFAULT (0));
ALTER TABLE archivo_datos_ext MODIFY (es_archivo_datos_ext_importado DEFAULT (0));
ALTER TABLE archivo_datos_ext MODIFY (es_archivo_datos_ext_inactivo DEFAULT (0));
ALTER TABLE clase_recurso MODIFY (version_clase_recurso DEFAULT (0));
ALTER TABLE clase_recurso MODIFY (es_clase_recurso_independiente DEFAULT (0));
ALTER TABLE clase_recurso MODIFY (es_clase_recurso_sin_detalle DEFAULT (0));
ALTER TABLE clase_recurso MODIFY (es_clase_recurso_con_arbol DEFAULT (0));
ALTER TABLE clase_recurso MODIFY (numero_tipo_clase_recurso DEFAULT (1));
ALTER TABLE clase_recurso MODIFY (es_clase_recurso_insertable DEFAULT (1));
ALTER TABLE clase_recurso MODIFY (es_clase_recurso_modificable DEFAULT (1));
ALTER TABLE clase_recurso MODIFY (es_clase_recurso_eliminable DEFAULT (1));
ALTER TABLE clase_recurso MODIFY (es_clase_recurso_extendida DEFAULT (0));
ALTER TABLE clase_recurso MODIFY (es_enumerador_con_numero DEFAULT (0));
ALTER TABLE clase_recurso_par MODIFY (version_clase_recurso_par DEFAULT (0));
ALTER TABLE clase_recurso_par MODIFY (numero_tipo_valor DEFAULT (11));
ALTER TABLE clase_recurso_par MODIFY (es_parametro_omisible DEFAULT (0));
ALTER TABLE clase_recurso_par MODIFY (es_parametro_inmutable DEFAULT (0));
ALTER TABLE clase_recurso_par MODIFY (es_parametro_submit DEFAULT (0));
ALTER TABLE clase_recurso_par MODIFY (es_parametro_primordial DEFAULT (0));
ALTER TABLE clase_recurso_par MODIFY (es_parametro_maestro DEFAULT (0));
ALTER TABLE clase_recurso_par MODIFY (es_parametro_segmento DEFAULT (0));
ALTER TABLE clase_recurso_par MODIFY (es_parametro_sin_rastro DEFAULT (0));
ALTER TABLE clase_recurso_par MODIFY (es_parametro_sincronizado DEFAULT (0));
ALTER TABLE clase_recurso_par MODIFY (orden_presentacion DEFAULT (0));
ALTER TABLE clase_recurso_par MODIFY (es_referencia_alternativa DEFAULT (0));
ALTER TABLE clase_recurso_par MODIFY (orden_pagina_seleccion DEFAULT (0));
ALTER TABLE clase_recurso_sec MODIFY (version_clase_recurso_sec DEFAULT (0));
ALTER TABLE clase_recurso_sec MODIFY (orden_presentacion DEFAULT (0));
ALTER TABLE clase_recurso_sec MODIFY (es_pestana_detalle DEFAULT (1));
ALTER TABLE conjunto_segmento MODIFY (version_conjunto_segmento DEFAULT (0));
ALTER TABLE dominio MODIFY (version_dominio DEFAULT (0));
ALTER TABLE dominio_paquete MODIFY (version_dominio_paquete DEFAULT (0));
ALTER TABLE dominio_parametro MODIFY (version_dominio_parametro DEFAULT (0));
ALTER TABLE elemento_segmento MODIFY (version_elemento_segmento DEFAULT (0));
ALTER TABLE etnia_indigena MODIFY (version_etnia_indigena DEFAULT (0));
ALTER TABLE ficha_hogar MODIFY (version_ficha_hogar DEFAULT (0));
ALTER TABLE ficha_hogar MODIFY (es_ficha_hogar_inactiva DEFAULT (0));
ALTER TABLE ficha_persona MODIFY (version_ficha_persona DEFAULT (0));
ALTER TABLE ficha_persona MODIFY (es_respondente DEFAULT (0));
ALTER TABLE ficha_persona MODIFY (numero_siono_miembro_hogar DEFAULT (1));
ALTER TABLE ficha_persona MODIFY (es_ficha_persona_inactiva DEFAULT (0));
ALTER TABLE filtro_cla_rec_fun MODIFY (version_filtro_cla_rec_fun DEFAULT (0));
ALTER TABLE filtro_cla_rec_fun MODIFY (numero_operador_com DEFAULT (11));
ALTER TABLE filtro_cla_rec_par MODIFY (version_filtro_cla_rec_par DEFAULT (0));
ALTER TABLE filtro_cla_rec_par MODIFY (numero_operador_com DEFAULT (11));
ALTER TABLE filtro_cla_rec_sec MODIFY (version_filtro_cla_rec_sec DEFAULT (0));
ALTER TABLE filtro_cla_rec_sec MODIFY (numero_operador_com DEFAULT (11));
ALTER TABLE filtro_cla_rec_vin MODIFY (version_filtro_cla_rec_vin DEFAULT (0));
ALTER TABLE filtro_cla_rec_vin MODIFY (numero_operador_com DEFAULT (11));
ALTER TABLE filtro_funcion MODIFY (version_filtro_funcion DEFAULT (0));
ALTER TABLE filtro_funcion MODIFY (es_publico DEFAULT (0));
ALTER TABLE filtro_funcion_par MODIFY (version_filtro_funcion_par DEFAULT (0));
ALTER TABLE filtro_funcion_par MODIFY (numero_operador_com DEFAULT (11));
ALTER TABLE funcion MODIFY (version_funcion DEFAULT (0));
ALTER TABLE funcion MODIFY (numero_tipo_rastro_fun DEFAULT (0));
ALTER TABLE funcion MODIFY (es_publica DEFAULT (0));
ALTER TABLE funcion MODIFY (es_programatica DEFAULT (0));
ALTER TABLE funcion MODIFY (es_personalizada DEFAULT (0));
ALTER TABLE funcion MODIFY (es_segmentada DEFAULT (0));
ALTER TABLE funcion_parametro MODIFY (version_funcion_parametro DEFAULT (0));
ALTER TABLE funcion_parametro MODIFY (numero_tipo_valor DEFAULT (11));
ALTER TABLE funcion_parametro MODIFY (es_parametro_sin_rastro DEFAULT (0));
ALTER TABLE funcion_parametro MODIFY (es_parametro_segmento DEFAULT (0));
ALTER TABLE funcionario MODIFY (version_funcionario DEFAULT (0));
ALTER TABLE grupo_aplicacion MODIFY (version_grupo_aplicacion DEFAULT (0));
ALTER TABLE grupo_proceso MODIFY (version_grupo_proceso DEFAULT (0));
ALTER TABLE informe MODIFY (version_informe DEFAULT (0));
ALTER TABLE log_imp_cen MODIFY (version_log_imp_cen DEFAULT (0));
ALTER TABLE log_imp_cen MODIFY (es_importado DEFAULT (0));
ALTER TABLE log_imp_cen MODIFY (fecha_hora_transaccion DEFAULT (current_timestamp));
ALTER TABLE log_imp_deu MODIFY (version_log_imp_deu DEFAULT (0));
ALTER TABLE log_imp_deu MODIFY (es_importado DEFAULT (0));
ALTER TABLE log_imp_deu MODIFY (fecha_hora_transaccion DEFAULT (current_timestamp));
ALTER TABLE log_imp_emp MODIFY (version_log_imp_emp DEFAULT (0));
ALTER TABLE log_imp_emp MODIFY (es_importado DEFAULT (0));
ALTER TABLE log_imp_emp MODIFY (fecha_hora_transaccion DEFAULT (current_timestamp));
ALTER TABLE log_imp_fal MODIFY (version_log_imp_fal DEFAULT (0));
ALTER TABLE log_imp_fal MODIFY (es_importado DEFAULT (0));
ALTER TABLE log_imp_fal MODIFY (fecha_hora_transaccion DEFAULT (current_timestamp));
ALTER TABLE log_imp_hog MODIFY (version_log_imp_hog DEFAULT (0));
ALTER TABLE log_imp_hog MODIFY (es_importado DEFAULT (0));
ALTER TABLE log_imp_hog MODIFY (fecha_hora_transaccion DEFAULT (current_timestamp));
ALTER TABLE log_imp_hog_eec MODIFY (version_log_imp_hog_eec DEFAULT (0));
ALTER TABLE log_imp_hog_eec MODIFY (es_importado DEFAULT (0));
ALTER TABLE log_imp_hog_eec MODIFY (fecha_hora_transaccion DEFAULT (current_timestamp));
ALTER TABLE log_imp_ids MODIFY (version_log_imp_ids DEFAULT (0));
ALTER TABLE log_imp_ids MODIFY (es_importado DEFAULT (0));
ALTER TABLE log_imp_ids MODIFY (fecha_hora_transaccion DEFAULT (current_timestamp));
ALTER TABLE log_imp_jub MODIFY (version_log_imp_jub DEFAULT (0));
ALTER TABLE log_imp_jub MODIFY (es_importado DEFAULT (0));
ALTER TABLE log_imp_jub MODIFY (fecha_hora_transaccion DEFAULT (current_timestamp));
ALTER TABLE log_imp_pen MODIFY (version_log_imp_pen DEFAULT (0));
ALTER TABLE log_imp_pen MODIFY (es_importado DEFAULT (0));
ALTER TABLE log_imp_pen MODIFY (fecha_hora_transaccion DEFAULT (current_timestamp));
ALTER TABLE log_imp_per MODIFY (version_log_imp_per DEFAULT (0));
ALTER TABLE log_imp_per MODIFY (es_importado DEFAULT (0));
ALTER TABLE log_imp_per MODIFY (fecha_hora_transaccion DEFAULT (current_timestamp));
ALTER TABLE log_imp_per_eec MODIFY (version_log_imp_per_eec DEFAULT (0));
ALTER TABLE log_imp_per_eec MODIFY (es_importado DEFAULT (0));
ALTER TABLE log_imp_per_eec MODIFY (fecha_hora_transaccion DEFAULT (current_timestamp));
ALTER TABLE log_imp_pot MODIFY (version_log_imp_pot DEFAULT (0));
ALTER TABLE log_imp_pot MODIFY (es_importado DEFAULT (0));
ALTER TABLE log_imp_pot MODIFY (fecha_hora_transaccion DEFAULT (current_timestamp));
ALTER TABLE log_imp_sub MODIFY (version_log_imp_sub DEFAULT (0));
ALTER TABLE log_imp_sub MODIFY (es_importado DEFAULT (0));
ALTER TABLE log_imp_sub MODIFY (fecha_hora_transaccion DEFAULT (current_timestamp));
ALTER TABLE log_imp_ubi MODIFY (version_log_imp_ubi DEFAULT (0));
ALTER TABLE log_imp_ubi MODIFY (es_importado DEFAULT (0));
ALTER TABLE log_imp_ubi MODIFY (fecha_hora_transaccion DEFAULT (current_timestamp));
ALTER TABLE log_pro_acr_pot_ben MODIFY (version_log_pro_acr_pot_ben DEFAULT (0));
ALTER TABLE log_pro_acr_pot_ben MODIFY (fecha_registro_pot_ben DEFAULT (current_date));
ALTER TABLE log_pro_acr_pot_ben MODIFY (es_procesado DEFAULT (0));
ALTER TABLE log_pro_acr_pot_ben MODIFY (fecha_hora_transaccion DEFAULT (current_timestamp));
ALTER TABLE log_pro_act_jupe MODIFY (version_log_pro_act_jupe DEFAULT (0));
ALTER TABLE log_pro_act_jupe MODIFY (es_procesado DEFAULT (0));
ALTER TABLE log_pro_act_jupe MODIFY (fecha_hora_transaccion DEFAULT (current_timestamp));
ALTER TABLE log_pro_den_pen_obj MODIFY (version_log_pro_den_pen_obj DEFAULT (0));
ALTER TABLE log_pro_den_pen_obj MODIFY (es_procesado DEFAULT (0));
ALTER TABLE log_pro_den_pen_obj MODIFY (fecha_hora_transaccion DEFAULT (current_timestamp));
ALTER TABLE log_pro_imp_arc_ext MODIFY (version_log_pro_imp_arc_ext DEFAULT (0));
ALTER TABLE log_pro_imp_arc_ext MODIFY (es_importado DEFAULT (0));
ALTER TABLE log_pro_imp_arc_ext MODIFY (fecha_hora_transaccion DEFAULT (current_timestamp));
ALTER TABLE log_pro_oto_pen_apr MODIFY (version_log_pro_oto_pen_apr DEFAULT (0));
ALTER TABLE log_pro_oto_pen_apr MODIFY (es_procesado DEFAULT (0));
ALTER TABLE log_pro_oto_pen_apr MODIFY (fecha_hora_transaccion DEFAULT (current_timestamp));
ALTER TABLE log_pro_pre_pro_pag MODIFY (version_log_pro_pre_pro_pag DEFAULT (0));
ALTER TABLE log_pro_pre_pro_pag MODIFY (fecha_solicitud_pension DEFAULT (current_date));
ALTER TABLE log_pro_pre_pro_pag MODIFY (es_procesado DEFAULT (0));
ALTER TABLE log_pro_pre_pro_pag MODIFY (fecha_hora_transaccion DEFAULT (current_timestamp));
ALTER TABLE log_pro_ver_ele_pen MODIFY (version_log_pro_ver_ele_pen DEFAULT (0));
ALTER TABLE log_pro_ver_ele_pen MODIFY (es_procesado DEFAULT (0));
ALTER TABLE log_pro_ver_ele_pen MODIFY (fecha_hora_transaccion DEFAULT (current_timestamp));
ALTER TABLE mensaje MODIFY (version_mensaje DEFAULT (0));
ALTER TABLE nivel_opcion_menu MODIFY (digitos_nivel_opcion_menu DEFAULT (2));
ALTER TABLE nivel_ubicacion MODIFY (digitos_nivel_ubicacion DEFAULT (2));
ALTER TABLE objecion_ele_pen MODIFY (version_objecion_ele_pen DEFAULT (0));
ALTER TABLE objecion_ele_pen MODIFY (es_objecion_ele_pen_inactiva DEFAULT (0));
ALTER TABLE opcion_menu MODIFY (version_opcion_menu DEFAULT (0));
ALTER TABLE opcion_menu MODIFY (es_opcion_menu_inactiva DEFAULT (0));
ALTER TABLE opcion_menu MODIFY (es_opcion_menu_sincronizada DEFAULT (0));
ALTER TABLE opcion_menu_plus MODIFY (version_opcion_menu DEFAULT (0));
ALTER TABLE opcion_sistema MODIFY (version_opcion_sistema DEFAULT (0));
ALTER TABLE pagina MODIFY (version_pagina DEFAULT (0));
ALTER TABLE pagina MODIFY (es_publica DEFAULT (0));
ALTER TABLE pagina_funcion MODIFY (version_pagina_funcion DEFAULT (0));
ALTER TABLE pagina_funcion MODIFY (es_funcion_inicial DEFAULT (0));
ALTER TABLE pagina_usuario MODIFY (version_pagina_usuario DEFAULT (0));
ALTER TABLE paquete MODIFY (version_paquete DEFAULT (0));
ALTER TABLE parametro MODIFY (version_parametro DEFAULT (0));
ALTER TABLE parametro_global MODIFY (es_control_cer_vida_activo DEFAULT (0));
ALTER TABLE parametro_global MODIFY (es_control_cobro_pension_activ DEFAULT (0));
ALTER TABLE parametro_global MODIFY (es_control_reproceso_pen_activ DEFAULT (0));
ALTER TABLE parametro_global MODIFY (limite_pensiones DEFAULT (0));
ALTER TABLE persona MODIFY (version_persona DEFAULT (0));
ALTER TABLE persona MODIFY (es_paraguayo_natural DEFAULT (1));
ALTER TABLE persona MODIFY (es_indigena DEFAULT (0));
ALTER TABLE persona MODIFY (es_certificado_vida_anulado DEFAULT (0));
ALTER TABLE persona MODIFY (es_cer_defuncion_anulado DEFAULT (0));
ALTER TABLE persona MODIFY (es_persona_con_empleo DEFAULT (0));
ALTER TABLE persona MODIFY (es_persona_con_jubilacion DEFAULT (0));
ALTER TABLE persona MODIFY (es_persona_con_pension DEFAULT (0));
ALTER TABLE persona MODIFY (es_persona_con_subsidio DEFAULT (0));
ALTER TABLE persona MODIFY (es_persona_con_deuda DEFAULT (0));
ALTER TABLE persona MODIFY (es_persona_con_pena_judicial DEFAULT (0));
ALTER TABLE persona MODIFY (es_persona_con_cer_vida DEFAULT (0));
ALTER TABLE persona MODIFY (es_persona_con_carta_renuncia DEFAULT (0));
ALTER TABLE persona MODIFY (es_persona_elegible_para_pen DEFAULT (0));
ALTER TABLE persona MODIFY (es_persona_acreditada_para_pen DEFAULT (0));
ALTER TABLE persona MODIFY (es_persona_con_copia_cedula DEFAULT (0));
ALTER TABLE persona MODIFY (es_persona_con_declaracion_jur DEFAULT (0));
ALTER TABLE potencial_ben MODIFY (version_potencial_ben DEFAULT (0));
ALTER TABLE potencial_ben MODIFY (es_paraguayo_natural DEFAULT (1));
ALTER TABLE potencial_ben MODIFY (es_indigena DEFAULT (0));
ALTER TABLE potencial_ben MODIFY (es_persona_con_empleo DEFAULT (0));
ALTER TABLE potencial_ben MODIFY (es_persona_con_jubilacion DEFAULT (0));
ALTER TABLE potencial_ben MODIFY (es_persona_con_pension DEFAULT (0));
ALTER TABLE potencial_ben MODIFY (es_persona_con_subsidio DEFAULT (0));
ALTER TABLE potencial_ben MODIFY (es_persona_con_deuda DEFAULT (0));
ALTER TABLE potencial_ben MODIFY (es_persona_con_pena_judicial DEFAULT (0));
ALTER TABLE potencial_ben MODIFY (es_persona_con_cer_vida DEFAULT (0));
ALTER TABLE potencial_ben MODIFY (es_persona_con_carta_renuncia DEFAULT (0));
ALTER TABLE potencial_ben MODIFY (fecha_registro_pot_ben DEFAULT (current_date));
ALTER TABLE potencial_ben MODIFY (es_potencial_ben_inactivo DEFAULT (0));
ALTER TABLE potencial_ben MODIFY (es_potencial_ben_migrado DEFAULT (0));
ALTER TABLE proceso MODIFY (version_proceso DEFAULT (0));
ALTER TABLE proveedor_dat_ext MODIFY (version_proveedor_dat_ext DEFAULT (0));
ALTER TABLE rastro_funcion MODIFY (fecha_hora_ejecucion DEFAULT (current_timestamp));
ALTER TABLE rastro_informe MODIFY (version_rastro_informe DEFAULT (0));
ALTER TABLE rastro_informe MODIFY (fecha_hora_inicio_ejecucion DEFAULT (current_timestamp));
ALTER TABLE rastro_informe MODIFY (numero_condicion_eje_fun DEFAULT (11));
ALTER TABLE rastro_proceso MODIFY (version_rastro_proceso DEFAULT (0));
ALTER TABLE rastro_proceso MODIFY (fecha_hora_inicio_ejecucion DEFAULT (current_timestamp));
ALTER TABLE rastro_proceso MODIFY (numero_condicion_eje_fun DEFAULT (11));
ALTER TABLE rastro_proceso MODIFY (subprocesos DEFAULT (0));
ALTER TABLE rastro_proceso MODIFY (subprocesos_pendientes DEFAULT (0));
ALTER TABLE rastro_proceso MODIFY (subprocesos_en_progreso DEFAULT (0));
ALTER TABLE rastro_proceso MODIFY (subprocesos_sin_errores DEFAULT (0));
ALTER TABLE rastro_proceso MODIFY (subprocesos_con_errores DEFAULT (0));
ALTER TABLE rastro_proceso MODIFY (subprocesos_cancelados DEFAULT (0));
ALTER TABLE recurso MODIFY (version_recurso DEFAULT (0));
ALTER TABLE recurso MODIFY (es_recurso_inactivo DEFAULT (0));
ALTER TABLE rol MODIFY (version_rol DEFAULT (0));
ALTER TABLE rol_aplicacion MODIFY (version_rol_aplicacion DEFAULT (0));
ALTER TABLE rol_filtro_funcion MODIFY (version_rol_filtro_funcion DEFAULT (0));
ALTER TABLE rol_funcion MODIFY (version_rol_funcion DEFAULT (0));
ALTER TABLE rol_pagina MODIFY (version_rol_pagina DEFAULT (0));
ALTER TABLE rol_usuario MODIFY (version_rol_usuario DEFAULT (0));
ALTER TABLE ubicacion MODIFY (version_ubicacion DEFAULT (0));
ALTER TABLE ubicacion_plus MODIFY (version_ubicacion DEFAULT (0));
ALTER TABLE usuario MODIFY (version_usuario DEFAULT (0));
ALTER TABLE usuario MODIFY (es_super_usuario DEFAULT (0));
ALTER TABLE usuario MODIFY (es_usuario_especial DEFAULT (0));
ALTER TABLE usuario MODIFY (es_usuario_inactivo DEFAULT (0));
ALTER TABLE usuario MODIFY (es_usuario_modificado DEFAULT (0));
ALTER TABLE visita_censo MODIFY (version_visita_censo DEFAULT (0));
