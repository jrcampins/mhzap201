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
                    focus="#{LogImpCen5.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{LogImpCen5.gestor.preserveFocus}"
                    preserveScroll="#{LogImpCen5.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{LogImpCen5.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | checkbox1 campoIdLogImpCen1 campoOrden1 campoBarrio1 campoDireccion1 campoTelefono1 campoPrimerNombre1 campoSegundoNombre1 campoPrimerApellido1 campoSegundoApellido1 campoEdadALaFecha1 campoSexo1 campoParentesco1 campoCedula1 campoNombreJefeHogar1 campoCedulaJefeHogar1 campoIcv1 campoValidado1 campoObservaciones1 campoFuncionario1 campoCausaInvalidacion1 listaEsImportado1 campoObservacion1 campoFechaHoraTransaccion1 campoNombreArchivo1 campoCodigoArchivo1 textoFilasPorPagina1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | textoFilasPorPagina1 | botonRepaginar1 , virtualForm3 | checkbox1 listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonEscogerFila1 botonDetallarFila1 botonProcesarFila1 botonRetornarFila1 botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{LogImpCen5.breadcrumbs1}" 
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
                                                    rendered="#{LogImpCen5.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{LogImpCen5.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{LogImpCen5.gestor.mensajeDisponible}"
                                                    text="#{LogImpCen5.gestor.mensaje}"
                                                    url="#{LogImpCen5.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:table
                                            binding="#{LogImpCen5.table1}"
                                            clearSortButton="true" 
                                            deselectMultipleButton="true" 
                                            id="table1"
                                            paginateButton="false"
                                            paginationControls="true" 
                                            selectMultipleButton="true" 
                                            sortPanelToggleButton="true"
                                            width="960">
                                            <webuijsf:tableRowGroup 
                                                binding="#{LogImpCen5.tableRowGroup1}" 
                                                id="tableRowGroup1" 
                                                rows="1"
                                                selected="#{LogImpCen5.gestor.filaEscogida}" 
                                                sourceData="#{LogImpCen5.logImpCenDataProvider}" 
                                                sourceVar="currentRow">
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    id="tableRowGroup1SelectionColumn"
                                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);" 
                                                    selectId="checkbox1">
                                                    <webuijsf:checkbox 
                                                        binding="#{LogImpCen5.checkbox1}" 
                                                        id="checkbox1"
                                                        onClick="#{LogImpCen5.gestor.scriptElegir}" 
                                                        selected="#{LogImpCen5.gestor.filaElegida}" 
                                                        toolTip="#{LogImpCen5.gestor.i18n.toolTipCheckboxSeleccionMultiple}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    binding="#{LogImpCen5.tableColumn1}" 
                                                    id="tableColumn1">
                                                    <webuijsf:button 
                                                        actionExpression="#{LogImpCen5.botonEscogerFila1_action}"
                                                        binding="#{LogImpCen5.botonEscogerFila1}"
                                                        disabled="#{LogImpCen5.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonEscogerFila1"
                                                        imageURL="#{LogImpCen5.gestor.urlImagenEscoger}" 
                                                        onClick="#{LogImpCen5.gestor.scriptEscoger}"
                                                        text="#{LogImpCen5.gestor.i18n.textoBotonEscogerFila}"
                                                        toolTip="#{LogImpCen5.gestor.i18n.toolTipBotonEscogerFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{LogImpCen5.botonDetallarFila1_action}"
                                                        binding="#{LogImpCen5.botonDetallarFila1}"
                                                        disabled="#{LogImpCen5.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonDetallarFila1"
                                                        imageURL="#{LogImpCen5.gestor.urlImagenDetallar}" 
                                                        onClick="#{LogImpCen5.scriptAbrirVentanaVerDetalle}"
                                                        rendered="#{LogImpCen5.gestor.detalleDisponible}" 
                                                        text="#{LogImpCen5.gestor.i18n.textoBotonDetallarFila}"
                                                        toolTip="#{LogImpCen5.gestor.i18n.toolTipBotonDetallarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{LogImpCen5.botonProcesarFila1_action}"
                                                        binding="#{LogImpCen5.botonProcesarFila1}"
                                                        disabled="#{LogImpCen5.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonProcesarFila1"
                                                        imageURL="#{LogImpCen5.gestor.urlImagenProcesar}" 
                                                        onClick="#{LogImpCen5.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{LogImpCen5.asistente.comandoDisponible}" 
                                                        text="#{LogImpCen5.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{LogImpCen5.gestor.i18n.toolTipBotonProcesarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{LogImpCen5.botonRetornarFila1_action}"
                                                        binding="#{LogImpCen5.botonRetornarFila1}" 
                                                        disabled="#{LogImpCen5.gestor.funcionReturnInhabilitada}"
                                                        id="botonRetornarFila1"
                                                        imageURL="#{LogImpCen5.gestor.urlImagenRetornar}"
                                                        onClick="#{LogImpCen5.gestor.scriptRetornarRecursoActual}"
                                                        rendered="#{LogImpCen5.gestor.funcionReturnVisible}" 
                                                        text="#{LogImpCen5.gestor.i18n.textoBotonRetornarFila}"
                                                        toolTip="#{LogImpCen5.gestor.i18n.toolTipBotonRetornarFila}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpCen5.tableColumn2}"
                                                    id="tableColumn2"
                                                    rendered="#{LogImpCen5.gestor.designing}">
                                                    <webuijsf:imageHyperlink
                                                        actionExpression="#{LogImpCen5.hipervinculoAccionFila1_action}"
                                                        binding="#{LogImpCen5.hipervinculoAccionFila1}"
                                                        disabled="#{LogImpCen5.gestor.loteConCambios}"
                                                        id="hipervinculoAccionFila1"
                                                        imageURL="#{LogImpCen5.gestor.urlImagenEjecutarVinculo}"
                                                        onClick="#{LogImpCen5.scriptAbrirVentanaAccionFila1}"
                                                        text="Accion1"
                                                        toolTip="#{bundle.LogImpCen5_hipervinculoAccionFila1_toolTip}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="right" 
                                                    binding="#{LogImpCen5.tableColumn3}" 
                                                    headerText="#{LogImpCen5.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{LogImpCen5.gestor.i18n.toolTipEtiquetaIdentificacionFila}"
                                                    id="tableColumn3">
                                                    <webuijsf:imageHyperlink 
                                                        actionExpression="#{LogImpCen5.hipervinculoDetallarFila1_action}"
                                                        binding="#{LogImpCen5.hipervinculoDetallarFila1}" 
                                                        id="hipervinculoDetallarFila1"
                                                        imageURL="#{LogImpCen5.gestor.urlImagenFilaProcesada}"
                                                        textPosition="left" 
                                                        text="#{LogImpCen5.gestor.identificacionFila}" 
                                                        toolTip="#{LogImpCen5.gestor.toolTipImagenFilaProcesada}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpCen5.tableColumnIdLogImpCen1}"
                                                    headerText="identificaci&#243;n"
                                                    id="tableColumnIdLogImpCen1" rendered="false"
                                                    sort="id_log_imp_cen">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdLogImpCen1"
                                                    text="#{currentRow.value['id_log_imp_cen']}"
                                                    rendered="#{LogImpCen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpCen5.labelIdLogImpCen1}"
                                                    id="labelIdLogImpCen1"
                                                    for="campoIdLogImpCen1"/>
                                                <webuijsf:textField id="campoIdLogImpCen1"
                                                    binding="#{LogImpCen5.campoIdLogImpCen1}"
                                                    converter="#{LogImpCen5.converterIdLogImpCen1}"
                                                    readOnly="#{LogImpCen5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['id_log_imp_cen']}"
                                                    toolTip="BundleParametros.id_log_imp_cen.log_imp_cen"
                                                    validatorExpression="#{LogImpCen5.validatorIdLogImpCen1.validate}"/>
                                                <webuijsf:staticText id="campoIdLogImpCen1Texto1"
                                                    binding="#{LogImpCen5.campoIdLogImpCen1Texto1}"
                                                    text="#{currentRow.value['id_log_imp_cen']}"/>
                                                <webuijsf:message id="messageIdLogImpCen1"
                                                    for="campoIdLogImpCen1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpCen5.tableColumnOrden1}"
                                                    headerText="orden"
                                                    id="tableColumnOrden1" rendered="false"
                                                    sort="orden">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextOrden1"
                                                    text="#{currentRow.value['orden']}"
                                                    rendered="#{LogImpCen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpCen5.labelOrden1}"
                                                    id="labelOrden1"
                                                    for="campoOrden1"/>
                                                <webuijsf:textArea id="campoOrden1"
                                                    binding="#{LogImpCen5.campoOrden1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpCen5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['orden']}"
                                                    toolTip="BundleParametros.orden.log_imp_cen"
                                                    validatorExpression="#{LogImpCen5.validatorOrden1.validate}"/>
                                                <webuijsf:staticText id="campoOrden1Texto1"
                                                    binding="#{LogImpCen5.campoOrden1Texto1}"
                                                    text="#{currentRow.value['orden']}"/>
                                                <webuijsf:message id="messageOrden1"
                                                    for="campoOrden1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpCen5.tableColumnBarrio1}"
                                                    headerText="barrio"
                                                    id="tableColumnBarrio1" rendered="false"
                                                    sort="barrio">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextBarrio1"
                                                    text="#{currentRow.value['barrio']}"
                                                    rendered="#{LogImpCen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpCen5.labelBarrio1}"
                                                    id="labelBarrio1"
                                                    for="campoBarrio1"/>
                                                <webuijsf:textArea id="campoBarrio1"
                                                    binding="#{LogImpCen5.campoBarrio1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpCen5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['barrio']}"
                                                    toolTip="BundleParametros.barrio.log_imp_cen"
                                                    validatorExpression="#{LogImpCen5.validatorBarrio1.validate}"/>
                                                <webuijsf:staticText id="campoBarrio1Texto1"
                                                    binding="#{LogImpCen5.campoBarrio1Texto1}"
                                                    text="#{currentRow.value['barrio']}"/>
                                                <webuijsf:message id="messageBarrio1"
                                                    for="campoBarrio1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpCen5.tableColumnDireccion1}"
                                                    headerText="direcci&#243;n"
                                                    id="tableColumnDireccion1" rendered="false"
                                                    sort="direccion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextDireccion1"
                                                    text="#{currentRow.value['direccion']}"
                                                    rendered="#{LogImpCen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpCen5.labelDireccion1}"
                                                    id="labelDireccion1"
                                                    for="campoDireccion1"/>
                                                <webuijsf:textArea id="campoDireccion1"
                                                    binding="#{LogImpCen5.campoDireccion1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpCen5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['direccion']}"
                                                    toolTip="BundleParametros.direccion.log_imp_cen"
                                                    validatorExpression="#{LogImpCen5.validatorDireccion1.validate}"/>
                                                <webuijsf:staticText id="campoDireccion1Texto1"
                                                    binding="#{LogImpCen5.campoDireccion1Texto1}"
                                                    text="#{currentRow.value['direccion']}"/>
                                                <webuijsf:message id="messageDireccion1"
                                                    for="campoDireccion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpCen5.tableColumnTelefono1}"
                                                    headerText="tel&#233;fono"
                                                    id="tableColumnTelefono1" rendered="false"
                                                    sort="telefono">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextTelefono1"
                                                    text="#{currentRow.value['telefono']}"
                                                    rendered="#{LogImpCen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpCen5.labelTelefono1}"
                                                    id="labelTelefono1"
                                                    for="campoTelefono1"/>
                                                <webuijsf:textArea id="campoTelefono1"
                                                    binding="#{LogImpCen5.campoTelefono1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpCen5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['telefono']}"
                                                    toolTip="BundleParametros.telefono.log_imp_cen"
                                                    validatorExpression="#{LogImpCen5.validatorTelefono1.validate}"/>
                                                <webuijsf:staticText id="campoTelefono1Texto1"
                                                    binding="#{LogImpCen5.campoTelefono1Texto1}"
                                                    text="#{currentRow.value['telefono']}"/>
                                                <webuijsf:message id="messageTelefono1"
                                                    for="campoTelefono1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpCen5.tableColumnPrimerNombre1}"
                                                    headerText="primer nombre"
                                                    id="tableColumnPrimerNombre1" rendered="false"
                                                    sort="primer_nombre">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextPrimerNombre1"
                                                    text="#{currentRow.value['primer_nombre']}"
                                                    rendered="#{LogImpCen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpCen5.labelPrimerNombre1}"
                                                    id="labelPrimerNombre1"
                                                    for="campoPrimerNombre1"/>
                                                <webuijsf:textArea id="campoPrimerNombre1"
                                                    binding="#{LogImpCen5.campoPrimerNombre1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpCen5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['primer_nombre']}"
                                                    toolTip="BundleParametros.primer_nombre.log_imp_cen"
                                                    validatorExpression="#{LogImpCen5.validatorPrimerNombre1.validate}"/>
                                                <webuijsf:staticText id="campoPrimerNombre1Texto1"
                                                    binding="#{LogImpCen5.campoPrimerNombre1Texto1}"
                                                    text="#{currentRow.value['primer_nombre']}"/>
                                                <webuijsf:message id="messagePrimerNombre1"
                                                    for="campoPrimerNombre1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpCen5.tableColumnSegundoNombre1}"
                                                    headerText="segundo nombre"
                                                    id="tableColumnSegundoNombre1" rendered="false"
                                                    sort="segundo_nombre">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextSegundoNombre1"
                                                    text="#{currentRow.value['segundo_nombre']}"
                                                    rendered="#{LogImpCen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpCen5.labelSegundoNombre1}"
                                                    id="labelSegundoNombre1"
                                                    for="campoSegundoNombre1"/>
                                                <webuijsf:textArea id="campoSegundoNombre1"
                                                    binding="#{LogImpCen5.campoSegundoNombre1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpCen5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['segundo_nombre']}"
                                                    toolTip="BundleParametros.segundo_nombre.log_imp_cen"
                                                    validatorExpression="#{LogImpCen5.validatorSegundoNombre1.validate}"/>
                                                <webuijsf:staticText id="campoSegundoNombre1Texto1"
                                                    binding="#{LogImpCen5.campoSegundoNombre1Texto1}"
                                                    text="#{currentRow.value['segundo_nombre']}"/>
                                                <webuijsf:message id="messageSegundoNombre1"
                                                    for="campoSegundoNombre1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpCen5.tableColumnPrimerApellido1}"
                                                    headerText="primer apellido"
                                                    id="tableColumnPrimerApellido1" rendered="false"
                                                    sort="primer_apellido">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextPrimerApellido1"
                                                    text="#{currentRow.value['primer_apellido']}"
                                                    rendered="#{LogImpCen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpCen5.labelPrimerApellido1}"
                                                    id="labelPrimerApellido1"
                                                    for="campoPrimerApellido1"/>
                                                <webuijsf:textArea id="campoPrimerApellido1"
                                                    binding="#{LogImpCen5.campoPrimerApellido1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpCen5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['primer_apellido']}"
                                                    toolTip="BundleParametros.primer_apellido.log_imp_cen"
                                                    validatorExpression="#{LogImpCen5.validatorPrimerApellido1.validate}"/>
                                                <webuijsf:staticText id="campoPrimerApellido1Texto1"
                                                    binding="#{LogImpCen5.campoPrimerApellido1Texto1}"
                                                    text="#{currentRow.value['primer_apellido']}"/>
                                                <webuijsf:message id="messagePrimerApellido1"
                                                    for="campoPrimerApellido1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpCen5.tableColumnSegundoApellido1}"
                                                    headerText="segundo apellido"
                                                    id="tableColumnSegundoApellido1" rendered="false"
                                                    sort="segundo_apellido">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextSegundoApellido1"
                                                    text="#{currentRow.value['segundo_apellido']}"
                                                    rendered="#{LogImpCen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpCen5.labelSegundoApellido1}"
                                                    id="labelSegundoApellido1"
                                                    for="campoSegundoApellido1"/>
                                                <webuijsf:textArea id="campoSegundoApellido1"
                                                    binding="#{LogImpCen5.campoSegundoApellido1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpCen5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['segundo_apellido']}"
                                                    toolTip="BundleParametros.segundo_apellido.log_imp_cen"
                                                    validatorExpression="#{LogImpCen5.validatorSegundoApellido1.validate}"/>
                                                <webuijsf:staticText id="campoSegundoApellido1Texto1"
                                                    binding="#{LogImpCen5.campoSegundoApellido1Texto1}"
                                                    text="#{currentRow.value['segundo_apellido']}"/>
                                                <webuijsf:message id="messageSegundoApellido1"
                                                    for="campoSegundoApellido1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpCen5.tableColumnEdadALaFecha1}"
                                                    headerText="edad a la fecha"
                                                    id="tableColumnEdadALaFecha1" rendered="false"
                                                    sort="edad_a_la_fecha">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEdadALaFecha1"
                                                    text="#{currentRow.value['edad_a_la_fecha']}"
                                                    rendered="#{LogImpCen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpCen5.labelEdadALaFecha1}"
                                                    id="labelEdadALaFecha1"
                                                    for="campoEdadALaFecha1"/>
                                                <webuijsf:textArea id="campoEdadALaFecha1"
                                                    binding="#{LogImpCen5.campoEdadALaFecha1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpCen5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['edad_a_la_fecha']}"
                                                    toolTip="BundleParametros.edad_a_la_fecha.log_imp_cen"
                                                    validatorExpression="#{LogImpCen5.validatorEdadALaFecha1.validate}"/>
                                                <webuijsf:staticText id="campoEdadALaFecha1Texto1"
                                                    binding="#{LogImpCen5.campoEdadALaFecha1Texto1}"
                                                    text="#{currentRow.value['edad_a_la_fecha']}"/>
                                                <webuijsf:message id="messageEdadALaFecha1"
                                                    for="campoEdadALaFecha1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpCen5.tableColumnSexo1}"
                                                    headerText="sexo"
                                                    id="tableColumnSexo1" rendered="false"
                                                    sort="sexo">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextSexo1"
                                                    text="#{currentRow.value['sexo']}"
                                                    rendered="#{LogImpCen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpCen5.labelSexo1}"
                                                    id="labelSexo1"
                                                    for="campoSexo1"/>
                                                <webuijsf:textArea id="campoSexo1"
                                                    binding="#{LogImpCen5.campoSexo1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpCen5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['sexo']}"
                                                    toolTip="BundleParametros.sexo.log_imp_cen"
                                                    validatorExpression="#{LogImpCen5.validatorSexo1.validate}"/>
                                                <webuijsf:staticText id="campoSexo1Texto1"
                                                    binding="#{LogImpCen5.campoSexo1Texto1}"
                                                    text="#{currentRow.value['sexo']}"/>
                                                <webuijsf:message id="messageSexo1"
                                                    for="campoSexo1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpCen5.tableColumnParentesco1}"
                                                    headerText="parentesco"
                                                    id="tableColumnParentesco1" rendered="false"
                                                    sort="parentesco">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextParentesco1"
                                                    text="#{currentRow.value['parentesco']}"
                                                    rendered="#{LogImpCen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpCen5.labelParentesco1}"
                                                    id="labelParentesco1"
                                                    for="campoParentesco1"/>
                                                <webuijsf:textArea id="campoParentesco1"
                                                    binding="#{LogImpCen5.campoParentesco1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpCen5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['parentesco']}"
                                                    toolTip="BundleParametros.parentesco.log_imp_cen"
                                                    validatorExpression="#{LogImpCen5.validatorParentesco1.validate}"/>
                                                <webuijsf:staticText id="campoParentesco1Texto1"
                                                    binding="#{LogImpCen5.campoParentesco1Texto1}"
                                                    text="#{currentRow.value['parentesco']}"/>
                                                <webuijsf:message id="messageParentesco1"
                                                    for="campoParentesco1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpCen5.tableColumnCedula1}"
                                                    headerText="c&#233;dula"
                                                    id="tableColumnCedula1" rendered="false"
                                                    sort="cedula">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextCedula1"
                                                    text="#{currentRow.value['cedula']}"
                                                    rendered="#{LogImpCen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpCen5.labelCedula1}"
                                                    id="labelCedula1"
                                                    for="campoCedula1"/>
                                                <webuijsf:textArea id="campoCedula1"
                                                    binding="#{LogImpCen5.campoCedula1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpCen5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['cedula']}"
                                                    toolTip="BundleParametros.cedula.log_imp_cen"
                                                    validatorExpression="#{LogImpCen5.validatorCedula1.validate}"/>
                                                <webuijsf:staticText id="campoCedula1Texto1"
                                                    binding="#{LogImpCen5.campoCedula1Texto1}"
                                                    text="#{currentRow.value['cedula']}"/>
                                                <webuijsf:message id="messageCedula1"
                                                    for="campoCedula1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpCen5.tableColumnNombreJefeHogar1}"
                                                    headerText="nombre jefe hogar"
                                                    id="tableColumnNombreJefeHogar1" rendered="false"
                                                    sort="nombre_jefe_hogar">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNombreJefeHogar1"
                                                    text="#{currentRow.value['nombre_jefe_hogar']}"
                                                    rendered="#{LogImpCen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpCen5.labelNombreJefeHogar1}"
                                                    id="labelNombreJefeHogar1"
                                                    for="campoNombreJefeHogar1"/>
                                                <webuijsf:textArea id="campoNombreJefeHogar1"
                                                    binding="#{LogImpCen5.campoNombreJefeHogar1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpCen5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['nombre_jefe_hogar']}"
                                                    toolTip="BundleParametros.nombre_jefe_hogar.log_imp_cen"
                                                    validatorExpression="#{LogImpCen5.validatorNombreJefeHogar1.validate}"/>
                                                <webuijsf:staticText id="campoNombreJefeHogar1Texto1"
                                                    binding="#{LogImpCen5.campoNombreJefeHogar1Texto1}"
                                                    text="#{currentRow.value['nombre_jefe_hogar']}"/>
                                                <webuijsf:message id="messageNombreJefeHogar1"
                                                    for="campoNombreJefeHogar1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpCen5.tableColumnCedulaJefeHogar1}"
                                                    headerText="c&#233;dula jefe hogar"
                                                    id="tableColumnCedulaJefeHogar1" rendered="false"
                                                    sort="cedula_jefe_hogar">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextCedulaJefeHogar1"
                                                    text="#{currentRow.value['cedula_jefe_hogar']}"
                                                    rendered="#{LogImpCen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpCen5.labelCedulaJefeHogar1}"
                                                    id="labelCedulaJefeHogar1"
                                                    for="campoCedulaJefeHogar1"/>
                                                <webuijsf:textArea id="campoCedulaJefeHogar1"
                                                    binding="#{LogImpCen5.campoCedulaJefeHogar1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpCen5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['cedula_jefe_hogar']}"
                                                    toolTip="BundleParametros.cedula_jefe_hogar.log_imp_cen"
                                                    validatorExpression="#{LogImpCen5.validatorCedulaJefeHogar1.validate}"/>
                                                <webuijsf:staticText id="campoCedulaJefeHogar1Texto1"
                                                    binding="#{LogImpCen5.campoCedulaJefeHogar1Texto1}"
                                                    text="#{currentRow.value['cedula_jefe_hogar']}"/>
                                                <webuijsf:message id="messageCedulaJefeHogar1"
                                                    for="campoCedulaJefeHogar1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpCen5.tableColumnIcv1}"
                                                    headerText="icv"
                                                    id="tableColumnIcv1" rendered="false"
                                                    sort="icv">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIcv1"
                                                    text="#{currentRow.value['icv']}"
                                                    rendered="#{LogImpCen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpCen5.labelIcv1}"
                                                    id="labelIcv1"
                                                    for="campoIcv1"/>
                                                <webuijsf:textArea id="campoIcv1"
                                                    binding="#{LogImpCen5.campoIcv1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpCen5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['icv']}"
                                                    toolTip="BundleParametros.icv.log_imp_cen"
                                                    validatorExpression="#{LogImpCen5.validatorIcv1.validate}"/>
                                                <webuijsf:staticText id="campoIcv1Texto1"
                                                    binding="#{LogImpCen5.campoIcv1Texto1}"
                                                    text="#{currentRow.value['icv']}"/>
                                                <webuijsf:message id="messageIcv1"
                                                    for="campoIcv1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpCen5.tableColumnValidado1}"
                                                    headerText="validado"
                                                    id="tableColumnValidado1" rendered="false"
                                                    sort="validado">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextValidado1"
                                                    text="#{currentRow.value['validado']}"
                                                    rendered="#{LogImpCen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpCen5.labelValidado1}"
                                                    id="labelValidado1"
                                                    for="campoValidado1"/>
                                                <webuijsf:textArea id="campoValidado1"
                                                    binding="#{LogImpCen5.campoValidado1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpCen5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['validado']}"
                                                    toolTip="BundleParametros.validado.log_imp_cen"
                                                    validatorExpression="#{LogImpCen5.validatorValidado1.validate}"/>
                                                <webuijsf:staticText id="campoValidado1Texto1"
                                                    binding="#{LogImpCen5.campoValidado1Texto1}"
                                                    text="#{currentRow.value['validado']}"/>
                                                <webuijsf:message id="messageValidado1"
                                                    for="campoValidado1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpCen5.tableColumnObservaciones1}"
                                                    headerText="observaciones"
                                                    id="tableColumnObservaciones1" rendered="false"
                                                    sort="observaciones">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextObservaciones1"
                                                    text="#{currentRow.value['observaciones']}"
                                                    rendered="#{LogImpCen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpCen5.labelObservaciones1}"
                                                    id="labelObservaciones1"
                                                    for="campoObservaciones1"/>
                                                <webuijsf:textArea id="campoObservaciones1"
                                                    binding="#{LogImpCen5.campoObservaciones1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpCen5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['observaciones']}"
                                                    toolTip="BundleParametros.observaciones.log_imp_cen"
                                                    validatorExpression="#{LogImpCen5.validatorObservaciones1.validate}"/>
                                                <webuijsf:staticText id="campoObservaciones1Texto1"
                                                    binding="#{LogImpCen5.campoObservaciones1Texto1}"
                                                    text="#{currentRow.value['observaciones']}"/>
                                                <webuijsf:message id="messageObservaciones1"
                                                    for="campoObservaciones1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpCen5.tableColumnFuncionario1}"
                                                    headerText="funcionario"
                                                    id="tableColumnFuncionario1" rendered="false"
                                                    sort="funcionario">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextFuncionario1"
                                                    text="#{currentRow.value['funcionario']}"
                                                    rendered="#{LogImpCen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpCen5.labelFuncionario1}"
                                                    id="labelFuncionario1"
                                                    for="campoFuncionario1"/>
                                                <webuijsf:textArea id="campoFuncionario1"
                                                    binding="#{LogImpCen5.campoFuncionario1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpCen5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['funcionario']}"
                                                    toolTip="BundleParametros.funcionario.log_imp_cen"
                                                    validatorExpression="#{LogImpCen5.validatorFuncionario1.validate}"/>
                                                <webuijsf:staticText id="campoFuncionario1Texto1"
                                                    binding="#{LogImpCen5.campoFuncionario1Texto1}"
                                                    text="#{currentRow.value['funcionario']}"/>
                                                <webuijsf:message id="messageFuncionario1"
                                                    for="campoFuncionario1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpCen5.tableColumnCausaInvalidacion1}"
                                                    headerText="causa invalidaci&#243;n"
                                                    id="tableColumnCausaInvalidacion1" rendered="false"
                                                    sort="causa_invalidacion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextCausaInvalidacion1"
                                                    text="#{currentRow.value['causa_invalidacion']}"
                                                    rendered="#{LogImpCen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpCen5.labelCausaInvalidacion1}"
                                                    id="labelCausaInvalidacion1"
                                                    for="campoCausaInvalidacion1"/>
                                                <webuijsf:textArea id="campoCausaInvalidacion1"
                                                    binding="#{LogImpCen5.campoCausaInvalidacion1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpCen5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['causa_invalidacion']}"
                                                    toolTip="BundleParametros.causa_invalidacion.log_imp_cen"
                                                    validatorExpression="#{LogImpCen5.validatorCausaInvalidacion1.validate}"/>
                                                <webuijsf:staticText id="campoCausaInvalidacion1Texto1"
                                                    binding="#{LogImpCen5.campoCausaInvalidacion1Texto1}"
                                                    text="#{currentRow.value['causa_invalidacion']}"/>
                                                <webuijsf:message id="messageCausaInvalidacion1"
                                                    for="campoCausaInvalidacion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpCen5.tableColumnEsImportado1}"
                                                    headerText="importado"
                                                    id="tableColumnEsImportado1" rendered="false"
                                                    sort="es_importado">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsImportado1"
                                                    text="#{currentRow.value['es_importado']}"
                                                    rendered="#{LogImpCen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpCen5.labelEsImportado1}"
                                                    id="labelEsImportado1"
                                                    for="listaEsImportado1"/>
                                                <webuijsf:dropDown id="listaEsImportado1"
                                                    binding="#{LogImpCen5.listaEsImportado1}"
                                                    converter="#{LogImpCen5.converterEsImportado1}"
                                                    disabled="#{LogImpCen5.gestor.filaNoProcesada}" required="true"
                                                    items="#{LogImpCen5.asistente.opcionesListaEsImportado1}"
                                                    selected="#{currentRow.value['es_importado']}"
                                                    toolTip="BundleParametros.es_importado.log_imp_cen"/>
                                                <webuijsf:staticText id="listaEsImportado1Texto1"
                                                    binding="#{LogImpCen5.listaEsImportado1Texto1}"/>
                                                <webuijsf:message id="messageEsImportado1"
                                                    for="listaEsImportado1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpCen5.tableColumnObservacion1}"
                                                    headerText="observaci&#243;n"
                                                    id="tableColumnObservacion1" rendered="false"
                                                    sort="observacion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextObservacion1"
                                                    text="#{currentRow.value['observacion']}"
                                                    rendered="#{LogImpCen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpCen5.labelObservacion1}"
                                                    id="labelObservacion1"
                                                    for="campoObservacion1"/>
                                                <webuijsf:textArea id="campoObservacion1"
                                                    binding="#{LogImpCen5.campoObservacion1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpCen5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['observacion']}"
                                                    toolTip="BundleParametros.observacion.log_imp_cen"
                                                    validatorExpression="#{LogImpCen5.validatorObservacion1.validate}"/>
                                                <webuijsf:staticText id="campoObservacion1Texto1"
                                                    binding="#{LogImpCen5.campoObservacion1Texto1}"
                                                    text="#{currentRow.value['observacion']}"/>
                                                <webuijsf:message id="messageObservacion1"
                                                    for="campoObservacion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpCen5.tableColumnFechaHoraTransaccion1}"
                                                    headerText="fecha hora transacci&#243;n"
                                                    id="tableColumnFechaHoraTransaccion1" rendered="false"
                                                    sort="fecha_hora_transaccion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextFechaHoraTransaccion1"
                                                    text="#{currentRow.value['fecha_hora_transaccion']}"
                                                    rendered="#{LogImpCen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpCen5.labelFechaHoraTransaccion1}"
                                                    id="labelFechaHoraTransaccion1"
                                                    for="campoFechaHoraTransaccion1"/>
                                                <webuijsf:textField id="campoFechaHoraTransaccion1"
                                                    binding="#{LogImpCen5.campoFechaHoraTransaccion1}"
                                                    converter="#{LogImpCen5.converterFechaHoraTransaccion1}"
                                                    readOnly="#{LogImpCen5.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['fecha_hora_transaccion']}"
                                                    toolTip="BundleParametros.fecha_hora_transaccion.log_imp_cen"/>
                                                <webuijsf:staticText id="campoFechaHoraTransaccion1Texto1"
                                                    binding="#{LogImpCen5.campoFechaHoraTransaccion1Texto1}"
                                                    converter="#{LogImpCen5.converterFechaHoraTransaccion1}"
                                                    text="#{currentRow.value['fecha_hora_transaccion']}"/>
                                                <webuijsf:message id="messageFechaHoraTransaccion1"
                                                    for="campoFechaHoraTransaccion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpCen5.tableColumnNombreArchivo1}"
                                                    headerText="nombre archivo"
                                                    id="tableColumnNombreArchivo1" rendered="false"
                                                    sort="nombre_archivo">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNombreArchivo1"
                                                    text="#{currentRow.value['nombre_archivo']}"
                                                    rendered="#{LogImpCen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpCen5.labelNombreArchivo1}"
                                                    id="labelNombreArchivo1"
                                                    for="campoNombreArchivo1"/>
                                                <webuijsf:textArea id="campoNombreArchivo1"
                                                    binding="#{LogImpCen5.campoNombreArchivo1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpCen5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['nombre_archivo']}"
                                                    toolTip="BundleParametros.nombre_archivo.log_imp_cen"
                                                    validatorExpression="#{LogImpCen5.validatorNombreArchivo1.validate}"/>
                                                <webuijsf:staticText id="campoNombreArchivo1Texto1"
                                                    binding="#{LogImpCen5.campoNombreArchivo1Texto1}"
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
                                                    rendered="#{LogImpCen5.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{LogImpCen5.campoNombreArchivo1Boton3}"
                                                    id="campoNombreArchivo1Boton3"
                                                    onClick="#{LogImpCen5.asistente.scriptCampoNombreArchivo1Boton3}"
                                                    rendered="#{LogImpCen5.asistente.campoNombreArchivo1Boton3Rendered}"
                                                    text="#{LogImpCen5.asistente.textCampoNombreArchivo1Boton3}"
                                                    toolTip="#{LogImpCen5.asistente.toolTipCampoNombreArchivo1Boton3}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpCen5.tableColumnCodigoArchivo1}"
                                                    headerText="c&#243;digo archivo"
                                                    id="tableColumnCodigoArchivo1" rendered="false"
                                                    sort="codigo_archivo">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextCodigoArchivo1"
                                                    text="#{currentRow.value['codigo_archivo']}"
                                                    rendered="#{LogImpCen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpCen5.labelCodigoArchivo1}"
                                                    id="labelCodigoArchivo1"
                                                    for="campoCodigoArchivo1"/>
                                                <webuijsf:textArea id="campoCodigoArchivo1"
                                                    binding="#{LogImpCen5.campoCodigoArchivo1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpCen5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['codigo_archivo']}"
                                                    toolTip="BundleParametros.codigo_archivo.log_imp_cen"
                                                    validatorExpression="#{LogImpCen5.validatorCodigoArchivo1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoArchivo1Texto1"
                                                    binding="#{LogImpCen5.campoCodigoArchivo1Texto1}"
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
                                                        binding="#{LogImpCen5.etiquetaTextoFilasPorPagina1}" 
                                                        for="textoFilasPorPagina1"
                                                        id="etiquetaTextoFilasPorPagina1" 
                                                        text="#{LogImpCen5.gestor.i18n.textoEtiquetaTextoFilasPorPagina}"/>
                                                </h:panelGrid>
                                                <h:panelGrid 
                                                    columns="3" 
                                                    id="gridPanel107">
                                                    <webuijsf:textField 
                                                        binding="#{LogImpCen5.textoFilasPorPagina1}" 
                                                        columns="2"
                                                        converter="#{LogImpCen5.textoFilasPorPagina1Converter1}"
                                                        disabled="#{LogImpCen5.gestor.paginacionInhabilitada}" 
                                                        id="textoFilasPorPagina1" maxLength="2"
                                                        text="#{LogImpCen5.gestor.filasPorPagina}" 
                                                        validatorExpression="#{LogImpCen5.textoFilasPorPagina1Validator1.validate}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{LogImpCen5.botonRepaginar1_action}"
                                                        binding="#{LogImpCen5.botonRepaginar1}" 
                                                        id="botonRepaginar1"
                                                        imageURL="#{LogImpCen5.gestor.urlImagenRepaginar}" 
                                                        onClick="#{LogImpCen5.gestor.scriptRepaginar}"
                                                        text="#{LogImpCen5.gestor.i18n.textoBotonRepaginar}"
                                                        toolTip="#{LogImpCen5.gestor.i18n.toolTipBotonRepaginar}"/>
                                                    <webuijsf:message 
                                                        for="textoFilasPorPagina1" 
                                                        id="messageFilasPorPagina1"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="13"
                                                id="gridPanel108">
                                                <webuijsf:button
                                                    actionExpression="#{LogImpCen5.botonAgregar1_action}"
                                                    binding="#{LogImpCen5.botonAgregar1}"
                                                    disabled="#{LogImpCen5.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{LogImpCen5.gestor.scriptAgregar}"
                                                    rendered="#{LogImpCen5.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpCen5.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{LogImpCen5.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{LogImpCen5.listaFuncionEdicion1}"
                                                    converter="#{LogImpCen5.converterListaFuncionEdicion1}"
                                                    disabled="#{LogImpCen5.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{LogImpCen5.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{LogImpCen5.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{LogImpCen5.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{LogImpCen5.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpCen5.botonEditar1_action}"
                                                    binding="#{LogImpCen5.botonEditar1}"
                                                    disabled="#{LogImpCen5.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{LogImpCen5.gestor.scriptEditar}"
                                                    rendered="#{LogImpCen5.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpCen5.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{LogImpCen5.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpCen5.botonEliminar1_action}"
                                                    binding="#{LogImpCen5.botonEliminar1}"
                                                    disabled="#{LogImpCen5.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{LogImpCen5.gestor.scriptEliminar}"
                                                    rendered="#{LogImpCen5.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpCen5.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{LogImpCen5.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpCen5.botonAplicar1_action}"
                                                    binding="#{LogImpCen5.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{LogImpCen5.gestor.scriptAplicar}"
                                                    rendered="#{LogImpCen5.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpCen5.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{LogImpCen5.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpCen5.botonDeshacer1_action}"
                                                    binding="#{LogImpCen5.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{LogImpCen5.gestor.scriptDeshacer}"
                                                    rendered="#{LogImpCen5.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpCen5.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{LogImpCen5.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpCen5.botonConfirmar1_action}"
                                                    binding="#{LogImpCen5.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{LogImpCen5.gestor.scriptConfirmar}"
                                                    rendered="#{LogImpCen5.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpCen5.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{LogImpCen5.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpCen5.botonDescartar1_action}"
                                                    binding="#{LogImpCen5.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{LogImpCen5.gestor.scriptDescartar}"
                                                    rendered="#{LogImpCen5.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpCen5.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{LogImpCen5.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{LogImpCen5.listaFuncionAccion1}"
                                                    converter="#{LogImpCen5.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{LogImpCen5.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{LogImpCen5.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{LogImpCen5.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{LogImpCen5.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpCen5.botonProcesar1_action}"
                                                    binding="#{LogImpCen5.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{LogImpCen5.gestor.scriptProcesar}"
                                                    rendered="#{LogImpCen5.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpCen5.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{LogImpCen5.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpCen5.botonRefrescar1_action}"
                                                    binding="#{LogImpCen5.botonRefrescar1}"
                                                    disabled="#{LogImpCen5.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{LogImpCen5.gestor.scriptRefrescar}"
                                                    rendered="#{LogImpCen5.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpCen5.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{LogImpCen5.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpCen5.botonReconsultar1_action}"
                                                    binding="#{LogImpCen5.botonReconsultar1}"
                                                    disabled="#{LogImpCen5.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{LogImpCen5.gestor.scriptReconsultar}"
                                                    rendered="#{LogImpCen5.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpCen5.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{LogImpCen5.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpCen5.botonRetornar1_action}"
                                                    binding="#{LogImpCen5.botonRetornar1}"
                                                    disabled="#{LogImpCen5.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{LogImpCen5.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{LogImpCen5.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpCen5.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{LogImpCen5.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel109"
                                                rendered="#{LogImpCen5.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{LogImpCen5.imageHyperlink1_action}"
                                                    binding="#{LogImpCen5.imageHyperlink1}"
                                                    disabled="#{LogImpCen5.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{LogImpCen5.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{LogImpCen5.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{LogImpCen5.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.LogImpCen5_imageHyperlink1_toolTip}"/>
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
