create or replace trigger ficha_hogar_before_insert
before insert on ficha_hogar
for each row
declare
    xnew ficha_hogar%rowtype;
begin
    /**/
    xnew.id_ficha_hogar := :new.id_ficha_hogar;                                
    xnew.version_ficha_hogar := :new.version_ficha_hogar;                      
    xnew.codigo_ficha_hogar := :new.codigo_ficha_hogar;                        
    xnew.fecha_entrevista := :new.fecha_entrevista;                            
    xnew.id_funcionario_censista := :new.id_funcionario_censista;              
    xnew.id_funcionario_supervisor := :new.id_funcionario_supervisor;          
    xnew.id_funcionario_critico_deco := :new.id_funcionario_critico_deco;      
    xnew.id_funcionario_digitador := :new.id_funcionario_digitador;            
    xnew.observaciones := :new.observaciones;                                  
    xnew.huso_utm := :new.huso_utm;                                            
    xnew.franja_utm := :new.franja_utm;                                        
    xnew.distancia_este_utm := :new.distancia_este_utm;                        
    xnew.distancia_norte_utm := :new.distancia_norte_utm;                      
    xnew.numero_formulario := :new.numero_formulario;                          
    xnew.numero_vivienda := :new.numero_vivienda;                              
    xnew.numero_hogar := :new.numero_hogar;                                    
    xnew.id_departamento := :new.id_departamento;                              
    xnew.id_distrito := :new.id_distrito;                                      
    xnew.numero_tipo_area := :new.numero_tipo_area;                            
    xnew.id_barrio := :new.id_barrio;                                          
    xnew.id_manzana := :new.id_manzana;                                        
    xnew.manzana := :new.manzana;                                              
    xnew.direccion := :new.direccion;                                          
    xnew.total_personas := :new.total_personas;                                
    xnew.total_hombres := :new.total_hombres;                                  
    xnew.total_mujeres := :new.total_mujeres;                                  
    xnew.numero_tipo_mat_paredes := :new.numero_tipo_mat_paredes;              
    xnew.numero_tipo_mat_piso := :new.numero_tipo_mat_piso;                    
    xnew.numero_tipo_mat_techo := :new.numero_tipo_mat_techo;                  
    xnew.numero_tipo_ocupacion_viv := :new.numero_tipo_ocupacion_viv;          
    xnew.otro_tipo_ocupacion_viv := :new.otro_tipo_ocupacion_viv;              
    xnew.cantidad_piezas := :new.cantidad_piezas;                              
    xnew.cantidad_dormitorios := :new.cantidad_dormitorios;                    
    xnew.numero_siono_pieza_cocina := :new.numero_siono_pieza_cocina;          
    xnew.numero_tipo_combustible := :new.numero_tipo_combustible;              
    xnew.numero_tipo_pieza_bano := :new.numero_tipo_pieza_bano;                
    xnew.numero_tipo_servicio_san := :new.numero_tipo_servicio_san;            
    xnew.numero_tipo_servicio_agua := :new.numero_tipo_servicio_agua;          
    xnew.numero_tipo_aba_agua := :new.numero_tipo_aba_agua;                    
    xnew.numero_siono_corriente_elec := :new.numero_siono_corriente_elec;      
    xnew.numero_tipo_desecho_bas := :new.numero_tipo_desecho_bas;              
    xnew.numero_siono_telefono_celular := :new.numero_siono_telefono_celular;  
    xnew.numero_telefono_celular := :new.numero_telefono_celular;              
    xnew.numero_siono_tlf_linea_baja := :new.numero_siono_tlf_linea_baja;      
    xnew.numero_telefono_linea_baja := :new.numero_telefono_linea_baja;        
    xnew.numero_siono_disp_heladera := :new.numero_siono_disp_heladera;        
    xnew.numero_siono_disp_lavarropas := :new.numero_siono_disp_lavarropas;    
    xnew.numero_siono_disp_termo := :new.numero_siono_disp_termo;              
    xnew.numero_siono_disp_aire_acon := :new.numero_siono_disp_aire_acon;      
    xnew.numero_siono_disp_automovil := :new.numero_siono_disp_automovil;      
    xnew.numero_siono_disp_camion := :new.numero_siono_disp_camion;            
    xnew.numero_siono_disp_motocicleta := :new.numero_siono_disp_motocicleta;  
    xnew.nombre_jefe_hogar := :new.nombre_jefe_hogar;                          
    xnew.numero_cedula_jefe_hogar := :new.numero_cedula_jefe_hogar;            
    xnew.letra_cedula_jefe_hogar := :new.letra_cedula_jefe_hogar;              
    xnew.numero_orden_iden_jefe_hogar := :new.numero_orden_iden_jefe_hogar;    
    xnew.nombre_respondente := :new.nombre_respondente;                        
    xnew.numero_cedula_respondente := :new.numero_cedula_respondente;          
    xnew.letra_cedula_respondente := :new.letra_cedula_respondente;            
    xnew.numero_orden_iden_respondente := :new.numero_orden_iden_respondente;  
    xnew.id_proveedor_dat_ext := :new.id_proveedor_dat_ext;                    
    xnew.indice_calidad_vida := :new.indice_calidad_vida;                      
    xnew.es_ficha_hogar_inactiva := :new.es_ficha_hogar_inactiva;              
    /**/
    :new.codigo_ficha_hogar := sp$ficha_hogar.concat_codigo(xnew);
end;
/
show errors
