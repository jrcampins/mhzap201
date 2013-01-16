CREATE UNIQUE INDEX UQ_aplicacion_001_IX ON aplicacion (codigo_aplicacion);
ALTER TABLE aplicacion ADD (CONSTRAINT UQ_aplicacion_001___ UNIQUE (codigo_aplicacion));
CREATE UNIQUE INDEX UQ_archivo_datos_ext_001_IX ON archivo_datos_ext (codigo_archivo_datos_ext);
ALTER TABLE archivo_datos_ext ADD (CONSTRAINT UQ_archivo_datos_ext_001___ UNIQUE (codigo_archivo_datos_ext));
CREATE UNIQUE INDEX UQ_causa_den_pension_001_IX ON causa_den_pension (codigo_causa_den_pension);
ALTER TABLE causa_den_pension ADD (CONSTRAINT UQ_causa_den_pension_001___ UNIQUE (codigo_causa_den_pension));
CREATE UNIQUE INDEX UQ_causa_den_recl_cen_001_IX ON causa_den_recl_cen (codigo_causa_den_recl_cen);
ALTER TABLE causa_den_recl_cen ADD (CONSTRAINT UQ_causa_den_recl_cen_001___ UNIQUE (codigo_causa_den_recl_cen));
CREATE UNIQUE INDEX UQ_causa_den_reco_pen_001_IX ON causa_den_reco_pen (codigo_causa_den_reco_pen);
ALTER TABLE causa_den_reco_pen ADD (CONSTRAINT UQ_causa_den_reco_pen_001___ UNIQUE (codigo_causa_den_reco_pen));
CREATE UNIQUE INDEX UQ_causa_impedimento_001_IX ON causa_impedimento (codigo_causa_impedimento);
ALTER TABLE causa_impedimento ADD (CONSTRAINT UQ_causa_impedimento_001___ UNIQUE (codigo_causa_impedimento));
CREATE UNIQUE INDEX UQ_causa_inv_censo_001_IX ON causa_inv_censo (codigo_causa_inv_censo);
ALTER TABLE causa_inv_censo ADD (CONSTRAINT UQ_causa_inv_censo_001___ UNIQUE (codigo_causa_inv_censo));
CREATE UNIQUE INDEX UQ_causa_rev_pension_001_IX ON causa_rev_pension (codigo_causa_rev_pension);
ALTER TABLE causa_rev_pension ADD (CONSTRAINT UQ_causa_rev_pension_001___ UNIQUE (codigo_causa_rev_pension));
CREATE UNIQUE INDEX UQ_clase_enf_acc_001_IX ON clase_enf_acc (codigo_clase_enf_acc);
ALTER TABLE clase_enf_acc ADD (CONSTRAINT UQ_clase_enf_acc_001___ UNIQUE (codigo_clase_enf_acc));
CREATE UNIQUE INDEX UQ_clase_enf_cronica_001_IX ON clase_enf_cronica (codigo_clase_enf_cronica);
ALTER TABLE clase_enf_cronica ADD (CONSTRAINT UQ_clase_enf_cronica_001___ UNIQUE (codigo_clase_enf_cronica));
CREATE UNIQUE INDEX UQ_clase_impedimento_001_IX ON clase_impedimento (codigo_clase_impedimento);
ALTER TABLE clase_impedimento ADD (CONSTRAINT UQ_clase_impedimento_001___ UNIQUE (codigo_clase_impedimento));
CREATE UNIQUE INDEX UQ_clase_recurso_001_IX ON clase_recurso (codigo_clase_recurso);
ALTER TABLE clase_recurso ADD (CONSTRAINT UQ_clase_recurso_001___ UNIQUE (codigo_clase_recurso));
CREATE UNIQUE INDEX UQ_clase_recurso_par_001_IX ON clase_recurso_par (id_clase_recurso, id_parametro);
ALTER TABLE clase_recurso_par ADD (CONSTRAINT UQ_clase_recurso_par_001___ UNIQUE (id_clase_recurso, id_parametro));
CREATE UNIQUE INDEX UQ_clase_recurso_sec_001_IX ON clase_recurso_sec (id_clase_recurso, etiqueta_clase_recurso_sec);
ALTER TABLE clase_recurso_sec ADD (CONSTRAINT UQ_clase_recurso_sec_001___ UNIQUE (id_clase_recurso, etiqueta_clase_recurso_sec));
CREATE UNIQUE INDEX UQ_condicion_censo_001_IX ON condicion_censo (codigo_condicion_censo);
ALTER TABLE condicion_censo ADD (CONSTRAINT UQ_condicion_censo_001___ UNIQUE (codigo_condicion_censo));
CREATE UNIQUE INDEX UQ_condicion_denu_pen_001_IX ON condicion_denu_pen (codigo_condicion_denu_pen);
ALTER TABLE condicion_denu_pen ADD (CONSTRAINT UQ_condicion_denu_pen_001___ UNIQUE (codigo_condicion_denu_pen));
CREATE UNIQUE INDEX UQ_condicion_eje_fun_001_IX ON condicion_eje_fun (codigo_condicion_eje_fun);
ALTER TABLE condicion_eje_fun ADD (CONSTRAINT UQ_condicion_eje_fun_001___ UNIQUE (codigo_condicion_eje_fun));
CREATE UNIQUE INDEX UQ_condicion_pension_001_IX ON condicion_pension (codigo_condicion_pension);
ALTER TABLE condicion_pension ADD (CONSTRAINT UQ_condicion_pension_001___ UNIQUE (codigo_condicion_pension));
CREATE UNIQUE INDEX UQ_condicion_recl_cen_001_IX ON condicion_recl_cen (codigo_condicion_recl_cen);
ALTER TABLE condicion_recl_cen ADD (CONSTRAINT UQ_condicion_recl_cen_001___ UNIQUE (codigo_condicion_recl_cen));
CREATE UNIQUE INDEX UQ_condicion_reco_pen_001_IX ON condicion_reco_pen (codigo_condicion_reco_pen);
ALTER TABLE condicion_reco_pen ADD (CONSTRAINT UQ_condicion_reco_pen_001___ UNIQUE (codigo_condicion_reco_pen));
CREATE UNIQUE INDEX UQ_conjunto_segmento_001_IX ON conjunto_segmento (codigo_conjunto_segmento);
ALTER TABLE conjunto_segmento ADD (CONSTRAINT UQ_conjunto_segmento_001___ UNIQUE (codigo_conjunto_segmento));
CREATE UNIQUE INDEX UQ_dominio_001_IX ON dominio (codigo_dominio);
ALTER TABLE dominio ADD (CONSTRAINT UQ_dominio_001___ UNIQUE (codigo_dominio));
CREATE UNIQUE INDEX UQ_dominio_paquete_001_IX ON dominio_paquete (id_dominio, id_paquete);
ALTER TABLE dominio_paquete ADD (CONSTRAINT UQ_dominio_paquete_001___ UNIQUE (id_dominio, id_paquete));
CREATE UNIQUE INDEX UQ_dominio_parametro_001_IX ON dominio_parametro (id_dominio, numero_tipo_parametro_dom);
ALTER TABLE dominio_parametro ADD (CONSTRAINT UQ_dominio_parametro_001___ UNIQUE (id_dominio, numero_tipo_parametro_dom));
CREATE UNIQUE INDEX UQ_elemento_segmento_001_IX ON elemento_segmento (id_conjunto_segmento, id_segmento);
ALTER TABLE elemento_segmento ADD (CONSTRAINT UQ_elemento_segmento_001___ UNIQUE (id_conjunto_segmento, id_segmento));
CREATE UNIQUE INDEX UQ_estado_civil_001_IX ON estado_civil (codigo_estado_civil);
ALTER TABLE estado_civil ADD (CONSTRAINT UQ_estado_civil_001___ UNIQUE (codigo_estado_civil));
CREATE UNIQUE INDEX UQ_estado_salud_001_IX ON estado_salud (codigo_estado_salud);
ALTER TABLE estado_salud ADD (CONSTRAINT UQ_estado_salud_001___ UNIQUE (codigo_estado_salud));
CREATE UNIQUE INDEX UQ_etnia_indigena_001_IX ON etnia_indigena (codigo_etnia_indigena);
ALTER TABLE etnia_indigena ADD (CONSTRAINT UQ_etnia_indigena_001___ UNIQUE (codigo_etnia_indigena));
CREATE UNIQUE INDEX UQ_ficha_hogar_001_IX ON ficha_hogar (codigo_ficha_hogar);
ALTER TABLE ficha_hogar ADD (CONSTRAINT UQ_ficha_hogar_001___ UNIQUE (codigo_ficha_hogar));
CREATE UNIQUE INDEX UQ_ficha_persona_001_IX ON ficha_persona (codigo_ficha_persona);
ALTER TABLE ficha_persona ADD (CONSTRAINT UQ_ficha_persona_001___ UNIQUE (codigo_ficha_persona));
CREATE UNIQUE INDEX UQ_ficha_persona_002_IX ON ficha_persona (id_ficha_hogar, numero_orden_identificacion);
ALTER TABLE ficha_persona ADD (CONSTRAINT UQ_ficha_persona_002___ UNIQUE (id_ficha_hogar, numero_orden_identificacion));
CREATE UNIQUE INDEX UQ_filtro_funcion_001_IX ON filtro_funcion (codigo_filtro_funcion);
ALTER TABLE filtro_funcion ADD (CONSTRAINT UQ_filtro_funcion_001___ UNIQUE (codigo_filtro_funcion));
CREATE UNIQUE INDEX UQ_funcion_001_IX ON funcion (codigo_funcion);
ALTER TABLE funcion ADD (CONSTRAINT UQ_funcion_001___ UNIQUE (codigo_funcion));
CREATE UNIQUE INDEX UQ_funcion_parametro_001_IX ON funcion_parametro (id_funcion, id_parametro);
ALTER TABLE funcion_parametro ADD (CONSTRAINT UQ_funcion_parametro_001___ UNIQUE (id_funcion, id_parametro));
CREATE UNIQUE INDEX UQ_funcionario_001_IX ON funcionario (codigo_funcionario);
ALTER TABLE funcionario ADD (CONSTRAINT UQ_funcionario_001___ UNIQUE (codigo_funcionario));
CREATE UNIQUE INDEX UQ_grupo_aplicacion_001_IX ON grupo_aplicacion (codigo_grupo_aplicacion);
ALTER TABLE grupo_aplicacion ADD (CONSTRAINT UQ_grupo_aplicacion_001___ UNIQUE (codigo_grupo_aplicacion));
CREATE UNIQUE INDEX UQ_grupo_proceso_001_IX ON grupo_proceso (codigo_grupo_proceso);
ALTER TABLE grupo_proceso ADD (CONSTRAINT UQ_grupo_proceso_001___ UNIQUE (codigo_grupo_proceso));
CREATE UNIQUE INDEX UQ_idioma_hogar_001_IX ON idioma_hogar (codigo_idioma_hogar);
ALTER TABLE idioma_hogar ADD (CONSTRAINT UQ_idioma_hogar_001___ UNIQUE (codigo_idioma_hogar));
CREATE UNIQUE INDEX UQ_informe_001_IX ON informe (codigo_informe);
ALTER TABLE informe ADD (CONSTRAINT UQ_informe_001___ UNIQUE (codigo_informe));
CREATE UNIQUE INDEX UQ_mensaje_001_IX ON mensaje (codigo_mensaje);
ALTER TABLE mensaje ADD (CONSTRAINT UQ_mensaje_001___ UNIQUE (codigo_mensaje));
CREATE UNIQUE INDEX UQ_motivo_ina_esc_001_IX ON motivo_ina_esc (codigo_motivo_ina_esc);
ALTER TABLE motivo_ina_esc ADD (CONSTRAINT UQ_motivo_ina_esc_001___ UNIQUE (codigo_motivo_ina_esc));
CREATE UNIQUE INDEX UQ_motivo_no_atencion_001_IX ON motivo_no_atencion (codigo_motivo_no_atencion);
ALTER TABLE motivo_no_atencion ADD (CONSTRAINT UQ_motivo_no_atencion_001___ UNIQUE (codigo_motivo_no_atencion));
CREATE UNIQUE INDEX UQ_motivo_no_trabajo_001_IX ON motivo_no_trabajo (codigo_motivo_no_trabajo);
ALTER TABLE motivo_no_trabajo ADD (CONSTRAINT UQ_motivo_no_trabajo_001___ UNIQUE (codigo_motivo_no_trabajo));
CREATE UNIQUE INDEX UQ_nivel_educativo_001_IX ON nivel_educativo (codigo_nivel_educativo);
ALTER TABLE nivel_educativo ADD (CONSTRAINT UQ_nivel_educativo_001___ UNIQUE (codigo_nivel_educativo));
CREATE UNIQUE INDEX UQ_nivel_opcion_menu_001_IX ON nivel_opcion_menu (codigo_nivel_opcion_menu);
ALTER TABLE nivel_opcion_menu ADD (CONSTRAINT UQ_nivel_opcion_menu_001___ UNIQUE (codigo_nivel_opcion_menu));
CREATE UNIQUE INDEX UQ_nivel_ubicacion_001_IX ON nivel_ubicacion (codigo_nivel_ubicacion);
ALTER TABLE nivel_ubicacion ADD (CONSTRAINT UQ_nivel_ubicacion_001___ UNIQUE (codigo_nivel_ubicacion));
CREATE UNIQUE INDEX UQ_opcion_binaria_001_IX ON opcion_binaria (codigo_opcion_si_no);
ALTER TABLE opcion_binaria ADD (CONSTRAINT UQ_opcion_binaria_001___ UNIQUE (codigo_opcion_si_no));
CREATE UNIQUE INDEX UQ_opcion_binaria_002_IX ON opcion_binaria (codigo_opcion_activo_inactivo);
ALTER TABLE opcion_binaria ADD (CONSTRAINT UQ_opcion_binaria_002___ UNIQUE (codigo_opcion_activo_inactivo));
CREATE UNIQUE INDEX UQ_opcion_binaria_003_IX ON opcion_binaria (codigo_opcion_enc_apa);
ALTER TABLE opcion_binaria ADD (CONSTRAINT UQ_opcion_binaria_003___ UNIQUE (codigo_opcion_enc_apa));
CREATE UNIQUE INDEX UQ_opcion_binaria_004_IX ON opcion_binaria (codigo_opcion_presente_ausente);
ALTER TABLE opcion_binaria ADD (CONSTRAINT UQ_opcion_binaria_004___ UNIQUE (codigo_opcion_presente_ausente));
CREATE UNIQUE INDEX UQ_opcion_binaria_005_IX ON opcion_binaria (codigo_opcion_pos_neg);
ALTER TABLE opcion_binaria ADD (CONSTRAINT UQ_opcion_binaria_005___ UNIQUE (codigo_opcion_pos_neg));
CREATE UNIQUE INDEX UQ_opcion_binaria_006_IX ON opcion_binaria (codigo_opcion_verdadero_falso);
ALTER TABLE opcion_binaria ADD (CONSTRAINT UQ_opcion_binaria_006___ UNIQUE (codigo_opcion_verdadero_falso));
CREATE UNIQUE INDEX UQ_opcion_menu_001_IX ON opcion_menu (codigo_opcion_menu);
ALTER TABLE opcion_menu ADD (CONSTRAINT UQ_opcion_menu_001___ UNIQUE (codigo_opcion_menu));
CREATE UNIQUE INDEX UQ_opcion_sistema_001_IX ON opcion_sistema (clave_opcion_sistema);
ALTER TABLE opcion_sistema ADD (CONSTRAINT UQ_opcion_sistema_001___ UNIQUE (clave_opcion_sistema));
CREATE UNIQUE INDEX UQ_operador_com_001_IX ON operador_com (codigo_operador_com);
ALTER TABLE operador_com ADD (CONSTRAINT UQ_operador_com_001___ UNIQUE (codigo_operador_com));
CREATE UNIQUE INDEX UQ_pagina_001_IX ON pagina (codigo_pagina, id_aplicacion);
ALTER TABLE pagina ADD (CONSTRAINT UQ_pagina_001___ UNIQUE (codigo_pagina, id_aplicacion));
CREATE UNIQUE INDEX UQ_pagina_funcion_001_IX ON pagina_funcion (id_pagina, id_funcion);
ALTER TABLE pagina_funcion ADD (CONSTRAINT UQ_pagina_funcion_001___ UNIQUE (id_pagina, id_funcion));
CREATE UNIQUE INDEX UQ_pagina_usuario_001_IX ON pagina_usuario (id_pagina, id_usuario);
ALTER TABLE pagina_usuario ADD (CONSTRAINT UQ_pagina_usuario_001___ UNIQUE (id_pagina, id_usuario));
CREATE UNIQUE INDEX UQ_paquete_001_IX ON paquete (codigo_paquete);
ALTER TABLE paquete ADD (CONSTRAINT UQ_paquete_001___ UNIQUE (codigo_paquete));
CREATE UNIQUE INDEX UQ_parametro_001_IX ON parametro (codigo_parametro);
ALTER TABLE parametro ADD (CONSTRAINT UQ_parametro_001___ UNIQUE (codigo_parametro));
CREATE UNIQUE INDEX UQ_parametro_global_001_IX ON parametro_global (codigo_parametro_global);
ALTER TABLE parametro_global ADD (CONSTRAINT UQ_parametro_global_001___ UNIQUE (codigo_parametro_global));
CREATE UNIQUE INDEX UQ_persona_001_IX ON persona (numero_cedula, letra_cedula);
ALTER TABLE persona ADD (CONSTRAINT UQ_persona_001___ UNIQUE (numero_cedula, letra_cedula));
CREATE UNIQUE INDEX UQ_persona_002_IX ON persona (codigo_persona);
ALTER TABLE persona ADD (CONSTRAINT UQ_persona_002___ UNIQUE (codigo_persona));
CREATE UNIQUE INDEX UQ_potencial_ben_001_IX ON potencial_ben (codigo_potencial_ben);
ALTER TABLE potencial_ben ADD (CONSTRAINT UQ_potencial_ben_001___ UNIQUE (codigo_potencial_ben));
CREATE UNIQUE INDEX UQ_potencial_ben_002_IX ON potencial_ben (numero_cedula, letra_cedula);
ALTER TABLE potencial_ben ADD (CONSTRAINT UQ_potencial_ben_002___ UNIQUE (numero_cedula, letra_cedula));
CREATE UNIQUE INDEX UQ_potencial_ben_003_IX ON potencial_ben (id_persona);
ALTER TABLE potencial_ben ADD (CONSTRAINT UQ_potencial_ben_003___ UNIQUE (id_persona));
CREATE UNIQUE INDEX UQ_proceso_001_IX ON proceso (codigo_proceso);
ALTER TABLE proceso ADD (CONSTRAINT UQ_proceso_001___ UNIQUE (codigo_proceso));
CREATE UNIQUE INDEX UQ_proveedor_dat_ext_001_IX ON proveedor_dat_ext (codigo_proveedor_dat_ext);
ALTER TABLE proveedor_dat_ext ADD (CONSTRAINT UQ_proveedor_dat_ext_001___ UNIQUE (codigo_proveedor_dat_ext));
CREATE UNIQUE INDEX UQ_rol_001_IX ON rol (codigo_rol);
ALTER TABLE rol ADD (CONSTRAINT UQ_rol_001___ UNIQUE (codigo_rol));
CREATE UNIQUE INDEX UQ_rol_aplicacion_001_IX ON rol_aplicacion (id_rol, id_aplicacion);
ALTER TABLE rol_aplicacion ADD (CONSTRAINT UQ_rol_aplicacion_001___ UNIQUE (id_rol, id_aplicacion));
CREATE UNIQUE INDEX UQ_rol_filtro_funcion_001_IX ON rol_filtro_funcion (id_rol, id_filtro_funcion);
ALTER TABLE rol_filtro_funcion ADD (CONSTRAINT UQ_rol_filtro_funcion_001___ UNIQUE (id_rol, id_filtro_funcion));
CREATE UNIQUE INDEX UQ_rol_funcion_001_IX ON rol_funcion (id_rol, id_funcion);
ALTER TABLE rol_funcion ADD (CONSTRAINT UQ_rol_funcion_001___ UNIQUE (id_rol, id_funcion));
CREATE UNIQUE INDEX UQ_rol_pagina_001_IX ON rol_pagina (id_rol, id_pagina);
ALTER TABLE rol_pagina ADD (CONSTRAINT UQ_rol_pagina_001___ UNIQUE (id_rol, id_pagina));
CREATE UNIQUE INDEX UQ_rol_usuario_001_IX ON rol_usuario (id_rol, id_usuario);
ALTER TABLE rol_usuario ADD (CONSTRAINT UQ_rol_usuario_001___ UNIQUE (id_rol, id_usuario));
CREATE UNIQUE INDEX UQ_sexo_persona_001_IX ON sexo_persona (codigo_sexo_persona);
ALTER TABLE sexo_persona ADD (CONSTRAINT UQ_sexo_persona_001___ UNIQUE (codigo_sexo_persona));
CREATE UNIQUE INDEX UQ_siono_001_IX ON siono (codigo_siono);
ALTER TABLE siono ADD (CONSTRAINT UQ_siono_001___ UNIQUE (codigo_siono));
CREATE UNIQUE INDEX UQ_tipo_aba_agua_001_IX ON tipo_aba_agua (codigo_tipo_aba_agua);
ALTER TABLE tipo_aba_agua ADD (CONSTRAINT UQ_tipo_aba_agua_001___ UNIQUE (codigo_tipo_aba_agua));
CREATE UNIQUE INDEX UQ_tipo_act_jupe_001_IX ON tipo_act_jupe (codigo_tipo_act_jupe);
ALTER TABLE tipo_act_jupe ADD (CONSTRAINT UQ_tipo_act_jupe_001___ UNIQUE (codigo_tipo_act_jupe));
CREATE UNIQUE INDEX UQ_tipo_arc_dat_ext_001_IX ON tipo_arc_dat_ext (codigo_tipo_arc_dat_ext);
ALTER TABLE tipo_arc_dat_ext ADD (CONSTRAINT UQ_tipo_arc_dat_ext_001___ UNIQUE (codigo_tipo_arc_dat_ext));
CREATE UNIQUE INDEX UQ_tipo_area_001_IX ON tipo_area (codigo_tipo_area);
ALTER TABLE tipo_area ADD (CONSTRAINT UQ_tipo_area_001___ UNIQUE (codigo_tipo_area));
CREATE UNIQUE INDEX UQ_tipo_clase_recurso_001_IX ON tipo_clase_recurso (codigo_tipo_clase_recurso);
ALTER TABLE tipo_clase_recurso ADD (CONSTRAINT UQ_tipo_clase_recurso_001___ UNIQUE (codigo_tipo_clase_recurso));
CREATE UNIQUE INDEX UQ_tipo_combustible_001_IX ON tipo_combustible (codigo_tipo_combustible);
ALTER TABLE tipo_combustible ADD (CONSTRAINT UQ_tipo_combustible_001___ UNIQUE (codigo_tipo_combustible));
CREATE UNIQUE INDEX UQ_tipo_comparacion_001_IX ON tipo_comparacion (codigo_tipo_comparacion);
ALTER TABLE tipo_comparacion ADD (CONSTRAINT UQ_tipo_comparacion_001___ UNIQUE (codigo_tipo_comparacion));
CREATE UNIQUE INDEX UQ_tipo_dato_par_001_IX ON tipo_dato_par (codigo_tipo_dato_par);
ALTER TABLE tipo_dato_par ADD (CONSTRAINT UQ_tipo_dato_par_001___ UNIQUE (codigo_tipo_dato_par));
CREATE UNIQUE INDEX UQ_tipo_desecho_bas_001_IX ON tipo_desecho_bas (codigo_tipo_desecho_bas);
ALTER TABLE tipo_desecho_bas ADD (CONSTRAINT UQ_tipo_desecho_bas_001___ UNIQUE (codigo_tipo_desecho_bas));
CREATE UNIQUE INDEX UQ_tipo_dominio_001_IX ON tipo_dominio (codigo_tipo_dominio);
ALTER TABLE tipo_dominio ADD (CONSTRAINT UQ_tipo_dominio_001___ UNIQUE (codigo_tipo_dominio));
CREATE UNIQUE INDEX UQ_tipo_excepcion_ced_001_IX ON tipo_excepcion_ced (codigo_tipo_excepcion_ced);
ALTER TABLE tipo_excepcion_ced ADD (CONSTRAINT UQ_tipo_excepcion_ced_001___ UNIQUE (codigo_tipo_excepcion_ced));
CREATE UNIQUE INDEX UQ_tipo_funcion_001_IX ON tipo_funcion (codigo_tipo_funcion);
ALTER TABLE tipo_funcion ADD (CONSTRAINT UQ_tipo_funcion_001___ UNIQUE (codigo_tipo_funcion));
CREATE UNIQUE INDEX UQ_tipo_mat_paredes_001_IX ON tipo_mat_paredes (codigo_tipo_mat_paredes);
ALTER TABLE tipo_mat_paredes ADD (CONSTRAINT UQ_tipo_mat_paredes_001___ UNIQUE (codigo_tipo_mat_paredes));
CREATE UNIQUE INDEX UQ_tipo_mat_piso_001_IX ON tipo_mat_piso (codigo_tipo_mat_piso);
ALTER TABLE tipo_mat_piso ADD (CONSTRAINT UQ_tipo_mat_piso_001___ UNIQUE (codigo_tipo_mat_piso));
CREATE UNIQUE INDEX UQ_tipo_mat_techo_001_IX ON tipo_mat_techo (codigo_tipo_mat_techo);
ALTER TABLE tipo_mat_techo ADD (CONSTRAINT UQ_tipo_mat_techo_001___ UNIQUE (codigo_tipo_mat_techo));
CREATE UNIQUE INDEX UQ_tipo_nodo_001_IX ON tipo_nodo (codigo_tipo_nodo);
ALTER TABLE tipo_nodo ADD (CONSTRAINT UQ_tipo_nodo_001___ UNIQUE (codigo_tipo_nodo));
CREATE UNIQUE INDEX UQ_tipo_obj_ele_pen_001_IX ON tipo_obj_ele_pen (codigo_tipo_obj_ele_pen);
ALTER TABLE tipo_obj_ele_pen ADD (CONSTRAINT UQ_tipo_obj_ele_pen_001___ UNIQUE (codigo_tipo_obj_ele_pen));
CREATE UNIQUE INDEX UQ_tipo_ocupacion_viv_001_IX ON tipo_ocupacion_viv (codigo_tipo_ocupacion_viv);
ALTER TABLE tipo_ocupacion_viv ADD (CONSTRAINT UQ_tipo_ocupacion_viv_001___ UNIQUE (codigo_tipo_ocupacion_viv));
CREATE UNIQUE INDEX UQ_tipo_pagina_001_IX ON tipo_pagina (codigo_tipo_pagina);
ALTER TABLE tipo_pagina ADD (CONSTRAINT UQ_tipo_pagina_001___ UNIQUE (codigo_tipo_pagina));
CREATE UNIQUE INDEX UQ_tipo_parametro_001_IX ON tipo_parametro (codigo_tipo_parametro);
ALTER TABLE tipo_parametro ADD (CONSTRAINT UQ_tipo_parametro_001___ UNIQUE (codigo_tipo_parametro));
CREATE UNIQUE INDEX UQ_tipo_parametro_dom_001_IX ON tipo_parametro_dom (codigo_tipo_parametro_dom);
ALTER TABLE tipo_parametro_dom ADD (CONSTRAINT UQ_tipo_parametro_dom_001___ UNIQUE (codigo_tipo_parametro_dom));
CREATE UNIQUE INDEX UQ_tipo_parametro_dom_002_IX ON tipo_parametro_dom (codigo_propiedad_interfaz);
ALTER TABLE tipo_parametro_dom ADD (CONSTRAINT UQ_tipo_parametro_dom_002___ UNIQUE (codigo_propiedad_interfaz));
CREATE UNIQUE INDEX UQ_tipo_parametro_dom_003_IX ON tipo_parametro_dom (nombre_interfaz);
ALTER TABLE tipo_parametro_dom ADD (CONSTRAINT UQ_tipo_parametro_dom_003___ UNIQUE (nombre_interfaz));
CREATE UNIQUE INDEX UQ_tipo_persona_hogar_001_IX ON tipo_persona_hogar (codigo_tipo_persona_hogar);
ALTER TABLE tipo_persona_hogar ADD (CONSTRAINT UQ_tipo_persona_hogar_001___ UNIQUE (codigo_tipo_persona_hogar));
CREATE UNIQUE INDEX UQ_tipo_pieza_bano_001_IX ON tipo_pieza_bano (codigo_tipo_pieza_bano);
ALTER TABLE tipo_pieza_bano ADD (CONSTRAINT UQ_tipo_pieza_bano_001___ UNIQUE (codigo_tipo_pieza_bano));
CREATE UNIQUE INDEX UQ_tipo_rastro_fun_001_IX ON tipo_rastro_fun (codigo_tipo_rastro_fun);
ALTER TABLE tipo_rastro_fun ADD (CONSTRAINT UQ_tipo_rastro_fun_001___ UNIQUE (codigo_tipo_rastro_fun));
CREATE UNIQUE INDEX UQ_tipo_recurso_001_IX ON tipo_recurso (codigo_tipo_recurso);
ALTER TABLE tipo_recurso ADD (CONSTRAINT UQ_tipo_recurso_001___ UNIQUE (codigo_tipo_recurso));
CREATE UNIQUE INDEX UQ_tipo_reg_pot_ben_001_IX ON tipo_reg_pot_ben (codigo_tipo_reg_pot_ben);
ALTER TABLE tipo_reg_pot_ben ADD (CONSTRAINT UQ_tipo_reg_pot_ben_001___ UNIQUE (codigo_tipo_reg_pot_ben));
CREATE UNIQUE INDEX UQ_tipo_relacion_lab_001_IX ON tipo_relacion_lab (codigo_tipo_relacion_lab);
ALTER TABLE tipo_relacion_lab ADD (CONSTRAINT UQ_tipo_relacion_lab_001___ UNIQUE (codigo_tipo_relacion_lab));
CREATE UNIQUE INDEX UQ_tipo_rol_001_IX ON tipo_rol (codigo_tipo_rol);
ALTER TABLE tipo_rol ADD (CONSTRAINT UQ_tipo_rol_001___ UNIQUE (codigo_tipo_rol));
CREATE UNIQUE INDEX UQ_tipo_seguro_medico_001_IX ON tipo_seguro_medico (codigo_tipo_seguro_medico);
ALTER TABLE tipo_seguro_medico ADD (CONSTRAINT UQ_tipo_seguro_medico_001___ UNIQUE (codigo_tipo_seguro_medico));
CREATE UNIQUE INDEX UQ_tipo_servicio_agua_001_IX ON tipo_servicio_agua (codigo_tipo_servicio_agua);
ALTER TABLE tipo_servicio_agua ADD (CONSTRAINT UQ_tipo_servicio_agua_001___ UNIQUE (codigo_tipo_servicio_agua));
CREATE UNIQUE INDEX UQ_tipo_servicio_san_001_IX ON tipo_servicio_san (codigo_tipo_servicio_san);
ALTER TABLE tipo_servicio_san ADD (CONSTRAINT UQ_tipo_servicio_san_001___ UNIQUE (codigo_tipo_servicio_san));
CREATE UNIQUE INDEX UQ_tipo_valor_001_IX ON tipo_valor (codigo_tipo_valor);
ALTER TABLE tipo_valor ADD (CONSTRAINT UQ_tipo_valor_001___ UNIQUE (codigo_tipo_valor));
CREATE UNIQUE INDEX UQ_ubicacion_001_IX ON ubicacion (codigo_ubicacion);
ALTER TABLE ubicacion ADD (CONSTRAINT UQ_ubicacion_001___ UNIQUE (codigo_ubicacion));
CREATE UNIQUE INDEX UQ_usuario_001_IX ON usuario (codigo_usuario);
ALTER TABLE usuario ADD (CONSTRAINT UQ_usuario_001___ UNIQUE (codigo_usuario));
