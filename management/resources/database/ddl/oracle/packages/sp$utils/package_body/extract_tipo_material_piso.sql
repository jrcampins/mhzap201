function extract_tipo_mat_piso(str varchar2) return number is

    tipo_mat_piso number:= null;
begin
    if str is not null then
        tipo_mat_piso:=to_number(str);
        if tipo_mat_piso>=1 and tipo_mat_piso<=7 then
            return tipo_mat_piso;
        else
            return null;
        end if;
    end if;
return tipo_mat_piso;
end;
