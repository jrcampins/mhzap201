create or replace function extract_id_departamento(departamento varchar) returns bigint as $$
declare
    codigo varchar;
    retorno bigint:= null;
begin
    if cast_varchar_as_integer(departamento)=0 then
        codigo:='00';
    elsif cast_varchar_as_integer(departamento)>0 and cast_varchar_as_integer(departamento)<=9 then
        codigo:='0'||ltrim(departamento,'0');
    elsif cast_varchar_as_integer(departamento)<=99 then
        codigo:=departamento;
    else
        return null;
    end if;
    select id_ubicacion into retorno from ubicacion where codigo_ubicacion=codigo;
    return retorno;
exception when others then
		return null;
end;
$$ language'plpgsql';