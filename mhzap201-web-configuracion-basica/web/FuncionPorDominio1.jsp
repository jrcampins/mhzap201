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
                    focus="#{FuncionPorDominio1.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{FuncionPorDominio1.gestor.preserveFocus}"
                    preserveScroll="#{FuncionPorDominio1.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{FuncionPorDominio1.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | checkbox1 campoIdFuncion1 campoCodigoFuncion1 campoNombreFuncion1 campoDescripcionFuncion1 listaNumeroTipoFuncion1 listaNumeroTipoRastroFun1 campoClausulaWhere1 campoClausulaOrder1 listaEsPublica1 listaEsProgramatica1 listaEsPersonalizada1 listaEsSegmentada1 campoIdGrupoProceso1 textoFilasPorPagina1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | textoFilasPorPagina1 | botonRepaginar1 , virtualForm3 | checkbox1 listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonEscogerFila1 botonDetallarFila1 botonProcesarFila1 botonRetornarFila1 botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{FuncionPorDominio1.breadcrumbs1}" 
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
                                                    rendered="#{FuncionPorDominio1.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{FuncionPorDominio1.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{FuncionPorDominio1.gestor.mensajeDisponible}"
                                                    text="#{FuncionPorDominio1.gestor.mensaje}"
                                                    url="#{FuncionPorDominio1.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:table
                                            binding="#{FuncionPorDominio1.table1}"
                                            clearSortButton="true" 
                                            deselectMultipleButton="true" 
                                            id="table1"
                                            paginateButton="false"
                                            paginationControls="true" 
                                            selectMultipleButton="true" 
                                            sortPanelToggleButton="true"
                                            width="960">
                                            <webuijsf:tableRowGroup 
                                                binding="#{FuncionPorDominio1.tableRowGroup1}" 
                                                id="tableRowGroup1" 
                                                rows="1"
                                                selected="#{FuncionPorDominio1.gestor.filaEscogida}" 
                                                sourceData="#{FuncionPorDominio1.funcionDataProvider}" 
                                                sourceVar="currentRow">
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    id="tableRowGroup1SelectionColumn"
                                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);" 
                                                    selectId="checkbox1">
                                                    <webuijsf:checkbox 
                                                        binding="#{FuncionPorDominio1.checkbox1}" 
                                                        id="checkbox1"
                                                        onClick="#{FuncionPorDominio1.gestor.scriptElegir}" 
                                                        selected="#{FuncionPorDominio1.gestor.filaElegida}" 
                                                        toolTip="#{FuncionPorDominio1.gestor.i18n.toolTipCheckboxSeleccionMultiple}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    binding="#{FuncionPorDominio1.tableColumn1}" 
                                                    id="tableColumn1">
                                                    <webuijsf:button 
                                                        actionExpression="#{FuncionPorDominio1.botonEscogerFila1_action}"
                                                        binding="#{FuncionPorDominio1.botonEscogerFila1}"
                                                        disabled="#{FuncionPorDominio1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonEscogerFila1"
                                                        imageURL="#{FuncionPorDominio1.gestor.urlImagenEscoger}" 
                                                        onClick="#{FuncionPorDominio1.gestor.scriptEscoger}"
                                                        text="#{FuncionPorDominio1.gestor.i18n.textoBotonEscogerFila}"
                                                        toolTip="#{FuncionPorDominio1.gestor.i18n.toolTipBotonEscogerFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{FuncionPorDominio1.botonDetallarFila1_action}"
                                                        binding="#{FuncionPorDominio1.botonDetallarFila1}"
                                                        disabled="#{FuncionPorDominio1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonDetallarFila1"
                                                        imageURL="#{FuncionPorDominio1.gestor.urlImagenDetallar}" 
                                                        onClick="#{FuncionPorDominio1.scriptAbrirVentanaVerDetalle}"
                                                        rendered="#{FuncionPorDominio1.gestor.detalleDisponible}" 
                                                        text="#{FuncionPorDominio1.gestor.i18n.textoBotonDetallarFila}"
                                                        toolTip="#{FuncionPorDominio1.gestor.i18n.toolTipBotonDetallarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{FuncionPorDominio1.botonProcesarFila1_action}"
                                                        binding="#{FuncionPorDominio1.botonProcesarFila1}"
                                                        disabled="#{FuncionPorDominio1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonProcesarFila1"
                                                        imageURL="#{FuncionPorDominio1.gestor.urlImagenProcesar}" 
                                                        onClick="#{FuncionPorDominio1.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{FuncionPorDominio1.asistente.comandoDisponible}" 
                                                        text="#{FuncionPorDominio1.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{FuncionPorDominio1.gestor.i18n.toolTipBotonProcesarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{FuncionPorDominio1.botonRetornarFila1_action}"
                                                        binding="#{FuncionPorDominio1.botonRetornarFila1}" 
                                                        disabled="#{FuncionPorDominio1.gestor.funcionReturnInhabilitada}"
                                                        id="botonRetornarFila1"
                                                        imageURL="#{FuncionPorDominio1.gestor.urlImagenRetornar}"
                                                        onClick="#{FuncionPorDominio1.gestor.scriptRetornarRecursoActual}"
                                                        rendered="#{FuncionPorDominio1.gestor.funcionReturnVisible}" 
                                                        text="#{FuncionPorDominio1.gestor.i18n.textoBotonRetornarFila}"
                                                        toolTip="#{FuncionPorDominio1.gestor.i18n.toolTipBotonRetornarFila}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FuncionPorDominio1.tableColumn2}"
                                                    id="tableColumn2"
                                                    rendered="#{FuncionPorDominio1.gestor.designing}">
                                                    <webuijsf:imageHyperlink
                                                        actionExpression="#{FuncionPorDominio1.hipervinculoAccionFila1_action}"
                                                        binding="#{FuncionPorDominio1.hipervinculoAccionFila1}"
                                                        disabled="#{FuncionPorDominio1.gestor.loteConCambios}"
                                                        id="hipervinculoAccionFila1"
                                                        imageURL="#{FuncionPorDominio1.gestor.urlImagenEjecutarVinculo}"
                                                        onClick="#{FuncionPorDominio1.scriptAbrirVentanaAccionFila1}"
                                                        text="Accion1"
                                                        toolTip="#{bundle.FuncionPorDominio1_hipervinculoAccionFila1_toolTip}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="right" 
                                                    binding="#{FuncionPorDominio1.tableColumn3}" 
                                                    headerText="#{FuncionPorDominio1.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{FuncionPorDominio1.gestor.i18n.toolTipEtiquetaIdentificacionFila}"
                                                    id="tableColumn3">
                                                    <webuijsf:imageHyperlink 
                                                        actionExpression="#{FuncionPorDominio1.hipervinculoDetallarFila1_action}"
                                                        binding="#{FuncionPorDominio1.hipervinculoDetallarFila1}" 
                                                        id="hipervinculoDetallarFila1"
                                                        imageURL="#{FuncionPorDominio1.gestor.urlImagenFilaProcesada}"
                                                        textPosition="left" 
                                                        text="#{FuncionPorDominio1.gestor.identificacionFila}" 
                                                        toolTip="#{FuncionPorDominio1.gestor.toolTipImagenFilaProcesada}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FuncionPorDominio1.tableColumnIdFuncion1}"
                                                    headerText="identificaci&#243;n"
                                                    id="tableColumnIdFuncion1"
                                                    sort="id_funcion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdFuncion1"
                                                    text="#{currentRow.value['id_funcion']}"
                                                    rendered="#{FuncionPorDominio1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FuncionPorDominio1.labelIdFuncion1}"
                                                    id="labelIdFuncion1"
                                                    for="campoIdFuncion1"/>
                                                <webuijsf:textField id="campoIdFuncion1"
                                                    binding="#{FuncionPorDominio1.campoIdFuncion1}"
                                                    converter="#{FuncionPorDominio1.converterIdFuncion1}"
                                                    readOnly="#{FuncionPorDominio1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['id_funcion']}"
                                                    toolTip="BundleParametros.id_funcion.funcion"
                                                    validatorExpression="#{FuncionPorDominio1.validatorIdFuncion1.validate}"/>
                                                <webuijsf:staticText id="campoIdFuncion1Texto1"
                                                    binding="#{FuncionPorDominio1.campoIdFuncion1Texto1}"
                                                    text="#{currentRow.value['id_funcion']}"/>
                                                <webuijsf:message id="messageIdFuncion1"
                                                    for="campoIdFuncion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FuncionPorDominio1.tableColumnCodigoFuncion1}"
                                                    headerText="c&#243;digo"
                                                    id="tableColumnCodigoFuncion1"
                                                    sort="codigo_funcion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextCodigoFuncion1"
                                                    text="#{currentRow.value['codigo_funcion']}"
                                                    rendered="#{FuncionPorDominio1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FuncionPorDominio1.labelCodigoFuncion1}"
                                                    id="labelCodigoFuncion1"
                                                    for="campoCodigoFuncion1"/>
                                                <webuijsf:textField id="campoCodigoFuncion1"
                                                    binding="#{FuncionPorDominio1.campoCodigoFuncion1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{FuncionPorDominio1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['codigo_funcion']}"
                                                    toolTip="BundleParametros.codigo_funcion.funcion"
                                                    validatorExpression="#{FuncionPorDominio1.validatorCodigoFuncion1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoFuncion1Texto1"
                                                    binding="#{FuncionPorDominio1.campoCodigoFuncion1Texto1}"
                                                    text="#{currentRow.value['codigo_funcion']}"/>
                                                <webuijsf:message id="messageCodigoFuncion1"
                                                    for="campoCodigoFuncion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FuncionPorDominio1.tableColumnNombreFuncion1}"
                                                    headerText="nombre"
                                                    id="tableColumnNombreFuncion1"
                                                    sort="nombre_funcion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNombreFuncion1"
                                                    text="#{currentRow.value['nombre_funcion']}"
                                                    rendered="#{FuncionPorDominio1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FuncionPorDominio1.labelNombreFuncion1}"
                                                    id="labelNombreFuncion1"
                                                    for="campoNombreFuncion1"/>
                                                <webuijsf:textField id="campoNombreFuncion1"
                                                    binding="#{FuncionPorDominio1.campoNombreFuncion1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{FuncionPorDominio1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['nombre_funcion']}"
                                                    toolTip="BundleParametros.nombre_funcion.funcion"
                                                    validatorExpression="#{FuncionPorDominio1.validatorNombreFuncion1.validate}"/>
                                                <webuijsf:staticText id="campoNombreFuncion1Texto1"
                                                    binding="#{FuncionPorDominio1.campoNombreFuncion1Texto1}"
                                                    text="#{currentRow.value['nombre_funcion']}"/>
                                                <webuijsf:message id="messageNombreFuncion1"
                                                    for="campoNombreFuncion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FuncionPorDominio1.tableColumnDescripcionFuncion1}"
                                                    headerText="descripci&#243;n"
                                                    id="tableColumnDescripcionFuncion1" rendered="false"
                                                    sort="descripcion_funcion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextDescripcionFuncion1"
                                                    text="#{currentRow.value['descripcion_funcion']}"
                                                    rendered="#{FuncionPorDominio1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FuncionPorDominio1.labelDescripcionFuncion1}"
                                                    id="labelDescripcionFuncion1"
                                                    for="campoDescripcionFuncion1"/>
                                                <webuijsf:textArea id="campoDescripcionFuncion1"
                                                    binding="#{FuncionPorDominio1.campoDescripcionFuncion1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{FuncionPorDominio1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['descripcion_funcion']}"
                                                    toolTip="BundleParametros.descripcion_funcion.funcion"
                                                    validatorExpression="#{FuncionPorDominio1.validatorDescripcionFuncion1.validate}"/>
                                                <webuijsf:staticText id="campoDescripcionFuncion1Texto1"
                                                    binding="#{FuncionPorDominio1.campoDescripcionFuncion1Texto1}"
                                                    text="#{currentRow.value['descripcion_funcion']}"/>
                                                <webuijsf:message id="messageDescripcionFuncion1"
                                                    for="campoDescripcionFuncion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FuncionPorDominio1.tableColumnNumeroTipoFuncion1}"
                                                    headerText="tipo"
                                                    id="tableColumnNumeroTipoFuncion1"
                                                    sort="codigo_tipo_funcion_1x1y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroTipoFuncion1"
                                                    text="#{currentRow.value['codigo_tipo_funcion_1x1y2']}"
                                                    rendered="#{FuncionPorDominio1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FuncionPorDominio1.labelNumeroTipoFuncion1}"
                                                    id="labelNumeroTipoFuncion1"
                                                    for="listaNumeroTipoFuncion1"/>
                                                <webuijsf:dropDown id="listaNumeroTipoFuncion1"
                                                    binding="#{FuncionPorDominio1.listaNumeroTipoFuncion1}"
                                                    converter="#{FuncionPorDominio1.converterNumeroTipoFuncion1}"
                                                    disabled="#{FuncionPorDominio1.gestor.filaNoProcesada}" required="true"
                                                    items="#{FuncionPorDominio1.asistente.opcionesListaNumeroTipoFuncion1}"
                                                    selected="#{currentRow.value['numero_tipo_funcion']}"
                                                    toolTip="BundleParametros.numero_tipo_funcion.funcion"/>
                                                <webuijsf:staticText id="listaNumeroTipoFuncion1Texto1"
                                                    binding="#{FuncionPorDominio1.listaNumeroTipoFuncion1Texto1}"
                                                    text="#{currentRow.value['codigo_tipo_funcion_1x1y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoFuncion1"
                                                    for="listaNumeroTipoFuncion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FuncionPorDominio1.tableColumnNumeroTipoRastroFun1}"
                                                    headerText="tipo rastro"
                                                    id="tableColumnNumeroTipoRastroFun1" rendered="false"
                                                    sort="codigo_tipo_rastro_fun_1x2y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroTipoRastroFun1"
                                                    text="#{currentRow.value['codigo_tipo_rastro_fun_1x2y2']}"
                                                    rendered="#{FuncionPorDominio1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FuncionPorDominio1.labelNumeroTipoRastroFun1}"
                                                    id="labelNumeroTipoRastroFun1"
                                                    for="listaNumeroTipoRastroFun1"/>
                                                <webuijsf:dropDown id="listaNumeroTipoRastroFun1"
                                                    binding="#{FuncionPorDominio1.listaNumeroTipoRastroFun1}"
                                                    converter="#{FuncionPorDominio1.converterNumeroTipoRastroFun1}"
                                                    disabled="#{FuncionPorDominio1.gestor.filaNoProcesada}" required="true"
                                                    items="#{FuncionPorDominio1.asistente.opcionesListaNumeroTipoRastroFun1}"
                                                    selected="#{currentRow.value['numero_tipo_rastro_fun']}"
                                                    toolTip="BundleParametros.numero_tipo_rastro_fun.funcion"/>
                                                <webuijsf:staticText id="listaNumeroTipoRastroFun1Texto1"
                                                    binding="#{FuncionPorDominio1.listaNumeroTipoRastroFun1Texto1}"
                                                    text="#{currentRow.value['codigo_tipo_rastro_fun_1x2y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoRastroFun1"
                                                    for="listaNumeroTipoRastroFun1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FuncionPorDominio1.tableColumnClausulaWhere1}"
                                                    headerText="clausula where"
                                                    id="tableColumnClausulaWhere1" rendered="false"
                                                    sort="clausula_where">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextClausulaWhere1"
                                                    text="#{currentRow.value['clausula_where']}"
                                                    rendered="#{FuncionPorDominio1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FuncionPorDominio1.labelClausulaWhere1}"
                                                    id="labelClausulaWhere1"
                                                    for="campoClausulaWhere1"/>
                                                <webuijsf:textArea id="campoClausulaWhere1"
                                                    binding="#{FuncionPorDominio1.campoClausulaWhere1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{FuncionPorDominio1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['clausula_where']}"
                                                    toolTip="BundleParametros.clausula_where.funcion"
                                                    validatorExpression="#{FuncionPorDominio1.validatorClausulaWhere1.validate}"/>
                                                <webuijsf:staticText id="campoClausulaWhere1Texto1"
                                                    binding="#{FuncionPorDominio1.campoClausulaWhere1Texto1}"
                                                    text="#{currentRow.value['clausula_where']}"/>
                                                <webuijsf:message id="messageClausulaWhere1"
                                                    for="campoClausulaWhere1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FuncionPorDominio1.tableColumnClausulaOrder1}"
                                                    headerText="clausula order"
                                                    id="tableColumnClausulaOrder1" rendered="false"
                                                    sort="clausula_order">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextClausulaOrder1"
                                                    text="#{currentRow.value['clausula_order']}"
                                                    rendered="#{FuncionPorDominio1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FuncionPorDominio1.labelClausulaOrder1}"
                                                    id="labelClausulaOrder1"
                                                    for="campoClausulaOrder1"/>
                                                <webuijsf:textArea id="campoClausulaOrder1"
                                                    binding="#{FuncionPorDominio1.campoClausulaOrder1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{FuncionPorDominio1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['clausula_order']}"
                                                    toolTip="BundleParametros.clausula_order.funcion"
                                                    validatorExpression="#{FuncionPorDominio1.validatorClausulaOrder1.validate}"/>
                                                <webuijsf:staticText id="campoClausulaOrder1Texto1"
                                                    binding="#{FuncionPorDominio1.campoClausulaOrder1Texto1}"
                                                    text="#{currentRow.value['clausula_order']}"/>
                                                <webuijsf:message id="messageClausulaOrder1"
                                                    for="campoClausulaOrder1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FuncionPorDominio1.tableColumnEsPublica1}"
                                                    headerText="p&#250;blica"
                                                    id="tableColumnEsPublica1" rendered="false"
                                                    sort="es_publica">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsPublica1"
                                                    text="#{currentRow.value['es_publica']}"
                                                    rendered="#{FuncionPorDominio1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FuncionPorDominio1.labelEsPublica1}"
                                                    id="labelEsPublica1"
                                                    for="listaEsPublica1"/>
                                                <webuijsf:dropDown id="listaEsPublica1"
                                                    binding="#{FuncionPorDominio1.listaEsPublica1}"
                                                    converter="#{FuncionPorDominio1.converterEsPublica1}"
                                                    disabled="#{FuncionPorDominio1.gestor.filaNoProcesada}" required="true"
                                                    items="#{FuncionPorDominio1.asistente.opcionesListaEsPublica1}"
                                                    selected="#{currentRow.value['es_publica']}"
                                                    toolTip="BundleParametros.es_publica.funcion"/>
                                                <webuijsf:staticText id="listaEsPublica1Texto1"
                                                    binding="#{FuncionPorDominio1.listaEsPublica1Texto1}"/>
                                                <webuijsf:message id="messageEsPublica1"
                                                    for="listaEsPublica1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FuncionPorDominio1.tableColumnEsProgramatica1}"
                                                    headerText="program&#225;tica"
                                                    id="tableColumnEsProgramatica1" rendered="false"
                                                    sort="es_programatica">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsProgramatica1"
                                                    text="#{currentRow.value['es_programatica']}"
                                                    rendered="#{FuncionPorDominio1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FuncionPorDominio1.labelEsProgramatica1}"
                                                    id="labelEsProgramatica1"
                                                    for="listaEsProgramatica1"/>
                                                <webuijsf:dropDown id="listaEsProgramatica1"
                                                    binding="#{FuncionPorDominio1.listaEsProgramatica1}"
                                                    converter="#{FuncionPorDominio1.converterEsProgramatica1}"
                                                    disabled="#{FuncionPorDominio1.gestor.filaNoProcesada}" required="true"
                                                    items="#{FuncionPorDominio1.asistente.opcionesListaEsProgramatica1}"
                                                    selected="#{currentRow.value['es_programatica']}"
                                                    toolTip="BundleParametros.es_programatica.funcion"/>
                                                <webuijsf:staticText id="listaEsProgramatica1Texto1"
                                                    binding="#{FuncionPorDominio1.listaEsProgramatica1Texto1}"/>
                                                <webuijsf:message id="messageEsProgramatica1"
                                                    for="listaEsProgramatica1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FuncionPorDominio1.tableColumnEsPersonalizada1}"
                                                    headerText="personalizada"
                                                    id="tableColumnEsPersonalizada1" rendered="false"
                                                    sort="es_personalizada">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsPersonalizada1"
                                                    text="#{currentRow.value['es_personalizada']}"
                                                    rendered="#{FuncionPorDominio1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FuncionPorDominio1.labelEsPersonalizada1}"
                                                    id="labelEsPersonalizada1"
                                                    for="listaEsPersonalizada1"/>
                                                <webuijsf:dropDown id="listaEsPersonalizada1"
                                                    binding="#{FuncionPorDominio1.listaEsPersonalizada1}"
                                                    converter="#{FuncionPorDominio1.converterEsPersonalizada1}"
                                                    disabled="#{FuncionPorDominio1.gestor.filaNoProcesada}" required="true"
                                                    items="#{FuncionPorDominio1.asistente.opcionesListaEsPersonalizada1}"
                                                    selected="#{currentRow.value['es_personalizada']}"
                                                    toolTip="BundleParametros.es_personalizada.funcion"/>
                                                <webuijsf:staticText id="listaEsPersonalizada1Texto1"
                                                    binding="#{FuncionPorDominio1.listaEsPersonalizada1Texto1}"/>
                                                <webuijsf:message id="messageEsPersonalizada1"
                                                    for="listaEsPersonalizada1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FuncionPorDominio1.tableColumnEsSegmentada1}"
                                                    headerText="segmentada"
                                                    id="tableColumnEsSegmentada1" rendered="false"
                                                    sort="es_segmentada">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsSegmentada1"
                                                    text="#{currentRow.value['es_segmentada']}"
                                                    rendered="#{FuncionPorDominio1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FuncionPorDominio1.labelEsSegmentada1}"
                                                    id="labelEsSegmentada1"
                                                    for="listaEsSegmentada1"/>
                                                <webuijsf:dropDown id="listaEsSegmentada1"
                                                    binding="#{FuncionPorDominio1.listaEsSegmentada1}"
                                                    converter="#{FuncionPorDominio1.converterEsSegmentada1}"
                                                    disabled="#{FuncionPorDominio1.gestor.filaNoProcesada}" required="true"
                                                    items="#{FuncionPorDominio1.asistente.opcionesListaEsSegmentada1}"
                                                    selected="#{currentRow.value['es_segmentada']}"
                                                    toolTip="BundleParametros.es_segmentada.funcion"/>
                                                <webuijsf:staticText id="listaEsSegmentada1Texto1"
                                                    binding="#{FuncionPorDominio1.listaEsSegmentada1Texto1}"/>
                                                <webuijsf:message id="messageEsSegmentada1"
                                                    for="listaEsSegmentada1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FuncionPorDominio1.tableColumnIdGrupoProceso1}"
                                                    headerText="grupo proceso"
                                                    id="tableColumnIdGrupoProceso1" rendered="false"
                                                    sort="codigo_grupo_proceso_1x4y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdGrupoProceso1"
                                                    text="#{currentRow.value['codigo_grupo_proceso_1x4y3']}"
                                                    rendered="#{FuncionPorDominio1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FuncionPorDominio1.labelIdGrupoProceso1}"
                                                    id="labelIdGrupoProceso1"
                                                    for="campoIdGrupoProceso1"/>
                                                <webuijsf:textField id="campoIdGrupoProceso1"
                                                    binding="#{FuncionPorDominio1.campoIdGrupoProceso1}"
                                                    readOnly="#{FuncionPorDominio1.gestor.filaNoProcesada}"
                                                    text="#{FuncionPorDominio1.asistente.textoCampoIdGrupoProceso1}"
                                                    toolTip="#{FuncionPorDominio1.asistente.toolTipCampoIdGrupoProceso1}"
                                                    validatorExpression="#{FuncionPorDominio1.campoIdGrupoProceso1_validate}"/>
                                                <webuijsf:staticText id="campoIdGrupoProceso1Texto1"
                                                    binding="#{FuncionPorDominio1.campoIdGrupoProceso1Texto1}"
                                                    text="#{currentRow.value['codigo_grupo_proceso_1x4y3']}"/>
                                                <webuijsf:message id="messageIdGrupoProceso1"
                                                    for="campoIdGrupoProceso1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdGrupoProceso3" rendered="false"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdGrupoProceso3"
                                                    text="#{currentRow.value['id_grupo_proceso']}"
                                                    rendered="#{FuncionPorDominio1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{FuncionPorDominio1.campoIdGrupoProceso1Boton1}"
                                                    id="campoIdGrupoProceso1Boton1"
                                                    onClick="#{FuncionPorDominio1.asistente.scriptCampoIdGrupoProceso1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{FuncionPorDominio1.campoIdGrupoProceso1Boton3}"
                                                    id="campoIdGrupoProceso1Boton3"
                                                    onClick="#{FuncionPorDominio1.asistente.scriptCampoIdGrupoProceso1Boton2}"
                                                    rendered="#{FuncionPorDominio1.asistente.campoIdGrupoProceso1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{FuncionPorDominio1.tableColumnIdGrupoProceso2}"
                                                    headerText="nombre grupo proceso"
                                                    id="tableColumnIdGrupoProceso2" rendered="false"
                                                    sort="nombre_grupo_proceso_1x4y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdGrupoProceso2"
                                                    text="#{currentRow.value['nombre_grupo_proceso_1x4y4']}"
                                                    rendered="#{FuncionPorDominio1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FuncionPorDominio1.labelIdGrupoProceso2}"
                                                    id="labelIdGrupoProceso2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{FuncionPorDominio1.campoIdGrupoProceso1Hiper1}"
                                                    id="campoIdGrupoProceso1Hiper1"
                                                    text="#{currentRow.value['nombre_grupo_proceso_1x4y4']}"
                                                    onClick="#{FuncionPorDominio1.asistente.scriptCampoIdGrupoProceso1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdGrupoProceso1Boton2"
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
                                                        binding="#{FuncionPorDominio1.etiquetaTextoFilasPorPagina1}" 
                                                        for="textoFilasPorPagina1"
                                                        id="etiquetaTextoFilasPorPagina1" 
                                                        text="#{FuncionPorDominio1.gestor.i18n.textoEtiquetaTextoFilasPorPagina}"/>
                                                </h:panelGrid>
                                                <h:panelGrid 
                                                    columns="3" 
                                                    id="gridPanel107">
                                                    <webuijsf:textField 
                                                        binding="#{FuncionPorDominio1.textoFilasPorPagina1}" 
                                                        columns="2"
                                                        converter="#{FuncionPorDominio1.textoFilasPorPagina1Converter1}"
                                                        disabled="#{FuncionPorDominio1.gestor.paginacionInhabilitada}" 
                                                        id="textoFilasPorPagina1" maxLength="2"
                                                        text="#{FuncionPorDominio1.gestor.filasPorPagina}" 
                                                        validatorExpression="#{FuncionPorDominio1.textoFilasPorPagina1Validator1.validate}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{FuncionPorDominio1.botonRepaginar1_action}"
                                                        binding="#{FuncionPorDominio1.botonRepaginar1}" 
                                                        id="botonRepaginar1"
                                                        imageURL="#{FuncionPorDominio1.gestor.urlImagenRepaginar}" 
                                                        onClick="#{FuncionPorDominio1.gestor.scriptRepaginar}"
                                                        text="#{FuncionPorDominio1.gestor.i18n.textoBotonRepaginar}"
                                                        toolTip="#{FuncionPorDominio1.gestor.i18n.toolTipBotonRepaginar}"/>
                                                    <webuijsf:message 
                                                        for="textoFilasPorPagina1" 
                                                        id="messageFilasPorPagina1"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="13"
                                                id="gridPanel108">
                                                <webuijsf:button
                                                    actionExpression="#{FuncionPorDominio1.botonAgregar1_action}"
                                                    binding="#{FuncionPorDominio1.botonAgregar1}"
                                                    disabled="#{FuncionPorDominio1.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{FuncionPorDominio1.gestor.scriptAgregar}"
                                                    rendered="#{FuncionPorDominio1.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FuncionPorDominio1.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{FuncionPorDominio1.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{FuncionPorDominio1.listaFuncionEdicion1}"
                                                    converter="#{FuncionPorDominio1.converterListaFuncionEdicion1}"
                                                    disabled="#{FuncionPorDominio1.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{FuncionPorDominio1.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{FuncionPorDominio1.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{FuncionPorDominio1.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{FuncionPorDominio1.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FuncionPorDominio1.botonEditar1_action}"
                                                    binding="#{FuncionPorDominio1.botonEditar1}"
                                                    disabled="#{FuncionPorDominio1.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{FuncionPorDominio1.gestor.scriptEditar}"
                                                    rendered="#{FuncionPorDominio1.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FuncionPorDominio1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{FuncionPorDominio1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FuncionPorDominio1.botonEliminar1_action}"
                                                    binding="#{FuncionPorDominio1.botonEliminar1}"
                                                    disabled="#{FuncionPorDominio1.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{FuncionPorDominio1.gestor.scriptEliminar}"
                                                    rendered="#{FuncionPorDominio1.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FuncionPorDominio1.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{FuncionPorDominio1.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FuncionPorDominio1.botonAplicar1_action}"
                                                    binding="#{FuncionPorDominio1.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{FuncionPorDominio1.gestor.scriptAplicar}"
                                                    rendered="#{FuncionPorDominio1.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FuncionPorDominio1.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{FuncionPorDominio1.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FuncionPorDominio1.botonDeshacer1_action}"
                                                    binding="#{FuncionPorDominio1.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{FuncionPorDominio1.gestor.scriptDeshacer}"
                                                    rendered="#{FuncionPorDominio1.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FuncionPorDominio1.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{FuncionPorDominio1.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FuncionPorDominio1.botonConfirmar1_action}"
                                                    binding="#{FuncionPorDominio1.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{FuncionPorDominio1.gestor.scriptConfirmar}"
                                                    rendered="#{FuncionPorDominio1.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FuncionPorDominio1.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{FuncionPorDominio1.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FuncionPorDominio1.botonDescartar1_action}"
                                                    binding="#{FuncionPorDominio1.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{FuncionPorDominio1.gestor.scriptDescartar}"
                                                    rendered="#{FuncionPorDominio1.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FuncionPorDominio1.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{FuncionPorDominio1.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{FuncionPorDominio1.listaFuncionAccion1}"
                                                    converter="#{FuncionPorDominio1.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{FuncionPorDominio1.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{FuncionPorDominio1.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{FuncionPorDominio1.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{FuncionPorDominio1.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FuncionPorDominio1.botonProcesar1_action}"
                                                    binding="#{FuncionPorDominio1.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{FuncionPorDominio1.gestor.scriptProcesar}"
                                                    rendered="#{FuncionPorDominio1.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FuncionPorDominio1.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{FuncionPorDominio1.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FuncionPorDominio1.botonRefrescar1_action}"
                                                    binding="#{FuncionPorDominio1.botonRefrescar1}"
                                                    disabled="#{FuncionPorDominio1.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{FuncionPorDominio1.gestor.scriptRefrescar}"
                                                    rendered="#{FuncionPorDominio1.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FuncionPorDominio1.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{FuncionPorDominio1.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FuncionPorDominio1.botonReconsultar1_action}"
                                                    binding="#{FuncionPorDominio1.botonReconsultar1}"
                                                    disabled="#{FuncionPorDominio1.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{FuncionPorDominio1.gestor.scriptReconsultar}"
                                                    rendered="#{FuncionPorDominio1.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FuncionPorDominio1.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{FuncionPorDominio1.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FuncionPorDominio1.botonRetornar1_action}"
                                                    binding="#{FuncionPorDominio1.botonRetornar1}"
                                                    disabled="#{FuncionPorDominio1.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{FuncionPorDominio1.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{FuncionPorDominio1.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FuncionPorDominio1.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{FuncionPorDominio1.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="3" 
                                                id="gridPanel109"
                                                rendered="#{FuncionPorDominio1.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{FuncionPorDominio1.imageHyperlink1_action}"
                                                    binding="#{FuncionPorDominio1.imageHyperlink1}"
                                                    disabled="#{FuncionPorDominio1.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{FuncionPorDominio1.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{FuncionPorDominio1.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.FuncionPorDominio1_imageHyperlink1_toolTip}"/>
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{FuncionPorDominio1.imageHyperlink2_action}"
                                                    binding="#{FuncionPorDominio1.imageHyperlink2}"
                                                    disabled="#{FuncionPorDominio1.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink2"
                                                    imageURL="#{FuncionPorDominio1.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{FuncionPorDominio1.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    text="Hyperlink2"
                                                    toolTip="#{bundle.FuncionPorDominio1_imageHyperlink2_toolTip}"/>
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{FuncionPorDominio1.imageHyperlink3_action}"
                                                    binding="#{FuncionPorDominio1.imageHyperlink3}"
                                                    disabled="#{FuncionPorDominio1.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink3"
                                                    imageURL="#{FuncionPorDominio1.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{FuncionPorDominio1.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{FuncionPorDominio1.gestor.designing}"
                                                    text="Hyperlink3"
                                                    toolTip="#{bundle.FuncionPorDominio1_imageHyperlink3_toolTip}"/>
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
