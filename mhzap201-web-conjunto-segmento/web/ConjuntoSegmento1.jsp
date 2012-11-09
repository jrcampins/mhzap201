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
        <webuijsf:page binding="#{ConjuntoSegmento1.page1}" id="page1">
            <webuijsf:html binding="#{ConjuntoSegmento1.html1}" id="html1">
                <webuijsf:head binding="#{ConjuntoSegmento1.head1}" id="head1" title="#{ApplicationBean1.nombreAplicacion}">
                    <webuijsf:link binding="#{ConjuntoSegmento1.link1}" id="link1" url="/resources/stylesheet.css"/>
                    <webuijsf:script binding="#{ConjuntoSegmento1.script1}" id="script1" url="/resources/javascript1.js"/>
                </webuijsf:head>
                <webuijsf:body binding="#{ConjuntoSegmento1.body1}" id="body1" onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}" onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}" styleClass="pdq-body-1">
                    <webuijsf:form binding="#{ConjuntoSegmento1.form1}" id="form1" virtualFormsConfig="virtualForm1 | checkbox1 campoIdConjuntoSegmento1 campoCodigoConjuntoSegmento1 campoNombreConjuntoSegmento1 campoDescripcionConjuntoSegmento1 campoIdClaseRecurso1 textoFilasPorPagina1 listaFuncionEdicion1 | , virtualForm2 | textoFilasPorPagina1 | botonRepaginar1 , virtualForm3 | checkbox1 listaFuncionEdicion1 | listaFuncionEdicion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonEscogerFila1 botonDetallarFila1 botonRetornarFila1 botonRefrescar1 botonAgregar1 botonDescartar1 botonRetornar1">
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
                                    <webuijsf:breadcrumbs binding="#{ConjuntoSegmento1.breadcrumbs1}" id="breadcrumbs1" styleClass="pdq-breadcrumbs-1"/>
                                </div>
                                <div class="pdq-div-filtro-1">
                                    <jsp:directive.include file="FragmentoFiltro.jspf"/>
                                </div>
                                <div class="pos-div-detalle">
                                    <h:panelGrid binding="#{ConjuntoSegmento1.gridPanel101}" id="gridPanel101">
                                        <h:panelGrid binding="#{ConjuntoSegmento1.gridPanel102}" id="gridPanel102">
                                            <h:panelGrid binding="#{ConjuntoSegmento1.gridPanel103}" columns="2" id="gridPanel103">
                                                <webuijsf:image binding="#{ConjuntoSegmento1.imagenMensaje1}" id="imagenMensaje1" url="#{ConjuntoSegmento1.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink align="middle" binding="#{ConjuntoSegmento1.hipervinculoMensaje1}"
                                                    id="hipervinculoMensaje1" text="#{ConjuntoSegmento1.gestor.mensaje}" url="#{ConjuntoSegmento1.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:table binding="#{ConjuntoSegmento1.table1}" clearSortButton="true" deselectMultipleButton="true" id="table1"
                                            paginateButton="false" paginationControls="true" selectMultipleButton="true" sortPanelToggleButton="true">
                                            <webuijsf:tableRowGroup binding="#{ConjuntoSegmento1.tableRowGroup1}" id="tableRowGroup1" rows="1"
                                                selected="#{ConjuntoSegmento1.gestor.filaEscogida}"
                                                sourceData="#{ConjuntoSegmento1.conjuntoSegmentoDataProvider}" sourceVar="currentRow">
                                                <webuijsf:tableColumn align="center" binding="#{ConjuntoSegmento1.tableRowGroup1SelectionColumn}"
                                                    id="tableRowGroup1SelectionColumn"
                                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);" selectId="checkbox1">
                                                    <webuijsf:checkbox binding="#{ConjuntoSegmento1.checkbox1}" id="checkbox1"
                                                        onClick="#{ConjuntoSegmento1.gestor.scriptElegir}" selected="#{ConjuntoSegmento1.gestor.filaElegida}" toolTip="#{ConjuntoSegmento1.gestor.i18n.toolTipCheckboxSeleccionMultiple}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn align="center" binding="#{ConjuntoSegmento1.tableColumn1}" id="tableColumn1">
                                                    <webuijsf:button actionExpression="#{ConjuntoSegmento1.botonEscogerFila1_action}"
                                                        binding="#{ConjuntoSegmento1.botonEscogerFila1}"
                                                        disabled="#{ConjuntoSegmento1.gestor.funcionPickItemInhabilitada}" id="botonEscogerFila1"
                                                        imageURL="#{ConjuntoSegmento1.gestor.urlImagenEscoger}"
                                                        onClick="#{ConjuntoSegmento1.gestor.scriptEscoger}"
                                                        text="#{ConjuntoSegmento1.gestor.i18n.textoBotonEscogerFila}" toolTip="#{ConjuntoSegmento1.gestor.i18n.toolTipBotonEscogerFila}"/>
                                                    <webuijsf:button actionExpression="#{ConjuntoSegmento1.botonDetallarFila1_action}"
                                                        binding="#{ConjuntoSegmento1.botonDetallarFila1}"
                                                        disabled="#{ConjuntoSegmento1.gestor.funcionPickItemInhabilitada}" id="botonDetallarFila1"
                                                        imageURL="#{ConjuntoSegmento1.gestor.urlImagenDetallar}"
                                                        onClick="#{ConjuntoSegmento1.scriptAbrirVentanaVerDetalle}"
                                                        rendered="#{ConjuntoSegmento1.gestor.detalleDisponible}"
                                                        text="#{ConjuntoSegmento1.gestor.i18n.textoBotonDetallarFila}" toolTip="#{ConjuntoSegmento1.gestor.i18n.toolTipBotonDetallarFila}"/>
                                                    <webuijsf:button actionExpression="#{ConjuntoSegmento1.botonRetornarFila1_action}"
                                                        binding="#{ConjuntoSegmento1.botonRetornarFila1}"
                                                        disabled="#{ConjuntoSegmento1.gestor.funcionReturnInhabilitada}" id="botonRetornarFila1"
                                                        imageURL="#{ConjuntoSegmento1.gestor.urlImagenRetornar}"
                                                        onClick="#{ConjuntoSegmento1.gestor.scriptRetornarRecursoActual}"
                                                        rendered="#{ConjuntoSegmento1.gestor.funcionReturnVisible}"
                                                        text="#{ConjuntoSegmento1.gestor.i18n.textoBotonRetornarFila}" toolTip="#{ConjuntoSegmento1.gestor.i18n.toolTipBotonRetornarFila}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn binding="#{ConjuntoSegmento1.tableColumn2}" id="tableColumn2" rendered="#{ConjuntoSegmento1.gestor.designing}">
                                                    <webuijsf:imageHyperlink actionExpression="#{ConjuntoSegmento1.hipervinculoAccionFila1_action}"
                                                        binding="#{ConjuntoSegmento1.hipervinculoAccionFila1}"
                                                        disabled="#{ConjuntoSegmento1.gestor.loteConCambios}" id="hipervinculoAccionFila1" text="Accion1" toolTip="#{bundle.ConjuntoSegmento1_hipervinculoAccionFila1_toolTip}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn align="right" binding="#{ConjuntoSegmento1.tableColumn3}"
                                                    headerText="#{ConjuntoSegmento1.gestor.i18n.textoEtiquetaIdentificacionFila}" id="tableColumn3" toolTip="#{ConjuntoSegmento1.gestor.i18n.toolTipEtiquetaIdentificacionFila}">
                                                    <webuijsf:imageHyperlink actionExpression="#{ConjuntoSegmento1.hipervinculoDetallarFila1_action}"
                                                        binding="#{ConjuntoSegmento1.hipervinculoDetallarFila1}" id="hipervinculoDetallarFila1"
                                                        imageURL="#{ConjuntoSegmento1.gestor.urlImagenFilaProcesada}"
                                                        text="#{ConjuntoSegmento1.gestor.identificacionFila}" textPosition="left" toolTip="#{ConjuntoSegmento1.gestor.toolTipImagenFilaProcesada}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn binding="#{ConjuntoSegmento1.tableColumnIdConjuntoSegmento1}" headerText="id"
                                                    id="tableColumnIdConjuntoSegmento1" rendered="false" sort="id_conjunto_segmento">
                                                    <webuijsf:staticText binding="#{ConjuntoSegmento1.hiddenStaticTextIdConjuntoSegmento1}"
                                                        id="hiddenStaticTextIdConjuntoSegmento1" rendered="#{ConjuntoSegmento1.gestor.designing}" text="#{currentRow.value['id_conjunto_segmento']}"/>
                                                    <webuijsf:label binding="#{ConjuntoSegmento1.labelIdConjuntoSegmento1}" for="campoIdConjuntoSegmento1" id="labelIdConjuntoSegmento1"/>
                                                    <webuijsf:textField binding="#{ConjuntoSegmento1.campoIdConjuntoSegmento1}"
                                                        converter="#{ConjuntoSegmento1.converterIdConjuntoSegmento1}" id="campoIdConjuntoSegmento1"
                                                        readOnly="#{ConjuntoSegmento1.gestor.filaNoProcesada}"
                                                        text="#{currentRow.value['id_conjunto_segmento']}" validatorExpression="#{ConjuntoSegmento1.validatorIdConjuntoSegmento1.validate}"/>
                                                    <webuijsf:staticText binding="#{ConjuntoSegmento1.campoIdConjuntoSegmento1Texto1}" id="campoIdConjuntoSegmento1Texto1"/>
                                                    <webuijsf:message binding="#{ConjuntoSegmento1.messageIdConjuntoSegmento1}" for="campoIdConjuntoSegmento1" id="messageIdConjuntoSegmento1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn binding="#{ConjuntoSegmento1.tableColumnCodigoConjuntoSegmento1}" headerText="codigo"
                                                    id="tableColumnCodigoConjuntoSegmento1" sort="codigo_conjunto_segmento">
                                                    <webuijsf:staticText binding="#{ConjuntoSegmento1.hiddenStaticTextCodigoConjuntoSegmento1}"
                                                        id="hiddenStaticTextCodigoConjuntoSegmento1" rendered="#{ConjuntoSegmento1.gestor.designing}" text="#{currentRow.value['codigo_conjunto_segmento']}"/>
                                                    <webuijsf:label binding="#{ConjuntoSegmento1.labelCodigoConjuntoSegmento1}"
                                                        for="campoCodigoConjuntoSegmento1" id="labelCodigoConjuntoSegmento1"/>
                                                    <webuijsf:textField binding="#{ConjuntoSegmento1.campoCodigoConjuntoSegmento1}" columns="20"
                                                        id="campoCodigoConjuntoSegmento1" maxLength="30" readOnly="#{ConjuntoSegmento1.gestor.filaNoProcesada}"
                                                        required="true" text="#{currentRow.value['codigo_conjunto_segmento']}" validatorExpression="#{ConjuntoSegmento1.validatorCodigoConjuntoSegmento1.validate}"/>
                                                    <webuijsf:staticText binding="#{ConjuntoSegmento1.campoCodigoConjuntoSegmento1Texto1}" id="campoCodigoConjuntoSegmento1Texto1"/>
                                                    <webuijsf:message binding="#{ConjuntoSegmento1.messageCodigoConjuntoSegmento1}"
                                                        for="campoCodigoConjuntoSegmento1" id="messageCodigoConjuntoSegmento1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn binding="#{ConjuntoSegmento1.tableColumnNombreConjuntoSegmento1}" headerText="nombre"
                                                    id="tableColumnNombreConjuntoSegmento1" sort="nombre_conjunto_segmento">
                                                    <webuijsf:staticText binding="#{ConjuntoSegmento1.hiddenStaticTextNombreConjuntoSegmento1}"
                                                        id="hiddenStaticTextNombreConjuntoSegmento1" rendered="#{ConjuntoSegmento1.gestor.designing}" text="#{currentRow.value['nombre_conjunto_segmento']}"/>
                                                    <webuijsf:label binding="#{ConjuntoSegmento1.labelNombreConjuntoSegmento1}"
                                                        for="campoNombreConjuntoSegmento1" id="labelNombreConjuntoSegmento1"/>
                                                    <webuijsf:textField binding="#{ConjuntoSegmento1.campoNombreConjuntoSegmento1}" columns="50"
                                                        id="campoNombreConjuntoSegmento1" maxLength="100" readOnly="#{ConjuntoSegmento1.gestor.filaNoProcesada}"
                                                        text="#{currentRow.value['nombre_conjunto_segmento']}" validatorExpression="#{ConjuntoSegmento1.validatorNombreConjuntoSegmento1.validate}"/>
                                                    <webuijsf:staticText binding="#{ConjuntoSegmento1.campoNombreConjuntoSegmento1Texto1}" id="campoNombreConjuntoSegmento1Texto1"/>
                                                    <webuijsf:message binding="#{ConjuntoSegmento1.messageNombreConjuntoSegmento1}"
                                                        for="campoNombreConjuntoSegmento1" id="messageNombreConjuntoSegmento1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn binding="#{ConjuntoSegmento1.tableColumnDescripcionConjuntoSegmento1}"
                                                    headerText="descripcion" id="tableColumnDescripcionConjuntoSegmento1" rendered="false" sort="descripcion_conjunto_segmento">
                                                    <webuijsf:staticText binding="#{ConjuntoSegmento1.hiddenStaticTextDescripcionConjuntoSegmento1}"
                                                        id="hiddenStaticTextDescripcionConjuntoSegmento1" rendered="#{ConjuntoSegmento1.gestor.designing}" text="#{currentRow.value['descripcion_conjunto_segmento']}"/>
                                                    <webuijsf:label binding="#{ConjuntoSegmento1.labelDescripcionConjuntoSegmento1}"
                                                        for="campoDescripcionConjuntoSegmento1" id="labelDescripcionConjuntoSegmento1"/>
                                                    <webuijsf:textArea binding="#{ConjuntoSegmento1.campoDescripcionConjuntoSegmento1}" columns="100"
                                                        id="campoDescripcionConjuntoSegmento1" readOnly="#{ConjuntoSegmento1.gestor.filaNoProcesada}" rows="3"
                                                        text="#{currentRow.value['descripcion_conjunto_segmento']}" validatorExpression="#{ConjuntoSegmento1.validatorDescripcionConjuntoSegmento1.validate}"/>
                                                    <webuijsf:staticText binding="#{ConjuntoSegmento1.campoDescripcionConjuntoSegmento1Texto1}" id="campoDescripcionConjuntoSegmento1Texto1"/>
                                                    <webuijsf:message binding="#{ConjuntoSegmento1.messageDescripcionConjuntoSegmento1}"
                                                        for="campoDescripcionConjuntoSegmento1" id="messageDescripcionConjuntoSegmento1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn binding="#{ConjuntoSegmento1.tableColumnIdClaseRecurso1}" headerText="clase recurso"
                                                    id="tableColumnIdClaseRecurso1" sort="codigo_clase_recurso_1x1y3">
                                                    <webuijsf:staticText binding="#{ConjuntoSegmento1.hiddenStaticTextIdClaseRecurso1}"
                                                        id="hiddenStaticTextIdClaseRecurso1" rendered="#{ConjuntoSegmento1.gestor.designing}" text="#{currentRow.value['codigo_clase_recurso_1x1y3']}"/>
                                                    <webuijsf:label binding="#{ConjuntoSegmento1.labelIdClaseRecurso1}" for="campoIdClaseRecurso1" id="labelIdClaseRecurso1"/>
                                                    <webuijsf:textField binding="#{ConjuntoSegmento1.campoIdClaseRecurso1}" id="campoIdClaseRecurso1"
                                                        readOnly="#{ConjuntoSegmento1.gestor.filaNoCreada}" required="true"
                                                        text="#{ConjuntoSegmento1.asistente.textoCampoIdClaseRecurso1}"
                                                        toolTip="#{ConjuntoSegmento1.asistente.toolTipCampoIdClaseRecurso1}" validatorExpression="#{ConjuntoSegmento1.campoIdClaseRecurso1_validate}"/>
                                                    <webuijsf:staticText binding="#{ConjuntoSegmento1.campoIdClaseRecurso1Texto1}" id="campoIdClaseRecurso1Texto1" text="#{currentRow.value['codigo_clase_recurso_1x1y3']}"/>
                                                    <webuijsf:button binding="#{ConjuntoSegmento1.campoIdClaseRecurso1Boton1}" id="campoIdClaseRecurso1Boton1" onClick="#{ConjuntoSegmento1.asistente.scriptCampoIdClaseRecurso1Boton1}"/>
                                                    <webuijsf:message binding="#{ConjuntoSegmento1.messageIdClaseRecurso1}" for="campoIdClaseRecurso1" id="messageIdClaseRecurso1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn binding="#{ConjuntoSegmento1.tableColumnIdClaseRecurso2}"
                                                    headerText="nombre clase recurso" id="tableColumnIdClaseRecurso2" sort="nombre_clase_recurso_1x1y4" styleClass="pdq-estilo-id-2">
                                                    <webuijsf:staticText binding="#{ConjuntoSegmento1.hiddenStaticTextIdClaseRecurso1}"
                                                        id="hiddenStaticTextIdClaseRecurso2" rendered="#{ConjuntoSegmento1.gestor.designing}" text="#{currentRow.value['nombre_clase_recurso_1x1y4']}"/>
                                                    <webuijsf:label binding="#{ConjuntoSegmento1.labelIdClaseRecurso2}" id="labelIdClaseRecurso2" text=""/>
                                                    <webuijsf:imageHyperlink binding="#{ConjuntoSegmento1.campoIdClaseRecurso1Hiper2}" text="#{currentRow.value['nombre_clase_recurso_1x1y4']}"
                                                        id="campoIdClaseRecurso1Hiper2" onClick="#{ConjuntoSegmento1.asistente.scriptCampoIdClaseRecurso1Boton2}"/>
                                                </webuijsf:tableColumn>
                                            </webuijsf:tableRowGroup>
                                        </webuijsf:table>
                                        <h:panelGrid binding="#{ConjuntoSegmento1.gridPanel104}" id="gridPanel104">
                                            <h:panelGrid binding="#{ConjuntoSegmento1.gridPanel105}" columns="2" id="gridPanel105">
                                                <h:panelGrid binding="#{ConjuntoSegmento1.gridPanel106}" id="gridPanel106">
                                                    <webuijsf:label binding="#{ConjuntoSegmento1.etiquetaTextoFilasPorPagina1}" for="textoFilasPorPagina1"
                                                        id="etiquetaTextoFilasPorPagina1" text="#{ConjuntoSegmento1.gestor.i18n.textoEtiquetaTextoFilasPorPagina}"/>
                                                </h:panelGrid>
                                                <h:panelGrid binding="#{ConjuntoSegmento1.gridPanel107}" columns="3" id="gridPanel107">
                                                    <webuijsf:textField binding="#{ConjuntoSegmento1.textoFilasPorPagina1}" columns="2"
                                                        converter="#{ConjuntoSegmento1.textoFilasPorPagina1Converter1}"
                                                        disabled="#{ConjuntoSegmento1.gestor.paginacionInhabilitada}" id="textoFilasPorPagina1" maxLength="2"
                                                        text="#{ConjuntoSegmento1.gestor.filasPorPagina}" validatorExpression="#{ConjuntoSegmento1.textoFilasPorPagina1Validator1.validate}"/>
                                                    <webuijsf:button actionExpression="#{ConjuntoSegmento1.botonRepaginar1_action}"
                                                        binding="#{ConjuntoSegmento1.botonRepaginar1}" id="botonRepaginar1"
                                                        imageURL="#{ConjuntoSegmento1.gestor.urlImagenRepaginar}"
                                                        onClick="#{ConjuntoSegmento1.gestor.scriptRepaginar}"
                                                        text="#{ConjuntoSegmento1.gestor.i18n.textoBotonRepaginar}" toolTip="#{ConjuntoSegmento1.gestor.i18n.toolTipBotonRepaginar}"/>
                                                    <webuijsf:message binding="#{ConjuntoSegmento1.messageFilasPorPagina1}" for="textoFilasPorPagina1" id="messageFilasPorPagina1"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{ConjuntoSegmento1.gridPanel108}" columns="10" id="gridPanel108">
                                                <webuijsf:button actionExpression="#{ConjuntoSegmento1.botonAgregar1_action}"
                                                    binding="#{ConjuntoSegmento1.botonAgregar1}"
                                                    disabled="#{ConjuntoSegmento1.gestor.funcionInsertInhabilitada}" id="botonAgregar1"
                                                    onClick="#{ConjuntoSegmento1.gestor.scriptAgregar}"
                                                    rendered="#{ConjuntoSegmento1.gestor.funcionInsertHabilitada}" styleClass="pdq-button-1"
                                                    text="#{ConjuntoSegmento1.gestor.i18n.textoBotonAgregar}" toolTip="#{ConjuntoSegmento1.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown binding="#{ConjuntoSegmento1.listaFuncionEdicion1}"
                                                    converter="#{ConjuntoSegmento1.converterListaFuncionEdicion1}"
                                                    disabled="#{ConjuntoSegmento1.gestor.loteConCambios}" id="listaFuncionEdicion1"
                                                    items="#{ConjuntoSegmento1.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{ConjuntoSegmento1.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{ConjuntoSegmento1.gestor.funcionEdicionSeleccionada}" toolTip="#{ConjuntoSegmento1.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button actionExpression="#{ConjuntoSegmento1.botonEditar1_action}"
                                                    binding="#{ConjuntoSegmento1.botonEditar1}" disabled="#{ConjuntoSegmento1.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1" onClick="#{ConjuntoSegmento1.gestor.scriptEditar}"
                                                    rendered="#{ConjuntoSegmento1.gestor.funcionUpdateHabilitada}" styleClass="pdq-button-1"
                                                    text="#{ConjuntoSegmento1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}" toolTip="#{ConjuntoSegmento1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button actionExpression="#{ConjuntoSegmento1.botonEliminar1_action}"
                                                    binding="#{ConjuntoSegmento1.botonEliminar1}"
                                                    disabled="#{ConjuntoSegmento1.gestor.funcionDeleteInhabilitada}" id="botonEliminar1"
                                                    onClick="#{ConjuntoSegmento1.gestor.scriptEliminar}"
                                                    rendered="#{ConjuntoSegmento1.gestor.funcionDeleteHabilitada}" styleClass="pdq-button-1"
                                                    text="#{ConjuntoSegmento1.gestor.i18n.textoBotonEliminar}" toolTip="#{ConjuntoSegmento1.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button actionExpression="#{ConjuntoSegmento1.botonAplicar1_action}"
                                                    binding="#{ConjuntoSegmento1.botonAplicar1}" id="botonAplicar1"
                                                    onClick="#{ConjuntoSegmento1.gestor.scriptAplicar}"
                                                    rendered="#{ConjuntoSegmento1.gestor.funcionCheckChangesHabilitada}" styleClass="pdq-button-1"
                                                    text="#{ConjuntoSegmento1.gestor.i18n.textoBotonAplicar}" toolTip="#{ConjuntoSegmento1.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button actionExpression="#{ConjuntoSegmento1.botonDeshacer1_action}"
                                                    binding="#{ConjuntoSegmento1.botonDeshacer1}" id="botonDeshacer1"
                                                    onClick="#{ConjuntoSegmento1.gestor.scriptDeshacer}"
                                                    rendered="#{ConjuntoSegmento1.gestor.funcionCancelUpdateHabilitada}" styleClass="pdq-button-1"
                                                    text="#{ConjuntoSegmento1.gestor.i18n.textoBotonDeshacer}" toolTip="#{ConjuntoSegmento1.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button actionExpression="#{ConjuntoSegmento1.botonConfirmar1_action}"
                                                    binding="#{ConjuntoSegmento1.botonConfirmar1}" id="botonConfirmar1"
                                                    onClick="#{ConjuntoSegmento1.gestor.scriptConfirmar}"
                                                    rendered="#{ConjuntoSegmento1.gestor.funcionCommitHabilitada}" styleClass="pdq-button-1"
                                                    text="#{ConjuntoSegmento1.gestor.i18n.textoBotonConfirmar}" toolTip="#{ConjuntoSegmento1.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button actionExpression="#{ConjuntoSegmento1.botonDescartar1_action}"
                                                    binding="#{ConjuntoSegmento1.botonDescartar1}" id="botonDescartar1"
                                                    onClick="#{ConjuntoSegmento1.gestor.scriptDescartar}"
                                                    rendered="#{ConjuntoSegmento1.gestor.funcionRevertHabilitada}" styleClass="pdq-button-1"
                                                    text="#{ConjuntoSegmento1.gestor.i18n.textoBotonDescartar}" toolTip="#{ConjuntoSegmento1.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:button actionExpression="#{ConjuntoSegmento1.botonRefrescar1_action}"
                                                    binding="#{ConjuntoSegmento1.botonRefrescar1}"
                                                    disabled="#{ConjuntoSegmento1.gestor.funcionSelectInhabilitada}" id="botonRefrescar1"
                                                    onClick="#{ConjuntoSegmento1.gestor.scriptRefrescar}"
                                                    rendered="#{ConjuntoSegmento1.gestor.funcionSelectHabilitada}" styleClass="pdq-button-1"
                                                    text="#{ConjuntoSegmento1.gestor.i18n.textoBotonRefrescar}" toolTip="#{ConjuntoSegmento1.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button actionExpression="#{ConjuntoSegmento1.botonRetornar1_action}"
                                                    binding="#{ConjuntoSegmento1.botonRetornar1}"
                                                    disabled="#{ConjuntoSegmento1.gestor.funcionReturnFilaEscogidaInhabilitada}" id="botonRetornar1"
                                                    onClick="#{ConjuntoSegmento1.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{ConjuntoSegmento1.gestor.funcionReturnVisible}" styleClass="pdq-button-1"
                                                    text="#{ConjuntoSegmento1.gestor.i18n.textoBotonRetornar}" toolTip="#{ConjuntoSegmento1.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{ConjuntoSegmento1.gridPanel109}" columns="2" id="gridPanel109">
                                                <webuijsf:imageHyperlink actionExpression="#{ConjuntoSegmento1.imageHyperlink1_action}"
                                                    binding="#{ConjuntoSegmento1.imageHyperlink1}"
                                                    disabled="#{ConjuntoSegmento1.gestor.funcionOpenLinkInhabilitada}" id="imageHyperlink1"
                                                    imageURL="#{ConjuntoSegmento1.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{ConjuntoSegmento1.gestor.scriptAbrirVinculo}" styleClass="pdq-hyperlink-1" text="Hyperlink1" toolTip="#{bundle.ConjuntoSegmento1_imageHyperlink1_toolTip}"/>
                                                <webuijsf:imageHyperlink actionExpression="#{ConjuntoSegmento1.imageHyperlink2_action}"
                                                    binding="#{ConjuntoSegmento1.imageHyperlink2}"
                                                    disabled="#{ConjuntoSegmento1.gestor.funcionOpenLinkInhabilitada}" id="imageHyperlink2"
                                                    imageURL="#{ConjuntoSegmento1.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{ConjuntoSegmento1.gestor.scriptAbrirVinculo}" rendered="#{ConjuntoSegmento1.gestor.designing}"
                                                    styleClass="pdq-hyperlink-1" text="Hyperlink2" toolTip="#{bundle.ConjuntoSegmento1_imageHyperlink2_toolTip}"/>
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
                        <webuijsf:anchor binding="#{ConjuntoSegmento1.anclaPie1}" id="anclaPie1"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
