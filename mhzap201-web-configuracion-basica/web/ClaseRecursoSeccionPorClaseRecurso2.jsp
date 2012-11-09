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
                    focus="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.preserveFocus}"
                    preserveScroll="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{ClaseRecursoSeccionPorClaseRecurso2.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | campoIdClaseRecursoSec1 campoEtiquetaClaseRecursoSec1 campoDescripcionClaseRecursoSec1 campoOrdenPresentacion1 listaEsPestanaDetalle1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | | , virtualForm3 | listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{ClaseRecursoSeccionPorClaseRecurso2.breadcrumbs1}" 
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
                                                    rendered="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.mensajeDisponible}"
                                                    text="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.mensaje}"
                                                    url="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            id="gridPanel104"
                                            rendered="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.filaDisponible}"
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
                                                        actionExpression="#{ClaseRecursoSeccionPorClaseRecurso2.botonIrAlPrimero1_action}"
                                                        binding="#{ClaseRecursoSeccionPorClaseRecurso2.botonIrAlPrimero1}"
                                                        disabled="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero1"
                                                        imageURL="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.scriptIrAlPrimero}"
                                                        text="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{ClaseRecursoSeccionPorClaseRecurso2.botonIrAlAnterior1_action}"
                                                        binding="#{ClaseRecursoSeccionPorClaseRecurso2.botonIrAlAnterior1}"
                                                        disabled="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior1"
                                                        imageURL="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.scriptIrAlAnterior}"
                                                        text="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{ClaseRecursoSeccionPorClaseRecurso2.botonIrAlSiguiente1_action}"
                                                        binding="#{ClaseRecursoSeccionPorClaseRecurso2.botonIrAlSiguiente1}"
                                                        disabled="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente1"
                                                        imageURL="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.scriptIrAlSiguiente}"
                                                        text="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{ClaseRecursoSeccionPorClaseRecurso2.botonIrAlUltimo1_action}"
                                                        binding="#{ClaseRecursoSeccionPorClaseRecurso2.botonIrAlUltimo1}"
                                                        disabled="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo1"
                                                        imageURL="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.scriptIrAlUltimo}"
                                                        text="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{ClaseRecursoSeccionPorClaseRecurso2.botonProcesarFila1_action}"
                                                        binding="#{ClaseRecursoSeccionPorClaseRecurso2.botonProcesarFila1}"
                                                        disabled="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila1"
                                                        imageURL="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.urlImagenProcesar}"
                                                        onClick="#{ClaseRecursoSeccionPorClaseRecurso2.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{ClaseRecursoSeccionPorClaseRecurso2.asistente.comandoDisponible}"
                                                        text="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.tituloConsulta}"/>
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
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso2.etiquetaIdentificacionFila1}"
                                                    id="etiquetaIdentificacionFila1"
                                                    text="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.i18n.toolTipEtiquetaIdentificacionFila}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel113"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoIdentificacionFila1"
                                                    style="font-weight: bold"
                                                    text="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.identificacionFila}"/>
                                                <webuijsf:image
                                                    id="imagenFilaProcesada1"
                                                    toolTip="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.toolTipImagenFilaProcesada}"
                                                    url="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.urlImagenFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPanel114"
                                                rendered="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso2.labelIdClaseRecurso1}"
                                                    id="labelIdClaseRecurso1"
                                                    text="clase recurso"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel115"
                                                rendered="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoDenominacionFilaMaestro1"
                                                    style="font-weight: bold"
                                                    text="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.denominacionFilaMaestro}"/>
                                                <webuijsf:image
                                                    id="imagenFilaMaestro1"
                                                    url="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.urlImagenMaestroFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdClaseRecursoSec1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso2.labelIdClaseRecursoSec1}"
                                                    id="labelIdClaseRecursoSec1"
                                                    for="campoIdClaseRecursoSec1"
                                                    text="id"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdClaseRecursoSec2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdClaseRecursoSec1"
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso2.campoIdClaseRecursoSec1}"
                                                    converter="#{ClaseRecursoSeccionPorClaseRecurso2.converterIdClaseRecursoSec1}"
                                                    readOnly="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.filaNoProcesada}" required="true"
                                                    text="#{ClaseRecursoSeccionPorClaseRecurso2.claseRecursoSecDataProvider.value['id_clase_recurso_sec']}"
                                                    toolTip="BundleParametros.id_clase_recurso_sec.clase_recurso_sec"
                                                    validatorExpression="#{ClaseRecursoSeccionPorClaseRecurso2.validatorIdClaseRecursoSec1.validate}"/>
                                                <webuijsf:staticText id="campoIdClaseRecursoSec1Texto1"
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso2.campoIdClaseRecursoSec1Texto1}"
                                                    text="#{ClaseRecursoSeccionPorClaseRecurso2.claseRecursoSecDataProvider.value['id_clase_recurso_sec']}"/>
                                                <webuijsf:message id="messageIdClaseRecursoSec1"
                                                    for="campoIdClaseRecursoSec1"/>
                                                <webuijsf:helpInline id="helpInlineIdClaseRecursoSec1"
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso2.helpInlineIdClaseRecursoSec1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_clase_recurso_sec.clase_recurso_sec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEtiquetaClaseRecursoSec1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso2.labelEtiquetaClaseRecursoSec1}"
                                                    id="labelEtiquetaClaseRecursoSec1"
                                                    for="campoEtiquetaClaseRecursoSec1"
                                                    text="etiqueta"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEtiquetaClaseRecursoSec2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoEtiquetaClaseRecursoSec1"
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso2.campoEtiquetaClaseRecursoSec1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.filaNoProcesada}" required="true"
                                                    text="#{ClaseRecursoSeccionPorClaseRecurso2.claseRecursoSecDataProvider.value['etiqueta_clase_recurso_sec']}"
                                                    toolTip="BundleParametros.etiqueta_clase_recurso_sec.clase_recurso_sec"
                                                    validatorExpression="#{ClaseRecursoSeccionPorClaseRecurso2.validatorEtiquetaClaseRecursoSec1.validate}"/>
                                                <webuijsf:staticText id="campoEtiquetaClaseRecursoSec1Texto1"
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso2.campoEtiquetaClaseRecursoSec1Texto1}"
                                                    text="#{ClaseRecursoSeccionPorClaseRecurso2.claseRecursoSecDataProvider.value['etiqueta_clase_recurso_sec']}"/>
                                                <webuijsf:message id="messageEtiquetaClaseRecursoSec1"
                                                    for="campoEtiquetaClaseRecursoSec1"/>
                                                <webuijsf:helpInline id="helpInlineEtiquetaClaseRecursoSec1"
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso2.helpInlineEtiquetaClaseRecursoSec1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.etiqueta_clase_recurso_sec.clase_recurso_sec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridDescripcionClaseRecursoSec1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso2.labelDescripcionClaseRecursoSec1}"
                                                    id="labelDescripcionClaseRecursoSec1"
                                                    for="campoDescripcionClaseRecursoSec1"
                                                    text="descripcion"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridDescripcionClaseRecursoSec2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoDescripcionClaseRecursoSec1"
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso2.campoDescripcionClaseRecursoSec1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.filaNoProcesada}"
                                                    text="#{ClaseRecursoSeccionPorClaseRecurso2.claseRecursoSecDataProvider.value['descripcion_clase_recurso_sec']}"
                                                    toolTip="BundleParametros.descripcion_clase_recurso_sec.clase_recurso_sec"
                                                    validatorExpression="#{ClaseRecursoSeccionPorClaseRecurso2.validatorDescripcionClaseRecursoSec1.validate}"/>
                                                <webuijsf:staticText id="campoDescripcionClaseRecursoSec1Texto1"
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso2.campoDescripcionClaseRecursoSec1Texto1}"
                                                    text="#{ClaseRecursoSeccionPorClaseRecurso2.claseRecursoSecDataProvider.value['descripcion_clase_recurso_sec']}"/>
                                                <webuijsf:message id="messageDescripcionClaseRecursoSec1"
                                                    for="campoDescripcionClaseRecursoSec1"/>
                                                <webuijsf:helpInline id="helpInlineDescripcionClaseRecursoSec1"
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso2.helpInlineDescripcionClaseRecursoSec1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.descripcion_clase_recurso_sec.clase_recurso_sec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridOrdenPresentacion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso2.labelOrdenPresentacion1}"
                                                    id="labelOrdenPresentacion1"
                                                    for="campoOrdenPresentacion1"
                                                    text="orden presentacion"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridOrdenPresentacion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoOrdenPresentacion1"
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso2.campoOrdenPresentacion1}"
                                                    converter="#{ClaseRecursoSeccionPorClaseRecurso2.converterOrdenPresentacion1}"
                                                    readOnly="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.filaNoProcesada}" required="true"
                                                    text="#{ClaseRecursoSeccionPorClaseRecurso2.claseRecursoSecDataProvider.value['orden_presentacion']}"
                                                    toolTip="BundleParametros.orden_presentacion.clase_recurso_sec"
                                                    validatorExpression="#{ClaseRecursoSeccionPorClaseRecurso2.validatorOrdenPresentacion1.validate}"/>
                                                <webuijsf:staticText id="campoOrdenPresentacion1Texto1"
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso2.campoOrdenPresentacion1Texto1}"
                                                    text="#{ClaseRecursoSeccionPorClaseRecurso2.claseRecursoSecDataProvider.value['orden_presentacion']}"/>
                                                <webuijsf:message id="messageOrdenPresentacion1"
                                                    for="campoOrdenPresentacion1"/>
                                                <webuijsf:helpInline id="helpInlineOrdenPresentacion1"
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso2.helpInlineOrdenPresentacion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.orden_presentacion.clase_recurso_sec"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsPestanaDetalle1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso2.labelEsPestanaDetalle1}"
                                                    id="labelEsPestanaDetalle1"
                                                    for="listaEsPestanaDetalle1"
                                                    text="pestana detalle"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsPestanaDetalle2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsPestanaDetalle1"
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso2.listaEsPestanaDetalle1}"
                                                    converter="#{ClaseRecursoSeccionPorClaseRecurso2.converterEsPestanaDetalle1}"
                                                    disabled="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.filaNoProcesada}" required="true"
                                                    items="#{ClaseRecursoSeccionPorClaseRecurso2.asistente.opcionesListaEsPestanaDetalle1}"
                                                    selected="#{ClaseRecursoSeccionPorClaseRecurso2.claseRecursoSecDataProvider.value['es_pestana_detalle']}"
                                                    toolTip="BundleParametros.es_pestana_detalle.clase_recurso_sec"/>
                                                <webuijsf:staticText id="listaEsPestanaDetalle1Texto1"
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso2.listaEsPestanaDetalle1Texto1}"/>
                                                <webuijsf:message id="messageEsPestanaDetalle1"
                                                    for="listaEsPestanaDetalle1"/>
                                                <webuijsf:helpInline id="helpInlineEsPestanaDetalle1"
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso2.helpInlineEsPestanaDetalle1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_pestana_detalle.clase_recurso_sec"
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
                                                        actionExpression="#{ClaseRecursoSeccionPorClaseRecurso2.botonIrAlPrimero2_action}"
                                                        binding="#{ClaseRecursoSeccionPorClaseRecurso2.botonIrAlPrimero2}"
                                                        disabled="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero2"
                                                        imageURL="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.scriptIrAlPrimero}"
                                                        text="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{ClaseRecursoSeccionPorClaseRecurso2.botonIrAlAnterior2_action}"
                                                        binding="#{ClaseRecursoSeccionPorClaseRecurso2.botonIrAlAnterior2}"
                                                        disabled="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior2"
                                                        imageURL="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.scriptIrAlAnterior}"
                                                        text="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{ClaseRecursoSeccionPorClaseRecurso2.botonIrAlSiguiente2_action}"
                                                        binding="#{ClaseRecursoSeccionPorClaseRecurso2.botonIrAlSiguiente2}"
                                                        disabled="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente2"
                                                        imageURL="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.scriptIrAlSiguiente}"
                                                        text="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{ClaseRecursoSeccionPorClaseRecurso2.botonIrAlUltimo2_action}"
                                                        binding="#{ClaseRecursoSeccionPorClaseRecurso2.botonIrAlUltimo2}"
                                                        disabled="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo2"
                                                        imageURL="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.scriptIrAlUltimo}"
                                                        text="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{ClaseRecursoSeccionPorClaseRecurso2.botonProcesarFila2_action}"
                                                        binding="#{ClaseRecursoSeccionPorClaseRecurso2.botonProcesarFila2}"
                                                        disabled="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila2"
                                                        imageURL="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.urlImagenProcesar}"
                                                        onClick="#{ClaseRecursoSeccionPorClaseRecurso2.scriptAbrirVentanaProcesarFila2}"
                                                        rendered="#{ClaseRecursoSeccionPorClaseRecurso2.asistente.comandoDisponible}"
                                                        text="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.mensajeCambiosPorConfirmar}"/>
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
                                                    actionExpression="#{ClaseRecursoSeccionPorClaseRecurso2.botonAgregar1_action}"
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso2.botonAgregar1}"
                                                    disabled="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.scriptAgregar}"
                                                    rendered="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso2.listaFuncionEdicion1}"
                                                    converter="#{ClaseRecursoSeccionPorClaseRecurso2.converterListaFuncionEdicion1}"
                                                    disabled="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{ClaseRecursoSeccionPorClaseRecurso2.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ClaseRecursoSeccionPorClaseRecurso2.botonEditar1_action}"
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso2.botonEditar1}"
                                                    disabled="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.scriptEditar}"
                                                    rendered="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ClaseRecursoSeccionPorClaseRecurso2.botonEliminar1_action}"
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso2.botonEliminar1}"
                                                    disabled="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.scriptEliminar}"
                                                    rendered="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ClaseRecursoSeccionPorClaseRecurso2.botonAplicar1_action}"
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso2.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.scriptAplicar}"
                                                    rendered="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ClaseRecursoSeccionPorClaseRecurso2.botonDeshacer1_action}"
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso2.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.scriptDeshacer}"
                                                    rendered="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ClaseRecursoSeccionPorClaseRecurso2.botonConfirmar1_action}"
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso2.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.scriptConfirmar}"
                                                    rendered="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ClaseRecursoSeccionPorClaseRecurso2.botonDescartar1_action}"
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso2.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.scriptDescartar}"
                                                    rendered="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso2.listaFuncionAccion1}"
                                                    converter="#{ClaseRecursoSeccionPorClaseRecurso2.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{ClaseRecursoSeccionPorClaseRecurso2.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ClaseRecursoSeccionPorClaseRecurso2.botonProcesar1_action}"
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso2.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.scriptProcesar}"
                                                    rendered="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ClaseRecursoSeccionPorClaseRecurso2.botonRefrescar1_action}"
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso2.botonRefrescar1}"
                                                    disabled="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.scriptRefrescar}"
                                                    rendered="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ClaseRecursoSeccionPorClaseRecurso2.botonReconsultar1_action}"
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso2.botonReconsultar1}"
                                                    disabled="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.scriptReconsultar}"
                                                    rendered="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ClaseRecursoSeccionPorClaseRecurso2.botonRetornar1_action}"
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso2.botonRetornar1}"
                                                    disabled="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="2" 
                                                id="gridPanel125"
                                                rendered="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{ClaseRecursoSeccionPorClaseRecurso2.imageHyperlink1_action}"
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso2.imageHyperlink1}"
                                                    disabled="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.ClaseRecursoSeccionPorClaseRecurso2_imageHyperlink1_toolTip}"/>
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{ClaseRecursoSeccionPorClaseRecurso2.imageHyperlink2_action}"
                                                    binding="#{ClaseRecursoSeccionPorClaseRecurso2.imageHyperlink2}"
                                                    disabled="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink2"
                                                    imageURL="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{ClaseRecursoSeccionPorClaseRecurso2.gestor.designing}"
                                                    text="Hyperlink2"
                                                    toolTip="#{bundle.ClaseRecursoSeccionPorClaseRecurso2_imageHyperlink2_toolTip}"/>
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
