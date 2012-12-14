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
                    focus="#{EtniaIndigena5.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{EtniaIndigena5.gestor.preserveFocus}"
                    preserveScroll="#{EtniaIndigena5.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{EtniaIndigena5.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | checkbox1 campoIdEtniaIndigena1 campoCodigoEtniaIndigena1 campoNombreEtniaIndigena1 campoDescripcionEtniaIndigena1 textoFilasPorPagina1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | textoFilasPorPagina1 | botonRepaginar1 , virtualForm3 | checkbox1 listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonEscogerFila1 botonDetallarFila1 botonProcesarFila1 botonRetornarFila1 botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{EtniaIndigena5.breadcrumbs1}" 
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
                                                    rendered="#{EtniaIndigena5.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{EtniaIndigena5.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{EtniaIndigena5.gestor.mensajeDisponible}"
                                                    text="#{EtniaIndigena5.gestor.mensaje}"
                                                    url="#{EtniaIndigena5.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:table
                                            binding="#{EtniaIndigena5.table1}"
                                            clearSortButton="true" 
                                            deselectMultipleButton="true" 
                                            id="table1"
                                            paginateButton="false"
                                            paginationControls="true" 
                                            selectMultipleButton="true" 
                                            sortPanelToggleButton="true"
                                            width="960">
                                            <webuijsf:tableRowGroup 
                                                binding="#{EtniaIndigena5.tableRowGroup1}" 
                                                id="tableRowGroup1" 
                                                rows="1"
                                                selected="#{EtniaIndigena5.gestor.filaEscogida}" 
                                                sourceData="#{EtniaIndigena5.etniaIndigenaDataProvider}" 
                                                sourceVar="currentRow">
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    id="tableRowGroup1SelectionColumn"
                                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);" 
                                                    selectId="checkbox1">
                                                    <webuijsf:checkbox 
                                                        binding="#{EtniaIndigena5.checkbox1}" 
                                                        id="checkbox1"
                                                        onClick="#{EtniaIndigena5.gestor.scriptElegir}" 
                                                        selected="#{EtniaIndigena5.gestor.filaElegida}" 
                                                        toolTip="#{EtniaIndigena5.gestor.i18n.toolTipCheckboxSeleccionMultiple}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    binding="#{EtniaIndigena5.tableColumn1}" 
                                                    id="tableColumn1">
                                                    <webuijsf:button 
                                                        actionExpression="#{EtniaIndigena5.botonEscogerFila1_action}"
                                                        binding="#{EtniaIndigena5.botonEscogerFila1}"
                                                        disabled="#{EtniaIndigena5.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonEscogerFila1"
                                                        imageURL="#{EtniaIndigena5.gestor.urlImagenEscoger}" 
                                                        onClick="#{EtniaIndigena5.gestor.scriptEscoger}"
                                                        text="#{EtniaIndigena5.gestor.i18n.textoBotonEscogerFila}"
                                                        toolTip="#{EtniaIndigena5.gestor.i18n.toolTipBotonEscogerFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{EtniaIndigena5.botonDetallarFila1_action}"
                                                        binding="#{EtniaIndigena5.botonDetallarFila1}"
                                                        disabled="#{EtniaIndigena5.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonDetallarFila1"
                                                        imageURL="#{EtniaIndigena5.gestor.urlImagenDetallar}" 
                                                        onClick="#{EtniaIndigena5.scriptAbrirVentanaVerDetalle}"
                                                        rendered="#{EtniaIndigena5.gestor.detalleDisponible}" 
                                                        text="#{EtniaIndigena5.gestor.i18n.textoBotonDetallarFila}"
                                                        toolTip="#{EtniaIndigena5.gestor.i18n.toolTipBotonDetallarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{EtniaIndigena5.botonProcesarFila1_action}"
                                                        binding="#{EtniaIndigena5.botonProcesarFila1}"
                                                        disabled="#{EtniaIndigena5.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonProcesarFila1"
                                                        imageURL="#{EtniaIndigena5.gestor.urlImagenProcesar}" 
                                                        onClick="#{EtniaIndigena5.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{EtniaIndigena5.asistente.comandoDisponible}" 
                                                        text="#{EtniaIndigena5.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{EtniaIndigena5.gestor.i18n.toolTipBotonProcesarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{EtniaIndigena5.botonRetornarFila1_action}"
                                                        binding="#{EtniaIndigena5.botonRetornarFila1}" 
                                                        disabled="#{EtniaIndigena5.gestor.funcionReturnInhabilitada}"
                                                        id="botonRetornarFila1"
                                                        imageURL="#{EtniaIndigena5.gestor.urlImagenRetornar}"
                                                        onClick="#{EtniaIndigena5.gestor.scriptRetornarRecursoActual}"
                                                        rendered="#{EtniaIndigena5.gestor.funcionReturnVisible}" 
                                                        text="#{EtniaIndigena5.gestor.i18n.textoBotonRetornarFila}"
                                                        toolTip="#{EtniaIndigena5.gestor.i18n.toolTipBotonRetornarFila}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{EtniaIndigena5.tableColumn2}"
                                                    id="tableColumn2"
                                                    rendered="#{EtniaIndigena5.gestor.designing}">
                                                    <webuijsf:imageHyperlink
                                                        actionExpression="#{EtniaIndigena5.hipervinculoAccionFila1_action}"
                                                        binding="#{EtniaIndigena5.hipervinculoAccionFila1}"
                                                        disabled="#{EtniaIndigena5.gestor.loteConCambios}"
                                                        id="hipervinculoAccionFila1"
                                                        imageURL="#{EtniaIndigena5.gestor.urlImagenEjecutarVinculo}"
                                                        onClick="#{EtniaIndigena5.scriptAbrirVentanaAccionFila1}"
                                                        text="Accion1"
                                                        toolTip="#{bundle.EtniaIndigena5_hipervinculoAccionFila1_toolTip}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="right" 
                                                    binding="#{EtniaIndigena5.tableColumn3}" 
                                                    headerText="#{EtniaIndigena5.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{EtniaIndigena5.gestor.i18n.toolTipEtiquetaIdentificacionFila}"
                                                    id="tableColumn3">
                                                    <webuijsf:imageHyperlink 
                                                        actionExpression="#{EtniaIndigena5.hipervinculoDetallarFila1_action}"
                                                        binding="#{EtniaIndigena5.hipervinculoDetallarFila1}" 
                                                        id="hipervinculoDetallarFila1"
                                                        imageURL="#{EtniaIndigena5.gestor.urlImagenFilaProcesada}"
                                                        textPosition="left" 
                                                        text="#{EtniaIndigena5.gestor.identificacionFila}" 
                                                        toolTip="#{EtniaIndigena5.gestor.toolTipImagenFilaProcesada}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{EtniaIndigena5.tableColumnIdEtniaIndigena1}"
                                                    headerText="identificaci&#243;n"
                                                    id="tableColumnIdEtniaIndigena1" rendered="false"
                                                    sort="id_etnia_indigena">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdEtniaIndigena1"
                                                    text="#{currentRow.value['id_etnia_indigena']}"
                                                    rendered="#{EtniaIndigena5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{EtniaIndigena5.labelIdEtniaIndigena1}"
                                                    id="labelIdEtniaIndigena1"
                                                    for="campoIdEtniaIndigena1"/>
                                                <webuijsf:textField id="campoIdEtniaIndigena1"
                                                    binding="#{EtniaIndigena5.campoIdEtniaIndigena1}"
                                                    converter="#{EtniaIndigena5.converterIdEtniaIndigena1}"
                                                    readOnly="#{EtniaIndigena5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['id_etnia_indigena']}"
                                                    toolTip="BundleParametros.id_etnia_indigena.etnia_indigena"
                                                    validatorExpression="#{EtniaIndigena5.validatorIdEtniaIndigena1.validate}"/>
                                                <webuijsf:staticText id="campoIdEtniaIndigena1Texto1"
                                                    binding="#{EtniaIndigena5.campoIdEtniaIndigena1Texto1}"
                                                    text="#{currentRow.value['id_etnia_indigena']}"/>
                                                <webuijsf:message id="messageIdEtniaIndigena1"
                                                    for="campoIdEtniaIndigena1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{EtniaIndigena5.tableColumnCodigoEtniaIndigena1}"
                                                    headerText="c&#243;digo"
                                                    id="tableColumnCodigoEtniaIndigena1"
                                                    sort="codigo_etnia_indigena">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextCodigoEtniaIndigena1"
                                                    text="#{currentRow.value['codigo_etnia_indigena']}"
                                                    rendered="#{EtniaIndigena5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{EtniaIndigena5.labelCodigoEtniaIndigena1}"
                                                    id="labelCodigoEtniaIndigena1"
                                                    for="campoCodigoEtniaIndigena1"/>
                                                <webuijsf:textField id="campoCodigoEtniaIndigena1"
                                                    binding="#{EtniaIndigena5.campoCodigoEtniaIndigena1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{EtniaIndigena5.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['codigo_etnia_indigena']}"
                                                    toolTip="BundleParametros.codigo_etnia_indigena.etnia_indigena"
                                                    validatorExpression="#{EtniaIndigena5.validatorCodigoEtniaIndigena1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoEtniaIndigena1Texto1"
                                                    binding="#{EtniaIndigena5.campoCodigoEtniaIndigena1Texto1}"
                                                    text="#{currentRow.value['codigo_etnia_indigena']}"/>
                                                <webuijsf:message id="messageCodigoEtniaIndigena1"
                                                    for="campoCodigoEtniaIndigena1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{EtniaIndigena5.tableColumnNombreEtniaIndigena1}"
                                                    headerText="nombre"
                                                    id="tableColumnNombreEtniaIndigena1"
                                                    sort="nombre_etnia_indigena">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNombreEtniaIndigena1"
                                                    text="#{currentRow.value['nombre_etnia_indigena']}"
                                                    rendered="#{EtniaIndigena5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{EtniaIndigena5.labelNombreEtniaIndigena1}"
                                                    id="labelNombreEtniaIndigena1"
                                                    for="campoNombreEtniaIndigena1"/>
                                                <webuijsf:textField id="campoNombreEtniaIndigena1"
                                                    binding="#{EtniaIndigena5.campoNombreEtniaIndigena1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{EtniaIndigena5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['nombre_etnia_indigena']}"
                                                    toolTip="BundleParametros.nombre_etnia_indigena.etnia_indigena"
                                                    validatorExpression="#{EtniaIndigena5.validatorNombreEtniaIndigena1.validate}"/>
                                                <webuijsf:staticText id="campoNombreEtniaIndigena1Texto1"
                                                    binding="#{EtniaIndigena5.campoNombreEtniaIndigena1Texto1}"
                                                    text="#{currentRow.value['nombre_etnia_indigena']}"/>
                                                <webuijsf:message id="messageNombreEtniaIndigena1"
                                                    for="campoNombreEtniaIndigena1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{EtniaIndigena5.tableColumnDescripcionEtniaIndigena1}"
                                                    headerText="descripci&#243;n"
                                                    id="tableColumnDescripcionEtniaIndigena1" rendered="false"
                                                    sort="descripcion_etnia_indigena">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextDescripcionEtniaIndigena1"
                                                    text="#{currentRow.value['descripcion_etnia_indigena']}"
                                                    rendered="#{EtniaIndigena5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{EtniaIndigena5.labelDescripcionEtniaIndigena1}"
                                                    id="labelDescripcionEtniaIndigena1"
                                                    for="campoDescripcionEtniaIndigena1"/>
                                                <webuijsf:textArea id="campoDescripcionEtniaIndigena1"
                                                    binding="#{EtniaIndigena5.campoDescripcionEtniaIndigena1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{EtniaIndigena5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['descripcion_etnia_indigena']}"
                                                    toolTip="BundleParametros.descripcion_etnia_indigena.etnia_indigena"
                                                    validatorExpression="#{EtniaIndigena5.validatorDescripcionEtniaIndigena1.validate}"/>
                                                <webuijsf:staticText id="campoDescripcionEtniaIndigena1Texto1"
                                                    binding="#{EtniaIndigena5.campoDescripcionEtniaIndigena1Texto1}"
                                                    text="#{currentRow.value['descripcion_etnia_indigena']}"/>
                                                <webuijsf:message id="messageDescripcionEtniaIndigena1"
                                                    for="campoDescripcionEtniaIndigena1"/>
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
                                                        binding="#{EtniaIndigena5.etiquetaTextoFilasPorPagina1}" 
                                                        for="textoFilasPorPagina1"
                                                        id="etiquetaTextoFilasPorPagina1" 
                                                        text="#{EtniaIndigena5.gestor.i18n.textoEtiquetaTextoFilasPorPagina}"/>
                                                </h:panelGrid>
                                                <h:panelGrid 
                                                    columns="3" 
                                                    id="gridPanel107">
                                                    <webuijsf:textField 
                                                        binding="#{EtniaIndigena5.textoFilasPorPagina1}" 
                                                        columns="2"
                                                        converter="#{EtniaIndigena5.textoFilasPorPagina1Converter1}"
                                                        disabled="#{EtniaIndigena5.gestor.paginacionInhabilitada}" 
                                                        id="textoFilasPorPagina1" maxLength="2"
                                                        text="#{EtniaIndigena5.gestor.filasPorPagina}" 
                                                        validatorExpression="#{EtniaIndigena5.textoFilasPorPagina1Validator1.validate}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{EtniaIndigena5.botonRepaginar1_action}"
                                                        binding="#{EtniaIndigena5.botonRepaginar1}" 
                                                        id="botonRepaginar1"
                                                        imageURL="#{EtniaIndigena5.gestor.urlImagenRepaginar}" 
                                                        onClick="#{EtniaIndigena5.gestor.scriptRepaginar}"
                                                        text="#{EtniaIndigena5.gestor.i18n.textoBotonRepaginar}"
                                                        toolTip="#{EtniaIndigena5.gestor.i18n.toolTipBotonRepaginar}"/>
                                                    <webuijsf:message 
                                                        for="textoFilasPorPagina1" 
                                                        id="messageFilasPorPagina1"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="13"
                                                id="gridPanel108">
                                                <webuijsf:button
                                                    actionExpression="#{EtniaIndigena5.botonAgregar1_action}"
                                                    binding="#{EtniaIndigena5.botonAgregar1}"
                                                    disabled="#{EtniaIndigena5.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{EtniaIndigena5.gestor.scriptAgregar}"
                                                    rendered="#{EtniaIndigena5.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{EtniaIndigena5.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{EtniaIndigena5.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{EtniaIndigena5.listaFuncionEdicion1}"
                                                    converter="#{EtniaIndigena5.converterListaFuncionEdicion1}"
                                                    disabled="#{EtniaIndigena5.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{EtniaIndigena5.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{EtniaIndigena5.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{EtniaIndigena5.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{EtniaIndigena5.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{EtniaIndigena5.botonEditar1_action}"
                                                    binding="#{EtniaIndigena5.botonEditar1}"
                                                    disabled="#{EtniaIndigena5.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{EtniaIndigena5.gestor.scriptEditar}"
                                                    rendered="#{EtniaIndigena5.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{EtniaIndigena5.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{EtniaIndigena5.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{EtniaIndigena5.botonEliminar1_action}"
                                                    binding="#{EtniaIndigena5.botonEliminar1}"
                                                    disabled="#{EtniaIndigena5.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{EtniaIndigena5.gestor.scriptEliminar}"
                                                    rendered="#{EtniaIndigena5.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{EtniaIndigena5.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{EtniaIndigena5.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{EtniaIndigena5.botonAplicar1_action}"
                                                    binding="#{EtniaIndigena5.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{EtniaIndigena5.gestor.scriptAplicar}"
                                                    rendered="#{EtniaIndigena5.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{EtniaIndigena5.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{EtniaIndigena5.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{EtniaIndigena5.botonDeshacer1_action}"
                                                    binding="#{EtniaIndigena5.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{EtniaIndigena5.gestor.scriptDeshacer}"
                                                    rendered="#{EtniaIndigena5.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{EtniaIndigena5.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{EtniaIndigena5.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{EtniaIndigena5.botonConfirmar1_action}"
                                                    binding="#{EtniaIndigena5.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{EtniaIndigena5.gestor.scriptConfirmar}"
                                                    rendered="#{EtniaIndigena5.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{EtniaIndigena5.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{EtniaIndigena5.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{EtniaIndigena5.botonDescartar1_action}"
                                                    binding="#{EtniaIndigena5.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{EtniaIndigena5.gestor.scriptDescartar}"
                                                    rendered="#{EtniaIndigena5.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{EtniaIndigena5.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{EtniaIndigena5.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{EtniaIndigena5.listaFuncionAccion1}"
                                                    converter="#{EtniaIndigena5.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{EtniaIndigena5.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{EtniaIndigena5.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{EtniaIndigena5.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{EtniaIndigena5.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{EtniaIndigena5.botonProcesar1_action}"
                                                    binding="#{EtniaIndigena5.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{EtniaIndigena5.gestor.scriptProcesar}"
                                                    rendered="#{EtniaIndigena5.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{EtniaIndigena5.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{EtniaIndigena5.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{EtniaIndigena5.botonRefrescar1_action}"
                                                    binding="#{EtniaIndigena5.botonRefrescar1}"
                                                    disabled="#{EtniaIndigena5.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{EtniaIndigena5.gestor.scriptRefrescar}"
                                                    rendered="#{EtniaIndigena5.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{EtniaIndigena5.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{EtniaIndigena5.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{EtniaIndigena5.botonReconsultar1_action}"
                                                    binding="#{EtniaIndigena5.botonReconsultar1}"
                                                    disabled="#{EtniaIndigena5.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{EtniaIndigena5.gestor.scriptReconsultar}"
                                                    rendered="#{EtniaIndigena5.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{EtniaIndigena5.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{EtniaIndigena5.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{EtniaIndigena5.botonRetornar1_action}"
                                                    binding="#{EtniaIndigena5.botonRetornar1}"
                                                    disabled="#{EtniaIndigena5.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{EtniaIndigena5.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{EtniaIndigena5.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{EtniaIndigena5.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{EtniaIndigena5.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel109"
                                                rendered="#{EtniaIndigena5.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{EtniaIndigena5.imageHyperlink1_action}"
                                                    binding="#{EtniaIndigena5.imageHyperlink1}"
                                                    disabled="#{EtniaIndigena5.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{EtniaIndigena5.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{EtniaIndigena5.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{EtniaIndigena5.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.EtniaIndigena5_imageHyperlink1_toolTip}"/>
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
