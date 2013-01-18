create or replace view cuadro_resumen_1 as
select
potencial_ben.id_barrio,
extract(year from potencial_ben.fecha_registro_pot_ben) AS anho,
case when numero_condicion_censo=1 or numero_condicion_censo=5 then 1 else 0 end as por_censar,
case when numero_condicion_censo=5 then 1 else 0 end as censado,
case when numero_condicion_censo=1 then 1 else 0 end as no_censado,
case when fh.indice_calidad_vida<=(area.limite_indice_calidad_vida) and (numero_condicion_censo=5 or numero_condicion_censo=3) then 1 else 0 end as pot_ben,
case when fh.indice_calidad_vida<=(area.limite_indice_calidad_vida) and (numero_condicion_censo=5 or numero_condicion_censo=3) and numero_tipo_reg_pot_ben=1 then 1 else 0 end as pot_ben_con_cedula,
case when fh.indice_calidad_vida<=(area.limite_indice_calidad_vida) and (numero_condicion_censo=5 or numero_condicion_censo=3) and numero_tipo_reg_pot_ben=2 then 1 else 0 end as pot_ben_sin_cedula,
case when fh.indice_calidad_vida>(area.limite_indice_calidad_vida) and (numero_condicion_censo=5 or numero_condicion_censo=3) then 1 else 0 end as no_pot_ben,
case when numero_condicion_censo=3 or numero_condicion_censo=5 then 1 else 0 end as censado_validado,
case when fh.indice_calidad_vida<=(area.limite_indice_calidad_vida) and (numero_condicion_censo=5 or numero_condicion_censo=3) and numero_tipo_reg_pot_ben=1 and persona.es_persona_elegible_para_pen=1 then 1 else 0 end as ben_elegible,
case when fh.indice_calidad_vida<=(area.limite_indice_calidad_vida) and (numero_condicion_censo=5 or numero_condicion_censo=3) and numero_tipo_reg_pot_ben=1 and persona.es_persona_elegible_para_pen=0 then 1 else 0 end as ben_no_elegible,
case when numero_condicion_censo=2 then 1 else 0 end as por_validar,
case when numero_condicion_censo=3 then 1 else 0 end as validado,
case when numero_condicion_censo=4 then 1 else 0 end as invalidado
from potencial_ben
left join persona on  potencial_ben.id_persona=persona.id_persona
left join ficha_persona fp on potencial_ben.id_ficha_persona=fp.id_ficha_persona
left join ficha_hogar fh on fp.id_ficha_hogar=fh.id_ficha_hogar
left join ubicacion barrio on potencial_ben.id_barrio=barrio.id_ubicacion
left join tipo_area area on barrio.numero_tipo_area=area.numero_tipo_area
order by 1;

create or replace view cuadro_resumen_2 as
select
id_barrio,
anho,
sum(por_censar) as total_por_censar,
sum(censado) as total_censados,
sum(no_censado) as total_no_censados,
sum(pot_ben) as total_pot_ben,
sum(pot_ben_con_cedula) as total_pot_ben_con_cedula,
sum(pot_ben_sin_cedula) as total_pot_ben_sin_cedula,
sum(no_pot_ben) as total_no_pot_ben,
sum(censado_validado) as total_censado_validado,
sum(ben_elegible) as total_ben_elegible,
sum(ben_no_elegible) as total_ben_no_elegible,
sum(por_validar) as total_por_validar,
sum(validado) as total_validado,
sum(invalidado) as total_invalidado
from cuadro_resumen_1
group by anho,id_barrio
order by 1;

create or replace view cuadro_resumen_3 as
select anho,
departamento.nombre_ubicacion as departamento,
departamento.id_ubicacion as id_departamento,
distrito.nombre_ubicacion as distrito,
distrito.id_ubicacion as id_distrito,
barrio.nombre_ubicacion as barrio,
barrio.id_ubicacion as id_barrio,
area.numero_tipo_area as numero_tipo_area,
area.codigo_tipo_area as codigo_tipo_area,
total_por_censar,
total_censados,
total_no_censados,
total_pot_ben,
total_pot_ben_con_cedula,
total_pot_ben_sin_cedula,
total_no_pot_ben,
total_censado_validado,
total_ben_elegible,
total_ben_no_elegible,
total_por_validar,
total_validado,
total_invalidado
from cuadro_resumen_2 
left join ubicacion barrio on cuadro_resumen_2.id_barrio=barrio.id_ubicacion
left join ubicacion distrito on barrio.id_ubicacion_superior=distrito.id_ubicacion
left join ubicacion departamento on distrito.id_ubicacion_superior=departamento.id_ubicacion
left join tipo_area area on barrio.numero_tipo_area=area.numero_tipo_area;