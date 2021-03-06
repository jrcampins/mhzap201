--
--Descripci�n: Este procedimiento consulta las objeciones que puede tener una persona a la obtenci�n de una pensi�n y actualiza la elegibilidad de la persona, para ello verifica si se cumplen las condiciones que excluyen el pago de pensiones.
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@return: 0 si no hubo ninguna objeci�n, en caso de que haya habido una objeci�n, retorna el n�mero de causa de no elegibilidad (De acuerdo a la tabla causa_den_pension)
--
function act_persona_elegible(persona_consultada number) return number is
    row_persona persona%rowtype;
    row_objecion objecion_ele_pen%rowtype;
    condicion number := 0;
    conta_objeciones number :=0;
    retcode number;
    resultado varchar2(4000);
    objeciones number;
    err_number constant number := -20000; -- an integer in the range -20000..-20999
    msg_string varchar2(2000); -- a character string of at most 2048 bytes
begin
    --dbms_output.put_line('entro');
    begin
        select * into row_persona from persona where id_persona=persona_consultada;
    exception
        when no_data_found then
            msg_string := 'persona ' || persona_consultada || ' no existe ';
            raise_application_error(err_number, msg_string, true);
    end;
    --Actualizar las objeciones de una persona
    objeciones:=actualizar_objeciones(row_persona.id_persona);
    --dbms_output.put_line('total de objeciones recibidas'||objeciones);
    --Nuevo: Se verifican objeciones de elegibilidad utilizando WS
    resultado:=verif_ws_sinarh_jupe(row_persona.codigo_persona,row_persona.id_persona);
    --Nuevo: Se reinician las objeciones de la persona:
    update persona 
    set es_persona_elegible_para_pen=1,
        es_persona_con_empleo=0,
        es_persona_con_jubilacion=0,
        es_persona_con_deuda=0,
        es_persona_con_pena_judicial=0,
        es_persona_con_pension=0,
        es_persona_con_subsidio=0
    where id_persona=persona_consultada;
    --dbms_output.put_line('objeciones '||objeciones);
    --Se buscan las objeciones que tiene la persona (Nuevo: solo si hay objeciones que buscar)    
    if objeciones>0 then
        for row_objecion in (
            select * from objecion_ele_pen 
            where id_persona=persona_consultada 
            and es_objecion_ele_pen_inactiva=0
        ) 
        loop
            conta_objeciones:=conta_objeciones+1;
            --Si la persona es fallecida. No hay que cambiar bandera
            if row_objecion.numero_tipo_obj_ele_pen=12 then
                update persona 
                set es_persona_elegible_para_pen=0
                where id_persona=persona_consultada;
                condicion:=12;
            --Si la persona tiene empleo
            elsif row_objecion.numero_tipo_obj_ele_pen=21 then
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
            elsif row_objecion.numero_tipo_obj_ele_pen=25 then
                update persona 
                set es_persona_con_pension=1,
                es_persona_elegible_para_pen=0 
                where id_persona=persona_consultada;
                condicion:=25;
            --Si la persona tiene subsidio
            elsif row_objecion.numero_tipo_obj_ele_pen=26 then
                update persona 
                set es_persona_con_subsidio=1,
                es_persona_elegible_para_pen=0 
                where id_persona=persona_consultada;
                condicion:=26;
            end if;
        end loop;
    --Si no hay objeciones se cambia el estado de la pensi�n
    elsif conta_objeciones=0 then
        --Nuevo: actualizar la persona en caso de que no tenga objeciones
        if row_persona.numero_condicion_pension=7 then
            update persona 
            set numero_condicion_pension=5,
            fecha_otorgamiento_pen=sysdate,
            comentarios_otorgamiento_pen='Pensi�n otorgada por objeciones anuladas.'
            where id_persona=persona_consultada;
        elsif row_persona.numero_condicion_pension=3 then
            update persona 
            set numero_condicion_pension=1,
            fecha_solicitud_pension=sysdate,
            comentarios_solicitud_pension='Pensi�n solicitada por objeciones anuladas.'
            where id_persona=persona_consultada;
        end if;
    --Si hay mas de una objecion se retorna condicion 99=otra_causa
    elsif conta_objeciones>1 then
        condicion:=99;
    end if;
    --Se retorna la condicion de objeci�n a la elegibilidad
    return condicion;
end;
