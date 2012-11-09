-- delimiter ??
create or replace function dateadd(fecha timestamp, numero int, intervalo varchar) returns timestamp as $$
/*
    Y	Years
    M	Months
    W	Weeks
    D	Days
    H	Hours
    N	Minutes
    S	Seconds
*/
declare
    intervalos varchar;
begin
    if (fecha is null) then
        return null;
    elseif (numero is null) then
        return null;
    elseif (intervalo is null or length(trim(intervalo)) = 0) then
        intervalos = 'days';
    elseif upper(intervalo) = 'Y' then
        intervalos = 'years';
    elseif upper(intervalo) = 'M' then
        intervalos = 'months';
    elseif upper(intervalo) = 'W' then
        intervalos = 'weeks';
    elseif upper(intervalo) = 'D' then
        intervalos = 'days';
    elseif upper(intervalo) = 'H' then
        intervalos = 'hours';
    elseif upper(intervalo) = 'N' then
        intervalos = 'minutes';
    elseif upper(intervalo) = 'S' then
        intervalos = 'seconds';
    else
        intervalos = lower(intervalo);
    end if;
    return fecha + cast(cast(numero as varchar)||' '||intervalos as interval);
end;
$$ language plpgsql volatile;
-- ??
create or replace function dateadd(fecha timestamp, dias int, meses int, anys int) returns timestamp as $$
begin
    if (fecha is null) then
        return null;
    elseif (dias is not null) then
        return dateadd(fecha, dias,  'days');
    elseif (meses is not null) then
        return dateadd(fecha, meses, 'months');
    elseif (anys is not null) then
        return dateadd(fecha, anys,  'years');
    else
        return null;
    end if;
end;
$$ language plpgsql volatile;
-- ??
