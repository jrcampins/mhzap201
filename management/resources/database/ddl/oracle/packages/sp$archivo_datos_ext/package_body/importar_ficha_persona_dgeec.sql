procedure importar_ficha_persona_dgeec(nombre_archivo varchar2, codigo_archivo varchar2, retorno out number) as
    --retorno number:=0;
    type tabla_bigints is table of ficha_hogar.id_ficha_hogar%type      index by binary_integer;
    ids    tabla_bigints;
    icv varchar(200);
    indice number:=0;
    archivo varchar2(2000);
    codigo varchar2(200);
    nombre_tabla varchar2(200):='csv_log_imp_per_eec';
    tipo_arch varchar2(10);
    proveedor varchar2(10);
    numero_cedula number;
    letra_cedula char;
    current_row log_imp_per%rowtype;
    new_ficha_persona ficha_persona%rowtype;
    row_ficha_hogar ficha_hogar%rowtype;
    mensaje varchar2(2000):='';
    array_nombres sp$utils.t_array;
    array_apellidos sp$utils.t_array;
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000); -- a character string of at most 2048 bytes
    texto_fecha varchar2(100);
    texto_formulario varchar2(100);
    --Estas variables permiten identificar el id de ficha hogar asociada
    id_departamento_consultar number;
    id_distrito_consultar number;
    id_barrio_consultar number;
    numero_formulario_consultar number;
    texto_formulario varchar2(2000):='';
    numero_vivienda_consultar number;
    numero_hogar_consultar number;
    numero_respondente number;
    id_ubicacion_retornado number;
    secuencia varchar2(2000):=' ';
    secuencia_anterior varchar2(2000):=' ';
    actualizar_ficha_hogar number:=0;
    orden_i number:=0;
begin
    archivo:=nombre_archivo;
    codigo:=codigo_archivo;
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
            if tipo_arch!='402' then
                msg_string := 'Archivo ' || codigo_archivo || ' NO es de Ficha Persona ';
                raise_application_error(err_number, msg_string, true);
            end if;
        end if;
        begin
            select p.codigo_proveedor_dat_ext 
            into proveedor 
            from archivo_datos_ext a 
            left join proveedor_dat_ext p on a.id_proveedor_dat_ext=p.id_proveedor_dat_ext 
            where a.codigo_archivo_datos_ext=codigo_archivo;
        exception
            when no_data_found then
            msg_string := 'Proveedor ' || proveedor || ' no existe ';
            raise_application_error(err_number, msg_string, true);
        end;
        if sql%found then
            if proveedor!='102' then
                msg_string := 'Proveedor ' || proveedor || ' no corresponde al tipo de archivo DGEEC '||codigo_archivo;
                raise_application_error(err_number, msg_string, true);
            end if;
        end if;
    end if;
    
    update archivo_datos_ext set es_archivo_datos_ext_importado=1, fecha_hora_ultima_importacion=current_timestamp where codigo_archivo_datos_ext=codigo_archivo;
    --creamos y llenamos la tabla externa csv_log_imp_per
    sp$100.create_csv_log_imp_per_eec(nombre_archivo, 'WE8ISO8859P1', '1', ';', '"');
    insert into log_imp_per_eec
        (   id_log_imp_per_eec,
            dptod ,
	distritod ,
	distripg ,
	area ,
	barrio ,
	manzana ,
	formulario ,
	vivi ,
	hogar ,
	orden ,
	p30 ,
	p31 ,
	p32 ,
	p33 ,
	p34 ,
	p35 ,
	p36_orden_conyugue ,
	p36_orden_padre ,
	p36_orden_madre ,
	p37 ,
	p37_cedula ,
	p38_dia ,
	p38_mes ,
	p38_ano ,
	p39pais ,
	p39dpto ,
	p39dist ,
	p39area ,
	p40_idioma ,
	p40otr ,
	p41 ,
	p42 ,
	p43 ,
	p44_45t ,
	p44 ,
	p45 ,
	p46 ,
	p47 ,
	p48 ,
	p49 ,
	p49_otr ,
	p50 ,
	p50_otr ,
	p51 ,
	p52 ,
	p52_otr ,
	p53 ,
	p54 ,
	p54a ,
	p54_otr ,
	p55 ,
	p55_otr ,
	p56 ,
	p57 ,
	p58 ,
	p59 ,
	p60 ,
	p61 ,
	p62 ,
	p63 ,
	p63_especificar ,
	p64des ,
	p64c ,
	p65des ,
	p65c ,
	p66 ,
	p67a ,
	p67b ,
	p67c ,
	p67d ,
	p67e ,
	p67f ,
	p67g ,
	p67h ,
	p67i ,
	p67j ,
	p67k ,
	p67l ,
	p67tot )
    select
            utils.bigintid(),
            dptod ,
	distritod ,
	distripg ,
	area ,
	barrio ,
	manzana ,
	formulario ,
	vivi ,
	hogar ,
	orden ,
	p30 ,
	p31 ,
	p32 ,
	p33 ,
	p34 ,
	p35 ,
	p36_orden_conyugue ,
	p36_orden_padre ,
	p36_orden_madre ,
	p37 ,
	p37_cedula ,
	p38_dia ,
	p38_mes ,
	p38_ano ,
	p39pais ,
	p39dpto ,
	p39dist ,
	p39area ,
	p40_idioma ,
	p40otr ,
	p41 ,
	p42 ,
	p43 ,
	p44_45t ,
	p44 ,
	p45 ,
	p46 ,
	p47 ,
	p48 ,
	p49 ,
	p49_otr ,
	p50 ,
	p50_otr ,
	p51 ,
	p52 ,
	p52_otr ,
	p53 ,
	p54 ,
	p54a ,
	p54_otr ,
	p55 ,
	p55_otr ,
	p56 ,
	p57 ,
	p58 ,
	p59 ,
	p60 ,
	p61 ,
	p62 ,
	p63 ,
	p63_especificar ,
	p64des ,
	p64c ,
	p65des ,
	p65c ,
	p66 ,
	p67a ,
	p67b ,
	p67c ,
	p67d ,
	p67e ,
	p67f ,
	p67g ,
	p67h ,
	p67i ,
	p67j ,
	p67k ,
	p67l ,
	p67tot
          from csv_log_imp_per_eec;
    for current_row in (select * from log_imp_per_eec where es_importado=0 and observacion is null)
    loop
       begin
            --Reiniciar los valores de la nueva ficha para cada registro a importar
            new_ficha_persona.id_ficha_persona:=utils.bigintid();
            new_ficha_persona.version_ficha_persona:=0;
            new_ficha_persona.es_ficha_persona_importada:=0;
            new_ficha_persona.fecha_importacion:=null;
            new_ficha_persona.id_departamento_nacimiento:=null;
            new_ficha_persona.id_distrito_nacimiento:=null;
            new_ficha_persona.numero_tipo_area_lugar_nac:=null;
            new_ficha_persona.otra_clase_enf_cronica:=null;
            new_ficha_persona.es_ficha_persona_inactiva:=0;
            if current_row.dptod is null 
               or current_row.distritod is null 
               or current_row.barrio is null 
               or current_row.formulario is null 
               or current_row.vivi is null 
               or current_row.hogar is null then
                msg_string:='Clave de Ficha Persona Inválida (Alguno de los campos es nulo)';
                raise_application_error(err_number, msg_string, true);
            end if;
            --Se determina la secuencia de campos claves
            secuencia:=current_row.dptod||current_row.distritod||current_row.barrio||current_row.formulario||current_row.vivi||current_row.hogar;
            --Si la secuencia es igual a la anterior no debo actualizar nada
            if secuencia<>secuencia_anterior then
                secuencia_anterior:=secuencia;          
                --Se ubica el id del departamento (P01A)
                id_departamento_consultar:= sp$utils.extract_id_departamento(current_row.dptod);
                if id_departamento_consultar is null then
                    msg_string:= 'Numero de Departamento No puede ser nulo';
                    raise_application_error(err_number, msg_string, true);
                end if;
                --Se ubica el id del distrito (distritod)
                id_distrito_consultar:= sp$utils.extract_id_distrito(current_row.dptod,current_row.distritod);
                if id_distrito_consultar is null then
                    msg_string:= 'Numero de Distrito No puede ser nulo';
                    raise_application_error(err_number, msg_string, true);
                end if;
                --Se ubica el id del barrio (barrio)
                id_barrio_consultar:= sp$utils.extract_id_barrio(current_row.dptod,current_row.distritod,current_row.barrio);
                if id_barrio_consultar is null then
                    msg_string:='Numero de Barrio No puede ser nulo';
                    raise_application_error(err_number, msg_string, true);
                end if;
                --Se ubica el numero de formulario (formulario)
                numero_formulario_consultar:= to_number(replace(current_row.formulario,'.'));
                if numero_formulario_consultar is null then
                    msg_string:='Numero de Formulario No puede ser nulo';
                    raise_application_error(err_number, msg_string, true);
                end if;
                --Se convierte el texto recibido en numero de vivienda
                numero_vivienda_consultar:=sp$utils.extract_numero_vivienda(current_row.vivi);
                if numero_vivienda_consultar is null then
                    msg_String:= 'Numero de Vivienda No puede ser nulo';
                    raise_application_error(err_number, msg_string, true);
                end if;
                --Se convierte el texto recibido en distancia_este_utm (P03)
                numero_hogar_consultar:=sp$utils.extract_numero_hogar(current_row.hogar);
                if numero_hogar_consultar is null then
                    msg_String:= 'Numero de Hogar No puede ser nulo';
                    raise_application_error(err_number, msg_string, true);
                end if;
                --Se determina la ficha hogar asociada
                begin
                    select * into row_ficha_hogar from ficha_hogar  
                    where id_departamento=id_departamento_consultar
                    and id_distrito=id_distrito_consultar
                    and id_barrio=id_barrio_consultar
                    and numero_formulario=numero_formulario_consultar
                    and numero_vivienda=numero_vivienda_consultar
                    and numero_hogar=numero_hogar_consultar;
                --Si no hay ficha hogar, no tiene sentido procesar la ficha
                exception
                    when no_data_found then 
                        msg_string:= 'No hay Ficha Hogar asociada a la Persona';
                        raise_application_error(err_number, msg_string, true);
                    when others then 
                        msg_string:= 'Error recuperando ficha hogar';
                        raise_application_error(err_number, msg_string, true);
                end;
                if not sql%found then
                    msg_string:= 'No hay Ficha Hogar asociada a la Persona';
                    raise_application_error(err_number, msg_string, true);
                end if;
                --Se indica que más adelante hay que actualizar
                 indice:=indice+1;
                 ids(indice):=row_ficha_hogar.id_ficha_hogar;
                 orden_i:=0;
             end if;
            --Se incrementa el orden
            orden_i:=orden_i+1;
            --Se copia el id de ficha hogar
            if row_ficha_hogar.id_ficha_hogar is not null then
                new_ficha_persona.id_ficha_hogar:=row_ficha_hogar.id_ficha_hogar;
            else
                msg_string:='No hay Id de Ficha hogar asociado a la Persona';
                raise_application_error(err_number, msg_string, true);
            end if;
            --Se toma el numero del respondente
            numero_respondente:=to_number(replace(current_row.orden,'.'));
            if numero_respondente is null then
                msg_string:= 'Numero de Respondente No puede ser nulo';
                raise_application_error(err_number, msg_string, true);
            end if;
            --Se toma el orden de identificacion
            new_ficha_persona.numero_orden_identificacion:=current_row.orden;
            if new_ficha_persona.numero_orden_identificacion is null then
                msg_string:='Numero de Orden de Identificación No puede ser nulo';
                raise_application_error(err_number, msg_string, true);
            end if;
            --Nadie es respondente
            new_ficha_persona.es_respondente:=0;
            --Nombres 
            new_ficha_persona.primer_nombre:=current_row.P30;
            new_ficha_persona.segundo_nombre:=null;
            new_ficha_persona.primer_apellido:=current_row.P31;
            new_ficha_persona.segundo_apellido:=null;
            new_ficha_persona.apellido_casada:=null;
            new_ficha_persona.apodo:=null;
            --Edad 
            new_ficha_persona.edad:=to_number(replace(current_row.P32,'.'));
            --Sexo (P33)
            new_ficha_persona.numero_sexo_persona:=sp$utils.extract_sexo_ficha_persona(current_row.P33);
            --Estado civil (VAR00030) Error de equivalencia
            new_ficha_persona.numero_estado_civil:=null;
            --Parentesco con el Jefe del Hogar (P48)
            new_ficha_persona.numero_tipo_persona_hogar :=sp$utils.extract_tipo_persona_hogar(current_row.P34);
            --Es miembro del hogar (P49)
            new_ficha_persona.numero_siono_miembro_hogar :=sp$utils.extract_siono(current_row.P35);
            --Numero de orden del conyuge(P50A)
            new_ficha_persona.numero_orden_iden_conyuge :=sp$utils.extract_numero_orden_id(current_row.p36_orden_conyugue);
            --´Numero de orden del padre(P50B)
            new_ficha_persona.numero_orden_iden_padre :=sp$utils.extract_numero_orden_id(current_row.p36_orden_padre);
            -- Numero de orden de la madre (P50C)
            new_ficha_persona.numero_orden_iden_madre :=sp$utils.extract_numero_orden_id(current_row.p36_orden_madre);
            -- Numero de cedula (P51) 
            new_ficha_persona.numero_cedula:=sp$utils.extract_numero_from_cedula(replace(current_row.p37_cedula,'.'));
            -- Letra de cedula (VAR00003)
            new_ficha_persona.letra_cedula:=sp$utils.extract_letra_from_cedula(current_row.p37_cedula);
            -- Numero de tipo de excepcion de cedula (VAR000004)
            if new_ficha_persona.numero_cedula is null then
                new_ficha_persona.numero_tipo_excepcion_ced:=1;
            else    
                new_ficha_persona.numero_tipo_excepcion_ced:=null;
            end if;
            -- Fecha de Nacimiento (P52D,P52M,P52A)
            new_ficha_persona.fecha_nacimiento:=sp$utils.extract_fecha(replace(current_row.p38_dia,'.'),replace(current_row.p38_mes,'.'),replace(current_row.p38_ano,'.'));
            -- Nombre de departamento de nacimiento (P53A)
            id_ubicacion_retornado:=sp$utils.get_id_departamento_sw(current_row.p39dpto);
            if id_ubicacion_retornado<>0 then
                 new_ficha_persona.id_departamento_nacimiento:=id_ubicacion_retornado;
            end if;
            --Nombre de distrito de nacimiento (P53B)
            id_ubicacion_retornado:=sp$utils.get_id_distrito_sw(current_row.p39dpto,current_row.p39dist);
            if id_ubicacion_retornado<>0 then
                 new_ficha_persona.id_distrito_nacimiento:=id_ubicacion_retornado;
            end if;
            --Codigo del distrito de nacimiento (P53C)No se utiliza
            --Tipo de Area de Nacimiento (P53Z)
            new_ficha_persona.numero_tipo_area_lugar_nac :=sp$utils.extract_tipo_area(current_row.p39area);
            --Idioma que habla el mayor tiempo (P54)
            new_ficha_persona.numero_idioma_hogar:=sp$utils.extract_idioma_hogar(current_row.p40_idioma);
            if new_ficha_persona.numero_idioma_hogar=4 then
                --Otro idioma (P54E)
                new_ficha_persona.otro_idioma_hogar:=current_row.p40otr;
            end if;
            --Asisitio a instituto (P56)
            new_ficha_persona.numero_siono_asistencia_esc:=sp$utils.extract_siono(current_row.p41);
            --Motivo de inasistencia (P58)
            new_ficha_persona.numero_motivo_ina_esc:=sp$utils.extract_motivo_ina_esc(current_row.p42);
            if new_ficha_persona.numero_motivo_ina_esc=25 then
                --Otro motivo de inasistencia (P58E)
                new_ficha_persona.otro_motivo_ina_esc:='No especificado';
            end if;
            --Piensa Matricularse este año (P59) Error de equivalencia
            new_ficha_persona.numero_siono_matriculacion_esc:=sp$utils.extract_siono(current_row.p43);
            --Ultimo grado aprobado (P60)
            new_ficha_persona.ultimo_curso_aprobado:=sp$utils.extract_ultimo_curso_aprobado(current_row.p44);
            --Nivel del ultimo curso aprobado (P61)
            new_ficha_persona.numero_nivel_edu_ult_cur_aprob:=sp$utils. extract_nivel_educ(current_row.p45);
            --Realizo curso no formal  (P62)
            new_ficha_persona.numero_siono_curso_no_formal:=sp$utils.extract_siono(current_row.p46);
            --Tiene seguro medico vigente (P63)
            new_ficha_persona.numero_tipo_seguro_medico:=sp$utils.extract_tipo_seguro_medico(current_row.p47);
            --Estado de salud general (P64)
            new_ficha_persona.numero_estado_salud:=sp$utils.extract_estado_salud(current_row.p48);
            --Clase de enfermedad (P65)
            new_ficha_persona.numero_clase_enf_acc:=sp$utils.extract_clase_enf_acc(current_row.p49);
            if new_ficha_persona.numero_clase_enf_acc=44 then
                --Otro tipo de enfermedad accidente (P65E)
                new_ficha_persona.otra_clase_enf_acc :=current_row.p49_otr;
            end if;
            --Clase de enfermedad cronica (P66)
            new_ficha_persona.numero_clase_enf_cronica:=sp$utils.extract_clase_enf_cronica(current_row.p50);
            if new_ficha_persona.numero_clase_enf_cronica=42 then
                --Otro tipo de enfermedad cronica (P66E)
                new_ficha_persona.otra_clase_enf_cronica :=current_row.p50_otr;
            end if;
            --Recibio atencion para accidente (P67)
            new_ficha_persona.numero_siono_atencion_medica:=sp$utils.extract_siono(current_row.p51);
            --Motivo de no atencion medica (P68)
            new_ficha_persona.numero_motivo_no_atencion :=sp$utils.extract_motivo_no_atencion(current_row.p52);
            if new_ficha_persona.numero_motivo_no_atencion=42 then
                --Otro motivo de no asistencia (P68E)
                new_ficha_persona.otro_motivo_no_atencion :=current_row.p52_otr;
            end if;
            --Tiene carner te vacunacion(P73)
            new_ficha_persona.numero_siono_carnet_vacunacion:=sp$utils.extract_siono(current_row.p53);
            --Clase de impedimento (P74)
            new_ficha_persona.numero_clase_impedimento:=sp$utils.extract_clase_impedimento(current_row.p54);
            if new_ficha_persona.numero_clase_impedimento=13 then
                --Otra clase de impedimento (VAR00006)
                new_ficha_persona.otra_clase_impedimento  :=current_row.p54a;
            end if;
            --Causa de impedimento (VAR00007) Error de equivalencia
            new_ficha_persona.numero_causa_impedimento  :=sp$utils.extract_causa_impedimento(current_row.p55);
            if new_ficha_persona.numero_causa_impedimento=5 then
                --Otra causa de impedimento (VAR00008)
                new_ficha_persona.otra_clase_impedimento  :=current_row.p55_otr;
            end if;
            --Dificultad para caminar (VAR00009)
            new_ficha_persona.numero_siono_dif_para_caminar:=sp$utils.extract_siono(current_row.p56);
            --Dificultad para vestirse (VAR00010)
            new_ficha_persona.numero_siono_dif_para_vestirse:=sp$utils.extract_siono(current_row.p57);
            --Dificultad para bañarse (VAR00011)
            new_ficha_persona.numero_siono_dif_para_banarse:=sp$utils.extract_siono(current_row.p58);
            --Dificultad para comer (VAR00031)
            new_ficha_persona.numero_siono_dif_para_comer:=sp$utils.extract_siono(current_row.p59);
            --Dificultad para la cama (VAR00012)
            new_ficha_persona.numero_siono_dif_para_la_cama:=sp$utils.extract_siono(current_row.p60);
            --Dificultad ir al baño (VAR00013
            new_ficha_persona.numero_siono_dif_para_el_bano:=sp$utils.extract_siono(current_row.p61);
            --Tiene Trabajo (P86)
            new_ficha_persona.numero_siono_trabajo:=sp$utils.extract_siono(current_row.p62);
            --Motivo de No Trabajo (P87)
            new_ficha_persona.numero_motivo_no_trabajo:=sp$utils.extract_motivo_no_trabajo(current_row.p63);
            if new_ficha_persona.numero_motivo_no_trabajo=9 then
                --Otro motivo de no trabajo (P87E)
                new_ficha_persona.otro_motivo_no_trabajo:=current_row.p63_especificar;
            end if;
            --Descripción de ocupacion principal (P88)
            new_ficha_persona.descripcion_ocupacion_prin:=current_row.p64des;
            --Descripción de dedicacion principal (P88E)
            new_ficha_persona.descripcion_dedicacion_prin:=current_row.p65des;
            --Tipo de relacion laboral (P91) Error de equivalencia
            new_ficha_persona.numero_tipo_relacion_lab:=sp$utils.extract_tipo_relacion_lab(current_row.P66);
            --Monto de Ingreso ocupacion principal (VAR00017)
            new_ficha_persona.monto_ingreso_ocupacion_prin:=to_number(replace(current_row.p67a,'.'));
            --Monto de Ingreso ocupacion secundaria (VAR00018)
            new_ficha_persona.monto_ingreso_ocupacion_secun:=to_number(replace(current_row.p67b,'.'));
            --Monto de Ingreso otras ocupaciones (VAR00019)
            new_ficha_persona.monto_ingreso_otras_ocup:=to_number(replace(current_row.p67c,'.'));
            --Monto de Ingreso por alquileres (VAR00020)
            new_ficha_persona.monto_ingreso_alquileres:=to_number(replace(current_row.p67d,'.'));
            --Monto de Ingreso por Intereses (VAR00021)
            new_ficha_persona.monto_ingreso_intereses:=to_number(replace(current_row.p67e,'.'));
            --Monto de Ingreso por ayuda familiar pais(VAR00022)
            new_ficha_persona.monto_ingreso_ayuda_fam_pais:=to_number(replace(current_row.p67f,'.'));
            --Monto de Ingreso por ayuda familiar exterior(VAR00023)
            new_ficha_persona.monto_ingreso_ayuda_fam_exter:=to_number(replace(current_row.p67g,'.'));
            --Monto de Ingreso por jubilacion (VAR00024)
            new_ficha_persona.monto_ingreso_jubilacion:=to_number(replace(current_row.p67h,'.'));
            --Monto de Ingreso por pensiones (VAR00025)
            new_ficha_persona.monto_ingreso_pensiones:=to_number(replace(current_row.p67i,'.'));
            --Monto de Ingreso por tekopora (VAR00026)
            new_ficha_persona.monto_ingreso_tekopora:=to_number(replace(current_row.p67j,'.'));
            --Monto Ingreso por programas (VAR00027)
            new_ficha_persona.monto_ingreso_programas:=to_number(replace(current_row.p67k,'.'));
            --Monto Ingreso adicional (VAR00028)
            new_ficha_persona.monto_ingreso_adicional:=to_number(replace(current_row.p67l,'.'));
            --Monto Ingreso total mensual (P92)
            new_ficha_persona.total_ingreso_mensual:=to_number(replace(current_row.p67tot,'.'));
            --Se copia el id de ficha hogar
            new_ficha_persona.id_ficha_hogar:=row_ficha_hogar.id_ficha_hogar;
            --Si hay que actualizar, se actualiza la ficha hogar
            new_ficha_persona.es_ficha_persona_importada:=1;
            new_ficha_persona.fecha_importacion:=current_timestamp;
            --Se inserta la ficha persona
            insert into ficha_persona values new_ficha_persona;
                --Se incrementa el numero de insertados
            retorno:=retorno+1;
            
            begin
                select codigo_ficha_persona into mensaje 
                from ficha_persona 
                where id_ficha_persona=new_ficha_persona.id_ficha_persona;
            exception
                when no_data_found then
                msg_string := 'Error insertando ficha_persona (id= '||new_ficha_persona.id_ficha_persona;
                raise_application_error(err_number, msg_string, true);
            end;
            if sql%found then
                mensaje := 'Insertada Ficha Persona '||mensaje;
            end if;

            update log_imp_per_eec set es_importado=1,
                                id_ficha_persona=new_ficha_persona.id_ficha_persona,
                                observacion=mensaje,
                                nombre_archivo=archivo, 
                                codigo_archivo=codigo, 
                                fecha_hora_transaccion= current_timestamp 
            where id_log_imp_per_eec=current_row.id_log_imp_per_eec;
        exception
                when others then
                    mensaje:='Error '||SQLCODE||'('||SQLERRM||')';
                    update log_imp_per_eec set es_importado=0, id_ficha_persona=null, nombre_archivo=archivo, codigo_archivo=codigo, fecha_hora_transaccion= current_timestamp, observacion=mensaje where id_log_imp_per_eec=current_row.id_log_imp_per_eec;
                continue;
        end;
    end loop;
    for i in 1..ids.count loop
        begin
            update ficha_hogar set es_ficha_hogar_inactiva=0 where id_ficha_hogar=ids(i);
            update ficha_persona set es_ficha_persona_inactiva=0 where id_ficha_hogar=ids(i);
            icv:=sp$ficha_hogar.calcular_icv(ids(i));
            --dbms_output.put_line('icv '||icv);
        exception
                when others then
                    mensaje:='Error '||SQLCODE||'('||SQLERRM||')';
                    --dbms_output.put_line('Error calculando icv '||mensaje);
                 continue;
        end;
    end loop;
end;