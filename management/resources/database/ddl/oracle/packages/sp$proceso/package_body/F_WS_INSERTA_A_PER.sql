function f_ws_inserta_a_per(PER_CODCCI     VARCHAR2 ,
                                              PER_APYNOM     VARCHAR2,
                                              PER_NOMBRES    VARCHAR2,
                                              PER_APENAC     VARCHAR2,
                                              PER_APECAS     VARCHAR2,
                                              PER_CODSEXO    VARCHAR2,
                                              PER_LUGNAC     VARCHAR2,
                                              PER_FCHNACI    VARCHAR2 ,
                                              NAC_CODPAIS    NUMBER ,
                                              CIV_CODECIV    NUMBER,
                                              PER_FCHINGR    VARCHAR2,
                                              PER_FCHBAJA    VARCHAR2,
                                              PER_DESDOMI    VARCHAR2,
                                              LOC_CODLOCA    NUMBER,
                                              DEP_CODDEPTO   NUMBER,
                                              PER_CODPOST    NUMBER,
                                              DIS_CODDIST    NUMBER,
                                              OPE_CODOPER    NUMBER,
                                              FIN_CODEFIN    NUMBER,
                                              CTA_CODCTA     NUMBER,
                                              PER_CELULAR    VARCHAR2,
                                              PER_REGCOND    NUMBER,
                                              PER_DESCTA     VARCHAR2,
                                              PER_TELEFONO   VARCHAR2,
                                              PER_TIPREG     NUMBER,
                                              PER_DESCTA_OLD VARCHAR2,
                                              PER_MUNICIPIO  VARCHAR2,
                                              PER_GRPOSANG   VARCHAR2,
                                              PER_PROFESION  VARCHAR2,
                                              PER_REGPROF    VARCHAR2,
                                              PER_NRORUC     VARCHAR2,
                                              TFU_CODIGO     NUMBER,
                                              PER_USUNOM     VARCHAR2,
                                              PER_USUFCH     VARCHAR2,
                                              DISCAPACIDAD   VARCHAR2
) return VARCHAR2 is
  req   UTL_HTTP.req := NULL;
  resp  UTL_HTTP.resp := NULL;
  respVal VARCHAR2(32767);
  reqXML VARCHAR2(32767);
  val_xml xmltype;
  existe NUMERIC;

  Result VARCHAR2(32767);
begin
  --llamar WS
  /*Generamos un Request a la URL destino, el método debe ser POST */
      req := UTL_HTTP.begin_request('http://10.20.2.62:8090/jupe/pensionalimentaria?wsdl', 'POST');

    /*Creamos un mensaje SOAP tal cual se define en el WSDL*/
       reqXML := '<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:urn="urn:hacienda-gov-py:jupe_pensAliment">
                   <soapenv:Header/>
                   <soapenv:Body>
                      <urn:insercion_A_PER>
                         <datosPer>
                            <perCodcci>'||PER_CODCCI||'</perCodcci>
                            <perApynom>'||PER_APYNOM||'</perApynom>
                            <perNombres>'||PER_NOMBRES||'</perNombres>
                            <perApenac>'||PER_APENAC||'</perApenac>
                            <perApecas>'||PER_APECAS||'</perApecas>
                            <perCodsexo>'||PER_CODSEXO||'</perCodsexo>
                            <perLugnac>'||PER_LUGNAC||'</perLugnac>
                            <perFchnaci>'||PER_FCHNACI||'</perFchnaci>
                            <nacCodpais>'||NAC_CODPAIS||'</nacCodpais>
                            <civCodeciv>'||CIV_CODECIV||'</civCodeciv>
                            <perFchingr>'||PER_FCHINGR||'</perFchingr>
                            <perFchbaja>'||PER_FCHBAJA||'</perFchbaja>
                            <perDesdomi>'||PER_DESDOMI||'</perDesdomi>
                            <locCodloca>'||LOC_CODLOCA||'</locCodloca>
                            <depCoddepto>'||DEP_CODDEPTO||'</depCoddepto>
                            <perCodpost>'||PER_CODPOST||'</perCodpost>
                            <disCoddist>'||DIS_CODDIST||'</disCoddist>
                            <opeCodoper>'||OPE_CODOPER||'</opeCodoper>
                            <finCodefin>'||FIN_CODEFIN||'</finCodefin>
                            <ctaCodcta>'||CTA_CODCTA||'</ctaCodcta>
                            <perCelular>'||PER_CELULAR||'</perCelular>
                            <perRegcond>'||PER_REGCOND||'</perRegcond>
                            <perDescta>'||PER_DESCTA||'</perDescta>
                            <perTelefono>'||PER_TELEFONO||'</perTelefono>
                            <perTipreg>'||PER_TIPREG||'</perTipreg>
                            <perDesctaold>'||PER_DESCTA_OLD||'</perDesctaold>
                            <perMunicipio>'||PER_MUNICIPIO||'</perMunicipio>
                            <perGrposang>'||PER_GRPOSANG||'</perGrposang>
                            <perProfesion>'||PER_PROFESION||'</perProfesion>
                            <perRegprof>'||PER_REGPROF||'</perRegprof>
                            <perNroruc>'||PER_NRORUC||'</perNroruc>
                            <tfuCodigo>'||TFU_CODIGO||'</tfuCodigo>
                            <perUsunom>'||PER_USUNOM||'</perUsunom>
                            <perUsufch>'||PER_USUFCH||'</perUsufch>
                            <discapacidad>'||DISCAPACIDAD||'</discapacidad>
                         </datosPer>
                      </urn:insercion_A_PER>
                   </soapenv:Body>
                </soapenv:Envelope>';
               -- raise_application_error(-20000,reqXML);
                --Raise_application_error(-20000,reqXML);
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
       existe:=val_xml.existsNode('//return/resultado');
      IF existe=0 THEN
        --RETURN 'TRUE';
        RETURN 'ERROR';
      END IF;

     -- return val_xml.extract('//return').getStringVal();
   /*Contamos la cantidad de ocurrencia de returns*/
      Result:=val_xml.extract('//return/resultado/text()').getStringVal() ;

  return(Result);
end f_ws_inserta_a_per;
