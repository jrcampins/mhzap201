<?xml version="1.0" encoding="UTF-8"?>
<!--
   Copyright (C) 2010, EGT Consultores, C.A.
   Este archivo fue totalmente generado utilizando herramientas de software de EGT Consultores, C.A.
   En consecuencia, partes del archivo podrian ser similares o hasta iguales a las de archivos de
   programas de otros clientes, generados por las mismas herramientas; por lo tanto, esta similitud
   no podra ser considerada como violacion del copyright.
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
                    focus="#{ObjecionElePen5.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{ObjecionElePen5.gestor.preserveFocus}"
                    preserveScroll="#{ObjecionElePen5.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{ObjecionElePen5.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | checkbox1 campoIdObjecionElePen1 campoIdPersona1 campoIdProveedorDatExt1 listaNumeroTipoObjElePen1 listaEsObjecionElePenInactiva1 campoFechaUltimaActualizacion1 campoNombreArchivoUltimaAct1 campoObservaciones1 campoFechaAnulacion1 campoObservacionesAnulacion1 campoReferencia1 textoFilasPorPagina1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | textoFilasPorPagina1 | botonRepaginar1 , virtualForm3 | checkbox1 listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonEscogerFila1 botonDetallarFila1 botonProcesarFila1 botonRetornarFila1 botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{ObjecionElePen5.breadcrumbs1}" 
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
                                                    rendered="#{ObjecionElePen5.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{ObjecionElePen5.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{ObjecionElePen5.gestor.mensajeDisponible}"
                                                    text="#{ObjecionElePen5.gestor.mensaje}"
                                                    url="#{ObjecionElePen5.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:table
                                            binding="#{ObjecionElePen5.table1}"
                                            clearSortButton="true" 
                                            deselectMultipleButton="true" 
                                            id="table1"
                                            paginateButton="false"
                                            paginationControls="true" 
                                            selectMultipleButton="true" 
                                            sortPanelToggleButton="true"
                                            width="960">
                                            <webuijsf:tableRowGroup 
                                                binding="#{ObjecionElePen5.tableRowGroup1}" 
                                                id="tableRowGroup1" 
                                                rows="1"
                                                selected="#{ObjecionElePen5.gestor.filaEscogida}" 
                                                sourceData="#{ObjecionElePen5.objecionElePenDataProvider}" 
                                                sourceVar="currentRow">
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    id="tableRowGroup1SelectionColumn"
                                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);" 
                                                    selectId="checkbox1">
                                                    <webuijsf:checkbox 
                                                        binding="#{ObjecionElePen5.checkbox1}" 
                                                        id="checkbox1"
                                                        onClick="#{ObjecionElePen5.gestor.scriptElegir}" 
                                                        selected="#{ObjecionElePen5.gestor.filaElegida}" 
                                                        toolTip="#{ObjecionElePen5.gestor.i18n.toolTipCheckboxSeleccionMultiple}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    binding="#{ObjecionElePen5.tableColumn1}" 
                                                    id="tableColumn1">
                                                    <webuijsf:button 
                                                        actionExpression="#{ObjecionElePen5.botonEscogerFila1_action}"
                                                        binding="#{ObjecionElePen5.botonEscogerFila1}"
                                                        disabled="#{ObjecionElePen5.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonEscogerFila1"
                                                        imageURL="#{ObjecionElePen5.gestor.urlImagenEscoger}" 
                                                        onClick="#{ObjecionElePen5.gestor.scriptEscoger}"
                                                        text="#{ObjecionElePen5.gestor.i18n.textoBotonEscogerFila}"
                                                        toolTip="#{ObjecionElePen5.gestor.i18n.toolTipBotonEscogerFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{ObjecionElePen5.botonDetallarFila1_action}"
                                                        binding="#{ObjecionElePen5.botonDetallarFila1}"
                                                        disabled="#{ObjecionElePen5.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonDetallarFila1"
                                                        imageURL="#{ObjecionElePen5.gestor.urlImagenDetallar}" 
                                                        onClick="#{ObjecionElePen5.scriptAbrirVentanaVerDetalle}"
                                                        rendered="#{ObjecionElePen5.gestor.detalleDisponible}" 
                                                        text="#{ObjecionElePen5.gestor.i18n.textoBotonDetallarFila}"
                                                        toolTip="#{ObjecionElePen5.gestor.i18n.toolTipBotonDetallarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{ObjecionElePen5.botonProcesarFila1_action}"
                                                        binding="#{ObjecionElePen5.botonProcesarFila1}"
                                                        disabled="#{ObjecionElePen5.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonProcesarFila1"
                                                        imageURL="#{ObjecionElePen5.gestor.urlImagenProcesar}" 
                                                        onClick="#{ObjecionElePen5.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{ObjecionElePen5.asistente.comandoDisponible}" 
                                                        text="#{ObjecionElePen5.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{ObjecionElePen5.gestor.i18n.toolTipBotonProcesarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{ObjecionElePen5.botonRetornarFila1_action}"
                                                        binding="#{ObjecionElePen5.botonRetornarFila1}" 
                                                        disabled="#{ObjecionElePen5.gestor.funcionReturnInhabilitada}"
                                                        id="botonRetornarFila1"
                                                        imageURL="#{ObjecionElePen5.gestor.urlImagenRetornar}"
                                                        onClick="#{ObjecionElePen5.gestor.scriptRetornarRecursoActual}"
                                                        rendered="#{ObjecionElePen5.gestor.funcionReturnVisible}" 
                                                        text="#{ObjecionElePen5.gestor.i18n.textoBotonRetornarFila}"
                                                        toolTip="#{ObjecionElePen5.gestor.i18n.toolTipBotonRetornarFila}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ObjecionElePen5.tableColumn2}"
                                                    id="tableColumn2"
                                                    rendered="#{ObjecionElePen5.gestor.designing}">
                                                    <webuijsf:imageHyperlink
                                                        actionExpression="#{ObjecionElePen5.hipervinculoAccionFila1_action}"
                                                        binding="#{ObjecionElePen5.hipervinculoAccionFila1}"
                                                        disabled="#{ObjecionElePen5.gestor.loteConCambios}"
                                                        id="hipervinculoAccionFila1"
                                                        imageURL="#{ObjecionElePen5.gestor.urlImagenEjecutarVinculo}"
                                                        onClick="#{ObjecionElePen5.scriptAbrirVentanaAccionFila1}"
                                                        text="Accion1"
                                                        toolTip="#{bundle.ObjecionElePen5_hipervinculoAccionFila1_toolTip}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="right" 
                                                    binding="#{ObjecionElePen5.tableColumn3}" 
                                                    headerText="#{ObjecionElePen5.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{ObjecionElePen5.gestor.i18n.toolTipEtiquetaIdentificacionFila}"
                                                    id="tableColumn3">
                                                    <webuijsf:imageHyperlink 
                                                        actionExpression="#{ObjecionElePen5.hipervinculoDetallarFila1_action}"
                                                        binding="#{ObjecionElePen5.hipervinculoDetallarFila1}" 
                                                        id="hipervinculoDetallarFila1"
                                                        imageURL="#{ObjecionElePen5.gestor.urlImagenFilaProcesada}"
                                                        textPosition="left" 
                                                        text="#{ObjecionElePen5.gestor.identificacionFila}" 
                                                        toolTip="#{ObjecionElePen5.gestor.toolTipImagenFilaProcesada}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ObjecionElePen5.tableColumnIdObjecionElePen1}"
                                                    toolTip="BundleParametros.id_objecion_ele_pen.objecion_ele_pen"
                                                    headerText="identificaci&#243;n"
                                                    id="tableColumnIdObjecionElePen1" rendered="false"
                                                    sort="id_objecion_ele_pen">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdObjecionElePen1"
                                                    text="#{currentRow.value['id_objecion_ele_pen']}"
                                                    rendered="#{ObjecionElePen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ObjecionElePen5.labelIdObjecionElePen1}"
                                                    id="labelIdObjecionElePen1"
                                                    for="campoIdObjecionElePen1"/>
                                                <webuijsf:textField id="campoIdObjecionElePen1"
                                                    binding="#{ObjecionElePen5.campoIdObjecionElePen1}"
                                                    converter="#{ObjecionElePen5.converterIdObjecionElePen1}"
                                                    readOnly="#{ObjecionElePen5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['id_objecion_ele_pen']}"
                                                    toolTip="BundleParametros.id_objecion_ele_pen.objecion_ele_pen"
                                                    validatorExpression="#{ObjecionElePen5.validatorIdObjecionElePen1.validate}"/>
                                                <webuijsf:staticText id="campoIdObjecionElePen1Texto1"
                                                    binding="#{ObjecionElePen5.campoIdObjecionElePen1Texto1}"
                                                    text="#{currentRow.value['id_objecion_ele_pen']}"/>
                                                <webuijsf:message id="messageIdObjecionElePen1"
                                                    for="campoIdObjecionElePen1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ObjecionElePen5.tableColumnIdPersona1}"
                                                    toolTip="BundleParametros.id_persona.objecion_ele_pen"
                                                    headerText="persona"
                                                    id="tableColumnIdPersona1"
                                                    sort="codigo_persona_1x1y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdPersona1"
                                                    text="#{currentRow.value['codigo_persona_1x1y3']}"
                                                    rendered="#{ObjecionElePen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ObjecionElePen5.labelIdPersona1}"
                                                    id="labelIdPersona1"
                                                    for="campoIdPersona1"/>
                                                <webuijsf:textField id="campoIdPersona1"
                                                    binding="#{ObjecionElePen5.campoIdPersona1}"
                                                    readOnly="#{ObjecionElePen5.gestor.filaNoProcesada}" required="true"
                                                    text="#{ObjecionElePen5.asistente.textoCampoIdPersona1}"
                                                    toolTip="#{ObjecionElePen5.asistente.toolTipCampoIdPersona1}"
                                                    validatorExpression="#{ObjecionElePen5.campoIdPersona1_validate}"/>
                                                <webuijsf:staticText id="campoIdPersona1Texto1"
                                                    binding="#{ObjecionElePen5.campoIdPersona1Texto1}"
                                                    text="#{currentRow.value['codigo_persona_1x1y3']}"/>
                                                <webuijsf:message id="messageIdPersona1"
                                                    for="campoIdPersona1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdPersona3"
                                                    rendered="#{ObjecionElePen5.asistente.tableColumnIdPersona3Rendered}"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdPersona3"
                                                    text="#{currentRow.value['id_persona']}"
                                                    rendered="#{ObjecionElePen5.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{ObjecionElePen5.campoIdPersona1Boton1}"
                                                    id="campoIdPersona1Boton1"
                                                    onClick="#{ObjecionElePen5.asistente.scriptCampoIdPersona1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{ObjecionElePen5.campoIdPersona1Boton3}"
                                                    id="campoIdPersona1Boton3"
                                                    onClick="#{ObjecionElePen5.asistente.scriptCampoIdPersona1Boton2}"
                                                    rendered="#{ObjecionElePen5.asistente.campoIdPersona1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{ObjecionElePen5.tableColumnIdPersona2}"
                                                    headerText="nombre persona"
                                                    id="tableColumnIdPersona2"
                                                    rendered="#{ObjecionElePen5.asistente.campoIdPersona1Boton2Rendered}"
                                                    sort="nombre_persona_1x1y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdPersona2"
                                                    text="#{currentRow.value['nombre_persona_1x1y4']}"
                                                    rendered="#{ObjecionElePen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ObjecionElePen5.labelIdPersona2}"
                                                    id="labelIdPersona2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{ObjecionElePen5.campoIdPersona1Hiper1}"
                                                    id="campoIdPersona1Hiper1"
                                                    text="#{currentRow.value['nombre_persona_1x1y4']}"
                                                    onClick="#{ObjecionElePen5.asistente.scriptCampoIdPersona1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdPersona1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ObjecionElePen5.tableColumnIdProveedorDatExt1}"
                                                    toolTip="BundleParametros.id_proveedor_dat_ext.objecion_ele_pen"
                                                    headerText="proveedor datos externos"
                                                    id="tableColumnIdProveedorDatExt1"
                                                    sort="codigo_proveedor_dat_ext_1x2y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdProveedorDatExt1"
                                                    text="#{currentRow.value['codigo_proveedor_dat_ext_1x2y3']}"
                                                    rendered="#{ObjecionElePen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ObjecionElePen5.labelIdProveedorDatExt1}"
                                                    id="labelIdProveedorDatExt1"
                                                    for="campoIdProveedorDatExt1"/>
                                                <webuijsf:textField id="campoIdProveedorDatExt1"
                                                    binding="#{ObjecionElePen5.campoIdProveedorDatExt1}"
                                                    readOnly="#{ObjecionElePen5.gestor.filaNoProcesada}" required="true"
                                                    text="#{ObjecionElePen5.asistente.textoCampoIdProveedorDatExt1}"
                                                    toolTip="#{ObjecionElePen5.asistente.toolTipCampoIdProveedorDatExt1}"
                                                    validatorExpression="#{ObjecionElePen5.campoIdProveedorDatExt1_validate}"/>
                                                <webuijsf:staticText id="campoIdProveedorDatExt1Texto1"
                                                    binding="#{ObjecionElePen5.campoIdProveedorDatExt1Texto1}"
                                                    text="#{currentRow.value['codigo_proveedor_dat_ext_1x2y3']}"/>
                                                <webuijsf:message id="messageIdProveedorDatExt1"
                                                    for="campoIdProveedorDatExt1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdProveedorDatExt3"
                                                    rendered="#{ObjecionElePen5.asistente.tableColumnIdProveedorDatExt3Rendered}"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdProveedorDatExt3"
                                                    text="#{currentRow.value['id_proveedor_dat_ext']}"
                                                    rendered="#{ObjecionElePen5.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{ObjecionElePen5.campoIdProveedorDatExt1Boton1}"
                                                    id="campoIdProveedorDatExt1Boton1"
                                                    onClick="#{ObjecionElePen5.asistente.scriptCampoIdProveedorDatExt1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{ObjecionElePen5.campoIdProveedorDatExt1Boton3}"
                                                    id="campoIdProveedorDatExt1Boton3"
                                                    onClick="#{ObjecionElePen5.asistente.scriptCampoIdProveedorDatExt1Boton2}"
                                                    rendered="#{ObjecionElePen5.asistente.campoIdProveedorDatExt1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{ObjecionElePen5.tableColumnIdProveedorDatExt2}"
                                                    headerText="nombre proveedor datos externos"
                                                    id="tableColumnIdProveedorDatExt2"
                                                    rendered="#{ObjecionElePen5.asistente.campoIdProveedorDatExt1Boton2Rendered}"
                                                    sort="nombre_proveedor_dat_ext_1x2y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdProveedorDatExt2"
                                                    text="#{currentRow.value['nombre_proveedor_dat_ext_1x2y4']}"
                                                    rendered="#{ObjecionElePen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ObjecionElePen5.labelIdProveedorDatExt2}"
                                                    id="labelIdProveedorDatExt2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{ObjecionElePen5.campoIdProveedorDatExt1Hiper1}"
                                                    id="campoIdProveedorDatExt1Hiper1"
                                                    text="#{currentRow.value['nombre_proveedor_dat_ext_1x2y4']}"
                                                    onClick="#{ObjecionElePen5.asistente.scriptCampoIdProveedorDatExt1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdProveedorDatExt1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ObjecionElePen5.tableColumnNumeroTipoObjElePen1}"
                                                    toolTip="BundleParametros.numero_tipo_obj_ele_pen.objecion_ele_pen"
                                                    headerText="tipo"
                                                    id="tableColumnNumeroTipoObjElePen1"
                                                    sort="codigo_tipo_obj_ele_pen_1x3y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroTipoObjElePen1"
                                                    text="#{currentRow.value['codigo_tipo_obj_ele_pen_1x3y2']}"
                                                    rendered="#{ObjecionElePen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ObjecionElePen5.labelNumeroTipoObjElePen1}"
                                                    id="labelNumeroTipoObjElePen1"
                                                    for="listaNumeroTipoObjElePen1"/>
                                                <webuijsf:dropDown id="listaNumeroTipoObjElePen1"
                                                    binding="#{ObjecionElePen5.listaNumeroTipoObjElePen1}"
                                                    converter="#{ObjecionElePen5.converterNumeroTipoObjElePen1}"
                                                    disabled="#{ObjecionElePen5.gestor.filaNoProcesada}" required="true"
                                                    items="#{ObjecionElePen5.asistente.opcionesListaNumeroTipoObjElePen1}"
                                                    selected="#{currentRow.value['numero_tipo_obj_ele_pen']}"
                                                    toolTip="BundleParametros.numero_tipo_obj_ele_pen.objecion_ele_pen"/>
                                                <webuijsf:staticText id="listaNumeroTipoObjElePen1Texto1"
                                                    binding="#{ObjecionElePen5.listaNumeroTipoObjElePen1Texto1}"
                                                    text="#{currentRow.value['codigo_tipo_obj_ele_pen_1x3y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoObjElePen1"
                                                    for="listaNumeroTipoObjElePen1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ObjecionElePen5.tableColumnEsObjecionElePenInactiva1}"
                                                    toolTip="BundleParametros.es_objecion_ele_pen_inactiva.objecion_ele_pen"
                                                    headerText="inactiva"
                                                    id="tableColumnEsObjecionElePenInactiva1"
                                                    sort="es_objecion_ele_pen_inactiva">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsObjecionElePenInactiva1"
                                                    text="#{currentRow.value['es_objecion_ele_pen_inactiva']}"
                                                    rendered="#{ObjecionElePen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ObjecionElePen5.labelEsObjecionElePenInactiva1}"
                                                    id="labelEsObjecionElePenInactiva1"
                                                    for="listaEsObjecionElePenInactiva1"/>
                                                <webuijsf:dropDown id="listaEsObjecionElePenInactiva1"
                                                    binding="#{ObjecionElePen5.listaEsObjecionElePenInactiva1}"
                                                    converter="#{ObjecionElePen5.converterEsObjecionElePenInactiva1}"
                                                    disabled="#{ObjecionElePen5.gestor.filaNoProcesada}" required="true"
                                                    items="#{ObjecionElePen5.asistente.opcionesListaEsObjecionElePenInactiva1}"
                                                    selected="#{currentRow.value['es_objecion_ele_pen_inactiva']}"
                                                    toolTip="BundleParametros.es_objecion_ele_pen_inactiva.objecion_ele_pen"/>
                                                <webuijsf:staticText id="listaEsObjecionElePenInactiva1Texto1"
                                                    binding="#{ObjecionElePen5.listaEsObjecionElePenInactiva1Texto1}"/>
                                                <webuijsf:message id="messageEsObjecionElePenInactiva1"
                                                    for="listaEsObjecionElePenInactiva1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ObjecionElePen5.tableColumnFechaUltimaActualizacion1}"
                                                    toolTip="BundleParametros.fecha_ultima_actualizacion.objecion_ele_pen"
                                                    headerText="fecha ultima actualizaci&#243;n"
                                                    id="tableColumnFechaUltimaActualizacion1" rendered="false"
                                                    sort="fecha_ultima_actualizacion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextFechaUltimaActualizacion1"
                                                    text="#{currentRow.value['fecha_ultima_actualizacion']}"
                                                    rendered="#{ObjecionElePen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ObjecionElePen5.labelFechaUltimaActualizacion1}"
                                                    id="labelFechaUltimaActualizacion1"
                                                    for="campoFechaUltimaActualizacion1"/>
                                                <webuijsf:textField id="campoFechaUltimaActualizacion1"
                                                    binding="#{ObjecionElePen5.campoFechaUltimaActualizacion1}"
                                                    converter="#{ObjecionElePen5.converterFechaUltimaActualizacion1}"
                                                    readOnly="#{ObjecionElePen5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['fecha_ultima_actualizacion']}"
                                                    toolTip="BundleParametros.fecha_ultima_actualizacion.objecion_ele_pen"/>
                                                <webuijsf:staticText id="campoFechaUltimaActualizacion1Texto1"
                                                    binding="#{ObjecionElePen5.campoFechaUltimaActualizacion1Texto1}"
                                                    converter="#{ObjecionElePen5.converterFechaUltimaActualizacion1}"
                                                    text="#{currentRow.value['fecha_ultima_actualizacion']}"/>
                                                <webuijsf:message id="messageFechaUltimaActualizacion1"
                                                    for="campoFechaUltimaActualizacion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ObjecionElePen5.tableColumnNombreArchivoUltimaAct1}"
                                                    toolTip="BundleParametros.nombre_archivo_ultima_act.objecion_ele_pen"
                                                    headerText="nombre archivo ultima actualizaci&#243;n"
                                                    id="tableColumnNombreArchivoUltimaAct1" rendered="false"
                                                    sort="nombre_archivo_ultima_act">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNombreArchivoUltimaAct1"
                                                    text="#{currentRow.value['nombre_archivo_ultima_act']}"
                                                    rendered="#{ObjecionElePen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ObjecionElePen5.labelNombreArchivoUltimaAct1}"
                                                    id="labelNombreArchivoUltimaAct1"
                                                    for="campoNombreArchivoUltimaAct1"/>
                                                <webuijsf:textArea id="campoNombreArchivoUltimaAct1"
                                                    binding="#{ObjecionElePen5.campoNombreArchivoUltimaAct1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{ObjecionElePen5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['nombre_archivo_ultima_act']}"
                                                    toolTip="BundleParametros.nombre_archivo_ultima_act.objecion_ele_pen"
                                                    validatorExpression="#{ObjecionElePen5.validatorNombreArchivoUltimaAct1.validate}"/>
                                                <webuijsf:staticText id="campoNombreArchivoUltimaAct1Texto1"
                                                    binding="#{ObjecionElePen5.campoNombreArchivoUltimaAct1Texto1}"
                                                    text="#{currentRow.value['nombre_archivo_ultima_act']}"/>
                                                <webuijsf:message id="messageNombreArchivoUltimaAct1"
                                                    for="campoNombreArchivoUltimaAct1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnNombreArchivoUltimaAct3" rendered="false"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNombreArchivoUltimaAct3"
                                                    text="#{currentRow.value['nombre_archivo_ultima_act']}"
                                                    rendered="#{ObjecionElePen5.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{ObjecionElePen5.campoNombreArchivoUltimaAct1Boton3}"
                                                    id="campoNombreArchivoUltimaAct1Boton3"
                                                    onClick="#{ObjecionElePen5.asistente.scriptCampoNombreArchivoUltimaAct1Boton3}"
                                                    rendered="#{ObjecionElePen5.asistente.campoNombreArchivoUltimaAct1Boton3Rendered}"
                                                    text="#{ObjecionElePen5.asistente.textCampoNombreArchivoUltimaAct1Boton3}"
                                                    toolTip="#{ObjecionElePen5.asistente.toolTipCampoNombreArchivoUltimaAct1Boton3}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ObjecionElePen5.tableColumnObservaciones1}"
                                                    toolTip="BundleParametros.observaciones.objecion_ele_pen"
                                                    headerText="observaciones"
                                                    id="tableColumnObservaciones1" rendered="false"
                                                    sort="observaciones">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextObservaciones1"
                                                    text="#{currentRow.value['observaciones']}"
                                                    rendered="#{ObjecionElePen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ObjecionElePen5.labelObservaciones1}"
                                                    id="labelObservaciones1"
                                                    for="campoObservaciones1"/>
                                                <webuijsf:textArea id="campoObservaciones1"
                                                    binding="#{ObjecionElePen5.campoObservaciones1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{ObjecionElePen5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['observaciones']}"
                                                    toolTip="BundleParametros.observaciones.objecion_ele_pen"
                                                    validatorExpression="#{ObjecionElePen5.validatorObservaciones1.validate}"/>
                                                <webuijsf:staticText id="campoObservaciones1Texto1"
                                                    binding="#{ObjecionElePen5.campoObservaciones1Texto1}"
                                                    text="#{currentRow.value['observaciones']}"/>
                                                <webuijsf:message id="messageObservaciones1"
                                                    for="campoObservaciones1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ObjecionElePen5.tableColumnFechaAnulacion1}"
                                                    toolTip="BundleParametros.fecha_anulacion.objecion_ele_pen"
                                                    headerText="fecha anulaci&#243;n"
                                                    id="tableColumnFechaAnulacion1" rendered="false"
                                                    sort="fecha_anulacion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextFechaAnulacion1"
                                                    text="#{currentRow.value['fecha_anulacion']}"
                                                    rendered="#{ObjecionElePen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ObjecionElePen5.labelFechaAnulacion1}"
                                                    id="labelFechaAnulacion1"
                                                    for="campoFechaAnulacion1"/>
                                                <webuijsf:textField id="campoFechaAnulacion1"
                                                    binding="#{ObjecionElePen5.campoFechaAnulacion1}"
                                                    converter="#{ObjecionElePen5.converterFechaAnulacion1}"
                                                    readOnly="#{ObjecionElePen5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['fecha_anulacion']}"
                                                    toolTip="BundleParametros.fecha_anulacion.objecion_ele_pen"/>
                                                <webuijsf:staticText id="campoFechaAnulacion1Texto1"
                                                    binding="#{ObjecionElePen5.campoFechaAnulacion1Texto1}"
                                                    converter="#{ObjecionElePen5.converterFechaAnulacion1}"
                                                    text="#{currentRow.value['fecha_anulacion']}"/>
                                                <webuijsf:message id="messageFechaAnulacion1"
                                                    for="campoFechaAnulacion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ObjecionElePen5.tableColumnObservacionesAnulacion1}"
                                                    toolTip="BundleParametros.observaciones_anulacion.objecion_ele_pen"
                                                    headerText="observaciones anulaci&#243;n"
                                                    id="tableColumnObservacionesAnulacion1" rendered="false"
                                                    sort="observaciones_anulacion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextObservacionesAnulacion1"
                                                    text="#{currentRow.value['observaciones_anulacion']}"
                                                    rendered="#{ObjecionElePen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ObjecionElePen5.labelObservacionesAnulacion1}"
                                                    id="labelObservacionesAnulacion1"
                                                    for="campoObservacionesAnulacion1"/>
                                                <webuijsf:textArea id="campoObservacionesAnulacion1"
                                                    binding="#{ObjecionElePen5.campoObservacionesAnulacion1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{ObjecionElePen5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['observaciones_anulacion']}"
                                                    toolTip="BundleParametros.observaciones_anulacion.objecion_ele_pen"
                                                    validatorExpression="#{ObjecionElePen5.validatorObservacionesAnulacion1.validate}"/>
                                                <webuijsf:staticText id="campoObservacionesAnulacion1Texto1"
                                                    binding="#{ObjecionElePen5.campoObservacionesAnulacion1Texto1}"
                                                    text="#{currentRow.value['observaciones_anulacion']}"/>
                                                <webuijsf:message id="messageObservacionesAnulacion1"
                                                    for="campoObservacionesAnulacion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ObjecionElePen5.tableColumnReferencia1}"
                                                    toolTip="BundleParametros.referencia.objecion_ele_pen"
                                                    headerText="referencia"
                                                    id="tableColumnReferencia1" rendered="false"
                                                    sort="referencia">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextReferencia1"
                                                    text="#{currentRow.value['referencia']}"
                                                    rendered="#{ObjecionElePen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ObjecionElePen5.labelReferencia1}"
                                                    id="labelReferencia1"
                                                    for="campoReferencia1"/>
                                                <webuijsf:textArea id="campoReferencia1"
                                                    binding="#{ObjecionElePen5.campoReferencia1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{ObjecionElePen5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['referencia']}"
                                                    toolTip="BundleParametros.referencia.objecion_ele_pen"
                                                    validatorExpression="#{ObjecionElePen5.validatorReferencia1.validate}"/>
                                                <webuijsf:staticText id="campoReferencia1Texto1"
                                                    binding="#{ObjecionElePen5.campoReferencia1Texto1}"
                                                    text="#{currentRow.value['referencia']}"/>
                                                <webuijsf:message id="messageReferencia1"
                                                    for="campoReferencia1"/>
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
                                                        binding="#{ObjecionElePen5.etiquetaTextoFilasPorPagina1}" 
                                                        for="textoFilasPorPagina1"
                                                        id="etiquetaTextoFilasPorPagina1" 
                                                        text="#{ObjecionElePen5.gestor.i18n.textoEtiquetaTextoFilasPorPagina}"/>
                                                </h:panelGrid>
                                                <h:panelGrid 
                                                    columns="3" 
                                                    id="gridPanel107">
                                                    <webuijsf:textField 
                                                        binding="#{ObjecionElePen5.textoFilasPorPagina1}" 
                                                        columns="2"
                                                        converter="#{ObjecionElePen5.textoFilasPorPagina1Converter1}"
                                                        disabled="#{ObjecionElePen5.gestor.paginacionInhabilitada}" 
                                                        id="textoFilasPorPagina1" maxLength="2"
                                                        text="#{ObjecionElePen5.gestor.filasPorPagina}" 
                                                        validatorExpression="#{ObjecionElePen5.textoFilasPorPagina1Validator1.validate}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{ObjecionElePen5.botonRepaginar1_action}"
                                                        binding="#{ObjecionElePen5.botonRepaginar1}" 
                                                        id="botonRepaginar1"
                                                        imageURL="#{ObjecionElePen5.gestor.urlImagenRepaginar}" 
                                                        onClick="#{ObjecionElePen5.gestor.scriptRepaginar}"
                                                        text="#{ObjecionElePen5.gestor.i18n.textoBotonRepaginar}"
                                                        toolTip="#{ObjecionElePen5.gestor.i18n.toolTipBotonRepaginar}"/>
                                                    <webuijsf:message 
                                                        for="textoFilasPorPagina1" 
                                                        id="messageFilasPorPagina1"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="13"
                                                id="gridPanel108">
                                                <webuijsf:button
                                                    actionExpression="#{ObjecionElePen5.botonAgregar1_action}"
                                                    binding="#{ObjecionElePen5.botonAgregar1}"
                                                    disabled="#{ObjecionElePen5.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{ObjecionElePen5.gestor.scriptAgregar}"
                                                    rendered="#{ObjecionElePen5.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ObjecionElePen5.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{ObjecionElePen5.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{ObjecionElePen5.listaFuncionEdicion1}"
                                                    converter="#{ObjecionElePen5.converterListaFuncionEdicion1}"
                                                    disabled="#{ObjecionElePen5.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{ObjecionElePen5.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{ObjecionElePen5.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{ObjecionElePen5.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{ObjecionElePen5.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ObjecionElePen5.botonEditar1_action}"
                                                    binding="#{ObjecionElePen5.botonEditar1}"
                                                    disabled="#{ObjecionElePen5.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{ObjecionElePen5.gestor.scriptEditar}"
                                                    rendered="#{ObjecionElePen5.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ObjecionElePen5.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{ObjecionElePen5.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ObjecionElePen5.botonEliminar1_action}"
                                                    binding="#{ObjecionElePen5.botonEliminar1}"
                                                    disabled="#{ObjecionElePen5.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{ObjecionElePen5.gestor.scriptEliminar}"
                                                    rendered="#{ObjecionElePen5.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ObjecionElePen5.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{ObjecionElePen5.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ObjecionElePen5.botonAplicar1_action}"
                                                    binding="#{ObjecionElePen5.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{ObjecionElePen5.gestor.scriptAplicar}"
                                                    rendered="#{ObjecionElePen5.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ObjecionElePen5.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{ObjecionElePen5.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ObjecionElePen5.botonDeshacer1_action}"
                                                    binding="#{ObjecionElePen5.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{ObjecionElePen5.gestor.scriptDeshacer}"
                                                    rendered="#{ObjecionElePen5.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ObjecionElePen5.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{ObjecionElePen5.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ObjecionElePen5.botonConfirmar1_action}"
                                                    binding="#{ObjecionElePen5.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{ObjecionElePen5.gestor.scriptConfirmar}"
                                                    rendered="#{ObjecionElePen5.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ObjecionElePen5.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{ObjecionElePen5.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ObjecionElePen5.botonDescartar1_action}"
                                                    binding="#{ObjecionElePen5.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{ObjecionElePen5.gestor.scriptDescartar}"
                                                    rendered="#{ObjecionElePen5.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ObjecionElePen5.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{ObjecionElePen5.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{ObjecionElePen5.listaFuncionAccion1}"
                                                    converter="#{ObjecionElePen5.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{ObjecionElePen5.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{ObjecionElePen5.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{ObjecionElePen5.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{ObjecionElePen5.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ObjecionElePen5.botonProcesar1_action}"
                                                    binding="#{ObjecionElePen5.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{ObjecionElePen5.gestor.scriptProcesar}"
                                                    rendered="#{ObjecionElePen5.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ObjecionElePen5.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{ObjecionElePen5.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ObjecionElePen5.botonRefrescar1_action}"
                                                    binding="#{ObjecionElePen5.botonRefrescar1}"
                                                    disabled="#{ObjecionElePen5.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{ObjecionElePen5.gestor.scriptRefrescar}"
                                                    rendered="#{ObjecionElePen5.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ObjecionElePen5.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{ObjecionElePen5.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ObjecionElePen5.botonReconsultar1_action}"
                                                    binding="#{ObjecionElePen5.botonReconsultar1}"
                                                    disabled="#{ObjecionElePen5.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{ObjecionElePen5.gestor.scriptReconsultar}"
                                                    rendered="#{ObjecionElePen5.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ObjecionElePen5.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{ObjecionElePen5.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ObjecionElePen5.botonRetornar1_action}"
                                                    binding="#{ObjecionElePen5.botonRetornar1}"
                                                    disabled="#{ObjecionElePen5.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{ObjecionElePen5.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{ObjecionElePen5.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ObjecionElePen5.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{ObjecionElePen5.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel109"
                                                rendered="#{ObjecionElePen5.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{ObjecionElePen5.imageHyperlink1_action}"
                                                    binding="#{ObjecionElePen5.imageHyperlink1}"
                                                    disabled="#{ObjecionElePen5.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{ObjecionElePen5.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{ObjecionElePen5.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{ObjecionElePen5.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.ObjecionElePen5_imageHyperlink1_toolTip}"/>
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
