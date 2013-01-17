function f_ws_inserta_a_emp(COF_CODIGO NUMBER ,
                                              OFI_CODN1  NUMBER ,
                                              OFI_CODN2  NUMBER ,
                                              OFI_CODN3  NUMBER ,
                                              OFI_CODN4  NUMBER ,
                                              OFI_CODN5  NUMBER ,
                                              OFI_CODN6  NUMBER ,
                                              EMP_FCHING VARCHAR2      ,
                                              PER_CODCCI VARCHAR2,
                                              EMP_USRING VARCHAR2 ,
                                              EMP_FCHACT VARCHAR2        ,
                                              EMP_USRACT VARCHAR2 ,
                                              TFU_CODIGO NUMBER   ,
                                              EMP_ACTIVO VARCHAR2,
                                              EMP_PXB    VARCHAR2 ,
                                              EMP_FCHPXB VARCHAR2        ,
                                              EMP_USRPXB VARCHAR2
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
                        <urn:insercion_A_EMP>
                           <datosEmp>
                              <cofCodigo>'||COF_CODIGO||'</cofCodigo>
                              <ofiCodn1>'||OFI_CODN1||'</ofiCodn1>
                              <ofiCodn2>'||OFI_CODN2||'</ofiCodn2>
                              <ofiCodn3>'||OFI_CODN3||'</ofiCodn3>
                              <ofiCodn4>'||OFI_CODN4||'</ofiCodn4>
                              <ofiCodn5>'||OFI_CODN5||'</ofiCodn5>
                              <ofiCodn6>'||OFI_CODN6||'</ofiCodn6>
                              <empFching>'||EMP_FCHING||'</empFching>
                              <perCodcci>'||PER_CODCCI||'</perCodcci>
                              <empUsring>'||EMP_USRING||'</empUsring>
                              <empFchact>'||EMP_FCHACT||'</empFchact>
                              <empUsract>'||EMP_USRACT||'</empUsract>
                              <tfuCodigo>'||TFU_CODIGO||'</tfuCodigo>
                              <empActivo>'||EMP_ACTIVO||'</empActivo>
                              <empPxb>'||EMP_PXB||'</empPxb>
                              <empFchpxb>'||EMP_FCHPXB||'</empFchpxb>
                              <empUsrpxb>'||EMP_USRPXB||'</empUsrpxb>
                           </datosEmp>
                        </urn:insercion_A_EMP>
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
        RETURN 'ERROR';
      END IF;

     -- return val_xml.extract('//return').getStringVal();
   /*Contamos la cantidad de ocurrencia de returns*/
      Result:=val_xml.extract('//return/item').getStringVal() ;

  return(Result);
end f_ws_inserta_a_emp;
