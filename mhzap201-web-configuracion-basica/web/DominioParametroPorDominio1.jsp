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
                    focus="#{DominioParametroPorDominio1.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{DominioParametroPorDominio1.gestor.preserveFocus}"
                    preserveScroll="#{DominioParametroPorDominio1.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{DominioParametroPorDominio1.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | checkbox1 campoIdDominioParametro1 campoIdParametro1 listaNumeroTipoParametroDom1 campoEtiquetaParametro1 textoFilasPorPagina1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | textoFilasPorPagina1 | botonRepaginar1 , virtualForm3 | checkbox1 listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonEscogerFila1 botonDetallarFila1 botonProcesarFila1 botonRetornarFila1 botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{DominioParametroPorDominio1.breadcrumbs1}" 
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
                                                    rendered="#{DominioParametroPorDominio1.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{DominioParametroPorDominio1.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{DominioParametroPorDominio1.gestor.mensajeDisponible}"
                                                    text="#{DominioParametroPorDominio1.gestor.mensaje}"
                                                    url="#{DominioParametroPorDominio1.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:table
                                            binding="#{DominioParametroPorDominio1.table1}"
                                            clearSortButton="true" 
                                            deselectMultipleButton="true" 
                                            id="table1"
                                            paginateButton="false"
                                            paginationControls="true" 
                                            selectMultipleButton="true" 
                                            sortPanelToggleButton="true"
                                            width="960">
                                            <webuijsf:tableRowGroup 
                                                binding="#{DominioParametroPorDominio1.tableRowGroup1}" 
                                                id="tableRowGroup1" 
                                                rows="1"
                                                selected="#{DominioParametroPorDominio1.gestor.filaEscogida}" 
                                                sourceData="#{DominioParametroPorDominio1.dominioParametroDataProvider}" 
                                                sourceVar="currentRow">
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    id="tableRowGroup1SelectionColumn"
                                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);" 
                                                    selectId="checkbox1">
                                                    <webuijsf:checkbox 
                                                        binding="#{DominioParametroPorDominio1.checkbox1}" 
                                                        id="checkbox1"
                                                        onClick="#{DominioParametroPorDominio1.gestor.scriptElegir}" 
                                                        selected="#{DominioParametroPorDominio1.gestor.filaElegida}" 
                                                        toolTip="#{DominioParametroPorDominio1.gestor.i18n.toolTipCheckboxSeleccionMultiple}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    binding="#{DominioParametroPorDominio1.tableColumn1}" 
                                                    id="tableColumn1">
                                                    <webuijsf:button 
                                                        actionExpression="#{DominioParametroPorDominio1.botonEscogerFila1_action}"
                                                        binding="#{DominioParametroPorDominio1.botonEscogerFila1}"
                                                        disabled="#{DominioParametroPorDominio1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonEscogerFila1"
                                                        imageURL="#{DominioParametroPorDominio1.gestor.urlImagenEscoger}" 
                                                        onClick="#{DominioParametroPorDominio1.gestor.scriptEscoger}"
                                                        text="#{DominioParametroPorDominio1.gestor.i18n.textoBotonEscogerFila}"
                                                        toolTip="#{DominioParametroPorDominio1.gestor.i18n.toolTipBotonEscogerFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{DominioParametroPorDominio1.botonDetallarFila1_action}"
                                                        binding="#{DominioParametroPorDominio1.botonDetallarFila1}"
                                                        disabled="#{DominioParametroPorDominio1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonDetallarFila1"
                                                        imageURL="#{DominioParametroPorDominio1.gestor.urlImagenDetallar}" 
                                                        onClick="#{DominioParametroPorDominio1.scriptAbrirVentanaVerDetalle}"
                                                        rendered="#{DominioParametroPorDominio1.gestor.detalleDisponible}" 
                                                        text="#{DominioParametroPorDominio1.gestor.i18n.textoBotonDetallarFila}"
                                                        toolTip="#{DominioParametroPorDominio1.gestor.i18n.toolTipBotonDetallarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{DominioParametroPorDominio1.botonProcesarFila1_action}"
                                                        binding="#{DominioParametroPorDominio1.botonProcesarFila1}"
                                                        disabled="#{DominioParametroPorDominio1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonProcesarFila1"
                                                        imageURL="#{DominioParametroPorDominio1.gestor.urlImagenProcesar}" 
                                                        onClick="#{DominioParametroPorDominio1.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{DominioParametroPorDominio1.asistente.comandoDisponible}" 
                                                        text="#{DominioParametroPorDominio1.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{DominioParametroPorDominio1.gestor.i18n.toolTipBotonProcesarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{DominioParametroPorDominio1.botonRetornarFila1_action}"
                                                        binding="#{DominioParametroPorDominio1.botonRetornarFila1}" 
                                                        disabled="#{DominioParametroPorDominio1.gestor.funcionReturnInhabilitada}"
                                                        id="botonRetornarFila1"
                                                        imageURL="#{DominioParametroPorDominio1.gestor.urlImagenRetornar}"
                                                        onClick="#{DominioParametroPorDominio1.gestor.scriptRetornarRecursoActual}"
                                                        rendered="#{DominioParametroPorDominio1.gestor.funcionReturnVisible}" 
                                                        text="#{DominioParametroPorDominio1.gestor.i18n.textoBotonRetornarFila}"
                                                        toolTip="#{DominioParametroPorDominio1.gestor.i18n.toolTipBotonRetornarFila}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{DominioParametroPorDominio1.tableColumn2}"
                                                    id="tableColumn2"
                                                    rendered="#{DominioParametroPorDominio1.gestor.designing}">
                                                    <webuijsf:imageHyperlink
                                                        actionExpression="#{DominioParametroPorDominio1.hipervinculoAccionFila1_action}"
                                                        binding="#{DominioParametroPorDominio1.hipervinculoAccionFila1}"
                                                        disabled="#{DominioParametroPorDominio1.gestor.loteConCambios}"
                                                        id="hipervinculoAccionFila1"
                                                        imageURL="#{DominioParametroPorDominio1.gestor.urlImagenEjecutarVinculo}"
                                                        onClick="#{DominioParametroPorDominio1.scriptAbrirVentanaAccionFila1}"
                                                        text="Accion1"
                                                        toolTip="#{bundle.DominioParametroPorDominio1_hipervinculoAccionFila1_toolTip}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="right" 
                                                    binding="#{DominioParametroPorDominio1.tableColumn3}" 
                                                    headerText="#{DominioParametroPorDominio1.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{DominioParametroPorDominio1.gestor.i18n.toolTipEtiquetaIdentificacionFila}"
                                                    id="tableColumn3">
                                                    <webuijsf:imageHyperlink 
                                                        actionExpression="#{DominioParametroPorDominio1.hipervinculoDetallarFila1_action}"
                                                        binding="#{DominioParametroPorDominio1.hipervinculoDetallarFila1}" 
                                                        id="hipervinculoDetallarFila1"
                                                        imageURL="#{DominioParametroPorDominio1.gestor.urlImagenFilaProcesada}"
                                                        textPosition="left" 
                                                        text="#{DominioParametroPorDominio1.gestor.identificacionFila}" 
                                                        toolTip="#{DominioParametroPorDominio1.gestor.toolTipImagenFilaProcesada}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{DominioParametroPorDominio1.tableColumnIdDominioParametro1}"
                                                    toolTip="BundleParametros.id_dominio_parametro.dominio_parametro"
                                                    headerText="identificaci&#243;n"
                                                    id="tableColumnIdDominioParametro1"
                                                    sort="id_dominio_parametro">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdDominioParametro1"
                                                    text="#{currentRow.value['id_dominio_parametro']}"
                                                    rendered="#{DominioParametroPorDominio1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{DominioParametroPorDominio1.labelIdDominioParametro1}"
                                                    id="labelIdDominioParametro1"
                                                    for="campoIdDominioParametro1"/>
                                                <webuijsf:textField id="campoIdDominioParametro1"
                                                    binding="#{DominioParametroPorDominio1.campoIdDominioParametro1}"
                                                    converter="#{DominioParametroPorDominio1.converterIdDominioParametro1}"
                                                    readOnly="#{DominioParametroPorDominio1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['id_dominio_parametro']}"
                                                    toolTip="BundleParametros.id_dominio_parametro.dominio_parametro"
                                                    validatorExpression="#{DominioParametroPorDominio1.validatorIdDominioParametro1.validate}"/>
                                                <webuijsf:staticText id="campoIdDominioParametro1Texto1"
                                                    binding="#{DominioParametroPorDominio1.campoIdDominioParametro1Texto1}"
                                                    text="#{currentRow.value['id_dominio_parametro']}"/>
                                                <webuijsf:message id="messageIdDominioParametro1"
                                                    for="campoIdDominioParametro1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{DominioParametroPorDominio1.tableColumnIdParametro1}"
                                                    toolTip="BundleParametros.id_parametro.dominio_parametro"
                                                    headerText="parametro"
                                                    id="tableColumnIdParametro1"
                                                    sort="codigo_parametro_1x2y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdParametro1"
                                                    text="#{currentRow.value['codigo_parametro_1x2y3']}"
                                                    rendered="#{DominioParametroPorDominio1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{DominioParametroPorDominio1.labelIdParametro1}"
                                                    id="labelIdParametro1"
                                                    for="campoIdParametro1"/>
                                                <webuijsf:textField id="campoIdParametro1"
                                                    binding="#{DominioParametroPorDominio1.campoIdParametro1}"
                                                    readOnly="#{DominioParametroPorDominio1.gestor.filaNoProcesada}" required="true"
                                                    text="#{DominioParametroPorDominio1.asistente.textoCampoIdParametro1}"
                                                    toolTip="#{DominioParametroPorDominio1.asistente.toolTipCampoIdParametro1}"
                                                    validatorExpression="#{DominioParametroPorDominio1.campoIdParametro1_validate}"/>
                                                <webuijsf:staticText id="campoIdParametro1Texto1"
                                                    binding="#{DominioParametroPorDominio1.campoIdParametro1Texto1}"
                                                    text="#{currentRow.value['codigo_parametro_1x2y3']}"/>
                                                <webuijsf:message id="messageIdParametro1"
                                                    for="campoIdParametro1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdParametro3"
                                                    rendered="#{DominioParametroPorDominio1.asistente.tableColumnIdParametro3Rendered}"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdParametro3"
                                                    text="#{currentRow.value['id_parametro']}"
                                                    rendered="#{DominioParametroPorDominio1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{DominioParametroPorDominio1.campoIdParametro1Boton1}"
                                                    id="campoIdParametro1Boton1"
                                                    onClick="#{DominioParametroPorDominio1.asistente.scriptCampoIdParametro1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{DominioParametroPorDominio1.campoIdParametro1Boton3}"
                                                    id="campoIdParametro1Boton3"
                                                    onClick="#{DominioParametroPorDominio1.asistente.scriptCampoIdParametro1Boton2}"
                                                    rendered="#{DominioParametroPorDominio1.asistente.campoIdParametro1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{DominioParametroPorDominio1.tableColumnIdParametro2}"
                                                    headerText="nombre parametro"
                                                    id="tableColumnIdParametro2"
                                                    rendered="#{DominioParametroPorDominio1.asistente.campoIdParametro1Boton2Rendered}"
                                                    sort="nombre_parametro_1x2y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdParametro2"
                                                    text="#{currentRow.value['nombre_parametro_1x2y4']}"
                                                    rendered="#{DominioParametroPorDominio1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{DominioParametroPorDominio1.labelIdParametro2}"
                                                    id="labelIdParametro2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{DominioParametroPorDominio1.campoIdParametro1Hiper1}"
                                                    id="campoIdParametro1Hiper1"
                                                    text="#{currentRow.value['nombre_parametro_1x2y4']}"
                                                    onClick="#{DominioParametroPorDominio1.asistente.scriptCampoIdParametro1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdParametro1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{DominioParametroPorDominio1.tableColumnNumeroTipoParametroDom1}"
                                                    toolTip="BundleParametros.numero_tipo_parametro_dom.dominio_parametro"
                                                    headerText="tipo parametro dom"
                                                    id="tableColumnNumeroTipoParametroDom1"
                                                    sort="codigo_tipo_parametro_do_1x3y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroTipoParametroDom1"
                                                    text="#{currentRow.value['codigo_tipo_parametro_do_1x3y2']}"
                                                    rendered="#{DominioParametroPorDominio1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{DominioParametroPorDominio1.labelNumeroTipoParametroDom1}"
                                                    id="labelNumeroTipoParametroDom1"
                                                    for="listaNumeroTipoParametroDom1"/>
                                                <webuijsf:dropDown id="listaNumeroTipoParametroDom1"
                                                    binding="#{DominioParametroPorDominio1.listaNumeroTipoParametroDom1}"
                                                    converter="#{DominioParametroPorDominio1.converterNumeroTipoParametroDom1}"
                                                    disabled="#{DominioParametroPorDominio1.gestor.filaNoProcesada}" required="true"
                                                    items="#{DominioParametroPorDominio1.asistente.opcionesListaNumeroTipoParametroDom1}"
                                                    selected="#{currentRow.value['numero_tipo_parametro_dom']}"
                                                    toolTip="BundleParametros.numero_tipo_parametro_dom.dominio_parametro"/>
                                                <webuijsf:staticText id="listaNumeroTipoParametroDom1Texto1"
                                                    binding="#{DominioParametroPorDominio1.listaNumeroTipoParametroDom1Texto1}"
                                                    text="#{currentRow.value['codigo_tipo_parametro_do_1x3y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoParametroDom1"
                                                    for="listaNumeroTipoParametroDom1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{DominioParametroPorDominio1.tableColumnEtiquetaParametro1}"
                                                    toolTip="BundleParametros.etiqueta_parametro.dominio_parametro"
                                                    headerText="etiqueta parametro"
                                                    id="tableColumnEtiquetaParametro1" rendered="false"
                                                    sort="etiqueta_parametro">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEtiquetaParametro1"
                                                    text="#{currentRow.value['etiqueta_parametro']}"
                                                    rendered="#{DominioParametroPorDominio1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{DominioParametroPorDominio1.labelEtiquetaParametro1}"
                                                    id="labelEtiquetaParametro1"
                                                    for="campoEtiquetaParametro1"/>
                                                <webuijsf:textField id="campoEtiquetaParametro1"
                                                    binding="#{DominioParametroPorDominio1.campoEtiquetaParametro1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{DominioParametroPorDominio1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['etiqueta_parametro']}"
                                                    toolTip="BundleParametros.etiqueta_parametro.dominio_parametro"
                                                    validatorExpression="#{DominioParametroPorDominio1.validatorEtiquetaParametro1.validate}"/>
                                                <webuijsf:staticText id="campoEtiquetaParametro1Texto1"
                                                    binding="#{DominioParametroPorDominio1.campoEtiquetaParametro1Texto1}"
                                                    text="#{currentRow.value['etiqueta_parametro']}"/>
                                                <webuijsf:message id="messageEtiquetaParametro1"
                                                    for="campoEtiquetaParametro1"/>
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
                                                        binding="#{DominioParametroPorDominio1.etiquetaTextoFilasPorPagina1}" 
                                                        for="textoFilasPorPagina1"
                                                        id="etiquetaTextoFilasPorPagina1" 
                                                        text="#{DominioParametroPorDominio1.gestor.i18n.textoEtiquetaTextoFilasPorPagina}"/>
                                                </h:panelGrid>
                                                <h:panelGrid 
                                                    columns="3" 
                                                    id="gridPanel107">
                                                    <webuijsf:textField 
                                                        binding="#{DominioParametroPorDominio1.textoFilasPorPagina1}" 
                                                        columns="2"
                                                        converter="#{DominioParametroPorDominio1.textoFilasPorPagina1Converter1}"
                                                        disabled="#{DominioParametroPorDominio1.gestor.paginacionInhabilitada}" 
                                                        id="textoFilasPorPagina1" maxLength="2"
                                                        text="#{DominioParametroPorDominio1.gestor.filasPorPagina}" 
                                                        validatorExpression="#{DominioParametroPorDominio1.textoFilasPorPagina1Validator1.validate}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{DominioParametroPorDominio1.botonRepaginar1_action}"
                                                        binding="#{DominioParametroPorDominio1.botonRepaginar1}" 
                                                        id="botonRepaginar1"
                                                        imageURL="#{DominioParametroPorDominio1.gestor.urlImagenRepaginar}" 
                                                        onClick="#{DominioParametroPorDominio1.gestor.scriptRepaginar}"
                                                        text="#{DominioParametroPorDominio1.gestor.i18n.textoBotonRepaginar}"
                                                        toolTip="#{DominioParametroPorDominio1.gestor.i18n.toolTipBotonRepaginar}"/>
                                                    <webuijsf:message 
                                                        for="textoFilasPorPagina1" 
                                                        id="messageFilasPorPagina1"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="13"
                                                id="gridPanel108">
                                                <webuijsf:button
                                                    actionExpression="#{DominioParametroPorDominio1.botonAgregar1_action}"
                                                    binding="#{DominioParametroPorDominio1.botonAgregar1}"
                                                    disabled="#{DominioParametroPorDominio1.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{DominioParametroPorDominio1.gestor.scriptAgregar}"
                                                    rendered="#{DominioParametroPorDominio1.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{DominioParametroPorDominio1.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{DominioParametroPorDominio1.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{DominioParametroPorDominio1.listaFuncionEdicion1}"
                                                    converter="#{DominioParametroPorDominio1.converterListaFuncionEdicion1}"
                                                    disabled="#{DominioParametroPorDominio1.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{DominioParametroPorDominio1.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{DominioParametroPorDominio1.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{DominioParametroPorDominio1.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{DominioParametroPorDominio1.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{DominioParametroPorDominio1.botonEditar1_action}"
                                                    binding="#{DominioParametroPorDominio1.botonEditar1}"
                                                    disabled="#{DominioParametroPorDominio1.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{DominioParametroPorDominio1.gestor.scriptEditar}"
                                                    rendered="#{DominioParametroPorDominio1.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{DominioParametroPorDominio1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{DominioParametroPorDominio1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{DominioParametroPorDominio1.botonEliminar1_action}"
                                                    binding="#{DominioParametroPorDominio1.botonEliminar1}"
                                                    disabled="#{DominioParametroPorDominio1.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{DominioParametroPorDominio1.gestor.scriptEliminar}"
                                                    rendered="#{DominioParametroPorDominio1.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{DominioParametroPorDominio1.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{DominioParametroPorDominio1.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{DominioParametroPorDominio1.botonAplicar1_action}"
                                                    binding="#{DominioParametroPorDominio1.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{DominioParametroPorDominio1.gestor.scriptAplicar}"
                                                    rendered="#{DominioParametroPorDominio1.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{DominioParametroPorDominio1.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{DominioParametroPorDominio1.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{DominioParametroPorDominio1.botonDeshacer1_action}"
                                                    binding="#{DominioParametroPorDominio1.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{DominioParametroPorDominio1.gestor.scriptDeshacer}"
                                                    rendered="#{DominioParametroPorDominio1.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{DominioParametroPorDominio1.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{DominioParametroPorDominio1.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{DominioParametroPorDominio1.botonConfirmar1_action}"
                                                    binding="#{DominioParametroPorDominio1.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{DominioParametroPorDominio1.gestor.scriptConfirmar}"
                                                    rendered="#{DominioParametroPorDominio1.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{DominioParametroPorDominio1.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{DominioParametroPorDominio1.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{DominioParametroPorDominio1.botonDescartar1_action}"
                                                    binding="#{DominioParametroPorDominio1.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{DominioParametroPorDominio1.gestor.scriptDescartar}"
                                                    rendered="#{DominioParametroPorDominio1.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{DominioParametroPorDominio1.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{DominioParametroPorDominio1.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{DominioParametroPorDominio1.listaFuncionAccion1}"
                                                    converter="#{DominioParametroPorDominio1.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{DominioParametroPorDominio1.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{DominioParametroPorDominio1.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{DominioParametroPorDominio1.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{DominioParametroPorDominio1.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{DominioParametroPorDominio1.botonProcesar1_action}"
                                                    binding="#{DominioParametroPorDominio1.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{DominioParametroPorDominio1.gestor.scriptProcesar}"
                                                    rendered="#{DominioParametroPorDominio1.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{DominioParametroPorDominio1.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{DominioParametroPorDominio1.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{DominioParametroPorDominio1.botonRefrescar1_action}"
                                                    binding="#{DominioParametroPorDominio1.botonRefrescar1}"
                                                    disabled="#{DominioParametroPorDominio1.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{DominioParametroPorDominio1.gestor.scriptRefrescar}"
                                                    rendered="#{DominioParametroPorDominio1.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{DominioParametroPorDominio1.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{DominioParametroPorDominio1.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{DominioParametroPorDominio1.botonReconsultar1_action}"
                                                    binding="#{DominioParametroPorDominio1.botonReconsultar1}"
                                                    disabled="#{DominioParametroPorDominio1.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{DominioParametroPorDominio1.gestor.scriptReconsultar}"
                                                    rendered="#{DominioParametroPorDominio1.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{DominioParametroPorDominio1.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{DominioParametroPorDominio1.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{DominioParametroPorDominio1.botonRetornar1_action}"
                                                    binding="#{DominioParametroPorDominio1.botonRetornar1}"
                                                    disabled="#{DominioParametroPorDominio1.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{DominioParametroPorDominio1.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{DominioParametroPorDominio1.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{DominioParametroPorDominio1.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{DominioParametroPorDominio1.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel109"
                                                rendered="#{DominioParametroPorDominio1.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{DominioParametroPorDominio1.imageHyperlink1_action}"
                                                    binding="#{DominioParametroPorDominio1.imageHyperlink1}"
                                                    disabled="#{DominioParametroPorDominio1.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{DominioParametroPorDominio1.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{DominioParametroPorDominio1.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{DominioParametroPorDominio1.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.DominioParametroPorDominio1_imageHyperlink1_toolTip}"/>
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
