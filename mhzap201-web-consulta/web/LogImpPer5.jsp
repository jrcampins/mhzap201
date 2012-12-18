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
                    focus="#{LogImpPer5.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{LogImpPer5.gestor.preserveFocus}"
                    preserveScroll="#{LogImpPer5.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{LogImpPer5.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | checkbox1 campoIdLogImpPer1 campoFichaActiva1 listaEsImportado1 campoObservacion1 campoFechaHoraTransaccion1 campoNombreArchivo1 campoCodigoArchivo1 textoFilasPorPagina1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | textoFilasPorPagina1 | botonRepaginar1 , virtualForm3 | checkbox1 listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonEscogerFila1 botonDetallarFila1 botonProcesarFila1 botonRetornarFila1 botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{LogImpPer5.breadcrumbs1}" 
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
                                                    rendered="#{LogImpPer5.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{LogImpPer5.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{LogImpPer5.gestor.mensajeDisponible}"
                                                    text="#{LogImpPer5.gestor.mensaje}"
                                                    url="#{LogImpPer5.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:table
                                            binding="#{LogImpPer5.table1}"
                                            clearSortButton="true" 
                                            deselectMultipleButton="true" 
                                            id="table1"
                                            paginateButton="false"
                                            paginationControls="true" 
                                            selectMultipleButton="true" 
                                            sortPanelToggleButton="true"
                                            width="960">
                                            <webuijsf:tableRowGroup 
                                                binding="#{LogImpPer5.tableRowGroup1}" 
                                                id="tableRowGroup1" 
                                                rows="1"
                                                selected="#{LogImpPer5.gestor.filaEscogida}" 
                                                sourceData="#{LogImpPer5.logImpPerDataProvider}" 
                                                sourceVar="currentRow">
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    id="tableRowGroup1SelectionColumn"
                                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);" 
                                                    selectId="checkbox1">
                                                    <webuijsf:checkbox 
                                                        binding="#{LogImpPer5.checkbox1}" 
                                                        id="checkbox1"
                                                        onClick="#{LogImpPer5.gestor.scriptElegir}" 
                                                        selected="#{LogImpPer5.gestor.filaElegida}" 
                                                        toolTip="#{LogImpPer5.gestor.i18n.toolTipCheckboxSeleccionMultiple}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    binding="#{LogImpPer5.tableColumn1}" 
                                                    id="tableColumn1">
                                                    <webuijsf:button 
                                                        actionExpression="#{LogImpPer5.botonEscogerFila1_action}"
                                                        binding="#{LogImpPer5.botonEscogerFila1}"
                                                        disabled="#{LogImpPer5.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonEscogerFila1"
                                                        imageURL="#{LogImpPer5.gestor.urlImagenEscoger}" 
                                                        onClick="#{LogImpPer5.gestor.scriptEscoger}"
                                                        text="#{LogImpPer5.gestor.i18n.textoBotonEscogerFila}"
                                                        toolTip="#{LogImpPer5.gestor.i18n.toolTipBotonEscogerFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{LogImpPer5.botonDetallarFila1_action}"
                                                        binding="#{LogImpPer5.botonDetallarFila1}"
                                                        disabled="#{LogImpPer5.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonDetallarFila1"
                                                        imageURL="#{LogImpPer5.gestor.urlImagenDetallar}" 
                                                        onClick="#{LogImpPer5.scriptAbrirVentanaVerDetalle}"
                                                        rendered="#{LogImpPer5.gestor.detalleDisponible}" 
                                                        text="#{LogImpPer5.gestor.i18n.textoBotonDetallarFila}"
                                                        toolTip="#{LogImpPer5.gestor.i18n.toolTipBotonDetallarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{LogImpPer5.botonProcesarFila1_action}"
                                                        binding="#{LogImpPer5.botonProcesarFila1}"
                                                        disabled="#{LogImpPer5.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonProcesarFila1"
                                                        imageURL="#{LogImpPer5.gestor.urlImagenProcesar}" 
                                                        onClick="#{LogImpPer5.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{LogImpPer5.asistente.comandoDisponible}" 
                                                        text="#{LogImpPer5.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{LogImpPer5.gestor.i18n.toolTipBotonProcesarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{LogImpPer5.botonRetornarFila1_action}"
                                                        binding="#{LogImpPer5.botonRetornarFila1}" 
                                                        disabled="#{LogImpPer5.gestor.funcionReturnInhabilitada}"
                                                        id="botonRetornarFila1"
                                                        imageURL="#{LogImpPer5.gestor.urlImagenRetornar}"
                                                        onClick="#{LogImpPer5.gestor.scriptRetornarRecursoActual}"
                                                        rendered="#{LogImpPer5.gestor.funcionReturnVisible}" 
                                                        text="#{LogImpPer5.gestor.i18n.textoBotonRetornarFila}"
                                                        toolTip="#{LogImpPer5.gestor.i18n.toolTipBotonRetornarFila}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumn2}"
                                                    id="tableColumn2"
                                                    rendered="#{LogImpPer5.gestor.designing}">
                                                    <webuijsf:imageHyperlink
                                                        actionExpression="#{LogImpPer5.hipervinculoAccionFila1_action}"
                                                        binding="#{LogImpPer5.hipervinculoAccionFila1}"
                                                        disabled="#{LogImpPer5.gestor.loteConCambios}"
                                                        id="hipervinculoAccionFila1"
                                                        imageURL="#{LogImpPer5.gestor.urlImagenEjecutarVinculo}"
                                                        onClick="#{LogImpPer5.scriptAbrirVentanaAccionFila1}"
                                                        text="Accion1"
                                                        toolTip="#{bundle.LogImpPer5_hipervinculoAccionFila1_toolTip}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="right" 
                                                    binding="#{LogImpPer5.tableColumn3}" 
                                                    headerText="#{LogImpPer5.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{LogImpPer5.gestor.i18n.toolTipEtiquetaIdentificacionFila}"
                                                    id="tableColumn3">
                                                    <webuijsf:imageHyperlink 
                                                        actionExpression="#{LogImpPer5.hipervinculoDetallarFila1_action}"
                                                        binding="#{LogImpPer5.hipervinculoDetallarFila1}" 
                                                        id="hipervinculoDetallarFila1"
                                                        imageURL="#{LogImpPer5.gestor.urlImagenFilaProcesada}"
                                                        textPosition="left" 
                                                        text="#{LogImpPer5.gestor.identificacionFila}" 
                                                        toolTip="#{LogImpPer5.gestor.toolTipImagenFilaProcesada}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnIdLogImpPer1}"
                                                    headerText="identificaci&#243;n"
                                                    id="tableColumnIdLogImpPer1" rendered="false"
                                                    sort="id_log_imp_per">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdLogImpPer1"
                                                    text="#{currentRow.value['id_log_imp_per']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelIdLogImpPer1}"
                                                    id="labelIdLogImpPer1"
                                                    for="campoIdLogImpPer1"/>
                                                <webuijsf:textField id="campoIdLogImpPer1"
                                                    binding="#{LogImpPer5.campoIdLogImpPer1}"
                                                    converter="#{LogImpPer5.converterIdLogImpPer1}"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['id_log_imp_per']}"
                                                    toolTip="BundleParametros.id_log_imp_per.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorIdLogImpPer1.validate}"/>
                                                <webuijsf:staticText id="campoIdLogImpPer1Texto1"
                                                    binding="#{LogImpPer5.campoIdLogImpPer1Texto1}"
                                                    text="#{currentRow.value['id_log_imp_per']}"/>
                                                <webuijsf:message id="messageIdLogImpPer1"
                                                    for="campoIdLogImpPer1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnFichaActiva1}"
                                                    headerText="ficha activa"
                                                    id="tableColumnFichaActiva1" rendered="false"
                                                    sort="ficha_activa">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextFichaActiva1"
                                                    text="#{currentRow.value['ficha_activa']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelFichaActiva1}"
                                                    id="labelFichaActiva1"
                                                    for="campoFichaActiva1"/>
                                                <webuijsf:textArea id="campoFichaActiva1"
                                                    binding="#{LogImpPer5.campoFichaActiva1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['ficha_activa']}"
                                                    toolTip="BundleParametros.ficha_activa.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorFichaActiva1.validate}"/>
                                                <webuijsf:staticText id="campoFichaActiva1Texto1"
                                                    binding="#{LogImpPer5.campoFichaActiva1Texto1}"
                                                    text="#{currentRow.value['ficha_activa']}"/>
                                                <webuijsf:message id="messageFichaActiva1"
                                                    for="campoFichaActiva1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnEsImportado1}"
                                                    headerText="importado"
                                                    id="tableColumnEsImportado1"
                                                    sort="es_importado">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsImportado1"
                                                    text="#{currentRow.value['es_importado']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelEsImportado1}"
                                                    id="labelEsImportado1"
                                                    for="listaEsImportado1"/>
                                                <webuijsf:dropDown id="listaEsImportado1"
                                                    binding="#{LogImpPer5.listaEsImportado1}"
                                                    converter="#{LogImpPer5.converterEsImportado1}"
                                                    disabled="#{LogImpPer5.gestor.filaNoProcesada}" required="true"
                                                    items="#{LogImpPer5.asistente.opcionesListaEsImportado1}"
                                                    selected="#{currentRow.value['es_importado']}"
                                                    toolTip="BundleParametros.es_importado.log_imp_per"/>
                                                <webuijsf:staticText id="listaEsImportado1Texto1"
                                                    binding="#{LogImpPer5.listaEsImportado1Texto1}"/>
                                                <webuijsf:message id="messageEsImportado1"
                                                    for="listaEsImportado1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnObservacion1}"
                                                    headerText="observaci&#243;n"
                                                    id="tableColumnObservacion1" rendered="false"
                                                    sort="observacion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextObservacion1"
                                                    text="#{currentRow.value['observacion']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelObservacion1}"
                                                    id="labelObservacion1"
                                                    for="campoObservacion1"/>
                                                <webuijsf:textArea id="campoObservacion1"
                                                    binding="#{LogImpPer5.campoObservacion1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['observacion']}"
                                                    toolTip="BundleParametros.observacion.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorObservacion1.validate}"/>
                                                <webuijsf:staticText id="campoObservacion1Texto1"
                                                    binding="#{LogImpPer5.campoObservacion1Texto1}"
                                                    text="#{currentRow.value['observacion']}"/>
                                                <webuijsf:message id="messageObservacion1"
                                                    for="campoObservacion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnFechaHoraTransaccion1}"
                                                    headerText="fecha hora transacci&#243;n"
                                                    id="tableColumnFechaHoraTransaccion1"
                                                    sort="fecha_hora_transaccion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextFechaHoraTransaccion1"
                                                    text="#{currentRow.value['fecha_hora_transaccion']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelFechaHoraTransaccion1}"
                                                    id="labelFechaHoraTransaccion1"
                                                    for="campoFechaHoraTransaccion1"/>
                                                <webuijsf:textField id="campoFechaHoraTransaccion1"
                                                    binding="#{LogImpPer5.campoFechaHoraTransaccion1}"
                                                    converter="#{LogImpPer5.converterFechaHoraTransaccion1}"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['fecha_hora_transaccion']}"
                                                    toolTip="BundleParametros.fecha_hora_transaccion.log_imp_per"/>
                                                <webuijsf:staticText id="campoFechaHoraTransaccion1Texto1"
                                                    binding="#{LogImpPer5.campoFechaHoraTransaccion1Texto1}"
                                                    converter="#{LogImpPer5.converterFechaHoraTransaccion1}"
                                                    text="#{currentRow.value['fecha_hora_transaccion']}"/>
                                                <webuijsf:message id="messageFechaHoraTransaccion1"
                                                    for="campoFechaHoraTransaccion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnNombreArchivo1}"
                                                    headerText="nombre archivo"
                                                    id="tableColumnNombreArchivo1" rendered="false"
                                                    sort="nombre_archivo">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNombreArchivo1"
                                                    text="#{currentRow.value['nombre_archivo']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelNombreArchivo1}"
                                                    id="labelNombreArchivo1"
                                                    for="campoNombreArchivo1"/>
                                                <webuijsf:textArea id="campoNombreArchivo1"
                                                    binding="#{LogImpPer5.campoNombreArchivo1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['nombre_archivo']}"
                                                    toolTip="BundleParametros.nombre_archivo.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorNombreArchivo1.validate}"/>
                                                <webuijsf:staticText id="campoNombreArchivo1Texto1"
                                                    binding="#{LogImpPer5.campoNombreArchivo1Texto1}"
                                                    text="#{currentRow.value['nombre_archivo']}"/>
                                                <webuijsf:message id="messageNombreArchivo1"
                                                    for="campoNombreArchivo1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnNombreArchivo3" rendered="false"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNombreArchivo3"
                                                    text="#{currentRow.value['nombre_archivo']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{LogImpPer5.campoNombreArchivo1Boton3}"
                                                    id="campoNombreArchivo1Boton3"
                                                    onClick="#{LogImpPer5.asistente.scriptCampoNombreArchivo1Boton3}"
                                                    rendered="#{LogImpPer5.asistente.campoNombreArchivo1Boton3Rendered}"
                                                    text="#{LogImpPer5.asistente.textCampoNombreArchivo1Boton3}"
                                                    toolTip="#{LogImpPer5.asistente.toolTipCampoNombreArchivo1Boton3}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnCodigoArchivo1}"
                                                    headerText="c&#243;digo archivo"
                                                    id="tableColumnCodigoArchivo1" rendered="false"
                                                    sort="codigo_archivo">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextCodigoArchivo1"
                                                    text="#{currentRow.value['codigo_archivo']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelCodigoArchivo1}"
                                                    id="labelCodigoArchivo1"
                                                    for="campoCodigoArchivo1"/>
                                                <webuijsf:textArea id="campoCodigoArchivo1"
                                                    binding="#{LogImpPer5.campoCodigoArchivo1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['codigo_archivo']}"
                                                    toolTip="BundleParametros.codigo_archivo.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorCodigoArchivo1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoArchivo1Texto1"
                                                    binding="#{LogImpPer5.campoCodigoArchivo1Texto1}"
                                                    text="#{currentRow.value['codigo_archivo']}"/>
                                                <webuijsf:message id="messageCodigoArchivo1"
                                                    for="campoCodigoArchivo1"/>
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
                                                        binding="#{LogImpPer5.etiquetaTextoFilasPorPagina1}" 
                                                        for="textoFilasPorPagina1"
                                                        id="etiquetaTextoFilasPorPagina1" 
                                                        text="#{LogImpPer5.gestor.i18n.textoEtiquetaTextoFilasPorPagina}"/>
                                                </h:panelGrid>
                                                <h:panelGrid 
                                                    columns="3" 
                                                    id="gridPanel107">
                                                    <webuijsf:textField 
                                                        binding="#{LogImpPer5.textoFilasPorPagina1}" 
                                                        columns="2"
                                                        converter="#{LogImpPer5.textoFilasPorPagina1Converter1}"
                                                        disabled="#{LogImpPer5.gestor.paginacionInhabilitada}" 
                                                        id="textoFilasPorPagina1" maxLength="2"
                                                        text="#{LogImpPer5.gestor.filasPorPagina}" 
                                                        validatorExpression="#{LogImpPer5.textoFilasPorPagina1Validator1.validate}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{LogImpPer5.botonRepaginar1_action}"
                                                        binding="#{LogImpPer5.botonRepaginar1}" 
                                                        id="botonRepaginar1"
                                                        imageURL="#{LogImpPer5.gestor.urlImagenRepaginar}" 
                                                        onClick="#{LogImpPer5.gestor.scriptRepaginar}"
                                                        text="#{LogImpPer5.gestor.i18n.textoBotonRepaginar}"
                                                        toolTip="#{LogImpPer5.gestor.i18n.toolTipBotonRepaginar}"/>
                                                    <webuijsf:message 
                                                        for="textoFilasPorPagina1" 
                                                        id="messageFilasPorPagina1"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="13"
                                                id="gridPanel108">
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPer5.botonAgregar1_action}"
                                                    binding="#{LogImpPer5.botonAgregar1}"
                                                    disabled="#{LogImpPer5.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{LogImpPer5.gestor.scriptAgregar}"
                                                    rendered="#{LogImpPer5.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPer5.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{LogImpPer5.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{LogImpPer5.listaFuncionEdicion1}"
                                                    converter="#{LogImpPer5.converterListaFuncionEdicion1}"
                                                    disabled="#{LogImpPer5.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{LogImpPer5.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{LogImpPer5.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{LogImpPer5.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{LogImpPer5.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPer5.botonEditar1_action}"
                                                    binding="#{LogImpPer5.botonEditar1}"
                                                    disabled="#{LogImpPer5.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{LogImpPer5.gestor.scriptEditar}"
                                                    rendered="#{LogImpPer5.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPer5.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{LogImpPer5.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPer5.botonEliminar1_action}"
                                                    binding="#{LogImpPer5.botonEliminar1}"
                                                    disabled="#{LogImpPer5.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{LogImpPer5.gestor.scriptEliminar}"
                                                    rendered="#{LogImpPer5.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPer5.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{LogImpPer5.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPer5.botonAplicar1_action}"
                                                    binding="#{LogImpPer5.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{LogImpPer5.gestor.scriptAplicar}"
                                                    rendered="#{LogImpPer5.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPer5.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{LogImpPer5.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPer5.botonDeshacer1_action}"
                                                    binding="#{LogImpPer5.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{LogImpPer5.gestor.scriptDeshacer}"
                                                    rendered="#{LogImpPer5.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPer5.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{LogImpPer5.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPer5.botonConfirmar1_action}"
                                                    binding="#{LogImpPer5.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{LogImpPer5.gestor.scriptConfirmar}"
                                                    rendered="#{LogImpPer5.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPer5.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{LogImpPer5.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPer5.botonDescartar1_action}"
                                                    binding="#{LogImpPer5.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{LogImpPer5.gestor.scriptDescartar}"
                                                    rendered="#{LogImpPer5.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPer5.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{LogImpPer5.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{LogImpPer5.listaFuncionAccion1}"
                                                    converter="#{LogImpPer5.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{LogImpPer5.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{LogImpPer5.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{LogImpPer5.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{LogImpPer5.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPer5.botonProcesar1_action}"
                                                    binding="#{LogImpPer5.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{LogImpPer5.gestor.scriptProcesar}"
                                                    rendered="#{LogImpPer5.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPer5.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{LogImpPer5.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPer5.botonRefrescar1_action}"
                                                    binding="#{LogImpPer5.botonRefrescar1}"
                                                    disabled="#{LogImpPer5.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{LogImpPer5.gestor.scriptRefrescar}"
                                                    rendered="#{LogImpPer5.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPer5.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{LogImpPer5.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPer5.botonReconsultar1_action}"
                                                    binding="#{LogImpPer5.botonReconsultar1}"
                                                    disabled="#{LogImpPer5.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{LogImpPer5.gestor.scriptReconsultar}"
                                                    rendered="#{LogImpPer5.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPer5.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{LogImpPer5.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPer5.botonRetornar1_action}"
                                                    binding="#{LogImpPer5.botonRetornar1}"
                                                    disabled="#{LogImpPer5.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{LogImpPer5.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{LogImpPer5.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPer5.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{LogImpPer5.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel109"
                                                rendered="#{LogImpPer5.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{LogImpPer5.imageHyperlink1_action}"
                                                    binding="#{LogImpPer5.imageHyperlink1}"
                                                    disabled="#{LogImpPer5.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{LogImpPer5.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{LogImpPer5.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{LogImpPer5.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.LogImpPer5_imageHyperlink1_toolTip}"/>
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
