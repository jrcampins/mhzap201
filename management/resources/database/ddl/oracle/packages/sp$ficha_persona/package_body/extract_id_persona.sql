--Este metodo devuelve el id de persona para una ficha_persona
function extract_id_persona(xrow ficha_persona%rowtype) return number is
    codigo varchar2(60);
    row_persona persona%rowtype;
    ocurrencias number:=0;
begin
    --Si no, se empieza a buscar la persona
    if xrow.numero_cedula is null or xrow.nombre_ficha_persona is null then
        return null;
    end if;
    --Se arma un código válido de persona (ver concat_codigo_persona)
    codigo := xrow.numero_cedula || utils.concat_or_empty('-', trim(xrow.letra_cedula));
    --Se busca la persona
    begin
        select * into row_persona from persona where codigo_persona=codigo;
    exception
        --Si no consigue se devuelve null
        when no_data_found then return null;
    end;
    --Buscamos el primer nombre de la persona en ficha persona
    if row_persona.primer_nombre is not null then
	if instr(upper(xrow.nombre_ficha_persona),upper(row_persona.primer_nombre))<>0 then
            ocurrencias:=ocurrencias+1;
	end if;
    end if;
    --Buscamos el segundo nombre de la persona en potencial beneficiario
    if row_persona.segundo_nombre is not null then
	if instr(upper(xrow.nombre_ficha_persona),upper(row_persona.segundo_nombre))<>0 then
            ocurrencias:=ocurrencias+1;
	end if;
    end if;
    --Buscamos el primer apellido de la persona en potencial beneficiario
    if row_persona.primer_apellido is not null then
	if instr(upper(xrow.nombre_ficha_persona),upper(row_persona.primer_apellido))<>0 then
            ocurrencias:=ocurrencias+1;
	end if;
    end if;
    --Buscamos el segundo apellido de la persona en potencial beneficiario
    if row_persona.segundo_apellido is not null then
	if instr(upper(xrow.nombre_ficha_persona),upper(row_persona.segundo_apellido))<>0 then
            ocurrencias:=ocurrencias+1;
	end if;
    end if;
    --Buscamos el apellido de casada en ficha_persona
    if row_persona.apellido_casada is not null then
	if instr(upper(xrow.nombre_ficha_persona),upper(row_persona.apellido_casada))<>0 then
            ocurrencias:=ocurrencias+1;
	end if;
    end if;
    --Si dos nombres coinciden preguntamos por la edad. 
    if ocurrencias>=2 then
        if to_char(row_persona.fecha_nacimiento,'YYYYMMDD') = to_char(xrow.fecha_nacimiento,'YYYYMMDD') then
            return row_persona.id_persona;
        end if;
    end if;
    return null;
end;
