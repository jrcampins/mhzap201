<?xml version="1.0" encoding="UTF-8"?>
<!--
   Copyright (C) 2008, EGT Consultores, C.A.
   Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los términos
   de la licencia "GNU General Public License" publicada por la Fundación "Free Software Foundation".
   Este programa se distribuye con la esperanza de que pueda ser útil, pero SIN NINGUNA GARANTIA;
   vea la licencia "GNU General Public License" para obtener mas información.
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page binding="#{ElementoSegmentoPorConjuntoSegmento1.page1}" id="page1">
            <webuijsf:html binding="#{ElementoSegmentoPorConjuntoSegmento1.html1}" id="html1">
                <webuijsf:head binding="#{ElementoSegmentoPorConjuntoSegmento1.head1}" id="head1" title="#{ApplicationBean1.nombreAplicacion}">
                    <webuijsf:link binding="#{ElementoSegmentoPorConjuntoSegmento1.link1}" id="link1" url="/resources/stylesheet.css"/>
                    <webuijsf:script binding="#{ElementoSegmentoPorConjuntoSegmento1.script1}" id="script1" url="/resources/javascript1.js"/>
                </webuijsf:head>
                <webuijsf:body binding="#{ElementoSegmentoPorConjuntoSegmento1.body1}" id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}" onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}" onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}" styleClass="pdq-body-1">
                    <webuijsf:form binding="#{ElementoSegmentoPorConjuntoSegmento1.form1}" id="form1" virtualFormsConfig="virtualForm1 | checkbox1 campoIdElementoSegmento1 campoIdSegmento1 campoValorSegmento1 campoSignificadoSegmento1 textoFilasPorPagina1 listaFuncionEdicion1 gridPanel101:table1:tableRowGroup1:tableColumnIdRecurso1:campoIdRecurso1 | , virtualForm2 | textoFilasPorPagina1 | botonRepaginar1 , virtualForm3 | checkbox1 listaFuncionEdicion1 | listaFuncionEdicion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonEscogerFila1 botonDetallarFila1 botonRetornarFila1 botonRefrescar1 botonAgregar1 botonDescartar1 botonRetornar1">
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
                                    <webuijsf:breadcrumbs binding="#{ElementoSegmentoPorConjuntoSegmento1.breadcrumbs1}" id="breadcrumbs1" styleClass="pdq-breadcrumbs-1"/>
                                </div>
                                <div class="pdq-div-filtro-1">
                                    <jsp:directive.include file="FragmentoFiltro_1.jspf"/>
                                </div>
                                <div class="pos-div-detalle">
                                    <h:panelGrid binding="#{ElementoSegmentoPorConjuntoSegmento1.gridPanel101}" id="gridPanel101">
                                        <h:panelGrid binding="#{ElementoSegmentoPorConjuntoSegmento1.gridPanel102}" id="gridPanel102">
                                            <h:panelGrid binding="#{ElementoSegmentoPorConjuntoSegmento1.gridPanel103}" columns="2" id="gridPanel103">
                                                <webuijsf:image binding="#{ElementoSegmentoPorConjuntoSegmento1.imagenMensaje1}" id="imagenMensaje1" url="#{ElementoSegmentoPorConjuntoSegmento1.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink align="middle" binding="#{ElementoSegmentoPorConjuntoSegmento1.hipervinculoMensaje1}"
                                                    id="hipervinculoMensaje1" text="#{ElementoSegmentoPorConjuntoSegmento1.gestor.mensaje}" url="#{ElementoSegmentoPorConjuntoSegmento1.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:table binding="#{ElementoSegmentoPorConjuntoSegmento1.table1}" clearSortButton="true"
                                            deselectMultipleButton="true" id="table1" paginateButton="false" paginationControls="true"
                                            selectMultipleButton="true" sortPanelToggleButton="true">
                                            <webuijsf:tableRowGroup binding="#{ElementoSegmentoPorConjuntoSegmento1.tableRowGroup1}" id="tableRowGroup1"
                                                rows="1" selected="#{ElementoSegmentoPorConjuntoSegmento1.gestor.filaEscogida}"
                                                sourceData="#{ElementoSegmentoPorConjuntoSegmento1.elementoSegmentoDataProvider}" sourceVar="currentRow">
                                                <webuijsf:tableColumn align="center"
                                                    binding="#{ElementoSegmentoPorConjuntoSegmento1.tableRowGroup1SelectionColumn}"
                                                    id="tableRowGroup1SelectionColumn"
                                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);" selectId="checkbox1">
                                                    <webuijsf:checkbox binding="#{ElementoSegmentoPorConjuntoSegmento1.checkbox1}" id="checkbox1"
                                                        onClick="#{ElementoSegmentoPorConjuntoSegmento1.gestor.scriptElegir}"
                                                        selected="#{ElementoSegmentoPorConjuntoSegmento1.gestor.filaElegida}" toolTip="#{ElementoSegmentoPorConjuntoSegmento1.gestor.i18n.toolTipCheckboxSeleccionMultiple}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn align="center" binding="#{ElementoSegmentoPorConjuntoSegmento1.tableColumn1}" id="tableColumn1">
                                                    <webuijsf:button actionExpression="#{ElementoSegmentoPorConjuntoSegmento1.botonEscogerFila1_action}"
                                                        binding="#{ElementoSegmentoPorConjuntoSegmento1.botonEscogerFila1}"
                                                        disabled="#{ElementoSegmentoPorConjuntoSegmento1.gestor.funcionPickItemInhabilitada}"
                                                        id="botonEscogerFila1" imageURL="#{ElementoSegmentoPorConjuntoSegmento1.gestor.urlImagenEscoger}"
                                                        onClick="#{ElementoSegmentoPorConjuntoSegmento1.gestor.scriptEscoger}"
                                                        text="#{ElementoSegmentoPorConjuntoSegmento1.gestor.i18n.textoBotonEscogerFila}" toolTip="#{ElementoSegmentoPorConjuntoSegmento1.gestor.i18n.toolTipBotonEscogerFila}"/>
                                                    <webuijsf:button actionExpression="#{ElementoSegmentoPorConjuntoSegmento1.botonDetallarFila1_action}"
                                                        binding="#{ElementoSegmentoPorConjuntoSegmento1.botonDetallarFila1}"
                                                        disabled="#{ElementoSegmentoPorConjuntoSegmento1.gestor.funcionPickItemInhabilitada}"
                                                        id="botonDetallarFila1" imageURL="#{ElementoSegmentoPorConjuntoSegmento1.gestor.urlImagenDetallar}"
                                                        onClick="#{ElementoSegmentoPorConjuntoSegmento1.scriptAbrirVentanaVerDetalle}"
                                                        rendered="#{ElementoSegmentoPorConjuntoSegmento1.gestor.detalleDisponible}"
                                                        text="#{ElementoSegmentoPorConjuntoSegmento1.gestor.i18n.textoBotonDetallarFila}" toolTip="#{ElementoSegmentoPorConjuntoSegmento1.gestor.i18n.toolTipBotonDetallarFila}"/>
                                                    <webuijsf:button actionExpression="#{ElementoSegmentoPorConjuntoSegmento1.botonRetornarFila1_action}"
                                                        binding="#{ElementoSegmentoPorConjuntoSegmento1.botonRetornarFila1}"
                                                        disabled="#{ElementoSegmentoPorConjuntoSegmento1.gestor.funcionReturnInhabilitada}"
                                                        id="botonRetornarFila1" imageURL="#{ElementoSegmentoPorConjuntoSegmento1.gestor.urlImagenRetornar}"
                                                        onClick="#{ElementoSegmentoPorConjuntoSegmento1.gestor.scriptRetornarRecursoActual}"
                                                        rendered="#{ElementoSegmentoPorConjuntoSegmento1.gestor.funcionReturnVisible}"
                                                        text="#{ElementoSegmentoPorConjuntoSegmento1.gestor.i18n.textoBotonRetornarFila}" toolTip="#{ElementoSegmentoPorConjuntoSegmento1.gestor.i18n.toolTipBotonRetornarFila}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn binding="#{ElementoSegmentoPorConjuntoSegmento1.tableColumn2}" id="tableColumn2" rendered="#{ElementoSegmentoPorConjuntoSegmento1.gestor.designing}">
                                                    <webuijsf:imageHyperlink
                                                        actionExpression="#{ElementoSegmentoPorConjuntoSegmento1.hipervinculoAccionFila1_action}"
                                                        binding="#{ElementoSegmentoPorConjuntoSegmento1.hipervinculoAccionFila1}"
                                                        disabled="#{ElementoSegmentoPorConjuntoSegmento1.gestor.loteConCambios}" id="hipervinculoAccionFila1"
                                                        text="Accion1" toolTip="#{bundle.ElementoSegmentoPorConjuntoSegmento1_hipervinculoAccionFila1_toolTip}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn align="right" binding="#{ElementoSegmentoPorConjuntoSegmento1.tableColumn3}"
                                                    headerText="#{ElementoSegmentoPorConjuntoSegmento1.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    id="tableColumn3" toolTip="#{ElementoSegmentoPorConjuntoSegmento1.gestor.i18n.toolTipEtiquetaIdentificacionFila}">
                                                    <webuijsf:imageHyperlink
                                                        actionExpression="#{ElementoSegmentoPorConjuntoSegmento1.hipervinculoDetallarFila1_action}"
                                                        binding="#{ElementoSegmentoPorConjuntoSegmento1.hipervinculoDetallarFila1}"
                                                        id="hipervinculoDetallarFila1"
                                                        imageURL="#{ElementoSegmentoPorConjuntoSegmento1.gestor.urlImagenFilaProcesada}"
                                                        text="#{ElementoSegmentoPorConjuntoSegmento1.gestor.identificacionFila}" textPosition="left" toolTip="#{ElementoSegmentoPorConjuntoSegmento1.gestor.toolTipImagenFilaProcesada}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn binding="#{ElementoSegmentoPorConjuntoSegmento1.tableColumnIdElementoSegmento1}"
                                                    headerText="id" id="tableColumnIdElementoSegmento1" rendered="false" sort="id_elemento_segmento">
                                                    <webuijsf:staticText binding="#{ElementoSegmentoPorConjuntoSegmento1.hiddenStaticTextIdElementoSegmento1}"
                                                        id="hiddenStaticTextIdElementoSegmento1"
                                                        rendered="#{ElementoSegmentoPorConjuntoSegmento1.gestor.designing}" text="#{currentRow.value['id_elemento_segmento']}"/>
                                                    <webuijsf:label binding="#{ElementoSegmentoPorConjuntoSegmento1.labelIdElementoSegmento1}"
                                                        for="campoIdElementoSegmento1" id="labelIdElementoSegmento1"/>
                                                    <webuijsf:textField binding="#{ElementoSegmentoPorConjuntoSegmento1.campoIdElementoSegmento1}"
                                                        converter="#{ElementoSegmentoPorConjuntoSegmento1.converterIdElementoSegmento1}"
                                                        id="campoIdElementoSegmento1" readOnly="#{ElementoSegmentoPorConjuntoSegmento1.gestor.filaNoProcesada}"
                                                        text="#{currentRow.value['id_elemento_segmento']}" validatorExpression="#{ElementoSegmentoPorConjuntoSegmento1.validatorIdElementoSegmento1.validate}"/>
                                                    <webuijsf:staticText binding="#{ElementoSegmentoPorConjuntoSegmento1.campoIdElementoSegmento1Texto1}" id="campoIdElementoSegmento1Texto1"/>
                                                    <webuijsf:message binding="#{ElementoSegmentoPorConjuntoSegmento1.messageIdElementoSegmento1}"
                                                        for="campoIdElementoSegmento1" id="messageIdElementoSegmento1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn binding="#{ElementoSegmentoPorConjuntoSegmento1.tableColumnIdSegmento1}"
                                                    headerText="segmento" id="tableColumnIdSegmento1" rendered="false" sort="id_segmento">
                                                    <webuijsf:staticText binding="#{ElementoSegmentoPorConjuntoSegmento1.hiddenStaticTextIdSegmento1}"
                                                        id="hiddenStaticTextIdSegmento1" rendered="#{ElementoSegmentoPorConjuntoSegmento1.gestor.designing}" text="#{currentRow.value['id_segmento']}"/>
                                                    <webuijsf:label binding="#{ElementoSegmentoPorConjuntoSegmento1.labelIdSegmento1}" for="campoIdSegmento1" id="labelIdSegmento1"/>
                                                    <webuijsf:textField binding="#{ElementoSegmentoPorConjuntoSegmento1.campoIdSegmento1}"
                                                        converter="#{ElementoSegmentoPorConjuntoSegmento1.converterIdSegmento1}" id="campoIdSegmento1"
                                                        readOnly="#{ElementoSegmentoPorConjuntoSegmento1.gestor.filaNoProcesada}" required="true"
                                                        text="#{currentRow.value['id_segmento']}" validatorExpression="#{ElementoSegmentoPorConjuntoSegmento1.validatorIdSegmento1.validate}"/>
                                                    <webuijsf:staticText binding="#{ElementoSegmentoPorConjuntoSegmento1.campoIdSegmento1Texto1}" id="campoIdSegmento1Texto1"/>
                                                    <webuijsf:message binding="#{ElementoSegmentoPorConjuntoSegmento1.messageIdSegmento1}"
                                                        for="campoIdSegmento1" id="messageIdSegmento1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn binding="#{ElementoSegmentoPorConjuntoSegmento1.tableColumnValorSegmento1}"
                                                    headerText="valor segmento" id="tableColumnValorSegmento1" rendered="false" sort="valor_segmento">
                                                    <webuijsf:staticText binding="#{ElementoSegmentoPorConjuntoSegmento1.hiddenStaticTextValorSegmento1}"
                                                        id="hiddenStaticTextValorSegmento1" rendered="#{ElementoSegmentoPorConjuntoSegmento1.gestor.designing}" text="#{currentRow.value['valor_segmento']}"/>
                                                    <webuijsf:label binding="#{ElementoSegmentoPorConjuntoSegmento1.labelValorSegmento1}"
                                                        for="campoValorSegmento1" id="labelValorSegmento1"/>
                                                    <webuijsf:textArea binding="#{ElementoSegmentoPorConjuntoSegmento1.campoValorSegmento1}" columns="100"
                                                        id="campoValorSegmento1" readOnly="#{ElementoSegmentoPorConjuntoSegmento1.gestor.filaNoProcesada}"
                                                        rows="3" text="#{currentRow.value['valor_segmento']}" validatorExpression="#{ElementoSegmentoPorConjuntoSegmento1.validatorValorSegmento1.validate}"/>
                                                    <webuijsf:staticText binding="#{ElementoSegmentoPorConjuntoSegmento1.campoValorSegmento1Texto1}" id="campoValorSegmento1Texto1"/>
                                                    <webuijsf:message binding="#{ElementoSegmentoPorConjuntoSegmento1.messageValorSegmento1}"
                                                        for="campoValorSegmento1" id="messageValorSegmento1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn binding="#{ElementoSegmentoPorConjuntoSegmento1.tableColumnSignificadoSegmento1}"
                                                    headerText="significado segmento" id="tableColumnSignificadoSegmento1" rendered="false" sort="significado_segmento">
                                                    <webuijsf:staticText binding="#{ElementoSegmentoPorConjuntoSegmento1.hiddenStaticTextSignificadoSegmento1}"
                                                        id="hiddenStaticTextSignificadoSegmento1"
                                                        rendered="#{ElementoSegmentoPorConjuntoSegmento1.gestor.designing}" text="#{currentRow.value['significado_segmento']}"/>
                                                    <webuijsf:label binding="#{ElementoSegmentoPorConjuntoSegmento1.labelSignificadoSegmento1}"
                                                        for="campoSignificadoSegmento1" id="labelSignificadoSegmento1"/>
                                                    <webuijsf:textArea binding="#{ElementoSegmentoPorConjuntoSegmento1.campoSignificadoSegmento1}" columns="100"
                                                        id="campoSignificadoSegmento1" readOnly="#{ElementoSegmentoPorConjuntoSegmento1.gestor.filaNoProcesada}"
                                                        rows="3" text="#{currentRow.value['significado_segmento']}" validatorExpression="#{ElementoSegmentoPorConjuntoSegmento1.validatorSignificadoSegmento1.validate}"/>
                                                    <webuijsf:staticText binding="#{ElementoSegmentoPorConjuntoSegmento1.campoSignificadoSegmento1Texto1}" id="campoSignificadoSegmento1Texto1"/>
                                                    <webuijsf:message binding="#{ElementoSegmentoPorConjuntoSegmento1.messageSignificadoSegmento1}"
                                                        for="campoSignificadoSegmento1" id="messageSignificadoSegmento1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn binding="#{ElementoSegmentoPorConjuntoSegmento1.tableColumnIdRecurso1}"
                                                    headerText="segmento" id="tableColumnIdRecurso1" sort="codigo_segmento">
                                                    <webuijsf:staticText binding="#{ElementoSegmentoPorConjuntoSegmento1.hiddenStaticTextIdRecurso1}"
                                                        id="hiddenStaticTextIdRecurso1" rendered="#{ElementoSegmentoPorConjuntoSegmento1.gestor.designing}" text="#{currentRow.value['codigo_segmento']}"/>
                                                    <webuijsf:label binding="#{ElementoSegmentoPorConjuntoSegmento1.labelIdRecurso1}" for="campoIdRecurso1" id="labelIdRecurso1"/>
                                                    <webuijsf:textField binding="#{ElementoSegmentoPorConjuntoSegmento1.campoIdRecurso1}" id="campoIdRecurso1"
                                                        readOnly="#{ElementoSegmentoPorConjuntoSegmento1.gestor.filaNoProcesada}" required="true"
                                                        text="#{ElementoSegmentoPorConjuntoSegmento1.asistente.textoCampoIdRecurso1}"
                                                        toolTip="#{ElementoSegmentoPorConjuntoSegmento1.asistente.toolTipCampoIdRecurso1}" validatorExpression="#{ElementoSegmentoPorConjuntoSegmento1.campoIdRecurso1_validate}"/>
                                                    <webuijsf:staticText binding="#{ElementoSegmentoPorConjuntoSegmento1.campoIdRecurso1Texto1}" id="campoIdRecurso1Texto1" text="#{currentRow.value['codigo_segmento']}"/>
                                                    <webuijsf:button binding="#{ElementoSegmentoPorConjuntoSegmento1.campoIdRecurso1Boton1}"
                                                        id="campoIdRecurso1Boton1" onClick="#{ElementoSegmentoPorConjuntoSegmento1.asistente.scriptCampoIdRecurso1Boton1}"/>
                                                    <webuijsf:message binding="#{ElementoSegmentoPorConjuntoSegmento1.messageIdRecurso1}" for="campoIdRecurso1" id="messageIdRecurso1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn binding="#{ElementoSegmentoPorConjuntoSegmento1.tableColumnIdRecurso2}"
                                                    headerText="nombre segmento" id="tableColumnIdRecurso2" sort="nombre_segmento" styleClass="pdq-estilo-id-2">
                                                    <webuijsf:staticText binding="#{ElementoSegmentoPorConjuntoSegmento1.hiddenStaticTextIdRecurso1}"
                                                        id="hiddenStaticTextIdRecurso2" rendered="#{ElementoSegmentoPorConjuntoSegmento1.gestor.designing}" text="#{currentRow.value['nombre_segmento']}"/>
                                                    <webuijsf:label binding="#{ElementoSegmentoPorConjuntoSegmento1.labelIdRecurso2}" id="labelIdRecurso2" text=""/>
                                                    <webuijsf:imageHyperlink binding="#{ElementoSegmentoPorConjuntoSegmento1.campoIdRecurso1Hiper1}" text="#{currentRow.value['nombre_segmento']}"
                                                        id="campoIdRecurso1Hiper1" onClick="#{ElementoSegmentoPorConjuntoSegmento1.asistente.scriptCampoIdRecurso1Boton2}"/>
                                                </webuijsf:tableColumn>
                                            </webuijsf:tableRowGroup>
                                        </webuijsf:table>
                                        <h:panelGrid binding="#{ElementoSegmentoPorConjuntoSegmento1.gridPanel104}" id="gridPanel104">
                                            <h:panelGrid binding="#{ElementoSegmentoPorConjuntoSegmento1.gridPanel105}" columns="2" id="gridPanel105">
                                                <h:panelGrid binding="#{ElementoSegmentoPorConjuntoSegmento1.gridPanel106}" id="gridPanel106">
                                                    <webuijsf:label binding="#{ElementoSegmentoPorConjuntoSegmento1.etiquetaTextoFilasPorPagina1}"
                                                        for="textoFilasPorPagina1" id="etiquetaTextoFilasPorPagina1" text="#{ElementoSegmentoPorConjuntoSegmento1.gestor.i18n.textoEtiquetaTextoFilasPorPagina}"/>
                                                </h:panelGrid>
                                                <h:panelGrid binding="#{ElementoSegmentoPorConjuntoSegmento1.gridPanel107}" columns="3" id="gridPanel107">
                                                    <webuijsf:textField binding="#{ElementoSegmentoPorConjuntoSegmento1.textoFilasPorPagina1}" columns="2"
                                                        converter="#{ElementoSegmentoPorConjuntoSegmento1.textoFilasPorPagina1Converter1}"
                                                        disabled="#{ElementoSegmentoPorConjuntoSegmento1.gestor.paginacionInhabilitada}"
                                                        id="textoFilasPorPagina1" maxLength="2"
                                                        text="#{ElementoSegmentoPorConjuntoSegmento1.gestor.filasPorPagina}" validatorExpression="#{ElementoSegmentoPorConjuntoSegmento1.textoFilasPorPagina1Validator1.validate}"/>
                                                    <webuijsf:button actionExpression="#{ElementoSegmentoPorConjuntoSegmento1.botonRepaginar1_action}"
                                                        binding="#{ElementoSegmentoPorConjuntoSegmento1.botonRepaginar1}" id="botonRepaginar1"
                                                        imageURL="#{ElementoSegmentoPorConjuntoSegmento1.gestor.urlImagenRepaginar}"
                                                        onClick="#{ElementoSegmentoPorConjuntoSegmento1.gestor.scriptRepaginar}"
                                                        text="#{ElementoSegmentoPorConjuntoSegmento1.gestor.i18n.textoBotonRepaginar}" toolTip="#{ElementoSegmentoPorConjuntoSegmento1.gestor.i18n.toolTipBotonRepaginar}"/>
                                                    <webuijsf:message binding="#{ElementoSegmentoPorConjuntoSegmento1.messageFilasPorPagina1}"
                                                        for="textoFilasPorPagina1" id="messageFilasPorPagina1"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{ElementoSegmentoPorConjuntoSegmento1.gridPanel108}" columns="10" id="gridPanel108">
                                                <webuijsf:button actionExpression="#{ElementoSegmentoPorConjuntoSegmento1.botonAgregar1_action}"
                                                    binding="#{ElementoSegmentoPorConjuntoSegmento1.botonAgregar1}"
                                                    disabled="#{ElementoSegmentoPorConjuntoSegmento1.gestor.funcionInsertInhabilitada}" id="botonAgregar1"
                                                    onClick="#{ElementoSegmentoPorConjuntoSegmento1.gestor.scriptAgregar}"
                                                    rendered="#{ElementoSegmentoPorConjuntoSegmento1.gestor.funcionInsertHabilitada}" styleClass="pdq-button-1"
                                                    text="#{ElementoSegmentoPorConjuntoSegmento1.gestor.i18n.textoBotonAgregar}" toolTip="#{ElementoSegmentoPorConjuntoSegmento1.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown binding="#{ElementoSegmentoPorConjuntoSegmento1.listaFuncionEdicion1}"
                                                    converter="#{ElementoSegmentoPorConjuntoSegmento1.converterListaFuncionEdicion1}"
                                                    disabled="#{ElementoSegmentoPorConjuntoSegmento1.gestor.loteConCambios}" id="listaFuncionEdicion1"
                                                    items="#{ElementoSegmentoPorConjuntoSegmento1.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{ElementoSegmentoPorConjuntoSegmento1.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{ElementoSegmentoPorConjuntoSegmento1.gestor.funcionEdicionSeleccionada}" toolTip="#{ElementoSegmentoPorConjuntoSegmento1.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button actionExpression="#{ElementoSegmentoPorConjuntoSegmento1.botonEditar1_action}"
                                                    binding="#{ElementoSegmentoPorConjuntoSegmento1.botonEditar1}"
                                                    disabled="#{ElementoSegmentoPorConjuntoSegmento1.gestor.funcionUpdateInhabilitada}" id="botonEditar1"
                                                    onClick="#{ElementoSegmentoPorConjuntoSegmento1.gestor.scriptEditar}"
                                                    rendered="#{ElementoSegmentoPorConjuntoSegmento1.gestor.funcionUpdateHabilitada}" styleClass="pdq-button-1"
                                                    text="#{ElementoSegmentoPorConjuntoSegmento1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}" toolTip="#{ElementoSegmentoPorConjuntoSegmento1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button actionExpression="#{ElementoSegmentoPorConjuntoSegmento1.botonEliminar1_action}"
                                                    binding="#{ElementoSegmentoPorConjuntoSegmento1.botonEliminar1}"
                                                    disabled="#{ElementoSegmentoPorConjuntoSegmento1.gestor.funcionDeleteInhabilitada}" id="botonEliminar1"
                                                    onClick="#{ElementoSegmentoPorConjuntoSegmento1.gestor.scriptEliminar}"
                                                    rendered="#{ElementoSegmentoPorConjuntoSegmento1.gestor.funcionDeleteHabilitada}" styleClass="pdq-button-1"
                                                    text="#{ElementoSegmentoPorConjuntoSegmento1.gestor.i18n.textoBotonEliminar}" toolTip="#{ElementoSegmentoPorConjuntoSegmento1.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button actionExpression="#{ElementoSegmentoPorConjuntoSegmento1.botonAplicar1_action}"
                                                    binding="#{ElementoSegmentoPorConjuntoSegmento1.botonAplicar1}" id="botonAplicar1"
                                                    onClick="#{ElementoSegmentoPorConjuntoSegmento1.gestor.scriptAplicar}"
                                                    rendered="#{ElementoSegmentoPorConjuntoSegmento1.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1" text="#{ElementoSegmentoPorConjuntoSegmento1.gestor.i18n.textoBotonAplicar}" toolTip="#{ElementoSegmentoPorConjuntoSegmento1.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button actionExpression="#{ElementoSegmentoPorConjuntoSegmento1.botonDeshacer1_action}"
                                                    binding="#{ElementoSegmentoPorConjuntoSegmento1.botonDeshacer1}" id="botonDeshacer1"
                                                    onClick="#{ElementoSegmentoPorConjuntoSegmento1.gestor.scriptDeshacer}"
                                                    rendered="#{ElementoSegmentoPorConjuntoSegmento1.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1" text="#{ElementoSegmentoPorConjuntoSegmento1.gestor.i18n.textoBotonDeshacer}" toolTip="#{ElementoSegmentoPorConjuntoSegmento1.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button actionExpression="#{ElementoSegmentoPorConjuntoSegmento1.botonConfirmar1_action}"
                                                    binding="#{ElementoSegmentoPorConjuntoSegmento1.botonConfirmar1}" id="botonConfirmar1"
                                                    onClick="#{ElementoSegmentoPorConjuntoSegmento1.gestor.scriptConfirmar}"
                                                    rendered="#{ElementoSegmentoPorConjuntoSegmento1.gestor.funcionCommitHabilitada}" styleClass="pdq-button-1"
                                                    text="#{ElementoSegmentoPorConjuntoSegmento1.gestor.i18n.textoBotonConfirmar}" toolTip="#{ElementoSegmentoPorConjuntoSegmento1.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button actionExpression="#{ElementoSegmentoPorConjuntoSegmento1.botonDescartar1_action}"
                                                    binding="#{ElementoSegmentoPorConjuntoSegmento1.botonDescartar1}" id="botonDescartar1"
                                                    onClick="#{ElementoSegmentoPorConjuntoSegmento1.gestor.scriptDescartar}"
                                                    rendered="#{ElementoSegmentoPorConjuntoSegmento1.gestor.funcionRevertHabilitada}" styleClass="pdq-button-1"
                                                    text="#{ElementoSegmentoPorConjuntoSegmento1.gestor.i18n.textoBotonDescartar}" toolTip="#{ElementoSegmentoPorConjuntoSegmento1.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:button actionExpression="#{ElementoSegmentoPorConjuntoSegmento1.botonRefrescar1_action}"
                                                    binding="#{ElementoSegmentoPorConjuntoSegmento1.botonRefrescar1}"
                                                    disabled="#{ElementoSegmentoPorConjuntoSegmento1.gestor.funcionSelectInhabilitada}" id="botonRefrescar1"
                                                    onClick="#{ElementoSegmentoPorConjuntoSegmento1.gestor.scriptRefrescar}"
                                                    rendered="#{ElementoSegmentoPorConjuntoSegmento1.gestor.funcionSelectHabilitada}" styleClass="pdq-button-1"
                                                    text="#{ElementoSegmentoPorConjuntoSegmento1.gestor.i18n.textoBotonRefrescar}" toolTip="#{ElementoSegmentoPorConjuntoSegmento1.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button actionExpression="#{ElementoSegmentoPorConjuntoSegmento1.botonRetornar1_action}"
                                                    binding="#{ElementoSegmentoPorConjuntoSegmento1.botonRetornar1}"
                                                    disabled="#{ElementoSegmentoPorConjuntoSegmento1.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1" onClick="#{ElementoSegmentoPorConjuntoSegmento1.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{ElementoSegmentoPorConjuntoSegmento1.gestor.funcionReturnVisible}" styleClass="pdq-button-1"
                                                    text="#{ElementoSegmentoPorConjuntoSegmento1.gestor.i18n.textoBotonRetornar}" toolTip="#{ElementoSegmentoPorConjuntoSegmento1.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{ElementoSegmentoPorConjuntoSegmento1.gridPanel109}" columns="1" id="gridPanel109">
                                                <webuijsf:imageHyperlink actionExpression="#{ElementoSegmentoPorConjuntoSegmento1.imageHyperlink1_action}"
                                                    binding="#{ElementoSegmentoPorConjuntoSegmento1.imageHyperlink1}"
                                                    disabled="#{ElementoSegmentoPorConjuntoSegmento1.gestor.funcionOpenLinkInhabilitada}" id="imageHyperlink1"
                                                    imageURL="#{ElementoSegmentoPorConjuntoSegmento1.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{ElementoSegmentoPorConjuntoSegmento1.gestor.scriptAbrirVinculo}"
                                                    rendered="#{ElementoSegmentoPorConjuntoSegmento1.gestor.designing}" styleClass="pdq-hyperlink-1"
                                                    text="Hyperlink1" toolTip="#{bundle.ElementoSegmentoPorConjuntoSegmento1_imageHyperlink1_toolTip}"/>
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
                        <webuijsf:anchor binding="#{ElementoSegmentoPorConjuntoSegmento1.anclaPie1}" id="anclaPie1"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
