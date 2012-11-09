CREATE OR REPLACE VIEW vista_log_pro_acr_pot_ben
AS select null,pb.id_potencial_ben, pb.nombre_potencial_ben, pb.codigo_potencial_ben, pb.fecha_registro_pot_ben,
          p.id_persona,p.nombre_persona,p.codigo_persona,
          fh.id_distrito,fh.id_departamento,fh.id_barrio,
          fp.id_ficha_persona,fp.codigo_ficha_persona,fp.nombre_ficha_persona,
          fh.id_ficha_hogar,fh.codigo_ficha_hogar,fh.indice_calidad_vida
    from potencial_ben pb 
        left join persona p on pb.id_persona=p.id_persona 
        left join ficha_persona fp on pb.id_ficha_persona=fp.id_ficha_persona
        left join ficha_hogar fh on fp.id_ficha_hogar=fh.id_ficha_hogar
    where p.es_persona_acreditada_para_pen=0
      and pb.es_potencial_ben_inactivo=0
      and (pb.numero_condicion_censo=3 or pb.numero_condicion_censo=5)
      and pb.id_ficha_persona is not null;
