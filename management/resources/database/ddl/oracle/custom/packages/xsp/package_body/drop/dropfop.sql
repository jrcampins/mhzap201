procedure dropfop(obj_name varchar2) is
    upper_name  varchar2(4000);
    upper_type  varchar2(4000);
    statement   varchar2(4000);
    row_count   number := 0;
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000); -- a character string of at most 2048 bytes
begin
    chk('name', obj_name);
    upper_name := upper(trim(obj_name));
    msg_string := 'DROP ' || upper_name || ' failed. ';
    select object_type into upper_type from user_objects where object_name = upper_name;
    if SQL%FOUND then
        if upper_type = 'FUNCTION' or upper_type = 'PROCEDURE' then
            statement := 'DROP ' || upper_type || ' ' || upper_name;
            execute immediate statement;
            msg_string := statement || ' successfully executed. ';
            dbms_output.put_line(msg_string);
        else
            dbms_output.put_line(msg_string);
            msg_string := 'Why? ' || upper_name || ' is a ' || upper_type || '. ';
            dbms_output.put_line(msg_string);
        end if;
    end if;
exception
  when no_data_found then
    dbms_output.put_line(msg_string);
    msg_string := 'Why? ' || upper_name || ' is not a defined user object. ';
    dbms_output.put_line(msg_string);
end;
