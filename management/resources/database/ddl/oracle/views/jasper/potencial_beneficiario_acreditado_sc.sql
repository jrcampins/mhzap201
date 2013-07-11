CREATE OR REPLACE VIEW potencial_ben_acreditado_sc
AS
select
    pb.nombre_potencial_ben,
    pb.codigo_potencial_ben,
    utils.years_since(pb.fecha_nacimiento) AS edad,
    ubicacion_1x4.nombre_ubicacion AS departamento, 
    ubicacion_1x4.id_ubicacion AS id_departamento,
    ubicacion_1x5.nombre_ubicacion AS distrito, 
    ubicacion_1x5.id_ubicacion AS id_distrito,
    ubicacion_1x7.nombre_ubicacion AS barrio, 
    ubicacion_1x7.id_ubicacion AS id_barrio,
    ta.numero_tipo_area,
    ta.codigo_tipo_area as area,
    pb.direccion, 
    pb.numero_cedula, 
    pb.fecha_registro_pot_ben, 
    extract(year from pb.fecha_registro_pot_ben) AS anho, 
    pb.indice_calidad_vida,
    fh.nombre_jefe_hogar, 
    fh.numero_cedula_jefe_hogar, 
    pb.referencia_direccion AS referencia_casa,
    pb.numero_tipo_reg_pot_ben
FROM potencial_ben pb
   LEFT JOIN ficha_persona fp ON pb.id_ficha_persona = fp.id_ficha_persona
   LEFT JOIN ficha_hogar fh ON fp.id_ficha_hogar = fh.id_ficha_hogar
   LEFT JOIN ubicacion ubicacion_1x4 ON ubicacion_1x4.id_ubicacion = pb.id_departamento
   LEFT JOIN ubicacion ubicacion_1x5 ON ubicacion_1x5.id_ubicacion = pb.id_distrito
   LEFT JOIN ubicacion ubicacion_1x7 ON ubicacion_1x7.id_ubicacion = pb.id_barrio
   LEFT JOIN tipo_area ta on ubicacion_1x7.numero_tipo_area = ta.numero_tipo_area
WHERE pb.numero_tipo_reg_pot_ben=2
  AND pb.indice_calidad_vida<(ta.limite_indice_calidad_vida)
  AND utils.years_since(pb.fecha_nacimiento)>=65
  AND pb.es_potencial_ben_inactivo=0
ORDER BY  pb.id_departamento,pb.id_distrito,anho, pb.nombre_potencial_ben;