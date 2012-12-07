--
--Descripci�n: Este procedimiento verifica cumple los requisitos personales para solicitar una pensi�n
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@return: 0 si no hubo ninguna objeci�n, en caso de que haya habido una objeci�n, retorna el n�mero de objeci�n(De acuerdo a la tabla causa_den_pension)
--
function consultar_req_pers(persona_consultada number) return number is
    row_persona persona%rowtype;
    row_objecion objecion_ele_pen%rowtype;
    condicion number := 0;
    retcode number;
    err_number constant number := -20000; -- an integer in the range -20000..-20999
    msg_string varchar2(2000); -- a character string of at most 2048 bytes
begin
    begin
        select * into row_persona from persona where id_persona=persona_consultada;
    exception
        when no_data_found then
            msg_string := 'Persona ' || persona_consultada || ' no existe ';
            raise_application_error(err_number, msg_string, true);
    end;
    --Condici�n de no elegibilidad para pensi�n 12: Si la persona tiene certificado de defunci�n 
    if row_persona.certificado_defuncion is not null and row_persona.es_cer_defuncion_anulado=0 then
        condicion:=12;
    --Condici�n de no elegibilidad para pensi�n 13: Persona no es paraguayo natural
    elsif row_persona.es_paraguayo_natural=0 then
        condicion:=13;
    --Condici�n de no elegibilidad para pensi�n 14: Persona no tiene 65 a�os
    elsif ((months_between(sysdate,row_persona.fecha_nacimiento)/12)<65) then
        condicion:=14;
    end if;
    return condicion;
end;

