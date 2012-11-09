function concat_codigo(xrow persona%rowtype) return varchar2 is
    codigo varchar2(60);
begin
    if (xrow.numero_cedula is null) then
        codigo := 'X' || xrow.id_persona;
    else
        codigo := xrow.numero_cedula || utils.concat_or_empty('-', trim(xrow.letra_cedula));
    end if;
    return codigo;
end;
