
--Cada vez que se va a actualizar un potencial beneficiario, se mantienen sus datos actualizados desde Persona
--
create or replace function potencial_ben_before_update () returns trigger as $$
begin
    if(new.numero_tipo_reg_pot_ben<>old.numero_tipo_reg_pot_ben) then
        raise exception 'No se puede cambiar el tipo de Registro de un Potencial Beneficiario';
    end if;
    if(new.es_potencial_ben_inactivo=1 and old.es_potencial_ben_inactivo=1) then
        raise exception 'El Potencial Beneficiario está inactivo. No se puede modificar';
    end if;
    new = potencial_ben_copia_datos_persona(new);
    new.codigo_potencial_ben = potencial_ben_concat_codigo_potencial_ben(new);
    new.nombre_potencial_ben = potencial_ben_concat_nombre_potencial_ben(new);
    --Solo si cambia id_ficha_persona es que se verifica la condición de censo
    if (old.id_ficha_persona<>new.id_ficha_persona
        or (old.id_ficha_persona is null and new.id_ficha_persona is not null)) then 
        new.numero_condicion_censo=potencial_ben_actualizar_condicion_censo(new);
    elsif(old.id_ficha_persona is not null and new.id_ficha_persona is null)then
        new.numero_condicion_censo=1;
    end if;
--   if new.es_paraguayo_natural=0 then
--         raise exception 'Error al actualizar Potencial Beneficiario: no es Paraguayo natural';
--     end if;
--     if (new.fecha_nacimiento is not null)then
--         if (date_part('year',age(new.fecha_nacimiento))<65) then
--             raise exception 'Error al actualizar Potencial Beneficiario: no es mayor de 65 años';
--         end if;
--     end if;
    return new;
end;
$$ language 'plpgsql' volatile called on null input security invoker;
