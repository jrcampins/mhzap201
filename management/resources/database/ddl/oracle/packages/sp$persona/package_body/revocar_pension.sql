--
--Descripción: Este procedimiento revoca una pensión ya aprobada. Para ello registra los motivos indicados por el usuario
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@param numero_causa: numero de la causa de denegación
--@param otra_causa: descripcion de otra causa de denegación
--@param comentarios: Comentarios de la solicitud
--@return: mensaje indicando la condición de ejecución del proceso.
--
function revocar_pension(persona_consultada number, numero_causa number, otra_causa varchar2, comentarios varchar2) return varchar2 is
    v_numero_causa number;
    v_otra_causa varchar2(200);
    mensaje_denegacion_pension varchar2(200):='';
    mensaje varchar2 (200):='';
    row_persona persona%rowtype;
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000);
begin
    begin
        select * into row_persona from persona p where  p.id_persona = persona_consultada;
    exception
        when no_data_found then null;
    end;
    if not sql%found then
        msg_string := 'Persona no existe (id='||persona_consultada||')';
        raise_application_error(err_number, msg_string, true);
    --
    --Solo se revocan pensiones aprobadas
    --
    elsif (row_persona.numero_condicion_pension <>2 and row_persona.numero_condicion_pension <>5 and row_persona.numero_condicion_pension <>7) then
        msg_string := 'Persona no tiene pensión a revocar';
        raise_application_error(err_number, msg_string, true);
    --
    --Este proceso no hace ninguna validación, solo se registran los datos indicados por el usuario.
    --
    else
        if numero_causa is null then
            v_numero_causa := 99;
        else
            v_numero_causa := numero_causa;
        end if;
        if v_numero_causa = 99 then
            v_otra_causa := trim(otra_causa);
            if v_otra_causa is null or v_otra_causa = '' then
                v_otra_causa := 'Causa no especificada';
            end if;
        end if;
        update persona 
        set    numero_condicion_pension = 4,
               fecha_revocacion_pension = trunc(current_timestamp),
               numero_causa_rev_pension = v_numero_causa,
               otra_causa_rev_pension = v_otra_causa,
               comentarios_revocacion_pension = comentarios
        where  id_persona = persona_consultada;
        mensaje:='Pensión Revocada';
        return mensaje;
    end if;
end;
