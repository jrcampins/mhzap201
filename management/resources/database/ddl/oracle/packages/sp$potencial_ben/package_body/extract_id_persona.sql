function extract_id_persona(xrow potencial_ben%rowtype) return number is
    id_persona number;
    row_persona persona%rowtype;
    ocurrencias number:=0;
    codigo varchar2(50);
begin
    --Se arma un código válido de persona (ver concat_codigo_persona)
    codigo := xrow.numero_cedula || utils.concat_or_empty('-', trim(xrow.letra_cedula));
    begin
        select * into row_persona from persona where codigo_persona=codigo;
    exception
        --Si no consigue se devuelve null
        when no_data_found then return null;
    end;
    --Buscamos el primer nombre de la persona en potencial beneficiario
    --raise exception 'comparando % y % da %',row_persona.primer_nombre,row_potencial_ben.nombre_potencial_ben,strpos(upper(row_potencial_ben.nombre_potencial_ben),upper(row_persona.primer_nombre));
    if row_persona.primer_nombre is not null then
	if instr(upper(xrow.nombre_potencial_ben),upper(row_persona.primer_nombre))<>0 then
            ocurrencias:=ocurrencias+1;
	end if;
    end if;
    --Buscamos el segundo nombre de la persona en potencial beneficiario
    if row_persona.segundo_nombre is not null then
	if instr(upper(xrow.nombre_potencial_ben),upper(row_persona.segundo_nombre))<>0 then
            ocurrencias:=ocurrencias+1;
	end if;
    end if;
    --Buscamos el primer apellido de la persona en potencial beneficiario
    if row_persona.primer_apellido is not null then
	if instr(upper(xrow.nombre_potencial_ben),upper(row_persona.primer_apellido))<>0 then
            ocurrencias:=ocurrencias+1;
	end if;
    end if;
    --Buscamos el segundo apellido de la persona en potencial beneficiario
    if row_persona.segundo_apellido is not null then
	if instr(upper(xrow.nombre_potencial_ben),upper(row_persona.segundo_apellido))<>0 then
            ocurrencias:=ocurrencias+1;
	end if;
    end if;
    --Buscamos el apellido de casada en potencial_ben
    if row_persona.apellido_casada is not null then
	if instr(upper(xrow.nombre_potencial_ben),upper(row_persona.apellido_casada))<>0 then
            ocurrencias:=ocurrencias+1;
	end if;
    end if;
    --Si dos nombres coinciden preguntamos por la fecha de nacimiento 
    if ocurrencias>=2 then
        if to_char(row_persona.fecha_nacimiento,'YYYYMMDD') = to_char(xrow.fecha_nacimiento,'YYYYMMDD') then
            return row_persona.id_persona;
        end if;
    end if;
end;
