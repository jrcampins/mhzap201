--
--Descripción: Este procedimiento registra una solicitud de reconsideración de pensión
--@param rastro: Identificador del proceso ejecutado.
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@param comentarios: Comentarios de la solicitud
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function persona_aprobar_reco_pen_sel(rastro number, observaciones varchar2) return number is
    mensaje varchar2(200);
    retcode number;
    usuario_proceso number;
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000); -- a character string of at most 2048 bytes
begin
    begin
        select id_usuario into usuario_proceso from rastro_proceso r where  r.id_rastro_proceso= rastro;
    exception
        when no_data_found then null;
    end;
    if not sql%found then
        msg_string := 'Rastro de proceso no existe (id='||rastro||')';
        raise_application_error(err_number, msg_string, true);
    end if;
    mensaje:=sp$persona.aprobar_reco_pen_sel(usuario_proceso,observaciones);
    retcode := rastro_proceso_update(rastro, 21, null, mensaje);
    return retcode;
end;
/
show errors;