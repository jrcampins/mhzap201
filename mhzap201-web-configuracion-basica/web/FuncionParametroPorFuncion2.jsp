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
                    focus="#{FuncionParametroPorFuncion2.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{FuncionParametroPorFuncion2.gestor.preserveFocus}"
                    preserveScroll="#{FuncionParametroPorFuncion2.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{FuncionParametroPorFuncion2.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | campoIdFuncionParametro1 campoIdParametro1 listaNumeroTipoParametro1 listaNumeroTipoComparacion1 campoIdFuncionReferencia1 listaNumeroTipoValor1 campoIdListaValor1 campoIdClaseObjetoValor1 campoIdClaseRecursoValor1 campoValorMinimo1 campoValorMaximo1 campoValorOmision1 listaEsParametroSinRastro1 listaEsParametroSegmento1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | | , virtualForm3 | listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{FuncionParametroPorFuncion2.breadcrumbs1}" 
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
                                                    rendered="#{FuncionParametroPorFuncion2.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{FuncionParametroPorFuncion2.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{FuncionParametroPorFuncion2.gestor.mensajeDisponible}"
                                                    text="#{FuncionParametroPorFuncion2.gestor.mensaje}"
                                                    url="#{FuncionParametroPorFuncion2.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            id="gridPanel104"
                                            rendered="#{FuncionParametroPorFuncion2.gestor.filaDisponible}"
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
                                                        actionExpression="#{FuncionParametroPorFuncion2.botonIrAlPrimero1_action}"
                                                        binding="#{FuncionParametroPorFuncion2.botonIrAlPrimero1}"
                                                        disabled="#{FuncionParametroPorFuncion2.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero1"
                                                        imageURL="#{FuncionParametroPorFuncion2.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{FuncionParametroPorFuncion2.gestor.scriptIrAlPrimero}"
                                                        text="#{FuncionParametroPorFuncion2.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{FuncionParametroPorFuncion2.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{FuncionParametroPorFuncion2.botonIrAlAnterior1_action}"
                                                        binding="#{FuncionParametroPorFuncion2.botonIrAlAnterior1}"
                                                        disabled="#{FuncionParametroPorFuncion2.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior1"
                                                        imageURL="#{FuncionParametroPorFuncion2.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{FuncionParametroPorFuncion2.gestor.scriptIrAlAnterior}"
                                                        text="#{FuncionParametroPorFuncion2.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{FuncionParametroPorFuncion2.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{FuncionParametroPorFuncion2.botonIrAlSiguiente1_action}"
                                                        binding="#{FuncionParametroPorFuncion2.botonIrAlSiguiente1}"
                                                        disabled="#{FuncionParametroPorFuncion2.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente1"
                                                        imageURL="#{FuncionParametroPorFuncion2.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{FuncionParametroPorFuncion2.gestor.scriptIrAlSiguiente}"
                                                        text="#{FuncionParametroPorFuncion2.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{FuncionParametroPorFuncion2.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{FuncionParametroPorFuncion2.botonIrAlUltimo1_action}"
                                                        binding="#{FuncionParametroPorFuncion2.botonIrAlUltimo1}"
                                                        disabled="#{FuncionParametroPorFuncion2.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo1"
                                                        imageURL="#{FuncionParametroPorFuncion2.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{FuncionParametroPorFuncion2.gestor.scriptIrAlUltimo}"
                                                        text="#{FuncionParametroPorFuncion2.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{FuncionParametroPorFuncion2.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{FuncionParametroPorFuncion2.botonProcesarFila1_action}"
                                                        binding="#{FuncionParametroPorFuncion2.botonProcesarFila1}"
                                                        disabled="#{FuncionParametroPorFuncion2.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila1"
                                                        imageURL="#{FuncionParametroPorFuncion2.gestor.urlImagenProcesar}"
                                                        onClick="#{FuncionParametroPorFuncion2.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{FuncionParametroPorFuncion2.asistente.comandoDisponible}"
                                                        text="#{FuncionParametroPorFuncion2.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{FuncionParametroPorFuncion2.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{FuncionParametroPorFuncion2.gestor.tituloConsulta}"/>
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
                                                    binding="#{FuncionParametroPorFuncion2.etiquetaIdentificacionFila1}"
                                                    id="etiquetaIdentificacionFila1"
                                                    text="#{FuncionParametroPorFuncion2.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{FuncionParametroPorFuncion2.gestor.i18n.toolTipEtiquetaIdentificacionFila}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel113"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoIdentificacionFila1"
                                                    style="font-weight: bold"
                                                    text="#{FuncionParametroPorFuncion2.gestor.identificacionFila}"/>
                                                <webuijsf:image
                                                    id="imagenFilaProcesada1"
                                                    toolTip="#{FuncionParametroPorFuncion2.gestor.toolTipImagenFilaProcesada}"
                                                    url="#{FuncionParametroPorFuncion2.gestor.urlImagenFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPanel114"
                                                rendered="#{FuncionParametroPorFuncion2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FuncionParametroPorFuncion2.labelIdFuncion1}"
                                                    id="labelIdFuncion1"
                                                    text="funci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel115"
                                                rendered="#{FuncionParametroPorFuncion2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoDenominacionFilaMaestro1"
                                                    style="font-weight: bold"
                                                    text="#{FuncionParametroPorFuncion2.gestor.denominacionFilaMaestro}"/>
                                                <webuijsf:image
                                                    id="imagenFilaMaestro1"
                                                    url="#{FuncionParametroPorFuncion2.gestor.urlImagenMaestroFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdFuncionParametro1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FuncionParametroPorFuncion2.labelIdFuncionParametro1}"
                                                    id="labelIdFuncionParametro1"
                                                    for="campoIdFuncionParametro1"
                                                    toolTip="BundleParametros.id_funcion_parametro.funcion_parametro"
                                                    text="identificaci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdFuncionParametro2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdFuncionParametro1"
                                                    binding="#{FuncionParametroPorFuncion2.campoIdFuncionParametro1}"
                                                    converter="#{FuncionParametroPorFuncion2.converterIdFuncionParametro1}"
                                                    readOnly="#{FuncionParametroPorFuncion2.gestor.filaNoProcesada}" required="true"
                                                    text="#{FuncionParametroPorFuncion2.funcionParametroDataProvider.value['id_funcion_parametro']}"
                                                    toolTip="BundleParametros.id_funcion_parametro.funcion_parametro"
                                                    validatorExpression="#{FuncionParametroPorFuncion2.validatorIdFuncionParametro1.validate}"/>
                                                <webuijsf:staticText id="campoIdFuncionParametro1Texto1"
                                                    binding="#{FuncionParametroPorFuncion2.campoIdFuncionParametro1Texto1}"
                                                    text="#{FuncionParametroPorFuncion2.funcionParametroDataProvider.value['id_funcion_parametro']}"/>
                                                <webuijsf:message id="messageIdFuncionParametro1"
                                                    for="campoIdFuncionParametro1"/>
                                                <webuijsf:helpInline id="helpInlineIdFuncionParametro1"
                                                    binding="#{FuncionParametroPorFuncion2.helpInlineIdFuncionParametro1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_funcion_parametro.funcion_parametro"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdParametro1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FuncionParametroPorFuncion2.labelIdParametro1}"
                                                    id="labelIdParametro1"
                                                    for="campoIdParametro1"
                                                    toolTip="BundleParametros.id_parametro.funcion_parametro"
                                                    text="parametro"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdParametro2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdParametro1"
                                                    binding="#{FuncionParametroPorFuncion2.campoIdParametro1}"
                                                    readOnly="#{FuncionParametroPorFuncion2.gestor.filaNoProcesada}" required="true"
                                                    text="#{FuncionParametroPorFuncion2.asistente.textoCampoIdParametro1}"
                                                    toolTip="#{FuncionParametroPorFuncion2.asistente.toolTipCampoIdParametro1}"
                                                    validatorExpression="#{FuncionParametroPorFuncion2.campoIdParametro1_validate}"/>
                                                <webuijsf:staticText id="campoIdParametro1Texto1"
                                                    binding="#{FuncionParametroPorFuncion2.campoIdParametro1Texto1}"
                                                    text="#{FuncionParametroPorFuncion2.funcionParametroDataProvider.value['codigo_parametro_1x2y3']}"/>
                                                <webuijsf:button id="campoIdParametro1Boton1"
                                                    binding="#{FuncionParametroPorFuncion2.campoIdParametro1Boton1}"
                                                    onClick="#{FuncionParametroPorFuncion2.asistente.scriptCampoIdParametro1Boton1}"/>
                                                <webuijsf:button id="campoIdParametro1Boton3"
                                                    binding="#{FuncionParametroPorFuncion2.campoIdParametro1Boton3}"
                                                    onClick="#{FuncionParametroPorFuncion2.asistente.scriptCampoIdParametro1Boton2}"
                                                    rendered="#{FuncionParametroPorFuncion2.asistente.campoIdParametro1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdParametro1"
                                                    for="campoIdParametro1"/>
                                                <webuijsf:helpInline id="helpInlineIdParametro1"
                                                    binding="#{FuncionParametroPorFuncion2.helpInlineIdParametro1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_parametro.funcion_parametro"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdParametro3"
                                                rendered="#{FuncionParametroPorFuncion2.asistente.campoIdParametro1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FuncionParametroPorFuncion2.labelIdParametro2}"
                                                    id="labelIdParametro2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre parametro"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdParametro4"
                                                rendered="#{FuncionParametroPorFuncion2.asistente.campoIdParametro1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{FuncionParametroPorFuncion2.campoIdParametro1Texto2}"
                                                    text="#{FuncionParametroPorFuncion2.funcionParametroDataProvider.value['nombre_parametro_1x2y4']}"
                                                    id="campoIdParametro1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{FuncionParametroPorFuncion2.campoIdParametro1Boton2}"
                                                    id="campoIdParametro1Boton2"
                                                    onClick="#{FuncionParametroPorFuncion2.asistente.scriptCampoIdParametro1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroTipoParametro1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FuncionParametroPorFuncion2.labelNumeroTipoParametro1}"
                                                    id="labelNumeroTipoParametro1"
                                                    for="listaNumeroTipoParametro1"
                                                    toolTip="BundleParametros.numero_tipo_parametro.funcion_parametro"
                                                    text="tipo parametro"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTipoParametro2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroTipoParametro1"
                                                    binding="#{FuncionParametroPorFuncion2.listaNumeroTipoParametro1}"
                                                    converter="#{FuncionParametroPorFuncion2.converterNumeroTipoParametro1}"
                                                    disabled="#{FuncionParametroPorFuncion2.gestor.filaNoProcesada}" required="true"
                                                    items="#{FuncionParametroPorFuncion2.asistente.opcionesListaNumeroTipoParametro1}"
                                                    selected="#{FuncionParametroPorFuncion2.funcionParametroDataProvider.value['numero_tipo_parametro']}"
                                                    toolTip="BundleParametros.numero_tipo_parametro.funcion_parametro"/>
                                                <webuijsf:staticText id="listaNumeroTipoParametro1Texto1"
                                                    binding="#{FuncionParametroPorFuncion2.listaNumeroTipoParametro1Texto1}"
                                                    text="#{FuncionParametroPorFuncion2.funcionParametroDataProvider.value['codigo_tipo_parametro_1x3y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoParametro1"
                                                    for="listaNumeroTipoParametro1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTipoParametro1"
                                                    binding="#{FuncionParametroPorFuncion2.helpInlineNumeroTipoParametro1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_tipo_parametro.funcion_parametro"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroTipoComparacion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FuncionParametroPorFuncion2.labelNumeroTipoComparacion1}"
                                                    id="labelNumeroTipoComparacion1"
                                                    for="listaNumeroTipoComparacion1"
                                                    toolTip="BundleParametros.numero_tipo_comparacion.funcion_parametro"
                                                    text="tipo comparaci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTipoComparacion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroTipoComparacion1"
                                                    binding="#{FuncionParametroPorFuncion2.listaNumeroTipoComparacion1}"
                                                    converter="#{FuncionParametroPorFuncion2.converterNumeroTipoComparacion1}"
                                                    disabled="#{FuncionParametroPorFuncion2.gestor.filaNoProcesada}"
                                                    items="#{FuncionParametroPorFuncion2.asistente.opcionesListaNumeroTipoComparacion1}"
                                                    selected="#{FuncionParametroPorFuncion2.funcionParametroDataProvider.value['numero_tipo_comparacion']}"
                                                    toolTip="BundleParametros.numero_tipo_comparacion.funcion_parametro"/>
                                                <webuijsf:staticText id="listaNumeroTipoComparacion1Texto1"
                                                    binding="#{FuncionParametroPorFuncion2.listaNumeroTipoComparacion1Texto1}"
                                                    text="#{FuncionParametroPorFuncion2.funcionParametroDataProvider.value['codigo_tipo_comparacion_1x4y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoComparacion1"
                                                    for="listaNumeroTipoComparacion1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTipoComparacion1"
                                                    binding="#{FuncionParametroPorFuncion2.helpInlineNumeroTipoComparacion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_tipo_comparacion.funcion_parametro"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdFuncionReferencia1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FuncionParametroPorFuncion2.labelIdFuncionReferencia1}"
                                                    id="labelIdFuncionReferencia1"
                                                    for="campoIdFuncionReferencia1"
                                                    toolTip="BundleParametros.id_funcion_referencia.funcion_parametro"
                                                    text="funci&#243;n referencia"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdFuncionReferencia2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdFuncionReferencia1"
                                                    binding="#{FuncionParametroPorFuncion2.campoIdFuncionReferencia1}"
                                                    readOnly="#{FuncionParametroPorFuncion2.gestor.filaNoProcesada}"
                                                    text="#{FuncionParametroPorFuncion2.asistente.textoCampoIdFuncionReferencia1}"
                                                    toolTip="#{FuncionParametroPorFuncion2.asistente.toolTipCampoIdFuncionReferencia1}"
                                                    validatorExpression="#{FuncionParametroPorFuncion2.campoIdFuncionReferencia1_validate}"/>
                                                <webuijsf:staticText id="campoIdFuncionReferencia1Texto1"
                                                    binding="#{FuncionParametroPorFuncion2.campoIdFuncionReferencia1Texto1}"
                                                    text="#{FuncionParametroPorFuncion2.funcionParametroDataProvider.value['codigo_funcion_1x5y3']}"/>
                                                <webuijsf:button id="campoIdFuncionReferencia1Boton1"
                                                    binding="#{FuncionParametroPorFuncion2.campoIdFuncionReferencia1Boton1}"
                                                    onClick="#{FuncionParametroPorFuncion2.asistente.scriptCampoIdFuncionReferencia1Boton1}"/>
                                                <webuijsf:button id="campoIdFuncionReferencia1Boton3"
                                                    binding="#{FuncionParametroPorFuncion2.campoIdFuncionReferencia1Boton3}"
                                                    onClick="#{FuncionParametroPorFuncion2.asistente.scriptCampoIdFuncionReferencia1Boton2}"
                                                    rendered="#{FuncionParametroPorFuncion2.asistente.campoIdFuncionReferencia1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdFuncionReferencia1"
                                                    for="campoIdFuncionReferencia1"/>
                                                <webuijsf:helpInline id="helpInlineIdFuncionReferencia1"
                                                    binding="#{FuncionParametroPorFuncion2.helpInlineIdFuncionReferencia1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_funcion_referencia.funcion_parametro"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdFuncionReferencia3"
                                                rendered="#{FuncionParametroPorFuncion2.asistente.campoIdFuncionReferencia1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FuncionParametroPorFuncion2.labelIdFuncionReferencia2}"
                                                    id="labelIdFuncionReferencia2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre funci&#243;n referencia"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdFuncionReferencia4"
                                                rendered="#{FuncionParametroPorFuncion2.asistente.campoIdFuncionReferencia1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{FuncionParametroPorFuncion2.campoIdFuncionReferencia1Texto2}"
                                                    text="#{FuncionParametroPorFuncion2.funcionParametroDataProvider.value['nombre_funcion_1x5y4']}"
                                                    id="campoIdFuncionReferencia1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{FuncionParametroPorFuncion2.campoIdFuncionReferencia1Boton2}"
                                                    id="campoIdFuncionReferencia1Boton2"
                                                    onClick="#{FuncionParametroPorFuncion2.asistente.scriptCampoIdFuncionReferencia1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroTipoValor1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FuncionParametroPorFuncion2.labelNumeroTipoValor1}"
                                                    id="labelNumeroTipoValor1"
                                                    for="listaNumeroTipoValor1"
                                                    toolTip="BundleParametros.numero_tipo_valor.funcion_parametro"
                                                    text="tipo valor"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTipoValor2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroTipoValor1"
                                                    binding="#{FuncionParametroPorFuncion2.listaNumeroTipoValor1}"
                                                    converter="#{FuncionParametroPorFuncion2.converterNumeroTipoValor1}"
                                                    disabled="#{FuncionParametroPorFuncion2.gestor.filaNoProcesada}" required="true"
                                                    items="#{FuncionParametroPorFuncion2.asistente.opcionesListaNumeroTipoValor1}"
                                                    selected="#{FuncionParametroPorFuncion2.funcionParametroDataProvider.value['numero_tipo_valor']}"
                                                    toolTip="BundleParametros.numero_tipo_valor.funcion_parametro"/>
                                                <webuijsf:staticText id="listaNumeroTipoValor1Texto1"
                                                    binding="#{FuncionParametroPorFuncion2.listaNumeroTipoValor1Texto1}"
                                                    text="#{FuncionParametroPorFuncion2.funcionParametroDataProvider.value['codigo_tipo_valor_1x6y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoValor1"
                                                    for="listaNumeroTipoValor1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTipoValor1"
                                                    binding="#{FuncionParametroPorFuncion2.helpInlineNumeroTipoValor1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_tipo_valor.funcion_parametro"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdListaValor1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FuncionParametroPorFuncion2.labelIdListaValor1}"
                                                    id="labelIdListaValor1"
                                                    for="campoIdListaValor1"
                                                    toolTip="BundleParametros.id_lista_valor.funcion_parametro"
                                                    text="identificaci&#243;n lista valor"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdListaValor2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdListaValor1"
                                                    binding="#{FuncionParametroPorFuncion2.campoIdListaValor1}"
                                                    converter="#{FuncionParametroPorFuncion2.converterIdListaValor1}"
                                                    readOnly="#{FuncionParametroPorFuncion2.gestor.filaNoProcesada}"
                                                    text="#{FuncionParametroPorFuncion2.funcionParametroDataProvider.value['id_lista_valor']}"
                                                    toolTip="BundleParametros.id_lista_valor.funcion_parametro"
                                                    validatorExpression="#{FuncionParametroPorFuncion2.validatorIdListaValor1.validate}"/>
                                                <webuijsf:staticText id="campoIdListaValor1Texto1"
                                                    binding="#{FuncionParametroPorFuncion2.campoIdListaValor1Texto1}"
                                                    text="#{FuncionParametroPorFuncion2.funcionParametroDataProvider.value['id_lista_valor']}"/>
                                                <webuijsf:message id="messageIdListaValor1"
                                                    for="campoIdListaValor1"/>
                                                <webuijsf:helpInline id="helpInlineIdListaValor1"
                                                    binding="#{FuncionParametroPorFuncion2.helpInlineIdListaValor1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_lista_valor.funcion_parametro"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdClaseObjetoValor1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FuncionParametroPorFuncion2.labelIdClaseObjetoValor1}"
                                                    id="labelIdClaseObjetoValor1"
                                                    for="campoIdClaseObjetoValor1"
                                                    toolTip="BundleParametros.id_clase_objeto_valor.funcion_parametro"
                                                    text="identificaci&#243;n clase objeto valor"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdClaseObjetoValor2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdClaseObjetoValor1"
                                                    binding="#{FuncionParametroPorFuncion2.campoIdClaseObjetoValor1}"
                                                    converter="#{FuncionParametroPorFuncion2.converterIdClaseObjetoValor1}"
                                                    readOnly="#{FuncionParametroPorFuncion2.gestor.filaNoProcesada}"
                                                    text="#{FuncionParametroPorFuncion2.funcionParametroDataProvider.value['id_clase_objeto_valor']}"
                                                    toolTip="BundleParametros.id_clase_objeto_valor.funcion_parametro"
                                                    validatorExpression="#{FuncionParametroPorFuncion2.validatorIdClaseObjetoValor1.validate}"/>
                                                <webuijsf:staticText id="campoIdClaseObjetoValor1Texto1"
                                                    binding="#{FuncionParametroPorFuncion2.campoIdClaseObjetoValor1Texto1}"
                                                    text="#{FuncionParametroPorFuncion2.funcionParametroDataProvider.value['id_clase_objeto_valor']}"/>
                                                <webuijsf:message id="messageIdClaseObjetoValor1"
                                                    for="campoIdClaseObjetoValor1"/>
                                                <webuijsf:helpInline id="helpInlineIdClaseObjetoValor1"
                                                    binding="#{FuncionParametroPorFuncion2.helpInlineIdClaseObjetoValor1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_clase_objeto_valor.funcion_parametro"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdClaseRecursoValor1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FuncionParametroPorFuncion2.labelIdClaseRecursoValor1}"
                                                    id="labelIdClaseRecursoValor1"
                                                    for="campoIdClaseRecursoValor1"
                                                    toolTip="BundleParametros.id_clase_recurso_valor.funcion_parametro"
                                                    text="clase recurso valor"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdClaseRecursoValor2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdClaseRecursoValor1"
                                                    binding="#{FuncionParametroPorFuncion2.campoIdClaseRecursoValor1}"
                                                    readOnly="#{FuncionParametroPorFuncion2.gestor.filaNoProcesada}"
                                                    text="#{FuncionParametroPorFuncion2.asistente.textoCampoIdClaseRecursoValor1}"
                                                    toolTip="#{FuncionParametroPorFuncion2.asistente.toolTipCampoIdClaseRecursoValor1}"
                                                    validatorExpression="#{FuncionParametroPorFuncion2.campoIdClaseRecursoValor1_validate}"/>
                                                <webuijsf:staticText id="campoIdClaseRecursoValor1Texto1"
                                                    binding="#{FuncionParametroPorFuncion2.campoIdClaseRecursoValor1Texto1}"
                                                    text="#{FuncionParametroPorFuncion2.funcionParametroDataProvider.value['codigo_clase_recurso_1x7y3']}"/>
                                                <webuijsf:button id="campoIdClaseRecursoValor1Boton1"
                                                    binding="#{FuncionParametroPorFuncion2.campoIdClaseRecursoValor1Boton1}"
                                                    onClick="#{FuncionParametroPorFuncion2.asistente.scriptCampoIdClaseRecursoValor1Boton1}"/>
                                                <webuijsf:button id="campoIdClaseRecursoValor1Boton3"
                                                    binding="#{FuncionParametroPorFuncion2.campoIdClaseRecursoValor1Boton3}"
                                                    onClick="#{FuncionParametroPorFuncion2.asistente.scriptCampoIdClaseRecursoValor1Boton2}"
                                                    rendered="#{FuncionParametroPorFuncion2.asistente.campoIdClaseRecursoValor1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdClaseRecursoValor1"
                                                    for="campoIdClaseRecursoValor1"/>
                                                <webuijsf:helpInline id="helpInlineIdClaseRecursoValor1"
                                                    binding="#{FuncionParametroPorFuncion2.helpInlineIdClaseRecursoValor1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_clase_recurso_valor.funcion_parametro"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdClaseRecursoValor3"
                                                rendered="#{FuncionParametroPorFuncion2.asistente.campoIdClaseRecursoValor1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FuncionParametroPorFuncion2.labelIdClaseRecursoValor2}"
                                                    id="labelIdClaseRecursoValor2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre clase recurso valor"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdClaseRecursoValor4"
                                                rendered="#{FuncionParametroPorFuncion2.asistente.campoIdClaseRecursoValor1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{FuncionParametroPorFuncion2.campoIdClaseRecursoValor1Texto2}"
                                                    text="#{FuncionParametroPorFuncion2.funcionParametroDataProvider.value['nombre_clase_recurso_1x7y4']}"
                                                    id="campoIdClaseRecursoValor1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{FuncionParametroPorFuncion2.campoIdClaseRecursoValor1Boton2}"
                                                    id="campoIdClaseRecursoValor1Boton2"
                                                    onClick="#{FuncionParametroPorFuncion2.asistente.scriptCampoIdClaseRecursoValor1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridValorMinimo1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FuncionParametroPorFuncion2.labelValorMinimo1}"
                                                    id="labelValorMinimo1"
                                                    for="campoValorMinimo1"
                                                    toolTip="BundleParametros.valor_minimo.funcion_parametro"
                                                    text="valor minimo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridValorMinimo2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoValorMinimo1"
                                                    binding="#{FuncionParametroPorFuncion2.campoValorMinimo1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{FuncionParametroPorFuncion2.gestor.filaNoProcesada}"
                                                    text="#{FuncionParametroPorFuncion2.funcionParametroDataProvider.value['valor_minimo']}"
                                                    toolTip="BundleParametros.valor_minimo.funcion_parametro"
                                                    validatorExpression="#{FuncionParametroPorFuncion2.validatorValorMinimo1.validate}"/>
                                                <webuijsf:staticText id="campoValorMinimo1Texto1"
                                                    binding="#{FuncionParametroPorFuncion2.campoValorMinimo1Texto1}"
                                                    text="#{FuncionParametroPorFuncion2.funcionParametroDataProvider.value['valor_minimo']}"/>
                                                <webuijsf:message id="messageValorMinimo1"
                                                    for="campoValorMinimo1"/>
                                                <webuijsf:helpInline id="helpInlineValorMinimo1"
                                                    binding="#{FuncionParametroPorFuncion2.helpInlineValorMinimo1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.valor_minimo.funcion_parametro"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridValorMaximo1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FuncionParametroPorFuncion2.labelValorMaximo1}"
                                                    id="labelValorMaximo1"
                                                    for="campoValorMaximo1"
                                                    toolTip="BundleParametros.valor_maximo.funcion_parametro"
                                                    text="valor maximo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridValorMaximo2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoValorMaximo1"
                                                    binding="#{FuncionParametroPorFuncion2.campoValorMaximo1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{FuncionParametroPorFuncion2.gestor.filaNoProcesada}"
                                                    text="#{FuncionParametroPorFuncion2.funcionParametroDataProvider.value['valor_maximo']}"
                                                    toolTip="BundleParametros.valor_maximo.funcion_parametro"
                                                    validatorExpression="#{FuncionParametroPorFuncion2.validatorValorMaximo1.validate}"/>
                                                <webuijsf:staticText id="campoValorMaximo1Texto1"
                                                    binding="#{FuncionParametroPorFuncion2.campoValorMaximo1Texto1}"
                                                    text="#{FuncionParametroPorFuncion2.funcionParametroDataProvider.value['valor_maximo']}"/>
                                                <webuijsf:message id="messageValorMaximo1"
                                                    for="campoValorMaximo1"/>
                                                <webuijsf:helpInline id="helpInlineValorMaximo1"
                                                    binding="#{FuncionParametroPorFuncion2.helpInlineValorMaximo1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.valor_maximo.funcion_parametro"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridValorOmision1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FuncionParametroPorFuncion2.labelValorOmision1}"
                                                    id="labelValorOmision1"
                                                    for="campoValorOmision1"
                                                    toolTip="BundleParametros.valor_omision.funcion_parametro"
                                                    text="valor omisi&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridValorOmision2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoValorOmision1"
                                                    binding="#{FuncionParametroPorFuncion2.campoValorOmision1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{FuncionParametroPorFuncion2.gestor.filaNoProcesada}"
                                                    text="#{FuncionParametroPorFuncion2.funcionParametroDataProvider.value['valor_omision']}"
                                                    toolTip="BundleParametros.valor_omision.funcion_parametro"
                                                    validatorExpression="#{FuncionParametroPorFuncion2.validatorValorOmision1.validate}"/>
                                                <webuijsf:staticText id="campoValorOmision1Texto1"
                                                    binding="#{FuncionParametroPorFuncion2.campoValorOmision1Texto1}"
                                                    text="#{FuncionParametroPorFuncion2.funcionParametroDataProvider.value['valor_omision']}"/>
                                                <webuijsf:message id="messageValorOmision1"
                                                    for="campoValorOmision1"/>
                                                <webuijsf:helpInline id="helpInlineValorOmision1"
                                                    binding="#{FuncionParametroPorFuncion2.helpInlineValorOmision1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.valor_omision.funcion_parametro"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsParametroSinRastro1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FuncionParametroPorFuncion2.labelEsParametroSinRastro1}"
                                                    id="labelEsParametroSinRastro1"
                                                    for="listaEsParametroSinRastro1"
                                                    toolTip="BundleParametros.es_parametro_sin_rastro.funcion_parametro"
                                                    text="parametro sin rastro"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsParametroSinRastro2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsParametroSinRastro1"
                                                    binding="#{FuncionParametroPorFuncion2.listaEsParametroSinRastro1}"
                                                    converter="#{FuncionParametroPorFuncion2.converterEsParametroSinRastro1}"
                                                    disabled="#{FuncionParametroPorFuncion2.gestor.filaNoProcesada}" required="true"
                                                    items="#{FuncionParametroPorFuncion2.asistente.opcionesListaEsParametroSinRastro1}"
                                                    selected="#{FuncionParametroPorFuncion2.funcionParametroDataProvider.value['es_parametro_sin_rastro']}"
                                                    toolTip="BundleParametros.es_parametro_sin_rastro.funcion_parametro"/>
                                                <webuijsf:staticText id="listaEsParametroSinRastro1Texto1"
                                                    binding="#{FuncionParametroPorFuncion2.listaEsParametroSinRastro1Texto1}"/>
                                                <webuijsf:message id="messageEsParametroSinRastro1"
                                                    for="listaEsParametroSinRastro1"/>
                                                <webuijsf:helpInline id="helpInlineEsParametroSinRastro1"
                                                    binding="#{FuncionParametroPorFuncion2.helpInlineEsParametroSinRastro1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_parametro_sin_rastro.funcion_parametro"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsParametroSegmento1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FuncionParametroPorFuncion2.labelEsParametroSegmento1}"
                                                    id="labelEsParametroSegmento1"
                                                    for="listaEsParametroSegmento1"
                                                    toolTip="BundleParametros.es_parametro_segmento.funcion_parametro"
                                                    text="parametro segmento"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsParametroSegmento2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsParametroSegmento1"
                                                    binding="#{FuncionParametroPorFuncion2.listaEsParametroSegmento1}"
                                                    converter="#{FuncionParametroPorFuncion2.converterEsParametroSegmento1}"
                                                    disabled="#{FuncionParametroPorFuncion2.gestor.filaNoProcesada}" required="true"
                                                    items="#{FuncionParametroPorFuncion2.asistente.opcionesListaEsParametroSegmento1}"
                                                    selected="#{FuncionParametroPorFuncion2.funcionParametroDataProvider.value['es_parametro_segmento']}"
                                                    toolTip="BundleParametros.es_parametro_segmento.funcion_parametro"/>
                                                <webuijsf:staticText id="listaEsParametroSegmento1Texto1"
                                                    binding="#{FuncionParametroPorFuncion2.listaEsParametroSegmento1Texto1}"/>
                                                <webuijsf:message id="messageEsParametroSegmento1"
                                                    for="listaEsParametroSegmento1"/>
                                                <webuijsf:helpInline id="helpInlineEsParametroSegmento1"
                                                    binding="#{FuncionParametroPorFuncion2.helpInlineEsParametroSegmento1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_parametro_segmento.funcion_parametro"
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
                                                        actionExpression="#{FuncionParametroPorFuncion2.botonIrAlPrimero2_action}"
                                                        binding="#{FuncionParametroPorFuncion2.botonIrAlPrimero2}"
                                                        disabled="#{FuncionParametroPorFuncion2.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero2"
                                                        imageURL="#{FuncionParametroPorFuncion2.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{FuncionParametroPorFuncion2.gestor.scriptIrAlPrimero}"
                                                        text="#{FuncionParametroPorFuncion2.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{FuncionParametroPorFuncion2.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{FuncionParametroPorFuncion2.botonIrAlAnterior2_action}"
                                                        binding="#{FuncionParametroPorFuncion2.botonIrAlAnterior2}"
                                                        disabled="#{FuncionParametroPorFuncion2.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior2"
                                                        imageURL="#{FuncionParametroPorFuncion2.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{FuncionParametroPorFuncion2.gestor.scriptIrAlAnterior}"
                                                        text="#{FuncionParametroPorFuncion2.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{FuncionParametroPorFuncion2.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{FuncionParametroPorFuncion2.botonIrAlSiguiente2_action}"
                                                        binding="#{FuncionParametroPorFuncion2.botonIrAlSiguiente2}"
                                                        disabled="#{FuncionParametroPorFuncion2.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente2"
                                                        imageURL="#{FuncionParametroPorFuncion2.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{FuncionParametroPorFuncion2.gestor.scriptIrAlSiguiente}"
                                                        text="#{FuncionParametroPorFuncion2.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{FuncionParametroPorFuncion2.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{FuncionParametroPorFuncion2.botonIrAlUltimo2_action}"
                                                        binding="#{FuncionParametroPorFuncion2.botonIrAlUltimo2}"
                                                        disabled="#{FuncionParametroPorFuncion2.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo2"
                                                        imageURL="#{FuncionParametroPorFuncion2.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{FuncionParametroPorFuncion2.gestor.scriptIrAlUltimo}"
                                                        text="#{FuncionParametroPorFuncion2.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{FuncionParametroPorFuncion2.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{FuncionParametroPorFuncion2.botonProcesarFila2_action}"
                                                        binding="#{FuncionParametroPorFuncion2.botonProcesarFila2}"
                                                        disabled="#{FuncionParametroPorFuncion2.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila2"
                                                        imageURL="#{FuncionParametroPorFuncion2.gestor.urlImagenProcesar}"
                                                        onClick="#{FuncionParametroPorFuncion2.scriptAbrirVentanaProcesarFila2}"
                                                        rendered="#{FuncionParametroPorFuncion2.asistente.comandoDisponible}"
                                                        text="#{FuncionParametroPorFuncion2.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{FuncionParametroPorFuncion2.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{FuncionParametroPorFuncion2.gestor.mensajeCambiosPorConfirmar}"/>
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
                                                    actionExpression="#{FuncionParametroPorFuncion2.botonAgregar1_action}"
                                                    binding="#{FuncionParametroPorFuncion2.botonAgregar1}"
                                                    disabled="#{FuncionParametroPorFuncion2.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{FuncionParametroPorFuncion2.gestor.scriptAgregar}"
                                                    rendered="#{FuncionParametroPorFuncion2.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FuncionParametroPorFuncion2.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{FuncionParametroPorFuncion2.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{FuncionParametroPorFuncion2.listaFuncionEdicion1}"
                                                    converter="#{FuncionParametroPorFuncion2.converterListaFuncionEdicion1}"
                                                    disabled="#{FuncionParametroPorFuncion2.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{FuncionParametroPorFuncion2.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{FuncionParametroPorFuncion2.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{FuncionParametroPorFuncion2.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{FuncionParametroPorFuncion2.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FuncionParametroPorFuncion2.botonEditar1_action}"
                                                    binding="#{FuncionParametroPorFuncion2.botonEditar1}"
                                                    disabled="#{FuncionParametroPorFuncion2.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{FuncionParametroPorFuncion2.gestor.scriptEditar}"
                                                    rendered="#{FuncionParametroPorFuncion2.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FuncionParametroPorFuncion2.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{FuncionParametroPorFuncion2.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FuncionParametroPorFuncion2.botonEliminar1_action}"
                                                    binding="#{FuncionParametroPorFuncion2.botonEliminar1}"
                                                    disabled="#{FuncionParametroPorFuncion2.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{FuncionParametroPorFuncion2.gestor.scriptEliminar}"
                                                    rendered="#{FuncionParametroPorFuncion2.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FuncionParametroPorFuncion2.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{FuncionParametroPorFuncion2.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FuncionParametroPorFuncion2.botonAplicar1_action}"
                                                    binding="#{FuncionParametroPorFuncion2.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{FuncionParametroPorFuncion2.gestor.scriptAplicar}"
                                                    rendered="#{FuncionParametroPorFuncion2.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FuncionParametroPorFuncion2.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{FuncionParametroPorFuncion2.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FuncionParametroPorFuncion2.botonDeshacer1_action}"
                                                    binding="#{FuncionParametroPorFuncion2.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{FuncionParametroPorFuncion2.gestor.scriptDeshacer}"
                                                    rendered="#{FuncionParametroPorFuncion2.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FuncionParametroPorFuncion2.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{FuncionParametroPorFuncion2.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FuncionParametroPorFuncion2.botonConfirmar1_action}"
                                                    binding="#{FuncionParametroPorFuncion2.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{FuncionParametroPorFuncion2.gestor.scriptConfirmar}"
                                                    rendered="#{FuncionParametroPorFuncion2.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FuncionParametroPorFuncion2.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{FuncionParametroPorFuncion2.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FuncionParametroPorFuncion2.botonDescartar1_action}"
                                                    binding="#{FuncionParametroPorFuncion2.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{FuncionParametroPorFuncion2.gestor.scriptDescartar}"
                                                    rendered="#{FuncionParametroPorFuncion2.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FuncionParametroPorFuncion2.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{FuncionParametroPorFuncion2.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{FuncionParametroPorFuncion2.listaFuncionAccion1}"
                                                    converter="#{FuncionParametroPorFuncion2.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{FuncionParametroPorFuncion2.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{FuncionParametroPorFuncion2.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{FuncionParametroPorFuncion2.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{FuncionParametroPorFuncion2.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FuncionParametroPorFuncion2.botonProcesar1_action}"
                                                    binding="#{FuncionParametroPorFuncion2.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{FuncionParametroPorFuncion2.gestor.scriptProcesar}"
                                                    rendered="#{FuncionParametroPorFuncion2.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FuncionParametroPorFuncion2.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{FuncionParametroPorFuncion2.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FuncionParametroPorFuncion2.botonRefrescar1_action}"
                                                    binding="#{FuncionParametroPorFuncion2.botonRefrescar1}"
                                                    disabled="#{FuncionParametroPorFuncion2.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{FuncionParametroPorFuncion2.gestor.scriptRefrescar}"
                                                    rendered="#{FuncionParametroPorFuncion2.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FuncionParametroPorFuncion2.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{FuncionParametroPorFuncion2.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FuncionParametroPorFuncion2.botonReconsultar1_action}"
                                                    binding="#{FuncionParametroPorFuncion2.botonReconsultar1}"
                                                    disabled="#{FuncionParametroPorFuncion2.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{FuncionParametroPorFuncion2.gestor.scriptReconsultar}"
                                                    rendered="#{FuncionParametroPorFuncion2.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FuncionParametroPorFuncion2.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{FuncionParametroPorFuncion2.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FuncionParametroPorFuncion2.botonRetornar1_action}"
                                                    binding="#{FuncionParametroPorFuncion2.botonRetornar1}"
                                                    disabled="#{FuncionParametroPorFuncion2.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{FuncionParametroPorFuncion2.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{FuncionParametroPorFuncion2.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FuncionParametroPorFuncion2.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{FuncionParametroPorFuncion2.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel125"
                                                rendered="#{FuncionParametroPorFuncion2.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{FuncionParametroPorFuncion2.imageHyperlink1_action}"
                                                    binding="#{FuncionParametroPorFuncion2.imageHyperlink1}"
                                                    disabled="#{FuncionParametroPorFuncion2.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{FuncionParametroPorFuncion2.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{FuncionParametroPorFuncion2.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{FuncionParametroPorFuncion2.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.FuncionParametroPorFuncion2_imageHyperlink1_toolTip}"/>
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
