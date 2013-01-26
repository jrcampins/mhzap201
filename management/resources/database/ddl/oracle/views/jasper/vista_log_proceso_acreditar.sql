-- OJO: se elimino el null que estaba como primera columna del select
CREATE OR REPLACE VIEW vista_log_pro_acr_pot_ben
AS select pb.id_potencial_ben, pb.nombre_potencial_ben, pb.codigo_potencial_ben, pb.fecha_registro_pot_ben,
          p.id_persona,p.nombre_persona,p.codigo_persona,
          pb.id_departamento,pb.id_distrito,pb.id_barrio,
          fp.id_ficha_persona,fp.codigo_ficha_persona,fp.nombre_ficha_persona,
          fh.id_ficha_hogar,fh.codigo_ficha_hogar,pb.indice_calidad_vida
    from potencial_ben pb 
        left join persona p on pb.id_persona=p.id_persona 
        left join ficha_persona fp on pb.id_ficha_persona=fp.id_ficha_persona
        left join ficha_hogar fh on fp.id_ficha_hogar=fh.id_ficha_hogar
    where p.es_persona_acreditada_para_pen=0
      and pb.es_potencial_ben_inactivo=0
      and (pb.numero_condicion_censo=3 or pb.numero_condicion_censo=5)
      and pb.indice_calidad_vida is not null;
