<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page binding="#{Password.page1}" id="page1">
            <webuijsf:html binding="#{Password.html1}" id="html1">
                <webuijsf:head binding="#{Password.head1}" id="head1" title="#{ApplicationBean1.nombreAplicacion}">
                    <webuijsf:link binding="#{Password.link1}" id="link1" url="/resources/stylesheet.css"/>
                    <webuijsf:script binding="#{Password.script1}" id="script1" url="/resources/javascript1.js"/>
                </webuijsf:head>
                <webuijsf:body binding="#{Password.body1}" id="body1" onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}" onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}" styleClass="pdq-body-1">
                    <webuijsf:form binding="#{Password.form1}" id="form1" virtualFormsConfig="virtualForm1 | passwordField1 passwordField2 | , virtualForm2 | | , virtualForm3 | | botonEditar1 , virtualForm4 | | botonDescartar1 botonRetornar1">
                        <div class="pos-div-cab-1">
                            <jsp:directive.include file="FragmentoCabeza1.jspf"/>
                        </div>
                        <div class="pos-div-cab-2">
                            <jsp:directive.include file="FragmentoCabeza2P.jspf"/>
                        </div>
                        <div class="pos-div-fork">
                            <div class="pos-div-col-izq">
                                <jsp:directive.include file="FragmentoColumnaIzquierda.jspf"/>
                            </div>
                            <div class="pos-div-col-der">
                                <div class="pos-div-cab-3">
                                    <jsp:directive.include file="FragmentoCabeza3.jspf"/>
                                    <webuijsf:breadcrumbs binding="#{Password.breadcrumbs1}" id="breadcrumbs1" rendered="#{Password.gestor.designing}" styleClass="pdq-breadcrumbs-1"/>
                                </div>
                                <div class="pos-div-detalle">
                                    <h:panelGrid binding="#{Password.gridPanel1}" id="gridPanel1">
                                        <h:panelGrid binding="#{Password.gridPanel3}" id="gridPanel3">
                                            <h:panelGrid binding="#{Password.gridPanel4}" columns="5" id="gridPanel4">
                                                <webuijsf:image binding="#{Password.imagenMensaje1}" id="imagenMensaje1" url="#{Password.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink align="middle" binding="#{Password.hipervinculoMensaje1}" id="hipervinculoMensaje1"
                                                    text="#{Password.gestor.mensaje}" url="#{Password.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <h:panelGrid binding="#{Password.gridPanel2}" columns="2" id="gridPanel2" rendered="#{Password.gestor.filaDisponible}" styleClass="pdq-grid-detalle-1">
                                            <h:panelGrid binding="#{Password.gridPanel11}" id="gridPanel11" styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label binding="#{Password.label4}" id="label4" text="contraseña"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{Password.gridPanel12}" columns="5" id="gridPanel12">
                                                <webuijsf:passwordField binding="#{Password.passwordField1}" columns="40" id="passwordField1" maxLength="32"
                                                    password="#{Password.usuarioDataProvider.passwordUsuario}" readOnly="#{Password.gestor.filaNoProcesada}" required="true"/>
                                                <webuijsf:message binding="#{Password.message2}" for="passwordField1" id="message2" showDetail="false" showSummary="true"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{Password.gridPanel13}" id="gridPanel13" styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label binding="#{Password.label5}" id="label5" text="confirmación"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{Password.gridPanel14}" columns="5" id="gridPanel14">
                                                <webuijsf:passwordField binding="#{Password.passwordField2}" columns="40" id="passwordField2" maxLength="32"
                                                    readOnly="#{Password.gestor.filaNoProcesada}" required="true" validatorExpression="#{Password.passwordField2_validate}"/>
                                                <webuijsf:message binding="#{Password.message3}" for="passwordField2" id="message3" showDetail="false" showSummary="true"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <h:panelGrid binding="#{Password.gridPanel28}" id="gridPanel28">
                                            <h:panelGrid binding="#{Password.gridPanel5}" id="gridPanel5">
                                                <webuijsf:anchor binding="#{Password.anchor1}" id="anchor1"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{Password.gridPanel29}" columns="10" id="gridPanel29">
                                                <webuijsf:button actionExpression="#{Password.botonEditar1_action}" binding="#{Password.botonEditar1}"
                                                    disabled="#{Password.gestor.funcionUpdateInhabilitada}" id="botonEditar1"
                                                    onClick="#{Password.gestor.scriptEditar}" styleClass="pdq-button-1" text="Editar" toolTip="Editar"/>
                                                <webuijsf:button actionExpression="#{Password.botonConfirmar1_action}" binding="#{Password.botonConfirmar1}"
                                                    disabled="#{Password.gestor.funcionCommitInhabilitada}" id="botonConfirmar1"
                                                    onClick="#{Password.gestor.scriptConfirmar}" styleClass="pdq-button-1" text="Confirmar" toolTip="Confirmar"/>
                                                <webuijsf:button actionExpression="#{Password.botonDescartar1_action}" binding="#{Password.botonDescartar1}"
                                                    disabled="#{Password.gestor.funcionRevertInhabilitada}" id="botonDescartar1"
                                                    onClick="#{Password.gestor.scriptDescartar}" styleClass="pdq-button-1" text="Descartar" toolTip="Descartar"/>
                                                <webuijsf:button actionExpression="#{Password.botonRetornar1_action}" binding="#{Password.botonRetornar1}"
                                                    disabled="#{Password.gestor.funcionReturnFilaEscogidaInhabilitada}" id="botonRetornar1"
                                                    onClick="#{Password.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{Password.gestor.funcionReturnVisible}" styleClass="pdq-button-1" text="Retornar" toolTip="Retornar"/>
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
                        <webuijsf:anchor binding="#{Password.anclaPie1}" id="anclaPie1"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
