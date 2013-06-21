create or replace view persona_reco_sol as
SELECT persona.codigo_persona AS cedula, 
       persona.nombre_persona,
       persona.numero_cedula,
       persona.fecha_solicitud_pension, 
       persona.fecha_objecion_pension,
       persona.fecha_denegacion_pension,
       persona.numero_resolucion_den_pen,
       persona.fecha_resolucion_den_pen,
       persona.indice_calidad_vida,
       utils.years_since(persona.fecha_nacimiento) as edad,
       ubicacion_1x4.nombre_ubicacion AS departamento,
       ubicacion_1x4.id_ubicacion AS id_departamento,
       ubicacion_1x5.nombre_ubicacion AS distrito, 
       ubicacion_1x5.id_ubicacion AS id_distrito,
       ubicacion_1x7.nombre_ubicacion AS barrio, 
       ubicacion_1x7.id_ubicacion AS id_barrio,
       cp.codigo_condicion_pension,
       persona.fecha_solicitud_reco_pen as fecha_reconsideracion,
       cr.codigo_condicion_reco_pen,
       extract(year from persona.fecha_solicitud_pension) AS anho, 
       persona.comentarios_entrega_documentos,
       persona.codigo_sime
   FROM persona persona
   LEFT JOIN ubicacion ubicacion_1x4 ON ubicacion_1x4.id_ubicacion = persona.id_departamento
   LEFT JOIN ubicacion ubicacion_1x5 ON ubicacion_1x5.id_ubicacion = persona.id_distrito
   LEFT JOIN ubicacion ubicacion_1x7 ON ubicacion_1x7.id_ubicacion = persona.id_barrio
   JOIN condicion_pension cp ON persona.numero_condicion_pension = cp.numero_condicion_pension
   JOIN condicion_reco_pen cr ON persona.numero_condicion_reco_pen=cr.numero_condicion_reco_pen
WHERE persona.numero_condicion_pension = 6 and  persona.numero_condicion_reco_pen is not null
ORDER BY persona.id_departamento, persona.id_distrito,persona.fecha_solicitud_pension,persona.codigo_sime, persona.nombre_persona, persona.id_barrio;