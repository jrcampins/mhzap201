ALTER TABLE aplicacion ADD CONSTRAINT PK_aplicacion_ZYX PRIMARY KEY (id_aplicacion);
ALTER TABLE archivo_datos_ext ADD CONSTRAINT PK_archivo_datos_ext_ZYX PRIMARY KEY (id_archivo_datos_ext);
ALTER TABLE causa_den_pension ADD CONSTRAINT PK_causa_den_pension_ZYX PRIMARY KEY (numero_causa_den_pension);
ALTER TABLE causa_den_recl_cen ADD CONSTRAINT PK_causa_den_recl_cen_ZYX PRIMARY KEY (numero_causa_den_recl_cen);
ALTER TABLE causa_den_reco_pen ADD CONSTRAINT PK_causa_den_reco_pen_ZYX PRIMARY KEY (numero_causa_den_reco_pen);
ALTER TABLE causa_impedimento ADD CONSTRAINT PK_causa_impedimento_ZYX PRIMARY KEY (numero_causa_impedimento);
ALTER TABLE causa_inv_censo ADD CONSTRAINT PK_causa_inv_censo_ZYX PRIMARY KEY (numero_causa_inv_censo);
ALTER TABLE causa_rev_pension ADD CONSTRAINT PK_causa_rev_pension_ZYX PRIMARY KEY (numero_causa_rev_pension);
ALTER TABLE clase_enf_acc ADD CONSTRAINT PK_clase_enf_acc_ZYX PRIMARY KEY (numero_clase_enf_acc);
ALTER TABLE clase_enf_cronica ADD CONSTRAINT PK_clase_enf_cronica_ZYX PRIMARY KEY (numero_clase_enf_cronica);
ALTER TABLE clase_impedimento ADD CONSTRAINT PK_clase_impedimento_ZYX PRIMARY KEY (numero_clase_impedimento);
ALTER TABLE clase_recurso ADD CONSTRAINT PK_clase_recurso_ZYX PRIMARY KEY (id_clase_recurso);
ALTER TABLE clase_recurso_par ADD CONSTRAINT PK_clase_recurso_par_ZYX PRIMARY KEY (id_clase_recurso_par);
ALTER TABLE clase_recurso_sec ADD CONSTRAINT PK_clase_recurso_sec_ZYX PRIMARY KEY (id_clase_recurso_sec);
ALTER TABLE condicion_censo ADD CONSTRAINT PK_condicion_censo_ZYX PRIMARY KEY (numero_condicion_censo);
ALTER TABLE condicion_denu_pen ADD CONSTRAINT PK_condicion_denu_pen_ZYX PRIMARY KEY (numero_condicion_denu_pen);
ALTER TABLE condicion_eje_fun ADD CONSTRAINT PK_condicion_eje_fun_ZYX PRIMARY KEY (numero_condicion_eje_fun);
ALTER TABLE condicion_pension ADD CONSTRAINT PK_condicion_pension_ZYX PRIMARY KEY (numero_condicion_pension);
ALTER TABLE condicion_recl_cen ADD CONSTRAINT PK_condicion_recl_cen_ZYX PRIMARY KEY (numero_condicion_recl_cen);
ALTER TABLE condicion_reco_pen ADD CONSTRAINT PK_condicion_reco_pen_ZYX PRIMARY KEY (numero_condicion_reco_pen);
ALTER TABLE conjunto_segmento ADD CONSTRAINT PK_conjunto_segmento_ZYX PRIMARY KEY (id_conjunto_segmento);
ALTER TABLE dominio ADD CONSTRAINT PK_dominio_ZYX PRIMARY KEY (id_dominio);
ALTER TABLE dominio_paquete ADD CONSTRAINT PK_dominio_paquete_ZYX PRIMARY KEY (id_dominio_paquete);
ALTER TABLE dominio_parametro ADD CONSTRAINT PK_dominio_parametro_ZYX PRIMARY KEY (id_dominio_parametro);
ALTER TABLE elemento_segmento ADD CONSTRAINT PK_elemento_segmento_ZYX PRIMARY KEY (id_elemento_segmento);
ALTER TABLE estado_civil ADD CONSTRAINT PK_estado_civil_ZYX PRIMARY KEY (numero_estado_civil);
ALTER TABLE estado_salud ADD CONSTRAINT PK_estado_salud_ZYX PRIMARY KEY (numero_estado_salud);
ALTER TABLE etnia_indigena ADD CONSTRAINT PK_etnia_indigena_ZYX PRIMARY KEY (id_etnia_indigena);
ALTER TABLE ficha_hogar ADD CONSTRAINT PK_ficha_hogar_ZYX PRIMARY KEY (id_ficha_hogar);
ALTER TABLE ficha_persona ADD CONSTRAINT PK_ficha_persona_ZYX PRIMARY KEY (id_ficha_persona);
ALTER TABLE filtro_cla_rec_fun ADD CONSTRAINT PK_filtro_cla_rec_fun_ZYX PRIMARY KEY (id_filtro_cla_rec_fun);
ALTER TABLE filtro_cla_rec_par ADD CONSTRAINT PK_filtro_cla_rec_par_ZYX PRIMARY KEY (id_filtro_cla_rec_par);
ALTER TABLE filtro_cla_rec_sec ADD CONSTRAINT PK_filtro_cla_rec_sec_ZYX PRIMARY KEY (id_filtro_cla_rec_sec);
ALTER TABLE filtro_cla_rec_vin ADD CONSTRAINT PK_filtro_cla_rec_vin_ZYX PRIMARY KEY (id_filtro_cla_rec_vin);
ALTER TABLE filtro_funcion ADD CONSTRAINT PK_filtro_funcion_ZYX PRIMARY KEY (id_filtro_funcion);
ALTER TABLE filtro_funcion_par ADD CONSTRAINT PK_filtro_funcion_par_ZYX PRIMARY KEY (id_filtro_funcion_par);
ALTER TABLE funcion ADD CONSTRAINT PK_funcion_ZYX PRIMARY KEY (id_funcion);
ALTER TABLE funcion_parametro ADD CONSTRAINT PK_funcion_parametro_ZYX PRIMARY KEY (id_funcion_parametro);
ALTER TABLE funcionario ADD CONSTRAINT PK_funcionario_ZYX PRIMARY KEY (id_funcionario);
ALTER TABLE grupo_aplicacion ADD CONSTRAINT PK_grupo_aplicacion_ZYX PRIMARY KEY (id_grupo_aplicacion);
ALTER TABLE grupo_proceso ADD CONSTRAINT PK_grupo_proceso_ZYX PRIMARY KEY (id_grupo_proceso);
ALTER TABLE idioma_hogar ADD CONSTRAINT PK_idioma_hogar_ZYX PRIMARY KEY (numero_idioma_hogar);
ALTER TABLE informe ADD CONSTRAINT PK_informe_ZYX PRIMARY KEY (id_informe);
ALTER TABLE informe_auditoria ADD CONSTRAINT PK_informe_auditoria_ZYX PRIMARY KEY (id_informe_auditoria);
ALTER TABLE mensaje ADD CONSTRAINT PK_mensaje_ZYX PRIMARY KEY (id_mensaje);
ALTER TABLE motivo_ina_esc ADD CONSTRAINT PK_motivo_ina_esc_ZYX PRIMARY KEY (numero_motivo_ina_esc);
ALTER TABLE motivo_no_atencion ADD CONSTRAINT PK_motivo_no_atencion_ZYX PRIMARY KEY (numero_motivo_no_atencion);
ALTER TABLE motivo_no_trabajo ADD CONSTRAINT PK_motivo_no_trabajo_ZYX PRIMARY KEY (numero_motivo_no_trabajo);
ALTER TABLE nivel_educativo ADD CONSTRAINT PK_nivel_educativo_ZYX PRIMARY KEY (numero_nivel_educativo);
ALTER TABLE nivel_opcion_menu ADD CONSTRAINT PK_nivel_opcion_menu_ZYX PRIMARY KEY (numero_nivel_opcion_menu);
ALTER TABLE nivel_ubicacion ADD CONSTRAINT PK_nivel_ubicacion_ZYX PRIMARY KEY (numero_nivel_ubicacion);
ALTER TABLE objecion_ele_pen ADD CONSTRAINT PK_objecion_ele_pen_ZYX PRIMARY KEY (id_objecion_ele_pen);
ALTER TABLE opcion_binaria ADD CONSTRAINT PK_opcion_binaria_ZYX PRIMARY KEY (numero_opcion_binaria);
ALTER TABLE opcion_menu ADD CONSTRAINT PK_opcion_menu_ZYX PRIMARY KEY (id_opcion_menu);
ALTER TABLE opcion_menu_plus ADD CONSTRAINT PK_opcion_menu_plus_ZYX PRIMARY KEY (id_opcion_menu);
ALTER TABLE opcion_sistema ADD CONSTRAINT PK_opcion_sistema_ZYX PRIMARY KEY (id_opcion_sistema);
ALTER TABLE operador_com ADD CONSTRAINT PK_operador_com_ZYX PRIMARY KEY (numero_operador_com);
ALTER TABLE pagina ADD CONSTRAINT PK_pagina_ZYX PRIMARY KEY (id_pagina);
ALTER TABLE pagina_funcion ADD CONSTRAINT PK_pagina_funcion_ZYX PRIMARY KEY (id_pagina_funcion);
ALTER TABLE pagina_usuario ADD CONSTRAINT PK_pagina_usuario_ZYX PRIMARY KEY (id_pagina_usuario);
ALTER TABLE paquete ADD CONSTRAINT PK_paquete_ZYX PRIMARY KEY (id_paquete);
ALTER TABLE parametro ADD CONSTRAINT PK_parametro_ZYX PRIMARY KEY (id_parametro);
ALTER TABLE parametro_global ADD CONSTRAINT PK_parametro_global_ZYX PRIMARY KEY (numero_parametro_global);
ALTER TABLE persona ADD CONSTRAINT PK_persona_ZYX PRIMARY KEY (id_persona);
ALTER TABLE potencial_ben ADD CONSTRAINT PK_potencial_ben_ZYX PRIMARY KEY (id_potencial_ben);
ALTER TABLE proceso ADD CONSTRAINT PK_proceso_ZYX PRIMARY KEY (id_proceso);
ALTER TABLE proveedor_dat_ext ADD CONSTRAINT PK_proveedor_dat_ext_ZYX PRIMARY KEY (id_proveedor_dat_ext);
ALTER TABLE rastro_funcion ADD CONSTRAINT PK_rastro_funcion_ZYX PRIMARY KEY (id_rastro_funcion);
ALTER TABLE rastro_funcion_par ADD CONSTRAINT PK_rastro_funcion_par_ZYX PRIMARY KEY (id_rastro_funcion_par);
ALTER TABLE rastro_informe ADD CONSTRAINT PK_rastro_informe_ZYX PRIMARY KEY (id_rastro_informe);
ALTER TABLE rastro_proceso ADD CONSTRAINT PK_rastro_proceso_ZYX PRIMARY KEY (id_rastro_proceso);
ALTER TABLE recurso ADD CONSTRAINT PK_recurso_ZYX PRIMARY KEY (id_recurso);
ALTER TABLE rol ADD CONSTRAINT PK_rol_ZYX PRIMARY KEY (id_rol);
ALTER TABLE rol_aplicacion ADD CONSTRAINT PK_rol_aplicacion_ZYX PRIMARY KEY (id_rol_aplicacion);
ALTER TABLE rol_filtro_funcion ADD CONSTRAINT PK_rol_filtro_funcion_ZYX PRIMARY KEY (id_rol_filtro_funcion);
ALTER TABLE rol_funcion ADD CONSTRAINT PK_rol_funcion_ZYX PRIMARY KEY (id_rol_funcion);
ALTER TABLE rol_pagina ADD CONSTRAINT PK_rol_pagina_ZYX PRIMARY KEY (id_rol_pagina);
ALTER TABLE rol_usuario ADD CONSTRAINT PK_rol_usuario_ZYX PRIMARY KEY (id_rol_usuario);
ALTER TABLE sexo_persona ADD CONSTRAINT PK_sexo_persona_ZYX PRIMARY KEY (numero_sexo_persona);
ALTER TABLE siono ADD CONSTRAINT PK_siono_ZYX PRIMARY KEY (numero_siono);
ALTER TABLE tipo_aba_agua ADD CONSTRAINT PK_tipo_aba_agua_ZYX PRIMARY KEY (numero_tipo_aba_agua);
ALTER TABLE tipo_act_jupe ADD CONSTRAINT PK_tipo_act_jupe_ZYX PRIMARY KEY (numero_tipo_act_jupe);
ALTER TABLE tipo_arc_dat_ext ADD CONSTRAINT PK_tipo_arc_dat_ext_ZYX PRIMARY KEY (numero_tipo_arc_dat_ext);
ALTER TABLE tipo_area ADD CONSTRAINT PK_tipo_area_ZYX PRIMARY KEY (numero_tipo_area);
ALTER TABLE tipo_clase_recurso ADD CONSTRAINT PK_tipo_clase_recurso_ZYX PRIMARY KEY (numero_tipo_clase_recurso);
ALTER TABLE tipo_combustible ADD CONSTRAINT PK_tipo_combustible_ZYX PRIMARY KEY (numero_tipo_combustible);
ALTER TABLE tipo_comparacion ADD CONSTRAINT PK_tipo_comparacion_ZYX PRIMARY KEY (numero_tipo_comparacion);
ALTER TABLE tipo_dato_par ADD CONSTRAINT PK_tipo_dato_par_ZYX PRIMARY KEY (numero_tipo_dato_par);
ALTER TABLE tipo_desecho_bas ADD CONSTRAINT PK_tipo_desecho_bas_ZYX PRIMARY KEY (numero_tipo_desecho_bas);
ALTER TABLE tipo_dominio ADD CONSTRAINT PK_tipo_dominio_ZYX PRIMARY KEY (numero_tipo_dominio);
ALTER TABLE tipo_excepcion_ced ADD CONSTRAINT PK_tipo_excepcion_ced_ZYX PRIMARY KEY (numero_tipo_excepcion_ced);
ALTER TABLE tipo_funcion ADD CONSTRAINT PK_tipo_funcion_ZYX PRIMARY KEY (numero_tipo_funcion);
ALTER TABLE tipo_mat_paredes ADD CONSTRAINT PK_tipo_mat_paredes_ZYX PRIMARY KEY (numero_tipo_mat_paredes);
ALTER TABLE tipo_mat_piso ADD CONSTRAINT PK_tipo_mat_piso_ZYX PRIMARY KEY (numero_tipo_mat_piso);
ALTER TABLE tipo_mat_techo ADD CONSTRAINT PK_tipo_mat_techo_ZYX PRIMARY KEY (numero_tipo_mat_techo);
ALTER TABLE tipo_nodo ADD CONSTRAINT PK_tipo_nodo_ZYX PRIMARY KEY (numero_tipo_nodo);
ALTER TABLE tipo_obj_ele_pen ADD CONSTRAINT PK_tipo_obj_ele_pen_ZYX PRIMARY KEY (numero_tipo_obj_ele_pen);
ALTER TABLE tipo_ocupacion_viv ADD CONSTRAINT PK_tipo_ocupacion_viv_ZYX PRIMARY KEY (numero_tipo_ocupacion_viv);
ALTER TABLE tipo_pagina ADD CONSTRAINT PK_tipo_pagina_ZYX PRIMARY KEY (numero_tipo_pagina);
ALTER TABLE tipo_parametro ADD CONSTRAINT PK_tipo_parametro_ZYX PRIMARY KEY (numero_tipo_parametro);
ALTER TABLE tipo_parametro_dom ADD CONSTRAINT PK_tipo_parametro_dom_ZYX PRIMARY KEY (numero_tipo_parametro_dom);
ALTER TABLE tipo_persona_hogar ADD CONSTRAINT PK_tipo_persona_hogar_ZYX PRIMARY KEY (numero_tipo_persona_hogar);
ALTER TABLE tipo_pieza_bano ADD CONSTRAINT PK_tipo_pieza_bano_ZYX PRIMARY KEY (numero_tipo_pieza_bano);
ALTER TABLE tipo_rastro_fun ADD CONSTRAINT PK_tipo_rastro_fun_ZYX PRIMARY KEY (numero_tipo_rastro_fun);
ALTER TABLE tipo_recurso ADD CONSTRAINT PK_tipo_recurso_ZYX PRIMARY KEY (numero_tipo_recurso);
ALTER TABLE tipo_reg_pot_ben ADD CONSTRAINT PK_tipo_reg_pot_ben_ZYX PRIMARY KEY (numero_tipo_reg_pot_ben);
ALTER TABLE tipo_relacion_lab ADD CONSTRAINT PK_tipo_relacion_lab_ZYX PRIMARY KEY (numero_tipo_relacion_lab);
ALTER TABLE tipo_rol ADD CONSTRAINT PK_tipo_rol_ZYX PRIMARY KEY (numero_tipo_rol);
ALTER TABLE tipo_seguro_medico ADD CONSTRAINT PK_tipo_seguro_medico_ZYX PRIMARY KEY (numero_tipo_seguro_medico);
ALTER TABLE tipo_servicio_agua ADD CONSTRAINT PK_tipo_servicio_agua_ZYX PRIMARY KEY (numero_tipo_servicio_agua);
ALTER TABLE tipo_servicio_san ADD CONSTRAINT PK_tipo_servicio_san_ZYX PRIMARY KEY (numero_tipo_servicio_san);
ALTER TABLE tipo_valor ADD CONSTRAINT PK_tipo_valor_ZYX PRIMARY KEY (numero_tipo_valor);
ALTER TABLE ubicacion ADD CONSTRAINT PK_ubicacion_ZYX PRIMARY KEY (id_ubicacion);
ALTER TABLE ubicacion_plus ADD CONSTRAINT PK_ubicacion_plus_ZYX PRIMARY KEY (id_ubicacion);
ALTER TABLE usuario ADD CONSTRAINT PK_usuario_ZYX PRIMARY KEY (id_usuario);
ALTER TABLE visita_censo ADD CONSTRAINT PK_visita_censo_ZYX PRIMARY KEY (id_visita_censo);
