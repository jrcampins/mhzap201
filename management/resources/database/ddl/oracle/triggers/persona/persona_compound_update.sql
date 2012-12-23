create or replace trigger persona_compound_update
for update on persona
compound trigger
    type tabla_bigints is table of persona.id_persona%type      index by binary_integer;
    ids    tabla_bigints;
    xnew persona%rowtype;
    col_indice_calidad_vida NUMBER(7,4);
    col_fecha_ficha_persona timestamp;
    col_fecha_entrevista timestamp;
    indice      binary_integer := 0;
    nivel       number;
    row_potencial_ben potencial_ben%rowtype;
    row_ficha_persona ficha_persona%rowtype;
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000); -- a character string of at most 2048 bytes
    icv number;
    fecha_ent date;

--     before each row is
--         begin
--             --dbms_output.put_line('Actualizando el id de ficha old: '||:old.id_ficha_persona||' new: '||:new.id_ficha_persona);
--             --si hay un cambio en el id_ficha_persona o si pasa de null a no null,
--             --se deben actualizar los icvs
--             if ((:new.id_ficha_persona<>:old.id_ficha_persona) or
--                 (:old.id_ficha_persona is null and :new.id_ficha_persona is not null))  then
--                 --No se pueden cambiar los datos de ficha si la pension ya fue aprobada
--                 if(:new.numero_condicion_pension=2) then
--                     msg_string:='Persona con Pensión Aprobada. No se puede modificar ficha';
--                     raise_application_error(err_number, msg_string, true);
--                 end if;
--                 --Tomamos el icv
--                 begin
--                     select indice_calidad_vida into icv from ficha_persona fp left join ficha_hogar fh on fp.id_ficha_hogar=fh.id_ficha_hogar where fp.id_ficha_persona=:new.id_ficha_persona;
--                 exception
--                     when no_data_found then
--                         null;
--                 end;
--                 if sql%found then
--                     :new.indice_calidad_vida:=icv;
--                 end if;
--                 --Tomamos la fecha
--                 begin
--                     select fecha_entrevista into fecha_ent from ficha_persona fp left join ficha_hogar fh on fp.id_ficha_hogar=fh.id_ficha_hogar where fp.id_ficha_persona=:new.id_ficha_persona;
--                 exception
--                     when no_data_found then
--                         null;
--                 end;
--                 if sql%found then
--                     :new.fecha_ficha_persona:=fecha_ent;
--                     :new.es_persona_acreditada_para_pen:=0;
--                 end if;
--              --Si se está colocando el id_ficha_persona en null   
--              elsif(:old.id_ficha_persona is not null and :new.id_ficha_persona is null) then
--                 --No se pueden cambiar los datos de ficha si la pension ya fue aprobada
--                 if(:new.numero_condicion_pension=2) then
--                     msg_string:= 'Persona con Pensión Aprobada. No se puede modificar ficha';
--                     raise_application_error(err_number, msg_string, true);
--                 end if;
--                 :new.indice_calidad_vida:=null;
--                 :new.fecha_ficha_persona:=null;
--                 :new.es_persona_acreditada_para_pen:=0;
--              end if;  
--     end before each row;
--before each row is
--begin
--     --dbms_output.put_line('desde el trigger compound '||:old.id_persona
--         ||' ('||:old.codigo_persona||','||:new.codigo_persona||') '
--         ||' ('||:old.nombre_persona||','||:new.nombre_persona||') ');
/**/
--end before each row;

after each row is
begin
       
--     --dbms_output.put_line('after  row '||:new.id_persona
--         ||' ('||:old.codigo_persona||','||:new.codigo_persona||') '
--         ||' ('||:old.nombre_persona||','||:new.nombre_persona||') ');
    indice:= indice + 1;
    ids(indice):=:new.id_persona;
--    --dbms_output.put_line(indice||', '||ids(indice));
end after each row;
after statement is
begin
    indice := 0;
    msg_string := '';
--     --dbms_output.put_line('after  statement (count='||ids.count||') ');
    for i in 1..ids.count
    loop
      begin
          select *
          into row_potencial_ben
          from potencial_ben
          where id_persona=ids(i)
          and es_potencial_ben_inactivo=0;
      exception
          when no_data_found then null;
      end;
      if sql%found then
          --Esta instruccion se ejecuta para mantener actualizada la copia de persona
          update potencial_ben
          set id_persona=ids(i)
          where id_persona=ids(i);
          --Caso 1: Nuevo id_ficha_persona (anterior no null): Cuando se actualiza la ficha_persona
          if (:new.id_ficha_persona<>:old.id_ficha_persona)  then
              --Se anula el vinculo anterior de ficha_persona
              begin
                  select *
                  into row_ficha_persona 
                  from ficha_persona 
                  where id_ficha_persona=:old.id_ficha_persona;
              exception
                  when no_data_found then null;
              end;
              --Si no está inactiva, se actualiza directamente
              if(row_ficha_persona.es_ficha_persona_inactiva=0)then
                  update ficha_persona
                  set    id_potencial_ben=null
                  where id_ficha_persona=row_ficha_persona.id_ficha_persona;
              --Si esta inactiva hay que reactivar para poder actualizar
              else
                --Se reactiva para actualizar
                  update ficha_persona
                  set id_potencial_ben=null,
                      es_ficha_persona_inactiva=0
                  where id_ficha_persona=row_ficha_persona.id_ficha_persona;
                --Se vuelve a inactivar
                  update ficha_persona
                  set es_ficha_persona_inactiva=1
                  where id_ficha_persona=row_ficha_persona.id_ficha_persona;
              end if;
              --Se crea el nuevo vinculo de ficha_persona 
              begin
                  select *
                  into row_ficha_persona 
                  from ficha_persona 
                  where id_ficha_persona=:new.id_ficha_persona;
              exception
                  when no_data_found then null;
              end;
              --Si no está inactiva, se actualiza directamente
              if(row_ficha_persona.es_ficha_persona_inactiva=0)then
                  update ficha_persona
                  set id_potencial_ben=row_potencial_ben.id_potencial_ben
                  where id_ficha_persona=:new.id_ficha_persona;
              --Si esta inactiva hay que reactivar para poder actualizar
              else
                  --Se reactiva para actualizar
                  update ficha_persona
                  set id_potencial_ben=row_potencial_ben.id_potencial_ben,
                      es_ficha_persona_inactiva=0
                  where id_ficha_persona=row_ficha_persona.id_ficha_persona;
                  --Se vuelve a inactivar
                  update ficha_persona
                  set es_ficha_persona_inactiva=1
                  where id_ficha_persona=row_ficha_persona.id_ficha_persona;
              end if;
          --Caso 2: Nuevo id_ficha_persona no null(anterior null): Cuando se inserta una nueva ficha_persona para la persona
          elsif (:new.id_ficha_persona is not null
                  and :old.id_ficha_persona is null )  then 
              --Se crea el nuevo vinculo de ficha_persona 
              begin
                  select *
                  into row_ficha_persona 
                  from ficha_persona 
                  where id_ficha_persona=:new.id_ficha_persona;
              exception
                  when no_data_found then null;
              end;
              --Si no está inactiva, se actualiza directamente
              if(row_ficha_persona.es_ficha_persona_inactiva=0)then
                  update ficha_persona
                  set id_potencial_ben=row_potencial_ben.id_potencial_ben
                  where id_ficha_persona=:new.id_ficha_persona;
              --Si esta inactiva hay que reactivar para poder actualizar
              else
                  --Se reactiva para actualizar
                  update ficha_persona
                  set id_potencial_ben=row_potencial_ben.id_potencial_ben,
                      es_ficha_persona_inactiva=0
                  where id_ficha_persona=row_ficha_persona.id_ficha_persona;
                  --Se vuelve a inactivar
                  update ficha_persona
                  set es_ficha_persona_inactiva=1
                  where id_ficha_persona=row_ficha_persona.id_ficha_persona;
              end if;
          --Caso 3: Nuevo id_ficha_persona null (anterior no null): Cuando se desvincula una ficha_persona
          elsif (:new.id_ficha_persona is null 
                and :old.id_ficha_persona is not null)  then
              --Se anula el vinculo anterior de ficha_persona
              begin
                  select *
                  into row_ficha_persona 
                  from ficha_persona 
                  where id_ficha_persona=:old.id_ficha_persona;
              exception
                  when no_data_found then null;
              end;
              --Si no está inactiva, se actualiza directamente
              if(row_ficha_persona.es_ficha_persona_inactiva=0)then
                  update ficha_persona
                  set id_potencial_ben=null
                  where id_ficha_persona=row_ficha_persona.id_ficha_persona;
              --Si esta inactiva hay que reactivar para poder actualizar
              else
                  --Se reactiva para actualizar
                  update ficha_persona
                  set id_potencial_ben=null,
                      es_ficha_persona_inactiva=0
                  where id_ficha_persona=row_ficha_persona.id_ficha_persona;
                  --Se vuelve a inactivar
                  update ficha_persona
                  set es_ficha_persona_inactiva=1
                  where id_ficha_persona=row_ficha_persona.id_ficha_persona;
              end if;
          end if;
      end if;
  end loop;
end after statement;
end persona_compound_update;
/
show errors