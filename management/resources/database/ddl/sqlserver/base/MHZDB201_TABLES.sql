CREATE TABLE aplicacion
	(
	id_aplicacion bigint NOT NULL,
	version_aplicacion bigint NOT NULL,
	codigo_aplicacion varchar(100) NOT NULL,
	nombre_aplicacion varchar(100),
	descripcion_aplicacion varchar(256),
	servidor_aplicacion varchar(100) NOT NULL,
	puerto_aplicacion varchar(10) NOT NULL,
	url_aplicacion varchar(256),
	es_publica int NOT NULL,
	id_grupo_aplicacion bigint
	)
	ON [PRIMARY]
GO

CREATE TABLE archivo_datos_ext
	(
	id_archivo_datos_ext bigint NOT NULL,
	version_archivo_datos_ext bigint NOT NULL,
	codigo_archivo_datos_ext varchar(100) NOT NULL,
	nombre_archivo_datos_ext varchar(100),
	id_proveedor_dat_ext bigint NOT NULL,
	numero_tipo_arc_dat_ext int NOT NULL,
	objeto_archivo_datos_ext varchar(256),
	bytes_archivo_datos_ext int,
	es_archivo_datos_ext_importado int NOT NULL,
	es_archivo_datos_ext_inactivo int NOT NULL,
	fecha_hora_ultima_carga datetime,
	id_usuario_ultima_carga bigint,
	fecha_hora_ultima_importacion datetime,
	id_usuario_ultima_importacion bigint
	)
	ON [PRIMARY]
GO

CREATE TABLE causa_den_pension
	(
	numero_causa_den_pension int NOT NULL,
	codigo_causa_den_pension varchar(30) NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE causa_den_recl_cen
	(
	numero_causa_den_recl_cen int NOT NULL,
	codigo_causa_den_recl_cen varchar(30) NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE causa_den_reco_pen
	(
	numero_causa_den_reco_pen int NOT NULL,
	codigo_causa_den_reco_pen varchar(30) NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE causa_impedimento
	(
	numero_causa_impedimento int NOT NULL,
	codigo_causa_impedimento varchar(100) NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE causa_inv_censo
	(
	numero_causa_inv_censo int NOT NULL,
	codigo_causa_inv_censo varchar(30) NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE causa_rev_pension
	(
	numero_causa_rev_pension int NOT NULL,
	codigo_causa_rev_pension varchar(30) NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE clase_enf_acc
	(
	numero_clase_enf_acc int NOT NULL,
	codigo_clase_enf_acc varchar(100) NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE clase_enf_cronica
	(
	numero_clase_enf_cronica int NOT NULL,
	codigo_clase_enf_cronica varchar(100) NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE clase_impedimento
	(
	numero_clase_impedimento int NOT NULL,
	codigo_clase_impedimento varchar(100) NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE clase_recurso
	(
	id_clase_recurso bigint NOT NULL,
	version_clase_recurso bigint NOT NULL,
	codigo_clase_recurso varchar(100) NOT NULL,
	nombre_clase_recurso varchar(100),
	descripcion_clase_recurso varchar(256),
	es_clase_recurso_independiente int NOT NULL,
	es_clase_recurso_sin_detalle int NOT NULL,
	es_clase_recurso_con_arbol int NOT NULL,
	numero_tipo_clase_recurso int NOT NULL,
	numero_tipo_recurso int NOT NULL,
	id_funcion_seleccion bigint,
	id_pagina_seleccion bigint,
	id_pagina_detalle bigint,
	id_clase_recurso_maestro bigint,
	id_clase_recurso_segmento bigint,
	id_clase_recurso_base bigint,
	id_grupo_aplicacion bigint,
	id_aplicacion_web bigint,
	limite_filas_consulta int,
	limite_filas_informe int,
	orden_presentacion int,
	es_clase_recurso_insertable int NOT NULL,
	es_clase_recurso_modificable int NOT NULL,
	es_clase_recurso_eliminable int NOT NULL,
	es_clase_recurso_extendida int NOT NULL,
	etiqueta_hipervinculo varchar(20),
	es_enumerador_con_numero int NOT NULL,
	alias_clase_recurso varchar(100)
	)
	ON [PRIMARY]
GO

CREATE TABLE clase_recurso_par
	(
	id_clase_recurso_par bigint NOT NULL,
	version_clase_recurso_par bigint NOT NULL,
	id_clase_recurso bigint NOT NULL,
	id_parametro bigint NOT NULL,
	numero_tipo_parametro int NOT NULL,
	numero_tipo_comparacion int,
	id_funcion_referencia bigint,
	numero_tipo_valor int NOT NULL,
	id_lista_valor bigint,
	id_clase_objeto_valor bigint,
	id_clase_recurso_valor bigint,
	valor_minimo varchar(100),
	valor_maximo varchar(100),
	valor_omision varchar(100),
	es_parametro_omisible int NOT NULL,
	es_parametro_inmutable int NOT NULL,
	es_parametro_submit int NOT NULL,
	es_parametro_primordial int NOT NULL,
	es_parametro_maestro int NOT NULL,
	es_parametro_segmento int NOT NULL,
	es_parametro_sin_rastro int NOT NULL,
	es_parametro_sincronizado int NOT NULL,
	orden_presentacion int NOT NULL,
	id_clase_recurso_sec bigint,
	es_referencia_alternativa int NOT NULL,
	numero_tipo_valor_alternativo int,
	id_funcion_referencia_alt bigint,
	id_lista_valor_alternativa bigint,
	id_clase_objeto_valor_alt bigint,
	id_clase_recurso_valor_alt bigint,
	orden_pagina_seleccion int NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE clase_recurso_sec
	(
	id_clase_recurso_sec bigint NOT NULL,
	version_clase_recurso_sec bigint NOT NULL,
	id_clase_recurso bigint NOT NULL,
	etiqueta_clase_recurso_sec varchar(30) NOT NULL,
	descripcion_clase_recurso_sec varchar(256),
	orden_presentacion int NOT NULL,
	es_pestana_detalle int NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE condicion_censo
	(
	numero_condicion_censo int NOT NULL,
	codigo_condicion_censo varchar(30) NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE condicion_denu_pen
	(
	numero_condicion_denu_pen int NOT NULL,
	codigo_condicion_denu_pen varchar(30) NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE condicion_eje_fun
	(
	numero_condicion_eje_fun int NOT NULL,
	codigo_condicion_eje_fun varchar(30) NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE condicion_pension
	(
	numero_condicion_pension int NOT NULL,
	codigo_condicion_pension varchar(30) NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE condicion_recl_cen
	(
	numero_condicion_recl_cen int NOT NULL,
	codigo_condicion_recl_cen varchar(30) NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE condicion_reco_pen
	(
	numero_condicion_reco_pen int NOT NULL,
	codigo_condicion_reco_pen varchar(30) NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE conjunto_segmento
	(
	id_conjunto_segmento bigint NOT NULL,
	version_conjunto_segmento bigint NOT NULL,
	codigo_conjunto_segmento varchar(30) NOT NULL,
	nombre_conjunto_segmento varchar(100),
	descripcion_conjunto_segmento varchar(256),
	id_clase_recurso bigint NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE dominio
	(
	id_dominio bigint NOT NULL,
	version_dominio bigint NOT NULL,
	codigo_dominio varchar(100) NOT NULL,
	nombre_dominio varchar(100),
	descripcion_dominio varchar(256),
	nombre_tabla varchar(100),
	numero_tipo_dominio int NOT NULL,
	id_clase_recurso bigint NOT NULL,
	id_funcion_seleccion bigint,
	id_dominio_segmento bigint,
	id_paquete bigint
	)
	ON [PRIMARY]
GO

CREATE TABLE dominio_paquete
	(
	id_dominio_paquete bigint NOT NULL,
	version_dominio_paquete bigint NOT NULL,
	id_dominio bigint NOT NULL,
	id_paquete bigint NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE dominio_parametro
	(
	id_dominio_parametro bigint NOT NULL,
	version_dominio_parametro bigint NOT NULL,
	id_dominio bigint NOT NULL,
	id_parametro bigint NOT NULL,
	numero_tipo_parametro_dom int NOT NULL,
	etiqueta_parametro varchar(100)
	)
	ON [PRIMARY]
GO

CREATE TABLE elemento_segmento
	(
	id_elemento_segmento bigint NOT NULL,
	version_elemento_segmento bigint NOT NULL,
	id_conjunto_segmento bigint NOT NULL,
	id_segmento bigint NOT NULL,
	valor_segmento varchar(100),
	significado_segmento varchar(256)
	)
	ON [PRIMARY]
GO

CREATE TABLE estado_civil
	(
	numero_estado_civil int NOT NULL,
	codigo_estado_civil varchar(30) NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE estado_salud
	(
	numero_estado_salud int NOT NULL,
	codigo_estado_salud varchar(30) NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE etnia_indigena
	(
	id_etnia_indigena bigint NOT NULL,
	version_etnia_indigena bigint NOT NULL,
	codigo_etnia_indigena varchar(30) NOT NULL,
	nombre_etnia_indigena varchar(100),
	descripcion_etnia_indigena varchar(2000)
	)
	ON [PRIMARY]
GO

CREATE TABLE ficha_hogar
	(
	id_ficha_hogar bigint NOT NULL,
	version_ficha_hogar bigint NOT NULL,
	codigo_ficha_hogar varchar(30) NOT NULL,
	fecha_entrevista smalldatetime NOT NULL,
	id_funcionario_censista bigint,
	id_funcionario_supervisor bigint,
	id_funcionario_critico_deco bigint,
	id_funcionario_digitador bigint,
	observaciones varchar(256),
	huso_utm int,
	franja_utm char(1),
	distancia_este_utm int,
	distancia_norte_utm int,
	numero_formulario int NOT NULL,
	numero_vivienda int NOT NULL,
	numero_hogar int NOT NULL,
	id_departamento bigint,
	id_distrito bigint,
	numero_tipo_area int,
	id_barrio bigint,
	id_manzana bigint,
	manzana varchar(30),
	direccion varchar(256),
	total_personas int,
	total_hombres int,
	total_mujeres int,
	numero_tipo_mat_paredes int,
	numero_tipo_mat_piso int,
	numero_tipo_mat_techo int,
	numero_tipo_ocupacion_viv int,
	otro_tipo_ocupacion_viv varchar(100),
	cantidad_piezas int,
	cantidad_dormitorios int,
	numero_siono_pieza_cocina int,
	numero_tipo_combustible int,
	numero_tipo_pieza_bano int,
	numero_tipo_servicio_san int,
	numero_tipo_servicio_agua int,
	numero_tipo_aba_agua int,
	numero_siono_corriente_elec int,
	numero_tipo_desecho_bas int,
	numero_siono_telefono_celular int,
	numero_telefono_celular varchar(50),
	numero_siono_tlf_linea_baja int,
	numero_telefono_linea_baja varchar(50),
	numero_siono_disp_heladera int,
	numero_siono_disp_lavarropas int,
	numero_siono_disp_termo int,
	numero_siono_disp_aire_acon int,
	numero_siono_disp_automovil int,
	numero_siono_disp_camion int,
	numero_siono_disp_motocicleta int,
	nombre_jefe_hogar varchar(100),
	numero_cedula_jefe_hogar int,
	letra_cedula_jefe_hogar varchar(1),
	numero_orden_iden_jefe_hogar int,
	nombre_respondente varchar(100),
	numero_cedula_respondente int,
	letra_cedula_respondente varchar(1),
	numero_orden_iden_respondente int,
	id_proveedor_dat_ext bigint,
	indice_calidad_vida decimal(7,4),
	es_ficha_hogar_inactiva int NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE ficha_persona
	(
	id_ficha_persona bigint NOT NULL,
	version_ficha_persona bigint NOT NULL,
	codigo_ficha_persona varchar(30) NOT NULL,
	nombre_ficha_persona varchar(100) NOT NULL,
	es_respondente int NOT NULL,
	id_ficha_hogar bigint NOT NULL,
	numero_orden_identificacion int NOT NULL,
	primer_nombre varchar(30),
	segundo_nombre varchar(30),
	primer_apellido varchar(30),
	segundo_apellido varchar(30),
	apellido_casada varchar(30),
	apodo varchar(30),
	edad int,
	numero_sexo_persona int,
	numero_estado_civil int,
	numero_tipo_persona_hogar int NOT NULL,
	numero_siono_miembro_hogar int NOT NULL,
	numero_orden_iden_conyuge int,
	numero_orden_iden_padre int,
	numero_orden_iden_madre int,
	numero_cedula int,
	letra_cedula varchar(1),
	numero_tipo_excepcion_ced int,
	fecha_nacimiento smalldatetime,
	id_departamento_nacimiento bigint,
	id_distrito_nacimiento bigint,
	numero_tipo_area_lugar_nac int,
	numero_idioma_hogar int,
	otro_idioma_hogar varchar(100),
	numero_siono_asistencia_esc int,
	numero_motivo_ina_esc int,
	otro_motivo_ina_esc varchar(100),
	numero_siono_matriculacion_esc int,
	ultimo_curso_aprobado int,
	numero_nivel_edu_ult_cur_aprob int,
	numero_siono_curso_no_formal int,
	numero_tipo_seguro_medico int,
	numero_estado_salud int,
	numero_clase_enf_acc int,
	otra_clase_enf_acc varchar(100),
	numero_clase_enf_cronica int,
	otra_clase_enf_cronica varchar(100),
	numero_siono_atencion_medica int,
	numero_motivo_no_atencion int,
	otro_motivo_no_atencion varchar(100),
	numero_siono_carnet_vacunacion int,
	numero_clase_impedimento int,
	otra_clase_impedimento varchar(100),
	numero_causa_impedimento int,
	otra_causa_impedimento varchar(100),
	numero_siono_dif_para_caminar int,
	numero_siono_dif_para_vestirse int,
	numero_siono_dif_para_banarse int,
	numero_siono_dif_para_comer int,
	numero_siono_dif_para_la_cama int,
	numero_siono_dif_para_el_bano int,
	numero_siono_trabajo int,
	numero_motivo_no_trabajo int,
	otro_motivo_no_trabajo varchar(100),
	descripcion_ocupacion_prin varchar(100),
	descripcion_dedicacion_prin varchar(100),
	numero_tipo_relacion_lab int,
	monto_ingreso_ocupacion_prin decimal(16,2),
	monto_ingreso_ocupacion_secun decimal(16,2),
	monto_ingreso_otras_ocup decimal(16,2),
	monto_ingreso_alquileres decimal(16,2),
	monto_ingreso_intereses decimal(16,2),
	monto_ingreso_ayuda_fam_pais decimal(16,2),
	monto_ingreso_ayuda_fam_exter decimal(16,2),
	monto_ingreso_jubilacion decimal(16,2),
	monto_ingreso_pensiones decimal(16,2),
	monto_ingreso_tekopora decimal(16,2),
	monto_ingreso_programas decimal(16,2),
	monto_ingreso_adicional decimal(16,2),
	total_ingreso_mensual decimal(16,2),
	id_potencial_ben bigint,
	es_ficha_persona_inactiva int NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE filtro_cla_rec_fun
	(
	id_filtro_cla_rec_fun bigint NOT NULL,
	version_filtro_cla_rec_fun bigint NOT NULL,
	id_funcion bigint NOT NULL,
	id_clase_recurso_par_columna bigint NOT NULL,
	numero_operador_com int NOT NULL,
	id_clase_recurso_par_valor bigint,
	valor varchar(256)
	)
	ON [PRIMARY]
GO

CREATE TABLE filtro_cla_rec_par
	(
	id_filtro_cla_rec_par bigint NOT NULL,
	version_filtro_cla_rec_par bigint NOT NULL,
	id_clase_recurso_par bigint NOT NULL,
	id_clase_recurso_par_columna bigint NOT NULL,
	numero_operador_com int NOT NULL,
	id_clase_recurso_par_valor bigint,
	valor varchar(256)
	)
	ON [PRIMARY]
GO

CREATE TABLE filtro_cla_rec_sec
	(
	id_filtro_cla_rec_sec bigint NOT NULL,
	version_filtro_cla_rec_sec bigint NOT NULL,
	id_clase_recurso_sec bigint NOT NULL,
	id_clase_recurso_par_columna bigint NOT NULL,
	numero_operador_com int NOT NULL,
	id_clase_recurso_par_valor bigint,
	valor varchar(256)
	)
	ON [PRIMARY]
GO

CREATE TABLE filtro_cla_rec_vin
	(
	id_filtro_cla_rec_vin bigint NOT NULL,
	version_filtro_cla_rec_vin bigint NOT NULL,
	id_clase_recurso_par bigint NOT NULL,
	id_clase_recurso_par_columna bigint NOT NULL,
	numero_operador_com int NOT NULL,
	id_clase_recurso_par_valor bigint,
	valor varchar(256)
	)
	ON [PRIMARY]
GO

CREATE TABLE filtro_funcion
	(
	id_filtro_funcion bigint NOT NULL,
	version_filtro_funcion bigint NOT NULL,
	codigo_filtro_funcion varchar(100) NOT NULL,
	nombre_filtro_funcion varchar(100),
	descripcion_filtro_funcion varchar(256),
	id_funcion bigint NOT NULL,
	id_usuario bigint NOT NULL,
	es_publico int NOT NULL,
	id_filtro_funcion_original bigint
	)
	ON [PRIMARY]
GO

CREATE TABLE filtro_funcion_par
	(
	id_filtro_funcion_par bigint NOT NULL,
	version_filtro_funcion_par bigint NOT NULL,
	id_filtro_funcion bigint NOT NULL,
	id_funcion_parametro bigint NOT NULL,
	numero_operador_com int NOT NULL,
	id_valor_lista bigint,
	id_objeto_valor bigint,
	id_recurso_valor bigint,
	valor_parametro varchar(100),
	significado_parametro varchar(256)
	)
	ON [PRIMARY]
GO

CREATE TABLE funcion
	(
	id_funcion bigint NOT NULL,
	version_funcion bigint NOT NULL,
	codigo_funcion varchar(100) NOT NULL,
	nombre_funcion varchar(100),
	descripcion_funcion varchar(256),
	numero_tipo_funcion int NOT NULL,
	numero_tipo_rastro_fun int NOT NULL,
	id_dominio bigint,
	clausula_where varchar(256),
	clausula_order varchar(256),
	es_publica int NOT NULL,
	es_programatica int NOT NULL,
	es_personalizada int NOT NULL,
	es_segmentada int NOT NULL,
	id_grupo_proceso bigint
	)
	ON [PRIMARY]
GO

CREATE TABLE funcion_parametro
	(
	id_funcion_parametro bigint NOT NULL,
	version_funcion_parametro bigint NOT NULL,
	id_funcion bigint NOT NULL,
	id_parametro bigint NOT NULL,
	numero_tipo_parametro int NOT NULL,
	numero_tipo_comparacion int,
	id_funcion_referencia bigint,
	numero_tipo_valor int NOT NULL,
	id_lista_valor bigint,
	id_clase_objeto_valor bigint,
	id_clase_recurso_valor bigint,
	valor_minimo varchar(100),
	valor_maximo varchar(100),
	valor_omision varchar(100),
	es_parametro_sin_rastro int NOT NULL,
	es_parametro_segmento int NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE funcionario
	(
	id_funcionario bigint NOT NULL,
	version_funcionario bigint NOT NULL,
	codigo_funcionario varchar(30) NOT NULL,
	nombre_funcionario varchar(100) NOT NULL,
	numero_cedula int,
	letra_cedula varchar(1),
	primer_nombre varchar(30),
	segundo_nombre varchar(30),
	primer_apellido varchar(30),
	segundo_apellido varchar(30),
	apellido_casada varchar(30)
	)
	ON [PRIMARY]
GO

CREATE TABLE grupo_aplicacion
	(
	id_grupo_aplicacion bigint NOT NULL,
	version_grupo_aplicacion bigint NOT NULL,
	codigo_grupo_aplicacion varchar(30) NOT NULL,
	nombre_grupo_aplicacion varchar(100),
	descripcion_grupo_aplicacion varchar(256)
	)
	ON [PRIMARY]
GO

CREATE TABLE grupo_proceso
	(
	id_grupo_proceso bigint NOT NULL,
	version_grupo_proceso bigint NOT NULL,
	codigo_grupo_proceso varchar(30) NOT NULL,
	nombre_grupo_proceso varchar(100),
	descripcion_grupo_proceso varchar(256),
	id_rastro_proceso bigint,
	numero_condicion_eje_fun int
	)
	ON [PRIMARY]
GO

CREATE TABLE idioma_hogar
	(
	numero_idioma_hogar int NOT NULL,
	codigo_idioma_hogar varchar(30) NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE informe
	(
	id_informe bigint NOT NULL,
	version_informe bigint NOT NULL,
	codigo_informe varchar(30) NOT NULL,
	nombre_informe varchar(100) NOT NULL,
	fecha_transaccion smalldatetime
	)
	ON [PRIMARY]
GO

CREATE TABLE log_imp_cen
	(
	id_log_imp_cen bigint NOT NULL,
	version_log_imp_cen bigint NOT NULL,
	orden varchar(256),
	barrio varchar(256),
	direccion varchar(256),
	telefono varchar(256),
	primer_nombre varchar(256),
	segundo_nombre varchar(256),
	primer_apellido varchar(256),
	segundo_apellido varchar(256),
	edad_a_la_fecha varchar(256),
	sexo varchar(256),
	parentesco varchar(256),
	cedula varchar(256),
	nombre_jefe_hogar varchar(256),
	cedula_jefe_hogar varchar(256),
	icv varchar(256),
	validado varchar(256),
	observaciones varchar(256),
	funcionario varchar(256),
	causa_invalidacion varchar(256),
	es_importado int NOT NULL,
	observacion varchar(256),
	fecha_hora_transaccion datetime NOT NULL,
	nombre_archivo varchar(256),
	codigo_archivo varchar(256)
	)
	ON [PRIMARY]
GO

CREATE TABLE log_imp_deu
	(
	id_log_imp_deu bigint NOT NULL,
	version_log_imp_deu bigint NOT NULL,
	cedula varchar(256),
	primer_nombre varchar(256),
	segundo_nombre varchar(256),
	primer_apellido varchar(256),
	segundo_apellido varchar(256),
	apellido_casada varchar(256),
	es_importado int NOT NULL,
	observacion varchar(256),
	fecha_hora_transaccion datetime NOT NULL,
	nombre_archivo varchar(256),
	codigo_archivo varchar(256)
	)
	ON [PRIMARY]
GO

CREATE TABLE log_imp_emp
	(
	id_log_imp_emp bigint NOT NULL,
	version_log_imp_emp bigint NOT NULL,
	cedula varchar(256),
	primer_nombre varchar(256),
	segundo_nombre varchar(256),
	primer_apellido varchar(256),
	segundo_apellido varchar(256),
	apellido_casada varchar(256),
	es_importado int NOT NULL,
	observacion varchar(256),
	fecha_hora_transaccion datetime NOT NULL,
	nombre_archivo varchar(256),
	codigo_archivo varchar(256)
	)
	ON [PRIMARY]
GO

CREATE TABLE log_imp_fal
	(
	id_log_imp_fal bigint NOT NULL,
	version_log_imp_fal bigint NOT NULL,
	cedula varchar(256),
	primer_nombre varchar(256),
	segundo_nombre varchar(256),
	primer_apellido varchar(256),
	segundo_apellido varchar(256),
	apellido_casada varchar(256),
	defuncion varchar(256),
	es_importado int NOT NULL,
	observacion varchar(256),
	fecha_hora_transaccion datetime NOT NULL,
	nombre_archivo varchar(256),
	codigo_archivo varchar(256)
	)
	ON [PRIMARY]
GO

CREATE TABLE log_imp_hog
	(
	id_log_imp_hog bigint NOT NULL,
	version_log_imp_hog bigint NOT NULL,
	p20d varchar(256),
	p20m varchar(256),
	p20a varchar(256),
	p17 varchar(256),
	p18 varchar(256),
	var00001 varchar(256),
	p19 varchar(256),
	observaciones varchar(256),
	utm varchar(256),
	gps varchar(256),
	orden varchar(256),
	coordx varchar(256),
	p01a varchar(256),
	p01b varchar(256),
	p01c varchar(256),
	p01d varchar(256),
	p02 varchar(256),
	p03 varchar(256),
	p04 varchar(256),
	p05 varchar(256),
	p06 varchar(256),
	p08 varchar(256),
	p07 varchar(256),
	p09 varchar(256),
	p14 varchar(256),
	p15 varchar(256),
	p16 varchar(256),
	p24 varchar(256),
	p25 varchar(256),
	p26 varchar(256),
	p27 varchar(256),
	p27e varchar(256),
	p28a varchar(256),
	p28b varchar(256),
	p29 varchar(256),
	p30 varchar(256),
	p31 varchar(256),
	p32 varchar(256),
	p33 varchar(256),
	p34 varchar(256),
	p35 varchar(256),
	p36 varchar(256),
	p37 varchar(256),
	nro_celular varchar(256),
	p38 varchar(256),
	nro_linea_baja varchar(256),
	p391 varchar(256),
	p392 varchar(256),
	p393 varchar(256),
	p394 varchar(256),
	p395 varchar(256),
	p396 varchar(256),
	p397 varchar(256),
	p42n varchar(256),
	p42ci varchar(256),
	letra_ci varchar(256),
	p43 varchar(256),
	var00002 varchar(256),
	var00003 varchar(256),
	var00004 varchar(256),
	p104 varchar(256),
	es_importado int NOT NULL,
	observacion varchar(256),
	fecha_hora_transaccion datetime NOT NULL,
	nombre_archivo varchar(256),
	codigo_archivo varchar(256)
	)
	ON [PRIMARY]
GO

CREATE TABLE log_imp_ids
	(
	id_log_imp_ids bigint NOT NULL,
	version_log_imp_ids bigint NOT NULL,
	cedula varchar(256),
	letra_cedula varchar(256),
	apellidos varchar(256),
	nombres varchar(256),
	nacimiento varchar(256),
	sexo varchar(256),
	nacionalidad varchar(256),
	estado_civil varchar(256),
	lugar_nacimiento varchar(256),
	indigena varchar(256),
	es_importado int NOT NULL,
	observacion varchar(256),
	fecha_hora_transaccion datetime NOT NULL,
	nombre_archivo varchar(256),
	codigo_archivo varchar(256)
	)
	ON [PRIMARY]
GO

CREATE TABLE log_imp_jub
	(
	id_log_imp_jub bigint NOT NULL,
	version_log_imp_jub bigint NOT NULL,
	cedula varchar(256),
	primer_nombre varchar(256),
	segundo_nombre varchar(256),
	primer_apellido varchar(256),
	segundo_apellido varchar(256),
	apellido_casada varchar(256),
	tipo_registro varchar(256),
	es_importado int NOT NULL,
	observacion varchar(256),
	fecha_hora_transaccion datetime NOT NULL,
	nombre_archivo varchar(256),
	codigo_archivo varchar(256)
	)
	ON [PRIMARY]
GO

CREATE TABLE log_imp_pen
	(
	id_log_imp_pen bigint NOT NULL,
	version_log_imp_pen bigint NOT NULL,
	cedula varchar(256),
	primer_nombre varchar(256),
	segundo_nombre varchar(256),
	primer_apellido varchar(256),
	segundo_apellido varchar(256),
	apellido_casada varchar(256),
	es_importado int NOT NULL,
	observacion varchar(256),
	fecha_hora_transaccion datetime NOT NULL,
	nombre_archivo varchar(256),
	codigo_archivo varchar(256)
	)
	ON [PRIMARY]
GO

CREATE TABLE log_imp_per
	(
	id_log_imp_per bigint NOT NULL,
	version_log_imp_per bigint NOT NULL,
	p01a varchar(256),
	p01b varchar(256),
	p01c varchar(256),
	p01d varchar(256),
	p02 varchar(256),
	p03 varchar(256),
	p104 varchar(256),
	p43 varchar(256),
	p45a varchar(256),
	p45b varchar(256),
	p44a varchar(256),
	p44b varchar(256),
	var00001 varchar(256),
	var00002 varchar(256),
	p46 varchar(256),
	p47 varchar(256),
	var00030 varchar(256),
	p48 varchar(256),
	p49 varchar(256),
	p50a varchar(256),
	p50b varchar(256),
	p50c varchar(256),
	p51 varchar(256),
	var00003 varchar(256),
	var00004 varchar(256),
	p52d varchar(256),
	p52m varchar(256),
	p52a varchar(256),
	p53a varchar(256),
	p53b varchar(256),
	p53c varchar(256),
	p53z varchar(256),
	p54 varchar(256),
	p54e varchar(256),
	p56 varchar(256),
	p58 varchar(256),
	p58e varchar(256),
	p59 varchar(256),
	p60 varchar(256),
	p61 varchar(256),
	p62 varchar(256),
	p63 varchar(256),
	p64 varchar(256),
	p65 varchar(256),
	p65e varchar(256),
	p66 varchar(256),
	p66e varchar(256),
	p67 varchar(256),
	p68 varchar(256),
	p68e varchar(256),
	p73 varchar(256),
	p74 varchar(256),
	var00006 varchar(256),
	var00007 varchar(256),
	var00008 varchar(256),
	var00009 varchar(256),
	var00010 varchar(256),
	var00011 varchar(256),
	var00031 varchar(256),
	var00012 varchar(256),
	var00013 varchar(256),
	p86 varchar(256),
	p87 varchar(256),
	p87e varchar(256),
	p88 varchar(256),
	p88e varchar(256),
	p91 varchar(256),
	var00017 varchar(256),
	var00018 varchar(256),
	var00019 varchar(256),
	var00020 varchar(256),
	var00021 varchar(256),
	var00022 varchar(256),
	var00023 varchar(256),
	var00024 varchar(256),
	var00025 varchar(256),
	var00026 varchar(256),
	var00027 varchar(256),
	var00028 varchar(256),
	p92 varchar(256),
	icv varchar(256),
	ficha_activa varchar(256),
	es_importado int NOT NULL,
	observacion varchar(256),
	fecha_hora_transaccion datetime NOT NULL,
	nombre_archivo varchar(256),
	codigo_archivo varchar(256)
	)
	ON [PRIMARY]
GO

CREATE TABLE log_imp_pot
	(
	id_log_imp_pot bigint NOT NULL,
	version_log_imp_pot bigint NOT NULL,
	departamento varchar(256),
	distrito varchar(256),
	nombres_apellidos varchar(256),
	apodo varchar(256),
	edad_a_la_fecha varchar(256),
	nacimiento varchar(256),
	cedula varchar(256),
	telefono varchar(256),
	direccion varchar(256),
	referencia varchar(256),
	barrio varchar(256),
	nombre_referente varchar(256),
	telefono_referente varchar(256),
	es_importado int NOT NULL,
	observacion varchar(256),
	fecha_hora_transaccion datetime NOT NULL,
	nombre_archivo varchar(256),
	codigo_archivo varchar(256)
	)
	ON [PRIMARY]
GO

CREATE TABLE log_imp_sub
	(
	id_log_imp_sub bigint NOT NULL,
	version_log_imp_sub bigint NOT NULL,
	cedula varchar(256),
	primer_nombre varchar(256),
	segundo_nombre varchar(256),
	primer_apellido varchar(256),
	segundo_apellido varchar(256),
	apellido_casada varchar(256),
	es_importado int NOT NULL,
	observacion varchar(256),
	fecha_hora_transaccion datetime NOT NULL,
	nombre_archivo varchar(256),
	codigo_archivo varchar(256)
	)
	ON [PRIMARY]
GO

CREATE TABLE log_imp_ubi
	(
	id_log_imp_ubi bigint NOT NULL,
	version_log_imp_ubi bigint NOT NULL,
	codigo varchar(256),
	ubicacion varchar(256),
	tipo_ubicacion varchar(256),
	tipo_area varchar(256),
	codigo_ubicacion_superior varchar(256),
	es_importado int NOT NULL,
	observacion varchar(256),
	fecha_hora_transaccion datetime NOT NULL,
	nombre_archivo varchar(256),
	codigo_archivo varchar(256)
	)
	ON [PRIMARY]
GO

CREATE TABLE log_pro_acr_pot_ben
	(
	id_log_pro_acr_pot_ben bigint NOT NULL,
	version_log_pro_acr_pot_ben bigint NOT NULL,
	id_potencial_ben bigint,
	nombre_potencial_ben varchar(100),
	codigo_potencial_ben varchar(30),
	fecha_registro_pot_ben smalldatetime,
	id_persona bigint,
	nombre_persona varchar(100),
	codigo_persona varchar(30),
	id_departamento bigint,
	id_distrito bigint,
	id_barrio bigint,
	id_ficha_persona bigint,
	codigo_ficha_persona varchar(30),
	nombre_ficha_persona varchar(100),
	id_ficha_hogar bigint,
	codigo_ficha_hogar varchar(30),
	indice_calidad_vida decimal(7,4),
	es_procesado int NOT NULL,
	observacion varchar(256),
	fecha_hora_transaccion datetime NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE log_pro_act_jupe
	(
	id_log_pro_act_jupe bigint NOT NULL,
	version_log_pro_act_jupe bigint NOT NULL,
	id_persona bigint,
	codigo_persona varchar(30),
	nombre_persona varchar(100),
	id_departamento bigint,
	id_distrito bigint,
	id_barrio bigint,
	numero_condicion_pension int,
	es_procesado int NOT NULL,
	observacion varchar(256),
	fecha_hora_transaccion datetime NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE log_pro_den_pen_obj
	(
	id_log_pro_den_pen_obj bigint NOT NULL,
	version_log_pro_den_pen_obj bigint NOT NULL,
	id_persona bigint,
	codigo_persona varchar(30),
	nombre_persona varchar(100),
	id_departamento bigint,
	id_distrito bigint,
	id_barrio bigint,
	numero_causa_den_pension int,
	es_procesado int NOT NULL,
	observacion varchar(256),
	fecha_hora_transaccion datetime NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE log_pro_imp_arc_ext
	(
	id_log_pro_imp_arc_ext bigint NOT NULL,
	version_log_pro_imp_arc_ext bigint NOT NULL,
	id_archivo_datos_ext bigint,
	codigo_tipo_arc_dat_ext varchar(30),
	numero_tipo_arc_dat_ext int,
	nombre_proveedor_dat_ext varchar(100),
	codigo_proveedor_dat_ext varchar(30),
	codigo_archivo_datos_ext varchar(100),
	ruta_archivo_datos_ext varchar(255),
	es_importado int NOT NULL,
	observacion varchar(256),
	fecha_hora_transaccion datetime NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE log_pro_oto_pen_apr
	(
	id_log_pro_oto_pen_apr bigint NOT NULL,
	version_log_pro_oto_pen_apr bigint NOT NULL,
	id_persona bigint,
	codigo_persona varchar(30),
	nombre_persona varchar(100),
	id_departamento bigint,
	id_distrito bigint,
	id_barrio bigint,
	numero_condicion_pension int,
	es_procesado int NOT NULL,
	observacion varchar(256),
	fecha_hora_transaccion datetime NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE log_pro_pre_pro_pag
	(
	id_log_pro_pre_pro_pag bigint NOT NULL,
	version_log_pro_pre_pro_pag bigint NOT NULL,
	id_persona bigint,
	codigo_persona varchar(30),
	nombre_persona varchar(100),
	id_departamento bigint,
	id_distrito bigint,
	id_barrio bigint,
	numero_condicion_pension int,
	fecha_solicitud_pension smalldatetime,
	numero_condicion_denu_pen int,
	numero_condicion_reco_pen int,
	es_procesado int NOT NULL,
	observacion varchar(256),
	fecha_hora_transaccion datetime NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE log_pro_ver_ele_pen
	(
	id_log_pro_ver_ele_pen bigint NOT NULL,
	version_log_pro_ver_ele_pen bigint NOT NULL,
	id_persona bigint,
	codigo_persona varchar(30),
	nombre_persona varchar(100),
	id_departamento bigint,
	id_distrito bigint,
	id_barrio bigint,
	indice_calidad_vida decimal(7,4),
	numero_condicion_pension int,
	numero_condicion_denu_pen int,
	numero_condicion_reco_pen int,
	es_procesado int NOT NULL,
	observacion varchar(256),
	fecha_hora_transaccion datetime NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE mensaje
	(
	id_mensaje bigint NOT NULL,
	version_mensaje bigint NOT NULL,
	codigo_mensaje varchar(100) NOT NULL,
	patron_mensaje varchar(256),
	descripcion_mensaje varchar(256)
	)
	ON [PRIMARY]
GO

CREATE TABLE motivo_ina_esc
	(
	numero_motivo_ina_esc int NOT NULL,
	codigo_motivo_ina_esc varchar(100) NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE motivo_no_atencion
	(
	numero_motivo_no_atencion int NOT NULL,
	codigo_motivo_no_atencion varchar(30) NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE motivo_no_trabajo
	(
	numero_motivo_no_trabajo int NOT NULL,
	codigo_motivo_no_trabajo varchar(30) NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE nivel_educativo
	(
	numero_nivel_educativo int NOT NULL,
	codigo_nivel_educativo varchar(100) NOT NULL,
	primer_curso int NOT NULL,
	ultimo_curso int NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE nivel_opcion_menu
	(
	numero_nivel_opcion_menu int NOT NULL,
	codigo_nivel_opcion_menu varchar(30) NOT NULL,
	digitos_nivel_opcion_menu int NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE nivel_ubicacion
	(
	numero_nivel_ubicacion int NOT NULL,
	codigo_nivel_ubicacion varchar(30) NOT NULL,
	digitos_nivel_ubicacion int NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE objecion_ele_pen
	(
	id_objecion_ele_pen bigint NOT NULL,
	version_objecion_ele_pen bigint NOT NULL,
	id_persona bigint NOT NULL,
	id_proveedor_dat_ext bigint NOT NULL,
	numero_tipo_obj_ele_pen int NOT NULL,
	es_objecion_ele_pen_inactiva int NOT NULL,
	fecha_ultima_actualizacion smalldatetime,
	nombre_archivo_ultima_act varchar(200),
	observaciones varchar(256)
	)
	ON [PRIMARY]
GO

CREATE TABLE opcion_binaria
	(
	numero_opcion_binaria int NOT NULL,
	codigo_opcion_si_no varchar(30) NOT NULL,
	codigo_opcion_activo_inactivo varchar(30) NOT NULL,
	codigo_opcion_enc_apa varchar(30) NOT NULL,
	codigo_opcion_presente_ausente varchar(30) NOT NULL,
	codigo_opcion_pos_neg varchar(30) NOT NULL,
	codigo_opcion_verdadero_falso varchar(30) NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE opcion_menu
	(
	id_opcion_menu bigint NOT NULL,
	version_opcion_menu bigint NOT NULL,
	codigo_opcion_menu varchar(30) NOT NULL,
	nombre_opcion_menu varchar(100),
	descripcion_opcion_menu varchar(256),
	url_opcion_menu varchar(256),
	id_aplicacion bigint,
	id_pagina bigint,
	id_opcion_menu_superior bigint,
	numero_tipo_nodo int,
	numero_nivel_opcion_menu int,
	secuencia_opcion_menu int,
	clave_opcion_menu varchar(30),
	es_opcion_menu_inactiva int NOT NULL,
	es_opcion_menu_sincronizada int NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE opcion_menu_plus
	(
	id_opcion_menu bigint NOT NULL,
	version_opcion_menu bigint NOT NULL,
	numero_tipo_nodo int NOT NULL,
	numero_nivel_opcion_menu int NOT NULL,
	codigo_nivel_opcion_menu varchar(30) NOT NULL,
	codigo_opcion_menu varchar(30) NOT NULL,
	nombre_opcion_menu varchar(100),
	clave_opcion_menu varchar(30) NOT NULL,
	codigo_nivel_opcion_menu_01 varchar(30),
	codigo_opcion_menu_01 varchar(30),
	nombre_opcion_menu_01 varchar(100),
	clave_opcion_menu_01 varchar(30),
	codigo_nivel_opcion_menu_02 varchar(30),
	codigo_opcion_menu_02 varchar(30),
	nombre_opcion_menu_02 varchar(100),
	clave_opcion_menu_02 varchar(30),
	codigo_nivel_opcion_menu_03 varchar(30),
	codigo_opcion_menu_03 varchar(30),
	nombre_opcion_menu_03 varchar(100),
	clave_opcion_menu_03 varchar(30),
	codigo_nivel_opcion_menu_04 varchar(30),
	codigo_opcion_menu_04 varchar(30),
	nombre_opcion_menu_04 varchar(100),
	clave_opcion_menu_04 varchar(30),
	codigo_nivel_opcion_menu_05 varchar(30),
	codigo_opcion_menu_05 varchar(30),
	nombre_opcion_menu_05 varchar(100),
	clave_opcion_menu_05 varchar(30),
	codigo_nivel_opcion_menu_06 varchar(30),
	codigo_opcion_menu_06 varchar(30),
	nombre_opcion_menu_06 varchar(100),
	clave_opcion_menu_06 varchar(30),
	codigo_nivel_opcion_menu_07 varchar(30),
	codigo_opcion_menu_07 varchar(30),
	nombre_opcion_menu_07 varchar(100),
	clave_opcion_menu_07 varchar(30),
	codigo_nivel_opcion_menu_08 varchar(30),
	codigo_opcion_menu_08 varchar(30),
	nombre_opcion_menu_08 varchar(100),
	clave_opcion_menu_08 varchar(30),
	codigo_nivel_opcion_menu_09 varchar(30),
	codigo_opcion_menu_09 varchar(30),
	nombre_opcion_menu_09 varchar(100),
	clave_opcion_menu_09 varchar(30),
	codigo_nivel_opcion_menu_10 varchar(30),
	codigo_opcion_menu_10 varchar(30),
	nombre_opcion_menu_10 varchar(100),
	clave_opcion_menu_10 varchar(30),
	codigo_nivel_opcion_menu_11 varchar(30),
	codigo_opcion_menu_11 varchar(30),
	nombre_opcion_menu_11 varchar(100),
	clave_opcion_menu_11 varchar(30),
	codigo_nivel_opcion_menu_12 varchar(30),
	codigo_opcion_menu_12 varchar(30),
	nombre_opcion_menu_12 varchar(100),
	clave_opcion_menu_12 varchar(30),
	codigo_nivel_opcion_menu_13 varchar(30),
	codigo_opcion_menu_13 varchar(30),
	nombre_opcion_menu_13 varchar(100),
	clave_opcion_menu_13 varchar(30),
	codigo_nivel_opcion_menu_14 varchar(30),
	codigo_opcion_menu_14 varchar(30),
	nombre_opcion_menu_14 varchar(100),
	clave_opcion_menu_14 varchar(30),
	codigo_nivel_opcion_menu_15 varchar(30),
	codigo_opcion_menu_15 varchar(30),
	nombre_opcion_menu_15 varchar(100),
	clave_opcion_menu_15 varchar(30)
	)
	ON [PRIMARY]
GO

CREATE TABLE opcion_sistema
	(
	id_opcion_sistema bigint NOT NULL,
	version_opcion_sistema bigint NOT NULL,
	clave_opcion_sistema varchar(100) NOT NULL,
	valor_opcion_sistema varchar(100) NOT NULL,
	significado_opcion_sistema varchar(256)
	)
	ON [PRIMARY]
GO

CREATE TABLE operador_com
	(
	numero_operador_com int NOT NULL,
	codigo_operador_com varchar(30) NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE pagina
	(
	id_pagina bigint NOT NULL,
	version_pagina bigint NOT NULL,
	codigo_pagina varchar(100) NOT NULL,
	nombre_pagina varchar(100),
	descripcion_pagina varchar(256),
	url_pagina varchar(256),
	id_aplicacion bigint NOT NULL,
	es_publica int NOT NULL,
	numero_tipo_pagina int,
	id_dominio bigint,
	id_dominio_maestro bigint,
	id_parametro bigint
	)
	ON [PRIMARY]
GO

CREATE TABLE pagina_funcion
	(
	id_pagina_funcion bigint NOT NULL,
	version_pagina_funcion bigint NOT NULL,
	id_pagina bigint NOT NULL,
	id_funcion bigint NOT NULL,
	es_funcion_inicial int NOT NULL,
	control_pagina_funcion varchar(100)
	)
	ON [PRIMARY]
GO

CREATE TABLE pagina_usuario
	(
	id_pagina_usuario bigint NOT NULL,
	version_pagina_usuario bigint NOT NULL,
	id_pagina bigint NOT NULL,
	id_usuario bigint NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE paquete
	(
	id_paquete bigint NOT NULL,
	version_paquete bigint NOT NULL,
	codigo_paquete varchar(30) NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE parametro
	(
	id_parametro bigint NOT NULL,
	version_parametro bigint NOT NULL,
	codigo_parametro varchar(100) NOT NULL,
	nombre_parametro varchar(100) NOT NULL,
	detalle_parametro varchar(100),
	descripcion_parametro varchar(256),
	numero_tipo_dato_par int NOT NULL,
	alias_parametro varchar(100)
	)
	ON [PRIMARY]
GO

CREATE TABLE parametro_global
	(
	numero_parametro_global int NOT NULL,
	codigo_parametro_global varchar(30) NOT NULL,
	monto_salario_minimo decimal(16,2) NOT NULL,
	porcentaje_pension_alimentaria decimal(7,4) NOT NULL,
	es_control_cer_vida_activo int NOT NULL,
	meses_validez_certificado_vida int NOT NULL,
	es_control_cobro_pension_activ int NOT NULL,
	meses_ultimo_cobro_pension int NOT NULL,
	es_control_reproceso_pen_activ int NOT NULL,
	limite_indice_calidad_vida decimal(7,4) NOT NULL,
	limite_pensiones int NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE persona
	(
	id_persona bigint NOT NULL,
	version_persona bigint NOT NULL,
	codigo_persona varchar(30) NOT NULL,
	nombre_persona varchar(100) NOT NULL,
	numero_cedula int,
	letra_cedula varchar(1),
	fecha_expedicion_cedula smalldatetime,
	fecha_vencimiento_cedula smalldatetime,
	primer_nombre varchar(30),
	segundo_nombre varchar(30),
	primer_apellido varchar(30),
	segundo_apellido varchar(30),
	apellido_casada varchar(30),
	apodo varchar(30),
	fecha_nacimiento smalldatetime,
	numero_sexo_persona int,
	numero_estado_civil int,
	es_paraguayo_natural int NOT NULL,
	es_indigena int NOT NULL,
	id_etnia_indigena bigint,
	nombre_comunidad_indigena varchar(100),
	id_departamento bigint,
	id_distrito bigint,
	numero_tipo_area int,
	id_barrio bigint,
	id_manzana bigint,
	manzana varchar(30),
	direccion varchar(256),
	numero_telefono_linea_baja varchar(50),
	numero_telefono_celular varchar(50),
	certificado_vida varchar(30),
	fecha_certificado_vida smalldatetime,
	es_certificado_vida_anulado int NOT NULL,
	comentarios_anul_cer_vida varchar(256),
	certificado_defuncion varchar(30),
	fecha_certificado_defuncion smalldatetime,
	es_cer_defuncion_anulado int NOT NULL,
	comentarios_anul_cer_defuncion varchar(256),
	es_persona_con_empleo int NOT NULL,
	es_persona_con_jubilacion int NOT NULL,
	es_persona_con_pension int NOT NULL,
	es_persona_con_subsidio int NOT NULL,
	es_persona_con_deuda int NOT NULL,
	es_persona_con_pena_judicial int NOT NULL,
	es_persona_con_cer_vida int NOT NULL,
	es_persona_con_carta_renuncia int NOT NULL,
	es_persona_elegible_para_pen int NOT NULL,
	es_persona_acreditada_para_pen int NOT NULL,
	es_persona_con_copia_cedula int NOT NULL,
	es_persona_con_declaracion_jur int NOT NULL,
	monto_pension decimal(16,2),
	numero_condicion_pension int,
	lugar_solicitud_pension varchar(100),
	fecha_solicitud_pension smalldatetime,
	comentarios_solicitud_pension varchar(256),
	fecha_aprobacion_pension smalldatetime,
	comentarios_aprobacion_pension varchar(256),
	fecha_otorgamiento_pen smalldatetime,
	numero_resolucion_otor_pen varchar(50),
	fecha_resolucion_otor_pen smalldatetime,
	comentarios_otorgamiento_pen varchar(256),
	fecha_objecion_pension smalldatetime,
	numero_causa_den_pension int,
	otra_causa_den_pension varchar(100),
	comentarios_objecion_pension varchar(256),
	fecha_denegacion_pension smalldatetime,
	numero_resolucion_den_pen varchar(50),
	fecha_resolucion_den_pen smalldatetime,
	comentarios_denegacion_pension varchar(256),
	fecha_revocacion_pension smalldatetime,
	numero_causa_rev_pension int,
	otra_causa_rev_pension varchar(100),
	comentarios_revocacion_pension varchar(256),
	numero_condicion_reco_pen int,
	fecha_solicitud_reco_pen smalldatetime,
	comentarios_solicitud_reco_pen varchar(256),
	fecha_aprobacion_reco_pen smalldatetime,
	comentarios_apr_reco_pen varchar(256),
	fecha_denegacion_reco_pen smalldatetime,
	numero_causa_den_reco_pen int,
	otra_causa_den_reco_pen varchar(100),
	comentarios_den_reco_pen varchar(256),
	numero_condicion_denu_pen int,
	fecha_registro_denuncia_pen smalldatetime,
	comentarios_registro_denu_pen varchar(256),
	fecha_confirmacion_denu_pen smalldatetime,
	comentarios_conf_denu_pen varchar(256),
	fecha_desmentido_denuncia_pen smalldatetime,
	comentarios_des_denu_pen varchar(256),
	id_ficha_persona bigint,
	fecha_ficha_persona smalldatetime,
	indice_calidad_vida decimal(7,4),
	fecha_ultimo_cobro_pension smalldatetime,
	notas_anul_fec_ult_cob_pen varchar(256),
	numero_tipo_act_jupe int,
	fecha_hora_ult_act_jupe datetime
	)
	ON [PRIMARY]
GO

CREATE TABLE potencial_ben
	(
	id_potencial_ben bigint NOT NULL,
	version_potencial_ben bigint NOT NULL,
	codigo_potencial_ben varchar(30) NOT NULL,
	nombre_potencial_ben varchar(100) NOT NULL,
	numero_tipo_reg_pot_ben int NOT NULL,
	id_persona bigint,
	numero_cedula int,
	letra_cedula varchar(1),
	fecha_expedicion_cedula smalldatetime,
	fecha_vencimiento_cedula smalldatetime,
	primer_nombre varchar(30),
	segundo_nombre varchar(30),
	primer_apellido varchar(30),
	segundo_apellido varchar(30),
	apellido_casada varchar(30),
	apodo varchar(30),
	fecha_nacimiento smalldatetime,
	edad int,
	es_paraguayo_natural int NOT NULL,
	es_indigena int NOT NULL,
	id_etnia_indigena bigint,
	nombre_comunidad_indigena varchar(100),
	id_departamento bigint,
	id_distrito bigint,
	numero_tipo_area int,
	id_barrio bigint,
	id_manzana bigint,
	manzana varchar(30),
	compania varchar(100),
	direccion varchar(256),
	nombre_responsable_hogar varchar(100),
	numero_telefono_resp_hogar varchar(50),
	es_persona_con_empleo int NOT NULL,
	es_persona_con_jubilacion int NOT NULL,
	es_persona_con_pension int NOT NULL,
	es_persona_con_subsidio int NOT NULL,
	es_persona_con_deuda int NOT NULL,
	es_persona_con_pena_judicial int NOT NULL,
	es_persona_con_cer_vida int NOT NULL,
	es_persona_con_carta_renuncia int NOT NULL,
	nombre_referente varchar(100),
	numero_telefono_referente varchar(50),
	numero_condicion_censo int,
	fecha_validacion_censo smalldatetime,
	id_funcionario_validacion_cen bigint,
	numero_causa_inv_censo int,
	otra_causa_inv_censo varchar(100),
	comentarios_validacion_censo varchar(256),
	id_ficha_persona bigint,
	numero_condicion_recl_cen int,
	fecha_reclamo_censo smalldatetime,
	comentarios_reclamo_censo varchar(256),
	fecha_aprobacion_reclamo_censo smalldatetime,
	comentarios_apr_recl_cen varchar(256),
	fecha_denegacion_reclamo_censo smalldatetime,
	numero_causa_den_recl_cen int,
	otra_causa_den_recl_cen varchar(100),
	comentarios_den_recl_cen varchar(256),
	fecha_registro_pot_ben smalldatetime,
	id_usuario_reg_pot_ben bigint,
	es_potencial_ben_inactivo int NOT NULL,
	fecha_ultima_visita_censo smalldatetime,
	observaciones_ult_visita_cen varchar(256),
	id_funcionario_ult_visita_cen bigint,
	referencia_direccion varchar(256),
	indice_calidad_vida decimal(7,4),
	es_potencial_ben_migrado int
	)
	ON [PRIMARY]
GO

CREATE TABLE proceso
	(
	id_proceso bigint NOT NULL,
	version_proceso bigint NOT NULL,
	codigo_proceso varchar(30) NOT NULL,
	nombre_proceso varchar(100) NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE proveedor_dat_ext
	(
	id_proveedor_dat_ext bigint NOT NULL,
	version_proveedor_dat_ext bigint NOT NULL,
	codigo_proveedor_dat_ext varchar(30) NOT NULL,
	nombre_proveedor_dat_ext varchar(100) NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE rastro_funcion
	(
	id_rastro_funcion bigint NOT NULL,
	fecha_hora_ejecucion datetime NOT NULL,
	id_usuario bigint NOT NULL,
	id_funcion bigint NOT NULL,
	id_recurso bigint,
	version_recurso bigint,
	codigo_recurso varchar(100),
	nombre_recurso varchar(100),
	id_propietario_recurso bigint,
	id_segmento_recurso bigint,
	numero_error int,
	descripcion_error varchar(256)
	)
	ON [PRIMARY]
GO

CREATE TABLE rastro_funcion_par
	(
	id_rastro_funcion_par bigint NOT NULL,
	id_rastro_funcion bigint NOT NULL,
	id_parametro bigint NOT NULL,
	valor_parametro varchar(100)
	)
	ON [PRIMARY]
GO

CREATE TABLE rastro_informe
	(
	id_rastro_informe bigint NOT NULL,
	version_rastro_informe bigint NOT NULL,
	fecha_hora_inicio_ejecucion datetime NOT NULL,
	fecha_hora_fin_ejecucion datetime,
	id_usuario bigint NOT NULL,
	id_funcion bigint NOT NULL,
	numero_condicion_eje_fun int NOT NULL,
	nombre_archivo varchar(100),
	descripcion_error varchar(256)
	)
	ON [PRIMARY]
GO

CREATE TABLE rastro_proceso
	(
	id_rastro_proceso bigint NOT NULL,
	version_rastro_proceso bigint NOT NULL,
	fecha_hora_inicio_ejecucion datetime NOT NULL,
	fecha_hora_fin_ejecucion datetime,
	id_usuario bigint NOT NULL,
	id_funcion bigint NOT NULL,
	numero_condicion_eje_fun int NOT NULL,
	nombre_archivo varchar(100),
	descripcion_error varchar(256),
	id_grupo_proceso bigint,
	id_rastro_proceso_superior bigint,
	subprocesos int NOT NULL,
	subprocesos_pendientes int NOT NULL,
	subprocesos_en_progreso int NOT NULL,
	subprocesos_sin_errores int NOT NULL,
	subprocesos_con_errores int NOT NULL,
	subprocesos_cancelados int NOT NULL,
	procedimiento_after_update varchar(100)
	)
	ON [PRIMARY]
GO

CREATE TABLE recurso
	(
	id_recurso bigint NOT NULL,
	version_recurso bigint NOT NULL,
	codigo_recurso varchar(100) NOT NULL,
	nombre_recurso varchar(100) NOT NULL,
	id_propietario_recurso bigint NOT NULL,
	id_segmento_recurso bigint NOT NULL,
	id_recurso_superior bigint NOT NULL,
	id_recurso_maestro bigint NOT NULL,
	es_recurso_inactivo int NOT NULL,
	numero_recurso int NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE rol
	(
	id_rol bigint NOT NULL,
	version_rol bigint NOT NULL,
	codigo_rol varchar(100) NOT NULL,
	nombre_rol varchar(100),
	descripcion_rol varchar(256),
	numero_tipo_rol int,
	id_grupo_aplicacion bigint
	)
	ON [PRIMARY]
GO

CREATE TABLE rol_aplicacion
	(
	id_rol_aplicacion bigint NOT NULL,
	version_rol_aplicacion bigint NOT NULL,
	id_rol bigint NOT NULL,
	id_aplicacion bigint NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE rol_filtro_funcion
	(
	id_rol_filtro_funcion bigint NOT NULL,
	version_rol_filtro_funcion bigint NOT NULL,
	id_rol bigint NOT NULL,
	id_filtro_funcion bigint NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE rol_funcion
	(
	id_rol_funcion bigint NOT NULL,
	version_rol_funcion bigint NOT NULL,
	id_rol bigint NOT NULL,
	id_funcion bigint NOT NULL,
	id_conjunto_segmento bigint
	)
	ON [PRIMARY]
GO

CREATE TABLE rol_pagina
	(
	id_rol_pagina bigint NOT NULL,
	version_rol_pagina bigint NOT NULL,
	id_rol bigint NOT NULL,
	id_pagina bigint NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE rol_usuario
	(
	id_rol_usuario bigint NOT NULL,
	version_rol_usuario bigint NOT NULL,
	id_rol bigint NOT NULL,
	id_usuario bigint NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE sexo_persona
	(
	numero_sexo_persona int NOT NULL,
	codigo_sexo_persona varchar(30) NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE siono
	(
	numero_siono int NOT NULL,
	codigo_siono varchar(30) NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE tipo_aba_agua
	(
	numero_tipo_aba_agua int NOT NULL,
	codigo_tipo_aba_agua varchar(30) NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE tipo_act_jupe
	(
	numero_tipo_act_jupe int NOT NULL,
	codigo_tipo_act_jupe varchar(30) NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE tipo_arc_dat_ext
	(
	numero_tipo_arc_dat_ext int NOT NULL,
	codigo_tipo_arc_dat_ext varchar(30) NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE tipo_area
	(
	numero_tipo_area int NOT NULL,
	codigo_tipo_area varchar(30) NOT NULL,
	limite_indice_calidad_vida decimal(7,4)
	)
	ON [PRIMARY]
GO

CREATE TABLE tipo_clase_recurso
	(
	numero_tipo_clase_recurso int NOT NULL,
	codigo_tipo_clase_recurso varchar(30) NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE tipo_combustible
	(
	numero_tipo_combustible int NOT NULL,
	codigo_tipo_combustible varchar(30) NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE tipo_comparacion
	(
	numero_tipo_comparacion int NOT NULL,
	codigo_tipo_comparacion varchar(30) NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE tipo_dato_par
	(
	numero_tipo_dato_par int NOT NULL,
	codigo_tipo_dato_par varchar(30) NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE tipo_desecho_bas
	(
	numero_tipo_desecho_bas int NOT NULL,
	codigo_tipo_desecho_bas varchar(30) NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE tipo_dominio
	(
	numero_tipo_dominio int NOT NULL,
	codigo_tipo_dominio varchar(30) NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE tipo_excepcion_ced
	(
	numero_tipo_excepcion_ced int NOT NULL,
	codigo_tipo_excepcion_ced varchar(30) NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE tipo_funcion
	(
	numero_tipo_funcion int NOT NULL,
	codigo_tipo_funcion varchar(30) NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE tipo_mat_paredes
	(
	numero_tipo_mat_paredes int NOT NULL,
	codigo_tipo_mat_paredes varchar(30) NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE tipo_mat_piso
	(
	numero_tipo_mat_piso int NOT NULL,
	codigo_tipo_mat_piso varchar(30) NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE tipo_mat_techo
	(
	numero_tipo_mat_techo int NOT NULL,
	codigo_tipo_mat_techo varchar(30) NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE tipo_nodo
	(
	numero_tipo_nodo int NOT NULL,
	codigo_tipo_nodo varchar(30) NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE tipo_obj_ele_pen
	(
	numero_tipo_obj_ele_pen int NOT NULL,
	codigo_tipo_obj_ele_pen varchar(30) NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE tipo_ocupacion_viv
	(
	numero_tipo_ocupacion_viv int NOT NULL,
	codigo_tipo_ocupacion_viv varchar(30) NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE tipo_pagina
	(
	numero_tipo_pagina int NOT NULL,
	codigo_tipo_pagina varchar(30) NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE tipo_parametro
	(
	numero_tipo_parametro int NOT NULL,
	codigo_tipo_parametro varchar(30) NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE tipo_parametro_dom
	(
	numero_tipo_parametro_dom int NOT NULL,
	codigo_tipo_parametro_dom varchar(30) NOT NULL,
	codigo_propiedad_interfaz varchar(30) NOT NULL,
	nombre_interfaz varchar(100) NOT NULL,
	etiqueta_parametro varchar(100) NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE tipo_persona_hogar
	(
	numero_tipo_persona_hogar int NOT NULL,
	codigo_tipo_persona_hogar varchar(30) NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE tipo_pieza_bano
	(
	numero_tipo_pieza_bano int NOT NULL,
	codigo_tipo_pieza_bano varchar(30) NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE tipo_rastro_fun
	(
	numero_tipo_rastro_fun int NOT NULL,
	codigo_tipo_rastro_fun varchar(30) NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE tipo_recurso
	(
	numero_tipo_recurso int NOT NULL,
	codigo_tipo_recurso varchar(30) NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE tipo_reg_pot_ben
	(
	numero_tipo_reg_pot_ben int NOT NULL,
	codigo_tipo_reg_pot_ben varchar(30) NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE tipo_relacion_lab
	(
	numero_tipo_relacion_lab int NOT NULL,
	codigo_tipo_relacion_lab varchar(30) NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE tipo_rol
	(
	numero_tipo_rol int NOT NULL,
	codigo_tipo_rol varchar(30) NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE tipo_seguro_medico
	(
	numero_tipo_seguro_medico int NOT NULL,
	codigo_tipo_seguro_medico varchar(30) NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE tipo_servicio_agua
	(
	numero_tipo_servicio_agua int NOT NULL,
	codigo_tipo_servicio_agua varchar(30) NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE tipo_servicio_san
	(
	numero_tipo_servicio_san int NOT NULL,
	codigo_tipo_servicio_san varchar(30) NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE tipo_valor
	(
	numero_tipo_valor int NOT NULL,
	codigo_tipo_valor varchar(30) NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE ubicacion
	(
	id_ubicacion bigint NOT NULL,
	version_ubicacion bigint NOT NULL,
	codigo_ubicacion varchar(30) NOT NULL,
	nombre_ubicacion varchar(100) NOT NULL,
	id_ubicacion_superior bigint,
	numero_tipo_nodo int,
	numero_nivel_ubicacion int,
	secuencia_ubicacion int,
	clave_ubicacion varchar(30),
	numero_tipo_area int
	)
	ON [PRIMARY]
GO

CREATE TABLE ubicacion_plus
	(
	id_ubicacion bigint NOT NULL,
	version_ubicacion bigint NOT NULL,
	numero_tipo_nodo int NOT NULL,
	numero_nivel_ubicacion int NOT NULL,
	codigo_nivel_ubicacion varchar(30) NOT NULL,
	codigo_ubicacion varchar(30) NOT NULL,
	nombre_ubicacion varchar(100),
	clave_ubicacion varchar(30) NOT NULL,
	codigo_nivel_ubicacion_01 varchar(30),
	codigo_ubicacion_01 varchar(30),
	nombre_ubicacion_01 varchar(100),
	clave_ubicacion_01 varchar(30),
	codigo_nivel_ubicacion_02 varchar(30),
	codigo_ubicacion_02 varchar(30),
	nombre_ubicacion_02 varchar(100),
	clave_ubicacion_02 varchar(30),
	codigo_nivel_ubicacion_03 varchar(30),
	codigo_ubicacion_03 varchar(30),
	nombre_ubicacion_03 varchar(100),
	clave_ubicacion_03 varchar(30),
	codigo_nivel_ubicacion_04 varchar(30),
	codigo_ubicacion_04 varchar(30),
	nombre_ubicacion_04 varchar(100),
	clave_ubicacion_04 varchar(30),
	codigo_nivel_ubicacion_05 varchar(30),
	codigo_ubicacion_05 varchar(30),
	nombre_ubicacion_05 varchar(100),
	clave_ubicacion_05 varchar(30),
	codigo_nivel_ubicacion_06 varchar(30),
	codigo_ubicacion_06 varchar(30),
	nombre_ubicacion_06 varchar(100),
	clave_ubicacion_06 varchar(30),
	codigo_nivel_ubicacion_07 varchar(30),
	codigo_ubicacion_07 varchar(30),
	nombre_ubicacion_07 varchar(100),
	clave_ubicacion_07 varchar(30),
	codigo_nivel_ubicacion_08 varchar(30),
	codigo_ubicacion_08 varchar(30),
	nombre_ubicacion_08 varchar(100),
	clave_ubicacion_08 varchar(30),
	codigo_nivel_ubicacion_09 varchar(30),
	codigo_ubicacion_09 varchar(30),
	nombre_ubicacion_09 varchar(100),
	clave_ubicacion_09 varchar(30),
	codigo_nivel_ubicacion_10 varchar(30),
	codigo_ubicacion_10 varchar(30),
	nombre_ubicacion_10 varchar(100),
	clave_ubicacion_10 varchar(30),
	codigo_nivel_ubicacion_11 varchar(30),
	codigo_ubicacion_11 varchar(30),
	nombre_ubicacion_11 varchar(100),
	clave_ubicacion_11 varchar(30),
	codigo_nivel_ubicacion_12 varchar(30),
	codigo_ubicacion_12 varchar(30),
	nombre_ubicacion_12 varchar(100),
	clave_ubicacion_12 varchar(30),
	codigo_nivel_ubicacion_13 varchar(30),
	codigo_ubicacion_13 varchar(30),
	nombre_ubicacion_13 varchar(100),
	clave_ubicacion_13 varchar(30),
	codigo_nivel_ubicacion_14 varchar(30),
	codigo_ubicacion_14 varchar(30),
	nombre_ubicacion_14 varchar(100),
	clave_ubicacion_14 varchar(30),
	codigo_nivel_ubicacion_15 varchar(30),
	codigo_ubicacion_15 varchar(30),
	nombre_ubicacion_15 varchar(100),
	clave_ubicacion_15 varchar(30)
	)
	ON [PRIMARY]
GO

CREATE TABLE usuario
	(
	id_usuario bigint NOT NULL,
	version_usuario bigint NOT NULL,
	codigo_usuario varchar(30) NOT NULL,
	nombre_usuario varchar(100),
	password_usuario varchar(100),
	correo_electronico varchar(100),
	id_usuario_supervisor bigint,
	es_super_usuario int NOT NULL,
	es_usuario_especial int NOT NULL,
	es_usuario_inactivo int NOT NULL,
	es_usuario_modificado int NOT NULL
	)
	ON [PRIMARY]
GO

CREATE TABLE visita_censo
	(
	id_visita_censo bigint NOT NULL,
	version_visita_censo bigint NOT NULL,
	id_potencial_ben bigint NOT NULL,
	id_funcionario_censista bigint NOT NULL,
	fecha_visita smalldatetime NOT NULL,
	observaciones varchar(256)
	)
	ON [PRIMARY]
GO

