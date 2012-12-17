function extract_numero_from_cedula(ced varchar2) return number is

    num_cedula number:=null;
    cedula varchar2(50):='';
    aux varchar (50):='';
    pos number:=0;
    v_caracter char;
    v_posicion integer := 1;
begin
    cedula:=ced;
    if cedula is not null then
        v_caracter := substr(cedula, v_posicion, 1);
        while v_caracter not between '0' and '9' loop
            v_posicion := v_posicion+1;
            v_caracter := substr(cedula, v_posicion, 1);
        end loop;
        while v_caracter between '0' and '9' loop
            aux := aux || v_caracter;
            v_posicion := v_posicion+1;
            v_caracter := substr(cedula, v_posicion, 1);
        end loop;
    end if;
    if aux is not null then
        num_cedula:=to_number(aux);
    end if;
    return num_cedula;
end;