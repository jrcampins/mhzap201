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
                    focus="#{Mensaje2.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{Mensaje2.gestor.preserveFocus}"
                    preserveScroll="#{Mensaje2.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{Mensaje2.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | campoIdMensaje1 campoCodigoMensaje1 campoPatronMensaje1 campoDescripcionMensaje1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | | , virtualForm3 | listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{Mensaje2.breadcrumbs1}" 
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
                                                    rendered="#{Mensaje2.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{Mensaje2.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{Mensaje2.gestor.mensajeDisponible}"
                                                    text="#{Mensaje2.gestor.mensaje}"
                                                    url="#{Mensaje2.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            id="gridPanel104"
                                            rendered="#{Mensaje2.gestor.filaDisponible}"
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
                                                        actionExpression="#{Mensaje2.botonIrAlPrimero1_action}"
                                                        binding="#{Mensaje2.botonIrAlPrimero1}"
                                                        disabled="#{Mensaje2.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero1"
                                                        imageURL="#{Mensaje2.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{Mensaje2.gestor.scriptIrAlPrimero}"
                                                        text="#{Mensaje2.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{Mensaje2.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Mensaje2.botonIrAlAnterior1_action}"
                                                        binding="#{Mensaje2.botonIrAlAnterior1}"
                                                        disabled="#{Mensaje2.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior1"
                                                        imageURL="#{Mensaje2.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{Mensaje2.gestor.scriptIrAlAnterior}"
                                                        text="#{Mensaje2.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{Mensaje2.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Mensaje2.botonIrAlSiguiente1_action}"
                                                        binding="#{Mensaje2.botonIrAlSiguiente1}"
                                                        disabled="#{Mensaje2.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente1"
                                                        imageURL="#{Mensaje2.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{Mensaje2.gestor.scriptIrAlSiguiente}"
                                                        text="#{Mensaje2.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{Mensaje2.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Mensaje2.botonIrAlUltimo1_action}"
                                                        binding="#{Mensaje2.botonIrAlUltimo1}"
                                                        disabled="#{Mensaje2.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo1"
                                                        imageURL="#{Mensaje2.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{Mensaje2.gestor.scriptIrAlUltimo}"
                                                        text="#{Mensaje2.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{Mensaje2.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Mensaje2.botonProcesarFila1_action}"
                                                        binding="#{Mensaje2.botonProcesarFila1}"
                                                        disabled="#{Mensaje2.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila1"
                                                        imageURL="#{Mensaje2.gestor.urlImagenProcesar}"
                                                        onClick="#{Mensaje2.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{Mensaje2.asistente.comandoDisponible}"
                                                        text="#{Mensaje2.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{Mensaje2.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{Mensaje2.gestor.tituloConsulta}"/>
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
                                                    binding="#{Mensaje2.etiquetaIdentificacionFila1}"
                                                    id="etiquetaIdentificacionFila1"
                                                    text="#{Mensaje2.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{Mensaje2.gestor.i18n.toolTipEtiquetaIdentificacionFila}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel113"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoIdentificacionFila1"
                                                    style="font-weight: bold"
                                                    text="#{Mensaje2.gestor.identificacionFila}"/>
                                                <webuijsf:image
                                                    id="imagenFilaProcesada1"
                                                    toolTip="#{Mensaje2.gestor.toolTipImagenFilaProcesada}"
                                                    url="#{Mensaje2.gestor.urlImagenFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPanel114"
                                                rendered="#{Mensaje2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Mensaje2.etiquetaDenominacionFilaMaestro1}"
                                                    id="etiquetaDenominacionFilaMaestro1"
                                                    text="?"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel115"
                                                rendered="#{Mensaje2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoDenominacionFilaMaestro1"
                                                    style="font-weight: bold"
                                                    text="#{Mensaje2.gestor.denominacionFilaMaestro}"/>
                                                <webuijsf:image
                                                    id="imagenFilaMaestro1"
                                                    url="#{Mensaje2.gestor.urlImagenMaestroFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdMensaje1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Mensaje2.labelIdMensaje1}"
                                                    id="labelIdMensaje1"
                                                    for="campoIdMensaje1"
                                                    toolTip="BundleParametros.id_mensaje.mensaje"
                                                    text="identificaci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdMensaje2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdMensaje1"
                                                    binding="#{Mensaje2.campoIdMensaje1}"
                                                    converter="#{Mensaje2.converterIdMensaje1}"
                                                    readOnly="#{Mensaje2.gestor.filaNoProcesada}" required="true"
                                                    text="#{Mensaje2.mensajeDataProvider.value['id_mensaje']}"
                                                    toolTip="BundleParametros.id_mensaje.mensaje"
                                                    validatorExpression="#{Mensaje2.validatorIdMensaje1.validate}"/>
                                                <webuijsf:staticText id="campoIdMensaje1Texto1"
                                                    binding="#{Mensaje2.campoIdMensaje1Texto1}"
                                                    text="#{Mensaje2.mensajeDataProvider.value['id_mensaje']}"/>
                                                <webuijsf:message id="messageIdMensaje1"
                                                    for="campoIdMensaje1"/>
                                                <webuijsf:helpInline id="helpInlineIdMensaje1"
                                                    binding="#{Mensaje2.helpInlineIdMensaje1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_mensaje.mensaje"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridCodigoMensaje1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Mensaje2.labelCodigoMensaje1}"
                                                    id="labelCodigoMensaje1"
                                                    for="campoCodigoMensaje1"
                                                    toolTip="BundleParametros.codigo_mensaje.mensaje"
                                                    text="c&#243;digo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridCodigoMensaje2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoCodigoMensaje1"
                                                    binding="#{Mensaje2.campoCodigoMensaje1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{Mensaje2.gestor.filaNoProcesada}" required="true"
                                                    text="#{Mensaje2.mensajeDataProvider.value['codigo_mensaje']}"
                                                    toolTip="BundleParametros.codigo_mensaje.mensaje"
                                                    validatorExpression="#{Mensaje2.validatorCodigoMensaje1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoMensaje1Texto1"
                                                    binding="#{Mensaje2.campoCodigoMensaje1Texto1}"
                                                    text="#{Mensaje2.mensajeDataProvider.value['codigo_mensaje']}"/>
                                                <webuijsf:message id="messageCodigoMensaje1"
                                                    for="campoCodigoMensaje1"/>
                                                <webuijsf:helpInline id="helpInlineCodigoMensaje1"
                                                    binding="#{Mensaje2.helpInlineCodigoMensaje1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.codigo_mensaje.mensaje"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPatronMensaje1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Mensaje2.labelPatronMensaje1}"
                                                    id="labelPatronMensaje1"
                                                    for="campoPatronMensaje1"
                                                    toolTip="BundleParametros.patron_mensaje.mensaje"
                                                    text="patr&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPatronMensaje2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoPatronMensaje1"
                                                    binding="#{Mensaje2.campoPatronMensaje1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{Mensaje2.gestor.filaNoProcesada}" required="true"
                                                    text="#{Mensaje2.mensajeDataProvider.value['patron_mensaje']}"
                                                    toolTip="BundleParametros.patron_mensaje.mensaje"
                                                    validatorExpression="#{Mensaje2.validatorPatronMensaje1.validate}"/>
                                                <webuijsf:staticText id="campoPatronMensaje1Texto1"
                                                    binding="#{Mensaje2.campoPatronMensaje1Texto1}"
                                                    text="#{Mensaje2.mensajeDataProvider.value['patron_mensaje']}"/>
                                                <webuijsf:message id="messagePatronMensaje1"
                                                    for="campoPatronMensaje1"/>
                                                <webuijsf:helpInline id="helpInlinePatronMensaje1"
                                                    binding="#{Mensaje2.helpInlinePatronMensaje1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.patron_mensaje.mensaje"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridDescripcionMensaje1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Mensaje2.labelDescripcionMensaje1}"
                                                    id="labelDescripcionMensaje1"
                                                    for="campoDescripcionMensaje1"
                                                    toolTip="BundleParametros.descripcion_mensaje.mensaje"
                                                    text="descripci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridDescripcionMensaje2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoDescripcionMensaje1"
                                                    binding="#{Mensaje2.campoDescripcionMensaje1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{Mensaje2.gestor.filaNoProcesada}"
                                                    text="#{Mensaje2.mensajeDataProvider.value['descripcion_mensaje']}"
                                                    toolTip="BundleParametros.descripcion_mensaje.mensaje"
                                                    validatorExpression="#{Mensaje2.validatorDescripcionMensaje1.validate}"/>
                                                <webuijsf:staticText id="campoDescripcionMensaje1Texto1"
                                                    binding="#{Mensaje2.campoDescripcionMensaje1Texto1}"
                                                    text="#{Mensaje2.mensajeDataProvider.value['descripcion_mensaje']}"/>
                                                <webuijsf:message id="messageDescripcionMensaje1"
                                                    for="campoDescripcionMensaje1"/>
                                                <webuijsf:helpInline id="helpInlineDescripcionMensaje1"
                                                    binding="#{Mensaje2.helpInlineDescripcionMensaje1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.descripcion_mensaje.mensaje"
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
                                                        actionExpression="#{Mensaje2.botonIrAlPrimero2_action}"
                                                        binding="#{Mensaje2.botonIrAlPrimero2}"
                                                        disabled="#{Mensaje2.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero2"
                                                        imageURL="#{Mensaje2.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{Mensaje2.gestor.scriptIrAlPrimero}"
                                                        text="#{Mensaje2.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{Mensaje2.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Mensaje2.botonIrAlAnterior2_action}"
                                                        binding="#{Mensaje2.botonIrAlAnterior2}"
                                                        disabled="#{Mensaje2.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior2"
                                                        imageURL="#{Mensaje2.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{Mensaje2.gestor.scriptIrAlAnterior}"
                                                        text="#{Mensaje2.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{Mensaje2.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Mensaje2.botonIrAlSiguiente2_action}"
                                                        binding="#{Mensaje2.botonIrAlSiguiente2}"
                                                        disabled="#{Mensaje2.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente2"
                                                        imageURL="#{Mensaje2.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{Mensaje2.gestor.scriptIrAlSiguiente}"
                                                        text="#{Mensaje2.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{Mensaje2.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Mensaje2.botonIrAlUltimo2_action}"
                                                        binding="#{Mensaje2.botonIrAlUltimo2}"
                                                        disabled="#{Mensaje2.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo2"
                                                        imageURL="#{Mensaje2.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{Mensaje2.gestor.scriptIrAlUltimo}"
                                                        text="#{Mensaje2.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{Mensaje2.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Mensaje2.botonProcesarFila2_action}"
                                                        binding="#{Mensaje2.botonProcesarFila2}"
                                                        disabled="#{Mensaje2.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila2"
                                                        imageURL="#{Mensaje2.gestor.urlImagenProcesar}"
                                                        onClick="#{Mensaje2.scriptAbrirVentanaProcesarFila2}"
                                                        rendered="#{Mensaje2.asistente.comandoDisponible}"
                                                        text="#{Mensaje2.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{Mensaje2.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{Mensaje2.gestor.mensajeCambiosPorConfirmar}"/>
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
                                                    actionExpression="#{Mensaje2.botonAgregar1_action}"
                                                    binding="#{Mensaje2.botonAgregar1}"
                                                    disabled="#{Mensaje2.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{Mensaje2.gestor.scriptAgregar}"
                                                    rendered="#{Mensaje2.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Mensaje2.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{Mensaje2.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{Mensaje2.listaFuncionEdicion1}"
                                                    converter="#{Mensaje2.converterListaFuncionEdicion1}"
                                                    disabled="#{Mensaje2.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{Mensaje2.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{Mensaje2.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{Mensaje2.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{Mensaje2.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Mensaje2.botonEditar1_action}"
                                                    binding="#{Mensaje2.botonEditar1}"
                                                    disabled="#{Mensaje2.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{Mensaje2.gestor.scriptEditar}"
                                                    rendered="#{Mensaje2.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Mensaje2.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{Mensaje2.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Mensaje2.botonEliminar1_action}"
                                                    binding="#{Mensaje2.botonEliminar1}"
                                                    disabled="#{Mensaje2.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{Mensaje2.gestor.scriptEliminar}"
                                                    rendered="#{Mensaje2.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Mensaje2.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{Mensaje2.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Mensaje2.botonAplicar1_action}"
                                                    binding="#{Mensaje2.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{Mensaje2.gestor.scriptAplicar}"
                                                    rendered="#{Mensaje2.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Mensaje2.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{Mensaje2.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Mensaje2.botonDeshacer1_action}"
                                                    binding="#{Mensaje2.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{Mensaje2.gestor.scriptDeshacer}"
                                                    rendered="#{Mensaje2.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Mensaje2.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{Mensaje2.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Mensaje2.botonConfirmar1_action}"
                                                    binding="#{Mensaje2.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{Mensaje2.gestor.scriptConfirmar}"
                                                    rendered="#{Mensaje2.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Mensaje2.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{Mensaje2.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Mensaje2.botonDescartar1_action}"
                                                    binding="#{Mensaje2.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{Mensaje2.gestor.scriptDescartar}"
                                                    rendered="#{Mensaje2.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Mensaje2.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{Mensaje2.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{Mensaje2.listaFuncionAccion1}"
                                                    converter="#{Mensaje2.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{Mensaje2.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{Mensaje2.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{Mensaje2.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{Mensaje2.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Mensaje2.botonProcesar1_action}"
                                                    binding="#{Mensaje2.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{Mensaje2.gestor.scriptProcesar}"
                                                    rendered="#{Mensaje2.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Mensaje2.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{Mensaje2.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Mensaje2.botonRefrescar1_action}"
                                                    binding="#{Mensaje2.botonRefrescar1}"
                                                    disabled="#{Mensaje2.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{Mensaje2.gestor.scriptRefrescar}"
                                                    rendered="#{Mensaje2.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Mensaje2.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{Mensaje2.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Mensaje2.botonReconsultar1_action}"
                                                    binding="#{Mensaje2.botonReconsultar1}"
                                                    disabled="#{Mensaje2.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{Mensaje2.gestor.scriptReconsultar}"
                                                    rendered="#{Mensaje2.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Mensaje2.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{Mensaje2.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Mensaje2.botonRetornar1_action}"
                                                    binding="#{Mensaje2.botonRetornar1}"
                                                    disabled="#{Mensaje2.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{Mensaje2.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{Mensaje2.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Mensaje2.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{Mensaje2.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel125"
                                                rendered="#{Mensaje2.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{Mensaje2.imageHyperlink1_action}"
                                                    binding="#{Mensaje2.imageHyperlink1}"
                                                    disabled="#{Mensaje2.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{Mensaje2.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{Mensaje2.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{Mensaje2.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.Mensaje2_imageHyperlink1_toolTip}"/>
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
