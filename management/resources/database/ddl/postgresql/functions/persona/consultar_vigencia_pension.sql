--
--Descripción: Este procedimiento verifica que la pensión de una persona esté vigente, es decir, que el certificado de vida esté vigente o que el último cobro de pago lo esté.
--@param persona_consultada: persona sobre la que se ejecutara la funcion
--@return: 0 si no hubo ninguna objeción, si la pensión no está vigente retorna 99
--
create or replace function persona_consultar_vigencia_pension(persona_consultada bigint) returns integer as $$
declare
    vigencia_cvr integer;
    control_cobro_pension integer;
    meses_vigencia_cvr integer;
    meses_cobro_pension integer;
    meses_transcurridos integer;
    row_persona persona;
    condicion integer := 0;
begin
    select *
    into   row_persona
    from   persona as p
    where  p.id_persona = persona_consultada;
    if not found then
        raise exception 'Persona no existe (id=%)', persona_consultada;
    end if;
    --Chequea si se esta verificando el cobro de las últimas pensiones
    select es_control_cobro_pension_activ
    into control_cobro_pension
    from parametro_global;
    --Chequea si se está verificando la vigencia del certificado de vida
    select es_control_cer_vida_activo 
    into vigencia_cvr
    from parametro_global;
    --Almacena el plazo máximo de cobro de pension
    select meses_ultimo_cobro_pension
    into meses_cobro_pension
    from parametro_global;
    --Almacena el plazo máximo de vigencia de cvr
    select meses_validez_certificado_vida
    into meses_vigencia_cvr
    from parametro_global;
    if control_cobro_pension=1 then
        --Si no hay registro de último cobro de pensión, no se hace nada.
        if row_persona.fecha_ultimo_cobro_pension is not null then
            --Calculo meses desde cobro de ultima pension
            meses_transcurridos:=date_part('month',age(row_persona.fecha_ultimo_cobro_pension))+12*date_part('year',age(row_persona.fecha_ultimo_cobro_pension));
            --Persona se presume fallecida
            if meses_transcurridos>=meses_cobro_pension then
                condicion:=99;
            end if;
        end if;
    end if;
    if vigencia_cvr=1 then
        --Si no hay registro de certificado de vida y residencia, no se hace nada.
        if row_persona.fecha_certificado_vida is not null then
            --Calculo meses desde ultimo certificado de vida
            meses_transcurridos:=date_part('month',age(row_persona.fecha_certificado_vida))+12*date_part('year',age(row_persona.fecha_certificado_vida));
            --Persona se presume fallecida
            if meses_transcurridos>=meses_vigencia_cvr then
                condicion:=99;
            end if;
        end if;
    end if;
    return condicion;
end;
$$ language plpgsql;