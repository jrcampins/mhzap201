-- 
-- Este procedimiento importa un archivo de datos externos, particularmente el archivo de potenciales beneficiarios
-- @param nombre_archivo: Nombre del archivo a importar
-- @param codigo_Archivo: Codigo del archivo a importar
-- @returns numero de registros importados
--
procedure importar_pot_ben(nombre_archivo varchar2, codigo_archivo varchar2, retorno out number) as
    nombre_tabla varchar2(200):='csv_log_imp_pot';
    registro log_imp_pot%rowtype;
    id_ubicacion_insertar number;
    new_potencial_ben potencial_ben%ROWTYPE;
    array_nombres sp$utils.t_array;
    mensaje varchar2(4000):='';
    tipo_arch number;
    i number:=0;
    nombre_beneficiario varchar2(255):='';
    id_distrito_potencial_ben number:=0;
    id_departamento_potencial_ben number:=0;
    id_barrio_potencial_ben number:=0;
    id_persona_asociada number :=0;
    id_ficha_persona_asociada number:=0;
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
            if tipo_arch!='102' then
                msg_string := 'Archivo ' || codigo_archivo || ' NO es de Potenciales Beneficiarios ';
                raise_application_error(err_number, msg_string, true);
            end if;
        end if;
    end if;   
    update archivo_datos_ext set es_archivo_datos_ext_importado=1, fecha_hora_ultima_importacion=current_timestamp where codigo_archivo_datos_ext=codigo_archivo;
    --creamos y llenamos la tabla externa csv_log_imp_ids
    sp$100.create_csv_log_imp_pot(nombre_archivo, 'WE8ISO8859P1', '1', ';', '"');
    insert into log_imp_pot
        (
         id_log_imp_pot,
         departamento,
         distrito,
         nombres_apellidos,
         apodo,
         edad_a_la_fecha,
         nacimiento,
         cedula,
         telefono,
         direccion,
         referencia,
         barrio,
         nombre_referente,
         telefono_referente
        )
    select
        utils.bigintid(),
        departamento,
        distrito,
        nombres_apellidos,
        apodo,
        edad,
        fecha_nacimiento,
        numero_cedula,
        numero_telefono,
        direccion,
        referencia,
        barrio,
        nombre_referente,
        numero_telefono_referente
    from csv_log_imp_pot;    
    for registro in (select * from log_imp_pot where es_importado=0 and observacion is null)
    loop
        begin
            ----dbms_output.PUT_LINE('Linea = ' || i);
            i:=i+1;
            new_potencial_ben.id_potencial_ben:=utils.bigintid();
            new_potencial_ben.version_potencial_ben:=0;
            new_potencial_ben.es_paraguayo_natural:=1;
            new_potencial_ben.es_indigena:=0;
            new_potencial_ben.numero_tipo_reg_pot_ben:=2;
            new_potencial_ben.numero_cedula:=null;
            new_potencial_ben.letra_cedula:=null;
            new_potencial_ben.primer_nombre:=null;
            new_potencial_ben.segundo_nombre:=null;
            new_potencial_ben.primer_apellido:=null;
            new_potencial_ben.apellido_casada:=null;
            new_potencial_ben.segundo_apellido:=null;
            new_potencial_ben.apodo:=null;
            new_potencial_ben.es_persona_con_empleo:=0;
            new_potencial_ben.es_persona_con_jubilacion:= 0;
            new_potencial_ben.es_persona_con_pension:=0;
            new_potencial_ben.es_persona_con_subsidio:=0;
            new_potencial_ben.es_persona_con_deuda:=0;
            new_potencial_ben.es_persona_con_pena_judicial:=0;
            new_potencial_ben.es_persona_con_cer_vida:=0;
            new_potencial_ben.es_persona_con_carta_renuncia:=0;
            new_potencial_ben.es_potencial_ben_inactivo:=0;
            new_potencial_ben.letra_cedula:=null;
            new_potencial_ben.numero_telefono_resp_hogar:=null;
            new_potencial_ben.direccion:=null;
            new_potencial_ben.id_barrio:=null;
            --new_potencial_ben.numero_tipo_area:=null;
            new_potencial_ben.id_departamento:=null;
            new_potencial_ben.id_distrito:=null;
            new_potencial_ben.nombre_referente:=null;
            new_potencial_ben.numero_telefono_referente:=null;
            new_potencial_ben.id_persona:=null;
            id_persona_asociada:=null;
            id_ficha_persona_asociada:=null;
            --Reiniciar los valores de la nueva persona para cada registro a importar
            --Se captura el departamento
            id_departamento_potencial_ben:=sp$utils.get_id_departamento(registro.departamento);
            if(id_departamento_potencial_ben<>0 )then
                new_potencial_ben.id_departamento:=id_departamento_potencial_ben;
            end if;
            --Se captura el distrito
            id_distrito_potencial_ben:=sp$utils.get_id_distrito(registro.departamento,registro.distrito);
            if(id_distrito_potencial_ben<>0 )then
                new_potencial_ben.id_distrito:=id_distrito_potencial_ben;
            end if;
            --Se importa el barrio, para ello, primero se ubica el barrio en la tabla correspondiente
            id_barrio_potencial_ben:=sp$utils.get_id_barrio(registro.distrito,registro.barrio);
            if(id_barrio_potencial_ben<>0 )then
                new_potencial_ben.id_barrio:=id_barrio_potencial_ben;
                new_potencial_ben.numero_tipo_area:=sp$utils.get_numero_tipo_area(id_barrio_potencial_ben);
            end if;
            --Se capturan los nombres
            if(registro.nombres_apellidos is not null) then
                new_potencial_ben.nombre_potencial_ben:= ltrim(rtrim(registro.nombres_apellidos));
            else
                msg_string := 'Nombres y Apellidos no pueden ser vacíos ';
                raise_application_error(err_number, msg_string, true);
            end if;
            --Se asigna el apodo del potencial beneficiario
            new_potencial_ben.apodo:=registro.apodo;            
            --Se asigna la fecha de nacimiento
            new_potencial_ben.fecha_nacimiento:=to_date(registro.nacimiento,'dd/mm/yyyy');
            --Se calcula la edad
            if(new_potencial_ben.fecha_nacimiento is not null) then
                new_potencial_ben.edad:=(months_between(sysdate,new_potencial_ben.fecha_nacimiento)/12);
            end if;
            --Se asigna el numero de cedula y tipo de registro
            if sp$utils.extract_numero_from_cedula(registro.cedula) is not null then
                new_potencial_ben.numero_cedula:=sp$utils.extract_numero_from_cedula(registro.cedula);
            end if;
            --Si la cedula tiene letra, se importa como campo aparte
            if sp$utils.extract_letra_from_cedula(registro.cedula) is not null then
                new_potencial_ben.letra_cedula:=sp$utils.extract_letra_from_cedula(registro.cedula);
            end if;
            --Se importa el telefono del responsable del hogar
            new_potencial_ben.numero_telefono_resp_hogar:=registro.telefono;
            --Se importa la direccion
            new_potencial_ben.direccion:=registro.direccion;
            --Se importa la referencia
            new_potencial_ben.referencia_direccion:=registro.referencia;
            --Se importa el referente
            new_potencial_ben.nombre_referente:=registro.nombre_referente;
            --Se importa el telefono del referente
            new_potencial_ben.numero_telefono_referente:=registro.telefono_referente;
            --Se importa como potencial beneficiario a censar
            new_potencial_ben.numero_condicion_censo:=1;
            --Se importa la persona si existe
            if(new_potencial_ben.numero_cedula is not null) then           
                id_persona_asociada:=sp$potencial_ben.extract_id_persona(new_potencial_ben);
                --Si se pudo obtener un id de persona se vincula
                if id_persona_asociada is not null then
                    new_potencial_ben.numero_tipo_reg_pot_ben:=1;
                    new_potencial_ben.id_persona:=id_persona_asociada;
                --Sino se registra sin cedula
                else               
                    new_potencial_ben.numero_tipo_reg_pot_ben:=2;
                    new_potencial_ben.numero_cedula:=null;
                    new_potencial_ben.letra_cedula:=null;
                    --Se notifica que se insertará sin cédula
                    update log_imp_pot
                    set observacion='Persona no encontrada. Cédula ignorada. '
                    where id_log_imp_pot=registro.id_log_imp_pot;
                end if;
            else
                new_potencial_ben.numero_tipo_reg_pot_ben:=2;
                new_potencial_ben.letra_cedula:=null;
            end if;
            --Si el barrio no fue encontrado se concatena a la direccion
            if(new_potencial_ben.id_barrio is null and registro.barrio is not null) then
                new_potencial_ben.direccion:=new_potencial_ben.direccion||' ('||registro.barrio||')';
                begin
                    select observacion into mensaje from log_imp_pot where id_log_imp_pot=registro.id_log_imp_pot;
                exception when no_data_found then null;
                end;
                if mensaje is null then
                    update log_imp_pot
                    set observacion='Barrio no encontrado. Se agregó a la dirección.'
                    where id_log_imp_pot=registro.id_log_imp_pot;
                else
                    update log_imp_pot
                    set observacion=mensaje||'Barrio no encontrado. Se agregó a la dirección. '
                    where id_log_imp_pot=registro.id_log_imp_pot;
                end if;
            end if;
            --Se inserta el registro importado en la tabla potencial_ben
            insert into potencial_ben values new_potencial_ben;
            --Se incrementa el numero de insertados
            retorno:=retorno+1;
            --Se registra la inserción en la tabla intermedia
            update log_imp_pot set es_importado=1, 
                                   nombre_archivo=nombre_archivo,
                                   codigo_archivo=codigo_archivo,
                                   fecha_hora_transaccion=current_timestamp 
            where id_log_imp_pot=registro.id_log_imp_pot;
        --Si no se pudo insertar el registro se marca el motivo
        exception when others then
            mensaje:='Error: '||SQLERRM;
            update log_imp_pot set es_importado=0,
                   nombre_archivo=nombre_archivo,
                   codigo_archivo=codigo_archivo,
                   fecha_hora_transaccion=current_timestamp,
                   observacion=mensaje
            where id_log_imp_pot=registro.id_log_imp_pot;
            continue;
        end;
    end loop;
end;