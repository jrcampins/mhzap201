alter table log_imp_per add (id_ficha_persona number);
alter table log_imp_per_eec add (id_ficha_persona number);
alter table log_imp_ids add (id_persona number);
alter table log_imp_pot add (id_potencial_ben number);
alter table log_imp_per add CONSTRAINT fk_log_imp_per_001
    FOREIGN KEY (id_ficha_persona)
    REFERENCES ficha_persona(id_ficha_persona);
alter table log_imp_per_eec add CONSTRAINT fk_log_imp_per_eec_001
    FOREIGN KEY (id_ficha_persona)
    REFERENCES ficha_persona(id_ficha_persona);
alter table log_imp_ids add CONSTRAINT fk_log_imp_ids_001
    FOREIGN KEY (id_persona)
    REFERENCES persona(id_persona);
alter table log_imp_pot add CONSTRAINT fk_log_imp_pot_001
    FOREIGN KEY (id_potencial_ben)
    REFERENCES potencial_ben(id_potencial_ben);


CREATE OR REPLACE VIEW ficha_persona_importada
AS
SELECT
    id_departamento,
    nombre_departamento,
    id_distrito,
    nombre_distrito,
    id_barrio,
    nombre_barrio,
    es_ficha_persona_importada,
    si_no_importado,
    fecha_importacion,
    extract(year from fecha_importacion) AS anho, 
    id,
    fuente,
    codigo_ficha_persona,
    cedula,
    nombre_persona,
    edad,
    parentesco,
    icv,
    codigo_potencial_ben
FROM 
((select l.id_log_imp_per as id,
         'SAS' as fuente,
         fp.numero_cedula as cedula,
         fp.primer_nombre||' '||fp.primer_apellido as nombre_persona,
         fp.edad as edad,
         fp.numero_tipo_persona_hogar,
         tph.codigo_tipo_persona_hogar as parentesco,
         l.es_importado as es_ficha_persona_importada,
         case when l.es_importado=1 then 'SI' else 'NO' end as si_no_importado,
         l.observacion,
         to_date(l.fecha_hora_transaccion) as fecha_importacion,
         dp.id_ubicacion as id_departamento,
         dp.nombre_ubicacion as nombre_departamento,
         dt.id_ubicacion as id_distrito,
         dt.nombre_ubicacion as nombre_distrito,
         br.id_ubicacion as id_barrio,
         br.nombre_ubicacion as nombre_barrio,
         fp.codigo_ficha_persona,
         fp.id_potencial_ben,
         fh.indice_calidad_vida as icv,
         pb.codigo_potencial_ben
  from log_imp_per l 
  left join ficha_persona fp on l.id_ficha_persona=fp.id_ficha_persona
  left join ficha_hogar fh on fp.id_ficha_hogar=fh.id_ficha_hogar
  left join ubicacion dp on fh.id_departamento=dp.id_ubicacion
  left join ubicacion dt on fh.id_distrito=dt.id_ubicacion
  left join ubicacion br on fh.id_barrio= br.id_ubicacion
  left join potencial_ben pb on fp.id_potencial_ben=pb.id_potencial_ben
  left join tipo_persona_hogar tph on fp.numero_tipo_persona_hogar=tph.numero_tipo_persona_hogar) union 
(select l.id_log_imp_per_eec as id,
        'DGEEC' as fuente,
        fp.numero_cedula as cedula,
        fp.primer_nombre||' '||fp.primer_apellido as nombre_persona,
        fp.edad as edad,
        fp.numero_tipo_persona_hogar,
        tph.codigo_tipo_persona_hogar as parentesco,
        l.es_importado as es_ficha_persona_importada,
        case when l.es_importado=1 then 'SI' else 'NO' end as si_no_importado,
        l.observacion,
        to_date(l.fecha_hora_transaccion) as fecha_importacion,
        dp.id_ubicacion as id_departamento,
        dp.nombre_ubicacion as nombre_departamento,
        dt.id_ubicacion as id_distrito,
        dt.nombre_ubicacion as nombre_distrito,
        br.id_ubicacion as id_barrio,
        br.nombre_ubicacion as nombre_barrio,
        fp.codigo_ficha_persona,
        fp.id_potencial_ben,
        fh.indice_calidad_vida as icv,
        pb.codigo_potencial_ben
  from log_imp_per_eec l 
  left join ficha_persona fp on l.id_ficha_persona=fp.id_ficha_persona
  left join ficha_hogar fh on fp.id_ficha_hogar=fh.id_ficha_hogar
  left join ubicacion dp on fh.id_departamento=dp.id_ubicacion
  left join ubicacion dt on fh.id_distrito=dt.id_ubicacion
  left join ubicacion br on fh.id_barrio= br.id_ubicacion
  left join potencial_ben pb on fp.id_potencial_ben=pb.id_potencial_ben
  left join tipo_persona_hogar tph on fp.numero_tipo_persona_hogar=tph.numero_tipo_persona_hogar))
  order by nombre_departamento, nombre_distrito, nombre_barrio, id, nombre_persona, cedula, fecha_importacion;