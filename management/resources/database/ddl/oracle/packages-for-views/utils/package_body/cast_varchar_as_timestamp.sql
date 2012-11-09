function cast_varchar_as_timestamp(v varchar2) return timestamp is
    x varchar2(100);
    y timestamp;
    l number;
    d2 varchar2(100);
    m2 varchar2(100);
    a4 varchar2(100);
    h2 varchar2(100) := '00';
    n2 varchar2(100) := '00';
    s2 varchar2(100) := '00';
    xm varchar2(100) := '';
    xs varchar2(100) := '';
    ts varchar2(100);
begin
    y := null;
    if v is not null then
        x := trim(v);
        l := length(x);
        if l >= 10 then
            d2 := substr(x, 1, 2);
            m2 := substr(x, 4, 2);
            a4 := substr(x, 7, 4);
            ts := a4 || '-' || m2 || '-' || d2;
            if l >= 16 then
                h2 := substr(x, 12, 2);
                n2 := substr(x, 15, 2);
                ts := ts || ' ' || h2 || ':' || n2;
                if l >= 19 then
                    s2 := substr(x, 18, 2);
                    xs := upper(s2);
                    if xs = 'AM' or xs = 'PM' then
                        ts := ts || ' ' || xs;
                    else
                        ts := ts || ':' || s2;
                    end if;
                    if l >= 22 then
                        xm := substr(x, 21, 2);
                        ts := ts || ' ' || xm;
                    end if;
                end if;
            end if;
            select cast(ts as timestamp) into y from dual;
        end if;
    end if;
    return y;
exception
    when others then
        return null;
end;
