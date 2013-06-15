--
--Descripción: Este procedimiento verifica que la cedula y cvr de la persona estén vigentes;
--@param persona_consultada: persona sobre la que se ejecutara la funcion
--@return: 0 si no hubo ninguna objeción, si la pensión no está vigente retorna 99
--
function consultar_cedula_cvr(persona_consultada number) return varchar2 is
    vigencia_cvr number;
    control_cobro_pension number;
    meses_vigencia_cvr number;
    meses_cobro_pension number;
    meses_transcurridos number;
    row_persona persona%rowtype;
    mensaje varchar2(4000):='';
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
    --Nuevo: Verificar vigencia de cédula de persona.
    if row_persona.fecha_vencimiento_cedula is null then
        mensaje:=mensaje||' Persona sin fecha de vencimiento de cédula.';
    elsif sysdate>row_persona.fecha_vencimiento_cedula then
        mensaje:=mensaje||' Persona sin cédula vigente.';
    end if;
    --Nuevo: Verificar certificado de vida de la persona.
    if row_persona.fecha_certificado_vida is null then
        mensaje:=mensaje||' Certificado de Vida sin Fecha de Vencimiento.';
    elsif row_persona.dias_vigencia_certificado_vida is null then
        mensaje:=mensaje||' Certificado de Vida sin días de vigencia';
    elsif row_persona.es_certificado_vida_anulado=1 then
        mensaje:=mensaje||' Certificado de Vida anulado';
    elsif sysdate>row_persona.fecha_certificado_vida + row_persona.dias_vigencia_certificado_vida then
        mensaje:=mensaje||' Certificado de Vida vencido';
    end if;
    return mensaje;
end;