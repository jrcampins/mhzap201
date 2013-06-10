--
--Descripción: Este procedimiento asigna código SIME a una selección
--@param usuario_proceso: id del usuario que ejecuta el proceso
--@param sime: código del sime
--@return: mensaje indicando la asignación
--
function asignar_reco_pen_sel(usuario_proceso number,sime varchar2) return varchar2 is
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
                update persona set codigo_sime_reco_pen=sime where id_persona=row_persona_anotada.id_persona;
            exception
                when others then
                    msg_string :='No se pudo asignar SIME a persona '||row_persona_anotada.codigo_persona||'-'||row_persona_anotada.nombre_persona;
                    raise_application_error(err_number, msg_string, true);
            end;
        end loop;
        delete from persona_anotada where id_usuario=usuario_proceso;
        mensaje:='Se asigno SIME de reconsideración '||sime||' a '||conta_persona||' Personas. Se limpió la selección del usuario';
        return mensaje;
    end if;
end;