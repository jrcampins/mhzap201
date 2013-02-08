function get_last_ficha_persona(xrow persona%rowtype) return number is
    row_ficha_hogar ficha_hogar%rowtype;
    row_ficha_persona ficha_persona%rowtype;
    codigo varchar(2000);
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000);
    latest_id number:=null;
    latest_date date:=null;
    ocurrencias number:=0;
begin
    if xrow.numero_cedula is null and xrow.letra_cedula is null then
        return null;
    end if;
    if xrow.letra_cedula is null then
        for row_ficha_persona in (select * from ficha_persona where numero_cedula=xrow.numero_cedula) loop
            ocurrencias:=0;
            begin
                select * into row_ficha_hogar from ficha_hogar where id_ficha_hogar=row_ficha_persona.id_ficha_hogar;
            exception
                when no_data_found then null;
            end;
            if not sql%found then
                msg_string := 'Ficha Hogar no encontrada';
                raise_application_error(err_number, msg_string, true);
            end if;
            if xrow.primer_nombre is not null then
                if instr(upper(row_ficha_persona.nombre_ficha_persona),upper(xrow.primer_nombre))<>0 then
                    ocurrencias:=ocurrencias+1;
                end if;
            end if;
            --Buscamos el segundo nombre de la persona en potencial beneficiario
            if xrow.segundo_nombre is not null then
                if instr(upper(row_ficha_persona.nombre_ficha_persona),upper(xrow.segundo_nombre))<>0 then
                    ocurrencias:=ocurrencias+1;
                end if;
            end if;
            --Buscamos el primer apellido de la persona en potencial beneficiario
            if xrow.primer_apellido is not null then
                if instr(upper(row_ficha_persona.nombre_ficha_persona),upper(xrow.primer_apellido))<>0 then
                    ocurrencias:=ocurrencias+1;
                end if;
            end if;
            --Buscamos el segundo apellido de la persona en potencial beneficiario
            if xrow.segundo_apellido is not null then
                if instr(upper(row_ficha_persona.nombre_ficha_persona),upper(xrow.segundo_apellido))<>0 then
                    ocurrencias:=ocurrencias+1;
                end if;
            end if;
            --Buscamos el apellido de casada en ficha_persona
            if xrow.apellido_casada is not null then
                if instr(upper(row_ficha_persona.nombre_ficha_persona),upper(xrow.apellido_casada))<>0 then
                    ocurrencias:=ocurrencias+1;
                end if;
            end if;
            --Si dos nombres coinciden preguntamos por la edad. 
            if ocurrencias>=2 then
                if to_char(xrow.fecha_nacimiento,'YYYYMMDD') = to_char(row_ficha_persona.fecha_nacimiento,'YYYYMMDD') then
                    if latest_id is null then
                        latest_id:=row_ficha_persona.id_ficha_persona;
                        latest_date:=row_ficha_hogar.fecha_entrevista;
                    else
                        if row_ficha_hogar.fecha_entrevista>latest_date then
                            latest_id:=row_ficha_persona.id_ficha_persona;
                            latest_date:=row_ficha_hogar.fecha_entrevista;
                        end if;
                    end if;
                end if;
            end if;
        end loop;
    else
        for row_ficha_persona in (select * from ficha_persona where numero_cedula=xrow.numero_cedula and letra_Cedula=xrow.letra_cedula) loop
            ocurrencias:=0;
            begin
                select * into row_ficha_hogar from ficha_hogar where id_ficha_hogar=row_ficha_persona.id_ficha_hogar;
            exception
                when no_data_found then null;
            end;
            if not sql%found then
                msg_string := 'Ficha Hogar no encontrada';
                raise_application_error(err_number, msg_string, true);
            end if;
            if xrow.primer_nombre is not null then
                if instr(upper(row_ficha_persona.nombre_ficha_persona),upper(xrow.primer_nombre))<>0 then
                    ocurrencias:=ocurrencias+1;
                end if;
            end if;
            --Buscamos el segundo nombre de la persona en potencial beneficiario
            if xrow.segundo_nombre is not null then
                if instr(upper(row_ficha_persona.nombre_ficha_persona),upper(xrow.segundo_nombre))<>0 then
                    ocurrencias:=ocurrencias+1;
                end if;
            end if;
            --Buscamos el primer apellido de la persona en potencial beneficiario
            if xrow.primer_apellido is not null then
                if instr(upper(row_ficha_persona.nombre_ficha_persona),upper(xrow.primer_apellido))<>0 then
                    ocurrencias:=ocurrencias+1;
                end if;
            end if;
            --Buscamos el segundo apellido de la persona en potencial beneficiario
            if xrow.segundo_apellido is not null then
                if instr(upper(row_ficha_persona.nombre_ficha_persona),upper(xrow.segundo_apellido))<>0 then
                    ocurrencias:=ocurrencias+1;
                end if;
            end if;
            --Buscamos el apellido de casada en ficha_persona
            if xrow.apellido_casada is not null then
                if instr(upper(row_ficha_persona.nombre_ficha_persona),upper(xrow.apellido_casada))<>0 then
                    ocurrencias:=ocurrencias+1;
                end if;
            end if;
            --Si dos nombres coinciden preguntamos por la edad. 
            if ocurrencias>=2 then
                if to_char(xrow.fecha_nacimiento,'YYYYMMDD') = to_char(row_ficha_persona.fecha_nacimiento,'YYYYMMDD') then
                    if latest_id is null then
                        latest_id:=row_ficha_persona.id_ficha_persona;
                        latest_date:=row_ficha_hogar.fecha_entrevista;
                    else
                        if row_ficha_hogar.fecha_entrevista>latest_date then
                            latest_id:=row_ficha_persona.id_ficha_persona;
                            latest_date:=row_ficha_hogar.fecha_entrevista;
                        end if;
                    end if;
                end if;
            end if;
        end loop;
    end if;
    return latest_id;
end;
