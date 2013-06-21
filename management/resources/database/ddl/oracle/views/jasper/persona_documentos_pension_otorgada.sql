create or replace view persona_doc_pension_oto as
SELECT persona.codigo_persona AS cedula, 
       persona.nombre_persona,
       persona.numero_cedula,
       persona.fecha_solicitud_pension, 
       persona.fecha_aprobacion_pension,
       persona.fecha_otorgamiento_pen,
       persona.numero_resolucion_otor_pen,
       persona.fecha_resolucion_otor_pen,
       persona.indice_calidad_vida,
       utils.years_since(persona.fecha_nacimiento) as edad,
       ubicacion_1x4.nombre_ubicacion AS departamento,
       ubicacion_1x4.id_ubicacion AS id_departamento,
       ubicacion_1x5.nombre_ubicacion AS distrito, 
       ubicacion_1x5.id_ubicacion AS id_distrito,
       ubicacion_1x7.nombre_ubicacion AS barrio, 
       ubicacion_1x7.id_ubicacion AS id_barrio,
       cp.codigo_condicion_pension,
       persona.es_persona_con_copia_cedula,
       persona.es_persona_con_cer_vida,
       persona.es_persona_con_declaracion_jur,
       extract(year from persona.fecha_solicitud_pension) AS anho, 
       case when persona.es_persona_con_copia_cedula=1 then 'Sí' else 'No' end as copia_cedula,
       case when persona.es_persona_con_cer_vida=1 then 'Sí' else 'No' end as certificado_vida,
       case when persona.es_persona_con_declaracion_jur=1 then 'Sí' else 'No' end as declaracion_jur,
       persona.comentarios_entrega_documentos,
       persona.codigo_sime
   FROM persona persona
   LEFT JOIN ubicacion ubicacion_1x4 ON ubicacion_1x4.id_ubicacion = persona.id_departamento
   LEFT JOIN ubicacion ubicacion_1x5 ON ubicacion_1x5.id_ubicacion = persona.id_distrito
   LEFT JOIN ubicacion ubicacion_1x7 ON ubicacion_1x7.id_ubicacion = persona.id_barrio
   JOIN condicion_pension cp ON persona.numero_condicion_pension = cp.numero_condicion_pension
WHERE persona.numero_condicion_pension = 5  
ORDER BY persona.id_departamento, persona.id_distrito,persona.fecha_solicitud_pension,persona.codigo_sime, persona.codigo_persona;