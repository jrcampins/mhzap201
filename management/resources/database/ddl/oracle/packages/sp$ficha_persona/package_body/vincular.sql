--Este procedimiento crea el vínculo entre una ficha persona y un potencial beneficiario, creando una referencia al potencial beneficiario desde la persona. 
--@param rastro: Identificador del proceso ejecutado.
--@param ficha: Id de la ficha sobre la que se ejecuta el proceso.
--@param beneficiario: id del Potencial beneficiario a vincular
--@return: mensaje indicando la condición de ejecución del proceso.
--
function vincular(ficha number, beneficiario number) return varchar2 is
    mensaje varchar2(2000);
    row_potencial_ben potencial_ben%rowtype;
    row_Ficha ficha_persona%rowtype;
    row_ficha_h ficha_hogar%rowtype;
    row_persona persona%rowtype;
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000);
begin
    --Si no se recibe un parámetro válido, no se puede hacer la búsqueda
    if ficha is null or beneficiario is null then
        msg_string:='Ficha-persona o Beneficiario son nulos';
        raise_application_error(err_number, msg_string, true);
    end if;
    --Se recupera la ficha persona
    begin
        select * into  row_ficha from   ficha_persona fp where  fp.id_ficha_persona = ficha;
    exception
        when no_data_found then null;
    end;
    --Si no existe el potencial beneficiario no se puede vincular
    if not sql%found then
        msg_string:='Ficha-Persona no existe';
        raise_application_error(err_number, msg_string, true);
    end if;
    --Se recupera la ficha hogar
    begin
        select * into  row_ficha_h from   ficha_hogar fh where  fh.id_ficha_hogar = row_ficha.id_ficha_hogar;
    exception
        when no_data_found then null;
    end;
    --Si no existe el potencial beneficiario no se puede vincular
    if not sql%found then
        msg_string:='Ficha-Hogar no existe';
        raise_application_error(err_number, msg_string, true);
    end if;
    --Se recupera el potencial beneficiario
    begin
        select * into   row_potencial_ben from   potencial_ben where  id_potencial_ben = beneficiario;
    exception
        when no_data_found then null;
    end; 
    --Si no existe, no se hace nada
    if not sql%found then
        msg_string:='Beneficiario no existe';
        raise_application_error(err_number, msg_string, true);
    end if;
    --Para poder vincular a otro potencial beneficiario, hay que desvincular primero
    if (row_potencial_ben.id_ficha_persona is not null) then
        msg_string:='Beneficiario ya está vinculado a Ficha Persona. Desvincule primero';
        raise_application_error(err_number, msg_string, true);
    end if;
    --Caso 1: Si el potencial beneficiario tiene cédula
    --La vinculación afecta a la persona
    if (row_potencial_ben.id_persona is not null) then
        update persona
        set id_ficha_persona=ficha
        where id_persona=row_potencial_ben.id_persona ;
        mensaje:='Se vinculó el Potencial Beneficiario (con cédula): '
                 ||row_potencial_ben.codigo_potencial_ben
                 ||' A la ficha :'||row_ficha.codigo_ficha_persona
                 ||'. Los datos de la Persona también fueron modificados';
    --Caso 2: Si el potencial beneficiario no tiene id_persona
    --se vincula directamente
    else
        --Se crea el vinculo de potencial_ben a ficha_persona
        update potencial_ben
        set id_ficha_persona=ficha
        where id_potencial_ben=beneficiario;
        --Se crea el vinculo de ficha_persona a potencial_ben
        update ficha_persona
        set id_potencial_ben=beneficiario
        where id_ficha_persona=ficha;
        mensaje:='Se vinculó el Potencial Beneficiario (sin cédula): '
                 ||row_potencial_ben.codigo_potencial_ben
                 ||' A la ficha :'||row_ficha.codigo_ficha_persona;
    end if;
    return mensaje;
end;
