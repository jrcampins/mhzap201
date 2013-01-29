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
                    focus="#{TipoArea1.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{TipoArea1.gestor.preserveFocus}"
                    preserveScroll="#{TipoArea1.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{TipoArea1.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | checkbox1 campoNumeroTipoArea1 campoCodigoTipoArea1 campoLimiteIndiceCalidadVida1 textoFilasPorPagina1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | textoFilasPorPagina1 | botonRepaginar1 , virtualForm3 | checkbox1 listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonEscogerFila1 botonDetallarFila1 botonProcesarFila1 botonRetornarFila1 botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{TipoArea1.breadcrumbs1}" 
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
                                                    rendered="#{TipoArea1.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{TipoArea1.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{TipoArea1.gestor.mensajeDisponible}"
                                                    text="#{TipoArea1.gestor.mensaje}"
                                                    url="#{TipoArea1.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:table
                                            binding="#{TipoArea1.table1}"
                                            clearSortButton="true" 
                                            deselectMultipleButton="true" 
                                            id="table1"
                                            paginateButton="false"
                                            paginationControls="true" 
                                            selectMultipleButton="true" 
                                            sortPanelToggleButton="true"
                                            width="960">
                                            <webuijsf:tableRowGroup 
                                                binding="#{TipoArea1.tableRowGroup1}" 
                                                id="tableRowGroup1" 
                                                rows="1"
                                                selected="#{TipoArea1.gestor.filaEscogida}" 
                                                sourceData="#{TipoArea1.tipoAreaDataProvider}" 
                                                sourceVar="currentRow">
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    id="tableRowGroup1SelectionColumn"
                                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);" 
                                                    selectId="checkbox1">
                                                    <webuijsf:checkbox 
                                                        binding="#{TipoArea1.checkbox1}" 
                                                        id="checkbox1"
                                                        onClick="#{TipoArea1.gestor.scriptElegir}" 
                                                        selected="#{TipoArea1.gestor.filaElegida}" 
                                                        toolTip="#{TipoArea1.gestor.i18n.toolTipCheckboxSeleccionMultiple}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    binding="#{TipoArea1.tableColumn1}" 
                                                    id="tableColumn1">
                                                    <webuijsf:button 
                                                        actionExpression="#{TipoArea1.botonEscogerFila1_action}"
                                                        binding="#{TipoArea1.botonEscogerFila1}"
                                                        disabled="#{TipoArea1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonEscogerFila1"
                                                        imageURL="#{TipoArea1.gestor.urlImagenEscoger}" 
                                                        onClick="#{TipoArea1.gestor.scriptEscoger}"
                                                        text="#{TipoArea1.gestor.i18n.textoBotonEscogerFila}"
                                                        toolTip="#{TipoArea1.gestor.i18n.toolTipBotonEscogerFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{TipoArea1.botonDetallarFila1_action}"
                                                        binding="#{TipoArea1.botonDetallarFila1}"
                                                        disabled="#{TipoArea1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonDetallarFila1"
                                                        imageURL="#{TipoArea1.gestor.urlImagenDetallar}" 
                                                        onClick="#{TipoArea1.scriptAbrirVentanaVerDetalle}"
                                                        rendered="#{TipoArea1.gestor.detalleDisponible}" 
                                                        text="#{TipoArea1.gestor.i18n.textoBotonDetallarFila}"
                                                        toolTip="#{TipoArea1.gestor.i18n.toolTipBotonDetallarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{TipoArea1.botonProcesarFila1_action}"
                                                        binding="#{TipoArea1.botonProcesarFila1}"
                                                        disabled="#{TipoArea1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonProcesarFila1"
                                                        imageURL="#{TipoArea1.gestor.urlImagenProcesar}" 
                                                        onClick="#{TipoArea1.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{TipoArea1.asistente.comandoDisponible}" 
                                                        text="#{TipoArea1.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{TipoArea1.gestor.i18n.toolTipBotonProcesarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{TipoArea1.botonRetornarFila1_action}"
                                                        binding="#{TipoArea1.botonRetornarFila1}" 
                                                        disabled="#{TipoArea1.gestor.funcionReturnInhabilitada}"
                                                        id="botonRetornarFila1"
                                                        imageURL="#{TipoArea1.gestor.urlImagenRetornar}"
                                                        onClick="#{TipoArea1.gestor.scriptRetornarRecursoActual}"
                                                        rendered="#{TipoArea1.gestor.funcionReturnVisible}" 
                                                        text="#{TipoArea1.gestor.i18n.textoBotonRetornarFila}"
                                                        toolTip="#{TipoArea1.gestor.i18n.toolTipBotonRetornarFila}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{TipoArea1.tableColumn2}"
                                                    id="tableColumn2"
                                                    rendered="#{TipoArea1.gestor.designing}">
                                                    <webuijsf:imageHyperlink
                                                        actionExpression="#{TipoArea1.hipervinculoAccionFila1_action}"
                                                        binding="#{TipoArea1.hipervinculoAccionFila1}"
                                                        disabled="#{TipoArea1.gestor.loteConCambios}"
                                                        id="hipervinculoAccionFila1"
                                                        imageURL="#{TipoArea1.gestor.urlImagenEjecutarVinculo}"
                                                        onClick="#{TipoArea1.scriptAbrirVentanaAccionFila1}"
                                                        text="Accion1"
                                                        toolTip="#{bundle.TipoArea1_hipervinculoAccionFila1_toolTip}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="right" 
                                                    binding="#{TipoArea1.tableColumn3}" 
                                                    headerText="#{TipoArea1.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{TipoArea1.gestor.i18n.toolTipEtiquetaIdentificacionFila}"
                                                    id="tableColumn3">
                                                    <webuijsf:imageHyperlink 
                                                        actionExpression="#{TipoArea1.hipervinculoDetallarFila1_action}"
                                                        binding="#{TipoArea1.hipervinculoDetallarFila1}" 
                                                        id="hipervinculoDetallarFila1"
                                                        imageURL="#{TipoArea1.gestor.urlImagenFilaProcesada}"
                                                        textPosition="left" 
                                                        text="#{TipoArea1.gestor.identificacionFila}" 
                                                        toolTip="#{TipoArea1.gestor.toolTipImagenFilaProcesada}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{TipoArea1.tableColumnNumeroTipoArea1}"
                                                    headerText="n&#250;mero"
                                                    id="tableColumnNumeroTipoArea1"
                                                    sort="numero_tipo_area">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroTipoArea1"
                                                    text="#{currentRow.value['numero_tipo_area']}"
                                                    rendered="#{TipoArea1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{TipoArea1.labelNumeroTipoArea1}"
                                                    id="labelNumeroTipoArea1"
                                                    for="campoNumeroTipoArea1"/>
                                                <webuijsf:textField id="campoNumeroTipoArea1"
                                                    binding="#{TipoArea1.campoNumeroTipoArea1}"
                                                    converter="#{TipoArea1.converterNumeroTipoArea1}"
                                                    readOnly="true"
                                                    text="#{currentRow.value['numero_tipo_area']}"
                                                    toolTip="BundleParametros.numero_tipo_area.tipo_area"
                                                    validatorExpression="#{TipoArea1.validatorNumeroTipoArea1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroTipoArea1Texto1"
                                                    binding="#{TipoArea1.campoNumeroTipoArea1Texto1}"
                                                    text="#{currentRow.value['numero_tipo_area']}"/>
                                                <webuijsf:message id="messageNumeroTipoArea1"
                                                    for="campoNumeroTipoArea1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{TipoArea1.tableColumnCodigoTipoArea1}"
                                                    headerText="c&#243;digo"
                                                    id="tableColumnCodigoTipoArea1"
                                                    sort="codigo_tipo_area">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextCodigoTipoArea1"
                                                    text="#{currentRow.value['codigo_tipo_area']}"
                                                    rendered="#{TipoArea1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{TipoArea1.labelCodigoTipoArea1}"
                                                    id="labelCodigoTipoArea1"
                                                    for="campoCodigoTipoArea1"/>
                                                <webuijsf:textField id="campoCodigoTipoArea1"
                                                    binding="#{TipoArea1.campoCodigoTipoArea1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="true"
                                                    text="#{currentRow.value['codigo_tipo_area']}"
                                                    toolTip="BundleParametros.codigo_tipo_area.tipo_area"
                                                    validatorExpression="#{TipoArea1.validatorCodigoTipoArea1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoTipoArea1Texto1"
                                                    binding="#{TipoArea1.campoCodigoTipoArea1Texto1}"
                                                    text="#{currentRow.value['codigo_tipo_area']}"/>
                                                <webuijsf:message id="messageCodigoTipoArea1"
                                                    for="campoCodigoTipoArea1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{TipoArea1.tableColumnLimiteIndiceCalidadVida1}"
                                                    headerText="limite indice calidad vida"
                                                    id="tableColumnLimiteIndiceCalidadVida1"
                                                    sort="limite_indice_calidad_vida">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextLimiteIndiceCalidadVida1"
                                                    text="#{currentRow.value['limite_indice_calidad_vida']}"
                                                    rendered="#{TipoArea1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{TipoArea1.labelLimiteIndiceCalidadVida1}"
                                                    id="labelLimiteIndiceCalidadVida1"
                                                    for="campoLimiteIndiceCalidadVida1"/>
                                                <webuijsf:textField id="campoLimiteIndiceCalidadVida1"
                                                    binding="#{TipoArea1.campoLimiteIndiceCalidadVida1}"
                                                    converter="#{TipoArea1.converterLimiteIndiceCalidadVida1}"
                                                    readOnly="#{TipoArea1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['limite_indice_calidad_vida']}"
                                                    toolTip="BundleParametros.limite_indice_calidad_vida.tipo_area"
                                                    validatorExpression="#{TipoArea1.validatorLimiteIndiceCalidadVida1.validate}"/>
                                                <webuijsf:staticText id="campoLimiteIndiceCalidadVida1Texto1"
                                                    binding="#{TipoArea1.campoLimiteIndiceCalidadVida1Texto1}"
                                                    converter="#{TipoArea1.converterLimiteIndiceCalidadVida1}"
                                                    text="#{currentRow.value['limite_indice_calidad_vida']}"/>
                                                <webuijsf:message id="messageLimiteIndiceCalidadVida1"
                                                    for="campoLimiteIndiceCalidadVida1"/>
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
                                                        binding="#{TipoArea1.etiquetaTextoFilasPorPagina1}" 
                                                        for="textoFilasPorPagina1"
                                                        id="etiquetaTextoFilasPorPagina1" 
                                                        text="#{TipoArea1.gestor.i18n.textoEtiquetaTextoFilasPorPagina}"/>
                                                </h:panelGrid>
                                                <h:panelGrid 
                                                    columns="3" 
                                                    id="gridPanel107">
                                                    <webuijsf:textField 
                                                        binding="#{TipoArea1.textoFilasPorPagina1}" 
                                                        columns="2"
                                                        converter="#{TipoArea1.textoFilasPorPagina1Converter1}"
                                                        disabled="#{TipoArea1.gestor.paginacionInhabilitada}" 
                                                        id="textoFilasPorPagina1" maxLength="2"
                                                        text="#{TipoArea1.gestor.filasPorPagina}" 
                                                        validatorExpression="#{TipoArea1.textoFilasPorPagina1Validator1.validate}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{TipoArea1.botonRepaginar1_action}"
                                                        binding="#{TipoArea1.botonRepaginar1}" 
                                                        id="botonRepaginar1"
                                                        imageURL="#{TipoArea1.gestor.urlImagenRepaginar}" 
                                                        onClick="#{TipoArea1.gestor.scriptRepaginar}"
                                                        text="#{TipoArea1.gestor.i18n.textoBotonRepaginar}"
                                                        toolTip="#{TipoArea1.gestor.i18n.toolTipBotonRepaginar}"/>
                                                    <webuijsf:message 
                                                        for="textoFilasPorPagina1" 
                                                        id="messageFilasPorPagina1"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="13"
                                                id="gridPanel108">
                                                <webuijsf:button
                                                    actionExpression="#{TipoArea1.botonAgregar1_action}"
                                                    binding="#{TipoArea1.botonAgregar1}"
                                                    disabled="#{TipoArea1.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{TipoArea1.gestor.scriptAgregar}"
                                                    rendered="#{TipoArea1.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{TipoArea1.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{TipoArea1.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{TipoArea1.listaFuncionEdicion1}"
                                                    converter="#{TipoArea1.converterListaFuncionEdicion1}"
                                                    disabled="#{TipoArea1.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{TipoArea1.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{TipoArea1.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{TipoArea1.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{TipoArea1.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{TipoArea1.botonEditar1_action}"
                                                    binding="#{TipoArea1.botonEditar1}"
                                                    disabled="#{TipoArea1.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{TipoArea1.gestor.scriptEditar}"
                                                    rendered="#{TipoArea1.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{TipoArea1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{TipoArea1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{TipoArea1.botonEliminar1_action}"
                                                    binding="#{TipoArea1.botonEliminar1}"
                                                    disabled="#{TipoArea1.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{TipoArea1.gestor.scriptEliminar}"
                                                    rendered="#{TipoArea1.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{TipoArea1.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{TipoArea1.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{TipoArea1.botonAplicar1_action}"
                                                    binding="#{TipoArea1.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{TipoArea1.gestor.scriptAplicar}"
                                                    rendered="#{TipoArea1.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{TipoArea1.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{TipoArea1.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{TipoArea1.botonDeshacer1_action}"
                                                    binding="#{TipoArea1.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{TipoArea1.gestor.scriptDeshacer}"
                                                    rendered="#{TipoArea1.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{TipoArea1.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{TipoArea1.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{TipoArea1.botonConfirmar1_action}"
                                                    binding="#{TipoArea1.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{TipoArea1.gestor.scriptConfirmar}"
                                                    rendered="#{TipoArea1.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{TipoArea1.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{TipoArea1.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{TipoArea1.botonDescartar1_action}"
                                                    binding="#{TipoArea1.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{TipoArea1.gestor.scriptDescartar}"
                                                    rendered="#{TipoArea1.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{TipoArea1.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{TipoArea1.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{TipoArea1.listaFuncionAccion1}"
                                                    converter="#{TipoArea1.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{TipoArea1.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{TipoArea1.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{TipoArea1.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{TipoArea1.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{TipoArea1.botonProcesar1_action}"
                                                    binding="#{TipoArea1.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{TipoArea1.gestor.scriptProcesar}"
                                                    rendered="#{TipoArea1.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{TipoArea1.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{TipoArea1.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{TipoArea1.botonRefrescar1_action}"
                                                    binding="#{TipoArea1.botonRefrescar1}"
                                                    disabled="#{TipoArea1.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{TipoArea1.gestor.scriptRefrescar}"
                                                    rendered="#{TipoArea1.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{TipoArea1.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{TipoArea1.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{TipoArea1.botonReconsultar1_action}"
                                                    binding="#{TipoArea1.botonReconsultar1}"
                                                    disabled="#{TipoArea1.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{TipoArea1.gestor.scriptReconsultar}"
                                                    rendered="#{TipoArea1.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{TipoArea1.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{TipoArea1.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{TipoArea1.botonRetornar1_action}"
                                                    binding="#{TipoArea1.botonRetornar1}"
                                                    disabled="#{TipoArea1.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{TipoArea1.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{TipoArea1.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{TipoArea1.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{TipoArea1.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel109"
                                                rendered="#{TipoArea1.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{TipoArea1.imageHyperlink1_action}"
                                                    binding="#{TipoArea1.imageHyperlink1}"
                                                    disabled="#{TipoArea1.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{TipoArea1.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{TipoArea1.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{TipoArea1.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.TipoArea1_imageHyperlink1_toolTip}"/>
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
