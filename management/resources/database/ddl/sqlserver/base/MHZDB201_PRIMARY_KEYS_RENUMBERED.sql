ALTER TABLE aplicacion WITH NOCHECK ADD CONSTRAINT PK_aplicacion_ZY PRIMARY KEY CLUSTERED (id_aplicacion) ON [PRIMARY]
GO
ALTER TABLE archivo_datos_ext WITH NOCHECK ADD CONSTRAINT PK_archivo_datos_ext_ZY PRIMARY KEY CLUSTERED (id_archivo_datos_ext) ON [PRIMARY]
GO
ALTER TABLE causa_den_pension WITH NOCHECK ADD CONSTRAINT PK_causa_den_pension_ZY PRIMARY KEY CLUSTERED (numero_causa_den_pension) ON [PRIMARY]
GO
ALTER TABLE causa_den_recl_cen WITH NOCHECK ADD CONSTRAINT PK_causa_den_recl_cen_ZY PRIMARY KEY CLUSTERED (numero_causa_den_recl_cen) ON [PRIMARY]
GO
ALTER TABLE causa_den_reco_pen WITH NOCHECK ADD CONSTRAINT PK_causa_den_reco_pen_ZY PRIMARY KEY CLUSTERED (numero_causa_den_reco_pen) ON [PRIMARY]
GO
ALTER TABLE causa_impedimento WITH NOCHECK ADD CONSTRAINT PK_causa_impedimento_ZY PRIMARY KEY CLUSTERED (numero_causa_impedimento) ON [PRIMARY]
GO
ALTER TABLE causa_inv_censo WITH NOCHECK ADD CONSTRAINT PK_causa_inv_censo_ZY PRIMARY KEY CLUSTERED (numero_causa_inv_censo) ON [PRIMARY]
GO
ALTER TABLE causa_rev_pension WITH NOCHECK ADD CONSTRAINT PK_causa_rev_pension_ZY PRIMARY KEY CLUSTERED (numero_causa_rev_pension) ON [PRIMARY]
GO
ALTER TABLE clase_enf_acc WITH NOCHECK ADD CONSTRAINT PK_clase_enf_acc_ZY PRIMARY KEY CLUSTERED (numero_clase_enf_acc) ON [PRIMARY]
GO
ALTER TABLE clase_enf_cronica WITH NOCHECK ADD CONSTRAINT PK_clase_enf_cronica_ZY PRIMARY KEY CLUSTERED (numero_clase_enf_cronica) ON [PRIMARY]
GO
ALTER TABLE clase_impedimento WITH NOCHECK ADD CONSTRAINT PK_clase_impedimento_ZY PRIMARY KEY CLUSTERED (numero_clase_impedimento) ON [PRIMARY]
GO
ALTER TABLE clase_recurso WITH NOCHECK ADD CONSTRAINT PK_clase_recurso_ZY PRIMARY KEY CLUSTERED (id_clase_recurso) ON [PRIMARY]
GO
ALTER TABLE clase_recurso_par WITH NOCHECK ADD CONSTRAINT PK_clase_recurso_par_ZY PRIMARY KEY CLUSTERED (id_clase_recurso_par) ON [PRIMARY]
GO
ALTER TABLE clase_recurso_sec WITH NOCHECK ADD CONSTRAINT PK_clase_recurso_sec_ZY PRIMARY KEY CLUSTERED (id_clase_recurso_sec) ON [PRIMARY]
GO
ALTER TABLE condicion_censo WITH NOCHECK ADD CONSTRAINT PK_condicion_censo_ZY PRIMARY KEY CLUSTERED (numero_condicion_censo) ON [PRIMARY]
GO
ALTER TABLE condicion_denu_pen WITH NOCHECK ADD CONSTRAINT PK_condicion_denu_pen_ZY PRIMARY KEY CLUSTERED (numero_condicion_denu_pen) ON [PRIMARY]
GO
ALTER TABLE condicion_eje_fun WITH NOCHECK ADD CONSTRAINT PK_condicion_eje_fun_ZY PRIMARY KEY CLUSTERED (numero_condicion_eje_fun) ON [PRIMARY]
GO
ALTER TABLE condicion_pension WITH NOCHECK ADD CONSTRAINT PK_condicion_pension_ZY PRIMARY KEY CLUSTERED (numero_condicion_pension) ON [PRIMARY]
GO
ALTER TABLE condicion_recl_cen WITH NOCHECK ADD CONSTRAINT PK_condicion_recl_cen_ZY PRIMARY KEY CLUSTERED (numero_condicion_recl_cen) ON [PRIMARY]
GO
ALTER TABLE condicion_reco_pen WITH NOCHECK ADD CONSTRAINT PK_condicion_reco_pen_ZY PRIMARY KEY CLUSTERED (numero_condicion_reco_pen) ON [PRIMARY]
GO
ALTER TABLE conjunto_segmento WITH NOCHECK ADD CONSTRAINT PK_conjunto_segmento_ZY PRIMARY KEY CLUSTERED (id_conjunto_segmento) ON [PRIMARY]
GO
ALTER TABLE dominio WITH NOCHECK ADD CONSTRAINT PK_dominio_ZY PRIMARY KEY CLUSTERED (id_dominio) ON [PRIMARY]
GO
ALTER TABLE dominio_paquete WITH NOCHECK ADD CONSTRAINT PK_dominio_paquete_ZY PRIMARY KEY CLUSTERED (id_dominio_paquete) ON [PRIMARY]
GO
ALTER TABLE dominio_parametro WITH NOCHECK ADD CONSTRAINT PK_dominio_parametro_ZY PRIMARY KEY CLUSTERED (id_dominio_parametro) ON [PRIMARY]
GO
ALTER TABLE elemento_segmento WITH NOCHECK ADD CONSTRAINT PK_elemento_segmento_ZY PRIMARY KEY CLUSTERED (id_elemento_segmento) ON [PRIMARY]
GO
ALTER TABLE estado_civil WITH NOCHECK ADD CONSTRAINT PK_estado_civil_ZY PRIMARY KEY CLUSTERED (numero_estado_civil) ON [PRIMARY]
GO
ALTER TABLE estado_salud WITH NOCHECK ADD CONSTRAINT PK_estado_salud_ZY PRIMARY KEY CLUSTERED (numero_estado_salud) ON [PRIMARY]
GO
ALTER TABLE etnia_indigena WITH NOCHECK ADD CONSTRAINT PK_etnia_indigena_ZY PRIMARY KEY CLUSTERED (id_etnia_indigena) ON [PRIMARY]
GO
ALTER TABLE ficha_hogar WITH NOCHECK ADD CONSTRAINT PK_ficha_hogar_ZY PRIMARY KEY CLUSTERED (id_ficha_hogar) ON [PRIMARY]
GO
ALTER TABLE ficha_persona WITH NOCHECK ADD CONSTRAINT PK_ficha_persona_ZY PRIMARY KEY CLUSTERED (id_ficha_persona) ON [PRIMARY]
GO
ALTER TABLE filtro_cla_rec_fun WITH NOCHECK ADD CONSTRAINT PK_filtro_cla_rec_fun_ZY PRIMARY KEY CLUSTERED (id_filtro_cla_rec_fun) ON [PRIMARY]
GO
ALTER TABLE filtro_cla_rec_par WITH NOCHECK ADD CONSTRAINT PK_filtro_cla_rec_par_ZY PRIMARY KEY CLUSTERED (id_filtro_cla_rec_par) ON [PRIMARY]
GO
ALTER TABLE filtro_cla_rec_sec WITH NOCHECK ADD CONSTRAINT PK_filtro_cla_rec_sec_ZY PRIMARY KEY CLUSTERED (id_filtro_cla_rec_sec) ON [PRIMARY]
GO
ALTER TABLE filtro_cla_rec_vin WITH NOCHECK ADD CONSTRAINT PK_filtro_cla_rec_vin_ZY PRIMARY KEY CLUSTERED (id_filtro_cla_rec_vin) ON [PRIMARY]
GO
ALTER TABLE filtro_funcion WITH NOCHECK ADD CONSTRAINT PK_filtro_funcion_ZY PRIMARY KEY CLUSTERED (id_filtro_funcion) ON [PRIMARY]
GO
ALTER TABLE filtro_funcion_par WITH NOCHECK ADD CONSTRAINT PK_filtro_funcion_par_ZY PRIMARY KEY CLUSTERED (id_filtro_funcion_par) ON [PRIMARY]
GO
ALTER TABLE funcion WITH NOCHECK ADD CONSTRAINT PK_funcion_ZY PRIMARY KEY CLUSTERED (id_funcion) ON [PRIMARY]
GO
ALTER TABLE funcion_parametro WITH NOCHECK ADD CONSTRAINT PK_funcion_parametro_ZY PRIMARY KEY CLUSTERED (id_funcion_parametro) ON [PRIMARY]
GO
ALTER TABLE funcionario WITH NOCHECK ADD CONSTRAINT PK_funcionario_ZY PRIMARY KEY CLUSTERED (id_funcionario) ON [PRIMARY]
GO
ALTER TABLE grupo_aplicacion WITH NOCHECK ADD CONSTRAINT PK_grupo_aplicacion_ZY PRIMARY KEY CLUSTERED (id_grupo_aplicacion) ON [PRIMARY]
GO
ALTER TABLE grupo_proceso WITH NOCHECK ADD CONSTRAINT PK_grupo_proceso_ZY PRIMARY KEY CLUSTERED (id_grupo_proceso) ON [PRIMARY]
GO
ALTER TABLE idioma_hogar WITH NOCHECK ADD CONSTRAINT PK_idioma_hogar_ZY PRIMARY KEY CLUSTERED (numero_idioma_hogar) ON [PRIMARY]
GO
ALTER TABLE informe WITH NOCHECK ADD CONSTRAINT PK_informe_ZY PRIMARY KEY CLUSTERED (id_informe) ON [PRIMARY]
GO
ALTER TABLE informe_auditoria WITH NOCHECK ADD CONSTRAINT PK_informe_auditoria_ZY PRIMARY KEY CLUSTERED (id_informe_auditoria) ON [PRIMARY]
GO
ALTER TABLE log_imp_deu WITH NOCHECK ADD CONSTRAINT PK_log_imp_deu_ZY PRIMARY KEY CLUSTERED (id_log_imp_deu) ON [PRIMARY]
GO
ALTER TABLE log_imp_emp WITH NOCHECK ADD CONSTRAINT PK_log_imp_emp_ZY PRIMARY KEY CLUSTERED (id_log_imp_emp) ON [PRIMARY]
GO
ALTER TABLE log_imp_fal WITH NOCHECK ADD CONSTRAINT PK_log_imp_fal_ZY PRIMARY KEY CLUSTERED (id_log_imp_fal) ON [PRIMARY]
GO
ALTER TABLE log_imp_hog WITH NOCHECK ADD CONSTRAINT PK_log_imp_hog_ZY PRIMARY KEY CLUSTERED (id_log_imp_hog) ON [PRIMARY]
GO
ALTER TABLE log_imp_ids WITH NOCHECK ADD CONSTRAINT PK_log_imp_ids_ZY PRIMARY KEY CLUSTERED (id_log_imp_ids) ON [PRIMARY]
GO
ALTER TABLE log_imp_jub WITH NOCHECK ADD CONSTRAINT PK_log_imp_jub_ZY PRIMARY KEY CLUSTERED (id_log_imp_jub) ON [PRIMARY]
GO
ALTER TABLE log_imp_pen WITH NOCHECK ADD CONSTRAINT PK_log_imp_pen_ZY PRIMARY KEY CLUSTERED (id_log_imp_pen) ON [PRIMARY]
GO
ALTER TABLE log_imp_per WITH NOCHECK ADD CONSTRAINT PK_log_imp_per_ZY PRIMARY KEY CLUSTERED (id_log_imp_per) ON [PRIMARY]
GO
ALTER TABLE log_imp_pot WITH NOCHECK ADD CONSTRAINT PK_log_imp_pot_ZY PRIMARY KEY CLUSTERED (id_log_imp_pot) ON [PRIMARY]
GO
ALTER TABLE log_imp_sub WITH NOCHECK ADD CONSTRAINT PK_log_imp_sub_ZY PRIMARY KEY CLUSTERED (id_log_imp_sub) ON [PRIMARY]
GO
ALTER TABLE log_imp_ubi WITH NOCHECK ADD CONSTRAINT PK_log_imp_ubi_ZY PRIMARY KEY CLUSTERED (id_log_imp_ubi) ON [PRIMARY]
GO
ALTER TABLE log_pro_acr_pot_ben WITH NOCHECK ADD CONSTRAINT PK_log_pro_acr_pot_ben_ZY PRIMARY KEY CLUSTERED (id_log_pro_acr_pot_ben) ON [PRIMARY]
GO
ALTER TABLE log_pro_imp_arc_ext WITH NOCHECK ADD CONSTRAINT PK_log_pro_imp_arc_ext_ZY PRIMARY KEY CLUSTERED (id_log_pro_imp_arc_ext) ON [PRIMARY]
GO
ALTER TABLE log_pro_oto_pen_apr WITH NOCHECK ADD CONSTRAINT PK_log_pro_oto_pen_apr_ZY PRIMARY KEY CLUSTERED (id_log_pro_oto_pen_apr) ON [PRIMARY]
GO
ALTER TABLE log_pro_pre_pro_pag WITH NOCHECK ADD CONSTRAINT PK_log_pro_pre_pro_pag_ZY PRIMARY KEY CLUSTERED (id_log_pro_pre_pro_pag) ON [PRIMARY]
GO
ALTER TABLE log_pro_ver_ele_pen WITH NOCHECK ADD CONSTRAINT PK_log_pro_ver_ele_pen_ZY PRIMARY KEY CLUSTERED (id_log_pro_ver_ele_pen) ON [PRIMARY]
GO
ALTER TABLE mensaje WITH NOCHECK ADD CONSTRAINT PK_mensaje_ZY PRIMARY KEY CLUSTERED (id_mensaje) ON [PRIMARY]
GO
ALTER TABLE motivo_ina_esc WITH NOCHECK ADD CONSTRAINT PK_motivo_ina_esc_ZY PRIMARY KEY CLUSTERED (numero_motivo_ina_esc) ON [PRIMARY]
GO
ALTER TABLE motivo_no_atencion WITH NOCHECK ADD CONSTRAINT PK_motivo_no_atencion_ZY PRIMARY KEY CLUSTERED (numero_motivo_no_atencion) ON [PRIMARY]
GO
ALTER TABLE motivo_no_trabajo WITH NOCHECK ADD CONSTRAINT PK_motivo_no_trabajo_ZY PRIMARY KEY CLUSTERED (numero_motivo_no_trabajo) ON [PRIMARY]
GO
ALTER TABLE nivel_educativo WITH NOCHECK ADD CONSTRAINT PK_nivel_educativo_ZY PRIMARY KEY CLUSTERED (numero_nivel_educativo) ON [PRIMARY]
GO
ALTER TABLE nivel_opcion_menu WITH NOCHECK ADD CONSTRAINT PK_nivel_opcion_menu_ZY PRIMARY KEY CLUSTERED (numero_nivel_opcion_menu) ON [PRIMARY]
GO
ALTER TABLE nivel_ubicacion WITH NOCHECK ADD CONSTRAINT PK_nivel_ubicacion_ZY PRIMARY KEY CLUSTERED (numero_nivel_ubicacion) ON [PRIMARY]
GO
ALTER TABLE objecion_ele_pen WITH NOCHECK ADD CONSTRAINT PK_objecion_ele_pen_ZY PRIMARY KEY CLUSTERED (id_objecion_ele_pen) ON [PRIMARY]
GO
ALTER TABLE opcion_binaria WITH NOCHECK ADD CONSTRAINT PK_opcion_binaria_ZY PRIMARY KEY CLUSTERED (numero_opcion_binaria) ON [PRIMARY]
GO
ALTER TABLE opcion_menu WITH NOCHECK ADD CONSTRAINT PK_opcion_menu_ZY PRIMARY KEY CLUSTERED (id_opcion_menu) ON [PRIMARY]
GO
ALTER TABLE opcion_menu_plus WITH NOCHECK ADD CONSTRAINT PK_opcion_menu_plus_ZY PRIMARY KEY CLUSTERED (id_opcion_menu) ON [PRIMARY]
GO
ALTER TABLE opcion_sistema WITH NOCHECK ADD CONSTRAINT PK_opcion_sistema_ZY PRIMARY KEY CLUSTERED (id_opcion_sistema) ON [PRIMARY]
GO
ALTER TABLE operador_com WITH NOCHECK ADD CONSTRAINT PK_operador_com_ZY PRIMARY KEY CLUSTERED (numero_operador_com) ON [PRIMARY]
GO
ALTER TABLE pagina WITH NOCHECK ADD CONSTRAINT PK_pagina_ZY PRIMARY KEY CLUSTERED (id_pagina) ON [PRIMARY]
GO
ALTER TABLE pagina_funcion WITH NOCHECK ADD CONSTRAINT PK_pagina_funcion_ZY PRIMARY KEY CLUSTERED (id_pagina_funcion) ON [PRIMARY]
GO
ALTER TABLE pagina_usuario WITH NOCHECK ADD CONSTRAINT PK_pagina_usuario_ZY PRIMARY KEY CLUSTERED (id_pagina_usuario) ON [PRIMARY]
GO
ALTER TABLE paquete WITH NOCHECK ADD CONSTRAINT PK_paquete_ZY PRIMARY KEY CLUSTERED (id_paquete) ON [PRIMARY]
GO
ALTER TABLE parametro WITH NOCHECK ADD CONSTRAINT PK_parametro_ZY PRIMARY KEY CLUSTERED (id_parametro) ON [PRIMARY]
GO
ALTER TABLE parametro_global WITH NOCHECK ADD CONSTRAINT PK_parametro_global_ZY PRIMARY KEY CLUSTERED (numero_parametro_global) ON [PRIMARY]
GO
ALTER TABLE persona WITH NOCHECK ADD CONSTRAINT PK_persona_ZY PRIMARY KEY CLUSTERED (id_persona) ON [PRIMARY]
GO
ALTER TABLE potencial_ben WITH NOCHECK ADD CONSTRAINT PK_potencial_ben_ZY PRIMARY KEY CLUSTERED (id_potencial_ben) ON [PRIMARY]
GO
ALTER TABLE proceso WITH NOCHECK ADD CONSTRAINT PK_proceso_ZY PRIMARY KEY CLUSTERED (id_proceso) ON [PRIMARY]
GO
ALTER TABLE proveedor_dat_ext WITH NOCHECK ADD CONSTRAINT PK_proveedor_dat_ext_ZY PRIMARY KEY CLUSTERED (id_proveedor_dat_ext) ON [PRIMARY]
GO
ALTER TABLE rastro_funcion WITH NOCHECK ADD CONSTRAINT PK_rastro_funcion_ZY PRIMARY KEY CLUSTERED (id_rastro_funcion) ON [PRIMARY]
GO
ALTER TABLE rastro_funcion_par WITH NOCHECK ADD CONSTRAINT PK_rastro_funcion_par_ZY PRIMARY KEY CLUSTERED (id_rastro_funcion_par) ON [PRIMARY]
GO
ALTER TABLE rastro_informe WITH NOCHECK ADD CONSTRAINT PK_rastro_informe_ZY PRIMARY KEY CLUSTERED (id_rastro_informe) ON [PRIMARY]
GO
ALTER TABLE rastro_proceso WITH NOCHECK ADD CONSTRAINT PK_rastro_proceso_ZY PRIMARY KEY CLUSTERED (id_rastro_proceso) ON [PRIMARY]
GO
ALTER TABLE recurso WITH NOCHECK ADD CONSTRAINT PK_recurso_ZY PRIMARY KEY CLUSTERED (id_recurso) ON [PRIMARY]
GO
ALTER TABLE rol WITH NOCHECK ADD CONSTRAINT PK_rol_ZY PRIMARY KEY CLUSTERED (id_rol) ON [PRIMARY]
GO
ALTER TABLE rol_aplicacion WITH NOCHECK ADD CONSTRAINT PK_rol_aplicacion_ZY PRIMARY KEY CLUSTERED (id_rol_aplicacion) ON [PRIMARY]
GO
ALTER TABLE rol_filtro_funcion WITH NOCHECK ADD CONSTRAINT PK_rol_filtro_funcion_ZY PRIMARY KEY CLUSTERED (id_rol_filtro_funcion) ON [PRIMARY]
GO
ALTER TABLE rol_funcion WITH NOCHECK ADD CONSTRAINT PK_rol_funcion_ZY PRIMARY KEY CLUSTERED (id_rol_funcion) ON [PRIMARY]
GO
ALTER TABLE rol_pagina WITH NOCHECK ADD CONSTRAINT PK_rol_pagina_ZY PRIMARY KEY CLUSTERED (id_rol_pagina) ON [PRIMARY]
GO
ALTER TABLE rol_usuario WITH NOCHECK ADD CONSTRAINT PK_rol_usuario_ZY PRIMARY KEY CLUSTERED (id_rol_usuario) ON [PRIMARY]
GO
ALTER TABLE sexo_persona WITH NOCHECK ADD CONSTRAINT PK_sexo_persona_ZY PRIMARY KEY CLUSTERED (numero_sexo_persona) ON [PRIMARY]
GO
ALTER TABLE siono WITH NOCHECK ADD CONSTRAINT PK_siono_ZY PRIMARY KEY CLUSTERED (numero_siono) ON [PRIMARY]
GO
ALTER TABLE tipo_aba_agua WITH NOCHECK ADD CONSTRAINT PK_tipo_aba_agua_ZY PRIMARY KEY CLUSTERED (numero_tipo_aba_agua) ON [PRIMARY]
GO
ALTER TABLE tipo_act_jupe WITH NOCHECK ADD CONSTRAINT PK_tipo_act_jupe_ZY PRIMARY KEY CLUSTERED (numero_tipo_act_jupe) ON [PRIMARY]
GO
ALTER TABLE tipo_arc_dat_ext WITH NOCHECK ADD CONSTRAINT PK_tipo_arc_dat_ext_ZY PRIMARY KEY CLUSTERED (numero_tipo_arc_dat_ext) ON [PRIMARY]
GO
ALTER TABLE tipo_area WITH NOCHECK ADD CONSTRAINT PK_tipo_area_ZY PRIMARY KEY CLUSTERED (numero_tipo_area) ON [PRIMARY]
GO
ALTER TABLE tipo_clase_recurso WITH NOCHECK ADD CONSTRAINT PK_tipo_clase_recurso_ZY PRIMARY KEY CLUSTERED (numero_tipo_clase_recurso) ON [PRIMARY]
GO
ALTER TABLE tipo_combustible WITH NOCHECK ADD CONSTRAINT PK_tipo_combustible_ZY PRIMARY KEY CLUSTERED (numero_tipo_combustible) ON [PRIMARY]
GO
ALTER TABLE tipo_comparacion WITH NOCHECK ADD CONSTRAINT PK_tipo_comparacion_ZY PRIMARY KEY CLUSTERED (numero_tipo_comparacion) ON [PRIMARY]
GO
ALTER TABLE tipo_dato_par WITH NOCHECK ADD CONSTRAINT PK_tipo_dato_par_ZY PRIMARY KEY CLUSTERED (numero_tipo_dato_par) ON [PRIMARY]
GO
ALTER TABLE tipo_desecho_bas WITH NOCHECK ADD CONSTRAINT PK_tipo_desecho_bas_ZY PRIMARY KEY CLUSTERED (numero_tipo_desecho_bas) ON [PRIMARY]
GO
ALTER TABLE tipo_dominio WITH NOCHECK ADD CONSTRAINT PK_tipo_dominio_ZY PRIMARY KEY CLUSTERED (numero_tipo_dominio) ON [PRIMARY]
GO
ALTER TABLE tipo_excepcion_ced WITH NOCHECK ADD CONSTRAINT PK_tipo_excepcion_ced_ZY PRIMARY KEY CLUSTERED (numero_tipo_excepcion_ced) ON [PRIMARY]
GO
ALTER TABLE tipo_funcion WITH NOCHECK ADD CONSTRAINT PK_tipo_funcion_ZY PRIMARY KEY CLUSTERED (numero_tipo_funcion) ON [PRIMARY]
GO
ALTER TABLE tipo_mat_paredes WITH NOCHECK ADD CONSTRAINT PK_tipo_mat_paredes_ZY PRIMARY KEY CLUSTERED (numero_tipo_mat_paredes) ON [PRIMARY]
GO
ALTER TABLE tipo_mat_piso WITH NOCHECK ADD CONSTRAINT PK_tipo_mat_piso_ZY PRIMARY KEY CLUSTERED (numero_tipo_mat_piso) ON [PRIMARY]
GO
ALTER TABLE tipo_mat_techo WITH NOCHECK ADD CONSTRAINT PK_tipo_mat_techo_ZY PRIMARY KEY CLUSTERED (numero_tipo_mat_techo) ON [PRIMARY]
GO
ALTER TABLE tipo_nodo WITH NOCHECK ADD CONSTRAINT PK_tipo_nodo_ZY PRIMARY KEY CLUSTERED (numero_tipo_nodo) ON [PRIMARY]
GO
ALTER TABLE tipo_obj_ele_pen WITH NOCHECK ADD CONSTRAINT PK_tipo_obj_ele_pen_ZY PRIMARY KEY CLUSTERED (numero_tipo_obj_ele_pen) ON [PRIMARY]
GO
ALTER TABLE tipo_ocupacion_viv WITH NOCHECK ADD CONSTRAINT PK_tipo_ocupacion_viv_ZY PRIMARY KEY CLUSTERED (numero_tipo_ocupacion_viv) ON [PRIMARY]
GO
ALTER TABLE tipo_pagina WITH NOCHECK ADD CONSTRAINT PK_tipo_pagina_ZY PRIMARY KEY CLUSTERED (numero_tipo_pagina) ON [PRIMARY]
GO
ALTER TABLE tipo_parametro WITH NOCHECK ADD CONSTRAINT PK_tipo_parametro_ZY PRIMARY KEY CLUSTERED (numero_tipo_parametro) ON [PRIMARY]
GO
ALTER TABLE tipo_parametro_dom WITH NOCHECK ADD CONSTRAINT PK_tipo_parametro_dom_ZY PRIMARY KEY CLUSTERED (numero_tipo_parametro_dom) ON [PRIMARY]
GO
ALTER TABLE tipo_persona_hogar WITH NOCHECK ADD CONSTRAINT PK_tipo_persona_hogar_ZY PRIMARY KEY CLUSTERED (numero_tipo_persona_hogar) ON [PRIMARY]
GO
ALTER TABLE tipo_pieza_bano WITH NOCHECK ADD CONSTRAINT PK_tipo_pieza_bano_ZY PRIMARY KEY CLUSTERED (numero_tipo_pieza_bano) ON [PRIMARY]
GO
ALTER TABLE tipo_rastro_fun WITH NOCHECK ADD CONSTRAINT PK_tipo_rastro_fun_ZY PRIMARY KEY CLUSTERED (numero_tipo_rastro_fun) ON [PRIMARY]
GO
ALTER TABLE tipo_recurso WITH NOCHECK ADD CONSTRAINT PK_tipo_recurso_ZY PRIMARY KEY CLUSTERED (numero_tipo_recurso) ON [PRIMARY]
GO
ALTER TABLE tipo_reg_pot_ben WITH NOCHECK ADD CONSTRAINT PK_tipo_reg_pot_ben_ZY PRIMARY KEY CLUSTERED (numero_tipo_reg_pot_ben) ON [PRIMARY]
GO
ALTER TABLE tipo_relacion_lab WITH NOCHECK ADD CONSTRAINT PK_tipo_relacion_lab_ZY PRIMARY KEY CLUSTERED (numero_tipo_relacion_lab) ON [PRIMARY]
GO
ALTER TABLE tipo_rol WITH NOCHECK ADD CONSTRAINT PK_tipo_rol_ZY PRIMARY KEY CLUSTERED (numero_tipo_rol) ON [PRIMARY]
GO
ALTER TABLE tipo_seguro_medico WITH NOCHECK ADD CONSTRAINT PK_tipo_seguro_medico_ZY PRIMARY KEY CLUSTERED (numero_tipo_seguro_medico) ON [PRIMARY]
GO
ALTER TABLE tipo_servicio_agua WITH NOCHECK ADD CONSTRAINT PK_tipo_servicio_agua_ZY PRIMARY KEY CLUSTERED (numero_tipo_servicio_agua) ON [PRIMARY]
GO
ALTER TABLE tipo_servicio_san WITH NOCHECK ADD CONSTRAINT PK_tipo_servicio_san_ZY PRIMARY KEY CLUSTERED (numero_tipo_servicio_san) ON [PRIMARY]
GO
ALTER TABLE tipo_valor WITH NOCHECK ADD CONSTRAINT PK_tipo_valor_ZY PRIMARY KEY CLUSTERED (numero_tipo_valor) ON [PRIMARY]
GO
ALTER TABLE ubicacion WITH NOCHECK ADD CONSTRAINT PK_ubicacion_ZY PRIMARY KEY CLUSTERED (id_ubicacion) ON [PRIMARY]
GO
ALTER TABLE ubicacion_plus WITH NOCHECK ADD CONSTRAINT PK_ubicacion_plus_ZY PRIMARY KEY CLUSTERED (id_ubicacion) ON [PRIMARY]
GO
ALTER TABLE usuario WITH NOCHECK ADD CONSTRAINT PK_usuario_ZY PRIMARY KEY CLUSTERED (id_usuario) ON [PRIMARY]
GO
ALTER TABLE visita_censo WITH NOCHECK ADD CONSTRAINT PK_visita_censo_ZY PRIMARY KEY CLUSTERED (id_visita_censo) ON [PRIMARY]
GO
