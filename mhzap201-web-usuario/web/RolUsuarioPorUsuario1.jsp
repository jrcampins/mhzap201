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
                    focus="#{RolUsuarioPorUsuario1.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{RolUsuarioPorUsuario1.gestor.preserveFocus}"
                    preserveScroll="#{RolUsuarioPorUsuario1.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{RolUsuarioPorUsuario1.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | checkbox1 campoIdRolUsuario1 campoIdRol1 textoFilasPorPagina1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | textoFilasPorPagina1 | botonRepaginar1 , virtualForm3 | checkbox1 listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonEscogerFila1 botonDetallarFila1 botonProcesarFila1 botonRetornarFila1 botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{RolUsuarioPorUsuario1.breadcrumbs1}" 
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
                                                    rendered="#{RolUsuarioPorUsuario1.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{RolUsuarioPorUsuario1.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{RolUsuarioPorUsuario1.gestor.mensajeDisponible}"
                                                    text="#{RolUsuarioPorUsuario1.gestor.mensaje}"
                                                    url="#{RolUsuarioPorUsuario1.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:table
                                            binding="#{RolUsuarioPorUsuario1.table1}"
                                            clearSortButton="true" 
                                            deselectMultipleButton="true" 
                                            id="table1"
                                            paginateButton="false"
                                            paginationControls="true" 
                                            selectMultipleButton="true" 
                                            sortPanelToggleButton="true"
                                            width="960">
                                            <webuijsf:tableRowGroup 
                                                binding="#{RolUsuarioPorUsuario1.tableRowGroup1}" 
                                                id="tableRowGroup1" 
                                                rows="1"
                                                selected="#{RolUsuarioPorUsuario1.gestor.filaEscogida}" 
                                                sourceData="#{RolUsuarioPorUsuario1.rolUsuarioDataProvider}" 
                                                sourceVar="currentRow">
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    id="tableRowGroup1SelectionColumn"
                                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);" 
                                                    selectId="checkbox1">
                                                    <webuijsf:checkbox 
                                                        binding="#{RolUsuarioPorUsuario1.checkbox1}" 
                                                        id="checkbox1"
                                                        onClick="#{RolUsuarioPorUsuario1.gestor.scriptElegir}" 
                                                        selected="#{RolUsuarioPorUsuario1.gestor.filaElegida}" 
                                                        toolTip="#{RolUsuarioPorUsuario1.gestor.i18n.toolTipCheckboxSeleccionMultiple}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    binding="#{RolUsuarioPorUsuario1.tableColumn1}" 
                                                    id="tableColumn1">
                                                    <webuijsf:button 
                                                        actionExpression="#{RolUsuarioPorUsuario1.botonEscogerFila1_action}"
                                                        binding="#{RolUsuarioPorUsuario1.botonEscogerFila1}"
                                                        disabled="#{RolUsuarioPorUsuario1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonEscogerFila1"
                                                        imageURL="#{RolUsuarioPorUsuario1.gestor.urlImagenEscoger}" 
                                                        onClick="#{RolUsuarioPorUsuario1.gestor.scriptEscoger}"
                                                        text="#{RolUsuarioPorUsuario1.gestor.i18n.textoBotonEscogerFila}"
                                                        toolTip="#{RolUsuarioPorUsuario1.gestor.i18n.toolTipBotonEscogerFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{RolUsuarioPorUsuario1.botonDetallarFila1_action}"
                                                        binding="#{RolUsuarioPorUsuario1.botonDetallarFila1}"
                                                        disabled="#{RolUsuarioPorUsuario1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonDetallarFila1"
                                                        imageURL="#{RolUsuarioPorUsuario1.gestor.urlImagenDetallar}" 
                                                        onClick="#{RolUsuarioPorUsuario1.scriptAbrirVentanaVerDetalle}"
                                                        rendered="#{RolUsuarioPorUsuario1.gestor.detalleDisponible}" 
                                                        text="#{RolUsuarioPorUsuario1.gestor.i18n.textoBotonDetallarFila}"
                                                        toolTip="#{RolUsuarioPorUsuario1.gestor.i18n.toolTipBotonDetallarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{RolUsuarioPorUsuario1.botonProcesarFila1_action}"
                                                        binding="#{RolUsuarioPorUsuario1.botonProcesarFila1}"
                                                        disabled="#{RolUsuarioPorUsuario1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonProcesarFila1"
                                                        imageURL="#{RolUsuarioPorUsuario1.gestor.urlImagenProcesar}" 
                                                        onClick="#{RolUsuarioPorUsuario1.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{RolUsuarioPorUsuario1.asistente.comandoDisponible}" 
                                                        text="#{RolUsuarioPorUsuario1.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{RolUsuarioPorUsuario1.gestor.i18n.toolTipBotonProcesarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{RolUsuarioPorUsuario1.botonRetornarFila1_action}"
                                                        binding="#{RolUsuarioPorUsuario1.botonRetornarFila1}" 
                                                        disabled="#{RolUsuarioPorUsuario1.gestor.funcionReturnInhabilitada}"
                                                        id="botonRetornarFila1"
                                                        imageURL="#{RolUsuarioPorUsuario1.gestor.urlImagenRetornar}"
                                                        onClick="#{RolUsuarioPorUsuario1.gestor.scriptRetornarRecursoActual}"
                                                        rendered="#{RolUsuarioPorUsuario1.gestor.funcionReturnVisible}" 
                                                        text="#{RolUsuarioPorUsuario1.gestor.i18n.textoBotonRetornarFila}"
                                                        toolTip="#{RolUsuarioPorUsuario1.gestor.i18n.toolTipBotonRetornarFila}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{RolUsuarioPorUsuario1.tableColumn2}"
                                                    id="tableColumn2"
                                                    rendered="#{RolUsuarioPorUsuario1.gestor.designing}">
                                                    <webuijsf:imageHyperlink
                                                        actionExpression="#{RolUsuarioPorUsuario1.hipervinculoAccionFila1_action}"
                                                        binding="#{RolUsuarioPorUsuario1.hipervinculoAccionFila1}"
                                                        disabled="#{RolUsuarioPorUsuario1.gestor.loteConCambios}"
                                                        id="hipervinculoAccionFila1"
                                                        imageURL="#{RolUsuarioPorUsuario1.gestor.urlImagenEjecutarVinculo}"
                                                        onClick="#{RolUsuarioPorUsuario1.scriptAbrirVentanaAccionFila1}"
                                                        text="Accion1"
                                                        toolTip="#{bundle.RolUsuarioPorUsuario1_hipervinculoAccionFila1_toolTip}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="right" 
                                                    binding="#{RolUsuarioPorUsuario1.tableColumn3}" 
                                                    headerText="#{RolUsuarioPorUsuario1.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{RolUsuarioPorUsuario1.gestor.i18n.toolTipEtiquetaIdentificacionFila}"
                                                    id="tableColumn3">
                                                    <webuijsf:imageHyperlink 
                                                        actionExpression="#{RolUsuarioPorUsuario1.hipervinculoDetallarFila1_action}"
                                                        binding="#{RolUsuarioPorUsuario1.hipervinculoDetallarFila1}" 
                                                        id="hipervinculoDetallarFila1"
                                                        imageURL="#{RolUsuarioPorUsuario1.gestor.urlImagenFilaProcesada}"
                                                        textPosition="left" 
                                                        text="#{RolUsuarioPorUsuario1.gestor.identificacionFila}" 
                                                        toolTip="#{RolUsuarioPorUsuario1.gestor.toolTipImagenFilaProcesada}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{RolUsuarioPorUsuario1.tableColumnIdRolUsuario1}"
                                                    headerText="id"
                                                    id="tableColumnIdRolUsuario1" rendered="false"
                                                    sort="id_rol_usuario">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdRolUsuario1"
                                                    text="#{currentRow.value['id_rol_usuario']}"
                                                    rendered="#{RolUsuarioPorUsuario1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{RolUsuarioPorUsuario1.labelIdRolUsuario1}"
                                                    id="labelIdRolUsuario1"
                                                    for="campoIdRolUsuario1"/>
                                                <webuijsf:textField id="campoIdRolUsuario1"
                                                    binding="#{RolUsuarioPorUsuario1.campoIdRolUsuario1}"
                                                    converter="#{RolUsuarioPorUsuario1.converterIdRolUsuario1}"
                                                    readOnly="#{RolUsuarioPorUsuario1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['id_rol_usuario']}"
                                                    toolTip="BundleParametros.id_rol_usuario.rol_usuario"
                                                    validatorExpression="#{RolUsuarioPorUsuario1.validatorIdRolUsuario1.validate}"/>
                                                <webuijsf:staticText id="campoIdRolUsuario1Texto1"
                                                    binding="#{RolUsuarioPorUsuario1.campoIdRolUsuario1Texto1}"
                                                    text="#{currentRow.value['id_rol_usuario']}"/>
                                                <webuijsf:message id="messageIdRolUsuario1"
                                                    for="campoIdRolUsuario1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{RolUsuarioPorUsuario1.tableColumnIdRol1}"
                                                    headerText="rol"
                                                    id="tableColumnIdRol1"
                                                    sort="codigo_rol_1x1y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdRol1"
                                                    text="#{currentRow.value['codigo_rol_1x1y3']}"
                                                    rendered="#{RolUsuarioPorUsuario1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{RolUsuarioPorUsuario1.labelIdRol1}"
                                                    id="labelIdRol1"
                                                    for="campoIdRol1"/>
                                                <webuijsf:textField id="campoIdRol1"
                                                    binding="#{RolUsuarioPorUsuario1.campoIdRol1}"
                                                    readOnly="#{RolUsuarioPorUsuario1.gestor.filaNoProcesada}" required="true"
                                                    text="#{RolUsuarioPorUsuario1.asistente.textoCampoIdRol1}"
                                                    toolTip="#{RolUsuarioPorUsuario1.asistente.toolTipCampoIdRol1}"
                                                    validatorExpression="#{RolUsuarioPorUsuario1.campoIdRol1_validate}"/>
                                                <webuijsf:staticText id="campoIdRol1Texto1"
                                                    binding="#{RolUsuarioPorUsuario1.campoIdRol1Texto1}"
                                                    text="#{currentRow.value['codigo_rol_1x1y3']}"/>
                                                <webuijsf:message id="messageIdRol1"
                                                    for="campoIdRol1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdRol3"
                                                    rendered="#{RolUsuarioPorUsuario1.asistente.tableColumnIdRol3Rendered}"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdRol3"
                                                    text="#{currentRow.value['id_rol']}"
                                                    rendered="#{RolUsuarioPorUsuario1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{RolUsuarioPorUsuario1.campoIdRol1Boton1}"
                                                    id="campoIdRol1Boton1"
                                                    onClick="#{RolUsuarioPorUsuario1.asistente.scriptCampoIdRol1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{RolUsuarioPorUsuario1.campoIdRol1Boton3}"
                                                    id="campoIdRol1Boton3"
                                                    onClick="#{RolUsuarioPorUsuario1.asistente.scriptCampoIdRol1Boton2}"
                                                    rendered="#{RolUsuarioPorUsuario1.asistente.campoIdRol1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{RolUsuarioPorUsuario1.tableColumnIdRol2}"
                                                    headerText="nombre rol"
                                                    id="tableColumnIdRol2"
                                                    rendered="#{RolUsuarioPorUsuario1.asistente.campoIdRol1Boton2Rendered}"
                                                    sort="nombre_rol_1x1y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdRol2"
                                                    text="#{currentRow.value['nombre_rol_1x1y4']}"
                                                    rendered="#{RolUsuarioPorUsuario1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{RolUsuarioPorUsuario1.labelIdRol2}"
                                                    id="labelIdRol2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{RolUsuarioPorUsuario1.campoIdRol1Hiper1}"
                                                    id="campoIdRol1Hiper1"
                                                    text="#{currentRow.value['nombre_rol_1x1y4']}"
                                                    onClick="#{RolUsuarioPorUsuario1.asistente.scriptCampoIdRol1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdRol1Boton2"
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
                                                        binding="#{RolUsuarioPorUsuario1.etiquetaTextoFilasPorPagina1}" 
                                                        for="textoFilasPorPagina1"
                                                        id="etiquetaTextoFilasPorPagina1" 
                                                        text="#{RolUsuarioPorUsuario1.gestor.i18n.textoEtiquetaTextoFilasPorPagina}"/>
                                                </h:panelGrid>
                                                <h:panelGrid 
                                                    columns="3" 
                                                    id="gridPanel107">
                                                    <webuijsf:textField 
                                                        binding="#{RolUsuarioPorUsuario1.textoFilasPorPagina1}" 
                                                        columns="2"
                                                        converter="#{RolUsuarioPorUsuario1.textoFilasPorPagina1Converter1}"
                                                        disabled="#{RolUsuarioPorUsuario1.gestor.paginacionInhabilitada}" 
                                                        id="textoFilasPorPagina1" maxLength="2"
                                                        text="#{RolUsuarioPorUsuario1.gestor.filasPorPagina}" 
                                                        validatorExpression="#{RolUsuarioPorUsuario1.textoFilasPorPagina1Validator1.validate}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{RolUsuarioPorUsuario1.botonRepaginar1_action}"
                                                        binding="#{RolUsuarioPorUsuario1.botonRepaginar1}" 
                                                        id="botonRepaginar1"
                                                        imageURL="#{RolUsuarioPorUsuario1.gestor.urlImagenRepaginar}" 
                                                        onClick="#{RolUsuarioPorUsuario1.gestor.scriptRepaginar}"
                                                        text="#{RolUsuarioPorUsuario1.gestor.i18n.textoBotonRepaginar}"
                                                        toolTip="#{RolUsuarioPorUsuario1.gestor.i18n.toolTipBotonRepaginar}"/>
                                                    <webuijsf:message 
                                                        for="textoFilasPorPagina1" 
                                                        id="messageFilasPorPagina1"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="13"
                                                id="gridPanel108">
                                                <webuijsf:button
                                                    actionExpression="#{RolUsuarioPorUsuario1.botonAgregar1_action}"
                                                    binding="#{RolUsuarioPorUsuario1.botonAgregar1}"
                                                    disabled="#{RolUsuarioPorUsuario1.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{RolUsuarioPorUsuario1.gestor.scriptAgregar}"
                                                    rendered="#{RolUsuarioPorUsuario1.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{RolUsuarioPorUsuario1.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{RolUsuarioPorUsuario1.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{RolUsuarioPorUsuario1.listaFuncionEdicion1}"
                                                    converter="#{RolUsuarioPorUsuario1.converterListaFuncionEdicion1}"
                                                    disabled="#{RolUsuarioPorUsuario1.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{RolUsuarioPorUsuario1.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{RolUsuarioPorUsuario1.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{RolUsuarioPorUsuario1.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{RolUsuarioPorUsuario1.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{RolUsuarioPorUsuario1.botonEditar1_action}"
                                                    binding="#{RolUsuarioPorUsuario1.botonEditar1}"
                                                    disabled="#{RolUsuarioPorUsuario1.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{RolUsuarioPorUsuario1.gestor.scriptEditar}"
                                                    rendered="#{RolUsuarioPorUsuario1.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{RolUsuarioPorUsuario1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{RolUsuarioPorUsuario1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{RolUsuarioPorUsuario1.botonEliminar1_action}"
                                                    binding="#{RolUsuarioPorUsuario1.botonEliminar1}"
                                                    disabled="#{RolUsuarioPorUsuario1.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{RolUsuarioPorUsuario1.gestor.scriptEliminar}"
                                                    rendered="#{RolUsuarioPorUsuario1.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{RolUsuarioPorUsuario1.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{RolUsuarioPorUsuario1.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{RolUsuarioPorUsuario1.botonAplicar1_action}"
                                                    binding="#{RolUsuarioPorUsuario1.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{RolUsuarioPorUsuario1.gestor.scriptAplicar}"
                                                    rendered="#{RolUsuarioPorUsuario1.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{RolUsuarioPorUsuario1.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{RolUsuarioPorUsuario1.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{RolUsuarioPorUsuario1.botonDeshacer1_action}"
                                                    binding="#{RolUsuarioPorUsuario1.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{RolUsuarioPorUsuario1.gestor.scriptDeshacer}"
                                                    rendered="#{RolUsuarioPorUsuario1.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{RolUsuarioPorUsuario1.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{RolUsuarioPorUsuario1.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{RolUsuarioPorUsuario1.botonConfirmar1_action}"
                                                    binding="#{RolUsuarioPorUsuario1.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{RolUsuarioPorUsuario1.gestor.scriptConfirmar}"
                                                    rendered="#{RolUsuarioPorUsuario1.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{RolUsuarioPorUsuario1.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{RolUsuarioPorUsuario1.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{RolUsuarioPorUsuario1.botonDescartar1_action}"
                                                    binding="#{RolUsuarioPorUsuario1.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{RolUsuarioPorUsuario1.gestor.scriptDescartar}"
                                                    rendered="#{RolUsuarioPorUsuario1.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{RolUsuarioPorUsuario1.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{RolUsuarioPorUsuario1.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{RolUsuarioPorUsuario1.listaFuncionAccion1}"
                                                    converter="#{RolUsuarioPorUsuario1.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{RolUsuarioPorUsuario1.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{RolUsuarioPorUsuario1.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{RolUsuarioPorUsuario1.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{RolUsuarioPorUsuario1.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{RolUsuarioPorUsuario1.botonProcesar1_action}"
                                                    binding="#{RolUsuarioPorUsuario1.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{RolUsuarioPorUsuario1.gestor.scriptProcesar}"
                                                    rendered="#{RolUsuarioPorUsuario1.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{RolUsuarioPorUsuario1.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{RolUsuarioPorUsuario1.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{RolUsuarioPorUsuario1.botonRefrescar1_action}"
                                                    binding="#{RolUsuarioPorUsuario1.botonRefrescar1}"
                                                    disabled="#{RolUsuarioPorUsuario1.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{RolUsuarioPorUsuario1.gestor.scriptRefrescar}"
                                                    rendered="#{RolUsuarioPorUsuario1.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{RolUsuarioPorUsuario1.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{RolUsuarioPorUsuario1.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{RolUsuarioPorUsuario1.botonReconsultar1_action}"
                                                    binding="#{RolUsuarioPorUsuario1.botonReconsultar1}"
                                                    disabled="#{RolUsuarioPorUsuario1.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{RolUsuarioPorUsuario1.gestor.scriptReconsultar}"
                                                    rendered="#{RolUsuarioPorUsuario1.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{RolUsuarioPorUsuario1.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{RolUsuarioPorUsuario1.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{RolUsuarioPorUsuario1.botonRetornar1_action}"
                                                    binding="#{RolUsuarioPorUsuario1.botonRetornar1}"
                                                    disabled="#{RolUsuarioPorUsuario1.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{RolUsuarioPorUsuario1.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{RolUsuarioPorUsuario1.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{RolUsuarioPorUsuario1.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{RolUsuarioPorUsuario1.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel109"
                                                rendered="#{RolUsuarioPorUsuario1.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{RolUsuarioPorUsuario1.imageHyperlink1_action}"
                                                    binding="#{RolUsuarioPorUsuario1.imageHyperlink1}"
                                                    disabled="#{RolUsuarioPorUsuario1.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{RolUsuarioPorUsuario1.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{RolUsuarioPorUsuario1.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{RolUsuarioPorUsuario1.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.RolUsuarioPorUsuario1_imageHyperlink1_toolTip}"/>
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
