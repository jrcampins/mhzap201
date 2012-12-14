<?xml version="1.0" encoding="UTF-8"?>
<!--
   Copyright (C) 2009, EGT Consultores, C.A.
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
                    focus="#{Ubicacion5.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{Ubicacion5.gestor.preserveFocus}"
                    preserveScroll="#{Ubicacion5.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{Ubicacion5.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | checkbox1 campoIdUbicacion1 campoCodigoUbicacion1 campoNombreUbicacion1 campoIdUbicacionSuperior1 listaNumeroTipoNodo1 listaNumeroNivelUbicacion1 campoSecuenciaUbicacion1 campoClaveUbicacion1 listaNumeroTipoArea1 textoFilasPorPagina1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | textoFilasPorPagina1 | botonRepaginar1 , virtualForm3 | checkbox1 listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonEscogerFila1 botonDetallarFila1 botonProcesarFila1 botonRetornarFila1 botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{Ubicacion5.breadcrumbs1}" 
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
                                                    rendered="#{Ubicacion5.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{Ubicacion5.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{Ubicacion5.gestor.mensajeDisponible}"
                                                    text="#{Ubicacion5.gestor.mensaje}"
                                                    url="#{Ubicacion5.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:table
                                            binding="#{Ubicacion5.table1}"
                                            clearSortButton="true" 
                                            deselectMultipleButton="true" 
                                            id="table1"
                                            paginateButton="false"
                                            paginationControls="true" 
                                            selectMultipleButton="true" 
                                            sortPanelToggleButton="true"
                                            width="960">
                                            <webuijsf:tableRowGroup 
                                                binding="#{Ubicacion5.tableRowGroup1}" 
                                                id="tableRowGroup1" 
                                                rows="1"
                                                selected="#{Ubicacion5.gestor.filaEscogida}" 
                                                sourceData="#{Ubicacion5.ubicacionDataProvider}" 
                                                sourceVar="currentRow">
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    id="tableRowGroup1SelectionColumn"
                                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);" 
                                                    selectId="checkbox1">
                                                    <webuijsf:checkbox 
                                                        binding="#{Ubicacion5.checkbox1}" 
                                                        id="checkbox1"
                                                        onClick="#{Ubicacion5.gestor.scriptElegir}" 
                                                        selected="#{Ubicacion5.gestor.filaElegida}" 
                                                        toolTip="#{Ubicacion5.gestor.i18n.toolTipCheckboxSeleccionMultiple}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    binding="#{Ubicacion5.tableColumn1}" 
                                                    id="tableColumn1">
                                                    <webuijsf:button 
                                                        actionExpression="#{Ubicacion5.botonEscogerFila1_action}"
                                                        binding="#{Ubicacion5.botonEscogerFila1}"
                                                        disabled="#{Ubicacion5.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonEscogerFila1"
                                                        imageURL="#{Ubicacion5.gestor.urlImagenEscoger}" 
                                                        onClick="#{Ubicacion5.gestor.scriptEscoger}"
                                                        text="#{Ubicacion5.gestor.i18n.textoBotonEscogerFila}"
                                                        toolTip="#{Ubicacion5.gestor.i18n.toolTipBotonEscogerFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{Ubicacion5.botonDetallarFila1_action}"
                                                        binding="#{Ubicacion5.botonDetallarFila1}"
                                                        disabled="#{Ubicacion5.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonDetallarFila1"
                                                        imageURL="#{Ubicacion5.gestor.urlImagenDetallar}" 
                                                        onClick="#{Ubicacion5.scriptAbrirVentanaVerDetalle}"
                                                        rendered="#{Ubicacion5.gestor.detalleDisponible}" 
                                                        text="#{Ubicacion5.gestor.i18n.textoBotonDetallarFila}"
                                                        toolTip="#{Ubicacion5.gestor.i18n.toolTipBotonDetallarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{Ubicacion5.botonProcesarFila1_action}"
                                                        binding="#{Ubicacion5.botonProcesarFila1}"
                                                        disabled="#{Ubicacion5.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonProcesarFila1"
                                                        imageURL="#{Ubicacion5.gestor.urlImagenProcesar}" 
                                                        onClick="#{Ubicacion5.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{Ubicacion5.asistente.comandoDisponible}" 
                                                        text="#{Ubicacion5.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{Ubicacion5.gestor.i18n.toolTipBotonProcesarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{Ubicacion5.botonRetornarFila1_action}"
                                                        binding="#{Ubicacion5.botonRetornarFila1}" 
                                                        disabled="#{Ubicacion5.gestor.funcionReturnInhabilitada}"
                                                        id="botonRetornarFila1"
                                                        imageURL="#{Ubicacion5.gestor.urlImagenRetornar}"
                                                        onClick="#{Ubicacion5.gestor.scriptRetornarRecursoActual}"
                                                        rendered="#{Ubicacion5.gestor.funcionReturnVisible}" 
                                                        text="#{Ubicacion5.gestor.i18n.textoBotonRetornarFila}"
                                                        toolTip="#{Ubicacion5.gestor.i18n.toolTipBotonRetornarFila}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Ubicacion5.tableColumn2}"
                                                    id="tableColumn2"
                                                    rendered="#{Ubicacion5.gestor.designing}">
                                                    <webuijsf:imageHyperlink
                                                        actionExpression="#{Ubicacion5.hipervinculoAccionFila1_action}"
                                                        binding="#{Ubicacion5.hipervinculoAccionFila1}"
                                                        disabled="#{Ubicacion5.gestor.loteConCambios}"
                                                        id="hipervinculoAccionFila1"
                                                        imageURL="#{Ubicacion5.gestor.urlImagenEjecutarVinculo}"
                                                        onClick="#{Ubicacion5.scriptAbrirVentanaAccionFila1}"
                                                        text="Accion1"
                                                        toolTip="#{bundle.Ubicacion5_hipervinculoAccionFila1_toolTip}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="right" 
                                                    binding="#{Ubicacion5.tableColumn3}" 
                                                    headerText="#{Ubicacion5.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{Ubicacion5.gestor.i18n.toolTipEtiquetaIdentificacionFila}"
                                                    id="tableColumn3">
                                                    <webuijsf:imageHyperlink 
                                                        actionExpression="#{Ubicacion5.hipervinculoDetallarFila1_action}"
                                                        binding="#{Ubicacion5.hipervinculoDetallarFila1}" 
                                                        id="hipervinculoDetallarFila1"
                                                        imageURL="#{Ubicacion5.gestor.urlImagenFilaProcesada}"
                                                        textPosition="left" 
                                                        text="#{Ubicacion5.gestor.identificacionFila}" 
                                                        toolTip="#{Ubicacion5.gestor.toolTipImagenFilaProcesada}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Ubicacion5.tableColumnIdUbicacion1}"
                                                    headerText="identificaci&#243;n"
                                                    id="tableColumnIdUbicacion1" rendered="false"
                                                    sort="id_ubicacion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdUbicacion1"
                                                    text="#{currentRow.value['id_ubicacion']}"
                                                    rendered="#{Ubicacion5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Ubicacion5.labelIdUbicacion1}"
                                                    id="labelIdUbicacion1"
                                                    for="campoIdUbicacion1"/>
                                                <webuijsf:textField id="campoIdUbicacion1"
                                                    binding="#{Ubicacion5.campoIdUbicacion1}"
                                                    converter="#{Ubicacion5.converterIdUbicacion1}"
                                                    readOnly="#{Ubicacion5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['id_ubicacion']}"
                                                    toolTip="BundleParametros.id_ubicacion.ubicacion"
                                                    validatorExpression="#{Ubicacion5.validatorIdUbicacion1.validate}"/>
                                                <webuijsf:staticText id="campoIdUbicacion1Texto1"
                                                    binding="#{Ubicacion5.campoIdUbicacion1Texto1}"
                                                    text="#{currentRow.value['id_ubicacion']}"/>
                                                <webuijsf:message id="messageIdUbicacion1"
                                                    for="campoIdUbicacion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Ubicacion5.tableColumnCodigoUbicacion1}"
                                                    headerText="c&#243;digo"
                                                    id="tableColumnCodigoUbicacion1"
                                                    sort="codigo_ubicacion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextCodigoUbicacion1"
                                                    text="#{currentRow.value['codigo_ubicacion']}"
                                                    rendered="#{Ubicacion5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Ubicacion5.labelCodigoUbicacion1}"
                                                    id="labelCodigoUbicacion1"
                                                    for="campoCodigoUbicacion1"/>
                                                <webuijsf:textField id="campoCodigoUbicacion1"
                                                    binding="#{Ubicacion5.campoCodigoUbicacion1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{Ubicacion5.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['codigo_ubicacion']}"
                                                    toolTip="BundleParametros.codigo_ubicacion.ubicacion"
                                                    validatorExpression="#{Ubicacion5.validatorCodigoUbicacion1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoUbicacion1Texto1"
                                                    binding="#{Ubicacion5.campoCodigoUbicacion1Texto1}"
                                                    text="#{currentRow.value['codigo_ubicacion']}"/>
                                                <webuijsf:message id="messageCodigoUbicacion1"
                                                    for="campoCodigoUbicacion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Ubicacion5.tableColumnNombreUbicacion1}"
                                                    headerText="nombre"
                                                    id="tableColumnNombreUbicacion1"
                                                    sort="nombre_ubicacion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNombreUbicacion1"
                                                    text="#{currentRow.value['nombre_ubicacion']}"
                                                    rendered="#{Ubicacion5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Ubicacion5.labelNombreUbicacion1}"
                                                    id="labelNombreUbicacion1"
                                                    for="campoNombreUbicacion1"/>
                                                <webuijsf:textField id="campoNombreUbicacion1"
                                                    binding="#{Ubicacion5.campoNombreUbicacion1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{Ubicacion5.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['nombre_ubicacion']}"
                                                    toolTip="BundleParametros.nombre_ubicacion.ubicacion"
                                                    validatorExpression="#{Ubicacion5.validatorNombreUbicacion1.validate}"/>
                                                <webuijsf:staticText id="campoNombreUbicacion1Texto1"
                                                    binding="#{Ubicacion5.campoNombreUbicacion1Texto1}"
                                                    text="#{currentRow.value['nombre_ubicacion']}"/>
                                                <webuijsf:message id="messageNombreUbicacion1"
                                                    for="campoNombreUbicacion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Ubicacion5.tableColumnIdUbicacionSuperior1}"
                                                    headerText="ubicaci&#243;n superior"
                                                    id="tableColumnIdUbicacionSuperior1" rendered="false"
                                                    sort="codigo_ubicacion_1x1y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdUbicacionSuperior1"
                                                    text="#{currentRow.value['codigo_ubicacion_1x1y3']}"
                                                    rendered="#{Ubicacion5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Ubicacion5.labelIdUbicacionSuperior1}"
                                                    id="labelIdUbicacionSuperior1"
                                                    for="campoIdUbicacionSuperior1"/>
                                                <webuijsf:textField id="campoIdUbicacionSuperior1"
                                                    binding="#{Ubicacion5.campoIdUbicacionSuperior1}"
                                                    readOnly="#{Ubicacion5.gestor.filaNoProcesada}"
                                                    text="#{Ubicacion5.asistente.textoCampoIdUbicacionSuperior1}"
                                                    toolTip="#{Ubicacion5.asistente.toolTipCampoIdUbicacionSuperior1}"
                                                    validatorExpression="#{Ubicacion5.campoIdUbicacionSuperior1_validate}"/>
                                                <webuijsf:staticText id="campoIdUbicacionSuperior1Texto1"
                                                    binding="#{Ubicacion5.campoIdUbicacionSuperior1Texto1}"
                                                    text="#{currentRow.value['codigo_ubicacion_1x1y3']}"/>
                                                <webuijsf:message id="messageIdUbicacionSuperior1"
                                                    for="campoIdUbicacionSuperior1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdUbicacionSuperior3" rendered="false"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdUbicacionSuperior3"
                                                    text="#{currentRow.value['id_ubicacion_superior']}"
                                                    rendered="#{Ubicacion5.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{Ubicacion5.campoIdUbicacionSuperior1Boton1}"
                                                    id="campoIdUbicacionSuperior1Boton1"
                                                    onClick="#{Ubicacion5.asistente.scriptCampoIdUbicacionSuperior1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{Ubicacion5.campoIdUbicacionSuperior1Boton3}"
                                                    id="campoIdUbicacionSuperior1Boton3"
                                                    onClick="#{Ubicacion5.asistente.scriptCampoIdUbicacionSuperior1Boton2}"
                                                    rendered="#{Ubicacion5.asistente.campoIdUbicacionSuperior1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{Ubicacion5.tableColumnIdUbicacionSuperior2}"
                                                    headerText="nombre ubicaci&#243;n superior"
                                                    id="tableColumnIdUbicacionSuperior2" rendered="false"
                                                    sort="nombre_ubicacion_1x1y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdUbicacionSuperior2"
                                                    text="#{currentRow.value['nombre_ubicacion_1x1y4']}"
                                                    rendered="#{Ubicacion5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Ubicacion5.labelIdUbicacionSuperior2}"
                                                    id="labelIdUbicacionSuperior2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{Ubicacion5.campoIdUbicacionSuperior1Hiper1}"
                                                    id="campoIdUbicacionSuperior1Hiper1"
                                                    text="#{currentRow.value['nombre_ubicacion_1x1y4']}"
                                                    onClick="#{Ubicacion5.asistente.scriptCampoIdUbicacionSuperior1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdUbicacionSuperior1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Ubicacion5.tableColumnNumeroTipoNodo1}"
                                                    headerText="tipo nodo"
                                                    id="tableColumnNumeroTipoNodo1" rendered="false"
                                                    sort="codigo_tipo_nodo_1x2y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroTipoNodo1"
                                                    text="#{currentRow.value['codigo_tipo_nodo_1x2y2']}"
                                                    rendered="#{Ubicacion5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Ubicacion5.labelNumeroTipoNodo1}"
                                                    id="labelNumeroTipoNodo1"
                                                    for="listaNumeroTipoNodo1"/>
                                                <webuijsf:dropDown id="listaNumeroTipoNodo1"
                                                    binding="#{Ubicacion5.listaNumeroTipoNodo1}"
                                                    converter="#{Ubicacion5.converterNumeroTipoNodo1}"
                                                    disabled="#{Ubicacion5.gestor.filaNoProcesada}"
                                                    items="#{Ubicacion5.asistente.opcionesListaNumeroTipoNodo1}"
                                                    selected="#{currentRow.value['numero_tipo_nodo']}"
                                                    toolTip="BundleParametros.numero_tipo_nodo.ubicacion"/>
                                                <webuijsf:staticText id="listaNumeroTipoNodo1Texto1"
                                                    binding="#{Ubicacion5.listaNumeroTipoNodo1Texto1}"
                                                    text="#{currentRow.value['codigo_tipo_nodo_1x2y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoNodo1"
                                                    for="listaNumeroTipoNodo1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Ubicacion5.tableColumnNumeroNivelUbicacion1}"
                                                    headerText="nivel"
                                                    id="tableColumnNumeroNivelUbicacion1" rendered="false"
                                                    sort="codigo_nivel_ubicacion_1x3y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroNivelUbicacion1"
                                                    text="#{currentRow.value['codigo_nivel_ubicacion_1x3y2']}"
                                                    rendered="#{Ubicacion5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Ubicacion5.labelNumeroNivelUbicacion1}"
                                                    id="labelNumeroNivelUbicacion1"
                                                    for="listaNumeroNivelUbicacion1"/>
                                                <webuijsf:dropDown id="listaNumeroNivelUbicacion1"
                                                    binding="#{Ubicacion5.listaNumeroNivelUbicacion1}"
                                                    converter="#{Ubicacion5.converterNumeroNivelUbicacion1}"
                                                    disabled="#{Ubicacion5.gestor.filaNoProcesada}"
                                                    items="#{Ubicacion5.asistente.opcionesListaNumeroNivelUbicacion1}"
                                                    selected="#{currentRow.value['numero_nivel_ubicacion']}"
                                                    toolTip="BundleParametros.numero_nivel_ubicacion.ubicacion"/>
                                                <webuijsf:staticText id="listaNumeroNivelUbicacion1Texto1"
                                                    binding="#{Ubicacion5.listaNumeroNivelUbicacion1Texto1}"
                                                    text="#{currentRow.value['codigo_nivel_ubicacion_1x3y2']}"/>
                                                <webuijsf:message id="messageNumeroNivelUbicacion1"
                                                    for="listaNumeroNivelUbicacion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Ubicacion5.tableColumnSecuenciaUbicacion1}"
                                                    headerText="secuencia"
                                                    id="tableColumnSecuenciaUbicacion1" rendered="false"
                                                    sort="secuencia_ubicacion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextSecuenciaUbicacion1"
                                                    text="#{currentRow.value['secuencia_ubicacion']}"
                                                    rendered="#{Ubicacion5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Ubicacion5.labelSecuenciaUbicacion1}"
                                                    id="labelSecuenciaUbicacion1"
                                                    for="campoSecuenciaUbicacion1"/>
                                                <webuijsf:textField id="campoSecuenciaUbicacion1"
                                                    binding="#{Ubicacion5.campoSecuenciaUbicacion1}"
                                                    converter="#{Ubicacion5.converterSecuenciaUbicacion1}"
                                                    readOnly="#{Ubicacion5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['secuencia_ubicacion']}"
                                                    toolTip="BundleParametros.secuencia_ubicacion.ubicacion"
                                                    validatorExpression="#{Ubicacion5.validatorSecuenciaUbicacion1.validate}"/>
                                                <webuijsf:staticText id="campoSecuenciaUbicacion1Texto1"
                                                    binding="#{Ubicacion5.campoSecuenciaUbicacion1Texto1}"
                                                    text="#{currentRow.value['secuencia_ubicacion']}"/>
                                                <webuijsf:message id="messageSecuenciaUbicacion1"
                                                    for="campoSecuenciaUbicacion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Ubicacion5.tableColumnClaveUbicacion1}"
                                                    headerText="clave"
                                                    id="tableColumnClaveUbicacion1" rendered="false"
                                                    sort="clave_ubicacion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextClaveUbicacion1"
                                                    text="#{currentRow.value['clave_ubicacion']}"
                                                    rendered="#{Ubicacion5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Ubicacion5.labelClaveUbicacion1}"
                                                    id="labelClaveUbicacion1"
                                                    for="campoClaveUbicacion1"/>
                                                <webuijsf:textField id="campoClaveUbicacion1"
                                                    binding="#{Ubicacion5.campoClaveUbicacion1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{Ubicacion5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['clave_ubicacion']}"
                                                    toolTip="BundleParametros.clave_ubicacion.ubicacion"
                                                    validatorExpression="#{Ubicacion5.validatorClaveUbicacion1.validate}"/>
                                                <webuijsf:staticText id="campoClaveUbicacion1Texto1"
                                                    binding="#{Ubicacion5.campoClaveUbicacion1Texto1}"
                                                    text="#{currentRow.value['clave_ubicacion']}"/>
                                                <webuijsf:message id="messageClaveUbicacion1"
                                                    for="campoClaveUbicacion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Ubicacion5.tableColumnNumeroTipoArea1}"
                                                    headerText="tipo area"
                                                    id="tableColumnNumeroTipoArea1" rendered="false"
                                                    sort="codigo_tipo_area_1x4y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroTipoArea1"
                                                    text="#{currentRow.value['codigo_tipo_area_1x4y2']}"
                                                    rendered="#{Ubicacion5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Ubicacion5.labelNumeroTipoArea1}"
                                                    id="labelNumeroTipoArea1"
                                                    for="listaNumeroTipoArea1"/>
                                                <webuijsf:dropDown id="listaNumeroTipoArea1"
                                                    binding="#{Ubicacion5.listaNumeroTipoArea1}"
                                                    converter="#{Ubicacion5.converterNumeroTipoArea1}"
                                                    disabled="#{Ubicacion5.gestor.filaNoProcesada}"
                                                    items="#{Ubicacion5.asistente.opcionesListaNumeroTipoArea1}"
                                                    selected="#{currentRow.value['numero_tipo_area']}"
                                                    toolTip="BundleParametros.numero_tipo_area.ubicacion"/>
                                                <webuijsf:staticText id="listaNumeroTipoArea1Texto1"
                                                    binding="#{Ubicacion5.listaNumeroTipoArea1Texto1}"
                                                    text="#{currentRow.value['codigo_tipo_area_1x4y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoArea1"
                                                    for="listaNumeroTipoArea1"/>
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
                                                        binding="#{Ubicacion5.etiquetaTextoFilasPorPagina1}" 
                                                        for="textoFilasPorPagina1"
                                                        id="etiquetaTextoFilasPorPagina1" 
                                                        text="#{Ubicacion5.gestor.i18n.textoEtiquetaTextoFilasPorPagina}"/>
                                                </h:panelGrid>
                                                <h:panelGrid 
                                                    columns="3" 
                                                    id="gridPanel107">
                                                    <webuijsf:textField 
                                                        binding="#{Ubicacion5.textoFilasPorPagina1}" 
                                                        columns="2"
                                                        converter="#{Ubicacion5.textoFilasPorPagina1Converter1}"
                                                        disabled="#{Ubicacion5.gestor.paginacionInhabilitada}" 
                                                        id="textoFilasPorPagina1" maxLength="2"
                                                        text="#{Ubicacion5.gestor.filasPorPagina}" 
                                                        validatorExpression="#{Ubicacion5.textoFilasPorPagina1Validator1.validate}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{Ubicacion5.botonRepaginar1_action}"
                                                        binding="#{Ubicacion5.botonRepaginar1}" 
                                                        id="botonRepaginar1"
                                                        imageURL="#{Ubicacion5.gestor.urlImagenRepaginar}" 
                                                        onClick="#{Ubicacion5.gestor.scriptRepaginar}"
                                                        text="#{Ubicacion5.gestor.i18n.textoBotonRepaginar}"
                                                        toolTip="#{Ubicacion5.gestor.i18n.toolTipBotonRepaginar}"/>
                                                    <webuijsf:message 
                                                        for="textoFilasPorPagina1" 
                                                        id="messageFilasPorPagina1"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="13"
                                                id="gridPanel108">
                                                <webuijsf:button
                                                    actionExpression="#{Ubicacion5.botonAgregar1_action}"
                                                    binding="#{Ubicacion5.botonAgregar1}"
                                                    disabled="#{Ubicacion5.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{Ubicacion5.gestor.scriptAgregar}"
                                                    rendered="#{Ubicacion5.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Ubicacion5.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{Ubicacion5.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{Ubicacion5.listaFuncionEdicion1}"
                                                    converter="#{Ubicacion5.converterListaFuncionEdicion1}"
                                                    disabled="#{Ubicacion5.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{Ubicacion5.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{Ubicacion5.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{Ubicacion5.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{Ubicacion5.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Ubicacion5.botonEditar1_action}"
                                                    binding="#{Ubicacion5.botonEditar1}"
                                                    disabled="#{Ubicacion5.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{Ubicacion5.gestor.scriptEditar}"
                                                    rendered="#{Ubicacion5.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Ubicacion5.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{Ubicacion5.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Ubicacion5.botonEliminar1_action}"
                                                    binding="#{Ubicacion5.botonEliminar1}"
                                                    disabled="#{Ubicacion5.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{Ubicacion5.gestor.scriptEliminar}"
                                                    rendered="#{Ubicacion5.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Ubicacion5.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{Ubicacion5.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Ubicacion5.botonAplicar1_action}"
                                                    binding="#{Ubicacion5.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{Ubicacion5.gestor.scriptAplicar}"
                                                    rendered="#{Ubicacion5.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Ubicacion5.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{Ubicacion5.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Ubicacion5.botonDeshacer1_action}"
                                                    binding="#{Ubicacion5.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{Ubicacion5.gestor.scriptDeshacer}"
                                                    rendered="#{Ubicacion5.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Ubicacion5.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{Ubicacion5.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Ubicacion5.botonConfirmar1_action}"
                                                    binding="#{Ubicacion5.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{Ubicacion5.gestor.scriptConfirmar}"
                                                    rendered="#{Ubicacion5.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Ubicacion5.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{Ubicacion5.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Ubicacion5.botonDescartar1_action}"
                                                    binding="#{Ubicacion5.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{Ubicacion5.gestor.scriptDescartar}"
                                                    rendered="#{Ubicacion5.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Ubicacion5.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{Ubicacion5.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{Ubicacion5.listaFuncionAccion1}"
                                                    converter="#{Ubicacion5.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{Ubicacion5.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{Ubicacion5.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{Ubicacion5.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{Ubicacion5.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Ubicacion5.botonProcesar1_action}"
                                                    binding="#{Ubicacion5.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{Ubicacion5.gestor.scriptProcesar}"
                                                    rendered="#{Ubicacion5.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Ubicacion5.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{Ubicacion5.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Ubicacion5.botonRefrescar1_action}"
                                                    binding="#{Ubicacion5.botonRefrescar1}"
                                                    disabled="#{Ubicacion5.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{Ubicacion5.gestor.scriptRefrescar}"
                                                    rendered="#{Ubicacion5.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Ubicacion5.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{Ubicacion5.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Ubicacion5.botonReconsultar1_action}"
                                                    binding="#{Ubicacion5.botonReconsultar1}"
                                                    disabled="#{Ubicacion5.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{Ubicacion5.gestor.scriptReconsultar}"
                                                    rendered="#{Ubicacion5.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Ubicacion5.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{Ubicacion5.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Ubicacion5.botonRetornar1_action}"
                                                    binding="#{Ubicacion5.botonRetornar1}"
                                                    disabled="#{Ubicacion5.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{Ubicacion5.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{Ubicacion5.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Ubicacion5.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{Ubicacion5.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel109"
                                                rendered="#{Ubicacion5.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{Ubicacion5.imageHyperlink1_action}"
                                                    binding="#{Ubicacion5.imageHyperlink1}"
                                                    disabled="#{Ubicacion5.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{Ubicacion5.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{Ubicacion5.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{Ubicacion5.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.Ubicacion5_imageHyperlink1_toolTip}"/>
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
