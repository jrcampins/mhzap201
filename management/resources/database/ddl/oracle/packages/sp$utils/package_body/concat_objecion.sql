function concat_objecion(objecion varchar2,referencia varchar2) return varchar2 is
    mensaje varchar2(4000);
begin
    if objecion is null then
        return mensaje;
    elsif referencia is null then
        mensaje:=objecion;
    else
        mensaje:=objecion||'(Referencia: '||referencia||')';
    end if;
    return mensaje;
end;