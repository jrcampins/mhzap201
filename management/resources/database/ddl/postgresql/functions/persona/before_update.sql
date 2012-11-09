create or replace function persona_before_update () returns trigger as $$
declare
    row_ficha_persona ficha_persona;
    row_ficha_hogar ficha_hogar;
    row_campos record;
begin
    new.codigo_persona = persona_concat_codigo_persona(new);
    new.nombre_persona = persona_concat_nombre_persona(new);
    perform persona_before_insert_update(new);
    --si hay un cambio en el id_ficha_persona o si pasa de null a no null,
    --se deben actualizar los icvs
    if ((new.id_ficha_persona<>old.id_ficha_persona) or
        (old.id_ficha_persona is null and new.id_ficha_persona is not null))  then
        --No se pueden cambiar los datos de ficha si la pension ya fue aprobada
        if(new.numero_condicion_pension=2) then
            raise exception 'Persona con Pensión Aprobada. No se puede modificar ficha';
        end if;
        select indice_calidad_vida, fecha_entrevista
        into row_campos
        from ficha_persona fp
        left join ficha_hogar fh on fp.id_ficha_hogar=fh.id_ficha_hogar
        where fp.id_ficha_persona=new.id_ficha_persona;
        if found then
            new.indice_calidad_vida:=row_campos.indice_calidad_vida;
            new.fecha_ficha_persona:=row_campos.fecha_entrevista;
            new.es_persona_acreditada_para_pen=0;
        end if;
     --Si se está colocando el id_ficha_persona en null   
     elsif(old.id_ficha_persona is not null and new.id_ficha_persona is null) then
        --No se pueden cambiar los datos de ficha si la pension ya fue aprobada
        if(new.numero_condicion_pension=2) then
            raise exception 'Persona con Pensión Aprobada. No se puede modificar ficha';
        end if;
        new.indice_calidad_vida:=null;
        new.fecha_ficha_persona:=null;
        new.es_persona_acreditada_para_pen=0;
    end if;   
    return new;
end;
$$ language 'plpgsql' volatile called on null input security invoker;
