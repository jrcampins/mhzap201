ALTER TABLE aplicacion ADD CONSTRAINT DF_aplicacion_0001_ZY DEFAULT (0) FOR version_aplicacion
GO
ALTER TABLE aplicacion ADD CONSTRAINT DF_aplicacion_0002_ZY DEFAULT (0) FOR es_publica
GO
ALTER TABLE archivo_datos_ext ADD CONSTRAINT DF_archivo_datos_ext_0001_ZY DEFAULT (0) FOR version_archivo_datos_ext
GO
ALTER TABLE archivo_datos_ext ADD CONSTRAINT DF_archivo_datos_ext_0002_ZY DEFAULT (0) FOR es_archivo_datos_ext_importado
GO
ALTER TABLE archivo_datos_ext ADD CONSTRAINT DF_archivo_datos_ext_0003_ZY DEFAULT (0) FOR es_archivo_datos_ext_inactivo
GO
ALTER TABLE clase_recurso ADD CONSTRAINT DF_clase_recurso_0001_ZY DEFAULT (0) FOR version_clase_recurso
GO
ALTER TABLE clase_recurso ADD CONSTRAINT DF_clase_recurso_0002_ZY DEFAULT (0) FOR es_clase_recurso_independiente
GO
ALTER TABLE clase_recurso ADD CONSTRAINT DF_clase_recurso_0003_ZY DEFAULT (0) FOR es_clase_recurso_sin_detalle
GO
ALTER TABLE clase_recurso ADD CONSTRAINT DF_clase_recurso_0004_ZY DEFAULT (0) FOR es_clase_recurso_con_arbol
GO
ALTER TABLE clase_recurso ADD CONSTRAINT DF_clase_recurso_0005_ZY DEFAULT (1) FOR numero_tipo_clase_recurso
GO
ALTER TABLE clase_recurso ADD CONSTRAINT DF_clase_recurso_0006_ZY DEFAULT (1) FOR es_clase_recurso_insertable
GO
ALTER TABLE clase_recurso ADD CONSTRAINT DF_clase_recurso_0007_ZY DEFAULT (1) FOR es_clase_recurso_modificable
GO
ALTER TABLE clase_recurso ADD CONSTRAINT DF_clase_recurso_0008_ZY DEFAULT (1) FOR es_clase_recurso_eliminable
GO
ALTER TABLE clase_recurso ADD CONSTRAINT DF_clase_recurso_0009_ZY DEFAULT (0) FOR es_clase_recurso_extendida
GO
ALTER TABLE clase_recurso ADD CONSTRAINT DF_clase_recurso_0010_ZY DEFAULT (0) FOR es_enumerador_con_numero
GO
ALTER TABLE clase_recurso_par ADD CONSTRAINT DF_clase_recurso_par_0001_ZY DEFAULT (0) FOR version_clase_recurso_par
GO
ALTER TABLE clase_recurso_par ADD CONSTRAINT DF_clase_recurso_par_0002_ZY DEFAULT (11) FOR numero_tipo_valor
GO
ALTER TABLE clase_recurso_par ADD CONSTRAINT DF_clase_recurso_par_0003_ZY DEFAULT (0) FOR es_parametro_omisible
GO
ALTER TABLE clase_recurso_par ADD CONSTRAINT DF_clase_recurso_par_0004_ZY DEFAULT (0) FOR es_parametro_inmutable
GO
ALTER TABLE clase_recurso_par ADD CONSTRAINT DF_clase_recurso_par_0005_ZY DEFAULT (0) FOR es_parametro_submit
GO
ALTER TABLE clase_recurso_par ADD CONSTRAINT DF_clase_recurso_par_0006_ZY DEFAULT (0) FOR es_parametro_primordial
GO
ALTER TABLE clase_recurso_par ADD CONSTRAINT DF_clase_recurso_par_0007_ZY DEFAULT (0) FOR es_parametro_maestro
GO
ALTER TABLE clase_recurso_par ADD CONSTRAINT DF_clase_recurso_par_0008_ZY DEFAULT (0) FOR es_parametro_segmento
GO
ALTER TABLE clase_recurso_par ADD CONSTRAINT DF_clase_recurso_par_0009_ZY DEFAULT (0) FOR es_parametro_sin_rastro
GO
ALTER TABLE clase_recurso_par ADD CONSTRAINT DF_clase_recurso_par_0010_ZY DEFAULT (0) FOR es_parametro_sincronizado
GO
ALTER TABLE clase_recurso_par ADD CONSTRAINT DF_clase_recurso_par_0011_ZY DEFAULT (0) FOR orden_presentacion
GO
ALTER TABLE clase_recurso_par ADD CONSTRAINT DF_clase_recurso_par_0012_ZY DEFAULT (0) FOR es_referencia_alternativa
GO
ALTER TABLE clase_recurso_par ADD CONSTRAINT DF_clase_recurso_par_0013_ZY DEFAULT (0) FOR orden_pagina_seleccion
GO
ALTER TABLE clase_recurso_sec ADD CONSTRAINT DF_clase_recurso_sec_0001_ZY DEFAULT (0) FOR version_clase_recurso_sec
GO
ALTER TABLE clase_recurso_sec ADD CONSTRAINT DF_clase_recurso_sec_0002_ZY DEFAULT (0) FOR orden_presentacion
GO
ALTER TABLE clase_recurso_sec ADD CONSTRAINT DF_clase_recurso_sec_0003_ZY DEFAULT (1) FOR es_pestana_detalle
GO
ALTER TABLE conjunto_segmento ADD CONSTRAINT DF_conjunto_segmento_0001_ZY DEFAULT (0) FOR version_conjunto_segmento
GO
ALTER TABLE dominio ADD CONSTRAINT DF_dominio_0001_ZY DEFAULT (0) FOR version_dominio
GO
ALTER TABLE dominio_paquete ADD CONSTRAINT DF_dominio_paquete_0001_ZY DEFAULT (0) FOR version_dominio_paquete
GO
ALTER TABLE dominio_parametro ADD CONSTRAINT DF_dominio_parametro_0001_ZY DEFAULT (0) FOR version_dominio_parametro
GO
ALTER TABLE elemento_segmento ADD CONSTRAINT DF_elemento_segmento_0001_ZY DEFAULT (0) FOR version_elemento_segmento
GO
ALTER TABLE etnia_indigena ADD CONSTRAINT DF_etnia_indigena_0001_ZY DEFAULT (0) FOR version_etnia_indigena
GO
ALTER TABLE ficha_hogar ADD CONSTRAINT DF_ficha_hogar_0001_ZY DEFAULT (0) FOR version_ficha_hogar
GO
ALTER TABLE ficha_hogar ADD CONSTRAINT DF_ficha_hogar_0002_ZY DEFAULT (0) FOR es_ficha_hogar_inactiva
GO
ALTER TABLE ficha_persona ADD CONSTRAINT DF_ficha_persona_0001_ZY DEFAULT (0) FOR version_ficha_persona
GO
ALTER TABLE ficha_persona ADD CONSTRAINT DF_ficha_persona_0002_ZY DEFAULT (0) FOR es_respondente
GO
ALTER TABLE ficha_persona ADD CONSTRAINT DF_ficha_persona_0003_ZY DEFAULT (1) FOR numero_siono_miembro_hogar
GO
ALTER TABLE ficha_persona ADD CONSTRAINT DF_ficha_persona_0004_ZY DEFAULT (0) FOR es_ficha_persona_inactiva
GO
ALTER TABLE filtro_cla_rec_fun ADD CONSTRAINT DF_filtro_cla_rec_fun_0001_ZY DEFAULT (0) FOR version_filtro_cla_rec_fun
GO
ALTER TABLE filtro_cla_rec_fun ADD CONSTRAINT DF_filtro_cla_rec_fun_0002_ZY DEFAULT (11) FOR numero_operador_com
GO
ALTER TABLE filtro_cla_rec_par ADD CONSTRAINT DF_filtro_cla_rec_par_0001_ZY DEFAULT (0) FOR version_filtro_cla_rec_par
GO
ALTER TABLE filtro_cla_rec_par ADD CONSTRAINT DF_filtro_cla_rec_par_0002_ZY DEFAULT (11) FOR numero_operador_com
GO
ALTER TABLE filtro_cla_rec_sec ADD CONSTRAINT DF_filtro_cla_rec_sec_0001_ZY DEFAULT (0) FOR version_filtro_cla_rec_sec
GO
ALTER TABLE filtro_cla_rec_sec ADD CONSTRAINT DF_filtro_cla_rec_sec_0002_ZY DEFAULT (11) FOR numero_operador_com
GO
ALTER TABLE filtro_cla_rec_vin ADD CONSTRAINT DF_filtro_cla_rec_vin_0001_ZY DEFAULT (0) FOR version_filtro_cla_rec_vin
GO
ALTER TABLE filtro_cla_rec_vin ADD CONSTRAINT DF_filtro_cla_rec_vin_0002_ZY DEFAULT (11) FOR numero_operador_com
GO
ALTER TABLE filtro_funcion ADD CONSTRAINT DF_filtro_funcion_0001_ZY DEFAULT (0) FOR version_filtro_funcion
GO
ALTER TABLE filtro_funcion ADD CONSTRAINT DF_filtro_funcion_0002_ZY DEFAULT (0) FOR es_publico
GO
ALTER TABLE filtro_funcion_par ADD CONSTRAINT DF_filtro_funcion_par_0001_ZY DEFAULT (0) FOR version_filtro_funcion_par
GO
ALTER TABLE filtro_funcion_par ADD CONSTRAINT DF_filtro_funcion_par_0002_ZY DEFAULT (11) FOR numero_operador_com
GO
ALTER TABLE funcion ADD CONSTRAINT DF_funcion_0001_ZY DEFAULT (0) FOR version_funcion
GO
ALTER TABLE funcion ADD CONSTRAINT DF_funcion_0002_ZY DEFAULT (0) FOR numero_tipo_rastro_fun
GO
ALTER TABLE funcion ADD CONSTRAINT DF_funcion_0003_ZY DEFAULT (0) FOR es_publica
GO
ALTER TABLE funcion ADD CONSTRAINT DF_funcion_0004_ZY DEFAULT (0) FOR es_programatica
GO
ALTER TABLE funcion ADD CONSTRAINT DF_funcion_0005_ZY DEFAULT (0) FOR es_personalizada
GO
ALTER TABLE funcion ADD CONSTRAINT DF_funcion_0006_ZY DEFAULT (0) FOR es_segmentada
GO
ALTER TABLE funcion_parametro ADD CONSTRAINT DF_funcion_parametro_0001_ZY DEFAULT (0) FOR version_funcion_parametro
GO
ALTER TABLE funcion_parametro ADD CONSTRAINT DF_funcion_parametro_0002_ZY DEFAULT (11) FOR numero_tipo_valor
GO
ALTER TABLE funcion_parametro ADD CONSTRAINT DF_funcion_parametro_0003_ZY DEFAULT (0) FOR es_parametro_sin_rastro
GO
ALTER TABLE funcion_parametro ADD CONSTRAINT DF_funcion_parametro_0004_ZY DEFAULT (0) FOR es_parametro_segmento
GO
ALTER TABLE funcionario ADD CONSTRAINT DF_funcionario_0001_ZY DEFAULT (0) FOR version_funcionario
GO
ALTER TABLE grupo_aplicacion ADD CONSTRAINT DF_grupo_aplicacion_0001_ZY DEFAULT (0) FOR version_grupo_aplicacion
GO
ALTER TABLE grupo_proceso ADD CONSTRAINT DF_grupo_proceso_0001_ZY DEFAULT (0) FOR version_grupo_proceso
GO
ALTER TABLE informe ADD CONSTRAINT DF_informe_0001_ZY DEFAULT (0) FOR version_informe
GO
ALTER TABLE log_imp_cen ADD CONSTRAINT DF_log_imp_cen_0001_ZY DEFAULT (0) FOR version_log_imp_cen
GO
ALTER TABLE log_imp_cen ADD CONSTRAINT DF_log_imp_cen_0002_ZY DEFAULT (0) FOR es_importado
GO
ALTER TABLE log_imp_cen ADD CONSTRAINT DF_log_imp_cen_0003_ZY DEFAULT (getdate()) FOR fecha_hora_transaccion
GO
ALTER TABLE log_imp_deu ADD CONSTRAINT DF_log_imp_deu_0001_ZY DEFAULT (0) FOR version_log_imp_deu
GO
ALTER TABLE log_imp_deu ADD CONSTRAINT DF_log_imp_deu_0002_ZY DEFAULT (0) FOR es_importado
GO
ALTER TABLE log_imp_deu ADD CONSTRAINT DF_log_imp_deu_0003_ZY DEFAULT (getdate()) FOR fecha_hora_transaccion
GO
ALTER TABLE log_imp_emp ADD CONSTRAINT DF_log_imp_emp_0001_ZY DEFAULT (0) FOR version_log_imp_emp
GO
ALTER TABLE log_imp_emp ADD CONSTRAINT DF_log_imp_emp_0002_ZY DEFAULT (0) FOR es_importado
GO
ALTER TABLE log_imp_emp ADD CONSTRAINT DF_log_imp_emp_0003_ZY DEFAULT (getdate()) FOR fecha_hora_transaccion
GO
ALTER TABLE log_imp_fal ADD CONSTRAINT DF_log_imp_fal_0001_ZY DEFAULT (0) FOR version_log_imp_fal
GO
ALTER TABLE log_imp_fal ADD CONSTRAINT DF_log_imp_fal_0002_ZY DEFAULT (0) FOR es_importado
GO
ALTER TABLE log_imp_fal ADD CONSTRAINT DF_log_imp_fal_0003_ZY DEFAULT (getdate()) FOR fecha_hora_transaccion
GO
ALTER TABLE log_imp_hog ADD CONSTRAINT DF_log_imp_hog_0001_ZY DEFAULT (0) FOR version_log_imp_hog
GO
ALTER TABLE log_imp_hog ADD CONSTRAINT DF_log_imp_hog_0002_ZY DEFAULT (0) FOR es_importado
GO
ALTER TABLE log_imp_hog ADD CONSTRAINT DF_log_imp_hog_0003_ZY DEFAULT (getdate()) FOR fecha_hora_transaccion
GO
ALTER TABLE log_imp_ids ADD CONSTRAINT DF_log_imp_ids_0001_ZY DEFAULT (0) FOR version_log_imp_ids
GO
ALTER TABLE log_imp_ids ADD CONSTRAINT DF_log_imp_ids_0002_ZY DEFAULT (0) FOR es_importado
GO
ALTER TABLE log_imp_ids ADD CONSTRAINT DF_log_imp_ids_0003_ZY DEFAULT (getdate()) FOR fecha_hora_transaccion
GO
ALTER TABLE log_imp_jub ADD CONSTRAINT DF_log_imp_jub_0001_ZY DEFAULT (0) FOR version_log_imp_jub
GO
ALTER TABLE log_imp_jub ADD CONSTRAINT DF_log_imp_jub_0002_ZY DEFAULT (0) FOR es_importado
GO
ALTER TABLE log_imp_jub ADD CONSTRAINT DF_log_imp_jub_0003_ZY DEFAULT (getdate()) FOR fecha_hora_transaccion
GO
ALTER TABLE log_imp_pen ADD CONSTRAINT DF_log_imp_pen_0001_ZY DEFAULT (0) FOR version_log_imp_pen
GO
ALTER TABLE log_imp_pen ADD CONSTRAINT DF_log_imp_pen_0002_ZY DEFAULT (0) FOR es_importado
GO
ALTER TABLE log_imp_pen ADD CONSTRAINT DF_log_imp_pen_0003_ZY DEFAULT (getdate()) FOR fecha_hora_transaccion
GO
ALTER TABLE log_imp_per ADD CONSTRAINT DF_log_imp_per_0001_ZY DEFAULT (0) FOR version_log_imp_per
GO
ALTER TABLE log_imp_per ADD CONSTRAINT DF_log_imp_per_0002_ZY DEFAULT (0) FOR es_importado
GO
ALTER TABLE log_imp_per ADD CONSTRAINT DF_log_imp_per_0003_ZY DEFAULT (getdate()) FOR fecha_hora_transaccion
GO
ALTER TABLE log_imp_pot ADD CONSTRAINT DF_log_imp_pot_0001_ZY DEFAULT (0) FOR version_log_imp_pot
GO
ALTER TABLE log_imp_pot ADD CONSTRAINT DF_log_imp_pot_0002_ZY DEFAULT (0) FOR es_importado
GO
ALTER TABLE log_imp_pot ADD CONSTRAINT DF_log_imp_pot_0003_ZY DEFAULT (getdate()) FOR fecha_hora_transaccion
GO
ALTER TABLE log_imp_sub ADD CONSTRAINT DF_log_imp_sub_0001_ZY DEFAULT (0) FOR version_log_imp_sub
GO
ALTER TABLE log_imp_sub ADD CONSTRAINT DF_log_imp_sub_0002_ZY DEFAULT (0) FOR es_importado
GO
ALTER TABLE log_imp_sub ADD CONSTRAINT DF_log_imp_sub_0003_ZY DEFAULT (getdate()) FOR fecha_hora_transaccion
GO
ALTER TABLE log_imp_ubi ADD CONSTRAINT DF_log_imp_ubi_0001_ZY DEFAULT (0) FOR version_log_imp_ubi
GO
ALTER TABLE log_imp_ubi ADD CONSTRAINT DF_log_imp_ubi_0002_ZY DEFAULT (0) FOR es_importado
GO
ALTER TABLE log_imp_ubi ADD CONSTRAINT DF_log_imp_ubi_0003_ZY DEFAULT (getdate()) FOR fecha_hora_transaccion
GO
ALTER TABLE log_pro_acr_pot_ben ADD CONSTRAINT DF_log_pro_acr_pot_ben_0001_ZY DEFAULT (0) FOR version_log_pro_acr_pot_ben
GO
ALTER TABLE log_pro_acr_pot_ben ADD CONSTRAINT DF_log_pro_acr_pot_ben_0002_ZY DEFAULT (getdate()) FOR fecha_registro_pot_ben
GO
ALTER TABLE log_pro_acr_pot_ben ADD CONSTRAINT DF_log_pro_acr_pot_ben_0003_ZY DEFAULT (0) FOR es_procesado
GO
ALTER TABLE log_pro_acr_pot_ben ADD CONSTRAINT DF_log_pro_acr_pot_ben_0004_ZY DEFAULT (getdate()) FOR fecha_hora_transaccion
GO
ALTER TABLE log_pro_den_pen_obj ADD CONSTRAINT DF_log_pro_den_pen_obj_0001_ZY DEFAULT (0) FOR version_log_pro_den_pen_obj
GO
ALTER TABLE log_pro_den_pen_obj ADD CONSTRAINT DF_log_pro_den_pen_obj_0002_ZY DEFAULT (0) FOR es_procesado
GO
ALTER TABLE log_pro_den_pen_obj ADD CONSTRAINT DF_log_pro_den_pen_obj_0003_ZY DEFAULT (getdate()) FOR fecha_hora_transaccion
GO
ALTER TABLE log_pro_imp_arc_ext ADD CONSTRAINT DF_log_pro_imp_arc_ext_0001_ZY DEFAULT (0) FOR version_log_pro_imp_arc_ext
GO
ALTER TABLE log_pro_imp_arc_ext ADD CONSTRAINT DF_log_pro_imp_arc_ext_0002_ZY DEFAULT (0) FOR es_importado
GO
ALTER TABLE log_pro_imp_arc_ext ADD CONSTRAINT DF_log_pro_imp_arc_ext_0003_ZY DEFAULT (getdate()) FOR fecha_hora_transaccion
GO
ALTER TABLE log_pro_oto_pen_apr ADD CONSTRAINT DF_log_pro_oto_pen_apr_0001_ZY DEFAULT (0) FOR version_log_pro_oto_pen_apr
GO
ALTER TABLE log_pro_oto_pen_apr ADD CONSTRAINT DF_log_pro_oto_pen_apr_0002_ZY DEFAULT (0) FOR es_procesado
GO
ALTER TABLE log_pro_oto_pen_apr ADD CONSTRAINT DF_log_pro_oto_pen_apr_0003_ZY DEFAULT (getdate()) FOR fecha_hora_transaccion
GO
ALTER TABLE log_pro_pre_pro_pag ADD CONSTRAINT DF_log_pro_pre_pro_pag_0001_ZY DEFAULT (0) FOR version_log_pro_pre_pro_pag
GO
ALTER TABLE log_pro_pre_pro_pag ADD CONSTRAINT DF_log_pro_pre_pro_pag_0002_ZY DEFAULT (getdate()) FOR fecha_solicitud_pension
GO
ALTER TABLE log_pro_pre_pro_pag ADD CONSTRAINT DF_log_pro_pre_pro_pag_0003_ZY DEFAULT (0) FOR es_procesado
GO
ALTER TABLE log_pro_pre_pro_pag ADD CONSTRAINT DF_log_pro_pre_pro_pag_0004_ZY DEFAULT (getdate()) FOR fecha_hora_transaccion
GO
ALTER TABLE log_pro_ver_ele_pen ADD CONSTRAINT DF_log_pro_ver_ele_pen_0001_ZY DEFAULT (0) FOR version_log_pro_ver_ele_pen
GO
ALTER TABLE log_pro_ver_ele_pen ADD CONSTRAINT DF_log_pro_ver_ele_pen_0002_ZY DEFAULT (0) FOR es_procesado
GO
ALTER TABLE log_pro_ver_ele_pen ADD CONSTRAINT DF_log_pro_ver_ele_pen_0003_ZY DEFAULT (getdate()) FOR fecha_hora_transaccion
GO
ALTER TABLE mensaje ADD CONSTRAINT DF_mensaje_0001_ZY DEFAULT (0) FOR version_mensaje
GO
ALTER TABLE nivel_opcion_menu ADD CONSTRAINT DF_nivel_opcion_menu_0001_ZY DEFAULT (2) FOR digitos_nivel_opcion_menu
GO
ALTER TABLE nivel_ubicacion ADD CONSTRAINT DF_nivel_ubicacion_0001_ZY DEFAULT (2) FOR digitos_nivel_ubicacion
GO
ALTER TABLE objecion_ele_pen ADD CONSTRAINT DF_objecion_ele_pen_0001_ZY DEFAULT (0) FOR version_objecion_ele_pen
GO
ALTER TABLE objecion_ele_pen ADD CONSTRAINT DF_objecion_ele_pen_0002_ZY DEFAULT (0) FOR es_objecion_ele_pen_inactiva
GO
ALTER TABLE opcion_menu ADD CONSTRAINT DF_opcion_menu_0001_ZY DEFAULT (0) FOR version_opcion_menu
GO
ALTER TABLE opcion_menu ADD CONSTRAINT DF_opcion_menu_0002_ZY DEFAULT (0) FOR es_opcion_menu_inactiva
GO
ALTER TABLE opcion_menu ADD CONSTRAINT DF_opcion_menu_0003_ZY DEFAULT (0) FOR es_opcion_menu_sincronizada
GO
ALTER TABLE opcion_menu_plus ADD CONSTRAINT DF_opcion_menu_plus_0001_ZY DEFAULT (0) FOR version_opcion_menu
GO
ALTER TABLE opcion_sistema ADD CONSTRAINT DF_opcion_sistema_0001_ZY DEFAULT (0) FOR version_opcion_sistema
GO
ALTER TABLE pagina ADD CONSTRAINT DF_pagina_0001_ZY DEFAULT (0) FOR version_pagina
GO
ALTER TABLE pagina ADD CONSTRAINT DF_pagina_0002_ZY DEFAULT (0) FOR es_publica
GO
ALTER TABLE pagina_funcion ADD CONSTRAINT DF_pagina_funcion_0001_ZY DEFAULT (0) FOR version_pagina_funcion
GO
ALTER TABLE pagina_funcion ADD CONSTRAINT DF_pagina_funcion_0002_ZY DEFAULT (0) FOR es_funcion_inicial
GO
ALTER TABLE pagina_usuario ADD CONSTRAINT DF_pagina_usuario_0001_ZY DEFAULT (0) FOR version_pagina_usuario
GO
ALTER TABLE paquete ADD CONSTRAINT DF_paquete_0001_ZY DEFAULT (0) FOR version_paquete
GO
ALTER TABLE parametro ADD CONSTRAINT DF_parametro_0001_ZY DEFAULT (0) FOR version_parametro
GO
ALTER TABLE parametro_global ADD CONSTRAINT DF_parametro_global_0001_ZY DEFAULT (0) FOR es_control_cer_vida_activo
GO
ALTER TABLE parametro_global ADD CONSTRAINT DF_parametro_global_0002_ZY DEFAULT (0) FOR es_control_cobro_pension_activ
GO
ALTER TABLE parametro_global ADD CONSTRAINT DF_parametro_global_0003_ZY DEFAULT (0) FOR es_control_reproceso_pen_activ
GO
ALTER TABLE parametro_global ADD CONSTRAINT DF_parametro_global_0004_ZY DEFAULT (0) FOR limite_pensiones
GO
ALTER TABLE persona ADD CONSTRAINT DF_persona_0001_ZY DEFAULT (0) FOR version_persona
GO
ALTER TABLE persona ADD CONSTRAINT DF_persona_0002_ZY DEFAULT (1) FOR es_paraguayo_natural
GO
ALTER TABLE persona ADD CONSTRAINT DF_persona_0003_ZY DEFAULT (0) FOR es_indigena
GO
ALTER TABLE persona ADD CONSTRAINT DF_persona_0004_ZY DEFAULT (0) FOR es_certificado_vida_anulado
GO
ALTER TABLE persona ADD CONSTRAINT DF_persona_0005_ZY DEFAULT (0) FOR es_cer_defuncion_anulado
GO
ALTER TABLE persona ADD CONSTRAINT DF_persona_0006_ZY DEFAULT (0) FOR es_persona_con_empleo
GO
ALTER TABLE persona ADD CONSTRAINT DF_persona_0007_ZY DEFAULT (0) FOR es_persona_con_jubilacion
GO
ALTER TABLE persona ADD CONSTRAINT DF_persona_0008_ZY DEFAULT (0) FOR es_persona_con_pension
GO
ALTER TABLE persona ADD CONSTRAINT DF_persona_0009_ZY DEFAULT (0) FOR es_persona_con_subsidio
GO
ALTER TABLE persona ADD CONSTRAINT DF_persona_0010_ZY DEFAULT (0) FOR es_persona_con_deuda
GO
ALTER TABLE persona ADD CONSTRAINT DF_persona_0011_ZY DEFAULT (0) FOR es_persona_con_pena_judicial
GO
ALTER TABLE persona ADD CONSTRAINT DF_persona_0012_ZY DEFAULT (0) FOR es_persona_con_cer_vida
GO
ALTER TABLE persona ADD CONSTRAINT DF_persona_0013_ZY DEFAULT (0) FOR es_persona_con_carta_renuncia
GO
ALTER TABLE persona ADD CONSTRAINT DF_persona_0014_ZY DEFAULT (0) FOR es_persona_elegible_para_pen
GO
ALTER TABLE persona ADD CONSTRAINT DF_persona_0015_ZY DEFAULT (0) FOR es_persona_acreditada_para_pen
GO
ALTER TABLE persona ADD CONSTRAINT DF_persona_0016_ZY DEFAULT (0) FOR es_persona_con_copia_cedula
GO
ALTER TABLE persona ADD CONSTRAINT DF_persona_0017_ZY DEFAULT (0) FOR es_persona_con_declaracion_jur
GO
ALTER TABLE potencial_ben ADD CONSTRAINT DF_potencial_ben_0001_ZY DEFAULT (0) FOR version_potencial_ben
GO
ALTER TABLE potencial_ben ADD CONSTRAINT DF_potencial_ben_0002_ZY DEFAULT (1) FOR es_paraguayo_natural
GO
ALTER TABLE potencial_ben ADD CONSTRAINT DF_potencial_ben_0003_ZY DEFAULT (0) FOR es_indigena
GO
ALTER TABLE potencial_ben ADD CONSTRAINT DF_potencial_ben_0004_ZY DEFAULT (0) FOR es_persona_con_empleo
GO
ALTER TABLE potencial_ben ADD CONSTRAINT DF_potencial_ben_0005_ZY DEFAULT (0) FOR es_persona_con_jubilacion
GO
ALTER TABLE potencial_ben ADD CONSTRAINT DF_potencial_ben_0006_ZY DEFAULT (0) FOR es_persona_con_pension
GO
ALTER TABLE potencial_ben ADD CONSTRAINT DF_potencial_ben_0007_ZY DEFAULT (0) FOR es_persona_con_subsidio
GO
ALTER TABLE potencial_ben ADD CONSTRAINT DF_potencial_ben_0008_ZY DEFAULT (0) FOR es_persona_con_deuda
GO
ALTER TABLE potencial_ben ADD CONSTRAINT DF_potencial_ben_0009_ZY DEFAULT (0) FOR es_persona_con_pena_judicial
GO
ALTER TABLE potencial_ben ADD CONSTRAINT DF_potencial_ben_0010_ZY DEFAULT (0) FOR es_persona_con_cer_vida
GO
ALTER TABLE potencial_ben ADD CONSTRAINT DF_potencial_ben_0011_ZY DEFAULT (0) FOR es_persona_con_carta_renuncia
GO
ALTER TABLE potencial_ben ADD CONSTRAINT DF_potencial_ben_0012_ZY DEFAULT (getdate()) FOR fecha_registro_pot_ben
GO
ALTER TABLE potencial_ben ADD CONSTRAINT DF_potencial_ben_0013_ZY DEFAULT (user_id()) FOR id_usuario_reg_pot_ben
GO
ALTER TABLE potencial_ben ADD CONSTRAINT DF_potencial_ben_0014_ZY DEFAULT (0) FOR es_potencial_ben_inactivo
GO
ALTER TABLE proceso ADD CONSTRAINT DF_proceso_0001_ZY DEFAULT (0) FOR version_proceso
GO
ALTER TABLE proveedor_dat_ext ADD CONSTRAINT DF_proveedor_dat_ext_0001_ZY DEFAULT (0) FOR version_proveedor_dat_ext
GO
ALTER TABLE rastro_funcion ADD CONSTRAINT DF_rastro_funcion_0001_ZY DEFAULT (getdate()) FOR fecha_hora_ejecucion
GO
ALTER TABLE rastro_informe ADD CONSTRAINT DF_rastro_informe_0001_ZY DEFAULT (0) FOR version_rastro_informe
GO
ALTER TABLE rastro_informe ADD CONSTRAINT DF_rastro_informe_0002_ZY DEFAULT (getdate()) FOR fecha_hora_inicio_ejecucion
GO
ALTER TABLE rastro_informe ADD CONSTRAINT DF_rastro_informe_0003_ZY DEFAULT (11) FOR numero_condicion_eje_fun
GO
ALTER TABLE rastro_proceso ADD CONSTRAINT DF_rastro_proceso_0001_ZY DEFAULT (0) FOR version_rastro_proceso
GO
ALTER TABLE rastro_proceso ADD CONSTRAINT DF_rastro_proceso_0002_ZY DEFAULT (getdate()) FOR fecha_hora_inicio_ejecucion
GO
ALTER TABLE rastro_proceso ADD CONSTRAINT DF_rastro_proceso_0003_ZY DEFAULT (11) FOR numero_condicion_eje_fun
GO
ALTER TABLE rastro_proceso ADD CONSTRAINT DF_rastro_proceso_0004_ZY DEFAULT (0) FOR subprocesos
GO
ALTER TABLE rastro_proceso ADD CONSTRAINT DF_rastro_proceso_0005_ZY DEFAULT (0) FOR subprocesos_pendientes
GO
ALTER TABLE rastro_proceso ADD CONSTRAINT DF_rastro_proceso_0006_ZY DEFAULT (0) FOR subprocesos_en_progreso
GO
ALTER TABLE rastro_proceso ADD CONSTRAINT DF_rastro_proceso_0007_ZY DEFAULT (0) FOR subprocesos_sin_errores
GO
ALTER TABLE rastro_proceso ADD CONSTRAINT DF_rastro_proceso_0008_ZY DEFAULT (0) FOR subprocesos_con_errores
GO
ALTER TABLE rastro_proceso ADD CONSTRAINT DF_rastro_proceso_0009_ZY DEFAULT (0) FOR subprocesos_cancelados
GO
ALTER TABLE recurso ADD CONSTRAINT DF_recurso_0001_ZY DEFAULT (0) FOR version_recurso
GO
ALTER TABLE recurso ADD CONSTRAINT DF_recurso_0002_ZY DEFAULT (0) FOR es_recurso_inactivo
GO
ALTER TABLE rol ADD CONSTRAINT DF_rol_0001_ZY DEFAULT (0) FOR version_rol
GO
ALTER TABLE rol_aplicacion ADD CONSTRAINT DF_rol_aplicacion_0001_ZY DEFAULT (0) FOR version_rol_aplicacion
GO
ALTER TABLE rol_filtro_funcion ADD CONSTRAINT DF_rol_filtro_funcion_0001_ZY DEFAULT (0) FOR version_rol_filtro_funcion
GO
ALTER TABLE rol_funcion ADD CONSTRAINT DF_rol_funcion_0001_ZY DEFAULT (0) FOR version_rol_funcion
GO
ALTER TABLE rol_pagina ADD CONSTRAINT DF_rol_pagina_0001_ZY DEFAULT (0) FOR version_rol_pagina
GO
ALTER TABLE rol_usuario ADD CONSTRAINT DF_rol_usuario_0001_ZY DEFAULT (0) FOR version_rol_usuario
GO
ALTER TABLE ubicacion ADD CONSTRAINT DF_ubicacion_0001_ZY DEFAULT (0) FOR version_ubicacion
GO
ALTER TABLE ubicacion_plus ADD CONSTRAINT DF_ubicacion_plus_0001_ZY DEFAULT (0) FOR version_ubicacion
GO
ALTER TABLE usuario ADD CONSTRAINT DF_usuario_0001_ZY DEFAULT (0) FOR version_usuario
GO
ALTER TABLE usuario ADD CONSTRAINT DF_usuario_0002_ZY DEFAULT (0) FOR es_super_usuario
GO
ALTER TABLE usuario ADD CONSTRAINT DF_usuario_0003_ZY DEFAULT (0) FOR es_usuario_especial
GO
ALTER TABLE usuario ADD CONSTRAINT DF_usuario_0004_ZY DEFAULT (0) FOR es_usuario_inactivo
GO
ALTER TABLE usuario ADD CONSTRAINT DF_usuario_0005_ZY DEFAULT (0) FOR es_usuario_modificado
GO
ALTER TABLE visita_censo ADD CONSTRAINT DF_visita_censo_0001_ZY DEFAULT (0) FOR version_visita_censo
GO
