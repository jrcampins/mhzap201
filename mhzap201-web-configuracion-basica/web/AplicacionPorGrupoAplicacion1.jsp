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
                    focus="#{AplicacionPorGrupoAplicacion1.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{AplicacionPorGrupoAplicacion1.gestor.preserveFocus}"
                    preserveScroll="#{AplicacionPorGrupoAplicacion1.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{AplicacionPorGrupoAplicacion1.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | checkbox1 campoIdAplicacion1 campoCodigoAplicacion1 campoNombreAplicacion1 campoDescripcionAplicacion1 campoServidorAplicacion1 campoPuertoAplicacion1 campoUrlAplicacion1 listaEsPublica1 textoFilasPorPagina1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | textoFilasPorPagina1 | botonRepaginar1 , virtualForm3 | checkbox1 listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonEscogerFila1 botonDetallarFila1 botonProcesarFila1 botonRetornarFila1 botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{AplicacionPorGrupoAplicacion1.breadcrumbs1}" 
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
                                                    rendered="#{AplicacionPorGrupoAplicacion1.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{AplicacionPorGrupoAplicacion1.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{AplicacionPorGrupoAplicacion1.gestor.mensajeDisponible}"
                                                    text="#{AplicacionPorGrupoAplicacion1.gestor.mensaje}"
                                                    url="#{AplicacionPorGrupoAplicacion1.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:table
                                            binding="#{AplicacionPorGrupoAplicacion1.table1}"
                                            clearSortButton="true" 
                                            deselectMultipleButton="true" 
                                            id="table1"
                                            paginateButton="false"
                                            paginationControls="true" 
                                            selectMultipleButton="true" 
                                            sortPanelToggleButton="true"
                                            width="960">
                                            <webuijsf:tableRowGroup 
                                                binding="#{AplicacionPorGrupoAplicacion1.tableRowGroup1}" 
                                                id="tableRowGroup1" 
                                                rows="1"
                                                selected="#{AplicacionPorGrupoAplicacion1.gestor.filaEscogida}" 
                                                sourceData="#{AplicacionPorGrupoAplicacion1.aplicacionDataProvider}" 
                                                sourceVar="currentRow">
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    id="tableRowGroup1SelectionColumn"
                                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);" 
                                                    selectId="checkbox1">
                                                    <webuijsf:checkbox 
                                                        binding="#{AplicacionPorGrupoAplicacion1.checkbox1}" 
                                                        id="checkbox1"
                                                        onClick="#{AplicacionPorGrupoAplicacion1.gestor.scriptElegir}" 
                                                        selected="#{AplicacionPorGrupoAplicacion1.gestor.filaElegida}" 
                                                        toolTip="#{AplicacionPorGrupoAplicacion1.gestor.i18n.toolTipCheckboxSeleccionMultiple}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    binding="#{AplicacionPorGrupoAplicacion1.tableColumn1}" 
                                                    id="tableColumn1">
                                                    <webuijsf:button 
                                                        actionExpression="#{AplicacionPorGrupoAplicacion1.botonEscogerFila1_action}"
                                                        binding="#{AplicacionPorGrupoAplicacion1.botonEscogerFila1}"
                                                        disabled="#{AplicacionPorGrupoAplicacion1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonEscogerFila1"
                                                        imageURL="#{AplicacionPorGrupoAplicacion1.gestor.urlImagenEscoger}" 
                                                        onClick="#{AplicacionPorGrupoAplicacion1.gestor.scriptEscoger}"
                                                        text="#{AplicacionPorGrupoAplicacion1.gestor.i18n.textoBotonEscogerFila}"
                                                        toolTip="#{AplicacionPorGrupoAplicacion1.gestor.i18n.toolTipBotonEscogerFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{AplicacionPorGrupoAplicacion1.botonDetallarFila1_action}"
                                                        binding="#{AplicacionPorGrupoAplicacion1.botonDetallarFila1}"
                                                        disabled="#{AplicacionPorGrupoAplicacion1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonDetallarFila1"
                                                        imageURL="#{AplicacionPorGrupoAplicacion1.gestor.urlImagenDetallar}" 
                                                        onClick="#{AplicacionPorGrupoAplicacion1.scriptAbrirVentanaVerDetalle}"
                                                        rendered="#{AplicacionPorGrupoAplicacion1.gestor.detalleDisponible}" 
                                                        text="#{AplicacionPorGrupoAplicacion1.gestor.i18n.textoBotonDetallarFila}"
                                                        toolTip="#{AplicacionPorGrupoAplicacion1.gestor.i18n.toolTipBotonDetallarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{AplicacionPorGrupoAplicacion1.botonProcesarFila1_action}"
                                                        binding="#{AplicacionPorGrupoAplicacion1.botonProcesarFila1}"
                                                        disabled="#{AplicacionPorGrupoAplicacion1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonProcesarFila1"
                                                        imageURL="#{AplicacionPorGrupoAplicacion1.gestor.urlImagenProcesar}" 
                                                        onClick="#{AplicacionPorGrupoAplicacion1.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{AplicacionPorGrupoAplicacion1.asistente.comandoDisponible}" 
                                                        text="#{AplicacionPorGrupoAplicacion1.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{AplicacionPorGrupoAplicacion1.gestor.i18n.toolTipBotonProcesarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{AplicacionPorGrupoAplicacion1.botonRetornarFila1_action}"
                                                        binding="#{AplicacionPorGrupoAplicacion1.botonRetornarFila1}" 
                                                        disabled="#{AplicacionPorGrupoAplicacion1.gestor.funcionReturnInhabilitada}"
                                                        id="botonRetornarFila1"
                                                        imageURL="#{AplicacionPorGrupoAplicacion1.gestor.urlImagenRetornar}"
                                                        onClick="#{AplicacionPorGrupoAplicacion1.gestor.scriptRetornarRecursoActual}"
                                                        rendered="#{AplicacionPorGrupoAplicacion1.gestor.funcionReturnVisible}" 
                                                        text="#{AplicacionPorGrupoAplicacion1.gestor.i18n.textoBotonRetornarFila}"
                                                        toolTip="#{AplicacionPorGrupoAplicacion1.gestor.i18n.toolTipBotonRetornarFila}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{AplicacionPorGrupoAplicacion1.tableColumn2}"
                                                    id="tableColumn2"
                                                    rendered="#{AplicacionPorGrupoAplicacion1.gestor.designing}">
                                                    <webuijsf:imageHyperlink
                                                        actionExpression="#{AplicacionPorGrupoAplicacion1.hipervinculoAccionFila1_action}"
                                                        binding="#{AplicacionPorGrupoAplicacion1.hipervinculoAccionFila1}"
                                                        disabled="#{AplicacionPorGrupoAplicacion1.gestor.loteConCambios}"
                                                        id="hipervinculoAccionFila1"
                                                        imageURL="#{AplicacionPorGrupoAplicacion1.gestor.urlImagenEjecutarVinculo}"
                                                        onClick="#{AplicacionPorGrupoAplicacion1.scriptAbrirVentanaAccionFila1}"
                                                        text="Accion1"
                                                        toolTip="#{bundle.AplicacionPorGrupoAplicacion1_hipervinculoAccionFila1_toolTip}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="right" 
                                                    binding="#{AplicacionPorGrupoAplicacion1.tableColumn3}" 
                                                    headerText="#{AplicacionPorGrupoAplicacion1.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{AplicacionPorGrupoAplicacion1.gestor.i18n.toolTipEtiquetaIdentificacionFila}"
                                                    id="tableColumn3">
                                                    <webuijsf:imageHyperlink 
                                                        actionExpression="#{AplicacionPorGrupoAplicacion1.hipervinculoDetallarFila1_action}"
                                                        binding="#{AplicacionPorGrupoAplicacion1.hipervinculoDetallarFila1}" 
                                                        id="hipervinculoDetallarFila1"
                                                        imageURL="#{AplicacionPorGrupoAplicacion1.gestor.urlImagenFilaProcesada}"
                                                        textPosition="left" 
                                                        text="#{AplicacionPorGrupoAplicacion1.gestor.identificacionFila}" 
                                                        toolTip="#{AplicacionPorGrupoAplicacion1.gestor.toolTipImagenFilaProcesada}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{AplicacionPorGrupoAplicacion1.tableColumnIdAplicacion1}"
                                                    headerText="id"
                                                    id="tableColumnIdAplicacion1"
                                                    sort="id_aplicacion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdAplicacion1"
                                                    text="#{currentRow.value['id_aplicacion']}"
                                                    rendered="#{AplicacionPorGrupoAplicacion1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{AplicacionPorGrupoAplicacion1.labelIdAplicacion1}"
                                                    id="labelIdAplicacion1"
                                                    for="campoIdAplicacion1"/>
                                                <webuijsf:textField id="campoIdAplicacion1"
                                                    binding="#{AplicacionPorGrupoAplicacion1.campoIdAplicacion1}"
                                                    converter="#{AplicacionPorGrupoAplicacion1.converterIdAplicacion1}"
                                                    readOnly="#{AplicacionPorGrupoAplicacion1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['id_aplicacion']}"
                                                    toolTip="BundleParametros.id_aplicacion.aplicacion"
                                                    validatorExpression="#{AplicacionPorGrupoAplicacion1.validatorIdAplicacion1.validate}"/>
                                                <webuijsf:staticText id="campoIdAplicacion1Texto1"
                                                    binding="#{AplicacionPorGrupoAplicacion1.campoIdAplicacion1Texto1}"
                                                    text="#{currentRow.value['id_aplicacion']}"/>
                                                <webuijsf:message id="messageIdAplicacion1"
                                                    for="campoIdAplicacion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{AplicacionPorGrupoAplicacion1.tableColumnCodigoAplicacion1}"
                                                    headerText="codigo"
                                                    id="tableColumnCodigoAplicacion1"
                                                    sort="codigo_aplicacion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextCodigoAplicacion1"
                                                    text="#{currentRow.value['codigo_aplicacion']}"
                                                    rendered="#{AplicacionPorGrupoAplicacion1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{AplicacionPorGrupoAplicacion1.labelCodigoAplicacion1}"
                                                    id="labelCodigoAplicacion1"
                                                    for="campoCodigoAplicacion1"/>
                                                <webuijsf:textField id="campoCodigoAplicacion1"
                                                    binding="#{AplicacionPorGrupoAplicacion1.campoCodigoAplicacion1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{AplicacionPorGrupoAplicacion1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['codigo_aplicacion']}"
                                                    toolTip="BundleParametros.codigo_aplicacion.aplicacion"
                                                    validatorExpression="#{AplicacionPorGrupoAplicacion1.validatorCodigoAplicacion1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoAplicacion1Texto1"
                                                    binding="#{AplicacionPorGrupoAplicacion1.campoCodigoAplicacion1Texto1}"
                                                    text="#{currentRow.value['codigo_aplicacion']}"/>
                                                <webuijsf:message id="messageCodigoAplicacion1"
                                                    for="campoCodigoAplicacion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{AplicacionPorGrupoAplicacion1.tableColumnNombreAplicacion1}"
                                                    headerText="nombre"
                                                    id="tableColumnNombreAplicacion1"
                                                    sort="nombre_aplicacion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNombreAplicacion1"
                                                    text="#{currentRow.value['nombre_aplicacion']}"
                                                    rendered="#{AplicacionPorGrupoAplicacion1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{AplicacionPorGrupoAplicacion1.labelNombreAplicacion1}"
                                                    id="labelNombreAplicacion1"
                                                    for="campoNombreAplicacion1"/>
                                                <webuijsf:textField id="campoNombreAplicacion1"
                                                    binding="#{AplicacionPorGrupoAplicacion1.campoNombreAplicacion1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{AplicacionPorGrupoAplicacion1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['nombre_aplicacion']}"
                                                    toolTip="BundleParametros.nombre_aplicacion.aplicacion"
                                                    validatorExpression="#{AplicacionPorGrupoAplicacion1.validatorNombreAplicacion1.validate}"/>
                                                <webuijsf:staticText id="campoNombreAplicacion1Texto1"
                                                    binding="#{AplicacionPorGrupoAplicacion1.campoNombreAplicacion1Texto1}"
                                                    text="#{currentRow.value['nombre_aplicacion']}"/>
                                                <webuijsf:message id="messageNombreAplicacion1"
                                                    for="campoNombreAplicacion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{AplicacionPorGrupoAplicacion1.tableColumnDescripcionAplicacion1}"
                                                    headerText="descripcion"
                                                    id="tableColumnDescripcionAplicacion1" rendered="false"
                                                    sort="descripcion_aplicacion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextDescripcionAplicacion1"
                                                    text="#{currentRow.value['descripcion_aplicacion']}"
                                                    rendered="#{AplicacionPorGrupoAplicacion1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{AplicacionPorGrupoAplicacion1.labelDescripcionAplicacion1}"
                                                    id="labelDescripcionAplicacion1"
                                                    for="campoDescripcionAplicacion1"/>
                                                <webuijsf:textArea id="campoDescripcionAplicacion1"
                                                    binding="#{AplicacionPorGrupoAplicacion1.campoDescripcionAplicacion1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{AplicacionPorGrupoAplicacion1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['descripcion_aplicacion']}"
                                                    toolTip="BundleParametros.descripcion_aplicacion.aplicacion"
                                                    validatorExpression="#{AplicacionPorGrupoAplicacion1.validatorDescripcionAplicacion1.validate}"/>
                                                <webuijsf:staticText id="campoDescripcionAplicacion1Texto1"
                                                    binding="#{AplicacionPorGrupoAplicacion1.campoDescripcionAplicacion1Texto1}"
                                                    text="#{currentRow.value['descripcion_aplicacion']}"/>
                                                <webuijsf:message id="messageDescripcionAplicacion1"
                                                    for="campoDescripcionAplicacion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{AplicacionPorGrupoAplicacion1.tableColumnServidorAplicacion1}"
                                                    headerText="servidor"
                                                    id="tableColumnServidorAplicacion1"
                                                    sort="servidor_aplicacion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextServidorAplicacion1"
                                                    text="#{currentRow.value['servidor_aplicacion']}"
                                                    rendered="#{AplicacionPorGrupoAplicacion1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{AplicacionPorGrupoAplicacion1.labelServidorAplicacion1}"
                                                    id="labelServidorAplicacion1"
                                                    for="campoServidorAplicacion1"/>
                                                <webuijsf:textField id="campoServidorAplicacion1"
                                                    binding="#{AplicacionPorGrupoAplicacion1.campoServidorAplicacion1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{AplicacionPorGrupoAplicacion1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['servidor_aplicacion']}"
                                                    toolTip="BundleParametros.servidor_aplicacion.aplicacion"
                                                    validatorExpression="#{AplicacionPorGrupoAplicacion1.validatorServidorAplicacion1.validate}"/>
                                                <webuijsf:staticText id="campoServidorAplicacion1Texto1"
                                                    binding="#{AplicacionPorGrupoAplicacion1.campoServidorAplicacion1Texto1}"
                                                    text="#{currentRow.value['servidor_aplicacion']}"/>
                                                <webuijsf:message id="messageServidorAplicacion1"
                                                    for="campoServidorAplicacion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{AplicacionPorGrupoAplicacion1.tableColumnPuertoAplicacion1}"
                                                    headerText="puerto"
                                                    id="tableColumnPuertoAplicacion1"
                                                    sort="puerto_aplicacion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextPuertoAplicacion1"
                                                    text="#{currentRow.value['puerto_aplicacion']}"
                                                    rendered="#{AplicacionPorGrupoAplicacion1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{AplicacionPorGrupoAplicacion1.labelPuertoAplicacion1}"
                                                    id="labelPuertoAplicacion1"
                                                    for="campoPuertoAplicacion1"/>
                                                <webuijsf:textField id="campoPuertoAplicacion1"
                                                    binding="#{AplicacionPorGrupoAplicacion1.campoPuertoAplicacion1}"
                                                    columns="10"
                                                    maxLength="10"
                                                    readOnly="#{AplicacionPorGrupoAplicacion1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['puerto_aplicacion']}"
                                                    toolTip="BundleParametros.puerto_aplicacion.aplicacion"
                                                    validatorExpression="#{AplicacionPorGrupoAplicacion1.validatorPuertoAplicacion1.validate}"/>
                                                <webuijsf:staticText id="campoPuertoAplicacion1Texto1"
                                                    binding="#{AplicacionPorGrupoAplicacion1.campoPuertoAplicacion1Texto1}"
                                                    text="#{currentRow.value['puerto_aplicacion']}"/>
                                                <webuijsf:message id="messagePuertoAplicacion1"
                                                    for="campoPuertoAplicacion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{AplicacionPorGrupoAplicacion1.tableColumnUrlAplicacion1}"
                                                    headerText="url"
                                                    id="tableColumnUrlAplicacion1" rendered="false"
                                                    sort="url_aplicacion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextUrlAplicacion1"
                                                    text="#{currentRow.value['url_aplicacion']}"
                                                    rendered="#{AplicacionPorGrupoAplicacion1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{AplicacionPorGrupoAplicacion1.labelUrlAplicacion1}"
                                                    id="labelUrlAplicacion1"
                                                    for="campoUrlAplicacion1"/>
                                                <webuijsf:textArea id="campoUrlAplicacion1"
                                                    binding="#{AplicacionPorGrupoAplicacion1.campoUrlAplicacion1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{AplicacionPorGrupoAplicacion1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['url_aplicacion']}"
                                                    toolTip="BundleParametros.url_aplicacion.aplicacion"
                                                    validatorExpression="#{AplicacionPorGrupoAplicacion1.validatorUrlAplicacion1.validate}"/>
                                                <webuijsf:staticText id="campoUrlAplicacion1Texto1"
                                                    binding="#{AplicacionPorGrupoAplicacion1.campoUrlAplicacion1Texto1}"
                                                    text="#{currentRow.value['url_aplicacion']}"/>
                                                <webuijsf:message id="messageUrlAplicacion1"
                                                    for="campoUrlAplicacion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{AplicacionPorGrupoAplicacion1.tableColumnEsPublica1}"
                                                    headerText="publica"
                                                    id="tableColumnEsPublica1" rendered="false"
                                                    sort="es_publica">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsPublica1"
                                                    text="#{currentRow.value['es_publica']}"
                                                    rendered="#{AplicacionPorGrupoAplicacion1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{AplicacionPorGrupoAplicacion1.labelEsPublica1}"
                                                    id="labelEsPublica1"
                                                    for="listaEsPublica1"/>
                                                <webuijsf:dropDown id="listaEsPublica1"
                                                    binding="#{AplicacionPorGrupoAplicacion1.listaEsPublica1}"
                                                    converter="#{AplicacionPorGrupoAplicacion1.converterEsPublica1}"
                                                    disabled="#{AplicacionPorGrupoAplicacion1.gestor.filaNoProcesada}" required="true"
                                                    items="#{AplicacionPorGrupoAplicacion1.asistente.opcionesListaEsPublica1}"
                                                    selected="#{currentRow.value['es_publica']}"
                                                    toolTip="BundleParametros.es_publica.aplicacion"/>
                                                <webuijsf:staticText id="listaEsPublica1Texto1"
                                                    binding="#{AplicacionPorGrupoAplicacion1.listaEsPublica1Texto1}"/>
                                                <webuijsf:message id="messageEsPublica1"
                                                    for="listaEsPublica1"/>
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
                                                        binding="#{AplicacionPorGrupoAplicacion1.etiquetaTextoFilasPorPagina1}" 
                                                        for="textoFilasPorPagina1"
                                                        id="etiquetaTextoFilasPorPagina1" 
                                                        text="#{AplicacionPorGrupoAplicacion1.gestor.i18n.textoEtiquetaTextoFilasPorPagina}"/>
                                                </h:panelGrid>
                                                <h:panelGrid 
                                                    columns="3" 
                                                    id="gridPanel107">
                                                    <webuijsf:textField 
                                                        binding="#{AplicacionPorGrupoAplicacion1.textoFilasPorPagina1}" 
                                                        columns="2"
                                                        converter="#{AplicacionPorGrupoAplicacion1.textoFilasPorPagina1Converter1}"
                                                        disabled="#{AplicacionPorGrupoAplicacion1.gestor.paginacionInhabilitada}" 
                                                        id="textoFilasPorPagina1" maxLength="2"
                                                        text="#{AplicacionPorGrupoAplicacion1.gestor.filasPorPagina}" 
                                                        validatorExpression="#{AplicacionPorGrupoAplicacion1.textoFilasPorPagina1Validator1.validate}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{AplicacionPorGrupoAplicacion1.botonRepaginar1_action}"
                                                        binding="#{AplicacionPorGrupoAplicacion1.botonRepaginar1}" 
                                                        id="botonRepaginar1"
                                                        imageURL="#{AplicacionPorGrupoAplicacion1.gestor.urlImagenRepaginar}" 
                                                        onClick="#{AplicacionPorGrupoAplicacion1.gestor.scriptRepaginar}"
                                                        text="#{AplicacionPorGrupoAplicacion1.gestor.i18n.textoBotonRepaginar}"
                                                        toolTip="#{AplicacionPorGrupoAplicacion1.gestor.i18n.toolTipBotonRepaginar}"/>
                                                    <webuijsf:message 
                                                        for="textoFilasPorPagina1" 
                                                        id="messageFilasPorPagina1"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="13"
                                                id="gridPanel108">
                                                <webuijsf:button
                                                    actionExpression="#{AplicacionPorGrupoAplicacion1.botonAgregar1_action}"
                                                    binding="#{AplicacionPorGrupoAplicacion1.botonAgregar1}"
                                                    disabled="#{AplicacionPorGrupoAplicacion1.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{AplicacionPorGrupoAplicacion1.gestor.scriptAgregar}"
                                                    rendered="#{AplicacionPorGrupoAplicacion1.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{AplicacionPorGrupoAplicacion1.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{AplicacionPorGrupoAplicacion1.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{AplicacionPorGrupoAplicacion1.listaFuncionEdicion1}"
                                                    converter="#{AplicacionPorGrupoAplicacion1.converterListaFuncionEdicion1}"
                                                    disabled="#{AplicacionPorGrupoAplicacion1.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{AplicacionPorGrupoAplicacion1.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{AplicacionPorGrupoAplicacion1.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{AplicacionPorGrupoAplicacion1.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{AplicacionPorGrupoAplicacion1.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{AplicacionPorGrupoAplicacion1.botonEditar1_action}"
                                                    binding="#{AplicacionPorGrupoAplicacion1.botonEditar1}"
                                                    disabled="#{AplicacionPorGrupoAplicacion1.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{AplicacionPorGrupoAplicacion1.gestor.scriptEditar}"
                                                    rendered="#{AplicacionPorGrupoAplicacion1.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{AplicacionPorGrupoAplicacion1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{AplicacionPorGrupoAplicacion1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{AplicacionPorGrupoAplicacion1.botonEliminar1_action}"
                                                    binding="#{AplicacionPorGrupoAplicacion1.botonEliminar1}"
                                                    disabled="#{AplicacionPorGrupoAplicacion1.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{AplicacionPorGrupoAplicacion1.gestor.scriptEliminar}"
                                                    rendered="#{AplicacionPorGrupoAplicacion1.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{AplicacionPorGrupoAplicacion1.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{AplicacionPorGrupoAplicacion1.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{AplicacionPorGrupoAplicacion1.botonAplicar1_action}"
                                                    binding="#{AplicacionPorGrupoAplicacion1.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{AplicacionPorGrupoAplicacion1.gestor.scriptAplicar}"
                                                    rendered="#{AplicacionPorGrupoAplicacion1.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{AplicacionPorGrupoAplicacion1.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{AplicacionPorGrupoAplicacion1.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{AplicacionPorGrupoAplicacion1.botonDeshacer1_action}"
                                                    binding="#{AplicacionPorGrupoAplicacion1.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{AplicacionPorGrupoAplicacion1.gestor.scriptDeshacer}"
                                                    rendered="#{AplicacionPorGrupoAplicacion1.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{AplicacionPorGrupoAplicacion1.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{AplicacionPorGrupoAplicacion1.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{AplicacionPorGrupoAplicacion1.botonConfirmar1_action}"
                                                    binding="#{AplicacionPorGrupoAplicacion1.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{AplicacionPorGrupoAplicacion1.gestor.scriptConfirmar}"
                                                    rendered="#{AplicacionPorGrupoAplicacion1.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{AplicacionPorGrupoAplicacion1.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{AplicacionPorGrupoAplicacion1.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{AplicacionPorGrupoAplicacion1.botonDescartar1_action}"
                                                    binding="#{AplicacionPorGrupoAplicacion1.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{AplicacionPorGrupoAplicacion1.gestor.scriptDescartar}"
                                                    rendered="#{AplicacionPorGrupoAplicacion1.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{AplicacionPorGrupoAplicacion1.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{AplicacionPorGrupoAplicacion1.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{AplicacionPorGrupoAplicacion1.listaFuncionAccion1}"
                                                    converter="#{AplicacionPorGrupoAplicacion1.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{AplicacionPorGrupoAplicacion1.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{AplicacionPorGrupoAplicacion1.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{AplicacionPorGrupoAplicacion1.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{AplicacionPorGrupoAplicacion1.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{AplicacionPorGrupoAplicacion1.botonProcesar1_action}"
                                                    binding="#{AplicacionPorGrupoAplicacion1.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{AplicacionPorGrupoAplicacion1.gestor.scriptProcesar}"
                                                    rendered="#{AplicacionPorGrupoAplicacion1.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{AplicacionPorGrupoAplicacion1.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{AplicacionPorGrupoAplicacion1.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{AplicacionPorGrupoAplicacion1.botonRefrescar1_action}"
                                                    binding="#{AplicacionPorGrupoAplicacion1.botonRefrescar1}"
                                                    disabled="#{AplicacionPorGrupoAplicacion1.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{AplicacionPorGrupoAplicacion1.gestor.scriptRefrescar}"
                                                    rendered="#{AplicacionPorGrupoAplicacion1.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{AplicacionPorGrupoAplicacion1.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{AplicacionPorGrupoAplicacion1.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{AplicacionPorGrupoAplicacion1.botonReconsultar1_action}"
                                                    binding="#{AplicacionPorGrupoAplicacion1.botonReconsultar1}"
                                                    disabled="#{AplicacionPorGrupoAplicacion1.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{AplicacionPorGrupoAplicacion1.gestor.scriptReconsultar}"
                                                    rendered="#{AplicacionPorGrupoAplicacion1.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{AplicacionPorGrupoAplicacion1.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{AplicacionPorGrupoAplicacion1.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{AplicacionPorGrupoAplicacion1.botonRetornar1_action}"
                                                    binding="#{AplicacionPorGrupoAplicacion1.botonRetornar1}"
                                                    disabled="#{AplicacionPorGrupoAplicacion1.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{AplicacionPorGrupoAplicacion1.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{AplicacionPorGrupoAplicacion1.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{AplicacionPorGrupoAplicacion1.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{AplicacionPorGrupoAplicacion1.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="3" 
                                                id="gridPanel109"
                                                rendered="#{AplicacionPorGrupoAplicacion1.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{AplicacionPorGrupoAplicacion1.imageHyperlink1_action}"
                                                    binding="#{AplicacionPorGrupoAplicacion1.imageHyperlink1}"
                                                    disabled="#{AplicacionPorGrupoAplicacion1.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{AplicacionPorGrupoAplicacion1.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{AplicacionPorGrupoAplicacion1.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.AplicacionPorGrupoAplicacion1_imageHyperlink1_toolTip}"/>
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{AplicacionPorGrupoAplicacion1.imageHyperlink2_action}"
                                                    binding="#{AplicacionPorGrupoAplicacion1.imageHyperlink2}"
                                                    disabled="#{AplicacionPorGrupoAplicacion1.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink2"
                                                    imageURL="#{AplicacionPorGrupoAplicacion1.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{AplicacionPorGrupoAplicacion1.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    text="Hyperlink2"
                                                    toolTip="#{bundle.AplicacionPorGrupoAplicacion1_imageHyperlink2_toolTip}"/>
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{AplicacionPorGrupoAplicacion1.imageHyperlink3_action}"
                                                    binding="#{AplicacionPorGrupoAplicacion1.imageHyperlink3}"
                                                    disabled="#{AplicacionPorGrupoAplicacion1.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink3"
                                                    imageURL="#{AplicacionPorGrupoAplicacion1.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{AplicacionPorGrupoAplicacion1.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{AplicacionPorGrupoAplicacion1.gestor.designing}"
                                                    text="Hyperlink3"
                                                    toolTip="#{bundle.AplicacionPorGrupoAplicacion1_imageHyperlink3_toolTip}"/>
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
