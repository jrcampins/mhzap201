--
--Este procedimiento reactiva una ficha_hogar y sus fichas_persona
--@param rastro: Identificador del proceso ejecutado.
--@param ficha: Id de la ficha sobre la que se ejecuta el proceso.
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function ficha_hogar_reactivar(rastro number, ficha number) return number is
    mensaje varchar2(200);
    retcode number;
begin
    mensaje:=sp$ficha_hogar.reactivar(ficha);
    retcode := rastro_proceso_update(rastro, 21, null, mensaje);
    return retcode;
end;
/
show errors;