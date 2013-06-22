CREATE INDEX IX_aplicacion_id_grupo_aplicacion ON aplicacion (id_grupo_aplicacion);
CREATE INDEX IX_aplicacion_nombre_aplicacion ON aplicacion (nombre_aplicacion);
CREATE INDEX IX_aplicacion_version_aplicacion ON aplicacion (version_aplicacion);
CREATE INDEX IX_archivo_datos_ext_id_proveedor_dat_ext ON archivo_datos_ext (id_proveedor_dat_ext);
CREATE INDEX IX_archivo_datos_ext_id_usuario_ultima_carga ON archivo_datos_ext (id_usuario_ultima_carga);
CREATE INDEX IX_archivo_datos_ext_id_usuario_ultima_importacion ON archivo_datos_ext (id_usuario_ultima_importacion);
CREATE INDEX IX_archivo_datos_ext_nombre_archivo_datos_ext ON archivo_datos_ext (nombre_archivo_datos_ext);
CREATE INDEX IX_archivo_datos_ext_version_archivo_datos_ext ON archivo_datos_ext (version_archivo_datos_ext);
CREATE INDEX IX_clase_recurso_id_clase_recurso_base ON clase_recurso (id_clase_recurso_base);
CREATE INDEX IX_clase_recurso_id_clase_recurso_maestro ON clase_recurso (id_clase_recurso_maestro);
CREATE INDEX IX_clase_recurso_id_clase_recurso_segmento ON clase_recurso (id_clase_recurso_segmento);
CREATE INDEX IX_clase_recurso_id_funcion_seleccion ON clase_recurso (id_funcion_seleccion);
CREATE INDEX IX_clase_recurso_id_grupo_aplicacion ON clase_recurso (id_grupo_aplicacion);
CREATE INDEX IX_clase_recurso_id_pagina_detalle ON clase_recurso (id_pagina_detalle);
CREATE INDEX IX_clase_recurso_id_pagina_seleccion ON clase_recurso (id_pagina_seleccion);
CREATE INDEX IX_clase_recurso_nombre_clase_recurso ON clase_recurso (nombre_clase_recurso);
CREATE INDEX IX_clase_recurso_version_clase_recurso ON clase_recurso (version_clase_recurso);
CREATE INDEX IX_clase_recurso_par_id_clase_recurso_sec ON clase_recurso_par (id_clase_recurso_sec);
CREATE INDEX IX_clase_recurso_par_id_clase_recurso_valor ON clase_recurso_par (id_clase_recurso_valor);
CREATE INDEX IX_clase_recurso_par_id_funcion_referencia ON clase_recurso_par (id_funcion_referencia);
CREATE INDEX IX_clase_recurso_par_id_parametro ON clase_recurso_par (id_parametro);
CREATE INDEX IX_clase_recurso_par_version_clase_recurso_par ON clase_recurso_par (version_clase_recurso_par);
CREATE INDEX IX_clase_recurso_sec_version_clase_recurso_sec ON clase_recurso_sec (version_clase_recurso_sec);
CREATE INDEX IX_conjunto_segmento_id_clase_recurso ON conjunto_segmento (id_clase_recurso);
CREATE INDEX IX_conjunto_segmento_nombre_conjunto_segmento ON conjunto_segmento (nombre_conjunto_segmento);
CREATE INDEX IX_conjunto_segmento_version_conjunto_segmento ON conjunto_segmento (version_conjunto_segmento);
CREATE INDEX IX_dominio_id_clase_recurso ON dominio (id_clase_recurso);
CREATE INDEX IX_dominio_id_dominio_segmento ON dominio (id_dominio_segmento);
CREATE INDEX IX_dominio_id_funcion_seleccion ON dominio (id_funcion_seleccion);
CREATE INDEX IX_dominio_id_paquete ON dominio (id_paquete);
CREATE INDEX IX_dominio_nombre_dominio ON dominio (nombre_dominio);
CREATE INDEX IX_dominio_version_dominio ON dominio (version_dominio);
CREATE INDEX IX_dominio_paquete_id_paquete ON dominio_paquete (id_paquete);
CREATE INDEX IX_dominio_paquete_version_dominio_paquete ON dominio_paquete (version_dominio_paquete);
CREATE INDEX IX_dominio_parametro_001___ ON dominio_parametro (id_dominio, id_parametro);
CREATE INDEX IX_dominio_parametro_id_parametro ON dominio_parametro (id_parametro);
CREATE INDEX IX_dominio_parametro_version_dominio_parametro ON dominio_parametro (version_dominio_parametro);
CREATE INDEX IX_elemento_segmento_version_elemento_segmento ON elemento_segmento (version_elemento_segmento);
CREATE INDEX IX_etnia_indigena_nombre_etnia_indigena ON etnia_indigena (nombre_etnia_indigena);
CREATE INDEX IX_etnia_indigena_version_etnia_indigena ON etnia_indigena (version_etnia_indigena);
CREATE INDEX IX_ficha_hogar_id_barrio ON ficha_hogar (id_barrio);
CREATE INDEX IX_ficha_hogar_id_departamento ON ficha_hogar (id_departamento);
CREATE INDEX IX_ficha_hogar_id_distrito ON ficha_hogar (id_distrito);
CREATE INDEX IX_ficha_hogar_id_funcionario_censista ON ficha_hogar (id_funcionario_censista);
CREATE INDEX IX_ficha_hogar_id_funcionario_critico_deco ON ficha_hogar (id_funcionario_critico_deco);
CREATE INDEX IX_ficha_hogar_id_funcionario_digitador ON ficha_hogar (id_funcionario_digitador);
CREATE INDEX IX_ficha_hogar_id_funcionario_supervisor ON ficha_hogar (id_funcionario_supervisor);
CREATE INDEX IX_ficha_hogar_id_manzana ON ficha_hogar (id_manzana);
CREATE INDEX IX_ficha_hogar_id_proveedor_dat_ext ON ficha_hogar (id_proveedor_dat_ext);
CREATE INDEX IX_ficha_hogar_version_ficha_hogar ON ficha_hogar (version_ficha_hogar);
CREATE INDEX IX_ficha_persona_id_departamento_nacimiento ON ficha_persona (id_departamento_nacimiento);
CREATE INDEX IX_ficha_persona_id_distrito_nacimiento ON ficha_persona (id_distrito_nacimiento);
CREATE INDEX IX_ficha_persona_id_potencial_ben ON ficha_persona (id_potencial_ben);
CREATE INDEX IX_ficha_persona_nombre_ficha_persona ON ficha_persona (nombre_ficha_persona);
CREATE INDEX IX_ficha_persona_version_ficha_persona ON ficha_persona (version_ficha_persona);
CREATE INDEX IX_filtro_cla_rec_fun_id_clase_recurso_par_columna ON filtro_cla_rec_fun (id_clase_recurso_par_columna);
CREATE INDEX IX_filtro_cla_rec_fun_id_clase_recurso_par_valor ON filtro_cla_rec_fun (id_clase_recurso_par_valor);
CREATE INDEX IX_filtro_cla_rec_fun_id_funcion ON filtro_cla_rec_fun (id_funcion);
CREATE INDEX IX_filtro_cla_rec_fun_version_filtro_cla_rec_fun ON filtro_cla_rec_fun (version_filtro_cla_rec_fun);
CREATE INDEX IX_filtro_cla_rec_par_id_clase_recurso_par ON filtro_cla_rec_par (id_clase_recurso_par);
CREATE INDEX IX_filtro_cla_rec_par_id_clase_recurso_par_columna ON filtro_cla_rec_par (id_clase_recurso_par_columna);
CREATE INDEX IX_filtro_cla_rec_par_id_clase_recurso_par_valor ON filtro_cla_rec_par (id_clase_recurso_par_valor);
CREATE INDEX IX_filtro_cla_rec_par_version_filtro_cla_rec_par ON filtro_cla_rec_par (version_filtro_cla_rec_par);
CREATE INDEX IX_filtro_cla_rec_sec_id_clase_recurso_par_columna ON filtro_cla_rec_sec (id_clase_recurso_par_columna);
CREATE INDEX IX_filtro_cla_rec_sec_id_clase_recurso_par_valor ON filtro_cla_rec_sec (id_clase_recurso_par_valor);
CREATE INDEX IX_filtro_cla_rec_sec_id_clase_recurso_sec ON filtro_cla_rec_sec (id_clase_recurso_sec);
CREATE INDEX IX_filtro_cla_rec_sec_version_filtro_cla_rec_sec ON filtro_cla_rec_sec (version_filtro_cla_rec_sec);
CREATE INDEX IX_filtro_cla_rec_vin_id_clase_recurso_par ON filtro_cla_rec_vin (id_clase_recurso_par);
CREATE INDEX IX_filtro_cla_rec_vin_id_clase_recurso_par_columna ON filtro_cla_rec_vin (id_clase_recurso_par_columna);
CREATE INDEX IX_filtro_cla_rec_vin_id_clase_recurso_par_valor ON filtro_cla_rec_vin (id_clase_recurso_par_valor);
CREATE INDEX IX_filtro_cla_rec_vin_version_filtro_cla_rec_vin ON filtro_cla_rec_vin (version_filtro_cla_rec_vin);
CREATE INDEX IX_filtro_funcion_id_funcion ON filtro_funcion (id_funcion);
CREATE INDEX IX_filtro_funcion_id_usuario ON filtro_funcion (id_usuario);
CREATE INDEX IX_filtro_funcion_nombre_filtro_funcion ON filtro_funcion (nombre_filtro_funcion);
CREATE INDEX IX_filtro_funcion_version_filtro_funcion ON filtro_funcion (version_filtro_funcion);
CREATE INDEX IX_filtro_funcion_par_id_filtro_funcion ON filtro_funcion_par (id_filtro_funcion);
CREATE INDEX IX_filtro_funcion_par_id_funcion_parametro ON filtro_funcion_par (id_funcion_parametro);
CREATE INDEX IX_filtro_funcion_par_version_filtro_funcion_par ON filtro_funcion_par (version_filtro_funcion_par);
CREATE INDEX IX_funcion_id_dominio ON funcion (id_dominio);
CREATE INDEX IX_funcion_id_grupo_proceso ON funcion (id_grupo_proceso);
CREATE INDEX IX_funcion_nombre_funcion ON funcion (nombre_funcion);
CREATE INDEX IX_funcion_version_funcion ON funcion (version_funcion);
CREATE INDEX IX_funcion_parametro_id_clase_recurso_valor ON funcion_parametro (id_clase_recurso_valor);
CREATE INDEX IX_funcion_parametro_id_funcion_referencia ON funcion_parametro (id_funcion_referencia);
CREATE INDEX IX_funcion_parametro_id_parametro ON funcion_parametro (id_parametro);
CREATE INDEX IX_funcion_parametro_version_funcion_parametro ON funcion_parametro (version_funcion_parametro);
CREATE INDEX IX_funcionario_nombre_funcionario ON funcionario (nombre_funcionario);
CREATE INDEX IX_funcionario_version_funcionario ON funcionario (version_funcionario);
CREATE INDEX IX_grupo_aplicacion_nombre_grupo_aplicacion ON grupo_aplicacion (nombre_grupo_aplicacion);
CREATE INDEX IX_grupo_aplicacion_version_grupo_aplicacion ON grupo_aplicacion (version_grupo_aplicacion);
CREATE INDEX IX_grupo_proceso_nombre_grupo_proceso ON grupo_proceso (nombre_grupo_proceso);
CREATE INDEX IX_grupo_proceso_version_grupo_proceso ON grupo_proceso (version_grupo_proceso);
CREATE INDEX IX_informe_nombre_informe ON informe (nombre_informe);
CREATE INDEX IX_informe_version_informe ON informe (version_informe);
CREATE INDEX IX_log_imp_cen_version_log_imp_cen ON log_imp_cen (version_log_imp_cen);
CREATE INDEX IX_log_imp_deu_version_log_imp_deu ON log_imp_deu (version_log_imp_deu);
CREATE INDEX IX_log_imp_emp_version_log_imp_emp ON log_imp_emp (version_log_imp_emp);
CREATE INDEX IX_log_imp_fal_version_log_imp_fal ON log_imp_fal (version_log_imp_fal);
CREATE INDEX IX_log_imp_hog_version_log_imp_hog ON log_imp_hog (version_log_imp_hog);
CREATE INDEX IX_log_imp_hog_eec_version_log_imp_hog_eec ON log_imp_hog_eec (version_log_imp_hog_eec);
CREATE INDEX IX_log_imp_ids_id_persona ON log_imp_ids (id_persona);
CREATE INDEX IX_log_imp_ids_version_log_imp_ids ON log_imp_ids (version_log_imp_ids);
CREATE INDEX IX_log_imp_jub_version_log_imp_jub ON log_imp_jub (version_log_imp_jub);
CREATE INDEX IX_log_imp_pen_version_log_imp_pen ON log_imp_pen (version_log_imp_pen);
CREATE INDEX IX_log_imp_per_id_ficha_persona ON log_imp_per (id_ficha_persona);
CREATE INDEX IX_log_imp_per_version_log_imp_per ON log_imp_per (version_log_imp_per);
CREATE INDEX IX_log_imp_per_eec_id_ficha_persona ON log_imp_per_eec (id_ficha_persona);
CREATE INDEX IX_log_imp_per_eec_version_log_imp_per_eec ON log_imp_per_eec (version_log_imp_per_eec);
CREATE INDEX IX_log_imp_pot_id_potencial_ben ON log_imp_pot (id_potencial_ben);
CREATE INDEX IX_log_imp_pot_version_log_imp_pot ON log_imp_pot (version_log_imp_pot);
CREATE INDEX IX_log_imp_sub_version_log_imp_sub ON log_imp_sub (version_log_imp_sub);
CREATE INDEX IX_log_imp_ubi_version_log_imp_ubi ON log_imp_ubi (version_log_imp_ubi);
CREATE INDEX IX_log_pro_acr_pot_ben_id_barrio ON log_pro_acr_pot_ben (id_barrio);
CREATE INDEX IX_log_pro_acr_pot_ben_id_departamento ON log_pro_acr_pot_ben (id_departamento);
CREATE INDEX IX_log_pro_acr_pot_ben_id_distrito ON log_pro_acr_pot_ben (id_distrito);
CREATE INDEX IX_log_pro_acr_pot_ben_id_ficha_hogar ON log_pro_acr_pot_ben (id_ficha_hogar);
CREATE INDEX IX_log_pro_acr_pot_ben_id_ficha_persona ON log_pro_acr_pot_ben (id_ficha_persona);
CREATE INDEX IX_log_pro_acr_pot_ben_id_persona ON log_pro_acr_pot_ben (id_persona);
CREATE INDEX IX_log_pro_acr_pot_ben_id_potencial_ben ON log_pro_acr_pot_ben (id_potencial_ben);
CREATE INDEX IX_log_pro_acr_pot_ben_version_log_pro_acr_pot_ben ON log_pro_acr_pot_ben (version_log_pro_acr_pot_ben);
CREATE INDEX IX_log_pro_act_jupe_id_barrio ON log_pro_act_jupe (id_barrio);
CREATE INDEX IX_log_pro_act_jupe_id_departamento ON log_pro_act_jupe (id_departamento);
CREATE INDEX IX_log_pro_act_jupe_id_distrito ON log_pro_act_jupe (id_distrito);
CREATE INDEX IX_log_pro_act_jupe_id_persona ON log_pro_act_jupe (id_persona);
CREATE INDEX IX_log_pro_act_jupe_version_log_pro_act_jupe ON log_pro_act_jupe (version_log_pro_act_jupe);
CREATE INDEX IX_log_pro_den_pen_obj_id_barrio ON log_pro_den_pen_obj (id_barrio);
CREATE INDEX IX_log_pro_den_pen_obj_id_departamento ON log_pro_den_pen_obj (id_departamento);
CREATE INDEX IX_log_pro_den_pen_obj_id_distrito ON log_pro_den_pen_obj (id_distrito);
CREATE INDEX IX_log_pro_den_pen_obj_id_persona ON log_pro_den_pen_obj (id_persona);
CREATE INDEX IX_log_pro_den_pen_obj_version_log_pro_den_pen_obj ON log_pro_den_pen_obj (version_log_pro_den_pen_obj);
CREATE INDEX IX_log_pro_imp_arc_ext_id_archivo_datos_ext ON log_pro_imp_arc_ext (id_archivo_datos_ext);
CREATE INDEX IX_log_pro_imp_arc_ext_version_log_pro_imp_arc_ext ON log_pro_imp_arc_ext (version_log_pro_imp_arc_ext);
CREATE INDEX IX_log_pro_oto_pen_apr_id_barrio ON log_pro_oto_pen_apr (id_barrio);
CREATE INDEX IX_log_pro_oto_pen_apr_id_departamento ON log_pro_oto_pen_apr (id_departamento);
CREATE INDEX IX_log_pro_oto_pen_apr_id_distrito ON log_pro_oto_pen_apr (id_distrito);
CREATE INDEX IX_log_pro_oto_pen_apr_id_persona ON log_pro_oto_pen_apr (id_persona);
CREATE INDEX IX_log_pro_oto_pen_apr_version_log_pro_oto_pen_apr ON log_pro_oto_pen_apr (version_log_pro_oto_pen_apr);
CREATE INDEX IX_log_pro_pre_pro_pag_id_barrio ON log_pro_pre_pro_pag (id_barrio);
CREATE INDEX IX_log_pro_pre_pro_pag_id_departamento ON log_pro_pre_pro_pag (id_departamento);
CREATE INDEX IX_log_pro_pre_pro_pag_id_distrito ON log_pro_pre_pro_pag (id_distrito);
CREATE INDEX IX_log_pro_pre_pro_pag_id_persona ON log_pro_pre_pro_pag (id_persona);
CREATE INDEX IX_log_pro_pre_pro_pag_version_log_pro_pre_pro_pag ON log_pro_pre_pro_pag (version_log_pro_pre_pro_pag);
CREATE INDEX IX_log_pro_ver_ele_pen_id_barrio ON log_pro_ver_ele_pen (id_barrio);
CREATE INDEX IX_log_pro_ver_ele_pen_id_departamento ON log_pro_ver_ele_pen (id_departamento);
CREATE INDEX IX_log_pro_ver_ele_pen_id_distrito ON log_pro_ver_ele_pen (id_distrito);
CREATE INDEX IX_log_pro_ver_ele_pen_id_persona ON log_pro_ver_ele_pen (id_persona);
CREATE INDEX IX_log_pro_ver_ele_pen_version_log_pro_ver_ele_pen ON log_pro_ver_ele_pen (version_log_pro_ver_ele_pen);
CREATE INDEX IX_mensaje_version_mensaje ON mensaje (version_mensaje);
CREATE INDEX IX_objecion_ele_pen_id_persona ON objecion_ele_pen (id_persona);
CREATE INDEX IX_objecion_ele_pen_id_proveedor_dat_ext ON objecion_ele_pen (id_proveedor_dat_ext);
CREATE INDEX IX_objecion_ele_pen_version_objecion_ele_pen ON objecion_ele_pen (version_objecion_ele_pen);
CREATE INDEX IX_opcion_menu_id_aplicacion ON opcion_menu (id_aplicacion);
CREATE INDEX IX_opcion_menu_id_opcion_menu_superior ON opcion_menu (id_opcion_menu_superior);
CREATE INDEX IX_opcion_menu_id_pagina ON opcion_menu (id_pagina);
CREATE INDEX IX_opcion_menu_nombre_opcion_menu ON opcion_menu (nombre_opcion_menu);
CREATE INDEX IX_opcion_menu_version_opcion_menu ON opcion_menu (version_opcion_menu);
CREATE INDEX IX_opcion_sistema_version_opcion_sistema ON opcion_sistema (version_opcion_sistema);
CREATE INDEX IX_pagina_id_aplicacion ON pagina (id_aplicacion);
CREATE INDEX IX_pagina_id_dominio ON pagina (id_dominio);
CREATE INDEX IX_pagina_id_dominio_maestro ON pagina (id_dominio_maestro);
CREATE INDEX IX_pagina_id_parametro ON pagina (id_parametro);
CREATE INDEX IX_pagina_nombre_pagina ON pagina (nombre_pagina);
CREATE INDEX IX_pagina_version_pagina ON pagina (version_pagina);
CREATE INDEX IX_pagina_funcion_id_funcion ON pagina_funcion (id_funcion);
CREATE INDEX IX_pagina_funcion_version_pagina_funcion ON pagina_funcion (version_pagina_funcion);
CREATE INDEX IX_pagina_usuario_id_usuario ON pagina_usuario (id_usuario);
CREATE INDEX IX_pagina_usuario_version_pagina_usuario ON pagina_usuario (version_pagina_usuario);
CREATE INDEX IX_paquete_version_paquete ON paquete (version_paquete);
CREATE INDEX IX_parametro_nombre_parametro ON parametro (nombre_parametro);
CREATE INDEX IX_parametro_version_parametro ON parametro (version_parametro);
CREATE INDEX IX_persona_id_barrio ON persona (id_barrio);
CREATE INDEX IX_persona_id_departamento ON persona (id_departamento);
CREATE INDEX IX_persona_id_distrito ON persona (id_distrito);
CREATE INDEX IX_persona_id_etnia_indigena ON persona (id_etnia_indigena);
CREATE INDEX IX_persona_id_ficha_persona ON persona (id_ficha_persona);
CREATE INDEX IX_persona_nombre_persona ON persona (nombre_persona);
CREATE INDEX IX_persona_version_persona ON persona (version_persona);
CREATE INDEX IX_persona_anotada_001___ ON persona_anotada (id_persona);
CREATE INDEX IX_persona_anotada_002___ ON persona_anotada (codigo_persona);
CREATE INDEX IX_persona_anotada_003___ ON persona_anotada (nombre_persona);
CREATE INDEX IX_persona_anotada_004___ ON persona_anotada (id_usuario);
CREATE INDEX IX_persona_anotada_005___ ON persona_anotada (codigo_usuario);
CREATE INDEX IX_persona_anotada_version_persona_anotada ON persona_anotada (version_persona_anotada);
CREATE INDEX IX_potencial_ben_id_barrio ON potencial_ben (id_barrio);
CREATE INDEX IX_potencial_ben_id_departamento ON potencial_ben (id_departamento);
CREATE INDEX IX_potencial_ben_id_distrito ON potencial_ben (id_distrito);
CREATE INDEX IX_potencial_ben_id_etnia_indigena ON potencial_ben (id_etnia_indigena);
CREATE INDEX IX_potencial_ben_id_ficha_persona ON potencial_ben (id_ficha_persona);
CREATE INDEX IX_potencial_ben_id_funcionario_ult_visita_cen ON potencial_ben (id_funcionario_ult_visita_cen);
CREATE INDEX IX_potencial_ben_id_funcionario_validacion_cen ON potencial_ben (id_funcionario_validacion_cen);
CREATE INDEX IX_potencial_ben_id_manzana ON potencial_ben (id_manzana);
CREATE INDEX IX_potencial_ben_id_usuario_reg_pot_ben ON potencial_ben (id_usuario_reg_pot_ben);
CREATE INDEX IX_potencial_ben_nombre_potencial_ben ON potencial_ben (nombre_potencial_ben);
CREATE INDEX IX_potencial_ben_version_potencial_ben ON potencial_ben (version_potencial_ben);
CREATE INDEX IX_proceso_nombre_proceso ON proceso (nombre_proceso);
CREATE INDEX IX_proceso_version_proceso ON proceso (version_proceso);
CREATE INDEX IX_proveedor_dat_ext_nombre_proveedor_dat_ext ON proveedor_dat_ext (nombre_proveedor_dat_ext);
CREATE INDEX IX_proveedor_dat_ext_version_proveedor_dat_ext ON proveedor_dat_ext (version_proveedor_dat_ext);
CREATE INDEX IX_rastro_funcion_id_funcion ON rastro_funcion (id_funcion);
CREATE INDEX IX_rastro_funcion_par_id_parametro ON rastro_funcion_par (id_parametro);
CREATE INDEX IX_rastro_funcion_par_id_rastro_funcion ON rastro_funcion_par (id_rastro_funcion);
CREATE INDEX IX_rastro_informe_id_funcion ON rastro_informe (id_funcion);
CREATE INDEX IX_rastro_informe_version_rastro_informe ON rastro_informe (version_rastro_informe);
CREATE INDEX IX_rastro_proceso_id_funcion ON rastro_proceso (id_funcion);
CREATE INDEX IX_rastro_proceso_version_rastro_proceso ON rastro_proceso (version_rastro_proceso);
CREATE INDEX IX_recurso_nombre_recurso ON recurso (nombre_recurso);
CREATE INDEX IX_recurso_version_recurso ON recurso (version_recurso);
CREATE INDEX IX_rol_id_grupo_aplicacion ON rol (id_grupo_aplicacion);
CREATE INDEX IX_rol_nombre_rol ON rol (nombre_rol);
CREATE INDEX IX_rol_version_rol ON rol (version_rol);
CREATE INDEX IX_rol_aplicacion_id_aplicacion ON rol_aplicacion (id_aplicacion);
CREATE INDEX IX_rol_aplicacion_version_rol_aplicacion ON rol_aplicacion (version_rol_aplicacion);
CREATE INDEX IX_rol_filtro_funcion_id_filtro_funcion ON rol_filtro_funcion (id_filtro_funcion);
CREATE INDEX IX_rol_filtro_funcion_version_rol_filtro_funcion ON rol_filtro_funcion (version_rol_filtro_funcion);
CREATE INDEX IX_rol_funcion_id_conjunto_segmento ON rol_funcion (id_conjunto_segmento);
CREATE INDEX IX_rol_funcion_id_funcion ON rol_funcion (id_funcion);
CREATE INDEX IX_rol_funcion_version_rol_funcion ON rol_funcion (version_rol_funcion);
CREATE INDEX IX_rol_pagina_id_pagina ON rol_pagina (id_pagina);
CREATE INDEX IX_rol_pagina_version_rol_pagina ON rol_pagina (version_rol_pagina);
CREATE INDEX IX_rol_usuario_id_usuario ON rol_usuario (id_usuario);
CREATE INDEX IX_rol_usuario_version_rol_usuario ON rol_usuario (version_rol_usuario);
CREATE INDEX IX_ubicacion_id_ubicacion_superior ON ubicacion (id_ubicacion_superior);
CREATE INDEX IX_ubicacion_nombre_ubicacion ON ubicacion (nombre_ubicacion);
CREATE INDEX IX_ubicacion_version_ubicacion ON ubicacion (version_ubicacion);
CREATE INDEX IX_usuario_id_usuario_supervisor ON usuario (id_usuario_supervisor);
CREATE INDEX IX_usuario_nombre_usuario ON usuario (nombre_usuario);
CREATE INDEX IX_usuario_version_usuario ON usuario (version_usuario);
CREATE INDEX IX_visita_censo_id_funcionario_censista ON visita_censo (id_funcionario_censista);
CREATE INDEX IX_visita_censo_id_potencial_ben ON visita_censo (id_potencial_ben);
CREATE INDEX IX_visita_censo_version_visita_censo ON visita_censo (version_visita_censo);
