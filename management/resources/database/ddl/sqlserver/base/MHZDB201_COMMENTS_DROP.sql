-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- clase_recurso_par
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'clase_recurso_par', N'column', N'es_parametro_omisible'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'clase_recurso_par', N'column', N'es_parametro_inmutable'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'clase_recurso_par', N'column', N'es_parametro_submit'
GO
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- ficha_hogar
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'observaciones'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'huso_utm'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'franja_utm'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'distancia_este_utm'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'distancia_norte_utm'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_tipo_area'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_tipo_mat_paredes'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_tipo_mat_piso'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_tipo_mat_techo'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_tipo_ocupacion_viv'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'otro_tipo_ocupacion_viv'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'cantidad_piezas'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'cantidad_dormitorios'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_siono_pieza_cocina'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_tipo_combustible'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_tipo_pieza_bano'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_tipo_servicio_san'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_tipo_servicio_agua'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_tipo_aba_agua'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_siono_corriente_elec'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_tipo_desecho_bas'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_siono_telefono_celular'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_telefono_celular'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_siono_tlf_linea_baja'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_telefono_linea_baja'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_siono_disp_heladera'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_siono_disp_lavarropas'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_siono_disp_termo'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_siono_disp_aire_acon'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_siono_disp_automovil'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_siono_disp_camion'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_siono_disp_motocicleta'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'nombre_jefe_hogar'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_cedula_jefe_hogar'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'letra_cedula_jefe_hogar'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_orden_iden_jefe_hogar'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'nombre_respondente'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_cedula_respondente'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'letra_cedula_respondente'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_orden_iden_respondente'
GO
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- ficha_persona
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_orden_identificacion'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_tipo_persona_hogar'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_siono_miembro_hogar'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_orden_iden_conyuge'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_orden_iden_padre'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_orden_iden_madre'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_tipo_excepcion_ced'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'id_departamento_nacimiento'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'id_distrito_nacimiento'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_tipo_area_lugar_nac'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_idioma_hogar'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'otro_idioma_hogar'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_siono_asistencia_esc'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_motivo_ina_esc'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'otro_motivo_ina_esc'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_siono_matriculacion_esc'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'ultimo_curso_aprobado'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_nivel_edu_ult_cur_aprob'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_siono_curso_no_formal'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_tipo_seguro_medico'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_estado_salud'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_clase_enf_acc'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'otra_clase_enf_acc'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_clase_enf_cronica'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'otra_clase_enf_cronica'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_siono_atencion_medica'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_motivo_no_atencion'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'otro_motivo_no_atencion'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_siono_carnet_vacunacion'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_clase_impedimento'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'otra_clase_impedimento'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_causa_impedimento'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'otra_causa_impedimento'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_siono_dif_para_caminar'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_siono_dif_para_vestirse'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_siono_dif_para_banarse'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_siono_dif_para_comer'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_siono_dif_para_la_cama'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_siono_dif_para_el_bano'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_siono_trabajo'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_motivo_no_trabajo'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'otro_motivo_no_trabajo'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'descripcion_ocupacion_prin'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'descripcion_dedicacion_prin'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_tipo_relacion_lab'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'monto_ingreso_ocupacion_prin'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'monto_ingreso_ocupacion_secun'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'monto_ingreso_otras_ocup'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'monto_ingreso_alquileres'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'monto_ingreso_intereses'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'monto_ingreso_ayuda_fam_pais'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'monto_ingreso_ayuda_fam_exter'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'monto_ingreso_jubilacion'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'monto_ingreso_pensiones'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'monto_ingreso_tekopora'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'monto_ingreso_programas'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'monto_ingreso_adicional'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'total_ingreso_mensual'
GO
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- log_imp_deu
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_deu', N'column', N'referencia'
GO
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- log_imp_hog
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p20d'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p20m'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p20a'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p17'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p18'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'var00001'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p19'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'observaciones'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'utm'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'gps'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'orden'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'coordx'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p01a'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p01b'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p01c'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p01d'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p02'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p03'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p04'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p05'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p06'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p08'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p07'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p09'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p14'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p15'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p16'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p24'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p25'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p26'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p27'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p27e'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p28a'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p28b'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p29'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p30'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p31'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p32'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p33'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p34'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p35'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p36'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p37'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'nro_celular'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p38'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'nro_linea_baja'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p391'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p392'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p393'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p394'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p395'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p396'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p397'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p42n'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p42ci'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'letra_ci'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p43'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'var00002'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'var00003'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'var00004'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p104'
GO
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- log_imp_hog_eec
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'dptod'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'distritod'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'distripg'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'area'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'barrio'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'manzana'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'formulario'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'vivi'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'hogar'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'direccion'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'nro_de'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'telefono'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'fecha'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'dia'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'mes'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'ano'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v10t'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v11'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v12'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v13'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v14'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v15'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v16'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v16_otr'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v17a'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v17b'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v18'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v19'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v20'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v21'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v22'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v23'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v24'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v25'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v26'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v26esp_celular'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v27'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v27esp_linea'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v28_1'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v28_2'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v28_3'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v28_4'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v28_5'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v28_6'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v28_7'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v28_8'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v29nombre_jefe'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'cedulajefe'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'var00001'
GO
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- log_imp_per
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p01a'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p01b'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p01c'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p01d'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p02'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p03'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p104'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p43'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p45a'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p45b'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p44a'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p44b'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'var00001'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'var00002'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p46'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p47'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'var00030'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p48'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p49'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p50a'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p50b'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p50c'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p51'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'var00003'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'var00004'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p52d'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p52m'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p52a'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p53a'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p53b'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p53c'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p53z'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p54'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p54e'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p56'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p58'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p58e'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p59'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p60'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p61'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p62'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p63'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p64'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p65'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p65e'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p66'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p66e'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p67'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p68'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p68e'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p73'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p74'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'var00006'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'var00007'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'var00008'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'var00009'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'var00010'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'var00011'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'var00031'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'var00012'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'var00013'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p86'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p87'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p87e'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p88'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p88e'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p91'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'var00017'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'var00018'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'var00019'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'var00020'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'var00021'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'var00022'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'var00023'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'var00024'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'var00025'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'var00026'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'var00027'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'var00028'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p92'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'icv'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'ficha_activa'
GO
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- log_imp_per_eec
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'dptod'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'distritod'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'distripg'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'area'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'barrio'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'manzana'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'formulario'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'vivi'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'hogar'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'orden'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p30'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p31'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p32'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p33'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p34'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p35'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p36_orden_conyugue'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p36_orden_padre'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p36_orden_madre'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p37'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p37_cedula'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p38_dia'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p38_mes'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p38_ano'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p39pais'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p39dpto'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p39dist'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p39area'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p40_idioma'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p40otr'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p41'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p42'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p43'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p44_45t'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p44'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p45'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p46'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p47'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p48'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p49'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p49_otr'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p50'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p50_otr'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p51'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p52'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p52_otr'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p53'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p54'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p54a'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p54_otr'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p55'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p55_otr'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p56'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p57'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p58'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p59'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p60'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p61'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p62'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p63'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p63_especificar'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p64des'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p64c'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p65des'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p65c'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p66'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p67a'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p67b'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p67c'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p67d'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p67e'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p67f'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p67g'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p67h'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p67i'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p67j'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p67k'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p67l'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p67tot'
GO
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- nivel_educativo
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'nivel_educativo', N'column', N'primer_curso'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'nivel_educativo', N'column', N'ultimo_curso'
GO
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- objecion_ele_pen
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'objecion_ele_pen', N'column', N'fecha_anulacion'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'objecion_ele_pen', N'column', N'observaciones_anulacion'
GO
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- persona
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'persona', N'column', N'otra_causa_den_pension'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'persona', N'column', N'otra_causa_rev_pension'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'persona', N'column', N'otra_causa_den_reco_pen'
GO
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- potencial_ben
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'potencial_ben', N'column', N'es_persona_con_empleo'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'potencial_ben', N'column', N'es_persona_con_jubilacion'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'potencial_ben', N'column', N'es_persona_con_pension'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'potencial_ben', N'column', N'es_persona_con_subsidio'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'potencial_ben', N'column', N'es_persona_con_deuda'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'potencial_ben', N'column', N'es_persona_con_pena_judicial'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'potencial_ben', N'column', N'es_persona_con_cer_vida'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'potencial_ben', N'column', N'es_persona_con_carta_renuncia'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'potencial_ben', N'column', N'otra_causa_inv_censo'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'potencial_ben', N'column', N'otra_causa_den_recl_cen'
GO
