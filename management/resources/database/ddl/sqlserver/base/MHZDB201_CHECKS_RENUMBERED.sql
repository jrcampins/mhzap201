ALTER TABLE aplicacion ADD CONSTRAINT CC_aplicacion_0001_ZY CHECK ([es_publica] >= 0 and [es_publica] <= 1)
GO
ALTER TABLE archivo_datos_ext ADD CONSTRAINT CC_archivo_datos_ext_0001_ZY CHECK ([es_archivo_datos_ext_importado] >= 0 and [es_archivo_datos_ext_importado] <= 1)
GO
ALTER TABLE archivo_datos_ext ADD CONSTRAINT CC_archivo_datos_ext_0002_ZY CHECK ([es_archivo_datos_ext_inactivo] >= 0 and [es_archivo_datos_ext_inactivo] <= 1)
GO
ALTER TABLE clase_recurso ADD CONSTRAINT CC_clase_recurso_0001_ZY CHECK ([es_clase_recurso_independiente] >= 0 and [es_clase_recurso_independiente] <= 1)
GO
ALTER TABLE clase_recurso ADD CONSTRAINT CC_clase_recurso_0002_ZY CHECK ([es_clase_recurso_sin_detalle] >= 0 and [es_clase_recurso_sin_detalle] <= 1)
GO
ALTER TABLE clase_recurso ADD CONSTRAINT CC_clase_recurso_0003_ZY CHECK ([es_clase_recurso_con_arbol] >= 0 and [es_clase_recurso_con_arbol] <= 1)
GO
ALTER TABLE clase_recurso ADD CONSTRAINT CC_clase_recurso_0004_ZY CHECK ([es_clase_recurso_insertable] >= 0 and [es_clase_recurso_insertable] <= 1)
GO
ALTER TABLE clase_recurso ADD CONSTRAINT CC_clase_recurso_0005_ZY CHECK ([es_clase_recurso_modificable] >= 0 and [es_clase_recurso_modificable] <= 1)
GO
ALTER TABLE clase_recurso ADD CONSTRAINT CC_clase_recurso_0006_ZY CHECK ([es_clase_recurso_eliminable] >= 0 and [es_clase_recurso_eliminable] <= 1)
GO
ALTER TABLE clase_recurso ADD CONSTRAINT CC_clase_recurso_0007_ZY CHECK ([es_clase_recurso_extendida] >= 0 and [es_clase_recurso_extendida] <= 1)
GO
ALTER TABLE clase_recurso ADD CONSTRAINT CC_clase_recurso_0008_ZY CHECK ([es_enumerador_con_numero] >= 0 and [es_enumerador_con_numero] <= 1)
GO
ALTER TABLE clase_recurso_par ADD CONSTRAINT TC_clase_recurso_par_0001_ZY CHECK ([id_lista_valor] is null or [id_clase_objeto_valor] is null)
GO
ALTER TABLE clase_recurso_par ADD CONSTRAINT TC_clase_recurso_par_0002_ZY CHECK ([id_lista_valor] is null or [id_clase_recurso_valor] is null)
GO
ALTER TABLE clase_recurso_par ADD CONSTRAINT TC_clase_recurso_par_0003_ZY CHECK ([id_clase_objeto_valor] is null or [id_clase_recurso_valor] is null)
GO
ALTER TABLE clase_recurso_par ADD CONSTRAINT TC_clase_recurso_par_0004_ZY CHECK ([numero_tipo_valor] = 21 or [id_lista_valor] is null)
GO
ALTER TABLE clase_recurso_par ADD CONSTRAINT TC_clase_recurso_par_0005_ZY CHECK ([numero_tipo_valor] <> 21 or [id_lista_valor] is not null)
GO
ALTER TABLE clase_recurso_par ADD CONSTRAINT TC_clase_recurso_par_0006_ZY CHECK ([numero_tipo_valor] = 22 or [id_clase_objeto_valor] is null)
GO
ALTER TABLE clase_recurso_par ADD CONSTRAINT TC_clase_recurso_par_0007_ZY CHECK ([numero_tipo_valor] <> 22 or [id_clase_objeto_valor] is not null)
GO
ALTER TABLE clase_recurso_par ADD CONSTRAINT TC_clase_recurso_par_0008_ZY CHECK ([numero_tipo_valor] = 23 or [id_clase_recurso_valor] is null)
GO
ALTER TABLE clase_recurso_par ADD CONSTRAINT TC_clase_recurso_par_0009_ZY CHECK ([numero_tipo_valor] <> 23 or [id_clase_recurso_valor] is not null)
GO
ALTER TABLE clase_recurso_par ADD CONSTRAINT CC_clase_recurso_par_0001_ZY CHECK ([es_parametro_omisible] >= 0 and [es_parametro_omisible] <= 1)
GO
ALTER TABLE clase_recurso_par ADD CONSTRAINT CC_clase_recurso_par_0002_ZY CHECK ([es_parametro_inmutable] >= 0 and [es_parametro_inmutable] <= 1)
GO
ALTER TABLE clase_recurso_par ADD CONSTRAINT CC_clase_recurso_par_0003_ZY CHECK ([es_parametro_submit] >= 0 and [es_parametro_submit] <= 1)
GO
ALTER TABLE clase_recurso_par ADD CONSTRAINT CC_clase_recurso_par_0004_ZY CHECK ([es_parametro_primordial] >= 0 and [es_parametro_primordial] <= 1)
GO
ALTER TABLE clase_recurso_par ADD CONSTRAINT CC_clase_recurso_par_0005_ZY CHECK ([es_parametro_maestro] >= 0 and [es_parametro_maestro] <= 1)
GO
ALTER TABLE clase_recurso_par ADD CONSTRAINT CC_clase_recurso_par_0006_ZY CHECK ([es_parametro_segmento] >= 0 and [es_parametro_segmento] <= 1)
GO
ALTER TABLE clase_recurso_par ADD CONSTRAINT CC_clase_recurso_par_0007_ZY CHECK ([es_parametro_sin_rastro] >= 0 and [es_parametro_sin_rastro] <= 1)
GO
ALTER TABLE clase_recurso_par ADD CONSTRAINT CC_clase_recurso_par_0008_ZY CHECK ([es_parametro_sincronizado] >= 0 and [es_parametro_sincronizado] <= 1)
GO
ALTER TABLE clase_recurso_par ADD CONSTRAINT CC_clase_recurso_par_0009_ZY CHECK ([orden_presentacion] >= 0 and [orden_presentacion] <= 1000000000)
GO
ALTER TABLE clase_recurso_par ADD CONSTRAINT CC_clase_recurso_par_0010_ZY CHECK ([es_referencia_alternativa] >= 0 and [es_referencia_alternativa] <= 1)
GO
ALTER TABLE clase_recurso_sec ADD CONSTRAINT CC_clase_recurso_sec_0001_ZY CHECK ([orden_presentacion] >= 0 and [orden_presentacion] <= 1000)
GO
ALTER TABLE clase_recurso_sec ADD CONSTRAINT CC_clase_recurso_sec_0002_ZY CHECK ([es_pestana_detalle] >= 0 and [es_pestana_detalle] <= 1)
GO
ALTER TABLE ficha_hogar ADD CONSTRAINT TC_ficha_hogar_0001_ZY CHECK ([total_hombres] >= 0 and [total_hombres] <= [total_personas])
GO
ALTER TABLE ficha_hogar ADD CONSTRAINT TC_ficha_hogar_0002_ZY CHECK ([total_mujeres] >= 0 and [total_mujeres] <= [total_personas])
GO
ALTER TABLE ficha_hogar ADD CONSTRAINT TC_ficha_hogar_0003_ZY CHECK ([total_personas] = [total_hombres] + [total_mujeres])
GO
ALTER TABLE ficha_hogar ADD CONSTRAINT TC_ficha_hogar_0004_ZY CHECK ([numero_tipo_ocupacion_viv] = 6 or [otro_tipo_ocupacion_viv] is null)
GO
ALTER TABLE ficha_hogar ADD CONSTRAINT TC_ficha_hogar_0005_ZY CHECK ([numero_tipo_ocupacion_viv] <> 6 or [otro_tipo_ocupacion_viv] is not null)
GO
ALTER TABLE ficha_hogar ADD CONSTRAINT TC_ficha_hogar_0006_ZY CHECK ([cantidad_dormitorios] >= 0 and [cantidad_dormitorios] <= [cantidad_piezas])
GO
ALTER TABLE ficha_hogar ADD CONSTRAINT TC_ficha_hogar_0007_ZY CHECK ([numero_siono_telefono_celular] = 1 or [numero_telefono_celular] is null)
GO
ALTER TABLE ficha_hogar ADD CONSTRAINT TC_ficha_hogar_0008_ZY CHECK ([numero_siono_telefono_celular] <> 1 or [numero_telefono_celular] is not null)
GO
ALTER TABLE ficha_hogar ADD CONSTRAINT TC_ficha_hogar_0009_ZY CHECK ([numero_siono_tlf_linea_baja] = 1 or [numero_telefono_linea_baja] is null)
GO
ALTER TABLE ficha_hogar ADD CONSTRAINT TC_ficha_hogar_0010_ZY CHECK ([numero_siono_tlf_linea_baja] <> 1 or [numero_telefono_linea_baja] is not null)
GO
ALTER TABLE ficha_hogar ADD CONSTRAINT CC_ficha_hogar_0001_ZY CHECK ([huso_utm] is null or [huso_utm] >= 1)
GO
ALTER TABLE ficha_hogar ADD CONSTRAINT CC_ficha_hogar_0002_ZY CHECK ([huso_utm] is null or [huso_utm] <= 60)
GO
ALTER TABLE ficha_hogar ADD CONSTRAINT CC_ficha_hogar_0003_ZY CHECK ([franja_utm] is null or [franja_utm] >= 'C')
GO
ALTER TABLE ficha_hogar ADD CONSTRAINT CC_ficha_hogar_0004_ZY CHECK ([franja_utm] is null or [franja_utm] <= 'X')
GO
ALTER TABLE ficha_hogar ADD CONSTRAINT CC_ficha_hogar_0005_ZY CHECK ([franja_utm] is null or [franja_utm] <> 'I')
GO
ALTER TABLE ficha_hogar ADD CONSTRAINT CC_ficha_hogar_0006_ZY CHECK ([franja_utm] is null or [franja_utm] <> 'O')
GO
ALTER TABLE ficha_hogar ADD CONSTRAINT CC_ficha_hogar_0007_ZY CHECK ([distancia_este_utm] is null or [distancia_este_utm] >= 0)
GO
ALTER TABLE ficha_hogar ADD CONSTRAINT CC_ficha_hogar_0008_ZY CHECK ([distancia_este_utm] is null or [distancia_este_utm] < 1000000)
GO
ALTER TABLE ficha_hogar ADD CONSTRAINT CC_ficha_hogar_0009_ZY CHECK ([distancia_norte_utm] is null or [distancia_norte_utm] >= 0)
GO
ALTER TABLE ficha_hogar ADD CONSTRAINT CC_ficha_hogar_0010_ZY CHECK ([distancia_norte_utm] is null or [distancia_norte_utm] < 10000000)
GO
ALTER TABLE ficha_hogar ADD CONSTRAINT CC_ficha_hogar_0011_ZY CHECK ([numero_formulario] > 0 and [numero_formulario] < 1000000)
GO
ALTER TABLE ficha_hogar ADD CONSTRAINT CC_ficha_hogar_0012_ZY CHECK ([numero_vivienda] > 0 and [numero_vivienda] < 10000)
GO
ALTER TABLE ficha_hogar ADD CONSTRAINT CC_ficha_hogar_0013_ZY CHECK ([numero_hogar] > 0 and [numero_hogar] < 100)
GO
ALTER TABLE ficha_hogar ADD CONSTRAINT CC_ficha_hogar_0014_ZY CHECK ([total_personas] > 0 and [total_personas] < 100)
GO
ALTER TABLE ficha_hogar ADD CONSTRAINT CC_ficha_hogar_0015_ZY CHECK ([cantidad_piezas] > 0 and [cantidad_piezas] < 100)
GO
ALTER TABLE ficha_hogar ADD CONSTRAINT CC_ficha_hogar_0016_ZY CHECK ([es_ficha_hogar_inactiva] >= 0 and [es_ficha_hogar_inactiva] <= 1)
GO
ALTER TABLE ficha_persona ADD CONSTRAINT TC_ficha_persona_0001_ZY CHECK ([numero_cedula] is null or [numero_tipo_excepcion_ced] is null)
GO
ALTER TABLE ficha_persona ADD CONSTRAINT TC_ficha_persona_0002_ZY CHECK ([numero_cedula] is not null or [numero_tipo_excepcion_ced] is not null)
GO
ALTER TABLE ficha_persona ADD CONSTRAINT CC_ficha_persona_0001_ZY CHECK ([es_respondente] >= 0 and [es_respondente] <= 1)
GO
ALTER TABLE ficha_persona ADD CONSTRAINT CC_ficha_persona_0002_ZY CHECK ([numero_cedula] is null or [numero_cedula] >= 1)
GO
ALTER TABLE ficha_persona ADD CONSTRAINT CC_ficha_persona_0003_ZY CHECK ([numero_cedula] is null or [numero_cedula] <= 1000000000)
GO
ALTER TABLE ficha_persona ADD CONSTRAINT CC_ficha_persona_0004_ZY CHECK ([letra_cedula] is null or [letra_cedula] >= 'A')
GO
ALTER TABLE ficha_persona ADD CONSTRAINT CC_ficha_persona_0005_ZY CHECK ([letra_cedula] is null or [letra_cedula] <= 'Z')
GO
ALTER TABLE ficha_persona ADD CONSTRAINT CC_ficha_persona_0006_ZY CHECK ([es_ficha_persona_inactiva] >= 0 and [es_ficha_persona_inactiva] <= 1)
GO
ALTER TABLE filtro_cla_rec_fun ADD CONSTRAINT TC_filtro_cla_rec_fun_0001_ZY CHECK ([id_clase_recurso_par_valor] is null or [valor] is null)
GO
ALTER TABLE filtro_cla_rec_par ADD CONSTRAINT TC_filtro_cla_rec_par_0001_ZY CHECK ([id_clase_recurso_par_valor] is null or [valor] is null)
GO
ALTER TABLE filtro_cla_rec_sec ADD CONSTRAINT TC_filtro_cla_rec_sec_0001_ZY CHECK ([id_clase_recurso_par_valor] is null or [valor] is null)
GO
ALTER TABLE filtro_cla_rec_vin ADD CONSTRAINT TC_filtro_cla_rec_vin_0001_ZY CHECK ([id_clase_recurso_par_valor] is null or [valor] is null)
GO
ALTER TABLE filtro_funcion ADD CONSTRAINT CC_filtro_funcion_0001_ZY CHECK ([es_publico] >= 0 and [es_publico] <= 1)
GO
ALTER TABLE filtro_funcion_par ADD CONSTRAINT TC_filtro_funcion_par_0001_ZY CHECK ([valor_parametro] is null or [id_valor_lista] is null)
GO
ALTER TABLE filtro_funcion_par ADD CONSTRAINT TC_filtro_funcion_par_0002_ZY CHECK ([valor_parametro] is null or [id_objeto_valor] is null)
GO
ALTER TABLE filtro_funcion_par ADD CONSTRAINT TC_filtro_funcion_par_0003_ZY CHECK ([valor_parametro] is null or [id_recurso_valor] is null)
GO
ALTER TABLE filtro_funcion_par ADD CONSTRAINT TC_filtro_funcion_par_0004_ZY CHECK ([id_valor_lista] is null or [id_objeto_valor] is null)
GO
ALTER TABLE filtro_funcion_par ADD CONSTRAINT TC_filtro_funcion_par_0005_ZY CHECK ([id_valor_lista] is null or [id_recurso_valor] is null)
GO
ALTER TABLE filtro_funcion_par ADD CONSTRAINT TC_filtro_funcion_par_0006_ZY CHECK ([id_objeto_valor] is null or [id_recurso_valor] is null)
GO
ALTER TABLE funcion ADD CONSTRAINT CC_funcion_0001_ZY CHECK ([es_publica] >= 0 and [es_publica] <= 1)
GO
ALTER TABLE funcion ADD CONSTRAINT CC_funcion_0002_ZY CHECK ([es_programatica] >= 0 and [es_programatica] <= 1)
GO
ALTER TABLE funcion ADD CONSTRAINT CC_funcion_0003_ZY CHECK ([es_personalizada] >= 0 and [es_personalizada] <= 1)
GO
ALTER TABLE funcion ADD CONSTRAINT CC_funcion_0004_ZY CHECK ([es_segmentada] >= 0 and [es_segmentada] <= 1)
GO
ALTER TABLE funcion_parametro ADD CONSTRAINT TC_funcion_parametro_0001_ZY CHECK ([id_lista_valor] is null or [id_clase_objeto_valor] is null)
GO
ALTER TABLE funcion_parametro ADD CONSTRAINT TC_funcion_parametro_0002_ZY CHECK ([id_lista_valor] is null or [id_clase_recurso_valor] is null)
GO
ALTER TABLE funcion_parametro ADD CONSTRAINT TC_funcion_parametro_0003_ZY CHECK ([id_clase_objeto_valor] is null or [id_clase_recurso_valor] is null)
GO
ALTER TABLE funcion_parametro ADD CONSTRAINT TC_funcion_parametro_0004_ZY CHECK ([numero_tipo_valor] = 21 or [id_lista_valor] is null)
GO
ALTER TABLE funcion_parametro ADD CONSTRAINT TC_funcion_parametro_0005_ZY CHECK ([numero_tipo_valor] <> 21 or [id_lista_valor] is not null)
GO
ALTER TABLE funcion_parametro ADD CONSTRAINT TC_funcion_parametro_0006_ZY CHECK ([numero_tipo_valor] = 22 or [id_clase_objeto_valor] is null)
GO
ALTER TABLE funcion_parametro ADD CONSTRAINT TC_funcion_parametro_0007_ZY CHECK ([numero_tipo_valor] <> 22 or [id_clase_objeto_valor] is not null)
GO
ALTER TABLE funcion_parametro ADD CONSTRAINT TC_funcion_parametro_0008_ZY CHECK ([numero_tipo_valor] = 23 or [id_clase_recurso_valor] is null)
GO
ALTER TABLE funcion_parametro ADD CONSTRAINT TC_funcion_parametro_0009_ZY CHECK ([numero_tipo_valor] <> 23 or [id_clase_recurso_valor] is not null)
GO
ALTER TABLE funcion_parametro ADD CONSTRAINT CC_funcion_parametro_0001_ZY CHECK ([es_parametro_sin_rastro] >= 0 and [es_parametro_sin_rastro] <= 1)
GO
ALTER TABLE funcion_parametro ADD CONSTRAINT CC_funcion_parametro_0002_ZY CHECK ([es_parametro_segmento] >= 0 and [es_parametro_segmento] <= 1)
GO
ALTER TABLE funcionario ADD CONSTRAINT CC_funcionario_0001_ZY CHECK ([numero_cedula] >= 1 and [numero_cedula] <= 1000000000)
GO
ALTER TABLE funcionario ADD CONSTRAINT CC_funcionario_0002_ZY CHECK ([letra_cedula] is null or [letra_cedula] >= 'A')
GO
ALTER TABLE funcionario ADD CONSTRAINT CC_funcionario_0003_ZY CHECK ([letra_cedula] is null or [letra_cedula] <= 'Z')
GO
ALTER TABLE log_imp_cen ADD CONSTRAINT CC_log_imp_cen_0001_ZY CHECK ([es_importado] >= 0 and [es_importado] <= 1)
GO
ALTER TABLE log_imp_deu ADD CONSTRAINT CC_log_imp_deu_0001_ZY CHECK ([es_importado] >= 0 and [es_importado] <= 1)
GO
ALTER TABLE log_imp_emp ADD CONSTRAINT CC_log_imp_emp_0001_ZY CHECK ([es_importado] >= 0 and [es_importado] <= 1)
GO
ALTER TABLE log_imp_fal ADD CONSTRAINT CC_log_imp_fal_0001_ZY CHECK ([es_importado] >= 0 and [es_importado] <= 1)
GO
ALTER TABLE log_imp_hog ADD CONSTRAINT CC_log_imp_hog_0001_ZY CHECK ([es_importado] >= 0 and [es_importado] <= 1)
GO
ALTER TABLE log_imp_ids ADD CONSTRAINT CC_log_imp_ids_0001_ZY CHECK ([es_importado] >= 0 and [es_importado] <= 1)
GO
ALTER TABLE log_imp_jub ADD CONSTRAINT CC_log_imp_jub_0001_ZY CHECK ([es_importado] >= 0 and [es_importado] <= 1)
GO
ALTER TABLE log_imp_pen ADD CONSTRAINT CC_log_imp_pen_0001_ZY CHECK ([es_importado] >= 0 and [es_importado] <= 1)
GO
ALTER TABLE log_imp_per ADD CONSTRAINT CC_log_imp_per_0001_ZY CHECK ([es_importado] >= 0 and [es_importado] <= 1)
GO
ALTER TABLE log_imp_pot ADD CONSTRAINT CC_log_imp_pot_0001_ZY CHECK ([es_importado] >= 0 and [es_importado] <= 1)
GO
ALTER TABLE log_imp_sub ADD CONSTRAINT CC_log_imp_sub_0001_ZY CHECK ([es_importado] >= 0 and [es_importado] <= 1)
GO
ALTER TABLE log_imp_ubi ADD CONSTRAINT CC_log_imp_ubi_0001_ZY CHECK ([es_importado] >= 0 and [es_importado] <= 1)
GO
ALTER TABLE log_pro_acr_pot_ben ADD CONSTRAINT CC_log_pro_acr_pot_ben_0001_ZY CHECK ([es_procesado] >= 0 and [es_procesado] <= 1)
GO
ALTER TABLE log_pro_den_pen_obj ADD CONSTRAINT CC_log_pro_den_pen_obj_0001_ZY CHECK ([es_procesado] >= 0 and [es_procesado] <= 1)
GO
ALTER TABLE log_pro_imp_arc_ext ADD CONSTRAINT CC_log_pro_imp_arc_ext_0001_ZY CHECK ([es_importado] >= 0 and [es_importado] <= 1)
GO
ALTER TABLE log_pro_oto_pen_apr ADD CONSTRAINT CC_log_pro_oto_pen_apr_0001_ZY CHECK ([es_procesado] >= 0 and [es_procesado] <= 1)
GO
ALTER TABLE log_pro_pre_pro_pag ADD CONSTRAINT CC_log_pro_pre_pro_pag_0001_ZY CHECK ([es_procesado] >= 0 and [es_procesado] <= 1)
GO
ALTER TABLE log_pro_ver_ele_pen ADD CONSTRAINT CC_log_pro_ver_ele_pen_0001_ZY CHECK ([es_procesado] >= 0 and [es_procesado] <= 1)
GO
ALTER TABLE nivel_opcion_menu ADD CONSTRAINT CC_nivel_opcion_menu_0001_ZY CHECK ([digitos_nivel_opcion_menu] >= 2 and [digitos_nivel_opcion_menu] <= 2)
GO
ALTER TABLE nivel_ubicacion ADD CONSTRAINT CC_nivel_ubicacion_0001_ZY CHECK ([digitos_nivel_ubicacion] >= 2 and [digitos_nivel_ubicacion] <= 2)
GO
ALTER TABLE objecion_ele_pen ADD CONSTRAINT CC_objecion_ele_pen_0001_ZY CHECK ([es_objecion_ele_pen_inactiva] >= 0 and [es_objecion_ele_pen_inactiva] <= 1)
GO
ALTER TABLE opcion_menu ADD CONSTRAINT TC_opcion_menu_0001_ZY CHECK ([url_opcion_menu] is null or [id_aplicacion] is null)
GO
ALTER TABLE opcion_menu ADD CONSTRAINT TC_opcion_menu_0002_ZY CHECK ([url_opcion_menu] is null or [id_pagina] is null)
GO
ALTER TABLE opcion_menu ADD CONSTRAINT TC_opcion_menu_0003_ZY CHECK ([id_aplicacion] is null or [id_pagina] is null)
GO
ALTER TABLE opcion_menu ADD CONSTRAINT CC_opcion_menu_0001_ZY CHECK ([secuencia_opcion_menu] is null or [secuencia_opcion_menu] >= 0)
GO
ALTER TABLE opcion_menu ADD CONSTRAINT CC_opcion_menu_0002_ZY CHECK ([secuencia_opcion_menu] is null or [secuencia_opcion_menu] <= 1000000000)
GO
ALTER TABLE opcion_menu ADD CONSTRAINT CC_opcion_menu_0003_ZY CHECK ([es_opcion_menu_inactiva] >= 0 and [es_opcion_menu_inactiva] <= 1)
GO
ALTER TABLE opcion_menu ADD CONSTRAINT CC_opcion_menu_0004_ZY CHECK ([es_opcion_menu_sincronizada] >= 0 and [es_opcion_menu_sincronizada] <= 1)
GO
ALTER TABLE opcion_menu_plus ADD CONSTRAINT CC_opcion_menu_plus_0001_ZY CHECK ([numero_tipo_nodo] >= 1 and [numero_tipo_nodo] <= 3)
GO
ALTER TABLE opcion_menu_plus ADD CONSTRAINT CC_opcion_menu_plus_0002_ZY CHECK ([numero_nivel_opcion_menu] >= 0 and [numero_nivel_opcion_menu] <= 15)
GO
ALTER TABLE pagina ADD CONSTRAINT CC_pagina_0001_ZY CHECK ([es_publica] >= 0 and [es_publica] <= 1)
GO
ALTER TABLE pagina_funcion ADD CONSTRAINT CC_pagina_funcion_0001_ZY CHECK ([es_funcion_inicial] >= 0 and [es_funcion_inicial] <= 1)
GO
ALTER TABLE parametro_global ADD CONSTRAINT CC_parametro_global_0001_ZY CHECK ([es_control_cer_vida_activo] >= 0 and [es_control_cer_vida_activo] <= 1)
GO
ALTER TABLE parametro_global ADD CONSTRAINT CC_parametro_global_0002_ZY CHECK ([es_control_cobro_pension_activ] >= 0 and [es_control_cobro_pension_activ] <= 1)
GO
ALTER TABLE parametro_global ADD CONSTRAINT CC_parametro_global_0003_ZY CHECK ([es_control_reproceso_pen_activ] >= 0 and [es_control_reproceso_pen_activ] <= 1)
GO
ALTER TABLE persona ADD CONSTRAINT TC_persona_0001_ZY CHECK ([numero_causa_den_reco_pen] = 99 or [otra_causa_den_reco_pen] is null)
GO
ALTER TABLE persona ADD CONSTRAINT TC_persona_0002_ZY CHECK ([numero_causa_den_reco_pen] <> 99 or [otra_causa_den_reco_pen] is not null)
GO
ALTER TABLE persona ADD CONSTRAINT TC_persona_0003_ZY CHECK ([numero_causa_den_pension] = 99 or [otra_causa_den_pension] is null)
GO
ALTER TABLE persona ADD CONSTRAINT TC_persona_0004_ZY CHECK ([numero_causa_den_pension] <> 99 or [otra_causa_den_pension] is not null)
GO
ALTER TABLE persona ADD CONSTRAINT TC_persona_0005_ZY CHECK ([numero_causa_rev_pension] = 99 or [otra_causa_rev_pension] is null)
GO
ALTER TABLE persona ADD CONSTRAINT TC_persona_0006_ZY CHECK ([numero_causa_rev_pension] <> 99 or [otra_causa_rev_pension] is not null)
GO
ALTER TABLE persona ADD CONSTRAINT TC_persona_0007_ZY CHECK ([apellido_casada] is null or [numero_sexo_persona] = 2)
GO
ALTER TABLE persona ADD CONSTRAINT TC_persona_0008_ZY CHECK ([apellido_casada] is null or [numero_estado_civil] <> 1)
GO
ALTER TABLE persona ADD CONSTRAINT TC_persona_0009_ZY CHECK ([es_indigena] = 1 or [id_etnia_indigena] is null)
GO
ALTER TABLE persona ADD CONSTRAINT CC_persona_0001_ZY CHECK ([numero_cedula] is null or [numero_cedula] >= 1)
GO
ALTER TABLE persona ADD CONSTRAINT CC_persona_0002_ZY CHECK ([numero_cedula] is null or [numero_cedula] <= 1000000000)
GO
ALTER TABLE persona ADD CONSTRAINT CC_persona_0003_ZY CHECK ([letra_cedula] is null or [letra_cedula] >= 'A')
GO
ALTER TABLE persona ADD CONSTRAINT CC_persona_0004_ZY CHECK ([letra_cedula] is null or [letra_cedula] <= 'Z')
GO
ALTER TABLE persona ADD CONSTRAINT CC_persona_0005_ZY CHECK ([es_paraguayo_natural] >= 0 and [es_paraguayo_natural] <= 1)
GO
ALTER TABLE persona ADD CONSTRAINT CC_persona_0006_ZY CHECK ([es_indigena] >= 0 and [es_indigena] <= 1)
GO
ALTER TABLE persona ADD CONSTRAINT CC_persona_0007_ZY CHECK ([es_certificado_vida_anulado] >= 0 and [es_certificado_vida_anulado] <= 1)
GO
ALTER TABLE persona ADD CONSTRAINT CC_persona_0008_ZY CHECK ([es_cer_defuncion_anulado] >= 0 and [es_cer_defuncion_anulado] <= 1)
GO
ALTER TABLE persona ADD CONSTRAINT CC_persona_0009_ZY CHECK ([es_persona_con_empleo] >= 0 and [es_persona_con_empleo] <= 1)
GO
ALTER TABLE persona ADD CONSTRAINT CC_persona_0010_ZY CHECK ([es_persona_con_jubilacion] >= 0 and [es_persona_con_jubilacion] <= 1)
GO
ALTER TABLE persona ADD CONSTRAINT CC_persona_0011_ZY CHECK ([es_persona_con_pension] >= 0 and [es_persona_con_pension] <= 1)
GO
ALTER TABLE persona ADD CONSTRAINT CC_persona_0012_ZY CHECK ([es_persona_con_subsidio] >= 0 and [es_persona_con_subsidio] <= 1)
GO
ALTER TABLE persona ADD CONSTRAINT CC_persona_0013_ZY CHECK ([es_persona_con_deuda] >= 0 and [es_persona_con_deuda] <= 1)
GO
ALTER TABLE persona ADD CONSTRAINT CC_persona_0014_ZY CHECK ([es_persona_con_pena_judicial] >= 0 and [es_persona_con_pena_judicial] <= 1)
GO
ALTER TABLE persona ADD CONSTRAINT CC_persona_0015_ZY CHECK ([es_persona_con_cer_vida] >= 0 and [es_persona_con_cer_vida] <= 1)
GO
ALTER TABLE persona ADD CONSTRAINT CC_persona_0016_ZY CHECK ([es_persona_con_carta_renuncia] >= 0 and [es_persona_con_carta_renuncia] <= 1)
GO
ALTER TABLE persona ADD CONSTRAINT CC_persona_0017_ZY CHECK ([es_persona_elegible_para_pen] >= 0 and [es_persona_elegible_para_pen] <= 1)
GO
ALTER TABLE persona ADD CONSTRAINT CC_persona_0018_ZY CHECK ([es_persona_acreditada_para_pen] >= 0 and [es_persona_acreditada_para_pen] <= 1)
GO
ALTER TABLE persona ADD CONSTRAINT CC_persona_0019_ZY CHECK ([es_persona_con_copia_cedula] >= 0 and [es_persona_con_copia_cedula] <= 1)
GO
ALTER TABLE persona ADD CONSTRAINT CC_persona_0020_ZY CHECK ([es_persona_con_declaracion_jur] >= 0 and [es_persona_con_declaracion_jur] <= 1)
GO
ALTER TABLE potencial_ben ADD CONSTRAINT CC_potencial_ben_0001_ZY CHECK ([numero_cedula] is null or [numero_cedula] >= 1)
GO
ALTER TABLE potencial_ben ADD CONSTRAINT CC_potencial_ben_0002_ZY CHECK ([numero_cedula] is null or [numero_cedula] <= 1000000000)
GO
ALTER TABLE potencial_ben ADD CONSTRAINT CC_potencial_ben_0003_ZY CHECK ([letra_cedula] is null or [letra_cedula] >= 'A')
GO
ALTER TABLE potencial_ben ADD CONSTRAINT CC_potencial_ben_0004_ZY CHECK ([letra_cedula] is null or [letra_cedula] <= 'Z')
GO
ALTER TABLE potencial_ben ADD CONSTRAINT CC_potencial_ben_0005_ZY CHECK ([es_paraguayo_natural] >= 0 and [es_paraguayo_natural] <= 1)
GO
ALTER TABLE potencial_ben ADD CONSTRAINT CC_potencial_ben_0006_ZY CHECK ([es_indigena] >= 0 and [es_indigena] <= 1)
GO
ALTER TABLE potencial_ben ADD CONSTRAINT CC_potencial_ben_0007_ZY CHECK ([es_persona_con_empleo] >= 0 and [es_persona_con_empleo] <= 1)
GO
ALTER TABLE potencial_ben ADD CONSTRAINT CC_potencial_ben_0008_ZY CHECK ([es_persona_con_jubilacion] >= 0 and [es_persona_con_jubilacion] <= 1)
GO
ALTER TABLE potencial_ben ADD CONSTRAINT CC_potencial_ben_0009_ZY CHECK ([es_persona_con_pension] >= 0 and [es_persona_con_pension] <= 1)
GO
ALTER TABLE potencial_ben ADD CONSTRAINT CC_potencial_ben_0010_ZY CHECK ([es_persona_con_subsidio] >= 0 and [es_persona_con_subsidio] <= 1)
GO
ALTER TABLE potencial_ben ADD CONSTRAINT CC_potencial_ben_0011_ZY CHECK ([es_persona_con_deuda] >= 0 and [es_persona_con_deuda] <= 1)
GO
ALTER TABLE potencial_ben ADD CONSTRAINT CC_potencial_ben_0012_ZY CHECK ([es_persona_con_pena_judicial] >= 0 and [es_persona_con_pena_judicial] <= 1)
GO
ALTER TABLE potencial_ben ADD CONSTRAINT CC_potencial_ben_0013_ZY CHECK ([es_persona_con_cer_vida] >= 0 and [es_persona_con_cer_vida] <= 1)
GO
ALTER TABLE potencial_ben ADD CONSTRAINT CC_potencial_ben_0014_ZY CHECK ([es_persona_con_carta_renuncia] >= 0 and [es_persona_con_carta_renuncia] <= 1)
GO
ALTER TABLE potencial_ben ADD CONSTRAINT CC_potencial_ben_0015_ZY CHECK ([es_potencial_ben_inactivo] >= 0 and [es_potencial_ben_inactivo] <= 1)
GO
ALTER TABLE rastro_funcion ADD CONSTRAINT CC_rastro_funcion_0001_ZY CHECK ([numero_error] is null or [numero_error] >= 0)
GO
ALTER TABLE rastro_funcion ADD CONSTRAINT CC_rastro_funcion_0002_ZY CHECK ([numero_error] is null or [numero_error] <= 1000000000)
GO
ALTER TABLE rastro_proceso ADD CONSTRAINT CC_rastro_proceso_0001_ZY CHECK ([subprocesos] >= 0 and [subprocesos] <= 1000000000)
GO
ALTER TABLE rastro_proceso ADD CONSTRAINT CC_rastro_proceso_0002_ZY CHECK ([subprocesos_pendientes] >= 0 and [subprocesos_pendientes] <= 1000000000)
GO
ALTER TABLE rastro_proceso ADD CONSTRAINT CC_rastro_proceso_0003_ZY CHECK ([subprocesos_en_progreso] >= 0 and [subprocesos_en_progreso] <= 1000000000)
GO
ALTER TABLE rastro_proceso ADD CONSTRAINT CC_rastro_proceso_0004_ZY CHECK ([subprocesos_sin_errores] >= 0 and [subprocesos_sin_errores] <= 1000000000)
GO
ALTER TABLE rastro_proceso ADD CONSTRAINT CC_rastro_proceso_0005_ZY CHECK ([subprocesos_con_errores] >= 0 and [subprocesos_con_errores] <= 1000000000)
GO
ALTER TABLE rastro_proceso ADD CONSTRAINT CC_rastro_proceso_0006_ZY CHECK ([subprocesos_cancelados] >= 0 and [subprocesos_cancelados] <= 1000000000)
GO
ALTER TABLE recurso ADD CONSTRAINT CC_recurso_0001_ZY CHECK ([es_recurso_inactivo] >= 0 and [es_recurso_inactivo] <= 1)
GO
ALTER TABLE recurso ADD CONSTRAINT CC_recurso_0002_ZY CHECK ([numero_recurso] >= 0 and [numero_recurso] <= 1000000000)
GO
ALTER TABLE ubicacion ADD CONSTRAINT CC_ubicacion_0001_ZY CHECK ([secuencia_ubicacion] is null or [secuencia_ubicacion] >= 0)
GO
ALTER TABLE ubicacion ADD CONSTRAINT CC_ubicacion_0002_ZY CHECK ([secuencia_ubicacion] is null or [secuencia_ubicacion] <= 100)
GO
ALTER TABLE ubicacion_plus ADD CONSTRAINT CC_ubicacion_plus_0001_ZY CHECK ([numero_tipo_nodo] >= 1 and [numero_tipo_nodo] <= 3)
GO
ALTER TABLE ubicacion_plus ADD CONSTRAINT CC_ubicacion_plus_0002_ZY CHECK ([numero_nivel_ubicacion] >= 0 and [numero_nivel_ubicacion] <= 15)
GO
ALTER TABLE usuario ADD CONSTRAINT TC_usuario_0001_ZY CHECK ([id_usuario_supervisor] <> [id_usuario])
GO
ALTER TABLE usuario ADD CONSTRAINT CC_usuario_0001_ZY CHECK ([es_super_usuario] >= 0 and [es_super_usuario] <= 1)
GO
ALTER TABLE usuario ADD CONSTRAINT CC_usuario_0002_ZY CHECK ([es_usuario_especial] >= 0 and [es_usuario_especial] <= 1)
GO
ALTER TABLE usuario ADD CONSTRAINT CC_usuario_0003_ZY CHECK ([es_usuario_inactivo] >= 0 and [es_usuario_inactivo] <= 1)
GO
ALTER TABLE usuario ADD CONSTRAINT CC_usuario_0004_ZY CHECK ([es_usuario_modificado] >= 0 and [es_usuario_modificado] <= 1)
GO
