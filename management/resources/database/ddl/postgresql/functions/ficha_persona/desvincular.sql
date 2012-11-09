--
--Este procedimiento elimina el vínculo entre una ficha persona y un potencial beneficiario
--@param rastro: Identificador del proceso ejecutado.
--@param ficha: Id de la ficha sobre la que se ejecuta el proceso.
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function ficha_persona_desvincular(rastro bigint, ficha bigint) returns integer as $$
declare
    mensaje varchar:='';
begin
    select ficha_persona_desvincular(ficha) into mensaje;
    return  rastro_proceso_update(rastro, 21, null, mensaje);
end;
$$ language plpgsql;
--
--Este procedimiento elimina el vínculo entre una ficha persona y un potencial beneficiario
--@param rastro: Identificador del proceso ejecutado.
--@param ficha: Id de la ficha sobre la que se ejecuta el proceso.
--@return: mensaje indicando .
--
create or replace function ficha_persona_desvincular(ficha bigint) returns varchar as $$
declare
    mensaje varchar:='';
    row_ficha ficha_persona;
    row_potencial_ben potencial_ben;
    row_persona persona;
begin
    --Se ubica la ficha persona a desvincular
    select *
    into   row_ficha
    from   ficha_persona
    where  id_ficha_persona = ficha;
    if not found then
        raise exception 'Ficha-persona no existe (id=%)', ficha;
    end if;
    --Se ubica el potencial beneficiario para eliminar el vinculo
    select *
    into   row_potencial_ben
    from   potencial_ben
    where  id_ficha_persona= ficha;
    --Si no existe el potencial beneficiario no se puede vincular
    if not found then
        raise exception 'Ficha-persona (id=%) no tiene Beneficiario asociado', ficha;
    end if;
    --Si no esta asociado a ninguna ficha persona, no hay nada que hacer
    if (row_potencial_ben.id_ficha_persona is null) then
        raise exception 'Beneficiario no está vinculado a una ficha-persona';
    end if;
    --Si hay un error de vinculos se indica al usuario
    if (row_potencial_ben.id_ficha_persona <> ficha) then
        raise exception 'Beneficiario está vinculado a otra ficha-persona';
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
$$ language plpgsql;
