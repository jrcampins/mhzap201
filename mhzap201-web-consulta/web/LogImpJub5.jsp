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
                    focus="#{LogImpJub5.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{LogImpJub5.gestor.preserveFocus}"
                    preserveScroll="#{LogImpJub5.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{LogImpJub5.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | checkbox1 campoIdLogImpJub1 campoCedula1 campoPrimerNombre1 campoSegundoNombre1 campoPrimerApellido1 campoSegundoApellido1 campoApellidoCasada1 campoTipoRegistro1 listaEsImportado1 campoObservacion1 campoFechaHoraTransaccion1 campoNombreArchivo1 campoCodigoArchivo1 textoFilasPorPagina1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | textoFilasPorPagina1 | botonRepaginar1 , virtualForm3 | checkbox1 listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonEscogerFila1 botonDetallarFila1 botonProcesarFila1 botonRetornarFila1 botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{LogImpJub5.breadcrumbs1}" 
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
                                                    rendered="#{LogImpJub5.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{LogImpJub5.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{LogImpJub5.gestor.mensajeDisponible}"
                                                    text="#{LogImpJub5.gestor.mensaje}"
                                                    url="#{LogImpJub5.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:table
                                            binding="#{LogImpJub5.table1}"
                                            clearSortButton="true" 
                                            deselectMultipleButton="true" 
                                            id="table1"
                                            paginateButton="false"
                                            paginationControls="true" 
                                            selectMultipleButton="true" 
                                            sortPanelToggleButton="true"
                                            width="960">
                                            <webuijsf:tableRowGroup 
                                                binding="#{LogImpJub5.tableRowGroup1}" 
                                                id="tableRowGroup1" 
                                                rows="1"
                                                selected="#{LogImpJub5.gestor.filaEscogida}" 
                                                sourceData="#{LogImpJub5.logImpJubDataProvider}" 
                                                sourceVar="currentRow">
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    id="tableRowGroup1SelectionColumn"
                                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);" 
                                                    selectId="checkbox1">
                                                    <webuijsf:checkbox 
                                                        binding="#{LogImpJub5.checkbox1}" 
                                                        id="checkbox1"
                                                        onClick="#{LogImpJub5.gestor.scriptElegir}" 
                                                        selected="#{LogImpJub5.gestor.filaElegida}" 
                                                        toolTip="#{LogImpJub5.gestor.i18n.toolTipCheckboxSeleccionMultiple}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    binding="#{LogImpJub5.tableColumn1}" 
                                                    id="tableColumn1">
                                                    <webuijsf:button 
                                                        actionExpression="#{LogImpJub5.botonEscogerFila1_action}"
                                                        binding="#{LogImpJub5.botonEscogerFila1}"
                                                        disabled="#{LogImpJub5.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonEscogerFila1"
                                                        imageURL="#{LogImpJub5.gestor.urlImagenEscoger}" 
                                                        onClick="#{LogImpJub5.gestor.scriptEscoger}"
                                                        text="#{LogImpJub5.gestor.i18n.textoBotonEscogerFila}"
                                                        toolTip="#{LogImpJub5.gestor.i18n.toolTipBotonEscogerFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{LogImpJub5.botonDetallarFila1_action}"
                                                        binding="#{LogImpJub5.botonDetallarFila1}"
                                                        disabled="#{LogImpJub5.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonDetallarFila1"
                                                        imageURL="#{LogImpJub5.gestor.urlImagenDetallar}" 
                                                        onClick="#{LogImpJub5.scriptAbrirVentanaVerDetalle}"
                                                        rendered="#{LogImpJub5.gestor.detalleDisponible}" 
                                                        text="#{LogImpJub5.gestor.i18n.textoBotonDetallarFila}"
                                                        toolTip="#{LogImpJub5.gestor.i18n.toolTipBotonDetallarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{LogImpJub5.botonProcesarFila1_action}"
                                                        binding="#{LogImpJub5.botonProcesarFila1}"
                                                        disabled="#{LogImpJub5.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonProcesarFila1"
                                                        imageURL="#{LogImpJub5.gestor.urlImagenProcesar}" 
                                                        onClick="#{LogImpJub5.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{LogImpJub5.asistente.comandoDisponible}" 
                                                        text="#{LogImpJub5.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{LogImpJub5.gestor.i18n.toolTipBotonProcesarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{LogImpJub5.botonRetornarFila1_action}"
                                                        binding="#{LogImpJub5.botonRetornarFila1}" 
                                                        disabled="#{LogImpJub5.gestor.funcionReturnInhabilitada}"
                                                        id="botonRetornarFila1"
                                                        imageURL="#{LogImpJub5.gestor.urlImagenRetornar}"
                                                        onClick="#{LogImpJub5.gestor.scriptRetornarRecursoActual}"
                                                        rendered="#{LogImpJub5.gestor.funcionReturnVisible}" 
                                                        text="#{LogImpJub5.gestor.i18n.textoBotonRetornarFila}"
                                                        toolTip="#{LogImpJub5.gestor.i18n.toolTipBotonRetornarFila}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpJub5.tableColumn2}"
                                                    id="tableColumn2"
                                                    rendered="#{LogImpJub5.gestor.designing}">
                                                    <webuijsf:imageHyperlink
                                                        actionExpression="#{LogImpJub5.hipervinculoAccionFila1_action}"
                                                        binding="#{LogImpJub5.hipervinculoAccionFila1}"
                                                        disabled="#{LogImpJub5.gestor.loteConCambios}"
                                                        id="hipervinculoAccionFila1"
                                                        imageURL="#{LogImpJub5.gestor.urlImagenEjecutarVinculo}"
                                                        onClick="#{LogImpJub5.scriptAbrirVentanaAccionFila1}"
                                                        text="Accion1"
                                                        toolTip="#{bundle.LogImpJub5_hipervinculoAccionFila1_toolTip}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="right" 
                                                    binding="#{LogImpJub5.tableColumn3}" 
                                                    headerText="#{LogImpJub5.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{LogImpJub5.gestor.i18n.toolTipEtiquetaIdentificacionFila}"
                                                    id="tableColumn3">
                                                    <webuijsf:imageHyperlink 
                                                        actionExpression="#{LogImpJub5.hipervinculoDetallarFila1_action}"
                                                        binding="#{LogImpJub5.hipervinculoDetallarFila1}" 
                                                        id="hipervinculoDetallarFila1"
                                                        imageURL="#{LogImpJub5.gestor.urlImagenFilaProcesada}"
                                                        textPosition="left" 
                                                        text="#{LogImpJub5.gestor.identificacionFila}" 
                                                        toolTip="#{LogImpJub5.gestor.toolTipImagenFilaProcesada}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpJub5.tableColumnIdLogImpJub1}"
                                                    headerText="identificaci&#243;n"
                                                    id="tableColumnIdLogImpJub1" rendered="false"
                                                    sort="id_log_imp_jub">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdLogImpJub1"
                                                    text="#{currentRow.value['id_log_imp_jub']}"
                                                    rendered="#{LogImpJub5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpJub5.labelIdLogImpJub1}"
                                                    id="labelIdLogImpJub1"
                                                    for="campoIdLogImpJub1"/>
                                                <webuijsf:textField id="campoIdLogImpJub1"
                                                    binding="#{LogImpJub5.campoIdLogImpJub1}"
                                                    converter="#{LogImpJub5.converterIdLogImpJub1}"
                                                    readOnly="#{LogImpJub5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['id_log_imp_jub']}"
                                                    toolTip="BundleParametros.id_log_imp_jub.log_imp_jub"
                                                    validatorExpression="#{LogImpJub5.validatorIdLogImpJub1.validate}"/>
                                                <webuijsf:staticText id="campoIdLogImpJub1Texto1"
                                                    binding="#{LogImpJub5.campoIdLogImpJub1Texto1}"
                                                    text="#{currentRow.value['id_log_imp_jub']}"/>
                                                <webuijsf:message id="messageIdLogImpJub1"
                                                    for="campoIdLogImpJub1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpJub5.tableColumnCedula1}"
                                                    headerText="c&#233;dula"
                                                    id="tableColumnCedula1"
                                                    sort="cedula">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextCedula1"
                                                    text="#{currentRow.value['cedula']}"
                                                    rendered="#{LogImpJub5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpJub5.labelCedula1}"
                                                    id="labelCedula1"
                                                    for="campoCedula1"/>
                                                <webuijsf:textArea id="campoCedula1"
                                                    binding="#{LogImpJub5.campoCedula1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpJub5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['cedula']}"
                                                    toolTip="BundleParametros.cedula.log_imp_jub"
                                                    validatorExpression="#{LogImpJub5.validatorCedula1.validate}"/>
                                                <webuijsf:staticText id="campoCedula1Texto1"
                                                    binding="#{LogImpJub5.campoCedula1Texto1}"
                                                    text="#{currentRow.value['cedula']}"/>
                                                <webuijsf:message id="messageCedula1"
                                                    for="campoCedula1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpJub5.tableColumnPrimerNombre1}"
                                                    headerText="primer nombre"
                                                    id="tableColumnPrimerNombre1"
                                                    sort="primer_nombre">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextPrimerNombre1"
                                                    text="#{currentRow.value['primer_nombre']}"
                                                    rendered="#{LogImpJub5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpJub5.labelPrimerNombre1}"
                                                    id="labelPrimerNombre1"
                                                    for="campoPrimerNombre1"/>
                                                <webuijsf:textArea id="campoPrimerNombre1"
                                                    binding="#{LogImpJub5.campoPrimerNombre1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpJub5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['primer_nombre']}"
                                                    toolTip="BundleParametros.primer_nombre.log_imp_jub"
                                                    validatorExpression="#{LogImpJub5.validatorPrimerNombre1.validate}"/>
                                                <webuijsf:staticText id="campoPrimerNombre1Texto1"
                                                    binding="#{LogImpJub5.campoPrimerNombre1Texto1}"
                                                    text="#{currentRow.value['primer_nombre']}"/>
                                                <webuijsf:message id="messagePrimerNombre1"
                                                    for="campoPrimerNombre1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpJub5.tableColumnSegundoNombre1}"
                                                    headerText="segundo nombre"
                                                    id="tableColumnSegundoNombre1" rendered="false"
                                                    sort="segundo_nombre">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextSegundoNombre1"
                                                    text="#{currentRow.value['segundo_nombre']}"
                                                    rendered="#{LogImpJub5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpJub5.labelSegundoNombre1}"
                                                    id="labelSegundoNombre1"
                                                    for="campoSegundoNombre1"/>
                                                <webuijsf:textArea id="campoSegundoNombre1"
                                                    binding="#{LogImpJub5.campoSegundoNombre1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpJub5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['segundo_nombre']}"
                                                    toolTip="BundleParametros.segundo_nombre.log_imp_jub"
                                                    validatorExpression="#{LogImpJub5.validatorSegundoNombre1.validate}"/>
                                                <webuijsf:staticText id="campoSegundoNombre1Texto1"
                                                    binding="#{LogImpJub5.campoSegundoNombre1Texto1}"
                                                    text="#{currentRow.value['segundo_nombre']}"/>
                                                <webuijsf:message id="messageSegundoNombre1"
                                                    for="campoSegundoNombre1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpJub5.tableColumnPrimerApellido1}"
                                                    headerText="primer apellido"
                                                    id="tableColumnPrimerApellido1"
                                                    sort="primer_apellido">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextPrimerApellido1"
                                                    text="#{currentRow.value['primer_apellido']}"
                                                    rendered="#{LogImpJub5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpJub5.labelPrimerApellido1}"
                                                    id="labelPrimerApellido1"
                                                    for="campoPrimerApellido1"/>
                                                <webuijsf:textArea id="campoPrimerApellido1"
                                                    binding="#{LogImpJub5.campoPrimerApellido1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpJub5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['primer_apellido']}"
                                                    toolTip="BundleParametros.primer_apellido.log_imp_jub"
                                                    validatorExpression="#{LogImpJub5.validatorPrimerApellido1.validate}"/>
                                                <webuijsf:staticText id="campoPrimerApellido1Texto1"
                                                    binding="#{LogImpJub5.campoPrimerApellido1Texto1}"
                                                    text="#{currentRow.value['primer_apellido']}"/>
                                                <webuijsf:message id="messagePrimerApellido1"
                                                    for="campoPrimerApellido1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpJub5.tableColumnSegundoApellido1}"
                                                    headerText="segundo apellido"
                                                    id="tableColumnSegundoApellido1" rendered="false"
                                                    sort="segundo_apellido">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextSegundoApellido1"
                                                    text="#{currentRow.value['segundo_apellido']}"
                                                    rendered="#{LogImpJub5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpJub5.labelSegundoApellido1}"
                                                    id="labelSegundoApellido1"
                                                    for="campoSegundoApellido1"/>
                                                <webuijsf:textArea id="campoSegundoApellido1"
                                                    binding="#{LogImpJub5.campoSegundoApellido1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpJub5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['segundo_apellido']}"
                                                    toolTip="BundleParametros.segundo_apellido.log_imp_jub"
                                                    validatorExpression="#{LogImpJub5.validatorSegundoApellido1.validate}"/>
                                                <webuijsf:staticText id="campoSegundoApellido1Texto1"
                                                    binding="#{LogImpJub5.campoSegundoApellido1Texto1}"
                                                    text="#{currentRow.value['segundo_apellido']}"/>
                                                <webuijsf:message id="messageSegundoApellido1"
                                                    for="campoSegundoApellido1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpJub5.tableColumnApellidoCasada1}"
                                                    headerText="apellido casada"
                                                    id="tableColumnApellidoCasada1" rendered="false"
                                                    sort="apellido_casada">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextApellidoCasada1"
                                                    text="#{currentRow.value['apellido_casada']}"
                                                    rendered="#{LogImpJub5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpJub5.labelApellidoCasada1}"
                                                    id="labelApellidoCasada1"
                                                    for="campoApellidoCasada1"/>
                                                <webuijsf:textArea id="campoApellidoCasada1"
                                                    binding="#{LogImpJub5.campoApellidoCasada1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpJub5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['apellido_casada']}"
                                                    toolTip="BundleParametros.apellido_casada.log_imp_jub"
                                                    validatorExpression="#{LogImpJub5.validatorApellidoCasada1.validate}"/>
                                                <webuijsf:staticText id="campoApellidoCasada1Texto1"
                                                    binding="#{LogImpJub5.campoApellidoCasada1Texto1}"
                                                    text="#{currentRow.value['apellido_casada']}"/>
                                                <webuijsf:message id="messageApellidoCasada1"
                                                    for="campoApellidoCasada1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpJub5.tableColumnTipoRegistro1}"
                                                    headerText="tipo registro"
                                                    id="tableColumnTipoRegistro1" rendered="false"
                                                    sort="tipo_registro">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextTipoRegistro1"
                                                    text="#{currentRow.value['tipo_registro']}"
                                                    rendered="#{LogImpJub5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpJub5.labelTipoRegistro1}"
                                                    id="labelTipoRegistro1"
                                                    for="campoTipoRegistro1"/>
                                                <webuijsf:textArea id="campoTipoRegistro1"
                                                    binding="#{LogImpJub5.campoTipoRegistro1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpJub5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['tipo_registro']}"
                                                    toolTip="BundleParametros.tipo_registro.log_imp_jub"
                                                    validatorExpression="#{LogImpJub5.validatorTipoRegistro1.validate}"/>
                                                <webuijsf:staticText id="campoTipoRegistro1Texto1"
                                                    binding="#{LogImpJub5.campoTipoRegistro1Texto1}"
                                                    text="#{currentRow.value['tipo_registro']}"/>
                                                <webuijsf:message id="messageTipoRegistro1"
                                                    for="campoTipoRegistro1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpJub5.tableColumnEsImportado1}"
                                                    headerText="importado"
                                                    id="tableColumnEsImportado1"
                                                    sort="es_importado">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsImportado1"
                                                    text="#{currentRow.value['es_importado']}"
                                                    rendered="#{LogImpJub5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpJub5.labelEsImportado1}"
                                                    id="labelEsImportado1"
                                                    for="listaEsImportado1"/>
                                                <webuijsf:dropDown id="listaEsImportado1"
                                                    binding="#{LogImpJub5.listaEsImportado1}"
                                                    converter="#{LogImpJub5.converterEsImportado1}"
                                                    disabled="#{LogImpJub5.gestor.filaNoProcesada}" required="true"
                                                    items="#{LogImpJub5.asistente.opcionesListaEsImportado1}"
                                                    selected="#{currentRow.value['es_importado']}"
                                                    toolTip="BundleParametros.es_importado.log_imp_jub"/>
                                                <webuijsf:staticText id="listaEsImportado1Texto1"
                                                    binding="#{LogImpJub5.listaEsImportado1Texto1}"/>
                                                <webuijsf:message id="messageEsImportado1"
                                                    for="listaEsImportado1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpJub5.tableColumnObservacion1}"
                                                    headerText="observaci&#243;n"
                                                    id="tableColumnObservacion1" rendered="false"
                                                    sort="observacion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextObservacion1"
                                                    text="#{currentRow.value['observacion']}"
                                                    rendered="#{LogImpJub5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpJub5.labelObservacion1}"
                                                    id="labelObservacion1"
                                                    for="campoObservacion1"/>
                                                <webuijsf:textArea id="campoObservacion1"
                                                    binding="#{LogImpJub5.campoObservacion1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpJub5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['observacion']}"
                                                    toolTip="BundleParametros.observacion.log_imp_jub"
                                                    validatorExpression="#{LogImpJub5.validatorObservacion1.validate}"/>
                                                <webuijsf:staticText id="campoObservacion1Texto1"
                                                    binding="#{LogImpJub5.campoObservacion1Texto1}"
                                                    text="#{currentRow.value['observacion']}"/>
                                                <webuijsf:message id="messageObservacion1"
                                                    for="campoObservacion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpJub5.tableColumnFechaHoraTransaccion1}"
                                                    headerText="fecha hora transacci&#243;n"
                                                    id="tableColumnFechaHoraTransaccion1"
                                                    sort="fecha_hora_transaccion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextFechaHoraTransaccion1"
                                                    text="#{currentRow.value['fecha_hora_transaccion']}"
                                                    rendered="#{LogImpJub5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpJub5.labelFechaHoraTransaccion1}"
                                                    id="labelFechaHoraTransaccion1"
                                                    for="campoFechaHoraTransaccion1"/>
                                                <webuijsf:textField id="campoFechaHoraTransaccion1"
                                                    binding="#{LogImpJub5.campoFechaHoraTransaccion1}"
                                                    converter="#{LogImpJub5.converterFechaHoraTransaccion1}"
                                                    readOnly="#{LogImpJub5.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['fecha_hora_transaccion']}"
                                                    toolTip="BundleParametros.fecha_hora_transaccion.log_imp_jub"/>
                                                <webuijsf:staticText id="campoFechaHoraTransaccion1Texto1"
                                                    binding="#{LogImpJub5.campoFechaHoraTransaccion1Texto1}"
                                                    converter="#{LogImpJub5.converterFechaHoraTransaccion1}"
                                                    text="#{currentRow.value['fecha_hora_transaccion']}"/>
                                                <webuijsf:message id="messageFechaHoraTransaccion1"
                                                    for="campoFechaHoraTransaccion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpJub5.tableColumnNombreArchivo1}"
                                                    headerText="nombre archivo"
                                                    id="tableColumnNombreArchivo1" rendered="false"
                                                    sort="nombre_archivo">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNombreArchivo1"
                                                    text="#{currentRow.value['nombre_archivo']}"
                                                    rendered="#{LogImpJub5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpJub5.labelNombreArchivo1}"
                                                    id="labelNombreArchivo1"
                                                    for="campoNombreArchivo1"/>
                                                <webuijsf:textArea id="campoNombreArchivo1"
                                                    binding="#{LogImpJub5.campoNombreArchivo1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpJub5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['nombre_archivo']}"
                                                    toolTip="BundleParametros.nombre_archivo.log_imp_jub"
                                                    validatorExpression="#{LogImpJub5.validatorNombreArchivo1.validate}"/>
                                                <webuijsf:staticText id="campoNombreArchivo1Texto1"
                                                    binding="#{LogImpJub5.campoNombreArchivo1Texto1}"
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
                                                    rendered="#{LogImpJub5.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{LogImpJub5.campoNombreArchivo1Boton3}"
                                                    id="campoNombreArchivo1Boton3"
                                                    onClick="#{LogImpJub5.asistente.scriptCampoNombreArchivo1Boton3}"
                                                    rendered="#{LogImpJub5.asistente.campoNombreArchivo1Boton3Rendered}"
                                                    text="#{LogImpJub5.asistente.textCampoNombreArchivo1Boton3}"
                                                    toolTip="#{LogImpJub5.asistente.toolTipCampoNombreArchivo1Boton3}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpJub5.tableColumnCodigoArchivo1}"
                                                    headerText="c&#243;digo archivo"
                                                    id="tableColumnCodigoArchivo1" rendered="false"
                                                    sort="codigo_archivo">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextCodigoArchivo1"
                                                    text="#{currentRow.value['codigo_archivo']}"
                                                    rendered="#{LogImpJub5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpJub5.labelCodigoArchivo1}"
                                                    id="labelCodigoArchivo1"
                                                    for="campoCodigoArchivo1"/>
                                                <webuijsf:textArea id="campoCodigoArchivo1"
                                                    binding="#{LogImpJub5.campoCodigoArchivo1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpJub5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['codigo_archivo']}"
                                                    toolTip="BundleParametros.codigo_archivo.log_imp_jub"
                                                    validatorExpression="#{LogImpJub5.validatorCodigoArchivo1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoArchivo1Texto1"
                                                    binding="#{LogImpJub5.campoCodigoArchivo1Texto1}"
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
                                                        binding="#{LogImpJub5.etiquetaTextoFilasPorPagina1}" 
                                                        for="textoFilasPorPagina1"
                                                        id="etiquetaTextoFilasPorPagina1" 
                                                        text="#{LogImpJub5.gestor.i18n.textoEtiquetaTextoFilasPorPagina}"/>
                                                </h:panelGrid>
                                                <h:panelGrid 
                                                    columns="3" 
                                                    id="gridPanel107">
                                                    <webuijsf:textField 
                                                        binding="#{LogImpJub5.textoFilasPorPagina1}" 
                                                        columns="2"
                                                        converter="#{LogImpJub5.textoFilasPorPagina1Converter1}"
                                                        disabled="#{LogImpJub5.gestor.paginacionInhabilitada}" 
                                                        id="textoFilasPorPagina1" maxLength="2"
                                                        text="#{LogImpJub5.gestor.filasPorPagina}" 
                                                        validatorExpression="#{LogImpJub5.textoFilasPorPagina1Validator1.validate}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{LogImpJub5.botonRepaginar1_action}"
                                                        binding="#{LogImpJub5.botonRepaginar1}" 
                                                        id="botonRepaginar1"
                                                        imageURL="#{LogImpJub5.gestor.urlImagenRepaginar}" 
                                                        onClick="#{LogImpJub5.gestor.scriptRepaginar}"
                                                        text="#{LogImpJub5.gestor.i18n.textoBotonRepaginar}"
                                                        toolTip="#{LogImpJub5.gestor.i18n.toolTipBotonRepaginar}"/>
                                                    <webuijsf:message 
                                                        for="textoFilasPorPagina1" 
                                                        id="messageFilasPorPagina1"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="13"
                                                id="gridPanel108">
                                                <webuijsf:button
                                                    actionExpression="#{LogImpJub5.botonAgregar1_action}"
                                                    binding="#{LogImpJub5.botonAgregar1}"
                                                    disabled="#{LogImpJub5.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{LogImpJub5.gestor.scriptAgregar}"
                                                    rendered="#{LogImpJub5.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpJub5.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{LogImpJub5.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{LogImpJub5.listaFuncionEdicion1}"
                                                    converter="#{LogImpJub5.converterListaFuncionEdicion1}"
                                                    disabled="#{LogImpJub5.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{LogImpJub5.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{LogImpJub5.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{LogImpJub5.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{LogImpJub5.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpJub5.botonEditar1_action}"
                                                    binding="#{LogImpJub5.botonEditar1}"
                                                    disabled="#{LogImpJub5.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{LogImpJub5.gestor.scriptEditar}"
                                                    rendered="#{LogImpJub5.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpJub5.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{LogImpJub5.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpJub5.botonEliminar1_action}"
                                                    binding="#{LogImpJub5.botonEliminar1}"
                                                    disabled="#{LogImpJub5.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{LogImpJub5.gestor.scriptEliminar}"
                                                    rendered="#{LogImpJub5.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpJub5.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{LogImpJub5.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpJub5.botonAplicar1_action}"
                                                    binding="#{LogImpJub5.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{LogImpJub5.gestor.scriptAplicar}"
                                                    rendered="#{LogImpJub5.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpJub5.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{LogImpJub5.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpJub5.botonDeshacer1_action}"
                                                    binding="#{LogImpJub5.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{LogImpJub5.gestor.scriptDeshacer}"
                                                    rendered="#{LogImpJub5.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpJub5.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{LogImpJub5.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpJub5.botonConfirmar1_action}"
                                                    binding="#{LogImpJub5.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{LogImpJub5.gestor.scriptConfirmar}"
                                                    rendered="#{LogImpJub5.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpJub5.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{LogImpJub5.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpJub5.botonDescartar1_action}"
                                                    binding="#{LogImpJub5.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{LogImpJub5.gestor.scriptDescartar}"
                                                    rendered="#{LogImpJub5.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpJub5.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{LogImpJub5.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{LogImpJub5.listaFuncionAccion1}"
                                                    converter="#{LogImpJub5.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{LogImpJub5.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{LogImpJub5.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{LogImpJub5.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{LogImpJub5.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpJub5.botonProcesar1_action}"
                                                    binding="#{LogImpJub5.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{LogImpJub5.gestor.scriptProcesar}"
                                                    rendered="#{LogImpJub5.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpJub5.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{LogImpJub5.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpJub5.botonRefrescar1_action}"
                                                    binding="#{LogImpJub5.botonRefrescar1}"
                                                    disabled="#{LogImpJub5.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{LogImpJub5.gestor.scriptRefrescar}"
                                                    rendered="#{LogImpJub5.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpJub5.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{LogImpJub5.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpJub5.botonReconsultar1_action}"
                                                    binding="#{LogImpJub5.botonReconsultar1}"
                                                    disabled="#{LogImpJub5.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{LogImpJub5.gestor.scriptReconsultar}"
                                                    rendered="#{LogImpJub5.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpJub5.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{LogImpJub5.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpJub5.botonRetornar1_action}"
                                                    binding="#{LogImpJub5.botonRetornar1}"
                                                    disabled="#{LogImpJub5.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{LogImpJub5.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{LogImpJub5.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpJub5.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{LogImpJub5.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel109"
                                                rendered="#{LogImpJub5.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{LogImpJub5.imageHyperlink1_action}"
                                                    binding="#{LogImpJub5.imageHyperlink1}"
                                                    disabled="#{LogImpJub5.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{LogImpJub5.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{LogImpJub5.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{LogImpJub5.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.LogImpJub5_imageHyperlink1_toolTip}"/>
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
