create or replace trigger persona_before_update
before update on persona
for each row
declare
    xnew persona%rowtype;
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000); -- a character string of at most 2048 bytes
    icv number;
    fecha_ent date;
begin
    dbms_output.put_line('Actualizando el id de ficha old: '||:old.id_ficha_persona||' new: '||:new.id_ficha_persona);
    --si hay un cambio en el id_ficha_persona o si pasa de null a no null,
    --se deben actualizar los icvs
    if ((:new.id_ficha_persona<>:old.id_ficha_persona) or
        (:old.id_ficha_persona is null and :new.id_ficha_persona is not null))  then
        --No se pueden cambiar los datos de ficha si la pension ya fue aprobada
        if(:new.numero_condicion_pension=2) then
            msg_string:='Persona con Pensión Aprobada. No se puede modificar ficha';
            raise_application_error(err_number, msg_string, true);
        end if;
        --Tomamos el icv
        begin
            select indice_calidad_vida into icv from ficha_persona fp left join ficha_hogar fh on fp.id_ficha_hogar=fh.id_ficha_hogar where fp.id_ficha_persona=:new.id_ficha_persona;
        exception
            when no_data_found then
                null;
        end;
        if sql%found then
            :new.indice_calidad_vida:=icv;
        end if;
        --Tomamos la fecha
        begin
            select fecha_entrevista into fecha_ent from ficha_persona fp left join ficha_hogar fh on fp.id_ficha_hogar=fh.id_ficha_hogar where fp.id_ficha_persona=:new.id_ficha_persona;
        exception
            when no_data_found then
                null;
        end;
        if sql%found then
            :new.fecha_ficha_persona:=fecha_ent;
            :new.es_persona_acreditada_para_pen:=0;
        end if;
     --Si se está colocando el id_ficha_persona en null   
     elsif(:old.id_ficha_persona is not null and :new.id_ficha_persona is null) then
        --No se pueden cambiar los datos de ficha si la pension ya fue aprobada
        if(:new.numero_condicion_pension=2) then
            msg_string:= 'Persona con Pensión Aprobada. No se puede modificar ficha';
            raise_application_error(err_number, msg_string, true);
        end if;
        :new.indice_calidad_vida:=null;
        :new.fecha_ficha_persona:=null;
        :new.es_persona_acreditada_para_pen:=0;
     end if;
    /**/
end;
/
show errors
