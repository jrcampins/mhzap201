CREATE OR REPLACE VIEW potencial_ben_por_censar
AS
SELECT pb.codigo_potencial_ben AS cedula, pb.nombre_potencial_ben AS nombre_persona,
    utils.years_since(pb.fecha_nacimiento) AS edad,
    ubicacion_1x4.nombre_ubicacion AS departamento, ubicacion_1x4.id_ubicacion AS id_departamento,
    ubicacion_1x5.nombre_ubicacion AS distrito, ubicacion_1x5.id_ubicacion AS id_distrito,
    ubicacion_1x7.nombre_ubicacion AS barrio, ubicacion_1x7.id_ubicacion AS id_barrio, 
    pb.direccion, 
    pb.numero_cedula,
    pb.fecha_registro_pot_ben, extract(year from pb.fecha_registro_pot_ben) AS anho, 
    pb.nombre_responsable_hogar, 
    pb.referencia_direccion AS referencia_casa, 
    pb.numero_telefono_resp_hogar, 
    pb.nombre_referente,
    pb.numero_telefono_referente,
    ta.numero_tipo_area,
    ta.codigo_tipo_area
FROM potencial_ben pb
   LEFT JOIN ubicacion ubicacion_1x4 ON ubicacion_1x4.id_ubicacion = pb.id_departamento
   LEFT JOIN ubicacion ubicacion_1x5 ON ubicacion_1x5.id_ubicacion = pb.id_distrito
   LEFT JOIN ubicacion ubicacion_1x7 ON ubicacion_1x7.id_ubicacion = pb.id_barrio
   LEFT JOIN condicion_censo cc ON pb.numero_condicion_censo =cc.numero_condicion_censo
   LEFT JOIN ficha_persona fp ON pb.id_ficha_persona = fp.id_ficha_persona
   LEFT JOIN ficha_hogar fh ON fp.id_ficha_hogar = fh.id_ficha_hogar
   LEFT JOIN tipo_area ta ON ubicacion_1x7.numero_tipo_area=ta.numero_tipo_area
WHERE pb.id_ficha_persona is null OR pb.numero_condicion_censo=1
ORDER BY pb.fecha_registro_pot_ben, pb.id_departamento,
    pb.id_distrito, pb.id_barrio, pb.nombre_potencial_ben;
