--
--Descripci�n: Este procedimiento verifica cumple los requisitos personales para solicitar una pensi�n
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@return: 0 si no hubo ninguna objeci�n, en caso de que haya habido una objeci�n, retorna el n�mero de objeci�n(De acuerdo a la tabla causa_den_pension)
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
    --Condici�n de no elegibilidad para pensi�n 12: Si la persona tiene certificado de defunci�n 
    if row_persona.certificado_defuncion is not null and row_persona.es_cer_defuncion_anulado=0 then
        condicion:=12;
    --Condici�n de no elegibilidad para pensi�n 13: Persona no es paraguayo natural
    elsif row_persona.es_paraguayo_natural=0 then
        condicion:=13;
    --Condici�n de no elegibilidad para pensi�n 14: Persona no tiene 65 a�os
    elsif date_part('year',age(row_persona.fecha_nacimiento))<65 then
        condicion:=14;
    end if;
    return condicion;
end;
$$ language plpgsql;
