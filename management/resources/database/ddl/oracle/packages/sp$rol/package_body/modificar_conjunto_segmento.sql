function modificar_conjunto(r number, c number, segmentada number) return varchar2 is
    row_rol rol%rowtype;
    row_conjunto_segmento conjunto_segmento%rowtype;
    mensaje varchar2(4000);
    err_number constant number := -20000; -- an integer in the range -20000..-20999
    msg_string varchar2(2000); -- a character string of at most 2048 bytes
begin
    begin
        select * into row_rol from rol where id_rol = r;
    exception
        when no_data_found then
            msg_string := 'rol ' || r || ' no existe ';
            raise_application_error(err_number, msg_string, true);
    end;
    /**/
    begin
        select * into row_conjunto_segmento from conjunto_segmento where id_conjunto_segmento = c;
    exception
        when no_data_found then
            msg_string := 'conjunto de segmentos ' || c || ' no existe ';
            raise_application_error(err_number, msg_string, true);
    end;
    if segmentada <> 0 then
        mensaje := 'se modificaron solo las funciones del rol que ya estaban segmentadas con un conjunto de la misma clase del conjunto de segmentos especificado';
        update	rol_funcion
        set	id_conjunto_segmento = c
        where	id_rol = r
        and	id_conjunto_segmento in
                (
                select	id_conjunto_segmento
                from	conjunto_segmento
                where	id_clase_recurso = row_conjunto_segmento.id_clase_recurso
                )
        and	id_conjunto_segmento <> c;
    else
        mensaje := 'se modificaron todas las funciones del rol que podian ser segmentadas utilizando el conjunto de segmentos especificado';
        update	rol_funcion
        set	id_conjunto_segmento = c
        where	id_rol = r
        and	id_funcion in
                (
                select	id_funcion
                from	funcion
                inner	join dominio on dominio.id_dominio = funcion.id_dominio
                inner	join clase_recurso on clase_recurso.id_clase_recurso = dominio.id_clase_recurso
                where	funcion.es_segmentada = 1
                and	clase_recurso.id_clase_recurso_segmento = row_conjunto_segmento.id_clase_recurso
                )
        and	(id_conjunto_segmento is null or id_conjunto_segmento <> c);
    end if;
    /**/
    return mensaje;
end;
