--
--Descripción: Este procedimiento anula un certificado de vida. 
--@param rastro: Identificador del proceso ejecutado.
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@param comentarios_anulacion: Comentarios donde el usuario indica las razones de la anulacion
--@return: 0 si no se produjo ninguna excepción.
--
create or replace function persona_anular_cer_vida(rastro number, persona_consultada number) return number is
    mensaje varchar2(200);
    retcode number;
begin
    mensaje:=sp$persona.anular_cer_vida(persona_consultada);
    retcode := rastro_proceso_update(rastro, 21, null, mensaje);
    return retcode;
end;
/
show errors;
