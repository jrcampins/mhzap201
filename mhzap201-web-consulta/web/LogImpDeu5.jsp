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
                    focus="#{LogImpDeu5.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{LogImpDeu5.gestor.preserveFocus}"
                    preserveScroll="#{LogImpDeu5.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{LogImpDeu5.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | checkbox1 campoIdLogImpDeu1 campoCedula1 campoPrimerNombre1 campoSegundoNombre1 campoPrimerApellido1 campoSegundoApellido1 campoApellidoCasada1 listaEsImportado1 campoObservacion1 campoFechaHoraTransaccion1 campoNombreArchivo1 campoCodigoArchivo1 textoFilasPorPagina1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | textoFilasPorPagina1 | botonRepaginar1 , virtualForm3 | checkbox1 listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonEscogerFila1 botonDetallarFila1 botonProcesarFila1 botonRetornarFila1 botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{LogImpDeu5.breadcrumbs1}" 
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
                                                    rendered="#{LogImpDeu5.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{LogImpDeu5.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{LogImpDeu5.gestor.mensajeDisponible}"
                                                    text="#{LogImpDeu5.gestor.mensaje}"
                                                    url="#{LogImpDeu5.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:table
                                            binding="#{LogImpDeu5.table1}"
                                            clearSortButton="true" 
                                            deselectMultipleButton="true" 
                                            id="table1"
                                            paginateButton="false"
                                            paginationControls="true" 
                                            selectMultipleButton="true" 
                                            sortPanelToggleButton="true"
                                            width="960">
                                            <webuijsf:tableRowGroup 
                                                binding="#{LogImpDeu5.tableRowGroup1}" 
                                                id="tableRowGroup1" 
                                                rows="1"
                                                selected="#{LogImpDeu5.gestor.filaEscogida}" 
                                                sourceData="#{LogImpDeu5.logImpDeuDataProvider}" 
                                                sourceVar="currentRow">
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    id="tableRowGroup1SelectionColumn"
                                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);" 
                                                    selectId="checkbox1">
                                                    <webuijsf:checkbox 
                                                        binding="#{LogImpDeu5.checkbox1}" 
                                                        id="checkbox1"
                                                        onClick="#{LogImpDeu5.gestor.scriptElegir}" 
                                                        selected="#{LogImpDeu5.gestor.filaElegida}" 
                                                        toolTip="#{LogImpDeu5.gestor.i18n.toolTipCheckboxSeleccionMultiple}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    binding="#{LogImpDeu5.tableColumn1}" 
                                                    id="tableColumn1">
                                                    <webuijsf:button 
                                                        actionExpression="#{LogImpDeu5.botonEscogerFila1_action}"
                                                        binding="#{LogImpDeu5.botonEscogerFila1}"
                                                        disabled="#{LogImpDeu5.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonEscogerFila1"
                                                        imageURL="#{LogImpDeu5.gestor.urlImagenEscoger}" 
                                                        onClick="#{LogImpDeu5.gestor.scriptEscoger}"
                                                        text="#{LogImpDeu5.gestor.i18n.textoBotonEscogerFila}"
                                                        toolTip="#{LogImpDeu5.gestor.i18n.toolTipBotonEscogerFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{LogImpDeu5.botonDetallarFila1_action}"
                                                        binding="#{LogImpDeu5.botonDetallarFila1}"
                                                        disabled="#{LogImpDeu5.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonDetallarFila1"
                                                        imageURL="#{LogImpDeu5.gestor.urlImagenDetallar}" 
                                                        onClick="#{LogImpDeu5.scriptAbrirVentanaVerDetalle}"
                                                        rendered="#{LogImpDeu5.gestor.detalleDisponible}" 
                                                        text="#{LogImpDeu5.gestor.i18n.textoBotonDetallarFila}"
                                                        toolTip="#{LogImpDeu5.gestor.i18n.toolTipBotonDetallarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{LogImpDeu5.botonProcesarFila1_action}"
                                                        binding="#{LogImpDeu5.botonProcesarFila1}"
                                                        disabled="#{LogImpDeu5.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonProcesarFila1"
                                                        imageURL="#{LogImpDeu5.gestor.urlImagenProcesar}" 
                                                        onClick="#{LogImpDeu5.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{LogImpDeu5.asistente.comandoDisponible}" 
                                                        text="#{LogImpDeu5.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{LogImpDeu5.gestor.i18n.toolTipBotonProcesarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{LogImpDeu5.botonRetornarFila1_action}"
                                                        binding="#{LogImpDeu5.botonRetornarFila1}" 
                                                        disabled="#{LogImpDeu5.gestor.funcionReturnInhabilitada}"
                                                        id="botonRetornarFila1"
                                                        imageURL="#{LogImpDeu5.gestor.urlImagenRetornar}"
                                                        onClick="#{LogImpDeu5.gestor.scriptRetornarRecursoActual}"
                                                        rendered="#{LogImpDeu5.gestor.funcionReturnVisible}" 
                                                        text="#{LogImpDeu5.gestor.i18n.textoBotonRetornarFila}"
                                                        toolTip="#{LogImpDeu5.gestor.i18n.toolTipBotonRetornarFila}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpDeu5.tableColumn2}"
                                                    id="tableColumn2"
                                                    rendered="#{LogImpDeu5.gestor.designing}">
                                                    <webuijsf:imageHyperlink
                                                        actionExpression="#{LogImpDeu5.hipervinculoAccionFila1_action}"
                                                        binding="#{LogImpDeu5.hipervinculoAccionFila1}"
                                                        disabled="#{LogImpDeu5.gestor.loteConCambios}"
                                                        id="hipervinculoAccionFila1"
                                                        imageURL="#{LogImpDeu5.gestor.urlImagenEjecutarVinculo}"
                                                        onClick="#{LogImpDeu5.scriptAbrirVentanaAccionFila1}"
                                                        text="Accion1"
                                                        toolTip="#{bundle.LogImpDeu5_hipervinculoAccionFila1_toolTip}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="right" 
                                                    binding="#{LogImpDeu5.tableColumn3}" 
                                                    headerText="#{LogImpDeu5.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{LogImpDeu5.gestor.i18n.toolTipEtiquetaIdentificacionFila}"
                                                    id="tableColumn3">
                                                    <webuijsf:imageHyperlink 
                                                        actionExpression="#{LogImpDeu5.hipervinculoDetallarFila1_action}"
                                                        binding="#{LogImpDeu5.hipervinculoDetallarFila1}" 
                                                        id="hipervinculoDetallarFila1"
                                                        imageURL="#{LogImpDeu5.gestor.urlImagenFilaProcesada}"
                                                        textPosition="left" 
                                                        text="#{LogImpDeu5.gestor.identificacionFila}" 
                                                        toolTip="#{LogImpDeu5.gestor.toolTipImagenFilaProcesada}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpDeu5.tableColumnIdLogImpDeu1}"
                                                    headerText="identificaci&#243;n"
                                                    id="tableColumnIdLogImpDeu1" rendered="false"
                                                    sort="id_log_imp_deu">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdLogImpDeu1"
                                                    text="#{currentRow.value['id_log_imp_deu']}"
                                                    rendered="#{LogImpDeu5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpDeu5.labelIdLogImpDeu1}"
                                                    id="labelIdLogImpDeu1"
                                                    for="campoIdLogImpDeu1"/>
                                                <webuijsf:textField id="campoIdLogImpDeu1"
                                                    binding="#{LogImpDeu5.campoIdLogImpDeu1}"
                                                    converter="#{LogImpDeu5.converterIdLogImpDeu1}"
                                                    readOnly="#{LogImpDeu5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['id_log_imp_deu']}"
                                                    toolTip="BundleParametros.id_log_imp_deu.log_imp_deu"
                                                    validatorExpression="#{LogImpDeu5.validatorIdLogImpDeu1.validate}"/>
                                                <webuijsf:staticText id="campoIdLogImpDeu1Texto1"
                                                    binding="#{LogImpDeu5.campoIdLogImpDeu1Texto1}"
                                                    text="#{currentRow.value['id_log_imp_deu']}"/>
                                                <webuijsf:message id="messageIdLogImpDeu1"
                                                    for="campoIdLogImpDeu1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpDeu5.tableColumnCedula1}"
                                                    headerText="c&#233;dula"
                                                    id="tableColumnCedula1"
                                                    sort="cedula">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextCedula1"
                                                    text="#{currentRow.value['cedula']}"
                                                    rendered="#{LogImpDeu5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpDeu5.labelCedula1}"
                                                    id="labelCedula1"
                                                    for="campoCedula1"/>
                                                <webuijsf:textArea id="campoCedula1"
                                                    binding="#{LogImpDeu5.campoCedula1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpDeu5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['cedula']}"
                                                    toolTip="BundleParametros.cedula.log_imp_deu"
                                                    validatorExpression="#{LogImpDeu5.validatorCedula1.validate}"/>
                                                <webuijsf:staticText id="campoCedula1Texto1"
                                                    binding="#{LogImpDeu5.campoCedula1Texto1}"
                                                    text="#{currentRow.value['cedula']}"/>
                                                <webuijsf:message id="messageCedula1"
                                                    for="campoCedula1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpDeu5.tableColumnPrimerNombre1}"
                                                    headerText="primer nombre"
                                                    id="tableColumnPrimerNombre1" rendered="false"
                                                    sort="primer_nombre">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextPrimerNombre1"
                                                    text="#{currentRow.value['primer_nombre']}"
                                                    rendered="#{LogImpDeu5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpDeu5.labelPrimerNombre1}"
                                                    id="labelPrimerNombre1"
                                                    for="campoPrimerNombre1"/>
                                                <webuijsf:textArea id="campoPrimerNombre1"
                                                    binding="#{LogImpDeu5.campoPrimerNombre1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpDeu5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['primer_nombre']}"
                                                    toolTip="BundleParametros.primer_nombre.log_imp_deu"
                                                    validatorExpression="#{LogImpDeu5.validatorPrimerNombre1.validate}"/>
                                                <webuijsf:staticText id="campoPrimerNombre1Texto1"
                                                    binding="#{LogImpDeu5.campoPrimerNombre1Texto1}"
                                                    text="#{currentRow.value['primer_nombre']}"/>
                                                <webuijsf:message id="messagePrimerNombre1"
                                                    for="campoPrimerNombre1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpDeu5.tableColumnSegundoNombre1}"
                                                    headerText="segundo nombre"
                                                    id="tableColumnSegundoNombre1" rendered="false"
                                                    sort="segundo_nombre">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextSegundoNombre1"
                                                    text="#{currentRow.value['segundo_nombre']}"
                                                    rendered="#{LogImpDeu5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpDeu5.labelSegundoNombre1}"
                                                    id="labelSegundoNombre1"
                                                    for="campoSegundoNombre1"/>
                                                <webuijsf:textArea id="campoSegundoNombre1"
                                                    binding="#{LogImpDeu5.campoSegundoNombre1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpDeu5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['segundo_nombre']}"
                                                    toolTip="BundleParametros.segundo_nombre.log_imp_deu"
                                                    validatorExpression="#{LogImpDeu5.validatorSegundoNombre1.validate}"/>
                                                <webuijsf:staticText id="campoSegundoNombre1Texto1"
                                                    binding="#{LogImpDeu5.campoSegundoNombre1Texto1}"
                                                    text="#{currentRow.value['segundo_nombre']}"/>
                                                <webuijsf:message id="messageSegundoNombre1"
                                                    for="campoSegundoNombre1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpDeu5.tableColumnPrimerApellido1}"
                                                    headerText="primer apellido"
                                                    id="tableColumnPrimerApellido1" rendered="false"
                                                    sort="primer_apellido">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextPrimerApellido1"
                                                    text="#{currentRow.value['primer_apellido']}"
                                                    rendered="#{LogImpDeu5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpDeu5.labelPrimerApellido1}"
                                                    id="labelPrimerApellido1"
                                                    for="campoPrimerApellido1"/>
                                                <webuijsf:textArea id="campoPrimerApellido1"
                                                    binding="#{LogImpDeu5.campoPrimerApellido1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpDeu5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['primer_apellido']}"
                                                    toolTip="BundleParametros.primer_apellido.log_imp_deu"
                                                    validatorExpression="#{LogImpDeu5.validatorPrimerApellido1.validate}"/>
                                                <webuijsf:staticText id="campoPrimerApellido1Texto1"
                                                    binding="#{LogImpDeu5.campoPrimerApellido1Texto1}"
                                                    text="#{currentRow.value['primer_apellido']}"/>
                                                <webuijsf:message id="messagePrimerApellido1"
                                                    for="campoPrimerApellido1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpDeu5.tableColumnSegundoApellido1}"
                                                    headerText="segundo apellido"
                                                    id="tableColumnSegundoApellido1" rendered="false"
                                                    sort="segundo_apellido">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextSegundoApellido1"
                                                    text="#{currentRow.value['segundo_apellido']}"
                                                    rendered="#{LogImpDeu5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpDeu5.labelSegundoApellido1}"
                                                    id="labelSegundoApellido1"
                                                    for="campoSegundoApellido1"/>
                                                <webuijsf:textArea id="campoSegundoApellido1"
                                                    binding="#{LogImpDeu5.campoSegundoApellido1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpDeu5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['segundo_apellido']}"
                                                    toolTip="BundleParametros.segundo_apellido.log_imp_deu"
                                                    validatorExpression="#{LogImpDeu5.validatorSegundoApellido1.validate}"/>
                                                <webuijsf:staticText id="campoSegundoApellido1Texto1"
                                                    binding="#{LogImpDeu5.campoSegundoApellido1Texto1}"
                                                    text="#{currentRow.value['segundo_apellido']}"/>
                                                <webuijsf:message id="messageSegundoApellido1"
                                                    for="campoSegundoApellido1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpDeu5.tableColumnApellidoCasada1}"
                                                    headerText="apellido casada"
                                                    id="tableColumnApellidoCasada1" rendered="false"
                                                    sort="apellido_casada">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextApellidoCasada1"
                                                    text="#{currentRow.value['apellido_casada']}"
                                                    rendered="#{LogImpDeu5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpDeu5.labelApellidoCasada1}"
                                                    id="labelApellidoCasada1"
                                                    for="campoApellidoCasada1"/>
                                                <webuijsf:textArea id="campoApellidoCasada1"
                                                    binding="#{LogImpDeu5.campoApellidoCasada1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpDeu5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['apellido_casada']}"
                                                    toolTip="BundleParametros.apellido_casada.log_imp_deu"
                                                    validatorExpression="#{LogImpDeu5.validatorApellidoCasada1.validate}"/>
                                                <webuijsf:staticText id="campoApellidoCasada1Texto1"
                                                    binding="#{LogImpDeu5.campoApellidoCasada1Texto1}"
                                                    text="#{currentRow.value['apellido_casada']}"/>
                                                <webuijsf:message id="messageApellidoCasada1"
                                                    for="campoApellidoCasada1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpDeu5.tableColumnEsImportado1}"
                                                    headerText="importado"
                                                    id="tableColumnEsImportado1"
                                                    sort="es_importado">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsImportado1"
                                                    text="#{currentRow.value['es_importado']}"
                                                    rendered="#{LogImpDeu5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpDeu5.labelEsImportado1}"
                                                    id="labelEsImportado1"
                                                    for="listaEsImportado1"/>
                                                <webuijsf:dropDown id="listaEsImportado1"
                                                    binding="#{LogImpDeu5.listaEsImportado1}"
                                                    converter="#{LogImpDeu5.converterEsImportado1}"
                                                    disabled="#{LogImpDeu5.gestor.filaNoProcesada}" required="true"
                                                    items="#{LogImpDeu5.asistente.opcionesListaEsImportado1}"
                                                    selected="#{currentRow.value['es_importado']}"
                                                    toolTip="BundleParametros.es_importado.log_imp_deu"/>
                                                <webuijsf:staticText id="listaEsImportado1Texto1"
                                                    binding="#{LogImpDeu5.listaEsImportado1Texto1}"/>
                                                <webuijsf:message id="messageEsImportado1"
                                                    for="listaEsImportado1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpDeu5.tableColumnObservacion1}"
                                                    headerText="observaci&#243;n"
                                                    id="tableColumnObservacion1"
                                                    sort="observacion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextObservacion1"
                                                    text="#{currentRow.value['observacion']}"
                                                    rendered="#{LogImpDeu5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpDeu5.labelObservacion1}"
                                                    id="labelObservacion1"
                                                    for="campoObservacion1"/>
                                                <webuijsf:textArea id="campoObservacion1"
                                                    binding="#{LogImpDeu5.campoObservacion1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpDeu5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['observacion']}"
                                                    toolTip="BundleParametros.observacion.log_imp_deu"
                                                    validatorExpression="#{LogImpDeu5.validatorObservacion1.validate}"/>
                                                <webuijsf:staticText id="campoObservacion1Texto1"
                                                    binding="#{LogImpDeu5.campoObservacion1Texto1}"
                                                    text="#{currentRow.value['observacion']}"/>
                                                <webuijsf:message id="messageObservacion1"
                                                    for="campoObservacion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpDeu5.tableColumnFechaHoraTransaccion1}"
                                                    headerText="fecha hora transacci&#243;n"
                                                    id="tableColumnFechaHoraTransaccion1"
                                                    sort="fecha_hora_transaccion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextFechaHoraTransaccion1"
                                                    text="#{currentRow.value['fecha_hora_transaccion']}"
                                                    rendered="#{LogImpDeu5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpDeu5.labelFechaHoraTransaccion1}"
                                                    id="labelFechaHoraTransaccion1"
                                                    for="campoFechaHoraTransaccion1"/>
                                                <webuijsf:textField id="campoFechaHoraTransaccion1"
                                                    binding="#{LogImpDeu5.campoFechaHoraTransaccion1}"
                                                    converter="#{LogImpDeu5.converterFechaHoraTransaccion1}"
                                                    readOnly="#{LogImpDeu5.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['fecha_hora_transaccion']}"
                                                    toolTip="BundleParametros.fecha_hora_transaccion.log_imp_deu"/>
                                                <webuijsf:staticText id="campoFechaHoraTransaccion1Texto1"
                                                    binding="#{LogImpDeu5.campoFechaHoraTransaccion1Texto1}"
                                                    converter="#{LogImpDeu5.converterFechaHoraTransaccion1}"
                                                    text="#{currentRow.value['fecha_hora_transaccion']}"/>
                                                <webuijsf:message id="messageFechaHoraTransaccion1"
                                                    for="campoFechaHoraTransaccion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpDeu5.tableColumnNombreArchivo1}"
                                                    headerText="nombre archivo"
                                                    id="tableColumnNombreArchivo1" rendered="false"
                                                    sort="nombre_archivo">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNombreArchivo1"
                                                    text="#{currentRow.value['nombre_archivo']}"
                                                    rendered="#{LogImpDeu5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpDeu5.labelNombreArchivo1}"
                                                    id="labelNombreArchivo1"
                                                    for="campoNombreArchivo1"/>
                                                <webuijsf:textArea id="campoNombreArchivo1"
                                                    binding="#{LogImpDeu5.campoNombreArchivo1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpDeu5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['nombre_archivo']}"
                                                    toolTip="BundleParametros.nombre_archivo.log_imp_deu"
                                                    validatorExpression="#{LogImpDeu5.validatorNombreArchivo1.validate}"/>
                                                <webuijsf:staticText id="campoNombreArchivo1Texto1"
                                                    binding="#{LogImpDeu5.campoNombreArchivo1Texto1}"
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
                                                    rendered="#{LogImpDeu5.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{LogImpDeu5.campoNombreArchivo1Boton3}"
                                                    id="campoNombreArchivo1Boton3"
                                                    onClick="#{LogImpDeu5.asistente.scriptCampoNombreArchivo1Boton3}"
                                                    rendered="#{LogImpDeu5.asistente.campoNombreArchivo1Boton3Rendered}"
                                                    text="#{LogImpDeu5.asistente.textCampoNombreArchivo1Boton3}"
                                                    toolTip="#{LogImpDeu5.asistente.toolTipCampoNombreArchivo1Boton3}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpDeu5.tableColumnCodigoArchivo1}"
                                                    headerText="c&#243;digo archivo"
                                                    id="tableColumnCodigoArchivo1" rendered="false"
                                                    sort="codigo_archivo">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextCodigoArchivo1"
                                                    text="#{currentRow.value['codigo_archivo']}"
                                                    rendered="#{LogImpDeu5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpDeu5.labelCodigoArchivo1}"
                                                    id="labelCodigoArchivo1"
                                                    for="campoCodigoArchivo1"/>
                                                <webuijsf:textArea id="campoCodigoArchivo1"
                                                    binding="#{LogImpDeu5.campoCodigoArchivo1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpDeu5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['codigo_archivo']}"
                                                    toolTip="BundleParametros.codigo_archivo.log_imp_deu"
                                                    validatorExpression="#{LogImpDeu5.validatorCodigoArchivo1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoArchivo1Texto1"
                                                    binding="#{LogImpDeu5.campoCodigoArchivo1Texto1}"
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
                                                        binding="#{LogImpDeu5.etiquetaTextoFilasPorPagina1}" 
                                                        for="textoFilasPorPagina1"
                                                        id="etiquetaTextoFilasPorPagina1" 
                                                        text="#{LogImpDeu5.gestor.i18n.textoEtiquetaTextoFilasPorPagina}"/>
                                                </h:panelGrid>
                                                <h:panelGrid 
                                                    columns="3" 
                                                    id="gridPanel107">
                                                    <webuijsf:textField 
                                                        binding="#{LogImpDeu5.textoFilasPorPagina1}" 
                                                        columns="2"
                                                        converter="#{LogImpDeu5.textoFilasPorPagina1Converter1}"
                                                        disabled="#{LogImpDeu5.gestor.paginacionInhabilitada}" 
                                                        id="textoFilasPorPagina1" maxLength="2"
                                                        text="#{LogImpDeu5.gestor.filasPorPagina}" 
                                                        validatorExpression="#{LogImpDeu5.textoFilasPorPagina1Validator1.validate}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{LogImpDeu5.botonRepaginar1_action}"
                                                        binding="#{LogImpDeu5.botonRepaginar1}" 
                                                        id="botonRepaginar1"
                                                        imageURL="#{LogImpDeu5.gestor.urlImagenRepaginar}" 
                                                        onClick="#{LogImpDeu5.gestor.scriptRepaginar}"
                                                        text="#{LogImpDeu5.gestor.i18n.textoBotonRepaginar}"
                                                        toolTip="#{LogImpDeu5.gestor.i18n.toolTipBotonRepaginar}"/>
                                                    <webuijsf:message 
                                                        for="textoFilasPorPagina1" 
                                                        id="messageFilasPorPagina1"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="13"
                                                id="gridPanel108">
                                                <webuijsf:button
                                                    actionExpression="#{LogImpDeu5.botonAgregar1_action}"
                                                    binding="#{LogImpDeu5.botonAgregar1}"
                                                    disabled="#{LogImpDeu5.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{LogImpDeu5.gestor.scriptAgregar}"
                                                    rendered="#{LogImpDeu5.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpDeu5.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{LogImpDeu5.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{LogImpDeu5.listaFuncionEdicion1}"
                                                    converter="#{LogImpDeu5.converterListaFuncionEdicion1}"
                                                    disabled="#{LogImpDeu5.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{LogImpDeu5.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{LogImpDeu5.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{LogImpDeu5.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{LogImpDeu5.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpDeu5.botonEditar1_action}"
                                                    binding="#{LogImpDeu5.botonEditar1}"
                                                    disabled="#{LogImpDeu5.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{LogImpDeu5.gestor.scriptEditar}"
                                                    rendered="#{LogImpDeu5.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpDeu5.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{LogImpDeu5.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpDeu5.botonEliminar1_action}"
                                                    binding="#{LogImpDeu5.botonEliminar1}"
                                                    disabled="#{LogImpDeu5.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{LogImpDeu5.gestor.scriptEliminar}"
                                                    rendered="#{LogImpDeu5.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpDeu5.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{LogImpDeu5.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpDeu5.botonAplicar1_action}"
                                                    binding="#{LogImpDeu5.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{LogImpDeu5.gestor.scriptAplicar}"
                                                    rendered="#{LogImpDeu5.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpDeu5.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{LogImpDeu5.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpDeu5.botonDeshacer1_action}"
                                                    binding="#{LogImpDeu5.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{LogImpDeu5.gestor.scriptDeshacer}"
                                                    rendered="#{LogImpDeu5.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpDeu5.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{LogImpDeu5.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpDeu5.botonConfirmar1_action}"
                                                    binding="#{LogImpDeu5.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{LogImpDeu5.gestor.scriptConfirmar}"
                                                    rendered="#{LogImpDeu5.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpDeu5.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{LogImpDeu5.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpDeu5.botonDescartar1_action}"
                                                    binding="#{LogImpDeu5.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{LogImpDeu5.gestor.scriptDescartar}"
                                                    rendered="#{LogImpDeu5.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpDeu5.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{LogImpDeu5.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{LogImpDeu5.listaFuncionAccion1}"
                                                    converter="#{LogImpDeu5.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{LogImpDeu5.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{LogImpDeu5.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{LogImpDeu5.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{LogImpDeu5.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpDeu5.botonProcesar1_action}"
                                                    binding="#{LogImpDeu5.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{LogImpDeu5.gestor.scriptProcesar}"
                                                    rendered="#{LogImpDeu5.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpDeu5.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{LogImpDeu5.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpDeu5.botonRefrescar1_action}"
                                                    binding="#{LogImpDeu5.botonRefrescar1}"
                                                    disabled="#{LogImpDeu5.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{LogImpDeu5.gestor.scriptRefrescar}"
                                                    rendered="#{LogImpDeu5.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpDeu5.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{LogImpDeu5.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpDeu5.botonReconsultar1_action}"
                                                    binding="#{LogImpDeu5.botonReconsultar1}"
                                                    disabled="#{LogImpDeu5.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{LogImpDeu5.gestor.scriptReconsultar}"
                                                    rendered="#{LogImpDeu5.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpDeu5.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{LogImpDeu5.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpDeu5.botonRetornar1_action}"
                                                    binding="#{LogImpDeu5.botonRetornar1}"
                                                    disabled="#{LogImpDeu5.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{LogImpDeu5.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{LogImpDeu5.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpDeu5.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{LogImpDeu5.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel109"
                                                rendered="#{LogImpDeu5.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{LogImpDeu5.imageHyperlink1_action}"
                                                    binding="#{LogImpDeu5.imageHyperlink1}"
                                                    disabled="#{LogImpDeu5.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{LogImpDeu5.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{LogImpDeu5.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{LogImpDeu5.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.LogImpDeu5_imageHyperlink1_toolTip}"/>
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
