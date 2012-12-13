--
--Descripción: Este procedimiento aprueba una solicitud de reconsideración de pensión. Para ello se verifican los requisitos personales, la elegibilidad y la vigencia de la pensión
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@return: mensaje indicando si la reconsideración fue aprobada o denegada
--
function proc_reco_pen(persona_consultada number) return varchar2 is
    mensaje varchar2(2000):='';
    row_persona persona%rowtype;
    vigencia_pension number;
    requisitos_personales number;
    condicion_elegibilidad number;
    causa_denegacion number;
    otra_causa_denegacion varchar2(2000):=null;
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000);
begin
    begin
        select * into   row_persona from persona p where  p.id_persona = persona_consultada;
    exception
        when no_data_found then null;
    end;
    if not sql%found then
        msg_string := 'Persona no existe (id='||persona_consultada||')';
        raise_application_error(err_number, msg_string, true);
    end if;
    --Se intenta aprobar la reconsideración
    mensaje:=sp$persona.aprobar_reco_pen(persona_consultada, 'Reclamo Procesado automáticamente');
    --Si no se aprueba entonces se deniega
    if mensaje not like 'Reconsideración Aprobada' then
        --Se verifican requisitos personales
        requisitos_personales:=sp$persona.consultar_req_pers(persona_consultada);
        if requisitos_personales=0 then
            --Se verifica elegibilidad
            condicion_elegibilidad:=sp$persona.act_persona_elegible(persona_consultada);
            if condicion_elegibilidad=0 then
                vigencia_pension:=sp$persona.consultar_vig_pen(persona_consultada); 
                --Se verifica vigencia
                if vigencia_pension=99 then
                    causa_denegacion:=vigencia_pension;
                    otra_causa_denegacion:='Pensión No Vigente';
                end if;
            --Si persona no es elegible por un solo motivo
            elsif condicion_elegibilidad<>99 then
                causa_denegacion:=condicion_elegibilidad;
            --Si persona no es elegible por varios motivos
            else
                causa_denegacion:=99;
                otra_causa_denegacion:='Reconsideración denegada por varias objeciones';
            end if;
        else
            causa_denegacion:=requisitos_personales;
        end if;
        --Sabiendo la causa se deniega la reconsideración
        mensaje:=sp$persona.denegar_reco_pen(persona_consultada, causa_denegacion,otra_causa_denegacion,'Reclamo Procesado automáticamente');
    end if;
    return mensaje; 
end;