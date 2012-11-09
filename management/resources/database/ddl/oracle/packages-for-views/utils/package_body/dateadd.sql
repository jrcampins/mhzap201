function dateadd(fecha timestamp, numero number, intervalo varchar2) return timestamp is
/*
    intervalo debe ser:
        Y = Years
        M = Months
        W = Weeks
        D = Days
        H = Hours
        N = Minutes
        S = Seconds
*/
    intervalo2  varchar2(100);
--  intervalo3  varchar2(100);
    y2m_string  varchar2(100) := '0-0';
    d2s_string  varchar2(100) := '0 0:0:0.0';
    y2m         interval year(9) to month;
    d2s         interval  day(9) to second;
begin
    intervalo2 := upper(trim(nvl(intervalo, '')));
    if (fecha is null) then
        return null;
    elsif (numero is null) then
        return fecha;
    elsif (length(intervalo2) = 0) then
--      intervalo3 := 'day';
        d2s_string := numero || ' 0:0:0.0';        
    elsif intervalo2 = 'Y' then
--      intervalo3 := 'year';
        y2m_string := numero || '-0';        
    elsif intervalo2 = 'M' then
--      intervalo3 := 'month';
        y2m_string := '0-' || numero;        
    elsif intervalo2 = 'W' then
--      intervalo3 := 'day';
        d2s_string := (7 * numero) || ' 0:0:0.0';        
    elsif intervalo2 = 'D' then
--      intervalo3 := 'day';
        d2s_string := numero || ' 0:0:0.0';        
    elsif intervalo2 = 'H' then
--      intervalo3 := 'hour';
        d2s_string := '0 ' || numero || ':0:0.0';        
    elsif intervalo2 = 'N' then
--      intervalo3 := 'minute';
        d2s_string := '0 0:' || numero || ':0.0';        
    elsif intervalo2 = 'S' then
--      intervalo3 := 'second';
        d2s_string := '0 0:0:' || numero || '.0'; 
    else       
        return fecha;
    end if;
    select cast(y2m_string as interval year(9) to month)  into y2m from dual;
    select cast(d2s_string as interval  day(9) to second) into d2s from dual;
    return fecha + y2m + d2s;
end;

function dateadd(fecha timestamp, dias number, meses number, anys number) return timestamp is
begin
    if (fecha is null) then
        return null;
    elsif (dias is null and meses is null and anys is null) then
        return fecha;
    else
        return dateadd(dateadd(dateadd(fecha, dias, 'd'), meses, 'm'), anys, 'y');
    end if;
end;

