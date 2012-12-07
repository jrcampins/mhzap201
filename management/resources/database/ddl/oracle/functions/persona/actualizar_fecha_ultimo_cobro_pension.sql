--
--Descripción: Este procedimiento actualiza la fecha en que se registró el último cobro de pensión de una persona.
--@param rastro: Identificador del proceso ejecutado.
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@param fecha_cobro: Fecha de cobro
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function persona_act_fec_ult_cob_pen(rastro number, persona_consultada number, fecha_cobro timestamp) return number is
    mensaje varchar2(200);
    retcode number;
begin
    mensaje:=sp$persona.act_fec_ult_cob_pen(persona_consultada,fecha_cobro);
    retcode := rastro_proceso_update(rastro, 21, null, mensaje);
    return retcode;
end;
/
show errors;
