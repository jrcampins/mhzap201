procedure importar_identificaciones(nombre_archivo varchar2, codigo_archivo varchar2, retorno out number) as
    --retorno number:=0;
    nombre_tabla varchar2(200):='csv_log_imp_ids';
    tipo_arch varchar2(10);
    numero_cedula number;
    letra_cedula char;
    current_id log_imp_ids%rowtype;
    new_persona persona%rowtype;
    mensaje varchar2(2000):='';
    array_nombres sp$utils.t_array;
    array_apellidos sp$utils.t_array;
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000); -- a character string of at most 2048 bytes
begin
    retorno:=0;
    if nombre_archivo is null then
        msg_string := 'archivo no existe';
        raise_application_error(err_number, msg_string, true);
    end if;
    if codigo_archivo is null then
        msg_string := 'codigo de archivo no existe';
        raise_application_error(err_number, msg_string, true);
    else
        begin
            select numero_tipo_arc_dat_ext into tipo_arch from archivo_datos_ext where codigo_archivo_datos_ext=codigo_archivo;
        exception
            when no_data_found then
            msg_string := 'Archivo ' || codigo_archivo || ' no existe ';
            raise_application_error(err_number, msg_string, true);
        end;
        if sql%found then
            if tipo_arch!='101' then
                msg_string := 'Archivo ' || codigo_archivo || ' NO es de identificaciones ';
                raise_application_error(err_number, msg_string, true);
            end if;
        end if;
    end if;
    
    update archivo_datos_ext set es_archivo_datos_ext_importado=1, fecha_hora_ultima_importacion=current_timestamp where codigo_archivo_datos_ext=codigo_archivo;
    --creamos y llenamos la tabla externa csv_log_imp_ids
    sp$100.create_csv_log_imp_ids(nombre_archivo, 'WE8ISO8859P1', '1', ';', '"');
    insert into log_imp_ids
        (
        id_log_imp_ids,
        cedula ,
        letra_cedula ,
        apellidos ,
        nombres ,
        nacimiento ,
        sexo ,
        nacionalidad ,
        estado_civil ,
        lugar_nacimiento ,
        indigena
        )
    select
        utils.bigintid(),
        cedula ,
        letra_cedula ,
        apellidos ,
        nombres ,
        fecha_nacimiento ,
        sexo ,
        nacionalidad ,
        estado_civil ,
        lugar_nacimiento ,
        es_indigena
    from csv_log_imp_ids;
    --importamos personas
    for identificacion in (select * from log_imp_ids where es_importado=0)
    loop
        begin
--Reiniciar los valores de la nueva persona para cada registro a importar
        new_persona.id_persona:=utils.bigintid();
        new_persona.version_persona:=0;
        
        new_persona.numero_cedula:=null;
        new_persona.letra_cedula:=null;
        
        new_persona.es_indigena:=0;
        new_persona.es_certificado_vida_anulado:=0;
        new_persona.es_cer_defuncion_anulado:=0;
        new_persona.es_persona_con_empleo:=0;
        new_persona.es_persona_con_jubilacion:= 0;
        new_persona.es_persona_con_pension:=0;
        new_persona.es_persona_con_subsidio:=0;
        new_persona.es_persona_con_deuda:=0;
        new_persona.es_persona_con_pena_judicial:=0;
        new_persona.es_persona_con_cer_vida:=0;
        new_persona.es_persona_con_carta_renuncia:=0;
        new_persona.es_persona_elegible_para_pen:=0;
        new_persona.es_persona_acreditada_para_pen:=0;
        new_persona.es_persona_con_copia_cedula:=0;
        new_persona.es_persona_con_declaracion_jur:=0;

        --Si la persona tiene cedula se inserta
        numero_cedula:=sp$utils.extract_numero_from_cedula(identificacion.cedula);
        if  numero_cedula is not null then
            new_persona.numero_cedula:=numero_cedula;
        else
        --Si no tiene cedula se actualiza el motivo de no inserción
            msg_string :='Cédula erronea'||identificacion.cedula;
        end if;
        --Si la cedula tiene letra, se importa como campo aparte
        letra_cedula:=sp$utils.extract_letra_from_cedula(identificacion.cedula);
        if letra_cedula is not null then
            new_persona.letra_cedula:=letra_cedula;
        end if;
        if identificacion.nombres is not null 
           and identificacion.apellidos is not null then
            new_persona.nombre_persona:=identificacion.nombres
                                       ||' '||identificacion.apellidos;
        elsif identificacion.nombres is null then
            msg_string := 'Nombres no pueden ser vacíos';
            raise_application_error(err_number, msg_string, true);
        elsif identificacion.apellidos is null then
            msg_string := 'Apellidos no pueden ser vacíos';
            raise_application_error(err_number, msg_string, true);
        end if;
        --Se separan los nombres en un array
        array_nombres:= sp$utils.split(identificacion.nombres,' ');
        --Se asigna primer y segundo nombre a persona
        new_persona.primer_nombre:=array_nombres(1);
        if array_nombres.count=2 then
            new_persona.segundo_nombre:=array_nombres(2);
        elsif array_nombres.count=3 then
            new_persona.segundo_nombre:=array_nombres(2)||' '||array_nombres(3);
        end if;
        --Se separan los apellidos en un array
        array_apellidos:=sp$utils.split(identificacion.apellidos,' ');
        --Se asignan primer y segundo apellido a la persona
        new_persona.primer_apellido:=array_apellidos(1);
        if array_apellidos.count=2 then
            new_persona.segundo_apellido:=array_apellidos(2);
        elsif array_apellidos.count=3 then
            new_persona.segundo_apellido:=array_apellidos(2)||' '||array_apellidos(3);
        end if;
        --Se extrae la fecha de nacimiento
        new_persona.fecha_nacimiento:=to_date(identificacion.nacimiento,'yyyymmdd');
        --Se convierte al formato requerido (2 Femenino pasa a 1 y 1 Masculino pasa a 6)
        new_persona.numero_sexo_persona:=sp$utils.extract_sexo_persona(identificacion.sexo);
        --Se convierte la nacionalidad al formato requerido ( si es 226 es paraguayo, cualquier otro numero no es paraguayo)
        new_persona.es_paraguayo_natural:=sp$utils.extract_es_paraguayo(identificacion.nacionalidad);
        --Se convierte el estado civil al formato requerido (1 soltero no se convierte, 2 casado no se convierte, 4 se convierte en 3 divorciado, 5 se convierte en 4 viudo) 
        new_persona.numero_estado_civil:=sp$utils.extract_estado_civil(identificacion.estado_civil);
        --Se convierte el numero de condicion de indigena (1 si es indigena, 0 si no lo es)
        new_persona.es_indigena:=sp$utils.extract_es_indigena(identificacion.indigena);
        --Se inserta el registro importado en la tabla persona
        insert into persona values new_persona;
        --Se incrementa el numero de insertados
        retorno:=retorno+1;
        --Se registra la inserción en la tabla intermedia
        update log_imp_ids set es_importado=1, 
                                nombre_archivo=nombre_Archivo, 
                                codigo_archivo=codigo_archivo, 
                                fecha_hora_transaccion= current_timestamp 
        where id_log_imp_ids=identificacion.id_log_imp_ids;
        --Si no se pudo insertar el registro se marca el motivo
        exception
                when others then
                    mensaje:='Error '||SQLCODE||'('||SQLERRM||')';
                    update log_imp_ids set es_importado=0, nombre_archivo=nombre_Archivo, codigo_archivo=codigo_archivo, fecha_hora_transaccion= current_timestamp, observacion=mensaje where id_log_imp_ids=identificacion.id_log_imp_ids;
                    continue;
        end;
    end loop;
end;