create or replace trigger visita_censo_after_delete
after delete on visita_censo
for each row
begin
    update potencial_ben
    set fecha_ultima_visita_censo=null,
    observaciones_ult_visita_cen=null,
    id_funcionario_ult_visita_cen=null
    where id_potencial_ben=:old.id_potencial_ben;
end;
/
show errors
