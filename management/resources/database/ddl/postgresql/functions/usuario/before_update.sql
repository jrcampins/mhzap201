create or replace function usuario_before_update() returns trigger as $$
begin
	if (old.es_super_usuario <> new.es_super_usuario) then
		new.es_usuario_modificado = 1;
	end if;	
	return new;
end;
$$ language plpgsql;
