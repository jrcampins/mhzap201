procedure dropone(obj_type varchar2, obj_name varchar2) is
    upper_type  varchar2(4000);
    upper_name  varchar2(4000);
    statement   varchar2(4000);
    row_count   number := 0;
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000); -- a character string of at most 2048 bytes
begin
    chk('type', obj_type);
    chk('name', obj_name);
    upper_type := upper(trim(obj_type));
    upper_name := upper(trim(obj_name));
    statement := 'DROP ' || upper_type || ' ' || upper_name;
    if upper_type = 'TABLE' then
        statement := statement || ' CASCADE CONSTRAINTS PURGE ';
        select count(*) into row_count from user_tables where table_name = upper_name;
    elsif upper_type = 'PACKAGE' then
        select count(*) into row_count from user_objects where object_type = upper_type and object_name = upper_name;
    elsif upper_type = 'FUNCTION' then
        select count(*) into row_count from user_objects where object_type = upper_type and object_name = upper_name;
    elsif upper_type = 'PROCEDURE' then
        select count(*) into row_count from user_objects where object_type = upper_type and object_name = upper_name;
    elsif upper_type = 'TRIGGER' then
        select count(*) into row_count from user_triggers where trigger_name = upper_name;
    elsif upper_type = 'VIEW' then 
        select count(*) into row_count from user_views where view_name = upper_name;
    elsif upper_type = 'SEQUENCE' then
        select count(*) into row_count from user_sequences where sequence_name = upper_name;
    end if;
    if row_count > 0 then
        execute immediate statement;
        dbms_output.put_line(statement);
    end if;
end;
