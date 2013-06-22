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
                    focus="#{LogImpPerEec6.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{LogImpPerEec6.gestor.preserveFocus}"
                    preserveScroll="#{LogImpPerEec6.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{LogImpPerEec6.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | campoIdLogImpPerEec1 campoDptod1 campoDistritod1 campoDistripg1 campoArea1 campoBarrio1 campoManzana1 campoFormulario1 campoVivi1 campoHogar1 campoOrden1 campoP301 campoP311 campoP321 campoP331 campoP341 campoP351 campoP36OrdenConyugue1 campoP36OrdenPadre1 campoP36OrdenMadre1 campoP371 campoP37Cedula1 campoP38Dia1 campoP38Mes1 campoP38Ano1 campoP39pais1 campoP39dpto1 campoP39dist1 campoP39area1 campoP40Idioma1 campoP40otr1 campoP411 campoP421 campoP431 campoP4445t1 campoP441 campoP451 campoP461 campoP471 campoP481 campoP491 campoP49Otr1 campoP501 campoP50Otr1 campoP511 campoP521 campoP52Otr1 campoP531 campoP541 campoP54a1 campoP54Otr1 campoP551 campoP55Otr1 campoP561 campoP571 campoP581 campoP591 campoP601 campoP611 campoP621 campoP631 campoP63Especificar1 campoP64des1 campoP64c1 campoP65des1 campoP65c1 campoP661 campoP67a1 campoP67b1 campoP67c1 campoP67d1 campoP67e1 campoP67f1 campoP67g1 campoP67h1 campoP67i1 campoP67j1 campoP67k1 campoP67l1 campoP67tot1 listaEsImportado1 campoObservacion1 campoFechaHoraTransaccion1 campoNombreArchivo1 campoCodigoArchivo1 campoIdFichaPersona1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | | , virtualForm3 | listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{LogImpPerEec6.breadcrumbs1}" 
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
                                                    rendered="#{LogImpPerEec6.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{LogImpPerEec6.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{LogImpPerEec6.gestor.mensajeDisponible}"
                                                    text="#{LogImpPerEec6.gestor.mensaje}"
                                                    url="#{LogImpPerEec6.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            id="gridPanel104"
                                            rendered="#{LogImpPerEec6.gestor.filaDisponible}"
                                            styleClass="pdq-grid-detalle-1">
                                        <h:panelGrid
                                            id="gridPanel105"
                                            styleClass="pdq-grid-detalle-cab">
                                        <h:panelGrid
                                            columns="2"
                                            id="gridPanel106">
                                            <h:panelGrid
                                                id="gridPanel107"
                                                styleClass="pdq-grid-detalle-botones">
                                                <h:panelGrid 
                                                    columns="7"
                                                    id="gridPanel108">
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpPerEec6.botonIrAlPrimero1_action}"
                                                        binding="#{LogImpPerEec6.botonIrAlPrimero1}"
                                                        disabled="#{LogImpPerEec6.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero1"
                                                        imageURL="#{LogImpPerEec6.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{LogImpPerEec6.gestor.scriptIrAlPrimero}"
                                                        text="#{LogImpPerEec6.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{LogImpPerEec6.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpPerEec6.botonIrAlAnterior1_action}"
                                                        binding="#{LogImpPerEec6.botonIrAlAnterior1}"
                                                        disabled="#{LogImpPerEec6.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior1"
                                                        imageURL="#{LogImpPerEec6.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{LogImpPerEec6.gestor.scriptIrAlAnterior}"
                                                        text="#{LogImpPerEec6.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{LogImpPerEec6.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpPerEec6.botonIrAlSiguiente1_action}"
                                                        binding="#{LogImpPerEec6.botonIrAlSiguiente1}"
                                                        disabled="#{LogImpPerEec6.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente1"
                                                        imageURL="#{LogImpPerEec6.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{LogImpPerEec6.gestor.scriptIrAlSiguiente}"
                                                        text="#{LogImpPerEec6.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{LogImpPerEec6.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpPerEec6.botonIrAlUltimo1_action}"
                                                        binding="#{LogImpPerEec6.botonIrAlUltimo1}"
                                                        disabled="#{LogImpPerEec6.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo1"
                                                        imageURL="#{LogImpPerEec6.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{LogImpPerEec6.gestor.scriptIrAlUltimo}"
                                                        text="#{LogImpPerEec6.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{LogImpPerEec6.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpPerEec6.botonProcesarFila1_action}"
                                                        binding="#{LogImpPerEec6.botonProcesarFila1}"
                                                        disabled="#{LogImpPerEec6.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila1"
                                                        imageURL="#{LogImpPerEec6.gestor.urlImagenProcesar}"
                                                        onClick="#{LogImpPerEec6.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{LogImpPerEec6.asistente.comandoDisponible}"
                                                        text="#{LogImpPerEec6.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{LogImpPerEec6.gestor.i18n.toolTipBotonProcesarFila}"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPanel109"
                                                styleClass="pdq-grid-detalle-mensajes">
                                                <h:panelGrid
                                                    id="gridPanel110"
                                                    styleClass="pdq-grid-detalle-mensajes-2">
                                                    <webuijsf:staticText
                                                        id="textoTituloConsulta1"
                                                        styleClass="pdq-text-titulo-1"
                                                        text="#{LogImpPerEec6.gestor.tituloConsulta}"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            columns="2"
                                            id="gridPanel111">
                                            <h:panelGrid
                                                id="gridPanel112"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.etiquetaIdentificacionFila1}"
                                                    id="etiquetaIdentificacionFila1"
                                                    text="#{LogImpPerEec6.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{LogImpPerEec6.gestor.i18n.toolTipEtiquetaIdentificacionFila}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel113"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoIdentificacionFila1"
                                                    style="font-weight: bold"
                                                    text="#{LogImpPerEec6.gestor.identificacionFila}"/>
                                                <webuijsf:image
                                                    id="imagenFilaProcesada1"
                                                    toolTip="#{LogImpPerEec6.gestor.toolTipImagenFilaProcesada}"
                                                    url="#{LogImpPerEec6.gestor.urlImagenFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPanel114"
                                                rendered="#{LogImpPerEec6.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.etiquetaDenominacionFilaMaestro1}"
                                                    id="etiquetaDenominacionFilaMaestro1"
                                                    text="?"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel115"
                                                rendered="#{LogImpPerEec6.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoDenominacionFilaMaestro1"
                                                    style="font-weight: bold"
                                                    text="#{LogImpPerEec6.gestor.denominacionFilaMaestro}"/>
                                                <webuijsf:image
                                                    id="imagenFilaMaestro1"
                                                    url="#{LogImpPerEec6.gestor.urlImagenMaestroFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdLogImpPerEec1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelIdLogImpPerEec1}"
                                                    id="labelIdLogImpPerEec1"
                                                    for="campoIdLogImpPerEec1"
                                                    toolTip="BundleParametros.id_log_imp_per_eec.log_imp_per_eec"
                                                    text="identificaci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdLogImpPerEec2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdLogImpPerEec1"
                                                    binding="#{LogImpPerEec6.campoIdLogImpPerEec1}"
                                                    converter="#{LogImpPerEec6.converterIdLogImpPerEec1}"
                                                    readOnly="true"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['id_log_imp_per_eec']}"
                                                    toolTip="BundleParametros.id_log_imp_per_eec.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorIdLogImpPerEec1.validate}"/>
                                                <webuijsf:staticText id="campoIdLogImpPerEec1Texto1"
                                                    binding="#{LogImpPerEec6.campoIdLogImpPerEec1Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['id_log_imp_per_eec']}"/>
                                                <webuijsf:message id="messageIdLogImpPerEec1"
                                                    for="campoIdLogImpPerEec1"/>
                                                <webuijsf:helpInline id="helpInlineIdLogImpPerEec1"
                                                    binding="#{LogImpPerEec6.helpInlineIdLogImpPerEec1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_log_imp_per_eec.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridDptod1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelDptod1}"
                                                    id="labelDptod1"
                                                    for="campoDptod1"
                                                    toolTip="BundleParametros.dptod.log_imp_per_eec"
                                                    text="dptod"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridDptod2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoDptod1"
                                                    binding="#{LogImpPerEec6.campoDptod1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['dptod']}"
                                                    toolTip="BundleParametros.dptod.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorDptod1.validate}"/>
                                                <webuijsf:staticText id="campoDptod1Texto1"
                                                    binding="#{LogImpPerEec6.campoDptod1Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['dptod']}"/>
                                                <webuijsf:message id="messageDptod1"
                                                    for="campoDptod1"/>
                                                <webuijsf:helpInline id="helpInlineDptod1"
                                                    binding="#{LogImpPerEec6.helpInlineDptod1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.dptod.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridDistritod1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelDistritod1}"
                                                    id="labelDistritod1"
                                                    for="campoDistritod1"
                                                    toolTip="BundleParametros.distritod.log_imp_per_eec"
                                                    text="distritod"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridDistritod2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoDistritod1"
                                                    binding="#{LogImpPerEec6.campoDistritod1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['distritod']}"
                                                    toolTip="BundleParametros.distritod.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorDistritod1.validate}"/>
                                                <webuijsf:staticText id="campoDistritod1Texto1"
                                                    binding="#{LogImpPerEec6.campoDistritod1Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['distritod']}"/>
                                                <webuijsf:message id="messageDistritod1"
                                                    for="campoDistritod1"/>
                                                <webuijsf:helpInline id="helpInlineDistritod1"
                                                    binding="#{LogImpPerEec6.helpInlineDistritod1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.distritod.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridDistripg1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelDistripg1}"
                                                    id="labelDistripg1"
                                                    for="campoDistripg1"
                                                    toolTip="BundleParametros.distripg.log_imp_per_eec"
                                                    text="distripg"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridDistripg2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoDistripg1"
                                                    binding="#{LogImpPerEec6.campoDistripg1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['distripg']}"
                                                    toolTip="BundleParametros.distripg.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorDistripg1.validate}"/>
                                                <webuijsf:staticText id="campoDistripg1Texto1"
                                                    binding="#{LogImpPerEec6.campoDistripg1Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['distripg']}"/>
                                                <webuijsf:message id="messageDistripg1"
                                                    for="campoDistripg1"/>
                                                <webuijsf:helpInline id="helpInlineDistripg1"
                                                    binding="#{LogImpPerEec6.helpInlineDistripg1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.distripg.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridArea1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelArea1}"
                                                    id="labelArea1"
                                                    for="campoArea1"
                                                    toolTip="BundleParametros.area.log_imp_per_eec"
                                                    text="area"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridArea2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoArea1"
                                                    binding="#{LogImpPerEec6.campoArea1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['area']}"
                                                    toolTip="BundleParametros.area.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorArea1.validate}"/>
                                                <webuijsf:staticText id="campoArea1Texto1"
                                                    binding="#{LogImpPerEec6.campoArea1Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['area']}"/>
                                                <webuijsf:message id="messageArea1"
                                                    for="campoArea1"/>
                                                <webuijsf:helpInline id="helpInlineArea1"
                                                    binding="#{LogImpPerEec6.helpInlineArea1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.area.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridBarrio1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelBarrio1}"
                                                    id="labelBarrio1"
                                                    for="campoBarrio1"
                                                    toolTip="BundleParametros.barrio.log_imp_per_eec"
                                                    text="barrio"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridBarrio2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoBarrio1"
                                                    binding="#{LogImpPerEec6.campoBarrio1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['barrio']}"
                                                    toolTip="BundleParametros.barrio.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorBarrio1.validate}"/>
                                                <webuijsf:staticText id="campoBarrio1Texto1"
                                                    binding="#{LogImpPerEec6.campoBarrio1Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['barrio']}"/>
                                                <webuijsf:message id="messageBarrio1"
                                                    for="campoBarrio1"/>
                                                <webuijsf:helpInline id="helpInlineBarrio1"
                                                    binding="#{LogImpPerEec6.helpInlineBarrio1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.barrio.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridManzana1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelManzana1}"
                                                    id="labelManzana1"
                                                    for="campoManzana1"
                                                    toolTip="BundleParametros.manzana.log_imp_per_eec"
                                                    text="manzana"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridManzana2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoManzana1"
                                                    binding="#{LogImpPerEec6.campoManzana1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['manzana']}"
                                                    toolTip="BundleParametros.manzana.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorManzana1.validate}"/>
                                                <webuijsf:staticText id="campoManzana1Texto1"
                                                    binding="#{LogImpPerEec6.campoManzana1Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['manzana']}"/>
                                                <webuijsf:message id="messageManzana1"
                                                    for="campoManzana1"/>
                                                <webuijsf:helpInline id="helpInlineManzana1"
                                                    binding="#{LogImpPerEec6.helpInlineManzana1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.manzana.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFormulario1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelFormulario1}"
                                                    id="labelFormulario1"
                                                    for="campoFormulario1"
                                                    toolTip="BundleParametros.formulario.log_imp_per_eec"
                                                    text="formulario"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFormulario2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoFormulario1"
                                                    binding="#{LogImpPerEec6.campoFormulario1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['formulario']}"
                                                    toolTip="BundleParametros.formulario.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorFormulario1.validate}"/>
                                                <webuijsf:staticText id="campoFormulario1Texto1"
                                                    binding="#{LogImpPerEec6.campoFormulario1Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['formulario']}"/>
                                                <webuijsf:message id="messageFormulario1"
                                                    for="campoFormulario1"/>
                                                <webuijsf:helpInline id="helpInlineFormulario1"
                                                    binding="#{LogImpPerEec6.helpInlineFormulario1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.formulario.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridVivi1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelVivi1}"
                                                    id="labelVivi1"
                                                    for="campoVivi1"
                                                    toolTip="BundleParametros.vivi.log_imp_per_eec"
                                                    text="vivi"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridVivi2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoVivi1"
                                                    binding="#{LogImpPerEec6.campoVivi1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['vivi']}"
                                                    toolTip="BundleParametros.vivi.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorVivi1.validate}"/>
                                                <webuijsf:staticText id="campoVivi1Texto1"
                                                    binding="#{LogImpPerEec6.campoVivi1Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['vivi']}"/>
                                                <webuijsf:message id="messageVivi1"
                                                    for="campoVivi1"/>
                                                <webuijsf:helpInline id="helpInlineVivi1"
                                                    binding="#{LogImpPerEec6.helpInlineVivi1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.vivi.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridHogar1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelHogar1}"
                                                    id="labelHogar1"
                                                    for="campoHogar1"
                                                    toolTip="BundleParametros.hogar.log_imp_per_eec"
                                                    text="hogar"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridHogar2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoHogar1"
                                                    binding="#{LogImpPerEec6.campoHogar1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['hogar']}"
                                                    toolTip="BundleParametros.hogar.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorHogar1.validate}"/>
                                                <webuijsf:staticText id="campoHogar1Texto1"
                                                    binding="#{LogImpPerEec6.campoHogar1Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['hogar']}"/>
                                                <webuijsf:message id="messageHogar1"
                                                    for="campoHogar1"/>
                                                <webuijsf:helpInline id="helpInlineHogar1"
                                                    binding="#{LogImpPerEec6.helpInlineHogar1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.hogar.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridOrden1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelOrden1}"
                                                    id="labelOrden1"
                                                    for="campoOrden1"
                                                    toolTip="BundleParametros.orden.log_imp_per_eec"
                                                    text="orden"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridOrden2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoOrden1"
                                                    binding="#{LogImpPerEec6.campoOrden1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['orden']}"
                                                    toolTip="BundleParametros.orden.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorOrden1.validate}"/>
                                                <webuijsf:staticText id="campoOrden1Texto1"
                                                    binding="#{LogImpPerEec6.campoOrden1Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['orden']}"/>
                                                <webuijsf:message id="messageOrden1"
                                                    for="campoOrden1"/>
                                                <webuijsf:helpInline id="helpInlineOrden1"
                                                    binding="#{LogImpPerEec6.helpInlineOrden1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.orden.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP301"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelP301}"
                                                    id="labelP301"
                                                    for="campoP301"
                                                    toolTip="BundleParametros.p30.log_imp_per_eec"
                                                    text="p30"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP302"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP301"
                                                    binding="#{LogImpPerEec6.campoP301}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p30']}"
                                                    toolTip="BundleParametros.p30.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorP301.validate}"/>
                                                <webuijsf:staticText id="campoP301Texto1"
                                                    binding="#{LogImpPerEec6.campoP301Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p30']}"/>
                                                <webuijsf:message id="messageP301"
                                                    for="campoP301"/>
                                                <webuijsf:helpInline id="helpInlineP301"
                                                    binding="#{LogImpPerEec6.helpInlineP301}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p30.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP311"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelP311}"
                                                    id="labelP311"
                                                    for="campoP311"
                                                    toolTip="BundleParametros.p31.log_imp_per_eec"
                                                    text="p31"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP312"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP311"
                                                    binding="#{LogImpPerEec6.campoP311}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p31']}"
                                                    toolTip="BundleParametros.p31.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorP311.validate}"/>
                                                <webuijsf:staticText id="campoP311Texto1"
                                                    binding="#{LogImpPerEec6.campoP311Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p31']}"/>
                                                <webuijsf:message id="messageP311"
                                                    for="campoP311"/>
                                                <webuijsf:helpInline id="helpInlineP311"
                                                    binding="#{LogImpPerEec6.helpInlineP311}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p31.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP321"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelP321}"
                                                    id="labelP321"
                                                    for="campoP321"
                                                    toolTip="BundleParametros.p32.log_imp_per_eec"
                                                    text="p32"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP322"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP321"
                                                    binding="#{LogImpPerEec6.campoP321}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p32']}"
                                                    toolTip="BundleParametros.p32.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorP321.validate}"/>
                                                <webuijsf:staticText id="campoP321Texto1"
                                                    binding="#{LogImpPerEec6.campoP321Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p32']}"/>
                                                <webuijsf:message id="messageP321"
                                                    for="campoP321"/>
                                                <webuijsf:helpInline id="helpInlineP321"
                                                    binding="#{LogImpPerEec6.helpInlineP321}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p32.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP331"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelP331}"
                                                    id="labelP331"
                                                    for="campoP331"
                                                    toolTip="BundleParametros.p33.log_imp_per_eec"
                                                    text="p33"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP332"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP331"
                                                    binding="#{LogImpPerEec6.campoP331}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p33']}"
                                                    toolTip="BundleParametros.p33.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorP331.validate}"/>
                                                <webuijsf:staticText id="campoP331Texto1"
                                                    binding="#{LogImpPerEec6.campoP331Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p33']}"/>
                                                <webuijsf:message id="messageP331"
                                                    for="campoP331"/>
                                                <webuijsf:helpInline id="helpInlineP331"
                                                    binding="#{LogImpPerEec6.helpInlineP331}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p33.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP341"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelP341}"
                                                    id="labelP341"
                                                    for="campoP341"
                                                    toolTip="BundleParametros.p34.log_imp_per_eec"
                                                    text="p34"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP342"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP341"
                                                    binding="#{LogImpPerEec6.campoP341}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p34']}"
                                                    toolTip="BundleParametros.p34.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorP341.validate}"/>
                                                <webuijsf:staticText id="campoP341Texto1"
                                                    binding="#{LogImpPerEec6.campoP341Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p34']}"/>
                                                <webuijsf:message id="messageP341"
                                                    for="campoP341"/>
                                                <webuijsf:helpInline id="helpInlineP341"
                                                    binding="#{LogImpPerEec6.helpInlineP341}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p34.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP351"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelP351}"
                                                    id="labelP351"
                                                    for="campoP351"
                                                    toolTip="BundleParametros.p35.log_imp_per_eec"
                                                    text="p35"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP352"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP351"
                                                    binding="#{LogImpPerEec6.campoP351}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p35']}"
                                                    toolTip="BundleParametros.p35.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorP351.validate}"/>
                                                <webuijsf:staticText id="campoP351Texto1"
                                                    binding="#{LogImpPerEec6.campoP351Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p35']}"/>
                                                <webuijsf:message id="messageP351"
                                                    for="campoP351"/>
                                                <webuijsf:helpInline id="helpInlineP351"
                                                    binding="#{LogImpPerEec6.helpInlineP351}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p35.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP36OrdenConyugue1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelP36OrdenConyugue1}"
                                                    id="labelP36OrdenConyugue1"
                                                    for="campoP36OrdenConyugue1"
                                                    toolTip="BundleParametros.p36_orden_conyugue.log_imp_per_eec"
                                                    text="p36 orden conyugue"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP36OrdenConyugue2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP36OrdenConyugue1"
                                                    binding="#{LogImpPerEec6.campoP36OrdenConyugue1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p36_orden_conyugue']}"
                                                    toolTip="BundleParametros.p36_orden_conyugue.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorP36OrdenConyugue1.validate}"/>
                                                <webuijsf:staticText id="campoP36OrdenConyugue1Texto1"
                                                    binding="#{LogImpPerEec6.campoP36OrdenConyugue1Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p36_orden_conyugue']}"/>
                                                <webuijsf:message id="messageP36OrdenConyugue1"
                                                    for="campoP36OrdenConyugue1"/>
                                                <webuijsf:helpInline id="helpInlineP36OrdenConyugue1"
                                                    binding="#{LogImpPerEec6.helpInlineP36OrdenConyugue1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p36_orden_conyugue.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP36OrdenPadre1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelP36OrdenPadre1}"
                                                    id="labelP36OrdenPadre1"
                                                    for="campoP36OrdenPadre1"
                                                    toolTip="BundleParametros.p36_orden_padre.log_imp_per_eec"
                                                    text="p36 orden padre"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP36OrdenPadre2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP36OrdenPadre1"
                                                    binding="#{LogImpPerEec6.campoP36OrdenPadre1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p36_orden_padre']}"
                                                    toolTip="BundleParametros.p36_orden_padre.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorP36OrdenPadre1.validate}"/>
                                                <webuijsf:staticText id="campoP36OrdenPadre1Texto1"
                                                    binding="#{LogImpPerEec6.campoP36OrdenPadre1Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p36_orden_padre']}"/>
                                                <webuijsf:message id="messageP36OrdenPadre1"
                                                    for="campoP36OrdenPadre1"/>
                                                <webuijsf:helpInline id="helpInlineP36OrdenPadre1"
                                                    binding="#{LogImpPerEec6.helpInlineP36OrdenPadre1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p36_orden_padre.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP36OrdenMadre1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelP36OrdenMadre1}"
                                                    id="labelP36OrdenMadre1"
                                                    for="campoP36OrdenMadre1"
                                                    toolTip="BundleParametros.p36_orden_madre.log_imp_per_eec"
                                                    text="p36 orden madre"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP36OrdenMadre2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP36OrdenMadre1"
                                                    binding="#{LogImpPerEec6.campoP36OrdenMadre1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p36_orden_madre']}"
                                                    toolTip="BundleParametros.p36_orden_madre.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorP36OrdenMadre1.validate}"/>
                                                <webuijsf:staticText id="campoP36OrdenMadre1Texto1"
                                                    binding="#{LogImpPerEec6.campoP36OrdenMadre1Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p36_orden_madre']}"/>
                                                <webuijsf:message id="messageP36OrdenMadre1"
                                                    for="campoP36OrdenMadre1"/>
                                                <webuijsf:helpInline id="helpInlineP36OrdenMadre1"
                                                    binding="#{LogImpPerEec6.helpInlineP36OrdenMadre1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p36_orden_madre.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP371"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelP371}"
                                                    id="labelP371"
                                                    for="campoP371"
                                                    toolTip="BundleParametros.p37.log_imp_per_eec"
                                                    text="p37"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP372"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP371"
                                                    binding="#{LogImpPerEec6.campoP371}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p37']}"
                                                    toolTip="BundleParametros.p37.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorP371.validate}"/>
                                                <webuijsf:staticText id="campoP371Texto1"
                                                    binding="#{LogImpPerEec6.campoP371Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p37']}"/>
                                                <webuijsf:message id="messageP371"
                                                    for="campoP371"/>
                                                <webuijsf:helpInline id="helpInlineP371"
                                                    binding="#{LogImpPerEec6.helpInlineP371}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p37.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP37Cedula1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelP37Cedula1}"
                                                    id="labelP37Cedula1"
                                                    for="campoP37Cedula1"
                                                    toolTip="BundleParametros.p37_cedula.log_imp_per_eec"
                                                    text="p37 c&#233;dula"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP37Cedula2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP37Cedula1"
                                                    binding="#{LogImpPerEec6.campoP37Cedula1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p37_cedula']}"
                                                    toolTip="BundleParametros.p37_cedula.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorP37Cedula1.validate}"/>
                                                <webuijsf:staticText id="campoP37Cedula1Texto1"
                                                    binding="#{LogImpPerEec6.campoP37Cedula1Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p37_cedula']}"/>
                                                <webuijsf:message id="messageP37Cedula1"
                                                    for="campoP37Cedula1"/>
                                                <webuijsf:helpInline id="helpInlineP37Cedula1"
                                                    binding="#{LogImpPerEec6.helpInlineP37Cedula1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p37_cedula.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP38Dia1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelP38Dia1}"
                                                    id="labelP38Dia1"
                                                    for="campoP38Dia1"
                                                    toolTip="BundleParametros.p38_dia.log_imp_per_eec"
                                                    text="p38 dia"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP38Dia2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP38Dia1"
                                                    binding="#{LogImpPerEec6.campoP38Dia1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p38_dia']}"
                                                    toolTip="BundleParametros.p38_dia.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorP38Dia1.validate}"/>
                                                <webuijsf:staticText id="campoP38Dia1Texto1"
                                                    binding="#{LogImpPerEec6.campoP38Dia1Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p38_dia']}"/>
                                                <webuijsf:message id="messageP38Dia1"
                                                    for="campoP38Dia1"/>
                                                <webuijsf:helpInline id="helpInlineP38Dia1"
                                                    binding="#{LogImpPerEec6.helpInlineP38Dia1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p38_dia.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP38Mes1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelP38Mes1}"
                                                    id="labelP38Mes1"
                                                    for="campoP38Mes1"
                                                    toolTip="BundleParametros.p38_mes.log_imp_per_eec"
                                                    text="p38 mes"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP38Mes2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP38Mes1"
                                                    binding="#{LogImpPerEec6.campoP38Mes1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p38_mes']}"
                                                    toolTip="BundleParametros.p38_mes.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorP38Mes1.validate}"/>
                                                <webuijsf:staticText id="campoP38Mes1Texto1"
                                                    binding="#{LogImpPerEec6.campoP38Mes1Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p38_mes']}"/>
                                                <webuijsf:message id="messageP38Mes1"
                                                    for="campoP38Mes1"/>
                                                <webuijsf:helpInline id="helpInlineP38Mes1"
                                                    binding="#{LogImpPerEec6.helpInlineP38Mes1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p38_mes.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP38Ano1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelP38Ano1}"
                                                    id="labelP38Ano1"
                                                    for="campoP38Ano1"
                                                    toolTip="BundleParametros.p38_ano.log_imp_per_eec"
                                                    text="p38 a&#241;o"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP38Ano2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP38Ano1"
                                                    binding="#{LogImpPerEec6.campoP38Ano1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p38_ano']}"
                                                    toolTip="BundleParametros.p38_ano.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorP38Ano1.validate}"/>
                                                <webuijsf:staticText id="campoP38Ano1Texto1"
                                                    binding="#{LogImpPerEec6.campoP38Ano1Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p38_ano']}"/>
                                                <webuijsf:message id="messageP38Ano1"
                                                    for="campoP38Ano1"/>
                                                <webuijsf:helpInline id="helpInlineP38Ano1"
                                                    binding="#{LogImpPerEec6.helpInlineP38Ano1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p38_ano.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP39pais1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelP39pais1}"
                                                    id="labelP39pais1"
                                                    for="campoP39pais1"
                                                    toolTip="BundleParametros.p39pais.log_imp_per_eec"
                                                    text="p39pais"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP39pais2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP39pais1"
                                                    binding="#{LogImpPerEec6.campoP39pais1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p39pais']}"
                                                    toolTip="BundleParametros.p39pais.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorP39pais1.validate}"/>
                                                <webuijsf:staticText id="campoP39pais1Texto1"
                                                    binding="#{LogImpPerEec6.campoP39pais1Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p39pais']}"/>
                                                <webuijsf:message id="messageP39pais1"
                                                    for="campoP39pais1"/>
                                                <webuijsf:helpInline id="helpInlineP39pais1"
                                                    binding="#{LogImpPerEec6.helpInlineP39pais1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p39pais.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP39dpto1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelP39dpto1}"
                                                    id="labelP39dpto1"
                                                    for="campoP39dpto1"
                                                    toolTip="BundleParametros.p39dpto.log_imp_per_eec"
                                                    text="p39dpto"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP39dpto2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP39dpto1"
                                                    binding="#{LogImpPerEec6.campoP39dpto1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p39dpto']}"
                                                    toolTip="BundleParametros.p39dpto.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorP39dpto1.validate}"/>
                                                <webuijsf:staticText id="campoP39dpto1Texto1"
                                                    binding="#{LogImpPerEec6.campoP39dpto1Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p39dpto']}"/>
                                                <webuijsf:message id="messageP39dpto1"
                                                    for="campoP39dpto1"/>
                                                <webuijsf:helpInline id="helpInlineP39dpto1"
                                                    binding="#{LogImpPerEec6.helpInlineP39dpto1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p39dpto.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP39dist1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelP39dist1}"
                                                    id="labelP39dist1"
                                                    for="campoP39dist1"
                                                    toolTip="BundleParametros.p39dist.log_imp_per_eec"
                                                    text="p39dist"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP39dist2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP39dist1"
                                                    binding="#{LogImpPerEec6.campoP39dist1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p39dist']}"
                                                    toolTip="BundleParametros.p39dist.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorP39dist1.validate}"/>
                                                <webuijsf:staticText id="campoP39dist1Texto1"
                                                    binding="#{LogImpPerEec6.campoP39dist1Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p39dist']}"/>
                                                <webuijsf:message id="messageP39dist1"
                                                    for="campoP39dist1"/>
                                                <webuijsf:helpInline id="helpInlineP39dist1"
                                                    binding="#{LogImpPerEec6.helpInlineP39dist1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p39dist.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP39area1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelP39area1}"
                                                    id="labelP39area1"
                                                    for="campoP39area1"
                                                    toolTip="BundleParametros.p39area.log_imp_per_eec"
                                                    text="p39area"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP39area2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP39area1"
                                                    binding="#{LogImpPerEec6.campoP39area1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p39area']}"
                                                    toolTip="BundleParametros.p39area.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorP39area1.validate}"/>
                                                <webuijsf:staticText id="campoP39area1Texto1"
                                                    binding="#{LogImpPerEec6.campoP39area1Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p39area']}"/>
                                                <webuijsf:message id="messageP39area1"
                                                    for="campoP39area1"/>
                                                <webuijsf:helpInline id="helpInlineP39area1"
                                                    binding="#{LogImpPerEec6.helpInlineP39area1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p39area.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP40Idioma1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelP40Idioma1}"
                                                    id="labelP40Idioma1"
                                                    for="campoP40Idioma1"
                                                    toolTip="BundleParametros.p40_idioma.log_imp_per_eec"
                                                    text="p40 idioma"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP40Idioma2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP40Idioma1"
                                                    binding="#{LogImpPerEec6.campoP40Idioma1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p40_idioma']}"
                                                    toolTip="BundleParametros.p40_idioma.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorP40Idioma1.validate}"/>
                                                <webuijsf:staticText id="campoP40Idioma1Texto1"
                                                    binding="#{LogImpPerEec6.campoP40Idioma1Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p40_idioma']}"/>
                                                <webuijsf:message id="messageP40Idioma1"
                                                    for="campoP40Idioma1"/>
                                                <webuijsf:helpInline id="helpInlineP40Idioma1"
                                                    binding="#{LogImpPerEec6.helpInlineP40Idioma1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p40_idioma.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP40otr1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelP40otr1}"
                                                    id="labelP40otr1"
                                                    for="campoP40otr1"
                                                    toolTip="BundleParametros.p40otr.log_imp_per_eec"
                                                    text="p40otr"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP40otr2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP40otr1"
                                                    binding="#{LogImpPerEec6.campoP40otr1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p40otr']}"
                                                    toolTip="BundleParametros.p40otr.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorP40otr1.validate}"/>
                                                <webuijsf:staticText id="campoP40otr1Texto1"
                                                    binding="#{LogImpPerEec6.campoP40otr1Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p40otr']}"/>
                                                <webuijsf:message id="messageP40otr1"
                                                    for="campoP40otr1"/>
                                                <webuijsf:helpInline id="helpInlineP40otr1"
                                                    binding="#{LogImpPerEec6.helpInlineP40otr1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p40otr.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP411"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelP411}"
                                                    id="labelP411"
                                                    for="campoP411"
                                                    toolTip="BundleParametros.p41.log_imp_per_eec"
                                                    text="p41"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP412"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP411"
                                                    binding="#{LogImpPerEec6.campoP411}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p41']}"
                                                    toolTip="BundleParametros.p41.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorP411.validate}"/>
                                                <webuijsf:staticText id="campoP411Texto1"
                                                    binding="#{LogImpPerEec6.campoP411Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p41']}"/>
                                                <webuijsf:message id="messageP411"
                                                    for="campoP411"/>
                                                <webuijsf:helpInline id="helpInlineP411"
                                                    binding="#{LogImpPerEec6.helpInlineP411}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p41.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP421"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelP421}"
                                                    id="labelP421"
                                                    for="campoP421"
                                                    toolTip="BundleParametros.p42.log_imp_per_eec"
                                                    text="p42"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP422"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP421"
                                                    binding="#{LogImpPerEec6.campoP421}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p42']}"
                                                    toolTip="BundleParametros.p42.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorP421.validate}"/>
                                                <webuijsf:staticText id="campoP421Texto1"
                                                    binding="#{LogImpPerEec6.campoP421Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p42']}"/>
                                                <webuijsf:message id="messageP421"
                                                    for="campoP421"/>
                                                <webuijsf:helpInline id="helpInlineP421"
                                                    binding="#{LogImpPerEec6.helpInlineP421}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p42.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP431"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelP431}"
                                                    id="labelP431"
                                                    for="campoP431"
                                                    toolTip="BundleParametros.p43.log_imp_per_eec"
                                                    text="p43"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP432"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP431"
                                                    binding="#{LogImpPerEec6.campoP431}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p43']}"
                                                    toolTip="BundleParametros.p43.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorP431.validate}"/>
                                                <webuijsf:staticText id="campoP431Texto1"
                                                    binding="#{LogImpPerEec6.campoP431Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p43']}"/>
                                                <webuijsf:message id="messageP431"
                                                    for="campoP431"/>
                                                <webuijsf:helpInline id="helpInlineP431"
                                                    binding="#{LogImpPerEec6.helpInlineP431}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p43.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP4445t1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelP4445t1}"
                                                    id="labelP4445t1"
                                                    for="campoP4445t1"
                                                    toolTip="BundleParametros.p44_45t.log_imp_per_eec"
                                                    text="p44 45t"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP4445t2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP4445t1"
                                                    binding="#{LogImpPerEec6.campoP4445t1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p44_45t']}"
                                                    toolTip="BundleParametros.p44_45t.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorP4445t1.validate}"/>
                                                <webuijsf:staticText id="campoP4445t1Texto1"
                                                    binding="#{LogImpPerEec6.campoP4445t1Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p44_45t']}"/>
                                                <webuijsf:message id="messageP4445t1"
                                                    for="campoP4445t1"/>
                                                <webuijsf:helpInline id="helpInlineP4445t1"
                                                    binding="#{LogImpPerEec6.helpInlineP4445t1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p44_45t.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP441"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelP441}"
                                                    id="labelP441"
                                                    for="campoP441"
                                                    toolTip="BundleParametros.p44.log_imp_per_eec"
                                                    text="p44"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP442"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP441"
                                                    binding="#{LogImpPerEec6.campoP441}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p44']}"
                                                    toolTip="BundleParametros.p44.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorP441.validate}"/>
                                                <webuijsf:staticText id="campoP441Texto1"
                                                    binding="#{LogImpPerEec6.campoP441Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p44']}"/>
                                                <webuijsf:message id="messageP441"
                                                    for="campoP441"/>
                                                <webuijsf:helpInline id="helpInlineP441"
                                                    binding="#{LogImpPerEec6.helpInlineP441}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p44.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP451"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelP451}"
                                                    id="labelP451"
                                                    for="campoP451"
                                                    toolTip="BundleParametros.p45.log_imp_per_eec"
                                                    text="p45"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP452"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP451"
                                                    binding="#{LogImpPerEec6.campoP451}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p45']}"
                                                    toolTip="BundleParametros.p45.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorP451.validate}"/>
                                                <webuijsf:staticText id="campoP451Texto1"
                                                    binding="#{LogImpPerEec6.campoP451Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p45']}"/>
                                                <webuijsf:message id="messageP451"
                                                    for="campoP451"/>
                                                <webuijsf:helpInline id="helpInlineP451"
                                                    binding="#{LogImpPerEec6.helpInlineP451}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p45.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP461"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelP461}"
                                                    id="labelP461"
                                                    for="campoP461"
                                                    toolTip="BundleParametros.p46.log_imp_per_eec"
                                                    text="p46"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP462"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP461"
                                                    binding="#{LogImpPerEec6.campoP461}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p46']}"
                                                    toolTip="BundleParametros.p46.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorP461.validate}"/>
                                                <webuijsf:staticText id="campoP461Texto1"
                                                    binding="#{LogImpPerEec6.campoP461Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p46']}"/>
                                                <webuijsf:message id="messageP461"
                                                    for="campoP461"/>
                                                <webuijsf:helpInline id="helpInlineP461"
                                                    binding="#{LogImpPerEec6.helpInlineP461}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p46.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP471"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelP471}"
                                                    id="labelP471"
                                                    for="campoP471"
                                                    toolTip="BundleParametros.p47.log_imp_per_eec"
                                                    text="p47"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP472"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP471"
                                                    binding="#{LogImpPerEec6.campoP471}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p47']}"
                                                    toolTip="BundleParametros.p47.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorP471.validate}"/>
                                                <webuijsf:staticText id="campoP471Texto1"
                                                    binding="#{LogImpPerEec6.campoP471Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p47']}"/>
                                                <webuijsf:message id="messageP471"
                                                    for="campoP471"/>
                                                <webuijsf:helpInline id="helpInlineP471"
                                                    binding="#{LogImpPerEec6.helpInlineP471}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p47.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP481"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelP481}"
                                                    id="labelP481"
                                                    for="campoP481"
                                                    toolTip="BundleParametros.p48.log_imp_per_eec"
                                                    text="p48"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP482"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP481"
                                                    binding="#{LogImpPerEec6.campoP481}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p48']}"
                                                    toolTip="BundleParametros.p48.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorP481.validate}"/>
                                                <webuijsf:staticText id="campoP481Texto1"
                                                    binding="#{LogImpPerEec6.campoP481Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p48']}"/>
                                                <webuijsf:message id="messageP481"
                                                    for="campoP481"/>
                                                <webuijsf:helpInline id="helpInlineP481"
                                                    binding="#{LogImpPerEec6.helpInlineP481}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p48.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP491"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelP491}"
                                                    id="labelP491"
                                                    for="campoP491"
                                                    toolTip="BundleParametros.p49.log_imp_per_eec"
                                                    text="p49"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP492"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP491"
                                                    binding="#{LogImpPerEec6.campoP491}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p49']}"
                                                    toolTip="BundleParametros.p49.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorP491.validate}"/>
                                                <webuijsf:staticText id="campoP491Texto1"
                                                    binding="#{LogImpPerEec6.campoP491Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p49']}"/>
                                                <webuijsf:message id="messageP491"
                                                    for="campoP491"/>
                                                <webuijsf:helpInline id="helpInlineP491"
                                                    binding="#{LogImpPerEec6.helpInlineP491}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p49.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP49Otr1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelP49Otr1}"
                                                    id="labelP49Otr1"
                                                    for="campoP49Otr1"
                                                    toolTip="BundleParametros.p49_otr.log_imp_per_eec"
                                                    text="p49 otr"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP49Otr2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP49Otr1"
                                                    binding="#{LogImpPerEec6.campoP49Otr1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p49_otr']}"
                                                    toolTip="BundleParametros.p49_otr.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorP49Otr1.validate}"/>
                                                <webuijsf:staticText id="campoP49Otr1Texto1"
                                                    binding="#{LogImpPerEec6.campoP49Otr1Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p49_otr']}"/>
                                                <webuijsf:message id="messageP49Otr1"
                                                    for="campoP49Otr1"/>
                                                <webuijsf:helpInline id="helpInlineP49Otr1"
                                                    binding="#{LogImpPerEec6.helpInlineP49Otr1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p49_otr.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP501"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelP501}"
                                                    id="labelP501"
                                                    for="campoP501"
                                                    toolTip="BundleParametros.p50.log_imp_per_eec"
                                                    text="p50"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP502"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP501"
                                                    binding="#{LogImpPerEec6.campoP501}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p50']}"
                                                    toolTip="BundleParametros.p50.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorP501.validate}"/>
                                                <webuijsf:staticText id="campoP501Texto1"
                                                    binding="#{LogImpPerEec6.campoP501Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p50']}"/>
                                                <webuijsf:message id="messageP501"
                                                    for="campoP501"/>
                                                <webuijsf:helpInline id="helpInlineP501"
                                                    binding="#{LogImpPerEec6.helpInlineP501}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p50.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP50Otr1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelP50Otr1}"
                                                    id="labelP50Otr1"
                                                    for="campoP50Otr1"
                                                    toolTip="BundleParametros.p50_otr.log_imp_per_eec"
                                                    text="p50 otr"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP50Otr2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP50Otr1"
                                                    binding="#{LogImpPerEec6.campoP50Otr1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p50_otr']}"
                                                    toolTip="BundleParametros.p50_otr.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorP50Otr1.validate}"/>
                                                <webuijsf:staticText id="campoP50Otr1Texto1"
                                                    binding="#{LogImpPerEec6.campoP50Otr1Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p50_otr']}"/>
                                                <webuijsf:message id="messageP50Otr1"
                                                    for="campoP50Otr1"/>
                                                <webuijsf:helpInline id="helpInlineP50Otr1"
                                                    binding="#{LogImpPerEec6.helpInlineP50Otr1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p50_otr.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP511"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelP511}"
                                                    id="labelP511"
                                                    for="campoP511"
                                                    toolTip="BundleParametros.p51.log_imp_per_eec"
                                                    text="p51"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP512"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP511"
                                                    binding="#{LogImpPerEec6.campoP511}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p51']}"
                                                    toolTip="BundleParametros.p51.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorP511.validate}"/>
                                                <webuijsf:staticText id="campoP511Texto1"
                                                    binding="#{LogImpPerEec6.campoP511Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p51']}"/>
                                                <webuijsf:message id="messageP511"
                                                    for="campoP511"/>
                                                <webuijsf:helpInline id="helpInlineP511"
                                                    binding="#{LogImpPerEec6.helpInlineP511}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p51.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP521"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelP521}"
                                                    id="labelP521"
                                                    for="campoP521"
                                                    toolTip="BundleParametros.p52.log_imp_per_eec"
                                                    text="p52"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP522"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP521"
                                                    binding="#{LogImpPerEec6.campoP521}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p52']}"
                                                    toolTip="BundleParametros.p52.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorP521.validate}"/>
                                                <webuijsf:staticText id="campoP521Texto1"
                                                    binding="#{LogImpPerEec6.campoP521Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p52']}"/>
                                                <webuijsf:message id="messageP521"
                                                    for="campoP521"/>
                                                <webuijsf:helpInline id="helpInlineP521"
                                                    binding="#{LogImpPerEec6.helpInlineP521}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p52.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP52Otr1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelP52Otr1}"
                                                    id="labelP52Otr1"
                                                    for="campoP52Otr1"
                                                    toolTip="BundleParametros.p52_otr.log_imp_per_eec"
                                                    text="p52 otr"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP52Otr2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP52Otr1"
                                                    binding="#{LogImpPerEec6.campoP52Otr1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p52_otr']}"
                                                    toolTip="BundleParametros.p52_otr.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorP52Otr1.validate}"/>
                                                <webuijsf:staticText id="campoP52Otr1Texto1"
                                                    binding="#{LogImpPerEec6.campoP52Otr1Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p52_otr']}"/>
                                                <webuijsf:message id="messageP52Otr1"
                                                    for="campoP52Otr1"/>
                                                <webuijsf:helpInline id="helpInlineP52Otr1"
                                                    binding="#{LogImpPerEec6.helpInlineP52Otr1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p52_otr.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP531"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelP531}"
                                                    id="labelP531"
                                                    for="campoP531"
                                                    toolTip="BundleParametros.p53.log_imp_per_eec"
                                                    text="p53"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP532"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP531"
                                                    binding="#{LogImpPerEec6.campoP531}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p53']}"
                                                    toolTip="BundleParametros.p53.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorP531.validate}"/>
                                                <webuijsf:staticText id="campoP531Texto1"
                                                    binding="#{LogImpPerEec6.campoP531Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p53']}"/>
                                                <webuijsf:message id="messageP531"
                                                    for="campoP531"/>
                                                <webuijsf:helpInline id="helpInlineP531"
                                                    binding="#{LogImpPerEec6.helpInlineP531}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p53.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP541"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelP541}"
                                                    id="labelP541"
                                                    for="campoP541"
                                                    toolTip="BundleParametros.p54.log_imp_per_eec"
                                                    text="p54"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP542"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP541"
                                                    binding="#{LogImpPerEec6.campoP541}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p54']}"
                                                    toolTip="BundleParametros.p54.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorP541.validate}"/>
                                                <webuijsf:staticText id="campoP541Texto1"
                                                    binding="#{LogImpPerEec6.campoP541Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p54']}"/>
                                                <webuijsf:message id="messageP541"
                                                    for="campoP541"/>
                                                <webuijsf:helpInline id="helpInlineP541"
                                                    binding="#{LogImpPerEec6.helpInlineP541}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p54.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP54a1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelP54a1}"
                                                    id="labelP54a1"
                                                    for="campoP54a1"
                                                    toolTip="BundleParametros.p54a.log_imp_per_eec"
                                                    text="p54a"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP54a2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP54a1"
                                                    binding="#{LogImpPerEec6.campoP54a1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p54a']}"
                                                    toolTip="BundleParametros.p54a.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorP54a1.validate}"/>
                                                <webuijsf:staticText id="campoP54a1Texto1"
                                                    binding="#{LogImpPerEec6.campoP54a1Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p54a']}"/>
                                                <webuijsf:message id="messageP54a1"
                                                    for="campoP54a1"/>
                                                <webuijsf:helpInline id="helpInlineP54a1"
                                                    binding="#{LogImpPerEec6.helpInlineP54a1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p54a.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP54Otr1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelP54Otr1}"
                                                    id="labelP54Otr1"
                                                    for="campoP54Otr1"
                                                    toolTip="BundleParametros.p54_otr.log_imp_per_eec"
                                                    text="p54 otr"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP54Otr2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP54Otr1"
                                                    binding="#{LogImpPerEec6.campoP54Otr1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p54_otr']}"
                                                    toolTip="BundleParametros.p54_otr.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorP54Otr1.validate}"/>
                                                <webuijsf:staticText id="campoP54Otr1Texto1"
                                                    binding="#{LogImpPerEec6.campoP54Otr1Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p54_otr']}"/>
                                                <webuijsf:message id="messageP54Otr1"
                                                    for="campoP54Otr1"/>
                                                <webuijsf:helpInline id="helpInlineP54Otr1"
                                                    binding="#{LogImpPerEec6.helpInlineP54Otr1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p54_otr.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP551"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelP551}"
                                                    id="labelP551"
                                                    for="campoP551"
                                                    toolTip="BundleParametros.p55.log_imp_per_eec"
                                                    text="p55"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP552"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP551"
                                                    binding="#{LogImpPerEec6.campoP551}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p55']}"
                                                    toolTip="BundleParametros.p55.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorP551.validate}"/>
                                                <webuijsf:staticText id="campoP551Texto1"
                                                    binding="#{LogImpPerEec6.campoP551Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p55']}"/>
                                                <webuijsf:message id="messageP551"
                                                    for="campoP551"/>
                                                <webuijsf:helpInline id="helpInlineP551"
                                                    binding="#{LogImpPerEec6.helpInlineP551}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p55.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP55Otr1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelP55Otr1}"
                                                    id="labelP55Otr1"
                                                    for="campoP55Otr1"
                                                    toolTip="BundleParametros.p55_otr.log_imp_per_eec"
                                                    text="p55 otr"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP55Otr2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP55Otr1"
                                                    binding="#{LogImpPerEec6.campoP55Otr1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p55_otr']}"
                                                    toolTip="BundleParametros.p55_otr.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorP55Otr1.validate}"/>
                                                <webuijsf:staticText id="campoP55Otr1Texto1"
                                                    binding="#{LogImpPerEec6.campoP55Otr1Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p55_otr']}"/>
                                                <webuijsf:message id="messageP55Otr1"
                                                    for="campoP55Otr1"/>
                                                <webuijsf:helpInline id="helpInlineP55Otr1"
                                                    binding="#{LogImpPerEec6.helpInlineP55Otr1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p55_otr.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP561"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelP561}"
                                                    id="labelP561"
                                                    for="campoP561"
                                                    toolTip="BundleParametros.p56.log_imp_per_eec"
                                                    text="p56"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP562"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP561"
                                                    binding="#{LogImpPerEec6.campoP561}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p56']}"
                                                    toolTip="BundleParametros.p56.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorP561.validate}"/>
                                                <webuijsf:staticText id="campoP561Texto1"
                                                    binding="#{LogImpPerEec6.campoP561Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p56']}"/>
                                                <webuijsf:message id="messageP561"
                                                    for="campoP561"/>
                                                <webuijsf:helpInline id="helpInlineP561"
                                                    binding="#{LogImpPerEec6.helpInlineP561}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p56.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP571"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelP571}"
                                                    id="labelP571"
                                                    for="campoP571"
                                                    toolTip="BundleParametros.p57.log_imp_per_eec"
                                                    text="p57"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP572"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP571"
                                                    binding="#{LogImpPerEec6.campoP571}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p57']}"
                                                    toolTip="BundleParametros.p57.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorP571.validate}"/>
                                                <webuijsf:staticText id="campoP571Texto1"
                                                    binding="#{LogImpPerEec6.campoP571Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p57']}"/>
                                                <webuijsf:message id="messageP571"
                                                    for="campoP571"/>
                                                <webuijsf:helpInline id="helpInlineP571"
                                                    binding="#{LogImpPerEec6.helpInlineP571}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p57.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP581"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelP581}"
                                                    id="labelP581"
                                                    for="campoP581"
                                                    toolTip="BundleParametros.p58.log_imp_per_eec"
                                                    text="p58"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP582"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP581"
                                                    binding="#{LogImpPerEec6.campoP581}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p58']}"
                                                    toolTip="BundleParametros.p58.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorP581.validate}"/>
                                                <webuijsf:staticText id="campoP581Texto1"
                                                    binding="#{LogImpPerEec6.campoP581Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p58']}"/>
                                                <webuijsf:message id="messageP581"
                                                    for="campoP581"/>
                                                <webuijsf:helpInline id="helpInlineP581"
                                                    binding="#{LogImpPerEec6.helpInlineP581}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p58.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP591"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelP591}"
                                                    id="labelP591"
                                                    for="campoP591"
                                                    toolTip="BundleParametros.p59.log_imp_per_eec"
                                                    text="p59"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP592"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP591"
                                                    binding="#{LogImpPerEec6.campoP591}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p59']}"
                                                    toolTip="BundleParametros.p59.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorP591.validate}"/>
                                                <webuijsf:staticText id="campoP591Texto1"
                                                    binding="#{LogImpPerEec6.campoP591Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p59']}"/>
                                                <webuijsf:message id="messageP591"
                                                    for="campoP591"/>
                                                <webuijsf:helpInline id="helpInlineP591"
                                                    binding="#{LogImpPerEec6.helpInlineP591}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p59.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP601"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelP601}"
                                                    id="labelP601"
                                                    for="campoP601"
                                                    toolTip="BundleParametros.p60.log_imp_per_eec"
                                                    text="p60"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP602"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP601"
                                                    binding="#{LogImpPerEec6.campoP601}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p60']}"
                                                    toolTip="BundleParametros.p60.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorP601.validate}"/>
                                                <webuijsf:staticText id="campoP601Texto1"
                                                    binding="#{LogImpPerEec6.campoP601Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p60']}"/>
                                                <webuijsf:message id="messageP601"
                                                    for="campoP601"/>
                                                <webuijsf:helpInline id="helpInlineP601"
                                                    binding="#{LogImpPerEec6.helpInlineP601}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p60.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP611"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelP611}"
                                                    id="labelP611"
                                                    for="campoP611"
                                                    toolTip="BundleParametros.p61.log_imp_per_eec"
                                                    text="p61"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP612"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP611"
                                                    binding="#{LogImpPerEec6.campoP611}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p61']}"
                                                    toolTip="BundleParametros.p61.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorP611.validate}"/>
                                                <webuijsf:staticText id="campoP611Texto1"
                                                    binding="#{LogImpPerEec6.campoP611Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p61']}"/>
                                                <webuijsf:message id="messageP611"
                                                    for="campoP611"/>
                                                <webuijsf:helpInline id="helpInlineP611"
                                                    binding="#{LogImpPerEec6.helpInlineP611}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p61.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP621"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelP621}"
                                                    id="labelP621"
                                                    for="campoP621"
                                                    toolTip="BundleParametros.p62.log_imp_per_eec"
                                                    text="p62"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP622"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP621"
                                                    binding="#{LogImpPerEec6.campoP621}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p62']}"
                                                    toolTip="BundleParametros.p62.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorP621.validate}"/>
                                                <webuijsf:staticText id="campoP621Texto1"
                                                    binding="#{LogImpPerEec6.campoP621Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p62']}"/>
                                                <webuijsf:message id="messageP621"
                                                    for="campoP621"/>
                                                <webuijsf:helpInline id="helpInlineP621"
                                                    binding="#{LogImpPerEec6.helpInlineP621}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p62.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP631"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelP631}"
                                                    id="labelP631"
                                                    for="campoP631"
                                                    toolTip="BundleParametros.p63.log_imp_per_eec"
                                                    text="p63"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP632"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP631"
                                                    binding="#{LogImpPerEec6.campoP631}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p63']}"
                                                    toolTip="BundleParametros.p63.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorP631.validate}"/>
                                                <webuijsf:staticText id="campoP631Texto1"
                                                    binding="#{LogImpPerEec6.campoP631Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p63']}"/>
                                                <webuijsf:message id="messageP631"
                                                    for="campoP631"/>
                                                <webuijsf:helpInline id="helpInlineP631"
                                                    binding="#{LogImpPerEec6.helpInlineP631}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p63.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP63Especificar1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelP63Especificar1}"
                                                    id="labelP63Especificar1"
                                                    for="campoP63Especificar1"
                                                    toolTip="BundleParametros.p63_especificar.log_imp_per_eec"
                                                    text="p63 especificar"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP63Especificar2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP63Especificar1"
                                                    binding="#{LogImpPerEec6.campoP63Especificar1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p63_especificar']}"
                                                    toolTip="BundleParametros.p63_especificar.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorP63Especificar1.validate}"/>
                                                <webuijsf:staticText id="campoP63Especificar1Texto1"
                                                    binding="#{LogImpPerEec6.campoP63Especificar1Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p63_especificar']}"/>
                                                <webuijsf:message id="messageP63Especificar1"
                                                    for="campoP63Especificar1"/>
                                                <webuijsf:helpInline id="helpInlineP63Especificar1"
                                                    binding="#{LogImpPerEec6.helpInlineP63Especificar1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p63_especificar.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP64des1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelP64des1}"
                                                    id="labelP64des1"
                                                    for="campoP64des1"
                                                    toolTip="BundleParametros.p64des.log_imp_per_eec"
                                                    text="p64des"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP64des2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP64des1"
                                                    binding="#{LogImpPerEec6.campoP64des1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p64des']}"
                                                    toolTip="BundleParametros.p64des.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorP64des1.validate}"/>
                                                <webuijsf:staticText id="campoP64des1Texto1"
                                                    binding="#{LogImpPerEec6.campoP64des1Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p64des']}"/>
                                                <webuijsf:message id="messageP64des1"
                                                    for="campoP64des1"/>
                                                <webuijsf:helpInline id="helpInlineP64des1"
                                                    binding="#{LogImpPerEec6.helpInlineP64des1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p64des.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP64c1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelP64c1}"
                                                    id="labelP64c1"
                                                    for="campoP64c1"
                                                    toolTip="BundleParametros.p64c.log_imp_per_eec"
                                                    text="p64c"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP64c2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP64c1"
                                                    binding="#{LogImpPerEec6.campoP64c1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p64c']}"
                                                    toolTip="BundleParametros.p64c.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorP64c1.validate}"/>
                                                <webuijsf:staticText id="campoP64c1Texto1"
                                                    binding="#{LogImpPerEec6.campoP64c1Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p64c']}"/>
                                                <webuijsf:message id="messageP64c1"
                                                    for="campoP64c1"/>
                                                <webuijsf:helpInline id="helpInlineP64c1"
                                                    binding="#{LogImpPerEec6.helpInlineP64c1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p64c.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP65des1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelP65des1}"
                                                    id="labelP65des1"
                                                    for="campoP65des1"
                                                    toolTip="BundleParametros.p65des.log_imp_per_eec"
                                                    text="p65des"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP65des2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP65des1"
                                                    binding="#{LogImpPerEec6.campoP65des1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p65des']}"
                                                    toolTip="BundleParametros.p65des.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorP65des1.validate}"/>
                                                <webuijsf:staticText id="campoP65des1Texto1"
                                                    binding="#{LogImpPerEec6.campoP65des1Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p65des']}"/>
                                                <webuijsf:message id="messageP65des1"
                                                    for="campoP65des1"/>
                                                <webuijsf:helpInline id="helpInlineP65des1"
                                                    binding="#{LogImpPerEec6.helpInlineP65des1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p65des.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP65c1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelP65c1}"
                                                    id="labelP65c1"
                                                    for="campoP65c1"
                                                    toolTip="BundleParametros.p65c.log_imp_per_eec"
                                                    text="p65c"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP65c2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP65c1"
                                                    binding="#{LogImpPerEec6.campoP65c1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p65c']}"
                                                    toolTip="BundleParametros.p65c.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorP65c1.validate}"/>
                                                <webuijsf:staticText id="campoP65c1Texto1"
                                                    binding="#{LogImpPerEec6.campoP65c1Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p65c']}"/>
                                                <webuijsf:message id="messageP65c1"
                                                    for="campoP65c1"/>
                                                <webuijsf:helpInline id="helpInlineP65c1"
                                                    binding="#{LogImpPerEec6.helpInlineP65c1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p65c.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP661"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelP661}"
                                                    id="labelP661"
                                                    for="campoP661"
                                                    toolTip="BundleParametros.p66.log_imp_per_eec"
                                                    text="p66"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP662"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP661"
                                                    binding="#{LogImpPerEec6.campoP661}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p66']}"
                                                    toolTip="BundleParametros.p66.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorP661.validate}"/>
                                                <webuijsf:staticText id="campoP661Texto1"
                                                    binding="#{LogImpPerEec6.campoP661Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p66']}"/>
                                                <webuijsf:message id="messageP661"
                                                    for="campoP661"/>
                                                <webuijsf:helpInline id="helpInlineP661"
                                                    binding="#{LogImpPerEec6.helpInlineP661}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p66.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP67a1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelP67a1}"
                                                    id="labelP67a1"
                                                    for="campoP67a1"
                                                    toolTip="BundleParametros.p67a.log_imp_per_eec"
                                                    text="p67a"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP67a2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP67a1"
                                                    binding="#{LogImpPerEec6.campoP67a1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p67a']}"
                                                    toolTip="BundleParametros.p67a.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorP67a1.validate}"/>
                                                <webuijsf:staticText id="campoP67a1Texto1"
                                                    binding="#{LogImpPerEec6.campoP67a1Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p67a']}"/>
                                                <webuijsf:message id="messageP67a1"
                                                    for="campoP67a1"/>
                                                <webuijsf:helpInline id="helpInlineP67a1"
                                                    binding="#{LogImpPerEec6.helpInlineP67a1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p67a.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP67b1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelP67b1}"
                                                    id="labelP67b1"
                                                    for="campoP67b1"
                                                    toolTip="BundleParametros.p67b.log_imp_per_eec"
                                                    text="p67b"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP67b2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP67b1"
                                                    binding="#{LogImpPerEec6.campoP67b1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p67b']}"
                                                    toolTip="BundleParametros.p67b.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorP67b1.validate}"/>
                                                <webuijsf:staticText id="campoP67b1Texto1"
                                                    binding="#{LogImpPerEec6.campoP67b1Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p67b']}"/>
                                                <webuijsf:message id="messageP67b1"
                                                    for="campoP67b1"/>
                                                <webuijsf:helpInline id="helpInlineP67b1"
                                                    binding="#{LogImpPerEec6.helpInlineP67b1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p67b.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP67c1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelP67c1}"
                                                    id="labelP67c1"
                                                    for="campoP67c1"
                                                    toolTip="BundleParametros.p67c.log_imp_per_eec"
                                                    text="p67c"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP67c2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP67c1"
                                                    binding="#{LogImpPerEec6.campoP67c1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p67c']}"
                                                    toolTip="BundleParametros.p67c.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorP67c1.validate}"/>
                                                <webuijsf:staticText id="campoP67c1Texto1"
                                                    binding="#{LogImpPerEec6.campoP67c1Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p67c']}"/>
                                                <webuijsf:message id="messageP67c1"
                                                    for="campoP67c1"/>
                                                <webuijsf:helpInline id="helpInlineP67c1"
                                                    binding="#{LogImpPerEec6.helpInlineP67c1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p67c.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP67d1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelP67d1}"
                                                    id="labelP67d1"
                                                    for="campoP67d1"
                                                    toolTip="BundleParametros.p67d.log_imp_per_eec"
                                                    text="p67d"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP67d2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP67d1"
                                                    binding="#{LogImpPerEec6.campoP67d1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p67d']}"
                                                    toolTip="BundleParametros.p67d.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorP67d1.validate}"/>
                                                <webuijsf:staticText id="campoP67d1Texto1"
                                                    binding="#{LogImpPerEec6.campoP67d1Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p67d']}"/>
                                                <webuijsf:message id="messageP67d1"
                                                    for="campoP67d1"/>
                                                <webuijsf:helpInline id="helpInlineP67d1"
                                                    binding="#{LogImpPerEec6.helpInlineP67d1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p67d.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP67e1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelP67e1}"
                                                    id="labelP67e1"
                                                    for="campoP67e1"
                                                    toolTip="BundleParametros.p67e.log_imp_per_eec"
                                                    text="p67e"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP67e2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP67e1"
                                                    binding="#{LogImpPerEec6.campoP67e1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p67e']}"
                                                    toolTip="BundleParametros.p67e.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorP67e1.validate}"/>
                                                <webuijsf:staticText id="campoP67e1Texto1"
                                                    binding="#{LogImpPerEec6.campoP67e1Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p67e']}"/>
                                                <webuijsf:message id="messageP67e1"
                                                    for="campoP67e1"/>
                                                <webuijsf:helpInline id="helpInlineP67e1"
                                                    binding="#{LogImpPerEec6.helpInlineP67e1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p67e.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP67f1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelP67f1}"
                                                    id="labelP67f1"
                                                    for="campoP67f1"
                                                    toolTip="BundleParametros.p67f.log_imp_per_eec"
                                                    text="p67f"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP67f2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP67f1"
                                                    binding="#{LogImpPerEec6.campoP67f1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p67f']}"
                                                    toolTip="BundleParametros.p67f.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorP67f1.validate}"/>
                                                <webuijsf:staticText id="campoP67f1Texto1"
                                                    binding="#{LogImpPerEec6.campoP67f1Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p67f']}"/>
                                                <webuijsf:message id="messageP67f1"
                                                    for="campoP67f1"/>
                                                <webuijsf:helpInline id="helpInlineP67f1"
                                                    binding="#{LogImpPerEec6.helpInlineP67f1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p67f.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP67g1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelP67g1}"
                                                    id="labelP67g1"
                                                    for="campoP67g1"
                                                    toolTip="BundleParametros.p67g.log_imp_per_eec"
                                                    text="p67g"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP67g2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP67g1"
                                                    binding="#{LogImpPerEec6.campoP67g1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p67g']}"
                                                    toolTip="BundleParametros.p67g.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorP67g1.validate}"/>
                                                <webuijsf:staticText id="campoP67g1Texto1"
                                                    binding="#{LogImpPerEec6.campoP67g1Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p67g']}"/>
                                                <webuijsf:message id="messageP67g1"
                                                    for="campoP67g1"/>
                                                <webuijsf:helpInline id="helpInlineP67g1"
                                                    binding="#{LogImpPerEec6.helpInlineP67g1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p67g.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP67h1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelP67h1}"
                                                    id="labelP67h1"
                                                    for="campoP67h1"
                                                    toolTip="BundleParametros.p67h.log_imp_per_eec"
                                                    text="p67h"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP67h2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP67h1"
                                                    binding="#{LogImpPerEec6.campoP67h1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p67h']}"
                                                    toolTip="BundleParametros.p67h.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorP67h1.validate}"/>
                                                <webuijsf:staticText id="campoP67h1Texto1"
                                                    binding="#{LogImpPerEec6.campoP67h1Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p67h']}"/>
                                                <webuijsf:message id="messageP67h1"
                                                    for="campoP67h1"/>
                                                <webuijsf:helpInline id="helpInlineP67h1"
                                                    binding="#{LogImpPerEec6.helpInlineP67h1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p67h.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP67i1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelP67i1}"
                                                    id="labelP67i1"
                                                    for="campoP67i1"
                                                    toolTip="BundleParametros.p67i.log_imp_per_eec"
                                                    text="p67i"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP67i2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP67i1"
                                                    binding="#{LogImpPerEec6.campoP67i1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p67i']}"
                                                    toolTip="BundleParametros.p67i.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorP67i1.validate}"/>
                                                <webuijsf:staticText id="campoP67i1Texto1"
                                                    binding="#{LogImpPerEec6.campoP67i1Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p67i']}"/>
                                                <webuijsf:message id="messageP67i1"
                                                    for="campoP67i1"/>
                                                <webuijsf:helpInline id="helpInlineP67i1"
                                                    binding="#{LogImpPerEec6.helpInlineP67i1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p67i.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP67j1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelP67j1}"
                                                    id="labelP67j1"
                                                    for="campoP67j1"
                                                    toolTip="BundleParametros.p67j.log_imp_per_eec"
                                                    text="p67j"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP67j2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP67j1"
                                                    binding="#{LogImpPerEec6.campoP67j1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p67j']}"
                                                    toolTip="BundleParametros.p67j.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorP67j1.validate}"/>
                                                <webuijsf:staticText id="campoP67j1Texto1"
                                                    binding="#{LogImpPerEec6.campoP67j1Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p67j']}"/>
                                                <webuijsf:message id="messageP67j1"
                                                    for="campoP67j1"/>
                                                <webuijsf:helpInline id="helpInlineP67j1"
                                                    binding="#{LogImpPerEec6.helpInlineP67j1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p67j.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP67k1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelP67k1}"
                                                    id="labelP67k1"
                                                    for="campoP67k1"
                                                    toolTip="BundleParametros.p67k.log_imp_per_eec"
                                                    text="p67k"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP67k2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP67k1"
                                                    binding="#{LogImpPerEec6.campoP67k1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p67k']}"
                                                    toolTip="BundleParametros.p67k.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorP67k1.validate}"/>
                                                <webuijsf:staticText id="campoP67k1Texto1"
                                                    binding="#{LogImpPerEec6.campoP67k1Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p67k']}"/>
                                                <webuijsf:message id="messageP67k1"
                                                    for="campoP67k1"/>
                                                <webuijsf:helpInline id="helpInlineP67k1"
                                                    binding="#{LogImpPerEec6.helpInlineP67k1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p67k.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP67l1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelP67l1}"
                                                    id="labelP67l1"
                                                    for="campoP67l1"
                                                    toolTip="BundleParametros.p67l.log_imp_per_eec"
                                                    text="p67l"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP67l2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP67l1"
                                                    binding="#{LogImpPerEec6.campoP67l1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p67l']}"
                                                    toolTip="BundleParametros.p67l.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorP67l1.validate}"/>
                                                <webuijsf:staticText id="campoP67l1Texto1"
                                                    binding="#{LogImpPerEec6.campoP67l1Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p67l']}"/>
                                                <webuijsf:message id="messageP67l1"
                                                    for="campoP67l1"/>
                                                <webuijsf:helpInline id="helpInlineP67l1"
                                                    binding="#{LogImpPerEec6.helpInlineP67l1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p67l.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP67tot1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelP67tot1}"
                                                    id="labelP67tot1"
                                                    for="campoP67tot1"
                                                    toolTip="BundleParametros.p67tot.log_imp_per_eec"
                                                    text="p67tot"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP67tot2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP67tot1"
                                                    binding="#{LogImpPerEec6.campoP67tot1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p67tot']}"
                                                    toolTip="BundleParametros.p67tot.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorP67tot1.validate}"/>
                                                <webuijsf:staticText id="campoP67tot1Texto1"
                                                    binding="#{LogImpPerEec6.campoP67tot1Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['p67tot']}"/>
                                                <webuijsf:message id="messageP67tot1"
                                                    for="campoP67tot1"/>
                                                <webuijsf:helpInline id="helpInlineP67tot1"
                                                    binding="#{LogImpPerEec6.helpInlineP67tot1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p67tot.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsImportado1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelEsImportado1}"
                                                    id="labelEsImportado1"
                                                    for="listaEsImportado1"
                                                    toolTip="BundleParametros.es_importado.log_imp_per_eec"
                                                    text="importado"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsImportado2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsImportado1"
                                                    binding="#{LogImpPerEec6.listaEsImportado1}"
                                                    converter="#{LogImpPerEec6.converterEsImportado1}"
                                                    disabled="#{LogImpPerEec6.gestor.filaNoProcesada}" required="true"
                                                    items="#{LogImpPerEec6.asistente.opcionesListaEsImportado1}"
                                                    selected="#{LogImpPerEec6.logImpPerEecDataProvider.value['es_importado']}"
                                                    toolTip="BundleParametros.es_importado.log_imp_per_eec"/>
                                                <webuijsf:staticText id="listaEsImportado1Texto1"
                                                    binding="#{LogImpPerEec6.listaEsImportado1Texto1}"/>
                                                <webuijsf:message id="messageEsImportado1"
                                                    for="listaEsImportado1"/>
                                                <webuijsf:helpInline id="helpInlineEsImportado1"
                                                    binding="#{LogImpPerEec6.helpInlineEsImportado1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_importado.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridObservacion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelObservacion1}"
                                                    id="labelObservacion1"
                                                    for="campoObservacion1"
                                                    toolTip="BundleParametros.observacion.log_imp_per_eec"
                                                    text="observaci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridObservacion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoObservacion1"
                                                    binding="#{LogImpPerEec6.campoObservacion1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['observacion']}"
                                                    toolTip="BundleParametros.observacion.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorObservacion1.validate}"/>
                                                <webuijsf:staticText id="campoObservacion1Texto1"
                                                    binding="#{LogImpPerEec6.campoObservacion1Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['observacion']}"/>
                                                <webuijsf:message id="messageObservacion1"
                                                    for="campoObservacion1"/>
                                                <webuijsf:helpInline id="helpInlineObservacion1"
                                                    binding="#{LogImpPerEec6.helpInlineObservacion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.observacion.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaHoraTransaccion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelFechaHoraTransaccion1}"
                                                    id="labelFechaHoraTransaccion1"
                                                    for="campoFechaHoraTransaccion1"
                                                    toolTip="BundleParametros.fecha_hora_transaccion.log_imp_per_eec"
                                                    text="fecha hora transacci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaHoraTransaccion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoFechaHoraTransaccion1"
                                                    binding="#{LogImpPerEec6.campoFechaHoraTransaccion1}"
                                                    converter="#{LogImpPerEec6.converterFechaHoraTransaccion1}"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}" required="true"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['fecha_hora_transaccion']}"
                                                    toolTip="BundleParametros.fecha_hora_transaccion.log_imp_per_eec"/>
                                                <webuijsf:staticText id="campoFechaHoraTransaccion1Texto1"
                                                    binding="#{LogImpPerEec6.campoFechaHoraTransaccion1Texto1}"
                                                    converter="#{LogImpPerEec6.converterFechaHoraTransaccion1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['fecha_hora_transaccion']}"/>
                                                <webuijsf:message id="messageFechaHoraTransaccion1"
                                                    for="campoFechaHoraTransaccion1"/>
                                                <webuijsf:helpInline id="helpInlineFechaHoraTransaccion1"
                                                    binding="#{LogImpPerEec6.helpInlineFechaHoraTransaccion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_hora_transaccion.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNombreArchivo1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelNombreArchivo1}"
                                                    id="labelNombreArchivo1"
                                                    for="campoNombreArchivo1"
                                                    toolTip="BundleParametros.nombre_archivo.log_imp_per_eec"
                                                    text="nombre archivo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNombreArchivo2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoNombreArchivo1"
                                                    binding="#{LogImpPerEec6.campoNombreArchivo1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['nombre_archivo']}"
                                                    toolTip="BundleParametros.nombre_archivo.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorNombreArchivo1.validate}"/>
                                                <webuijsf:staticText id="campoNombreArchivo1Texto1"
                                                    binding="#{LogImpPerEec6.campoNombreArchivo1Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['nombre_archivo']}"/>
                                                <webuijsf:button id="campoNombreArchivo1Boton3"
                                                    binding="#{LogImpPerEec6.campoNombreArchivo1Boton3}"
                                                    onClick="#{LogImpPerEec6.asistente.scriptCampoNombreArchivo1Boton3}"
                                                    rendered="#{LogImpPerEec6.asistente.campoNombreArchivo1Boton3Rendered}"
                                                    text="#{LogImpPerEec6.asistente.textCampoNombreArchivo1Boton3}"
                                                    toolTip="#{LogImpPerEec6.asistente.toolTipCampoNombreArchivo1Boton3}"/>
                                                <webuijsf:message id="messageNombreArchivo1"
                                                    for="campoNombreArchivo1"/>
                                                <webuijsf:helpInline id="helpInlineNombreArchivo1"
                                                    binding="#{LogImpPerEec6.helpInlineNombreArchivo1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.nombre_archivo.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridCodigoArchivo1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelCodigoArchivo1}"
                                                    id="labelCodigoArchivo1"
                                                    for="campoCodigoArchivo1"
                                                    toolTip="BundleParametros.codigo_archivo.log_imp_per_eec"
                                                    text="c&#243;digo archivo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridCodigoArchivo2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoCodigoArchivo1"
                                                    binding="#{LogImpPerEec6.campoCodigoArchivo1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['codigo_archivo']}"
                                                    toolTip="BundleParametros.codigo_archivo.log_imp_per_eec"
                                                    validatorExpression="#{LogImpPerEec6.validatorCodigoArchivo1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoArchivo1Texto1"
                                                    binding="#{LogImpPerEec6.campoCodigoArchivo1Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['codigo_archivo']}"/>
                                                <webuijsf:message id="messageCodigoArchivo1"
                                                    for="campoCodigoArchivo1"/>
                                                <webuijsf:helpInline id="helpInlineCodigoArchivo1"
                                                    binding="#{LogImpPerEec6.helpInlineCodigoArchivo1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.codigo_archivo.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdFichaPersona1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelIdFichaPersona1}"
                                                    id="labelIdFichaPersona1"
                                                    for="campoIdFichaPersona1"
                                                    toolTip="BundleParametros.id_ficha_persona.log_imp_per_eec"
                                                    text="ficha persona"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdFichaPersona2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdFichaPersona1"
                                                    binding="#{LogImpPerEec6.campoIdFichaPersona1}"
                                                    readOnly="#{LogImpPerEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPerEec6.asistente.textoCampoIdFichaPersona1}"
                                                    toolTip="#{LogImpPerEec6.asistente.toolTipCampoIdFichaPersona1}"
                                                    validatorExpression="#{LogImpPerEec6.campoIdFichaPersona1_validate}"/>
                                                <webuijsf:staticText id="campoIdFichaPersona1Texto1"
                                                    binding="#{LogImpPerEec6.campoIdFichaPersona1Texto1}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['codigo_ficha_persona_1x1y3']}"/>
                                                <webuijsf:button id="campoIdFichaPersona1Boton1"
                                                    binding="#{LogImpPerEec6.campoIdFichaPersona1Boton1}"
                                                    onClick="#{LogImpPerEec6.asistente.scriptCampoIdFichaPersona1Boton1}"/>
                                                <webuijsf:button id="campoIdFichaPersona1Boton3"
                                                    binding="#{LogImpPerEec6.campoIdFichaPersona1Boton3}"
                                                    onClick="#{LogImpPerEec6.asistente.scriptCampoIdFichaPersona1Boton2}"
                                                    rendered="#{LogImpPerEec6.asistente.campoIdFichaPersona1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdFichaPersona1"
                                                    for="campoIdFichaPersona1"/>
                                                <webuijsf:helpInline id="helpInlineIdFichaPersona1"
                                                    binding="#{LogImpPerEec6.helpInlineIdFichaPersona1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_ficha_persona.log_imp_per_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdFichaPersona3"
                                                rendered="#{LogImpPerEec6.asistente.campoIdFichaPersona1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPerEec6.labelIdFichaPersona2}"
                                                    id="labelIdFichaPersona2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre ficha persona"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdFichaPersona4"
                                                rendered="#{LogImpPerEec6.asistente.campoIdFichaPersona1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{LogImpPerEec6.campoIdFichaPersona1Texto2}"
                                                    text="#{LogImpPerEec6.logImpPerEecDataProvider.value['nombre_ficha_persona_1x1y4']}"
                                                    id="campoIdFichaPersona1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{LogImpPerEec6.campoIdFichaPersona1Boton2}"
                                                    id="campoIdFichaPersona1Boton2"
                                                    onClick="#{LogImpPerEec6.asistente.scriptCampoIdFichaPersona1Boton2}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            id="gridPanel116"
                                            styleClass="pdq-grid-detalle-pie">
                                        <h:panelGrid
                                            columns="2"
                                            id="gridPanel117">
                                            <h:panelGrid
                                                id="gridPanel118"
                                                styleClass="pdq-grid-detalle-botones">
                                                <h:panelGrid 
                                                    columns="7"
                                                    id="gridPanel119">
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpPerEec6.botonIrAlPrimero2_action}"
                                                        binding="#{LogImpPerEec6.botonIrAlPrimero2}"
                                                        disabled="#{LogImpPerEec6.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero2"
                                                        imageURL="#{LogImpPerEec6.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{LogImpPerEec6.gestor.scriptIrAlPrimero}"
                                                        text="#{LogImpPerEec6.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{LogImpPerEec6.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpPerEec6.botonIrAlAnterior2_action}"
                                                        binding="#{LogImpPerEec6.botonIrAlAnterior2}"
                                                        disabled="#{LogImpPerEec6.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior2"
                                                        imageURL="#{LogImpPerEec6.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{LogImpPerEec6.gestor.scriptIrAlAnterior}"
                                                        text="#{LogImpPerEec6.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{LogImpPerEec6.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpPerEec6.botonIrAlSiguiente2_action}"
                                                        binding="#{LogImpPerEec6.botonIrAlSiguiente2}"
                                                        disabled="#{LogImpPerEec6.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente2"
                                                        imageURL="#{LogImpPerEec6.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{LogImpPerEec6.gestor.scriptIrAlSiguiente}"
                                                        text="#{LogImpPerEec6.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{LogImpPerEec6.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpPerEec6.botonIrAlUltimo2_action}"
                                                        binding="#{LogImpPerEec6.botonIrAlUltimo2}"
                                                        disabled="#{LogImpPerEec6.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo2"
                                                        imageURL="#{LogImpPerEec6.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{LogImpPerEec6.gestor.scriptIrAlUltimo}"
                                                        text="#{LogImpPerEec6.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{LogImpPerEec6.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpPerEec6.botonProcesarFila2_action}"
                                                        binding="#{LogImpPerEec6.botonProcesarFila2}"
                                                        disabled="#{LogImpPerEec6.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila2"
                                                        imageURL="#{LogImpPerEec6.gestor.urlImagenProcesar}"
                                                        onClick="#{LogImpPerEec6.scriptAbrirVentanaProcesarFila2}"
                                                        rendered="#{LogImpPerEec6.asistente.comandoDisponible}"
                                                        text="#{LogImpPerEec6.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{LogImpPerEec6.gestor.i18n.toolTipBotonProcesarFila}"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPanel120"
                                                styleClass="pdq-grid-detalle-mensajes">
                                                <h:panelGrid
                                                    id="gridPanel121"
                                                    styleClass="pdq-grid-detalle-mensajes-2">
                                                    <webuijsf:staticText
                                                        id="textoMensajeCambiosPorConfirmar1"
                                                        style="font-weight: bold"
                                                        text="#{LogImpPerEec6.gestor.mensajeCambiosPorConfirmar}"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        </h:panelGrid>
                                        </h:panelGrid>
                                        <h:panelGrid 
                                            id="gridPanel122">
                                            <h:panelGrid 
                                                id="gridPanel123">
                                                <webuijsf:anchor 
                                                    id="anchor1"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="13"
                                                id="gridPanel124">
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPerEec6.botonAgregar1_action}"
                                                    binding="#{LogImpPerEec6.botonAgregar1}"
                                                    disabled="#{LogImpPerEec6.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{LogImpPerEec6.gestor.scriptAgregar}"
                                                    rendered="#{LogImpPerEec6.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPerEec6.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{LogImpPerEec6.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{LogImpPerEec6.listaFuncionEdicion1}"
                                                    converter="#{LogImpPerEec6.converterListaFuncionEdicion1}"
                                                    disabled="#{LogImpPerEec6.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{LogImpPerEec6.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{LogImpPerEec6.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{LogImpPerEec6.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{LogImpPerEec6.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPerEec6.botonEditar1_action}"
                                                    binding="#{LogImpPerEec6.botonEditar1}"
                                                    disabled="#{LogImpPerEec6.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{LogImpPerEec6.gestor.scriptEditar}"
                                                    rendered="#{LogImpPerEec6.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPerEec6.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{LogImpPerEec6.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPerEec6.botonEliminar1_action}"
                                                    binding="#{LogImpPerEec6.botonEliminar1}"
                                                    disabled="#{LogImpPerEec6.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{LogImpPerEec6.gestor.scriptEliminar}"
                                                    rendered="#{LogImpPerEec6.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPerEec6.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{LogImpPerEec6.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPerEec6.botonAplicar1_action}"
                                                    binding="#{LogImpPerEec6.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{LogImpPerEec6.gestor.scriptAplicar}"
                                                    rendered="#{LogImpPerEec6.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPerEec6.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{LogImpPerEec6.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPerEec6.botonDeshacer1_action}"
                                                    binding="#{LogImpPerEec6.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{LogImpPerEec6.gestor.scriptDeshacer}"
                                                    rendered="#{LogImpPerEec6.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPerEec6.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{LogImpPerEec6.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPerEec6.botonConfirmar1_action}"
                                                    binding="#{LogImpPerEec6.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{LogImpPerEec6.gestor.scriptConfirmar}"
                                                    rendered="#{LogImpPerEec6.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPerEec6.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{LogImpPerEec6.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPerEec6.botonDescartar1_action}"
                                                    binding="#{LogImpPerEec6.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{LogImpPerEec6.gestor.scriptDescartar}"
                                                    rendered="#{LogImpPerEec6.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPerEec6.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{LogImpPerEec6.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{LogImpPerEec6.listaFuncionAccion1}"
                                                    converter="#{LogImpPerEec6.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{LogImpPerEec6.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{LogImpPerEec6.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{LogImpPerEec6.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{LogImpPerEec6.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPerEec6.botonProcesar1_action}"
                                                    binding="#{LogImpPerEec6.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{LogImpPerEec6.gestor.scriptProcesar}"
                                                    rendered="#{LogImpPerEec6.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPerEec6.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{LogImpPerEec6.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPerEec6.botonRefrescar1_action}"
                                                    binding="#{LogImpPerEec6.botonRefrescar1}"
                                                    disabled="#{LogImpPerEec6.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{LogImpPerEec6.gestor.scriptRefrescar}"
                                                    rendered="#{LogImpPerEec6.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPerEec6.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{LogImpPerEec6.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPerEec6.botonReconsultar1_action}"
                                                    binding="#{LogImpPerEec6.botonReconsultar1}"
                                                    disabled="#{LogImpPerEec6.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{LogImpPerEec6.gestor.scriptReconsultar}"
                                                    rendered="#{LogImpPerEec6.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPerEec6.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{LogImpPerEec6.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPerEec6.botonRetornar1_action}"
                                                    binding="#{LogImpPerEec6.botonRetornar1}"
                                                    disabled="#{LogImpPerEec6.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{LogImpPerEec6.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{LogImpPerEec6.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPerEec6.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{LogImpPerEec6.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel125"
                                                rendered="#{LogImpPerEec6.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{LogImpPerEec6.imageHyperlink1_action}"
                                                    binding="#{LogImpPerEec6.imageHyperlink1}"
                                                    disabled="#{LogImpPerEec6.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{LogImpPerEec6.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{LogImpPerEec6.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{LogImpPerEec6.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.LogImpPerEec6_imageHyperlink1_toolTip}"/>
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
