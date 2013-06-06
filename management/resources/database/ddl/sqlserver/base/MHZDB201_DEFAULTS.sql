ALTER TABLE aplicacion ADD CONSTRAINT DF_aplicacion_001___ DEFAULT (0) FOR version_aplicacion
GO
ALTER TABLE aplicacion ADD CONSTRAINT DF_aplicacion_002___ DEFAULT (0) FOR es_publica
GO
ALTER TABLE archivo_datos_ext ADD CONSTRAINT DF_archivo_datos_ext_001___ DEFAULT (0) FOR version_archivo_datos_ext
GO
ALTER TABLE archivo_datos_ext ADD CONSTRAINT DF_archivo_datos_ext_002___ DEFAULT (0) FOR es_archivo_datos_ext_importado
GO
ALTER TABLE archivo_datos_ext ADD CONSTRAINT DF_archivo_datos_ext_003___ DEFAULT (0) FOR es_archivo_datos_ext_inactivo
GO
ALTER TABLE clase_recurso ADD CONSTRAINT DF_clase_recurso_001___ DEFAULT (0) FOR version_clase_recurso
GO
ALTER TABLE clase_recurso ADD CONSTRAINT DF_clase_recurso_002___ DEFAULT (0) FOR es_clase_recurso_independiente
GO
ALTER TABLE clase_recurso ADD CONSTRAINT DF_clase_recurso_003___ DEFAULT (0) FOR es_clase_recurso_sin_detalle
GO
ALTER TABLE clase_recurso ADD CONSTRAINT DF_clase_recurso_004___ DEFAULT (0) FOR es_clase_recurso_con_arbol
GO
ALTER TABLE clase_recurso ADD CONSTRAINT DF_clase_recurso_005___ DEFAULT (1) FOR numero_tipo_clase_recurso
GO
ALTER TABLE clase_recurso ADD CONSTRAINT DF_clase_recurso_006___ DEFAULT (1) FOR es_clase_recurso_insertable
GO
ALTER TABLE clase_recurso ADD CONSTRAINT DF_clase_recurso_007___ DEFAULT (1) FOR es_clase_recurso_modificable
GO
ALTER TABLE clase_recurso ADD CONSTRAINT DF_clase_recurso_008___ DEFAULT (1) FOR es_clase_recurso_eliminable
GO
ALTER TABLE clase_recurso ADD CONSTRAINT DF_clase_recurso_009___ DEFAULT (0) FOR es_clase_recurso_extendida
GO
ALTER TABLE clase_recurso ADD CONSTRAINT DF_clase_recurso_010___ DEFAULT (0) FOR es_enumerador_con_numero
GO
ALTER TABLE clase_recurso_par ADD CONSTRAINT DF_clase_recurso_par_001___ DEFAULT (0) FOR version_clase_recurso_par
GO
ALTER TABLE clase_recurso_par ADD CONSTRAINT DF_clase_recurso_par_002___ DEFAULT (11) FOR numero_tipo_valor
GO
ALTER TABLE clase_recurso_par ADD CONSTRAINT DF_clase_recurso_par_003___ DEFAULT (0) FOR es_parametro_omisible
GO
ALTER TABLE clase_recurso_par ADD CONSTRAINT DF_clase_recurso_par_004___ DEFAULT (0) FOR es_parametro_inmutable
GO
ALTER TABLE clase_recurso_par ADD CONSTRAINT DF_clase_recurso_par_005___ DEFAULT (0) FOR es_parametro_submit
GO
ALTER TABLE clase_recurso_par ADD CONSTRAINT DF_clase_recurso_par_006___ DEFAULT (0) FOR es_parametro_primordial
GO
ALTER TABLE clase_recurso_par ADD CONSTRAINT DF_clase_recurso_par_007___ DEFAULT (0) FOR es_parametro_maestro
GO
ALTER TABLE clase_recurso_par ADD CONSTRAINT DF_clase_recurso_par_008___ DEFAULT (0) FOR es_parametro_segmento
GO
ALTER TABLE clase_recurso_par ADD CONSTRAINT DF_clase_recurso_par_009___ DEFAULT (0) FOR es_parametro_sin_rastro
GO
ALTER TABLE clase_recurso_par ADD CONSTRAINT DF_clase_recurso_par_010___ DEFAULT (0) FOR es_parametro_sincronizado
GO
ALTER TABLE clase_recurso_par ADD CONSTRAINT DF_clase_recurso_par_011___ DEFAULT (0) FOR orden_presentacion
GO
ALTER TABLE clase_recurso_par ADD CONSTRAINT DF_clase_recurso_par_012___ DEFAULT (0) FOR es_referencia_alternativa
GO
ALTER TABLE clase_recurso_par ADD CONSTRAINT DF_clase_recurso_par_013___ DEFAULT (0) FOR orden_pagina_seleccion
GO
ALTER TABLE clase_recurso_sec ADD CONSTRAINT DF_clase_recurso_sec_001___ DEFAULT (0) FOR version_clase_recurso_sec
GO
ALTER TABLE clase_recurso_sec ADD CONSTRAINT DF_clase_recurso_sec_002___ DEFAULT (0) FOR orden_presentacion
GO
ALTER TABLE clase_recurso_sec ADD CONSTRAINT DF_clase_recurso_sec_003___ DEFAULT (1) FOR es_pestana_detalle
GO
ALTER TABLE conjunto_segmento ADD CONSTRAINT DF_conjunto_segmento_001___ DEFAULT (0) FOR version_conjunto_segmento
GO
ALTER TABLE dominio ADD CONSTRAINT DF_dominio_001___ DEFAULT (0) FOR version_dominio
GO
ALTER TABLE dominio_paquete ADD CONSTRAINT DF_dominio_paquete_001___ DEFAULT (0) FOR version_dominio_paquete
GO
ALTER TABLE dominio_parametro ADD CONSTRAINT DF_dominio_parametro_001___ DEFAULT (0) FOR version_dominio_parametro
GO
ALTER TABLE elemento_segmento ADD CONSTRAINT DF_elemento_segmento_001___ DEFAULT (0) FOR version_elemento_segmento
GO
ALTER TABLE etnia_indigena ADD CONSTRAINT DF_etnia_indigena_001___ DEFAULT (0) FOR version_etnia_indigena
GO
ALTER TABLE ficha_hogar ADD CONSTRAINT DF_ficha_hogar_001___ DEFAULT (0) FOR version_ficha_hogar
GO
ALTER TABLE ficha_hogar ADD CONSTRAINT DF_ficha_hogar_002___ DEFAULT (0) FOR es_ficha_hogar_inactiva
GO
ALTER TABLE ficha_persona ADD CONSTRAINT DF_ficha_persona_001___ DEFAULT (0) FOR version_ficha_persona
GO
ALTER TABLE ficha_persona ADD CONSTRAINT DF_ficha_persona_002___ DEFAULT (0) FOR es_respondente
GO
ALTER TABLE ficha_persona ADD CONSTRAINT DF_ficha_persona_003___ DEFAULT (1) FOR numero_siono_miembro_hogar
GO
ALTER TABLE ficha_persona ADD CONSTRAINT DF_ficha_persona_004___ DEFAULT (0) FOR es_ficha_persona_inactiva
GO
ALTER TABLE ficha_persona ADD CONSTRAINT DF_ficha_persona_005___ DEFAULT (0) FOR es_ficha_persona_importada
GO
ALTER TABLE filtro_cla_rec_fun ADD CONSTRAINT DF_filtro_cla_rec_fun_001___ DEFAULT (0) FOR version_filtro_cla_rec_fun
GO
ALTER TABLE filtro_cla_rec_fun ADD CONSTRAINT DF_filtro_cla_rec_fun_002___ DEFAULT (11) FOR numero_operador_com
GO
ALTER TABLE filtro_cla_rec_par ADD CONSTRAINT DF_filtro_cla_rec_par_001___ DEFAULT (0) FOR version_filtro_cla_rec_par
GO
ALTER TABLE filtro_cla_rec_par ADD CONSTRAINT DF_filtro_cla_rec_par_002___ DEFAULT (11) FOR numero_operador_com
GO
ALTER TABLE filtro_cla_rec_sec ADD CONSTRAINT DF_filtro_cla_rec_sec_001___ DEFAULT (0) FOR version_filtro_cla_rec_sec
GO
ALTER TABLE filtro_cla_rec_sec ADD CONSTRAINT DF_filtro_cla_rec_sec_002___ DEFAULT (11) FOR numero_operador_com
GO
ALTER TABLE filtro_cla_rec_vin ADD CONSTRAINT DF_filtro_cla_rec_vin_001___ DEFAULT (0) FOR version_filtro_cla_rec_vin
GO
ALTER TABLE filtro_cla_rec_vin ADD CONSTRAINT DF_filtro_cla_rec_vin_002___ DEFAULT (11) FOR numero_operador_com
GO
ALTER TABLE filtro_funcion ADD CONSTRAINT DF_filtro_funcion_001___ DEFAULT (0) FOR version_filtro_funcion
GO
ALTER TABLE filtro_funcion ADD CONSTRAINT DF_filtro_funcion_002___ DEFAULT (0) FOR es_publico
GO
ALTER TABLE filtro_funcion_par ADD CONSTRAINT DF_filtro_funcion_par_001___ DEFAULT (0) FOR version_filtro_funcion_par
GO
ALTER TABLE filtro_funcion_par ADD CONSTRAINT DF_filtro_funcion_par_002___ DEFAULT (11) FOR numero_operador_com
GO
ALTER TABLE funcion ADD CONSTRAINT DF_funcion_001___ DEFAULT (0) FOR version_funcion
GO
ALTER TABLE funcion ADD CONSTRAINT DF_funcion_002___ DEFAULT (0) FOR numero_tipo_rastro_fun
GO
ALTER TABLE funcion ADD CONSTRAINT DF_funcion_003___ DEFAULT (0) FOR es_publica
GO
ALTER TABLE funcion ADD CONSTRAINT DF_funcion_004___ DEFAULT (0) FOR es_programatica
GO
ALTER TABLE funcion ADD CONSTRAINT DF_funcion_005___ DEFAULT (0) FOR es_personalizada
GO
ALTER TABLE funcion ADD CONSTRAINT DF_funcion_006___ DEFAULT (0) FOR es_segmentada
GO
ALTER TABLE funcion_parametro ADD CONSTRAINT DF_funcion_parametro_001___ DEFAULT (0) FOR version_funcion_parametro
GO
ALTER TABLE funcion_parametro ADD CONSTRAINT DF_funcion_parametro_002___ DEFAULT (11) FOR numero_tipo_valor
GO
ALTER TABLE funcion_parametro ADD CONSTRAINT DF_funcion_parametro_003___ DEFAULT (0) FOR es_parametro_sin_rastro
GO
ALTER TABLE funcion_parametro ADD CONSTRAINT DF_funcion_parametro_004___ DEFAULT (0) FOR es_parametro_segmento
GO
ALTER TABLE funcionario ADD CONSTRAINT DF_funcionario_001___ DEFAULT (0) FOR version_funcionario
GO
ALTER TABLE grupo_aplicacion ADD CONSTRAINT DF_grupo_aplicacion_001___ DEFAULT (0) FOR version_grupo_aplicacion
GO
ALTER TABLE grupo_proceso ADD CONSTRAINT DF_grupo_proceso_001___ DEFAULT (0) FOR version_grupo_proceso
GO
ALTER TABLE informe ADD CONSTRAINT DF_informe_001___ DEFAULT (0) FOR version_informe
GO
ALTER TABLE log_imp_cen ADD CONSTRAINT DF_log_imp_cen_001___ DEFAULT (0) FOR version_log_imp_cen
GO
ALTER TABLE log_imp_cen ADD CONSTRAINT DF_log_imp_cen_002___ DEFAULT (0) FOR es_importado
GO
ALTER TABLE log_imp_cen ADD CONSTRAINT DF_log_imp_cen_003___ DEFAULT (getdate()) FOR fecha_hora_transaccion
GO
ALTER TABLE log_imp_deu ADD CONSTRAINT DF_log_imp_deu_001___ DEFAULT (0) FOR version_log_imp_deu
GO
ALTER TABLE log_imp_deu ADD CONSTRAINT DF_log_imp_deu_002___ DEFAULT (0) FOR es_importado
GO
ALTER TABLE log_imp_deu ADD CONSTRAINT DF_log_imp_deu_003___ DEFAULT (getdate()) FOR fecha_hora_transaccion
GO
ALTER TABLE log_imp_emp ADD CONSTRAINT DF_log_imp_emp_001___ DEFAULT (0) FOR version_log_imp_emp
GO
ALTER TABLE log_imp_emp ADD CONSTRAINT DF_log_imp_emp_002___ DEFAULT (0) FOR es_importado
GO
ALTER TABLE log_imp_emp ADD CONSTRAINT DF_log_imp_emp_003___ DEFAULT (getdate()) FOR fecha_hora_transaccion
GO
ALTER TABLE log_imp_fal ADD CONSTRAINT DF_log_imp_fal_001___ DEFAULT (0) FOR version_log_imp_fal
GO
ALTER TABLE log_imp_fal ADD CONSTRAINT DF_log_imp_fal_002___ DEFAULT (0) FOR es_importado
GO
ALTER TABLE log_imp_fal ADD CONSTRAINT DF_log_imp_fal_003___ DEFAULT (getdate()) FOR fecha_hora_transaccion
GO
ALTER TABLE log_imp_hog ADD CONSTRAINT DF_log_imp_hog_001___ DEFAULT (0) FOR version_log_imp_hog
GO
ALTER TABLE log_imp_hog ADD CONSTRAINT DF_log_imp_hog_002___ DEFAULT (0) FOR es_importado
GO
ALTER TABLE log_imp_hog ADD CONSTRAINT DF_log_imp_hog_003___ DEFAULT (getdate()) FOR fecha_hora_transaccion
GO
ALTER TABLE log_imp_hog_eec ADD CONSTRAINT DF_log_imp_hog_eec_001___ DEFAULT (0) FOR version_log_imp_hog_eec
GO
ALTER TABLE log_imp_hog_eec ADD CONSTRAINT DF_log_imp_hog_eec_002___ DEFAULT (0) FOR es_importado
GO
ALTER TABLE log_imp_hog_eec ADD CONSTRAINT DF_log_imp_hog_eec_003___ DEFAULT (getdate()) FOR fecha_hora_transaccion
GO
ALTER TABLE log_imp_ids ADD CONSTRAINT DF_log_imp_ids_001___ DEFAULT (0) FOR version_log_imp_ids
GO
ALTER TABLE log_imp_ids ADD CONSTRAINT DF_log_imp_ids_002___ DEFAULT (0) FOR es_importado
GO
ALTER TABLE log_imp_ids ADD CONSTRAINT DF_log_imp_ids_003___ DEFAULT (getdate()) FOR fecha_hora_transaccion
GO
ALTER TABLE log_imp_jub ADD CONSTRAINT DF_log_imp_jub_001___ DEFAULT (0) FOR version_log_imp_jub
GO
ALTER TABLE log_imp_jub ADD CONSTRAINT DF_log_imp_jub_002___ DEFAULT (0) FOR es_importado
GO
ALTER TABLE log_imp_jub ADD CONSTRAINT DF_log_imp_jub_003___ DEFAULT (getdate()) FOR fecha_hora_transaccion
GO
ALTER TABLE log_imp_pen ADD CONSTRAINT DF_log_imp_pen_001___ DEFAULT (0) FOR version_log_imp_pen
GO
ALTER TABLE log_imp_pen ADD CONSTRAINT DF_log_imp_pen_002___ DEFAULT (0) FOR es_importado
GO
ALTER TABLE log_imp_pen ADD CONSTRAINT DF_log_imp_pen_003___ DEFAULT (getdate()) FOR fecha_hora_transaccion
GO
ALTER TABLE log_imp_per ADD CONSTRAINT DF_log_imp_per_001___ DEFAULT (0) FOR version_log_imp_per
GO
ALTER TABLE log_imp_per ADD CONSTRAINT DF_log_imp_per_002___ DEFAULT (0) FOR es_importado
GO
ALTER TABLE log_imp_per ADD CONSTRAINT DF_log_imp_per_003___ DEFAULT (getdate()) FOR fecha_hora_transaccion
GO
ALTER TABLE log_imp_per_eec ADD CONSTRAINT DF_log_imp_per_eec_001___ DEFAULT (0) FOR version_log_imp_per_eec
GO
ALTER TABLE log_imp_per_eec ADD CONSTRAINT DF_log_imp_per_eec_002___ DEFAULT (0) FOR es_importado
GO
ALTER TABLE log_imp_per_eec ADD CONSTRAINT DF_log_imp_per_eec_003___ DEFAULT (getdate()) FOR fecha_hora_transaccion
GO
ALTER TABLE log_imp_pot ADD CONSTRAINT DF_log_imp_pot_001___ DEFAULT (0) FOR version_log_imp_pot
GO
ALTER TABLE log_imp_pot ADD CONSTRAINT DF_log_imp_pot_002___ DEFAULT (0) FOR es_importado
GO
ALTER TABLE log_imp_pot ADD CONSTRAINT DF_log_imp_pot_003___ DEFAULT (getdate()) FOR fecha_hora_transaccion
GO
ALTER TABLE log_imp_sub ADD CONSTRAINT DF_log_imp_sub_001___ DEFAULT (0) FOR version_log_imp_sub
GO
ALTER TABLE log_imp_sub ADD CONSTRAINT DF_log_imp_sub_002___ DEFAULT (0) FOR es_importado
GO
ALTER TABLE log_imp_sub ADD CONSTRAINT DF_log_imp_sub_003___ DEFAULT (getdate()) FOR fecha_hora_transaccion
GO
ALTER TABLE log_imp_ubi ADD CONSTRAINT DF_log_imp_ubi_001___ DEFAULT (0) FOR version_log_imp_ubi
GO
ALTER TABLE log_imp_ubi ADD CONSTRAINT DF_log_imp_ubi_002___ DEFAULT (0) FOR es_importado
GO
ALTER TABLE log_imp_ubi ADD CONSTRAINT DF_log_imp_ubi_003___ DEFAULT (getdate()) FOR fecha_hora_transaccion
GO
ALTER TABLE log_pro_acr_pot_ben ADD CONSTRAINT DF_log_pro_acr_pot_ben_001___ DEFAULT (0) FOR version_log_pro_acr_pot_ben
GO
ALTER TABLE log_pro_acr_pot_ben ADD CONSTRAINT DF_log_pro_acr_pot_ben_002___ DEFAULT (getdate()) FOR fecha_registro_pot_ben
GO
ALTER TABLE log_pro_acr_pot_ben ADD CONSTRAINT DF_log_pro_acr_pot_ben_003___ DEFAULT (0) FOR es_procesado
GO
ALTER TABLE log_pro_acr_pot_ben ADD CONSTRAINT DF_log_pro_acr_pot_ben_004___ DEFAULT (getdate()) FOR fecha_hora_transaccion
GO
ALTER TABLE log_pro_act_jupe ADD CONSTRAINT DF_log_pro_act_jupe_001___ DEFAULT (0) FOR version_log_pro_act_jupe
GO
ALTER TABLE log_pro_act_jupe ADD CONSTRAINT DF_log_pro_act_jupe_002___ DEFAULT (0) FOR es_procesado
GO
ALTER TABLE log_pro_act_jupe ADD CONSTRAINT DF_log_pro_act_jupe_003___ DEFAULT (getdate()) FOR fecha_hora_transaccion
GO
ALTER TABLE log_pro_den_pen_obj ADD CONSTRAINT DF_log_pro_den_pen_obj_001___ DEFAULT (0) FOR version_log_pro_den_pen_obj
GO
ALTER TABLE log_pro_den_pen_obj ADD CONSTRAINT DF_log_pro_den_pen_obj_002___ DEFAULT (0) FOR es_procesado
GO
ALTER TABLE log_pro_den_pen_obj ADD CONSTRAINT DF_log_pro_den_pen_obj_003___ DEFAULT (getdate()) FOR fecha_hora_transaccion
GO
ALTER TABLE log_pro_imp_arc_ext ADD CONSTRAINT DF_log_pro_imp_arc_ext_001___ DEFAULT (0) FOR version_log_pro_imp_arc_ext
GO
ALTER TABLE log_pro_imp_arc_ext ADD CONSTRAINT DF_log_pro_imp_arc_ext_002___ DEFAULT (0) FOR es_importado
GO
ALTER TABLE log_pro_imp_arc_ext ADD CONSTRAINT DF_log_pro_imp_arc_ext_003___ DEFAULT (getdate()) FOR fecha_hora_transaccion
GO
ALTER TABLE log_pro_oto_pen_apr ADD CONSTRAINT DF_log_pro_oto_pen_apr_001___ DEFAULT (0) FOR version_log_pro_oto_pen_apr
GO
ALTER TABLE log_pro_oto_pen_apr ADD CONSTRAINT DF_log_pro_oto_pen_apr_002___ DEFAULT (0) FOR es_procesado
GO
ALTER TABLE log_pro_oto_pen_apr ADD CONSTRAINT DF_log_pro_oto_pen_apr_003___ DEFAULT (getdate()) FOR fecha_hora_transaccion
GO
ALTER TABLE log_pro_pre_pro_pag ADD CONSTRAINT DF_log_pro_pre_pro_pag_001___ DEFAULT (0) FOR version_log_pro_pre_pro_pag
GO
ALTER TABLE log_pro_pre_pro_pag ADD CONSTRAINT DF_log_pro_pre_pro_pag_002___ DEFAULT (getdate()) FOR fecha_solicitud_pension
GO
ALTER TABLE log_pro_pre_pro_pag ADD CONSTRAINT DF_log_pro_pre_pro_pag_003___ DEFAULT (0) FOR es_procesado
GO
ALTER TABLE log_pro_pre_pro_pag ADD CONSTRAINT DF_log_pro_pre_pro_pag_004___ DEFAULT (getdate()) FOR fecha_hora_transaccion
GO
ALTER TABLE log_pro_ver_ele_pen ADD CONSTRAINT DF_log_pro_ver_ele_pen_001___ DEFAULT (0) FOR version_log_pro_ver_ele_pen
GO
ALTER TABLE log_pro_ver_ele_pen ADD CONSTRAINT DF_log_pro_ver_ele_pen_002___ DEFAULT (0) FOR es_procesado
GO
ALTER TABLE log_pro_ver_ele_pen ADD CONSTRAINT DF_log_pro_ver_ele_pen_003___ DEFAULT (getdate()) FOR fecha_hora_transaccion
GO
ALTER TABLE mensaje ADD CONSTRAINT DF_mensaje_001___ DEFAULT (0) FOR version_mensaje
GO
ALTER TABLE nivel_opcion_menu ADD CONSTRAINT DF_nivel_opcion_menu_001___ DEFAULT (2) FOR digitos_nivel_opcion_menu
GO
ALTER TABLE nivel_ubicacion ADD CONSTRAINT DF_nivel_ubicacion_001___ DEFAULT (2) FOR digitos_nivel_ubicacion
GO
ALTER TABLE objecion_ele_pen ADD CONSTRAINT DF_objecion_ele_pen_001___ DEFAULT (0) FOR version_objecion_ele_pen
GO
ALTER TABLE objecion_ele_pen ADD CONSTRAINT DF_objecion_ele_pen_002___ DEFAULT (0) FOR es_objecion_ele_pen_inactiva
GO
ALTER TABLE opcion_menu ADD CONSTRAINT DF_opcion_menu_001___ DEFAULT (0) FOR version_opcion_menu
GO
ALTER TABLE opcion_menu ADD CONSTRAINT DF_opcion_menu_002___ DEFAULT (0) FOR es_opcion_menu_inactiva
GO
ALTER TABLE opcion_menu ADD CONSTRAINT DF_opcion_menu_003___ DEFAULT (0) FOR es_opcion_menu_sincronizada
GO
ALTER TABLE opcion_menu_plus ADD CONSTRAINT DF_opcion_menu_plus_001___ DEFAULT (0) FOR version_opcion_menu
GO
ALTER TABLE opcion_sistema ADD CONSTRAINT DF_opcion_sistema_001___ DEFAULT (0) FOR version_opcion_sistema
GO
ALTER TABLE pagina ADD CONSTRAINT DF_pagina_001___ DEFAULT (0) FOR version_pagina
GO
ALTER TABLE pagina ADD CONSTRAINT DF_pagina_002___ DEFAULT (0) FOR es_publica
GO
ALTER TABLE pagina_funcion ADD CONSTRAINT DF_pagina_funcion_001___ DEFAULT (0) FOR version_pagina_funcion
GO
ALTER TABLE pagina_funcion ADD CONSTRAINT DF_pagina_funcion_002___ DEFAULT (0) FOR es_funcion_inicial
GO
ALTER TABLE pagina_usuario ADD CONSTRAINT DF_pagina_usuario_001___ DEFAULT (0) FOR version_pagina_usuario
GO
ALTER TABLE paquete ADD CONSTRAINT DF_paquete_001___ DEFAULT (0) FOR version_paquete
GO
ALTER TABLE parametro ADD CONSTRAINT DF_parametro_001___ DEFAULT (0) FOR version_parametro
GO
ALTER TABLE parametro_global ADD CONSTRAINT DF_parametro_global_001___ DEFAULT (0) FOR es_control_cer_vida_activo
GO
ALTER TABLE parametro_global ADD CONSTRAINT DF_parametro_global_002___ DEFAULT (0) FOR es_control_cobro_pension_activ
GO
ALTER TABLE parametro_global ADD CONSTRAINT DF_parametro_global_003___ DEFAULT (0) FOR es_control_reproceso_pen_activ
GO
ALTER TABLE parametro_global ADD CONSTRAINT DF_parametro_global_004___ DEFAULT (0) FOR limite_pensiones
GO
ALTER TABLE persona ADD CONSTRAINT DF_persona_001___ DEFAULT (0) FOR version_persona
GO
ALTER TABLE persona ADD CONSTRAINT DF_persona_002___ DEFAULT (1) FOR es_paraguayo_natural
GO
ALTER TABLE persona ADD CONSTRAINT DF_persona_003___ DEFAULT (0) FOR es_indigena
GO
ALTER TABLE persona ADD CONSTRAINT DF_persona_004___ DEFAULT (0) FOR es_certificado_vida_anulado
GO
ALTER TABLE persona ADD CONSTRAINT DF_persona_005___ DEFAULT (0) FOR es_cer_defuncion_anulado
GO
ALTER TABLE persona ADD CONSTRAINT DF_persona_006___ DEFAULT (0) FOR es_persona_con_empleo
GO
ALTER TABLE persona ADD CONSTRAINT DF_persona_007___ DEFAULT (0) FOR es_persona_con_jubilacion
GO
ALTER TABLE persona ADD CONSTRAINT DF_persona_008___ DEFAULT (0) FOR es_persona_con_pension
GO
ALTER TABLE persona ADD CONSTRAINT DF_persona_009___ DEFAULT (0) FOR es_persona_con_subsidio
GO
ALTER TABLE persona ADD CONSTRAINT DF_persona_010___ DEFAULT (0) FOR es_persona_con_deuda
GO
ALTER TABLE persona ADD CONSTRAINT DF_persona_011___ DEFAULT (0) FOR es_persona_con_pena_judicial
GO
ALTER TABLE persona ADD CONSTRAINT DF_persona_012___ DEFAULT (0) FOR es_persona_con_cer_vida
GO
ALTER TABLE persona ADD CONSTRAINT DF_persona_013___ DEFAULT (0) FOR es_persona_con_carta_renuncia
GO
ALTER TABLE persona ADD CONSTRAINT DF_persona_014___ DEFAULT (0) FOR es_persona_elegible_para_pen
GO
ALTER TABLE persona ADD CONSTRAINT DF_persona_015___ DEFAULT (0) FOR es_persona_acreditada_para_pen
GO
ALTER TABLE persona ADD CONSTRAINT DF_persona_016___ DEFAULT (0) FOR es_persona_con_copia_cedula
GO
ALTER TABLE persona ADD CONSTRAINT DF_persona_017___ DEFAULT (0) FOR es_persona_con_declaracion_jur
GO
ALTER TABLE persona_anotada ADD CONSTRAINT DF_persona_anotada_001___ DEFAULT (0) FOR version_persona_anotada
GO
ALTER TABLE potencial_ben ADD CONSTRAINT DF_potencial_ben_001___ DEFAULT (0) FOR version_potencial_ben
GO
ALTER TABLE potencial_ben ADD CONSTRAINT DF_potencial_ben_002___ DEFAULT (1) FOR es_paraguayo_natural
GO
ALTER TABLE potencial_ben ADD CONSTRAINT DF_potencial_ben_003___ DEFAULT (0) FOR es_indigena
GO
ALTER TABLE potencial_ben ADD CONSTRAINT DF_potencial_ben_004___ DEFAULT (0) FOR es_persona_con_empleo
GO
ALTER TABLE potencial_ben ADD CONSTRAINT DF_potencial_ben_005___ DEFAULT (0) FOR es_persona_con_jubilacion
GO
ALTER TABLE potencial_ben ADD CONSTRAINT DF_potencial_ben_006___ DEFAULT (0) FOR es_persona_con_pension
GO
ALTER TABLE potencial_ben ADD CONSTRAINT DF_potencial_ben_007___ DEFAULT (0) FOR es_persona_con_subsidio
GO
ALTER TABLE potencial_ben ADD CONSTRAINT DF_potencial_ben_008___ DEFAULT (0) FOR es_persona_con_deuda
GO
ALTER TABLE potencial_ben ADD CONSTRAINT DF_potencial_ben_009___ DEFAULT (0) FOR es_persona_con_pena_judicial
GO
ALTER TABLE potencial_ben ADD CONSTRAINT DF_potencial_ben_010___ DEFAULT (0) FOR es_persona_con_cer_vida
GO
ALTER TABLE potencial_ben ADD CONSTRAINT DF_potencial_ben_011___ DEFAULT (0) FOR es_persona_con_carta_renuncia
GO
ALTER TABLE potencial_ben ADD CONSTRAINT DF_potencial_ben_012___ DEFAULT (getdate()) FOR fecha_registro_pot_ben
GO
ALTER TABLE potencial_ben ADD CONSTRAINT DF_potencial_ben_013___ DEFAULT (user_id()) FOR id_usuario_reg_pot_ben
GO
ALTER TABLE potencial_ben ADD CONSTRAINT DF_potencial_ben_014___ DEFAULT (0) FOR es_potencial_ben_inactivo
GO
ALTER TABLE potencial_ben ADD CONSTRAINT DF_potencial_ben_015___ DEFAULT (0) FOR es_potencial_ben_migrado
GO
ALTER TABLE proceso ADD CONSTRAINT DF_proceso_001___ DEFAULT (0) FOR version_proceso
GO
ALTER TABLE proveedor_dat_ext ADD CONSTRAINT DF_proveedor_dat_ext_001___ DEFAULT (0) FOR version_proveedor_dat_ext
GO
ALTER TABLE rastro_funcion ADD CONSTRAINT DF_rastro_funcion_001___ DEFAULT (getdate()) FOR fecha_hora_ejecucion
GO
ALTER TABLE rastro_informe ADD CONSTRAINT DF_rastro_informe_001___ DEFAULT (0) FOR version_rastro_informe
GO
ALTER TABLE rastro_informe ADD CONSTRAINT DF_rastro_informe_002___ DEFAULT (getdate()) FOR fecha_hora_inicio_ejecucion
GO
ALTER TABLE rastro_informe ADD CONSTRAINT DF_rastro_informe_003___ DEFAULT (11) FOR numero_condicion_eje_fun
GO
ALTER TABLE rastro_proceso ADD CONSTRAINT DF_rastro_proceso_001___ DEFAULT (0) FOR version_rastro_proceso
GO
ALTER TABLE rastro_proceso ADD CONSTRAINT DF_rastro_proceso_002___ DEFAULT (getdate()) FOR fecha_hora_inicio_ejecucion
GO
ALTER TABLE rastro_proceso ADD CONSTRAINT DF_rastro_proceso_003___ DEFAULT (11) FOR numero_condicion_eje_fun
GO
ALTER TABLE rastro_proceso ADD CONSTRAINT DF_rastro_proceso_004___ DEFAULT (0) FOR subprocesos
GO
ALTER TABLE rastro_proceso ADD CONSTRAINT DF_rastro_proceso_005___ DEFAULT (0) FOR subprocesos_pendientes
GO
ALTER TABLE rastro_proceso ADD CONSTRAINT DF_rastro_proceso_006___ DEFAULT (0) FOR subprocesos_en_progreso
GO
ALTER TABLE rastro_proceso ADD CONSTRAINT DF_rastro_proceso_007___ DEFAULT (0) FOR subprocesos_sin_errores
GO
ALTER TABLE rastro_proceso ADD CONSTRAINT DF_rastro_proceso_008___ DEFAULT (0) FOR subprocesos_con_errores
GO
ALTER TABLE rastro_proceso ADD CONSTRAINT DF_rastro_proceso_009___ DEFAULT (0) FOR subprocesos_cancelados
GO
ALTER TABLE recurso ADD CONSTRAINT DF_recurso_001___ DEFAULT (0) FOR version_recurso
GO
ALTER TABLE recurso ADD CONSTRAINT DF_recurso_002___ DEFAULT (0) FOR es_recurso_inactivo
GO
ALTER TABLE rol ADD CONSTRAINT DF_rol_001___ DEFAULT (0) FOR version_rol
GO
ALTER TABLE rol_aplicacion ADD CONSTRAINT DF_rol_aplicacion_001___ DEFAULT (0) FOR version_rol_aplicacion
GO
ALTER TABLE rol_filtro_funcion ADD CONSTRAINT DF_rol_filtro_funcion_001___ DEFAULT (0) FOR version_rol_filtro_funcion
GO
ALTER TABLE rol_funcion ADD CONSTRAINT DF_rol_funcion_001___ DEFAULT (0) FOR version_rol_funcion
GO
ALTER TABLE rol_pagina ADD CONSTRAINT DF_rol_pagina_001___ DEFAULT (0) FOR version_rol_pagina
GO
ALTER TABLE rol_usuario ADD CONSTRAINT DF_rol_usuario_001___ DEFAULT (0) FOR version_rol_usuario
GO
ALTER TABLE ubicacion ADD CONSTRAINT DF_ubicacion_001___ DEFAULT (0) FOR version_ubicacion
GO
ALTER TABLE ubicacion_plus ADD CONSTRAINT DF_ubicacion_plus_001___ DEFAULT (0) FOR version_ubicacion
GO
ALTER TABLE usuario ADD CONSTRAINT DF_usuario_001___ DEFAULT (0) FOR version_usuario
GO
ALTER TABLE usuario ADD CONSTRAINT DF_usuario_002___ DEFAULT (0) FOR es_super_usuario
GO
ALTER TABLE usuario ADD CONSTRAINT DF_usuario_003___ DEFAULT (0) FOR es_usuario_especial
GO
ALTER TABLE usuario ADD CONSTRAINT DF_usuario_004___ DEFAULT (0) FOR es_usuario_inactivo
GO
ALTER TABLE usuario ADD CONSTRAINT DF_usuario_005___ DEFAULT (0) FOR es_usuario_modificado
GO
ALTER TABLE visita_censo ADD CONSTRAINT DF_visita_censo_001___ DEFAULT (0) FOR version_visita_censo
GO
