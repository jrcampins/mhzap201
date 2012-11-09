-- delimiter ??
create or replace function rol_propagar_favoritos(rastro bigint, rol bigint) returns integer as $$
begin
	perform rol_propagar_favoritos(rol);
	return rastro_proceso_update(rastro, 21, null, 'favoritos propagados exitosamente');
end;
$$ language plpgsql;
-- ??
create or replace function rol_propagar_favoritos(r$ bigint) returns integer as $$
declare
begin
    insert into pagina_usuario (id_pagina_usuario, id_pagina, id_usuario)
    select bigintid(), rp.id_pagina, ru.id_usuario
    from rol_usuario ru, rol_pagina rp
    where rp.id_rol = ru.id_rol and rp.id_pagina not in (select id_pagina from pagina_usuario where id_usuario = ru.id_usuario);
    /**/
    return 0;
end;
$$ language plpgsql;
-- ??
create or replace function rol_propagar_favoritos(r$ bigint, u$ bigint, x$ bigint) returns integer as $$
declare
begin
    insert into pagina_usuario (id_pagina_usuario, id_pagina, id_usuario)
    select bigintid(), rp.id_pagina, u$
    from rol_pagina rp
    where rp.id_rol = r$ and rp.id_pagina not in (select id_pagina from pagina_usuario where id_usuario = u$);
    /**/
    return 0;
end;
$$ language plpgsql;
-- ??
