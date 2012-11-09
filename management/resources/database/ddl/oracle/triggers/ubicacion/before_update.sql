create or replace trigger ubicacion_before_update
for update of id_ubicacion_superior on ubicacion
compound trigger
    type tabla_bigints is table of ubicacion.id_ubicacion%type      index by binary_integer;
    type tabla_codigos is table of ubicacion.codigo_ubicacion%type  index by binary_integer;
    type tabla_nombres is table of ubicacion.nombre_ubicacion%type  index by binary_integer;

    inferior    tabla_bigints;
    superior    tabla_bigints;
    codigo      tabla_codigos;
    nombre      tabla_nombres;
    indice      binary_integer := 0;
    nivel       number;
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000); -- a character string of at most 2048 bytes

before each row is
begin
    dbms_output.put_line('before row '||:new.id_ubicacion
        ||' ('||:old.id_ubicacion_superior||','||:new.id_ubicacion_superior||') ');
end before each row;

after each row is
begin
    dbms_output.put_line('after  row '||:new.id_ubicacion
        ||' ('||:old.id_ubicacion_superior||','||:new.id_ubicacion_superior||') ');
    if (:new.id_ubicacion_superior is not null and :new.id_ubicacion is not null) then
        if (:old.id_ubicacion_superior is null or :old.id_ubicacion_superior <> :new.id_ubicacion_superior) then
            if (:new.id_ubicacion_superior = :new.id_ubicacion) then
                msg_string := 'la ubicacion superior no puede ser igual a la ubicacion';
                msg_string := msg_string||'; no es posible actualizar la ubicacion #'||:new.id_ubicacion
                    ||', codigo "'||:new.codigo_ubicacion||'"'||', "'||:new.nombre_ubicacion||'"';
                raise_application_error(err_number, msg_string, true);
            else
                indice           := indice + 1;
                inferior(indice) := :new.id_ubicacion;
                superior(indice) := :new.id_ubicacion_superior;
                codigo(indice)   := :new.codigo_ubicacion;
                nombre(indice)   := :new.nombre_ubicacion;
                dbms_output.put_line(indice||', '||inferior(indice)||', '||superior(indice)
                    ||', '||codigo(indice)||', '||nombre(indice));
            end if;
        end if;
    end if;
end after each row;

after statement is
begin
    indice := 0;
    msg_string := '';
    dbms_output.put_line('after  statement (count='||inferior.count||') ');
    for i in 1..inferior.count
    loop
        indice := i;
        dbms_output.put_line('after  row '||i||', '||inferior(i)||', '||superior(i));
        nivel := sp$ubicacion.check_update(inferior(i), superior(i));
        dbms_output.put_line('nivel('||inferior(i)||', '||superior(i)||') = '||nivel);
    end loop;
exception
    when others then
        msg_string := trim(replace(replace(replace(DBMS_UTILITY.FORMAT_ERROR_STACK,
            chr(13), ''), chr(10), ''), 'ORA'||err_number||':', ''));
        if (indice >= 1 and indice <= inferior.count) then
            msg_string := msg_string||'; no es posible actualizar la ubicacion #'||inferior(indice)
                ||', codigo "'||codigo(indice)||'"'||', "'||nombre(indice)||'"';
        end if;
        raise_application_error(err_number, msg_string, true);
end after statement;

end ubicacion_before_update;
/
show errors
