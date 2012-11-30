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
-- nivel_educativo
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
exec sp_addextendedproperty N'MS_Description', N'N�mero del primer curso del nivel', N'user', N'dbo', N'table', N'nivel_educativo', N'column', N'primer_curso'
GO
exec sp_addextendedproperty N'MS_Description', N'N�mero del �ltimo curso del nivel', N'user', N'dbo', N'table', N'nivel_educativo', N'column', N'ultimo_curso'
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
