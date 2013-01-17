--
--Descripción: Este procedimiento consulta las objeciones que puede tener una persona a la obtención de una pensión y actualiza la elegibilidad de la persona, para ello verifica si se cumplen las condiciones que excluyen el pago de pensiones.
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@return: 0 si no hubo ninguna objeción, en caso de que haya habido una objeción, retorna el número de causa de no elegibilidad (De acuerdo a la tabla causa_den_pension)
--
function act_persona_elegible(persona_consultada number) return number is
    row_persona persona%rowtype;
    row_objecion objecion_ele_pen%rowtype;
    condicion number := 0;
    conta_objeciones number :=0;
    retcode number;
    resultado varchar2(4000);
    err_number constant number := -20000; -- an integer in the range -20000..-20999
    msg_string varchar2(2000); -- a character string of at most 2048 bytes
begin
    begin
        select * into row_persona from persona where id_persona=persona_consultada;
    exception
        when no_data_found then
            msg_string := 'persona ' || persona_consultada || ' no existe ';
            raise_application_error(err_number, msg_string, true);
    end;
    --Nuevo: Se verifican objeciones de elegibilidad utilizando WS
    resultado:=verif_ws_sinarh_jupe(row_persona.codigo_persona,row_persona.id_persona);
    
    --Se buscan las objeciones que tiene la persona
    for row_objecion in (
        select * from objecion_ele_pen 
        where id_persona=persona_consultada 
        and es_objecion_ele_pen_inactiva=0
    ) 
    loop
        conta_objeciones:=conta_objeciones+1;
        --Si la persona tiene empleo
        if row_objecion.numero_tipo_obj_ele_pen=21 then
            update persona 
            set es_persona_con_empleo=1,
            es_persona_elegible_para_pen=0
            where id_persona=persona_consultada;
            condicion:=21;
        --Si la persona tiene jubilacion
        elsif row_objecion.numero_tipo_obj_ele_pen=22 then
            update persona 
            set es_persona_con_jubilacion=1,
            es_persona_elegible_para_pen=0 
            where id_persona=persona_consultada;
            condicion:=22;
        --Si la persona tiene deuda
        elsif row_objecion.numero_tipo_obj_ele_pen=23 then
            update persona 
            set es_persona_con_deuda=1,
            es_persona_elegible_para_pen=0 
            where id_persona=persona_consultada;
            condicion:=23;
        --Si la persona tiene pena judicial
        elsif row_objecion.numero_tipo_obj_ele_pen=24 then
            update persona 
            set es_persona_con_pena_judicial=1,
            es_persona_elegible_para_pen=0 
            where id_persona=persona_consultada;
            condicion:=24;
        --Si la persona tiene otra pension
        elsif row_objecion.numero_tipo_obj_ele_pen=24 then
            update persona 
            set es_persona_con_pension=1,
            es_persona_elegible_para_pen=0 
            where id_persona=persona_consultada;
            condicion:=25;
        end if;
    end loop;                       
    --Si no hay objeciones se coloca la persona como elegible
    if conta_objeciones=0 then
        update persona 
        set es_persona_elegible_para_pen=1 
        where id_persona=persona_consultada;
    --Si hay mas de una objecion se retorna condicion 99=otra_causa
    elsif conta_objeciones>1 then
        condicion:=99;
    end if;
    --Se retorna la condicion de objeción a la elegibilidad
    return condicion;
end;
