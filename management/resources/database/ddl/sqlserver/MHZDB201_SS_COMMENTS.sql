-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- clase_recurso_par
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
exec sp_addextendedproperty N'MS_Description', N'Solo lectura al crear', N'user', N'dbo', N'table', N'clase_recurso_par', N'column', N'es_parametro_omisible'
GO
exec sp_addextendedproperty N'MS_Description', N'Solo lectura al modificar', N'user', N'dbo', N'table', N'clase_recurso_par', N'column', N'es_parametro_inmutable'
GO
exec sp_addextendedproperty N'MS_Description', N'Auto-Submit on Change', N'user', N'dbo', N'table', N'clase_recurso_par', N'column', N'es_parametro_submit'
GO
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- ficha_hogar
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
exec sp_addextendedproperty N'MS_Description', N'Observaciones de campo', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'observaciones'
GO
exec sp_addextendedproperty N'MS_Description', N'Número de Zona ó Huso (1-60) de la ubicación de la vivienda (según GPS)', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'huso_utm'
GO
exec sp_addextendedproperty N'MS_Description', N'Banda ó Franja (C-X, sin I ni O) de la ubicación de la vivienda (según GPS)', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'franja_utm'
GO
exec sp_addextendedproperty N'MS_Description', N'Coordenada X: distancia horizontal al Este (Easting) de la ubicación de la vivienda (según GPS)', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'distancia_este_utm'
GO
exec sp_addextendedproperty N'MS_Description', N'Coordenada Y: distancia vertical al Norte (Northing) de la ubicación de la vivienda (según GPS)', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'distancia_norte_utm'
GO
exec sp_addextendedproperty N'MS_Description', N'Tipo de área (urbana o rural)', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_tipo_area'
GO
exec sp_addextendedproperty N'MS_Description', N'Material predominante en las paredes exteriores', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_tipo_mat_paredes'
GO
exec sp_addextendedproperty N'MS_Description', N'Material predominante en el piso', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_tipo_mat_piso'
GO
exec sp_addextendedproperty N'MS_Description', N'Material predominante en el techo', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_tipo_mat_techo'
GO
exec sp_addextendedproperty N'MS_Description', N'Condición de ocupación de la vivienda', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_tipo_ocupacion_viv'
GO
exec sp_addextendedproperty N'MS_Description', N'Condición de ocupación de la vivienda (especificar si la respuesta anterior es 6 "Otros")', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'otro_tipo_ocupacion_viv'
GO
exec sp_addextendedproperty N'MS_Description', N'Número de piezas, sin incluir baño, cocina, cuartos o piezas destinadas exclusivamente al comercio o industria', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'cantidad_piezas'
GO
exec sp_addextendedproperty N'MS_Description', N'Número de dormitorios', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'cantidad_dormitorios'
GO
exec sp_addextendedproperty N'MS_Description', N'Tiene pieza para cocinar', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_siono_pieza_cocina'
GO
exec sp_addextendedproperty N'MS_Description', N'Combustible que se utiliza en forma habitual para cocinar', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_tipo_combustible'
GO
exec sp_addextendedproperty N'MS_Description', N'Tipo de pieza para bañarse', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_tipo_pieza_bano'
GO
exec sp_addextendedproperty N'MS_Description', N'Tipo de desagüe que tiene el baño', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_tipo_servicio_san'
GO
exec sp_addextendedproperty N'MS_Description', N'Procedencia del agua que se utiliza en l a vivienda', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_tipo_servicio_agua'
GO
exec sp_addextendedproperty N'MS_Description', N'Lugar de abastecimiento del agua que se utiliza en l a vivienda', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_tipo_aba_agua'
GO
exec sp_addextendedproperty N'MS_Description', N'Dispone de luz eléctrica', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_siono_corriente_elec'
GO
exec sp_addextendedproperty N'MS_Description', N'Forma de desechar la basura', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_tipo_desecho_bas'
GO
exec sp_addextendedproperty N'MS_Description', N'Tiene teléfono celular', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_siono_telefono_celular'
GO
exec sp_addextendedproperty N'MS_Description', N'Número de teléfono celular', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_telefono_celular'
GO
exec sp_addextendedproperty N'MS_Description', N'Tiene teléfono de linea baja', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_siono_tlf_linea_baja'
GO
exec sp_addextendedproperty N'MS_Description', N'Número de teléfono de linea baja', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_telefono_linea_baja'
GO
exec sp_addextendedproperty N'MS_Description', N'Dispone de heladera en el hogar', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_siono_disp_heladera'
GO
exec sp_addextendedproperty N'MS_Description', N'Dispone de lavarropas en el hogar', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_siono_disp_lavarropas'
GO
exec sp_addextendedproperty N'MS_Description', N'Dispone de termocalefón en el hogar', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_siono_disp_termo'
GO
exec sp_addextendedproperty N'MS_Description', N'Dispone de aire acondicionado en el hogar', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_siono_disp_aire_acon'
GO
exec sp_addextendedproperty N'MS_Description', N'Dispone de automóvil ó camioneta en el hogar', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_siono_disp_automovil'
GO
exec sp_addextendedproperty N'MS_Description', N'Dispone de camión en el hogar', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_siono_disp_camion'
GO
exec sp_addextendedproperty N'MS_Description', N'Dispone de motocicleta en el hogar', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_siono_disp_motocicleta'
GO
exec sp_addextendedproperty N'MS_Description', N'Nombre del jefe de hogar', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'nombre_jefe_hogar'
GO
exec sp_addextendedproperty N'MS_Description', N'Número de cédula del jefe de hogar', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_cedula_jefe_hogar'
GO
exec sp_addextendedproperty N'MS_Description', N'Letra de la cédula del jefe de hogar', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'letra_cedula_jefe_hogar'
GO
exec sp_addextendedproperty N'MS_Description', N'Número de orden de identificación del jefe de hogar', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_orden_iden_jefe_hogar'
GO
exec sp_addextendedproperty N'MS_Description', N'Nombre del respondente', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'nombre_respondente'
GO
exec sp_addextendedproperty N'MS_Description', N'Número de cédula del respondente', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_cedula_respondente'
GO
exec sp_addextendedproperty N'MS_Description', N'Letra de la cédula del respondente', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'letra_cedula_respondente'
GO
exec sp_addextendedproperty N'MS_Description', N'Número de orden de identificación del respondente', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_orden_iden_respondente'
GO
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- ficha_persona
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
exec sp_addextendedproperty N'MS_Description', N'Número de orden de identificación de la persona', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_orden_identificacion'
GO
exec sp_addextendedproperty N'MS_Description', N'Parentesco familiar con el/la jefe/a del hogar', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_tipo_persona_hogar'
GO
exec sp_addextendedproperty N'MS_Description', N'Es miembro del hogar', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_siono_miembro_hogar'
GO
exec sp_addextendedproperty N'MS_Description', N'Número de orden de identificación del conyuge', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_orden_iden_conyuge'
GO
exec sp_addextendedproperty N'MS_Description', N'Número de orden de identificación del padre', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_orden_iden_padre'
GO
exec sp_addextendedproperty N'MS_Description', N'Número de orden de identificación de la madre', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_orden_iden_madre'
GO
exec sp_addextendedproperty N'MS_Description', N'Razón por la que no se dispone del número de cédula de la persona', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_tipo_excepcion_ced'
GO
exec sp_addextendedproperty N'MS_Description', N'Departamento donde vivía la madre cuando nació', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'id_departamento_nacimiento'
GO
exec sp_addextendedproperty N'MS_Description', N'Distrito donde vivía la madre cuando nació', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'id_distrito_nacimiento'
GO
exec sp_addextendedproperty N'MS_Description', N'Tipo de área (urbana o rural) donde vivía la madre cuando nació', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_tipo_area_lugar_nac'
GO
exec sp_addextendedproperty N'MS_Description', N'Idioma que habla en la casa la mayor parte del tiempo', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_idioma_hogar'
GO
exec sp_addextendedproperty N'MS_Description', N'Idioma que habla en la casa la mayor parte del tiempo (especificar si la respuesta anterior es 4 "Otro idioma")', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'otro_idioma_hogar'
GO
exec sp_addextendedproperty N'MS_Description', N'Asiste o asistió a una escuela, colegio o institucion de enseñanza regular', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_siono_asistencia_esc'
GO
exec sp_addextendedproperty N'MS_Description', N'Motivo por el que no asiste o dejó de asistir a la escuela, colegio o institucion de enseñanza regular', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_motivo_ina_esc'
GO
exec sp_addextendedproperty N'MS_Description', N'Motivo por el que no asiste o dejó de asistir a la escuela, colegio o institucion de enseñanza regular (especificar si la respuesta anterior es 25 "Otros")', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'otro_motivo_ina_esc'
GO
exec sp_addextendedproperty N'MS_Description', N'Esta matriculado actualmente en una institución educativa', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_siono_matriculacion_esc'
GO
exec sp_addextendedproperty N'MS_Description', N'Ultimo grado/ciclo o curso que aprobó', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'ultimo_curso_aprobado'
GO
exec sp_addextendedproperty N'MS_Description', N'Nivel al que corresponde el último grado/ciclo o curso que aprobó', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_nivel_edu_ult_cur_aprob'
GO
exec sp_addextendedproperty N'MS_Description', N'Realizó algún curso no formal para poder trabajar, ejercer algún oficio o mejorar su nivel cultural', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_siono_curso_no_formal'
GO
exec sp_addextendedproperty N'MS_Description', N'Tiene seguro médico vigente en el país', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_tipo_seguro_medico'
GO
exec sp_addextendedproperty N'MS_Description', N'Durante los últimos 90 dias, se sintió o estuvo enfermo y/o accidentado', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_estado_salud'
GO
exec sp_addextendedproperty N'MS_Description', N'Enfermedad y/o accidente que tuvo durante los últimos 90 dias', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_clase_enf_acc'
GO
exec sp_addextendedproperty N'MS_Description', N'Enfermedad y/o accidente que tuvo durante los últimos 90 dias (especificar si la respuesta anterior es 44 "Otros")', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'otra_clase_enf_acc'
GO
exec sp_addextendedproperty N'MS_Description', N'Enfermedad crónica que tiene', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_clase_enf_cronica'
GO
exec sp_addextendedproperty N'MS_Description', N'Enfermedad crónica que tiene (especificar si la respuesta anterior es 42 "Otros")', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'otra_clase_enf_cronica'
GO
exec sp_addextendedproperty N'MS_Description', N'Recibió atención médica por la enfermedad y/o accidente que tuvo o tiene', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_siono_atencion_medica'
GO
exec sp_addextendedproperty N'MS_Description', N'Motivo por el que no recibió atención médica', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_motivo_no_atencion'
GO
exec sp_addextendedproperty N'MS_Description', N'Motivo por el que no recibió atención médica (especificar si la respuesta anterior es 9 "Otros")', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'otro_motivo_no_atencion'
GO
exec sp_addextendedproperty N'MS_Description', N'Tiene carnet de vacunación', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_siono_carnet_vacunacion'
GO
exec sp_addextendedproperty N'MS_Description', N'Tiene impedimento físico o mental de forma permanente', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_clase_impedimento'
GO
exec sp_addextendedproperty N'MS_Description', N'Tiene impedimento físico o mental de forma permanente (especificar si la respuesta anterior es 13 "Otros")', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'otra_clase_impedimento'
GO
exec sp_addextendedproperty N'MS_Description', N'Causa del impedimento', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_causa_impedimento'
GO
exec sp_addextendedproperty N'MS_Description', N'Causa del impedimento (especificar si la respuesta anterior es 5 "Otros")', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'otra_causa_impedimento'
GO
exec sp_addextendedproperty N'MS_Description', N'Tiene dificultad para cruzar una pieza/habitación caminando', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_siono_dif_para_caminar'
GO
exec sp_addextendedproperty N'MS_Description', N'Tiene dificultad para vestirse, incluyendo ponerse los zapatos y las medias', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_siono_dif_para_vestirse'
GO
exec sp_addextendedproperty N'MS_Description', N'Tiene dificultad para bañarse, incluyendo entrar y salid de la bañadera', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_siono_dif_para_banarse'
GO
exec sp_addextendedproperty N'MS_Description', N'Tiene dificultad para comer, incluyendo cortar la comida, llenar los vasos, etc.', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_siono_dif_para_comer'
GO
exec sp_addextendedproperty N'MS_Description', N'Tiene dificultad para acostarse o pararse de la cama', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_siono_dif_para_la_cama'
GO
exec sp_addextendedproperty N'MS_Description', N'Tiene dificultad para usar el servicio sanitario, incluyendo sentarse o levantarse del excusado o inodoro', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_siono_dif_para_el_bano'
GO
exec sp_addextendedproperty N'MS_Description', N'Durante los últimos 30 dias trabajó, realizó alguna changa, o hizo algún producto dentro o fuera de su casa para vender, o prestó algún servicio, o ayudó a alguien en su trabajo, negocio o chacra', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_siono_trabajo'
GO
exec sp_addextendedproperty N'MS_Description', N'Motivo principal por el que no trabajó durante los últimos 30 dias', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_motivo_no_trabajo'
GO
exec sp_addextendedproperty N'MS_Description', N'Motivo principal por el que no trabajó durante los últimos 30 dias (especificar si la respuesta anterior es 9 "Otros")', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'otro_motivo_no_trabajo'
GO
exec sp_addextendedproperty N'MS_Description', N'Ocupación principal en el trabajo que realiza o realizaba', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'descripcion_ocupacion_prin'
GO
exec sp_addextendedproperty N'MS_Description', N'Producto o servicio principal que se produce o se presta en el lugar donde trabaja o trabajaba', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'descripcion_dedicacion_prin'
GO
exec sp_addextendedproperty N'MS_Description', N'Relación laboral que mentiene o mantenía', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_tipo_relacion_lab'
GO
exec sp_addextendedproperty N'MS_Description', N'Monto del ingreso mensual que habitualmente recibe en su ocupación principal', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'monto_ingreso_ocupacion_prin'
GO
exec sp_addextendedproperty N'MS_Description', N'Monto del ingreso mensual que habitualmente recibe en su ocupación secundaria', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'monto_ingreso_ocupacion_secun'
GO
exec sp_addextendedproperty N'MS_Description', N'Monto del ingreso mensual que habitualmente recibe en todas las otras ocupaciones', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'monto_ingreso_otras_ocup'
GO
exec sp_addextendedproperty N'MS_Description', N'Monto del ingreso mensual que habitualmente recibe por alquileres o rentas (neto)', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'monto_ingreso_alquileres'
GO
exec sp_addextendedproperty N'MS_Description', N'Monto del ingreso mensual que habitualmente recibe por intereses, dividendos o utilidades', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'monto_ingreso_intereses'
GO
exec sp_addextendedproperty N'MS_Description', N'Monto del ingreso mensual que habitualmente recibe por ayuda familiar del país', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'monto_ingreso_ayuda_fam_pais'
GO
exec sp_addextendedproperty N'MS_Description', N'Monto del ingreso mensual que habitualmente recibe por ayuda familiar del exterior', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'monto_ingreso_ayuda_fam_exter'
GO
exec sp_addextendedproperty N'MS_Description', N'Monto del ingreso mensual que habitualmente recibe por jubilación o pensión', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'monto_ingreso_jubilacion'
GO
exec sp_addextendedproperty N'MS_Description', N'Monto del ingreso mensual que habitualmente recibe por pensiones o prestaciones por divorcios o cuidados de hijos', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'monto_ingreso_pensiones'
GO
exec sp_addextendedproperty N'MS_Description', N'Monto del ingreso mensual que habitualmente recibe por Tekopora', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'monto_ingreso_tekopora'
GO
exec sp_addextendedproperty N'MS_Description', N'Monto del ingreso mensual que habitualmente recibe por otros programas', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'monto_ingreso_programas'
GO
exec sp_addextendedproperty N'MS_Description', N'Monto del ingreso mensual que habitualmente recibe por otras fuentes', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'monto_ingreso_adicional'
GO
exec sp_addextendedproperty N'MS_Description', N'Monto total del ingreso mensual que habitualmente recibe por cualquier fuente (suma de todos los montos anteriores)', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'total_ingreso_mensual'
GO
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- nivel_educativo
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
exec sp_addextendedproperty N'MS_Description', N'Número del primer curso del nivel', N'user', N'dbo', N'table', N'nivel_educativo', N'column', N'primer_curso'
GO
exec sp_addextendedproperty N'MS_Description', N'Número del último curso del nivel', N'user', N'dbo', N'table', N'nivel_educativo', N'column', N'ultimo_curso'
GO
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- persona
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
exec sp_addextendedproperty N'MS_Description', N'Especificar si la respuesta anterior es 99 "Otra causa"', N'user', N'dbo', N'table', N'persona', N'column', N'otra_causa_den_pension'
GO
exec sp_addextendedproperty N'MS_Description', N'Especificar si la respuesta anterior es 99 "Otra causa"', N'user', N'dbo', N'table', N'persona', N'column', N'otra_causa_rev_pension'
GO
exec sp_addextendedproperty N'MS_Description', N'Especificar si la respuesta anterior es 99 "Otra causa"', N'user', N'dbo', N'table', N'persona', N'column', N'otra_causa_den_reco_pen'
GO
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- potencial_ben
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
exec sp_addextendedproperty N'MS_Description', N'tiene empleo', N'user', N'dbo', N'table', N'potencial_ben', N'column', N'es_persona_con_empleo'
GO
exec sp_addextendedproperty N'MS_Description', N'tiene jubilación', N'user', N'dbo', N'table', N'potencial_ben', N'column', N'es_persona_con_jubilacion'
GO
exec sp_addextendedproperty N'MS_Description', N'tiene pensión', N'user', N'dbo', N'table', N'potencial_ben', N'column', N'es_persona_con_pension'
GO
exec sp_addextendedproperty N'MS_Description', N'tiene algún subsidio del Estado', N'user', N'dbo', N'table', N'potencial_ben', N'column', N'es_persona_con_subsidio'
GO
exec sp_addextendedproperty N'MS_Description', N'tiene deudas con el Estado', N'user', N'dbo', N'table', N'potencial_ben', N'column', N'es_persona_con_deuda'
GO
exec sp_addextendedproperty N'MS_Description', N'tiene pena judicial pendiente', N'user', N'dbo', N'table', N'potencial_ben', N'column', N'es_persona_con_pena_judicial'
GO
exec sp_addextendedproperty N'MS_Description', N'presentó Certificado de Vida y Residencia', N'user', N'dbo', N'table', N'potencial_ben', N'column', N'es_persona_con_cer_vida'
GO
exec sp_addextendedproperty N'MS_Description', N'está dispuesto a firmar la Carta de Renuncia a otras pensiones y/o subsidios', N'user', N'dbo', N'table', N'potencial_ben', N'column', N'es_persona_con_carta_renuncia'
GO
exec sp_addextendedproperty N'MS_Description', N'Especificar si la respuesta anterior es 99 "Otra causa"', N'user', N'dbo', N'table', N'potencial_ben', N'column', N'otra_causa_inv_censo'
GO
exec sp_addextendedproperty N'MS_Description', N'Especificar si la respuesta anterior es 99 "Otra causa"', N'user', N'dbo', N'table', N'potencial_ben', N'column', N'otra_causa_den_recl_cen'
GO
