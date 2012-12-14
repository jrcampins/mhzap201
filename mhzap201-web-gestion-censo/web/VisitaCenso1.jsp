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
                    focus="#{VisitaCenso1.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{VisitaCenso1.gestor.preserveFocus}"
                    preserveScroll="#{VisitaCenso1.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{VisitaCenso1.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | checkbox1 campoIdVisitaCenso1 campoIdPotencialBen1 campoIdFuncionarioCensista1 campoFechaVisita1 campoObservaciones1 textoFilasPorPagina1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | textoFilasPorPagina1 | botonRepaginar1 , virtualForm3 | checkbox1 listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonEscogerFila1 botonDetallarFila1 botonProcesarFila1 botonRetornarFila1 botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{VisitaCenso1.breadcrumbs1}" 
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
                                                    rendered="#{VisitaCenso1.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{VisitaCenso1.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{VisitaCenso1.gestor.mensajeDisponible}"
                                                    text="#{VisitaCenso1.gestor.mensaje}"
                                                    url="#{VisitaCenso1.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:table
                                            binding="#{VisitaCenso1.table1}"
                                            clearSortButton="true" 
                                            deselectMultipleButton="true" 
                                            id="table1"
                                            paginateButton="false"
                                            paginationControls="true" 
                                            selectMultipleButton="true" 
                                            sortPanelToggleButton="true"
                                            width="960">
                                            <webuijsf:tableRowGroup 
                                                binding="#{VisitaCenso1.tableRowGroup1}" 
                                                id="tableRowGroup1" 
                                                rows="1"
                                                selected="#{VisitaCenso1.gestor.filaEscogida}" 
                                                sourceData="#{VisitaCenso1.visitaCensoDataProvider}" 
                                                sourceVar="currentRow">
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    id="tableRowGroup1SelectionColumn"
                                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);" 
                                                    selectId="checkbox1">
                                                    <webuijsf:checkbox 
                                                        binding="#{VisitaCenso1.checkbox1}" 
                                                        id="checkbox1"
                                                        onClick="#{VisitaCenso1.gestor.scriptElegir}" 
                                                        selected="#{VisitaCenso1.gestor.filaElegida}" 
                                                        toolTip="#{VisitaCenso1.gestor.i18n.toolTipCheckboxSeleccionMultiple}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    binding="#{VisitaCenso1.tableColumn1}" 
                                                    id="tableColumn1">
                                                    <webuijsf:button 
                                                        actionExpression="#{VisitaCenso1.botonEscogerFila1_action}"
                                                        binding="#{VisitaCenso1.botonEscogerFila1}"
                                                        disabled="#{VisitaCenso1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonEscogerFila1"
                                                        imageURL="#{VisitaCenso1.gestor.urlImagenEscoger}" 
                                                        onClick="#{VisitaCenso1.gestor.scriptEscoger}"
                                                        text="#{VisitaCenso1.gestor.i18n.textoBotonEscogerFila}"
                                                        toolTip="#{VisitaCenso1.gestor.i18n.toolTipBotonEscogerFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{VisitaCenso1.botonDetallarFila1_action}"
                                                        binding="#{VisitaCenso1.botonDetallarFila1}"
                                                        disabled="#{VisitaCenso1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonDetallarFila1"
                                                        imageURL="#{VisitaCenso1.gestor.urlImagenDetallar}" 
                                                        onClick="#{VisitaCenso1.scriptAbrirVentanaVerDetalle}"
                                                        rendered="#{VisitaCenso1.gestor.detalleDisponible}" 
                                                        text="#{VisitaCenso1.gestor.i18n.textoBotonDetallarFila}"
                                                        toolTip="#{VisitaCenso1.gestor.i18n.toolTipBotonDetallarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{VisitaCenso1.botonProcesarFila1_action}"
                                                        binding="#{VisitaCenso1.botonProcesarFila1}"
                                                        disabled="#{VisitaCenso1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonProcesarFila1"
                                                        imageURL="#{VisitaCenso1.gestor.urlImagenProcesar}" 
                                                        onClick="#{VisitaCenso1.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{VisitaCenso1.asistente.comandoDisponible}" 
                                                        text="#{VisitaCenso1.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{VisitaCenso1.gestor.i18n.toolTipBotonProcesarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{VisitaCenso1.botonRetornarFila1_action}"
                                                        binding="#{VisitaCenso1.botonRetornarFila1}" 
                                                        disabled="#{VisitaCenso1.gestor.funcionReturnInhabilitada}"
                                                        id="botonRetornarFila1"
                                                        imageURL="#{VisitaCenso1.gestor.urlImagenRetornar}"
                                                        onClick="#{VisitaCenso1.gestor.scriptRetornarRecursoActual}"
                                                        rendered="#{VisitaCenso1.gestor.funcionReturnVisible}" 
                                                        text="#{VisitaCenso1.gestor.i18n.textoBotonRetornarFila}"
                                                        toolTip="#{VisitaCenso1.gestor.i18n.toolTipBotonRetornarFila}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{VisitaCenso1.tableColumn2}"
                                                    id="tableColumn2"
                                                    rendered="#{VisitaCenso1.gestor.designing}">
                                                    <webuijsf:imageHyperlink
                                                        actionExpression="#{VisitaCenso1.hipervinculoAccionFila1_action}"
                                                        binding="#{VisitaCenso1.hipervinculoAccionFila1}"
                                                        disabled="#{VisitaCenso1.gestor.loteConCambios}"
                                                        id="hipervinculoAccionFila1"
                                                        imageURL="#{VisitaCenso1.gestor.urlImagenEjecutarVinculo}"
                                                        onClick="#{VisitaCenso1.scriptAbrirVentanaAccionFila1}"
                                                        text="Accion1"
                                                        toolTip="#{bundle.VisitaCenso1_hipervinculoAccionFila1_toolTip}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="right" 
                                                    binding="#{VisitaCenso1.tableColumn3}" 
                                                    headerText="#{VisitaCenso1.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{VisitaCenso1.gestor.i18n.toolTipEtiquetaIdentificacionFila}"
                                                    id="tableColumn3">
                                                    <webuijsf:imageHyperlink 
                                                        actionExpression="#{VisitaCenso1.hipervinculoDetallarFila1_action}"
                                                        binding="#{VisitaCenso1.hipervinculoDetallarFila1}" 
                                                        id="hipervinculoDetallarFila1"
                                                        imageURL="#{VisitaCenso1.gestor.urlImagenFilaProcesada}"
                                                        textPosition="left" 
                                                        text="#{VisitaCenso1.gestor.identificacionFila}" 
                                                        toolTip="#{VisitaCenso1.gestor.toolTipImagenFilaProcesada}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{VisitaCenso1.tableColumnIdVisitaCenso1}"
                                                    headerText="identificaci&#243;n"
                                                    id="tableColumnIdVisitaCenso1" rendered="false"
                                                    sort="id_visita_censo">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdVisitaCenso1"
                                                    text="#{currentRow.value['id_visita_censo']}"
                                                    rendered="#{VisitaCenso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{VisitaCenso1.labelIdVisitaCenso1}"
                                                    id="labelIdVisitaCenso1"
                                                    for="campoIdVisitaCenso1"/>
                                                <webuijsf:textField id="campoIdVisitaCenso1"
                                                    binding="#{VisitaCenso1.campoIdVisitaCenso1}"
                                                    converter="#{VisitaCenso1.converterIdVisitaCenso1}"
                                                    readOnly="#{VisitaCenso1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['id_visita_censo']}"
                                                    toolTip="BundleParametros.id_visita_censo.visita_censo"
                                                    validatorExpression="#{VisitaCenso1.validatorIdVisitaCenso1.validate}"/>
                                                <webuijsf:staticText id="campoIdVisitaCenso1Texto1"
                                                    binding="#{VisitaCenso1.campoIdVisitaCenso1Texto1}"
                                                    text="#{currentRow.value['id_visita_censo']}"/>
                                                <webuijsf:message id="messageIdVisitaCenso1"
                                                    for="campoIdVisitaCenso1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{VisitaCenso1.tableColumnIdPotencialBen1}"
                                                    headerText="potencial beneficiario"
                                                    id="tableColumnIdPotencialBen1"
                                                    sort="codigo_potencial_ben_1x1y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdPotencialBen1"
                                                    text="#{currentRow.value['codigo_potencial_ben_1x1y3']}"
                                                    rendered="#{VisitaCenso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{VisitaCenso1.labelIdPotencialBen1}"
                                                    id="labelIdPotencialBen1"
                                                    for="campoIdPotencialBen1"/>
                                                <webuijsf:textField id="campoIdPotencialBen1"
                                                    binding="#{VisitaCenso1.campoIdPotencialBen1}"
                                                    readOnly="#{VisitaCenso1.gestor.filaNoProcesada}" required="true"
                                                    text="#{VisitaCenso1.asistente.textoCampoIdPotencialBen1}"
                                                    toolTip="#{VisitaCenso1.asistente.toolTipCampoIdPotencialBen1}"
                                                    validatorExpression="#{VisitaCenso1.campoIdPotencialBen1_validate}"/>
                                                <webuijsf:staticText id="campoIdPotencialBen1Texto1"
                                                    binding="#{VisitaCenso1.campoIdPotencialBen1Texto1}"
                                                    text="#{currentRow.value['codigo_potencial_ben_1x1y3']}"/>
                                                <webuijsf:message id="messageIdPotencialBen1"
                                                    for="campoIdPotencialBen1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdPotencialBen3"
                                                    rendered="#{VisitaCenso1.asistente.tableColumnIdPotencialBen3Rendered}"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdPotencialBen3"
                                                    text="#{currentRow.value['id_potencial_ben']}"
                                                    rendered="#{VisitaCenso1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{VisitaCenso1.campoIdPotencialBen1Boton1}"
                                                    id="campoIdPotencialBen1Boton1"
                                                    onClick="#{VisitaCenso1.asistente.scriptCampoIdPotencialBen1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{VisitaCenso1.campoIdPotencialBen1Boton3}"
                                                    id="campoIdPotencialBen1Boton3"
                                                    onClick="#{VisitaCenso1.asistente.scriptCampoIdPotencialBen1Boton2}"
                                                    rendered="#{VisitaCenso1.asistente.campoIdPotencialBen1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{VisitaCenso1.tableColumnIdPotencialBen2}"
                                                    headerText="nombre potencial beneficiario"
                                                    id="tableColumnIdPotencialBen2"
                                                    rendered="#{VisitaCenso1.asistente.campoIdPotencialBen1Boton2Rendered}"
                                                    sort="nombre_potencial_ben_1x1y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdPotencialBen2"
                                                    text="#{currentRow.value['nombre_potencial_ben_1x1y4']}"
                                                    rendered="#{VisitaCenso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{VisitaCenso1.labelIdPotencialBen2}"
                                                    id="labelIdPotencialBen2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{VisitaCenso1.campoIdPotencialBen1Hiper1}"
                                                    id="campoIdPotencialBen1Hiper1"
                                                    text="#{currentRow.value['nombre_potencial_ben_1x1y4']}"
                                                    onClick="#{VisitaCenso1.asistente.scriptCampoIdPotencialBen1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdPotencialBen1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{VisitaCenso1.tableColumnIdFuncionarioCensista1}"
                                                    headerText="funcionario censista"
                                                    id="tableColumnIdFuncionarioCensista1"
                                                    sort="codigo_funcionario_1x2y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdFuncionarioCensista1"
                                                    text="#{currentRow.value['codigo_funcionario_1x2y3']}"
                                                    rendered="#{VisitaCenso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{VisitaCenso1.labelIdFuncionarioCensista1}"
                                                    id="labelIdFuncionarioCensista1"
                                                    for="campoIdFuncionarioCensista1"/>
                                                <webuijsf:textField id="campoIdFuncionarioCensista1"
                                                    binding="#{VisitaCenso1.campoIdFuncionarioCensista1}"
                                                    readOnly="#{VisitaCenso1.gestor.filaNoProcesada}" required="true"
                                                    text="#{VisitaCenso1.asistente.textoCampoIdFuncionarioCensista1}"
                                                    toolTip="#{VisitaCenso1.asistente.toolTipCampoIdFuncionarioCensista1}"
                                                    validatorExpression="#{VisitaCenso1.campoIdFuncionarioCensista1_validate}"/>
                                                <webuijsf:staticText id="campoIdFuncionarioCensista1Texto1"
                                                    binding="#{VisitaCenso1.campoIdFuncionarioCensista1Texto1}"
                                                    text="#{currentRow.value['codigo_funcionario_1x2y3']}"/>
                                                <webuijsf:message id="messageIdFuncionarioCensista1"
                                                    for="campoIdFuncionarioCensista1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdFuncionarioCensista3"
                                                    rendered="#{VisitaCenso1.asistente.tableColumnIdFuncionarioCensista3Rendered}"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdFuncionarioCensista3"
                                                    text="#{currentRow.value['id_funcionario_censista']}"
                                                    rendered="#{VisitaCenso1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{VisitaCenso1.campoIdFuncionarioCensista1Boton1}"
                                                    id="campoIdFuncionarioCensista1Boton1"
                                                    onClick="#{VisitaCenso1.asistente.scriptCampoIdFuncionarioCensista1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{VisitaCenso1.campoIdFuncionarioCensista1Boton3}"
                                                    id="campoIdFuncionarioCensista1Boton3"
                                                    onClick="#{VisitaCenso1.asistente.scriptCampoIdFuncionarioCensista1Boton2}"
                                                    rendered="#{VisitaCenso1.asistente.campoIdFuncionarioCensista1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{VisitaCenso1.tableColumnIdFuncionarioCensista2}"
                                                    headerText="nombre funcionario censista"
                                                    id="tableColumnIdFuncionarioCensista2"
                                                    rendered="#{VisitaCenso1.asistente.campoIdFuncionarioCensista1Boton2Rendered}"
                                                    sort="nombre_funcionario_1x2y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdFuncionarioCensista2"
                                                    text="#{currentRow.value['nombre_funcionario_1x2y4']}"
                                                    rendered="#{VisitaCenso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{VisitaCenso1.labelIdFuncionarioCensista2}"
                                                    id="labelIdFuncionarioCensista2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{VisitaCenso1.campoIdFuncionarioCensista1Hiper1}"
                                                    id="campoIdFuncionarioCensista1Hiper1"
                                                    text="#{currentRow.value['nombre_funcionario_1x2y4']}"
                                                    onClick="#{VisitaCenso1.asistente.scriptCampoIdFuncionarioCensista1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdFuncionarioCensista1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{VisitaCenso1.tableColumnFechaVisita1}"
                                                    headerText="fecha visita"
                                                    id="tableColumnFechaVisita1"
                                                    sort="fecha_visita">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextFechaVisita1"
                                                    text="#{currentRow.value['fecha_visita']}"
                                                    rendered="#{VisitaCenso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{VisitaCenso1.labelFechaVisita1}"
                                                    id="labelFechaVisita1"
                                                    for="campoFechaVisita1"/>
                                                <webuijsf:textField id="campoFechaVisita1"
                                                    binding="#{VisitaCenso1.campoFechaVisita1}"
                                                    converter="#{VisitaCenso1.converterFechaVisita1}"
                                                    readOnly="#{VisitaCenso1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['fecha_visita']}"
                                                    toolTip="BundleParametros.fecha_visita.visita_censo"/>
                                                <webuijsf:staticText id="campoFechaVisita1Texto1"
                                                    binding="#{VisitaCenso1.campoFechaVisita1Texto1}"
                                                    converter="#{VisitaCenso1.converterFechaVisita1}"
                                                    text="#{currentRow.value['fecha_visita']}"/>
                                                <webuijsf:message id="messageFechaVisita1"
                                                    for="campoFechaVisita1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{VisitaCenso1.tableColumnObservaciones1}"
                                                    headerText="observaciones"
                                                    id="tableColumnObservaciones1" rendered="false"
                                                    sort="observaciones">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextObservaciones1"
                                                    text="#{currentRow.value['observaciones']}"
                                                    rendered="#{VisitaCenso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{VisitaCenso1.labelObservaciones1}"
                                                    id="labelObservaciones1"
                                                    for="campoObservaciones1"/>
                                                <webuijsf:textArea id="campoObservaciones1"
                                                    binding="#{VisitaCenso1.campoObservaciones1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{VisitaCenso1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['observaciones']}"
                                                    toolTip="BundleParametros.observaciones.visita_censo"
                                                    validatorExpression="#{VisitaCenso1.validatorObservaciones1.validate}"/>
                                                <webuijsf:staticText id="campoObservaciones1Texto1"
                                                    binding="#{VisitaCenso1.campoObservaciones1Texto1}"
                                                    text="#{currentRow.value['observaciones']}"/>
                                                <webuijsf:message id="messageObservaciones1"
                                                    for="campoObservaciones1"/>
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
                                                        binding="#{VisitaCenso1.etiquetaTextoFilasPorPagina1}" 
                                                        for="textoFilasPorPagina1"
                                                        id="etiquetaTextoFilasPorPagina1" 
                                                        text="#{VisitaCenso1.gestor.i18n.textoEtiquetaTextoFilasPorPagina}"/>
                                                </h:panelGrid>
                                                <h:panelGrid 
                                                    columns="3" 
                                                    id="gridPanel107">
                                                    <webuijsf:textField 
                                                        binding="#{VisitaCenso1.textoFilasPorPagina1}" 
                                                        columns="2"
                                                        converter="#{VisitaCenso1.textoFilasPorPagina1Converter1}"
                                                        disabled="#{VisitaCenso1.gestor.paginacionInhabilitada}" 
                                                        id="textoFilasPorPagina1" maxLength="2"
                                                        text="#{VisitaCenso1.gestor.filasPorPagina}" 
                                                        validatorExpression="#{VisitaCenso1.textoFilasPorPagina1Validator1.validate}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{VisitaCenso1.botonRepaginar1_action}"
                                                        binding="#{VisitaCenso1.botonRepaginar1}" 
                                                        id="botonRepaginar1"
                                                        imageURL="#{VisitaCenso1.gestor.urlImagenRepaginar}" 
                                                        onClick="#{VisitaCenso1.gestor.scriptRepaginar}"
                                                        text="#{VisitaCenso1.gestor.i18n.textoBotonRepaginar}"
                                                        toolTip="#{VisitaCenso1.gestor.i18n.toolTipBotonRepaginar}"/>
                                                    <webuijsf:message 
                                                        for="textoFilasPorPagina1" 
                                                        id="messageFilasPorPagina1"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="13"
                                                id="gridPanel108">
                                                <webuijsf:button
                                                    actionExpression="#{VisitaCenso1.botonAgregar1_action}"
                                                    binding="#{VisitaCenso1.botonAgregar1}"
                                                    disabled="#{VisitaCenso1.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{VisitaCenso1.gestor.scriptAgregar}"
                                                    rendered="#{VisitaCenso1.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{VisitaCenso1.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{VisitaCenso1.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{VisitaCenso1.listaFuncionEdicion1}"
                                                    converter="#{VisitaCenso1.converterListaFuncionEdicion1}"
                                                    disabled="#{VisitaCenso1.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{VisitaCenso1.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{VisitaCenso1.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{VisitaCenso1.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{VisitaCenso1.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{VisitaCenso1.botonEditar1_action}"
                                                    binding="#{VisitaCenso1.botonEditar1}"
                                                    disabled="#{VisitaCenso1.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{VisitaCenso1.gestor.scriptEditar}"
                                                    rendered="#{VisitaCenso1.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{VisitaCenso1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{VisitaCenso1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{VisitaCenso1.botonEliminar1_action}"
                                                    binding="#{VisitaCenso1.botonEliminar1}"
                                                    disabled="#{VisitaCenso1.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{VisitaCenso1.gestor.scriptEliminar}"
                                                    rendered="#{VisitaCenso1.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{VisitaCenso1.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{VisitaCenso1.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{VisitaCenso1.botonAplicar1_action}"
                                                    binding="#{VisitaCenso1.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{VisitaCenso1.gestor.scriptAplicar}"
                                                    rendered="#{VisitaCenso1.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{VisitaCenso1.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{VisitaCenso1.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{VisitaCenso1.botonDeshacer1_action}"
                                                    binding="#{VisitaCenso1.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{VisitaCenso1.gestor.scriptDeshacer}"
                                                    rendered="#{VisitaCenso1.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{VisitaCenso1.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{VisitaCenso1.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{VisitaCenso1.botonConfirmar1_action}"
                                                    binding="#{VisitaCenso1.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{VisitaCenso1.gestor.scriptConfirmar}"
                                                    rendered="#{VisitaCenso1.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{VisitaCenso1.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{VisitaCenso1.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{VisitaCenso1.botonDescartar1_action}"
                                                    binding="#{VisitaCenso1.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{VisitaCenso1.gestor.scriptDescartar}"
                                                    rendered="#{VisitaCenso1.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{VisitaCenso1.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{VisitaCenso1.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{VisitaCenso1.listaFuncionAccion1}"
                                                    converter="#{VisitaCenso1.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{VisitaCenso1.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{VisitaCenso1.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{VisitaCenso1.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{VisitaCenso1.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{VisitaCenso1.botonProcesar1_action}"
                                                    binding="#{VisitaCenso1.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{VisitaCenso1.gestor.scriptProcesar}"
                                                    rendered="#{VisitaCenso1.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{VisitaCenso1.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{VisitaCenso1.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{VisitaCenso1.botonRefrescar1_action}"
                                                    binding="#{VisitaCenso1.botonRefrescar1}"
                                                    disabled="#{VisitaCenso1.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{VisitaCenso1.gestor.scriptRefrescar}"
                                                    rendered="#{VisitaCenso1.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{VisitaCenso1.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{VisitaCenso1.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{VisitaCenso1.botonReconsultar1_action}"
                                                    binding="#{VisitaCenso1.botonReconsultar1}"
                                                    disabled="#{VisitaCenso1.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{VisitaCenso1.gestor.scriptReconsultar}"
                                                    rendered="#{VisitaCenso1.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{VisitaCenso1.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{VisitaCenso1.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{VisitaCenso1.botonRetornar1_action}"
                                                    binding="#{VisitaCenso1.botonRetornar1}"
                                                    disabled="#{VisitaCenso1.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{VisitaCenso1.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{VisitaCenso1.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{VisitaCenso1.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{VisitaCenso1.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel109"
                                                rendered="#{VisitaCenso1.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{VisitaCenso1.imageHyperlink1_action}"
                                                    binding="#{VisitaCenso1.imageHyperlink1}"
                                                    disabled="#{VisitaCenso1.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{VisitaCenso1.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{VisitaCenso1.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{VisitaCenso1.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.VisitaCenso1_imageHyperlink1_toolTip}"/>
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
