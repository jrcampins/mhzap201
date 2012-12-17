function extract_tipo_mat_techo(str varchar2) return number is

    tipo_mat_techo number:= null;
begin
    if str is not null then
        tipo_mat_techo:=to_number(str);
        if tipo_mat_techo>=1 and tipo_mat_techo<=4 then
            return tipo_mat_techo;
        else
            return null;
        end if;
    end if;
return tipo_mat_techo;
end;
