--
--Descripción: Este procedimiento procesa una denuncia asociada con una pensión aprobada
--@param rastro: Identificador del proceso ejecutado.
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function persona_procesar_denuncia_pension(rastro bigint, persona_consultada bigint) returns integer as $$
declare
mensaje varchar:='';
begin
    select persona_procesar_denuncia_pension(persona_consultada) into mensaje;
    return rastro_proceso_update(rastro, 21, null, mensaje);
end;
$$ language plpgsql;
--
--Descripción: Este procedimiento procesa una denuncia asociada con una pensión aprobada
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function persona_procesar_denuncia_pension(persona_consultada bigint) returns varchar as $$
declare
    mensaje varchar:='';
    row_persona persona;
    vigencia_pension integer;
    requisitos_personales integer;
    condicion_elegibilidad integer;
    causa_revocacion integer;
    otra_causa_revocacion varchar:=null;
begin
    select *
    into   row_persona
    from   persona as p
    where  p.id_persona = persona_consultada;
    if not found then
        raise exception 'Persona no existe (id=%)', persona_consultada;
    end if;
    --Se intenta desmentir la denuncia
    mensaje:=persona_desmentir_denu_pen(persona_consultada,'Denuncia Procesada Automáticamente');
    --Si no se desmiente entonces se confirma, revocando la pensión aprobada
    if mensaje not like 'Denuncia Desmentida' then
        requisitos_personales:=persona_consultar_requisitos_personales(persona_consultada);
        if requisitos_personales=0 then
            condicion_elegibilidad:=persona_actualizar_persona_elegible(persona_consultada);
            --Si persona no es elegible por un solo motivo
            if condicion_elegibilidad <>99 then
                causa_revocacion:=condicion_elegibilidad;
            --Si persona no es elegible por varios motivos
            else
                causa_revocacion:=99;
                otra_causa_revocacion:='Denuncia confirmada por varios motivos';
            end if;
        else
            causa_revocacion:=requisitos_personales;
        end if;
        mensaje:=persona_confirmar_denu_pen(persona_consultada,causa_revocacion,otra_causa_revocacion,'Denuncia Procesada Automáticamente');
    end if;
    return mensaje; 
end;
$$ language plpgsql;
