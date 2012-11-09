create or replace function usuario_before_insert() returns trigger as $$
/*
declare
	row_persona record;
*/
begin
/*
    select * into row_persona from persona where id_persona = new.id_usuario;
    if found then
--      if row_persona.numero_tipo_persona  = 0 then
--          raise exception 'solo se permite crear un usuario a personas naturales';
--      end if;
--      if row_persona.es_persona_eliminada = 1 then
--          raise exception 'no se permite crear un usuario a personas eliminadas';
--      end if;
--      if row_persona.es_persona_inactiva  = 1 then
--          raise exception 'no se permite crear un usuario a personas inactivas';
--      end if;
--      new.codigo_usuario = row_persona.codigo_persona;
        new.nombre_usuario = row_persona.nombre_persona;
    end if;
*/
    new.es_usuario_modificado = 1;
	return new;
end;
$$ language plpgsql;
