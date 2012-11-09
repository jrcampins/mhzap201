function years_between(hasta timestamp, desde timestamp) return number is
begin
    return trunc(months_between(hasta, desde) / 12);
end;

function years_since(desde timestamp) return number is
begin
    return years_between(sysdate, desde);
end;
