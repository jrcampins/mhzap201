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
                    focus="#{FichaPersona4.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{FichaPersona4.gestor.preserveFocus}"
                    preserveScroll="#{FichaPersona4.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{FichaPersona4.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | listaFuncionAccion1 campoIdFichaPersona1 campoIdPotencialBen1 campoIdDepartamento1 campoIdDistrito1 campoIdBarrio1 listaEsFichaPersonaImportada1 campoFechaImportacionDesde1 campoFechaImportacionHasta1 | , virtualForm2 | | , virtualForm3 | listaFuncionAccion1 | listaFuncionAccion1 , virtualForm4 | | ">
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
                                        binding="#{FichaPersona4.breadcrumbs1}" 
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
                                                    rendered="#{FichaPersona4.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{FichaPersona4.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{FichaPersona4.gestor.mensajeDisponible}"
                                                    text="#{FichaPersona4.gestor.mensaje}"
                                                    url="#{FichaPersona4.gestor.urlAnclaPie1}"/>
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
                                                    binding="#{FichaPersona4.etiquetaListaFuncionAccion1}"
                                                    id="etiquetaListaFuncionAccion1"
                                                    for="listaFuncionAccion1"
                                                    text="#{FichaPersona4.gestor.i18n.textoEtiquetaListaFuncionAccion}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel110"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown
                                                    binding="#{FichaPersona4.listaFuncionAccion1}"
                                                    converter="#{FichaPersona4.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{FichaPersona4.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme4_2.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    required="true"
                                                    selected="#{FichaPersona4.gestor.valorListaFuncionAccion1}"
                                                    toolTip="#{FichaPersona4.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:staticText
                                                    binding="#{FichaPersona4.listaFuncionAccion1Texto1}"
                                                    id="listaFuncionAccion1Texto1"/>
                                                <webuijsf:message
                                                    for="listaFuncionAccion1"
                                                    id="messageListaFuncionAccion1"/>
                                                <webuijsf:helpInline
                                                    binding="#{FichaPersona4.helpInlineListaFuncionAccion1}"
                                                    id="helpInlineListaFuncionAccion1"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-page"
                                                    text="#{FichaPersona4.gestor.i18n.inlineHelpListaFuncionAccion}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdFichaPersona1" rendered="#{FichaPersona4.bitIdFichaPersonaRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersona4.labelIdFichaPersona1}"
                                                    id="labelIdFichaPersona1"
                                                    for="campoIdFichaPersona1"
                                                    text="ficha persona"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdFichaPersona2" rendered="#{FichaPersona4.bitIdFichaPersonaRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdFichaPersona1"
                                                    binding="#{FichaPersona4.campoIdFichaPersona1}"
                                                     required="true"
                                                    text="#{FichaPersona4.textoCampoIdFichaPersona1}"
                                                    toolTip="#{FichaPersona4.toolTipCampoIdFichaPersona1}"
                                                    validatorExpression="#{FichaPersona4.campoIdFichaPersona1_validate}"/>
                                                <webuijsf:staticText id="campoIdFichaPersona1Texto1"
                                                    binding="#{FichaPersona4.campoIdFichaPersona1Texto1}"/>
                                                <webuijsf:button id="campoIdFichaPersona1Boton1"
                                                    binding="#{FichaPersona4.campoIdFichaPersona1Boton1}"
                                                    onClick="#{FichaPersona4.scriptCampoIdFichaPersona1Boton1}"/>
                                                <webuijsf:button id="campoIdFichaPersona1Boton3"
                                                    binding="#{FichaPersona4.campoIdFichaPersona1Boton3}"
                                                    onClick="#{FichaPersona4.scriptCampoIdFichaPersona1Boton2}"
                                                    rendered="#{FichaPersona4.bitCampoIdFichaPersona1Boton3Rendered.on}"/>
                                                <webuijsf:message id="messageIdFichaPersona1"
                                                    for="campoIdFichaPersona1"/>
                                                <webuijsf:helpInline id="helpInlineIdFichaPersona1"
                                                    binding="#{FichaPersona4.helpInlineIdFichaPersona1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdFichaPersona3"
                                                rendered="#{FichaPersona4.bitCampoIdFichaPersona1Boton2Rendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersona4.labelIdFichaPersona2}"
                                                    id="labelIdFichaPersona2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdFichaPersona4"
                                                rendered="#{FichaPersona4.bitCampoIdFichaPersona1Boton2Rendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{FichaPersona4.campoIdFichaPersona1Texto2}"
                                                    id="campoIdFichaPersona1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{FichaPersona4.campoIdFichaPersona1Boton2}"
                                                    id="campoIdFichaPersona1Boton2"
                                                    onClick="#{FichaPersona4.scriptCampoIdFichaPersona1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdPotencialBen1" rendered="#{FichaPersona4.bitIdPotencialBenRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersona4.labelIdPotencialBen1}"
                                                    id="labelIdPotencialBen1"
                                                    for="campoIdPotencialBen1"
                                                    text="potencial beneficiario"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdPotencialBen2" rendered="#{FichaPersona4.bitIdPotencialBenRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdPotencialBen1"
                                                    binding="#{FichaPersona4.campoIdPotencialBen1}"
                                                     required="true"
                                                    text="#{FichaPersona4.textoCampoIdPotencialBen1}"
                                                    toolTip="#{FichaPersona4.toolTipCampoIdPotencialBen1}"
                                                    validatorExpression="#{FichaPersona4.campoIdPotencialBen1_validate}"/>
                                                <webuijsf:staticText id="campoIdPotencialBen1Texto1"
                                                    binding="#{FichaPersona4.campoIdPotencialBen1Texto1}"/>
                                                <webuijsf:button id="campoIdPotencialBen1Boton1"
                                                    binding="#{FichaPersona4.campoIdPotencialBen1Boton1}"
                                                    onClick="#{FichaPersona4.scriptCampoIdPotencialBen1Boton1}"/>
                                                <webuijsf:button id="campoIdPotencialBen1Boton3"
                                                    binding="#{FichaPersona4.campoIdPotencialBen1Boton3}"
                                                    onClick="#{FichaPersona4.scriptCampoIdPotencialBen1Boton2}"
                                                    rendered="#{FichaPersona4.bitCampoIdPotencialBen1Boton3Rendered.on}"/>
                                                <webuijsf:message id="messageIdPotencialBen1"
                                                    for="campoIdPotencialBen1"/>
                                                <webuijsf:helpInline id="helpInlineIdPotencialBen1"
                                                    binding="#{FichaPersona4.helpInlineIdPotencialBen1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdPotencialBen3"
                                                rendered="#{FichaPersona4.bitCampoIdPotencialBen1Boton2Rendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersona4.labelIdPotencialBen2}"
                                                    id="labelIdPotencialBen2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre potencial beneficiario"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdPotencialBen4"
                                                rendered="#{FichaPersona4.bitCampoIdPotencialBen1Boton2Rendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{FichaPersona4.campoIdPotencialBen1Texto2}"
                                                    id="campoIdPotencialBen1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{FichaPersona4.campoIdPotencialBen1Boton2}"
                                                    id="campoIdPotencialBen1Boton2"
                                                    onClick="#{FichaPersona4.scriptCampoIdPotencialBen1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdDepartamento1" rendered="#{FichaPersona4.bitIdDepartamentoRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersona4.labelIdDepartamento1}"
                                                    id="labelIdDepartamento1"
                                                    for="campoIdDepartamento1"
                                                    text="departamento"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdDepartamento2" rendered="#{FichaPersona4.bitIdDepartamentoRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdDepartamento1"
                                                    binding="#{FichaPersona4.campoIdDepartamento1}"
                                                    text="#{FichaPersona4.textoCampoIdDepartamento1}"
                                                    toolTip="#{FichaPersona4.toolTipCampoIdDepartamento1}"
                                                    validatorExpression="#{FichaPersona4.campoIdDepartamento1_validate}"/>
                                                <webuijsf:staticText id="campoIdDepartamento1Texto1"
                                                    binding="#{FichaPersona4.campoIdDepartamento1Texto1}"/>
                                                <webuijsf:button id="campoIdDepartamento1Boton1"
                                                    binding="#{FichaPersona4.campoIdDepartamento1Boton1}"
                                                    onClick="#{FichaPersona4.scriptCampoIdDepartamento1Boton1}"/>
                                                <webuijsf:button id="campoIdDepartamento1Boton3"
                                                    binding="#{FichaPersona4.campoIdDepartamento1Boton3}"
                                                    onClick="#{FichaPersona4.scriptCampoIdDepartamento1Boton2}"
                                                    rendered="#{FichaPersona4.bitCampoIdDepartamento1Boton3Rendered.on}"/>
                                                <webuijsf:message id="messageIdDepartamento1"
                                                    for="campoIdDepartamento1"/>
                                                <webuijsf:helpInline id="helpInlineIdDepartamento1"
                                                    binding="#{FichaPersona4.helpInlineIdDepartamento1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_departamento"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdDepartamento3"
                                                rendered="#{FichaPersona4.bitCampoIdDepartamento1Boton2Rendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersona4.labelIdDepartamento2}"
                                                    id="labelIdDepartamento2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre departamento"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdDepartamento4"
                                                rendered="#{FichaPersona4.bitCampoIdDepartamento1Boton2Rendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{FichaPersona4.campoIdDepartamento1Texto2}"
                                                    id="campoIdDepartamento1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{FichaPersona4.campoIdDepartamento1Boton2}"
                                                    id="campoIdDepartamento1Boton2"
                                                    onClick="#{FichaPersona4.scriptCampoIdDepartamento1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdDistrito1" rendered="#{FichaPersona4.bitIdDistritoRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersona4.labelIdDistrito1}"
                                                    id="labelIdDistrito1"
                                                    for="campoIdDistrito1"
                                                    text="distrito"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdDistrito2" rendered="#{FichaPersona4.bitIdDistritoRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdDistrito1"
                                                    binding="#{FichaPersona4.campoIdDistrito1}"
                                                    text="#{FichaPersona4.textoCampoIdDistrito1}"
                                                    toolTip="#{FichaPersona4.toolTipCampoIdDistrito1}"
                                                    validatorExpression="#{FichaPersona4.campoIdDistrito1_validate}"/>
                                                <webuijsf:staticText id="campoIdDistrito1Texto1"
                                                    binding="#{FichaPersona4.campoIdDistrito1Texto1}"/>
                                                <webuijsf:button id="campoIdDistrito1Boton1"
                                                    binding="#{FichaPersona4.campoIdDistrito1Boton1}"
                                                    onClick="#{FichaPersona4.scriptCampoIdDistrito1Boton1}"/>
                                                <webuijsf:button id="campoIdDistrito1Boton3"
                                                    binding="#{FichaPersona4.campoIdDistrito1Boton3}"
                                                    onClick="#{FichaPersona4.scriptCampoIdDistrito1Boton2}"
                                                    rendered="#{FichaPersona4.bitCampoIdDistrito1Boton3Rendered.on}"/>
                                                <webuijsf:message id="messageIdDistrito1"
                                                    for="campoIdDistrito1"/>
                                                <webuijsf:helpInline id="helpInlineIdDistrito1"
                                                    binding="#{FichaPersona4.helpInlineIdDistrito1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_distrito"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdDistrito3"
                                                rendered="#{FichaPersona4.bitCampoIdDistrito1Boton2Rendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersona4.labelIdDistrito2}"
                                                    id="labelIdDistrito2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre distrito"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdDistrito4"
                                                rendered="#{FichaPersona4.bitCampoIdDistrito1Boton2Rendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{FichaPersona4.campoIdDistrito1Texto2}"
                                                    id="campoIdDistrito1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{FichaPersona4.campoIdDistrito1Boton2}"
                                                    id="campoIdDistrito1Boton2"
                                                    onClick="#{FichaPersona4.scriptCampoIdDistrito1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdBarrio1" rendered="#{FichaPersona4.bitIdBarrioRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersona4.labelIdBarrio1}"
                                                    id="labelIdBarrio1"
                                                    for="campoIdBarrio1"
                                                    text="barrio"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdBarrio2" rendered="#{FichaPersona4.bitIdBarrioRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdBarrio1"
                                                    binding="#{FichaPersona4.campoIdBarrio1}"
                                                    text="#{FichaPersona4.textoCampoIdBarrio1}"
                                                    toolTip="#{FichaPersona4.toolTipCampoIdBarrio1}"
                                                    validatorExpression="#{FichaPersona4.campoIdBarrio1_validate}"/>
                                                <webuijsf:staticText id="campoIdBarrio1Texto1"
                                                    binding="#{FichaPersona4.campoIdBarrio1Texto1}"/>
                                                <webuijsf:button id="campoIdBarrio1Boton1"
                                                    binding="#{FichaPersona4.campoIdBarrio1Boton1}"
                                                    onClick="#{FichaPersona4.scriptCampoIdBarrio1Boton1}"/>
                                                <webuijsf:button id="campoIdBarrio1Boton3"
                                                    binding="#{FichaPersona4.campoIdBarrio1Boton3}"
                                                    onClick="#{FichaPersona4.scriptCampoIdBarrio1Boton2}"
                                                    rendered="#{FichaPersona4.bitCampoIdBarrio1Boton3Rendered.on}"/>
                                                <webuijsf:message id="messageIdBarrio1"
                                                    for="campoIdBarrio1"/>
                                                <webuijsf:helpInline id="helpInlineIdBarrio1"
                                                    binding="#{FichaPersona4.helpInlineIdBarrio1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_barrio"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdBarrio3"
                                                rendered="#{FichaPersona4.bitCampoIdBarrio1Boton2Rendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersona4.labelIdBarrio2}"
                                                    id="labelIdBarrio2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre barrio"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdBarrio4"
                                                rendered="#{FichaPersona4.bitCampoIdBarrio1Boton2Rendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{FichaPersona4.campoIdBarrio1Texto2}"
                                                    id="campoIdBarrio1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{FichaPersona4.campoIdBarrio1Boton2}"
                                                    id="campoIdBarrio1Boton2"
                                                    onClick="#{FichaPersona4.scriptCampoIdBarrio1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsFichaPersonaImportada1" rendered="#{FichaPersona4.bitEsFichaPersonaImportadaRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersona4.labelEsFichaPersonaImportada1}"
                                                    id="labelEsFichaPersonaImportada1"
                                                    for="listaEsFichaPersonaImportada1"
                                                    text="importada"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsFichaPersonaImportada2" rendered="#{FichaPersona4.bitEsFichaPersonaImportadaRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsFichaPersonaImportada1"
                                                    binding="#{FichaPersona4.listaEsFichaPersonaImportada1}"
                                                    converter="#{FichaPersona4.converterEsFichaPersonaImportada1}"
                                                    items="#{FichaPersona4.opcionesListaEsFichaPersonaImportada1}"
                                                    selected="#{FichaPersona4.valorListaEsFichaPersonaImportada1}"
                                                    toolTip="BundleParametros.es_ficha_persona_importada"/>
                                                <webuijsf:staticText id="listaEsFichaPersonaImportada1Texto1"
                                                    binding="#{FichaPersona4.listaEsFichaPersonaImportada1Texto1}"/>
                                                <webuijsf:message id="messageEsFichaPersonaImportada1"
                                                    for="listaEsFichaPersonaImportada1"/>
                                                <webuijsf:helpInline id="helpInlineEsFichaPersonaImportada1"
                                                    binding="#{FichaPersona4.helpInlineEsFichaPersonaImportada1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_ficha_persona_importada"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaImportacionDesde1" rendered="#{FichaPersona4.bitFechaImportacionDesdeRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersona4.labelFechaImportacionDesde1}"
                                                    id="labelFechaImportacionDesde1"
                                                    for="campoFechaImportacionDesde1"
                                                    text="fecha importaci&#243;n desde"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaImportacionDesde2" rendered="#{FichaPersona4.bitFechaImportacionDesdeRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaImportacionDesde1"
                                                    binding="#{FichaPersona4.campoFechaImportacionDesde1}"
                                                    maxDate="#{FichaPersona4.gestor.defaultMaxDate}"
                                                    minDate="#{FichaPersona4.gestor.defaultMinDate}"
                                                    selectedDate="#{FichaPersona4.valorCampoFechaImportacionDesde1}"
                                                    toolTip="BundleParametros.fecha_importacion_desde"/>
                                                <webuijsf:staticText id="campoFechaImportacionDesde1Texto1"
                                                    binding="#{FichaPersona4.campoFechaImportacionDesde1Texto1}"/>
                                                <webuijsf:message id="messageFechaImportacionDesde1"
                                                    for="campoFechaImportacionDesde1"/>
                                                <webuijsf:helpInline id="helpInlineFechaImportacionDesde1"
                                                    binding="#{FichaPersona4.helpInlineFechaImportacionDesde1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_importacion_desde"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaImportacionHasta1" rendered="#{FichaPersona4.bitFechaImportacionHastaRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersona4.labelFechaImportacionHasta1}"
                                                    id="labelFechaImportacionHasta1"
                                                    for="campoFechaImportacionHasta1"
                                                    text="fecha importaci&#243;n hasta"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaImportacionHasta2" rendered="#{FichaPersona4.bitFechaImportacionHastaRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaImportacionHasta1"
                                                    binding="#{FichaPersona4.campoFechaImportacionHasta1}"
                                                    maxDate="#{FichaPersona4.gestor.defaultMaxDate}"
                                                    minDate="#{FichaPersona4.gestor.defaultMinDate}"
                                                    selectedDate="#{FichaPersona4.valorCampoFechaImportacionHasta1}"
                                                    toolTip="BundleParametros.fecha_importacion_hasta"/>
                                                <webuijsf:staticText id="campoFechaImportacionHasta1Texto1"
                                                    binding="#{FichaPersona4.campoFechaImportacionHasta1Texto1}"/>
                                                <webuijsf:message id="messageFechaImportacionHasta1"
                                                    for="campoFechaImportacionHasta1"/>
                                                <webuijsf:helpInline id="helpInlineFechaImportacionHasta1"
                                                    binding="#{FichaPersona4.helpInlineFechaImportacionHasta1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_importacion_hasta"
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
                                                    actionExpression="#{FichaPersona4.botonAplicar1_action}"
                                                    binding="#{FichaPersona4.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    styleClass="pdq-button-1"
                                                    text="#{FichaPersona4.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{FichaPersona4.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FichaPersona4.botonProcesar1_action}"
                                                    binding="#{FichaPersona4.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    styleClass="pdq-button-1"
                                                    text="#{FichaPersona4.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{FichaPersona4.gestor.i18n.toolTipBotonProcesar}"/>
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
