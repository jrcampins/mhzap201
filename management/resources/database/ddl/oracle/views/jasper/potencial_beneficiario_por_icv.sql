-- OJO: se agrego referencia_casa a la lista de columnas de la vista
CREATE OR REPLACE VIEW potencial_ben_por_icv (
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
    fecha_icv,
    fuente_icv,
    numero_condicion_censo,
    codigo_condicion_censo,
    nombre_jefe_hogar,
    numero_cedula_jefe_hogar,
    referencia_casa
)
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
    pb.direccion, 
    pb.numero_cedula, 
    pb.fecha_registro_pot_ben,
    extract(year from pb.fecha_registro_pot_ben) AS anho, 
    fh.indice_calidad_vida,
    fh.fecha_entrevista,
    pd.nombre_proveedor_dat_ext,
    pb.numero_condicion_censo,
    cc.codigo_condicion_censo,
    fh.nombre_jefe_hogar,
    fh.numero_cedula_jefe_hogar,
    fh.direccion AS referencia_casa
FROM potencial_ben pb
   LEFT JOIN ficha_persona fp ON pb.id_ficha_persona = fp.id_ficha_persona
   LEFT JOIN ficha_hogar fh ON fp.id_ficha_hogar = fh.id_ficha_hogar
   LEFT JOIN proveedor_dat_ext pd ON fh.id_proveedor_dat_ext=pd.id_proveedor_dat_ext
   LEFT JOIN ubicacion ubicacion_1x4 ON ubicacion_1x4.id_ubicacion = pb.id_departamento
   LEFT JOIN ubicacion ubicacion_1x5 ON ubicacion_1x5.id_ubicacion = pb.id_distrito
   LEFT JOIN ubicacion ubicacion_1x7 ON ubicacion_1x7.id_ubicacion = pb.id_barrio
   LEFT JOIN condicion_censo cc ON cc.numero_condicion_censo=pb.numero_condicion_censo
WHERE pb.id_ficha_persona is not null
ORDER BY cc.numero_condicion_censo,fh.id_departamento,
    fh.id_distrito, fh.id_barrio, pb.nombre_potencial_ben;
