function btrim_or_empty(string1 varchar2) return varchar2 is
begin
    if (string1 is null) then
        return '';
    end if;
    return trim(string1);
end;
