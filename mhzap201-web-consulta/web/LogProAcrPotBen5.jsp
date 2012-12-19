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
                    focus="#{LogProAcrPotBen5.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{LogProAcrPotBen5.gestor.preserveFocus}"
                    preserveScroll="#{LogProAcrPotBen5.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{LogProAcrPotBen5.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | checkbox1 campoIdLogProAcrPotBen1 campoIdPotencialBen1 campoNombrePotencialBen1 campoCodigoPotencialBen1 campoFechaRegistroPotBen1 campoIdPersona1 campoNombrePersona1 campoCodigoPersona1 campoIdDepartamento1 campoIdDistrito1 campoIdBarrio1 campoIdFichaPersona1 campoCodigoFichaPersona1 campoNombreFichaPersona1 campoIdFichaHogar1 campoCodigoFichaHogar1 campoIndiceCalidadVida1 listaEsProcesado1 campoObservacion1 campoFechaHoraTransaccion1 textoFilasPorPagina1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | textoFilasPorPagina1 | botonRepaginar1 , virtualForm3 | checkbox1 listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonEscogerFila1 botonDetallarFila1 botonProcesarFila1 botonRetornarFila1 botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{LogProAcrPotBen5.breadcrumbs1}" 
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
                                                    rendered="#{LogProAcrPotBen5.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{LogProAcrPotBen5.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{LogProAcrPotBen5.gestor.mensajeDisponible}"
                                                    text="#{LogProAcrPotBen5.gestor.mensaje}"
                                                    url="#{LogProAcrPotBen5.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:table
                                            binding="#{LogProAcrPotBen5.table1}"
                                            clearSortButton="true" 
                                            deselectMultipleButton="true" 
                                            id="table1"
                                            paginateButton="false"
                                            paginationControls="true" 
                                            selectMultipleButton="true" 
                                            sortPanelToggleButton="true"
                                            width="960">
                                            <webuijsf:tableRowGroup 
                                                binding="#{LogProAcrPotBen5.tableRowGroup1}" 
                                                id="tableRowGroup1" 
                                                rows="1"
                                                selected="#{LogProAcrPotBen5.gestor.filaEscogida}" 
                                                sourceData="#{LogProAcrPotBen5.logProAcrPotBenDataProvider}" 
                                                sourceVar="currentRow">
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    id="tableRowGroup1SelectionColumn"
                                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);" 
                                                    selectId="checkbox1">
                                                    <webuijsf:checkbox 
                                                        binding="#{LogProAcrPotBen5.checkbox1}" 
                                                        id="checkbox1"
                                                        onClick="#{LogProAcrPotBen5.gestor.scriptElegir}" 
                                                        selected="#{LogProAcrPotBen5.gestor.filaElegida}" 
                                                        toolTip="#{LogProAcrPotBen5.gestor.i18n.toolTipCheckboxSeleccionMultiple}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    binding="#{LogProAcrPotBen5.tableColumn1}" 
                                                    id="tableColumn1">
                                                    <webuijsf:button 
                                                        actionExpression="#{LogProAcrPotBen5.botonEscogerFila1_action}"
                                                        binding="#{LogProAcrPotBen5.botonEscogerFila1}"
                                                        disabled="#{LogProAcrPotBen5.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonEscogerFila1"
                                                        imageURL="#{LogProAcrPotBen5.gestor.urlImagenEscoger}" 
                                                        onClick="#{LogProAcrPotBen5.gestor.scriptEscoger}"
                                                        text="#{LogProAcrPotBen5.gestor.i18n.textoBotonEscogerFila}"
                                                        toolTip="#{LogProAcrPotBen5.gestor.i18n.toolTipBotonEscogerFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{LogProAcrPotBen5.botonDetallarFila1_action}"
                                                        binding="#{LogProAcrPotBen5.botonDetallarFila1}"
                                                        disabled="#{LogProAcrPotBen5.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonDetallarFila1"
                                                        imageURL="#{LogProAcrPotBen5.gestor.urlImagenDetallar}" 
                                                        onClick="#{LogProAcrPotBen5.scriptAbrirVentanaVerDetalle}"
                                                        rendered="#{LogProAcrPotBen5.gestor.detalleDisponible}" 
                                                        text="#{LogProAcrPotBen5.gestor.i18n.textoBotonDetallarFila}"
                                                        toolTip="#{LogProAcrPotBen5.gestor.i18n.toolTipBotonDetallarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{LogProAcrPotBen5.botonProcesarFila1_action}"
                                                        binding="#{LogProAcrPotBen5.botonProcesarFila1}"
                                                        disabled="#{LogProAcrPotBen5.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonProcesarFila1"
                                                        imageURL="#{LogProAcrPotBen5.gestor.urlImagenProcesar}" 
                                                        onClick="#{LogProAcrPotBen5.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{LogProAcrPotBen5.asistente.comandoDisponible}" 
                                                        text="#{LogProAcrPotBen5.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{LogProAcrPotBen5.gestor.i18n.toolTipBotonProcesarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{LogProAcrPotBen5.botonRetornarFila1_action}"
                                                        binding="#{LogProAcrPotBen5.botonRetornarFila1}" 
                                                        disabled="#{LogProAcrPotBen5.gestor.funcionReturnInhabilitada}"
                                                        id="botonRetornarFila1"
                                                        imageURL="#{LogProAcrPotBen5.gestor.urlImagenRetornar}"
                                                        onClick="#{LogProAcrPotBen5.gestor.scriptRetornarRecursoActual}"
                                                        rendered="#{LogProAcrPotBen5.gestor.funcionReturnVisible}" 
                                                        text="#{LogProAcrPotBen5.gestor.i18n.textoBotonRetornarFila}"
                                                        toolTip="#{LogProAcrPotBen5.gestor.i18n.toolTipBotonRetornarFila}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogProAcrPotBen5.tableColumn2}"
                                                    id="tableColumn2"
                                                    rendered="#{LogProAcrPotBen5.gestor.designing}">
                                                    <webuijsf:imageHyperlink
                                                        actionExpression="#{LogProAcrPotBen5.hipervinculoAccionFila1_action}"
                                                        binding="#{LogProAcrPotBen5.hipervinculoAccionFila1}"
                                                        disabled="#{LogProAcrPotBen5.gestor.loteConCambios}"
                                                        id="hipervinculoAccionFila1"
                                                        imageURL="#{LogProAcrPotBen5.gestor.urlImagenEjecutarVinculo}"
                                                        onClick="#{LogProAcrPotBen5.scriptAbrirVentanaAccionFila1}"
                                                        text="Accion1"
                                                        toolTip="#{bundle.LogProAcrPotBen5_hipervinculoAccionFila1_toolTip}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="right" 
                                                    binding="#{LogProAcrPotBen5.tableColumn3}" 
                                                    headerText="#{LogProAcrPotBen5.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{LogProAcrPotBen5.gestor.i18n.toolTipEtiquetaIdentificacionFila}"
                                                    id="tableColumn3">
                                                    <webuijsf:imageHyperlink 
                                                        actionExpression="#{LogProAcrPotBen5.hipervinculoDetallarFila1_action}"
                                                        binding="#{LogProAcrPotBen5.hipervinculoDetallarFila1}" 
                                                        id="hipervinculoDetallarFila1"
                                                        imageURL="#{LogProAcrPotBen5.gestor.urlImagenFilaProcesada}"
                                                        textPosition="left" 
                                                        text="#{LogProAcrPotBen5.gestor.identificacionFila}" 
                                                        toolTip="#{LogProAcrPotBen5.gestor.toolTipImagenFilaProcesada}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogProAcrPotBen5.tableColumnIdLogProAcrPotBen1}"
                                                    headerText="identificaci&#243;n"
                                                    id="tableColumnIdLogProAcrPotBen1" rendered="false"
                                                    sort="id_log_pro_acr_pot_ben">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdLogProAcrPotBen1"
                                                    text="#{currentRow.value['id_log_pro_acr_pot_ben']}"
                                                    rendered="#{LogProAcrPotBen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogProAcrPotBen5.labelIdLogProAcrPotBen1}"
                                                    id="labelIdLogProAcrPotBen1"
                                                    for="campoIdLogProAcrPotBen1"/>
                                                <webuijsf:textField id="campoIdLogProAcrPotBen1"
                                                    binding="#{LogProAcrPotBen5.campoIdLogProAcrPotBen1}"
                                                    converter="#{LogProAcrPotBen5.converterIdLogProAcrPotBen1}"
                                                    readOnly="#{LogProAcrPotBen5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['id_log_pro_acr_pot_ben']}"
                                                    toolTip="BundleParametros.id_log_pro_acr_pot_ben.log_pro_acr_pot_ben"
                                                    validatorExpression="#{LogProAcrPotBen5.validatorIdLogProAcrPotBen1.validate}"/>
                                                <webuijsf:staticText id="campoIdLogProAcrPotBen1Texto1"
                                                    binding="#{LogProAcrPotBen5.campoIdLogProAcrPotBen1Texto1}"
                                                    text="#{currentRow.value['id_log_pro_acr_pot_ben']}"/>
                                                <webuijsf:message id="messageIdLogProAcrPotBen1"
                                                    for="campoIdLogProAcrPotBen1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogProAcrPotBen5.tableColumnIdPotencialBen1}"
                                                    headerText="potencial beneficiario"
                                                    id="tableColumnIdPotencialBen1"
                                                    sort="codigo_potencial_ben_1x1y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdPotencialBen1"
                                                    text="#{currentRow.value['codigo_potencial_ben_1x1y3']}"
                                                    rendered="#{LogProAcrPotBen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogProAcrPotBen5.labelIdPotencialBen1}"
                                                    id="labelIdPotencialBen1"
                                                    for="campoIdPotencialBen1"/>
                                                <webuijsf:textField id="campoIdPotencialBen1"
                                                    binding="#{LogProAcrPotBen5.campoIdPotencialBen1}"
                                                    readOnly="#{LogProAcrPotBen5.gestor.filaNoProcesada}"
                                                    text="#{LogProAcrPotBen5.asistente.textoCampoIdPotencialBen1}"
                                                    toolTip="#{LogProAcrPotBen5.asistente.toolTipCampoIdPotencialBen1}"
                                                    validatorExpression="#{LogProAcrPotBen5.campoIdPotencialBen1_validate}"/>
                                                <webuijsf:staticText id="campoIdPotencialBen1Texto1"
                                                    binding="#{LogProAcrPotBen5.campoIdPotencialBen1Texto1}"
                                                    text="#{currentRow.value['codigo_potencial_ben_1x1y3']}"/>
                                                <webuijsf:message id="messageIdPotencialBen1"
                                                    for="campoIdPotencialBen1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdPotencialBen3"
                                                    rendered="#{LogProAcrPotBen5.asistente.tableColumnIdPotencialBen3Rendered}"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdPotencialBen3"
                                                    text="#{currentRow.value['id_potencial_ben']}"
                                                    rendered="#{LogProAcrPotBen5.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{LogProAcrPotBen5.campoIdPotencialBen1Boton1}"
                                                    id="campoIdPotencialBen1Boton1"
                                                    onClick="#{LogProAcrPotBen5.asistente.scriptCampoIdPotencialBen1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{LogProAcrPotBen5.campoIdPotencialBen1Boton3}"
                                                    id="campoIdPotencialBen1Boton3"
                                                    onClick="#{LogProAcrPotBen5.asistente.scriptCampoIdPotencialBen1Boton2}"
                                                    rendered="#{LogProAcrPotBen5.asistente.campoIdPotencialBen1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{LogProAcrPotBen5.tableColumnIdPotencialBen2}"
                                                    headerText="nombre potencial beneficiario"
                                                    id="tableColumnIdPotencialBen2"
                                                    rendered="#{LogProAcrPotBen5.asistente.campoIdPotencialBen1Boton2Rendered}"
                                                    sort="nombre_potencial_ben_1x1y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdPotencialBen2"
                                                    text="#{currentRow.value['nombre_potencial_ben_1x1y4']}"
                                                    rendered="#{LogProAcrPotBen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogProAcrPotBen5.labelIdPotencialBen2}"
                                                    id="labelIdPotencialBen2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{LogProAcrPotBen5.campoIdPotencialBen1Hiper1}"
                                                    id="campoIdPotencialBen1Hiper1"
                                                    text="#{currentRow.value['nombre_potencial_ben_1x1y4']}"
                                                    onClick="#{LogProAcrPotBen5.asistente.scriptCampoIdPotencialBen1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdPotencialBen1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogProAcrPotBen5.tableColumnNombrePotencialBen1}"
                                                    headerText="nombre potencial beneficiario"
                                                    id="tableColumnNombrePotencialBen1" rendered="false"
                                                    sort="nombre_potencial_ben">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNombrePotencialBen1"
                                                    text="#{currentRow.value['nombre_potencial_ben']}"
                                                    rendered="#{LogProAcrPotBen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogProAcrPotBen5.labelNombrePotencialBen1}"
                                                    id="labelNombrePotencialBen1"
                                                    for="campoNombrePotencialBen1"/>
                                                <webuijsf:textField id="campoNombrePotencialBen1"
                                                    binding="#{LogProAcrPotBen5.campoNombrePotencialBen1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{LogProAcrPotBen5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['nombre_potencial_ben']}"
                                                    toolTip="BundleParametros.nombre_potencial_ben.log_pro_acr_pot_ben"
                                                    validatorExpression="#{LogProAcrPotBen5.validatorNombrePotencialBen1.validate}"/>
                                                <webuijsf:staticText id="campoNombrePotencialBen1Texto1"
                                                    binding="#{LogProAcrPotBen5.campoNombrePotencialBen1Texto1}"
                                                    text="#{currentRow.value['nombre_potencial_ben']}"/>
                                                <webuijsf:message id="messageNombrePotencialBen1"
                                                    for="campoNombrePotencialBen1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogProAcrPotBen5.tableColumnCodigoPotencialBen1}"
                                                    headerText="c&#243;digo potencial beneficiario"
                                                    id="tableColumnCodigoPotencialBen1" rendered="false"
                                                    sort="codigo_potencial_ben">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextCodigoPotencialBen1"
                                                    text="#{currentRow.value['codigo_potencial_ben']}"
                                                    rendered="#{LogProAcrPotBen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogProAcrPotBen5.labelCodigoPotencialBen1}"
                                                    id="labelCodigoPotencialBen1"
                                                    for="campoCodigoPotencialBen1"/>
                                                <webuijsf:textField id="campoCodigoPotencialBen1"
                                                    binding="#{LogProAcrPotBen5.campoCodigoPotencialBen1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{LogProAcrPotBen5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['codigo_potencial_ben']}"
                                                    toolTip="BundleParametros.codigo_potencial_ben.log_pro_acr_pot_ben"
                                                    validatorExpression="#{LogProAcrPotBen5.validatorCodigoPotencialBen1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoPotencialBen1Texto1"
                                                    binding="#{LogProAcrPotBen5.campoCodigoPotencialBen1Texto1}"
                                                    text="#{currentRow.value['codigo_potencial_ben']}"/>
                                                <webuijsf:message id="messageCodigoPotencialBen1"
                                                    for="campoCodigoPotencialBen1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogProAcrPotBen5.tableColumnFechaRegistroPotBen1}"
                                                    headerText="fecha registro potencial beneficiario"
                                                    id="tableColumnFechaRegistroPotBen1" rendered="false"
                                                    sort="fecha_registro_pot_ben">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextFechaRegistroPotBen1"
                                                    text="#{currentRow.value['fecha_registro_pot_ben']}"
                                                    rendered="#{LogProAcrPotBen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogProAcrPotBen5.labelFechaRegistroPotBen1}"
                                                    id="labelFechaRegistroPotBen1"
                                                    for="campoFechaRegistroPotBen1"/>
                                                <webuijsf:textField id="campoFechaRegistroPotBen1"
                                                    binding="#{LogProAcrPotBen5.campoFechaRegistroPotBen1}"
                                                    converter="#{LogProAcrPotBen5.converterFechaRegistroPotBen1}"
                                                    readOnly="#{LogProAcrPotBen5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['fecha_registro_pot_ben']}"
                                                    toolTip="BundleParametros.fecha_registro_pot_ben.log_pro_acr_pot_ben"/>
                                                <webuijsf:staticText id="campoFechaRegistroPotBen1Texto1"
                                                    binding="#{LogProAcrPotBen5.campoFechaRegistroPotBen1Texto1}"
                                                    converter="#{LogProAcrPotBen5.converterFechaRegistroPotBen1}"
                                                    text="#{currentRow.value['fecha_registro_pot_ben']}"/>
                                                <webuijsf:message id="messageFechaRegistroPotBen1"
                                                    for="campoFechaRegistroPotBen1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogProAcrPotBen5.tableColumnIdPersona1}"
                                                    headerText="persona"
                                                    id="tableColumnIdPersona1" rendered="false"
                                                    sort="codigo_persona_1x2y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdPersona1"
                                                    text="#{currentRow.value['codigo_persona_1x2y3']}"
                                                    rendered="#{LogProAcrPotBen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogProAcrPotBen5.labelIdPersona1}"
                                                    id="labelIdPersona1"
                                                    for="campoIdPersona1"/>
                                                <webuijsf:textField id="campoIdPersona1"
                                                    binding="#{LogProAcrPotBen5.campoIdPersona1}"
                                                    readOnly="#{LogProAcrPotBen5.gestor.filaNoProcesada}"
                                                    text="#{LogProAcrPotBen5.asistente.textoCampoIdPersona1}"
                                                    toolTip="#{LogProAcrPotBen5.asistente.toolTipCampoIdPersona1}"
                                                    validatorExpression="#{LogProAcrPotBen5.campoIdPersona1_validate}"/>
                                                <webuijsf:staticText id="campoIdPersona1Texto1"
                                                    binding="#{LogProAcrPotBen5.campoIdPersona1Texto1}"
                                                    text="#{currentRow.value['codigo_persona_1x2y3']}"/>
                                                <webuijsf:message id="messageIdPersona1"
                                                    for="campoIdPersona1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdPersona3" rendered="false"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdPersona3"
                                                    text="#{currentRow.value['id_persona']}"
                                                    rendered="#{LogProAcrPotBen5.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{LogProAcrPotBen5.campoIdPersona1Boton1}"
                                                    id="campoIdPersona1Boton1"
                                                    onClick="#{LogProAcrPotBen5.asistente.scriptCampoIdPersona1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{LogProAcrPotBen5.campoIdPersona1Boton3}"
                                                    id="campoIdPersona1Boton3"
                                                    onClick="#{LogProAcrPotBen5.asistente.scriptCampoIdPersona1Boton2}"
                                                    rendered="#{LogProAcrPotBen5.asistente.campoIdPersona1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{LogProAcrPotBen5.tableColumnIdPersona2}"
                                                    headerText="nombre persona"
                                                    id="tableColumnIdPersona2" rendered="false"
                                                    sort="nombre_persona_1x2y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdPersona2"
                                                    text="#{currentRow.value['nombre_persona_1x2y4']}"
                                                    rendered="#{LogProAcrPotBen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogProAcrPotBen5.labelIdPersona2}"
                                                    id="labelIdPersona2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{LogProAcrPotBen5.campoIdPersona1Hiper1}"
                                                    id="campoIdPersona1Hiper1"
                                                    text="#{currentRow.value['nombre_persona_1x2y4']}"
                                                    onClick="#{LogProAcrPotBen5.asistente.scriptCampoIdPersona1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdPersona1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogProAcrPotBen5.tableColumnNombrePersona1}"
                                                    headerText="nombre persona"
                                                    id="tableColumnNombrePersona1" rendered="false"
                                                    sort="nombre_persona">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNombrePersona1"
                                                    text="#{currentRow.value['nombre_persona']}"
                                                    rendered="#{LogProAcrPotBen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogProAcrPotBen5.labelNombrePersona1}"
                                                    id="labelNombrePersona1"
                                                    for="campoNombrePersona1"/>
                                                <webuijsf:textField id="campoNombrePersona1"
                                                    binding="#{LogProAcrPotBen5.campoNombrePersona1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{LogProAcrPotBen5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['nombre_persona']}"
                                                    toolTip="BundleParametros.nombre_persona.log_pro_acr_pot_ben"
                                                    validatorExpression="#{LogProAcrPotBen5.validatorNombrePersona1.validate}"/>
                                                <webuijsf:staticText id="campoNombrePersona1Texto1"
                                                    binding="#{LogProAcrPotBen5.campoNombrePersona1Texto1}"
                                                    text="#{currentRow.value['nombre_persona']}"/>
                                                <webuijsf:message id="messageNombrePersona1"
                                                    for="campoNombrePersona1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogProAcrPotBen5.tableColumnCodigoPersona1}"
                                                    headerText="c&#243;digo persona"
                                                    id="tableColumnCodigoPersona1" rendered="false"
                                                    sort="codigo_persona">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextCodigoPersona1"
                                                    text="#{currentRow.value['codigo_persona']}"
                                                    rendered="#{LogProAcrPotBen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogProAcrPotBen5.labelCodigoPersona1}"
                                                    id="labelCodigoPersona1"
                                                    for="campoCodigoPersona1"/>
                                                <webuijsf:textField id="campoCodigoPersona1"
                                                    binding="#{LogProAcrPotBen5.campoCodigoPersona1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{LogProAcrPotBen5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['codigo_persona']}"
                                                    toolTip="BundleParametros.codigo_persona.log_pro_acr_pot_ben"
                                                    validatorExpression="#{LogProAcrPotBen5.validatorCodigoPersona1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoPersona1Texto1"
                                                    binding="#{LogProAcrPotBen5.campoCodigoPersona1Texto1}"
                                                    text="#{currentRow.value['codigo_persona']}"/>
                                                <webuijsf:message id="messageCodigoPersona1"
                                                    for="campoCodigoPersona1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogProAcrPotBen5.tableColumnIdDepartamento1}"
                                                    headerText="departamento"
                                                    id="tableColumnIdDepartamento1" rendered="false"
                                                    sort="codigo_ubicacion_1x3y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdDepartamento1"
                                                    text="#{currentRow.value['codigo_ubicacion_1x3y3']}"
                                                    rendered="#{LogProAcrPotBen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogProAcrPotBen5.labelIdDepartamento1}"
                                                    id="labelIdDepartamento1"
                                                    for="campoIdDepartamento1"/>
                                                <webuijsf:textField id="campoIdDepartamento1"
                                                    binding="#{LogProAcrPotBen5.campoIdDepartamento1}"
                                                    readOnly="#{LogProAcrPotBen5.gestor.filaNoProcesada}"
                                                    text="#{LogProAcrPotBen5.asistente.textoCampoIdDepartamento1}"
                                                    toolTip="#{LogProAcrPotBen5.asistente.toolTipCampoIdDepartamento1}"
                                                    validatorExpression="#{LogProAcrPotBen5.campoIdDepartamento1_validate}"/>
                                                <webuijsf:staticText id="campoIdDepartamento1Texto1"
                                                    binding="#{LogProAcrPotBen5.campoIdDepartamento1Texto1}"
                                                    text="#{currentRow.value['codigo_ubicacion_1x3y3']}"/>
                                                <webuijsf:message id="messageIdDepartamento1"
                                                    for="campoIdDepartamento1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdDepartamento3" rendered="false"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdDepartamento3"
                                                    text="#{currentRow.value['id_departamento']}"
                                                    rendered="#{LogProAcrPotBen5.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{LogProAcrPotBen5.campoIdDepartamento1Boton1}"
                                                    id="campoIdDepartamento1Boton1"
                                                    onClick="#{LogProAcrPotBen5.asistente.scriptCampoIdDepartamento1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{LogProAcrPotBen5.campoIdDepartamento1Boton3}"
                                                    id="campoIdDepartamento1Boton3"
                                                    onClick="#{LogProAcrPotBen5.asistente.scriptCampoIdDepartamento1Boton2}"
                                                    rendered="#{LogProAcrPotBen5.asistente.campoIdDepartamento1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{LogProAcrPotBen5.tableColumnIdDepartamento2}"
                                                    headerText="nombre departamento"
                                                    id="tableColumnIdDepartamento2" rendered="false"
                                                    sort="nombre_ubicacion_1x3y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdDepartamento2"
                                                    text="#{currentRow.value['nombre_ubicacion_1x3y4']}"
                                                    rendered="#{LogProAcrPotBen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogProAcrPotBen5.labelIdDepartamento2}"
                                                    id="labelIdDepartamento2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{LogProAcrPotBen5.campoIdDepartamento1Hiper1}"
                                                    id="campoIdDepartamento1Hiper1"
                                                    text="#{currentRow.value['nombre_ubicacion_1x3y4']}"
                                                    onClick="#{LogProAcrPotBen5.asistente.scriptCampoIdDepartamento1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdDepartamento1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogProAcrPotBen5.tableColumnIdDistrito1}"
                                                    headerText="distrito"
                                                    id="tableColumnIdDistrito1" rendered="false"
                                                    sort="codigo_ubicacion_1x4y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdDistrito1"
                                                    text="#{currentRow.value['codigo_ubicacion_1x4y3']}"
                                                    rendered="#{LogProAcrPotBen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogProAcrPotBen5.labelIdDistrito1}"
                                                    id="labelIdDistrito1"
                                                    for="campoIdDistrito1"/>
                                                <webuijsf:textField id="campoIdDistrito1"
                                                    binding="#{LogProAcrPotBen5.campoIdDistrito1}"
                                                    readOnly="#{LogProAcrPotBen5.gestor.filaNoProcesada}"
                                                    text="#{LogProAcrPotBen5.asistente.textoCampoIdDistrito1}"
                                                    toolTip="#{LogProAcrPotBen5.asistente.toolTipCampoIdDistrito1}"
                                                    validatorExpression="#{LogProAcrPotBen5.campoIdDistrito1_validate}"/>
                                                <webuijsf:staticText id="campoIdDistrito1Texto1"
                                                    binding="#{LogProAcrPotBen5.campoIdDistrito1Texto1}"
                                                    text="#{currentRow.value['codigo_ubicacion_1x4y3']}"/>
                                                <webuijsf:message id="messageIdDistrito1"
                                                    for="campoIdDistrito1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdDistrito3" rendered="false"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdDistrito3"
                                                    text="#{currentRow.value['id_distrito']}"
                                                    rendered="#{LogProAcrPotBen5.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{LogProAcrPotBen5.campoIdDistrito1Boton1}"
                                                    id="campoIdDistrito1Boton1"
                                                    onClick="#{LogProAcrPotBen5.asistente.scriptCampoIdDistrito1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{LogProAcrPotBen5.campoIdDistrito1Boton3}"
                                                    id="campoIdDistrito1Boton3"
                                                    onClick="#{LogProAcrPotBen5.asistente.scriptCampoIdDistrito1Boton2}"
                                                    rendered="#{LogProAcrPotBen5.asistente.campoIdDistrito1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{LogProAcrPotBen5.tableColumnIdDistrito2}"
                                                    headerText="nombre distrito"
                                                    id="tableColumnIdDistrito2" rendered="false"
                                                    sort="nombre_ubicacion_1x4y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdDistrito2"
                                                    text="#{currentRow.value['nombre_ubicacion_1x4y4']}"
                                                    rendered="#{LogProAcrPotBen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogProAcrPotBen5.labelIdDistrito2}"
                                                    id="labelIdDistrito2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{LogProAcrPotBen5.campoIdDistrito1Hiper1}"
                                                    id="campoIdDistrito1Hiper1"
                                                    text="#{currentRow.value['nombre_ubicacion_1x4y4']}"
                                                    onClick="#{LogProAcrPotBen5.asistente.scriptCampoIdDistrito1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdDistrito1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogProAcrPotBen5.tableColumnIdBarrio1}"
                                                    headerText="barrio"
                                                    id="tableColumnIdBarrio1" rendered="false"
                                                    sort="codigo_ubicacion_1x5y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdBarrio1"
                                                    text="#{currentRow.value['codigo_ubicacion_1x5y3']}"
                                                    rendered="#{LogProAcrPotBen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogProAcrPotBen5.labelIdBarrio1}"
                                                    id="labelIdBarrio1"
                                                    for="campoIdBarrio1"/>
                                                <webuijsf:textField id="campoIdBarrio1"
                                                    binding="#{LogProAcrPotBen5.campoIdBarrio1}"
                                                    readOnly="#{LogProAcrPotBen5.gestor.filaNoProcesada}"
                                                    text="#{LogProAcrPotBen5.asistente.textoCampoIdBarrio1}"
                                                    toolTip="#{LogProAcrPotBen5.asistente.toolTipCampoIdBarrio1}"
                                                    validatorExpression="#{LogProAcrPotBen5.campoIdBarrio1_validate}"/>
                                                <webuijsf:staticText id="campoIdBarrio1Texto1"
                                                    binding="#{LogProAcrPotBen5.campoIdBarrio1Texto1}"
                                                    text="#{currentRow.value['codigo_ubicacion_1x5y3']}"/>
                                                <webuijsf:message id="messageIdBarrio1"
                                                    for="campoIdBarrio1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdBarrio3" rendered="false"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdBarrio3"
                                                    text="#{currentRow.value['id_barrio']}"
                                                    rendered="#{LogProAcrPotBen5.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{LogProAcrPotBen5.campoIdBarrio1Boton1}"
                                                    id="campoIdBarrio1Boton1"
                                                    onClick="#{LogProAcrPotBen5.asistente.scriptCampoIdBarrio1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{LogProAcrPotBen5.campoIdBarrio1Boton3}"
                                                    id="campoIdBarrio1Boton3"
                                                    onClick="#{LogProAcrPotBen5.asistente.scriptCampoIdBarrio1Boton2}"
                                                    rendered="#{LogProAcrPotBen5.asistente.campoIdBarrio1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{LogProAcrPotBen5.tableColumnIdBarrio2}"
                                                    headerText="nombre barrio"
                                                    id="tableColumnIdBarrio2" rendered="false"
                                                    sort="nombre_ubicacion_1x5y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdBarrio2"
                                                    text="#{currentRow.value['nombre_ubicacion_1x5y4']}"
                                                    rendered="#{LogProAcrPotBen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogProAcrPotBen5.labelIdBarrio2}"
                                                    id="labelIdBarrio2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{LogProAcrPotBen5.campoIdBarrio1Hiper1}"
                                                    id="campoIdBarrio1Hiper1"
                                                    text="#{currentRow.value['nombre_ubicacion_1x5y4']}"
                                                    onClick="#{LogProAcrPotBen5.asistente.scriptCampoIdBarrio1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdBarrio1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogProAcrPotBen5.tableColumnIdFichaPersona1}"
                                                    headerText="ficha persona"
                                                    id="tableColumnIdFichaPersona1" rendered="false"
                                                    sort="codigo_ficha_persona_1x6y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdFichaPersona1"
                                                    text="#{currentRow.value['codigo_ficha_persona_1x6y3']}"
                                                    rendered="#{LogProAcrPotBen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogProAcrPotBen5.labelIdFichaPersona1}"
                                                    id="labelIdFichaPersona1"
                                                    for="campoIdFichaPersona1"/>
                                                <webuijsf:textField id="campoIdFichaPersona1"
                                                    binding="#{LogProAcrPotBen5.campoIdFichaPersona1}"
                                                    readOnly="#{LogProAcrPotBen5.gestor.filaNoProcesada}"
                                                    text="#{LogProAcrPotBen5.asistente.textoCampoIdFichaPersona1}"
                                                    toolTip="#{LogProAcrPotBen5.asistente.toolTipCampoIdFichaPersona1}"
                                                    validatorExpression="#{LogProAcrPotBen5.campoIdFichaPersona1_validate}"/>
                                                <webuijsf:staticText id="campoIdFichaPersona1Texto1"
                                                    binding="#{LogProAcrPotBen5.campoIdFichaPersona1Texto1}"
                                                    text="#{currentRow.value['codigo_ficha_persona_1x6y3']}"/>
                                                <webuijsf:message id="messageIdFichaPersona1"
                                                    for="campoIdFichaPersona1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdFichaPersona3" rendered="false"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdFichaPersona3"
                                                    text="#{currentRow.value['id_ficha_persona']}"
                                                    rendered="#{LogProAcrPotBen5.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{LogProAcrPotBen5.campoIdFichaPersona1Boton1}"
                                                    id="campoIdFichaPersona1Boton1"
                                                    onClick="#{LogProAcrPotBen5.asistente.scriptCampoIdFichaPersona1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{LogProAcrPotBen5.campoIdFichaPersona1Boton3}"
                                                    id="campoIdFichaPersona1Boton3"
                                                    onClick="#{LogProAcrPotBen5.asistente.scriptCampoIdFichaPersona1Boton2}"
                                                    rendered="#{LogProAcrPotBen5.asistente.campoIdFichaPersona1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{LogProAcrPotBen5.tableColumnIdFichaPersona2}"
                                                    headerText="nombre ficha persona"
                                                    id="tableColumnIdFichaPersona2" rendered="false"
                                                    sort="nombre_ficha_persona_1x6y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdFichaPersona2"
                                                    text="#{currentRow.value['nombre_ficha_persona_1x6y4']}"
                                                    rendered="#{LogProAcrPotBen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogProAcrPotBen5.labelIdFichaPersona2}"
                                                    id="labelIdFichaPersona2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{LogProAcrPotBen5.campoIdFichaPersona1Hiper1}"
                                                    id="campoIdFichaPersona1Hiper1"
                                                    text="#{currentRow.value['nombre_ficha_persona_1x6y4']}"
                                                    onClick="#{LogProAcrPotBen5.asistente.scriptCampoIdFichaPersona1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdFichaPersona1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogProAcrPotBen5.tableColumnCodigoFichaPersona1}"
                                                    headerText="c&#243;digo ficha persona"
                                                    id="tableColumnCodigoFichaPersona1" rendered="false"
                                                    sort="codigo_ficha_persona">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextCodigoFichaPersona1"
                                                    text="#{currentRow.value['codigo_ficha_persona']}"
                                                    rendered="#{LogProAcrPotBen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogProAcrPotBen5.labelCodigoFichaPersona1}"
                                                    id="labelCodigoFichaPersona1"
                                                    for="campoCodigoFichaPersona1"/>
                                                <webuijsf:textField id="campoCodigoFichaPersona1"
                                                    binding="#{LogProAcrPotBen5.campoCodigoFichaPersona1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{LogProAcrPotBen5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['codigo_ficha_persona']}"
                                                    toolTip="BundleParametros.codigo_ficha_persona.log_pro_acr_pot_ben"
                                                    validatorExpression="#{LogProAcrPotBen5.validatorCodigoFichaPersona1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoFichaPersona1Texto1"
                                                    binding="#{LogProAcrPotBen5.campoCodigoFichaPersona1Texto1}"
                                                    text="#{currentRow.value['codigo_ficha_persona']}"/>
                                                <webuijsf:message id="messageCodigoFichaPersona1"
                                                    for="campoCodigoFichaPersona1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogProAcrPotBen5.tableColumnNombreFichaPersona1}"
                                                    headerText="nombre ficha persona"
                                                    id="tableColumnNombreFichaPersona1" rendered="false"
                                                    sort="nombre_ficha_persona">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNombreFichaPersona1"
                                                    text="#{currentRow.value['nombre_ficha_persona']}"
                                                    rendered="#{LogProAcrPotBen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogProAcrPotBen5.labelNombreFichaPersona1}"
                                                    id="labelNombreFichaPersona1"
                                                    for="campoNombreFichaPersona1"/>
                                                <webuijsf:textField id="campoNombreFichaPersona1"
                                                    binding="#{LogProAcrPotBen5.campoNombreFichaPersona1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{LogProAcrPotBen5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['nombre_ficha_persona']}"
                                                    toolTip="BundleParametros.nombre_ficha_persona.log_pro_acr_pot_ben"
                                                    validatorExpression="#{LogProAcrPotBen5.validatorNombreFichaPersona1.validate}"/>
                                                <webuijsf:staticText id="campoNombreFichaPersona1Texto1"
                                                    binding="#{LogProAcrPotBen5.campoNombreFichaPersona1Texto1}"
                                                    text="#{currentRow.value['nombre_ficha_persona']}"/>
                                                <webuijsf:message id="messageNombreFichaPersona1"
                                                    for="campoNombreFichaPersona1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogProAcrPotBen5.tableColumnIdFichaHogar1}"
                                                    headerText="ficha hogar"
                                                    id="tableColumnIdFichaHogar1" rendered="false"
                                                    sort="codigo_ficha_hogar_1x7y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdFichaHogar1"
                                                    text="#{currentRow.value['codigo_ficha_hogar_1x7y3']}"
                                                    rendered="#{LogProAcrPotBen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogProAcrPotBen5.labelIdFichaHogar1}"
                                                    id="labelIdFichaHogar1"
                                                    for="campoIdFichaHogar1"/>
                                                <webuijsf:textField id="campoIdFichaHogar1"
                                                    binding="#{LogProAcrPotBen5.campoIdFichaHogar1}"
                                                    readOnly="#{LogProAcrPotBen5.gestor.filaNoProcesada}"
                                                    text="#{LogProAcrPotBen5.asistente.textoCampoIdFichaHogar1}"
                                                    toolTip="#{LogProAcrPotBen5.asistente.toolTipCampoIdFichaHogar1}"
                                                    validatorExpression="#{LogProAcrPotBen5.campoIdFichaHogar1_validate}"/>
                                                <webuijsf:staticText id="campoIdFichaHogar1Texto1"
                                                    binding="#{LogProAcrPotBen5.campoIdFichaHogar1Texto1}"
                                                    text="#{currentRow.value['codigo_ficha_hogar_1x7y3']}"/>
                                                <webuijsf:message id="messageIdFichaHogar1"
                                                    for="campoIdFichaHogar1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdFichaHogar3" rendered="false"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdFichaHogar3"
                                                    text="#{currentRow.value['id_ficha_hogar']}"
                                                    rendered="#{LogProAcrPotBen5.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{LogProAcrPotBen5.campoIdFichaHogar1Boton1}"
                                                    id="campoIdFichaHogar1Boton1"
                                                    onClick="#{LogProAcrPotBen5.asistente.scriptCampoIdFichaHogar1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{LogProAcrPotBen5.campoIdFichaHogar1Boton3}"
                                                    id="campoIdFichaHogar1Boton3"
                                                    onClick="#{LogProAcrPotBen5.asistente.scriptCampoIdFichaHogar1Boton2}"
                                                    rendered="#{LogProAcrPotBen5.asistente.campoIdFichaHogar1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{LogProAcrPotBen5.tableColumnIdFichaHogar2}"
                                                    headerText="nombre ficha hogar"
                                                    id="tableColumnIdFichaHogar2" rendered="false"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdFichaHogar2"
                                                    text="#{currentRow.value['id_ficha_hogar']}"
                                                    rendered="#{LogProAcrPotBen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogProAcrPotBen5.labelIdFichaHogar2}"
                                                    id="labelIdFichaHogar2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{LogProAcrPotBen5.campoIdFichaHogar1Hiper1}"
                                                    id="campoIdFichaHogar1Hiper1"
                                                    onClick="#{LogProAcrPotBen5.asistente.scriptCampoIdFichaHogar1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdFichaHogar1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogProAcrPotBen5.tableColumnCodigoFichaHogar1}"
                                                    headerText="c&#243;digo ficha hogar"
                                                    id="tableColumnCodigoFichaHogar1" rendered="false"
                                                    sort="codigo_ficha_hogar">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextCodigoFichaHogar1"
                                                    text="#{currentRow.value['codigo_ficha_hogar']}"
                                                    rendered="#{LogProAcrPotBen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogProAcrPotBen5.labelCodigoFichaHogar1}"
                                                    id="labelCodigoFichaHogar1"
                                                    for="campoCodigoFichaHogar1"/>
                                                <webuijsf:textField id="campoCodigoFichaHogar1"
                                                    binding="#{LogProAcrPotBen5.campoCodigoFichaHogar1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{LogProAcrPotBen5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['codigo_ficha_hogar']}"
                                                    toolTip="BundleParametros.codigo_ficha_hogar.log_pro_acr_pot_ben"
                                                    validatorExpression="#{LogProAcrPotBen5.validatorCodigoFichaHogar1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoFichaHogar1Texto1"
                                                    binding="#{LogProAcrPotBen5.campoCodigoFichaHogar1Texto1}"
                                                    text="#{currentRow.value['codigo_ficha_hogar']}"/>
                                                <webuijsf:message id="messageCodigoFichaHogar1"
                                                    for="campoCodigoFichaHogar1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogProAcrPotBen5.tableColumnIndiceCalidadVida1}"
                                                    headerText="indice calidad vida"
                                                    id="tableColumnIndiceCalidadVida1" rendered="false"
                                                    sort="indice_calidad_vida">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIndiceCalidadVida1"
                                                    text="#{currentRow.value['indice_calidad_vida']}"
                                                    rendered="#{LogProAcrPotBen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogProAcrPotBen5.labelIndiceCalidadVida1}"
                                                    id="labelIndiceCalidadVida1"
                                                    for="campoIndiceCalidadVida1"/>
                                                <webuijsf:textField id="campoIndiceCalidadVida1"
                                                    binding="#{LogProAcrPotBen5.campoIndiceCalidadVida1}"
                                                    converter="#{LogProAcrPotBen5.converterIndiceCalidadVida1}"
                                                    readOnly="#{LogProAcrPotBen5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['indice_calidad_vida']}"
                                                    toolTip="BundleParametros.indice_calidad_vida.log_pro_acr_pot_ben"
                                                    validatorExpression="#{LogProAcrPotBen5.validatorIndiceCalidadVida1.validate}"/>
                                                <webuijsf:staticText id="campoIndiceCalidadVida1Texto1"
                                                    binding="#{LogProAcrPotBen5.campoIndiceCalidadVida1Texto1}"
                                                    converter="#{LogProAcrPotBen5.converterIndiceCalidadVida1}"
                                                    text="#{currentRow.value['indice_calidad_vida']}"/>
                                                <webuijsf:message id="messageIndiceCalidadVida1"
                                                    for="campoIndiceCalidadVida1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogProAcrPotBen5.tableColumnEsProcesado1}"
                                                    headerText="procesado"
                                                    id="tableColumnEsProcesado1"
                                                    sort="es_procesado">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsProcesado1"
                                                    text="#{currentRow.value['es_procesado']}"
                                                    rendered="#{LogProAcrPotBen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogProAcrPotBen5.labelEsProcesado1}"
                                                    id="labelEsProcesado1"
                                                    for="listaEsProcesado1"/>
                                                <webuijsf:dropDown id="listaEsProcesado1"
                                                    binding="#{LogProAcrPotBen5.listaEsProcesado1}"
                                                    converter="#{LogProAcrPotBen5.converterEsProcesado1}"
                                                    disabled="#{LogProAcrPotBen5.gestor.filaNoProcesada}" required="true"
                                                    items="#{LogProAcrPotBen5.asistente.opcionesListaEsProcesado1}"
                                                    selected="#{currentRow.value['es_procesado']}"
                                                    toolTip="BundleParametros.es_procesado.log_pro_acr_pot_ben"/>
                                                <webuijsf:staticText id="listaEsProcesado1Texto1"
                                                    binding="#{LogProAcrPotBen5.listaEsProcesado1Texto1}"/>
                                                <webuijsf:message id="messageEsProcesado1"
                                                    for="listaEsProcesado1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogProAcrPotBen5.tableColumnObservacion1}"
                                                    headerText="observaci&#243;n"
                                                    id="tableColumnObservacion1" rendered="false"
                                                    sort="observacion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextObservacion1"
                                                    text="#{currentRow.value['observacion']}"
                                                    rendered="#{LogProAcrPotBen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogProAcrPotBen5.labelObservacion1}"
                                                    id="labelObservacion1"
                                                    for="campoObservacion1"/>
                                                <webuijsf:textArea id="campoObservacion1"
                                                    binding="#{LogProAcrPotBen5.campoObservacion1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogProAcrPotBen5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['observacion']}"
                                                    toolTip="BundleParametros.observacion.log_pro_acr_pot_ben"
                                                    validatorExpression="#{LogProAcrPotBen5.validatorObservacion1.validate}"/>
                                                <webuijsf:staticText id="campoObservacion1Texto1"
                                                    binding="#{LogProAcrPotBen5.campoObservacion1Texto1}"
                                                    text="#{currentRow.value['observacion']}"/>
                                                <webuijsf:message id="messageObservacion1"
                                                    for="campoObservacion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogProAcrPotBen5.tableColumnFechaHoraTransaccion1}"
                                                    headerText="fecha hora transacci&#243;n"
                                                    id="tableColumnFechaHoraTransaccion1"
                                                    sort="fecha_hora_transaccion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextFechaHoraTransaccion1"
                                                    text="#{currentRow.value['fecha_hora_transaccion']}"
                                                    rendered="#{LogProAcrPotBen5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogProAcrPotBen5.labelFechaHoraTransaccion1}"
                                                    id="labelFechaHoraTransaccion1"
                                                    for="campoFechaHoraTransaccion1"/>
                                                <webuijsf:textField id="campoFechaHoraTransaccion1"
                                                    binding="#{LogProAcrPotBen5.campoFechaHoraTransaccion1}"
                                                    converter="#{LogProAcrPotBen5.converterFechaHoraTransaccion1}"
                                                    readOnly="#{LogProAcrPotBen5.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['fecha_hora_transaccion']}"
                                                    toolTip="BundleParametros.fecha_hora_transaccion.log_pro_acr_pot_ben"/>
                                                <webuijsf:staticText id="campoFechaHoraTransaccion1Texto1"
                                                    binding="#{LogProAcrPotBen5.campoFechaHoraTransaccion1Texto1}"
                                                    converter="#{LogProAcrPotBen5.converterFechaHoraTransaccion1}"
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
                                                        binding="#{LogProAcrPotBen5.etiquetaTextoFilasPorPagina1}" 
                                                        for="textoFilasPorPagina1"
                                                        id="etiquetaTextoFilasPorPagina1" 
                                                        text="#{LogProAcrPotBen5.gestor.i18n.textoEtiquetaTextoFilasPorPagina}"/>
                                                </h:panelGrid>
                                                <h:panelGrid 
                                                    columns="3" 
                                                    id="gridPanel107">
                                                    <webuijsf:textField 
                                                        binding="#{LogProAcrPotBen5.textoFilasPorPagina1}" 
                                                        columns="2"
                                                        converter="#{LogProAcrPotBen5.textoFilasPorPagina1Converter1}"
                                                        disabled="#{LogProAcrPotBen5.gestor.paginacionInhabilitada}" 
                                                        id="textoFilasPorPagina1" maxLength="2"
                                                        text="#{LogProAcrPotBen5.gestor.filasPorPagina}" 
                                                        validatorExpression="#{LogProAcrPotBen5.textoFilasPorPagina1Validator1.validate}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{LogProAcrPotBen5.botonRepaginar1_action}"
                                                        binding="#{LogProAcrPotBen5.botonRepaginar1}" 
                                                        id="botonRepaginar1"
                                                        imageURL="#{LogProAcrPotBen5.gestor.urlImagenRepaginar}" 
                                                        onClick="#{LogProAcrPotBen5.gestor.scriptRepaginar}"
                                                        text="#{LogProAcrPotBen5.gestor.i18n.textoBotonRepaginar}"
                                                        toolTip="#{LogProAcrPotBen5.gestor.i18n.toolTipBotonRepaginar}"/>
                                                    <webuijsf:message 
                                                        for="textoFilasPorPagina1" 
                                                        id="messageFilasPorPagina1"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="13"
                                                id="gridPanel108">
                                                <webuijsf:button
                                                    actionExpression="#{LogProAcrPotBen5.botonAgregar1_action}"
                                                    binding="#{LogProAcrPotBen5.botonAgregar1}"
                                                    disabled="#{LogProAcrPotBen5.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{LogProAcrPotBen5.gestor.scriptAgregar}"
                                                    rendered="#{LogProAcrPotBen5.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProAcrPotBen5.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{LogProAcrPotBen5.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{LogProAcrPotBen5.listaFuncionEdicion1}"
                                                    converter="#{LogProAcrPotBen5.converterListaFuncionEdicion1}"
                                                    disabled="#{LogProAcrPotBen5.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{LogProAcrPotBen5.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{LogProAcrPotBen5.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{LogProAcrPotBen5.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{LogProAcrPotBen5.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProAcrPotBen5.botonEditar1_action}"
                                                    binding="#{LogProAcrPotBen5.botonEditar1}"
                                                    disabled="#{LogProAcrPotBen5.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{LogProAcrPotBen5.gestor.scriptEditar}"
                                                    rendered="#{LogProAcrPotBen5.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProAcrPotBen5.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{LogProAcrPotBen5.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProAcrPotBen5.botonEliminar1_action}"
                                                    binding="#{LogProAcrPotBen5.botonEliminar1}"
                                                    disabled="#{LogProAcrPotBen5.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{LogProAcrPotBen5.gestor.scriptEliminar}"
                                                    rendered="#{LogProAcrPotBen5.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProAcrPotBen5.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{LogProAcrPotBen5.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProAcrPotBen5.botonAplicar1_action}"
                                                    binding="#{LogProAcrPotBen5.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{LogProAcrPotBen5.gestor.scriptAplicar}"
                                                    rendered="#{LogProAcrPotBen5.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProAcrPotBen5.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{LogProAcrPotBen5.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProAcrPotBen5.botonDeshacer1_action}"
                                                    binding="#{LogProAcrPotBen5.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{LogProAcrPotBen5.gestor.scriptDeshacer}"
                                                    rendered="#{LogProAcrPotBen5.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProAcrPotBen5.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{LogProAcrPotBen5.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProAcrPotBen5.botonConfirmar1_action}"
                                                    binding="#{LogProAcrPotBen5.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{LogProAcrPotBen5.gestor.scriptConfirmar}"
                                                    rendered="#{LogProAcrPotBen5.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProAcrPotBen5.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{LogProAcrPotBen5.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProAcrPotBen5.botonDescartar1_action}"
                                                    binding="#{LogProAcrPotBen5.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{LogProAcrPotBen5.gestor.scriptDescartar}"
                                                    rendered="#{LogProAcrPotBen5.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProAcrPotBen5.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{LogProAcrPotBen5.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{LogProAcrPotBen5.listaFuncionAccion1}"
                                                    converter="#{LogProAcrPotBen5.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{LogProAcrPotBen5.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{LogProAcrPotBen5.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{LogProAcrPotBen5.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{LogProAcrPotBen5.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProAcrPotBen5.botonProcesar1_action}"
                                                    binding="#{LogProAcrPotBen5.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{LogProAcrPotBen5.gestor.scriptProcesar}"
                                                    rendered="#{LogProAcrPotBen5.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProAcrPotBen5.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{LogProAcrPotBen5.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProAcrPotBen5.botonRefrescar1_action}"
                                                    binding="#{LogProAcrPotBen5.botonRefrescar1}"
                                                    disabled="#{LogProAcrPotBen5.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{LogProAcrPotBen5.gestor.scriptRefrescar}"
                                                    rendered="#{LogProAcrPotBen5.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProAcrPotBen5.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{LogProAcrPotBen5.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProAcrPotBen5.botonReconsultar1_action}"
                                                    binding="#{LogProAcrPotBen5.botonReconsultar1}"
                                                    disabled="#{LogProAcrPotBen5.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{LogProAcrPotBen5.gestor.scriptReconsultar}"
                                                    rendered="#{LogProAcrPotBen5.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProAcrPotBen5.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{LogProAcrPotBen5.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProAcrPotBen5.botonRetornar1_action}"
                                                    binding="#{LogProAcrPotBen5.botonRetornar1}"
                                                    disabled="#{LogProAcrPotBen5.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{LogProAcrPotBen5.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{LogProAcrPotBen5.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProAcrPotBen5.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{LogProAcrPotBen5.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel109"
                                                rendered="#{LogProAcrPotBen5.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{LogProAcrPotBen5.imageHyperlink1_action}"
                                                    binding="#{LogProAcrPotBen5.imageHyperlink1}"
                                                    disabled="#{LogProAcrPotBen5.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{LogProAcrPotBen5.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{LogProAcrPotBen5.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{LogProAcrPotBen5.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.LogProAcrPotBen5_imageHyperlink1_toolTip}"/>
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
