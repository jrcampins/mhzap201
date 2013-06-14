function actualizar_objeciones(persona_consultada number) return number;
function consultar_objeciones(persona_consultada number) return number;
function concat_codigo(xrow persona%rowtype) return varchar2;
function concat_nombre(xrow persona%rowtype) return varchar2;
function anul_fec_ult_cob_pen(persona_consultada number, comentarios varchar2) return varchar2;
function act_fec_ult_cob_pen(persona_consultada number, fecha_cobro timestamp) return varchar2;
function act_persona_elegible(persona_consultada number) return number;
function consultar_req_pers(persona_consultada number) return number;
function registrar_cer_defun(persona_consultada number, certificado varchar2, fecha_certificado timestamp) return varchar2;
function anular_cer_defun(persona_consultada number) return varchar2;
function objetar_pension(persona_consultada number, numero_causa number, otra_causa varchar2, comentarios varchar2) return varchar2;
function denegar_pension(persona_consultada number, numero_res varchar2, fecha_res timestamp, comentarios varchar2) return varchar2;
function anular_cer_vida(persona_consultada number) return varchar2;
function aprobar_reco_pen(persona_consultada number, comentarios varchar2) return varchar2;
function aprobar_pension(persona_consultada number, comentarios varchar2) return varchar2;
function confirmar_denu_pen(persona_consultada number, numero_causa number, otra_causa varchar2, comentarios varchar2) return varchar2;
function consultar_acr(persona_consultada number) return number;
function consultar_vig_pen(persona_consultada number) return number;
function solicitar_pension(persona_consultada number, comentarios varchar2) return varchar2;
function revocar_pension(persona_consultada number, numero_causa number, otra_causa varchar2, comentarios varchar2) return varchar2;
function registrar_cer_vida(persona_consultada number, certificado varchar2, fecha_certificado timestamp) return varchar2;
function registrar_denu_pen(persona_consultada number, comentarios varchar2) return varchar2;
function solicitar_reco_pen(persona_consultada number, comentarios varchar2) return varchar2;
function denegar_reco_pen(persona_consultada number, numero_causa number, otra_causa varchar2, comentarios varchar2) return varchar2;
function desmentir_denu_pen(persona_consultada number, comentarios varchar2) return varchar2;
function otorgar_pension(persona_consultada number, numero_resolucion varchar2, fecha_resolucion timestamp, comentarios varchar2) return varchar2;
function proc_denu_pen(persona_consultada number) return varchar2;
function proc_reco_pen(persona_consultada number) return varchar2;
function registrar_entrega_doc(persona_consultada number, cert_vida varchar2, fecha_cert_vida timestamp, copia_cedula number, declaracion_jur number) return varchar2;
function verif_ws_sinarh_jupe(cedula  IN  varchar2,id_persona NUMBER)return varchar2;
function get_last_ficha_persona(xrow persona%rowtype) return number;
function anotar(persona_consultada number, usuario_consultado number)return varchar2;
function borrar(usuario_consultado number) return varchar2;
function asignar_reco_pen_sel(usuario_proceso number,sime varchar2) return varchar2;
function solicitar_reco_pen_sel(usuario_proceso number,observaciones varchar2) return varchar2;
function aprobar_reco_pen_sel(usuario_proceso number,observaciones varchar2) return varchar2;
function denegar_reco_pen_sel(usuario_proceso number,observaciones varchar2) return varchar2;