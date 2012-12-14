<?xml version="1.0" encoding="UTF-8"?>
<!--
   Copyright (C) 2009, EGT Consultores, C.A.
   Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
   de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
   Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
   vea la licencia "GNU General Public License" para obtener mas informacion.
-->
<jsp:root version="2.1"
    xmlns:f="http://java.sun.com/jsf/core"
    xmlns:h="http://java.sun.com/jsf/html"
    xmlns:jsp="http://java.sun.com/JSP/Page" 
    xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page id="page1">
            <webuijsf:html id="html1">
                <webuijsf:head id="head1" title="#{ApplicationBean1.nombreAplicacion}">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                    <webuijsf:script id="script1" url="/resources/javascript1.js"/>
                </webuijsf:head>
                <webuijsf:body 
                    focus="#{Persona4.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{Persona4.gestor.preserveFocus}"
                    preserveScroll="#{Persona4.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{Persona4.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | listaFuncionAccion1 campoIdPersona1 campoCertificadoVida1 campoFechaCertificadoVida1 campoComentariosAnulCerVida1 campoCertificadoDefuncion1 campoFechaCertificadoDefuncion1 campoComentariosAnulCerDefuncion1 campoComentariosAprobacionPension1 listaNumeroCausaDenPension1 campoOtraCausaDenPension1 campoNumeroResolucionDenPen1 campoFechaResolucionDenPen1 campoComentariosDenegacionPension1 listaNumeroCausaRevPension1 campoOtraCausaRevPension1 campoComentariosRevocacionPension1 campoNumeroResolucionOtorPen1 campoFechaResolucionOtorPen1 campoComentariosOtorgamientoPen1 listaEsPersonaConCopiaCedula1 listaEsPersonaConDeclaracionJur1 campoComentariosSolicitudRecoPen1 campoComentariosAprRecoPen1 listaNumeroCausaDenRecoPen1 campoOtraCausaDenRecoPen1 campoComentariosDenRecoPen1 campoComentariosRegistroDenuPen1 campoComentariosConfDenuPen1 campoComentariosDesDenuPen1 campoFechaUltimoCobroPension1 campoNotasAnulFecUltCobPen1 campoIdDepartamento1 campoIdDistrito1 campoIdBarrio1 campoFechaSolicitudPensionDesde1 campoFechaSolicitudPensionHasta1 campoFechaAprobacionPensionDesde1 campoFechaAprobacionPensionHasta1 campoFechaDenegacionPensionDesde1 campoFechaDenegacionPensionHasta1 campoFechaRevocacionPensionDesde1 campoFechaRevocacionPensionHasta1 campoFechaOtorgamientoPenDesde1 campoFechaOtorgamientoPenHasta1 campoFechaHoraUltActJupeDesde1 campoFechaHoraUltActJupeHasta1 | , virtualForm2 | | , virtualForm3 | listaFuncionAccion1 | listaFuncionAccion1 , virtualForm4 | | ">
                        <div class="pos-div-cab-1">
                            <jsp:directive.include file="FragmentoCabeza1.jspf"/>
                        </div>
                        <div class="pos-div-cab-2">
                            <jsp:directive.include file="FragmentoCabeza2.jspf"/>
                        </div>
                        <div class="pos-div-fork">
                            <div class="pos-div-col-izq">
                                <jsp:directive.include file="FragmentoColumnaIzquierda.jspf"/>
                            </div>
                            <div class="pos-div-col-der">
                                <div class="pos-div-cab-3">
                                    <jsp:directive.include file="FragmentoCabeza3.jspf"/>
                                    <webuijsf:breadcrumbs 
                                        binding="#{Persona4.breadcrumbs1}" 
                                        id="breadcrumbs1" 
                                        styleClass="pdq-breadcrumbs-1"/>
                                </div>
                                <div class="pos-div-detalle">
                                    <h:panelGrid 
                                        id="gridPanel101">
                                        <h:panelGrid 
                                            id="gridPanel102">
                                            <h:panelGrid 
                                                columns="2" 
                                                id="gridPanel103">
                                                <webuijsf:image
                                                    id="imagenMensaje1"
                                                    rendered="#{Persona4.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{Persona4.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{Persona4.gestor.mensajeDisponible}"
                                                    text="#{Persona4.gestor.mensaje}"
                                                    url="#{Persona4.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            columns="2"
                                            id="gridPanel104"
                                            styleClass="pdq-grid-detalle-1">
                                            <h:panelGrid
                                                id="gridPanel105"
                                                styleClass="pdq-grid-detalle-botones">
                                                <h:panelGrid 
                                                    id="gridPanel106">
                                                    <webuijsf:anchor 
                                                        id="ancla1"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPanel107"
                                                styleClass="pdq-grid-detalle-mensajes">
                                                <h:panelGrid
                                                    id="gridPanel108"
                                                    styleClass="pdq-grid-detalle-mensajes-2">
                                                    <webuijsf:staticText
                                                        id="textoTitulo1"
                                                        styleClass="pdq-text-titulo-1"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPanel109"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona4.etiquetaListaFuncionAccion1}"
                                                    id="etiquetaListaFuncionAccion1"
                                                    for="listaFuncionAccion1"
                                                    text="#{Persona4.gestor.i18n.textoEtiquetaListaFuncionAccion}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel110"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown
                                                    binding="#{Persona4.listaFuncionAccion1}"
                                                    converter="#{Persona4.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{Persona4.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme4_2.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    required="true"
                                                    selected="#{Persona4.gestor.valorListaFuncionAccion1}"
                                                    toolTip="#{Persona4.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:staticText
                                                    binding="#{Persona4.listaFuncionAccion1Texto1}"
                                                    id="listaFuncionAccion1Texto1"/>
                                                <webuijsf:message
                                                    for="listaFuncionAccion1"
                                                    id="messageListaFuncionAccion1"/>
                                                <webuijsf:helpInline
                                                    binding="#{Persona4.helpInlineListaFuncionAccion1}"
                                                    id="helpInlineListaFuncionAccion1"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-page"
                                                    text="#{Persona4.gestor.i18n.inlineHelpListaFuncionAccion}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdPersona1" rendered="#{Persona4.bitIdPersonaRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona4.labelIdPersona1}"
                                                    id="labelIdPersona1"
                                                    for="campoIdPersona1"
                                                    text="persona"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdPersona2" rendered="#{Persona4.bitIdPersonaRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdPersona1"
                                                    binding="#{Persona4.campoIdPersona1}"
                                                     required="true"
                                                    text="#{Persona4.textoCampoIdPersona1}"
                                                    toolTip="#{Persona4.toolTipCampoIdPersona1}"
                                                    validatorExpression="#{Persona4.campoIdPersona1_validate}"/>
                                                <webuijsf:staticText id="campoIdPersona1Texto1"
                                                    binding="#{Persona4.campoIdPersona1Texto1}"/>
                                                <webuijsf:button id="campoIdPersona1Boton1"
                                                    binding="#{Persona4.campoIdPersona1Boton1}"
                                                    onClick="#{Persona4.scriptCampoIdPersona1Boton1}"/>
                                                <webuijsf:button id="campoIdPersona1Boton3"
                                                    binding="#{Persona4.campoIdPersona1Boton3}"
                                                    onClick="#{Persona4.scriptCampoIdPersona1Boton2}"
                                                    rendered="#{Persona4.bitCampoIdPersona1Boton3Rendered.on}"/>
                                                <webuijsf:message id="messageIdPersona1"
                                                    for="campoIdPersona1"/>
                                                <webuijsf:helpInline id="helpInlineIdPersona1"
                                                    binding="#{Persona4.helpInlineIdPersona1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdPersona3"
                                                rendered="#{Persona4.bitCampoIdPersona1Boton2Rendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona4.labelIdPersona2}"
                                                    id="labelIdPersona2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdPersona4"
                                                rendered="#{Persona4.bitCampoIdPersona1Boton2Rendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{Persona4.campoIdPersona1Texto2}"
                                                    id="campoIdPersona1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{Persona4.campoIdPersona1Boton2}"
                                                    id="campoIdPersona1Boton2"
                                                    onClick="#{Persona4.scriptCampoIdPersona1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridCertificadoVida1" rendered="#{Persona4.bitCertificadoVidaRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona4.labelCertificadoVida1}"
                                                    id="labelCertificadoVida1"
                                                    for="campoCertificadoVida1"
                                                    text="certificado vida"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridCertificadoVida2" rendered="#{Persona4.bitCertificadoVidaRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoCertificadoVida1"
                                                    binding="#{Persona4.campoCertificadoVida1}"
                                                    columns="50"
                                                     required="true"
                                                    text="#{Persona4.textoCampoCertificadoVida1}"
                                                    toolTip="BundleParametros.certificado_vida"
                                                    validatorExpression="#{Persona4.validatorCertificadoVida1.validate}"/>
                                                <webuijsf:staticText id="campoCertificadoVida1Texto1"
                                                    binding="#{Persona4.campoCertificadoVida1Texto1}"/>
                                                <webuijsf:message id="messageCertificadoVida1"
                                                    for="campoCertificadoVida1"/>
                                                <webuijsf:helpInline id="helpInlineCertificadoVida1"
                                                    binding="#{Persona4.helpInlineCertificadoVida1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.certificado_vida"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaCertificadoVida1" rendered="#{Persona4.bitFechaCertificadoVidaRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona4.labelFechaCertificadoVida1}"
                                                    id="labelFechaCertificadoVida1"
                                                    for="campoFechaCertificadoVida1"
                                                    text="fecha certificado vida"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaCertificadoVida2" rendered="#{Persona4.bitFechaCertificadoVidaRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaCertificadoVida1"
                                                    binding="#{Persona4.campoFechaCertificadoVida1}"
                                                    maxDate="#{Persona4.gestor.defaultMaxDate}"
                                                    minDate="#{Persona4.gestor.defaultMinDate}"
                                                     required="true"
                                                    selectedDate="#{Persona4.valorCampoFechaCertificadoVida1}"
                                                    toolTip="BundleParametros.fecha_certificado_vida"/>
                                                <webuijsf:staticText id="campoFechaCertificadoVida1Texto1"
                                                    binding="#{Persona4.campoFechaCertificadoVida1Texto1}"/>
                                                <webuijsf:message id="messageFechaCertificadoVida1"
                                                    for="campoFechaCertificadoVida1"/>
                                                <webuijsf:helpInline id="helpInlineFechaCertificadoVida1"
                                                    binding="#{Persona4.helpInlineFechaCertificadoVida1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_certificado_vida"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridComentariosAnulCerVida1" rendered="#{Persona4.bitComentariosAnulCerVidaRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona4.labelComentariosAnulCerVida1}"
                                                    id="labelComentariosAnulCerVida1"
                                                    for="campoComentariosAnulCerVida1"
                                                    text="comentarios anulaci&#243;n certificado vida"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridComentariosAnulCerVida2" rendered="#{Persona4.bitComentariosAnulCerVidaRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoComentariosAnulCerVida1"
                                                    binding="#{Persona4.campoComentariosAnulCerVida1}"
                                                    columns="50"
                                                     required="true"
                                                    text="#{Persona4.textoCampoComentariosAnulCerVida1}"
                                                    toolTip="BundleParametros.comentarios_anul_cer_vida"
                                                    validatorExpression="#{Persona4.validatorComentariosAnulCerVida1.validate}"/>
                                                <webuijsf:staticText id="campoComentariosAnulCerVida1Texto1"
                                                    binding="#{Persona4.campoComentariosAnulCerVida1Texto1}"/>
                                                <webuijsf:message id="messageComentariosAnulCerVida1"
                                                    for="campoComentariosAnulCerVida1"/>
                                                <webuijsf:helpInline id="helpInlineComentariosAnulCerVida1"
                                                    binding="#{Persona4.helpInlineComentariosAnulCerVida1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.comentarios_anul_cer_vida"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridCertificadoDefuncion1" rendered="#{Persona4.bitCertificadoDefuncionRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona4.labelCertificadoDefuncion1}"
                                                    id="labelCertificadoDefuncion1"
                                                    for="campoCertificadoDefuncion1"
                                                    text="certificado defunci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridCertificadoDefuncion2" rendered="#{Persona4.bitCertificadoDefuncionRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoCertificadoDefuncion1"
                                                    binding="#{Persona4.campoCertificadoDefuncion1}"
                                                    columns="50"
                                                     required="true"
                                                    text="#{Persona4.textoCampoCertificadoDefuncion1}"
                                                    toolTip="BundleParametros.certificado_defuncion"
                                                    validatorExpression="#{Persona4.validatorCertificadoDefuncion1.validate}"/>
                                                <webuijsf:staticText id="campoCertificadoDefuncion1Texto1"
                                                    binding="#{Persona4.campoCertificadoDefuncion1Texto1}"/>
                                                <webuijsf:message id="messageCertificadoDefuncion1"
                                                    for="campoCertificadoDefuncion1"/>
                                                <webuijsf:helpInline id="helpInlineCertificadoDefuncion1"
                                                    binding="#{Persona4.helpInlineCertificadoDefuncion1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.certificado_defuncion"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaCertificadoDefuncion1" rendered="#{Persona4.bitFechaCertificadoDefuncionRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona4.labelFechaCertificadoDefuncion1}"
                                                    id="labelFechaCertificadoDefuncion1"
                                                    for="campoFechaCertificadoDefuncion1"
                                                    text="fecha certificado defunci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaCertificadoDefuncion2" rendered="#{Persona4.bitFechaCertificadoDefuncionRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaCertificadoDefuncion1"
                                                    binding="#{Persona4.campoFechaCertificadoDefuncion1}"
                                                    maxDate="#{Persona4.gestor.defaultMaxDate}"
                                                    minDate="#{Persona4.gestor.defaultMinDate}"
                                                     required="true"
                                                    selectedDate="#{Persona4.valorCampoFechaCertificadoDefuncion1}"
                                                    toolTip="BundleParametros.fecha_certificado_defuncion"/>
                                                <webuijsf:staticText id="campoFechaCertificadoDefuncion1Texto1"
                                                    binding="#{Persona4.campoFechaCertificadoDefuncion1Texto1}"/>
                                                <webuijsf:message id="messageFechaCertificadoDefuncion1"
                                                    for="campoFechaCertificadoDefuncion1"/>
                                                <webuijsf:helpInline id="helpInlineFechaCertificadoDefuncion1"
                                                    binding="#{Persona4.helpInlineFechaCertificadoDefuncion1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_certificado_defuncion"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridComentariosAnulCerDefuncion1" rendered="#{Persona4.bitComentariosAnulCerDefuncionRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona4.labelComentariosAnulCerDefuncion1}"
                                                    id="labelComentariosAnulCerDefuncion1"
                                                    for="campoComentariosAnulCerDefuncion1"
                                                    text="comentarios anulaci&#243;n certificado defunci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridComentariosAnulCerDefuncion2" rendered="#{Persona4.bitComentariosAnulCerDefuncionRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoComentariosAnulCerDefuncion1"
                                                    binding="#{Persona4.campoComentariosAnulCerDefuncion1}"
                                                    columns="50"
                                                     required="true"
                                                    text="#{Persona4.textoCampoComentariosAnulCerDefuncion1}"
                                                    toolTip="BundleParametros.comentarios_anul_cer_defuncion"
                                                    validatorExpression="#{Persona4.validatorComentariosAnulCerDefuncion1.validate}"/>
                                                <webuijsf:staticText id="campoComentariosAnulCerDefuncion1Texto1"
                                                    binding="#{Persona4.campoComentariosAnulCerDefuncion1Texto1}"/>
                                                <webuijsf:message id="messageComentariosAnulCerDefuncion1"
                                                    for="campoComentariosAnulCerDefuncion1"/>
                                                <webuijsf:helpInline id="helpInlineComentariosAnulCerDefuncion1"
                                                    binding="#{Persona4.helpInlineComentariosAnulCerDefuncion1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.comentarios_anul_cer_defuncion"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridComentariosAprobacionPension1" rendered="#{Persona4.bitComentariosAprobacionPensionRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona4.labelComentariosAprobacionPension1}"
                                                    id="labelComentariosAprobacionPension1"
                                                    for="campoComentariosAprobacionPension1"
                                                    text="comentarios aprobaci&#243;n pensi&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridComentariosAprobacionPension2" rendered="#{Persona4.bitComentariosAprobacionPensionRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoComentariosAprobacionPension1"
                                                    binding="#{Persona4.campoComentariosAprobacionPension1}"
                                                    columns="50"
                                                     required="true"
                                                    text="#{Persona4.textoCampoComentariosAprobacionPension1}"
                                                    toolTip="BundleParametros.comentarios_aprobacion_pension"
                                                    validatorExpression="#{Persona4.validatorComentariosAprobacionPension1.validate}"/>
                                                <webuijsf:staticText id="campoComentariosAprobacionPension1Texto1"
                                                    binding="#{Persona4.campoComentariosAprobacionPension1Texto1}"/>
                                                <webuijsf:message id="messageComentariosAprobacionPension1"
                                                    for="campoComentariosAprobacionPension1"/>
                                                <webuijsf:helpInline id="helpInlineComentariosAprobacionPension1"
                                                    binding="#{Persona4.helpInlineComentariosAprobacionPension1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.comentarios_aprobacion_pension"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroCausaDenPension1" rendered="#{Persona4.bitNumeroCausaDenPensionRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona4.labelNumeroCausaDenPension1}"
                                                    id="labelNumeroCausaDenPension1"
                                                    for="listaNumeroCausaDenPension1"
                                                    text="causa denegaci&#243;n pensi&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroCausaDenPension2" rendered="#{Persona4.bitNumeroCausaDenPensionRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroCausaDenPension1"
                                                    binding="#{Persona4.listaNumeroCausaDenPension1}"
                                                    converter="#{Persona4.converterNumeroCausaDenPension1}"
                                                    items="#{Persona4.opcionesListaNumeroCausaDenPension1}"
                                                    selected="#{Persona4.valorListaNumeroCausaDenPension1}"
                                                    toolTip="BundleParametros.numero_causa_den_pension"/>
                                                <webuijsf:staticText id="listaNumeroCausaDenPension1Texto1"
                                                    binding="#{Persona4.listaNumeroCausaDenPension1Texto1}"/>
                                                <webuijsf:message id="messageNumeroCausaDenPension1"
                                                    for="listaNumeroCausaDenPension1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroCausaDenPension1"
                                                    binding="#{Persona4.helpInlineNumeroCausaDenPension1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_causa_den_pension"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridOtraCausaDenPension1" rendered="#{Persona4.bitOtraCausaDenPensionRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona4.labelOtraCausaDenPension1}"
                                                    id="labelOtraCausaDenPension1"
                                                    for="campoOtraCausaDenPension1"
                                                    text="otra causa denegaci&#243;n pensi&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridOtraCausaDenPension2" rendered="#{Persona4.bitOtraCausaDenPensionRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoOtraCausaDenPension1"
                                                    binding="#{Persona4.campoOtraCausaDenPension1}"
                                                    columns="50"
                                                    text="#{Persona4.textoCampoOtraCausaDenPension1}"
                                                    toolTip="BundleParametros.otra_causa_den_pension"
                                                    validatorExpression="#{Persona4.validatorOtraCausaDenPension1.validate}"/>
                                                <webuijsf:staticText id="campoOtraCausaDenPension1Texto1"
                                                    binding="#{Persona4.campoOtraCausaDenPension1Texto1}"/>
                                                <webuijsf:message id="messageOtraCausaDenPension1"
                                                    for="campoOtraCausaDenPension1"/>
                                                <webuijsf:helpInline id="helpInlineOtraCausaDenPension1"
                                                    binding="#{Persona4.helpInlineOtraCausaDenPension1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.otra_causa_den_pension"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroResolucionDenPen1" rendered="#{Persona4.bitNumeroResolucionDenPenRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona4.labelNumeroResolucionDenPen1}"
                                                    id="labelNumeroResolucionDenPen1"
                                                    for="campoNumeroResolucionDenPen1"
                                                    text="n&#250;mero resoluci&#243;n denegaci&#243;n pensi&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroResolucionDenPen2" rendered="#{Persona4.bitNumeroResolucionDenPenRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNumeroResolucionDenPen1"
                                                    binding="#{Persona4.campoNumeroResolucionDenPen1}"
                                                    columns="50"
                                                    text="#{Persona4.textoCampoNumeroResolucionDenPen1}"
                                                    toolTip="BundleParametros.numero_resolucion_den_pen"
                                                    validatorExpression="#{Persona4.validatorNumeroResolucionDenPen1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroResolucionDenPen1Texto1"
                                                    binding="#{Persona4.campoNumeroResolucionDenPen1Texto1}"/>
                                                <webuijsf:message id="messageNumeroResolucionDenPen1"
                                                    for="campoNumeroResolucionDenPen1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroResolucionDenPen1"
                                                    binding="#{Persona4.helpInlineNumeroResolucionDenPen1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_resolucion_den_pen"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaResolucionDenPen1" rendered="#{Persona4.bitFechaResolucionDenPenRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona4.labelFechaResolucionDenPen1}"
                                                    id="labelFechaResolucionDenPen1"
                                                    for="campoFechaResolucionDenPen1"
                                                    text="fecha resoluci&#243;n denegaci&#243;n pensi&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaResolucionDenPen2" rendered="#{Persona4.bitFechaResolucionDenPenRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaResolucionDenPen1"
                                                    binding="#{Persona4.campoFechaResolucionDenPen1}"
                                                    maxDate="#{Persona4.gestor.defaultMaxDate}"
                                                    minDate="#{Persona4.gestor.defaultMinDate}"
                                                    selectedDate="#{Persona4.valorCampoFechaResolucionDenPen1}"
                                                    toolTip="BundleParametros.fecha_resolucion_den_pen"/>
                                                <webuijsf:staticText id="campoFechaResolucionDenPen1Texto1"
                                                    binding="#{Persona4.campoFechaResolucionDenPen1Texto1}"/>
                                                <webuijsf:message id="messageFechaResolucionDenPen1"
                                                    for="campoFechaResolucionDenPen1"/>
                                                <webuijsf:helpInline id="helpInlineFechaResolucionDenPen1"
                                                    binding="#{Persona4.helpInlineFechaResolucionDenPen1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_resolucion_den_pen"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridComentariosDenegacionPension1" rendered="#{Persona4.bitComentariosDenegacionPensionRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona4.labelComentariosDenegacionPension1}"
                                                    id="labelComentariosDenegacionPension1"
                                                    for="campoComentariosDenegacionPension1"
                                                    text="comentarios denegaci&#243;n pensi&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridComentariosDenegacionPension2" rendered="#{Persona4.bitComentariosDenegacionPensionRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoComentariosDenegacionPension1"
                                                    binding="#{Persona4.campoComentariosDenegacionPension1}"
                                                    columns="50"
                                                    text="#{Persona4.textoCampoComentariosDenegacionPension1}"
                                                    toolTip="BundleParametros.comentarios_denegacion_pension"
                                                    validatorExpression="#{Persona4.validatorComentariosDenegacionPension1.validate}"/>
                                                <webuijsf:staticText id="campoComentariosDenegacionPension1Texto1"
                                                    binding="#{Persona4.campoComentariosDenegacionPension1Texto1}"/>
                                                <webuijsf:message id="messageComentariosDenegacionPension1"
                                                    for="campoComentariosDenegacionPension1"/>
                                                <webuijsf:helpInline id="helpInlineComentariosDenegacionPension1"
                                                    binding="#{Persona4.helpInlineComentariosDenegacionPension1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.comentarios_denegacion_pension"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroCausaRevPension1" rendered="#{Persona4.bitNumeroCausaRevPensionRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona4.labelNumeroCausaRevPension1}"
                                                    id="labelNumeroCausaRevPension1"
                                                    for="listaNumeroCausaRevPension1"
                                                    text="causa revocaci&#243;n pensi&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroCausaRevPension2" rendered="#{Persona4.bitNumeroCausaRevPensionRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroCausaRevPension1"
                                                    binding="#{Persona4.listaNumeroCausaRevPension1}"
                                                    converter="#{Persona4.converterNumeroCausaRevPension1}"
                                                    items="#{Persona4.opcionesListaNumeroCausaRevPension1}"
                                                    selected="#{Persona4.valorListaNumeroCausaRevPension1}"
                                                    toolTip="BundleParametros.numero_causa_rev_pension"/>
                                                <webuijsf:staticText id="listaNumeroCausaRevPension1Texto1"
                                                    binding="#{Persona4.listaNumeroCausaRevPension1Texto1}"/>
                                                <webuijsf:message id="messageNumeroCausaRevPension1"
                                                    for="listaNumeroCausaRevPension1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroCausaRevPension1"
                                                    binding="#{Persona4.helpInlineNumeroCausaRevPension1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_causa_rev_pension"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridOtraCausaRevPension1" rendered="#{Persona4.bitOtraCausaRevPensionRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona4.labelOtraCausaRevPension1}"
                                                    id="labelOtraCausaRevPension1"
                                                    for="campoOtraCausaRevPension1"
                                                    text="otra causa revocaci&#243;n pensi&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridOtraCausaRevPension2" rendered="#{Persona4.bitOtraCausaRevPensionRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoOtraCausaRevPension1"
                                                    binding="#{Persona4.campoOtraCausaRevPension1}"
                                                    columns="50"
                                                    text="#{Persona4.textoCampoOtraCausaRevPension1}"
                                                    toolTip="BundleParametros.otra_causa_rev_pension"
                                                    validatorExpression="#{Persona4.validatorOtraCausaRevPension1.validate}"/>
                                                <webuijsf:staticText id="campoOtraCausaRevPension1Texto1"
                                                    binding="#{Persona4.campoOtraCausaRevPension1Texto1}"/>
                                                <webuijsf:message id="messageOtraCausaRevPension1"
                                                    for="campoOtraCausaRevPension1"/>
                                                <webuijsf:helpInline id="helpInlineOtraCausaRevPension1"
                                                    binding="#{Persona4.helpInlineOtraCausaRevPension1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.otra_causa_rev_pension"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridComentariosRevocacionPension1" rendered="#{Persona4.bitComentariosRevocacionPensionRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona4.labelComentariosRevocacionPension1}"
                                                    id="labelComentariosRevocacionPension1"
                                                    for="campoComentariosRevocacionPension1"
                                                    text="comentarios revocaci&#243;n pensi&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridComentariosRevocacionPension2" rendered="#{Persona4.bitComentariosRevocacionPensionRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoComentariosRevocacionPension1"
                                                    binding="#{Persona4.campoComentariosRevocacionPension1}"
                                                    columns="50"
                                                    text="#{Persona4.textoCampoComentariosRevocacionPension1}"
                                                    toolTip="BundleParametros.comentarios_revocacion_pension"
                                                    validatorExpression="#{Persona4.validatorComentariosRevocacionPension1.validate}"/>
                                                <webuijsf:staticText id="campoComentariosRevocacionPension1Texto1"
                                                    binding="#{Persona4.campoComentariosRevocacionPension1Texto1}"/>
                                                <webuijsf:message id="messageComentariosRevocacionPension1"
                                                    for="campoComentariosRevocacionPension1"/>
                                                <webuijsf:helpInline id="helpInlineComentariosRevocacionPension1"
                                                    binding="#{Persona4.helpInlineComentariosRevocacionPension1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.comentarios_revocacion_pension"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroResolucionOtorPen1" rendered="#{Persona4.bitNumeroResolucionOtorPenRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona4.labelNumeroResolucionOtorPen1}"
                                                    id="labelNumeroResolucionOtorPen1"
                                                    for="campoNumeroResolucionOtorPen1"
                                                    text="n&#250;mero resoluci&#243;n otor pensi&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroResolucionOtorPen2" rendered="#{Persona4.bitNumeroResolucionOtorPenRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNumeroResolucionOtorPen1"
                                                    binding="#{Persona4.campoNumeroResolucionOtorPen1}"
                                                    columns="50"
                                                    text="#{Persona4.textoCampoNumeroResolucionOtorPen1}"
                                                    toolTip="BundleParametros.numero_resolucion_otor_pen"
                                                    validatorExpression="#{Persona4.validatorNumeroResolucionOtorPen1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroResolucionOtorPen1Texto1"
                                                    binding="#{Persona4.campoNumeroResolucionOtorPen1Texto1}"/>
                                                <webuijsf:message id="messageNumeroResolucionOtorPen1"
                                                    for="campoNumeroResolucionOtorPen1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroResolucionOtorPen1"
                                                    binding="#{Persona4.helpInlineNumeroResolucionOtorPen1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_resolucion_otor_pen"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaResolucionOtorPen1" rendered="#{Persona4.bitFechaResolucionOtorPenRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona4.labelFechaResolucionOtorPen1}"
                                                    id="labelFechaResolucionOtorPen1"
                                                    for="campoFechaResolucionOtorPen1"
                                                    text="fecha resoluci&#243;n otor pensi&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaResolucionOtorPen2" rendered="#{Persona4.bitFechaResolucionOtorPenRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaResolucionOtorPen1"
                                                    binding="#{Persona4.campoFechaResolucionOtorPen1}"
                                                    maxDate="#{Persona4.gestor.defaultMaxDate}"
                                                    minDate="#{Persona4.gestor.defaultMinDate}"
                                                    selectedDate="#{Persona4.valorCampoFechaResolucionOtorPen1}"
                                                    toolTip="BundleParametros.fecha_resolucion_otor_pen"/>
                                                <webuijsf:staticText id="campoFechaResolucionOtorPen1Texto1"
                                                    binding="#{Persona4.campoFechaResolucionOtorPen1Texto1}"/>
                                                <webuijsf:message id="messageFechaResolucionOtorPen1"
                                                    for="campoFechaResolucionOtorPen1"/>
                                                <webuijsf:helpInline id="helpInlineFechaResolucionOtorPen1"
                                                    binding="#{Persona4.helpInlineFechaResolucionOtorPen1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_resolucion_otor_pen"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridComentariosOtorgamientoPen1" rendered="#{Persona4.bitComentariosOtorgamientoPenRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona4.labelComentariosOtorgamientoPen1}"
                                                    id="labelComentariosOtorgamientoPen1"
                                                    for="campoComentariosOtorgamientoPen1"
                                                    text="comentarios otorgamiento pensi&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridComentariosOtorgamientoPen2" rendered="#{Persona4.bitComentariosOtorgamientoPenRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoComentariosOtorgamientoPen1"
                                                    binding="#{Persona4.campoComentariosOtorgamientoPen1}"
                                                    columns="50"
                                                    text="#{Persona4.textoCampoComentariosOtorgamientoPen1}"
                                                    toolTip="BundleParametros.comentarios_otorgamiento_pen"
                                                    validatorExpression="#{Persona4.validatorComentariosOtorgamientoPen1.validate}"/>
                                                <webuijsf:staticText id="campoComentariosOtorgamientoPen1Texto1"
                                                    binding="#{Persona4.campoComentariosOtorgamientoPen1Texto1}"/>
                                                <webuijsf:message id="messageComentariosOtorgamientoPen1"
                                                    for="campoComentariosOtorgamientoPen1"/>
                                                <webuijsf:helpInline id="helpInlineComentariosOtorgamientoPen1"
                                                    binding="#{Persona4.helpInlineComentariosOtorgamientoPen1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.comentarios_otorgamiento_pen"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsPersonaConCopiaCedula1" rendered="#{Persona4.bitEsPersonaConCopiaCedulaRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona4.labelEsPersonaConCopiaCedula1}"
                                                    id="labelEsPersonaConCopiaCedula1"
                                                    for="listaEsPersonaConCopiaCedula1"
                                                    text="con copia c&#233;dula"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsPersonaConCopiaCedula2" rendered="#{Persona4.bitEsPersonaConCopiaCedulaRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsPersonaConCopiaCedula1"
                                                    binding="#{Persona4.listaEsPersonaConCopiaCedula1}"
                                                    converter="#{Persona4.converterEsPersonaConCopiaCedula1}"
                                                    items="#{Persona4.opcionesListaEsPersonaConCopiaCedula1}"
                                                     required="true"
                                                    selected="#{Persona4.valorListaEsPersonaConCopiaCedula1}"
                                                    toolTip="BundleParametros.es_persona_con_copia_cedula"/>
                                                <webuijsf:staticText id="listaEsPersonaConCopiaCedula1Texto1"
                                                    binding="#{Persona4.listaEsPersonaConCopiaCedula1Texto1}"/>
                                                <webuijsf:message id="messageEsPersonaConCopiaCedula1"
                                                    for="listaEsPersonaConCopiaCedula1"/>
                                                <webuijsf:helpInline id="helpInlineEsPersonaConCopiaCedula1"
                                                    binding="#{Persona4.helpInlineEsPersonaConCopiaCedula1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_persona_con_copia_cedula"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsPersonaConDeclaracionJur1" rendered="#{Persona4.bitEsPersonaConDeclaracionJurRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona4.labelEsPersonaConDeclaracionJur1}"
                                                    id="labelEsPersonaConDeclaracionJur1"
                                                    for="listaEsPersonaConDeclaracionJur1"
                                                    text="con declaraci&#243;n jurada"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsPersonaConDeclaracionJur2" rendered="#{Persona4.bitEsPersonaConDeclaracionJurRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsPersonaConDeclaracionJur1"
                                                    binding="#{Persona4.listaEsPersonaConDeclaracionJur1}"
                                                    converter="#{Persona4.converterEsPersonaConDeclaracionJur1}"
                                                    items="#{Persona4.opcionesListaEsPersonaConDeclaracionJur1}"
                                                     required="true"
                                                    selected="#{Persona4.valorListaEsPersonaConDeclaracionJur1}"
                                                    toolTip="BundleParametros.es_persona_con_declaracion_jur"/>
                                                <webuijsf:staticText id="listaEsPersonaConDeclaracionJur1Texto1"
                                                    binding="#{Persona4.listaEsPersonaConDeclaracionJur1Texto1}"/>
                                                <webuijsf:message id="messageEsPersonaConDeclaracionJur1"
                                                    for="listaEsPersonaConDeclaracionJur1"/>
                                                <webuijsf:helpInline id="helpInlineEsPersonaConDeclaracionJur1"
                                                    binding="#{Persona4.helpInlineEsPersonaConDeclaracionJur1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_persona_con_declaracion_jur"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridComentariosSolicitudRecoPen1" rendered="#{Persona4.bitComentariosSolicitudRecoPenRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona4.labelComentariosSolicitudRecoPen1}"
                                                    id="labelComentariosSolicitudRecoPen1"
                                                    for="campoComentariosSolicitudRecoPen1"
                                                    text="comentarios solicitud reconsideraci&#243;n pensi&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridComentariosSolicitudRecoPen2" rendered="#{Persona4.bitComentariosSolicitudRecoPenRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoComentariosSolicitudRecoPen1"
                                                    binding="#{Persona4.campoComentariosSolicitudRecoPen1}"
                                                    columns="50"
                                                     required="true"
                                                    text="#{Persona4.textoCampoComentariosSolicitudRecoPen1}"
                                                    toolTip="BundleParametros.comentarios_solicitud_reco_pen"
                                                    validatorExpression="#{Persona4.validatorComentariosSolicitudRecoPen1.validate}"/>
                                                <webuijsf:staticText id="campoComentariosSolicitudRecoPen1Texto1"
                                                    binding="#{Persona4.campoComentariosSolicitudRecoPen1Texto1}"/>
                                                <webuijsf:message id="messageComentariosSolicitudRecoPen1"
                                                    for="campoComentariosSolicitudRecoPen1"/>
                                                <webuijsf:helpInline id="helpInlineComentariosSolicitudRecoPen1"
                                                    binding="#{Persona4.helpInlineComentariosSolicitudRecoPen1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.comentarios_solicitud_reco_pen"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridComentariosAprRecoPen1" rendered="#{Persona4.bitComentariosAprRecoPenRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona4.labelComentariosAprRecoPen1}"
                                                    id="labelComentariosAprRecoPen1"
                                                    for="campoComentariosAprRecoPen1"
                                                    text="comentarios aprobaci&#243;n reconsideraci&#243;n pensi&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridComentariosAprRecoPen2" rendered="#{Persona4.bitComentariosAprRecoPenRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoComentariosAprRecoPen1"
                                                    binding="#{Persona4.campoComentariosAprRecoPen1}"
                                                    columns="50"
                                                     required="true"
                                                    text="#{Persona4.textoCampoComentariosAprRecoPen1}"
                                                    toolTip="BundleParametros.comentarios_apr_reco_pen"
                                                    validatorExpression="#{Persona4.validatorComentariosAprRecoPen1.validate}"/>
                                                <webuijsf:staticText id="campoComentariosAprRecoPen1Texto1"
                                                    binding="#{Persona4.campoComentariosAprRecoPen1Texto1}"/>
                                                <webuijsf:message id="messageComentariosAprRecoPen1"
                                                    for="campoComentariosAprRecoPen1"/>
                                                <webuijsf:helpInline id="helpInlineComentariosAprRecoPen1"
                                                    binding="#{Persona4.helpInlineComentariosAprRecoPen1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.comentarios_apr_reco_pen"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroCausaDenRecoPen1" rendered="#{Persona4.bitNumeroCausaDenRecoPenRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona4.labelNumeroCausaDenRecoPen1}"
                                                    id="labelNumeroCausaDenRecoPen1"
                                                    for="listaNumeroCausaDenRecoPen1"
                                                    text="causa denegaci&#243;n reconsideraci&#243;n pensi&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroCausaDenRecoPen2" rendered="#{Persona4.bitNumeroCausaDenRecoPenRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroCausaDenRecoPen1"
                                                    binding="#{Persona4.listaNumeroCausaDenRecoPen1}"
                                                    converter="#{Persona4.converterNumeroCausaDenRecoPen1}"
                                                    items="#{Persona4.opcionesListaNumeroCausaDenRecoPen1}"
                                                     required="true"
                                                    selected="#{Persona4.valorListaNumeroCausaDenRecoPen1}"
                                                    toolTip="BundleParametros.numero_causa_den_reco_pen"/>
                                                <webuijsf:staticText id="listaNumeroCausaDenRecoPen1Texto1"
                                                    binding="#{Persona4.listaNumeroCausaDenRecoPen1Texto1}"/>
                                                <webuijsf:message id="messageNumeroCausaDenRecoPen1"
                                                    for="listaNumeroCausaDenRecoPen1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroCausaDenRecoPen1"
                                                    binding="#{Persona4.helpInlineNumeroCausaDenRecoPen1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_causa_den_reco_pen"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridOtraCausaDenRecoPen1" rendered="#{Persona4.bitOtraCausaDenRecoPenRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona4.labelOtraCausaDenRecoPen1}"
                                                    id="labelOtraCausaDenRecoPen1"
                                                    for="campoOtraCausaDenRecoPen1"
                                                    text="otra causa denegaci&#243;n reconsideraci&#243;n pensi&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridOtraCausaDenRecoPen2" rendered="#{Persona4.bitOtraCausaDenRecoPenRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoOtraCausaDenRecoPen1"
                                                    binding="#{Persona4.campoOtraCausaDenRecoPen1}"
                                                    columns="50"
                                                    text="#{Persona4.textoCampoOtraCausaDenRecoPen1}"
                                                    toolTip="BundleParametros.otra_causa_den_reco_pen"
                                                    validatorExpression="#{Persona4.validatorOtraCausaDenRecoPen1.validate}"/>
                                                <webuijsf:staticText id="campoOtraCausaDenRecoPen1Texto1"
                                                    binding="#{Persona4.campoOtraCausaDenRecoPen1Texto1}"/>
                                                <webuijsf:message id="messageOtraCausaDenRecoPen1"
                                                    for="campoOtraCausaDenRecoPen1"/>
                                                <webuijsf:helpInline id="helpInlineOtraCausaDenRecoPen1"
                                                    binding="#{Persona4.helpInlineOtraCausaDenRecoPen1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.otra_causa_den_reco_pen"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridComentariosDenRecoPen1" rendered="#{Persona4.bitComentariosDenRecoPenRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona4.labelComentariosDenRecoPen1}"
                                                    id="labelComentariosDenRecoPen1"
                                                    for="campoComentariosDenRecoPen1"
                                                    text="comentarios denegaci&#243;n reconsideraci&#243;n pensi&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridComentariosDenRecoPen2" rendered="#{Persona4.bitComentariosDenRecoPenRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoComentariosDenRecoPen1"
                                                    binding="#{Persona4.campoComentariosDenRecoPen1}"
                                                    columns="50"
                                                    text="#{Persona4.textoCampoComentariosDenRecoPen1}"
                                                    toolTip="BundleParametros.comentarios_den_reco_pen"
                                                    validatorExpression="#{Persona4.validatorComentariosDenRecoPen1.validate}"/>
                                                <webuijsf:staticText id="campoComentariosDenRecoPen1Texto1"
                                                    binding="#{Persona4.campoComentariosDenRecoPen1Texto1}"/>
                                                <webuijsf:message id="messageComentariosDenRecoPen1"
                                                    for="campoComentariosDenRecoPen1"/>
                                                <webuijsf:helpInline id="helpInlineComentariosDenRecoPen1"
                                                    binding="#{Persona4.helpInlineComentariosDenRecoPen1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.comentarios_den_reco_pen"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridComentariosRegistroDenuPen1" rendered="#{Persona4.bitComentariosRegistroDenuPenRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona4.labelComentariosRegistroDenuPen1}"
                                                    id="labelComentariosRegistroDenuPen1"
                                                    for="campoComentariosRegistroDenuPen1"
                                                    text="comentarios registro denuncia pensi&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridComentariosRegistroDenuPen2" rendered="#{Persona4.bitComentariosRegistroDenuPenRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoComentariosRegistroDenuPen1"
                                                    binding="#{Persona4.campoComentariosRegistroDenuPen1}"
                                                    columns="50"
                                                     required="true"
                                                    text="#{Persona4.textoCampoComentariosRegistroDenuPen1}"
                                                    toolTip="BundleParametros.comentarios_registro_denu_pen"
                                                    validatorExpression="#{Persona4.validatorComentariosRegistroDenuPen1.validate}"/>
                                                <webuijsf:staticText id="campoComentariosRegistroDenuPen1Texto1"
                                                    binding="#{Persona4.campoComentariosRegistroDenuPen1Texto1}"/>
                                                <webuijsf:message id="messageComentariosRegistroDenuPen1"
                                                    for="campoComentariosRegistroDenuPen1"/>
                                                <webuijsf:helpInline id="helpInlineComentariosRegistroDenuPen1"
                                                    binding="#{Persona4.helpInlineComentariosRegistroDenuPen1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.comentarios_registro_denu_pen"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridComentariosConfDenuPen1" rendered="#{Persona4.bitComentariosConfDenuPenRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona4.labelComentariosConfDenuPen1}"
                                                    id="labelComentariosConfDenuPen1"
                                                    for="campoComentariosConfDenuPen1"
                                                    text="comentarios confirmaci&#243;n denuncia pensi&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridComentariosConfDenuPen2" rendered="#{Persona4.bitComentariosConfDenuPenRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoComentariosConfDenuPen1"
                                                    binding="#{Persona4.campoComentariosConfDenuPen1}"
                                                    columns="50"
                                                    text="#{Persona4.textoCampoComentariosConfDenuPen1}"
                                                    toolTip="BundleParametros.comentarios_conf_denu_pen"
                                                    validatorExpression="#{Persona4.validatorComentariosConfDenuPen1.validate}"/>
                                                <webuijsf:staticText id="campoComentariosConfDenuPen1Texto1"
                                                    binding="#{Persona4.campoComentariosConfDenuPen1Texto1}"/>
                                                <webuijsf:message id="messageComentariosConfDenuPen1"
                                                    for="campoComentariosConfDenuPen1"/>
                                                <webuijsf:helpInline id="helpInlineComentariosConfDenuPen1"
                                                    binding="#{Persona4.helpInlineComentariosConfDenuPen1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.comentarios_conf_denu_pen"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridComentariosDesDenuPen1" rendered="#{Persona4.bitComentariosDesDenuPenRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona4.labelComentariosDesDenuPen1}"
                                                    id="labelComentariosDesDenuPen1"
                                                    for="campoComentariosDesDenuPen1"
                                                    text="comentarios desmentido denuncia pensi&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridComentariosDesDenuPen2" rendered="#{Persona4.bitComentariosDesDenuPenRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoComentariosDesDenuPen1"
                                                    binding="#{Persona4.campoComentariosDesDenuPen1}"
                                                    columns="50"
                                                     required="true"
                                                    text="#{Persona4.textoCampoComentariosDesDenuPen1}"
                                                    toolTip="BundleParametros.comentarios_des_denu_pen"
                                                    validatorExpression="#{Persona4.validatorComentariosDesDenuPen1.validate}"/>
                                                <webuijsf:staticText id="campoComentariosDesDenuPen1Texto1"
                                                    binding="#{Persona4.campoComentariosDesDenuPen1Texto1}"/>
                                                <webuijsf:message id="messageComentariosDesDenuPen1"
                                                    for="campoComentariosDesDenuPen1"/>
                                                <webuijsf:helpInline id="helpInlineComentariosDesDenuPen1"
                                                    binding="#{Persona4.helpInlineComentariosDesDenuPen1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.comentarios_des_denu_pen"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaUltimoCobroPension1" rendered="#{Persona4.bitFechaUltimoCobroPensionRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona4.labelFechaUltimoCobroPension1}"
                                                    id="labelFechaUltimoCobroPension1"
                                                    for="campoFechaUltimoCobroPension1"
                                                    text="fecha ultimo cobro pensi&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaUltimoCobroPension2" rendered="#{Persona4.bitFechaUltimoCobroPensionRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaUltimoCobroPension1"
                                                    binding="#{Persona4.campoFechaUltimoCobroPension1}"
                                                    maxDate="#{Persona4.gestor.defaultMaxDate}"
                                                    minDate="#{Persona4.gestor.defaultMinDate}"
                                                     required="true"
                                                    selectedDate="#{Persona4.valorCampoFechaUltimoCobroPension1}"
                                                    toolTip="BundleParametros.fecha_ultimo_cobro_pension"/>
                                                <webuijsf:staticText id="campoFechaUltimoCobroPension1Texto1"
                                                    binding="#{Persona4.campoFechaUltimoCobroPension1Texto1}"/>
                                                <webuijsf:message id="messageFechaUltimoCobroPension1"
                                                    for="campoFechaUltimoCobroPension1"/>
                                                <webuijsf:helpInline id="helpInlineFechaUltimoCobroPension1"
                                                    binding="#{Persona4.helpInlineFechaUltimoCobroPension1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_ultimo_cobro_pension"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNotasAnulFecUltCobPen1" rendered="#{Persona4.bitNotasAnulFecUltCobPenRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona4.labelNotasAnulFecUltCobPen1}"
                                                    id="labelNotasAnulFecUltCobPen1"
                                                    for="campoNotasAnulFecUltCobPen1"
                                                    text="notas anulaci&#243;n fecha &#250;ltimo cobro pensi&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNotasAnulFecUltCobPen2" rendered="#{Persona4.bitNotasAnulFecUltCobPenRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNotasAnulFecUltCobPen1"
                                                    binding="#{Persona4.campoNotasAnulFecUltCobPen1}"
                                                    columns="50"
                                                     required="true"
                                                    text="#{Persona4.textoCampoNotasAnulFecUltCobPen1}"
                                                    toolTip="BundleParametros.notas_anul_fec_ult_cob_pen"
                                                    validatorExpression="#{Persona4.validatorNotasAnulFecUltCobPen1.validate}"/>
                                                <webuijsf:staticText id="campoNotasAnulFecUltCobPen1Texto1"
                                                    binding="#{Persona4.campoNotasAnulFecUltCobPen1Texto1}"/>
                                                <webuijsf:message id="messageNotasAnulFecUltCobPen1"
                                                    for="campoNotasAnulFecUltCobPen1"/>
                                                <webuijsf:helpInline id="helpInlineNotasAnulFecUltCobPen1"
                                                    binding="#{Persona4.helpInlineNotasAnulFecUltCobPen1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.notas_anul_fec_ult_cob_pen"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdDepartamento1" rendered="#{Persona4.bitIdDepartamentoRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona4.labelIdDepartamento1}"
                                                    id="labelIdDepartamento1"
                                                    for="campoIdDepartamento1"
                                                    text="departamento"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdDepartamento2" rendered="#{Persona4.bitIdDepartamentoRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdDepartamento1"
                                                    binding="#{Persona4.campoIdDepartamento1}"
                                                    text="#{Persona4.textoCampoIdDepartamento1}"
                                                    toolTip="#{Persona4.toolTipCampoIdDepartamento1}"
                                                    validatorExpression="#{Persona4.campoIdDepartamento1_validate}"/>
                                                <webuijsf:staticText id="campoIdDepartamento1Texto1"
                                                    binding="#{Persona4.campoIdDepartamento1Texto1}"/>
                                                <webuijsf:button id="campoIdDepartamento1Boton1"
                                                    binding="#{Persona4.campoIdDepartamento1Boton1}"
                                                    onClick="#{Persona4.scriptCampoIdDepartamento1Boton1}"/>
                                                <webuijsf:button id="campoIdDepartamento1Boton3"
                                                    binding="#{Persona4.campoIdDepartamento1Boton3}"
                                                    onClick="#{Persona4.scriptCampoIdDepartamento1Boton2}"
                                                    rendered="#{Persona4.bitCampoIdDepartamento1Boton3Rendered.on}"/>
                                                <webuijsf:message id="messageIdDepartamento1"
                                                    for="campoIdDepartamento1"/>
                                                <webuijsf:helpInline id="helpInlineIdDepartamento1"
                                                    binding="#{Persona4.helpInlineIdDepartamento1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_departamento"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdDepartamento3"
                                                rendered="#{Persona4.bitCampoIdDepartamento1Boton2Rendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona4.labelIdDepartamento2}"
                                                    id="labelIdDepartamento2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre departamento"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdDepartamento4"
                                                rendered="#{Persona4.bitCampoIdDepartamento1Boton2Rendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{Persona4.campoIdDepartamento1Texto2}"
                                                    id="campoIdDepartamento1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{Persona4.campoIdDepartamento1Boton2}"
                                                    id="campoIdDepartamento1Boton2"
                                                    onClick="#{Persona4.scriptCampoIdDepartamento1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdDistrito1" rendered="#{Persona4.bitIdDistritoRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona4.labelIdDistrito1}"
                                                    id="labelIdDistrito1"
                                                    for="campoIdDistrito1"
                                                    text="distrito"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdDistrito2" rendered="#{Persona4.bitIdDistritoRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdDistrito1"
                                                    binding="#{Persona4.campoIdDistrito1}"
                                                    text="#{Persona4.textoCampoIdDistrito1}"
                                                    toolTip="#{Persona4.toolTipCampoIdDistrito1}"
                                                    validatorExpression="#{Persona4.campoIdDistrito1_validate}"/>
                                                <webuijsf:staticText id="campoIdDistrito1Texto1"
                                                    binding="#{Persona4.campoIdDistrito1Texto1}"/>
                                                <webuijsf:button id="campoIdDistrito1Boton1"
                                                    binding="#{Persona4.campoIdDistrito1Boton1}"
                                                    onClick="#{Persona4.scriptCampoIdDistrito1Boton1}"/>
                                                <webuijsf:button id="campoIdDistrito1Boton3"
                                                    binding="#{Persona4.campoIdDistrito1Boton3}"
                                                    onClick="#{Persona4.scriptCampoIdDistrito1Boton2}"
                                                    rendered="#{Persona4.bitCampoIdDistrito1Boton3Rendered.on}"/>
                                                <webuijsf:message id="messageIdDistrito1"
                                                    for="campoIdDistrito1"/>
                                                <webuijsf:helpInline id="helpInlineIdDistrito1"
                                                    binding="#{Persona4.helpInlineIdDistrito1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_distrito"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdDistrito3"
                                                rendered="#{Persona4.bitCampoIdDistrito1Boton2Rendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona4.labelIdDistrito2}"
                                                    id="labelIdDistrito2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre distrito"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdDistrito4"
                                                rendered="#{Persona4.bitCampoIdDistrito1Boton2Rendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{Persona4.campoIdDistrito1Texto2}"
                                                    id="campoIdDistrito1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{Persona4.campoIdDistrito1Boton2}"
                                                    id="campoIdDistrito1Boton2"
                                                    onClick="#{Persona4.scriptCampoIdDistrito1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdBarrio1" rendered="#{Persona4.bitIdBarrioRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona4.labelIdBarrio1}"
                                                    id="labelIdBarrio1"
                                                    for="campoIdBarrio1"
                                                    text="barrio"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdBarrio2" rendered="#{Persona4.bitIdBarrioRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdBarrio1"
                                                    binding="#{Persona4.campoIdBarrio1}"
                                                    text="#{Persona4.textoCampoIdBarrio1}"
                                                    toolTip="#{Persona4.toolTipCampoIdBarrio1}"
                                                    validatorExpression="#{Persona4.campoIdBarrio1_validate}"/>
                                                <webuijsf:staticText id="campoIdBarrio1Texto1"
                                                    binding="#{Persona4.campoIdBarrio1Texto1}"/>
                                                <webuijsf:button id="campoIdBarrio1Boton1"
                                                    binding="#{Persona4.campoIdBarrio1Boton1}"
                                                    onClick="#{Persona4.scriptCampoIdBarrio1Boton1}"/>
                                                <webuijsf:button id="campoIdBarrio1Boton3"
                                                    binding="#{Persona4.campoIdBarrio1Boton3}"
                                                    onClick="#{Persona4.scriptCampoIdBarrio1Boton2}"
                                                    rendered="#{Persona4.bitCampoIdBarrio1Boton3Rendered.on}"/>
                                                <webuijsf:message id="messageIdBarrio1"
                                                    for="campoIdBarrio1"/>
                                                <webuijsf:helpInline id="helpInlineIdBarrio1"
                                                    binding="#{Persona4.helpInlineIdBarrio1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_barrio"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdBarrio3"
                                                rendered="#{Persona4.bitCampoIdBarrio1Boton2Rendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona4.labelIdBarrio2}"
                                                    id="labelIdBarrio2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre barrio"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdBarrio4"
                                                rendered="#{Persona4.bitCampoIdBarrio1Boton2Rendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{Persona4.campoIdBarrio1Texto2}"
                                                    id="campoIdBarrio1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{Persona4.campoIdBarrio1Boton2}"
                                                    id="campoIdBarrio1Boton2"
                                                    onClick="#{Persona4.scriptCampoIdBarrio1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaSolicitudPensionDesde1" rendered="#{Persona4.bitFechaSolicitudPensionDesdeRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona4.labelFechaSolicitudPensionDesde1}"
                                                    id="labelFechaSolicitudPensionDesde1"
                                                    for="campoFechaSolicitudPensionDesde1"
                                                    text="fecha solicitud pensi&#243;n desde"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaSolicitudPensionDesde2" rendered="#{Persona4.bitFechaSolicitudPensionDesdeRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaSolicitudPensionDesde1"
                                                    binding="#{Persona4.campoFechaSolicitudPensionDesde1}"
                                                    maxDate="#{Persona4.gestor.defaultMaxDate}"
                                                    minDate="#{Persona4.gestor.defaultMinDate}"
                                                    selectedDate="#{Persona4.valorCampoFechaSolicitudPensionDesde1}"
                                                    toolTip="BundleParametros.fecha_solicitud_pension_desde"/>
                                                <webuijsf:staticText id="campoFechaSolicitudPensionDesde1Texto1"
                                                    binding="#{Persona4.campoFechaSolicitudPensionDesde1Texto1}"/>
                                                <webuijsf:message id="messageFechaSolicitudPensionDesde1"
                                                    for="campoFechaSolicitudPensionDesde1"/>
                                                <webuijsf:helpInline id="helpInlineFechaSolicitudPensionDesde1"
                                                    binding="#{Persona4.helpInlineFechaSolicitudPensionDesde1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_solicitud_pension_desde"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaSolicitudPensionHasta1" rendered="#{Persona4.bitFechaSolicitudPensionHastaRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona4.labelFechaSolicitudPensionHasta1}"
                                                    id="labelFechaSolicitudPensionHasta1"
                                                    for="campoFechaSolicitudPensionHasta1"
                                                    text="fecha solicitud pensi&#243;n hasta"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaSolicitudPensionHasta2" rendered="#{Persona4.bitFechaSolicitudPensionHastaRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaSolicitudPensionHasta1"
                                                    binding="#{Persona4.campoFechaSolicitudPensionHasta1}"
                                                    maxDate="#{Persona4.gestor.defaultMaxDate}"
                                                    minDate="#{Persona4.gestor.defaultMinDate}"
                                                    selectedDate="#{Persona4.valorCampoFechaSolicitudPensionHasta1}"
                                                    toolTip="BundleParametros.fecha_solicitud_pension_hasta"/>
                                                <webuijsf:staticText id="campoFechaSolicitudPensionHasta1Texto1"
                                                    binding="#{Persona4.campoFechaSolicitudPensionHasta1Texto1}"/>
                                                <webuijsf:message id="messageFechaSolicitudPensionHasta1"
                                                    for="campoFechaSolicitudPensionHasta1"/>
                                                <webuijsf:helpInline id="helpInlineFechaSolicitudPensionHasta1"
                                                    binding="#{Persona4.helpInlineFechaSolicitudPensionHasta1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_solicitud_pension_hasta"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaAprobacionPensionDesde1" rendered="#{Persona4.bitFechaAprobacionPensionDesdeRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona4.labelFechaAprobacionPensionDesde1}"
                                                    id="labelFechaAprobacionPensionDesde1"
                                                    for="campoFechaAprobacionPensionDesde1"
                                                    text="fecha aprobaci&#243;n pensi&#243;n desde"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaAprobacionPensionDesde2" rendered="#{Persona4.bitFechaAprobacionPensionDesdeRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaAprobacionPensionDesde1"
                                                    binding="#{Persona4.campoFechaAprobacionPensionDesde1}"
                                                    maxDate="#{Persona4.gestor.defaultMaxDate}"
                                                    minDate="#{Persona4.gestor.defaultMinDate}"
                                                    selectedDate="#{Persona4.valorCampoFechaAprobacionPensionDesde1}"
                                                    toolTip="BundleParametros.fecha_aprobacion_pension_desde"/>
                                                <webuijsf:staticText id="campoFechaAprobacionPensionDesde1Texto1"
                                                    binding="#{Persona4.campoFechaAprobacionPensionDesde1Texto1}"/>
                                                <webuijsf:message id="messageFechaAprobacionPensionDesde1"
                                                    for="campoFechaAprobacionPensionDesde1"/>
                                                <webuijsf:helpInline id="helpInlineFechaAprobacionPensionDesde1"
                                                    binding="#{Persona4.helpInlineFechaAprobacionPensionDesde1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_aprobacion_pension_desde"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaAprobacionPensionHasta1" rendered="#{Persona4.bitFechaAprobacionPensionHastaRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona4.labelFechaAprobacionPensionHasta1}"
                                                    id="labelFechaAprobacionPensionHasta1"
                                                    for="campoFechaAprobacionPensionHasta1"
                                                    text="fecha aprobaci&#243;n pensi&#243;n hasta"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaAprobacionPensionHasta2" rendered="#{Persona4.bitFechaAprobacionPensionHastaRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaAprobacionPensionHasta1"
                                                    binding="#{Persona4.campoFechaAprobacionPensionHasta1}"
                                                    maxDate="#{Persona4.gestor.defaultMaxDate}"
                                                    minDate="#{Persona4.gestor.defaultMinDate}"
                                                    selectedDate="#{Persona4.valorCampoFechaAprobacionPensionHasta1}"
                                                    toolTip="BundleParametros.fecha_aprobacion_pension_hasta"/>
                                                <webuijsf:staticText id="campoFechaAprobacionPensionHasta1Texto1"
                                                    binding="#{Persona4.campoFechaAprobacionPensionHasta1Texto1}"/>
                                                <webuijsf:message id="messageFechaAprobacionPensionHasta1"
                                                    for="campoFechaAprobacionPensionHasta1"/>
                                                <webuijsf:helpInline id="helpInlineFechaAprobacionPensionHasta1"
                                                    binding="#{Persona4.helpInlineFechaAprobacionPensionHasta1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_aprobacion_pension_hasta"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaDenegacionPensionDesde1" rendered="#{Persona4.bitFechaDenegacionPensionDesdeRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona4.labelFechaDenegacionPensionDesde1}"
                                                    id="labelFechaDenegacionPensionDesde1"
                                                    for="campoFechaDenegacionPensionDesde1"
                                                    text="fecha denegaci&#243;n pensi&#243;n desde"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaDenegacionPensionDesde2" rendered="#{Persona4.bitFechaDenegacionPensionDesdeRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaDenegacionPensionDesde1"
                                                    binding="#{Persona4.campoFechaDenegacionPensionDesde1}"
                                                    maxDate="#{Persona4.gestor.defaultMaxDate}"
                                                    minDate="#{Persona4.gestor.defaultMinDate}"
                                                    selectedDate="#{Persona4.valorCampoFechaDenegacionPensionDesde1}"
                                                    toolTip="BundleParametros.fecha_denegacion_pension_desde"/>
                                                <webuijsf:staticText id="campoFechaDenegacionPensionDesde1Texto1"
                                                    binding="#{Persona4.campoFechaDenegacionPensionDesde1Texto1}"/>
                                                <webuijsf:message id="messageFechaDenegacionPensionDesde1"
                                                    for="campoFechaDenegacionPensionDesde1"/>
                                                <webuijsf:helpInline id="helpInlineFechaDenegacionPensionDesde1"
                                                    binding="#{Persona4.helpInlineFechaDenegacionPensionDesde1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_denegacion_pension_desde"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaDenegacionPensionHasta1" rendered="#{Persona4.bitFechaDenegacionPensionHastaRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona4.labelFechaDenegacionPensionHasta1}"
                                                    id="labelFechaDenegacionPensionHasta1"
                                                    for="campoFechaDenegacionPensionHasta1"
                                                    text="fecha denegaci&#243;n pensi&#243;n hasta"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaDenegacionPensionHasta2" rendered="#{Persona4.bitFechaDenegacionPensionHastaRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaDenegacionPensionHasta1"
                                                    binding="#{Persona4.campoFechaDenegacionPensionHasta1}"
                                                    maxDate="#{Persona4.gestor.defaultMaxDate}"
                                                    minDate="#{Persona4.gestor.defaultMinDate}"
                                                    selectedDate="#{Persona4.valorCampoFechaDenegacionPensionHasta1}"
                                                    toolTip="BundleParametros.fecha_denegacion_pension_hasta"/>
                                                <webuijsf:staticText id="campoFechaDenegacionPensionHasta1Texto1"
                                                    binding="#{Persona4.campoFechaDenegacionPensionHasta1Texto1}"/>
                                                <webuijsf:message id="messageFechaDenegacionPensionHasta1"
                                                    for="campoFechaDenegacionPensionHasta1"/>
                                                <webuijsf:helpInline id="helpInlineFechaDenegacionPensionHasta1"
                                                    binding="#{Persona4.helpInlineFechaDenegacionPensionHasta1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_denegacion_pension_hasta"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaRevocacionPensionDesde1" rendered="#{Persona4.bitFechaRevocacionPensionDesdeRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona4.labelFechaRevocacionPensionDesde1}"
                                                    id="labelFechaRevocacionPensionDesde1"
                                                    for="campoFechaRevocacionPensionDesde1"
                                                    text="fecha revocaci&#243;n pensi&#243;n desde"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaRevocacionPensionDesde2" rendered="#{Persona4.bitFechaRevocacionPensionDesdeRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaRevocacionPensionDesde1"
                                                    binding="#{Persona4.campoFechaRevocacionPensionDesde1}"
                                                    maxDate="#{Persona4.gestor.defaultMaxDate}"
                                                    minDate="#{Persona4.gestor.defaultMinDate}"
                                                    selectedDate="#{Persona4.valorCampoFechaRevocacionPensionDesde1}"
                                                    toolTip="BundleParametros.fecha_revocacion_pension_desde"/>
                                                <webuijsf:staticText id="campoFechaRevocacionPensionDesde1Texto1"
                                                    binding="#{Persona4.campoFechaRevocacionPensionDesde1Texto1}"/>
                                                <webuijsf:message id="messageFechaRevocacionPensionDesde1"
                                                    for="campoFechaRevocacionPensionDesde1"/>
                                                <webuijsf:helpInline id="helpInlineFechaRevocacionPensionDesde1"
                                                    binding="#{Persona4.helpInlineFechaRevocacionPensionDesde1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_revocacion_pension_desde"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaRevocacionPensionHasta1" rendered="#{Persona4.bitFechaRevocacionPensionHastaRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona4.labelFechaRevocacionPensionHasta1}"
                                                    id="labelFechaRevocacionPensionHasta1"
                                                    for="campoFechaRevocacionPensionHasta1"
                                                    text="fecha revocaci&#243;n pensi&#243;n hasta"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaRevocacionPensionHasta2" rendered="#{Persona4.bitFechaRevocacionPensionHastaRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaRevocacionPensionHasta1"
                                                    binding="#{Persona4.campoFechaRevocacionPensionHasta1}"
                                                    maxDate="#{Persona4.gestor.defaultMaxDate}"
                                                    minDate="#{Persona4.gestor.defaultMinDate}"
                                                    selectedDate="#{Persona4.valorCampoFechaRevocacionPensionHasta1}"
                                                    toolTip="BundleParametros.fecha_revocacion_pension_hasta"/>
                                                <webuijsf:staticText id="campoFechaRevocacionPensionHasta1Texto1"
                                                    binding="#{Persona4.campoFechaRevocacionPensionHasta1Texto1}"/>
                                                <webuijsf:message id="messageFechaRevocacionPensionHasta1"
                                                    for="campoFechaRevocacionPensionHasta1"/>
                                                <webuijsf:helpInline id="helpInlineFechaRevocacionPensionHasta1"
                                                    binding="#{Persona4.helpInlineFechaRevocacionPensionHasta1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_revocacion_pension_hasta"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaOtorgamientoPenDesde1" rendered="#{Persona4.bitFechaOtorgamientoPenDesdeRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona4.labelFechaOtorgamientoPenDesde1}"
                                                    id="labelFechaOtorgamientoPenDesde1"
                                                    for="campoFechaOtorgamientoPenDesde1"
                                                    text="fecha otorgamiento pensi&#243;n desde"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaOtorgamientoPenDesde2" rendered="#{Persona4.bitFechaOtorgamientoPenDesdeRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaOtorgamientoPenDesde1"
                                                    binding="#{Persona4.campoFechaOtorgamientoPenDesde1}"
                                                    maxDate="#{Persona4.gestor.defaultMaxDate}"
                                                    minDate="#{Persona4.gestor.defaultMinDate}"
                                                    selectedDate="#{Persona4.valorCampoFechaOtorgamientoPenDesde1}"
                                                    toolTip="BundleParametros.fecha_otorgamiento_pen_desde"/>
                                                <webuijsf:staticText id="campoFechaOtorgamientoPenDesde1Texto1"
                                                    binding="#{Persona4.campoFechaOtorgamientoPenDesde1Texto1}"/>
                                                <webuijsf:message id="messageFechaOtorgamientoPenDesde1"
                                                    for="campoFechaOtorgamientoPenDesde1"/>
                                                <webuijsf:helpInline id="helpInlineFechaOtorgamientoPenDesde1"
                                                    binding="#{Persona4.helpInlineFechaOtorgamientoPenDesde1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_otorgamiento_pen_desde"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaOtorgamientoPenHasta1" rendered="#{Persona4.bitFechaOtorgamientoPenHastaRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona4.labelFechaOtorgamientoPenHasta1}"
                                                    id="labelFechaOtorgamientoPenHasta1"
                                                    for="campoFechaOtorgamientoPenHasta1"
                                                    text="fecha otorgamiento pensi&#243;n hasta"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaOtorgamientoPenHasta2" rendered="#{Persona4.bitFechaOtorgamientoPenHastaRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaOtorgamientoPenHasta1"
                                                    binding="#{Persona4.campoFechaOtorgamientoPenHasta1}"
                                                    maxDate="#{Persona4.gestor.defaultMaxDate}"
                                                    minDate="#{Persona4.gestor.defaultMinDate}"
                                                    selectedDate="#{Persona4.valorCampoFechaOtorgamientoPenHasta1}"
                                                    toolTip="BundleParametros.fecha_otorgamiento_pen_hasta"/>
                                                <webuijsf:staticText id="campoFechaOtorgamientoPenHasta1Texto1"
                                                    binding="#{Persona4.campoFechaOtorgamientoPenHasta1Texto1}"/>
                                                <webuijsf:message id="messageFechaOtorgamientoPenHasta1"
                                                    for="campoFechaOtorgamientoPenHasta1"/>
                                                <webuijsf:helpInline id="helpInlineFechaOtorgamientoPenHasta1"
                                                    binding="#{Persona4.helpInlineFechaOtorgamientoPenHasta1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_otorgamiento_pen_hasta"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaHoraUltActJupeDesde1" rendered="#{Persona4.bitFechaHoraUltActJupeDesdeRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona4.labelFechaHoraUltActJupeDesde1}"
                                                    id="labelFechaHoraUltActJupeDesde1"
                                                    for="campoFechaHoraUltActJupeDesde1"
                                                    text="fecha hora &#250;ltima actualizaci&#243;n jupe desde"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaHoraUltActJupeDesde2" rendered="#{Persona4.bitFechaHoraUltActJupeDesdeRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoFechaHoraUltActJupeDesde1"
                                                    binding="#{Persona4.campoFechaHoraUltActJupeDesde1}"
                                                    converter="#{Persona4.converterFechaHoraUltActJupeDesde1}"
                                                    text="#{Persona4.valorCampoFechaHoraUltActJupeDesde1}"
                                                    toolTip="BundleParametros.fecha_hora_ult_act_jupe_desde"/>
                                                <webuijsf:staticText id="campoFechaHoraUltActJupeDesde1Texto1"
                                                    binding="#{Persona4.campoFechaHoraUltActJupeDesde1Texto1}"/>
                                                <webuijsf:message id="messageFechaHoraUltActJupeDesde1"
                                                    for="campoFechaHoraUltActJupeDesde1"/>
                                                <webuijsf:helpInline id="helpInlineFechaHoraUltActJupeDesde1"
                                                    binding="#{Persona4.helpInlineFechaHoraUltActJupeDesde1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_hora_ult_act_jupe_desde"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaHoraUltActJupeHasta1" rendered="#{Persona4.bitFechaHoraUltActJupeHastaRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona4.labelFechaHoraUltActJupeHasta1}"
                                                    id="labelFechaHoraUltActJupeHasta1"
                                                    for="campoFechaHoraUltActJupeHasta1"
                                                    text="fecha hora &#250;ltima actualizaci&#243;n jupe hasta"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaHoraUltActJupeHasta2" rendered="#{Persona4.bitFechaHoraUltActJupeHastaRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoFechaHoraUltActJupeHasta1"
                                                    binding="#{Persona4.campoFechaHoraUltActJupeHasta1}"
                                                    converter="#{Persona4.converterFechaHoraUltActJupeHasta1}"
                                                    text="#{Persona4.valorCampoFechaHoraUltActJupeHasta1}"
                                                    toolTip="BundleParametros.fecha_hora_ult_act_jupe_hasta"/>
                                                <webuijsf:staticText id="campoFechaHoraUltActJupeHasta1Texto1"
                                                    binding="#{Persona4.campoFechaHoraUltActJupeHasta1Texto1}"/>
                                                <webuijsf:message id="messageFechaHoraUltActJupeHasta1"
                                                    for="campoFechaHoraUltActJupeHasta1"/>
                                                <webuijsf:helpInline id="helpInlineFechaHoraUltActJupeHasta1"
                                                    binding="#{Persona4.helpInlineFechaHoraUltActJupeHasta1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_hora_ult_act_jupe_hasta"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPanel111"
                                                styleClass="pdq-grid-detalle-botones">
                                                <h:panelGrid 
                                                    id="gridPanel112">
                                                    <webuijsf:anchor 
                                                        id="ancla2"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPanel113"
                                                styleClass="pdq-grid-detalle-mensajes">
                                                <webuijsf:staticText
                                                    id="textoMensaje1"
                                                    style="font-weight: bold"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <h:panelGrid 
                                            id="gridPanel114">
                                            <h:panelGrid 
                                                id="gridPanel115">
                                                <webuijsf:anchor 
                                                    id="anchor1"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="2" 
                                                id="gridPanel116">
                                                <webuijsf:button
                                                    actionExpression="#{Persona4.botonAplicar1_action}"
                                                    binding="#{Persona4.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    styleClass="pdq-button-1"
                                                    text="#{Persona4.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{Persona4.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Persona4.botonProcesar1_action}"
                                                    binding="#{Persona4.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    styleClass="pdq-button-1"
                                                    text="#{Persona4.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{Persona4.gestor.i18n.toolTipBotonProcesar}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                    </h:panelGrid>
                                </div>
                                <div class="pos-div-pie-3">
                                    <jsp:directive.include file="FragmentoPie3.jspf"/>
                                </div>
                            </div>
                            <div class="pos-div-join">
                                <jsp:directive.include file="FragmentoJoin.jspf"/>
                            </div>
                        </div>
                        <div class="pos-div-pie-2">
                            <jsp:directive.include file="FragmentoPie2.jspf"/>
                        </div>
                        <div class="pos-div-pie-1">
                            <jsp:directive.include file="FragmentoPie1.jspf"/>
                        </div>
                        <webuijsf:anchor id="anclaPie1"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
