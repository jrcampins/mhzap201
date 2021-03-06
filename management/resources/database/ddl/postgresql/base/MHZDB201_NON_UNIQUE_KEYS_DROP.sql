DROP INDEX IX_aplicacion_id_grupo_aplicacion;
DROP INDEX IX_aplicacion_nombre_aplicacion;
DROP INDEX IX_aplicacion_version_aplicacion;
DROP INDEX IX_archivo_datos_ext_id_proveedor_dat_ext;
DROP INDEX IX_archivo_datos_ext_id_usuario_ultima_carga;
DROP INDEX IX_archivo_datos_ext_id_usuario_ultima_importacion;
DROP INDEX IX_archivo_datos_ext_nombre_archivo_datos_ext;
DROP INDEX IX_archivo_datos_ext_version_archivo_datos_ext;
DROP INDEX IX_clase_recurso_id_clase_recurso_base;
DROP INDEX IX_clase_recurso_id_clase_recurso_maestro;
DROP INDEX IX_clase_recurso_id_clase_recurso_segmento;
DROP INDEX IX_clase_recurso_id_funcion_seleccion;
DROP INDEX IX_clase_recurso_id_grupo_aplicacion;
DROP INDEX IX_clase_recurso_id_pagina_detalle;
DROP INDEX IX_clase_recurso_id_pagina_seleccion;
DROP INDEX IX_clase_recurso_nombre_clase_recurso;
DROP INDEX IX_clase_recurso_version_clase_recurso;
DROP INDEX IX_clase_recurso_par_id_clase_recurso_sec;
DROP INDEX IX_clase_recurso_par_id_clase_recurso_valor;
DROP INDEX IX_clase_recurso_par_id_funcion_referencia;
DROP INDEX IX_clase_recurso_par_id_parametro;
DROP INDEX IX_clase_recurso_par_version_clase_recurso_par;
DROP INDEX IX_clase_recurso_sec_version_clase_recurso_sec;
DROP INDEX IX_conjunto_segmento_id_clase_recurso;
DROP INDEX IX_conjunto_segmento_nombre_conjunto_segmento;
DROP INDEX IX_conjunto_segmento_version_conjunto_segmento;
DROP INDEX IX_dominio_id_clase_recurso;
DROP INDEX IX_dominio_id_dominio_segmento;
DROP INDEX IX_dominio_id_funcion_seleccion;
DROP INDEX IX_dominio_id_paquete;
DROP INDEX IX_dominio_nombre_dominio;
DROP INDEX IX_dominio_version_dominio;
DROP INDEX IX_dominio_paquete_id_paquete;
DROP INDEX IX_dominio_paquete_version_dominio_paquete;
DROP INDEX IX_dominio_parametro_001___;
DROP INDEX IX_dominio_parametro_id_parametro;
DROP INDEX IX_dominio_parametro_version_dominio_parametro;
DROP INDEX IX_elemento_segmento_version_elemento_segmento;
DROP INDEX IX_etnia_indigena_nombre_etnia_indigena;
DROP INDEX IX_etnia_indigena_version_etnia_indigena;
DROP INDEX IX_ficha_hogar_id_barrio;
DROP INDEX IX_ficha_hogar_id_departamento;
DROP INDEX IX_ficha_hogar_id_distrito;
DROP INDEX IX_ficha_hogar_id_funcionario_censista;
DROP INDEX IX_ficha_hogar_id_funcionario_critico_deco;
DROP INDEX IX_ficha_hogar_id_funcionario_digitador;
DROP INDEX IX_ficha_hogar_id_funcionario_supervisor;
DROP INDEX IX_ficha_hogar_id_manzana;
DROP INDEX IX_ficha_hogar_id_proveedor_dat_ext;
DROP INDEX IX_ficha_hogar_version_ficha_hogar;
DROP INDEX IX_ficha_persona_id_departamento_nacimiento;
DROP INDEX IX_ficha_persona_id_distrito_nacimiento;
DROP INDEX IX_ficha_persona_id_potencial_ben;
DROP INDEX IX_ficha_persona_nombre_ficha_persona;
DROP INDEX IX_ficha_persona_version_ficha_persona;
DROP INDEX IX_filtro_cla_rec_fun_id_clase_recurso_par_columna;
DROP INDEX IX_filtro_cla_rec_fun_id_clase_recurso_par_valor;
DROP INDEX IX_filtro_cla_rec_fun_id_funcion;
DROP INDEX IX_filtro_cla_rec_fun_version_filtro_cla_rec_fun;
DROP INDEX IX_filtro_cla_rec_par_id_clase_recurso_par;
DROP INDEX IX_filtro_cla_rec_par_id_clase_recurso_par_columna;
DROP INDEX IX_filtro_cla_rec_par_id_clase_recurso_par_valor;
DROP INDEX IX_filtro_cla_rec_par_version_filtro_cla_rec_par;
DROP INDEX IX_filtro_cla_rec_sec_id_clase_recurso_par_columna;
DROP INDEX IX_filtro_cla_rec_sec_id_clase_recurso_par_valor;
DROP INDEX IX_filtro_cla_rec_sec_id_clase_recurso_sec;
DROP INDEX IX_filtro_cla_rec_sec_version_filtro_cla_rec_sec;
DROP INDEX IX_filtro_cla_rec_vin_id_clase_recurso_par;
DROP INDEX IX_filtro_cla_rec_vin_id_clase_recurso_par_columna;
DROP INDEX IX_filtro_cla_rec_vin_id_clase_recurso_par_valor;
DROP INDEX IX_filtro_cla_rec_vin_version_filtro_cla_rec_vin;
DROP INDEX IX_filtro_funcion_id_funcion;
DROP INDEX IX_filtro_funcion_id_usuario;
DROP INDEX IX_filtro_funcion_nombre_filtro_funcion;
DROP INDEX IX_filtro_funcion_version_filtro_funcion;
DROP INDEX IX_filtro_funcion_par_id_filtro_funcion;
DROP INDEX IX_filtro_funcion_par_id_funcion_parametro;
DROP INDEX IX_filtro_funcion_par_version_filtro_funcion_par;
DROP INDEX IX_funcion_id_dominio;
DROP INDEX IX_funcion_id_grupo_proceso;
DROP INDEX IX_funcion_nombre_funcion;
DROP INDEX IX_funcion_version_funcion;
DROP INDEX IX_funcion_parametro_id_clase_recurso_valor;
DROP INDEX IX_funcion_parametro_id_funcion_referencia;
DROP INDEX IX_funcion_parametro_id_parametro;
DROP INDEX IX_funcion_parametro_version_funcion_parametro;
DROP INDEX IX_funcionario_nombre_funcionario;
DROP INDEX IX_funcionario_version_funcionario;
DROP INDEX IX_grupo_aplicacion_nombre_grupo_aplicacion;
DROP INDEX IX_grupo_aplicacion_version_grupo_aplicacion;
DROP INDEX IX_grupo_proceso_nombre_grupo_proceso;
DROP INDEX IX_grupo_proceso_version_grupo_proceso;
DROP INDEX IX_informe_nombre_informe;
DROP INDEX IX_informe_version_informe;
DROP INDEX IX_log_imp_cen_version_log_imp_cen;
DROP INDEX IX_log_imp_deu_version_log_imp_deu;
DROP INDEX IX_log_imp_emp_version_log_imp_emp;
DROP INDEX IX_log_imp_fal_version_log_imp_fal;
DROP INDEX IX_log_imp_hog_version_log_imp_hog;
DROP INDEX IX_log_imp_hog_eec_version_log_imp_hog_eec;
DROP INDEX IX_log_imp_ids_id_persona;
DROP INDEX IX_log_imp_ids_version_log_imp_ids;
DROP INDEX IX_log_imp_jub_version_log_imp_jub;
DROP INDEX IX_log_imp_pen_version_log_imp_pen;
DROP INDEX IX_log_imp_per_id_ficha_persona;
DROP INDEX IX_log_imp_per_version_log_imp_per;
DROP INDEX IX_log_imp_per_eec_id_ficha_persona;
DROP INDEX IX_log_imp_per_eec_version_log_imp_per_eec;
DROP INDEX IX_log_imp_pot_id_potencial_ben;
DROP INDEX IX_log_imp_pot_version_log_imp_pot;
DROP INDEX IX_log_imp_sub_version_log_imp_sub;
DROP INDEX IX_log_imp_ubi_version_log_imp_ubi;
DROP INDEX IX_log_pro_acr_pot_ben_id_barrio;
DROP INDEX IX_log_pro_acr_pot_ben_id_departamento;
DROP INDEX IX_log_pro_acr_pot_ben_id_distrito;
DROP INDEX IX_log_pro_acr_pot_ben_id_ficha_hogar;
DROP INDEX IX_log_pro_acr_pot_ben_id_ficha_persona;
DROP INDEX IX_log_pro_acr_pot_ben_id_persona;
DROP INDEX IX_log_pro_acr_pot_ben_id_potencial_ben;
DROP INDEX IX_log_pro_acr_pot_ben_version_log_pro_acr_pot_ben;
DROP INDEX IX_log_pro_act_jupe_id_barrio;
DROP INDEX IX_log_pro_act_jupe_id_departamento;
DROP INDEX IX_log_pro_act_jupe_id_distrito;
DROP INDEX IX_log_pro_act_jupe_id_persona;
DROP INDEX IX_log_pro_act_jupe_version_log_pro_act_jupe;
DROP INDEX IX_log_pro_den_pen_obj_id_barrio;
DROP INDEX IX_log_pro_den_pen_obj_id_departamento;
DROP INDEX IX_log_pro_den_pen_obj_id_distrito;
DROP INDEX IX_log_pro_den_pen_obj_id_persona;
DROP INDEX IX_log_pro_den_pen_obj_version_log_pro_den_pen_obj;
DROP INDEX IX_log_pro_imp_arc_ext_id_archivo_datos_ext;
DROP INDEX IX_log_pro_imp_arc_ext_version_log_pro_imp_arc_ext;
DROP INDEX IX_log_pro_oto_pen_apr_id_barrio;
DROP INDEX IX_log_pro_oto_pen_apr_id_departamento;
DROP INDEX IX_log_pro_oto_pen_apr_id_distrito;
DROP INDEX IX_log_pro_oto_pen_apr_id_persona;
DROP INDEX IX_log_pro_oto_pen_apr_version_log_pro_oto_pen_apr;
DROP INDEX IX_log_pro_pre_pro_pag_id_barrio;
DROP INDEX IX_log_pro_pre_pro_pag_id_departamento;
DROP INDEX IX_log_pro_pre_pro_pag_id_distrito;
DROP INDEX IX_log_pro_pre_pro_pag_id_persona;
DROP INDEX IX_log_pro_pre_pro_pag_version_log_pro_pre_pro_pag;
DROP INDEX IX_log_pro_ver_ele_pen_id_barrio;
DROP INDEX IX_log_pro_ver_ele_pen_id_departamento;
DROP INDEX IX_log_pro_ver_ele_pen_id_distrito;
DROP INDEX IX_log_pro_ver_ele_pen_id_persona;
DROP INDEX IX_log_pro_ver_ele_pen_version_log_pro_ver_ele_pen;
DROP INDEX IX_mensaje_version_mensaje;
DROP INDEX IX_objecion_ele_pen_id_persona;
DROP INDEX IX_objecion_ele_pen_id_proveedor_dat_ext;
DROP INDEX IX_objecion_ele_pen_version_objecion_ele_pen;
DROP INDEX IX_opcion_menu_id_aplicacion;
DROP INDEX IX_opcion_menu_id_opcion_menu_superior;
DROP INDEX IX_opcion_menu_id_pagina;
DROP INDEX IX_opcion_menu_nombre_opcion_menu;
DROP INDEX IX_opcion_menu_version_opcion_menu;
DROP INDEX IX_opcion_sistema_version_opcion_sistema;
DROP INDEX IX_pagina_id_aplicacion;
DROP INDEX IX_pagina_id_dominio;
DROP INDEX IX_pagina_id_dominio_maestro;
DROP INDEX IX_pagina_id_parametro;
DROP INDEX IX_pagina_nombre_pagina;
DROP INDEX IX_pagina_version_pagina;
DROP INDEX IX_pagina_funcion_id_funcion;
DROP INDEX IX_pagina_funcion_version_pagina_funcion;
DROP INDEX IX_pagina_usuario_id_usuario;
DROP INDEX IX_pagina_usuario_version_pagina_usuario;
DROP INDEX IX_paquete_version_paquete;
DROP INDEX IX_parametro_nombre_parametro;
DROP INDEX IX_parametro_version_parametro;
DROP INDEX IX_persona_id_barrio;
DROP INDEX IX_persona_id_departamento;
DROP INDEX IX_persona_id_distrito;
DROP INDEX IX_persona_id_etnia_indigena;
DROP INDEX IX_persona_id_ficha_persona;
DROP INDEX IX_persona_nombre_persona;
DROP INDEX IX_persona_version_persona;
DROP INDEX IX_persona_anotada_001___;
DROP INDEX IX_persona_anotada_002___;
DROP INDEX IX_persona_anotada_003___;
DROP INDEX IX_persona_anotada_004___;
DROP INDEX IX_persona_anotada_005___;
DROP INDEX IX_persona_anotada_version_persona_anotada;
DROP INDEX IX_potencial_ben_id_barrio;
DROP INDEX IX_potencial_ben_id_departamento;
DROP INDEX IX_potencial_ben_id_distrito;
DROP INDEX IX_potencial_ben_id_etnia_indigena;
DROP INDEX IX_potencial_ben_id_ficha_persona;
DROP INDEX IX_potencial_ben_id_funcionario_ult_visita_cen;
DROP INDEX IX_potencial_ben_id_funcionario_validacion_cen;
DROP INDEX IX_potencial_ben_id_manzana;
DROP INDEX IX_potencial_ben_id_usuario_reg_pot_ben;
DROP INDEX IX_potencial_ben_nombre_potencial_ben;
DROP INDEX IX_potencial_ben_version_potencial_ben;
DROP INDEX IX_proceso_nombre_proceso;
DROP INDEX IX_proceso_version_proceso;
DROP INDEX IX_proveedor_dat_ext_nombre_proveedor_dat_ext;
DROP INDEX IX_proveedor_dat_ext_version_proveedor_dat_ext;
DROP INDEX IX_rastro_funcion_id_funcion;
DROP INDEX IX_rastro_funcion_par_id_parametro;
DROP INDEX IX_rastro_funcion_par_id_rastro_funcion;
DROP INDEX IX_rastro_informe_id_funcion;
DROP INDEX IX_rastro_informe_version_rastro_informe;
DROP INDEX IX_rastro_proceso_id_funcion;
DROP INDEX IX_rastro_proceso_version_rastro_proceso;
DROP INDEX IX_recurso_nombre_recurso;
DROP INDEX IX_recurso_version_recurso;
DROP INDEX IX_rol_id_grupo_aplicacion;
DROP INDEX IX_rol_nombre_rol;
DROP INDEX IX_rol_version_rol;
DROP INDEX IX_rol_aplicacion_id_aplicacion;
DROP INDEX IX_rol_aplicacion_version_rol_aplicacion;
DROP INDEX IX_rol_filtro_funcion_id_filtro_funcion;
DROP INDEX IX_rol_filtro_funcion_version_rol_filtro_funcion;
DROP INDEX IX_rol_funcion_id_conjunto_segmento;
DROP INDEX IX_rol_funcion_id_funcion;
DROP INDEX IX_rol_funcion_version_rol_funcion;
DROP INDEX IX_rol_pagina_id_pagina;
DROP INDEX IX_rol_pagina_version_rol_pagina;
DROP INDEX IX_rol_usuario_id_usuario;
DROP INDEX IX_rol_usuario_version_rol_usuario;
DROP INDEX IX_ubicacion_id_ubicacion_superior;
DROP INDEX IX_ubicacion_nombre_ubicacion;
DROP INDEX IX_ubicacion_version_ubicacion;
DROP INDEX IX_usuario_id_usuario_supervisor;
DROP INDEX IX_usuario_nombre_usuario;
DROP INDEX IX_usuario_version_usuario;
DROP INDEX IX_visita_censo_id_funcionario_censista;
DROP INDEX IX_visita_censo_id_potencial_ben;
DROP INDEX IX_visita_censo_version_visita_censo;
