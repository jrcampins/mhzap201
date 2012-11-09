function concat_or_empty(string1 varchar2, string2 varchar2) return varchar2 is
begin
    if (string1 is null or string2 is null) then
        return '';
    end if;
    return string1 || string2;
end;

function concat_or_empty(string1 varchar2, string2 varchar2, string3 varchar2) return varchar2 is
begin
    if (string1 is null or string2 is null or string3 is null) then
        return '';
    end if;
    return string1 || string2 || string3;
end;   
