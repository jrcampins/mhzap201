CREATE OR REPLACE VIEW persona_con_pension_denegada(
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
    codigo_estado_civil,
    codigo_condicion_pension,
    codigo_sexo_persona,
    numero_cedula,
    fecha_solicitud_pension,
    fecha_denegacion_pension,
    anho,
    indice_calidad_vida,
    nombre_jefe_hogar,
    numero_cedula_jefe_hogar,
    referencia_casa,
    numero_telefono_resp_hogar,
    nombre_referente,
    numero_telefono,
    observaciones,
    causa_den_pension)
AS
SELECT persona.codigo_persona AS cedula, persona.nombre_persona,
    date_part('year'::text, age(persona.fecha_nacimiento)) AS edad,
    ubicacion_1x4.nombre_ubicacion AS departamento,ubicacion_1x4.id_ubicacion AS id_departamento,
    ubicacion_1x5.nombre_ubicacion AS distrito, ubicacion_1x5.id_ubicacion AS id_distrito,
    ubicacion_1x7.nombre_ubicacion AS barrio, ubicacion_1x7.id_ubicacion AS id_barrio,
    persona.direccion, ecp.codigo_estado_civil,
    cp.codigo_condicion_pension, sp.codigo_sexo_persona, persona.numero_cedula,
    persona.fecha_solicitud_pension, fecha_denegacion_pension, date_part('year'::text,
    persona.fecha_solicitud_pension) AS anho, persona.indice_calidad_vida,
    fh.nombre_jefe_hogar, fh.numero_cedula_jefe_hogar, fh.direccion AS
    referencia_casa, pb.numero_telefono_resp_hogar, pb.nombre_referente,
    COALESCE(fh.numero_telefono_linea_baja, fh.numero_telefono_celular) AS
    numero_telefono, cd.codigo_causa_den_pension AS observaciones, 
    --TODO: Agregar objeciones a la elegibilidad
    cd.codigo_causa_den_pension as causa_den_pension
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
   LEFT JOIN ficha_persona fp ON persona.id_ficha_persona = fp.id_ficha_persona
   LEFT JOIN ficha_hogar fh ON fp.id_ficha_hogar = fh.id_ficha_hogar
   LEFT JOIN potencial_ben pb ON fp.id_potencial_ben =
       pb.id_potencial_ben
   JOIN causa_den_pension cd ON persona.numero_causa_den_pension=cd.numero_causa_den_pension
WHERE persona.numero_condicion_pension = 3 AND
    persona.es_persona_acreditada_para_pen = 1
ORDER BY persona.fecha_solicitud_pension, persona.id_departamento,
    persona.id_distrito, persona.id_barrio, persona.nombre_persona;
