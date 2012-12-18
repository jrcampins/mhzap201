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
                    focus="#{LogProImpArcExt5.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{LogProImpArcExt5.gestor.preserveFocus}"
                    preserveScroll="#{LogProImpArcExt5.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{LogProImpArcExt5.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | checkbox1 campoIdLogProImpArcExt1 campoIdArchivoDatosExt1 campoCodigoTipoArcDatExt1 listaNumeroTipoArcDatExt1 campoNombreProveedorDatExt1 campoCodigoProveedorDatExt1 campoCodigoArchivoDatosExt1 campoRutaArchivoDatosExt1 listaEsImportado1 campoObservacion1 campoFechaHoraTransaccion1 textoFilasPorPagina1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | textoFilasPorPagina1 | botonRepaginar1 , virtualForm3 | checkbox1 listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonEscogerFila1 botonDetallarFila1 botonProcesarFila1 botonRetornarFila1 botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{LogProImpArcExt5.breadcrumbs1}" 
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
                                                    rendered="#{LogProImpArcExt5.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{LogProImpArcExt5.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{LogProImpArcExt5.gestor.mensajeDisponible}"
                                                    text="#{LogProImpArcExt5.gestor.mensaje}"
                                                    url="#{LogProImpArcExt5.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:table
                                            binding="#{LogProImpArcExt5.table1}"
                                            clearSortButton="true" 
                                            deselectMultipleButton="true" 
                                            id="table1"
                                            paginateButton="false"
                                            paginationControls="true" 
                                            selectMultipleButton="true" 
                                            sortPanelToggleButton="true"
                                            width="960">
                                            <webuijsf:tableRowGroup 
                                                binding="#{LogProImpArcExt5.tableRowGroup1}" 
                                                id="tableRowGroup1" 
                                                rows="1"
                                                selected="#{LogProImpArcExt5.gestor.filaEscogida}" 
                                                sourceData="#{LogProImpArcExt5.logProImpArcExtDataProvider}" 
                                                sourceVar="currentRow">
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    id="tableRowGroup1SelectionColumn"
                                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);" 
                                                    selectId="checkbox1">
                                                    <webuijsf:checkbox 
                                                        binding="#{LogProImpArcExt5.checkbox1}" 
                                                        id="checkbox1"
                                                        onClick="#{LogProImpArcExt5.gestor.scriptElegir}" 
                                                        selected="#{LogProImpArcExt5.gestor.filaElegida}" 
                                                        toolTip="#{LogProImpArcExt5.gestor.i18n.toolTipCheckboxSeleccionMultiple}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    binding="#{LogProImpArcExt5.tableColumn1}" 
                                                    id="tableColumn1">
                                                    <webuijsf:button 
                                                        actionExpression="#{LogProImpArcExt5.botonEscogerFila1_action}"
                                                        binding="#{LogProImpArcExt5.botonEscogerFila1}"
                                                        disabled="#{LogProImpArcExt5.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonEscogerFila1"
                                                        imageURL="#{LogProImpArcExt5.gestor.urlImagenEscoger}" 
                                                        onClick="#{LogProImpArcExt5.gestor.scriptEscoger}"
                                                        text="#{LogProImpArcExt5.gestor.i18n.textoBotonEscogerFila}"
                                                        toolTip="#{LogProImpArcExt5.gestor.i18n.toolTipBotonEscogerFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{LogProImpArcExt5.botonDetallarFila1_action}"
                                                        binding="#{LogProImpArcExt5.botonDetallarFila1}"
                                                        disabled="#{LogProImpArcExt5.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonDetallarFila1"
                                                        imageURL="#{LogProImpArcExt5.gestor.urlImagenDetallar}" 
                                                        onClick="#{LogProImpArcExt5.scriptAbrirVentanaVerDetalle}"
                                                        rendered="#{LogProImpArcExt5.gestor.detalleDisponible}" 
                                                        text="#{LogProImpArcExt5.gestor.i18n.textoBotonDetallarFila}"
                                                        toolTip="#{LogProImpArcExt5.gestor.i18n.toolTipBotonDetallarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{LogProImpArcExt5.botonProcesarFila1_action}"
                                                        binding="#{LogProImpArcExt5.botonProcesarFila1}"
                                                        disabled="#{LogProImpArcExt5.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonProcesarFila1"
                                                        imageURL="#{LogProImpArcExt5.gestor.urlImagenProcesar}" 
                                                        onClick="#{LogProImpArcExt5.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{LogProImpArcExt5.asistente.comandoDisponible}" 
                                                        text="#{LogProImpArcExt5.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{LogProImpArcExt5.gestor.i18n.toolTipBotonProcesarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{LogProImpArcExt5.botonRetornarFila1_action}"
                                                        binding="#{LogProImpArcExt5.botonRetornarFila1}" 
                                                        disabled="#{LogProImpArcExt5.gestor.funcionReturnInhabilitada}"
                                                        id="botonRetornarFila1"
                                                        imageURL="#{LogProImpArcExt5.gestor.urlImagenRetornar}"
                                                        onClick="#{LogProImpArcExt5.gestor.scriptRetornarRecursoActual}"
                                                        rendered="#{LogProImpArcExt5.gestor.funcionReturnVisible}" 
                                                        text="#{LogProImpArcExt5.gestor.i18n.textoBotonRetornarFila}"
                                                        toolTip="#{LogProImpArcExt5.gestor.i18n.toolTipBotonRetornarFila}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogProImpArcExt5.tableColumn2}"
                                                    id="tableColumn2"
                                                    rendered="#{LogProImpArcExt5.gestor.designing}">
                                                    <webuijsf:imageHyperlink
                                                        actionExpression="#{LogProImpArcExt5.hipervinculoAccionFila1_action}"
                                                        binding="#{LogProImpArcExt5.hipervinculoAccionFila1}"
                                                        disabled="#{LogProImpArcExt5.gestor.loteConCambios}"
                                                        id="hipervinculoAccionFila1"
                                                        imageURL="#{LogProImpArcExt5.gestor.urlImagenEjecutarVinculo}"
                                                        onClick="#{LogProImpArcExt5.scriptAbrirVentanaAccionFila1}"
                                                        text="Accion1"
                                                        toolTip="#{bundle.LogProImpArcExt5_hipervinculoAccionFila1_toolTip}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="right" 
                                                    binding="#{LogProImpArcExt5.tableColumn3}" 
                                                    headerText="#{LogProImpArcExt5.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{LogProImpArcExt5.gestor.i18n.toolTipEtiquetaIdentificacionFila}"
                                                    id="tableColumn3">
                                                    <webuijsf:imageHyperlink 
                                                        actionExpression="#{LogProImpArcExt5.hipervinculoDetallarFila1_action}"
                                                        binding="#{LogProImpArcExt5.hipervinculoDetallarFila1}" 
                                                        id="hipervinculoDetallarFila1"
                                                        imageURL="#{LogProImpArcExt5.gestor.urlImagenFilaProcesada}"
                                                        textPosition="left" 
                                                        text="#{LogProImpArcExt5.gestor.identificacionFila}" 
                                                        toolTip="#{LogProImpArcExt5.gestor.toolTipImagenFilaProcesada}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogProImpArcExt5.tableColumnIdLogProImpArcExt1}"
                                                    headerText="identificaci&#243;n"
                                                    id="tableColumnIdLogProImpArcExt1" rendered="false"
                                                    sort="id_log_pro_imp_arc_ext">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdLogProImpArcExt1"
                                                    text="#{currentRow.value['id_log_pro_imp_arc_ext']}"
                                                    rendered="#{LogProImpArcExt5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogProImpArcExt5.labelIdLogProImpArcExt1}"
                                                    id="labelIdLogProImpArcExt1"
                                                    for="campoIdLogProImpArcExt1"/>
                                                <webuijsf:textField id="campoIdLogProImpArcExt1"
                                                    binding="#{LogProImpArcExt5.campoIdLogProImpArcExt1}"
                                                    converter="#{LogProImpArcExt5.converterIdLogProImpArcExt1}"
                                                    readOnly="#{LogProImpArcExt5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['id_log_pro_imp_arc_ext']}"
                                                    toolTip="BundleParametros.id_log_pro_imp_arc_ext.log_pro_imp_arc_ext"
                                                    validatorExpression="#{LogProImpArcExt5.validatorIdLogProImpArcExt1.validate}"/>
                                                <webuijsf:staticText id="campoIdLogProImpArcExt1Texto1"
                                                    binding="#{LogProImpArcExt5.campoIdLogProImpArcExt1Texto1}"
                                                    text="#{currentRow.value['id_log_pro_imp_arc_ext']}"/>
                                                <webuijsf:message id="messageIdLogProImpArcExt1"
                                                    for="campoIdLogProImpArcExt1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogProImpArcExt5.tableColumnIdArchivoDatosExt1}"
                                                    headerText="archivo datos externos"
                                                    id="tableColumnIdArchivoDatosExt1"
                                                    sort="codigo_archivo_datos_ext_1x1y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdArchivoDatosExt1"
                                                    text="#{currentRow.value['codigo_archivo_datos_ext_1x1y3']}"
                                                    rendered="#{LogProImpArcExt5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogProImpArcExt5.labelIdArchivoDatosExt1}"
                                                    id="labelIdArchivoDatosExt1"
                                                    for="campoIdArchivoDatosExt1"/>
                                                <webuijsf:textField id="campoIdArchivoDatosExt1"
                                                    binding="#{LogProImpArcExt5.campoIdArchivoDatosExt1}"
                                                    readOnly="#{LogProImpArcExt5.gestor.filaNoProcesada}"
                                                    text="#{LogProImpArcExt5.asistente.textoCampoIdArchivoDatosExt1}"
                                                    toolTip="#{LogProImpArcExt5.asistente.toolTipCampoIdArchivoDatosExt1}"
                                                    validatorExpression="#{LogProImpArcExt5.campoIdArchivoDatosExt1_validate}"/>
                                                <webuijsf:staticText id="campoIdArchivoDatosExt1Texto1"
                                                    binding="#{LogProImpArcExt5.campoIdArchivoDatosExt1Texto1}"
                                                    text="#{currentRow.value['codigo_archivo_datos_ext_1x1y3']}"/>
                                                <webuijsf:message id="messageIdArchivoDatosExt1"
                                                    for="campoIdArchivoDatosExt1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdArchivoDatosExt3"
                                                    rendered="#{LogProImpArcExt5.asistente.tableColumnIdArchivoDatosExt3Rendered}"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdArchivoDatosExt3"
                                                    text="#{currentRow.value['id_archivo_datos_ext']}"
                                                    rendered="#{LogProImpArcExt5.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{LogProImpArcExt5.campoIdArchivoDatosExt1Boton1}"
                                                    id="campoIdArchivoDatosExt1Boton1"
                                                    onClick="#{LogProImpArcExt5.asistente.scriptCampoIdArchivoDatosExt1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{LogProImpArcExt5.campoIdArchivoDatosExt1Boton3}"
                                                    id="campoIdArchivoDatosExt1Boton3"
                                                    onClick="#{LogProImpArcExt5.asistente.scriptCampoIdArchivoDatosExt1Boton2}"
                                                    rendered="#{LogProImpArcExt5.asistente.campoIdArchivoDatosExt1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{LogProImpArcExt5.tableColumnIdArchivoDatosExt2}"
                                                    headerText="nombre archivo datos externos"
                                                    id="tableColumnIdArchivoDatosExt2"
                                                    rendered="#{LogProImpArcExt5.asistente.campoIdArchivoDatosExt1Boton2Rendered}"
                                                    sort="nombre_archivo_datos_ext_1x1y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdArchivoDatosExt2"
                                                    text="#{currentRow.value['nombre_archivo_datos_ext_1x1y4']}"
                                                    rendered="#{LogProImpArcExt5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogProImpArcExt5.labelIdArchivoDatosExt2}"
                                                    id="labelIdArchivoDatosExt2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{LogProImpArcExt5.campoIdArchivoDatosExt1Hiper1}"
                                                    id="campoIdArchivoDatosExt1Hiper1"
                                                    text="#{currentRow.value['nombre_archivo_datos_ext_1x1y4']}"
                                                    onClick="#{LogProImpArcExt5.asistente.scriptCampoIdArchivoDatosExt1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdArchivoDatosExt1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogProImpArcExt5.tableColumnCodigoTipoArcDatExt1}"
                                                    headerText="c&#243;digo tipo archivo datos externos"
                                                    id="tableColumnCodigoTipoArcDatExt1" rendered="false"
                                                    sort="codigo_tipo_arc_dat_ext">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextCodigoTipoArcDatExt1"
                                                    text="#{currentRow.value['codigo_tipo_arc_dat_ext']}"
                                                    rendered="#{LogProImpArcExt5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogProImpArcExt5.labelCodigoTipoArcDatExt1}"
                                                    id="labelCodigoTipoArcDatExt1"
                                                    for="campoCodigoTipoArcDatExt1"/>
                                                <webuijsf:textArea id="campoCodigoTipoArcDatExt1"
                                                    binding="#{LogProImpArcExt5.campoCodigoTipoArcDatExt1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogProImpArcExt5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['codigo_tipo_arc_dat_ext']}"
                                                    toolTip="BundleParametros.codigo_tipo_arc_dat_ext.log_pro_imp_arc_ext"
                                                    validatorExpression="#{LogProImpArcExt5.validatorCodigoTipoArcDatExt1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoTipoArcDatExt1Texto1"
                                                    binding="#{LogProImpArcExt5.campoCodigoTipoArcDatExt1Texto1}"
                                                    text="#{currentRow.value['codigo_tipo_arc_dat_ext']}"/>
                                                <webuijsf:message id="messageCodigoTipoArcDatExt1"
                                                    for="campoCodigoTipoArcDatExt1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogProImpArcExt5.tableColumnNumeroTipoArcDatExt1}"
                                                    headerText="tipo archivo datos externos"
                                                    id="tableColumnNumeroTipoArcDatExt1" rendered="false"
                                                    sort="codigo_tipo_arc_dat_ext_1x2y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroTipoArcDatExt1"
                                                    text="#{currentRow.value['codigo_tipo_arc_dat_ext_1x2y2']}"
                                                    rendered="#{LogProImpArcExt5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogProImpArcExt5.labelNumeroTipoArcDatExt1}"
                                                    id="labelNumeroTipoArcDatExt1"
                                                    for="listaNumeroTipoArcDatExt1"/>
                                                <webuijsf:dropDown id="listaNumeroTipoArcDatExt1"
                                                    binding="#{LogProImpArcExt5.listaNumeroTipoArcDatExt1}"
                                                    converter="#{LogProImpArcExt5.converterNumeroTipoArcDatExt1}"
                                                    disabled="#{LogProImpArcExt5.gestor.filaNoProcesada}"
                                                    items="#{LogProImpArcExt5.asistente.opcionesListaNumeroTipoArcDatExt1}"
                                                    selected="#{currentRow.value['numero_tipo_arc_dat_ext']}"
                                                    toolTip="BundleParametros.numero_tipo_arc_dat_ext.log_pro_imp_arc_ext"/>
                                                <webuijsf:staticText id="listaNumeroTipoArcDatExt1Texto1"
                                                    binding="#{LogProImpArcExt5.listaNumeroTipoArcDatExt1Texto1}"
                                                    text="#{currentRow.value['codigo_tipo_arc_dat_ext_1x2y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoArcDatExt1"
                                                    for="listaNumeroTipoArcDatExt1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogProImpArcExt5.tableColumnNombreProveedorDatExt1}"
                                                    headerText="nombre proveedor datos externos"
                                                    id="tableColumnNombreProveedorDatExt1" rendered="false"
                                                    sort="nombre_proveedor_dat_ext">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNombreProveedorDatExt1"
                                                    text="#{currentRow.value['nombre_proveedor_dat_ext']}"
                                                    rendered="#{LogProImpArcExt5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogProImpArcExt5.labelNombreProveedorDatExt1}"
                                                    id="labelNombreProveedorDatExt1"
                                                    for="campoNombreProveedorDatExt1"/>
                                                <webuijsf:textArea id="campoNombreProveedorDatExt1"
                                                    binding="#{LogProImpArcExt5.campoNombreProveedorDatExt1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogProImpArcExt5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['nombre_proveedor_dat_ext']}"
                                                    toolTip="BundleParametros.nombre_proveedor_dat_ext.log_pro_imp_arc_ext"
                                                    validatorExpression="#{LogProImpArcExt5.validatorNombreProveedorDatExt1.validate}"/>
                                                <webuijsf:staticText id="campoNombreProveedorDatExt1Texto1"
                                                    binding="#{LogProImpArcExt5.campoNombreProveedorDatExt1Texto1}"
                                                    text="#{currentRow.value['nombre_proveedor_dat_ext']}"/>
                                                <webuijsf:message id="messageNombreProveedorDatExt1"
                                                    for="campoNombreProveedorDatExt1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogProImpArcExt5.tableColumnCodigoProveedorDatExt1}"
                                                    headerText="c&#243;digo proveedor datos externos"
                                                    id="tableColumnCodigoProveedorDatExt1" rendered="false"
                                                    sort="codigo_proveedor_dat_ext">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextCodigoProveedorDatExt1"
                                                    text="#{currentRow.value['codigo_proveedor_dat_ext']}"
                                                    rendered="#{LogProImpArcExt5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogProImpArcExt5.labelCodigoProveedorDatExt1}"
                                                    id="labelCodigoProveedorDatExt1"
                                                    for="campoCodigoProveedorDatExt1"/>
                                                <webuijsf:textArea id="campoCodigoProveedorDatExt1"
                                                    binding="#{LogProImpArcExt5.campoCodigoProveedorDatExt1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogProImpArcExt5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['codigo_proveedor_dat_ext']}"
                                                    toolTip="BundleParametros.codigo_proveedor_dat_ext.log_pro_imp_arc_ext"
                                                    validatorExpression="#{LogProImpArcExt5.validatorCodigoProveedorDatExt1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoProveedorDatExt1Texto1"
                                                    binding="#{LogProImpArcExt5.campoCodigoProveedorDatExt1Texto1}"
                                                    text="#{currentRow.value['codigo_proveedor_dat_ext']}"/>
                                                <webuijsf:message id="messageCodigoProveedorDatExt1"
                                                    for="campoCodigoProveedorDatExt1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogProImpArcExt5.tableColumnCodigoArchivoDatosExt1}"
                                                    headerText="c&#243;digo archivo datos externos"
                                                    id="tableColumnCodigoArchivoDatosExt1" rendered="false"
                                                    sort="codigo_archivo_datos_ext">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextCodigoArchivoDatosExt1"
                                                    text="#{currentRow.value['codigo_archivo_datos_ext']}"
                                                    rendered="#{LogProImpArcExt5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogProImpArcExt5.labelCodigoArchivoDatosExt1}"
                                                    id="labelCodigoArchivoDatosExt1"
                                                    for="campoCodigoArchivoDatosExt1"/>
                                                <webuijsf:textArea id="campoCodigoArchivoDatosExt1"
                                                    binding="#{LogProImpArcExt5.campoCodigoArchivoDatosExt1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogProImpArcExt5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['codigo_archivo_datos_ext']}"
                                                    toolTip="BundleParametros.codigo_archivo_datos_ext.log_pro_imp_arc_ext"
                                                    validatorExpression="#{LogProImpArcExt5.validatorCodigoArchivoDatosExt1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoArchivoDatosExt1Texto1"
                                                    binding="#{LogProImpArcExt5.campoCodigoArchivoDatosExt1Texto1}"
                                                    text="#{currentRow.value['codigo_archivo_datos_ext']}"/>
                                                <webuijsf:message id="messageCodigoArchivoDatosExt1"
                                                    for="campoCodigoArchivoDatosExt1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogProImpArcExt5.tableColumnRutaArchivoDatosExt1}"
                                                    headerText="ruta archivo datos externos"
                                                    id="tableColumnRutaArchivoDatosExt1" rendered="false"
                                                    sort="ruta_archivo_datos_ext">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextRutaArchivoDatosExt1"
                                                    text="#{currentRow.value['ruta_archivo_datos_ext']}"
                                                    rendered="#{LogProImpArcExt5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogProImpArcExt5.labelRutaArchivoDatosExt1}"
                                                    id="labelRutaArchivoDatosExt1"
                                                    for="campoRutaArchivoDatosExt1"/>
                                                <webuijsf:textArea id="campoRutaArchivoDatosExt1"
                                                    binding="#{LogProImpArcExt5.campoRutaArchivoDatosExt1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogProImpArcExt5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['ruta_archivo_datos_ext']}"
                                                    toolTip="BundleParametros.ruta_archivo_datos_ext.log_pro_imp_arc_ext"
                                                    validatorExpression="#{LogProImpArcExt5.validatorRutaArchivoDatosExt1.validate}"/>
                                                <webuijsf:staticText id="campoRutaArchivoDatosExt1Texto1"
                                                    binding="#{LogProImpArcExt5.campoRutaArchivoDatosExt1Texto1}"
                                                    text="#{currentRow.value['ruta_archivo_datos_ext']}"/>
                                                <webuijsf:message id="messageRutaArchivoDatosExt1"
                                                    for="campoRutaArchivoDatosExt1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogProImpArcExt5.tableColumnEsImportado1}"
                                                    headerText="importado"
                                                    id="tableColumnEsImportado1"
                                                    sort="es_importado">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsImportado1"
                                                    text="#{currentRow.value['es_importado']}"
                                                    rendered="#{LogProImpArcExt5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogProImpArcExt5.labelEsImportado1}"
                                                    id="labelEsImportado1"
                                                    for="listaEsImportado1"/>
                                                <webuijsf:dropDown id="listaEsImportado1"
                                                    binding="#{LogProImpArcExt5.listaEsImportado1}"
                                                    converter="#{LogProImpArcExt5.converterEsImportado1}"
                                                    disabled="#{LogProImpArcExt5.gestor.filaNoProcesada}" required="true"
                                                    items="#{LogProImpArcExt5.asistente.opcionesListaEsImportado1}"
                                                    selected="#{currentRow.value['es_importado']}"
                                                    toolTip="BundleParametros.es_importado.log_pro_imp_arc_ext"/>
                                                <webuijsf:staticText id="listaEsImportado1Texto1"
                                                    binding="#{LogProImpArcExt5.listaEsImportado1Texto1}"/>
                                                <webuijsf:message id="messageEsImportado1"
                                                    for="listaEsImportado1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogProImpArcExt5.tableColumnObservacion1}"
                                                    headerText="observaci&#243;n"
                                                    id="tableColumnObservacion1" rendered="false"
                                                    sort="observacion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextObservacion1"
                                                    text="#{currentRow.value['observacion']}"
                                                    rendered="#{LogProImpArcExt5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogProImpArcExt5.labelObservacion1}"
                                                    id="labelObservacion1"
                                                    for="campoObservacion1"/>
                                                <webuijsf:textArea id="campoObservacion1"
                                                    binding="#{LogProImpArcExt5.campoObservacion1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogProImpArcExt5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['observacion']}"
                                                    toolTip="BundleParametros.observacion.log_pro_imp_arc_ext"
                                                    validatorExpression="#{LogProImpArcExt5.validatorObservacion1.validate}"/>
                                                <webuijsf:staticText id="campoObservacion1Texto1"
                                                    binding="#{LogProImpArcExt5.campoObservacion1Texto1}"
                                                    text="#{currentRow.value['observacion']}"/>
                                                <webuijsf:message id="messageObservacion1"
                                                    for="campoObservacion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogProImpArcExt5.tableColumnFechaHoraTransaccion1}"
                                                    headerText="fecha hora transacci&#243;n"
                                                    id="tableColumnFechaHoraTransaccion1"
                                                    sort="fecha_hora_transaccion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextFechaHoraTransaccion1"
                                                    text="#{currentRow.value['fecha_hora_transaccion']}"
                                                    rendered="#{LogProImpArcExt5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogProImpArcExt5.labelFechaHoraTransaccion1}"
                                                    id="labelFechaHoraTransaccion1"
                                                    for="campoFechaHoraTransaccion1"/>
                                                <webuijsf:textField id="campoFechaHoraTransaccion1"
                                                    binding="#{LogProImpArcExt5.campoFechaHoraTransaccion1}"
                                                    converter="#{LogProImpArcExt5.converterFechaHoraTransaccion1}"
                                                    readOnly="#{LogProImpArcExt5.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['fecha_hora_transaccion']}"
                                                    toolTip="BundleParametros.fecha_hora_transaccion.log_pro_imp_arc_ext"/>
                                                <webuijsf:staticText id="campoFechaHoraTransaccion1Texto1"
                                                    binding="#{LogProImpArcExt5.campoFechaHoraTransaccion1Texto1}"
                                                    converter="#{LogProImpArcExt5.converterFechaHoraTransaccion1}"
                                                    text="#{currentRow.value['fecha_hora_transaccion']}"/>
                                                <webuijsf:message id="messageFechaHoraTransaccion1"
                                                    for="campoFechaHoraTransaccion1"/>
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
                                                        binding="#{LogProImpArcExt5.etiquetaTextoFilasPorPagina1}" 
                                                        for="textoFilasPorPagina1"
                                                        id="etiquetaTextoFilasPorPagina1" 
                                                        text="#{LogProImpArcExt5.gestor.i18n.textoEtiquetaTextoFilasPorPagina}"/>
                                                </h:panelGrid>
                                                <h:panelGrid 
                                                    columns="3" 
                                                    id="gridPanel107">
                                                    <webuijsf:textField 
                                                        binding="#{LogProImpArcExt5.textoFilasPorPagina1}" 
                                                        columns="2"
                                                        converter="#{LogProImpArcExt5.textoFilasPorPagina1Converter1}"
                                                        disabled="#{LogProImpArcExt5.gestor.paginacionInhabilitada}" 
                                                        id="textoFilasPorPagina1" maxLength="2"
                                                        text="#{LogProImpArcExt5.gestor.filasPorPagina}" 
                                                        validatorExpression="#{LogProImpArcExt5.textoFilasPorPagina1Validator1.validate}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{LogProImpArcExt5.botonRepaginar1_action}"
                                                        binding="#{LogProImpArcExt5.botonRepaginar1}" 
                                                        id="botonRepaginar1"
                                                        imageURL="#{LogProImpArcExt5.gestor.urlImagenRepaginar}" 
                                                        onClick="#{LogProImpArcExt5.gestor.scriptRepaginar}"
                                                        text="#{LogProImpArcExt5.gestor.i18n.textoBotonRepaginar}"
                                                        toolTip="#{LogProImpArcExt5.gestor.i18n.toolTipBotonRepaginar}"/>
                                                    <webuijsf:message 
                                                        for="textoFilasPorPagina1" 
                                                        id="messageFilasPorPagina1"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="13"
                                                id="gridPanel108">
                                                <webuijsf:button
                                                    actionExpression="#{LogProImpArcExt5.botonAgregar1_action}"
                                                    binding="#{LogProImpArcExt5.botonAgregar1}"
                                                    disabled="#{LogProImpArcExt5.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{LogProImpArcExt5.gestor.scriptAgregar}"
                                                    rendered="#{LogProImpArcExt5.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProImpArcExt5.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{LogProImpArcExt5.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{LogProImpArcExt5.listaFuncionEdicion1}"
                                                    converter="#{LogProImpArcExt5.converterListaFuncionEdicion1}"
                                                    disabled="#{LogProImpArcExt5.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{LogProImpArcExt5.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{LogProImpArcExt5.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{LogProImpArcExt5.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{LogProImpArcExt5.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProImpArcExt5.botonEditar1_action}"
                                                    binding="#{LogProImpArcExt5.botonEditar1}"
                                                    disabled="#{LogProImpArcExt5.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{LogProImpArcExt5.gestor.scriptEditar}"
                                                    rendered="#{LogProImpArcExt5.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProImpArcExt5.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{LogProImpArcExt5.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProImpArcExt5.botonEliminar1_action}"
                                                    binding="#{LogProImpArcExt5.botonEliminar1}"
                                                    disabled="#{LogProImpArcExt5.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{LogProImpArcExt5.gestor.scriptEliminar}"
                                                    rendered="#{LogProImpArcExt5.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProImpArcExt5.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{LogProImpArcExt5.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProImpArcExt5.botonAplicar1_action}"
                                                    binding="#{LogProImpArcExt5.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{LogProImpArcExt5.gestor.scriptAplicar}"
                                                    rendered="#{LogProImpArcExt5.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProImpArcExt5.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{LogProImpArcExt5.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProImpArcExt5.botonDeshacer1_action}"
                                                    binding="#{LogProImpArcExt5.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{LogProImpArcExt5.gestor.scriptDeshacer}"
                                                    rendered="#{LogProImpArcExt5.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProImpArcExt5.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{LogProImpArcExt5.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProImpArcExt5.botonConfirmar1_action}"
                                                    binding="#{LogProImpArcExt5.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{LogProImpArcExt5.gestor.scriptConfirmar}"
                                                    rendered="#{LogProImpArcExt5.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProImpArcExt5.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{LogProImpArcExt5.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProImpArcExt5.botonDescartar1_action}"
                                                    binding="#{LogProImpArcExt5.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{LogProImpArcExt5.gestor.scriptDescartar}"
                                                    rendered="#{LogProImpArcExt5.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProImpArcExt5.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{LogProImpArcExt5.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{LogProImpArcExt5.listaFuncionAccion1}"
                                                    converter="#{LogProImpArcExt5.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{LogProImpArcExt5.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{LogProImpArcExt5.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{LogProImpArcExt5.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{LogProImpArcExt5.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProImpArcExt5.botonProcesar1_action}"
                                                    binding="#{LogProImpArcExt5.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{LogProImpArcExt5.gestor.scriptProcesar}"
                                                    rendered="#{LogProImpArcExt5.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProImpArcExt5.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{LogProImpArcExt5.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProImpArcExt5.botonRefrescar1_action}"
                                                    binding="#{LogProImpArcExt5.botonRefrescar1}"
                                                    disabled="#{LogProImpArcExt5.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{LogProImpArcExt5.gestor.scriptRefrescar}"
                                                    rendered="#{LogProImpArcExt5.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProImpArcExt5.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{LogProImpArcExt5.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProImpArcExt5.botonReconsultar1_action}"
                                                    binding="#{LogProImpArcExt5.botonReconsultar1}"
                                                    disabled="#{LogProImpArcExt5.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{LogProImpArcExt5.gestor.scriptReconsultar}"
                                                    rendered="#{LogProImpArcExt5.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProImpArcExt5.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{LogProImpArcExt5.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProImpArcExt5.botonRetornar1_action}"
                                                    binding="#{LogProImpArcExt5.botonRetornar1}"
                                                    disabled="#{LogProImpArcExt5.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{LogProImpArcExt5.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{LogProImpArcExt5.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProImpArcExt5.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{LogProImpArcExt5.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel109"
                                                rendered="#{LogProImpArcExt5.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{LogProImpArcExt5.imageHyperlink1_action}"
                                                    binding="#{LogProImpArcExt5.imageHyperlink1}"
                                                    disabled="#{LogProImpArcExt5.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{LogProImpArcExt5.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{LogProImpArcExt5.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{LogProImpArcExt5.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.LogProImpArcExt5_imageHyperlink1_toolTip}"/>
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
