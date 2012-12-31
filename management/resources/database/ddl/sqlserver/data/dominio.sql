SET DATEFORMAT ymd
GO
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (1001001, 0, 'opcion_binaria', 'Opciones Binarias', NULL, NULL, 1, 10010, 100100101, NULL, 1);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (1002001, 0, 'opcion_sistema', 'Opciones de Sistema', NULL, NULL, 1, 10020, 100200101, NULL, 1);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (1003001, 0, 'tipo_nodo', 'Tipos de Nodo', NULL, NULL, 1, 10030, 100300101, NULL, 1);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (1004001, 0, 'mensaje', 'Mensajes', NULL, NULL, 1, 10040, 100400101, NULL, 1);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (1005001, 0, 'tipo_valor', 'Tipos de Valor', NULL, NULL, 1, 10050, 100500101, NULL, 1);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (1011001, 0, 'parametro', 'Parámetros', NULL, NULL, 1, 10110, 101100101, NULL, 1);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (1012001, 0, 'tipo_parametro', 'Tipos de Parámetro', NULL, NULL, 1, 10120, 101200101, NULL, 1);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (1013001, 0, 'tipo_dato_par', 'Tipos de Dato de Parámetro', NULL, NULL, 1, 10130, 101300101, NULL, 1);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (1021001, 0, 'clase_recurso', 'Clases de Recurso', NULL, NULL, 1, 10210, 102100101, NULL, 1);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (1021501, 0, 'tipo_clase_recurso', 'Tipos de Clase de Recurso', NULL, NULL, 1, 10215, 102150101, NULL, 1);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (1022001, 0, 'tipo_recurso', 'Tipos de Recurso', NULL, NULL, 1, 10220, 102200101, NULL, 1);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (1022401, 0, 'clase_recurso_sec', 'Secciones por Clase de Recurso', NULL, NULL, 1, 10224, 102240101, NULL, 1);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (1022501, 0, 'clase_recurso_par', 'Parámetros por Clase de Recurso', NULL, NULL, 1, 10225, 102250101, NULL, 1);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (1022601, 0, 'filtro_cla_rec_sec', 'Filtros por Sección', NULL, NULL, 1, 10226, 102260101, NULL, 1);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (1022701, 0, 'filtro_cla_rec_par', 'Filtros por Parámetro', NULL, NULL, 1, 10227, 102270101, NULL, 1);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (1022801, 0, 'filtro_cla_rec_vin', 'Filtros por Vínculo', NULL, NULL, 1, 10228, 102280101, NULL, 1);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (1022901, 0, 'filtro_cla_rec_fun', 'Filtros por Función', NULL, NULL, 1, 10229, 102290101, NULL, 1);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (1023001, 0, 'dominio', 'Dominios', NULL, NULL, 1, 10230, 102300101, NULL, 1);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (1024001, 0, 'tipo_dominio', 'Tipos de Dominio', NULL, NULL, 1, 10240, 102400101, NULL, 1);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (1025001, 0, 'dominio_parametro', 'Parámetros por Dominio', NULL, NULL, 1, 10250, 102500101, NULL, 1);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (1026001, 0, 'tipo_parametro_dom', 'Roles de Parámetro', NULL, NULL, 1, 10260, 102600101, NULL, 1);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (1027001, 0, 'paquete', 'Paquetes', NULL, NULL, 1, 10270, 102700101, NULL, 1);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (1028001, 0, 'dominio_paquete', 'Dominios por Paquete', NULL, NULL, 1, 10280, 102800101, NULL, 1);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (1031001, 0, 'funcion', 'Funciones', NULL, NULL, 1, 10310, 103100101, NULL, 1);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (1032001, 0, 'tipo_funcion', 'Tipos de Función', NULL, NULL, 1, 10320, 103200101, NULL, 1);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (1033001, 0, 'tipo_rastro_fun', 'Tipos de Rastro', NULL, NULL, 1, 10330, 103300101, NULL, 1);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (1034001, 0, 'funcion_parametro', 'Parámetros por Función', NULL, NULL, 1, 10340, 103400101, NULL, 1);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (1035001, 0, 'tipo_comparacion', 'Tipos de Comparación', NULL, NULL, 1, 10350, 103500101, NULL, 1);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (1041001, 0, 'aplicacion', 'Aplicaciones', NULL, NULL, 1, 10410, 104100101, NULL, 1);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (1042001, 0, 'pagina', 'Páginas', NULL, NULL, 1, 10420, 104200101, NULL, 1);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (1042501, 0, 'tipo_pagina', 'Tipos de Página', NULL, NULL, 1, 10425, 104250101, NULL, 1);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (1043001, 0, 'pagina_funcion', 'Funciones por Página', NULL, NULL, 1, 10430, 104300101, NULL, 1);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (1044001, 0, 'pagina_usuario', 'Páginas por Usuario', NULL, NULL, 1, 10440, 104400101, NULL, 1);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (1044002, 0, 'favoritos', 'Favoritos', NULL, 'pagina_usuario', 2, 10440, 104400201, NULL, NULL);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (1045001, 0, 'grupo_aplicacion', 'Grupos de Aplicación', NULL, NULL, 1, 10450, 104500101, NULL, 1);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (1051001, 0, 'opcion_menu', 'Opciones de Menú', NULL, NULL, 1, 10510, 105100101, NULL, 1);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (1052001, 0, 'opcion_menu_plus', 'Opciones de Menú', NULL, NULL, 1, 10520, NULL, NULL, 1);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (1053001, 0, 'nivel_opcion_menu', 'Niveles Jerárquicos de Opciones de Menú', NULL, NULL, 1, 10530, 105300101, NULL, 1);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (1061001, 0, 'usuario', 'Usuarios', NULL, NULL, 1, 10610, 106100101, NULL, 1);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (1061011, 0, 'vista_autenticacion_1', 'Usuarios', NULL, 'usuario', 2, 10610, NULL, NULL, 1);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (1062001, 0, 'conjunto_segmento', 'Conjuntos de Segmentos', NULL, NULL, 1, 10620, 106200101, NULL, 1);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (1063001, 0, 'elemento_segmento', 'Elementos de Conjunto de Segmentos', NULL, NULL, 1, 10630, 106300101, NULL, 1);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (1064001, 0, 'rol', 'Roles', NULL, NULL, 1, 10640, 106400101, NULL, 1);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (1064011, 0, 'vista_autenticacion_2', 'Roles', NULL, 'rol', 2, 10640, NULL, NULL, 1);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (1064501, 0, 'tipo_rol', 'Tipos de Rol', NULL, NULL, 1, 10645, 106450101, NULL, 1);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (1065001, 0, 'rol_aplicacion', 'Aplicaciones por Rol', NULL, NULL, 1, 10650, 106500101, NULL, 1);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (1066001, 0, 'rol_funcion', 'Funciones por Rol', NULL, NULL, 1, 10660, 106600101, NULL, 1);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (1067001, 0, 'rol_usuario', 'Usuarios por Rol', NULL, NULL, 1, 10670, 106700101, NULL, 1);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (1067011, 0, 'vista_autenticacion_3', 'Roles por Usuario', NULL, 'rol_usuario', 2, 10670, NULL, NULL, 1);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (1068001, 0, 'rol_filtro_funcion', 'Filtros por Rol', NULL, NULL, 1, 10680, 106800101, NULL, 1);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (1069001, 0, 'rol_pagina', 'Páginas por Rol', NULL, NULL, 1, 10690, 106900101, NULL, 1);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (1071001, 0, 'rastro_funcion', 'Rastros de Ejecuciones de Funciones', NULL, NULL, 1, 10710, 107100101, NULL, 1);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (1071050, 0, 'relacion_rastro_funcion', 'Ejecución de Funciones', NULL, 'rastro_funcion', 2, 10710, 107105001, NULL, 1);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (1072001, 0, 'rastro_funcion_par', 'Rastros de Parámetros de Ejecuciones de Funciones', NULL, NULL, 1, 10720, 107200101, NULL, 1);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (1072050, 0, 'relacion_rastro_funcion_par', 'Parámetros de Ejecuciones de Funciones', NULL, 'rastro_funcion_par', 2, 10720, 107205001, NULL, 1);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (1073001, 0, 'rastro_informe', 'Rastros de Informes', NULL, NULL, 1, 10730, 107300101, NULL, 1);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (1073050, 0, 'relacion_rastro_informe', 'Ejecución de Informes', NULL, 'rastro_informe', 2, 10730, 107305001, NULL, 1);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (1074001, 0, 'rastro_proceso', 'Rastros de Procesos', NULL, NULL, 1, 10740, 107400101, NULL, 1);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (1074050, 0, 'relacion_rastro_proceso', 'Ejecución de Procesos', NULL, 'rastro_proceso', 2, 10740, 107405001, NULL, 1);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (1075001, 0, 'grupo_proceso', 'Grupos de Proceso', NULL, NULL, 1, 10750, 107500101, NULL, 1);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (1078001, 0, 'condicion_eje_fun', 'Condiciones de Ejecución de Función', NULL, NULL, 1, 10780, 107800101, NULL, 1);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (1081001, 0, 'filtro_funcion', 'Filtros', NULL, NULL, 1, 10810, 108100101, NULL, 1);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (1082001, 0, 'filtro_funcion_par', 'Parámetros por Filtro', NULL, NULL, 1, 10820, 108200101, NULL, 1);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (1083001, 0, 'operador_com', 'Operadores de Comparación', NULL, NULL, 1, 10830, 108300101, NULL, 1);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (2001001, 0, 'informe', 'Informes Globales', NULL, NULL, 1, 20010, 200100101, NULL, 2);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (2002001, 0, 'proceso', 'Procesos Globales', NULL, NULL, 1, 20020, 200200101, NULL, 2);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (2010001, 0, 'persona', 'Personas', NULL, NULL, 1, 20100, 201000101, NULL, 2);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (2011001, 0, 'estado_civil', 'Estados Civiles de Persona', NULL, NULL, 1, 20110, 201100101, NULL, 2);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (2012001, 0, 'sexo_persona', 'Sexos de Persona', NULL, NULL, 1, 20120, 201200101, NULL, 2);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (2020001, 0, 'ubicacion', 'Ubicaciones', NULL, NULL, 1, 20200, 202000101, NULL, 2);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (2021001, 0, 'ubicacion_plus', 'Ubicaciones', NULL, NULL, 1, 20210, NULL, NULL, 2);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (2022001, 0, 'nivel_ubicacion', 'Niveles Jerárquicos de Ubicación', NULL, NULL, 1, 20220, 202200101, NULL, 2);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (3001001, 0, 'parametro_global', 'Parámetros Globales', NULL, NULL, 1, 30010, 300100101, NULL, 3);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (3011001, 0, 'etnia_indigena', 'Etnias Indígenas', NULL, NULL, 1, 30110, 301100101, NULL, 3);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (3113001, 0, 'condicion_pension', 'Condiciones de Trámite de Pensión', NULL, NULL, 1, 31130, 311300101, NULL, 3);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (3114001, 0, 'condicion_reco_pen', 'Condiciones de Reconsideración de Pensión', NULL, NULL, 1, 31140, 311400101, NULL, 3);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (3115001, 0, 'condicion_denu_pen', 'Condiciones de Denuncia sobre Pensión', NULL, NULL, 1, 31150, 311500101, NULL, 3);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (3116001, 0, 'causa_den_pension', 'Causas de Denegación de Pensión', NULL, NULL, 1, 31160, 311600101, NULL, 3);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (3116201, 0, 'causa_den_reco_pen', 'Causas de Denegación de Reconsideración de Pensión', NULL, NULL, 1, 31162, 311620101, NULL, 3);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (3116501, 0, 'causa_den_recl_cen', 'Causas de Denegación de Reclamo de Censo', NULL, NULL, 1, 31165, 311650101, NULL, 3);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (3116701, 0, 'causa_inv_censo', 'Causas de Invalidación de Censo', NULL, NULL, 1, 31167, 311670101, NULL, 3);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (3117001, 0, 'causa_rev_pension', 'Causas de Revocación de Pensión', NULL, NULL, 1, 31170, 311700101, NULL, 3);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (3121001, 0, 'proveedor_dat_ext', 'Proveedores de Datos Externos', NULL, NULL, 1, 31210, 312100101, NULL, 3);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (3122001, 0, 'tipo_arc_dat_ext', 'Tipos de Archivo de Datos Externos', NULL, NULL, 1, 31220, 312200101, NULL, 3);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (3123001, 0, 'archivo_datos_ext', 'Archivos de Datos Externos', NULL, NULL, 1, 31230, 312300101, 3121001, 3);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (3201001, 0, 'ficha_hogar', 'Fichas de Hogar', NULL, NULL, 1, 32010, 320100101, NULL, 3);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (3202001, 0, 'ficha_persona', 'Fichas de Persona', NULL, NULL, 1, 32020, 320200101, NULL, 3);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (3203001, 0, 'funcionario', 'Funcionarios', NULL, NULL, 1, 32030, 320300101, NULL, 3);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (3204001, 0, 'potencial_ben', 'Potenciales Beneficiarios', NULL, NULL, 1, 32040, 320400101, NULL, 3);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (3211001, 0, 'nivel_educativo', 'Niveles Educativos', NULL, NULL, 1, 32110, 321100101, NULL, 3);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (3214001, 0, 'causa_impedimento', 'Causas del Impedimento', NULL, NULL, 1, 32140, 321400101, NULL, 3);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (3215001, 0, 'estado_salud', 'Estados de Salud General', NULL, NULL, 1, 32150, 321500101, NULL, 3);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (3216001, 0, 'idioma_hogar', 'Idiomas', NULL, NULL, 1, 32160, 321600101, NULL, 3);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (3217001, 0, 'motivo_ina_esc', 'Motivos de Inasistencia Escolar', NULL, NULL, 1, 32170, 321700101, NULL, 3);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (3218001, 0, 'motivo_no_atencion', 'Motivos de No Atención Médica', NULL, NULL, 1, 32180, 321800101, NULL, 3);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (3219001, 0, 'motivo_no_trabajo', 'Motivos de No Trabajo', NULL, NULL, 1, 32190, 321900101, NULL, 3);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (3220001, 0, 'siono', 'Opciones de Si o No', NULL, NULL, 1, 32200, 322000101, NULL, 3);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (3221001, 0, 'tipo_aba_agua', 'Tipos de Abastecimiento de Agua', NULL, NULL, 1, 32210, 322100101, NULL, 3);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (3222001, 0, 'tipo_area', 'Tipos de Area', NULL, NULL, 1, 32220, 322200101, NULL, 3);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (3223001, 0, 'tipo_combustible', 'Tipos de Combustible para Cocina', NULL, NULL, 1, 32230, 322300101, NULL, 3);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (3224001, 0, 'tipo_desecho_bas', 'Tipos de Desecho de la Basura', NULL, NULL, 1, 32240, 322400101, NULL, 3);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (3225001, 0, 'clase_enf_acc', 'Clases de Enfermedad y/o Accidente', NULL, NULL, 1, 32250, 322500101, NULL, 3);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (3226001, 0, 'clase_enf_cronica', 'Clases de Enfermedad Crónica', NULL, NULL, 1, 32260, 322600101, NULL, 3);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (3227001, 0, 'tipo_excepcion_ced', 'Tipos de Excepción de Cédula', NULL, NULL, 1, 32270, 322700101, NULL, 3);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (3228001, 0, 'clase_impedimento', 'Clases de Impedimento', NULL, NULL, 1, 32280, 322800101, NULL, 3);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (3229001, 0, 'tipo_mat_paredes', 'Tipos de Material de Paredes Exteriores', NULL, NULL, 1, 32290, 322900101, NULL, 3);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (3230001, 0, 'tipo_mat_piso', 'Tipos de Material de Pisos', NULL, NULL, 1, 32300, 323000101, NULL, 3);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (3231001, 0, 'tipo_mat_techo', 'Tipos de Material de Techos', NULL, NULL, 1, 32310, 323100101, NULL, 3);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (3232001, 0, 'tipo_ocupacion_viv', 'Tipos de Ocupación de Vivienda', NULL, NULL, 1, 32320, 323200101, NULL, 3);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (3233001, 0, 'tipo_persona_hogar', 'Tipos de Persona en el Hogar', NULL, NULL, 1, 32330, 323300101, NULL, 3);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (3234001, 0, 'tipo_relacion_lab', 'Tipos de Relación Laboral', NULL, NULL, 1, 32340, 323400101, NULL, 3);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (3235001, 0, 'tipo_seguro_medico', 'Tipos de Seguro Médico', NULL, NULL, 1, 32350, 323500101, NULL, 3);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (3236001, 0, 'tipo_servicio_agua', 'Tipos de Servicio de Agua', NULL, NULL, 1, 32360, 323600101, NULL, 3);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (3237001, 0, 'tipo_servicio_san', 'Tipos de Servicio Sanitario', NULL, NULL, 1, 32370, 323700101, NULL, 3);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (3238001, 0, 'tipo_reg_pot_ben', 'Tipos de Registro de Potencial Beneficiario', NULL, NULL, 1, 32380, 323800101, NULL, 3);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (3240001, 0, 'visita_censo', 'VisItas de Censo', NULL, NULL, 1, 32400, 324000101, NULL, 3);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (3241001, 0, 'condicion_censo', 'Condiciones Censos', NULL, NULL, 1, 32410, 324100101, NULL, 3);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (3242001, 0, 'condicion_recl_cen', 'Condiciones de Reclamo de Censo', NULL, NULL, 1, 32420, 324200101, NULL, 3);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (3243001, 0, 'tipo_act_jupe', 'Tipos de Actualización JUPE', NULL, NULL, 1, 32430, 324300101, NULL, 3);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (3244001, 0, 'tipo_pieza_bano', 'Tipos de Pieza de Baño', NULL, NULL, 1, 32440, 324400101, NULL, 3);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (3245001, 0, 'objecion_ele_pen', 'Objeciones de Elegibilidad de Pensión', NULL, NULL, 1, 32450, 324500101, NULL, 3);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (3246001, 0, 'tipo_obj_ele_pen', 'Tipos de Objeción de Elegibilidad de Pensión', NULL, NULL, 1, 32460, 324600101, NULL, 3);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (3301001, 0, 'log_imp_deu', 'Rastros de Importación de Deudores', NULL, NULL, 1, 33010, 330100101, NULL, 3);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (3302001, 0, 'log_imp_emp', 'Rastros de Importación de Empleados', NULL, NULL, 1, 33020, 330200101, NULL, 3);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (3303001, 0, 'log_imp_fal', 'Rastros de Importación de Fallecidos', NULL, NULL, 1, 33030, 330300101, NULL, 3);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (3304001, 0, 'log_imp_ids', 'Rastros de Importación de Identificaciones', NULL, NULL, 1, 33040, 330400101, NULL, 3);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (3305001, 0, 'log_imp_jub', 'Rastros de Importación de Jubilados y Pensionados', NULL, NULL, 1, 33050, 330500101, NULL, 3);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (3306001, 0, 'log_imp_pen', 'Rastros de Importación de Penas Judiciales', NULL, NULL, 1, 33060, 330600101, NULL, 3);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (3307001, 0, 'log_imp_pot', 'Rastros de Importación de Potenciales Beneficiarios', NULL, NULL, 1, 33070, 330700101, NULL, 3);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (3308001, 0, 'log_imp_sub', 'Rastros de Importación de Subsidios', NULL, NULL, 1, 33080, 330800101, NULL, 3);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (3310001, 0, 'log_imp_cen', 'Rastros de Importación de Censos Validados', NULL, NULL, 1, 33100, 331000101, NULL, 3);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (3311001, 0, 'log_imp_hog', 'Rastros de Importación de Fichas Hogar', NULL, NULL, 1, 33110, 331100101, NULL, 3);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (3312001, 0, 'log_imp_per', 'Rastros de Importación de Fichas Persona', NULL, NULL, 1, 33120, 331200101, NULL, 3);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (3313001, 0, 'log_imp_ubi', 'Rastros de Importación de Ubicaciones', NULL, NULL, 1, 33130, 331300101, NULL, 3);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (3321001, 0, 'log_pro_acr_pot_ben', 'Rastros de Acreditación de Potenciales Beneficiarios', NULL, NULL, 1, 33210, 332100101, NULL, 3);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (3322001, 0, 'log_pro_oto_pen_apr', 'Rastros de Otorgamiento de Pensiones', NULL, NULL, 1, 33220, 332200101, NULL, 3);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (3323001, 0, 'log_pro_pre_pro_pag', 'Rastros de Preparación de Pagos', NULL, NULL, 1, 33230, 332300101, NULL, 3);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (3324001, 0, 'log_pro_ver_ele_pen', 'Rastros de Verificación de Elegibles', NULL, NULL, 1, 33240, 332400101, NULL, 3);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (3325001, 0, 'log_pro_imp_arc_ext', 'Rastros de Importación de Archivos Externos', NULL, NULL, 1, 33250, 332500101, NULL, 3);
INSERT INTO dominio (id_dominio, version_dominio, codigo_dominio, nombre_dominio, descripcion_dominio, nombre_tabla, numero_tipo_dominio, id_clase_recurso, id_funcion_seleccion, id_dominio_segmento, id_paquete)
VALUES (3326001, 0, 'log_pro_den_pen_obj', 'Rastros de Denegación de Pensiones', NULL, NULL, 1, 33260, 332600101, NULL, 3);
GO
