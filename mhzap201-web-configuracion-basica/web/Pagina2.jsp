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
                    focus="#{Pagina2.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{Pagina2.gestor.preserveFocus}"
                    preserveScroll="#{Pagina2.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{Pagina2.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | campoIdPagina1 campoCodigoPagina1 campoNombrePagina1 campoDescripcionPagina1 campoUrlPagina1 campoIdAplicacion1 listaEsPublica1 listaNumeroTipoPagina1 campoIdDominio1 campoIdDominioMaestro1 campoIdParametro1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | | , virtualForm3 | listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{Pagina2.breadcrumbs1}" 
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
                                                    rendered="#{Pagina2.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{Pagina2.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{Pagina2.gestor.mensajeDisponible}"
                                                    text="#{Pagina2.gestor.mensaje}"
                                                    url="#{Pagina2.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            id="gridPanel104"
                                            rendered="#{Pagina2.gestor.filaDisponible}"
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
                                                        actionExpression="#{Pagina2.botonIrAlPrimero1_action}"
                                                        binding="#{Pagina2.botonIrAlPrimero1}"
                                                        disabled="#{Pagina2.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero1"
                                                        imageURL="#{Pagina2.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{Pagina2.gestor.scriptIrAlPrimero}"
                                                        text="#{Pagina2.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{Pagina2.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Pagina2.botonIrAlAnterior1_action}"
                                                        binding="#{Pagina2.botonIrAlAnterior1}"
                                                        disabled="#{Pagina2.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior1"
                                                        imageURL="#{Pagina2.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{Pagina2.gestor.scriptIrAlAnterior}"
                                                        text="#{Pagina2.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{Pagina2.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Pagina2.botonIrAlSiguiente1_action}"
                                                        binding="#{Pagina2.botonIrAlSiguiente1}"
                                                        disabled="#{Pagina2.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente1"
                                                        imageURL="#{Pagina2.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{Pagina2.gestor.scriptIrAlSiguiente}"
                                                        text="#{Pagina2.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{Pagina2.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Pagina2.botonIrAlUltimo1_action}"
                                                        binding="#{Pagina2.botonIrAlUltimo1}"
                                                        disabled="#{Pagina2.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo1"
                                                        imageURL="#{Pagina2.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{Pagina2.gestor.scriptIrAlUltimo}"
                                                        text="#{Pagina2.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{Pagina2.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Pagina2.botonProcesarFila1_action}"
                                                        binding="#{Pagina2.botonProcesarFila1}"
                                                        disabled="#{Pagina2.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila1"
                                                        imageURL="#{Pagina2.gestor.urlImagenProcesar}"
                                                        onClick="#{Pagina2.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{Pagina2.asistente.comandoDisponible}"
                                                        text="#{Pagina2.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{Pagina2.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{Pagina2.gestor.tituloConsulta}"/>
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
                                                    binding="#{Pagina2.etiquetaIdentificacionFila1}"
                                                    id="etiquetaIdentificacionFila1"
                                                    text="#{Pagina2.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{Pagina2.gestor.i18n.toolTipEtiquetaIdentificacionFila}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel113"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoIdentificacionFila1"
                                                    style="font-weight: bold"
                                                    text="#{Pagina2.gestor.identificacionFila}"/>
                                                <webuijsf:image
                                                    id="imagenFilaProcesada1"
                                                    toolTip="#{Pagina2.gestor.toolTipImagenFilaProcesada}"
                                                    url="#{Pagina2.gestor.urlImagenFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPanel114"
                                                rendered="#{Pagina2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Pagina2.etiquetaDenominacionFilaMaestro1}"
                                                    id="etiquetaDenominacionFilaMaestro1"
                                                    text="?"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel115"
                                                rendered="#{Pagina2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoDenominacionFilaMaestro1"
                                                    style="font-weight: bold"
                                                    text="#{Pagina2.gestor.denominacionFilaMaestro}"/>
                                                <webuijsf:image
                                                    id="imagenFilaMaestro1"
                                                    url="#{Pagina2.gestor.urlImagenMaestroFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdPagina1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Pagina2.labelIdPagina1}"
                                                    id="labelIdPagina1"
                                                    for="campoIdPagina1"
                                                    toolTip="BundleParametros.id_pagina.pagina"
                                                    text="identificaci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdPagina2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdPagina1"
                                                    binding="#{Pagina2.campoIdPagina1}"
                                                    converter="#{Pagina2.converterIdPagina1}"
                                                    readOnly="#{Pagina2.gestor.filaNoProcesada}" required="true"
                                                    text="#{Pagina2.paginaDataProvider.value['id_pagina']}"
                                                    toolTip="BundleParametros.id_pagina.pagina"
                                                    validatorExpression="#{Pagina2.validatorIdPagina1.validate}"/>
                                                <webuijsf:staticText id="campoIdPagina1Texto1"
                                                    binding="#{Pagina2.campoIdPagina1Texto1}"
                                                    text="#{Pagina2.paginaDataProvider.value['id_pagina']}"/>
                                                <webuijsf:message id="messageIdPagina1"
                                                    for="campoIdPagina1"/>
                                                <webuijsf:helpInline id="helpInlineIdPagina1"
                                                    binding="#{Pagina2.helpInlineIdPagina1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_pagina.pagina"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridCodigoPagina1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Pagina2.labelCodigoPagina1}"
                                                    id="labelCodigoPagina1"
                                                    for="campoCodigoPagina1"
                                                    toolTip="BundleParametros.codigo_pagina.pagina"
                                                    text="c&#243;digo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridCodigoPagina2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoCodigoPagina1"
                                                    binding="#{Pagina2.campoCodigoPagina1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{Pagina2.gestor.filaNoProcesada}" required="true"
                                                    text="#{Pagina2.paginaDataProvider.value['codigo_pagina']}"
                                                    toolTip="BundleParametros.codigo_pagina.pagina"
                                                    validatorExpression="#{Pagina2.validatorCodigoPagina1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoPagina1Texto1"
                                                    binding="#{Pagina2.campoCodigoPagina1Texto1}"
                                                    text="#{Pagina2.paginaDataProvider.value['codigo_pagina']}"/>
                                                <webuijsf:message id="messageCodigoPagina1"
                                                    for="campoCodigoPagina1"/>
                                                <webuijsf:helpInline id="helpInlineCodigoPagina1"
                                                    binding="#{Pagina2.helpInlineCodigoPagina1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.codigo_pagina.pagina"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNombrePagina1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Pagina2.labelNombrePagina1}"
                                                    id="labelNombrePagina1"
                                                    for="campoNombrePagina1"
                                                    toolTip="BundleParametros.nombre_pagina.pagina"
                                                    text="nombre"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNombrePagina2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNombrePagina1"
                                                    binding="#{Pagina2.campoNombrePagina1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{Pagina2.gestor.filaNoProcesada}"
                                                    text="#{Pagina2.paginaDataProvider.value['nombre_pagina']}"
                                                    toolTip="BundleParametros.nombre_pagina.pagina"
                                                    validatorExpression="#{Pagina2.validatorNombrePagina1.validate}"/>
                                                <webuijsf:staticText id="campoNombrePagina1Texto1"
                                                    binding="#{Pagina2.campoNombrePagina1Texto1}"
                                                    text="#{Pagina2.paginaDataProvider.value['nombre_pagina']}"/>
                                                <webuijsf:message id="messageNombrePagina1"
                                                    for="campoNombrePagina1"/>
                                                <webuijsf:helpInline id="helpInlineNombrePagina1"
                                                    binding="#{Pagina2.helpInlineNombrePagina1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.nombre_pagina.pagina"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridDescripcionPagina1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Pagina2.labelDescripcionPagina1}"
                                                    id="labelDescripcionPagina1"
                                                    for="campoDescripcionPagina1"
                                                    toolTip="BundleParametros.descripcion_pagina.pagina"
                                                    text="descripci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridDescripcionPagina2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoDescripcionPagina1"
                                                    binding="#{Pagina2.campoDescripcionPagina1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{Pagina2.gestor.filaNoProcesada}"
                                                    text="#{Pagina2.paginaDataProvider.value['descripcion_pagina']}"
                                                    toolTip="BundleParametros.descripcion_pagina.pagina"
                                                    validatorExpression="#{Pagina2.validatorDescripcionPagina1.validate}"/>
                                                <webuijsf:staticText id="campoDescripcionPagina1Texto1"
                                                    binding="#{Pagina2.campoDescripcionPagina1Texto1}"
                                                    text="#{Pagina2.paginaDataProvider.value['descripcion_pagina']}"/>
                                                <webuijsf:message id="messageDescripcionPagina1"
                                                    for="campoDescripcionPagina1"/>
                                                <webuijsf:helpInline id="helpInlineDescripcionPagina1"
                                                    binding="#{Pagina2.helpInlineDescripcionPagina1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.descripcion_pagina.pagina"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridUrlPagina1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Pagina2.labelUrlPagina1}"
                                                    id="labelUrlPagina1"
                                                    for="campoUrlPagina1"
                                                    toolTip="BundleParametros.url_pagina.pagina"
                                                    text="url"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridUrlPagina2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoUrlPagina1"
                                                    binding="#{Pagina2.campoUrlPagina1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{Pagina2.gestor.filaNoProcesada}"
                                                    text="#{Pagina2.paginaDataProvider.value['url_pagina']}"
                                                    toolTip="BundleParametros.url_pagina.pagina"
                                                    validatorExpression="#{Pagina2.validatorUrlPagina1.validate}"/>
                                                <webuijsf:staticText id="campoUrlPagina1Texto1"
                                                    binding="#{Pagina2.campoUrlPagina1Texto1}"
                                                    text="#{Pagina2.paginaDataProvider.value['url_pagina']}"/>
                                                <webuijsf:message id="messageUrlPagina1"
                                                    for="campoUrlPagina1"/>
                                                <webuijsf:helpInline id="helpInlineUrlPagina1"
                                                    binding="#{Pagina2.helpInlineUrlPagina1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.url_pagina.pagina"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdAplicacion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Pagina2.labelIdAplicacion1}"
                                                    id="labelIdAplicacion1"
                                                    for="campoIdAplicacion1"
                                                    toolTip="BundleParametros.id_aplicacion.pagina"
                                                    text="aplicaci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdAplicacion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdAplicacion1"
                                                    binding="#{Pagina2.campoIdAplicacion1}"
                                                    readOnly="#{Pagina2.gestor.filaNoProcesada}" required="true"
                                                    text="#{Pagina2.asistente.textoCampoIdAplicacion1}"
                                                    toolTip="#{Pagina2.asistente.toolTipCampoIdAplicacion1}"
                                                    validatorExpression="#{Pagina2.campoIdAplicacion1_validate}"/>
                                                <webuijsf:staticText id="campoIdAplicacion1Texto1"
                                                    binding="#{Pagina2.campoIdAplicacion1Texto1}"
                                                    text="#{Pagina2.paginaDataProvider.value['codigo_aplicacion_1x1y3']}"/>
                                                <webuijsf:button id="campoIdAplicacion1Boton1"
                                                    binding="#{Pagina2.campoIdAplicacion1Boton1}"
                                                    onClick="#{Pagina2.asistente.scriptCampoIdAplicacion1Boton1}"/>
                                                <webuijsf:button id="campoIdAplicacion1Boton3"
                                                    binding="#{Pagina2.campoIdAplicacion1Boton3}"
                                                    onClick="#{Pagina2.asistente.scriptCampoIdAplicacion1Boton2}"
                                                    rendered="#{Pagina2.asistente.campoIdAplicacion1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdAplicacion1"
                                                    for="campoIdAplicacion1"/>
                                                <webuijsf:helpInline id="helpInlineIdAplicacion1"
                                                    binding="#{Pagina2.helpInlineIdAplicacion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_aplicacion.pagina"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdAplicacion3"
                                                rendered="#{Pagina2.asistente.campoIdAplicacion1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Pagina2.labelIdAplicacion2}"
                                                    id="labelIdAplicacion2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre aplicaci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdAplicacion4"
                                                rendered="#{Pagina2.asistente.campoIdAplicacion1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{Pagina2.campoIdAplicacion1Texto2}"
                                                    text="#{Pagina2.paginaDataProvider.value['nombre_aplicacion_1x1y4']}"
                                                    id="campoIdAplicacion1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{Pagina2.campoIdAplicacion1Boton2}"
                                                    id="campoIdAplicacion1Boton2"
                                                    onClick="#{Pagina2.asistente.scriptCampoIdAplicacion1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsPublica1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Pagina2.labelEsPublica1}"
                                                    id="labelEsPublica1"
                                                    for="listaEsPublica1"
                                                    toolTip="BundleParametros.es_publica.pagina"
                                                    text="p&#250;blica"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsPublica2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsPublica1"
                                                    binding="#{Pagina2.listaEsPublica1}"
                                                    converter="#{Pagina2.converterEsPublica1}"
                                                    disabled="#{Pagina2.gestor.filaNoProcesada}" required="true"
                                                    items="#{Pagina2.asistente.opcionesListaEsPublica1}"
                                                    selected="#{Pagina2.paginaDataProvider.value['es_publica']}"
                                                    toolTip="BundleParametros.es_publica.pagina"/>
                                                <webuijsf:staticText id="listaEsPublica1Texto1"
                                                    binding="#{Pagina2.listaEsPublica1Texto1}"/>
                                                <webuijsf:message id="messageEsPublica1"
                                                    for="listaEsPublica1"/>
                                                <webuijsf:helpInline id="helpInlineEsPublica1"
                                                    binding="#{Pagina2.helpInlineEsPublica1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_publica.pagina"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroTipoPagina1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Pagina2.labelNumeroTipoPagina1}"
                                                    id="labelNumeroTipoPagina1"
                                                    for="listaNumeroTipoPagina1"
                                                    toolTip="BundleParametros.numero_tipo_pagina.pagina"
                                                    text="tipo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTipoPagina2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroTipoPagina1"
                                                    binding="#{Pagina2.listaNumeroTipoPagina1}"
                                                    converter="#{Pagina2.converterNumeroTipoPagina1}"
                                                    disabled="#{Pagina2.gestor.filaNoProcesada}"
                                                    items="#{Pagina2.asistente.opcionesListaNumeroTipoPagina1}"
                                                    selected="#{Pagina2.paginaDataProvider.value['numero_tipo_pagina']}"
                                                    toolTip="BundleParametros.numero_tipo_pagina.pagina"/>
                                                <webuijsf:staticText id="listaNumeroTipoPagina1Texto1"
                                                    binding="#{Pagina2.listaNumeroTipoPagina1Texto1}"
                                                    text="#{Pagina2.paginaDataProvider.value['codigo_tipo_pagina_1x2y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoPagina1"
                                                    for="listaNumeroTipoPagina1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTipoPagina1"
                                                    binding="#{Pagina2.helpInlineNumeroTipoPagina1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_tipo_pagina.pagina"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdDominio1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Pagina2.labelIdDominio1}"
                                                    id="labelIdDominio1"
                                                    for="campoIdDominio1"
                                                    toolTip="BundleParametros.id_dominio.pagina"
                                                    text="dominio"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdDominio2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdDominio1"
                                                    binding="#{Pagina2.campoIdDominio1}"
                                                    readOnly="#{Pagina2.gestor.filaNoProcesada}"
                                                    text="#{Pagina2.asistente.textoCampoIdDominio1}"
                                                    toolTip="#{Pagina2.asistente.toolTipCampoIdDominio1}"
                                                    validatorExpression="#{Pagina2.campoIdDominio1_validate}"/>
                                                <webuijsf:staticText id="campoIdDominio1Texto1"
                                                    binding="#{Pagina2.campoIdDominio1Texto1}"
                                                    text="#{Pagina2.paginaDataProvider.value['codigo_dominio_1x3y3']}"/>
                                                <webuijsf:button id="campoIdDominio1Boton1"
                                                    binding="#{Pagina2.campoIdDominio1Boton1}"
                                                    onClick="#{Pagina2.asistente.scriptCampoIdDominio1Boton1}"/>
                                                <webuijsf:button id="campoIdDominio1Boton3"
                                                    binding="#{Pagina2.campoIdDominio1Boton3}"
                                                    onClick="#{Pagina2.asistente.scriptCampoIdDominio1Boton2}"
                                                    rendered="#{Pagina2.asistente.campoIdDominio1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdDominio1"
                                                    for="campoIdDominio1"/>
                                                <webuijsf:helpInline id="helpInlineIdDominio1"
                                                    binding="#{Pagina2.helpInlineIdDominio1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_dominio.pagina"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdDominio3"
                                                rendered="#{Pagina2.asistente.campoIdDominio1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Pagina2.labelIdDominio2}"
                                                    id="labelIdDominio2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre dominio"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdDominio4"
                                                rendered="#{Pagina2.asistente.campoIdDominio1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{Pagina2.campoIdDominio1Texto2}"
                                                    text="#{Pagina2.paginaDataProvider.value['nombre_dominio_1x3y4']}"
                                                    id="campoIdDominio1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{Pagina2.campoIdDominio1Boton2}"
                                                    id="campoIdDominio1Boton2"
                                                    onClick="#{Pagina2.asistente.scriptCampoIdDominio1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdDominioMaestro1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Pagina2.labelIdDominioMaestro1}"
                                                    id="labelIdDominioMaestro1"
                                                    for="campoIdDominioMaestro1"
                                                    toolTip="BundleParametros.id_dominio_maestro.pagina"
                                                    text="dominio maestro"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdDominioMaestro2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdDominioMaestro1"
                                                    binding="#{Pagina2.campoIdDominioMaestro1}"
                                                    readOnly="#{Pagina2.gestor.filaNoProcesada}"
                                                    text="#{Pagina2.asistente.textoCampoIdDominioMaestro1}"
                                                    toolTip="#{Pagina2.asistente.toolTipCampoIdDominioMaestro1}"
                                                    validatorExpression="#{Pagina2.campoIdDominioMaestro1_validate}"/>
                                                <webuijsf:staticText id="campoIdDominioMaestro1Texto1"
                                                    binding="#{Pagina2.campoIdDominioMaestro1Texto1}"
                                                    text="#{Pagina2.paginaDataProvider.value['codigo_dominio_1x4y3']}"/>
                                                <webuijsf:button id="campoIdDominioMaestro1Boton1"
                                                    binding="#{Pagina2.campoIdDominioMaestro1Boton1}"
                                                    onClick="#{Pagina2.asistente.scriptCampoIdDominioMaestro1Boton1}"/>
                                                <webuijsf:button id="campoIdDominioMaestro1Boton3"
                                                    binding="#{Pagina2.campoIdDominioMaestro1Boton3}"
                                                    onClick="#{Pagina2.asistente.scriptCampoIdDominioMaestro1Boton2}"
                                                    rendered="#{Pagina2.asistente.campoIdDominioMaestro1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdDominioMaestro1"
                                                    for="campoIdDominioMaestro1"/>
                                                <webuijsf:helpInline id="helpInlineIdDominioMaestro1"
                                                    binding="#{Pagina2.helpInlineIdDominioMaestro1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_dominio_maestro.pagina"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdDominioMaestro3"
                                                rendered="#{Pagina2.asistente.campoIdDominioMaestro1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Pagina2.labelIdDominioMaestro2}"
                                                    id="labelIdDominioMaestro2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre dominio maestro"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdDominioMaestro4"
                                                rendered="#{Pagina2.asistente.campoIdDominioMaestro1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{Pagina2.campoIdDominioMaestro1Texto2}"
                                                    text="#{Pagina2.paginaDataProvider.value['nombre_dominio_1x4y4']}"
                                                    id="campoIdDominioMaestro1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{Pagina2.campoIdDominioMaestro1Boton2}"
                                                    id="campoIdDominioMaestro1Boton2"
                                                    onClick="#{Pagina2.asistente.scriptCampoIdDominioMaestro1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdParametro1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Pagina2.labelIdParametro1}"
                                                    id="labelIdParametro1"
                                                    for="campoIdParametro1"
                                                    toolTip="BundleParametros.id_parametro.pagina"
                                                    text="parametro"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdParametro2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdParametro1"
                                                    binding="#{Pagina2.campoIdParametro1}"
                                                    readOnly="#{Pagina2.gestor.filaNoProcesada}"
                                                    text="#{Pagina2.asistente.textoCampoIdParametro1}"
                                                    toolTip="#{Pagina2.asistente.toolTipCampoIdParametro1}"
                                                    validatorExpression="#{Pagina2.campoIdParametro1_validate}"/>
                                                <webuijsf:staticText id="campoIdParametro1Texto1"
                                                    binding="#{Pagina2.campoIdParametro1Texto1}"
                                                    text="#{Pagina2.paginaDataProvider.value['codigo_parametro_1x5y3']}"/>
                                                <webuijsf:button id="campoIdParametro1Boton1"
                                                    binding="#{Pagina2.campoIdParametro1Boton1}"
                                                    onClick="#{Pagina2.asistente.scriptCampoIdParametro1Boton1}"/>
                                                <webuijsf:button id="campoIdParametro1Boton3"
                                                    binding="#{Pagina2.campoIdParametro1Boton3}"
                                                    onClick="#{Pagina2.asistente.scriptCampoIdParametro1Boton2}"
                                                    rendered="#{Pagina2.asistente.campoIdParametro1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdParametro1"
                                                    for="campoIdParametro1"/>
                                                <webuijsf:helpInline id="helpInlineIdParametro1"
                                                    binding="#{Pagina2.helpInlineIdParametro1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_parametro.pagina"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdParametro3"
                                                rendered="#{Pagina2.asistente.campoIdParametro1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Pagina2.labelIdParametro2}"
                                                    id="labelIdParametro2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre parametro"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdParametro4"
                                                rendered="#{Pagina2.asistente.campoIdParametro1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{Pagina2.campoIdParametro1Texto2}"
                                                    text="#{Pagina2.paginaDataProvider.value['nombre_parametro_1x5y4']}"
                                                    id="campoIdParametro1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{Pagina2.campoIdParametro1Boton2}"
                                                    id="campoIdParametro1Boton2"
                                                    onClick="#{Pagina2.asistente.scriptCampoIdParametro1Boton2}"/>
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
                                                        actionExpression="#{Pagina2.botonIrAlPrimero2_action}"
                                                        binding="#{Pagina2.botonIrAlPrimero2}"
                                                        disabled="#{Pagina2.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero2"
                                                        imageURL="#{Pagina2.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{Pagina2.gestor.scriptIrAlPrimero}"
                                                        text="#{Pagina2.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{Pagina2.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Pagina2.botonIrAlAnterior2_action}"
                                                        binding="#{Pagina2.botonIrAlAnterior2}"
                                                        disabled="#{Pagina2.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior2"
                                                        imageURL="#{Pagina2.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{Pagina2.gestor.scriptIrAlAnterior}"
                                                        text="#{Pagina2.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{Pagina2.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Pagina2.botonIrAlSiguiente2_action}"
                                                        binding="#{Pagina2.botonIrAlSiguiente2}"
                                                        disabled="#{Pagina2.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente2"
                                                        imageURL="#{Pagina2.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{Pagina2.gestor.scriptIrAlSiguiente}"
                                                        text="#{Pagina2.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{Pagina2.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Pagina2.botonIrAlUltimo2_action}"
                                                        binding="#{Pagina2.botonIrAlUltimo2}"
                                                        disabled="#{Pagina2.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo2"
                                                        imageURL="#{Pagina2.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{Pagina2.gestor.scriptIrAlUltimo}"
                                                        text="#{Pagina2.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{Pagina2.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Pagina2.botonProcesarFila2_action}"
                                                        binding="#{Pagina2.botonProcesarFila2}"
                                                        disabled="#{Pagina2.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila2"
                                                        imageURL="#{Pagina2.gestor.urlImagenProcesar}"
                                                        onClick="#{Pagina2.scriptAbrirVentanaProcesarFila2}"
                                                        rendered="#{Pagina2.asistente.comandoDisponible}"
                                                        text="#{Pagina2.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{Pagina2.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{Pagina2.gestor.mensajeCambiosPorConfirmar}"/>
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
                                                    actionExpression="#{Pagina2.botonAgregar1_action}"
                                                    binding="#{Pagina2.botonAgregar1}"
                                                    disabled="#{Pagina2.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{Pagina2.gestor.scriptAgregar}"
                                                    rendered="#{Pagina2.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Pagina2.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{Pagina2.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{Pagina2.listaFuncionEdicion1}"
                                                    converter="#{Pagina2.converterListaFuncionEdicion1}"
                                                    disabled="#{Pagina2.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{Pagina2.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{Pagina2.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{Pagina2.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{Pagina2.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Pagina2.botonEditar1_action}"
                                                    binding="#{Pagina2.botonEditar1}"
                                                    disabled="#{Pagina2.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{Pagina2.gestor.scriptEditar}"
                                                    rendered="#{Pagina2.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Pagina2.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{Pagina2.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Pagina2.botonEliminar1_action}"
                                                    binding="#{Pagina2.botonEliminar1}"
                                                    disabled="#{Pagina2.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{Pagina2.gestor.scriptEliminar}"
                                                    rendered="#{Pagina2.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Pagina2.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{Pagina2.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Pagina2.botonAplicar1_action}"
                                                    binding="#{Pagina2.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{Pagina2.gestor.scriptAplicar}"
                                                    rendered="#{Pagina2.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Pagina2.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{Pagina2.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Pagina2.botonDeshacer1_action}"
                                                    binding="#{Pagina2.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{Pagina2.gestor.scriptDeshacer}"
                                                    rendered="#{Pagina2.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Pagina2.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{Pagina2.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Pagina2.botonConfirmar1_action}"
                                                    binding="#{Pagina2.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{Pagina2.gestor.scriptConfirmar}"
                                                    rendered="#{Pagina2.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Pagina2.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{Pagina2.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Pagina2.botonDescartar1_action}"
                                                    binding="#{Pagina2.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{Pagina2.gestor.scriptDescartar}"
                                                    rendered="#{Pagina2.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Pagina2.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{Pagina2.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{Pagina2.listaFuncionAccion1}"
                                                    converter="#{Pagina2.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{Pagina2.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{Pagina2.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{Pagina2.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{Pagina2.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Pagina2.botonProcesar1_action}"
                                                    binding="#{Pagina2.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{Pagina2.gestor.scriptProcesar}"
                                                    rendered="#{Pagina2.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Pagina2.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{Pagina2.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Pagina2.botonRefrescar1_action}"
                                                    binding="#{Pagina2.botonRefrescar1}"
                                                    disabled="#{Pagina2.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{Pagina2.gestor.scriptRefrescar}"
                                                    rendered="#{Pagina2.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Pagina2.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{Pagina2.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Pagina2.botonReconsultar1_action}"
                                                    binding="#{Pagina2.botonReconsultar1}"
                                                    disabled="#{Pagina2.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{Pagina2.gestor.scriptReconsultar}"
                                                    rendered="#{Pagina2.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Pagina2.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{Pagina2.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Pagina2.botonRetornar1_action}"
                                                    binding="#{Pagina2.botonRetornar1}"
                                                    disabled="#{Pagina2.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{Pagina2.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{Pagina2.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Pagina2.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{Pagina2.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="2" 
                                                id="gridPanel125"
                                                rendered="#{Pagina2.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{Pagina2.imageHyperlink1_action}"
                                                    binding="#{Pagina2.imageHyperlink1}"
                                                    disabled="#{Pagina2.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{Pagina2.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{Pagina2.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.Pagina2_imageHyperlink1_toolTip}"/>
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{Pagina2.imageHyperlink2_action}"
                                                    binding="#{Pagina2.imageHyperlink2}"
                                                    disabled="#{Pagina2.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink2"
                                                    imageURL="#{Pagina2.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{Pagina2.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{Pagina2.gestor.designing}"
                                                    text="Hyperlink2"
                                                    toolTip="#{bundle.Pagina2_imageHyperlink2_toolTip}"/>
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
