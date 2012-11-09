function concat_nombre(xrow funcionario%rowtype) return varchar2 is
    nombre varchar2(200);
begin
    if(xrow.primer_apellido is null or xrow.primer_nombre is null) then
        nombre  := xrow.nombre_funcionario;
    else
        nombre  := trim(xrow.primer_apellido)
                || utils.concat_or_empty(' ',    trim(xrow.segundo_apellido))
                || utils.concat_or_empty(' de ', trim(xrow.apellido_casada))
                || ', '
                || trim(xrow.primer_nombre)
                || utils.concat_or_empty(' ',    trim(xrow.segundo_nombre));
    end if;
    return nombre;
end;
