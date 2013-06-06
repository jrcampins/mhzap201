function f_ws_inserta_a_ben(vCED_NROCEDULA       VARCHAR2,
                                              vBEN_NRO_BENEF       NUMBER,
                                              vFPG_CODIGO          NUMBER,
                                              vCON_COD_CONCEPTO    NUMBER,
                                              vPOL_COD_POLICIA     NUMBER,
                                              vTJU_COD_JUBILACION  NUMBER,
                                              vMIL_COD_MILITAR     NUMBER,
                                              vPLA_COD_PLANILLA    NUMBER,
                                              vBEN_NRO_DECRETO     VARCHAR2,
                                              vBEN_FECHA_DECRETO   VARCHAR2,
                                              vBEN_NRO_CAJA        NUMBER,
                                              vBEN_ANNO_SERVICIO   NUMBER,
                                              vBEN_MES_SERVICIO    NUMBER,
                                              vBEN_DIA_SERVICIO    NUMBER,
                                              vBEN_ANNO_RECONOCIDO NUMBER,
                                              vBEN_MES_RECONOCIDO  NUMBER,
                                              vBEN_DIA_RECONOCIDO  NUMBER,
                                              vBEN_CARGO           VARCHAR2,
                                              vBEN_LETRA_CARNET    VARCHAR2,
                                              vBEN_NRO_CARNET      NUMBER,
                                              vBEN_SERIE_CARNET    VARCHAR2,
                                              vBEN_PORCENTAJE      NUMBER,
                                              vGRP_CODIGO          NUMBER,
                                              vBEN_CEDULA_EXT      VARCHAR2,
                                              vBEN_BENEF_EXT       NUMBER,
                                              vBEN_FECBAJA         VARCHAR2,
                                              vBEN_FECREINCOR      VARCHAR2 ,
                                              vBEN_COD_BANCO_VIG   NUMBER,
                                              vBEN_ASIGNADO_VIG    NUMBER,
                                              vBEN_COD_CIU_VIG     VARCHAR2,
                                              vBEN_ESTATUS         VARCHAR2,
                                              vBEN_OBSERVACION     VARCHAR2,
                                              vBEN_FCHING          VARCHAR2,
                                              vBEN_USRING          VARCHAR2,
                                              vBEN_FCHACT          VARCHAR2,
                                              vBEN_USRACT          VARCHAR2,
                                              vBEN_FEC_ULTPAGO     VARCHAR2,
                                              vCTG_CODIGO          VARCHAR2,
                                              vBEN_TIPO_CALCULO    NUMBER,
                                              vCOD_MOT_BAJA        NUMBER,
                                              vBEN_LAM_ICV         NUMBER,
                                              vEXC_ANNO            NUMBER,
                                              vEXC_NRO_EXCEPCION   NUMBER,
                                              vEXP_ANO            NUMBER,
                                              vEXP_NRO            NUMBER
) return VARCHAR2 is
  req   UTL_HTTP.req := NULL;
  resp  UTL_HTTP.resp := NULL;
  respVal VARCHAR2(32000);
  reqXML VARCHAR2(32760);
  val_xml xmltype;
  existe NUMERIC;

  Result VARCHAR2(32760);
begin
  --llamar a WS
    /*Generamos un Request a la URL destino, el método debe ser POST */
      req := UTL_HTTP.begin_request('http://10.20.2.62:8090/jupe/pensionalimentaria?wsdl', 'POST');

    /*Creamos un mensaje SOAP tal cual se define en el WSDL*/
       reqXML := '<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:urn="urn:hacienda-gov-py:jupe_pensAliment">
                   <soapenv:Header/>
                   <soapenv:Body>
                      <urn:insercion_A_BEN>
                         <datosBen>

                            <cedNrocedula>'||vCED_NROCEDULA||'</cedNrocedula>
                            <benNrobenef>'||vBEN_NRO_BENEF||'</benNrobenef>
                            <fpgCodigo>'||vFPG_CODIGO||'</fpgCodigo>
                            <conCodconcepto>'||vCON_COD_CONCEPTO||'</conCodconcepto>
                            <polCodpolicia>'||vPOL_COD_POLICIA||'</polCodpolicia>
                            <tjuCodjubilacion>'||vTJU_COD_JUBILACION||'</tjuCodjubilacion>
                            <milCodmilitar>'||vMIL_COD_MILITAR||'</milCodmilitar>
                            <plaCodplanilla>'||vPLA_COD_PLANILLA||'</plaCodplanilla>
                            <benNrodecreto>'||vBEN_NRO_DECRETO||'</benNrodecreto>
                            <benFechadecreto>'||vBEN_FECHA_DECRETO||'</benFechadecreto>
                            <benNrocaja>'||vBEN_NRO_CAJA||'</benNrocaja>
                            <benAnhoservicio>'||vBEN_ANNO_SERVICIO||'</benAnhoservicio>
                            <benMesservicio>'||vBEN_MES_SERVICIO||'</benMesservicio>
                            <benDiaservicio>'||vBEN_DIA_SERVICIO||'</benDiaservicio>
                            <benAnhoreconocido>'||vBEN_ANNO_RECONOCIDO||'</benAnhoreconocido>
                            <benMesreconocido>'||vBEN_MES_RECONOCIDO||'</benMesreconocido>
                            <benDiareconocido>'||vBEN_DIA_RECONOCIDO||'</benDiareconocido>
                            <benCargo>'||vBEN_CARGO||'</benCargo>
                            <benLetracarnet>'||vBEN_LETRA_CARNET||'</benLetracarnet>
                            <benNrocarnet>'||vBEN_NRO_CARNET||'</benNrocarnet>
                            <benSeriecarnet>'||vBEN_SERIE_CARNET||'</benSeriecarnet>
                            <benPorcentaje>'||vBEN_PORCENTAJE||'</benPorcentaje>
                            <grpCodigo>'||vGRP_CODIGO||'</grpCodigo>
                            <benCedulaext>'||vBEN_CEDULA_EXT||'</benCedulaext>
                            <benBenefext>'||vBEN_BENEF_EXT||'</benBenefext>
                            <benFecbaja>'||vBEN_FECBAJA||'</benFecbaja>
                            <benFecreincor>'||vBEN_FECREINCOR||'</benFecreincor>
                            <benCodbancovig>'||vBEN_COD_BANCO_VIG||'</benCodbancovig>
                            <benAsignadovig>'||vBEN_ASIGNADO_VIG||'</benAsignadovig>
                            <benCodciuvig>'||vBEN_COD_CIU_VIG||'</benCodciuvig>
                            <benEstatus>'||vBEN_ESTATUS||'</benEstatus>
                            <benObservacion>'||vBEN_OBSERVACION||'</benObservacion>
                            <benFching>'||vBEN_FCHING||'</benFching>
                            <benUsring>'||vBEN_USRING||'</benUsring>
                            <benFchact>'||vBEN_FCHACT||'</benFchact>
                            <benUsract>'||vBEN_USRACT||'</benUsract>
                            <benFecultpago>'||vBEN_FEC_ULTPAGO||'</benFecultpago>
                            <ctgCodigo>'||vCTG_CODIGO||'</ctgCodigo>
                            <benTipocalculo>'||vBEN_TIPO_CALCULO||'</benTipocalculo>
                            <codMotbaja>'||vCOD_MOT_BAJA||'</codMotbaja>
                            <benLamicv>'||vBEN_LAM_ICV||'</benLamicv>
                            <excAnho>'||vEXC_ANNO||'</excAnho>
                            <excNroexcepcion>'||vEXC_NRO_EXCEPCION||'</excNroexcepcion>
                            <expAno>'||vEXP_ANO||'</expAno>
                            <expNro>'||vEXP_NRO||'</expNro>
                         </datosBen>
                      </urn:insercion_A_BEN>
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
        RETURN 'Error';
      END IF;

     -- return val_xml.extract('//return').getStringVal();
   /*Contamos la cantidad de ocurrencia de returns*/
      Result:=val_xml.extract('//return/resultado/text()').getStringVal() ;

  return(Result);
end f_ws_inserta_a_ben;
