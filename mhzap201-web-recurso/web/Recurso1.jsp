<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page binding="#{Recurso1.page1}" id="page1">
            <webuijsf:html binding="#{Recurso1.html1}" id="html1">
                <webuijsf:head binding="#{Recurso1.head1}" id="head1" title="#{ApplicationBean1.nombreAplicacion}">
                    <webuijsf:link binding="#{Recurso1.link1}" id="link1" url="/resources/stylesheet.css"/>
                    <webuijsf:script binding="#{Recurso1.script1}" id="script1" url="/resources/javascript1.js"/>
                </webuijsf:head>
                <webuijsf:body binding="#{Recurso1.body1}" id="body1" onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}" onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}" styleClass="pdq-body-1">
                    <webuijsf:form binding="#{Recurso1.form1}" id="form1" virtualFormsConfig="virtualForm1 | checkbox1 textoFilasPorPagina1 | , virtualForm2 | textoFilasPorPagina1 | botonRepaginar1 , virtualForm3 | checkbox1 | , virtualForm4 | | botonEscogerFila1 botonDetallarFila1 botonRetornarFila1 botonRefrescar1 botonRetornar1">
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
                                    <webuijsf:breadcrumbs binding="#{Recurso1.breadcrumbs1}" id="breadcrumbs1" styleClass="pdq-breadcrumbs-1"/>
                                </div>
                                <div class="pdq-div-filtro-1">
                                    <jsp:directive.include file="FragmentoFiltro.jspf"/>
                                </div>
                                <div class="pos-div-detalle">
                                    <h:panelGrid binding="#{Recurso1.gridPanel1}" id="gridPanel1">
                                        <h:panelGrid binding="#{Recurso1.gridPanel5}" id="gridPanel5">
                                            <h:panelGrid binding="#{Recurso1.gridPanel6}" columns="5" id="gridPanel6">
                                                <webuijsf:image binding="#{Recurso1.imagenMensaje1}" id="imagenMensaje1" url="#{Recurso1.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink align="middle" binding="#{Recurso1.hipervinculoMensaje1}" id="hipervinculoMensaje1"
                                                    text="#{Recurso1.gestor.mensaje}" url="#{Recurso1.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:table binding="#{Recurso1.table1}" clearSortButton="true" deselectMultipleButton="true" id="table1"
                                            paginateButton="false" paginationControls="true" selectMultipleButton="true" sortPanelToggleButton="true">
                                            <webuijsf:tableRowGroup binding="#{Recurso1.tableRowGroup1}" id="tableRowGroup1" rows="1"
                                                selected="#{Recurso1.gestor.filaEscogida}" sourceData="#{Recurso1.listaRecursoDataProvider}" sourceVar="currentRow">
                                                <webuijsf:tableColumn align="center" binding="#{Recurso1.tableRowGroup1SelectionColumn}"
                                                    id="tableRowGroup1SelectionColumn"
                                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);"
                                                    rendered="#{Recurso1.gestor.designing}" selectId="checkbox1">
                                                    <webuijsf:checkbox binding="#{Recurso1.checkbox1}" id="checkbox1" onClick="#{Recurso1.gestor.scriptElegir}"
                                                        selected="#{Recurso1.gestor.filaElegida}" toolTip="casilla de selección múltiple"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn align="center" binding="#{Recurso1.tableColumn1}" id="tableColumn1">
                                                    <webuijsf:button actionExpression="#{Recurso1.botonEscogerFila1_action}"
                                                        binding="#{Recurso1.botonEscogerFila1}" disabled="#{Recurso1.gestor.funcionPickItemInhabilitada}"
                                                        id="botonEscogerFila1" imageURL="#{Recurso1.gestor.urlImagenEscoger}"
                                                        onClick="#{Recurso1.gestor.scriptEscoger}" text="escoger" toolTip="Seleccionar"/>
                                                    <webuijsf:button actionExpression="#{Recurso1.botonDetallarFila1_action}"
                                                        binding="#{Recurso1.botonDetallarFila1}" disabled="#{Recurso1.gestor.funcionPickItemInhabilitada}"
                                                        id="botonDetallarFila1" imageURL="#{Recurso1.gestor.urlImagenDetallar}"
                                                        onClick="#{Recurso1.gestor.scriptEscoger}" rendered="#{Recurso1.gestor.detalleDisponible}"
                                                        text="detallar" toolTip="Seleccionar y ver detalle"/>
                                                    <webuijsf:button actionExpression="#{Recurso1.botonRetornarFila1_action}"
                                                        binding="#{Recurso1.botonRetornarFila1}" disabled="#{Recurso1.gestor.funcionReturnInhabilitada}"
                                                        id="botonRetornarFila1" imageURL="#{Recurso1.gestor.urlImagenRetornar}"
                                                        onClick="#{Recurso1.gestor.scriptRetornarRecursoActual}"
                                                        rendered="#{Recurso1.gestor.funcionReturnVisible}" text="retornar" toolTip="Seleccionar y retornar"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn align="right" binding="#{Recurso1.tableColumn2}" headerText="#" id="tableColumn2">
                                                    <webuijsf:imageHyperlink actionExpression="#{Recurso1.hipervinculoFila1_action}"
                                                        binding="#{Recurso1.hipervinculoFila1}" id="hipervinculoFila1"
                                                        imageURL="#{Recurso1.gestor.urlImagenFilaProcesada}" text="#{Recurso1.gestor.identificacionFila}"
                                                        textPosition="left" toolTip="#{Recurso1.gestor.toolTipImagenFilaProcesada}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn binding="#{Recurso1.tableColumn3}" id="tableColumn3">
                                                    <webuijsf:staticText binding="#{Recurso1.staticText1}" id="staticText1" text="#{Recurso1.identificacionRecurso}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn binding="#{Recurso1.tableColumn4}" id="tableColumn4">
                                                    <webuijsf:staticText binding="#{Recurso1.staticText2}" id="staticText2" text="#{Recurso1.codigoRecurso}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn binding="#{Recurso1.tableColumn5}" id="tableColumn5">
                                                    <webuijsf:staticText binding="#{Recurso1.staticText3}" id="staticText3" text="#{Recurso1.nombreRecurso}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn binding="#{Recurso1.tableColumn6}" id="tableColumn6">
                                                    <webuijsf:staticText binding="#{Recurso1.staticText4}" id="staticText4" text="#{Recurso1.esRecursoInactivo}"/>
                                                </webuijsf:tableColumn>
                                            </webuijsf:tableRowGroup>
                                        </webuijsf:table>
                                        <h:panelGrid binding="#{Recurso1.gridPanel2}" id="gridPanel2">
                                            <h:panelGrid binding="#{Recurso1.gridPanel3}" columns="2" id="gridPanel3">
                                                <h:panelGrid binding="#{Recurso1.gridFilasPorPagina1}" id="gridFilasPorPagina1">
                                                    <webuijsf:label binding="#{Recurso1.etiquetaTextoFilasPorPagina1}" for="textoFilasPorPagina1"
                                                        id="etiquetaTextoFilasPorPagina1" text="Filas por página"/>
                                                </h:panelGrid>
                                                <h:panelGrid binding="#{Recurso1.gridFilasPorPagina2}" columns="5" id="gridFilasPorPagina2">
                                                    <webuijsf:textField binding="#{Recurso1.textoFilasPorPagina1}" columns="2"
                                                        converter="#{Recurso1.textoFilasPorPagina1Converter1}"
                                                        disabled="#{Recurso1.gestor.paginacionInhabilitada}" id="textoFilasPorPagina1" maxLength="2"
                                                        text="#{Recurso1.gestor.filasPorPagina}" validatorExpression="#{Recurso1.textoFilasPorPagina1Validator1.validate}"/>
                                                    <webuijsf:button actionExpression="#{Recurso1.botonRepaginar1_action}" binding="#{Recurso1.botonRepaginar1}"
                                                        id="botonRepaginar1" imageURL="#{Recurso1.gestor.urlImagenRepaginar}"
                                                        onClick="#{Recurso1.gestor.scriptRepaginar}" text="Repaginar" toolTip="Repaginar"/>
                                                    <webuijsf:message binding="#{Recurso1.message1}" for="textoFilasPorPagina1" id="message1" showDetail="false" showSummary="true"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{Recurso1.gridPanel4}" columns="10" id="gridPanel4">
                                                <webuijsf:button actionExpression="#{Recurso1.botonRefrescar1_action}" binding="#{Recurso1.botonRefrescar1}"
                                                    disabled="#{Recurso1.gestor.funcionSelectInhabilitada}" id="botonRefrescar1"
                                                    onClick="#{Recurso1.gestor.scriptRefrescar}" styleClass="pdq-button-1" text="Refrescar" toolTip="Refrescar"/>
                                                <webuijsf:button actionExpression="#{Recurso1.botonRetornar1_action}" binding="#{Recurso1.botonRetornar1}"
                                                    disabled="#{Recurso1.gestor.funcionReturnFilaEscogidaInhabilitada}" id="botonRetornar1"
                                                    onClick="#{Recurso1.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{Recurso1.gestor.funcionReturnVisible}" styleClass="pdq-button-1" text="Retornar" toolTip="Retornar"/>
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
                        <webuijsf:anchor binding="#{Recurso1.anclaPie1}" id="anclaPie1"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
