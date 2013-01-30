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
                    focus="#{LogImpHogEec6.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{LogImpHogEec6.gestor.preserveFocus}"
                    preserveScroll="#{LogImpHogEec6.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{LogImpHogEec6.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | campoIdLogImpHogEec1 campoDptod1 campoDistritod1 campoDistripg1 campoArea1 campoBarrio1 campoManzana1 campoFormulario1 campoVivi1 campoHogar1 campoDireccion1 campoNroDe1 campoTelefono1 campoFecha1 campoDia1 campoMes1 campoAno1 campoV10t1 campoV111 campoV121 campoV131 campoV141 campoV151 campoV161 campoV16Otr1 campoV17a1 campoV17b1 campoV181 campoV191 campoV201 campoV211 campoV221 campoV231 campoV241 campoV251 campoV261 campoV26espCelular1 campoV271 campoV27espLinea1 campoV2811 campoV2821 campoV2831 campoV2841 campoV2851 campoV2861 campoV2871 campoV2881 campoV29nombreJefe1 campoCedulajefe1 campoVar000011 listaEsImportado1 campoObservacion1 campoFechaHoraTransaccion1 campoNombreArchivo1 campoCodigoArchivo1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | | , virtualForm3 | listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{LogImpHogEec6.breadcrumbs1}" 
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
                                                    rendered="#{LogImpHogEec6.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{LogImpHogEec6.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{LogImpHogEec6.gestor.mensajeDisponible}"
                                                    text="#{LogImpHogEec6.gestor.mensaje}"
                                                    url="#{LogImpHogEec6.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            id="gridPanel104"
                                            rendered="#{LogImpHogEec6.gestor.filaDisponible}"
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
                                                        actionExpression="#{LogImpHogEec6.botonIrAlPrimero1_action}"
                                                        binding="#{LogImpHogEec6.botonIrAlPrimero1}"
                                                        disabled="#{LogImpHogEec6.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero1"
                                                        imageURL="#{LogImpHogEec6.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{LogImpHogEec6.gestor.scriptIrAlPrimero}"
                                                        text="#{LogImpHogEec6.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{LogImpHogEec6.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpHogEec6.botonIrAlAnterior1_action}"
                                                        binding="#{LogImpHogEec6.botonIrAlAnterior1}"
                                                        disabled="#{LogImpHogEec6.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior1"
                                                        imageURL="#{LogImpHogEec6.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{LogImpHogEec6.gestor.scriptIrAlAnterior}"
                                                        text="#{LogImpHogEec6.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{LogImpHogEec6.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpHogEec6.botonIrAlSiguiente1_action}"
                                                        binding="#{LogImpHogEec6.botonIrAlSiguiente1}"
                                                        disabled="#{LogImpHogEec6.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente1"
                                                        imageURL="#{LogImpHogEec6.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{LogImpHogEec6.gestor.scriptIrAlSiguiente}"
                                                        text="#{LogImpHogEec6.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{LogImpHogEec6.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpHogEec6.botonIrAlUltimo1_action}"
                                                        binding="#{LogImpHogEec6.botonIrAlUltimo1}"
                                                        disabled="#{LogImpHogEec6.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo1"
                                                        imageURL="#{LogImpHogEec6.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{LogImpHogEec6.gestor.scriptIrAlUltimo}"
                                                        text="#{LogImpHogEec6.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{LogImpHogEec6.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpHogEec6.botonProcesarFila1_action}"
                                                        binding="#{LogImpHogEec6.botonProcesarFila1}"
                                                        disabled="#{LogImpHogEec6.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila1"
                                                        imageURL="#{LogImpHogEec6.gestor.urlImagenProcesar}"
                                                        onClick="#{LogImpHogEec6.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{LogImpHogEec6.asistente.comandoDisponible}"
                                                        text="#{LogImpHogEec6.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{LogImpHogEec6.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{LogImpHogEec6.gestor.tituloConsulta}"/>
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
                                                    binding="#{LogImpHogEec6.etiquetaIdentificacionFila1}"
                                                    id="etiquetaIdentificacionFila1"
                                                    text="#{LogImpHogEec6.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{LogImpHogEec6.gestor.i18n.toolTipEtiquetaIdentificacionFila}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel113"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoIdentificacionFila1"
                                                    style="font-weight: bold"
                                                    text="#{LogImpHogEec6.gestor.identificacionFila}"/>
                                                <webuijsf:image
                                                    id="imagenFilaProcesada1"
                                                    toolTip="#{LogImpHogEec6.gestor.toolTipImagenFilaProcesada}"
                                                    url="#{LogImpHogEec6.gestor.urlImagenFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPanel114"
                                                rendered="#{LogImpHogEec6.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec6.etiquetaDenominacionFilaMaestro1}"
                                                    id="etiquetaDenominacionFilaMaestro1"
                                                    text="?"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel115"
                                                rendered="#{LogImpHogEec6.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoDenominacionFilaMaestro1"
                                                    style="font-weight: bold"
                                                    text="#{LogImpHogEec6.gestor.denominacionFilaMaestro}"/>
                                                <webuijsf:image
                                                    id="imagenFilaMaestro1"
                                                    url="#{LogImpHogEec6.gestor.urlImagenMaestroFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdLogImpHogEec1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec6.labelIdLogImpHogEec1}"
                                                    id="labelIdLogImpHogEec1"
                                                    for="campoIdLogImpHogEec1"
                                                    text="identificaci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdLogImpHogEec2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdLogImpHogEec1"
                                                    binding="#{LogImpHogEec6.campoIdLogImpHogEec1}"
                                                    converter="#{LogImpHogEec6.converterIdLogImpHogEec1}"
                                                    readOnly="true"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['id_log_imp_hog_eec']}"
                                                    toolTip="BundleParametros.id_log_imp_hog_eec.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec6.validatorIdLogImpHogEec1.validate}"/>
                                                <webuijsf:staticText id="campoIdLogImpHogEec1Texto1"
                                                    binding="#{LogImpHogEec6.campoIdLogImpHogEec1Texto1}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['id_log_imp_hog_eec']}"/>
                                                <webuijsf:message id="messageIdLogImpHogEec1"
                                                    for="campoIdLogImpHogEec1"/>
                                                <webuijsf:helpInline id="helpInlineIdLogImpHogEec1"
                                                    binding="#{LogImpHogEec6.helpInlineIdLogImpHogEec1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_log_imp_hog_eec.log_imp_hog_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridDptod1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec6.labelDptod1}"
                                                    id="labelDptod1"
                                                    for="campoDptod1"
                                                    text="dptod"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridDptod2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoDptod1"
                                                    binding="#{LogImpHogEec6.campoDptod1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHogEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['dptod']}"
                                                    toolTip="BundleParametros.dptod.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec6.validatorDptod1.validate}"/>
                                                <webuijsf:staticText id="campoDptod1Texto1"
                                                    binding="#{LogImpHogEec6.campoDptod1Texto1}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['dptod']}"/>
                                                <webuijsf:message id="messageDptod1"
                                                    for="campoDptod1"/>
                                                <webuijsf:helpInline id="helpInlineDptod1"
                                                    binding="#{LogImpHogEec6.helpInlineDptod1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.dptod.log_imp_hog_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridDistritod1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec6.labelDistritod1}"
                                                    id="labelDistritod1"
                                                    for="campoDistritod1"
                                                    text="distritod"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridDistritod2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoDistritod1"
                                                    binding="#{LogImpHogEec6.campoDistritod1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHogEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['distritod']}"
                                                    toolTip="BundleParametros.distritod.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec6.validatorDistritod1.validate}"/>
                                                <webuijsf:staticText id="campoDistritod1Texto1"
                                                    binding="#{LogImpHogEec6.campoDistritod1Texto1}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['distritod']}"/>
                                                <webuijsf:message id="messageDistritod1"
                                                    for="campoDistritod1"/>
                                                <webuijsf:helpInline id="helpInlineDistritod1"
                                                    binding="#{LogImpHogEec6.helpInlineDistritod1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.distritod.log_imp_hog_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridDistripg1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec6.labelDistripg1}"
                                                    id="labelDistripg1"
                                                    for="campoDistripg1"
                                                    text="distripg"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridDistripg2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoDistripg1"
                                                    binding="#{LogImpHogEec6.campoDistripg1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHogEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['distripg']}"
                                                    toolTip="BundleParametros.distripg.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec6.validatorDistripg1.validate}"/>
                                                <webuijsf:staticText id="campoDistripg1Texto1"
                                                    binding="#{LogImpHogEec6.campoDistripg1Texto1}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['distripg']}"/>
                                                <webuijsf:message id="messageDistripg1"
                                                    for="campoDistripg1"/>
                                                <webuijsf:helpInline id="helpInlineDistripg1"
                                                    binding="#{LogImpHogEec6.helpInlineDistripg1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.distripg.log_imp_hog_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridArea1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec6.labelArea1}"
                                                    id="labelArea1"
                                                    for="campoArea1"
                                                    text="area"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridArea2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoArea1"
                                                    binding="#{LogImpHogEec6.campoArea1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHogEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['area']}"
                                                    toolTip="BundleParametros.area.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec6.validatorArea1.validate}"/>
                                                <webuijsf:staticText id="campoArea1Texto1"
                                                    binding="#{LogImpHogEec6.campoArea1Texto1}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['area']}"/>
                                                <webuijsf:message id="messageArea1"
                                                    for="campoArea1"/>
                                                <webuijsf:helpInline id="helpInlineArea1"
                                                    binding="#{LogImpHogEec6.helpInlineArea1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.area.log_imp_hog_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridBarrio1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec6.labelBarrio1}"
                                                    id="labelBarrio1"
                                                    for="campoBarrio1"
                                                    text="barrio"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridBarrio2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoBarrio1"
                                                    binding="#{LogImpHogEec6.campoBarrio1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHogEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['barrio']}"
                                                    toolTip="BundleParametros.barrio.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec6.validatorBarrio1.validate}"/>
                                                <webuijsf:staticText id="campoBarrio1Texto1"
                                                    binding="#{LogImpHogEec6.campoBarrio1Texto1}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['barrio']}"/>
                                                <webuijsf:message id="messageBarrio1"
                                                    for="campoBarrio1"/>
                                                <webuijsf:helpInline id="helpInlineBarrio1"
                                                    binding="#{LogImpHogEec6.helpInlineBarrio1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.barrio.log_imp_hog_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridManzana1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec6.labelManzana1}"
                                                    id="labelManzana1"
                                                    for="campoManzana1"
                                                    text="manzana"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridManzana2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoManzana1"
                                                    binding="#{LogImpHogEec6.campoManzana1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHogEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['manzana']}"
                                                    toolTip="BundleParametros.manzana.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec6.validatorManzana1.validate}"/>
                                                <webuijsf:staticText id="campoManzana1Texto1"
                                                    binding="#{LogImpHogEec6.campoManzana1Texto1}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['manzana']}"/>
                                                <webuijsf:message id="messageManzana1"
                                                    for="campoManzana1"/>
                                                <webuijsf:helpInline id="helpInlineManzana1"
                                                    binding="#{LogImpHogEec6.helpInlineManzana1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.manzana.log_imp_hog_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFormulario1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec6.labelFormulario1}"
                                                    id="labelFormulario1"
                                                    for="campoFormulario1"
                                                    text="formulario"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFormulario2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoFormulario1"
                                                    binding="#{LogImpHogEec6.campoFormulario1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHogEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['formulario']}"
                                                    toolTip="BundleParametros.formulario.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec6.validatorFormulario1.validate}"/>
                                                <webuijsf:staticText id="campoFormulario1Texto1"
                                                    binding="#{LogImpHogEec6.campoFormulario1Texto1}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['formulario']}"/>
                                                <webuijsf:message id="messageFormulario1"
                                                    for="campoFormulario1"/>
                                                <webuijsf:helpInline id="helpInlineFormulario1"
                                                    binding="#{LogImpHogEec6.helpInlineFormulario1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.formulario.log_imp_hog_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridVivi1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec6.labelVivi1}"
                                                    id="labelVivi1"
                                                    for="campoVivi1"
                                                    text="vivi"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridVivi2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoVivi1"
                                                    binding="#{LogImpHogEec6.campoVivi1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHogEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['vivi']}"
                                                    toolTip="BundleParametros.vivi.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec6.validatorVivi1.validate}"/>
                                                <webuijsf:staticText id="campoVivi1Texto1"
                                                    binding="#{LogImpHogEec6.campoVivi1Texto1}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['vivi']}"/>
                                                <webuijsf:message id="messageVivi1"
                                                    for="campoVivi1"/>
                                                <webuijsf:helpInline id="helpInlineVivi1"
                                                    binding="#{LogImpHogEec6.helpInlineVivi1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.vivi.log_imp_hog_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridHogar1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec6.labelHogar1}"
                                                    id="labelHogar1"
                                                    for="campoHogar1"
                                                    text="hogar"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridHogar2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoHogar1"
                                                    binding="#{LogImpHogEec6.campoHogar1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHogEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['hogar']}"
                                                    toolTip="BundleParametros.hogar.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec6.validatorHogar1.validate}"/>
                                                <webuijsf:staticText id="campoHogar1Texto1"
                                                    binding="#{LogImpHogEec6.campoHogar1Texto1}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['hogar']}"/>
                                                <webuijsf:message id="messageHogar1"
                                                    for="campoHogar1"/>
                                                <webuijsf:helpInline id="helpInlineHogar1"
                                                    binding="#{LogImpHogEec6.helpInlineHogar1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.hogar.log_imp_hog_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridDireccion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec6.labelDireccion1}"
                                                    id="labelDireccion1"
                                                    for="campoDireccion1"
                                                    text="direcci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridDireccion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoDireccion1"
                                                    binding="#{LogImpHogEec6.campoDireccion1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHogEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['direccion']}"
                                                    toolTip="BundleParametros.direccion.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec6.validatorDireccion1.validate}"/>
                                                <webuijsf:staticText id="campoDireccion1Texto1"
                                                    binding="#{LogImpHogEec6.campoDireccion1Texto1}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['direccion']}"/>
                                                <webuijsf:message id="messageDireccion1"
                                                    for="campoDireccion1"/>
                                                <webuijsf:helpInline id="helpInlineDireccion1"
                                                    binding="#{LogImpHogEec6.helpInlineDireccion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.direccion.log_imp_hog_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNroDe1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec6.labelNroDe1}"
                                                    id="labelNroDe1"
                                                    for="campoNroDe1"
                                                    text="nro de"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNroDe2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoNroDe1"
                                                    binding="#{LogImpHogEec6.campoNroDe1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHogEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['nro_de']}"
                                                    toolTip="BundleParametros.nro_de.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec6.validatorNroDe1.validate}"/>
                                                <webuijsf:staticText id="campoNroDe1Texto1"
                                                    binding="#{LogImpHogEec6.campoNroDe1Texto1}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['nro_de']}"/>
                                                <webuijsf:message id="messageNroDe1"
                                                    for="campoNroDe1"/>
                                                <webuijsf:helpInline id="helpInlineNroDe1"
                                                    binding="#{LogImpHogEec6.helpInlineNroDe1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.nro_de.log_imp_hog_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridTelefono1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec6.labelTelefono1}"
                                                    id="labelTelefono1"
                                                    for="campoTelefono1"
                                                    text="tel&#233;fono"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridTelefono2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoTelefono1"
                                                    binding="#{LogImpHogEec6.campoTelefono1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHogEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['telefono']}"
                                                    toolTip="BundleParametros.telefono.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec6.validatorTelefono1.validate}"/>
                                                <webuijsf:staticText id="campoTelefono1Texto1"
                                                    binding="#{LogImpHogEec6.campoTelefono1Texto1}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['telefono']}"/>
                                                <webuijsf:message id="messageTelefono1"
                                                    for="campoTelefono1"/>
                                                <webuijsf:helpInline id="helpInlineTelefono1"
                                                    binding="#{LogImpHogEec6.helpInlineTelefono1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.telefono.log_imp_hog_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFecha1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec6.labelFecha1}"
                                                    id="labelFecha1"
                                                    for="campoFecha1"
                                                    text="fecha"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFecha2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoFecha1"
                                                    binding="#{LogImpHogEec6.campoFecha1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHogEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['fecha']}"
                                                    toolTip="BundleParametros.fecha.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec6.validatorFecha1.validate}"/>
                                                <webuijsf:staticText id="campoFecha1Texto1"
                                                    binding="#{LogImpHogEec6.campoFecha1Texto1}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['fecha']}"/>
                                                <webuijsf:message id="messageFecha1"
                                                    for="campoFecha1"/>
                                                <webuijsf:helpInline id="helpInlineFecha1"
                                                    binding="#{LogImpHogEec6.helpInlineFecha1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha.log_imp_hog_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridDia1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec6.labelDia1}"
                                                    id="labelDia1"
                                                    for="campoDia1"
                                                    text="dia"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridDia2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoDia1"
                                                    binding="#{LogImpHogEec6.campoDia1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHogEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['dia']}"
                                                    toolTip="BundleParametros.dia.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec6.validatorDia1.validate}"/>
                                                <webuijsf:staticText id="campoDia1Texto1"
                                                    binding="#{LogImpHogEec6.campoDia1Texto1}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['dia']}"/>
                                                <webuijsf:message id="messageDia1"
                                                    for="campoDia1"/>
                                                <webuijsf:helpInline id="helpInlineDia1"
                                                    binding="#{LogImpHogEec6.helpInlineDia1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.dia.log_imp_hog_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridMes1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec6.labelMes1}"
                                                    id="labelMes1"
                                                    for="campoMes1"
                                                    text="mes"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridMes2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoMes1"
                                                    binding="#{LogImpHogEec6.campoMes1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHogEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['mes']}"
                                                    toolTip="BundleParametros.mes.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec6.validatorMes1.validate}"/>
                                                <webuijsf:staticText id="campoMes1Texto1"
                                                    binding="#{LogImpHogEec6.campoMes1Texto1}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['mes']}"/>
                                                <webuijsf:message id="messageMes1"
                                                    for="campoMes1"/>
                                                <webuijsf:helpInline id="helpInlineMes1"
                                                    binding="#{LogImpHogEec6.helpInlineMes1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.mes.log_imp_hog_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridAno1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec6.labelAno1}"
                                                    id="labelAno1"
                                                    for="campoAno1"
                                                    text="a&#241;o"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridAno2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoAno1"
                                                    binding="#{LogImpHogEec6.campoAno1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHogEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['ano']}"
                                                    toolTip="BundleParametros.ano.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec6.validatorAno1.validate}"/>
                                                <webuijsf:staticText id="campoAno1Texto1"
                                                    binding="#{LogImpHogEec6.campoAno1Texto1}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['ano']}"/>
                                                <webuijsf:message id="messageAno1"
                                                    for="campoAno1"/>
                                                <webuijsf:helpInline id="helpInlineAno1"
                                                    binding="#{LogImpHogEec6.helpInlineAno1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.ano.log_imp_hog_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridV10t1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec6.labelV10t1}"
                                                    id="labelV10t1"
                                                    for="campoV10t1"
                                                    text="v10t"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridV10t2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoV10t1"
                                                    binding="#{LogImpHogEec6.campoV10t1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHogEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['v10t']}"
                                                    toolTip="BundleParametros.v10t.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec6.validatorV10t1.validate}"/>
                                                <webuijsf:staticText id="campoV10t1Texto1"
                                                    binding="#{LogImpHogEec6.campoV10t1Texto1}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['v10t']}"/>
                                                <webuijsf:message id="messageV10t1"
                                                    for="campoV10t1"/>
                                                <webuijsf:helpInline id="helpInlineV10t1"
                                                    binding="#{LogImpHogEec6.helpInlineV10t1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.v10t.log_imp_hog_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridV111"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec6.labelV111}"
                                                    id="labelV111"
                                                    for="campoV111"
                                                    text="v11"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridV112"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoV111"
                                                    binding="#{LogImpHogEec6.campoV111}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHogEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['v11']}"
                                                    toolTip="BundleParametros.v11.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec6.validatorV111.validate}"/>
                                                <webuijsf:staticText id="campoV111Texto1"
                                                    binding="#{LogImpHogEec6.campoV111Texto1}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['v11']}"/>
                                                <webuijsf:message id="messageV111"
                                                    for="campoV111"/>
                                                <webuijsf:helpInline id="helpInlineV111"
                                                    binding="#{LogImpHogEec6.helpInlineV111}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.v11.log_imp_hog_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridV121"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec6.labelV121}"
                                                    id="labelV121"
                                                    for="campoV121"
                                                    text="v12"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridV122"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoV121"
                                                    binding="#{LogImpHogEec6.campoV121}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHogEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['v12']}"
                                                    toolTip="BundleParametros.v12.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec6.validatorV121.validate}"/>
                                                <webuijsf:staticText id="campoV121Texto1"
                                                    binding="#{LogImpHogEec6.campoV121Texto1}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['v12']}"/>
                                                <webuijsf:message id="messageV121"
                                                    for="campoV121"/>
                                                <webuijsf:helpInline id="helpInlineV121"
                                                    binding="#{LogImpHogEec6.helpInlineV121}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.v12.log_imp_hog_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridV131"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec6.labelV131}"
                                                    id="labelV131"
                                                    for="campoV131"
                                                    text="v13"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridV132"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoV131"
                                                    binding="#{LogImpHogEec6.campoV131}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHogEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['v13']}"
                                                    toolTip="BundleParametros.v13.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec6.validatorV131.validate}"/>
                                                <webuijsf:staticText id="campoV131Texto1"
                                                    binding="#{LogImpHogEec6.campoV131Texto1}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['v13']}"/>
                                                <webuijsf:message id="messageV131"
                                                    for="campoV131"/>
                                                <webuijsf:helpInline id="helpInlineV131"
                                                    binding="#{LogImpHogEec6.helpInlineV131}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.v13.log_imp_hog_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridV141"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec6.labelV141}"
                                                    id="labelV141"
                                                    for="campoV141"
                                                    text="v14"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridV142"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoV141"
                                                    binding="#{LogImpHogEec6.campoV141}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHogEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['v14']}"
                                                    toolTip="BundleParametros.v14.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec6.validatorV141.validate}"/>
                                                <webuijsf:staticText id="campoV141Texto1"
                                                    binding="#{LogImpHogEec6.campoV141Texto1}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['v14']}"/>
                                                <webuijsf:message id="messageV141"
                                                    for="campoV141"/>
                                                <webuijsf:helpInline id="helpInlineV141"
                                                    binding="#{LogImpHogEec6.helpInlineV141}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.v14.log_imp_hog_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridV151"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec6.labelV151}"
                                                    id="labelV151"
                                                    for="campoV151"
                                                    text="v15"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridV152"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoV151"
                                                    binding="#{LogImpHogEec6.campoV151}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHogEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['v15']}"
                                                    toolTip="BundleParametros.v15.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec6.validatorV151.validate}"/>
                                                <webuijsf:staticText id="campoV151Texto1"
                                                    binding="#{LogImpHogEec6.campoV151Texto1}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['v15']}"/>
                                                <webuijsf:message id="messageV151"
                                                    for="campoV151"/>
                                                <webuijsf:helpInline id="helpInlineV151"
                                                    binding="#{LogImpHogEec6.helpInlineV151}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.v15.log_imp_hog_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridV161"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec6.labelV161}"
                                                    id="labelV161"
                                                    for="campoV161"
                                                    text="v16"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridV162"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoV161"
                                                    binding="#{LogImpHogEec6.campoV161}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHogEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['v16']}"
                                                    toolTip="BundleParametros.v16.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec6.validatorV161.validate}"/>
                                                <webuijsf:staticText id="campoV161Texto1"
                                                    binding="#{LogImpHogEec6.campoV161Texto1}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['v16']}"/>
                                                <webuijsf:message id="messageV161"
                                                    for="campoV161"/>
                                                <webuijsf:helpInline id="helpInlineV161"
                                                    binding="#{LogImpHogEec6.helpInlineV161}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.v16.log_imp_hog_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridV16Otr1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec6.labelV16Otr1}"
                                                    id="labelV16Otr1"
                                                    for="campoV16Otr1"
                                                    text="v16 otr"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridV16Otr2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoV16Otr1"
                                                    binding="#{LogImpHogEec6.campoV16Otr1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHogEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['v16_otr']}"
                                                    toolTip="BundleParametros.v16_otr.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec6.validatorV16Otr1.validate}"/>
                                                <webuijsf:staticText id="campoV16Otr1Texto1"
                                                    binding="#{LogImpHogEec6.campoV16Otr1Texto1}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['v16_otr']}"/>
                                                <webuijsf:message id="messageV16Otr1"
                                                    for="campoV16Otr1"/>
                                                <webuijsf:helpInline id="helpInlineV16Otr1"
                                                    binding="#{LogImpHogEec6.helpInlineV16Otr1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.v16_otr.log_imp_hog_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridV17a1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec6.labelV17a1}"
                                                    id="labelV17a1"
                                                    for="campoV17a1"
                                                    text="v17a"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridV17a2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoV17a1"
                                                    binding="#{LogImpHogEec6.campoV17a1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHogEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['v17a']}"
                                                    toolTip="BundleParametros.v17a.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec6.validatorV17a1.validate}"/>
                                                <webuijsf:staticText id="campoV17a1Texto1"
                                                    binding="#{LogImpHogEec6.campoV17a1Texto1}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['v17a']}"/>
                                                <webuijsf:message id="messageV17a1"
                                                    for="campoV17a1"/>
                                                <webuijsf:helpInline id="helpInlineV17a1"
                                                    binding="#{LogImpHogEec6.helpInlineV17a1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.v17a.log_imp_hog_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridV17b1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec6.labelV17b1}"
                                                    id="labelV17b1"
                                                    for="campoV17b1"
                                                    text="v17b"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridV17b2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoV17b1"
                                                    binding="#{LogImpHogEec6.campoV17b1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHogEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['v17b']}"
                                                    toolTip="BundleParametros.v17b.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec6.validatorV17b1.validate}"/>
                                                <webuijsf:staticText id="campoV17b1Texto1"
                                                    binding="#{LogImpHogEec6.campoV17b1Texto1}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['v17b']}"/>
                                                <webuijsf:message id="messageV17b1"
                                                    for="campoV17b1"/>
                                                <webuijsf:helpInline id="helpInlineV17b1"
                                                    binding="#{LogImpHogEec6.helpInlineV17b1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.v17b.log_imp_hog_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridV181"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec6.labelV181}"
                                                    id="labelV181"
                                                    for="campoV181"
                                                    text="v18"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridV182"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoV181"
                                                    binding="#{LogImpHogEec6.campoV181}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHogEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['v18']}"
                                                    toolTip="BundleParametros.v18.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec6.validatorV181.validate}"/>
                                                <webuijsf:staticText id="campoV181Texto1"
                                                    binding="#{LogImpHogEec6.campoV181Texto1}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['v18']}"/>
                                                <webuijsf:message id="messageV181"
                                                    for="campoV181"/>
                                                <webuijsf:helpInline id="helpInlineV181"
                                                    binding="#{LogImpHogEec6.helpInlineV181}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.v18.log_imp_hog_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridV191"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec6.labelV191}"
                                                    id="labelV191"
                                                    for="campoV191"
                                                    text="v19"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridV192"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoV191"
                                                    binding="#{LogImpHogEec6.campoV191}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHogEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['v19']}"
                                                    toolTip="BundleParametros.v19.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec6.validatorV191.validate}"/>
                                                <webuijsf:staticText id="campoV191Texto1"
                                                    binding="#{LogImpHogEec6.campoV191Texto1}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['v19']}"/>
                                                <webuijsf:message id="messageV191"
                                                    for="campoV191"/>
                                                <webuijsf:helpInline id="helpInlineV191"
                                                    binding="#{LogImpHogEec6.helpInlineV191}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.v19.log_imp_hog_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridV201"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec6.labelV201}"
                                                    id="labelV201"
                                                    for="campoV201"
                                                    text="v20"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridV202"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoV201"
                                                    binding="#{LogImpHogEec6.campoV201}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHogEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['v20']}"
                                                    toolTip="BundleParametros.v20.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec6.validatorV201.validate}"/>
                                                <webuijsf:staticText id="campoV201Texto1"
                                                    binding="#{LogImpHogEec6.campoV201Texto1}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['v20']}"/>
                                                <webuijsf:message id="messageV201"
                                                    for="campoV201"/>
                                                <webuijsf:helpInline id="helpInlineV201"
                                                    binding="#{LogImpHogEec6.helpInlineV201}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.v20.log_imp_hog_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridV211"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec6.labelV211}"
                                                    id="labelV211"
                                                    for="campoV211"
                                                    text="v21"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridV212"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoV211"
                                                    binding="#{LogImpHogEec6.campoV211}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHogEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['v21']}"
                                                    toolTip="BundleParametros.v21.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec6.validatorV211.validate}"/>
                                                <webuijsf:staticText id="campoV211Texto1"
                                                    binding="#{LogImpHogEec6.campoV211Texto1}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['v21']}"/>
                                                <webuijsf:message id="messageV211"
                                                    for="campoV211"/>
                                                <webuijsf:helpInline id="helpInlineV211"
                                                    binding="#{LogImpHogEec6.helpInlineV211}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.v21.log_imp_hog_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridV221"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec6.labelV221}"
                                                    id="labelV221"
                                                    for="campoV221"
                                                    text="v22"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridV222"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoV221"
                                                    binding="#{LogImpHogEec6.campoV221}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHogEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['v22']}"
                                                    toolTip="BundleParametros.v22.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec6.validatorV221.validate}"/>
                                                <webuijsf:staticText id="campoV221Texto1"
                                                    binding="#{LogImpHogEec6.campoV221Texto1}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['v22']}"/>
                                                <webuijsf:message id="messageV221"
                                                    for="campoV221"/>
                                                <webuijsf:helpInline id="helpInlineV221"
                                                    binding="#{LogImpHogEec6.helpInlineV221}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.v22.log_imp_hog_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridV231"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec6.labelV231}"
                                                    id="labelV231"
                                                    for="campoV231"
                                                    text="v23"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridV232"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoV231"
                                                    binding="#{LogImpHogEec6.campoV231}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHogEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['v23']}"
                                                    toolTip="BundleParametros.v23.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec6.validatorV231.validate}"/>
                                                <webuijsf:staticText id="campoV231Texto1"
                                                    binding="#{LogImpHogEec6.campoV231Texto1}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['v23']}"/>
                                                <webuijsf:message id="messageV231"
                                                    for="campoV231"/>
                                                <webuijsf:helpInline id="helpInlineV231"
                                                    binding="#{LogImpHogEec6.helpInlineV231}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.v23.log_imp_hog_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridV241"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec6.labelV241}"
                                                    id="labelV241"
                                                    for="campoV241"
                                                    text="v24"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridV242"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoV241"
                                                    binding="#{LogImpHogEec6.campoV241}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHogEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['v24']}"
                                                    toolTip="BundleParametros.v24.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec6.validatorV241.validate}"/>
                                                <webuijsf:staticText id="campoV241Texto1"
                                                    binding="#{LogImpHogEec6.campoV241Texto1}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['v24']}"/>
                                                <webuijsf:message id="messageV241"
                                                    for="campoV241"/>
                                                <webuijsf:helpInline id="helpInlineV241"
                                                    binding="#{LogImpHogEec6.helpInlineV241}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.v24.log_imp_hog_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridV251"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec6.labelV251}"
                                                    id="labelV251"
                                                    for="campoV251"
                                                    text="v25"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridV252"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoV251"
                                                    binding="#{LogImpHogEec6.campoV251}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHogEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['v25']}"
                                                    toolTip="BundleParametros.v25.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec6.validatorV251.validate}"/>
                                                <webuijsf:staticText id="campoV251Texto1"
                                                    binding="#{LogImpHogEec6.campoV251Texto1}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['v25']}"/>
                                                <webuijsf:message id="messageV251"
                                                    for="campoV251"/>
                                                <webuijsf:helpInline id="helpInlineV251"
                                                    binding="#{LogImpHogEec6.helpInlineV251}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.v25.log_imp_hog_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridV261"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec6.labelV261}"
                                                    id="labelV261"
                                                    for="campoV261"
                                                    text="v26"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridV262"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoV261"
                                                    binding="#{LogImpHogEec6.campoV261}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHogEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['v26']}"
                                                    toolTip="BundleParametros.v26.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec6.validatorV261.validate}"/>
                                                <webuijsf:staticText id="campoV261Texto1"
                                                    binding="#{LogImpHogEec6.campoV261Texto1}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['v26']}"/>
                                                <webuijsf:message id="messageV261"
                                                    for="campoV261"/>
                                                <webuijsf:helpInline id="helpInlineV261"
                                                    binding="#{LogImpHogEec6.helpInlineV261}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.v26.log_imp_hog_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridV26espCelular1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec6.labelV26espCelular1}"
                                                    id="labelV26espCelular1"
                                                    for="campoV26espCelular1"
                                                    text="v26esp celular"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridV26espCelular2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoV26espCelular1"
                                                    binding="#{LogImpHogEec6.campoV26espCelular1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHogEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['v26esp_celular']}"
                                                    toolTip="BundleParametros.v26esp_celular.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec6.validatorV26espCelular1.validate}"/>
                                                <webuijsf:staticText id="campoV26espCelular1Texto1"
                                                    binding="#{LogImpHogEec6.campoV26espCelular1Texto1}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['v26esp_celular']}"/>
                                                <webuijsf:message id="messageV26espCelular1"
                                                    for="campoV26espCelular1"/>
                                                <webuijsf:helpInline id="helpInlineV26espCelular1"
                                                    binding="#{LogImpHogEec6.helpInlineV26espCelular1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.v26esp_celular.log_imp_hog_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridV271"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec6.labelV271}"
                                                    id="labelV271"
                                                    for="campoV271"
                                                    text="v27"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridV272"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoV271"
                                                    binding="#{LogImpHogEec6.campoV271}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHogEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['v27']}"
                                                    toolTip="BundleParametros.v27.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec6.validatorV271.validate}"/>
                                                <webuijsf:staticText id="campoV271Texto1"
                                                    binding="#{LogImpHogEec6.campoV271Texto1}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['v27']}"/>
                                                <webuijsf:message id="messageV271"
                                                    for="campoV271"/>
                                                <webuijsf:helpInline id="helpInlineV271"
                                                    binding="#{LogImpHogEec6.helpInlineV271}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.v27.log_imp_hog_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridV27espLinea1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec6.labelV27espLinea1}"
                                                    id="labelV27espLinea1"
                                                    for="campoV27espLinea1"
                                                    text="v27esp linea"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridV27espLinea2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoV27espLinea1"
                                                    binding="#{LogImpHogEec6.campoV27espLinea1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHogEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['v27esp_linea']}"
                                                    toolTip="BundleParametros.v27esp_linea.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec6.validatorV27espLinea1.validate}"/>
                                                <webuijsf:staticText id="campoV27espLinea1Texto1"
                                                    binding="#{LogImpHogEec6.campoV27espLinea1Texto1}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['v27esp_linea']}"/>
                                                <webuijsf:message id="messageV27espLinea1"
                                                    for="campoV27espLinea1"/>
                                                <webuijsf:helpInline id="helpInlineV27espLinea1"
                                                    binding="#{LogImpHogEec6.helpInlineV27espLinea1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.v27esp_linea.log_imp_hog_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridV2811"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec6.labelV2811}"
                                                    id="labelV2811"
                                                    for="campoV2811"
                                                    text="v28 1"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridV2812"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoV2811"
                                                    binding="#{LogImpHogEec6.campoV2811}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHogEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['v28_1']}"
                                                    toolTip="BundleParametros.v28_1.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec6.validatorV2811.validate}"/>
                                                <webuijsf:staticText id="campoV2811Texto1"
                                                    binding="#{LogImpHogEec6.campoV2811Texto1}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['v28_1']}"/>
                                                <webuijsf:message id="messageV2811"
                                                    for="campoV2811"/>
                                                <webuijsf:helpInline id="helpInlineV2811"
                                                    binding="#{LogImpHogEec6.helpInlineV2811}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.v28_1.log_imp_hog_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridV2821"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec6.labelV2821}"
                                                    id="labelV2821"
                                                    for="campoV2821"
                                                    text="v28 2"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridV2822"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoV2821"
                                                    binding="#{LogImpHogEec6.campoV2821}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHogEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['v28_2']}"
                                                    toolTip="BundleParametros.v28_2.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec6.validatorV2821.validate}"/>
                                                <webuijsf:staticText id="campoV2821Texto1"
                                                    binding="#{LogImpHogEec6.campoV2821Texto1}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['v28_2']}"/>
                                                <webuijsf:message id="messageV2821"
                                                    for="campoV2821"/>
                                                <webuijsf:helpInline id="helpInlineV2821"
                                                    binding="#{LogImpHogEec6.helpInlineV2821}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.v28_2.log_imp_hog_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridV2831"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec6.labelV2831}"
                                                    id="labelV2831"
                                                    for="campoV2831"
                                                    text="v28 3"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridV2832"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoV2831"
                                                    binding="#{LogImpHogEec6.campoV2831}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHogEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['v28_3']}"
                                                    toolTip="BundleParametros.v28_3.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec6.validatorV2831.validate}"/>
                                                <webuijsf:staticText id="campoV2831Texto1"
                                                    binding="#{LogImpHogEec6.campoV2831Texto1}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['v28_3']}"/>
                                                <webuijsf:message id="messageV2831"
                                                    for="campoV2831"/>
                                                <webuijsf:helpInline id="helpInlineV2831"
                                                    binding="#{LogImpHogEec6.helpInlineV2831}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.v28_3.log_imp_hog_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridV2841"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec6.labelV2841}"
                                                    id="labelV2841"
                                                    for="campoV2841"
                                                    text="v28 4"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridV2842"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoV2841"
                                                    binding="#{LogImpHogEec6.campoV2841}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHogEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['v28_4']}"
                                                    toolTip="BundleParametros.v28_4.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec6.validatorV2841.validate}"/>
                                                <webuijsf:staticText id="campoV2841Texto1"
                                                    binding="#{LogImpHogEec6.campoV2841Texto1}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['v28_4']}"/>
                                                <webuijsf:message id="messageV2841"
                                                    for="campoV2841"/>
                                                <webuijsf:helpInline id="helpInlineV2841"
                                                    binding="#{LogImpHogEec6.helpInlineV2841}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.v28_4.log_imp_hog_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridV2851"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec6.labelV2851}"
                                                    id="labelV2851"
                                                    for="campoV2851"
                                                    text="v28 5"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridV2852"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoV2851"
                                                    binding="#{LogImpHogEec6.campoV2851}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHogEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['v28_5']}"
                                                    toolTip="BundleParametros.v28_5.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec6.validatorV2851.validate}"/>
                                                <webuijsf:staticText id="campoV2851Texto1"
                                                    binding="#{LogImpHogEec6.campoV2851Texto1}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['v28_5']}"/>
                                                <webuijsf:message id="messageV2851"
                                                    for="campoV2851"/>
                                                <webuijsf:helpInline id="helpInlineV2851"
                                                    binding="#{LogImpHogEec6.helpInlineV2851}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.v28_5.log_imp_hog_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridV2861"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec6.labelV2861}"
                                                    id="labelV2861"
                                                    for="campoV2861"
                                                    text="v28 6"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridV2862"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoV2861"
                                                    binding="#{LogImpHogEec6.campoV2861}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHogEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['v28_6']}"
                                                    toolTip="BundleParametros.v28_6.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec6.validatorV2861.validate}"/>
                                                <webuijsf:staticText id="campoV2861Texto1"
                                                    binding="#{LogImpHogEec6.campoV2861Texto1}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['v28_6']}"/>
                                                <webuijsf:message id="messageV2861"
                                                    for="campoV2861"/>
                                                <webuijsf:helpInline id="helpInlineV2861"
                                                    binding="#{LogImpHogEec6.helpInlineV2861}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.v28_6.log_imp_hog_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridV2871"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec6.labelV2871}"
                                                    id="labelV2871"
                                                    for="campoV2871"
                                                    text="v28 7"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridV2872"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoV2871"
                                                    binding="#{LogImpHogEec6.campoV2871}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHogEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['v28_7']}"
                                                    toolTip="BundleParametros.v28_7.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec6.validatorV2871.validate}"/>
                                                <webuijsf:staticText id="campoV2871Texto1"
                                                    binding="#{LogImpHogEec6.campoV2871Texto1}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['v28_7']}"/>
                                                <webuijsf:message id="messageV2871"
                                                    for="campoV2871"/>
                                                <webuijsf:helpInline id="helpInlineV2871"
                                                    binding="#{LogImpHogEec6.helpInlineV2871}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.v28_7.log_imp_hog_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridV2881"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec6.labelV2881}"
                                                    id="labelV2881"
                                                    for="campoV2881"
                                                    text="v28 8"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridV2882"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoV2881"
                                                    binding="#{LogImpHogEec6.campoV2881}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHogEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['v28_8']}"
                                                    toolTip="BundleParametros.v28_8.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec6.validatorV2881.validate}"/>
                                                <webuijsf:staticText id="campoV2881Texto1"
                                                    binding="#{LogImpHogEec6.campoV2881Texto1}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['v28_8']}"/>
                                                <webuijsf:message id="messageV2881"
                                                    for="campoV2881"/>
                                                <webuijsf:helpInline id="helpInlineV2881"
                                                    binding="#{LogImpHogEec6.helpInlineV2881}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.v28_8.log_imp_hog_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridV29nombreJefe1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec6.labelV29nombreJefe1}"
                                                    id="labelV29nombreJefe1"
                                                    for="campoV29nombreJefe1"
                                                    text="v29nombre jefe"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridV29nombreJefe2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoV29nombreJefe1"
                                                    binding="#{LogImpHogEec6.campoV29nombreJefe1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHogEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['v29nombre_jefe']}"
                                                    toolTip="BundleParametros.v29nombre_jefe.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec6.validatorV29nombreJefe1.validate}"/>
                                                <webuijsf:staticText id="campoV29nombreJefe1Texto1"
                                                    binding="#{LogImpHogEec6.campoV29nombreJefe1Texto1}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['v29nombre_jefe']}"/>
                                                <webuijsf:message id="messageV29nombreJefe1"
                                                    for="campoV29nombreJefe1"/>
                                                <webuijsf:helpInline id="helpInlineV29nombreJefe1"
                                                    binding="#{LogImpHogEec6.helpInlineV29nombreJefe1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.v29nombre_jefe.log_imp_hog_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridCedulajefe1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec6.labelCedulajefe1}"
                                                    id="labelCedulajefe1"
                                                    for="campoCedulajefe1"
                                                    text="cedulajefe"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridCedulajefe2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoCedulajefe1"
                                                    binding="#{LogImpHogEec6.campoCedulajefe1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHogEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['cedulajefe']}"
                                                    toolTip="BundleParametros.cedulajefe.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec6.validatorCedulajefe1.validate}"/>
                                                <webuijsf:staticText id="campoCedulajefe1Texto1"
                                                    binding="#{LogImpHogEec6.campoCedulajefe1Texto1}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['cedulajefe']}"/>
                                                <webuijsf:message id="messageCedulajefe1"
                                                    for="campoCedulajefe1"/>
                                                <webuijsf:helpInline id="helpInlineCedulajefe1"
                                                    binding="#{LogImpHogEec6.helpInlineCedulajefe1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.cedulajefe.log_imp_hog_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridVar000011"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec6.labelVar000011}"
                                                    id="labelVar000011"
                                                    for="campoVar000011"
                                                    text="var00001"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridVar000012"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoVar000011"
                                                    binding="#{LogImpHogEec6.campoVar000011}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHogEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['var00001']}"
                                                    toolTip="BundleParametros.var00001.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec6.validatorVar000011.validate}"/>
                                                <webuijsf:staticText id="campoVar000011Texto1"
                                                    binding="#{LogImpHogEec6.campoVar000011Texto1}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['var00001']}"/>
                                                <webuijsf:message id="messageVar000011"
                                                    for="campoVar000011"/>
                                                <webuijsf:helpInline id="helpInlineVar000011"
                                                    binding="#{LogImpHogEec6.helpInlineVar000011}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.var00001.log_imp_hog_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsImportado1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec6.labelEsImportado1}"
                                                    id="labelEsImportado1"
                                                    for="listaEsImportado1"
                                                    text="importado"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsImportado2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsImportado1"
                                                    binding="#{LogImpHogEec6.listaEsImportado1}"
                                                    converter="#{LogImpHogEec6.converterEsImportado1}"
                                                    disabled="#{LogImpHogEec6.gestor.filaNoProcesada}" required="true"
                                                    items="#{LogImpHogEec6.asistente.opcionesListaEsImportado1}"
                                                    selected="#{LogImpHogEec6.logImpHogEecDataProvider.value['es_importado']}"
                                                    toolTip="BundleParametros.es_importado.log_imp_hog_eec"/>
                                                <webuijsf:staticText id="listaEsImportado1Texto1"
                                                    binding="#{LogImpHogEec6.listaEsImportado1Texto1}"/>
                                                <webuijsf:message id="messageEsImportado1"
                                                    for="listaEsImportado1"/>
                                                <webuijsf:helpInline id="helpInlineEsImportado1"
                                                    binding="#{LogImpHogEec6.helpInlineEsImportado1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_importado.log_imp_hog_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridObservacion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec6.labelObservacion1}"
                                                    id="labelObservacion1"
                                                    for="campoObservacion1"
                                                    text="observaci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridObservacion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoObservacion1"
                                                    binding="#{LogImpHogEec6.campoObservacion1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHogEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['observacion']}"
                                                    toolTip="BundleParametros.observacion.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec6.validatorObservacion1.validate}"/>
                                                <webuijsf:staticText id="campoObservacion1Texto1"
                                                    binding="#{LogImpHogEec6.campoObservacion1Texto1}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['observacion']}"/>
                                                <webuijsf:message id="messageObservacion1"
                                                    for="campoObservacion1"/>
                                                <webuijsf:helpInline id="helpInlineObservacion1"
                                                    binding="#{LogImpHogEec6.helpInlineObservacion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.observacion.log_imp_hog_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaHoraTransaccion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec6.labelFechaHoraTransaccion1}"
                                                    id="labelFechaHoraTransaccion1"
                                                    for="campoFechaHoraTransaccion1"
                                                    text="fecha hora transacci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaHoraTransaccion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoFechaHoraTransaccion1"
                                                    binding="#{LogImpHogEec6.campoFechaHoraTransaccion1}"
                                                    converter="#{LogImpHogEec6.converterFechaHoraTransaccion1}"
                                                    readOnly="#{LogImpHogEec6.gestor.filaNoProcesada}" required="true"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['fecha_hora_transaccion']}"
                                                    toolTip="BundleParametros.fecha_hora_transaccion.log_imp_hog_eec"/>
                                                <webuijsf:staticText id="campoFechaHoraTransaccion1Texto1"
                                                    binding="#{LogImpHogEec6.campoFechaHoraTransaccion1Texto1}"
                                                    converter="#{LogImpHogEec6.converterFechaHoraTransaccion1}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['fecha_hora_transaccion']}"/>
                                                <webuijsf:message id="messageFechaHoraTransaccion1"
                                                    for="campoFechaHoraTransaccion1"/>
                                                <webuijsf:helpInline id="helpInlineFechaHoraTransaccion1"
                                                    binding="#{LogImpHogEec6.helpInlineFechaHoraTransaccion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_hora_transaccion.log_imp_hog_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNombreArchivo1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec6.labelNombreArchivo1}"
                                                    id="labelNombreArchivo1"
                                                    for="campoNombreArchivo1"
                                                    text="nombre archivo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNombreArchivo2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoNombreArchivo1"
                                                    binding="#{LogImpHogEec6.campoNombreArchivo1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHogEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['nombre_archivo']}"
                                                    toolTip="BundleParametros.nombre_archivo.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec6.validatorNombreArchivo1.validate}"/>
                                                <webuijsf:staticText id="campoNombreArchivo1Texto1"
                                                    binding="#{LogImpHogEec6.campoNombreArchivo1Texto1}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['nombre_archivo']}"/>
                                                <webuijsf:button id="campoNombreArchivo1Boton3"
                                                    binding="#{LogImpHogEec6.campoNombreArchivo1Boton3}"
                                                    onClick="#{LogImpHogEec6.asistente.scriptCampoNombreArchivo1Boton3}"
                                                    rendered="#{LogImpHogEec6.asistente.campoNombreArchivo1Boton3Rendered}"
                                                    text="#{LogImpHogEec6.asistente.textCampoNombreArchivo1Boton3}"
                                                    toolTip="#{LogImpHogEec6.asistente.toolTipCampoNombreArchivo1Boton3}"/>
                                                <webuijsf:message id="messageNombreArchivo1"
                                                    for="campoNombreArchivo1"/>
                                                <webuijsf:helpInline id="helpInlineNombreArchivo1"
                                                    binding="#{LogImpHogEec6.helpInlineNombreArchivo1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.nombre_archivo.log_imp_hog_eec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridCodigoArchivo1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHogEec6.labelCodigoArchivo1}"
                                                    id="labelCodigoArchivo1"
                                                    for="campoCodigoArchivo1"
                                                    text="c&#243;digo archivo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridCodigoArchivo2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoCodigoArchivo1"
                                                    binding="#{LogImpHogEec6.campoCodigoArchivo1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHogEec6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['codigo_archivo']}"
                                                    toolTip="BundleParametros.codigo_archivo.log_imp_hog_eec"
                                                    validatorExpression="#{LogImpHogEec6.validatorCodigoArchivo1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoArchivo1Texto1"
                                                    binding="#{LogImpHogEec6.campoCodigoArchivo1Texto1}"
                                                    text="#{LogImpHogEec6.logImpHogEecDataProvider.value['codigo_archivo']}"/>
                                                <webuijsf:message id="messageCodigoArchivo1"
                                                    for="campoCodigoArchivo1"/>
                                                <webuijsf:helpInline id="helpInlineCodigoArchivo1"
                                                    binding="#{LogImpHogEec6.helpInlineCodigoArchivo1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.codigo_archivo.log_imp_hog_eec"
                                                    type="field"/>
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
                                                        actionExpression="#{LogImpHogEec6.botonIrAlPrimero2_action}"
                                                        binding="#{LogImpHogEec6.botonIrAlPrimero2}"
                                                        disabled="#{LogImpHogEec6.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero2"
                                                        imageURL="#{LogImpHogEec6.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{LogImpHogEec6.gestor.scriptIrAlPrimero}"
                                                        text="#{LogImpHogEec6.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{LogImpHogEec6.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpHogEec6.botonIrAlAnterior2_action}"
                                                        binding="#{LogImpHogEec6.botonIrAlAnterior2}"
                                                        disabled="#{LogImpHogEec6.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior2"
                                                        imageURL="#{LogImpHogEec6.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{LogImpHogEec6.gestor.scriptIrAlAnterior}"
                                                        text="#{LogImpHogEec6.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{LogImpHogEec6.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpHogEec6.botonIrAlSiguiente2_action}"
                                                        binding="#{LogImpHogEec6.botonIrAlSiguiente2}"
                                                        disabled="#{LogImpHogEec6.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente2"
                                                        imageURL="#{LogImpHogEec6.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{LogImpHogEec6.gestor.scriptIrAlSiguiente}"
                                                        text="#{LogImpHogEec6.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{LogImpHogEec6.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpHogEec6.botonIrAlUltimo2_action}"
                                                        binding="#{LogImpHogEec6.botonIrAlUltimo2}"
                                                        disabled="#{LogImpHogEec6.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo2"
                                                        imageURL="#{LogImpHogEec6.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{LogImpHogEec6.gestor.scriptIrAlUltimo}"
                                                        text="#{LogImpHogEec6.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{LogImpHogEec6.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpHogEec6.botonProcesarFila2_action}"
                                                        binding="#{LogImpHogEec6.botonProcesarFila2}"
                                                        disabled="#{LogImpHogEec6.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila2"
                                                        imageURL="#{LogImpHogEec6.gestor.urlImagenProcesar}"
                                                        onClick="#{LogImpHogEec6.scriptAbrirVentanaProcesarFila2}"
                                                        rendered="#{LogImpHogEec6.asistente.comandoDisponible}"
                                                        text="#{LogImpHogEec6.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{LogImpHogEec6.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{LogImpHogEec6.gestor.mensajeCambiosPorConfirmar}"/>
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
                                                    actionExpression="#{LogImpHogEec6.botonAgregar1_action}"
                                                    binding="#{LogImpHogEec6.botonAgregar1}"
                                                    disabled="#{LogImpHogEec6.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{LogImpHogEec6.gestor.scriptAgregar}"
                                                    rendered="#{LogImpHogEec6.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpHogEec6.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{LogImpHogEec6.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{LogImpHogEec6.listaFuncionEdicion1}"
                                                    converter="#{LogImpHogEec6.converterListaFuncionEdicion1}"
                                                    disabled="#{LogImpHogEec6.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{LogImpHogEec6.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{LogImpHogEec6.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{LogImpHogEec6.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{LogImpHogEec6.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpHogEec6.botonEditar1_action}"
                                                    binding="#{LogImpHogEec6.botonEditar1}"
                                                    disabled="#{LogImpHogEec6.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{LogImpHogEec6.gestor.scriptEditar}"
                                                    rendered="#{LogImpHogEec6.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpHogEec6.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{LogImpHogEec6.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpHogEec6.botonEliminar1_action}"
                                                    binding="#{LogImpHogEec6.botonEliminar1}"
                                                    disabled="#{LogImpHogEec6.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{LogImpHogEec6.gestor.scriptEliminar}"
                                                    rendered="#{LogImpHogEec6.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpHogEec6.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{LogImpHogEec6.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpHogEec6.botonAplicar1_action}"
                                                    binding="#{LogImpHogEec6.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{LogImpHogEec6.gestor.scriptAplicar}"
                                                    rendered="#{LogImpHogEec6.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpHogEec6.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{LogImpHogEec6.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpHogEec6.botonDeshacer1_action}"
                                                    binding="#{LogImpHogEec6.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{LogImpHogEec6.gestor.scriptDeshacer}"
                                                    rendered="#{LogImpHogEec6.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpHogEec6.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{LogImpHogEec6.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpHogEec6.botonConfirmar1_action}"
                                                    binding="#{LogImpHogEec6.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{LogImpHogEec6.gestor.scriptConfirmar}"
                                                    rendered="#{LogImpHogEec6.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpHogEec6.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{LogImpHogEec6.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpHogEec6.botonDescartar1_action}"
                                                    binding="#{LogImpHogEec6.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{LogImpHogEec6.gestor.scriptDescartar}"
                                                    rendered="#{LogImpHogEec6.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpHogEec6.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{LogImpHogEec6.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{LogImpHogEec6.listaFuncionAccion1}"
                                                    converter="#{LogImpHogEec6.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{LogImpHogEec6.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{LogImpHogEec6.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{LogImpHogEec6.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{LogImpHogEec6.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpHogEec6.botonProcesar1_action}"
                                                    binding="#{LogImpHogEec6.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{LogImpHogEec6.gestor.scriptProcesar}"
                                                    rendered="#{LogImpHogEec6.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpHogEec6.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{LogImpHogEec6.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpHogEec6.botonRefrescar1_action}"
                                                    binding="#{LogImpHogEec6.botonRefrescar1}"
                                                    disabled="#{LogImpHogEec6.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{LogImpHogEec6.gestor.scriptRefrescar}"
                                                    rendered="#{LogImpHogEec6.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpHogEec6.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{LogImpHogEec6.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpHogEec6.botonReconsultar1_action}"
                                                    binding="#{LogImpHogEec6.botonReconsultar1}"
                                                    disabled="#{LogImpHogEec6.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{LogImpHogEec6.gestor.scriptReconsultar}"
                                                    rendered="#{LogImpHogEec6.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpHogEec6.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{LogImpHogEec6.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpHogEec6.botonRetornar1_action}"
                                                    binding="#{LogImpHogEec6.botonRetornar1}"
                                                    disabled="#{LogImpHogEec6.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{LogImpHogEec6.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{LogImpHogEec6.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpHogEec6.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{LogImpHogEec6.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel125"
                                                rendered="#{LogImpHogEec6.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{LogImpHogEec6.imageHyperlink1_action}"
                                                    binding="#{LogImpHogEec6.imageHyperlink1}"
                                                    disabled="#{LogImpHogEec6.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{LogImpHogEec6.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{LogImpHogEec6.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{LogImpHogEec6.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.LogImpHogEec6_imageHyperlink1_toolTip}"/>
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
