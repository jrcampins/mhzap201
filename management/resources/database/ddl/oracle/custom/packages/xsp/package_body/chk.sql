procedure chk(xlabel varchar2, xvalue number)
is
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000); -- a character string of at most 2048 bytes
begin
    if xvalue is null then
        msg_string := 'Illegal Argument Exception (' || trim(nvl(xlabel, '?')) || ')';
        raise_application_error(err_number, msg_string, true);
    end if;
end;

procedure chk(xlabel varchar2, xvalue varchar2)
is
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000); -- a character string of at most 2048 bytes
begin
    if xvalue is null then
        msg_string := 'Illegal Argument Exception (' || trim(nvl(xlabel, '?')) || ')';
        raise_application_error(err_number, msg_string, true);
    end if;
    if length(trim(xvalue)) = 0 then
        msg_string := 'Illegal Argument Exception (' || trim(nvl(xlabel, '?')) || ' = "' || xvalue || '")';
        raise_application_error(err_number, msg_string, true);
    end if;
end;
