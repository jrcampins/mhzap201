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
                    focus="#{RolFuncionPorRol1.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{RolFuncionPorRol1.gestor.preserveFocus}"
                    preserveScroll="#{RolFuncionPorRol1.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{RolFuncionPorRol1.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | checkbox1 campoIdRolFuncion1 campoIdFuncion1 campoIdConjuntoSegmento1 textoFilasPorPagina1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | textoFilasPorPagina1 | botonRepaginar1 , virtualForm3 | checkbox1 listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonEscogerFila1 botonDetallarFila1 botonProcesarFila1 botonRetornarFila1 botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{RolFuncionPorRol1.breadcrumbs1}" 
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
                                                    rendered="#{RolFuncionPorRol1.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{RolFuncionPorRol1.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{RolFuncionPorRol1.gestor.mensajeDisponible}"
                                                    text="#{RolFuncionPorRol1.gestor.mensaje}"
                                                    url="#{RolFuncionPorRol1.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:table
                                            binding="#{RolFuncionPorRol1.table1}"
                                            clearSortButton="true" 
                                            deselectMultipleButton="true" 
                                            id="table1"
                                            paginateButton="false"
                                            paginationControls="true" 
                                            selectMultipleButton="true" 
                                            sortPanelToggleButton="true"
                                            width="960">
                                            <webuijsf:tableRowGroup 
                                                binding="#{RolFuncionPorRol1.tableRowGroup1}" 
                                                id="tableRowGroup1" 
                                                rows="1"
                                                selected="#{RolFuncionPorRol1.gestor.filaEscogida}" 
                                                sourceData="#{RolFuncionPorRol1.rolFuncionDataProvider}" 
                                                sourceVar="currentRow">
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    id="tableRowGroup1SelectionColumn"
                                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);" 
                                                    selectId="checkbox1">
                                                    <webuijsf:checkbox 
                                                        binding="#{RolFuncionPorRol1.checkbox1}" 
                                                        id="checkbox1"
                                                        onClick="#{RolFuncionPorRol1.gestor.scriptElegir}" 
                                                        selected="#{RolFuncionPorRol1.gestor.filaElegida}" 
                                                        toolTip="#{RolFuncionPorRol1.gestor.i18n.toolTipCheckboxSeleccionMultiple}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    binding="#{RolFuncionPorRol1.tableColumn1}" 
                                                    id="tableColumn1">
                                                    <webuijsf:button 
                                                        actionExpression="#{RolFuncionPorRol1.botonEscogerFila1_action}"
                                                        binding="#{RolFuncionPorRol1.botonEscogerFila1}"
                                                        disabled="#{RolFuncionPorRol1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonEscogerFila1"
                                                        imageURL="#{RolFuncionPorRol1.gestor.urlImagenEscoger}" 
                                                        onClick="#{RolFuncionPorRol1.gestor.scriptEscoger}"
                                                        text="#{RolFuncionPorRol1.gestor.i18n.textoBotonEscogerFila}"
                                                        toolTip="#{RolFuncionPorRol1.gestor.i18n.toolTipBotonEscogerFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{RolFuncionPorRol1.botonDetallarFila1_action}"
                                                        binding="#{RolFuncionPorRol1.botonDetallarFila1}"
                                                        disabled="#{RolFuncionPorRol1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonDetallarFila1"
                                                        imageURL="#{RolFuncionPorRol1.gestor.urlImagenDetallar}" 
                                                        onClick="#{RolFuncionPorRol1.scriptAbrirVentanaVerDetalle}"
                                                        rendered="#{RolFuncionPorRol1.gestor.detalleDisponible}" 
                                                        text="#{RolFuncionPorRol1.gestor.i18n.textoBotonDetallarFila}"
                                                        toolTip="#{RolFuncionPorRol1.gestor.i18n.toolTipBotonDetallarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{RolFuncionPorRol1.botonProcesarFila1_action}"
                                                        binding="#{RolFuncionPorRol1.botonProcesarFila1}"
                                                        disabled="#{RolFuncionPorRol1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonProcesarFila1"
                                                        imageURL="#{RolFuncionPorRol1.gestor.urlImagenProcesar}" 
                                                        onClick="#{RolFuncionPorRol1.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{RolFuncionPorRol1.asistente.comandoDisponible}" 
                                                        text="#{RolFuncionPorRol1.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{RolFuncionPorRol1.gestor.i18n.toolTipBotonProcesarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{RolFuncionPorRol1.botonRetornarFila1_action}"
                                                        binding="#{RolFuncionPorRol1.botonRetornarFila1}" 
                                                        disabled="#{RolFuncionPorRol1.gestor.funcionReturnInhabilitada}"
                                                        id="botonRetornarFila1"
                                                        imageURL="#{RolFuncionPorRol1.gestor.urlImagenRetornar}"
                                                        onClick="#{RolFuncionPorRol1.gestor.scriptRetornarRecursoActual}"
                                                        rendered="#{RolFuncionPorRol1.gestor.funcionReturnVisible}" 
                                                        text="#{RolFuncionPorRol1.gestor.i18n.textoBotonRetornarFila}"
                                                        toolTip="#{RolFuncionPorRol1.gestor.i18n.toolTipBotonRetornarFila}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{RolFuncionPorRol1.tableColumn2}"
                                                    id="tableColumn2"
                                                    rendered="#{RolFuncionPorRol1.gestor.designing}">
                                                    <webuijsf:imageHyperlink
                                                        actionExpression="#{RolFuncionPorRol1.hipervinculoAccionFila1_action}"
                                                        binding="#{RolFuncionPorRol1.hipervinculoAccionFila1}"
                                                        disabled="#{RolFuncionPorRol1.gestor.loteConCambios}"
                                                        id="hipervinculoAccionFila1"
                                                        imageURL="#{RolFuncionPorRol1.gestor.urlImagenEjecutarVinculo}"
                                                        onClick="#{RolFuncionPorRol1.scriptAbrirVentanaAccionFila1}"
                                                        text="Accion1"
                                                        toolTip="#{bundle.RolFuncionPorRol1_hipervinculoAccionFila1_toolTip}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="right" 
                                                    binding="#{RolFuncionPorRol1.tableColumn3}" 
                                                    headerText="#{RolFuncionPorRol1.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{RolFuncionPorRol1.gestor.i18n.toolTipEtiquetaIdentificacionFila}"
                                                    id="tableColumn3">
                                                    <webuijsf:imageHyperlink 
                                                        actionExpression="#{RolFuncionPorRol1.hipervinculoDetallarFila1_action}"
                                                        binding="#{RolFuncionPorRol1.hipervinculoDetallarFila1}" 
                                                        id="hipervinculoDetallarFila1"
                                                        imageURL="#{RolFuncionPorRol1.gestor.urlImagenFilaProcesada}"
                                                        textPosition="left" 
                                                        text="#{RolFuncionPorRol1.gestor.identificacionFila}" 
                                                        toolTip="#{RolFuncionPorRol1.gestor.toolTipImagenFilaProcesada}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{RolFuncionPorRol1.tableColumnIdRolFuncion1}"
                                                    headerText="identificaci&#243;n"
                                                    id="tableColumnIdRolFuncion1" rendered="false"
                                                    sort="id_rol_funcion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdRolFuncion1"
                                                    text="#{currentRow.value['id_rol_funcion']}"
                                                    rendered="#{RolFuncionPorRol1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{RolFuncionPorRol1.labelIdRolFuncion1}"
                                                    id="labelIdRolFuncion1"
                                                    for="campoIdRolFuncion1"/>
                                                <webuijsf:textField id="campoIdRolFuncion1"
                                                    binding="#{RolFuncionPorRol1.campoIdRolFuncion1}"
                                                    converter="#{RolFuncionPorRol1.converterIdRolFuncion1}"
                                                    readOnly="#{RolFuncionPorRol1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['id_rol_funcion']}"
                                                    toolTip="BundleParametros.id_rol_funcion.rol_funcion"
                                                    validatorExpression="#{RolFuncionPorRol1.validatorIdRolFuncion1.validate}"/>
                                                <webuijsf:staticText id="campoIdRolFuncion1Texto1"
                                                    binding="#{RolFuncionPorRol1.campoIdRolFuncion1Texto1}"
                                                    text="#{currentRow.value['id_rol_funcion']}"/>
                                                <webuijsf:message id="messageIdRolFuncion1"
                                                    for="campoIdRolFuncion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{RolFuncionPorRol1.tableColumnIdFuncion1}"
                                                    headerText="funci&#243;n"
                                                    id="tableColumnIdFuncion1"
                                                    sort="codigo_funcion_1x2y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdFuncion1"
                                                    text="#{currentRow.value['codigo_funcion_1x2y3']}"
                                                    rendered="#{RolFuncionPorRol1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{RolFuncionPorRol1.labelIdFuncion1}"
                                                    id="labelIdFuncion1"
                                                    for="campoIdFuncion1"/>
                                                <webuijsf:textField id="campoIdFuncion1"
                                                    binding="#{RolFuncionPorRol1.campoIdFuncion1}"
                                                    readOnly="#{RolFuncionPorRol1.gestor.filaNoProcesada}" required="true"
                                                    text="#{RolFuncionPorRol1.asistente.textoCampoIdFuncion1}"
                                                    toolTip="#{RolFuncionPorRol1.asistente.toolTipCampoIdFuncion1}"
                                                    validatorExpression="#{RolFuncionPorRol1.campoIdFuncion1_validate}"/>
                                                <webuijsf:staticText id="campoIdFuncion1Texto1"
                                                    binding="#{RolFuncionPorRol1.campoIdFuncion1Texto1}"
                                                    text="#{currentRow.value['codigo_funcion_1x2y3']}"/>
                                                <webuijsf:message id="messageIdFuncion1"
                                                    for="campoIdFuncion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdFuncion3"
                                                    rendered="#{RolFuncionPorRol1.asistente.tableColumnIdFuncion3Rendered}"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdFuncion3"
                                                    text="#{currentRow.value['id_funcion']}"
                                                    rendered="#{RolFuncionPorRol1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{RolFuncionPorRol1.campoIdFuncion1Boton1}"
                                                    id="campoIdFuncion1Boton1"
                                                    onClick="#{RolFuncionPorRol1.asistente.scriptCampoIdFuncion1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{RolFuncionPorRol1.campoIdFuncion1Boton3}"
                                                    id="campoIdFuncion1Boton3"
                                                    onClick="#{RolFuncionPorRol1.asistente.scriptCampoIdFuncion1Boton2}"
                                                    rendered="#{RolFuncionPorRol1.asistente.campoIdFuncion1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{RolFuncionPorRol1.tableColumnIdFuncion2}"
                                                    headerText="nombre funci&#243;n"
                                                    id="tableColumnIdFuncion2"
                                                    rendered="#{RolFuncionPorRol1.asistente.campoIdFuncion1Boton2Rendered}"
                                                    sort="nombre_funcion_1x2y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdFuncion2"
                                                    text="#{currentRow.value['nombre_funcion_1x2y4']}"
                                                    rendered="#{RolFuncionPorRol1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{RolFuncionPorRol1.labelIdFuncion2}"
                                                    id="labelIdFuncion2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{RolFuncionPorRol1.campoIdFuncion1Hiper1}"
                                                    id="campoIdFuncion1Hiper1"
                                                    text="#{currentRow.value['nombre_funcion_1x2y4']}"
                                                    onClick="#{RolFuncionPorRol1.asistente.scriptCampoIdFuncion1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdFuncion1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{RolFuncionPorRol1.tableColumnIdConjuntoSegmento1}"
                                                    headerText="conjunto segmento"
                                                    id="tableColumnIdConjuntoSegmento1"
                                                    sort="codigo_conjunto_segmento_1x3y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdConjuntoSegmento1"
                                                    text="#{currentRow.value['codigo_conjunto_segmento_1x3y3']}"
                                                    rendered="#{RolFuncionPorRol1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{RolFuncionPorRol1.labelIdConjuntoSegmento1}"
                                                    id="labelIdConjuntoSegmento1"
                                                    for="campoIdConjuntoSegmento1"/>
                                                <webuijsf:textField id="campoIdConjuntoSegmento1"
                                                    binding="#{RolFuncionPorRol1.campoIdConjuntoSegmento1}"
                                                    readOnly="#{RolFuncionPorRol1.gestor.filaNoProcesada}"
                                                    text="#{RolFuncionPorRol1.asistente.textoCampoIdConjuntoSegmento1}"
                                                    toolTip="#{RolFuncionPorRol1.asistente.toolTipCampoIdConjuntoSegmento1}"
                                                    validatorExpression="#{RolFuncionPorRol1.campoIdConjuntoSegmento1_validate}"/>
                                                <webuijsf:staticText id="campoIdConjuntoSegmento1Texto1"
                                                    binding="#{RolFuncionPorRol1.campoIdConjuntoSegmento1Texto1}"
                                                    text="#{currentRow.value['codigo_conjunto_segmento_1x3y3']}"/>
                                                <webuijsf:message id="messageIdConjuntoSegmento1"
                                                    for="campoIdConjuntoSegmento1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdConjuntoSegmento3"
                                                    rendered="#{RolFuncionPorRol1.asistente.tableColumnIdConjuntoSegmento3Rendered}"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdConjuntoSegmento3"
                                                    text="#{currentRow.value['id_conjunto_segmento']}"
                                                    rendered="#{RolFuncionPorRol1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{RolFuncionPorRol1.campoIdConjuntoSegmento1Boton1}"
                                                    id="campoIdConjuntoSegmento1Boton1"
                                                    onClick="#{RolFuncionPorRol1.asistente.scriptCampoIdConjuntoSegmento1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{RolFuncionPorRol1.campoIdConjuntoSegmento1Boton3}"
                                                    id="campoIdConjuntoSegmento1Boton3"
                                                    onClick="#{RolFuncionPorRol1.asistente.scriptCampoIdConjuntoSegmento1Boton2}"
                                                    rendered="#{RolFuncionPorRol1.asistente.campoIdConjuntoSegmento1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{RolFuncionPorRol1.tableColumnIdConjuntoSegmento2}"
                                                    headerText="nombre conjunto segmento"
                                                    id="tableColumnIdConjuntoSegmento2"
                                                    rendered="#{RolFuncionPorRol1.asistente.campoIdConjuntoSegmento1Boton2Rendered}"
                                                    sort="nombre_conjunto_segmento_1x3y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdConjuntoSegmento2"
                                                    text="#{currentRow.value['nombre_conjunto_segmento_1x3y4']}"
                                                    rendered="#{RolFuncionPorRol1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{RolFuncionPorRol1.labelIdConjuntoSegmento2}"
                                                    id="labelIdConjuntoSegmento2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{RolFuncionPorRol1.campoIdConjuntoSegmento1Hiper1}"
                                                    id="campoIdConjuntoSegmento1Hiper1"
                                                    text="#{currentRow.value['nombre_conjunto_segmento_1x3y4']}"
                                                    onClick="#{RolFuncionPorRol1.asistente.scriptCampoIdConjuntoSegmento1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdConjuntoSegmento1Boton2"
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
                                                        binding="#{RolFuncionPorRol1.etiquetaTextoFilasPorPagina1}" 
                                                        for="textoFilasPorPagina1"
                                                        id="etiquetaTextoFilasPorPagina1" 
                                                        text="#{RolFuncionPorRol1.gestor.i18n.textoEtiquetaTextoFilasPorPagina}"/>
                                                </h:panelGrid>
                                                <h:panelGrid 
                                                    columns="3" 
                                                    id="gridPanel107">
                                                    <webuijsf:textField 
                                                        binding="#{RolFuncionPorRol1.textoFilasPorPagina1}" 
                                                        columns="2"
                                                        converter="#{RolFuncionPorRol1.textoFilasPorPagina1Converter1}"
                                                        disabled="#{RolFuncionPorRol1.gestor.paginacionInhabilitada}" 
                                                        id="textoFilasPorPagina1" maxLength="2"
                                                        text="#{RolFuncionPorRol1.gestor.filasPorPagina}" 
                                                        validatorExpression="#{RolFuncionPorRol1.textoFilasPorPagina1Validator1.validate}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{RolFuncionPorRol1.botonRepaginar1_action}"
                                                        binding="#{RolFuncionPorRol1.botonRepaginar1}" 
                                                        id="botonRepaginar1"
                                                        imageURL="#{RolFuncionPorRol1.gestor.urlImagenRepaginar}" 
                                                        onClick="#{RolFuncionPorRol1.gestor.scriptRepaginar}"
                                                        text="#{RolFuncionPorRol1.gestor.i18n.textoBotonRepaginar}"
                                                        toolTip="#{RolFuncionPorRol1.gestor.i18n.toolTipBotonRepaginar}"/>
                                                    <webuijsf:message 
                                                        for="textoFilasPorPagina1" 
                                                        id="messageFilasPorPagina1"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="13"
                                                id="gridPanel108">
                                                <webuijsf:button
                                                    actionExpression="#{RolFuncionPorRol1.botonAgregar1_action}"
                                                    binding="#{RolFuncionPorRol1.botonAgregar1}"
                                                    disabled="#{RolFuncionPorRol1.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{RolFuncionPorRol1.gestor.scriptAgregar}"
                                                    rendered="#{RolFuncionPorRol1.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{RolFuncionPorRol1.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{RolFuncionPorRol1.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{RolFuncionPorRol1.listaFuncionEdicion1}"
                                                    converter="#{RolFuncionPorRol1.converterListaFuncionEdicion1}"
                                                    disabled="#{RolFuncionPorRol1.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{RolFuncionPorRol1.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{RolFuncionPorRol1.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{RolFuncionPorRol1.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{RolFuncionPorRol1.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{RolFuncionPorRol1.botonEditar1_action}"
                                                    binding="#{RolFuncionPorRol1.botonEditar1}"
                                                    disabled="#{RolFuncionPorRol1.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{RolFuncionPorRol1.gestor.scriptEditar}"
                                                    rendered="#{RolFuncionPorRol1.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{RolFuncionPorRol1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{RolFuncionPorRol1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{RolFuncionPorRol1.botonEliminar1_action}"
                                                    binding="#{RolFuncionPorRol1.botonEliminar1}"
                                                    disabled="#{RolFuncionPorRol1.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{RolFuncionPorRol1.gestor.scriptEliminar}"
                                                    rendered="#{RolFuncionPorRol1.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{RolFuncionPorRol1.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{RolFuncionPorRol1.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{RolFuncionPorRol1.botonAplicar1_action}"
                                                    binding="#{RolFuncionPorRol1.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{RolFuncionPorRol1.gestor.scriptAplicar}"
                                                    rendered="#{RolFuncionPorRol1.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{RolFuncionPorRol1.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{RolFuncionPorRol1.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{RolFuncionPorRol1.botonDeshacer1_action}"
                                                    binding="#{RolFuncionPorRol1.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{RolFuncionPorRol1.gestor.scriptDeshacer}"
                                                    rendered="#{RolFuncionPorRol1.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{RolFuncionPorRol1.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{RolFuncionPorRol1.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{RolFuncionPorRol1.botonConfirmar1_action}"
                                                    binding="#{RolFuncionPorRol1.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{RolFuncionPorRol1.gestor.scriptConfirmar}"
                                                    rendered="#{RolFuncionPorRol1.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{RolFuncionPorRol1.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{RolFuncionPorRol1.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{RolFuncionPorRol1.botonDescartar1_action}"
                                                    binding="#{RolFuncionPorRol1.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{RolFuncionPorRol1.gestor.scriptDescartar}"
                                                    rendered="#{RolFuncionPorRol1.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{RolFuncionPorRol1.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{RolFuncionPorRol1.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{RolFuncionPorRol1.listaFuncionAccion1}"
                                                    converter="#{RolFuncionPorRol1.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{RolFuncionPorRol1.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{RolFuncionPorRol1.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{RolFuncionPorRol1.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{RolFuncionPorRol1.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{RolFuncionPorRol1.botonProcesar1_action}"
                                                    binding="#{RolFuncionPorRol1.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{RolFuncionPorRol1.gestor.scriptProcesar}"
                                                    rendered="#{RolFuncionPorRol1.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{RolFuncionPorRol1.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{RolFuncionPorRol1.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{RolFuncionPorRol1.botonRefrescar1_action}"
                                                    binding="#{RolFuncionPorRol1.botonRefrescar1}"
                                                    disabled="#{RolFuncionPorRol1.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{RolFuncionPorRol1.gestor.scriptRefrescar}"
                                                    rendered="#{RolFuncionPorRol1.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{RolFuncionPorRol1.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{RolFuncionPorRol1.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{RolFuncionPorRol1.botonReconsultar1_action}"
                                                    binding="#{RolFuncionPorRol1.botonReconsultar1}"
                                                    disabled="#{RolFuncionPorRol1.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{RolFuncionPorRol1.gestor.scriptReconsultar}"
                                                    rendered="#{RolFuncionPorRol1.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{RolFuncionPorRol1.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{RolFuncionPorRol1.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{RolFuncionPorRol1.botonRetornar1_action}"
                                                    binding="#{RolFuncionPorRol1.botonRetornar1}"
                                                    disabled="#{RolFuncionPorRol1.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{RolFuncionPorRol1.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{RolFuncionPorRol1.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{RolFuncionPorRol1.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{RolFuncionPorRol1.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel109"
                                                rendered="#{RolFuncionPorRol1.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{RolFuncionPorRol1.imageHyperlink1_action}"
                                                    binding="#{RolFuncionPorRol1.imageHyperlink1}"
                                                    disabled="#{RolFuncionPorRol1.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{RolFuncionPorRol1.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{RolFuncionPorRol1.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{RolFuncionPorRol1.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.RolFuncionPorRol1_imageHyperlink1_toolTip}"/>
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
