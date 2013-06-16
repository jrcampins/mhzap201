-- OJO: se elimino el null que estaba como primera columna del select
CREATE OR REPLACE VIEW vista_log_pro_pre_pro_pag
AS select id_persona, codigo_persona, nombre_persona, 
          id_departamento, id_distrito, id_barrio , numero_condicion_pension, fecha_solicitud_pension,
          numero_condicion_denu_pen, numero_condicion_reco_pen,codigo_sime
          from persona 
          where (numero_condicion_pension=1
           or numero_condicion_pension=5
           or numero_condicion_reco_pen=1 
           or numero_condicion_denu_pen=1);
