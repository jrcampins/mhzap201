create or replace function btrim_or_empty(string1 varchar) returns varchar as $$
begin
    if (string1 is null) then
        return '';
    else
        return btrim(string1);
    end if;
end;
$$ language 'plpgsql' volatile called on null input security invoker;
