create or replace function visita_censo_after_update() returns trigger as $$
declare
    row_potencial_ben potencial_ben;
begin
    if old.id_potencial_ben<>new.id_potencial_ben 
       or old.fecha_visita<>new.fecha_visita then
        update potencial_ben
        set fecha_ultima_visita_censo=null,
        observaciones_ult_visita_cen=null,
        id_funcionario_ult_visita_cen=null
        where id_potencial_ben=old.id_potencial_ben;
    end if;
    select *
    into row_potencial_ben
    from potencial_ben
    where id_potencial_ben=new.id_potencial_ben;
    if(row_potencial_ben.fecha_ultima_visita_censo is null or
       row_potencial_ben.fecha_ultima_visita_censo<new.fecha_visita) then
        update potencial_ben
        set fecha_ultima_visita_censo=new.fecha_visita,
        observaciones_ult_visita_cen=new.observaciones,
        id_funcionario_ult_visita_cen=new.id_funcionario_censista
        where id_potencial_ben=new.id_potencial_ben;
    end if;
    return new;
end;
$$ language plpgsql;