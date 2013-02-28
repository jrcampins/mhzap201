if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[consulta_ficha_hogar_1]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[consulta_ficha_hogar_1]
GO

SET QUOTED_IDENTIFIER ON 
GO

SET ANSI_NULLS ON 
GO

CREATE VIEW [dbo].[consulta_ficha_hogar_1] AS
SELECT
	ficha_hogar.id_ficha_hogar AS id_ficha_hogar,
	ficha_hogar.version_ficha_hogar AS version_ficha_hogar,
	ficha_hogar.codigo_ficha_hogar AS codigo_ficha_hogar,
	ficha_hogar.fecha_entrevista AS fecha_entrevista,
	ficha_hogar.id_funcionario_censista AS id_funcionario_censista,
		funcionario_1x1.codigo_funcionario AS codigo_funcionario_1x1y3,
		funcionario_1x1.nombre_funcionario AS nombre_funcionario_1x1y4,
		funcionario_1x1.numero_cedula AS numero_cedula_1x1y5,
		funcionario_1x1.letra_cedula AS letra_cedula_1x1y6,
		funcionario_1x1.primer_nombre AS primer_nombre_1x1y7,
		funcionario_1x1.segundo_nombre AS segundo_nombre_1x1y8,
		funcionario_1x1.primer_apellido AS primer_apellido_1x1y9,
		funcionario_1x1.segundo_apellido AS segundo_apellido_1x1y10,
		funcionario_1x1.apellido_casada AS apellido_casada_1x1y11,
	ficha_hogar.id_funcionario_supervisor AS id_funcionario_supervisor,
		funcionario_1x2.codigo_funcionario AS codigo_funcionario_1x2y3,
		funcionario_1x2.nombre_funcionario AS nombre_funcionario_1x2y4,
		funcionario_1x2.numero_cedula AS numero_cedula_1x2y5,
		funcionario_1x2.letra_cedula AS letra_cedula_1x2y6,
		funcionario_1x2.primer_nombre AS primer_nombre_1x2y7,
		funcionario_1x2.segundo_nombre AS segundo_nombre_1x2y8,
		funcionario_1x2.primer_apellido AS primer_apellido_1x2y9,
		funcionario_1x2.segundo_apellido AS segundo_apellido_1x2y10,
		funcionario_1x2.apellido_casada AS apellido_casada_1x2y11,
	ficha_hogar.id_funcionario_critico_deco AS id_funcionario_critico_deco,
		funcionario_1x3.codigo_funcionario AS codigo_funcionario_1x3y3,
		funcionario_1x3.nombre_funcionario AS nombre_funcionario_1x3y4,
		funcionario_1x3.numero_cedula AS numero_cedula_1x3y5,
		funcionario_1x3.letra_cedula AS letra_cedula_1x3y6,
		funcionario_1x3.primer_nombre AS primer_nombre_1x3y7,
		funcionario_1x3.segundo_nombre AS segundo_nombre_1x3y8,
		funcionario_1x3.primer_apellido AS primer_apellido_1x3y9,
		funcionario_1x3.segundo_apellido AS segundo_apellido_1x3y10,
		funcionario_1x3.apellido_casada AS apellido_casada_1x3y11,
	ficha_hogar.id_funcionario_digitador AS id_funcionario_digitador,
		funcionario_1x4.codigo_funcionario AS codigo_funcionario_1x4y3,
		funcionario_1x4.nombre_funcionario AS nombre_funcionario_1x4y4,
		funcionario_1x4.numero_cedula AS numero_cedula_1x4y5,
		funcionario_1x4.letra_cedula AS letra_cedula_1x4y6,
		funcionario_1x4.primer_nombre AS primer_nombre_1x4y7,
		funcionario_1x4.segundo_nombre AS segundo_nombre_1x4y8,
		funcionario_1x4.primer_apellido AS primer_apellido_1x4y9,
		funcionario_1x4.segundo_apellido AS segundo_apellido_1x4y10,
		funcionario_1x4.apellido_casada AS apellido_casada_1x4y11,
	ficha_hogar.observaciones AS observaciones,
	ficha_hogar.huso_utm AS huso_utm,
	ficha_hogar.franja_utm AS franja_utm,
	ficha_hogar.distancia_este_utm AS distancia_este_utm,
	ficha_hogar.distancia_norte_utm AS distancia_norte_utm,
	ficha_hogar.numero_formulario AS numero_formulario,
	ficha_hogar.numero_vivienda AS numero_vivienda,
	ficha_hogar.numero_hogar AS numero_hogar,
	ficha_hogar.id_departamento AS id_departamento,
		ubicacion_1x5.codigo_ubicacion AS codigo_ubicacion_1x5y3,
		ubicacion_1x5.nombre_ubicacion AS nombre_ubicacion_1x5y4,
		ubicacion_1x5.id_ubicacion_superior AS id_ubicacion_superior_1x5y5,
		ubicacion_1x5.numero_tipo_nodo AS numero_tipo_nodo_1x5y6,
		ubicacion_1x5.numero_nivel_ubicacion AS numero_nivel_ubicacion_1x5y7,
		ubicacion_1x5.secuencia_ubicacion AS secuencia_ubicacion_1x5y8,
		ubicacion_1x5.clave_ubicacion AS clave_ubicacion_1x5y9,
		ubicacion_1x5.numero_tipo_area AS numero_tipo_area_1x5y10,
		ubicacion_1x5.codigo_ubicacion_jupe AS codigo_ubicacion_jupe_1x5y11,
	ficha_hogar.id_distrito AS id_distrito,
		ubicacion_1x6.codigo_ubicacion AS codigo_ubicacion_1x6y3,
		ubicacion_1x6.nombre_ubicacion AS nombre_ubicacion_1x6y4,
		ubicacion_1x6.id_ubicacion_superior AS id_ubicacion_superior_1x6y5,
		ubicacion_1x6.numero_tipo_nodo AS numero_tipo_nodo_1x6y6,
		ubicacion_1x6.numero_nivel_ubicacion AS numero_nivel_ubicacion_1x6y7,
		ubicacion_1x6.secuencia_ubicacion AS secuencia_ubicacion_1x6y8,
		ubicacion_1x6.clave_ubicacion AS clave_ubicacion_1x6y9,
		ubicacion_1x6.numero_tipo_area AS numero_tipo_area_1x6y10,
		ubicacion_1x6.codigo_ubicacion_jupe AS codigo_ubicacion_jupe_1x6y11,
	ficha_hogar.numero_tipo_area AS numero_tipo_area,
		tipo_area_1x7.codigo_tipo_area AS codigo_tipo_area_1x7y2,
		tipo_area_1x7.limite_indice_calidad_vida AS limite_indice_calidad_vi_1x7y3,
	ficha_hogar.id_barrio AS id_barrio,
		ubicacion_1x8.codigo_ubicacion AS codigo_ubicacion_1x8y3,
		ubicacion_1x8.nombre_ubicacion AS nombre_ubicacion_1x8y4,
		ubicacion_1x8.id_ubicacion_superior AS id_ubicacion_superior_1x8y5,
		ubicacion_1x8.numero_tipo_nodo AS numero_tipo_nodo_1x8y6,
		ubicacion_1x8.numero_nivel_ubicacion AS numero_nivel_ubicacion_1x8y7,
		ubicacion_1x8.secuencia_ubicacion AS secuencia_ubicacion_1x8y8,
		ubicacion_1x8.clave_ubicacion AS clave_ubicacion_1x8y9,
		ubicacion_1x8.numero_tipo_area AS numero_tipo_area_1x8y10,
		ubicacion_1x8.codigo_ubicacion_jupe AS codigo_ubicacion_jupe_1x8y11,
	ficha_hogar.id_manzana AS id_manzana,
		ubicacion_1x9.codigo_ubicacion AS codigo_ubicacion_1x9y3,
		ubicacion_1x9.nombre_ubicacion AS nombre_ubicacion_1x9y4,
		ubicacion_1x9.id_ubicacion_superior AS id_ubicacion_superior_1x9y5,
		ubicacion_1x9.numero_tipo_nodo AS numero_tipo_nodo_1x9y6,
		ubicacion_1x9.numero_nivel_ubicacion AS numero_nivel_ubicacion_1x9y7,
		ubicacion_1x9.secuencia_ubicacion AS secuencia_ubicacion_1x9y8,
		ubicacion_1x9.clave_ubicacion AS clave_ubicacion_1x9y9,
		ubicacion_1x9.numero_tipo_area AS numero_tipo_area_1x9y10,
		ubicacion_1x9.codigo_ubicacion_jupe AS codigo_ubicacion_jupe_1x9y11,
	ficha_hogar.manzana AS manzana,
	ficha_hogar.direccion AS direccion,
	ficha_hogar.total_personas AS total_personas,
	ficha_hogar.total_hombres AS total_hombres,
	ficha_hogar.total_mujeres AS total_mujeres,
	ficha_hogar.numero_tipo_mat_paredes AS numero_tipo_mat_paredes,
		tipo_mat_paredes_1x10.codigo_tipo_mat_paredes AS codigo_tipo_mat_paredes_1x10y2,
	ficha_hogar.numero_tipo_mat_piso AS numero_tipo_mat_piso,
		tipo_mat_piso_1x11.codigo_tipo_mat_piso AS codigo_tipo_mat_piso_1x11y2,
	ficha_hogar.numero_tipo_mat_techo AS numero_tipo_mat_techo,
		tipo_mat_techo_1x12.codigo_tipo_mat_techo AS codigo_tipo_mat_techo_1x12y2,
	ficha_hogar.numero_tipo_ocupacion_viv AS numero_tipo_ocupacion_viv,
		tipo_ocupacion_viv_1x13.codigo_tipo_ocupacion_viv AS codigo_tipo_ocupacion_v_1x13y2,
	ficha_hogar.otro_tipo_ocupacion_viv AS otro_tipo_ocupacion_viv,
	ficha_hogar.cantidad_piezas AS cantidad_piezas,
	ficha_hogar.cantidad_dormitorios AS cantidad_dormitorios,
	ficha_hogar.numero_siono_pieza_cocina AS numero_siono_pieza_cocina,
		siono_1x14.codigo_siono AS codigo_siono_1x14y2,
	ficha_hogar.numero_tipo_combustible AS numero_tipo_combustible,
		tipo_combustible_1x15.codigo_tipo_combustible AS codigo_tipo_combustible_1x15y2,
	ficha_hogar.numero_tipo_pieza_bano AS numero_tipo_pieza_bano,
		tipo_pieza_bano_1x16.codigo_tipo_pieza_bano AS codigo_tipo_pieza_bano_1x16y2,
	ficha_hogar.numero_tipo_servicio_san AS numero_tipo_servicio_san,
		tipo_servicio_san_1x17.codigo_tipo_servicio_san AS codigo_tipo_servicio_sa_1x17y2,
	ficha_hogar.numero_tipo_servicio_agua AS numero_tipo_servicio_agua,
		tipo_servicio_agua_1x18.codigo_tipo_servicio_agua AS codigo_tipo_servicio_ag_1x18y2,
	ficha_hogar.numero_tipo_aba_agua AS numero_tipo_aba_agua,
		tipo_aba_agua_1x19.codigo_tipo_aba_agua AS codigo_tipo_aba_agua_1x19y2,
	ficha_hogar.numero_siono_corriente_elec AS numero_siono_corriente_elec,
		siono_1x20.codigo_siono AS codigo_siono_1x20y2,
	ficha_hogar.numero_tipo_desecho_bas AS numero_tipo_desecho_bas,
		tipo_desecho_bas_1x21.codigo_tipo_desecho_bas AS codigo_tipo_desecho_bas_1x21y2,
	ficha_hogar.numero_siono_telefono_celular AS numero_siono_telefono_celular,
		siono_1x22.codigo_siono AS codigo_siono_1x22y2,
	ficha_hogar.numero_telefono_celular AS numero_telefono_celular,
	ficha_hogar.numero_siono_tlf_linea_baja AS numero_siono_tlf_linea_baja,
		siono_1x23.codigo_siono AS codigo_siono_1x23y2,
	ficha_hogar.numero_telefono_linea_baja AS numero_telefono_linea_baja,
	ficha_hogar.numero_siono_disp_heladera AS numero_siono_disp_heladera,
		siono_1x24.codigo_siono AS codigo_siono_1x24y2,
	ficha_hogar.numero_siono_disp_lavarropas AS numero_siono_disp_lavarropas,
		siono_1x25.codigo_siono AS codigo_siono_1x25y2,
	ficha_hogar.numero_siono_disp_termo AS numero_siono_disp_termo,
		siono_1x26.codigo_siono AS codigo_siono_1x26y2,
	ficha_hogar.numero_siono_disp_aire_acon AS numero_siono_disp_aire_acon,
		siono_1x27.codigo_siono AS codigo_siono_1x27y2,
	ficha_hogar.numero_siono_disp_automovil AS numero_siono_disp_automovil,
		siono_1x28.codigo_siono AS codigo_siono_1x28y2,
	ficha_hogar.numero_siono_disp_camion AS numero_siono_disp_camion,
		siono_1x29.codigo_siono AS codigo_siono_1x29y2,
	ficha_hogar.numero_siono_disp_motocicleta AS numero_siono_disp_motocicleta,
		siono_1x30.codigo_siono AS codigo_siono_1x30y2,
	ficha_hogar.nombre_jefe_hogar AS nombre_jefe_hogar,
	ficha_hogar.numero_cedula_jefe_hogar AS numero_cedula_jefe_hogar,
	ficha_hogar.letra_cedula_jefe_hogar AS letra_cedula_jefe_hogar,
	ficha_hogar.numero_orden_iden_jefe_hogar AS numero_orden_iden_jefe_hogar,
	ficha_hogar.nombre_respondente AS nombre_respondente,
	ficha_hogar.numero_cedula_respondente AS numero_cedula_respondente,
	ficha_hogar.letra_cedula_respondente AS letra_cedula_respondente,
	ficha_hogar.numero_orden_iden_respondente AS numero_orden_iden_respondente,
	ficha_hogar.id_proveedor_dat_ext AS id_proveedor_dat_ext,
		proveedor_dat_ext_1x31.codigo_proveedor_dat_ext AS codigo_proveedor_dat_ex_1x31y3,
		proveedor_dat_ext_1x31.nombre_proveedor_dat_ext AS nombre_proveedor_dat_ex_1x31y4,
	ficha_hogar.indice_calidad_vida AS indice_calidad_vida,
	ficha_hogar.es_ficha_hogar_inactiva AS es_ficha_hogar_inactiva
FROM
	ficha_hogar ficha_hogar
	LEFT OUTER JOIN funcionario funcionario_1x1 ON funcionario_1x1.id_funcionario = ficha_hogar.id_funcionario_censista
	LEFT OUTER JOIN funcionario funcionario_1x2 ON funcionario_1x2.id_funcionario = ficha_hogar.id_funcionario_supervisor
	LEFT OUTER JOIN funcionario funcionario_1x3 ON funcionario_1x3.id_funcionario = ficha_hogar.id_funcionario_critico_deco
	LEFT OUTER JOIN funcionario funcionario_1x4 ON funcionario_1x4.id_funcionario = ficha_hogar.id_funcionario_digitador
	LEFT OUTER JOIN ubicacion ubicacion_1x5 ON ubicacion_1x5.id_ubicacion = ficha_hogar.id_departamento
	LEFT OUTER JOIN ubicacion ubicacion_1x6 ON ubicacion_1x6.id_ubicacion = ficha_hogar.id_distrito
	LEFT OUTER JOIN tipo_area tipo_area_1x7 ON tipo_area_1x7.numero_tipo_area = ficha_hogar.numero_tipo_area
	LEFT OUTER JOIN ubicacion ubicacion_1x8 ON ubicacion_1x8.id_ubicacion = ficha_hogar.id_barrio
	LEFT OUTER JOIN ubicacion ubicacion_1x9 ON ubicacion_1x9.id_ubicacion = ficha_hogar.id_manzana
	LEFT OUTER JOIN tipo_mat_paredes tipo_mat_paredes_1x10 ON tipo_mat_paredes_1x10.numero_tipo_mat_paredes = ficha_hogar.numero_tipo_mat_paredes
	LEFT OUTER JOIN tipo_mat_piso tipo_mat_piso_1x11 ON tipo_mat_piso_1x11.numero_tipo_mat_piso = ficha_hogar.numero_tipo_mat_piso
	LEFT OUTER JOIN tipo_mat_techo tipo_mat_techo_1x12 ON tipo_mat_techo_1x12.numero_tipo_mat_techo = ficha_hogar.numero_tipo_mat_techo
	LEFT OUTER JOIN tipo_ocupacion_viv tipo_ocupacion_viv_1x13 ON tipo_ocupacion_viv_1x13.numero_tipo_ocupacion_viv = ficha_hogar.numero_tipo_ocupacion_viv
	LEFT OUTER JOIN siono siono_1x14 ON siono_1x14.numero_siono = ficha_hogar.numero_siono_pieza_cocina
	LEFT OUTER JOIN tipo_combustible tipo_combustible_1x15 ON tipo_combustible_1x15.numero_tipo_combustible = ficha_hogar.numero_tipo_combustible
	LEFT OUTER JOIN tipo_pieza_bano tipo_pieza_bano_1x16 ON tipo_pieza_bano_1x16.numero_tipo_pieza_bano = ficha_hogar.numero_tipo_pieza_bano
	LEFT OUTER JOIN tipo_servicio_san tipo_servicio_san_1x17 ON tipo_servicio_san_1x17.numero_tipo_servicio_san = ficha_hogar.numero_tipo_servicio_san
	LEFT OUTER JOIN tipo_servicio_agua tipo_servicio_agua_1x18 ON tipo_servicio_agua_1x18.numero_tipo_servicio_agua = ficha_hogar.numero_tipo_servicio_agua
	LEFT OUTER JOIN tipo_aba_agua tipo_aba_agua_1x19 ON tipo_aba_agua_1x19.numero_tipo_aba_agua = ficha_hogar.numero_tipo_aba_agua
	LEFT OUTER JOIN siono siono_1x20 ON siono_1x20.numero_siono = ficha_hogar.numero_siono_corriente_elec
	LEFT OUTER JOIN tipo_desecho_bas tipo_desecho_bas_1x21 ON tipo_desecho_bas_1x21.numero_tipo_desecho_bas = ficha_hogar.numero_tipo_desecho_bas
	LEFT OUTER JOIN siono siono_1x22 ON siono_1x22.numero_siono = ficha_hogar.numero_siono_telefono_celular
	LEFT OUTER JOIN siono siono_1x23 ON siono_1x23.numero_siono = ficha_hogar.numero_siono_tlf_linea_baja
	LEFT OUTER JOIN siono siono_1x24 ON siono_1x24.numero_siono = ficha_hogar.numero_siono_disp_heladera
	LEFT OUTER JOIN siono siono_1x25 ON siono_1x25.numero_siono = ficha_hogar.numero_siono_disp_lavarropas
	LEFT OUTER JOIN siono siono_1x26 ON siono_1x26.numero_siono = ficha_hogar.numero_siono_disp_termo
	LEFT OUTER JOIN siono siono_1x27 ON siono_1x27.numero_siono = ficha_hogar.numero_siono_disp_aire_acon
	LEFT OUTER JOIN siono siono_1x28 ON siono_1x28.numero_siono = ficha_hogar.numero_siono_disp_automovil
	LEFT OUTER JOIN siono siono_1x29 ON siono_1x29.numero_siono = ficha_hogar.numero_siono_disp_camion
	LEFT OUTER JOIN siono siono_1x30 ON siono_1x30.numero_siono = ficha_hogar.numero_siono_disp_motocicleta
	LEFT OUTER JOIN proveedor_dat_ext proveedor_dat_ext_1x31 ON proveedor_dat_ext_1x31.id_proveedor_dat_ext = ficha_hogar.id_proveedor_dat_ext
GO

SET QUOTED_IDENTIFIER OFF 
GO

SET ANSI_NULLS ON 
GO
