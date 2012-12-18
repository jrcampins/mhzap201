CREATE INDEX IX_aplicacion_0001_ZY ON aplicacion (id_grupo_aplicacion);
CREATE INDEX IX_aplicacion_0002_ZY ON aplicacion (nombre_aplicacion);
CREATE INDEX IX_aplicacion_0003_ZY ON aplicacion (version_aplicacion);
CREATE INDEX IX_archivo_datos_ext_0001_ZY ON archivo_datos_ext (id_proveedor_dat_ext);
CREATE INDEX IX_archivo_datos_ext_0002_ZY ON archivo_datos_ext (id_usuario_ultima_carga);
CREATE INDEX IX_archivo_datos_ext_0003_ZY ON archivo_datos_ext (id_usuario_ultima_importacion);
CREATE INDEX IX_archivo_datos_ext_0004_ZY ON archivo_datos_ext (nombre_archivo_datos_ext);
CREATE INDEX IX_archivo_datos_ext_0005_ZY ON archivo_datos_ext (version_archivo_datos_ext);
CREATE INDEX IX_clase_recurso_0001_ZY ON clase_recurso (id_clase_recurso_base);
CREATE INDEX IX_clase_recurso_0002_ZY ON clase_recurso (id_clase_recurso_maestro);
CREATE INDEX IX_clase_recurso_0003_ZY ON clase_recurso (id_clase_recurso_segmento);
CREATE INDEX IX_clase_recurso_0004_ZY ON clase_recurso (id_funcion_seleccion);
CREATE INDEX IX_clase_recurso_0005_ZY ON clase_recurso (id_grupo_aplicacion);
CREATE INDEX IX_clase_recurso_0006_ZY ON clase_recurso (id_pagina_detalle);
CREATE INDEX IX_clase_recurso_0007_ZY ON clase_recurso (id_pagina_seleccion);
CREATE INDEX IX_clase_recurso_0008_ZY ON clase_recurso (nombre_clase_recurso);
CREATE INDEX IX_clase_recurso_0009_ZY ON clase_recurso (version_clase_recurso);
CREATE INDEX IX_clase_recurso_par_0001_ZY ON clase_recurso_par (id_clase_recurso);
CREATE INDEX IX_clase_recurso_par_0002_ZY ON clase_recurso_par (id_clase_recurso_sec);
CREATE INDEX IX_clase_recurso_par_0003_ZY ON clase_recurso_par (id_clase_recurso_valor);
CREATE INDEX IX_clase_recurso_par_0004_ZY ON clase_recurso_par (id_funcion_referencia);
CREATE INDEX IX_clase_recurso_par_0005_ZY ON clase_recurso_par (id_parametro);
CREATE INDEX IX_clase_recurso_par_0006_ZY ON clase_recurso_par (version_clase_recurso_par);
CREATE INDEX IX_clase_recurso_sec_0001_ZY ON clase_recurso_sec (id_clase_recurso);
CREATE INDEX IX_clase_recurso_sec_0002_ZY ON clase_recurso_sec (version_clase_recurso_sec);
CREATE INDEX IX_conjunto_segmento_0001_ZY ON conjunto_segmento (id_clase_recurso);
CREATE INDEX IX_conjunto_segmento_0002_ZY ON conjunto_segmento (nombre_conjunto_segmento);
CREATE INDEX IX_conjunto_segmento_0003_ZY ON conjunto_segmento (version_conjunto_segmento);
CREATE INDEX IX_dominio_0001_ZY ON dominio (id_clase_recurso);
CREATE INDEX IX_dominio_0002_ZY ON dominio (id_dominio_segmento);
CREATE INDEX IX_dominio_0003_ZY ON dominio (id_funcion_seleccion);
CREATE INDEX IX_dominio_0004_ZY ON dominio (id_paquete);
CREATE INDEX IX_dominio_0005_ZY ON dominio (nombre_dominio);
CREATE INDEX IX_dominio_0006_ZY ON dominio (version_dominio);
CREATE INDEX IX_dominio_paquete_0001_ZY ON dominio_paquete (id_dominio);
CREATE INDEX IX_dominio_paquete_0002_ZY ON dominio_paquete (id_paquete);
CREATE INDEX IX_dominio_paquete_0003_ZY ON dominio_paquete (version_dominio_paquete);
CREATE INDEX IX_dominio_parametro_0001_ZY ON dominio_parametro (id_dominio, id_parametro);
CREATE INDEX IX_dominio_parametro_0002_ZY ON dominio_parametro (id_dominio);
CREATE INDEX IX_dominio_parametro_0003_ZY ON dominio_parametro (id_parametro);
CREATE INDEX IX_dominio_parametro_0004_ZY ON dominio_parametro (version_dominio_parametro);
CREATE INDEX IX_elemento_segmento_0001_ZY ON elemento_segmento (id_conjunto_segmento);
CREATE INDEX IX_elemento_segmento_0002_ZY ON elemento_segmento (version_elemento_segmento);
CREATE INDEX IX_etnia_indigena_0001_ZY ON etnia_indigena (nombre_etnia_indigena);
CREATE INDEX IX_etnia_indigena_0002_ZY ON etnia_indigena (version_etnia_indigena);
CREATE INDEX IX_ficha_hogar_0001_ZY ON ficha_hogar (id_barrio);
CREATE INDEX IX_ficha_hogar_0002_ZY ON ficha_hogar (id_departamento);
CREATE INDEX IX_ficha_hogar_0003_ZY ON ficha_hogar (id_distrito);
CREATE INDEX IX_ficha_hogar_0004_ZY ON ficha_hogar (id_funcionario_censista);
CREATE INDEX IX_ficha_hogar_0005_ZY ON ficha_hogar (id_funcionario_critico_deco);
CREATE INDEX IX_ficha_hogar_0006_ZY ON ficha_hogar (id_funcionario_digitador);
CREATE INDEX IX_ficha_hogar_0007_ZY ON ficha_hogar (id_funcionario_supervisor);
CREATE INDEX IX_ficha_hogar_0008_ZY ON ficha_hogar (id_manzana);
CREATE INDEX IX_ficha_hogar_0009_ZY ON ficha_hogar (id_proveedor_dat_ext);
CREATE INDEX IX_ficha_hogar_0010_ZY ON ficha_hogar (version_ficha_hogar);
CREATE INDEX IX_ficha_persona_0001_ZY ON ficha_persona (id_departamento_nacimiento);
CREATE INDEX IX_ficha_persona_0002_ZY ON ficha_persona (id_distrito_nacimiento);
CREATE INDEX IX_ficha_persona_0003_ZY ON ficha_persona (id_ficha_hogar);
CREATE INDEX IX_ficha_persona_0004_ZY ON ficha_persona (id_potencial_ben);
CREATE INDEX IX_ficha_persona_0005_ZY ON ficha_persona (nombre_ficha_persona);
CREATE INDEX IX_ficha_persona_0006_ZY ON ficha_persona (version_ficha_persona);
CREATE INDEX IX_filtro_cla_rec_fun_0001_ZY ON filtro_cla_rec_fun (id_clase_recurso_par_columna);
CREATE INDEX IX_filtro_cla_rec_fun_0002_ZY ON filtro_cla_rec_fun (id_clase_recurso_par_valor);
CREATE INDEX IX_filtro_cla_rec_fun_0003_ZY ON filtro_cla_rec_fun (id_funcion);
CREATE INDEX IX_filtro_cla_rec_fun_0004_ZY ON filtro_cla_rec_fun (version_filtro_cla_rec_fun);
CREATE INDEX IX_filtro_cla_rec_par_0001_ZY ON filtro_cla_rec_par (id_clase_recurso_par);
CREATE INDEX IX_filtro_cla_rec_par_0002_ZY ON filtro_cla_rec_par (id_clase_recurso_par_columna);
CREATE INDEX IX_filtro_cla_rec_par_0003_ZY ON filtro_cla_rec_par (id_clase_recurso_par_valor);
CREATE INDEX IX_filtro_cla_rec_par_0004_ZY ON filtro_cla_rec_par (version_filtro_cla_rec_par);
CREATE INDEX IX_filtro_cla_rec_sec_0001_ZY ON filtro_cla_rec_sec (id_clase_recurso_par_columna);
CREATE INDEX IX_filtro_cla_rec_sec_0002_ZY ON filtro_cla_rec_sec (id_clase_recurso_par_valor);
CREATE INDEX IX_filtro_cla_rec_sec_0003_ZY ON filtro_cla_rec_sec (id_clase_recurso_sec);
CREATE INDEX IX_filtro_cla_rec_sec_0004_ZY ON filtro_cla_rec_sec (version_filtro_cla_rec_sec);
CREATE INDEX IX_filtro_cla_rec_vin_0001_ZY ON filtro_cla_rec_vin (id_clase_recurso_par);
CREATE INDEX IX_filtro_cla_rec_vin_0002_ZY ON filtro_cla_rec_vin (id_clase_recurso_par_columna);
CREATE INDEX IX_filtro_cla_rec_vin_0003_ZY ON filtro_cla_rec_vin (id_clase_recurso_par_valor);
CREATE INDEX IX_filtro_cla_rec_vin_0004_ZY ON filtro_cla_rec_vin (version_filtro_cla_rec_vin);
CREATE INDEX IX_filtro_funcion_0001_ZY ON filtro_funcion (id_funcion);
CREATE INDEX IX_filtro_funcion_0002_ZY ON filtro_funcion (id_usuario);
CREATE INDEX IX_filtro_funcion_0003_ZY ON filtro_funcion (nombre_filtro_funcion);
CREATE INDEX IX_filtro_funcion_0004_ZY ON filtro_funcion (version_filtro_funcion);
CREATE INDEX IX_filtro_funcion_par_0001_ZY ON filtro_funcion_par (id_filtro_funcion);
CREATE INDEX IX_filtro_funcion_par_0002_ZY ON filtro_funcion_par (id_funcion_parametro);
CREATE INDEX IX_filtro_funcion_par_0003_ZY ON filtro_funcion_par (version_filtro_funcion_par);
CREATE INDEX IX_funcion_0001_ZY ON funcion (id_dominio);
CREATE INDEX IX_funcion_0002_ZY ON funcion (id_grupo_proceso);
CREATE INDEX IX_funcion_0003_ZY ON funcion (nombre_funcion);
CREATE INDEX IX_funcion_0004_ZY ON funcion (version_funcion);
CREATE INDEX IX_funcion_parametro_0001_ZY ON funcion_parametro (id_clase_recurso_valor);
CREATE INDEX IX_funcion_parametro_0002_ZY ON funcion_parametro (id_funcion);
CREATE INDEX IX_funcion_parametro_0003_ZY ON funcion_parametro (id_funcion_referencia);
CREATE INDEX IX_funcion_parametro_0004_ZY ON funcion_parametro (id_parametro);
CREATE INDEX IX_funcion_parametro_0005_ZY ON funcion_parametro (version_funcion_parametro);
CREATE INDEX IX_funcionario_0001_ZY ON funcionario (nombre_funcionario);
CREATE INDEX IX_funcionario_0002_ZY ON funcionario (version_funcionario);
CREATE INDEX IX_grupo_aplicacion_0001_ZY ON grupo_aplicacion (nombre_grupo_aplicacion);
CREATE INDEX IX_grupo_aplicacion_0002_ZY ON grupo_aplicacion (version_grupo_aplicacion);
CREATE INDEX IX_grupo_proceso_0001_ZY ON grupo_proceso (nombre_grupo_proceso);
CREATE INDEX IX_grupo_proceso_0002_ZY ON grupo_proceso (version_grupo_proceso);
CREATE INDEX IX_informe_0001_ZY ON informe (nombre_informe);
CREATE INDEX IX_informe_0002_ZY ON informe (version_informe);
CREATE INDEX IX_informe_auditoria_0001_ZY ON informe_auditoria (nombre_informe_auditoria);
CREATE INDEX IX_informe_auditoria_0002_ZY ON informe_auditoria (version_informe_auditoria);
CREATE INDEX IX_log_imp_deu_0001_ZY ON log_imp_deu (version_log_imp_deu);
CREATE INDEX IX_log_imp_emp_0001_ZY ON log_imp_emp (version_log_imp_emp);
CREATE INDEX IX_log_imp_fal_0001_ZY ON log_imp_fal (version_log_imp_fal);
CREATE INDEX IX_log_imp_hog_0001_ZY ON log_imp_hog (version_log_imp_hog);
CREATE INDEX IX_log_imp_ids_0001_ZY ON log_imp_ids (version_log_imp_ids);
CREATE INDEX IX_log_imp_jub_0001_ZY ON log_imp_jub (version_log_imp_jub);
CREATE INDEX IX_log_imp_pen_0001_ZY ON log_imp_pen (version_log_imp_pen);
CREATE INDEX IX_log_imp_per_0001_ZY ON log_imp_per (version_log_imp_per);
CREATE INDEX IX_log_imp_pot_0001_ZY ON log_imp_pot (version_log_imp_pot);
CREATE INDEX IX_log_imp_sub_0001_ZY ON log_imp_sub (version_log_imp_sub);
CREATE INDEX IX_log_imp_ubi_0001_ZY ON log_imp_ubi (version_log_imp_ubi);
CREATE INDEX IX_log_pro_acr_pot_ben_0001_ZY ON log_pro_acr_pot_ben (id_barrio);
CREATE INDEX IX_log_pro_acr_pot_ben_0002_ZY ON log_pro_acr_pot_ben (id_departamento);
CREATE INDEX IX_log_pro_acr_pot_ben_0003_ZY ON log_pro_acr_pot_ben (id_distrito);
CREATE INDEX IX_log_pro_acr_pot_ben_0004_ZY ON log_pro_acr_pot_ben (id_ficha_hogar);
CREATE INDEX IX_log_pro_acr_pot_ben_0005_ZY ON log_pro_acr_pot_ben (id_ficha_persona);
CREATE INDEX IX_log_pro_acr_pot_ben_0006_ZY ON log_pro_acr_pot_ben (id_persona);
CREATE INDEX IX_log_pro_acr_pot_ben_0007_ZY ON log_pro_acr_pot_ben (id_potencial_ben);
CREATE INDEX IX_log_pro_acr_pot_ben_0008_ZY ON log_pro_acr_pot_ben (version_log_pro_acr_pot_ben);
CREATE INDEX IX_log_pro_imp_arc_ext_0001_ZY ON log_pro_imp_arc_ext (id_archivo_datos_ext);
CREATE INDEX IX_log_pro_imp_arc_ext_0002_ZY ON log_pro_imp_arc_ext (version_log_pro_imp_arc_ext);
CREATE INDEX IX_log_pro_oto_pen_apr_0001_ZY ON log_pro_oto_pen_apr (id_barrio);
CREATE INDEX IX_log_pro_oto_pen_apr_0002_ZY ON log_pro_oto_pen_apr (id_departamento);
CREATE INDEX IX_log_pro_oto_pen_apr_0003_ZY ON log_pro_oto_pen_apr (id_distrito);
CREATE INDEX IX_log_pro_oto_pen_apr_0004_ZY ON log_pro_oto_pen_apr (id_persona);
CREATE INDEX IX_log_pro_oto_pen_apr_0005_ZY ON log_pro_oto_pen_apr (version_log_pro_oto_pen_apr);
CREATE INDEX IX_log_pro_pre_pro_pag_0001_ZY ON log_pro_pre_pro_pag (id_barrio);
CREATE INDEX IX_log_pro_pre_pro_pag_0002_ZY ON log_pro_pre_pro_pag (id_departamento);
CREATE INDEX IX_log_pro_pre_pro_pag_0003_ZY ON log_pro_pre_pro_pag (id_distrito);
CREATE INDEX IX_log_pro_pre_pro_pag_0004_ZY ON log_pro_pre_pro_pag (id_persona);
CREATE INDEX IX_log_pro_pre_pro_pag_0005_ZY ON log_pro_pre_pro_pag (version_log_pro_pre_pro_pag);
CREATE INDEX IX_log_pro_ver_ele_pen_0001_ZY ON log_pro_ver_ele_pen (id_barrio);
CREATE INDEX IX_log_pro_ver_ele_pen_0002_ZY ON log_pro_ver_ele_pen (id_departamento);
CREATE INDEX IX_log_pro_ver_ele_pen_0003_ZY ON log_pro_ver_ele_pen (id_distrito);
CREATE INDEX IX_log_pro_ver_ele_pen_0004_ZY ON log_pro_ver_ele_pen (id_persona);
CREATE INDEX IX_log_pro_ver_ele_pen_0005_ZY ON log_pro_ver_ele_pen (version_log_pro_ver_ele_pen);
CREATE INDEX IX_mensaje_0001_ZY ON mensaje (version_mensaje);
CREATE INDEX IX_objecion_ele_pen_0001_ZY ON objecion_ele_pen (id_persona);
CREATE INDEX IX_objecion_ele_pen_0002_ZY ON objecion_ele_pen (id_proveedor_dat_ext);
CREATE INDEX IX_objecion_ele_pen_0003_ZY ON objecion_ele_pen (version_objecion_ele_pen);
CREATE INDEX IX_opcion_menu_0001_ZY ON opcion_menu (id_aplicacion);
CREATE INDEX IX_opcion_menu_0002_ZY ON opcion_menu (id_opcion_menu_superior);
CREATE INDEX IX_opcion_menu_0003_ZY ON opcion_menu (id_pagina);
CREATE INDEX IX_opcion_menu_0004_ZY ON opcion_menu (nombre_opcion_menu);
CREATE INDEX IX_opcion_menu_0005_ZY ON opcion_menu (version_opcion_menu);
CREATE INDEX IX_opcion_sistema_0001_ZY ON opcion_sistema (version_opcion_sistema);
CREATE INDEX IX_pagina_0001_ZY ON pagina (id_aplicacion);
CREATE INDEX IX_pagina_0002_ZY ON pagina (id_dominio);
CREATE INDEX IX_pagina_0003_ZY ON pagina (id_dominio_maestro);
CREATE INDEX IX_pagina_0004_ZY ON pagina (id_parametro);
CREATE INDEX IX_pagina_0005_ZY ON pagina (nombre_pagina);
CREATE INDEX IX_pagina_0006_ZY ON pagina (version_pagina);
CREATE INDEX IX_pagina_funcion_0001_ZY ON pagina_funcion (id_funcion);
CREATE INDEX IX_pagina_funcion_0002_ZY ON pagina_funcion (id_pagina);
CREATE INDEX IX_pagina_funcion_0003_ZY ON pagina_funcion (version_pagina_funcion);
CREATE INDEX IX_pagina_usuario_0001_ZY ON pagina_usuario (id_pagina);
CREATE INDEX IX_pagina_usuario_0002_ZY ON pagina_usuario (id_usuario);
CREATE INDEX IX_pagina_usuario_0003_ZY ON pagina_usuario (version_pagina_usuario);
CREATE INDEX IX_paquete_0001_ZY ON paquete (version_paquete);
CREATE INDEX IX_parametro_0001_ZY ON parametro (nombre_parametro);
CREATE INDEX IX_parametro_0002_ZY ON parametro (version_parametro);
CREATE INDEX IX_persona_0001_ZY ON persona (id_barrio);
CREATE INDEX IX_persona_0002_ZY ON persona (id_departamento);
CREATE INDEX IX_persona_0003_ZY ON persona (id_distrito);
CREATE INDEX IX_persona_0004_ZY ON persona (id_etnia_indigena);
CREATE INDEX IX_persona_0005_ZY ON persona (id_ficha_persona);
CREATE INDEX IX_persona_0006_ZY ON persona (id_manzana);
CREATE INDEX IX_persona_0007_ZY ON persona (nombre_persona);
CREATE INDEX IX_persona_0008_ZY ON persona (version_persona);
CREATE INDEX IX_potencial_ben_0001_ZY ON potencial_ben (id_barrio);
CREATE INDEX IX_potencial_ben_0002_ZY ON potencial_ben (id_departamento);
CREATE INDEX IX_potencial_ben_0003_ZY ON potencial_ben (id_distrito);
CREATE INDEX IX_potencial_ben_0004_ZY ON potencial_ben (id_etnia_indigena);
CREATE INDEX IX_potencial_ben_0005_ZY ON potencial_ben (id_ficha_persona);
CREATE INDEX IX_potencial_ben_0006_ZY ON potencial_ben (id_funcionario_ult_visita_cen);
CREATE INDEX IX_potencial_ben_0007_ZY ON potencial_ben (id_funcionario_validacion_cen);
CREATE INDEX IX_potencial_ben_0008_ZY ON potencial_ben (id_manzana);
CREATE INDEX IX_potencial_ben_0009_ZY ON potencial_ben (id_persona);
CREATE INDEX IX_potencial_ben_0010_ZY ON potencial_ben (id_usuario_reg_pot_ben);
CREATE INDEX IX_potencial_ben_0011_ZY ON potencial_ben (nombre_potencial_ben);
CREATE INDEX IX_potencial_ben_0012_ZY ON potencial_ben (version_potencial_ben);
CREATE INDEX IX_proceso_0001_ZY ON proceso (nombre_proceso);
CREATE INDEX IX_proceso_0002_ZY ON proceso (version_proceso);
CREATE INDEX IX_proveedor_dat_ext_0001_ZY ON proveedor_dat_ext (nombre_proveedor_dat_ext);
CREATE INDEX IX_proveedor_dat_ext_0002_ZY ON proveedor_dat_ext (version_proveedor_dat_ext);
CREATE INDEX IX_rastro_funcion_0001_ZY ON rastro_funcion (id_funcion);
CREATE INDEX IX_rastro_funcion_par_0001_ZY ON rastro_funcion_par (id_parametro);
CREATE INDEX IX_rastro_funcion_par_0002_ZY ON rastro_funcion_par (id_rastro_funcion);
CREATE INDEX IX_rastro_informe_0001_ZY ON rastro_informe (id_funcion);
CREATE INDEX IX_rastro_informe_0002_ZY ON rastro_informe (version_rastro_informe);
CREATE INDEX IX_rastro_proceso_0001_ZY ON rastro_proceso (id_funcion);
CREATE INDEX IX_rastro_proceso_0002_ZY ON rastro_proceso (version_rastro_proceso);
CREATE INDEX IX_recurso_0001_ZY ON recurso (nombre_recurso);
CREATE INDEX IX_recurso_0002_ZY ON recurso (version_recurso);
CREATE INDEX IX_rol_0001_ZY ON rol (id_grupo_aplicacion);
CREATE INDEX IX_rol_0002_ZY ON rol (nombre_rol);
CREATE INDEX IX_rol_0003_ZY ON rol (version_rol);
CREATE INDEX IX_rol_aplicacion_0001_ZY ON rol_aplicacion (id_aplicacion);
CREATE INDEX IX_rol_aplicacion_0002_ZY ON rol_aplicacion (id_rol);
CREATE INDEX IX_rol_aplicacion_0003_ZY ON rol_aplicacion (version_rol_aplicacion);
CREATE INDEX IX_rol_filtro_funcion_0001_ZY ON rol_filtro_funcion (id_filtro_funcion);
CREATE INDEX IX_rol_filtro_funcion_0002_ZY ON rol_filtro_funcion (id_rol);
CREATE INDEX IX_rol_filtro_funcion_0003_ZY ON rol_filtro_funcion (version_rol_filtro_funcion);
CREATE INDEX IX_rol_funcion_0001_ZY ON rol_funcion (id_conjunto_segmento);
CREATE INDEX IX_rol_funcion_0002_ZY ON rol_funcion (id_funcion);
CREATE INDEX IX_rol_funcion_0003_ZY ON rol_funcion (id_rol);
CREATE INDEX IX_rol_funcion_0004_ZY ON rol_funcion (version_rol_funcion);
CREATE INDEX IX_rol_pagina_0001_ZY ON rol_pagina (id_pagina);
CREATE INDEX IX_rol_pagina_0002_ZY ON rol_pagina (id_rol);
CREATE INDEX IX_rol_pagina_0003_ZY ON rol_pagina (version_rol_pagina);
CREATE INDEX IX_rol_usuario_0001_ZY ON rol_usuario (id_rol);
CREATE INDEX IX_rol_usuario_0002_ZY ON rol_usuario (id_usuario);
CREATE INDEX IX_rol_usuario_0003_ZY ON rol_usuario (version_rol_usuario);
CREATE INDEX IX_ubicacion_0001_ZY ON ubicacion (id_ubicacion_superior);
CREATE INDEX IX_ubicacion_0002_ZY ON ubicacion (nombre_ubicacion);
CREATE INDEX IX_ubicacion_0003_ZY ON ubicacion (version_ubicacion);
CREATE INDEX IX_usuario_0001_ZY ON usuario (id_usuario_supervisor);
CREATE INDEX IX_usuario_0002_ZY ON usuario (nombre_usuario);
CREATE INDEX IX_usuario_0003_ZY ON usuario (version_usuario);
CREATE INDEX IX_visita_censo_0001_ZY ON visita_censo (id_funcionario_censista);
CREATE INDEX IX_visita_censo_0002_ZY ON visita_censo (id_potencial_ben);
CREATE INDEX IX_visita_censo_0003_ZY ON visita_censo (version_visita_censo);
