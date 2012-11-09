<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page binding="#{RastroFuncionPar1.page1}" id="page1">
            <webuijsf:html binding="#{RastroFuncionPar1.html1}" id="html1">
                <webuijsf:head binding="#{RastroFuncionPar1.head1}" id="head1" title="#{ApplicationBean1.nombreAplicacion}">
                    <webuijsf:link binding="#{RastroFuncionPar1.link1}" id="link1" url="/resources/stylesheet.css"/>
                    <webuijsf:script binding="#{RastroFuncionPar1.script1}" id="script1" url="/resources/javascript1.js"/>
                </webuijsf:head>
                <webuijsf:body binding="#{RastroFuncionPar1.body1}" id="body1" onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}" onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}" styleClass="pdq-body-1">
                    <webuijsf:form binding="#{RastroFuncionPar1.form1}" id="form1" virtualFormsConfig="virtualForm1 | checkbox1 textoFilasPorPagina1 | , virtualForm2 | textoFilasPorPagina1 | botonRepaginar1 , virtualForm3 | checkbox1 | , virtualForm4 | | botonEscogerFila1 botonDetallarFila1 botonRetornarFila1 botonRefrescar1 botonRetornar1">
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
                                    <webuijsf:breadcrumbs binding="#{RastroFuncionPar1.breadcrumbs1}" id="breadcrumbs1" styleClass="pdq-breadcrumbs-1"/>
                                </div>
                                <div class="pdq-div-filtro-1">
                                    <jsp:directive.include file="FragmentoFiltro_1.jspf"/>
                                </div>
                                <div class="pos-div-detalle">
                                    <h:panelGrid binding="#{RastroFuncionPar1.gridPanel1}" id="gridPanel1">
                                        <h:panelGrid binding="#{RastroFuncionPar1.gridPanel5}" id="gridPanel5">
                                            <h:panelGrid binding="#{RastroFuncionPar1.gridPanel6}" columns="5" id="gridPanel6">
                                                <webuijsf:image binding="#{RastroFuncionPar1.imagenMensaje1}" id="imagenMensaje1" url="#{RastroFuncionPar1.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink align="middle" binding="#{RastroFuncionPar1.hipervinculoMensaje1}"
                                                    id="hipervinculoMensaje1" text="#{RastroFuncionPar1.gestor.mensaje}" url="#{RastroFuncionPar1.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:table binding="#{RastroFuncionPar1.table1}" clearSortButton="true" deselectMultipleButton="true"
                                            id="table1" paginateButton="false" paginationControls="true" selectMultipleButton="true" sortPanelToggleButton="true">
                                            <webuijsf:tableRowGroup binding="#{RastroFuncionPar1.tableRowGroup1}" id="tableRowGroup1" rows="1"
                                                selected="#{RastroFuncionPar1.gestor.filaEscogida}"
                                                sourceData="#{RastroFuncionPar1.rastroFuncionParDataProvider}" sourceVar="currentRow">
                                                <webuijsf:tableColumn align="center" binding="#{RastroFuncionPar1.tableRowGroup1SelectionColumn}"
                                                    id="tableRowGroup1SelectionColumn"
                                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);"
                                                    rendered="#{RastroFuncionPar1.gestor.designing}" selectId="checkbox1">
                                                    <webuijsf:checkbox binding="#{RastroFuncionPar1.checkbox1}" id="checkbox1"
                                                        onClick="#{RastroFuncionPar1.gestor.scriptElegir}"
                                                        selected="#{RastroFuncionPar1.gestor.filaElegida}" toolTip="casilla de selección múltiple"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn align="center" binding="#{RastroFuncionPar1.tableColumn1}" id="tableColumn1" rendered="#{RastroFuncionPar1.gestor.designing}">
                                                    <webuijsf:button actionExpression="#{RastroFuncionPar1.botonEscogerFila1_action}"
                                                        binding="#{RastroFuncionPar1.botonEscogerFila1}"
                                                        disabled="#{RastroFuncionPar1.gestor.funcionPickItemInhabilitada}" id="botonEscogerFila1"
                                                        imageURL="#{RastroFuncionPar1.gestor.urlImagenEscoger}"
                                                        onClick="#{RastroFuncionPar1.gestor.scriptEscoger}" text="escoger" toolTip="Seleccionar"/>
                                                    <webuijsf:button actionExpression="#{RastroFuncionPar1.botonDetallarFila1_action}"
                                                        binding="#{RastroFuncionPar1.botonDetallarFila1}"
                                                        disabled="#{RastroFuncionPar1.gestor.funcionPickItemInhabilitada}" id="botonDetallarFila1"
                                                        imageURL="#{RastroFuncionPar1.gestor.urlImagenDetallar}"
                                                        onClick="#{RastroFuncionPar1.gestor.scriptEscoger}"
                                                        rendered="#{RastroFuncionPar1.gestor.detalleDisponible}" text="detallar" toolTip="Seleccionar y ver detalle"/>
                                                    <webuijsf:button actionExpression="#{RastroFuncionPar1.botonRetornarFila1_action}"
                                                        binding="#{RastroFuncionPar1.botonRetornarFila1}"
                                                        disabled="#{RastroFuncionPar1.gestor.funcionReturnInhabilitada}" id="botonRetornarFila1"
                                                        imageURL="#{RastroFuncionPar1.gestor.urlImagenRetornar}"
                                                        onClick="#{RastroFuncionPar1.gestor.scriptRetornarRecursoActual}"
                                                        rendered="#{RastroFuncionPar1.gestor.funcionReturnVisible}" text="retornar" toolTip="Seleccionar y retornar"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn align="right" binding="#{RastroFuncionPar1.tableColumn2}" headerText="#" id="tableColumn2">
                                                    <webuijsf:imageHyperlink actionExpression="#{RastroFuncionPar1.hipervinculoFila1_action}"
                                                        binding="#{RastroFuncionPar1.hipervinculoFila1}" id="hipervinculoFila1"
                                                        imageURL="#{RastroFuncionPar1.gestor.urlImagenFilaProcesada}"
                                                        text="#{RastroFuncionPar1.gestor.identificacionFila}" textPosition="left" toolTip="#{RastroFuncionPar1.gestor.toolTipImagenFilaProcesada}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn binding="#{RastroFuncionPar1.tableColumn3}" headerText="parámetro" id="tableColumn3" sort="nombre_parametro">
                                                    <webuijsf:staticText binding="#{RastroFuncionPar1.staticText1}" id="staticText1" text="#{currentRow.value['nombre_parametro']}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn binding="#{RastroFuncionPar1.tableColumn4}" headerText="valor" id="tableColumn4" sort="valor_parametro">
                                                    <webuijsf:staticText binding="#{RastroFuncionPar1.staticText2}" id="staticText2" text="#{currentRow.value['valor_parametro']}"/>
                                                </webuijsf:tableColumn>
                                            </webuijsf:tableRowGroup>
                                        </webuijsf:table>
                                        <h:panelGrid binding="#{RastroFuncionPar1.gridPanel2}" id="gridPanel2">
                                            <h:panelGrid binding="#{RastroFuncionPar1.gridPanel3}" columns="2" id="gridPanel3">
                                                <h:panelGrid binding="#{RastroFuncionPar1.gridFilasPorPagina1}" id="gridFilasPorPagina1">
                                                    <webuijsf:label binding="#{RastroFuncionPar1.etiquetaTextoFilasPorPagina1}" for="textoFilasPorPagina1"
                                                        id="etiquetaTextoFilasPorPagina1" text="Filas por página"/>
                                                </h:panelGrid>
                                                <h:panelGrid binding="#{RastroFuncionPar1.gridFilasPorPagina2}" columns="5" id="gridFilasPorPagina2">
                                                    <webuijsf:textField binding="#{RastroFuncionPar1.textoFilasPorPagina1}" columns="2"
                                                        converter="#{RastroFuncionPar1.textoFilasPorPagina1Converter1}"
                                                        disabled="#{RastroFuncionPar1.gestor.paginacionInhabilitada}" id="textoFilasPorPagina1"
                                                        maxLength="2" text="#{RastroFuncionPar1.gestor.filasPorPagina}" validatorExpression="#{RastroFuncionPar1.textoFilasPorPagina1Validator1.validate}"/>
                                                    <webuijsf:button actionExpression="#{RastroFuncionPar1.botonRepaginar1_action}"
                                                        binding="#{RastroFuncionPar1.botonRepaginar1}" id="botonRepaginar1"
                                                        imageURL="#{RastroFuncionPar1.gestor.urlImagenRepaginar}"
                                                        onClick="#{RastroFuncionPar1.gestor.scriptRepaginar}" text="Repaginar" toolTip="Repaginar"/>
                                                    <webuijsf:message binding="#{RastroFuncionPar1.message1}" for="textoFilasPorPagina1" id="message1"
                                                        showDetail="false" showSummary="true"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{RastroFuncionPar1.gridPanel4}" columns="10" id="gridPanel4">
                                                <webuijsf:button actionExpression="#{RastroFuncionPar1.botonRefrescar1_action}"
                                                    binding="#{RastroFuncionPar1.botonRefrescar1}"
                                                    disabled="#{RastroFuncionPar1.gestor.funcionSelectInhabilitada}" id="botonRefrescar1"
                                                    onClick="#{RastroFuncionPar1.gestor.scriptRefrescar}" styleClass="pdq-button-1" text="Refrescar" toolTip="Refrescar"/>
                                                <webuijsf:button actionExpression="#{RastroFuncionPar1.botonRetornar1_action}"
                                                    binding="#{RastroFuncionPar1.botonRetornar1}"
                                                    disabled="#{RastroFuncionPar1.gestor.funcionReturnFilaEscogidaInhabilitada}" id="botonRetornar1"
                                                    onClick="#{RastroFuncionPar1.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{RastroFuncionPar1.gestor.funcionReturnVisible}" styleClass="pdq-button-1"
                                                    text="Retornar" toolTip="Retornar"/>
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
                        <webuijsf:anchor binding="#{RastroFuncionPar1.anclaPie1}" id="anclaPie1"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
