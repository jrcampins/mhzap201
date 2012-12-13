--
--Descripción: Este procedimiento procesa una denuncia asociada con una pensión aprobada
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@return: 0 si no se produjo ninguna excepcion.
--
function proc_denu_pen(persona_consultada number) return varchar2 is
    mensaje varchar2(2000):='';
    row_persona persona%rowtype;
    vigencia_pension number;
    requisitos_personales number;
    condicion_elegibilidad number;
    causa_revocacion number;
    otra_causa_revocacion varchar2(2000):=null;
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
    --Se intenta desmentir la denuncia
    mensaje:=sp$persona.desmentir_denu_pen(persona_consultada,'Denuncia Procesada Automáticamente');
    --Si no se desmiente entonces se confirma, revocando la pensión aprobada
    if mensaje not like 'Denuncia Desmentida' then
        requisitos_personales:=sp$persona.consultar_req_pers(persona_consultada);
        if requisitos_personales=0 then
            condicion_elegibilidad:=sp$persona.act_persona_elegible(persona_consultada);
            --Si persona no es elegible por un solo motivo
            if condicion_elegibilidad <>99 then
                causa_revocacion:=condicion_elegibilidad;
            --Si persona no es elegible por varios motivos
            else
                causa_revocacion:=99;
                otra_causa_revocacion:='Denuncia confirmada por varias objeciones';
            end if;
        else
            causa_revocacion:=requisitos_personales;
        end if;
        mensaje:=sp$persona.confirmar_denu_pen(persona_consultada,causa_revocacion,otra_causa_revocacion,'Denuncia Procesada Automáticamente');
    end if;
    return mensaje; 
end;
