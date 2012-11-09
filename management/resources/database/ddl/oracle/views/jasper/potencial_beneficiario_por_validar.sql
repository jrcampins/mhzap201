CREATE OR REPLACE VIEW potencial_ben_por_validar (
    cedula,
    nombre_persona,
    edad,
    departamento,
    id_departamento,
    distrito,
    id_distrito,
    barrio,
    id_barrio,
    direccion,
    numero_cedula,
    fecha_registro_pot_ben,
    anho,
    indice_calidad_vida,
    nombre_jefe_hogar,
    numero_cedula_jefe_hogar,
    referencia_casa)
AS
SELECT pb.codigo_potencial_ben AS cedula, pb.nombre_potencial_ben,
    utils.years_since(pb.fecha_nacimiento) AS edad,
    ubicacion_1x4.nombre_ubicacion AS departamento, ubicacion_1x4.id_ubicacion AS id_departamento,
    ubicacion_1x5.nombre_ubicacion AS distrito, ubicacion_1x5.id_ubicacion AS id_distrito,
    ubicacion_1x7.nombre_ubicacion AS barrio, ubicacion_1x7.id_ubicacion AS id_barrio,
    pb.direccion, 
    pb.numero_cedula, 
    pb.fecha_registro_pot_ben, extract(year from pb.fecha_registro_pot_ben) AS anho, 
    fh.indice_calidad_vida,
    fh.nombre_jefe_hogar, fh.numero_cedula_jefe_hogar, 
    pb.referencia_direccion AS referencia_casa
FROM potencial_ben pb
   LEFT JOIN ficha_persona fp ON pb.id_ficha_persona = fp.id_ficha_persona
   LEFT JOIN ficha_hogar fh ON fp.id_ficha_hogar = fh.id_ficha_hogar
   LEFT JOIN proveedor_dat_ext pd ON fh.id_proveedor_dat_ext=pd.id_proveedor_dat_ext
   LEFT JOIN ubicacion ubicacion_1x4 ON ubicacion_1x4.id_ubicacion = pb.id_departamento
   LEFT JOIN ubicacion ubicacion_1x5 ON ubicacion_1x5.id_ubicacion = pb.id_distrito
   LEFT JOIN ubicacion ubicacion_1x7 ON ubicacion_1x7.id_ubicacion = pb.id_barrio
WHERE pb.numero_condicion_censo=2
  AND pb.id_ficha_persona is not null
ORDER BY pb.fecha_registro_pot_ben, pb.id_departamento,
    pb.id_distrito, pb.id_barrio, pb.nombre_potencial_ben;
