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
                    focus="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.preserveFocus}"
                    preserveScroll="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | checkbox1 campoIdFiltroClaRecPar1 campoIdClaseRecursoParColumna1 listaNumeroOperadorCom1 campoIdClaseRecursoParValor1 campoValor1 textoFilasPorPagina1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | textoFilasPorPagina1 | botonRepaginar1 , virtualForm3 | checkbox1 listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonEscogerFila1 botonDetallarFila1 botonProcesarFila1 botonRetornarFila1 botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.breadcrumbs1}" 
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
                                                    rendered="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.mensajeDisponible}"
                                                    text="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.mensaje}"
                                                    url="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:table
                                            binding="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.table1}"
                                            clearSortButton="true" 
                                            deselectMultipleButton="true" 
                                            id="table1"
                                            paginateButton="false"
                                            paginationControls="true" 
                                            selectMultipleButton="true" 
                                            sortPanelToggleButton="true"
                                            width="960">
                                            <webuijsf:tableRowGroup 
                                                binding="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.tableRowGroup1}" 
                                                id="tableRowGroup1" 
                                                rows="1"
                                                selected="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.filaEscogida}" 
                                                sourceData="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.filtroClaRecParDataProvider}" 
                                                sourceVar="currentRow">
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    id="tableRowGroup1SelectionColumn"
                                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);" 
                                                    selectId="checkbox1">
                                                    <webuijsf:checkbox 
                                                        binding="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.checkbox1}" 
                                                        id="checkbox1"
                                                        onClick="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.scriptElegir}" 
                                                        selected="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.filaElegida}" 
                                                        toolTip="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.i18n.toolTipCheckboxSeleccionMultiple}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    binding="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.tableColumn1}" 
                                                    id="tableColumn1">
                                                    <webuijsf:button 
                                                        actionExpression="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.botonEscogerFila1_action}"
                                                        binding="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.botonEscogerFila1}"
                                                        disabled="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonEscogerFila1"
                                                        imageURL="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.urlImagenEscoger}" 
                                                        onClick="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.scriptEscoger}"
                                                        text="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.i18n.textoBotonEscogerFila}"
                                                        toolTip="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.i18n.toolTipBotonEscogerFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.botonDetallarFila1_action}"
                                                        binding="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.botonDetallarFila1}"
                                                        disabled="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonDetallarFila1"
                                                        imageURL="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.urlImagenDetallar}" 
                                                        onClick="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.scriptAbrirVentanaVerDetalle}"
                                                        rendered="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.detalleDisponible}" 
                                                        text="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.i18n.textoBotonDetallarFila}"
                                                        toolTip="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.i18n.toolTipBotonDetallarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.botonProcesarFila1_action}"
                                                        binding="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.botonProcesarFila1}"
                                                        disabled="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonProcesarFila1"
                                                        imageURL="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.urlImagenProcesar}" 
                                                        onClick="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.asistente.comandoDisponible}" 
                                                        text="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.i18n.toolTipBotonProcesarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.botonRetornarFila1_action}"
                                                        binding="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.botonRetornarFila1}" 
                                                        disabled="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.funcionReturnInhabilitada}"
                                                        id="botonRetornarFila1"
                                                        imageURL="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.urlImagenRetornar}"
                                                        onClick="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.scriptRetornarRecursoActual}"
                                                        rendered="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.funcionReturnVisible}" 
                                                        text="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.i18n.textoBotonRetornarFila}"
                                                        toolTip="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.i18n.toolTipBotonRetornarFila}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.tableColumn2}"
                                                    id="tableColumn2"
                                                    rendered="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.designing}">
                                                    <webuijsf:imageHyperlink
                                                        actionExpression="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.hipervinculoAccionFila1_action}"
                                                        binding="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.hipervinculoAccionFila1}"
                                                        disabled="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.loteConCambios}"
                                                        id="hipervinculoAccionFila1"
                                                        imageURL="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.urlImagenEjecutarVinculo}"
                                                        onClick="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.scriptAbrirVentanaAccionFila1}"
                                                        text="Accion1"
                                                        toolTip="#{bundle.FiltroClaseRecursoParametroPorClaseRecursoParametro1_hipervinculoAccionFila1_toolTip}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="right" 
                                                    binding="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.tableColumn3}" 
                                                    headerText="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.i18n.toolTipEtiquetaIdentificacionFila}"
                                                    id="tableColumn3">
                                                    <webuijsf:imageHyperlink 
                                                        actionExpression="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.hipervinculoDetallarFila1_action}"
                                                        binding="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.hipervinculoDetallarFila1}" 
                                                        id="hipervinculoDetallarFila1"
                                                        imageURL="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.urlImagenFilaProcesada}"
                                                        textPosition="left" 
                                                        text="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.identificacionFila}" 
                                                        toolTip="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.toolTipImagenFilaProcesada}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.tableColumnIdFiltroClaRecPar1}"
                                                    headerText="id"
                                                    id="tableColumnIdFiltroClaRecPar1"
                                                    sort="id_filtro_cla_rec_par">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdFiltroClaRecPar1"
                                                    text="#{currentRow.value['id_filtro_cla_rec_par']}"
                                                    rendered="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.labelIdFiltroClaRecPar1}"
                                                    id="labelIdFiltroClaRecPar1"
                                                    for="campoIdFiltroClaRecPar1"/>
                                                <webuijsf:textField id="campoIdFiltroClaRecPar1"
                                                    binding="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.campoIdFiltroClaRecPar1}"
                                                    converter="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.converterIdFiltroClaRecPar1}"
                                                    readOnly="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['id_filtro_cla_rec_par']}"
                                                    toolTip="BundleParametros.id_filtro_cla_rec_par.filtro_cla_rec_par"
                                                    validatorExpression="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.validatorIdFiltroClaRecPar1.validate}"/>
                                                <webuijsf:staticText id="campoIdFiltroClaRecPar1Texto1"
                                                    binding="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.campoIdFiltroClaRecPar1Texto1}"
                                                    text="#{currentRow.value['id_filtro_cla_rec_par']}"/>
                                                <webuijsf:message id="messageIdFiltroClaRecPar1"
                                                    for="campoIdFiltroClaRecPar1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.tableColumnIdClaseRecursoParColumna1}"
                                                    headerText="clase recurso par columna"
                                                    id="tableColumnIdClaseRecursoParColumna1"
                                                    sort="id_clase_recurso_par_columna">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdClaseRecursoParColumna1"
                                                    text="#{currentRow.value['id_clase_recurso_par_columna']}"
                                                    rendered="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.labelIdClaseRecursoParColumna1}"
                                                    id="labelIdClaseRecursoParColumna1"
                                                    for="campoIdClaseRecursoParColumna1"/>
                                                <webuijsf:textField id="campoIdClaseRecursoParColumna1"
                                                    binding="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.campoIdClaseRecursoParColumna1}"
                                                    readOnly="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.filaNoProcesada}" required="true"
                                                    text="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.asistente.textoCampoIdClaseRecursoParColumna1}"
                                                    toolTip="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.asistente.toolTipCampoIdClaseRecursoParColumna1}"
                                                    validatorExpression="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.campoIdClaseRecursoParColumna1_validate}"/>
                                                <webuijsf:staticText id="campoIdClaseRecursoParColumna1Texto1"
                                                    binding="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.campoIdClaseRecursoParColumna1Texto1}"/>
                                                <webuijsf:message id="messageIdClaseRecursoParColumna1"
                                                    for="campoIdClaseRecursoParColumna1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdClaseRecursoParColumna3"
                                                    rendered="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.asistente.tableColumnIdClaseRecursoParColumna3Rendered}"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdClaseRecursoParColumna3"
                                                    text="#{currentRow.value['id_clase_recurso_par_columna']}"
                                                    rendered="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.campoIdClaseRecursoParColumna1Boton1}"
                                                    id="campoIdClaseRecursoParColumna1Boton1"
                                                    onClick="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.asistente.scriptCampoIdClaseRecursoParColumna1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.campoIdClaseRecursoParColumna1Boton3}"
                                                    id="campoIdClaseRecursoParColumna1Boton3"
                                                    onClick="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.asistente.scriptCampoIdClaseRecursoParColumna1Boton2}"
                                                    rendered="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.asistente.campoIdClaseRecursoParColumna1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.tableColumnIdClaseRecursoParColumna2}"
                                                    headerText="nombre clase recurso par columna"
                                                    id="tableColumnIdClaseRecursoParColumna2"
                                                    rendered="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.asistente.campoIdClaseRecursoParColumna1Boton2Rendered}"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdClaseRecursoParColumna2"
                                                    text="#{currentRow.value['id_clase_recurso_par_columna']}"
                                                    rendered="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.labelIdClaseRecursoParColumna2}"
                                                    id="labelIdClaseRecursoParColumna2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.campoIdClaseRecursoParColumna1Hiper1}"
                                                    id="campoIdClaseRecursoParColumna1Hiper1"
                                                    onClick="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.asistente.scriptCampoIdClaseRecursoParColumna1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdClaseRecursoParColumna1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.tableColumnNumeroOperadorCom1}"
                                                    headerText="operador com"
                                                    id="tableColumnNumeroOperadorCom1"
                                                    sort="codigo_operador_com_1x3y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroOperadorCom1"
                                                    text="#{currentRow.value['codigo_operador_com_1x3y2']}"
                                                    rendered="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.labelNumeroOperadorCom1}"
                                                    id="labelNumeroOperadorCom1"
                                                    for="listaNumeroOperadorCom1"/>
                                                <webuijsf:dropDown id="listaNumeroOperadorCom1"
                                                    binding="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.listaNumeroOperadorCom1}"
                                                    converter="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.converterNumeroOperadorCom1}"
                                                    disabled="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.filaNoProcesada}" required="true"
                                                    items="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.asistente.opcionesListaNumeroOperadorCom1}"
                                                    selected="#{currentRow.value['numero_operador_com']}"
                                                    toolTip="BundleParametros.numero_operador_com.filtro_cla_rec_par"/>
                                                <webuijsf:staticText id="listaNumeroOperadorCom1Texto1"
                                                    binding="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.listaNumeroOperadorCom1Texto1}"
                                                    text="#{currentRow.value['codigo_operador_com_1x3y2']}"/>
                                                <webuijsf:message id="messageNumeroOperadorCom1"
                                                    for="listaNumeroOperadorCom1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.tableColumnIdClaseRecursoParValor1}"
                                                    headerText="clase recurso par valor"
                                                    id="tableColumnIdClaseRecursoParValor1"
                                                    sort="id_clase_recurso_par_valor">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdClaseRecursoParValor1"
                                                    text="#{currentRow.value['id_clase_recurso_par_valor']}"
                                                    rendered="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.labelIdClaseRecursoParValor1}"
                                                    id="labelIdClaseRecursoParValor1"
                                                    for="campoIdClaseRecursoParValor1"/>
                                                <webuijsf:textField id="campoIdClaseRecursoParValor1"
                                                    binding="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.campoIdClaseRecursoParValor1}"
                                                    readOnly="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.filaNoProcesada}"
                                                    text="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.asistente.textoCampoIdClaseRecursoParValor1}"
                                                    toolTip="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.asistente.toolTipCampoIdClaseRecursoParValor1}"
                                                    validatorExpression="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.campoIdClaseRecursoParValor1_validate}"/>
                                                <webuijsf:staticText id="campoIdClaseRecursoParValor1Texto1"
                                                    binding="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.campoIdClaseRecursoParValor1Texto1}"/>
                                                <webuijsf:message id="messageIdClaseRecursoParValor1"
                                                    for="campoIdClaseRecursoParValor1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdClaseRecursoParValor3"
                                                    rendered="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.asistente.tableColumnIdClaseRecursoParValor3Rendered}"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdClaseRecursoParValor3"
                                                    text="#{currentRow.value['id_clase_recurso_par_valor']}"
                                                    rendered="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.campoIdClaseRecursoParValor1Boton1}"
                                                    id="campoIdClaseRecursoParValor1Boton1"
                                                    onClick="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.asistente.scriptCampoIdClaseRecursoParValor1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.campoIdClaseRecursoParValor1Boton3}"
                                                    id="campoIdClaseRecursoParValor1Boton3"
                                                    onClick="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.asistente.scriptCampoIdClaseRecursoParValor1Boton2}"
                                                    rendered="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.asistente.campoIdClaseRecursoParValor1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.tableColumnIdClaseRecursoParValor2}"
                                                    headerText="nombre clase recurso par valor"
                                                    id="tableColumnIdClaseRecursoParValor2"
                                                    rendered="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.asistente.campoIdClaseRecursoParValor1Boton2Rendered}"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdClaseRecursoParValor2"
                                                    text="#{currentRow.value['id_clase_recurso_par_valor']}"
                                                    rendered="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.labelIdClaseRecursoParValor2}"
                                                    id="labelIdClaseRecursoParValor2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.campoIdClaseRecursoParValor1Hiper1}"
                                                    id="campoIdClaseRecursoParValor1Hiper1"
                                                    onClick="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.asistente.scriptCampoIdClaseRecursoParValor1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdClaseRecursoParValor1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.tableColumnValor1}"
                                                    headerText="valor"
                                                    id="tableColumnValor1"
                                                    sort="valor">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextValor1"
                                                    text="#{currentRow.value['valor']}"
                                                    rendered="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.labelValor1}"
                                                    id="labelValor1"
                                                    for="campoValor1"/>
                                                <webuijsf:textArea id="campoValor1"
                                                    binding="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.campoValor1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['valor']}"
                                                    toolTip="BundleParametros.valor.filtro_cla_rec_par"
                                                    validatorExpression="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.validatorValor1.validate}"/>
                                                <webuijsf:staticText id="campoValor1Texto1"
                                                    binding="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.campoValor1Texto1}"
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
                                                        binding="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.etiquetaTextoFilasPorPagina1}" 
                                                        for="textoFilasPorPagina1"
                                                        id="etiquetaTextoFilasPorPagina1" 
                                                        text="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.i18n.textoEtiquetaTextoFilasPorPagina}"/>
                                                </h:panelGrid>
                                                <h:panelGrid 
                                                    columns="3" 
                                                    id="gridPanel107">
                                                    <webuijsf:textField 
                                                        binding="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.textoFilasPorPagina1}" 
                                                        columns="2"
                                                        converter="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.textoFilasPorPagina1Converter1}"
                                                        disabled="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.paginacionInhabilitada}" 
                                                        id="textoFilasPorPagina1" maxLength="2"
                                                        text="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.filasPorPagina}" 
                                                        validatorExpression="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.textoFilasPorPagina1Validator1.validate}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.botonRepaginar1_action}"
                                                        binding="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.botonRepaginar1}" 
                                                        id="botonRepaginar1"
                                                        imageURL="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.urlImagenRepaginar}" 
                                                        onClick="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.scriptRepaginar}"
                                                        text="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.i18n.textoBotonRepaginar}"
                                                        toolTip="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.i18n.toolTipBotonRepaginar}"/>
                                                    <webuijsf:message 
                                                        for="textoFilasPorPagina1" 
                                                        id="messageFilasPorPagina1"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="13"
                                                id="gridPanel108">
                                                <webuijsf:button
                                                    actionExpression="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.botonAgregar1_action}"
                                                    binding="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.botonAgregar1}"
                                                    disabled="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.scriptAgregar}"
                                                    rendered="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.listaFuncionEdicion1}"
                                                    converter="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.converterListaFuncionEdicion1}"
                                                    disabled="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.botonEditar1_action}"
                                                    binding="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.botonEditar1}"
                                                    disabled="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.scriptEditar}"
                                                    rendered="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.botonEliminar1_action}"
                                                    binding="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.botonEliminar1}"
                                                    disabled="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.scriptEliminar}"
                                                    rendered="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.botonAplicar1_action}"
                                                    binding="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.scriptAplicar}"
                                                    rendered="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.botonDeshacer1_action}"
                                                    binding="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.scriptDeshacer}"
                                                    rendered="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.botonConfirmar1_action}"
                                                    binding="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.scriptConfirmar}"
                                                    rendered="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.botonDescartar1_action}"
                                                    binding="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.scriptDescartar}"
                                                    rendered="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.listaFuncionAccion1}"
                                                    converter="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.botonProcesar1_action}"
                                                    binding="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.scriptProcesar}"
                                                    rendered="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.botonRefrescar1_action}"
                                                    binding="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.botonRefrescar1}"
                                                    disabled="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.scriptRefrescar}"
                                                    rendered="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.botonReconsultar1_action}"
                                                    binding="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.botonReconsultar1}"
                                                    disabled="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.scriptReconsultar}"
                                                    rendered="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.botonRetornar1_action}"
                                                    binding="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.botonRetornar1}"
                                                    disabled="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel109"
                                                rendered="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.imageHyperlink1_action}"
                                                    binding="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.imageHyperlink1}"
                                                    disabled="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{FiltroClaseRecursoParametroPorClaseRecursoParametro1.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.FiltroClaseRecursoParametroPorClaseRecursoParametro1_imageHyperlink1_toolTip}"/>
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
