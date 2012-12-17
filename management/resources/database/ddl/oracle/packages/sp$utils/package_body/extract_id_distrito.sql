function extract_id_distrito(departamento varchar2,distrito varchar2) return number is

    codigo varchar2(60);
    id_departamento number:=null;
    retorno number:= null;
begin
    id_departamento:=extract_id_departamento(departamento);
    if id_departamento is null then
        return null;
    end if;
    if to_number(departamento)=0 then
        codigo:='00';
    elsif to_number(departamento)>0 and to_number(departamento)<=9 then
        codigo:='0'||ltrim(departamento,'0');
    elsif to_number(departamento)<=99 then
        codigo:=departamento;
    else
        return null;
    end if;
    if to_number(distrito)=0 then
       codigo:=codigo||'00';
    elsif to_number(distrito)>0 and to_number(distrito)<=9 then
       codigo:=codigo||'0'||ltrim(distrito,'0');
    elsif to_number(distrito)<=99 then
       codigo:=codigo||distrito;
    else
       return null;
    end if;
    begin
        select id_ubicacion into retorno from ubicacion where codigo_ubicacion=codigo and id_ubicacion_superior=id_departamento;     
    exception
        when no_data_found then
            raise_application_error(-20001, 'Ubicación no encontrada');  
    end;
    return retorno;
exception when others then
            return null;
end;
