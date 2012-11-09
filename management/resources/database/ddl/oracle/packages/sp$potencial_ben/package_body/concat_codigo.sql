function concat_codigo(xrow potencial_ben%rowtype) return varchar2 is
    codigo varchar2(60);
begin
    if (xrow.numero_cedula is null) then
        codigo := 'X' || xrow.id_potencial_ben;
    else
        codigo := xrow.numero_cedula || utils.concat_or_empty('-', trim(xrow.letra_cedula));
    end if;
    return codigo;
end;
