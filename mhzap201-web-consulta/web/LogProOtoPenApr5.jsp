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
                    focus="#{LogProOtoPenApr5.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{LogProOtoPenApr5.gestor.preserveFocus}"
                    preserveScroll="#{LogProOtoPenApr5.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{LogProOtoPenApr5.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | checkbox1 campoIdLogProOtoPenApr1 campoIdPersona1 campoCodigoPersona1 campoNombrePersona1 campoIdDepartamento1 campoIdDistrito1 campoIdBarrio1 listaNumeroCondicionPension1 listaEsProcesado1 campoObservacion1 campoFechaHoraTransaccion1 textoFilasPorPagina1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | textoFilasPorPagina1 | botonRepaginar1 , virtualForm3 | checkbox1 listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonEscogerFila1 botonDetallarFila1 botonProcesarFila1 botonRetornarFila1 botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{LogProOtoPenApr5.breadcrumbs1}" 
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
                                                    rendered="#{LogProOtoPenApr5.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{LogProOtoPenApr5.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{LogProOtoPenApr5.gestor.mensajeDisponible}"
                                                    text="#{LogProOtoPenApr5.gestor.mensaje}"
                                                    url="#{LogProOtoPenApr5.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:table
                                            binding="#{LogProOtoPenApr5.table1}"
                                            clearSortButton="true" 
                                            deselectMultipleButton="true" 
                                            id="table1"
                                            paginateButton="false"
                                            paginationControls="true" 
                                            selectMultipleButton="true" 
                                            sortPanelToggleButton="true"
                                            width="960">
                                            <webuijsf:tableRowGroup 
                                                binding="#{LogProOtoPenApr5.tableRowGroup1}" 
                                                id="tableRowGroup1" 
                                                rows="1"
                                                selected="#{LogProOtoPenApr5.gestor.filaEscogida}" 
                                                sourceData="#{LogProOtoPenApr5.logProOtoPenAprDataProvider}" 
                                                sourceVar="currentRow">
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    id="tableRowGroup1SelectionColumn"
                                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);" 
                                                    selectId="checkbox1">
                                                    <webuijsf:checkbox 
                                                        binding="#{LogProOtoPenApr5.checkbox1}" 
                                                        id="checkbox1"
                                                        onClick="#{LogProOtoPenApr5.gestor.scriptElegir}" 
                                                        selected="#{LogProOtoPenApr5.gestor.filaElegida}" 
                                                        toolTip="#{LogProOtoPenApr5.gestor.i18n.toolTipCheckboxSeleccionMultiple}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    binding="#{LogProOtoPenApr5.tableColumn1}" 
                                                    id="tableColumn1">
                                                    <webuijsf:button 
                                                        actionExpression="#{LogProOtoPenApr5.botonEscogerFila1_action}"
                                                        binding="#{LogProOtoPenApr5.botonEscogerFila1}"
                                                        disabled="#{LogProOtoPenApr5.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonEscogerFila1"
                                                        imageURL="#{LogProOtoPenApr5.gestor.urlImagenEscoger}" 
                                                        onClick="#{LogProOtoPenApr5.gestor.scriptEscoger}"
                                                        text="#{LogProOtoPenApr5.gestor.i18n.textoBotonEscogerFila}"
                                                        toolTip="#{LogProOtoPenApr5.gestor.i18n.toolTipBotonEscogerFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{LogProOtoPenApr5.botonDetallarFila1_action}"
                                                        binding="#{LogProOtoPenApr5.botonDetallarFila1}"
                                                        disabled="#{LogProOtoPenApr5.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonDetallarFila1"
                                                        imageURL="#{LogProOtoPenApr5.gestor.urlImagenDetallar}" 
                                                        onClick="#{LogProOtoPenApr5.scriptAbrirVentanaVerDetalle}"
                                                        rendered="#{LogProOtoPenApr5.gestor.detalleDisponible}" 
                                                        text="#{LogProOtoPenApr5.gestor.i18n.textoBotonDetallarFila}"
                                                        toolTip="#{LogProOtoPenApr5.gestor.i18n.toolTipBotonDetallarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{LogProOtoPenApr5.botonProcesarFila1_action}"
                                                        binding="#{LogProOtoPenApr5.botonProcesarFila1}"
                                                        disabled="#{LogProOtoPenApr5.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonProcesarFila1"
                                                        imageURL="#{LogProOtoPenApr5.gestor.urlImagenProcesar}" 
                                                        onClick="#{LogProOtoPenApr5.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{LogProOtoPenApr5.asistente.comandoDisponible}" 
                                                        text="#{LogProOtoPenApr5.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{LogProOtoPenApr5.gestor.i18n.toolTipBotonProcesarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{LogProOtoPenApr5.botonRetornarFila1_action}"
                                                        binding="#{LogProOtoPenApr5.botonRetornarFila1}" 
                                                        disabled="#{LogProOtoPenApr5.gestor.funcionReturnInhabilitada}"
                                                        id="botonRetornarFila1"
                                                        imageURL="#{LogProOtoPenApr5.gestor.urlImagenRetornar}"
                                                        onClick="#{LogProOtoPenApr5.gestor.scriptRetornarRecursoActual}"
                                                        rendered="#{LogProOtoPenApr5.gestor.funcionReturnVisible}" 
                                                        text="#{LogProOtoPenApr5.gestor.i18n.textoBotonRetornarFila}"
                                                        toolTip="#{LogProOtoPenApr5.gestor.i18n.toolTipBotonRetornarFila}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogProOtoPenApr5.tableColumn2}"
                                                    id="tableColumn2"
                                                    rendered="#{LogProOtoPenApr5.gestor.designing}">
                                                    <webuijsf:imageHyperlink
                                                        actionExpression="#{LogProOtoPenApr5.hipervinculoAccionFila1_action}"
                                                        binding="#{LogProOtoPenApr5.hipervinculoAccionFila1}"
                                                        disabled="#{LogProOtoPenApr5.gestor.loteConCambios}"
                                                        id="hipervinculoAccionFila1"
                                                        imageURL="#{LogProOtoPenApr5.gestor.urlImagenEjecutarVinculo}"
                                                        onClick="#{LogProOtoPenApr5.scriptAbrirVentanaAccionFila1}"
                                                        text="Accion1"
                                                        toolTip="#{bundle.LogProOtoPenApr5_hipervinculoAccionFila1_toolTip}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="right" 
                                                    binding="#{LogProOtoPenApr5.tableColumn3}" 
                                                    headerText="#{LogProOtoPenApr5.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{LogProOtoPenApr5.gestor.i18n.toolTipEtiquetaIdentificacionFila}"
                                                    id="tableColumn3">
                                                    <webuijsf:imageHyperlink 
                                                        actionExpression="#{LogProOtoPenApr5.hipervinculoDetallarFila1_action}"
                                                        binding="#{LogProOtoPenApr5.hipervinculoDetallarFila1}" 
                                                        id="hipervinculoDetallarFila1"
                                                        imageURL="#{LogProOtoPenApr5.gestor.urlImagenFilaProcesada}"
                                                        textPosition="left" 
                                                        text="#{LogProOtoPenApr5.gestor.identificacionFila}" 
                                                        toolTip="#{LogProOtoPenApr5.gestor.toolTipImagenFilaProcesada}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogProOtoPenApr5.tableColumnIdLogProOtoPenApr1}"
                                                    headerText="identificaci&#243;n"
                                                    id="tableColumnIdLogProOtoPenApr1" rendered="false"
                                                    sort="id_log_pro_oto_pen_apr">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdLogProOtoPenApr1"
                                                    text="#{currentRow.value['id_log_pro_oto_pen_apr']}"
                                                    rendered="#{LogProOtoPenApr5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogProOtoPenApr5.labelIdLogProOtoPenApr1}"
                                                    id="labelIdLogProOtoPenApr1"
                                                    for="campoIdLogProOtoPenApr1"/>
                                                <webuijsf:textField id="campoIdLogProOtoPenApr1"
                                                    binding="#{LogProOtoPenApr5.campoIdLogProOtoPenApr1}"
                                                    converter="#{LogProOtoPenApr5.converterIdLogProOtoPenApr1}"
                                                    readOnly="#{LogProOtoPenApr5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['id_log_pro_oto_pen_apr']}"
                                                    toolTip="BundleParametros.id_log_pro_oto_pen_apr.log_pro_oto_pen_apr"
                                                    validatorExpression="#{LogProOtoPenApr5.validatorIdLogProOtoPenApr1.validate}"/>
                                                <webuijsf:staticText id="campoIdLogProOtoPenApr1Texto1"
                                                    binding="#{LogProOtoPenApr5.campoIdLogProOtoPenApr1Texto1}"
                                                    text="#{currentRow.value['id_log_pro_oto_pen_apr']}"/>
                                                <webuijsf:message id="messageIdLogProOtoPenApr1"
                                                    for="campoIdLogProOtoPenApr1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogProOtoPenApr5.tableColumnIdPersona1}"
                                                    headerText="persona"
                                                    id="tableColumnIdPersona1"
                                                    sort="codigo_persona_1x1y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdPersona1"
                                                    text="#{currentRow.value['codigo_persona_1x1y3']}"
                                                    rendered="#{LogProOtoPenApr5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogProOtoPenApr5.labelIdPersona1}"
                                                    id="labelIdPersona1"
                                                    for="campoIdPersona1"/>
                                                <webuijsf:textField id="campoIdPersona1"
                                                    binding="#{LogProOtoPenApr5.campoIdPersona1}"
                                                    readOnly="#{LogProOtoPenApr5.gestor.filaNoProcesada}"
                                                    text="#{LogProOtoPenApr5.asistente.textoCampoIdPersona1}"
                                                    toolTip="#{LogProOtoPenApr5.asistente.toolTipCampoIdPersona1}"
                                                    validatorExpression="#{LogProOtoPenApr5.campoIdPersona1_validate}"/>
                                                <webuijsf:staticText id="campoIdPersona1Texto1"
                                                    binding="#{LogProOtoPenApr5.campoIdPersona1Texto1}"
                                                    text="#{currentRow.value['codigo_persona_1x1y3']}"/>
                                                <webuijsf:message id="messageIdPersona1"
                                                    for="campoIdPersona1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdPersona3"
                                                    rendered="#{LogProOtoPenApr5.asistente.tableColumnIdPersona3Rendered}"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdPersona3"
                                                    text="#{currentRow.value['id_persona']}"
                                                    rendered="#{LogProOtoPenApr5.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{LogProOtoPenApr5.campoIdPersona1Boton1}"
                                                    id="campoIdPersona1Boton1"
                                                    onClick="#{LogProOtoPenApr5.asistente.scriptCampoIdPersona1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{LogProOtoPenApr5.campoIdPersona1Boton3}"
                                                    id="campoIdPersona1Boton3"
                                                    onClick="#{LogProOtoPenApr5.asistente.scriptCampoIdPersona1Boton2}"
                                                    rendered="#{LogProOtoPenApr5.asistente.campoIdPersona1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{LogProOtoPenApr5.tableColumnIdPersona2}"
                                                    headerText="nombre persona"
                                                    id="tableColumnIdPersona2"
                                                    rendered="#{LogProOtoPenApr5.asistente.campoIdPersona1Boton2Rendered}"
                                                    sort="nombre_persona_1x1y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdPersona2"
                                                    text="#{currentRow.value['nombre_persona_1x1y4']}"
                                                    rendered="#{LogProOtoPenApr5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogProOtoPenApr5.labelIdPersona2}"
                                                    id="labelIdPersona2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{LogProOtoPenApr5.campoIdPersona1Hiper1}"
                                                    id="campoIdPersona1Hiper1"
                                                    text="#{currentRow.value['nombre_persona_1x1y4']}"
                                                    onClick="#{LogProOtoPenApr5.asistente.scriptCampoIdPersona1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdPersona1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogProOtoPenApr5.tableColumnCodigoPersona1}"
                                                    headerText="c&#243;digo persona"
                                                    id="tableColumnCodigoPersona1" rendered="false"
                                                    sort="codigo_persona">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextCodigoPersona1"
                                                    text="#{currentRow.value['codigo_persona']}"
                                                    rendered="#{LogProOtoPenApr5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogProOtoPenApr5.labelCodigoPersona1}"
                                                    id="labelCodigoPersona1"
                                                    for="campoCodigoPersona1"/>
                                                <webuijsf:textField id="campoCodigoPersona1"
                                                    binding="#{LogProOtoPenApr5.campoCodigoPersona1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{LogProOtoPenApr5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['codigo_persona']}"
                                                    toolTip="BundleParametros.codigo_persona.log_pro_oto_pen_apr"
                                                    validatorExpression="#{LogProOtoPenApr5.validatorCodigoPersona1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoPersona1Texto1"
                                                    binding="#{LogProOtoPenApr5.campoCodigoPersona1Texto1}"
                                                    text="#{currentRow.value['codigo_persona']}"/>
                                                <webuijsf:message id="messageCodigoPersona1"
                                                    for="campoCodigoPersona1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogProOtoPenApr5.tableColumnNombrePersona1}"
                                                    headerText="nombre persona"
                                                    id="tableColumnNombrePersona1" rendered="false"
                                                    sort="nombre_persona">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNombrePersona1"
                                                    text="#{currentRow.value['nombre_persona']}"
                                                    rendered="#{LogProOtoPenApr5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogProOtoPenApr5.labelNombrePersona1}"
                                                    id="labelNombrePersona1"
                                                    for="campoNombrePersona1"/>
                                                <webuijsf:textField id="campoNombrePersona1"
                                                    binding="#{LogProOtoPenApr5.campoNombrePersona1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{LogProOtoPenApr5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['nombre_persona']}"
                                                    toolTip="BundleParametros.nombre_persona.log_pro_oto_pen_apr"
                                                    validatorExpression="#{LogProOtoPenApr5.validatorNombrePersona1.validate}"/>
                                                <webuijsf:staticText id="campoNombrePersona1Texto1"
                                                    binding="#{LogProOtoPenApr5.campoNombrePersona1Texto1}"
                                                    text="#{currentRow.value['nombre_persona']}"/>
                                                <webuijsf:message id="messageNombrePersona1"
                                                    for="campoNombrePersona1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogProOtoPenApr5.tableColumnIdDepartamento1}"
                                                    headerText="departamento"
                                                    id="tableColumnIdDepartamento1" rendered="false"
                                                    sort="codigo_ubicacion_1x2y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdDepartamento1"
                                                    text="#{currentRow.value['codigo_ubicacion_1x2y3']}"
                                                    rendered="#{LogProOtoPenApr5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogProOtoPenApr5.labelIdDepartamento1}"
                                                    id="labelIdDepartamento1"
                                                    for="campoIdDepartamento1"/>
                                                <webuijsf:textField id="campoIdDepartamento1"
                                                    binding="#{LogProOtoPenApr5.campoIdDepartamento1}"
                                                    readOnly="#{LogProOtoPenApr5.gestor.filaNoProcesada}"
                                                    text="#{LogProOtoPenApr5.asistente.textoCampoIdDepartamento1}"
                                                    toolTip="#{LogProOtoPenApr5.asistente.toolTipCampoIdDepartamento1}"
                                                    validatorExpression="#{LogProOtoPenApr5.campoIdDepartamento1_validate}"/>
                                                <webuijsf:staticText id="campoIdDepartamento1Texto1"
                                                    binding="#{LogProOtoPenApr5.campoIdDepartamento1Texto1}"
                                                    text="#{currentRow.value['codigo_ubicacion_1x2y3']}"/>
                                                <webuijsf:message id="messageIdDepartamento1"
                                                    for="campoIdDepartamento1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdDepartamento3" rendered="false"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdDepartamento3"
                                                    text="#{currentRow.value['id_departamento']}"
                                                    rendered="#{LogProOtoPenApr5.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{LogProOtoPenApr5.campoIdDepartamento1Boton1}"
                                                    id="campoIdDepartamento1Boton1"
                                                    onClick="#{LogProOtoPenApr5.asistente.scriptCampoIdDepartamento1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{LogProOtoPenApr5.campoIdDepartamento1Boton3}"
                                                    id="campoIdDepartamento1Boton3"
                                                    onClick="#{LogProOtoPenApr5.asistente.scriptCampoIdDepartamento1Boton2}"
                                                    rendered="#{LogProOtoPenApr5.asistente.campoIdDepartamento1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{LogProOtoPenApr5.tableColumnIdDepartamento2}"
                                                    headerText="nombre departamento"
                                                    id="tableColumnIdDepartamento2" rendered="false"
                                                    sort="nombre_ubicacion_1x2y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdDepartamento2"
                                                    text="#{currentRow.value['nombre_ubicacion_1x2y4']}"
                                                    rendered="#{LogProOtoPenApr5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogProOtoPenApr5.labelIdDepartamento2}"
                                                    id="labelIdDepartamento2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{LogProOtoPenApr5.campoIdDepartamento1Hiper1}"
                                                    id="campoIdDepartamento1Hiper1"
                                                    text="#{currentRow.value['nombre_ubicacion_1x2y4']}"
                                                    onClick="#{LogProOtoPenApr5.asistente.scriptCampoIdDepartamento1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdDepartamento1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogProOtoPenApr5.tableColumnIdDistrito1}"
                                                    headerText="distrito"
                                                    id="tableColumnIdDistrito1" rendered="false"
                                                    sort="codigo_ubicacion_1x3y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdDistrito1"
                                                    text="#{currentRow.value['codigo_ubicacion_1x3y3']}"
                                                    rendered="#{LogProOtoPenApr5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogProOtoPenApr5.labelIdDistrito1}"
                                                    id="labelIdDistrito1"
                                                    for="campoIdDistrito1"/>
                                                <webuijsf:textField id="campoIdDistrito1"
                                                    binding="#{LogProOtoPenApr5.campoIdDistrito1}"
                                                    readOnly="#{LogProOtoPenApr5.gestor.filaNoProcesada}"
                                                    text="#{LogProOtoPenApr5.asistente.textoCampoIdDistrito1}"
                                                    toolTip="#{LogProOtoPenApr5.asistente.toolTipCampoIdDistrito1}"
                                                    validatorExpression="#{LogProOtoPenApr5.campoIdDistrito1_validate}"/>
                                                <webuijsf:staticText id="campoIdDistrito1Texto1"
                                                    binding="#{LogProOtoPenApr5.campoIdDistrito1Texto1}"
                                                    text="#{currentRow.value['codigo_ubicacion_1x3y3']}"/>
                                                <webuijsf:message id="messageIdDistrito1"
                                                    for="campoIdDistrito1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdDistrito3" rendered="false"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdDistrito3"
                                                    text="#{currentRow.value['id_distrito']}"
                                                    rendered="#{LogProOtoPenApr5.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{LogProOtoPenApr5.campoIdDistrito1Boton1}"
                                                    id="campoIdDistrito1Boton1"
                                                    onClick="#{LogProOtoPenApr5.asistente.scriptCampoIdDistrito1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{LogProOtoPenApr5.campoIdDistrito1Boton3}"
                                                    id="campoIdDistrito1Boton3"
                                                    onClick="#{LogProOtoPenApr5.asistente.scriptCampoIdDistrito1Boton2}"
                                                    rendered="#{LogProOtoPenApr5.asistente.campoIdDistrito1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{LogProOtoPenApr5.tableColumnIdDistrito2}"
                                                    headerText="nombre distrito"
                                                    id="tableColumnIdDistrito2" rendered="false"
                                                    sort="nombre_ubicacion_1x3y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdDistrito2"
                                                    text="#{currentRow.value['nombre_ubicacion_1x3y4']}"
                                                    rendered="#{LogProOtoPenApr5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogProOtoPenApr5.labelIdDistrito2}"
                                                    id="labelIdDistrito2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{LogProOtoPenApr5.campoIdDistrito1Hiper1}"
                                                    id="campoIdDistrito1Hiper1"
                                                    text="#{currentRow.value['nombre_ubicacion_1x3y4']}"
                                                    onClick="#{LogProOtoPenApr5.asistente.scriptCampoIdDistrito1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdDistrito1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogProOtoPenApr5.tableColumnIdBarrio1}"
                                                    headerText="barrio"
                                                    id="tableColumnIdBarrio1" rendered="false"
                                                    sort="codigo_ubicacion_1x4y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdBarrio1"
                                                    text="#{currentRow.value['codigo_ubicacion_1x4y3']}"
                                                    rendered="#{LogProOtoPenApr5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogProOtoPenApr5.labelIdBarrio1}"
                                                    id="labelIdBarrio1"
                                                    for="campoIdBarrio1"/>
                                                <webuijsf:textField id="campoIdBarrio1"
                                                    binding="#{LogProOtoPenApr5.campoIdBarrio1}"
                                                    readOnly="#{LogProOtoPenApr5.gestor.filaNoProcesada}"
                                                    text="#{LogProOtoPenApr5.asistente.textoCampoIdBarrio1}"
                                                    toolTip="#{LogProOtoPenApr5.asistente.toolTipCampoIdBarrio1}"
                                                    validatorExpression="#{LogProOtoPenApr5.campoIdBarrio1_validate}"/>
                                                <webuijsf:staticText id="campoIdBarrio1Texto1"
                                                    binding="#{LogProOtoPenApr5.campoIdBarrio1Texto1}"
                                                    text="#{currentRow.value['codigo_ubicacion_1x4y3']}"/>
                                                <webuijsf:message id="messageIdBarrio1"
                                                    for="campoIdBarrio1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdBarrio3" rendered="false"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdBarrio3"
                                                    text="#{currentRow.value['id_barrio']}"
                                                    rendered="#{LogProOtoPenApr5.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{LogProOtoPenApr5.campoIdBarrio1Boton1}"
                                                    id="campoIdBarrio1Boton1"
                                                    onClick="#{LogProOtoPenApr5.asistente.scriptCampoIdBarrio1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{LogProOtoPenApr5.campoIdBarrio1Boton3}"
                                                    id="campoIdBarrio1Boton3"
                                                    onClick="#{LogProOtoPenApr5.asistente.scriptCampoIdBarrio1Boton2}"
                                                    rendered="#{LogProOtoPenApr5.asistente.campoIdBarrio1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{LogProOtoPenApr5.tableColumnIdBarrio2}"
                                                    headerText="nombre barrio"
                                                    id="tableColumnIdBarrio2" rendered="false"
                                                    sort="nombre_ubicacion_1x4y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdBarrio2"
                                                    text="#{currentRow.value['nombre_ubicacion_1x4y4']}"
                                                    rendered="#{LogProOtoPenApr5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogProOtoPenApr5.labelIdBarrio2}"
                                                    id="labelIdBarrio2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{LogProOtoPenApr5.campoIdBarrio1Hiper1}"
                                                    id="campoIdBarrio1Hiper1"
                                                    text="#{currentRow.value['nombre_ubicacion_1x4y4']}"
                                                    onClick="#{LogProOtoPenApr5.asistente.scriptCampoIdBarrio1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdBarrio1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogProOtoPenApr5.tableColumnNumeroCondicionPension1}"
                                                    headerText="condici&#243;n pensi&#243;n"
                                                    id="tableColumnNumeroCondicionPension1" rendered="false"
                                                    sort="codigo_condicion_pension_1x5y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroCondicionPension1"
                                                    text="#{currentRow.value['codigo_condicion_pension_1x5y2']}"
                                                    rendered="#{LogProOtoPenApr5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogProOtoPenApr5.labelNumeroCondicionPension1}"
                                                    id="labelNumeroCondicionPension1"
                                                    for="listaNumeroCondicionPension1"/>
                                                <webuijsf:dropDown id="listaNumeroCondicionPension1"
                                                    binding="#{LogProOtoPenApr5.listaNumeroCondicionPension1}"
                                                    converter="#{LogProOtoPenApr5.converterNumeroCondicionPension1}"
                                                    disabled="#{LogProOtoPenApr5.gestor.filaNoProcesada}"
                                                    items="#{LogProOtoPenApr5.asistente.opcionesListaNumeroCondicionPension1}"
                                                    selected="#{currentRow.value['numero_condicion_pension']}"
                                                    toolTip="BundleParametros.numero_condicion_pension.log_pro_oto_pen_apr"/>
                                                <webuijsf:staticText id="listaNumeroCondicionPension1Texto1"
                                                    binding="#{LogProOtoPenApr5.listaNumeroCondicionPension1Texto1}"
                                                    text="#{currentRow.value['codigo_condicion_pension_1x5y2']}"/>
                                                <webuijsf:message id="messageNumeroCondicionPension1"
                                                    for="listaNumeroCondicionPension1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogProOtoPenApr5.tableColumnEsProcesado1}"
                                                    headerText="procesado"
                                                    id="tableColumnEsProcesado1"
                                                    sort="es_procesado">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsProcesado1"
                                                    text="#{currentRow.value['es_procesado']}"
                                                    rendered="#{LogProOtoPenApr5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogProOtoPenApr5.labelEsProcesado1}"
                                                    id="labelEsProcesado1"
                                                    for="listaEsProcesado1"/>
                                                <webuijsf:dropDown id="listaEsProcesado1"
                                                    binding="#{LogProOtoPenApr5.listaEsProcesado1}"
                                                    converter="#{LogProOtoPenApr5.converterEsProcesado1}"
                                                    disabled="#{LogProOtoPenApr5.gestor.filaNoProcesada}" required="true"
                                                    items="#{LogProOtoPenApr5.asistente.opcionesListaEsProcesado1}"
                                                    selected="#{currentRow.value['es_procesado']}"
                                                    toolTip="BundleParametros.es_procesado.log_pro_oto_pen_apr"/>
                                                <webuijsf:staticText id="listaEsProcesado1Texto1"
                                                    binding="#{LogProOtoPenApr5.listaEsProcesado1Texto1}"/>
                                                <webuijsf:message id="messageEsProcesado1"
                                                    for="listaEsProcesado1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogProOtoPenApr5.tableColumnObservacion1}"
                                                    headerText="observaci&#243;n"
                                                    id="tableColumnObservacion1" rendered="false"
                                                    sort="observacion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextObservacion1"
                                                    text="#{currentRow.value['observacion']}"
                                                    rendered="#{LogProOtoPenApr5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogProOtoPenApr5.labelObservacion1}"
                                                    id="labelObservacion1"
                                                    for="campoObservacion1"/>
                                                <webuijsf:textArea id="campoObservacion1"
                                                    binding="#{LogProOtoPenApr5.campoObservacion1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogProOtoPenApr5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['observacion']}"
                                                    toolTip="BundleParametros.observacion.log_pro_oto_pen_apr"
                                                    validatorExpression="#{LogProOtoPenApr5.validatorObservacion1.validate}"/>
                                                <webuijsf:staticText id="campoObservacion1Texto1"
                                                    binding="#{LogProOtoPenApr5.campoObservacion1Texto1}"
                                                    text="#{currentRow.value['observacion']}"/>
                                                <webuijsf:message id="messageObservacion1"
                                                    for="campoObservacion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogProOtoPenApr5.tableColumnFechaHoraTransaccion1}"
                                                    headerText="fecha hora transacci&#243;n"
                                                    id="tableColumnFechaHoraTransaccion1"
                                                    sort="fecha_hora_transaccion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextFechaHoraTransaccion1"
                                                    text="#{currentRow.value['fecha_hora_transaccion']}"
                                                    rendered="#{LogProOtoPenApr5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogProOtoPenApr5.labelFechaHoraTransaccion1}"
                                                    id="labelFechaHoraTransaccion1"
                                                    for="campoFechaHoraTransaccion1"/>
                                                <webuijsf:textField id="campoFechaHoraTransaccion1"
                                                    binding="#{LogProOtoPenApr5.campoFechaHoraTransaccion1}"
                                                    converter="#{LogProOtoPenApr5.converterFechaHoraTransaccion1}"
                                                    readOnly="#{LogProOtoPenApr5.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['fecha_hora_transaccion']}"
                                                    toolTip="BundleParametros.fecha_hora_transaccion.log_pro_oto_pen_apr"/>
                                                <webuijsf:staticText id="campoFechaHoraTransaccion1Texto1"
                                                    binding="#{LogProOtoPenApr5.campoFechaHoraTransaccion1Texto1}"
                                                    converter="#{LogProOtoPenApr5.converterFechaHoraTransaccion1}"
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
                                                        binding="#{LogProOtoPenApr5.etiquetaTextoFilasPorPagina1}" 
                                                        for="textoFilasPorPagina1"
                                                        id="etiquetaTextoFilasPorPagina1" 
                                                        text="#{LogProOtoPenApr5.gestor.i18n.textoEtiquetaTextoFilasPorPagina}"/>
                                                </h:panelGrid>
                                                <h:panelGrid 
                                                    columns="3" 
                                                    id="gridPanel107">
                                                    <webuijsf:textField 
                                                        binding="#{LogProOtoPenApr5.textoFilasPorPagina1}" 
                                                        columns="2"
                                                        converter="#{LogProOtoPenApr5.textoFilasPorPagina1Converter1}"
                                                        disabled="#{LogProOtoPenApr5.gestor.paginacionInhabilitada}" 
                                                        id="textoFilasPorPagina1" maxLength="2"
                                                        text="#{LogProOtoPenApr5.gestor.filasPorPagina}" 
                                                        validatorExpression="#{LogProOtoPenApr5.textoFilasPorPagina1Validator1.validate}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{LogProOtoPenApr5.botonRepaginar1_action}"
                                                        binding="#{LogProOtoPenApr5.botonRepaginar1}" 
                                                        id="botonRepaginar1"
                                                        imageURL="#{LogProOtoPenApr5.gestor.urlImagenRepaginar}" 
                                                        onClick="#{LogProOtoPenApr5.gestor.scriptRepaginar}"
                                                        text="#{LogProOtoPenApr5.gestor.i18n.textoBotonRepaginar}"
                                                        toolTip="#{LogProOtoPenApr5.gestor.i18n.toolTipBotonRepaginar}"/>
                                                    <webuijsf:message 
                                                        for="textoFilasPorPagina1" 
                                                        id="messageFilasPorPagina1"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="13"
                                                id="gridPanel108">
                                                <webuijsf:button
                                                    actionExpression="#{LogProOtoPenApr5.botonAgregar1_action}"
                                                    binding="#{LogProOtoPenApr5.botonAgregar1}"
                                                    disabled="#{LogProOtoPenApr5.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{LogProOtoPenApr5.gestor.scriptAgregar}"
                                                    rendered="#{LogProOtoPenApr5.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProOtoPenApr5.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{LogProOtoPenApr5.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{LogProOtoPenApr5.listaFuncionEdicion1}"
                                                    converter="#{LogProOtoPenApr5.converterListaFuncionEdicion1}"
                                                    disabled="#{LogProOtoPenApr5.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{LogProOtoPenApr5.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{LogProOtoPenApr5.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{LogProOtoPenApr5.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{LogProOtoPenApr5.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProOtoPenApr5.botonEditar1_action}"
                                                    binding="#{LogProOtoPenApr5.botonEditar1}"
                                                    disabled="#{LogProOtoPenApr5.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{LogProOtoPenApr5.gestor.scriptEditar}"
                                                    rendered="#{LogProOtoPenApr5.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProOtoPenApr5.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{LogProOtoPenApr5.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProOtoPenApr5.botonEliminar1_action}"
                                                    binding="#{LogProOtoPenApr5.botonEliminar1}"
                                                    disabled="#{LogProOtoPenApr5.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{LogProOtoPenApr5.gestor.scriptEliminar}"
                                                    rendered="#{LogProOtoPenApr5.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProOtoPenApr5.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{LogProOtoPenApr5.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProOtoPenApr5.botonAplicar1_action}"
                                                    binding="#{LogProOtoPenApr5.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{LogProOtoPenApr5.gestor.scriptAplicar}"
                                                    rendered="#{LogProOtoPenApr5.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProOtoPenApr5.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{LogProOtoPenApr5.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProOtoPenApr5.botonDeshacer1_action}"
                                                    binding="#{LogProOtoPenApr5.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{LogProOtoPenApr5.gestor.scriptDeshacer}"
                                                    rendered="#{LogProOtoPenApr5.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProOtoPenApr5.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{LogProOtoPenApr5.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProOtoPenApr5.botonConfirmar1_action}"
                                                    binding="#{LogProOtoPenApr5.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{LogProOtoPenApr5.gestor.scriptConfirmar}"
                                                    rendered="#{LogProOtoPenApr5.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProOtoPenApr5.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{LogProOtoPenApr5.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProOtoPenApr5.botonDescartar1_action}"
                                                    binding="#{LogProOtoPenApr5.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{LogProOtoPenApr5.gestor.scriptDescartar}"
                                                    rendered="#{LogProOtoPenApr5.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProOtoPenApr5.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{LogProOtoPenApr5.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{LogProOtoPenApr5.listaFuncionAccion1}"
                                                    converter="#{LogProOtoPenApr5.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{LogProOtoPenApr5.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{LogProOtoPenApr5.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{LogProOtoPenApr5.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{LogProOtoPenApr5.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProOtoPenApr5.botonProcesar1_action}"
                                                    binding="#{LogProOtoPenApr5.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{LogProOtoPenApr5.gestor.scriptProcesar}"
                                                    rendered="#{LogProOtoPenApr5.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProOtoPenApr5.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{LogProOtoPenApr5.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProOtoPenApr5.botonRefrescar1_action}"
                                                    binding="#{LogProOtoPenApr5.botonRefrescar1}"
                                                    disabled="#{LogProOtoPenApr5.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{LogProOtoPenApr5.gestor.scriptRefrescar}"
                                                    rendered="#{LogProOtoPenApr5.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProOtoPenApr5.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{LogProOtoPenApr5.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProOtoPenApr5.botonReconsultar1_action}"
                                                    binding="#{LogProOtoPenApr5.botonReconsultar1}"
                                                    disabled="#{LogProOtoPenApr5.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{LogProOtoPenApr5.gestor.scriptReconsultar}"
                                                    rendered="#{LogProOtoPenApr5.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProOtoPenApr5.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{LogProOtoPenApr5.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProOtoPenApr5.botonRetornar1_action}"
                                                    binding="#{LogProOtoPenApr5.botonRetornar1}"
                                                    disabled="#{LogProOtoPenApr5.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{LogProOtoPenApr5.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{LogProOtoPenApr5.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProOtoPenApr5.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{LogProOtoPenApr5.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel109"
                                                rendered="#{LogProOtoPenApr5.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{LogProOtoPenApr5.imageHyperlink1_action}"
                                                    binding="#{LogProOtoPenApr5.imageHyperlink1}"
                                                    disabled="#{LogProOtoPenApr5.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{LogProOtoPenApr5.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{LogProOtoPenApr5.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{LogProOtoPenApr5.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.LogProOtoPenApr5_imageHyperlink1_toolTip}"/>
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
