--
--Descripción: Este procedimiento realiza las verificaciones necesarias para 
--validar la elegibilidad de personas ya insertadas en el jupe
--@param ubicacion_consultada: Identificador de la ubicacion a consultar
--@return: mensaje indicando la cantidad de personas elegibles y no elegibles
--
function verificar_ele_pen_jupe return varchar2 is
     mensaje varchar2(4000):='';
     conta_excluir number:=0;
     conta_personas number:=0;
     condicion_elegibilidad number;
     row_persona persona%rowtype;
     err_number  constant number := -20000; -- an integer in the range -20000..-20999
     msg_string  varchar2(2000); -- a character string of at most 2048 bytes
begin
    for row_persona in (select* from persona where numero_condicion_pension=5 
                                and numero_tipo_act_jupe = 1 
                                and fecha_hora_ult_act_jupe is not null) loop
        conta_personas:=conta_personas+1;
        condicion_elegibilidad:=sp$persona.act_persona_elegible(row_persona.id_persona);
        --Si la persona no es elegible se marca como a excluir
        if(condicion_elegibilidad!=0) then
            update persona
            set numero_condicion_pension=7
            where id_persona=row_persona.id_persona;
            conta_excluir:=conta_excluir+1;
        end if;
    end loop;
    mensaje:='Se procesaron '||conta_personas||' Personas . Se marcan '||conta_excluir||' personas como a excluir';
    return mensaje;
end;