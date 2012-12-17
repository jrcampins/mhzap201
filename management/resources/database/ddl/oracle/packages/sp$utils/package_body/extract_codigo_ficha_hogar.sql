function extract_codigo_ficha_hogar(p01a varchar2,p01b varchar2,p01c varchar2,p01d varchar2,p02 varchar2,p03 varchar2) return varchar2 is
    retorno varchar2(60);
begin
    retorno:=p01a||p01b||p01c||p01d||p02||p03;
    if retorno = null then
        retorno:=utils.bigintid();
    end if;
    return retorno;
end;