function execute_procedure(routine varchar2, args varchar2) return varchar2 is
    rutina      varchar2(200);
    tipo        varchar2(200);
    comando     varchar2(4000);
    resultado   varchar2(200);
    numero      number;
    texto       varchar2(4000);
    fecha       date;
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000); -- a character string of at most 2048 bytes
begin
    rutina := upper(trim(routine));
    if args is null then
        comando := 'CALL '||rutina||'()';
    else
        comando := 'CALL '||rutina||'('||args||')';
    end if;
    begin
        select object_type into tipo from user_objects where object_name=rutina and object_type in ('PROCEDURE', 'FUNCTION');
    exception
        when no_data_found then
            msg_string := 'la rutina '||rutina||' no existe';
            raise_application_error(err_number, msg_string, true);
    end;
    if tipo = 'PROCEDURE' then
        dbms_output.put_line(comando);
        execute immediate comando;
        return null;
    end if;
    comando := comando||' INTO :RESPUESTA ';
    dbms_output.put_line(comando);
    begin
        select data_type into resultado from user_arguments where object_name=rutina and position=0 and sequence=1 and in_out='OUT' and argument_name is null;
    exception
        when no_data_found then
            msg_string := 'no es posible determinar el tipo de la funcion '||rutina;
            raise_application_error(err_number, msg_string, true);
    end;
    if resultado = 'DATE' then
        execute immediate comando using out fecha;
        dbms_output.put_line(rutina||' = '||fecha);
        return fecha||'';
    end if;
    if resultado = 'NUMBER' then
        execute immediate comando using out numero;
        dbms_output.put_line(rutina||' = '||numero);
        return numero||'';
    end if;
    if resultado = 'VARCHAR2' then
        execute immediate comando using out texto;
        dbms_output.put_line(rutina||' = "'||texto||'"');
        return texto;
    end if;
    msg_string := 'la funcion '||rutina||' es de tipo '||resultado||'; solo se permiten funciones DATE, NUMBER o VARCHAR2';
    raise_application_error(err_number, msg_string, true);
end;
