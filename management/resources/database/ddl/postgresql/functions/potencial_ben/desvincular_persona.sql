--
--Este procedimiento elimina el vínculo entre un potencial beneficiario y una persona, el procedimiento es ejecutado manualmente por los usuarios.
--@param rastro: Identificador del proceso ejecutado.
--@param beneficiario: Id del potencial beneficiario sobre el que se ejecuta el proceso.
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function potencial_ben_desvincular(rastro bigint, beneficiario bigint) returns integer as $$
declare
   mensaje varchar:='';
begin
    select potencial_ben_desvincular(beneficiario) into mensaje;
    return rastro_proceso_update(rastro, 21, null, mensaje);
end;
$$ language plpgsql;
--
--Este procedimiento crea el vínculo entre un potencial beneficiario y una persona, creando una referencia a la persona desde el potencial beneficiario. 
--@param beneficiario: Id del potencial beneficiario sobre el que se ejecuta el proces.
--@param persona_vincular: id de la persona a vincular
--@return: mensaje indicando la condición de ejecución del proceso.
--
create or replace function potencial_ben_desvincular(beneficiario bigint) returns varchar as $$
declare
    mensaje varchar:='';
    row_potencial_ben potencial_ben;
    row_persona persona;
begin
    --Si no se recibe un parámetro válido, no se puede hacer la búsqueda
    if beneficiario is null then
        raise exception 'No ha especificado potencial beneficiario a desvincular';
    end if;
    --Se recupera al potencial beneficiario
    select *
    into   row_potencial_ben
    from   potencial_ben
    where  id_potencial_ben = beneficiario;
    --Si no se encuentra un registro, no se hace nada
    if not found then
        raise exception 'Potencial beneficiario no existe (id=%)', beneficiario;
    end if;
    --Si no esta vinculado no se hace nada
    if row_potencial_ben.id_persona is null then
        raise exception 'Potencial beneficiario no está vinculado a ninguna persona (id=%)',beneficiario;
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
$$ language plpgsql;
