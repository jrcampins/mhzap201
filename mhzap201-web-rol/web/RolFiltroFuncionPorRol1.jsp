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
                    focus="#{RolFiltroFuncionPorRol1.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{RolFiltroFuncionPorRol1.gestor.preserveFocus}"
                    preserveScroll="#{RolFiltroFuncionPorRol1.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{RolFiltroFuncionPorRol1.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | checkbox1 campoIdRolFiltroFuncion1 campoIdFiltroFuncion1 textoFilasPorPagina1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | textoFilasPorPagina1 | botonRepaginar1 , virtualForm3 | checkbox1 listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonEscogerFila1 botonDetallarFila1 botonProcesarFila1 botonRetornarFila1 botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{RolFiltroFuncionPorRol1.breadcrumbs1}" 
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
                                                    rendered="#{RolFiltroFuncionPorRol1.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{RolFiltroFuncionPorRol1.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{RolFiltroFuncionPorRol1.gestor.mensajeDisponible}"
                                                    text="#{RolFiltroFuncionPorRol1.gestor.mensaje}"
                                                    url="#{RolFiltroFuncionPorRol1.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:table
                                            binding="#{RolFiltroFuncionPorRol1.table1}"
                                            clearSortButton="true" 
                                            deselectMultipleButton="true" 
                                            id="table1"
                                            paginateButton="false"
                                            paginationControls="true" 
                                            selectMultipleButton="true" 
                                            sortPanelToggleButton="true"
                                            width="960">
                                            <webuijsf:tableRowGroup 
                                                binding="#{RolFiltroFuncionPorRol1.tableRowGroup1}" 
                                                id="tableRowGroup1" 
                                                rows="1"
                                                selected="#{RolFiltroFuncionPorRol1.gestor.filaEscogida}" 
                                                sourceData="#{RolFiltroFuncionPorRol1.rolFiltroFuncionDataProvider}" 
                                                sourceVar="currentRow">
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    id="tableRowGroup1SelectionColumn"
                                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);" 
                                                    selectId="checkbox1">
                                                    <webuijsf:checkbox 
                                                        binding="#{RolFiltroFuncionPorRol1.checkbox1}" 
                                                        id="checkbox1"
                                                        onClick="#{RolFiltroFuncionPorRol1.gestor.scriptElegir}" 
                                                        selected="#{RolFiltroFuncionPorRol1.gestor.filaElegida}" 
                                                        toolTip="#{RolFiltroFuncionPorRol1.gestor.i18n.toolTipCheckboxSeleccionMultiple}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    binding="#{RolFiltroFuncionPorRol1.tableColumn1}" 
                                                    id="tableColumn1">
                                                    <webuijsf:button 
                                                        actionExpression="#{RolFiltroFuncionPorRol1.botonEscogerFila1_action}"
                                                        binding="#{RolFiltroFuncionPorRol1.botonEscogerFila1}"
                                                        disabled="#{RolFiltroFuncionPorRol1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonEscogerFila1"
                                                        imageURL="#{RolFiltroFuncionPorRol1.gestor.urlImagenEscoger}" 
                                                        onClick="#{RolFiltroFuncionPorRol1.gestor.scriptEscoger}"
                                                        text="#{RolFiltroFuncionPorRol1.gestor.i18n.textoBotonEscogerFila}"
                                                        toolTip="#{RolFiltroFuncionPorRol1.gestor.i18n.toolTipBotonEscogerFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{RolFiltroFuncionPorRol1.botonDetallarFila1_action}"
                                                        binding="#{RolFiltroFuncionPorRol1.botonDetallarFila1}"
                                                        disabled="#{RolFiltroFuncionPorRol1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonDetallarFila1"
                                                        imageURL="#{RolFiltroFuncionPorRol1.gestor.urlImagenDetallar}" 
                                                        onClick="#{RolFiltroFuncionPorRol1.scriptAbrirVentanaVerDetalle}"
                                                        rendered="#{RolFiltroFuncionPorRol1.gestor.detalleDisponible}" 
                                                        text="#{RolFiltroFuncionPorRol1.gestor.i18n.textoBotonDetallarFila}"
                                                        toolTip="#{RolFiltroFuncionPorRol1.gestor.i18n.toolTipBotonDetallarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{RolFiltroFuncionPorRol1.botonProcesarFila1_action}"
                                                        binding="#{RolFiltroFuncionPorRol1.botonProcesarFila1}"
                                                        disabled="#{RolFiltroFuncionPorRol1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonProcesarFila1"
                                                        imageURL="#{RolFiltroFuncionPorRol1.gestor.urlImagenProcesar}" 
                                                        onClick="#{RolFiltroFuncionPorRol1.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{RolFiltroFuncionPorRol1.asistente.comandoDisponible}" 
                                                        text="#{RolFiltroFuncionPorRol1.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{RolFiltroFuncionPorRol1.gestor.i18n.toolTipBotonProcesarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{RolFiltroFuncionPorRol1.botonRetornarFila1_action}"
                                                        binding="#{RolFiltroFuncionPorRol1.botonRetornarFila1}" 
                                                        disabled="#{RolFiltroFuncionPorRol1.gestor.funcionReturnInhabilitada}"
                                                        id="botonRetornarFila1"
                                                        imageURL="#{RolFiltroFuncionPorRol1.gestor.urlImagenRetornar}"
                                                        onClick="#{RolFiltroFuncionPorRol1.gestor.scriptRetornarRecursoActual}"
                                                        rendered="#{RolFiltroFuncionPorRol1.gestor.funcionReturnVisible}" 
                                                        text="#{RolFiltroFuncionPorRol1.gestor.i18n.textoBotonRetornarFila}"
                                                        toolTip="#{RolFiltroFuncionPorRol1.gestor.i18n.toolTipBotonRetornarFila}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{RolFiltroFuncionPorRol1.tableColumn2}"
                                                    id="tableColumn2"
                                                    rendered="#{RolFiltroFuncionPorRol1.gestor.designing}">
                                                    <webuijsf:imageHyperlink
                                                        actionExpression="#{RolFiltroFuncionPorRol1.hipervinculoAccionFila1_action}"
                                                        binding="#{RolFiltroFuncionPorRol1.hipervinculoAccionFila1}"
                                                        disabled="#{RolFiltroFuncionPorRol1.gestor.loteConCambios}"
                                                        id="hipervinculoAccionFila1"
                                                        imageURL="#{RolFiltroFuncionPorRol1.gestor.urlImagenEjecutarVinculo}"
                                                        onClick="#{RolFiltroFuncionPorRol1.scriptAbrirVentanaAccionFila1}"
                                                        text="Accion1"
                                                        toolTip="#{bundle.RolFiltroFuncionPorRol1_hipervinculoAccionFila1_toolTip}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="right" 
                                                    binding="#{RolFiltroFuncionPorRol1.tableColumn3}" 
                                                    headerText="#{RolFiltroFuncionPorRol1.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{RolFiltroFuncionPorRol1.gestor.i18n.toolTipEtiquetaIdentificacionFila}"
                                                    id="tableColumn3">
                                                    <webuijsf:imageHyperlink 
                                                        actionExpression="#{RolFiltroFuncionPorRol1.hipervinculoDetallarFila1_action}"
                                                        binding="#{RolFiltroFuncionPorRol1.hipervinculoDetallarFila1}" 
                                                        id="hipervinculoDetallarFila1"
                                                        imageURL="#{RolFiltroFuncionPorRol1.gestor.urlImagenFilaProcesada}"
                                                        textPosition="left" 
                                                        text="#{RolFiltroFuncionPorRol1.gestor.identificacionFila}" 
                                                        toolTip="#{RolFiltroFuncionPorRol1.gestor.toolTipImagenFilaProcesada}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{RolFiltroFuncionPorRol1.tableColumnIdRolFiltroFuncion1}"
                                                    headerText="identificaci&#243;n"
                                                    id="tableColumnIdRolFiltroFuncion1" rendered="false"
                                                    sort="id_rol_filtro_funcion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdRolFiltroFuncion1"
                                                    text="#{currentRow.value['id_rol_filtro_funcion']}"
                                                    rendered="#{RolFiltroFuncionPorRol1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{RolFiltroFuncionPorRol1.labelIdRolFiltroFuncion1}"
                                                    id="labelIdRolFiltroFuncion1"
                                                    for="campoIdRolFiltroFuncion1"/>
                                                <webuijsf:textField id="campoIdRolFiltroFuncion1"
                                                    binding="#{RolFiltroFuncionPorRol1.campoIdRolFiltroFuncion1}"
                                                    converter="#{RolFiltroFuncionPorRol1.converterIdRolFiltroFuncion1}"
                                                    readOnly="#{RolFiltroFuncionPorRol1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['id_rol_filtro_funcion']}"
                                                    toolTip="BundleParametros.id_rol_filtro_funcion.rol_filtro_funcion"
                                                    validatorExpression="#{RolFiltroFuncionPorRol1.validatorIdRolFiltroFuncion1.validate}"/>
                                                <webuijsf:staticText id="campoIdRolFiltroFuncion1Texto1"
                                                    binding="#{RolFiltroFuncionPorRol1.campoIdRolFiltroFuncion1Texto1}"
                                                    text="#{currentRow.value['id_rol_filtro_funcion']}"/>
                                                <webuijsf:message id="messageIdRolFiltroFuncion1"
                                                    for="campoIdRolFiltroFuncion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{RolFiltroFuncionPorRol1.tableColumnIdFiltroFuncion1}"
                                                    headerText="filtro funci&#243;n"
                                                    id="tableColumnIdFiltroFuncion1"
                                                    sort="codigo_filtro_funcion_1x2y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdFiltroFuncion1"
                                                    text="#{currentRow.value['codigo_filtro_funcion_1x2y3']}"
                                                    rendered="#{RolFiltroFuncionPorRol1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{RolFiltroFuncionPorRol1.labelIdFiltroFuncion1}"
                                                    id="labelIdFiltroFuncion1"
                                                    for="campoIdFiltroFuncion1"/>
                                                <webuijsf:textField id="campoIdFiltroFuncion1"
                                                    binding="#{RolFiltroFuncionPorRol1.campoIdFiltroFuncion1}"
                                                    readOnly="#{RolFiltroFuncionPorRol1.gestor.filaNoProcesada}" required="true"
                                                    text="#{RolFiltroFuncionPorRol1.asistente.textoCampoIdFiltroFuncion1}"
                                                    toolTip="#{RolFiltroFuncionPorRol1.asistente.toolTipCampoIdFiltroFuncion1}"
                                                    validatorExpression="#{RolFiltroFuncionPorRol1.campoIdFiltroFuncion1_validate}"/>
                                                <webuijsf:staticText id="campoIdFiltroFuncion1Texto1"
                                                    binding="#{RolFiltroFuncionPorRol1.campoIdFiltroFuncion1Texto1}"
                                                    text="#{currentRow.value['codigo_filtro_funcion_1x2y3']}"/>
                                                <webuijsf:message id="messageIdFiltroFuncion1"
                                                    for="campoIdFiltroFuncion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdFiltroFuncion3"
                                                    rendered="#{RolFiltroFuncionPorRol1.asistente.tableColumnIdFiltroFuncion3Rendered}"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdFiltroFuncion3"
                                                    text="#{currentRow.value['id_filtro_funcion']}"
                                                    rendered="#{RolFiltroFuncionPorRol1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{RolFiltroFuncionPorRol1.campoIdFiltroFuncion1Boton1}"
                                                    id="campoIdFiltroFuncion1Boton1"
                                                    onClick="#{RolFiltroFuncionPorRol1.asistente.scriptCampoIdFiltroFuncion1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{RolFiltroFuncionPorRol1.campoIdFiltroFuncion1Boton3}"
                                                    id="campoIdFiltroFuncion1Boton3"
                                                    onClick="#{RolFiltroFuncionPorRol1.asistente.scriptCampoIdFiltroFuncion1Boton2}"
                                                    rendered="#{RolFiltroFuncionPorRol1.asistente.campoIdFiltroFuncion1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{RolFiltroFuncionPorRol1.tableColumnIdFiltroFuncion2}"
                                                    headerText="nombre filtro funci&#243;n"
                                                    id="tableColumnIdFiltroFuncion2"
                                                    rendered="#{RolFiltroFuncionPorRol1.asistente.campoIdFiltroFuncion1Boton2Rendered}"
                                                    sort="nombre_filtro_funcion_1x2y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdFiltroFuncion2"
                                                    text="#{currentRow.value['nombre_filtro_funcion_1x2y4']}"
                                                    rendered="#{RolFiltroFuncionPorRol1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{RolFiltroFuncionPorRol1.labelIdFiltroFuncion2}"
                                                    id="labelIdFiltroFuncion2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{RolFiltroFuncionPorRol1.campoIdFiltroFuncion1Hiper1}"
                                                    id="campoIdFiltroFuncion1Hiper1"
                                                    text="#{currentRow.value['nombre_filtro_funcion_1x2y4']}"
                                                    onClick="#{RolFiltroFuncionPorRol1.asistente.scriptCampoIdFiltroFuncion1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdFiltroFuncion1Boton2"
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
                                                        binding="#{RolFiltroFuncionPorRol1.etiquetaTextoFilasPorPagina1}" 
                                                        for="textoFilasPorPagina1"
                                                        id="etiquetaTextoFilasPorPagina1" 
                                                        text="#{RolFiltroFuncionPorRol1.gestor.i18n.textoEtiquetaTextoFilasPorPagina}"/>
                                                </h:panelGrid>
                                                <h:panelGrid 
                                                    columns="3" 
                                                    id="gridPanel107">
                                                    <webuijsf:textField 
                                                        binding="#{RolFiltroFuncionPorRol1.textoFilasPorPagina1}" 
                                                        columns="2"
                                                        converter="#{RolFiltroFuncionPorRol1.textoFilasPorPagina1Converter1}"
                                                        disabled="#{RolFiltroFuncionPorRol1.gestor.paginacionInhabilitada}" 
                                                        id="textoFilasPorPagina1" maxLength="2"
                                                        text="#{RolFiltroFuncionPorRol1.gestor.filasPorPagina}" 
                                                        validatorExpression="#{RolFiltroFuncionPorRol1.textoFilasPorPagina1Validator1.validate}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{RolFiltroFuncionPorRol1.botonRepaginar1_action}"
                                                        binding="#{RolFiltroFuncionPorRol1.botonRepaginar1}" 
                                                        id="botonRepaginar1"
                                                        imageURL="#{RolFiltroFuncionPorRol1.gestor.urlImagenRepaginar}" 
                                                        onClick="#{RolFiltroFuncionPorRol1.gestor.scriptRepaginar}"
                                                        text="#{RolFiltroFuncionPorRol1.gestor.i18n.textoBotonRepaginar}"
                                                        toolTip="#{RolFiltroFuncionPorRol1.gestor.i18n.toolTipBotonRepaginar}"/>
                                                    <webuijsf:message 
                                                        for="textoFilasPorPagina1" 
                                                        id="messageFilasPorPagina1"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="13"
                                                id="gridPanel108">
                                                <webuijsf:button
                                                    actionExpression="#{RolFiltroFuncionPorRol1.botonAgregar1_action}"
                                                    binding="#{RolFiltroFuncionPorRol1.botonAgregar1}"
                                                    disabled="#{RolFiltroFuncionPorRol1.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{RolFiltroFuncionPorRol1.gestor.scriptAgregar}"
                                                    rendered="#{RolFiltroFuncionPorRol1.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{RolFiltroFuncionPorRol1.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{RolFiltroFuncionPorRol1.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{RolFiltroFuncionPorRol1.listaFuncionEdicion1}"
                                                    converter="#{RolFiltroFuncionPorRol1.converterListaFuncionEdicion1}"
                                                    disabled="#{RolFiltroFuncionPorRol1.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{RolFiltroFuncionPorRol1.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{RolFiltroFuncionPorRol1.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{RolFiltroFuncionPorRol1.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{RolFiltroFuncionPorRol1.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{RolFiltroFuncionPorRol1.botonEditar1_action}"
                                                    binding="#{RolFiltroFuncionPorRol1.botonEditar1}"
                                                    disabled="#{RolFiltroFuncionPorRol1.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{RolFiltroFuncionPorRol1.gestor.scriptEditar}"
                                                    rendered="#{RolFiltroFuncionPorRol1.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{RolFiltroFuncionPorRol1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{RolFiltroFuncionPorRol1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{RolFiltroFuncionPorRol1.botonEliminar1_action}"
                                                    binding="#{RolFiltroFuncionPorRol1.botonEliminar1}"
                                                    disabled="#{RolFiltroFuncionPorRol1.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{RolFiltroFuncionPorRol1.gestor.scriptEliminar}"
                                                    rendered="#{RolFiltroFuncionPorRol1.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{RolFiltroFuncionPorRol1.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{RolFiltroFuncionPorRol1.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{RolFiltroFuncionPorRol1.botonAplicar1_action}"
                                                    binding="#{RolFiltroFuncionPorRol1.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{RolFiltroFuncionPorRol1.gestor.scriptAplicar}"
                                                    rendered="#{RolFiltroFuncionPorRol1.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{RolFiltroFuncionPorRol1.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{RolFiltroFuncionPorRol1.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{RolFiltroFuncionPorRol1.botonDeshacer1_action}"
                                                    binding="#{RolFiltroFuncionPorRol1.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{RolFiltroFuncionPorRol1.gestor.scriptDeshacer}"
                                                    rendered="#{RolFiltroFuncionPorRol1.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{RolFiltroFuncionPorRol1.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{RolFiltroFuncionPorRol1.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{RolFiltroFuncionPorRol1.botonConfirmar1_action}"
                                                    binding="#{RolFiltroFuncionPorRol1.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{RolFiltroFuncionPorRol1.gestor.scriptConfirmar}"
                                                    rendered="#{RolFiltroFuncionPorRol1.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{RolFiltroFuncionPorRol1.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{RolFiltroFuncionPorRol1.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{RolFiltroFuncionPorRol1.botonDescartar1_action}"
                                                    binding="#{RolFiltroFuncionPorRol1.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{RolFiltroFuncionPorRol1.gestor.scriptDescartar}"
                                                    rendered="#{RolFiltroFuncionPorRol1.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{RolFiltroFuncionPorRol1.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{RolFiltroFuncionPorRol1.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{RolFiltroFuncionPorRol1.listaFuncionAccion1}"
                                                    converter="#{RolFiltroFuncionPorRol1.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{RolFiltroFuncionPorRol1.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{RolFiltroFuncionPorRol1.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{RolFiltroFuncionPorRol1.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{RolFiltroFuncionPorRol1.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{RolFiltroFuncionPorRol1.botonProcesar1_action}"
                                                    binding="#{RolFiltroFuncionPorRol1.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{RolFiltroFuncionPorRol1.gestor.scriptProcesar}"
                                                    rendered="#{RolFiltroFuncionPorRol1.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{RolFiltroFuncionPorRol1.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{RolFiltroFuncionPorRol1.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{RolFiltroFuncionPorRol1.botonRefrescar1_action}"
                                                    binding="#{RolFiltroFuncionPorRol1.botonRefrescar1}"
                                                    disabled="#{RolFiltroFuncionPorRol1.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{RolFiltroFuncionPorRol1.gestor.scriptRefrescar}"
                                                    rendered="#{RolFiltroFuncionPorRol1.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{RolFiltroFuncionPorRol1.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{RolFiltroFuncionPorRol1.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{RolFiltroFuncionPorRol1.botonReconsultar1_action}"
                                                    binding="#{RolFiltroFuncionPorRol1.botonReconsultar1}"
                                                    disabled="#{RolFiltroFuncionPorRol1.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{RolFiltroFuncionPorRol1.gestor.scriptReconsultar}"
                                                    rendered="#{RolFiltroFuncionPorRol1.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{RolFiltroFuncionPorRol1.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{RolFiltroFuncionPorRol1.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{RolFiltroFuncionPorRol1.botonRetornar1_action}"
                                                    binding="#{RolFiltroFuncionPorRol1.botonRetornar1}"
                                                    disabled="#{RolFiltroFuncionPorRol1.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{RolFiltroFuncionPorRol1.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{RolFiltroFuncionPorRol1.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{RolFiltroFuncionPorRol1.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{RolFiltroFuncionPorRol1.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel109"
                                                rendered="#{RolFiltroFuncionPorRol1.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{RolFiltroFuncionPorRol1.imageHyperlink1_action}"
                                                    binding="#{RolFiltroFuncionPorRol1.imageHyperlink1}"
                                                    disabled="#{RolFiltroFuncionPorRol1.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{RolFiltroFuncionPorRol1.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{RolFiltroFuncionPorRol1.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{RolFiltroFuncionPorRol1.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.RolFiltroFuncionPorRol1_imageHyperlink1_toolTip}"/>
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
