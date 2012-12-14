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
                    focus="#{ArchivoDatosExt1.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{ArchivoDatosExt1.gestor.preserveFocus}"
                    preserveScroll="#{ArchivoDatosExt1.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{ArchivoDatosExt1.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | checkbox1 campoIdArchivoDatosExt1 campoCodigoArchivoDatosExt1 campoNombreArchivoDatosExt1 campoIdProveedorDatExt1 listaNumeroTipoArcDatExt1 listaEsArchivoDatosExtImportado1 campoFechaHoraUltimaCarga1 campoIdUsuarioUltimaCarga1 campoFechaHoraUltimaImportacion1 campoIdUsuarioUltimaImportacion1 textoFilasPorPagina1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | textoFilasPorPagina1 | botonRepaginar1 , virtualForm3 | checkbox1 listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonEscogerFila1 botonDetallarFila1 botonProcesarFila1 botonRetornarFila1 botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{ArchivoDatosExt1.breadcrumbs1}" 
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
                                                    rendered="#{ArchivoDatosExt1.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{ArchivoDatosExt1.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{ArchivoDatosExt1.gestor.mensajeDisponible}"
                                                    text="#{ArchivoDatosExt1.gestor.mensaje}"
                                                    url="#{ArchivoDatosExt1.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:table
                                            binding="#{ArchivoDatosExt1.table1}"
                                            clearSortButton="true" 
                                            deselectMultipleButton="true" 
                                            id="table1"
                                            paginateButton="false"
                                            paginationControls="true" 
                                            selectMultipleButton="true" 
                                            sortPanelToggleButton="true"
                                            width="960">
                                            <webuijsf:tableRowGroup 
                                                binding="#{ArchivoDatosExt1.tableRowGroup1}" 
                                                id="tableRowGroup1" 
                                                rows="1"
                                                selected="#{ArchivoDatosExt1.gestor.filaEscogida}" 
                                                sourceData="#{ArchivoDatosExt1.archivoDatosExtDataProvider}" 
                                                sourceVar="currentRow">
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    id="tableRowGroup1SelectionColumn"
                                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);" 
                                                    selectId="checkbox1">
                                                    <webuijsf:checkbox 
                                                        binding="#{ArchivoDatosExt1.checkbox1}" 
                                                        id="checkbox1"
                                                        onClick="#{ArchivoDatosExt1.gestor.scriptElegir}" 
                                                        selected="#{ArchivoDatosExt1.gestor.filaElegida}" 
                                                        toolTip="#{ArchivoDatosExt1.gestor.i18n.toolTipCheckboxSeleccionMultiple}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    binding="#{ArchivoDatosExt1.tableColumn1}" 
                                                    id="tableColumn1">
                                                    <webuijsf:button 
                                                        actionExpression="#{ArchivoDatosExt1.botonEscogerFila1_action}"
                                                        binding="#{ArchivoDatosExt1.botonEscogerFila1}"
                                                        disabled="#{ArchivoDatosExt1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonEscogerFila1"
                                                        imageURL="#{ArchivoDatosExt1.gestor.urlImagenEscoger}" 
                                                        onClick="#{ArchivoDatosExt1.gestor.scriptEscoger}"
                                                        text="#{ArchivoDatosExt1.gestor.i18n.textoBotonEscogerFila}"
                                                        toolTip="#{ArchivoDatosExt1.gestor.i18n.toolTipBotonEscogerFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{ArchivoDatosExt1.botonDetallarFila1_action}"
                                                        binding="#{ArchivoDatosExt1.botonDetallarFila1}"
                                                        disabled="#{ArchivoDatosExt1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonDetallarFila1"
                                                        imageURL="#{ArchivoDatosExt1.gestor.urlImagenDetallar}" 
                                                        onClick="#{ArchivoDatosExt1.scriptAbrirVentanaVerDetalle}"
                                                        rendered="#{ArchivoDatosExt1.gestor.detalleDisponible}" 
                                                        text="#{ArchivoDatosExt1.gestor.i18n.textoBotonDetallarFila}"
                                                        toolTip="#{ArchivoDatosExt1.gestor.i18n.toolTipBotonDetallarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{ArchivoDatosExt1.botonProcesarFila1_action}"
                                                        binding="#{ArchivoDatosExt1.botonProcesarFila1}"
                                                        disabled="#{ArchivoDatosExt1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonProcesarFila1"
                                                        imageURL="#{ArchivoDatosExt1.gestor.urlImagenProcesar}" 
                                                        onClick="#{ArchivoDatosExt1.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{ArchivoDatosExt1.asistente.comandoDisponible}" 
                                                        text="#{ArchivoDatosExt1.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{ArchivoDatosExt1.gestor.i18n.toolTipBotonProcesarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{ArchivoDatosExt1.botonRetornarFila1_action}"
                                                        binding="#{ArchivoDatosExt1.botonRetornarFila1}" 
                                                        disabled="#{ArchivoDatosExt1.gestor.funcionReturnInhabilitada}"
                                                        id="botonRetornarFila1"
                                                        imageURL="#{ArchivoDatosExt1.gestor.urlImagenRetornar}"
                                                        onClick="#{ArchivoDatosExt1.gestor.scriptRetornarRecursoActual}"
                                                        rendered="#{ArchivoDatosExt1.gestor.funcionReturnVisible}" 
                                                        text="#{ArchivoDatosExt1.gestor.i18n.textoBotonRetornarFila}"
                                                        toolTip="#{ArchivoDatosExt1.gestor.i18n.toolTipBotonRetornarFila}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ArchivoDatosExt1.tableColumn2}"
                                                    id="tableColumn2"
                                                    rendered="#{ArchivoDatosExt1.gestor.designing}">
                                                    <webuijsf:imageHyperlink
                                                        actionExpression="#{ArchivoDatosExt1.hipervinculoAccionFila1_action}"
                                                        binding="#{ArchivoDatosExt1.hipervinculoAccionFila1}"
                                                        disabled="#{ArchivoDatosExt1.gestor.loteConCambios}"
                                                        id="hipervinculoAccionFila1"
                                                        imageURL="#{ArchivoDatosExt1.gestor.urlImagenEjecutarVinculo}"
                                                        onClick="#{ArchivoDatosExt1.scriptAbrirVentanaAccionFila1}"
                                                        text="Accion1"
                                                        toolTip="#{bundle.ArchivoDatosExt1_hipervinculoAccionFila1_toolTip}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="right" 
                                                    binding="#{ArchivoDatosExt1.tableColumn3}" 
                                                    headerText="#{ArchivoDatosExt1.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{ArchivoDatosExt1.gestor.i18n.toolTipEtiquetaIdentificacionFila}"
                                                    id="tableColumn3">
                                                    <webuijsf:imageHyperlink 
                                                        actionExpression="#{ArchivoDatosExt1.hipervinculoDetallarFila1_action}"
                                                        binding="#{ArchivoDatosExt1.hipervinculoDetallarFila1}" 
                                                        id="hipervinculoDetallarFila1"
                                                        imageURL="#{ArchivoDatosExt1.gestor.urlImagenFilaProcesada}"
                                                        textPosition="left" 
                                                        text="#{ArchivoDatosExt1.gestor.identificacionFila}" 
                                                        toolTip="#{ArchivoDatosExt1.gestor.toolTipImagenFilaProcesada}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ArchivoDatosExt1.tableColumnIdArchivoDatosExt1}"
                                                    headerText="id"
                                                    id="tableColumnIdArchivoDatosExt1" rendered="false"
                                                    sort="id_archivo_datos_ext">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdArchivoDatosExt1"
                                                    text="#{currentRow.value['id_archivo_datos_ext']}"
                                                    rendered="#{ArchivoDatosExt1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ArchivoDatosExt1.labelIdArchivoDatosExt1}"
                                                    id="labelIdArchivoDatosExt1"
                                                    for="campoIdArchivoDatosExt1"/>
                                                <webuijsf:textField id="campoIdArchivoDatosExt1"
                                                    binding="#{ArchivoDatosExt1.campoIdArchivoDatosExt1}"
                                                    converter="#{ArchivoDatosExt1.converterIdArchivoDatosExt1}"
                                                    readOnly="#{ArchivoDatosExt1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['id_archivo_datos_ext']}"
                                                    toolTip="BundleParametros.id_archivo_datos_ext.archivo_datos_ext"
                                                    validatorExpression="#{ArchivoDatosExt1.validatorIdArchivoDatosExt1.validate}"/>
                                                <webuijsf:staticText id="campoIdArchivoDatosExt1Texto1"
                                                    binding="#{ArchivoDatosExt1.campoIdArchivoDatosExt1Texto1}"
                                                    text="#{currentRow.value['id_archivo_datos_ext']}"/>
                                                <webuijsf:message id="messageIdArchivoDatosExt1"
                                                    for="campoIdArchivoDatosExt1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ArchivoDatosExt1.tableColumnCodigoArchivoDatosExt1}"
                                                    headerText="codigo"
                                                    id="tableColumnCodigoArchivoDatosExt1"
                                                    sort="codigo_archivo_datos_ext">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextCodigoArchivoDatosExt1"
                                                    text="#{currentRow.value['codigo_archivo_datos_ext']}"
                                                    rendered="#{ArchivoDatosExt1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ArchivoDatosExt1.labelCodigoArchivoDatosExt1}"
                                                    id="labelCodigoArchivoDatosExt1"
                                                    for="campoCodigoArchivoDatosExt1"/>
                                                <webuijsf:textField id="campoCodigoArchivoDatosExt1"
                                                    binding="#{ArchivoDatosExt1.campoCodigoArchivoDatosExt1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{ArchivoDatosExt1.gestor.filaNoCreada}" required="true"
                                                    text="#{currentRow.value['codigo_archivo_datos_ext']}"
                                                    toolTip="BundleParametros.codigo_archivo_datos_ext.archivo_datos_ext"
                                                    validatorExpression="#{ArchivoDatosExt1.validatorCodigoArchivoDatosExt1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoArchivoDatosExt1Texto1"
                                                    binding="#{ArchivoDatosExt1.campoCodigoArchivoDatosExt1Texto1}"
                                                    text="#{currentRow.value['codigo_archivo_datos_ext']}"/>
                                                <webuijsf:message id="messageCodigoArchivoDatosExt1"
                                                    for="campoCodigoArchivoDatosExt1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ArchivoDatosExt1.tableColumnNombreArchivoDatosExt1}"
                                                    headerText="nombre"
                                                    id="tableColumnNombreArchivoDatosExt1"
                                                    sort="nombre_archivo_datos_ext">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNombreArchivoDatosExt1"
                                                    text="#{currentRow.value['nombre_archivo_datos_ext']}"
                                                    rendered="#{ArchivoDatosExt1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ArchivoDatosExt1.labelNombreArchivoDatosExt1}"
                                                    id="labelNombreArchivoDatosExt1"
                                                    for="campoNombreArchivoDatosExt1"/>
                                                <webuijsf:textField id="campoNombreArchivoDatosExt1"
                                                    binding="#{ArchivoDatosExt1.campoNombreArchivoDatosExt1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="true"
                                                    text="#{currentRow.value['nombre_archivo_datos_ext']}"
                                                    toolTip="BundleParametros.nombre_archivo_datos_ext.archivo_datos_ext"
                                                    validatorExpression="#{ArchivoDatosExt1.validatorNombreArchivoDatosExt1.validate}"/>
                                                <webuijsf:staticText id="campoNombreArchivoDatosExt1Texto1"
                                                    binding="#{ArchivoDatosExt1.campoNombreArchivoDatosExt1Texto1}"
                                                    text="#{currentRow.value['nombre_archivo_datos_ext']}"/>
                                                <webuijsf:message id="messageNombreArchivoDatosExt1"
                                                    for="campoNombreArchivoDatosExt1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnNombreArchivoDatosExt3"
                                                    rendered="#{ArchivoDatosExt1.asistente.tableColumnNombreArchivoDatosExt3Rendered}"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNombreArchivoDatosExt3"
                                                    text="#{currentRow.value['nombre_archivo_datos_ext']}"
                                                    rendered="#{ArchivoDatosExt1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{ArchivoDatosExt1.campoNombreArchivoDatosExt1Boton3}"
                                                    id="campoNombreArchivoDatosExt1Boton3"
                                                    onClick="#{ArchivoDatosExt1.asistente.scriptCampoNombreArchivoDatosExt1Boton3}"
                                                    rendered="#{ArchivoDatosExt1.asistente.campoNombreArchivoDatosExt1Boton3Rendered}"
                                                    text="#{ArchivoDatosExt1.asistente.textCampoNombreArchivoDatosExt1Boton3}"
                                                    toolTip="#{ArchivoDatosExt1.asistente.toolTipCampoNombreArchivoDatosExt1Boton3}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ArchivoDatosExt1.tableColumnIdProveedorDatExt1}"
                                                    headerText="proveedor datos externos"
                                                    id="tableColumnIdProveedorDatExt1"
                                                    sort="codigo_proveedor_dat_ext_1x1y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdProveedorDatExt1"
                                                    text="#{currentRow.value['codigo_proveedor_dat_ext_1x1y3']}"
                                                    rendered="#{ArchivoDatosExt1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ArchivoDatosExt1.labelIdProveedorDatExt1}"
                                                    id="labelIdProveedorDatExt1"
                                                    for="campoIdProveedorDatExt1"/>
                                                <webuijsf:textField id="campoIdProveedorDatExt1"
                                                    binding="#{ArchivoDatosExt1.campoIdProveedorDatExt1}"
                                                    readOnly="#{ArchivoDatosExt1.gestor.filaNoProcesada}" required="true"
                                                    text="#{ArchivoDatosExt1.asistente.textoCampoIdProveedorDatExt1}"
                                                    toolTip="#{ArchivoDatosExt1.asistente.toolTipCampoIdProveedorDatExt1}"
                                                    validatorExpression="#{ArchivoDatosExt1.campoIdProveedorDatExt1_validate}"/>
                                                <webuijsf:staticText id="campoIdProveedorDatExt1Texto1"
                                                    binding="#{ArchivoDatosExt1.campoIdProveedorDatExt1Texto1}"
                                                    text="#{currentRow.value['codigo_proveedor_dat_ext_1x1y3']}"/>
                                                <webuijsf:message id="messageIdProveedorDatExt1"
                                                    for="campoIdProveedorDatExt1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdProveedorDatExt3"
                                                    rendered="#{ArchivoDatosExt1.asistente.tableColumnIdProveedorDatExt3Rendered}"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdProveedorDatExt3"
                                                    text="#{currentRow.value['id_proveedor_dat_ext']}"
                                                    rendered="#{ArchivoDatosExt1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{ArchivoDatosExt1.campoIdProveedorDatExt1Boton1}"
                                                    id="campoIdProveedorDatExt1Boton1"
                                                    onClick="#{ArchivoDatosExt1.asistente.scriptCampoIdProveedorDatExt1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{ArchivoDatosExt1.campoIdProveedorDatExt1Boton3}"
                                                    id="campoIdProveedorDatExt1Boton3"
                                                    onClick="#{ArchivoDatosExt1.asistente.scriptCampoIdProveedorDatExt1Boton2}"
                                                    rendered="#{ArchivoDatosExt1.asistente.campoIdProveedorDatExt1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{ArchivoDatosExt1.tableColumnIdProveedorDatExt2}"
                                                    headerText="nombre proveedor datos externos"
                                                    id="tableColumnIdProveedorDatExt2"
                                                    rendered="#{ArchivoDatosExt1.asistente.campoIdProveedorDatExt1Boton2Rendered}"
                                                    sort="nombre_proveedor_dat_ext_1x1y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdProveedorDatExt2"
                                                    text="#{currentRow.value['nombre_proveedor_dat_ext_1x1y4']}"
                                                    rendered="#{ArchivoDatosExt1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ArchivoDatosExt1.labelIdProveedorDatExt2}"
                                                    id="labelIdProveedorDatExt2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{ArchivoDatosExt1.campoIdProveedorDatExt1Hiper1}"
                                                    id="campoIdProveedorDatExt1Hiper1"
                                                    text="#{currentRow.value['nombre_proveedor_dat_ext_1x1y4']}"
                                                    onClick="#{ArchivoDatosExt1.asistente.scriptCampoIdProveedorDatExt1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdProveedorDatExt1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ArchivoDatosExt1.tableColumnNumeroTipoArcDatExt1}"
                                                    headerText="tipo"
                                                    id="tableColumnNumeroTipoArcDatExt1"
                                                    sort="codigo_tipo_arc_dat_ext_1x2y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroTipoArcDatExt1"
                                                    text="#{currentRow.value['codigo_tipo_arc_dat_ext_1x2y2']}"
                                                    rendered="#{ArchivoDatosExt1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ArchivoDatosExt1.labelNumeroTipoArcDatExt1}"
                                                    id="labelNumeroTipoArcDatExt1"
                                                    for="listaNumeroTipoArcDatExt1"/>
                                                <webuijsf:dropDown id="listaNumeroTipoArcDatExt1"
                                                    binding="#{ArchivoDatosExt1.listaNumeroTipoArcDatExt1}"
                                                    converter="#{ArchivoDatosExt1.converterNumeroTipoArcDatExt1}"
                                                    disabled="#{ArchivoDatosExt1.gestor.filaNoProcesada}" required="true"
                                                    items="#{ArchivoDatosExt1.asistente.opcionesListaNumeroTipoArcDatExt1}"
                                                    selected="#{currentRow.value['numero_tipo_arc_dat_ext']}"
                                                    toolTip="BundleParametros.numero_tipo_arc_dat_ext.archivo_datos_ext"/>
                                                <webuijsf:staticText id="listaNumeroTipoArcDatExt1Texto1"
                                                    binding="#{ArchivoDatosExt1.listaNumeroTipoArcDatExt1Texto1}"
                                                    text="#{currentRow.value['codigo_tipo_arc_dat_ext_1x2y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoArcDatExt1"
                                                    for="listaNumeroTipoArcDatExt1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ArchivoDatosExt1.tableColumnEsArchivoDatosExtImportado1}"
                                                    headerText="importado"
                                                    id="tableColumnEsArchivoDatosExtImportado1"
                                                    sort="es_archivo_datos_ext_importado">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsArchivoDatosExtImportado1"
                                                    text="#{currentRow.value['es_archivo_datos_ext_importado']}"
                                                    rendered="#{ArchivoDatosExt1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ArchivoDatosExt1.labelEsArchivoDatosExtImportado1}"
                                                    id="labelEsArchivoDatosExtImportado1"
                                                    for="listaEsArchivoDatosExtImportado1"/>
                                                <webuijsf:dropDown id="listaEsArchivoDatosExtImportado1"
                                                    binding="#{ArchivoDatosExt1.listaEsArchivoDatosExtImportado1}"
                                                    converter="#{ArchivoDatosExt1.converterEsArchivoDatosExtImportado1}"
                                                    disabled="true"
                                                    items="#{ArchivoDatosExt1.asistente.opcionesListaEsArchivoDatosExtImportado1}"
                                                    selected="#{currentRow.value['es_archivo_datos_ext_importado']}"
                                                    toolTip="BundleParametros.es_archivo_datos_ext_importado.archivo_datos_ext"/>
                                                <webuijsf:staticText id="listaEsArchivoDatosExtImportado1Texto1"
                                                    binding="#{ArchivoDatosExt1.listaEsArchivoDatosExtImportado1Texto1}"/>
                                                <webuijsf:message id="messageEsArchivoDatosExtImportado1"
                                                    for="listaEsArchivoDatosExtImportado1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ArchivoDatosExt1.tableColumnFechaHoraUltimaCarga1}"
                                                    headerText="fecha hora ultima carga"
                                                    id="tableColumnFechaHoraUltimaCarga1" rendered="false"
                                                    sort="fecha_hora_ultima_carga">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextFechaHoraUltimaCarga1"
                                                    text="#{currentRow.value['fecha_hora_ultima_carga']}"
                                                    rendered="#{ArchivoDatosExt1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ArchivoDatosExt1.labelFechaHoraUltimaCarga1}"
                                                    id="labelFechaHoraUltimaCarga1"
                                                    for="campoFechaHoraUltimaCarga1"/>
                                                <webuijsf:textField id="campoFechaHoraUltimaCarga1"
                                                    binding="#{ArchivoDatosExt1.campoFechaHoraUltimaCarga1}"
                                                    converter="#{ArchivoDatosExt1.converterFechaHoraUltimaCarga1}"
                                                    readOnly="true"
                                                    text="#{currentRow.value['fecha_hora_ultima_carga']}"
                                                    toolTip="BundleParametros.fecha_hora_ultima_carga.archivo_datos_ext"/>
                                                <webuijsf:staticText id="campoFechaHoraUltimaCarga1Texto1"
                                                    binding="#{ArchivoDatosExt1.campoFechaHoraUltimaCarga1Texto1}"
                                                    converter="#{ArchivoDatosExt1.converterFechaHoraUltimaCarga1}"
                                                    text="#{currentRow.value['fecha_hora_ultima_carga']}"/>
                                                <webuijsf:message id="messageFechaHoraUltimaCarga1"
                                                    for="campoFechaHoraUltimaCarga1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ArchivoDatosExt1.tableColumnIdUsuarioUltimaCarga1}"
                                                    headerText="usuario ultima carga"
                                                    id="tableColumnIdUsuarioUltimaCarga1" rendered="false"
                                                    sort="codigo_usuario_1x3y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdUsuarioUltimaCarga1"
                                                    text="#{currentRow.value['codigo_usuario_1x3y3']}"
                                                    rendered="#{ArchivoDatosExt1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ArchivoDatosExt1.labelIdUsuarioUltimaCarga1}"
                                                    id="labelIdUsuarioUltimaCarga1"
                                                    for="campoIdUsuarioUltimaCarga1"/>
                                                <webuijsf:textField id="campoIdUsuarioUltimaCarga1"
                                                    binding="#{ArchivoDatosExt1.campoIdUsuarioUltimaCarga1}"
                                                    readOnly="true"
                                                    text="#{ArchivoDatosExt1.asistente.textoCampoIdUsuarioUltimaCarga1}"
                                                    toolTip="#{ArchivoDatosExt1.asistente.toolTipCampoIdUsuarioUltimaCarga1}"
                                                    validatorExpression="#{ArchivoDatosExt1.campoIdUsuarioUltimaCarga1_validate}"/>
                                                <webuijsf:staticText id="campoIdUsuarioUltimaCarga1Texto1"
                                                    binding="#{ArchivoDatosExt1.campoIdUsuarioUltimaCarga1Texto1}"
                                                    text="#{currentRow.value['codigo_usuario_1x3y3']}"/>
                                                <webuijsf:message id="messageIdUsuarioUltimaCarga1"
                                                    for="campoIdUsuarioUltimaCarga1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdUsuarioUltimaCarga3" rendered="false"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdUsuarioUltimaCarga3"
                                                    text="#{currentRow.value['id_usuario_ultima_carga']}"
                                                    rendered="#{ArchivoDatosExt1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{ArchivoDatosExt1.campoIdUsuarioUltimaCarga1Boton1}"
                                                    id="campoIdUsuarioUltimaCarga1Boton1"
                                                    onClick="#{ArchivoDatosExt1.asistente.scriptCampoIdUsuarioUltimaCarga1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{ArchivoDatosExt1.campoIdUsuarioUltimaCarga1Boton3}"
                                                    id="campoIdUsuarioUltimaCarga1Boton3"
                                                    onClick="#{ArchivoDatosExt1.asistente.scriptCampoIdUsuarioUltimaCarga1Boton2}"
                                                    rendered="#{ArchivoDatosExt1.asistente.campoIdUsuarioUltimaCarga1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{ArchivoDatosExt1.tableColumnIdUsuarioUltimaCarga2}"
                                                    headerText="nombre usuario ultima carga"
                                                    id="tableColumnIdUsuarioUltimaCarga2" rendered="false"
                                                    sort="nombre_usuario_1x3y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdUsuarioUltimaCarga2"
                                                    text="#{currentRow.value['nombre_usuario_1x3y4']}"
                                                    rendered="#{ArchivoDatosExt1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ArchivoDatosExt1.labelIdUsuarioUltimaCarga2}"
                                                    id="labelIdUsuarioUltimaCarga2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{ArchivoDatosExt1.campoIdUsuarioUltimaCarga1Hiper1}"
                                                    id="campoIdUsuarioUltimaCarga1Hiper1"
                                                    text="#{currentRow.value['nombre_usuario_1x3y4']}"
                                                    onClick="#{ArchivoDatosExt1.asistente.scriptCampoIdUsuarioUltimaCarga1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdUsuarioUltimaCarga1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ArchivoDatosExt1.tableColumnFechaHoraUltimaImportacion1}"
                                                    headerText="fecha hora ultima importacion"
                                                    id="tableColumnFechaHoraUltimaImportacion1" rendered="false"
                                                    sort="fecha_hora_ultima_importacion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextFechaHoraUltimaImportacion1"
                                                    text="#{currentRow.value['fecha_hora_ultima_importacion']}"
                                                    rendered="#{ArchivoDatosExt1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ArchivoDatosExt1.labelFechaHoraUltimaImportacion1}"
                                                    id="labelFechaHoraUltimaImportacion1"
                                                    for="campoFechaHoraUltimaImportacion1"/>
                                                <webuijsf:textField id="campoFechaHoraUltimaImportacion1"
                                                    binding="#{ArchivoDatosExt1.campoFechaHoraUltimaImportacion1}"
                                                    converter="#{ArchivoDatosExt1.converterFechaHoraUltimaImportacion1}"
                                                    readOnly="true"
                                                    text="#{currentRow.value['fecha_hora_ultima_importacion']}"
                                                    toolTip="BundleParametros.fecha_hora_ultima_importacion.archivo_datos_ext"/>
                                                <webuijsf:staticText id="campoFechaHoraUltimaImportacion1Texto1"
                                                    binding="#{ArchivoDatosExt1.campoFechaHoraUltimaImportacion1Texto1}"
                                                    converter="#{ArchivoDatosExt1.converterFechaHoraUltimaImportacion1}"
                                                    text="#{currentRow.value['fecha_hora_ultima_importacion']}"/>
                                                <webuijsf:message id="messageFechaHoraUltimaImportacion1"
                                                    for="campoFechaHoraUltimaImportacion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ArchivoDatosExt1.tableColumnIdUsuarioUltimaImportacion1}"
                                                    headerText="usuario ultima importacion"
                                                    id="tableColumnIdUsuarioUltimaImportacion1" rendered="false"
                                                    sort="codigo_usuario_1x4y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdUsuarioUltimaImportacion1"
                                                    text="#{currentRow.value['codigo_usuario_1x4y3']}"
                                                    rendered="#{ArchivoDatosExt1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ArchivoDatosExt1.labelIdUsuarioUltimaImportacion1}"
                                                    id="labelIdUsuarioUltimaImportacion1"
                                                    for="campoIdUsuarioUltimaImportacion1"/>
                                                <webuijsf:textField id="campoIdUsuarioUltimaImportacion1"
                                                    binding="#{ArchivoDatosExt1.campoIdUsuarioUltimaImportacion1}"
                                                    readOnly="true"
                                                    text="#{ArchivoDatosExt1.asistente.textoCampoIdUsuarioUltimaImportacion1}"
                                                    toolTip="#{ArchivoDatosExt1.asistente.toolTipCampoIdUsuarioUltimaImportacion1}"
                                                    validatorExpression="#{ArchivoDatosExt1.campoIdUsuarioUltimaImportacion1_validate}"/>
                                                <webuijsf:staticText id="campoIdUsuarioUltimaImportacion1Texto1"
                                                    binding="#{ArchivoDatosExt1.campoIdUsuarioUltimaImportacion1Texto1}"
                                                    text="#{currentRow.value['codigo_usuario_1x4y3']}"/>
                                                <webuijsf:message id="messageIdUsuarioUltimaImportacion1"
                                                    for="campoIdUsuarioUltimaImportacion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdUsuarioUltimaImportacion3" rendered="false"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdUsuarioUltimaImportacion3"
                                                    text="#{currentRow.value['id_usuario_ultima_importacion']}"
                                                    rendered="#{ArchivoDatosExt1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{ArchivoDatosExt1.campoIdUsuarioUltimaImportacion1Boton1}"
                                                    id="campoIdUsuarioUltimaImportacion1Boton1"
                                                    onClick="#{ArchivoDatosExt1.asistente.scriptCampoIdUsuarioUltimaImportacion1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{ArchivoDatosExt1.campoIdUsuarioUltimaImportacion1Boton3}"
                                                    id="campoIdUsuarioUltimaImportacion1Boton3"
                                                    onClick="#{ArchivoDatosExt1.asistente.scriptCampoIdUsuarioUltimaImportacion1Boton2}"
                                                    rendered="#{ArchivoDatosExt1.asistente.campoIdUsuarioUltimaImportacion1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{ArchivoDatosExt1.tableColumnIdUsuarioUltimaImportacion2}"
                                                    headerText="nombre usuario ultima importacion"
                                                    id="tableColumnIdUsuarioUltimaImportacion2" rendered="false"
                                                    sort="nombre_usuario_1x4y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdUsuarioUltimaImportacion2"
                                                    text="#{currentRow.value['nombre_usuario_1x4y4']}"
                                                    rendered="#{ArchivoDatosExt1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ArchivoDatosExt1.labelIdUsuarioUltimaImportacion2}"
                                                    id="labelIdUsuarioUltimaImportacion2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{ArchivoDatosExt1.campoIdUsuarioUltimaImportacion1Hiper1}"
                                                    id="campoIdUsuarioUltimaImportacion1Hiper1"
                                                    text="#{currentRow.value['nombre_usuario_1x4y4']}"
                                                    onClick="#{ArchivoDatosExt1.asistente.scriptCampoIdUsuarioUltimaImportacion1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdUsuarioUltimaImportacion1Boton2"
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
                                                        binding="#{ArchivoDatosExt1.etiquetaTextoFilasPorPagina1}" 
                                                        for="textoFilasPorPagina1"
                                                        id="etiquetaTextoFilasPorPagina1" 
                                                        text="#{ArchivoDatosExt1.gestor.i18n.textoEtiquetaTextoFilasPorPagina}"/>
                                                </h:panelGrid>
                                                <h:panelGrid 
                                                    columns="3" 
                                                    id="gridPanel107">
                                                    <webuijsf:textField 
                                                        binding="#{ArchivoDatosExt1.textoFilasPorPagina1}" 
                                                        columns="2"
                                                        converter="#{ArchivoDatosExt1.textoFilasPorPagina1Converter1}"
                                                        disabled="#{ArchivoDatosExt1.gestor.paginacionInhabilitada}" 
                                                        id="textoFilasPorPagina1" maxLength="2"
                                                        text="#{ArchivoDatosExt1.gestor.filasPorPagina}" 
                                                        validatorExpression="#{ArchivoDatosExt1.textoFilasPorPagina1Validator1.validate}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{ArchivoDatosExt1.botonRepaginar1_action}"
                                                        binding="#{ArchivoDatosExt1.botonRepaginar1}" 
                                                        id="botonRepaginar1"
                                                        imageURL="#{ArchivoDatosExt1.gestor.urlImagenRepaginar}" 
                                                        onClick="#{ArchivoDatosExt1.gestor.scriptRepaginar}"
                                                        text="#{ArchivoDatosExt1.gestor.i18n.textoBotonRepaginar}"
                                                        toolTip="#{ArchivoDatosExt1.gestor.i18n.toolTipBotonRepaginar}"/>
                                                    <webuijsf:message 
                                                        for="textoFilasPorPagina1" 
                                                        id="messageFilasPorPagina1"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="13"
                                                id="gridPanel108">
                                                <webuijsf:button
                                                    actionExpression="#{ArchivoDatosExt1.botonAgregar1_action}"
                                                    binding="#{ArchivoDatosExt1.botonAgregar1}"
                                                    disabled="#{ArchivoDatosExt1.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{ArchivoDatosExt1.gestor.scriptAgregar}"
                                                    rendered="#{ArchivoDatosExt1.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ArchivoDatosExt1.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{ArchivoDatosExt1.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{ArchivoDatosExt1.listaFuncionEdicion1}"
                                                    converter="#{ArchivoDatosExt1.converterListaFuncionEdicion1}"
                                                    disabled="#{ArchivoDatosExt1.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{ArchivoDatosExt1.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{ArchivoDatosExt1.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{ArchivoDatosExt1.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{ArchivoDatosExt1.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ArchivoDatosExt1.botonEditar1_action}"
                                                    binding="#{ArchivoDatosExt1.botonEditar1}"
                                                    disabled="#{ArchivoDatosExt1.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{ArchivoDatosExt1.gestor.scriptEditar}"
                                                    rendered="#{ArchivoDatosExt1.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ArchivoDatosExt1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{ArchivoDatosExt1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ArchivoDatosExt1.botonEliminar1_action}"
                                                    binding="#{ArchivoDatosExt1.botonEliminar1}"
                                                    disabled="#{ArchivoDatosExt1.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{ArchivoDatosExt1.gestor.scriptEliminar}"
                                                    rendered="#{ArchivoDatosExt1.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ArchivoDatosExt1.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{ArchivoDatosExt1.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ArchivoDatosExt1.botonAplicar1_action}"
                                                    binding="#{ArchivoDatosExt1.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{ArchivoDatosExt1.gestor.scriptAplicar}"
                                                    rendered="#{ArchivoDatosExt1.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ArchivoDatosExt1.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{ArchivoDatosExt1.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ArchivoDatosExt1.botonDeshacer1_action}"
                                                    binding="#{ArchivoDatosExt1.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{ArchivoDatosExt1.gestor.scriptDeshacer}"
                                                    rendered="#{ArchivoDatosExt1.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ArchivoDatosExt1.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{ArchivoDatosExt1.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ArchivoDatosExt1.botonConfirmar1_action}"
                                                    binding="#{ArchivoDatosExt1.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{ArchivoDatosExt1.gestor.scriptConfirmar}"
                                                    rendered="#{ArchivoDatosExt1.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ArchivoDatosExt1.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{ArchivoDatosExt1.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ArchivoDatosExt1.botonDescartar1_action}"
                                                    binding="#{ArchivoDatosExt1.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{ArchivoDatosExt1.gestor.scriptDescartar}"
                                                    rendered="#{ArchivoDatosExt1.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ArchivoDatosExt1.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{ArchivoDatosExt1.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{ArchivoDatosExt1.listaFuncionAccion1}"
                                                    converter="#{ArchivoDatosExt1.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{ArchivoDatosExt1.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{ArchivoDatosExt1.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{ArchivoDatosExt1.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{ArchivoDatosExt1.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ArchivoDatosExt1.botonProcesar1_action}"
                                                    binding="#{ArchivoDatosExt1.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{ArchivoDatosExt1.gestor.scriptProcesar}"
                                                    rendered="#{ArchivoDatosExt1.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ArchivoDatosExt1.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{ArchivoDatosExt1.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ArchivoDatosExt1.botonRefrescar1_action}"
                                                    binding="#{ArchivoDatosExt1.botonRefrescar1}"
                                                    disabled="#{ArchivoDatosExt1.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{ArchivoDatosExt1.gestor.scriptRefrescar}"
                                                    rendered="#{ArchivoDatosExt1.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ArchivoDatosExt1.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{ArchivoDatosExt1.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ArchivoDatosExt1.botonReconsultar1_action}"
                                                    binding="#{ArchivoDatosExt1.botonReconsultar1}"
                                                    disabled="#{ArchivoDatosExt1.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{ArchivoDatosExt1.gestor.scriptReconsultar}"
                                                    rendered="#{ArchivoDatosExt1.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ArchivoDatosExt1.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{ArchivoDatosExt1.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ArchivoDatosExt1.botonRetornar1_action}"
                                                    binding="#{ArchivoDatosExt1.botonRetornar1}"
                                                    disabled="#{ArchivoDatosExt1.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{ArchivoDatosExt1.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{ArchivoDatosExt1.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ArchivoDatosExt1.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{ArchivoDatosExt1.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel109"
                                                rendered="#{ArchivoDatosExt1.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{ArchivoDatosExt1.imageHyperlink1_action}"
                                                    binding="#{ArchivoDatosExt1.imageHyperlink1}"
                                                    disabled="#{ArchivoDatosExt1.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{ArchivoDatosExt1.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{ArchivoDatosExt1.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{ArchivoDatosExt1.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.ArchivoDatosExt1_imageHyperlink1_toolTip}"/>
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
