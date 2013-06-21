--persona_acreditada_sin_objeciones
CREATE OR REPLACE VIEW persona_acr_sin_obj 
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
    persona.direccion as direccion,
    persona.numero_cedula,
    persona.fecha_solicitud_pension,
    extract(year from persona.fecha_solicitud_pension) AS anho,
    persona.indice_calidad_vida,
    fh.nombre_jefe_hogar, 
    fh.numero_cedula_jefe_hogar, 
    fh.direccion AS referencia_casa, 
    pb.numero_telefono_resp_hogar, 
    pb.nombre_referente,
    persona.codigo_sime,
    COALESCE(fh.numero_telefono_linea_baja, fh.numero_telefono_celular) AS numero_telefono,   
    toep.codigo_tipo_obj_ele_pen||' : '||pde.nombre_proveedor_dat_ext||NVL(' '||oep.observaciones,'.') AS objeciones_elegibilidad
FROM persona persona
   LEFT JOIN potencial_ben pb ON pb.id_persona =persona.id_persona
   LEFT JOIN ubicacion ubicacion_1x4 ON ubicacion_1x4.id_ubicacion =persona.id_departamento
   LEFT JOIN ubicacion ubicacion_1x5 ON ubicacion_1x5.id_ubicacion = persona.id_distrito
   LEFT JOIN ubicacion ubicacion_1x7 ON ubicacion_1x7.id_ubicacion = persona.id_barrio
   LEFT JOIN ficha_persona fp ON persona.id_ficha_persona = fp.id_ficha_persona
   LEFT JOIN ficha_hogar fh ON fp.id_ficha_hogar = fh.id_ficha_hogar
   LEFT JOIN objecion_ele_pen oep on oep.id_persona=persona.id_persona
   LEFT JOIN proveedor_dat_ext pde on oep.id_proveedor_dat_ext=pde.id_proveedor_dat_ext
   LEFT JOIN tipo_obj_ele_pen toep on toep.numero_tipo_obj_ele_pen= oep.numero_tipo_obj_ele_pen
WHERE  persona.es_persona_acreditada_para_pen = 1 AND
       persona.numero_condicion_pension=1 AND
       (oep.id_objecion_ele_pen is null or oep.es_objecion_ele_pen_inactiva=1) 
ORDER BY departamento, distrito, persona.fecha_solicitud_pension,persona.codigo_sime,persona.codigo_persona;
