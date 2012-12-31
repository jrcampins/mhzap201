--
--Descripci�n: Este procedimiento revoca una pensi�n aprobada
--@param rastro: Identificador del proceso ejecutado.
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@param numero_causa: numero de la causa de revocaci�n
--@param otra_causa: descripcion de otra causa de revocaci�n
--@param comentarios: Comentarios de la revocaci�n
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function persona_revocar_pension(rastro bigint, persona_consultada bigint, numero_causa integer, otra_causa varchar, comentarios varchar) returns integer as $$
declare
mensaje varchar:='';
begin
    select persona_revocar_pension(persona_consultada, numero_causa, otra_causa, comentarios) into mensaje;
    return rastro_proceso_update(rastro, 21, null, mensaje);
end;
$$ language plpgsql;
--
--Descripci�n: Este procedimiento revoca una pensi�n ya aprobada. Para ello registra los motivos indicados por el usuario
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@param numero_causa: numero de la causa de denegaci�n
--@param otra_causa: descripcion de otra causa de denegaci�n
--@param comentarios: Comentarios de la solicitud
--@return: mensaje indicando la condici�n de ejecuci�n del proceso.
--
create or replace function persona_revocar_pension(persona_consultada bigint, numero_causa integer, otra_causa varchar, comentarios varchar) returns varchar as $$
declare
    row_persona persona;
    v_numero_causa integer;
    v_otra_causa varchar;
    mensaje varchar:='';
begin
    select *
    into   row_persona
    from   persona as p
    where  p.id_persona = persona_consultada;
    if not found then
        raise exception 'Persona no existe (id=%)', persona_consultada;
    end if;
    --Solo se revocan pensiones aprobadas
    if (row_persona.numero_condicion_pension <>2 and row_persona.numero_condicion_pension <>5) then
        raise exception 'Persona no tiene pensi�n aprobada ni otorgada a revocar';
    end if;
    --
    if numero_causa is null then
        v_numero_causa := 99;
    else
        v_numero_causa := v_numero_causa;
    end if;
    if v_numero_causa = 99 then
        v_otra_causa := btrim(otra_causa);
        if v_otra_causa is null or v_otra_causa = '' then
            v_otra_causa := 'Causa no especificada';
        end if;
    end if;
    --Este proceso no hace ninguna validaci�n, solo se registran los datos indicados por el usuario.
    update persona 
    set    numero_condicion_pension = 4,
           fecha_revocacion_pension = CURRENT_TIMESTAMP,
           numero_causa_rev_pension = v_numero_causa,
           otra_causa_rev_pension = v_otra_causa,
           comentarios_revocacion_pension = comentarios
    where  id_persona = persona_consultada;
    mensaje:='Pensi�n Revocada';
    return mensaje;
end;
$$ language plpgsql;
