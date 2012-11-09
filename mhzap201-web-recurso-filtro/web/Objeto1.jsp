<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page binding="#{Objeto1.page1}" id="page1">
            <webuijsf:html binding="#{Objeto1.html1}" id="html1">
                <webuijsf:head binding="#{Objeto1.head1}" id="head1" title="#{ApplicationBean1.nombreAplicacion}">
                    <webuijsf:link binding="#{Objeto1.link1}" id="link1" url="/resources/stylesheet.css"/>
                    <webuijsf:script binding="#{Objeto1.script1}" id="script1" url="/resources/javascript1.js"/>
                </webuijsf:head>
                <webuijsf:body binding="#{Objeto1.body1}" id="body1" onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}" onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}" styleClass="pdq-body-1">
                    <webuijsf:form binding="#{Objeto1.form1}" id="form1" virtualFormsConfig="virtualForm1 | checkbox1 textoFilasPorPagina1 | , virtualForm2 | textoFilasPorPagina1 | botonRepaginar1 , virtualForm3 | checkbox1 | , virtualForm4 | | botonEscogerFila1 botonDetallarFila1 botonRetornarFila1 botonRefrescar1 botonRetornar1">
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
                                    <webuijsf:breadcrumbs binding="#{Objeto1.breadcrumbs1}" id="breadcrumbs1" styleClass="pdq-breadcrumbs-1"/>
                                </div>
                                <div class="pdq-div-filtro-1">
                                    <jsp:directive.include file="FragmentoFiltro.jspf"/>
                                </div>
                                <div class="pos-div-detalle">
                                    <h:panelGrid binding="#{Objeto1.gridPanel1}" id="gridPanel1">
                                        <h:panelGrid binding="#{Objeto1.gridPanel5}" id="gridPanel5">
                                            <h:panelGrid binding="#{Objeto1.gridPanel6}" columns="5" id="gridPanel6">
                                                <webuijsf:image binding="#{Objeto1.imagenMensaje1}" id="imagenMensaje1" url="#{Objeto1.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink align="middle" binding="#{Objeto1.hipervinculoMensaje1}" id="hipervinculoMensaje1"
                                                    text="#{Objeto1.gestor.mensaje}" url="#{Objeto1.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:table binding="#{Objeto1.table1}" clearSortButton="true" deselectMultipleButton="true" id="table1"
                                            paginateButton="false" paginationControls="true" selectMultipleButton="true" sortPanelToggleButton="true">
                                            <webuijsf:tableRowGroup binding="#{Objeto1.tableRowGroup1}" id="tableRowGroup1" rows="1"
                                                selected="#{Objeto1.gestor.filaEscogida}" sourceData="#{Objeto1.objetoDataProvider}" sourceVar="currentRow">
                                                <webuijsf:tableColumn align="center" binding="#{Objeto1.tableRowGroup1SelectionColumn}"
                                                    id="tableRowGroup1SelectionColumn"
                                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);"
                                                    rendered="#{Objeto1.gestor.designing}" selectId="checkbox1">
                                                    <webuijsf:checkbox binding="#{Objeto1.checkbox1}" id="checkbox1" onClick="#{Objeto1.gestor.scriptElegir}"
                                                        selected="#{Objeto1.gestor.filaElegida}" toolTip="casilla de selección múltiple"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn align="center" binding="#{Objeto1.tableColumn1}" id="tableColumn1">
                                                    <webuijsf:button actionExpression="#{Objeto1.botonEscogerFila1_action}"
                                                        binding="#{Objeto1.botonEscogerFila1}" disabled="#{Objeto1.gestor.funcionPickItemInhabilitada}"
                                                        id="botonEscogerFila1" imageURL="#{Objeto1.gestor.urlImagenEscoger}"
                                                        onClick="#{Objeto1.gestor.scriptEscoger}" text="escoger" toolTip="Seleccionar"/>
                                                    <webuijsf:button actionExpression="#{Objeto1.botonDetallarFila1_action}"
                                                        binding="#{Objeto1.botonDetallarFila1}" disabled="#{Objeto1.gestor.funcionPickItemInhabilitada}"
                                                        id="botonDetallarFila1" imageURL="#{Objeto1.gestor.urlImagenDetallar}"
                                                        onClick="#{Objeto1.gestor.scriptEscoger}" rendered="#{Objeto1.gestor.detalleDisponible}" text="detallar" toolTip="Seleccionar y ver detalle"/>
                                                    <webuijsf:button actionExpression="#{Objeto1.botonRetornarFila1_action}"
                                                        binding="#{Objeto1.botonRetornarFila1}" disabled="#{Objeto1.gestor.funcionReturnInhabilitada}"
                                                        id="botonRetornarFila1" imageURL="#{Objeto1.gestor.urlImagenRetornar}"
                                                        onClick="#{Objeto1.gestor.scriptRetornarRecursoActual}"
                                                        rendered="#{Objeto1.gestor.funcionReturnVisible}" text="retornar" toolTip="Seleccionar y retornar"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn align="right" binding="#{Objeto1.tableColumn2}" headerText="#" id="tableColumn2">
                                                    <webuijsf:imageHyperlink actionExpression="#{Objeto1.hipervinculoFila1_action}"
                                                        binding="#{Objeto1.hipervinculoFila1}" id="hipervinculoFila1"
                                                        imageURL="#{Objeto1.gestor.urlImagenFilaProcesada}" text="#{Objeto1.gestor.identificacionFila}"
                                                        textPosition="left" toolTip="#{Objeto1.gestor.toolTipImagenFilaProcesada}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn binding="#{Objeto1.tableColumn3}" headerText="id" id="tableColumn3" sort="id_objeto">
                                                    <webuijsf:staticText binding="#{Objeto1.staticText1}" id="staticText1" text="#{currentRow.value['id_objeto']}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn binding="#{Objeto1.tableColumn4}" headerText="codigo" id="tableColumn4" sort="codigo_objeto">
                                                    <webuijsf:staticText binding="#{Objeto1.staticText2}" id="staticText2" text="#{currentRow.value['codigo_objeto']}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn binding="#{Objeto1.tableColumn5}" headerText="nombre" id="tableColumn5" sort="nombre_objeto">
                                                    <webuijsf:staticText binding="#{Objeto1.staticText3}" id="staticText3" text="#{currentRow.value['nombre_objeto']}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn binding="#{Objeto1.tableColumn7}" headerText="objeto inactivo" id="tableColumn7" sort="es_objeto_inactivo">
                                                    <webuijsf:staticText binding="#{Objeto1.staticText5}" id="staticText5" text="#{Objeto1.stringEsObjetoInactivo}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn binding="#{Objeto1.tableColumn6}" headerText="codigo coleccion" id="tableColumn6" sort="codigo_coleccion">
                                                    <webuijsf:staticText binding="#{Objeto1.staticText4}" id="staticText4" text="#{currentRow.value['codigo_coleccion']}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn binding="#{Objeto1.tableColumn8}" headerText="nombre coleccion" id="tableColumn8" sort="nombre_coleccion">
                                                    <webuijsf:staticText binding="#{Objeto1.staticText6}" id="staticText6" text="#{currentRow.value['nombre_coleccion']}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn binding="#{Objeto1.tableColumn9}" headerText="codigo banco" id="tableColumn9" sort="codigo_banco">
                                                    <webuijsf:staticText binding="#{Objeto1.staticText7}" id="staticText7" text="#{currentRow.value['codigo_banco']}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn binding="#{Objeto1.tableColumn10}" headerText="nombre banco" id="tableColumn10" sort="nombre_banco">
                                                    <webuijsf:staticText binding="#{Objeto1.staticText8}" id="staticText8" text="#{currentRow.value['nombre_banco']}"/>
                                                </webuijsf:tableColumn>
                                            </webuijsf:tableRowGroup>
                                        </webuijsf:table>
                                        <h:panelGrid binding="#{Objeto1.gridPanel2}" id="gridPanel2">
                                            <h:panelGrid binding="#{Objeto1.gridPanel3}" columns="2" id="gridPanel3">
                                                <h:panelGrid binding="#{Objeto1.gridFilasPorPagina1}" id="gridFilasPorPagina1">
                                                    <webuijsf:label binding="#{Objeto1.etiquetaTextoFilasPorPagina1}" for="textoFilasPorPagina1"
                                                        id="etiquetaTextoFilasPorPagina1" text="Filas por página"/>
                                                </h:panelGrid>
                                                <h:panelGrid binding="#{Objeto1.gridFilasPorPagina2}" columns="5" id="gridFilasPorPagina2">
                                                    <webuijsf:textField binding="#{Objeto1.textoFilasPorPagina1}" columns="2"
                                                        converter="#{Objeto1.textoFilasPorPagina1Converter1}"
                                                        disabled="#{Objeto1.gestor.paginacionInhabilitada}" id="textoFilasPorPagina1" maxLength="2"
                                                        text="#{Objeto1.gestor.filasPorPagina}" validatorExpression="#{Objeto1.textoFilasPorPagina1Validator1.validate}"/>
                                                    <webuijsf:button actionExpression="#{Objeto1.botonRepaginar1_action}" binding="#{Objeto1.botonRepaginar1}"
                                                        id="botonRepaginar1" imageURL="#{Objeto1.gestor.urlImagenRepaginar}"
                                                        onClick="#{Objeto1.gestor.scriptRepaginar}" text="Repaginar" toolTip="Repaginar"/>
                                                    <webuijsf:message binding="#{Objeto1.message1}" for="textoFilasPorPagina1" id="message1" showDetail="false" showSummary="true"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{Objeto1.gridPanel4}" columns="10" id="gridPanel4">
                                                <webuijsf:button actionExpression="#{Objeto1.botonRefrescar1_action}" binding="#{Objeto1.botonRefrescar1}"
                                                    disabled="#{Objeto1.gestor.funcionSelectInhabilitada}" id="botonRefrescar1"
                                                    onClick="#{Objeto1.gestor.scriptRefrescar}" styleClass="pdq-button-1" text="Refrescar" toolTip="Refrescar"/>
                                                <webuijsf:button actionExpression="#{Objeto1.botonRetornar1_action}" binding="#{Objeto1.botonRetornar1}"
                                                    disabled="#{Objeto1.gestor.funcionReturnFilaEscogidaInhabilitada}" id="botonRetornar1"
                                                    onClick="#{Objeto1.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{Objeto1.gestor.funcionReturnVisible}" styleClass="pdq-button-1" text="Retornar" toolTip="Retornar"/>
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
                        <webuijsf:anchor binding="#{Objeto1.anclaPie1}" id="anclaPie1"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
