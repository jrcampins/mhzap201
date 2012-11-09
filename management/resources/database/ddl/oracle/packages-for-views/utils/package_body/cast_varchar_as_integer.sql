function cast_varchar_as_integer(x varchar2) return number is
    y number;
begin
    select cast(x as number) into y from dual;
    return y;
exception
    when others then
        return null;
end;
