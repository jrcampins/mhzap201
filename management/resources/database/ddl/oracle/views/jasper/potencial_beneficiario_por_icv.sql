-- OJO: se agrego referencia_casa a la lista de columnas de la vista
CREATE OR REPLACE VIEW potencial_ben_por_icv 
AS
SELECT
    pb.codigo_potencial_ben AS cedula,
    pb.nombre_potencial_ben as nombre_persona,
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
    pb.numero_condicion_censo,
    cc.codigo_condicion_censo,
    case when pb.es_potencial_ben_migrado=1 then '*' else ' ' end as es_potencial_ben_migrado
FROM potencial_ben pb
   LEFT JOIN ubicacion ubicacion_1x4 ON ubicacion_1x4.id_ubicacion = pb.id_departamento
   LEFT JOIN ubicacion ubicacion_1x5 ON ubicacion_1x5.id_ubicacion = pb.id_distrito
   LEFT JOIN ubicacion ubicacion_1x7 ON ubicacion_1x7.id_ubicacion = pb.id_barrio
   LEFT JOIN condicion_censo cc ON cc.numero_condicion_censo=pb.numero_condicion_censo
   LEFT JOIN tipo_area ta ON ubicacion_1x7.numero_tipo_area=ta.numero_tipo_area
WHERE pb.indice_calidad_vida is not null
ORDER BY cc.numero_condicion_censo,pb.id_departamento,
    pb.id_distrito, pb.id_barrio, pb.nombre_potencial_ben;
