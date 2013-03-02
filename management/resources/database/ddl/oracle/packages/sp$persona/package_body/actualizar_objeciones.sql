--
--Descripción: Este procedimiento actualiza las objeciones que puede tener una persona a la obtención de una pensión y actualiza la elegibilidad de la persona, para ello verifica si se cumplen las condiciones que excluyen el pago de pensiones.
--@param id_persona: id de la persona sobre la que se ejecutara la funcion
--@param codigo: codigo de la persona sobre la que se ejecutara
--@return: 0 si no hubo ninguna objeción, en caso de que haya habido una objeción, retorna el número de causa de no elegibilidad (De acuerdo a la tabla causa_den_pension)
--
function actualizar_objeciones(codigo varchar2,persona_consultada number) return number is
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
    mensaje varchar2(4000);
    mensaje_defuncion varchar2(4000);
    err_number constant number := -20000; -- an integer in the range -20000..-20999
    msg_string varchar2(2000); -- a character string of at most 2048 bytes
begin
    if codigo is null or persona_consultada is null then
       return 0;
    end if;
    --1. Buscar codigos en log de deudores
    for row_log_deu in (select * from log_imp_deu where cedula=codigo) 
    loop
        for row_archivo in (select * from archivo_datos_ext where codigo_archivo_datos_ext=row_log_deu.codigo_archivo)
        loop
            id_proveedor:=row_archivo.id_proveedor_dat_ext;
            begin
                select count(id_objecion_ele_pen) into conta_objeciones from objecion_ele_pen 
                where numero_tipo_obj_ele_pen=23 
                and id_proveedor_dat_ext=id_proveedor;
            exception when no_data_found then null;
            end;
            if conta_objeciones>0 then
                update objecion_ele_pen
                set es_objecion_ele_pen_inactiva=1,
                fecha_ultima_actualizacion=trunc(current_timestamp)
                where id_persona=persona_consultada
                and numero_tipo_obj_ele_pen=23
                and id_proveedor_dat_ext=id_proveedor;
            end if;
            id_persona_act:=sp$utils.extract_id_persona(row_log_deu.cedula,
                                                        row_log_deu.primer_nombre,
                                                        row_log_deu.segundo_nombre,
                                                        row_log_deu.primer_apellido,
                                                        row_log_deu.segundo_apellido,
                                                        row_log_deu.apellido_casada);
            --Si no consigue la persona no hace nada
            if id_persona_act is null then
                continue;
            else
               begin
                    select * into row_objecion from objecion_ele_pen 
                    where id_persona=id_persona_act
                    and numero_tipo_obj_ele_pen=23
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
                    row_objecion.numero_tipo_obj_ele_pen:=23;
                    row_objecion.es_objecion_ele_pen_inactiva:=0;
                    row_objecion.fecha_ultima_actualizacion:=trunc(current_timestamp);
                    row_objecion.nombre_archivo_ultima_act:=row_archivo.nombre_original_archivo_datos;
                    insert into objecion_ele_pen values row_objecion;
               end if;
               --Se actualiza el log para que la observación diga que la objeción se actualizó
               update log_imp_deu set es_importado=1, 
                      nombre_archivo=row_Archivo.nombre_archivo_datos_ext, 
                      codigo_archivo=row_Archivo.codigo_archivo_datos_ext, 
                      fecha_hora_transaccion= current_timestamp,
                      observacion='Objeción actualizada'
               where id_log_imp_deu=row_log_deu.id_log_imp_deu;
               total_objeciones:=total_objeciones+1;
            end if;
        end loop;
    end loop;
    --2. Buscar codigos en log de empleados
    for row_log_emp in (select * from log_imp_emp where cedula=codigo) 
    loop
        for row_archivo in (select * from archivo_datos_ext where codigo_archivo_datos_ext=row_log_emp.codigo_archivo)
        loop
            id_proveedor:=row_archivo.id_proveedor_dat_ext;
            begin
                select count(id_objecion_ele_pen) into conta_objeciones from objecion_ele_pen 
                where numero_tipo_obj_ele_pen=21 
                and id_proveedor_dat_ext=id_proveedor;
            exception when no_data_found then null;
            end;
            if conta_objeciones>0 then
                update objecion_ele_pen
                set es_objecion_ele_pen_inactiva=1,
                fecha_ultima_actualizacion=trunc(current_timestamp)
                where numero_tipo_obj_ele_pen=21
                and id_persona=persona_consultada
                and id_proveedor_dat_ext=id_proveedor;
            end if;
            id_persona_act:=sp$utils.extract_id_persona(row_log_emp.cedula,
                                                        row_log_emp.primer_nombre,
                                                        row_log_emp.segundo_nombre,
                                                        row_log_emp.primer_apellido,
                                                        row_log_emp.segundo_apellido,
                                                        row_log_emp.apellido_casada);
            --Si no consigue la persona no hace nada
            if id_persona_act is null then
                continue;
            else
               begin
                    select * into row_objecion from objecion_ele_pen 
                    where id_persona=id_persona_act
                    and numero_tipo_obj_ele_pen=21
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
                    row_objecion.numero_tipo_obj_ele_pen:=21;
                    row_objecion.es_objecion_ele_pen_inactiva:=0;
                    row_objecion.fecha_ultima_actualizacion:=trunc(current_timestamp);
                    row_objecion.nombre_archivo_ultima_act:=row_archivo.nombre_original_archivo_datos;
                    insert into objecion_ele_pen values row_objecion;
               end if;
               --Se actualiza el log para que la observación diga que la objeción se actualizó
               update log_imp_emp set es_importado=1, 
                      nombre_archivo=row_Archivo.nombre_archivo_datos_ext, 
                      codigo_archivo=row_Archivo.codigo_archivo_datos_ext, 
                      fecha_hora_transaccion= current_timestamp,
                      observacion='Objeción actualizada'
               where id_log_imp_emp=row_log_emp.id_log_imp_emp;
               total_objeciones:=total_objeciones+1;
            end if;
        end loop;
    end loop;

    --3. Buscar codigos en log de jubilados y pensionados
    for row_log_jub in (select * from log_imp_jub where cedula=codigo) 
    loop
        for row_archivo in (select * from archivo_datos_ext where codigo_archivo_datos_ext=row_log_jub.codigo_archivo)
        loop
            id_proveedor:=row_archivo.id_proveedor_dat_ext;
            --Jubilados
            if(upper(row_log_jub.tipo_registro) like '%JUBILADO%') then
                begin
                    select count(id_objecion_ele_pen) into conta_objeciones from objecion_ele_pen 
                    where (numero_tipo_obj_ele_pen=22)
                    and id_proveedor_dat_ext=id_proveedor;
                exception when no_data_found then null;
                end;
                if conta_objeciones>0 then
                    update objecion_ele_pen
                    set es_objecion_ele_pen_inactiva=1,
                    fecha_ultima_actualizacion=trunc(current_timestamp)
                    where numero_tipo_obj_ele_pen=22
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
                   end if;
                   --Se actualiza el log para que la observación diga que la objeción se actualizó
                   update log_imp_jub set es_importado=1, 
                          nombre_archivo=row_Archivo.nombre_archivo_datos_ext, 
                          codigo_archivo=row_Archivo.codigo_archivo_datos_ext, 
                          fecha_hora_transaccion= current_timestamp,
                          observacion='Objeción actualizada'
                   where id_log_imp_jub=row_log_jub.id_log_imp_jub;
                   total_objeciones:=total_objeciones+1;
                end if;
            --Pensionados 
            elsif (upper(row_log_jub.tipo_registro) like '%PENSIONADO%') then
                begin
                    select count(id_objecion_ele_pen) into conta_objeciones from objecion_ele_pen 
                    where (numero_tipo_obj_ele_pen=25)
                    and id_proveedor_dat_ext=id_proveedor;
                exception when no_data_found then null;
                end;
                if conta_objeciones>0 then
                    update objecion_ele_pen
                    set es_objecion_ele_pen_inactiva=1,
                    fecha_ultima_actualizacion=trunc(current_timestamp)
                    where numero_tipo_obj_ele_pen=25
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
                   end if;
                   --Se actualiza el log para que la observación diga que la objeción se actualizó
                   update log_imp_jub set es_importado=1, 
                          nombre_archivo=row_Archivo.nombre_archivo_datos_ext, 
                          codigo_archivo=row_Archivo.codigo_archivo_datos_ext, 
                          fecha_hora_transaccion= current_timestamp,
                          observacion='Objeción actualizada'
                   where id_log_imp_jub=row_log_jub.id_log_imp_jub;
                   total_objeciones:=total_objeciones+1;
                end if;
            end if;
        end loop;
    end loop;
    --4. Buscar codigos en log de penas
    for row_log_pen in (select * from log_imp_pen where cedula=codigo) 
    loop
        for row_archivo in (select * from archivo_datos_ext where codigo_archivo_datos_ext=row_log_pen.codigo_archivo)
        loop
            id_proveedor:=row_archivo.id_proveedor_dat_ext;
            begin
                select count(id_objecion_ele_pen) into conta_objeciones from objecion_ele_pen 
                where numero_tipo_obj_ele_pen=24 
                and id_proveedor_dat_ext=id_proveedor;
            exception when no_data_found then null;
            end;
            if conta_objeciones>0 then
                update objecion_ele_pen
                set es_objecion_ele_pen_inactiva=1,
                fecha_ultima_actualizacion=trunc(current_timestamp)
                where numero_tipo_obj_ele_pen=24
                and id_persona=persona_consultada
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
                    row_objecion.numero_tipo_obj_ele_pen:=24;
                    row_objecion.es_objecion_ele_pen_inactiva:=0;
                    row_objecion.fecha_ultima_actualizacion:=trunc(current_timestamp);
                    row_objecion.nombre_archivo_ultima_act:=row_archivo.nombre_original_archivo_datos;
                    insert into objecion_ele_pen values row_objecion;
               end if;
               --Se actualiza el log para que la observación diga que la objeción se actualizó
               update log_imp_pen set es_importado=1, 
                      nombre_archivo=row_Archivo.nombre_archivo_datos_ext, 
                      codigo_archivo=row_Archivo.codigo_archivo_datos_ext, 
                      fecha_hora_transaccion= current_timestamp,
                      observacion='Objeción actualizada'
               where id_log_imp_pen=row_log_pen.id_log_imp_pen;
               total_objeciones:=total_objeciones+1;
            end if;
        end loop;
    end loop;
    --5. Buscar codigos en log de subsidios
    --Cambiar 25 por 26
    for row_log_sub in (select * from log_imp_sub where cedula=codigo) 
    loop
        for row_archivo in (select * from archivo_datos_ext where codigo_archivo_datos_ext=row_log_sub.codigo_archivo)
        loop
            id_proveedor:=row_archivo.id_proveedor_dat_ext;
            begin
                select count(id_objecion_ele_pen) into conta_objeciones from objecion_ele_pen 
                where numero_tipo_obj_ele_pen=26 
                and id_proveedor_dat_ext=id_proveedor;
            exception when no_data_found then null;
            end;
            if conta_objeciones>0 then
                update objecion_ele_pen
                set es_objecion_ele_pen_inactiva=1,
                fecha_ultima_actualizacion=trunc(current_timestamp)
                where numero_tipo_obj_ele_pen=26
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
                    row_objecion.numero_tipo_obj_ele_pen:=26;
                    row_objecion.es_objecion_ele_pen_inactiva:=0;
                    row_objecion.fecha_ultima_actualizacion:=trunc(current_timestamp);
                    row_objecion.nombre_archivo_ultima_act:=row_archivo.nombre_original_archivo_datos;
                    insert into objecion_ele_pen values row_objecion;
               end if;
               --Se actualiza el log para que la observación diga que la objeción se actualizó
               update log_imp_sub set es_importado=1, 
                      nombre_archivo=row_Archivo.nombre_archivo_datos_ext, 
                      codigo_archivo=row_Archivo.codigo_archivo_datos_ext, 
                      fecha_hora_transaccion= current_timestamp,
                      observacion='Objeción actualizada'
               where id_log_imp_sub=row_log_sub.id_log_imp_sub;
               total_objeciones:=total_objeciones+1;
            end if;
        end loop;
    end loop;
     --6. Buscar codigos en log de fallecidos
    for row_log_fal in (select * from log_imp_fal where cedula=codigo) 
    loop
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
                --Si se consigue se registra la defunción
                   p_fecha_defuncion:=to_timestamp(row_log_fal.defuncion,'dd/mm/yyyy');
                   mensaje_defuncion:=sp$persona.registrar_cer_defun(id_persona_act,'S/N',p_fecha_defuncion);
                   if mensaje_defuncion like 'Certificado de Defunción Registrado%' then
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
                        total_objeciones:=total_objeciones+1;
                   end if;
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
        end loop;
    end loop;
    return total_objeciones;
exception
    when others then
        mensaje:='Error '||SQLCODE||'('||SQLERRM||')';
        update log_imp_emp set es_importado=0, fecha_hora_transaccion= current_timestamp, observacion=mensaje where cedula=codigo;
end;