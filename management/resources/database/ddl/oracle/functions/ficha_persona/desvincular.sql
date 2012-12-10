--
--Este procedimiento elimina el vínculo entre una ficha persona y un potencial beneficiario
--@param rastro: Identificador del proceso ejecutado.
--@param ficha: Id de la ficha sobre la que se ejecuta el proceso.
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function ficha_persona_desvincular(rastro number, ficha number) return number is
   mensaje varchar2(200);
   retcode number;
begin
    mensaje:=sp$ficha_persona.desvincular(ficha);
    retcode := rastro_proceso_update(rastro, 21, null, mensaje);
    return retcode;
end;
/
show errors;
