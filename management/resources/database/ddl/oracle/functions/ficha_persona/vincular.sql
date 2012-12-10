--
--Este procedimiento crea el vínculo entre una ficha persona y un potencial beneficiario correspondiente, el procedimiento es ejecutado manualmente por los usuarios.
--@param rastro: Identificador del proceso ejecutado.
--@param ficha: Id de la ficha sobre la que se ejecuta el proceso.
--@param beneficiario: id del Potencial beneficiario a vincular
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function ficha_persona_vincular(rastro number, ficha number, beneficiario number) return number is
   mensaje varchar2(200);
   retcode number;
begin
    mensaje:=sp$ficha_persona.vincular(ficha,beneficiario);
    retcode := rastro_proceso_update(rastro, 21, null, mensaje);
    return retcode;
end;
/
show errors;
