--
--Descripción: Este procedimiento aprueba reconsideración de pensión a una selección.
--@param usuario_proceso: id del usuario que ejecuta el proceso
--@param observaciones: observaciones de aprobación.
--@return: mensaje indicando la asignación
--
function denegar_reco_pen_sel(usuario_proceso number,observaciones varchar2) return varchar2 is
    mensaje varchar2(200);
    mensaje_int varchar2(200);
    conta_persona number:=0;
    row_persona persona%rowtype;
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
                select * into row_persona from persona where id_persona=row_persona_anotada.id_persona;
            exception
                when no_data_found then null;
            end;
            if sql%found then
                if row_persona.numero_condicion_reco_pen<>1 or row_persona.numero_condicion_reco_pen is null then
                    msg_string :=' Persona ('||row_persona_anotada.codigo_persona||'-'||row_persona_anotada.nombre_persona||') no tiene reconsideración solicitada. No se aprobó reconsideración a ningúna persona en la lista';
                    raise_application_error(err_number, msg_string, true);
                elsif row_persona.codigo_sime_reco_pen is null then
                    msg_string :=' Persona ('||row_persona_anotada.codigo_persona||'-'||row_persona_anotada.nombre_persona||') no tiene SIME asignado. No se aprobó reconsideración a ningúna persona en la lista';
                    raise_application_error(err_number, msg_string, true);
                else
                    begin
                        mensaje:=sp$persona.denegar_reco_pen(row_persona_anotada.id_persona,99,'Causa no especificada',observaciones);
                        if mensaje not like 'Reconsideración Negada%' then
                            msg_string :='No se pudo denegar reconsideración ';
                            raise_application_error(err_number, msg_string, true);
                        end if;
                    exception
                        when others then
                            msg_string :='No se pudo denegar reconsideración a persona '||row_persona_anotada.codigo_persona||'-'||row_persona_anotada.nombre_persona||' : '||SQLERRM;
                            raise_application_error(err_number, msg_string, true);
                    end;
                end if;
            end if;
        end loop;
        delete from persona_anotada where id_usuario=usuario_proceso;
        mensaje:='Se denegó la reconsideración a '||conta_persona||' Personas. Se limpió la selección del usuario';
        return mensaje;
    end if;
end;