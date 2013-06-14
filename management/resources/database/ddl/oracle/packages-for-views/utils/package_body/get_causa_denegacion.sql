function get_causa_denegacion(persona_consultada number) return varchar2 is
    row_persona persona%rowtype;
    condicion number;
    codigo_causa varchar2(60);
    mensaje varchar2(4000):='';
begin
    begin
        select * into row_persona from persona where id_persona=persona_consultada;
    exception when no_data_found then null;
    end;
    if not sql%found then
        return mensaje;
    end if;
    --Solo se hace para personas con pensión denegada
    if row_persona.numero_condicion_pension is null or row_persona.numero_condicion_pension!=6 then
        return mensaje;
    end if;
    --Se identifica la condicion
    condicion:=row_persona.numero_causa_den_pension;
    --dbms_output.put_line('condicion '||condicion);
    if condicion=99 then
        mensaje:='Pensión denegada por otra causa: '||row_persona.otra_causa_den_pension;
    else
        begin
            select cp.codigo_causa_den_pension into codigo_causa 
            from causa_den_pension cp 
            where cp.numero_causa_den_pension=row_persona.numero_causa_den_pension;
        exception when no_data_found then null;
        end;
        if sql%found then
            mensaje:=codigo_causa;
        end if;
    end if;
    return mensaje;
end;
