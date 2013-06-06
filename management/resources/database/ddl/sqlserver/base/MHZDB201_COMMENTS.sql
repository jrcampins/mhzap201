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
exec sp_addextendedproperty N'MS_Description', N'N�mero de Zona � Huso (1-60) de la ubicaci�n de la vivienda (seg�n GPS)', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'huso_utm'
GO
exec sp_addextendedproperty N'MS_Description', N'Banda � Franja (C-X, sin I ni O) de la ubicaci�n de la vivienda (seg�n GPS)', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'franja_utm'
GO
exec sp_addextendedproperty N'MS_Description', N'Coordenada X: distancia horizontal al Este (Easting) de la ubicaci�n de la vivienda (seg�n GPS)', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'distancia_este_utm'
GO
exec sp_addextendedproperty N'MS_Description', N'Coordenada Y: distancia vertical al Norte (Northing) de la ubicaci�n de la vivienda (seg�n GPS)', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'distancia_norte_utm'
GO
exec sp_addextendedproperty N'MS_Description', N'Tipo de �rea (urbana o rural)', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_tipo_area'
GO
exec sp_addextendedproperty N'MS_Description', N'Material predominante en las paredes exteriores', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_tipo_mat_paredes'
GO
exec sp_addextendedproperty N'MS_Description', N'Material predominante en el piso', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_tipo_mat_piso'
GO
exec sp_addextendedproperty N'MS_Description', N'Material predominante en el techo', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_tipo_mat_techo'
GO
exec sp_addextendedproperty N'MS_Description', N'Condici�n de ocupaci�n de la vivienda', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_tipo_ocupacion_viv'
GO
exec sp_addextendedproperty N'MS_Description', N'Condici�n de ocupaci�n de la vivienda (especificar si la respuesta anterior es 6 "Otros")', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'otro_tipo_ocupacion_viv'
GO
exec sp_addextendedproperty N'MS_Description', N'N�mero de piezas, sin incluir ba�o, cocina, cuartos o piezas destinadas exclusivamente al comercio o industria', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'cantidad_piezas'
GO
exec sp_addextendedproperty N'MS_Description', N'N�mero de dormitorios', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'cantidad_dormitorios'
GO
exec sp_addextendedproperty N'MS_Description', N'Tiene pieza para cocinar', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_siono_pieza_cocina'
GO
exec sp_addextendedproperty N'MS_Description', N'Combustible que se utiliza en forma habitual para cocinar', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_tipo_combustible'
GO
exec sp_addextendedproperty N'MS_Description', N'Tipo de pieza para ba�arse', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_tipo_pieza_bano'
GO
exec sp_addextendedproperty N'MS_Description', N'Tipo de desag�e que tiene el ba�o', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_tipo_servicio_san'
GO
exec sp_addextendedproperty N'MS_Description', N'Procedencia del agua que se utiliza en l a vivienda', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_tipo_servicio_agua'
GO
exec sp_addextendedproperty N'MS_Description', N'Lugar de abastecimiento del agua que se utiliza en l a vivienda', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_tipo_aba_agua'
GO
exec sp_addextendedproperty N'MS_Description', N'Dispone de luz el�ctrica', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_siono_corriente_elec'
GO
exec sp_addextendedproperty N'MS_Description', N'Forma de desechar la basura', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_tipo_desecho_bas'
GO
exec sp_addextendedproperty N'MS_Description', N'Tiene tel�fono celular', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_siono_telefono_celular'
GO
exec sp_addextendedproperty N'MS_Description', N'N�mero de tel�fono celular', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_telefono_celular'
GO
exec sp_addextendedproperty N'MS_Description', N'Tiene tel�fono de linea baja', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_siono_tlf_linea_baja'
GO
exec sp_addextendedproperty N'MS_Description', N'N�mero de tel�fono de linea baja', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_telefono_linea_baja'
GO
exec sp_addextendedproperty N'MS_Description', N'Dispone de heladera en el hogar', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_siono_disp_heladera'
GO
exec sp_addextendedproperty N'MS_Description', N'Dispone de lavarropas en el hogar', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_siono_disp_lavarropas'
GO
exec sp_addextendedproperty N'MS_Description', N'Dispone de termocalef�n en el hogar', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_siono_disp_termo'
GO
exec sp_addextendedproperty N'MS_Description', N'Dispone de aire acondicionado en el hogar', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_siono_disp_aire_acon'
GO
exec sp_addextendedproperty N'MS_Description', N'Dispone de autom�vil � camioneta en el hogar', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_siono_disp_automovil'
GO
exec sp_addextendedproperty N'MS_Description', N'Dispone de cami�n en el hogar', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_siono_disp_camion'
GO
exec sp_addextendedproperty N'MS_Description', N'Dispone de motocicleta en el hogar', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_siono_disp_motocicleta'
GO
exec sp_addextendedproperty N'MS_Description', N'Nombre del jefe de hogar', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'nombre_jefe_hogar'
GO
exec sp_addextendedproperty N'MS_Description', N'N�mero de c�dula del jefe de hogar', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_cedula_jefe_hogar'
GO
exec sp_addextendedproperty N'MS_Description', N'Letra de la c�dula del jefe de hogar', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'letra_cedula_jefe_hogar'
GO
exec sp_addextendedproperty N'MS_Description', N'N�mero de orden de identificaci�n del jefe de hogar', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_orden_iden_jefe_hogar'
GO
exec sp_addextendedproperty N'MS_Description', N'Nombre del respondente', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'nombre_respondente'
GO
exec sp_addextendedproperty N'MS_Description', N'N�mero de c�dula del respondente', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_cedula_respondente'
GO
exec sp_addextendedproperty N'MS_Description', N'Letra de la c�dula del respondente', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'letra_cedula_respondente'
GO
exec sp_addextendedproperty N'MS_Description', N'N�mero de orden de identificaci�n del respondente', N'user', N'dbo', N'table', N'ficha_hogar', N'column', N'numero_orden_iden_respondente'
GO
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- ficha_persona
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
exec sp_addextendedproperty N'MS_Description', N'N�mero de orden de identificaci�n de la persona', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_orden_identificacion'
GO
exec sp_addextendedproperty N'MS_Description', N'Parentesco familiar con el/la jefe/a del hogar', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_tipo_persona_hogar'
GO
exec sp_addextendedproperty N'MS_Description', N'Es miembro del hogar', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_siono_miembro_hogar'
GO
exec sp_addextendedproperty N'MS_Description', N'N�mero de orden de identificaci�n del conyuge', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_orden_iden_conyuge'
GO
exec sp_addextendedproperty N'MS_Description', N'N�mero de orden de identificaci�n del padre', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_orden_iden_padre'
GO
exec sp_addextendedproperty N'MS_Description', N'N�mero de orden de identificaci�n de la madre', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_orden_iden_madre'
GO
exec sp_addextendedproperty N'MS_Description', N'Raz�n por la que no se dispone del n�mero de c�dula de la persona', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_tipo_excepcion_ced'
GO
exec sp_addextendedproperty N'MS_Description', N'Departamento donde viv�a la madre cuando naci�', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'id_departamento_nacimiento'
GO
exec sp_addextendedproperty N'MS_Description', N'Distrito donde viv�a la madre cuando naci�', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'id_distrito_nacimiento'
GO
exec sp_addextendedproperty N'MS_Description', N'Tipo de �rea (urbana o rural) donde viv�a la madre cuando naci�', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_tipo_area_lugar_nac'
GO
exec sp_addextendedproperty N'MS_Description', N'Idioma que habla en la casa la mayor parte del tiempo', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_idioma_hogar'
GO
exec sp_addextendedproperty N'MS_Description', N'Idioma que habla en la casa la mayor parte del tiempo (especificar si la respuesta anterior es 4 "Otro idioma")', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'otro_idioma_hogar'
GO
exec sp_addextendedproperty N'MS_Description', N'Asiste o asisti� a una escuela, colegio o institucion de ense�anza regular', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_siono_asistencia_esc'
GO
exec sp_addextendedproperty N'MS_Description', N'Motivo por el que no asiste o dej� de asistir a la escuela, colegio o institucion de ense�anza regular', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_motivo_ina_esc'
GO
exec sp_addextendedproperty N'MS_Description', N'Motivo por el que no asiste o dej� de asistir a la escuela, colegio o institucion de ense�anza regular (especificar si la respuesta anterior es 25 "Otros")', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'otro_motivo_ina_esc'
GO
exec sp_addextendedproperty N'MS_Description', N'Esta matriculado actualmente en una instituci�n educativa', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_siono_matriculacion_esc'
GO
exec sp_addextendedproperty N'MS_Description', N'Ultimo grado/ciclo o curso que aprob�', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'ultimo_curso_aprobado'
GO
exec sp_addextendedproperty N'MS_Description', N'Nivel al que corresponde el �ltimo grado/ciclo o curso que aprob�', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_nivel_edu_ult_cur_aprob'
GO
exec sp_addextendedproperty N'MS_Description', N'Realiz� alg�n curso no formal para poder trabajar, ejercer alg�n oficio o mejorar su nivel cultural', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_siono_curso_no_formal'
GO
exec sp_addextendedproperty N'MS_Description', N'Tiene seguro m�dico vigente en el pa�s', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_tipo_seguro_medico'
GO
exec sp_addextendedproperty N'MS_Description', N'Durante los �ltimos 90 dias, se sinti� o estuvo enfermo y/o accidentado', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_estado_salud'
GO
exec sp_addextendedproperty N'MS_Description', N'Enfermedad y/o accidente que tuvo durante los �ltimos 90 dias', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_clase_enf_acc'
GO
exec sp_addextendedproperty N'MS_Description', N'Enfermedad y/o accidente que tuvo durante los �ltimos 90 dias (especificar si la respuesta anterior es 44 "Otros")', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'otra_clase_enf_acc'
GO
exec sp_addextendedproperty N'MS_Description', N'Enfermedad cr�nica que tiene', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_clase_enf_cronica'
GO
exec sp_addextendedproperty N'MS_Description', N'Enfermedad cr�nica que tiene (especificar si la respuesta anterior es 42 "Otros")', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'otra_clase_enf_cronica'
GO
exec sp_addextendedproperty N'MS_Description', N'Recibi� atenci�n m�dica por la enfermedad y/o accidente que tuvo o tiene', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_siono_atencion_medica'
GO
exec sp_addextendedproperty N'MS_Description', N'Motivo por el que no recibi� atenci�n m�dica', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_motivo_no_atencion'
GO
exec sp_addextendedproperty N'MS_Description', N'Motivo por el que no recibi� atenci�n m�dica (especificar si la respuesta anterior es 9 "Otros")', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'otro_motivo_no_atencion'
GO
exec sp_addextendedproperty N'MS_Description', N'Tiene carnet de vacunaci�n', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_siono_carnet_vacunacion'
GO
exec sp_addextendedproperty N'MS_Description', N'Tiene impedimento f�sico o mental de forma permanente', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_clase_impedimento'
GO
exec sp_addextendedproperty N'MS_Description', N'Tiene impedimento f�sico o mental de forma permanente (especificar si la respuesta anterior es 13 "Otros")', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'otra_clase_impedimento'
GO
exec sp_addextendedproperty N'MS_Description', N'Causa del impedimento', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_causa_impedimento'
GO
exec sp_addextendedproperty N'MS_Description', N'Causa del impedimento (especificar si la respuesta anterior es 5 "Otros")', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'otra_causa_impedimento'
GO
exec sp_addextendedproperty N'MS_Description', N'Tiene dificultad para cruzar una pieza/habitaci�n caminando', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_siono_dif_para_caminar'
GO
exec sp_addextendedproperty N'MS_Description', N'Tiene dificultad para vestirse, incluyendo ponerse los zapatos y las medias', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_siono_dif_para_vestirse'
GO
exec sp_addextendedproperty N'MS_Description', N'Tiene dificultad para ba�arse, incluyendo entrar y salid de la ba�adera', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_siono_dif_para_banarse'
GO
exec sp_addextendedproperty N'MS_Description', N'Tiene dificultad para comer, incluyendo cortar la comida, llenar los vasos, etc.', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_siono_dif_para_comer'
GO
exec sp_addextendedproperty N'MS_Description', N'Tiene dificultad para acostarse o pararse de la cama', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_siono_dif_para_la_cama'
GO
exec sp_addextendedproperty N'MS_Description', N'Tiene dificultad para usar el servicio sanitario, incluyendo sentarse o levantarse del excusado o inodoro', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_siono_dif_para_el_bano'
GO
exec sp_addextendedproperty N'MS_Description', N'Durante los �ltimos 30 dias trabaj�, realiz� alguna changa, o hizo alg�n producto dentro o fuera de su casa para vender, o prest� alg�n servicio, o ayud� a alguien en su trabajo, negocio o chacra', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_siono_trabajo'
GO
exec sp_addextendedproperty N'MS_Description', N'Motivo principal por el que no trabaj� durante los �ltimos 30 dias', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_motivo_no_trabajo'
GO
exec sp_addextendedproperty N'MS_Description', N'Motivo principal por el que no trabaj� durante los �ltimos 30 dias (especificar si la respuesta anterior es 9 "Otros")', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'otro_motivo_no_trabajo'
GO
exec sp_addextendedproperty N'MS_Description', N'Ocupaci�n principal en el trabajo que realiza o realizaba', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'descripcion_ocupacion_prin'
GO
exec sp_addextendedproperty N'MS_Description', N'Producto o servicio principal que se produce o se presta en el lugar donde trabaja o trabajaba', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'descripcion_dedicacion_prin'
GO
exec sp_addextendedproperty N'MS_Description', N'Relaci�n laboral que mentiene o manten�a', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'numero_tipo_relacion_lab'
GO
exec sp_addextendedproperty N'MS_Description', N'Monto del ingreso mensual que habitualmente recibe en su ocupaci�n principal', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'monto_ingreso_ocupacion_prin'
GO
exec sp_addextendedproperty N'MS_Description', N'Monto del ingreso mensual que habitualmente recibe en su ocupaci�n secundaria', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'monto_ingreso_ocupacion_secun'
GO
exec sp_addextendedproperty N'MS_Description', N'Monto del ingreso mensual que habitualmente recibe en todas las otras ocupaciones', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'monto_ingreso_otras_ocup'
GO
exec sp_addextendedproperty N'MS_Description', N'Monto del ingreso mensual que habitualmente recibe por alquileres o rentas (neto)', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'monto_ingreso_alquileres'
GO
exec sp_addextendedproperty N'MS_Description', N'Monto del ingreso mensual que habitualmente recibe por intereses, dividendos o utilidades', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'monto_ingreso_intereses'
GO
exec sp_addextendedproperty N'MS_Description', N'Monto del ingreso mensual que habitualmente recibe por ayuda familiar del pa�s', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'monto_ingreso_ayuda_fam_pais'
GO
exec sp_addextendedproperty N'MS_Description', N'Monto del ingreso mensual que habitualmente recibe por ayuda familiar del exterior', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'monto_ingreso_ayuda_fam_exter'
GO
exec sp_addextendedproperty N'MS_Description', N'Monto del ingreso mensual que habitualmente recibe por jubilaci�n o pensi�n', N'user', N'dbo', N'table', N'ficha_persona', N'column', N'monto_ingreso_jubilacion'
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
exec sp_addextendedproperty N'MS_Description', N'N�mero de NIS (Si aplica)', N'user', N'dbo', N'table', N'log_imp_deu', N'column', N'referencia'
GO
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- log_imp_hog
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
exec sp_addextendedproperty N'MS_Description', N'D�a de la entrevista', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p20d'
GO
exec sp_addextendedproperty N'MS_Description', N'Mes de la entrevista', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p20m'
GO
exec sp_addextendedproperty N'MS_Description', N'A�o de la entrevista', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p20a'
GO
exec sp_addextendedproperty N'MS_Description', N'Funcionario censista', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p17'
GO
exec sp_addextendedproperty N'MS_Description', N'Funcionario cupervisor', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p18'
GO
exec sp_addextendedproperty N'MS_Description', N'Funcionario cr�tico decodificador', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'var00001'
GO
exec sp_addextendedproperty N'MS_Description', N'Funcionario Digitador', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p19'
GO
exec sp_addextendedproperty N'MS_Description', N'Observaciones de Campo', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'observaciones'
GO
exec sp_addextendedproperty N'MS_Description', N'N�mero de Zona � Huso de la ubicaci�n de la vivienda (seg�n GPS)', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'utm'
GO
exec sp_addextendedproperty N'MS_Description', N'Banda � Franja de la ubicaci�n de la vivienda (seg�n GPS)��', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'gps'
GO
exec sp_addextendedproperty N'MS_Description', N'Distancia vertical al Norte de la ubicaci�n de la vivienda (seg�n GPS)�', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'orden'
GO
exec sp_addextendedproperty N'MS_Description', N'Distancia horizontal al Este de la ubicaci�n de la vivienda (seg�n GPS)', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'coordx'
GO
exec sp_addextendedproperty N'MS_Description', N'C�digo Departamento', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p01a'
GO
exec sp_addextendedproperty N'MS_Description', N'C�digo Distrito', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p01b'
GO
exec sp_addextendedproperty N'MS_Description', N'C�digo Barrio', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p01c'
GO
exec sp_addextendedproperty N'MS_Description', N'N�mero Formulario', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p01d'
GO
exec sp_addextendedproperty N'MS_Description', N'N�mero Vivienda', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p02'
GO
exec sp_addextendedproperty N'MS_Description', N'N�mero Hogar', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p03'
GO
exec sp_addextendedproperty N'MS_Description', N'Nombre Departamento', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p04'
GO
exec sp_addextendedproperty N'MS_Description', N'Nombre Distrito', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p05'
GO
exec sp_addextendedproperty N'MS_Description', N'Tipo de �rea', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p06'
GO
exec sp_addextendedproperty N'MS_Description', N'Nombre de Barrio', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p08'
GO
exec sp_addextendedproperty N'MS_Description', N'Nombre de Manzana', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p07'
GO
exec sp_addextendedproperty N'MS_Description', N'Direcci�n de la vivienda', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p09'
GO
exec sp_addextendedproperty N'MS_Description', N'Total de personas que viven en el hogar', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p14'
GO
exec sp_addextendedproperty N'MS_Description', N'Total de hombres que viven en el hogar', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p15'
GO
exec sp_addextendedproperty N'MS_Description', N'Total de mujeres que viven el hogar', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p16'
GO
exec sp_addextendedproperty N'MS_Description', N'Material predominante en las paredes exteriores', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p24'
GO
exec sp_addextendedproperty N'MS_Description', N'Material predominante en el piso�', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p25'
GO
exec sp_addextendedproperty N'MS_Description', N'Material predominante en el techo', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p26'
GO
exec sp_addextendedproperty N'MS_Description', N'Condici�n de ocupaci�n de la vivienda', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p27'
GO
exec sp_addextendedproperty N'MS_Description', N'Otra condici�n de ocupaci�n de la vivienda', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p27e'
GO
exec sp_addextendedproperty N'MS_Description', N'N�mero de piezas de la vivienda', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p28a'
GO
exec sp_addextendedproperty N'MS_Description', N'N�mero de dormitorios de la vivienda', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p28b'
GO
exec sp_addextendedproperty N'MS_Description', N'Tiene pieza para cocinar�', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p29'
GO
exec sp_addextendedproperty N'MS_Description', N'Combustible que se utiliza en forma habitual para cocinar��', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p30'
GO
exec sp_addextendedproperty N'MS_Description', N'Tipo de pieza para ba�arse', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p31'
GO
exec sp_addextendedproperty N'MS_Description', N'Tipo de desag�e que tiene el ba�o�', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p32'
GO
exec sp_addextendedproperty N'MS_Description', N'Procedencia del agua que se utiliza en l a vivienda��', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p33'
GO
exec sp_addextendedproperty N'MS_Description', N'Lugar de abastecimiento del agua que se utiliza en l a vivienda��', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p34'
GO
exec sp_addextendedproperty N'MS_Description', N'Dispone de luz el�ctrica', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p35'
GO
exec sp_addextendedproperty N'MS_Description', N'Forma de desechar la basura�', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p36'
GO
exec sp_addextendedproperty N'MS_Description', N'Tiene tel�fono celular��', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p37'
GO
exec sp_addextendedproperty N'MS_Description', N'N�mero de tel�fono celular', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'nro_celular'
GO
exec sp_addextendedproperty N'MS_Description', N'Tiene tel�fono l�nea baja', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p38'
GO
exec sp_addextendedproperty N'MS_Description', N'N�mero de tel�fono l�nea baja', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'nro_linea_baja'
GO
exec sp_addextendedproperty N'MS_Description', N'Dispone de heladera en el hogar', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p391'
GO
exec sp_addextendedproperty N'MS_Description', N'Dispone de lavarropas en el hogar�', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p392'
GO
exec sp_addextendedproperty N'MS_Description', N'Dispone de termocalef�n en el hogar�', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p393'
GO
exec sp_addextendedproperty N'MS_Description', N'Dispone de aire acondicionado en el hogar�', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p394'
GO
exec sp_addextendedproperty N'MS_Description', N'Dispone de autom�vil o camioneta en el hogar�', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p395'
GO
exec sp_addextendedproperty N'MS_Description', N'Dispone de cami�n en el hogar�', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p396'
GO
exec sp_addextendedproperty N'MS_Description', N'Dispone de motocicleta en el hogar�', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p397'
GO
exec sp_addextendedproperty N'MS_Description', N'Nombre del jefe del hogar', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p42n'
GO
exec sp_addextendedproperty N'MS_Description', N'N�mero de c�dula del jefe del hogar', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p42ci'
GO
exec sp_addextendedproperty N'MS_Description', N'Letra de c�dula del jefe del hogar', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'letra_ci'
GO
exec sp_addextendedproperty N'MS_Description', N'Orden del jefe del hogar', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p43'
GO
exec sp_addextendedproperty N'MS_Description', N'Nombre del respondente', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'var00002'
GO
exec sp_addextendedproperty N'MS_Description', N'N�mero de c�dula del respondente', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'var00003'
GO
exec sp_addextendedproperty N'MS_Description', N'Letra de c�dula del respondente', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'var00004'
GO
exec sp_addextendedproperty N'MS_Description', N'Orden del respondente', N'user', N'dbo', N'table', N'log_imp_hog', N'column', N'p104'
GO
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- log_imp_hog_eec
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
exec sp_addextendedproperty N'MS_Description', N'C�digo de departamento', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'dptod'
GO
exec sp_addextendedproperty N'MS_Description', N'C�digo de distrito', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'distritod'
GO
exec sp_addextendedproperty N'MS_Description', N'C�digo de departamento+distrito', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'distripg'
GO
exec sp_addextendedproperty N'MS_Description', N'Tipo de area', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'area'
GO
exec sp_addextendedproperty N'MS_Description', N'C�digo del barrio', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'barrio'
GO
exec sp_addextendedproperty N'MS_Description', N'Nombre de la manzana', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'manzana'
GO
exec sp_addextendedproperty N'MS_Description', N'N�mero de formulario', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'formulario'
GO
exec sp_addextendedproperty N'MS_Description', N'N�mero de vivienda', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'vivi'
GO
exec sp_addextendedproperty N'MS_Description', N'N�mero de hogar', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'hogar'
GO
exec sp_addextendedproperty N'MS_Description', N'Direcci�n de la vivienda', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'direccion'
GO
exec sp_addextendedproperty N'MS_Description', N'N�mero de la casa', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'nro_de'
GO
exec sp_addextendedproperty N'MS_Description', N'N�mero de tel�fono', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'telefono'
GO
exec sp_addextendedproperty N'MS_Description', N'Fecha de la entrevista', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'fecha'
GO
exec sp_addextendedproperty N'MS_Description', N'D�a de la entrevista', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'dia'
GO
exec sp_addextendedproperty N'MS_Description', N'Mes de la entrevista', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'mes'
GO
exec sp_addextendedproperty N'MS_Description', N'A�o de la entrevista', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'ano'
GO
exec sp_addextendedproperty N'MS_Description', N'Total de personas que viven en el hogar', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v10t'
GO
exec sp_addextendedproperty N'MS_Description', N'Total de hombres que viven en el hogar', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v11'
GO
exec sp_addextendedproperty N'MS_Description', N'Total de mujeres que viven el hogar', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v12'
GO
exec sp_addextendedproperty N'MS_Description', N'Material predominante en las paredes exteriores', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v13'
GO
exec sp_addextendedproperty N'MS_Description', N'Material predominante en el piso�', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v14'
GO
exec sp_addextendedproperty N'MS_Description', N'Material predominante en el techo', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v15'
GO
exec sp_addextendedproperty N'MS_Description', N'Condici�n de ocupaci�n de la vivienda', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v16'
GO
exec sp_addextendedproperty N'MS_Description', N'Otra condici�n de ocupaci�n de la vivienda', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v16_otr'
GO
exec sp_addextendedproperty N'MS_Description', N'N�mero de piezas de la vivienda', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v17a'
GO
exec sp_addextendedproperty N'MS_Description', N'N�mero de dormitorios de la vivienda', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v17b'
GO
exec sp_addextendedproperty N'MS_Description', N'Tiene pieza para cocinar�', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v18'
GO
exec sp_addextendedproperty N'MS_Description', N'Combustible que se utiliza en forma habitual para cocinar��', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v19'
GO
exec sp_addextendedproperty N'MS_Description', N'Tipo de pieza para ba�arse', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v20'
GO
exec sp_addextendedproperty N'MS_Description', N'Tipo de desag�e que tiene el ba�o�', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v21'
GO
exec sp_addextendedproperty N'MS_Description', N'Procedencia del agua que se utiliza en l a vivienda��', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v22'
GO
exec sp_addextendedproperty N'MS_Description', N'Lugar de abastecimiento del agua que se utiliza en l a vivienda��', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v23'
GO
exec sp_addextendedproperty N'MS_Description', N'Dispone de luz el�ctrica', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v24'
GO
exec sp_addextendedproperty N'MS_Description', N'Forma de desechar la basura�', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v25'
GO
exec sp_addextendedproperty N'MS_Description', N'Tiene tel�fono celular��', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v26'
GO
exec sp_addextendedproperty N'MS_Description', N'N�mero de tel�fono celular', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v26esp_celular'
GO
exec sp_addextendedproperty N'MS_Description', N'Tiene tel�fono l�nea baja', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v27'
GO
exec sp_addextendedproperty N'MS_Description', N'N�mero de tel�fono l�nea baja', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v27esp_linea'
GO
exec sp_addextendedproperty N'MS_Description', N'Dispone de heladera en el hogar', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v28_1'
GO
exec sp_addextendedproperty N'MS_Description', N'Dispone de lavarropas en el hogar�', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v28_2'
GO
exec sp_addextendedproperty N'MS_Description', N'Dispone de termocalef�n en el hogar�', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v28_3'
GO
exec sp_addextendedproperty N'MS_Description', N'Dispone de aire acondicionado en el hogar�', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v28_4'
GO
exec sp_addextendedproperty N'MS_Description', N'Dispone de autom�vil o camioneta en el hogar�', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v28_5'
GO
exec sp_addextendedproperty N'MS_Description', N'Dispone de cami�n en el hogar�', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v28_6'
GO
exec sp_addextendedproperty N'MS_Description', N'Dispone de motocicleta en el hogar�', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v28_7'
GO
exec sp_addextendedproperty N'MS_Description', N'No dispone de ninguno de los otros bienes', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v28_8'
GO
exec sp_addextendedproperty N'MS_Description', N'Nombre del jefe del hogar', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'v29nombre_jefe'
GO
exec sp_addextendedproperty N'MS_Description', N'N�mero de c�dula del jefe del hogar', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'cedulajefe'
GO
exec sp_addextendedproperty N'MS_Description', N'N�mero de ficha persona', N'user', N'dbo', N'table', N'log_imp_hog_eec', N'column', N'var00001'
GO
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- log_imp_per
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
exec sp_addextendedproperty N'MS_Description', N'C�digo del departamento', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p01a'
GO
exec sp_addextendedproperty N'MS_Description', N'C�digo del distrito', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p01b'
GO
exec sp_addextendedproperty N'MS_Description', N'C�digo del barrio', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p01c'
GO
exec sp_addextendedproperty N'MS_Description', N'N�mero de formulario', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p01d'
GO
exec sp_addextendedproperty N'MS_Description', N'N�mero de vivienda', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p02'
GO
exec sp_addextendedproperty N'MS_Description', N'N�mero de hogar', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p03'
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
exec sp_addextendedproperty N'MS_Description', N'Orden del c�nyuge de la persona', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p50a'
GO
exec sp_addextendedproperty N'MS_Description', N'Orden del padre de la persona', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p50b'
GO
exec sp_addextendedproperty N'MS_Description', N'Orden de la madre de la persona', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p50c'
GO
exec sp_addextendedproperty N'MS_Description', N'N�mero de c�dula de la persona', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p51'
GO
exec sp_addextendedproperty N'MS_Description', N'Letra de la c�dula de la persona', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'var00003'
GO
exec sp_addextendedproperty N'MS_Description', N'Tipo de excepci�n de c�dula de identidad de la persona', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'var00004'
GO
exec sp_addextendedproperty N'MS_Description', N'D�a de nacimiento de la persona', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p52d'
GO
exec sp_addextendedproperty N'MS_Description', N'Mes de nacimiento de la persona', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p52m'
GO
exec sp_addextendedproperty N'MS_Description', N'A�o de nacimiento de la persona', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p52a'
GO
exec sp_addextendedproperty N'MS_Description', N'Departamento en que naci� la persona', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p53a'
GO
exec sp_addextendedproperty N'MS_Description', N'Distrito en que naci� la persona', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p53b'
GO
exec sp_addextendedproperty N'MS_Description', N'C�digo del distrito de nacimiento', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p53c'
GO
exec sp_addextendedproperty N'MS_Description', N'Tipo de �rea del lugar de nacimiento', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p53z'
GO
exec sp_addextendedproperty N'MS_Description', N'Idioma que habla mayormente', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p54'
GO
exec sp_addextendedproperty N'MS_Description', N'Otro idioma', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p54e'
GO
exec sp_addextendedproperty N'MS_Description', N'Asisti� a clases el a�o pasado', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p56'
GO
exec sp_addextendedproperty N'MS_Description', N'Por qu� no asisti� a clases el a�o pasado', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p58'
GO
exec sp_addextendedproperty N'MS_Description', N'Otro motivo de no asistencia', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p58e'
GO
exec sp_addextendedproperty N'MS_Description', N'Piensa matricularse este a�o', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p59'
GO
exec sp_addextendedproperty N'MS_Description', N'�ltimo grado o curso aprobado', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p60'
GO
exec sp_addextendedproperty N'MS_Description', N'Nivel del �ltimo grado o curso aprobado', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p61'
GO
exec sp_addextendedproperty N'MS_Description', N'Realiz� curso no formal', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p62'
GO
exec sp_addextendedproperty N'MS_Description', N'Tiene seguro m�dico vigente', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p63'
GO
exec sp_addextendedproperty N'MS_Description', N'Estuvo enfermo o accidentado', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p64'
GO
exec sp_addextendedproperty N'MS_Description', N'Que enfermedad tuvo', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p65'
GO
exec sp_addextendedproperty N'MS_Description', N'Otra enfermedad', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p65e'
GO
exec sp_addextendedproperty N'MS_Description', N'Qu� enfermedad cr�nica padece', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p66'
GO
exec sp_addextendedproperty N'MS_Description', N'Otra enfermedad cr�nica', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p66e'
GO
exec sp_addextendedproperty N'MS_Description', N'Recibi� atenci�n por la enfermedad o accidente', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p67'
GO
exec sp_addextendedproperty N'MS_Description', N'Por qu� no recibi� atenci�n', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p68'
GO
exec sp_addextendedproperty N'MS_Description', N'Otro motivo de no atenci�n', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p68e'
GO
exec sp_addextendedproperty N'MS_Description', N'Tiene carn� de vacunaci�n', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p73'
GO
exec sp_addextendedproperty N'MS_Description', N'Clase de impedimento f�sico', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p74'
GO
exec sp_addextendedproperty N'MS_Description', N'Otra clase de impedimento f�sico', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'var00006'
GO
exec sp_addextendedproperty N'MS_Description', N'N�mero de causa de impedimento f�sico', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'var00007'
GO
exec sp_addextendedproperty N'MS_Description', N'Otra causa de impedimento f�sico', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'var00008'
GO
exec sp_addextendedproperty N'MS_Description', N'Tiene dificultad para caminar', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'var00009'
GO
exec sp_addextendedproperty N'MS_Description', N'Tiene dificultad para vestirse', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'var00010'
GO
exec sp_addextendedproperty N'MS_Description', N'Tiene dificultad para ba�arse', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'var00011'
GO
exec sp_addextendedproperty N'MS_Description', N'Tiene dificultad para comer', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'var00031'
GO
exec sp_addextendedproperty N'MS_Description', N'Tiene dificultad para ir a la cama', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'var00012'
GO
exec sp_addextendedproperty N'MS_Description', N'Tiene dificultad para ir al ba�o', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'var00013'
GO
exec sp_addextendedproperty N'MS_Description', N'Realiz� alguna actividad econ�mica', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p86'
GO
exec sp_addextendedproperty N'MS_Description', N'Raz�n por la que no trabaj�', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p87'
GO
exec sp_addextendedproperty N'MS_Description', N'Otra raz�n por la que no trabaj�', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p87e'
GO
exec sp_addextendedproperty N'MS_Description', N'Ocupaci�n principal', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p88'
GO
exec sp_addextendedproperty N'MS_Description', N'Otra ocupaci�n principal', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p88e'
GO
exec sp_addextendedproperty N'MS_Description', N'Tipo Relaci�n laboral', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'p91'
GO
exec sp_addextendedproperty N'MS_Description', N'Monto de ingreso por ocupaci�n principal', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'var00017'
GO
exec sp_addextendedproperty N'MS_Description', N'Monto de ingreso por ocupacion secundaria', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'var00018'
GO
exec sp_addextendedproperty N'MS_Description', N'Monto  de ingreso por otras ocupaciones', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'var00019'
GO
exec sp_addextendedproperty N'MS_Description', N'Monto de ingreso por alquileres', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'var00020'
GO
exec sp_addextendedproperty N'MS_Description', N'Monto de ingreso por intereses', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'var00021'
GO
exec sp_addextendedproperty N'MS_Description', N'Monto de ingreso por ayuda familiar dentro del pa�s', N'user', N'dbo', N'table', N'log_imp_per', N'column', N'var00022'
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
exec sp_addextendedproperty N'MS_Description', N'C�digo de departamento', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'dptod'
GO
exec sp_addextendedproperty N'MS_Description', N'C�digo de distrito', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'distritod'
GO
exec sp_addextendedproperty N'MS_Description', N'C�digo de departamento+distrito', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'distripg'
GO
exec sp_addextendedproperty N'MS_Description', N'Tipo de area', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'area'
GO
exec sp_addextendedproperty N'MS_Description', N'C�digo del barrio', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'barrio'
GO
exec sp_addextendedproperty N'MS_Description', N'Nombre de la manzana', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'manzana'
GO
exec sp_addextendedproperty N'MS_Description', N'N�mero de formulario', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'formulario'
GO
exec sp_addextendedproperty N'MS_Description', N'N�mero de vivienda', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'vivi'
GO
exec sp_addextendedproperty N'MS_Description', N'N�mero de hogar', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'hogar'
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
exec sp_addextendedproperty N'MS_Description', N'Orden del c�nyuge de la persona', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p36_orden_conyugue'
GO
exec sp_addextendedproperty N'MS_Description', N'Orden del padre de la persona', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p36_orden_padre'
GO
exec sp_addextendedproperty N'MS_Description', N'Orden de la madre de la persona', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p36_orden_madre'
GO
exec sp_addextendedproperty N'MS_Description', N'N� control', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p37'
GO
exec sp_addextendedproperty N'MS_Description', N'N�mero de c�dula de la persona', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p37_cedula'
GO
exec sp_addextendedproperty N'MS_Description', N'D�a de nacimiento de la persona', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p38_dia'
GO
exec sp_addextendedproperty N'MS_Description', N'Mes de nacimiento de la persona', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p38_mes'
GO
exec sp_addextendedproperty N'MS_Description', N'A�o de nacimiento de la persona', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p38_ano'
GO
exec sp_addextendedproperty N'MS_Description', N'Pa�s de nacimiento de la persona', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p39pais'
GO
exec sp_addextendedproperty N'MS_Description', N'C�digo de departamento', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p39dpto'
GO
exec sp_addextendedproperty N'MS_Description', N'C�digo de distrito', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p39dist'
GO
exec sp_addextendedproperty N'MS_Description', N'Tipo de �rea del lugar de nacimiento', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p39area'
GO
exec sp_addextendedproperty N'MS_Description', N'Idioma que habla mayormente', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p40_idioma'
GO
exec sp_addextendedproperty N'MS_Description', N'Otro idioma', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p40otr'
GO
exec sp_addextendedproperty N'MS_Description', N'Asisti� a clases el a�o pasado', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p41'
GO
exec sp_addextendedproperty N'MS_Description', N'Por qu� no asisti� a clases el a�o pasado', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p42'
GO
exec sp_addextendedproperty N'MS_Description', N'Est� matriculado actualmente en una Instituci�n Educativa', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p43'
GO
exec sp_addextendedproperty N'MS_Description', N'Grado+nivel �ltimo curso aprobado', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p44_45t'
GO
exec sp_addextendedproperty N'MS_Description', N'�ltimo grado o curso aprobado', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p44'
GO
exec sp_addextendedproperty N'MS_Description', N'Nivel del �ltimo grado o curso aprobado', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p45'
GO
exec sp_addextendedproperty N'MS_Description', N'Realiz� curso no formal', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p46'
GO
exec sp_addextendedproperty N'MS_Description', N'Tiene seguro m�dico vigente', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p47'
GO
exec sp_addextendedproperty N'MS_Description', N'Estuvo enfermo o accidentado', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p48'
GO
exec sp_addextendedproperty N'MS_Description', N'Que enfermedad tuvo', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p49'
GO
exec sp_addextendedproperty N'MS_Description', N'Otra enfermedad', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p49_otr'
GO
exec sp_addextendedproperty N'MS_Description', N'Qu� enfermedad cr�nica padece', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p50'
GO
exec sp_addextendedproperty N'MS_Description', N'Otra enfermedad cr�nica', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p50_otr'
GO
exec sp_addextendedproperty N'MS_Description', N'Recibi� atenci�n por la enfermedad o accidente', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p51'
GO
exec sp_addextendedproperty N'MS_Description', N'Por qu� no recibi� atenci�n', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p52'
GO
exec sp_addextendedproperty N'MS_Description', N'Otro motivo de no atenci�n', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p52_otr'
GO
exec sp_addextendedproperty N'MS_Description', N'Tiene carn� de vacunaci�n', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p53'
GO
exec sp_addextendedproperty N'MS_Description', N'Tiene impedimento f�sico de forma permanente', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p54'
GO
exec sp_addextendedproperty N'MS_Description', N'Impedimento f�sico permanente', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p54a'
GO
exec sp_addextendedproperty N'MS_Description', N'Otra clase de impedimento f�sico', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p54_otr'
GO
exec sp_addextendedproperty N'MS_Description', N'N�mero de causa de impedimento f�sico', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p55'
GO
exec sp_addextendedproperty N'MS_Description', N'Otra causa de impedimento f�sico', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p55_otr'
GO
exec sp_addextendedproperty N'MS_Description', N'Tiene dificultad para caminar', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p56'
GO
exec sp_addextendedproperty N'MS_Description', N'Tiene dificultad para vestirse', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p57'
GO
exec sp_addextendedproperty N'MS_Description', N'Tiene dificultad para ba�arse', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p58'
GO
exec sp_addextendedproperty N'MS_Description', N'Tiene dificultad para comer', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p59'
GO
exec sp_addextendedproperty N'MS_Description', N'Tiene dificultad para ir a la cama', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p60'
GO
exec sp_addextendedproperty N'MS_Description', N'Tiene dificultad para ir al ba�o', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p61'
GO
exec sp_addextendedproperty N'MS_Description', N'Realiz� alguna actividad econ�mica', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p62'
GO
exec sp_addextendedproperty N'MS_Description', N'Raz�n por la que no trabaj�', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p63'
GO
exec sp_addextendedproperty N'MS_Description', N'Otra raz�n por la que no trabaj�', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p63_especificar'
GO
exec sp_addextendedproperty N'MS_Description', N'Ocupaci�n principal', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p64des'
GO
exec sp_addextendedproperty N'MS_Description', N'C�digo de ocupaci�n principal', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p64c'
GO
exec sp_addextendedproperty N'MS_Description', N'Negocio lugar de trabajo', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p65des'
GO
exec sp_addextendedproperty N'MS_Description', N'C�digo de rama de actividades', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p65c'
GO
exec sp_addextendedproperty N'MS_Description', N'Tipo Relaci�n laboral', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p66'
GO
exec sp_addextendedproperty N'MS_Description', N'Monto de ingreso por ocupaci�n principal', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p67a'
GO
exec sp_addextendedproperty N'MS_Description', N'Monto de ingreso por ocupacion secundaria', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p67b'
GO
exec sp_addextendedproperty N'MS_Description', N'Monto  de ingreso por otras ocupaciones', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p67c'
GO
exec sp_addextendedproperty N'MS_Description', N'Monto de ingreso por alquileres', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p67d'
GO
exec sp_addextendedproperty N'MS_Description', N'Monto de ingreso por intereses', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p67e'
GO
exec sp_addextendedproperty N'MS_Description', N'Monto de ingreso por ayuda familiar dentro del pa�s', N'user', N'dbo', N'table', N'log_imp_per_eec', N'column', N'p67f'
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
exec sp_addextendedproperty N'MS_Description', N'N�mero del primer curso del nivel', N'user', N'dbo', N'table', N'nivel_educativo', N'column', N'primer_curso'
GO
exec sp_addextendedproperty N'MS_Description', N'N�mero del �ltimo curso del nivel', N'user', N'dbo', N'table', N'nivel_educativo', N'column', N'ultimo_curso'
GO
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- objecion_ele_pen
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
exec sp_addextendedproperty N'MS_Description', N'Fecha de anulaci�n de la objeci�n', N'user', N'dbo', N'table', N'objecion_ele_pen', N'column', N'fecha_anulacion'
GO
exec sp_addextendedproperty N'MS_Description', N'Motivo por el cual se anula la objeci�n', N'user', N'dbo', N'table', N'objecion_ele_pen', N'column', N'observaciones_anulacion'
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
exec sp_addextendedproperty N'MS_Description', N'tiene jubilaci�n', N'user', N'dbo', N'table', N'potencial_ben', N'column', N'es_persona_con_jubilacion'
GO
exec sp_addextendedproperty N'MS_Description', N'tiene pensi�n', N'user', N'dbo', N'table', N'potencial_ben', N'column', N'es_persona_con_pension'
GO
exec sp_addextendedproperty N'MS_Description', N'tiene alg�n subsidio del Estado', N'user', N'dbo', N'table', N'potencial_ben', N'column', N'es_persona_con_subsidio'
GO
exec sp_addextendedproperty N'MS_Description', N'tiene deudas con el Estado', N'user', N'dbo', N'table', N'potencial_ben', N'column', N'es_persona_con_deuda'
GO
exec sp_addextendedproperty N'MS_Description', N'tiene pena judicial pendiente', N'user', N'dbo', N'table', N'potencial_ben', N'column', N'es_persona_con_pena_judicial'
GO
exec sp_addextendedproperty N'MS_Description', N'present� Certificado de Vida y Residencia', N'user', N'dbo', N'table', N'potencial_ben', N'column', N'es_persona_con_cer_vida'
GO
exec sp_addextendedproperty N'MS_Description', N'est� dispuesto a firmar la Carta de Renuncia a otras pensiones y/o subsidios', N'user', N'dbo', N'table', N'potencial_ben', N'column', N'es_persona_con_carta_renuncia'
GO
exec sp_addextendedproperty N'MS_Description', N'Especificar si la respuesta anterior es 99 "Otra causa"', N'user', N'dbo', N'table', N'potencial_ben', N'column', N'otra_causa_inv_censo'
GO
exec sp_addextendedproperty N'MS_Description', N'Especificar si la respuesta anterior es 99 "Otra causa"', N'user', N'dbo', N'table', N'potencial_ben', N'column', N'otra_causa_den_recl_cen'
GO
