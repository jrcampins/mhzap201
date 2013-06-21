CREATE OR REPLACE VIEW potencial_ben_por_validar 
AS
SELECT pb.codigo_potencial_ben AS cedula, 
    pb.nombre_potencial_ben AS nombre_persona,
    utils.years_since(pb.fecha_nacimiento) AS edad,
    ubicacion_1x4.nombre_ubicacion AS departamento, 
    ubicacion_1x4.id_ubicacion AS id_departamento,
    ubicacion_1x5.nombre_ubicacion AS distrito, 
    ubicacion_1x5.id_ubicacion AS id_distrito,
    ubicacion_1x7.nombre_ubicacion AS barrio, 
    ubicacion_1x7.id_ubicacion AS id_barrio,
    pb.direccion, 
    ta.numero_tipo_area,
    ta.codigo_tipo_area as area,
    pb.numero_cedula, 
    pb.fecha_registro_pot_ben, 
    extract(year from pb.fecha_registro_pot_ben) AS anho, 
    fh.indice_calidad_vida,
    fh.nombre_jefe_hogar, 
    fh.numero_cedula_jefe_hogar, 
    pb.referencia_direccion AS referencia_casa,
    case when pb.es_potencial_ben_migrado=1 then '*' else ' ' end as es_potencial_ben_migrado
FROM potencial_ben pb
   LEFT JOIN ficha_persona fp ON pb.id_ficha_persona = fp.id_ficha_persona
   LEFT JOIN ficha_hogar fh ON fp.id_ficha_hogar = fh.id_ficha_hogar
   LEFT JOIN proveedor_dat_ext pd ON fh.id_proveedor_dat_ext=pd.id_proveedor_dat_ext
   LEFT JOIN ubicacion ubicacion_1x4 ON ubicacion_1x4.id_ubicacion = pb.id_departamento
   LEFT JOIN ubicacion ubicacion_1x5 ON ubicacion_1x5.id_ubicacion = pb.id_distrito
   LEFT JOIN ubicacion ubicacion_1x7 ON ubicacion_1x7.id_ubicacion = pb.id_barrio
   LEFT JOIN tipo_area ta ON ubicacion_1x7.numero_tipo_area=ta.numero_tipo_area
WHERE pb.numero_condicion_censo=2 and pb.indice_calidad_vida is not null
ORDER BY pb.nombre_potencial_ben,pb.fecha_registro_pot_ben, pb.id_departamento,
    pb.id_distrito, pb.id_barrio;
