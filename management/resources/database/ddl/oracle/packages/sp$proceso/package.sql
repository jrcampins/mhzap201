function acreditar_pot_ben(ubicacion number,fecha_registro_desde timestamp, fecha_registro_hasta timestamp) return varchar2;
function verificar_ele_pen(ubicacion_consultada number) return varchar2;
function preparar_prox_pago_pen(ubicacion_consultada number,fecha_solicitud_desde timestamp, fecha_solicitud_hasta timestamp) return varchar2;
function otorgar_pensiones_apr(ubicacion_consultada number,numero_resolucion varchar2, fecha_resolucion timestamp) return varchar2;