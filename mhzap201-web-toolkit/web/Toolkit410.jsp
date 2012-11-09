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
        <webuijsf:page binding="#{Toolkit410.page1}" id="page1">
            <webuijsf:html binding="#{Toolkit410.html1}" id="html1">
                <webuijsf:head binding="#{Toolkit410.head1}" id="head1" title="#{ApplicationBean1.nombreAplicacion}">
                    <webuijsf:link binding="#{Toolkit410.link1}" id="link1" url="/resources/stylesheet.css"/>
                    <webuijsf:script binding="#{Toolkit410.script1}" id="script1" url="/resources/javascript1.js"/>
                </webuijsf:head>
                <webuijsf:body binding="#{Toolkit410.body1}" id="body1" onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}" onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}" styleClass="pdq-body-1">
                    <webuijsf:form binding="#{Toolkit410.form1}" id="form1" virtualFormsConfig="virtualForm1 | listaFuncionAccion1 campoIdAplicacion1 campoIdPagina1 | , virtualForm2 | | , virtualForm3 | listaFuncionAccion1 | listaFuncionAccion1 , virtualForm4 | | gridPanel101:gridPanel114:gridPanel116:botonGenerar1">
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
                                    <webuijsf:breadcrumbs binding="#{Toolkit410.breadcrumbs1}" id="breadcrumbs1" styleClass="pdq-breadcrumbs-1"/>
                                </div>
                                <div class="pos-div-detalle">
                                    <h:panelGrid binding="#{Toolkit410.gridPanel101}" id="gridPanel101">
                                        <h:panelGrid binding="#{Toolkit410.gridPanel102}" id="gridPanel102">
                                            <h:panelGrid binding="#{Toolkit410.gridPanel103}" columns="2" id="gridPanel103">
                                                <webuijsf:image binding="#{Toolkit410.imagenMensaje1}" id="imagenMensaje1" url="#{Toolkit410.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink align="middle" binding="#{Toolkit410.hipervinculoMensaje1}" id="hipervinculoMensaje1"
                                                    text="#{Toolkit410.gestor.mensaje}" url="#{Toolkit410.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <h:panelGrid binding="#{Toolkit410.gridPanel104}" columns="2" id="gridPanel104" styleClass="pdq-grid-detalle-1">
                                            <h:panelGrid binding="#{Toolkit410.gridPanel105}" id="gridPanel105" styleClass="pdq-grid-detalle-botones">
                                                <h:panelGrid binding="#{Toolkit410.gridPanel106}" id="gridPanel106">
                                                    <webuijsf:anchor binding="#{Toolkit410.ancla1}" id="ancla1"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{Toolkit410.gridPanel107}" id="gridPanel107" styleClass="pdq-grid-detalle-mensajes">
                                                <h:panelGrid binding="#{Toolkit410.gridPanel108}" id="gridPanel108" styleClass="pdq-grid-detalle-mensajes-2">
                                                    <webuijsf:staticText binding="#{Toolkit410.textoTitulo1}" id="textoTitulo1" styleClass="pdq-text-titulo-1"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{Toolkit410.gridPanel109}" id="gridPanel109" styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label binding="#{Toolkit410.etiquetaListaFuncionAccion1}" for="listaFuncionAccion1"
                                                    id="etiquetaListaFuncionAccion1" text="#{Toolkit410.gestor.i18n.textoEtiquetaListaFuncionAccion}"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{Toolkit410.gridPanel110}" columns="5" id="gridPanel110" styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown binding="#{Toolkit410.listaFuncionAccion1}"
                                                    converter="#{Toolkit410.converterListaFuncionAccion1}" id="listaFuncionAccion1"
                                                    items="#{Toolkit410.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme4_2.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');" required="true"
                                                    selected="#{Toolkit410.gestor.valorListaFuncionAccion1}" toolTip="#{Toolkit410.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:staticText binding="#{Toolkit410.listaFuncionAccion1Texto1}" id="listaFuncionAccion1Texto1"/>
                                                <webuijsf:message binding="#{Toolkit410.messageListaFuncionAccion1}" for="listaFuncionAccion1" id="messageListaFuncionAccion1"/>
                                                <webuijsf:helpInline binding="#{Toolkit410.helpInlineListaFuncionAccion1}" id="helpInlineListaFuncionAccion1"
                                                    styleClass="pdq-helpInline-page" text="#{Toolkit410.gestor.i18n.inlineHelpListaFuncionAccion}"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{Toolkit410.gridIdAplicacion1}" id="gridIdAplicacion1"
                                                rendered="#{Toolkit410.bitIdAplicacionRendered.on}" styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label binding="#{Toolkit410.labelIdAplicacion1}" for="campoIdAplicacion1" id="labelIdAplicacion1" text="aplicacion"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{Toolkit410.gridIdAplicacion2}" columns="5" id="gridIdAplicacion2"
                                                rendered="#{Toolkit410.bitIdAplicacionRendered.on}" styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField binding="#{Toolkit410.campoIdAplicacion1}" columns="50" id="campoIdAplicacion1"
                                                    required="true" text="#{Toolkit410.textoCampoIdAplicacion1}"
                                                    toolTip="#{Toolkit410.toolTipCampoIdAplicacion1}" validatorExpression="#{Toolkit410.campoIdAplicacion1_validate}"/>
                                                <webuijsf:staticText binding="#{Toolkit410.campoIdAplicacion1Texto1}" id="campoIdAplicacion1Texto1"/>
                                                <webuijsf:button binding="#{Toolkit410.campoIdAplicacion1Boton1}" id="campoIdAplicacion1Boton1" onClick="#{Toolkit410.scriptCampoIdAplicacion1Boton1}"/>
                                                <webuijsf:message binding="#{Toolkit410.messageIdAplicacion1}" for="campoIdAplicacion1" id="messageIdAplicacion1"/>
                                                <webuijsf:helpInline binding="#{Toolkit410.campoIdAplicacion1Ayuda1}" id="campoIdAplicacion1Ayuda1"
                                                    styleClass="pdq-helpInline-field" text="Código de la aplicación que desea procesar" type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{Toolkit410.gridIdAplicacion3}" id="gridIdAplicacion3"
                                                rendered="#{Toolkit410.bitIdAplicacionRendered.on}" styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label binding="#{Toolkit410.labelIdAplicacion2}" id="labelIdAplicacion2" styleClass="pdq-estilo-id-2" text="nombre aplicacion"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{Toolkit410.gridIdAplicacion4}" columns="5" id="gridIdAplicacion4"
                                                rendered="#{Toolkit410.bitIdAplicacionRendered.on}" styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText binding="#{Toolkit410.campoIdAplicacion1Texto2}" id="campoIdAplicacion1Texto2"/>
                                                <webuijsf:button binding="#{Toolkit410.campoIdAplicacion1Boton2}" id="campoIdAplicacion1Boton2" onClick="#{Toolkit410.scriptCampoIdAplicacion1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{Toolkit410.gridIdPagina1}" id="gridIdPagina1"
                                                rendered="#{Toolkit410.bitIdPaginaRendered.on}" styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label binding="#{Toolkit410.labelIdPagina1}" for="campoIdPagina1" id="labelIdPagina1" text="pagina"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{Toolkit410.gridIdPagina2}" columns="5" id="gridIdPagina2"
                                                rendered="#{Toolkit410.bitIdPaginaRendered.on}" styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField binding="#{Toolkit410.campoIdPagina1}" columns="50" id="campoIdPagina1" required="true"
                                                    text="#{Toolkit410.textoCampoIdPagina1}" toolTip="#{Toolkit410.toolTipCampoIdPagina1}" validatorExpression="#{Toolkit410.campoIdPagina1_validate}"/>
                                                <webuijsf:staticText binding="#{Toolkit410.campoIdPagina1Texto1}" id="campoIdPagina1Texto1"/>
                                                <webuijsf:button binding="#{Toolkit410.campoIdPagina1Boton1}" id="campoIdPagina1Boton1" onClick="#{Toolkit410.scriptCampoIdPagina1Boton1}"/>
                                                <webuijsf:message binding="#{Toolkit410.messageIdPagina1}" for="campoIdPagina1" id="messageIdPagina1"/>
                                                <webuijsf:helpInline binding="#{Toolkit410.campoIdPagina1Ayuda1}" id="campoIdPagina1Ayuda1"
                                                    styleClass="pdq-helpInline-field" text="Código de la página que desea procesar" type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{Toolkit410.gridIdPagina3}" id="gridIdPagina3"
                                                rendered="#{Toolkit410.bitIdPaginaRendered.on}" styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label binding="#{Toolkit410.labelIdPagina2}" id="labelIdPagina2" styleClass="pdq-estilo-id-2" text="nombre pagina"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{Toolkit410.gridIdPagina4}" columns="5" id="gridIdPagina4"
                                                rendered="#{Toolkit410.bitIdPaginaRendered.on}" styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText binding="#{Toolkit410.campoIdPagina1Texto2}" id="campoIdPagina1Texto2"/>
                                                <webuijsf:button binding="#{Toolkit410.campoIdPagina1Boton2}" id="campoIdPagina1Boton2" onClick="#{Toolkit410.scriptCampoIdPagina1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{Toolkit410.gridPanel111}" id="gridPanel111" styleClass="pdq-grid-detalle-botones">
                                                <h:panelGrid binding="#{Toolkit410.gridPanel112}" id="gridPanel112">
                                                    <webuijsf:anchor binding="#{Toolkit410.ancla2}" id="ancla2"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{Toolkit410.gridPanel113}" id="gridPanel113" styleClass="pdq-grid-detalle-mensajes">
                                                <webuijsf:staticText binding="#{Toolkit410.textoMensaje1}" id="textoMensaje1" style="font-weight: bold"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <h:panelGrid binding="#{Toolkit410.gridPanel114}" id="gridPanel114">
                                            <h:panelGrid binding="#{Toolkit410.gridPanel115}" id="gridPanel115">
                                                <webuijsf:anchor binding="#{Toolkit410.anchor1}" id="anchor1"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{Toolkit410.gridPanel116}" columns="4" id="gridPanel116">
                                                <webuijsf:button actionExpression="#{Toolkit410.botonAplicar1_action}" binding="#{Toolkit410.botonAplicar1}"
                                                    id="botonAplicar1" styleClass="pdq-button-1" text="#{Toolkit410.gestor.i18n.textoBotonAplicar}" toolTip="#{Toolkit410.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button actionExpression="#{Toolkit410.botonProcesar1_action}" binding="#{Toolkit410.botonProcesar1}"
                                                    id="botonProcesar1" styleClass="pdq-button-1" text="#{Toolkit410.gestor.i18n.textoBotonProcesar}" toolTip="#{Toolkit410.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button actionExpression="#{Toolkit410.botonGenerar1_action}" id="botonGenerar1"
                                                    onClick="#{Toolkit410.scriptGenerar}" styleClass="pdq-button-1" text="Generar"/>
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
                        <webuijsf:anchor binding="#{Toolkit410.anclaPie1}" id="anclaPie1"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
