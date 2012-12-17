function extract_letra_from_cedula(ced varchar2) return char is
    letra_cedula char:=null;
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
        while v_caracter not between 'A' and 'Z' and v_caracter not between 'a' and 'z'loop
            v_posicion := v_posicion+1;
            v_caracter := substr(cedula, v_posicion, 1);
        end loop;
        if v_posicion<=length(cedula) then
            letra_cedula:= substr(cedula, v_posicion, 1);
        end if;
    end if;
    return letra_cedula;
end;