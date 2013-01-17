function f_ws_existe_a_ben(p_cedula varchar2) return VARCHAR2 is
req   UTL_HTTP.req := NULL;
resp  UTL_HTTP.resp := NULL;
respVal VARCHAR2(32000);
reqXML VARCHAR2(32760);
val_xml xmltype;
existe NUMERIC;

Result VARCHAR2(10);

begin
  /*Generamos un Request a la URL destino, el método debe ser POST */
    req := UTL_HTTP.begin_request('http://10.20.2.62:8090/jupe/pensionalimentaria?wsdl', 'POST');

  /*Creamos un mensaje SOAP tal cual se define en el WSDL*/
     reqXML := '<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:urn="urn:hacienda-gov-py:jupe_pensAliment">
                   <soapenv:Header/>
                   <soapenv:Body>
                      <urn:verificarCedula_A_BEN>
                         <cedula>'||p_cedula||'</cedula>
                      </urn:verificarCedula_A_BEN>
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
     existe:=val_xml.existsNode('//return');
    IF existe=0 THEN
      --RETURN 'TRUE';
      RETURN 'ERROR';
    END IF;

   -- return val_xml.extract('//return').getStringVal();
 /*Contamos la cantidad de ocurrencia de returns*/
    Result:=val_xml.extract('//return/text()').getStringVal() ;
  return Result;
end f_ws_existe_a_ben;
