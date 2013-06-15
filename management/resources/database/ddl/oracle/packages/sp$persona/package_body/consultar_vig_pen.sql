--
--Descripci�n: Este procedimiento verifica que la pensi�n de una persona est� vigente, es decir, que el certificado de vida est� vigente o que el �ltimo cobro de pago lo est�.
--@param persona_consultada: persona sobre la que se ejecutara la funcion
--@return: 0 si no hubo ninguna objeci�n, si la pensi�n no est� vigente retorna 99
--
function consultar_vig_pen(persona_consultada number) return number is
    vigencia_cvr number;
    control_cobro_pension number;
    meses_vigencia_cvr number;
    meses_cobro_pension number;
    meses_transcurridos number;
    row_persona persona%rowtype;
    condicion number := 0;
    err_number constant number := -20000; -- an integer in the range -20000..-20999
    msg_string varchar2(2000); -- a character string of at most 2048 bytes
begin
    --Se extrae la persona
    begin
        select * into row_persona from persona where id_persona=persona_consultada;
    exception
        when no_data_found then
            msg_string := 'Persona ' || persona_consultada || ' no existe ';
            raise_application_error(err_number, msg_string, true);
    end;
    --Chequea si se esta verificando el cobro de las �ltimas pensiones
    begin
        select es_control_cobro_pension_activ into control_cobro_pension from parametro_global;
    exception
        when no_data_found then
            msg_string := 'Par�metro es_control_cobro_pension_activ no est� definido ';
            raise_application_error(err_number, msg_string, true);
    end;
    --Chequea si se est� verificando la vigencia del certificado de vida
    begin
        select es_control_cer_vida_activo into vigencia_cvr from parametro_global;
    exception
        when no_data_found then
            msg_string := 'Par�metro  es_control_cer_vida_activo no est� definido ';
            raise_application_error(err_number, msg_string, true);
    end;
    --Almacena el plazo m�ximo de cobro de pension
    begin
        select meses_ultimo_cobro_pension into meses_cobro_pension from parametro_global;
    exception
        when no_data_found then
            msg_string := 'Par�metro meses_cobro_pension no est� definido ';
            raise_application_error(err_number, msg_string, true);
    end;
    --Almacena el plazo m�ximo de vigencia de cvr
    begin    
        select meses_validez_certificado_vida into meses_vigencia_cvr from parametro_global;
    exception
        when no_data_found then
            msg_string := 'Par�metro meses_validez_certificado_vida no est� definido ';
            raise_application_error(err_number, msg_string, true);
    end;
    if control_cobro_pension=1 then
        --Si no hay registro de �ltimo cobro de pensi�n, no se hace nada.
        if row_persona.fecha_ultimo_cobro_pension is not null then
            --Calculo meses desde cobro de ultima pension
            meses_transcurridos:=months_between(sysdate,row_persona.fecha_ultimo_cobro_pension);
            --Persona se presume fallecida
            if meses_transcurridos>=meses_cobro_pension then
                condicion:=99;
            end if;
        end if;
    end if;
    if vigencia_cvr=1 then
        --Si no hay registro de certificado de vida y residencia, no se hace nada.
        if row_persona.fecha_certificado_vida is not null and row_persona.dias_vigencia_certificado_vida is not null   then
            --Calculo meses desde ultimo certificado de vida
            meses_transcurridos:=months_between(sysdate,row_persona.fecha_certificado_vida);
            --Persona se presume fallecida
            if meses_transcurridos>=meses_vigencia_cvr then
                condicion:=99;
            end if;
        end if;
    end if;
    return condicion;
end;
