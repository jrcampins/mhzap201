create or replace function check_procedure(sp varchar2) return number is
    id number := 0;
begin
    begin
        select object_id into id from user_objects
        where object_type in ('FUNCTION', 'PROCEDURE') and object_name = upper(trim(sp));
    exception
        when no_data_found then
            dbms_output.put_line('"' || sp || '" no es un nombre de funcion o procedimiento valido ');
        end;
    /**/
    return id;
end;
/
show errors
