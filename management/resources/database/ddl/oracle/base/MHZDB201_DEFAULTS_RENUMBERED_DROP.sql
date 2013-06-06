ALTER TABLE aplicacion MODIFY (version_aplicacion DEFAULT NULL);
ALTER TABLE aplicacion MODIFY (es_publica DEFAULT NULL);
ALTER TABLE archivo_datos_ext MODIFY (version_archivo_datos_ext DEFAULT NULL);
ALTER TABLE archivo_datos_ext MODIFY (es_archivo_datos_ext_importado DEFAULT NULL);
ALTER TABLE archivo_datos_ext MODIFY (es_archivo_datos_ext_inactivo DEFAULT NULL);
ALTER TABLE clase_recurso MODIFY (version_clase_recurso DEFAULT NULL);
ALTER TABLE clase_recurso MODIFY (es_clase_recurso_independiente DEFAULT NULL);
ALTER TABLE clase_recurso MODIFY (es_clase_recurso_sin_detalle DEFAULT NULL);
ALTER TABLE clase_recurso MODIFY (es_clase_recurso_con_arbol DEFAULT NULL);
ALTER TABLE clase_recurso MODIFY (numero_tipo_clase_recurso DEFAULT NULL);
ALTER TABLE clase_recurso MODIFY (es_clase_recurso_insertable DEFAULT NULL);
ALTER TABLE clase_recurso MODIFY (es_clase_recurso_modificable DEFAULT NULL);
ALTER TABLE clase_recurso MODIFY (es_clase_recurso_eliminable DEFAULT NULL);
ALTER TABLE clase_recurso MODIFY (es_clase_recurso_extendida DEFAULT NULL);
ALTER TABLE clase_recurso MODIFY (es_enumerador_con_numero DEFAULT NULL);
ALTER TABLE clase_recurso_par MODIFY (version_clase_recurso_par DEFAULT NULL);
ALTER TABLE clase_recurso_par MODIFY (numero_tipo_valor DEFAULT NULL);
ALTER TABLE clase_recurso_par MODIFY (es_parametro_omisible DEFAULT NULL);
ALTER TABLE clase_recurso_par MODIFY (es_parametro_inmutable DEFAULT NULL);
ALTER TABLE clase_recurso_par MODIFY (es_parametro_submit DEFAULT NULL);
ALTER TABLE clase_recurso_par MODIFY (es_parametro_primordial DEFAULT NULL);
ALTER TABLE clase_recurso_par MODIFY (es_parametro_maestro DEFAULT NULL);
ALTER TABLE clase_recurso_par MODIFY (es_parametro_segmento DEFAULT NULL);
ALTER TABLE clase_recurso_par MODIFY (es_parametro_sin_rastro DEFAULT NULL);
ALTER TABLE clase_recurso_par MODIFY (es_parametro_sincronizado DEFAULT NULL);
ALTER TABLE clase_recurso_par MODIFY (orden_presentacion DEFAULT NULL);
ALTER TABLE clase_recurso_par MODIFY (es_referencia_alternativa DEFAULT NULL);
ALTER TABLE clase_recurso_par MODIFY (orden_pagina_seleccion DEFAULT NULL);
ALTER TABLE clase_recurso_sec MODIFY (version_clase_recurso_sec DEFAULT NULL);
ALTER TABLE clase_recurso_sec MODIFY (orden_presentacion DEFAULT NULL);
ALTER TABLE clase_recurso_sec MODIFY (es_pestana_detalle DEFAULT NULL);
ALTER TABLE conjunto_segmento MODIFY (version_conjunto_segmento DEFAULT NULL);
ALTER TABLE dominio MODIFY (version_dominio DEFAULT NULL);
ALTER TABLE dominio_paquete MODIFY (version_dominio_paquete DEFAULT NULL);
ALTER TABLE dominio_parametro MODIFY (version_dominio_parametro DEFAULT NULL);
ALTER TABLE elemento_segmento MODIFY (version_elemento_segmento DEFAULT NULL);
ALTER TABLE etnia_indigena MODIFY (version_etnia_indigena DEFAULT NULL);
ALTER TABLE ficha_hogar MODIFY (version_ficha_hogar DEFAULT NULL);
ALTER TABLE ficha_hogar MODIFY (es_ficha_hogar_inactiva DEFAULT NULL);
ALTER TABLE ficha_persona MODIFY (version_ficha_persona DEFAULT NULL);
ALTER TABLE ficha_persona MODIFY (es_respondente DEFAULT NULL);
ALTER TABLE ficha_persona MODIFY (numero_siono_miembro_hogar DEFAULT NULL);
ALTER TABLE ficha_persona MODIFY (es_ficha_persona_inactiva DEFAULT NULL);
ALTER TABLE ficha_persona MODIFY (es_ficha_persona_importada DEFAULT NULL);
ALTER TABLE filtro_cla_rec_fun MODIFY (version_filtro_cla_rec_fun DEFAULT NULL);
ALTER TABLE filtro_cla_rec_fun MODIFY (numero_operador_com DEFAULT NULL);
ALTER TABLE filtro_cla_rec_par MODIFY (version_filtro_cla_rec_par DEFAULT NULL);
ALTER TABLE filtro_cla_rec_par MODIFY (numero_operador_com DEFAULT NULL);
ALTER TABLE filtro_cla_rec_sec MODIFY (version_filtro_cla_rec_sec DEFAULT NULL);
ALTER TABLE filtro_cla_rec_sec MODIFY (numero_operador_com DEFAULT NULL);
ALTER TABLE filtro_cla_rec_vin MODIFY (version_filtro_cla_rec_vin DEFAULT NULL);
ALTER TABLE filtro_cla_rec_vin MODIFY (numero_operador_com DEFAULT NULL);
ALTER TABLE filtro_funcion MODIFY (version_filtro_funcion DEFAULT NULL);
ALTER TABLE filtro_funcion MODIFY (es_publico DEFAULT NULL);
ALTER TABLE filtro_funcion_par MODIFY (version_filtro_funcion_par DEFAULT NULL);
ALTER TABLE filtro_funcion_par MODIFY (numero_operador_com DEFAULT NULL);
ALTER TABLE funcion MODIFY (version_funcion DEFAULT NULL);
ALTER TABLE funcion MODIFY (numero_tipo_rastro_fun DEFAULT NULL);
ALTER TABLE funcion MODIFY (es_publica DEFAULT NULL);
ALTER TABLE funcion MODIFY (es_programatica DEFAULT NULL);
ALTER TABLE funcion MODIFY (es_personalizada DEFAULT NULL);
ALTER TABLE funcion MODIFY (es_segmentada DEFAULT NULL);
ALTER TABLE funcion_parametro MODIFY (version_funcion_parametro DEFAULT NULL);
ALTER TABLE funcion_parametro MODIFY (numero_tipo_valor DEFAULT NULL);
ALTER TABLE funcion_parametro MODIFY (es_parametro_sin_rastro DEFAULT NULL);
ALTER TABLE funcion_parametro MODIFY (es_parametro_segmento DEFAULT NULL);
ALTER TABLE funcionario MODIFY (version_funcionario DEFAULT NULL);
ALTER TABLE grupo_aplicacion MODIFY (version_grupo_aplicacion DEFAULT NULL);
ALTER TABLE grupo_proceso MODIFY (version_grupo_proceso DEFAULT NULL);
ALTER TABLE informe MODIFY (version_informe DEFAULT NULL);
ALTER TABLE log_imp_cen MODIFY (version_log_imp_cen DEFAULT NULL);
ALTER TABLE log_imp_cen MODIFY (es_importado DEFAULT NULL);
ALTER TABLE log_imp_cen MODIFY (fecha_hora_transaccion DEFAULT NULL);
ALTER TABLE log_imp_deu MODIFY (version_log_imp_deu DEFAULT NULL);
ALTER TABLE log_imp_deu MODIFY (es_importado DEFAULT NULL);
ALTER TABLE log_imp_deu MODIFY (fecha_hora_transaccion DEFAULT NULL);
ALTER TABLE log_imp_emp MODIFY (version_log_imp_emp DEFAULT NULL);
ALTER TABLE log_imp_emp MODIFY (es_importado DEFAULT NULL);
ALTER TABLE log_imp_emp MODIFY (fecha_hora_transaccion DEFAULT NULL);
ALTER TABLE log_imp_fal MODIFY (version_log_imp_fal DEFAULT NULL);
ALTER TABLE log_imp_fal MODIFY (es_importado DEFAULT NULL);
ALTER TABLE log_imp_fal MODIFY (fecha_hora_transaccion DEFAULT NULL);
ALTER TABLE log_imp_hog MODIFY (version_log_imp_hog DEFAULT NULL);
ALTER TABLE log_imp_hog MODIFY (es_importado DEFAULT NULL);
ALTER TABLE log_imp_hog MODIFY (fecha_hora_transaccion DEFAULT NULL);
ALTER TABLE log_imp_hog_eec MODIFY (version_log_imp_hog_eec DEFAULT NULL);
ALTER TABLE log_imp_hog_eec MODIFY (es_importado DEFAULT NULL);
ALTER TABLE log_imp_hog_eec MODIFY (fecha_hora_transaccion DEFAULT NULL);
ALTER TABLE log_imp_ids MODIFY (version_log_imp_ids DEFAULT NULL);
ALTER TABLE log_imp_ids MODIFY (es_importado DEFAULT NULL);
ALTER TABLE log_imp_ids MODIFY (fecha_hora_transaccion DEFAULT NULL);
ALTER TABLE log_imp_jub MODIFY (version_log_imp_jub DEFAULT NULL);
ALTER TABLE log_imp_jub MODIFY (es_importado DEFAULT NULL);
ALTER TABLE log_imp_jub MODIFY (fecha_hora_transaccion DEFAULT NULL);
ALTER TABLE log_imp_pen MODIFY (version_log_imp_pen DEFAULT NULL);
ALTER TABLE log_imp_pen MODIFY (es_importado DEFAULT NULL);
ALTER TABLE log_imp_pen MODIFY (fecha_hora_transaccion DEFAULT NULL);
ALTER TABLE log_imp_per MODIFY (version_log_imp_per DEFAULT NULL);
ALTER TABLE log_imp_per MODIFY (es_importado DEFAULT NULL);
ALTER TABLE log_imp_per MODIFY (fecha_hora_transaccion DEFAULT NULL);
ALTER TABLE log_imp_per_eec MODIFY (version_log_imp_per_eec DEFAULT NULL);
ALTER TABLE log_imp_per_eec MODIFY (es_importado DEFAULT NULL);
ALTER TABLE log_imp_per_eec MODIFY (fecha_hora_transaccion DEFAULT NULL);
ALTER TABLE log_imp_pot MODIFY (version_log_imp_pot DEFAULT NULL);
ALTER TABLE log_imp_pot MODIFY (es_importado DEFAULT NULL);
ALTER TABLE log_imp_pot MODIFY (fecha_hora_transaccion DEFAULT NULL);
ALTER TABLE log_imp_sub MODIFY (version_log_imp_sub DEFAULT NULL);
ALTER TABLE log_imp_sub MODIFY (es_importado DEFAULT NULL);
ALTER TABLE log_imp_sub MODIFY (fecha_hora_transaccion DEFAULT NULL);
ALTER TABLE log_imp_ubi MODIFY (version_log_imp_ubi DEFAULT NULL);
ALTER TABLE log_imp_ubi MODIFY (es_importado DEFAULT NULL);
ALTER TABLE log_imp_ubi MODIFY (fecha_hora_transaccion DEFAULT NULL);
ALTER TABLE log_pro_acr_pot_ben MODIFY (version_log_pro_acr_pot_ben DEFAULT NULL);
ALTER TABLE log_pro_acr_pot_ben MODIFY (fecha_registro_pot_ben DEFAULT NULL);
ALTER TABLE log_pro_acr_pot_ben MODIFY (es_procesado DEFAULT NULL);
ALTER TABLE log_pro_acr_pot_ben MODIFY (fecha_hora_transaccion DEFAULT NULL);
ALTER TABLE log_pro_act_jupe MODIFY (version_log_pro_act_jupe DEFAULT NULL);
ALTER TABLE log_pro_act_jupe MODIFY (es_procesado DEFAULT NULL);
ALTER TABLE log_pro_act_jupe MODIFY (fecha_hora_transaccion DEFAULT NULL);
ALTER TABLE log_pro_den_pen_obj MODIFY (version_log_pro_den_pen_obj DEFAULT NULL);
ALTER TABLE log_pro_den_pen_obj MODIFY (es_procesado DEFAULT NULL);
ALTER TABLE log_pro_den_pen_obj MODIFY (fecha_hora_transaccion DEFAULT NULL);
ALTER TABLE log_pro_imp_arc_ext MODIFY (version_log_pro_imp_arc_ext DEFAULT NULL);
ALTER TABLE log_pro_imp_arc_ext MODIFY (es_importado DEFAULT NULL);
ALTER TABLE log_pro_imp_arc_ext MODIFY (fecha_hora_transaccion DEFAULT NULL);
ALTER TABLE log_pro_oto_pen_apr MODIFY (version_log_pro_oto_pen_apr DEFAULT NULL);
ALTER TABLE log_pro_oto_pen_apr MODIFY (es_procesado DEFAULT NULL);
ALTER TABLE log_pro_oto_pen_apr MODIFY (fecha_hora_transaccion DEFAULT NULL);
ALTER TABLE log_pro_pre_pro_pag MODIFY (version_log_pro_pre_pro_pag DEFAULT NULL);
ALTER TABLE log_pro_pre_pro_pag MODIFY (fecha_solicitud_pension DEFAULT NULL);
ALTER TABLE log_pro_pre_pro_pag MODIFY (es_procesado DEFAULT NULL);
ALTER TABLE log_pro_pre_pro_pag MODIFY (fecha_hora_transaccion DEFAULT NULL);
ALTER TABLE log_pro_ver_ele_pen MODIFY (version_log_pro_ver_ele_pen DEFAULT NULL);
ALTER TABLE log_pro_ver_ele_pen MODIFY (es_procesado DEFAULT NULL);
ALTER TABLE log_pro_ver_ele_pen MODIFY (fecha_hora_transaccion DEFAULT NULL);
ALTER TABLE mensaje MODIFY (version_mensaje DEFAULT NULL);
ALTER TABLE nivel_opcion_menu MODIFY (digitos_nivel_opcion_menu DEFAULT NULL);
ALTER TABLE nivel_ubicacion MODIFY (digitos_nivel_ubicacion DEFAULT NULL);
ALTER TABLE objecion_ele_pen MODIFY (version_objecion_ele_pen DEFAULT NULL);
ALTER TABLE objecion_ele_pen MODIFY (es_objecion_ele_pen_inactiva DEFAULT NULL);
ALTER TABLE opcion_menu MODIFY (version_opcion_menu DEFAULT NULL);
ALTER TABLE opcion_menu MODIFY (es_opcion_menu_inactiva DEFAULT NULL);
ALTER TABLE opcion_menu MODIFY (es_opcion_menu_sincronizada DEFAULT NULL);
ALTER TABLE opcion_menu_plus MODIFY (version_opcion_menu DEFAULT NULL);
ALTER TABLE opcion_sistema MODIFY (version_opcion_sistema DEFAULT NULL);
ALTER TABLE pagina MODIFY (version_pagina DEFAULT NULL);
ALTER TABLE pagina MODIFY (es_publica DEFAULT NULL);
ALTER TABLE pagina_funcion MODIFY (version_pagina_funcion DEFAULT NULL);
ALTER TABLE pagina_funcion MODIFY (es_funcion_inicial DEFAULT NULL);
ALTER TABLE pagina_usuario MODIFY (version_pagina_usuario DEFAULT NULL);
ALTER TABLE paquete MODIFY (version_paquete DEFAULT NULL);
ALTER TABLE parametro MODIFY (version_parametro DEFAULT NULL);
ALTER TABLE parametro_global MODIFY (es_control_cer_vida_activo DEFAULT NULL);
ALTER TABLE parametro_global MODIFY (es_control_cobro_pension_activ DEFAULT NULL);
ALTER TABLE parametro_global MODIFY (es_control_reproceso_pen_activ DEFAULT NULL);
ALTER TABLE parametro_global MODIFY (limite_pensiones DEFAULT NULL);
ALTER TABLE persona MODIFY (version_persona DEFAULT NULL);
ALTER TABLE persona MODIFY (es_paraguayo_natural DEFAULT NULL);
ALTER TABLE persona MODIFY (es_indigena DEFAULT NULL);
ALTER TABLE persona MODIFY (es_certificado_vida_anulado DEFAULT NULL);
ALTER TABLE persona MODIFY (es_cer_defuncion_anulado DEFAULT NULL);
ALTER TABLE persona MODIFY (es_persona_con_empleo DEFAULT NULL);
ALTER TABLE persona MODIFY (es_persona_con_jubilacion DEFAULT NULL);
ALTER TABLE persona MODIFY (es_persona_con_pension DEFAULT NULL);
ALTER TABLE persona MODIFY (es_persona_con_subsidio DEFAULT NULL);
ALTER TABLE persona MODIFY (es_persona_con_deuda DEFAULT NULL);
ALTER TABLE persona MODIFY (es_persona_con_pena_judicial DEFAULT NULL);
ALTER TABLE persona MODIFY (es_persona_con_cer_vida DEFAULT NULL);
ALTER TABLE persona MODIFY (es_persona_con_carta_renuncia DEFAULT NULL);
ALTER TABLE persona MODIFY (es_persona_elegible_para_pen DEFAULT NULL);
ALTER TABLE persona MODIFY (es_persona_acreditada_para_pen DEFAULT NULL);
ALTER TABLE persona MODIFY (es_persona_con_copia_cedula DEFAULT NULL);
ALTER TABLE persona MODIFY (es_persona_con_declaracion_jur DEFAULT NULL);
ALTER TABLE persona_anotada MODIFY (version_persona_anotada DEFAULT NULL);
ALTER TABLE potencial_ben MODIFY (version_potencial_ben DEFAULT NULL);
ALTER TABLE potencial_ben MODIFY (es_paraguayo_natural DEFAULT NULL);
ALTER TABLE potencial_ben MODIFY (es_indigena DEFAULT NULL);
ALTER TABLE potencial_ben MODIFY (es_persona_con_empleo DEFAULT NULL);
ALTER TABLE potencial_ben MODIFY (es_persona_con_jubilacion DEFAULT NULL);
ALTER TABLE potencial_ben MODIFY (es_persona_con_pension DEFAULT NULL);
ALTER TABLE potencial_ben MODIFY (es_persona_con_subsidio DEFAULT NULL);
ALTER TABLE potencial_ben MODIFY (es_persona_con_deuda DEFAULT NULL);
ALTER TABLE potencial_ben MODIFY (es_persona_con_pena_judicial DEFAULT NULL);
ALTER TABLE potencial_ben MODIFY (es_persona_con_cer_vida DEFAULT NULL);
ALTER TABLE potencial_ben MODIFY (es_persona_con_carta_renuncia DEFAULT NULL);
ALTER TABLE potencial_ben MODIFY (fecha_registro_pot_ben DEFAULT NULL);
ALTER TABLE potencial_ben MODIFY (id_usuario_reg_pot_ben DEFAULT NULL);
ALTER TABLE potencial_ben MODIFY (es_potencial_ben_inactivo DEFAULT NULL);
ALTER TABLE potencial_ben MODIFY (es_potencial_ben_migrado DEFAULT NULL);
ALTER TABLE proceso MODIFY (version_proceso DEFAULT NULL);
ALTER TABLE proveedor_dat_ext MODIFY (version_proveedor_dat_ext DEFAULT NULL);
ALTER TABLE rastro_funcion MODIFY (fecha_hora_ejecucion DEFAULT NULL);
ALTER TABLE rastro_informe MODIFY (version_rastro_informe DEFAULT NULL);
ALTER TABLE rastro_informe MODIFY (fecha_hora_inicio_ejecucion DEFAULT NULL);
ALTER TABLE rastro_informe MODIFY (numero_condicion_eje_fun DEFAULT NULL);
ALTER TABLE rastro_proceso MODIFY (version_rastro_proceso DEFAULT NULL);
ALTER TABLE rastro_proceso MODIFY (fecha_hora_inicio_ejecucion DEFAULT NULL);
ALTER TABLE rastro_proceso MODIFY (numero_condicion_eje_fun DEFAULT NULL);
ALTER TABLE rastro_proceso MODIFY (subprocesos DEFAULT NULL);
ALTER TABLE rastro_proceso MODIFY (subprocesos_pendientes DEFAULT NULL);
ALTER TABLE rastro_proceso MODIFY (subprocesos_en_progreso DEFAULT NULL);
ALTER TABLE rastro_proceso MODIFY (subprocesos_sin_errores DEFAULT NULL);
ALTER TABLE rastro_proceso MODIFY (subprocesos_con_errores DEFAULT NULL);
ALTER TABLE rastro_proceso MODIFY (subprocesos_cancelados DEFAULT NULL);
ALTER TABLE recurso MODIFY (version_recurso DEFAULT NULL);
ALTER TABLE recurso MODIFY (es_recurso_inactivo DEFAULT NULL);
ALTER TABLE rol MODIFY (version_rol DEFAULT NULL);
ALTER TABLE rol_aplicacion MODIFY (version_rol_aplicacion DEFAULT NULL);
ALTER TABLE rol_filtro_funcion MODIFY (version_rol_filtro_funcion DEFAULT NULL);
ALTER TABLE rol_funcion MODIFY (version_rol_funcion DEFAULT NULL);
ALTER TABLE rol_pagina MODIFY (version_rol_pagina DEFAULT NULL);
ALTER TABLE rol_usuario MODIFY (version_rol_usuario DEFAULT NULL);
ALTER TABLE ubicacion MODIFY (version_ubicacion DEFAULT NULL);
ALTER TABLE ubicacion_plus MODIFY (version_ubicacion DEFAULT NULL);
ALTER TABLE usuario MODIFY (version_usuario DEFAULT NULL);
ALTER TABLE usuario MODIFY (es_super_usuario DEFAULT NULL);
ALTER TABLE usuario MODIFY (es_usuario_especial DEFAULT NULL);
ALTER TABLE usuario MODIFY (es_usuario_inactivo DEFAULT NULL);
ALTER TABLE usuario MODIFY (es_usuario_modificado DEFAULT NULL);
ALTER TABLE visita_censo MODIFY (version_visita_censo DEFAULT NULL);
