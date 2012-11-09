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
                    focus="#{Usuario4.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{Usuario4.gestor.preserveFocus}"
                    preserveScroll="#{Usuario4.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{Usuario4.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | listaFuncionAccion1 campoIdUsuario1 campoPasswordUsuario1 campoIdUsuarioSupervisor1 | , virtualForm2 | | , virtualForm3 | listaFuncionAccion1 | listaFuncionAccion1 , virtualForm4 | | ">
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
                                        binding="#{Usuario4.breadcrumbs1}" 
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
                                                    rendered="#{Usuario4.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{Usuario4.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{Usuario4.gestor.mensajeDisponible}"
                                                    text="#{Usuario4.gestor.mensaje}"
                                                    url="#{Usuario4.gestor.urlAnclaPie1}"/>
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
                                                    binding="#{Usuario4.etiquetaListaFuncionAccion1}"
                                                    id="etiquetaListaFuncionAccion1"
                                                    for="listaFuncionAccion1"
                                                    text="#{Usuario4.gestor.i18n.textoEtiquetaListaFuncionAccion}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel110"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown
                                                    binding="#{Usuario4.listaFuncionAccion1}"
                                                    converter="#{Usuario4.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{Usuario4.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme4_2.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    required="true"
                                                    selected="#{Usuario4.gestor.valorListaFuncionAccion1}"
                                                    toolTip="#{Usuario4.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:staticText
                                                    binding="#{Usuario4.listaFuncionAccion1Texto1}"
                                                    id="listaFuncionAccion1Texto1"/>
                                                <webuijsf:message
                                                    for="listaFuncionAccion1"
                                                    id="messageListaFuncionAccion1"/>
                                                <webuijsf:helpInline
                                                    binding="#{Usuario4.helpInlineListaFuncionAccion1}"
                                                    id="helpInlineListaFuncionAccion1"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-page"
                                                    text="#{Usuario4.gestor.i18n.inlineHelpListaFuncionAccion}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdUsuario1" rendered="#{Usuario4.bitIdUsuarioRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Usuario4.labelIdUsuario1}"
                                                    id="labelIdUsuario1"
                                                    for="campoIdUsuario1"
                                                    text="usuario"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdUsuario2" rendered="#{Usuario4.bitIdUsuarioRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdUsuario1"
                                                    binding="#{Usuario4.campoIdUsuario1}"
                                                     required="true"
                                                    text="#{Usuario4.textoCampoIdUsuario1}"
                                                    toolTip="#{Usuario4.toolTipCampoIdUsuario1}"
                                                    validatorExpression="#{Usuario4.campoIdUsuario1_validate}"/>
                                                <webuijsf:staticText id="campoIdUsuario1Texto1"
                                                    binding="#{Usuario4.campoIdUsuario1Texto1}"/>
                                                <webuijsf:button id="campoIdUsuario1Boton1"
                                                    binding="#{Usuario4.campoIdUsuario1Boton1}"
                                                    onClick="#{Usuario4.scriptCampoIdUsuario1Boton1}"/>
                                                <webuijsf:button id="campoIdUsuario1Boton3"
                                                    binding="#{Usuario4.campoIdUsuario1Boton3}"
                                                    onClick="#{Usuario4.scriptCampoIdUsuario1Boton2}"
                                                    rendered="#{Usuario4.bitCampoIdUsuario1Boton3Rendered.on}"/>
                                                <webuijsf:message id="messageIdUsuario1"
                                                    for="campoIdUsuario1"/>
                                                <webuijsf:helpInline id="helpInlineIdUsuario1"
                                                    binding="#{Usuario4.helpInlineIdUsuario1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_usuario"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdUsuario3"
                                                rendered="#{Usuario4.bitCampoIdUsuario1Boton2Rendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Usuario4.labelIdUsuario2}"
                                                    id="labelIdUsuario2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdUsuario4"
                                                rendered="#{Usuario4.bitCampoIdUsuario1Boton2Rendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{Usuario4.campoIdUsuario1Texto2}"
                                                    id="campoIdUsuario1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{Usuario4.campoIdUsuario1Boton2}"
                                                    id="campoIdUsuario1Boton2"
                                                    onClick="#{Usuario4.scriptCampoIdUsuario1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPasswordUsuario1" rendered="#{Usuario4.bitPasswordUsuarioRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Usuario4.labelPasswordUsuario1}"
                                                    id="labelPasswordUsuario1"
                                                    for="campoPasswordUsuario1"
                                                    text="password"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPasswordUsuario2" rendered="#{Usuario4.bitPasswordUsuarioRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:passwordField id="campoPasswordUsuario1"
                                                    binding="#{Usuario4.campoPasswordUsuario1}"
                                                    columns="50"
                                                     required="true"
                                                    password="#{Usuario4.textoCampoPasswordUsuario1}"
                                                    toolTip="BundleParametros.password_usuario"
                                                    validatorExpression="#{Usuario4.validatorPasswordUsuario1.validate}"/>
                                                <webuijsf:staticText id="campoPasswordUsuario1Texto1"
                                                    binding="#{Usuario4.campoPasswordUsuario1Texto1}"/>
                                                <webuijsf:message id="messagePasswordUsuario1"
                                                    for="campoPasswordUsuario1"/>
                                                <webuijsf:helpInline id="helpInlinePasswordUsuario1"
                                                    binding="#{Usuario4.helpInlinePasswordUsuario1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.password_usuario"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdUsuarioSupervisor1" rendered="#{Usuario4.bitIdUsuarioSupervisorRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Usuario4.labelIdUsuarioSupervisor1}"
                                                    id="labelIdUsuarioSupervisor1"
                                                    for="campoIdUsuarioSupervisor1"
                                                    text="usuario supervisor"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdUsuarioSupervisor2" rendered="#{Usuario4.bitIdUsuarioSupervisorRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdUsuarioSupervisor1"
                                                    binding="#{Usuario4.campoIdUsuarioSupervisor1}"
                                                     required="true"
                                                    text="#{Usuario4.textoCampoIdUsuarioSupervisor1}"
                                                    toolTip="#{Usuario4.toolTipCampoIdUsuarioSupervisor1}"
                                                    validatorExpression="#{Usuario4.campoIdUsuarioSupervisor1_validate}"/>
                                                <webuijsf:staticText id="campoIdUsuarioSupervisor1Texto1"
                                                    binding="#{Usuario4.campoIdUsuarioSupervisor1Texto1}"/>
                                                <webuijsf:button id="campoIdUsuarioSupervisor1Boton1"
                                                    binding="#{Usuario4.campoIdUsuarioSupervisor1Boton1}"
                                                    onClick="#{Usuario4.scriptCampoIdUsuarioSupervisor1Boton1}"/>
                                                <webuijsf:button id="campoIdUsuarioSupervisor1Boton3"
                                                    binding="#{Usuario4.campoIdUsuarioSupervisor1Boton3}"
                                                    onClick="#{Usuario4.scriptCampoIdUsuarioSupervisor1Boton2}"
                                                    rendered="#{Usuario4.bitCampoIdUsuarioSupervisor1Boton3Rendered.on}"/>
                                                <webuijsf:message id="messageIdUsuarioSupervisor1"
                                                    for="campoIdUsuarioSupervisor1"/>
                                                <webuijsf:helpInline id="helpInlineIdUsuarioSupervisor1"
                                                    binding="#{Usuario4.helpInlineIdUsuarioSupervisor1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_usuario_supervisor"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdUsuarioSupervisor3"
                                                rendered="#{Usuario4.bitCampoIdUsuarioSupervisor1Boton2Rendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Usuario4.labelIdUsuarioSupervisor2}"
                                                    id="labelIdUsuarioSupervisor2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre usuario supervisor"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdUsuarioSupervisor4"
                                                rendered="#{Usuario4.bitCampoIdUsuarioSupervisor1Boton2Rendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{Usuario4.campoIdUsuarioSupervisor1Texto2}"
                                                    id="campoIdUsuarioSupervisor1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{Usuario4.campoIdUsuarioSupervisor1Boton2}"
                                                    id="campoIdUsuarioSupervisor1Boton2"
                                                    onClick="#{Usuario4.scriptCampoIdUsuarioSupervisor1Boton2}"/>
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
                                                    actionExpression="#{Usuario4.botonAplicar1_action}"
                                                    binding="#{Usuario4.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    styleClass="pdq-button-1"
                                                    text="#{Usuario4.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{Usuario4.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Usuario4.botonProcesar1_action}"
                                                    binding="#{Usuario4.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    styleClass="pdq-button-1"
                                                    text="#{Usuario4.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{Usuario4.gestor.i18n.toolTipBotonProcesar}"/>
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
