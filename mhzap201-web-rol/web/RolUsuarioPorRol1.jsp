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
                    focus="#{RolUsuarioPorRol1.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{RolUsuarioPorRol1.gestor.preserveFocus}"
                    preserveScroll="#{RolUsuarioPorRol1.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{RolUsuarioPorRol1.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | checkbox1 campoIdRolUsuario1 campoIdUsuario1 textoFilasPorPagina1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | textoFilasPorPagina1 | botonRepaginar1 , virtualForm3 | checkbox1 listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonEscogerFila1 botonDetallarFila1 botonProcesarFila1 botonRetornarFila1 botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{RolUsuarioPorRol1.breadcrumbs1}" 
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
                                                    rendered="#{RolUsuarioPorRol1.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{RolUsuarioPorRol1.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{RolUsuarioPorRol1.gestor.mensajeDisponible}"
                                                    text="#{RolUsuarioPorRol1.gestor.mensaje}"
                                                    url="#{RolUsuarioPorRol1.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:table
                                            binding="#{RolUsuarioPorRol1.table1}"
                                            clearSortButton="true" 
                                            deselectMultipleButton="true" 
                                            id="table1"
                                            paginateButton="false"
                                            paginationControls="true" 
                                            selectMultipleButton="true" 
                                            sortPanelToggleButton="true"
                                            width="960">
                                            <webuijsf:tableRowGroup 
                                                binding="#{RolUsuarioPorRol1.tableRowGroup1}" 
                                                id="tableRowGroup1" 
                                                rows="1"
                                                selected="#{RolUsuarioPorRol1.gestor.filaEscogida}" 
                                                sourceData="#{RolUsuarioPorRol1.rolUsuarioDataProvider}" 
                                                sourceVar="currentRow">
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    id="tableRowGroup1SelectionColumn"
                                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);" 
                                                    selectId="checkbox1">
                                                    <webuijsf:checkbox 
                                                        binding="#{RolUsuarioPorRol1.checkbox1}" 
                                                        id="checkbox1"
                                                        onClick="#{RolUsuarioPorRol1.gestor.scriptElegir}" 
                                                        selected="#{RolUsuarioPorRol1.gestor.filaElegida}" 
                                                        toolTip="#{RolUsuarioPorRol1.gestor.i18n.toolTipCheckboxSeleccionMultiple}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    binding="#{RolUsuarioPorRol1.tableColumn1}" 
                                                    id="tableColumn1">
                                                    <webuijsf:button 
                                                        actionExpression="#{RolUsuarioPorRol1.botonEscogerFila1_action}"
                                                        binding="#{RolUsuarioPorRol1.botonEscogerFila1}"
                                                        disabled="#{RolUsuarioPorRol1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonEscogerFila1"
                                                        imageURL="#{RolUsuarioPorRol1.gestor.urlImagenEscoger}" 
                                                        onClick="#{RolUsuarioPorRol1.gestor.scriptEscoger}"
                                                        text="#{RolUsuarioPorRol1.gestor.i18n.textoBotonEscogerFila}"
                                                        toolTip="#{RolUsuarioPorRol1.gestor.i18n.toolTipBotonEscogerFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{RolUsuarioPorRol1.botonDetallarFila1_action}"
                                                        binding="#{RolUsuarioPorRol1.botonDetallarFila1}"
                                                        disabled="#{RolUsuarioPorRol1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonDetallarFila1"
                                                        imageURL="#{RolUsuarioPorRol1.gestor.urlImagenDetallar}" 
                                                        onClick="#{RolUsuarioPorRol1.scriptAbrirVentanaVerDetalle}"
                                                        rendered="#{RolUsuarioPorRol1.gestor.detalleDisponible}" 
                                                        text="#{RolUsuarioPorRol1.gestor.i18n.textoBotonDetallarFila}"
                                                        toolTip="#{RolUsuarioPorRol1.gestor.i18n.toolTipBotonDetallarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{RolUsuarioPorRol1.botonProcesarFila1_action}"
                                                        binding="#{RolUsuarioPorRol1.botonProcesarFila1}"
                                                        disabled="#{RolUsuarioPorRol1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonProcesarFila1"
                                                        imageURL="#{RolUsuarioPorRol1.gestor.urlImagenProcesar}" 
                                                        onClick="#{RolUsuarioPorRol1.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{RolUsuarioPorRol1.asistente.comandoDisponible}" 
                                                        text="#{RolUsuarioPorRol1.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{RolUsuarioPorRol1.gestor.i18n.toolTipBotonProcesarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{RolUsuarioPorRol1.botonRetornarFila1_action}"
                                                        binding="#{RolUsuarioPorRol1.botonRetornarFila1}" 
                                                        disabled="#{RolUsuarioPorRol1.gestor.funcionReturnInhabilitada}"
                                                        id="botonRetornarFila1"
                                                        imageURL="#{RolUsuarioPorRol1.gestor.urlImagenRetornar}"
                                                        onClick="#{RolUsuarioPorRol1.gestor.scriptRetornarRecursoActual}"
                                                        rendered="#{RolUsuarioPorRol1.gestor.funcionReturnVisible}" 
                                                        text="#{RolUsuarioPorRol1.gestor.i18n.textoBotonRetornarFila}"
                                                        toolTip="#{RolUsuarioPorRol1.gestor.i18n.toolTipBotonRetornarFila}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{RolUsuarioPorRol1.tableColumn2}"
                                                    id="tableColumn2"
                                                    rendered="#{RolUsuarioPorRol1.gestor.designing}">
                                                    <webuijsf:imageHyperlink
                                                        actionExpression="#{RolUsuarioPorRol1.hipervinculoAccionFila1_action}"
                                                        binding="#{RolUsuarioPorRol1.hipervinculoAccionFila1}"
                                                        disabled="#{RolUsuarioPorRol1.gestor.loteConCambios}"
                                                        id="hipervinculoAccionFila1"
                                                        imageURL="#{RolUsuarioPorRol1.gestor.urlImagenEjecutarVinculo}"
                                                        onClick="#{RolUsuarioPorRol1.scriptAbrirVentanaAccionFila1}"
                                                        text="Accion1"
                                                        toolTip="#{bundle.RolUsuarioPorRol1_hipervinculoAccionFila1_toolTip}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="right" 
                                                    binding="#{RolUsuarioPorRol1.tableColumn3}" 
                                                    headerText="#{RolUsuarioPorRol1.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{RolUsuarioPorRol1.gestor.i18n.toolTipEtiquetaIdentificacionFila}"
                                                    id="tableColumn3">
                                                    <webuijsf:imageHyperlink 
                                                        actionExpression="#{RolUsuarioPorRol1.hipervinculoDetallarFila1_action}"
                                                        binding="#{RolUsuarioPorRol1.hipervinculoDetallarFila1}" 
                                                        id="hipervinculoDetallarFila1"
                                                        imageURL="#{RolUsuarioPorRol1.gestor.urlImagenFilaProcesada}"
                                                        textPosition="left" 
                                                        text="#{RolUsuarioPorRol1.gestor.identificacionFila}" 
                                                        toolTip="#{RolUsuarioPorRol1.gestor.toolTipImagenFilaProcesada}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{RolUsuarioPorRol1.tableColumnIdRolUsuario1}"
                                                    toolTip="BundleParametros.id_rol_usuario.rol_usuario"
                                                    headerText="identificaci&#243;n"
                                                    id="tableColumnIdRolUsuario1" rendered="false"
                                                    sort="id_rol_usuario">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdRolUsuario1"
                                                    text="#{currentRow.value['id_rol_usuario']}"
                                                    rendered="#{RolUsuarioPorRol1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{RolUsuarioPorRol1.labelIdRolUsuario1}"
                                                    id="labelIdRolUsuario1"
                                                    for="campoIdRolUsuario1"/>
                                                <webuijsf:textField id="campoIdRolUsuario1"
                                                    binding="#{RolUsuarioPorRol1.campoIdRolUsuario1}"
                                                    converter="#{RolUsuarioPorRol1.converterIdRolUsuario1}"
                                                    readOnly="#{RolUsuarioPorRol1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['id_rol_usuario']}"
                                                    toolTip="BundleParametros.id_rol_usuario.rol_usuario"
                                                    validatorExpression="#{RolUsuarioPorRol1.validatorIdRolUsuario1.validate}"/>
                                                <webuijsf:staticText id="campoIdRolUsuario1Texto1"
                                                    binding="#{RolUsuarioPorRol1.campoIdRolUsuario1Texto1}"
                                                    text="#{currentRow.value['id_rol_usuario']}"/>
                                                <webuijsf:message id="messageIdRolUsuario1"
                                                    for="campoIdRolUsuario1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{RolUsuarioPorRol1.tableColumnIdUsuario1}"
                                                    toolTip="BundleParametros.id_usuario.rol_usuario"
                                                    headerText="usuario"
                                                    id="tableColumnIdUsuario1"
                                                    sort="codigo_usuario_1x2y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdUsuario1"
                                                    text="#{currentRow.value['codigo_usuario_1x2y3']}"
                                                    rendered="#{RolUsuarioPorRol1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{RolUsuarioPorRol1.labelIdUsuario1}"
                                                    id="labelIdUsuario1"
                                                    for="campoIdUsuario1"/>
                                                <webuijsf:textField id="campoIdUsuario1"
                                                    binding="#{RolUsuarioPorRol1.campoIdUsuario1}"
                                                    readOnly="#{RolUsuarioPorRol1.gestor.filaNoProcesada}" required="true"
                                                    text="#{RolUsuarioPorRol1.asistente.textoCampoIdUsuario1}"
                                                    toolTip="#{RolUsuarioPorRol1.asistente.toolTipCampoIdUsuario1}"
                                                    validatorExpression="#{RolUsuarioPorRol1.campoIdUsuario1_validate}"/>
                                                <webuijsf:staticText id="campoIdUsuario1Texto1"
                                                    binding="#{RolUsuarioPorRol1.campoIdUsuario1Texto1}"
                                                    text="#{currentRow.value['codigo_usuario_1x2y3']}"/>
                                                <webuijsf:message id="messageIdUsuario1"
                                                    for="campoIdUsuario1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdUsuario3"
                                                    rendered="#{RolUsuarioPorRol1.asistente.tableColumnIdUsuario3Rendered}"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdUsuario3"
                                                    text="#{currentRow.value['id_usuario']}"
                                                    rendered="#{RolUsuarioPorRol1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{RolUsuarioPorRol1.campoIdUsuario1Boton1}"
                                                    id="campoIdUsuario1Boton1"
                                                    onClick="#{RolUsuarioPorRol1.asistente.scriptCampoIdUsuario1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{RolUsuarioPorRol1.campoIdUsuario1Boton3}"
                                                    id="campoIdUsuario1Boton3"
                                                    onClick="#{RolUsuarioPorRol1.asistente.scriptCampoIdUsuario1Boton2}"
                                                    rendered="#{RolUsuarioPorRol1.asistente.campoIdUsuario1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{RolUsuarioPorRol1.tableColumnIdUsuario2}"
                                                    headerText="nombre usuario"
                                                    id="tableColumnIdUsuario2"
                                                    rendered="#{RolUsuarioPorRol1.asistente.campoIdUsuario1Boton2Rendered}"
                                                    sort="nombre_usuario_1x2y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdUsuario2"
                                                    text="#{currentRow.value['nombre_usuario_1x2y4']}"
                                                    rendered="#{RolUsuarioPorRol1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{RolUsuarioPorRol1.labelIdUsuario2}"
                                                    id="labelIdUsuario2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{RolUsuarioPorRol1.campoIdUsuario1Hiper1}"
                                                    id="campoIdUsuario1Hiper1"
                                                    text="#{currentRow.value['nombre_usuario_1x2y4']}"
                                                    onClick="#{RolUsuarioPorRol1.asistente.scriptCampoIdUsuario1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdUsuario1Boton2"
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
                                                        binding="#{RolUsuarioPorRol1.etiquetaTextoFilasPorPagina1}" 
                                                        for="textoFilasPorPagina1"
                                                        id="etiquetaTextoFilasPorPagina1" 
                                                        text="#{RolUsuarioPorRol1.gestor.i18n.textoEtiquetaTextoFilasPorPagina}"/>
                                                </h:panelGrid>
                                                <h:panelGrid 
                                                    columns="3" 
                                                    id="gridPanel107">
                                                    <webuijsf:textField 
                                                        binding="#{RolUsuarioPorRol1.textoFilasPorPagina1}" 
                                                        columns="2"
                                                        converter="#{RolUsuarioPorRol1.textoFilasPorPagina1Converter1}"
                                                        disabled="#{RolUsuarioPorRol1.gestor.paginacionInhabilitada}" 
                                                        id="textoFilasPorPagina1" maxLength="2"
                                                        text="#{RolUsuarioPorRol1.gestor.filasPorPagina}" 
                                                        validatorExpression="#{RolUsuarioPorRol1.textoFilasPorPagina1Validator1.validate}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{RolUsuarioPorRol1.botonRepaginar1_action}"
                                                        binding="#{RolUsuarioPorRol1.botonRepaginar1}" 
                                                        id="botonRepaginar1"
                                                        imageURL="#{RolUsuarioPorRol1.gestor.urlImagenRepaginar}" 
                                                        onClick="#{RolUsuarioPorRol1.gestor.scriptRepaginar}"
                                                        text="#{RolUsuarioPorRol1.gestor.i18n.textoBotonRepaginar}"
                                                        toolTip="#{RolUsuarioPorRol1.gestor.i18n.toolTipBotonRepaginar}"/>
                                                    <webuijsf:message 
                                                        for="textoFilasPorPagina1" 
                                                        id="messageFilasPorPagina1"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="13"
                                                id="gridPanel108">
                                                <webuijsf:button
                                                    actionExpression="#{RolUsuarioPorRol1.botonAgregar1_action}"
                                                    binding="#{RolUsuarioPorRol1.botonAgregar1}"
                                                    disabled="#{RolUsuarioPorRol1.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{RolUsuarioPorRol1.gestor.scriptAgregar}"
                                                    rendered="#{RolUsuarioPorRol1.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{RolUsuarioPorRol1.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{RolUsuarioPorRol1.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{RolUsuarioPorRol1.listaFuncionEdicion1}"
                                                    converter="#{RolUsuarioPorRol1.converterListaFuncionEdicion1}"
                                                    disabled="#{RolUsuarioPorRol1.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{RolUsuarioPorRol1.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{RolUsuarioPorRol1.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{RolUsuarioPorRol1.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{RolUsuarioPorRol1.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{RolUsuarioPorRol1.botonEditar1_action}"
                                                    binding="#{RolUsuarioPorRol1.botonEditar1}"
                                                    disabled="#{RolUsuarioPorRol1.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{RolUsuarioPorRol1.gestor.scriptEditar}"
                                                    rendered="#{RolUsuarioPorRol1.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{RolUsuarioPorRol1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{RolUsuarioPorRol1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{RolUsuarioPorRol1.botonEliminar1_action}"
                                                    binding="#{RolUsuarioPorRol1.botonEliminar1}"
                                                    disabled="#{RolUsuarioPorRol1.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{RolUsuarioPorRol1.gestor.scriptEliminar}"
                                                    rendered="#{RolUsuarioPorRol1.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{RolUsuarioPorRol1.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{RolUsuarioPorRol1.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{RolUsuarioPorRol1.botonAplicar1_action}"
                                                    binding="#{RolUsuarioPorRol1.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{RolUsuarioPorRol1.gestor.scriptAplicar}"
                                                    rendered="#{RolUsuarioPorRol1.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{RolUsuarioPorRol1.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{RolUsuarioPorRol1.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{RolUsuarioPorRol1.botonDeshacer1_action}"
                                                    binding="#{RolUsuarioPorRol1.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{RolUsuarioPorRol1.gestor.scriptDeshacer}"
                                                    rendered="#{RolUsuarioPorRol1.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{RolUsuarioPorRol1.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{RolUsuarioPorRol1.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{RolUsuarioPorRol1.botonConfirmar1_action}"
                                                    binding="#{RolUsuarioPorRol1.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{RolUsuarioPorRol1.gestor.scriptConfirmar}"
                                                    rendered="#{RolUsuarioPorRol1.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{RolUsuarioPorRol1.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{RolUsuarioPorRol1.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{RolUsuarioPorRol1.botonDescartar1_action}"
                                                    binding="#{RolUsuarioPorRol1.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{RolUsuarioPorRol1.gestor.scriptDescartar}"
                                                    rendered="#{RolUsuarioPorRol1.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{RolUsuarioPorRol1.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{RolUsuarioPorRol1.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{RolUsuarioPorRol1.listaFuncionAccion1}"
                                                    converter="#{RolUsuarioPorRol1.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{RolUsuarioPorRol1.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{RolUsuarioPorRol1.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{RolUsuarioPorRol1.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{RolUsuarioPorRol1.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{RolUsuarioPorRol1.botonProcesar1_action}"
                                                    binding="#{RolUsuarioPorRol1.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{RolUsuarioPorRol1.gestor.scriptProcesar}"
                                                    rendered="#{RolUsuarioPorRol1.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{RolUsuarioPorRol1.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{RolUsuarioPorRol1.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{RolUsuarioPorRol1.botonRefrescar1_action}"
                                                    binding="#{RolUsuarioPorRol1.botonRefrescar1}"
                                                    disabled="#{RolUsuarioPorRol1.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{RolUsuarioPorRol1.gestor.scriptRefrescar}"
                                                    rendered="#{RolUsuarioPorRol1.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{RolUsuarioPorRol1.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{RolUsuarioPorRol1.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{RolUsuarioPorRol1.botonReconsultar1_action}"
                                                    binding="#{RolUsuarioPorRol1.botonReconsultar1}"
                                                    disabled="#{RolUsuarioPorRol1.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{RolUsuarioPorRol1.gestor.scriptReconsultar}"
                                                    rendered="#{RolUsuarioPorRol1.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{RolUsuarioPorRol1.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{RolUsuarioPorRol1.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{RolUsuarioPorRol1.botonRetornar1_action}"
                                                    binding="#{RolUsuarioPorRol1.botonRetornar1}"
                                                    disabled="#{RolUsuarioPorRol1.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{RolUsuarioPorRol1.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{RolUsuarioPorRol1.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{RolUsuarioPorRol1.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{RolUsuarioPorRol1.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel109"
                                                rendered="#{RolUsuarioPorRol1.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{RolUsuarioPorRol1.imageHyperlink1_action}"
                                                    binding="#{RolUsuarioPorRol1.imageHyperlink1}"
                                                    disabled="#{RolUsuarioPorRol1.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{RolUsuarioPorRol1.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{RolUsuarioPorRol1.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{RolUsuarioPorRol1.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.RolUsuarioPorRol1_imageHyperlink1_toolTip}"/>
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
