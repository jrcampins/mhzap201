--
--Este procedimiento reactiva una ficha_hogar, para permitir cualquier modificacion posterior
--@param ficha: Id de la ficha sobre la que se ejecuta el proceso.
--@return: mensaje indicando si se pudo desactivar .
--
function reactivar(ficha number) return varchar2 is
    mensaje varchar2(2000);
    row_ficha_hogar ficha_hogar%rowtype;
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000);
    conta number:=0;
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
    --Solo se puede reactivar una ficha hogar inactiva
    if row_ficha_hogar.es_ficha_hogar_inactiva=0 then
        msg_string := 'Ficha Hogar ya se encuentra activa';
        raise_application_error(err_number, msg_string, true);
    end if;
    --Al reactivar la ficha_hogar, se reactivan las ficha_persona asociadas
    update ficha_persona
    set es_ficha_persona_inactiva=0,
    id_potencial_ben=null
    where id_ficha_hogar=ficha;
    --Se reactiva la ficha_hogar y se anula el icv
    update ficha_hogar
    set es_ficha_hogar_inactiva=0,
    indice_calidad_vida=null
    where id_ficha_hogar=ficha;
    --Se desvinculan las ficha_persona
    for row_ficha_persona in (select * 
                             from ficha_persona 
                             where id_ficha_hogar=ficha) loop
        --Se desvincula las ficha_persona de persona
        update persona
        set id_ficha_persona=null
        where id_ficha_persona=row_ficha_persona.id_ficha_persona ;        
        --Se reactiva las ficha_persona
        update ficha_persona
        set es_ficha_persona_inactiva=0
        where id_ficha_persona=row_ficha_persona.id_ficha_persona;
        --se cuentan las fichas inactivadas
        conta:=conta+1;  
    end loop;
    mensaje:='Se reactivó la ficha_hogar: '||row_ficha_hogar.codigo_ficha_hogar||'. Se desvincularon '||conta||' Personas';
    return mensaje;
end;