CREATE OR REPLACE VIEW persona_con_pension_denegada
AS
SELECT DISTINCT
       persona.codigo_persona AS cedula, 
       persona.nombre_persona,
       utils.years_since(persona.fecha_nacimiento) as edad,
       ubicacion_1x4.nombre_ubicacion AS departamento,
       ubicacion_1x4.id_ubicacion AS id_departamento,
       ubicacion_1x5.nombre_ubicacion AS distrito, 
       ubicacion_1x5.id_ubicacion AS id_distrito,
       ubicacion_1x7.nombre_ubicacion AS barrio, 
       ubicacion_1x7.id_ubicacion AS id_barrio,
       persona.numero_cedula,
       persona.direccion, 
       persona.numero_condicion_pension,
       persona.fecha_solicitud_pension, 
       persona.fecha_denegacion_pension,
       persona.numero_resolucion_den_pen, 
       persona.fecha_resolucion_den_pen,
       persona.comentarios_denegacion_pension,
       extract(year from persona.fecha_solicitud_pension) AS anho, 
       persona.indice_calidad_vida,
       persona.numero_causa_den_pension,
       COALESCE(fh.numero_telefono_linea_baja, 
       fh.numero_telefono_celular) AS numero_telefono,
       utils.extract_objeciones(persona.id_persona) as objeciones,
       persona.codigo_sime
FROM persona persona
   LEFT JOIN ubicacion ubicacion_1x4 ON ubicacion_1x4.id_ubicacion =persona.id_departamento
   LEFT JOIN ubicacion ubicacion_1x5 ON ubicacion_1x5.id_ubicacion = persona.id_distrito
   LEFT JOIN ubicacion ubicacion_1x7 ON ubicacion_1x7.id_ubicacion = persona.id_barrio
   LEFT JOIN ficha_persona fp ON persona.id_ficha_persona = fp.id_ficha_persona
   LEFT JOIN ficha_hogar fh ON fp.id_ficha_hogar = fh.id_ficha_hogar
   LEFT JOIN causa_den_pension cd on persona.numero_causa_den_pension=cd.numero_causa_den_pension
WHERE persona.numero_condicion_pension = 6  
ORDER BY id_distrito, persona.fecha_solicitud_pension,persona.numero_Resolucion_den_pen,persona.nombre_persona;