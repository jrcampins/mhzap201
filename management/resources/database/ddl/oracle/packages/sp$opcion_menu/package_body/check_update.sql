function check_update(inferior number, superior number) return number is
    row_opcion_menu opcion_menu%rowtype;
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000); -- a character string of at most 2048 bytes
begin
    dbms_output.put_line(inferior||', '||superior);
    if (superior = inferior) then
        msg_string := 'la opcion superior no puede ser igual a la opcion de menu';
        raise_application_error(err_number, msg_string, true);
    else
        begin
            select * into row_opcion_menu from opcion_menu where id_opcion_menu = superior;
        exception
            when no_data_found then
                msg_string := 'la opcion superior #'||superior||' no esta definida';
                raise_application_error(err_number, msg_string, true);
        end;
        if (row_opcion_menu.id_opcion_menu_superior is null) then
            return 1;
        elsif (row_opcion_menu.id_opcion_menu_superior = inferior) then
            msg_string := 'la opcion superior no puede estar subordinada a la opcion de menu';
            raise_application_error(err_number, msg_string, true);
        else
            return 1 + check_update(inferior, row_opcion_menu.id_opcion_menu_superior);
        end if;	
    end if;
end;
