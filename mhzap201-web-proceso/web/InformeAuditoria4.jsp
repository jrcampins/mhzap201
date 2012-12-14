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
                    focus="#{InformeAuditoria4.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{InformeAuditoria4.gestor.preserveFocus}"
                    preserveScroll="#{InformeAuditoria4.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{InformeAuditoria4.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | listaFuncionAccion1 campoFechaTransaccionDesde1 campoFechaTransaccionHasta1 | , virtualForm2 | | , virtualForm3 | listaFuncionAccion1 | listaFuncionAccion1 , virtualForm4 | | ">
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
                                        binding="#{InformeAuditoria4.breadcrumbs1}" 
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
                                                    rendered="#{InformeAuditoria4.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{InformeAuditoria4.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{InformeAuditoria4.gestor.mensajeDisponible}"
                                                    text="#{InformeAuditoria4.gestor.mensaje}"
                                                    url="#{InformeAuditoria4.gestor.urlAnclaPie1}"/>
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
                                                    binding="#{InformeAuditoria4.etiquetaListaFuncionAccion1}"
                                                    id="etiquetaListaFuncionAccion1"
                                                    for="listaFuncionAccion1"
                                                    text="#{InformeAuditoria4.gestor.i18n.textoEtiquetaListaFuncionAccion}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel110"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown
                                                    binding="#{InformeAuditoria4.listaFuncionAccion1}"
                                                    converter="#{InformeAuditoria4.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{InformeAuditoria4.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme4_2.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    required="true"
                                                    selected="#{InformeAuditoria4.gestor.valorListaFuncionAccion1}"
                                                    toolTip="#{InformeAuditoria4.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:staticText
                                                    binding="#{InformeAuditoria4.listaFuncionAccion1Texto1}"
                                                    id="listaFuncionAccion1Texto1"/>
                                                <webuijsf:message
                                                    for="listaFuncionAccion1"
                                                    id="messageListaFuncionAccion1"/>
                                                <webuijsf:helpInline
                                                    binding="#{InformeAuditoria4.helpInlineListaFuncionAccion1}"
                                                    id="helpInlineListaFuncionAccion1"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-page"
                                                    text="#{InformeAuditoria4.gestor.i18n.inlineHelpListaFuncionAccion}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaTransaccionDesde1" rendered="#{InformeAuditoria4.bitFechaTransaccionDesdeRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{InformeAuditoria4.labelFechaTransaccionDesde1}"
                                                    id="labelFechaTransaccionDesde1"
                                                    for="campoFechaTransaccionDesde1"
                                                    text="fecha transacci&#243;n desde"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaTransaccionDesde2" rendered="#{InformeAuditoria4.bitFechaTransaccionDesdeRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaTransaccionDesde1"
                                                    binding="#{InformeAuditoria4.campoFechaTransaccionDesde1}"
                                                    maxDate="#{InformeAuditoria4.gestor.defaultMaxDate}"
                                                    minDate="#{InformeAuditoria4.gestor.defaultMinDate}"
                                                    selectedDate="#{InformeAuditoria4.valorCampoFechaTransaccionDesde1}"
                                                    toolTip="BundleParametros.fecha_transaccion_desde"/>
                                                <webuijsf:staticText id="campoFechaTransaccionDesde1Texto1"
                                                    binding="#{InformeAuditoria4.campoFechaTransaccionDesde1Texto1}"/>
                                                <webuijsf:message id="messageFechaTransaccionDesde1"
                                                    for="campoFechaTransaccionDesde1"/>
                                                <webuijsf:helpInline id="helpInlineFechaTransaccionDesde1"
                                                    binding="#{InformeAuditoria4.helpInlineFechaTransaccionDesde1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_transaccion_desde"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaTransaccionHasta1" rendered="#{InformeAuditoria4.bitFechaTransaccionHastaRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{InformeAuditoria4.labelFechaTransaccionHasta1}"
                                                    id="labelFechaTransaccionHasta1"
                                                    for="campoFechaTransaccionHasta1"
                                                    text="fecha transacci&#243;n hasta"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaTransaccionHasta2" rendered="#{InformeAuditoria4.bitFechaTransaccionHastaRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaTransaccionHasta1"
                                                    binding="#{InformeAuditoria4.campoFechaTransaccionHasta1}"
                                                    maxDate="#{InformeAuditoria4.gestor.defaultMaxDate}"
                                                    minDate="#{InformeAuditoria4.gestor.defaultMinDate}"
                                                    selectedDate="#{InformeAuditoria4.valorCampoFechaTransaccionHasta1}"
                                                    toolTip="BundleParametros.fecha_transaccion_hasta"/>
                                                <webuijsf:staticText id="campoFechaTransaccionHasta1Texto1"
                                                    binding="#{InformeAuditoria4.campoFechaTransaccionHasta1Texto1}"/>
                                                <webuijsf:message id="messageFechaTransaccionHasta1"
                                                    for="campoFechaTransaccionHasta1"/>
                                                <webuijsf:helpInline id="helpInlineFechaTransaccionHasta1"
                                                    binding="#{InformeAuditoria4.helpInlineFechaTransaccionHasta1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_transaccion_hasta"
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
                                                    actionExpression="#{InformeAuditoria4.botonAplicar1_action}"
                                                    binding="#{InformeAuditoria4.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    styleClass="pdq-button-1"
                                                    text="#{InformeAuditoria4.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{InformeAuditoria4.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{InformeAuditoria4.botonProcesar1_action}"
                                                    binding="#{InformeAuditoria4.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    styleClass="pdq-button-1"
                                                    text="#{InformeAuditoria4.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{InformeAuditoria4.gestor.i18n.toolTipBotonProcesar}"/>
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
