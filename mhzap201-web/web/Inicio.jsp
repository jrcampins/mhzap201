<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page binding="#{Inicio.page1}" id="page1">
            <webuijsf:html binding="#{Inicio.html1}" id="html1">
                <webuijsf:head binding="#{Inicio.head1}" id="head1" title="#{ApplicationBean1.nombreAplicacion}">
                    <webuijsf:link binding="#{Inicio.link1}" id="link1" url="/resources/stylesheet.css"/>
                    <webuijsf:script binding="#{Inicio.script1}" id="script1" url="/resources/javascript1.js"/>
                </webuijsf:head>
                <webuijsf:body binding="#{Inicio.body1}" id="body1" onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}" styleClass="pdq-body-1">
                    <webuijsf:form binding="#{Inicio.form1}" id="form1">
                        <div class="pos-div-cab-1">
                            <h:panelGrid binding="#{Inicio.gridPanel5}" columns="2" id="gridPanel5" style="width: 100%">
                                <webuijsf:image binding="#{Inicio.image1}" id="image1" onClick="#{Inicio.scriptAbrirHomePage}" url="resources/masthead_left.jpg"/>
                                <webuijsf:image binding="#{Inicio.image2}" id="image2" onClick="#{Inicio.scriptAbrirHomePage}" style="float: right" url="resources/masthead_right.jpg"/>
                            </h:panelGrid>
                        </div>
                        <div class="pos-div-cab-2">
                            <jsp:directive.include file="FragmentoCabeza2I.jspf"/>
                        </div>
                        <div class="pos-div-fork-v1">
                            <div class="pos-div-col-izq-v1">
                                <h:panelGrid binding="#{Inicio.gridPanel2}" columns="1" id="gridPanel2" style="text-align: center; width: 200px">
                                    <webuijsf:image binding="#{Inicio.image3}" id="image3" onClick="#{Inicio.scriptAbrirHomePage}" url="resources/mastbody.jpg"/>
                                </h:panelGrid>
                            </div>
                            <div class="pos-div-col-der-v1">
                                <div class="pos-div-cab-3">
                                    <h:panelGrid binding="#{Inicio.gridPanel3}" id="gridPanel3" style="width: 100%">
                                        <webuijsf:staticText binding="#{Inicio.staticText2}" id="staticText2"
                                            style="font-weight: bold" text="#{ApplicationBean1.nombreAplicacion}"/>
                                    </h:panelGrid>
                                </div>
                                <div class="pos-div-detalle">
                                    <h:panelGrid binding="#{Inicio.gridPanel1}" columns="3" id="gridPanel1" style="text-align: justify; width: 100%">
                                        <webuijsf:staticText binding="#{Inicio.staticText4}" id="staticText4" rendered="false" text="Explicación breve de la funciones del proyecto"/>
                                    </h:panelGrid>
                                </div>
                                <div class="pos-div-pie-3">
                                    <h:panelGrid binding="#{Inicio.gridPanel4}" id="gridPanel4" style="width: 100%">
                                        <webuijsf:hyperlink actionExpression="#{Inicio.hyperlink1_action}" binding="#{Inicio.hyperlink1}" id="hyperlink1"
                                            target="#{Inicio.defaultWindowName}" text="Haga clic aquí para ir al Menú" url="#{Inicio.urlMenu}"/>
                                        <webuijsf:hyperlink actionExpression="#{Inicio.hyperlink2_action}" id="hyperlink2"
                                            target="#{Inicio.defaultWindowName}" text="Haga clic aquí para ir a su lista de Favoritos" url="#{Inicio.urlFavoritos}"/>
                                    </h:panelGrid>
                                </div>
                            </div>
                            <div class="pos-div-join-v1">
                                <jsp:directive.include file="FragmentoJoin.jspf"/>
                            </div>
                        </div>
                        <div class="pos-div-pie-3">
                            <jsp:directive.include file="FragmentoPie3.jspf"/>
                        </div>
                        <div class="pos-div-pie-2">
                            <jsp:directive.include file="FragmentoPie2.jspf"/>
                        </div>
                        <div class="pos-div-pie-1">
                            <webuijsf:staticText binding="#{Inicio.staticText1}" id="staticText1" rendered="false"
                                style="font-size: smaller" text="Copyright (C) 2008, Consultores Independientes EGT, C.A."/>
                        </div>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
