select *
from xdbscripttables x1
where colname in (select colname from xdbscripttables x2 where x2.colname=x1.colname and x2.coltype<>x1.coltype)
order by colname, coltype, tabname

/*

*.importado				-> es_importado
*.procesado				-> es_procesado
*.fecha_transaccion			-> fecha_hora_transaccion

log_imp_fal.fecha_defuncion		-> defuncion

log_imp_ids.fecha_nacimiento		-> nacimiento
log_imp_ids.es_indigena			-> indigena

log_imp_pot.edad                        -> edad_a_la_fecha
log_imp_pot.fecha_nacimiento		-> nacimiento
log_imp_pot.numero_cedula		-> cedula
log_imp_pot.numero_telefono		-> telefono
log_imp_pot.numero_telefono_referente	-> telefono_referente

log_imp_ubi.id_reg                      -> id_log_imp_ubi

log_pro_imp_arc_ext.codigo_proveedor_dat_ext integer -> varchar

*/
