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
                    focus="#{LogImpPen5.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{LogImpPen5.gestor.preserveFocus}"
                    preserveScroll="#{LogImpPen5.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{LogImpPen5.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | checkbox1 campoIdLogImpPen1 campoCedula1 campoPrimerNombre1 campoSegundoNombre1 campoPrimerApellido1 campoSegundoApellido1 campoApellidoCasada1 listaEsImportado1 campoObservacion1 campoFechaHoraTransaccion1 campoNombreArchivo1 campoCodigoArchivo1 textoFilasPorPagina1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | textoFilasPorPagina1 | botonRepaginar1 , virtualForm3 | checkbox1 listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonEscogerFila1 botonDetallarFila1 botonProcesarFila1 botonRetornarFila1 botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{LogImpPen5.breadcrumbs1}" 
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
                                                    rendered="#{LogImpPen5.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{LogImpPen5.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{LogImpPen5.gestor.mensajeDisponible}"
                                                    text="#{LogImpPen5.gestor.mensaje}"
                                                    url="#{LogImpPen5.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:table
                                            binding="#{LogImpPen5.table1}"
                                            clearSortButton="true" 
                                            deselectMultipleButton="true" 
                                            id="table1"
                                            paginateButton="false"
                                            paginationControls="true" 
                                            selectMultipleButton="true" 
                                            sortPanelToggleButton="true"
                                            width="960">
                                            <webuijsf:tableRowGroup 
                                                binding="#{LogImpPen5.tableRowGroup1}" 
                                                id="tableRowGroup1" 
                                                rows="1"
                                                selected="#{LogImpPen5.gestor.filaEscogida}" 
                                                sourceData="#{LogImpPen5.logImpPenDataProvider}" 
                                                sourceVar="currentRow">
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    id="tableRowGroup1SelectionColumn"
                                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);" 
                                                    selectId="checkbox1">
                                                    <webuijsf:checkbox 
                                                        binding="#{LogImpPen5.checkbox1}" 
                                                        id="checkbox1"
                                                        onClick="#{LogImpPen5.gestor.scriptElegir}" 
                                                        selected="#{LogImpPen5.gestor.filaElegida}" 
                                                        toolTip="#{LogImpPen5.gestor.i18n.toolTipCheckboxSeleccionMultiple}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    binding="#{LogImpPen5.tableColumn1}" 
                                                    id="tableColumn1">
                                                    <webuijsf:button 
                                                        actionExpression="#{LogImpPen5.botonEscogerFila1_action}"
                                                        binding="#{LogImpPen5.botonEscogerFila1}"
                                                        disabled="#{LogImpPen5.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonEscogerFila1"
                                                        imageURL="#{LogImpPen5.gestor.urlImagenEscoger}" 
                                                        onClick="#{LogImpPen5.gestor.scriptEscoger}"
                                                        text="#{LogImpPen5.gestor.i18n.textoBotonEscogerFila}"
                                                        toolTip="#{LogImpPen5.gestor.i18n.toolTipBotonEscogerFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{LogImpPen5.botonDetallarFila1_action}"
                                                        binding="#{LogImpPen5.botonDetallarFila1}"
                                                        disabled="#{LogImpPen5.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonDetallarFila1"
                                                        imageURL="#{LogImpPen5.gestor.urlImagenDetallar}" 
                                                        onClick="#{LogImpPen5.scriptAbrirVentanaVerDetalle}"
                                                        rendered="#{LogImpPen5.gestor.detalleDisponible}" 
                                                        text="#{LogImpPen5.gestor.i18n.textoBotonDetallarFila}"
                                                        toolTip="#{LogImpPen5.gestor.i18n.toolTipBotonDetallarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{LogImpPen5.botonProcesarFila1_action}"
                                                        binding="#{LogImpPen5.botonProcesarFila1}"
                                                        disabled="#{LogImpPen5.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonProcesarFila1"
                                                        imageURL="#{LogImpPen5.gestor.urlImagenProcesar}" 
                                                        onClick="#{LogImpPen5.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{LogImpPen5.asistente.comandoDisponible}" 
                                                        text="#{LogImpPen5.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{LogImpPen5.gestor.i18n.toolTipBotonProcesarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{LogImpPen5.botonRetornarFila1_action}"
                                                        binding="#{LogImpPen5.botonRetornarFila1}" 
                                                        disabled="#{LogImpPen5.gestor.funcionReturnInhabilitada}"
                                                        id="botonRetornarFila1"
                                                        imageURL="#{LogImpPen5.gestor.urlImagenRetornar}"
                                                        onClick="#{LogImpPen5.gestor.scriptRetornarRecursoActual}"
                                                        rendered="#{LogImpPen5.gestor.funcionReturnVisible}" 
                                                        text="#{LogImpPen5.gestor.i18n.textoBotonRetornarFila}"
                                                        toolTip="#{LogImpPen5.gestor.i18n.toolTipBotonRetornarFila}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPen5.tableColumn2}"
                                                    id="tableColumn2"
                                                    rendered="#{LogImpPen5.gestor.designing}">
                                                    <webuijsf:imageHyperlink
                                                        actionExpression="#{LogImpPen5.hipervinculoAccionFila1_action}"
                                                        binding="#{LogImpPen5.hipervinculoAccionFila1}"
                                                        disabled="#{LogImpPen5.gestor.loteConCambios}"
                                                        id="hipervinculoAccionFila1"
                                                        imageURL="#{LogImpPen5.gestor.urlImagenEjecutarVinculo}"
                                                        onClick="#{LogImpPen5.scriptAbrirVentanaAccionFila1}"
                                                        text="Accion1"
                                                        toolTip="#{bundle.LogImpPen5_hipervinculoAccionFila1_toolTip}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="right" 
                                                    binding="#{LogImpPen5.tableColumn3}" 
                                                    headerText="#{LogImpPen5.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{LogImpPen5.gestor.i18n.toolTipEtiquetaIdentificacionFila}"
                                                    id="tableColumn3">
                                                    <webuijsf:imageHyperlink 
                                                        actionExpression="#{LogImpPen5.hipervinculoDetallarFila1_action}"
                                                        binding="#{LogImpPen5.hipervinculoDetallarFila1}" 
                                                        id="hipervinculoDetallarFila1"
                                                        imageURL="#{LogImpPen5.gestor.urlImagenFilaProcesada}"
                                                        textPosition="left" 
                                                        text="#{LogImpPen5.gestor.identificacionFila}" 
                                                        toolTip="#{LogImpPen5.gestor.toolTipImagenFilaProcesada}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPen5.tableColumnIdLogImpPen1}"
                                                    toolTip="BundleParametros.id_log_imp_pen.log_imp_pen"
                                                    headerText="identificaci&#243;n"
                                                    id="tableColumnIdLogImpPen1" rendered="false"
                                                    sort="id_log_imp_pen">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdLogImpPen1"
                                                    text="#{currentRow.value['id_log_imp_pen']}"
                                                    rendered="#{LogImpPen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPen5.labelIdLogImpPen1}"
                                                    id="labelIdLogImpPen1"
                                                    for="campoIdLogImpPen1"/>
                                                <webuijsf:textField id="campoIdLogImpPen1"
                                                    binding="#{LogImpPen5.campoIdLogImpPen1}"
                                                    converter="#{LogImpPen5.converterIdLogImpPen1}"
                                                    readOnly="#{LogImpPen5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['id_log_imp_pen']}"
                                                    toolTip="BundleParametros.id_log_imp_pen.log_imp_pen"
                                                    validatorExpression="#{LogImpPen5.validatorIdLogImpPen1.validate}"/>
                                                <webuijsf:staticText id="campoIdLogImpPen1Texto1"
                                                    binding="#{LogImpPen5.campoIdLogImpPen1Texto1}"
                                                    text="#{currentRow.value['id_log_imp_pen']}"/>
                                                <webuijsf:message id="messageIdLogImpPen1"
                                                    for="campoIdLogImpPen1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPen5.tableColumnCedula1}"
                                                    toolTip="BundleParametros.cedula.log_imp_pen"
                                                    headerText="c&#233;dula"
                                                    id="tableColumnCedula1"
                                                    sort="cedula">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextCedula1"
                                                    text="#{currentRow.value['cedula']}"
                                                    rendered="#{LogImpPen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPen5.labelCedula1}"
                                                    id="labelCedula1"
                                                    for="campoCedula1"/>
                                                <webuijsf:textArea id="campoCedula1"
                                                    binding="#{LogImpPen5.campoCedula1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPen5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['cedula']}"
                                                    toolTip="BundleParametros.cedula.log_imp_pen"
                                                    validatorExpression="#{LogImpPen5.validatorCedula1.validate}"/>
                                                <webuijsf:staticText id="campoCedula1Texto1"
                                                    binding="#{LogImpPen5.campoCedula1Texto1}"
                                                    text="#{currentRow.value['cedula']}"/>
                                                <webuijsf:message id="messageCedula1"
                                                    for="campoCedula1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPen5.tableColumnPrimerNombre1}"
                                                    toolTip="BundleParametros.primer_nombre.log_imp_pen"
                                                    headerText="primer nombre"
                                                    id="tableColumnPrimerNombre1" rendered="false"
                                                    sort="primer_nombre">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextPrimerNombre1"
                                                    text="#{currentRow.value['primer_nombre']}"
                                                    rendered="#{LogImpPen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPen5.labelPrimerNombre1}"
                                                    id="labelPrimerNombre1"
                                                    for="campoPrimerNombre1"/>
                                                <webuijsf:textArea id="campoPrimerNombre1"
                                                    binding="#{LogImpPen5.campoPrimerNombre1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPen5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['primer_nombre']}"
                                                    toolTip="BundleParametros.primer_nombre.log_imp_pen"
                                                    validatorExpression="#{LogImpPen5.validatorPrimerNombre1.validate}"/>
                                                <webuijsf:staticText id="campoPrimerNombre1Texto1"
                                                    binding="#{LogImpPen5.campoPrimerNombre1Texto1}"
                                                    text="#{currentRow.value['primer_nombre']}"/>
                                                <webuijsf:message id="messagePrimerNombre1"
                                                    for="campoPrimerNombre1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPen5.tableColumnSegundoNombre1}"
                                                    toolTip="BundleParametros.segundo_nombre.log_imp_pen"
                                                    headerText="segundo nombre"
                                                    id="tableColumnSegundoNombre1" rendered="false"
                                                    sort="segundo_nombre">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextSegundoNombre1"
                                                    text="#{currentRow.value['segundo_nombre']}"
                                                    rendered="#{LogImpPen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPen5.labelSegundoNombre1}"
                                                    id="labelSegundoNombre1"
                                                    for="campoSegundoNombre1"/>
                                                <webuijsf:textArea id="campoSegundoNombre1"
                                                    binding="#{LogImpPen5.campoSegundoNombre1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPen5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['segundo_nombre']}"
                                                    toolTip="BundleParametros.segundo_nombre.log_imp_pen"
                                                    validatorExpression="#{LogImpPen5.validatorSegundoNombre1.validate}"/>
                                                <webuijsf:staticText id="campoSegundoNombre1Texto1"
                                                    binding="#{LogImpPen5.campoSegundoNombre1Texto1}"
                                                    text="#{currentRow.value['segundo_nombre']}"/>
                                                <webuijsf:message id="messageSegundoNombre1"
                                                    for="campoSegundoNombre1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPen5.tableColumnPrimerApellido1}"
                                                    toolTip="BundleParametros.primer_apellido.log_imp_pen"
                                                    headerText="primer apellido"
                                                    id="tableColumnPrimerApellido1" rendered="false"
                                                    sort="primer_apellido">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextPrimerApellido1"
                                                    text="#{currentRow.value['primer_apellido']}"
                                                    rendered="#{LogImpPen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPen5.labelPrimerApellido1}"
                                                    id="labelPrimerApellido1"
                                                    for="campoPrimerApellido1"/>
                                                <webuijsf:textArea id="campoPrimerApellido1"
                                                    binding="#{LogImpPen5.campoPrimerApellido1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPen5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['primer_apellido']}"
                                                    toolTip="BundleParametros.primer_apellido.log_imp_pen"
                                                    validatorExpression="#{LogImpPen5.validatorPrimerApellido1.validate}"/>
                                                <webuijsf:staticText id="campoPrimerApellido1Texto1"
                                                    binding="#{LogImpPen5.campoPrimerApellido1Texto1}"
                                                    text="#{currentRow.value['primer_apellido']}"/>
                                                <webuijsf:message id="messagePrimerApellido1"
                                                    for="campoPrimerApellido1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPen5.tableColumnSegundoApellido1}"
                                                    toolTip="BundleParametros.segundo_apellido.log_imp_pen"
                                                    headerText="segundo apellido"
                                                    id="tableColumnSegundoApellido1" rendered="false"
                                                    sort="segundo_apellido">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextSegundoApellido1"
                                                    text="#{currentRow.value['segundo_apellido']}"
                                                    rendered="#{LogImpPen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPen5.labelSegundoApellido1}"
                                                    id="labelSegundoApellido1"
                                                    for="campoSegundoApellido1"/>
                                                <webuijsf:textArea id="campoSegundoApellido1"
                                                    binding="#{LogImpPen5.campoSegundoApellido1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPen5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['segundo_apellido']}"
                                                    toolTip="BundleParametros.segundo_apellido.log_imp_pen"
                                                    validatorExpression="#{LogImpPen5.validatorSegundoApellido1.validate}"/>
                                                <webuijsf:staticText id="campoSegundoApellido1Texto1"
                                                    binding="#{LogImpPen5.campoSegundoApellido1Texto1}"
                                                    text="#{currentRow.value['segundo_apellido']}"/>
                                                <webuijsf:message id="messageSegundoApellido1"
                                                    for="campoSegundoApellido1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPen5.tableColumnApellidoCasada1}"
                                                    toolTip="BundleParametros.apellido_casada.log_imp_pen"
                                                    headerText="apellido casada"
                                                    id="tableColumnApellidoCasada1" rendered="false"
                                                    sort="apellido_casada">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextApellidoCasada1"
                                                    text="#{currentRow.value['apellido_casada']}"
                                                    rendered="#{LogImpPen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPen5.labelApellidoCasada1}"
                                                    id="labelApellidoCasada1"
                                                    for="campoApellidoCasada1"/>
                                                <webuijsf:textArea id="campoApellidoCasada1"
                                                    binding="#{LogImpPen5.campoApellidoCasada1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPen5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['apellido_casada']}"
                                                    toolTip="BundleParametros.apellido_casada.log_imp_pen"
                                                    validatorExpression="#{LogImpPen5.validatorApellidoCasada1.validate}"/>
                                                <webuijsf:staticText id="campoApellidoCasada1Texto1"
                                                    binding="#{LogImpPen5.campoApellidoCasada1Texto1}"
                                                    text="#{currentRow.value['apellido_casada']}"/>
                                                <webuijsf:message id="messageApellidoCasada1"
                                                    for="campoApellidoCasada1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPen5.tableColumnEsImportado1}"
                                                    toolTip="BundleParametros.es_importado.log_imp_pen"
                                                    headerText="importado"
                                                    id="tableColumnEsImportado1"
                                                    sort="es_importado">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsImportado1"
                                                    text="#{currentRow.value['es_importado']}"
                                                    rendered="#{LogImpPen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPen5.labelEsImportado1}"
                                                    id="labelEsImportado1"
                                                    for="listaEsImportado1"/>
                                                <webuijsf:dropDown id="listaEsImportado1"
                                                    binding="#{LogImpPen5.listaEsImportado1}"
                                                    converter="#{LogImpPen5.converterEsImportado1}"
                                                    disabled="#{LogImpPen5.gestor.filaNoProcesada}" required="true"
                                                    items="#{LogImpPen5.asistente.opcionesListaEsImportado1}"
                                                    selected="#{currentRow.value['es_importado']}"
                                                    toolTip="BundleParametros.es_importado.log_imp_pen"/>
                                                <webuijsf:staticText id="listaEsImportado1Texto1"
                                                    binding="#{LogImpPen5.listaEsImportado1Texto1}"/>
                                                <webuijsf:message id="messageEsImportado1"
                                                    for="listaEsImportado1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPen5.tableColumnObservacion1}"
                                                    toolTip="BundleParametros.observacion.log_imp_pen"
                                                    headerText="observaci&#243;n"
                                                    id="tableColumnObservacion1"
                                                    sort="observacion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextObservacion1"
                                                    text="#{currentRow.value['observacion']}"
                                                    rendered="#{LogImpPen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPen5.labelObservacion1}"
                                                    id="labelObservacion1"
                                                    for="campoObservacion1"/>
                                                <webuijsf:textArea id="campoObservacion1"
                                                    binding="#{LogImpPen5.campoObservacion1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPen5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['observacion']}"
                                                    toolTip="BundleParametros.observacion.log_imp_pen"
                                                    validatorExpression="#{LogImpPen5.validatorObservacion1.validate}"/>
                                                <webuijsf:staticText id="campoObservacion1Texto1"
                                                    binding="#{LogImpPen5.campoObservacion1Texto1}"
                                                    text="#{currentRow.value['observacion']}"/>
                                                <webuijsf:message id="messageObservacion1"
                                                    for="campoObservacion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPen5.tableColumnFechaHoraTransaccion1}"
                                                    toolTip="BundleParametros.fecha_hora_transaccion.log_imp_pen"
                                                    headerText="fecha hora transacci&#243;n"
                                                    id="tableColumnFechaHoraTransaccion1"
                                                    sort="fecha_hora_transaccion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextFechaHoraTransaccion1"
                                                    text="#{currentRow.value['fecha_hora_transaccion']}"
                                                    rendered="#{LogImpPen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPen5.labelFechaHoraTransaccion1}"
                                                    id="labelFechaHoraTransaccion1"
                                                    for="campoFechaHoraTransaccion1"/>
                                                <webuijsf:textField id="campoFechaHoraTransaccion1"
                                                    binding="#{LogImpPen5.campoFechaHoraTransaccion1}"
                                                    converter="#{LogImpPen5.converterFechaHoraTransaccion1}"
                                                    readOnly="#{LogImpPen5.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['fecha_hora_transaccion']}"
                                                    toolTip="BundleParametros.fecha_hora_transaccion.log_imp_pen"/>
                                                <webuijsf:staticText id="campoFechaHoraTransaccion1Texto1"
                                                    binding="#{LogImpPen5.campoFechaHoraTransaccion1Texto1}"
                                                    converter="#{LogImpPen5.converterFechaHoraTransaccion1}"
                                                    text="#{currentRow.value['fecha_hora_transaccion']}"/>
                                                <webuijsf:message id="messageFechaHoraTransaccion1"
                                                    for="campoFechaHoraTransaccion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPen5.tableColumnNombreArchivo1}"
                                                    toolTip="BundleParametros.nombre_archivo.log_imp_pen"
                                                    headerText="nombre archivo"
                                                    id="tableColumnNombreArchivo1" rendered="false"
                                                    sort="nombre_archivo">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNombreArchivo1"
                                                    text="#{currentRow.value['nombre_archivo']}"
                                                    rendered="#{LogImpPen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPen5.labelNombreArchivo1}"
                                                    id="labelNombreArchivo1"
                                                    for="campoNombreArchivo1"/>
                                                <webuijsf:textArea id="campoNombreArchivo1"
                                                    binding="#{LogImpPen5.campoNombreArchivo1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPen5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['nombre_archivo']}"
                                                    toolTip="BundleParametros.nombre_archivo.log_imp_pen"
                                                    validatorExpression="#{LogImpPen5.validatorNombreArchivo1.validate}"/>
                                                <webuijsf:staticText id="campoNombreArchivo1Texto1"
                                                    binding="#{LogImpPen5.campoNombreArchivo1Texto1}"
                                                    text="#{currentRow.value['nombre_archivo']}"/>
                                                <webuijsf:message id="messageNombreArchivo1"
                                                    for="campoNombreArchivo1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnNombreArchivo3" rendered="false"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNombreArchivo3"
                                                    text="#{currentRow.value['nombre_archivo']}"
                                                    rendered="#{LogImpPen5.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{LogImpPen5.campoNombreArchivo1Boton3}"
                                                    id="campoNombreArchivo1Boton3"
                                                    onClick="#{LogImpPen5.asistente.scriptCampoNombreArchivo1Boton3}"
                                                    rendered="#{LogImpPen5.asistente.campoNombreArchivo1Boton3Rendered}"
                                                    text="#{LogImpPen5.asistente.textCampoNombreArchivo1Boton3}"
                                                    toolTip="#{LogImpPen5.asistente.toolTipCampoNombreArchivo1Boton3}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPen5.tableColumnCodigoArchivo1}"
                                                    toolTip="BundleParametros.codigo_archivo.log_imp_pen"
                                                    headerText="c&#243;digo archivo"
                                                    id="tableColumnCodigoArchivo1" rendered="false"
                                                    sort="codigo_archivo">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextCodigoArchivo1"
                                                    text="#{currentRow.value['codigo_archivo']}"
                                                    rendered="#{LogImpPen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPen5.labelCodigoArchivo1}"
                                                    id="labelCodigoArchivo1"
                                                    for="campoCodigoArchivo1"/>
                                                <webuijsf:textArea id="campoCodigoArchivo1"
                                                    binding="#{LogImpPen5.campoCodigoArchivo1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPen5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['codigo_archivo']}"
                                                    toolTip="BundleParametros.codigo_archivo.log_imp_pen"
                                                    validatorExpression="#{LogImpPen5.validatorCodigoArchivo1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoArchivo1Texto1"
                                                    binding="#{LogImpPen5.campoCodigoArchivo1Texto1}"
                                                    text="#{currentRow.value['codigo_archivo']}"/>
                                                <webuijsf:message id="messageCodigoArchivo1"
                                                    for="campoCodigoArchivo1"/>
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
                                                        binding="#{LogImpPen5.etiquetaTextoFilasPorPagina1}" 
                                                        for="textoFilasPorPagina1"
                                                        id="etiquetaTextoFilasPorPagina1" 
                                                        text="#{LogImpPen5.gestor.i18n.textoEtiquetaTextoFilasPorPagina}"/>
                                                </h:panelGrid>
                                                <h:panelGrid 
                                                    columns="3" 
                                                    id="gridPanel107">
                                                    <webuijsf:textField 
                                                        binding="#{LogImpPen5.textoFilasPorPagina1}" 
                                                        columns="2"
                                                        converter="#{LogImpPen5.textoFilasPorPagina1Converter1}"
                                                        disabled="#{LogImpPen5.gestor.paginacionInhabilitada}" 
                                                        id="textoFilasPorPagina1" maxLength="2"
                                                        text="#{LogImpPen5.gestor.filasPorPagina}" 
                                                        validatorExpression="#{LogImpPen5.textoFilasPorPagina1Validator1.validate}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{LogImpPen5.botonRepaginar1_action}"
                                                        binding="#{LogImpPen5.botonRepaginar1}" 
                                                        id="botonRepaginar1"
                                                        imageURL="#{LogImpPen5.gestor.urlImagenRepaginar}" 
                                                        onClick="#{LogImpPen5.gestor.scriptRepaginar}"
                                                        text="#{LogImpPen5.gestor.i18n.textoBotonRepaginar}"
                                                        toolTip="#{LogImpPen5.gestor.i18n.toolTipBotonRepaginar}"/>
                                                    <webuijsf:message 
                                                        for="textoFilasPorPagina1" 
                                                        id="messageFilasPorPagina1"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="13"
                                                id="gridPanel108">
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPen5.botonAgregar1_action}"
                                                    binding="#{LogImpPen5.botonAgregar1}"
                                                    disabled="#{LogImpPen5.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{LogImpPen5.gestor.scriptAgregar}"
                                                    rendered="#{LogImpPen5.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPen5.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{LogImpPen5.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{LogImpPen5.listaFuncionEdicion1}"
                                                    converter="#{LogImpPen5.converterListaFuncionEdicion1}"
                                                    disabled="#{LogImpPen5.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{LogImpPen5.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{LogImpPen5.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{LogImpPen5.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{LogImpPen5.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPen5.botonEditar1_action}"
                                                    binding="#{LogImpPen5.botonEditar1}"
                                                    disabled="#{LogImpPen5.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{LogImpPen5.gestor.scriptEditar}"
                                                    rendered="#{LogImpPen5.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPen5.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{LogImpPen5.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPen5.botonEliminar1_action}"
                                                    binding="#{LogImpPen5.botonEliminar1}"
                                                    disabled="#{LogImpPen5.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{LogImpPen5.gestor.scriptEliminar}"
                                                    rendered="#{LogImpPen5.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPen5.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{LogImpPen5.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPen5.botonAplicar1_action}"
                                                    binding="#{LogImpPen5.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{LogImpPen5.gestor.scriptAplicar}"
                                                    rendered="#{LogImpPen5.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPen5.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{LogImpPen5.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPen5.botonDeshacer1_action}"
                                                    binding="#{LogImpPen5.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{LogImpPen5.gestor.scriptDeshacer}"
                                                    rendered="#{LogImpPen5.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPen5.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{LogImpPen5.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPen5.botonConfirmar1_action}"
                                                    binding="#{LogImpPen5.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{LogImpPen5.gestor.scriptConfirmar}"
                                                    rendered="#{LogImpPen5.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPen5.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{LogImpPen5.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPen5.botonDescartar1_action}"
                                                    binding="#{LogImpPen5.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{LogImpPen5.gestor.scriptDescartar}"
                                                    rendered="#{LogImpPen5.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPen5.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{LogImpPen5.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{LogImpPen5.listaFuncionAccion1}"
                                                    converter="#{LogImpPen5.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{LogImpPen5.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{LogImpPen5.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{LogImpPen5.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{LogImpPen5.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPen5.botonProcesar1_action}"
                                                    binding="#{LogImpPen5.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{LogImpPen5.gestor.scriptProcesar}"
                                                    rendered="#{LogImpPen5.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPen5.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{LogImpPen5.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPen5.botonRefrescar1_action}"
                                                    binding="#{LogImpPen5.botonRefrescar1}"
                                                    disabled="#{LogImpPen5.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{LogImpPen5.gestor.scriptRefrescar}"
                                                    rendered="#{LogImpPen5.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPen5.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{LogImpPen5.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPen5.botonReconsultar1_action}"
                                                    binding="#{LogImpPen5.botonReconsultar1}"
                                                    disabled="#{LogImpPen5.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{LogImpPen5.gestor.scriptReconsultar}"
                                                    rendered="#{LogImpPen5.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPen5.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{LogImpPen5.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPen5.botonRetornar1_action}"
                                                    binding="#{LogImpPen5.botonRetornar1}"
                                                    disabled="#{LogImpPen5.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{LogImpPen5.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{LogImpPen5.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPen5.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{LogImpPen5.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel109"
                                                rendered="#{LogImpPen5.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{LogImpPen5.imageHyperlink1_action}"
                                                    binding="#{LogImpPen5.imageHyperlink1}"
                                                    disabled="#{LogImpPen5.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{LogImpPen5.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{LogImpPen5.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{LogImpPen5.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.LogImpPen5_imageHyperlink1_toolTip}"/>
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
