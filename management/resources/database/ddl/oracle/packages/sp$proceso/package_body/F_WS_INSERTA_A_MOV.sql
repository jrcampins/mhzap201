function f_ws_inserta_a_mov(vMOV_ANNO             NUMBER,
                                              vMOV_MES              NUMBER,
                                              vMOV_SECUENCIA        NUMBER,
                                              vDEP_COD_DEPARTAMENTO NUMBER,
                                              vCIU_COD_CIU          VARCHAR2,
                                              vBAN_COD_BANCO        NUMBER,
                                              vCED_NROCEDULA        VARCHAR2,
                                              vBEN_NRO_BENEF        NUMBER,
                                              vTAS_COD_ASIGNADO     NUMBER,
                                              vMOV_ASIGNADO_MENSUAL NUMBER,
                                              vMOV_BONIFICACION     NUMBER,
                                              vMOV_DESCUENTOS       NUMBER,
                                              vMOV_ESTADO           VARCHAR2,
                                              vMOV_FCHPAGO          VARCHAR2,
                                              vMOV_FCHBAJA          VARCHAR2,
                                              vMOV_FCHING           VARCHAR2,
                                              vMOV_USRING           VARCHAR2,
                                              vMOV_FCHACT           VARCHAR2,
                                              vMOV_USRACT           VARCHAR2,
                                              vPLA_COD_PLANILLA     NUMBER,
                                              vCON_COD_CONCEPTO     NUMBER,
                                              vTJU_COD_JUBILACION   NUMBER,
                                              vPOL_COD_POLICIA      NUMBER,
                                              vMIL_COD_MILITAR      NUMBER
) return VARCHAR2 is
  req   UTL_HTTP.req := NULL;
  resp  UTL_HTTP.resp := NULL;
  respVal VARCHAR2(32000);
  reqXML VARCHAR2(32760);
  val_xml xmltype;
  existe NUMERIC;

  Result VARCHAR2(32760);
begin
  /*Generamos un Request a la URL destino, el método debe ser POST */
      req := UTL_HTTP.begin_request('http://10.20.2.62:8090/jupe/pensionalimentaria?wsdl', 'POST');

    /*Creamos un mensaje SOAP tal cual se define en el WSDL*/
       reqXML := '<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:urn="urn:hacienda-gov-py:jupe_pensAliment">
                   <soapenv:Header/>
                   <soapenv:Body>
                      <urn:insercion_A_MOV>
                         <datosMov>
                            <movAnho>'||vMOV_ANNO||'</movAnho>
                            <movMes>'||vMOV_MES||'</movMes>
                            <movSecuencia>'||vMOV_SECUENCIA||'</movSecuencia>
                            <depCoddepartamento>'||vDEP_COD_DEPARTAMENTO||'</depCoddepartamento>
                            <ciuCodciu>'||vCIU_COD_CIU||'</ciuCodciu>
                            <banCodbanco>'||vBAN_COD_BANCO||'</banCodbanco>
                            <cedNrocedula>'||vCED_NROCEDULA||'</cedNrocedula>
                            <benNerobenef>'||vBEN_NRO_BENEF||'</benNerobenef>
                            <tasCodasignado>'||vTAS_COD_ASIGNADO||'</tasCodasignado>
                            <movAsignadomensual>'||vMOV_ASIGNADO_MENSUAL||'</movAsignadomensual>
                            <movBonificacion>'||vMOV_BONIFICACION||'</movBonificacion>
                            <movDescuentos>'||vMOV_DESCUENTOS||'</movDescuentos>
                            <movEstado>'||vMOV_ESTADO||'</movEstado>
                            <movFchpago>'||vMOV_FCHPAGO||'</movFchpago>
                            <movFchbaja>'||vMOV_FCHBAJA||'</movFchbaja>
                            <movFching>'||vMOV_FCHING||'</movFching>
                            <movUsring>'||vMOV_USRING||'</movUsring>
                            <movFchact>'||vMOV_FCHACT||'</movFchact>
                            <movUsract>'||vMOV_USRACT||'</movUsract>
                            <plaCodplanilla>'||vPLA_COD_PLANILLA||'</plaCodplanilla>
                            <conCodconcepto>'||vCON_COD_CONCEPTO||'</conCodconcepto>
                            <tjuCodjubilacion>'||vTJU_COD_JUBILACION||'</tjuCodjubilacion>
                            <polCodpolicia>'||vPOL_COD_POLICIA||'</polCodpolicia>
                            <milCodmilitar>'||vMIL_COD_MILITAR||'</milCodmilitar>
                         </datosMov>
                      </urn:insercion_A_MOV>
                   </soapenv:Body>
                </soapenv:Envelope>';
                --raise_application_error(-20000,reqXML);
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
       existe:=val_xml.existsNode('//return');
      IF existe=0 THEN
        --RETURN 'TRUE';
        RETURN 'ERROR';
      END IF;

     -- return val_xml.extract('//return').getStringVal();
   /*Contamos la cantidad de ocurrencia de returns*/
      Result:=val_xml.extract('//return/resultado/text()').getStringVal() ;
  return(Result);
end f_ws_inserta_a_mov;
