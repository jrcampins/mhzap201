--
--Descripción: Este procedimiento verifica cumple los requisitos personales para solicitar una pensión
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@return: 0 si no hubo ninguna objeción, en caso de que haya habido una objeción, retorna el número de objeción(De acuerdo a la tabla causa_den_pension)
--
create or replace function persona_consultar_requisitos_personales(persona_consultada bigint) returns integer as $$
declare
    row_persona persona;
    condicion integer:=0;
begin
    select *
    into   row_persona
    from   persona as p
    where  p.id_persona = persona_consultada;
    if not found then
        raise exception 'Persona no existe (id=%)', persona_consultada;
    end if;
    --Condición de no elegibilidad para pensión 12: Si la persona tiene certificado de defunción 
    if row_persona.certificado_defuncion is not null and row_persona.es_cer_defuncion_anulado=0 then
        condicion:=12;
    --Condición de no elegibilidad para pensión 13: Persona no es paraguayo natural
    elsif row_persona.es_paraguayo_natural=0 then
        condicion:=13;
    --Condición de no elegibilidad para pensión 14: Persona no tiene 65 años
    elsif date_part('year',age(row_persona.fecha_nacimiento))<65 then
        condicion:=14;
    end if;
    return condicion;
end;
$$ language plpgsql;
