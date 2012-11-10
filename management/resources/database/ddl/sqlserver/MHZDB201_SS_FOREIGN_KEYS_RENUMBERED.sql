ALTER TABLE aplicacion ADD CONSTRAINT FK_aplicacion_0001_ZYX FOREIGN KEY (id_grupo_aplicacion) REFERENCES grupo_aplicacion (id_grupo_aplicacion) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE archivo_datos_ext ADD CONSTRAINT FK_archivo_datos_ext_0001_ZYX FOREIGN KEY (id_proveedor_dat_ext) REFERENCES proveedor_dat_ext (id_proveedor_dat_ext) ON DELETE CASCADE ON UPDATE CASCADE
GO
ALTER TABLE archivo_datos_ext ADD CONSTRAINT FK_archivo_datos_ext_0002_ZYX FOREIGN KEY (numero_tipo_arc_dat_ext) REFERENCES tipo_arc_dat_ext (numero_tipo_arc_dat_ext) ON DELETE CASCADE ON UPDATE CASCADE
GO
ALTER TABLE archivo_datos_ext ADD CONSTRAINT FK_archivo_datos_ext_0003_ZYX FOREIGN KEY (id_usuario_ultima_carga) REFERENCES usuario (id_usuario) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE archivo_datos_ext ADD CONSTRAINT FK_archivo_datos_ext_0004_ZYX FOREIGN KEY (id_usuario_ultima_importacion) REFERENCES usuario (id_usuario) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE clase_recurso ADD CONSTRAINT FK_clase_recurso_0001_ZYX FOREIGN KEY (numero_tipo_recurso) REFERENCES tipo_recurso (numero_tipo_recurso) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE clase_recurso ADD CONSTRAINT FK_clase_recurso_0002_ZYX FOREIGN KEY (id_clase_recurso_segmento) REFERENCES clase_recurso (id_clase_recurso) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE clase_recurso ADD CONSTRAINT FK_clase_recurso_0003_ZYX FOREIGN KEY (id_pagina_seleccion) REFERENCES pagina (id_pagina) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE clase_recurso ADD CONSTRAINT FK_clase_recurso_0004_ZYX FOREIGN KEY (id_funcion_seleccion) REFERENCES funcion (id_funcion) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE clase_recurso ADD CONSTRAINT FK_clase_recurso_0005_ZYX FOREIGN KEY (id_pagina_detalle) REFERENCES pagina (id_pagina) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE clase_recurso ADD CONSTRAINT FK_clase_recurso_0006_ZYX FOREIGN KEY (id_clase_recurso_maestro) REFERENCES clase_recurso (id_clase_recurso) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE clase_recurso ADD CONSTRAINT FK_clase_recurso_0007_ZYX FOREIGN KEY (id_grupo_aplicacion) REFERENCES grupo_aplicacion (id_grupo_aplicacion) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE clase_recurso ADD CONSTRAINT FK_clase_recurso_0008_ZYX FOREIGN KEY (id_clase_recurso_base) REFERENCES clase_recurso (id_clase_recurso) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE clase_recurso ADD CONSTRAINT FK_clase_recurso_0009_ZYX FOREIGN KEY (numero_tipo_clase_recurso) REFERENCES tipo_clase_recurso (numero_tipo_clase_recurso) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE clase_recurso_par ADD CONSTRAINT FK_clase_recurso_par_0001_ZYX FOREIGN KEY (numero_tipo_comparacion) REFERENCES tipo_comparacion (numero_tipo_comparacion) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE clase_recurso_par ADD CONSTRAINT FK_clase_recurso_par_0002_ZYX FOREIGN KEY (id_clase_recurso) REFERENCES clase_recurso (id_clase_recurso) ON DELETE CASCADE ON UPDATE CASCADE
GO
ALTER TABLE clase_recurso_par ADD CONSTRAINT FK_clase_recurso_par_0003_ZYX FOREIGN KEY (id_parametro) REFERENCES parametro (id_parametro) ON DELETE NO ACTION ON UPDATE CASCADE
GO
ALTER TABLE clase_recurso_par ADD CONSTRAINT FK_clase_recurso_par_0004_ZYX FOREIGN KEY (id_clase_recurso_valor) REFERENCES clase_recurso (id_clase_recurso) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE clase_recurso_par ADD CONSTRAINT FK_clase_recurso_par_0005_ZYX FOREIGN KEY (numero_tipo_parametro) REFERENCES tipo_parametro (numero_tipo_parametro) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE clase_recurso_par ADD CONSTRAINT FK_clase_recurso_par_0006_ZYX FOREIGN KEY (id_funcion_referencia) REFERENCES funcion (id_funcion) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE clase_recurso_par ADD CONSTRAINT FK_clase_recurso_par_0007_ZYX FOREIGN KEY (numero_tipo_valor) REFERENCES tipo_valor (numero_tipo_valor) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE clase_recurso_par ADD CONSTRAINT FK_clase_recurso_par_0008_ZYX FOREIGN KEY (id_clase_recurso_sec) REFERENCES clase_recurso_sec (id_clase_recurso_sec) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE clase_recurso_par ADD CONSTRAINT FK_clase_recurso_par_0009_ZYX FOREIGN KEY (numero_tipo_valor_alternativo) REFERENCES tipo_valor (numero_tipo_valor) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE clase_recurso_sec ADD CONSTRAINT FK_clase_recurso_sec_0001_ZYX FOREIGN KEY (id_clase_recurso) REFERENCES clase_recurso (id_clase_recurso) ON DELETE CASCADE ON UPDATE CASCADE
GO
ALTER TABLE conjunto_segmento ADD CONSTRAINT FK_conjunto_segmento_0001_ZYX FOREIGN KEY (id_clase_recurso) REFERENCES clase_recurso (id_clase_recurso) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE dominio ADD CONSTRAINT FK_dominio_0001_ZYX FOREIGN KEY (numero_tipo_dominio) REFERENCES tipo_dominio (numero_tipo_dominio) ON DELETE NO ACTION ON UPDATE CASCADE
GO
ALTER TABLE dominio ADD CONSTRAINT FK_dominio_0002_ZYX FOREIGN KEY (id_clase_recurso) REFERENCES clase_recurso (id_clase_recurso) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE dominio ADD CONSTRAINT FK_dominio_0003_ZYX FOREIGN KEY (id_funcion_seleccion) REFERENCES funcion (id_funcion) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE dominio ADD CONSTRAINT FK_dominio_0004_ZYX FOREIGN KEY (id_dominio_segmento) REFERENCES dominio (id_dominio) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE dominio ADD CONSTRAINT FK_dominio_0005_ZYX FOREIGN KEY (id_paquete) REFERENCES paquete (id_paquete) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE dominio_paquete ADD CONSTRAINT FK_dominio_paquete_0001_ZYX FOREIGN KEY (id_dominio) REFERENCES dominio (id_dominio) ON DELETE CASCADE ON UPDATE CASCADE
GO
ALTER TABLE dominio_paquete ADD CONSTRAINT FK_dominio_paquete_0002_ZYX FOREIGN KEY (id_paquete) REFERENCES paquete (id_paquete) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE dominio_parametro ADD CONSTRAINT FK_dominio_parametro_0001_ZYX FOREIGN KEY (id_dominio) REFERENCES dominio (id_dominio) ON DELETE CASCADE ON UPDATE CASCADE
GO
ALTER TABLE dominio_parametro ADD CONSTRAINT FK_dominio_parametro_0002_ZYX FOREIGN KEY (id_parametro) REFERENCES parametro (id_parametro) ON DELETE NO ACTION ON UPDATE CASCADE
GO
ALTER TABLE dominio_parametro ADD CONSTRAINT FK_dominio_parametro_0003_ZYX FOREIGN KEY (numero_tipo_parametro_dom) REFERENCES tipo_parametro_dom (numero_tipo_parametro_dom) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE elemento_segmento ADD CONSTRAINT FK_elemento_segmento_0001_ZYX FOREIGN KEY (id_conjunto_segmento) REFERENCES conjunto_segmento (id_conjunto_segmento) ON DELETE CASCADE ON UPDATE NO ACTION
GO
ALTER TABLE ficha_hogar ADD CONSTRAINT FK_ficha_hogar_0001_ZYX FOREIGN KEY (id_funcionario_censista) REFERENCES funcionario (id_funcionario) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE ficha_hogar ADD CONSTRAINT FK_ficha_hogar_0002_ZYX FOREIGN KEY (id_funcionario_supervisor) REFERENCES funcionario (id_funcionario) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE ficha_hogar ADD CONSTRAINT FK_ficha_hogar_0003_ZYX FOREIGN KEY (id_funcionario_critico_deco) REFERENCES funcionario (id_funcionario) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE ficha_hogar ADD CONSTRAINT FK_ficha_hogar_0004_ZYX FOREIGN KEY (id_funcionario_digitador) REFERENCES funcionario (id_funcionario) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE ficha_hogar ADD CONSTRAINT FK_ficha_hogar_0005_ZYX FOREIGN KEY (id_departamento) REFERENCES ubicacion (id_ubicacion) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE ficha_hogar ADD CONSTRAINT FK_ficha_hogar_0006_ZYX FOREIGN KEY (id_distrito) REFERENCES ubicacion (id_ubicacion) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE ficha_hogar ADD CONSTRAINT FK_ficha_hogar_0007_ZYX FOREIGN KEY (id_barrio) REFERENCES ubicacion (id_ubicacion) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE ficha_hogar ADD CONSTRAINT FK_ficha_hogar_0008_ZYX FOREIGN KEY (id_manzana) REFERENCES ubicacion (id_ubicacion) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE ficha_hogar ADD CONSTRAINT FK_ficha_hogar_0009_ZYX FOREIGN KEY (numero_siono_corriente_elec) REFERENCES siono (numero_siono) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE ficha_hogar ADD CONSTRAINT FK_ficha_hogar_0010_ZYX FOREIGN KEY (numero_siono_disp_aire_acon) REFERENCES siono (numero_siono) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE ficha_hogar ADD CONSTRAINT FK_ficha_hogar_0011_ZYX FOREIGN KEY (numero_siono_disp_automovil) REFERENCES siono (numero_siono) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE ficha_hogar ADD CONSTRAINT FK_ficha_hogar_0012_ZYX FOREIGN KEY (numero_siono_disp_camion) REFERENCES siono (numero_siono) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE ficha_hogar ADD CONSTRAINT FK_ficha_hogar_0013_ZYX FOREIGN KEY (numero_siono_disp_heladera) REFERENCES siono (numero_siono) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE ficha_hogar ADD CONSTRAINT FK_ficha_hogar_0014_ZYX FOREIGN KEY (numero_siono_disp_lavarropas) REFERENCES siono (numero_siono) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE ficha_hogar ADD CONSTRAINT FK_ficha_hogar_0015_ZYX FOREIGN KEY (numero_siono_disp_motocicleta) REFERENCES siono (numero_siono) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE ficha_hogar ADD CONSTRAINT FK_ficha_hogar_0016_ZYX FOREIGN KEY (numero_siono_disp_termo) REFERENCES siono (numero_siono) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE ficha_hogar ADD CONSTRAINT FK_ficha_hogar_0017_ZYX FOREIGN KEY (numero_siono_pieza_cocina) REFERENCES siono (numero_siono) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE ficha_hogar ADD CONSTRAINT FK_ficha_hogar_0018_ZYX FOREIGN KEY (numero_siono_telefono_celular) REFERENCES siono (numero_siono) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE ficha_hogar ADD CONSTRAINT FK_ficha_hogar_0019_ZYX FOREIGN KEY (numero_siono_tlf_linea_baja) REFERENCES siono (numero_siono) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE ficha_hogar ADD CONSTRAINT FK_ficha_hogar_0020_ZYX FOREIGN KEY (numero_tipo_aba_agua) REFERENCES tipo_aba_agua (numero_tipo_aba_agua) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE ficha_hogar ADD CONSTRAINT FK_ficha_hogar_0021_ZYX FOREIGN KEY (numero_tipo_area) REFERENCES tipo_area (numero_tipo_area) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE ficha_hogar ADD CONSTRAINT FK_ficha_hogar_0022_ZYX FOREIGN KEY (numero_tipo_combustible) REFERENCES tipo_combustible (numero_tipo_combustible) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE ficha_hogar ADD CONSTRAINT FK_ficha_hogar_0023_ZYX FOREIGN KEY (numero_tipo_desecho_bas) REFERENCES tipo_desecho_bas (numero_tipo_desecho_bas) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE ficha_hogar ADD CONSTRAINT FK_ficha_hogar_0024_ZYX FOREIGN KEY (numero_tipo_mat_paredes) REFERENCES tipo_mat_paredes (numero_tipo_mat_paredes) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE ficha_hogar ADD CONSTRAINT FK_ficha_hogar_0025_ZYX FOREIGN KEY (numero_tipo_mat_piso) REFERENCES tipo_mat_piso (numero_tipo_mat_piso) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE ficha_hogar ADD CONSTRAINT FK_ficha_hogar_0026_ZYX FOREIGN KEY (numero_tipo_mat_techo) REFERENCES tipo_mat_techo (numero_tipo_mat_techo) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE ficha_hogar ADD CONSTRAINT FK_ficha_hogar_0027_ZYX FOREIGN KEY (numero_tipo_ocupacion_viv) REFERENCES tipo_ocupacion_viv (numero_tipo_ocupacion_viv) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE ficha_hogar ADD CONSTRAINT FK_ficha_hogar_0028_ZYX FOREIGN KEY (numero_tipo_servicio_agua) REFERENCES tipo_servicio_agua (numero_tipo_servicio_agua) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE ficha_hogar ADD CONSTRAINT FK_ficha_hogar_0029_ZYX FOREIGN KEY (numero_tipo_servicio_san) REFERENCES tipo_servicio_san (numero_tipo_servicio_san) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE ficha_hogar ADD CONSTRAINT FK_ficha_hogar_0030_ZYX FOREIGN KEY (id_proveedor_dat_ext) REFERENCES proveedor_dat_ext (id_proveedor_dat_ext) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE ficha_hogar ADD CONSTRAINT FK_ficha_hogar_0031_ZYX FOREIGN KEY (numero_tipo_pieza_bano) REFERENCES tipo_pieza_bano (numero_tipo_pieza_bano) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE ficha_persona ADD CONSTRAINT FK_ficha_persona_0001_ZYX FOREIGN KEY (id_ficha_hogar) REFERENCES ficha_hogar (id_ficha_hogar) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE ficha_persona ADD CONSTRAINT FK_ficha_persona_0002_ZYX FOREIGN KEY (numero_sexo_persona) REFERENCES sexo_persona (numero_sexo_persona) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE ficha_persona ADD CONSTRAINT FK_ficha_persona_0003_ZYX FOREIGN KEY (numero_estado_civil) REFERENCES estado_civil (numero_estado_civil) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE ficha_persona ADD CONSTRAINT FK_ficha_persona_0004_ZYX FOREIGN KEY (id_departamento_nacimiento) REFERENCES ubicacion (id_ubicacion) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE ficha_persona ADD CONSTRAINT FK_ficha_persona_0005_ZYX FOREIGN KEY (id_distrito_nacimiento) REFERENCES ubicacion (id_ubicacion) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE ficha_persona ADD CONSTRAINT FK_ficha_persona_0006_ZYX FOREIGN KEY (numero_causa_impedimento) REFERENCES causa_impedimento (numero_causa_impedimento) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE ficha_persona ADD CONSTRAINT FK_ficha_persona_0007_ZYX FOREIGN KEY (numero_estado_salud) REFERENCES estado_salud (numero_estado_salud) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE ficha_persona ADD CONSTRAINT FK_ficha_persona_0008_ZYX FOREIGN KEY (numero_idioma_hogar) REFERENCES idioma_hogar (numero_idioma_hogar) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE ficha_persona ADD CONSTRAINT FK_ficha_persona_0009_ZYX FOREIGN KEY (numero_motivo_ina_esc) REFERENCES motivo_ina_esc (numero_motivo_ina_esc) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE ficha_persona ADD CONSTRAINT FK_ficha_persona_0010_ZYX FOREIGN KEY (numero_motivo_no_atencion) REFERENCES motivo_no_atencion (numero_motivo_no_atencion) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE ficha_persona ADD CONSTRAINT FK_ficha_persona_0011_ZYX FOREIGN KEY (numero_motivo_no_trabajo) REFERENCES motivo_no_trabajo (numero_motivo_no_trabajo) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE ficha_persona ADD CONSTRAINT FK_ficha_persona_0012_ZYX FOREIGN KEY (numero_siono_asistencia_esc) REFERENCES siono (numero_siono) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE ficha_persona ADD CONSTRAINT FK_ficha_persona_0013_ZYX FOREIGN KEY (numero_siono_atencion_medica) REFERENCES siono (numero_siono) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE ficha_persona ADD CONSTRAINT FK_ficha_persona_0014_ZYX FOREIGN KEY (numero_siono_carnet_vacunacion) REFERENCES siono (numero_siono) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE ficha_persona ADD CONSTRAINT FK_ficha_persona_0015_ZYX FOREIGN KEY (numero_siono_curso_no_formal) REFERENCES siono (numero_siono) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE ficha_persona ADD CONSTRAINT FK_ficha_persona_0016_ZYX FOREIGN KEY (numero_siono_dif_para_banarse) REFERENCES siono (numero_siono) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE ficha_persona ADD CONSTRAINT FK_ficha_persona_0017_ZYX FOREIGN KEY (numero_siono_dif_para_caminar) REFERENCES siono (numero_siono) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE ficha_persona ADD CONSTRAINT FK_ficha_persona_0018_ZYX FOREIGN KEY (numero_siono_dif_para_comer) REFERENCES siono (numero_siono) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE ficha_persona ADD CONSTRAINT FK_ficha_persona_0019_ZYX FOREIGN KEY (numero_siono_dif_para_el_bano) REFERENCES siono (numero_siono) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE ficha_persona ADD CONSTRAINT FK_ficha_persona_0020_ZYX FOREIGN KEY (numero_siono_dif_para_la_cama) REFERENCES siono (numero_siono) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE ficha_persona ADD CONSTRAINT FK_ficha_persona_0021_ZYX FOREIGN KEY (numero_siono_dif_para_vestirse) REFERENCES siono (numero_siono) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE ficha_persona ADD CONSTRAINT FK_ficha_persona_0022_ZYX FOREIGN KEY (numero_siono_matriculacion_esc) REFERENCES siono (numero_siono) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE ficha_persona ADD CONSTRAINT FK_ficha_persona_0023_ZYX FOREIGN KEY (numero_siono_miembro_hogar) REFERENCES siono (numero_siono) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE ficha_persona ADD CONSTRAINT FK_ficha_persona_0024_ZYX FOREIGN KEY (numero_siono_trabajo) REFERENCES siono (numero_siono) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE ficha_persona ADD CONSTRAINT FK_ficha_persona_0025_ZYX FOREIGN KEY (numero_tipo_area_lugar_nac) REFERENCES tipo_area (numero_tipo_area) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE ficha_persona ADD CONSTRAINT FK_ficha_persona_0026_ZYX FOREIGN KEY (numero_clase_enf_acc) REFERENCES clase_enf_acc (numero_clase_enf_acc) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE ficha_persona ADD CONSTRAINT FK_ficha_persona_0027_ZYX FOREIGN KEY (numero_clase_enf_cronica) REFERENCES clase_enf_cronica (numero_clase_enf_cronica) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE ficha_persona ADD CONSTRAINT FK_ficha_persona_0028_ZYX FOREIGN KEY (numero_tipo_excepcion_ced) REFERENCES tipo_excepcion_ced (numero_tipo_excepcion_ced) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE ficha_persona ADD CONSTRAINT FK_ficha_persona_0029_ZYX FOREIGN KEY (numero_clase_impedimento) REFERENCES clase_impedimento (numero_clase_impedimento) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE ficha_persona ADD CONSTRAINT FK_ficha_persona_0030_ZYX FOREIGN KEY (numero_tipo_persona_hogar) REFERENCES tipo_persona_hogar (numero_tipo_persona_hogar) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE ficha_persona ADD CONSTRAINT FK_ficha_persona_0031_ZYX FOREIGN KEY (numero_tipo_relacion_lab) REFERENCES tipo_relacion_lab (numero_tipo_relacion_lab) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE ficha_persona ADD CONSTRAINT FK_ficha_persona_0032_ZYX FOREIGN KEY (numero_tipo_seguro_medico) REFERENCES tipo_seguro_medico (numero_tipo_seguro_medico) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE ficha_persona ADD CONSTRAINT FK_ficha_persona_0033_ZYX FOREIGN KEY (numero_nivel_edu_ult_cur_aprob) REFERENCES nivel_educativo (numero_nivel_educativo) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE ficha_persona ADD CONSTRAINT FK_ficha_persona_0034_ZYX FOREIGN KEY (id_potencial_ben) REFERENCES potencial_ben (id_potencial_ben) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE filtro_cla_rec_fun ADD CONSTRAINT FK_filtro_cla_rec_fun_0001_ZYX FOREIGN KEY (id_funcion) REFERENCES funcion (id_funcion) ON DELETE CASCADE ON UPDATE CASCADE
GO
ALTER TABLE filtro_cla_rec_fun ADD CONSTRAINT FK_filtro_cla_rec_fun_0002_ZYX FOREIGN KEY (id_clase_recurso_par_columna) REFERENCES clase_recurso_par (id_clase_recurso_par) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE filtro_cla_rec_fun ADD CONSTRAINT FK_filtro_cla_rec_fun_0003_ZYX FOREIGN KEY (id_clase_recurso_par_valor) REFERENCES clase_recurso_par (id_clase_recurso_par) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE filtro_cla_rec_fun ADD CONSTRAINT FK_filtro_cla_rec_fun_0004_ZYX FOREIGN KEY (numero_operador_com) REFERENCES operador_com (numero_operador_com) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE filtro_cla_rec_par ADD CONSTRAINT FK_filtro_cla_rec_par_0001_ZYX FOREIGN KEY (id_clase_recurso_par) REFERENCES clase_recurso_par (id_clase_recurso_par) ON DELETE CASCADE ON UPDATE CASCADE
GO
ALTER TABLE filtro_cla_rec_par ADD CONSTRAINT FK_filtro_cla_rec_par_0002_ZYX FOREIGN KEY (id_clase_recurso_par_columna) REFERENCES clase_recurso_par (id_clase_recurso_par) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE filtro_cla_rec_par ADD CONSTRAINT FK_filtro_cla_rec_par_0003_ZYX FOREIGN KEY (id_clase_recurso_par_valor) REFERENCES clase_recurso_par (id_clase_recurso_par) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE filtro_cla_rec_par ADD CONSTRAINT FK_filtro_cla_rec_par_0004_ZYX FOREIGN KEY (numero_operador_com) REFERENCES operador_com (numero_operador_com) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE filtro_cla_rec_sec ADD CONSTRAINT FK_filtro_cla_rec_sec_0001_ZYX FOREIGN KEY (id_clase_recurso_sec) REFERENCES clase_recurso_sec (id_clase_recurso_sec) ON DELETE CASCADE ON UPDATE CASCADE
GO
ALTER TABLE filtro_cla_rec_sec ADD CONSTRAINT FK_filtro_cla_rec_sec_0002_ZYX FOREIGN KEY (id_clase_recurso_par_columna) REFERENCES clase_recurso_par (id_clase_recurso_par) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE filtro_cla_rec_sec ADD CONSTRAINT FK_filtro_cla_rec_sec_0003_ZYX FOREIGN KEY (id_clase_recurso_par_valor) REFERENCES clase_recurso_par (id_clase_recurso_par) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE filtro_cla_rec_sec ADD CONSTRAINT FK_filtro_cla_rec_sec_0004_ZYX FOREIGN KEY (numero_operador_com) REFERENCES operador_com (numero_operador_com) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE filtro_cla_rec_vin ADD CONSTRAINT FK_filtro_cla_rec_vin_0001_ZYX FOREIGN KEY (id_clase_recurso_par) REFERENCES clase_recurso_par (id_clase_recurso_par) ON DELETE CASCADE ON UPDATE CASCADE
GO
ALTER TABLE filtro_cla_rec_vin ADD CONSTRAINT FK_filtro_cla_rec_vin_0002_ZYX FOREIGN KEY (id_clase_recurso_par_columna) REFERENCES clase_recurso_par (id_clase_recurso_par) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE filtro_cla_rec_vin ADD CONSTRAINT FK_filtro_cla_rec_vin_0003_ZYX FOREIGN KEY (id_clase_recurso_par_valor) REFERENCES clase_recurso_par (id_clase_recurso_par) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE filtro_cla_rec_vin ADD CONSTRAINT FK_filtro_cla_rec_vin_0004_ZYX FOREIGN KEY (numero_operador_com) REFERENCES operador_com (numero_operador_com) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE filtro_funcion ADD CONSTRAINT FK_filtro_funcion_0001_ZYX FOREIGN KEY (id_funcion) REFERENCES funcion (id_funcion) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE filtro_funcion ADD CONSTRAINT FK_filtro_funcion_0002_ZYX FOREIGN KEY (id_usuario) REFERENCES usuario (id_usuario) ON DELETE CASCADE ON UPDATE CASCADE
GO
ALTER TABLE filtro_funcion_par ADD CONSTRAINT FK_filtro_funcion_par_0001_ZYX FOREIGN KEY (id_filtro_funcion) REFERENCES filtro_funcion (id_filtro_funcion) ON DELETE CASCADE ON UPDATE CASCADE
GO
ALTER TABLE filtro_funcion_par ADD CONSTRAINT FK_filtro_funcion_par_0002_ZYX FOREIGN KEY (id_funcion_parametro) REFERENCES funcion_parametro (id_funcion_parametro) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE filtro_funcion_par ADD CONSTRAINT FK_filtro_funcion_par_0003_ZYX FOREIGN KEY (numero_operador_com) REFERENCES operador_com (numero_operador_com) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE funcion ADD CONSTRAINT FK_funcion_0001_ZYX FOREIGN KEY (numero_tipo_funcion) REFERENCES tipo_funcion (numero_tipo_funcion) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE funcion ADD CONSTRAINT FK_funcion_0002_ZYX FOREIGN KEY (numero_tipo_rastro_fun) REFERENCES tipo_rastro_fun (numero_tipo_rastro_fun) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE funcion ADD CONSTRAINT FK_funcion_0003_ZYX FOREIGN KEY (id_dominio) REFERENCES dominio (id_dominio) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE funcion ADD CONSTRAINT FK_funcion_0004_ZYX FOREIGN KEY (id_grupo_proceso) REFERENCES grupo_proceso (id_grupo_proceso) ON DELETE NO ACTION ON UPDATE CASCADE
GO
ALTER TABLE funcion_parametro ADD CONSTRAINT FK_funcion_parametro_0001_ZYX FOREIGN KEY (numero_tipo_comparacion) REFERENCES tipo_comparacion (numero_tipo_comparacion) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE funcion_parametro ADD CONSTRAINT FK_funcion_parametro_0002_ZYX FOREIGN KEY (id_funcion) REFERENCES funcion (id_funcion) ON DELETE CASCADE ON UPDATE CASCADE
GO
ALTER TABLE funcion_parametro ADD CONSTRAINT FK_funcion_parametro_0003_ZYX FOREIGN KEY (id_parametro) REFERENCES parametro (id_parametro) ON DELETE NO ACTION ON UPDATE CASCADE
GO
ALTER TABLE funcion_parametro ADD CONSTRAINT FK_funcion_parametro_0004_ZYX FOREIGN KEY (id_clase_recurso_valor) REFERENCES clase_recurso (id_clase_recurso) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE funcion_parametro ADD CONSTRAINT FK_funcion_parametro_0005_ZYX FOREIGN KEY (numero_tipo_parametro) REFERENCES tipo_parametro (numero_tipo_parametro) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE funcion_parametro ADD CONSTRAINT FK_funcion_parametro_0006_ZYX FOREIGN KEY (id_funcion_referencia) REFERENCES funcion (id_funcion) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE funcion_parametro ADD CONSTRAINT FK_funcion_parametro_0007_ZYX FOREIGN KEY (numero_tipo_valor) REFERENCES tipo_valor (numero_tipo_valor) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE grupo_proceso ADD CONSTRAINT FK_grupo_proceso_0001_ZYX FOREIGN KEY (numero_condicion_eje_fun) REFERENCES condicion_eje_fun (numero_condicion_eje_fun) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE objecion_ele_pen ADD CONSTRAINT FK_objecion_ele_pen_0001_ZYX FOREIGN KEY (id_proveedor_dat_ext) REFERENCES proveedor_dat_ext (id_proveedor_dat_ext) ON DELETE CASCADE ON UPDATE CASCADE
GO
ALTER TABLE objecion_ele_pen ADD CONSTRAINT FK_objecion_ele_pen_0002_ZYX FOREIGN KEY (numero_tipo_obj_ele_pen) REFERENCES tipo_obj_ele_pen (numero_tipo_obj_ele_pen) ON DELETE CASCADE ON UPDATE CASCADE
GO
ALTER TABLE objecion_ele_pen ADD CONSTRAINT FK_objecion_ele_pen_0003_ZYX FOREIGN KEY (id_persona) REFERENCES persona (id_persona) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE opcion_menu ADD CONSTRAINT FK_opcion_menu_0001_ZYX FOREIGN KEY (numero_nivel_opcion_menu) REFERENCES nivel_opcion_menu (numero_nivel_opcion_menu) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE opcion_menu ADD CONSTRAINT FK_opcion_menu_0002_ZYX FOREIGN KEY (id_opcion_menu_superior) REFERENCES opcion_menu (id_opcion_menu) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE opcion_menu ADD CONSTRAINT FK_opcion_menu_0003_ZYX FOREIGN KEY (numero_tipo_nodo) REFERENCES tipo_nodo (numero_tipo_nodo) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE opcion_menu ADD CONSTRAINT FK_opcion_menu_0004_ZYX FOREIGN KEY (id_pagina) REFERENCES pagina (id_pagina) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE opcion_menu ADD CONSTRAINT FK_opcion_menu_0005_ZYX FOREIGN KEY (id_aplicacion) REFERENCES aplicacion (id_aplicacion) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE opcion_menu_plus ADD CONSTRAINT FK_opcion_menu_plus_0001_ZYX FOREIGN KEY (numero_nivel_opcion_menu) REFERENCES nivel_opcion_menu (numero_nivel_opcion_menu) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE opcion_menu_plus ADD CONSTRAINT FK_opcion_menu_plus_0002_ZYX FOREIGN KEY (numero_tipo_nodo) REFERENCES tipo_nodo (numero_tipo_nodo) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE pagina ADD CONSTRAINT FK_pagina_0001_ZYX FOREIGN KEY (id_aplicacion) REFERENCES aplicacion (id_aplicacion) ON DELETE CASCADE ON UPDATE CASCADE
GO
ALTER TABLE pagina ADD CONSTRAINT FK_pagina_0002_ZYX FOREIGN KEY (numero_tipo_pagina) REFERENCES tipo_pagina (numero_tipo_pagina) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE pagina ADD CONSTRAINT FK_pagina_0003_ZYX FOREIGN KEY (id_dominio) REFERENCES dominio (id_dominio) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE pagina ADD CONSTRAINT FK_pagina_0004_ZYX FOREIGN KEY (id_dominio_maestro) REFERENCES dominio (id_dominio) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE pagina ADD CONSTRAINT FK_pagina_0005_ZYX FOREIGN KEY (id_parametro) REFERENCES parametro (id_parametro) ON DELETE NO ACTION ON UPDATE CASCADE
GO
ALTER TABLE pagina_funcion ADD CONSTRAINT FK_pagina_funcion_0001_ZYX FOREIGN KEY (id_pagina) REFERENCES pagina (id_pagina) ON DELETE CASCADE ON UPDATE CASCADE
GO
ALTER TABLE pagina_funcion ADD CONSTRAINT FK_pagina_funcion_0002_ZYX FOREIGN KEY (id_funcion) REFERENCES funcion (id_funcion) ON DELETE CASCADE ON UPDATE CASCADE
GO
ALTER TABLE pagina_usuario ADD CONSTRAINT FK_pagina_usuario_0001_ZYX FOREIGN KEY (id_pagina) REFERENCES pagina (id_pagina) ON DELETE CASCADE ON UPDATE CASCADE
GO
ALTER TABLE pagina_usuario ADD CONSTRAINT FK_pagina_usuario_0002_ZYX FOREIGN KEY (id_usuario) REFERENCES usuario (id_usuario) ON DELETE CASCADE ON UPDATE CASCADE
GO
ALTER TABLE parametro ADD CONSTRAINT FK_parametro_0001_ZYX FOREIGN KEY (numero_tipo_dato_par) REFERENCES tipo_dato_par (numero_tipo_dato_par) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE persona ADD CONSTRAINT FK_persona_0001_ZYX FOREIGN KEY (numero_estado_civil) REFERENCES estado_civil (numero_estado_civil) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE persona ADD CONSTRAINT FK_persona_0002_ZYX FOREIGN KEY (numero_sexo_persona) REFERENCES sexo_persona (numero_sexo_persona) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE persona ADD CONSTRAINT FK_persona_0003_ZYX FOREIGN KEY (id_etnia_indigena) REFERENCES etnia_indigena (id_etnia_indigena) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE persona ADD CONSTRAINT FK_persona_0004_ZYX FOREIGN KEY (id_departamento) REFERENCES ubicacion (id_ubicacion) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE persona ADD CONSTRAINT FK_persona_0005_ZYX FOREIGN KEY (id_distrito) REFERENCES ubicacion (id_ubicacion) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE persona ADD CONSTRAINT FK_persona_0006_ZYX FOREIGN KEY (id_barrio) REFERENCES ubicacion (id_ubicacion) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE persona ADD CONSTRAINT FK_persona_0007_ZYX FOREIGN KEY (numero_condicion_pension) REFERENCES condicion_pension (numero_condicion_pension) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE persona ADD CONSTRAINT FK_persona_0008_ZYX FOREIGN KEY (numero_condicion_reco_pen) REFERENCES condicion_reco_pen (numero_condicion_reco_pen) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE persona ADD CONSTRAINT FK_persona_0009_ZYX FOREIGN KEY (numero_condicion_denu_pen) REFERENCES condicion_denu_pen (numero_condicion_denu_pen) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE persona ADD CONSTRAINT FK_persona_0010_ZYX FOREIGN KEY (numero_causa_den_pension) REFERENCES causa_den_pension (numero_causa_den_pension) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE persona ADD CONSTRAINT FK_persona_0011_ZYX FOREIGN KEY (numero_causa_rev_pension) REFERENCES causa_rev_pension (numero_causa_rev_pension) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE persona ADD CONSTRAINT FK_persona_0012_ZYX FOREIGN KEY (numero_causa_den_reco_pen) REFERENCES causa_den_reco_pen (numero_causa_den_reco_pen) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE persona ADD CONSTRAINT FK_persona_0013_ZYX FOREIGN KEY (id_ficha_persona) REFERENCES ficha_persona (id_ficha_persona) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE persona ADD CONSTRAINT FK_persona_0014_ZYX FOREIGN KEY (numero_tipo_area) REFERENCES tipo_area (numero_tipo_area) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE persona ADD CONSTRAINT FK_persona_0015_ZYX FOREIGN KEY (id_manzana) REFERENCES ubicacion (id_ubicacion) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE persona ADD CONSTRAINT FK_persona_0016_ZYX FOREIGN KEY (numero_tipo_act_jupe) REFERENCES tipo_act_jupe (numero_tipo_act_jupe) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE potencial_ben ADD CONSTRAINT FK_potencial_ben_0001_ZYX FOREIGN KEY (id_etnia_indigena) REFERENCES etnia_indigena (id_etnia_indigena) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE potencial_ben ADD CONSTRAINT FK_potencial_ben_0002_ZYX FOREIGN KEY (id_departamento) REFERENCES ubicacion (id_ubicacion) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE potencial_ben ADD CONSTRAINT FK_potencial_ben_0003_ZYX FOREIGN KEY (id_distrito) REFERENCES ubicacion (id_ubicacion) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE potencial_ben ADD CONSTRAINT FK_potencial_ben_0004_ZYX FOREIGN KEY (numero_tipo_area) REFERENCES tipo_area (numero_tipo_area) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE potencial_ben ADD CONSTRAINT FK_potencial_ben_0005_ZYX FOREIGN KEY (id_barrio) REFERENCES ubicacion (id_ubicacion) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE potencial_ben ADD CONSTRAINT FK_potencial_ben_0006_ZYX FOREIGN KEY (id_manzana) REFERENCES ubicacion (id_ubicacion) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE potencial_ben ADD CONSTRAINT FK_potencial_ben_0007_ZYX FOREIGN KEY (id_persona) REFERENCES persona (id_persona) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE potencial_ben ADD CONSTRAINT FK_potencial_ben_0008_ZYX FOREIGN KEY (id_ficha_persona) REFERENCES ficha_persona (id_ficha_persona) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE potencial_ben ADD CONSTRAINT FK_potencial_ben_0009_ZYX FOREIGN KEY (numero_tipo_reg_pot_ben) REFERENCES tipo_reg_pot_ben (numero_tipo_reg_pot_ben) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE potencial_ben ADD CONSTRAINT FK_potencial_ben_0010_ZYX FOREIGN KEY (numero_causa_den_recl_cen) REFERENCES causa_den_recl_cen (numero_causa_den_recl_cen) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE potencial_ben ADD CONSTRAINT FK_potencial_ben_0011_ZYX FOREIGN KEY (numero_condicion_censo) REFERENCES condicion_censo (numero_condicion_censo) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE potencial_ben ADD CONSTRAINT FK_potencial_ben_0012_ZYX FOREIGN KEY (numero_condicion_recl_cen) REFERENCES condicion_recl_cen (numero_condicion_recl_cen) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE potencial_ben ADD CONSTRAINT FK_potencial_ben_0013_ZYX FOREIGN KEY (id_funcionario_validacion_cen) REFERENCES funcionario (id_funcionario) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE potencial_ben ADD CONSTRAINT FK_potencial_ben_0014_ZYX FOREIGN KEY (numero_causa_inv_censo) REFERENCES causa_inv_censo (numero_causa_inv_censo) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE potencial_ben ADD CONSTRAINT FK_potencial_ben_0015_ZYX FOREIGN KEY (id_funcionario_ult_visita_cen) REFERENCES funcionario (id_funcionario) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE proceso ADD CONSTRAINT FK_proceso_0001_ZYX FOREIGN KEY (numero_condicion_ultima_eje) REFERENCES condicion_eje_fun (numero_condicion_eje_fun) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE rastro_funcion ADD CONSTRAINT FK_rastro_funcion_0001_ZYX FOREIGN KEY (id_funcion) REFERENCES funcion (id_funcion) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE rastro_funcion_par ADD CONSTRAINT FK_rastro_funcion_par_0001_ZYX FOREIGN KEY (id_parametro) REFERENCES parametro (id_parametro) ON DELETE NO ACTION ON UPDATE CASCADE
GO
ALTER TABLE rastro_funcion_par ADD CONSTRAINT FK_rastro_funcion_par_0002_ZYX FOREIGN KEY (id_rastro_funcion) REFERENCES rastro_funcion (id_rastro_funcion) ON DELETE CASCADE ON UPDATE CASCADE
GO
ALTER TABLE rastro_informe ADD CONSTRAINT FK_rastro_informe_0001_ZYX FOREIGN KEY (id_funcion) REFERENCES funcion (id_funcion) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE rastro_informe ADD CONSTRAINT FK_rastro_informe_0002_ZYX FOREIGN KEY (numero_condicion_eje_fun) REFERENCES condicion_eje_fun (numero_condicion_eje_fun) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE rastro_proceso ADD CONSTRAINT FK_rastro_proceso_0001_ZYX FOREIGN KEY (id_funcion) REFERENCES funcion (id_funcion) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE rastro_proceso ADD CONSTRAINT FK_rastro_proceso_0002_ZYX FOREIGN KEY (numero_condicion_eje_fun) REFERENCES condicion_eje_fun (numero_condicion_eje_fun) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE rol ADD CONSTRAINT FK_rol_0001_ZYX FOREIGN KEY (id_grupo_aplicacion) REFERENCES grupo_aplicacion (id_grupo_aplicacion) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE rol ADD CONSTRAINT FK_rol_0002_ZYX FOREIGN KEY (numero_tipo_rol) REFERENCES tipo_rol (numero_tipo_rol) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE rol_aplicacion ADD CONSTRAINT FK_rol_aplicacion_0001_ZYX FOREIGN KEY (id_rol) REFERENCES rol (id_rol) ON DELETE CASCADE ON UPDATE CASCADE
GO
ALTER TABLE rol_aplicacion ADD CONSTRAINT FK_rol_aplicacion_0002_ZYX FOREIGN KEY (id_aplicacion) REFERENCES aplicacion (id_aplicacion) ON DELETE CASCADE ON UPDATE CASCADE
GO
ALTER TABLE rol_filtro_funcion ADD CONSTRAINT FK_rol_filtro_funcion_0001_ZYX FOREIGN KEY (id_rol) REFERENCES rol (id_rol) ON DELETE CASCADE ON UPDATE CASCADE
GO
ALTER TABLE rol_filtro_funcion ADD CONSTRAINT FK_rol_filtro_funcion_0002_ZYX FOREIGN KEY (id_filtro_funcion) REFERENCES filtro_funcion (id_filtro_funcion) ON DELETE CASCADE ON UPDATE CASCADE
GO
ALTER TABLE rol_funcion ADD CONSTRAINT FK_rol_funcion_0001_ZYX FOREIGN KEY (id_conjunto_segmento) REFERENCES conjunto_segmento (id_conjunto_segmento) ON DELETE CASCADE ON UPDATE CASCADE
GO
ALTER TABLE rol_funcion ADD CONSTRAINT FK_rol_funcion_0002_ZYX FOREIGN KEY (id_rol) REFERENCES rol (id_rol) ON DELETE CASCADE ON UPDATE CASCADE
GO
ALTER TABLE rol_funcion ADD CONSTRAINT FK_rol_funcion_0003_ZYX FOREIGN KEY (id_funcion) REFERENCES funcion (id_funcion) ON DELETE CASCADE ON UPDATE CASCADE
GO
ALTER TABLE rol_pagina ADD CONSTRAINT FK_rol_pagina_0001_ZYX FOREIGN KEY (id_rol) REFERENCES rol (id_rol) ON DELETE CASCADE ON UPDATE CASCADE
GO
ALTER TABLE rol_pagina ADD CONSTRAINT FK_rol_pagina_0002_ZYX FOREIGN KEY (id_pagina) REFERENCES pagina (id_pagina) ON DELETE CASCADE ON UPDATE CASCADE
GO
ALTER TABLE rol_usuario ADD CONSTRAINT FK_rol_usuario_0001_ZYX FOREIGN KEY (id_rol) REFERENCES rol (id_rol) ON DELETE CASCADE ON UPDATE CASCADE
GO
ALTER TABLE rol_usuario ADD CONSTRAINT FK_rol_usuario_0002_ZYX FOREIGN KEY (id_usuario) REFERENCES usuario (id_usuario) ON DELETE CASCADE ON UPDATE CASCADE
GO
ALTER TABLE ubicacion ADD CONSTRAINT FK_ubicacion_0001_ZYX FOREIGN KEY (numero_nivel_ubicacion) REFERENCES nivel_ubicacion (numero_nivel_ubicacion) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE ubicacion ADD CONSTRAINT FK_ubicacion_0002_ZYX FOREIGN KEY (id_ubicacion_superior) REFERENCES ubicacion (id_ubicacion) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE ubicacion ADD CONSTRAINT FK_ubicacion_0003_ZYX FOREIGN KEY (numero_tipo_nodo) REFERENCES tipo_nodo (numero_tipo_nodo) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE ubicacion ADD CONSTRAINT FK_ubicacion_0004_ZYX FOREIGN KEY (numero_tipo_area) REFERENCES tipo_area (numero_tipo_area) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE usuario ADD CONSTRAINT FK_usuario_0001_ZYX FOREIGN KEY (id_usuario_supervisor) REFERENCES usuario (id_usuario) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE visita_censo ADD CONSTRAINT FK_visita_censo_0001_ZYX FOREIGN KEY (id_funcionario_censista) REFERENCES funcionario (id_funcionario) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE visita_censo ADD CONSTRAINT FK_visita_censo_0002_ZYX FOREIGN KEY (id_potencial_ben) REFERENCES potencial_ben (id_potencial_ben) ON DELETE NO ACTION ON UPDATE NO ACTION
GO