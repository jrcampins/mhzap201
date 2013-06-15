--
--Descripción: Este procedimiento actualiza las objeciones que puede tener una persona a la obtención de una pensión y actualiza la elegibilidad de la persona, para ello verifica si se cumplen las condiciones que excluyen el pago de pensiones.
--@param id_persona: id de la persona sobre la que se ejecutara la funcion
--@param codigo: codigo de la persona sobre la que se ejecutara
--@return: 0 si no hubo ninguna objeción, en caso de que haya habido una objeción, retorna el número de causa de no elegibilidad (De acuerdo a la tabla causa_den_pension)
--
function actualizar_objeciones(persona_consultada number) return number is
    row_persona persona%rowtype;
    id_persona_act number;
    row_objecion objecion_ele_pen%rowtype;
    row_archivo archivo_datos_ext%rowtype;
    row_log_deu log_imp_deu%rowtype;
    row_log_emp log_imp_emp%rowtype;
    row_log_jub log_imp_jub%rowtype;
    row_log_pen log_imp_pen%rowtype;
    row_log_fal log_imp_fal%rowtype;
    row_log_sub log_imp_sub%rowtype;
    p_fecha_Defuncion timestamp;
    condicion number := 0;
    conta_objeciones number :=0;
    total_objeciones number:=0;
    retcode number;
    id_proveedor number;
    resultado varchar2(4000);
    referencia_nis varchar2(400);
    codigo varchar2(400);
    mensaje varchar2(4000);
    mensaje_defuncion varchar2(4000);
    err_number constant number := -20000; -- an integer in the range -20000..-20999
    msg_string varchar2(2000); -- a character string of at most 2048 bytes
begin
    if persona_consultada is null then
       return 0;
    end if;
    --0. buscar persona
    begin
        select * into row_persona from persona where id_persona=persona_Consultada;
    exception when no_data_found then null;
    end;
    if not sql%found then
        msg_string := 'Persona no existe (id='||persona_consultada||')';
        raise_application_error(err_number, msg_string, true);
    end if;
    codigo:=row_persona.codigo_persona;
    --Nuevo: Como no conozco las objeciones que tiene la persona en el instante t
    --se desactivan las objeciones anteriores de la persona
    --update objecion_ele_pen
    --set es_objecion_ele_pen_inactiva=1,
    --fecha_ultima_actualizacion=sysdate
    --where id_persona=row_persona.id_persona;
    --1. Buscamos todas las deudas que tiene la persona
    for row_log_deu in (select * from log_imp_deu where cedula=codigo and observacion!='Objeción actualizada') 
    loop
        row_objecion:=null;
        --1.0 Verificamos que la persona del archivo sea la misma persona que estoy buscando
        id_persona_act:=sp$utils.extract_id_persona(row_log_deu.cedula,
                                                        row_log_deu.primer_nombre,
                                                        row_log_deu.segundo_nombre,
                                                        row_log_deu.primer_apellido,
                                                        row_log_deu.segundo_apellido,
                                                        row_log_deu.apellido_casada);
        --Si no consigue la persona no hace nada
        if id_persona_act is null then
                continue;
        end if;
        --1.1 verificamos si es una persona con o sin referecia.
        if row_log_deu.referencia is not null then
            referencia_nis:=row_log_deu.referencia;
        else
            referencia_nis:=null;
        end if;
        --dbms_output.put_line('objecion de deuda de '||codigo||'referencia '||referencia_nis);
        --1.2 buscamos el proveedor de datos externos
        for row_archivo in (select * from archivo_datos_ext where codigo_archivo_datos_ext=row_log_deu.codigo_archivo)
        loop
            id_proveedor:=row_Archivo.id_proveedor_dat_ext;
            --1.3 Verificamos cuantas objeciones tiene el archivo asociadas a la persona.
            begin
                select count(id_objecion_ele_pen) into conta_objeciones from objecion_ele_pen 
                where numero_tipo_obj_ele_pen=23
                and es_objecion_ele_pen_inactiva=0
                and fecha_anulacion is  null
                and id_persona=persona_consultada
                and id_proveedor_dat_ext=id_proveedor;
            exception when no_data_found then null;
            end;
            --1.4 si conseguímos más de una objeción de deuda de la persona con ese proveedor: desactivamos las objeciones
            if conta_objeciones>0 then
                --1.4.1 Para desactivar debo saber que registro exacto debo desactivar: Con NIS
                if(referencia_nis is not null) then
                    update objecion_ele_pen
                    set es_objecion_ele_pen_inactiva=1,
                    fecha_ultima_actualizacion=trunc(current_timestamp)
                    where id_persona=persona_consultada
                    and es_objecion_ele_pen_inactiva=0
                    and fecha_anulacion is  null
                    and numero_tipo_obj_ele_pen=23
                    and referencia=referencia_nis
                    and id_proveedor_dat_ext=id_proveedor;
                -- 1.4.2 Sin NIS
                else
                    update objecion_ele_pen
                    set es_objecion_ele_pen_inactiva=1,
                    fecha_ultima_actualizacion=trunc(current_timestamp)
                    where id_persona=persona_consultada
                    and es_objecion_ele_pen_inactiva=0
                    and fecha_anulacion is  null
                    and numero_tipo_obj_ele_pen=23
                    and referencia is null
                    and id_proveedor_dat_ext=id_proveedor;
                end if;
            end if;
            --1.5 Determino si es una objeción ya existente para desactivarla
            begin
                if referencia_nis is not null then
                    begin
                        select * into row_objecion from objecion_ele_pen 
                        where id_persona=id_persona_act
                        and es_objecion_ele_pen_inactiva=0
                        and fecha_anulacion is  null
                        and numero_tipo_obj_ele_pen=23
                        and referencia = referencia_nis
                        and referencia is not null
                        and id_proveedor_dat_ext=id_proveedor;
                    exception when no_data_found then null;
                    end;
                else
                    begin
                        select * into row_objecion from objecion_ele_pen 
                        where id_persona=id_persona_act
                        and es_objecion_ele_pen_inactiva=0
                        and fecha_anulacion is  null
                        and numero_tipo_obj_ele_pen=23
                        and referencia is null
                        and id_proveedor_dat_ext=id_proveedor;
                    exception when no_data_found then null;
                    end;
                end if;
            --Debería haber una sola objeción con la referencia
            exception 
            when no_data_found then null;
            when others then
                msg_string := 'Error recuperando la objeción: '||SQLERRM;
                raise_application_error(err_number, msg_string, true);
            end;
            --1.6 Si consigue la objecion la mantiene activa
            if sql%found then
                update objecion_ele_pen
                set es_objecion_ele_pen_inactiva=0,
                fecha_ultima_actualizacion=trunc(current_timestamp)
                where id_objecion_ele_pen=row_objecion.id_objecion_ele_pen;
                update log_imp_deu set es_importado=1,  
                nombre_archivo=row_Archivo.nombre_archivo_datos_ext, 
                codigo_archivo=row_Archivo.codigo_archivo_datos_ext, 
                fecha_hora_transaccion= current_timestamp,
                observacion='Objeción actualizada'
                where id_log_imp_deu=row_log_deu.id_log_imp_deu;
            --1.7 Si no la consigue, la inserta como nueva
            else 
                row_objecion.id_objecion_ele_pen:=utils.bigintid();
                row_objecion.version_objecion_ele_pen:=0;
                row_objecion.id_persona:=id_persona_act;
                row_objecion.id_proveedor_dat_ext:=id_proveedor;
                row_objecion.numero_tipo_obj_ele_pen:=23;
                row_objecion.es_objecion_ele_pen_inactiva:=0;
                row_objecion.fecha_ultima_actualizacion:=trunc(current_timestamp);
                row_objecion.nombre_archivo_ultima_act:=row_archivo.nombre_original_archivo_datos;
                if referencia_nis is not null then
                    row_objecion.referencia:=referencia_nis;
                    row_objecion.observaciones:='NIS '||referencia_nis;
                else
                    row_objecion.referencia:=null;
                end if;
                insert into objecion_ele_pen values row_objecion;
                update log_imp_deu set es_importado=1,  
                nombre_archivo=row_Archivo.nombre_archivo_datos_ext, 
                codigo_archivo=row_Archivo.codigo_archivo_datos_ext, 
                fecha_hora_transaccion= current_timestamp,
                observacion='Objeción actualizada'
                where id_log_imp_deu=row_log_deu.id_log_imp_deu;
           end if;
            --Se actualiza el log para que la observación diga que la objeción se actualizó
        end loop;
    end loop;

    --2. Buscar codigos en log de empleados
    for row_log_emp in (select * from log_imp_emp where cedula=codigo and observacion!='Objeción actualizada') 
    loop
        row_objecion:=null;
        --1.0 Verificamos que la persona del archivo sea la misma persona que estoy buscando
        id_persona_act:=sp$utils.extract_id_persona(row_log_emp.cedula,
                                                        row_log_emp.primer_nombre,
                                                        row_log_emp.segundo_nombre,
                                                        row_log_emp.primer_apellido,
                                                        row_log_emp.segundo_apellido,
                                                        row_log_emp.apellido_casada);
        --Si no consigue la persona no hace nada
        if id_persona_act is null then
                continue;
        end if;
        --dbms_output.put_line('objecion de empleo de '||codigo);
        --1.2 buscamos el proveedor de datos externos
        for row_archivo in (select * from archivo_datos_ext where codigo_archivo_datos_ext=row_log_emp.codigo_archivo)
        loop
            id_proveedor:=row_Archivo.id_proveedor_dat_ext;
            --2.3 Verificamos cuantas objeciones tiene el archivo asociadas a la persona.
            begin
                select count(id_objecion_ele_pen) into conta_objeciones from objecion_ele_pen 
                where numero_tipo_obj_ele_pen=21
                and es_objecion_ele_pen_inactiva=0
                and fecha_anulacion is  null
                and id_persona=persona_consultada
                and id_proveedor_dat_ext=id_proveedor;
            exception when no_data_found then null;
            end;
            --2.4 si conseguímos más de una objeción de empleo de la persona con ese proveedor: desactivamos las objeciones
            if conta_objeciones>0 then
                update objecion_ele_pen
                set es_objecion_ele_pen_inactiva=1,
                fecha_ultima_actualizacion=trunc(current_timestamp)
                where numero_tipo_obj_ele_pen=21
                and es_objecion_ele_pen_inactiva=0
                and fecha_anulacion is  null
                and id_persona=persona_consultada
                and id_proveedor_dat_ext=id_proveedor;
            end if;
            --Se selecciona la persona a actualizar
            begin
                 select * into row_objecion from objecion_ele_pen 
                 where id_persona=id_persona_act
                 and es_objecion_ele_pen_inactiva=0
                 and fecha_anulacion is  null
                 and numero_tipo_obj_ele_pen=21
                 and id_proveedor_dat_ext=id_proveedor;
            exception when no_data_found then null;
                when others then
                msg_string := 'Error recuperando la objeción de '||SQLERRM;
                raise_application_error(err_number, msg_string, true);
            end;
            if sql%found then
                 --Si consigue la objecion la mantiene activa
                 update objecion_ele_pen
                 set es_objecion_ele_pen_inactiva=0,
                 fecha_ultima_actualizacion=trunc(current_timestamp)
                 where id_objecion_ele_pen=row_objecion.id_objecion_ele_pen;
                 --Se actualiza el log para que la observación diga que la objeción se actualizó
                 update log_imp_emp set es_importado=1, 
                       fecha_hora_transaccion= current_timestamp,
                       nombre_archivo=row_Archivo.nombre_archivo_datos_ext, 
                       codigo_archivo=row_Archivo.codigo_archivo_datos_ext,
                       observacion='Objeción actualizada'
                 where id_log_imp_emp=row_log_emp.id_log_imp_emp;
            else 
                 --Si no la consigue, la inserta como nueva
                 row_objecion.id_objecion_ele_pen:=utils.bigintid();
                 row_objecion.version_objecion_ele_pen:=0;
                 row_objecion.id_persona:=id_persona_act;
                 row_objecion.id_proveedor_dat_ext:=id_proveedor;
                 row_objecion.numero_tipo_obj_ele_pen:=21;
                 row_objecion.es_objecion_ele_pen_inactiva:=0;
                 row_objecion.fecha_ultima_actualizacion:=trunc(current_timestamp);
                 row_objecion.nombre_archivo_ultima_act:=row_archivo.nombre_original_archivo_datos;
                 insert into objecion_ele_pen values row_objecion;
                 --Se actualiza el log para que la observación diga que la objeción se actualizó
                 update log_imp_emp set es_importado=1, 
                    fecha_hora_transaccion= current_timestamp,
                    nombre_archivo=row_Archivo.nombre_archivo_datos_ext, 
                    codigo_archivo=row_Archivo.codigo_archivo_datos_ext,
                    observacion='Objeción actualizada'
                 where id_log_imp_emp=row_log_emp.id_log_imp_emp;
            end if;
        end loop;
    end loop;
    --3. Buscar codigos en log de jubilados y pensionados
    for row_log_jub in (select * from log_imp_jub where cedula=codigo and observacion!='Objeción actualizada') 
    loop
        row_objecion:=null;
        for row_archivo in (select * from archivo_datos_ext where codigo_archivo_datos_ext=row_log_jub.codigo_archivo)
        loop
            id_proveedor:=row_archivo.id_proveedor_dat_ext;
            --Jubilados
            if(upper(row_log_jub.tipo_registro) like '%JUBILADO%') then
                begin
                    select count(id_objecion_ele_pen) into conta_objeciones from objecion_ele_pen 
                    where (numero_tipo_obj_ele_pen=22)
                    and es_objecion_ele_pen_inactiva=0
                    and fecha_anulacion is  null
                    and id_persona=persona_consultada
                    and id_proveedor_dat_ext=id_proveedor;
                exception when no_data_found then null;
                end;
                if conta_objeciones>0 then
                    update objecion_ele_pen
                    set es_objecion_ele_pen_inactiva=1,
                    fecha_ultima_actualizacion=trunc(current_timestamp)
                    where numero_tipo_obj_ele_pen=22
                    and es_objecion_ele_pen_inactiva=0
                    and fecha_anulacion is  null
                    and id_persona=persona_consultada
                    and id_proveedor_dat_ext=id_proveedor;
                end if;
                id_persona_act:=sp$utils.extract_id_persona(row_log_jub.cedula,
                                                            row_log_jub.primer_nombre,
                                                            row_log_jub.segundo_nombre,
                                                            row_log_jub.primer_apellido,
                                                            row_log_jub.segundo_apellido,
                                                            row_log_jub.apellido_casada);
                --Si no consigue la persona no hace nada
                if id_persona_act is null then
                    continue;
                else
                   begin
                        select * into row_objecion from objecion_ele_pen 
                        where id_persona=id_persona_act
                        and es_objecion_ele_pen_inactiva=0
                        and fecha_anulacion is  null
                        and numero_tipo_obj_ele_pen=22
                        and id_proveedor_dat_ext=id_proveedor;
                   exception when no_data_found then null;
                   end;
                   if sql%found then
                        --Si consigue la objecion la mantiene activa
                        update objecion_ele_pen
                        set es_objecion_ele_pen_inactiva=0,
                        fecha_ultima_actualizacion=trunc(current_timestamp)
                        where id_objecion_ele_pen=row_objecion.id_objecion_ele_pen;
                        
                   else 
                        --Si no la consigue, la inserta como nueva
                        row_objecion.id_objecion_ele_pen:=utils.bigintid();
                        row_objecion.version_objecion_ele_pen:=0;
                        row_objecion.id_persona:=id_persona_act;
                        row_objecion.id_proveedor_dat_ext:=id_proveedor;
                        row_objecion.numero_tipo_obj_ele_pen:=22;
                        row_objecion.es_objecion_ele_pen_inactiva:=0;
                        row_objecion.fecha_ultima_actualizacion:=trunc(current_timestamp);
                        row_objecion.nombre_archivo_ultima_act:=row_archivo.nombre_original_archivo_datos;
                        insert into objecion_ele_pen values row_objecion;
                        --Se actualiza el log para que la observación diga que la objeción se actualizó
                        update log_imp_jub set es_importado=1, 
                               nombre_archivo=row_Archivo.nombre_archivo_datos_ext, 
                               codigo_archivo=row_Archivo.codigo_archivo_datos_ext, 
                               fecha_hora_transaccion= current_timestamp,
                               observacion='Objeción actualizada'
                        where id_log_imp_jub=row_log_jub.id_log_imp_jub;
                   end if;
                end if;
            --Pensionados 
            elsif (upper(row_log_jub.tipo_registro) like '%PENSIONADO%') then
                begin
                    select count(id_objecion_ele_pen) into conta_objeciones from objecion_ele_pen 
                    where (numero_tipo_obj_ele_pen=25)
                    and es_objecion_ele_pen_inactiva=0
                    and fecha_anulacion is  null
                    and id_persona=persona_consultada
                    and id_proveedor_dat_ext=id_proveedor;
                exception when no_data_found then null;
                end;
                if conta_objeciones>0 then
                    update objecion_ele_pen
                    set es_objecion_ele_pen_inactiva=1,
                    fecha_ultima_actualizacion=trunc(current_timestamp)
                    where numero_tipo_obj_ele_pen=25
                    and es_objecion_ele_pen_inactiva=0
                    and fecha_anulacion is  null
                    and id_persona=persona_consultada
                    and id_proveedor_dat_ext=id_proveedor;
                end if;
                id_persona_act:=sp$utils.extract_id_persona(row_log_jub.cedula,
                                                            row_log_jub.primer_nombre,
                                                            row_log_jub.segundo_nombre,
                                                            row_log_jub.primer_apellido,
                                                            row_log_jub.segundo_apellido,
                                                            row_log_jub.apellido_casada);
                --Si no consigue la persona no hace nada
                if id_persona_act is null then
                    continue;
                else
                   begin
                        select * into row_objecion from objecion_ele_pen 
                        where id_persona=id_persona_act
                        and es_objecion_ele_pen_inactiva=0
                        and fecha_anulacion is  null
                        and numero_tipo_obj_ele_pen=25
                        and id_proveedor_dat_ext=id_proveedor;
                   exception when no_data_found then null;
                   end;
                   if sql%found then
                        --Si consigue la objecion la mantiene activa
                        update objecion_ele_pen
                        set es_objecion_ele_pen_inactiva=0,
                        fecha_ultima_actualizacion=trunc(current_timestamp)
                        where id_objecion_ele_pen=row_objecion.id_objecion_ele_pen;
                        --Se actualiza el log para que la observación diga que la objeción se actualizó
                        update log_imp_jub set es_importado=1, 
                               nombre_archivo=row_Archivo.nombre_archivo_datos_ext, 
                               codigo_archivo=row_Archivo.codigo_archivo_datos_ext, 
                               fecha_hora_transaccion= current_timestamp,
                               observacion='Objeción actualizada'
                        where id_log_imp_jub=row_log_jub.id_log_imp_jub;
                   else 
                        --Si no la consigue, la inserta como nueva
                        row_objecion.id_objecion_ele_pen:=utils.bigintid();
                        row_objecion.version_objecion_ele_pen:=0;
                        row_objecion.id_persona:=id_persona_act;
                        row_objecion.id_proveedor_dat_ext:=id_proveedor;
                        row_objecion.numero_tipo_obj_ele_pen:=25;
                        row_objecion.es_objecion_ele_pen_inactiva:=0;
                        row_objecion.fecha_ultima_actualizacion:=trunc(current_timestamp);
                        row_objecion.nombre_archivo_ultima_act:=row_archivo.nombre_original_archivo_datos;
                        insert into objecion_ele_pen values row_objecion;
                        --Se actualiza el log para que la observación diga que la objeción se actualizó
                        update log_imp_jub set es_importado=1, 
                               nombre_archivo=row_Archivo.nombre_archivo_datos_ext, 
                               codigo_archivo=row_Archivo.codigo_archivo_datos_ext, 
                               fecha_hora_transaccion= current_timestamp,
                               observacion='Objeción actualizada'
                        where id_log_imp_jub=row_log_jub.id_log_imp_jub;
                   end if;
                end if;
            end if;
        end loop;
    end loop;

    --4. Buscar codigos en log de penas

    for row_log_pen in (select * from log_imp_pen where cedula=codigo and observacion='Objeción actualizada') 
    loop
        row_objecion:=null;
        for row_archivo in (select * from archivo_datos_ext where codigo_archivo_datos_ext=row_log_pen.codigo_archivo)
        loop
            id_proveedor:=row_archivo.id_proveedor_dat_ext;
            begin
                select count(id_objecion_ele_pen) into conta_objeciones from objecion_ele_pen 
                where numero_tipo_obj_ele_pen=24 
                and es_objecion_ele_pen_inactiva=0
                and fecha_anulacion is  null
                and id_persona=persona_consultada
                and id_proveedor_dat_ext=id_proveedor;
            exception when no_data_found then null;
            end;
            if conta_objeciones>0 then
                update objecion_ele_pen
                set es_objecion_ele_pen_inactiva=1,
                fecha_ultima_actualizacion=trunc(current_timestamp)
                where numero_tipo_obj_ele_pen=24
                and id_persona=persona_consultada
                and es_objecion_ele_pen_inactiva=0
                and fecha_anulacion is  null
                and id_proveedor_dat_ext=id_proveedor;
            end if;
            id_persona_act:=sp$utils.extract_id_persona(row_log_pen.cedula,
                                                        row_log_pen.primer_nombre,
                                                        row_log_pen.segundo_nombre,
                                                        row_log_pen.primer_apellido,
                                                        row_log_pen.segundo_apellido,
                                                        row_log_pen.apellido_casada);
            --Si no consigue la persona no hace nada
            if id_persona_act is null then
                continue;
            else
               begin
                    select * into row_objecion from objecion_ele_pen 
                    where id_persona=id_persona_act
                    and numero_tipo_obj_ele_pen=24
                    and es_objecion_ele_pen_inactiva=0
                    and fecha_anulacion is  null
                    and id_proveedor_dat_ext=id_proveedor;
               exception when no_data_found then null;
               end;
               if sql%found then
                    --Si consigue la objecion la mantiene activa
                    update objecion_ele_pen
                    set es_objecion_ele_pen_inactiva=0,
                    fecha_ultima_actualizacion=trunc(current_timestamp)
                    where id_objecion_ele_pen=row_objecion.id_objecion_ele_pen;
                    --Se actualiza el log para que la observación diga que la objeción se actualizó
                    update log_imp_pen set es_importado=1, 
                           nombre_archivo=row_Archivo.nombre_archivo_datos_ext, 
                           codigo_archivo=row_Archivo.codigo_archivo_datos_ext, 
                           fecha_hora_transaccion= current_timestamp,
                           observacion='Objeción actualizada'
                    where id_log_imp_pen=row_log_pen.id_log_imp_pen;
               else 
                    --Si no la consigue, la inserta como nueva
                    row_objecion.id_objecion_ele_pen:=utils.bigintid();
                    row_objecion.version_objecion_ele_pen:=0;
                    row_objecion.id_persona:=id_persona_act;
                    row_objecion.id_proveedor_dat_ext:=id_proveedor;
                    row_objecion.numero_tipo_obj_ele_pen:=24;
                    row_objecion.es_objecion_ele_pen_inactiva:=0;
                    row_objecion.fecha_ultima_actualizacion:=trunc(current_timestamp);
                    row_objecion.nombre_archivo_ultima_act:=row_archivo.nombre_original_archivo_datos;
                    insert into objecion_ele_pen values row_objecion;
                    --Se actualiza el log para que la observación diga que la objeción se actualizó
                    update log_imp_pen set es_importado=1, 
                           nombre_archivo=row_Archivo.nombre_archivo_datos_ext, 
                           codigo_archivo=row_Archivo.codigo_archivo_datos_ext, 
                           fecha_hora_transaccion= current_timestamp,
                           observacion='Objeción actualizada'
                    where id_log_imp_pen=row_log_pen.id_log_imp_pen;
               end if;
            end if;
        end loop;
    end loop;

    --5. Buscar codigos en log de subsidios
    --Cambiar 25 por 26

    for row_log_sub in (select * from log_imp_sub where cedula=codigo and observacion='Objeción actualizada') 
    loop
        row_objecion:=null;
        for row_archivo in (select * from archivo_datos_ext where codigo_archivo_datos_ext=row_log_sub.codigo_archivo)
        loop
            id_proveedor:=row_archivo.id_proveedor_dat_ext;
            begin
                select count(id_objecion_ele_pen) into conta_objeciones from objecion_ele_pen 
                where numero_tipo_obj_ele_pen=26
                and es_objecion_ele_pen_inactiva=0
                and fecha_anulacion is  null
                and id_persona=persona_consultada
                and id_proveedor_dat_ext=id_proveedor;
            exception when no_data_found then null;
            end;
            if conta_objeciones>0 then
                update objecion_ele_pen
                set es_objecion_ele_pen_inactiva=1,
                fecha_ultima_actualizacion=trunc(current_timestamp)
                where numero_tipo_obj_ele_pen=26
                and es_objecion_ele_pen_inactiva=0
                and fecha_anulacion is  null
                and id_persona=persona_consultada
                and id_proveedor_dat_ext=id_proveedor;
            end if;
            id_persona_act:=sp$utils.extract_id_persona(row_log_sub.cedula,
                                                        row_log_sub.primer_nombre,
                                                        row_log_sub.segundo_nombre,
                                                        row_log_sub.primer_apellido,
                                                        row_log_sub.segundo_apellido,
                                                        row_log_sub.apellido_casada);
            --Si no consigue la persona no hace nada
            if id_persona_act is null then
                continue;
            else
               begin
                    select * into row_objecion from objecion_ele_pen 
                    where id_persona=id_persona_act
                    and numero_tipo_obj_ele_pen=26
                    and es_objecion_ele_pen_inactiva=0
                    and fecha_anulacion is  null
                    and id_proveedor_dat_ext=id_proveedor;
               exception when no_data_found then null;
               end;
               if sql%found then
                    --Si consigue la objecion la mantiene activa
                    update objecion_ele_pen
                    set es_objecion_ele_pen_inactiva=0,
                    fecha_ultima_actualizacion=trunc(current_timestamp)
                    where id_objecion_ele_pen=row_objecion.id_objecion_ele_pen;
                    --Se actualiza el log para que la observación diga que la objeción se actualizó
                    update log_imp_sub set es_importado=1, 
                           nombre_archivo=row_Archivo.nombre_archivo_datos_ext, 
                           codigo_archivo=row_Archivo.codigo_archivo_datos_ext, 
                           fecha_hora_transaccion= current_timestamp,
                           observacion='Objeción actualizada'
                    where id_log_imp_sub=row_log_sub.id_log_imp_sub;
               else 
                    --Si no la consigue, la inserta como nueva
                    row_objecion.id_objecion_ele_pen:=utils.bigintid();
                    row_objecion.version_objecion_ele_pen:=0;
                    row_objecion.id_persona:=id_persona_act;
                    row_objecion.id_proveedor_dat_ext:=id_proveedor;
                    row_objecion.numero_tipo_obj_ele_pen:=26;
                    row_objecion.es_objecion_ele_pen_inactiva:=0;
                    row_objecion.fecha_ultima_actualizacion:=trunc(current_timestamp);
                    row_objecion.nombre_archivo_ultima_act:=row_archivo.nombre_original_archivo_datos;
                    insert into objecion_ele_pen values row_objecion;
                    --Se actualiza el log para que la observación diga que la objeción se actualizó
                    update log_imp_sub set es_importado=1, 
                           nombre_archivo=row_Archivo.nombre_archivo_datos_ext, 
                           codigo_archivo=row_Archivo.codigo_archivo_datos_ext, 
                           fecha_hora_transaccion= current_timestamp,
                           observacion='Objeción actualizada'
                    where id_log_imp_sub=row_log_sub.id_log_imp_sub;
               end if;
            end if;
        end loop;
    end loop;

     --6. Buscar codigos en log de fallecidos

    for row_log_fal in (select * from log_imp_fal where cedula=codigo and observacion='Objeción actualizada') 
    loop
        row_objecion:=null;
        for row_archivo in (select * from archivo_datos_ext where codigo_archivo_datos_ext=row_log_fal.codigo_archivo)
        loop
            id_proveedor:=row_archivo.id_proveedor_dat_ext;
            --Se busca la persona
            id_persona_act:=sp$utils.extract_id_persona(row_log_fal.cedula,
                                                        row_log_fal.primer_nombre,
                                                        row_log_fal.segundo_nombre,
                                                        row_log_fal.primer_apellido,
                                                        row_log_fal.segundo_apellido,
                                                        row_log_fal.apellido_casada);
            --Si no consigue la persona no hace nada
            if id_persona_act is null then
                continue;
            else
                begin
                    select * into row_objecion from objecion_ele_pen 
                    where id_persona=id_persona_act
                    and numero_tipo_obj_ele_pen=12
                    and es_objecion_ele_pen_inactiva=0
                    and fecha_anulacion is  null
                    and id_proveedor_dat_ext=id_proveedor;
                exception when no_data_found then null;
                end;
                if not sql%found then
                    begin
                    --Si se consigue se registra la defunción
                        p_fecha_defuncion:=to_timestamp(row_log_fal.defuncion,'dd/mm/yyyy');
                        --Se inserta la persona como fallecida
                        update persona
                        set fecha_certificado_defuncion = p_fecha_defuncion,
                        certificado_defuncion = 'S/N',
                        es_cer_defuncion_anulado =0
                        where  id_persona = id_persona_act;
                        --Se inserta como nueva
                        row_objecion.id_objecion_ele_pen:=utils.bigintid();
                        row_objecion.version_objecion_ele_pen:=0;
                        row_objecion.id_persona:=id_persona_act;
                        row_objecion.id_proveedor_dat_ext:=id_proveedor;
                        row_objecion.numero_tipo_obj_ele_pen:=12;
                        row_objecion.es_objecion_ele_pen_inactiva:=0;
                        row_objecion.fecha_ultima_actualizacion:=trunc(current_timestamp);
                        row_objecion.nombre_archivo_ultima_act:=row_archivo.nombre_original_archivo_datos;
                        insert into objecion_ele_pen values row_objecion;
                        --Se incrementa el total de objeciones. En este caso solo se incrementa cuando se inserta
                        --Se actualiza el log para que la observación diga que la objeción se actualizó
                        update log_imp_fal set es_importado=1, 
                              nombre_archivo=row_Archivo.nombre_archivo_datos_ext, 
                              codigo_archivo=row_Archivo.codigo_archivo_datos_ext, 
                              fecha_hora_transaccion= current_timestamp,
                              observacion='Objeción actualizada'
                        where id_log_imp_fal=row_log_fal.id_log_imp_fal;
                       --dbms_output.put_line('total objeciones '||total_objeciones);
                    exception when others then
                        continue;
                    end;
                end if;
            end if;
        end loop;
    end loop;
    begin
        select count(id_objecion_ele_pen) into total_objeciones from objecion_ele_pen 
        where id_persona=persona_consultada
        and es_objecion_ele_pen_inactiva=0
        and fecha_anulacion is  null;
    exception when no_data_found then null;
    end;
    return total_objeciones;
end;