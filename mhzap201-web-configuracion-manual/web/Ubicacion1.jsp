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
                    focus="#{Ubicacion1.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{Ubicacion1.gestor.preserveFocus}"
                    preserveScroll="#{Ubicacion1.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{Ubicacion1.form1}" 
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
                                        binding="#{Ubicacion1.breadcrumbs1}" 
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
                                                    rendered="#{Ubicacion1.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{Ubicacion1.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{Ubicacion1.gestor.mensajeDisponible}"
                                                    text="#{Ubicacion1.gestor.mensaje}"
                                                    url="#{Ubicacion1.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:table
                                            binding="#{Ubicacion1.table1}"
                                            clearSortButton="true" 
                                            deselectMultipleButton="true" 
                                            id="table1"
                                            paginateButton="false"
                                            paginationControls="true" 
                                            selectMultipleButton="true" 
                                            sortPanelToggleButton="true"
                                            width="960">
                                            <webuijsf:tableRowGroup 
                                                binding="#{Ubicacion1.tableRowGroup1}" 
                                                id="tableRowGroup1" 
                                                rows="1"
                                                selected="#{Ubicacion1.gestor.filaEscogida}" 
                                                sourceData="#{Ubicacion1.ubicacionDataProvider}" 
                                                sourceVar="currentRow">
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    id="tableRowGroup1SelectionColumn"
                                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);" 
                                                    selectId="checkbox1">
                                                    <webuijsf:checkbox 
                                                        binding="#{Ubicacion1.checkbox1}" 
                                                        id="checkbox1"
                                                        onClick="#{Ubicacion1.gestor.scriptElegir}" 
                                                        selected="#{Ubicacion1.gestor.filaElegida}" 
                                                        toolTip="#{Ubicacion1.gestor.i18n.toolTipCheckboxSeleccionMultiple}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    binding="#{Ubicacion1.tableColumn1}" 
                                                    id="tableColumn1">
                                                    <webuijsf:button 
                                                        actionExpression="#{Ubicacion1.botonEscogerFila1_action}"
                                                        binding="#{Ubicacion1.botonEscogerFila1}"
                                                        disabled="#{Ubicacion1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonEscogerFila1"
                                                        imageURL="#{Ubicacion1.gestor.urlImagenEscoger}" 
                                                        onClick="#{Ubicacion1.gestor.scriptEscoger}"
                                                        text="#{Ubicacion1.gestor.i18n.textoBotonEscogerFila}"
                                                        toolTip="#{Ubicacion1.gestor.i18n.toolTipBotonEscogerFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{Ubicacion1.botonDetallarFila1_action}"
                                                        binding="#{Ubicacion1.botonDetallarFila1}"
                                                        disabled="#{Ubicacion1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonDetallarFila1"
                                                        imageURL="#{Ubicacion1.gestor.urlImagenDetallar}" 
                                                        onClick="#{Ubicacion1.scriptAbrirVentanaVerDetalle}"
                                                        rendered="#{Ubicacion1.gestor.detalleDisponible}" 
                                                        text="#{Ubicacion1.gestor.i18n.textoBotonDetallarFila}"
                                                        toolTip="#{Ubicacion1.gestor.i18n.toolTipBotonDetallarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{Ubicacion1.botonProcesarFila1_action}"
                                                        binding="#{Ubicacion1.botonProcesarFila1}"
                                                        disabled="#{Ubicacion1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonProcesarFila1"
                                                        imageURL="#{Ubicacion1.gestor.urlImagenProcesar}" 
                                                        onClick="#{Ubicacion1.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{Ubicacion1.asistente.comandoDisponible}" 
                                                        text="#{Ubicacion1.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{Ubicacion1.gestor.i18n.toolTipBotonProcesarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{Ubicacion1.botonRetornarFila1_action}"
                                                        binding="#{Ubicacion1.botonRetornarFila1}" 
                                                        disabled="#{Ubicacion1.gestor.funcionReturnInhabilitada}"
                                                        id="botonRetornarFila1"
                                                        imageURL="#{Ubicacion1.gestor.urlImagenRetornar}"
                                                        onClick="#{Ubicacion1.gestor.scriptRetornarRecursoActual}"
                                                        rendered="#{Ubicacion1.gestor.funcionReturnVisible}" 
                                                        text="#{Ubicacion1.gestor.i18n.textoBotonRetornarFila}"
                                                        toolTip="#{Ubicacion1.gestor.i18n.toolTipBotonRetornarFila}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Ubicacion1.tableColumn2}"
                                                    id="tableColumn2"
                                                    rendered="#{Ubicacion1.gestor.designing}">
                                                    <webuijsf:imageHyperlink
                                                        actionExpression="#{Ubicacion1.hipervinculoAccionFila1_action}"
                                                        binding="#{Ubicacion1.hipervinculoAccionFila1}"
                                                        disabled="#{Ubicacion1.gestor.loteConCambios}"
                                                        id="hipervinculoAccionFila1"
                                                        imageURL="#{Ubicacion1.gestor.urlImagenEjecutarVinculo}"
                                                        onClick="#{Ubicacion1.scriptAbrirVentanaAccionFila1}"
                                                        text="Accion1"
                                                        toolTip="#{bundle.Ubicacion1_hipervinculoAccionFila1_toolTip}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="right" 
                                                    binding="#{Ubicacion1.tableColumn3}" 
                                                    headerText="#{Ubicacion1.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{Ubicacion1.gestor.i18n.toolTipEtiquetaIdentificacionFila}"
                                                    id="tableColumn3">
                                                    <webuijsf:imageHyperlink 
                                                        actionExpression="#{Ubicacion1.hipervinculoDetallarFila1_action}"
                                                        binding="#{Ubicacion1.hipervinculoDetallarFila1}" 
                                                        id="hipervinculoDetallarFila1"
                                                        imageURL="#{Ubicacion1.gestor.urlImagenFilaProcesada}"
                                                        textPosition="left" 
                                                        text="#{Ubicacion1.gestor.identificacionFila}" 
                                                        toolTip="#{Ubicacion1.gestor.toolTipImagenFilaProcesada}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Ubicacion1.tableColumnIdUbicacion1}"
                                                    headerText="id"
                                                    id="tableColumnIdUbicacion1" rendered="false"
                                                    sort="id_ubicacion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdUbicacion1"
                                                    text="#{currentRow.value['id_ubicacion']}"
                                                    rendered="#{Ubicacion1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Ubicacion1.labelIdUbicacion1}"
                                                    id="labelIdUbicacion1"
                                                    for="campoIdUbicacion1"/>
                                                <webuijsf:textField id="campoIdUbicacion1"
                                                    binding="#{Ubicacion1.campoIdUbicacion1}"
                                                    converter="#{Ubicacion1.converterIdUbicacion1}"
                                                    readOnly="#{Ubicacion1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['id_ubicacion']}"
                                                    toolTip="BundleParametros.id_ubicacion.ubicacion"
                                                    validatorExpression="#{Ubicacion1.validatorIdUbicacion1.validate}"/>
                                                <webuijsf:staticText id="campoIdUbicacion1Texto1"
                                                    binding="#{Ubicacion1.campoIdUbicacion1Texto1}"
                                                    text="#{currentRow.value['id_ubicacion']}"/>
                                                <webuijsf:message id="messageIdUbicacion1"
                                                    for="campoIdUbicacion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Ubicacion1.tableColumnCodigoUbicacion1}"
                                                    headerText="codigo"
                                                    id="tableColumnCodigoUbicacion1"
                                                    sort="codigo_ubicacion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextCodigoUbicacion1"
                                                    text="#{currentRow.value['codigo_ubicacion']}"
                                                    rendered="#{Ubicacion1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Ubicacion1.labelCodigoUbicacion1}"
                                                    id="labelCodigoUbicacion1"
                                                    for="campoCodigoUbicacion1"/>
                                                <webuijsf:textField id="campoCodigoUbicacion1"
                                                    binding="#{Ubicacion1.campoCodigoUbicacion1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{Ubicacion1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['codigo_ubicacion']}"
                                                    toolTip="BundleParametros.codigo_ubicacion.ubicacion"
                                                    validatorExpression="#{Ubicacion1.validatorCodigoUbicacion1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoUbicacion1Texto1"
                                                    binding="#{Ubicacion1.campoCodigoUbicacion1Texto1}"
                                                    text="#{currentRow.value['codigo_ubicacion']}"/>
                                                <webuijsf:message id="messageCodigoUbicacion1"
                                                    for="campoCodigoUbicacion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Ubicacion1.tableColumnNombreUbicacion1}"
                                                    headerText="nombre"
                                                    id="tableColumnNombreUbicacion1"
                                                    sort="nombre_ubicacion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNombreUbicacion1"
                                                    text="#{currentRow.value['nombre_ubicacion']}"
                                                    rendered="#{Ubicacion1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Ubicacion1.labelNombreUbicacion1}"
                                                    id="labelNombreUbicacion1"
                                                    for="campoNombreUbicacion1"/>
                                                <webuijsf:textField id="campoNombreUbicacion1"
                                                    binding="#{Ubicacion1.campoNombreUbicacion1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{Ubicacion1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['nombre_ubicacion']}"
                                                    toolTip="BundleParametros.nombre_ubicacion.ubicacion"
                                                    validatorExpression="#{Ubicacion1.validatorNombreUbicacion1.validate}"/>
                                                <webuijsf:staticText id="campoNombreUbicacion1Texto1"
                                                    binding="#{Ubicacion1.campoNombreUbicacion1Texto1}"
                                                    text="#{currentRow.value['nombre_ubicacion']}"/>
                                                <webuijsf:message id="messageNombreUbicacion1"
                                                    for="campoNombreUbicacion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Ubicacion1.tableColumnIdUbicacionSuperior1}"
                                                    headerText="ubicacion superior"
                                                    id="tableColumnIdUbicacionSuperior1" rendered="false"
                                                    sort="codigo_ubicacion_1x1y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdUbicacionSuperior1"
                                                    text="#{currentRow.value['codigo_ubicacion_1x1y3']}"
                                                    rendered="#{Ubicacion1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Ubicacion1.labelIdUbicacionSuperior1}"
                                                    id="labelIdUbicacionSuperior1"
                                                    for="campoIdUbicacionSuperior1"/>
                                                <webuijsf:textField id="campoIdUbicacionSuperior1"
                                                    binding="#{Ubicacion1.campoIdUbicacionSuperior1}"
                                                    readOnly="#{Ubicacion1.gestor.filaNoProcesada}"
                                                    text="#{Ubicacion1.asistente.textoCampoIdUbicacionSuperior1}"
                                                    toolTip="#{Ubicacion1.asistente.toolTipCampoIdUbicacionSuperior1}"
                                                    validatorExpression="#{Ubicacion1.campoIdUbicacionSuperior1_validate}"/>
                                                <webuijsf:staticText id="campoIdUbicacionSuperior1Texto1"
                                                    binding="#{Ubicacion1.campoIdUbicacionSuperior1Texto1}"
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
                                                    rendered="#{Ubicacion1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{Ubicacion1.campoIdUbicacionSuperior1Boton1}"
                                                    id="campoIdUbicacionSuperior1Boton1"
                                                    onClick="#{Ubicacion1.asistente.scriptCampoIdUbicacionSuperior1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{Ubicacion1.campoIdUbicacionSuperior1Boton3}"
                                                    id="campoIdUbicacionSuperior1Boton3"
                                                    onClick="#{Ubicacion1.asistente.scriptCampoIdUbicacionSuperior1Boton2}"
                                                    rendered="#{Ubicacion1.asistente.campoIdUbicacionSuperior1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{Ubicacion1.tableColumnIdUbicacionSuperior2}"
                                                    headerText="nombre ubicacion superior"
                                                    id="tableColumnIdUbicacionSuperior2" rendered="false"
                                                    sort="nombre_ubicacion_1x1y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdUbicacionSuperior2"
                                                    text="#{currentRow.value['nombre_ubicacion_1x1y4']}"
                                                    rendered="#{Ubicacion1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Ubicacion1.labelIdUbicacionSuperior2}"
                                                    id="labelIdUbicacionSuperior2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{Ubicacion1.campoIdUbicacionSuperior1Hiper1}"
                                                    id="campoIdUbicacionSuperior1Hiper1"
                                                    text="#{currentRow.value['nombre_ubicacion_1x1y4']}"
                                                    onClick="#{Ubicacion1.asistente.scriptCampoIdUbicacionSuperior1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdUbicacionSuperior1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Ubicacion1.tableColumnNumeroTipoNodo1}"
                                                    headerText="tipo nodo"
                                                    id="tableColumnNumeroTipoNodo1" rendered="false"
                                                    sort="codigo_tipo_nodo_1x2y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroTipoNodo1"
                                                    text="#{currentRow.value['codigo_tipo_nodo_1x2y2']}"
                                                    rendered="#{Ubicacion1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Ubicacion1.labelNumeroTipoNodo1}"
                                                    id="labelNumeroTipoNodo1"
                                                    for="listaNumeroTipoNodo1"/>
                                                <webuijsf:dropDown id="listaNumeroTipoNodo1"
                                                    binding="#{Ubicacion1.listaNumeroTipoNodo1}"
                                                    converter="#{Ubicacion1.converterNumeroTipoNodo1}"
                                                    disabled="#{Ubicacion1.gestor.filaNoProcesada}"
                                                    items="#{Ubicacion1.asistente.opcionesListaNumeroTipoNodo1}"
                                                    selected="#{currentRow.value['numero_tipo_nodo']}"
                                                    toolTip="BundleParametros.numero_tipo_nodo.ubicacion"/>
                                                <webuijsf:staticText id="listaNumeroTipoNodo1Texto1"
                                                    binding="#{Ubicacion1.listaNumeroTipoNodo1Texto1}"
                                                    text="#{currentRow.value['codigo_tipo_nodo_1x2y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoNodo1"
                                                    for="listaNumeroTipoNodo1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Ubicacion1.tableColumnNumeroNivelUbicacion1}"
                                                    headerText="nivel"
                                                    id="tableColumnNumeroNivelUbicacion1" rendered="false"
                                                    sort="codigo_nivel_ubicacion_1x3y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroNivelUbicacion1"
                                                    text="#{currentRow.value['codigo_nivel_ubicacion_1x3y2']}"
                                                    rendered="#{Ubicacion1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Ubicacion1.labelNumeroNivelUbicacion1}"
                                                    id="labelNumeroNivelUbicacion1"
                                                    for="listaNumeroNivelUbicacion1"/>
                                                <webuijsf:dropDown id="listaNumeroNivelUbicacion1"
                                                    binding="#{Ubicacion1.listaNumeroNivelUbicacion1}"
                                                    converter="#{Ubicacion1.converterNumeroNivelUbicacion1}"
                                                    disabled="#{Ubicacion1.gestor.filaNoProcesada}"
                                                    items="#{Ubicacion1.asistente.opcionesListaNumeroNivelUbicacion1}"
                                                    selected="#{currentRow.value['numero_nivel_ubicacion']}"
                                                    toolTip="BundleParametros.numero_nivel_ubicacion.ubicacion"/>
                                                <webuijsf:staticText id="listaNumeroNivelUbicacion1Texto1"
                                                    binding="#{Ubicacion1.listaNumeroNivelUbicacion1Texto1}"
                                                    text="#{currentRow.value['codigo_nivel_ubicacion_1x3y2']}"/>
                                                <webuijsf:message id="messageNumeroNivelUbicacion1"
                                                    for="listaNumeroNivelUbicacion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Ubicacion1.tableColumnSecuenciaUbicacion1}"
                                                    headerText="secuencia"
                                                    id="tableColumnSecuenciaUbicacion1" rendered="false"
                                                    sort="secuencia_ubicacion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextSecuenciaUbicacion1"
                                                    text="#{currentRow.value['secuencia_ubicacion']}"
                                                    rendered="#{Ubicacion1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Ubicacion1.labelSecuenciaUbicacion1}"
                                                    id="labelSecuenciaUbicacion1"
                                                    for="campoSecuenciaUbicacion1"/>
                                                <webuijsf:textField id="campoSecuenciaUbicacion1"
                                                    binding="#{Ubicacion1.campoSecuenciaUbicacion1}"
                                                    converter="#{Ubicacion1.converterSecuenciaUbicacion1}"
                                                    readOnly="#{Ubicacion1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['secuencia_ubicacion']}"
                                                    toolTip="BundleParametros.secuencia_ubicacion.ubicacion"
                                                    validatorExpression="#{Ubicacion1.validatorSecuenciaUbicacion1.validate}"/>
                                                <webuijsf:staticText id="campoSecuenciaUbicacion1Texto1"
                                                    binding="#{Ubicacion1.campoSecuenciaUbicacion1Texto1}"
                                                    text="#{currentRow.value['secuencia_ubicacion']}"/>
                                                <webuijsf:message id="messageSecuenciaUbicacion1"
                                                    for="campoSecuenciaUbicacion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Ubicacion1.tableColumnClaveUbicacion1}"
                                                    headerText="clave"
                                                    id="tableColumnClaveUbicacion1" rendered="false"
                                                    sort="clave_ubicacion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextClaveUbicacion1"
                                                    text="#{currentRow.value['clave_ubicacion']}"
                                                    rendered="#{Ubicacion1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Ubicacion1.labelClaveUbicacion1}"
                                                    id="labelClaveUbicacion1"
                                                    for="campoClaveUbicacion1"/>
                                                <webuijsf:textField id="campoClaveUbicacion1"
                                                    binding="#{Ubicacion1.campoClaveUbicacion1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{Ubicacion1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['clave_ubicacion']}"
                                                    toolTip="BundleParametros.clave_ubicacion.ubicacion"
                                                    validatorExpression="#{Ubicacion1.validatorClaveUbicacion1.validate}"/>
                                                <webuijsf:staticText id="campoClaveUbicacion1Texto1"
                                                    binding="#{Ubicacion1.campoClaveUbicacion1Texto1}"
                                                    text="#{currentRow.value['clave_ubicacion']}"/>
                                                <webuijsf:message id="messageClaveUbicacion1"
                                                    for="campoClaveUbicacion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Ubicacion1.tableColumnNumeroTipoArea1}"
                                                    headerText="tipo area"
                                                    id="tableColumnNumeroTipoArea1" rendered="false"
                                                    sort="codigo_tipo_area_1x4y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroTipoArea1"
                                                    text="#{currentRow.value['codigo_tipo_area_1x4y2']}"
                                                    rendered="#{Ubicacion1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Ubicacion1.labelNumeroTipoArea1}"
                                                    id="labelNumeroTipoArea1"
                                                    for="listaNumeroTipoArea1"/>
                                                <webuijsf:dropDown id="listaNumeroTipoArea1"
                                                    binding="#{Ubicacion1.listaNumeroTipoArea1}"
                                                    converter="#{Ubicacion1.converterNumeroTipoArea1}"
                                                    disabled="#{Ubicacion1.gestor.filaNoProcesada}"
                                                    items="#{Ubicacion1.asistente.opcionesListaNumeroTipoArea1}"
                                                    selected="#{currentRow.value['numero_tipo_area']}"
                                                    toolTip="BundleParametros.numero_tipo_area.ubicacion"/>
                                                <webuijsf:staticText id="listaNumeroTipoArea1Texto1"
                                                    binding="#{Ubicacion1.listaNumeroTipoArea1Texto1}"
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
                                                        binding="#{Ubicacion1.etiquetaTextoFilasPorPagina1}" 
                                                        for="textoFilasPorPagina1"
                                                        id="etiquetaTextoFilasPorPagina1" 
                                                        text="#{Ubicacion1.gestor.i18n.textoEtiquetaTextoFilasPorPagina}"/>
                                                </h:panelGrid>
                                                <h:panelGrid 
                                                    columns="3" 
                                                    id="gridPanel107">
                                                    <webuijsf:textField 
                                                        binding="#{Ubicacion1.textoFilasPorPagina1}" 
                                                        columns="2"
                                                        converter="#{Ubicacion1.textoFilasPorPagina1Converter1}"
                                                        disabled="#{Ubicacion1.gestor.paginacionInhabilitada}" 
                                                        id="textoFilasPorPagina1" maxLength="2"
                                                        text="#{Ubicacion1.gestor.filasPorPagina}" 
                                                        validatorExpression="#{Ubicacion1.textoFilasPorPagina1Validator1.validate}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{Ubicacion1.botonRepaginar1_action}"
                                                        binding="#{Ubicacion1.botonRepaginar1}" 
                                                        id="botonRepaginar1"
                                                        imageURL="#{Ubicacion1.gestor.urlImagenRepaginar}" 
                                                        onClick="#{Ubicacion1.gestor.scriptRepaginar}"
                                                        text="#{Ubicacion1.gestor.i18n.textoBotonRepaginar}"
                                                        toolTip="#{Ubicacion1.gestor.i18n.toolTipBotonRepaginar}"/>
                                                    <webuijsf:message 
                                                        for="textoFilasPorPagina1" 
                                                        id="messageFilasPorPagina1"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="13"
                                                id="gridPanel108">
                                                <webuijsf:button
                                                    actionExpression="#{Ubicacion1.botonAgregar1_action}"
                                                    binding="#{Ubicacion1.botonAgregar1}"
                                                    disabled="#{Ubicacion1.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{Ubicacion1.gestor.scriptAgregar}"
                                                    rendered="#{Ubicacion1.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Ubicacion1.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{Ubicacion1.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{Ubicacion1.listaFuncionEdicion1}"
                                                    converter="#{Ubicacion1.converterListaFuncionEdicion1}"
                                                    disabled="#{Ubicacion1.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{Ubicacion1.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{Ubicacion1.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{Ubicacion1.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{Ubicacion1.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Ubicacion1.botonEditar1_action}"
                                                    binding="#{Ubicacion1.botonEditar1}"
                                                    disabled="#{Ubicacion1.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{Ubicacion1.gestor.scriptEditar}"
                                                    rendered="#{Ubicacion1.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Ubicacion1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{Ubicacion1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Ubicacion1.botonEliminar1_action}"
                                                    binding="#{Ubicacion1.botonEliminar1}"
                                                    disabled="#{Ubicacion1.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{Ubicacion1.gestor.scriptEliminar}"
                                                    rendered="#{Ubicacion1.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Ubicacion1.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{Ubicacion1.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Ubicacion1.botonAplicar1_action}"
                                                    binding="#{Ubicacion1.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{Ubicacion1.gestor.scriptAplicar}"
                                                    rendered="#{Ubicacion1.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Ubicacion1.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{Ubicacion1.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Ubicacion1.botonDeshacer1_action}"
                                                    binding="#{Ubicacion1.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{Ubicacion1.gestor.scriptDeshacer}"
                                                    rendered="#{Ubicacion1.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Ubicacion1.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{Ubicacion1.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Ubicacion1.botonConfirmar1_action}"
                                                    binding="#{Ubicacion1.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{Ubicacion1.gestor.scriptConfirmar}"
                                                    rendered="#{Ubicacion1.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Ubicacion1.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{Ubicacion1.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Ubicacion1.botonDescartar1_action}"
                                                    binding="#{Ubicacion1.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{Ubicacion1.gestor.scriptDescartar}"
                                                    rendered="#{Ubicacion1.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Ubicacion1.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{Ubicacion1.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{Ubicacion1.listaFuncionAccion1}"
                                                    converter="#{Ubicacion1.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{Ubicacion1.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{Ubicacion1.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{Ubicacion1.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{Ubicacion1.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Ubicacion1.botonProcesar1_action}"
                                                    binding="#{Ubicacion1.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{Ubicacion1.gestor.scriptProcesar}"
                                                    rendered="#{Ubicacion1.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Ubicacion1.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{Ubicacion1.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Ubicacion1.botonRefrescar1_action}"
                                                    binding="#{Ubicacion1.botonRefrescar1}"
                                                    disabled="#{Ubicacion1.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{Ubicacion1.gestor.scriptRefrescar}"
                                                    rendered="#{Ubicacion1.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Ubicacion1.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{Ubicacion1.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Ubicacion1.botonReconsultar1_action}"
                                                    binding="#{Ubicacion1.botonReconsultar1}"
                                                    disabled="#{Ubicacion1.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{Ubicacion1.gestor.scriptReconsultar}"
                                                    rendered="#{Ubicacion1.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Ubicacion1.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{Ubicacion1.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Ubicacion1.botonRetornar1_action}"
                                                    binding="#{Ubicacion1.botonRetornar1}"
                                                    disabled="#{Ubicacion1.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{Ubicacion1.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{Ubicacion1.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Ubicacion1.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{Ubicacion1.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel109"
                                                rendered="#{Ubicacion1.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{Ubicacion1.imageHyperlink1_action}"
                                                    binding="#{Ubicacion1.imageHyperlink1}"
                                                    disabled="#{Ubicacion1.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{Ubicacion1.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{Ubicacion1.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{Ubicacion1.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.Ubicacion1_imageHyperlink1_toolTip}"/>
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
