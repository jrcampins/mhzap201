function verif_ws_sinarh_jupe(cedula  IN  varchar2,id_persona NUMBER)return varchar2 is
--PRAGMA AUTONOMOUS_TRANSACTION;
    req   UTL_HTTP.req := NULL;
    resp  UTL_HTTP.resp := NULL;
    respVal VARCHAR2(32000);
    reqXML VARCHAR2(32760);
    val_xml xmltype;
    sistemaConsulta VARCHAR2(5000);
    personaNombreCompleto VARCHAR2(1000);
    vinculo VARCHAR2(1000);
    detalle VARCHAR2(1000);
    cantidad NUMBER(10,2);
    ocurrencia NUMBER(10,2);
    existe NUMBER(10,2);
    xml_retorno VARCHAR2(10000);


BEGIN

  /*Generamos un Request a la URL destino, el método debe ser POST */
    req := UTL_HTTP.begin_request('http://10.20.2.62:8090/jupe/pensionalimentaria?wsdl', 'POST');

/*Creamos un mensaje SOAP tal cual se define en el WSDL*/
   reqXML := '<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ser="urn:hacienda-gov-py:jupe_pensAliment">
   <soapenv:Header/>
   <soapenv:Body>
      <ser:consultarCedula>
         <cedula>'||cedula||'</cedula>
      </ser:consultarCedula>
   </soapenv:Body>
</soapenv:Envelope>';

/*El contenido que enviamos es XML: */
    UTL_HTTP.set_header(req, 'Content-Type', 'text/xml');

/*Establecemos el SOAPAction a invocar: */
    UTL_HTTP.set_header(req, 'SOAPAction', '""');

/*Indicamos en el header el tamanho del mensaje enviado: */
    UTL_HTTP.set_header(req, 'Content-Length', LENGTH(reqXML));

/*Escribimos el body del request */
    UTL_HTTP.write_text(req, reqXML);

/*Obtenemos la respuesta */
    resp := UTL_HTTP.get_response(req);

/*Cargamos en la variable respVal la devolución del servidor */
    UTL_HTTP.read_text(resp, respVal);

/*Finalizamos la conexión HTTP */
    UTL_HTTP.end_response(resp);

/*Convertimos el response en tipo xml para extraer los parametros*/
    val_xml := xmltype(respVal);

/*Verificamos si se recupero un valor*/
     existe:=val_xml.existsNode('//return/item');
    IF existe=0 THEN
      --RETURN 'TRUE';
      RETURN 'TRUE';
    END IF;

   -- return val_xml.extract('//return').getStringVal();
 /*Contamos la cantidad de ocurrencia de returns*/
    xml_retorno:=val_xml.extract('//return/item').getStringVal() ;
    cantidad:=0;
    ocurrencia:= instr(xml_retorno,'</item>');

   -- RETURN ocurrencia;
    WHILE ocurrencia > 0 LOOP
      cantidad:=cantidad+1;
      xml_retorno:=substr( xml_retorno, ocurrencia+9,LENGTH(xml_retorno));
      ocurrencia:= instr(xml_retorno,'</item>');
    END LOOP;
  --  RETURN cantidad||'df';
    /*Recorremos el array de resultado*/
    FOR Lcntr IN 1..cantidad
      LOOP
         sistemaConsulta:=val_xml.extract('//return/item['||Lcntr||']/sistemaConsulta//text()').getStringVal() ;
         personaNombreCompleto :=  val_xml.extract('//return/item['||Lcntr||']/personaNombreCompleto//text()').getStringVal() ;
         vinculo :=  val_xml.extract('//return/item['||Lcntr||']/vinculo//text()').getStringVal() ;
         detalle :=  val_xml.extract('//return/item['||Lcntr||']/detalle//text()').getStringVal() ;


         IF detalle = 'Error: Could not transmit message' THEN
           --RETURN 'FALSE';
          -- RAISE_APPLICATION_ERROR(-20000,'FALSE');
           RETURN 'FALSE';
         END IF;

        /* IF detalle = '' THEN
           return 'TRUE';
          ELSE*/
            IF sistemaConsulta = 'JUPE' THEN

              INSERT INTO objecion_ele_pen (id_objecion_ele_pen,VERSION_OBJECION_ELE_PEN,id_persona,ID_PROVEEDOR_DAT_EXT,NUMERO_TIPO_OBJ_ELE_PEN,
							ES_OBJECION_ELE_PEN_INACTIVA,fecha_ultima_actualizacion,NOMBRE_ARCHIVO_ULTIMA_ACT, observaciones)
            	VALUES(utils.bigintid(),0,id_persona,202,23,0,sysdate,'JUPE',detalle);

              --log jub pensionado
              INSERT INTO log_imp_jub(id_log_imp_jub, cedula, primer_nombre,
							 tipo_registro, es_importado, observacion, fecha_hora_transaccion, nombre_archivo, codigo_archivo)
						  VALUES (utils.bigintid(), cedula, substr(personaNombreCompleto,1,50), 0,1,detalle,current_timestamp,'JUPE',0);
               CONTINUE;
            END IF;


            IF sistemaConsulta = 'SINAHR' THEN
              --objecion
              INSERT INTO objecion_ele_pen (id_objecion_ele_pen, VERSION_OBJECION_ELE_PEN,id_persona,ID_PROVEEDOR_DAT_EXT,NUMERO_TIPO_OBJ_ELE_PEN,
							ES_OBJECION_ELE_PEN_INACTIVA,fecha_ultima_actualizacion,NOMBRE_ARCHIVO_ULTIMA_ACT, observaciones)
              VALUES(utils.bigintid(),0,id_persona,'SINAHR',21,0,sysdate,'SINAHR', detalle);

              --log SINAHR
              INSERT INTO log_imp_emp(id_log_imp_emp, cedula, primer_nombre,
							 es_importado, observacion, fecha_hora_transaccion, nombre_archivo, codigo_archivo)
						  VALUES (utils.bigintid(), cedula, substr(personaNombreCompleto,1,50), 1,detalle,current_timestamp,'SINAHR',0);

              CONTINUE;

             END IF;

             IF sistemaConsulta='MARANGATU - SSET' THEN

             INSERT INTO objecion_ele_pen (ID_OBJECION_ELE_PEN,VERSION_OBJECION_ELE_PEN,id_persona,ID_PROVEEDOR_DAT_EXT,NUMERO_TIPO_OBJ_ELE_PEN,
							ES_OBJECION_ELE_PEN_INACTIVA,fecha_ultima_actualizacion,NOMBRE_ARCHIVO_ULTIMA_ACT, observaciones)
              VALUES(utils.bigintid(),0,id_persona,202,22,0,sysdate,'SSET',detalle);

              --log SET
              INSERT INTO log_imp_deu(id_log_imp_deu, cedula, primer_nombre,
               es_importado, observacion, fecha_hora_transaccion, nombre_archivo,codigo_archivo)
              VALUES (utils.bigintid(), cedula, substr(personaNombreCompleto,1,50), 1,detalle,current_timestamp,'SSET',0);

            CONTINUE;
             END IF;
   END LOOP;
   COMMIT;
--RAISE_APPLICATION_ERROR(-20000,'FALSE');
--RETURN;
RETURN 'FALSE';

EXCEPTION
 WHEN OTHERS THEN
 --RAISE_APPLICATION_ERROR(-20000, 'Error'||SQLERRM);
 RETURN 'Error';
 --RETURN 'Error';

END;