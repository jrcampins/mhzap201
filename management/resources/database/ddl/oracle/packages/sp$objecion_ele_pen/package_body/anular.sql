--Esta función anula una objeción de elegibilidad actualizando 
--@param ficha a vincular
--@return 0 si se ejecuto sin errores.
function anular(objecion number, comentarios varchar2) return varchar2 is
    row_objecion objecion_ele_pen%rowtype;
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000); -- a character string of at most 2048 bytes
    mensaje varchar2(2000);
    condicion number:=0;
begin
    begin
        select * into row_objecion from objecion_ele_pen where id_objecion_ele_pen=objecion;
    exception
        when no_data_found then null;
    end;
    if not sql%found then
        msg_string := 'Objeción no encontrada';
        raise_application_error(err_number, msg_string, true);
    end if;
    --Solo se puede desactivar una objeción Activa
    if row_objecion.es_objecion_ele_pen_inactiva=1 then
        msg_string := 'Objeción ya fue desactivada';
        raise_application_error(err_number, msg_string, true);
    end if;
    --Se inactiva la objeción
    update objecion_ele_pen
    set es_objecion_ele_pen_inactiva=1,
    fecha_anulacion=sysdate,
    observaciones_anulacion=comentarios
    where id_objecion_ele_pen=objecion;
    --Caso especial: si la objeción es de defunción se inactiva
    if row_objecion.numero_tipo_obj_ele_pen=12 then
        update persona
        set es_cer_defuncion_anulado =1
        where  id_persona = row_objecion.id_persona;
    end if;
    --Se actualiza la elegibilidad de la persona.
    condicion:=sp$persona.act_persona_elegible(row_objecion.id_persona);
    dbms_output. put_line('condicion '||condicion);
    if condicion=0 then
        mensaje:='Objeción Anulada. La persona no tiene otras objeciones';
    else
        mensaje:='Objeción Anulada';
    end if;
    return mensaje;
end;
