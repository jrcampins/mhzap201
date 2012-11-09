<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page binding="#{RastroProceso1.page1}" id="page1">
            <webuijsf:html binding="#{RastroProceso1.html1}" id="html1">
                <webuijsf:head binding="#{RastroProceso1.head1}" id="head1" title="#{ApplicationBean1.nombreAplicacion}">
                    <webuijsf:link binding="#{RastroProceso1.link1}" id="link1" url="/resources/stylesheet.css"/>
                    <webuijsf:script binding="#{RastroProceso1.script1}" id="script1" url="/resources/javascript1.js"/>
                </webuijsf:head>
                <webuijsf:body binding="#{RastroProceso1.body1}" id="body1" onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}" onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}" styleClass="pdq-body-1">
                    <webuijsf:form binding="#{RastroProceso1.form1}" id="form1" virtualFormsConfig="virtualForm1 | checkbox1 textoFilasPorPagina1 | , virtualForm2 | textoFilasPorPagina1 | botonRepaginar1 , virtualForm3 | checkbox1 | , virtualForm4 | | botonEscogerFila1 botonDetallarFila1 botonRetornarFila1 botonRefrescar1 botonRetornar1">
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
                                    <webuijsf:breadcrumbs binding="#{RastroProceso1.breadcrumbs1}" id="breadcrumbs1" styleClass="pdq-breadcrumbs-1"/>
                                </div>
                                <div class="pdq-div-filtro-1">
                                    <jsp:directive.include file="FragmentoFiltro.jspf"/>
                                </div>
                                <div class="pos-div-detalle">
                                    <h:panelGrid binding="#{RastroProceso1.gridPanel1}" id="gridPanel1">
                                        <h:panelGrid binding="#{RastroProceso1.gridPanel5}" id="gridPanel5">
                                            <h:panelGrid binding="#{RastroProceso1.gridPanel6}" columns="5" id="gridPanel6">
                                                <webuijsf:image binding="#{RastroProceso1.imagenMensaje1}" id="imagenMensaje1" url="#{RastroProceso1.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink align="middle" binding="#{RastroProceso1.hipervinculoMensaje1}"
                                                    id="hipervinculoMensaje1" text="#{RastroProceso1.gestor.mensaje}" url="#{RastroProceso1.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:table binding="#{RastroProceso1.table1}" clearSortButton="true" deselectMultipleButton="true" id="table1"
                                            paginateButton="false" paginationControls="true" selectMultipleButton="true" sortPanelToggleButton="true">
                                            <webuijsf:tableRowGroup binding="#{RastroProceso1.tableRowGroup1}" id="tableRowGroup1" rows="1"
                                                selected="#{RastroProceso1.gestor.filaEscogida}" sourceData="#{RastroProceso1.rastroProcesoDataProvider}" sourceVar="currentRow">
                                                <webuijsf:tableColumn align="center" binding="#{RastroProceso1.tableRowGroup1SelectionColumn}"
                                                    id="tableRowGroup1SelectionColumn"
                                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);"
                                                    rendered="#{RastroProceso1.gestor.designing}" selectId="checkbox1">
                                                    <webuijsf:checkbox binding="#{RastroProceso1.checkbox1}" id="checkbox1"
                                                        onClick="#{RastroProceso1.gestor.scriptElegir}" selected="#{RastroProceso1.gestor.filaElegida}" toolTip="casilla de selección múltiple"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn align="center" binding="#{RastroProceso1.tableColumn1}" id="tableColumn1" rendered="#{RastroProceso1.gestor.designing}">
                                                    <webuijsf:button actionExpression="#{RastroProceso1.botonEscogerFila1_action}"
                                                        binding="#{RastroProceso1.botonEscogerFila1}"
                                                        disabled="#{RastroProceso1.gestor.funcionPickItemInhabilitada}" id="botonEscogerFila1"
                                                        imageURL="#{RastroProceso1.gestor.urlImagenEscoger}" onClick="#{RastroProceso1.gestor.scriptEscoger}"
                                                        text="escoger" toolTip="Seleccionar"/>
                                                    <webuijsf:button actionExpression="#{RastroProceso1.botonDetallarFila1_action}"
                                                        binding="#{RastroProceso1.botonDetallarFila1}"
                                                        disabled="#{RastroProceso1.gestor.funcionPickItemInhabilitada}" id="botonDetallarFila1"
                                                        imageURL="#{RastroProceso1.gestor.urlImagenDetallar}" onClick="#{RastroProceso1.gestor.scriptEscoger}"
                                                        rendered="#{RastroProceso1.gestor.detalleDisponible}" text="detallar" toolTip="Seleccionar y ver detalle"/>
                                                    <webuijsf:button actionExpression="#{RastroProceso1.botonRetornarFila1_action}"
                                                        binding="#{RastroProceso1.botonRetornarFila1}"
                                                        disabled="#{RastroProceso1.gestor.funcionReturnInhabilitada}" id="botonRetornarFila1"
                                                        imageURL="#{RastroProceso1.gestor.urlImagenRetornar}"
                                                        onClick="#{RastroProceso1.gestor.scriptRetornarRecursoActual}"
                                                        rendered="#{RastroProceso1.gestor.funcionReturnVisible}" text="retornar" toolTip="Seleccionar y retornar"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn align="right" binding="#{RastroProceso1.tableColumn2}" headerText="#" id="tableColumn2">
                                                    <webuijsf:imageHyperlink actionExpression="#{RastroProceso1.hipervinculoFila1_action}"
                                                        binding="#{RastroProceso1.hipervinculoFila1}" id="hipervinculoFila1"
                                                        imageURL="#{RastroProceso1.gestor.urlImagenFilaProcesada}"
                                                        text="#{RastroProceso1.gestor.identificacionFila}" textPosition="left" toolTip="#{RastroProceso1.gestor.toolTipImagenFilaProcesada}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn binding="#{RastroProceso1.tableColumn3}" headerText="ejecución" id="tableColumn3" sort="id_rastro_proceso">
                                                    <webuijsf:staticText binding="#{RastroProceso1.staticText1}" id="staticText1" text="#{currentRow.value['id_rastro_proceso']}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn binding="#{RastroProceso1.tableColumn4}" headerText="usuario" id="tableColumn4" sort="nombre_usuario">
                                                    <webuijsf:staticText binding="#{RastroProceso1.staticText2}" id="staticText2" text="#{currentRow.value['nombre_usuario']}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn binding="#{RastroProceso1.tableColumn5}" headerText="función" id="tableColumn5" sort="codigo_funcion">
                                                    <webuijsf:staticText binding="#{RastroProceso1.staticText3}" id="staticText3" text="#{currentRow.value['codigo_funcion']}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn binding="#{RastroProceso1.tableColumn6}" headerText="condición" id="tableColumn6" sort="codigo_condicion_eje_fun">
                                                    <webuijsf:staticText binding="#{RastroProceso1.staticText4}" id="staticText4" text="#{currentRow.value['codigo_condicion_eje_fun']}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn binding="#{RastroProceso1.tableColumn7}" headerText="fecha/hora" id="tableColumn7" sort="fecha_hora_inicio_ejecucion">
                                                    <webuijsf:staticText binding="#{RastroProceso1.staticText5}" id="staticText5" text="#{currentRow.value['fecha_hora_inicio_ejecucion']}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn headerText="grupo" id="tableColumn10" sort="id_grupo_proceso">
                                                    <webuijsf:hyperlink id="hyperlink2" onClick="#{RastroProceso1.scriptAbrirVentanaDetalleGrupoProceso}" text="#{currentRow.value['id_grupo_proceso']}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn headerText="subprocesos" id="tableColumn11" sort="subprocesos">
                                                    <webuijsf:staticText id="staticText8" text="#{currentRow.value['subprocesos']}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn binding="#{RastroProceso1.tableColumn8}" headerText="archivo" id="tableColumn8">
                                                    <webuijsf:hyperlink binding="#{RastroProceso1.hyperlink1}" id="hyperlink1"
                                                        onClick="#{RastroProceso1.scriptAbrirVentanaArchivo}" text="#{RastroProceso1.extensionNombreArchivo}" toolTip="#{RastroProceso1.urlNombreArchivo}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn binding="#{RastroProceso1.tableColumn9}" headerText="observaciones" id="tableColumn9" sort="descripcion_error">
                                                    <webuijsf:staticText binding="#{RastroProceso1.staticText7}" id="staticText7" text="#{currentRow.value['descripcion_error']}"/>
                                                </webuijsf:tableColumn>
                                            </webuijsf:tableRowGroup>
                                        </webuijsf:table>
                                        <h:panelGrid binding="#{RastroProceso1.gridPanel2}" id="gridPanel2">
                                            <h:panelGrid binding="#{RastroProceso1.gridPanel3}" columns="2" id="gridPanel3">
                                                <h:panelGrid binding="#{RastroProceso1.gridFilasPorPagina1}" id="gridFilasPorPagina1">
                                                    <webuijsf:label binding="#{RastroProceso1.etiquetaTextoFilasPorPagina1}" for="textoFilasPorPagina1"
                                                        id="etiquetaTextoFilasPorPagina1" text="Filas por página"/>
                                                </h:panelGrid>
                                                <h:panelGrid binding="#{RastroProceso1.gridFilasPorPagina2}" columns="5" id="gridFilasPorPagina2">
                                                    <webuijsf:textField binding="#{RastroProceso1.textoFilasPorPagina1}" columns="2"
                                                        converter="#{RastroProceso1.textoFilasPorPagina1Converter1}"
                                                        disabled="#{RastroProceso1.gestor.paginacionInhabilitada}" id="textoFilasPorPagina1" maxLength="2"
                                                        text="#{RastroProceso1.gestor.filasPorPagina}" validatorExpression="#{RastroProceso1.textoFilasPorPagina1Validator1.validate}"/>
                                                    <webuijsf:button actionExpression="#{RastroProceso1.botonRepaginar1_action}"
                                                        binding="#{RastroProceso1.botonRepaginar1}" id="botonRepaginar1"
                                                        imageURL="#{RastroProceso1.gestor.urlImagenRepaginar}"
                                                        onClick="#{RastroProceso1.gestor.scriptRepaginar}" text="Repaginar" toolTip="Repaginar"/>
                                                    <webuijsf:message binding="#{RastroProceso1.message1}" for="textoFilasPorPagina1" id="message1"
                                                        showDetail="false" showSummary="true"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{RastroProceso1.gridPanel4}" columns="10" id="gridPanel4">
                                                <webuijsf:button actionExpression="#{RastroProceso1.botonRefrescar1_action}"
                                                    binding="#{RastroProceso1.botonRefrescar1}" disabled="#{RastroProceso1.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1" onClick="#{RastroProceso1.gestor.scriptRefrescar}" styleClass="pdq-button-1"
                                                    text="Refrescar" toolTip="Refrescar"/>
                                                <webuijsf:button actionExpression="#{RastroProceso1.botonRetornar1_action}"
                                                    binding="#{RastroProceso1.botonRetornar1}"
                                                    disabled="#{RastroProceso1.gestor.funcionReturnFilaEscogidaInhabilitada}" id="botonRetornar1"
                                                    onClick="#{RastroProceso1.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{RastroProceso1.gestor.funcionReturnVisible}" styleClass="pdq-button-1" text="Retornar" toolTip="Retornar"/>
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
                        <webuijsf:anchor binding="#{RastroProceso1.anclaPie1}" id="anclaPie1"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
