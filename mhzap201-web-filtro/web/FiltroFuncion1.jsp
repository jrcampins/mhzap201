<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page binding="#{FiltroFuncion1.page1}" id="page1">
            <webuijsf:html binding="#{FiltroFuncion1.html1}" id="html1">
                <webuijsf:head binding="#{FiltroFuncion1.head1}" id="head1" title="#{ApplicationBean1.nombreAplicacion}">
                    <webuijsf:link binding="#{FiltroFuncion1.link1}" id="link1" url="/resources/stylesheet.css"/>
                    <webuijsf:script binding="#{FiltroFuncion1.script1}" id="script1" url="/resources/javascript1.js"/>
                </webuijsf:head>
                <webuijsf:body binding="#{FiltroFuncion1.body1}" id="body1" onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}" onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}" styleClass="pdq-body-1">
                    <webuijsf:form binding="#{FiltroFuncion1.form1}" id="form1" virtualFormsConfig="virtualForm1 | checkbox1 textoFilasPorPagina1 gridPanel1:table1:tableRowGroup1:tableColumn5:textField3 | , virtualForm2 | textoFilasPorPagina1 | botonRepaginar1 , virtualForm3 | checkbox1 | botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonEscogerFila1 botonDetallarFila1 botonRetornarFila1 botonRefrescar1 botonAgregar1 botonDescartar1 botonRetornar1">
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
                                    <webuijsf:breadcrumbs binding="#{FiltroFuncion1.breadcrumbs1}" id="breadcrumbs1" styleClass="pdq-breadcrumbs-1"/>
                                </div>
                                <div class="pdq-div-filtro-1">
                                    <jsp:directive.include file="FragmentoFiltro.jspf"/>
                                </div>
                                <div class="pos-div-detalle">
                                    <h:panelGrid binding="#{FiltroFuncion1.gridPanel1}" id="gridPanel1">
                                        <h:panelGrid binding="#{FiltroFuncion1.gridPanel4}" id="gridPanel4">
                                            <h:panelGrid binding="#{FiltroFuncion1.gridPanel5}" columns="5" id="gridPanel5">
                                                <webuijsf:image binding="#{FiltroFuncion1.imagenMensaje1}" id="imagenMensaje1" url="#{FiltroFuncion1.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink align="middle" binding="#{FiltroFuncion1.hipervinculoMensaje1}"
                                                    id="hipervinculoMensaje1" text="#{FiltroFuncion1.gestor.mensaje}" url="#{FiltroFuncion1.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:table binding="#{FiltroFuncion1.table1}" clearSortButton="true" deselectMultipleButton="true" id="table1"
                                            paginateButton="false" paginationControls="true" selectMultipleButton="true" sortPanelToggleButton="true">
                                            <webuijsf:tableRowGroup binding="#{FiltroFuncion1.tableRowGroup1}" id="tableRowGroup1" rows="1"
                                                selected="#{FiltroFuncion1.gestor.filaEscogida}" sourceData="#{FiltroFuncion1.filtroFuncionDataProvider}" sourceVar="currentRow">
                                                <webuijsf:tableColumn align="center" binding="#{FiltroFuncion1.tableRowGroup1SelectionColumn}"
                                                    id="tableRowGroup1SelectionColumn"
                                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);" selectId="checkbox1">
                                                    <webuijsf:checkbox binding="#{FiltroFuncion1.checkbox1}" id="checkbox1"
                                                        onClick="#{FiltroFuncion1.gestor.scriptElegir}" selected="#{FiltroFuncion1.gestor.filaElegida}" toolTip="casilla de selección múltiple"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn align="center" binding="#{FiltroFuncion1.tableColumn1}" id="tableColumn1">
                                                    <webuijsf:button actionExpression="#{FiltroFuncion1.botonEscogerFila1_action}"
                                                        binding="#{FiltroFuncion1.botonEscogerFila1}"
                                                        disabled="#{FiltroFuncion1.gestor.funcionPickItemInhabilitada}" id="botonEscogerFila1"
                                                        imageURL="#{FiltroFuncion1.gestor.urlImagenEscoger}" onClick="#{FiltroFuncion1.gestor.scriptEscoger}"
                                                        text="escoger" toolTip="Seleccionar"/>
                                                    <webuijsf:button actionExpression="#{FiltroFuncion1.botonDetallarFila1_action}"
                                                        binding="#{FiltroFuncion1.botonDetallarFila1}"
                                                        disabled="#{FiltroFuncion1.gestor.funcionPickItemInhabilitada}" id="botonDetallarFila1"
                                                        imageURL="#{FiltroFuncion1.gestor.urlImagenDetallar}" onClick="#{FiltroFuncion1.gestor.scriptEscoger}"
                                                        rendered="#{FiltroFuncion1.gestor.detalleDisponible}" text="detallar" toolTip="Seleccionar y ver detalle"/>
                                                    <webuijsf:button actionExpression="#{FiltroFuncion1.botonRetornarFila1_action}"
                                                        binding="#{FiltroFuncion1.botonRetornarFila1}"
                                                        disabled="#{FiltroFuncion1.gestor.funcionReturnInhabilitada}" id="botonRetornarFila1"
                                                        imageURL="#{FiltroFuncion1.gestor.urlImagenRetornar}"
                                                        onClick="#{FiltroFuncion1.gestor.scriptRetornarRecursoActual}"
                                                        rendered="#{FiltroFuncion1.gestor.funcionReturnVisible}" text="retornar" toolTip="Seleccionar y retornar"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn align="right" binding="#{FiltroFuncion1.tableColumn2}" headerText="#" id="tableColumn2">
                                                    <webuijsf:imageHyperlink actionExpression="#{FiltroFuncion1.hipervinculoFila1_action}"
                                                        binding="#{FiltroFuncion1.hipervinculoFila1}" id="hipervinculoFila1"
                                                        imageURL="#{FiltroFuncion1.gestor.urlImagenFilaProcesada}"
                                                        text="#{FiltroFuncion1.gestor.identificacionFila}" textPosition="left" toolTip="#{FiltroFuncion1.gestor.toolTipImagenFilaProcesada}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn binding="#{FiltroFuncion1.tableColumn4}" headerText="codigo" id="tableColumn4" sort="codigo_filtro_funcion">
                                                    <webuijsf:staticText binding="#{FiltroFuncion1.staticText1}" id="staticText1" text="#{currentRow.value['codigo_filtro_funcion']}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn binding="#{FiltroFuncion1.tableColumn5}" headerText="nombre" id="tableColumn5" sort="nombre_filtro_funcion">
                                                    <webuijsf:textField binding="#{FiltroFuncion1.textField3}" columns="50" id="textField3" maxLength="100"
                                                        readOnly="#{FiltroFuncion1.gestor.filaNoProcesada}" required="true"
                                                        text="#{currentRow.value['nombre_filtro_funcion']}" validatorExpression="#{FiltroFuncion1.lengthValidator2.validate}"/>
                                                    <webuijsf:message binding="#{FiltroFuncion1.message2}" for="textField3" id="message2" showDetail="false" showSummary="true"/>
                                                </webuijsf:tableColumn>
                                            </webuijsf:tableRowGroup>
                                        </webuijsf:table>
                                        <h:panelGrid binding="#{FiltroFuncion1.gridPanel2}" id="gridPanel2">
                                            <h:panelGrid binding="#{FiltroFuncion1.gridPanel3}" columns="2" id="gridPanel3">
                                                <h:panelGrid binding="#{FiltroFuncion1.gridFilasPorPagina1}" id="gridFilasPorPagina1">
                                                    <webuijsf:label binding="#{FiltroFuncion1.etiquetaTextoFilasPorPagina1}" for="textoFilasPorPagina1"
                                                        id="etiquetaTextoFilasPorPagina1" text="Filas por página"/>
                                                </h:panelGrid>
                                                <h:panelGrid binding="#{FiltroFuncion1.gridFilasPorPagina2}" columns="5" id="gridFilasPorPagina2">
                                                    <webuijsf:textField binding="#{FiltroFuncion1.textoFilasPorPagina1}" columns="2"
                                                        converter="#{FiltroFuncion1.textoFilasPorPagina1Converter1}"
                                                        disabled="#{FiltroFuncion1.gestor.paginacionInhabilitada}" id="textoFilasPorPagina1" maxLength="2"
                                                        text="#{FiltroFuncion1.gestor.filasPorPagina}" validatorExpression="#{FiltroFuncion1.textoFilasPorPagina1Validator1.validate}"/>
                                                    <webuijsf:button actionExpression="#{FiltroFuncion1.botonRepaginar1_action}"
                                                        binding="#{FiltroFuncion1.botonRepaginar1}" id="botonRepaginar1"
                                                        imageURL="#{FiltroFuncion1.gestor.urlImagenRepaginar}"
                                                        onClick="#{FiltroFuncion1.gestor.scriptRepaginar}" text="Repaginar" toolTip="Repaginar"/>
                                                    <webuijsf:message binding="#{FiltroFuncion1.message1}" for="textoFilasPorPagina1" id="message1"
                                                        showDetail="false" showSummary="true"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{FiltroFuncion1.gridPanel7}" columns="10" id="gridPanel7">
                                                <webuijsf:button actionExpression="#{FiltroFuncion1.botonAgregar1_action}"
                                                    binding="#{FiltroFuncion1.botonAgregar1}" disabled="#{FiltroFuncion1.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1" onClick="#{FiltroFuncion1.gestor.scriptAgregar}"
                                                    rendered="#{FiltroFuncion1.gestor.funcionInsertHabilitada}" styleClass="pdq-button-1" text="Agregar" toolTip="#{FiltroFuncion1.botonAgregar1.text}"/>
                                                <webuijsf:button actionExpression="#{FiltroFuncion1.botonEditar1_action}"
                                                    binding="#{FiltroFuncion1.botonEditar1}" disabled="#{FiltroFuncion1.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1" onClick="#{FiltroFuncion1.gestor.scriptEditar}"
                                                    rendered="#{FiltroFuncion1.gestor.funcionUpdateHabilitada}" styleClass="pdq-button-1"
                                                    text="#{FiltroFuncion1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}" toolTip="#{FiltroFuncion1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button actionExpression="#{FiltroFuncion1.botonEliminar1_action}"
                                                    binding="#{FiltroFuncion1.botonEliminar1}" disabled="#{FiltroFuncion1.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1" onClick="#{FiltroFuncion1.gestor.scriptEliminar}"
                                                    rendered="#{FiltroFuncion1.gestor.funcionDeleteHabilitada}" styleClass="pdq-button-1" text="Eliminar" toolTip="#{FiltroFuncion1.botonEliminar1.text}"/>
                                                <webuijsf:button actionExpression="#{FiltroFuncion1.botonAplicar1_action}"
                                                    binding="#{FiltroFuncion1.botonAplicar1}" id="botonAplicar1"
                                                    onClick="#{FiltroFuncion1.gestor.scriptAplicar}"
                                                    rendered="#{FiltroFuncion1.gestor.funcionCheckChangesHabilitada}" styleClass="pdq-button-1" text="Aplicar" toolTip="#{FiltroFuncion1.botonAplicar1.text}"/>
                                                <webuijsf:button actionExpression="#{FiltroFuncion1.botonDeshacer1_action}"
                                                    binding="#{FiltroFuncion1.botonDeshacer1}" id="botonDeshacer1"
                                                    onClick="#{FiltroFuncion1.gestor.scriptDeshacer}"
                                                    rendered="#{FiltroFuncion1.gestor.funcionCancelUpdateHabilitada}" styleClass="pdq-button-1" text="Deshacer" toolTip="#{FiltroFuncion1.botonDeshacer1.text}"/>
                                                <webuijsf:button actionExpression="#{FiltroFuncion1.botonConfirmar1_action}"
                                                    binding="#{FiltroFuncion1.botonConfirmar1}" id="botonConfirmar1"
                                                    onClick="#{FiltroFuncion1.gestor.scriptConfirmar}"
                                                    rendered="#{FiltroFuncion1.gestor.funcionCommitHabilitada}" styleClass="pdq-button-1" text="Confirmar" toolTip="#{FiltroFuncion1.botonAgregar1.text}"/>
                                                <webuijsf:button actionExpression="#{FiltroFuncion1.botonDescartar1_action}"
                                                    binding="#{FiltroFuncion1.botonDescartar1}" id="botonDescartar1"
                                                    onClick="#{FiltroFuncion1.gestor.scriptDescartar}"
                                                    rendered="#{FiltroFuncion1.gestor.funcionRevertHabilitada}" styleClass="pdq-button-1" text="Descartar" toolTip="#{FiltroFuncion1.botonDescartar1.text}"/>
                                                <webuijsf:button actionExpression="#{FiltroFuncion1.botonRefrescar1_action}"
                                                    binding="#{FiltroFuncion1.botonRefrescar1}" disabled="#{FiltroFuncion1.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1" onClick="#{FiltroFuncion1.gestor.scriptRefrescar}"
                                                    rendered="#{FiltroFuncion1.gestor.funcionSelectHabilitada}" styleClass="pdq-button-1" text="Refrescar" toolTip="#{FiltroFuncion1.botonRefrescar1.text}"/>
                                                <webuijsf:button actionExpression="#{FiltroFuncion1.botonRetornar1_action}"
                                                    binding="#{FiltroFuncion1.botonRetornar1}"
                                                    disabled="#{FiltroFuncion1.gestor.funcionReturnFilaEscogidaInhabilitada}" id="botonRetornar1"
                                                    onClick="#{FiltroFuncion1.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{FiltroFuncion1.gestor.funcionReturnVisible}" styleClass="pdq-button-1" text="Retornar" toolTip="#{FiltroFuncion1.botonRetornar1.text}"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{FiltroFuncion1.gridPanel6}" columns="10" id="gridPanel6">
                                                <webuijsf:imageHyperlink actionExpression="#{FiltroFuncion1.imageHyperlink1_action}"
                                                    binding="#{FiltroFuncion1.imageHyperlink1}" disabled="#{FiltroFuncion1.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1" imageURL="#{FiltroFuncion1.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{FiltroFuncion1.gestor.scriptAbrirVinculo}" styleClass="pdq-hyperlink-1" text="Criterios" toolTip="Criterios por filtro"/>
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
                        <webuijsf:anchor binding="#{FiltroFuncion1.anclaPie1}" id="anclaPie1"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
