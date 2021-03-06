<?xml version="1.0" encoding="UTF-8"?>
<!--
   Copyright (C) 2009, EGT Consultores, C.A.
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
                    focus="#{Proceso4.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{Proceso4.gestor.preserveFocus}"
                    preserveScroll="#{Proceso4.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{Proceso4.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | listaFuncionAccion1 campoIdUbicacion1 campoFechaRegistroPotBenDesde1 campoFechaRegistroPotBenHasta1 campoEdadDesde1 campoEdadHasta1 campoLote1 campoCodigoSime1 campoFechaSolicitudPensionDesde1 campoFechaSolicitudPensionHasta1 campoNumeroResolucionOtorPen1 campoFechaResolucionOtorPen1 campoCedulaDesde1 campoCedulaHasta1 campoNumeroResolucionDenPen1 campoFechaResolucionDenPen1 campoMontoPension1 campoFechaResolucionRevPen1 campoNumeroResolucionRevPen1 | , virtualForm2 | | , virtualForm3 | listaFuncionAccion1 | listaFuncionAccion1 , virtualForm4 | | ">
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
                                        binding="#{Proceso4.breadcrumbs1}" 
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
                                                    rendered="#{Proceso4.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{Proceso4.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{Proceso4.gestor.mensajeDisponible}"
                                                    text="#{Proceso4.gestor.mensaje}"
                                                    url="#{Proceso4.gestor.urlAnclaPie1}"/>
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
                                                    binding="#{Proceso4.etiquetaListaFuncionAccion1}"
                                                    id="etiquetaListaFuncionAccion1"
                                                    for="listaFuncionAccion1"
                                                    text="#{Proceso4.gestor.i18n.textoEtiquetaListaFuncionAccion}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel110"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown
                                                    binding="#{Proceso4.listaFuncionAccion1}"
                                                    converter="#{Proceso4.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{Proceso4.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme4_2.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    required="true"
                                                    selected="#{Proceso4.gestor.valorListaFuncionAccion1}"
                                                    toolTip="#{Proceso4.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:staticText
                                                    binding="#{Proceso4.listaFuncionAccion1Texto1}"
                                                    id="listaFuncionAccion1Texto1"/>
                                                <webuijsf:message
                                                    for="listaFuncionAccion1"
                                                    id="messageListaFuncionAccion1"/>
                                                <webuijsf:helpInline
                                                    binding="#{Proceso4.helpInlineListaFuncionAccion1}"
                                                    id="helpInlineListaFuncionAccion1"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-page"
                                                    text="#{Proceso4.gestor.i18n.inlineHelpListaFuncionAccion}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdUbicacion1" rendered="#{Proceso4.bitIdUbicacionRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Proceso4.labelIdUbicacion1}"
                                                    id="labelIdUbicacion1"
                                                    for="campoIdUbicacion1"
                                                    text="ubicaci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdUbicacion2" rendered="#{Proceso4.bitIdUbicacionRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdUbicacion1"
                                                    binding="#{Proceso4.campoIdUbicacion1}"
                                                    text="#{Proceso4.textoCampoIdUbicacion1}"
                                                    toolTip="#{Proceso4.toolTipCampoIdUbicacion1}"
                                                    validatorExpression="#{Proceso4.campoIdUbicacion1_validate}"/>
                                                <webuijsf:staticText id="campoIdUbicacion1Texto1"
                                                    binding="#{Proceso4.campoIdUbicacion1Texto1}"/>
                                                <webuijsf:button id="campoIdUbicacion1Boton1"
                                                    binding="#{Proceso4.campoIdUbicacion1Boton1}"
                                                    onClick="#{Proceso4.scriptCampoIdUbicacion1Boton1}"/>
                                                <webuijsf:button id="campoIdUbicacion1Boton3"
                                                    binding="#{Proceso4.campoIdUbicacion1Boton3}"
                                                    onClick="#{Proceso4.scriptCampoIdUbicacion1Boton2}"
                                                    rendered="#{Proceso4.bitCampoIdUbicacion1Boton3Rendered.on}"/>
                                                <webuijsf:message id="messageIdUbicacion1"
                                                    for="campoIdUbicacion1"/>
                                                <webuijsf:helpInline id="helpInlineIdUbicacion1"
                                                    binding="#{Proceso4.helpInlineIdUbicacion1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_ubicacion"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdUbicacion3"
                                                rendered="#{Proceso4.bitCampoIdUbicacion1Boton2Rendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Proceso4.labelIdUbicacion2}"
                                                    id="labelIdUbicacion2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre ubicaci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdUbicacion4"
                                                rendered="#{Proceso4.bitCampoIdUbicacion1Boton2Rendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{Proceso4.campoIdUbicacion1Texto2}"
                                                    id="campoIdUbicacion1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{Proceso4.campoIdUbicacion1Boton2}"
                                                    id="campoIdUbicacion1Boton2"
                                                    onClick="#{Proceso4.scriptCampoIdUbicacion1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaRegistroPotBenDesde1" rendered="#{Proceso4.bitFechaRegistroPotBenDesdeRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Proceso4.labelFechaRegistroPotBenDesde1}"
                                                    id="labelFechaRegistroPotBenDesde1"
                                                    for="campoFechaRegistroPotBenDesde1"
                                                    text="fecha registro potencial beneficiario desde"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaRegistroPotBenDesde2" rendered="#{Proceso4.bitFechaRegistroPotBenDesdeRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaRegistroPotBenDesde1"
                                                    binding="#{Proceso4.campoFechaRegistroPotBenDesde1}"
                                                    maxDate="#{Proceso4.gestor.defaultMaxDate}"
                                                    minDate="#{Proceso4.gestor.defaultMinDate}"
                                                    selectedDate="#{Proceso4.valorCampoFechaRegistroPotBenDesde1}"
                                                    toolTip="BundleParametros.fecha_registro_pot_ben_desde"/>
                                                <webuijsf:staticText id="campoFechaRegistroPotBenDesde1Texto1"
                                                    binding="#{Proceso4.campoFechaRegistroPotBenDesde1Texto1}"/>
                                                <webuijsf:message id="messageFechaRegistroPotBenDesde1"
                                                    for="campoFechaRegistroPotBenDesde1"/>
                                                <webuijsf:helpInline id="helpInlineFechaRegistroPotBenDesde1"
                                                    binding="#{Proceso4.helpInlineFechaRegistroPotBenDesde1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_registro_pot_ben_desde"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaRegistroPotBenHasta1" rendered="#{Proceso4.bitFechaRegistroPotBenHastaRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Proceso4.labelFechaRegistroPotBenHasta1}"
                                                    id="labelFechaRegistroPotBenHasta1"
                                                    for="campoFechaRegistroPotBenHasta1"
                                                    text="fecha registro potencial beneficiario hasta"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaRegistroPotBenHasta2" rendered="#{Proceso4.bitFechaRegistroPotBenHastaRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaRegistroPotBenHasta1"
                                                    binding="#{Proceso4.campoFechaRegistroPotBenHasta1}"
                                                    maxDate="#{Proceso4.gestor.defaultMaxDate}"
                                                    minDate="#{Proceso4.gestor.defaultMinDate}"
                                                    selectedDate="#{Proceso4.valorCampoFechaRegistroPotBenHasta1}"
                                                    toolTip="BundleParametros.fecha_registro_pot_ben_hasta"/>
                                                <webuijsf:staticText id="campoFechaRegistroPotBenHasta1Texto1"
                                                    binding="#{Proceso4.campoFechaRegistroPotBenHasta1Texto1}"/>
                                                <webuijsf:message id="messageFechaRegistroPotBenHasta1"
                                                    for="campoFechaRegistroPotBenHasta1"/>
                                                <webuijsf:helpInline id="helpInlineFechaRegistroPotBenHasta1"
                                                    binding="#{Proceso4.helpInlineFechaRegistroPotBenHasta1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_registro_pot_ben_hasta"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEdadDesde1" rendered="#{Proceso4.bitEdadDesdeRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Proceso4.labelEdadDesde1}"
                                                    id="labelEdadDesde1"
                                                    for="campoEdadDesde1"
                                                    text="edad desde"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEdadDesde2" rendered="#{Proceso4.bitEdadDesdeRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoEdadDesde1"
                                                    binding="#{Proceso4.campoEdadDesde1}"
                                                    converter="#{Proceso4.converterEdadDesde1}"
                                                    text="#{Proceso4.textoCampoEdadDesde1}"
                                                    toolTip="BundleParametros.edad_desde"
                                                    validatorExpression="#{Proceso4.validatorEdadDesde1.validate}"/>
                                                <webuijsf:staticText id="campoEdadDesde1Texto1"
                                                    binding="#{Proceso4.campoEdadDesde1Texto1}"/>
                                                <webuijsf:message id="messageEdadDesde1"
                                                    for="campoEdadDesde1"/>
                                                <webuijsf:helpInline id="helpInlineEdadDesde1"
                                                    binding="#{Proceso4.helpInlineEdadDesde1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.edad_desde"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEdadHasta1" rendered="#{Proceso4.bitEdadHastaRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Proceso4.labelEdadHasta1}"
                                                    id="labelEdadHasta1"
                                                    for="campoEdadHasta1"
                                                    text="edad hasta"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEdadHasta2" rendered="#{Proceso4.bitEdadHastaRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoEdadHasta1"
                                                    binding="#{Proceso4.campoEdadHasta1}"
                                                    converter="#{Proceso4.converterEdadHasta1}"
                                                    text="#{Proceso4.textoCampoEdadHasta1}"
                                                    toolTip="BundleParametros.edad_hasta"
                                                    validatorExpression="#{Proceso4.validatorEdadHasta1.validate}"/>
                                                <webuijsf:staticText id="campoEdadHasta1Texto1"
                                                    binding="#{Proceso4.campoEdadHasta1Texto1}"/>
                                                <webuijsf:message id="messageEdadHasta1"
                                                    for="campoEdadHasta1"/>
                                                <webuijsf:helpInline id="helpInlineEdadHasta1"
                                                    binding="#{Proceso4.helpInlineEdadHasta1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.edad_hasta"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridLote1" rendered="#{Proceso4.bitLoteRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Proceso4.labelLote1}"
                                                    id="labelLote1"
                                                    for="campoLote1"
                                                    text="lote"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridLote2" rendered="#{Proceso4.bitLoteRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoLote1"
                                                    binding="#{Proceso4.campoLote1}"
                                                    converter="#{Proceso4.converterLote1}"
                                                     required="true"
                                                    text="#{Proceso4.textoCampoLote1}"
                                                    toolTip="BundleParametros.lote"
                                                    validatorExpression="#{Proceso4.validatorLote1.validate}"/>
                                                <webuijsf:staticText id="campoLote1Texto1"
                                                    binding="#{Proceso4.campoLote1Texto1}"/>
                                                <webuijsf:message id="messageLote1"
                                                    for="campoLote1"/>
                                                <webuijsf:helpInline id="helpInlineLote1"
                                                    binding="#{Proceso4.helpInlineLote1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.lote"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridCodigoSime1" rendered="#{Proceso4.bitCodigoSimeRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Proceso4.labelCodigoSime1}"
                                                    id="labelCodigoSime1"
                                                    for="campoCodigoSime1"
                                                    text="c&#243;digo sime"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridCodigoSime2" rendered="#{Proceso4.bitCodigoSimeRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoCodigoSime1"
                                                    binding="#{Proceso4.campoCodigoSime1}"
                                                    columns="50"
                                                     required="true"
                                                    text="#{Proceso4.textoCampoCodigoSime1}"
                                                    toolTip="BundleParametros.codigo_sime"
                                                    validatorExpression="#{Proceso4.validatorCodigoSime1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoSime1Texto1"
                                                    binding="#{Proceso4.campoCodigoSime1Texto1}"/>
                                                <webuijsf:message id="messageCodigoSime1"
                                                    for="campoCodigoSime1"/>
                                                <webuijsf:helpInline id="helpInlineCodigoSime1"
                                                    binding="#{Proceso4.helpInlineCodigoSime1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.codigo_sime"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaSolicitudPensionDesde1" rendered="#{Proceso4.bitFechaSolicitudPensionDesdeRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Proceso4.labelFechaSolicitudPensionDesde1}"
                                                    id="labelFechaSolicitudPensionDesde1"
                                                    for="campoFechaSolicitudPensionDesde1"
                                                    text="fecha solicitud pensi&#243;n desde"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaSolicitudPensionDesde2" rendered="#{Proceso4.bitFechaSolicitudPensionDesdeRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaSolicitudPensionDesde1"
                                                    binding="#{Proceso4.campoFechaSolicitudPensionDesde1}"
                                                    maxDate="#{Proceso4.gestor.defaultMaxDate}"
                                                    minDate="#{Proceso4.gestor.defaultMinDate}"
                                                    selectedDate="#{Proceso4.valorCampoFechaSolicitudPensionDesde1}"
                                                    toolTip="BundleParametros.fecha_solicitud_pension_desde"/>
                                                <webuijsf:staticText id="campoFechaSolicitudPensionDesde1Texto1"
                                                    binding="#{Proceso4.campoFechaSolicitudPensionDesde1Texto1}"/>
                                                <webuijsf:message id="messageFechaSolicitudPensionDesde1"
                                                    for="campoFechaSolicitudPensionDesde1"/>
                                                <webuijsf:helpInline id="helpInlineFechaSolicitudPensionDesde1"
                                                    binding="#{Proceso4.helpInlineFechaSolicitudPensionDesde1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_solicitud_pension_desde"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaSolicitudPensionHasta1" rendered="#{Proceso4.bitFechaSolicitudPensionHastaRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Proceso4.labelFechaSolicitudPensionHasta1}"
                                                    id="labelFechaSolicitudPensionHasta1"
                                                    for="campoFechaSolicitudPensionHasta1"
                                                    text="fecha solicitud pensi&#243;n hasta"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaSolicitudPensionHasta2" rendered="#{Proceso4.bitFechaSolicitudPensionHastaRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaSolicitudPensionHasta1"
                                                    binding="#{Proceso4.campoFechaSolicitudPensionHasta1}"
                                                    maxDate="#{Proceso4.gestor.defaultMaxDate}"
                                                    minDate="#{Proceso4.gestor.defaultMinDate}"
                                                    selectedDate="#{Proceso4.valorCampoFechaSolicitudPensionHasta1}"
                                                    toolTip="BundleParametros.fecha_solicitud_pension_hasta"/>
                                                <webuijsf:staticText id="campoFechaSolicitudPensionHasta1Texto1"
                                                    binding="#{Proceso4.campoFechaSolicitudPensionHasta1Texto1}"/>
                                                <webuijsf:message id="messageFechaSolicitudPensionHasta1"
                                                    for="campoFechaSolicitudPensionHasta1"/>
                                                <webuijsf:helpInline id="helpInlineFechaSolicitudPensionHasta1"
                                                    binding="#{Proceso4.helpInlineFechaSolicitudPensionHasta1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_solicitud_pension_hasta"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroResolucionOtorPen1" rendered="#{Proceso4.bitNumeroResolucionOtorPenRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Proceso4.labelNumeroResolucionOtorPen1}"
                                                    id="labelNumeroResolucionOtorPen1"
                                                    for="campoNumeroResolucionOtorPen1"
                                                    text="n&#250;mero resoluci&#243;n otorgamiento pensi&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroResolucionOtorPen2" rendered="#{Proceso4.bitNumeroResolucionOtorPenRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNumeroResolucionOtorPen1"
                                                    binding="#{Proceso4.campoNumeroResolucionOtorPen1}"
                                                    columns="50"
                                                     required="true"
                                                    text="#{Proceso4.textoCampoNumeroResolucionOtorPen1}"
                                                    toolTip="BundleParametros.numero_resolucion_otor_pen"
                                                    validatorExpression="#{Proceso4.validatorNumeroResolucionOtorPen1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroResolucionOtorPen1Texto1"
                                                    binding="#{Proceso4.campoNumeroResolucionOtorPen1Texto1}"/>
                                                <webuijsf:message id="messageNumeroResolucionOtorPen1"
                                                    for="campoNumeroResolucionOtorPen1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroResolucionOtorPen1"
                                                    binding="#{Proceso4.helpInlineNumeroResolucionOtorPen1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_resolucion_otor_pen"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaResolucionOtorPen1" rendered="#{Proceso4.bitFechaResolucionOtorPenRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Proceso4.labelFechaResolucionOtorPen1}"
                                                    id="labelFechaResolucionOtorPen1"
                                                    for="campoFechaResolucionOtorPen1"
                                                    text="fecha resoluci&#243;n otorgamiento pensi&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaResolucionOtorPen2" rendered="#{Proceso4.bitFechaResolucionOtorPenRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaResolucionOtorPen1"
                                                    binding="#{Proceso4.campoFechaResolucionOtorPen1}"
                                                    maxDate="#{Proceso4.gestor.defaultMaxDate}"
                                                    minDate="#{Proceso4.gestor.defaultMinDate}"
                                                     required="true"
                                                    selectedDate="#{Proceso4.valorCampoFechaResolucionOtorPen1}"
                                                    toolTip="BundleParametros.fecha_resolucion_otor_pen"/>
                                                <webuijsf:staticText id="campoFechaResolucionOtorPen1Texto1"
                                                    binding="#{Proceso4.campoFechaResolucionOtorPen1Texto1}"/>
                                                <webuijsf:message id="messageFechaResolucionOtorPen1"
                                                    for="campoFechaResolucionOtorPen1"/>
                                                <webuijsf:helpInline id="helpInlineFechaResolucionOtorPen1"
                                                    binding="#{Proceso4.helpInlineFechaResolucionOtorPen1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_resolucion_otor_pen"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridCedulaDesde1" rendered="#{Proceso4.bitCedulaDesdeRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Proceso4.labelCedulaDesde1}"
                                                    id="labelCedulaDesde1"
                                                    for="campoCedulaDesde1"
                                                    text="c&#233;dula desde"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridCedulaDesde2" rendered="#{Proceso4.bitCedulaDesdeRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoCedulaDesde1"
                                                    binding="#{Proceso4.campoCedulaDesde1}"
                                                    columns="50"
                                                    text="#{Proceso4.textoCampoCedulaDesde1}"
                                                    toolTip="BundleParametros.cedula_desde"
                                                    validatorExpression="#{Proceso4.validatorCedulaDesde1.validate}"/>
                                                <webuijsf:staticText id="campoCedulaDesde1Texto1"
                                                    binding="#{Proceso4.campoCedulaDesde1Texto1}"/>
                                                <webuijsf:message id="messageCedulaDesde1"
                                                    for="campoCedulaDesde1"/>
                                                <webuijsf:helpInline id="helpInlineCedulaDesde1"
                                                    binding="#{Proceso4.helpInlineCedulaDesde1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.cedula_desde"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridCedulaHasta1" rendered="#{Proceso4.bitCedulaHastaRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Proceso4.labelCedulaHasta1}"
                                                    id="labelCedulaHasta1"
                                                    for="campoCedulaHasta1"
                                                    text="c&#233;dula hasta"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridCedulaHasta2" rendered="#{Proceso4.bitCedulaHastaRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoCedulaHasta1"
                                                    binding="#{Proceso4.campoCedulaHasta1}"
                                                    columns="50"
                                                    text="#{Proceso4.textoCampoCedulaHasta1}"
                                                    toolTip="BundleParametros.cedula_hasta"
                                                    validatorExpression="#{Proceso4.validatorCedulaHasta1.validate}"/>
                                                <webuijsf:staticText id="campoCedulaHasta1Texto1"
                                                    binding="#{Proceso4.campoCedulaHasta1Texto1}"/>
                                                <webuijsf:message id="messageCedulaHasta1"
                                                    for="campoCedulaHasta1"/>
                                                <webuijsf:helpInline id="helpInlineCedulaHasta1"
                                                    binding="#{Proceso4.helpInlineCedulaHasta1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.cedula_hasta"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroResolucionDenPen1" rendered="#{Proceso4.bitNumeroResolucionDenPenRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Proceso4.labelNumeroResolucionDenPen1}"
                                                    id="labelNumeroResolucionDenPen1"
                                                    for="campoNumeroResolucionDenPen1"
                                                    text="n&#250;mero resoluci&#243;n denegaci&#243;n pensi&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroResolucionDenPen2" rendered="#{Proceso4.bitNumeroResolucionDenPenRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNumeroResolucionDenPen1"
                                                    binding="#{Proceso4.campoNumeroResolucionDenPen1}"
                                                    columns="50"
                                                     required="true"
                                                    text="#{Proceso4.textoCampoNumeroResolucionDenPen1}"
                                                    toolTip="BundleParametros.numero_resolucion_den_pen"
                                                    validatorExpression="#{Proceso4.validatorNumeroResolucionDenPen1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroResolucionDenPen1Texto1"
                                                    binding="#{Proceso4.campoNumeroResolucionDenPen1Texto1}"/>
                                                <webuijsf:message id="messageNumeroResolucionDenPen1"
                                                    for="campoNumeroResolucionDenPen1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroResolucionDenPen1"
                                                    binding="#{Proceso4.helpInlineNumeroResolucionDenPen1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_resolucion_den_pen"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaResolucionDenPen1" rendered="#{Proceso4.bitFechaResolucionDenPenRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Proceso4.labelFechaResolucionDenPen1}"
                                                    id="labelFechaResolucionDenPen1"
                                                    for="campoFechaResolucionDenPen1"
                                                    text="fecha resoluci&#243;n denegaci&#243;n pensi&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaResolucionDenPen2" rendered="#{Proceso4.bitFechaResolucionDenPenRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaResolucionDenPen1"
                                                    binding="#{Proceso4.campoFechaResolucionDenPen1}"
                                                    maxDate="#{Proceso4.gestor.defaultMaxDate}"
                                                    minDate="#{Proceso4.gestor.defaultMinDate}"
                                                     required="true"
                                                    selectedDate="#{Proceso4.valorCampoFechaResolucionDenPen1}"
                                                    toolTip="BundleParametros.fecha_resolucion_den_pen"/>
                                                <webuijsf:staticText id="campoFechaResolucionDenPen1Texto1"
                                                    binding="#{Proceso4.campoFechaResolucionDenPen1Texto1}"/>
                                                <webuijsf:message id="messageFechaResolucionDenPen1"
                                                    for="campoFechaResolucionDenPen1"/>
                                                <webuijsf:helpInline id="helpInlineFechaResolucionDenPen1"
                                                    binding="#{Proceso4.helpInlineFechaResolucionDenPen1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_resolucion_den_pen"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridMontoPension1" rendered="#{Proceso4.bitMontoPensionRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Proceso4.labelMontoPension1}"
                                                    id="labelMontoPension1"
                                                    for="campoMontoPension1"
                                                    text="monto pensi&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridMontoPension2" rendered="#{Proceso4.bitMontoPensionRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoMontoPension1"
                                                    binding="#{Proceso4.campoMontoPension1}"
                                                    converter="#{Proceso4.converterMontoPension1}"
                                                     required="true"
                                                    text="#{Proceso4.textoCampoMontoPension1}"
                                                    toolTip="BundleParametros.monto_pension"
                                                    validatorExpression="#{Proceso4.validatorMontoPension1.validate}"/>
                                                <webuijsf:staticText id="campoMontoPension1Texto1"
                                                    binding="#{Proceso4.campoMontoPension1Texto1}"/>
                                                <webuijsf:message id="messageMontoPension1"
                                                    for="campoMontoPension1"/>
                                                <webuijsf:helpInline id="helpInlineMontoPension1"
                                                    binding="#{Proceso4.helpInlineMontoPension1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.monto_pension"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaResolucionRevPen1" rendered="#{Proceso4.bitFechaResolucionRevPenRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Proceso4.labelFechaResolucionRevPen1}"
                                                    id="labelFechaResolucionRevPen1"
                                                    for="campoFechaResolucionRevPen1"
                                                    text="fecha resoluci&#243;n revocaci&#243;n pensi&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaResolucionRevPen2" rendered="#{Proceso4.bitFechaResolucionRevPenRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaResolucionRevPen1"
                                                    binding="#{Proceso4.campoFechaResolucionRevPen1}"
                                                    maxDate="#{Proceso4.gestor.defaultMaxDate}"
                                                    minDate="#{Proceso4.gestor.defaultMinDate}"
                                                     required="true"
                                                    selectedDate="#{Proceso4.valorCampoFechaResolucionRevPen1}"
                                                    toolTip="BundleParametros.fecha_resolucion_rev_pen"/>
                                                <webuijsf:staticText id="campoFechaResolucionRevPen1Texto1"
                                                    binding="#{Proceso4.campoFechaResolucionRevPen1Texto1}"/>
                                                <webuijsf:message id="messageFechaResolucionRevPen1"
                                                    for="campoFechaResolucionRevPen1"/>
                                                <webuijsf:helpInline id="helpInlineFechaResolucionRevPen1"
                                                    binding="#{Proceso4.helpInlineFechaResolucionRevPen1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_resolucion_rev_pen"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroResolucionRevPen1" rendered="#{Proceso4.bitNumeroResolucionRevPenRendered.on}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Proceso4.labelNumeroResolucionRevPen1}"
                                                    id="labelNumeroResolucionRevPen1"
                                                    for="campoNumeroResolucionRevPen1"
                                                    text="n&#250;mero resoluci&#243;n revocaci&#243;n pensi&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroResolucionRevPen2" rendered="#{Proceso4.bitNumeroResolucionRevPenRendered.on}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNumeroResolucionRevPen1"
                                                    binding="#{Proceso4.campoNumeroResolucionRevPen1}"
                                                    columns="50"
                                                     required="true"
                                                    text="#{Proceso4.textoCampoNumeroResolucionRevPen1}"
                                                    toolTip="BundleParametros.numero_resolucion_rev_pen"
                                                    validatorExpression="#{Proceso4.validatorNumeroResolucionRevPen1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroResolucionRevPen1Texto1"
                                                    binding="#{Proceso4.campoNumeroResolucionRevPen1Texto1}"/>
                                                <webuijsf:message id="messageNumeroResolucionRevPen1"
                                                    for="campoNumeroResolucionRevPen1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroResolucionRevPen1"
                                                    binding="#{Proceso4.helpInlineNumeroResolucionRevPen1}"                                                    
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_resolucion_rev_pen"
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
                                                    actionExpression="#{Proceso4.botonAplicar1_action}"
                                                    binding="#{Proceso4.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    styleClass="pdq-button-1"
                                                    text="#{Proceso4.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{Proceso4.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Proceso4.botonProcesar1_action}"
                                                    binding="#{Proceso4.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    styleClass="pdq-button-1"
                                                    text="#{Proceso4.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{Proceso4.gestor.i18n.toolTipBotonProcesar}"/>
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
