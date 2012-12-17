function extract_id_departamento(departamento varchar2) return number is

    codigo varchar(60);
    retorno number:= null;
begin
    if to_number(departamento)=0 then
        codigo:='00';
    elsif to_number(departamento)>0 and to_number(departamento)<=9 then
        codigo:='0'||ltrim(departamento,'0');
    elsif to_number(departamento)<=99 then
        codigo:=departamento;
    else
        return null;
    end if;
    begin
        select id_ubicacion into retorno from ubicacion where codigo_ubicacion=codigo;
    exception
        when no_data_found then
            raise_application_error(-20001, 'Ubicación no encontrada');  
    end;
    return retorno;
exception when others then
		return null;
end;
