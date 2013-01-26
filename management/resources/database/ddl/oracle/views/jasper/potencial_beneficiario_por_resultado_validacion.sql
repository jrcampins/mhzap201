CREATE OR REPLACE VIEW potencial_ben_por_resultado 
AS
SELECT pb.codigo_potencial_ben AS cedula,
    pb.nombre_potencial_ben as nombre_persona,
    utils.years_since(pb.fecha_nacimiento) AS edad,
    ubicacion_1x4.nombre_ubicacion AS departamento, 
    ubicacion_1x4.id_ubicacion AS id_departamento,
    ubicacion_1x5.nombre_ubicacion AS distrito, 
    ubicacion_1x5.id_ubicacion AS id_distrito,
    ubicacion_1x7.nombre_ubicacion AS barrio, 
    ubicacion_1x7.id_ubicacion AS id_barrio,
    pb.direccion, 
    pb.numero_cedula, 
    pb.fecha_registro_pot_ben, 
    extract(year from pb.fecha_registro_pot_ben) AS anho, 
    pb.indice_calidad_vida,
    fh.fecha_entrevista as fecha_icv ,
    pd.id_proveedor_dat_ext, 
    pd.nombre_proveedor_dat_ext,
    pb.numero_condicion_censo,
    cc.codigo_condicion_censo,
    pb.comentarios_validacion_censo,
    pb.id_funcionario_validacion_cen,
    f.nombre_funcionario,
    pb.fecha_validacion_censo,
    ta.numero_tipo_area,
    ta.codigo_tipo_area as area,
    case when pb.es_potencial_ben_migrado=1 then '*' else ' ' end as es_potencial_ben_migrado
FROM potencial_ben pb
   LEFT JOIN ficha_persona fp ON pb.id_ficha_persona = fp.id_ficha_persona
   LEFT JOIN ficha_hogar fh ON fp.id_ficha_hogar = fh.id_ficha_hogar
   LEFT JOIN proveedor_dat_ext pd ON fh.id_proveedor_dat_ext=pd.id_proveedor_dat_ext
   LEFT JOIN ubicacion ubicacion_1x4 ON ubicacion_1x4.id_ubicacion = pb.id_departamento
   LEFT JOIN ubicacion ubicacion_1x5 ON ubicacion_1x5.id_ubicacion = pb.id_distrito
   LEFT JOIN ubicacion ubicacion_1x7 ON ubicacion_1x7.id_ubicacion = pb.id_barrio
   LEFT JOIN condicion_censo cc ON cc.numero_condicion_censo=pb.numero_condicion_censo
   LEFT JOIN funcionario f ON f.id_funcionario=pb.id_funcionario_validacion_cen
   LEFT JOIN tipo_area ta ON ubicacion_1x7.numero_tipo_area=ta.numero_tipo_area
WHERE pb.indice_calidad_vida is not null
AND pb.numero_condicion_censo is not null
AND  pb.numero_condicion_Censo<>1
AND pb.numero_condicion_censo<>2
ORDER BY cc.numero_condicion_censo,fh.id_departamento,
    fh.id_distrito, fh.id_barrio, pb.nombre_potencial_ben;
