procedure dropall is
begin
    /**/
    for obj in (
        select 'DROP TRIGGER '||trigger_name as statement
        from user_triggers
        order by trigger_name
    )
    loop
        dbms_output.put_line(obj.statement);
        execute immediate obj.statement;
    end loop;
    /**/
    for obj in (
        select 'DROP VIEW '||view_name as statement
        from user_views
        order by view_name
    )
    loop
        dbms_output.put_line(obj.statement);
        execute immediate obj.statement;
    end loop;
    /**/
    for obj in (
        select 'DROP PACKAGE '||object_name as statement
        from user_objects
        where object_type = 'PACKAGE' and object_name <> 'XSP'
        order by object_name
    )
    loop
        dbms_output.put_line(obj.statement);
        execute immediate obj.statement;
    end loop;
    /**/
    for obj in (
        select 'DROP FUNCTION '||object_name as statement
        from user_objects
        where object_type = 'FUNCTION'
        order by object_name
    )
    loop
        dbms_output.put_line(obj.statement);
        execute immediate obj.statement;
    end loop;
    /**/
    for obj in (
        select 'DROP PROCEDURE '||object_name as statement
        from user_objects
        where object_type = 'PROCEDURE'
        order by object_name
    )
    loop
        dbms_output.put_line(obj.statement);
        execute immediate obj.statement;
    end loop;
    /**/
    for obj in (
        select 'DROP TABLE '||table_name||' CASCADE CONSTRAINTS PURGE' as statement
        from user_tables
        order by table_name
    )
    loop
        dbms_output.put_line(obj.statement);
        execute immediate obj.statement;
    end loop;
    /**/
    for obj in (
        select 'DROP SEQUENCE '||sequence_name as statement
        from user_sequences
        order by sequence_name
    )
    loop
        dbms_output.put_line(obj.statement);
        execute immediate obj.statement;
    end loop;
    /**/
end;
