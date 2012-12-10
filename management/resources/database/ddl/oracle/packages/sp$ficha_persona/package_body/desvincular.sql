--
--Este procedimiento elimina el vínculo entre una ficha persona y un potencial beneficiario
--@param rastro: Identificador del proceso ejecutado.
--@param ficha: Id de la ficha sobre la que se ejecuta el proceso.
--@return: mensaje indicando .
--
function desvincular(ficha number) return varchar2 is
    mensaje varchar2(2000);
    row_ficha ficha_persona%rowtype;
    row_potencial_ben potencial_ben%rowtype;
    row_persona persona%rowtype;
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000); 
begin
    --Se ubica la ficha persona a desvincular
    begin
        select * into   row_ficha from   ficha_persona where  id_ficha_persona = ficha;
    exception
        when no_data_found then null;
    end;
    --Si no se encuentra un registro, no se hace nada
    if not sql%found then
        msg_string:='Ficha de Persona no existe';
        raise_application_error(err_number, msg_string, true);
    end if;
    --Se ubica el potencial beneficiario para eliminar el vinculo
    begin
        select * into   row_potencial_ben from   potencial_ben where  id_ficha_persona= ficha;
    exception
        when no_data_found then null;
    end;
    --Si no existe el potencial beneficiario no se puede vincular
    if not sql%found then
        msg_string:='Ficha de Persona no tiene Beneficiario Asociado';
        raise_application_error(err_number, msg_string, true);
    end if;
  
    --Caso 1: Si el potencial beneficiario tiene cédula
    --La desvinculación afecta a la persona
    if (row_potencial_ben.id_persona is not null) then
        update persona
        set id_ficha_persona=null
        where id_persona=row_potencial_ben.id_persona ;
        mensaje:='Se eliminó el vinculo del Potencial Beneficiario : '
                 ||row_potencial_ben.codigo_potencial_ben
                 ||' y la ficha :'||row_ficha.codigo_ficha_persona
                 ||'. Los datos de la Persona fueron modificados';
    --Caso 2: Si el potencial beneficiario no tiene id_persona
    --se desvincula directamente
    else
        --Se elimina el vinculo de potencial_ben a ficha_persona
        update potencial_ben
        set    id_ficha_persona = null
        where  id_potencial_ben = row_potencial_ben.id_potencial_ben;
        --Se elimina el vinculo de ficha_persona a potencial_ben
        update ficha_persona
        set    id_potencial_ben = null
        where  id_ficha_persona=ficha;
        mensaje:='Se eliminó el vinculo del Potencial Beneficiario : '
                 ||row_potencial_ben.codigo_potencial_ben
                 ||' y la ficha :'||row_ficha.codigo_ficha_persona;
    end if;
    return mensaje;
end;
