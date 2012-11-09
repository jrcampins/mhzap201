create or replace function persona_consultar_acreditacion(persona_consultada bigint) returns integer as $$
declare
    row_persona persona;
    condicion integer := 0;
    indice_calidad_vida_corte numeric (7,4);
begin
    --Se consulta el punto de corte
    select limite_indice_calidad_vida 
    into indice_calidad_vida_corte 
    from parametro_global;
    --Se extrae la persona
    select *
    into   row_persona
    from   persona
    where  id_persona = persona_consultada;
    if not found then
        raise exception 'Persona no existe (id=%)', persona_consultada;
    end if;
    --Se verifica que la persona tenga indice de calidad de vida y tenga ficha persona 
    if (row_persona.indice_calidad_vida is null) then
        raise exception 'Persona no tiene Indice de Calidad de Vida (id=%)', persona_consultada;
    end if;
    --Se verifica fecha de ficha persona
    if row_persona.id_ficha_persona is null then
        condicion:=31;
    end if;
    --Se verifica icv menor que 65
    if row_persona.indice_calidad_vida>indice_calidad_vida_corte then
        condicion:=32;
    end if;
    return condicion;
end;
$$ language plpgsql;
