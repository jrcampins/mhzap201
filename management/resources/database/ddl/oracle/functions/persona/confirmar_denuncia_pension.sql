--
--Descripción: Este procedimiento permite confirmar una denuncia de una pensión ya aprobada
--@param rastro: Identificador del proceso ejecutado.
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@param numero_causa: Número de causa por la que se revoca la pensión
--@param otra_causa: En caso de que la causa sea otra, se especifica
--@param comentarios: Comentarios de la confirmación de denuncia
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function persona_confirmar_denu_pen(rastro number, persona_consultada number, numero_causa number, otra_causa varchar2, comentarios varchar2) return number is
    mensaje varchar2(200);
    retcode number;
begin
    mensaje:=sp$persona.confirmar_denu_pen(persona_consultada, numero_causa, otra_causa, comentarios);
    retcode := rastro_proceso_update(rastro, 21, null, mensaje);
    return retcode;
end;
/
show errors;
