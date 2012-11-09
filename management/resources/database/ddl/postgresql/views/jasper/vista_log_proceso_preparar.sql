CREATE OR REPLACE VIEW vista_log_pro_pre_pro_pag
AS select null, id_persona, codigo_persona, nombre_persona, 
          id_distrito, id_departamento, id_barrio , numero_condicion_pension, fecha_solicitud_pension,
          numero_condicion_denu_pen, numero_condicion_reco_pen
          from persona 
          where (numero_condicion_pension=1
           or numero_condicion_pension=5
           or numero_condicion_reco_pen=1 
           or numero_condicion_denu_pen=1);
