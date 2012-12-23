function bigintid return number is
    ti interval day(9) to second(9);
    dd number;
    hh number;
    mm number;
    ss number;
    nv number;
    id number;
begin
    ti := systimestamp - timestamp'1970-01-01 00:00:00';
    dd := extract(day    from ti);
    hh := extract(hour   from ti);
    mm := extract(minute from ti);
    ss := extract(second from ti);
    nv := x5.nextval;
    id := 100000000*(86400*dd + 3600*hh + 60*mm + ss) + nv;
--  --dbms_output.put_line('ti = '||ti);
--  --dbms_output.put_line('dd = '||dd);
--  --dbms_output.put_line('hh = '||hh);
--  --dbms_output.put_line('mm = '||mm);
--  --dbms_output.put_line('ss = '||ss);
--  --dbms_output.put_line('nv = '||nv);
--  --dbms_output.put_line('id = '||id);
    return id;
end;
