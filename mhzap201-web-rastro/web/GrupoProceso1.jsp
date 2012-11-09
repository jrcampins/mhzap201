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
        <webuijsf:page id="page1">
            <webuijsf:html id="html1">
                <webuijsf:head id="head1" title="#{ApplicationBean1.nombreAplicacion}">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                    <webuijsf:script id="script1" url="/resources/javascript1.js"/>
                </webuijsf:head>
                <webuijsf:body id="body1" onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}" onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}" styleClass="pdq-body-1">
                    <webuijsf:form binding="#{GrupoProceso1.form1}" id="form1" virtualFormsConfig="virtualForm1 | checkbox1 campoIdGrupoProceso1 campoCodigoGrupoProceso1 campoNombreGrupoProceso1 campoDescripcionGrupoProceso1 campoIdRastroProceso1 listaNumeroCondicionEjeFun1 textoFilasPorPagina1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | textoFilasPorPagina1 | botonRepaginar1 , virtualForm3 | checkbox1 listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonEscogerFila1 botonDetallarFila1 botonProcesarFila1 botonRetornarFila1 botonRefrescar1 botonAgregar1 botonDescartar1 botonRetornar1">
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
                                    <webuijsf:breadcrumbs binding="#{GrupoProceso1.breadcrumbs1}" id="breadcrumbs1" styleClass="pdq-breadcrumbs-1"/>
                                </div>
                                <div class="pdq-div-filtro-1">
                                    <jsp:directive.include file="FragmentoFiltro.jspf"/>
                                </div>
                                <div class="pos-div-detalle">
                                    <h:panelGrid id="gridPanel101">
                                        <h:panelGrid id="gridPanel102">
                                            <h:panelGrid columns="2" id="gridPanel103">
                                                <webuijsf:image id="imagenMensaje1" url="#{GrupoProceso1.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink align="middle" id="hipervinculoMensaje1" text="#{GrupoProceso1.gestor.mensaje}" url="#{GrupoProceso1.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:table binding="#{GrupoProceso1.table1}" clearSortButton="true" deselectMultipleButton="true" id="table1"
                                            paginateButton="false" paginationControls="true" selectMultipleButton="true" sortPanelToggleButton="true">
                                            <webuijsf:tableRowGroup binding="#{GrupoProceso1.tableRowGroup1}" id="tableRowGroup1" rows="1"
                                                selected="#{GrupoProceso1.gestor.filaEscogida}" sourceData="#{GrupoProceso1.grupoProcesoDataProvider}" sourceVar="currentRow">
                                                <webuijsf:tableColumn align="center" id="tableRowGroup1SelectionColumn"
                                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);" selectId="checkbox1">
                                                    <webuijsf:checkbox binding="#{GrupoProceso1.checkbox1}" id="checkbox1"
                                                        onClick="#{GrupoProceso1.gestor.scriptElegir}" selected="#{GrupoProceso1.gestor.filaElegida}" toolTip="#{GrupoProceso1.gestor.i18n.toolTipCheckboxSeleccionMultiple}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn align="center" binding="#{GrupoProceso1.tableColumn1}" id="tableColumn1">
                                                    <webuijsf:button actionExpression="#{GrupoProceso1.botonEscogerFila1_action}"
                                                        binding="#{GrupoProceso1.botonEscogerFila1}"
                                                        disabled="#{GrupoProceso1.gestor.funcionPickItemInhabilitada}" id="botonEscogerFila1"
                                                        imageURL="#{GrupoProceso1.gestor.urlImagenEscoger}" onClick="#{GrupoProceso1.gestor.scriptEscoger}"
                                                        text="#{GrupoProceso1.gestor.i18n.textoBotonEscogerFila}" toolTip="#{GrupoProceso1.gestor.i18n.toolTipBotonEscogerFila}"/>
                                                    <webuijsf:button actionExpression="#{GrupoProceso1.botonDetallarFila1_action}"
                                                        binding="#{GrupoProceso1.botonDetallarFila1}"
                                                        disabled="#{GrupoProceso1.gestor.funcionPickItemInhabilitada}" id="botonDetallarFila1"
                                                        imageURL="#{GrupoProceso1.gestor.urlImagenDetallar}"
                                                        onClick="#{GrupoProceso1.scriptAbrirVentanaVerDetalle}"
                                                        rendered="#{GrupoProceso1.gestor.detalleDisponible}"
                                                        text="#{GrupoProceso1.gestor.i18n.textoBotonDetallarFila}" toolTip="#{GrupoProceso1.gestor.i18n.toolTipBotonDetallarFila}"/>
                                                    <webuijsf:button actionExpression="#{GrupoProceso1.botonProcesarFila1_action}"
                                                        binding="#{GrupoProceso1.botonProcesarFila1}"
                                                        disabled="#{GrupoProceso1.gestor.funcionPickItemInhabilitada}" id="botonProcesarFila1"
                                                        imageURL="#{GrupoProceso1.gestor.urlImagenProcesar}"
                                                        onClick="#{GrupoProceso1.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{GrupoProceso1.asistente.comandoDisponible}"
                                                        text="#{GrupoProceso1.gestor.i18n.textoBotonProcesarFila}" toolTip="#{GrupoProceso1.gestor.i18n.toolTipBotonProcesarFila}"/>
                                                    <webuijsf:button actionExpression="#{GrupoProceso1.botonRetornarFila1_action}"
                                                        binding="#{GrupoProceso1.botonRetornarFila1}"
                                                        disabled="#{GrupoProceso1.gestor.funcionReturnInhabilitada}" id="botonRetornarFila1"
                                                        imageURL="#{GrupoProceso1.gestor.urlImagenRetornar}"
                                                        onClick="#{GrupoProceso1.gestor.scriptRetornarRecursoActual}"
                                                        rendered="#{GrupoProceso1.gestor.funcionReturnVisible}"
                                                        text="#{GrupoProceso1.gestor.i18n.textoBotonRetornarFila}" toolTip="#{GrupoProceso1.gestor.i18n.toolTipBotonRetornarFila}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn binding="#{GrupoProceso1.tableColumn2}" id="tableColumn2" rendered="#{GrupoProceso1.gestor.designing}">
                                                    <webuijsf:imageHyperlink actionExpression="#{GrupoProceso1.hipervinculoAccionFila1_action}"
                                                        binding="#{GrupoProceso1.hipervinculoAccionFila1}" disabled="#{GrupoProceso1.gestor.loteConCambios}"
                                                        id="hipervinculoAccionFila1" imageURL="#{GrupoProceso1.gestor.urlImagenEjecutarVinculo}"
                                                        onClick="#{GrupoProceso1.scriptAbrirVentanaAccionFila1}" text="Accion1" toolTip="#{bundle.GrupoProceso1_hipervinculoAccionFila1_toolTip}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn align="right" binding="#{GrupoProceso1.tableColumn3}"
                                                    headerText="#{GrupoProceso1.gestor.i18n.textoEtiquetaIdentificacionFila}" id="tableColumn3" toolTip="#{GrupoProceso1.gestor.i18n.toolTipEtiquetaIdentificacionFila}">
                                                    <webuijsf:imageHyperlink actionExpression="#{GrupoProceso1.hipervinculoDetallarFila1_action}"
                                                        binding="#{GrupoProceso1.hipervinculoDetallarFila1}" id="hipervinculoDetallarFila1"
                                                        imageURL="#{GrupoProceso1.gestor.urlImagenFilaProcesada}"
                                                        text="#{GrupoProceso1.gestor.identificacionFila}" textPosition="left" toolTip="#{GrupoProceso1.gestor.toolTipImagenFilaProcesada}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn binding="#{GrupoProceso1.tableColumnIdGrupoProceso1}" headerText="id"
                                                    id="tableColumnIdGrupoProceso1" sort="id_grupo_proceso">
                                                    <webuijsf:staticText id="hiddenStaticTextIdGrupoProceso1" rendered="#{GrupoProceso1.gestor.designing}" text="#{currentRow.value['id_grupo_proceso']}"/>
                                                    <webuijsf:label binding="#{GrupoProceso1.labelIdGrupoProceso1}" for="campoIdGrupoProceso1" id="labelIdGrupoProceso1"/>
                                                    <webuijsf:textField binding="#{GrupoProceso1.campoIdGrupoProceso1}"
                                                        converter="#{GrupoProceso1.converterIdGrupoProceso1}" id="campoIdGrupoProceso1"
                                                        readOnly="#{GrupoProceso1.gestor.filaNoProcesada}" text="#{currentRow.value['id_grupo_proceso']}" validatorExpression="#{GrupoProceso1.validatorIdGrupoProceso1.validate}"/>
                                                    <webuijsf:staticText binding="#{GrupoProceso1.campoIdGrupoProceso1Texto1}" id="campoIdGrupoProceso1Texto1"/>
                                                    <webuijsf:message for="campoIdGrupoProceso1" id="messageIdGrupoProceso1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn binding="#{GrupoProceso1.tableColumnCodigoGrupoProceso1}" headerText="codigo"
                                                    id="tableColumnCodigoGrupoProceso1" sort="codigo_grupo_proceso">
                                                    <webuijsf:staticText id="hiddenStaticTextCodigoGrupoProceso1" rendered="#{GrupoProceso1.gestor.designing}" text="#{currentRow.value['codigo_grupo_proceso']}"/>
                                                    <webuijsf:label binding="#{GrupoProceso1.labelCodigoGrupoProceso1}" for="campoCodigoGrupoProceso1" id="labelCodigoGrupoProceso1"/>
                                                    <webuijsf:textField binding="#{GrupoProceso1.campoCodigoGrupoProceso1}" columns="20"
                                                        id="campoCodigoGrupoProceso1" maxLength="30" readOnly="#{GrupoProceso1.gestor.filaNoProcesada}"
                                                        required="true" text="#{currentRow.value['codigo_grupo_proceso']}" validatorExpression="#{GrupoProceso1.validatorCodigoGrupoProceso1.validate}"/>
                                                    <webuijsf:staticText binding="#{GrupoProceso1.campoCodigoGrupoProceso1Texto1}" id="campoCodigoGrupoProceso1Texto1"/>
                                                    <webuijsf:message for="campoCodigoGrupoProceso1" id="messageCodigoGrupoProceso1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn binding="#{GrupoProceso1.tableColumnNombreGrupoProceso1}" headerText="nombre"
                                                    id="tableColumnNombreGrupoProceso1" sort="nombre_grupo_proceso">
                                                    <webuijsf:staticText id="hiddenStaticTextNombreGrupoProceso1" rendered="#{GrupoProceso1.gestor.designing}" text="#{currentRow.value['nombre_grupo_proceso']}"/>
                                                    <webuijsf:label binding="#{GrupoProceso1.labelNombreGrupoProceso1}" for="campoNombreGrupoProceso1" id="labelNombreGrupoProceso1"/>
                                                    <webuijsf:textField binding="#{GrupoProceso1.campoNombreGrupoProceso1}" columns="50"
                                                        id="campoNombreGrupoProceso1" maxLength="100" readOnly="#{GrupoProceso1.gestor.filaNoProcesada}"
                                                        text="#{currentRow.value['nombre_grupo_proceso']}" validatorExpression="#{GrupoProceso1.validatorNombreGrupoProceso1.validate}"/>
                                                    <webuijsf:staticText binding="#{GrupoProceso1.campoNombreGrupoProceso1Texto1}" id="campoNombreGrupoProceso1Texto1"/>
                                                    <webuijsf:message for="campoNombreGrupoProceso1" id="messageNombreGrupoProceso1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn binding="#{GrupoProceso1.tableColumnDescripcionGrupoProceso1}" headerText="descripcion"
                                                    id="tableColumnDescripcionGrupoProceso1" rendered="false" sort="descripcion_grupo_proceso">
                                                    <webuijsf:staticText id="hiddenStaticTextDescripcionGrupoProceso1"
                                                        rendered="#{GrupoProceso1.gestor.designing}" text="#{currentRow.value['descripcion_grupo_proceso']}"/>
                                                    <webuijsf:label binding="#{GrupoProceso1.labelDescripcionGrupoProceso1}" for="campoDescripcionGrupoProceso1" id="labelDescripcionGrupoProceso1"/>
                                                    <webuijsf:textArea binding="#{GrupoProceso1.campoDescripcionGrupoProceso1}" columns="50"
                                                        id="campoDescripcionGrupoProceso1" readOnly="#{GrupoProceso1.gestor.filaNoProcesada}" rows="3"
                                                        text="#{currentRow.value['descripcion_grupo_proceso']}" validatorExpression="#{GrupoProceso1.validatorDescripcionGrupoProceso1.validate}"/>
                                                    <webuijsf:staticText binding="#{GrupoProceso1.campoDescripcionGrupoProceso1Texto1}" id="campoDescripcionGrupoProceso1Texto1"/>
                                                    <webuijsf:message for="campoDescripcionGrupoProceso1" id="messageDescripcionGrupoProceso1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn binding="#{GrupoProceso1.tableColumnIdRastroProceso1}" headerText="ejecución"
                                                    id="tableColumnIdRastroProceso1" sort="id_rastro_proceso">
                                                    <webuijsf:staticText id="hiddenStaticTextIdRastroProceso1" rendered="#{GrupoProceso1.gestor.designing}" text="#{currentRow.value['id_rastro_proceso']}"/>
                                                    <webuijsf:label binding="#{GrupoProceso1.labelIdRastroProceso1}" for="campoIdRastroProceso1" id="labelIdRastroProceso1"/>
                                                    <webuijsf:textField binding="#{GrupoProceso1.campoIdRastroProceso1}"
                                                        converter="#{GrupoProceso1.converterIdRastroProceso1}" id="campoIdRastroProceso1"
                                                        readOnly="#{GrupoProceso1.gestor.filaNoProcesada}" text="#{currentRow.value['id_rastro_proceso']}" validatorExpression="#{GrupoProceso1.validatorIdRastroProceso1.validate}"/>
                                                    <webuijsf:staticText binding="#{GrupoProceso1.campoIdRastroProceso1Texto1}" id="campoIdRastroProceso1Texto1"/>
                                                    <webuijsf:message for="campoIdRastroProceso1" id="messageIdRastroProceso1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn binding="#{GrupoProceso1.tableColumnNumeroCondicionEjeFun1}"
                                                    headerText="condición" id="tableColumnNumeroCondicionEjeFun1" sort="codigo_condicion_eje_fun_1x1y2">
                                                    <webuijsf:staticText id="hiddenStaticTextNumeroCondicionEjeFun1"
                                                        rendered="#{GrupoProceso1.gestor.designing}" text="#{currentRow.value['codigo_condicion_eje_fun_1x1y2']}"/>
                                                    <webuijsf:label binding="#{GrupoProceso1.labelNumeroCondicionEjeFun1}"
                                                        for="listaNumeroCondicionEjeFun1" id="labelNumeroCondicionEjeFun1"/>
                                                    <webuijsf:dropDown binding="#{GrupoProceso1.listaNumeroCondicionEjeFun1}"
                                                        converter="#{GrupoProceso1.converterNumeroCondicionEjeFun1}"
                                                        disabled="#{GrupoProceso1.gestor.filaNoProcesada}" id="listaNumeroCondicionEjeFun1"
                                                        items="#{GrupoProceso1.asistente.opcionesListaNumeroCondicionEjeFun1}" selected="#{currentRow.value['numero_condicion_eje_fun']}"/>
                                                    <webuijsf:staticText binding="#{GrupoProceso1.listaNumeroCondicionEjeFun1Texto1}"
                                                        id="listaNumeroCondicionEjeFun1Texto1" text="#{currentRow.value['codigo_condicion_eje_fun_1x1y2']}"/>
                                                    <webuijsf:message for="listaNumeroCondicionEjeFun1" id="messageNumeroCondicionEjeFun1"/>
                                                </webuijsf:tableColumn>
                                            </webuijsf:tableRowGroup>
                                        </webuijsf:table>
                                        <h:panelGrid id="gridPanel104">
                                            <h:panelGrid columns="2" id="gridPanel105">
                                                <h:panelGrid id="gridPanel106">
                                                    <webuijsf:label binding="#{GrupoProceso1.etiquetaTextoFilasPorPagina1}" for="textoFilasPorPagina1"
                                                        id="etiquetaTextoFilasPorPagina1" text="#{GrupoProceso1.gestor.i18n.textoEtiquetaTextoFilasPorPagina}"/>
                                                </h:panelGrid>
                                                <h:panelGrid columns="3" id="gridPanel107">
                                                    <webuijsf:textField binding="#{GrupoProceso1.textoFilasPorPagina1}" columns="2"
                                                        converter="#{GrupoProceso1.textoFilasPorPagina1Converter1}"
                                                        disabled="#{GrupoProceso1.gestor.paginacionInhabilitada}" id="textoFilasPorPagina1" maxLength="2"
                                                        text="#{GrupoProceso1.gestor.filasPorPagina}" validatorExpression="#{GrupoProceso1.textoFilasPorPagina1Validator1.validate}"/>
                                                    <webuijsf:button actionExpression="#{GrupoProceso1.botonRepaginar1_action}"
                                                        binding="#{GrupoProceso1.botonRepaginar1}" id="botonRepaginar1"
                                                        imageURL="#{GrupoProceso1.gestor.urlImagenRepaginar}" onClick="#{GrupoProceso1.gestor.scriptRepaginar}"
                                                        text="#{GrupoProceso1.gestor.i18n.textoBotonRepaginar}" toolTip="#{GrupoProceso1.gestor.i18n.toolTipBotonRepaginar}"/>
                                                    <webuijsf:message for="textoFilasPorPagina1" id="messageFilasPorPagina1"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid columns="12" id="gridPanel108">
                                                <webuijsf:button actionExpression="#{GrupoProceso1.botonAgregar1_action}"
                                                    binding="#{GrupoProceso1.botonAgregar1}" disabled="#{GrupoProceso1.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1" onClick="#{GrupoProceso1.gestor.scriptAgregar}"
                                                    rendered="#{GrupoProceso1.gestor.funcionInsertHabilitada}" styleClass="pdq-button-1"
                                                    text="#{GrupoProceso1.gestor.i18n.textoBotonAgregar}" toolTip="#{GrupoProceso1.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown binding="#{GrupoProceso1.listaFuncionEdicion1}"
                                                    converter="#{GrupoProceso1.converterListaFuncionEdicion1}" disabled="#{GrupoProceso1.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1" items="#{GrupoProceso1.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{GrupoProceso1.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{GrupoProceso1.gestor.funcionEdicionSeleccionada}" toolTip="#{GrupoProceso1.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button actionExpression="#{GrupoProceso1.botonEditar1_action}" binding="#{GrupoProceso1.botonEditar1}"
                                                    disabled="#{GrupoProceso1.gestor.funcionUpdateInhabilitada}" id="botonEditar1"
                                                    onClick="#{GrupoProceso1.gestor.scriptEditar}" rendered="#{GrupoProceso1.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1" text="#{GrupoProceso1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}" toolTip="#{GrupoProceso1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button actionExpression="#{GrupoProceso1.botonEliminar1_action}"
                                                    binding="#{GrupoProceso1.botonEliminar1}" disabled="#{GrupoProceso1.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1" onClick="#{GrupoProceso1.gestor.scriptEliminar}"
                                                    rendered="#{GrupoProceso1.gestor.funcionDeleteHabilitada}" styleClass="pdq-button-1"
                                                    text="#{GrupoProceso1.gestor.i18n.textoBotonEliminar}" toolTip="#{GrupoProceso1.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button actionExpression="#{GrupoProceso1.botonAplicar1_action}"
                                                    binding="#{GrupoProceso1.botonAplicar1}" id="botonAplicar1" onClick="#{GrupoProceso1.gestor.scriptAplicar}"
                                                    rendered="#{GrupoProceso1.gestor.funcionCheckChangesHabilitada}" styleClass="pdq-button-1"
                                                    text="#{GrupoProceso1.gestor.i18n.textoBotonAplicar}" toolTip="#{GrupoProceso1.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button actionExpression="#{GrupoProceso1.botonDeshacer1_action}"
                                                    binding="#{GrupoProceso1.botonDeshacer1}" id="botonDeshacer1"
                                                    onClick="#{GrupoProceso1.gestor.scriptDeshacer}"
                                                    rendered="#{GrupoProceso1.gestor.funcionCancelUpdateHabilitada}" styleClass="pdq-button-1"
                                                    text="#{GrupoProceso1.gestor.i18n.textoBotonDeshacer}" toolTip="#{GrupoProceso1.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button actionExpression="#{GrupoProceso1.botonConfirmar1_action}"
                                                    binding="#{GrupoProceso1.botonConfirmar1}" id="botonConfirmar1"
                                                    onClick="#{GrupoProceso1.gestor.scriptConfirmar}" rendered="#{GrupoProceso1.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1" text="#{GrupoProceso1.gestor.i18n.textoBotonConfirmar}" toolTip="#{GrupoProceso1.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button actionExpression="#{GrupoProceso1.botonDescartar1_action}"
                                                    binding="#{GrupoProceso1.botonDescartar1}" id="botonDescartar1"
                                                    onClick="#{GrupoProceso1.gestor.scriptDescartar}" rendered="#{GrupoProceso1.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1" text="#{GrupoProceso1.gestor.i18n.textoBotonDescartar}" toolTip="#{GrupoProceso1.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown binding="#{GrupoProceso1.listaFuncionAccion1}"
                                                    converter="#{GrupoProceso1.converterListaFuncionAccion1}" id="listaFuncionAccion1"
                                                    items="#{GrupoProceso1.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{GrupoProceso1.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{GrupoProceso1.gestor.funcionAccionSeleccionada}" toolTip="#{GrupoProceso1.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button actionExpression="#{GrupoProceso1.botonProcesar1_action}"
                                                    binding="#{GrupoProceso1.botonProcesar1}" id="botonProcesar1"
                                                    onClick="#{GrupoProceso1.gestor.scriptProcesar}" rendered="#{GrupoProceso1.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1" text="#{GrupoProceso1.gestor.i18n.textoBotonProcesar}" toolTip="#{GrupoProceso1.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button actionExpression="#{GrupoProceso1.botonRefrescar1_action}"
                                                    binding="#{GrupoProceso1.botonRefrescar1}" disabled="#{GrupoProceso1.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1" onClick="#{GrupoProceso1.gestor.scriptRefrescar}"
                                                    rendered="#{GrupoProceso1.gestor.funcionSelectHabilitada}" styleClass="pdq-button-1"
                                                    text="#{GrupoProceso1.gestor.i18n.textoBotonRefrescar}" toolTip="#{GrupoProceso1.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button actionExpression="#{GrupoProceso1.botonRetornar1_action}"
                                                    binding="#{GrupoProceso1.botonRetornar1}"
                                                    disabled="#{GrupoProceso1.gestor.funcionReturnFilaEscogidaInhabilitada}" id="botonRetornar1"
                                                    onClick="#{GrupoProceso1.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{GrupoProceso1.gestor.funcionReturnVisible}" styleClass="pdq-button-1"
                                                    text="#{GrupoProceso1.gestor.i18n.textoBotonRetornar}" toolTip="#{GrupoProceso1.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid columns="1" id="gridPanel109">
                                                <webuijsf:imageHyperlink actionExpression="#{GrupoProceso1.imageHyperlink1_action}"
                                                    binding="#{GrupoProceso1.imageHyperlink1}" disabled="#{GrupoProceso1.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1" imageURL="#{GrupoProceso1.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{GrupoProceso1.gestor.scriptAbrirVinculo}" rendered="#{GrupoProceso1.gestor.designing}"
                                                    styleClass="pdq-hyperlink-1" text="Hyperlink1" toolTip="#{bundle.GrupoProceso1_imageHyperlink1_toolTip}"/>
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
