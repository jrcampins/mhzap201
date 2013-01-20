CREATE OR REPLACE VIEW potencial_ben_constancia_reg 
AS
SELECT pb.id_potencial_ben,pb.nombre_potencial_ben,pb.codigo_potencial_ben,
       pb.fecha_nacimiento,cast(utils.years_since(pb.fecha_nacimiento) as integer) AS edad,
       pb.letra_cedula,pb.numero_cedula,pb.numero_cedula||utils.concat_or_empty('-',pb.letra_cedula) as cedula,
       pb.fecha_expedicion_cedula, pb.fecha_vencimiento_cedula,
       pb.nombre_responsable_hogar,pb.numero_telefono_resp_hogar ,
       ubicacion_1x4.nombre_ubicacion AS departamento, ubicacion_1x4.id_ubicacion AS id_departamento,
       ubicacion_1x5.nombre_ubicacion AS distrito, ubicacion_1x5.id_ubicacion AS id_distrito,
       ubicacion_1x7.nombre_ubicacion AS barrio, ubicacion_1x7.id_ubicacion AS id_barrio, 
       pb.id_manzana as manzana, ta.codigo_tipo_area as area,pb.direccion, pb.es_persona_con_jubilacion AS tiene_jubilacion,
       pb.fecha_registro_pot_ben, extract(year from pb.fecha_registro_pot_ben) AS anho,
       pb.nombre_referente,pb.numero_telefono_referente
FROM potencial_ben pb
     LEFT JOIN ubicacion ubicacion_1x4 ON ubicacion_1x4.id_ubicacion = pb.id_departamento
     LEFT JOIN ubicacion ubicacion_1x5 ON ubicacion_1x5.id_ubicacion = pb.id_distrito
     LEFT JOIN ubicacion ubicacion_1x7 ON ubicacion_1x7.id_ubicacion = pb.id_barrio
     LEFT JOIN tipo_area ta ON ta.numero_tipo_area=pb.numero_tipo_area;
