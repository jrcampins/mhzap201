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
                    focus="#{Aplicacion1.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{Aplicacion1.gestor.preserveFocus}"
                    preserveScroll="#{Aplicacion1.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{Aplicacion1.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | checkbox1 campoIdAplicacion1 campoCodigoAplicacion1 campoNombreAplicacion1 campoDescripcionAplicacion1 campoServidorAplicacion1 campoPuertoAplicacion1 campoUrlAplicacion1 listaEsPublica1 campoIdGrupoAplicacion1 textoFilasPorPagina1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | textoFilasPorPagina1 | botonRepaginar1 , virtualForm3 | checkbox1 listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonEscogerFila1 botonDetallarFila1 botonProcesarFila1 botonRetornarFila1 botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{Aplicacion1.breadcrumbs1}" 
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
                                                    rendered="#{Aplicacion1.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{Aplicacion1.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{Aplicacion1.gestor.mensajeDisponible}"
                                                    text="#{Aplicacion1.gestor.mensaje}"
                                                    url="#{Aplicacion1.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:table
                                            binding="#{Aplicacion1.table1}"
                                            clearSortButton="true" 
                                            deselectMultipleButton="true" 
                                            id="table1"
                                            paginateButton="false"
                                            paginationControls="true" 
                                            selectMultipleButton="true" 
                                            sortPanelToggleButton="true"
                                            width="960">
                                            <webuijsf:tableRowGroup 
                                                binding="#{Aplicacion1.tableRowGroup1}" 
                                                id="tableRowGroup1" 
                                                rows="1"
                                                selected="#{Aplicacion1.gestor.filaEscogida}" 
                                                sourceData="#{Aplicacion1.aplicacionDataProvider}" 
                                                sourceVar="currentRow">
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    id="tableRowGroup1SelectionColumn"
                                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);" 
                                                    selectId="checkbox1">
                                                    <webuijsf:checkbox 
                                                        binding="#{Aplicacion1.checkbox1}" 
                                                        id="checkbox1"
                                                        onClick="#{Aplicacion1.gestor.scriptElegir}" 
                                                        selected="#{Aplicacion1.gestor.filaElegida}" 
                                                        toolTip="#{Aplicacion1.gestor.i18n.toolTipCheckboxSeleccionMultiple}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    binding="#{Aplicacion1.tableColumn1}" 
                                                    id="tableColumn1">
                                                    <webuijsf:button 
                                                        actionExpression="#{Aplicacion1.botonEscogerFila1_action}"
                                                        binding="#{Aplicacion1.botonEscogerFila1}"
                                                        disabled="#{Aplicacion1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonEscogerFila1"
                                                        imageURL="#{Aplicacion1.gestor.urlImagenEscoger}" 
                                                        onClick="#{Aplicacion1.gestor.scriptEscoger}"
                                                        text="#{Aplicacion1.gestor.i18n.textoBotonEscogerFila}"
                                                        toolTip="#{Aplicacion1.gestor.i18n.toolTipBotonEscogerFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{Aplicacion1.botonDetallarFila1_action}"
                                                        binding="#{Aplicacion1.botonDetallarFila1}"
                                                        disabled="#{Aplicacion1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonDetallarFila1"
                                                        imageURL="#{Aplicacion1.gestor.urlImagenDetallar}" 
                                                        onClick="#{Aplicacion1.scriptAbrirVentanaVerDetalle}"
                                                        rendered="#{Aplicacion1.gestor.detalleDisponible}" 
                                                        text="#{Aplicacion1.gestor.i18n.textoBotonDetallarFila}"
                                                        toolTip="#{Aplicacion1.gestor.i18n.toolTipBotonDetallarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{Aplicacion1.botonProcesarFila1_action}"
                                                        binding="#{Aplicacion1.botonProcesarFila1}"
                                                        disabled="#{Aplicacion1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonProcesarFila1"
                                                        imageURL="#{Aplicacion1.gestor.urlImagenProcesar}" 
                                                        onClick="#{Aplicacion1.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{Aplicacion1.asistente.comandoDisponible}" 
                                                        text="#{Aplicacion1.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{Aplicacion1.gestor.i18n.toolTipBotonProcesarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{Aplicacion1.botonRetornarFila1_action}"
                                                        binding="#{Aplicacion1.botonRetornarFila1}" 
                                                        disabled="#{Aplicacion1.gestor.funcionReturnInhabilitada}"
                                                        id="botonRetornarFila1"
                                                        imageURL="#{Aplicacion1.gestor.urlImagenRetornar}"
                                                        onClick="#{Aplicacion1.gestor.scriptRetornarRecursoActual}"
                                                        rendered="#{Aplicacion1.gestor.funcionReturnVisible}" 
                                                        text="#{Aplicacion1.gestor.i18n.textoBotonRetornarFila}"
                                                        toolTip="#{Aplicacion1.gestor.i18n.toolTipBotonRetornarFila}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Aplicacion1.tableColumn2}"
                                                    id="tableColumn2"
                                                    rendered="#{Aplicacion1.gestor.designing}">
                                                    <webuijsf:imageHyperlink
                                                        actionExpression="#{Aplicacion1.hipervinculoAccionFila1_action}"
                                                        binding="#{Aplicacion1.hipervinculoAccionFila1}"
                                                        disabled="#{Aplicacion1.gestor.loteConCambios}"
                                                        id="hipervinculoAccionFila1"
                                                        imageURL="#{Aplicacion1.gestor.urlImagenEjecutarVinculo}"
                                                        onClick="#{Aplicacion1.scriptAbrirVentanaAccionFila1}"
                                                        text="Accion1"
                                                        toolTip="#{bundle.Aplicacion1_hipervinculoAccionFila1_toolTip}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="right" 
                                                    binding="#{Aplicacion1.tableColumn3}" 
                                                    headerText="#{Aplicacion1.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{Aplicacion1.gestor.i18n.toolTipEtiquetaIdentificacionFila}"
                                                    id="tableColumn3">
                                                    <webuijsf:imageHyperlink 
                                                        actionExpression="#{Aplicacion1.hipervinculoDetallarFila1_action}"
                                                        binding="#{Aplicacion1.hipervinculoDetallarFila1}" 
                                                        id="hipervinculoDetallarFila1"
                                                        imageURL="#{Aplicacion1.gestor.urlImagenFilaProcesada}"
                                                        textPosition="left" 
                                                        text="#{Aplicacion1.gestor.identificacionFila}" 
                                                        toolTip="#{Aplicacion1.gestor.toolTipImagenFilaProcesada}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Aplicacion1.tableColumnIdAplicacion1}"
                                                    headerText="identificaci&#243;n"
                                                    id="tableColumnIdAplicacion1"
                                                    sort="id_aplicacion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdAplicacion1"
                                                    text="#{currentRow.value['id_aplicacion']}"
                                                    rendered="#{Aplicacion1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Aplicacion1.labelIdAplicacion1}"
                                                    id="labelIdAplicacion1"
                                                    for="campoIdAplicacion1"/>
                                                <webuijsf:textField id="campoIdAplicacion1"
                                                    binding="#{Aplicacion1.campoIdAplicacion1}"
                                                    converter="#{Aplicacion1.converterIdAplicacion1}"
                                                    readOnly="#{Aplicacion1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['id_aplicacion']}"
                                                    toolTip="BundleParametros.id_aplicacion.aplicacion"
                                                    validatorExpression="#{Aplicacion1.validatorIdAplicacion1.validate}"/>
                                                <webuijsf:staticText id="campoIdAplicacion1Texto1"
                                                    binding="#{Aplicacion1.campoIdAplicacion1Texto1}"
                                                    text="#{currentRow.value['id_aplicacion']}"/>
                                                <webuijsf:message id="messageIdAplicacion1"
                                                    for="campoIdAplicacion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Aplicacion1.tableColumnCodigoAplicacion1}"
                                                    headerText="c&#243;digo"
                                                    id="tableColumnCodigoAplicacion1"
                                                    sort="codigo_aplicacion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextCodigoAplicacion1"
                                                    text="#{currentRow.value['codigo_aplicacion']}"
                                                    rendered="#{Aplicacion1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Aplicacion1.labelCodigoAplicacion1}"
                                                    id="labelCodigoAplicacion1"
                                                    for="campoCodigoAplicacion1"/>
                                                <webuijsf:textField id="campoCodigoAplicacion1"
                                                    binding="#{Aplicacion1.campoCodigoAplicacion1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{Aplicacion1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['codigo_aplicacion']}"
                                                    toolTip="BundleParametros.codigo_aplicacion.aplicacion"
                                                    validatorExpression="#{Aplicacion1.validatorCodigoAplicacion1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoAplicacion1Texto1"
                                                    binding="#{Aplicacion1.campoCodigoAplicacion1Texto1}"
                                                    text="#{currentRow.value['codigo_aplicacion']}"/>
                                                <webuijsf:message id="messageCodigoAplicacion1"
                                                    for="campoCodigoAplicacion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Aplicacion1.tableColumnNombreAplicacion1}"
                                                    headerText="nombre"
                                                    id="tableColumnNombreAplicacion1"
                                                    sort="nombre_aplicacion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNombreAplicacion1"
                                                    text="#{currentRow.value['nombre_aplicacion']}"
                                                    rendered="#{Aplicacion1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Aplicacion1.labelNombreAplicacion1}"
                                                    id="labelNombreAplicacion1"
                                                    for="campoNombreAplicacion1"/>
                                                <webuijsf:textField id="campoNombreAplicacion1"
                                                    binding="#{Aplicacion1.campoNombreAplicacion1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{Aplicacion1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['nombre_aplicacion']}"
                                                    toolTip="BundleParametros.nombre_aplicacion.aplicacion"
                                                    validatorExpression="#{Aplicacion1.validatorNombreAplicacion1.validate}"/>
                                                <webuijsf:staticText id="campoNombreAplicacion1Texto1"
                                                    binding="#{Aplicacion1.campoNombreAplicacion1Texto1}"
                                                    text="#{currentRow.value['nombre_aplicacion']}"/>
                                                <webuijsf:message id="messageNombreAplicacion1"
                                                    for="campoNombreAplicacion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Aplicacion1.tableColumnDescripcionAplicacion1}"
                                                    headerText="descripci&#243;n"
                                                    id="tableColumnDescripcionAplicacion1" rendered="false"
                                                    sort="descripcion_aplicacion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextDescripcionAplicacion1"
                                                    text="#{currentRow.value['descripcion_aplicacion']}"
                                                    rendered="#{Aplicacion1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Aplicacion1.labelDescripcionAplicacion1}"
                                                    id="labelDescripcionAplicacion1"
                                                    for="campoDescripcionAplicacion1"/>
                                                <webuijsf:textArea id="campoDescripcionAplicacion1"
                                                    binding="#{Aplicacion1.campoDescripcionAplicacion1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{Aplicacion1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['descripcion_aplicacion']}"
                                                    toolTip="BundleParametros.descripcion_aplicacion.aplicacion"
                                                    validatorExpression="#{Aplicacion1.validatorDescripcionAplicacion1.validate}"/>
                                                <webuijsf:staticText id="campoDescripcionAplicacion1Texto1"
                                                    binding="#{Aplicacion1.campoDescripcionAplicacion1Texto1}"
                                                    text="#{currentRow.value['descripcion_aplicacion']}"/>
                                                <webuijsf:message id="messageDescripcionAplicacion1"
                                                    for="campoDescripcionAplicacion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Aplicacion1.tableColumnServidorAplicacion1}"
                                                    headerText="servidor"
                                                    id="tableColumnServidorAplicacion1"
                                                    sort="servidor_aplicacion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextServidorAplicacion1"
                                                    text="#{currentRow.value['servidor_aplicacion']}"
                                                    rendered="#{Aplicacion1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Aplicacion1.labelServidorAplicacion1}"
                                                    id="labelServidorAplicacion1"
                                                    for="campoServidorAplicacion1"/>
                                                <webuijsf:textField id="campoServidorAplicacion1"
                                                    binding="#{Aplicacion1.campoServidorAplicacion1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{Aplicacion1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['servidor_aplicacion']}"
                                                    toolTip="BundleParametros.servidor_aplicacion.aplicacion"
                                                    validatorExpression="#{Aplicacion1.validatorServidorAplicacion1.validate}"/>
                                                <webuijsf:staticText id="campoServidorAplicacion1Texto1"
                                                    binding="#{Aplicacion1.campoServidorAplicacion1Texto1}"
                                                    text="#{currentRow.value['servidor_aplicacion']}"/>
                                                <webuijsf:message id="messageServidorAplicacion1"
                                                    for="campoServidorAplicacion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Aplicacion1.tableColumnPuertoAplicacion1}"
                                                    headerText="puerto"
                                                    id="tableColumnPuertoAplicacion1"
                                                    sort="puerto_aplicacion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextPuertoAplicacion1"
                                                    text="#{currentRow.value['puerto_aplicacion']}"
                                                    rendered="#{Aplicacion1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Aplicacion1.labelPuertoAplicacion1}"
                                                    id="labelPuertoAplicacion1"
                                                    for="campoPuertoAplicacion1"/>
                                                <webuijsf:textField id="campoPuertoAplicacion1"
                                                    binding="#{Aplicacion1.campoPuertoAplicacion1}"
                                                    columns="10"
                                                    maxLength="10"
                                                    readOnly="#{Aplicacion1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['puerto_aplicacion']}"
                                                    toolTip="BundleParametros.puerto_aplicacion.aplicacion"
                                                    validatorExpression="#{Aplicacion1.validatorPuertoAplicacion1.validate}"/>
                                                <webuijsf:staticText id="campoPuertoAplicacion1Texto1"
                                                    binding="#{Aplicacion1.campoPuertoAplicacion1Texto1}"
                                                    text="#{currentRow.value['puerto_aplicacion']}"/>
                                                <webuijsf:message id="messagePuertoAplicacion1"
                                                    for="campoPuertoAplicacion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Aplicacion1.tableColumnUrlAplicacion1}"
                                                    headerText="url"
                                                    id="tableColumnUrlAplicacion1" rendered="false"
                                                    sort="url_aplicacion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextUrlAplicacion1"
                                                    text="#{currentRow.value['url_aplicacion']}"
                                                    rendered="#{Aplicacion1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Aplicacion1.labelUrlAplicacion1}"
                                                    id="labelUrlAplicacion1"
                                                    for="campoUrlAplicacion1"/>
                                                <webuijsf:textArea id="campoUrlAplicacion1"
                                                    binding="#{Aplicacion1.campoUrlAplicacion1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{Aplicacion1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['url_aplicacion']}"
                                                    toolTip="BundleParametros.url_aplicacion.aplicacion"
                                                    validatorExpression="#{Aplicacion1.validatorUrlAplicacion1.validate}"/>
                                                <webuijsf:staticText id="campoUrlAplicacion1Texto1"
                                                    binding="#{Aplicacion1.campoUrlAplicacion1Texto1}"
                                                    text="#{currentRow.value['url_aplicacion']}"/>
                                                <webuijsf:message id="messageUrlAplicacion1"
                                                    for="campoUrlAplicacion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Aplicacion1.tableColumnEsPublica1}"
                                                    headerText="p&#250;blica"
                                                    id="tableColumnEsPublica1" rendered="false"
                                                    sort="es_publica">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsPublica1"
                                                    text="#{currentRow.value['es_publica']}"
                                                    rendered="#{Aplicacion1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Aplicacion1.labelEsPublica1}"
                                                    id="labelEsPublica1"
                                                    for="listaEsPublica1"/>
                                                <webuijsf:dropDown id="listaEsPublica1"
                                                    binding="#{Aplicacion1.listaEsPublica1}"
                                                    converter="#{Aplicacion1.converterEsPublica1}"
                                                    disabled="#{Aplicacion1.gestor.filaNoProcesada}" required="true"
                                                    items="#{Aplicacion1.asistente.opcionesListaEsPublica1}"
                                                    selected="#{currentRow.value['es_publica']}"
                                                    toolTip="BundleParametros.es_publica.aplicacion"/>
                                                <webuijsf:staticText id="listaEsPublica1Texto1"
                                                    binding="#{Aplicacion1.listaEsPublica1Texto1}"/>
                                                <webuijsf:message id="messageEsPublica1"
                                                    for="listaEsPublica1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Aplicacion1.tableColumnIdGrupoAplicacion1}"
                                                    headerText="grupo"
                                                    id="tableColumnIdGrupoAplicacion1" rendered="false"
                                                    sort="codigo_grupo_aplicacion_1x1y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdGrupoAplicacion1"
                                                    text="#{currentRow.value['codigo_grupo_aplicacion_1x1y3']}"
                                                    rendered="#{Aplicacion1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Aplicacion1.labelIdGrupoAplicacion1}"
                                                    id="labelIdGrupoAplicacion1"
                                                    for="campoIdGrupoAplicacion1"/>
                                                <webuijsf:textField id="campoIdGrupoAplicacion1"
                                                    binding="#{Aplicacion1.campoIdGrupoAplicacion1}"
                                                    readOnly="#{Aplicacion1.gestor.filaNoProcesada}"
                                                    text="#{Aplicacion1.asistente.textoCampoIdGrupoAplicacion1}"
                                                    toolTip="#{Aplicacion1.asistente.toolTipCampoIdGrupoAplicacion1}"
                                                    validatorExpression="#{Aplicacion1.campoIdGrupoAplicacion1_validate}"/>
                                                <webuijsf:staticText id="campoIdGrupoAplicacion1Texto1"
                                                    binding="#{Aplicacion1.campoIdGrupoAplicacion1Texto1}"
                                                    text="#{currentRow.value['codigo_grupo_aplicacion_1x1y3']}"/>
                                                <webuijsf:message id="messageIdGrupoAplicacion1"
                                                    for="campoIdGrupoAplicacion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdGrupoAplicacion3" rendered="false"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdGrupoAplicacion3"
                                                    text="#{currentRow.value['id_grupo_aplicacion']}"
                                                    rendered="#{Aplicacion1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{Aplicacion1.campoIdGrupoAplicacion1Boton1}"
                                                    id="campoIdGrupoAplicacion1Boton1"
                                                    onClick="#{Aplicacion1.asistente.scriptCampoIdGrupoAplicacion1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{Aplicacion1.campoIdGrupoAplicacion1Boton3}"
                                                    id="campoIdGrupoAplicacion1Boton3"
                                                    onClick="#{Aplicacion1.asistente.scriptCampoIdGrupoAplicacion1Boton2}"
                                                    rendered="#{Aplicacion1.asistente.campoIdGrupoAplicacion1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{Aplicacion1.tableColumnIdGrupoAplicacion2}"
                                                    headerText="nombre grupo"
                                                    id="tableColumnIdGrupoAplicacion2" rendered="false"
                                                    sort="nombre_grupo_aplicacion_1x1y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdGrupoAplicacion2"
                                                    text="#{currentRow.value['nombre_grupo_aplicacion_1x1y4']}"
                                                    rendered="#{Aplicacion1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Aplicacion1.labelIdGrupoAplicacion2}"
                                                    id="labelIdGrupoAplicacion2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{Aplicacion1.campoIdGrupoAplicacion1Hiper1}"
                                                    id="campoIdGrupoAplicacion1Hiper1"
                                                    text="#{currentRow.value['nombre_grupo_aplicacion_1x1y4']}"
                                                    onClick="#{Aplicacion1.asistente.scriptCampoIdGrupoAplicacion1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdGrupoAplicacion1Boton2"
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
                                                        binding="#{Aplicacion1.etiquetaTextoFilasPorPagina1}" 
                                                        for="textoFilasPorPagina1"
                                                        id="etiquetaTextoFilasPorPagina1" 
                                                        text="#{Aplicacion1.gestor.i18n.textoEtiquetaTextoFilasPorPagina}"/>
                                                </h:panelGrid>
                                                <h:panelGrid 
                                                    columns="3" 
                                                    id="gridPanel107">
                                                    <webuijsf:textField 
                                                        binding="#{Aplicacion1.textoFilasPorPagina1}" 
                                                        columns="2"
                                                        converter="#{Aplicacion1.textoFilasPorPagina1Converter1}"
                                                        disabled="#{Aplicacion1.gestor.paginacionInhabilitada}" 
                                                        id="textoFilasPorPagina1" maxLength="2"
                                                        text="#{Aplicacion1.gestor.filasPorPagina}" 
                                                        validatorExpression="#{Aplicacion1.textoFilasPorPagina1Validator1.validate}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{Aplicacion1.botonRepaginar1_action}"
                                                        binding="#{Aplicacion1.botonRepaginar1}" 
                                                        id="botonRepaginar1"
                                                        imageURL="#{Aplicacion1.gestor.urlImagenRepaginar}" 
                                                        onClick="#{Aplicacion1.gestor.scriptRepaginar}"
                                                        text="#{Aplicacion1.gestor.i18n.textoBotonRepaginar}"
                                                        toolTip="#{Aplicacion1.gestor.i18n.toolTipBotonRepaginar}"/>
                                                    <webuijsf:message 
                                                        for="textoFilasPorPagina1" 
                                                        id="messageFilasPorPagina1"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="13"
                                                id="gridPanel108">
                                                <webuijsf:button
                                                    actionExpression="#{Aplicacion1.botonAgregar1_action}"
                                                    binding="#{Aplicacion1.botonAgregar1}"
                                                    disabled="#{Aplicacion1.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{Aplicacion1.gestor.scriptAgregar}"
                                                    rendered="#{Aplicacion1.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Aplicacion1.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{Aplicacion1.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{Aplicacion1.listaFuncionEdicion1}"
                                                    converter="#{Aplicacion1.converterListaFuncionEdicion1}"
                                                    disabled="#{Aplicacion1.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{Aplicacion1.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{Aplicacion1.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{Aplicacion1.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{Aplicacion1.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Aplicacion1.botonEditar1_action}"
                                                    binding="#{Aplicacion1.botonEditar1}"
                                                    disabled="#{Aplicacion1.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{Aplicacion1.gestor.scriptEditar}"
                                                    rendered="#{Aplicacion1.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Aplicacion1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{Aplicacion1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Aplicacion1.botonEliminar1_action}"
                                                    binding="#{Aplicacion1.botonEliminar1}"
                                                    disabled="#{Aplicacion1.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{Aplicacion1.gestor.scriptEliminar}"
                                                    rendered="#{Aplicacion1.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Aplicacion1.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{Aplicacion1.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Aplicacion1.botonAplicar1_action}"
                                                    binding="#{Aplicacion1.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{Aplicacion1.gestor.scriptAplicar}"
                                                    rendered="#{Aplicacion1.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Aplicacion1.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{Aplicacion1.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Aplicacion1.botonDeshacer1_action}"
                                                    binding="#{Aplicacion1.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{Aplicacion1.gestor.scriptDeshacer}"
                                                    rendered="#{Aplicacion1.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Aplicacion1.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{Aplicacion1.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Aplicacion1.botonConfirmar1_action}"
                                                    binding="#{Aplicacion1.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{Aplicacion1.gestor.scriptConfirmar}"
                                                    rendered="#{Aplicacion1.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Aplicacion1.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{Aplicacion1.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Aplicacion1.botonDescartar1_action}"
                                                    binding="#{Aplicacion1.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{Aplicacion1.gestor.scriptDescartar}"
                                                    rendered="#{Aplicacion1.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Aplicacion1.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{Aplicacion1.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{Aplicacion1.listaFuncionAccion1}"
                                                    converter="#{Aplicacion1.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{Aplicacion1.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{Aplicacion1.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{Aplicacion1.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{Aplicacion1.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Aplicacion1.botonProcesar1_action}"
                                                    binding="#{Aplicacion1.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{Aplicacion1.gestor.scriptProcesar}"
                                                    rendered="#{Aplicacion1.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Aplicacion1.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{Aplicacion1.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Aplicacion1.botonRefrescar1_action}"
                                                    binding="#{Aplicacion1.botonRefrescar1}"
                                                    disabled="#{Aplicacion1.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{Aplicacion1.gestor.scriptRefrescar}"
                                                    rendered="#{Aplicacion1.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Aplicacion1.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{Aplicacion1.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Aplicacion1.botonReconsultar1_action}"
                                                    binding="#{Aplicacion1.botonReconsultar1}"
                                                    disabled="#{Aplicacion1.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{Aplicacion1.gestor.scriptReconsultar}"
                                                    rendered="#{Aplicacion1.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Aplicacion1.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{Aplicacion1.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Aplicacion1.botonRetornar1_action}"
                                                    binding="#{Aplicacion1.botonRetornar1}"
                                                    disabled="#{Aplicacion1.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{Aplicacion1.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{Aplicacion1.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Aplicacion1.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{Aplicacion1.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="3" 
                                                id="gridPanel109"
                                                rendered="#{Aplicacion1.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{Aplicacion1.imageHyperlink1_action}"
                                                    binding="#{Aplicacion1.imageHyperlink1}"
                                                    disabled="#{Aplicacion1.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{Aplicacion1.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{Aplicacion1.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.Aplicacion1_imageHyperlink1_toolTip}"/>
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{Aplicacion1.imageHyperlink2_action}"
                                                    binding="#{Aplicacion1.imageHyperlink2}"
                                                    disabled="#{Aplicacion1.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink2"
                                                    imageURL="#{Aplicacion1.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{Aplicacion1.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    text="Hyperlink2"
                                                    toolTip="#{bundle.Aplicacion1_imageHyperlink2_toolTip}"/>
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{Aplicacion1.imageHyperlink3_action}"
                                                    binding="#{Aplicacion1.imageHyperlink3}"
                                                    disabled="#{Aplicacion1.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink3"
                                                    imageURL="#{Aplicacion1.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{Aplicacion1.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{Aplicacion1.gestor.designing}"
                                                    text="Hyperlink3"
                                                    toolTip="#{bundle.Aplicacion1_imageHyperlink3_toolTip}"/>
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
