-- 
-- Este procedimiento importa un archivo de datos externos, dependiendo del archivo llama al procedimiento correspondiente
-- @param archivo: Id del archivo a importar
-- @returns el valor del icv 
--
function importar(archivo number) return varchar2 is
    row_archivo archivo_datos_ext%rowtype;
    tipo_archivo number;
    mensaje varchar2(2000):='';
    num_importados number:=0;
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000); -- a character string of at most 2048 bytes
begin
    --Cargo los datos del archivo a importar
    begin
        select * into   row_archivo from   archivo_datos_ext a where  a.id_archivo_datos_ext= archivo;
    exception
        when no_data_found then
            null;
    end;
    if not sql%found then
        msg_string:= 'Archivo no existe ';
        raise_application_error(err_number, msg_string, true);
    end if;
    --Si ya fue importado no se importa
    if row_archivo.es_archivo_datos_ext_importado=1 then
        msg_string:='Archivo ya fue importado ';
        raise_application_error(err_number, msg_string, true);
    end if;
    --Si el archivo está inactivo no se importa
    if row_archivo.es_archivo_datos_ext_inactivo=1 then
        msg_string:= 'Archivo Inactivo ';
        raise_application_error(err_number, msg_string, true);
    end if;
    --Se cargan los datos del tipo del archivo
    tipo_archivo:= row_archivo.numero_tipo_arc_dat_ext;
    --Dependiendo del tipo de archivo se carga
    --101: Identificaciones
    if tipo_archivo=101 then
        importar_identificaciones(row_archivo.nombre_archivo_datos_ext,row_archivo.codigo_archivo_datos_ext,num_importados);
        mensaje:='Registros de Identificación Importados: ';
        mensaje:=mensaje||num_importados;
    --1010: Potenciales beneficiarios
    elsif tipo_archivo=102 then
        importar_pot_ben(row_archivo.nombre_archivo_datos_ext,row_archivo.codigo_archivo_datos_ext, num_importados);
        mensaje:='Registros de Potenciales Beneficiarios Importados: ';
        mensaje:=mensaje||num_importados;
    --201: Empleados
    elsif tipo_archivo=201 then
        importar_empleados(row_archivo.nombre_archivo_datos_ext,row_archivo.codigo_archivo_datos_ext,num_importados);
        mensaje:='Registros de Empleados Actualizados: ';
        mensaje:=mensaje||num_importados;
    --202: Jubilados y Pensionados
    elsif tipo_archivo=202 then
        importar_jubilados_pens(row_archivo.nombre_archivo_datos_ext,row_archivo.codigo_archivo_datos_ext,num_importados);
        mensaje:='Registros de Jubilados y Pensionados Actualizados: ';
        mensaje:=mensaje||num_importados;
    --203: Deudores
    elsif tipo_archivo=203 then
        importar_deudores(row_archivo.nombre_archivo_datos_ext,row_archivo.codigo_archivo_datos_ext,num_importados);
        mensaje:='Registros de Deudores Actualizados: ';
        mensaje:=mensaje||num_importados;
    --204: Penas Judiciales
    elsif tipo_archivo=204 then
        importar_penas(row_archivo.nombre_archivo_datos_ext,row_archivo.codigo_archivo_datos_ext,num_importados);
        mensaje:='Registros de Penas Judiciales Actualizados: ';
        mensaje:=mensaje||num_importados;
    --301: Fallecidos
    elsif tipo_archivo=301 then
        importar_fallecidos(row_archivo.nombre_archivo_datos_ext,row_archivo.codigo_archivo_datos_ext,num_importados);
        mensaje:='Registros de Fallecidos Importados: ';
        mensaje:=mensaje||num_importados;
    --401: Ficha Hogar
    elsif tipo_archivo=401 then
        importar_ficha_hogar(row_archivo.nombre_archivo_datos_ext,row_archivo.codigo_archivo_datos_ext,num_importados);
        mensaje:='Registros de Ficha Hogar Importados: ';
        mensaje:=mensaje||num_importados;
    --402: Ficha Persona
    elsif tipo_archivo=402 then
        importar_ficha_persona(row_archivo.nombre_archivo_datos_ext,row_archivo.codigo_archivo_datos_ext,num_importados);
        mensaje:='Registros de Ficha de Persona Importados: ';
        mensaje:=mensaje||num_importados;
    end if;
    --Luego de importado el contenido del archivo, se actualiza como importado
    update archivo_datos_ext set es_archivo_datos_ext_importado=1 where id_archivo_datos_ext=archivo;
    return mensaje;
exception when others then
        mensaje:='Error: '||SQLERRM;
        return mensaje;
end;