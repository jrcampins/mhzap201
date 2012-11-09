function concat_codigo(xrow ficha_persona%rowtype) return varchar2 is
    codigo varchar2(60);
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000); -- a character string of at most 2048 bytes
begin
    begin
        select codigo_ficha_hogar
        into   codigo
        from   ficha_hogar
        where  id_ficha_hogar = xrow.id_ficha_hogar;
    exception
        when no_data_found then
            msg_string := 'ficha hogar ' || xrow.id_ficha_hogar || ' no existe';
            raise_application_error(err_number, msg_string, true);
    end;
    return codigo || '-' || xrow.numero_orden_identificacion;
end;
