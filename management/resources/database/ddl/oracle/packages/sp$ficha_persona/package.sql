procedure actualizar_vinculos(xnew ficha_persona%rowtype);
procedure eliminar_vinculos(xold ficha_persona%rowtype);
function verificar_cambio_vinculo(xold ficha_persona%rowtype, xnew ficha_persona%rowtype) return number;
function concat_codigo(xrow ficha_persona%rowtype) return varchar2;
function concat_nombre(xrow ficha_persona%rowtype) return varchar2;
function extract_id_persona(xrow ficha_persona%rowtype) return number;
function desvincular(ficha number) return varchar2;
function vincular(ficha number, beneficiario number) return varchar2;
