<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page binding="#{RastroFuncion2.page1}" id="page1">
            <webuijsf:html binding="#{RastroFuncion2.html1}" id="html1">
                <webuijsf:head binding="#{RastroFuncion2.head1}" id="head1" title="#{ApplicationBean1.nombreAplicacion}">
                    <webuijsf:link binding="#{RastroFuncion2.link1}" id="link1" url="/resources/stylesheet.css"/>
                    <webuijsf:script binding="#{RastroFuncion2.script1}" id="script1" url="/resources/javascript1.js"/>
                </webuijsf:head>
                <webuijsf:body binding="#{RastroFuncion2.body1}" id="body1" onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}" onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}" styleClass="pdq-body-1">
                    <webuijsf:form binding="#{RastroFuncion2.form1}" id="form1" virtualFormsConfig="virtualForm1 | checkbox1 textoFilasPorPagina1 | , virtualForm2 | textoFilasPorPagina1 | botonRepaginar1 , virtualForm3 | checkbox1 | , virtualForm4 | | botonEscogerFila1 botonDetallarFila1 botonRetornarFila1 botonRefrescar1 botonRetornar1">
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
                                    <webuijsf:breadcrumbs binding="#{RastroFuncion2.breadcrumbs1}" id="breadcrumbs1" styleClass="pdq-breadcrumbs-1"/>
                                </div>
                                <div class="pdq-div-filtro-1">
                                    <jsp:directive.include file="FragmentoFiltro_1.jspf"/>
                                </div>
                                <div class="pos-div-detalle">
                                    <h:panelGrid binding="#{RastroFuncion2.gridPanel1}" id="gridPanel1">
                                        <h:panelGrid binding="#{RastroFuncion2.gridPanel5}" id="gridPanel5">
                                            <h:panelGrid binding="#{RastroFuncion2.gridPanel7}" columns="5" id="gridPanel7">
                                                <webuijsf:image binding="#{RastroFuncion2.imagenMensaje1}" id="imagenMensaje1" url="#{RastroFuncion2.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink align="middle" binding="#{RastroFuncion2.hipervinculoMensaje1}"
                                                    id="hipervinculoMensaje1" text="#{RastroFuncion2.gestor.mensaje}" url="#{RastroFuncion2.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:table binding="#{RastroFuncion2.table1}" clearSortButton="true" deselectMultipleButton="true" id="table1"
                                            paginateButton="false" paginationControls="true" selectMultipleButton="true" sortPanelToggleButton="true">
                                            <webuijsf:tableRowGroup binding="#{RastroFuncion2.tableRowGroup1}" id="tableRowGroup1" rows="1"
                                                selected="#{RastroFuncion2.gestor.filaEscogida}"
                                                sourceData="#{RastroFuncion2.rastroFuncionParDataProvider}" sourceVar="currentRow">
                                                <webuijsf:tableColumn align="center" binding="#{RastroFuncion2.tableRowGroup1SelectionColumn}"
                                                    id="tableRowGroup1SelectionColumn"
                                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);"
                                                    rendered="#{RastroFuncion2.gestor.designing}" selectId="checkbox1">
                                                    <webuijsf:checkbox binding="#{RastroFuncion2.checkbox1}" id="checkbox1"
                                                        onClick="#{RastroFuncion2.gestor.scriptElegir}" selected="#{RastroFuncion2.gestor.filaElegida}" toolTip="casilla de selección múltiple"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn align="center" binding="#{RastroFuncion2.tableColumn1}" id="tableColumn1" rendered="#{RastroFuncion2.gestor.designing}">
                                                    <webuijsf:button actionExpression="#{RastroFuncion2.botonEscogerFila1_action}"
                                                        binding="#{RastroFuncion2.botonEscogerFila1}"
                                                        disabled="#{RastroFuncion2.gestor.funcionPickItemInhabilitada}" id="botonEscogerFila1"
                                                        imageURL="#{RastroFuncion2.gestor.urlImagenEscoger}" onClick="#{RastroFuncion2.gestor.scriptEscoger}"
                                                        text="escoger" toolTip="Seleccionar"/>
                                                    <webuijsf:button actionExpression="#{RastroFuncion2.botonDetallarFila1_action}"
                                                        binding="#{RastroFuncion2.botonDetallarFila1}"
                                                        disabled="#{RastroFuncion2.gestor.funcionPickItemInhabilitada}" id="botonDetallarFila1"
                                                        imageURL="#{RastroFuncion2.gestor.urlImagenDetallar}" onClick="#{RastroFuncion2.gestor.scriptEscoger}"
                                                        rendered="#{RastroFuncion2.gestor.detalleDisponible}" text="detallar" toolTip="Seleccionar y ver detalle"/>
                                                    <webuijsf:button actionExpression="#{RastroFuncion2.botonRetornarFila1_action}"
                                                        binding="#{RastroFuncion2.botonRetornarFila1}"
                                                        disabled="#{RastroFuncion2.gestor.funcionReturnInhabilitada}" id="botonRetornarFila1"
                                                        imageURL="#{RastroFuncion2.gestor.urlImagenRetornar}"
                                                        onClick="#{RastroFuncion2.gestor.scriptRetornarRecursoActual}"
                                                        rendered="#{RastroFuncion2.gestor.funcionReturnVisible}" text="retornar" toolTip="Seleccionar y retornar"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn align="right" binding="#{RastroFuncion2.tableColumn2}" headerText="#" id="tableColumn2">
                                                    <webuijsf:imageHyperlink actionExpression="#{RastroFuncion2.hipervinculoFila1_action}"
                                                        binding="#{RastroFuncion2.hipervinculoFila1}" id="hipervinculoFila1"
                                                        imageURL="#{RastroFuncion2.gestor.urlImagenFilaProcesada}"
                                                        text="#{RastroFuncion2.gestor.identificacionFila}" textPosition="left" toolTip="#{RastroFuncion2.gestor.toolTipImagenFilaProcesada}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn binding="#{RastroFuncion2.tableColumn3}" headerText="ejecución" id="tableColumn3" sort="id_rastro_funcion">
                                                    <webuijsf:staticText binding="#{RastroFuncion2.staticText3}" id="staticText3" text="#{currentRow.value['id_rastro_funcion']}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn binding="#{RastroFuncion2.tableColumn4}" headerText="usuario" id="tableColumn4" sort="nombre_usuario">
                                                    <webuijsf:staticText binding="#{RastroFuncion2.staticText4}" id="staticText4" text="#{currentRow.value['nombre_usuario']}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn binding="#{RastroFuncion2.tableColumn5}" headerText="función" id="tableColumn5" sort="codigo_funcion">
                                                    <webuijsf:staticText binding="#{RastroFuncion2.staticText5}" id="staticText5" text="#{currentRow.value['codigo_funcion']}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn binding="#{RastroFuncion2.tableColumn6}" headerText="fecha/hora" id="tableColumn6" sort="fecha_hora_ejecucion">
                                                    <webuijsf:staticText binding="#{RastroFuncion2.staticText6}" id="staticText6" text="#{currentRow.value['fecha_hora_ejecucion']}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn binding="#{RastroFuncion2.tableColumn7}" headerText="parámetro" id="tableColumn7" sort="nombre_parametro">
                                                    <webuijsf:staticText binding="#{RastroFuncion2.staticText1}" id="staticText1" text="#{currentRow.value['nombre_parametro']}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn binding="#{RastroFuncion2.tableColumn8}" headerText="valor" id="tableColumn8" sort="valor_parametro">
                                                    <webuijsf:staticText binding="#{RastroFuncion2.staticText2}" id="staticText2" text="#{currentRow.value['valor_parametro']}"/>
                                                </webuijsf:tableColumn>
                                            </webuijsf:tableRowGroup>
                                        </webuijsf:table>
                                        <h:panelGrid binding="#{RastroFuncion2.gridPanel2}" id="gridPanel2">
                                            <h:panelGrid binding="#{RastroFuncion2.gridPanel3}" columns="2" id="gridPanel3">
                                                <h:panelGrid binding="#{RastroFuncion2.gridFilasPorPagina1}" id="gridFilasPorPagina1">
                                                    <webuijsf:label binding="#{RastroFuncion2.etiquetaTextoFilasPorPagina1}" for="textoFilasPorPagina1"
                                                        id="etiquetaTextoFilasPorPagina1" text="Filas por página"/>
                                                </h:panelGrid>
                                                <h:panelGrid binding="#{RastroFuncion2.gridFilasPorPagina2}" columns="5" id="gridFilasPorPagina2">
                                                    <webuijsf:textField binding="#{RastroFuncion2.textoFilasPorPagina1}" columns="2"
                                                        converter="#{RastroFuncion2.textoFilasPorPagina1Converter1}"
                                                        disabled="#{RastroFuncion2.gestor.paginacionInhabilitada}" id="textoFilasPorPagina1" maxLength="2"
                                                        text="#{RastroFuncion2.gestor.filasPorPagina}" validatorExpression="#{RastroFuncion2.textoFilasPorPagina1Validator1.validate}"/>
                                                    <webuijsf:button actionExpression="#{RastroFuncion2.botonRepaginar1_action}"
                                                        binding="#{RastroFuncion2.botonRepaginar1}" id="botonRepaginar1"
                                                        imageURL="#{RastroFuncion2.gestor.urlImagenRepaginar}"
                                                        onClick="#{RastroFuncion2.gestor.scriptRepaginar}" text="Repaginar" toolTip="Repaginar"/>
                                                    <webuijsf:message binding="#{RastroFuncion2.message1}" for="textoFilasPorPagina1" id="message1"
                                                        showDetail="false" showSummary="true"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{RastroFuncion2.gridPanel4}" columns="10" id="gridPanel4">
                                                <webuijsf:button actionExpression="#{RastroFuncion2.botonRefrescar1_action}"
                                                    binding="#{RastroFuncion2.botonRefrescar1}" disabled="#{RastroFuncion2.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1" onClick="#{RastroFuncion2.gestor.scriptRefrescar}" styleClass="pdq-button-1"
                                                    text="Refrescar" toolTip="Refrescar"/>
                                                <webuijsf:button actionExpression="#{RastroFuncion2.botonRetornar1_action}"
                                                    binding="#{RastroFuncion2.botonRetornar1}"
                                                    disabled="#{RastroFuncion2.gestor.funcionReturnFilaEscogidaInhabilitada}" id="botonRetornar1"
                                                    onClick="#{RastroFuncion2.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{RastroFuncion2.gestor.funcionReturnVisible}" styleClass="pdq-button-1" text="Retornar" toolTip="Retornar"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{RastroFuncion2.gridPanel6}" columns="10" id="gridPanel6">
                                                <webuijsf:imageHyperlink actionExpression="#{RastroFuncion2.imageHyperlink1_action}"
                                                    binding="#{RastroFuncion2.imageHyperlink1}" disabled="#{RastroFuncion2.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1" imageURL="#{RastroFuncion2.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{RastroFuncion2.gestor.scriptAbrirVinculo}" rendered="#{RastroFuncion2.gestor.designing}"
                                                    styleClass="pdq-hyperlink-1" text="Parámetros"/>
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
                        <webuijsf:anchor binding="#{RastroFuncion2.anclaPie1}" id="anclaPie1"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
