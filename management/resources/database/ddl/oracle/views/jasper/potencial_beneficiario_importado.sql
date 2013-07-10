CREATE OR REPLACE VIEW potencial_ben_importado
AS
SELECT 
    fp.nombre_ficha_persona,
    case when pb.codigo_potencial_ben is not null then pb.codigo_potencial_ben else to_char(fp.numero_cedula) end as num_cedula, 
    utils.years_since(fp.fecha_nacimiento) AS edad,
    ubicacion_1x4.nombre_ubicacion AS departamento, 
    ubicacion_1x4.id_ubicacion AS id_departamento,
    ubicacion_1x5.nombre_ubicacion AS distrito, 
    ubicacion_1x5.id_ubicacion AS id_distrito,
    ubicacion_1x7.nombre_ubicacion AS barrio, 
    ubicacion_1x7.id_ubicacion AS id_barrio,
    ta.numero_tipo_area,
    ta.codigo_tipo_area as area,
    pb.fecha_registro_pot_ben, 
    extract(year from lp.fecha_hora_transaccion) AS anho, 
    fh.indice_calidad_vida,
    case when pb.codigo_potencial_ben is null then 'No registrado ' else tr.codigo_tipo_reg_pot_ben end as importado,
    pb.numero_tipo_reg_pot_ben,
    lp.observacion
FROM ficha_persona fp
   LEFT JOIN ficha_hogar fh ON fp.id_ficha_hogar = fh.id_ficha_hogar
   LEFT JOIN potencial_ben pb ON pb.id_ficha_persona = fp.id_ficha_persona
   LEFT JOIN ubicacion ubicacion_1x4 ON ubicacion_1x4.id_ubicacion = fh.id_departamento
   LEFT JOIN ubicacion ubicacion_1x5 ON ubicacion_1x5.id_ubicacion = fh.id_distrito
   LEFT JOIN ubicacion ubicacion_1x7 ON ubicacion_1x7.id_ubicacion = fh.id_barrio
   LEFT JOIN tipo_area ta on ubicacion_1x7.numero_tipo_area = ta.numero_tipo_area
   LEFT JOIN log_imp_per_eec lp on lp.id_ficha_persona=fp.id_ficha_persona
   LEFT JOIN tipo_reg_pot_ben tr on tr.numero_tipo_reg_pot_ben=pb.numero_tipo_reg_pot_ben 
ORDER BY departamento, distrito, importado,num_cedula;
