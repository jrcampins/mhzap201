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
                    focus="#{PaginaFuncionPorPagina1.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{PaginaFuncionPorPagina1.gestor.preserveFocus}"
                    preserveScroll="#{PaginaFuncionPorPagina1.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{PaginaFuncionPorPagina1.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | checkbox1 campoIdPaginaFuncion1 campoIdFuncion1 listaEsFuncionInicial1 campoControlPaginaFuncion1 textoFilasPorPagina1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | textoFilasPorPagina1 | botonRepaginar1 , virtualForm3 | checkbox1 listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonEscogerFila1 botonDetallarFila1 botonProcesarFila1 botonRetornarFila1 botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{PaginaFuncionPorPagina1.breadcrumbs1}" 
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
                                                    rendered="#{PaginaFuncionPorPagina1.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{PaginaFuncionPorPagina1.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{PaginaFuncionPorPagina1.gestor.mensajeDisponible}"
                                                    text="#{PaginaFuncionPorPagina1.gestor.mensaje}"
                                                    url="#{PaginaFuncionPorPagina1.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:table
                                            binding="#{PaginaFuncionPorPagina1.table1}"
                                            clearSortButton="true" 
                                            deselectMultipleButton="true" 
                                            id="table1"
                                            paginateButton="false"
                                            paginationControls="true" 
                                            selectMultipleButton="true" 
                                            sortPanelToggleButton="true"
                                            width="960">
                                            <webuijsf:tableRowGroup 
                                                binding="#{PaginaFuncionPorPagina1.tableRowGroup1}" 
                                                id="tableRowGroup1" 
                                                rows="1"
                                                selected="#{PaginaFuncionPorPagina1.gestor.filaEscogida}" 
                                                sourceData="#{PaginaFuncionPorPagina1.paginaFuncionDataProvider}" 
                                                sourceVar="currentRow">
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    id="tableRowGroup1SelectionColumn"
                                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);" 
                                                    selectId="checkbox1">
                                                    <webuijsf:checkbox 
                                                        binding="#{PaginaFuncionPorPagina1.checkbox1}" 
                                                        id="checkbox1"
                                                        onClick="#{PaginaFuncionPorPagina1.gestor.scriptElegir}" 
                                                        selected="#{PaginaFuncionPorPagina1.gestor.filaElegida}" 
                                                        toolTip="#{PaginaFuncionPorPagina1.gestor.i18n.toolTipCheckboxSeleccionMultiple}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    binding="#{PaginaFuncionPorPagina1.tableColumn1}" 
                                                    id="tableColumn1">
                                                    <webuijsf:button 
                                                        actionExpression="#{PaginaFuncionPorPagina1.botonEscogerFila1_action}"
                                                        binding="#{PaginaFuncionPorPagina1.botonEscogerFila1}"
                                                        disabled="#{PaginaFuncionPorPagina1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonEscogerFila1"
                                                        imageURL="#{PaginaFuncionPorPagina1.gestor.urlImagenEscoger}" 
                                                        onClick="#{PaginaFuncionPorPagina1.gestor.scriptEscoger}"
                                                        text="#{PaginaFuncionPorPagina1.gestor.i18n.textoBotonEscogerFila}"
                                                        toolTip="#{PaginaFuncionPorPagina1.gestor.i18n.toolTipBotonEscogerFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{PaginaFuncionPorPagina1.botonDetallarFila1_action}"
                                                        binding="#{PaginaFuncionPorPagina1.botonDetallarFila1}"
                                                        disabled="#{PaginaFuncionPorPagina1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonDetallarFila1"
                                                        imageURL="#{PaginaFuncionPorPagina1.gestor.urlImagenDetallar}" 
                                                        onClick="#{PaginaFuncionPorPagina1.scriptAbrirVentanaVerDetalle}"
                                                        rendered="#{PaginaFuncionPorPagina1.gestor.detalleDisponible}" 
                                                        text="#{PaginaFuncionPorPagina1.gestor.i18n.textoBotonDetallarFila}"
                                                        toolTip="#{PaginaFuncionPorPagina1.gestor.i18n.toolTipBotonDetallarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{PaginaFuncionPorPagina1.botonProcesarFila1_action}"
                                                        binding="#{PaginaFuncionPorPagina1.botonProcesarFila1}"
                                                        disabled="#{PaginaFuncionPorPagina1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonProcesarFila1"
                                                        imageURL="#{PaginaFuncionPorPagina1.gestor.urlImagenProcesar}" 
                                                        onClick="#{PaginaFuncionPorPagina1.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{PaginaFuncionPorPagina1.asistente.comandoDisponible}" 
                                                        text="#{PaginaFuncionPorPagina1.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{PaginaFuncionPorPagina1.gestor.i18n.toolTipBotonProcesarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{PaginaFuncionPorPagina1.botonRetornarFila1_action}"
                                                        binding="#{PaginaFuncionPorPagina1.botonRetornarFila1}" 
                                                        disabled="#{PaginaFuncionPorPagina1.gestor.funcionReturnInhabilitada}"
                                                        id="botonRetornarFila1"
                                                        imageURL="#{PaginaFuncionPorPagina1.gestor.urlImagenRetornar}"
                                                        onClick="#{PaginaFuncionPorPagina1.gestor.scriptRetornarRecursoActual}"
                                                        rendered="#{PaginaFuncionPorPagina1.gestor.funcionReturnVisible}" 
                                                        text="#{PaginaFuncionPorPagina1.gestor.i18n.textoBotonRetornarFila}"
                                                        toolTip="#{PaginaFuncionPorPagina1.gestor.i18n.toolTipBotonRetornarFila}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{PaginaFuncionPorPagina1.tableColumn2}"
                                                    id="tableColumn2"
                                                    rendered="#{PaginaFuncionPorPagina1.gestor.designing}">
                                                    <webuijsf:imageHyperlink
                                                        actionExpression="#{PaginaFuncionPorPagina1.hipervinculoAccionFila1_action}"
                                                        binding="#{PaginaFuncionPorPagina1.hipervinculoAccionFila1}"
                                                        disabled="#{PaginaFuncionPorPagina1.gestor.loteConCambios}"
                                                        id="hipervinculoAccionFila1"
                                                        imageURL="#{PaginaFuncionPorPagina1.gestor.urlImagenEjecutarVinculo}"
                                                        onClick="#{PaginaFuncionPorPagina1.scriptAbrirVentanaAccionFila1}"
                                                        text="Accion1"
                                                        toolTip="#{bundle.PaginaFuncionPorPagina1_hipervinculoAccionFila1_toolTip}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="right" 
                                                    binding="#{PaginaFuncionPorPagina1.tableColumn3}" 
                                                    headerText="#{PaginaFuncionPorPagina1.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{PaginaFuncionPorPagina1.gestor.i18n.toolTipEtiquetaIdentificacionFila}"
                                                    id="tableColumn3">
                                                    <webuijsf:imageHyperlink 
                                                        actionExpression="#{PaginaFuncionPorPagina1.hipervinculoDetallarFila1_action}"
                                                        binding="#{PaginaFuncionPorPagina1.hipervinculoDetallarFila1}" 
                                                        id="hipervinculoDetallarFila1"
                                                        imageURL="#{PaginaFuncionPorPagina1.gestor.urlImagenFilaProcesada}"
                                                        textPosition="left" 
                                                        text="#{PaginaFuncionPorPagina1.gestor.identificacionFila}" 
                                                        toolTip="#{PaginaFuncionPorPagina1.gestor.toolTipImagenFilaProcesada}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{PaginaFuncionPorPagina1.tableColumnIdPaginaFuncion1}"
                                                    toolTip="BundleParametros.id_pagina_funcion.pagina_funcion"
                                                    headerText="identificaci&#243;n"
                                                    id="tableColumnIdPaginaFuncion1"
                                                    sort="id_pagina_funcion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdPaginaFuncion1"
                                                    text="#{currentRow.value['id_pagina_funcion']}"
                                                    rendered="#{PaginaFuncionPorPagina1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PaginaFuncionPorPagina1.labelIdPaginaFuncion1}"
                                                    id="labelIdPaginaFuncion1"
                                                    for="campoIdPaginaFuncion1"/>
                                                <webuijsf:textField id="campoIdPaginaFuncion1"
                                                    binding="#{PaginaFuncionPorPagina1.campoIdPaginaFuncion1}"
                                                    converter="#{PaginaFuncionPorPagina1.converterIdPaginaFuncion1}"
                                                    readOnly="#{PaginaFuncionPorPagina1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['id_pagina_funcion']}"
                                                    toolTip="BundleParametros.id_pagina_funcion.pagina_funcion"
                                                    validatorExpression="#{PaginaFuncionPorPagina1.validatorIdPaginaFuncion1.validate}"/>
                                                <webuijsf:staticText id="campoIdPaginaFuncion1Texto1"
                                                    binding="#{PaginaFuncionPorPagina1.campoIdPaginaFuncion1Texto1}"
                                                    text="#{currentRow.value['id_pagina_funcion']}"/>
                                                <webuijsf:message id="messageIdPaginaFuncion1"
                                                    for="campoIdPaginaFuncion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{PaginaFuncionPorPagina1.tableColumnIdFuncion1}"
                                                    toolTip="BundleParametros.id_funcion.pagina_funcion"
                                                    headerText="funci&#243;n"
                                                    id="tableColumnIdFuncion1"
                                                    sort="codigo_funcion_1x2y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdFuncion1"
                                                    text="#{currentRow.value['codigo_funcion_1x2y3']}"
                                                    rendered="#{PaginaFuncionPorPagina1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PaginaFuncionPorPagina1.labelIdFuncion1}"
                                                    id="labelIdFuncion1"
                                                    for="campoIdFuncion1"/>
                                                <webuijsf:textField id="campoIdFuncion1"
                                                    binding="#{PaginaFuncionPorPagina1.campoIdFuncion1}"
                                                    readOnly="#{PaginaFuncionPorPagina1.gestor.filaNoProcesada}" required="true"
                                                    text="#{PaginaFuncionPorPagina1.asistente.textoCampoIdFuncion1}"
                                                    toolTip="#{PaginaFuncionPorPagina1.asistente.toolTipCampoIdFuncion1}"
                                                    validatorExpression="#{PaginaFuncionPorPagina1.campoIdFuncion1_validate}"/>
                                                <webuijsf:staticText id="campoIdFuncion1Texto1"
                                                    binding="#{PaginaFuncionPorPagina1.campoIdFuncion1Texto1}"
                                                    text="#{currentRow.value['codigo_funcion_1x2y3']}"/>
                                                <webuijsf:message id="messageIdFuncion1"
                                                    for="campoIdFuncion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdFuncion3"
                                                    rendered="#{PaginaFuncionPorPagina1.asistente.tableColumnIdFuncion3Rendered}"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdFuncion3"
                                                    text="#{currentRow.value['id_funcion']}"
                                                    rendered="#{PaginaFuncionPorPagina1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{PaginaFuncionPorPagina1.campoIdFuncion1Boton1}"
                                                    id="campoIdFuncion1Boton1"
                                                    onClick="#{PaginaFuncionPorPagina1.asistente.scriptCampoIdFuncion1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{PaginaFuncionPorPagina1.campoIdFuncion1Boton3}"
                                                    id="campoIdFuncion1Boton3"
                                                    onClick="#{PaginaFuncionPorPagina1.asistente.scriptCampoIdFuncion1Boton2}"
                                                    rendered="#{PaginaFuncionPorPagina1.asistente.campoIdFuncion1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{PaginaFuncionPorPagina1.tableColumnIdFuncion2}"
                                                    headerText="nombre funci&#243;n"
                                                    id="tableColumnIdFuncion2"
                                                    rendered="#{PaginaFuncionPorPagina1.asistente.campoIdFuncion1Boton2Rendered}"
                                                    sort="nombre_funcion_1x2y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdFuncion2"
                                                    text="#{currentRow.value['nombre_funcion_1x2y4']}"
                                                    rendered="#{PaginaFuncionPorPagina1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PaginaFuncionPorPagina1.labelIdFuncion2}"
                                                    id="labelIdFuncion2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{PaginaFuncionPorPagina1.campoIdFuncion1Hiper1}"
                                                    id="campoIdFuncion1Hiper1"
                                                    text="#{currentRow.value['nombre_funcion_1x2y4']}"
                                                    onClick="#{PaginaFuncionPorPagina1.asistente.scriptCampoIdFuncion1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdFuncion1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{PaginaFuncionPorPagina1.tableColumnEsFuncionInicial1}"
                                                    toolTip="BundleParametros.es_funcion_inicial.pagina_funcion"
                                                    headerText="funci&#243;n inicial"
                                                    id="tableColumnEsFuncionInicial1" rendered="false"
                                                    sort="es_funcion_inicial">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsFuncionInicial1"
                                                    text="#{currentRow.value['es_funcion_inicial']}"
                                                    rendered="#{PaginaFuncionPorPagina1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PaginaFuncionPorPagina1.labelEsFuncionInicial1}"
                                                    id="labelEsFuncionInicial1"
                                                    for="listaEsFuncionInicial1"/>
                                                <webuijsf:dropDown id="listaEsFuncionInicial1"
                                                    binding="#{PaginaFuncionPorPagina1.listaEsFuncionInicial1}"
                                                    converter="#{PaginaFuncionPorPagina1.converterEsFuncionInicial1}"
                                                    disabled="#{PaginaFuncionPorPagina1.gestor.filaNoProcesada}" required="true"
                                                    items="#{PaginaFuncionPorPagina1.asistente.opcionesListaEsFuncionInicial1}"
                                                    selected="#{currentRow.value['es_funcion_inicial']}"
                                                    toolTip="BundleParametros.es_funcion_inicial.pagina_funcion"/>
                                                <webuijsf:staticText id="listaEsFuncionInicial1Texto1"
                                                    binding="#{PaginaFuncionPorPagina1.listaEsFuncionInicial1Texto1}"/>
                                                <webuijsf:message id="messageEsFuncionInicial1"
                                                    for="listaEsFuncionInicial1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{PaginaFuncionPorPagina1.tableColumnControlPaginaFuncion1}"
                                                    toolTip="BundleParametros.control_pagina_funcion.pagina_funcion"
                                                    headerText="control"
                                                    id="tableColumnControlPaginaFuncion1" rendered="false"
                                                    sort="control_pagina_funcion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextControlPaginaFuncion1"
                                                    text="#{currentRow.value['control_pagina_funcion']}"
                                                    rendered="#{PaginaFuncionPorPagina1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PaginaFuncionPorPagina1.labelControlPaginaFuncion1}"
                                                    id="labelControlPaginaFuncion1"
                                                    for="campoControlPaginaFuncion1"/>
                                                <webuijsf:textField id="campoControlPaginaFuncion1"
                                                    binding="#{PaginaFuncionPorPagina1.campoControlPaginaFuncion1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{PaginaFuncionPorPagina1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['control_pagina_funcion']}"
                                                    toolTip="BundleParametros.control_pagina_funcion.pagina_funcion"
                                                    validatorExpression="#{PaginaFuncionPorPagina1.validatorControlPaginaFuncion1.validate}"/>
                                                <webuijsf:staticText id="campoControlPaginaFuncion1Texto1"
                                                    binding="#{PaginaFuncionPorPagina1.campoControlPaginaFuncion1Texto1}"
                                                    text="#{currentRow.value['control_pagina_funcion']}"/>
                                                <webuijsf:message id="messageControlPaginaFuncion1"
                                                    for="campoControlPaginaFuncion1"/>
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
                                                        binding="#{PaginaFuncionPorPagina1.etiquetaTextoFilasPorPagina1}" 
                                                        for="textoFilasPorPagina1"
                                                        id="etiquetaTextoFilasPorPagina1" 
                                                        text="#{PaginaFuncionPorPagina1.gestor.i18n.textoEtiquetaTextoFilasPorPagina}"/>
                                                </h:panelGrid>
                                                <h:panelGrid 
                                                    columns="3" 
                                                    id="gridPanel107">
                                                    <webuijsf:textField 
                                                        binding="#{PaginaFuncionPorPagina1.textoFilasPorPagina1}" 
                                                        columns="2"
                                                        converter="#{PaginaFuncionPorPagina1.textoFilasPorPagina1Converter1}"
                                                        disabled="#{PaginaFuncionPorPagina1.gestor.paginacionInhabilitada}" 
                                                        id="textoFilasPorPagina1" maxLength="2"
                                                        text="#{PaginaFuncionPorPagina1.gestor.filasPorPagina}" 
                                                        validatorExpression="#{PaginaFuncionPorPagina1.textoFilasPorPagina1Validator1.validate}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{PaginaFuncionPorPagina1.botonRepaginar1_action}"
                                                        binding="#{PaginaFuncionPorPagina1.botonRepaginar1}" 
                                                        id="botonRepaginar1"
                                                        imageURL="#{PaginaFuncionPorPagina1.gestor.urlImagenRepaginar}" 
                                                        onClick="#{PaginaFuncionPorPagina1.gestor.scriptRepaginar}"
                                                        text="#{PaginaFuncionPorPagina1.gestor.i18n.textoBotonRepaginar}"
                                                        toolTip="#{PaginaFuncionPorPagina1.gestor.i18n.toolTipBotonRepaginar}"/>
                                                    <webuijsf:message 
                                                        for="textoFilasPorPagina1" 
                                                        id="messageFilasPorPagina1"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="13"
                                                id="gridPanel108">
                                                <webuijsf:button
                                                    actionExpression="#{PaginaFuncionPorPagina1.botonAgregar1_action}"
                                                    binding="#{PaginaFuncionPorPagina1.botonAgregar1}"
                                                    disabled="#{PaginaFuncionPorPagina1.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{PaginaFuncionPorPagina1.gestor.scriptAgregar}"
                                                    rendered="#{PaginaFuncionPorPagina1.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PaginaFuncionPorPagina1.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{PaginaFuncionPorPagina1.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{PaginaFuncionPorPagina1.listaFuncionEdicion1}"
                                                    converter="#{PaginaFuncionPorPagina1.converterListaFuncionEdicion1}"
                                                    disabled="#{PaginaFuncionPorPagina1.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{PaginaFuncionPorPagina1.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{PaginaFuncionPorPagina1.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{PaginaFuncionPorPagina1.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{PaginaFuncionPorPagina1.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{PaginaFuncionPorPagina1.botonEditar1_action}"
                                                    binding="#{PaginaFuncionPorPagina1.botonEditar1}"
                                                    disabled="#{PaginaFuncionPorPagina1.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{PaginaFuncionPorPagina1.gestor.scriptEditar}"
                                                    rendered="#{PaginaFuncionPorPagina1.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PaginaFuncionPorPagina1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{PaginaFuncionPorPagina1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{PaginaFuncionPorPagina1.botonEliminar1_action}"
                                                    binding="#{PaginaFuncionPorPagina1.botonEliminar1}"
                                                    disabled="#{PaginaFuncionPorPagina1.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{PaginaFuncionPorPagina1.gestor.scriptEliminar}"
                                                    rendered="#{PaginaFuncionPorPagina1.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PaginaFuncionPorPagina1.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{PaginaFuncionPorPagina1.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{PaginaFuncionPorPagina1.botonAplicar1_action}"
                                                    binding="#{PaginaFuncionPorPagina1.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{PaginaFuncionPorPagina1.gestor.scriptAplicar}"
                                                    rendered="#{PaginaFuncionPorPagina1.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PaginaFuncionPorPagina1.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{PaginaFuncionPorPagina1.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{PaginaFuncionPorPagina1.botonDeshacer1_action}"
                                                    binding="#{PaginaFuncionPorPagina1.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{PaginaFuncionPorPagina1.gestor.scriptDeshacer}"
                                                    rendered="#{PaginaFuncionPorPagina1.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PaginaFuncionPorPagina1.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{PaginaFuncionPorPagina1.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{PaginaFuncionPorPagina1.botonConfirmar1_action}"
                                                    binding="#{PaginaFuncionPorPagina1.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{PaginaFuncionPorPagina1.gestor.scriptConfirmar}"
                                                    rendered="#{PaginaFuncionPorPagina1.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PaginaFuncionPorPagina1.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{PaginaFuncionPorPagina1.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{PaginaFuncionPorPagina1.botonDescartar1_action}"
                                                    binding="#{PaginaFuncionPorPagina1.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{PaginaFuncionPorPagina1.gestor.scriptDescartar}"
                                                    rendered="#{PaginaFuncionPorPagina1.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PaginaFuncionPorPagina1.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{PaginaFuncionPorPagina1.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{PaginaFuncionPorPagina1.listaFuncionAccion1}"
                                                    converter="#{PaginaFuncionPorPagina1.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{PaginaFuncionPorPagina1.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{PaginaFuncionPorPagina1.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{PaginaFuncionPorPagina1.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{PaginaFuncionPorPagina1.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{PaginaFuncionPorPagina1.botonProcesar1_action}"
                                                    binding="#{PaginaFuncionPorPagina1.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{PaginaFuncionPorPagina1.gestor.scriptProcesar}"
                                                    rendered="#{PaginaFuncionPorPagina1.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PaginaFuncionPorPagina1.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{PaginaFuncionPorPagina1.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{PaginaFuncionPorPagina1.botonRefrescar1_action}"
                                                    binding="#{PaginaFuncionPorPagina1.botonRefrescar1}"
                                                    disabled="#{PaginaFuncionPorPagina1.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{PaginaFuncionPorPagina1.gestor.scriptRefrescar}"
                                                    rendered="#{PaginaFuncionPorPagina1.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PaginaFuncionPorPagina1.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{PaginaFuncionPorPagina1.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{PaginaFuncionPorPagina1.botonReconsultar1_action}"
                                                    binding="#{PaginaFuncionPorPagina1.botonReconsultar1}"
                                                    disabled="#{PaginaFuncionPorPagina1.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{PaginaFuncionPorPagina1.gestor.scriptReconsultar}"
                                                    rendered="#{PaginaFuncionPorPagina1.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PaginaFuncionPorPagina1.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{PaginaFuncionPorPagina1.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{PaginaFuncionPorPagina1.botonRetornar1_action}"
                                                    binding="#{PaginaFuncionPorPagina1.botonRetornar1}"
                                                    disabled="#{PaginaFuncionPorPagina1.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{PaginaFuncionPorPagina1.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{PaginaFuncionPorPagina1.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PaginaFuncionPorPagina1.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{PaginaFuncionPorPagina1.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel109"
                                                rendered="#{PaginaFuncionPorPagina1.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{PaginaFuncionPorPagina1.imageHyperlink1_action}"
                                                    binding="#{PaginaFuncionPorPagina1.imageHyperlink1}"
                                                    disabled="#{PaginaFuncionPorPagina1.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{PaginaFuncionPorPagina1.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{PaginaFuncionPorPagina1.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{PaginaFuncionPorPagina1.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.PaginaFuncionPorPagina1_imageHyperlink1_toolTip}"/>
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
