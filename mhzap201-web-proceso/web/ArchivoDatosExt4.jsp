<?xml version="1.0" encoding="UTF-8"?>
<!--
   Copyright (C) 2010, EGT Consultores, C.A.
   Este archivo fue totalmente generado utilizando herramientas de software de EGT Consultores, C.A.
   En consecuencia, partes del archivo podrian ser similares o hasta iguales a las de archivos de
   programas de otros clientes, generados por las mismas herramientas; por lo tanto, esta similitud
   no podra ser considerada como violacion del copyright.
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
                    focus="#{ArchivoDatosExt4.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{ArchivoDatosExt4.gestor.preserveFocus}"
                    preserveScroll="#{ArchivoDatosExt4.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{ArchivoDatosExt4.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | listaFuncionAccion1 campoIdArchivoDatosExt1 campoNombreArchivoDatosExt1 | , virtualForm2 | | , virtualForm3 | listaFuncionAccion1 | listaFuncionAccion1 , virtualForm4 | | ">
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
                                        binding="#{ArchivoDatosExt4.breadcrumbs1}" 
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
                                                    rendered="#{ArchivoDatosExt4.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{ArchivoDatosExt4.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{ArchivoDatosExt4.gestor.mensajeDisponible}"
                                                    text="#{ArchivoDatosExt4.gestor.mensaje}"
                                                    url="#{ArchivoDatosExt4.gestor.urlAnclaPie1}"/>
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
                                                    binding="#{ArchivoDatosExt4.etiquetaListaFuncionAccion1}"
                                                    id="etiquetaListaFuncionAccion1"
                                                    for="listaFuncionAccion1"
                                                    text="#{ArchivoDatosExt4.gestor.i18n.textoEtiquetaListaFuncionAccion}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel110"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown
                                                    binding="#{ArchivoDatosExt4.listaFuncionAccion1}"
                                                    converter="#{ArchivoDatosExt4.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{ArchivoDatosExt4.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme4_2.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    required="true"
                                                    selected="#{ArchivoDatosExt4.gestor.valorListaFuncionAccion1}"
                                                    toolTip="#{ArchivoDatosExt4.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:staticText
                                                    binding="#{ArchivoDatosExt4.listaFuncionAccion1Texto1}"
                                                    id="listaFuncionAccion1Texto1"/>
                                                <webuijsf:message
                                                    for="listaFuncionAccion1"
                                                    id="messageListaFuncionAccion1"/>
                                                <webuijsf:helpInline
                                                    binding="#{ArchivoDatosExt4.helpInlineListaFuncionAccion1}"
                                                    id="helpInlineListaFuncionAccion1"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-page"
                                                    text="#{ArchivoDatosExt4.gestor.i18n.inlineHelpListaFuncionAccion}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdArchivoDatosExt1" rendered="#{ArchivoDatosExt4.bitIdArchivoDatosExtRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ArchivoDatosExt4.labelIdArchivoDatosExt1}"
                                                    id="labelIdArchivoDatosExt1"
                                                    for="campoIdArchivoDatosExt1"
                                                    text="archivo datos ext"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdArchivoDatosExt2" rendered="#{ArchivoDatosExt4.bitIdArchivoDatosExtRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdArchivoDatosExt1"
                                                    binding="#{ArchivoDatosExt4.campoIdArchivoDatosExt1}"
                                                     required="true"
                                                    text="#{ArchivoDatosExt4.textoCampoIdArchivoDatosExt1}"
                                                    toolTip="#{ArchivoDatosExt4.toolTipCampoIdArchivoDatosExt1}"
                                                    validatorExpression="#{ArchivoDatosExt4.campoIdArchivoDatosExt1_validate}"/>
                                                <webuijsf:staticText id="campoIdArchivoDatosExt1Texto1"
                                                    binding="#{ArchivoDatosExt4.campoIdArchivoDatosExt1Texto1}"/>
                                                <webuijsf:button id="campoIdArchivoDatosExt1Boton1"
                                                    binding="#{ArchivoDatosExt4.campoIdArchivoDatosExt1Boton1}"
                                                    onClick="#{ArchivoDatosExt4.scriptCampoIdArchivoDatosExt1Boton1}"/>
                                                <webuijsf:button id="campoIdArchivoDatosExt1Boton3"
                                                    binding="#{ArchivoDatosExt4.campoIdArchivoDatosExt1Boton3}"
                                                    onClick="#{ArchivoDatosExt4.scriptCampoIdArchivoDatosExt1Boton2}"
                                                    rendered="#{ArchivoDatosExt4.bitCampoIdArchivoDatosExt1Boton3Rendered.on}"/>
                                                <webuijsf:message id="messageIdArchivoDatosExt1"
                                                    for="campoIdArchivoDatosExt1"/>
                                                <webuijsf:helpInline id="helpInlineIdArchivoDatosExt1"
                                                    binding="#{ArchivoDatosExt4.helpInlineIdArchivoDatosExt1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_archivo_datos_ext"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdArchivoDatosExt3"
                                                rendered="#{ArchivoDatosExt4.bitCampoIdArchivoDatosExt1Boton2Rendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ArchivoDatosExt4.labelIdArchivoDatosExt2}"
                                                    id="labelIdArchivoDatosExt2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdArchivoDatosExt4"
                                                rendered="#{ArchivoDatosExt4.bitCampoIdArchivoDatosExt1Boton2Rendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{ArchivoDatosExt4.campoIdArchivoDatosExt1Texto2}"
                                                    id="campoIdArchivoDatosExt1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{ArchivoDatosExt4.campoIdArchivoDatosExt1Boton2}"
                                                    id="campoIdArchivoDatosExt1Boton2"
                                                    onClick="#{ArchivoDatosExt4.scriptCampoIdArchivoDatosExt1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNombreArchivoDatosExt1" rendered="#{ArchivoDatosExt4.bitNombreArchivoDatosExtRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ArchivoDatosExt4.labelNombreArchivoDatosExt1}"
                                                    id="labelNombreArchivoDatosExt1"
                                                    for="campoNombreArchivoDatosExt1"
                                                    text="nombre"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNombreArchivoDatosExt2" rendered="#{ArchivoDatosExt4.bitNombreArchivoDatosExtRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:upload id="campoNombreArchivoDatosExt1"
                                                    binding="#{ArchivoDatosExt4.campoNombreArchivoDatosExt1}"
                                                     required="true"
                                                    toolTip="BundleParametros.nombre_archivo_datos_ext"/>
                                                <webuijsf:staticText id="campoNombreArchivoDatosExt1Texto1"
                                                    binding="#{ArchivoDatosExt4.campoNombreArchivoDatosExt1Texto1}"/>
                                                <webuijsf:message id="messageNombreArchivoDatosExt1"
                                                    for="campoNombreArchivoDatosExt1"/>
                                                <webuijsf:helpInline id="helpInlineNombreArchivoDatosExt1"
                                                    binding="#{ArchivoDatosExt4.helpInlineNombreArchivoDatosExt1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.nombre_archivo_datos_ext"
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
                                                    actionExpression="#{ArchivoDatosExt4.botonAplicar1_action}"
                                                    binding="#{ArchivoDatosExt4.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    styleClass="pdq-button-1"
                                                    text="#{ArchivoDatosExt4.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{ArchivoDatosExt4.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ArchivoDatosExt4.botonProcesar1_action}"
                                                    binding="#{ArchivoDatosExt4.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    styleClass="pdq-button-1"
                                                    text="#{ArchivoDatosExt4.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{ArchivoDatosExt4.gestor.i18n.toolTipBotonProcesar}"/>
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
