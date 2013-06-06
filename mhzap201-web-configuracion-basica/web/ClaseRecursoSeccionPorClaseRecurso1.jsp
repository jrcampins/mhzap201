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
                    focus="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.preserveFocus}"
                    preserveScroll="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{ClaseRecursoSeccionPorClaseRecurso1.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | checkbox1 campoIdClaseRecursoSec1 campoEtiquetaClaseRecursoSec1 campoDescripcionClaseRecursoSec1 campoOrdenPresentacion1 listaEsPestanaDetalle1 textoFilasPorPagina1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | textoFilasPorPagina1 | botonRepaginar1 , virtualForm3 | checkbox1 listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonEscogerFila1 botonDetallarFila1 botonProcesarFila1 botonRetornarFila1 botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{ClaseRecursoSeccionPorClaseRecurso1.breadcrumbs1}" 
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
                                                    rendered="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.mensajeDisponible}"
                                                    text="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.mensaje}"
                                                    url="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:table
                                            binding="#{ClaseRecursoSeccionPorClaseRecurso1.table1}"
                                            clearSortButton="true" 
                                            deselectMultipleButton="true" 
                                            id="table1"
                                            paginateButton="false"
                                            paginationControls="true" 
                                            selectMultipleButton="true" 
                                            sortPanelToggleButton="true"
                                            width="960">
                                            <webuijsf:tableRowGroup 
                                                binding="#{ClaseRecursoSeccionPorClaseRecurso1.tableRowGroup1}" 
                                                id="tableRowGroup1" 
                                                rows="1"
                                                selected="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.filaEscogida}" 
                                                sourceData="#{ClaseRecursoSeccionPorClaseRecurso1.claseRecursoSecDataProvider}" 
                                                sourceVar="currentRow">
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    id="tableRowGroup1SelectionColumn"
                                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);" 
                                                    selectId="checkbox1">
                                                    <webuijsf:checkbox 
                                                        binding="#{ClaseRecursoSeccionPorClaseRecurso1.checkbox1}" 
                                                        id="checkbox1"
                                                        onClick="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.scriptElegir}" 
                                                        selected="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.filaElegida}" 
                                                        toolTip="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.i18n.toolTipCheckboxSeleccionMultiple}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso1.tableColumn1}" 
                                                    id="tableColumn1">
                                                    <webuijsf:button 
                                                        actionExpression="#{ClaseRecursoSeccionPorClaseRecurso1.botonEscogerFila1_action}"
                                                        binding="#{ClaseRecursoSeccionPorClaseRecurso1.botonEscogerFila1}"
                                                        disabled="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonEscogerFila1"
                                                        imageURL="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.urlImagenEscoger}" 
                                                        onClick="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.scriptEscoger}"
                                                        text="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.i18n.textoBotonEscogerFila}"
                                                        toolTip="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.i18n.toolTipBotonEscogerFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{ClaseRecursoSeccionPorClaseRecurso1.botonDetallarFila1_action}"
                                                        binding="#{ClaseRecursoSeccionPorClaseRecurso1.botonDetallarFila1}"
                                                        disabled="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonDetallarFila1"
                                                        imageURL="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.urlImagenDetallar}" 
                                                        onClick="#{ClaseRecursoSeccionPorClaseRecurso1.scriptAbrirVentanaVerDetalle}"
                                                        rendered="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.detalleDisponible}" 
                                                        text="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.i18n.textoBotonDetallarFila}"
                                                        toolTip="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.i18n.toolTipBotonDetallarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{ClaseRecursoSeccionPorClaseRecurso1.botonProcesarFila1_action}"
                                                        binding="#{ClaseRecursoSeccionPorClaseRecurso1.botonProcesarFila1}"
                                                        disabled="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonProcesarFila1"
                                                        imageURL="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.urlImagenProcesar}" 
                                                        onClick="#{ClaseRecursoSeccionPorClaseRecurso1.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{ClaseRecursoSeccionPorClaseRecurso1.asistente.comandoDisponible}" 
                                                        text="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.i18n.toolTipBotonProcesarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{ClaseRecursoSeccionPorClaseRecurso1.botonRetornarFila1_action}"
                                                        binding="#{ClaseRecursoSeccionPorClaseRecurso1.botonRetornarFila1}" 
                                                        disabled="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.funcionReturnInhabilitada}"
                                                        id="botonRetornarFila1"
                                                        imageURL="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.urlImagenRetornar}"
                                                        onClick="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.scriptRetornarRecursoActual}"
                                                        rendered="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.funcionReturnVisible}" 
                                                        text="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.i18n.textoBotonRetornarFila}"
                                                        toolTip="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.i18n.toolTipBotonRetornarFila}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso1.tableColumn2}"
                                                    id="tableColumn2"
                                                    rendered="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.designing}">
                                                    <webuijsf:imageHyperlink
                                                        actionExpression="#{ClaseRecursoSeccionPorClaseRecurso1.hipervinculoAccionFila1_action}"
                                                        binding="#{ClaseRecursoSeccionPorClaseRecurso1.hipervinculoAccionFila1}"
                                                        disabled="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.loteConCambios}"
                                                        id="hipervinculoAccionFila1"
                                                        imageURL="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.urlImagenEjecutarVinculo}"
                                                        onClick="#{ClaseRecursoSeccionPorClaseRecurso1.scriptAbrirVentanaAccionFila1}"
                                                        text="Accion1"
                                                        toolTip="#{bundle.ClaseRecursoSeccionPorClaseRecurso1_hipervinculoAccionFila1_toolTip}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="right" 
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso1.tableColumn3}" 
                                                    headerText="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.i18n.toolTipEtiquetaIdentificacionFila}"
                                                    id="tableColumn3">
                                                    <webuijsf:imageHyperlink 
                                                        actionExpression="#{ClaseRecursoSeccionPorClaseRecurso1.hipervinculoDetallarFila1_action}"
                                                        binding="#{ClaseRecursoSeccionPorClaseRecurso1.hipervinculoDetallarFila1}" 
                                                        id="hipervinculoDetallarFila1"
                                                        imageURL="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.urlImagenFilaProcesada}"
                                                        textPosition="left" 
                                                        text="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.identificacionFila}" 
                                                        toolTip="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.toolTipImagenFilaProcesada}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso1.tableColumnIdClaseRecursoSec1}"
                                                    toolTip="BundleParametros.id_clase_recurso_sec.clase_recurso_sec"
                                                    headerText="identificaci&#243;n"
                                                    id="tableColumnIdClaseRecursoSec1"
                                                    sort="id_clase_recurso_sec">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdClaseRecursoSec1"
                                                    text="#{currentRow.value['id_clase_recurso_sec']}"
                                                    rendered="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso1.labelIdClaseRecursoSec1}"
                                                    id="labelIdClaseRecursoSec1"
                                                    for="campoIdClaseRecursoSec1"/>
                                                <webuijsf:textField id="campoIdClaseRecursoSec1"
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso1.campoIdClaseRecursoSec1}"
                                                    converter="#{ClaseRecursoSeccionPorClaseRecurso1.converterIdClaseRecursoSec1}"
                                                    readOnly="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['id_clase_recurso_sec']}"
                                                    toolTip="BundleParametros.id_clase_recurso_sec.clase_recurso_sec"
                                                    validatorExpression="#{ClaseRecursoSeccionPorClaseRecurso1.validatorIdClaseRecursoSec1.validate}"/>
                                                <webuijsf:staticText id="campoIdClaseRecursoSec1Texto1"
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso1.campoIdClaseRecursoSec1Texto1}"
                                                    text="#{currentRow.value['id_clase_recurso_sec']}"/>
                                                <webuijsf:message id="messageIdClaseRecursoSec1"
                                                    for="campoIdClaseRecursoSec1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso1.tableColumnEtiquetaClaseRecursoSec1}"
                                                    toolTip="BundleParametros.etiqueta_clase_recurso_sec.clase_recurso_sec"
                                                    headerText="etiqueta"
                                                    id="tableColumnEtiquetaClaseRecursoSec1"
                                                    sort="etiqueta_clase_recurso_sec">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEtiquetaClaseRecursoSec1"
                                                    text="#{currentRow.value['etiqueta_clase_recurso_sec']}"
                                                    rendered="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso1.labelEtiquetaClaseRecursoSec1}"
                                                    id="labelEtiquetaClaseRecursoSec1"
                                                    for="campoEtiquetaClaseRecursoSec1"/>
                                                <webuijsf:textField id="campoEtiquetaClaseRecursoSec1"
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso1.campoEtiquetaClaseRecursoSec1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['etiqueta_clase_recurso_sec']}"
                                                    toolTip="BundleParametros.etiqueta_clase_recurso_sec.clase_recurso_sec"
                                                    validatorExpression="#{ClaseRecursoSeccionPorClaseRecurso1.validatorEtiquetaClaseRecursoSec1.validate}"/>
                                                <webuijsf:staticText id="campoEtiquetaClaseRecursoSec1Texto1"
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso1.campoEtiquetaClaseRecursoSec1Texto1}"
                                                    text="#{currentRow.value['etiqueta_clase_recurso_sec']}"/>
                                                <webuijsf:message id="messageEtiquetaClaseRecursoSec1"
                                                    for="campoEtiquetaClaseRecursoSec1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso1.tableColumnDescripcionClaseRecursoSec1}"
                                                    toolTip="BundleParametros.descripcion_clase_recurso_sec.clase_recurso_sec"
                                                    headerText="descripci&#243;n"
                                                    id="tableColumnDescripcionClaseRecursoSec1" rendered="false"
                                                    sort="descripcion_clase_recurso_sec">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextDescripcionClaseRecursoSec1"
                                                    text="#{currentRow.value['descripcion_clase_recurso_sec']}"
                                                    rendered="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso1.labelDescripcionClaseRecursoSec1}"
                                                    id="labelDescripcionClaseRecursoSec1"
                                                    for="campoDescripcionClaseRecursoSec1"/>
                                                <webuijsf:textArea id="campoDescripcionClaseRecursoSec1"
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso1.campoDescripcionClaseRecursoSec1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['descripcion_clase_recurso_sec']}"
                                                    toolTip="BundleParametros.descripcion_clase_recurso_sec.clase_recurso_sec"
                                                    validatorExpression="#{ClaseRecursoSeccionPorClaseRecurso1.validatorDescripcionClaseRecursoSec1.validate}"/>
                                                <webuijsf:staticText id="campoDescripcionClaseRecursoSec1Texto1"
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso1.campoDescripcionClaseRecursoSec1Texto1}"
                                                    text="#{currentRow.value['descripcion_clase_recurso_sec']}"/>
                                                <webuijsf:message id="messageDescripcionClaseRecursoSec1"
                                                    for="campoDescripcionClaseRecursoSec1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso1.tableColumnOrdenPresentacion1}"
                                                    toolTip="BundleParametros.orden_presentacion.clase_recurso_sec"
                                                    headerText="orden presentaci&#243;n"
                                                    id="tableColumnOrdenPresentacion1" rendered="false"
                                                    sort="orden_presentacion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextOrdenPresentacion1"
                                                    text="#{currentRow.value['orden_presentacion']}"
                                                    rendered="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso1.labelOrdenPresentacion1}"
                                                    id="labelOrdenPresentacion1"
                                                    for="campoOrdenPresentacion1"/>
                                                <webuijsf:textField id="campoOrdenPresentacion1"
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso1.campoOrdenPresentacion1}"
                                                    converter="#{ClaseRecursoSeccionPorClaseRecurso1.converterOrdenPresentacion1}"
                                                    readOnly="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['orden_presentacion']}"
                                                    toolTip="BundleParametros.orden_presentacion.clase_recurso_sec"
                                                    validatorExpression="#{ClaseRecursoSeccionPorClaseRecurso1.validatorOrdenPresentacion1.validate}"/>
                                                <webuijsf:staticText id="campoOrdenPresentacion1Texto1"
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso1.campoOrdenPresentacion1Texto1}"
                                                    text="#{currentRow.value['orden_presentacion']}"/>
                                                <webuijsf:message id="messageOrdenPresentacion1"
                                                    for="campoOrdenPresentacion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso1.tableColumnEsPestanaDetalle1}"
                                                    toolTip="BundleParametros.es_pestana_detalle.clase_recurso_sec"
                                                    headerText="pestana detalle"
                                                    id="tableColumnEsPestanaDetalle1" rendered="false"
                                                    sort="es_pestana_detalle">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsPestanaDetalle1"
                                                    text="#{currentRow.value['es_pestana_detalle']}"
                                                    rendered="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso1.labelEsPestanaDetalle1}"
                                                    id="labelEsPestanaDetalle1"
                                                    for="listaEsPestanaDetalle1"/>
                                                <webuijsf:dropDown id="listaEsPestanaDetalle1"
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso1.listaEsPestanaDetalle1}"
                                                    converter="#{ClaseRecursoSeccionPorClaseRecurso1.converterEsPestanaDetalle1}"
                                                    disabled="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.filaNoProcesada}" required="true"
                                                    items="#{ClaseRecursoSeccionPorClaseRecurso1.asistente.opcionesListaEsPestanaDetalle1}"
                                                    selected="#{currentRow.value['es_pestana_detalle']}"
                                                    toolTip="BundleParametros.es_pestana_detalle.clase_recurso_sec"/>
                                                <webuijsf:staticText id="listaEsPestanaDetalle1Texto1"
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso1.listaEsPestanaDetalle1Texto1}"/>
                                                <webuijsf:message id="messageEsPestanaDetalle1"
                                                    for="listaEsPestanaDetalle1"/>
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
                                                        binding="#{ClaseRecursoSeccionPorClaseRecurso1.etiquetaTextoFilasPorPagina1}" 
                                                        for="textoFilasPorPagina1"
                                                        id="etiquetaTextoFilasPorPagina1" 
                                                        text="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.i18n.textoEtiquetaTextoFilasPorPagina}"/>
                                                </h:panelGrid>
                                                <h:panelGrid 
                                                    columns="3" 
                                                    id="gridPanel107">
                                                    <webuijsf:textField 
                                                        binding="#{ClaseRecursoSeccionPorClaseRecurso1.textoFilasPorPagina1}" 
                                                        columns="2"
                                                        converter="#{ClaseRecursoSeccionPorClaseRecurso1.textoFilasPorPagina1Converter1}"
                                                        disabled="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.paginacionInhabilitada}" 
                                                        id="textoFilasPorPagina1" maxLength="2"
                                                        text="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.filasPorPagina}" 
                                                        validatorExpression="#{ClaseRecursoSeccionPorClaseRecurso1.textoFilasPorPagina1Validator1.validate}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{ClaseRecursoSeccionPorClaseRecurso1.botonRepaginar1_action}"
                                                        binding="#{ClaseRecursoSeccionPorClaseRecurso1.botonRepaginar1}" 
                                                        id="botonRepaginar1"
                                                        imageURL="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.urlImagenRepaginar}" 
                                                        onClick="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.scriptRepaginar}"
                                                        text="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.i18n.textoBotonRepaginar}"
                                                        toolTip="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.i18n.toolTipBotonRepaginar}"/>
                                                    <webuijsf:message 
                                                        for="textoFilasPorPagina1" 
                                                        id="messageFilasPorPagina1"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="13"
                                                id="gridPanel108">
                                                <webuijsf:button
                                                    actionExpression="#{ClaseRecursoSeccionPorClaseRecurso1.botonAgregar1_action}"
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso1.botonAgregar1}"
                                                    disabled="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.scriptAgregar}"
                                                    rendered="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso1.listaFuncionEdicion1}"
                                                    converter="#{ClaseRecursoSeccionPorClaseRecurso1.converterListaFuncionEdicion1}"
                                                    disabled="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{ClaseRecursoSeccionPorClaseRecurso1.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ClaseRecursoSeccionPorClaseRecurso1.botonEditar1_action}"
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso1.botonEditar1}"
                                                    disabled="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.scriptEditar}"
                                                    rendered="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ClaseRecursoSeccionPorClaseRecurso1.botonEliminar1_action}"
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso1.botonEliminar1}"
                                                    disabled="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.scriptEliminar}"
                                                    rendered="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ClaseRecursoSeccionPorClaseRecurso1.botonAplicar1_action}"
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso1.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.scriptAplicar}"
                                                    rendered="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ClaseRecursoSeccionPorClaseRecurso1.botonDeshacer1_action}"
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso1.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.scriptDeshacer}"
                                                    rendered="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ClaseRecursoSeccionPorClaseRecurso1.botonConfirmar1_action}"
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso1.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.scriptConfirmar}"
                                                    rendered="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ClaseRecursoSeccionPorClaseRecurso1.botonDescartar1_action}"
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso1.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.scriptDescartar}"
                                                    rendered="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso1.listaFuncionAccion1}"
                                                    converter="#{ClaseRecursoSeccionPorClaseRecurso1.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{ClaseRecursoSeccionPorClaseRecurso1.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ClaseRecursoSeccionPorClaseRecurso1.botonProcesar1_action}"
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso1.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.scriptProcesar}"
                                                    rendered="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ClaseRecursoSeccionPorClaseRecurso1.botonRefrescar1_action}"
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso1.botonRefrescar1}"
                                                    disabled="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.scriptRefrescar}"
                                                    rendered="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ClaseRecursoSeccionPorClaseRecurso1.botonReconsultar1_action}"
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso1.botonReconsultar1}"
                                                    disabled="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.scriptReconsultar}"
                                                    rendered="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ClaseRecursoSeccionPorClaseRecurso1.botonRetornar1_action}"
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso1.botonRetornar1}"
                                                    disabled="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="2" 
                                                id="gridPanel109"
                                                rendered="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{ClaseRecursoSeccionPorClaseRecurso1.imageHyperlink1_action}"
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso1.imageHyperlink1}"
                                                    disabled="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.ClaseRecursoSeccionPorClaseRecurso1_imageHyperlink1_toolTip}"/>
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{ClaseRecursoSeccionPorClaseRecurso1.imageHyperlink2_action}"
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso1.imageHyperlink2}"
                                                    disabled="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink2"
                                                    imageURL="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{ClaseRecursoSeccionPorClaseRecurso1.gestor.designing}"
                                                    text="Hyperlink2"
                                                    toolTip="#{bundle.ClaseRecursoSeccionPorClaseRecurso1_imageHyperlink2_toolTip}"/>
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
