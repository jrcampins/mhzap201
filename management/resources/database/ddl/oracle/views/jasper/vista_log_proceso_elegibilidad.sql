CREATE OR REPLACE VIEW vista_log_pro_ver_ele_pen_1
AS select   id_persona, 
            codigo_persona, 
            nombre_persona,
            id_departamento,
            id_distrito,  
            id_barrio ,
            codigo_sime,
            indice_calidad_vida,
            numero_condicion_pension,
            numero_condicion_denu_pen, 
            numero_condicion_reco_pen
   from persona 
   where numero_condicion_pension=1
   or numero_condicion_pension=2
   or numero_condicion_reco_pen=1 
   or numero_condicion_denu_pen=1;

CREATE OR REPLACE VIEW vista_log_pro_ver_ele_pen_2
AS select      id_persona, 
            codigo_persona, 
            nombre_persona, 
            id_departamento,
            id_distrito, 
            id_barrio ,
            codigo_sime,
            indice_calidad_vida,
            numero_condicion_pension,
            numero_condicion_denu_pen, 
            numero_condicion_reco_pen
    from persona 
    where numero_condicion_pension=1
    or numero_condicion_reco_pen=1 
    or numero_condicion_denu_pen=1 ;