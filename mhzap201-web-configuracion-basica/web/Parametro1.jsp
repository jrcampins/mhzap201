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
                    focus="#{Parametro1.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{Parametro1.gestor.preserveFocus}"
                    preserveScroll="#{Parametro1.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{Parametro1.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | checkbox1 campoIdParametro1 campoCodigoParametro1 campoNombreParametro1 campoDetalleParametro1 campoDescripcionParametro1 listaNumeroTipoDatoPar1 campoAliasParametro1 textoFilasPorPagina1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | textoFilasPorPagina1 | botonRepaginar1 , virtualForm3 | checkbox1 listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonEscogerFila1 botonDetallarFila1 botonProcesarFila1 botonRetornarFila1 botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{Parametro1.breadcrumbs1}" 
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
                                                    rendered="#{Parametro1.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{Parametro1.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{Parametro1.gestor.mensajeDisponible}"
                                                    text="#{Parametro1.gestor.mensaje}"
                                                    url="#{Parametro1.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:table
                                            binding="#{Parametro1.table1}"
                                            clearSortButton="true" 
                                            deselectMultipleButton="true" 
                                            id="table1"
                                            paginateButton="false"
                                            paginationControls="true" 
                                            selectMultipleButton="true" 
                                            sortPanelToggleButton="true"
                                            width="960">
                                            <webuijsf:tableRowGroup 
                                                binding="#{Parametro1.tableRowGroup1}" 
                                                id="tableRowGroup1" 
                                                rows="1"
                                                selected="#{Parametro1.gestor.filaEscogida}" 
                                                sourceData="#{Parametro1.parametroDataProvider}" 
                                                sourceVar="currentRow">
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    id="tableRowGroup1SelectionColumn"
                                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);" 
                                                    selectId="checkbox1">
                                                    <webuijsf:checkbox 
                                                        binding="#{Parametro1.checkbox1}" 
                                                        id="checkbox1"
                                                        onClick="#{Parametro1.gestor.scriptElegir}" 
                                                        selected="#{Parametro1.gestor.filaElegida}" 
                                                        toolTip="#{Parametro1.gestor.i18n.toolTipCheckboxSeleccionMultiple}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    binding="#{Parametro1.tableColumn1}" 
                                                    id="tableColumn1">
                                                    <webuijsf:button 
                                                        actionExpression="#{Parametro1.botonEscogerFila1_action}"
                                                        binding="#{Parametro1.botonEscogerFila1}"
                                                        disabled="#{Parametro1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonEscogerFila1"
                                                        imageURL="#{Parametro1.gestor.urlImagenEscoger}" 
                                                        onClick="#{Parametro1.gestor.scriptEscoger}"
                                                        text="#{Parametro1.gestor.i18n.textoBotonEscogerFila}"
                                                        toolTip="#{Parametro1.gestor.i18n.toolTipBotonEscogerFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{Parametro1.botonDetallarFila1_action}"
                                                        binding="#{Parametro1.botonDetallarFila1}"
                                                        disabled="#{Parametro1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonDetallarFila1"
                                                        imageURL="#{Parametro1.gestor.urlImagenDetallar}" 
                                                        onClick="#{Parametro1.scriptAbrirVentanaVerDetalle}"
                                                        rendered="#{Parametro1.gestor.detalleDisponible}" 
                                                        text="#{Parametro1.gestor.i18n.textoBotonDetallarFila}"
                                                        toolTip="#{Parametro1.gestor.i18n.toolTipBotonDetallarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{Parametro1.botonProcesarFila1_action}"
                                                        binding="#{Parametro1.botonProcesarFila1}"
                                                        disabled="#{Parametro1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonProcesarFila1"
                                                        imageURL="#{Parametro1.gestor.urlImagenProcesar}" 
                                                        onClick="#{Parametro1.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{Parametro1.asistente.comandoDisponible}" 
                                                        text="#{Parametro1.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{Parametro1.gestor.i18n.toolTipBotonProcesarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{Parametro1.botonRetornarFila1_action}"
                                                        binding="#{Parametro1.botonRetornarFila1}" 
                                                        disabled="#{Parametro1.gestor.funcionReturnInhabilitada}"
                                                        id="botonRetornarFila1"
                                                        imageURL="#{Parametro1.gestor.urlImagenRetornar}"
                                                        onClick="#{Parametro1.gestor.scriptRetornarRecursoActual}"
                                                        rendered="#{Parametro1.gestor.funcionReturnVisible}" 
                                                        text="#{Parametro1.gestor.i18n.textoBotonRetornarFila}"
                                                        toolTip="#{Parametro1.gestor.i18n.toolTipBotonRetornarFila}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Parametro1.tableColumn2}"
                                                    id="tableColumn2"
                                                    rendered="#{Parametro1.gestor.designing}">
                                                    <webuijsf:imageHyperlink
                                                        actionExpression="#{Parametro1.hipervinculoAccionFila1_action}"
                                                        binding="#{Parametro1.hipervinculoAccionFila1}"
                                                        disabled="#{Parametro1.gestor.loteConCambios}"
                                                        id="hipervinculoAccionFila1"
                                                        imageURL="#{Parametro1.gestor.urlImagenEjecutarVinculo}"
                                                        onClick="#{Parametro1.scriptAbrirVentanaAccionFila1}"
                                                        text="Accion1"
                                                        toolTip="#{bundle.Parametro1_hipervinculoAccionFila1_toolTip}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="right" 
                                                    binding="#{Parametro1.tableColumn3}" 
                                                    headerText="#{Parametro1.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{Parametro1.gestor.i18n.toolTipEtiquetaIdentificacionFila}"
                                                    id="tableColumn3">
                                                    <webuijsf:imageHyperlink 
                                                        actionExpression="#{Parametro1.hipervinculoDetallarFila1_action}"
                                                        binding="#{Parametro1.hipervinculoDetallarFila1}" 
                                                        id="hipervinculoDetallarFila1"
                                                        imageURL="#{Parametro1.gestor.urlImagenFilaProcesada}"
                                                        textPosition="left" 
                                                        text="#{Parametro1.gestor.identificacionFila}" 
                                                        toolTip="#{Parametro1.gestor.toolTipImagenFilaProcesada}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Parametro1.tableColumnIdParametro1}"
                                                    headerText="identificaci&#243;n"
                                                    id="tableColumnIdParametro1"
                                                    sort="id_parametro">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdParametro1"
                                                    text="#{currentRow.value['id_parametro']}"
                                                    rendered="#{Parametro1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Parametro1.labelIdParametro1}"
                                                    id="labelIdParametro1"
                                                    for="campoIdParametro1"/>
                                                <webuijsf:textField id="campoIdParametro1"
                                                    binding="#{Parametro1.campoIdParametro1}"
                                                    converter="#{Parametro1.converterIdParametro1}"
                                                    readOnly="#{Parametro1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['id_parametro']}"
                                                    toolTip="BundleParametros.id_parametro.parametro"
                                                    validatorExpression="#{Parametro1.validatorIdParametro1.validate}"/>
                                                <webuijsf:staticText id="campoIdParametro1Texto1"
                                                    binding="#{Parametro1.campoIdParametro1Texto1}"
                                                    text="#{currentRow.value['id_parametro']}"/>
                                                <webuijsf:message id="messageIdParametro1"
                                                    for="campoIdParametro1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Parametro1.tableColumnCodigoParametro1}"
                                                    headerText="c&#243;digo"
                                                    id="tableColumnCodigoParametro1"
                                                    sort="codigo_parametro">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextCodigoParametro1"
                                                    text="#{currentRow.value['codigo_parametro']}"
                                                    rendered="#{Parametro1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Parametro1.labelCodigoParametro1}"
                                                    id="labelCodigoParametro1"
                                                    for="campoCodigoParametro1"/>
                                                <webuijsf:textField id="campoCodigoParametro1"
                                                    binding="#{Parametro1.campoCodigoParametro1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{Parametro1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['codigo_parametro']}"
                                                    toolTip="BundleParametros.codigo_parametro.parametro"
                                                    validatorExpression="#{Parametro1.validatorCodigoParametro1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoParametro1Texto1"
                                                    binding="#{Parametro1.campoCodigoParametro1Texto1}"
                                                    text="#{currentRow.value['codigo_parametro']}"/>
                                                <webuijsf:message id="messageCodigoParametro1"
                                                    for="campoCodigoParametro1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Parametro1.tableColumnNombreParametro1}"
                                                    headerText="nombre"
                                                    id="tableColumnNombreParametro1"
                                                    sort="nombre_parametro">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNombreParametro1"
                                                    text="#{currentRow.value['nombre_parametro']}"
                                                    rendered="#{Parametro1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Parametro1.labelNombreParametro1}"
                                                    id="labelNombreParametro1"
                                                    for="campoNombreParametro1"/>
                                                <webuijsf:textField id="campoNombreParametro1"
                                                    binding="#{Parametro1.campoNombreParametro1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{Parametro1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['nombre_parametro']}"
                                                    toolTip="BundleParametros.nombre_parametro.parametro"
                                                    validatorExpression="#{Parametro1.validatorNombreParametro1.validate}"/>
                                                <webuijsf:staticText id="campoNombreParametro1Texto1"
                                                    binding="#{Parametro1.campoNombreParametro1Texto1}"
                                                    text="#{currentRow.value['nombre_parametro']}"/>
                                                <webuijsf:message id="messageNombreParametro1"
                                                    for="campoNombreParametro1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Parametro1.tableColumnDetalleParametro1}"
                                                    headerText="detalle"
                                                    id="tableColumnDetalleParametro1" rendered="false"
                                                    sort="detalle_parametro">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextDetalleParametro1"
                                                    text="#{currentRow.value['detalle_parametro']}"
                                                    rendered="#{Parametro1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Parametro1.labelDetalleParametro1}"
                                                    id="labelDetalleParametro1"
                                                    for="campoDetalleParametro1"/>
                                                <webuijsf:textField id="campoDetalleParametro1"
                                                    binding="#{Parametro1.campoDetalleParametro1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{Parametro1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['detalle_parametro']}"
                                                    toolTip="BundleParametros.detalle_parametro.parametro"
                                                    validatorExpression="#{Parametro1.validatorDetalleParametro1.validate}"/>
                                                <webuijsf:staticText id="campoDetalleParametro1Texto1"
                                                    binding="#{Parametro1.campoDetalleParametro1Texto1}"
                                                    text="#{currentRow.value['detalle_parametro']}"/>
                                                <webuijsf:message id="messageDetalleParametro1"
                                                    for="campoDetalleParametro1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Parametro1.tableColumnDescripcionParametro1}"
                                                    headerText="descripci&#243;n"
                                                    id="tableColumnDescripcionParametro1" rendered="false"
                                                    sort="descripcion_parametro">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextDescripcionParametro1"
                                                    text="#{currentRow.value['descripcion_parametro']}"
                                                    rendered="#{Parametro1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Parametro1.labelDescripcionParametro1}"
                                                    id="labelDescripcionParametro1"
                                                    for="campoDescripcionParametro1"/>
                                                <webuijsf:textArea id="campoDescripcionParametro1"
                                                    binding="#{Parametro1.campoDescripcionParametro1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{Parametro1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['descripcion_parametro']}"
                                                    toolTip="BundleParametros.descripcion_parametro.parametro"
                                                    validatorExpression="#{Parametro1.validatorDescripcionParametro1.validate}"/>
                                                <webuijsf:staticText id="campoDescripcionParametro1Texto1"
                                                    binding="#{Parametro1.campoDescripcionParametro1Texto1}"
                                                    text="#{currentRow.value['descripcion_parametro']}"/>
                                                <webuijsf:message id="messageDescripcionParametro1"
                                                    for="campoDescripcionParametro1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Parametro1.tableColumnNumeroTipoDatoPar1}"
                                                    headerText="tipo dato par"
                                                    id="tableColumnNumeroTipoDatoPar1"
                                                    sort="codigo_tipo_dato_par_1x1y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroTipoDatoPar1"
                                                    text="#{currentRow.value['codigo_tipo_dato_par_1x1y2']}"
                                                    rendered="#{Parametro1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Parametro1.labelNumeroTipoDatoPar1}"
                                                    id="labelNumeroTipoDatoPar1"
                                                    for="listaNumeroTipoDatoPar1"/>
                                                <webuijsf:dropDown id="listaNumeroTipoDatoPar1"
                                                    binding="#{Parametro1.listaNumeroTipoDatoPar1}"
                                                    converter="#{Parametro1.converterNumeroTipoDatoPar1}"
                                                    disabled="#{Parametro1.gestor.filaNoProcesada}" required="true"
                                                    items="#{Parametro1.asistente.opcionesListaNumeroTipoDatoPar1}"
                                                    selected="#{currentRow.value['numero_tipo_dato_par']}"
                                                    toolTip="BundleParametros.numero_tipo_dato_par.parametro"/>
                                                <webuijsf:staticText id="listaNumeroTipoDatoPar1Texto1"
                                                    binding="#{Parametro1.listaNumeroTipoDatoPar1Texto1}"
                                                    text="#{currentRow.value['codigo_tipo_dato_par_1x1y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoDatoPar1"
                                                    for="listaNumeroTipoDatoPar1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Parametro1.tableColumnAliasParametro1}"
                                                    headerText="alias"
                                                    id="tableColumnAliasParametro1" rendered="false"
                                                    sort="alias_parametro">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextAliasParametro1"
                                                    text="#{currentRow.value['alias_parametro']}"
                                                    rendered="#{Parametro1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Parametro1.labelAliasParametro1}"
                                                    id="labelAliasParametro1"
                                                    for="campoAliasParametro1"/>
                                                <webuijsf:textField id="campoAliasParametro1"
                                                    binding="#{Parametro1.campoAliasParametro1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{Parametro1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['alias_parametro']}"
                                                    toolTip="BundleParametros.alias_parametro.parametro"
                                                    validatorExpression="#{Parametro1.validatorAliasParametro1.validate}"/>
                                                <webuijsf:staticText id="campoAliasParametro1Texto1"
                                                    binding="#{Parametro1.campoAliasParametro1Texto1}"
                                                    text="#{currentRow.value['alias_parametro']}"/>
                                                <webuijsf:message id="messageAliasParametro1"
                                                    for="campoAliasParametro1"/>
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
                                                        binding="#{Parametro1.etiquetaTextoFilasPorPagina1}" 
                                                        for="textoFilasPorPagina1"
                                                        id="etiquetaTextoFilasPorPagina1" 
                                                        text="#{Parametro1.gestor.i18n.textoEtiquetaTextoFilasPorPagina}"/>
                                                </h:panelGrid>
                                                <h:panelGrid 
                                                    columns="3" 
                                                    id="gridPanel107">
                                                    <webuijsf:textField 
                                                        binding="#{Parametro1.textoFilasPorPagina1}" 
                                                        columns="2"
                                                        converter="#{Parametro1.textoFilasPorPagina1Converter1}"
                                                        disabled="#{Parametro1.gestor.paginacionInhabilitada}" 
                                                        id="textoFilasPorPagina1" maxLength="2"
                                                        text="#{Parametro1.gestor.filasPorPagina}" 
                                                        validatorExpression="#{Parametro1.textoFilasPorPagina1Validator1.validate}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{Parametro1.botonRepaginar1_action}"
                                                        binding="#{Parametro1.botonRepaginar1}" 
                                                        id="botonRepaginar1"
                                                        imageURL="#{Parametro1.gestor.urlImagenRepaginar}" 
                                                        onClick="#{Parametro1.gestor.scriptRepaginar}"
                                                        text="#{Parametro1.gestor.i18n.textoBotonRepaginar}"
                                                        toolTip="#{Parametro1.gestor.i18n.toolTipBotonRepaginar}"/>
                                                    <webuijsf:message 
                                                        for="textoFilasPorPagina1" 
                                                        id="messageFilasPorPagina1"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="13"
                                                id="gridPanel108">
                                                <webuijsf:button
                                                    actionExpression="#{Parametro1.botonAgregar1_action}"
                                                    binding="#{Parametro1.botonAgregar1}"
                                                    disabled="#{Parametro1.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{Parametro1.gestor.scriptAgregar}"
                                                    rendered="#{Parametro1.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Parametro1.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{Parametro1.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{Parametro1.listaFuncionEdicion1}"
                                                    converter="#{Parametro1.converterListaFuncionEdicion1}"
                                                    disabled="#{Parametro1.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{Parametro1.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{Parametro1.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{Parametro1.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{Parametro1.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Parametro1.botonEditar1_action}"
                                                    binding="#{Parametro1.botonEditar1}"
                                                    disabled="#{Parametro1.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{Parametro1.gestor.scriptEditar}"
                                                    rendered="#{Parametro1.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Parametro1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{Parametro1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Parametro1.botonEliminar1_action}"
                                                    binding="#{Parametro1.botonEliminar1}"
                                                    disabled="#{Parametro1.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{Parametro1.gestor.scriptEliminar}"
                                                    rendered="#{Parametro1.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Parametro1.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{Parametro1.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Parametro1.botonAplicar1_action}"
                                                    binding="#{Parametro1.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{Parametro1.gestor.scriptAplicar}"
                                                    rendered="#{Parametro1.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Parametro1.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{Parametro1.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Parametro1.botonDeshacer1_action}"
                                                    binding="#{Parametro1.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{Parametro1.gestor.scriptDeshacer}"
                                                    rendered="#{Parametro1.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Parametro1.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{Parametro1.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Parametro1.botonConfirmar1_action}"
                                                    binding="#{Parametro1.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{Parametro1.gestor.scriptConfirmar}"
                                                    rendered="#{Parametro1.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Parametro1.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{Parametro1.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Parametro1.botonDescartar1_action}"
                                                    binding="#{Parametro1.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{Parametro1.gestor.scriptDescartar}"
                                                    rendered="#{Parametro1.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Parametro1.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{Parametro1.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{Parametro1.listaFuncionAccion1}"
                                                    converter="#{Parametro1.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{Parametro1.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{Parametro1.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{Parametro1.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{Parametro1.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Parametro1.botonProcesar1_action}"
                                                    binding="#{Parametro1.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{Parametro1.gestor.scriptProcesar}"
                                                    rendered="#{Parametro1.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Parametro1.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{Parametro1.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Parametro1.botonRefrescar1_action}"
                                                    binding="#{Parametro1.botonRefrescar1}"
                                                    disabled="#{Parametro1.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{Parametro1.gestor.scriptRefrescar}"
                                                    rendered="#{Parametro1.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Parametro1.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{Parametro1.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Parametro1.botonReconsultar1_action}"
                                                    binding="#{Parametro1.botonReconsultar1}"
                                                    disabled="#{Parametro1.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{Parametro1.gestor.scriptReconsultar}"
                                                    rendered="#{Parametro1.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Parametro1.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{Parametro1.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Parametro1.botonRetornar1_action}"
                                                    binding="#{Parametro1.botonRetornar1}"
                                                    disabled="#{Parametro1.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{Parametro1.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{Parametro1.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Parametro1.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{Parametro1.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel109"
                                                rendered="#{Parametro1.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{Parametro1.imageHyperlink1_action}"
                                                    binding="#{Parametro1.imageHyperlink1}"
                                                    disabled="#{Parametro1.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{Parametro1.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{Parametro1.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{Parametro1.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.Parametro1_imageHyperlink1_toolTip}"/>
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
