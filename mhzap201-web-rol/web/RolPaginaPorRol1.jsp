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
                    focus="#{RolPaginaPorRol1.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{RolPaginaPorRol1.gestor.preserveFocus}"
                    preserveScroll="#{RolPaginaPorRol1.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{RolPaginaPorRol1.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | checkbox1 campoIdRolPagina1 campoIdPagina1 textoFilasPorPagina1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | textoFilasPorPagina1 | botonRepaginar1 , virtualForm3 | checkbox1 listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonEscogerFila1 botonDetallarFila1 botonProcesarFila1 botonRetornarFila1 botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{RolPaginaPorRol1.breadcrumbs1}" 
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
                                                    rendered="#{RolPaginaPorRol1.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{RolPaginaPorRol1.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{RolPaginaPorRol1.gestor.mensajeDisponible}"
                                                    text="#{RolPaginaPorRol1.gestor.mensaje}"
                                                    url="#{RolPaginaPorRol1.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:table
                                            binding="#{RolPaginaPorRol1.table1}"
                                            clearSortButton="true" 
                                            deselectMultipleButton="true" 
                                            id="table1"
                                            paginateButton="false"
                                            paginationControls="true" 
                                            selectMultipleButton="true" 
                                            sortPanelToggleButton="true"
                                            width="960">
                                            <webuijsf:tableRowGroup 
                                                binding="#{RolPaginaPorRol1.tableRowGroup1}" 
                                                id="tableRowGroup1" 
                                                rows="1"
                                                selected="#{RolPaginaPorRol1.gestor.filaEscogida}" 
                                                sourceData="#{RolPaginaPorRol1.rolPaginaDataProvider}" 
                                                sourceVar="currentRow">
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    id="tableRowGroup1SelectionColumn"
                                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);" 
                                                    selectId="checkbox1">
                                                    <webuijsf:checkbox 
                                                        binding="#{RolPaginaPorRol1.checkbox1}" 
                                                        id="checkbox1"
                                                        onClick="#{RolPaginaPorRol1.gestor.scriptElegir}" 
                                                        selected="#{RolPaginaPorRol1.gestor.filaElegida}" 
                                                        toolTip="#{RolPaginaPorRol1.gestor.i18n.toolTipCheckboxSeleccionMultiple}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    binding="#{RolPaginaPorRol1.tableColumn1}" 
                                                    id="tableColumn1">
                                                    <webuijsf:button 
                                                        actionExpression="#{RolPaginaPorRol1.botonEscogerFila1_action}"
                                                        binding="#{RolPaginaPorRol1.botonEscogerFila1}"
                                                        disabled="#{RolPaginaPorRol1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonEscogerFila1"
                                                        imageURL="#{RolPaginaPorRol1.gestor.urlImagenEscoger}" 
                                                        onClick="#{RolPaginaPorRol1.gestor.scriptEscoger}"
                                                        text="#{RolPaginaPorRol1.gestor.i18n.textoBotonEscogerFila}"
                                                        toolTip="#{RolPaginaPorRol1.gestor.i18n.toolTipBotonEscogerFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{RolPaginaPorRol1.botonDetallarFila1_action}"
                                                        binding="#{RolPaginaPorRol1.botonDetallarFila1}"
                                                        disabled="#{RolPaginaPorRol1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonDetallarFila1"
                                                        imageURL="#{RolPaginaPorRol1.gestor.urlImagenDetallar}" 
                                                        onClick="#{RolPaginaPorRol1.scriptAbrirVentanaVerDetalle}"
                                                        rendered="#{RolPaginaPorRol1.gestor.detalleDisponible}" 
                                                        text="#{RolPaginaPorRol1.gestor.i18n.textoBotonDetallarFila}"
                                                        toolTip="#{RolPaginaPorRol1.gestor.i18n.toolTipBotonDetallarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{RolPaginaPorRol1.botonProcesarFila1_action}"
                                                        binding="#{RolPaginaPorRol1.botonProcesarFila1}"
                                                        disabled="#{RolPaginaPorRol1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonProcesarFila1"
                                                        imageURL="#{RolPaginaPorRol1.gestor.urlImagenProcesar}" 
                                                        onClick="#{RolPaginaPorRol1.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{RolPaginaPorRol1.asistente.comandoDisponible}" 
                                                        text="#{RolPaginaPorRol1.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{RolPaginaPorRol1.gestor.i18n.toolTipBotonProcesarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{RolPaginaPorRol1.botonRetornarFila1_action}"
                                                        binding="#{RolPaginaPorRol1.botonRetornarFila1}" 
                                                        disabled="#{RolPaginaPorRol1.gestor.funcionReturnInhabilitada}"
                                                        id="botonRetornarFila1"
                                                        imageURL="#{RolPaginaPorRol1.gestor.urlImagenRetornar}"
                                                        onClick="#{RolPaginaPorRol1.gestor.scriptRetornarRecursoActual}"
                                                        rendered="#{RolPaginaPorRol1.gestor.funcionReturnVisible}" 
                                                        text="#{RolPaginaPorRol1.gestor.i18n.textoBotonRetornarFila}"
                                                        toolTip="#{RolPaginaPorRol1.gestor.i18n.toolTipBotonRetornarFila}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{RolPaginaPorRol1.tableColumn2}"
                                                    id="tableColumn2"
                                                    rendered="#{RolPaginaPorRol1.gestor.designing}">
                                                    <webuijsf:imageHyperlink
                                                        actionExpression="#{RolPaginaPorRol1.hipervinculoAccionFila1_action}"
                                                        binding="#{RolPaginaPorRol1.hipervinculoAccionFila1}"
                                                        disabled="#{RolPaginaPorRol1.gestor.loteConCambios}"
                                                        id="hipervinculoAccionFila1"
                                                        imageURL="#{RolPaginaPorRol1.gestor.urlImagenEjecutarVinculo}"
                                                        onClick="#{RolPaginaPorRol1.scriptAbrirVentanaAccionFila1}"
                                                        text="Accion1"
                                                        toolTip="#{bundle.RolPaginaPorRol1_hipervinculoAccionFila1_toolTip}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="right" 
                                                    binding="#{RolPaginaPorRol1.tableColumn3}" 
                                                    headerText="#{RolPaginaPorRol1.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{RolPaginaPorRol1.gestor.i18n.toolTipEtiquetaIdentificacionFila}"
                                                    id="tableColumn3">
                                                    <webuijsf:imageHyperlink 
                                                        actionExpression="#{RolPaginaPorRol1.hipervinculoDetallarFila1_action}"
                                                        binding="#{RolPaginaPorRol1.hipervinculoDetallarFila1}" 
                                                        id="hipervinculoDetallarFila1"
                                                        imageURL="#{RolPaginaPorRol1.gestor.urlImagenFilaProcesada}"
                                                        textPosition="left" 
                                                        text="#{RolPaginaPorRol1.gestor.identificacionFila}" 
                                                        toolTip="#{RolPaginaPorRol1.gestor.toolTipImagenFilaProcesada}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{RolPaginaPorRol1.tableColumnIdRolPagina1}"
                                                    headerText="identificaci&#243;n"
                                                    id="tableColumnIdRolPagina1" rendered="false"
                                                    sort="id_rol_pagina">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdRolPagina1"
                                                    text="#{currentRow.value['id_rol_pagina']}"
                                                    rendered="#{RolPaginaPorRol1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{RolPaginaPorRol1.labelIdRolPagina1}"
                                                    id="labelIdRolPagina1"
                                                    for="campoIdRolPagina1"/>
                                                <webuijsf:textField id="campoIdRolPagina1"
                                                    binding="#{RolPaginaPorRol1.campoIdRolPagina1}"
                                                    converter="#{RolPaginaPorRol1.converterIdRolPagina1}"
                                                    readOnly="#{RolPaginaPorRol1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['id_rol_pagina']}"
                                                    toolTip="BundleParametros.id_rol_pagina.rol_pagina"
                                                    validatorExpression="#{RolPaginaPorRol1.validatorIdRolPagina1.validate}"/>
                                                <webuijsf:staticText id="campoIdRolPagina1Texto1"
                                                    binding="#{RolPaginaPorRol1.campoIdRolPagina1Texto1}"
                                                    text="#{currentRow.value['id_rol_pagina']}"/>
                                                <webuijsf:message id="messageIdRolPagina1"
                                                    for="campoIdRolPagina1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{RolPaginaPorRol1.tableColumnIdPagina1}"
                                                    headerText="p&#225;gina"
                                                    id="tableColumnIdPagina1"
                                                    sort="codigo_pagina_1x2y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdPagina1"
                                                    text="#{currentRow.value['codigo_pagina_1x2y3']}"
                                                    rendered="#{RolPaginaPorRol1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{RolPaginaPorRol1.labelIdPagina1}"
                                                    id="labelIdPagina1"
                                                    for="campoIdPagina1"/>
                                                <webuijsf:textField id="campoIdPagina1"
                                                    binding="#{RolPaginaPorRol1.campoIdPagina1}"
                                                    readOnly="#{RolPaginaPorRol1.gestor.filaNoProcesada}" required="true"
                                                    text="#{RolPaginaPorRol1.asistente.textoCampoIdPagina1}"
                                                    toolTip="#{RolPaginaPorRol1.asistente.toolTipCampoIdPagina1}"
                                                    validatorExpression="#{RolPaginaPorRol1.campoIdPagina1_validate}"/>
                                                <webuijsf:staticText id="campoIdPagina1Texto1"
                                                    binding="#{RolPaginaPorRol1.campoIdPagina1Texto1}"
                                                    text="#{currentRow.value['codigo_pagina_1x2y3']}"/>
                                                <webuijsf:message id="messageIdPagina1"
                                                    for="campoIdPagina1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdPagina3"
                                                    rendered="#{RolPaginaPorRol1.asistente.tableColumnIdPagina3Rendered}"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdPagina3"
                                                    text="#{currentRow.value['id_pagina']}"
                                                    rendered="#{RolPaginaPorRol1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{RolPaginaPorRol1.campoIdPagina1Boton1}"
                                                    id="campoIdPagina1Boton1"
                                                    onClick="#{RolPaginaPorRol1.asistente.scriptCampoIdPagina1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{RolPaginaPorRol1.campoIdPagina1Boton3}"
                                                    id="campoIdPagina1Boton3"
                                                    onClick="#{RolPaginaPorRol1.asistente.scriptCampoIdPagina1Boton2}"
                                                    rendered="#{RolPaginaPorRol1.asistente.campoIdPagina1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{RolPaginaPorRol1.tableColumnIdPagina2}"
                                                    headerText="nombre p&#225;gina"
                                                    id="tableColumnIdPagina2"
                                                    rendered="#{RolPaginaPorRol1.asistente.campoIdPagina1Boton2Rendered}"
                                                    sort="nombre_pagina_1x2y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdPagina2"
                                                    text="#{currentRow.value['nombre_pagina_1x2y4']}"
                                                    rendered="#{RolPaginaPorRol1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{RolPaginaPorRol1.labelIdPagina2}"
                                                    id="labelIdPagina2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{RolPaginaPorRol1.campoIdPagina1Hiper1}"
                                                    id="campoIdPagina1Hiper1"
                                                    text="#{currentRow.value['nombre_pagina_1x2y4']}"
                                                    onClick="#{RolPaginaPorRol1.asistente.scriptCampoIdPagina1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdPagina1Boton2"
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
                                                        binding="#{RolPaginaPorRol1.etiquetaTextoFilasPorPagina1}" 
                                                        for="textoFilasPorPagina1"
                                                        id="etiquetaTextoFilasPorPagina1" 
                                                        text="#{RolPaginaPorRol1.gestor.i18n.textoEtiquetaTextoFilasPorPagina}"/>
                                                </h:panelGrid>
                                                <h:panelGrid 
                                                    columns="3" 
                                                    id="gridPanel107">
                                                    <webuijsf:textField 
                                                        binding="#{RolPaginaPorRol1.textoFilasPorPagina1}" 
                                                        columns="2"
                                                        converter="#{RolPaginaPorRol1.textoFilasPorPagina1Converter1}"
                                                        disabled="#{RolPaginaPorRol1.gestor.paginacionInhabilitada}" 
                                                        id="textoFilasPorPagina1" maxLength="2"
                                                        text="#{RolPaginaPorRol1.gestor.filasPorPagina}" 
                                                        validatorExpression="#{RolPaginaPorRol1.textoFilasPorPagina1Validator1.validate}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{RolPaginaPorRol1.botonRepaginar1_action}"
                                                        binding="#{RolPaginaPorRol1.botonRepaginar1}" 
                                                        id="botonRepaginar1"
                                                        imageURL="#{RolPaginaPorRol1.gestor.urlImagenRepaginar}" 
                                                        onClick="#{RolPaginaPorRol1.gestor.scriptRepaginar}"
                                                        text="#{RolPaginaPorRol1.gestor.i18n.textoBotonRepaginar}"
                                                        toolTip="#{RolPaginaPorRol1.gestor.i18n.toolTipBotonRepaginar}"/>
                                                    <webuijsf:message 
                                                        for="textoFilasPorPagina1" 
                                                        id="messageFilasPorPagina1"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="13"
                                                id="gridPanel108">
                                                <webuijsf:button
                                                    actionExpression="#{RolPaginaPorRol1.botonAgregar1_action}"
                                                    binding="#{RolPaginaPorRol1.botonAgregar1}"
                                                    disabled="#{RolPaginaPorRol1.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{RolPaginaPorRol1.gestor.scriptAgregar}"
                                                    rendered="#{RolPaginaPorRol1.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{RolPaginaPorRol1.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{RolPaginaPorRol1.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{RolPaginaPorRol1.listaFuncionEdicion1}"
                                                    converter="#{RolPaginaPorRol1.converterListaFuncionEdicion1}"
                                                    disabled="#{RolPaginaPorRol1.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{RolPaginaPorRol1.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{RolPaginaPorRol1.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{RolPaginaPorRol1.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{RolPaginaPorRol1.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{RolPaginaPorRol1.botonEditar1_action}"
                                                    binding="#{RolPaginaPorRol1.botonEditar1}"
                                                    disabled="#{RolPaginaPorRol1.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{RolPaginaPorRol1.gestor.scriptEditar}"
                                                    rendered="#{RolPaginaPorRol1.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{RolPaginaPorRol1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{RolPaginaPorRol1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{RolPaginaPorRol1.botonEliminar1_action}"
                                                    binding="#{RolPaginaPorRol1.botonEliminar1}"
                                                    disabled="#{RolPaginaPorRol1.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{RolPaginaPorRol1.gestor.scriptEliminar}"
                                                    rendered="#{RolPaginaPorRol1.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{RolPaginaPorRol1.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{RolPaginaPorRol1.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{RolPaginaPorRol1.botonAplicar1_action}"
                                                    binding="#{RolPaginaPorRol1.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{RolPaginaPorRol1.gestor.scriptAplicar}"
                                                    rendered="#{RolPaginaPorRol1.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{RolPaginaPorRol1.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{RolPaginaPorRol1.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{RolPaginaPorRol1.botonDeshacer1_action}"
                                                    binding="#{RolPaginaPorRol1.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{RolPaginaPorRol1.gestor.scriptDeshacer}"
                                                    rendered="#{RolPaginaPorRol1.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{RolPaginaPorRol1.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{RolPaginaPorRol1.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{RolPaginaPorRol1.botonConfirmar1_action}"
                                                    binding="#{RolPaginaPorRol1.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{RolPaginaPorRol1.gestor.scriptConfirmar}"
                                                    rendered="#{RolPaginaPorRol1.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{RolPaginaPorRol1.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{RolPaginaPorRol1.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{RolPaginaPorRol1.botonDescartar1_action}"
                                                    binding="#{RolPaginaPorRol1.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{RolPaginaPorRol1.gestor.scriptDescartar}"
                                                    rendered="#{RolPaginaPorRol1.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{RolPaginaPorRol1.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{RolPaginaPorRol1.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{RolPaginaPorRol1.listaFuncionAccion1}"
                                                    converter="#{RolPaginaPorRol1.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{RolPaginaPorRol1.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{RolPaginaPorRol1.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{RolPaginaPorRol1.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{RolPaginaPorRol1.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{RolPaginaPorRol1.botonProcesar1_action}"
                                                    binding="#{RolPaginaPorRol1.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{RolPaginaPorRol1.gestor.scriptProcesar}"
                                                    rendered="#{RolPaginaPorRol1.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{RolPaginaPorRol1.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{RolPaginaPorRol1.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{RolPaginaPorRol1.botonRefrescar1_action}"
                                                    binding="#{RolPaginaPorRol1.botonRefrescar1}"
                                                    disabled="#{RolPaginaPorRol1.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{RolPaginaPorRol1.gestor.scriptRefrescar}"
                                                    rendered="#{RolPaginaPorRol1.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{RolPaginaPorRol1.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{RolPaginaPorRol1.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{RolPaginaPorRol1.botonReconsultar1_action}"
                                                    binding="#{RolPaginaPorRol1.botonReconsultar1}"
                                                    disabled="#{RolPaginaPorRol1.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{RolPaginaPorRol1.gestor.scriptReconsultar}"
                                                    rendered="#{RolPaginaPorRol1.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{RolPaginaPorRol1.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{RolPaginaPorRol1.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{RolPaginaPorRol1.botonRetornar1_action}"
                                                    binding="#{RolPaginaPorRol1.botonRetornar1}"
                                                    disabled="#{RolPaginaPorRol1.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{RolPaginaPorRol1.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{RolPaginaPorRol1.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{RolPaginaPorRol1.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{RolPaginaPorRol1.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel109"
                                                rendered="#{RolPaginaPorRol1.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{RolPaginaPorRol1.imageHyperlink1_action}"
                                                    binding="#{RolPaginaPorRol1.imageHyperlink1}"
                                                    disabled="#{RolPaginaPorRol1.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{RolPaginaPorRol1.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{RolPaginaPorRol1.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{RolPaginaPorRol1.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.RolPaginaPorRol1_imageHyperlink1_toolTip}"/>
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
