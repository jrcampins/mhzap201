--
--Descripci�n: Este procedimiento consulta si una persona est� acreditada para optar por una pensi�n
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@return: 0 si no hubo ninguna objeci�n, en caso de que haya habido una objeci�n, retorna el n�mero de causa de no acreditaci�n
--
function consultar_acr(persona_consultada number) return number is
    icv_corte number;
    row_persona persona%rowtype;
    row_objecion objecion_ele_pen%rowtype;
    condicion number := 0;
    retcode number;
    err_number constant number := -20000; -- an integer in the range -20000..-20999
    msg_string varchar2(2000); -- a character string of at most 2048 bytes
begin
    --Se consulta el punto de corte
    begin
        select limite_indice_calidad_vida into icv_corte from parametro_global;
    exception
        when no_data_found then
            msg_string := 'ICV de corte no definido ';
            raise_application_error(err_number, msg_string, true);
    end;
    --Se extrae la persona
    begin
        select * into row_persona from persona where id_persona=persona_consultada;
    exception
        when no_data_found then
            msg_string := 'Persona ' || persona_consultada || ' no existe ';
            raise_application_error(err_number, msg_string, true);
    end;
    --Se verifica que la persona tenga indice de calidad de vida y tenga ficha persona 
    if (row_persona.indice_calidad_vida is null) then
        msg_string := 'Persona ' || persona_consultada || ' no  tiene Indice de Calidad de Vida ';
        raise_application_error(err_number, msg_string, true);
    --Se verifica fecha de ficha persona
    elsif (row_persona.id_ficha_persona is null) then
        condicion:=31;
    --Se verifica icv menor que 65
    elsif (row_persona.indice_calidad_vida>icv_corte) then
        condicion:=32;
    end if;
    return condicion;
end;

