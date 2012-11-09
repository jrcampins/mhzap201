--
--Descripción: Este procedimiento aprueba o deniega una solicitud de reconsideración de pensión
--@param rastro: Identificador del proceso ejecutado.
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function persona_procesar_reconsideracion_pension(rastro bigint, persona_consultada bigint) returns integer as $$
declare
    mensaje varchar:='';
begin
    select persona_procesar_reconsideracion_pension(persona_consultada,comentarios) into mensaje;
    return rastro_proceso_update(rastro, 21, null, mensaje);
end;
$$ language plpgsql;
--
--Descripción: Este procedimiento aprueba una solicitud de reconsideración de pensión. Para ello se verifican los requisitos personales, la elegibilidad y la vigencia de la pensión
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@return: mensaje indicando si la reconsideración fue aprobada o denegada
--
create or replace function persona_procesar_reconsideracion_pension(persona_consultada bigint) returns varchar as $$
declare
    mensaje varchar:='';
    row_persona persona;
    vigencia_pension integer;
    requisitos_personales integer;
    condicion_elegibilidad integer;
    causa_denegacion integer;
    otra_causa_denegacion varchar:=null;
begin
    select *
    into   row_persona
    from   persona as p
    where  p.id_persona = persona_consultada;
    if not found then
        raise exception 'Persona no existe (id=%)', persona_consultada;
    end if;
    --Se intenta aprobar la reconsideración
    mensaje:=persona_aprobar_reco_pen(persona_consultada, 'Reclamo Procesado automáticamente');
    --Si no se aprueba entonces se deniega
    if mensaje not like 'Reconsideración Aprobada' then
        --Se verifican requisitos personales
        requisitos_personales:=persona_consultar_requisitos_personales(persona_consultada);
        if requisitos_personales=0 then
            --Se verifica elegibilidad
            condicion_elegibilidad:=persona_actualizar_persona_elegible(persona_consultada);
            if condicion_elegibilidad=0 then
                vigencia_pension:=persona_consultar_vigencia_pension(persona_consultada); 
                --Se verifica vigencia
                if vigencia_pension=99 then
                    causa_denegacion=vigencia_pension;
                    otra_causa_denegacion:='Pensión No Vigente';
                end if;
            --Si persona no es elegible por un solo motivo
            elsif condicion_elegibilidad<>99 then
                causa_denegacion:=condicion_elegibilidad;
            --Si persona no es elegible por varios motivos
            else
                causa_denegacion:=99;
                otra_causa_denegacion:='Reconsideración denegada por varios motivos';
            end if;
        else
            causa_denegacion:=requisitos_personales;
        end if;
        --Sabiendo la causa se deniega la reconsideración
        mensaje:=persona_denegar_reco_pen(persona_consultada, causa_denegacion,otra_causa_denegacion,'Reclamo Procesado automáticamente');
    end if;
    return mensaje; 
end;
$$ language plpgsql;