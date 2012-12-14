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
                    focus="#{Mensaje1.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{Mensaje1.gestor.preserveFocus}"
                    preserveScroll="#{Mensaje1.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{Mensaje1.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | checkbox1 campoIdMensaje1 campoCodigoMensaje1 campoPatronMensaje1 campoDescripcionMensaje1 textoFilasPorPagina1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | textoFilasPorPagina1 | botonRepaginar1 , virtualForm3 | checkbox1 listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonEscogerFila1 botonDetallarFila1 botonProcesarFila1 botonRetornarFila1 botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{Mensaje1.breadcrumbs1}" 
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
                                                    rendered="#{Mensaje1.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{Mensaje1.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{Mensaje1.gestor.mensajeDisponible}"
                                                    text="#{Mensaje1.gestor.mensaje}"
                                                    url="#{Mensaje1.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:table
                                            binding="#{Mensaje1.table1}"
                                            clearSortButton="true" 
                                            deselectMultipleButton="true" 
                                            id="table1"
                                            paginateButton="false"
                                            paginationControls="true" 
                                            selectMultipleButton="true" 
                                            sortPanelToggleButton="true"
                                            width="960">
                                            <webuijsf:tableRowGroup 
                                                binding="#{Mensaje1.tableRowGroup1}" 
                                                id="tableRowGroup1" 
                                                rows="1"
                                                selected="#{Mensaje1.gestor.filaEscogida}" 
                                                sourceData="#{Mensaje1.mensajeDataProvider}" 
                                                sourceVar="currentRow">
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    id="tableRowGroup1SelectionColumn"
                                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);" 
                                                    selectId="checkbox1">
                                                    <webuijsf:checkbox 
                                                        binding="#{Mensaje1.checkbox1}" 
                                                        id="checkbox1"
                                                        onClick="#{Mensaje1.gestor.scriptElegir}" 
                                                        selected="#{Mensaje1.gestor.filaElegida}" 
                                                        toolTip="#{Mensaje1.gestor.i18n.toolTipCheckboxSeleccionMultiple}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    binding="#{Mensaje1.tableColumn1}" 
                                                    id="tableColumn1">
                                                    <webuijsf:button 
                                                        actionExpression="#{Mensaje1.botonEscogerFila1_action}"
                                                        binding="#{Mensaje1.botonEscogerFila1}"
                                                        disabled="#{Mensaje1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonEscogerFila1"
                                                        imageURL="#{Mensaje1.gestor.urlImagenEscoger}" 
                                                        onClick="#{Mensaje1.gestor.scriptEscoger}"
                                                        text="#{Mensaje1.gestor.i18n.textoBotonEscogerFila}"
                                                        toolTip="#{Mensaje1.gestor.i18n.toolTipBotonEscogerFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{Mensaje1.botonDetallarFila1_action}"
                                                        binding="#{Mensaje1.botonDetallarFila1}"
                                                        disabled="#{Mensaje1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonDetallarFila1"
                                                        imageURL="#{Mensaje1.gestor.urlImagenDetallar}" 
                                                        onClick="#{Mensaje1.scriptAbrirVentanaVerDetalle}"
                                                        rendered="#{Mensaje1.gestor.detalleDisponible}" 
                                                        text="#{Mensaje1.gestor.i18n.textoBotonDetallarFila}"
                                                        toolTip="#{Mensaje1.gestor.i18n.toolTipBotonDetallarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{Mensaje1.botonProcesarFila1_action}"
                                                        binding="#{Mensaje1.botonProcesarFila1}"
                                                        disabled="#{Mensaje1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonProcesarFila1"
                                                        imageURL="#{Mensaje1.gestor.urlImagenProcesar}" 
                                                        onClick="#{Mensaje1.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{Mensaje1.asistente.comandoDisponible}" 
                                                        text="#{Mensaje1.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{Mensaje1.gestor.i18n.toolTipBotonProcesarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{Mensaje1.botonRetornarFila1_action}"
                                                        binding="#{Mensaje1.botonRetornarFila1}" 
                                                        disabled="#{Mensaje1.gestor.funcionReturnInhabilitada}"
                                                        id="botonRetornarFila1"
                                                        imageURL="#{Mensaje1.gestor.urlImagenRetornar}"
                                                        onClick="#{Mensaje1.gestor.scriptRetornarRecursoActual}"
                                                        rendered="#{Mensaje1.gestor.funcionReturnVisible}" 
                                                        text="#{Mensaje1.gestor.i18n.textoBotonRetornarFila}"
                                                        toolTip="#{Mensaje1.gestor.i18n.toolTipBotonRetornarFila}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Mensaje1.tableColumn2}"
                                                    id="tableColumn2"
                                                    rendered="#{Mensaje1.gestor.designing}">
                                                    <webuijsf:imageHyperlink
                                                        actionExpression="#{Mensaje1.hipervinculoAccionFila1_action}"
                                                        binding="#{Mensaje1.hipervinculoAccionFila1}"
                                                        disabled="#{Mensaje1.gestor.loteConCambios}"
                                                        id="hipervinculoAccionFila1"
                                                        imageURL="#{Mensaje1.gestor.urlImagenEjecutarVinculo}"
                                                        onClick="#{Mensaje1.scriptAbrirVentanaAccionFila1}"
                                                        text="Accion1"
                                                        toolTip="#{bundle.Mensaje1_hipervinculoAccionFila1_toolTip}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="right" 
                                                    binding="#{Mensaje1.tableColumn3}" 
                                                    headerText="#{Mensaje1.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{Mensaje1.gestor.i18n.toolTipEtiquetaIdentificacionFila}"
                                                    id="tableColumn3">
                                                    <webuijsf:imageHyperlink 
                                                        actionExpression="#{Mensaje1.hipervinculoDetallarFila1_action}"
                                                        binding="#{Mensaje1.hipervinculoDetallarFila1}" 
                                                        id="hipervinculoDetallarFila1"
                                                        imageURL="#{Mensaje1.gestor.urlImagenFilaProcesada}"
                                                        textPosition="left" 
                                                        text="#{Mensaje1.gestor.identificacionFila}" 
                                                        toolTip="#{Mensaje1.gestor.toolTipImagenFilaProcesada}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Mensaje1.tableColumnIdMensaje1}"
                                                    headerText="identificaci&#243;n"
                                                    id="tableColumnIdMensaje1"
                                                    sort="id_mensaje">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdMensaje1"
                                                    text="#{currentRow.value['id_mensaje']}"
                                                    rendered="#{Mensaje1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Mensaje1.labelIdMensaje1}"
                                                    id="labelIdMensaje1"
                                                    for="campoIdMensaje1"/>
                                                <webuijsf:textField id="campoIdMensaje1"
                                                    binding="#{Mensaje1.campoIdMensaje1}"
                                                    converter="#{Mensaje1.converterIdMensaje1}"
                                                    readOnly="#{Mensaje1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['id_mensaje']}"
                                                    toolTip="BundleParametros.id_mensaje.mensaje"
                                                    validatorExpression="#{Mensaje1.validatorIdMensaje1.validate}"/>
                                                <webuijsf:staticText id="campoIdMensaje1Texto1"
                                                    binding="#{Mensaje1.campoIdMensaje1Texto1}"
                                                    text="#{currentRow.value['id_mensaje']}"/>
                                                <webuijsf:message id="messageIdMensaje1"
                                                    for="campoIdMensaje1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Mensaje1.tableColumnCodigoMensaje1}"
                                                    headerText="c&#243;digo"
                                                    id="tableColumnCodigoMensaje1"
                                                    sort="codigo_mensaje">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextCodigoMensaje1"
                                                    text="#{currentRow.value['codigo_mensaje']}"
                                                    rendered="#{Mensaje1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Mensaje1.labelCodigoMensaje1}"
                                                    id="labelCodigoMensaje1"
                                                    for="campoCodigoMensaje1"/>
                                                <webuijsf:textField id="campoCodigoMensaje1"
                                                    binding="#{Mensaje1.campoCodigoMensaje1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{Mensaje1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['codigo_mensaje']}"
                                                    toolTip="BundleParametros.codigo_mensaje.mensaje"
                                                    validatorExpression="#{Mensaje1.validatorCodigoMensaje1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoMensaje1Texto1"
                                                    binding="#{Mensaje1.campoCodigoMensaje1Texto1}"
                                                    text="#{currentRow.value['codigo_mensaje']}"/>
                                                <webuijsf:message id="messageCodigoMensaje1"
                                                    for="campoCodigoMensaje1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Mensaje1.tableColumnPatronMensaje1}"
                                                    headerText="patr&#243;n"
                                                    id="tableColumnPatronMensaje1"
                                                    sort="patron_mensaje">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextPatronMensaje1"
                                                    text="#{currentRow.value['patron_mensaje']}"
                                                    rendered="#{Mensaje1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Mensaje1.labelPatronMensaje1}"
                                                    id="labelPatronMensaje1"
                                                    for="campoPatronMensaje1"/>
                                                <webuijsf:textArea id="campoPatronMensaje1"
                                                    binding="#{Mensaje1.campoPatronMensaje1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{Mensaje1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['patron_mensaje']}"
                                                    toolTip="BundleParametros.patron_mensaje.mensaje"
                                                    validatorExpression="#{Mensaje1.validatorPatronMensaje1.validate}"/>
                                                <webuijsf:staticText id="campoPatronMensaje1Texto1"
                                                    binding="#{Mensaje1.campoPatronMensaje1Texto1}"
                                                    text="#{currentRow.value['patron_mensaje']}"/>
                                                <webuijsf:message id="messagePatronMensaje1"
                                                    for="campoPatronMensaje1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Mensaje1.tableColumnDescripcionMensaje1}"
                                                    headerText="descripci&#243;n"
                                                    id="tableColumnDescripcionMensaje1" rendered="false"
                                                    sort="descripcion_mensaje">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextDescripcionMensaje1"
                                                    text="#{currentRow.value['descripcion_mensaje']}"
                                                    rendered="#{Mensaje1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Mensaje1.labelDescripcionMensaje1}"
                                                    id="labelDescripcionMensaje1"
                                                    for="campoDescripcionMensaje1"/>
                                                <webuijsf:textArea id="campoDescripcionMensaje1"
                                                    binding="#{Mensaje1.campoDescripcionMensaje1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{Mensaje1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['descripcion_mensaje']}"
                                                    toolTip="BundleParametros.descripcion_mensaje.mensaje"
                                                    validatorExpression="#{Mensaje1.validatorDescripcionMensaje1.validate}"/>
                                                <webuijsf:staticText id="campoDescripcionMensaje1Texto1"
                                                    binding="#{Mensaje1.campoDescripcionMensaje1Texto1}"
                                                    text="#{currentRow.value['descripcion_mensaje']}"/>
                                                <webuijsf:message id="messageDescripcionMensaje1"
                                                    for="campoDescripcionMensaje1"/>
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
                                                        binding="#{Mensaje1.etiquetaTextoFilasPorPagina1}" 
                                                        for="textoFilasPorPagina1"
                                                        id="etiquetaTextoFilasPorPagina1" 
                                                        text="#{Mensaje1.gestor.i18n.textoEtiquetaTextoFilasPorPagina}"/>
                                                </h:panelGrid>
                                                <h:panelGrid 
                                                    columns="3" 
                                                    id="gridPanel107">
                                                    <webuijsf:textField 
                                                        binding="#{Mensaje1.textoFilasPorPagina1}" 
                                                        columns="2"
                                                        converter="#{Mensaje1.textoFilasPorPagina1Converter1}"
                                                        disabled="#{Mensaje1.gestor.paginacionInhabilitada}" 
                                                        id="textoFilasPorPagina1" maxLength="2"
                                                        text="#{Mensaje1.gestor.filasPorPagina}" 
                                                        validatorExpression="#{Mensaje1.textoFilasPorPagina1Validator1.validate}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{Mensaje1.botonRepaginar1_action}"
                                                        binding="#{Mensaje1.botonRepaginar1}" 
                                                        id="botonRepaginar1"
                                                        imageURL="#{Mensaje1.gestor.urlImagenRepaginar}" 
                                                        onClick="#{Mensaje1.gestor.scriptRepaginar}"
                                                        text="#{Mensaje1.gestor.i18n.textoBotonRepaginar}"
                                                        toolTip="#{Mensaje1.gestor.i18n.toolTipBotonRepaginar}"/>
                                                    <webuijsf:message 
                                                        for="textoFilasPorPagina1" 
                                                        id="messageFilasPorPagina1"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="13"
                                                id="gridPanel108">
                                                <webuijsf:button
                                                    actionExpression="#{Mensaje1.botonAgregar1_action}"
                                                    binding="#{Mensaje1.botonAgregar1}"
                                                    disabled="#{Mensaje1.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{Mensaje1.gestor.scriptAgregar}"
                                                    rendered="#{Mensaje1.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Mensaje1.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{Mensaje1.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{Mensaje1.listaFuncionEdicion1}"
                                                    converter="#{Mensaje1.converterListaFuncionEdicion1}"
                                                    disabled="#{Mensaje1.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{Mensaje1.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{Mensaje1.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{Mensaje1.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{Mensaje1.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Mensaje1.botonEditar1_action}"
                                                    binding="#{Mensaje1.botonEditar1}"
                                                    disabled="#{Mensaje1.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{Mensaje1.gestor.scriptEditar}"
                                                    rendered="#{Mensaje1.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Mensaje1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{Mensaje1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Mensaje1.botonEliminar1_action}"
                                                    binding="#{Mensaje1.botonEliminar1}"
                                                    disabled="#{Mensaje1.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{Mensaje1.gestor.scriptEliminar}"
                                                    rendered="#{Mensaje1.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Mensaje1.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{Mensaje1.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Mensaje1.botonAplicar1_action}"
                                                    binding="#{Mensaje1.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{Mensaje1.gestor.scriptAplicar}"
                                                    rendered="#{Mensaje1.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Mensaje1.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{Mensaje1.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Mensaje1.botonDeshacer1_action}"
                                                    binding="#{Mensaje1.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{Mensaje1.gestor.scriptDeshacer}"
                                                    rendered="#{Mensaje1.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Mensaje1.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{Mensaje1.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Mensaje1.botonConfirmar1_action}"
                                                    binding="#{Mensaje1.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{Mensaje1.gestor.scriptConfirmar}"
                                                    rendered="#{Mensaje1.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Mensaje1.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{Mensaje1.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Mensaje1.botonDescartar1_action}"
                                                    binding="#{Mensaje1.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{Mensaje1.gestor.scriptDescartar}"
                                                    rendered="#{Mensaje1.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Mensaje1.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{Mensaje1.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{Mensaje1.listaFuncionAccion1}"
                                                    converter="#{Mensaje1.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{Mensaje1.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{Mensaje1.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{Mensaje1.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{Mensaje1.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Mensaje1.botonProcesar1_action}"
                                                    binding="#{Mensaje1.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{Mensaje1.gestor.scriptProcesar}"
                                                    rendered="#{Mensaje1.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Mensaje1.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{Mensaje1.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Mensaje1.botonRefrescar1_action}"
                                                    binding="#{Mensaje1.botonRefrescar1}"
                                                    disabled="#{Mensaje1.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{Mensaje1.gestor.scriptRefrescar}"
                                                    rendered="#{Mensaje1.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Mensaje1.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{Mensaje1.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Mensaje1.botonReconsultar1_action}"
                                                    binding="#{Mensaje1.botonReconsultar1}"
                                                    disabled="#{Mensaje1.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{Mensaje1.gestor.scriptReconsultar}"
                                                    rendered="#{Mensaje1.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Mensaje1.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{Mensaje1.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Mensaje1.botonRetornar1_action}"
                                                    binding="#{Mensaje1.botonRetornar1}"
                                                    disabled="#{Mensaje1.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{Mensaje1.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{Mensaje1.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Mensaje1.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{Mensaje1.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel109"
                                                rendered="#{Mensaje1.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{Mensaje1.imageHyperlink1_action}"
                                                    binding="#{Mensaje1.imageHyperlink1}"
                                                    disabled="#{Mensaje1.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{Mensaje1.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{Mensaje1.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{Mensaje1.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.Mensaje1_imageHyperlink1_toolTip}"/>
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
