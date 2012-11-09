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
                    focus="#{Pagina1.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{Pagina1.gestor.preserveFocus}"
                    preserveScroll="#{Pagina1.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{Pagina1.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | checkbox1 campoIdPagina1 campoCodigoPagina1 campoNombrePagina1 campoDescripcionPagina1 campoUrlPagina1 campoIdAplicacion1 listaEsPublica1 listaNumeroTipoPagina1 campoIdDominio1 campoIdDominioMaestro1 campoIdParametro1 textoFilasPorPagina1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | textoFilasPorPagina1 | botonRepaginar1 , virtualForm3 | checkbox1 listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonEscogerFila1 botonDetallarFila1 botonProcesarFila1 botonRetornarFila1 botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{Pagina1.breadcrumbs1}" 
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
                                                    rendered="#{Pagina1.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{Pagina1.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{Pagina1.gestor.mensajeDisponible}"
                                                    text="#{Pagina1.gestor.mensaje}"
                                                    url="#{Pagina1.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:table
                                            binding="#{Pagina1.table1}"
                                            clearSortButton="true" 
                                            deselectMultipleButton="true" 
                                            id="table1"
                                            paginateButton="false"
                                            paginationControls="true" 
                                            selectMultipleButton="true" 
                                            sortPanelToggleButton="true"
                                            width="960">
                                            <webuijsf:tableRowGroup 
                                                binding="#{Pagina1.tableRowGroup1}" 
                                                id="tableRowGroup1" 
                                                rows="1"
                                                selected="#{Pagina1.gestor.filaEscogida}" 
                                                sourceData="#{Pagina1.paginaDataProvider}" 
                                                sourceVar="currentRow">
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    id="tableRowGroup1SelectionColumn"
                                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);" 
                                                    selectId="checkbox1">
                                                    <webuijsf:checkbox 
                                                        binding="#{Pagina1.checkbox1}" 
                                                        id="checkbox1"
                                                        onClick="#{Pagina1.gestor.scriptElegir}" 
                                                        selected="#{Pagina1.gestor.filaElegida}" 
                                                        toolTip="#{Pagina1.gestor.i18n.toolTipCheckboxSeleccionMultiple}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    binding="#{Pagina1.tableColumn1}" 
                                                    id="tableColumn1">
                                                    <webuijsf:button 
                                                        actionExpression="#{Pagina1.botonEscogerFila1_action}"
                                                        binding="#{Pagina1.botonEscogerFila1}"
                                                        disabled="#{Pagina1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonEscogerFila1"
                                                        imageURL="#{Pagina1.gestor.urlImagenEscoger}" 
                                                        onClick="#{Pagina1.gestor.scriptEscoger}"
                                                        text="#{Pagina1.gestor.i18n.textoBotonEscogerFila}"
                                                        toolTip="#{Pagina1.gestor.i18n.toolTipBotonEscogerFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{Pagina1.botonDetallarFila1_action}"
                                                        binding="#{Pagina1.botonDetallarFila1}"
                                                        disabled="#{Pagina1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonDetallarFila1"
                                                        imageURL="#{Pagina1.gestor.urlImagenDetallar}" 
                                                        onClick="#{Pagina1.scriptAbrirVentanaVerDetalle}"
                                                        rendered="#{Pagina1.gestor.detalleDisponible}" 
                                                        text="#{Pagina1.gestor.i18n.textoBotonDetallarFila}"
                                                        toolTip="#{Pagina1.gestor.i18n.toolTipBotonDetallarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{Pagina1.botonProcesarFila1_action}"
                                                        binding="#{Pagina1.botonProcesarFila1}"
                                                        disabled="#{Pagina1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonProcesarFila1"
                                                        imageURL="#{Pagina1.gestor.urlImagenProcesar}" 
                                                        onClick="#{Pagina1.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{Pagina1.asistente.comandoDisponible}" 
                                                        text="#{Pagina1.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{Pagina1.gestor.i18n.toolTipBotonProcesarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{Pagina1.botonRetornarFila1_action}"
                                                        binding="#{Pagina1.botonRetornarFila1}" 
                                                        disabled="#{Pagina1.gestor.funcionReturnInhabilitada}"
                                                        id="botonRetornarFila1"
                                                        imageURL="#{Pagina1.gestor.urlImagenRetornar}"
                                                        onClick="#{Pagina1.gestor.scriptRetornarRecursoActual}"
                                                        rendered="#{Pagina1.gestor.funcionReturnVisible}" 
                                                        text="#{Pagina1.gestor.i18n.textoBotonRetornarFila}"
                                                        toolTip="#{Pagina1.gestor.i18n.toolTipBotonRetornarFila}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Pagina1.tableColumn2}"
                                                    id="tableColumn2"
                                                    rendered="#{Pagina1.gestor.designing}">
                                                    <webuijsf:imageHyperlink
                                                        actionExpression="#{Pagina1.hipervinculoAccionFila1_action}"
                                                        binding="#{Pagina1.hipervinculoAccionFila1}"
                                                        disabled="#{Pagina1.gestor.loteConCambios}"
                                                        id="hipervinculoAccionFila1"
                                                        imageURL="#{Pagina1.gestor.urlImagenEjecutarVinculo}"
                                                        onClick="#{Pagina1.scriptAbrirVentanaAccionFila1}"
                                                        text="Accion1"
                                                        toolTip="#{bundle.Pagina1_hipervinculoAccionFila1_toolTip}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="right" 
                                                    binding="#{Pagina1.tableColumn3}" 
                                                    headerText="#{Pagina1.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{Pagina1.gestor.i18n.toolTipEtiquetaIdentificacionFila}"
                                                    id="tableColumn3">
                                                    <webuijsf:imageHyperlink 
                                                        actionExpression="#{Pagina1.hipervinculoDetallarFila1_action}"
                                                        binding="#{Pagina1.hipervinculoDetallarFila1}" 
                                                        id="hipervinculoDetallarFila1"
                                                        imageURL="#{Pagina1.gestor.urlImagenFilaProcesada}"
                                                        textPosition="left" 
                                                        text="#{Pagina1.gestor.identificacionFila}" 
                                                        toolTip="#{Pagina1.gestor.toolTipImagenFilaProcesada}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Pagina1.tableColumnIdPagina1}"
                                                    headerText="id"
                                                    id="tableColumnIdPagina1"
                                                    sort="id_pagina">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdPagina1"
                                                    text="#{currentRow.value['id_pagina']}"
                                                    rendered="#{Pagina1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Pagina1.labelIdPagina1}"
                                                    id="labelIdPagina1"
                                                    for="campoIdPagina1"/>
                                                <webuijsf:textField id="campoIdPagina1"
                                                    binding="#{Pagina1.campoIdPagina1}"
                                                    converter="#{Pagina1.converterIdPagina1}"
                                                    readOnly="#{Pagina1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['id_pagina']}"
                                                    toolTip="BundleParametros.id_pagina.pagina"
                                                    validatorExpression="#{Pagina1.validatorIdPagina1.validate}"/>
                                                <webuijsf:staticText id="campoIdPagina1Texto1"
                                                    binding="#{Pagina1.campoIdPagina1Texto1}"
                                                    text="#{currentRow.value['id_pagina']}"/>
                                                <webuijsf:message id="messageIdPagina1"
                                                    for="campoIdPagina1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Pagina1.tableColumnCodigoPagina1}"
                                                    headerText="codigo"
                                                    id="tableColumnCodigoPagina1"
                                                    sort="codigo_pagina">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextCodigoPagina1"
                                                    text="#{currentRow.value['codigo_pagina']}"
                                                    rendered="#{Pagina1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Pagina1.labelCodigoPagina1}"
                                                    id="labelCodigoPagina1"
                                                    for="campoCodigoPagina1"/>
                                                <webuijsf:textField id="campoCodigoPagina1"
                                                    binding="#{Pagina1.campoCodigoPagina1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{Pagina1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['codigo_pagina']}"
                                                    toolTip="BundleParametros.codigo_pagina.pagina"
                                                    validatorExpression="#{Pagina1.validatorCodigoPagina1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoPagina1Texto1"
                                                    binding="#{Pagina1.campoCodigoPagina1Texto1}"
                                                    text="#{currentRow.value['codigo_pagina']}"/>
                                                <webuijsf:message id="messageCodigoPagina1"
                                                    for="campoCodigoPagina1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Pagina1.tableColumnNombrePagina1}"
                                                    headerText="nombre"
                                                    id="tableColumnNombrePagina1"
                                                    sort="nombre_pagina">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNombrePagina1"
                                                    text="#{currentRow.value['nombre_pagina']}"
                                                    rendered="#{Pagina1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Pagina1.labelNombrePagina1}"
                                                    id="labelNombrePagina1"
                                                    for="campoNombrePagina1"/>
                                                <webuijsf:textField id="campoNombrePagina1"
                                                    binding="#{Pagina1.campoNombrePagina1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{Pagina1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['nombre_pagina']}"
                                                    toolTip="BundleParametros.nombre_pagina.pagina"
                                                    validatorExpression="#{Pagina1.validatorNombrePagina1.validate}"/>
                                                <webuijsf:staticText id="campoNombrePagina1Texto1"
                                                    binding="#{Pagina1.campoNombrePagina1Texto1}"
                                                    text="#{currentRow.value['nombre_pagina']}"/>
                                                <webuijsf:message id="messageNombrePagina1"
                                                    for="campoNombrePagina1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Pagina1.tableColumnDescripcionPagina1}"
                                                    headerText="descripcion"
                                                    id="tableColumnDescripcionPagina1" rendered="false"
                                                    sort="descripcion_pagina">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextDescripcionPagina1"
                                                    text="#{currentRow.value['descripcion_pagina']}"
                                                    rendered="#{Pagina1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Pagina1.labelDescripcionPagina1}"
                                                    id="labelDescripcionPagina1"
                                                    for="campoDescripcionPagina1"/>
                                                <webuijsf:textArea id="campoDescripcionPagina1"
                                                    binding="#{Pagina1.campoDescripcionPagina1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{Pagina1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['descripcion_pagina']}"
                                                    toolTip="BundleParametros.descripcion_pagina.pagina"
                                                    validatorExpression="#{Pagina1.validatorDescripcionPagina1.validate}"/>
                                                <webuijsf:staticText id="campoDescripcionPagina1Texto1"
                                                    binding="#{Pagina1.campoDescripcionPagina1Texto1}"
                                                    text="#{currentRow.value['descripcion_pagina']}"/>
                                                <webuijsf:message id="messageDescripcionPagina1"
                                                    for="campoDescripcionPagina1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Pagina1.tableColumnUrlPagina1}"
                                                    headerText="url"
                                                    id="tableColumnUrlPagina1" rendered="false"
                                                    sort="url_pagina">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextUrlPagina1"
                                                    text="#{currentRow.value['url_pagina']}"
                                                    rendered="#{Pagina1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Pagina1.labelUrlPagina1}"
                                                    id="labelUrlPagina1"
                                                    for="campoUrlPagina1"/>
                                                <webuijsf:textArea id="campoUrlPagina1"
                                                    binding="#{Pagina1.campoUrlPagina1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{Pagina1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['url_pagina']}"
                                                    toolTip="BundleParametros.url_pagina.pagina"
                                                    validatorExpression="#{Pagina1.validatorUrlPagina1.validate}"/>
                                                <webuijsf:staticText id="campoUrlPagina1Texto1"
                                                    binding="#{Pagina1.campoUrlPagina1Texto1}"
                                                    text="#{currentRow.value['url_pagina']}"/>
                                                <webuijsf:message id="messageUrlPagina1"
                                                    for="campoUrlPagina1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Pagina1.tableColumnIdAplicacion1}"
                                                    headerText="aplicacion"
                                                    id="tableColumnIdAplicacion1"
                                                    sort="codigo_aplicacion_1x1y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdAplicacion1"
                                                    text="#{currentRow.value['codigo_aplicacion_1x1y3']}"
                                                    rendered="#{Pagina1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Pagina1.labelIdAplicacion1}"
                                                    id="labelIdAplicacion1"
                                                    for="campoIdAplicacion1"/>
                                                <webuijsf:textField id="campoIdAplicacion1"
                                                    binding="#{Pagina1.campoIdAplicacion1}"
                                                    readOnly="#{Pagina1.gestor.filaNoProcesada}" required="true"
                                                    text="#{Pagina1.asistente.textoCampoIdAplicacion1}"
                                                    toolTip="#{Pagina1.asistente.toolTipCampoIdAplicacion1}"
                                                    validatorExpression="#{Pagina1.campoIdAplicacion1_validate}"/>
                                                <webuijsf:staticText id="campoIdAplicacion1Texto1"
                                                    binding="#{Pagina1.campoIdAplicacion1Texto1}"
                                                    text="#{currentRow.value['codigo_aplicacion_1x1y3']}"/>
                                                <webuijsf:message id="messageIdAplicacion1"
                                                    for="campoIdAplicacion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdAplicacion3"
                                                    rendered="#{Pagina1.asistente.tableColumnIdAplicacion3Rendered}"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdAplicacion3"
                                                    text="#{currentRow.value['id_aplicacion']}"
                                                    rendered="#{Pagina1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{Pagina1.campoIdAplicacion1Boton1}"
                                                    id="campoIdAplicacion1Boton1"
                                                    onClick="#{Pagina1.asistente.scriptCampoIdAplicacion1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{Pagina1.campoIdAplicacion1Boton3}"
                                                    id="campoIdAplicacion1Boton3"
                                                    onClick="#{Pagina1.asistente.scriptCampoIdAplicacion1Boton2}"
                                                    rendered="#{Pagina1.asistente.campoIdAplicacion1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{Pagina1.tableColumnIdAplicacion2}"
                                                    headerText="nombre aplicacion"
                                                    id="tableColumnIdAplicacion2"
                                                    rendered="#{Pagina1.asistente.campoIdAplicacion1Boton2Rendered}"
                                                    sort="nombre_aplicacion_1x1y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdAplicacion2"
                                                    text="#{currentRow.value['nombre_aplicacion_1x1y4']}"
                                                    rendered="#{Pagina1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Pagina1.labelIdAplicacion2}"
                                                    id="labelIdAplicacion2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{Pagina1.campoIdAplicacion1Hiper1}"
                                                    id="campoIdAplicacion1Hiper1"
                                                    text="#{currentRow.value['nombre_aplicacion_1x1y4']}"
                                                    onClick="#{Pagina1.asistente.scriptCampoIdAplicacion1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdAplicacion1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Pagina1.tableColumnEsPublica1}"
                                                    headerText="publica"
                                                    id="tableColumnEsPublica1" rendered="false"
                                                    sort="es_publica">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsPublica1"
                                                    text="#{currentRow.value['es_publica']}"
                                                    rendered="#{Pagina1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Pagina1.labelEsPublica1}"
                                                    id="labelEsPublica1"
                                                    for="listaEsPublica1"/>
                                                <webuijsf:dropDown id="listaEsPublica1"
                                                    binding="#{Pagina1.listaEsPublica1}"
                                                    converter="#{Pagina1.converterEsPublica1}"
                                                    disabled="#{Pagina1.gestor.filaNoProcesada}" required="true"
                                                    items="#{Pagina1.asistente.opcionesListaEsPublica1}"
                                                    selected="#{currentRow.value['es_publica']}"
                                                    toolTip="BundleParametros.es_publica.pagina"/>
                                                <webuijsf:staticText id="listaEsPublica1Texto1"
                                                    binding="#{Pagina1.listaEsPublica1Texto1}"/>
                                                <webuijsf:message id="messageEsPublica1"
                                                    for="listaEsPublica1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Pagina1.tableColumnNumeroTipoPagina1}"
                                                    headerText="tipo"
                                                    id="tableColumnNumeroTipoPagina1" rendered="false"
                                                    sort="codigo_tipo_pagina_1x2y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroTipoPagina1"
                                                    text="#{currentRow.value['codigo_tipo_pagina_1x2y2']}"
                                                    rendered="#{Pagina1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Pagina1.labelNumeroTipoPagina1}"
                                                    id="labelNumeroTipoPagina1"
                                                    for="listaNumeroTipoPagina1"/>
                                                <webuijsf:dropDown id="listaNumeroTipoPagina1"
                                                    binding="#{Pagina1.listaNumeroTipoPagina1}"
                                                    converter="#{Pagina1.converterNumeroTipoPagina1}"
                                                    disabled="#{Pagina1.gestor.filaNoProcesada}"
                                                    items="#{Pagina1.asistente.opcionesListaNumeroTipoPagina1}"
                                                    selected="#{currentRow.value['numero_tipo_pagina']}"
                                                    toolTip="BundleParametros.numero_tipo_pagina.pagina"/>
                                                <webuijsf:staticText id="listaNumeroTipoPagina1Texto1"
                                                    binding="#{Pagina1.listaNumeroTipoPagina1Texto1}"
                                                    text="#{currentRow.value['codigo_tipo_pagina_1x2y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoPagina1"
                                                    for="listaNumeroTipoPagina1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Pagina1.tableColumnIdDominio1}"
                                                    headerText="dominio"
                                                    id="tableColumnIdDominio1" rendered="false"
                                                    sort="codigo_dominio_1x3y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdDominio1"
                                                    text="#{currentRow.value['codigo_dominio_1x3y3']}"
                                                    rendered="#{Pagina1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Pagina1.labelIdDominio1}"
                                                    id="labelIdDominio1"
                                                    for="campoIdDominio1"/>
                                                <webuijsf:textField id="campoIdDominio1"
                                                    binding="#{Pagina1.campoIdDominio1}"
                                                    readOnly="#{Pagina1.gestor.filaNoProcesada}"
                                                    text="#{Pagina1.asistente.textoCampoIdDominio1}"
                                                    toolTip="#{Pagina1.asistente.toolTipCampoIdDominio1}"
                                                    validatorExpression="#{Pagina1.campoIdDominio1_validate}"/>
                                                <webuijsf:staticText id="campoIdDominio1Texto1"
                                                    binding="#{Pagina1.campoIdDominio1Texto1}"
                                                    text="#{currentRow.value['codigo_dominio_1x3y3']}"/>
                                                <webuijsf:message id="messageIdDominio1"
                                                    for="campoIdDominio1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdDominio3" rendered="false"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdDominio3"
                                                    text="#{currentRow.value['id_dominio']}"
                                                    rendered="#{Pagina1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{Pagina1.campoIdDominio1Boton1}"
                                                    id="campoIdDominio1Boton1"
                                                    onClick="#{Pagina1.asistente.scriptCampoIdDominio1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{Pagina1.campoIdDominio1Boton3}"
                                                    id="campoIdDominio1Boton3"
                                                    onClick="#{Pagina1.asistente.scriptCampoIdDominio1Boton2}"
                                                    rendered="#{Pagina1.asistente.campoIdDominio1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{Pagina1.tableColumnIdDominio2}"
                                                    headerText="nombre dominio"
                                                    id="tableColumnIdDominio2" rendered="false"
                                                    sort="nombre_dominio_1x3y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdDominio2"
                                                    text="#{currentRow.value['nombre_dominio_1x3y4']}"
                                                    rendered="#{Pagina1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Pagina1.labelIdDominio2}"
                                                    id="labelIdDominio2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{Pagina1.campoIdDominio1Hiper1}"
                                                    id="campoIdDominio1Hiper1"
                                                    text="#{currentRow.value['nombre_dominio_1x3y4']}"
                                                    onClick="#{Pagina1.asistente.scriptCampoIdDominio1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdDominio1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Pagina1.tableColumnIdDominioMaestro1}"
                                                    headerText="dominio maestro"
                                                    id="tableColumnIdDominioMaestro1" rendered="false"
                                                    sort="codigo_dominio_1x4y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdDominioMaestro1"
                                                    text="#{currentRow.value['codigo_dominio_1x4y3']}"
                                                    rendered="#{Pagina1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Pagina1.labelIdDominioMaestro1}"
                                                    id="labelIdDominioMaestro1"
                                                    for="campoIdDominioMaestro1"/>
                                                <webuijsf:textField id="campoIdDominioMaestro1"
                                                    binding="#{Pagina1.campoIdDominioMaestro1}"
                                                    readOnly="#{Pagina1.gestor.filaNoProcesada}"
                                                    text="#{Pagina1.asistente.textoCampoIdDominioMaestro1}"
                                                    toolTip="#{Pagina1.asistente.toolTipCampoIdDominioMaestro1}"
                                                    validatorExpression="#{Pagina1.campoIdDominioMaestro1_validate}"/>
                                                <webuijsf:staticText id="campoIdDominioMaestro1Texto1"
                                                    binding="#{Pagina1.campoIdDominioMaestro1Texto1}"
                                                    text="#{currentRow.value['codigo_dominio_1x4y3']}"/>
                                                <webuijsf:message id="messageIdDominioMaestro1"
                                                    for="campoIdDominioMaestro1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdDominioMaestro3" rendered="false"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdDominioMaestro3"
                                                    text="#{currentRow.value['id_dominio_maestro']}"
                                                    rendered="#{Pagina1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{Pagina1.campoIdDominioMaestro1Boton1}"
                                                    id="campoIdDominioMaestro1Boton1"
                                                    onClick="#{Pagina1.asistente.scriptCampoIdDominioMaestro1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{Pagina1.campoIdDominioMaestro1Boton3}"
                                                    id="campoIdDominioMaestro1Boton3"
                                                    onClick="#{Pagina1.asistente.scriptCampoIdDominioMaestro1Boton2}"
                                                    rendered="#{Pagina1.asistente.campoIdDominioMaestro1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{Pagina1.tableColumnIdDominioMaestro2}"
                                                    headerText="nombre dominio maestro"
                                                    id="tableColumnIdDominioMaestro2" rendered="false"
                                                    sort="nombre_dominio_1x4y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdDominioMaestro2"
                                                    text="#{currentRow.value['nombre_dominio_1x4y4']}"
                                                    rendered="#{Pagina1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Pagina1.labelIdDominioMaestro2}"
                                                    id="labelIdDominioMaestro2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{Pagina1.campoIdDominioMaestro1Hiper1}"
                                                    id="campoIdDominioMaestro1Hiper1"
                                                    text="#{currentRow.value['nombre_dominio_1x4y4']}"
                                                    onClick="#{Pagina1.asistente.scriptCampoIdDominioMaestro1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdDominioMaestro1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Pagina1.tableColumnIdParametro1}"
                                                    headerText="parametro"
                                                    id="tableColumnIdParametro1" rendered="false"
                                                    sort="codigo_parametro_1x5y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdParametro1"
                                                    text="#{currentRow.value['codigo_parametro_1x5y3']}"
                                                    rendered="#{Pagina1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Pagina1.labelIdParametro1}"
                                                    id="labelIdParametro1"
                                                    for="campoIdParametro1"/>
                                                <webuijsf:textField id="campoIdParametro1"
                                                    binding="#{Pagina1.campoIdParametro1}"
                                                    readOnly="#{Pagina1.gestor.filaNoProcesada}"
                                                    text="#{Pagina1.asistente.textoCampoIdParametro1}"
                                                    toolTip="#{Pagina1.asistente.toolTipCampoIdParametro1}"
                                                    validatorExpression="#{Pagina1.campoIdParametro1_validate}"/>
                                                <webuijsf:staticText id="campoIdParametro1Texto1"
                                                    binding="#{Pagina1.campoIdParametro1Texto1}"
                                                    text="#{currentRow.value['codigo_parametro_1x5y3']}"/>
                                                <webuijsf:message id="messageIdParametro1"
                                                    for="campoIdParametro1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdParametro3" rendered="false"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdParametro3"
                                                    text="#{currentRow.value['id_parametro']}"
                                                    rendered="#{Pagina1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{Pagina1.campoIdParametro1Boton1}"
                                                    id="campoIdParametro1Boton1"
                                                    onClick="#{Pagina1.asistente.scriptCampoIdParametro1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{Pagina1.campoIdParametro1Boton3}"
                                                    id="campoIdParametro1Boton3"
                                                    onClick="#{Pagina1.asistente.scriptCampoIdParametro1Boton2}"
                                                    rendered="#{Pagina1.asistente.campoIdParametro1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{Pagina1.tableColumnIdParametro2}"
                                                    headerText="nombre parametro"
                                                    id="tableColumnIdParametro2" rendered="false"
                                                    sort="nombre_parametro_1x5y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdParametro2"
                                                    text="#{currentRow.value['nombre_parametro_1x5y4']}"
                                                    rendered="#{Pagina1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Pagina1.labelIdParametro2}"
                                                    id="labelIdParametro2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{Pagina1.campoIdParametro1Hiper1}"
                                                    id="campoIdParametro1Hiper1"
                                                    text="#{currentRow.value['nombre_parametro_1x5y4']}"
                                                    onClick="#{Pagina1.asistente.scriptCampoIdParametro1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdParametro1Boton2"
                                                    rendered="false"/>
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
                                                        binding="#{Pagina1.etiquetaTextoFilasPorPagina1}" 
                                                        for="textoFilasPorPagina1"
                                                        id="etiquetaTextoFilasPorPagina1" 
                                                        text="#{Pagina1.gestor.i18n.textoEtiquetaTextoFilasPorPagina}"/>
                                                </h:panelGrid>
                                                <h:panelGrid 
                                                    columns="3" 
                                                    id="gridPanel107">
                                                    <webuijsf:textField 
                                                        binding="#{Pagina1.textoFilasPorPagina1}" 
                                                        columns="2"
                                                        converter="#{Pagina1.textoFilasPorPagina1Converter1}"
                                                        disabled="#{Pagina1.gestor.paginacionInhabilitada}" 
                                                        id="textoFilasPorPagina1" maxLength="2"
                                                        text="#{Pagina1.gestor.filasPorPagina}" 
                                                        validatorExpression="#{Pagina1.textoFilasPorPagina1Validator1.validate}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{Pagina1.botonRepaginar1_action}"
                                                        binding="#{Pagina1.botonRepaginar1}" 
                                                        id="botonRepaginar1"
                                                        imageURL="#{Pagina1.gestor.urlImagenRepaginar}" 
                                                        onClick="#{Pagina1.gestor.scriptRepaginar}"
                                                        text="#{Pagina1.gestor.i18n.textoBotonRepaginar}"
                                                        toolTip="#{Pagina1.gestor.i18n.toolTipBotonRepaginar}"/>
                                                    <webuijsf:message 
                                                        for="textoFilasPorPagina1" 
                                                        id="messageFilasPorPagina1"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="13"
                                                id="gridPanel108">
                                                <webuijsf:button
                                                    actionExpression="#{Pagina1.botonAgregar1_action}"
                                                    binding="#{Pagina1.botonAgregar1}"
                                                    disabled="#{Pagina1.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{Pagina1.gestor.scriptAgregar}"
                                                    rendered="#{Pagina1.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Pagina1.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{Pagina1.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{Pagina1.listaFuncionEdicion1}"
                                                    converter="#{Pagina1.converterListaFuncionEdicion1}"
                                                    disabled="#{Pagina1.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{Pagina1.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{Pagina1.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{Pagina1.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{Pagina1.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Pagina1.botonEditar1_action}"
                                                    binding="#{Pagina1.botonEditar1}"
                                                    disabled="#{Pagina1.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{Pagina1.gestor.scriptEditar}"
                                                    rendered="#{Pagina1.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Pagina1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{Pagina1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Pagina1.botonEliminar1_action}"
                                                    binding="#{Pagina1.botonEliminar1}"
                                                    disabled="#{Pagina1.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{Pagina1.gestor.scriptEliminar}"
                                                    rendered="#{Pagina1.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Pagina1.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{Pagina1.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Pagina1.botonAplicar1_action}"
                                                    binding="#{Pagina1.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{Pagina1.gestor.scriptAplicar}"
                                                    rendered="#{Pagina1.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Pagina1.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{Pagina1.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Pagina1.botonDeshacer1_action}"
                                                    binding="#{Pagina1.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{Pagina1.gestor.scriptDeshacer}"
                                                    rendered="#{Pagina1.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Pagina1.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{Pagina1.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Pagina1.botonConfirmar1_action}"
                                                    binding="#{Pagina1.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{Pagina1.gestor.scriptConfirmar}"
                                                    rendered="#{Pagina1.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Pagina1.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{Pagina1.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Pagina1.botonDescartar1_action}"
                                                    binding="#{Pagina1.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{Pagina1.gestor.scriptDescartar}"
                                                    rendered="#{Pagina1.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Pagina1.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{Pagina1.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{Pagina1.listaFuncionAccion1}"
                                                    converter="#{Pagina1.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{Pagina1.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{Pagina1.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{Pagina1.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{Pagina1.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Pagina1.botonProcesar1_action}"
                                                    binding="#{Pagina1.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{Pagina1.gestor.scriptProcesar}"
                                                    rendered="#{Pagina1.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Pagina1.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{Pagina1.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Pagina1.botonRefrescar1_action}"
                                                    binding="#{Pagina1.botonRefrescar1}"
                                                    disabled="#{Pagina1.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{Pagina1.gestor.scriptRefrescar}"
                                                    rendered="#{Pagina1.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Pagina1.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{Pagina1.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Pagina1.botonReconsultar1_action}"
                                                    binding="#{Pagina1.botonReconsultar1}"
                                                    disabled="#{Pagina1.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{Pagina1.gestor.scriptReconsultar}"
                                                    rendered="#{Pagina1.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Pagina1.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{Pagina1.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Pagina1.botonRetornar1_action}"
                                                    binding="#{Pagina1.botonRetornar1}"
                                                    disabled="#{Pagina1.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{Pagina1.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{Pagina1.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Pagina1.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{Pagina1.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="2" 
                                                id="gridPanel109"
                                                rendered="#{Pagina1.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{Pagina1.imageHyperlink1_action}"
                                                    binding="#{Pagina1.imageHyperlink1}"
                                                    disabled="#{Pagina1.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{Pagina1.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{Pagina1.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.Pagina1_imageHyperlink1_toolTip}"/>
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{Pagina1.imageHyperlink2_action}"
                                                    binding="#{Pagina1.imageHyperlink2}"
                                                    disabled="#{Pagina1.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink2"
                                                    imageURL="#{Pagina1.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{Pagina1.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{Pagina1.gestor.designing}"
                                                    text="Hyperlink2"
                                                    toolTip="#{bundle.Pagina1_imageHyperlink2_toolTip}"/>
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
