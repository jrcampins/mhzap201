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
                    focus="#{LogImpPerEec5.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{LogImpPerEec5.gestor.preserveFocus}"
                    preserveScroll="#{LogImpPerEec5.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{LogImpPerEec5.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | checkbox1 campoIdLogImpPerEec1 campoDptod1 campoDistritod1 campoDistripg1 campoArea1 campoBarrio1 campoManzana1 campoFormulario1 campoVivi1 campoHogar1 campoOrden1 campoP301 campoP311 campoP321 campoP331 campoP341 campoP351 campoP36OrdenConyugue1 campoP36OrdenPadre1 campoP36OrdenMadre1 campoP371 campoP37Cedula1 campoP38Dia1 campoP38Mes1 campoP38Ano1 campoP39pais1 campoP39dpto1 campoP39dist1 campoP39area1 campoP40Idioma1 campoP40otr1 campoP411 campoP421 campoP431 campoP4445t1 campoP441 campoP451 campoP461 campoP471 campoP481 campoP491 campoP49Otr1 campoP501 campoP50Otr1 campoP511 campoP521 campoP52Otr1 campoP531 campoP541 campoP54a1 campoP54Otr1 campoP551 campoP55Otr1 campoP561 campoP571 campoP581 campoP591 campoP601 campoP611 campoP621 campoP631 campoP63Especificar1 campoP64des1 campoP64c1 campoP65des1 campoP65c1 campoP661 campoP67a1 campoP67b1 campoP67c1 campoP67d1 campoP67e1 campoP67f1 campoP67g1 campoP67h1 campoP67i1 campoP67j1 campoP67k1 campoP67l1 campoP67tot1 listaEsImportado1 campoObservacion1 campoFechaHoraTransaccion1 campoNombreArchivo1 campoCodigoArchivo1 textoFilasPorPagina1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | textoFilasPorPagina1 | botonRepaginar1 , virtualForm3 | checkbox1 listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonEscogerFila1 botonDetallarFila1 botonProcesarFila1 botonRetornarFila1 botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{LogImpPerEec5.breadcrumbs1}" 
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
                                                    rendered="#{LogImpPerEec5.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{LogImpPerEec5.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{LogImpPerEec5.gestor.mensajeDisponible}"
                                                    text="#{LogImpPerEec5.gestor.mensaje}"
                                                    url="#{LogImpPerEec5.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:table
                                            binding="#{LogImpPerEec5.table1}"
                                            clearSortButton="true" 
                                            deselectMultipleButton="true" 
                                            id="table1"
                                            paginateButton="false"
                                            paginationControls="true" 
                                            selectMultipleButton="true" 
                                            sortPanelToggleButton="true"
                                            width="960">
                                            <webuijsf:tableRowGroup 
                                                binding="#{LogImpPerEec5.tableRowGroup1}" 
                                                id="tableRowGroup1" 
                                                rows="1"
                                                selected="#{LogImpPerEec5.gestor.filaEscogida}" 
                                                sourceData="#{LogImpPerEec5.logImpPerEecDataProvider}" 
                                                sourceVar="currentRow">
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    id="tableRowGroup1SelectionColumn"
                                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);" 
                                                    selectId="checkbox1">
                                                    <webuijsf:checkbox 
                                                        binding="#{LogImpPerEec5.checkbox1}" 
                                                        id="checkbox1"
                                                        onClick="#{LogImpPerEec5.gestor.scriptElegir}" 
                                                        selected="#{LogImpPerEec5.gestor.filaElegida}" 
                                                        toolTip="#{LogImpPerEec5.gestor.i18n.toolTipCheckboxSeleccionMultiple}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    binding="#{LogImpPerEec5.tableColumn1}" 
                                                    id="tableColumn1">
                                                    <webuijsf:button 
                                                        actionExpression="#{LogImpPerEec5.botonEscogerFila1_action}"
                                                        binding="#{LogImpPerEec5.botonEscogerFila1}"
                                                        disabled="#{LogImpPerEec5.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonEscogerFila1"
                                                        imageURL="#{LogImpPerEec5.gestor.urlImagenEscoger}" 
                                                        onClick="#{LogImpPerEec5.gestor.scriptEscoger}"
                                                        text="#{LogImpPerEec5.gestor.i18n.textoBotonEscogerFila}"
                                                        toolTip="#{LogImpPerEec5.gestor.i18n.toolTipBotonEscogerFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{LogImpPerEec5.botonDetallarFila1_action}"
                                                        binding="#{LogImpPerEec5.botonDetallarFila1}"
                                                        disabled="#{LogImpPerEec5.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonDetallarFila1"
                                                        imageURL="#{LogImpPerEec5.gestor.urlImagenDetallar}" 
                                                        onClick="#{LogImpPerEec5.scriptAbrirVentanaVerDetalle}"
                                                        rendered="#{LogImpPerEec5.gestor.detalleDisponible}" 
                                                        text="#{LogImpPerEec5.gestor.i18n.textoBotonDetallarFila}"
                                                        toolTip="#{LogImpPerEec5.gestor.i18n.toolTipBotonDetallarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{LogImpPerEec5.botonProcesarFila1_action}"
                                                        binding="#{LogImpPerEec5.botonProcesarFila1}"
                                                        disabled="#{LogImpPerEec5.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonProcesarFila1"
                                                        imageURL="#{LogImpPerEec5.gestor.urlImagenProcesar}" 
                                                        onClick="#{LogImpPerEec5.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{LogImpPerEec5.asistente.comandoDisponible}" 
                                                        text="#{LogImpPerEec5.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{LogImpPerEec5.gestor.i18n.toolTipBotonProcesarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{LogImpPerEec5.botonRetornarFila1_action}"
                                                        binding="#{LogImpPerEec5.botonRetornarFila1}" 
                                                        disabled="#{LogImpPerEec5.gestor.funcionReturnInhabilitada}"
                                                        id="botonRetornarFila1"
                                                        imageURL="#{LogImpPerEec5.gestor.urlImagenRetornar}"
                                                        onClick="#{LogImpPerEec5.gestor.scriptRetornarRecursoActual}"
                                                        rendered="#{LogImpPerEec5.gestor.funcionReturnVisible}" 
                                                        text="#{LogImpPerEec5.gestor.i18n.textoBotonRetornarFila}"
                                                        toolTip="#{LogImpPerEec5.gestor.i18n.toolTipBotonRetornarFila}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumn2}"
                                                    id="tableColumn2"
                                                    rendered="#{LogImpPerEec5.gestor.designing}">
                                                    <webuijsf:imageHyperlink
                                                        actionExpression="#{LogImpPerEec5.hipervinculoAccionFila1_action}"
                                                        binding="#{LogImpPerEec5.hipervinculoAccionFila1}"
                                                        disabled="#{LogImpPerEec5.gestor.loteConCambios}"
                                                        id="hipervinculoAccionFila1"
                                                        imageURL="#{LogImpPerEec5.gestor.urlImagenEjecutarVinculo}"
                                                        onClick="#{LogImpPerEec5.scriptAbrirVentanaAccionFila1}"
                                                        text="Accion1"
                                                        toolTip="#{bundle.LogImpPerEec5_hipervinculoAccionFila1_toolTip}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="right" 
                                                    binding="#{LogImpPerEec5.tableColumn3}" 
                                                    headerText="#{LogImpPerEec5.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{LogImpPerEec5.gestor.i18n.toolTipEtiquetaIdentificacionFila}"
                                                    id="tableColumn3">
                                                    <webuijsf:imageHyperlink 
                                                        actionExpression="#{LogImpPerEec5.hipervinculoDetallarFila1_action}"
                                                        binding="#{LogImpPerEec5.hipervinculoDetallarFila1}" 
                                                        id="hipervinculoDetallarFila1"
                                                        imageURL="#{LogImpPerEec5.gestor.urlImagenFilaProcesada}"
                                                        textPosition="left" 
                                                        text="#{LogImpPerEec5.gestor.identificacionFila}" 
                                                        toolTip="#{LogImpPerEec5.gestor.toolTipImagenFilaProcesada}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnIdLogImpPerEec1}"
                                                    headerText="identificaci&#243;n"
                                                    id="tableColumnIdLogImpPerEec1" rendered="false"
                                                    sort="id_log_imp_per_eec">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdLogImpPerEec1"
                                                    text="#{currentRow.value['id_log_imp_per_eec']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelIdLogImpPerEec1}"
                                                    id="labelIdLogImpPerEec1"
                                                    for="campoIdLogImpPerEec1"/>
                                                <webuijsf:textField id="campoIdLogImpPerEec1"
                                                    binding="#{LogImpPerEec5.campoIdLogImpPerEec1}"
                                                    converter="#{LogImpPerEec5.converterIdLogImpPerEec1}"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['id_log_imp_per_eec']}"
                                                    toolTip="BundleParametros.id_log_imp_per_eec.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorIdLogImpPerEec1.validate}"/>
                                                <webuijsf:staticText id="campoIdLogImpPerEec1Texto1"
                                                    binding="#{LogImpPerEec5.campoIdLogImpPerEec1Texto1}"
                                                    text="#{currentRow.value['id_log_imp_per_eec']}"/>
                                                <webuijsf:message id="messageIdLogImpPerEec1"
                                                    for="campoIdLogImpPerEec1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnDptod1}"
                                                    headerText="dptod"
                                                    id="tableColumnDptod1" rendered="false"
                                                    sort="dptod">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextDptod1"
                                                    text="#{currentRow.value['dptod']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelDptod1}"
                                                    id="labelDptod1"
                                                    for="campoDptod1"/>
                                                <webuijsf:textArea id="campoDptod1"
                                                    binding="#{LogImpPerEec5.campoDptod1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['dptod']}"
                                                    toolTip="BundleParametros.dptod.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorDptod1.validate}"/>
                                                <webuijsf:staticText id="campoDptod1Texto1"
                                                    binding="#{LogImpPerEec5.campoDptod1Texto1}"
                                                    text="#{currentRow.value['dptod']}"/>
                                                <webuijsf:message id="messageDptod1"
                                                    for="campoDptod1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnDistritod1}"
                                                    headerText="distritod"
                                                    id="tableColumnDistritod1" rendered="false"
                                                    sort="distritod">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextDistritod1"
                                                    text="#{currentRow.value['distritod']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelDistritod1}"
                                                    id="labelDistritod1"
                                                    for="campoDistritod1"/>
                                                <webuijsf:textArea id="campoDistritod1"
                                                    binding="#{LogImpPerEec5.campoDistritod1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['distritod']}"
                                                    toolTip="BundleParametros.distritod.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorDistritod1.validate}"/>
                                                <webuijsf:staticText id="campoDistritod1Texto1"
                                                    binding="#{LogImpPerEec5.campoDistritod1Texto1}"
                                                    text="#{currentRow.value['distritod']}"/>
                                                <webuijsf:message id="messageDistritod1"
                                                    for="campoDistritod1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnDistripg1}"
                                                    headerText="distripg"
                                                    id="tableColumnDistripg1" rendered="false"
                                                    sort="distripg">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextDistripg1"
                                                    text="#{currentRow.value['distripg']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelDistripg1}"
                                                    id="labelDistripg1"
                                                    for="campoDistripg1"/>
                                                <webuijsf:textArea id="campoDistripg1"
                                                    binding="#{LogImpPerEec5.campoDistripg1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['distripg']}"
                                                    toolTip="BundleParametros.distripg.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorDistripg1.validate}"/>
                                                <webuijsf:staticText id="campoDistripg1Texto1"
                                                    binding="#{LogImpPerEec5.campoDistripg1Texto1}"
                                                    text="#{currentRow.value['distripg']}"/>
                                                <webuijsf:message id="messageDistripg1"
                                                    for="campoDistripg1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnArea1}"
                                                    headerText="area"
                                                    id="tableColumnArea1" rendered="false"
                                                    sort="area">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextArea1"
                                                    text="#{currentRow.value['area']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelArea1}"
                                                    id="labelArea1"
                                                    for="campoArea1"/>
                                                <webuijsf:textArea id="campoArea1"
                                                    binding="#{LogImpPerEec5.campoArea1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['area']}"
                                                    toolTip="BundleParametros.area.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorArea1.validate}"/>
                                                <webuijsf:staticText id="campoArea1Texto1"
                                                    binding="#{LogImpPerEec5.campoArea1Texto1}"
                                                    text="#{currentRow.value['area']}"/>
                                                <webuijsf:message id="messageArea1"
                                                    for="campoArea1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnBarrio1}"
                                                    headerText="barrio"
                                                    id="tableColumnBarrio1" rendered="false"
                                                    sort="barrio">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextBarrio1"
                                                    text="#{currentRow.value['barrio']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelBarrio1}"
                                                    id="labelBarrio1"
                                                    for="campoBarrio1"/>
                                                <webuijsf:textArea id="campoBarrio1"
                                                    binding="#{LogImpPerEec5.campoBarrio1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['barrio']}"
                                                    toolTip="BundleParametros.barrio.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorBarrio1.validate}"/>
                                                <webuijsf:staticText id="campoBarrio1Texto1"
                                                    binding="#{LogImpPerEec5.campoBarrio1Texto1}"
                                                    text="#{currentRow.value['barrio']}"/>
                                                <webuijsf:message id="messageBarrio1"
                                                    for="campoBarrio1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnManzana1}"
                                                    headerText="manzana"
                                                    id="tableColumnManzana1" rendered="false"
                                                    sort="manzana">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextManzana1"
                                                    text="#{currentRow.value['manzana']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelManzana1}"
                                                    id="labelManzana1"
                                                    for="campoManzana1"/>
                                                <webuijsf:textArea id="campoManzana1"
                                                    binding="#{LogImpPerEec5.campoManzana1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['manzana']}"
                                                    toolTip="BundleParametros.manzana.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorManzana1.validate}"/>
                                                <webuijsf:staticText id="campoManzana1Texto1"
                                                    binding="#{LogImpPerEec5.campoManzana1Texto1}"
                                                    text="#{currentRow.value['manzana']}"/>
                                                <webuijsf:message id="messageManzana1"
                                                    for="campoManzana1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnFormulario1}"
                                                    headerText="formulario"
                                                    id="tableColumnFormulario1" rendered="false"
                                                    sort="formulario">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextFormulario1"
                                                    text="#{currentRow.value['formulario']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelFormulario1}"
                                                    id="labelFormulario1"
                                                    for="campoFormulario1"/>
                                                <webuijsf:textArea id="campoFormulario1"
                                                    binding="#{LogImpPerEec5.campoFormulario1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['formulario']}"
                                                    toolTip="BundleParametros.formulario.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorFormulario1.validate}"/>
                                                <webuijsf:staticText id="campoFormulario1Texto1"
                                                    binding="#{LogImpPerEec5.campoFormulario1Texto1}"
                                                    text="#{currentRow.value['formulario']}"/>
                                                <webuijsf:message id="messageFormulario1"
                                                    for="campoFormulario1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnVivi1}"
                                                    headerText="vivi"
                                                    id="tableColumnVivi1" rendered="false"
                                                    sort="vivi">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextVivi1"
                                                    text="#{currentRow.value['vivi']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelVivi1}"
                                                    id="labelVivi1"
                                                    for="campoVivi1"/>
                                                <webuijsf:textArea id="campoVivi1"
                                                    binding="#{LogImpPerEec5.campoVivi1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['vivi']}"
                                                    toolTip="BundleParametros.vivi.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorVivi1.validate}"/>
                                                <webuijsf:staticText id="campoVivi1Texto1"
                                                    binding="#{LogImpPerEec5.campoVivi1Texto1}"
                                                    text="#{currentRow.value['vivi']}"/>
                                                <webuijsf:message id="messageVivi1"
                                                    for="campoVivi1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnHogar1}"
                                                    headerText="hogar"
                                                    id="tableColumnHogar1" rendered="false"
                                                    sort="hogar">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextHogar1"
                                                    text="#{currentRow.value['hogar']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelHogar1}"
                                                    id="labelHogar1"
                                                    for="campoHogar1"/>
                                                <webuijsf:textArea id="campoHogar1"
                                                    binding="#{LogImpPerEec5.campoHogar1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['hogar']}"
                                                    toolTip="BundleParametros.hogar.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorHogar1.validate}"/>
                                                <webuijsf:staticText id="campoHogar1Texto1"
                                                    binding="#{LogImpPerEec5.campoHogar1Texto1}"
                                                    text="#{currentRow.value['hogar']}"/>
                                                <webuijsf:message id="messageHogar1"
                                                    for="campoHogar1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnOrden1}"
                                                    headerText="orden"
                                                    id="tableColumnOrden1" rendered="false"
                                                    sort="orden">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextOrden1"
                                                    text="#{currentRow.value['orden']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelOrden1}"
                                                    id="labelOrden1"
                                                    for="campoOrden1"/>
                                                <webuijsf:textArea id="campoOrden1"
                                                    binding="#{LogImpPerEec5.campoOrden1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['orden']}"
                                                    toolTip="BundleParametros.orden.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorOrden1.validate}"/>
                                                <webuijsf:staticText id="campoOrden1Texto1"
                                                    binding="#{LogImpPerEec5.campoOrden1Texto1}"
                                                    text="#{currentRow.value['orden']}"/>
                                                <webuijsf:message id="messageOrden1"
                                                    for="campoOrden1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnP301}"
                                                    headerText="p30"
                                                    id="tableColumnP301"
                                                    sort="p30">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP301"
                                                    text="#{currentRow.value['p30']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelP301}"
                                                    id="labelP301"
                                                    for="campoP301"/>
                                                <webuijsf:textArea id="campoP301"
                                                    binding="#{LogImpPerEec5.campoP301}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p30']}"
                                                    toolTip="BundleParametros.p30.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorP301.validate}"/>
                                                <webuijsf:staticText id="campoP301Texto1"
                                                    binding="#{LogImpPerEec5.campoP301Texto1}"
                                                    text="#{currentRow.value['p30']}"/>
                                                <webuijsf:message id="messageP301"
                                                    for="campoP301"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnP311}"
                                                    headerText="p31"
                                                    id="tableColumnP311"
                                                    sort="p31">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP311"
                                                    text="#{currentRow.value['p31']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelP311}"
                                                    id="labelP311"
                                                    for="campoP311"/>
                                                <webuijsf:textArea id="campoP311"
                                                    binding="#{LogImpPerEec5.campoP311}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p31']}"
                                                    toolTip="BundleParametros.p31.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorP311.validate}"/>
                                                <webuijsf:staticText id="campoP311Texto1"
                                                    binding="#{LogImpPerEec5.campoP311Texto1}"
                                                    text="#{currentRow.value['p31']}"/>
                                                <webuijsf:message id="messageP311"
                                                    for="campoP311"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnP321}"
                                                    headerText="p32"
                                                    id="tableColumnP321" rendered="false"
                                                    sort="p32">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP321"
                                                    text="#{currentRow.value['p32']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelP321}"
                                                    id="labelP321"
                                                    for="campoP321"/>
                                                <webuijsf:textArea id="campoP321"
                                                    binding="#{LogImpPerEec5.campoP321}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p32']}"
                                                    toolTip="BundleParametros.p32.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorP321.validate}"/>
                                                <webuijsf:staticText id="campoP321Texto1"
                                                    binding="#{LogImpPerEec5.campoP321Texto1}"
                                                    text="#{currentRow.value['p32']}"/>
                                                <webuijsf:message id="messageP321"
                                                    for="campoP321"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnP331}"
                                                    headerText="p33"
                                                    id="tableColumnP331" rendered="false"
                                                    sort="p33">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP331"
                                                    text="#{currentRow.value['p33']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelP331}"
                                                    id="labelP331"
                                                    for="campoP331"/>
                                                <webuijsf:textArea id="campoP331"
                                                    binding="#{LogImpPerEec5.campoP331}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p33']}"
                                                    toolTip="BundleParametros.p33.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorP331.validate}"/>
                                                <webuijsf:staticText id="campoP331Texto1"
                                                    binding="#{LogImpPerEec5.campoP331Texto1}"
                                                    text="#{currentRow.value['p33']}"/>
                                                <webuijsf:message id="messageP331"
                                                    for="campoP331"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnP341}"
                                                    headerText="p34"
                                                    id="tableColumnP341" rendered="false"
                                                    sort="p34">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP341"
                                                    text="#{currentRow.value['p34']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelP341}"
                                                    id="labelP341"
                                                    for="campoP341"/>
                                                <webuijsf:textArea id="campoP341"
                                                    binding="#{LogImpPerEec5.campoP341}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p34']}"
                                                    toolTip="BundleParametros.p34.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorP341.validate}"/>
                                                <webuijsf:staticText id="campoP341Texto1"
                                                    binding="#{LogImpPerEec5.campoP341Texto1}"
                                                    text="#{currentRow.value['p34']}"/>
                                                <webuijsf:message id="messageP341"
                                                    for="campoP341"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnP351}"
                                                    headerText="p35"
                                                    id="tableColumnP351" rendered="false"
                                                    sort="p35">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP351"
                                                    text="#{currentRow.value['p35']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelP351}"
                                                    id="labelP351"
                                                    for="campoP351"/>
                                                <webuijsf:textArea id="campoP351"
                                                    binding="#{LogImpPerEec5.campoP351}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p35']}"
                                                    toolTip="BundleParametros.p35.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorP351.validate}"/>
                                                <webuijsf:staticText id="campoP351Texto1"
                                                    binding="#{LogImpPerEec5.campoP351Texto1}"
                                                    text="#{currentRow.value['p35']}"/>
                                                <webuijsf:message id="messageP351"
                                                    for="campoP351"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnP36OrdenConyugue1}"
                                                    headerText="p36 orden conyugue"
                                                    id="tableColumnP36OrdenConyugue1" rendered="false"
                                                    sort="p36_orden_conyugue">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP36OrdenConyugue1"
                                                    text="#{currentRow.value['p36_orden_conyugue']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelP36OrdenConyugue1}"
                                                    id="labelP36OrdenConyugue1"
                                                    for="campoP36OrdenConyugue1"/>
                                                <webuijsf:textArea id="campoP36OrdenConyugue1"
                                                    binding="#{LogImpPerEec5.campoP36OrdenConyugue1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p36_orden_conyugue']}"
                                                    toolTip="BundleParametros.p36_orden_conyugue.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorP36OrdenConyugue1.validate}"/>
                                                <webuijsf:staticText id="campoP36OrdenConyugue1Texto1"
                                                    binding="#{LogImpPerEec5.campoP36OrdenConyugue1Texto1}"
                                                    text="#{currentRow.value['p36_orden_conyugue']}"/>
                                                <webuijsf:message id="messageP36OrdenConyugue1"
                                                    for="campoP36OrdenConyugue1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnP36OrdenPadre1}"
                                                    headerText="p36 orden padre"
                                                    id="tableColumnP36OrdenPadre1" rendered="false"
                                                    sort="p36_orden_padre">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP36OrdenPadre1"
                                                    text="#{currentRow.value['p36_orden_padre']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelP36OrdenPadre1}"
                                                    id="labelP36OrdenPadre1"
                                                    for="campoP36OrdenPadre1"/>
                                                <webuijsf:textArea id="campoP36OrdenPadre1"
                                                    binding="#{LogImpPerEec5.campoP36OrdenPadre1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p36_orden_padre']}"
                                                    toolTip="BundleParametros.p36_orden_padre.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorP36OrdenPadre1.validate}"/>
                                                <webuijsf:staticText id="campoP36OrdenPadre1Texto1"
                                                    binding="#{LogImpPerEec5.campoP36OrdenPadre1Texto1}"
                                                    text="#{currentRow.value['p36_orden_padre']}"/>
                                                <webuijsf:message id="messageP36OrdenPadre1"
                                                    for="campoP36OrdenPadre1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnP36OrdenMadre1}"
                                                    headerText="p36 orden madre"
                                                    id="tableColumnP36OrdenMadre1" rendered="false"
                                                    sort="p36_orden_madre">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP36OrdenMadre1"
                                                    text="#{currentRow.value['p36_orden_madre']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelP36OrdenMadre1}"
                                                    id="labelP36OrdenMadre1"
                                                    for="campoP36OrdenMadre1"/>
                                                <webuijsf:textArea id="campoP36OrdenMadre1"
                                                    binding="#{LogImpPerEec5.campoP36OrdenMadre1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p36_orden_madre']}"
                                                    toolTip="BundleParametros.p36_orden_madre.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorP36OrdenMadre1.validate}"/>
                                                <webuijsf:staticText id="campoP36OrdenMadre1Texto1"
                                                    binding="#{LogImpPerEec5.campoP36OrdenMadre1Texto1}"
                                                    text="#{currentRow.value['p36_orden_madre']}"/>
                                                <webuijsf:message id="messageP36OrdenMadre1"
                                                    for="campoP36OrdenMadre1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnP371}"
                                                    headerText="p37"
                                                    id="tableColumnP371" rendered="false"
                                                    sort="p37">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP371"
                                                    text="#{currentRow.value['p37']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelP371}"
                                                    id="labelP371"
                                                    for="campoP371"/>
                                                <webuijsf:textArea id="campoP371"
                                                    binding="#{LogImpPerEec5.campoP371}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p37']}"
                                                    toolTip="BundleParametros.p37.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorP371.validate}"/>
                                                <webuijsf:staticText id="campoP371Texto1"
                                                    binding="#{LogImpPerEec5.campoP371Texto1}"
                                                    text="#{currentRow.value['p37']}"/>
                                                <webuijsf:message id="messageP371"
                                                    for="campoP371"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnP37Cedula1}"
                                                    headerText="p37 c&#233;dula"
                                                    id="tableColumnP37Cedula1" rendered="false"
                                                    sort="p37_cedula">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP37Cedula1"
                                                    text="#{currentRow.value['p37_cedula']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelP37Cedula1}"
                                                    id="labelP37Cedula1"
                                                    for="campoP37Cedula1"/>
                                                <webuijsf:textArea id="campoP37Cedula1"
                                                    binding="#{LogImpPerEec5.campoP37Cedula1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p37_cedula']}"
                                                    toolTip="BundleParametros.p37_cedula.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorP37Cedula1.validate}"/>
                                                <webuijsf:staticText id="campoP37Cedula1Texto1"
                                                    binding="#{LogImpPerEec5.campoP37Cedula1Texto1}"
                                                    text="#{currentRow.value['p37_cedula']}"/>
                                                <webuijsf:message id="messageP37Cedula1"
                                                    for="campoP37Cedula1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnP38Dia1}"
                                                    headerText="p38 dia"
                                                    id="tableColumnP38Dia1" rendered="false"
                                                    sort="p38_dia">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP38Dia1"
                                                    text="#{currentRow.value['p38_dia']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelP38Dia1}"
                                                    id="labelP38Dia1"
                                                    for="campoP38Dia1"/>
                                                <webuijsf:textArea id="campoP38Dia1"
                                                    binding="#{LogImpPerEec5.campoP38Dia1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p38_dia']}"
                                                    toolTip="BundleParametros.p38_dia.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorP38Dia1.validate}"/>
                                                <webuijsf:staticText id="campoP38Dia1Texto1"
                                                    binding="#{LogImpPerEec5.campoP38Dia1Texto1}"
                                                    text="#{currentRow.value['p38_dia']}"/>
                                                <webuijsf:message id="messageP38Dia1"
                                                    for="campoP38Dia1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnP38Mes1}"
                                                    headerText="p38 mes"
                                                    id="tableColumnP38Mes1" rendered="false"
                                                    sort="p38_mes">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP38Mes1"
                                                    text="#{currentRow.value['p38_mes']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelP38Mes1}"
                                                    id="labelP38Mes1"
                                                    for="campoP38Mes1"/>
                                                <webuijsf:textArea id="campoP38Mes1"
                                                    binding="#{LogImpPerEec5.campoP38Mes1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p38_mes']}"
                                                    toolTip="BundleParametros.p38_mes.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorP38Mes1.validate}"/>
                                                <webuijsf:staticText id="campoP38Mes1Texto1"
                                                    binding="#{LogImpPerEec5.campoP38Mes1Texto1}"
                                                    text="#{currentRow.value['p38_mes']}"/>
                                                <webuijsf:message id="messageP38Mes1"
                                                    for="campoP38Mes1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnP38Ano1}"
                                                    headerText="p38 a&#241;o"
                                                    id="tableColumnP38Ano1" rendered="false"
                                                    sort="p38_ano">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP38Ano1"
                                                    text="#{currentRow.value['p38_ano']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelP38Ano1}"
                                                    id="labelP38Ano1"
                                                    for="campoP38Ano1"/>
                                                <webuijsf:textArea id="campoP38Ano1"
                                                    binding="#{LogImpPerEec5.campoP38Ano1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p38_ano']}"
                                                    toolTip="BundleParametros.p38_ano.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorP38Ano1.validate}"/>
                                                <webuijsf:staticText id="campoP38Ano1Texto1"
                                                    binding="#{LogImpPerEec5.campoP38Ano1Texto1}"
                                                    text="#{currentRow.value['p38_ano']}"/>
                                                <webuijsf:message id="messageP38Ano1"
                                                    for="campoP38Ano1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnP39pais1}"
                                                    headerText="p39pais"
                                                    id="tableColumnP39pais1" rendered="false"
                                                    sort="p39pais">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP39pais1"
                                                    text="#{currentRow.value['p39pais']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelP39pais1}"
                                                    id="labelP39pais1"
                                                    for="campoP39pais1"/>
                                                <webuijsf:textArea id="campoP39pais1"
                                                    binding="#{LogImpPerEec5.campoP39pais1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p39pais']}"
                                                    toolTip="BundleParametros.p39pais.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorP39pais1.validate}"/>
                                                <webuijsf:staticText id="campoP39pais1Texto1"
                                                    binding="#{LogImpPerEec5.campoP39pais1Texto1}"
                                                    text="#{currentRow.value['p39pais']}"/>
                                                <webuijsf:message id="messageP39pais1"
                                                    for="campoP39pais1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnP39dpto1}"
                                                    headerText="p39dpto"
                                                    id="tableColumnP39dpto1" rendered="false"
                                                    sort="p39dpto">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP39dpto1"
                                                    text="#{currentRow.value['p39dpto']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelP39dpto1}"
                                                    id="labelP39dpto1"
                                                    for="campoP39dpto1"/>
                                                <webuijsf:textArea id="campoP39dpto1"
                                                    binding="#{LogImpPerEec5.campoP39dpto1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p39dpto']}"
                                                    toolTip="BundleParametros.p39dpto.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorP39dpto1.validate}"/>
                                                <webuijsf:staticText id="campoP39dpto1Texto1"
                                                    binding="#{LogImpPerEec5.campoP39dpto1Texto1}"
                                                    text="#{currentRow.value['p39dpto']}"/>
                                                <webuijsf:message id="messageP39dpto1"
                                                    for="campoP39dpto1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnP39dist1}"
                                                    headerText="p39dist"
                                                    id="tableColumnP39dist1" rendered="false"
                                                    sort="p39dist">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP39dist1"
                                                    text="#{currentRow.value['p39dist']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelP39dist1}"
                                                    id="labelP39dist1"
                                                    for="campoP39dist1"/>
                                                <webuijsf:textArea id="campoP39dist1"
                                                    binding="#{LogImpPerEec5.campoP39dist1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p39dist']}"
                                                    toolTip="BundleParametros.p39dist.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorP39dist1.validate}"/>
                                                <webuijsf:staticText id="campoP39dist1Texto1"
                                                    binding="#{LogImpPerEec5.campoP39dist1Texto1}"
                                                    text="#{currentRow.value['p39dist']}"/>
                                                <webuijsf:message id="messageP39dist1"
                                                    for="campoP39dist1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnP39area1}"
                                                    headerText="p39area"
                                                    id="tableColumnP39area1" rendered="false"
                                                    sort="p39area">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP39area1"
                                                    text="#{currentRow.value['p39area']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelP39area1}"
                                                    id="labelP39area1"
                                                    for="campoP39area1"/>
                                                <webuijsf:textArea id="campoP39area1"
                                                    binding="#{LogImpPerEec5.campoP39area1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p39area']}"
                                                    toolTip="BundleParametros.p39area.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorP39area1.validate}"/>
                                                <webuijsf:staticText id="campoP39area1Texto1"
                                                    binding="#{LogImpPerEec5.campoP39area1Texto1}"
                                                    text="#{currentRow.value['p39area']}"/>
                                                <webuijsf:message id="messageP39area1"
                                                    for="campoP39area1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnP40Idioma1}"
                                                    headerText="p40 idioma"
                                                    id="tableColumnP40Idioma1" rendered="false"
                                                    sort="p40_idioma">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP40Idioma1"
                                                    text="#{currentRow.value['p40_idioma']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelP40Idioma1}"
                                                    id="labelP40Idioma1"
                                                    for="campoP40Idioma1"/>
                                                <webuijsf:textArea id="campoP40Idioma1"
                                                    binding="#{LogImpPerEec5.campoP40Idioma1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p40_idioma']}"
                                                    toolTip="BundleParametros.p40_idioma.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorP40Idioma1.validate}"/>
                                                <webuijsf:staticText id="campoP40Idioma1Texto1"
                                                    binding="#{LogImpPerEec5.campoP40Idioma1Texto1}"
                                                    text="#{currentRow.value['p40_idioma']}"/>
                                                <webuijsf:message id="messageP40Idioma1"
                                                    for="campoP40Idioma1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnP40otr1}"
                                                    headerText="p40otr"
                                                    id="tableColumnP40otr1" rendered="false"
                                                    sort="p40otr">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP40otr1"
                                                    text="#{currentRow.value['p40otr']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelP40otr1}"
                                                    id="labelP40otr1"
                                                    for="campoP40otr1"/>
                                                <webuijsf:textArea id="campoP40otr1"
                                                    binding="#{LogImpPerEec5.campoP40otr1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p40otr']}"
                                                    toolTip="BundleParametros.p40otr.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorP40otr1.validate}"/>
                                                <webuijsf:staticText id="campoP40otr1Texto1"
                                                    binding="#{LogImpPerEec5.campoP40otr1Texto1}"
                                                    text="#{currentRow.value['p40otr']}"/>
                                                <webuijsf:message id="messageP40otr1"
                                                    for="campoP40otr1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnP411}"
                                                    headerText="p41"
                                                    id="tableColumnP411" rendered="false"
                                                    sort="p41">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP411"
                                                    text="#{currentRow.value['p41']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelP411}"
                                                    id="labelP411"
                                                    for="campoP411"/>
                                                <webuijsf:textArea id="campoP411"
                                                    binding="#{LogImpPerEec5.campoP411}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p41']}"
                                                    toolTip="BundleParametros.p41.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorP411.validate}"/>
                                                <webuijsf:staticText id="campoP411Texto1"
                                                    binding="#{LogImpPerEec5.campoP411Texto1}"
                                                    text="#{currentRow.value['p41']}"/>
                                                <webuijsf:message id="messageP411"
                                                    for="campoP411"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnP421}"
                                                    headerText="p42"
                                                    id="tableColumnP421" rendered="false"
                                                    sort="p42">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP421"
                                                    text="#{currentRow.value['p42']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelP421}"
                                                    id="labelP421"
                                                    for="campoP421"/>
                                                <webuijsf:textArea id="campoP421"
                                                    binding="#{LogImpPerEec5.campoP421}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p42']}"
                                                    toolTip="BundleParametros.p42.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorP421.validate}"/>
                                                <webuijsf:staticText id="campoP421Texto1"
                                                    binding="#{LogImpPerEec5.campoP421Texto1}"
                                                    text="#{currentRow.value['p42']}"/>
                                                <webuijsf:message id="messageP421"
                                                    for="campoP421"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnP431}"
                                                    headerText="p43"
                                                    id="tableColumnP431" rendered="false"
                                                    sort="p43">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP431"
                                                    text="#{currentRow.value['p43']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelP431}"
                                                    id="labelP431"
                                                    for="campoP431"/>
                                                <webuijsf:textArea id="campoP431"
                                                    binding="#{LogImpPerEec5.campoP431}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p43']}"
                                                    toolTip="BundleParametros.p43.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorP431.validate}"/>
                                                <webuijsf:staticText id="campoP431Texto1"
                                                    binding="#{LogImpPerEec5.campoP431Texto1}"
                                                    text="#{currentRow.value['p43']}"/>
                                                <webuijsf:message id="messageP431"
                                                    for="campoP431"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnP4445t1}"
                                                    headerText="p44 45t"
                                                    id="tableColumnP4445t1" rendered="false"
                                                    sort="p44_45t">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP4445t1"
                                                    text="#{currentRow.value['p44_45t']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelP4445t1}"
                                                    id="labelP4445t1"
                                                    for="campoP4445t1"/>
                                                <webuijsf:textArea id="campoP4445t1"
                                                    binding="#{LogImpPerEec5.campoP4445t1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p44_45t']}"
                                                    toolTip="BundleParametros.p44_45t.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorP4445t1.validate}"/>
                                                <webuijsf:staticText id="campoP4445t1Texto1"
                                                    binding="#{LogImpPerEec5.campoP4445t1Texto1}"
                                                    text="#{currentRow.value['p44_45t']}"/>
                                                <webuijsf:message id="messageP4445t1"
                                                    for="campoP4445t1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnP441}"
                                                    headerText="p44"
                                                    id="tableColumnP441" rendered="false"
                                                    sort="p44">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP441"
                                                    text="#{currentRow.value['p44']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelP441}"
                                                    id="labelP441"
                                                    for="campoP441"/>
                                                <webuijsf:textArea id="campoP441"
                                                    binding="#{LogImpPerEec5.campoP441}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p44']}"
                                                    toolTip="BundleParametros.p44.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorP441.validate}"/>
                                                <webuijsf:staticText id="campoP441Texto1"
                                                    binding="#{LogImpPerEec5.campoP441Texto1}"
                                                    text="#{currentRow.value['p44']}"/>
                                                <webuijsf:message id="messageP441"
                                                    for="campoP441"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnP451}"
                                                    headerText="p45"
                                                    id="tableColumnP451" rendered="false"
                                                    sort="p45">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP451"
                                                    text="#{currentRow.value['p45']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelP451}"
                                                    id="labelP451"
                                                    for="campoP451"/>
                                                <webuijsf:textArea id="campoP451"
                                                    binding="#{LogImpPerEec5.campoP451}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p45']}"
                                                    toolTip="BundleParametros.p45.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorP451.validate}"/>
                                                <webuijsf:staticText id="campoP451Texto1"
                                                    binding="#{LogImpPerEec5.campoP451Texto1}"
                                                    text="#{currentRow.value['p45']}"/>
                                                <webuijsf:message id="messageP451"
                                                    for="campoP451"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnP461}"
                                                    headerText="p46"
                                                    id="tableColumnP461" rendered="false"
                                                    sort="p46">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP461"
                                                    text="#{currentRow.value['p46']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelP461}"
                                                    id="labelP461"
                                                    for="campoP461"/>
                                                <webuijsf:textArea id="campoP461"
                                                    binding="#{LogImpPerEec5.campoP461}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p46']}"
                                                    toolTip="BundleParametros.p46.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorP461.validate}"/>
                                                <webuijsf:staticText id="campoP461Texto1"
                                                    binding="#{LogImpPerEec5.campoP461Texto1}"
                                                    text="#{currentRow.value['p46']}"/>
                                                <webuijsf:message id="messageP461"
                                                    for="campoP461"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnP471}"
                                                    headerText="p47"
                                                    id="tableColumnP471" rendered="false"
                                                    sort="p47">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP471"
                                                    text="#{currentRow.value['p47']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelP471}"
                                                    id="labelP471"
                                                    for="campoP471"/>
                                                <webuijsf:textArea id="campoP471"
                                                    binding="#{LogImpPerEec5.campoP471}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p47']}"
                                                    toolTip="BundleParametros.p47.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorP471.validate}"/>
                                                <webuijsf:staticText id="campoP471Texto1"
                                                    binding="#{LogImpPerEec5.campoP471Texto1}"
                                                    text="#{currentRow.value['p47']}"/>
                                                <webuijsf:message id="messageP471"
                                                    for="campoP471"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnP481}"
                                                    headerText="p48"
                                                    id="tableColumnP481" rendered="false"
                                                    sort="p48">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP481"
                                                    text="#{currentRow.value['p48']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelP481}"
                                                    id="labelP481"
                                                    for="campoP481"/>
                                                <webuijsf:textArea id="campoP481"
                                                    binding="#{LogImpPerEec5.campoP481}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p48']}"
                                                    toolTip="BundleParametros.p48.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorP481.validate}"/>
                                                <webuijsf:staticText id="campoP481Texto1"
                                                    binding="#{LogImpPerEec5.campoP481Texto1}"
                                                    text="#{currentRow.value['p48']}"/>
                                                <webuijsf:message id="messageP481"
                                                    for="campoP481"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnP491}"
                                                    headerText="p49"
                                                    id="tableColumnP491" rendered="false"
                                                    sort="p49">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP491"
                                                    text="#{currentRow.value['p49']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelP491}"
                                                    id="labelP491"
                                                    for="campoP491"/>
                                                <webuijsf:textArea id="campoP491"
                                                    binding="#{LogImpPerEec5.campoP491}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p49']}"
                                                    toolTip="BundleParametros.p49.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorP491.validate}"/>
                                                <webuijsf:staticText id="campoP491Texto1"
                                                    binding="#{LogImpPerEec5.campoP491Texto1}"
                                                    text="#{currentRow.value['p49']}"/>
                                                <webuijsf:message id="messageP491"
                                                    for="campoP491"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnP49Otr1}"
                                                    headerText="p49 otr"
                                                    id="tableColumnP49Otr1" rendered="false"
                                                    sort="p49_otr">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP49Otr1"
                                                    text="#{currentRow.value['p49_otr']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelP49Otr1}"
                                                    id="labelP49Otr1"
                                                    for="campoP49Otr1"/>
                                                <webuijsf:textArea id="campoP49Otr1"
                                                    binding="#{LogImpPerEec5.campoP49Otr1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p49_otr']}"
                                                    toolTip="BundleParametros.p49_otr.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorP49Otr1.validate}"/>
                                                <webuijsf:staticText id="campoP49Otr1Texto1"
                                                    binding="#{LogImpPerEec5.campoP49Otr1Texto1}"
                                                    text="#{currentRow.value['p49_otr']}"/>
                                                <webuijsf:message id="messageP49Otr1"
                                                    for="campoP49Otr1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnP501}"
                                                    headerText="p50"
                                                    id="tableColumnP501" rendered="false"
                                                    sort="p50">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP501"
                                                    text="#{currentRow.value['p50']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelP501}"
                                                    id="labelP501"
                                                    for="campoP501"/>
                                                <webuijsf:textArea id="campoP501"
                                                    binding="#{LogImpPerEec5.campoP501}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p50']}"
                                                    toolTip="BundleParametros.p50.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorP501.validate}"/>
                                                <webuijsf:staticText id="campoP501Texto1"
                                                    binding="#{LogImpPerEec5.campoP501Texto1}"
                                                    text="#{currentRow.value['p50']}"/>
                                                <webuijsf:message id="messageP501"
                                                    for="campoP501"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnP50Otr1}"
                                                    headerText="p50 otr"
                                                    id="tableColumnP50Otr1" rendered="false"
                                                    sort="p50_otr">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP50Otr1"
                                                    text="#{currentRow.value['p50_otr']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelP50Otr1}"
                                                    id="labelP50Otr1"
                                                    for="campoP50Otr1"/>
                                                <webuijsf:textArea id="campoP50Otr1"
                                                    binding="#{LogImpPerEec5.campoP50Otr1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p50_otr']}"
                                                    toolTip="BundleParametros.p50_otr.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorP50Otr1.validate}"/>
                                                <webuijsf:staticText id="campoP50Otr1Texto1"
                                                    binding="#{LogImpPerEec5.campoP50Otr1Texto1}"
                                                    text="#{currentRow.value['p50_otr']}"/>
                                                <webuijsf:message id="messageP50Otr1"
                                                    for="campoP50Otr1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnP511}"
                                                    headerText="p51"
                                                    id="tableColumnP511" rendered="false"
                                                    sort="p51">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP511"
                                                    text="#{currentRow.value['p51']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelP511}"
                                                    id="labelP511"
                                                    for="campoP511"/>
                                                <webuijsf:textArea id="campoP511"
                                                    binding="#{LogImpPerEec5.campoP511}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p51']}"
                                                    toolTip="BundleParametros.p51.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorP511.validate}"/>
                                                <webuijsf:staticText id="campoP511Texto1"
                                                    binding="#{LogImpPerEec5.campoP511Texto1}"
                                                    text="#{currentRow.value['p51']}"/>
                                                <webuijsf:message id="messageP511"
                                                    for="campoP511"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnP521}"
                                                    headerText="p52"
                                                    id="tableColumnP521" rendered="false"
                                                    sort="p52">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP521"
                                                    text="#{currentRow.value['p52']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelP521}"
                                                    id="labelP521"
                                                    for="campoP521"/>
                                                <webuijsf:textArea id="campoP521"
                                                    binding="#{LogImpPerEec5.campoP521}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p52']}"
                                                    toolTip="BundleParametros.p52.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorP521.validate}"/>
                                                <webuijsf:staticText id="campoP521Texto1"
                                                    binding="#{LogImpPerEec5.campoP521Texto1}"
                                                    text="#{currentRow.value['p52']}"/>
                                                <webuijsf:message id="messageP521"
                                                    for="campoP521"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnP52Otr1}"
                                                    headerText="p52 otr"
                                                    id="tableColumnP52Otr1" rendered="false"
                                                    sort="p52_otr">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP52Otr1"
                                                    text="#{currentRow.value['p52_otr']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelP52Otr1}"
                                                    id="labelP52Otr1"
                                                    for="campoP52Otr1"/>
                                                <webuijsf:textArea id="campoP52Otr1"
                                                    binding="#{LogImpPerEec5.campoP52Otr1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p52_otr']}"
                                                    toolTip="BundleParametros.p52_otr.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorP52Otr1.validate}"/>
                                                <webuijsf:staticText id="campoP52Otr1Texto1"
                                                    binding="#{LogImpPerEec5.campoP52Otr1Texto1}"
                                                    text="#{currentRow.value['p52_otr']}"/>
                                                <webuijsf:message id="messageP52Otr1"
                                                    for="campoP52Otr1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnP531}"
                                                    headerText="p53"
                                                    id="tableColumnP531" rendered="false"
                                                    sort="p53">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP531"
                                                    text="#{currentRow.value['p53']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelP531}"
                                                    id="labelP531"
                                                    for="campoP531"/>
                                                <webuijsf:textArea id="campoP531"
                                                    binding="#{LogImpPerEec5.campoP531}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p53']}"
                                                    toolTip="BundleParametros.p53.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorP531.validate}"/>
                                                <webuijsf:staticText id="campoP531Texto1"
                                                    binding="#{LogImpPerEec5.campoP531Texto1}"
                                                    text="#{currentRow.value['p53']}"/>
                                                <webuijsf:message id="messageP531"
                                                    for="campoP531"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnP541}"
                                                    headerText="p54"
                                                    id="tableColumnP541" rendered="false"
                                                    sort="p54">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP541"
                                                    text="#{currentRow.value['p54']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelP541}"
                                                    id="labelP541"
                                                    for="campoP541"/>
                                                <webuijsf:textArea id="campoP541"
                                                    binding="#{LogImpPerEec5.campoP541}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p54']}"
                                                    toolTip="BundleParametros.p54.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorP541.validate}"/>
                                                <webuijsf:staticText id="campoP541Texto1"
                                                    binding="#{LogImpPerEec5.campoP541Texto1}"
                                                    text="#{currentRow.value['p54']}"/>
                                                <webuijsf:message id="messageP541"
                                                    for="campoP541"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnP54a1}"
                                                    headerText="p54a"
                                                    id="tableColumnP54a1" rendered="false"
                                                    sort="p54a">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP54a1"
                                                    text="#{currentRow.value['p54a']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelP54a1}"
                                                    id="labelP54a1"
                                                    for="campoP54a1"/>
                                                <webuijsf:textArea id="campoP54a1"
                                                    binding="#{LogImpPerEec5.campoP54a1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p54a']}"
                                                    toolTip="BundleParametros.p54a.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorP54a1.validate}"/>
                                                <webuijsf:staticText id="campoP54a1Texto1"
                                                    binding="#{LogImpPerEec5.campoP54a1Texto1}"
                                                    text="#{currentRow.value['p54a']}"/>
                                                <webuijsf:message id="messageP54a1"
                                                    for="campoP54a1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnP54Otr1}"
                                                    headerText="p54 otr"
                                                    id="tableColumnP54Otr1" rendered="false"
                                                    sort="p54_otr">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP54Otr1"
                                                    text="#{currentRow.value['p54_otr']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelP54Otr1}"
                                                    id="labelP54Otr1"
                                                    for="campoP54Otr1"/>
                                                <webuijsf:textArea id="campoP54Otr1"
                                                    binding="#{LogImpPerEec5.campoP54Otr1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p54_otr']}"
                                                    toolTip="BundleParametros.p54_otr.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorP54Otr1.validate}"/>
                                                <webuijsf:staticText id="campoP54Otr1Texto1"
                                                    binding="#{LogImpPerEec5.campoP54Otr1Texto1}"
                                                    text="#{currentRow.value['p54_otr']}"/>
                                                <webuijsf:message id="messageP54Otr1"
                                                    for="campoP54Otr1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnP551}"
                                                    headerText="p55"
                                                    id="tableColumnP551" rendered="false"
                                                    sort="p55">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP551"
                                                    text="#{currentRow.value['p55']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelP551}"
                                                    id="labelP551"
                                                    for="campoP551"/>
                                                <webuijsf:textArea id="campoP551"
                                                    binding="#{LogImpPerEec5.campoP551}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p55']}"
                                                    toolTip="BundleParametros.p55.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorP551.validate}"/>
                                                <webuijsf:staticText id="campoP551Texto1"
                                                    binding="#{LogImpPerEec5.campoP551Texto1}"
                                                    text="#{currentRow.value['p55']}"/>
                                                <webuijsf:message id="messageP551"
                                                    for="campoP551"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnP55Otr1}"
                                                    headerText="p55 otr"
                                                    id="tableColumnP55Otr1" rendered="false"
                                                    sort="p55_otr">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP55Otr1"
                                                    text="#{currentRow.value['p55_otr']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelP55Otr1}"
                                                    id="labelP55Otr1"
                                                    for="campoP55Otr1"/>
                                                <webuijsf:textArea id="campoP55Otr1"
                                                    binding="#{LogImpPerEec5.campoP55Otr1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p55_otr']}"
                                                    toolTip="BundleParametros.p55_otr.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorP55Otr1.validate}"/>
                                                <webuijsf:staticText id="campoP55Otr1Texto1"
                                                    binding="#{LogImpPerEec5.campoP55Otr1Texto1}"
                                                    text="#{currentRow.value['p55_otr']}"/>
                                                <webuijsf:message id="messageP55Otr1"
                                                    for="campoP55Otr1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnP561}"
                                                    headerText="p56"
                                                    id="tableColumnP561" rendered="false"
                                                    sort="p56">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP561"
                                                    text="#{currentRow.value['p56']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelP561}"
                                                    id="labelP561"
                                                    for="campoP561"/>
                                                <webuijsf:textArea id="campoP561"
                                                    binding="#{LogImpPerEec5.campoP561}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p56']}"
                                                    toolTip="BundleParametros.p56.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorP561.validate}"/>
                                                <webuijsf:staticText id="campoP561Texto1"
                                                    binding="#{LogImpPerEec5.campoP561Texto1}"
                                                    text="#{currentRow.value['p56']}"/>
                                                <webuijsf:message id="messageP561"
                                                    for="campoP561"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnP571}"
                                                    headerText="p57"
                                                    id="tableColumnP571" rendered="false"
                                                    sort="p57">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP571"
                                                    text="#{currentRow.value['p57']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelP571}"
                                                    id="labelP571"
                                                    for="campoP571"/>
                                                <webuijsf:textArea id="campoP571"
                                                    binding="#{LogImpPerEec5.campoP571}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p57']}"
                                                    toolTip="BundleParametros.p57.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorP571.validate}"/>
                                                <webuijsf:staticText id="campoP571Texto1"
                                                    binding="#{LogImpPerEec5.campoP571Texto1}"
                                                    text="#{currentRow.value['p57']}"/>
                                                <webuijsf:message id="messageP571"
                                                    for="campoP571"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnP581}"
                                                    headerText="p58"
                                                    id="tableColumnP581" rendered="false"
                                                    sort="p58">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP581"
                                                    text="#{currentRow.value['p58']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelP581}"
                                                    id="labelP581"
                                                    for="campoP581"/>
                                                <webuijsf:textArea id="campoP581"
                                                    binding="#{LogImpPerEec5.campoP581}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p58']}"
                                                    toolTip="BundleParametros.p58.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorP581.validate}"/>
                                                <webuijsf:staticText id="campoP581Texto1"
                                                    binding="#{LogImpPerEec5.campoP581Texto1}"
                                                    text="#{currentRow.value['p58']}"/>
                                                <webuijsf:message id="messageP581"
                                                    for="campoP581"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnP591}"
                                                    headerText="p59"
                                                    id="tableColumnP591" rendered="false"
                                                    sort="p59">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP591"
                                                    text="#{currentRow.value['p59']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelP591}"
                                                    id="labelP591"
                                                    for="campoP591"/>
                                                <webuijsf:textArea id="campoP591"
                                                    binding="#{LogImpPerEec5.campoP591}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p59']}"
                                                    toolTip="BundleParametros.p59.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorP591.validate}"/>
                                                <webuijsf:staticText id="campoP591Texto1"
                                                    binding="#{LogImpPerEec5.campoP591Texto1}"
                                                    text="#{currentRow.value['p59']}"/>
                                                <webuijsf:message id="messageP591"
                                                    for="campoP591"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnP601}"
                                                    headerText="p60"
                                                    id="tableColumnP601" rendered="false"
                                                    sort="p60">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP601"
                                                    text="#{currentRow.value['p60']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelP601}"
                                                    id="labelP601"
                                                    for="campoP601"/>
                                                <webuijsf:textArea id="campoP601"
                                                    binding="#{LogImpPerEec5.campoP601}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p60']}"
                                                    toolTip="BundleParametros.p60.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorP601.validate}"/>
                                                <webuijsf:staticText id="campoP601Texto1"
                                                    binding="#{LogImpPerEec5.campoP601Texto1}"
                                                    text="#{currentRow.value['p60']}"/>
                                                <webuijsf:message id="messageP601"
                                                    for="campoP601"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnP611}"
                                                    headerText="p61"
                                                    id="tableColumnP611" rendered="false"
                                                    sort="p61">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP611"
                                                    text="#{currentRow.value['p61']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelP611}"
                                                    id="labelP611"
                                                    for="campoP611"/>
                                                <webuijsf:textArea id="campoP611"
                                                    binding="#{LogImpPerEec5.campoP611}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p61']}"
                                                    toolTip="BundleParametros.p61.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorP611.validate}"/>
                                                <webuijsf:staticText id="campoP611Texto1"
                                                    binding="#{LogImpPerEec5.campoP611Texto1}"
                                                    text="#{currentRow.value['p61']}"/>
                                                <webuijsf:message id="messageP611"
                                                    for="campoP611"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnP621}"
                                                    headerText="p62"
                                                    id="tableColumnP621" rendered="false"
                                                    sort="p62">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP621"
                                                    text="#{currentRow.value['p62']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelP621}"
                                                    id="labelP621"
                                                    for="campoP621"/>
                                                <webuijsf:textArea id="campoP621"
                                                    binding="#{LogImpPerEec5.campoP621}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p62']}"
                                                    toolTip="BundleParametros.p62.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorP621.validate}"/>
                                                <webuijsf:staticText id="campoP621Texto1"
                                                    binding="#{LogImpPerEec5.campoP621Texto1}"
                                                    text="#{currentRow.value['p62']}"/>
                                                <webuijsf:message id="messageP621"
                                                    for="campoP621"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnP631}"
                                                    headerText="p63"
                                                    id="tableColumnP631" rendered="false"
                                                    sort="p63">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP631"
                                                    text="#{currentRow.value['p63']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelP631}"
                                                    id="labelP631"
                                                    for="campoP631"/>
                                                <webuijsf:textArea id="campoP631"
                                                    binding="#{LogImpPerEec5.campoP631}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p63']}"
                                                    toolTip="BundleParametros.p63.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorP631.validate}"/>
                                                <webuijsf:staticText id="campoP631Texto1"
                                                    binding="#{LogImpPerEec5.campoP631Texto1}"
                                                    text="#{currentRow.value['p63']}"/>
                                                <webuijsf:message id="messageP631"
                                                    for="campoP631"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnP63Especificar1}"
                                                    headerText="p63 especificar"
                                                    id="tableColumnP63Especificar1" rendered="false"
                                                    sort="p63_especificar">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP63Especificar1"
                                                    text="#{currentRow.value['p63_especificar']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelP63Especificar1}"
                                                    id="labelP63Especificar1"
                                                    for="campoP63Especificar1"/>
                                                <webuijsf:textArea id="campoP63Especificar1"
                                                    binding="#{LogImpPerEec5.campoP63Especificar1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p63_especificar']}"
                                                    toolTip="BundleParametros.p63_especificar.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorP63Especificar1.validate}"/>
                                                <webuijsf:staticText id="campoP63Especificar1Texto1"
                                                    binding="#{LogImpPerEec5.campoP63Especificar1Texto1}"
                                                    text="#{currentRow.value['p63_especificar']}"/>
                                                <webuijsf:message id="messageP63Especificar1"
                                                    for="campoP63Especificar1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnP64des1}"
                                                    headerText="p64des"
                                                    id="tableColumnP64des1" rendered="false"
                                                    sort="p64des">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP64des1"
                                                    text="#{currentRow.value['p64des']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelP64des1}"
                                                    id="labelP64des1"
                                                    for="campoP64des1"/>
                                                <webuijsf:textArea id="campoP64des1"
                                                    binding="#{LogImpPerEec5.campoP64des1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p64des']}"
                                                    toolTip="BundleParametros.p64des.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorP64des1.validate}"/>
                                                <webuijsf:staticText id="campoP64des1Texto1"
                                                    binding="#{LogImpPerEec5.campoP64des1Texto1}"
                                                    text="#{currentRow.value['p64des']}"/>
                                                <webuijsf:message id="messageP64des1"
                                                    for="campoP64des1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnP64c1}"
                                                    headerText="p64c"
                                                    id="tableColumnP64c1" rendered="false"
                                                    sort="p64c">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP64c1"
                                                    text="#{currentRow.value['p64c']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelP64c1}"
                                                    id="labelP64c1"
                                                    for="campoP64c1"/>
                                                <webuijsf:textArea id="campoP64c1"
                                                    binding="#{LogImpPerEec5.campoP64c1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p64c']}"
                                                    toolTip="BundleParametros.p64c.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorP64c1.validate}"/>
                                                <webuijsf:staticText id="campoP64c1Texto1"
                                                    binding="#{LogImpPerEec5.campoP64c1Texto1}"
                                                    text="#{currentRow.value['p64c']}"/>
                                                <webuijsf:message id="messageP64c1"
                                                    for="campoP64c1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnP65des1}"
                                                    headerText="p65des"
                                                    id="tableColumnP65des1" rendered="false"
                                                    sort="p65des">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP65des1"
                                                    text="#{currentRow.value['p65des']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelP65des1}"
                                                    id="labelP65des1"
                                                    for="campoP65des1"/>
                                                <webuijsf:textArea id="campoP65des1"
                                                    binding="#{LogImpPerEec5.campoP65des1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p65des']}"
                                                    toolTip="BundleParametros.p65des.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorP65des1.validate}"/>
                                                <webuijsf:staticText id="campoP65des1Texto1"
                                                    binding="#{LogImpPerEec5.campoP65des1Texto1}"
                                                    text="#{currentRow.value['p65des']}"/>
                                                <webuijsf:message id="messageP65des1"
                                                    for="campoP65des1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnP65c1}"
                                                    headerText="p65c"
                                                    id="tableColumnP65c1" rendered="false"
                                                    sort="p65c">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP65c1"
                                                    text="#{currentRow.value['p65c']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelP65c1}"
                                                    id="labelP65c1"
                                                    for="campoP65c1"/>
                                                <webuijsf:textArea id="campoP65c1"
                                                    binding="#{LogImpPerEec5.campoP65c1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p65c']}"
                                                    toolTip="BundleParametros.p65c.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorP65c1.validate}"/>
                                                <webuijsf:staticText id="campoP65c1Texto1"
                                                    binding="#{LogImpPerEec5.campoP65c1Texto1}"
                                                    text="#{currentRow.value['p65c']}"/>
                                                <webuijsf:message id="messageP65c1"
                                                    for="campoP65c1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnP661}"
                                                    headerText="p66"
                                                    id="tableColumnP661" rendered="false"
                                                    sort="p66">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP661"
                                                    text="#{currentRow.value['p66']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelP661}"
                                                    id="labelP661"
                                                    for="campoP661"/>
                                                <webuijsf:textArea id="campoP661"
                                                    binding="#{LogImpPerEec5.campoP661}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p66']}"
                                                    toolTip="BundleParametros.p66.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorP661.validate}"/>
                                                <webuijsf:staticText id="campoP661Texto1"
                                                    binding="#{LogImpPerEec5.campoP661Texto1}"
                                                    text="#{currentRow.value['p66']}"/>
                                                <webuijsf:message id="messageP661"
                                                    for="campoP661"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnP67a1}"
                                                    headerText="p67a"
                                                    id="tableColumnP67a1" rendered="false"
                                                    sort="p67a">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP67a1"
                                                    text="#{currentRow.value['p67a']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelP67a1}"
                                                    id="labelP67a1"
                                                    for="campoP67a1"/>
                                                <webuijsf:textArea id="campoP67a1"
                                                    binding="#{LogImpPerEec5.campoP67a1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p67a']}"
                                                    toolTip="BundleParametros.p67a.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorP67a1.validate}"/>
                                                <webuijsf:staticText id="campoP67a1Texto1"
                                                    binding="#{LogImpPerEec5.campoP67a1Texto1}"
                                                    text="#{currentRow.value['p67a']}"/>
                                                <webuijsf:message id="messageP67a1"
                                                    for="campoP67a1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnP67b1}"
                                                    headerText="p67b"
                                                    id="tableColumnP67b1" rendered="false"
                                                    sort="p67b">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP67b1"
                                                    text="#{currentRow.value['p67b']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelP67b1}"
                                                    id="labelP67b1"
                                                    for="campoP67b1"/>
                                                <webuijsf:textArea id="campoP67b1"
                                                    binding="#{LogImpPerEec5.campoP67b1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p67b']}"
                                                    toolTip="BundleParametros.p67b.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorP67b1.validate}"/>
                                                <webuijsf:staticText id="campoP67b1Texto1"
                                                    binding="#{LogImpPerEec5.campoP67b1Texto1}"
                                                    text="#{currentRow.value['p67b']}"/>
                                                <webuijsf:message id="messageP67b1"
                                                    for="campoP67b1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnP67c1}"
                                                    headerText="p67c"
                                                    id="tableColumnP67c1" rendered="false"
                                                    sort="p67c">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP67c1"
                                                    text="#{currentRow.value['p67c']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelP67c1}"
                                                    id="labelP67c1"
                                                    for="campoP67c1"/>
                                                <webuijsf:textArea id="campoP67c1"
                                                    binding="#{LogImpPerEec5.campoP67c1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p67c']}"
                                                    toolTip="BundleParametros.p67c.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorP67c1.validate}"/>
                                                <webuijsf:staticText id="campoP67c1Texto1"
                                                    binding="#{LogImpPerEec5.campoP67c1Texto1}"
                                                    text="#{currentRow.value['p67c']}"/>
                                                <webuijsf:message id="messageP67c1"
                                                    for="campoP67c1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnP67d1}"
                                                    headerText="p67d"
                                                    id="tableColumnP67d1" rendered="false"
                                                    sort="p67d">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP67d1"
                                                    text="#{currentRow.value['p67d']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelP67d1}"
                                                    id="labelP67d1"
                                                    for="campoP67d1"/>
                                                <webuijsf:textArea id="campoP67d1"
                                                    binding="#{LogImpPerEec5.campoP67d1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p67d']}"
                                                    toolTip="BundleParametros.p67d.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorP67d1.validate}"/>
                                                <webuijsf:staticText id="campoP67d1Texto1"
                                                    binding="#{LogImpPerEec5.campoP67d1Texto1}"
                                                    text="#{currentRow.value['p67d']}"/>
                                                <webuijsf:message id="messageP67d1"
                                                    for="campoP67d1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnP67e1}"
                                                    headerText="p67e"
                                                    id="tableColumnP67e1" rendered="false"
                                                    sort="p67e">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP67e1"
                                                    text="#{currentRow.value['p67e']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelP67e1}"
                                                    id="labelP67e1"
                                                    for="campoP67e1"/>
                                                <webuijsf:textArea id="campoP67e1"
                                                    binding="#{LogImpPerEec5.campoP67e1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p67e']}"
                                                    toolTip="BundleParametros.p67e.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorP67e1.validate}"/>
                                                <webuijsf:staticText id="campoP67e1Texto1"
                                                    binding="#{LogImpPerEec5.campoP67e1Texto1}"
                                                    text="#{currentRow.value['p67e']}"/>
                                                <webuijsf:message id="messageP67e1"
                                                    for="campoP67e1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnP67f1}"
                                                    headerText="p67f"
                                                    id="tableColumnP67f1" rendered="false"
                                                    sort="p67f">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP67f1"
                                                    text="#{currentRow.value['p67f']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelP67f1}"
                                                    id="labelP67f1"
                                                    for="campoP67f1"/>
                                                <webuijsf:textArea id="campoP67f1"
                                                    binding="#{LogImpPerEec5.campoP67f1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p67f']}"
                                                    toolTip="BundleParametros.p67f.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorP67f1.validate}"/>
                                                <webuijsf:staticText id="campoP67f1Texto1"
                                                    binding="#{LogImpPerEec5.campoP67f1Texto1}"
                                                    text="#{currentRow.value['p67f']}"/>
                                                <webuijsf:message id="messageP67f1"
                                                    for="campoP67f1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnP67g1}"
                                                    headerText="p67g"
                                                    id="tableColumnP67g1" rendered="false"
                                                    sort="p67g">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP67g1"
                                                    text="#{currentRow.value['p67g']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelP67g1}"
                                                    id="labelP67g1"
                                                    for="campoP67g1"/>
                                                <webuijsf:textArea id="campoP67g1"
                                                    binding="#{LogImpPerEec5.campoP67g1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p67g']}"
                                                    toolTip="BundleParametros.p67g.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorP67g1.validate}"/>
                                                <webuijsf:staticText id="campoP67g1Texto1"
                                                    binding="#{LogImpPerEec5.campoP67g1Texto1}"
                                                    text="#{currentRow.value['p67g']}"/>
                                                <webuijsf:message id="messageP67g1"
                                                    for="campoP67g1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnP67h1}"
                                                    headerText="p67h"
                                                    id="tableColumnP67h1" rendered="false"
                                                    sort="p67h">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP67h1"
                                                    text="#{currentRow.value['p67h']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelP67h1}"
                                                    id="labelP67h1"
                                                    for="campoP67h1"/>
                                                <webuijsf:textArea id="campoP67h1"
                                                    binding="#{LogImpPerEec5.campoP67h1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p67h']}"
                                                    toolTip="BundleParametros.p67h.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorP67h1.validate}"/>
                                                <webuijsf:staticText id="campoP67h1Texto1"
                                                    binding="#{LogImpPerEec5.campoP67h1Texto1}"
                                                    text="#{currentRow.value['p67h']}"/>
                                                <webuijsf:message id="messageP67h1"
                                                    for="campoP67h1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnP67i1}"
                                                    headerText="p67i"
                                                    id="tableColumnP67i1" rendered="false"
                                                    sort="p67i">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP67i1"
                                                    text="#{currentRow.value['p67i']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelP67i1}"
                                                    id="labelP67i1"
                                                    for="campoP67i1"/>
                                                <webuijsf:textArea id="campoP67i1"
                                                    binding="#{LogImpPerEec5.campoP67i1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p67i']}"
                                                    toolTip="BundleParametros.p67i.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorP67i1.validate}"/>
                                                <webuijsf:staticText id="campoP67i1Texto1"
                                                    binding="#{LogImpPerEec5.campoP67i1Texto1}"
                                                    text="#{currentRow.value['p67i']}"/>
                                                <webuijsf:message id="messageP67i1"
                                                    for="campoP67i1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnP67j1}"
                                                    headerText="p67j"
                                                    id="tableColumnP67j1" rendered="false"
                                                    sort="p67j">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP67j1"
                                                    text="#{currentRow.value['p67j']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelP67j1}"
                                                    id="labelP67j1"
                                                    for="campoP67j1"/>
                                                <webuijsf:textArea id="campoP67j1"
                                                    binding="#{LogImpPerEec5.campoP67j1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p67j']}"
                                                    toolTip="BundleParametros.p67j.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorP67j1.validate}"/>
                                                <webuijsf:staticText id="campoP67j1Texto1"
                                                    binding="#{LogImpPerEec5.campoP67j1Texto1}"
                                                    text="#{currentRow.value['p67j']}"/>
                                                <webuijsf:message id="messageP67j1"
                                                    for="campoP67j1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnP67k1}"
                                                    headerText="p67k"
                                                    id="tableColumnP67k1" rendered="false"
                                                    sort="p67k">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP67k1"
                                                    text="#{currentRow.value['p67k']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelP67k1}"
                                                    id="labelP67k1"
                                                    for="campoP67k1"/>
                                                <webuijsf:textArea id="campoP67k1"
                                                    binding="#{LogImpPerEec5.campoP67k1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p67k']}"
                                                    toolTip="BundleParametros.p67k.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorP67k1.validate}"/>
                                                <webuijsf:staticText id="campoP67k1Texto1"
                                                    binding="#{LogImpPerEec5.campoP67k1Texto1}"
                                                    text="#{currentRow.value['p67k']}"/>
                                                <webuijsf:message id="messageP67k1"
                                                    for="campoP67k1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnP67l1}"
                                                    headerText="p67l"
                                                    id="tableColumnP67l1" rendered="false"
                                                    sort="p67l">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP67l1"
                                                    text="#{currentRow.value['p67l']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelP67l1}"
                                                    id="labelP67l1"
                                                    for="campoP67l1"/>
                                                <webuijsf:textArea id="campoP67l1"
                                                    binding="#{LogImpPerEec5.campoP67l1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p67l']}"
                                                    toolTip="BundleParametros.p67l.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorP67l1.validate}"/>
                                                <webuijsf:staticText id="campoP67l1Texto1"
                                                    binding="#{LogImpPerEec5.campoP67l1Texto1}"
                                                    text="#{currentRow.value['p67l']}"/>
                                                <webuijsf:message id="messageP67l1"
                                                    for="campoP67l1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnP67tot1}"
                                                    headerText="p67tot"
                                                    id="tableColumnP67tot1" rendered="false"
                                                    sort="p67tot">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP67tot1"
                                                    text="#{currentRow.value['p67tot']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelP67tot1}"
                                                    id="labelP67tot1"
                                                    for="campoP67tot1"/>
                                                <webuijsf:textArea id="campoP67tot1"
                                                    binding="#{LogImpPerEec5.campoP67tot1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p67tot']}"
                                                    toolTip="BundleParametros.p67tot.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorP67tot1.validate}"/>
                                                <webuijsf:staticText id="campoP67tot1Texto1"
                                                    binding="#{LogImpPerEec5.campoP67tot1Texto1}"
                                                    text="#{currentRow.value['p67tot']}"/>
                                                <webuijsf:message id="messageP67tot1"
                                                    for="campoP67tot1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnEsImportado1}"
                                                    headerText="importado"
                                                    id="tableColumnEsImportado1"
                                                    sort="es_importado">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsImportado1"
                                                    text="#{currentRow.value['es_importado']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelEsImportado1}"
                                                    id="labelEsImportado1"
                                                    for="listaEsImportado1"/>
                                                <webuijsf:dropDown id="listaEsImportado1"
                                                    binding="#{LogImpPerEec5.listaEsImportado1}"
                                                    converter="#{LogImpPerEec5.converterEsImportado1}"
                                                    disabled="#{LogImpPerEec5.gestor.filaNoProcesada}" required="true"
                                                    items="#{LogImpPerEec5.asistente.opcionesListaEsImportado1}"
                                                    selected="#{currentRow.value['es_importado']}"
                                                    toolTip="BundleParametros.es_importado.log_imp_per_eec"/>
                                                <webuijsf:staticText id="listaEsImportado1Texto1"
                                                    binding="#{LogImpPerEec5.listaEsImportado1Texto1}"/>
                                                <webuijsf:message id="messageEsImportado1"
                                                    for="listaEsImportado1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnObservacion1}"
                                                    headerText="observaci&#243;n"
                                                    id="tableColumnObservacion1"
                                                    sort="observacion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextObservacion1"
                                                    text="#{currentRow.value['observacion']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelObservacion1}"
                                                    id="labelObservacion1"
                                                    for="campoObservacion1"/>
                                                <webuijsf:textArea id="campoObservacion1"
                                                    binding="#{LogImpPerEec5.campoObservacion1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['observacion']}"
                                                    toolTip="BundleParametros.observacion.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorObservacion1.validate}"/>
                                                <webuijsf:staticText id="campoObservacion1Texto1"
                                                    binding="#{LogImpPerEec5.campoObservacion1Texto1}"
                                                    text="#{currentRow.value['observacion']}"/>
                                                <webuijsf:message id="messageObservacion1"
                                                    for="campoObservacion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnFechaHoraTransaccion1}"
                                                    headerText="fecha hora transacci&#243;n"
                                                    id="tableColumnFechaHoraTransaccion1"
                                                    sort="fecha_hora_transaccion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextFechaHoraTransaccion1"
                                                    text="#{currentRow.value['fecha_hora_transaccion']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelFechaHoraTransaccion1}"
                                                    id="labelFechaHoraTransaccion1"
                                                    for="campoFechaHoraTransaccion1"/>
                                                <webuijsf:textField id="campoFechaHoraTransaccion1"
                                                    binding="#{LogImpPerEec5.campoFechaHoraTransaccion1}"
                                                    converter="#{LogImpPerEec5.converterFechaHoraTransaccion1}"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['fecha_hora_transaccion']}"
                                                    toolTip="BundleParametros.fecha_hora_transaccion.log_imp_per_eec"/>
                                                <webuijsf:staticText id="campoFechaHoraTransaccion1Texto1"
                                                    binding="#{LogImpPerEec5.campoFechaHoraTransaccion1Texto1}"
                                                    converter="#{LogImpPerEec5.converterFechaHoraTransaccion1}"
                                                    text="#{currentRow.value['fecha_hora_transaccion']}"/>
                                                <webuijsf:message id="messageFechaHoraTransaccion1"
                                                    for="campoFechaHoraTransaccion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnNombreArchivo1}"
                                                    headerText="nombre archivo"
                                                    id="tableColumnNombreArchivo1" rendered="false"
                                                    sort="nombre_archivo">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNombreArchivo1"
                                                    text="#{currentRow.value['nombre_archivo']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelNombreArchivo1}"
                                                    id="labelNombreArchivo1"
                                                    for="campoNombreArchivo1"/>
                                                <webuijsf:textArea id="campoNombreArchivo1"
                                                    binding="#{LogImpPerEec5.campoNombreArchivo1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['nombre_archivo']}"
                                                    toolTip="BundleParametros.nombre_archivo.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorNombreArchivo1.validate}"/>
                                                <webuijsf:staticText id="campoNombreArchivo1Texto1"
                                                    binding="#{LogImpPerEec5.campoNombreArchivo1Texto1}"
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
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{LogImpPerEec5.campoNombreArchivo1Boton3}"
                                                    id="campoNombreArchivo1Boton3"
                                                    onClick="#{LogImpPerEec5.asistente.scriptCampoNombreArchivo1Boton3}"
                                                    rendered="#{LogImpPerEec5.asistente.campoNombreArchivo1Boton3Rendered}"
                                                    text="#{LogImpPerEec5.asistente.textCampoNombreArchivo1Boton3}"
                                                    toolTip="#{LogImpPerEec5.asistente.toolTipCampoNombreArchivo1Boton3}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPerEec5.tableColumnCodigoArchivo1}"
                                                    headerText="c&#243;digo archivo"
                                                    id="tableColumnCodigoArchivo1" rendered="false"
                                                    sort="codigo_archivo">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextCodigoArchivo1"
                                                    text="#{currentRow.value['codigo_archivo']}"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec5.labelCodigoArchivo1}"
                                                    id="labelCodigoArchivo1"
                                                    for="campoCodigoArchivo1"/>
                                                <webuijsf:textArea id="campoCodigoArchivo1"
                                                    binding="#{LogImpPerEec5.campoCodigoArchivo1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPerEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['codigo_archivo']}"
                                                    toolTip="BundleParametros.codigo_archivo.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec5.validatorCodigoArchivo1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoArchivo1Texto1"
                                                    binding="#{LogImpPerEec5.campoCodigoArchivo1Texto1}"
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
                                                        binding="#{LogImpPerEec5.etiquetaTextoFilasPorPagina1}" 
                                                        for="textoFilasPorPagina1"
                                                        id="etiquetaTextoFilasPorPagina1" 
                                                        text="#{LogImpPerEec5.gestor.i18n.textoEtiquetaTextoFilasPorPagina}"/>
                                                </h:panelGrid>
                                                <h:panelGrid 
                                                    columns="3" 
                                                    id="gridPanel107">
                                                    <webuijsf:textField 
                                                        binding="#{LogImpPerEec5.textoFilasPorPagina1}" 
                                                        columns="2"
                                                        converter="#{LogImpPerEec5.textoFilasPorPagina1Converter1}"
                                                        disabled="#{LogImpPerEec5.gestor.paginacionInhabilitada}" 
                                                        id="textoFilasPorPagina1" maxLength="2"
                                                        text="#{LogImpPerEec5.gestor.filasPorPagina}" 
                                                        validatorExpression="#{LogImpPerEec5.textoFilasPorPagina1Validator1.validate}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{LogImpPerEec5.botonRepaginar1_action}"
                                                        binding="#{LogImpPerEec5.botonRepaginar1}" 
                                                        id="botonRepaginar1"
                                                        imageURL="#{LogImpPerEec5.gestor.urlImagenRepaginar}" 
                                                        onClick="#{LogImpPerEec5.gestor.scriptRepaginar}"
                                                        text="#{LogImpPerEec5.gestor.i18n.textoBotonRepaginar}"
                                                        toolTip="#{LogImpPerEec5.gestor.i18n.toolTipBotonRepaginar}"/>
                                                    <webuijsf:message 
                                                        for="textoFilasPorPagina1" 
                                                        id="messageFilasPorPagina1"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="13"
                                                id="gridPanel108">
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPerEec5.botonAgregar1_action}"
                                                    binding="#{LogImpPerEec5.botonAgregar1}"
                                                    disabled="#{LogImpPerEec5.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{LogImpPerEec5.gestor.scriptAgregar}"
                                                    rendered="#{LogImpPerEec5.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPerEec5.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{LogImpPerEec5.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{LogImpPerEec5.listaFuncionEdicion1}"
                                                    converter="#{LogImpPerEec5.converterListaFuncionEdicion1}"
                                                    disabled="#{LogImpPerEec5.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{LogImpPerEec5.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{LogImpPerEec5.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{LogImpPerEec5.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{LogImpPerEec5.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPerEec5.botonEditar1_action}"
                                                    binding="#{LogImpPerEec5.botonEditar1}"
                                                    disabled="#{LogImpPerEec5.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{LogImpPerEec5.gestor.scriptEditar}"
                                                    rendered="#{LogImpPerEec5.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPerEec5.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{LogImpPerEec5.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPerEec5.botonEliminar1_action}"
                                                    binding="#{LogImpPerEec5.botonEliminar1}"
                                                    disabled="#{LogImpPerEec5.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{LogImpPerEec5.gestor.scriptEliminar}"
                                                    rendered="#{LogImpPerEec5.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPerEec5.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{LogImpPerEec5.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPerEec5.botonAplicar1_action}"
                                                    binding="#{LogImpPerEec5.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{LogImpPerEec5.gestor.scriptAplicar}"
                                                    rendered="#{LogImpPerEec5.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPerEec5.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{LogImpPerEec5.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPerEec5.botonDeshacer1_action}"
                                                    binding="#{LogImpPerEec5.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{LogImpPerEec5.gestor.scriptDeshacer}"
                                                    rendered="#{LogImpPerEec5.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPerEec5.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{LogImpPerEec5.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPerEec5.botonConfirmar1_action}"
                                                    binding="#{LogImpPerEec5.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{LogImpPerEec5.gestor.scriptConfirmar}"
                                                    rendered="#{LogImpPerEec5.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPerEec5.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{LogImpPerEec5.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPerEec5.botonDescartar1_action}"
                                                    binding="#{LogImpPerEec5.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{LogImpPerEec5.gestor.scriptDescartar}"
                                                    rendered="#{LogImpPerEec5.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPerEec5.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{LogImpPerEec5.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{LogImpPerEec5.listaFuncionAccion1}"
                                                    converter="#{LogImpPerEec5.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{LogImpPerEec5.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{LogImpPerEec5.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{LogImpPerEec5.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{LogImpPerEec5.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPerEec5.botonProcesar1_action}"
                                                    binding="#{LogImpPerEec5.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{LogImpPerEec5.gestor.scriptProcesar}"
                                                    rendered="#{LogImpPerEec5.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPerEec5.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{LogImpPerEec5.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPerEec5.botonRefrescar1_action}"
                                                    binding="#{LogImpPerEec5.botonRefrescar1}"
                                                    disabled="#{LogImpPerEec5.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{LogImpPerEec5.gestor.scriptRefrescar}"
                                                    rendered="#{LogImpPerEec5.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPerEec5.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{LogImpPerEec5.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPerEec5.botonReconsultar1_action}"
                                                    binding="#{LogImpPerEec5.botonReconsultar1}"
                                                    disabled="#{LogImpPerEec5.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{LogImpPerEec5.gestor.scriptReconsultar}"
                                                    rendered="#{LogImpPerEec5.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPerEec5.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{LogImpPerEec5.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPerEec5.botonRetornar1_action}"
                                                    binding="#{LogImpPerEec5.botonRetornar1}"
                                                    disabled="#{LogImpPerEec5.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{LogImpPerEec5.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{LogImpPerEec5.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPerEec5.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{LogImpPerEec5.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel109"
                                                rendered="#{LogImpPerEec5.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{LogImpPerEec5.imageHyperlink1_action}"
                                                    binding="#{LogImpPerEec5.imageHyperlink1}"
                                                    disabled="#{LogImpPerEec5.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{LogImpPerEec5.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{LogImpPerEec5.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{LogImpPerEec5.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.LogImpPerEec5_imageHyperlink1_toolTip}"/>
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
