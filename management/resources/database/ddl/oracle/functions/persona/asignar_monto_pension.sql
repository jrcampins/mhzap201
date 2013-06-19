--
--Descripción: Este procedimiento asigna mesa a un lote de potenciales beneficiarios
--@param rastro: Identificador del proceso ejecutado.
--@param lote: Identificador del lote
--@param sime: Número de mesa de entrada
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function persona_asignar_monto_pension(rastro number,persona number,monto number) return number is
    mensaje varchar2(2000);
    retcode number;
begin
    mensaje:=sp$persona.asignar_monto_pension(persona,monto);         
    retcode := rastro_proceso_update(rastro, 21, null, mensaje);
    return retcode;
end;
/
show errors;