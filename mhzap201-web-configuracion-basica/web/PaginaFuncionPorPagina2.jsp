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
                    focus="#{PaginaFuncionPorPagina2.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{PaginaFuncionPorPagina2.gestor.preserveFocus}"
                    preserveScroll="#{PaginaFuncionPorPagina2.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{PaginaFuncionPorPagina2.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | campoIdPaginaFuncion1 campoIdFuncion1 listaEsFuncionInicial1 campoControlPaginaFuncion1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | | , virtualForm3 | listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{PaginaFuncionPorPagina2.breadcrumbs1}" 
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
                                                    rendered="#{PaginaFuncionPorPagina2.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{PaginaFuncionPorPagina2.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{PaginaFuncionPorPagina2.gestor.mensajeDisponible}"
                                                    text="#{PaginaFuncionPorPagina2.gestor.mensaje}"
                                                    url="#{PaginaFuncionPorPagina2.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            id="gridPanel104"
                                            rendered="#{PaginaFuncionPorPagina2.gestor.filaDisponible}"
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
                                                        actionExpression="#{PaginaFuncionPorPagina2.botonIrAlPrimero1_action}"
                                                        binding="#{PaginaFuncionPorPagina2.botonIrAlPrimero1}"
                                                        disabled="#{PaginaFuncionPorPagina2.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero1"
                                                        imageURL="#{PaginaFuncionPorPagina2.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{PaginaFuncionPorPagina2.gestor.scriptIrAlPrimero}"
                                                        text="#{PaginaFuncionPorPagina2.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{PaginaFuncionPorPagina2.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{PaginaFuncionPorPagina2.botonIrAlAnterior1_action}"
                                                        binding="#{PaginaFuncionPorPagina2.botonIrAlAnterior1}"
                                                        disabled="#{PaginaFuncionPorPagina2.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior1"
                                                        imageURL="#{PaginaFuncionPorPagina2.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{PaginaFuncionPorPagina2.gestor.scriptIrAlAnterior}"
                                                        text="#{PaginaFuncionPorPagina2.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{PaginaFuncionPorPagina2.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{PaginaFuncionPorPagina2.botonIrAlSiguiente1_action}"
                                                        binding="#{PaginaFuncionPorPagina2.botonIrAlSiguiente1}"
                                                        disabled="#{PaginaFuncionPorPagina2.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente1"
                                                        imageURL="#{PaginaFuncionPorPagina2.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{PaginaFuncionPorPagina2.gestor.scriptIrAlSiguiente}"
                                                        text="#{PaginaFuncionPorPagina2.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{PaginaFuncionPorPagina2.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{PaginaFuncionPorPagina2.botonIrAlUltimo1_action}"
                                                        binding="#{PaginaFuncionPorPagina2.botonIrAlUltimo1}"
                                                        disabled="#{PaginaFuncionPorPagina2.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo1"
                                                        imageURL="#{PaginaFuncionPorPagina2.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{PaginaFuncionPorPagina2.gestor.scriptIrAlUltimo}"
                                                        text="#{PaginaFuncionPorPagina2.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{PaginaFuncionPorPagina2.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{PaginaFuncionPorPagina2.botonProcesarFila1_action}"
                                                        binding="#{PaginaFuncionPorPagina2.botonProcesarFila1}"
                                                        disabled="#{PaginaFuncionPorPagina2.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila1"
                                                        imageURL="#{PaginaFuncionPorPagina2.gestor.urlImagenProcesar}"
                                                        onClick="#{PaginaFuncionPorPagina2.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{PaginaFuncionPorPagina2.asistente.comandoDisponible}"
                                                        text="#{PaginaFuncionPorPagina2.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{PaginaFuncionPorPagina2.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{PaginaFuncionPorPagina2.gestor.tituloConsulta}"/>
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
                                                    binding="#{PaginaFuncionPorPagina2.etiquetaIdentificacionFila1}"
                                                    id="etiquetaIdentificacionFila1"
                                                    text="#{PaginaFuncionPorPagina2.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{PaginaFuncionPorPagina2.gestor.i18n.toolTipEtiquetaIdentificacionFila}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel113"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoIdentificacionFila1"
                                                    style="font-weight: bold"
                                                    text="#{PaginaFuncionPorPagina2.gestor.identificacionFila}"/>
                                                <webuijsf:image
                                                    id="imagenFilaProcesada1"
                                                    toolTip="#{PaginaFuncionPorPagina2.gestor.toolTipImagenFilaProcesada}"
                                                    url="#{PaginaFuncionPorPagina2.gestor.urlImagenFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPanel114"
                                                rendered="#{PaginaFuncionPorPagina2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PaginaFuncionPorPagina2.labelIdPagina1}"
                                                    id="labelIdPagina1"
                                                    text="pagina"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel115"
                                                rendered="#{PaginaFuncionPorPagina2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoDenominacionFilaMaestro1"
                                                    style="font-weight: bold"
                                                    text="#{PaginaFuncionPorPagina2.gestor.denominacionFilaMaestro}"/>
                                                <webuijsf:image
                                                    id="imagenFilaMaestro1"
                                                    url="#{PaginaFuncionPorPagina2.gestor.urlImagenMaestroFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdPaginaFuncion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PaginaFuncionPorPagina2.labelIdPaginaFuncion1}"
                                                    id="labelIdPaginaFuncion1"
                                                    for="campoIdPaginaFuncion1"
                                                    text="id"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdPaginaFuncion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdPaginaFuncion1"
                                                    binding="#{PaginaFuncionPorPagina2.campoIdPaginaFuncion1}"
                                                    converter="#{PaginaFuncionPorPagina2.converterIdPaginaFuncion1}"
                                                    readOnly="#{PaginaFuncionPorPagina2.gestor.filaNoProcesada}" required="true"
                                                    text="#{PaginaFuncionPorPagina2.paginaFuncionDataProvider.value['id_pagina_funcion']}"
                                                    toolTip="BundleParametros.id_pagina_funcion.pagina_funcion"
                                                    validatorExpression="#{PaginaFuncionPorPagina2.validatorIdPaginaFuncion1.validate}"/>
                                                <webuijsf:staticText id="campoIdPaginaFuncion1Texto1"
                                                    binding="#{PaginaFuncionPorPagina2.campoIdPaginaFuncion1Texto1}"
                                                    text="#{PaginaFuncionPorPagina2.paginaFuncionDataProvider.value['id_pagina_funcion']}"/>
                                                <webuijsf:message id="messageIdPaginaFuncion1"
                                                    for="campoIdPaginaFuncion1"/>
                                                <webuijsf:helpInline id="helpInlineIdPaginaFuncion1"
                                                    binding="#{PaginaFuncionPorPagina2.helpInlineIdPaginaFuncion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_pagina_funcion.pagina_funcion"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdFuncion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PaginaFuncionPorPagina2.labelIdFuncion1}"
                                                    id="labelIdFuncion1"
                                                    for="campoIdFuncion1"
                                                    text="funcion"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdFuncion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdFuncion1"
                                                    binding="#{PaginaFuncionPorPagina2.campoIdFuncion1}"
                                                    readOnly="#{PaginaFuncionPorPagina2.gestor.filaNoProcesada}" required="true"
                                                    text="#{PaginaFuncionPorPagina2.asistente.textoCampoIdFuncion1}"
                                                    toolTip="#{PaginaFuncionPorPagina2.asistente.toolTipCampoIdFuncion1}"
                                                    validatorExpression="#{PaginaFuncionPorPagina2.campoIdFuncion1_validate}"/>
                                                <webuijsf:staticText id="campoIdFuncion1Texto1"
                                                    binding="#{PaginaFuncionPorPagina2.campoIdFuncion1Texto1}"
                                                    text="#{PaginaFuncionPorPagina2.paginaFuncionDataProvider.value['codigo_funcion_1x2y3']}"/>
                                                <webuijsf:button id="campoIdFuncion1Boton1"
                                                    binding="#{PaginaFuncionPorPagina2.campoIdFuncion1Boton1}"
                                                    onClick="#{PaginaFuncionPorPagina2.asistente.scriptCampoIdFuncion1Boton1}"/>
                                                <webuijsf:button id="campoIdFuncion1Boton3"
                                                    binding="#{PaginaFuncionPorPagina2.campoIdFuncion1Boton3}"
                                                    onClick="#{PaginaFuncionPorPagina2.asistente.scriptCampoIdFuncion1Boton2}"
                                                    rendered="#{PaginaFuncionPorPagina2.asistente.campoIdFuncion1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdFuncion1"
                                                    for="campoIdFuncion1"/>
                                                <webuijsf:helpInline id="helpInlineIdFuncion1"
                                                    binding="#{PaginaFuncionPorPagina2.helpInlineIdFuncion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_funcion.pagina_funcion"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdFuncion3"
                                                rendered="#{PaginaFuncionPorPagina2.asistente.campoIdFuncion1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PaginaFuncionPorPagina2.labelIdFuncion2}"
                                                    id="labelIdFuncion2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre funcion"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdFuncion4"
                                                rendered="#{PaginaFuncionPorPagina2.asistente.campoIdFuncion1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{PaginaFuncionPorPagina2.campoIdFuncion1Texto2}"
                                                    text="#{PaginaFuncionPorPagina2.paginaFuncionDataProvider.value['nombre_funcion_1x2y4']}"
                                                    id="campoIdFuncion1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{PaginaFuncionPorPagina2.campoIdFuncion1Boton2}"
                                                    id="campoIdFuncion1Boton2"
                                                    onClick="#{PaginaFuncionPorPagina2.asistente.scriptCampoIdFuncion1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsFuncionInicial1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PaginaFuncionPorPagina2.labelEsFuncionInicial1}"
                                                    id="labelEsFuncionInicial1"
                                                    for="listaEsFuncionInicial1"
                                                    text="funcion inicial"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsFuncionInicial2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsFuncionInicial1"
                                                    binding="#{PaginaFuncionPorPagina2.listaEsFuncionInicial1}"
                                                    converter="#{PaginaFuncionPorPagina2.converterEsFuncionInicial1}"
                                                    disabled="#{PaginaFuncionPorPagina2.gestor.filaNoProcesada}" required="true"
                                                    items="#{PaginaFuncionPorPagina2.asistente.opcionesListaEsFuncionInicial1}"
                                                    selected="#{PaginaFuncionPorPagina2.paginaFuncionDataProvider.value['es_funcion_inicial']}"
                                                    toolTip="BundleParametros.es_funcion_inicial.pagina_funcion"/>
                                                <webuijsf:staticText id="listaEsFuncionInicial1Texto1"
                                                    binding="#{PaginaFuncionPorPagina2.listaEsFuncionInicial1Texto1}"/>
                                                <webuijsf:message id="messageEsFuncionInicial1"
                                                    for="listaEsFuncionInicial1"/>
                                                <webuijsf:helpInline id="helpInlineEsFuncionInicial1"
                                                    binding="#{PaginaFuncionPorPagina2.helpInlineEsFuncionInicial1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_funcion_inicial.pagina_funcion"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridControlPaginaFuncion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PaginaFuncionPorPagina2.labelControlPaginaFuncion1}"
                                                    id="labelControlPaginaFuncion1"
                                                    for="campoControlPaginaFuncion1"
                                                    text="control"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridControlPaginaFuncion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoControlPaginaFuncion1"
                                                    binding="#{PaginaFuncionPorPagina2.campoControlPaginaFuncion1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{PaginaFuncionPorPagina2.gestor.filaNoProcesada}"
                                                    text="#{PaginaFuncionPorPagina2.paginaFuncionDataProvider.value['control_pagina_funcion']}"
                                                    toolTip="BundleParametros.control_pagina_funcion.pagina_funcion"
                                                    validatorExpression="#{PaginaFuncionPorPagina2.validatorControlPaginaFuncion1.validate}"/>
                                                <webuijsf:staticText id="campoControlPaginaFuncion1Texto1"
                                                    binding="#{PaginaFuncionPorPagina2.campoControlPaginaFuncion1Texto1}"
                                                    text="#{PaginaFuncionPorPagina2.paginaFuncionDataProvider.value['control_pagina_funcion']}"/>
                                                <webuijsf:message id="messageControlPaginaFuncion1"
                                                    for="campoControlPaginaFuncion1"/>
                                                <webuijsf:helpInline id="helpInlineControlPaginaFuncion1"
                                                    binding="#{PaginaFuncionPorPagina2.helpInlineControlPaginaFuncion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.control_pagina_funcion.pagina_funcion"
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
                                                        actionExpression="#{PaginaFuncionPorPagina2.botonIrAlPrimero2_action}"
                                                        binding="#{PaginaFuncionPorPagina2.botonIrAlPrimero2}"
                                                        disabled="#{PaginaFuncionPorPagina2.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero2"
                                                        imageURL="#{PaginaFuncionPorPagina2.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{PaginaFuncionPorPagina2.gestor.scriptIrAlPrimero}"
                                                        text="#{PaginaFuncionPorPagina2.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{PaginaFuncionPorPagina2.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{PaginaFuncionPorPagina2.botonIrAlAnterior2_action}"
                                                        binding="#{PaginaFuncionPorPagina2.botonIrAlAnterior2}"
                                                        disabled="#{PaginaFuncionPorPagina2.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior2"
                                                        imageURL="#{PaginaFuncionPorPagina2.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{PaginaFuncionPorPagina2.gestor.scriptIrAlAnterior}"
                                                        text="#{PaginaFuncionPorPagina2.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{PaginaFuncionPorPagina2.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{PaginaFuncionPorPagina2.botonIrAlSiguiente2_action}"
                                                        binding="#{PaginaFuncionPorPagina2.botonIrAlSiguiente2}"
                                                        disabled="#{PaginaFuncionPorPagina2.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente2"
                                                        imageURL="#{PaginaFuncionPorPagina2.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{PaginaFuncionPorPagina2.gestor.scriptIrAlSiguiente}"
                                                        text="#{PaginaFuncionPorPagina2.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{PaginaFuncionPorPagina2.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{PaginaFuncionPorPagina2.botonIrAlUltimo2_action}"
                                                        binding="#{PaginaFuncionPorPagina2.botonIrAlUltimo2}"
                                                        disabled="#{PaginaFuncionPorPagina2.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo2"
                                                        imageURL="#{PaginaFuncionPorPagina2.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{PaginaFuncionPorPagina2.gestor.scriptIrAlUltimo}"
                                                        text="#{PaginaFuncionPorPagina2.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{PaginaFuncionPorPagina2.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{PaginaFuncionPorPagina2.botonProcesarFila2_action}"
                                                        binding="#{PaginaFuncionPorPagina2.botonProcesarFila2}"
                                                        disabled="#{PaginaFuncionPorPagina2.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila2"
                                                        imageURL="#{PaginaFuncionPorPagina2.gestor.urlImagenProcesar}"
                                                        onClick="#{PaginaFuncionPorPagina2.scriptAbrirVentanaProcesarFila2}"
                                                        rendered="#{PaginaFuncionPorPagina2.asistente.comandoDisponible}"
                                                        text="#{PaginaFuncionPorPagina2.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{PaginaFuncionPorPagina2.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{PaginaFuncionPorPagina2.gestor.mensajeCambiosPorConfirmar}"/>
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
                                                    actionExpression="#{PaginaFuncionPorPagina2.botonAgregar1_action}"
                                                    binding="#{PaginaFuncionPorPagina2.botonAgregar1}"
                                                    disabled="#{PaginaFuncionPorPagina2.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{PaginaFuncionPorPagina2.gestor.scriptAgregar}"
                                                    rendered="#{PaginaFuncionPorPagina2.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PaginaFuncionPorPagina2.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{PaginaFuncionPorPagina2.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{PaginaFuncionPorPagina2.listaFuncionEdicion1}"
                                                    converter="#{PaginaFuncionPorPagina2.converterListaFuncionEdicion1}"
                                                    disabled="#{PaginaFuncionPorPagina2.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{PaginaFuncionPorPagina2.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{PaginaFuncionPorPagina2.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{PaginaFuncionPorPagina2.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{PaginaFuncionPorPagina2.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{PaginaFuncionPorPagina2.botonEditar1_action}"
                                                    binding="#{PaginaFuncionPorPagina2.botonEditar1}"
                                                    disabled="#{PaginaFuncionPorPagina2.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{PaginaFuncionPorPagina2.gestor.scriptEditar}"
                                                    rendered="#{PaginaFuncionPorPagina2.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PaginaFuncionPorPagina2.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{PaginaFuncionPorPagina2.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{PaginaFuncionPorPagina2.botonEliminar1_action}"
                                                    binding="#{PaginaFuncionPorPagina2.botonEliminar1}"
                                                    disabled="#{PaginaFuncionPorPagina2.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{PaginaFuncionPorPagina2.gestor.scriptEliminar}"
                                                    rendered="#{PaginaFuncionPorPagina2.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PaginaFuncionPorPagina2.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{PaginaFuncionPorPagina2.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{PaginaFuncionPorPagina2.botonAplicar1_action}"
                                                    binding="#{PaginaFuncionPorPagina2.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{PaginaFuncionPorPagina2.gestor.scriptAplicar}"
                                                    rendered="#{PaginaFuncionPorPagina2.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PaginaFuncionPorPagina2.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{PaginaFuncionPorPagina2.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{PaginaFuncionPorPagina2.botonDeshacer1_action}"
                                                    binding="#{PaginaFuncionPorPagina2.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{PaginaFuncionPorPagina2.gestor.scriptDeshacer}"
                                                    rendered="#{PaginaFuncionPorPagina2.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PaginaFuncionPorPagina2.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{PaginaFuncionPorPagina2.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{PaginaFuncionPorPagina2.botonConfirmar1_action}"
                                                    binding="#{PaginaFuncionPorPagina2.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{PaginaFuncionPorPagina2.gestor.scriptConfirmar}"
                                                    rendered="#{PaginaFuncionPorPagina2.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PaginaFuncionPorPagina2.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{PaginaFuncionPorPagina2.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{PaginaFuncionPorPagina2.botonDescartar1_action}"
                                                    binding="#{PaginaFuncionPorPagina2.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{PaginaFuncionPorPagina2.gestor.scriptDescartar}"
                                                    rendered="#{PaginaFuncionPorPagina2.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PaginaFuncionPorPagina2.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{PaginaFuncionPorPagina2.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{PaginaFuncionPorPagina2.listaFuncionAccion1}"
                                                    converter="#{PaginaFuncionPorPagina2.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{PaginaFuncionPorPagina2.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{PaginaFuncionPorPagina2.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{PaginaFuncionPorPagina2.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{PaginaFuncionPorPagina2.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{PaginaFuncionPorPagina2.botonProcesar1_action}"
                                                    binding="#{PaginaFuncionPorPagina2.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{PaginaFuncionPorPagina2.gestor.scriptProcesar}"
                                                    rendered="#{PaginaFuncionPorPagina2.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PaginaFuncionPorPagina2.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{PaginaFuncionPorPagina2.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{PaginaFuncionPorPagina2.botonRefrescar1_action}"
                                                    binding="#{PaginaFuncionPorPagina2.botonRefrescar1}"
                                                    disabled="#{PaginaFuncionPorPagina2.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{PaginaFuncionPorPagina2.gestor.scriptRefrescar}"
                                                    rendered="#{PaginaFuncionPorPagina2.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PaginaFuncionPorPagina2.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{PaginaFuncionPorPagina2.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{PaginaFuncionPorPagina2.botonReconsultar1_action}"
                                                    binding="#{PaginaFuncionPorPagina2.botonReconsultar1}"
                                                    disabled="#{PaginaFuncionPorPagina2.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{PaginaFuncionPorPagina2.gestor.scriptReconsultar}"
                                                    rendered="#{PaginaFuncionPorPagina2.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PaginaFuncionPorPagina2.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{PaginaFuncionPorPagina2.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{PaginaFuncionPorPagina2.botonRetornar1_action}"
                                                    binding="#{PaginaFuncionPorPagina2.botonRetornar1}"
                                                    disabled="#{PaginaFuncionPorPagina2.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{PaginaFuncionPorPagina2.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{PaginaFuncionPorPagina2.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PaginaFuncionPorPagina2.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{PaginaFuncionPorPagina2.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel125"
                                                rendered="#{PaginaFuncionPorPagina2.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{PaginaFuncionPorPagina2.imageHyperlink1_action}"
                                                    binding="#{PaginaFuncionPorPagina2.imageHyperlink1}"
                                                    disabled="#{PaginaFuncionPorPagina2.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{PaginaFuncionPorPagina2.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{PaginaFuncionPorPagina2.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{PaginaFuncionPorPagina2.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.PaginaFuncionPorPagina2_imageHyperlink1_toolTip}"/>
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
