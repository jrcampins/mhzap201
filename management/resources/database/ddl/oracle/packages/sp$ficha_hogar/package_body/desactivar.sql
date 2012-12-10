--
--Este procedimiento desactiva una ficha_hogar, para evitar cualquier modificacion posterior
--@param ficha: Id de la ficha sobre la que se ejecuta el proceso.
--@return: mensaje indicando si se pudo desactivar .
--
function desactivar(ficha number) return varchar2 is
    mensaje varchar2(2000);
    row_ficha_hogar ficha_hogar%rowtype;
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000); -- a character string of at most 2048 bytes
begin
    begin
        select * into row_ficha_hogar from ficha_hogar where id_ficha_hogar=ficha;
    exception
        when no_data_found then null;
    end;
    if not sql%found then
        msg_string := 'Ficha Hogar no encontrada';
        raise_application_error(err_number, msg_string, true);
    end if;
    --Solo se puede desactivar una ficha hogar activa
    if row_ficha_hogar.es_ficha_hogar_inactiva=1 then
        msg_string := 'Ficha Hogar ya fue desactivada';
        raise_application_error(err_number, msg_string, true);
    end if;
    --Al desactivar la ficha_hogar, se desactivan las ficha_persona asociadas
    update ficha_persona
    set es_ficha_persona_inactiva=1
    where id_ficha_hogar=ficha;
    --Se desactiva la ficha_hogar
    update ficha_hogar
    set es_ficha_hogar_inactiva=1
    where id_ficha_hogar=ficha;
    mensaje:='Se desactivó la ficha_hogar: '||row_ficha_hogar.codigo_ficha_hogar;
    return mensaje;
end;