FUNCTION extract_fecha(d varchar2,m varchar2, a varchar2) return timestamp is

    fecha_retorno timestamp;
begin
    
    fecha_retorno:=concat_fecha(d,m,a);
    return fecha_retorno;
    exception 
        when others then
        return null;
end;