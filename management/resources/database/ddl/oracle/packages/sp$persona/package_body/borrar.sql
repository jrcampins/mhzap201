function borrar(usuario_consultado number) return varchar2 is
    mensaje varchar2(200);
    nombre_usuario varchar2(200);
    codigo_usuario varchar2(60);
    row_persona persona%rowtype;
    row_usuario usuario%rowtype;
    conta_persona number;
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
        select count(id_persona_anotada) into conta_persona from persona_anotada where id_usuario=usuario_consultado group by id_usuario;
    exception
        when no_data_found then null;
    end;
    if not sql%found then
        msg_string := 'Usuario no tiene registros seleccionados';
        raise_application_error(err_number, msg_string, true);
    end if;
    delete from persona_anotada where id_usuario=usuario_consultado;   
    return conta_persona||' Registros eliminados de la selección';
end;