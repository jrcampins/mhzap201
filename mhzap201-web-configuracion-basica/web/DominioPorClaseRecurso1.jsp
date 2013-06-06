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
                    focus="#{DominioPorClaseRecurso1.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{DominioPorClaseRecurso1.gestor.preserveFocus}"
                    preserveScroll="#{DominioPorClaseRecurso1.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{DominioPorClaseRecurso1.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | checkbox1 campoIdDominio1 campoCodigoDominio1 campoNombreDominio1 campoDescripcionDominio1 campoNombreTabla1 listaNumeroTipoDominio1 campoIdFuncionSeleccion1 campoIdDominioSegmento1 campoIdPaquete1 textoFilasPorPagina1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | textoFilasPorPagina1 | botonRepaginar1 , virtualForm3 | checkbox1 listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonEscogerFila1 botonDetallarFila1 botonProcesarFila1 botonRetornarFila1 botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{DominioPorClaseRecurso1.breadcrumbs1}" 
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
                                                    rendered="#{DominioPorClaseRecurso1.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{DominioPorClaseRecurso1.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{DominioPorClaseRecurso1.gestor.mensajeDisponible}"
                                                    text="#{DominioPorClaseRecurso1.gestor.mensaje}"
                                                    url="#{DominioPorClaseRecurso1.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:table
                                            binding="#{DominioPorClaseRecurso1.table1}"
                                            clearSortButton="true" 
                                            deselectMultipleButton="true" 
                                            id="table1"
                                            paginateButton="false"
                                            paginationControls="true" 
                                            selectMultipleButton="true" 
                                            sortPanelToggleButton="true"
                                            width="960">
                                            <webuijsf:tableRowGroup 
                                                binding="#{DominioPorClaseRecurso1.tableRowGroup1}" 
                                                id="tableRowGroup1" 
                                                rows="1"
                                                selected="#{DominioPorClaseRecurso1.gestor.filaEscogida}" 
                                                sourceData="#{DominioPorClaseRecurso1.dominioDataProvider}" 
                                                sourceVar="currentRow">
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    id="tableRowGroup1SelectionColumn"
                                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);" 
                                                    selectId="checkbox1">
                                                    <webuijsf:checkbox 
                                                        binding="#{DominioPorClaseRecurso1.checkbox1}" 
                                                        id="checkbox1"
                                                        onClick="#{DominioPorClaseRecurso1.gestor.scriptElegir}" 
                                                        selected="#{DominioPorClaseRecurso1.gestor.filaElegida}" 
                                                        toolTip="#{DominioPorClaseRecurso1.gestor.i18n.toolTipCheckboxSeleccionMultiple}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    binding="#{DominioPorClaseRecurso1.tableColumn1}" 
                                                    id="tableColumn1">
                                                    <webuijsf:button 
                                                        actionExpression="#{DominioPorClaseRecurso1.botonEscogerFila1_action}"
                                                        binding="#{DominioPorClaseRecurso1.botonEscogerFila1}"
                                                        disabled="#{DominioPorClaseRecurso1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonEscogerFila1"
                                                        imageURL="#{DominioPorClaseRecurso1.gestor.urlImagenEscoger}" 
                                                        onClick="#{DominioPorClaseRecurso1.gestor.scriptEscoger}"
                                                        text="#{DominioPorClaseRecurso1.gestor.i18n.textoBotonEscogerFila}"
                                                        toolTip="#{DominioPorClaseRecurso1.gestor.i18n.toolTipBotonEscogerFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{DominioPorClaseRecurso1.botonDetallarFila1_action}"
                                                        binding="#{DominioPorClaseRecurso1.botonDetallarFila1}"
                                                        disabled="#{DominioPorClaseRecurso1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonDetallarFila1"
                                                        imageURL="#{DominioPorClaseRecurso1.gestor.urlImagenDetallar}" 
                                                        onClick="#{DominioPorClaseRecurso1.scriptAbrirVentanaVerDetalle}"
                                                        rendered="#{DominioPorClaseRecurso1.gestor.detalleDisponible}" 
                                                        text="#{DominioPorClaseRecurso1.gestor.i18n.textoBotonDetallarFila}"
                                                        toolTip="#{DominioPorClaseRecurso1.gestor.i18n.toolTipBotonDetallarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{DominioPorClaseRecurso1.botonProcesarFila1_action}"
                                                        binding="#{DominioPorClaseRecurso1.botonProcesarFila1}"
                                                        disabled="#{DominioPorClaseRecurso1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonProcesarFila1"
                                                        imageURL="#{DominioPorClaseRecurso1.gestor.urlImagenProcesar}" 
                                                        onClick="#{DominioPorClaseRecurso1.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{DominioPorClaseRecurso1.asistente.comandoDisponible}" 
                                                        text="#{DominioPorClaseRecurso1.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{DominioPorClaseRecurso1.gestor.i18n.toolTipBotonProcesarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{DominioPorClaseRecurso1.botonRetornarFila1_action}"
                                                        binding="#{DominioPorClaseRecurso1.botonRetornarFila1}" 
                                                        disabled="#{DominioPorClaseRecurso1.gestor.funcionReturnInhabilitada}"
                                                        id="botonRetornarFila1"
                                                        imageURL="#{DominioPorClaseRecurso1.gestor.urlImagenRetornar}"
                                                        onClick="#{DominioPorClaseRecurso1.gestor.scriptRetornarRecursoActual}"
                                                        rendered="#{DominioPorClaseRecurso1.gestor.funcionReturnVisible}" 
                                                        text="#{DominioPorClaseRecurso1.gestor.i18n.textoBotonRetornarFila}"
                                                        toolTip="#{DominioPorClaseRecurso1.gestor.i18n.toolTipBotonRetornarFila}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{DominioPorClaseRecurso1.tableColumn2}"
                                                    id="tableColumn2"
                                                    rendered="#{DominioPorClaseRecurso1.gestor.designing}">
                                                    <webuijsf:imageHyperlink
                                                        actionExpression="#{DominioPorClaseRecurso1.hipervinculoAccionFila1_action}"
                                                        binding="#{DominioPorClaseRecurso1.hipervinculoAccionFila1}"
                                                        disabled="#{DominioPorClaseRecurso1.gestor.loteConCambios}"
                                                        id="hipervinculoAccionFila1"
                                                        imageURL="#{DominioPorClaseRecurso1.gestor.urlImagenEjecutarVinculo}"
                                                        onClick="#{DominioPorClaseRecurso1.scriptAbrirVentanaAccionFila1}"
                                                        text="Accion1"
                                                        toolTip="#{bundle.DominioPorClaseRecurso1_hipervinculoAccionFila1_toolTip}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="right" 
                                                    binding="#{DominioPorClaseRecurso1.tableColumn3}" 
                                                    headerText="#{DominioPorClaseRecurso1.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{DominioPorClaseRecurso1.gestor.i18n.toolTipEtiquetaIdentificacionFila}"
                                                    id="tableColumn3">
                                                    <webuijsf:imageHyperlink 
                                                        actionExpression="#{DominioPorClaseRecurso1.hipervinculoDetallarFila1_action}"
                                                        binding="#{DominioPorClaseRecurso1.hipervinculoDetallarFila1}" 
                                                        id="hipervinculoDetallarFila1"
                                                        imageURL="#{DominioPorClaseRecurso1.gestor.urlImagenFilaProcesada}"
                                                        textPosition="left" 
                                                        text="#{DominioPorClaseRecurso1.gestor.identificacionFila}" 
                                                        toolTip="#{DominioPorClaseRecurso1.gestor.toolTipImagenFilaProcesada}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{DominioPorClaseRecurso1.tableColumnIdDominio1}"
                                                    toolTip="BundleParametros.id_dominio.dominio"
                                                    headerText="identificaci&#243;n"
                                                    id="tableColumnIdDominio1"
                                                    sort="id_dominio">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdDominio1"
                                                    text="#{currentRow.value['id_dominio']}"
                                                    rendered="#{DominioPorClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{DominioPorClaseRecurso1.labelIdDominio1}"
                                                    id="labelIdDominio1"
                                                    for="campoIdDominio1"/>
                                                <webuijsf:textField id="campoIdDominio1"
                                                    binding="#{DominioPorClaseRecurso1.campoIdDominio1}"
                                                    converter="#{DominioPorClaseRecurso1.converterIdDominio1}"
                                                    readOnly="#{DominioPorClaseRecurso1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['id_dominio']}"
                                                    toolTip="BundleParametros.id_dominio.dominio"
                                                    validatorExpression="#{DominioPorClaseRecurso1.validatorIdDominio1.validate}"/>
                                                <webuijsf:staticText id="campoIdDominio1Texto1"
                                                    binding="#{DominioPorClaseRecurso1.campoIdDominio1Texto1}"
                                                    text="#{currentRow.value['id_dominio']}"/>
                                                <webuijsf:message id="messageIdDominio1"
                                                    for="campoIdDominio1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{DominioPorClaseRecurso1.tableColumnCodigoDominio1}"
                                                    toolTip="BundleParametros.codigo_dominio.dominio"
                                                    headerText="c&#243;digo"
                                                    id="tableColumnCodigoDominio1"
                                                    sort="codigo_dominio">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextCodigoDominio1"
                                                    text="#{currentRow.value['codigo_dominio']}"
                                                    rendered="#{DominioPorClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{DominioPorClaseRecurso1.labelCodigoDominio1}"
                                                    id="labelCodigoDominio1"
                                                    for="campoCodigoDominio1"/>
                                                <webuijsf:textField id="campoCodigoDominio1"
                                                    binding="#{DominioPorClaseRecurso1.campoCodigoDominio1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{DominioPorClaseRecurso1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['codigo_dominio']}"
                                                    toolTip="BundleParametros.codigo_dominio.dominio"
                                                    validatorExpression="#{DominioPorClaseRecurso1.validatorCodigoDominio1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoDominio1Texto1"
                                                    binding="#{DominioPorClaseRecurso1.campoCodigoDominio1Texto1}"
                                                    text="#{currentRow.value['codigo_dominio']}"/>
                                                <webuijsf:message id="messageCodigoDominio1"
                                                    for="campoCodigoDominio1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{DominioPorClaseRecurso1.tableColumnNombreDominio1}"
                                                    toolTip="BundleParametros.nombre_dominio.dominio"
                                                    headerText="nombre"
                                                    id="tableColumnNombreDominio1"
                                                    sort="nombre_dominio">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNombreDominio1"
                                                    text="#{currentRow.value['nombre_dominio']}"
                                                    rendered="#{DominioPorClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{DominioPorClaseRecurso1.labelNombreDominio1}"
                                                    id="labelNombreDominio1"
                                                    for="campoNombreDominio1"/>
                                                <webuijsf:textField id="campoNombreDominio1"
                                                    binding="#{DominioPorClaseRecurso1.campoNombreDominio1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{DominioPorClaseRecurso1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['nombre_dominio']}"
                                                    toolTip="BundleParametros.nombre_dominio.dominio"
                                                    validatorExpression="#{DominioPorClaseRecurso1.validatorNombreDominio1.validate}"/>
                                                <webuijsf:staticText id="campoNombreDominio1Texto1"
                                                    binding="#{DominioPorClaseRecurso1.campoNombreDominio1Texto1}"
                                                    text="#{currentRow.value['nombre_dominio']}"/>
                                                <webuijsf:message id="messageNombreDominio1"
                                                    for="campoNombreDominio1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{DominioPorClaseRecurso1.tableColumnDescripcionDominio1}"
                                                    toolTip="BundleParametros.descripcion_dominio.dominio"
                                                    headerText="descripci&#243;n"
                                                    id="tableColumnDescripcionDominio1" rendered="false"
                                                    sort="descripcion_dominio">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextDescripcionDominio1"
                                                    text="#{currentRow.value['descripcion_dominio']}"
                                                    rendered="#{DominioPorClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{DominioPorClaseRecurso1.labelDescripcionDominio1}"
                                                    id="labelDescripcionDominio1"
                                                    for="campoDescripcionDominio1"/>
                                                <webuijsf:textArea id="campoDescripcionDominio1"
                                                    binding="#{DominioPorClaseRecurso1.campoDescripcionDominio1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{DominioPorClaseRecurso1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['descripcion_dominio']}"
                                                    toolTip="BundleParametros.descripcion_dominio.dominio"
                                                    validatorExpression="#{DominioPorClaseRecurso1.validatorDescripcionDominio1.validate}"/>
                                                <webuijsf:staticText id="campoDescripcionDominio1Texto1"
                                                    binding="#{DominioPorClaseRecurso1.campoDescripcionDominio1Texto1}"
                                                    text="#{currentRow.value['descripcion_dominio']}"/>
                                                <webuijsf:message id="messageDescripcionDominio1"
                                                    for="campoDescripcionDominio1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{DominioPorClaseRecurso1.tableColumnNombreTabla1}"
                                                    toolTip="BundleParametros.nombre_tabla.dominio"
                                                    headerText="nombre tabla"
                                                    id="tableColumnNombreTabla1" rendered="false"
                                                    sort="nombre_tabla">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNombreTabla1"
                                                    text="#{currentRow.value['nombre_tabla']}"
                                                    rendered="#{DominioPorClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{DominioPorClaseRecurso1.labelNombreTabla1}"
                                                    id="labelNombreTabla1"
                                                    for="campoNombreTabla1"/>
                                                <webuijsf:textField id="campoNombreTabla1"
                                                    binding="#{DominioPorClaseRecurso1.campoNombreTabla1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{DominioPorClaseRecurso1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['nombre_tabla']}"
                                                    toolTip="BundleParametros.nombre_tabla.dominio"
                                                    validatorExpression="#{DominioPorClaseRecurso1.validatorNombreTabla1.validate}"/>
                                                <webuijsf:staticText id="campoNombreTabla1Texto1"
                                                    binding="#{DominioPorClaseRecurso1.campoNombreTabla1Texto1}"
                                                    text="#{currentRow.value['nombre_tabla']}"/>
                                                <webuijsf:message id="messageNombreTabla1"
                                                    for="campoNombreTabla1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{DominioPorClaseRecurso1.tableColumnNumeroTipoDominio1}"
                                                    toolTip="BundleParametros.numero_tipo_dominio.dominio"
                                                    headerText="tipo"
                                                    id="tableColumnNumeroTipoDominio1"
                                                    sort="codigo_tipo_dominio_1x1y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroTipoDominio1"
                                                    text="#{currentRow.value['codigo_tipo_dominio_1x1y2']}"
                                                    rendered="#{DominioPorClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{DominioPorClaseRecurso1.labelNumeroTipoDominio1}"
                                                    id="labelNumeroTipoDominio1"
                                                    for="listaNumeroTipoDominio1"/>
                                                <webuijsf:dropDown id="listaNumeroTipoDominio1"
                                                    binding="#{DominioPorClaseRecurso1.listaNumeroTipoDominio1}"
                                                    converter="#{DominioPorClaseRecurso1.converterNumeroTipoDominio1}"
                                                    disabled="#{DominioPorClaseRecurso1.gestor.filaNoProcesada}" required="true"
                                                    items="#{DominioPorClaseRecurso1.asistente.opcionesListaNumeroTipoDominio1}"
                                                    selected="#{currentRow.value['numero_tipo_dominio']}"
                                                    toolTip="BundleParametros.numero_tipo_dominio.dominio"/>
                                                <webuijsf:staticText id="listaNumeroTipoDominio1Texto1"
                                                    binding="#{DominioPorClaseRecurso1.listaNumeroTipoDominio1Texto1}"
                                                    text="#{currentRow.value['codigo_tipo_dominio_1x1y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoDominio1"
                                                    for="listaNumeroTipoDominio1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{DominioPorClaseRecurso1.tableColumnIdFuncionSeleccion1}"
                                                    toolTip="BundleParametros.id_funcion_seleccion.dominio"
                                                    headerText="funci&#243;n selecci&#243;n"
                                                    id="tableColumnIdFuncionSeleccion1" rendered="false"
                                                    sort="codigo_funcion_1x3y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdFuncionSeleccion1"
                                                    text="#{currentRow.value['codigo_funcion_1x3y3']}"
                                                    rendered="#{DominioPorClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{DominioPorClaseRecurso1.labelIdFuncionSeleccion1}"
                                                    id="labelIdFuncionSeleccion1"
                                                    for="campoIdFuncionSeleccion1"/>
                                                <webuijsf:textField id="campoIdFuncionSeleccion1"
                                                    binding="#{DominioPorClaseRecurso1.campoIdFuncionSeleccion1}"
                                                    readOnly="#{DominioPorClaseRecurso1.gestor.filaNoProcesada}"
                                                    text="#{DominioPorClaseRecurso1.asistente.textoCampoIdFuncionSeleccion1}"
                                                    toolTip="#{DominioPorClaseRecurso1.asistente.toolTipCampoIdFuncionSeleccion1}"
                                                    validatorExpression="#{DominioPorClaseRecurso1.campoIdFuncionSeleccion1_validate}"/>
                                                <webuijsf:staticText id="campoIdFuncionSeleccion1Texto1"
                                                    binding="#{DominioPorClaseRecurso1.campoIdFuncionSeleccion1Texto1}"
                                                    text="#{currentRow.value['codigo_funcion_1x3y3']}"/>
                                                <webuijsf:message id="messageIdFuncionSeleccion1"
                                                    for="campoIdFuncionSeleccion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdFuncionSeleccion3" rendered="false"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdFuncionSeleccion3"
                                                    text="#{currentRow.value['id_funcion_seleccion']}"
                                                    rendered="#{DominioPorClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{DominioPorClaseRecurso1.campoIdFuncionSeleccion1Boton1}"
                                                    id="campoIdFuncionSeleccion1Boton1"
                                                    onClick="#{DominioPorClaseRecurso1.asistente.scriptCampoIdFuncionSeleccion1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{DominioPorClaseRecurso1.campoIdFuncionSeleccion1Boton3}"
                                                    id="campoIdFuncionSeleccion1Boton3"
                                                    onClick="#{DominioPorClaseRecurso1.asistente.scriptCampoIdFuncionSeleccion1Boton2}"
                                                    rendered="#{DominioPorClaseRecurso1.asistente.campoIdFuncionSeleccion1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{DominioPorClaseRecurso1.tableColumnIdFuncionSeleccion2}"
                                                    headerText="nombre funci&#243;n selecci&#243;n"
                                                    id="tableColumnIdFuncionSeleccion2" rendered="false"
                                                    sort="nombre_funcion_1x3y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdFuncionSeleccion2"
                                                    text="#{currentRow.value['nombre_funcion_1x3y4']}"
                                                    rendered="#{DominioPorClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{DominioPorClaseRecurso1.labelIdFuncionSeleccion2}"
                                                    id="labelIdFuncionSeleccion2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{DominioPorClaseRecurso1.campoIdFuncionSeleccion1Hiper1}"
                                                    id="campoIdFuncionSeleccion1Hiper1"
                                                    text="#{currentRow.value['nombre_funcion_1x3y4']}"
                                                    onClick="#{DominioPorClaseRecurso1.asistente.scriptCampoIdFuncionSeleccion1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdFuncionSeleccion1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{DominioPorClaseRecurso1.tableColumnIdDominioSegmento1}"
                                                    toolTip="BundleParametros.id_dominio_segmento.dominio"
                                                    headerText="dominio segmento"
                                                    id="tableColumnIdDominioSegmento1" rendered="false"
                                                    sort="codigo_dominio_1x4y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdDominioSegmento1"
                                                    text="#{currentRow.value['codigo_dominio_1x4y3']}"
                                                    rendered="#{DominioPorClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{DominioPorClaseRecurso1.labelIdDominioSegmento1}"
                                                    id="labelIdDominioSegmento1"
                                                    for="campoIdDominioSegmento1"/>
                                                <webuijsf:textField id="campoIdDominioSegmento1"
                                                    binding="#{DominioPorClaseRecurso1.campoIdDominioSegmento1}"
                                                    readOnly="#{DominioPorClaseRecurso1.gestor.filaNoProcesada}"
                                                    text="#{DominioPorClaseRecurso1.asistente.textoCampoIdDominioSegmento1}"
                                                    toolTip="#{DominioPorClaseRecurso1.asistente.toolTipCampoIdDominioSegmento1}"
                                                    validatorExpression="#{DominioPorClaseRecurso1.campoIdDominioSegmento1_validate}"/>
                                                <webuijsf:staticText id="campoIdDominioSegmento1Texto1"
                                                    binding="#{DominioPorClaseRecurso1.campoIdDominioSegmento1Texto1}"
                                                    text="#{currentRow.value['codigo_dominio_1x4y3']}"/>
                                                <webuijsf:message id="messageIdDominioSegmento1"
                                                    for="campoIdDominioSegmento1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdDominioSegmento3" rendered="false"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdDominioSegmento3"
                                                    text="#{currentRow.value['id_dominio_segmento']}"
                                                    rendered="#{DominioPorClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{DominioPorClaseRecurso1.campoIdDominioSegmento1Boton1}"
                                                    id="campoIdDominioSegmento1Boton1"
                                                    onClick="#{DominioPorClaseRecurso1.asistente.scriptCampoIdDominioSegmento1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{DominioPorClaseRecurso1.campoIdDominioSegmento1Boton3}"
                                                    id="campoIdDominioSegmento1Boton3"
                                                    onClick="#{DominioPorClaseRecurso1.asistente.scriptCampoIdDominioSegmento1Boton2}"
                                                    rendered="#{DominioPorClaseRecurso1.asistente.campoIdDominioSegmento1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{DominioPorClaseRecurso1.tableColumnIdDominioSegmento2}"
                                                    headerText="nombre dominio segmento"
                                                    id="tableColumnIdDominioSegmento2" rendered="false"
                                                    sort="nombre_dominio_1x4y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdDominioSegmento2"
                                                    text="#{currentRow.value['nombre_dominio_1x4y4']}"
                                                    rendered="#{DominioPorClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{DominioPorClaseRecurso1.labelIdDominioSegmento2}"
                                                    id="labelIdDominioSegmento2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{DominioPorClaseRecurso1.campoIdDominioSegmento1Hiper1}"
                                                    id="campoIdDominioSegmento1Hiper1"
                                                    text="#{currentRow.value['nombre_dominio_1x4y4']}"
                                                    onClick="#{DominioPorClaseRecurso1.asistente.scriptCampoIdDominioSegmento1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdDominioSegmento1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{DominioPorClaseRecurso1.tableColumnIdPaquete1}"
                                                    toolTip="BundleParametros.id_paquete.dominio"
                                                    headerText="paquete"
                                                    id="tableColumnIdPaquete1" rendered="false"
                                                    sort="codigo_paquete_1x5y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdPaquete1"
                                                    text="#{currentRow.value['codigo_paquete_1x5y3']}"
                                                    rendered="#{DominioPorClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{DominioPorClaseRecurso1.labelIdPaquete1}"
                                                    id="labelIdPaquete1"
                                                    for="campoIdPaquete1"/>
                                                <webuijsf:textField id="campoIdPaquete1"
                                                    binding="#{DominioPorClaseRecurso1.campoIdPaquete1}"
                                                    readOnly="#{DominioPorClaseRecurso1.gestor.filaNoProcesada}"
                                                    text="#{DominioPorClaseRecurso1.asistente.textoCampoIdPaquete1}"
                                                    toolTip="#{DominioPorClaseRecurso1.asistente.toolTipCampoIdPaquete1}"
                                                    validatorExpression="#{DominioPorClaseRecurso1.campoIdPaquete1_validate}"/>
                                                <webuijsf:staticText id="campoIdPaquete1Texto1"
                                                    binding="#{DominioPorClaseRecurso1.campoIdPaquete1Texto1}"
                                                    text="#{currentRow.value['codigo_paquete_1x5y3']}"/>
                                                <webuijsf:message id="messageIdPaquete1"
                                                    for="campoIdPaquete1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdPaquete3" rendered="false"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdPaquete3"
                                                    text="#{currentRow.value['id_paquete']}"
                                                    rendered="#{DominioPorClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{DominioPorClaseRecurso1.campoIdPaquete1Boton1}"
                                                    id="campoIdPaquete1Boton1"
                                                    onClick="#{DominioPorClaseRecurso1.asistente.scriptCampoIdPaquete1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{DominioPorClaseRecurso1.campoIdPaquete1Boton3}"
                                                    id="campoIdPaquete1Boton3"
                                                    onClick="#{DominioPorClaseRecurso1.asistente.scriptCampoIdPaquete1Boton2}"
                                                    rendered="#{DominioPorClaseRecurso1.asistente.campoIdPaquete1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{DominioPorClaseRecurso1.tableColumnIdPaquete2}"
                                                    headerText="nombre paquete"
                                                    id="tableColumnIdPaquete2" rendered="false"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdPaquete2"
                                                    text="#{currentRow.value['id_paquete']}"
                                                    rendered="#{DominioPorClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{DominioPorClaseRecurso1.labelIdPaquete2}"
                                                    id="labelIdPaquete2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{DominioPorClaseRecurso1.campoIdPaquete1Hiper1}"
                                                    id="campoIdPaquete1Hiper1"
                                                    onClick="#{DominioPorClaseRecurso1.asistente.scriptCampoIdPaquete1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdPaquete1Boton2"
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
                                                        binding="#{DominioPorClaseRecurso1.etiquetaTextoFilasPorPagina1}" 
                                                        for="textoFilasPorPagina1"
                                                        id="etiquetaTextoFilasPorPagina1" 
                                                        text="#{DominioPorClaseRecurso1.gestor.i18n.textoEtiquetaTextoFilasPorPagina}"/>
                                                </h:panelGrid>
                                                <h:panelGrid 
                                                    columns="3" 
                                                    id="gridPanel107">
                                                    <webuijsf:textField 
                                                        binding="#{DominioPorClaseRecurso1.textoFilasPorPagina1}" 
                                                        columns="2"
                                                        converter="#{DominioPorClaseRecurso1.textoFilasPorPagina1Converter1}"
                                                        disabled="#{DominioPorClaseRecurso1.gestor.paginacionInhabilitada}" 
                                                        id="textoFilasPorPagina1" maxLength="2"
                                                        text="#{DominioPorClaseRecurso1.gestor.filasPorPagina}" 
                                                        validatorExpression="#{DominioPorClaseRecurso1.textoFilasPorPagina1Validator1.validate}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{DominioPorClaseRecurso1.botonRepaginar1_action}"
                                                        binding="#{DominioPorClaseRecurso1.botonRepaginar1}" 
                                                        id="botonRepaginar1"
                                                        imageURL="#{DominioPorClaseRecurso1.gestor.urlImagenRepaginar}" 
                                                        onClick="#{DominioPorClaseRecurso1.gestor.scriptRepaginar}"
                                                        text="#{DominioPorClaseRecurso1.gestor.i18n.textoBotonRepaginar}"
                                                        toolTip="#{DominioPorClaseRecurso1.gestor.i18n.toolTipBotonRepaginar}"/>
                                                    <webuijsf:message 
                                                        for="textoFilasPorPagina1" 
                                                        id="messageFilasPorPagina1"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="13"
                                                id="gridPanel108">
                                                <webuijsf:button
                                                    actionExpression="#{DominioPorClaseRecurso1.botonAgregar1_action}"
                                                    binding="#{DominioPorClaseRecurso1.botonAgregar1}"
                                                    disabled="#{DominioPorClaseRecurso1.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{DominioPorClaseRecurso1.gestor.scriptAgregar}"
                                                    rendered="#{DominioPorClaseRecurso1.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{DominioPorClaseRecurso1.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{DominioPorClaseRecurso1.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{DominioPorClaseRecurso1.listaFuncionEdicion1}"
                                                    converter="#{DominioPorClaseRecurso1.converterListaFuncionEdicion1}"
                                                    disabled="#{DominioPorClaseRecurso1.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{DominioPorClaseRecurso1.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{DominioPorClaseRecurso1.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{DominioPorClaseRecurso1.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{DominioPorClaseRecurso1.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{DominioPorClaseRecurso1.botonEditar1_action}"
                                                    binding="#{DominioPorClaseRecurso1.botonEditar1}"
                                                    disabled="#{DominioPorClaseRecurso1.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{DominioPorClaseRecurso1.gestor.scriptEditar}"
                                                    rendered="#{DominioPorClaseRecurso1.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{DominioPorClaseRecurso1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{DominioPorClaseRecurso1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{DominioPorClaseRecurso1.botonEliminar1_action}"
                                                    binding="#{DominioPorClaseRecurso1.botonEliminar1}"
                                                    disabled="#{DominioPorClaseRecurso1.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{DominioPorClaseRecurso1.gestor.scriptEliminar}"
                                                    rendered="#{DominioPorClaseRecurso1.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{DominioPorClaseRecurso1.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{DominioPorClaseRecurso1.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{DominioPorClaseRecurso1.botonAplicar1_action}"
                                                    binding="#{DominioPorClaseRecurso1.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{DominioPorClaseRecurso1.gestor.scriptAplicar}"
                                                    rendered="#{DominioPorClaseRecurso1.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{DominioPorClaseRecurso1.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{DominioPorClaseRecurso1.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{DominioPorClaseRecurso1.botonDeshacer1_action}"
                                                    binding="#{DominioPorClaseRecurso1.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{DominioPorClaseRecurso1.gestor.scriptDeshacer}"
                                                    rendered="#{DominioPorClaseRecurso1.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{DominioPorClaseRecurso1.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{DominioPorClaseRecurso1.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{DominioPorClaseRecurso1.botonConfirmar1_action}"
                                                    binding="#{DominioPorClaseRecurso1.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{DominioPorClaseRecurso1.gestor.scriptConfirmar}"
                                                    rendered="#{DominioPorClaseRecurso1.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{DominioPorClaseRecurso1.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{DominioPorClaseRecurso1.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{DominioPorClaseRecurso1.botonDescartar1_action}"
                                                    binding="#{DominioPorClaseRecurso1.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{DominioPorClaseRecurso1.gestor.scriptDescartar}"
                                                    rendered="#{DominioPorClaseRecurso1.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{DominioPorClaseRecurso1.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{DominioPorClaseRecurso1.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{DominioPorClaseRecurso1.listaFuncionAccion1}"
                                                    converter="#{DominioPorClaseRecurso1.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{DominioPorClaseRecurso1.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{DominioPorClaseRecurso1.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{DominioPorClaseRecurso1.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{DominioPorClaseRecurso1.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{DominioPorClaseRecurso1.botonProcesar1_action}"
                                                    binding="#{DominioPorClaseRecurso1.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{DominioPorClaseRecurso1.gestor.scriptProcesar}"
                                                    rendered="#{DominioPorClaseRecurso1.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{DominioPorClaseRecurso1.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{DominioPorClaseRecurso1.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{DominioPorClaseRecurso1.botonRefrescar1_action}"
                                                    binding="#{DominioPorClaseRecurso1.botonRefrescar1}"
                                                    disabled="#{DominioPorClaseRecurso1.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{DominioPorClaseRecurso1.gestor.scriptRefrescar}"
                                                    rendered="#{DominioPorClaseRecurso1.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{DominioPorClaseRecurso1.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{DominioPorClaseRecurso1.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{DominioPorClaseRecurso1.botonReconsultar1_action}"
                                                    binding="#{DominioPorClaseRecurso1.botonReconsultar1}"
                                                    disabled="#{DominioPorClaseRecurso1.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{DominioPorClaseRecurso1.gestor.scriptReconsultar}"
                                                    rendered="#{DominioPorClaseRecurso1.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{DominioPorClaseRecurso1.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{DominioPorClaseRecurso1.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{DominioPorClaseRecurso1.botonRetornar1_action}"
                                                    binding="#{DominioPorClaseRecurso1.botonRetornar1}"
                                                    disabled="#{DominioPorClaseRecurso1.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{DominioPorClaseRecurso1.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{DominioPorClaseRecurso1.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{DominioPorClaseRecurso1.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{DominioPorClaseRecurso1.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="4" 
                                                id="gridPanel109"
                                                rendered="#{DominioPorClaseRecurso1.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{DominioPorClaseRecurso1.imageHyperlink1_action}"
                                                    binding="#{DominioPorClaseRecurso1.imageHyperlink1}"
                                                    disabled="#{DominioPorClaseRecurso1.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{DominioPorClaseRecurso1.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{DominioPorClaseRecurso1.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.DominioPorClaseRecurso1_imageHyperlink1_toolTip}"/>
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{DominioPorClaseRecurso1.imageHyperlink2_action}"
                                                    binding="#{DominioPorClaseRecurso1.imageHyperlink2}"
                                                    disabled="#{DominioPorClaseRecurso1.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink2"
                                                    imageURL="#{DominioPorClaseRecurso1.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{DominioPorClaseRecurso1.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    text="Hyperlink2"
                                                    toolTip="#{bundle.DominioPorClaseRecurso1_imageHyperlink2_toolTip}"/>
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{DominioPorClaseRecurso1.imageHyperlink3_action}"
                                                    binding="#{DominioPorClaseRecurso1.imageHyperlink3}"
                                                    disabled="#{DominioPorClaseRecurso1.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink3"
                                                    imageURL="#{DominioPorClaseRecurso1.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{DominioPorClaseRecurso1.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    text="Hyperlink3"
                                                    toolTip="#{bundle.DominioPorClaseRecurso1_imageHyperlink3_toolTip}"/>
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{DominioPorClaseRecurso1.imageHyperlink4_action}"
                                                    binding="#{DominioPorClaseRecurso1.imageHyperlink4}"
                                                    disabled="#{DominioPorClaseRecurso1.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink4"
                                                    imageURL="#{DominioPorClaseRecurso1.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{DominioPorClaseRecurso1.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{DominioPorClaseRecurso1.gestor.designing}"
                                                    text="Hyperlink4"
                                                    toolTip="#{bundle.DominioPorClaseRecurso1_imageHyperlink4_toolTip}"/>
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
