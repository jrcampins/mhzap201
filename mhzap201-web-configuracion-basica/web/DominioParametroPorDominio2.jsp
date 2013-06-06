<?xml version="1.0" encoding="UTF-8"?>
<!--
   Copyright (C) 2008, EGT Consultores, C.A.
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
                    focus="#{DominioParametroPorDominio2.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{DominioParametroPorDominio2.gestor.preserveFocus}"
                    preserveScroll="#{DominioParametroPorDominio2.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{DominioParametroPorDominio2.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | campoIdDominioParametro1 campoIdParametro1 listaNumeroTipoParametroDom1 campoEtiquetaParametro1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | | , virtualForm3 | listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{DominioParametroPorDominio2.breadcrumbs1}" 
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
                                                    rendered="#{DominioParametroPorDominio2.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{DominioParametroPorDominio2.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{DominioParametroPorDominio2.gestor.mensajeDisponible}"
                                                    text="#{DominioParametroPorDominio2.gestor.mensaje}"
                                                    url="#{DominioParametroPorDominio2.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            id="gridPanel104"
                                            rendered="#{DominioParametroPorDominio2.gestor.filaDisponible}"
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
                                                        actionExpression="#{DominioParametroPorDominio2.botonIrAlPrimero1_action}"
                                                        binding="#{DominioParametroPorDominio2.botonIrAlPrimero1}"
                                                        disabled="#{DominioParametroPorDominio2.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero1"
                                                        imageURL="#{DominioParametroPorDominio2.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{DominioParametroPorDominio2.gestor.scriptIrAlPrimero}"
                                                        text="#{DominioParametroPorDominio2.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{DominioParametroPorDominio2.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{DominioParametroPorDominio2.botonIrAlAnterior1_action}"
                                                        binding="#{DominioParametroPorDominio2.botonIrAlAnterior1}"
                                                        disabled="#{DominioParametroPorDominio2.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior1"
                                                        imageURL="#{DominioParametroPorDominio2.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{DominioParametroPorDominio2.gestor.scriptIrAlAnterior}"
                                                        text="#{DominioParametroPorDominio2.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{DominioParametroPorDominio2.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{DominioParametroPorDominio2.botonIrAlSiguiente1_action}"
                                                        binding="#{DominioParametroPorDominio2.botonIrAlSiguiente1}"
                                                        disabled="#{DominioParametroPorDominio2.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente1"
                                                        imageURL="#{DominioParametroPorDominio2.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{DominioParametroPorDominio2.gestor.scriptIrAlSiguiente}"
                                                        text="#{DominioParametroPorDominio2.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{DominioParametroPorDominio2.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{DominioParametroPorDominio2.botonIrAlUltimo1_action}"
                                                        binding="#{DominioParametroPorDominio2.botonIrAlUltimo1}"
                                                        disabled="#{DominioParametroPorDominio2.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo1"
                                                        imageURL="#{DominioParametroPorDominio2.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{DominioParametroPorDominio2.gestor.scriptIrAlUltimo}"
                                                        text="#{DominioParametroPorDominio2.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{DominioParametroPorDominio2.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{DominioParametroPorDominio2.botonProcesarFila1_action}"
                                                        binding="#{DominioParametroPorDominio2.botonProcesarFila1}"
                                                        disabled="#{DominioParametroPorDominio2.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila1"
                                                        imageURL="#{DominioParametroPorDominio2.gestor.urlImagenProcesar}"
                                                        onClick="#{DominioParametroPorDominio2.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{DominioParametroPorDominio2.asistente.comandoDisponible}"
                                                        text="#{DominioParametroPorDominio2.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{DominioParametroPorDominio2.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{DominioParametroPorDominio2.gestor.tituloConsulta}"/>
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
                                                    binding="#{DominioParametroPorDominio2.etiquetaIdentificacionFila1}"
                                                    id="etiquetaIdentificacionFila1"
                                                    text="#{DominioParametroPorDominio2.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{DominioParametroPorDominio2.gestor.i18n.toolTipEtiquetaIdentificacionFila}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel113"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoIdentificacionFila1"
                                                    style="font-weight: bold"
                                                    text="#{DominioParametroPorDominio2.gestor.identificacionFila}"/>
                                                <webuijsf:image
                                                    id="imagenFilaProcesada1"
                                                    toolTip="#{DominioParametroPorDominio2.gestor.toolTipImagenFilaProcesada}"
                                                    url="#{DominioParametroPorDominio2.gestor.urlImagenFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPanel114"
                                                rendered="#{DominioParametroPorDominio2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{DominioParametroPorDominio2.labelIdDominio1}"
                                                    id="labelIdDominio1"
                                                    text="dominio"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel115"
                                                rendered="#{DominioParametroPorDominio2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoDenominacionFilaMaestro1"
                                                    style="font-weight: bold"
                                                    text="#{DominioParametroPorDominio2.gestor.denominacionFilaMaestro}"/>
                                                <webuijsf:image
                                                    id="imagenFilaMaestro1"
                                                    url="#{DominioParametroPorDominio2.gestor.urlImagenMaestroFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdDominioParametro1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{DominioParametroPorDominio2.labelIdDominioParametro1}"
                                                    id="labelIdDominioParametro1"
                                                    for="campoIdDominioParametro1"
                                                    toolTip="BundleParametros.id_dominio_parametro.dominio_parametro"
                                                    text="identificaci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdDominioParametro2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdDominioParametro1"
                                                    binding="#{DominioParametroPorDominio2.campoIdDominioParametro1}"
                                                    converter="#{DominioParametroPorDominio2.converterIdDominioParametro1}"
                                                    readOnly="#{DominioParametroPorDominio2.gestor.filaNoProcesada}" required="true"
                                                    text="#{DominioParametroPorDominio2.dominioParametroDataProvider.value['id_dominio_parametro']}"
                                                    toolTip="BundleParametros.id_dominio_parametro.dominio_parametro"
                                                    validatorExpression="#{DominioParametroPorDominio2.validatorIdDominioParametro1.validate}"/>
                                                <webuijsf:staticText id="campoIdDominioParametro1Texto1"
                                                    binding="#{DominioParametroPorDominio2.campoIdDominioParametro1Texto1}"
                                                    text="#{DominioParametroPorDominio2.dominioParametroDataProvider.value['id_dominio_parametro']}"/>
                                                <webuijsf:message id="messageIdDominioParametro1"
                                                    for="campoIdDominioParametro1"/>
                                                <webuijsf:helpInline id="helpInlineIdDominioParametro1"
                                                    binding="#{DominioParametroPorDominio2.helpInlineIdDominioParametro1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_dominio_parametro.dominio_parametro"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdParametro1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{DominioParametroPorDominio2.labelIdParametro1}"
                                                    id="labelIdParametro1"
                                                    for="campoIdParametro1"
                                                    toolTip="BundleParametros.id_parametro.dominio_parametro"
                                                    text="parametro"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdParametro2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdParametro1"
                                                    binding="#{DominioParametroPorDominio2.campoIdParametro1}"
                                                    readOnly="#{DominioParametroPorDominio2.gestor.filaNoProcesada}" required="true"
                                                    text="#{DominioParametroPorDominio2.asistente.textoCampoIdParametro1}"
                                                    toolTip="#{DominioParametroPorDominio2.asistente.toolTipCampoIdParametro1}"
                                                    validatorExpression="#{DominioParametroPorDominio2.campoIdParametro1_validate}"/>
                                                <webuijsf:staticText id="campoIdParametro1Texto1"
                                                    binding="#{DominioParametroPorDominio2.campoIdParametro1Texto1}"
                                                    text="#{DominioParametroPorDominio2.dominioParametroDataProvider.value['codigo_parametro_1x2y3']}"/>
                                                <webuijsf:button id="campoIdParametro1Boton1"
                                                    binding="#{DominioParametroPorDominio2.campoIdParametro1Boton1}"
                                                    onClick="#{DominioParametroPorDominio2.asistente.scriptCampoIdParametro1Boton1}"/>
                                                <webuijsf:button id="campoIdParametro1Boton3"
                                                    binding="#{DominioParametroPorDominio2.campoIdParametro1Boton3}"
                                                    onClick="#{DominioParametroPorDominio2.asistente.scriptCampoIdParametro1Boton2}"
                                                    rendered="#{DominioParametroPorDominio2.asistente.campoIdParametro1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdParametro1"
                                                    for="campoIdParametro1"/>
                                                <webuijsf:helpInline id="helpInlineIdParametro1"
                                                    binding="#{DominioParametroPorDominio2.helpInlineIdParametro1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_parametro.dominio_parametro"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdParametro3"
                                                rendered="#{DominioParametroPorDominio2.asistente.campoIdParametro1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{DominioParametroPorDominio2.labelIdParametro2}"
                                                    id="labelIdParametro2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre parametro"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdParametro4"
                                                rendered="#{DominioParametroPorDominio2.asistente.campoIdParametro1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{DominioParametroPorDominio2.campoIdParametro1Texto2}"
                                                    text="#{DominioParametroPorDominio2.dominioParametroDataProvider.value['nombre_parametro_1x2y4']}"
                                                    id="campoIdParametro1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{DominioParametroPorDominio2.campoIdParametro1Boton2}"
                                                    id="campoIdParametro1Boton2"
                                                    onClick="#{DominioParametroPorDominio2.asistente.scriptCampoIdParametro1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroTipoParametroDom1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{DominioParametroPorDominio2.labelNumeroTipoParametroDom1}"
                                                    id="labelNumeroTipoParametroDom1"
                                                    for="listaNumeroTipoParametroDom1"
                                                    toolTip="BundleParametros.numero_tipo_parametro_dom.dominio_parametro"
                                                    text="tipo parametro dom"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTipoParametroDom2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroTipoParametroDom1"
                                                    binding="#{DominioParametroPorDominio2.listaNumeroTipoParametroDom1}"
                                                    converter="#{DominioParametroPorDominio2.converterNumeroTipoParametroDom1}"
                                                    disabled="#{DominioParametroPorDominio2.gestor.filaNoProcesada}" required="true"
                                                    items="#{DominioParametroPorDominio2.asistente.opcionesListaNumeroTipoParametroDom1}"
                                                    selected="#{DominioParametroPorDominio2.dominioParametroDataProvider.value['numero_tipo_parametro_dom']}"
                                                    toolTip="BundleParametros.numero_tipo_parametro_dom.dominio_parametro"/>
                                                <webuijsf:staticText id="listaNumeroTipoParametroDom1Texto1"
                                                    binding="#{DominioParametroPorDominio2.listaNumeroTipoParametroDom1Texto1}"
                                                    text="#{DominioParametroPorDominio2.dominioParametroDataProvider.value['codigo_tipo_parametro_do_1x3y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoParametroDom1"
                                                    for="listaNumeroTipoParametroDom1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTipoParametroDom1"
                                                    binding="#{DominioParametroPorDominio2.helpInlineNumeroTipoParametroDom1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_tipo_parametro_dom.dominio_parametro"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEtiquetaParametro1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{DominioParametroPorDominio2.labelEtiquetaParametro1}"
                                                    id="labelEtiquetaParametro1"
                                                    for="campoEtiquetaParametro1"
                                                    toolTip="BundleParametros.etiqueta_parametro.dominio_parametro"
                                                    text="etiqueta parametro"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEtiquetaParametro2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoEtiquetaParametro1"
                                                    binding="#{DominioParametroPorDominio2.campoEtiquetaParametro1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{DominioParametroPorDominio2.gestor.filaNoProcesada}"
                                                    text="#{DominioParametroPorDominio2.dominioParametroDataProvider.value['etiqueta_parametro']}"
                                                    toolTip="BundleParametros.etiqueta_parametro.dominio_parametro"
                                                    validatorExpression="#{DominioParametroPorDominio2.validatorEtiquetaParametro1.validate}"/>
                                                <webuijsf:staticText id="campoEtiquetaParametro1Texto1"
                                                    binding="#{DominioParametroPorDominio2.campoEtiquetaParametro1Texto1}"
                                                    text="#{DominioParametroPorDominio2.dominioParametroDataProvider.value['etiqueta_parametro']}"/>
                                                <webuijsf:message id="messageEtiquetaParametro1"
                                                    for="campoEtiquetaParametro1"/>
                                                <webuijsf:helpInline id="helpInlineEtiquetaParametro1"
                                                    binding="#{DominioParametroPorDominio2.helpInlineEtiquetaParametro1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.etiqueta_parametro.dominio_parametro"
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
                                                        actionExpression="#{DominioParametroPorDominio2.botonIrAlPrimero2_action}"
                                                        binding="#{DominioParametroPorDominio2.botonIrAlPrimero2}"
                                                        disabled="#{DominioParametroPorDominio2.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero2"
                                                        imageURL="#{DominioParametroPorDominio2.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{DominioParametroPorDominio2.gestor.scriptIrAlPrimero}"
                                                        text="#{DominioParametroPorDominio2.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{DominioParametroPorDominio2.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{DominioParametroPorDominio2.botonIrAlAnterior2_action}"
                                                        binding="#{DominioParametroPorDominio2.botonIrAlAnterior2}"
                                                        disabled="#{DominioParametroPorDominio2.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior2"
                                                        imageURL="#{DominioParametroPorDominio2.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{DominioParametroPorDominio2.gestor.scriptIrAlAnterior}"
                                                        text="#{DominioParametroPorDominio2.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{DominioParametroPorDominio2.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{DominioParametroPorDominio2.botonIrAlSiguiente2_action}"
                                                        binding="#{DominioParametroPorDominio2.botonIrAlSiguiente2}"
                                                        disabled="#{DominioParametroPorDominio2.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente2"
                                                        imageURL="#{DominioParametroPorDominio2.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{DominioParametroPorDominio2.gestor.scriptIrAlSiguiente}"
                                                        text="#{DominioParametroPorDominio2.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{DominioParametroPorDominio2.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{DominioParametroPorDominio2.botonIrAlUltimo2_action}"
                                                        binding="#{DominioParametroPorDominio2.botonIrAlUltimo2}"
                                                        disabled="#{DominioParametroPorDominio2.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo2"
                                                        imageURL="#{DominioParametroPorDominio2.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{DominioParametroPorDominio2.gestor.scriptIrAlUltimo}"
                                                        text="#{DominioParametroPorDominio2.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{DominioParametroPorDominio2.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{DominioParametroPorDominio2.botonProcesarFila2_action}"
                                                        binding="#{DominioParametroPorDominio2.botonProcesarFila2}"
                                                        disabled="#{DominioParametroPorDominio2.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila2"
                                                        imageURL="#{DominioParametroPorDominio2.gestor.urlImagenProcesar}"
                                                        onClick="#{DominioParametroPorDominio2.scriptAbrirVentanaProcesarFila2}"
                                                        rendered="#{DominioParametroPorDominio2.asistente.comandoDisponible}"
                                                        text="#{DominioParametroPorDominio2.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{DominioParametroPorDominio2.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{DominioParametroPorDominio2.gestor.mensajeCambiosPorConfirmar}"/>
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
                                                    actionExpression="#{DominioParametroPorDominio2.botonAgregar1_action}"
                                                    binding="#{DominioParametroPorDominio2.botonAgregar1}"
                                                    disabled="#{DominioParametroPorDominio2.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{DominioParametroPorDominio2.gestor.scriptAgregar}"
                                                    rendered="#{DominioParametroPorDominio2.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{DominioParametroPorDominio2.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{DominioParametroPorDominio2.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{DominioParametroPorDominio2.listaFuncionEdicion1}"
                                                    converter="#{DominioParametroPorDominio2.converterListaFuncionEdicion1}"
                                                    disabled="#{DominioParametroPorDominio2.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{DominioParametroPorDominio2.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{DominioParametroPorDominio2.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{DominioParametroPorDominio2.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{DominioParametroPorDominio2.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{DominioParametroPorDominio2.botonEditar1_action}"
                                                    binding="#{DominioParametroPorDominio2.botonEditar1}"
                                                    disabled="#{DominioParametroPorDominio2.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{DominioParametroPorDominio2.gestor.scriptEditar}"
                                                    rendered="#{DominioParametroPorDominio2.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{DominioParametroPorDominio2.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{DominioParametroPorDominio2.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{DominioParametroPorDominio2.botonEliminar1_action}"
                                                    binding="#{DominioParametroPorDominio2.botonEliminar1}"
                                                    disabled="#{DominioParametroPorDominio2.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{DominioParametroPorDominio2.gestor.scriptEliminar}"
                                                    rendered="#{DominioParametroPorDominio2.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{DominioParametroPorDominio2.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{DominioParametroPorDominio2.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{DominioParametroPorDominio2.botonAplicar1_action}"
                                                    binding="#{DominioParametroPorDominio2.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{DominioParametroPorDominio2.gestor.scriptAplicar}"
                                                    rendered="#{DominioParametroPorDominio2.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{DominioParametroPorDominio2.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{DominioParametroPorDominio2.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{DominioParametroPorDominio2.botonDeshacer1_action}"
                                                    binding="#{DominioParametroPorDominio2.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{DominioParametroPorDominio2.gestor.scriptDeshacer}"
                                                    rendered="#{DominioParametroPorDominio2.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{DominioParametroPorDominio2.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{DominioParametroPorDominio2.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{DominioParametroPorDominio2.botonConfirmar1_action}"
                                                    binding="#{DominioParametroPorDominio2.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{DominioParametroPorDominio2.gestor.scriptConfirmar}"
                                                    rendered="#{DominioParametroPorDominio2.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{DominioParametroPorDominio2.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{DominioParametroPorDominio2.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{DominioParametroPorDominio2.botonDescartar1_action}"
                                                    binding="#{DominioParametroPorDominio2.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{DominioParametroPorDominio2.gestor.scriptDescartar}"
                                                    rendered="#{DominioParametroPorDominio2.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{DominioParametroPorDominio2.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{DominioParametroPorDominio2.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{DominioParametroPorDominio2.listaFuncionAccion1}"
                                                    converter="#{DominioParametroPorDominio2.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{DominioParametroPorDominio2.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{DominioParametroPorDominio2.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{DominioParametroPorDominio2.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{DominioParametroPorDominio2.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{DominioParametroPorDominio2.botonProcesar1_action}"
                                                    binding="#{DominioParametroPorDominio2.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{DominioParametroPorDominio2.gestor.scriptProcesar}"
                                                    rendered="#{DominioParametroPorDominio2.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{DominioParametroPorDominio2.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{DominioParametroPorDominio2.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{DominioParametroPorDominio2.botonRefrescar1_action}"
                                                    binding="#{DominioParametroPorDominio2.botonRefrescar1}"
                                                    disabled="#{DominioParametroPorDominio2.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{DominioParametroPorDominio2.gestor.scriptRefrescar}"
                                                    rendered="#{DominioParametroPorDominio2.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{DominioParametroPorDominio2.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{DominioParametroPorDominio2.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{DominioParametroPorDominio2.botonReconsultar1_action}"
                                                    binding="#{DominioParametroPorDominio2.botonReconsultar1}"
                                                    disabled="#{DominioParametroPorDominio2.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{DominioParametroPorDominio2.gestor.scriptReconsultar}"
                                                    rendered="#{DominioParametroPorDominio2.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{DominioParametroPorDominio2.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{DominioParametroPorDominio2.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{DominioParametroPorDominio2.botonRetornar1_action}"
                                                    binding="#{DominioParametroPorDominio2.botonRetornar1}"
                                                    disabled="#{DominioParametroPorDominio2.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{DominioParametroPorDominio2.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{DominioParametroPorDominio2.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{DominioParametroPorDominio2.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{DominioParametroPorDominio2.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel125"
                                                rendered="#{DominioParametroPorDominio2.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{DominioParametroPorDominio2.imageHyperlink1_action}"
                                                    binding="#{DominioParametroPorDominio2.imageHyperlink1}"
                                                    disabled="#{DominioParametroPorDominio2.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{DominioParametroPorDominio2.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{DominioParametroPorDominio2.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{DominioParametroPorDominio2.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.DominioParametroPorDominio2_imageHyperlink1_toolTip}"/>
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
