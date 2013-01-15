function extract_id_pot_ben(cedula varchar2,
                        nombre_1 varchar2, 
                        nombre_2 varchar2,
                        apellido_1 varchar2, 
                        apellido_2 varchar2) return number is
 
--

    --type t_array is table of varchar2(50) index by binary_integer;
    
    ocurrencias number:=0;

    id_pot_ben number;
    
    row_pot_ben potencial_ben%rowtype;
    
    codigo varchar2(255);
    
    nombre_concat varchar2(255);
    
    
    array_nombres t_array;
    
    v5 number;
    
    i binary_integer;
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000); -- a character string of at most 2048 bytes
    
begin

    --Se cambia la codificacion
    
    --set client_encoding = LATIN1;
    
    codigo := cedula;
    
    begin
    
       select * 
       into row_pot_ben
       from potencial_ben
       where codigo_potencial_ben = codigo;
    exception
       when no_data_found then
          raise_application_error(-20001, 'Cedula no encontrada');
 
    end;
 
    if nombre_1 is not null then
        if instr(upper(row_pot_ben.nombre_potencial_ben),upper(nombre_1))<>0 then
            ocurrencias:=ocurrencias+1;
	end if;
    end if;   
    if nombre_2 is not null then
        if instr(upper(row_pot_ben.nombre_potencial_ben),upper(nombre_2))<>0 then
            ocurrencias:=ocurrencias+1;
	end if;
    end if;
    if apellido_1 is not null then
        if instr(upper(row_pot_ben.nombre_potencial_ben),upper(apellido_1))<>0 then
            ocurrencias:=ocurrencias+1;       
        end if;
    end if;
    if apellido_2 is not null then
        if instr(upper(row_pot_ben.nombre_potencial_ben),upper(apellido_2))<>0 then
            ocurrencias:=ocurrencias+1;       
        end if;
    end if;
    if ocurrencias>=2 then
        id_pot_ben:=row_pot_ben.id_potencial_ben;
    else
        return 0;
    end if;
    --raise_application_error(-20001, 'Retornando '||id_pot_ben);
    return id_pot_ben;    
end;


