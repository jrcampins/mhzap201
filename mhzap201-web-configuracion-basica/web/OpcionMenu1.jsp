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
                    focus="#{OpcionMenu1.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{OpcionMenu1.gestor.preserveFocus}"
                    preserveScroll="#{OpcionMenu1.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{OpcionMenu1.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | checkbox1 campoIdOpcionMenu1 campoCodigoOpcionMenu1 campoNombreOpcionMenu1 campoDescripcionOpcionMenu1 campoUrlOpcionMenu1 campoIdAplicacion1 campoIdPagina1 campoIdOpcionMenuSuperior1 listaEsOpcionMenuInactiva1 listaEsOpcionMenuSincronizada1 textoFilasPorPagina1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | textoFilasPorPagina1 | botonRepaginar1 , virtualForm3 | checkbox1 listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonEscogerFila1 botonDetallarFila1 botonProcesarFila1 botonRetornarFila1 botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{OpcionMenu1.breadcrumbs1}" 
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
                                                    rendered="#{OpcionMenu1.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{OpcionMenu1.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{OpcionMenu1.gestor.mensajeDisponible}"
                                                    text="#{OpcionMenu1.gestor.mensaje}"
                                                    url="#{OpcionMenu1.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:table
                                            binding="#{OpcionMenu1.table1}"
                                            clearSortButton="true" 
                                            deselectMultipleButton="true" 
                                            id="table1"
                                            paginateButton="false"
                                            paginationControls="true" 
                                            selectMultipleButton="true" 
                                            sortPanelToggleButton="true"
                                            width="960">
                                            <webuijsf:tableRowGroup 
                                                binding="#{OpcionMenu1.tableRowGroup1}" 
                                                id="tableRowGroup1" 
                                                rows="1"
                                                selected="#{OpcionMenu1.gestor.filaEscogida}" 
                                                sourceData="#{OpcionMenu1.opcionMenuDataProvider}" 
                                                sourceVar="currentRow">
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    id="tableRowGroup1SelectionColumn"
                                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);" 
                                                    selectId="checkbox1">
                                                    <webuijsf:checkbox 
                                                        binding="#{OpcionMenu1.checkbox1}" 
                                                        id="checkbox1"
                                                        onClick="#{OpcionMenu1.gestor.scriptElegir}" 
                                                        selected="#{OpcionMenu1.gestor.filaElegida}" 
                                                        toolTip="#{OpcionMenu1.gestor.i18n.toolTipCheckboxSeleccionMultiple}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    binding="#{OpcionMenu1.tableColumn1}" 
                                                    id="tableColumn1">
                                                    <webuijsf:button 
                                                        actionExpression="#{OpcionMenu1.botonEscogerFila1_action}"
                                                        binding="#{OpcionMenu1.botonEscogerFila1}"
                                                        disabled="#{OpcionMenu1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonEscogerFila1"
                                                        imageURL="#{OpcionMenu1.gestor.urlImagenEscoger}" 
                                                        onClick="#{OpcionMenu1.gestor.scriptEscoger}"
                                                        text="#{OpcionMenu1.gestor.i18n.textoBotonEscogerFila}"
                                                        toolTip="#{OpcionMenu1.gestor.i18n.toolTipBotonEscogerFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{OpcionMenu1.botonDetallarFila1_action}"
                                                        binding="#{OpcionMenu1.botonDetallarFila1}"
                                                        disabled="#{OpcionMenu1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonDetallarFila1"
                                                        imageURL="#{OpcionMenu1.gestor.urlImagenDetallar}" 
                                                        onClick="#{OpcionMenu1.scriptAbrirVentanaVerDetalle}"
                                                        rendered="#{OpcionMenu1.gestor.detalleDisponible}" 
                                                        text="#{OpcionMenu1.gestor.i18n.textoBotonDetallarFila}"
                                                        toolTip="#{OpcionMenu1.gestor.i18n.toolTipBotonDetallarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{OpcionMenu1.botonProcesarFila1_action}"
                                                        binding="#{OpcionMenu1.botonProcesarFila1}"
                                                        disabled="#{OpcionMenu1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonProcesarFila1"
                                                        imageURL="#{OpcionMenu1.gestor.urlImagenProcesar}" 
                                                        onClick="#{OpcionMenu1.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{OpcionMenu1.asistente.comandoDisponible}" 
                                                        text="#{OpcionMenu1.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{OpcionMenu1.gestor.i18n.toolTipBotonProcesarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{OpcionMenu1.botonRetornarFila1_action}"
                                                        binding="#{OpcionMenu1.botonRetornarFila1}" 
                                                        disabled="#{OpcionMenu1.gestor.funcionReturnInhabilitada}"
                                                        id="botonRetornarFila1"
                                                        imageURL="#{OpcionMenu1.gestor.urlImagenRetornar}"
                                                        onClick="#{OpcionMenu1.gestor.scriptRetornarRecursoActual}"
                                                        rendered="#{OpcionMenu1.gestor.funcionReturnVisible}" 
                                                        text="#{OpcionMenu1.gestor.i18n.textoBotonRetornarFila}"
                                                        toolTip="#{OpcionMenu1.gestor.i18n.toolTipBotonRetornarFila}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{OpcionMenu1.tableColumn2}"
                                                    id="tableColumn2"
                                                    rendered="#{OpcionMenu1.gestor.designing}">
                                                    <webuijsf:imageHyperlink
                                                        actionExpression="#{OpcionMenu1.hipervinculoAccionFila1_action}"
                                                        binding="#{OpcionMenu1.hipervinculoAccionFila1}"
                                                        disabled="#{OpcionMenu1.gestor.loteConCambios}"
                                                        id="hipervinculoAccionFila1"
                                                        imageURL="#{OpcionMenu1.gestor.urlImagenEjecutarVinculo}"
                                                        onClick="#{OpcionMenu1.scriptAbrirVentanaAccionFila1}"
                                                        text="Accion1"
                                                        toolTip="#{bundle.OpcionMenu1_hipervinculoAccionFila1_toolTip}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="right" 
                                                    binding="#{OpcionMenu1.tableColumn3}" 
                                                    headerText="#{OpcionMenu1.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{OpcionMenu1.gestor.i18n.toolTipEtiquetaIdentificacionFila}"
                                                    id="tableColumn3">
                                                    <webuijsf:imageHyperlink 
                                                        actionExpression="#{OpcionMenu1.hipervinculoDetallarFila1_action}"
                                                        binding="#{OpcionMenu1.hipervinculoDetallarFila1}" 
                                                        id="hipervinculoDetallarFila1"
                                                        imageURL="#{OpcionMenu1.gestor.urlImagenFilaProcesada}"
                                                        textPosition="left" 
                                                        text="#{OpcionMenu1.gestor.identificacionFila}" 
                                                        toolTip="#{OpcionMenu1.gestor.toolTipImagenFilaProcesada}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{OpcionMenu1.tableColumnIdOpcionMenu1}"
                                                    toolTip="BundleParametros.id_opcion_menu.opcion_menu"
                                                    headerText="identificaci&#243;n"
                                                    id="tableColumnIdOpcionMenu1"
                                                    sort="id_opcion_menu">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdOpcionMenu1"
                                                    text="#{currentRow.value['id_opcion_menu']}"
                                                    rendered="#{OpcionMenu1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{OpcionMenu1.labelIdOpcionMenu1}"
                                                    id="labelIdOpcionMenu1"
                                                    for="campoIdOpcionMenu1"/>
                                                <webuijsf:textField id="campoIdOpcionMenu1"
                                                    binding="#{OpcionMenu1.campoIdOpcionMenu1}"
                                                    converter="#{OpcionMenu1.converterIdOpcionMenu1}"
                                                    readOnly="#{OpcionMenu1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['id_opcion_menu']}"
                                                    toolTip="BundleParametros.id_opcion_menu.opcion_menu"
                                                    validatorExpression="#{OpcionMenu1.validatorIdOpcionMenu1.validate}"/>
                                                <webuijsf:staticText id="campoIdOpcionMenu1Texto1"
                                                    binding="#{OpcionMenu1.campoIdOpcionMenu1Texto1}"
                                                    text="#{currentRow.value['id_opcion_menu']}"/>
                                                <webuijsf:message id="messageIdOpcionMenu1"
                                                    for="campoIdOpcionMenu1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{OpcionMenu1.tableColumnCodigoOpcionMenu1}"
                                                    toolTip="BundleParametros.codigo_opcion_menu.opcion_menu"
                                                    headerText="c&#243;digo"
                                                    id="tableColumnCodigoOpcionMenu1"
                                                    sort="codigo_opcion_menu">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextCodigoOpcionMenu1"
                                                    text="#{currentRow.value['codigo_opcion_menu']}"
                                                    rendered="#{OpcionMenu1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{OpcionMenu1.labelCodigoOpcionMenu1}"
                                                    id="labelCodigoOpcionMenu1"
                                                    for="campoCodigoOpcionMenu1"/>
                                                <webuijsf:textField id="campoCodigoOpcionMenu1"
                                                    binding="#{OpcionMenu1.campoCodigoOpcionMenu1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{OpcionMenu1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['codigo_opcion_menu']}"
                                                    toolTip="BundleParametros.codigo_opcion_menu.opcion_menu"
                                                    validatorExpression="#{OpcionMenu1.validatorCodigoOpcionMenu1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoOpcionMenu1Texto1"
                                                    binding="#{OpcionMenu1.campoCodigoOpcionMenu1Texto1}"
                                                    text="#{currentRow.value['codigo_opcion_menu']}"/>
                                                <webuijsf:message id="messageCodigoOpcionMenu1"
                                                    for="campoCodigoOpcionMenu1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{OpcionMenu1.tableColumnNombreOpcionMenu1}"
                                                    toolTip="BundleParametros.nombre_opcion_menu.opcion_menu"
                                                    headerText="nombre"
                                                    id="tableColumnNombreOpcionMenu1"
                                                    sort="nombre_opcion_menu">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNombreOpcionMenu1"
                                                    text="#{currentRow.value['nombre_opcion_menu']}"
                                                    rendered="#{OpcionMenu1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{OpcionMenu1.labelNombreOpcionMenu1}"
                                                    id="labelNombreOpcionMenu1"
                                                    for="campoNombreOpcionMenu1"/>
                                                <webuijsf:textField id="campoNombreOpcionMenu1"
                                                    binding="#{OpcionMenu1.campoNombreOpcionMenu1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{OpcionMenu1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['nombre_opcion_menu']}"
                                                    toolTip="BundleParametros.nombre_opcion_menu.opcion_menu"
                                                    validatorExpression="#{OpcionMenu1.validatorNombreOpcionMenu1.validate}"/>
                                                <webuijsf:staticText id="campoNombreOpcionMenu1Texto1"
                                                    binding="#{OpcionMenu1.campoNombreOpcionMenu1Texto1}"
                                                    text="#{currentRow.value['nombre_opcion_menu']}"/>
                                                <webuijsf:message id="messageNombreOpcionMenu1"
                                                    for="campoNombreOpcionMenu1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{OpcionMenu1.tableColumnDescripcionOpcionMenu1}"
                                                    toolTip="BundleParametros.descripcion_opcion_menu.opcion_menu"
                                                    headerText="descripci&#243;n"
                                                    id="tableColumnDescripcionOpcionMenu1" rendered="false"
                                                    sort="descripcion_opcion_menu">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextDescripcionOpcionMenu1"
                                                    text="#{currentRow.value['descripcion_opcion_menu']}"
                                                    rendered="#{OpcionMenu1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{OpcionMenu1.labelDescripcionOpcionMenu1}"
                                                    id="labelDescripcionOpcionMenu1"
                                                    for="campoDescripcionOpcionMenu1"/>
                                                <webuijsf:textArea id="campoDescripcionOpcionMenu1"
                                                    binding="#{OpcionMenu1.campoDescripcionOpcionMenu1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{OpcionMenu1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['descripcion_opcion_menu']}"
                                                    toolTip="BundleParametros.descripcion_opcion_menu.opcion_menu"
                                                    validatorExpression="#{OpcionMenu1.validatorDescripcionOpcionMenu1.validate}"/>
                                                <webuijsf:staticText id="campoDescripcionOpcionMenu1Texto1"
                                                    binding="#{OpcionMenu1.campoDescripcionOpcionMenu1Texto1}"
                                                    text="#{currentRow.value['descripcion_opcion_menu']}"/>
                                                <webuijsf:message id="messageDescripcionOpcionMenu1"
                                                    for="campoDescripcionOpcionMenu1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{OpcionMenu1.tableColumnUrlOpcionMenu1}"
                                                    toolTip="BundleParametros.url_opcion_menu.opcion_menu"
                                                    headerText="url"
                                                    id="tableColumnUrlOpcionMenu1" rendered="false"
                                                    sort="url_opcion_menu">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextUrlOpcionMenu1"
                                                    text="#{currentRow.value['url_opcion_menu']}"
                                                    rendered="#{OpcionMenu1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{OpcionMenu1.labelUrlOpcionMenu1}"
                                                    id="labelUrlOpcionMenu1"
                                                    for="campoUrlOpcionMenu1"/>
                                                <webuijsf:textArea id="campoUrlOpcionMenu1"
                                                    binding="#{OpcionMenu1.campoUrlOpcionMenu1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{OpcionMenu1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['url_opcion_menu']}"
                                                    toolTip="BundleParametros.url_opcion_menu.opcion_menu"
                                                    validatorExpression="#{OpcionMenu1.validatorUrlOpcionMenu1.validate}"/>
                                                <webuijsf:staticText id="campoUrlOpcionMenu1Texto1"
                                                    binding="#{OpcionMenu1.campoUrlOpcionMenu1Texto1}"
                                                    text="#{currentRow.value['url_opcion_menu']}"/>
                                                <webuijsf:message id="messageUrlOpcionMenu1"
                                                    for="campoUrlOpcionMenu1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{OpcionMenu1.tableColumnIdAplicacion1}"
                                                    toolTip="BundleParametros.id_aplicacion.opcion_menu"
                                                    headerText="aplicaci&#243;n"
                                                    id="tableColumnIdAplicacion1" rendered="false"
                                                    sort="codigo_aplicacion_1x1y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdAplicacion1"
                                                    text="#{currentRow.value['codigo_aplicacion_1x1y3']}"
                                                    rendered="#{OpcionMenu1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{OpcionMenu1.labelIdAplicacion1}"
                                                    id="labelIdAplicacion1"
                                                    for="campoIdAplicacion1"/>
                                                <webuijsf:textField id="campoIdAplicacion1"
                                                    binding="#{OpcionMenu1.campoIdAplicacion1}"
                                                    readOnly="#{OpcionMenu1.gestor.filaNoProcesada}"
                                                    text="#{OpcionMenu1.asistente.textoCampoIdAplicacion1}"
                                                    toolTip="#{OpcionMenu1.asistente.toolTipCampoIdAplicacion1}"
                                                    validatorExpression="#{OpcionMenu1.campoIdAplicacion1_validate}"/>
                                                <webuijsf:staticText id="campoIdAplicacion1Texto1"
                                                    binding="#{OpcionMenu1.campoIdAplicacion1Texto1}"
                                                    text="#{currentRow.value['codigo_aplicacion_1x1y3']}"/>
                                                <webuijsf:message id="messageIdAplicacion1"
                                                    for="campoIdAplicacion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdAplicacion3" rendered="false"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdAplicacion3"
                                                    text="#{currentRow.value['id_aplicacion']}"
                                                    rendered="#{OpcionMenu1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{OpcionMenu1.campoIdAplicacion1Boton1}"
                                                    id="campoIdAplicacion1Boton1"
                                                    onClick="#{OpcionMenu1.asistente.scriptCampoIdAplicacion1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{OpcionMenu1.campoIdAplicacion1Boton3}"
                                                    id="campoIdAplicacion1Boton3"
                                                    onClick="#{OpcionMenu1.asistente.scriptCampoIdAplicacion1Boton2}"
                                                    rendered="#{OpcionMenu1.asistente.campoIdAplicacion1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{OpcionMenu1.tableColumnIdAplicacion2}"
                                                    headerText="nombre aplicaci&#243;n"
                                                    id="tableColumnIdAplicacion2" rendered="false"
                                                    sort="nombre_aplicacion_1x1y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdAplicacion2"
                                                    text="#{currentRow.value['nombre_aplicacion_1x1y4']}"
                                                    rendered="#{OpcionMenu1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{OpcionMenu1.labelIdAplicacion2}"
                                                    id="labelIdAplicacion2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{OpcionMenu1.campoIdAplicacion1Hiper1}"
                                                    id="campoIdAplicacion1Hiper1"
                                                    text="#{currentRow.value['nombre_aplicacion_1x1y4']}"
                                                    onClick="#{OpcionMenu1.asistente.scriptCampoIdAplicacion1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdAplicacion1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{OpcionMenu1.tableColumnIdPagina1}"
                                                    toolTip="BundleParametros.id_pagina.opcion_menu"
                                                    headerText="p&#225;gina"
                                                    id="tableColumnIdPagina1" rendered="false"
                                                    sort="codigo_pagina_1x2y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdPagina1"
                                                    text="#{currentRow.value['codigo_pagina_1x2y3']}"
                                                    rendered="#{OpcionMenu1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{OpcionMenu1.labelIdPagina1}"
                                                    id="labelIdPagina1"
                                                    for="campoIdPagina1"/>
                                                <webuijsf:textField id="campoIdPagina1"
                                                    binding="#{OpcionMenu1.campoIdPagina1}"
                                                    readOnly="#{OpcionMenu1.gestor.filaNoProcesada}"
                                                    text="#{OpcionMenu1.asistente.textoCampoIdPagina1}"
                                                    toolTip="#{OpcionMenu1.asistente.toolTipCampoIdPagina1}"
                                                    validatorExpression="#{OpcionMenu1.campoIdPagina1_validate}"/>
                                                <webuijsf:staticText id="campoIdPagina1Texto1"
                                                    binding="#{OpcionMenu1.campoIdPagina1Texto1}"
                                                    text="#{currentRow.value['codigo_pagina_1x2y3']}"/>
                                                <webuijsf:message id="messageIdPagina1"
                                                    for="campoIdPagina1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdPagina3" rendered="false"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdPagina3"
                                                    text="#{currentRow.value['id_pagina']}"
                                                    rendered="#{OpcionMenu1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{OpcionMenu1.campoIdPagina1Boton1}"
                                                    id="campoIdPagina1Boton1"
                                                    onClick="#{OpcionMenu1.asistente.scriptCampoIdPagina1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{OpcionMenu1.campoIdPagina1Boton3}"
                                                    id="campoIdPagina1Boton3"
                                                    onClick="#{OpcionMenu1.asistente.scriptCampoIdPagina1Boton2}"
                                                    rendered="#{OpcionMenu1.asistente.campoIdPagina1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{OpcionMenu1.tableColumnIdPagina2}"
                                                    headerText="nombre p&#225;gina"
                                                    id="tableColumnIdPagina2" rendered="false"
                                                    sort="nombre_pagina_1x2y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdPagina2"
                                                    text="#{currentRow.value['nombre_pagina_1x2y4']}"
                                                    rendered="#{OpcionMenu1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{OpcionMenu1.labelIdPagina2}"
                                                    id="labelIdPagina2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{OpcionMenu1.campoIdPagina1Hiper1}"
                                                    id="campoIdPagina1Hiper1"
                                                    text="#{currentRow.value['nombre_pagina_1x2y4']}"
                                                    onClick="#{OpcionMenu1.asistente.scriptCampoIdPagina1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdPagina1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{OpcionMenu1.tableColumnIdOpcionMenuSuperior1}"
                                                    toolTip="BundleParametros.id_opcion_menu_superior.opcion_menu"
                                                    headerText="opci&#243;n men&#250; superior"
                                                    id="tableColumnIdOpcionMenuSuperior1"
                                                    sort="codigo_opcion_menu_1x3y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdOpcionMenuSuperior1"
                                                    text="#{currentRow.value['codigo_opcion_menu_1x3y3']}"
                                                    rendered="#{OpcionMenu1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{OpcionMenu1.labelIdOpcionMenuSuperior1}"
                                                    id="labelIdOpcionMenuSuperior1"
                                                    for="campoIdOpcionMenuSuperior1"/>
                                                <webuijsf:textField id="campoIdOpcionMenuSuperior1"
                                                    binding="#{OpcionMenu1.campoIdOpcionMenuSuperior1}"
                                                    readOnly="#{OpcionMenu1.gestor.filaNoProcesada}"
                                                    text="#{OpcionMenu1.asistente.textoCampoIdOpcionMenuSuperior1}"
                                                    toolTip="#{OpcionMenu1.asistente.toolTipCampoIdOpcionMenuSuperior1}"
                                                    validatorExpression="#{OpcionMenu1.campoIdOpcionMenuSuperior1_validate}"/>
                                                <webuijsf:staticText id="campoIdOpcionMenuSuperior1Texto1"
                                                    binding="#{OpcionMenu1.campoIdOpcionMenuSuperior1Texto1}"
                                                    text="#{currentRow.value['codigo_opcion_menu_1x3y3']}"/>
                                                <webuijsf:message id="messageIdOpcionMenuSuperior1"
                                                    for="campoIdOpcionMenuSuperior1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdOpcionMenuSuperior3"
                                                    rendered="#{OpcionMenu1.asistente.tableColumnIdOpcionMenuSuperior3Rendered}"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdOpcionMenuSuperior3"
                                                    text="#{currentRow.value['id_opcion_menu_superior']}"
                                                    rendered="#{OpcionMenu1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{OpcionMenu1.campoIdOpcionMenuSuperior1Boton1}"
                                                    id="campoIdOpcionMenuSuperior1Boton1"
                                                    onClick="#{OpcionMenu1.asistente.scriptCampoIdOpcionMenuSuperior1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{OpcionMenu1.campoIdOpcionMenuSuperior1Boton3}"
                                                    id="campoIdOpcionMenuSuperior1Boton3"
                                                    onClick="#{OpcionMenu1.asistente.scriptCampoIdOpcionMenuSuperior1Boton2}"
                                                    rendered="#{OpcionMenu1.asistente.campoIdOpcionMenuSuperior1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{OpcionMenu1.tableColumnIdOpcionMenuSuperior2}"
                                                    headerText="nombre opci&#243;n men&#250; superior"
                                                    id="tableColumnIdOpcionMenuSuperior2"
                                                    rendered="#{OpcionMenu1.asistente.campoIdOpcionMenuSuperior1Boton2Rendered}"
                                                    sort="nombre_opcion_menu_1x3y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdOpcionMenuSuperior2"
                                                    text="#{currentRow.value['nombre_opcion_menu_1x3y4']}"
                                                    rendered="#{OpcionMenu1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{OpcionMenu1.labelIdOpcionMenuSuperior2}"
                                                    id="labelIdOpcionMenuSuperior2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{OpcionMenu1.campoIdOpcionMenuSuperior1Hiper1}"
                                                    id="campoIdOpcionMenuSuperior1Hiper1"
                                                    text="#{currentRow.value['nombre_opcion_menu_1x3y4']}"
                                                    onClick="#{OpcionMenu1.asistente.scriptCampoIdOpcionMenuSuperior1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdOpcionMenuSuperior1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{OpcionMenu1.tableColumnEsOpcionMenuInactiva1}"
                                                    toolTip="BundleParametros.es_opcion_menu_inactiva.opcion_menu"
                                                    headerText="inactiva"
                                                    id="tableColumnEsOpcionMenuInactiva1"
                                                    sort="es_opcion_menu_inactiva">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsOpcionMenuInactiva1"
                                                    text="#{currentRow.value['es_opcion_menu_inactiva']}"
                                                    rendered="#{OpcionMenu1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{OpcionMenu1.labelEsOpcionMenuInactiva1}"
                                                    id="labelEsOpcionMenuInactiva1"
                                                    for="listaEsOpcionMenuInactiva1"/>
                                                <webuijsf:dropDown id="listaEsOpcionMenuInactiva1"
                                                    binding="#{OpcionMenu1.listaEsOpcionMenuInactiva1}"
                                                    converter="#{OpcionMenu1.converterEsOpcionMenuInactiva1}"
                                                    disabled="true"
                                                    items="#{OpcionMenu1.asistente.opcionesListaEsOpcionMenuInactiva1}"
                                                    selected="#{currentRow.value['es_opcion_menu_inactiva']}"
                                                    toolTip="BundleParametros.es_opcion_menu_inactiva.opcion_menu"/>
                                                <webuijsf:staticText id="listaEsOpcionMenuInactiva1Texto1"
                                                    binding="#{OpcionMenu1.listaEsOpcionMenuInactiva1Texto1}"/>
                                                <webuijsf:message id="messageEsOpcionMenuInactiva1"
                                                    for="listaEsOpcionMenuInactiva1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{OpcionMenu1.tableColumnEsOpcionMenuSincronizada1}"
                                                    toolTip="BundleParametros.es_opcion_menu_sincronizada.opcion_menu"
                                                    headerText="sincronizada"
                                                    id="tableColumnEsOpcionMenuSincronizada1" rendered="false"
                                                    sort="es_opcion_menu_sincronizada">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsOpcionMenuSincronizada1"
                                                    text="#{currentRow.value['es_opcion_menu_sincronizada']}"
                                                    rendered="#{OpcionMenu1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{OpcionMenu1.labelEsOpcionMenuSincronizada1}"
                                                    id="labelEsOpcionMenuSincronizada1"
                                                    for="listaEsOpcionMenuSincronizada1"/>
                                                <webuijsf:dropDown id="listaEsOpcionMenuSincronizada1"
                                                    binding="#{OpcionMenu1.listaEsOpcionMenuSincronizada1}"
                                                    converter="#{OpcionMenu1.converterEsOpcionMenuSincronizada1}"
                                                    disabled="#{OpcionMenu1.gestor.filaNoProcesada}" required="true"
                                                    items="#{OpcionMenu1.asistente.opcionesListaEsOpcionMenuSincronizada1}"
                                                    selected="#{currentRow.value['es_opcion_menu_sincronizada']}"
                                                    toolTip="BundleParametros.es_opcion_menu_sincronizada.opcion_menu"/>
                                                <webuijsf:staticText id="listaEsOpcionMenuSincronizada1Texto1"
                                                    binding="#{OpcionMenu1.listaEsOpcionMenuSincronizada1Texto1}"/>
                                                <webuijsf:message id="messageEsOpcionMenuSincronizada1"
                                                    for="listaEsOpcionMenuSincronizada1"/>
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
                                                        binding="#{OpcionMenu1.etiquetaTextoFilasPorPagina1}" 
                                                        for="textoFilasPorPagina1"
                                                        id="etiquetaTextoFilasPorPagina1" 
                                                        text="#{OpcionMenu1.gestor.i18n.textoEtiquetaTextoFilasPorPagina}"/>
                                                </h:panelGrid>
                                                <h:panelGrid 
                                                    columns="3" 
                                                    id="gridPanel107">
                                                    <webuijsf:textField 
                                                        binding="#{OpcionMenu1.textoFilasPorPagina1}" 
                                                        columns="2"
                                                        converter="#{OpcionMenu1.textoFilasPorPagina1Converter1}"
                                                        disabled="#{OpcionMenu1.gestor.paginacionInhabilitada}" 
                                                        id="textoFilasPorPagina1" maxLength="2"
                                                        text="#{OpcionMenu1.gestor.filasPorPagina}" 
                                                        validatorExpression="#{OpcionMenu1.textoFilasPorPagina1Validator1.validate}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{OpcionMenu1.botonRepaginar1_action}"
                                                        binding="#{OpcionMenu1.botonRepaginar1}" 
                                                        id="botonRepaginar1"
                                                        imageURL="#{OpcionMenu1.gestor.urlImagenRepaginar}" 
                                                        onClick="#{OpcionMenu1.gestor.scriptRepaginar}"
                                                        text="#{OpcionMenu1.gestor.i18n.textoBotonRepaginar}"
                                                        toolTip="#{OpcionMenu1.gestor.i18n.toolTipBotonRepaginar}"/>
                                                    <webuijsf:message 
                                                        for="textoFilasPorPagina1" 
                                                        id="messageFilasPorPagina1"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="13"
                                                id="gridPanel108">
                                                <webuijsf:button
                                                    actionExpression="#{OpcionMenu1.botonAgregar1_action}"
                                                    binding="#{OpcionMenu1.botonAgregar1}"
                                                    disabled="#{OpcionMenu1.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{OpcionMenu1.gestor.scriptAgregar}"
                                                    rendered="#{OpcionMenu1.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{OpcionMenu1.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{OpcionMenu1.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{OpcionMenu1.listaFuncionEdicion1}"
                                                    converter="#{OpcionMenu1.converterListaFuncionEdicion1}"
                                                    disabled="#{OpcionMenu1.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{OpcionMenu1.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{OpcionMenu1.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{OpcionMenu1.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{OpcionMenu1.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{OpcionMenu1.botonEditar1_action}"
                                                    binding="#{OpcionMenu1.botonEditar1}"
                                                    disabled="#{OpcionMenu1.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{OpcionMenu1.gestor.scriptEditar}"
                                                    rendered="#{OpcionMenu1.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{OpcionMenu1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{OpcionMenu1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{OpcionMenu1.botonEliminar1_action}"
                                                    binding="#{OpcionMenu1.botonEliminar1}"
                                                    disabled="#{OpcionMenu1.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{OpcionMenu1.gestor.scriptEliminar}"
                                                    rendered="#{OpcionMenu1.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{OpcionMenu1.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{OpcionMenu1.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{OpcionMenu1.botonAplicar1_action}"
                                                    binding="#{OpcionMenu1.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{OpcionMenu1.gestor.scriptAplicar}"
                                                    rendered="#{OpcionMenu1.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{OpcionMenu1.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{OpcionMenu1.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{OpcionMenu1.botonDeshacer1_action}"
                                                    binding="#{OpcionMenu1.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{OpcionMenu1.gestor.scriptDeshacer}"
                                                    rendered="#{OpcionMenu1.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{OpcionMenu1.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{OpcionMenu1.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{OpcionMenu1.botonConfirmar1_action}"
                                                    binding="#{OpcionMenu1.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{OpcionMenu1.gestor.scriptConfirmar}"
                                                    rendered="#{OpcionMenu1.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{OpcionMenu1.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{OpcionMenu1.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{OpcionMenu1.botonDescartar1_action}"
                                                    binding="#{OpcionMenu1.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{OpcionMenu1.gestor.scriptDescartar}"
                                                    rendered="#{OpcionMenu1.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{OpcionMenu1.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{OpcionMenu1.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{OpcionMenu1.listaFuncionAccion1}"
                                                    converter="#{OpcionMenu1.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{OpcionMenu1.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{OpcionMenu1.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{OpcionMenu1.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{OpcionMenu1.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{OpcionMenu1.botonProcesar1_action}"
                                                    binding="#{OpcionMenu1.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{OpcionMenu1.gestor.scriptProcesar}"
                                                    rendered="#{OpcionMenu1.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{OpcionMenu1.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{OpcionMenu1.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{OpcionMenu1.botonRefrescar1_action}"
                                                    binding="#{OpcionMenu1.botonRefrescar1}"
                                                    disabled="#{OpcionMenu1.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{OpcionMenu1.gestor.scriptRefrescar}"
                                                    rendered="#{OpcionMenu1.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{OpcionMenu1.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{OpcionMenu1.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{OpcionMenu1.botonReconsultar1_action}"
                                                    binding="#{OpcionMenu1.botonReconsultar1}"
                                                    disabled="#{OpcionMenu1.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{OpcionMenu1.gestor.scriptReconsultar}"
                                                    rendered="#{OpcionMenu1.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{OpcionMenu1.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{OpcionMenu1.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{OpcionMenu1.botonRetornar1_action}"
                                                    binding="#{OpcionMenu1.botonRetornar1}"
                                                    disabled="#{OpcionMenu1.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{OpcionMenu1.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{OpcionMenu1.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{OpcionMenu1.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{OpcionMenu1.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel109"
                                                rendered="#{OpcionMenu1.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{OpcionMenu1.imageHyperlink1_action}"
                                                    binding="#{OpcionMenu1.imageHyperlink1}"
                                                    disabled="#{OpcionMenu1.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{OpcionMenu1.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{OpcionMenu1.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{OpcionMenu1.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.OpcionMenu1_imageHyperlink1_toolTip}"/>
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
