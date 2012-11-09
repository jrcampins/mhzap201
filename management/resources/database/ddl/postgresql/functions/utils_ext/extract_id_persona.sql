--Este metodo devuelve el id_persona para un registro de archivo externo
create or replace function extract_id_persona(cedula varchar,nombre_1 varchar, nombre_2 varchar,apellido_1 varchar, apellido_2 varchar, apellido_3 varchar ) returns bigint as $$
declare
    id_persona bigint;
    row_persona persona;
    codigo varchar;
    nombre_concat varchar;
    conta integer:=0;
    array_nombres varchar[];
begin
    --Se cambia la codificacion
    set client_encoding to LATIN1;
    codigo:=cedula;
    select * into row_persona
    from persona where codigo_persona=codigo;
    if not found then
        raise exception 'Cedula no encontrada: %',codigo;
    end if;
    if nombre_1 is null then
        return null;
    else
        nombre_concat:=nombre_1;
        if nombre_2 is not null then
            nombre_concat:=nombre_concat||' '||nombre_2;
        end if;
        if apellido_1 is not null then
            nombre_concat:=nombre_concat||' '||apellido_1;
        end if;
        if apellido_2 is not null then
            nombre_concat:=nombre_concat||' '||apellido_2;
        end if;
        if apellido_3 is not null then
            nombre_concat:=nombre_concat||' '||apellido_3;
        end if;
    end if;
    --buscamos el primer nombre
    array_nombres:=split_with_spaces(row_persona.primer_nombre);
    if(array_nombres is not null) then
        if(array_nombres[1] is not null and strpos(upper(nombre_concat),upper(array_nombres[1]))<>0) then
            conta:=conta+1;
        end if;
        if(array_nombres[2] is not null and strpos(upper(nombre_concat),upper(array_nombres[2]))<>0) then
            conta:=conta+1;
        end if;
        if(array_nombres[3] is not null and strpos(upper(nombre_concat),upper(array_nombres[3]))<>0) then
            conta:=conta+1;
        end if;
    end if;
    --buscamos el segundo nombre
    array_nombres:=null;
    array_nombres:=split_with_spaces(row_persona.segundo_nombre);
    if(array_nombres is not null) then
        if(array_nombres[1] is not null and strpos(upper(nombre_concat),upper(array_nombres[1]))<>0) then
            conta:=conta+1;
        end if;
        if(array_nombres[2] is not null and strpos(upper(nombre_concat),upper(array_nombres[2]))<>0) then
            conta:=conta+1;
        end if;
        if(array_nombres[3] is not null and strpos(upper(nombre_concat),upper(array_nombres[3]))<>0) then
            conta:=conta+1;
        end if;
    end if;
    --buscamos el primer apellido
    array_nombres:=null;
    array_nombres:=split_with_spaces(row_persona.primer_apellido);
    if(array_nombres is not null) then
        if(array_nombres[1] is not null and strpos(upper(nombre_concat),upper(array_nombres[1]))<>0) then
            conta:=conta+1;
        end if;
        if(array_nombres[2] is not null and strpos(upper(nombre_concat),upper(array_nombres[2]))<>0) then
            conta:=conta+1;
        end if;
        if(array_nombres[3] is not null and strpos(upper(nombre_concat),upper(array_nombres[3]))<>0) then
            conta:=conta+1;
        end if;
    end if;
    --buscamos el segundo apellido
    array_nombres:=null;
    array_nombres:=split_with_spaces(row_persona.segundo_apellido);
    if(array_nombres is not null) then
        if(array_nombres[1] is not null and strpos(upper(nombre_concat),upper(array_nombres[1]))<>0) then
            conta:=conta+1;
        end if;
        if(array_nombres[2] is not null and strpos(upper(nombre_concat),upper(array_nombres[2]))<>0) then
            conta:=conta+1;
        end if;
        if(array_nombres[3] is not null and strpos(upper(nombre_concat),upper(array_nombres[3]))<>0) then
            conta:=conta+1;
        end if;
    end if;
    --buscamos el apellido casada
    array_nombres:=null;
    array_nombres:=split_with_spaces(row_persona.apellido_casada);
    if(array_nombres is not null) then
        if(array_nombres[1] is not null and strpos(upper(nombre_concat),upper(array_nombres[1]))<>0) then
            conta:=conta+1;
        end if;
        if(array_nombres[2] is not null and strpos(upper(nombre_concat),upper(array_nombres[2]))<>0) then
            conta:=conta+1;
        end if;
        if(array_nombres[3] is not null and strpos(upper(nombre_concat),upper(array_nombres[3]))<>0) then
            conta:=conta+1;
        end if;
    end if;
    --buscamos en el apodo
    array_nombres:=split_with_spaces(row_persona.apodo);
    if(array_nombres is not null) then
        if(array_nombres[1] is not null and strpos(upper(nombre_concat),upper(array_nombres[1]))<>0) then
            conta:=conta+1;
        end if;
        if(array_nombres[2] is not null and strpos(upper(nombre_concat),upper(array_nombres[2]))<>0) then
            conta:=conta+1;
        end if;
        if(array_nombres[3] is not null and strpos(upper(nombre_concat),upper(array_nombres[3]))<>0) then
            conta:=conta+1;
        end if;
    end if;
    if conta>=2 then
        id_persona:=row_persona.id_persona;
    end if;
    set client_encoding to UTF8;
    return id_persona;
end;
$$ language'plpgsql';