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
                    focus="#{ProveedorDatExt1.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{ProveedorDatExt1.gestor.preserveFocus}"
                    preserveScroll="#{ProveedorDatExt1.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{ProveedorDatExt1.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | checkbox1 campoIdProveedorDatExt1 campoCodigoProveedorDatExt1 campoNombreProveedorDatExt1 textoFilasPorPagina1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | textoFilasPorPagina1 | botonRepaginar1 , virtualForm3 | checkbox1 listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonEscogerFila1 botonDetallarFila1 botonProcesarFila1 botonRetornarFila1 botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{ProveedorDatExt1.breadcrumbs1}" 
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
                                                    rendered="#{ProveedorDatExt1.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{ProveedorDatExt1.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{ProveedorDatExt1.gestor.mensajeDisponible}"
                                                    text="#{ProveedorDatExt1.gestor.mensaje}"
                                                    url="#{ProveedorDatExt1.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:table
                                            binding="#{ProveedorDatExt1.table1}"
                                            clearSortButton="true" 
                                            deselectMultipleButton="true" 
                                            id="table1"
                                            paginateButton="false"
                                            paginationControls="true" 
                                            selectMultipleButton="true" 
                                            sortPanelToggleButton="true"
                                            width="960">
                                            <webuijsf:tableRowGroup 
                                                binding="#{ProveedorDatExt1.tableRowGroup1}" 
                                                id="tableRowGroup1" 
                                                rows="1"
                                                selected="#{ProveedorDatExt1.gestor.filaEscogida}" 
                                                sourceData="#{ProveedorDatExt1.proveedorDatExtDataProvider}" 
                                                sourceVar="currentRow">
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    id="tableRowGroup1SelectionColumn"
                                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);" 
                                                    selectId="checkbox1">
                                                    <webuijsf:checkbox 
                                                        binding="#{ProveedorDatExt1.checkbox1}" 
                                                        id="checkbox1"
                                                        onClick="#{ProveedorDatExt1.gestor.scriptElegir}" 
                                                        selected="#{ProveedorDatExt1.gestor.filaElegida}" 
                                                        toolTip="#{ProveedorDatExt1.gestor.i18n.toolTipCheckboxSeleccionMultiple}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    binding="#{ProveedorDatExt1.tableColumn1}" 
                                                    id="tableColumn1">
                                                    <webuijsf:button 
                                                        actionExpression="#{ProveedorDatExt1.botonEscogerFila1_action}"
                                                        binding="#{ProveedorDatExt1.botonEscogerFila1}"
                                                        disabled="#{ProveedorDatExt1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonEscogerFila1"
                                                        imageURL="#{ProveedorDatExt1.gestor.urlImagenEscoger}" 
                                                        onClick="#{ProveedorDatExt1.gestor.scriptEscoger}"
                                                        text="#{ProveedorDatExt1.gestor.i18n.textoBotonEscogerFila}"
                                                        toolTip="#{ProveedorDatExt1.gestor.i18n.toolTipBotonEscogerFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{ProveedorDatExt1.botonDetallarFila1_action}"
                                                        binding="#{ProveedorDatExt1.botonDetallarFila1}"
                                                        disabled="#{ProveedorDatExt1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonDetallarFila1"
                                                        imageURL="#{ProveedorDatExt1.gestor.urlImagenDetallar}" 
                                                        onClick="#{ProveedorDatExt1.scriptAbrirVentanaVerDetalle}"
                                                        rendered="#{ProveedorDatExt1.gestor.detalleDisponible}" 
                                                        text="#{ProveedorDatExt1.gestor.i18n.textoBotonDetallarFila}"
                                                        toolTip="#{ProveedorDatExt1.gestor.i18n.toolTipBotonDetallarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{ProveedorDatExt1.botonProcesarFila1_action}"
                                                        binding="#{ProveedorDatExt1.botonProcesarFila1}"
                                                        disabled="#{ProveedorDatExt1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonProcesarFila1"
                                                        imageURL="#{ProveedorDatExt1.gestor.urlImagenProcesar}" 
                                                        onClick="#{ProveedorDatExt1.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{ProveedorDatExt1.asistente.comandoDisponible}" 
                                                        text="#{ProveedorDatExt1.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{ProveedorDatExt1.gestor.i18n.toolTipBotonProcesarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{ProveedorDatExt1.botonRetornarFila1_action}"
                                                        binding="#{ProveedorDatExt1.botonRetornarFila1}" 
                                                        disabled="#{ProveedorDatExt1.gestor.funcionReturnInhabilitada}"
                                                        id="botonRetornarFila1"
                                                        imageURL="#{ProveedorDatExt1.gestor.urlImagenRetornar}"
                                                        onClick="#{ProveedorDatExt1.gestor.scriptRetornarRecursoActual}"
                                                        rendered="#{ProveedorDatExt1.gestor.funcionReturnVisible}" 
                                                        text="#{ProveedorDatExt1.gestor.i18n.textoBotonRetornarFila}"
                                                        toolTip="#{ProveedorDatExt1.gestor.i18n.toolTipBotonRetornarFila}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ProveedorDatExt1.tableColumn2}"
                                                    id="tableColumn2"
                                                    rendered="#{ProveedorDatExt1.gestor.designing}">
                                                    <webuijsf:imageHyperlink
                                                        actionExpression="#{ProveedorDatExt1.hipervinculoAccionFila1_action}"
                                                        binding="#{ProveedorDatExt1.hipervinculoAccionFila1}"
                                                        disabled="#{ProveedorDatExt1.gestor.loteConCambios}"
                                                        id="hipervinculoAccionFila1"
                                                        imageURL="#{ProveedorDatExt1.gestor.urlImagenEjecutarVinculo}"
                                                        onClick="#{ProveedorDatExt1.scriptAbrirVentanaAccionFila1}"
                                                        text="Accion1"
                                                        toolTip="#{bundle.ProveedorDatExt1_hipervinculoAccionFila1_toolTip}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="right" 
                                                    binding="#{ProveedorDatExt1.tableColumn3}" 
                                                    headerText="#{ProveedorDatExt1.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{ProveedorDatExt1.gestor.i18n.toolTipEtiquetaIdentificacionFila}"
                                                    id="tableColumn3">
                                                    <webuijsf:imageHyperlink 
                                                        actionExpression="#{ProveedorDatExt1.hipervinculoDetallarFila1_action}"
                                                        binding="#{ProveedorDatExt1.hipervinculoDetallarFila1}" 
                                                        id="hipervinculoDetallarFila1"
                                                        imageURL="#{ProveedorDatExt1.gestor.urlImagenFilaProcesada}"
                                                        textPosition="left" 
                                                        text="#{ProveedorDatExt1.gestor.identificacionFila}" 
                                                        toolTip="#{ProveedorDatExt1.gestor.toolTipImagenFilaProcesada}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ProveedorDatExt1.tableColumnIdProveedorDatExt1}"
                                                    toolTip="BundleParametros.id_proveedor_dat_ext.proveedor_dat_ext"
                                                    headerText="identificaci&#243;n"
                                                    id="tableColumnIdProveedorDatExt1" rendered="false"
                                                    sort="id_proveedor_dat_ext">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdProveedorDatExt1"
                                                    text="#{currentRow.value['id_proveedor_dat_ext']}"
                                                    rendered="#{ProveedorDatExt1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ProveedorDatExt1.labelIdProveedorDatExt1}"
                                                    id="labelIdProveedorDatExt1"
                                                    for="campoIdProveedorDatExt1"/>
                                                <webuijsf:textField id="campoIdProveedorDatExt1"
                                                    binding="#{ProveedorDatExt1.campoIdProveedorDatExt1}"
                                                    converter="#{ProveedorDatExt1.converterIdProveedorDatExt1}"
                                                    readOnly="#{ProveedorDatExt1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['id_proveedor_dat_ext']}"
                                                    toolTip="BundleParametros.id_proveedor_dat_ext.proveedor_dat_ext"
                                                    validatorExpression="#{ProveedorDatExt1.validatorIdProveedorDatExt1.validate}"/>
                                                <webuijsf:staticText id="campoIdProveedorDatExt1Texto1"
                                                    binding="#{ProveedorDatExt1.campoIdProveedorDatExt1Texto1}"
                                                    text="#{currentRow.value['id_proveedor_dat_ext']}"/>
                                                <webuijsf:message id="messageIdProveedorDatExt1"
                                                    for="campoIdProveedorDatExt1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ProveedorDatExt1.tableColumnCodigoProveedorDatExt1}"
                                                    toolTip="BundleParametros.codigo_proveedor_dat_ext.proveedor_dat_ext"
                                                    headerText="c&#243;digo"
                                                    id="tableColumnCodigoProveedorDatExt1"
                                                    sort="codigo_proveedor_dat_ext">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextCodigoProveedorDatExt1"
                                                    text="#{currentRow.value['codigo_proveedor_dat_ext']}"
                                                    rendered="#{ProveedorDatExt1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ProveedorDatExt1.labelCodigoProveedorDatExt1}"
                                                    id="labelCodigoProveedorDatExt1"
                                                    for="campoCodigoProveedorDatExt1"/>
                                                <webuijsf:textField id="campoCodigoProveedorDatExt1"
                                                    binding="#{ProveedorDatExt1.campoCodigoProveedorDatExt1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{ProveedorDatExt1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['codigo_proveedor_dat_ext']}"
                                                    toolTip="BundleParametros.codigo_proveedor_dat_ext.proveedor_dat_ext"
                                                    validatorExpression="#{ProveedorDatExt1.validatorCodigoProveedorDatExt1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoProveedorDatExt1Texto1"
                                                    binding="#{ProveedorDatExt1.campoCodigoProveedorDatExt1Texto1}"
                                                    text="#{currentRow.value['codigo_proveedor_dat_ext']}"/>
                                                <webuijsf:message id="messageCodigoProveedorDatExt1"
                                                    for="campoCodigoProveedorDatExt1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ProveedorDatExt1.tableColumnNombreProveedorDatExt1}"
                                                    toolTip="BundleParametros.nombre_proveedor_dat_ext.proveedor_dat_ext"
                                                    headerText="nombre"
                                                    id="tableColumnNombreProveedorDatExt1"
                                                    sort="nombre_proveedor_dat_ext">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNombreProveedorDatExt1"
                                                    text="#{currentRow.value['nombre_proveedor_dat_ext']}"
                                                    rendered="#{ProveedorDatExt1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ProveedorDatExt1.labelNombreProveedorDatExt1}"
                                                    id="labelNombreProveedorDatExt1"
                                                    for="campoNombreProveedorDatExt1"/>
                                                <webuijsf:textField id="campoNombreProveedorDatExt1"
                                                    binding="#{ProveedorDatExt1.campoNombreProveedorDatExt1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{ProveedorDatExt1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['nombre_proveedor_dat_ext']}"
                                                    toolTip="BundleParametros.nombre_proveedor_dat_ext.proveedor_dat_ext"
                                                    validatorExpression="#{ProveedorDatExt1.validatorNombreProveedorDatExt1.validate}"/>
                                                <webuijsf:staticText id="campoNombreProveedorDatExt1Texto1"
                                                    binding="#{ProveedorDatExt1.campoNombreProveedorDatExt1Texto1}"
                                                    text="#{currentRow.value['nombre_proveedor_dat_ext']}"/>
                                                <webuijsf:message id="messageNombreProveedorDatExt1"
                                                    for="campoNombreProveedorDatExt1"/>
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
                                                        binding="#{ProveedorDatExt1.etiquetaTextoFilasPorPagina1}" 
                                                        for="textoFilasPorPagina1"
                                                        id="etiquetaTextoFilasPorPagina1" 
                                                        text="#{ProveedorDatExt1.gestor.i18n.textoEtiquetaTextoFilasPorPagina}"/>
                                                </h:panelGrid>
                                                <h:panelGrid 
                                                    columns="3" 
                                                    id="gridPanel107">
                                                    <webuijsf:textField 
                                                        binding="#{ProveedorDatExt1.textoFilasPorPagina1}" 
                                                        columns="2"
                                                        converter="#{ProveedorDatExt1.textoFilasPorPagina1Converter1}"
                                                        disabled="#{ProveedorDatExt1.gestor.paginacionInhabilitada}" 
                                                        id="textoFilasPorPagina1" maxLength="2"
                                                        text="#{ProveedorDatExt1.gestor.filasPorPagina}" 
                                                        validatorExpression="#{ProveedorDatExt1.textoFilasPorPagina1Validator1.validate}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{ProveedorDatExt1.botonRepaginar1_action}"
                                                        binding="#{ProveedorDatExt1.botonRepaginar1}" 
                                                        id="botonRepaginar1"
                                                        imageURL="#{ProveedorDatExt1.gestor.urlImagenRepaginar}" 
                                                        onClick="#{ProveedorDatExt1.gestor.scriptRepaginar}"
                                                        text="#{ProveedorDatExt1.gestor.i18n.textoBotonRepaginar}"
                                                        toolTip="#{ProveedorDatExt1.gestor.i18n.toolTipBotonRepaginar}"/>
                                                    <webuijsf:message 
                                                        for="textoFilasPorPagina1" 
                                                        id="messageFilasPorPagina1"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="13"
                                                id="gridPanel108">
                                                <webuijsf:button
                                                    actionExpression="#{ProveedorDatExt1.botonAgregar1_action}"
                                                    binding="#{ProveedorDatExt1.botonAgregar1}"
                                                    disabled="#{ProveedorDatExt1.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{ProveedorDatExt1.gestor.scriptAgregar}"
                                                    rendered="#{ProveedorDatExt1.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ProveedorDatExt1.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{ProveedorDatExt1.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{ProveedorDatExt1.listaFuncionEdicion1}"
                                                    converter="#{ProveedorDatExt1.converterListaFuncionEdicion1}"
                                                    disabled="#{ProveedorDatExt1.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{ProveedorDatExt1.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{ProveedorDatExt1.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{ProveedorDatExt1.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{ProveedorDatExt1.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ProveedorDatExt1.botonEditar1_action}"
                                                    binding="#{ProveedorDatExt1.botonEditar1}"
                                                    disabled="#{ProveedorDatExt1.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{ProveedorDatExt1.gestor.scriptEditar}"
                                                    rendered="#{ProveedorDatExt1.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ProveedorDatExt1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{ProveedorDatExt1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ProveedorDatExt1.botonEliminar1_action}"
                                                    binding="#{ProveedorDatExt1.botonEliminar1}"
                                                    disabled="#{ProveedorDatExt1.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{ProveedorDatExt1.gestor.scriptEliminar}"
                                                    rendered="#{ProveedorDatExt1.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ProveedorDatExt1.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{ProveedorDatExt1.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ProveedorDatExt1.botonAplicar1_action}"
                                                    binding="#{ProveedorDatExt1.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{ProveedorDatExt1.gestor.scriptAplicar}"
                                                    rendered="#{ProveedorDatExt1.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ProveedorDatExt1.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{ProveedorDatExt1.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ProveedorDatExt1.botonDeshacer1_action}"
                                                    binding="#{ProveedorDatExt1.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{ProveedorDatExt1.gestor.scriptDeshacer}"
                                                    rendered="#{ProveedorDatExt1.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ProveedorDatExt1.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{ProveedorDatExt1.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ProveedorDatExt1.botonConfirmar1_action}"
                                                    binding="#{ProveedorDatExt1.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{ProveedorDatExt1.gestor.scriptConfirmar}"
                                                    rendered="#{ProveedorDatExt1.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ProveedorDatExt1.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{ProveedorDatExt1.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ProveedorDatExt1.botonDescartar1_action}"
                                                    binding="#{ProveedorDatExt1.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{ProveedorDatExt1.gestor.scriptDescartar}"
                                                    rendered="#{ProveedorDatExt1.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ProveedorDatExt1.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{ProveedorDatExt1.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{ProveedorDatExt1.listaFuncionAccion1}"
                                                    converter="#{ProveedorDatExt1.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{ProveedorDatExt1.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{ProveedorDatExt1.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{ProveedorDatExt1.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{ProveedorDatExt1.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ProveedorDatExt1.botonProcesar1_action}"
                                                    binding="#{ProveedorDatExt1.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{ProveedorDatExt1.gestor.scriptProcesar}"
                                                    rendered="#{ProveedorDatExt1.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ProveedorDatExt1.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{ProveedorDatExt1.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ProveedorDatExt1.botonRefrescar1_action}"
                                                    binding="#{ProveedorDatExt1.botonRefrescar1}"
                                                    disabled="#{ProveedorDatExt1.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{ProveedorDatExt1.gestor.scriptRefrescar}"
                                                    rendered="#{ProveedorDatExt1.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ProveedorDatExt1.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{ProveedorDatExt1.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ProveedorDatExt1.botonReconsultar1_action}"
                                                    binding="#{ProveedorDatExt1.botonReconsultar1}"
                                                    disabled="#{ProveedorDatExt1.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{ProveedorDatExt1.gestor.scriptReconsultar}"
                                                    rendered="#{ProveedorDatExt1.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ProveedorDatExt1.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{ProveedorDatExt1.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ProveedorDatExt1.botonRetornar1_action}"
                                                    binding="#{ProveedorDatExt1.botonRetornar1}"
                                                    disabled="#{ProveedorDatExt1.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{ProveedorDatExt1.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{ProveedorDatExt1.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ProveedorDatExt1.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{ProveedorDatExt1.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel109"
                                                rendered="#{ProveedorDatExt1.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{ProveedorDatExt1.imageHyperlink1_action}"
                                                    binding="#{ProveedorDatExt1.imageHyperlink1}"
                                                    disabled="#{ProveedorDatExt1.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{ProveedorDatExt1.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{ProveedorDatExt1.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{ProveedorDatExt1.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.ProveedorDatExt1_imageHyperlink1_toolTip}"/>
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
