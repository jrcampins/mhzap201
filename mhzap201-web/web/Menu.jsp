<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <!-- <html xmlns="http://www.w3.org/1999/xhtml"> -->
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page binding="#{Menu.page1}" id="page1">
            <webuijsf:html binding="#{Menu.html1}" id="html1">
                <webuijsf:head binding="#{Menu.head1}" id="head1" title="#{ApplicationBean1.nombreAplicacion}">
                    <webuijsf:link binding="#{Menu.link1}" id="link1" url="/resources/stylesheet.css"/>
                    <webuijsf:script binding="#{Menu.script1}" id="script1" url="/resources/javascript1.js"/>
                </webuijsf:head>
                <webuijsf:body binding="#{Menu.body1}" id="body1" onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}" onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}" styleClass="pdq-body-1">
                    <webuijsf:form binding="#{Menu.form1}" id="form1" virtualFormsConfig="virtualForm1 | | , virtualForm2 | listaOpcionZum1 | botonAplicarZum1 botonQuitarZum1 , virtualForm3 | | , virtualForm4 | |">
                        <div class="pos-div-cab-1">
                            <jsp:directive.include file="FragmentoCabeza1.jspf"/>
                        </div>
                        <div class="pos-div-cab-2">
                            <jsp:directive.include file="FragmentoCabeza2M.jspf"/>
                        </div>
                        <div class="pos-div-fork">
                            <div class="pos-div-col-izq">
                                <jsp:directive.include file="FragmentoColumnaIzquierda.jspf"/>
                            </div>
                            <div class="pos-div-col-der">
                                <div class="pos-div-cab-3">
                                    <jsp:directive.include file="FragmentoCabeza3.jspf"/>
                                    <webuijsf:breadcrumbs binding="#{Menu.breadcrumbs1}" id="breadcrumbs1" rendered="false" styleClass="pdq-breadcrumbs-1"/>
                                </div>
                                <div class="pdq-div-filtro-1">
                                    <h:panelGrid binding="#{Menu.gridPanel7}" columns="10" id="gridPanel7" rendered="#{Menu.gestor.designing}" style="height: 36px">
                                        <webuijsf:label binding="#{Menu.etiquetaListaOpcionZum1}" for="listaOpcionZum1" id="etiquetaListaOpcionZum1" text="Zum"/>
                                        <webuijsf:dropDown binding="#{Menu.listaOpcionZum1}" converter="#{Menu.integerConverter1}" id="listaOpcionZum1"
                                            items="#{Menu.gestor.opcionesZumNodo}" required="true" selected="#{Menu.opcionZumSeleccionada}"/>
                                        <webuijsf:button actionExpression="#{Menu.botonAplicarZum1_action}" binding="#{Menu.botonAplicarZum1}"
                                            id="botonAplicarZum1" styleClass="pdq-button-1" text="Aplicar"/>
                                        <webuijsf:button actionExpression="#{Menu.botonQuitarZum1_action}" binding="#{Menu.botonQuitarZum1}"
                                            id="botonQuitarZum1" styleClass="pdq-button-1" text="Quitar"/>
                                    </h:panelGrid>
                                </div>
                                <div class="pos-div-detalle">
                                    <h:panelGrid binding="#{Menu.gridPanel1}" id="gridPanel1">
                                        <webuijsf:tree binding="#{Menu.tree1}" id="tree1" style="#{Menu.gestor.estiloArbol}" styleClass="pdq-body-1"/>
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
                        <webuijsf:anchor binding="#{Menu.anclaPie1}" id="anclaPie1"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
    <!-- </html> -->
</jsp:root>
