create or replace function pagina_usuario_insert(cod_aplicacion varchar2, cod_pagina varchar2, num_usuario number) return number is
    row_pagina pagina%rowtype;
    row_pagina_usuario pagina_usuario%rowtype;
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000); -- a character string of at most 2048 bytes
begin
    begin
        select	pagina.*
        into	row_pagina
        from	pagina inner join aplicacion
        on	aplicacion.id_aplicacion = pagina.id_aplicacion
        where	codigo_pagina = cod_pagina
        and	codigo_aplicacion = cod_aplicacion;
    exception
        when no_data_found then
            msg_string := 'la página ' || cod_pagina || ' no pertenece a la aplicación ' || cod_aplicacion;
            raise_application_error(err_number, msg_string, true);
    end;
    if ((row_pagina.nombre_pagina is not null and row_pagina.url_pagina is not null)
    and (row_pagina.numero_tipo_pagina = 4 or (row_pagina.numero_tipo_pagina in (1,3,5,7) and row_pagina.id_dominio_maestro is null))) then
        begin
            select  *
            into    row_pagina_usuario
            from    pagina_usuario
            where   id_pagina = row_pagina.id_pagina
            and     id_usuario = num_usuario;
        exception
            when no_data_found then null;
        end;
        if sql%found then
            msg_string := 'la página ' || row_pagina.nombre_pagina || ' ya está en su lista de favoritos';
            raise_application_error(err_number, msg_string, true);
        end if;
    else
        msg_string := 'esta página no puede agregarse a su lista de favoritos';
        raise_application_error(err_number, msg_string, true);
    end if;
    row_pagina_usuario.id_pagina_usuario        := utils.bigintid();
    row_pagina_usuario.version_pagina_usuario   := 0;
    row_pagina_usuario.id_pagina                := row_pagina.id_pagina;
    row_pagina_usuario.id_usuario               := num_usuario;
    insert into pagina_usuario values row_pagina_usuario;
    return 0;
end;
/
show errors
