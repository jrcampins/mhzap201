CREATE OR REPLACE VIEW persona_con_pension_revocada 
AS
SELECT persona.codigo_persona AS cedula, 
    persona.nombre_persona,
    utils.years_since(persona.fecha_nacimiento) as edad,
    ubicacion_1x4.nombre_ubicacion AS departamento,
    ubicacion_1x4.id_ubicacion AS id_departamento,
    ubicacion_1x5.nombre_ubicacion AS distrito, 
    ubicacion_1x5.id_ubicacion AS id_distrito,
    ubicacion_1x7.nombre_ubicacion AS barrio, 
    ubicacion_1x7.id_ubicacion AS id_barrio,
    persona.direccion, 
    persona.numero_condicion_pension,
    persona.numero_cedula,
    persona.fecha_solicitud_pension, 
    fecha_revocacion_pension,
    persona.numero_causa_rev_pension,
    extract(year from persona.fecha_solicitud_pension) AS anho, 
    persona.indice_calidad_vida,
    fh.nombre_jefe_hogar, 
    fh.numero_cedula_jefe_hogar, 
    fh.direccion AS referencia_casa,
    COALESCE(fh.numero_telefono_linea_baja, fh.numero_telefono_celular) AS numero_telefono, 
    cd.codigo_causa_rev_pension AS observaciones, 
    cd.numero_causa_rev_pension as numero_causa_den_pension,
    persona.codigo_sime
FROM persona persona
   LEFT JOIN ubicacion ubicacion_1x4 ON ubicacion_1x4.id_ubicacion = persona.id_departamento
   LEFT JOIN ubicacion ubicacion_1x5 ON ubicacion_1x5.id_ubicacion = persona.id_distrito
   LEFT JOIN ubicacion ubicacion_1x7 ON ubicacion_1x7.id_ubicacion = persona.id_barrio
   LEFT JOIN ficha_persona fp ON persona.id_ficha_persona = fp.id_ficha_persona
   LEFT JOIN ficha_hogar fh ON fp.id_ficha_hogar = fh.id_ficha_hogar
   LEFT JOIN causa_rev_pension cd ON persona.numero_causa_rev_pension=cd.numero_causa_rev_pension
WHERE persona.numero_condicion_pension = 4
ORDER BY persona.fecha_solicitud_pension, persona.id_departamento,
    persona.id_distrito, persona.id_barrio, persona.nombre_persona;
