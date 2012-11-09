--TODO: Modificar campos para que muestre algo
CREATE OR REPLACE VIEW persona_cuadro_resumen_pension (
    cedula,
    nombre_persona,
    edad,
    departamento,
    distrito,
    barrio,
    direccion,
    codigo_estado_civil,
    codigo_condicion_pension,
    codigo_sexo_persona,
    numero_cedula,
    anho)
AS
SELECT persona.codigo_persona AS cedula, persona.nombre_persona,
    date_part('year'::text, age(persona.fecha_nacimiento)) AS edad,
    ubicacion_1x4.nombre_ubicacion AS departamento,
    ubicacion_1x5.nombre_ubicacion AS distrito, ubicacion_1x7.nombre_ubicacion
    AS barrio, persona.direccion, ecp.codigo_estado_civil,
    cp.codigo_condicion_pension, sp.codigo_sexo_persona, persona.numero_cedula,
    date_part('year'::text, persona.fecha_solicitud_pension) AS anho
FROM persona persona
   LEFT JOIN ubicacion ubicacion_1x4 ON ubicacion_1x4.id_ubicacion =
       persona.id_departamento
   LEFT JOIN ubicacion ubicacion_1x5 ON ubicacion_1x5.id_ubicacion = persona.id_distrito
   LEFT JOIN ubicacion ubicacion_1x7 ON ubicacion_1x7.id_ubicacion = persona.id_barrio
   LEFT JOIN estado_civil ecp ON persona.numero_estado_civil =
       ecp.numero_estado_civil
   JOIN condicion_pension cp ON persona.numero_condicion_pension =
       cp.numero_condicion_pension
   LEFT JOIN sexo_persona sp ON persona.numero_sexo_persona = sp.numero_sexo_persona
WHERE persona.numero_condicion_pension = 1
ORDER BY persona.fecha_solicitud_pension, persona.id_departamento,
    persona.id_distrito, persona.id_barrio, persona.nombre_persona;
