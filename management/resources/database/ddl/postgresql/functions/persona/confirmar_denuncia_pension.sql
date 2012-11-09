--
--Descripción: Este procedimiento permite confirmar una denuncia de una pensión ya aprobada
--@param rastro: Identificador del proceso ejecutado.
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@param numero_causa: Número de causa por la que se revoca la pensión
--@param otra_causa: En caso de que la causa sea otra, se especifica
--@param comentarios: Comentarios de la confirmación de denuncia
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function persona_confirmar_denu_pen(rastro bigint, persona_consultada bigint, numero_causa integer, otra_causa varchar, comentarios varchar) returns integer as $$
declare
mensaje varchar:='';
begin
    select persona_confirmar_denu_pen(persona_consultada, numero_causa, otra_causa, comentarios) into mensaje;
    return rastro_proceso_update(rastro, 21, null, mensaje);
end;
$$ language plpgsql;
--
--Descripción: Este procedimiento permite confirmar una denuncia de una pensión ya aprobada, en caso de confirmarla revoca la pensión ya aprobada
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@param numero_causa: Número de causa por la que se revoca la pensión
--@param otra_causa: En caso de que la causa sea otra, se especifica
--@param comentarios: Comentarios de la confirmación de denuncia
--@return: Mensaje indicando que se confirmó la denuncia, si no se produjo ninguna excepcion.
--
create or replace function persona_confirmar_denu_pen(persona_consultada bigint, numero_causa integer, otra_causa varchar, comentarios varchar) returns varchar as $$
declare
    row_persona persona;
    mensaje varchar:='';
    mensaje_confirmacion_denuncia_pension varchar:='';
begin
    select *
    into   row_persona
    from   persona as p
    where  p.id_persona = persona_consultada;
    if not found then
        raise exception 'Persona no existe (id=%)', persona_consultada;
    end if;
    --Solamente se pueden confirmar denuncias registradas
    if row_persona.numero_condicion_denu_pen<>1 then
        raise exception 'Persona no tiene denuncia registrada';
    end if;
    --Se determina el mensaje de confirmación de la denuncia
    select crp.codigo_causa_rev_pension 
    into mensaje_confirmacion_denuncia_pension 
    from causa_rev_pension crp
    where crp.numero_causa_rev_pension=numero_causa;
    --Se confirma la denuncia y se revoca la pension
    update persona 
    set    numero_condicion_pension =4,
           numero_causa_rev_pension=numero_causa,
           otra_causa_rev_pension=otra_causa,
           fecha_revocacion_pension = CURRENT_TIMESTAMP,
           comentarios_revocacion_pension='Pensión revocada por denuncia',
           numero_condicion_denu_pen = 2,
           fecha_confirmacion_denu_pen  = CURRENT_TIMESTAMP,
           comentarios_conf_denu_pen= comentarios
    where  id_persona = persona_consultada;

    mensaje:='Denuncia Confirmada, Pensión Revocada: '||mensaje_confirmacion_denuncia_pension ;
    return mensaje;
end;
$$ language plpgsql;