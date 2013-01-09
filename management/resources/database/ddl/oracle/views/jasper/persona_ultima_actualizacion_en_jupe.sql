create or replace view persona_actualizada_en_jupe as
select
    persona.codigo_persona as cedula,
    persona.nombre_persona,
    persona.numero_cedula,
    utils.years_since(persona.fecha_nacimiento) as edad,
    estado_civil.codigo_estado_civil,
    sexo_persona.codigo_sexo_persona,
    persona.id_departamento,
    ubicacion1.nombre_ubicacion as departamento,
    persona.id_distrito,
    ubicacion2.nombre_ubicacion as distrito,
--  persona.id_barrio,
--  ubicacion3.nombre_ubicacion as barrio,
    persona.direccion,
    condicion_pension.codigo_condicion_pension,
    persona.fecha_solicitud_pension,
    persona.fecha_aprobacion_pension,
    persona.fecha_otorgamiento_pen,
    persona.numero_resolucion_otor_pen as numero_resolucion_pension,
    persona.fecha_resolucion_otor_pen as fecha_resolucion_pension,
    extract(year from persona.fecha_solicitud_pension) as anho,
    persona.indice_calidad_vida,
    persona.fecha_hora_ult_act_jupe,
    persona.numero_tipo_act_jupe
from
    persona
    left join estado_civil on persona.numero_estado_civil = estado_civil.numero_estado_civil
    left join sexo_persona on persona.numero_sexo_persona = sexo_persona.numero_sexo_persona
    left join ubicacion ubicacion1 on ubicacion1.id_ubicacion = persona.id_departamento
    left join ubicacion ubicacion2 on ubicacion2.id_ubicacion = persona.id_distrito
--  left join ubicacion ubicacion3 on ubicacion3.id_ubicacion = persona.id_barrio
    left join condicion_pension on persona.numero_condicion_pension = condicion_pension.numero_condicion_pension
where
    persona.numero_condicion_pension = 5 and persona.fecha_hora_ult_act_jupe is not null
order by
    persona.id_departamento, persona.id_distrito, persona.nombre_persona;
