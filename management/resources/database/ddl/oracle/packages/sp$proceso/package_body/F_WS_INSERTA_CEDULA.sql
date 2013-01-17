function f_ws_inserta_cedula(vCED_NROCEDULA   VARCHAR2,
                                                vEST_CODIGO      NUMBER,
                                                vCED_APYNOM      VARCHAR2,
                                                vCED_NOMBRES     VARCHAR2,
                                                vCED_APEL_PAT    VARCHAR2,
                                                vCED_APE_MATERNO VARCHAR2,
                                                vCED_APEL_CASADA VARCHAR2,
                                                vCED_DIRECCION   VARCHAR2,
                                                vCED_TELEFONO    VARCHAR2,
                                                vCED_SEXO        VARCHAR2,
                                                vCED_CONYUGE     VARCHAR2,
                                                vCED_FECHA_NAC   VARCHAR2,
                                                vCED_ESTATUS     VARCHAR2,
                                                vCED_OBSERVACION VARCHAR2,
                                                vCED_FECHING     VARCHAR2,
                                                vCED_USRING      VARCHAR2,
                                                vCED_FECHACT     VARCHAR2,
                                                vCED_USRACT      VARCHAR2,
                                                vPAI_COD_PAIS    NUMBER,
                                                vETN_COD_ETNIA   NUMBER
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
                      <urn:insercion_A_CED>
                         <datosCed>
                            <cedNrocedula>'||vCED_NROCEDULA||'</cedNrocedula>
                            <estCodigo>'||vEST_CODIGO||'</estCodigo>
                            <cedApynom>'||vCED_APYNOM||'</cedApynom>
                            <cedNombres>'||vCED_NOMBRES||'</cedNombres>
                            <cedApelpat>'||vCED_APEL_PAT||'</cedApelpat>
                            <cedApelmaterno>'||vCED_APE_MATERNO||'</cedApelmaterno>
                            <cedApelcasada>'||vCED_APEL_CASADA||'</cedApelcasada>
                            <cedDireccion>'||vCED_DIRECCION||'</cedDireccion>
                            <cedTelefono>'||vCED_TELEFONO||'</cedTelefono>
                            <cedSexo>'||vCED_SEXO||'</cedSexo>
                            <cedConyuge>'||vCED_CONYUGE||'</cedConyuge>
                            <cedFechanac>'||vCED_FECHA_NAC||'</cedFechanac>
                            <cedEstatus>'||vCED_ESTATUS||'</cedEstatus>
                            <cedObservacion>'||vCED_OBSERVACION||'</cedObservacion>
                            <cedFeching>'||vCED_FECHING||'</cedFeching>
                            <cedUsring>'||vCED_USRING||'</cedUsring>
                            <cedFechact>'||vCED_FECHACT||'</cedFechact>
                            <cedUsract>'||vCED_USRACT||'</cedUsract>
                            <paiCodpais>'||vPAI_COD_PAIS||'</paiCodpais>
                            <etnCodetnia>'||vETN_COD_ETNIA||'</etnCodetnia>
                         </datosCed>
                      </urn:insercion_A_CED>
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
      Result:=val_xml.extract('//return/resultado/text()').getStringVal() ;
  return(Result);
end f_ws_inserta_cedula;
