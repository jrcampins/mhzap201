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
                    focus="#{Ubicacion7.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{Ubicacion7.gestor.preserveFocus}"
                    preserveScroll="#{Ubicacion7.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{Ubicacion7.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | listaOpcionZum1 | botonAplicarZum1 botonQuitarZum1 , virtualForm3 | listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{Ubicacion7.breadcrumbs1}" 
                                        id="breadcrumbs1" 
                                        styleClass="pdq-breadcrumbs-1"/>
                                </div>
                                <div class="pdq-div-filtro-1">
                                    <h:panelGrid 
                                        columns="4" 
                                        id="gridPanel101"
                                        rendered="#{Ubicacion7.gestor.funcionZoomHabilitada}">
                                        <webuijsf:label 
                                            binding="#{Ubicacion7.etiquetaListaOpcionZum1}" 
                                            id="etiquetaListaOpcionZum1" 
                                            text="#{Ubicacion7.gestor.i18n.textoEtiquetaListaOpcionZum}"/>
                                        <webuijsf:dropDown 
                                            binding="#{Ubicacion7.listaOpcionZum1}" 
                                            converter="#{Ubicacion7.converterListaOpcionZum1}"
                                            id="listaOpcionZum1" 
                                            items="#{Ubicacion7.gestor.opcionesZumNodo}" 
                                            required="true" 
                                            selected="#{Ubicacion7.opcionZumSeleccionada}"/>
                                        <webuijsf:button 
                                            actionExpression="#{Ubicacion7.botonAplicarZum1_action}" 
                                            binding="#{Ubicacion7.botonAplicarZum1}"
                                            id="botonAplicarZum1" 
                                            styleClass="pdq-button-1" 
                                            text="#{Ubicacion7.gestor.i18n.textoBotonAplicarZum}"
                                            toolTip="#{Ubicacion7.gestor.i18n.toolTipBotonAplicarZum}"/>
                                        <webuijsf:button 
                                            actionExpression="#{Ubicacion7.botonQuitarZum1_action}" 
                                            binding="#{Ubicacion7.botonQuitarZum1}"
                                            id="botonQuitarZum1" 
                                            styleClass="pdq-button-1" 
                                            text="#{Ubicacion7.gestor.i18n.textoBotonQuitarZum}"
                                            toolTip="#{Ubicacion7.gestor.i18n.toolTipBotonQuitarZum}"/>
                                    </h:panelGrid>
                                </div>
                                <div class="pos-div-detalle">
                                    <h:panelGrid 
                                        id="gridPanel102">
                                        <h:panelGrid 
                                            id="gridPanel103">
                                            <h:panelGrid 
                                                columns="2" 
                                                id="gridPanel104">
                                                <webuijsf:image
                                                    id="imagenMensaje1"
                                                    rendered="#{Ubicacion7.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{Ubicacion7.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{Ubicacion7.gestor.mensajeDisponible}"
                                                    text="#{Ubicacion7.gestor.mensaje}"
                                                    url="#{Ubicacion7.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:tree 
                                            binding="#{Ubicacion7.tree1}" 
                                            id="tree1" 
                                            style="#{Ubicacion7.gestor.estiloArbol}" 
                                            styleClass="pdq-tree-1"/>
                                        <h:panelGrid 
                                            id="gridPanel105">
                                            <h:panelGrid 
                                                id="gridPanel106">
                                                <webuijsf:anchor 
                                                    id="anchor1"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="13"
                                                id="gridPanel107">
                                                <webuijsf:button
                                                    actionExpression="#{Ubicacion7.botonAgregar1_action}"
                                                    binding="#{Ubicacion7.botonAgregar1}"
                                                    disabled="#{Ubicacion7.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{Ubicacion7.gestor.scriptAgregar}"
                                                    rendered="#{Ubicacion7.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Ubicacion7.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{Ubicacion7.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{Ubicacion7.listaFuncionEdicion1}"
                                                    converter="#{Ubicacion7.converterListaFuncionEdicion1}"
                                                    disabled="#{Ubicacion7.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{Ubicacion7.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{Ubicacion7.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{Ubicacion7.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{Ubicacion7.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Ubicacion7.botonEditar1_action}"
                                                    binding="#{Ubicacion7.botonEditar1}"
                                                    disabled="#{Ubicacion7.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{Ubicacion7.gestor.scriptEditar}"
                                                    rendered="#{Ubicacion7.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Ubicacion7.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{Ubicacion7.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Ubicacion7.botonEliminar1_action}"
                                                    binding="#{Ubicacion7.botonEliminar1}"
                                                    disabled="#{Ubicacion7.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{Ubicacion7.gestor.scriptEliminar}"
                                                    rendered="#{Ubicacion7.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Ubicacion7.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{Ubicacion7.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Ubicacion7.botonAplicar1_action}"
                                                    binding="#{Ubicacion7.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{Ubicacion7.gestor.scriptAplicar}"
                                                    rendered="#{Ubicacion7.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Ubicacion7.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{Ubicacion7.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Ubicacion7.botonDeshacer1_action}"
                                                    binding="#{Ubicacion7.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{Ubicacion7.gestor.scriptDeshacer}"
                                                    rendered="#{Ubicacion7.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Ubicacion7.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{Ubicacion7.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Ubicacion7.botonConfirmar1_action}"
                                                    binding="#{Ubicacion7.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{Ubicacion7.gestor.scriptConfirmar}"
                                                    rendered="#{Ubicacion7.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Ubicacion7.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{Ubicacion7.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Ubicacion7.botonDescartar1_action}"
                                                    binding="#{Ubicacion7.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{Ubicacion7.gestor.scriptDescartar}"
                                                    rendered="#{Ubicacion7.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Ubicacion7.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{Ubicacion7.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{Ubicacion7.listaFuncionAccion1}"
                                                    converter="#{Ubicacion7.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{Ubicacion7.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{Ubicacion7.gestor.designing}"
                                                    selected="#{Ubicacion7.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{Ubicacion7.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Ubicacion7.botonProcesar1_action}"
                                                    binding="#{Ubicacion7.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{Ubicacion7.gestor.scriptProcesar}"
                                                    rendered="#{Ubicacion7.gestor.designing}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Ubicacion7.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{Ubicacion7.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Ubicacion7.botonRefrescar1_action}"
                                                    binding="#{Ubicacion7.botonRefrescar1}"
                                                    disabled="#{Ubicacion7.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{Ubicacion7.gestor.scriptRefrescar}"
                                                    rendered="#{Ubicacion7.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Ubicacion7.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{Ubicacion7.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Ubicacion7.botonReconsultar1_action}"
                                                    binding="#{Ubicacion7.botonReconsultar1}"
                                                    disabled="#{Ubicacion7.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{Ubicacion7.gestor.scriptReconsultar}"
                                                    rendered="#{Ubicacion7.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Ubicacion7.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{Ubicacion7.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Ubicacion7.botonRetornar1_action}"
                                                    binding="#{Ubicacion7.botonRetornar1}"
                                                    disabled="#{Ubicacion7.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{Ubicacion7.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{Ubicacion7.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Ubicacion7.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{Ubicacion7.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel108"
                                                rendered="#{Ubicacion7.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{Ubicacion7.imageHyperlink1_action}"
                                                    binding="#{Ubicacion7.imageHyperlink1}"
                                                    disabled="#{Ubicacion7.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{Ubicacion7.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{Ubicacion7.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{Ubicacion7.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.Ubicacion7_imageHyperlink1_toolTip}"/>
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
