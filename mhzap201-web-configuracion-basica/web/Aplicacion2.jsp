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
                    focus="#{Aplicacion2.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{Aplicacion2.gestor.preserveFocus}"
                    preserveScroll="#{Aplicacion2.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{Aplicacion2.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | campoIdAplicacion1 campoCodigoAplicacion1 campoNombreAplicacion1 campoDescripcionAplicacion1 campoServidorAplicacion1 campoPuertoAplicacion1 campoUrlAplicacion1 listaEsPublica1 campoIdGrupoAplicacion1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | | , virtualForm3 | listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{Aplicacion2.breadcrumbs1}" 
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
                                                    rendered="#{Aplicacion2.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{Aplicacion2.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{Aplicacion2.gestor.mensajeDisponible}"
                                                    text="#{Aplicacion2.gestor.mensaje}"
                                                    url="#{Aplicacion2.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            id="gridPanel104"
                                            rendered="#{Aplicacion2.gestor.filaDisponible}"
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
                                                        actionExpression="#{Aplicacion2.botonIrAlPrimero1_action}"
                                                        binding="#{Aplicacion2.botonIrAlPrimero1}"
                                                        disabled="#{Aplicacion2.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero1"
                                                        imageURL="#{Aplicacion2.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{Aplicacion2.gestor.scriptIrAlPrimero}"
                                                        text="#{Aplicacion2.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{Aplicacion2.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Aplicacion2.botonIrAlAnterior1_action}"
                                                        binding="#{Aplicacion2.botonIrAlAnterior1}"
                                                        disabled="#{Aplicacion2.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior1"
                                                        imageURL="#{Aplicacion2.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{Aplicacion2.gestor.scriptIrAlAnterior}"
                                                        text="#{Aplicacion2.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{Aplicacion2.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Aplicacion2.botonIrAlSiguiente1_action}"
                                                        binding="#{Aplicacion2.botonIrAlSiguiente1}"
                                                        disabled="#{Aplicacion2.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente1"
                                                        imageURL="#{Aplicacion2.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{Aplicacion2.gestor.scriptIrAlSiguiente}"
                                                        text="#{Aplicacion2.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{Aplicacion2.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Aplicacion2.botonIrAlUltimo1_action}"
                                                        binding="#{Aplicacion2.botonIrAlUltimo1}"
                                                        disabled="#{Aplicacion2.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo1"
                                                        imageURL="#{Aplicacion2.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{Aplicacion2.gestor.scriptIrAlUltimo}"
                                                        text="#{Aplicacion2.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{Aplicacion2.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Aplicacion2.botonProcesarFila1_action}"
                                                        binding="#{Aplicacion2.botonProcesarFila1}"
                                                        disabled="#{Aplicacion2.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila1"
                                                        imageURL="#{Aplicacion2.gestor.urlImagenProcesar}"
                                                        onClick="#{Aplicacion2.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{Aplicacion2.asistente.comandoDisponible}"
                                                        text="#{Aplicacion2.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{Aplicacion2.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{Aplicacion2.gestor.tituloConsulta}"/>
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
                                                    binding="#{Aplicacion2.etiquetaIdentificacionFila1}"
                                                    id="etiquetaIdentificacionFila1"
                                                    text="#{Aplicacion2.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{Aplicacion2.gestor.i18n.toolTipEtiquetaIdentificacionFila}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel113"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoIdentificacionFila1"
                                                    style="font-weight: bold"
                                                    text="#{Aplicacion2.gestor.identificacionFila}"/>
                                                <webuijsf:image
                                                    id="imagenFilaProcesada1"
                                                    toolTip="#{Aplicacion2.gestor.toolTipImagenFilaProcesada}"
                                                    url="#{Aplicacion2.gestor.urlImagenFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPanel114"
                                                rendered="#{Aplicacion2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Aplicacion2.etiquetaDenominacionFilaMaestro1}"
                                                    id="etiquetaDenominacionFilaMaestro1"
                                                    text="?"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel115"
                                                rendered="#{Aplicacion2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoDenominacionFilaMaestro1"
                                                    style="font-weight: bold"
                                                    text="#{Aplicacion2.gestor.denominacionFilaMaestro}"/>
                                                <webuijsf:image
                                                    id="imagenFilaMaestro1"
                                                    url="#{Aplicacion2.gestor.urlImagenMaestroFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdAplicacion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Aplicacion2.labelIdAplicacion1}"
                                                    id="labelIdAplicacion1"
                                                    for="campoIdAplicacion1"
                                                    toolTip="BundleParametros.id_aplicacion.aplicacion"
                                                    text="identificaci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdAplicacion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdAplicacion1"
                                                    binding="#{Aplicacion2.campoIdAplicacion1}"
                                                    converter="#{Aplicacion2.converterIdAplicacion1}"
                                                    readOnly="#{Aplicacion2.gestor.filaNoProcesada}" required="true"
                                                    text="#{Aplicacion2.aplicacionDataProvider.value['id_aplicacion']}"
                                                    toolTip="BundleParametros.id_aplicacion.aplicacion"
                                                    validatorExpression="#{Aplicacion2.validatorIdAplicacion1.validate}"/>
                                                <webuijsf:staticText id="campoIdAplicacion1Texto1"
                                                    binding="#{Aplicacion2.campoIdAplicacion1Texto1}"
                                                    text="#{Aplicacion2.aplicacionDataProvider.value['id_aplicacion']}"/>
                                                <webuijsf:message id="messageIdAplicacion1"
                                                    for="campoIdAplicacion1"/>
                                                <webuijsf:helpInline id="helpInlineIdAplicacion1"
                                                    binding="#{Aplicacion2.helpInlineIdAplicacion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_aplicacion.aplicacion"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridCodigoAplicacion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Aplicacion2.labelCodigoAplicacion1}"
                                                    id="labelCodigoAplicacion1"
                                                    for="campoCodigoAplicacion1"
                                                    toolTip="BundleParametros.codigo_aplicacion.aplicacion"
                                                    text="c&#243;digo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridCodigoAplicacion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoCodigoAplicacion1"
                                                    binding="#{Aplicacion2.campoCodigoAplicacion1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{Aplicacion2.gestor.filaNoProcesada}" required="true"
                                                    text="#{Aplicacion2.aplicacionDataProvider.value['codigo_aplicacion']}"
                                                    toolTip="BundleParametros.codigo_aplicacion.aplicacion"
                                                    validatorExpression="#{Aplicacion2.validatorCodigoAplicacion1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoAplicacion1Texto1"
                                                    binding="#{Aplicacion2.campoCodigoAplicacion1Texto1}"
                                                    text="#{Aplicacion2.aplicacionDataProvider.value['codigo_aplicacion']}"/>
                                                <webuijsf:message id="messageCodigoAplicacion1"
                                                    for="campoCodigoAplicacion1"/>
                                                <webuijsf:helpInline id="helpInlineCodigoAplicacion1"
                                                    binding="#{Aplicacion2.helpInlineCodigoAplicacion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.codigo_aplicacion.aplicacion"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNombreAplicacion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Aplicacion2.labelNombreAplicacion1}"
                                                    id="labelNombreAplicacion1"
                                                    for="campoNombreAplicacion1"
                                                    toolTip="BundleParametros.nombre_aplicacion.aplicacion"
                                                    text="nombre"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNombreAplicacion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNombreAplicacion1"
                                                    binding="#{Aplicacion2.campoNombreAplicacion1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{Aplicacion2.gestor.filaNoProcesada}"
                                                    text="#{Aplicacion2.aplicacionDataProvider.value['nombre_aplicacion']}"
                                                    toolTip="BundleParametros.nombre_aplicacion.aplicacion"
                                                    validatorExpression="#{Aplicacion2.validatorNombreAplicacion1.validate}"/>
                                                <webuijsf:staticText id="campoNombreAplicacion1Texto1"
                                                    binding="#{Aplicacion2.campoNombreAplicacion1Texto1}"
                                                    text="#{Aplicacion2.aplicacionDataProvider.value['nombre_aplicacion']}"/>
                                                <webuijsf:message id="messageNombreAplicacion1"
                                                    for="campoNombreAplicacion1"/>
                                                <webuijsf:helpInline id="helpInlineNombreAplicacion1"
                                                    binding="#{Aplicacion2.helpInlineNombreAplicacion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.nombre_aplicacion.aplicacion"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridDescripcionAplicacion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Aplicacion2.labelDescripcionAplicacion1}"
                                                    id="labelDescripcionAplicacion1"
                                                    for="campoDescripcionAplicacion1"
                                                    toolTip="BundleParametros.descripcion_aplicacion.aplicacion"
                                                    text="descripci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridDescripcionAplicacion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoDescripcionAplicacion1"
                                                    binding="#{Aplicacion2.campoDescripcionAplicacion1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{Aplicacion2.gestor.filaNoProcesada}"
                                                    text="#{Aplicacion2.aplicacionDataProvider.value['descripcion_aplicacion']}"
                                                    toolTip="BundleParametros.descripcion_aplicacion.aplicacion"
                                                    validatorExpression="#{Aplicacion2.validatorDescripcionAplicacion1.validate}"/>
                                                <webuijsf:staticText id="campoDescripcionAplicacion1Texto1"
                                                    binding="#{Aplicacion2.campoDescripcionAplicacion1Texto1}"
                                                    text="#{Aplicacion2.aplicacionDataProvider.value['descripcion_aplicacion']}"/>
                                                <webuijsf:message id="messageDescripcionAplicacion1"
                                                    for="campoDescripcionAplicacion1"/>
                                                <webuijsf:helpInline id="helpInlineDescripcionAplicacion1"
                                                    binding="#{Aplicacion2.helpInlineDescripcionAplicacion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.descripcion_aplicacion.aplicacion"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridServidorAplicacion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Aplicacion2.labelServidorAplicacion1}"
                                                    id="labelServidorAplicacion1"
                                                    for="campoServidorAplicacion1"
                                                    toolTip="BundleParametros.servidor_aplicacion.aplicacion"
                                                    text="servidor"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridServidorAplicacion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoServidorAplicacion1"
                                                    binding="#{Aplicacion2.campoServidorAplicacion1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{Aplicacion2.gestor.filaNoProcesada}" required="true"
                                                    text="#{Aplicacion2.aplicacionDataProvider.value['servidor_aplicacion']}"
                                                    toolTip="BundleParametros.servidor_aplicacion.aplicacion"
                                                    validatorExpression="#{Aplicacion2.validatorServidorAplicacion1.validate}"/>
                                                <webuijsf:staticText id="campoServidorAplicacion1Texto1"
                                                    binding="#{Aplicacion2.campoServidorAplicacion1Texto1}"
                                                    text="#{Aplicacion2.aplicacionDataProvider.value['servidor_aplicacion']}"/>
                                                <webuijsf:message id="messageServidorAplicacion1"
                                                    for="campoServidorAplicacion1"/>
                                                <webuijsf:helpInline id="helpInlineServidorAplicacion1"
                                                    binding="#{Aplicacion2.helpInlineServidorAplicacion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.servidor_aplicacion.aplicacion"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPuertoAplicacion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Aplicacion2.labelPuertoAplicacion1}"
                                                    id="labelPuertoAplicacion1"
                                                    for="campoPuertoAplicacion1"
                                                    toolTip="BundleParametros.puerto_aplicacion.aplicacion"
                                                    text="puerto"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPuertoAplicacion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoPuertoAplicacion1"
                                                    binding="#{Aplicacion2.campoPuertoAplicacion1}"
                                                    columns="10"
                                                    maxLength="10"
                                                    readOnly="#{Aplicacion2.gestor.filaNoProcesada}" required="true"
                                                    text="#{Aplicacion2.aplicacionDataProvider.value['puerto_aplicacion']}"
                                                    toolTip="BundleParametros.puerto_aplicacion.aplicacion"
                                                    validatorExpression="#{Aplicacion2.validatorPuertoAplicacion1.validate}"/>
                                                <webuijsf:staticText id="campoPuertoAplicacion1Texto1"
                                                    binding="#{Aplicacion2.campoPuertoAplicacion1Texto1}"
                                                    text="#{Aplicacion2.aplicacionDataProvider.value['puerto_aplicacion']}"/>
                                                <webuijsf:message id="messagePuertoAplicacion1"
                                                    for="campoPuertoAplicacion1"/>
                                                <webuijsf:helpInline id="helpInlinePuertoAplicacion1"
                                                    binding="#{Aplicacion2.helpInlinePuertoAplicacion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.puerto_aplicacion.aplicacion"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridUrlAplicacion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Aplicacion2.labelUrlAplicacion1}"
                                                    id="labelUrlAplicacion1"
                                                    for="campoUrlAplicacion1"
                                                    toolTip="BundleParametros.url_aplicacion.aplicacion"
                                                    text="url"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridUrlAplicacion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoUrlAplicacion1"
                                                    binding="#{Aplicacion2.campoUrlAplicacion1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{Aplicacion2.gestor.filaNoProcesada}"
                                                    text="#{Aplicacion2.aplicacionDataProvider.value['url_aplicacion']}"
                                                    toolTip="BundleParametros.url_aplicacion.aplicacion"
                                                    validatorExpression="#{Aplicacion2.validatorUrlAplicacion1.validate}"/>
                                                <webuijsf:staticText id="campoUrlAplicacion1Texto1"
                                                    binding="#{Aplicacion2.campoUrlAplicacion1Texto1}"
                                                    text="#{Aplicacion2.aplicacionDataProvider.value['url_aplicacion']}"/>
                                                <webuijsf:message id="messageUrlAplicacion1"
                                                    for="campoUrlAplicacion1"/>
                                                <webuijsf:helpInline id="helpInlineUrlAplicacion1"
                                                    binding="#{Aplicacion2.helpInlineUrlAplicacion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.url_aplicacion.aplicacion"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsPublica1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Aplicacion2.labelEsPublica1}"
                                                    id="labelEsPublica1"
                                                    for="listaEsPublica1"
                                                    toolTip="BundleParametros.es_publica.aplicacion"
                                                    text="p&#250;blica"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsPublica2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsPublica1"
                                                    binding="#{Aplicacion2.listaEsPublica1}"
                                                    converter="#{Aplicacion2.converterEsPublica1}"
                                                    disabled="#{Aplicacion2.gestor.filaNoProcesada}" required="true"
                                                    items="#{Aplicacion2.asistente.opcionesListaEsPublica1}"
                                                    selected="#{Aplicacion2.aplicacionDataProvider.value['es_publica']}"
                                                    toolTip="BundleParametros.es_publica.aplicacion"/>
                                                <webuijsf:staticText id="listaEsPublica1Texto1"
                                                    binding="#{Aplicacion2.listaEsPublica1Texto1}"/>
                                                <webuijsf:message id="messageEsPublica1"
                                                    for="listaEsPublica1"/>
                                                <webuijsf:helpInline id="helpInlineEsPublica1"
                                                    binding="#{Aplicacion2.helpInlineEsPublica1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_publica.aplicacion"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdGrupoAplicacion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Aplicacion2.labelIdGrupoAplicacion1}"
                                                    id="labelIdGrupoAplicacion1"
                                                    for="campoIdGrupoAplicacion1"
                                                    toolTip="BundleParametros.id_grupo_aplicacion.aplicacion"
                                                    text="grupo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdGrupoAplicacion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdGrupoAplicacion1"
                                                    binding="#{Aplicacion2.campoIdGrupoAplicacion1}"
                                                    readOnly="#{Aplicacion2.gestor.filaNoProcesada}"
                                                    text="#{Aplicacion2.asistente.textoCampoIdGrupoAplicacion1}"
                                                    toolTip="#{Aplicacion2.asistente.toolTipCampoIdGrupoAplicacion1}"
                                                    validatorExpression="#{Aplicacion2.campoIdGrupoAplicacion1_validate}"/>
                                                <webuijsf:staticText id="campoIdGrupoAplicacion1Texto1"
                                                    binding="#{Aplicacion2.campoIdGrupoAplicacion1Texto1}"
                                                    text="#{Aplicacion2.aplicacionDataProvider.value['codigo_grupo_aplicacion_1x1y3']}"/>
                                                <webuijsf:button id="campoIdGrupoAplicacion1Boton1"
                                                    binding="#{Aplicacion2.campoIdGrupoAplicacion1Boton1}"
                                                    onClick="#{Aplicacion2.asistente.scriptCampoIdGrupoAplicacion1Boton1}"/>
                                                <webuijsf:button id="campoIdGrupoAplicacion1Boton3"
                                                    binding="#{Aplicacion2.campoIdGrupoAplicacion1Boton3}"
                                                    onClick="#{Aplicacion2.asistente.scriptCampoIdGrupoAplicacion1Boton2}"
                                                    rendered="#{Aplicacion2.asistente.campoIdGrupoAplicacion1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdGrupoAplicacion1"
                                                    for="campoIdGrupoAplicacion1"/>
                                                <webuijsf:helpInline id="helpInlineIdGrupoAplicacion1"
                                                    binding="#{Aplicacion2.helpInlineIdGrupoAplicacion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_grupo_aplicacion.aplicacion"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdGrupoAplicacion3"
                                                rendered="#{Aplicacion2.asistente.campoIdGrupoAplicacion1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Aplicacion2.labelIdGrupoAplicacion2}"
                                                    id="labelIdGrupoAplicacion2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre grupo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdGrupoAplicacion4"
                                                rendered="#{Aplicacion2.asistente.campoIdGrupoAplicacion1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{Aplicacion2.campoIdGrupoAplicacion1Texto2}"
                                                    text="#{Aplicacion2.aplicacionDataProvider.value['nombre_grupo_aplicacion_1x1y4']}"
                                                    id="campoIdGrupoAplicacion1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{Aplicacion2.campoIdGrupoAplicacion1Boton2}"
                                                    id="campoIdGrupoAplicacion1Boton2"
                                                    onClick="#{Aplicacion2.asistente.scriptCampoIdGrupoAplicacion1Boton2}"/>
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
                                                        actionExpression="#{Aplicacion2.botonIrAlPrimero2_action}"
                                                        binding="#{Aplicacion2.botonIrAlPrimero2}"
                                                        disabled="#{Aplicacion2.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero2"
                                                        imageURL="#{Aplicacion2.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{Aplicacion2.gestor.scriptIrAlPrimero}"
                                                        text="#{Aplicacion2.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{Aplicacion2.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Aplicacion2.botonIrAlAnterior2_action}"
                                                        binding="#{Aplicacion2.botonIrAlAnterior2}"
                                                        disabled="#{Aplicacion2.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior2"
                                                        imageURL="#{Aplicacion2.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{Aplicacion2.gestor.scriptIrAlAnterior}"
                                                        text="#{Aplicacion2.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{Aplicacion2.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Aplicacion2.botonIrAlSiguiente2_action}"
                                                        binding="#{Aplicacion2.botonIrAlSiguiente2}"
                                                        disabled="#{Aplicacion2.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente2"
                                                        imageURL="#{Aplicacion2.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{Aplicacion2.gestor.scriptIrAlSiguiente}"
                                                        text="#{Aplicacion2.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{Aplicacion2.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Aplicacion2.botonIrAlUltimo2_action}"
                                                        binding="#{Aplicacion2.botonIrAlUltimo2}"
                                                        disabled="#{Aplicacion2.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo2"
                                                        imageURL="#{Aplicacion2.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{Aplicacion2.gestor.scriptIrAlUltimo}"
                                                        text="#{Aplicacion2.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{Aplicacion2.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Aplicacion2.botonProcesarFila2_action}"
                                                        binding="#{Aplicacion2.botonProcesarFila2}"
                                                        disabled="#{Aplicacion2.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila2"
                                                        imageURL="#{Aplicacion2.gestor.urlImagenProcesar}"
                                                        onClick="#{Aplicacion2.scriptAbrirVentanaProcesarFila2}"
                                                        rendered="#{Aplicacion2.asistente.comandoDisponible}"
                                                        text="#{Aplicacion2.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{Aplicacion2.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{Aplicacion2.gestor.mensajeCambiosPorConfirmar}"/>
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
                                                    actionExpression="#{Aplicacion2.botonAgregar1_action}"
                                                    binding="#{Aplicacion2.botonAgregar1}"
                                                    disabled="#{Aplicacion2.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{Aplicacion2.gestor.scriptAgregar}"
                                                    rendered="#{Aplicacion2.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Aplicacion2.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{Aplicacion2.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{Aplicacion2.listaFuncionEdicion1}"
                                                    converter="#{Aplicacion2.converterListaFuncionEdicion1}"
                                                    disabled="#{Aplicacion2.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{Aplicacion2.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{Aplicacion2.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{Aplicacion2.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{Aplicacion2.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Aplicacion2.botonEditar1_action}"
                                                    binding="#{Aplicacion2.botonEditar1}"
                                                    disabled="#{Aplicacion2.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{Aplicacion2.gestor.scriptEditar}"
                                                    rendered="#{Aplicacion2.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Aplicacion2.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{Aplicacion2.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Aplicacion2.botonEliminar1_action}"
                                                    binding="#{Aplicacion2.botonEliminar1}"
                                                    disabled="#{Aplicacion2.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{Aplicacion2.gestor.scriptEliminar}"
                                                    rendered="#{Aplicacion2.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Aplicacion2.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{Aplicacion2.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Aplicacion2.botonAplicar1_action}"
                                                    binding="#{Aplicacion2.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{Aplicacion2.gestor.scriptAplicar}"
                                                    rendered="#{Aplicacion2.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Aplicacion2.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{Aplicacion2.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Aplicacion2.botonDeshacer1_action}"
                                                    binding="#{Aplicacion2.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{Aplicacion2.gestor.scriptDeshacer}"
                                                    rendered="#{Aplicacion2.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Aplicacion2.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{Aplicacion2.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Aplicacion2.botonConfirmar1_action}"
                                                    binding="#{Aplicacion2.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{Aplicacion2.gestor.scriptConfirmar}"
                                                    rendered="#{Aplicacion2.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Aplicacion2.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{Aplicacion2.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Aplicacion2.botonDescartar1_action}"
                                                    binding="#{Aplicacion2.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{Aplicacion2.gestor.scriptDescartar}"
                                                    rendered="#{Aplicacion2.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Aplicacion2.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{Aplicacion2.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{Aplicacion2.listaFuncionAccion1}"
                                                    converter="#{Aplicacion2.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{Aplicacion2.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{Aplicacion2.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{Aplicacion2.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{Aplicacion2.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Aplicacion2.botonProcesar1_action}"
                                                    binding="#{Aplicacion2.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{Aplicacion2.gestor.scriptProcesar}"
                                                    rendered="#{Aplicacion2.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Aplicacion2.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{Aplicacion2.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Aplicacion2.botonRefrescar1_action}"
                                                    binding="#{Aplicacion2.botonRefrescar1}"
                                                    disabled="#{Aplicacion2.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{Aplicacion2.gestor.scriptRefrescar}"
                                                    rendered="#{Aplicacion2.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Aplicacion2.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{Aplicacion2.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Aplicacion2.botonReconsultar1_action}"
                                                    binding="#{Aplicacion2.botonReconsultar1}"
                                                    disabled="#{Aplicacion2.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{Aplicacion2.gestor.scriptReconsultar}"
                                                    rendered="#{Aplicacion2.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Aplicacion2.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{Aplicacion2.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Aplicacion2.botonRetornar1_action}"
                                                    binding="#{Aplicacion2.botonRetornar1}"
                                                    disabled="#{Aplicacion2.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{Aplicacion2.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{Aplicacion2.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Aplicacion2.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{Aplicacion2.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="3" 
                                                id="gridPanel125"
                                                rendered="#{Aplicacion2.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{Aplicacion2.imageHyperlink1_action}"
                                                    binding="#{Aplicacion2.imageHyperlink1}"
                                                    disabled="#{Aplicacion2.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{Aplicacion2.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{Aplicacion2.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.Aplicacion2_imageHyperlink1_toolTip}"/>
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{Aplicacion2.imageHyperlink2_action}"
                                                    binding="#{Aplicacion2.imageHyperlink2}"
                                                    disabled="#{Aplicacion2.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink2"
                                                    imageURL="#{Aplicacion2.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{Aplicacion2.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    text="Hyperlink2"
                                                    toolTip="#{bundle.Aplicacion2_imageHyperlink2_toolTip}"/>
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{Aplicacion2.imageHyperlink3_action}"
                                                    binding="#{Aplicacion2.imageHyperlink3}"
                                                    disabled="#{Aplicacion2.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink3"
                                                    imageURL="#{Aplicacion2.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{Aplicacion2.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{Aplicacion2.gestor.designing}"
                                                    text="Hyperlink3"
                                                    toolTip="#{bundle.Aplicacion2_imageHyperlink3_toolTip}"/>
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
