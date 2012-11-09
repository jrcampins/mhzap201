create or replace function pagina_usuario_insert(_codigo_aplicacion varchar, _codigo_pagina varchar, _id_usuario bigint) returns bigint as $$
declare
	row_pagina pagina;
	row_pagina_usuario pagina_usuario;
begin
	select	pagina.*
	into	row_pagina
	from	pagina inner join aplicacion
	on	aplicacion.id_aplicacion = pagina.id_aplicacion
	where	codigo_pagina = _codigo_pagina
	and	codigo_aplicacion = _codigo_aplicacion;
	if found then
		if (row_pagina.nombre_pagina is not null and row_pagina.url_pagina is not null)
		and (row_pagina.numero_tipo_pagina = 4 or (row_pagina.numero_tipo_pagina in (1,3,5,7) and row_pagina.id_dominio_maestro is null)) then
			select	*
			into	row_pagina_usuario
			from	pagina_usuario
			where	id_pagina	= row_pagina.id_pagina
			and	id_usuario	= _id_usuario;
			if found then
				raise exception 'la página "%" ya está en su lista de favoritos', row_pagina.nombre_pagina;
			end if;
		else
			raise exception 'esta página no puede agregarse a su lista de favoritos';
		end if;
	else
		raise exception 'la página "%" no pertenece a la aplicación "%"', _codigo_pagina, _codigo_aplicacion;
	end if;
	row_pagina_usuario.id_pagina_usuario		= bigintid();
	row_pagina_usuario.version_pagina_usuario	= 0;
	row_pagina_usuario.id_pagina			= row_pagina.id_pagina;
	row_pagina_usuario.id_usuario			= _id_usuario;
	insert into pagina_usuario select row_pagina_usuario.*;
	return row_pagina_usuario.id_pagina_usuario;
end;
$$ language plpgsql;
