function propagar_favoritos(r number) return number is
begin
    insert into pagina_usuario (id_pagina_usuario, id_pagina, id_usuario)
    select utils.bigintid(), rp.id_pagina, ru.id_usuario
    from rol_usuario ru, rol_pagina rp
    where rp.id_rol = ru.id_rol and rp.id_pagina not in (select id_pagina from pagina_usuario where id_usuario = ru.id_usuario);
    /**/
    return 0;
end;

function propagar_favoritos(r number, u number, x number) return number is
begin
    insert into pagina_usuario (id_pagina_usuario, id_pagina, id_usuario)
    select utils.bigintid(), rp.id_pagina, u
    from rol_pagina rp
    where rp.id_rol = r and rp.id_pagina not in (select id_pagina from pagina_usuario where id_usuario = u);
    /**/
    return 0;
end;
