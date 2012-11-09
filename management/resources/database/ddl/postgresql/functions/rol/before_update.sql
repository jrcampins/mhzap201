create or replace function rol_before_update() returns trigger as $$
begin
	if (old.id_rol < 1000000000000) then
		raise exception 'no se permite modificar un rol de configuracion basica del sistema';
	end if;
	return new;
end;
$$ language plpgsql;
