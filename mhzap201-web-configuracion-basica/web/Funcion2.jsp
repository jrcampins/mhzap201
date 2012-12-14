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
                    focus="#{Funcion2.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{Funcion2.gestor.preserveFocus}"
                    preserveScroll="#{Funcion2.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{Funcion2.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | campoIdFuncion1 campoCodigoFuncion1 campoNombreFuncion1 campoDescripcionFuncion1 listaNumeroTipoFuncion1 listaNumeroTipoRastroFun1 campoIdDominio1 campoClausulaWhere1 campoClausulaOrder1 listaEsPublica1 listaEsProgramatica1 listaEsPersonalizada1 listaEsSegmentada1 campoIdGrupoProceso1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | | , virtualForm3 | listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{Funcion2.breadcrumbs1}" 
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
                                                    rendered="#{Funcion2.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{Funcion2.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{Funcion2.gestor.mensajeDisponible}"
                                                    text="#{Funcion2.gestor.mensaje}"
                                                    url="#{Funcion2.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            id="gridPanel104"
                                            rendered="#{Funcion2.gestor.filaDisponible}"
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
                                                        actionExpression="#{Funcion2.botonIrAlPrimero1_action}"
                                                        binding="#{Funcion2.botonIrAlPrimero1}"
                                                        disabled="#{Funcion2.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero1"
                                                        imageURL="#{Funcion2.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{Funcion2.gestor.scriptIrAlPrimero}"
                                                        text="#{Funcion2.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{Funcion2.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Funcion2.botonIrAlAnterior1_action}"
                                                        binding="#{Funcion2.botonIrAlAnterior1}"
                                                        disabled="#{Funcion2.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior1"
                                                        imageURL="#{Funcion2.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{Funcion2.gestor.scriptIrAlAnterior}"
                                                        text="#{Funcion2.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{Funcion2.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Funcion2.botonIrAlSiguiente1_action}"
                                                        binding="#{Funcion2.botonIrAlSiguiente1}"
                                                        disabled="#{Funcion2.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente1"
                                                        imageURL="#{Funcion2.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{Funcion2.gestor.scriptIrAlSiguiente}"
                                                        text="#{Funcion2.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{Funcion2.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Funcion2.botonIrAlUltimo1_action}"
                                                        binding="#{Funcion2.botonIrAlUltimo1}"
                                                        disabled="#{Funcion2.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo1"
                                                        imageURL="#{Funcion2.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{Funcion2.gestor.scriptIrAlUltimo}"
                                                        text="#{Funcion2.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{Funcion2.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Funcion2.botonProcesarFila1_action}"
                                                        binding="#{Funcion2.botonProcesarFila1}"
                                                        disabled="#{Funcion2.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila1"
                                                        imageURL="#{Funcion2.gestor.urlImagenProcesar}"
                                                        onClick="#{Funcion2.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{Funcion2.asistente.comandoDisponible}"
                                                        text="#{Funcion2.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{Funcion2.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{Funcion2.gestor.tituloConsulta}"/>
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
                                                    binding="#{Funcion2.etiquetaIdentificacionFila1}"
                                                    id="etiquetaIdentificacionFila1"
                                                    text="#{Funcion2.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{Funcion2.gestor.i18n.toolTipEtiquetaIdentificacionFila}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel113"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoIdentificacionFila1"
                                                    style="font-weight: bold"
                                                    text="#{Funcion2.gestor.identificacionFila}"/>
                                                <webuijsf:image
                                                    id="imagenFilaProcesada1"
                                                    toolTip="#{Funcion2.gestor.toolTipImagenFilaProcesada}"
                                                    url="#{Funcion2.gestor.urlImagenFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPanel114"
                                                rendered="#{Funcion2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Funcion2.etiquetaDenominacionFilaMaestro1}"
                                                    id="etiquetaDenominacionFilaMaestro1"
                                                    text="?"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel115"
                                                rendered="#{Funcion2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoDenominacionFilaMaestro1"
                                                    style="font-weight: bold"
                                                    text="#{Funcion2.gestor.denominacionFilaMaestro}"/>
                                                <webuijsf:image
                                                    id="imagenFilaMaestro1"
                                                    url="#{Funcion2.gestor.urlImagenMaestroFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdFuncion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Funcion2.labelIdFuncion1}"
                                                    id="labelIdFuncion1"
                                                    for="campoIdFuncion1"
                                                    text="identificaci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdFuncion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdFuncion1"
                                                    binding="#{Funcion2.campoIdFuncion1}"
                                                    converter="#{Funcion2.converterIdFuncion1}"
                                                    readOnly="#{Funcion2.gestor.filaNoProcesada}" required="true"
                                                    text="#{Funcion2.funcionDataProvider.value['id_funcion']}"
                                                    toolTip="BundleParametros.id_funcion.funcion"
                                                    validatorExpression="#{Funcion2.validatorIdFuncion1.validate}"/>
                                                <webuijsf:staticText id="campoIdFuncion1Texto1"
                                                    binding="#{Funcion2.campoIdFuncion1Texto1}"
                                                    text="#{Funcion2.funcionDataProvider.value['id_funcion']}"/>
                                                <webuijsf:message id="messageIdFuncion1"
                                                    for="campoIdFuncion1"/>
                                                <webuijsf:helpInline id="helpInlineIdFuncion1"
                                                    binding="#{Funcion2.helpInlineIdFuncion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_funcion.funcion"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridCodigoFuncion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Funcion2.labelCodigoFuncion1}"
                                                    id="labelCodigoFuncion1"
                                                    for="campoCodigoFuncion1"
                                                    text="c&#243;digo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridCodigoFuncion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoCodigoFuncion1"
                                                    binding="#{Funcion2.campoCodigoFuncion1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{Funcion2.gestor.filaNoProcesada}" required="true"
                                                    text="#{Funcion2.funcionDataProvider.value['codigo_funcion']}"
                                                    toolTip="BundleParametros.codigo_funcion.funcion"
                                                    validatorExpression="#{Funcion2.validatorCodigoFuncion1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoFuncion1Texto1"
                                                    binding="#{Funcion2.campoCodigoFuncion1Texto1}"
                                                    text="#{Funcion2.funcionDataProvider.value['codigo_funcion']}"/>
                                                <webuijsf:message id="messageCodigoFuncion1"
                                                    for="campoCodigoFuncion1"/>
                                                <webuijsf:helpInline id="helpInlineCodigoFuncion1"
                                                    binding="#{Funcion2.helpInlineCodigoFuncion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.codigo_funcion.funcion"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNombreFuncion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Funcion2.labelNombreFuncion1}"
                                                    id="labelNombreFuncion1"
                                                    for="campoNombreFuncion1"
                                                    text="nombre"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNombreFuncion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNombreFuncion1"
                                                    binding="#{Funcion2.campoNombreFuncion1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{Funcion2.gestor.filaNoProcesada}"
                                                    text="#{Funcion2.funcionDataProvider.value['nombre_funcion']}"
                                                    toolTip="BundleParametros.nombre_funcion.funcion"
                                                    validatorExpression="#{Funcion2.validatorNombreFuncion1.validate}"/>
                                                <webuijsf:staticText id="campoNombreFuncion1Texto1"
                                                    binding="#{Funcion2.campoNombreFuncion1Texto1}"
                                                    text="#{Funcion2.funcionDataProvider.value['nombre_funcion']}"/>
                                                <webuijsf:message id="messageNombreFuncion1"
                                                    for="campoNombreFuncion1"/>
                                                <webuijsf:helpInline id="helpInlineNombreFuncion1"
                                                    binding="#{Funcion2.helpInlineNombreFuncion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.nombre_funcion.funcion"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridDescripcionFuncion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Funcion2.labelDescripcionFuncion1}"
                                                    id="labelDescripcionFuncion1"
                                                    for="campoDescripcionFuncion1"
                                                    text="descripci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridDescripcionFuncion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoDescripcionFuncion1"
                                                    binding="#{Funcion2.campoDescripcionFuncion1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{Funcion2.gestor.filaNoProcesada}"
                                                    text="#{Funcion2.funcionDataProvider.value['descripcion_funcion']}"
                                                    toolTip="BundleParametros.descripcion_funcion.funcion"
                                                    validatorExpression="#{Funcion2.validatorDescripcionFuncion1.validate}"/>
                                                <webuijsf:staticText id="campoDescripcionFuncion1Texto1"
                                                    binding="#{Funcion2.campoDescripcionFuncion1Texto1}"
                                                    text="#{Funcion2.funcionDataProvider.value['descripcion_funcion']}"/>
                                                <webuijsf:message id="messageDescripcionFuncion1"
                                                    for="campoDescripcionFuncion1"/>
                                                <webuijsf:helpInline id="helpInlineDescripcionFuncion1"
                                                    binding="#{Funcion2.helpInlineDescripcionFuncion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.descripcion_funcion.funcion"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroTipoFuncion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Funcion2.labelNumeroTipoFuncion1}"
                                                    id="labelNumeroTipoFuncion1"
                                                    for="listaNumeroTipoFuncion1"
                                                    text="tipo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTipoFuncion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroTipoFuncion1"
                                                    binding="#{Funcion2.listaNumeroTipoFuncion1}"
                                                    converter="#{Funcion2.converterNumeroTipoFuncion1}"
                                                    disabled="#{Funcion2.gestor.filaNoProcesada}" required="true"
                                                    items="#{Funcion2.asistente.opcionesListaNumeroTipoFuncion1}"
                                                    selected="#{Funcion2.funcionDataProvider.value['numero_tipo_funcion']}"
                                                    toolTip="BundleParametros.numero_tipo_funcion.funcion"/>
                                                <webuijsf:staticText id="listaNumeroTipoFuncion1Texto1"
                                                    binding="#{Funcion2.listaNumeroTipoFuncion1Texto1}"
                                                    text="#{Funcion2.funcionDataProvider.value['codigo_tipo_funcion_1x1y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoFuncion1"
                                                    for="listaNumeroTipoFuncion1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTipoFuncion1"
                                                    binding="#{Funcion2.helpInlineNumeroTipoFuncion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_tipo_funcion.funcion"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroTipoRastroFun1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Funcion2.labelNumeroTipoRastroFun1}"
                                                    id="labelNumeroTipoRastroFun1"
                                                    for="listaNumeroTipoRastroFun1"
                                                    text="tipo rastro"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTipoRastroFun2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroTipoRastroFun1"
                                                    binding="#{Funcion2.listaNumeroTipoRastroFun1}"
                                                    converter="#{Funcion2.converterNumeroTipoRastroFun1}"
                                                    disabled="#{Funcion2.gestor.filaNoProcesada}" required="true"
                                                    items="#{Funcion2.asistente.opcionesListaNumeroTipoRastroFun1}"
                                                    selected="#{Funcion2.funcionDataProvider.value['numero_tipo_rastro_fun']}"
                                                    toolTip="BundleParametros.numero_tipo_rastro_fun.funcion"/>
                                                <webuijsf:staticText id="listaNumeroTipoRastroFun1Texto1"
                                                    binding="#{Funcion2.listaNumeroTipoRastroFun1Texto1}"
                                                    text="#{Funcion2.funcionDataProvider.value['codigo_tipo_rastro_fun_1x2y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoRastroFun1"
                                                    for="listaNumeroTipoRastroFun1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTipoRastroFun1"
                                                    binding="#{Funcion2.helpInlineNumeroTipoRastroFun1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_tipo_rastro_fun.funcion"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdDominio1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Funcion2.labelIdDominio1}"
                                                    id="labelIdDominio1"
                                                    for="campoIdDominio1"
                                                    text="dominio"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdDominio2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdDominio1"
                                                    binding="#{Funcion2.campoIdDominio1}"
                                                    readOnly="#{Funcion2.gestor.filaNoProcesada}"
                                                    text="#{Funcion2.asistente.textoCampoIdDominio1}"
                                                    toolTip="#{Funcion2.asistente.toolTipCampoIdDominio1}"
                                                    validatorExpression="#{Funcion2.campoIdDominio1_validate}"/>
                                                <webuijsf:staticText id="campoIdDominio1Texto1"
                                                    binding="#{Funcion2.campoIdDominio1Texto1}"
                                                    text="#{Funcion2.funcionDataProvider.value['codigo_dominio_1x3y3']}"/>
                                                <webuijsf:button id="campoIdDominio1Boton1"
                                                    binding="#{Funcion2.campoIdDominio1Boton1}"
                                                    onClick="#{Funcion2.asistente.scriptCampoIdDominio1Boton1}"/>
                                                <webuijsf:button id="campoIdDominio1Boton3"
                                                    binding="#{Funcion2.campoIdDominio1Boton3}"
                                                    onClick="#{Funcion2.asistente.scriptCampoIdDominio1Boton2}"
                                                    rendered="#{Funcion2.asistente.campoIdDominio1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdDominio1"
                                                    for="campoIdDominio1"/>
                                                <webuijsf:helpInline id="helpInlineIdDominio1"
                                                    binding="#{Funcion2.helpInlineIdDominio1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_dominio.funcion"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdDominio3"
                                                rendered="#{Funcion2.asistente.campoIdDominio1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Funcion2.labelIdDominio2}"
                                                    id="labelIdDominio2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre dominio"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdDominio4"
                                                rendered="#{Funcion2.asistente.campoIdDominio1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{Funcion2.campoIdDominio1Texto2}"
                                                    text="#{Funcion2.funcionDataProvider.value['nombre_dominio_1x3y4']}"
                                                    id="campoIdDominio1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{Funcion2.campoIdDominio1Boton2}"
                                                    id="campoIdDominio1Boton2"
                                                    onClick="#{Funcion2.asistente.scriptCampoIdDominio1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridClausulaWhere1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Funcion2.labelClausulaWhere1}"
                                                    id="labelClausulaWhere1"
                                                    for="campoClausulaWhere1"
                                                    text="clausula where"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridClausulaWhere2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoClausulaWhere1"
                                                    binding="#{Funcion2.campoClausulaWhere1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{Funcion2.gestor.filaNoProcesada}"
                                                    text="#{Funcion2.funcionDataProvider.value['clausula_where']}"
                                                    toolTip="BundleParametros.clausula_where.funcion"
                                                    validatorExpression="#{Funcion2.validatorClausulaWhere1.validate}"/>
                                                <webuijsf:staticText id="campoClausulaWhere1Texto1"
                                                    binding="#{Funcion2.campoClausulaWhere1Texto1}"
                                                    text="#{Funcion2.funcionDataProvider.value['clausula_where']}"/>
                                                <webuijsf:message id="messageClausulaWhere1"
                                                    for="campoClausulaWhere1"/>
                                                <webuijsf:helpInline id="helpInlineClausulaWhere1"
                                                    binding="#{Funcion2.helpInlineClausulaWhere1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.clausula_where.funcion"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridClausulaOrder1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Funcion2.labelClausulaOrder1}"
                                                    id="labelClausulaOrder1"
                                                    for="campoClausulaOrder1"
                                                    text="clausula order"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridClausulaOrder2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoClausulaOrder1"
                                                    binding="#{Funcion2.campoClausulaOrder1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{Funcion2.gestor.filaNoProcesada}"
                                                    text="#{Funcion2.funcionDataProvider.value['clausula_order']}"
                                                    toolTip="BundleParametros.clausula_order.funcion"
                                                    validatorExpression="#{Funcion2.validatorClausulaOrder1.validate}"/>
                                                <webuijsf:staticText id="campoClausulaOrder1Texto1"
                                                    binding="#{Funcion2.campoClausulaOrder1Texto1}"
                                                    text="#{Funcion2.funcionDataProvider.value['clausula_order']}"/>
                                                <webuijsf:message id="messageClausulaOrder1"
                                                    for="campoClausulaOrder1"/>
                                                <webuijsf:helpInline id="helpInlineClausulaOrder1"
                                                    binding="#{Funcion2.helpInlineClausulaOrder1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.clausula_order.funcion"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsPublica1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Funcion2.labelEsPublica1}"
                                                    id="labelEsPublica1"
                                                    for="listaEsPublica1"
                                                    text="p&#250;blica"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsPublica2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsPublica1"
                                                    binding="#{Funcion2.listaEsPublica1}"
                                                    converter="#{Funcion2.converterEsPublica1}"
                                                    disabled="#{Funcion2.gestor.filaNoProcesada}" required="true"
                                                    items="#{Funcion2.asistente.opcionesListaEsPublica1}"
                                                    selected="#{Funcion2.funcionDataProvider.value['es_publica']}"
                                                    toolTip="BundleParametros.es_publica.funcion"/>
                                                <webuijsf:staticText id="listaEsPublica1Texto1"
                                                    binding="#{Funcion2.listaEsPublica1Texto1}"/>
                                                <webuijsf:message id="messageEsPublica1"
                                                    for="listaEsPublica1"/>
                                                <webuijsf:helpInline id="helpInlineEsPublica1"
                                                    binding="#{Funcion2.helpInlineEsPublica1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_publica.funcion"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsProgramatica1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Funcion2.labelEsProgramatica1}"
                                                    id="labelEsProgramatica1"
                                                    for="listaEsProgramatica1"
                                                    text="program&#225;tica"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsProgramatica2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsProgramatica1"
                                                    binding="#{Funcion2.listaEsProgramatica1}"
                                                    converter="#{Funcion2.converterEsProgramatica1}"
                                                    disabled="#{Funcion2.gestor.filaNoProcesada}" required="true"
                                                    items="#{Funcion2.asistente.opcionesListaEsProgramatica1}"
                                                    selected="#{Funcion2.funcionDataProvider.value['es_programatica']}"
                                                    toolTip="BundleParametros.es_programatica.funcion"/>
                                                <webuijsf:staticText id="listaEsProgramatica1Texto1"
                                                    binding="#{Funcion2.listaEsProgramatica1Texto1}"/>
                                                <webuijsf:message id="messageEsProgramatica1"
                                                    for="listaEsProgramatica1"/>
                                                <webuijsf:helpInline id="helpInlineEsProgramatica1"
                                                    binding="#{Funcion2.helpInlineEsProgramatica1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_programatica.funcion"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsPersonalizada1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Funcion2.labelEsPersonalizada1}"
                                                    id="labelEsPersonalizada1"
                                                    for="listaEsPersonalizada1"
                                                    text="personalizada"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsPersonalizada2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsPersonalizada1"
                                                    binding="#{Funcion2.listaEsPersonalizada1}"
                                                    converter="#{Funcion2.converterEsPersonalizada1}"
                                                    disabled="#{Funcion2.gestor.filaNoProcesada}" required="true"
                                                    items="#{Funcion2.asistente.opcionesListaEsPersonalizada1}"
                                                    selected="#{Funcion2.funcionDataProvider.value['es_personalizada']}"
                                                    toolTip="BundleParametros.es_personalizada.funcion"/>
                                                <webuijsf:staticText id="listaEsPersonalizada1Texto1"
                                                    binding="#{Funcion2.listaEsPersonalizada1Texto1}"/>
                                                <webuijsf:message id="messageEsPersonalizada1"
                                                    for="listaEsPersonalizada1"/>
                                                <webuijsf:helpInline id="helpInlineEsPersonalizada1"
                                                    binding="#{Funcion2.helpInlineEsPersonalizada1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_personalizada.funcion"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsSegmentada1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Funcion2.labelEsSegmentada1}"
                                                    id="labelEsSegmentada1"
                                                    for="listaEsSegmentada1"
                                                    text="segmentada"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsSegmentada2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsSegmentada1"
                                                    binding="#{Funcion2.listaEsSegmentada1}"
                                                    converter="#{Funcion2.converterEsSegmentada1}"
                                                    disabled="#{Funcion2.gestor.filaNoProcesada}" required="true"
                                                    items="#{Funcion2.asistente.opcionesListaEsSegmentada1}"
                                                    selected="#{Funcion2.funcionDataProvider.value['es_segmentada']}"
                                                    toolTip="BundleParametros.es_segmentada.funcion"/>
                                                <webuijsf:staticText id="listaEsSegmentada1Texto1"
                                                    binding="#{Funcion2.listaEsSegmentada1Texto1}"/>
                                                <webuijsf:message id="messageEsSegmentada1"
                                                    for="listaEsSegmentada1"/>
                                                <webuijsf:helpInline id="helpInlineEsSegmentada1"
                                                    binding="#{Funcion2.helpInlineEsSegmentada1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_segmentada.funcion"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdGrupoProceso1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Funcion2.labelIdGrupoProceso1}"
                                                    id="labelIdGrupoProceso1"
                                                    for="campoIdGrupoProceso1"
                                                    text="grupo proceso"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdGrupoProceso2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdGrupoProceso1"
                                                    binding="#{Funcion2.campoIdGrupoProceso1}"
                                                    readOnly="#{Funcion2.gestor.filaNoProcesada}"
                                                    text="#{Funcion2.asistente.textoCampoIdGrupoProceso1}"
                                                    toolTip="#{Funcion2.asistente.toolTipCampoIdGrupoProceso1}"
                                                    validatorExpression="#{Funcion2.campoIdGrupoProceso1_validate}"/>
                                                <webuijsf:staticText id="campoIdGrupoProceso1Texto1"
                                                    binding="#{Funcion2.campoIdGrupoProceso1Texto1}"
                                                    text="#{Funcion2.funcionDataProvider.value['codigo_grupo_proceso_1x4y3']}"/>
                                                <webuijsf:button id="campoIdGrupoProceso1Boton1"
                                                    binding="#{Funcion2.campoIdGrupoProceso1Boton1}"
                                                    onClick="#{Funcion2.asistente.scriptCampoIdGrupoProceso1Boton1}"/>
                                                <webuijsf:button id="campoIdGrupoProceso1Boton3"
                                                    binding="#{Funcion2.campoIdGrupoProceso1Boton3}"
                                                    onClick="#{Funcion2.asistente.scriptCampoIdGrupoProceso1Boton2}"
                                                    rendered="#{Funcion2.asistente.campoIdGrupoProceso1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdGrupoProceso1"
                                                    for="campoIdGrupoProceso1"/>
                                                <webuijsf:helpInline id="helpInlineIdGrupoProceso1"
                                                    binding="#{Funcion2.helpInlineIdGrupoProceso1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_grupo_proceso.funcion"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdGrupoProceso3"
                                                rendered="#{Funcion2.asistente.campoIdGrupoProceso1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Funcion2.labelIdGrupoProceso2}"
                                                    id="labelIdGrupoProceso2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre grupo proceso"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdGrupoProceso4"
                                                rendered="#{Funcion2.asistente.campoIdGrupoProceso1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{Funcion2.campoIdGrupoProceso1Texto2}"
                                                    text="#{Funcion2.funcionDataProvider.value['nombre_grupo_proceso_1x4y4']}"
                                                    id="campoIdGrupoProceso1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{Funcion2.campoIdGrupoProceso1Boton2}"
                                                    id="campoIdGrupoProceso1Boton2"
                                                    onClick="#{Funcion2.asistente.scriptCampoIdGrupoProceso1Boton2}"/>
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
                                                        actionExpression="#{Funcion2.botonIrAlPrimero2_action}"
                                                        binding="#{Funcion2.botonIrAlPrimero2}"
                                                        disabled="#{Funcion2.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero2"
                                                        imageURL="#{Funcion2.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{Funcion2.gestor.scriptIrAlPrimero}"
                                                        text="#{Funcion2.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{Funcion2.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Funcion2.botonIrAlAnterior2_action}"
                                                        binding="#{Funcion2.botonIrAlAnterior2}"
                                                        disabled="#{Funcion2.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior2"
                                                        imageURL="#{Funcion2.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{Funcion2.gestor.scriptIrAlAnterior}"
                                                        text="#{Funcion2.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{Funcion2.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Funcion2.botonIrAlSiguiente2_action}"
                                                        binding="#{Funcion2.botonIrAlSiguiente2}"
                                                        disabled="#{Funcion2.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente2"
                                                        imageURL="#{Funcion2.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{Funcion2.gestor.scriptIrAlSiguiente}"
                                                        text="#{Funcion2.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{Funcion2.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Funcion2.botonIrAlUltimo2_action}"
                                                        binding="#{Funcion2.botonIrAlUltimo2}"
                                                        disabled="#{Funcion2.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo2"
                                                        imageURL="#{Funcion2.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{Funcion2.gestor.scriptIrAlUltimo}"
                                                        text="#{Funcion2.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{Funcion2.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Funcion2.botonProcesarFila2_action}"
                                                        binding="#{Funcion2.botonProcesarFila2}"
                                                        disabled="#{Funcion2.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila2"
                                                        imageURL="#{Funcion2.gestor.urlImagenProcesar}"
                                                        onClick="#{Funcion2.scriptAbrirVentanaProcesarFila2}"
                                                        rendered="#{Funcion2.asistente.comandoDisponible}"
                                                        text="#{Funcion2.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{Funcion2.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{Funcion2.gestor.mensajeCambiosPorConfirmar}"/>
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
                                                    actionExpression="#{Funcion2.botonAgregar1_action}"
                                                    binding="#{Funcion2.botonAgregar1}"
                                                    disabled="#{Funcion2.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{Funcion2.gestor.scriptAgregar}"
                                                    rendered="#{Funcion2.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Funcion2.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{Funcion2.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{Funcion2.listaFuncionEdicion1}"
                                                    converter="#{Funcion2.converterListaFuncionEdicion1}"
                                                    disabled="#{Funcion2.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{Funcion2.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{Funcion2.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{Funcion2.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{Funcion2.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Funcion2.botonEditar1_action}"
                                                    binding="#{Funcion2.botonEditar1}"
                                                    disabled="#{Funcion2.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{Funcion2.gestor.scriptEditar}"
                                                    rendered="#{Funcion2.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Funcion2.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{Funcion2.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Funcion2.botonEliminar1_action}"
                                                    binding="#{Funcion2.botonEliminar1}"
                                                    disabled="#{Funcion2.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{Funcion2.gestor.scriptEliminar}"
                                                    rendered="#{Funcion2.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Funcion2.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{Funcion2.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Funcion2.botonAplicar1_action}"
                                                    binding="#{Funcion2.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{Funcion2.gestor.scriptAplicar}"
                                                    rendered="#{Funcion2.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Funcion2.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{Funcion2.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Funcion2.botonDeshacer1_action}"
                                                    binding="#{Funcion2.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{Funcion2.gestor.scriptDeshacer}"
                                                    rendered="#{Funcion2.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Funcion2.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{Funcion2.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Funcion2.botonConfirmar1_action}"
                                                    binding="#{Funcion2.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{Funcion2.gestor.scriptConfirmar}"
                                                    rendered="#{Funcion2.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Funcion2.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{Funcion2.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Funcion2.botonDescartar1_action}"
                                                    binding="#{Funcion2.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{Funcion2.gestor.scriptDescartar}"
                                                    rendered="#{Funcion2.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Funcion2.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{Funcion2.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{Funcion2.listaFuncionAccion1}"
                                                    converter="#{Funcion2.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{Funcion2.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{Funcion2.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{Funcion2.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{Funcion2.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Funcion2.botonProcesar1_action}"
                                                    binding="#{Funcion2.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{Funcion2.gestor.scriptProcesar}"
                                                    rendered="#{Funcion2.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Funcion2.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{Funcion2.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Funcion2.botonRefrescar1_action}"
                                                    binding="#{Funcion2.botonRefrescar1}"
                                                    disabled="#{Funcion2.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{Funcion2.gestor.scriptRefrescar}"
                                                    rendered="#{Funcion2.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Funcion2.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{Funcion2.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Funcion2.botonReconsultar1_action}"
                                                    binding="#{Funcion2.botonReconsultar1}"
                                                    disabled="#{Funcion2.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{Funcion2.gestor.scriptReconsultar}"
                                                    rendered="#{Funcion2.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Funcion2.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{Funcion2.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Funcion2.botonRetornar1_action}"
                                                    binding="#{Funcion2.botonRetornar1}"
                                                    disabled="#{Funcion2.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{Funcion2.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{Funcion2.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Funcion2.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{Funcion2.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="3" 
                                                id="gridPanel125"
                                                rendered="#{Funcion2.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{Funcion2.imageHyperlink1_action}"
                                                    binding="#{Funcion2.imageHyperlink1}"
                                                    disabled="#{Funcion2.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{Funcion2.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{Funcion2.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.Funcion2_imageHyperlink1_toolTip}"/>
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{Funcion2.imageHyperlink2_action}"
                                                    binding="#{Funcion2.imageHyperlink2}"
                                                    disabled="#{Funcion2.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink2"
                                                    imageURL="#{Funcion2.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{Funcion2.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    text="Hyperlink2"
                                                    toolTip="#{bundle.Funcion2_imageHyperlink2_toolTip}"/>
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{Funcion2.imageHyperlink3_action}"
                                                    binding="#{Funcion2.imageHyperlink3}"
                                                    disabled="#{Funcion2.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink3"
                                                    imageURL="#{Funcion2.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{Funcion2.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{Funcion2.gestor.designing}"
                                                    text="Hyperlink3"
                                                    toolTip="#{bundle.Funcion2_imageHyperlink3_toolTip}"/>
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
