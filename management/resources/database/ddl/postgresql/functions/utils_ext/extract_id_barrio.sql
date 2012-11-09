create or replace function extract_id_barrio(departamento varchar,distrito varchar,barrio varchar) returns bigint as $$
declare
    codigo varchar;
    id_distrito bigint:=null;
    retorno bigint:= null;
begin
    id_distrito:=extract_id_distrito(departamento,distrito);
    if id_distrito is null then
        return null;
    end if;    
    if cast_varchar_as_integer(departamento)=0 then
        codigo:='00';
    elsif cast_varchar_as_integer(departamento)>0 and cast_varchar_as_integer(departamento)<=9 then
        codigo:='0'||ltrim(departamento,'0');
    elsif cast_varchar_as_integer(departamento)<=99 then
        codigo:=departamento;
    else
        return null;
    end if;
    if cast_varchar_as_integer(distrito)=0 then
       codigo:=codigo||'00';
    elsif cast_varchar_as_integer(distrito)>0 and cast_varchar_as_integer(distrito)<=9 then
       codigo:=codigo||'0'||ltrim(distrito,'0');
    elsif cast_varchar_as_integer(distrito)<=99 then
       codigo:=codigo||distrito;
    else
       return null;
    end if;
    if cast_varchar_as_integer(barrio)=0 then
        codigo:=codigo||'000';
    elsif cast_varchar_as_integer(barrio)>=0 and cast_varchar_as_integer(barrio)<=9 then
       codigo:=codigo||'00'||ltrim(barrio,'0');
    elsif cast_varchar_as_integer(barrio)<=99 then
       codigo:=codigo||'0'||ltrim(barrio,'0');
    elsif cast_varchar_as_integer(barrio)<=999 then
       codigo:=codigo||barrio;  
    else
       return null;
    end if;
    select id_ubicacion 
    into retorno 
    from ubicacion 
    where codigo_ubicacion=codigo 
    and id_ubicacion_superior=id_distrito;
    return retorno;
exception when others then
 	return null;
end;
$$ language'plpgsql';