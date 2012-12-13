--
--Descripción: Este procedimiento aprueba o deniega una solicitud de reconsideración de pensión
--@param rastro: Identificador del proceso ejecutado.
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function persona_proc_reco_pen(rastro number, persona_consultada number) return number is
    mensaje varchar2(200);
    retcode number;
begin
    mensaje:=sp$persona.proc_reco_pen(persona_consultada);
    retcode := rastro_proceso_update(rastro, 21, null, mensaje);
    return retcode;
end;
/
show errors;
