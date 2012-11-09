create or replace trigger rol_before_update
before update on rol
for each row
declare
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000); -- a character string of at most 2048 bytes
begin
    if (:old.id_rol < 1000000000000) then
        msg_string := 'no se permite modificar un rol de configuracion basica del sistema';
        raise_application_error(err_number, msg_string, true);
    end if;
end;
/
show errors
