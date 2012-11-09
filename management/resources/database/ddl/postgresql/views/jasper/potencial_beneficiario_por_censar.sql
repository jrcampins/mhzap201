CREATE OR REPLACE VIEW potencial_ben_por_censar (
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
    nombre_responsable_hogar,
    referencia_casa,
    numero_telefono_resp_hogar,
    nombre_referente,
    numero_telefono_referente)
AS
SELECT pb.codigo_potencial_ben AS cedula, pb.nombre_potencial_ben AS nombre_persona,
    date_part('year'::text, age(pb.fecha_nacimiento)) AS edad,
    ubicacion_1x4.nombre_ubicacion AS departamento, ubicacion_1x4.id_ubicacion AS id_departamento,
    ubicacion_1x5.nombre_ubicacion AS distrito, ubicacion_1x5.id_ubicacion AS id_distrito,
    ubicacion_1x7.nombre_ubicacion AS barrio, ubicacion_1x7.id_ubicacion AS id_barrio, 
    pb.direccion, 
    pb.numero_cedula,
    pb.fecha_registro_pot_ben, date_part('year'::text,pb.fecha_registro_pot_ben) AS anho, 
    pb.nombre_responsable_hogar, 
    --TODO: Agregar referencia a casa
    pb.direccion AS referencia_casa, pb.numero_telefono_resp_hogar, pb.nombre_referente,pb.numero_telefono_referente
FROM potencial_ben pb
   LEFT JOIN ubicacion ubicacion_1x4 ON ubicacion_1x4.id_ubicacion = pb.id_departamento
   LEFT JOIN ubicacion ubicacion_1x5 ON ubicacion_1x5.id_ubicacion = pb.id_distrito
   LEFT JOIN ubicacion ubicacion_1x7 ON ubicacion_1x7.id_ubicacion = pb.id_barrio
   LEFT JOIN condicion_censo cc ON pb.numero_condicion_censo =cc.numero_condicion_censo
   LEFT JOIN ficha_persona fp ON pb.id_ficha_persona = fp.id_ficha_persona
   LEFT JOIN ficha_hogar fh ON fp.id_ficha_hogar = fh.id_ficha_hogar
WHERE pb.id_ficha_persona is null OR pb.numero_condicion_censo=1
ORDER BY pb.fecha_registro_pot_ben, pb.id_departamento,
    pb.id_distrito, pb.id_barrio, pb.nombre_potencial_ben;
