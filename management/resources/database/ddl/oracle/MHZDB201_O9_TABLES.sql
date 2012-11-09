CREATE TABLE aplicacion
	(
	id_aplicacion NUMBER(19) NOT NULL,
	version_aplicacion NUMBER(19) NOT NULL,
	codigo_aplicacion VARCHAR2(200) NOT NULL,
	nombre_aplicacion VARCHAR2(200),
	descripcion_aplicacion VARCHAR2(4000),
	servidor_aplicacion VARCHAR2(200) NOT NULL,
	puerto_aplicacion VARCHAR2(20) NOT NULL,
	url_aplicacion VARCHAR2(4000),
	es_publica NUMBER(10) NOT NULL,
	id_grupo_aplicacion NUMBER(19)
	);
	
CREATE TABLE archivo_datos_ext
	(
	id_archivo_datos_ext NUMBER(19) NOT NULL,
	version_archivo_datos_ext NUMBER(19) NOT NULL,
	codigo_archivo_datos_ext VARCHAR2(200) NOT NULL,
	nombre_archivo_datos_ext VARCHAR2(200),
	id_proveedor_dat_ext NUMBER(19) NOT NULL,
	numero_tipo_arc_dat_ext NUMBER(10) NOT NULL,
	objeto_archivo_datos_ext VARCHAR2(4000),
	bytes_archivo_datos_ext NUMBER(10),
	es_archivo_datos_ext_importado NUMBER(10) NOT NULL,
	es_archivo_datos_ext_inactivo NUMBER(10) NOT NULL,
	fecha_hora_ultima_carga DATE,
	id_usuario_ultima_carga NUMBER(19),
	fecha_hora_ultima_importacion DATE,
	id_usuario_ultima_importacion NUMBER(19)
	);
	
CREATE TABLE causa_den_pension
	(
	numero_causa_den_pension NUMBER(10) NOT NULL,
	codigo_causa_den_pension VARCHAR2(60) NOT NULL
	);
	
CREATE TABLE causa_den_recl_cen
	(
	numero_causa_den_recl_cen NUMBER(10) NOT NULL,
	codigo_causa_den_recl_cen VARCHAR2(60) NOT NULL
	);
	
CREATE TABLE causa_den_reco_pen
	(
	numero_causa_den_reco_pen NUMBER(10) NOT NULL,
	codigo_causa_den_reco_pen VARCHAR2(60) NOT NULL
	);
	
CREATE TABLE causa_impedimento
	(
	numero_causa_impedimento NUMBER(10) NOT NULL,
	codigo_causa_impedimento VARCHAR2(200) NOT NULL
	);
	
CREATE TABLE causa_inv_censo
	(
	numero_causa_inv_censo NUMBER(10) NOT NULL,
	codigo_causa_inv_censo VARCHAR2(60) NOT NULL
	);
	
CREATE TABLE causa_rev_pension
	(
	numero_causa_rev_pension NUMBER(10) NOT NULL,
	codigo_causa_rev_pension VARCHAR2(60) NOT NULL
	);
	
CREATE TABLE clase_enf_acc
	(
	numero_clase_enf_acc NUMBER(10) NOT NULL,
	codigo_clase_enf_acc VARCHAR2(200) NOT NULL
	);
	
CREATE TABLE clase_enf_cronica
	(
	numero_clase_enf_cronica NUMBER(10) NOT NULL,
	codigo_clase_enf_cronica VARCHAR2(200) NOT NULL
	);
	
CREATE TABLE clase_impedimento
	(
	numero_clase_impedimento NUMBER(10) NOT NULL,
	codigo_clase_impedimento VARCHAR2(200) NOT NULL
	);
	
CREATE TABLE clase_recurso
	(
	id_clase_recurso NUMBER(19) NOT NULL,
	version_clase_recurso NUMBER(19) NOT NULL,
	codigo_clase_recurso VARCHAR2(200) NOT NULL,
	nombre_clase_recurso VARCHAR2(200),
	descripcion_clase_recurso VARCHAR2(4000),
	es_clase_recurso_independiente NUMBER(10) NOT NULL,
	es_clase_recurso_sin_detalle NUMBER(10) NOT NULL,
	es_clase_recurso_con_arbol NUMBER(10) NOT NULL,
	numero_tipo_clase_recurso NUMBER(10) NOT NULL,
	numero_tipo_recurso NUMBER(10) NOT NULL,
	id_funcion_seleccion NUMBER(19),
	id_pagina_seleccion NUMBER(19),
	id_pagina_detalle NUMBER(19),
	id_clase_recurso_maestro NUMBER(19),
	id_clase_recurso_segmento NUMBER(19),
	id_clase_recurso_base NUMBER(19),
	id_grupo_aplicacion NUMBER(19),
	id_aplicacion_web NUMBER(19),
	limite_filas_consulta NUMBER(10),
	limite_filas_informe NUMBER(10),
	orden_presentacion NUMBER(10),
	es_clase_recurso_insertable NUMBER(10) NOT NULL,
	es_clase_recurso_modificable NUMBER(10) NOT NULL,
	es_clase_recurso_eliminable NUMBER(10) NOT NULL,
	es_clase_recurso_extendida NUMBER(10) NOT NULL,
	etiqueta_hipervinculo VARCHAR2(40),
	es_enumerador_con_numero NUMBER(10) NOT NULL,
	alias_clase_recurso VARCHAR2(200)
	);
	
CREATE TABLE clase_recurso_par
	(
	id_clase_recurso_par NUMBER(19) NOT NULL,
	version_clase_recurso_par NUMBER(19) NOT NULL,
	id_clase_recurso NUMBER(19) NOT NULL,
	id_parametro NUMBER(19) NOT NULL,
	numero_tipo_parametro NUMBER(10) NOT NULL,
	numero_tipo_comparacion NUMBER(10),
	id_funcion_referencia NUMBER(19),
	numero_tipo_valor NUMBER(10) NOT NULL,
	id_lista_valor NUMBER(19),
	id_clase_objeto_valor NUMBER(19),
	id_clase_recurso_valor NUMBER(19),
	valor_minimo VARCHAR2(200),
	valor_maximo VARCHAR2(200),
	valor_omision VARCHAR2(200),
	es_parametro_omisible NUMBER(10) NOT NULL,
	es_parametro_inmutable NUMBER(10) NOT NULL,
	es_parametro_submit NUMBER(10) NOT NULL,
	es_parametro_primordial NUMBER(10) NOT NULL,
	es_parametro_maestro NUMBER(10) NOT NULL,
	es_parametro_segmento NUMBER(10) NOT NULL,
	es_parametro_sin_rastro NUMBER(10) NOT NULL,
	es_parametro_sincronizado NUMBER(10) NOT NULL,
	orden_presentacion NUMBER(10) NOT NULL,
	id_clase_recurso_sec NUMBER(19),
	es_referencia_alternativa NUMBER(10) NOT NULL,
	numero_tipo_valor_alternativo NUMBER(10),
	id_funcion_referencia_alt NUMBER(19),
	id_lista_valor_alternativa NUMBER(19),
	id_clase_objeto_valor_alt NUMBER(19),
	id_clase_recurso_valor_alt NUMBER(19),
	orden_pagina_seleccion NUMBER(10) NOT NULL
	);
	
CREATE TABLE clase_recurso_sec
	(
	id_clase_recurso_sec NUMBER(19) NOT NULL,
	version_clase_recurso_sec NUMBER(19) NOT NULL,
	id_clase_recurso NUMBER(19) NOT NULL,
	etiqueta_clase_recurso_sec VARCHAR2(60) NOT NULL,
	descripcion_clase_recurso_sec VARCHAR2(4000),
	orden_presentacion NUMBER(10) NOT NULL,
	es_pestana_detalle NUMBER(10) NOT NULL
	);
	
CREATE TABLE condicion_censo
	(
	numero_condicion_censo NUMBER(10) NOT NULL,
	codigo_condicion_censo VARCHAR2(60) NOT NULL
	);
	
CREATE TABLE condicion_denu_pen
	(
	numero_condicion_denu_pen NUMBER(10) NOT NULL,
	codigo_condicion_denu_pen VARCHAR2(60) NOT NULL
	);
	
CREATE TABLE condicion_eje_fun
	(
	numero_condicion_eje_fun NUMBER(10) NOT NULL,
	codigo_condicion_eje_fun VARCHAR2(60) NOT NULL
	);
	
CREATE TABLE condicion_pension
	(
	numero_condicion_pension NUMBER(10) NOT NULL,
	codigo_condicion_pension VARCHAR2(60) NOT NULL
	);
	
CREATE TABLE condicion_recl_cen
	(
	numero_condicion_recl_cen NUMBER(10) NOT NULL,
	codigo_condicion_recl_cen VARCHAR2(60) NOT NULL
	);
	
CREATE TABLE condicion_reco_pen
	(
	numero_condicion_reco_pen NUMBER(10) NOT NULL,
	codigo_condicion_reco_pen VARCHAR2(60) NOT NULL
	);
	
CREATE TABLE conjunto_segmento
	(
	id_conjunto_segmento NUMBER(19) NOT NULL,
	version_conjunto_segmento NUMBER(19) NOT NULL,
	codigo_conjunto_segmento VARCHAR2(60) NOT NULL,
	nombre_conjunto_segmento VARCHAR2(200),
	descripcion_conjunto_segmento VARCHAR2(4000),
	id_clase_recurso NUMBER(19) NOT NULL
	);
	
CREATE TABLE dominio
	(
	id_dominio NUMBER(19) NOT NULL,
	version_dominio NUMBER(19) NOT NULL,
	codigo_dominio VARCHAR2(200) NOT NULL,
	nombre_dominio VARCHAR2(200),
	descripcion_dominio VARCHAR2(4000),
	nombre_tabla VARCHAR2(200),
	numero_tipo_dominio NUMBER(10) NOT NULL,
	id_clase_recurso NUMBER(19) NOT NULL,
	id_funcion_seleccion NUMBER(19),
	id_dominio_segmento NUMBER(19),
	id_paquete NUMBER(19)
	);
	
CREATE TABLE dominio_paquete
	(
	id_dominio_paquete NUMBER(19) NOT NULL,
	version_dominio_paquete NUMBER(19) NOT NULL,
	id_dominio NUMBER(19) NOT NULL,
	id_paquete NUMBER(19) NOT NULL
	);
	
CREATE TABLE dominio_parametro
	(
	id_dominio_parametro NUMBER(19) NOT NULL,
	version_dominio_parametro NUMBER(19) NOT NULL,
	id_dominio NUMBER(19) NOT NULL,
	id_parametro NUMBER(19) NOT NULL,
	numero_tipo_parametro_dom NUMBER(10) NOT NULL,
	etiqueta_parametro VARCHAR2(200)
	);
	
CREATE TABLE elemento_segmento
	(
	id_elemento_segmento NUMBER(19) NOT NULL,
	version_elemento_segmento NUMBER(19) NOT NULL,
	id_conjunto_segmento NUMBER(19) NOT NULL,
	id_segmento NUMBER(19) NOT NULL,
	valor_segmento VARCHAR2(200),
	significado_segmento VARCHAR2(4000)
	);
	
CREATE TABLE estado_civil
	(
	numero_estado_civil NUMBER(10) NOT NULL,
	codigo_estado_civil VARCHAR2(60) NOT NULL
	);
	
CREATE TABLE estado_salud
	(
	numero_estado_salud NUMBER(10) NOT NULL,
	codigo_estado_salud VARCHAR2(60) NOT NULL
	);
	
CREATE TABLE etnia_indigena
	(
	id_etnia_indigena NUMBER(19) NOT NULL,
	version_etnia_indigena NUMBER(19) NOT NULL,
	codigo_etnia_indigena VARCHAR2(60) NOT NULL,
	nombre_etnia_indigena VARCHAR2(200),
	descripcion_etnia_indigena VARCHAR2(4000)
	);
	
CREATE TABLE ficha_hogar
	(
	id_ficha_hogar NUMBER(19) NOT NULL,
	version_ficha_hogar NUMBER(19) NOT NULL,
	codigo_ficha_hogar VARCHAR2(60) NOT NULL,
	fecha_entrevista DATE NOT NULL,
	id_funcionario_censista NUMBER(19),
	id_funcionario_supervisor NUMBER(19),
	id_funcionario_critico_deco NUMBER(19),
	id_funcionario_digitador NUMBER(19),
	observaciones VARCHAR2(4000),
	huso_utm NUMBER(10),
	franja_utm CHAR(1),
	distancia_este_utm NUMBER(10),
	distancia_norte_utm NUMBER(10),
	numero_formulario NUMBER(10) NOT NULL,
	numero_vivienda NUMBER(10) NOT NULL,
	numero_hogar NUMBER(10) NOT NULL,
	id_departamento NUMBER(19),
	id_distrito NUMBER(19),
	numero_tipo_area NUMBER(10),
	id_barrio NUMBER(19),
	id_manzana NUMBER(19),
	manzana VARCHAR2(60),
	direccion VARCHAR2(4000),
	total_personas NUMBER(10),
	total_hombres NUMBER(10),
	total_mujeres NUMBER(10),
	numero_tipo_mat_paredes NUMBER(10),
	numero_tipo_mat_piso NUMBER(10),
	numero_tipo_mat_techo NUMBER(10),
	numero_tipo_ocupacion_viv NUMBER(10),
	otro_tipo_ocupacion_viv VARCHAR2(200),
	cantidad_piezas NUMBER(10),
	cantidad_dormitorios NUMBER(10),
	numero_siono_pieza_cocina NUMBER(10),
	numero_tipo_combustible NUMBER(10),
	numero_tipo_pieza_bano NUMBER(10),
	numero_tipo_servicio_san NUMBER(10),
	numero_tipo_servicio_agua NUMBER(10),
	numero_tipo_aba_agua NUMBER(10),
	numero_siono_corriente_elec NUMBER(10),
	numero_tipo_desecho_bas NUMBER(10),
	numero_siono_telefono_celular NUMBER(10),
	numero_telefono_celular VARCHAR2(100),
	numero_siono_tlf_linea_baja NUMBER(10),
	numero_telefono_linea_baja VARCHAR2(100),
	numero_siono_disp_heladera NUMBER(10),
	numero_siono_disp_lavarropas NUMBER(10),
	numero_siono_disp_termo NUMBER(10),
	numero_siono_disp_aire_acon NUMBER(10),
	numero_siono_disp_automovil NUMBER(10),
	numero_siono_disp_camion NUMBER(10),
	numero_siono_disp_motocicleta NUMBER(10),
	nombre_jefe_hogar VARCHAR2(200),
	numero_cedula_jefe_hogar NUMBER(10),
	letra_cedula_jefe_hogar VARCHAR2(2),
	numero_orden_iden_jefe_hogar NUMBER(10),
	nombre_respondente VARCHAR2(200),
	numero_cedula_respondente NUMBER(10),
	letra_cedula_respondente VARCHAR2(2),
	numero_orden_iden_respondente NUMBER(10),
	id_proveedor_dat_ext NUMBER(19),
	indice_calidad_vida NUMBER(7,4),
	es_ficha_hogar_inactiva NUMBER(10) NOT NULL
	);
	
CREATE TABLE ficha_persona
	(
	id_ficha_persona NUMBER(19) NOT NULL,
	version_ficha_persona NUMBER(19) NOT NULL,
	codigo_ficha_persona VARCHAR2(60) NOT NULL,
	nombre_ficha_persona VARCHAR2(200) NOT NULL,
	es_respondente NUMBER(10) NOT NULL,
	id_ficha_hogar NUMBER(19) NOT NULL,
	numero_orden_identificacion NUMBER(10) NOT NULL,
	primer_nombre VARCHAR2(60),
	segundo_nombre VARCHAR2(60),
	primer_apellido VARCHAR2(60),
	segundo_apellido VARCHAR2(60),
	apellido_casada VARCHAR2(60),
	apodo VARCHAR2(60),
	edad NUMBER(10),
	numero_sexo_persona NUMBER(10),
	numero_estado_civil NUMBER(10),
	numero_tipo_persona_hogar NUMBER(10) NOT NULL,
	numero_siono_miembro_hogar NUMBER(10) NOT NULL,
	numero_orden_iden_conyuge NUMBER(10),
	numero_orden_iden_padre NUMBER(10),
	numero_orden_iden_madre NUMBER(10),
	numero_cedula NUMBER(10),
	letra_cedula VARCHAR2(2),
	numero_tipo_excepcion_ced NUMBER(10),
	fecha_nacimiento DATE,
	id_departamento_nacimiento NUMBER(19),
	id_distrito_nacimiento NUMBER(19),
	numero_tipo_area_lugar_nac NUMBER(10),
	numero_idioma_hogar NUMBER(10),
	otro_idioma_hogar VARCHAR2(200),
	numero_siono_asistencia_esc NUMBER(10),
	numero_motivo_ina_esc NUMBER(10),
	otro_motivo_ina_esc VARCHAR2(200),
	numero_siono_matriculacion_esc NUMBER(10),
	ultimo_curso_aprobado NUMBER(10),
	numero_nivel_edu_ult_cur_aprob NUMBER(10),
	numero_siono_curso_no_formal NUMBER(10),
	numero_tipo_seguro_medico NUMBER(10),
	numero_estado_salud NUMBER(10),
	numero_clase_enf_acc NUMBER(10),
	otra_clase_enf_acc VARCHAR2(200),
	numero_clase_enf_cronica NUMBER(10),
	otra_clase_enf_cronica VARCHAR2(200),
	numero_siono_atencion_medica NUMBER(10),
	numero_motivo_no_atencion NUMBER(10),
	otro_motivo_no_atencion VARCHAR2(200),
	numero_siono_carnet_vacunacion NUMBER(10),
	numero_clase_impedimento NUMBER(10),
	otra_clase_impedimento VARCHAR2(200),
	numero_causa_impedimento NUMBER(10),
	otra_causa_impedimento VARCHAR2(200),
	numero_siono_dif_para_caminar NUMBER(10),
	numero_siono_dif_para_vestirse NUMBER(10),
	numero_siono_dif_para_banarse NUMBER(10),
	numero_siono_dif_para_comer NUMBER(10),
	numero_siono_dif_para_la_cama NUMBER(10),
	numero_siono_dif_para_el_bano NUMBER(10),
	numero_siono_trabajo NUMBER(10),
	numero_motivo_no_trabajo NUMBER(10),
	otro_motivo_no_trabajo VARCHAR2(200),
	descripcion_ocupacion_prin VARCHAR2(200),
	descripcion_dedicacion_prin VARCHAR2(200),
	numero_tipo_relacion_lab NUMBER(10),
	monto_ingreso_ocupacion_prin NUMBER(16,2),
	monto_ingreso_ocupacion_secun NUMBER(16,2),
	monto_ingreso_otras_ocup NUMBER(16,2),
	monto_ingreso_alquileres NUMBER(16,2),
	monto_ingreso_intereses NUMBER(16,2),
	monto_ingreso_ayuda_fam_pais NUMBER(16,2),
	monto_ingreso_ayuda_fam_exter NUMBER(16,2),
	monto_ingreso_jubilacion NUMBER(16,2),
	monto_ingreso_pensiones NUMBER(16,2),
	monto_ingreso_tekopora NUMBER(16,2),
	monto_ingreso_programas NUMBER(16,2),
	monto_ingreso_adicional NUMBER(16,2),
	total_ingreso_mensual NUMBER(16,2),
	id_potencial_ben NUMBER(19),
	es_ficha_persona_inactiva NUMBER(10) NOT NULL
	);
	
CREATE TABLE filtro_cla_rec_fun
	(
	id_filtro_cla_rec_fun NUMBER(19) NOT NULL,
	version_filtro_cla_rec_fun NUMBER(19) NOT NULL,
	id_funcion NUMBER(19) NOT NULL,
	id_clase_recurso_par_columna NUMBER(19) NOT NULL,
	numero_operador_com NUMBER(10) NOT NULL,
	id_clase_recurso_par_valor NUMBER(19),
	valor VARCHAR2(4000)
	);
	
CREATE TABLE filtro_cla_rec_par
	(
	id_filtro_cla_rec_par NUMBER(19) NOT NULL,
	version_filtro_cla_rec_par NUMBER(19) NOT NULL,
	id_clase_recurso_par NUMBER(19) NOT NULL,
	id_clase_recurso_par_columna NUMBER(19) NOT NULL,
	numero_operador_com NUMBER(10) NOT NULL,
	id_clase_recurso_par_valor NUMBER(19),
	valor VARCHAR2(4000)
	);
	
CREATE TABLE filtro_cla_rec_sec
	(
	id_filtro_cla_rec_sec NUMBER(19) NOT NULL,
	version_filtro_cla_rec_sec NUMBER(19) NOT NULL,
	id_clase_recurso_sec NUMBER(19) NOT NULL,
	id_clase_recurso_par_columna NUMBER(19) NOT NULL,
	numero_operador_com NUMBER(10) NOT NULL,
	id_clase_recurso_par_valor NUMBER(19),
	valor VARCHAR2(4000)
	);
	
CREATE TABLE filtro_cla_rec_vin
	(
	id_filtro_cla_rec_vin NUMBER(19) NOT NULL,
	version_filtro_cla_rec_vin NUMBER(19) NOT NULL,
	id_clase_recurso_par NUMBER(19) NOT NULL,
	id_clase_recurso_par_columna NUMBER(19) NOT NULL,
	numero_operador_com NUMBER(10) NOT NULL,
	id_clase_recurso_par_valor NUMBER(19),
	valor VARCHAR2(4000)
	);
	
CREATE TABLE filtro_funcion
	(
	id_filtro_funcion NUMBER(19) NOT NULL,
	version_filtro_funcion NUMBER(19) NOT NULL,
	codigo_filtro_funcion VARCHAR2(200) NOT NULL,
	nombre_filtro_funcion VARCHAR2(200),
	descripcion_filtro_funcion VARCHAR2(4000),
	id_funcion NUMBER(19) NOT NULL,
	id_usuario NUMBER(19) NOT NULL,
	es_publico NUMBER(10) NOT NULL,
	id_filtro_funcion_original NUMBER(19)
	);
	
CREATE TABLE filtro_funcion_par
	(
	id_filtro_funcion_par NUMBER(19) NOT NULL,
	version_filtro_funcion_par NUMBER(19) NOT NULL,
	id_filtro_funcion NUMBER(19) NOT NULL,
	id_funcion_parametro NUMBER(19) NOT NULL,
	numero_operador_com NUMBER(10) NOT NULL,
	id_valor_lista NUMBER(19),
	id_objeto_valor NUMBER(19),
	id_recurso_valor NUMBER(19),
	valor_parametro VARCHAR2(200),
	significado_parametro VARCHAR2(4000)
	);
	
CREATE TABLE funcion
	(
	id_funcion NUMBER(19) NOT NULL,
	version_funcion NUMBER(19) NOT NULL,
	codigo_funcion VARCHAR2(200) NOT NULL,
	nombre_funcion VARCHAR2(200),
	descripcion_funcion VARCHAR2(4000),
	numero_tipo_funcion NUMBER(10) NOT NULL,
	numero_tipo_rastro_fun NUMBER(10) NOT NULL,
	id_dominio NUMBER(19),
	clausula_where VARCHAR2(4000),
	clausula_order VARCHAR2(4000),
	es_publica NUMBER(10) NOT NULL,
	es_programatica NUMBER(10) NOT NULL,
	es_personalizada NUMBER(10) NOT NULL,
	es_segmentada NUMBER(10) NOT NULL,
	id_grupo_proceso NUMBER(19)
	);
	
CREATE TABLE funcion_parametro
	(
	id_funcion_parametro NUMBER(19) NOT NULL,
	version_funcion_parametro NUMBER(19) NOT NULL,
	id_funcion NUMBER(19) NOT NULL,
	id_parametro NUMBER(19) NOT NULL,
	numero_tipo_parametro NUMBER(10) NOT NULL,
	numero_tipo_comparacion NUMBER(10),
	id_funcion_referencia NUMBER(19),
	numero_tipo_valor NUMBER(10) NOT NULL,
	id_lista_valor NUMBER(19),
	id_clase_objeto_valor NUMBER(19),
	id_clase_recurso_valor NUMBER(19),
	valor_minimo VARCHAR2(200),
	valor_maximo VARCHAR2(200),
	valor_omision VARCHAR2(200),
	es_parametro_sin_rastro NUMBER(10) NOT NULL,
	es_parametro_segmento NUMBER(10) NOT NULL
	);
	
CREATE TABLE funcionario
	(
	id_funcionario NUMBER(19) NOT NULL,
	version_funcionario NUMBER(19) NOT NULL,
	codigo_funcionario VARCHAR2(60) NOT NULL,
	nombre_funcionario VARCHAR2(200) NOT NULL,
	numero_cedula NUMBER(10),
	letra_cedula VARCHAR2(2),
	primer_nombre VARCHAR2(60),
	segundo_nombre VARCHAR2(60),
	primer_apellido VARCHAR2(60),
	segundo_apellido VARCHAR2(60),
	apellido_casada VARCHAR2(60)
	);
	
CREATE TABLE grupo_aplicacion
	(
	id_grupo_aplicacion NUMBER(19) NOT NULL,
	version_grupo_aplicacion NUMBER(19) NOT NULL,
	codigo_grupo_aplicacion VARCHAR2(60) NOT NULL,
	nombre_grupo_aplicacion VARCHAR2(200),
	descripcion_grupo_aplicacion VARCHAR2(4000)
	);
	
CREATE TABLE grupo_proceso
	(
	id_grupo_proceso NUMBER(19) NOT NULL,
	version_grupo_proceso NUMBER(19) NOT NULL,
	codigo_grupo_proceso VARCHAR2(60) NOT NULL,
	nombre_grupo_proceso VARCHAR2(200),
	descripcion_grupo_proceso VARCHAR2(4000),
	id_rastro_proceso NUMBER(19),
	numero_condicion_eje_fun NUMBER(10)
	);
	
CREATE TABLE idioma_hogar
	(
	numero_idioma_hogar NUMBER(10) NOT NULL,
	codigo_idioma_hogar VARCHAR2(60) NOT NULL
	);
	
CREATE TABLE informe
	(
	id_informe NUMBER(19) NOT NULL,
	version_informe NUMBER(19) NOT NULL,
	codigo_proceso_informe VARCHAR2(60) NOT NULL,
	nombre_proceso_informe VARCHAR2(200) NOT NULL
	);
	
CREATE TABLE mensaje
	(
	id_mensaje NUMBER(19) NOT NULL,
	version_mensaje NUMBER(19) NOT NULL,
	codigo_mensaje VARCHAR2(200) NOT NULL,
	patron_mensaje VARCHAR2(4000),
	descripcion_mensaje VARCHAR2(4000)
	);
	
CREATE TABLE motivo_ina_esc
	(
	numero_motivo_ina_esc NUMBER(10) NOT NULL,
	codigo_motivo_ina_esc VARCHAR2(200) NOT NULL
	);
	
CREATE TABLE motivo_no_atencion
	(
	numero_motivo_no_atencion NUMBER(10) NOT NULL,
	codigo_motivo_no_atencion VARCHAR2(60) NOT NULL
	);
	
CREATE TABLE motivo_no_trabajo
	(
	numero_motivo_no_trabajo NUMBER(10) NOT NULL,
	codigo_motivo_no_trabajo VARCHAR2(60) NOT NULL
	);
	
CREATE TABLE nivel_educativo
	(
	numero_nivel_educativo NUMBER(10) NOT NULL,
	codigo_nivel_educativo VARCHAR2(200) NOT NULL,
	primer_curso NUMBER(10) NOT NULL,
	ultimo_curso NUMBER(10) NOT NULL
	);
	
CREATE TABLE nivel_opcion_menu
	(
	numero_nivel_opcion_menu NUMBER(10) NOT NULL,
	codigo_nivel_opcion_menu VARCHAR2(60) NOT NULL,
	digitos_nivel_opcion_menu NUMBER(10) NOT NULL
	);
	
CREATE TABLE nivel_ubicacion
	(
	numero_nivel_ubicacion NUMBER(10) NOT NULL,
	codigo_nivel_ubicacion VARCHAR2(60) NOT NULL,
	digitos_nivel_ubicacion NUMBER(10) NOT NULL
	);
	
CREATE TABLE objecion_ele_pen
	(
	id_objecion_ele_pen NUMBER(19) NOT NULL,
	version_objecion_ele_pen NUMBER(19) NOT NULL,
	id_persona NUMBER(19) NOT NULL,
	id_proveedor_dat_ext NUMBER(19) NOT NULL,
	numero_tipo_obj_ele_pen NUMBER(10) NOT NULL,
	es_objecion_ele_pen_inactiva NUMBER(10) NOT NULL,
	fecha_ultima_actualizacion DATE,
	nombre_archivo_ultima_act VARCHAR2(400)
	);
	
CREATE TABLE opcion_binaria
	(
	numero_opcion_binaria NUMBER(10) NOT NULL,
	codigo_opcion_si_no VARCHAR2(60) NOT NULL,
	codigo_opcion_activo_inactivo VARCHAR2(60) NOT NULL,
	codigo_opcion_enc_apa VARCHAR2(60) NOT NULL,
	codigo_opcion_presente_ausente VARCHAR2(60) NOT NULL,
	codigo_opcion_pos_neg VARCHAR2(60) NOT NULL,
	codigo_opcion_verdadero_falso VARCHAR2(60) NOT NULL
	);
	
CREATE TABLE opcion_menu
	(
	id_opcion_menu NUMBER(19) NOT NULL,
	version_opcion_menu NUMBER(19) NOT NULL,
	codigo_opcion_menu VARCHAR2(60) NOT NULL,
	nombre_opcion_menu VARCHAR2(200),
	descripcion_opcion_menu VARCHAR2(4000),
	url_opcion_menu VARCHAR2(4000),
	id_aplicacion NUMBER(19),
	id_pagina NUMBER(19),
	id_opcion_menu_superior NUMBER(19),
	numero_tipo_nodo NUMBER(10),
	numero_nivel_opcion_menu NUMBER(10),
	secuencia_opcion_menu NUMBER(10),
	clave_opcion_menu VARCHAR2(60),
	es_opcion_menu_inactiva NUMBER(10) NOT NULL,
	es_opcion_menu_sincronizada NUMBER(10) NOT NULL
	);
	
CREATE TABLE opcion_menu_plus
	(
	id_opcion_menu NUMBER(19) NOT NULL,
	version_opcion_menu NUMBER(19) NOT NULL,
	numero_tipo_nodo NUMBER(10) NOT NULL,
	numero_nivel_opcion_menu NUMBER(10) NOT NULL,
	codigo_nivel_opcion_menu VARCHAR2(60) NOT NULL,
	codigo_opcion_menu VARCHAR2(60) NOT NULL,
	nombre_opcion_menu VARCHAR2(200),
	clave_opcion_menu VARCHAR2(60) NOT NULL,
	codigo_nivel_opcion_menu_01 VARCHAR2(60),
	codigo_opcion_menu_01 VARCHAR2(60),
	nombre_opcion_menu_01 VARCHAR2(200),
	clave_opcion_menu_01 VARCHAR2(60),
	codigo_nivel_opcion_menu_02 VARCHAR2(60),
	codigo_opcion_menu_02 VARCHAR2(60),
	nombre_opcion_menu_02 VARCHAR2(200),
	clave_opcion_menu_02 VARCHAR2(60),
	codigo_nivel_opcion_menu_03 VARCHAR2(60),
	codigo_opcion_menu_03 VARCHAR2(60),
	nombre_opcion_menu_03 VARCHAR2(200),
	clave_opcion_menu_03 VARCHAR2(60),
	codigo_nivel_opcion_menu_04 VARCHAR2(60),
	codigo_opcion_menu_04 VARCHAR2(60),
	nombre_opcion_menu_04 VARCHAR2(200),
	clave_opcion_menu_04 VARCHAR2(60),
	codigo_nivel_opcion_menu_05 VARCHAR2(60),
	codigo_opcion_menu_05 VARCHAR2(60),
	nombre_opcion_menu_05 VARCHAR2(200),
	clave_opcion_menu_05 VARCHAR2(60),
	codigo_nivel_opcion_menu_06 VARCHAR2(60),
	codigo_opcion_menu_06 VARCHAR2(60),
	nombre_opcion_menu_06 VARCHAR2(200),
	clave_opcion_menu_06 VARCHAR2(60),
	codigo_nivel_opcion_menu_07 VARCHAR2(60),
	codigo_opcion_menu_07 VARCHAR2(60),
	nombre_opcion_menu_07 VARCHAR2(200),
	clave_opcion_menu_07 VARCHAR2(60),
	codigo_nivel_opcion_menu_08 VARCHAR2(60),
	codigo_opcion_menu_08 VARCHAR2(60),
	nombre_opcion_menu_08 VARCHAR2(200),
	clave_opcion_menu_08 VARCHAR2(60),
	codigo_nivel_opcion_menu_09 VARCHAR2(60),
	codigo_opcion_menu_09 VARCHAR2(60),
	nombre_opcion_menu_09 VARCHAR2(200),
	clave_opcion_menu_09 VARCHAR2(60),
	codigo_nivel_opcion_menu_10 VARCHAR2(60),
	codigo_opcion_menu_10 VARCHAR2(60),
	nombre_opcion_menu_10 VARCHAR2(200),
	clave_opcion_menu_10 VARCHAR2(60),
	codigo_nivel_opcion_menu_11 VARCHAR2(60),
	codigo_opcion_menu_11 VARCHAR2(60),
	nombre_opcion_menu_11 VARCHAR2(200),
	clave_opcion_menu_11 VARCHAR2(60),
	codigo_nivel_opcion_menu_12 VARCHAR2(60),
	codigo_opcion_menu_12 VARCHAR2(60),
	nombre_opcion_menu_12 VARCHAR2(200),
	clave_opcion_menu_12 VARCHAR2(60),
	codigo_nivel_opcion_menu_13 VARCHAR2(60),
	codigo_opcion_menu_13 VARCHAR2(60),
	nombre_opcion_menu_13 VARCHAR2(200),
	clave_opcion_menu_13 VARCHAR2(60),
	codigo_nivel_opcion_menu_14 VARCHAR2(60),
	codigo_opcion_menu_14 VARCHAR2(60),
	nombre_opcion_menu_14 VARCHAR2(200),
	clave_opcion_menu_14 VARCHAR2(60),
	codigo_nivel_opcion_menu_15 VARCHAR2(60),
	codigo_opcion_menu_15 VARCHAR2(60),
	nombre_opcion_menu_15 VARCHAR2(200),
	clave_opcion_menu_15 VARCHAR2(60)
	);
	
CREATE TABLE opcion_sistema
	(
	id_opcion_sistema NUMBER(19) NOT NULL,
	version_opcion_sistema NUMBER(19) NOT NULL,
	clave_opcion_sistema VARCHAR2(200) NOT NULL,
	valor_opcion_sistema VARCHAR2(200) NOT NULL,
	significado_opcion_sistema VARCHAR2(4000)
	);
	
CREATE TABLE operador_com
	(
	numero_operador_com NUMBER(10) NOT NULL,
	codigo_operador_com VARCHAR2(60) NOT NULL
	);
	
CREATE TABLE pagina
	(
	id_pagina NUMBER(19) NOT NULL,
	version_pagina NUMBER(19) NOT NULL,
	codigo_pagina VARCHAR2(200) NOT NULL,
	nombre_pagina VARCHAR2(200),
	descripcion_pagina VARCHAR2(4000),
	url_pagina VARCHAR2(4000),
	id_aplicacion NUMBER(19) NOT NULL,
	es_publica NUMBER(10) NOT NULL,
	numero_tipo_pagina NUMBER(10),
	id_dominio NUMBER(19),
	id_dominio_maestro NUMBER(19),
	id_parametro NUMBER(19)
	);
	
CREATE TABLE pagina_funcion
	(
	id_pagina_funcion NUMBER(19) NOT NULL,
	version_pagina_funcion NUMBER(19) NOT NULL,
	id_pagina NUMBER(19) NOT NULL,
	id_funcion NUMBER(19) NOT NULL,
	es_funcion_inicial NUMBER(10) NOT NULL,
	control_pagina_funcion VARCHAR2(200)
	);
	
CREATE TABLE pagina_usuario
	(
	id_pagina_usuario NUMBER(19) NOT NULL,
	version_pagina_usuario NUMBER(19) NOT NULL,
	id_pagina NUMBER(19) NOT NULL,
	id_usuario NUMBER(19) NOT NULL
	);
	
CREATE TABLE paquete
	(
	id_paquete NUMBER(19) NOT NULL,
	version_paquete NUMBER(19) NOT NULL,
	codigo_paquete VARCHAR2(60) NOT NULL
	);
	
CREATE TABLE parametro
	(
	id_parametro NUMBER(19) NOT NULL,
	version_parametro NUMBER(19) NOT NULL,
	codigo_parametro VARCHAR2(200) NOT NULL,
	nombre_parametro VARCHAR2(200) NOT NULL,
	detalle_parametro VARCHAR2(200),
	descripcion_parametro VARCHAR2(4000),
	numero_tipo_dato_par NUMBER(10) NOT NULL,
	alias_parametro VARCHAR2(200)
	);
	
CREATE TABLE parametro_global
	(
	numero_parametro_global NUMBER(10) NOT NULL,
	codigo_parametro_global VARCHAR2(60) NOT NULL,
	monto_salario_minimo NUMBER(16,2) NOT NULL,
	porcentaje_pension_alimentaria NUMBER(7,4) NOT NULL,
	es_control_cer_vida_activo NUMBER(10) NOT NULL,
	meses_validez_certificado_vida NUMBER(10) NOT NULL,
	es_control_cobro_pension_activ NUMBER(10) NOT NULL,
	meses_ultimo_cobro_pension NUMBER(10) NOT NULL,
	es_control_reproceso_pen_activ NUMBER(10) NOT NULL,
	limite_indice_calidad_vida NUMBER(7,4) NOT NULL,
	limite_pensiones NUMBER(10) NOT NULL
	);
	
CREATE TABLE persona
	(
	id_persona NUMBER(19) NOT NULL,
	version_persona NUMBER(19) NOT NULL,
	codigo_persona VARCHAR2(60) NOT NULL,
	nombre_persona VARCHAR2(200) NOT NULL,
	numero_cedula NUMBER(10),
	letra_cedula VARCHAR2(2),
	fecha_expedicion_cedula DATE,
	fecha_vencimiento_cedula DATE,
	primer_nombre VARCHAR2(60),
	segundo_nombre VARCHAR2(60),
	primer_apellido VARCHAR2(60),
	segundo_apellido VARCHAR2(60),
	apellido_casada VARCHAR2(60),
	apodo VARCHAR2(60),
	fecha_nacimiento DATE,
	numero_sexo_persona NUMBER(10),
	numero_estado_civil NUMBER(10),
	es_paraguayo_natural NUMBER(10) NOT NULL,
	es_indigena NUMBER(10) NOT NULL,
	id_etnia_indigena NUMBER(19),
	nombre_comunidad_indigena VARCHAR2(200),
	id_departamento NUMBER(19),
	id_distrito NUMBER(19),
	numero_tipo_area NUMBER(10),
	id_barrio NUMBER(19),
	id_manzana NUMBER(19),
	manzana VARCHAR2(60),
	direccion VARCHAR2(4000),
	numero_telefono_linea_baja VARCHAR2(100),
	numero_telefono_celular VARCHAR2(100),
	certificado_vida VARCHAR2(60),
	fecha_certificado_vida DATE,
	es_certificado_vida_anulado NUMBER(10) NOT NULL,
	comentarios_anul_cer_vida VARCHAR2(4000),
	certificado_defuncion VARCHAR2(60),
	fecha_certificado_defuncion DATE,
	es_cer_defuncion_anulado NUMBER(10) NOT NULL,
	comentarios_anul_cer_defuncion VARCHAR2(4000),
	es_persona_con_empleo NUMBER(10) NOT NULL,
	es_persona_con_jubilacion NUMBER(10) NOT NULL,
	es_persona_con_pension NUMBER(10) NOT NULL,
	es_persona_con_subsidio NUMBER(10) NOT NULL,
	es_persona_con_deuda NUMBER(10) NOT NULL,
	es_persona_con_pena_judicial NUMBER(10) NOT NULL,
	es_persona_con_cer_vida NUMBER(10) NOT NULL,
	es_persona_con_carta_renuncia NUMBER(10) NOT NULL,
	es_persona_elegible_para_pen NUMBER(10) NOT NULL,
	es_persona_acreditada_para_pen NUMBER(10) NOT NULL,
	monto_pension NUMBER(16,2),
	numero_condicion_pension NUMBER(10),
	lugar_solicitud_pension VARCHAR2(200),
	fecha_solicitud_pension DATE,
	comentarios_solicitud_pension VARCHAR2(4000),
	fecha_aprobacion_pension DATE,
	comentarios_aprobacion_pension VARCHAR2(4000),
	fecha_otorgamiento_pen DATE,
	comentarios_otorgamiento_pen VARCHAR2(4000),
	fecha_denegacion_pension DATE,
	numero_causa_den_pension NUMBER(10),
	otra_causa_den_pension VARCHAR2(200),
	comentarios_denegacion_pension VARCHAR2(4000),
	fecha_revocacion_pension DATE,
	numero_causa_rev_pension NUMBER(10),
	otra_causa_rev_pension VARCHAR2(200),
	comentarios_revocacion_pension VARCHAR2(4000),
	numero_condicion_reco_pen NUMBER(10),
	fecha_solicitud_reco_pen DATE,
	comentarios_solicitud_reco_pen VARCHAR2(4000),
	fecha_aprobacion_reco_pen DATE,
	comentarios_apr_reco_pen VARCHAR2(4000),
	fecha_denegacion_reco_pen DATE,
	numero_causa_den_reco_pen NUMBER(10),
	otra_causa_den_reco_pen VARCHAR2(200),
	comentarios_den_reco_pen VARCHAR2(4000),
	numero_condicion_denu_pen NUMBER(10),
	fecha_registro_denuncia_pen DATE,
	comentarios_registro_denu_pen VARCHAR2(4000),
	fecha_confirmacion_denu_pen DATE,
	comentarios_conf_denu_pen VARCHAR2(4000),
	fecha_desmentido_denuncia_pen DATE,
	comentarios_des_denu_pen VARCHAR2(4000),
	id_ficha_persona NUMBER(19),
	fecha_ficha_persona DATE,
	indice_calidad_vida NUMBER(7,4),
	fecha_ultimo_cobro_pension DATE,
	notas_anul_fec_ult_cob_pen VARCHAR2(4000),
	numero_tipo_act_jupe NUMBER(10),
	fecha_hora_ult_act_jupe DATE,
	numero_resolucion_otor_pen VARCHAR2(100),
	fecha_resolucion_otor_pen DATE
	);
	
CREATE TABLE potencial_ben
	(
	id_potencial_ben NUMBER(19) NOT NULL,
	version_potencial_ben NUMBER(19) NOT NULL,
	codigo_potencial_ben VARCHAR2(60) NOT NULL,
	nombre_potencial_ben VARCHAR2(200) NOT NULL,
	numero_tipo_reg_pot_ben NUMBER(10) NOT NULL,
	id_persona NUMBER(19),
	numero_cedula NUMBER(10),
	letra_cedula VARCHAR2(2),
	fecha_expedicion_cedula DATE,
	fecha_vencimiento_cedula DATE,
	primer_nombre VARCHAR2(60),
	segundo_nombre VARCHAR2(60),
	primer_apellido VARCHAR2(60),
	segundo_apellido VARCHAR2(60),
	apellido_casada VARCHAR2(60),
	apodo VARCHAR2(60),
	fecha_nacimiento DATE,
	edad NUMBER(10),
	es_paraguayo_natural NUMBER(10) NOT NULL,
	es_indigena NUMBER(10) NOT NULL,
	id_etnia_indigena NUMBER(19),
	nombre_comunidad_indigena VARCHAR2(200),
	id_departamento NUMBER(19),
	id_distrito NUMBER(19),
	numero_tipo_area NUMBER(10),
	id_barrio NUMBER(19),
	id_manzana NUMBER(19),
	manzana VARCHAR2(60),
	direccion VARCHAR2(4000),
	nombre_responsable_hogar VARCHAR2(200),
	numero_telefono_resp_hogar VARCHAR2(100),
	es_persona_con_empleo NUMBER(10) NOT NULL,
	es_persona_con_jubilacion NUMBER(10) NOT NULL,
	es_persona_con_pension NUMBER(10) NOT NULL,
	es_persona_con_subsidio NUMBER(10) NOT NULL,
	es_persona_con_deuda NUMBER(10) NOT NULL,
	es_persona_con_pena_judicial NUMBER(10) NOT NULL,
	es_persona_con_cer_vida NUMBER(10) NOT NULL,
	es_persona_con_carta_renuncia NUMBER(10) NOT NULL,
	nombre_referente VARCHAR2(200),
	numero_telefono_referente VARCHAR2(100),
	numero_condicion_censo NUMBER(10),
	fecha_validacion_censo DATE,
	id_funcionario_validacion_cen NUMBER(19),
	numero_causa_inv_censo NUMBER(10),
	otra_causa_inv_censo VARCHAR2(200),
	comentarios_validacion_censo VARCHAR2(4000),
	id_ficha_persona NUMBER(19),
	numero_condicion_recl_cen NUMBER(10),
	fecha_reclamo_censo DATE,
	comentarios_reclamo_censo VARCHAR2(4000),
	fecha_aprobacion_reclamo_censo DATE,
	comentarios_apr_recl_cen VARCHAR2(4000),
	fecha_denegacion_reclamo_censo DATE,
	numero_causa_den_recl_cen NUMBER(10),
	otra_causa_den_recl_cen VARCHAR2(200),
	comentarios_den_recl_cen VARCHAR2(4000),
	fecha_registro_pot_ben DATE,
	es_potencial_ben_inactivo NUMBER(10) NOT NULL,
	fecha_ultima_visita_censo DATE,
	observaciones_ult_visita_cen VARCHAR2(4000),
	id_funcionario_ult_visita_cen NUMBER(19),
	referencia_direccion VARCHAR2(4000)
	);
	
CREATE TABLE proceso
	(
	id_proceso NUMBER(19) NOT NULL,
	version_proceso NUMBER(19) NOT NULL,
	codigo_proceso_proceso VARCHAR2(60) NOT NULL,
	nombre_proceso_proceso VARCHAR2(200) NOT NULL,
	fecha_hora_ultima_ejecucion DATE,
	numero_condicion_ultima_eje NUMBER(10)
	);
	
CREATE TABLE proveedor_dat_ext
	(
	id_proveedor_dat_ext NUMBER(19) NOT NULL,
	version_proveedor_dat_ext NUMBER(19) NOT NULL,
	codigo_proveedor_dat_ext VARCHAR2(60) NOT NULL,
	nombre_proveedor_dat_ext VARCHAR2(200) NOT NULL
	);
	
CREATE TABLE rastro_funcion
	(
	id_rastro_funcion NUMBER(19) NOT NULL,
	fecha_hora_ejecucion DATE NOT NULL,
	id_usuario NUMBER(19) NOT NULL,
	id_funcion NUMBER(19) NOT NULL,
	id_recurso NUMBER(19),
	version_recurso NUMBER(19),
	codigo_recurso VARCHAR2(200),
	nombre_recurso VARCHAR2(200),
	id_propietario_recurso NUMBER(19),
	id_segmento_recurso NUMBER(19),
	numero_error NUMBER(10),
	descripcion_error VARCHAR2(4000)
	);
	
CREATE TABLE rastro_funcion_par
	(
	id_rastro_funcion_par NUMBER(19) NOT NULL,
	id_rastro_funcion NUMBER(19) NOT NULL,
	id_parametro NUMBER(19) NOT NULL,
	valor_parametro VARCHAR2(200)
	);
	
CREATE TABLE rastro_informe
	(
	id_rastro_informe NUMBER(19) NOT NULL,
	version_rastro_informe NUMBER(19) NOT NULL,
	fecha_hora_inicio_ejecucion DATE NOT NULL,
	fecha_hora_fin_ejecucion DATE,
	id_usuario NUMBER(19) NOT NULL,
	id_funcion NUMBER(19) NOT NULL,
	numero_condicion_eje_fun NUMBER(10) NOT NULL,
	nombre_archivo VARCHAR2(200),
	descripcion_error VARCHAR2(4000)
	);
	
CREATE TABLE rastro_proceso
	(
	id_rastro_proceso NUMBER(19) NOT NULL,
	version_rastro_proceso NUMBER(19) NOT NULL,
	fecha_hora_inicio_ejecucion DATE NOT NULL,
	fecha_hora_fin_ejecucion DATE,
	id_usuario NUMBER(19) NOT NULL,
	id_funcion NUMBER(19) NOT NULL,
	numero_condicion_eje_fun NUMBER(10) NOT NULL,
	nombre_archivo VARCHAR2(200),
	descripcion_error VARCHAR2(4000),
	id_grupo_proceso NUMBER(19),
	id_rastro_proceso_superior NUMBER(19),
	subprocesos NUMBER(10) NOT NULL,
	subprocesos_pendientes NUMBER(10) NOT NULL,
	subprocesos_en_progreso NUMBER(10) NOT NULL,
	subprocesos_sin_errores NUMBER(10) NOT NULL,
	subprocesos_con_errores NUMBER(10) NOT NULL,
	subprocesos_cancelados NUMBER(10) NOT NULL,
	procedimiento_after_update VARCHAR2(200)
	);
	
CREATE TABLE recurso
	(
	id_recurso NUMBER(19) NOT NULL,
	version_recurso NUMBER(19) NOT NULL,
	codigo_recurso VARCHAR2(60) NOT NULL,
	nombre_recurso VARCHAR2(200) NOT NULL,
	id_propietario_recurso NUMBER(19) NOT NULL,
	id_segmento_recurso NUMBER(19) NOT NULL,
	id_recurso_superior NUMBER(19) NOT NULL,
	id_recurso_maestro NUMBER(19) NOT NULL,
	es_recurso_inactivo NUMBER(10) NOT NULL,
	numero_recurso NUMBER(10) NOT NULL
	);
	
CREATE TABLE rol
	(
	id_rol NUMBER(19) NOT NULL,
	version_rol NUMBER(19) NOT NULL,
	codigo_rol VARCHAR2(200) NOT NULL,
	nombre_rol VARCHAR2(200),
	descripcion_rol VARCHAR2(4000),
	numero_tipo_rol NUMBER(10),
	id_grupo_aplicacion NUMBER(19)
	);
	
CREATE TABLE rol_aplicacion
	(
	id_rol_aplicacion NUMBER(19) NOT NULL,
	version_rol_aplicacion NUMBER(19) NOT NULL,
	id_rol NUMBER(19) NOT NULL,
	id_aplicacion NUMBER(19) NOT NULL
	);
	
CREATE TABLE rol_filtro_funcion
	(
	id_rol_filtro_funcion NUMBER(19) NOT NULL,
	version_rol_filtro_funcion NUMBER(19) NOT NULL,
	id_rol NUMBER(19) NOT NULL,
	id_filtro_funcion NUMBER(19) NOT NULL
	);
	
CREATE TABLE rol_funcion
	(
	id_rol_funcion NUMBER(19) NOT NULL,
	version_rol_funcion NUMBER(19) NOT NULL,
	id_rol NUMBER(19) NOT NULL,
	id_funcion NUMBER(19) NOT NULL,
	id_conjunto_segmento NUMBER(19)
	);
	
CREATE TABLE rol_pagina
	(
	id_rol_pagina NUMBER(19) NOT NULL,
	version_rol_pagina NUMBER(19) NOT NULL,
	id_rol NUMBER(19) NOT NULL,
	id_pagina NUMBER(19) NOT NULL
	);
	
CREATE TABLE rol_usuario
	(
	id_rol_usuario NUMBER(19) NOT NULL,
	version_rol_usuario NUMBER(19) NOT NULL,
	id_rol NUMBER(19) NOT NULL,
	id_usuario NUMBER(19) NOT NULL
	);
	
CREATE TABLE sexo_persona
	(
	numero_sexo_persona NUMBER(10) NOT NULL,
	codigo_sexo_persona VARCHAR2(60) NOT NULL
	);
	
CREATE TABLE siono
	(
	numero_siono NUMBER(10) NOT NULL,
	codigo_siono VARCHAR2(60) NOT NULL
	);
	
CREATE TABLE tipo_aba_agua
	(
	numero_tipo_aba_agua NUMBER(10) NOT NULL,
	codigo_tipo_aba_agua VARCHAR2(60) NOT NULL
	);
	
CREATE TABLE tipo_act_jupe
	(
	numero_tipo_act_jupe NUMBER(10) NOT NULL,
	codigo_tipo_act_jupe VARCHAR2(60) NOT NULL
	);
	
CREATE TABLE tipo_arc_dat_ext
	(
	numero_tipo_arc_dat_ext NUMBER(10) NOT NULL,
	codigo_tipo_arc_dat_ext VARCHAR2(60) NOT NULL
	);
	
CREATE TABLE tipo_area
	(
	numero_tipo_area NUMBER(10) NOT NULL,
	codigo_tipo_area VARCHAR2(60) NOT NULL
	);
	
CREATE TABLE tipo_clase_recurso
	(
	numero_tipo_clase_recurso NUMBER(10) NOT NULL,
	codigo_tipo_clase_recurso VARCHAR2(60) NOT NULL
	);
	
CREATE TABLE tipo_combustible
	(
	numero_tipo_combustible NUMBER(10) NOT NULL,
	codigo_tipo_combustible VARCHAR2(60) NOT NULL
	);
	
CREATE TABLE tipo_comparacion
	(
	numero_tipo_comparacion NUMBER(10) NOT NULL,
	codigo_tipo_comparacion VARCHAR2(60) NOT NULL
	);
	
CREATE TABLE tipo_dato_par
	(
	numero_tipo_dato_par NUMBER(10) NOT NULL,
	codigo_tipo_dato_par VARCHAR2(60) NOT NULL
	);
	
CREATE TABLE tipo_desecho_bas
	(
	numero_tipo_desecho_bas NUMBER(10) NOT NULL,
	codigo_tipo_desecho_bas VARCHAR2(60) NOT NULL
	);
	
CREATE TABLE tipo_dominio
	(
	numero_tipo_dominio NUMBER(10) NOT NULL,
	codigo_tipo_dominio VARCHAR2(60) NOT NULL
	);
	
CREATE TABLE tipo_excepcion_ced
	(
	numero_tipo_excepcion_ced NUMBER(10) NOT NULL,
	codigo_tipo_excepcion_ced VARCHAR2(60) NOT NULL
	);
	
CREATE TABLE tipo_funcion
	(
	numero_tipo_funcion NUMBER(10) NOT NULL,
	codigo_tipo_funcion VARCHAR2(60) NOT NULL
	);
	
CREATE TABLE tipo_mat_paredes
	(
	numero_tipo_mat_paredes NUMBER(10) NOT NULL,
	codigo_tipo_mat_paredes VARCHAR2(60) NOT NULL
	);
	
CREATE TABLE tipo_mat_piso
	(
	numero_tipo_mat_piso NUMBER(10) NOT NULL,
	codigo_tipo_mat_piso VARCHAR2(60) NOT NULL
	);
	
CREATE TABLE tipo_mat_techo
	(
	numero_tipo_mat_techo NUMBER(10) NOT NULL,
	codigo_tipo_mat_techo VARCHAR2(60) NOT NULL
	);
	
CREATE TABLE tipo_nodo
	(
	numero_tipo_nodo NUMBER(10) NOT NULL,
	codigo_tipo_nodo VARCHAR2(60) NOT NULL
	);
	
CREATE TABLE tipo_obj_ele_pen
	(
	numero_tipo_obj_ele_pen NUMBER(10) NOT NULL,
	codigo_tipo_obj_ele_pen VARCHAR2(60) NOT NULL
	);
	
CREATE TABLE tipo_ocupacion_viv
	(
	numero_tipo_ocupacion_viv NUMBER(10) NOT NULL,
	codigo_tipo_ocupacion_viv VARCHAR2(60) NOT NULL
	);
	
CREATE TABLE tipo_pagina
	(
	numero_tipo_pagina NUMBER(10) NOT NULL,
	codigo_tipo_pagina VARCHAR2(60) NOT NULL
	);
	
CREATE TABLE tipo_parametro
	(
	numero_tipo_parametro NUMBER(10) NOT NULL,
	codigo_tipo_parametro VARCHAR2(60) NOT NULL
	);
	
CREATE TABLE tipo_parametro_dom
	(
	numero_tipo_parametro_dom NUMBER(10) NOT NULL,
	codigo_tipo_parametro_dom VARCHAR2(60) NOT NULL,
	codigo_propiedad_interfaz VARCHAR2(60) NOT NULL,
	nombre_interfaz VARCHAR2(200) NOT NULL,
	etiqueta_parametro VARCHAR2(60) NOT NULL
	);
	
CREATE TABLE tipo_persona_hogar
	(
	numero_tipo_persona_hogar NUMBER(10) NOT NULL,
	codigo_tipo_persona_hogar VARCHAR2(60) NOT NULL
	);
	
CREATE TABLE tipo_pieza_bano
	(
	numero_tipo_pieza_bano NUMBER(10) NOT NULL,
	codigo_tipo_pieza_bano VARCHAR2(60) NOT NULL
	);
	
CREATE TABLE tipo_rastro_fun
	(
	numero_tipo_rastro_fun NUMBER(10) NOT NULL,
	codigo_tipo_rastro_fun VARCHAR2(60) NOT NULL
	);
	
CREATE TABLE tipo_recurso
	(
	numero_tipo_recurso NUMBER(10) NOT NULL,
	codigo_tipo_recurso VARCHAR2(60) NOT NULL
	);
	
CREATE TABLE tipo_reg_pot_ben
	(
	numero_tipo_reg_pot_ben NUMBER(10) NOT NULL,
	codigo_tipo_reg_pot_ben VARCHAR2(60) NOT NULL
	);
	
CREATE TABLE tipo_relacion_lab
	(
	numero_tipo_relacion_lab NUMBER(10) NOT NULL,
	codigo_tipo_relacion_lab VARCHAR2(60) NOT NULL
	);
	
CREATE TABLE tipo_rol
	(
	numero_tipo_rol NUMBER(10) NOT NULL,
	codigo_tipo_rol VARCHAR2(60) NOT NULL
	);
	
CREATE TABLE tipo_seguro_medico
	(
	numero_tipo_seguro_medico NUMBER(10) NOT NULL,
	codigo_tipo_seguro_medico VARCHAR2(60) NOT NULL
	);
	
CREATE TABLE tipo_servicio_agua
	(
	numero_tipo_servicio_agua NUMBER(10) NOT NULL,
	codigo_tipo_servicio_agua VARCHAR2(60) NOT NULL
	);
	
CREATE TABLE tipo_servicio_san
	(
	numero_tipo_servicio_san NUMBER(10) NOT NULL,
	codigo_tipo_servicio_san VARCHAR2(60) NOT NULL
	);
	
CREATE TABLE tipo_valor
	(
	numero_tipo_valor NUMBER(10) NOT NULL,
	codigo_tipo_valor VARCHAR2(60) NOT NULL
	);
	
CREATE TABLE ubicacion
	(
	id_ubicacion NUMBER(19) NOT NULL,
	version_ubicacion NUMBER(19) NOT NULL,
	codigo_ubicacion VARCHAR2(60) NOT NULL,
	nombre_ubicacion VARCHAR2(200) NOT NULL,
	id_ubicacion_superior NUMBER(19),
	numero_tipo_nodo NUMBER(10),
	numero_nivel_ubicacion NUMBER(10),
	secuencia_ubicacion NUMBER(10),
	clave_ubicacion VARCHAR2(60),
	numero_tipo_area NUMBER(10)
	);
	
CREATE TABLE ubicacion_plus
	(
	id_ubicacion NUMBER(19) NOT NULL,
	version_ubicacion NUMBER(19) NOT NULL,
	numero_tipo_nodo NUMBER(10) NOT NULL,
	numero_nivel_ubicacion NUMBER(10) NOT NULL,
	codigo_nivel_ubicacion VARCHAR2(60) NOT NULL,
	codigo_ubicacion VARCHAR2(60) NOT NULL,
	nombre_ubicacion VARCHAR2(200),
	clave_ubicacion VARCHAR2(60) NOT NULL,
	codigo_nivel_ubicacion_01 VARCHAR2(60),
	codigo_ubicacion_01 VARCHAR2(60),
	nombre_ubicacion_01 VARCHAR2(200),
	clave_ubicacion_01 VARCHAR2(60),
	codigo_nivel_ubicacion_02 VARCHAR2(60),
	codigo_ubicacion_02 VARCHAR2(60),
	nombre_ubicacion_02 VARCHAR2(200),
	clave_ubicacion_02 VARCHAR2(60),
	codigo_nivel_ubicacion_03 VARCHAR2(60),
	codigo_ubicacion_03 VARCHAR2(60),
	nombre_ubicacion_03 VARCHAR2(200),
	clave_ubicacion_03 VARCHAR2(60),
	codigo_nivel_ubicacion_04 VARCHAR2(60),
	codigo_ubicacion_04 VARCHAR2(60),
	nombre_ubicacion_04 VARCHAR2(200),
	clave_ubicacion_04 VARCHAR2(60),
	codigo_nivel_ubicacion_05 VARCHAR2(60),
	codigo_ubicacion_05 VARCHAR2(60),
	nombre_ubicacion_05 VARCHAR2(200),
	clave_ubicacion_05 VARCHAR2(60),
	codigo_nivel_ubicacion_06 VARCHAR2(60),
	codigo_ubicacion_06 VARCHAR2(60),
	nombre_ubicacion_06 VARCHAR2(200),
	clave_ubicacion_06 VARCHAR2(60),
	codigo_nivel_ubicacion_07 VARCHAR2(60),
	codigo_ubicacion_07 VARCHAR2(60),
	nombre_ubicacion_07 VARCHAR2(200),
	clave_ubicacion_07 VARCHAR2(60),
	codigo_nivel_ubicacion_08 VARCHAR2(60),
	codigo_ubicacion_08 VARCHAR2(60),
	nombre_ubicacion_08 VARCHAR2(200),
	clave_ubicacion_08 VARCHAR2(60),
	codigo_nivel_ubicacion_09 VARCHAR2(60),
	codigo_ubicacion_09 VARCHAR2(60),
	nombre_ubicacion_09 VARCHAR2(200),
	clave_ubicacion_09 VARCHAR2(60),
	codigo_nivel_ubicacion_10 VARCHAR2(60),
	codigo_ubicacion_10 VARCHAR2(60),
	nombre_ubicacion_10 VARCHAR2(200),
	clave_ubicacion_10 VARCHAR2(60),
	codigo_nivel_ubicacion_11 VARCHAR2(60),
	codigo_ubicacion_11 VARCHAR2(60),
	nombre_ubicacion_11 VARCHAR2(200),
	clave_ubicacion_11 VARCHAR2(60),
	codigo_nivel_ubicacion_12 VARCHAR2(60),
	codigo_ubicacion_12 VARCHAR2(60),
	nombre_ubicacion_12 VARCHAR2(200),
	clave_ubicacion_12 VARCHAR2(60),
	codigo_nivel_ubicacion_13 VARCHAR2(60),
	codigo_ubicacion_13 VARCHAR2(60),
	nombre_ubicacion_13 VARCHAR2(200),
	clave_ubicacion_13 VARCHAR2(60),
	codigo_nivel_ubicacion_14 VARCHAR2(60),
	codigo_ubicacion_14 VARCHAR2(60),
	nombre_ubicacion_14 VARCHAR2(200),
	clave_ubicacion_14 VARCHAR2(60),
	codigo_nivel_ubicacion_15 VARCHAR2(60),
	codigo_ubicacion_15 VARCHAR2(60),
	nombre_ubicacion_15 VARCHAR2(200),
	clave_ubicacion_15 VARCHAR2(60)
	);
	
CREATE TABLE usuario
	(
	id_usuario NUMBER(19) NOT NULL,
	version_usuario NUMBER(19) NOT NULL,
	codigo_usuario VARCHAR2(60) NOT NULL,
	nombre_usuario VARCHAR2(200),
	password_usuario VARCHAR2(200),
	correo_electronico VARCHAR2(200),
	id_usuario_supervisor NUMBER(19),
	es_super_usuario NUMBER(10) NOT NULL,
	es_usuario_especial NUMBER(10) NOT NULL,
	es_usuario_inactivo NUMBER(10) NOT NULL,
	es_usuario_modificado NUMBER(10) NOT NULL
	);
	
CREATE TABLE visita_censo
	(
	id_visita_censo NUMBER(19) NOT NULL,
	version_visita_censo NUMBER(19) NOT NULL,
	id_potencial_ben NUMBER(19) NOT NULL,
	id_funcionario_censista NUMBER(19) NOT NULL,
	fecha_visita DATE NOT NULL,
	observaciones VARCHAR2(4000)
	);
	
