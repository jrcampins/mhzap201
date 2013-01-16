--
--Descripción: Este procedimiento actualiza las pensiones aprobadas, denegadas y revocadas en el JUPE 
--@return: mensaje indicando el resultado de la operación
--
--Cambiado nombre de función
function actualizar_pen_en_jupe(param varchar2) return varchar2 is
    v_existe_a_ben varchar2(10);
    v_existe_cedula varchar2(10);
    v_existe_a_per varchar2(10);
    v_existe_a_emp varchar2(10);
    vPLA_COD_PLANILLA number;
    vRetorno varchar2(32000);
--     req   UTL_HTTP.req := NULL;
--     resp  UTL_HTTP.resp := NULL;
    respVal VARCHAR2(32000);
    reqXML VARCHAR2(32760);
    val_xml xmltype;
    existe NUMERIC;
    anno VARCHAR2(50);
    mes VARCHAR2(50);

    --Agregado
    id_reg number;
    type log_proceso is table of log_pro_act_jupe%rowtype;
    table_log log_proceso;
    reg log_pro_act_jupe%rowtype;   
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000); -- a character string of at most 2048 bytes
    mensaje varchar2(2000);
    retorno varchar2(2000);
    total number:=0;
    total_act number:=0;
    total_errores number:=0;
    --Fin Agregado
    
    --1. Recorrer tabla PERSONAS y filtrar numero_tipo_act_jupe = 0
    CURSOR c_persona IS
    SELECT *
    FROM PERSONA
    WHERE 1 = 1 --numero_cedula='7024726';-- <= 5;
    AND NUMERO_TIPO_ACT_JUPE is null;
    --OJO el valor 0 NO Existe
 BEGIN
    
    --Agregado vaciar primero el cursor en el log
    for row in c_persona loop
        --DBMS_OUTPUT.PUT_LINE('recorriendo '||row.nombre_persona);
        id_reg:=utils.bigintid();                                                              
        insert into log_pro_act_jupe values (
            id_reg,
            0,
            row.id_persona,
            row.codigo_persona,
            row.nombre_persona,
            row.id_departamento,
            row.id_distrito,
            row.id_barrio,
            row.numero_condicion_pension,
            0,
            null,
            current_timestamp
        );
    end loop;
    --Fin Agregado
    
    FOR row IN c_persona LOOP
        BEGIN
            --Agregado contar variables 
            total:=total+1;
            --Fin Agregado
            --DBMS_OUTPUT.PUT_LINE(row.nombre_persona);
-- --2. Verificar si ya la persona en la tabla A_BEN (JUPE) - webservice consulta
--             v_existe_a_ben := f_ws_existe_a_ben(to_char(row.numero_cedula));
--             --2.1 Verificar si existe la persona en la tabla CEDULA (JUPE) - webservice consulta
--             IF v_existe_a_ben = 'FALSO' THEN
--                 v_existe_cedula := f_ws_existe_cedula(to_char(row.numero_cedula));
--                 IF v_existe_cedula = 'FALSO' THEN
--                 --2.2 Si no existe inserta en la tabla CEDULA  - webservice inserción
--                     if row.es_indigena=1 then
--                         vPLA_COD_PLANILLA:=27;
--                     else
--                         vPLA_COD_PLANILLA:=26;
--                     end if;
--                     vRetorno:= f_ws_inserta_cedula(row.codigo_persona,
--                                                 row.numero_estado_civil,
--                                                 null,
--                                                 row.primer_nombre||' '||row.segundo_nombre,
--                                                 row.primer_apellido,
--                                                 row.segundo_apellido,
--                                                 row.apellido_casada,
--                                                 row.direccion,
--                                                 row.numero_telefono_linea_baja||' '||row.numero_telefono_celular,
--                                                 row.numero_sexo_persona,
--                                                 null,
--                                                 TO_CHAR(row.fecha_nacimiento,'DD/MM/YYYY'),
--                                                 'A',
--                                                 null,
--                                                 TO_CHAR(SYSDATE,'DD/MM/YYYY'),
--                                                 USER,
--                                                 TO_CHAR(SYSDATE,'DD/MM/YYYY HH24:mi:ss'),
--                                                 USER,
--                                                 1,
--                                                 row.id_etnia_indigena   );
--                 END IF;
--           --2.3 Verificar si existe la persona en la tabla A_PER (SINARH) - webservice consulta
--                 v_existe_a_per := f_ws_existe_a_per(to_char(row.numero_cedula));
--           --2.4 Si no existe insertar en la tabla A_PER  - webservice inserción
--                 IF v_existe_a_per='FALSO' THEN
--                    vRetorno:= f_ws_inserta_a_per(row.codigo_persona,
--                                                 row.primer_apellido || ' ' ||row.primer_nombre,
--                                                 substr(row.primer_nombre||' '||row.segundo_nombre,1,40),
--                                                 row.primer_apellido || ' '||row.segundo_apellido,
--                                                 row.apellido_casada,
--                                                 row.numero_sexo_persona,
--                                                 null,
--                                                 TO_CHAR(row.fecha_nacimiento,'DD/MM/YYYY'),
--                                                 1,
--                                                 row.numero_estado_civil,
--                                                 TO_CHAR(SYSDATE,'DD/MM/YYYY'),
--                                                 null,--pasar null fecha_baja
--                                                 substr(nvl(row.direccion,'NINGUNO'),1,50),
--                                                 0,
--                                                 0,
--                                                 1206,
--                                                 0,
--                                                 NULL,
--                                                 null,
--                                                 null,
--                                                 null,
--                                                 null,
--                                                 null,
--                                                 substr(row.numero_telefono_linea_baja||' '||row.numero_telefono_celular,1,12),
--                                                 null,
--                                                 null,
--                                                 null,
--                                                 null,
--                                                 null,
--                                                 null,
--                                                 null,
--                                                 6,
--                                                 USER,
--                                                 TO_CHAR(SYSDATE,'DD/MM/YYYY HH24:mi:ss'),
--                                                 NULL);
--                --falta parametros
--                 END IF;
--           --2.5 Verificar si existe la persona en la tabla A_EMP (SINARH)- webservice consulta
--                 v_existe_a_emp := f_ws_existe_a_emp(to_char(row.numero_cedula));
--                 --raise_application_error(-20000,v_existe_a_emp);
--           --2.6 Si no existe insertar en la tabla A_EMP  - webservice inserción
--                 IF v_existe_a_emp = 'FALSO' THEN
--                     vRetorno := f_ws_inserta_a_emp(8,
--                                               4,
--                                               8,
--                                               0,
--                                               0,
--                                               0,
--                                               0,
--                                               TO_CHAR(SYSDATE,'DD/MM/YYYY HH24:mi:ss'),
--                                               row.codigo_persona,
--                                               user,
--                                               TO_CHAR(SYSDATE,'DD/MM/YYYY HH24:mi:ss'),
--                                               user,
--                                               6,
--                                               'S',
--                                               null,
--                                               null,
--                                               null);--falta parametros
--                 END IF;
-- 
--           --2.7 Inserta en la tabla A_BEN - webservice inserción
-- 
--                 vRetorno := f_ws_inserta_a_ben(row.codigo_persona,
--                                               0,--tabla de secuencia,
--                                               3,
--                                               26,
--                                               null,
--                                               null,
--                                               null,
--                                               vPLA_COD_PLANILLA,
--                                               row.numero_resolucion_otor_pen,
--                                               TO_CHAR(row.fecha_resolucion_otor_pen,'DD/MM/YYYY'),
--                                               null,
--                                               null,
--                                               null,
--                                               null,
--                                               null,
--                                               null,
--                                               null,
--                                               null,
--                                               null,
--                                               null,
--                                               null,
--                                               null,
--                                               null,
--                                               null,
--                                               null,
--                                               null,
--                                               null ,
--                                               2,
--                                               row.monto_pension,
--                                               row.id_distrito,
--                                               'A',
--                                               null,
--                                               TO_CHAR(SYSDATE,'DD/MM/YYYY HH24:mi:ss'),
--                                               SUBSTR(USER,1,8),
--                                               TO_CHAR(SYSDATE,'DD/MM/YYYY HH24:mi:ss'),
--                                               SUBSTR(USER,1,8),
--                                               null,
--                                               null,
--                                               null,
--                                               0,
--                                               row.indice_calidad_vida,
--                                               null,
--                                               nulL,
--                                               null,
--                                               null ) ;
-- 
--           --2.8 Inserta en la tabla A_MOV - webservice inserción
--                 anno:=null;
--                 mes:=null;
--                    req := UTL_HTTP.begin_request('http://10.20.2.62:8090/jupe/pensionalimentaria?wsdl', 'POST');
-- 
--                 /*Creamos un mensaje SOAP tal cual se define en el WSDL*/
--                    reqXML := '<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:urn="urn:hacienda-gov-py:jupe_pensAliment">
--                                  <soapenv:Header/>
--                                  <soapenv:Body>
--                                     <urn:ejercicioActivo/>
--                                  </soapenv:Body>
--                               </soapenv:Envelope>';
-- 
--                 /*El contenido que enviamos es XML: */
--                     UTL_HTTP.set_header(req, 'Content-Type', 'text/xml');
-- 
--                 /*Establecemos el SOAPAction a invocar: */
--                     UTL_HTTP.set_header(req, 'SOAPAction', '""');
-- 
--                 /*Indicamos en el header el tamanho del mensaje enviado: */
--                     UTL_HTTP.set_header(req, 'Content-Length', LENGTH(reqXML));
-- 
--                 /*Escribimos el body del request */
--                     UTL_HTTP.write_text(req, reqXML);
-- 
--                 /*Obtenemos la respuesta */
--                     resp := UTL_HTTP.get_response(req);
-- 
--                 /*Cargamos en la variable respVal la devolución del servidor */
--                     UTL_HTTP.read_text(resp, respVal);
-- 
--                 /*Finalizamos la conexión HTTP */
--                     UTL_HTTP.end_response(resp);
-- 
--                 /*Convertimos el response en tipo xml para extraer los parametros*/
--                     val_xml := xmltype(respVal);
--                 /*Verificamos si se recupero un valor*/
--                  existe:=val_xml.existsNode('//return');
--                   IF existe=0 THEN
--                     anno:=null;
--                     mes:=null;
--                     --RETURN 'ERROR';
--                   END IF;
-- 
--                  -- return val_xml.extract('//return').getStringVal();
--                /*Contamos la cantidad de ocurrencia de returns*/
--                   anno:=val_xml.extract('//return/anhoCierre/text()').getStringVal() ;
--                   mes:=val_xml.extract('//return/mesCierre/text()').getStringVal() ;
-- 
-- 
--                 --llamar a web services
--                 IF(anno is not null and mes is not null)THEN
--                     vRetorno := f_ws_inserta_a_mov( to_number(anno,9999), --recupera web services
--                                                   to_number(mes,999), --recupera web services
--                                                   0,     --genera automatico
--                                                   11,    --recupera de tabla de correspondencia
--                                                   'A01',  --recupera de tabla de correspondencia
--                                                   2,
--                                                   row.codigo_persona,
--                                                   0,--genera automatico
--                                                   1,
--                                                   row.monto_pension,
--                                                   0,
--                                                   0,
--                                                   'A',
--                                                   NULL,
--                                                   NULL,
--                                                   TO_CHAR(SYSDATE,'DD/MM/YYYY HH24:mi:ss'),
--                                                   USER,
--                                                   TO_CHAR(SYSDATE,'DD/MM/YYYY HH24:mi:ss'),
--                                                   USER,
--                                                   vPLA_COD_PLANILLA,
--                                                   26,
--                                                   0,
--                                                   0,
--                                                   0
--                                                  );
--                 END IF;                
                                        
            --3. Actualiza tabla persona como insertado al jupe (numero_tipo_act_jupe = 1)

                   UPDATE persona
                   SET numero_tipo_act_jupe = 1,
                    fecha_hora_ult_act_jupe = sysdate
                   WHERE id_persona = row.id_persona;

                --Agregado se actualiza el log correspondiente
                --Como no estamos recorriendo el log, para saber el registro que se procesa se actualiza el que no tiene observacion
                   total_act:=total_act+1;
                   update log_pro_act_jupe
                   set observacion=mensaje,
                   es_procesado=1,
                   fecha_hora_transaccion=current_timestamp
                   where id_persona = row.id_persona and observacion is null;
--               END IF;
            
       EXCEPTION
        WHEN OTHERS THEN
            total_errores:=total_errores+1;
            mensaje:=SQLERRM;
            update log_pro_act_jupe
            set observacion=mensaje,
            es_procesado=0,
            fecha_hora_transaccion=current_timestamp
            where id_persona = row.id_persona and observacion is null;  
       END;
    END LOOP; -- fin del recorrido del cursor
    retorno:='Total de Personas Procesadas: '||total||', Actualizados: '||total_act||' Total Excepciones: '||total_errores;
    return retorno;
END;
