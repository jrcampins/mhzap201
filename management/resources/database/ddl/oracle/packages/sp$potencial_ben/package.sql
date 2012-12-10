function concat_codigo(xrow potencial_ben%rowtype) return varchar2;
function concat_nombre(xrow potencial_ben%rowtype) return varchar2;
function actualizar_condicion_censo(xnew potencial_ben%rowtype) return number;
function desactivar(beneficiario number) return varchar2;
function acreditar( beneficiario_consultado number) return varchar2;
function reactivar(beneficiario number) return varchar2;
function vincular(beneficiario number, persona_vincular number) return varchar2;
function desvincular(beneficiario number) return varchar2;
function validar_censo(beneficiario number, funcionario number, comentarios varchar2) return varchar2;
function invalidar_censo(beneficiario number, funcionario number, numero_causa number, otra_causa varchar2, comentarios varchar2) return varchar2;
function reg_recl_cen(beneficiario_consultado number, comentarios varchar2) return varchar2;
function aprobar_recl_cen(beneficiario_consultado number, comentarios varchar2) return varchar2;
function denegar_recl_cen(beneficiario_consultado number, numero_causa number, otra_causa varchar2, comentarios varchar2) return varchar2;