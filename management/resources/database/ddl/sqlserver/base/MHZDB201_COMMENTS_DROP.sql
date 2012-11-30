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
-- nivel_educativo
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'nivel_educativo', N'column', N'primer_curso'
GO
exec sp_dropextendedproperty N'MS_Description', N'user', N'dbo', N'table', N'nivel_educativo', N'column', N'ultimo_curso'
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
