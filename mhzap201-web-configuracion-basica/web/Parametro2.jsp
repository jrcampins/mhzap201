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
                    focus="#{Parametro2.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{Parametro2.gestor.preserveFocus}"
                    preserveScroll="#{Parametro2.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{Parametro2.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | campoIdParametro1 campoCodigoParametro1 campoNombreParametro1 campoDetalleParametro1 campoDescripcionParametro1 listaNumeroTipoDatoPar1 campoAliasParametro1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | | , virtualForm3 | listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{Parametro2.breadcrumbs1}" 
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
                                                    rendered="#{Parametro2.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{Parametro2.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{Parametro2.gestor.mensajeDisponible}"
                                                    text="#{Parametro2.gestor.mensaje}"
                                                    url="#{Parametro2.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            id="gridPanel104"
                                            rendered="#{Parametro2.gestor.filaDisponible}"
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
                                                        actionExpression="#{Parametro2.botonIrAlPrimero1_action}"
                                                        binding="#{Parametro2.botonIrAlPrimero1}"
                                                        disabled="#{Parametro2.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero1"
                                                        imageURL="#{Parametro2.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{Parametro2.gestor.scriptIrAlPrimero}"
                                                        text="#{Parametro2.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{Parametro2.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Parametro2.botonIrAlAnterior1_action}"
                                                        binding="#{Parametro2.botonIrAlAnterior1}"
                                                        disabled="#{Parametro2.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior1"
                                                        imageURL="#{Parametro2.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{Parametro2.gestor.scriptIrAlAnterior}"
                                                        text="#{Parametro2.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{Parametro2.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Parametro2.botonIrAlSiguiente1_action}"
                                                        binding="#{Parametro2.botonIrAlSiguiente1}"
                                                        disabled="#{Parametro2.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente1"
                                                        imageURL="#{Parametro2.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{Parametro2.gestor.scriptIrAlSiguiente}"
                                                        text="#{Parametro2.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{Parametro2.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Parametro2.botonIrAlUltimo1_action}"
                                                        binding="#{Parametro2.botonIrAlUltimo1}"
                                                        disabled="#{Parametro2.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo1"
                                                        imageURL="#{Parametro2.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{Parametro2.gestor.scriptIrAlUltimo}"
                                                        text="#{Parametro2.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{Parametro2.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Parametro2.botonProcesarFila1_action}"
                                                        binding="#{Parametro2.botonProcesarFila1}"
                                                        disabled="#{Parametro2.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila1"
                                                        imageURL="#{Parametro2.gestor.urlImagenProcesar}"
                                                        onClick="#{Parametro2.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{Parametro2.asistente.comandoDisponible}"
                                                        text="#{Parametro2.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{Parametro2.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{Parametro2.gestor.tituloConsulta}"/>
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
                                                    binding="#{Parametro2.etiquetaIdentificacionFila1}"
                                                    id="etiquetaIdentificacionFila1"
                                                    text="#{Parametro2.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{Parametro2.gestor.i18n.toolTipEtiquetaIdentificacionFila}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel113"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoIdentificacionFila1"
                                                    style="font-weight: bold"
                                                    text="#{Parametro2.gestor.identificacionFila}"/>
                                                <webuijsf:image
                                                    id="imagenFilaProcesada1"
                                                    toolTip="#{Parametro2.gestor.toolTipImagenFilaProcesada}"
                                                    url="#{Parametro2.gestor.urlImagenFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPanel114"
                                                rendered="#{Parametro2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Parametro2.etiquetaDenominacionFilaMaestro1}"
                                                    id="etiquetaDenominacionFilaMaestro1"
                                                    text="?"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel115"
                                                rendered="#{Parametro2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoDenominacionFilaMaestro1"
                                                    style="font-weight: bold"
                                                    text="#{Parametro2.gestor.denominacionFilaMaestro}"/>
                                                <webuijsf:image
                                                    id="imagenFilaMaestro1"
                                                    url="#{Parametro2.gestor.urlImagenMaestroFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdParametro1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Parametro2.labelIdParametro1}"
                                                    id="labelIdParametro1"
                                                    for="campoIdParametro1"
                                                    text="id"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdParametro2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdParametro1"
                                                    binding="#{Parametro2.campoIdParametro1}"
                                                    converter="#{Parametro2.converterIdParametro1}"
                                                    readOnly="#{Parametro2.gestor.filaNoProcesada}" required="true"
                                                    text="#{Parametro2.parametroDataProvider.value['id_parametro']}"
                                                    toolTip="BundleParametros.id_parametro.parametro"
                                                    validatorExpression="#{Parametro2.validatorIdParametro1.validate}"/>
                                                <webuijsf:staticText id="campoIdParametro1Texto1"
                                                    binding="#{Parametro2.campoIdParametro1Texto1}"
                                                    text="#{Parametro2.parametroDataProvider.value['id_parametro']}"/>
                                                <webuijsf:message id="messageIdParametro1"
                                                    for="campoIdParametro1"/>
                                                <webuijsf:helpInline id="helpInlineIdParametro1"
                                                    binding="#{Parametro2.helpInlineIdParametro1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_parametro.parametro"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridCodigoParametro1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Parametro2.labelCodigoParametro1}"
                                                    id="labelCodigoParametro1"
                                                    for="campoCodigoParametro1"
                                                    text="codigo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridCodigoParametro2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoCodigoParametro1"
                                                    binding="#{Parametro2.campoCodigoParametro1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{Parametro2.gestor.filaNoProcesada}" required="true"
                                                    text="#{Parametro2.parametroDataProvider.value['codigo_parametro']}"
                                                    toolTip="BundleParametros.codigo_parametro.parametro"
                                                    validatorExpression="#{Parametro2.validatorCodigoParametro1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoParametro1Texto1"
                                                    binding="#{Parametro2.campoCodigoParametro1Texto1}"
                                                    text="#{Parametro2.parametroDataProvider.value['codigo_parametro']}"/>
                                                <webuijsf:message id="messageCodigoParametro1"
                                                    for="campoCodigoParametro1"/>
                                                <webuijsf:helpInline id="helpInlineCodigoParametro1"
                                                    binding="#{Parametro2.helpInlineCodigoParametro1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.codigo_parametro.parametro"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNombreParametro1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Parametro2.labelNombreParametro1}"
                                                    id="labelNombreParametro1"
                                                    for="campoNombreParametro1"
                                                    text="nombre"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNombreParametro2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNombreParametro1"
                                                    binding="#{Parametro2.campoNombreParametro1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{Parametro2.gestor.filaNoProcesada}" required="true"
                                                    text="#{Parametro2.parametroDataProvider.value['nombre_parametro']}"
                                                    toolTip="BundleParametros.nombre_parametro.parametro"
                                                    validatorExpression="#{Parametro2.validatorNombreParametro1.validate}"/>
                                                <webuijsf:staticText id="campoNombreParametro1Texto1"
                                                    binding="#{Parametro2.campoNombreParametro1Texto1}"
                                                    text="#{Parametro2.parametroDataProvider.value['nombre_parametro']}"/>
                                                <webuijsf:message id="messageNombreParametro1"
                                                    for="campoNombreParametro1"/>
                                                <webuijsf:helpInline id="helpInlineNombreParametro1"
                                                    binding="#{Parametro2.helpInlineNombreParametro1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.nombre_parametro.parametro"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridDetalleParametro1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Parametro2.labelDetalleParametro1}"
                                                    id="labelDetalleParametro1"
                                                    for="campoDetalleParametro1"
                                                    text="detalle"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridDetalleParametro2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoDetalleParametro1"
                                                    binding="#{Parametro2.campoDetalleParametro1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{Parametro2.gestor.filaNoProcesada}"
                                                    text="#{Parametro2.parametroDataProvider.value['detalle_parametro']}"
                                                    toolTip="BundleParametros.detalle_parametro.parametro"
                                                    validatorExpression="#{Parametro2.validatorDetalleParametro1.validate}"/>
                                                <webuijsf:staticText id="campoDetalleParametro1Texto1"
                                                    binding="#{Parametro2.campoDetalleParametro1Texto1}"
                                                    text="#{Parametro2.parametroDataProvider.value['detalle_parametro']}"/>
                                                <webuijsf:message id="messageDetalleParametro1"
                                                    for="campoDetalleParametro1"/>
                                                <webuijsf:helpInline id="helpInlineDetalleParametro1"
                                                    binding="#{Parametro2.helpInlineDetalleParametro1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.detalle_parametro.parametro"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridDescripcionParametro1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Parametro2.labelDescripcionParametro1}"
                                                    id="labelDescripcionParametro1"
                                                    for="campoDescripcionParametro1"
                                                    text="descripcion"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridDescripcionParametro2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoDescripcionParametro1"
                                                    binding="#{Parametro2.campoDescripcionParametro1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{Parametro2.gestor.filaNoProcesada}"
                                                    text="#{Parametro2.parametroDataProvider.value['descripcion_parametro']}"
                                                    toolTip="BundleParametros.descripcion_parametro.parametro"
                                                    validatorExpression="#{Parametro2.validatorDescripcionParametro1.validate}"/>
                                                <webuijsf:staticText id="campoDescripcionParametro1Texto1"
                                                    binding="#{Parametro2.campoDescripcionParametro1Texto1}"
                                                    text="#{Parametro2.parametroDataProvider.value['descripcion_parametro']}"/>
                                                <webuijsf:message id="messageDescripcionParametro1"
                                                    for="campoDescripcionParametro1"/>
                                                <webuijsf:helpInline id="helpInlineDescripcionParametro1"
                                                    binding="#{Parametro2.helpInlineDescripcionParametro1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.descripcion_parametro.parametro"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroTipoDatoPar1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Parametro2.labelNumeroTipoDatoPar1}"
                                                    id="labelNumeroTipoDatoPar1"
                                                    for="listaNumeroTipoDatoPar1"
                                                    text="tipo dato par"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTipoDatoPar2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroTipoDatoPar1"
                                                    binding="#{Parametro2.listaNumeroTipoDatoPar1}"
                                                    converter="#{Parametro2.converterNumeroTipoDatoPar1}"
                                                    disabled="#{Parametro2.gestor.filaNoProcesada}" required="true"
                                                    items="#{Parametro2.asistente.opcionesListaNumeroTipoDatoPar1}"
                                                    selected="#{Parametro2.parametroDataProvider.value['numero_tipo_dato_par']}"
                                                    toolTip="BundleParametros.numero_tipo_dato_par.parametro"/>
                                                <webuijsf:staticText id="listaNumeroTipoDatoPar1Texto1"
                                                    binding="#{Parametro2.listaNumeroTipoDatoPar1Texto1}"
                                                    text="#{Parametro2.parametroDataProvider.value['codigo_tipo_dato_par_1x1y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoDatoPar1"
                                                    for="listaNumeroTipoDatoPar1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTipoDatoPar1"
                                                    binding="#{Parametro2.helpInlineNumeroTipoDatoPar1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_tipo_dato_par.parametro"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridAliasParametro1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Parametro2.labelAliasParametro1}"
                                                    id="labelAliasParametro1"
                                                    for="campoAliasParametro1"
                                                    text="alias"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridAliasParametro2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoAliasParametro1"
                                                    binding="#{Parametro2.campoAliasParametro1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{Parametro2.gestor.filaNoProcesada}"
                                                    text="#{Parametro2.parametroDataProvider.value['alias_parametro']}"
                                                    toolTip="BundleParametros.alias_parametro.parametro"
                                                    validatorExpression="#{Parametro2.validatorAliasParametro1.validate}"/>
                                                <webuijsf:staticText id="campoAliasParametro1Texto1"
                                                    binding="#{Parametro2.campoAliasParametro1Texto1}"
                                                    text="#{Parametro2.parametroDataProvider.value['alias_parametro']}"/>
                                                <webuijsf:message id="messageAliasParametro1"
                                                    for="campoAliasParametro1"/>
                                                <webuijsf:helpInline id="helpInlineAliasParametro1"
                                                    binding="#{Parametro2.helpInlineAliasParametro1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.alias_parametro.parametro"
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
                                                        actionExpression="#{Parametro2.botonIrAlPrimero2_action}"
                                                        binding="#{Parametro2.botonIrAlPrimero2}"
                                                        disabled="#{Parametro2.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero2"
                                                        imageURL="#{Parametro2.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{Parametro2.gestor.scriptIrAlPrimero}"
                                                        text="#{Parametro2.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{Parametro2.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Parametro2.botonIrAlAnterior2_action}"
                                                        binding="#{Parametro2.botonIrAlAnterior2}"
                                                        disabled="#{Parametro2.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior2"
                                                        imageURL="#{Parametro2.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{Parametro2.gestor.scriptIrAlAnterior}"
                                                        text="#{Parametro2.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{Parametro2.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Parametro2.botonIrAlSiguiente2_action}"
                                                        binding="#{Parametro2.botonIrAlSiguiente2}"
                                                        disabled="#{Parametro2.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente2"
                                                        imageURL="#{Parametro2.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{Parametro2.gestor.scriptIrAlSiguiente}"
                                                        text="#{Parametro2.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{Parametro2.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Parametro2.botonIrAlUltimo2_action}"
                                                        binding="#{Parametro2.botonIrAlUltimo2}"
                                                        disabled="#{Parametro2.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo2"
                                                        imageURL="#{Parametro2.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{Parametro2.gestor.scriptIrAlUltimo}"
                                                        text="#{Parametro2.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{Parametro2.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Parametro2.botonProcesarFila2_action}"
                                                        binding="#{Parametro2.botonProcesarFila2}"
                                                        disabled="#{Parametro2.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila2"
                                                        imageURL="#{Parametro2.gestor.urlImagenProcesar}"
                                                        onClick="#{Parametro2.scriptAbrirVentanaProcesarFila2}"
                                                        rendered="#{Parametro2.asistente.comandoDisponible}"
                                                        text="#{Parametro2.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{Parametro2.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{Parametro2.gestor.mensajeCambiosPorConfirmar}"/>
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
                                                    actionExpression="#{Parametro2.botonAgregar1_action}"
                                                    binding="#{Parametro2.botonAgregar1}"
                                                    disabled="#{Parametro2.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{Parametro2.gestor.scriptAgregar}"
                                                    rendered="#{Parametro2.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Parametro2.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{Parametro2.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{Parametro2.listaFuncionEdicion1}"
                                                    converter="#{Parametro2.converterListaFuncionEdicion1}"
                                                    disabled="#{Parametro2.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{Parametro2.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{Parametro2.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{Parametro2.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{Parametro2.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Parametro2.botonEditar1_action}"
                                                    binding="#{Parametro2.botonEditar1}"
                                                    disabled="#{Parametro2.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{Parametro2.gestor.scriptEditar}"
                                                    rendered="#{Parametro2.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Parametro2.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{Parametro2.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Parametro2.botonEliminar1_action}"
                                                    binding="#{Parametro2.botonEliminar1}"
                                                    disabled="#{Parametro2.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{Parametro2.gestor.scriptEliminar}"
                                                    rendered="#{Parametro2.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Parametro2.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{Parametro2.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Parametro2.botonAplicar1_action}"
                                                    binding="#{Parametro2.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{Parametro2.gestor.scriptAplicar}"
                                                    rendered="#{Parametro2.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Parametro2.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{Parametro2.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Parametro2.botonDeshacer1_action}"
                                                    binding="#{Parametro2.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{Parametro2.gestor.scriptDeshacer}"
                                                    rendered="#{Parametro2.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Parametro2.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{Parametro2.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Parametro2.botonConfirmar1_action}"
                                                    binding="#{Parametro2.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{Parametro2.gestor.scriptConfirmar}"
                                                    rendered="#{Parametro2.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Parametro2.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{Parametro2.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Parametro2.botonDescartar1_action}"
                                                    binding="#{Parametro2.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{Parametro2.gestor.scriptDescartar}"
                                                    rendered="#{Parametro2.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Parametro2.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{Parametro2.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{Parametro2.listaFuncionAccion1}"
                                                    converter="#{Parametro2.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{Parametro2.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{Parametro2.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{Parametro2.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{Parametro2.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Parametro2.botonProcesar1_action}"
                                                    binding="#{Parametro2.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{Parametro2.gestor.scriptProcesar}"
                                                    rendered="#{Parametro2.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Parametro2.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{Parametro2.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Parametro2.botonRefrescar1_action}"
                                                    binding="#{Parametro2.botonRefrescar1}"
                                                    disabled="#{Parametro2.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{Parametro2.gestor.scriptRefrescar}"
                                                    rendered="#{Parametro2.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Parametro2.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{Parametro2.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Parametro2.botonReconsultar1_action}"
                                                    binding="#{Parametro2.botonReconsultar1}"
                                                    disabled="#{Parametro2.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{Parametro2.gestor.scriptReconsultar}"
                                                    rendered="#{Parametro2.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Parametro2.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{Parametro2.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Parametro2.botonRetornar1_action}"
                                                    binding="#{Parametro2.botonRetornar1}"
                                                    disabled="#{Parametro2.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{Parametro2.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{Parametro2.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Parametro2.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{Parametro2.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel125"
                                                rendered="#{Parametro2.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{Parametro2.imageHyperlink1_action}"
                                                    binding="#{Parametro2.imageHyperlink1}"
                                                    disabled="#{Parametro2.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{Parametro2.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{Parametro2.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{Parametro2.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.Parametro2_imageHyperlink1_toolTip}"/>
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
