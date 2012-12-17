function extract_id_persona(cedula varchar2,
                        nombre_1 varchar2, 
                        nombre_2 varchar2,
                        apellido_1 varchar2, 
                        apellido_2 varchar2, 
                        apellido_3 varchar2) return number is
 
--

    --type t_array is table of varchar2(50) index by binary_integer;
    
    id_persona number;
    
    row_persona persona%rowtype;
    
    codigo varchar2(255);
    
    nombre_concat varchar2(255);
    
    conta number := 0;
    
    array_nombres t_array;
    
    v5 number;
    
    i binary_integer;
    
begin

    --Se cambia la codificacion
    
    --set client_encoding = LATIN1;
    
    codigo := cedula;
    
    begin
    
       select * 
       into row_persona
       from persona 
       where codigo_persona = codigo;
    exception
       when no_data_found then
          raise_application_error(-20001, 'Cedula no encontrada');
          
    end;      
v5 := 1;
    if nombre_1 is null then
    
        return null;
        
    else
v5 := 2;    
        nombre_concat:=nombre_1;
        
        if nombre_2 is not null then
v5 := 3;        
            nombre_concat := nombre_concat||' '||nombre_2;
v5 := 4;            
        end if;
        
        if apellido_1 is not null then
v5 := 5;        
            nombre_concat := nombre_concat||' '||apellido_1;
v5 := 6;            
        end if;
        
        if apellido_2 is not null then
v5 := 7;        
            nombre_concat := nombre_concat||' '||apellido_2;
v5 := 8;            
        end if;
        
        if apellido_3 is not null then
v5 := 9;        
            nombre_concat := nombre_concat||' '||apellido_3;
v5 := 10;            
        end if;
        
    end if;
    
    --buscamos el primer nombre
v5 := 101;
    array_nombres:=SPLIT(row_persona.primer_nombre,' ');
    
    i := array_nombres.first;
    
    while i is not null loop   
    
v5 := 11;    
        if coalesce(to_char(array_nombres(i)), 'NULL') <> 'NULL' and instr(upper(nombre_concat),upper(array_nombres(i)))<>0 then
v5 := 111;            
            conta:=conta+1;
v5 := 112;                
        end if;
        
        i := array_nombres.next(i);       
 
    end loop;
    
    --buscamos el segundo nombre
    
    --array_nombres := null;
v5 := 12;    
    array_nombres:=SPLIT(row_persona.segundo_nombre,' ');
v5 := 13;    

    i := array_nombres.first;

   while i is not null loop   

       v5 := 14;
        
        if coalesce(to_char(array_nombres(i)), 'NULL') <> 'NULL' and instr(upper(nombre_concat),upper(array_nombres(i)))<>0 then
        
            conta:=conta+1;
            
        end if;        
        
        i := array_nombres.next(i);
    
    end loop;
    
    --buscamos el primer apellido
    
    --array_nombres:=null;
v5 := 15;    
    array_nombres:=SPLIT(row_persona.primer_apellido,' ');
v5 := 16;    

    i := array_nombres.first;

   while i is not null loop   

       v5 := 14;
        
        if coalesce(to_char(array_nombres(i)), 'NULL') <> 'NULL' and instr(upper(nombre_concat),upper(array_nombres(i)))<>0 then
        
            conta:=conta+1;
            
        end if;        
        
        i := array_nombres.next(i);
    
    end loop;
        
    --buscamos el segundo apellido
    
    --array_nombres:=null;
v5 := 17;    
    array_nombres:=SPLIT(row_persona.segundo_apellido,' ');
v5 := 18;    
    
        i := array_nombres.first;

   while i is not null loop   

       v5 := 14;
        
        if coalesce(to_char(array_nombres(i)), 'NULL') <> 'NULL' and instr(upper(nombre_concat),upper(array_nombres(i)))<>0 then
        
            conta:=conta+1;
            
        end if;        
        
        i := array_nombres.next(i);
    
    end loop;
    
    --buscamos el apellido casada
    
    --array_nombres:=null;
v5 := 19;    
    array_nombres:=SPLIT(row_persona.apellido_casada,' ');
v5 := 20;    

    i := array_nombres.first;

   while i is not null loop   

       v5 := 14;
        
        if coalesce(to_char(array_nombres(i)), 'NULL') <> 'NULL' and instr(upper(nombre_concat),upper(array_nombres(i)))<>0 then
        
            conta:=conta+1;
            
        end if;        
        
        i := array_nombres.next(i);
    
    end loop;
    
    --buscamos en el apodo
v5 := 21;    
    array_nombres:=SPLIT(row_persona.apodo,' ');
v5 := 22;   
    
   i := array_nombres.first;

   while i is not null loop   

       v5 := 14;
        
        if coalesce(to_char(array_nombres(i)), 'NULL') <> 'NULL' and instr(upper(nombre_concat),upper(array_nombres(i)))<>0 then
        
            conta:=conta+1;
            
        end if;        
        
        i := array_nombres.next(i);
    
    end loop;
    
    if conta>=2 then
    
        id_persona:=row_persona.id_persona;
        
    end if;
    
    return id_persona;
    
exception
   when others then
      raise_application_error(-20001, 'Error en EXTRACT_ID_PERSONA. Paso '||to_char(v5)||' Nombre '||row_persona.primer_nombre||' '||sqlerrm);
      
end;


