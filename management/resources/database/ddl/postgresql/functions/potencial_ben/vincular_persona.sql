--
--Este procedimiento crea el vínculo entre un potencial beneficiario y una persona, el procedimiento es ejecutado manualmente por los usuarios.
--@param rastro: Identificador del proceso ejecutado.
--@param beneficiario: Id del potencial beneficiario sobre el que se ejecuta el proceso.
--@param persona: id de la persona a vincular
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function potencial_ben_vincular(rastro bigint, beneficiario bigint, persona_vincular bigint) returns integer as $$
declare
   mensaje varchar:='';
begin
    select potencial_ben_vincular(beneficiario,persona_vincular) into mensaje;
    return rastro_proceso_update(rastro, 21, null, mensaje);
end;
$$ language plpgsql;
--
--Este procedimiento crea el vínculo entre un potencial beneficiario y una persona, creando una referencia a la persona desde el potencial beneficiario. 
--@param beneficiario: Id del potencial beneficiario sobre el que se ejecuta el proces.
--@param persona_vincular: id de la persona a vincular
--@return: mensaje indicando la condición de ejecución del proceso.
--
create or replace function potencial_ben_vincular(beneficiario bigint, persona_vincular bigint) returns varchar as $$
declare
    mensaje varchar:='';
    row_potencial_ben potencial_ben;
    row_persona persona;
begin
    --Si no se recibe un parámetro válido, no se puede hacer la búsqueda
    if persona_vincular is null or beneficiario is null then
        raise exception 'No ha especificado persona o potencial beneficiario a vincular';
    end if;
    --Se recupera al potencial beneficiario
    select *
    into   row_potencial_ben
    from   potencial_ben
    where  id_potencial_ben = beneficiario;
    --Si no se encuentra un registro, no se hace nada
    if not found then
        raise exception 'Potencial beneficiario no existe (id=%)', persona_vincular;
    end if;
    --Para poder vincular a otra persona, hay que desvincular primero
    if (row_potencial_ben.id_persona is not null) then
        raise exception 'Beneficiario (id_potencial_ben=%) ya fue vinculado a una persona (id_persona=%)',beneficiario,persona_vincular;
    end if;
    --Se vincula el potencial beneficiario a la persona
    update potencial_ben
    set    id_persona = persona_vincular,
    numero_tipo_reg_pot_ben=1
    where  id_potencial_ben = beneficiario;
    mensaje:='Potencial Beneficiario Vinculado a Persona';
    --Se verifica si el potencial_ben viene con id_ficha
    if(row_potencial_ben.id_ficha_persona is not null) then
        update persona
        set id_ficha_persona=row_potencial_ben.id_ficha_persona 
        where id_persona=persona_vincular;
    end if;
    return mensaje;
end;
$$ language plpgsql;
