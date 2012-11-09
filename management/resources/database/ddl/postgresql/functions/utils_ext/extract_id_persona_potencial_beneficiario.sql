--Este metodo devuelve el id de persona para un potencial beneficiario
create or replace function extract_id_persona_potencial_ben(row_potencial_ben potencial_ben) returns bigint as $$
declare
    id_persona bigint;
    row_persona persona;
    array_nombres varchar[];
    ocurrencias integer:=0;
    codigo varchar:='';
begin
    --Se arma un código válido de persona (ver concat_codigo_persona)
    codigo:=concat_or_empty(btrim(row_potencial_ben.letra_cedula),'-') || cast(row_potencial_ben.numero_cedula as varchar) ;
    select * into row_persona
    from persona where codigo_persona=codigo;
    --Buscamos el primer nombre de la persona en potencial beneficiario
    --raise exception 'comparando % y % da %',row_persona.primer_nombre,row_potencial_ben.nombre_potencial_ben,strpos(upper(row_potencial_ben.nombre_potencial_ben),upper(row_persona.primer_nombre));
    if row_persona.primer_nombre is not null then
	if strpos(upper(row_potencial_ben.nombre_potencial_ben),upper(row_persona.primer_nombre))<>0 then
		ocurrencias:=ocurrencias+1;
	end if;
    end if;
    --Buscamos el segundo nombre de la persona en potencial beneficiario
    
    if row_persona.segundo_nombre is not null then
	if strpos(upper(row_potencial_ben.nombre_potencial_ben),upper(row_persona.segundo_nombre))<>0 then
		ocurrencias:=ocurrencias+1;
	end if;
    end if;
    --Buscamos el primer apellido de la persona en potencial beneficiario
    if row_persona.primer_apellido is not null then
	if strpos(upper(row_potencial_ben.nombre_potencial_ben),upper(row_persona.primer_apellido))<>0 then
		ocurrencias:=ocurrencias+1;
	end if;
    end if;
    --Buscamos el segundo apellido de la persona en potencial beneficiario
    if row_persona.segundo_apellido is not null then
	if strpos(upper(row_potencial_ben.nombre_potencial_ben),upper(row_persona.segundo_apellido))<>0 then
		ocurrencias:=ocurrencias+1;
	end if;
    end if;
    --Buscamos el apellido de casada en potencial_ben
    if row_persona.apellido_casada is not null then
	if strpos(upper(row_potencial_ben.nombre_potencial_ben),upper(row_persona.apellido_casada))<>0 then
		ocurrencias:=ocurrencias+1;
	end if;
    end if;
    --Si dos nombres coinciden preguntamos por la fecha de nacimiento 
    if ocurrencias>=2 then
        if date_part('day',row_persona.fecha_nacimiento)=date_part('day',row_potencial_ben.fecha_nacimiento) 
           and date_part('month',row_persona.fecha_nacimiento)=date_part('month',row_potencial_ben.fecha_nacimiento)
           and date_part('year',row_persona.fecha_nacimiento)=date_part('year',row_potencial_ben.fecha_nacimiento) then
           return row_persona.id_persona;
        else
           return null;
        end if;
    else
           return null;
    end if;
end;
$$ language'plpgsql';

