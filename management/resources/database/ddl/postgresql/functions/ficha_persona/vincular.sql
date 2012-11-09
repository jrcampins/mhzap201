--
--Este procedimiento crea el vínculo entre una ficha persona y un potencial beneficiario correspondiente, el procedimiento es ejecutado manualmente por los usuarios.
--@param rastro: Identificador del proceso ejecutado.
--@param ficha: Id de la ficha sobre la que se ejecuta el proceso.
--@param beneficiario: id del Potencial beneficiario a vincular
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function ficha_persona_vincular(rastro bigint, ficha bigint, beneficiario bigint) returns integer as $$
declare
    rc integer := 0;
begin
    perform ficha_persona_vincular(ficha, beneficiario);
    perform rastro_proceso_update(rastro, 21, null, 'ficha-persona vinculada exitosamente');
    return rc;
end;
$$ language plpgsql;
--
--Este procedimiento crea el vínculo entre una ficha persona y un potencial beneficiario, creando una referencia al potencial beneficiario desde la persona. 
--@param rastro: Identificador del proceso ejecutado.
--@param ficha: Id de la ficha sobre la que se ejecuta el proceso.
--@param beneficiario: id del Potencial beneficiario a vincular
--@return: mensaje indicando la condición de ejecución del proceso.
--
create or replace function ficha_persona_vincular(ficha bigint, beneficiario bigint) returns varchar as $$
declare
    mensaje varchar:='';
    row_ficha record;
    row_potencial_ben potencial_ben;
begin
    --Si no se recibe un parámetro válido, no se puede hacer la búsqueda
    if ficha is null or beneficiario is null then
        raise exception 'Ficha-persona o Beneficiario son nulos (id=%)', ficha;
    end if;
    --Se recupera la ficha persona
    select *
    into   row_ficha
    from   ficha_persona fp 
    left join ficha_hogar fh on fp.id_ficha_hogar=fh.id_ficha_hogar
    where  fp.id_ficha_persona = ficha;
    --Si no se encuentra un registro, no se hace nada
    if not found then
        raise exception 'Ficha-persona no existe (id=%)', ficha;
    end if;
    --Se recupera el potencial beneficiario
    select *
    into   row_potencial_ben
    from   potencial_ben
    where  id_potencial_ben = beneficiario;
    --Si no existe, no se hace nada
    if not found then
        raise exception 'Beneficiario no existe (id=%)', beneficiario;
    end if;
    --Para poder vincular a otro potencial beneficiario, hay que desvincular primero
    if (row_potencial_ben.id_ficha_persona is not null) then
        raise exception 'Beneficiario ya está vinculado a Ficha Persona. Desvincule primero';
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
$$ language plpgsql;
