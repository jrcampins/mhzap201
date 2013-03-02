--
--Descripción: Este procedimiento asigna mesa a un lote de potenciales beneficiarios
--@param rastro: Identificador del proceso ejecutado.
--@param lote: Identificador del lote
--@param sime: Número de mesa de entrada
--@return: mensaje indicando el número de registros actualizados
--
function asignar_mesa(lote number,sime varchar2) return varchar2 is
    num_lote number;
    cod_sime varchar2(200);
    mensaje varchar2(2000);
    total_lote number:=0;
    numero_lote number;
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000); -- a character string of at most 2048 bytes
begin
    num_lote:=lote;
    cod_sime:=sime;
    if num_lote is null then
        msg_string := 'Lote no puede ser vacío';
        raise_application_error(err_number, msg_string, true);
    end if;
    if cod_sime is null then
        msg_string := 'SIME no puede ser vacío';
        raise_application_error(err_number, msg_string, true);
    end if;
    begin
        select count(p.id_persona) into total_lote from persona p where p.lote=num_lote;
    exception when no_data_found then null;
    end;
    if sql%found then
        dbms_output.put_line('total '||total_lote);
        if total_lote=0 then 
            mensaje:='No hay personas pertenecientes al lote';
        else
            update persona p set p.codigo_sime=cod_sime where p.lote=num_lote;
            mensaje:='Se actualizó el lote '||num_lote||'. Mesa de entrada: '||cod_sime||'. Personas en el lote:'||total_lote; 
        end if;
    else
        msg_string := 'No se pudo asignar mesa de entrada';
        raise_application_error(err_number, msg_string, true);
    end if;
    return mensaje;
end;