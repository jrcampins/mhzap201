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
                    focus="#{DominioPaquetePorDominio1.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{DominioPaquetePorDominio1.gestor.preserveFocus}"
                    preserveScroll="#{DominioPaquetePorDominio1.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{DominioPaquetePorDominio1.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | checkbox1 campoIdDominioPaquete1 campoIdPaquete1 textoFilasPorPagina1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | textoFilasPorPagina1 | botonRepaginar1 , virtualForm3 | checkbox1 listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonEscogerFila1 botonDetallarFila1 botonProcesarFila1 botonRetornarFila1 botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{DominioPaquetePorDominio1.breadcrumbs1}" 
                                        id="breadcrumbs1" 
                                        styleClass="pdq-breadcrumbs-1"/>
                                </div>
                                <div class="pdq-div-filtro-1">
                                    <jsp:directive.include file="FragmentoFiltro_1.jspf"/>
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
                                                    rendered="#{DominioPaquetePorDominio1.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{DominioPaquetePorDominio1.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{DominioPaquetePorDominio1.gestor.mensajeDisponible}"
                                                    text="#{DominioPaquetePorDominio1.gestor.mensaje}"
                                                    url="#{DominioPaquetePorDominio1.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:table
                                            binding="#{DominioPaquetePorDominio1.table1}"
                                            clearSortButton="true" 
                                            deselectMultipleButton="true" 
                                            id="table1"
                                            paginateButton="false"
                                            paginationControls="true" 
                                            selectMultipleButton="true" 
                                            sortPanelToggleButton="true"
                                            width="960">
                                            <webuijsf:tableRowGroup 
                                                binding="#{DominioPaquetePorDominio1.tableRowGroup1}" 
                                                id="tableRowGroup1" 
                                                rows="1"
                                                selected="#{DominioPaquetePorDominio1.gestor.filaEscogida}" 
                                                sourceData="#{DominioPaquetePorDominio1.dominioPaqueteDataProvider}" 
                                                sourceVar="currentRow">
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    id="tableRowGroup1SelectionColumn"
                                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);" 
                                                    selectId="checkbox1">
                                                    <webuijsf:checkbox 
                                                        binding="#{DominioPaquetePorDominio1.checkbox1}" 
                                                        id="checkbox1"
                                                        onClick="#{DominioPaquetePorDominio1.gestor.scriptElegir}" 
                                                        selected="#{DominioPaquetePorDominio1.gestor.filaElegida}" 
                                                        toolTip="#{DominioPaquetePorDominio1.gestor.i18n.toolTipCheckboxSeleccionMultiple}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    binding="#{DominioPaquetePorDominio1.tableColumn1}" 
                                                    id="tableColumn1">
                                                    <webuijsf:button 
                                                        actionExpression="#{DominioPaquetePorDominio1.botonEscogerFila1_action}"
                                                        binding="#{DominioPaquetePorDominio1.botonEscogerFila1}"
                                                        disabled="#{DominioPaquetePorDominio1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonEscogerFila1"
                                                        imageURL="#{DominioPaquetePorDominio1.gestor.urlImagenEscoger}" 
                                                        onClick="#{DominioPaquetePorDominio1.gestor.scriptEscoger}"
                                                        text="#{DominioPaquetePorDominio1.gestor.i18n.textoBotonEscogerFila}"
                                                        toolTip="#{DominioPaquetePorDominio1.gestor.i18n.toolTipBotonEscogerFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{DominioPaquetePorDominio1.botonDetallarFila1_action}"
                                                        binding="#{DominioPaquetePorDominio1.botonDetallarFila1}"
                                                        disabled="#{DominioPaquetePorDominio1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonDetallarFila1"
                                                        imageURL="#{DominioPaquetePorDominio1.gestor.urlImagenDetallar}" 
                                                        onClick="#{DominioPaquetePorDominio1.scriptAbrirVentanaVerDetalle}"
                                                        rendered="#{DominioPaquetePorDominio1.gestor.detalleDisponible}" 
                                                        text="#{DominioPaquetePorDominio1.gestor.i18n.textoBotonDetallarFila}"
                                                        toolTip="#{DominioPaquetePorDominio1.gestor.i18n.toolTipBotonDetallarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{DominioPaquetePorDominio1.botonProcesarFila1_action}"
                                                        binding="#{DominioPaquetePorDominio1.botonProcesarFila1}"
                                                        disabled="#{DominioPaquetePorDominio1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonProcesarFila1"
                                                        imageURL="#{DominioPaquetePorDominio1.gestor.urlImagenProcesar}" 
                                                        onClick="#{DominioPaquetePorDominio1.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{DominioPaquetePorDominio1.asistente.comandoDisponible}" 
                                                        text="#{DominioPaquetePorDominio1.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{DominioPaquetePorDominio1.gestor.i18n.toolTipBotonProcesarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{DominioPaquetePorDominio1.botonRetornarFila1_action}"
                                                        binding="#{DominioPaquetePorDominio1.botonRetornarFila1}" 
                                                        disabled="#{DominioPaquetePorDominio1.gestor.funcionReturnInhabilitada}"
                                                        id="botonRetornarFila1"
                                                        imageURL="#{DominioPaquetePorDominio1.gestor.urlImagenRetornar}"
                                                        onClick="#{DominioPaquetePorDominio1.gestor.scriptRetornarRecursoActual}"
                                                        rendered="#{DominioPaquetePorDominio1.gestor.funcionReturnVisible}" 
                                                        text="#{DominioPaquetePorDominio1.gestor.i18n.textoBotonRetornarFila}"
                                                        toolTip="#{DominioPaquetePorDominio1.gestor.i18n.toolTipBotonRetornarFila}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{DominioPaquetePorDominio1.tableColumn2}"
                                                    id="tableColumn2"
                                                    rendered="#{DominioPaquetePorDominio1.gestor.designing}">
                                                    <webuijsf:imageHyperlink
                                                        actionExpression="#{DominioPaquetePorDominio1.hipervinculoAccionFila1_action}"
                                                        binding="#{DominioPaquetePorDominio1.hipervinculoAccionFila1}"
                                                        disabled="#{DominioPaquetePorDominio1.gestor.loteConCambios}"
                                                        id="hipervinculoAccionFila1"
                                                        imageURL="#{DominioPaquetePorDominio1.gestor.urlImagenEjecutarVinculo}"
                                                        onClick="#{DominioPaquetePorDominio1.scriptAbrirVentanaAccionFila1}"
                                                        text="Accion1"
                                                        toolTip="#{bundle.DominioPaquetePorDominio1_hipervinculoAccionFila1_toolTip}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="right" 
                                                    binding="#{DominioPaquetePorDominio1.tableColumn3}" 
                                                    headerText="#{DominioPaquetePorDominio1.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{DominioPaquetePorDominio1.gestor.i18n.toolTipEtiquetaIdentificacionFila}"
                                                    id="tableColumn3">
                                                    <webuijsf:imageHyperlink 
                                                        actionExpression="#{DominioPaquetePorDominio1.hipervinculoDetallarFila1_action}"
                                                        binding="#{DominioPaquetePorDominio1.hipervinculoDetallarFila1}" 
                                                        id="hipervinculoDetallarFila1"
                                                        imageURL="#{DominioPaquetePorDominio1.gestor.urlImagenFilaProcesada}"
                                                        textPosition="left" 
                                                        text="#{DominioPaquetePorDominio1.gestor.identificacionFila}" 
                                                        toolTip="#{DominioPaquetePorDominio1.gestor.toolTipImagenFilaProcesada}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{DominioPaquetePorDominio1.tableColumnIdDominioPaquete1}"
                                                    headerText="id"
                                                    id="tableColumnIdDominioPaquete1"
                                                    sort="id_dominio_paquete">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdDominioPaquete1"
                                                    text="#{currentRow.value['id_dominio_paquete']}"
                                                    rendered="#{DominioPaquetePorDominio1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{DominioPaquetePorDominio1.labelIdDominioPaquete1}"
                                                    id="labelIdDominioPaquete1"
                                                    for="campoIdDominioPaquete1"/>
                                                <webuijsf:textField id="campoIdDominioPaquete1"
                                                    binding="#{DominioPaquetePorDominio1.campoIdDominioPaquete1}"
                                                    converter="#{DominioPaquetePorDominio1.converterIdDominioPaquete1}"
                                                    readOnly="#{DominioPaquetePorDominio1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['id_dominio_paquete']}"
                                                    toolTip="BundleParametros.id_dominio_paquete.dominio_paquete"
                                                    validatorExpression="#{DominioPaquetePorDominio1.validatorIdDominioPaquete1.validate}"/>
                                                <webuijsf:staticText id="campoIdDominioPaquete1Texto1"
                                                    binding="#{DominioPaquetePorDominio1.campoIdDominioPaquete1Texto1}"
                                                    text="#{currentRow.value['id_dominio_paquete']}"/>
                                                <webuijsf:message id="messageIdDominioPaquete1"
                                                    for="campoIdDominioPaquete1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{DominioPaquetePorDominio1.tableColumnIdPaquete1}"
                                                    headerText="paquete"
                                                    id="tableColumnIdPaquete1"
                                                    sort="codigo_paquete_1x2y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdPaquete1"
                                                    text="#{currentRow.value['codigo_paquete_1x2y3']}"
                                                    rendered="#{DominioPaquetePorDominio1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{DominioPaquetePorDominio1.labelIdPaquete1}"
                                                    id="labelIdPaquete1"
                                                    for="campoIdPaquete1"/>
                                                <webuijsf:textField id="campoIdPaquete1"
                                                    binding="#{DominioPaquetePorDominio1.campoIdPaquete1}"
                                                    readOnly="#{DominioPaquetePorDominio1.gestor.filaNoProcesada}" required="true"
                                                    text="#{DominioPaquetePorDominio1.asistente.textoCampoIdPaquete1}"
                                                    toolTip="#{DominioPaquetePorDominio1.asistente.toolTipCampoIdPaquete1}"
                                                    validatorExpression="#{DominioPaquetePorDominio1.campoIdPaquete1_validate}"/>
                                                <webuijsf:staticText id="campoIdPaquete1Texto1"
                                                    binding="#{DominioPaquetePorDominio1.campoIdPaquete1Texto1}"
                                                    text="#{currentRow.value['codigo_paquete_1x2y3']}"/>
                                                <webuijsf:message id="messageIdPaquete1"
                                                    for="campoIdPaquete1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdPaquete3"
                                                    rendered="#{DominioPaquetePorDominio1.asistente.tableColumnIdPaquete3Rendered}"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdPaquete3"
                                                    text="#{currentRow.value['id_paquete']}"
                                                    rendered="#{DominioPaquetePorDominio1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{DominioPaquetePorDominio1.campoIdPaquete1Boton1}"
                                                    id="campoIdPaquete1Boton1"
                                                    onClick="#{DominioPaquetePorDominio1.asistente.scriptCampoIdPaquete1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{DominioPaquetePorDominio1.campoIdPaquete1Boton3}"
                                                    id="campoIdPaquete1Boton3"
                                                    onClick="#{DominioPaquetePorDominio1.asistente.scriptCampoIdPaquete1Boton2}"
                                                    rendered="#{DominioPaquetePorDominio1.asistente.campoIdPaquete1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{DominioPaquetePorDominio1.tableColumnIdPaquete2}"
                                                    headerText="nombre paquete"
                                                    id="tableColumnIdPaquete2"
                                                    rendered="#{DominioPaquetePorDominio1.asistente.campoIdPaquete1Boton2Rendered}"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdPaquete2"
                                                    text="#{currentRow.value['id_paquete']}"
                                                    rendered="#{DominioPaquetePorDominio1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{DominioPaquetePorDominio1.labelIdPaquete2}"
                                                    id="labelIdPaquete2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{DominioPaquetePorDominio1.campoIdPaquete1Hiper1}"
                                                    id="campoIdPaquete1Hiper1"
                                                    onClick="#{DominioPaquetePorDominio1.asistente.scriptCampoIdPaquete1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdPaquete1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                            </webuijsf:tableRowGroup>
                                        </webuijsf:table>
                                        <h:panelGrid 
                                            id="gridPanel104">
                                            <h:panelGrid 
                                                columns="2" 
                                                id="gridPanel105">
                                                <h:panelGrid 
                                                    id="gridPanel106">
                                                    <webuijsf:label 
                                                        binding="#{DominioPaquetePorDominio1.etiquetaTextoFilasPorPagina1}" 
                                                        for="textoFilasPorPagina1"
                                                        id="etiquetaTextoFilasPorPagina1" 
                                                        text="#{DominioPaquetePorDominio1.gestor.i18n.textoEtiquetaTextoFilasPorPagina}"/>
                                                </h:panelGrid>
                                                <h:panelGrid 
                                                    columns="3" 
                                                    id="gridPanel107">
                                                    <webuijsf:textField 
                                                        binding="#{DominioPaquetePorDominio1.textoFilasPorPagina1}" 
                                                        columns="2"
                                                        converter="#{DominioPaquetePorDominio1.textoFilasPorPagina1Converter1}"
                                                        disabled="#{DominioPaquetePorDominio1.gestor.paginacionInhabilitada}" 
                                                        id="textoFilasPorPagina1" maxLength="2"
                                                        text="#{DominioPaquetePorDominio1.gestor.filasPorPagina}" 
                                                        validatorExpression="#{DominioPaquetePorDominio1.textoFilasPorPagina1Validator1.validate}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{DominioPaquetePorDominio1.botonRepaginar1_action}"
                                                        binding="#{DominioPaquetePorDominio1.botonRepaginar1}" 
                                                        id="botonRepaginar1"
                                                        imageURL="#{DominioPaquetePorDominio1.gestor.urlImagenRepaginar}" 
                                                        onClick="#{DominioPaquetePorDominio1.gestor.scriptRepaginar}"
                                                        text="#{DominioPaquetePorDominio1.gestor.i18n.textoBotonRepaginar}"
                                                        toolTip="#{DominioPaquetePorDominio1.gestor.i18n.toolTipBotonRepaginar}"/>
                                                    <webuijsf:message 
                                                        for="textoFilasPorPagina1" 
                                                        id="messageFilasPorPagina1"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="13"
                                                id="gridPanel108">
                                                <webuijsf:button
                                                    actionExpression="#{DominioPaquetePorDominio1.botonAgregar1_action}"
                                                    binding="#{DominioPaquetePorDominio1.botonAgregar1}"
                                                    disabled="#{DominioPaquetePorDominio1.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{DominioPaquetePorDominio1.gestor.scriptAgregar}"
                                                    rendered="#{DominioPaquetePorDominio1.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{DominioPaquetePorDominio1.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{DominioPaquetePorDominio1.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{DominioPaquetePorDominio1.listaFuncionEdicion1}"
                                                    converter="#{DominioPaquetePorDominio1.converterListaFuncionEdicion1}"
                                                    disabled="#{DominioPaquetePorDominio1.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{DominioPaquetePorDominio1.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{DominioPaquetePorDominio1.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{DominioPaquetePorDominio1.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{DominioPaquetePorDominio1.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{DominioPaquetePorDominio1.botonEditar1_action}"
                                                    binding="#{DominioPaquetePorDominio1.botonEditar1}"
                                                    disabled="#{DominioPaquetePorDominio1.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{DominioPaquetePorDominio1.gestor.scriptEditar}"
                                                    rendered="#{DominioPaquetePorDominio1.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{DominioPaquetePorDominio1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{DominioPaquetePorDominio1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{DominioPaquetePorDominio1.botonEliminar1_action}"
                                                    binding="#{DominioPaquetePorDominio1.botonEliminar1}"
                                                    disabled="#{DominioPaquetePorDominio1.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{DominioPaquetePorDominio1.gestor.scriptEliminar}"
                                                    rendered="#{DominioPaquetePorDominio1.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{DominioPaquetePorDominio1.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{DominioPaquetePorDominio1.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{DominioPaquetePorDominio1.botonAplicar1_action}"
                                                    binding="#{DominioPaquetePorDominio1.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{DominioPaquetePorDominio1.gestor.scriptAplicar}"
                                                    rendered="#{DominioPaquetePorDominio1.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{DominioPaquetePorDominio1.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{DominioPaquetePorDominio1.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{DominioPaquetePorDominio1.botonDeshacer1_action}"
                                                    binding="#{DominioPaquetePorDominio1.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{DominioPaquetePorDominio1.gestor.scriptDeshacer}"
                                                    rendered="#{DominioPaquetePorDominio1.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{DominioPaquetePorDominio1.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{DominioPaquetePorDominio1.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{DominioPaquetePorDominio1.botonConfirmar1_action}"
                                                    binding="#{DominioPaquetePorDominio1.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{DominioPaquetePorDominio1.gestor.scriptConfirmar}"
                                                    rendered="#{DominioPaquetePorDominio1.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{DominioPaquetePorDominio1.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{DominioPaquetePorDominio1.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{DominioPaquetePorDominio1.botonDescartar1_action}"
                                                    binding="#{DominioPaquetePorDominio1.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{DominioPaquetePorDominio1.gestor.scriptDescartar}"
                                                    rendered="#{DominioPaquetePorDominio1.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{DominioPaquetePorDominio1.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{DominioPaquetePorDominio1.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{DominioPaquetePorDominio1.listaFuncionAccion1}"
                                                    converter="#{DominioPaquetePorDominio1.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{DominioPaquetePorDominio1.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{DominioPaquetePorDominio1.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{DominioPaquetePorDominio1.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{DominioPaquetePorDominio1.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{DominioPaquetePorDominio1.botonProcesar1_action}"
                                                    binding="#{DominioPaquetePorDominio1.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{DominioPaquetePorDominio1.gestor.scriptProcesar}"
                                                    rendered="#{DominioPaquetePorDominio1.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{DominioPaquetePorDominio1.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{DominioPaquetePorDominio1.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{DominioPaquetePorDominio1.botonRefrescar1_action}"
                                                    binding="#{DominioPaquetePorDominio1.botonRefrescar1}"
                                                    disabled="#{DominioPaquetePorDominio1.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{DominioPaquetePorDominio1.gestor.scriptRefrescar}"
                                                    rendered="#{DominioPaquetePorDominio1.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{DominioPaquetePorDominio1.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{DominioPaquetePorDominio1.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{DominioPaquetePorDominio1.botonReconsultar1_action}"
                                                    binding="#{DominioPaquetePorDominio1.botonReconsultar1}"
                                                    disabled="#{DominioPaquetePorDominio1.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{DominioPaquetePorDominio1.gestor.scriptReconsultar}"
                                                    rendered="#{DominioPaquetePorDominio1.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{DominioPaquetePorDominio1.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{DominioPaquetePorDominio1.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{DominioPaquetePorDominio1.botonRetornar1_action}"
                                                    binding="#{DominioPaquetePorDominio1.botonRetornar1}"
                                                    disabled="#{DominioPaquetePorDominio1.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{DominioPaquetePorDominio1.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{DominioPaquetePorDominio1.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{DominioPaquetePorDominio1.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{DominioPaquetePorDominio1.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel109"
                                                rendered="#{DominioPaquetePorDominio1.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{DominioPaquetePorDominio1.imageHyperlink1_action}"
                                                    binding="#{DominioPaquetePorDominio1.imageHyperlink1}"
                                                    disabled="#{DominioPaquetePorDominio1.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{DominioPaquetePorDominio1.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{DominioPaquetePorDominio1.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{DominioPaquetePorDominio1.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.DominioPaquetePorDominio1_imageHyperlink1_toolTip}"/>
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
