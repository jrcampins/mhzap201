<?xml version="1.0" encoding="UTF-8"?>
<!--
   Copyright (C) 2010, EGT Consultores, C.A.
   Este archivo fue totalmente generado utilizando herramientas de software de EGT Consultores, C.A.
   En consecuencia, partes del archivo podrian ser similares o hasta iguales a las de archivos de
   programas de otros clientes, generados por las mismas herramientas; por lo tanto, esta similitud
   no podra ser considerada como violacion del copyright.
   Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
   de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
   Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
   vea la licencia "GNU General Public License" para obtener mas informacion.
-->
<jsp:root version="2.1"
    xmlns:f="http://java.sun.com/jsf/core"
    xmlns:h="http://java.sun.com/jsf/html"
    xmlns:jsp="http://java.sun.com/JSP/Page" 
    xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page id="page1">
            <webuijsf:html id="html1">
                <webuijsf:head id="head1" title="#{ApplicationBean1.nombreAplicacion}">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                    <webuijsf:script id="script1" url="/resources/javascript1.js"/>
                </webuijsf:head>
                <webuijsf:body 
                    focus="#{PotencialBen4.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{PotencialBen4.gestor.preserveFocus}"
                    preserveScroll="#{PotencialBen4.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{PotencialBen4.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | listaFuncionAccion1 campoIdPotencialBen1 campoIdPersona1 campoIdFuncionarioValidacionCen1 campoComentariosValidacionCenso1 listaNumeroCausaInvCenso1 campoOtraCausaInvCenso1 campoComentariosReclamoCenso1 campoComentariosAprReclCen1 listaNumeroCausaDenReclCen1 campoOtraCausaDenReclCen1 campoComentariosDenReclCen1 campoFechaUltimaVisitaCenso1 campoIdFuncionarioUltVisitaCen1 campoObservacionesUltVisitaCen1 campoIdDepartamento1 campoIdDistrito1 campoIdBarrio1 listaNumeroTipoArea1 campoFechaRegistroPotBenDesde1 campoFechaRegistroPotBenHasta1 campoIndiceCalidadVidaDesde1 campoIndiceCalidadVidaHasta1 campoFechaValidacionCensoDesde1 campoFechaValidacionCensoHasta1 listaNumeroCondicionCenso1 campoLote1 campoEdadDesde1 campoEdadHasta1 | , virtualForm2 | | , virtualForm3 | listaFuncionAccion1 | listaFuncionAccion1 , virtualForm4 | | ">
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
                                    <webuijsf:breadcrumbs 
                                        binding="#{PotencialBen4.breadcrumbs1}" 
                                        id="breadcrumbs1" 
                                        styleClass="pdq-breadcrumbs-1"/>
                                </div>
                                <div class="pos-div-detalle">
                                    <h:panelGrid 
                                        id="gridPanel101">
                                        <h:panelGrid 
                                            id="gridPanel102">
                                            <h:panelGrid 
                                                columns="2" 
                                                id="gridPanel103">
                                                <webuijsf:image
                                                    id="imagenMensaje1"
                                                    rendered="#{PotencialBen4.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{PotencialBen4.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{PotencialBen4.gestor.mensajeDisponible}"
                                                    text="#{PotencialBen4.gestor.mensaje}"
                                                    url="#{PotencialBen4.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            columns="2"
                                            id="gridPanel104"
                                            styleClass="pdq-grid-detalle-1">
                                            <h:panelGrid
                                                id="gridPanel105"
                                                styleClass="pdq-grid-detalle-botones">
                                                <h:panelGrid 
                                                    id="gridPanel106">
                                                    <webuijsf:anchor 
                                                        id="ancla1"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPanel107"
                                                styleClass="pdq-grid-detalle-mensajes">
                                                <h:panelGrid
                                                    id="gridPanel108"
                                                    styleClass="pdq-grid-detalle-mensajes-2">
                                                    <webuijsf:staticText
                                                        id="textoTitulo1"
                                                        styleClass="pdq-text-titulo-1"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPanel109"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen4.etiquetaListaFuncionAccion1}"
                                                    id="etiquetaListaFuncionAccion1"
                                                    for="listaFuncionAccion1"
                                                    text="#{PotencialBen4.gestor.i18n.textoEtiquetaListaFuncionAccion}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel110"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown
                                                    binding="#{PotencialBen4.listaFuncionAccion1}"
                                                    converter="#{PotencialBen4.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{PotencialBen4.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme4_2.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    required="true"
                                                    selected="#{PotencialBen4.gestor.valorListaFuncionAccion1}"
                                                    toolTip="#{PotencialBen4.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:staticText
                                                    binding="#{PotencialBen4.listaFuncionAccion1Texto1}"
                                                    id="listaFuncionAccion1Texto1"/>
                                                <webuijsf:message
                                                    for="listaFuncionAccion1"
                                                    id="messageListaFuncionAccion1"/>
                                                <webuijsf:helpInline
                                                    binding="#{PotencialBen4.helpInlineListaFuncionAccion1}"
                                                    id="helpInlineListaFuncionAccion1"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-page"
                                                    text="#{PotencialBen4.gestor.i18n.inlineHelpListaFuncionAccion}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdPotencialBen1" rendered="#{PotencialBen4.bitIdPotencialBenRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen4.labelIdPotencialBen1}"
                                                    id="labelIdPotencialBen1"
                                                    for="campoIdPotencialBen1"
                                                    text="potencial beneficiario"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdPotencialBen2" rendered="#{PotencialBen4.bitIdPotencialBenRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdPotencialBen1"
                                                    binding="#{PotencialBen4.campoIdPotencialBen1}"
                                                     required="true"
                                                    text="#{PotencialBen4.textoCampoIdPotencialBen1}"
                                                    toolTip="#{PotencialBen4.toolTipCampoIdPotencialBen1}"
                                                    validatorExpression="#{PotencialBen4.campoIdPotencialBen1_validate}"/>
                                                <webuijsf:staticText id="campoIdPotencialBen1Texto1"
                                                    binding="#{PotencialBen4.campoIdPotencialBen1Texto1}"/>
                                                <webuijsf:button id="campoIdPotencialBen1Boton1"
                                                    binding="#{PotencialBen4.campoIdPotencialBen1Boton1}"
                                                    onClick="#{PotencialBen4.scriptCampoIdPotencialBen1Boton1}"/>
                                                <webuijsf:button id="campoIdPotencialBen1Boton3"
                                                    binding="#{PotencialBen4.campoIdPotencialBen1Boton3}"
                                                    onClick="#{PotencialBen4.scriptCampoIdPotencialBen1Boton2}"
                                                    rendered="#{PotencialBen4.bitCampoIdPotencialBen1Boton3Rendered.on}"/>
                                                <webuijsf:message id="messageIdPotencialBen1"
                                                    for="campoIdPotencialBen1"/>
                                                <webuijsf:helpInline id="helpInlineIdPotencialBen1"
                                                    binding="#{PotencialBen4.helpInlineIdPotencialBen1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdPotencialBen3"
                                                rendered="#{PotencialBen4.bitCampoIdPotencialBen1Boton2Rendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen4.labelIdPotencialBen2}"
                                                    id="labelIdPotencialBen2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdPotencialBen4"
                                                rendered="#{PotencialBen4.bitCampoIdPotencialBen1Boton2Rendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{PotencialBen4.campoIdPotencialBen1Texto2}"
                                                    id="campoIdPotencialBen1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{PotencialBen4.campoIdPotencialBen1Boton2}"
                                                    id="campoIdPotencialBen1Boton2"
                                                    onClick="#{PotencialBen4.scriptCampoIdPotencialBen1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdPersona1" rendered="#{PotencialBen4.bitIdPersonaRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen4.labelIdPersona1}"
                                                    id="labelIdPersona1"
                                                    for="campoIdPersona1"
                                                    text="persona"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdPersona2" rendered="#{PotencialBen4.bitIdPersonaRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdPersona1"
                                                    binding="#{PotencialBen4.campoIdPersona1}"
                                                     required="true"
                                                    text="#{PotencialBen4.textoCampoIdPersona1}"
                                                    toolTip="#{PotencialBen4.toolTipCampoIdPersona1}"
                                                    validatorExpression="#{PotencialBen4.campoIdPersona1_validate}"/>
                                                <webuijsf:staticText id="campoIdPersona1Texto1"
                                                    binding="#{PotencialBen4.campoIdPersona1Texto1}"/>
                                                <webuijsf:button id="campoIdPersona1Boton1"
                                                    binding="#{PotencialBen4.campoIdPersona1Boton1}"
                                                    onClick="#{PotencialBen4.scriptCampoIdPersona1Boton1}"/>
                                                <webuijsf:button id="campoIdPersona1Boton3"
                                                    binding="#{PotencialBen4.campoIdPersona1Boton3}"
                                                    onClick="#{PotencialBen4.scriptCampoIdPersona1Boton2}"
                                                    rendered="#{PotencialBen4.bitCampoIdPersona1Boton3Rendered.on}"/>
                                                <webuijsf:message id="messageIdPersona1"
                                                    for="campoIdPersona1"/>
                                                <webuijsf:helpInline id="helpInlineIdPersona1"
                                                    binding="#{PotencialBen4.helpInlineIdPersona1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdPersona3"
                                                rendered="#{PotencialBen4.bitCampoIdPersona1Boton2Rendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen4.labelIdPersona2}"
                                                    id="labelIdPersona2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre persona"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdPersona4"
                                                rendered="#{PotencialBen4.bitCampoIdPersona1Boton2Rendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{PotencialBen4.campoIdPersona1Texto2}"
                                                    id="campoIdPersona1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{PotencialBen4.campoIdPersona1Boton2}"
                                                    id="campoIdPersona1Boton2"
                                                    onClick="#{PotencialBen4.scriptCampoIdPersona1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdFuncionarioValidacionCen1" rendered="#{PotencialBen4.bitIdFuncionarioValidacionCenRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen4.labelIdFuncionarioValidacionCen1}"
                                                    id="labelIdFuncionarioValidacionCen1"
                                                    for="campoIdFuncionarioValidacionCen1"
                                                    text="funcionario validaci&#243;n censo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdFuncionarioValidacionCen2" rendered="#{PotencialBen4.bitIdFuncionarioValidacionCenRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdFuncionarioValidacionCen1"
                                                    binding="#{PotencialBen4.campoIdFuncionarioValidacionCen1}"
                                                    text="#{PotencialBen4.textoCampoIdFuncionarioValidacionCen1}"
                                                    toolTip="#{PotencialBen4.toolTipCampoIdFuncionarioValidacionCen1}"
                                                    validatorExpression="#{PotencialBen4.campoIdFuncionarioValidacionCen1_validate}"/>
                                                <webuijsf:staticText id="campoIdFuncionarioValidacionCen1Texto1"
                                                    binding="#{PotencialBen4.campoIdFuncionarioValidacionCen1Texto1}"/>
                                                <webuijsf:button id="campoIdFuncionarioValidacionCen1Boton1"
                                                    binding="#{PotencialBen4.campoIdFuncionarioValidacionCen1Boton1}"
                                                    onClick="#{PotencialBen4.scriptCampoIdFuncionarioValidacionCen1Boton1}"/>
                                                <webuijsf:button id="campoIdFuncionarioValidacionCen1Boton3"
                                                    binding="#{PotencialBen4.campoIdFuncionarioValidacionCen1Boton3}"
                                                    onClick="#{PotencialBen4.scriptCampoIdFuncionarioValidacionCen1Boton2}"
                                                    rendered="#{PotencialBen4.bitCampoIdFuncionarioValidacionCen1Boton3Rendered.on}"/>
                                                <webuijsf:message id="messageIdFuncionarioValidacionCen1"
                                                    for="campoIdFuncionarioValidacionCen1"/>
                                                <webuijsf:helpInline id="helpInlineIdFuncionarioValidacionCen1"
                                                    binding="#{PotencialBen4.helpInlineIdFuncionarioValidacionCen1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_funcionario_validacion_cen"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdFuncionarioValidacionCen3"
                                                rendered="#{PotencialBen4.bitCampoIdFuncionarioValidacionCen1Boton2Rendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen4.labelIdFuncionarioValidacionCen2}"
                                                    id="labelIdFuncionarioValidacionCen2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre funcionario validaci&#243;n censo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdFuncionarioValidacionCen4"
                                                rendered="#{PotencialBen4.bitCampoIdFuncionarioValidacionCen1Boton2Rendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{PotencialBen4.campoIdFuncionarioValidacionCen1Texto2}"
                                                    id="campoIdFuncionarioValidacionCen1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{PotencialBen4.campoIdFuncionarioValidacionCen1Boton2}"
                                                    id="campoIdFuncionarioValidacionCen1Boton2"
                                                    onClick="#{PotencialBen4.scriptCampoIdFuncionarioValidacionCen1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridComentariosValidacionCenso1" rendered="#{PotencialBen4.bitComentariosValidacionCensoRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen4.labelComentariosValidacionCenso1}"
                                                    id="labelComentariosValidacionCenso1"
                                                    for="campoComentariosValidacionCenso1"
                                                    text="comentarios validaci&#243;n censo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridComentariosValidacionCenso2" rendered="#{PotencialBen4.bitComentariosValidacionCensoRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoComentariosValidacionCenso1"
                                                    binding="#{PotencialBen4.campoComentariosValidacionCenso1}"
                                                    columns="50"
                                                    text="#{PotencialBen4.textoCampoComentariosValidacionCenso1}"
                                                    toolTip="BundleParametros.comentarios_validacion_censo"
                                                    validatorExpression="#{PotencialBen4.validatorComentariosValidacionCenso1.validate}"/>
                                                <webuijsf:staticText id="campoComentariosValidacionCenso1Texto1"
                                                    binding="#{PotencialBen4.campoComentariosValidacionCenso1Texto1}"/>
                                                <webuijsf:message id="messageComentariosValidacionCenso1"
                                                    for="campoComentariosValidacionCenso1"/>
                                                <webuijsf:helpInline id="helpInlineComentariosValidacionCenso1"
                                                    binding="#{PotencialBen4.helpInlineComentariosValidacionCenso1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.comentarios_validacion_censo"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroCausaInvCenso1" rendered="#{PotencialBen4.bitNumeroCausaInvCensoRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen4.labelNumeroCausaInvCenso1}"
                                                    id="labelNumeroCausaInvCenso1"
                                                    for="listaNumeroCausaInvCenso1"
                                                    text="causa invalidaci&#243;n censo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroCausaInvCenso2" rendered="#{PotencialBen4.bitNumeroCausaInvCensoRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroCausaInvCenso1"
                                                    binding="#{PotencialBen4.listaNumeroCausaInvCenso1}"
                                                    converter="#{PotencialBen4.converterNumeroCausaInvCenso1}"
                                                    items="#{PotencialBen4.opcionesListaNumeroCausaInvCenso1}"
                                                     required="true"
                                                    selected="#{PotencialBen4.valorListaNumeroCausaInvCenso1}"
                                                    toolTip="BundleParametros.numero_causa_inv_censo"/>
                                                <webuijsf:staticText id="listaNumeroCausaInvCenso1Texto1"
                                                    binding="#{PotencialBen4.listaNumeroCausaInvCenso1Texto1}"/>
                                                <webuijsf:message id="messageNumeroCausaInvCenso1"
                                                    for="listaNumeroCausaInvCenso1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroCausaInvCenso1"
                                                    binding="#{PotencialBen4.helpInlineNumeroCausaInvCenso1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_causa_inv_censo"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridOtraCausaInvCenso1" rendered="#{PotencialBen4.bitOtraCausaInvCensoRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen4.labelOtraCausaInvCenso1}"
                                                    id="labelOtraCausaInvCenso1"
                                                    for="campoOtraCausaInvCenso1"
                                                    text="otra causa invalidaci&#243;n censo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridOtraCausaInvCenso2" rendered="#{PotencialBen4.bitOtraCausaInvCensoRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoOtraCausaInvCenso1"
                                                    binding="#{PotencialBen4.campoOtraCausaInvCenso1}"
                                                    columns="50"
                                                    text="#{PotencialBen4.textoCampoOtraCausaInvCenso1}"
                                                    toolTip="BundleParametros.otra_causa_inv_censo"
                                                    validatorExpression="#{PotencialBen4.validatorOtraCausaInvCenso1.validate}"/>
                                                <webuijsf:staticText id="campoOtraCausaInvCenso1Texto1"
                                                    binding="#{PotencialBen4.campoOtraCausaInvCenso1Texto1}"/>
                                                <webuijsf:message id="messageOtraCausaInvCenso1"
                                                    for="campoOtraCausaInvCenso1"/>
                                                <webuijsf:helpInline id="helpInlineOtraCausaInvCenso1"
                                                    binding="#{PotencialBen4.helpInlineOtraCausaInvCenso1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.otra_causa_inv_censo"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridComentariosReclamoCenso1" rendered="#{PotencialBen4.bitComentariosReclamoCensoRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen4.labelComentariosReclamoCenso1}"
                                                    id="labelComentariosReclamoCenso1"
                                                    for="campoComentariosReclamoCenso1"
                                                    text="comentarios reclamo censo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridComentariosReclamoCenso2" rendered="#{PotencialBen4.bitComentariosReclamoCensoRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoComentariosReclamoCenso1"
                                                    binding="#{PotencialBen4.campoComentariosReclamoCenso1}"
                                                    columns="50"
                                                     required="true"
                                                    text="#{PotencialBen4.textoCampoComentariosReclamoCenso1}"
                                                    toolTip="BundleParametros.comentarios_reclamo_censo"
                                                    validatorExpression="#{PotencialBen4.validatorComentariosReclamoCenso1.validate}"/>
                                                <webuijsf:staticText id="campoComentariosReclamoCenso1Texto1"
                                                    binding="#{PotencialBen4.campoComentariosReclamoCenso1Texto1}"/>
                                                <webuijsf:message id="messageComentariosReclamoCenso1"
                                                    for="campoComentariosReclamoCenso1"/>
                                                <webuijsf:helpInline id="helpInlineComentariosReclamoCenso1"
                                                    binding="#{PotencialBen4.helpInlineComentariosReclamoCenso1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.comentarios_reclamo_censo"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridComentariosAprReclCen1" rendered="#{PotencialBen4.bitComentariosAprReclCenRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen4.labelComentariosAprReclCen1}"
                                                    id="labelComentariosAprReclCen1"
                                                    for="campoComentariosAprReclCen1"
                                                    text="comentarios aprobaci&#243;n reclamo censo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridComentariosAprReclCen2" rendered="#{PotencialBen4.bitComentariosAprReclCenRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoComentariosAprReclCen1"
                                                    binding="#{PotencialBen4.campoComentariosAprReclCen1}"
                                                    columns="50"
                                                     required="true"
                                                    text="#{PotencialBen4.textoCampoComentariosAprReclCen1}"
                                                    toolTip="BundleParametros.comentarios_apr_recl_cen"
                                                    validatorExpression="#{PotencialBen4.validatorComentariosAprReclCen1.validate}"/>
                                                <webuijsf:staticText id="campoComentariosAprReclCen1Texto1"
                                                    binding="#{PotencialBen4.campoComentariosAprReclCen1Texto1}"/>
                                                <webuijsf:message id="messageComentariosAprReclCen1"
                                                    for="campoComentariosAprReclCen1"/>
                                                <webuijsf:helpInline id="helpInlineComentariosAprReclCen1"
                                                    binding="#{PotencialBen4.helpInlineComentariosAprReclCen1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.comentarios_apr_recl_cen"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroCausaDenReclCen1" rendered="#{PotencialBen4.bitNumeroCausaDenReclCenRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen4.labelNumeroCausaDenReclCen1}"
                                                    id="labelNumeroCausaDenReclCen1"
                                                    for="listaNumeroCausaDenReclCen1"
                                                    text="causa denegaci&#243;n reclamo censo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroCausaDenReclCen2" rendered="#{PotencialBen4.bitNumeroCausaDenReclCenRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroCausaDenReclCen1"
                                                    binding="#{PotencialBen4.listaNumeroCausaDenReclCen1}"
                                                    converter="#{PotencialBen4.converterNumeroCausaDenReclCen1}"
                                                    items="#{PotencialBen4.opcionesListaNumeroCausaDenReclCen1}"
                                                     required="true"
                                                    selected="#{PotencialBen4.valorListaNumeroCausaDenReclCen1}"
                                                    toolTip="BundleParametros.numero_causa_den_recl_cen"/>
                                                <webuijsf:staticText id="listaNumeroCausaDenReclCen1Texto1"
                                                    binding="#{PotencialBen4.listaNumeroCausaDenReclCen1Texto1}"/>
                                                <webuijsf:message id="messageNumeroCausaDenReclCen1"
                                                    for="listaNumeroCausaDenReclCen1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroCausaDenReclCen1"
                                                    binding="#{PotencialBen4.helpInlineNumeroCausaDenReclCen1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_causa_den_recl_cen"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridOtraCausaDenReclCen1" rendered="#{PotencialBen4.bitOtraCausaDenReclCenRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen4.labelOtraCausaDenReclCen1}"
                                                    id="labelOtraCausaDenReclCen1"
                                                    for="campoOtraCausaDenReclCen1"
                                                    text="otra causa denegaci&#243;n reclamo censo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridOtraCausaDenReclCen2" rendered="#{PotencialBen4.bitOtraCausaDenReclCenRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoOtraCausaDenReclCen1"
                                                    binding="#{PotencialBen4.campoOtraCausaDenReclCen1}"
                                                    columns="50"
                                                    text="#{PotencialBen4.textoCampoOtraCausaDenReclCen1}"
                                                    toolTip="BundleParametros.otra_causa_den_recl_cen"
                                                    validatorExpression="#{PotencialBen4.validatorOtraCausaDenReclCen1.validate}"/>
                                                <webuijsf:staticText id="campoOtraCausaDenReclCen1Texto1"
                                                    binding="#{PotencialBen4.campoOtraCausaDenReclCen1Texto1}"/>
                                                <webuijsf:message id="messageOtraCausaDenReclCen1"
                                                    for="campoOtraCausaDenReclCen1"/>
                                                <webuijsf:helpInline id="helpInlineOtraCausaDenReclCen1"
                                                    binding="#{PotencialBen4.helpInlineOtraCausaDenReclCen1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.otra_causa_den_recl_cen"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridComentariosDenReclCen1" rendered="#{PotencialBen4.bitComentariosDenReclCenRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen4.labelComentariosDenReclCen1}"
                                                    id="labelComentariosDenReclCen1"
                                                    for="campoComentariosDenReclCen1"
                                                    text="comentarios denegaci&#243;n reclamo censo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridComentariosDenReclCen2" rendered="#{PotencialBen4.bitComentariosDenReclCenRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoComentariosDenReclCen1"
                                                    binding="#{PotencialBen4.campoComentariosDenReclCen1}"
                                                    columns="50"
                                                    text="#{PotencialBen4.textoCampoComentariosDenReclCen1}"
                                                    toolTip="BundleParametros.comentarios_den_recl_cen"
                                                    validatorExpression="#{PotencialBen4.validatorComentariosDenReclCen1.validate}"/>
                                                <webuijsf:staticText id="campoComentariosDenReclCen1Texto1"
                                                    binding="#{PotencialBen4.campoComentariosDenReclCen1Texto1}"/>
                                                <webuijsf:message id="messageComentariosDenReclCen1"
                                                    for="campoComentariosDenReclCen1"/>
                                                <webuijsf:helpInline id="helpInlineComentariosDenReclCen1"
                                                    binding="#{PotencialBen4.helpInlineComentariosDenReclCen1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.comentarios_den_recl_cen"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaUltimaVisitaCenso1" rendered="#{PotencialBen4.bitFechaUltimaVisitaCensoRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen4.labelFechaUltimaVisitaCenso1}"
                                                    id="labelFechaUltimaVisitaCenso1"
                                                    for="campoFechaUltimaVisitaCenso1"
                                                    text="fecha ultima visita censo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaUltimaVisitaCenso2" rendered="#{PotencialBen4.bitFechaUltimaVisitaCensoRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaUltimaVisitaCenso1"
                                                    binding="#{PotencialBen4.campoFechaUltimaVisitaCenso1}"
                                                    maxDate="#{PotencialBen4.gestor.defaultMaxDate}"
                                                    minDate="#{PotencialBen4.gestor.defaultMinDate}"
                                                     required="true"
                                                    selectedDate="#{PotencialBen4.valorCampoFechaUltimaVisitaCenso1}"
                                                    toolTip="BundleParametros.fecha_ultima_visita_censo"/>
                                                <webuijsf:staticText id="campoFechaUltimaVisitaCenso1Texto1"
                                                    binding="#{PotencialBen4.campoFechaUltimaVisitaCenso1Texto1}"/>
                                                <webuijsf:message id="messageFechaUltimaVisitaCenso1"
                                                    for="campoFechaUltimaVisitaCenso1"/>
                                                <webuijsf:helpInline id="helpInlineFechaUltimaVisitaCenso1"
                                                    binding="#{PotencialBen4.helpInlineFechaUltimaVisitaCenso1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_ultima_visita_censo"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdFuncionarioUltVisitaCen1" rendered="#{PotencialBen4.bitIdFuncionarioUltVisitaCenRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen4.labelIdFuncionarioUltVisitaCen1}"
                                                    id="labelIdFuncionarioUltVisitaCen1"
                                                    for="campoIdFuncionarioUltVisitaCen1"
                                                    text="funcionario &#250;ltima visita censo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdFuncionarioUltVisitaCen2" rendered="#{PotencialBen4.bitIdFuncionarioUltVisitaCenRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdFuncionarioUltVisitaCen1"
                                                    binding="#{PotencialBen4.campoIdFuncionarioUltVisitaCen1}"
                                                     required="true"
                                                    text="#{PotencialBen4.textoCampoIdFuncionarioUltVisitaCen1}"
                                                    toolTip="#{PotencialBen4.toolTipCampoIdFuncionarioUltVisitaCen1}"
                                                    validatorExpression="#{PotencialBen4.campoIdFuncionarioUltVisitaCen1_validate}"/>
                                                <webuijsf:staticText id="campoIdFuncionarioUltVisitaCen1Texto1"
                                                    binding="#{PotencialBen4.campoIdFuncionarioUltVisitaCen1Texto1}"/>
                                                <webuijsf:button id="campoIdFuncionarioUltVisitaCen1Boton1"
                                                    binding="#{PotencialBen4.campoIdFuncionarioUltVisitaCen1Boton1}"
                                                    onClick="#{PotencialBen4.scriptCampoIdFuncionarioUltVisitaCen1Boton1}"/>
                                                <webuijsf:button id="campoIdFuncionarioUltVisitaCen1Boton3"
                                                    binding="#{PotencialBen4.campoIdFuncionarioUltVisitaCen1Boton3}"
                                                    onClick="#{PotencialBen4.scriptCampoIdFuncionarioUltVisitaCen1Boton2}"
                                                    rendered="#{PotencialBen4.bitCampoIdFuncionarioUltVisitaCen1Boton3Rendered.on}"/>
                                                <webuijsf:message id="messageIdFuncionarioUltVisitaCen1"
                                                    for="campoIdFuncionarioUltVisitaCen1"/>
                                                <webuijsf:helpInline id="helpInlineIdFuncionarioUltVisitaCen1"
                                                    binding="#{PotencialBen4.helpInlineIdFuncionarioUltVisitaCen1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_funcionario_ult_visita_cen"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdFuncionarioUltVisitaCen3"
                                                rendered="#{PotencialBen4.bitCampoIdFuncionarioUltVisitaCen1Boton2Rendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen4.labelIdFuncionarioUltVisitaCen2}"
                                                    id="labelIdFuncionarioUltVisitaCen2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre funcionario &#250;ltima visita censo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdFuncionarioUltVisitaCen4"
                                                rendered="#{PotencialBen4.bitCampoIdFuncionarioUltVisitaCen1Boton2Rendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{PotencialBen4.campoIdFuncionarioUltVisitaCen1Texto2}"
                                                    id="campoIdFuncionarioUltVisitaCen1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{PotencialBen4.campoIdFuncionarioUltVisitaCen1Boton2}"
                                                    id="campoIdFuncionarioUltVisitaCen1Boton2"
                                                    onClick="#{PotencialBen4.scriptCampoIdFuncionarioUltVisitaCen1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridObservacionesUltVisitaCen1" rendered="#{PotencialBen4.bitObservacionesUltVisitaCenRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen4.labelObservacionesUltVisitaCen1}"
                                                    id="labelObservacionesUltVisitaCen1"
                                                    for="campoObservacionesUltVisitaCen1"
                                                    text="observaciones &#250;ltima visita censo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridObservacionesUltVisitaCen2" rendered="#{PotencialBen4.bitObservacionesUltVisitaCenRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoObservacionesUltVisitaCen1"
                                                    binding="#{PotencialBen4.campoObservacionesUltVisitaCen1}"
                                                    columns="50"
                                                    text="#{PotencialBen4.textoCampoObservacionesUltVisitaCen1}"
                                                    toolTip="BundleParametros.observaciones_ult_visita_cen"
                                                    validatorExpression="#{PotencialBen4.validatorObservacionesUltVisitaCen1.validate}"/>
                                                <webuijsf:staticText id="campoObservacionesUltVisitaCen1Texto1"
                                                    binding="#{PotencialBen4.campoObservacionesUltVisitaCen1Texto1}"/>
                                                <webuijsf:message id="messageObservacionesUltVisitaCen1"
                                                    for="campoObservacionesUltVisitaCen1"/>
                                                <webuijsf:helpInline id="helpInlineObservacionesUltVisitaCen1"
                                                    binding="#{PotencialBen4.helpInlineObservacionesUltVisitaCen1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.observaciones_ult_visita_cen"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdDepartamento1" rendered="#{PotencialBen4.bitIdDepartamentoRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen4.labelIdDepartamento1}"
                                                    id="labelIdDepartamento1"
                                                    for="campoIdDepartamento1"
                                                    text="departamento"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdDepartamento2" rendered="#{PotencialBen4.bitIdDepartamentoRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdDepartamento1"
                                                    binding="#{PotencialBen4.campoIdDepartamento1}"
                                                    text="#{PotencialBen4.textoCampoIdDepartamento1}"
                                                    toolTip="#{PotencialBen4.toolTipCampoIdDepartamento1}"
                                                    validatorExpression="#{PotencialBen4.campoIdDepartamento1_validate}"/>
                                                <webuijsf:staticText id="campoIdDepartamento1Texto1"
                                                    binding="#{PotencialBen4.campoIdDepartamento1Texto1}"/>
                                                <webuijsf:button id="campoIdDepartamento1Boton1"
                                                    binding="#{PotencialBen4.campoIdDepartamento1Boton1}"
                                                    onClick="#{PotencialBen4.scriptCampoIdDepartamento1Boton1}"/>
                                                <webuijsf:button id="campoIdDepartamento1Boton3"
                                                    binding="#{PotencialBen4.campoIdDepartamento1Boton3}"
                                                    onClick="#{PotencialBen4.scriptCampoIdDepartamento1Boton2}"
                                                    rendered="#{PotencialBen4.bitCampoIdDepartamento1Boton3Rendered.on}"/>
                                                <webuijsf:message id="messageIdDepartamento1"
                                                    for="campoIdDepartamento1"/>
                                                <webuijsf:helpInline id="helpInlineIdDepartamento1"
                                                    binding="#{PotencialBen4.helpInlineIdDepartamento1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_departamento"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdDepartamento3"
                                                rendered="#{PotencialBen4.bitCampoIdDepartamento1Boton2Rendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen4.labelIdDepartamento2}"
                                                    id="labelIdDepartamento2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre departamento"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdDepartamento4"
                                                rendered="#{PotencialBen4.bitCampoIdDepartamento1Boton2Rendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{PotencialBen4.campoIdDepartamento1Texto2}"
                                                    id="campoIdDepartamento1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{PotencialBen4.campoIdDepartamento1Boton2}"
                                                    id="campoIdDepartamento1Boton2"
                                                    onClick="#{PotencialBen4.scriptCampoIdDepartamento1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdDistrito1" rendered="#{PotencialBen4.bitIdDistritoRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen4.labelIdDistrito1}"
                                                    id="labelIdDistrito1"
                                                    for="campoIdDistrito1"
                                                    text="distrito"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdDistrito2" rendered="#{PotencialBen4.bitIdDistritoRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdDistrito1"
                                                    binding="#{PotencialBen4.campoIdDistrito1}"
                                                    text="#{PotencialBen4.textoCampoIdDistrito1}"
                                                    toolTip="#{PotencialBen4.toolTipCampoIdDistrito1}"
                                                    validatorExpression="#{PotencialBen4.campoIdDistrito1_validate}"/>
                                                <webuijsf:staticText id="campoIdDistrito1Texto1"
                                                    binding="#{PotencialBen4.campoIdDistrito1Texto1}"/>
                                                <webuijsf:button id="campoIdDistrito1Boton1"
                                                    binding="#{PotencialBen4.campoIdDistrito1Boton1}"
                                                    onClick="#{PotencialBen4.scriptCampoIdDistrito1Boton1}"/>
                                                <webuijsf:button id="campoIdDistrito1Boton3"
                                                    binding="#{PotencialBen4.campoIdDistrito1Boton3}"
                                                    onClick="#{PotencialBen4.scriptCampoIdDistrito1Boton2}"
                                                    rendered="#{PotencialBen4.bitCampoIdDistrito1Boton3Rendered.on}"/>
                                                <webuijsf:message id="messageIdDistrito1"
                                                    for="campoIdDistrito1"/>
                                                <webuijsf:helpInline id="helpInlineIdDistrito1"
                                                    binding="#{PotencialBen4.helpInlineIdDistrito1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_distrito"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdDistrito3"
                                                rendered="#{PotencialBen4.bitCampoIdDistrito1Boton2Rendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen4.labelIdDistrito2}"
                                                    id="labelIdDistrito2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre distrito"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdDistrito4"
                                                rendered="#{PotencialBen4.bitCampoIdDistrito1Boton2Rendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{PotencialBen4.campoIdDistrito1Texto2}"
                                                    id="campoIdDistrito1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{PotencialBen4.campoIdDistrito1Boton2}"
                                                    id="campoIdDistrito1Boton2"
                                                    onClick="#{PotencialBen4.scriptCampoIdDistrito1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdBarrio1" rendered="#{PotencialBen4.bitIdBarrioRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen4.labelIdBarrio1}"
                                                    id="labelIdBarrio1"
                                                    for="campoIdBarrio1"
                                                    text="barrio"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdBarrio2" rendered="#{PotencialBen4.bitIdBarrioRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdBarrio1"
                                                    binding="#{PotencialBen4.campoIdBarrio1}"
                                                    text="#{PotencialBen4.textoCampoIdBarrio1}"
                                                    toolTip="#{PotencialBen4.toolTipCampoIdBarrio1}"
                                                    validatorExpression="#{PotencialBen4.campoIdBarrio1_validate}"/>
                                                <webuijsf:staticText id="campoIdBarrio1Texto1"
                                                    binding="#{PotencialBen4.campoIdBarrio1Texto1}"/>
                                                <webuijsf:button id="campoIdBarrio1Boton1"
                                                    binding="#{PotencialBen4.campoIdBarrio1Boton1}"
                                                    onClick="#{PotencialBen4.scriptCampoIdBarrio1Boton1}"/>
                                                <webuijsf:button id="campoIdBarrio1Boton3"
                                                    binding="#{PotencialBen4.campoIdBarrio1Boton3}"
                                                    onClick="#{PotencialBen4.scriptCampoIdBarrio1Boton2}"
                                                    rendered="#{PotencialBen4.bitCampoIdBarrio1Boton3Rendered.on}"/>
                                                <webuijsf:message id="messageIdBarrio1"
                                                    for="campoIdBarrio1"/>
                                                <webuijsf:helpInline id="helpInlineIdBarrio1"
                                                    binding="#{PotencialBen4.helpInlineIdBarrio1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_barrio"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdBarrio3"
                                                rendered="#{PotencialBen4.bitCampoIdBarrio1Boton2Rendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen4.labelIdBarrio2}"
                                                    id="labelIdBarrio2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre barrio"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdBarrio4"
                                                rendered="#{PotencialBen4.bitCampoIdBarrio1Boton2Rendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{PotencialBen4.campoIdBarrio1Texto2}"
                                                    id="campoIdBarrio1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{PotencialBen4.campoIdBarrio1Boton2}"
                                                    id="campoIdBarrio1Boton2"
                                                    onClick="#{PotencialBen4.scriptCampoIdBarrio1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroTipoArea1" rendered="#{PotencialBen4.bitNumeroTipoAreaRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen4.labelNumeroTipoArea1}"
                                                    id="labelNumeroTipoArea1"
                                                    for="listaNumeroTipoArea1"
                                                    text="tipo area"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTipoArea2" rendered="#{PotencialBen4.bitNumeroTipoAreaRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroTipoArea1"
                                                    binding="#{PotencialBen4.listaNumeroTipoArea1}"
                                                    converter="#{PotencialBen4.converterNumeroTipoArea1}"
                                                    items="#{PotencialBen4.opcionesListaNumeroTipoArea1}"
                                                    selected="#{PotencialBen4.valorListaNumeroTipoArea1}"
                                                    toolTip="BundleParametros.numero_tipo_area"/>
                                                <webuijsf:staticText id="listaNumeroTipoArea1Texto1"
                                                    binding="#{PotencialBen4.listaNumeroTipoArea1Texto1}"/>
                                                <webuijsf:message id="messageNumeroTipoArea1"
                                                    for="listaNumeroTipoArea1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTipoArea1"
                                                    binding="#{PotencialBen4.helpInlineNumeroTipoArea1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_tipo_area"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaRegistroPotBenDesde1" rendered="#{PotencialBen4.bitFechaRegistroPotBenDesdeRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen4.labelFechaRegistroPotBenDesde1}"
                                                    id="labelFechaRegistroPotBenDesde1"
                                                    for="campoFechaRegistroPotBenDesde1"
                                                    text="fecha registro potencial beneficiario desde"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaRegistroPotBenDesde2" rendered="#{PotencialBen4.bitFechaRegistroPotBenDesdeRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaRegistroPotBenDesde1"
                                                    binding="#{PotencialBen4.campoFechaRegistroPotBenDesde1}"
                                                    maxDate="#{PotencialBen4.gestor.defaultMaxDate}"
                                                    minDate="#{PotencialBen4.gestor.defaultMinDate}"
                                                    selectedDate="#{PotencialBen4.valorCampoFechaRegistroPotBenDesde1}"
                                                    toolTip="BundleParametros.fecha_registro_pot_ben_desde"/>
                                                <webuijsf:staticText id="campoFechaRegistroPotBenDesde1Texto1"
                                                    binding="#{PotencialBen4.campoFechaRegistroPotBenDesde1Texto1}"/>
                                                <webuijsf:message id="messageFechaRegistroPotBenDesde1"
                                                    for="campoFechaRegistroPotBenDesde1"/>
                                                <webuijsf:helpInline id="helpInlineFechaRegistroPotBenDesde1"
                                                    binding="#{PotencialBen4.helpInlineFechaRegistroPotBenDesde1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_registro_pot_ben_desde"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaRegistroPotBenHasta1" rendered="#{PotencialBen4.bitFechaRegistroPotBenHastaRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen4.labelFechaRegistroPotBenHasta1}"
                                                    id="labelFechaRegistroPotBenHasta1"
                                                    for="campoFechaRegistroPotBenHasta1"
                                                    text="fecha registro potencial beneficiario hasta"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaRegistroPotBenHasta2" rendered="#{PotencialBen4.bitFechaRegistroPotBenHastaRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaRegistroPotBenHasta1"
                                                    binding="#{PotencialBen4.campoFechaRegistroPotBenHasta1}"
                                                    maxDate="#{PotencialBen4.gestor.defaultMaxDate}"
                                                    minDate="#{PotencialBen4.gestor.defaultMinDate}"
                                                    selectedDate="#{PotencialBen4.valorCampoFechaRegistroPotBenHasta1}"
                                                    toolTip="BundleParametros.fecha_registro_pot_ben_hasta"/>
                                                <webuijsf:staticText id="campoFechaRegistroPotBenHasta1Texto1"
                                                    binding="#{PotencialBen4.campoFechaRegistroPotBenHasta1Texto1}"/>
                                                <webuijsf:message id="messageFechaRegistroPotBenHasta1"
                                                    for="campoFechaRegistroPotBenHasta1"/>
                                                <webuijsf:helpInline id="helpInlineFechaRegistroPotBenHasta1"
                                                    binding="#{PotencialBen4.helpInlineFechaRegistroPotBenHasta1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_registro_pot_ben_hasta"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIndiceCalidadVidaDesde1" rendered="#{PotencialBen4.bitIndiceCalidadVidaDesdeRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen4.labelIndiceCalidadVidaDesde1}"
                                                    id="labelIndiceCalidadVidaDesde1"
                                                    for="campoIndiceCalidadVidaDesde1"
                                                    text="indice calidad vida desde"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIndiceCalidadVidaDesde2" rendered="#{PotencialBen4.bitIndiceCalidadVidaDesdeRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIndiceCalidadVidaDesde1"
                                                    binding="#{PotencialBen4.campoIndiceCalidadVidaDesde1}"
                                                    converter="#{PotencialBen4.converterIndiceCalidadVidaDesde1}"
                                                    text="#{PotencialBen4.textoCampoIndiceCalidadVidaDesde1}"
                                                    toolTip="BundleParametros.indice_calidad_vida_desde"
                                                    validatorExpression="#{PotencialBen4.validatorIndiceCalidadVidaDesde1.validate}"/>
                                                <webuijsf:staticText id="campoIndiceCalidadVidaDesde1Texto1"
                                                    binding="#{PotencialBen4.campoIndiceCalidadVidaDesde1Texto1}"/>
                                                <webuijsf:message id="messageIndiceCalidadVidaDesde1"
                                                    for="campoIndiceCalidadVidaDesde1"/>
                                                <webuijsf:helpInline id="helpInlineIndiceCalidadVidaDesde1"
                                                    binding="#{PotencialBen4.helpInlineIndiceCalidadVidaDesde1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.indice_calidad_vida_desde"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIndiceCalidadVidaHasta1" rendered="#{PotencialBen4.bitIndiceCalidadVidaHastaRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen4.labelIndiceCalidadVidaHasta1}"
                                                    id="labelIndiceCalidadVidaHasta1"
                                                    for="campoIndiceCalidadVidaHasta1"
                                                    text="indice calidad vida hasta"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIndiceCalidadVidaHasta2" rendered="#{PotencialBen4.bitIndiceCalidadVidaHastaRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIndiceCalidadVidaHasta1"
                                                    binding="#{PotencialBen4.campoIndiceCalidadVidaHasta1}"
                                                    converter="#{PotencialBen4.converterIndiceCalidadVidaHasta1}"
                                                    text="#{PotencialBen4.textoCampoIndiceCalidadVidaHasta1}"
                                                    toolTip="BundleParametros.indice_calidad_vida_hasta"
                                                    validatorExpression="#{PotencialBen4.validatorIndiceCalidadVidaHasta1.validate}"/>
                                                <webuijsf:staticText id="campoIndiceCalidadVidaHasta1Texto1"
                                                    binding="#{PotencialBen4.campoIndiceCalidadVidaHasta1Texto1}"/>
                                                <webuijsf:message id="messageIndiceCalidadVidaHasta1"
                                                    for="campoIndiceCalidadVidaHasta1"/>
                                                <webuijsf:helpInline id="helpInlineIndiceCalidadVidaHasta1"
                                                    binding="#{PotencialBen4.helpInlineIndiceCalidadVidaHasta1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.indice_calidad_vida_hasta"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaValidacionCensoDesde1" rendered="#{PotencialBen4.bitFechaValidacionCensoDesdeRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen4.labelFechaValidacionCensoDesde1}"
                                                    id="labelFechaValidacionCensoDesde1"
                                                    for="campoFechaValidacionCensoDesde1"
                                                    text="fecha validaci&#243;n censo desde"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaValidacionCensoDesde2" rendered="#{PotencialBen4.bitFechaValidacionCensoDesdeRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaValidacionCensoDesde1"
                                                    binding="#{PotencialBen4.campoFechaValidacionCensoDesde1}"
                                                    maxDate="#{PotencialBen4.gestor.defaultMaxDate}"
                                                    minDate="#{PotencialBen4.gestor.defaultMinDate}"
                                                    selectedDate="#{PotencialBen4.valorCampoFechaValidacionCensoDesde1}"
                                                    toolTip="BundleParametros.fecha_validacion_censo_desde"/>
                                                <webuijsf:staticText id="campoFechaValidacionCensoDesde1Texto1"
                                                    binding="#{PotencialBen4.campoFechaValidacionCensoDesde1Texto1}"/>
                                                <webuijsf:message id="messageFechaValidacionCensoDesde1"
                                                    for="campoFechaValidacionCensoDesde1"/>
                                                <webuijsf:helpInline id="helpInlineFechaValidacionCensoDesde1"
                                                    binding="#{PotencialBen4.helpInlineFechaValidacionCensoDesde1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_validacion_censo_desde"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaValidacionCensoHasta1" rendered="#{PotencialBen4.bitFechaValidacionCensoHastaRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen4.labelFechaValidacionCensoHasta1}"
                                                    id="labelFechaValidacionCensoHasta1"
                                                    for="campoFechaValidacionCensoHasta1"
                                                    text="fecha validaci&#243;n censo hasta"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaValidacionCensoHasta2" rendered="#{PotencialBen4.bitFechaValidacionCensoHastaRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaValidacionCensoHasta1"
                                                    binding="#{PotencialBen4.campoFechaValidacionCensoHasta1}"
                                                    maxDate="#{PotencialBen4.gestor.defaultMaxDate}"
                                                    minDate="#{PotencialBen4.gestor.defaultMinDate}"
                                                    selectedDate="#{PotencialBen4.valorCampoFechaValidacionCensoHasta1}"
                                                    toolTip="BundleParametros.fecha_validacion_censo_hasta"/>
                                                <webuijsf:staticText id="campoFechaValidacionCensoHasta1Texto1"
                                                    binding="#{PotencialBen4.campoFechaValidacionCensoHasta1Texto1}"/>
                                                <webuijsf:message id="messageFechaValidacionCensoHasta1"
                                                    for="campoFechaValidacionCensoHasta1"/>
                                                <webuijsf:helpInline id="helpInlineFechaValidacionCensoHasta1"
                                                    binding="#{PotencialBen4.helpInlineFechaValidacionCensoHasta1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_validacion_censo_hasta"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroCondicionCenso1" rendered="#{PotencialBen4.bitNumeroCondicionCensoRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen4.labelNumeroCondicionCenso1}"
                                                    id="labelNumeroCondicionCenso1"
                                                    for="listaNumeroCondicionCenso1"
                                                    text="condici&#243;n censo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroCondicionCenso2" rendered="#{PotencialBen4.bitNumeroCondicionCensoRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroCondicionCenso1"
                                                    binding="#{PotencialBen4.listaNumeroCondicionCenso1}"
                                                    converter="#{PotencialBen4.converterNumeroCondicionCenso1}"
                                                    items="#{PotencialBen4.opcionesListaNumeroCondicionCenso1}"
                                                    selected="#{PotencialBen4.valorListaNumeroCondicionCenso1}"
                                                    toolTip="BundleParametros.numero_condicion_censo"/>
                                                <webuijsf:staticText id="listaNumeroCondicionCenso1Texto1"
                                                    binding="#{PotencialBen4.listaNumeroCondicionCenso1Texto1}"/>
                                                <webuijsf:message id="messageNumeroCondicionCenso1"
                                                    for="listaNumeroCondicionCenso1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroCondicionCenso1"
                                                    binding="#{PotencialBen4.helpInlineNumeroCondicionCenso1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_condicion_censo"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridLote1" rendered="#{PotencialBen4.bitLoteRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen4.labelLote1}"
                                                    id="labelLote1"
                                                    for="campoLote1"
                                                    text="lote"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridLote2" rendered="#{PotencialBen4.bitLoteRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoLote1"
                                                    binding="#{PotencialBen4.campoLote1}"
                                                    converter="#{PotencialBen4.converterLote1}"
                                                    text="#{PotencialBen4.textoCampoLote1}"
                                                    toolTip="BundleParametros.lote"
                                                    validatorExpression="#{PotencialBen4.validatorLote1.validate}"/>
                                                <webuijsf:staticText id="campoLote1Texto1"
                                                    binding="#{PotencialBen4.campoLote1Texto1}"/>
                                                <webuijsf:message id="messageLote1"
                                                    for="campoLote1"/>
                                                <webuijsf:helpInline id="helpInlineLote1"
                                                    binding="#{PotencialBen4.helpInlineLote1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.lote"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEdadDesde1" rendered="#{PotencialBen4.bitEdadDesdeRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen4.labelEdadDesde1}"
                                                    id="labelEdadDesde1"
                                                    for="campoEdadDesde1"
                                                    text="edad desde"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEdadDesde2" rendered="#{PotencialBen4.bitEdadDesdeRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoEdadDesde1"
                                                    binding="#{PotencialBen4.campoEdadDesde1}"
                                                    converter="#{PotencialBen4.converterEdadDesde1}"
                                                    text="#{PotencialBen4.textoCampoEdadDesde1}"
                                                    toolTip="BundleParametros.edad_desde"
                                                    validatorExpression="#{PotencialBen4.validatorEdadDesde1.validate}"/>
                                                <webuijsf:staticText id="campoEdadDesde1Texto1"
                                                    binding="#{PotencialBen4.campoEdadDesde1Texto1}"/>
                                                <webuijsf:message id="messageEdadDesde1"
                                                    for="campoEdadDesde1"/>
                                                <webuijsf:helpInline id="helpInlineEdadDesde1"
                                                    binding="#{PotencialBen4.helpInlineEdadDesde1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.edad_desde"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEdadHasta1" rendered="#{PotencialBen4.bitEdadHastaRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen4.labelEdadHasta1}"
                                                    id="labelEdadHasta1"
                                                    for="campoEdadHasta1"
                                                    text="edad hasta"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEdadHasta2" rendered="#{PotencialBen4.bitEdadHastaRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoEdadHasta1"
                                                    binding="#{PotencialBen4.campoEdadHasta1}"
                                                    converter="#{PotencialBen4.converterEdadHasta1}"
                                                    text="#{PotencialBen4.textoCampoEdadHasta1}"
                                                    toolTip="BundleParametros.edad_hasta"
                                                    validatorExpression="#{PotencialBen4.validatorEdadHasta1.validate}"/>
                                                <webuijsf:staticText id="campoEdadHasta1Texto1"
                                                    binding="#{PotencialBen4.campoEdadHasta1Texto1}"/>
                                                <webuijsf:message id="messageEdadHasta1"
                                                    for="campoEdadHasta1"/>
                                                <webuijsf:helpInline id="helpInlineEdadHasta1"
                                                    binding="#{PotencialBen4.helpInlineEdadHasta1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.edad_hasta"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPanel111"
                                                styleClass="pdq-grid-detalle-botones">
                                                <h:panelGrid 
                                                    id="gridPanel112">
                                                    <webuijsf:anchor 
                                                        id="ancla2"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPanel113"
                                                styleClass="pdq-grid-detalle-mensajes">
                                                <webuijsf:staticText
                                                    id="textoMensaje1"
                                                    style="font-weight: bold"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <h:panelGrid 
                                            id="gridPanel114">
                                            <h:panelGrid 
                                                id="gridPanel115">
                                                <webuijsf:anchor 
                                                    id="anchor1"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="2" 
                                                id="gridPanel116">
                                                <webuijsf:button
                                                    actionExpression="#{PotencialBen4.botonAplicar1_action}"
                                                    binding="#{PotencialBen4.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    styleClass="pdq-button-1"
                                                    text="#{PotencialBen4.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{PotencialBen4.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{PotencialBen4.botonProcesar1_action}"
                                                    binding="#{PotencialBen4.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    styleClass="pdq-button-1"
                                                    text="#{PotencialBen4.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{PotencialBen4.gestor.i18n.toolTipBotonProcesar}"/>
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
                        <webuijsf:anchor id="anclaPie1"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
