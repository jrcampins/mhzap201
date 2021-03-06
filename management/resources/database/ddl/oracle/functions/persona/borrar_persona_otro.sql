--
--Descripción: Este procedimiento borra una persona de la selección
--@param rastro: Identificador del proceso ejecutado.
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function persona_borrar_otro(rastro number, usuario number) return number is
    mensaje varchar2(200);
    retcode number;
    usuario_proceso number;
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000); -- a character string of at most 2048 bytes
begin
    begin
        select id_usuario into usuario_proceso from usuario u where  u.id_usuario= usuario;
    exception
        when no_data_found then null;
    end;
    if not sql%found then
        msg_string := 'Usuario no tiene procesos';
        raise_application_error(err_number, msg_string, true);
    end if;
    mensaje:=sp$persona.borrar(usuario_proceso);
    retcode := rastro_proceso_update(rastro, 21, null, mensaje);
    return retcode;
end;
/
show errors;