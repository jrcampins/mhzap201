CREATE OR REPLACE FUNCTION extract_codigo_ficha_hogar(p01a varchar,p01b varchar,p01c varchar,p01d varchar,p02 varchar,p03 varchar) returns varchar as $$
declare
    retorno varchar;
begin
    retorno:=p01a||p01b||p01c||p01d||p02||p03;
    if retorno = null then
        retorno:=bigintid();
    end if;
    return retorno;
end;
$$ LANGUAGE 'plpgsql';