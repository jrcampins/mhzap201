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
                    focus="#{LogImpUbi5.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{LogImpUbi5.gestor.preserveFocus}"
                    preserveScroll="#{LogImpUbi5.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{LogImpUbi5.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | checkbox1 campoIdLogImpUbi1 campoCodigo1 campoUbicacion1 campoTipoUbicacion1 campoTipoArea1 campoCodigoUbicacionSuperior1 listaEsImportado1 campoObservacion1 campoFechaHoraTransaccion1 campoNombreArchivo1 campoCodigoArchivo1 textoFilasPorPagina1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | textoFilasPorPagina1 | botonRepaginar1 , virtualForm3 | checkbox1 listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonEscogerFila1 botonDetallarFila1 botonProcesarFila1 botonRetornarFila1 botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{LogImpUbi5.breadcrumbs1}" 
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
                                                    rendered="#{LogImpUbi5.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{LogImpUbi5.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{LogImpUbi5.gestor.mensajeDisponible}"
                                                    text="#{LogImpUbi5.gestor.mensaje}"
                                                    url="#{LogImpUbi5.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:table
                                            binding="#{LogImpUbi5.table1}"
                                            clearSortButton="true" 
                                            deselectMultipleButton="true" 
                                            id="table1"
                                            paginateButton="false"
                                            paginationControls="true" 
                                            selectMultipleButton="true" 
                                            sortPanelToggleButton="true"
                                            width="960">
                                            <webuijsf:tableRowGroup 
                                                binding="#{LogImpUbi5.tableRowGroup1}" 
                                                id="tableRowGroup1" 
                                                rows="1"
                                                selected="#{LogImpUbi5.gestor.filaEscogida}" 
                                                sourceData="#{LogImpUbi5.logImpUbiDataProvider}" 
                                                sourceVar="currentRow">
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    id="tableRowGroup1SelectionColumn"
                                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);" 
                                                    selectId="checkbox1">
                                                    <webuijsf:checkbox 
                                                        binding="#{LogImpUbi5.checkbox1}" 
                                                        id="checkbox1"
                                                        onClick="#{LogImpUbi5.gestor.scriptElegir}" 
                                                        selected="#{LogImpUbi5.gestor.filaElegida}" 
                                                        toolTip="#{LogImpUbi5.gestor.i18n.toolTipCheckboxSeleccionMultiple}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    binding="#{LogImpUbi5.tableColumn1}" 
                                                    id="tableColumn1">
                                                    <webuijsf:button 
                                                        actionExpression="#{LogImpUbi5.botonEscogerFila1_action}"
                                                        binding="#{LogImpUbi5.botonEscogerFila1}"
                                                        disabled="#{LogImpUbi5.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonEscogerFila1"
                                                        imageURL="#{LogImpUbi5.gestor.urlImagenEscoger}" 
                                                        onClick="#{LogImpUbi5.gestor.scriptEscoger}"
                                                        text="#{LogImpUbi5.gestor.i18n.textoBotonEscogerFila}"
                                                        toolTip="#{LogImpUbi5.gestor.i18n.toolTipBotonEscogerFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{LogImpUbi5.botonDetallarFila1_action}"
                                                        binding="#{LogImpUbi5.botonDetallarFila1}"
                                                        disabled="#{LogImpUbi5.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonDetallarFila1"
                                                        imageURL="#{LogImpUbi5.gestor.urlImagenDetallar}" 
                                                        onClick="#{LogImpUbi5.scriptAbrirVentanaVerDetalle}"
                                                        rendered="#{LogImpUbi5.gestor.detalleDisponible}" 
                                                        text="#{LogImpUbi5.gestor.i18n.textoBotonDetallarFila}"
                                                        toolTip="#{LogImpUbi5.gestor.i18n.toolTipBotonDetallarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{LogImpUbi5.botonProcesarFila1_action}"
                                                        binding="#{LogImpUbi5.botonProcesarFila1}"
                                                        disabled="#{LogImpUbi5.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonProcesarFila1"
                                                        imageURL="#{LogImpUbi5.gestor.urlImagenProcesar}" 
                                                        onClick="#{LogImpUbi5.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{LogImpUbi5.asistente.comandoDisponible}" 
                                                        text="#{LogImpUbi5.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{LogImpUbi5.gestor.i18n.toolTipBotonProcesarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{LogImpUbi5.botonRetornarFila1_action}"
                                                        binding="#{LogImpUbi5.botonRetornarFila1}" 
                                                        disabled="#{LogImpUbi5.gestor.funcionReturnInhabilitada}"
                                                        id="botonRetornarFila1"
                                                        imageURL="#{LogImpUbi5.gestor.urlImagenRetornar}"
                                                        onClick="#{LogImpUbi5.gestor.scriptRetornarRecursoActual}"
                                                        rendered="#{LogImpUbi5.gestor.funcionReturnVisible}" 
                                                        text="#{LogImpUbi5.gestor.i18n.textoBotonRetornarFila}"
                                                        toolTip="#{LogImpUbi5.gestor.i18n.toolTipBotonRetornarFila}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpUbi5.tableColumn2}"
                                                    id="tableColumn2"
                                                    rendered="#{LogImpUbi5.gestor.designing}">
                                                    <webuijsf:imageHyperlink
                                                        actionExpression="#{LogImpUbi5.hipervinculoAccionFila1_action}"
                                                        binding="#{LogImpUbi5.hipervinculoAccionFila1}"
                                                        disabled="#{LogImpUbi5.gestor.loteConCambios}"
                                                        id="hipervinculoAccionFila1"
                                                        imageURL="#{LogImpUbi5.gestor.urlImagenEjecutarVinculo}"
                                                        onClick="#{LogImpUbi5.scriptAbrirVentanaAccionFila1}"
                                                        text="Accion1"
                                                        toolTip="#{bundle.LogImpUbi5_hipervinculoAccionFila1_toolTip}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="right" 
                                                    binding="#{LogImpUbi5.tableColumn3}" 
                                                    headerText="#{LogImpUbi5.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{LogImpUbi5.gestor.i18n.toolTipEtiquetaIdentificacionFila}"
                                                    id="tableColumn3">
                                                    <webuijsf:imageHyperlink 
                                                        actionExpression="#{LogImpUbi5.hipervinculoDetallarFila1_action}"
                                                        binding="#{LogImpUbi5.hipervinculoDetallarFila1}" 
                                                        id="hipervinculoDetallarFila1"
                                                        imageURL="#{LogImpUbi5.gestor.urlImagenFilaProcesada}"
                                                        textPosition="left" 
                                                        text="#{LogImpUbi5.gestor.identificacionFila}" 
                                                        toolTip="#{LogImpUbi5.gestor.toolTipImagenFilaProcesada}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpUbi5.tableColumnIdLogImpUbi1}"
                                                    headerText="identificaci&#243;n"
                                                    id="tableColumnIdLogImpUbi1" rendered="false"
                                                    sort="id_log_imp_ubi">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdLogImpUbi1"
                                                    text="#{currentRow.value['id_log_imp_ubi']}"
                                                    rendered="#{LogImpUbi5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpUbi5.labelIdLogImpUbi1}"
                                                    id="labelIdLogImpUbi1"
                                                    for="campoIdLogImpUbi1"/>
                                                <webuijsf:textField id="campoIdLogImpUbi1"
                                                    binding="#{LogImpUbi5.campoIdLogImpUbi1}"
                                                    converter="#{LogImpUbi5.converterIdLogImpUbi1}"
                                                    readOnly="#{LogImpUbi5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['id_log_imp_ubi']}"
                                                    toolTip="BundleParametros.id_log_imp_ubi.log_imp_ubi"
                                                    validatorExpression="#{LogImpUbi5.validatorIdLogImpUbi1.validate}"/>
                                                <webuijsf:staticText id="campoIdLogImpUbi1Texto1"
                                                    binding="#{LogImpUbi5.campoIdLogImpUbi1Texto1}"
                                                    text="#{currentRow.value['id_log_imp_ubi']}"/>
                                                <webuijsf:message id="messageIdLogImpUbi1"
                                                    for="campoIdLogImpUbi1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpUbi5.tableColumnCodigo1}"
                                                    headerText="c&#243;digo"
                                                    id="tableColumnCodigo1"
                                                    sort="codigo">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextCodigo1"
                                                    text="#{currentRow.value['codigo']}"
                                                    rendered="#{LogImpUbi5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpUbi5.labelCodigo1}"
                                                    id="labelCodigo1"
                                                    for="campoCodigo1"/>
                                                <webuijsf:textArea id="campoCodigo1"
                                                    binding="#{LogImpUbi5.campoCodigo1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpUbi5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['codigo']}"
                                                    toolTip="BundleParametros.codigo.log_imp_ubi"
                                                    validatorExpression="#{LogImpUbi5.validatorCodigo1.validate}"/>
                                                <webuijsf:staticText id="campoCodigo1Texto1"
                                                    binding="#{LogImpUbi5.campoCodigo1Texto1}"
                                                    text="#{currentRow.value['codigo']}"/>
                                                <webuijsf:message id="messageCodigo1"
                                                    for="campoCodigo1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpUbi5.tableColumnUbicacion1}"
                                                    headerText="ubicaci&#243;n"
                                                    id="tableColumnUbicacion1"
                                                    sort="ubicacion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextUbicacion1"
                                                    text="#{currentRow.value['ubicacion']}"
                                                    rendered="#{LogImpUbi5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpUbi5.labelUbicacion1}"
                                                    id="labelUbicacion1"
                                                    for="campoUbicacion1"/>
                                                <webuijsf:textArea id="campoUbicacion1"
                                                    binding="#{LogImpUbi5.campoUbicacion1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpUbi5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['ubicacion']}"
                                                    toolTip="BundleParametros.ubicacion.log_imp_ubi"
                                                    validatorExpression="#{LogImpUbi5.validatorUbicacion1.validate}"/>
                                                <webuijsf:staticText id="campoUbicacion1Texto1"
                                                    binding="#{LogImpUbi5.campoUbicacion1Texto1}"
                                                    text="#{currentRow.value['ubicacion']}"/>
                                                <webuijsf:message id="messageUbicacion1"
                                                    for="campoUbicacion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpUbi5.tableColumnTipoUbicacion1}"
                                                    headerText="tipo ubicaci&#243;n"
                                                    id="tableColumnTipoUbicacion1" rendered="false"
                                                    sort="tipo_ubicacion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextTipoUbicacion1"
                                                    text="#{currentRow.value['tipo_ubicacion']}"
                                                    rendered="#{LogImpUbi5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpUbi5.labelTipoUbicacion1}"
                                                    id="labelTipoUbicacion1"
                                                    for="campoTipoUbicacion1"/>
                                                <webuijsf:textArea id="campoTipoUbicacion1"
                                                    binding="#{LogImpUbi5.campoTipoUbicacion1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpUbi5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['tipo_ubicacion']}"
                                                    toolTip="BundleParametros.tipo_ubicacion.log_imp_ubi"
                                                    validatorExpression="#{LogImpUbi5.validatorTipoUbicacion1.validate}"/>
                                                <webuijsf:staticText id="campoTipoUbicacion1Texto1"
                                                    binding="#{LogImpUbi5.campoTipoUbicacion1Texto1}"
                                                    text="#{currentRow.value['tipo_ubicacion']}"/>
                                                <webuijsf:message id="messageTipoUbicacion1"
                                                    for="campoTipoUbicacion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpUbi5.tableColumnTipoArea1}"
                                                    headerText="tipo area"
                                                    id="tableColumnTipoArea1" rendered="false"
                                                    sort="tipo_area">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextTipoArea1"
                                                    text="#{currentRow.value['tipo_area']}"
                                                    rendered="#{LogImpUbi5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpUbi5.labelTipoArea1}"
                                                    id="labelTipoArea1"
                                                    for="campoTipoArea1"/>
                                                <webuijsf:textArea id="campoTipoArea1"
                                                    binding="#{LogImpUbi5.campoTipoArea1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpUbi5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['tipo_area']}"
                                                    toolTip="BundleParametros.tipo_area.log_imp_ubi"
                                                    validatorExpression="#{LogImpUbi5.validatorTipoArea1.validate}"/>
                                                <webuijsf:staticText id="campoTipoArea1Texto1"
                                                    binding="#{LogImpUbi5.campoTipoArea1Texto1}"
                                                    text="#{currentRow.value['tipo_area']}"/>
                                                <webuijsf:message id="messageTipoArea1"
                                                    for="campoTipoArea1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpUbi5.tableColumnCodigoUbicacionSuperior1}"
                                                    headerText="c&#243;digo ubicaci&#243;n superior"
                                                    id="tableColumnCodigoUbicacionSuperior1" rendered="false"
                                                    sort="codigo_ubicacion_superior">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextCodigoUbicacionSuperior1"
                                                    text="#{currentRow.value['codigo_ubicacion_superior']}"
                                                    rendered="#{LogImpUbi5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpUbi5.labelCodigoUbicacionSuperior1}"
                                                    id="labelCodigoUbicacionSuperior1"
                                                    for="campoCodigoUbicacionSuperior1"/>
                                                <webuijsf:textArea id="campoCodigoUbicacionSuperior1"
                                                    binding="#{LogImpUbi5.campoCodigoUbicacionSuperior1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpUbi5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['codigo_ubicacion_superior']}"
                                                    toolTip="BundleParametros.codigo_ubicacion_superior.log_imp_ubi"
                                                    validatorExpression="#{LogImpUbi5.validatorCodigoUbicacionSuperior1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoUbicacionSuperior1Texto1"
                                                    binding="#{LogImpUbi5.campoCodigoUbicacionSuperior1Texto1}"
                                                    text="#{currentRow.value['codigo_ubicacion_superior']}"/>
                                                <webuijsf:message id="messageCodigoUbicacionSuperior1"
                                                    for="campoCodigoUbicacionSuperior1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpUbi5.tableColumnEsImportado1}"
                                                    headerText="importado"
                                                    id="tableColumnEsImportado1"
                                                    sort="es_importado">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsImportado1"
                                                    text="#{currentRow.value['es_importado']}"
                                                    rendered="#{LogImpUbi5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpUbi5.labelEsImportado1}"
                                                    id="labelEsImportado1"
                                                    for="listaEsImportado1"/>
                                                <webuijsf:dropDown id="listaEsImportado1"
                                                    binding="#{LogImpUbi5.listaEsImportado1}"
                                                    converter="#{LogImpUbi5.converterEsImportado1}"
                                                    disabled="#{LogImpUbi5.gestor.filaNoProcesada}" required="true"
                                                    items="#{LogImpUbi5.asistente.opcionesListaEsImportado1}"
                                                    selected="#{currentRow.value['es_importado']}"
                                                    toolTip="BundleParametros.es_importado.log_imp_ubi"/>
                                                <webuijsf:staticText id="listaEsImportado1Texto1"
                                                    binding="#{LogImpUbi5.listaEsImportado1Texto1}"/>
                                                <webuijsf:message id="messageEsImportado1"
                                                    for="listaEsImportado1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpUbi5.tableColumnObservacion1}"
                                                    headerText="observaci&#243;n"
                                                    id="tableColumnObservacion1" rendered="false"
                                                    sort="observacion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextObservacion1"
                                                    text="#{currentRow.value['observacion']}"
                                                    rendered="#{LogImpUbi5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpUbi5.labelObservacion1}"
                                                    id="labelObservacion1"
                                                    for="campoObservacion1"/>
                                                <webuijsf:textArea id="campoObservacion1"
                                                    binding="#{LogImpUbi5.campoObservacion1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpUbi5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['observacion']}"
                                                    toolTip="BundleParametros.observacion.log_imp_ubi"
                                                    validatorExpression="#{LogImpUbi5.validatorObservacion1.validate}"/>
                                                <webuijsf:staticText id="campoObservacion1Texto1"
                                                    binding="#{LogImpUbi5.campoObservacion1Texto1}"
                                                    text="#{currentRow.value['observacion']}"/>
                                                <webuijsf:message id="messageObservacion1"
                                                    for="campoObservacion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpUbi5.tableColumnFechaHoraTransaccion1}"
                                                    headerText="fecha hora transacci&#243;n"
                                                    id="tableColumnFechaHoraTransaccion1"
                                                    sort="fecha_hora_transaccion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextFechaHoraTransaccion1"
                                                    text="#{currentRow.value['fecha_hora_transaccion']}"
                                                    rendered="#{LogImpUbi5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpUbi5.labelFechaHoraTransaccion1}"
                                                    id="labelFechaHoraTransaccion1"
                                                    for="campoFechaHoraTransaccion1"/>
                                                <webuijsf:textField id="campoFechaHoraTransaccion1"
                                                    binding="#{LogImpUbi5.campoFechaHoraTransaccion1}"
                                                    converter="#{LogImpUbi5.converterFechaHoraTransaccion1}"
                                                    readOnly="#{LogImpUbi5.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['fecha_hora_transaccion']}"
                                                    toolTip="BundleParametros.fecha_hora_transaccion.log_imp_ubi"/>
                                                <webuijsf:staticText id="campoFechaHoraTransaccion1Texto1"
                                                    binding="#{LogImpUbi5.campoFechaHoraTransaccion1Texto1}"
                                                    converter="#{LogImpUbi5.converterFechaHoraTransaccion1}"
                                                    text="#{currentRow.value['fecha_hora_transaccion']}"/>
                                                <webuijsf:message id="messageFechaHoraTransaccion1"
                                                    for="campoFechaHoraTransaccion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpUbi5.tableColumnNombreArchivo1}"
                                                    headerText="nombre archivo"
                                                    id="tableColumnNombreArchivo1" rendered="false"
                                                    sort="nombre_archivo">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNombreArchivo1"
                                                    text="#{currentRow.value['nombre_archivo']}"
                                                    rendered="#{LogImpUbi5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpUbi5.labelNombreArchivo1}"
                                                    id="labelNombreArchivo1"
                                                    for="campoNombreArchivo1"/>
                                                <webuijsf:textArea id="campoNombreArchivo1"
                                                    binding="#{LogImpUbi5.campoNombreArchivo1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpUbi5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['nombre_archivo']}"
                                                    toolTip="BundleParametros.nombre_archivo.log_imp_ubi"
                                                    validatorExpression="#{LogImpUbi5.validatorNombreArchivo1.validate}"/>
                                                <webuijsf:staticText id="campoNombreArchivo1Texto1"
                                                    binding="#{LogImpUbi5.campoNombreArchivo1Texto1}"
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
                                                    rendered="#{LogImpUbi5.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{LogImpUbi5.campoNombreArchivo1Boton3}"
                                                    id="campoNombreArchivo1Boton3"
                                                    onClick="#{LogImpUbi5.asistente.scriptCampoNombreArchivo1Boton3}"
                                                    rendered="#{LogImpUbi5.asistente.campoNombreArchivo1Boton3Rendered}"
                                                    text="#{LogImpUbi5.asistente.textCampoNombreArchivo1Boton3}"
                                                    toolTip="#{LogImpUbi5.asistente.toolTipCampoNombreArchivo1Boton3}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpUbi5.tableColumnCodigoArchivo1}"
                                                    headerText="c&#243;digo archivo"
                                                    id="tableColumnCodigoArchivo1" rendered="false"
                                                    sort="codigo_archivo">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextCodigoArchivo1"
                                                    text="#{currentRow.value['codigo_archivo']}"
                                                    rendered="#{LogImpUbi5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpUbi5.labelCodigoArchivo1}"
                                                    id="labelCodigoArchivo1"
                                                    for="campoCodigoArchivo1"/>
                                                <webuijsf:textArea id="campoCodigoArchivo1"
                                                    binding="#{LogImpUbi5.campoCodigoArchivo1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpUbi5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['codigo_archivo']}"
                                                    toolTip="BundleParametros.codigo_archivo.log_imp_ubi"
                                                    validatorExpression="#{LogImpUbi5.validatorCodigoArchivo1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoArchivo1Texto1"
                                                    binding="#{LogImpUbi5.campoCodigoArchivo1Texto1}"
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
                                                        binding="#{LogImpUbi5.etiquetaTextoFilasPorPagina1}" 
                                                        for="textoFilasPorPagina1"
                                                        id="etiquetaTextoFilasPorPagina1" 
                                                        text="#{LogImpUbi5.gestor.i18n.textoEtiquetaTextoFilasPorPagina}"/>
                                                </h:panelGrid>
                                                <h:panelGrid 
                                                    columns="3" 
                                                    id="gridPanel107">
                                                    <webuijsf:textField 
                                                        binding="#{LogImpUbi5.textoFilasPorPagina1}" 
                                                        columns="2"
                                                        converter="#{LogImpUbi5.textoFilasPorPagina1Converter1}"
                                                        disabled="#{LogImpUbi5.gestor.paginacionInhabilitada}" 
                                                        id="textoFilasPorPagina1" maxLength="2"
                                                        text="#{LogImpUbi5.gestor.filasPorPagina}" 
                                                        validatorExpression="#{LogImpUbi5.textoFilasPorPagina1Validator1.validate}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{LogImpUbi5.botonRepaginar1_action}"
                                                        binding="#{LogImpUbi5.botonRepaginar1}" 
                                                        id="botonRepaginar1"
                                                        imageURL="#{LogImpUbi5.gestor.urlImagenRepaginar}" 
                                                        onClick="#{LogImpUbi5.gestor.scriptRepaginar}"
                                                        text="#{LogImpUbi5.gestor.i18n.textoBotonRepaginar}"
                                                        toolTip="#{LogImpUbi5.gestor.i18n.toolTipBotonRepaginar}"/>
                                                    <webuijsf:message 
                                                        for="textoFilasPorPagina1" 
                                                        id="messageFilasPorPagina1"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="13"
                                                id="gridPanel108">
                                                <webuijsf:button
                                                    actionExpression="#{LogImpUbi5.botonAgregar1_action}"
                                                    binding="#{LogImpUbi5.botonAgregar1}"
                                                    disabled="#{LogImpUbi5.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{LogImpUbi5.gestor.scriptAgregar}"
                                                    rendered="#{LogImpUbi5.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpUbi5.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{LogImpUbi5.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{LogImpUbi5.listaFuncionEdicion1}"
                                                    converter="#{LogImpUbi5.converterListaFuncionEdicion1}"
                                                    disabled="#{LogImpUbi5.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{LogImpUbi5.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{LogImpUbi5.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{LogImpUbi5.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{LogImpUbi5.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpUbi5.botonEditar1_action}"
                                                    binding="#{LogImpUbi5.botonEditar1}"
                                                    disabled="#{LogImpUbi5.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{LogImpUbi5.gestor.scriptEditar}"
                                                    rendered="#{LogImpUbi5.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpUbi5.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{LogImpUbi5.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpUbi5.botonEliminar1_action}"
                                                    binding="#{LogImpUbi5.botonEliminar1}"
                                                    disabled="#{LogImpUbi5.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{LogImpUbi5.gestor.scriptEliminar}"
                                                    rendered="#{LogImpUbi5.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpUbi5.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{LogImpUbi5.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpUbi5.botonAplicar1_action}"
                                                    binding="#{LogImpUbi5.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{LogImpUbi5.gestor.scriptAplicar}"
                                                    rendered="#{LogImpUbi5.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpUbi5.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{LogImpUbi5.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpUbi5.botonDeshacer1_action}"
                                                    binding="#{LogImpUbi5.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{LogImpUbi5.gestor.scriptDeshacer}"
                                                    rendered="#{LogImpUbi5.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpUbi5.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{LogImpUbi5.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpUbi5.botonConfirmar1_action}"
                                                    binding="#{LogImpUbi5.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{LogImpUbi5.gestor.scriptConfirmar}"
                                                    rendered="#{LogImpUbi5.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpUbi5.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{LogImpUbi5.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpUbi5.botonDescartar1_action}"
                                                    binding="#{LogImpUbi5.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{LogImpUbi5.gestor.scriptDescartar}"
                                                    rendered="#{LogImpUbi5.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpUbi5.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{LogImpUbi5.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{LogImpUbi5.listaFuncionAccion1}"
                                                    converter="#{LogImpUbi5.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{LogImpUbi5.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{LogImpUbi5.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{LogImpUbi5.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{LogImpUbi5.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpUbi5.botonProcesar1_action}"
                                                    binding="#{LogImpUbi5.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{LogImpUbi5.gestor.scriptProcesar}"
                                                    rendered="#{LogImpUbi5.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpUbi5.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{LogImpUbi5.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpUbi5.botonRefrescar1_action}"
                                                    binding="#{LogImpUbi5.botonRefrescar1}"
                                                    disabled="#{LogImpUbi5.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{LogImpUbi5.gestor.scriptRefrescar}"
                                                    rendered="#{LogImpUbi5.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpUbi5.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{LogImpUbi5.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpUbi5.botonReconsultar1_action}"
                                                    binding="#{LogImpUbi5.botonReconsultar1}"
                                                    disabled="#{LogImpUbi5.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{LogImpUbi5.gestor.scriptReconsultar}"
                                                    rendered="#{LogImpUbi5.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpUbi5.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{LogImpUbi5.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpUbi5.botonRetornar1_action}"
                                                    binding="#{LogImpUbi5.botonRetornar1}"
                                                    disabled="#{LogImpUbi5.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{LogImpUbi5.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{LogImpUbi5.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpUbi5.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{LogImpUbi5.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel109"
                                                rendered="#{LogImpUbi5.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{LogImpUbi5.imageHyperlink1_action}"
                                                    binding="#{LogImpUbi5.imageHyperlink1}"
                                                    disabled="#{LogImpUbi5.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{LogImpUbi5.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{LogImpUbi5.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{LogImpUbi5.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.LogImpUbi5_imageHyperlink1_toolTip}"/>
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
