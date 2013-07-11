CREATE OR REPLACE VIEW ficha_persona_no_importada
AS
select
    es_ficha_persona_importada,
    observacion,
    fecha_importacion,
    extract(year from fecha_importacion) AS anho, 
    id,
    fuente,
    codigo_ficha,
    cedula,
    nombre_persona,
    edad,
    parentesco,
    nombre_archivo
from 
((select l.id_log_imp_per as id,
         'SAS' as fuente,
         l.P01A||'-'||l.P01B||'-'||l.P01C||'-'||l.P01D||'-'||l.P02||'-'||l.P03||'-'||l.p43 as codigo_ficha,
         l.p51 as cedula,
         l.P45A||' '||l.P45B||' '||l.P44A||' '||l.P44B as nombre_persona,
         l.P46 as edad,
         l.P48 as parentesco,
         l.es_importado as es_ficha_persona_importada,
         case when l.es_importado=1 then 'SI' else 'NO' end as si_no_importado,
         l.observacion,
         to_date(l.fecha_hora_transaccion) as fecha_importacion,
         l.nombre_archivo as nombre_archivo
  from log_imp_per l 
  where l.es_importado!=1) union 
(select l.id_log_imp_per_eec as id,
        'DGEEC' as fuente,
        l.dptod||'-'||l.distritod||'-'||l.barrio||'-'||l.formulario||'-'||l.vivi||'-'||l.hogar||'-'||l.orden as codigo_ficha,
        l.P37_cedula as cedula,
        l.P30||' '||l.P31 as nombre_persona,
        l.P32 as edad,
        l.P34 as parentesco,
        l.es_importado as es_ficha_persona_importada,
        case when l.es_importado=1 then 'SI' else 'NO' end as si_no_importado,
        l.observacion,
        to_date(l.fecha_hora_transaccion) as fecha_importacion,
        l.nombre_archivo as nombre_archivo
  from log_imp_per_eec l 
  where l.es_importado!=1))
  order by nombre_archivo,nombre_persona,codigo_ficha;