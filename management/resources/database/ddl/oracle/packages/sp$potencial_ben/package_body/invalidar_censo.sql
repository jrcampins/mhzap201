--
--Este procedimiento invalida el valor de icv de un potencial beneficiario. 
--El valor se Invalida cuando un censo proviene de otra fuente diferente a la DGEEC
--@param beneficiario: Id del potencial beneficiario a invalidar
--@param funcionario: Id del funcionario responsable de la invalidación
--@param numero_causa: Numero de la causa de la invalidación
--@param otra_casa: Otra causa para la invalidación
--@param comentarios: Comentarios de invalidación del icv
--@return: mensaje indicando la condición de ejecución del proceso.
--
function invalidar_censo(beneficiario number, funcionario number, numero_causa number, otra_causa varchar2, comentarios varchar2) return varchar2 is
    mensaje varchar2(2000);
    row_potencial_ben potencial_ben%rowtype;
    row_persona persona%rowtype;
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000); -- a character string of at most 2048 bytes
begin
    --Se recupera al potencial beneficiario
    begin
        select * into   row_potencial_ben from   potencial_ben where  id_potencial_ben = beneficiario;
    exception
        when no_data_found then null;
    end;
    --Si no se encuentra un registro, no se hace nada
    if not sql%found then
        msg_string:='Potencial beneficiario no existe';
        raise_application_error(err_number, msg_string, true);
    end if;
    --El potencial beneficiario debe tener numero_condicion_censo=censado no Invalidado (2)
    if row_potencial_ben.numero_condicion_censo<>2 then
        msg_string:='Potencial Beneficiario no tiene Censo a invalidar';
        raise_application_error(err_number, msg_string, true);
    --Se actualiza el numero de condicion de censo del potencial beneficiario
    else
        update potencial_ben 
        set numero_condicion_censo=4,
            fecha_validacion_censo=current_timestamp,
            id_funcionario_validacion_cen=funcionario,
            numero_causa_inv_censo=numero_causa,
            otra_causa_inv_censo=otra_causa,
            comentarios_validacion_censo=comentarios
        where id_potencial_ben=beneficiario;
        mensaje:='Censo de Potencial Beneficiario Invalidado con éxito';
    end if;
    return mensaje;
end;