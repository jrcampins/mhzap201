--Este metodo devuelve el id de persona para una ficha_persona
create or replace function extract_id_persona_ficha_persona(row_ficha_persona ficha_persona) returns bigint as $$
declare
    id_persona bigint;
    row_persona persona;
    array_nombres varchar[];
    ocurrencias integer:=0;
    codigo varchar:='';
begin
    --Se arma un código válido de persona (ver concat_codigo_persona)
    codigo:=concat_or_empty(btrim(row_ficha_persona.letra_cedula),'-') || cast(row_ficha_persona.numero_cedula as varchar) ;
    --Si no consigue nada se devuelve null
    if(codigo is null) then
        return null;
    end if;
    --Se busca la persona
    select * into row_persona
    from persona where codigo_persona=codigo;
    --Si no consigue nada se devuelve null
    if(not found) then
        return null;
    end if;
    --Buscamos el primer nombre de la persona en ficha persona
    if row_persona.primer_nombre is not null then
	if strpos(upper(row_ficha_persona.nombre_ficha_persona),upper(row_persona.primer_nombre))<>0 then
		ocurrencias:=ocurrencias+1;
	end if;
    end if;
    --Buscamos el segundo nombre de la persona en potencial beneficiario
    if row_persona.segundo_nombre is not null then
	if strpos(upper(row_ficha_persona.nombre_ficha_persona),upper(row_persona.segundo_nombre))<>0 then
		ocurrencias:=ocurrencias+1;
	end if;
    end if;
    --Buscamos el primer apellido de la persona en potencial beneficiario
    if row_persona.primer_apellido is not null then
	if strpos(upper(row_ficha_persona.nombre_ficha_persona),upper(row_persona.primer_apellido))<>0 then
		ocurrencias:=ocurrencias+1;
	end if;
    end if;
    --Buscamos el segundo apellido de la persona en potencial beneficiario
    if row_persona.segundo_apellido is not null then
	if strpos(upper(row_ficha_persona.nombre_ficha_persona),upper(row_persona.segundo_apellido))<>0 then
		ocurrencias:=ocurrencias+1;
	end if;
    end if;
    --Buscamos el apellido de casada en ficha_persona
    if row_persona.apellido_casada is not null then
	if strpos(upper(row_ficha_persona.nombre_ficha_persona),upper(row_persona.apellido_casada))<>0 then
		ocurrencias:=ocurrencias+1;
	end if;
    end if;
    --Si dos nombres coinciden preguntamos por la edad. 
    if ocurrencias>=2 then
        if date_part('day',row_persona.fecha_nacimiento)=date_part('day',row_ficha_persona.fecha_nacimiento) 
           and date_part('month',row_persona.fecha_nacimiento)=date_part('month',row_ficha_persona.fecha_nacimiento)
           and date_part('year',row_persona.fecha_nacimiento)=date_part('year',row_ficha_persona.fecha_nacimiento) then
           return row_persona.id_persona;
        else
           return null;
        end if;
    else
           return null;
    end if;
end;
$$ language'plpgsql';