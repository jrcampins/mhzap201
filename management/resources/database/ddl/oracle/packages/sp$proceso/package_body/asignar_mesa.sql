--
--Descripción: Este procedimiento asigna mesa a un lote de potenciales beneficiarios
--@param rastro: Identificador del proceso ejecutado.
--@param lote: Identificador del lote
--@param sime: Número de mesa de entrada
--@return: mensaje indicando el número de registros actualizados
--
function asignar_mesa(lote number,sime varchar2) return varchar2 is
    mensaje varchar2(2000);
    total_lote number:=0;
    numero_lote number;
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000); -- a character string of at most 2048 bytes
begin
    if lote is null then
        msg_string := 'Lote no puede ser vacío';
        raise_application_error(err_number, msg_string, true);
    end if;
    if sime is null then
        msg_string := 'SIME no puede ser vacío';
        raise_application_error(err_number, msg_string, true);
    end if;
    begin
        select count(p.id_persona) into total_lote from persona p where p.lote=lote;
    exception when no_data_found then null;
    end;
    if sql%found then
        if total_lote=0 then 
            mensaje:='No hay personas pertenecientes al lote';
        else
            update persona p set p.codigo_sime=sime where p.lote=lote;
            mensaje:='Se actualizó el lote '||lote||' Mesa de entrada: '||sime||'. '||total_lote||' Personas en el lote.'; 
        end if;
    else
        msg_string := 'No se pudo asignar mesa de entrada';
        raise_application_error(err_number, msg_string, true);
    end if;
    return mensaje;
end;