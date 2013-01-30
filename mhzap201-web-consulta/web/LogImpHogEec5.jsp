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
                    focus="#{LogImpHogEec5.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{LogImpHogEec5.gestor.preserveFocus}"
                    preserveScroll="#{LogImpHogEec5.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{LogImpHogEec5.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | checkbox1 campoIdLogImpHogEec1 campoDptod1 campoDistritod1 campoDistripg1 campoArea1 campoBarrio1 campoManzana1 campoFormulario1 campoVivi1 campoHogar1 campoDireccion1 campoNroDe1 campoTelefono1 campoFecha1 campoDia1 campoMes1 campoAno1 campoV10t1 campoV111 campoV121 campoV131 campoV141 campoV151 campoV161 campoV16Otr1 campoV17a1 campoV17b1 campoV181 campoV191 campoV201 campoV211 campoV221 campoV231 campoV241 campoV251 campoV261 campoV26espCelular1 campoV271 campoV27espLinea1 campoV2811 campoV2821 campoV2831 campoV2841 campoV2851 campoV2861 campoV2871 campoV2881 campoV29nombreJefe1 campoCedulajefe1 campoVar000011 listaEsImportado1 campoObservacion1 campoFechaHoraTransaccion1 campoNombreArchivo1 campoCodigoArchivo1 textoFilasPorPagina1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | textoFilasPorPagina1 | botonRepaginar1 , virtualForm3 | checkbox1 listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonEscogerFila1 botonDetallarFila1 botonProcesarFila1 botonRetornarFila1 botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{LogImpHogEec5.breadcrumbs1}" 
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
                                                    rendered="#{LogImpHogEec5.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{LogImpHogEec5.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{LogImpHogEec5.gestor.mensajeDisponible}"
                                                    text="#{LogImpHogEec5.gestor.mensaje}"
                                                    url="#{LogImpHogEec5.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:table
                                            binding="#{LogImpHogEec5.table1}"
                                            clearSortButton="true" 
                                            deselectMultipleButton="true" 
                                            id="table1"
                                            paginateButton="false"
                                            paginationControls="true" 
                                            selectMultipleButton="true" 
                                            sortPanelToggleButton="true"
                                            width="960">
                                            <webuijsf:tableRowGroup 
                                                binding="#{LogImpHogEec5.tableRowGroup1}" 
                                                id="tableRowGroup1" 
                                                rows="1"
                                                selected="#{LogImpHogEec5.gestor.filaEscogida}" 
                                                sourceData="#{LogImpHogEec5.logImpHogEecDataProvider}" 
                                                sourceVar="currentRow">
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    id="tableRowGroup1SelectionColumn"
                                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);" 
                                                    selectId="checkbox1">
                                                    <webuijsf:checkbox 
                                                        binding="#{LogImpHogEec5.checkbox1}" 
                                                        id="checkbox1"
                                                        onClick="#{LogImpHogEec5.gestor.scriptElegir}" 
                                                        selected="#{LogImpHogEec5.gestor.filaElegida}" 
                                                        toolTip="#{LogImpHogEec5.gestor.i18n.toolTipCheckboxSeleccionMultiple}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    binding="#{LogImpHogEec5.tableColumn1}" 
                                                    id="tableColumn1">
                                                    <webuijsf:button 
                                                        actionExpression="#{LogImpHogEec5.botonEscogerFila1_action}"
                                                        binding="#{LogImpHogEec5.botonEscogerFila1}"
                                                        disabled="#{LogImpHogEec5.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonEscogerFila1"
                                                        imageURL="#{LogImpHogEec5.gestor.urlImagenEscoger}" 
                                                        onClick="#{LogImpHogEec5.gestor.scriptEscoger}"
                                                        text="#{LogImpHogEec5.gestor.i18n.textoBotonEscogerFila}"
                                                        toolTip="#{LogImpHogEec5.gestor.i18n.toolTipBotonEscogerFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{LogImpHogEec5.botonDetallarFila1_action}"
                                                        binding="#{LogImpHogEec5.botonDetallarFila1}"
                                                        disabled="#{LogImpHogEec5.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonDetallarFila1"
                                                        imageURL="#{LogImpHogEec5.gestor.urlImagenDetallar}" 
                                                        onClick="#{LogImpHogEec5.scriptAbrirVentanaVerDetalle}"
                                                        rendered="#{LogImpHogEec5.gestor.detalleDisponible}" 
                                                        text="#{LogImpHogEec5.gestor.i18n.textoBotonDetallarFila}"
                                                        toolTip="#{LogImpHogEec5.gestor.i18n.toolTipBotonDetallarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{LogImpHogEec5.botonProcesarFila1_action}"
                                                        binding="#{LogImpHogEec5.botonProcesarFila1}"
                                                        disabled="#{LogImpHogEec5.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonProcesarFila1"
                                                        imageURL="#{LogImpHogEec5.gestor.urlImagenProcesar}" 
                                                        onClick="#{LogImpHogEec5.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{LogImpHogEec5.asistente.comandoDisponible}" 
                                                        text="#{LogImpHogEec5.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{LogImpHogEec5.gestor.i18n.toolTipBotonProcesarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{LogImpHogEec5.botonRetornarFila1_action}"
                                                        binding="#{LogImpHogEec5.botonRetornarFila1}" 
                                                        disabled="#{LogImpHogEec5.gestor.funcionReturnInhabilitada}"
                                                        id="botonRetornarFila1"
                                                        imageURL="#{LogImpHogEec5.gestor.urlImagenRetornar}"
                                                        onClick="#{LogImpHogEec5.gestor.scriptRetornarRecursoActual}"
                                                        rendered="#{LogImpHogEec5.gestor.funcionReturnVisible}" 
                                                        text="#{LogImpHogEec5.gestor.i18n.textoBotonRetornarFila}"
                                                        toolTip="#{LogImpHogEec5.gestor.i18n.toolTipBotonRetornarFila}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHogEec5.tableColumn2}"
                                                    id="tableColumn2"
                                                    rendered="#{LogImpHogEec5.gestor.designing}">
                                                    <webuijsf:imageHyperlink
                                                        actionExpression="#{LogImpHogEec5.hipervinculoAccionFila1_action}"
                                                        binding="#{LogImpHogEec5.hipervinculoAccionFila1}"
                                                        disabled="#{LogImpHogEec5.gestor.loteConCambios}"
                                                        id="hipervinculoAccionFila1"
                                                        imageURL="#{LogImpHogEec5.gestor.urlImagenEjecutarVinculo}"
                                                        onClick="#{LogImpHogEec5.scriptAbrirVentanaAccionFila1}"
                                                        text="Accion1"
                                                        toolTip="#{bundle.LogImpHogEec5_hipervinculoAccionFila1_toolTip}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="right" 
                                                    binding="#{LogImpHogEec5.tableColumn3}" 
                                                    headerText="#{LogImpHogEec5.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{LogImpHogEec5.gestor.i18n.toolTipEtiquetaIdentificacionFila}"
                                                    id="tableColumn3">
                                                    <webuijsf:imageHyperlink 
                                                        actionExpression="#{LogImpHogEec5.hipervinculoDetallarFila1_action}"
                                                        binding="#{LogImpHogEec5.hipervinculoDetallarFila1}" 
                                                        id="hipervinculoDetallarFila1"
                                                        imageURL="#{LogImpHogEec5.gestor.urlImagenFilaProcesada}"
                                                        textPosition="left" 
                                                        text="#{LogImpHogEec5.gestor.identificacionFila}" 
                                                        toolTip="#{LogImpHogEec5.gestor.toolTipImagenFilaProcesada}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHogEec5.tableColumnIdLogImpHogEec1}"
                                                    headerText="identificaci&#243;n"
                                                    id="tableColumnIdLogImpHogEec1" rendered="false"
                                                    sort="id_log_imp_hog_eec">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdLogImpHogEec1"
                                                    text="#{currentRow.value['id_log_imp_hog_eec']}"
                                                    rendered="#{LogImpHogEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec5.labelIdLogImpHogEec1}"
                                                    id="labelIdLogImpHogEec1"
                                                    for="campoIdLogImpHogEec1"/>
                                                <webuijsf:textField id="campoIdLogImpHogEec1"
                                                    binding="#{LogImpHogEec5.campoIdLogImpHogEec1}"
                                                    converter="#{LogImpHogEec5.converterIdLogImpHogEec1}"
                                                    readOnly="#{LogImpHogEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['id_log_imp_hog_eec']}"
                                                    toolTip="BundleParametros.id_log_imp_hog_eec.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec5.validatorIdLogImpHogEec1.validate}"/>
                                                <webuijsf:staticText id="campoIdLogImpHogEec1Texto1"
                                                    binding="#{LogImpHogEec5.campoIdLogImpHogEec1Texto1}"
                                                    text="#{currentRow.value['id_log_imp_hog_eec']}"/>
                                                <webuijsf:message id="messageIdLogImpHogEec1"
                                                    for="campoIdLogImpHogEec1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHogEec5.tableColumnDptod1}"
                                                    headerText="dptod"
                                                    id="tableColumnDptod1" rendered="false"
                                                    sort="dptod">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextDptod1"
                                                    text="#{currentRow.value['dptod']}"
                                                    rendered="#{LogImpHogEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec5.labelDptod1}"
                                                    id="labelDptod1"
                                                    for="campoDptod1"/>
                                                <webuijsf:textArea id="campoDptod1"
                                                    binding="#{LogImpHogEec5.campoDptod1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHogEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['dptod']}"
                                                    toolTip="BundleParametros.dptod.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec5.validatorDptod1.validate}"/>
                                                <webuijsf:staticText id="campoDptod1Texto1"
                                                    binding="#{LogImpHogEec5.campoDptod1Texto1}"
                                                    text="#{currentRow.value['dptod']}"/>
                                                <webuijsf:message id="messageDptod1"
                                                    for="campoDptod1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHogEec5.tableColumnDistritod1}"
                                                    headerText="distritod"
                                                    id="tableColumnDistritod1" rendered="false"
                                                    sort="distritod">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextDistritod1"
                                                    text="#{currentRow.value['distritod']}"
                                                    rendered="#{LogImpHogEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec5.labelDistritod1}"
                                                    id="labelDistritod1"
                                                    for="campoDistritod1"/>
                                                <webuijsf:textArea id="campoDistritod1"
                                                    binding="#{LogImpHogEec5.campoDistritod1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHogEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['distritod']}"
                                                    toolTip="BundleParametros.distritod.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec5.validatorDistritod1.validate}"/>
                                                <webuijsf:staticText id="campoDistritod1Texto1"
                                                    binding="#{LogImpHogEec5.campoDistritod1Texto1}"
                                                    text="#{currentRow.value['distritod']}"/>
                                                <webuijsf:message id="messageDistritod1"
                                                    for="campoDistritod1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHogEec5.tableColumnDistripg1}"
                                                    headerText="distripg"
                                                    id="tableColumnDistripg1" rendered="false"
                                                    sort="distripg">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextDistripg1"
                                                    text="#{currentRow.value['distripg']}"
                                                    rendered="#{LogImpHogEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec5.labelDistripg1}"
                                                    id="labelDistripg1"
                                                    for="campoDistripg1"/>
                                                <webuijsf:textArea id="campoDistripg1"
                                                    binding="#{LogImpHogEec5.campoDistripg1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHogEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['distripg']}"
                                                    toolTip="BundleParametros.distripg.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec5.validatorDistripg1.validate}"/>
                                                <webuijsf:staticText id="campoDistripg1Texto1"
                                                    binding="#{LogImpHogEec5.campoDistripg1Texto1}"
                                                    text="#{currentRow.value['distripg']}"/>
                                                <webuijsf:message id="messageDistripg1"
                                                    for="campoDistripg1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHogEec5.tableColumnArea1}"
                                                    headerText="area"
                                                    id="tableColumnArea1" rendered="false"
                                                    sort="area">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextArea1"
                                                    text="#{currentRow.value['area']}"
                                                    rendered="#{LogImpHogEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec5.labelArea1}"
                                                    id="labelArea1"
                                                    for="campoArea1"/>
                                                <webuijsf:textArea id="campoArea1"
                                                    binding="#{LogImpHogEec5.campoArea1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHogEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['area']}"
                                                    toolTip="BundleParametros.area.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec5.validatorArea1.validate}"/>
                                                <webuijsf:staticText id="campoArea1Texto1"
                                                    binding="#{LogImpHogEec5.campoArea1Texto1}"
                                                    text="#{currentRow.value['area']}"/>
                                                <webuijsf:message id="messageArea1"
                                                    for="campoArea1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHogEec5.tableColumnBarrio1}"
                                                    headerText="barrio"
                                                    id="tableColumnBarrio1" rendered="false"
                                                    sort="barrio">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextBarrio1"
                                                    text="#{currentRow.value['barrio']}"
                                                    rendered="#{LogImpHogEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec5.labelBarrio1}"
                                                    id="labelBarrio1"
                                                    for="campoBarrio1"/>
                                                <webuijsf:textArea id="campoBarrio1"
                                                    binding="#{LogImpHogEec5.campoBarrio1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHogEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['barrio']}"
                                                    toolTip="BundleParametros.barrio.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec5.validatorBarrio1.validate}"/>
                                                <webuijsf:staticText id="campoBarrio1Texto1"
                                                    binding="#{LogImpHogEec5.campoBarrio1Texto1}"
                                                    text="#{currentRow.value['barrio']}"/>
                                                <webuijsf:message id="messageBarrio1"
                                                    for="campoBarrio1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHogEec5.tableColumnManzana1}"
                                                    headerText="manzana"
                                                    id="tableColumnManzana1" rendered="false"
                                                    sort="manzana">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextManzana1"
                                                    text="#{currentRow.value['manzana']}"
                                                    rendered="#{LogImpHogEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec5.labelManzana1}"
                                                    id="labelManzana1"
                                                    for="campoManzana1"/>
                                                <webuijsf:textArea id="campoManzana1"
                                                    binding="#{LogImpHogEec5.campoManzana1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHogEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['manzana']}"
                                                    toolTip="BundleParametros.manzana.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec5.validatorManzana1.validate}"/>
                                                <webuijsf:staticText id="campoManzana1Texto1"
                                                    binding="#{LogImpHogEec5.campoManzana1Texto1}"
                                                    text="#{currentRow.value['manzana']}"/>
                                                <webuijsf:message id="messageManzana1"
                                                    for="campoManzana1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHogEec5.tableColumnFormulario1}"
                                                    headerText="formulario"
                                                    id="tableColumnFormulario1"
                                                    sort="formulario">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextFormulario1"
                                                    text="#{currentRow.value['formulario']}"
                                                    rendered="#{LogImpHogEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec5.labelFormulario1}"
                                                    id="labelFormulario1"
                                                    for="campoFormulario1"/>
                                                <webuijsf:textArea id="campoFormulario1"
                                                    binding="#{LogImpHogEec5.campoFormulario1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHogEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['formulario']}"
                                                    toolTip="BundleParametros.formulario.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec5.validatorFormulario1.validate}"/>
                                                <webuijsf:staticText id="campoFormulario1Texto1"
                                                    binding="#{LogImpHogEec5.campoFormulario1Texto1}"
                                                    text="#{currentRow.value['formulario']}"/>
                                                <webuijsf:message id="messageFormulario1"
                                                    for="campoFormulario1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHogEec5.tableColumnVivi1}"
                                                    headerText="vivi"
                                                    id="tableColumnVivi1"
                                                    sort="vivi">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextVivi1"
                                                    text="#{currentRow.value['vivi']}"
                                                    rendered="#{LogImpHogEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec5.labelVivi1}"
                                                    id="labelVivi1"
                                                    for="campoVivi1"/>
                                                <webuijsf:textArea id="campoVivi1"
                                                    binding="#{LogImpHogEec5.campoVivi1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHogEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['vivi']}"
                                                    toolTip="BundleParametros.vivi.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec5.validatorVivi1.validate}"/>
                                                <webuijsf:staticText id="campoVivi1Texto1"
                                                    binding="#{LogImpHogEec5.campoVivi1Texto1}"
                                                    text="#{currentRow.value['vivi']}"/>
                                                <webuijsf:message id="messageVivi1"
                                                    for="campoVivi1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHogEec5.tableColumnHogar1}"
                                                    headerText="hogar"
                                                    id="tableColumnHogar1" rendered="false"
                                                    sort="hogar">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextHogar1"
                                                    text="#{currentRow.value['hogar']}"
                                                    rendered="#{LogImpHogEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec5.labelHogar1}"
                                                    id="labelHogar1"
                                                    for="campoHogar1"/>
                                                <webuijsf:textArea id="campoHogar1"
                                                    binding="#{LogImpHogEec5.campoHogar1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHogEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['hogar']}"
                                                    toolTip="BundleParametros.hogar.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec5.validatorHogar1.validate}"/>
                                                <webuijsf:staticText id="campoHogar1Texto1"
                                                    binding="#{LogImpHogEec5.campoHogar1Texto1}"
                                                    text="#{currentRow.value['hogar']}"/>
                                                <webuijsf:message id="messageHogar1"
                                                    for="campoHogar1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHogEec5.tableColumnDireccion1}"
                                                    headerText="direcci&#243;n"
                                                    id="tableColumnDireccion1" rendered="false"
                                                    sort="direccion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextDireccion1"
                                                    text="#{currentRow.value['direccion']}"
                                                    rendered="#{LogImpHogEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec5.labelDireccion1}"
                                                    id="labelDireccion1"
                                                    for="campoDireccion1"/>
                                                <webuijsf:textArea id="campoDireccion1"
                                                    binding="#{LogImpHogEec5.campoDireccion1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHogEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['direccion']}"
                                                    toolTip="BundleParametros.direccion.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec5.validatorDireccion1.validate}"/>
                                                <webuijsf:staticText id="campoDireccion1Texto1"
                                                    binding="#{LogImpHogEec5.campoDireccion1Texto1}"
                                                    text="#{currentRow.value['direccion']}"/>
                                                <webuijsf:message id="messageDireccion1"
                                                    for="campoDireccion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHogEec5.tableColumnNroDe1}"
                                                    headerText="nro de"
                                                    id="tableColumnNroDe1" rendered="false"
                                                    sort="nro_de">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNroDe1"
                                                    text="#{currentRow.value['nro_de']}"
                                                    rendered="#{LogImpHogEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec5.labelNroDe1}"
                                                    id="labelNroDe1"
                                                    for="campoNroDe1"/>
                                                <webuijsf:textArea id="campoNroDe1"
                                                    binding="#{LogImpHogEec5.campoNroDe1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHogEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['nro_de']}"
                                                    toolTip="BundleParametros.nro_de.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec5.validatorNroDe1.validate}"/>
                                                <webuijsf:staticText id="campoNroDe1Texto1"
                                                    binding="#{LogImpHogEec5.campoNroDe1Texto1}"
                                                    text="#{currentRow.value['nro_de']}"/>
                                                <webuijsf:message id="messageNroDe1"
                                                    for="campoNroDe1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHogEec5.tableColumnTelefono1}"
                                                    headerText="tel&#233;fono"
                                                    id="tableColumnTelefono1" rendered="false"
                                                    sort="telefono">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextTelefono1"
                                                    text="#{currentRow.value['telefono']}"
                                                    rendered="#{LogImpHogEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec5.labelTelefono1}"
                                                    id="labelTelefono1"
                                                    for="campoTelefono1"/>
                                                <webuijsf:textArea id="campoTelefono1"
                                                    binding="#{LogImpHogEec5.campoTelefono1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHogEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['telefono']}"
                                                    toolTip="BundleParametros.telefono.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec5.validatorTelefono1.validate}"/>
                                                <webuijsf:staticText id="campoTelefono1Texto1"
                                                    binding="#{LogImpHogEec5.campoTelefono1Texto1}"
                                                    text="#{currentRow.value['telefono']}"/>
                                                <webuijsf:message id="messageTelefono1"
                                                    for="campoTelefono1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHogEec5.tableColumnFecha1}"
                                                    headerText="fecha"
                                                    id="tableColumnFecha1" rendered="false"
                                                    sort="fecha">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextFecha1"
                                                    text="#{currentRow.value['fecha']}"
                                                    rendered="#{LogImpHogEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec5.labelFecha1}"
                                                    id="labelFecha1"
                                                    for="campoFecha1"/>
                                                <webuijsf:textArea id="campoFecha1"
                                                    binding="#{LogImpHogEec5.campoFecha1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHogEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['fecha']}"
                                                    toolTip="BundleParametros.fecha.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec5.validatorFecha1.validate}"/>
                                                <webuijsf:staticText id="campoFecha1Texto1"
                                                    binding="#{LogImpHogEec5.campoFecha1Texto1}"
                                                    text="#{currentRow.value['fecha']}"/>
                                                <webuijsf:message id="messageFecha1"
                                                    for="campoFecha1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHogEec5.tableColumnDia1}"
                                                    headerText="dia"
                                                    id="tableColumnDia1" rendered="false"
                                                    sort="dia">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextDia1"
                                                    text="#{currentRow.value['dia']}"
                                                    rendered="#{LogImpHogEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec5.labelDia1}"
                                                    id="labelDia1"
                                                    for="campoDia1"/>
                                                <webuijsf:textArea id="campoDia1"
                                                    binding="#{LogImpHogEec5.campoDia1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHogEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['dia']}"
                                                    toolTip="BundleParametros.dia.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec5.validatorDia1.validate}"/>
                                                <webuijsf:staticText id="campoDia1Texto1"
                                                    binding="#{LogImpHogEec5.campoDia1Texto1}"
                                                    text="#{currentRow.value['dia']}"/>
                                                <webuijsf:message id="messageDia1"
                                                    for="campoDia1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHogEec5.tableColumnMes1}"
                                                    headerText="mes"
                                                    id="tableColumnMes1" rendered="false"
                                                    sort="mes">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextMes1"
                                                    text="#{currentRow.value['mes']}"
                                                    rendered="#{LogImpHogEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec5.labelMes1}"
                                                    id="labelMes1"
                                                    for="campoMes1"/>
                                                <webuijsf:textArea id="campoMes1"
                                                    binding="#{LogImpHogEec5.campoMes1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHogEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['mes']}"
                                                    toolTip="BundleParametros.mes.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec5.validatorMes1.validate}"/>
                                                <webuijsf:staticText id="campoMes1Texto1"
                                                    binding="#{LogImpHogEec5.campoMes1Texto1}"
                                                    text="#{currentRow.value['mes']}"/>
                                                <webuijsf:message id="messageMes1"
                                                    for="campoMes1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHogEec5.tableColumnAno1}"
                                                    headerText="a&#241;o"
                                                    id="tableColumnAno1" rendered="false"
                                                    sort="ano">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextAno1"
                                                    text="#{currentRow.value['ano']}"
                                                    rendered="#{LogImpHogEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec5.labelAno1}"
                                                    id="labelAno1"
                                                    for="campoAno1"/>
                                                <webuijsf:textArea id="campoAno1"
                                                    binding="#{LogImpHogEec5.campoAno1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHogEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['ano']}"
                                                    toolTip="BundleParametros.ano.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec5.validatorAno1.validate}"/>
                                                <webuijsf:staticText id="campoAno1Texto1"
                                                    binding="#{LogImpHogEec5.campoAno1Texto1}"
                                                    text="#{currentRow.value['ano']}"/>
                                                <webuijsf:message id="messageAno1"
                                                    for="campoAno1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHogEec5.tableColumnV10t1}"
                                                    headerText="v10t"
                                                    id="tableColumnV10t1" rendered="false"
                                                    sort="v10t">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextV10t1"
                                                    text="#{currentRow.value['v10t']}"
                                                    rendered="#{LogImpHogEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec5.labelV10t1}"
                                                    id="labelV10t1"
                                                    for="campoV10t1"/>
                                                <webuijsf:textArea id="campoV10t1"
                                                    binding="#{LogImpHogEec5.campoV10t1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHogEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['v10t']}"
                                                    toolTip="BundleParametros.v10t.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec5.validatorV10t1.validate}"/>
                                                <webuijsf:staticText id="campoV10t1Texto1"
                                                    binding="#{LogImpHogEec5.campoV10t1Texto1}"
                                                    text="#{currentRow.value['v10t']}"/>
                                                <webuijsf:message id="messageV10t1"
                                                    for="campoV10t1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHogEec5.tableColumnV111}"
                                                    headerText="v11"
                                                    id="tableColumnV111" rendered="false"
                                                    sort="v11">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextV111"
                                                    text="#{currentRow.value['v11']}"
                                                    rendered="#{LogImpHogEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec5.labelV111}"
                                                    id="labelV111"
                                                    for="campoV111"/>
                                                <webuijsf:textArea id="campoV111"
                                                    binding="#{LogImpHogEec5.campoV111}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHogEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['v11']}"
                                                    toolTip="BundleParametros.v11.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec5.validatorV111.validate}"/>
                                                <webuijsf:staticText id="campoV111Texto1"
                                                    binding="#{LogImpHogEec5.campoV111Texto1}"
                                                    text="#{currentRow.value['v11']}"/>
                                                <webuijsf:message id="messageV111"
                                                    for="campoV111"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHogEec5.tableColumnV121}"
                                                    headerText="v12"
                                                    id="tableColumnV121" rendered="false"
                                                    sort="v12">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextV121"
                                                    text="#{currentRow.value['v12']}"
                                                    rendered="#{LogImpHogEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec5.labelV121}"
                                                    id="labelV121"
                                                    for="campoV121"/>
                                                <webuijsf:textArea id="campoV121"
                                                    binding="#{LogImpHogEec5.campoV121}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHogEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['v12']}"
                                                    toolTip="BundleParametros.v12.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec5.validatorV121.validate}"/>
                                                <webuijsf:staticText id="campoV121Texto1"
                                                    binding="#{LogImpHogEec5.campoV121Texto1}"
                                                    text="#{currentRow.value['v12']}"/>
                                                <webuijsf:message id="messageV121"
                                                    for="campoV121"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHogEec5.tableColumnV131}"
                                                    headerText="v13"
                                                    id="tableColumnV131" rendered="false"
                                                    sort="v13">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextV131"
                                                    text="#{currentRow.value['v13']}"
                                                    rendered="#{LogImpHogEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec5.labelV131}"
                                                    id="labelV131"
                                                    for="campoV131"/>
                                                <webuijsf:textArea id="campoV131"
                                                    binding="#{LogImpHogEec5.campoV131}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHogEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['v13']}"
                                                    toolTip="BundleParametros.v13.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec5.validatorV131.validate}"/>
                                                <webuijsf:staticText id="campoV131Texto1"
                                                    binding="#{LogImpHogEec5.campoV131Texto1}"
                                                    text="#{currentRow.value['v13']}"/>
                                                <webuijsf:message id="messageV131"
                                                    for="campoV131"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHogEec5.tableColumnV141}"
                                                    headerText="v14"
                                                    id="tableColumnV141" rendered="false"
                                                    sort="v14">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextV141"
                                                    text="#{currentRow.value['v14']}"
                                                    rendered="#{LogImpHogEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec5.labelV141}"
                                                    id="labelV141"
                                                    for="campoV141"/>
                                                <webuijsf:textArea id="campoV141"
                                                    binding="#{LogImpHogEec5.campoV141}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHogEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['v14']}"
                                                    toolTip="BundleParametros.v14.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec5.validatorV141.validate}"/>
                                                <webuijsf:staticText id="campoV141Texto1"
                                                    binding="#{LogImpHogEec5.campoV141Texto1}"
                                                    text="#{currentRow.value['v14']}"/>
                                                <webuijsf:message id="messageV141"
                                                    for="campoV141"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHogEec5.tableColumnV151}"
                                                    headerText="v15"
                                                    id="tableColumnV151" rendered="false"
                                                    sort="v15">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextV151"
                                                    text="#{currentRow.value['v15']}"
                                                    rendered="#{LogImpHogEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec5.labelV151}"
                                                    id="labelV151"
                                                    for="campoV151"/>
                                                <webuijsf:textArea id="campoV151"
                                                    binding="#{LogImpHogEec5.campoV151}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHogEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['v15']}"
                                                    toolTip="BundleParametros.v15.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec5.validatorV151.validate}"/>
                                                <webuijsf:staticText id="campoV151Texto1"
                                                    binding="#{LogImpHogEec5.campoV151Texto1}"
                                                    text="#{currentRow.value['v15']}"/>
                                                <webuijsf:message id="messageV151"
                                                    for="campoV151"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHogEec5.tableColumnV161}"
                                                    headerText="v16"
                                                    id="tableColumnV161" rendered="false"
                                                    sort="v16">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextV161"
                                                    text="#{currentRow.value['v16']}"
                                                    rendered="#{LogImpHogEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec5.labelV161}"
                                                    id="labelV161"
                                                    for="campoV161"/>
                                                <webuijsf:textArea id="campoV161"
                                                    binding="#{LogImpHogEec5.campoV161}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHogEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['v16']}"
                                                    toolTip="BundleParametros.v16.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec5.validatorV161.validate}"/>
                                                <webuijsf:staticText id="campoV161Texto1"
                                                    binding="#{LogImpHogEec5.campoV161Texto1}"
                                                    text="#{currentRow.value['v16']}"/>
                                                <webuijsf:message id="messageV161"
                                                    for="campoV161"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHogEec5.tableColumnV16Otr1}"
                                                    headerText="v16 otr"
                                                    id="tableColumnV16Otr1" rendered="false"
                                                    sort="v16_otr">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextV16Otr1"
                                                    text="#{currentRow.value['v16_otr']}"
                                                    rendered="#{LogImpHogEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec5.labelV16Otr1}"
                                                    id="labelV16Otr1"
                                                    for="campoV16Otr1"/>
                                                <webuijsf:textArea id="campoV16Otr1"
                                                    binding="#{LogImpHogEec5.campoV16Otr1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHogEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['v16_otr']}"
                                                    toolTip="BundleParametros.v16_otr.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec5.validatorV16Otr1.validate}"/>
                                                <webuijsf:staticText id="campoV16Otr1Texto1"
                                                    binding="#{LogImpHogEec5.campoV16Otr1Texto1}"
                                                    text="#{currentRow.value['v16_otr']}"/>
                                                <webuijsf:message id="messageV16Otr1"
                                                    for="campoV16Otr1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHogEec5.tableColumnV17a1}"
                                                    headerText="v17a"
                                                    id="tableColumnV17a1" rendered="false"
                                                    sort="v17a">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextV17a1"
                                                    text="#{currentRow.value['v17a']}"
                                                    rendered="#{LogImpHogEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec5.labelV17a1}"
                                                    id="labelV17a1"
                                                    for="campoV17a1"/>
                                                <webuijsf:textArea id="campoV17a1"
                                                    binding="#{LogImpHogEec5.campoV17a1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHogEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['v17a']}"
                                                    toolTip="BundleParametros.v17a.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec5.validatorV17a1.validate}"/>
                                                <webuijsf:staticText id="campoV17a1Texto1"
                                                    binding="#{LogImpHogEec5.campoV17a1Texto1}"
                                                    text="#{currentRow.value['v17a']}"/>
                                                <webuijsf:message id="messageV17a1"
                                                    for="campoV17a1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHogEec5.tableColumnV17b1}"
                                                    headerText="v17b"
                                                    id="tableColumnV17b1" rendered="false"
                                                    sort="v17b">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextV17b1"
                                                    text="#{currentRow.value['v17b']}"
                                                    rendered="#{LogImpHogEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec5.labelV17b1}"
                                                    id="labelV17b1"
                                                    for="campoV17b1"/>
                                                <webuijsf:textArea id="campoV17b1"
                                                    binding="#{LogImpHogEec5.campoV17b1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHogEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['v17b']}"
                                                    toolTip="BundleParametros.v17b.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec5.validatorV17b1.validate}"/>
                                                <webuijsf:staticText id="campoV17b1Texto1"
                                                    binding="#{LogImpHogEec5.campoV17b1Texto1}"
                                                    text="#{currentRow.value['v17b']}"/>
                                                <webuijsf:message id="messageV17b1"
                                                    for="campoV17b1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHogEec5.tableColumnV181}"
                                                    headerText="v18"
                                                    id="tableColumnV181" rendered="false"
                                                    sort="v18">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextV181"
                                                    text="#{currentRow.value['v18']}"
                                                    rendered="#{LogImpHogEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec5.labelV181}"
                                                    id="labelV181"
                                                    for="campoV181"/>
                                                <webuijsf:textArea id="campoV181"
                                                    binding="#{LogImpHogEec5.campoV181}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHogEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['v18']}"
                                                    toolTip="BundleParametros.v18.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec5.validatorV181.validate}"/>
                                                <webuijsf:staticText id="campoV181Texto1"
                                                    binding="#{LogImpHogEec5.campoV181Texto1}"
                                                    text="#{currentRow.value['v18']}"/>
                                                <webuijsf:message id="messageV181"
                                                    for="campoV181"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHogEec5.tableColumnV191}"
                                                    headerText="v19"
                                                    id="tableColumnV191" rendered="false"
                                                    sort="v19">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextV191"
                                                    text="#{currentRow.value['v19']}"
                                                    rendered="#{LogImpHogEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec5.labelV191}"
                                                    id="labelV191"
                                                    for="campoV191"/>
                                                <webuijsf:textArea id="campoV191"
                                                    binding="#{LogImpHogEec5.campoV191}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHogEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['v19']}"
                                                    toolTip="BundleParametros.v19.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec5.validatorV191.validate}"/>
                                                <webuijsf:staticText id="campoV191Texto1"
                                                    binding="#{LogImpHogEec5.campoV191Texto1}"
                                                    text="#{currentRow.value['v19']}"/>
                                                <webuijsf:message id="messageV191"
                                                    for="campoV191"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHogEec5.tableColumnV201}"
                                                    headerText="v20"
                                                    id="tableColumnV201" rendered="false"
                                                    sort="v20">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextV201"
                                                    text="#{currentRow.value['v20']}"
                                                    rendered="#{LogImpHogEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec5.labelV201}"
                                                    id="labelV201"
                                                    for="campoV201"/>
                                                <webuijsf:textArea id="campoV201"
                                                    binding="#{LogImpHogEec5.campoV201}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHogEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['v20']}"
                                                    toolTip="BundleParametros.v20.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec5.validatorV201.validate}"/>
                                                <webuijsf:staticText id="campoV201Texto1"
                                                    binding="#{LogImpHogEec5.campoV201Texto1}"
                                                    text="#{currentRow.value['v20']}"/>
                                                <webuijsf:message id="messageV201"
                                                    for="campoV201"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHogEec5.tableColumnV211}"
                                                    headerText="v21"
                                                    id="tableColumnV211" rendered="false"
                                                    sort="v21">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextV211"
                                                    text="#{currentRow.value['v21']}"
                                                    rendered="#{LogImpHogEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec5.labelV211}"
                                                    id="labelV211"
                                                    for="campoV211"/>
                                                <webuijsf:textArea id="campoV211"
                                                    binding="#{LogImpHogEec5.campoV211}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHogEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['v21']}"
                                                    toolTip="BundleParametros.v21.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec5.validatorV211.validate}"/>
                                                <webuijsf:staticText id="campoV211Texto1"
                                                    binding="#{LogImpHogEec5.campoV211Texto1}"
                                                    text="#{currentRow.value['v21']}"/>
                                                <webuijsf:message id="messageV211"
                                                    for="campoV211"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHogEec5.tableColumnV221}"
                                                    headerText="v22"
                                                    id="tableColumnV221" rendered="false"
                                                    sort="v22">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextV221"
                                                    text="#{currentRow.value['v22']}"
                                                    rendered="#{LogImpHogEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec5.labelV221}"
                                                    id="labelV221"
                                                    for="campoV221"/>
                                                <webuijsf:textArea id="campoV221"
                                                    binding="#{LogImpHogEec5.campoV221}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHogEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['v22']}"
                                                    toolTip="BundleParametros.v22.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec5.validatorV221.validate}"/>
                                                <webuijsf:staticText id="campoV221Texto1"
                                                    binding="#{LogImpHogEec5.campoV221Texto1}"
                                                    text="#{currentRow.value['v22']}"/>
                                                <webuijsf:message id="messageV221"
                                                    for="campoV221"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHogEec5.tableColumnV231}"
                                                    headerText="v23"
                                                    id="tableColumnV231" rendered="false"
                                                    sort="v23">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextV231"
                                                    text="#{currentRow.value['v23']}"
                                                    rendered="#{LogImpHogEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec5.labelV231}"
                                                    id="labelV231"
                                                    for="campoV231"/>
                                                <webuijsf:textArea id="campoV231"
                                                    binding="#{LogImpHogEec5.campoV231}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHogEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['v23']}"
                                                    toolTip="BundleParametros.v23.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec5.validatorV231.validate}"/>
                                                <webuijsf:staticText id="campoV231Texto1"
                                                    binding="#{LogImpHogEec5.campoV231Texto1}"
                                                    text="#{currentRow.value['v23']}"/>
                                                <webuijsf:message id="messageV231"
                                                    for="campoV231"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHogEec5.tableColumnV241}"
                                                    headerText="v24"
                                                    id="tableColumnV241" rendered="false"
                                                    sort="v24">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextV241"
                                                    text="#{currentRow.value['v24']}"
                                                    rendered="#{LogImpHogEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec5.labelV241}"
                                                    id="labelV241"
                                                    for="campoV241"/>
                                                <webuijsf:textArea id="campoV241"
                                                    binding="#{LogImpHogEec5.campoV241}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHogEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['v24']}"
                                                    toolTip="BundleParametros.v24.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec5.validatorV241.validate}"/>
                                                <webuijsf:staticText id="campoV241Texto1"
                                                    binding="#{LogImpHogEec5.campoV241Texto1}"
                                                    text="#{currentRow.value['v24']}"/>
                                                <webuijsf:message id="messageV241"
                                                    for="campoV241"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHogEec5.tableColumnV251}"
                                                    headerText="v25"
                                                    id="tableColumnV251" rendered="false"
                                                    sort="v25">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextV251"
                                                    text="#{currentRow.value['v25']}"
                                                    rendered="#{LogImpHogEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec5.labelV251}"
                                                    id="labelV251"
                                                    for="campoV251"/>
                                                <webuijsf:textArea id="campoV251"
                                                    binding="#{LogImpHogEec5.campoV251}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHogEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['v25']}"
                                                    toolTip="BundleParametros.v25.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec5.validatorV251.validate}"/>
                                                <webuijsf:staticText id="campoV251Texto1"
                                                    binding="#{LogImpHogEec5.campoV251Texto1}"
                                                    text="#{currentRow.value['v25']}"/>
                                                <webuijsf:message id="messageV251"
                                                    for="campoV251"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHogEec5.tableColumnV261}"
                                                    headerText="v26"
                                                    id="tableColumnV261" rendered="false"
                                                    sort="v26">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextV261"
                                                    text="#{currentRow.value['v26']}"
                                                    rendered="#{LogImpHogEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec5.labelV261}"
                                                    id="labelV261"
                                                    for="campoV261"/>
                                                <webuijsf:textArea id="campoV261"
                                                    binding="#{LogImpHogEec5.campoV261}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHogEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['v26']}"
                                                    toolTip="BundleParametros.v26.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec5.validatorV261.validate}"/>
                                                <webuijsf:staticText id="campoV261Texto1"
                                                    binding="#{LogImpHogEec5.campoV261Texto1}"
                                                    text="#{currentRow.value['v26']}"/>
                                                <webuijsf:message id="messageV261"
                                                    for="campoV261"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHogEec5.tableColumnV26espCelular1}"
                                                    headerText="v26esp celular"
                                                    id="tableColumnV26espCelular1" rendered="false"
                                                    sort="v26esp_celular">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextV26espCelular1"
                                                    text="#{currentRow.value['v26esp_celular']}"
                                                    rendered="#{LogImpHogEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec5.labelV26espCelular1}"
                                                    id="labelV26espCelular1"
                                                    for="campoV26espCelular1"/>
                                                <webuijsf:textArea id="campoV26espCelular1"
                                                    binding="#{LogImpHogEec5.campoV26espCelular1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHogEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['v26esp_celular']}"
                                                    toolTip="BundleParametros.v26esp_celular.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec5.validatorV26espCelular1.validate}"/>
                                                <webuijsf:staticText id="campoV26espCelular1Texto1"
                                                    binding="#{LogImpHogEec5.campoV26espCelular1Texto1}"
                                                    text="#{currentRow.value['v26esp_celular']}"/>
                                                <webuijsf:message id="messageV26espCelular1"
                                                    for="campoV26espCelular1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHogEec5.tableColumnV271}"
                                                    headerText="v27"
                                                    id="tableColumnV271" rendered="false"
                                                    sort="v27">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextV271"
                                                    text="#{currentRow.value['v27']}"
                                                    rendered="#{LogImpHogEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec5.labelV271}"
                                                    id="labelV271"
                                                    for="campoV271"/>
                                                <webuijsf:textArea id="campoV271"
                                                    binding="#{LogImpHogEec5.campoV271}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHogEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['v27']}"
                                                    toolTip="BundleParametros.v27.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec5.validatorV271.validate}"/>
                                                <webuijsf:staticText id="campoV271Texto1"
                                                    binding="#{LogImpHogEec5.campoV271Texto1}"
                                                    text="#{currentRow.value['v27']}"/>
                                                <webuijsf:message id="messageV271"
                                                    for="campoV271"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHogEec5.tableColumnV27espLinea1}"
                                                    headerText="v27esp linea"
                                                    id="tableColumnV27espLinea1" rendered="false"
                                                    sort="v27esp_linea">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextV27espLinea1"
                                                    text="#{currentRow.value['v27esp_linea']}"
                                                    rendered="#{LogImpHogEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec5.labelV27espLinea1}"
                                                    id="labelV27espLinea1"
                                                    for="campoV27espLinea1"/>
                                                <webuijsf:textArea id="campoV27espLinea1"
                                                    binding="#{LogImpHogEec5.campoV27espLinea1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHogEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['v27esp_linea']}"
                                                    toolTip="BundleParametros.v27esp_linea.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec5.validatorV27espLinea1.validate}"/>
                                                <webuijsf:staticText id="campoV27espLinea1Texto1"
                                                    binding="#{LogImpHogEec5.campoV27espLinea1Texto1}"
                                                    text="#{currentRow.value['v27esp_linea']}"/>
                                                <webuijsf:message id="messageV27espLinea1"
                                                    for="campoV27espLinea1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHogEec5.tableColumnV2811}"
                                                    headerText="v28 1"
                                                    id="tableColumnV2811" rendered="false"
                                                    sort="v28_1">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextV2811"
                                                    text="#{currentRow.value['v28_1']}"
                                                    rendered="#{LogImpHogEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec5.labelV2811}"
                                                    id="labelV2811"
                                                    for="campoV2811"/>
                                                <webuijsf:textArea id="campoV2811"
                                                    binding="#{LogImpHogEec5.campoV2811}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHogEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['v28_1']}"
                                                    toolTip="BundleParametros.v28_1.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec5.validatorV2811.validate}"/>
                                                <webuijsf:staticText id="campoV2811Texto1"
                                                    binding="#{LogImpHogEec5.campoV2811Texto1}"
                                                    text="#{currentRow.value['v28_1']}"/>
                                                <webuijsf:message id="messageV2811"
                                                    for="campoV2811"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHogEec5.tableColumnV2821}"
                                                    headerText="v28 2"
                                                    id="tableColumnV2821" rendered="false"
                                                    sort="v28_2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextV2821"
                                                    text="#{currentRow.value['v28_2']}"
                                                    rendered="#{LogImpHogEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec5.labelV2821}"
                                                    id="labelV2821"
                                                    for="campoV2821"/>
                                                <webuijsf:textArea id="campoV2821"
                                                    binding="#{LogImpHogEec5.campoV2821}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHogEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['v28_2']}"
                                                    toolTip="BundleParametros.v28_2.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec5.validatorV2821.validate}"/>
                                                <webuijsf:staticText id="campoV2821Texto1"
                                                    binding="#{LogImpHogEec5.campoV2821Texto1}"
                                                    text="#{currentRow.value['v28_2']}"/>
                                                <webuijsf:message id="messageV2821"
                                                    for="campoV2821"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHogEec5.tableColumnV2831}"
                                                    headerText="v28 3"
                                                    id="tableColumnV2831" rendered="false"
                                                    sort="v28_3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextV2831"
                                                    text="#{currentRow.value['v28_3']}"
                                                    rendered="#{LogImpHogEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec5.labelV2831}"
                                                    id="labelV2831"
                                                    for="campoV2831"/>
                                                <webuijsf:textArea id="campoV2831"
                                                    binding="#{LogImpHogEec5.campoV2831}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHogEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['v28_3']}"
                                                    toolTip="BundleParametros.v28_3.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec5.validatorV2831.validate}"/>
                                                <webuijsf:staticText id="campoV2831Texto1"
                                                    binding="#{LogImpHogEec5.campoV2831Texto1}"
                                                    text="#{currentRow.value['v28_3']}"/>
                                                <webuijsf:message id="messageV2831"
                                                    for="campoV2831"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHogEec5.tableColumnV2841}"
                                                    headerText="v28 4"
                                                    id="tableColumnV2841" rendered="false"
                                                    sort="v28_4">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextV2841"
                                                    text="#{currentRow.value['v28_4']}"
                                                    rendered="#{LogImpHogEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec5.labelV2841}"
                                                    id="labelV2841"
                                                    for="campoV2841"/>
                                                <webuijsf:textArea id="campoV2841"
                                                    binding="#{LogImpHogEec5.campoV2841}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHogEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['v28_4']}"
                                                    toolTip="BundleParametros.v28_4.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec5.validatorV2841.validate}"/>
                                                <webuijsf:staticText id="campoV2841Texto1"
                                                    binding="#{LogImpHogEec5.campoV2841Texto1}"
                                                    text="#{currentRow.value['v28_4']}"/>
                                                <webuijsf:message id="messageV2841"
                                                    for="campoV2841"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHogEec5.tableColumnV2851}"
                                                    headerText="v28 5"
                                                    id="tableColumnV2851" rendered="false"
                                                    sort="v28_5">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextV2851"
                                                    text="#{currentRow.value['v28_5']}"
                                                    rendered="#{LogImpHogEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec5.labelV2851}"
                                                    id="labelV2851"
                                                    for="campoV2851"/>
                                                <webuijsf:textArea id="campoV2851"
                                                    binding="#{LogImpHogEec5.campoV2851}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHogEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['v28_5']}"
                                                    toolTip="BundleParametros.v28_5.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec5.validatorV2851.validate}"/>
                                                <webuijsf:staticText id="campoV2851Texto1"
                                                    binding="#{LogImpHogEec5.campoV2851Texto1}"
                                                    text="#{currentRow.value['v28_5']}"/>
                                                <webuijsf:message id="messageV2851"
                                                    for="campoV2851"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHogEec5.tableColumnV2861}"
                                                    headerText="v28 6"
                                                    id="tableColumnV2861" rendered="false"
                                                    sort="v28_6">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextV2861"
                                                    text="#{currentRow.value['v28_6']}"
                                                    rendered="#{LogImpHogEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec5.labelV2861}"
                                                    id="labelV2861"
                                                    for="campoV2861"/>
                                                <webuijsf:textArea id="campoV2861"
                                                    binding="#{LogImpHogEec5.campoV2861}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHogEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['v28_6']}"
                                                    toolTip="BundleParametros.v28_6.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec5.validatorV2861.validate}"/>
                                                <webuijsf:staticText id="campoV2861Texto1"
                                                    binding="#{LogImpHogEec5.campoV2861Texto1}"
                                                    text="#{currentRow.value['v28_6']}"/>
                                                <webuijsf:message id="messageV2861"
                                                    for="campoV2861"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHogEec5.tableColumnV2871}"
                                                    headerText="v28 7"
                                                    id="tableColumnV2871" rendered="false"
                                                    sort="v28_7">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextV2871"
                                                    text="#{currentRow.value['v28_7']}"
                                                    rendered="#{LogImpHogEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec5.labelV2871}"
                                                    id="labelV2871"
                                                    for="campoV2871"/>
                                                <webuijsf:textArea id="campoV2871"
                                                    binding="#{LogImpHogEec5.campoV2871}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHogEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['v28_7']}"
                                                    toolTip="BundleParametros.v28_7.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec5.validatorV2871.validate}"/>
                                                <webuijsf:staticText id="campoV2871Texto1"
                                                    binding="#{LogImpHogEec5.campoV2871Texto1}"
                                                    text="#{currentRow.value['v28_7']}"/>
                                                <webuijsf:message id="messageV2871"
                                                    for="campoV2871"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHogEec5.tableColumnV2881}"
                                                    headerText="v28 8"
                                                    id="tableColumnV2881" rendered="false"
                                                    sort="v28_8">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextV2881"
                                                    text="#{currentRow.value['v28_8']}"
                                                    rendered="#{LogImpHogEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec5.labelV2881}"
                                                    id="labelV2881"
                                                    for="campoV2881"/>
                                                <webuijsf:textArea id="campoV2881"
                                                    binding="#{LogImpHogEec5.campoV2881}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHogEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['v28_8']}"
                                                    toolTip="BundleParametros.v28_8.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec5.validatorV2881.validate}"/>
                                                <webuijsf:staticText id="campoV2881Texto1"
                                                    binding="#{LogImpHogEec5.campoV2881Texto1}"
                                                    text="#{currentRow.value['v28_8']}"/>
                                                <webuijsf:message id="messageV2881"
                                                    for="campoV2881"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHogEec5.tableColumnV29nombreJefe1}"
                                                    headerText="v29nombre jefe"
                                                    id="tableColumnV29nombreJefe1" rendered="false"
                                                    sort="v29nombre_jefe">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextV29nombreJefe1"
                                                    text="#{currentRow.value['v29nombre_jefe']}"
                                                    rendered="#{LogImpHogEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec5.labelV29nombreJefe1}"
                                                    id="labelV29nombreJefe1"
                                                    for="campoV29nombreJefe1"/>
                                                <webuijsf:textArea id="campoV29nombreJefe1"
                                                    binding="#{LogImpHogEec5.campoV29nombreJefe1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHogEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['v29nombre_jefe']}"
                                                    toolTip="BundleParametros.v29nombre_jefe.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec5.validatorV29nombreJefe1.validate}"/>
                                                <webuijsf:staticText id="campoV29nombreJefe1Texto1"
                                                    binding="#{LogImpHogEec5.campoV29nombreJefe1Texto1}"
                                                    text="#{currentRow.value['v29nombre_jefe']}"/>
                                                <webuijsf:message id="messageV29nombreJefe1"
                                                    for="campoV29nombreJefe1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHogEec5.tableColumnCedulajefe1}"
                                                    headerText="cedulajefe"
                                                    id="tableColumnCedulajefe1" rendered="false"
                                                    sort="cedulajefe">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextCedulajefe1"
                                                    text="#{currentRow.value['cedulajefe']}"
                                                    rendered="#{LogImpHogEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec5.labelCedulajefe1}"
                                                    id="labelCedulajefe1"
                                                    for="campoCedulajefe1"/>
                                                <webuijsf:textArea id="campoCedulajefe1"
                                                    binding="#{LogImpHogEec5.campoCedulajefe1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHogEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['cedulajefe']}"
                                                    toolTip="BundleParametros.cedulajefe.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec5.validatorCedulajefe1.validate}"/>
                                                <webuijsf:staticText id="campoCedulajefe1Texto1"
                                                    binding="#{LogImpHogEec5.campoCedulajefe1Texto1}"
                                                    text="#{currentRow.value['cedulajefe']}"/>
                                                <webuijsf:message id="messageCedulajefe1"
                                                    for="campoCedulajefe1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHogEec5.tableColumnVar000011}"
                                                    headerText="var00001"
                                                    id="tableColumnVar000011" rendered="false"
                                                    sort="var00001">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextVar000011"
                                                    text="#{currentRow.value['var00001']}"
                                                    rendered="#{LogImpHogEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec5.labelVar000011}"
                                                    id="labelVar000011"
                                                    for="campoVar000011"/>
                                                <webuijsf:textArea id="campoVar000011"
                                                    binding="#{LogImpHogEec5.campoVar000011}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHogEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['var00001']}"
                                                    toolTip="BundleParametros.var00001.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec5.validatorVar000011.validate}"/>
                                                <webuijsf:staticText id="campoVar000011Texto1"
                                                    binding="#{LogImpHogEec5.campoVar000011Texto1}"
                                                    text="#{currentRow.value['var00001']}"/>
                                                <webuijsf:message id="messageVar000011"
                                                    for="campoVar000011"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHogEec5.tableColumnEsImportado1}"
                                                    headerText="importado"
                                                    id="tableColumnEsImportado1"
                                                    sort="es_importado">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsImportado1"
                                                    text="#{currentRow.value['es_importado']}"
                                                    rendered="#{LogImpHogEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec5.labelEsImportado1}"
                                                    id="labelEsImportado1"
                                                    for="listaEsImportado1"/>
                                                <webuijsf:dropDown id="listaEsImportado1"
                                                    binding="#{LogImpHogEec5.listaEsImportado1}"
                                                    converter="#{LogImpHogEec5.converterEsImportado1}"
                                                    disabled="#{LogImpHogEec5.gestor.filaNoProcesada}" required="true"
                                                    items="#{LogImpHogEec5.asistente.opcionesListaEsImportado1}"
                                                    selected="#{currentRow.value['es_importado']}"
                                                    toolTip="BundleParametros.es_importado.log_imp_hog_eec"/>
                                                <webuijsf:staticText id="listaEsImportado1Texto1"
                                                    binding="#{LogImpHogEec5.listaEsImportado1Texto1}"/>
                                                <webuijsf:message id="messageEsImportado1"
                                                    for="listaEsImportado1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHogEec5.tableColumnObservacion1}"
                                                    headerText="observaci&#243;n"
                                                    id="tableColumnObservacion1"
                                                    sort="observacion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextObservacion1"
                                                    text="#{currentRow.value['observacion']}"
                                                    rendered="#{LogImpHogEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec5.labelObservacion1}"
                                                    id="labelObservacion1"
                                                    for="campoObservacion1"/>
                                                <webuijsf:textArea id="campoObservacion1"
                                                    binding="#{LogImpHogEec5.campoObservacion1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHogEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['observacion']}"
                                                    toolTip="BundleParametros.observacion.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec5.validatorObservacion1.validate}"/>
                                                <webuijsf:staticText id="campoObservacion1Texto1"
                                                    binding="#{LogImpHogEec5.campoObservacion1Texto1}"
                                                    text="#{currentRow.value['observacion']}"/>
                                                <webuijsf:message id="messageObservacion1"
                                                    for="campoObservacion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHogEec5.tableColumnFechaHoraTransaccion1}"
                                                    headerText="fecha hora transacci&#243;n"
                                                    id="tableColumnFechaHoraTransaccion1"
                                                    sort="fecha_hora_transaccion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextFechaHoraTransaccion1"
                                                    text="#{currentRow.value['fecha_hora_transaccion']}"
                                                    rendered="#{LogImpHogEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec5.labelFechaHoraTransaccion1}"
                                                    id="labelFechaHoraTransaccion1"
                                                    for="campoFechaHoraTransaccion1"/>
                                                <webuijsf:textField id="campoFechaHoraTransaccion1"
                                                    binding="#{LogImpHogEec5.campoFechaHoraTransaccion1}"
                                                    converter="#{LogImpHogEec5.converterFechaHoraTransaccion1}"
                                                    readOnly="#{LogImpHogEec5.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['fecha_hora_transaccion']}"
                                                    toolTip="BundleParametros.fecha_hora_transaccion.log_imp_hog_eec"/>
                                                <webuijsf:staticText id="campoFechaHoraTransaccion1Texto1"
                                                    binding="#{LogImpHogEec5.campoFechaHoraTransaccion1Texto1}"
                                                    converter="#{LogImpHogEec5.converterFechaHoraTransaccion1}"
                                                    text="#{currentRow.value['fecha_hora_transaccion']}"/>
                                                <webuijsf:message id="messageFechaHoraTransaccion1"
                                                    for="campoFechaHoraTransaccion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHogEec5.tableColumnNombreArchivo1}"
                                                    headerText="nombre archivo"
                                                    id="tableColumnNombreArchivo1" rendered="false"
                                                    sort="nombre_archivo">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNombreArchivo1"
                                                    text="#{currentRow.value['nombre_archivo']}"
                                                    rendered="#{LogImpHogEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec5.labelNombreArchivo1}"
                                                    id="labelNombreArchivo1"
                                                    for="campoNombreArchivo1"/>
                                                <webuijsf:textArea id="campoNombreArchivo1"
                                                    binding="#{LogImpHogEec5.campoNombreArchivo1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHogEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['nombre_archivo']}"
                                                    toolTip="BundleParametros.nombre_archivo.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec5.validatorNombreArchivo1.validate}"/>
                                                <webuijsf:staticText id="campoNombreArchivo1Texto1"
                                                    binding="#{LogImpHogEec5.campoNombreArchivo1Texto1}"
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
                                                    rendered="#{LogImpHogEec5.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{LogImpHogEec5.campoNombreArchivo1Boton3}"
                                                    id="campoNombreArchivo1Boton3"
                                                    onClick="#{LogImpHogEec5.asistente.scriptCampoNombreArchivo1Boton3}"
                                                    rendered="#{LogImpHogEec5.asistente.campoNombreArchivo1Boton3Rendered}"
                                                    text="#{LogImpHogEec5.asistente.textCampoNombreArchivo1Boton3}"
                                                    toolTip="#{LogImpHogEec5.asistente.toolTipCampoNombreArchivo1Boton3}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHogEec5.tableColumnCodigoArchivo1}"
                                                    headerText="c&#243;digo archivo"
                                                    id="tableColumnCodigoArchivo1" rendered="false"
                                                    sort="codigo_archivo">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextCodigoArchivo1"
                                                    text="#{currentRow.value['codigo_archivo']}"
                                                    rendered="#{LogImpHogEec5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec5.labelCodigoArchivo1}"
                                                    id="labelCodigoArchivo1"
                                                    for="campoCodigoArchivo1"/>
                                                <webuijsf:textArea id="campoCodigoArchivo1"
                                                    binding="#{LogImpHogEec5.campoCodigoArchivo1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHogEec5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['codigo_archivo']}"
                                                    toolTip="BundleParametros.codigo_archivo.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec5.validatorCodigoArchivo1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoArchivo1Texto1"
                                                    binding="#{LogImpHogEec5.campoCodigoArchivo1Texto1}"
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
                                                        binding="#{LogImpHogEec5.etiquetaTextoFilasPorPagina1}" 
                                                        for="textoFilasPorPagina1"
                                                        id="etiquetaTextoFilasPorPagina1" 
                                                        text="#{LogImpHogEec5.gestor.i18n.textoEtiquetaTextoFilasPorPagina}"/>
                                                </h:panelGrid>
                                                <h:panelGrid 
                                                    columns="3" 
                                                    id="gridPanel107">
                                                    <webuijsf:textField 
                                                        binding="#{LogImpHogEec5.textoFilasPorPagina1}" 
                                                        columns="2"
                                                        converter="#{LogImpHogEec5.textoFilasPorPagina1Converter1}"
                                                        disabled="#{LogImpHogEec5.gestor.paginacionInhabilitada}" 
                                                        id="textoFilasPorPagina1" maxLength="2"
                                                        text="#{LogImpHogEec5.gestor.filasPorPagina}" 
                                                        validatorExpression="#{LogImpHogEec5.textoFilasPorPagina1Validator1.validate}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{LogImpHogEec5.botonRepaginar1_action}"
                                                        binding="#{LogImpHogEec5.botonRepaginar1}" 
                                                        id="botonRepaginar1"
                                                        imageURL="#{LogImpHogEec5.gestor.urlImagenRepaginar}" 
                                                        onClick="#{LogImpHogEec5.gestor.scriptRepaginar}"
                                                        text="#{LogImpHogEec5.gestor.i18n.textoBotonRepaginar}"
                                                        toolTip="#{LogImpHogEec5.gestor.i18n.toolTipBotonRepaginar}"/>
                                                    <webuijsf:message 
                                                        for="textoFilasPorPagina1" 
                                                        id="messageFilasPorPagina1"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="13"
                                                id="gridPanel108">
                                                <webuijsf:button
                                                    actionExpression="#{LogImpHogEec5.botonAgregar1_action}"
                                                    binding="#{LogImpHogEec5.botonAgregar1}"
                                                    disabled="#{LogImpHogEec5.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{LogImpHogEec5.gestor.scriptAgregar}"
                                                    rendered="#{LogImpHogEec5.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpHogEec5.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{LogImpHogEec5.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{LogImpHogEec5.listaFuncionEdicion1}"
                                                    converter="#{LogImpHogEec5.converterListaFuncionEdicion1}"
                                                    disabled="#{LogImpHogEec5.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{LogImpHogEec5.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{LogImpHogEec5.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{LogImpHogEec5.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{LogImpHogEec5.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpHogEec5.botonEditar1_action}"
                                                    binding="#{LogImpHogEec5.botonEditar1}"
                                                    disabled="#{LogImpHogEec5.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{LogImpHogEec5.gestor.scriptEditar}"
                                                    rendered="#{LogImpHogEec5.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpHogEec5.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{LogImpHogEec5.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpHogEec5.botonEliminar1_action}"
                                                    binding="#{LogImpHogEec5.botonEliminar1}"
                                                    disabled="#{LogImpHogEec5.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{LogImpHogEec5.gestor.scriptEliminar}"
                                                    rendered="#{LogImpHogEec5.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpHogEec5.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{LogImpHogEec5.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpHogEec5.botonAplicar1_action}"
                                                    binding="#{LogImpHogEec5.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{LogImpHogEec5.gestor.scriptAplicar}"
                                                    rendered="#{LogImpHogEec5.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpHogEec5.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{LogImpHogEec5.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpHogEec5.botonDeshacer1_action}"
                                                    binding="#{LogImpHogEec5.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{LogImpHogEec5.gestor.scriptDeshacer}"
                                                    rendered="#{LogImpHogEec5.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpHogEec5.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{LogImpHogEec5.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpHogEec5.botonConfirmar1_action}"
                                                    binding="#{LogImpHogEec5.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{LogImpHogEec5.gestor.scriptConfirmar}"
                                                    rendered="#{LogImpHogEec5.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpHogEec5.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{LogImpHogEec5.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpHogEec5.botonDescartar1_action}"
                                                    binding="#{LogImpHogEec5.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{LogImpHogEec5.gestor.scriptDescartar}"
                                                    rendered="#{LogImpHogEec5.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpHogEec5.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{LogImpHogEec5.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{LogImpHogEec5.listaFuncionAccion1}"
                                                    converter="#{LogImpHogEec5.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{LogImpHogEec5.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{LogImpHogEec5.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{LogImpHogEec5.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{LogImpHogEec5.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpHogEec5.botonProcesar1_action}"
                                                    binding="#{LogImpHogEec5.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{LogImpHogEec5.gestor.scriptProcesar}"
                                                    rendered="#{LogImpHogEec5.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpHogEec5.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{LogImpHogEec5.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpHogEec5.botonRefrescar1_action}"
                                                    binding="#{LogImpHogEec5.botonRefrescar1}"
                                                    disabled="#{LogImpHogEec5.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{LogImpHogEec5.gestor.scriptRefrescar}"
                                                    rendered="#{LogImpHogEec5.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpHogEec5.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{LogImpHogEec5.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpHogEec5.botonReconsultar1_action}"
                                                    binding="#{LogImpHogEec5.botonReconsultar1}"
                                                    disabled="#{LogImpHogEec5.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{LogImpHogEec5.gestor.scriptReconsultar}"
                                                    rendered="#{LogImpHogEec5.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpHogEec5.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{LogImpHogEec5.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpHogEec5.botonRetornar1_action}"
                                                    binding="#{LogImpHogEec5.botonRetornar1}"
                                                    disabled="#{LogImpHogEec5.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{LogImpHogEec5.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{LogImpHogEec5.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpHogEec5.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{LogImpHogEec5.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel109"
                                                rendered="#{LogImpHogEec5.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{LogImpHogEec5.imageHyperlink1_action}"
                                                    binding="#{LogImpHogEec5.imageHyperlink1}"
                                                    disabled="#{LogImpHogEec5.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{LogImpHogEec5.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{LogImpHogEec5.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{LogImpHogEec5.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.LogImpHogEec5_imageHyperlink1_toolTip}"/>
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
