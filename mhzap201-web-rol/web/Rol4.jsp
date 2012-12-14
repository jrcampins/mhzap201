<?xml version="1.0" encoding="UTF-8"?>
<!--
   Copyright (C) 2008, EGT Consultores, C.A.
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
                    focus="#{Rol4.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{Rol4.gestor.preserveFocus}"
                    preserveScroll="#{Rol4.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{Rol4.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | listaFuncionAccion1 campoIdRol1 campoCodigoRol1 campoNombreRol1 campoIdConjuntoSegmento1 listaEsSegmentada1 | , virtualForm2 | | , virtualForm3 | listaFuncionAccion1 | listaFuncionAccion1 , virtualForm4 | | ">
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
                                        binding="#{Rol4.breadcrumbs1}" 
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
                                                    rendered="#{Rol4.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{Rol4.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{Rol4.gestor.mensajeDisponible}"
                                                    text="#{Rol4.gestor.mensaje}"
                                                    url="#{Rol4.gestor.urlAnclaPie1}"/>
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
                                                    binding="#{Rol4.etiquetaListaFuncionAccion1}"
                                                    id="etiquetaListaFuncionAccion1"
                                                    for="listaFuncionAccion1"
                                                    text="#{Rol4.gestor.i18n.textoEtiquetaListaFuncionAccion}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel110"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown
                                                    binding="#{Rol4.listaFuncionAccion1}"
                                                    converter="#{Rol4.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{Rol4.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme4_2.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    required="true"
                                                    selected="#{Rol4.gestor.valorListaFuncionAccion1}"
                                                    toolTip="#{Rol4.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:staticText
                                                    binding="#{Rol4.listaFuncionAccion1Texto1}"
                                                    id="listaFuncionAccion1Texto1"/>
                                                <webuijsf:message
                                                    for="listaFuncionAccion1"
                                                    id="messageListaFuncionAccion1"/>
                                                <webuijsf:helpInline
                                                    binding="#{Rol4.helpInlineListaFuncionAccion1}"
                                                    id="helpInlineListaFuncionAccion1"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-page"
                                                    text="#{Rol4.gestor.i18n.inlineHelpListaFuncionAccion}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdRol1" rendered="#{Rol4.bitIdRolRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Rol4.labelIdRol1}"
                                                    id="labelIdRol1"
                                                    for="campoIdRol1"
                                                    text="rol"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdRol2" rendered="#{Rol4.bitIdRolRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdRol1"
                                                    binding="#{Rol4.campoIdRol1}"
                                                     required="true"
                                                    text="#{Rol4.textoCampoIdRol1}"
                                                    toolTip="#{Rol4.toolTipCampoIdRol1}"
                                                    validatorExpression="#{Rol4.campoIdRol1_validate}"/>
                                                <webuijsf:staticText id="campoIdRol1Texto1"
                                                    binding="#{Rol4.campoIdRol1Texto1}"/>
                                                <webuijsf:button id="campoIdRol1Boton1"
                                                    binding="#{Rol4.campoIdRol1Boton1}"
                                                    onClick="#{Rol4.scriptCampoIdRol1Boton1}"/>
                                                <webuijsf:button id="campoIdRol1Boton3"
                                                    binding="#{Rol4.campoIdRol1Boton3}"
                                                    onClick="#{Rol4.scriptCampoIdRol1Boton2}"
                                                    rendered="#{Rol4.bitCampoIdRol1Boton3Rendered.on}"/>
                                                <webuijsf:message id="messageIdRol1"
                                                    for="campoIdRol1"/>
                                                <webuijsf:helpInline id="helpInlineIdRol1"
                                                    binding="#{Rol4.helpInlineIdRol1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_rol"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdRol3"
                                                rendered="#{Rol4.bitCampoIdRol1Boton2Rendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Rol4.labelIdRol2}"
                                                    id="labelIdRol2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdRol4"
                                                rendered="#{Rol4.bitCampoIdRol1Boton2Rendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{Rol4.campoIdRol1Texto2}"
                                                    id="campoIdRol1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{Rol4.campoIdRol1Boton2}"
                                                    id="campoIdRol1Boton2"
                                                    onClick="#{Rol4.scriptCampoIdRol1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridCodigoRol1" rendered="#{Rol4.bitCodigoRolRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Rol4.labelCodigoRol1}"
                                                    id="labelCodigoRol1"
                                                    for="campoCodigoRol1"
                                                    text="c&#243;digo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridCodigoRol2" rendered="#{Rol4.bitCodigoRolRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoCodigoRol1"
                                                    binding="#{Rol4.campoCodigoRol1}"
                                                    columns="50"
                                                     required="true"
                                                    text="#{Rol4.textoCampoCodigoRol1}"
                                                    toolTip="BundleParametros.codigo_rol"
                                                    validatorExpression="#{Rol4.validatorCodigoRol1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoRol1Texto1"
                                                    binding="#{Rol4.campoCodigoRol1Texto1}"/>
                                                <webuijsf:message id="messageCodigoRol1"
                                                    for="campoCodigoRol1"/>
                                                <webuijsf:helpInline id="helpInlineCodigoRol1"
                                                    binding="#{Rol4.helpInlineCodigoRol1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.codigo_rol"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNombreRol1" rendered="#{Rol4.bitNombreRolRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Rol4.labelNombreRol1}"
                                                    id="labelNombreRol1"
                                                    for="campoNombreRol1"
                                                    text="nombre"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNombreRol2" rendered="#{Rol4.bitNombreRolRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNombreRol1"
                                                    binding="#{Rol4.campoNombreRol1}"
                                                    columns="50"
                                                    text="#{Rol4.textoCampoNombreRol1}"
                                                    toolTip="BundleParametros.nombre_rol"
                                                    validatorExpression="#{Rol4.validatorNombreRol1.validate}"/>
                                                <webuijsf:staticText id="campoNombreRol1Texto1"
                                                    binding="#{Rol4.campoNombreRol1Texto1}"/>
                                                <webuijsf:message id="messageNombreRol1"
                                                    for="campoNombreRol1"/>
                                                <webuijsf:helpInline id="helpInlineNombreRol1"
                                                    binding="#{Rol4.helpInlineNombreRol1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.nombre_rol"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdConjuntoSegmento1" rendered="#{Rol4.bitIdConjuntoSegmentoRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Rol4.labelIdConjuntoSegmento1}"
                                                    id="labelIdConjuntoSegmento1"
                                                    for="campoIdConjuntoSegmento1"
                                                    text="conjunto segmento"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdConjuntoSegmento2" rendered="#{Rol4.bitIdConjuntoSegmentoRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdConjuntoSegmento1"
                                                    binding="#{Rol4.campoIdConjuntoSegmento1}"
                                                     required="true"
                                                    text="#{Rol4.textoCampoIdConjuntoSegmento1}"
                                                    toolTip="#{Rol4.toolTipCampoIdConjuntoSegmento1}"
                                                    validatorExpression="#{Rol4.campoIdConjuntoSegmento1_validate}"/>
                                                <webuijsf:staticText id="campoIdConjuntoSegmento1Texto1"
                                                    binding="#{Rol4.campoIdConjuntoSegmento1Texto1}"/>
                                                <webuijsf:button id="campoIdConjuntoSegmento1Boton1"
                                                    binding="#{Rol4.campoIdConjuntoSegmento1Boton1}"
                                                    onClick="#{Rol4.scriptCampoIdConjuntoSegmento1Boton1}"/>
                                                <webuijsf:button id="campoIdConjuntoSegmento1Boton3"
                                                    binding="#{Rol4.campoIdConjuntoSegmento1Boton3}"
                                                    onClick="#{Rol4.scriptCampoIdConjuntoSegmento1Boton2}"
                                                    rendered="#{Rol4.bitCampoIdConjuntoSegmento1Boton3Rendered.on}"/>
                                                <webuijsf:message id="messageIdConjuntoSegmento1"
                                                    for="campoIdConjuntoSegmento1"/>
                                                <webuijsf:helpInline id="helpInlineIdConjuntoSegmento1"
                                                    binding="#{Rol4.helpInlineIdConjuntoSegmento1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_conjunto_segmento"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdConjuntoSegmento3"
                                                rendered="#{Rol4.bitCampoIdConjuntoSegmento1Boton2Rendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Rol4.labelIdConjuntoSegmento2}"
                                                    id="labelIdConjuntoSegmento2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre conjunto segmento"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdConjuntoSegmento4"
                                                rendered="#{Rol4.bitCampoIdConjuntoSegmento1Boton2Rendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{Rol4.campoIdConjuntoSegmento1Texto2}"
                                                    id="campoIdConjuntoSegmento1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{Rol4.campoIdConjuntoSegmento1Boton2}"
                                                    id="campoIdConjuntoSegmento1Boton2"
                                                    onClick="#{Rol4.scriptCampoIdConjuntoSegmento1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsSegmentada1" rendered="#{Rol4.bitEsSegmentadaRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Rol4.labelEsSegmentada1}"
                                                    id="labelEsSegmentada1"
                                                    for="listaEsSegmentada1"
                                                    text="segmentada"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsSegmentada2" rendered="#{Rol4.bitEsSegmentadaRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsSegmentada1"
                                                    binding="#{Rol4.listaEsSegmentada1}"
                                                    converter="#{Rol4.converterEsSegmentada1}"
                                                    items="#{Rol4.opcionesListaEsSegmentada1}"
                                                     required="true"
                                                    selected="#{Rol4.valorListaEsSegmentada1}"
                                                    toolTip="BundleParametros.es_segmentada"/>
                                                <webuijsf:staticText id="listaEsSegmentada1Texto1"
                                                    binding="#{Rol4.listaEsSegmentada1Texto1}"/>
                                                <webuijsf:message id="messageEsSegmentada1"
                                                    for="listaEsSegmentada1"/>
                                                <webuijsf:helpInline id="helpInlineEsSegmentada1"
                                                    binding="#{Rol4.helpInlineEsSegmentada1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_segmentada"
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
                                                    actionExpression="#{Rol4.botonAplicar1_action}"
                                                    binding="#{Rol4.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    styleClass="pdq-button-1"
                                                    text="#{Rol4.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{Rol4.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Rol4.botonProcesar1_action}"
                                                    binding="#{Rol4.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    styleClass="pdq-button-1"
                                                    text="#{Rol4.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{Rol4.gestor.i18n.toolTipBotonProcesar}"/>
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
