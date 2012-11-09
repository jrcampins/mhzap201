create or replace function visita_censo_after_delete() returns trigger as $$
begin
    update potencial_ben
    set fecha_ultima_visita_censo=null,
    observaciones_ult_visita_cen=null,
    id_funcionario_ult_visita_cen=null
    where id_potencial_ben=old.id_potencial_ben;
    return null;
end;
$$ language plpgsql;