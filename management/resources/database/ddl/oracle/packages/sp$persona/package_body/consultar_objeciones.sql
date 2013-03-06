--
--Descripción: Este procedimiento consulta las objeciones que puede tener una persona a la obtención de una pensión y actualiza la elegibilidad de la persona, para ello verifica si se cumplen las condiciones que excluyen el pago de pensiones.
--@param id_persona: id de la persona sobre la que se ejecutara la funcion
--@param codigo: codigo de la persona sobre la que se ejecutara
--@return: 0 si no hubo ninguna objeción, en caso de que haya habido una objeción, retorna el número de causa de no elegibilidad (De acuerdo a la tabla causa_den_pension)
--
function consultar_objeciones(persona_consultada number) return number is
    row_persona persona%rowtype;
    conta_objeciones number:=0;
    id_persona_act number;
    condicion number;
    row_objecion objecion_ele_pen%rowtype;
begin
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
    if conta_objeciones>1 then
        condicion:=99;
    end if;
    return condicion;
end;