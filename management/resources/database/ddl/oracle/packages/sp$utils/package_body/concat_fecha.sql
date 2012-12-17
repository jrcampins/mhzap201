FUNCTION concat_fecha(d varchar2,m varchar2, a varchar2) RETURN timestamp IS
    fecha_retorno timestamp;
    dd varchar2(4);
    mm varchar2(4);
    aaaa varchar2(8);
begin
    if to_number(d)>=1 and to_number(d)<=31 then
        if to_number(d)>=1 and to_number(d)<=9 then
            dd:='0'||d;
        else
            dd:=d;
        end if;
    else 
        return null;
    end if;
    if to_number(m)>=1 and to_number(m)<=12 then
        if to_number(m)>=1 and to_number(m)<=9 then
            mm:='0'||m;
        else 
            mm:=m;
        end if;
    else
        return null;
    end if;
    if cast( a as number)<=1800 or cast( a as number)>=2500 then
        return null;
    else
        aaaa:=a;
    end if;
    fecha_retorno:=to_date(aaaa||mm||dd, 'yyyymmdd');
    return fecha_retorno;
exception 
        when others then
        return null;
end;