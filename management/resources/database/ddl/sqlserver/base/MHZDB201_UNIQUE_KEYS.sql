ALTER TABLE aplicacion ADD CONSTRAINT UQ_aplicacion_001___ UNIQUE NONCLUSTERED (codigo_aplicacion) ON [PRIMARY]
GO
ALTER TABLE archivo_datos_ext ADD CONSTRAINT UQ_archivo_datos_ext_001___ UNIQUE NONCLUSTERED (codigo_archivo_datos_ext) ON [PRIMARY]
GO
ALTER TABLE causa_den_pension ADD CONSTRAINT UQ_causa_den_pension_001___ UNIQUE NONCLUSTERED (codigo_causa_den_pension) ON [PRIMARY]
GO
ALTER TABLE causa_den_recl_cen ADD CONSTRAINT UQ_causa_den_recl_cen_001___ UNIQUE NONCLUSTERED (codigo_causa_den_recl_cen) ON [PRIMARY]
GO
ALTER TABLE causa_den_reco_pen ADD CONSTRAINT UQ_causa_den_reco_pen_001___ UNIQUE NONCLUSTERED (codigo_causa_den_reco_pen) ON [PRIMARY]
GO
ALTER TABLE causa_impedimento ADD CONSTRAINT UQ_causa_impedimento_001___ UNIQUE NONCLUSTERED (codigo_causa_impedimento) ON [PRIMARY]
GO
ALTER TABLE causa_inv_censo ADD CONSTRAINT UQ_causa_inv_censo_001___ UNIQUE NONCLUSTERED (codigo_causa_inv_censo) ON [PRIMARY]
GO
ALTER TABLE causa_rev_pension ADD CONSTRAINT UQ_causa_rev_pension_001___ UNIQUE NONCLUSTERED (codigo_causa_rev_pension) ON [PRIMARY]
GO
ALTER TABLE clase_enf_acc ADD CONSTRAINT UQ_clase_enf_acc_001___ UNIQUE NONCLUSTERED (codigo_clase_enf_acc) ON [PRIMARY]
GO
ALTER TABLE clase_enf_cronica ADD CONSTRAINT UQ_clase_enf_cronica_001___ UNIQUE NONCLUSTERED (codigo_clase_enf_cronica) ON [PRIMARY]
GO
ALTER TABLE clase_impedimento ADD CONSTRAINT UQ_clase_impedimento_001___ UNIQUE NONCLUSTERED (codigo_clase_impedimento) ON [PRIMARY]
GO
ALTER TABLE clase_recurso ADD CONSTRAINT UQ_clase_recurso_001___ UNIQUE NONCLUSTERED (codigo_clase_recurso) ON [PRIMARY]
GO
ALTER TABLE clase_recurso_par ADD CONSTRAINT UQ_clase_recurso_par_001___ UNIQUE NONCLUSTERED (id_clase_recurso, id_parametro) ON [PRIMARY]
GO
ALTER TABLE clase_recurso_sec ADD CONSTRAINT UQ_clase_recurso_sec_001___ UNIQUE NONCLUSTERED (id_clase_recurso, etiqueta_clase_recurso_sec) ON [PRIMARY]
GO
ALTER TABLE condicion_censo ADD CONSTRAINT UQ_condicion_censo_001___ UNIQUE NONCLUSTERED (codigo_condicion_censo) ON [PRIMARY]
GO
ALTER TABLE condicion_denu_pen ADD CONSTRAINT UQ_condicion_denu_pen_001___ UNIQUE NONCLUSTERED (codigo_condicion_denu_pen) ON [PRIMARY]
GO
ALTER TABLE condicion_eje_fun ADD CONSTRAINT UQ_condicion_eje_fun_001___ UNIQUE NONCLUSTERED (codigo_condicion_eje_fun) ON [PRIMARY]
GO
ALTER TABLE condicion_pension ADD CONSTRAINT UQ_condicion_pension_001___ UNIQUE NONCLUSTERED (codigo_condicion_pension) ON [PRIMARY]
GO
ALTER TABLE condicion_recl_cen ADD CONSTRAINT UQ_condicion_recl_cen_001___ UNIQUE NONCLUSTERED (codigo_condicion_recl_cen) ON [PRIMARY]
GO
ALTER TABLE condicion_reco_pen ADD CONSTRAINT UQ_condicion_reco_pen_001___ UNIQUE NONCLUSTERED (codigo_condicion_reco_pen) ON [PRIMARY]
GO
ALTER TABLE conjunto_segmento ADD CONSTRAINT UQ_conjunto_segmento_001___ UNIQUE NONCLUSTERED (codigo_conjunto_segmento) ON [PRIMARY]
GO
ALTER TABLE dominio ADD CONSTRAINT UQ_dominio_001___ UNIQUE NONCLUSTERED (codigo_dominio) ON [PRIMARY]
GO
ALTER TABLE dominio_paquete ADD CONSTRAINT UQ_dominio_paquete_001___ UNIQUE NONCLUSTERED (id_dominio, id_paquete) ON [PRIMARY]
GO
ALTER TABLE dominio_parametro ADD CONSTRAINT UQ_dominio_parametro_001___ UNIQUE NONCLUSTERED (id_dominio, numero_tipo_parametro_dom) ON [PRIMARY]
GO
ALTER TABLE elemento_segmento ADD CONSTRAINT UQ_elemento_segmento_001___ UNIQUE NONCLUSTERED (id_conjunto_segmento, id_segmento) ON [PRIMARY]
GO
ALTER TABLE estado_civil ADD CONSTRAINT UQ_estado_civil_001___ UNIQUE NONCLUSTERED (codigo_estado_civil) ON [PRIMARY]
GO
ALTER TABLE estado_salud ADD CONSTRAINT UQ_estado_salud_001___ UNIQUE NONCLUSTERED (codigo_estado_salud) ON [PRIMARY]
GO
ALTER TABLE etnia_indigena ADD CONSTRAINT UQ_etnia_indigena_001___ UNIQUE NONCLUSTERED (codigo_etnia_indigena) ON [PRIMARY]
GO
ALTER TABLE ficha_hogar ADD CONSTRAINT UQ_ficha_hogar_001___ UNIQUE NONCLUSTERED (codigo_ficha_hogar) ON [PRIMARY]
GO
ALTER TABLE ficha_persona ADD CONSTRAINT UQ_ficha_persona_001___ UNIQUE NONCLUSTERED (codigo_ficha_persona) ON [PRIMARY]
GO
ALTER TABLE ficha_persona ADD CONSTRAINT UQ_ficha_persona_002___ UNIQUE NONCLUSTERED (id_ficha_hogar, numero_orden_identificacion) ON [PRIMARY]
GO
ALTER TABLE filtro_funcion ADD CONSTRAINT UQ_filtro_funcion_001___ UNIQUE NONCLUSTERED (codigo_filtro_funcion) ON [PRIMARY]
GO
ALTER TABLE funcion ADD CONSTRAINT UQ_funcion_001___ UNIQUE NONCLUSTERED (codigo_funcion) ON [PRIMARY]
GO
ALTER TABLE funcion_parametro ADD CONSTRAINT UQ_funcion_parametro_001___ UNIQUE NONCLUSTERED (id_funcion, id_parametro) ON [PRIMARY]
GO
ALTER TABLE funcionario ADD CONSTRAINT UQ_funcionario_001___ UNIQUE NONCLUSTERED (codigo_funcionario) ON [PRIMARY]
GO
ALTER TABLE grupo_aplicacion ADD CONSTRAINT UQ_grupo_aplicacion_001___ UNIQUE NONCLUSTERED (codigo_grupo_aplicacion) ON [PRIMARY]
GO
ALTER TABLE grupo_proceso ADD CONSTRAINT UQ_grupo_proceso_001___ UNIQUE NONCLUSTERED (codigo_grupo_proceso) ON [PRIMARY]
GO
ALTER TABLE idioma_hogar ADD CONSTRAINT UQ_idioma_hogar_001___ UNIQUE NONCLUSTERED (codigo_idioma_hogar) ON [PRIMARY]
GO
ALTER TABLE informe ADD CONSTRAINT UQ_informe_001___ UNIQUE NONCLUSTERED (codigo_informe) ON [PRIMARY]
GO
ALTER TABLE mensaje ADD CONSTRAINT UQ_mensaje_001___ UNIQUE NONCLUSTERED (codigo_mensaje) ON [PRIMARY]
GO
ALTER TABLE motivo_ina_esc ADD CONSTRAINT UQ_motivo_ina_esc_001___ UNIQUE NONCLUSTERED (codigo_motivo_ina_esc) ON [PRIMARY]
GO
ALTER TABLE motivo_no_atencion ADD CONSTRAINT UQ_motivo_no_atencion_001___ UNIQUE NONCLUSTERED (codigo_motivo_no_atencion) ON [PRIMARY]
GO
ALTER TABLE motivo_no_trabajo ADD CONSTRAINT UQ_motivo_no_trabajo_001___ UNIQUE NONCLUSTERED (codigo_motivo_no_trabajo) ON [PRIMARY]
GO
ALTER TABLE nivel_educativo ADD CONSTRAINT UQ_nivel_educativo_001___ UNIQUE NONCLUSTERED (codigo_nivel_educativo) ON [PRIMARY]
GO
ALTER TABLE nivel_opcion_menu ADD CONSTRAINT UQ_nivel_opcion_menu_001___ UNIQUE NONCLUSTERED (codigo_nivel_opcion_menu) ON [PRIMARY]
GO
ALTER TABLE nivel_ubicacion ADD CONSTRAINT UQ_nivel_ubicacion_001___ UNIQUE NONCLUSTERED (codigo_nivel_ubicacion) ON [PRIMARY]
GO
ALTER TABLE opcion_binaria ADD CONSTRAINT UQ_opcion_binaria_001___ UNIQUE NONCLUSTERED (codigo_opcion_si_no) ON [PRIMARY]
GO
ALTER TABLE opcion_binaria ADD CONSTRAINT UQ_opcion_binaria_002___ UNIQUE NONCLUSTERED (codigo_opcion_activo_inactivo) ON [PRIMARY]
GO
ALTER TABLE opcion_binaria ADD CONSTRAINT UQ_opcion_binaria_003___ UNIQUE NONCLUSTERED (codigo_opcion_enc_apa) ON [PRIMARY]
GO
ALTER TABLE opcion_binaria ADD CONSTRAINT UQ_opcion_binaria_004___ UNIQUE NONCLUSTERED (codigo_opcion_presente_ausente) ON [PRIMARY]
GO
ALTER TABLE opcion_binaria ADD CONSTRAINT UQ_opcion_binaria_005___ UNIQUE NONCLUSTERED (codigo_opcion_pos_neg) ON [PRIMARY]
GO
ALTER TABLE opcion_binaria ADD CONSTRAINT UQ_opcion_binaria_006___ UNIQUE NONCLUSTERED (codigo_opcion_verdadero_falso) ON [PRIMARY]
GO
ALTER TABLE opcion_menu ADD CONSTRAINT UQ_opcion_menu_001___ UNIQUE NONCLUSTERED (codigo_opcion_menu) ON [PRIMARY]
GO
ALTER TABLE opcion_sistema ADD CONSTRAINT UQ_opcion_sistema_001___ UNIQUE NONCLUSTERED (clave_opcion_sistema) ON [PRIMARY]
GO
ALTER TABLE operador_com ADD CONSTRAINT UQ_operador_com_001___ UNIQUE NONCLUSTERED (codigo_operador_com) ON [PRIMARY]
GO
ALTER TABLE pagina ADD CONSTRAINT UQ_pagina_001___ UNIQUE NONCLUSTERED (codigo_pagina, id_aplicacion) ON [PRIMARY]
GO
ALTER TABLE pagina_funcion ADD CONSTRAINT UQ_pagina_funcion_001___ UNIQUE NONCLUSTERED (id_pagina, id_funcion) ON [PRIMARY]
GO
ALTER TABLE pagina_usuario ADD CONSTRAINT UQ_pagina_usuario_001___ UNIQUE NONCLUSTERED (id_pagina, id_usuario) ON [PRIMARY]
GO
ALTER TABLE paquete ADD CONSTRAINT UQ_paquete_001___ UNIQUE NONCLUSTERED (codigo_paquete) ON [PRIMARY]
GO
ALTER TABLE parametro ADD CONSTRAINT UQ_parametro_001___ UNIQUE NONCLUSTERED (codigo_parametro) ON [PRIMARY]
GO
ALTER TABLE parametro_global ADD CONSTRAINT UQ_parametro_global_001___ UNIQUE NONCLUSTERED (codigo_parametro_global) ON [PRIMARY]
GO
ALTER TABLE persona ADD CONSTRAINT UQ_persona_001___ UNIQUE NONCLUSTERED (numero_cedula, letra_cedula) ON [PRIMARY]
GO
ALTER TABLE persona ADD CONSTRAINT UQ_persona_002___ UNIQUE NONCLUSTERED (codigo_persona) ON [PRIMARY]
GO
ALTER TABLE potencial_ben ADD CONSTRAINT UQ_potencial_ben_001___ UNIQUE NONCLUSTERED (codigo_potencial_ben) ON [PRIMARY]
GO
ALTER TABLE potencial_ben ADD CONSTRAINT UQ_potencial_ben_002___ UNIQUE NONCLUSTERED (numero_cedula, letra_cedula) ON [PRIMARY]
GO
ALTER TABLE potencial_ben ADD CONSTRAINT UQ_potencial_ben_003___ UNIQUE NONCLUSTERED (id_persona) ON [PRIMARY]
GO
ALTER TABLE proceso ADD CONSTRAINT UQ_proceso_001___ UNIQUE NONCLUSTERED (codigo_proceso) ON [PRIMARY]
GO
ALTER TABLE proveedor_dat_ext ADD CONSTRAINT UQ_proveedor_dat_ext_001___ UNIQUE NONCLUSTERED (codigo_proveedor_dat_ext) ON [PRIMARY]
GO
ALTER TABLE rol ADD CONSTRAINT UQ_rol_001___ UNIQUE NONCLUSTERED (codigo_rol) ON [PRIMARY]
GO
ALTER TABLE rol_aplicacion ADD CONSTRAINT UQ_rol_aplicacion_001___ UNIQUE NONCLUSTERED (id_rol, id_aplicacion) ON [PRIMARY]
GO
ALTER TABLE rol_filtro_funcion ADD CONSTRAINT UQ_rol_filtro_funcion_001___ UNIQUE NONCLUSTERED (id_rol, id_filtro_funcion) ON [PRIMARY]
GO
ALTER TABLE rol_funcion ADD CONSTRAINT UQ_rol_funcion_001___ UNIQUE NONCLUSTERED (id_rol, id_funcion) ON [PRIMARY]
GO
ALTER TABLE rol_pagina ADD CONSTRAINT UQ_rol_pagina_001___ UNIQUE NONCLUSTERED (id_rol, id_pagina) ON [PRIMARY]
GO
ALTER TABLE rol_usuario ADD CONSTRAINT UQ_rol_usuario_001___ UNIQUE NONCLUSTERED (id_rol, id_usuario) ON [PRIMARY]
GO
ALTER TABLE sexo_persona ADD CONSTRAINT UQ_sexo_persona_001___ UNIQUE NONCLUSTERED (codigo_sexo_persona) ON [PRIMARY]
GO
ALTER TABLE siono ADD CONSTRAINT UQ_siono_001___ UNIQUE NONCLUSTERED (codigo_siono) ON [PRIMARY]
GO
ALTER TABLE tipo_aba_agua ADD CONSTRAINT UQ_tipo_aba_agua_001___ UNIQUE NONCLUSTERED (codigo_tipo_aba_agua) ON [PRIMARY]
GO
ALTER TABLE tipo_act_jupe ADD CONSTRAINT UQ_tipo_act_jupe_001___ UNIQUE NONCLUSTERED (codigo_tipo_act_jupe) ON [PRIMARY]
GO
ALTER TABLE tipo_arc_dat_ext ADD CONSTRAINT UQ_tipo_arc_dat_ext_001___ UNIQUE NONCLUSTERED (codigo_tipo_arc_dat_ext) ON [PRIMARY]
GO
ALTER TABLE tipo_area ADD CONSTRAINT UQ_tipo_area_001___ UNIQUE NONCLUSTERED (codigo_tipo_area) ON [PRIMARY]
GO
ALTER TABLE tipo_clase_recurso ADD CONSTRAINT UQ_tipo_clase_recurso_001___ UNIQUE NONCLUSTERED (codigo_tipo_clase_recurso) ON [PRIMARY]
GO
ALTER TABLE tipo_combustible ADD CONSTRAINT UQ_tipo_combustible_001___ UNIQUE NONCLUSTERED (codigo_tipo_combustible) ON [PRIMARY]
GO
ALTER TABLE tipo_comparacion ADD CONSTRAINT UQ_tipo_comparacion_001___ UNIQUE NONCLUSTERED (codigo_tipo_comparacion) ON [PRIMARY]
GO
ALTER TABLE tipo_dato_par ADD CONSTRAINT UQ_tipo_dato_par_001___ UNIQUE NONCLUSTERED (codigo_tipo_dato_par) ON [PRIMARY]
GO
ALTER TABLE tipo_desecho_bas ADD CONSTRAINT UQ_tipo_desecho_bas_001___ UNIQUE NONCLUSTERED (codigo_tipo_desecho_bas) ON [PRIMARY]
GO
ALTER TABLE tipo_dominio ADD CONSTRAINT UQ_tipo_dominio_001___ UNIQUE NONCLUSTERED (codigo_tipo_dominio) ON [PRIMARY]
GO
ALTER TABLE tipo_excepcion_ced ADD CONSTRAINT UQ_tipo_excepcion_ced_001___ UNIQUE NONCLUSTERED (codigo_tipo_excepcion_ced) ON [PRIMARY]
GO
ALTER TABLE tipo_funcion ADD CONSTRAINT UQ_tipo_funcion_001___ UNIQUE NONCLUSTERED (codigo_tipo_funcion) ON [PRIMARY]
GO
ALTER TABLE tipo_mat_paredes ADD CONSTRAINT UQ_tipo_mat_paredes_001___ UNIQUE NONCLUSTERED (codigo_tipo_mat_paredes) ON [PRIMARY]
GO
ALTER TABLE tipo_mat_piso ADD CONSTRAINT UQ_tipo_mat_piso_001___ UNIQUE NONCLUSTERED (codigo_tipo_mat_piso) ON [PRIMARY]
GO
ALTER TABLE tipo_mat_techo ADD CONSTRAINT UQ_tipo_mat_techo_001___ UNIQUE NONCLUSTERED (codigo_tipo_mat_techo) ON [PRIMARY]
GO
ALTER TABLE tipo_nodo ADD CONSTRAINT UQ_tipo_nodo_001___ UNIQUE NONCLUSTERED (codigo_tipo_nodo) ON [PRIMARY]
GO
ALTER TABLE tipo_obj_ele_pen ADD CONSTRAINT UQ_tipo_obj_ele_pen_001___ UNIQUE NONCLUSTERED (codigo_tipo_obj_ele_pen) ON [PRIMARY]
GO
ALTER TABLE tipo_ocupacion_viv ADD CONSTRAINT UQ_tipo_ocupacion_viv_001___ UNIQUE NONCLUSTERED (codigo_tipo_ocupacion_viv) ON [PRIMARY]
GO
ALTER TABLE tipo_pagina ADD CONSTRAINT UQ_tipo_pagina_001___ UNIQUE NONCLUSTERED (codigo_tipo_pagina) ON [PRIMARY]
GO
ALTER TABLE tipo_parametro ADD CONSTRAINT UQ_tipo_parametro_001___ UNIQUE NONCLUSTERED (codigo_tipo_parametro) ON [PRIMARY]
GO
ALTER TABLE tipo_parametro_dom ADD CONSTRAINT UQ_tipo_parametro_dom_001___ UNIQUE NONCLUSTERED (codigo_tipo_parametro_dom) ON [PRIMARY]
GO
ALTER TABLE tipo_parametro_dom ADD CONSTRAINT UQ_tipo_parametro_dom_002___ UNIQUE NONCLUSTERED (codigo_propiedad_interfaz) ON [PRIMARY]
GO
ALTER TABLE tipo_parametro_dom ADD CONSTRAINT UQ_tipo_parametro_dom_003___ UNIQUE NONCLUSTERED (nombre_interfaz) ON [PRIMARY]
GO
ALTER TABLE tipo_persona_hogar ADD CONSTRAINT UQ_tipo_persona_hogar_001___ UNIQUE NONCLUSTERED (codigo_tipo_persona_hogar) ON [PRIMARY]
GO
ALTER TABLE tipo_pieza_bano ADD CONSTRAINT UQ_tipo_pieza_bano_001___ UNIQUE NONCLUSTERED (codigo_tipo_pieza_bano) ON [PRIMARY]
GO
ALTER TABLE tipo_rastro_fun ADD CONSTRAINT UQ_tipo_rastro_fun_001___ UNIQUE NONCLUSTERED (codigo_tipo_rastro_fun) ON [PRIMARY]
GO
ALTER TABLE tipo_recurso ADD CONSTRAINT UQ_tipo_recurso_001___ UNIQUE NONCLUSTERED (codigo_tipo_recurso) ON [PRIMARY]
GO
ALTER TABLE tipo_reg_pot_ben ADD CONSTRAINT UQ_tipo_reg_pot_ben_001___ UNIQUE NONCLUSTERED (codigo_tipo_reg_pot_ben) ON [PRIMARY]
GO
ALTER TABLE tipo_relacion_lab ADD CONSTRAINT UQ_tipo_relacion_lab_001___ UNIQUE NONCLUSTERED (codigo_tipo_relacion_lab) ON [PRIMARY]
GO
ALTER TABLE tipo_rol ADD CONSTRAINT UQ_tipo_rol_001___ UNIQUE NONCLUSTERED (codigo_tipo_rol) ON [PRIMARY]
GO
ALTER TABLE tipo_seguro_medico ADD CONSTRAINT UQ_tipo_seguro_medico_001___ UNIQUE NONCLUSTERED (codigo_tipo_seguro_medico) ON [PRIMARY]
GO
ALTER TABLE tipo_servicio_agua ADD CONSTRAINT UQ_tipo_servicio_agua_001___ UNIQUE NONCLUSTERED (codigo_tipo_servicio_agua) ON [PRIMARY]
GO
ALTER TABLE tipo_servicio_san ADD CONSTRAINT UQ_tipo_servicio_san_001___ UNIQUE NONCLUSTERED (codigo_tipo_servicio_san) ON [PRIMARY]
GO
ALTER TABLE tipo_valor ADD CONSTRAINT UQ_tipo_valor_001___ UNIQUE NONCLUSTERED (codigo_tipo_valor) ON [PRIMARY]
GO
ALTER TABLE ubicacion ADD CONSTRAINT UQ_ubicacion_001___ UNIQUE NONCLUSTERED (codigo_ubicacion) ON [PRIMARY]
GO
ALTER TABLE usuario ADD CONSTRAINT UQ_usuario_001___ UNIQUE NONCLUSTERED (codigo_usuario) ON [PRIMARY]
GO
