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
-- log_imp_deu
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
exec sp_addextendedproperty N'MS_Description', N'Número de NIS (Si aplica)', N'user', N'dbo', N'table', N'log_imp_deu', N'column', N'referencia'
GO
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- log_imp_hog
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
exec sp_addextendedproperty N'MS_Description', N'Día de la entrevista', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p20d'
GO
exec sp_addextendedproperty N'MS_Description', N'Mes de la entrevista', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p20m'
GO
exec sp_addextendedproperty N'MS_Description', N'Año de la entrevista', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p20a'
GO
exec sp_addextendedproperty N'MS_Description', N'Funcionario censista', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p17'
GO
exec sp_addextendedproperty N'MS_Description', N'Funcionario cupervisor', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p18'
GO
exec sp_addextendedproperty N'MS_Description', N'Funcionario crítico decodificador', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'var00001'
GO
exec sp_addextendedproperty N'MS_Description', N'Funcionario Digitador', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p19'
GO
exec sp_addextendedproperty N'MS_Description', N'Observaciones de Campo', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'observaciones'
GO
exec sp_addextendedproperty N'MS_Description', N'Número de Zona ó Huso de la ubicación de la vivienda (según GPS)', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'utm'
GO
exec sp_addextendedproperty N'MS_Description', N'Banda ó Franja de la ubicación de la vivienda (según GPS)  ', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'gps'
GO
exec sp_addextendedproperty N'MS_Description', N'Distancia vertical al Norte de la ubicación de la vivienda (según GPS) ', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'orden'
GO
exec sp_addextendedproperty N'MS_Description', N'Distancia horizontal al Este de la ubicación de la vivienda (según GPS)', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'coordx'
GO
exec sp_addextendedproperty N'MS_Description', N'Código Departamento', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p01a'
GO
exec sp_addextendedproperty N'MS_Description', N'Código Distrito', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p01b'
GO
exec sp_addextendedproperty N'MS_Description', N'Código Barrio', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p01c'
GO
exec sp_addextendedproperty N'MS_Description', N'Número Formulario', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p01d'
GO
exec sp_addextendedproperty N'MS_Description', N'Número Vivienda', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p02'
GO
exec sp_addextendedproperty N'MS_Description', N'Número Hogar', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p03'
GO
exec sp_addextendedproperty N'MS_Description', N'Nombre Departamento', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p04'
GO
exec sp_addextendedproperty N'MS_Description', N'Nombre Distrito', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p05'
GO
exec sp_addextendedproperty N'MS_Description', N'Tipo de Área', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p06'
GO
exec sp_addextendedproperty N'MS_Description', N'Nombre de Barrio', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p08'
GO
exec sp_addextendedproperty N'MS_Description', N'Nombre de Manzana', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p07'
GO
exec sp_addextendedproperty N'MS_Description', N'Dirección de la vivienda', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p09'
GO
exec sp_addextendedproperty N'MS_Description', N'Total de personas que viven en el hogar', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p14'
GO
exec sp_addextendedproperty N'MS_Description', N'Total de hombres que viven en el hogar', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p15'
GO
exec sp_addextendedproperty N'MS_Description', N'Total de mujeres que viven el hogar', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p16'
GO
exec sp_addextendedproperty N'MS_Description', N'Material predominante en las paredes exteriores', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p24'
GO
exec sp_addextendedproperty N'MS_Description', N'Material predominante en el piso ', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p25'
GO
exec sp_addextendedproperty N'MS_Description', N'Material predominante en el techo', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p26'
GO
exec sp_addextendedproperty N'MS_Description', N'Condición de ocupación de la vivienda', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p27'
GO
exec sp_addextendedproperty N'MS_Description', N'Otra condición de ocupación de la vivienda', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p27e'
GO
exec sp_addextendedproperty N'MS_Description', N'Número de piezas de la vivienda', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p28a'
GO
exec sp_addextendedproperty N'MS_Description', N'Número de dormitorios de la vivienda', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p28b'
GO
exec sp_addextendedproperty N'MS_Description', N'Tiene pieza para cocinar ', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p29'
GO
exec sp_addextendedproperty N'MS_Description', N'Combustible que se utiliza en forma habitual para cocinar  ', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p30'
GO
exec sp_addextendedproperty N'MS_Description', N'Tipo de pieza para bañarse', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p31'
GO
exec sp_addextendedproperty N'MS_Description', N'Tipo de desagüe que tiene el baño ', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p32'
GO
exec sp_addextendedproperty N'MS_Description', N'Procedencia del agua que se utiliza en l a vivienda  ', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p33'
GO
exec sp_addextendedproperty N'MS_Description', N'Lugar de abastecimiento del agua que se utiliza en l a vivienda  ', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p34'
GO
exec sp_addextendedproperty N'MS_Description', N'Dispone de luz eléctrica', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p35'
GO
exec sp_addextendedproperty N'MS_Description', N'Forma de desechar la basura ', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p36'
GO
exec sp_addextendedproperty N'MS_Description', N'Tiene teléfono celular  ', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p37'
GO
exec sp_addextendedproperty N'MS_Description', N'Número de teléfono celular', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'nro_celular'
GO
exec sp_addextendedproperty N'MS_Description', N'Tiene teléfono línea baja', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p38'
GO
exec sp_addextendedproperty N'MS_Description', N'Número de teléfono línea baja', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'nro_linea_baja'
GO
exec sp_addextendedproperty N'MS_Description', N'Dispone de heladera en el hogar', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p391'
GO
exec sp_addextendedproperty N'MS_Description', N'Dispone de lavarropas en el hogar ', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p392'
GO
exec sp_addextendedproperty N'MS_Description', N'Dispone de termocalefón en el hogar ', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p393'
GO
exec sp_addextendedproperty N'MS_Description', N'Dispone de aire acondicionado en el hogar ', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p394'
GO
exec sp_addextendedproperty N'MS_Description', N'Dispone de automóvil o camioneta en el hogar ', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p395'
GO
exec sp_addextendedproperty N'MS_Description', N'Dispone de camión en el hogar ', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p396'
GO
exec sp_addextendedproperty N'MS_Description', N'Dispone de motocicleta en el hogar ', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p397'
GO
exec sp_addextendedproperty N'MS_Description', N'Nombre del jefe del hogar', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p42n'
GO
exec sp_addextendedproperty N'MS_Description', N'Número de cédula del jefe del hogar', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p42ci'
GO
exec sp_addextendedproperty N'MS_Description', N'Letra de cédula del jefe del hogar', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'letra_ci'
GO
exec sp_addextendedproperty N'MS_Description', N'Orden del jefe del hogar', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p43'
GO
exec sp_addextendedproperty N'MS_Description', N'Nombre del respondente', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'var00002'
GO
exec sp_addextendedproperty N'MS_Description', N'Número de cédula del respondente', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'var00003'
GO
exec sp_addextendedproperty N'MS_Description', N'Letra de cédula del respondente', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'var00004'
GO
exec sp_addextendedproperty N'MS_Description', N'Orden del respondente', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p104'
GO
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- log_imp_hog_eec
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
exec sp_addextendedproperty N'MS_Description', N'Código de departamento', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'dptod'
GO
exec sp_addextendedproperty N'MS_Description', N'Código de distrito', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'distritod'
GO
exec sp_addextendedproperty N'MS_Description', N'Código de departamento+distrito', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'distripg'
GO
exec sp_addextendedproperty N'MS_Description', N'Tipo de area', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'area'
GO
exec sp_addextendedproperty N'MS_Description', N'Código del barrio', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'barrio'
GO
exec sp_addextendedproperty N'MS_Description', N'Nombre de la manzana', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'manzana'
GO
exec sp_addextendedproperty N'MS_Description', N'Número de formulario', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'formulario'
GO
exec sp_addextendedproperty N'MS_Description', N'Número de vivienda', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'vivi'
GO
exec sp_addextendedproperty N'MS_Description', N'Número de hogar', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'hogar'
GO
exec sp_addextendedproperty N'MS_Description', N'Dirección de la vivienda', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'direccion'
GO
exec sp_addextendedproperty N'MS_Description', N'Número de la casa', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'nro_de'
GO
exec sp_addextendedproperty N'MS_Description', N'Número de teléfono', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'telefono'
GO
exec sp_addextendedproperty N'MS_Description', N'Fecha de la entrevista', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'fecha'
GO
exec sp_addextendedproperty N'MS_Description', N'Día de la entrevista', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'dia'
GO
exec sp_addextendedproperty N'MS_Description', N'Mes de la entrevista', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'mes'
GO
exec sp_addextendedproperty N'MS_Description', N'Año de la entrevista', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'ano'
GO
exec sp_addextendedproperty N'MS_Description', N'Total de personas que viven en el hogar', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v10t'
GO
exec sp_addextendedproperty N'MS_Description', N'Total de hombres que viven en el hogar', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v11'
GO
exec sp_addextendedproperty N'MS_Description', N'Total de mujeres que viven el hogar', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v12'
GO
exec sp_addextendedproperty N'MS_Description', N'Material predominante en las paredes exteriores', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v13'
GO
exec sp_addextendedproperty N'MS_Description', N'Material predominante en el piso ', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v14'
GO
exec sp_addextendedproperty N'MS_Description', N'Material predominante en el techo', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v15'
GO
exec sp_addextendedproperty N'MS_Description', N'Condición de ocupación de la vivienda', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v16'
GO
exec sp_addextendedproperty N'MS_Description', N'Otra condición de ocupación de la vivienda', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v16_otr'
GO
exec sp_addextendedproperty N'MS_Description', N'Número de piezas de la vivienda', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v17a'
GO
exec sp_addextendedproperty N'MS_Description', N'Número de dormitorios de la vivienda', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v17b'
GO
exec sp_addextendedproperty N'MS_Description', N'Tiene pieza para cocinar ', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v18'
GO
exec sp_addextendedproperty N'MS_Description', N'Combustible que se utiliza en forma habitual para cocinar  ', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v19'
GO
exec sp_addextendedproperty N'MS_Description', N'Tipo de pieza para bañarse', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v20'
GO
exec sp_addextendedproperty N'MS_Description', N'Tipo de desagüe que tiene el baño ', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v21'
GO
exec sp_addextendedproperty N'MS_Description', N'Procedencia del agua que se utiliza en l a vivienda  ', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v22'
GO
exec sp_addextendedproperty N'MS_Description', N'Lugar de abastecimiento del agua que se utiliza en l a vivienda  ', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v23'
GO
exec sp_addextendedproperty N'MS_Description', N'Dispone de luz eléctrica', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v24'
GO
exec sp_addextendedproperty N'MS_Description', N'Forma de desechar la basura ', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v25'
GO
exec sp_addextendedproperty N'MS_Description', N'Tiene teléfono celular  ', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v26'
GO
exec sp_addextendedproperty N'MS_Description', N'Número de teléfono celular', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v26esp_celular'
GO
exec sp_addextendedproperty N'MS_Description', N'Tiene teléfono línea baja', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v27'
GO
exec sp_addextendedproperty N'MS_Description', N'Número de teléfono línea baja', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v27esp_linea'
GO
exec sp_addextendedproperty N'MS_Description', N'Dispone de heladera en el hogar', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v28_1'
GO
exec sp_addextendedproperty N'MS_Description', N'Dispone de lavarropas en el hogar ', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v28_2'
GO
exec sp_addextendedproperty N'MS_Description', N'Dispone de termocalefón en el hogar ', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v28_3'
GO
exec sp_addextendedproperty N'MS_Description', N'Dispone de aire acondicionado en el hogar ', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v28_4'
GO
exec sp_addextendedproperty N'MS_Description', N'Dispone de automóvil o camioneta en el hogar ', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v28_5'
GO
exec sp_addextendedproperty N'MS_Description', N'Dispone de camión en el hogar ', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v28_6'
GO
exec sp_addextendedproperty N'MS_Description', N'Dispone de motocicleta en el hogar ', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v28_7'
GO
exec sp_addextendedproperty N'MS_Description', N'No dispone de ninguno de los otros bienes', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v28_8'
GO
exec sp_addextendedproperty N'MS_Description', N'Nombre del jefe del hogar', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v29nombre_jefe'
GO
exec sp_addextendedproperty N'MS_Description', N'Número de cédula del jefe del hogar', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'cedulajefe'
GO
exec sp_addextendedproperty N'MS_Description', N'Número de ficha persona', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'var00001'
GO
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- log_imp_per
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
exec sp_addextendedproperty N'MS_Description', N'Código del departamento', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p01a'
GO
exec sp_addextendedproperty N'MS_Description', N'Código del distrito', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p01b'
GO
exec sp_addextendedproperty N'MS_Description', N'Código del barrio', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p01c'
GO
exec sp_addextendedproperty N'MS_Description', N'Número de formulario', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p01d'
GO
exec sp_addextendedproperty N'MS_Description', N'Número de vivienda', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p02'
GO
exec sp_addextendedproperty N'MS_Description', N'Número de hogar', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p03'
GO
exec sp_addextendedproperty N'MS_Description', N'Orden del respondente', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p104'
GO
exec sp_addextendedproperty N'MS_Description', N'Orden de la persona censada', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p43'
GO
exec sp_addextendedproperty N'MS_Description', N'Primer nombre de la persona', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p45a'
GO
exec sp_addextendedproperty N'MS_Description', N'Segundo nombre de la persona', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p45b'
GO
exec sp_addextendedproperty N'MS_Description', N'Primer apellido de la persona', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p44a'
GO
exec sp_addextendedproperty N'MS_Description', N'Segundo apellido de la persona', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p44b'
GO
exec sp_addextendedproperty N'MS_Description', N'Apellido de casada de la persona', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'var00001'
GO
exec sp_addextendedproperty N'MS_Description', N'Apodo de la persona', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'var00002'
GO
exec sp_addextendedproperty N'MS_Description', N'Edad de la persona', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p46'
GO
exec sp_addextendedproperty N'MS_Description', N'Sexo de la persona', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p47'
GO
exec sp_addextendedproperty N'MS_Description', N'Estado civil de la persona', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'var00030'
GO
exec sp_addextendedproperty N'MS_Description', N'Parentesco de la persona con el jefe del hogar', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p48'
GO
exec sp_addextendedproperty N'MS_Description', N'Es la persona miembro del hogar', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p49'
GO
exec sp_addextendedproperty N'MS_Description', N'Orden del cónyuge de la persona', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p50a'
GO
exec sp_addextendedproperty N'MS_Description', N'Orden del padre de la persona', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p50b'
GO
exec sp_addextendedproperty N'MS_Description', N'Orden de la madre de la persona', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p50c'
GO
exec sp_addextendedproperty N'MS_Description', N'Número de cédula de la persona', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p51'
GO
exec sp_addextendedproperty N'MS_Description', N'Letra de la cédula de la persona', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'var00003'
GO
exec sp_addextendedproperty N'MS_Description', N'Tipo de excepción de cédula de identidad de la persona', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'var00004'
GO
exec sp_addextendedproperty N'MS_Description', N'Día de nacimiento de la persona', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p52d'
GO
exec sp_addextendedproperty N'MS_Description', N'Mes de nacimiento de la persona', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p52m'
GO
exec sp_addextendedproperty N'MS_Description', N'Año de nacimiento de la persona', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p52a'
GO
exec sp_addextendedproperty N'MS_Description', N'Departamento en que nació la persona', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p53a'
GO
exec sp_addextendedproperty N'MS_Description', N'Distrito en que nació la persona', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p53b'
GO
exec sp_addextendedproperty N'MS_Description', N'Código del distrito de nacimiento', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p53c'
GO
exec sp_addextendedproperty N'MS_Description', N'Tipo de área del lugar de nacimiento', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p53z'
GO
exec sp_addextendedproperty N'MS_Description', N'Idioma que habla mayormente', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p54'
GO
exec sp_addextendedproperty N'MS_Description', N'Otro idioma', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p54e'
GO
exec sp_addextendedproperty N'MS_Description', N'Asistió a clases el año pasado', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p56'
GO
exec sp_addextendedproperty N'MS_Description', N'Por qué no asistió a clases el año pasado', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p58'
GO
exec sp_addextendedproperty N'MS_Description', N'Otro motivo de no asistencia', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p58e'
GO
exec sp_addextendedproperty N'MS_Description', N'Piensa matricularse este año', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p59'
GO
exec sp_addextendedproperty N'MS_Description', N'Último grado o curso aprobado', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p60'
GO
exec sp_addextendedproperty N'MS_Description', N'Nivel del último grado o curso aprobado', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p61'
GO
exec sp_addextendedproperty N'MS_Description', N'Realizó curso no formal', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p62'
GO
exec sp_addextendedproperty N'MS_Description', N'Tiene seguro médico vigente', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p63'
GO
exec sp_addextendedproperty N'MS_Description', N'Estuvo enfermo o accidentado', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p64'
GO
exec sp_addextendedproperty N'MS_Description', N'Que enfermedad tuvo', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p65'
GO
exec sp_addextendedproperty N'MS_Description', N'Otra enfermedad', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p65e'
GO
exec sp_addextendedproperty N'MS_Description', N'Qué enfermedad crónica padece', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p66'
GO
exec sp_addextendedproperty N'MS_Description', N'Otra enfermedad crónica', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p66e'
GO
exec sp_addextendedproperty N'MS_Description', N'Recibió atención por la enfermedad o accidente', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p67'
GO
exec sp_addextendedproperty N'MS_Description', N'Por qué no recibió atención', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p68'
GO
exec sp_addextendedproperty N'MS_Description', N'Otro motivo de no atención', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p68e'
GO
exec sp_addextendedproperty N'MS_Description', N'Tiene carné de vacunación', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p73'
GO
exec sp_addextendedproperty N'MS_Description', N'Clase de impedimento físico', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p74'
GO
exec sp_addextendedproperty N'MS_Description', N'Otra clase de impedimento físico', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'var00006'
GO
exec sp_addextendedproperty N'MS_Description', N'Número de causa de impedimento físico', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'var00007'
GO
exec sp_addextendedproperty N'MS_Description', N'Otra causa de impedimento físico', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'var00008'
GO
exec sp_addextendedproperty N'MS_Description', N'Tiene dificultad para caminar', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'var00009'
GO
exec sp_addextendedproperty N'MS_Description', N'Tiene dificultad para vestirse', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'var00010'
GO
exec sp_addextendedproperty N'MS_Description', N'Tiene dificultad para bañarse', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'var00011'
GO
exec sp_addextendedproperty N'MS_Description', N'Tiene dificultad para comer', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'var00031'
GO
exec sp_addextendedproperty N'MS_Description', N'Tiene dificultad para ir a la cama', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'var00012'
GO
exec sp_addextendedproperty N'MS_Description', N'Tiene dificultad para ir al baño', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'var00013'
GO
exec sp_addextendedproperty N'MS_Description', N'Realizó alguna actividad económica', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p86'
GO
exec sp_addextendedproperty N'MS_Description', N'Razón por la que no trabajó', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p87'
GO
exec sp_addextendedproperty N'MS_Description', N'Otra razón por la que no trabajó', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p87e'
GO
exec sp_addextendedproperty N'MS_Description', N'Ocupación principal', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p88'
GO
exec sp_addextendedproperty N'MS_Description', N'Otra ocupación principal', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p88e'
GO
exec sp_addextendedproperty N'MS_Description', N'Tipo Relación laboral', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p91'
GO
exec sp_addextendedproperty N'MS_Description', N'Monto de ingreso por ocupación principal', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'var00017'
GO
exec sp_addextendedproperty N'MS_Description', N'Monto de ingreso por ocupacion secundaria', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'var00018'
GO
exec sp_addextendedproperty N'MS_Description', N'Monto  de ingreso por otras ocupaciones', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'var00019'
GO
exec sp_addextendedproperty N'MS_Description', N'Monto de ingreso por alquileres', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'var00020'
GO
exec sp_addextendedproperty N'MS_Description', N'Monto de ingreso por intereses', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'var00021'
GO
exec sp_addextendedproperty N'MS_Description', N'Monto de ingreso por ayuda familiar dentro del país', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'var00022'
GO
exec sp_addextendedproperty N'MS_Description', N'Monto de ingreso por ayuda familiar del exterior', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'var00023'
GO
exec sp_addextendedproperty N'MS_Description', N'Monto de ingreso por jubilacion', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'var00024'
GO
exec sp_addextendedproperty N'MS_Description', N'Monto de ingreso por pensiones', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'var00025'
GO
exec sp_addextendedproperty N'MS_Description', N'Monto de ingreso por tekopora', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'var00026'
GO
exec sp_addextendedproperty N'MS_Description', N'Monto de ingreso por otros programas', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'var00027'
GO
exec sp_addextendedproperty N'MS_Description', N'Monto de ingreso adicional', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'var00028'
GO
exec sp_addextendedproperty N'MS_Description', N'Ingreso total mensual', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p92'
GO
exec sp_addextendedproperty N'MS_Description', N'Indice Calidad Vida', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'icv'
GO
exec sp_addextendedproperty N'MS_Description', N'Ficha Activa', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'ficha_activa'
GO
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- log_imp_per_eec
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
exec sp_addextendedproperty N'MS_Description', N'Código de departamento', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'dptod'
GO
exec sp_addextendedproperty N'MS_Description', N'Código de distrito', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'distritod'
GO
exec sp_addextendedproperty N'MS_Description', N'Código de departamento+distrito', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'distripg'
GO
exec sp_addextendedproperty N'MS_Description', N'Tipo de area', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'area'
GO
exec sp_addextendedproperty N'MS_Description', N'Código del barrio', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'barrio'
GO
exec sp_addextendedproperty N'MS_Description', N'Nombre de la manzana', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'manzana'
GO
exec sp_addextendedproperty N'MS_Description', N'Número de formulario', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'formulario'
GO
exec sp_addextendedproperty N'MS_Description', N'Número de vivienda', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'vivi'
GO
exec sp_addextendedproperty N'MS_Description', N'Número de hogar', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'hogar'
GO
exec sp_addextendedproperty N'MS_Description', N'Orden del respondente', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'orden'
GO
exec sp_addextendedproperty N'MS_Description', N'Nombres de la persona', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p30'
GO
exec sp_addextendedproperty N'MS_Description', N'Apellidos de la persona', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p31'
GO
exec sp_addextendedproperty N'MS_Description', N'Edad de la persona', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p32'
GO
exec sp_addextendedproperty N'MS_Description', N'Sexo de la persona', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p33'
GO
exec sp_addextendedproperty N'MS_Description', N'Parentesco de la persona con el jefe del hogar', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p34'
GO
exec sp_addextendedproperty N'MS_Description', N'Es la persona miembro del hogar', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p35'
GO
exec sp_addextendedproperty N'MS_Description', N'Orden del cónyuge de la persona', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p36_orden_conyugue'
GO
exec sp_addextendedproperty N'MS_Description', N'Orden del padre de la persona', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p36_orden_padre'
GO
exec sp_addextendedproperty N'MS_Description', N'Orden de la madre de la persona', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p36_orden_madre'
GO
exec sp_addextendedproperty N'MS_Description', N'N° control', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p37'
GO
exec sp_addextendedproperty N'MS_Description', N'Número de cédula de la persona', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p37_cedula'
GO
exec sp_addextendedproperty N'MS_Description', N'Día de nacimiento de la persona', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p38_dia'
GO
exec sp_addextendedproperty N'MS_Description', N'Mes de nacimiento de la persona', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p38_mes'
GO
exec sp_addextendedproperty N'MS_Description', N'Año de nacimiento de la persona', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p38_ano'
GO
exec sp_addextendedproperty N'MS_Description', N'País de nacimiento de la persona', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p39pais'
GO
exec sp_addextendedproperty N'MS_Description', N'Código de departamento', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p39dpto'
GO
exec sp_addextendedproperty N'MS_Description', N'Código de distrito', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p39dist'
GO
exec sp_addextendedproperty N'MS_Description', N'Tipo de área del lugar de nacimiento', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p39area'
GO
exec sp_addextendedproperty N'MS_Description', N'Idioma que habla mayormente', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p40_idioma'
GO
exec sp_addextendedproperty N'MS_Description', N'Otro idioma', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p40otr'
GO
exec sp_addextendedproperty N'MS_Description', N'Asistió a clases el año pasado', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p41'
GO
exec sp_addextendedproperty N'MS_Description', N'Por qué no asistió a clases el año pasado', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p42'
GO
exec sp_addextendedproperty N'MS_Description', N'Está matriculado actualmente en una Institución Educativa', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p43'
GO
exec sp_addextendedproperty N'MS_Description', N'Grado+nivel último curso aprobado', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p44_45t'
GO
exec sp_addextendedproperty N'MS_Description', N'Último grado o curso aprobado', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p44'
GO
exec sp_addextendedproperty N'MS_Description', N'Nivel del último grado o curso aprobado', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p45'
GO
exec sp_addextendedproperty N'MS_Description', N'Realizó curso no formal', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p46'
GO
exec sp_addextendedproperty N'MS_Description', N'Tiene seguro médico vigente', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p47'
GO
exec sp_addextendedproperty N'MS_Description', N'Estuvo enfermo o accidentado', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p48'
GO
exec sp_addextendedproperty N'MS_Description', N'Que enfermedad tuvo', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p49'
GO
exec sp_addextendedproperty N'MS_Description', N'Otra enfermedad', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p49_otr'
GO
exec sp_addextendedproperty N'MS_Description', N'Qué enfermedad crónica padece', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p50'
GO
exec sp_addextendedproperty N'MS_Description', N'Otra enfermedad crónica', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p50_otr'
GO
exec sp_addextendedproperty N'MS_Description', N'Recibió atención por la enfermedad o accidente', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p51'
GO
exec sp_addextendedproperty N'MS_Description', N'Por qué no recibió atención', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p52'
GO
exec sp_addextendedproperty N'MS_Description', N'Otro motivo de no atención', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p52_otr'
GO
exec sp_addextendedproperty N'MS_Description', N'Tiene carné de vacunación', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p53'
GO
exec sp_addextendedproperty N'MS_Description', N'Tiene impedimento físico de forma permanente', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p54'
GO
exec sp_addextendedproperty N'MS_Description', N'Impedimento físico permanente', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p54a'
GO
exec sp_addextendedproperty N'MS_Description', N'Otra clase de impedimento físico', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p54_otr'
GO
exec sp_addextendedproperty N'MS_Description', N'Número de causa de impedimento físico', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p55'
GO
exec sp_addextendedproperty N'MS_Description', N'Otra causa de impedimento físico', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p55_otr'
GO
exec sp_addextendedproperty N'MS_Description', N'Tiene dificultad para caminar', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p56'
GO
exec sp_addextendedproperty N'MS_Description', N'Tiene dificultad para vestirse', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p57'
GO
exec sp_addextendedproperty N'MS_Description', N'Tiene dificultad para bañarse', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p58'
GO
exec sp_addextendedproperty N'MS_Description', N'Tiene dificultad para comer', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p59'
GO
exec sp_addextendedproperty N'MS_Description', N'Tiene dificultad para ir a la cama', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p60'
GO
exec sp_addextendedproperty N'MS_Description', N'Tiene dificultad para ir al baño', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p61'
GO
exec sp_addextendedproperty N'MS_Description', N'Realizó alguna actividad económica', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p62'
GO
exec sp_addextendedproperty N'MS_Description', N'Razón por la que no trabajó', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p63'
GO
exec sp_addextendedproperty N'MS_Description', N'Otra razón por la que no trabajó', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p63_especificar'
GO
exec sp_addextendedproperty N'MS_Description', N'Ocupación principal', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p64des'
GO
exec sp_addextendedproperty N'MS_Description', N'Código de ocupación principal', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p64c'
GO
exec sp_addextendedproperty N'MS_Description', N'Negocio lugar de trabajo', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p65des'
GO
exec sp_addextendedproperty N'MS_Description', N'Código de rama de actividades', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p65c'
GO
exec sp_addextendedproperty N'MS_Description', N'Tipo Relación laboral', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p66'
GO
exec sp_addextendedproperty N'MS_Description', N'Monto de ingreso por ocupación principal', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p67a'
GO
exec sp_addextendedproperty N'MS_Description', N'Monto de ingreso por ocupacion secundaria', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p67b'
GO
exec sp_addextendedproperty N'MS_Description', N'Monto  de ingreso por otras ocupaciones', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p67c'
GO
exec sp_addextendedproperty N'MS_Description', N'Monto de ingreso por alquileres', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p67d'
GO
exec sp_addextendedproperty N'MS_Description', N'Monto de ingreso por intereses', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p67e'
GO
exec sp_addextendedproperty N'MS_Description', N'Monto de ingreso por ayuda familiar dentro del país', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p67f'
GO
exec sp_addextendedproperty N'MS_Description', N'Monto de ingreso por ayuda familiar del exterior', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p67g'
GO
exec sp_addextendedproperty N'MS_Description', N'Monto de ingreso por jubilacion', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p67h'
GO
exec sp_addextendedproperty N'MS_Description', N'Monto de ingreso por pensiones', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p67i'
GO
exec sp_addextendedproperty N'MS_Description', N'Monto de ingreso por tekopora', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p67j'
GO
exec sp_addextendedproperty N'MS_Description', N'Monto de ingreso por otros programas', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p67k'
GO
exec sp_addextendedproperty N'MS_Description', N'Monto de ingreso adicional', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p67l'
GO
exec sp_addextendedproperty N'MS_Description', N'Ingreso total mensual', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p67tot'
GO
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- nivel_educativo
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
exec sp_addextendedproperty N'MS_Description', N'Número del primer curso del nivel', N'user', N'dbo', N'table', N'nivel_educativo', N'column', N'primer_curso'
GO
exec sp_addextendedproperty N'MS_Description', N'Número del último curso del nivel', N'user', N'dbo', N'table', N'nivel_educativo', N'column', N'ultimo_curso'
GO
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- objecion_ele_pen
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
exec sp_addextendedproperty N'MS_Description', N'Fecha de anulación de la objeción', N'user', N'dbo', N'table', N'objecion_ele_pen', N'column', N'fecha_anulacion'
GO
exec sp_addextendedproperty N'MS_Description', N'Motivo por el cual se anula la objeción', N'user', N'dbo', N'table', N'objecion_ele_pen', N'column', N'observaciones_anulacion'
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
