CREATE OR REPLACE FUNCTION extract_fecha(d varchar,m varchar, a varchar) RETURNS timestamp AS $$
declare
    fecha_retorno timestamp;
begin
    if cast( d as integer)>=1 and cast( d as integer)<=31 then
        if cast( d as integer)>=1 and cast( d as integer)<=9 then
            d:='0'||d;
        end if;
    else 
        return null;
    end if;
    if cast( m as integer)>=1 and cast( m as integer)<=12 then
        if cast (m as integer)>=1 and cast (m as integer)<=9 then
            m:='0'||m;
        end if;
    else
        return null;
    end if;
    if cast( a as integer)<=1800 or cast( a as integer)>=2500 then
        return null;
    end if;
    fecha_retorno:=cast(a||m||d as timestamp);
    return fecha_retorno;
    exception 
        when others then
        return null;
end;
$$ LANGUAGE 'plpgsql';