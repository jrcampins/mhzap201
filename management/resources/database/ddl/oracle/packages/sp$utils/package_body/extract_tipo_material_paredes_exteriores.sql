function extract_tipo_mat_paredes(str varchar2) return number is

    tipo_mat_paredes number:= null;
begin
    if str is not null then
        tipo_mat_paredes:=to_number(str);
        if tipo_mat_paredes>=1 and tipo_mat_paredes<=7 then
            return tipo_mat_paredes;
        else
            return null;
        end if;
    end if;
return tipo_mat_paredes;
end;
