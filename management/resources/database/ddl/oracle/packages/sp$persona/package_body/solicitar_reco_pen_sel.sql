--
--Descripci�n: Este procedimiento solicita reconsideraci�n a una selecci�n
--@param usuario_proceso: id del usuario que ejecuta el proceso
--@param observaciones: c�digo del sime
--@return: mensaje indicando la asignaci�n
--
function solicitar_reco_pen_sel(usuario_proceso number,observaciones varchar2) return varchar2 is
    mensaje varchar2(200);
    mensaje_int varchar2(200);
    conta_persona number:=0;
    row_persona_anotada persona_anotada%rowtype;
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000);
begin
    begin
        select count(id_persona_anotada) into conta_persona from persona_anotada where id_usuario=usuario_proceso group by id_usuario;
    exception
        when no_data_found then null;
    end;
    if not sql%found then
        msg_string := 'Usuario no tiene registros seleccionados';
        raise_application_error(err_number, msg_string, true);
    else
        conta_persona:=0;
        for row_persona_anotada in (
            select * from persona_anotada
            where id_usuario=usuario_proceso ) 
        loop
            conta_persona:=conta_persona+1;
            begin
                mensaje:=sp$persona.solicitar_reco_pen(row_persona_anotada.id_persona, observaciones);
            exception
                when others then
                    msg_string :='No se pudo solicitar reconsideraci�n a persona '||row_persona_anotada.codigo_persona||'-'||row_persona_anotada.nombre_persona||': '||SQLERRM;
                    raise_application_error(err_number, msg_string, true);
            end;
        end loop;
        delete from persona_anotada where id_usuario=usuario_proceso;
        mensaje:='Se solicit� reconsideraci�n  a '||conta_persona||' Personas. Se limpi� la selecci�n del usuario';
        return mensaje;
    end if;
end;