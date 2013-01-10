--
--Descripción: Este procedimiento deniega una solicitud de reconsideración de pensión. Para ello registra los motivos indicados por el usuario
--@param rastro: Identificador del proceso ejecutado.
--@param beneficiario_consultado: id del potencial beneficiario sobre el que se ejecutara la funcion
--@param numero_causa: numero de la causa de denegación
--@param otra_causa: descripcion de otra causa de denegación
--@param comentarios: Comentarios de la denegacion
--@return: mensaje indicando resultado de la ejecucion del proceso.
--
function denegar_recl_cen(beneficiario_consultado number, numero_causa number, otra_causa varchar2, comentarios varchar2) return varchar2 is
    mensaje varchar2(2000);
    row_potencial_ben potencial_ben%rowtype;
    row_persona persona%rowtype;
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000);
begin
    --Se recupera al potencial beneficiario
    begin
        select * into   row_potencial_ben from   potencial_ben where  id_potencial_ben = beneficiario_consultado;
    exception
        when no_data_found then null;
    end;
    --Si no se encuentra un registro, no se hace nada
    if not sql%found then
        msg_string:='Potencial beneficiario no existe';
        raise_application_error(err_number, msg_string, true);
    end if;
    --Si no hay un reclamo solicitado no se procesa
    if row_potencial_ben.numero_condicion_recl_cen<>1 then
        msg_string:='Persona no tiene reclamo registrado';
        raise_application_error(err_number, msg_string, true);
    end if;
    --Se actualiza el estado del potencial beneficiario como a censar con reclamo aprobado
    update potencial_ben
    set    numero_condicion_recl_cen = 3,
           numero_causa_den_recl_cen=numero_causa,
           otra_causa_den_recl_cen=otra_causa,
           fecha_denegacion_reclamo_censo  = trunc(current_timestamp),
           comentarios_den_recl_cen =comentarios
    where  id_potencial_ben=beneficiario_consultado;
    mensaje:='Reclamo de Censo Negado';
    return mensaje;
end;