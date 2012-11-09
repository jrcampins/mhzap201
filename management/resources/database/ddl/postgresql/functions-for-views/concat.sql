create or replace function concat_or_empty(string1 varchar, string2 varchar) returns varchar as $$
begin
    if (string1 is null or string2 is null) then
        return '';
    else
        return string1 || string2;
    end if;
end;
$$ language 'plpgsql' volatile called on null input security invoker;

create or replace function concat_or_empty(string1 varchar, string2 varchar, string3 varchar) returns varchar as $$
begin
    if (string1 is null or string2 is null or string3 is null) then
        return '';
    else
        return string1 || string2 || string3;
    end if;
end;
$$ language 'plpgsql' volatile called on null input security invoker;
