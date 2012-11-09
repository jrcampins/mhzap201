procedure compile(obj_type varchar2) is
begin
    for obj in (
        select 'ALTER '||object_type||' '||object_name||' COMPILE ' as statement
        from user_objects
        where object_type = upper(trim(obj_type))
        and (object_type <> 'PACKAGE' or object_name <> 'XSP')
        order by object_type, object_name
    )
    loop
        dbms_output.put_line(obj.statement);
        execute immediate obj.statement;
    end loop;
end;
