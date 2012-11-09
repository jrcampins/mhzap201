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
                    focus="#{Ubicacion3.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{Ubicacion3.gestor.preserveFocus}"
                    preserveScroll="#{Ubicacion3.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{Ubicacion3.form1}" 
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
                                        binding="#{Ubicacion3.breadcrumbs1}" 
                                        id="breadcrumbs1" 
                                        styleClass="pdq-breadcrumbs-1"/>
                                </div>
                                <div class="pdq-div-filtro-1">
                                    <h:panelGrid 
                                        columns="4" 
                                        id="gridPanel101"
                                        rendered="#{Ubicacion3.gestor.funcionZoomHabilitada}">
                                        <webuijsf:label 
                                            binding="#{Ubicacion3.etiquetaListaOpcionZum1}" 
                                            id="etiquetaListaOpcionZum1" 
                                            text="#{Ubicacion3.gestor.i18n.textoEtiquetaListaOpcionZum}"/>
                                        <webuijsf:dropDown 
                                            binding="#{Ubicacion3.listaOpcionZum1}" 
                                            converter="#{Ubicacion3.converterListaOpcionZum1}"
                                            id="listaOpcionZum1" 
                                            items="#{Ubicacion3.gestor.opcionesZumNodo}" 
                                            required="true" 
                                            selected="#{Ubicacion3.opcionZumSeleccionada}"/>
                                        <webuijsf:button 
                                            actionExpression="#{Ubicacion3.botonAplicarZum1_action}" 
                                            binding="#{Ubicacion3.botonAplicarZum1}"
                                            id="botonAplicarZum1" 
                                            styleClass="pdq-button-1" 
                                            text="#{Ubicacion3.gestor.i18n.textoBotonAplicarZum}"
                                            toolTip="#{Ubicacion3.gestor.i18n.toolTipBotonAplicarZum}"/>
                                        <webuijsf:button 
                                            actionExpression="#{Ubicacion3.botonQuitarZum1_action}" 
                                            binding="#{Ubicacion3.botonQuitarZum1}"
                                            id="botonQuitarZum1" 
                                            styleClass="pdq-button-1" 
                                            text="#{Ubicacion3.gestor.i18n.textoBotonQuitarZum}"
                                            toolTip="#{Ubicacion3.gestor.i18n.toolTipBotonQuitarZum}"/>
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
                                                    rendered="#{Ubicacion3.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{Ubicacion3.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{Ubicacion3.gestor.mensajeDisponible}"
                                                    text="#{Ubicacion3.gestor.mensaje}"
                                                    url="#{Ubicacion3.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:tree 
                                            binding="#{Ubicacion3.tree1}" 
                                            id="tree1" 
                                            style="#{Ubicacion3.gestor.estiloArbol}" 
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
                                                    actionExpression="#{Ubicacion3.botonAgregar1_action}"
                                                    binding="#{Ubicacion3.botonAgregar1}"
                                                    disabled="#{Ubicacion3.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{Ubicacion3.gestor.scriptAgregar}"
                                                    rendered="#{Ubicacion3.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Ubicacion3.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{Ubicacion3.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{Ubicacion3.listaFuncionEdicion1}"
                                                    converter="#{Ubicacion3.converterListaFuncionEdicion1}"
                                                    disabled="#{Ubicacion3.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{Ubicacion3.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{Ubicacion3.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{Ubicacion3.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{Ubicacion3.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Ubicacion3.botonEditar1_action}"
                                                    binding="#{Ubicacion3.botonEditar1}"
                                                    disabled="#{Ubicacion3.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{Ubicacion3.gestor.scriptEditar}"
                                                    rendered="#{Ubicacion3.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Ubicacion3.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{Ubicacion3.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Ubicacion3.botonEliminar1_action}"
                                                    binding="#{Ubicacion3.botonEliminar1}"
                                                    disabled="#{Ubicacion3.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{Ubicacion3.gestor.scriptEliminar}"
                                                    rendered="#{Ubicacion3.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Ubicacion3.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{Ubicacion3.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Ubicacion3.botonAplicar1_action}"
                                                    binding="#{Ubicacion3.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{Ubicacion3.gestor.scriptAplicar}"
                                                    rendered="#{Ubicacion3.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Ubicacion3.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{Ubicacion3.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Ubicacion3.botonDeshacer1_action}"
                                                    binding="#{Ubicacion3.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{Ubicacion3.gestor.scriptDeshacer}"
                                                    rendered="#{Ubicacion3.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Ubicacion3.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{Ubicacion3.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Ubicacion3.botonConfirmar1_action}"
                                                    binding="#{Ubicacion3.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{Ubicacion3.gestor.scriptConfirmar}"
                                                    rendered="#{Ubicacion3.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Ubicacion3.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{Ubicacion3.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Ubicacion3.botonDescartar1_action}"
                                                    binding="#{Ubicacion3.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{Ubicacion3.gestor.scriptDescartar}"
                                                    rendered="#{Ubicacion3.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Ubicacion3.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{Ubicacion3.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{Ubicacion3.listaFuncionAccion1}"
                                                    converter="#{Ubicacion3.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{Ubicacion3.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{Ubicacion3.gestor.designing}"
                                                    selected="#{Ubicacion3.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{Ubicacion3.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Ubicacion3.botonProcesar1_action}"
                                                    binding="#{Ubicacion3.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{Ubicacion3.gestor.scriptProcesar}"
                                                    rendered="#{Ubicacion3.gestor.designing}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Ubicacion3.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{Ubicacion3.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Ubicacion3.botonRefrescar1_action}"
                                                    binding="#{Ubicacion3.botonRefrescar1}"
                                                    disabled="#{Ubicacion3.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{Ubicacion3.gestor.scriptRefrescar}"
                                                    rendered="#{Ubicacion3.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Ubicacion3.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{Ubicacion3.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Ubicacion3.botonReconsultar1_action}"
                                                    binding="#{Ubicacion3.botonReconsultar1}"
                                                    disabled="#{Ubicacion3.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{Ubicacion3.gestor.scriptReconsultar}"
                                                    rendered="#{Ubicacion3.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Ubicacion3.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{Ubicacion3.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Ubicacion3.botonRetornar1_action}"
                                                    binding="#{Ubicacion3.botonRetornar1}"
                                                    disabled="#{Ubicacion3.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{Ubicacion3.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{Ubicacion3.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Ubicacion3.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{Ubicacion3.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel108"
                                                rendered="#{Ubicacion3.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{Ubicacion3.imageHyperlink1_action}"
                                                    binding="#{Ubicacion3.imageHyperlink1}"
                                                    disabled="#{Ubicacion3.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{Ubicacion3.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{Ubicacion3.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{Ubicacion3.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.Ubicacion3_imageHyperlink1_toolTip}"/>
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
