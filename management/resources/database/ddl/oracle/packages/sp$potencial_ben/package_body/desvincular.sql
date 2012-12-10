--
--Este procedimiento crea el vínculo entre un potencial beneficiario y una persona, creando una referencia a la persona desde el potencial beneficiario. 
--@param beneficiario: Id del potencial beneficiario sobre el que se ejecuta el proces.
--@param persona_vincular: id de la persona a vincular
--@return: mensaje indicando la condición de ejecución del proceso.
--
function desvincular(beneficiario number) return varchar2 is
    mensaje varchar2(2000);
    row_potencial_ben potencial_ben%rowtype;
    row_persona persona%rowtype;
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000); -- a character string of at most 2048 bytes
begin
    --Si no se recibe un parámetro válido, no se puede hacer la búsqueda
    if beneficiario is null then
        msg_string:= 'No ha especificado potencial beneficiario a desvincular';
        raise_application_error(err_number, msg_string, true);
    end if;
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
    --Si no esta vinculado no se hace nada
    if row_potencial_ben.id_persona is null then
        msg_string:='Potencial beneficiario no está vinculado a ninguna persona'||beneficiario;
        raise_application_error(err_number, msg_string, true);
    end if;
    --Se verifica si el potencial_ben viene con id_ficha
    if(row_potencial_ben.id_ficha_persona is not null) then
        update persona
        set id_ficha_persona=null 
        where id_persona=row_potencial_ben.id_persona;
    end if;
    --Se desvincula el potencial beneficiario a la persona
    update potencial_ben
    set    id_persona = null 
    where  id_potencial_ben = beneficiario;
    mensaje:='Potencial Beneficiario Desvinculado de Persona';
    return mensaje;
end;
