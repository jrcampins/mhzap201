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
                    focus="#{Paquete1.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{Paquete1.gestor.preserveFocus}"
                    preserveScroll="#{Paquete1.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{Paquete1.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | checkbox1 campoIdPaquete1 campoCodigoPaquete1 textoFilasPorPagina1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | textoFilasPorPagina1 | botonRepaginar1 , virtualForm3 | checkbox1 listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonEscogerFila1 botonDetallarFila1 botonProcesarFila1 botonRetornarFila1 botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{Paquete1.breadcrumbs1}" 
                                        id="breadcrumbs1" 
                                        styleClass="pdq-breadcrumbs-1"/>
                                </div>
                                <div class="pdq-div-filtro-1">
                                    <jsp:directive.include file="FragmentoFiltro.jspf"/>
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
                                                    rendered="#{Paquete1.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{Paquete1.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{Paquete1.gestor.mensajeDisponible}"
                                                    text="#{Paquete1.gestor.mensaje}"
                                                    url="#{Paquete1.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:table
                                            binding="#{Paquete1.table1}"
                                            clearSortButton="true" 
                                            deselectMultipleButton="true" 
                                            id="table1"
                                            paginateButton="false"
                                            paginationControls="true" 
                                            selectMultipleButton="true" 
                                            sortPanelToggleButton="true"
                                            width="960">
                                            <webuijsf:tableRowGroup 
                                                binding="#{Paquete1.tableRowGroup1}" 
                                                id="tableRowGroup1" 
                                                rows="1"
                                                selected="#{Paquete1.gestor.filaEscogida}" 
                                                sourceData="#{Paquete1.paqueteDataProvider}" 
                                                sourceVar="currentRow">
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    id="tableRowGroup1SelectionColumn"
                                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);" 
                                                    selectId="checkbox1">
                                                    <webuijsf:checkbox 
                                                        binding="#{Paquete1.checkbox1}" 
                                                        id="checkbox1"
                                                        onClick="#{Paquete1.gestor.scriptElegir}" 
                                                        selected="#{Paquete1.gestor.filaElegida}" 
                                                        toolTip="#{Paquete1.gestor.i18n.toolTipCheckboxSeleccionMultiple}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    binding="#{Paquete1.tableColumn1}" 
                                                    id="tableColumn1">
                                                    <webuijsf:button 
                                                        actionExpression="#{Paquete1.botonEscogerFila1_action}"
                                                        binding="#{Paquete1.botonEscogerFila1}"
                                                        disabled="#{Paquete1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonEscogerFila1"
                                                        imageURL="#{Paquete1.gestor.urlImagenEscoger}" 
                                                        onClick="#{Paquete1.gestor.scriptEscoger}"
                                                        text="#{Paquete1.gestor.i18n.textoBotonEscogerFila}"
                                                        toolTip="#{Paquete1.gestor.i18n.toolTipBotonEscogerFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{Paquete1.botonDetallarFila1_action}"
                                                        binding="#{Paquete1.botonDetallarFila1}"
                                                        disabled="#{Paquete1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonDetallarFila1"
                                                        imageURL="#{Paquete1.gestor.urlImagenDetallar}" 
                                                        onClick="#{Paquete1.scriptAbrirVentanaVerDetalle}"
                                                        rendered="#{Paquete1.gestor.detalleDisponible}" 
                                                        text="#{Paquete1.gestor.i18n.textoBotonDetallarFila}"
                                                        toolTip="#{Paquete1.gestor.i18n.toolTipBotonDetallarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{Paquete1.botonProcesarFila1_action}"
                                                        binding="#{Paquete1.botonProcesarFila1}"
                                                        disabled="#{Paquete1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonProcesarFila1"
                                                        imageURL="#{Paquete1.gestor.urlImagenProcesar}" 
                                                        onClick="#{Paquete1.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{Paquete1.asistente.comandoDisponible}" 
                                                        text="#{Paquete1.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{Paquete1.gestor.i18n.toolTipBotonProcesarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{Paquete1.botonRetornarFila1_action}"
                                                        binding="#{Paquete1.botonRetornarFila1}" 
                                                        disabled="#{Paquete1.gestor.funcionReturnInhabilitada}"
                                                        id="botonRetornarFila1"
                                                        imageURL="#{Paquete1.gestor.urlImagenRetornar}"
                                                        onClick="#{Paquete1.gestor.scriptRetornarRecursoActual}"
                                                        rendered="#{Paquete1.gestor.funcionReturnVisible}" 
                                                        text="#{Paquete1.gestor.i18n.textoBotonRetornarFila}"
                                                        toolTip="#{Paquete1.gestor.i18n.toolTipBotonRetornarFila}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Paquete1.tableColumn2}"
                                                    id="tableColumn2"
                                                    rendered="#{Paquete1.gestor.designing}">
                                                    <webuijsf:imageHyperlink
                                                        actionExpression="#{Paquete1.hipervinculoAccionFila1_action}"
                                                        binding="#{Paquete1.hipervinculoAccionFila1}"
                                                        disabled="#{Paquete1.gestor.loteConCambios}"
                                                        id="hipervinculoAccionFila1"
                                                        imageURL="#{Paquete1.gestor.urlImagenEjecutarVinculo}"
                                                        onClick="#{Paquete1.scriptAbrirVentanaAccionFila1}"
                                                        text="Accion1"
                                                        toolTip="#{bundle.Paquete1_hipervinculoAccionFila1_toolTip}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="right" 
                                                    binding="#{Paquete1.tableColumn3}" 
                                                    headerText="#{Paquete1.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{Paquete1.gestor.i18n.toolTipEtiquetaIdentificacionFila}"
                                                    id="tableColumn3">
                                                    <webuijsf:imageHyperlink 
                                                        actionExpression="#{Paquete1.hipervinculoDetallarFila1_action}"
                                                        binding="#{Paquete1.hipervinculoDetallarFila1}" 
                                                        id="hipervinculoDetallarFila1"
                                                        imageURL="#{Paquete1.gestor.urlImagenFilaProcesada}"
                                                        textPosition="left" 
                                                        text="#{Paquete1.gestor.identificacionFila}" 
                                                        toolTip="#{Paquete1.gestor.toolTipImagenFilaProcesada}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Paquete1.tableColumnIdPaquete1}"
                                                    headerText="identificaci&#243;n"
                                                    id="tableColumnIdPaquete1"
                                                    sort="id_paquete">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdPaquete1"
                                                    text="#{currentRow.value['id_paquete']}"
                                                    rendered="#{Paquete1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Paquete1.labelIdPaquete1}"
                                                    id="labelIdPaquete1"
                                                    for="campoIdPaquete1"/>
                                                <webuijsf:textField id="campoIdPaquete1"
                                                    binding="#{Paquete1.campoIdPaquete1}"
                                                    converter="#{Paquete1.converterIdPaquete1}"
                                                    readOnly="#{Paquete1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['id_paquete']}"
                                                    toolTip="BundleParametros.id_paquete.paquete"
                                                    validatorExpression="#{Paquete1.validatorIdPaquete1.validate}"/>
                                                <webuijsf:staticText id="campoIdPaquete1Texto1"
                                                    binding="#{Paquete1.campoIdPaquete1Texto1}"
                                                    text="#{currentRow.value['id_paquete']}"/>
                                                <webuijsf:message id="messageIdPaquete1"
                                                    for="campoIdPaquete1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Paquete1.tableColumnCodigoPaquete1}"
                                                    headerText="c&#243;digo"
                                                    id="tableColumnCodigoPaquete1"
                                                    sort="codigo_paquete">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextCodigoPaquete1"
                                                    text="#{currentRow.value['codigo_paquete']}"
                                                    rendered="#{Paquete1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Paquete1.labelCodigoPaquete1}"
                                                    id="labelCodigoPaquete1"
                                                    for="campoCodigoPaquete1"/>
                                                <webuijsf:textField id="campoCodigoPaquete1"
                                                    binding="#{Paquete1.campoCodigoPaquete1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{Paquete1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['codigo_paquete']}"
                                                    toolTip="BundleParametros.codigo_paquete.paquete"
                                                    validatorExpression="#{Paquete1.validatorCodigoPaquete1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoPaquete1Texto1"
                                                    binding="#{Paquete1.campoCodigoPaquete1Texto1}"
                                                    text="#{currentRow.value['codigo_paquete']}"/>
                                                <webuijsf:message id="messageCodigoPaquete1"
                                                    for="campoCodigoPaquete1"/>
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
                                                        binding="#{Paquete1.etiquetaTextoFilasPorPagina1}" 
                                                        for="textoFilasPorPagina1"
                                                        id="etiquetaTextoFilasPorPagina1" 
                                                        text="#{Paquete1.gestor.i18n.textoEtiquetaTextoFilasPorPagina}"/>
                                                </h:panelGrid>
                                                <h:panelGrid 
                                                    columns="3" 
                                                    id="gridPanel107">
                                                    <webuijsf:textField 
                                                        binding="#{Paquete1.textoFilasPorPagina1}" 
                                                        columns="2"
                                                        converter="#{Paquete1.textoFilasPorPagina1Converter1}"
                                                        disabled="#{Paquete1.gestor.paginacionInhabilitada}" 
                                                        id="textoFilasPorPagina1" maxLength="2"
                                                        text="#{Paquete1.gestor.filasPorPagina}" 
                                                        validatorExpression="#{Paquete1.textoFilasPorPagina1Validator1.validate}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{Paquete1.botonRepaginar1_action}"
                                                        binding="#{Paquete1.botonRepaginar1}" 
                                                        id="botonRepaginar1"
                                                        imageURL="#{Paquete1.gestor.urlImagenRepaginar}" 
                                                        onClick="#{Paquete1.gestor.scriptRepaginar}"
                                                        text="#{Paquete1.gestor.i18n.textoBotonRepaginar}"
                                                        toolTip="#{Paquete1.gestor.i18n.toolTipBotonRepaginar}"/>
                                                    <webuijsf:message 
                                                        for="textoFilasPorPagina1" 
                                                        id="messageFilasPorPagina1"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="13"
                                                id="gridPanel108">
                                                <webuijsf:button
                                                    actionExpression="#{Paquete1.botonAgregar1_action}"
                                                    binding="#{Paquete1.botonAgregar1}"
                                                    disabled="#{Paquete1.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{Paquete1.gestor.scriptAgregar}"
                                                    rendered="#{Paquete1.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Paquete1.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{Paquete1.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{Paquete1.listaFuncionEdicion1}"
                                                    converter="#{Paquete1.converterListaFuncionEdicion1}"
                                                    disabled="#{Paquete1.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{Paquete1.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{Paquete1.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{Paquete1.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{Paquete1.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Paquete1.botonEditar1_action}"
                                                    binding="#{Paquete1.botonEditar1}"
                                                    disabled="#{Paquete1.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{Paquete1.gestor.scriptEditar}"
                                                    rendered="#{Paquete1.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Paquete1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{Paquete1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Paquete1.botonEliminar1_action}"
                                                    binding="#{Paquete1.botonEliminar1}"
                                                    disabled="#{Paquete1.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{Paquete1.gestor.scriptEliminar}"
                                                    rendered="#{Paquete1.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Paquete1.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{Paquete1.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Paquete1.botonAplicar1_action}"
                                                    binding="#{Paquete1.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{Paquete1.gestor.scriptAplicar}"
                                                    rendered="#{Paquete1.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Paquete1.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{Paquete1.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Paquete1.botonDeshacer1_action}"
                                                    binding="#{Paquete1.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{Paquete1.gestor.scriptDeshacer}"
                                                    rendered="#{Paquete1.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Paquete1.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{Paquete1.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Paquete1.botonConfirmar1_action}"
                                                    binding="#{Paquete1.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{Paquete1.gestor.scriptConfirmar}"
                                                    rendered="#{Paquete1.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Paquete1.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{Paquete1.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Paquete1.botonDescartar1_action}"
                                                    binding="#{Paquete1.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{Paquete1.gestor.scriptDescartar}"
                                                    rendered="#{Paquete1.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Paquete1.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{Paquete1.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{Paquete1.listaFuncionAccion1}"
                                                    converter="#{Paquete1.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{Paquete1.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{Paquete1.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{Paquete1.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{Paquete1.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Paquete1.botonProcesar1_action}"
                                                    binding="#{Paquete1.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{Paquete1.gestor.scriptProcesar}"
                                                    rendered="#{Paquete1.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Paquete1.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{Paquete1.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Paquete1.botonRefrescar1_action}"
                                                    binding="#{Paquete1.botonRefrescar1}"
                                                    disabled="#{Paquete1.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{Paquete1.gestor.scriptRefrescar}"
                                                    rendered="#{Paquete1.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Paquete1.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{Paquete1.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Paquete1.botonReconsultar1_action}"
                                                    binding="#{Paquete1.botonReconsultar1}"
                                                    disabled="#{Paquete1.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{Paquete1.gestor.scriptReconsultar}"
                                                    rendered="#{Paquete1.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Paquete1.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{Paquete1.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Paquete1.botonRetornar1_action}"
                                                    binding="#{Paquete1.botonRetornar1}"
                                                    disabled="#{Paquete1.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{Paquete1.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{Paquete1.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Paquete1.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{Paquete1.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel109"
                                                rendered="#{Paquete1.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{Paquete1.imageHyperlink1_action}"
                                                    binding="#{Paquete1.imageHyperlink1}"
                                                    disabled="#{Paquete1.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{Paquete1.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{Paquete1.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{Paquete1.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.Paquete1_imageHyperlink1_toolTip}"/>
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
