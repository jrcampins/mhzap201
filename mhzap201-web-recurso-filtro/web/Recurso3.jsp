<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page binding="#{Recurso3.page1}" id="page1">
            <webuijsf:html binding="#{Recurso3.html1}" id="html1">
                <webuijsf:head binding="#{Recurso3.head1}" id="head1" title="#{ApplicationBean1.nombreAplicacion}">
                    <webuijsf:link binding="#{Recurso3.link1}" id="link1" url="/resources/stylesheet.css"/>
                    <webuijsf:script binding="#{Recurso3.script1}" id="script1" url="/resources/javascript1.js"/>
                </webuijsf:head>
                <webuijsf:body binding="#{Recurso3.body1}" id="body1" onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}" onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}" styleClass="pdq-body-1">
                    <webuijsf:form binding="#{Recurso3.form1}" id="form1" virtualFormsConfig="virtualForm1 | | , virtualForm2 | listaOpcionZum1 | botonAplicarZum1 botonQuitarZum1 , virtualForm3 | | , virtualForm4 | | botonRefrescar1 botonRetornar1">
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
                                    <webuijsf:breadcrumbs binding="#{Recurso3.breadcrumbs1}" id="breadcrumbs1" styleClass="pdq-breadcrumbs-1"/>
                                </div>
                                <div class="pdq-div-filtro-1">
                                    <h:panelGrid binding="#{Recurso3.gridPanel7}" columns="10" id="gridPanel7">
                                        <webuijsf:label binding="#{Recurso3.etiquetaListaOpcionZum1}" id="etiquetaListaOpcionZum1" text="Zum"/>
                                        <webuijsf:dropDown binding="#{Recurso3.listaOpcionZum1}" converter="#{Recurso3.integerConverter1}" id="listaOpcionZum1"
                                            items="#{Recurso3.gestor.opcionesZumNodo}" required="true" selected="#{Recurso3.opcionZumSeleccionada}"/>
                                        <webuijsf:button actionExpression="#{Recurso3.botonAplicarZum1_action}" binding="#{Recurso3.botonAplicarZum1}"
                                            id="botonAplicarZum1" styleClass="pdq-button-1" text="Aplicar"/>
                                        <webuijsf:button actionExpression="#{Recurso3.botonQuitarZum1_action}" binding="#{Recurso3.botonQuitarZum1}"
                                            id="botonQuitarZum1" styleClass="pdq-button-1" text="Quitar"/>
                                    </h:panelGrid>
                                </div>
                                <div class="pos-div-detalle">
                                    <h:panelGrid binding="#{Recurso3.gridPanel1}" id="gridPanel1">
                                        <h:panelGrid binding="#{Recurso3.gridPanel5}" id="gridPanel5">
                                            <h:panelGrid binding="#{Recurso3.gridPanel6}" columns="5" id="gridPanel6">
                                                <webuijsf:image binding="#{Recurso3.imagenMensaje1}" id="imagenMensaje1" url="#{Recurso3.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink align="middle" binding="#{Recurso3.hipervinculoMensaje1}" id="hipervinculoMensaje1"
                                                    text="#{Recurso3.gestor.mensaje}" url="#{Recurso3.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:tree binding="#{Recurso3.tree1}" id="tree1" style="#{Recurso3.gestor.estiloArbol}" styleClass="pdq-tree-1"/>
                                        <h:panelGrid binding="#{Recurso3.gridPanel2}" id="gridPanel2">
                                            <h:panelGrid binding="#{Recurso3.gridPanel3}" id="gridPanel3">
                                                <webuijsf:anchor binding="#{Recurso3.anchor1}" id="anchor1"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{Recurso3.gridPanel4}" columns="10" id="gridPanel4">
                                                <webuijsf:button actionExpression="#{Recurso3.botonRefrescar1_action}" binding="#{Recurso3.botonRefrescar1}"
                                                    disabled="#{Recurso3.gestor.funcionSelectInhabilitada}" id="botonRefrescar1"
                                                    onClick="#{Recurso3.gestor.scriptRefrescar}" styleClass="pdq-button-1" text="Refrescar" toolTip="Refrescar"/>
                                                <webuijsf:button actionExpression="#{Recurso3.botonRetornar1_action}" binding="#{Recurso3.botonRetornar1}"
                                                    disabled="#{Recurso3.gestor.funcionReturnFilaEscogidaInhabilitada}" id="botonRetornar1"
                                                    onClick="#{Recurso3.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{Recurso3.gestor.funcionReturnVisible}" styleClass="pdq-button-1" text="Retornar" toolTip="Retornar"/>
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
                        <webuijsf:anchor binding="#{Recurso3.anclaPie1}" id="anclaPie1"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
