--Esta función anula una objeción de elegibilidad actualizando 
--@param ficha a vincular
--@return 0 si se ejecuto sin errores.
function anular(objecion number, comentarios varchar2) return varchar2 is
    row_objecion objecion_ele_pen%rowtype;
    row_persona persona%rowtype;
    row_proveedor proveedor_dat_ext%rowtype;
    row_archivo archivo_datos_ext%rowtype;
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000); -- a character string of at most 2048 bytes
    mensaje varchar2(2000);
    condicion number:=0;
begin
    begin
        select * into row_objecion from objecion_ele_pen where id_objecion_ele_pen=objecion;
    exception
        when no_data_found then null;
    end;
    if not sql%found then
        msg_string := 'Objeción no encontrada';
        raise_application_error(err_number, msg_string, true);
    end if;
    --Solo se puede desactivar una objeción Activa
    if row_objecion.es_objecion_ele_pen_inactiva=1 then
        msg_string := 'Objeción ya fue desactivada';
        raise_application_error(err_number, msg_string, true);
    end if;
    --Se ubica la persona
    begin
        select * into row_persona from persona p where p.id_persona=row_objecion.id_persona;
    exception
        when no_data_found then null;
    end;
    if not sql%found then
        msg_string := 'Persona de la objeción no encontrada';
        raise_application_error(err_number, msg_string, true);
    end if;
    --Se ubica el proveedor
    begin
        select * into row_proveedor from proveedor_dat_ext p where p.id_proveedor_dat_ext=row_objecion.id_proveedor_dat_ext;
    exception
        when no_data_found then null;
    end;
    if not sql%found then
        msg_string := 'Proveedor de la objeción no encontrado';
        raise_application_error(err_number, msg_string, true);
    end if;
    --Se inactiva la objeción
    update objecion_ele_pen
    set es_objecion_ele_pen_inactiva=1,
    fecha_anulacion=sysdate,
    observaciones_anulacion=comentarios
    where id_objecion_ele_pen=objecion;
    --Caso especial: si la objeción es de defunción se anula
    if row_objecion.numero_tipo_obj_ele_pen=12 then
        --se anula la defunción
        update persona
        set es_cer_defuncion_anulado =1
        where  id_persona = row_objecion.id_persona;
        --Se identifica el codigo del archivo
        begin
            select * into row_archivo from archivo_datos_ext a 
            where a.id_proveedor_dat_ext=row_proveedor.id_proveedor_dat_ext
            and a.numero_tipo_arc_dat_ext=301;
        exception
            when no_data_found then null;
        end;
        if not sql%found then
            msg_string := 'No existe un archivo de Fallecidos con proveedor '||row_proveedor.nombre_proveedor_dat_ext;
            raise_application_error(err_number, msg_string, true);
        end if;
        --Se elimina del log de importación de fallecidos
        begin
            delete from log_imp_fal
            where cedula=row_persona.codigo_persona
            and codigo_archivo=row_archivo.codigo_archivo_datos_ext;
        exception when no_data_found then null;
        end;
    --Deudores
    elsif row_objecion.numero_tipo_obj_ele_pen=23 then
        --Se identifica el codigo del archivo
        begin
            select * into row_archivo from archivo_datos_ext a 
            where a.id_proveedor_dat_ext=row_proveedor.id_proveedor_dat_ext
            and a.numero_tipo_arc_dat_ext=203;
        exception
            when no_data_found then null;
        end;
        if not sql%found then
            msg_string := 'No existe un archivo de Deudores con proveedor '||row_proveedor.nombre_proveedor_dat_ext;
            raise_application_error(err_number, msg_string, true);
        end if;
        --Se elimina del log de importación de deudores
        if row_objecion.referencia is not null then
            begin
                delete from log_imp_deu
                where cedula=row_persona.codigo_persona
                and referencia=row_objecion.referencia
                and codigo_archivo=row_archivo.codigo_archivo_datos_ext;
            exception when no_data_found then null;
            end;
        else
            begin
                delete from log_imp_deu
                where cedula=row_persona.codigo_persona
                and referencia is null
                and codigo_archivo=row_archivo.codigo_archivo_datos_ext;
            exception when no_data_found then null;
            end;
        end if;
    --Empleados
    elsif row_objecion.numero_tipo_obj_ele_pen=21 then
        --Se identifica el codigo del archivo
        begin
            select * into row_archivo from archivo_datos_ext a 
            where a.id_proveedor_dat_ext=row_proveedor.id_proveedor_dat_ext
            and a.numero_tipo_arc_dat_ext=201;
        exception
            when no_data_found then null;
        end;
        if not sql%found then
            msg_string := 'No existe un archivo de Empleados con proveedor '||row_proveedor.nombre_proveedor_dat_ext;
            raise_application_error(err_number, msg_string, true);
        end if;
        --Se elimina del log de importación de empleados
        begin
            delete from log_imp_emp
            where cedula=row_persona.codigo_persona
            and codigo_archivo=row_archivo.codigo_archivo_datos_ext;
        exception when no_data_found then null;
        end;
    --Jubilados
    elsif row_objecion.numero_tipo_obj_ele_pen=22 then
        --Se identifica el codigo del archivo
        begin
            select * into row_archivo from archivo_datos_ext a 
            where a.id_proveedor_dat_ext=row_proveedor.id_proveedor_dat_ext
            and a.numero_tipo_arc_dat_ext=202;
        exception
            when no_data_found then null;
        end;
        if not sql%found then
            msg_string := 'No existe un archivo de Jubilados con proveedor '||row_proveedor.nombre_proveedor_dat_ext;
            raise_application_error(err_number, msg_string, true);
        end if;
        --Se elimina del log de importación de jubilados y pensionados
        begin
            delete from log_imp_jub
            where cedula=row_persona.codigo_persona
            and upper(tipo_registro) like '%JUBILADO%'
            and codigo_archivo=row_archivo.codigo_archivo_datos_ext;
        exception when no_data_found then null;
        end;
    --Pensionados
    elsif row_objecion.numero_tipo_obj_ele_pen=25 then
        --Se identifica el codigo del archivo
        begin
            select * into row_archivo from archivo_datos_ext a 
            where a.id_proveedor_dat_ext=row_proveedor.id_proveedor_dat_ext
            and a.numero_tipo_arc_dat_ext=205;
        exception
            when no_data_found then null;
        end;
        if not sql%found then
            msg_string := 'No existe un archivo de Pensionados con proveedor '||row_proveedor.nombre_proveedor_dat_ext;
            raise_application_error(err_number, msg_string, true);
        end if;
        --Se elimina del log de importación de jubilados y pensionados
        begin
            delete from log_imp_jub
            where cedula=row_persona.codigo_persona
            and upper(tipo_registro) like '%PENSIONADO%'
            and codigo_archivo=row_archivo.codigo_archivo_datos_ext;
        exception when no_data_found then null;
        end;
    --Penas Judiciales
    elsif row_objecion.numero_tipo_obj_ele_pen=24 then
        --Se identifica el codigo del archivo
        begin
            select * into row_archivo from archivo_datos_ext a 
            where a.id_proveedor_dat_ext=row_proveedor.id_proveedor_dat_ext
            and a.numero_tipo_arc_dat_ext=204;
        exception
            when no_data_found then null;
        end;
        if not sql%found then
            msg_string := 'No existe un archivo de Penas con proveedor '||row_proveedor.nombre_proveedor_dat_ext;
            raise_application_error(err_number, msg_string, true);
        end if;
        --Se elimina del log de importación de empleados
        begin
            delete from log_imp_pen
            where cedula=row_persona.codigo_persona
            and codigo_archivo=row_archivo.codigo_archivo_datos_ext;
        exception when no_data_found then null;
        end;
    --Subsidios
    elsif row_objecion.numero_tipo_obj_ele_pen=26 then
        --Se identifica el codigo del archivo
        begin
            select * into row_archivo from archivo_datos_ext a 
            where a.id_proveedor_dat_ext=row_proveedor.id_proveedor_dat_ext
            and a.numero_tipo_arc_dat_ext=206;
        exception
            when no_data_found then null;
        end;
        if not sql%found then
            msg_string := 'No existe un archivo de Subsidios con proveedor '||row_proveedor.nombre_proveedor_dat_ext;
            raise_application_error(err_number, msg_string, true);
        end if;
        --Se elimina del log de importación de empleados
        begin
            delete from log_imp_sub
            where cedula=row_persona.codigo_persona
            and codigo_archivo=row_archivo.codigo_archivo_datos_ext;
        exception when no_data_found then null;
        end;
    end if;
    --Se actualiza la elegibilidad de la persona.
    condicion:=sp$persona.act_persona_elegible(row_objecion.id_persona);
    dbms_output. put_line('condicion '||condicion);
    if condicion=0 then
        mensaje:='Objeción Anulada. La persona no tiene otras objeciones';
    else
        mensaje:='Objeción Anulada';
    end if;
    return mensaje;
end;
