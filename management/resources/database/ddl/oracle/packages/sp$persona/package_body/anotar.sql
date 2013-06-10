function anotar(persona_consultada number, usuario_consultado number) return varchar2 is
    mensaje varchar2(200);
    nombre_usuario varchar2(200);
    codigo_usuario varchar2(60);
    row_persona persona%rowtype;
    row_usuario usuario%rowtype;
    row_persona_anotada persona_anotada%rowtype;
    row_persona_consultada persona_anotada%rowtype;
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000); -- a character string of at most 2048 bytes
begin
    begin
        select * into row_usuario from usuario u where  u.id_usuario = usuario_consultado;
    exception
        when no_data_found then null;
    end;
    if not sql%found then
        msg_string := 'Usuario no existe (id='||usuario_consultado||')';
        raise_application_error(err_number, msg_string, true);
    end if;
    begin
        select * into row_persona from persona p where  p.id_persona = persona_consultada;
    exception
        when no_data_found then null;
    end;
    if not sql%found then
        msg_string := 'Persona no existe (id='||persona_consultada||')';
        raise_application_error(err_number, msg_string, true);
    end if;
    if row_persona.numero_condicion_pension is null or(row_persona.numero_condicion_pension<>4 and row_persona.numero_condicion_pension<>6) then
        msg_string := 'Persona ('||row_persona.codigo_persona||'-'||row_persona.nombre_persona||') no tiene pensión denegada ni revocada. No se puede agregar a selección ';
        raise_application_error(err_number, msg_string, true);
    end if;
    row_persona_anotada.id_persona_anotada:=utils.bigintid();
    row_persona_anotada.version_persona_anotada:=0;
    row_persona_anotada.id_persona:=row_persona.id_persona;
    row_persona_anotada.codigo_persona:=row_persona.codigo_persona;
    row_persona_anotada.nombre_persona:=row_persona.nombre_persona;
    row_persona_anotada.id_usuario:=row_usuario.id_usuario;
    row_persona_anotada.codigo_usuario:=row_usuario.codigo_usuario;
    row_persona_anotada.nombre_usuario:=row_usuario.nombre_usuario;
    row_persona_anotada.fecha_hora_seleccion:=current_timestamp;
    begin
        select * into row_persona_consultada from persona_anotada p where  p.id_persona = persona_consultada and p.id_usuario = usuario_consultado;
    exception
        when no_data_found then null;
    end;
    if sql%found then
        msg_string := 'Persona ya pertenece a la selección (persona: '||row_persona.codigo_persona
                      ||'-'||row_persona.nombre_persona||', usuario: '||row_usuario.nombre_usuario||')';
        raise_application_error(err_number, msg_string, true);
    else
        --msg_string := 'Persona ('||row_persona.codigo_persona||'-'||row_persona.nombre_persona||') condicion pension '||row_persona.numero_condicion_pension;
        --raise_application_error(err_number, msg_string, true);
        insert into persona_anotada values row_persona_anotada;
    end if;
    return 'Persona: '||row_persona.nombre_persona||' - '||row_persona.codigo_persona
           ||' agregada a selección del usuario: '||row_usuario.nombre_usuario;
end;
