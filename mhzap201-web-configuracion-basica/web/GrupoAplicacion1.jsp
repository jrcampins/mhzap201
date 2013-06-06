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
                    focus="#{GrupoAplicacion1.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{GrupoAplicacion1.gestor.preserveFocus}"
                    preserveScroll="#{GrupoAplicacion1.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{GrupoAplicacion1.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | checkbox1 campoIdGrupoAplicacion1 campoCodigoGrupoAplicacion1 campoNombreGrupoAplicacion1 campoDescripcionGrupoAplicacion1 textoFilasPorPagina1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | textoFilasPorPagina1 | botonRepaginar1 , virtualForm3 | checkbox1 listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonEscogerFila1 botonDetallarFila1 botonProcesarFila1 botonRetornarFila1 botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{GrupoAplicacion1.breadcrumbs1}" 
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
                                                    rendered="#{GrupoAplicacion1.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{GrupoAplicacion1.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{GrupoAplicacion1.gestor.mensajeDisponible}"
                                                    text="#{GrupoAplicacion1.gestor.mensaje}"
                                                    url="#{GrupoAplicacion1.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:table
                                            binding="#{GrupoAplicacion1.table1}"
                                            clearSortButton="true" 
                                            deselectMultipleButton="true" 
                                            id="table1"
                                            paginateButton="false"
                                            paginationControls="true" 
                                            selectMultipleButton="true" 
                                            sortPanelToggleButton="true"
                                            width="960">
                                            <webuijsf:tableRowGroup 
                                                binding="#{GrupoAplicacion1.tableRowGroup1}" 
                                                id="tableRowGroup1" 
                                                rows="1"
                                                selected="#{GrupoAplicacion1.gestor.filaEscogida}" 
                                                sourceData="#{GrupoAplicacion1.grupoAplicacionDataProvider}" 
                                                sourceVar="currentRow">
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    id="tableRowGroup1SelectionColumn"
                                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);" 
                                                    selectId="checkbox1">
                                                    <webuijsf:checkbox 
                                                        binding="#{GrupoAplicacion1.checkbox1}" 
                                                        id="checkbox1"
                                                        onClick="#{GrupoAplicacion1.gestor.scriptElegir}" 
                                                        selected="#{GrupoAplicacion1.gestor.filaElegida}" 
                                                        toolTip="#{GrupoAplicacion1.gestor.i18n.toolTipCheckboxSeleccionMultiple}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    binding="#{GrupoAplicacion1.tableColumn1}" 
                                                    id="tableColumn1">
                                                    <webuijsf:button 
                                                        actionExpression="#{GrupoAplicacion1.botonEscogerFila1_action}"
                                                        binding="#{GrupoAplicacion1.botonEscogerFila1}"
                                                        disabled="#{GrupoAplicacion1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonEscogerFila1"
                                                        imageURL="#{GrupoAplicacion1.gestor.urlImagenEscoger}" 
                                                        onClick="#{GrupoAplicacion1.gestor.scriptEscoger}"
                                                        text="#{GrupoAplicacion1.gestor.i18n.textoBotonEscogerFila}"
                                                        toolTip="#{GrupoAplicacion1.gestor.i18n.toolTipBotonEscogerFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{GrupoAplicacion1.botonDetallarFila1_action}"
                                                        binding="#{GrupoAplicacion1.botonDetallarFila1}"
                                                        disabled="#{GrupoAplicacion1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonDetallarFila1"
                                                        imageURL="#{GrupoAplicacion1.gestor.urlImagenDetallar}" 
                                                        onClick="#{GrupoAplicacion1.scriptAbrirVentanaVerDetalle}"
                                                        rendered="#{GrupoAplicacion1.gestor.detalleDisponible}" 
                                                        text="#{GrupoAplicacion1.gestor.i18n.textoBotonDetallarFila}"
                                                        toolTip="#{GrupoAplicacion1.gestor.i18n.toolTipBotonDetallarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{GrupoAplicacion1.botonProcesarFila1_action}"
                                                        binding="#{GrupoAplicacion1.botonProcesarFila1}"
                                                        disabled="#{GrupoAplicacion1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonProcesarFila1"
                                                        imageURL="#{GrupoAplicacion1.gestor.urlImagenProcesar}" 
                                                        onClick="#{GrupoAplicacion1.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{GrupoAplicacion1.asistente.comandoDisponible}" 
                                                        text="#{GrupoAplicacion1.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{GrupoAplicacion1.gestor.i18n.toolTipBotonProcesarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{GrupoAplicacion1.botonRetornarFila1_action}"
                                                        binding="#{GrupoAplicacion1.botonRetornarFila1}" 
                                                        disabled="#{GrupoAplicacion1.gestor.funcionReturnInhabilitada}"
                                                        id="botonRetornarFila1"
                                                        imageURL="#{GrupoAplicacion1.gestor.urlImagenRetornar}"
                                                        onClick="#{GrupoAplicacion1.gestor.scriptRetornarRecursoActual}"
                                                        rendered="#{GrupoAplicacion1.gestor.funcionReturnVisible}" 
                                                        text="#{GrupoAplicacion1.gestor.i18n.textoBotonRetornarFila}"
                                                        toolTip="#{GrupoAplicacion1.gestor.i18n.toolTipBotonRetornarFila}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{GrupoAplicacion1.tableColumn2}"
                                                    id="tableColumn2"
                                                    rendered="#{GrupoAplicacion1.gestor.designing}">
                                                    <webuijsf:imageHyperlink
                                                        actionExpression="#{GrupoAplicacion1.hipervinculoAccionFila1_action}"
                                                        binding="#{GrupoAplicacion1.hipervinculoAccionFila1}"
                                                        disabled="#{GrupoAplicacion1.gestor.loteConCambios}"
                                                        id="hipervinculoAccionFila1"
                                                        imageURL="#{GrupoAplicacion1.gestor.urlImagenEjecutarVinculo}"
                                                        onClick="#{GrupoAplicacion1.scriptAbrirVentanaAccionFila1}"
                                                        text="Accion1"
                                                        toolTip="#{bundle.GrupoAplicacion1_hipervinculoAccionFila1_toolTip}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="right" 
                                                    binding="#{GrupoAplicacion1.tableColumn3}" 
                                                    headerText="#{GrupoAplicacion1.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{GrupoAplicacion1.gestor.i18n.toolTipEtiquetaIdentificacionFila}"
                                                    id="tableColumn3">
                                                    <webuijsf:imageHyperlink 
                                                        actionExpression="#{GrupoAplicacion1.hipervinculoDetallarFila1_action}"
                                                        binding="#{GrupoAplicacion1.hipervinculoDetallarFila1}" 
                                                        id="hipervinculoDetallarFila1"
                                                        imageURL="#{GrupoAplicacion1.gestor.urlImagenFilaProcesada}"
                                                        textPosition="left" 
                                                        text="#{GrupoAplicacion1.gestor.identificacionFila}" 
                                                        toolTip="#{GrupoAplicacion1.gestor.toolTipImagenFilaProcesada}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{GrupoAplicacion1.tableColumnIdGrupoAplicacion1}"
                                                    toolTip="BundleParametros.id_grupo_aplicacion.grupo_aplicacion"
                                                    headerText="identificaci&#243;n"
                                                    id="tableColumnIdGrupoAplicacion1"
                                                    sort="id_grupo_aplicacion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdGrupoAplicacion1"
                                                    text="#{currentRow.value['id_grupo_aplicacion']}"
                                                    rendered="#{GrupoAplicacion1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{GrupoAplicacion1.labelIdGrupoAplicacion1}"
                                                    id="labelIdGrupoAplicacion1"
                                                    for="campoIdGrupoAplicacion1"/>
                                                <webuijsf:textField id="campoIdGrupoAplicacion1"
                                                    binding="#{GrupoAplicacion1.campoIdGrupoAplicacion1}"
                                                    converter="#{GrupoAplicacion1.converterIdGrupoAplicacion1}"
                                                    readOnly="#{GrupoAplicacion1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['id_grupo_aplicacion']}"
                                                    toolTip="BundleParametros.id_grupo_aplicacion.grupo_aplicacion"
                                                    validatorExpression="#{GrupoAplicacion1.validatorIdGrupoAplicacion1.validate}"/>
                                                <webuijsf:staticText id="campoIdGrupoAplicacion1Texto1"
                                                    binding="#{GrupoAplicacion1.campoIdGrupoAplicacion1Texto1}"
                                                    text="#{currentRow.value['id_grupo_aplicacion']}"/>
                                                <webuijsf:message id="messageIdGrupoAplicacion1"
                                                    for="campoIdGrupoAplicacion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{GrupoAplicacion1.tableColumnCodigoGrupoAplicacion1}"
                                                    toolTip="BundleParametros.codigo_grupo_aplicacion.grupo_aplicacion"
                                                    headerText="c&#243;digo"
                                                    id="tableColumnCodigoGrupoAplicacion1"
                                                    sort="codigo_grupo_aplicacion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextCodigoGrupoAplicacion1"
                                                    text="#{currentRow.value['codigo_grupo_aplicacion']}"
                                                    rendered="#{GrupoAplicacion1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{GrupoAplicacion1.labelCodigoGrupoAplicacion1}"
                                                    id="labelCodigoGrupoAplicacion1"
                                                    for="campoCodigoGrupoAplicacion1"/>
                                                <webuijsf:textField id="campoCodigoGrupoAplicacion1"
                                                    binding="#{GrupoAplicacion1.campoCodigoGrupoAplicacion1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{GrupoAplicacion1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['codigo_grupo_aplicacion']}"
                                                    toolTip="BundleParametros.codigo_grupo_aplicacion.grupo_aplicacion"
                                                    validatorExpression="#{GrupoAplicacion1.validatorCodigoGrupoAplicacion1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoGrupoAplicacion1Texto1"
                                                    binding="#{GrupoAplicacion1.campoCodigoGrupoAplicacion1Texto1}"
                                                    text="#{currentRow.value['codigo_grupo_aplicacion']}"/>
                                                <webuijsf:message id="messageCodigoGrupoAplicacion1"
                                                    for="campoCodigoGrupoAplicacion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{GrupoAplicacion1.tableColumnNombreGrupoAplicacion1}"
                                                    toolTip="BundleParametros.nombre_grupo_aplicacion.grupo_aplicacion"
                                                    headerText="nombre"
                                                    id="tableColumnNombreGrupoAplicacion1"
                                                    sort="nombre_grupo_aplicacion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNombreGrupoAplicacion1"
                                                    text="#{currentRow.value['nombre_grupo_aplicacion']}"
                                                    rendered="#{GrupoAplicacion1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{GrupoAplicacion1.labelNombreGrupoAplicacion1}"
                                                    id="labelNombreGrupoAplicacion1"
                                                    for="campoNombreGrupoAplicacion1"/>
                                                <webuijsf:textField id="campoNombreGrupoAplicacion1"
                                                    binding="#{GrupoAplicacion1.campoNombreGrupoAplicacion1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{GrupoAplicacion1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['nombre_grupo_aplicacion']}"
                                                    toolTip="BundleParametros.nombre_grupo_aplicacion.grupo_aplicacion"
                                                    validatorExpression="#{GrupoAplicacion1.validatorNombreGrupoAplicacion1.validate}"/>
                                                <webuijsf:staticText id="campoNombreGrupoAplicacion1Texto1"
                                                    binding="#{GrupoAplicacion1.campoNombreGrupoAplicacion1Texto1}"
                                                    text="#{currentRow.value['nombre_grupo_aplicacion']}"/>
                                                <webuijsf:message id="messageNombreGrupoAplicacion1"
                                                    for="campoNombreGrupoAplicacion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{GrupoAplicacion1.tableColumnDescripcionGrupoAplicacion1}"
                                                    toolTip="BundleParametros.descripcion_grupo_aplicacion.grupo_aplicacion"
                                                    headerText="descripci&#243;n"
                                                    id="tableColumnDescripcionGrupoAplicacion1" rendered="false"
                                                    sort="descripcion_grupo_aplicacion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextDescripcionGrupoAplicacion1"
                                                    text="#{currentRow.value['descripcion_grupo_aplicacion']}"
                                                    rendered="#{GrupoAplicacion1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{GrupoAplicacion1.labelDescripcionGrupoAplicacion1}"
                                                    id="labelDescripcionGrupoAplicacion1"
                                                    for="campoDescripcionGrupoAplicacion1"/>
                                                <webuijsf:textArea id="campoDescripcionGrupoAplicacion1"
                                                    binding="#{GrupoAplicacion1.campoDescripcionGrupoAplicacion1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{GrupoAplicacion1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['descripcion_grupo_aplicacion']}"
                                                    toolTip="BundleParametros.descripcion_grupo_aplicacion.grupo_aplicacion"
                                                    validatorExpression="#{GrupoAplicacion1.validatorDescripcionGrupoAplicacion1.validate}"/>
                                                <webuijsf:staticText id="campoDescripcionGrupoAplicacion1Texto1"
                                                    binding="#{GrupoAplicacion1.campoDescripcionGrupoAplicacion1Texto1}"
                                                    text="#{currentRow.value['descripcion_grupo_aplicacion']}"/>
                                                <webuijsf:message id="messageDescripcionGrupoAplicacion1"
                                                    for="campoDescripcionGrupoAplicacion1"/>
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
                                                        binding="#{GrupoAplicacion1.etiquetaTextoFilasPorPagina1}" 
                                                        for="textoFilasPorPagina1"
                                                        id="etiquetaTextoFilasPorPagina1" 
                                                        text="#{GrupoAplicacion1.gestor.i18n.textoEtiquetaTextoFilasPorPagina}"/>
                                                </h:panelGrid>
                                                <h:panelGrid 
                                                    columns="3" 
                                                    id="gridPanel107">
                                                    <webuijsf:textField 
                                                        binding="#{GrupoAplicacion1.textoFilasPorPagina1}" 
                                                        columns="2"
                                                        converter="#{GrupoAplicacion1.textoFilasPorPagina1Converter1}"
                                                        disabled="#{GrupoAplicacion1.gestor.paginacionInhabilitada}" 
                                                        id="textoFilasPorPagina1" maxLength="2"
                                                        text="#{GrupoAplicacion1.gestor.filasPorPagina}" 
                                                        validatorExpression="#{GrupoAplicacion1.textoFilasPorPagina1Validator1.validate}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{GrupoAplicacion1.botonRepaginar1_action}"
                                                        binding="#{GrupoAplicacion1.botonRepaginar1}" 
                                                        id="botonRepaginar1"
                                                        imageURL="#{GrupoAplicacion1.gestor.urlImagenRepaginar}" 
                                                        onClick="#{GrupoAplicacion1.gestor.scriptRepaginar}"
                                                        text="#{GrupoAplicacion1.gestor.i18n.textoBotonRepaginar}"
                                                        toolTip="#{GrupoAplicacion1.gestor.i18n.toolTipBotonRepaginar}"/>
                                                    <webuijsf:message 
                                                        for="textoFilasPorPagina1" 
                                                        id="messageFilasPorPagina1"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="13"
                                                id="gridPanel108">
                                                <webuijsf:button
                                                    actionExpression="#{GrupoAplicacion1.botonAgregar1_action}"
                                                    binding="#{GrupoAplicacion1.botonAgregar1}"
                                                    disabled="#{GrupoAplicacion1.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{GrupoAplicacion1.gestor.scriptAgregar}"
                                                    rendered="#{GrupoAplicacion1.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{GrupoAplicacion1.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{GrupoAplicacion1.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{GrupoAplicacion1.listaFuncionEdicion1}"
                                                    converter="#{GrupoAplicacion1.converterListaFuncionEdicion1}"
                                                    disabled="#{GrupoAplicacion1.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{GrupoAplicacion1.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{GrupoAplicacion1.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{GrupoAplicacion1.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{GrupoAplicacion1.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{GrupoAplicacion1.botonEditar1_action}"
                                                    binding="#{GrupoAplicacion1.botonEditar1}"
                                                    disabled="#{GrupoAplicacion1.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{GrupoAplicacion1.gestor.scriptEditar}"
                                                    rendered="#{GrupoAplicacion1.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{GrupoAplicacion1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{GrupoAplicacion1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{GrupoAplicacion1.botonEliminar1_action}"
                                                    binding="#{GrupoAplicacion1.botonEliminar1}"
                                                    disabled="#{GrupoAplicacion1.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{GrupoAplicacion1.gestor.scriptEliminar}"
                                                    rendered="#{GrupoAplicacion1.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{GrupoAplicacion1.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{GrupoAplicacion1.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{GrupoAplicacion1.botonAplicar1_action}"
                                                    binding="#{GrupoAplicacion1.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{GrupoAplicacion1.gestor.scriptAplicar}"
                                                    rendered="#{GrupoAplicacion1.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{GrupoAplicacion1.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{GrupoAplicacion1.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{GrupoAplicacion1.botonDeshacer1_action}"
                                                    binding="#{GrupoAplicacion1.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{GrupoAplicacion1.gestor.scriptDeshacer}"
                                                    rendered="#{GrupoAplicacion1.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{GrupoAplicacion1.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{GrupoAplicacion1.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{GrupoAplicacion1.botonConfirmar1_action}"
                                                    binding="#{GrupoAplicacion1.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{GrupoAplicacion1.gestor.scriptConfirmar}"
                                                    rendered="#{GrupoAplicacion1.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{GrupoAplicacion1.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{GrupoAplicacion1.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{GrupoAplicacion1.botonDescartar1_action}"
                                                    binding="#{GrupoAplicacion1.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{GrupoAplicacion1.gestor.scriptDescartar}"
                                                    rendered="#{GrupoAplicacion1.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{GrupoAplicacion1.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{GrupoAplicacion1.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{GrupoAplicacion1.listaFuncionAccion1}"
                                                    converter="#{GrupoAplicacion1.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{GrupoAplicacion1.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{GrupoAplicacion1.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{GrupoAplicacion1.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{GrupoAplicacion1.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{GrupoAplicacion1.botonProcesar1_action}"
                                                    binding="#{GrupoAplicacion1.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{GrupoAplicacion1.gestor.scriptProcesar}"
                                                    rendered="#{GrupoAplicacion1.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{GrupoAplicacion1.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{GrupoAplicacion1.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{GrupoAplicacion1.botonRefrescar1_action}"
                                                    binding="#{GrupoAplicacion1.botonRefrescar1}"
                                                    disabled="#{GrupoAplicacion1.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{GrupoAplicacion1.gestor.scriptRefrescar}"
                                                    rendered="#{GrupoAplicacion1.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{GrupoAplicacion1.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{GrupoAplicacion1.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{GrupoAplicacion1.botonReconsultar1_action}"
                                                    binding="#{GrupoAplicacion1.botonReconsultar1}"
                                                    disabled="#{GrupoAplicacion1.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{GrupoAplicacion1.gestor.scriptReconsultar}"
                                                    rendered="#{GrupoAplicacion1.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{GrupoAplicacion1.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{GrupoAplicacion1.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{GrupoAplicacion1.botonRetornar1_action}"
                                                    binding="#{GrupoAplicacion1.botonRetornar1}"
                                                    disabled="#{GrupoAplicacion1.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{GrupoAplicacion1.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{GrupoAplicacion1.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{GrupoAplicacion1.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{GrupoAplicacion1.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="2" 
                                                id="gridPanel109"
                                                rendered="#{GrupoAplicacion1.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{GrupoAplicacion1.imageHyperlink1_action}"
                                                    binding="#{GrupoAplicacion1.imageHyperlink1}"
                                                    disabled="#{GrupoAplicacion1.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{GrupoAplicacion1.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{GrupoAplicacion1.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.GrupoAplicacion1_imageHyperlink1_toolTip}"/>
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{GrupoAplicacion1.imageHyperlink2_action}"
                                                    binding="#{GrupoAplicacion1.imageHyperlink2}"
                                                    disabled="#{GrupoAplicacion1.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink2"
                                                    imageURL="#{GrupoAplicacion1.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{GrupoAplicacion1.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{GrupoAplicacion1.gestor.designing}"
                                                    text="Hyperlink2"
                                                    toolTip="#{bundle.GrupoAplicacion1_imageHyperlink2_toolTip}"/>
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
