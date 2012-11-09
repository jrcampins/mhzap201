-- 
-- Este procedimiento importa un archivo de datos externos
-- @param rastro: Identificador del proceso ejecutado.
-- @param archivo: Id del archivo a importar
-- @returns 0 si no se produjo ningún error
--
create or replace function archivo_datos_ext_importar(rastro bigint, archivo bigint) returns integer as $$
declare
mensaje varchar:='';
begin
    select archivo_datos_ext_importar(archivo) into mensaje;
    return rastro_proceso_update(rastro, 21, null, mensaje);
end;
$$ language plpgsql;
-- 
-- Este procedimiento importa un archivo de datos externos, dependiendo del archivo llama al procedimiento correspondiente
-- @param archivo: Id del archivo a importar
-- @returns el valor del icv 
--
create or replace function archivo_datos_ext_importar(archivo bigint) returns varchar as $$
declare
    row_archivo record;
    tipo_archivo integer;
    mensaje varchar:='';
    num_importados integer:=0;
begin
    --Cargo los datos del archivo a importar
    select *
    into   row_archivo
    from   archivo_datos_ext as a
    where  a.id_archivo_datos_ext= archivo;
    if not found then
        raise exception 'Archivo no existe (id=%)', archivo;
    end if;
    --Si ya fue importado no se importa
    if row_archivo.es_archivo_datos_ext_importado=1 then
        raise exception 'Archivo ya fue importado (id=%)', archivo;
    end if;
    --Si el archivo está inactivo no se importa
    if row_archivo.es_archivo_datos_ext_inactivo=1 then
        raise exception 'Archivo Inactivo (id=%)', archivo;
    end if;
    --Se cargan los datos del tipo del archivo
    tipo_archivo= row_archivo.numero_tipo_arc_dat_ext;
    --Dependiendo del tipo de archivo se carga
    --101: Identificaciones
    if tipo_archivo=101 then
        select importar_identificaciones(row_archivo.nombre_archivo_datos_ext,row_archivo.codigo_archivo_datos_ext)into num_importados;
        mensaje:='Registros de Identificación Importados: ';
        mensaje:=mensaje||num_importados;
    --1010: Potenciales beneficiarios
    elsif tipo_archivo=102 then
        select importar_potenciales_beneficiarios(row_archivo.nombre_archivo_datos_ext,row_archivo.codigo_archivo_datos_ext)into num_importados;
        mensaje:='Registros de Potenciales Beneficiarios Importados: ';
        mensaje:=mensaje||num_importados;
    --201: Empleados
    elsif tipo_archivo=201 then
        select importar_empleados(row_archivo.nombre_archivo_datos_ext,row_archivo.codigo_archivo_datos_ext)into num_importados;
        mensaje:='Registros de Empleados Actualizados: ';
        mensaje:=mensaje||num_importados;
    --202: Jubilados y Pensionados
    elsif tipo_archivo=202 then
        select importar_jubilados_pensionados(row_archivo.nombre_archivo_datos_ext,row_archivo.codigo_archivo_datos_ext)into num_importados;
        mensaje:='Registros de Jubilados y Pensionados Actualizados: ';
        mensaje:=mensaje||num_importados;
    --203: Deudores
    elsif tipo_archivo=203 then
        select importar_deudores(row_archivo.nombre_archivo_datos_ext,row_archivo.codigo_archivo_datos_ext)into num_importados;
        mensaje:='Registros de Deudores Actualizados: ';
        mensaje:=mensaje||num_importados;
    --204: Penas Judiciales
    elsif tipo_archivo=204 then
        select importar_penas(row_archivo.nombre_archivo_datos_ext,row_archivo.codigo_archivo_datos_ext)into num_importados;
        mensaje:='Registros de Penas Judiciales Actualizados: ';
        mensaje:=mensaje||num_importados;
    --301: Fallecidos
    elsif tipo_archivo=301 then
        select importar_fallecidos(row_archivo.nombre_archivo_datos_ext,row_archivo.codigo_archivo_datos_ext)into num_importados;
        mensaje:='Registros de Fallecidos Importados: ';
        mensaje:=mensaje||num_importados;
    --401: Ficha Hogar
    elsif tipo_archivo=401 then
        select importar_ficha_hogar(row_archivo.nombre_archivo_datos_ext,row_archivo.codigo_archivo_datos_ext)into num_importados;
        mensaje:='Registros de Ficha Hogar Importados: ';
        mensaje:=mensaje||num_importados;
    --402: Ficha Persona
    elsif tipo_archivo=402 then
        select importar_ficha_persona(row_archivo.nombre_archivo_datos_ext,row_archivo.codigo_archivo_datos_ext)into num_importados;
        mensaje:='Registros de Ficha de Persona Importados: ';
        mensaje:=mensaje||num_importados;
    end if;
    --Luego de importado el contenido del archivo, se actualiza como importado
    update archivo_datos_ext set es_archivo_datos_ext_importado=1
           where id_archivo_datos_ext=archivo;
    return mensaje;
exception when others then
        mensaje:='Error: '||SQLERRM;
        return mensaje;
end;
$$ language plpgsql;
