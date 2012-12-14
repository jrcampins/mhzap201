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
                    focus="#{FuncionParametroPorFuncion1.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{FuncionParametroPorFuncion1.gestor.preserveFocus}"
                    preserveScroll="#{FuncionParametroPorFuncion1.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{FuncionParametroPorFuncion1.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | checkbox1 campoIdFuncionParametro1 campoIdParametro1 listaNumeroTipoParametro1 listaNumeroTipoComparacion1 campoIdFuncionReferencia1 listaNumeroTipoValor1 campoIdListaValor1 campoIdClaseObjetoValor1 campoIdClaseRecursoValor1 campoValorMinimo1 campoValorMaximo1 campoValorOmision1 listaEsParametroSinRastro1 listaEsParametroSegmento1 textoFilasPorPagina1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | textoFilasPorPagina1 | botonRepaginar1 , virtualForm3 | checkbox1 listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonEscogerFila1 botonDetallarFila1 botonProcesarFila1 botonRetornarFila1 botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{FuncionParametroPorFuncion1.breadcrumbs1}" 
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
                                                    rendered="#{FuncionParametroPorFuncion1.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{FuncionParametroPorFuncion1.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{FuncionParametroPorFuncion1.gestor.mensajeDisponible}"
                                                    text="#{FuncionParametroPorFuncion1.gestor.mensaje}"
                                                    url="#{FuncionParametroPorFuncion1.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:table
                                            binding="#{FuncionParametroPorFuncion1.table1}"
                                            clearSortButton="true" 
                                            deselectMultipleButton="true" 
                                            id="table1"
                                            paginateButton="false"
                                            paginationControls="true" 
                                            selectMultipleButton="true" 
                                            sortPanelToggleButton="true"
                                            width="960">
                                            <webuijsf:tableRowGroup 
                                                binding="#{FuncionParametroPorFuncion1.tableRowGroup1}" 
                                                id="tableRowGroup1" 
                                                rows="1"
                                                selected="#{FuncionParametroPorFuncion1.gestor.filaEscogida}" 
                                                sourceData="#{FuncionParametroPorFuncion1.funcionParametroDataProvider}" 
                                                sourceVar="currentRow">
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    id="tableRowGroup1SelectionColumn"
                                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);" 
                                                    selectId="checkbox1">
                                                    <webuijsf:checkbox 
                                                        binding="#{FuncionParametroPorFuncion1.checkbox1}" 
                                                        id="checkbox1"
                                                        onClick="#{FuncionParametroPorFuncion1.gestor.scriptElegir}" 
                                                        selected="#{FuncionParametroPorFuncion1.gestor.filaElegida}" 
                                                        toolTip="#{FuncionParametroPorFuncion1.gestor.i18n.toolTipCheckboxSeleccionMultiple}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    binding="#{FuncionParametroPorFuncion1.tableColumn1}" 
                                                    id="tableColumn1">
                                                    <webuijsf:button 
                                                        actionExpression="#{FuncionParametroPorFuncion1.botonEscogerFila1_action}"
                                                        binding="#{FuncionParametroPorFuncion1.botonEscogerFila1}"
                                                        disabled="#{FuncionParametroPorFuncion1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonEscogerFila1"
                                                        imageURL="#{FuncionParametroPorFuncion1.gestor.urlImagenEscoger}" 
                                                        onClick="#{FuncionParametroPorFuncion1.gestor.scriptEscoger}"
                                                        text="#{FuncionParametroPorFuncion1.gestor.i18n.textoBotonEscogerFila}"
                                                        toolTip="#{FuncionParametroPorFuncion1.gestor.i18n.toolTipBotonEscogerFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{FuncionParametroPorFuncion1.botonDetallarFila1_action}"
                                                        binding="#{FuncionParametroPorFuncion1.botonDetallarFila1}"
                                                        disabled="#{FuncionParametroPorFuncion1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonDetallarFila1"
                                                        imageURL="#{FuncionParametroPorFuncion1.gestor.urlImagenDetallar}" 
                                                        onClick="#{FuncionParametroPorFuncion1.scriptAbrirVentanaVerDetalle}"
                                                        rendered="#{FuncionParametroPorFuncion1.gestor.detalleDisponible}" 
                                                        text="#{FuncionParametroPorFuncion1.gestor.i18n.textoBotonDetallarFila}"
                                                        toolTip="#{FuncionParametroPorFuncion1.gestor.i18n.toolTipBotonDetallarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{FuncionParametroPorFuncion1.botonProcesarFila1_action}"
                                                        binding="#{FuncionParametroPorFuncion1.botonProcesarFila1}"
                                                        disabled="#{FuncionParametroPorFuncion1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonProcesarFila1"
                                                        imageURL="#{FuncionParametroPorFuncion1.gestor.urlImagenProcesar}" 
                                                        onClick="#{FuncionParametroPorFuncion1.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{FuncionParametroPorFuncion1.asistente.comandoDisponible}" 
                                                        text="#{FuncionParametroPorFuncion1.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{FuncionParametroPorFuncion1.gestor.i18n.toolTipBotonProcesarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{FuncionParametroPorFuncion1.botonRetornarFila1_action}"
                                                        binding="#{FuncionParametroPorFuncion1.botonRetornarFila1}" 
                                                        disabled="#{FuncionParametroPorFuncion1.gestor.funcionReturnInhabilitada}"
                                                        id="botonRetornarFila1"
                                                        imageURL="#{FuncionParametroPorFuncion1.gestor.urlImagenRetornar}"
                                                        onClick="#{FuncionParametroPorFuncion1.gestor.scriptRetornarRecursoActual}"
                                                        rendered="#{FuncionParametroPorFuncion1.gestor.funcionReturnVisible}" 
                                                        text="#{FuncionParametroPorFuncion1.gestor.i18n.textoBotonRetornarFila}"
                                                        toolTip="#{FuncionParametroPorFuncion1.gestor.i18n.toolTipBotonRetornarFila}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FuncionParametroPorFuncion1.tableColumn2}"
                                                    id="tableColumn2"
                                                    rendered="#{FuncionParametroPorFuncion1.gestor.designing}">
                                                    <webuijsf:imageHyperlink
                                                        actionExpression="#{FuncionParametroPorFuncion1.hipervinculoAccionFila1_action}"
                                                        binding="#{FuncionParametroPorFuncion1.hipervinculoAccionFila1}"
                                                        disabled="#{FuncionParametroPorFuncion1.gestor.loteConCambios}"
                                                        id="hipervinculoAccionFila1"
                                                        imageURL="#{FuncionParametroPorFuncion1.gestor.urlImagenEjecutarVinculo}"
                                                        onClick="#{FuncionParametroPorFuncion1.scriptAbrirVentanaAccionFila1}"
                                                        text="Accion1"
                                                        toolTip="#{bundle.FuncionParametroPorFuncion1_hipervinculoAccionFila1_toolTip}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="right" 
                                                    binding="#{FuncionParametroPorFuncion1.tableColumn3}" 
                                                    headerText="#{FuncionParametroPorFuncion1.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{FuncionParametroPorFuncion1.gestor.i18n.toolTipEtiquetaIdentificacionFila}"
                                                    id="tableColumn3">
                                                    <webuijsf:imageHyperlink 
                                                        actionExpression="#{FuncionParametroPorFuncion1.hipervinculoDetallarFila1_action}"
                                                        binding="#{FuncionParametroPorFuncion1.hipervinculoDetallarFila1}" 
                                                        id="hipervinculoDetallarFila1"
                                                        imageURL="#{FuncionParametroPorFuncion1.gestor.urlImagenFilaProcesada}"
                                                        textPosition="left" 
                                                        text="#{FuncionParametroPorFuncion1.gestor.identificacionFila}" 
                                                        toolTip="#{FuncionParametroPorFuncion1.gestor.toolTipImagenFilaProcesada}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FuncionParametroPorFuncion1.tableColumnIdFuncionParametro1}"
                                                    headerText="identificaci&#243;n"
                                                    id="tableColumnIdFuncionParametro1"
                                                    sort="id_funcion_parametro">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdFuncionParametro1"
                                                    text="#{currentRow.value['id_funcion_parametro']}"
                                                    rendered="#{FuncionParametroPorFuncion1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FuncionParametroPorFuncion1.labelIdFuncionParametro1}"
                                                    id="labelIdFuncionParametro1"
                                                    for="campoIdFuncionParametro1"/>
                                                <webuijsf:textField id="campoIdFuncionParametro1"
                                                    binding="#{FuncionParametroPorFuncion1.campoIdFuncionParametro1}"
                                                    converter="#{FuncionParametroPorFuncion1.converterIdFuncionParametro1}"
                                                    readOnly="#{FuncionParametroPorFuncion1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['id_funcion_parametro']}"
                                                    toolTip="BundleParametros.id_funcion_parametro.funcion_parametro"
                                                    validatorExpression="#{FuncionParametroPorFuncion1.validatorIdFuncionParametro1.validate}"/>
                                                <webuijsf:staticText id="campoIdFuncionParametro1Texto1"
                                                    binding="#{FuncionParametroPorFuncion1.campoIdFuncionParametro1Texto1}"
                                                    text="#{currentRow.value['id_funcion_parametro']}"/>
                                                <webuijsf:message id="messageIdFuncionParametro1"
                                                    for="campoIdFuncionParametro1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FuncionParametroPorFuncion1.tableColumnIdParametro1}"
                                                    headerText="parametro"
                                                    id="tableColumnIdParametro1"
                                                    sort="codigo_parametro_1x2y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdParametro1"
                                                    text="#{currentRow.value['codigo_parametro_1x2y3']}"
                                                    rendered="#{FuncionParametroPorFuncion1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FuncionParametroPorFuncion1.labelIdParametro1}"
                                                    id="labelIdParametro1"
                                                    for="campoIdParametro1"/>
                                                <webuijsf:textField id="campoIdParametro1"
                                                    binding="#{FuncionParametroPorFuncion1.campoIdParametro1}"
                                                    readOnly="#{FuncionParametroPorFuncion1.gestor.filaNoProcesada}" required="true"
                                                    text="#{FuncionParametroPorFuncion1.asistente.textoCampoIdParametro1}"
                                                    toolTip="#{FuncionParametroPorFuncion1.asistente.toolTipCampoIdParametro1}"
                                                    validatorExpression="#{FuncionParametroPorFuncion1.campoIdParametro1_validate}"/>
                                                <webuijsf:staticText id="campoIdParametro1Texto1"
                                                    binding="#{FuncionParametroPorFuncion1.campoIdParametro1Texto1}"
                                                    text="#{currentRow.value['codigo_parametro_1x2y3']}"/>
                                                <webuijsf:message id="messageIdParametro1"
                                                    for="campoIdParametro1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdParametro3"
                                                    rendered="#{FuncionParametroPorFuncion1.asistente.tableColumnIdParametro3Rendered}"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdParametro3"
                                                    text="#{currentRow.value['id_parametro']}"
                                                    rendered="#{FuncionParametroPorFuncion1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{FuncionParametroPorFuncion1.campoIdParametro1Boton1}"
                                                    id="campoIdParametro1Boton1"
                                                    onClick="#{FuncionParametroPorFuncion1.asistente.scriptCampoIdParametro1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{FuncionParametroPorFuncion1.campoIdParametro1Boton3}"
                                                    id="campoIdParametro1Boton3"
                                                    onClick="#{FuncionParametroPorFuncion1.asistente.scriptCampoIdParametro1Boton2}"
                                                    rendered="#{FuncionParametroPorFuncion1.asistente.campoIdParametro1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{FuncionParametroPorFuncion1.tableColumnIdParametro2}"
                                                    headerText="nombre parametro"
                                                    id="tableColumnIdParametro2"
                                                    rendered="#{FuncionParametroPorFuncion1.asistente.campoIdParametro1Boton2Rendered}"
                                                    sort="nombre_parametro_1x2y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdParametro2"
                                                    text="#{currentRow.value['nombre_parametro_1x2y4']}"
                                                    rendered="#{FuncionParametroPorFuncion1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FuncionParametroPorFuncion1.labelIdParametro2}"
                                                    id="labelIdParametro2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{FuncionParametroPorFuncion1.campoIdParametro1Hiper1}"
                                                    id="campoIdParametro1Hiper1"
                                                    text="#{currentRow.value['nombre_parametro_1x2y4']}"
                                                    onClick="#{FuncionParametroPorFuncion1.asistente.scriptCampoIdParametro1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdParametro1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FuncionParametroPorFuncion1.tableColumnNumeroTipoParametro1}"
                                                    headerText="tipo parametro"
                                                    id="tableColumnNumeroTipoParametro1"
                                                    sort="codigo_tipo_parametro_1x3y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroTipoParametro1"
                                                    text="#{currentRow.value['codigo_tipo_parametro_1x3y2']}"
                                                    rendered="#{FuncionParametroPorFuncion1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FuncionParametroPorFuncion1.labelNumeroTipoParametro1}"
                                                    id="labelNumeroTipoParametro1"
                                                    for="listaNumeroTipoParametro1"/>
                                                <webuijsf:dropDown id="listaNumeroTipoParametro1"
                                                    binding="#{FuncionParametroPorFuncion1.listaNumeroTipoParametro1}"
                                                    converter="#{FuncionParametroPorFuncion1.converterNumeroTipoParametro1}"
                                                    disabled="#{FuncionParametroPorFuncion1.gestor.filaNoProcesada}" required="true"
                                                    items="#{FuncionParametroPorFuncion1.asistente.opcionesListaNumeroTipoParametro1}"
                                                    selected="#{currentRow.value['numero_tipo_parametro']}"
                                                    toolTip="BundleParametros.numero_tipo_parametro.funcion_parametro"/>
                                                <webuijsf:staticText id="listaNumeroTipoParametro1Texto1"
                                                    binding="#{FuncionParametroPorFuncion1.listaNumeroTipoParametro1Texto1}"
                                                    text="#{currentRow.value['codigo_tipo_parametro_1x3y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoParametro1"
                                                    for="listaNumeroTipoParametro1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FuncionParametroPorFuncion1.tableColumnNumeroTipoComparacion1}"
                                                    headerText="tipo comparaci&#243;n"
                                                    id="tableColumnNumeroTipoComparacion1" rendered="false"
                                                    sort="codigo_tipo_comparacion_1x4y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroTipoComparacion1"
                                                    text="#{currentRow.value['codigo_tipo_comparacion_1x4y2']}"
                                                    rendered="#{FuncionParametroPorFuncion1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FuncionParametroPorFuncion1.labelNumeroTipoComparacion1}"
                                                    id="labelNumeroTipoComparacion1"
                                                    for="listaNumeroTipoComparacion1"/>
                                                <webuijsf:dropDown id="listaNumeroTipoComparacion1"
                                                    binding="#{FuncionParametroPorFuncion1.listaNumeroTipoComparacion1}"
                                                    converter="#{FuncionParametroPorFuncion1.converterNumeroTipoComparacion1}"
                                                    disabled="#{FuncionParametroPorFuncion1.gestor.filaNoProcesada}"
                                                    items="#{FuncionParametroPorFuncion1.asistente.opcionesListaNumeroTipoComparacion1}"
                                                    selected="#{currentRow.value['numero_tipo_comparacion']}"
                                                    toolTip="BundleParametros.numero_tipo_comparacion.funcion_parametro"/>
                                                <webuijsf:staticText id="listaNumeroTipoComparacion1Texto1"
                                                    binding="#{FuncionParametroPorFuncion1.listaNumeroTipoComparacion1Texto1}"
                                                    text="#{currentRow.value['codigo_tipo_comparacion_1x4y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoComparacion1"
                                                    for="listaNumeroTipoComparacion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FuncionParametroPorFuncion1.tableColumnIdFuncionReferencia1}"
                                                    headerText="funci&#243;n referencia"
                                                    id="tableColumnIdFuncionReferencia1" rendered="false"
                                                    sort="codigo_funcion_1x5y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdFuncionReferencia1"
                                                    text="#{currentRow.value['codigo_funcion_1x5y3']}"
                                                    rendered="#{FuncionParametroPorFuncion1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FuncionParametroPorFuncion1.labelIdFuncionReferencia1}"
                                                    id="labelIdFuncionReferencia1"
                                                    for="campoIdFuncionReferencia1"/>
                                                <webuijsf:textField id="campoIdFuncionReferencia1"
                                                    binding="#{FuncionParametroPorFuncion1.campoIdFuncionReferencia1}"
                                                    readOnly="#{FuncionParametroPorFuncion1.gestor.filaNoProcesada}"
                                                    text="#{FuncionParametroPorFuncion1.asistente.textoCampoIdFuncionReferencia1}"
                                                    toolTip="#{FuncionParametroPorFuncion1.asistente.toolTipCampoIdFuncionReferencia1}"
                                                    validatorExpression="#{FuncionParametroPorFuncion1.campoIdFuncionReferencia1_validate}"/>
                                                <webuijsf:staticText id="campoIdFuncionReferencia1Texto1"
                                                    binding="#{FuncionParametroPorFuncion1.campoIdFuncionReferencia1Texto1}"
                                                    text="#{currentRow.value['codigo_funcion_1x5y3']}"/>
                                                <webuijsf:message id="messageIdFuncionReferencia1"
                                                    for="campoIdFuncionReferencia1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdFuncionReferencia3" rendered="false"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdFuncionReferencia3"
                                                    text="#{currentRow.value['id_funcion_referencia']}"
                                                    rendered="#{FuncionParametroPorFuncion1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{FuncionParametroPorFuncion1.campoIdFuncionReferencia1Boton1}"
                                                    id="campoIdFuncionReferencia1Boton1"
                                                    onClick="#{FuncionParametroPorFuncion1.asistente.scriptCampoIdFuncionReferencia1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{FuncionParametroPorFuncion1.campoIdFuncionReferencia1Boton3}"
                                                    id="campoIdFuncionReferencia1Boton3"
                                                    onClick="#{FuncionParametroPorFuncion1.asistente.scriptCampoIdFuncionReferencia1Boton2}"
                                                    rendered="#{FuncionParametroPorFuncion1.asistente.campoIdFuncionReferencia1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{FuncionParametroPorFuncion1.tableColumnIdFuncionReferencia2}"
                                                    headerText="nombre funci&#243;n referencia"
                                                    id="tableColumnIdFuncionReferencia2" rendered="false"
                                                    sort="nombre_funcion_1x5y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdFuncionReferencia2"
                                                    text="#{currentRow.value['nombre_funcion_1x5y4']}"
                                                    rendered="#{FuncionParametroPorFuncion1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FuncionParametroPorFuncion1.labelIdFuncionReferencia2}"
                                                    id="labelIdFuncionReferencia2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{FuncionParametroPorFuncion1.campoIdFuncionReferencia1Hiper1}"
                                                    id="campoIdFuncionReferencia1Hiper1"
                                                    text="#{currentRow.value['nombre_funcion_1x5y4']}"
                                                    onClick="#{FuncionParametroPorFuncion1.asistente.scriptCampoIdFuncionReferencia1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdFuncionReferencia1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FuncionParametroPorFuncion1.tableColumnNumeroTipoValor1}"
                                                    headerText="tipo valor"
                                                    id="tableColumnNumeroTipoValor1" rendered="false"
                                                    sort="codigo_tipo_valor_1x6y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroTipoValor1"
                                                    text="#{currentRow.value['codigo_tipo_valor_1x6y2']}"
                                                    rendered="#{FuncionParametroPorFuncion1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FuncionParametroPorFuncion1.labelNumeroTipoValor1}"
                                                    id="labelNumeroTipoValor1"
                                                    for="listaNumeroTipoValor1"/>
                                                <webuijsf:dropDown id="listaNumeroTipoValor1"
                                                    binding="#{FuncionParametroPorFuncion1.listaNumeroTipoValor1}"
                                                    converter="#{FuncionParametroPorFuncion1.converterNumeroTipoValor1}"
                                                    disabled="#{FuncionParametroPorFuncion1.gestor.filaNoProcesada}" required="true"
                                                    items="#{FuncionParametroPorFuncion1.asistente.opcionesListaNumeroTipoValor1}"
                                                    selected="#{currentRow.value['numero_tipo_valor']}"
                                                    toolTip="BundleParametros.numero_tipo_valor.funcion_parametro"/>
                                                <webuijsf:staticText id="listaNumeroTipoValor1Texto1"
                                                    binding="#{FuncionParametroPorFuncion1.listaNumeroTipoValor1Texto1}"
                                                    text="#{currentRow.value['codigo_tipo_valor_1x6y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoValor1"
                                                    for="listaNumeroTipoValor1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FuncionParametroPorFuncion1.tableColumnIdListaValor1}"
                                                    headerText="identificaci&#243;n lista valor"
                                                    id="tableColumnIdListaValor1" rendered="false"
                                                    sort="id_lista_valor">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdListaValor1"
                                                    text="#{currentRow.value['id_lista_valor']}"
                                                    rendered="#{FuncionParametroPorFuncion1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FuncionParametroPorFuncion1.labelIdListaValor1}"
                                                    id="labelIdListaValor1"
                                                    for="campoIdListaValor1"/>
                                                <webuijsf:textField id="campoIdListaValor1"
                                                    binding="#{FuncionParametroPorFuncion1.campoIdListaValor1}"
                                                    converter="#{FuncionParametroPorFuncion1.converterIdListaValor1}"
                                                    readOnly="#{FuncionParametroPorFuncion1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['id_lista_valor']}"
                                                    toolTip="BundleParametros.id_lista_valor.funcion_parametro"
                                                    validatorExpression="#{FuncionParametroPorFuncion1.validatorIdListaValor1.validate}"/>
                                                <webuijsf:staticText id="campoIdListaValor1Texto1"
                                                    binding="#{FuncionParametroPorFuncion1.campoIdListaValor1Texto1}"
                                                    text="#{currentRow.value['id_lista_valor']}"/>
                                                <webuijsf:message id="messageIdListaValor1"
                                                    for="campoIdListaValor1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FuncionParametroPorFuncion1.tableColumnIdClaseObjetoValor1}"
                                                    headerText="identificaci&#243;n clase objeto valor"
                                                    id="tableColumnIdClaseObjetoValor1" rendered="false"
                                                    sort="id_clase_objeto_valor">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdClaseObjetoValor1"
                                                    text="#{currentRow.value['id_clase_objeto_valor']}"
                                                    rendered="#{FuncionParametroPorFuncion1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FuncionParametroPorFuncion1.labelIdClaseObjetoValor1}"
                                                    id="labelIdClaseObjetoValor1"
                                                    for="campoIdClaseObjetoValor1"/>
                                                <webuijsf:textField id="campoIdClaseObjetoValor1"
                                                    binding="#{FuncionParametroPorFuncion1.campoIdClaseObjetoValor1}"
                                                    converter="#{FuncionParametroPorFuncion1.converterIdClaseObjetoValor1}"
                                                    readOnly="#{FuncionParametroPorFuncion1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['id_clase_objeto_valor']}"
                                                    toolTip="BundleParametros.id_clase_objeto_valor.funcion_parametro"
                                                    validatorExpression="#{FuncionParametroPorFuncion1.validatorIdClaseObjetoValor1.validate}"/>
                                                <webuijsf:staticText id="campoIdClaseObjetoValor1Texto1"
                                                    binding="#{FuncionParametroPorFuncion1.campoIdClaseObjetoValor1Texto1}"
                                                    text="#{currentRow.value['id_clase_objeto_valor']}"/>
                                                <webuijsf:message id="messageIdClaseObjetoValor1"
                                                    for="campoIdClaseObjetoValor1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FuncionParametroPorFuncion1.tableColumnIdClaseRecursoValor1}"
                                                    headerText="clase recurso valor"
                                                    id="tableColumnIdClaseRecursoValor1" rendered="false"
                                                    sort="codigo_clase_recurso_1x7y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdClaseRecursoValor1"
                                                    text="#{currentRow.value['codigo_clase_recurso_1x7y3']}"
                                                    rendered="#{FuncionParametroPorFuncion1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FuncionParametroPorFuncion1.labelIdClaseRecursoValor1}"
                                                    id="labelIdClaseRecursoValor1"
                                                    for="campoIdClaseRecursoValor1"/>
                                                <webuijsf:textField id="campoIdClaseRecursoValor1"
                                                    binding="#{FuncionParametroPorFuncion1.campoIdClaseRecursoValor1}"
                                                    readOnly="#{FuncionParametroPorFuncion1.gestor.filaNoProcesada}"
                                                    text="#{FuncionParametroPorFuncion1.asistente.textoCampoIdClaseRecursoValor1}"
                                                    toolTip="#{FuncionParametroPorFuncion1.asistente.toolTipCampoIdClaseRecursoValor1}"
                                                    validatorExpression="#{FuncionParametroPorFuncion1.campoIdClaseRecursoValor1_validate}"/>
                                                <webuijsf:staticText id="campoIdClaseRecursoValor1Texto1"
                                                    binding="#{FuncionParametroPorFuncion1.campoIdClaseRecursoValor1Texto1}"
                                                    text="#{currentRow.value['codigo_clase_recurso_1x7y3']}"/>
                                                <webuijsf:message id="messageIdClaseRecursoValor1"
                                                    for="campoIdClaseRecursoValor1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdClaseRecursoValor3" rendered="false"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdClaseRecursoValor3"
                                                    text="#{currentRow.value['id_clase_recurso_valor']}"
                                                    rendered="#{FuncionParametroPorFuncion1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{FuncionParametroPorFuncion1.campoIdClaseRecursoValor1Boton1}"
                                                    id="campoIdClaseRecursoValor1Boton1"
                                                    onClick="#{FuncionParametroPorFuncion1.asistente.scriptCampoIdClaseRecursoValor1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{FuncionParametroPorFuncion1.campoIdClaseRecursoValor1Boton3}"
                                                    id="campoIdClaseRecursoValor1Boton3"
                                                    onClick="#{FuncionParametroPorFuncion1.asistente.scriptCampoIdClaseRecursoValor1Boton2}"
                                                    rendered="#{FuncionParametroPorFuncion1.asistente.campoIdClaseRecursoValor1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{FuncionParametroPorFuncion1.tableColumnIdClaseRecursoValor2}"
                                                    headerText="nombre clase recurso valor"
                                                    id="tableColumnIdClaseRecursoValor2" rendered="false"
                                                    sort="nombre_clase_recurso_1x7y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdClaseRecursoValor2"
                                                    text="#{currentRow.value['nombre_clase_recurso_1x7y4']}"
                                                    rendered="#{FuncionParametroPorFuncion1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FuncionParametroPorFuncion1.labelIdClaseRecursoValor2}"
                                                    id="labelIdClaseRecursoValor2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{FuncionParametroPorFuncion1.campoIdClaseRecursoValor1Hiper1}"
                                                    id="campoIdClaseRecursoValor1Hiper1"
                                                    text="#{currentRow.value['nombre_clase_recurso_1x7y4']}"
                                                    onClick="#{FuncionParametroPorFuncion1.asistente.scriptCampoIdClaseRecursoValor1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdClaseRecursoValor1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FuncionParametroPorFuncion1.tableColumnValorMinimo1}"
                                                    headerText="valor minimo"
                                                    id="tableColumnValorMinimo1" rendered="false"
                                                    sort="valor_minimo">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextValorMinimo1"
                                                    text="#{currentRow.value['valor_minimo']}"
                                                    rendered="#{FuncionParametroPorFuncion1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FuncionParametroPorFuncion1.labelValorMinimo1}"
                                                    id="labelValorMinimo1"
                                                    for="campoValorMinimo1"/>
                                                <webuijsf:textField id="campoValorMinimo1"
                                                    binding="#{FuncionParametroPorFuncion1.campoValorMinimo1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{FuncionParametroPorFuncion1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['valor_minimo']}"
                                                    toolTip="BundleParametros.valor_minimo.funcion_parametro"
                                                    validatorExpression="#{FuncionParametroPorFuncion1.validatorValorMinimo1.validate}"/>
                                                <webuijsf:staticText id="campoValorMinimo1Texto1"
                                                    binding="#{FuncionParametroPorFuncion1.campoValorMinimo1Texto1}"
                                                    text="#{currentRow.value['valor_minimo']}"/>
                                                <webuijsf:message id="messageValorMinimo1"
                                                    for="campoValorMinimo1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FuncionParametroPorFuncion1.tableColumnValorMaximo1}"
                                                    headerText="valor maximo"
                                                    id="tableColumnValorMaximo1" rendered="false"
                                                    sort="valor_maximo">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextValorMaximo1"
                                                    text="#{currentRow.value['valor_maximo']}"
                                                    rendered="#{FuncionParametroPorFuncion1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FuncionParametroPorFuncion1.labelValorMaximo1}"
                                                    id="labelValorMaximo1"
                                                    for="campoValorMaximo1"/>
                                                <webuijsf:textField id="campoValorMaximo1"
                                                    binding="#{FuncionParametroPorFuncion1.campoValorMaximo1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{FuncionParametroPorFuncion1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['valor_maximo']}"
                                                    toolTip="BundleParametros.valor_maximo.funcion_parametro"
                                                    validatorExpression="#{FuncionParametroPorFuncion1.validatorValorMaximo1.validate}"/>
                                                <webuijsf:staticText id="campoValorMaximo1Texto1"
                                                    binding="#{FuncionParametroPorFuncion1.campoValorMaximo1Texto1}"
                                                    text="#{currentRow.value['valor_maximo']}"/>
                                                <webuijsf:message id="messageValorMaximo1"
                                                    for="campoValorMaximo1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FuncionParametroPorFuncion1.tableColumnValorOmision1}"
                                                    headerText="valor omisi&#243;n"
                                                    id="tableColumnValorOmision1" rendered="false"
                                                    sort="valor_omision">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextValorOmision1"
                                                    text="#{currentRow.value['valor_omision']}"
                                                    rendered="#{FuncionParametroPorFuncion1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FuncionParametroPorFuncion1.labelValorOmision1}"
                                                    id="labelValorOmision1"
                                                    for="campoValorOmision1"/>
                                                <webuijsf:textField id="campoValorOmision1"
                                                    binding="#{FuncionParametroPorFuncion1.campoValorOmision1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{FuncionParametroPorFuncion1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['valor_omision']}"
                                                    toolTip="BundleParametros.valor_omision.funcion_parametro"
                                                    validatorExpression="#{FuncionParametroPorFuncion1.validatorValorOmision1.validate}"/>
                                                <webuijsf:staticText id="campoValorOmision1Texto1"
                                                    binding="#{FuncionParametroPorFuncion1.campoValorOmision1Texto1}"
                                                    text="#{currentRow.value['valor_omision']}"/>
                                                <webuijsf:message id="messageValorOmision1"
                                                    for="campoValorOmision1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FuncionParametroPorFuncion1.tableColumnEsParametroSinRastro1}"
                                                    headerText="parametro sin rastro"
                                                    id="tableColumnEsParametroSinRastro1" rendered="false"
                                                    sort="es_parametro_sin_rastro">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsParametroSinRastro1"
                                                    text="#{currentRow.value['es_parametro_sin_rastro']}"
                                                    rendered="#{FuncionParametroPorFuncion1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FuncionParametroPorFuncion1.labelEsParametroSinRastro1}"
                                                    id="labelEsParametroSinRastro1"
                                                    for="listaEsParametroSinRastro1"/>
                                                <webuijsf:dropDown id="listaEsParametroSinRastro1"
                                                    binding="#{FuncionParametroPorFuncion1.listaEsParametroSinRastro1}"
                                                    converter="#{FuncionParametroPorFuncion1.converterEsParametroSinRastro1}"
                                                    disabled="#{FuncionParametroPorFuncion1.gestor.filaNoProcesada}" required="true"
                                                    items="#{FuncionParametroPorFuncion1.asistente.opcionesListaEsParametroSinRastro1}"
                                                    selected="#{currentRow.value['es_parametro_sin_rastro']}"
                                                    toolTip="BundleParametros.es_parametro_sin_rastro.funcion_parametro"/>
                                                <webuijsf:staticText id="listaEsParametroSinRastro1Texto1"
                                                    binding="#{FuncionParametroPorFuncion1.listaEsParametroSinRastro1Texto1}"/>
                                                <webuijsf:message id="messageEsParametroSinRastro1"
                                                    for="listaEsParametroSinRastro1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FuncionParametroPorFuncion1.tableColumnEsParametroSegmento1}"
                                                    headerText="parametro segmento"
                                                    id="tableColumnEsParametroSegmento1" rendered="false"
                                                    sort="es_parametro_segmento">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsParametroSegmento1"
                                                    text="#{currentRow.value['es_parametro_segmento']}"
                                                    rendered="#{FuncionParametroPorFuncion1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FuncionParametroPorFuncion1.labelEsParametroSegmento1}"
                                                    id="labelEsParametroSegmento1"
                                                    for="listaEsParametroSegmento1"/>
                                                <webuijsf:dropDown id="listaEsParametroSegmento1"
                                                    binding="#{FuncionParametroPorFuncion1.listaEsParametroSegmento1}"
                                                    converter="#{FuncionParametroPorFuncion1.converterEsParametroSegmento1}"
                                                    disabled="#{FuncionParametroPorFuncion1.gestor.filaNoProcesada}" required="true"
                                                    items="#{FuncionParametroPorFuncion1.asistente.opcionesListaEsParametroSegmento1}"
                                                    selected="#{currentRow.value['es_parametro_segmento']}"
                                                    toolTip="BundleParametros.es_parametro_segmento.funcion_parametro"/>
                                                <webuijsf:staticText id="listaEsParametroSegmento1Texto1"
                                                    binding="#{FuncionParametroPorFuncion1.listaEsParametroSegmento1Texto1}"/>
                                                <webuijsf:message id="messageEsParametroSegmento1"
                                                    for="listaEsParametroSegmento1"/>
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
                                                        binding="#{FuncionParametroPorFuncion1.etiquetaTextoFilasPorPagina1}" 
                                                        for="textoFilasPorPagina1"
                                                        id="etiquetaTextoFilasPorPagina1" 
                                                        text="#{FuncionParametroPorFuncion1.gestor.i18n.textoEtiquetaTextoFilasPorPagina}"/>
                                                </h:panelGrid>
                                                <h:panelGrid 
                                                    columns="3" 
                                                    id="gridPanel107">
                                                    <webuijsf:textField 
                                                        binding="#{FuncionParametroPorFuncion1.textoFilasPorPagina1}" 
                                                        columns="2"
                                                        converter="#{FuncionParametroPorFuncion1.textoFilasPorPagina1Converter1}"
                                                        disabled="#{FuncionParametroPorFuncion1.gestor.paginacionInhabilitada}" 
                                                        id="textoFilasPorPagina1" maxLength="2"
                                                        text="#{FuncionParametroPorFuncion1.gestor.filasPorPagina}" 
                                                        validatorExpression="#{FuncionParametroPorFuncion1.textoFilasPorPagina1Validator1.validate}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{FuncionParametroPorFuncion1.botonRepaginar1_action}"
                                                        binding="#{FuncionParametroPorFuncion1.botonRepaginar1}" 
                                                        id="botonRepaginar1"
                                                        imageURL="#{FuncionParametroPorFuncion1.gestor.urlImagenRepaginar}" 
                                                        onClick="#{FuncionParametroPorFuncion1.gestor.scriptRepaginar}"
                                                        text="#{FuncionParametroPorFuncion1.gestor.i18n.textoBotonRepaginar}"
                                                        toolTip="#{FuncionParametroPorFuncion1.gestor.i18n.toolTipBotonRepaginar}"/>
                                                    <webuijsf:message 
                                                        for="textoFilasPorPagina1" 
                                                        id="messageFilasPorPagina1"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="13"
                                                id="gridPanel108">
                                                <webuijsf:button
                                                    actionExpression="#{FuncionParametroPorFuncion1.botonAgregar1_action}"
                                                    binding="#{FuncionParametroPorFuncion1.botonAgregar1}"
                                                    disabled="#{FuncionParametroPorFuncion1.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{FuncionParametroPorFuncion1.gestor.scriptAgregar}"
                                                    rendered="#{FuncionParametroPorFuncion1.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FuncionParametroPorFuncion1.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{FuncionParametroPorFuncion1.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{FuncionParametroPorFuncion1.listaFuncionEdicion1}"
                                                    converter="#{FuncionParametroPorFuncion1.converterListaFuncionEdicion1}"
                                                    disabled="#{FuncionParametroPorFuncion1.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{FuncionParametroPorFuncion1.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{FuncionParametroPorFuncion1.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{FuncionParametroPorFuncion1.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{FuncionParametroPorFuncion1.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FuncionParametroPorFuncion1.botonEditar1_action}"
                                                    binding="#{FuncionParametroPorFuncion1.botonEditar1}"
                                                    disabled="#{FuncionParametroPorFuncion1.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{FuncionParametroPorFuncion1.gestor.scriptEditar}"
                                                    rendered="#{FuncionParametroPorFuncion1.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FuncionParametroPorFuncion1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{FuncionParametroPorFuncion1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FuncionParametroPorFuncion1.botonEliminar1_action}"
                                                    binding="#{FuncionParametroPorFuncion1.botonEliminar1}"
                                                    disabled="#{FuncionParametroPorFuncion1.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{FuncionParametroPorFuncion1.gestor.scriptEliminar}"
                                                    rendered="#{FuncionParametroPorFuncion1.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FuncionParametroPorFuncion1.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{FuncionParametroPorFuncion1.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FuncionParametroPorFuncion1.botonAplicar1_action}"
                                                    binding="#{FuncionParametroPorFuncion1.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{FuncionParametroPorFuncion1.gestor.scriptAplicar}"
                                                    rendered="#{FuncionParametroPorFuncion1.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FuncionParametroPorFuncion1.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{FuncionParametroPorFuncion1.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FuncionParametroPorFuncion1.botonDeshacer1_action}"
                                                    binding="#{FuncionParametroPorFuncion1.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{FuncionParametroPorFuncion1.gestor.scriptDeshacer}"
                                                    rendered="#{FuncionParametroPorFuncion1.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FuncionParametroPorFuncion1.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{FuncionParametroPorFuncion1.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FuncionParametroPorFuncion1.botonConfirmar1_action}"
                                                    binding="#{FuncionParametroPorFuncion1.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{FuncionParametroPorFuncion1.gestor.scriptConfirmar}"
                                                    rendered="#{FuncionParametroPorFuncion1.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FuncionParametroPorFuncion1.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{FuncionParametroPorFuncion1.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FuncionParametroPorFuncion1.botonDescartar1_action}"
                                                    binding="#{FuncionParametroPorFuncion1.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{FuncionParametroPorFuncion1.gestor.scriptDescartar}"
                                                    rendered="#{FuncionParametroPorFuncion1.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FuncionParametroPorFuncion1.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{FuncionParametroPorFuncion1.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{FuncionParametroPorFuncion1.listaFuncionAccion1}"
                                                    converter="#{FuncionParametroPorFuncion1.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{FuncionParametroPorFuncion1.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{FuncionParametroPorFuncion1.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{FuncionParametroPorFuncion1.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{FuncionParametroPorFuncion1.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FuncionParametroPorFuncion1.botonProcesar1_action}"
                                                    binding="#{FuncionParametroPorFuncion1.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{FuncionParametroPorFuncion1.gestor.scriptProcesar}"
                                                    rendered="#{FuncionParametroPorFuncion1.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FuncionParametroPorFuncion1.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{FuncionParametroPorFuncion1.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FuncionParametroPorFuncion1.botonRefrescar1_action}"
                                                    binding="#{FuncionParametroPorFuncion1.botonRefrescar1}"
                                                    disabled="#{FuncionParametroPorFuncion1.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{FuncionParametroPorFuncion1.gestor.scriptRefrescar}"
                                                    rendered="#{FuncionParametroPorFuncion1.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FuncionParametroPorFuncion1.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{FuncionParametroPorFuncion1.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FuncionParametroPorFuncion1.botonReconsultar1_action}"
                                                    binding="#{FuncionParametroPorFuncion1.botonReconsultar1}"
                                                    disabled="#{FuncionParametroPorFuncion1.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{FuncionParametroPorFuncion1.gestor.scriptReconsultar}"
                                                    rendered="#{FuncionParametroPorFuncion1.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FuncionParametroPorFuncion1.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{FuncionParametroPorFuncion1.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FuncionParametroPorFuncion1.botonRetornar1_action}"
                                                    binding="#{FuncionParametroPorFuncion1.botonRetornar1}"
                                                    disabled="#{FuncionParametroPorFuncion1.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{FuncionParametroPorFuncion1.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{FuncionParametroPorFuncion1.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FuncionParametroPorFuncion1.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{FuncionParametroPorFuncion1.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel109"
                                                rendered="#{FuncionParametroPorFuncion1.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{FuncionParametroPorFuncion1.imageHyperlink1_action}"
                                                    binding="#{FuncionParametroPorFuncion1.imageHyperlink1}"
                                                    disabled="#{FuncionParametroPorFuncion1.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{FuncionParametroPorFuncion1.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{FuncionParametroPorFuncion1.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{FuncionParametroPorFuncion1.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.FuncionParametroPorFuncion1_imageHyperlink1_toolTip}"/>
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
