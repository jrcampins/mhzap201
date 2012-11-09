create or replace function potencial_ben_before_insert () returns trigger as $$
begin
    new = potencial_ben_copia_datos_persona(new);
    new.codigo_potencial_ben = potencial_ben_concat_codigo_potencial_ben(new);
    new.nombre_potencial_ben = potencial_ben_concat_nombre_potencial_ben(new);
    new.numero_condicion_censo=potencial_ben_actualizar_condicion_censo(new);
    new.fecha_registro_pot_ben =current_timestamp;
--     if new.es_paraguayo_natural=0 then
--         raise exception 'Error al insertar Potencial Beneficiario: no es Paraguayo natural';
--     end if;
--     if (new.fecha_nacimiento is not null)then
--         if (date_part('year',age(new.fecha_nacimiento))<65) then
--             raise exception 'Error al insertar Potencial Beneficiario: no es mayor de 65 años';
--         end if;
--     end if;
    return new;
end;
$$ language 'plpgsql' volatile called on null input security invoker;
