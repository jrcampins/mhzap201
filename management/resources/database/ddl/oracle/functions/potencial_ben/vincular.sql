--
--Este procedimiento crea el vínculo entre un potencial beneficiario y una persona, el procedimiento es ejecutado manualmente por los usuarios.
--@param rastro: Identificador del proceso ejecutado.
--@param beneficiario: Id del potencial beneficiario sobre el que se ejecuta el proceso.
--@param persona: id de la persona a vincular
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function potencial_ben_vincular(rastro number, beneficiario number, persona_vincular number) return integer is
    mensaje varchar2(200);
    retcode number;
begin
    mensaje:=sp$potencial_ben.vincular(beneficiario,persona_vincular);
    retcode := rastro_proceso_update(rastro, 21, null, mensaje);
    return retcode;
end;
/
show errors;
