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
                    focus="#{Rol1.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{Rol1.gestor.preserveFocus}"
                    preserveScroll="#{Rol1.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{Rol1.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | checkbox1 campoIdRol1 campoCodigoRol1 campoNombreRol1 campoDescripcionRol1 textoFilasPorPagina1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | textoFilasPorPagina1 | botonRepaginar1 , virtualForm3 | checkbox1 listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonEscogerFila1 botonDetallarFila1 botonProcesarFila1 botonRetornarFila1 botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{Rol1.breadcrumbs1}" 
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
                                                    rendered="#{Rol1.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{Rol1.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{Rol1.gestor.mensajeDisponible}"
                                                    text="#{Rol1.gestor.mensaje}"
                                                    url="#{Rol1.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:table
                                            binding="#{Rol1.table1}"
                                            clearSortButton="true" 
                                            deselectMultipleButton="true" 
                                            id="table1"
                                            paginateButton="false"
                                            paginationControls="true" 
                                            selectMultipleButton="true" 
                                            sortPanelToggleButton="true"
                                            width="960">
                                            <webuijsf:tableRowGroup 
                                                binding="#{Rol1.tableRowGroup1}" 
                                                id="tableRowGroup1" 
                                                rows="1"
                                                selected="#{Rol1.gestor.filaEscogida}" 
                                                sourceData="#{Rol1.rolDataProvider}" 
                                                sourceVar="currentRow">
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    id="tableRowGroup1SelectionColumn"
                                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);" 
                                                    selectId="checkbox1">
                                                    <webuijsf:checkbox 
                                                        binding="#{Rol1.checkbox1}" 
                                                        id="checkbox1"
                                                        onClick="#{Rol1.gestor.scriptElegir}" 
                                                        selected="#{Rol1.gestor.filaElegida}" 
                                                        toolTip="#{Rol1.gestor.i18n.toolTipCheckboxSeleccionMultiple}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    binding="#{Rol1.tableColumn1}" 
                                                    id="tableColumn1">
                                                    <webuijsf:button 
                                                        actionExpression="#{Rol1.botonEscogerFila1_action}"
                                                        binding="#{Rol1.botonEscogerFila1}"
                                                        disabled="#{Rol1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonEscogerFila1"
                                                        imageURL="#{Rol1.gestor.urlImagenEscoger}" 
                                                        onClick="#{Rol1.gestor.scriptEscoger}"
                                                        text="#{Rol1.gestor.i18n.textoBotonEscogerFila}"
                                                        toolTip="#{Rol1.gestor.i18n.toolTipBotonEscogerFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{Rol1.botonDetallarFila1_action}"
                                                        binding="#{Rol1.botonDetallarFila1}"
                                                        disabled="#{Rol1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonDetallarFila1"
                                                        imageURL="#{Rol1.gestor.urlImagenDetallar}" 
                                                        onClick="#{Rol1.scriptAbrirVentanaVerDetalle}"
                                                        rendered="#{Rol1.gestor.detalleDisponible}" 
                                                        text="#{Rol1.gestor.i18n.textoBotonDetallarFila}"
                                                        toolTip="#{Rol1.gestor.i18n.toolTipBotonDetallarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{Rol1.botonProcesarFila1_action}"
                                                        binding="#{Rol1.botonProcesarFila1}"
                                                        disabled="#{Rol1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonProcesarFila1"
                                                        imageURL="#{Rol1.gestor.urlImagenProcesar}" 
                                                        onClick="#{Rol1.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{Rol1.asistente.comandoDisponible}" 
                                                        text="#{Rol1.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{Rol1.gestor.i18n.toolTipBotonProcesarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{Rol1.botonRetornarFila1_action}"
                                                        binding="#{Rol1.botonRetornarFila1}" 
                                                        disabled="#{Rol1.gestor.funcionReturnInhabilitada}"
                                                        id="botonRetornarFila1"
                                                        imageURL="#{Rol1.gestor.urlImagenRetornar}"
                                                        onClick="#{Rol1.gestor.scriptRetornarRecursoActual}"
                                                        rendered="#{Rol1.gestor.funcionReturnVisible}" 
                                                        text="#{Rol1.gestor.i18n.textoBotonRetornarFila}"
                                                        toolTip="#{Rol1.gestor.i18n.toolTipBotonRetornarFila}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Rol1.tableColumn2}"
                                                    id="tableColumn2"
                                                    rendered="#{Rol1.gestor.designing}">
                                                    <webuijsf:imageHyperlink
                                                        actionExpression="#{Rol1.hipervinculoAccionFila1_action}"
                                                        binding="#{Rol1.hipervinculoAccionFila1}"
                                                        disabled="#{Rol1.gestor.loteConCambios}"
                                                        id="hipervinculoAccionFila1"
                                                        imageURL="#{Rol1.gestor.urlImagenEjecutarVinculo}"
                                                        onClick="#{Rol1.scriptAbrirVentanaAccionFila1}"
                                                        text="Accion1"
                                                        toolTip="#{bundle.Rol1_hipervinculoAccionFila1_toolTip}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="right" 
                                                    binding="#{Rol1.tableColumn3}" 
                                                    headerText="#{Rol1.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{Rol1.gestor.i18n.toolTipEtiquetaIdentificacionFila}"
                                                    id="tableColumn3">
                                                    <webuijsf:imageHyperlink 
                                                        actionExpression="#{Rol1.hipervinculoDetallarFila1_action}"
                                                        binding="#{Rol1.hipervinculoDetallarFila1}" 
                                                        id="hipervinculoDetallarFila1"
                                                        imageURL="#{Rol1.gestor.urlImagenFilaProcesada}"
                                                        textPosition="left" 
                                                        text="#{Rol1.gestor.identificacionFila}" 
                                                        toolTip="#{Rol1.gestor.toolTipImagenFilaProcesada}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Rol1.tableColumnIdRol1}"
                                                    headerText="id"
                                                    id="tableColumnIdRol1" rendered="false"
                                                    sort="id_rol">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdRol1"
                                                    text="#{currentRow.value['id_rol']}"
                                                    rendered="#{Rol1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Rol1.labelIdRol1}"
                                                    id="labelIdRol1"
                                                    for="campoIdRol1"/>
                                                <webuijsf:textField id="campoIdRol1"
                                                    binding="#{Rol1.campoIdRol1}"
                                                    converter="#{Rol1.converterIdRol1}"
                                                    readOnly="#{Rol1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['id_rol']}"
                                                    toolTip="BundleParametros.id_rol.rol"
                                                    validatorExpression="#{Rol1.validatorIdRol1.validate}"/>
                                                <webuijsf:staticText id="campoIdRol1Texto1"
                                                    binding="#{Rol1.campoIdRol1Texto1}"
                                                    text="#{currentRow.value['id_rol']}"/>
                                                <webuijsf:message id="messageIdRol1"
                                                    for="campoIdRol1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Rol1.tableColumnCodigoRol1}"
                                                    headerText="codigo"
                                                    id="tableColumnCodigoRol1"
                                                    sort="codigo_rol">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextCodigoRol1"
                                                    text="#{currentRow.value['codigo_rol']}"
                                                    rendered="#{Rol1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Rol1.labelCodigoRol1}"
                                                    id="labelCodigoRol1"
                                                    for="campoCodigoRol1"/>
                                                <webuijsf:textField id="campoCodigoRol1"
                                                    binding="#{Rol1.campoCodigoRol1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{Rol1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['codigo_rol']}"
                                                    toolTip="BundleParametros.codigo_rol.rol"
                                                    validatorExpression="#{Rol1.validatorCodigoRol1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoRol1Texto1"
                                                    binding="#{Rol1.campoCodigoRol1Texto1}"
                                                    text="#{currentRow.value['codigo_rol']}"/>
                                                <webuijsf:message id="messageCodigoRol1"
                                                    for="campoCodigoRol1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Rol1.tableColumnNombreRol1}"
                                                    headerText="nombre"
                                                    id="tableColumnNombreRol1"
                                                    sort="nombre_rol">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNombreRol1"
                                                    text="#{currentRow.value['nombre_rol']}"
                                                    rendered="#{Rol1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Rol1.labelNombreRol1}"
                                                    id="labelNombreRol1"
                                                    for="campoNombreRol1"/>
                                                <webuijsf:textField id="campoNombreRol1"
                                                    binding="#{Rol1.campoNombreRol1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{Rol1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['nombre_rol']}"
                                                    toolTip="BundleParametros.nombre_rol.rol"
                                                    validatorExpression="#{Rol1.validatorNombreRol1.validate}"/>
                                                <webuijsf:staticText id="campoNombreRol1Texto1"
                                                    binding="#{Rol1.campoNombreRol1Texto1}"
                                                    text="#{currentRow.value['nombre_rol']}"/>
                                                <webuijsf:message id="messageNombreRol1"
                                                    for="campoNombreRol1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Rol1.tableColumnDescripcionRol1}"
                                                    headerText="descripcion"
                                                    id="tableColumnDescripcionRol1" rendered="false"
                                                    sort="descripcion_rol">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextDescripcionRol1"
                                                    text="#{currentRow.value['descripcion_rol']}"
                                                    rendered="#{Rol1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Rol1.labelDescripcionRol1}"
                                                    id="labelDescripcionRol1"
                                                    for="campoDescripcionRol1"/>
                                                <webuijsf:textArea id="campoDescripcionRol1"
                                                    binding="#{Rol1.campoDescripcionRol1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{Rol1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['descripcion_rol']}"
                                                    toolTip="BundleParametros.descripcion_rol.rol"
                                                    validatorExpression="#{Rol1.validatorDescripcionRol1.validate}"/>
                                                <webuijsf:staticText id="campoDescripcionRol1Texto1"
                                                    binding="#{Rol1.campoDescripcionRol1Texto1}"
                                                    text="#{currentRow.value['descripcion_rol']}"/>
                                                <webuijsf:message id="messageDescripcionRol1"
                                                    for="campoDescripcionRol1"/>
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
                                                        binding="#{Rol1.etiquetaTextoFilasPorPagina1}" 
                                                        for="textoFilasPorPagina1"
                                                        id="etiquetaTextoFilasPorPagina1" 
                                                        text="#{Rol1.gestor.i18n.textoEtiquetaTextoFilasPorPagina}"/>
                                                </h:panelGrid>
                                                <h:panelGrid 
                                                    columns="3" 
                                                    id="gridPanel107">
                                                    <webuijsf:textField 
                                                        binding="#{Rol1.textoFilasPorPagina1}" 
                                                        columns="2"
                                                        converter="#{Rol1.textoFilasPorPagina1Converter1}"
                                                        disabled="#{Rol1.gestor.paginacionInhabilitada}" 
                                                        id="textoFilasPorPagina1" maxLength="2"
                                                        text="#{Rol1.gestor.filasPorPagina}" 
                                                        validatorExpression="#{Rol1.textoFilasPorPagina1Validator1.validate}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{Rol1.botonRepaginar1_action}"
                                                        binding="#{Rol1.botonRepaginar1}" 
                                                        id="botonRepaginar1"
                                                        imageURL="#{Rol1.gestor.urlImagenRepaginar}" 
                                                        onClick="#{Rol1.gestor.scriptRepaginar}"
                                                        text="#{Rol1.gestor.i18n.textoBotonRepaginar}"
                                                        toolTip="#{Rol1.gestor.i18n.toolTipBotonRepaginar}"/>
                                                    <webuijsf:message 
                                                        for="textoFilasPorPagina1" 
                                                        id="messageFilasPorPagina1"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="13"
                                                id="gridPanel108">
                                                <webuijsf:button
                                                    actionExpression="#{Rol1.botonAgregar1_action}"
                                                    binding="#{Rol1.botonAgregar1}"
                                                    disabled="#{Rol1.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{Rol1.gestor.scriptAgregar}"
                                                    rendered="#{Rol1.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Rol1.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{Rol1.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{Rol1.listaFuncionEdicion1}"
                                                    converter="#{Rol1.converterListaFuncionEdicion1}"
                                                    disabled="#{Rol1.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{Rol1.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{Rol1.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{Rol1.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{Rol1.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Rol1.botonEditar1_action}"
                                                    binding="#{Rol1.botonEditar1}"
                                                    disabled="#{Rol1.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{Rol1.gestor.scriptEditar}"
                                                    rendered="#{Rol1.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Rol1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{Rol1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Rol1.botonEliminar1_action}"
                                                    binding="#{Rol1.botonEliminar1}"
                                                    disabled="#{Rol1.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{Rol1.gestor.scriptEliminar}"
                                                    rendered="#{Rol1.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Rol1.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{Rol1.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Rol1.botonAplicar1_action}"
                                                    binding="#{Rol1.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{Rol1.gestor.scriptAplicar}"
                                                    rendered="#{Rol1.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Rol1.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{Rol1.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Rol1.botonDeshacer1_action}"
                                                    binding="#{Rol1.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{Rol1.gestor.scriptDeshacer}"
                                                    rendered="#{Rol1.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Rol1.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{Rol1.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Rol1.botonConfirmar1_action}"
                                                    binding="#{Rol1.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{Rol1.gestor.scriptConfirmar}"
                                                    rendered="#{Rol1.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Rol1.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{Rol1.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Rol1.botonDescartar1_action}"
                                                    binding="#{Rol1.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{Rol1.gestor.scriptDescartar}"
                                                    rendered="#{Rol1.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Rol1.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{Rol1.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{Rol1.listaFuncionAccion1}"
                                                    converter="#{Rol1.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{Rol1.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{Rol1.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{Rol1.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{Rol1.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Rol1.botonProcesar1_action}"
                                                    binding="#{Rol1.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{Rol1.gestor.scriptProcesar}"
                                                    rendered="#{Rol1.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Rol1.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{Rol1.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Rol1.botonRefrescar1_action}"
                                                    binding="#{Rol1.botonRefrescar1}"
                                                    disabled="#{Rol1.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{Rol1.gestor.scriptRefrescar}"
                                                    rendered="#{Rol1.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Rol1.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{Rol1.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Rol1.botonReconsultar1_action}"
                                                    binding="#{Rol1.botonReconsultar1}"
                                                    disabled="#{Rol1.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{Rol1.gestor.scriptReconsultar}"
                                                    rendered="#{Rol1.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Rol1.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{Rol1.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Rol1.botonRetornar1_action}"
                                                    binding="#{Rol1.botonRetornar1}"
                                                    disabled="#{Rol1.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{Rol1.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{Rol1.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Rol1.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{Rol1.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="5" 
                                                id="gridPanel109"
                                                rendered="#{Rol1.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{Rol1.imageHyperlink1_action}"
                                                    binding="#{Rol1.imageHyperlink1}"
                                                    disabled="#{Rol1.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{Rol1.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{Rol1.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.Rol1_imageHyperlink1_toolTip}"/>
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{Rol1.imageHyperlink2_action}"
                                                    binding="#{Rol1.imageHyperlink2}"
                                                    disabled="#{Rol1.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink2"
                                                    imageURL="#{Rol1.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{Rol1.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    text="Hyperlink2"
                                                    toolTip="#{bundle.Rol1_imageHyperlink2_toolTip}"/>
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{Rol1.imageHyperlink3_action}"
                                                    binding="#{Rol1.imageHyperlink3}"
                                                    disabled="#{Rol1.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink3"
                                                    imageURL="#{Rol1.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{Rol1.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    text="Hyperlink3"
                                                    toolTip="#{bundle.Rol1_imageHyperlink3_toolTip}"/>
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{Rol1.imageHyperlink4_action}"
                                                    binding="#{Rol1.imageHyperlink4}"
                                                    disabled="#{Rol1.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink4"
                                                    imageURL="#{Rol1.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{Rol1.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    text="Hyperlink4"
                                                    toolTip="#{bundle.Rol1_imageHyperlink4_toolTip}"/>
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{Rol1.imageHyperlink5_action}"
                                                    binding="#{Rol1.imageHyperlink5}"
                                                    disabled="#{Rol1.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink5"
                                                    imageURL="#{Rol1.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{Rol1.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{Rol1.gestor.designing}"
                                                    text="Hyperlink5"
                                                    toolTip="#{bundle.Rol1_imageHyperlink5_toolTip}"/>
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
