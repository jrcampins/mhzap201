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
                    focus="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.preserveFocus}"
                    preserveScroll="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | checkbox1 campoIdFiltroClaRecVin1 campoIdClaseRecursoParColumna1 listaNumeroOperadorCom1 campoIdClaseRecursoParValor1 campoValor1 textoFilasPorPagina1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | textoFilasPorPagina1 | botonRepaginar1 , virtualForm3 | checkbox1 listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonEscogerFila1 botonDetallarFila1 botonProcesarFila1 botonRetornarFila1 botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.breadcrumbs1}" 
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
                                                    rendered="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.mensajeDisponible}"
                                                    text="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.mensaje}"
                                                    url="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:table
                                            binding="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.table1}"
                                            clearSortButton="true" 
                                            deselectMultipleButton="true" 
                                            id="table1"
                                            paginateButton="false"
                                            paginationControls="true" 
                                            selectMultipleButton="true" 
                                            sortPanelToggleButton="true"
                                            width="960">
                                            <webuijsf:tableRowGroup 
                                                binding="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.tableRowGroup1}" 
                                                id="tableRowGroup1" 
                                                rows="1"
                                                selected="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.filaEscogida}" 
                                                sourceData="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.filtroClaRecVinDataProvider}" 
                                                sourceVar="currentRow">
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    id="tableRowGroup1SelectionColumn"
                                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);" 
                                                    selectId="checkbox1">
                                                    <webuijsf:checkbox 
                                                        binding="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.checkbox1}" 
                                                        id="checkbox1"
                                                        onClick="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.scriptElegir}" 
                                                        selected="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.filaElegida}" 
                                                        toolTip="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.i18n.toolTipCheckboxSeleccionMultiple}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    binding="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.tableColumn1}" 
                                                    id="tableColumn1">
                                                    <webuijsf:button 
                                                        actionExpression="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.botonEscogerFila1_action}"
                                                        binding="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.botonEscogerFila1}"
                                                        disabled="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonEscogerFila1"
                                                        imageURL="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.urlImagenEscoger}" 
                                                        onClick="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.scriptEscoger}"
                                                        text="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.i18n.textoBotonEscogerFila}"
                                                        toolTip="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.i18n.toolTipBotonEscogerFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.botonDetallarFila1_action}"
                                                        binding="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.botonDetallarFila1}"
                                                        disabled="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonDetallarFila1"
                                                        imageURL="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.urlImagenDetallar}" 
                                                        onClick="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.scriptAbrirVentanaVerDetalle}"
                                                        rendered="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.detalleDisponible}" 
                                                        text="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.i18n.textoBotonDetallarFila}"
                                                        toolTip="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.i18n.toolTipBotonDetallarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.botonProcesarFila1_action}"
                                                        binding="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.botonProcesarFila1}"
                                                        disabled="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonProcesarFila1"
                                                        imageURL="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.urlImagenProcesar}" 
                                                        onClick="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.asistente.comandoDisponible}" 
                                                        text="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.i18n.toolTipBotonProcesarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.botonRetornarFila1_action}"
                                                        binding="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.botonRetornarFila1}" 
                                                        disabled="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.funcionReturnInhabilitada}"
                                                        id="botonRetornarFila1"
                                                        imageURL="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.urlImagenRetornar}"
                                                        onClick="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.scriptRetornarRecursoActual}"
                                                        rendered="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.funcionReturnVisible}" 
                                                        text="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.i18n.textoBotonRetornarFila}"
                                                        toolTip="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.i18n.toolTipBotonRetornarFila}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.tableColumn2}"
                                                    id="tableColumn2"
                                                    rendered="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.designing}">
                                                    <webuijsf:imageHyperlink
                                                        actionExpression="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.hipervinculoAccionFila1_action}"
                                                        binding="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.hipervinculoAccionFila1}"
                                                        disabled="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.loteConCambios}"
                                                        id="hipervinculoAccionFila1"
                                                        imageURL="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.urlImagenEjecutarVinculo}"
                                                        onClick="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.scriptAbrirVentanaAccionFila1}"
                                                        text="Accion1"
                                                        toolTip="#{bundle.FiltroClaseRecursoVinculoPorClaseRecursoParametro1_hipervinculoAccionFila1_toolTip}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="right" 
                                                    binding="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.tableColumn3}" 
                                                    headerText="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.i18n.toolTipEtiquetaIdentificacionFila}"
                                                    id="tableColumn3">
                                                    <webuijsf:imageHyperlink 
                                                        actionExpression="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.hipervinculoDetallarFila1_action}"
                                                        binding="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.hipervinculoDetallarFila1}" 
                                                        id="hipervinculoDetallarFila1"
                                                        imageURL="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.urlImagenFilaProcesada}"
                                                        textPosition="left" 
                                                        text="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.identificacionFila}" 
                                                        toolTip="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.toolTipImagenFilaProcesada}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.tableColumnIdFiltroClaRecVin1}"
                                                    toolTip="BundleParametros.id_filtro_cla_rec_vin.filtro_cla_rec_vin"
                                                    headerText="identificaci&#243;n"
                                                    id="tableColumnIdFiltroClaRecVin1"
                                                    sort="id_filtro_cla_rec_vin">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdFiltroClaRecVin1"
                                                    text="#{currentRow.value['id_filtro_cla_rec_vin']}"
                                                    rendered="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.labelIdFiltroClaRecVin1}"
                                                    id="labelIdFiltroClaRecVin1"
                                                    for="campoIdFiltroClaRecVin1"/>
                                                <webuijsf:textField id="campoIdFiltroClaRecVin1"
                                                    binding="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.campoIdFiltroClaRecVin1}"
                                                    converter="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.converterIdFiltroClaRecVin1}"
                                                    readOnly="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['id_filtro_cla_rec_vin']}"
                                                    toolTip="BundleParametros.id_filtro_cla_rec_vin.filtro_cla_rec_vin"
                                                    validatorExpression="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.validatorIdFiltroClaRecVin1.validate}"/>
                                                <webuijsf:staticText id="campoIdFiltroClaRecVin1Texto1"
                                                    binding="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.campoIdFiltroClaRecVin1Texto1}"
                                                    text="#{currentRow.value['id_filtro_cla_rec_vin']}"/>
                                                <webuijsf:message id="messageIdFiltroClaRecVin1"
                                                    for="campoIdFiltroClaRecVin1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.tableColumnIdClaseRecursoParColumna1}"
                                                    toolTip="BundleParametros.id_clase_recurso_par_columna.filtro_cla_rec_vin"
                                                    headerText="clase recurso par columna"
                                                    id="tableColumnIdClaseRecursoParColumna1"
                                                    sort="id_clase_recurso_par_columna">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdClaseRecursoParColumna1"
                                                    text="#{currentRow.value['id_clase_recurso_par_columna']}"
                                                    rendered="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.labelIdClaseRecursoParColumna1}"
                                                    id="labelIdClaseRecursoParColumna1"
                                                    for="campoIdClaseRecursoParColumna1"/>
                                                <webuijsf:textField id="campoIdClaseRecursoParColumna1"
                                                    binding="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.campoIdClaseRecursoParColumna1}"
                                                    readOnly="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.filaNoProcesada}" required="true"
                                                    text="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.asistente.textoCampoIdClaseRecursoParColumna1}"
                                                    toolTip="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.asistente.toolTipCampoIdClaseRecursoParColumna1}"
                                                    validatorExpression="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.campoIdClaseRecursoParColumna1_validate}"/>
                                                <webuijsf:staticText id="campoIdClaseRecursoParColumna1Texto1"
                                                    binding="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.campoIdClaseRecursoParColumna1Texto1}"/>
                                                <webuijsf:message id="messageIdClaseRecursoParColumna1"
                                                    for="campoIdClaseRecursoParColumna1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdClaseRecursoParColumna3"
                                                    rendered="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.asistente.tableColumnIdClaseRecursoParColumna3Rendered}"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdClaseRecursoParColumna3"
                                                    text="#{currentRow.value['id_clase_recurso_par_columna']}"
                                                    rendered="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.campoIdClaseRecursoParColumna1Boton1}"
                                                    id="campoIdClaseRecursoParColumna1Boton1"
                                                    onClick="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.asistente.scriptCampoIdClaseRecursoParColumna1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.campoIdClaseRecursoParColumna1Boton3}"
                                                    id="campoIdClaseRecursoParColumna1Boton3"
                                                    onClick="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.asistente.scriptCampoIdClaseRecursoParColumna1Boton2}"
                                                    rendered="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.asistente.campoIdClaseRecursoParColumna1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.tableColumnIdClaseRecursoParColumna2}"
                                                    headerText="nombre clase recurso par columna"
                                                    id="tableColumnIdClaseRecursoParColumna2"
                                                    rendered="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.asistente.campoIdClaseRecursoParColumna1Boton2Rendered}"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdClaseRecursoParColumna2"
                                                    text="#{currentRow.value['id_clase_recurso_par_columna']}"
                                                    rendered="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.labelIdClaseRecursoParColumna2}"
                                                    id="labelIdClaseRecursoParColumna2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.campoIdClaseRecursoParColumna1Hiper1}"
                                                    id="campoIdClaseRecursoParColumna1Hiper1"
                                                    onClick="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.asistente.scriptCampoIdClaseRecursoParColumna1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdClaseRecursoParColumna1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.tableColumnNumeroOperadorCom1}"
                                                    toolTip="BundleParametros.numero_operador_com.filtro_cla_rec_vin"
                                                    headerText="operador com"
                                                    id="tableColumnNumeroOperadorCom1"
                                                    sort="codigo_operador_com_1x3y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroOperadorCom1"
                                                    text="#{currentRow.value['codigo_operador_com_1x3y2']}"
                                                    rendered="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.labelNumeroOperadorCom1}"
                                                    id="labelNumeroOperadorCom1"
                                                    for="listaNumeroOperadorCom1"/>
                                                <webuijsf:dropDown id="listaNumeroOperadorCom1"
                                                    binding="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.listaNumeroOperadorCom1}"
                                                    converter="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.converterNumeroOperadorCom1}"
                                                    disabled="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.filaNoProcesada}" required="true"
                                                    items="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.asistente.opcionesListaNumeroOperadorCom1}"
                                                    selected="#{currentRow.value['numero_operador_com']}"
                                                    toolTip="BundleParametros.numero_operador_com.filtro_cla_rec_vin"/>
                                                <webuijsf:staticText id="listaNumeroOperadorCom1Texto1"
                                                    binding="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.listaNumeroOperadorCom1Texto1}"
                                                    text="#{currentRow.value['codigo_operador_com_1x3y2']}"/>
                                                <webuijsf:message id="messageNumeroOperadorCom1"
                                                    for="listaNumeroOperadorCom1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.tableColumnIdClaseRecursoParValor1}"
                                                    toolTip="BundleParametros.id_clase_recurso_par_valor.filtro_cla_rec_vin"
                                                    headerText="clase recurso par valor"
                                                    id="tableColumnIdClaseRecursoParValor1"
                                                    sort="id_clase_recurso_par_valor">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdClaseRecursoParValor1"
                                                    text="#{currentRow.value['id_clase_recurso_par_valor']}"
                                                    rendered="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.labelIdClaseRecursoParValor1}"
                                                    id="labelIdClaseRecursoParValor1"
                                                    for="campoIdClaseRecursoParValor1"/>
                                                <webuijsf:textField id="campoIdClaseRecursoParValor1"
                                                    binding="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.campoIdClaseRecursoParValor1}"
                                                    readOnly="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.filaNoProcesada}"
                                                    text="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.asistente.textoCampoIdClaseRecursoParValor1}"
                                                    toolTip="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.asistente.toolTipCampoIdClaseRecursoParValor1}"
                                                    validatorExpression="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.campoIdClaseRecursoParValor1_validate}"/>
                                                <webuijsf:staticText id="campoIdClaseRecursoParValor1Texto1"
                                                    binding="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.campoIdClaseRecursoParValor1Texto1}"/>
                                                <webuijsf:message id="messageIdClaseRecursoParValor1"
                                                    for="campoIdClaseRecursoParValor1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdClaseRecursoParValor3"
                                                    rendered="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.asistente.tableColumnIdClaseRecursoParValor3Rendered}"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdClaseRecursoParValor3"
                                                    text="#{currentRow.value['id_clase_recurso_par_valor']}"
                                                    rendered="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.campoIdClaseRecursoParValor1Boton1}"
                                                    id="campoIdClaseRecursoParValor1Boton1"
                                                    onClick="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.asistente.scriptCampoIdClaseRecursoParValor1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.campoIdClaseRecursoParValor1Boton3}"
                                                    id="campoIdClaseRecursoParValor1Boton3"
                                                    onClick="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.asistente.scriptCampoIdClaseRecursoParValor1Boton2}"
                                                    rendered="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.asistente.campoIdClaseRecursoParValor1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.tableColumnIdClaseRecursoParValor2}"
                                                    headerText="nombre clase recurso par valor"
                                                    id="tableColumnIdClaseRecursoParValor2"
                                                    rendered="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.asistente.campoIdClaseRecursoParValor1Boton2Rendered}"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdClaseRecursoParValor2"
                                                    text="#{currentRow.value['id_clase_recurso_par_valor']}"
                                                    rendered="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.labelIdClaseRecursoParValor2}"
                                                    id="labelIdClaseRecursoParValor2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.campoIdClaseRecursoParValor1Hiper1}"
                                                    id="campoIdClaseRecursoParValor1Hiper1"
                                                    onClick="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.asistente.scriptCampoIdClaseRecursoParValor1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdClaseRecursoParValor1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.tableColumnValor1}"
                                                    toolTip="BundleParametros.valor.filtro_cla_rec_vin"
                                                    headerText="valor"
                                                    id="tableColumnValor1"
                                                    sort="valor">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextValor1"
                                                    text="#{currentRow.value['valor']}"
                                                    rendered="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.labelValor1}"
                                                    id="labelValor1"
                                                    for="campoValor1"/>
                                                <webuijsf:textArea id="campoValor1"
                                                    binding="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.campoValor1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['valor']}"
                                                    toolTip="BundleParametros.valor.filtro_cla_rec_vin"
                                                    validatorExpression="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.validatorValor1.validate}"/>
                                                <webuijsf:staticText id="campoValor1Texto1"
                                                    binding="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.campoValor1Texto1}"
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
                                                        binding="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.etiquetaTextoFilasPorPagina1}" 
                                                        for="textoFilasPorPagina1"
                                                        id="etiquetaTextoFilasPorPagina1" 
                                                        text="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.i18n.textoEtiquetaTextoFilasPorPagina}"/>
                                                </h:panelGrid>
                                                <h:panelGrid 
                                                    columns="3" 
                                                    id="gridPanel107">
                                                    <webuijsf:textField 
                                                        binding="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.textoFilasPorPagina1}" 
                                                        columns="2"
                                                        converter="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.textoFilasPorPagina1Converter1}"
                                                        disabled="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.paginacionInhabilitada}" 
                                                        id="textoFilasPorPagina1" maxLength="2"
                                                        text="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.filasPorPagina}" 
                                                        validatorExpression="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.textoFilasPorPagina1Validator1.validate}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.botonRepaginar1_action}"
                                                        binding="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.botonRepaginar1}" 
                                                        id="botonRepaginar1"
                                                        imageURL="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.urlImagenRepaginar}" 
                                                        onClick="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.scriptRepaginar}"
                                                        text="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.i18n.textoBotonRepaginar}"
                                                        toolTip="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.i18n.toolTipBotonRepaginar}"/>
                                                    <webuijsf:message 
                                                        for="textoFilasPorPagina1" 
                                                        id="messageFilasPorPagina1"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="13"
                                                id="gridPanel108">
                                                <webuijsf:button
                                                    actionExpression="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.botonAgregar1_action}"
                                                    binding="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.botonAgregar1}"
                                                    disabled="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.scriptAgregar}"
                                                    rendered="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.listaFuncionEdicion1}"
                                                    converter="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.converterListaFuncionEdicion1}"
                                                    disabled="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.botonEditar1_action}"
                                                    binding="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.botonEditar1}"
                                                    disabled="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.scriptEditar}"
                                                    rendered="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.botonEliminar1_action}"
                                                    binding="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.botonEliminar1}"
                                                    disabled="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.scriptEliminar}"
                                                    rendered="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.botonAplicar1_action}"
                                                    binding="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.scriptAplicar}"
                                                    rendered="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.botonDeshacer1_action}"
                                                    binding="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.scriptDeshacer}"
                                                    rendered="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.botonConfirmar1_action}"
                                                    binding="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.scriptConfirmar}"
                                                    rendered="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.botonDescartar1_action}"
                                                    binding="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.scriptDescartar}"
                                                    rendered="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.listaFuncionAccion1}"
                                                    converter="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.botonProcesar1_action}"
                                                    binding="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.scriptProcesar}"
                                                    rendered="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.botonRefrescar1_action}"
                                                    binding="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.botonRefrescar1}"
                                                    disabled="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.scriptRefrescar}"
                                                    rendered="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.botonReconsultar1_action}"
                                                    binding="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.botonReconsultar1}"
                                                    disabled="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.scriptReconsultar}"
                                                    rendered="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.botonRetornar1_action}"
                                                    binding="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.botonRetornar1}"
                                                    disabled="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel109"
                                                rendered="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.imageHyperlink1_action}"
                                                    binding="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.imageHyperlink1}"
                                                    disabled="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{FiltroClaseRecursoVinculoPorClaseRecursoParametro1.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.FiltroClaseRecursoVinculoPorClaseRecursoParametro1_imageHyperlink1_toolTip}"/>
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
