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
                    focus="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.preserveFocus}"
                    preserveScroll="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | checkbox1 campoIdFiltroClaRecSec1 campoIdClaseRecursoParColumna1 listaNumeroOperadorCom1 campoIdClaseRecursoParValor1 campoValor1 textoFilasPorPagina1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | textoFilasPorPagina1 | botonRepaginar1 , virtualForm3 | checkbox1 listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonEscogerFila1 botonDetallarFila1 botonProcesarFila1 botonRetornarFila1 botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.breadcrumbs1}" 
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
                                                    rendered="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.mensajeDisponible}"
                                                    text="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.mensaje}"
                                                    url="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:table
                                            binding="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.table1}"
                                            clearSortButton="true" 
                                            deselectMultipleButton="true" 
                                            id="table1"
                                            paginateButton="false"
                                            paginationControls="true" 
                                            selectMultipleButton="true" 
                                            sortPanelToggleButton="true"
                                            width="960">
                                            <webuijsf:tableRowGroup 
                                                binding="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.tableRowGroup1}" 
                                                id="tableRowGroup1" 
                                                rows="1"
                                                selected="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.filaEscogida}" 
                                                sourceData="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.filtroClaRecSecDataProvider}" 
                                                sourceVar="currentRow">
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    id="tableRowGroup1SelectionColumn"
                                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);" 
                                                    selectId="checkbox1">
                                                    <webuijsf:checkbox 
                                                        binding="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.checkbox1}" 
                                                        id="checkbox1"
                                                        onClick="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.scriptElegir}" 
                                                        selected="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.filaElegida}" 
                                                        toolTip="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.i18n.toolTipCheckboxSeleccionMultiple}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    binding="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.tableColumn1}" 
                                                    id="tableColumn1">
                                                    <webuijsf:button 
                                                        actionExpression="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.botonEscogerFila1_action}"
                                                        binding="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.botonEscogerFila1}"
                                                        disabled="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonEscogerFila1"
                                                        imageURL="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.urlImagenEscoger}" 
                                                        onClick="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.scriptEscoger}"
                                                        text="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.i18n.textoBotonEscogerFila}"
                                                        toolTip="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.i18n.toolTipBotonEscogerFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.botonDetallarFila1_action}"
                                                        binding="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.botonDetallarFila1}"
                                                        disabled="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonDetallarFila1"
                                                        imageURL="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.urlImagenDetallar}" 
                                                        onClick="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.scriptAbrirVentanaVerDetalle}"
                                                        rendered="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.detalleDisponible}" 
                                                        text="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.i18n.textoBotonDetallarFila}"
                                                        toolTip="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.i18n.toolTipBotonDetallarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.botonProcesarFila1_action}"
                                                        binding="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.botonProcesarFila1}"
                                                        disabled="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonProcesarFila1"
                                                        imageURL="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.urlImagenProcesar}" 
                                                        onClick="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.asistente.comandoDisponible}" 
                                                        text="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.i18n.toolTipBotonProcesarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.botonRetornarFila1_action}"
                                                        binding="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.botonRetornarFila1}" 
                                                        disabled="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.funcionReturnInhabilitada}"
                                                        id="botonRetornarFila1"
                                                        imageURL="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.urlImagenRetornar}"
                                                        onClick="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.scriptRetornarRecursoActual}"
                                                        rendered="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.funcionReturnVisible}" 
                                                        text="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.i18n.textoBotonRetornarFila}"
                                                        toolTip="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.i18n.toolTipBotonRetornarFila}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.tableColumn2}"
                                                    id="tableColumn2"
                                                    rendered="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.designing}">
                                                    <webuijsf:imageHyperlink
                                                        actionExpression="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.hipervinculoAccionFila1_action}"
                                                        binding="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.hipervinculoAccionFila1}"
                                                        disabled="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.loteConCambios}"
                                                        id="hipervinculoAccionFila1"
                                                        imageURL="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.urlImagenEjecutarVinculo}"
                                                        onClick="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.scriptAbrirVentanaAccionFila1}"
                                                        text="Accion1"
                                                        toolTip="#{bundle.FiltroClaseRecursoSeccionPorClaseRecursoSeccion1_hipervinculoAccionFila1_toolTip}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="right" 
                                                    binding="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.tableColumn3}" 
                                                    headerText="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.i18n.toolTipEtiquetaIdentificacionFila}"
                                                    id="tableColumn3">
                                                    <webuijsf:imageHyperlink 
                                                        actionExpression="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.hipervinculoDetallarFila1_action}"
                                                        binding="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.hipervinculoDetallarFila1}" 
                                                        id="hipervinculoDetallarFila1"
                                                        imageURL="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.urlImagenFilaProcesada}"
                                                        textPosition="left" 
                                                        text="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.identificacionFila}" 
                                                        toolTip="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.toolTipImagenFilaProcesada}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.tableColumnIdFiltroClaRecSec1}"
                                                    headerText="id"
                                                    id="tableColumnIdFiltroClaRecSec1"
                                                    sort="id_filtro_cla_rec_sec">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdFiltroClaRecSec1"
                                                    text="#{currentRow.value['id_filtro_cla_rec_sec']}"
                                                    rendered="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.labelIdFiltroClaRecSec1}"
                                                    id="labelIdFiltroClaRecSec1"
                                                    for="campoIdFiltroClaRecSec1"/>
                                                <webuijsf:textField id="campoIdFiltroClaRecSec1"
                                                    binding="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.campoIdFiltroClaRecSec1}"
                                                    converter="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.converterIdFiltroClaRecSec1}"
                                                    readOnly="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['id_filtro_cla_rec_sec']}"
                                                    toolTip="BundleParametros.id_filtro_cla_rec_sec.filtro_cla_rec_sec"
                                                    validatorExpression="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.validatorIdFiltroClaRecSec1.validate}"/>
                                                <webuijsf:staticText id="campoIdFiltroClaRecSec1Texto1"
                                                    binding="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.campoIdFiltroClaRecSec1Texto1}"
                                                    text="#{currentRow.value['id_filtro_cla_rec_sec']}"/>
                                                <webuijsf:message id="messageIdFiltroClaRecSec1"
                                                    for="campoIdFiltroClaRecSec1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.tableColumnIdClaseRecursoParColumna1}"
                                                    headerText="clase recurso par columna"
                                                    id="tableColumnIdClaseRecursoParColumna1"
                                                    sort="id_clase_recurso_par_columna">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdClaseRecursoParColumna1"
                                                    text="#{currentRow.value['id_clase_recurso_par_columna']}"
                                                    rendered="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.labelIdClaseRecursoParColumna1}"
                                                    id="labelIdClaseRecursoParColumna1"
                                                    for="campoIdClaseRecursoParColumna1"/>
                                                <webuijsf:textField id="campoIdClaseRecursoParColumna1"
                                                    binding="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.campoIdClaseRecursoParColumna1}"
                                                    readOnly="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.filaNoProcesada}" required="true"
                                                    text="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.asistente.textoCampoIdClaseRecursoParColumna1}"
                                                    toolTip="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.asistente.toolTipCampoIdClaseRecursoParColumna1}"
                                                    validatorExpression="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.campoIdClaseRecursoParColumna1_validate}"/>
                                                <webuijsf:staticText id="campoIdClaseRecursoParColumna1Texto1"
                                                    binding="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.campoIdClaseRecursoParColumna1Texto1}"/>
                                                <webuijsf:message id="messageIdClaseRecursoParColumna1"
                                                    for="campoIdClaseRecursoParColumna1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdClaseRecursoParColumna3"
                                                    rendered="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.asistente.tableColumnIdClaseRecursoParColumna3Rendered}"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdClaseRecursoParColumna3"
                                                    text="#{currentRow.value['id_clase_recurso_par_columna']}"
                                                    rendered="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.campoIdClaseRecursoParColumna1Boton1}"
                                                    id="campoIdClaseRecursoParColumna1Boton1"
                                                    onClick="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.asistente.scriptCampoIdClaseRecursoParColumna1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.campoIdClaseRecursoParColumna1Boton3}"
                                                    id="campoIdClaseRecursoParColumna1Boton3"
                                                    onClick="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.asistente.scriptCampoIdClaseRecursoParColumna1Boton2}"
                                                    rendered="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.asistente.campoIdClaseRecursoParColumna1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.tableColumnIdClaseRecursoParColumna2}"
                                                    headerText="nombre clase recurso par columna"
                                                    id="tableColumnIdClaseRecursoParColumna2"
                                                    rendered="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.asistente.campoIdClaseRecursoParColumna1Boton2Rendered}"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdClaseRecursoParColumna2"
                                                    text="#{currentRow.value['id_clase_recurso_par_columna']}"
                                                    rendered="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.labelIdClaseRecursoParColumna2}"
                                                    id="labelIdClaseRecursoParColumna2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.campoIdClaseRecursoParColumna1Hiper1}"
                                                    id="campoIdClaseRecursoParColumna1Hiper1"
                                                    onClick="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.asistente.scriptCampoIdClaseRecursoParColumna1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdClaseRecursoParColumna1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.tableColumnNumeroOperadorCom1}"
                                                    headerText="operador com"
                                                    id="tableColumnNumeroOperadorCom1"
                                                    sort="codigo_operador_com_1x3y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroOperadorCom1"
                                                    text="#{currentRow.value['codigo_operador_com_1x3y2']}"
                                                    rendered="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.labelNumeroOperadorCom1}"
                                                    id="labelNumeroOperadorCom1"
                                                    for="listaNumeroOperadorCom1"/>
                                                <webuijsf:dropDown id="listaNumeroOperadorCom1"
                                                    binding="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.listaNumeroOperadorCom1}"
                                                    converter="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.converterNumeroOperadorCom1}"
                                                    disabled="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.filaNoProcesada}" required="true"
                                                    items="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.asistente.opcionesListaNumeroOperadorCom1}"
                                                    selected="#{currentRow.value['numero_operador_com']}"
                                                    toolTip="BundleParametros.numero_operador_com.filtro_cla_rec_sec"/>
                                                <webuijsf:staticText id="listaNumeroOperadorCom1Texto1"
                                                    binding="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.listaNumeroOperadorCom1Texto1}"
                                                    text="#{currentRow.value['codigo_operador_com_1x3y2']}"/>
                                                <webuijsf:message id="messageNumeroOperadorCom1"
                                                    for="listaNumeroOperadorCom1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.tableColumnIdClaseRecursoParValor1}"
                                                    headerText="clase recurso par valor"
                                                    id="tableColumnIdClaseRecursoParValor1"
                                                    sort="id_clase_recurso_par_valor">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdClaseRecursoParValor1"
                                                    text="#{currentRow.value['id_clase_recurso_par_valor']}"
                                                    rendered="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.labelIdClaseRecursoParValor1}"
                                                    id="labelIdClaseRecursoParValor1"
                                                    for="campoIdClaseRecursoParValor1"/>
                                                <webuijsf:textField id="campoIdClaseRecursoParValor1"
                                                    binding="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.campoIdClaseRecursoParValor1}"
                                                    readOnly="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.filaNoProcesada}"
                                                    text="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.asistente.textoCampoIdClaseRecursoParValor1}"
                                                    toolTip="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.asistente.toolTipCampoIdClaseRecursoParValor1}"
                                                    validatorExpression="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.campoIdClaseRecursoParValor1_validate}"/>
                                                <webuijsf:staticText id="campoIdClaseRecursoParValor1Texto1"
                                                    binding="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.campoIdClaseRecursoParValor1Texto1}"/>
                                                <webuijsf:message id="messageIdClaseRecursoParValor1"
                                                    for="campoIdClaseRecursoParValor1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdClaseRecursoParValor3"
                                                    rendered="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.asistente.tableColumnIdClaseRecursoParValor3Rendered}"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdClaseRecursoParValor3"
                                                    text="#{currentRow.value['id_clase_recurso_par_valor']}"
                                                    rendered="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.campoIdClaseRecursoParValor1Boton1}"
                                                    id="campoIdClaseRecursoParValor1Boton1"
                                                    onClick="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.asistente.scriptCampoIdClaseRecursoParValor1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.campoIdClaseRecursoParValor1Boton3}"
                                                    id="campoIdClaseRecursoParValor1Boton3"
                                                    onClick="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.asistente.scriptCampoIdClaseRecursoParValor1Boton2}"
                                                    rendered="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.asistente.campoIdClaseRecursoParValor1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.tableColumnIdClaseRecursoParValor2}"
                                                    headerText="nombre clase recurso par valor"
                                                    id="tableColumnIdClaseRecursoParValor2"
                                                    rendered="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.asistente.campoIdClaseRecursoParValor1Boton2Rendered}"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdClaseRecursoParValor2"
                                                    text="#{currentRow.value['id_clase_recurso_par_valor']}"
                                                    rendered="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.labelIdClaseRecursoParValor2}"
                                                    id="labelIdClaseRecursoParValor2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.campoIdClaseRecursoParValor1Hiper1}"
                                                    id="campoIdClaseRecursoParValor1Hiper1"
                                                    onClick="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.asistente.scriptCampoIdClaseRecursoParValor1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdClaseRecursoParValor1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.tableColumnValor1}"
                                                    headerText="valor"
                                                    id="tableColumnValor1"
                                                    sort="valor">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextValor1"
                                                    text="#{currentRow.value['valor']}"
                                                    rendered="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.labelValor1}"
                                                    id="labelValor1"
                                                    for="campoValor1"/>
                                                <webuijsf:textArea id="campoValor1"
                                                    binding="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.campoValor1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['valor']}"
                                                    toolTip="BundleParametros.valor.filtro_cla_rec_sec"
                                                    validatorExpression="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.validatorValor1.validate}"/>
                                                <webuijsf:staticText id="campoValor1Texto1"
                                                    binding="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.campoValor1Texto1}"
                                                    text="#{currentRow.value['valor']}"/>
                                                <webuijsf:message id="messageValor1"
                                                    for="campoValor1"/>
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
                                                        binding="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.etiquetaTextoFilasPorPagina1}" 
                                                        for="textoFilasPorPagina1"
                                                        id="etiquetaTextoFilasPorPagina1" 
                                                        text="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.i18n.textoEtiquetaTextoFilasPorPagina}"/>
                                                </h:panelGrid>
                                                <h:panelGrid 
                                                    columns="3" 
                                                    id="gridPanel107">
                                                    <webuijsf:textField 
                                                        binding="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.textoFilasPorPagina1}" 
                                                        columns="2"
                                                        converter="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.textoFilasPorPagina1Converter1}"
                                                        disabled="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.paginacionInhabilitada}" 
                                                        id="textoFilasPorPagina1" maxLength="2"
                                                        text="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.filasPorPagina}" 
                                                        validatorExpression="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.textoFilasPorPagina1Validator1.validate}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.botonRepaginar1_action}"
                                                        binding="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.botonRepaginar1}" 
                                                        id="botonRepaginar1"
                                                        imageURL="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.urlImagenRepaginar}" 
                                                        onClick="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.scriptRepaginar}"
                                                        text="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.i18n.textoBotonRepaginar}"
                                                        toolTip="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.i18n.toolTipBotonRepaginar}"/>
                                                    <webuijsf:message 
                                                        for="textoFilasPorPagina1" 
                                                        id="messageFilasPorPagina1"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="13"
                                                id="gridPanel108">
                                                <webuijsf:button
                                                    actionExpression="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.botonAgregar1_action}"
                                                    binding="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.botonAgregar1}"
                                                    disabled="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.scriptAgregar}"
                                                    rendered="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.listaFuncionEdicion1}"
                                                    converter="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.converterListaFuncionEdicion1}"
                                                    disabled="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.botonEditar1_action}"
                                                    binding="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.botonEditar1}"
                                                    disabled="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.scriptEditar}"
                                                    rendered="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.botonEliminar1_action}"
                                                    binding="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.botonEliminar1}"
                                                    disabled="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.scriptEliminar}"
                                                    rendered="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.botonAplicar1_action}"
                                                    binding="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.scriptAplicar}"
                                                    rendered="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.botonDeshacer1_action}"
                                                    binding="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.scriptDeshacer}"
                                                    rendered="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.botonConfirmar1_action}"
                                                    binding="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.scriptConfirmar}"
                                                    rendered="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.botonDescartar1_action}"
                                                    binding="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.scriptDescartar}"
                                                    rendered="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.listaFuncionAccion1}"
                                                    converter="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.botonProcesar1_action}"
                                                    binding="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.scriptProcesar}"
                                                    rendered="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.botonRefrescar1_action}"
                                                    binding="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.botonRefrescar1}"
                                                    disabled="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.scriptRefrescar}"
                                                    rendered="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.botonReconsultar1_action}"
                                                    binding="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.botonReconsultar1}"
                                                    disabled="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.scriptReconsultar}"
                                                    rendered="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.botonRetornar1_action}"
                                                    binding="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.botonRetornar1}"
                                                    disabled="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel109"
                                                rendered="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.imageHyperlink1_action}"
                                                    binding="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.imageHyperlink1}"
                                                    disabled="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{FiltroClaseRecursoSeccionPorClaseRecursoSeccion1.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.FiltroClaseRecursoSeccionPorClaseRecursoSeccion1_imageHyperlink1_toolTip}"/>
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
