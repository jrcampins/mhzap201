create or replace function rol_before_delete() returns trigger as $$
begin
	if (old.id_rol < 1000000000000) then
		raise exception 'no se permite eliminar un rol de configuracion basica del sistema';
	end if;
	return old;
end;
$$ language plpgsql;
