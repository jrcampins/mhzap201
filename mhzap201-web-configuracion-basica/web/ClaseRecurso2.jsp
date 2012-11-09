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
                    focus="#{ClaseRecurso2.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{ClaseRecurso2.gestor.preserveFocus}"
                    preserveScroll="#{ClaseRecurso2.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{ClaseRecurso2.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | campoIdClaseRecurso1 campoCodigoClaseRecurso1 campoNombreClaseRecurso1 campoDescripcionClaseRecurso1 listaEsClaseRecursoIndependiente1 listaEsClaseRecursoSinDetalle1 listaEsClaseRecursoConArbol1 listaNumeroTipoClaseRecurso1 listaNumeroTipoRecurso1 campoIdFuncionSeleccion1 campoIdPaginaSeleccion1 campoIdPaginaDetalle1 campoIdClaseRecursoMaestro1 campoIdClaseRecursoSegmento1 campoIdClaseRecursoBase1 campoIdGrupoAplicacion1 campoIdAplicacionWeb1 campoLimiteFilasConsulta1 campoLimiteFilasInforme1 campoOrdenPresentacion1 listaEsClaseRecursoInsertable1 listaEsClaseRecursoModificable1 listaEsClaseRecursoEliminable1 listaEsClaseRecursoExtendida1 campoEtiquetaHipervinculo1 listaEsEnumeradorConNumero1 campoAliasClaseRecurso1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | | , virtualForm3 | listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{ClaseRecurso2.breadcrumbs1}" 
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
                                                    rendered="#{ClaseRecurso2.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{ClaseRecurso2.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{ClaseRecurso2.gestor.mensajeDisponible}"
                                                    text="#{ClaseRecurso2.gestor.mensaje}"
                                                    url="#{ClaseRecurso2.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            id="gridPanel104"
                                            rendered="#{ClaseRecurso2.gestor.filaDisponible}"
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
                                                        actionExpression="#{ClaseRecurso2.botonIrAlPrimero1_action}"
                                                        binding="#{ClaseRecurso2.botonIrAlPrimero1}"
                                                        disabled="#{ClaseRecurso2.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero1"
                                                        imageURL="#{ClaseRecurso2.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{ClaseRecurso2.gestor.scriptIrAlPrimero}"
                                                        text="#{ClaseRecurso2.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{ClaseRecurso2.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{ClaseRecurso2.botonIrAlAnterior1_action}"
                                                        binding="#{ClaseRecurso2.botonIrAlAnterior1}"
                                                        disabled="#{ClaseRecurso2.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior1"
                                                        imageURL="#{ClaseRecurso2.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{ClaseRecurso2.gestor.scriptIrAlAnterior}"
                                                        text="#{ClaseRecurso2.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{ClaseRecurso2.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{ClaseRecurso2.botonIrAlSiguiente1_action}"
                                                        binding="#{ClaseRecurso2.botonIrAlSiguiente1}"
                                                        disabled="#{ClaseRecurso2.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente1"
                                                        imageURL="#{ClaseRecurso2.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{ClaseRecurso2.gestor.scriptIrAlSiguiente}"
                                                        text="#{ClaseRecurso2.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{ClaseRecurso2.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{ClaseRecurso2.botonIrAlUltimo1_action}"
                                                        binding="#{ClaseRecurso2.botonIrAlUltimo1}"
                                                        disabled="#{ClaseRecurso2.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo1"
                                                        imageURL="#{ClaseRecurso2.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{ClaseRecurso2.gestor.scriptIrAlUltimo}"
                                                        text="#{ClaseRecurso2.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{ClaseRecurso2.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{ClaseRecurso2.botonProcesarFila1_action}"
                                                        binding="#{ClaseRecurso2.botonProcesarFila1}"
                                                        disabled="#{ClaseRecurso2.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila1"
                                                        imageURL="#{ClaseRecurso2.gestor.urlImagenProcesar}"
                                                        onClick="#{ClaseRecurso2.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{ClaseRecurso2.asistente.comandoDisponible}"
                                                        text="#{ClaseRecurso2.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{ClaseRecurso2.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{ClaseRecurso2.gestor.tituloConsulta}"/>
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
                                                    binding="#{ClaseRecurso2.etiquetaIdentificacionFila1}"
                                                    id="etiquetaIdentificacionFila1"
                                                    text="#{ClaseRecurso2.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{ClaseRecurso2.gestor.i18n.toolTipEtiquetaIdentificacionFila}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel113"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoIdentificacionFila1"
                                                    style="font-weight: bold"
                                                    text="#{ClaseRecurso2.gestor.identificacionFila}"/>
                                                <webuijsf:image
                                                    id="imagenFilaProcesada1"
                                                    toolTip="#{ClaseRecurso2.gestor.toolTipImagenFilaProcesada}"
                                                    url="#{ClaseRecurso2.gestor.urlImagenFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPanel114"
                                                rendered="#{ClaseRecurso2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecurso2.etiquetaDenominacionFilaMaestro1}"
                                                    id="etiquetaDenominacionFilaMaestro1"
                                                    text="?"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel115"
                                                rendered="#{ClaseRecurso2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoDenominacionFilaMaestro1"
                                                    style="font-weight: bold"
                                                    text="#{ClaseRecurso2.gestor.denominacionFilaMaestro}"/>
                                                <webuijsf:image
                                                    id="imagenFilaMaestro1"
                                                    url="#{ClaseRecurso2.gestor.urlImagenMaestroFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdClaseRecurso1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecurso2.labelIdClaseRecurso1}"
                                                    id="labelIdClaseRecurso1"
                                                    for="campoIdClaseRecurso1"
                                                    text="id"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdClaseRecurso2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdClaseRecurso1"
                                                    binding="#{ClaseRecurso2.campoIdClaseRecurso1}"
                                                    converter="#{ClaseRecurso2.converterIdClaseRecurso1}"
                                                    readOnly="#{ClaseRecurso2.gestor.filaNoProcesada}" required="true"
                                                    text="#{ClaseRecurso2.claseRecursoDataProvider.value['id_clase_recurso']}"
                                                    toolTip="BundleParametros.id_clase_recurso.clase_recurso"
                                                    validatorExpression="#{ClaseRecurso2.validatorIdClaseRecurso1.validate}"/>
                                                <webuijsf:staticText id="campoIdClaseRecurso1Texto1"
                                                    binding="#{ClaseRecurso2.campoIdClaseRecurso1Texto1}"
                                                    text="#{ClaseRecurso2.claseRecursoDataProvider.value['id_clase_recurso']}"/>
                                                <webuijsf:message id="messageIdClaseRecurso1"
                                                    for="campoIdClaseRecurso1"/>
                                                <webuijsf:helpInline id="helpInlineIdClaseRecurso1"
                                                    binding="#{ClaseRecurso2.helpInlineIdClaseRecurso1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_clase_recurso.clase_recurso"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridCodigoClaseRecurso1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecurso2.labelCodigoClaseRecurso1}"
                                                    id="labelCodigoClaseRecurso1"
                                                    for="campoCodigoClaseRecurso1"
                                                    text="codigo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridCodigoClaseRecurso2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoCodigoClaseRecurso1"
                                                    binding="#{ClaseRecurso2.campoCodigoClaseRecurso1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{ClaseRecurso2.gestor.filaNoProcesada}" required="true"
                                                    text="#{ClaseRecurso2.claseRecursoDataProvider.value['codigo_clase_recurso']}"
                                                    toolTip="BundleParametros.codigo_clase_recurso.clase_recurso"
                                                    validatorExpression="#{ClaseRecurso2.validatorCodigoClaseRecurso1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoClaseRecurso1Texto1"
                                                    binding="#{ClaseRecurso2.campoCodigoClaseRecurso1Texto1}"
                                                    text="#{ClaseRecurso2.claseRecursoDataProvider.value['codigo_clase_recurso']}"/>
                                                <webuijsf:message id="messageCodigoClaseRecurso1"
                                                    for="campoCodigoClaseRecurso1"/>
                                                <webuijsf:helpInline id="helpInlineCodigoClaseRecurso1"
                                                    binding="#{ClaseRecurso2.helpInlineCodigoClaseRecurso1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.codigo_clase_recurso.clase_recurso"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNombreClaseRecurso1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecurso2.labelNombreClaseRecurso1}"
                                                    id="labelNombreClaseRecurso1"
                                                    for="campoNombreClaseRecurso1"
                                                    text="nombre"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNombreClaseRecurso2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNombreClaseRecurso1"
                                                    binding="#{ClaseRecurso2.campoNombreClaseRecurso1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{ClaseRecurso2.gestor.filaNoProcesada}"
                                                    text="#{ClaseRecurso2.claseRecursoDataProvider.value['nombre_clase_recurso']}"
                                                    toolTip="BundleParametros.nombre_clase_recurso.clase_recurso"
                                                    validatorExpression="#{ClaseRecurso2.validatorNombreClaseRecurso1.validate}"/>
                                                <webuijsf:staticText id="campoNombreClaseRecurso1Texto1"
                                                    binding="#{ClaseRecurso2.campoNombreClaseRecurso1Texto1}"
                                                    text="#{ClaseRecurso2.claseRecursoDataProvider.value['nombre_clase_recurso']}"/>
                                                <webuijsf:message id="messageNombreClaseRecurso1"
                                                    for="campoNombreClaseRecurso1"/>
                                                <webuijsf:helpInline id="helpInlineNombreClaseRecurso1"
                                                    binding="#{ClaseRecurso2.helpInlineNombreClaseRecurso1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.nombre_clase_recurso.clase_recurso"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridDescripcionClaseRecurso1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecurso2.labelDescripcionClaseRecurso1}"
                                                    id="labelDescripcionClaseRecurso1"
                                                    for="campoDescripcionClaseRecurso1"
                                                    text="descripcion"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridDescripcionClaseRecurso2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoDescripcionClaseRecurso1"
                                                    binding="#{ClaseRecurso2.campoDescripcionClaseRecurso1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{ClaseRecurso2.gestor.filaNoProcesada}"
                                                    text="#{ClaseRecurso2.claseRecursoDataProvider.value['descripcion_clase_recurso']}"
                                                    toolTip="BundleParametros.descripcion_clase_recurso.clase_recurso"
                                                    validatorExpression="#{ClaseRecurso2.validatorDescripcionClaseRecurso1.validate}"/>
                                                <webuijsf:staticText id="campoDescripcionClaseRecurso1Texto1"
                                                    binding="#{ClaseRecurso2.campoDescripcionClaseRecurso1Texto1}"
                                                    text="#{ClaseRecurso2.claseRecursoDataProvider.value['descripcion_clase_recurso']}"/>
                                                <webuijsf:message id="messageDescripcionClaseRecurso1"
                                                    for="campoDescripcionClaseRecurso1"/>
                                                <webuijsf:helpInline id="helpInlineDescripcionClaseRecurso1"
                                                    binding="#{ClaseRecurso2.helpInlineDescripcionClaseRecurso1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.descripcion_clase_recurso.clase_recurso"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsClaseRecursoIndependiente1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecurso2.labelEsClaseRecursoIndependiente1}"
                                                    id="labelEsClaseRecursoIndependiente1"
                                                    for="listaEsClaseRecursoIndependiente1"
                                                    text="independiente"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsClaseRecursoIndependiente2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsClaseRecursoIndependiente1"
                                                    binding="#{ClaseRecurso2.listaEsClaseRecursoIndependiente1}"
                                                    converter="#{ClaseRecurso2.converterEsClaseRecursoIndependiente1}"
                                                    disabled="#{ClaseRecurso2.gestor.filaNoProcesada}" required="true"
                                                    items="#{ClaseRecurso2.asistente.opcionesListaEsClaseRecursoIndependiente1}"
                                                    selected="#{ClaseRecurso2.claseRecursoDataProvider.value['es_clase_recurso_independiente']}"
                                                    toolTip="BundleParametros.es_clase_recurso_independiente.clase_recurso"/>
                                                <webuijsf:staticText id="listaEsClaseRecursoIndependiente1Texto1"
                                                    binding="#{ClaseRecurso2.listaEsClaseRecursoIndependiente1Texto1}"/>
                                                <webuijsf:message id="messageEsClaseRecursoIndependiente1"
                                                    for="listaEsClaseRecursoIndependiente1"/>
                                                <webuijsf:helpInline id="helpInlineEsClaseRecursoIndependiente1"
                                                    binding="#{ClaseRecurso2.helpInlineEsClaseRecursoIndependiente1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_clase_recurso_independiente.clase_recurso"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsClaseRecursoSinDetalle1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecurso2.labelEsClaseRecursoSinDetalle1}"
                                                    id="labelEsClaseRecursoSinDetalle1"
                                                    for="listaEsClaseRecursoSinDetalle1"
                                                    text="sin detalle"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsClaseRecursoSinDetalle2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsClaseRecursoSinDetalle1"
                                                    binding="#{ClaseRecurso2.listaEsClaseRecursoSinDetalle1}"
                                                    converter="#{ClaseRecurso2.converterEsClaseRecursoSinDetalle1}"
                                                    disabled="#{ClaseRecurso2.gestor.filaNoProcesada}" required="true"
                                                    items="#{ClaseRecurso2.asistente.opcionesListaEsClaseRecursoSinDetalle1}"
                                                    selected="#{ClaseRecurso2.claseRecursoDataProvider.value['es_clase_recurso_sin_detalle']}"
                                                    toolTip="BundleParametros.es_clase_recurso_sin_detalle.clase_recurso"/>
                                                <webuijsf:staticText id="listaEsClaseRecursoSinDetalle1Texto1"
                                                    binding="#{ClaseRecurso2.listaEsClaseRecursoSinDetalle1Texto1}"/>
                                                <webuijsf:message id="messageEsClaseRecursoSinDetalle1"
                                                    for="listaEsClaseRecursoSinDetalle1"/>
                                                <webuijsf:helpInline id="helpInlineEsClaseRecursoSinDetalle1"
                                                    binding="#{ClaseRecurso2.helpInlineEsClaseRecursoSinDetalle1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_clase_recurso_sin_detalle.clase_recurso"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsClaseRecursoConArbol1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecurso2.labelEsClaseRecursoConArbol1}"
                                                    id="labelEsClaseRecursoConArbol1"
                                                    for="listaEsClaseRecursoConArbol1"
                                                    text="con arbol"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsClaseRecursoConArbol2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsClaseRecursoConArbol1"
                                                    binding="#{ClaseRecurso2.listaEsClaseRecursoConArbol1}"
                                                    converter="#{ClaseRecurso2.converterEsClaseRecursoConArbol1}"
                                                    disabled="#{ClaseRecurso2.gestor.filaNoProcesada}" required="true"
                                                    items="#{ClaseRecurso2.asistente.opcionesListaEsClaseRecursoConArbol1}"
                                                    selected="#{ClaseRecurso2.claseRecursoDataProvider.value['es_clase_recurso_con_arbol']}"
                                                    toolTip="BundleParametros.es_clase_recurso_con_arbol.clase_recurso"/>
                                                <webuijsf:staticText id="listaEsClaseRecursoConArbol1Texto1"
                                                    binding="#{ClaseRecurso2.listaEsClaseRecursoConArbol1Texto1}"/>
                                                <webuijsf:message id="messageEsClaseRecursoConArbol1"
                                                    for="listaEsClaseRecursoConArbol1"/>
                                                <webuijsf:helpInline id="helpInlineEsClaseRecursoConArbol1"
                                                    binding="#{ClaseRecurso2.helpInlineEsClaseRecursoConArbol1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_clase_recurso_con_arbol.clase_recurso"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroTipoClaseRecurso1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecurso2.labelNumeroTipoClaseRecurso1}"
                                                    id="labelNumeroTipoClaseRecurso1"
                                                    for="listaNumeroTipoClaseRecurso1"
                                                    text="tipo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTipoClaseRecurso2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroTipoClaseRecurso1"
                                                    binding="#{ClaseRecurso2.listaNumeroTipoClaseRecurso1}"
                                                    converter="#{ClaseRecurso2.converterNumeroTipoClaseRecurso1}"
                                                    disabled="#{ClaseRecurso2.gestor.filaNoProcesada}" required="true"
                                                    items="#{ClaseRecurso2.asistente.opcionesListaNumeroTipoClaseRecurso1}"
                                                    selected="#{ClaseRecurso2.claseRecursoDataProvider.value['numero_tipo_clase_recurso']}"
                                                    toolTip="BundleParametros.numero_tipo_clase_recurso.clase_recurso"/>
                                                <webuijsf:staticText id="listaNumeroTipoClaseRecurso1Texto1"
                                                    binding="#{ClaseRecurso2.listaNumeroTipoClaseRecurso1Texto1}"
                                                    text="#{ClaseRecurso2.claseRecursoDataProvider.value['codigo_tipo_clase_recurs_1x1y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoClaseRecurso1"
                                                    for="listaNumeroTipoClaseRecurso1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTipoClaseRecurso1"
                                                    binding="#{ClaseRecurso2.helpInlineNumeroTipoClaseRecurso1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_tipo_clase_recurso.clase_recurso"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroTipoRecurso1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecurso2.labelNumeroTipoRecurso1}"
                                                    id="labelNumeroTipoRecurso1"
                                                    for="listaNumeroTipoRecurso1"
                                                    text="tipo recurso"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTipoRecurso2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroTipoRecurso1"
                                                    binding="#{ClaseRecurso2.listaNumeroTipoRecurso1}"
                                                    converter="#{ClaseRecurso2.converterNumeroTipoRecurso1}"
                                                    disabled="#{ClaseRecurso2.gestor.filaNoProcesada}" required="true"
                                                    items="#{ClaseRecurso2.asistente.opcionesListaNumeroTipoRecurso1}"
                                                    selected="#{ClaseRecurso2.claseRecursoDataProvider.value['numero_tipo_recurso']}"
                                                    toolTip="BundleParametros.numero_tipo_recurso.clase_recurso"/>
                                                <webuijsf:staticText id="listaNumeroTipoRecurso1Texto1"
                                                    binding="#{ClaseRecurso2.listaNumeroTipoRecurso1Texto1}"
                                                    text="#{ClaseRecurso2.claseRecursoDataProvider.value['codigo_tipo_recurso_1x2y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoRecurso1"
                                                    for="listaNumeroTipoRecurso1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTipoRecurso1"
                                                    binding="#{ClaseRecurso2.helpInlineNumeroTipoRecurso1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_tipo_recurso.clase_recurso"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdFuncionSeleccion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecurso2.labelIdFuncionSeleccion1}"
                                                    id="labelIdFuncionSeleccion1"
                                                    for="campoIdFuncionSeleccion1"
                                                    text="funcion seleccion"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdFuncionSeleccion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdFuncionSeleccion1"
                                                    binding="#{ClaseRecurso2.campoIdFuncionSeleccion1}"
                                                    readOnly="#{ClaseRecurso2.gestor.filaNoProcesada}"
                                                    text="#{ClaseRecurso2.asistente.textoCampoIdFuncionSeleccion1}"
                                                    toolTip="#{ClaseRecurso2.asistente.toolTipCampoIdFuncionSeleccion1}"
                                                    validatorExpression="#{ClaseRecurso2.campoIdFuncionSeleccion1_validate}"/>
                                                <webuijsf:staticText id="campoIdFuncionSeleccion1Texto1"
                                                    binding="#{ClaseRecurso2.campoIdFuncionSeleccion1Texto1}"
                                                    text="#{ClaseRecurso2.claseRecursoDataProvider.value['codigo_funcion_1x3y3']}"/>
                                                <webuijsf:button id="campoIdFuncionSeleccion1Boton1"
                                                    binding="#{ClaseRecurso2.campoIdFuncionSeleccion1Boton1}"
                                                    onClick="#{ClaseRecurso2.asistente.scriptCampoIdFuncionSeleccion1Boton1}"/>
                                                <webuijsf:button id="campoIdFuncionSeleccion1Boton3"
                                                    binding="#{ClaseRecurso2.campoIdFuncionSeleccion1Boton3}"
                                                    onClick="#{ClaseRecurso2.asistente.scriptCampoIdFuncionSeleccion1Boton2}"
                                                    rendered="#{ClaseRecurso2.asistente.campoIdFuncionSeleccion1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdFuncionSeleccion1"
                                                    for="campoIdFuncionSeleccion1"/>
                                                <webuijsf:helpInline id="helpInlineIdFuncionSeleccion1"
                                                    binding="#{ClaseRecurso2.helpInlineIdFuncionSeleccion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_funcion_seleccion.clase_recurso"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdFuncionSeleccion3"
                                                rendered="#{ClaseRecurso2.asistente.campoIdFuncionSeleccion1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecurso2.labelIdFuncionSeleccion2}"
                                                    id="labelIdFuncionSeleccion2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre funcion seleccion"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdFuncionSeleccion4"
                                                rendered="#{ClaseRecurso2.asistente.campoIdFuncionSeleccion1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{ClaseRecurso2.campoIdFuncionSeleccion1Texto2}"
                                                    text="#{ClaseRecurso2.claseRecursoDataProvider.value['nombre_funcion_1x3y4']}"
                                                    id="campoIdFuncionSeleccion1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{ClaseRecurso2.campoIdFuncionSeleccion1Boton2}"
                                                    id="campoIdFuncionSeleccion1Boton2"
                                                    onClick="#{ClaseRecurso2.asistente.scriptCampoIdFuncionSeleccion1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdPaginaSeleccion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecurso2.labelIdPaginaSeleccion1}"
                                                    id="labelIdPaginaSeleccion1"
                                                    for="campoIdPaginaSeleccion1"
                                                    text="pagina seleccion"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdPaginaSeleccion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdPaginaSeleccion1"
                                                    binding="#{ClaseRecurso2.campoIdPaginaSeleccion1}"
                                                    readOnly="#{ClaseRecurso2.gestor.filaNoProcesada}"
                                                    text="#{ClaseRecurso2.asistente.textoCampoIdPaginaSeleccion1}"
                                                    toolTip="#{ClaseRecurso2.asistente.toolTipCampoIdPaginaSeleccion1}"
                                                    validatorExpression="#{ClaseRecurso2.campoIdPaginaSeleccion1_validate}"/>
                                                <webuijsf:staticText id="campoIdPaginaSeleccion1Texto1"
                                                    binding="#{ClaseRecurso2.campoIdPaginaSeleccion1Texto1}"
                                                    text="#{ClaseRecurso2.claseRecursoDataProvider.value['codigo_pagina_1x4y3']}"/>
                                                <webuijsf:button id="campoIdPaginaSeleccion1Boton1"
                                                    binding="#{ClaseRecurso2.campoIdPaginaSeleccion1Boton1}"
                                                    onClick="#{ClaseRecurso2.asistente.scriptCampoIdPaginaSeleccion1Boton1}"/>
                                                <webuijsf:button id="campoIdPaginaSeleccion1Boton3"
                                                    binding="#{ClaseRecurso2.campoIdPaginaSeleccion1Boton3}"
                                                    onClick="#{ClaseRecurso2.asistente.scriptCampoIdPaginaSeleccion1Boton2}"
                                                    rendered="#{ClaseRecurso2.asistente.campoIdPaginaSeleccion1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdPaginaSeleccion1"
                                                    for="campoIdPaginaSeleccion1"/>
                                                <webuijsf:helpInline id="helpInlineIdPaginaSeleccion1"
                                                    binding="#{ClaseRecurso2.helpInlineIdPaginaSeleccion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_pagina_seleccion.clase_recurso"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdPaginaSeleccion3"
                                                rendered="#{ClaseRecurso2.asistente.campoIdPaginaSeleccion1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecurso2.labelIdPaginaSeleccion2}"
                                                    id="labelIdPaginaSeleccion2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre pagina seleccion"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdPaginaSeleccion4"
                                                rendered="#{ClaseRecurso2.asistente.campoIdPaginaSeleccion1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{ClaseRecurso2.campoIdPaginaSeleccion1Texto2}"
                                                    text="#{ClaseRecurso2.claseRecursoDataProvider.value['nombre_pagina_1x4y4']}"
                                                    id="campoIdPaginaSeleccion1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{ClaseRecurso2.campoIdPaginaSeleccion1Boton2}"
                                                    id="campoIdPaginaSeleccion1Boton2"
                                                    onClick="#{ClaseRecurso2.asistente.scriptCampoIdPaginaSeleccion1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdPaginaDetalle1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecurso2.labelIdPaginaDetalle1}"
                                                    id="labelIdPaginaDetalle1"
                                                    for="campoIdPaginaDetalle1"
                                                    text="pagina detalle"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdPaginaDetalle2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdPaginaDetalle1"
                                                    binding="#{ClaseRecurso2.campoIdPaginaDetalle1}"
                                                    readOnly="#{ClaseRecurso2.gestor.filaNoProcesada}"
                                                    text="#{ClaseRecurso2.asistente.textoCampoIdPaginaDetalle1}"
                                                    toolTip="#{ClaseRecurso2.asistente.toolTipCampoIdPaginaDetalle1}"
                                                    validatorExpression="#{ClaseRecurso2.campoIdPaginaDetalle1_validate}"/>
                                                <webuijsf:staticText id="campoIdPaginaDetalle1Texto1"
                                                    binding="#{ClaseRecurso2.campoIdPaginaDetalle1Texto1}"
                                                    text="#{ClaseRecurso2.claseRecursoDataProvider.value['codigo_pagina_1x5y3']}"/>
                                                <webuijsf:button id="campoIdPaginaDetalle1Boton1"
                                                    binding="#{ClaseRecurso2.campoIdPaginaDetalle1Boton1}"
                                                    onClick="#{ClaseRecurso2.asistente.scriptCampoIdPaginaDetalle1Boton1}"/>
                                                <webuijsf:button id="campoIdPaginaDetalle1Boton3"
                                                    binding="#{ClaseRecurso2.campoIdPaginaDetalle1Boton3}"
                                                    onClick="#{ClaseRecurso2.asistente.scriptCampoIdPaginaDetalle1Boton2}"
                                                    rendered="#{ClaseRecurso2.asistente.campoIdPaginaDetalle1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdPaginaDetalle1"
                                                    for="campoIdPaginaDetalle1"/>
                                                <webuijsf:helpInline id="helpInlineIdPaginaDetalle1"
                                                    binding="#{ClaseRecurso2.helpInlineIdPaginaDetalle1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_pagina_detalle.clase_recurso"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdPaginaDetalle3"
                                                rendered="#{ClaseRecurso2.asistente.campoIdPaginaDetalle1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecurso2.labelIdPaginaDetalle2}"
                                                    id="labelIdPaginaDetalle2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre pagina detalle"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdPaginaDetalle4"
                                                rendered="#{ClaseRecurso2.asistente.campoIdPaginaDetalle1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{ClaseRecurso2.campoIdPaginaDetalle1Texto2}"
                                                    text="#{ClaseRecurso2.claseRecursoDataProvider.value['nombre_pagina_1x5y4']}"
                                                    id="campoIdPaginaDetalle1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{ClaseRecurso2.campoIdPaginaDetalle1Boton2}"
                                                    id="campoIdPaginaDetalle1Boton2"
                                                    onClick="#{ClaseRecurso2.asistente.scriptCampoIdPaginaDetalle1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdClaseRecursoMaestro1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecurso2.labelIdClaseRecursoMaestro1}"
                                                    id="labelIdClaseRecursoMaestro1"
                                                    for="campoIdClaseRecursoMaestro1"
                                                    text="clase recurso maestro"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdClaseRecursoMaestro2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdClaseRecursoMaestro1"
                                                    binding="#{ClaseRecurso2.campoIdClaseRecursoMaestro1}"
                                                    readOnly="#{ClaseRecurso2.gestor.filaNoProcesada}"
                                                    text="#{ClaseRecurso2.asistente.textoCampoIdClaseRecursoMaestro1}"
                                                    toolTip="#{ClaseRecurso2.asistente.toolTipCampoIdClaseRecursoMaestro1}"
                                                    validatorExpression="#{ClaseRecurso2.campoIdClaseRecursoMaestro1_validate}"/>
                                                <webuijsf:staticText id="campoIdClaseRecursoMaestro1Texto1"
                                                    binding="#{ClaseRecurso2.campoIdClaseRecursoMaestro1Texto1}"
                                                    text="#{ClaseRecurso2.claseRecursoDataProvider.value['codigo_clase_recurso_1x6y3']}"/>
                                                <webuijsf:button id="campoIdClaseRecursoMaestro1Boton1"
                                                    binding="#{ClaseRecurso2.campoIdClaseRecursoMaestro1Boton1}"
                                                    onClick="#{ClaseRecurso2.asistente.scriptCampoIdClaseRecursoMaestro1Boton1}"/>
                                                <webuijsf:button id="campoIdClaseRecursoMaestro1Boton3"
                                                    binding="#{ClaseRecurso2.campoIdClaseRecursoMaestro1Boton3}"
                                                    onClick="#{ClaseRecurso2.asistente.scriptCampoIdClaseRecursoMaestro1Boton2}"
                                                    rendered="#{ClaseRecurso2.asistente.campoIdClaseRecursoMaestro1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdClaseRecursoMaestro1"
                                                    for="campoIdClaseRecursoMaestro1"/>
                                                <webuijsf:helpInline id="helpInlineIdClaseRecursoMaestro1"
                                                    binding="#{ClaseRecurso2.helpInlineIdClaseRecursoMaestro1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_clase_recurso_maestro.clase_recurso"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdClaseRecursoMaestro3"
                                                rendered="#{ClaseRecurso2.asistente.campoIdClaseRecursoMaestro1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecurso2.labelIdClaseRecursoMaestro2}"
                                                    id="labelIdClaseRecursoMaestro2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre clase recurso maestro"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdClaseRecursoMaestro4"
                                                rendered="#{ClaseRecurso2.asistente.campoIdClaseRecursoMaestro1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{ClaseRecurso2.campoIdClaseRecursoMaestro1Texto2}"
                                                    text="#{ClaseRecurso2.claseRecursoDataProvider.value['nombre_clase_recurso_1x6y4']}"
                                                    id="campoIdClaseRecursoMaestro1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{ClaseRecurso2.campoIdClaseRecursoMaestro1Boton2}"
                                                    id="campoIdClaseRecursoMaestro1Boton2"
                                                    onClick="#{ClaseRecurso2.asistente.scriptCampoIdClaseRecursoMaestro1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdClaseRecursoSegmento1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecurso2.labelIdClaseRecursoSegmento1}"
                                                    id="labelIdClaseRecursoSegmento1"
                                                    for="campoIdClaseRecursoSegmento1"
                                                    text="clase recurso segmento"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdClaseRecursoSegmento2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdClaseRecursoSegmento1"
                                                    binding="#{ClaseRecurso2.campoIdClaseRecursoSegmento1}"
                                                    readOnly="#{ClaseRecurso2.gestor.filaNoProcesada}"
                                                    text="#{ClaseRecurso2.asistente.textoCampoIdClaseRecursoSegmento1}"
                                                    toolTip="#{ClaseRecurso2.asistente.toolTipCampoIdClaseRecursoSegmento1}"
                                                    validatorExpression="#{ClaseRecurso2.campoIdClaseRecursoSegmento1_validate}"/>
                                                <webuijsf:staticText id="campoIdClaseRecursoSegmento1Texto1"
                                                    binding="#{ClaseRecurso2.campoIdClaseRecursoSegmento1Texto1}"
                                                    text="#{ClaseRecurso2.claseRecursoDataProvider.value['codigo_clase_recurso_1x7y3']}"/>
                                                <webuijsf:button id="campoIdClaseRecursoSegmento1Boton1"
                                                    binding="#{ClaseRecurso2.campoIdClaseRecursoSegmento1Boton1}"
                                                    onClick="#{ClaseRecurso2.asistente.scriptCampoIdClaseRecursoSegmento1Boton1}"/>
                                                <webuijsf:button id="campoIdClaseRecursoSegmento1Boton3"
                                                    binding="#{ClaseRecurso2.campoIdClaseRecursoSegmento1Boton3}"
                                                    onClick="#{ClaseRecurso2.asistente.scriptCampoIdClaseRecursoSegmento1Boton2}"
                                                    rendered="#{ClaseRecurso2.asistente.campoIdClaseRecursoSegmento1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdClaseRecursoSegmento1"
                                                    for="campoIdClaseRecursoSegmento1"/>
                                                <webuijsf:helpInline id="helpInlineIdClaseRecursoSegmento1"
                                                    binding="#{ClaseRecurso2.helpInlineIdClaseRecursoSegmento1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_clase_recurso_segmento.clase_recurso"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdClaseRecursoSegmento3"
                                                rendered="#{ClaseRecurso2.asistente.campoIdClaseRecursoSegmento1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecurso2.labelIdClaseRecursoSegmento2}"
                                                    id="labelIdClaseRecursoSegmento2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre clase recurso segmento"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdClaseRecursoSegmento4"
                                                rendered="#{ClaseRecurso2.asistente.campoIdClaseRecursoSegmento1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{ClaseRecurso2.campoIdClaseRecursoSegmento1Texto2}"
                                                    text="#{ClaseRecurso2.claseRecursoDataProvider.value['nombre_clase_recurso_1x7y4']}"
                                                    id="campoIdClaseRecursoSegmento1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{ClaseRecurso2.campoIdClaseRecursoSegmento1Boton2}"
                                                    id="campoIdClaseRecursoSegmento1Boton2"
                                                    onClick="#{ClaseRecurso2.asistente.scriptCampoIdClaseRecursoSegmento1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdClaseRecursoBase1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecurso2.labelIdClaseRecursoBase1}"
                                                    id="labelIdClaseRecursoBase1"
                                                    for="campoIdClaseRecursoBase1"
                                                    text="clase recurso base"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdClaseRecursoBase2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdClaseRecursoBase1"
                                                    binding="#{ClaseRecurso2.campoIdClaseRecursoBase1}"
                                                    readOnly="#{ClaseRecurso2.gestor.filaNoProcesada}"
                                                    text="#{ClaseRecurso2.asistente.textoCampoIdClaseRecursoBase1}"
                                                    toolTip="#{ClaseRecurso2.asistente.toolTipCampoIdClaseRecursoBase1}"
                                                    validatorExpression="#{ClaseRecurso2.campoIdClaseRecursoBase1_validate}"/>
                                                <webuijsf:staticText id="campoIdClaseRecursoBase1Texto1"
                                                    binding="#{ClaseRecurso2.campoIdClaseRecursoBase1Texto1}"
                                                    text="#{ClaseRecurso2.claseRecursoDataProvider.value['codigo_clase_recurso_1x8y3']}"/>
                                                <webuijsf:button id="campoIdClaseRecursoBase1Boton1"
                                                    binding="#{ClaseRecurso2.campoIdClaseRecursoBase1Boton1}"
                                                    onClick="#{ClaseRecurso2.asistente.scriptCampoIdClaseRecursoBase1Boton1}"/>
                                                <webuijsf:button id="campoIdClaseRecursoBase1Boton3"
                                                    binding="#{ClaseRecurso2.campoIdClaseRecursoBase1Boton3}"
                                                    onClick="#{ClaseRecurso2.asistente.scriptCampoIdClaseRecursoBase1Boton2}"
                                                    rendered="#{ClaseRecurso2.asistente.campoIdClaseRecursoBase1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdClaseRecursoBase1"
                                                    for="campoIdClaseRecursoBase1"/>
                                                <webuijsf:helpInline id="helpInlineIdClaseRecursoBase1"
                                                    binding="#{ClaseRecurso2.helpInlineIdClaseRecursoBase1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_clase_recurso_base.clase_recurso"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdClaseRecursoBase3"
                                                rendered="#{ClaseRecurso2.asistente.campoIdClaseRecursoBase1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecurso2.labelIdClaseRecursoBase2}"
                                                    id="labelIdClaseRecursoBase2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre clase recurso base"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdClaseRecursoBase4"
                                                rendered="#{ClaseRecurso2.asistente.campoIdClaseRecursoBase1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{ClaseRecurso2.campoIdClaseRecursoBase1Texto2}"
                                                    text="#{ClaseRecurso2.claseRecursoDataProvider.value['nombre_clase_recurso_1x8y4']}"
                                                    id="campoIdClaseRecursoBase1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{ClaseRecurso2.campoIdClaseRecursoBase1Boton2}"
                                                    id="campoIdClaseRecursoBase1Boton2"
                                                    onClick="#{ClaseRecurso2.asistente.scriptCampoIdClaseRecursoBase1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdGrupoAplicacion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecurso2.labelIdGrupoAplicacion1}"
                                                    id="labelIdGrupoAplicacion1"
                                                    for="campoIdGrupoAplicacion1"
                                                    text="grupo aplicacion"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdGrupoAplicacion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdGrupoAplicacion1"
                                                    binding="#{ClaseRecurso2.campoIdGrupoAplicacion1}"
                                                    readOnly="#{ClaseRecurso2.gestor.filaNoProcesada}"
                                                    text="#{ClaseRecurso2.asistente.textoCampoIdGrupoAplicacion1}"
                                                    toolTip="#{ClaseRecurso2.asistente.toolTipCampoIdGrupoAplicacion1}"
                                                    validatorExpression="#{ClaseRecurso2.campoIdGrupoAplicacion1_validate}"/>
                                                <webuijsf:staticText id="campoIdGrupoAplicacion1Texto1"
                                                    binding="#{ClaseRecurso2.campoIdGrupoAplicacion1Texto1}"
                                                    text="#{ClaseRecurso2.claseRecursoDataProvider.value['codigo_grupo_aplicacion_1x9y3']}"/>
                                                <webuijsf:button id="campoIdGrupoAplicacion1Boton1"
                                                    binding="#{ClaseRecurso2.campoIdGrupoAplicacion1Boton1}"
                                                    onClick="#{ClaseRecurso2.asistente.scriptCampoIdGrupoAplicacion1Boton1}"/>
                                                <webuijsf:button id="campoIdGrupoAplicacion1Boton3"
                                                    binding="#{ClaseRecurso2.campoIdGrupoAplicacion1Boton3}"
                                                    onClick="#{ClaseRecurso2.asistente.scriptCampoIdGrupoAplicacion1Boton2}"
                                                    rendered="#{ClaseRecurso2.asistente.campoIdGrupoAplicacion1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdGrupoAplicacion1"
                                                    for="campoIdGrupoAplicacion1"/>
                                                <webuijsf:helpInline id="helpInlineIdGrupoAplicacion1"
                                                    binding="#{ClaseRecurso2.helpInlineIdGrupoAplicacion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_grupo_aplicacion.clase_recurso"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdGrupoAplicacion3"
                                                rendered="#{ClaseRecurso2.asistente.campoIdGrupoAplicacion1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecurso2.labelIdGrupoAplicacion2}"
                                                    id="labelIdGrupoAplicacion2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre grupo aplicacion"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdGrupoAplicacion4"
                                                rendered="#{ClaseRecurso2.asistente.campoIdGrupoAplicacion1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{ClaseRecurso2.campoIdGrupoAplicacion1Texto2}"
                                                    text="#{ClaseRecurso2.claseRecursoDataProvider.value['nombre_grupo_aplicacion_1x9y4']}"
                                                    id="campoIdGrupoAplicacion1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{ClaseRecurso2.campoIdGrupoAplicacion1Boton2}"
                                                    id="campoIdGrupoAplicacion1Boton2"
                                                    onClick="#{ClaseRecurso2.asistente.scriptCampoIdGrupoAplicacion1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdAplicacionWeb1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecurso2.labelIdAplicacionWeb1}"
                                                    id="labelIdAplicacionWeb1"
                                                    for="campoIdAplicacionWeb1"
                                                    text="id aplicacion web"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdAplicacionWeb2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdAplicacionWeb1"
                                                    binding="#{ClaseRecurso2.campoIdAplicacionWeb1}"
                                                    converter="#{ClaseRecurso2.converterIdAplicacionWeb1}"
                                                    readOnly="#{ClaseRecurso2.gestor.filaNoProcesada}"
                                                    text="#{ClaseRecurso2.claseRecursoDataProvider.value['id_aplicacion_web']}"
                                                    toolTip="BundleParametros.id_aplicacion_web.clase_recurso"
                                                    validatorExpression="#{ClaseRecurso2.validatorIdAplicacionWeb1.validate}"/>
                                                <webuijsf:staticText id="campoIdAplicacionWeb1Texto1"
                                                    binding="#{ClaseRecurso2.campoIdAplicacionWeb1Texto1}"
                                                    text="#{ClaseRecurso2.claseRecursoDataProvider.value['id_aplicacion_web']}"/>
                                                <webuijsf:message id="messageIdAplicacionWeb1"
                                                    for="campoIdAplicacionWeb1"/>
                                                <webuijsf:helpInline id="helpInlineIdAplicacionWeb1"
                                                    binding="#{ClaseRecurso2.helpInlineIdAplicacionWeb1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_aplicacion_web.clase_recurso"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridLimiteFilasConsulta1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecurso2.labelLimiteFilasConsulta1}"
                                                    id="labelLimiteFilasConsulta1"
                                                    for="campoLimiteFilasConsulta1"
                                                    text="limite filas consulta"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridLimiteFilasConsulta2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoLimiteFilasConsulta1"
                                                    binding="#{ClaseRecurso2.campoLimiteFilasConsulta1}"
                                                    converter="#{ClaseRecurso2.converterLimiteFilasConsulta1}"
                                                    readOnly="#{ClaseRecurso2.gestor.filaNoProcesada}"
                                                    text="#{ClaseRecurso2.claseRecursoDataProvider.value['limite_filas_consulta']}"
                                                    toolTip="BundleParametros.limite_filas_consulta.clase_recurso"
                                                    validatorExpression="#{ClaseRecurso2.validatorLimiteFilasConsulta1.validate}"/>
                                                <webuijsf:staticText id="campoLimiteFilasConsulta1Texto1"
                                                    binding="#{ClaseRecurso2.campoLimiteFilasConsulta1Texto1}"
                                                    text="#{ClaseRecurso2.claseRecursoDataProvider.value['limite_filas_consulta']}"/>
                                                <webuijsf:message id="messageLimiteFilasConsulta1"
                                                    for="campoLimiteFilasConsulta1"/>
                                                <webuijsf:helpInline id="helpInlineLimiteFilasConsulta1"
                                                    binding="#{ClaseRecurso2.helpInlineLimiteFilasConsulta1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.limite_filas_consulta.clase_recurso"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridLimiteFilasInforme1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecurso2.labelLimiteFilasInforme1}"
                                                    id="labelLimiteFilasInforme1"
                                                    for="campoLimiteFilasInforme1"
                                                    text="limite filas informe"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridLimiteFilasInforme2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoLimiteFilasInforme1"
                                                    binding="#{ClaseRecurso2.campoLimiteFilasInforme1}"
                                                    converter="#{ClaseRecurso2.converterLimiteFilasInforme1}"
                                                    readOnly="#{ClaseRecurso2.gestor.filaNoProcesada}"
                                                    text="#{ClaseRecurso2.claseRecursoDataProvider.value['limite_filas_informe']}"
                                                    toolTip="BundleParametros.limite_filas_informe.clase_recurso"
                                                    validatorExpression="#{ClaseRecurso2.validatorLimiteFilasInforme1.validate}"/>
                                                <webuijsf:staticText id="campoLimiteFilasInforme1Texto1"
                                                    binding="#{ClaseRecurso2.campoLimiteFilasInforme1Texto1}"
                                                    text="#{ClaseRecurso2.claseRecursoDataProvider.value['limite_filas_informe']}"/>
                                                <webuijsf:message id="messageLimiteFilasInforme1"
                                                    for="campoLimiteFilasInforme1"/>
                                                <webuijsf:helpInline id="helpInlineLimiteFilasInforme1"
                                                    binding="#{ClaseRecurso2.helpInlineLimiteFilasInforme1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.limite_filas_informe.clase_recurso"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridOrdenPresentacion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecurso2.labelOrdenPresentacion1}"
                                                    id="labelOrdenPresentacion1"
                                                    for="campoOrdenPresentacion1"
                                                    text="orden presentacion"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridOrdenPresentacion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoOrdenPresentacion1"
                                                    binding="#{ClaseRecurso2.campoOrdenPresentacion1}"
                                                    converter="#{ClaseRecurso2.converterOrdenPresentacion1}"
                                                    readOnly="#{ClaseRecurso2.gestor.filaNoProcesada}"
                                                    text="#{ClaseRecurso2.claseRecursoDataProvider.value['orden_presentacion']}"
                                                    toolTip="BundleParametros.orden_presentacion.clase_recurso"
                                                    validatorExpression="#{ClaseRecurso2.validatorOrdenPresentacion1.validate}"/>
                                                <webuijsf:staticText id="campoOrdenPresentacion1Texto1"
                                                    binding="#{ClaseRecurso2.campoOrdenPresentacion1Texto1}"
                                                    text="#{ClaseRecurso2.claseRecursoDataProvider.value['orden_presentacion']}"/>
                                                <webuijsf:message id="messageOrdenPresentacion1"
                                                    for="campoOrdenPresentacion1"/>
                                                <webuijsf:helpInline id="helpInlineOrdenPresentacion1"
                                                    binding="#{ClaseRecurso2.helpInlineOrdenPresentacion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.orden_presentacion.clase_recurso"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsClaseRecursoInsertable1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecurso2.labelEsClaseRecursoInsertable1}"
                                                    id="labelEsClaseRecursoInsertable1"
                                                    for="listaEsClaseRecursoInsertable1"
                                                    text="insertable"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsClaseRecursoInsertable2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsClaseRecursoInsertable1"
                                                    binding="#{ClaseRecurso2.listaEsClaseRecursoInsertable1}"
                                                    converter="#{ClaseRecurso2.converterEsClaseRecursoInsertable1}"
                                                    disabled="#{ClaseRecurso2.gestor.filaNoProcesada}" required="true"
                                                    items="#{ClaseRecurso2.asistente.opcionesListaEsClaseRecursoInsertable1}"
                                                    selected="#{ClaseRecurso2.claseRecursoDataProvider.value['es_clase_recurso_insertable']}"
                                                    toolTip="BundleParametros.es_clase_recurso_insertable.clase_recurso"/>
                                                <webuijsf:staticText id="listaEsClaseRecursoInsertable1Texto1"
                                                    binding="#{ClaseRecurso2.listaEsClaseRecursoInsertable1Texto1}"/>
                                                <webuijsf:message id="messageEsClaseRecursoInsertable1"
                                                    for="listaEsClaseRecursoInsertable1"/>
                                                <webuijsf:helpInline id="helpInlineEsClaseRecursoInsertable1"
                                                    binding="#{ClaseRecurso2.helpInlineEsClaseRecursoInsertable1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_clase_recurso_insertable.clase_recurso"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsClaseRecursoModificable1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecurso2.labelEsClaseRecursoModificable1}"
                                                    id="labelEsClaseRecursoModificable1"
                                                    for="listaEsClaseRecursoModificable1"
                                                    text="modificable"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsClaseRecursoModificable2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsClaseRecursoModificable1"
                                                    binding="#{ClaseRecurso2.listaEsClaseRecursoModificable1}"
                                                    converter="#{ClaseRecurso2.converterEsClaseRecursoModificable1}"
                                                    disabled="#{ClaseRecurso2.gestor.filaNoProcesada}" required="true"
                                                    items="#{ClaseRecurso2.asistente.opcionesListaEsClaseRecursoModificable1}"
                                                    selected="#{ClaseRecurso2.claseRecursoDataProvider.value['es_clase_recurso_modificable']}"
                                                    toolTip="BundleParametros.es_clase_recurso_modificable.clase_recurso"/>
                                                <webuijsf:staticText id="listaEsClaseRecursoModificable1Texto1"
                                                    binding="#{ClaseRecurso2.listaEsClaseRecursoModificable1Texto1}"/>
                                                <webuijsf:message id="messageEsClaseRecursoModificable1"
                                                    for="listaEsClaseRecursoModificable1"/>
                                                <webuijsf:helpInline id="helpInlineEsClaseRecursoModificable1"
                                                    binding="#{ClaseRecurso2.helpInlineEsClaseRecursoModificable1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_clase_recurso_modificable.clase_recurso"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsClaseRecursoEliminable1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecurso2.labelEsClaseRecursoEliminable1}"
                                                    id="labelEsClaseRecursoEliminable1"
                                                    for="listaEsClaseRecursoEliminable1"
                                                    text="eliminable"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsClaseRecursoEliminable2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsClaseRecursoEliminable1"
                                                    binding="#{ClaseRecurso2.listaEsClaseRecursoEliminable1}"
                                                    converter="#{ClaseRecurso2.converterEsClaseRecursoEliminable1}"
                                                    disabled="#{ClaseRecurso2.gestor.filaNoProcesada}" required="true"
                                                    items="#{ClaseRecurso2.asistente.opcionesListaEsClaseRecursoEliminable1}"
                                                    selected="#{ClaseRecurso2.claseRecursoDataProvider.value['es_clase_recurso_eliminable']}"
                                                    toolTip="BundleParametros.es_clase_recurso_eliminable.clase_recurso"/>
                                                <webuijsf:staticText id="listaEsClaseRecursoEliminable1Texto1"
                                                    binding="#{ClaseRecurso2.listaEsClaseRecursoEliminable1Texto1}"/>
                                                <webuijsf:message id="messageEsClaseRecursoEliminable1"
                                                    for="listaEsClaseRecursoEliminable1"/>
                                                <webuijsf:helpInline id="helpInlineEsClaseRecursoEliminable1"
                                                    binding="#{ClaseRecurso2.helpInlineEsClaseRecursoEliminable1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_clase_recurso_eliminable.clase_recurso"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsClaseRecursoExtendida1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecurso2.labelEsClaseRecursoExtendida1}"
                                                    id="labelEsClaseRecursoExtendida1"
                                                    for="listaEsClaseRecursoExtendida1"
                                                    text="extendida"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsClaseRecursoExtendida2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsClaseRecursoExtendida1"
                                                    binding="#{ClaseRecurso2.listaEsClaseRecursoExtendida1}"
                                                    converter="#{ClaseRecurso2.converterEsClaseRecursoExtendida1}"
                                                    disabled="#{ClaseRecurso2.gestor.filaNoProcesada}" required="true"
                                                    items="#{ClaseRecurso2.asistente.opcionesListaEsClaseRecursoExtendida1}"
                                                    selected="#{ClaseRecurso2.claseRecursoDataProvider.value['es_clase_recurso_extendida']}"
                                                    toolTip="BundleParametros.es_clase_recurso_extendida.clase_recurso"/>
                                                <webuijsf:staticText id="listaEsClaseRecursoExtendida1Texto1"
                                                    binding="#{ClaseRecurso2.listaEsClaseRecursoExtendida1Texto1}"/>
                                                <webuijsf:message id="messageEsClaseRecursoExtendida1"
                                                    for="listaEsClaseRecursoExtendida1"/>
                                                <webuijsf:helpInline id="helpInlineEsClaseRecursoExtendida1"
                                                    binding="#{ClaseRecurso2.helpInlineEsClaseRecursoExtendida1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_clase_recurso_extendida.clase_recurso"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEtiquetaHipervinculo1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecurso2.labelEtiquetaHipervinculo1}"
                                                    id="labelEtiquetaHipervinculo1"
                                                    for="campoEtiquetaHipervinculo1"
                                                    text="etiqueta hipervinculo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEtiquetaHipervinculo2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoEtiquetaHipervinculo1"
                                                    binding="#{ClaseRecurso2.campoEtiquetaHipervinculo1}"
                                                    columns="10"
                                                    maxLength="20"
                                                    readOnly="#{ClaseRecurso2.gestor.filaNoProcesada}"
                                                    text="#{ClaseRecurso2.claseRecursoDataProvider.value['etiqueta_hipervinculo']}"
                                                    toolTip="BundleParametros.etiqueta_hipervinculo.clase_recurso"
                                                    validatorExpression="#{ClaseRecurso2.validatorEtiquetaHipervinculo1.validate}"/>
                                                <webuijsf:staticText id="campoEtiquetaHipervinculo1Texto1"
                                                    binding="#{ClaseRecurso2.campoEtiquetaHipervinculo1Texto1}"
                                                    text="#{ClaseRecurso2.claseRecursoDataProvider.value['etiqueta_hipervinculo']}"/>
                                                <webuijsf:message id="messageEtiquetaHipervinculo1"
                                                    for="campoEtiquetaHipervinculo1"/>
                                                <webuijsf:helpInline id="helpInlineEtiquetaHipervinculo1"
                                                    binding="#{ClaseRecurso2.helpInlineEtiquetaHipervinculo1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.etiqueta_hipervinculo.clase_recurso"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsEnumeradorConNumero1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecurso2.labelEsEnumeradorConNumero1}"
                                                    id="labelEsEnumeradorConNumero1"
                                                    for="listaEsEnumeradorConNumero1"
                                                    text="enumerador con numero"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsEnumeradorConNumero2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsEnumeradorConNumero1"
                                                    binding="#{ClaseRecurso2.listaEsEnumeradorConNumero1}"
                                                    converter="#{ClaseRecurso2.converterEsEnumeradorConNumero1}"
                                                    disabled="#{ClaseRecurso2.gestor.filaNoProcesada}" required="true"
                                                    items="#{ClaseRecurso2.asistente.opcionesListaEsEnumeradorConNumero1}"
                                                    selected="#{ClaseRecurso2.claseRecursoDataProvider.value['es_enumerador_con_numero']}"
                                                    toolTip="BundleParametros.es_enumerador_con_numero.clase_recurso"/>
                                                <webuijsf:staticText id="listaEsEnumeradorConNumero1Texto1"
                                                    binding="#{ClaseRecurso2.listaEsEnumeradorConNumero1Texto1}"/>
                                                <webuijsf:message id="messageEsEnumeradorConNumero1"
                                                    for="listaEsEnumeradorConNumero1"/>
                                                <webuijsf:helpInline id="helpInlineEsEnumeradorConNumero1"
                                                    binding="#{ClaseRecurso2.helpInlineEsEnumeradorConNumero1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_enumerador_con_numero.clase_recurso"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridAliasClaseRecurso1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecurso2.labelAliasClaseRecurso1}"
                                                    id="labelAliasClaseRecurso1"
                                                    for="campoAliasClaseRecurso1"
                                                    text="alias"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridAliasClaseRecurso2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoAliasClaseRecurso1"
                                                    binding="#{ClaseRecurso2.campoAliasClaseRecurso1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{ClaseRecurso2.gestor.filaNoProcesada}"
                                                    text="#{ClaseRecurso2.claseRecursoDataProvider.value['alias_clase_recurso']}"
                                                    toolTip="BundleParametros.alias_clase_recurso.clase_recurso"
                                                    validatorExpression="#{ClaseRecurso2.validatorAliasClaseRecurso1.validate}"/>
                                                <webuijsf:staticText id="campoAliasClaseRecurso1Texto1"
                                                    binding="#{ClaseRecurso2.campoAliasClaseRecurso1Texto1}"
                                                    text="#{ClaseRecurso2.claseRecursoDataProvider.value['alias_clase_recurso']}"/>
                                                <webuijsf:message id="messageAliasClaseRecurso1"
                                                    for="campoAliasClaseRecurso1"/>
                                                <webuijsf:helpInline id="helpInlineAliasClaseRecurso1"
                                                    binding="#{ClaseRecurso2.helpInlineAliasClaseRecurso1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.alias_clase_recurso.clase_recurso"
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
                                                        actionExpression="#{ClaseRecurso2.botonIrAlPrimero2_action}"
                                                        binding="#{ClaseRecurso2.botonIrAlPrimero2}"
                                                        disabled="#{ClaseRecurso2.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero2"
                                                        imageURL="#{ClaseRecurso2.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{ClaseRecurso2.gestor.scriptIrAlPrimero}"
                                                        text="#{ClaseRecurso2.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{ClaseRecurso2.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{ClaseRecurso2.botonIrAlAnterior2_action}"
                                                        binding="#{ClaseRecurso2.botonIrAlAnterior2}"
                                                        disabled="#{ClaseRecurso2.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior2"
                                                        imageURL="#{ClaseRecurso2.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{ClaseRecurso2.gestor.scriptIrAlAnterior}"
                                                        text="#{ClaseRecurso2.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{ClaseRecurso2.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{ClaseRecurso2.botonIrAlSiguiente2_action}"
                                                        binding="#{ClaseRecurso2.botonIrAlSiguiente2}"
                                                        disabled="#{ClaseRecurso2.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente2"
                                                        imageURL="#{ClaseRecurso2.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{ClaseRecurso2.gestor.scriptIrAlSiguiente}"
                                                        text="#{ClaseRecurso2.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{ClaseRecurso2.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{ClaseRecurso2.botonIrAlUltimo2_action}"
                                                        binding="#{ClaseRecurso2.botonIrAlUltimo2}"
                                                        disabled="#{ClaseRecurso2.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo2"
                                                        imageURL="#{ClaseRecurso2.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{ClaseRecurso2.gestor.scriptIrAlUltimo}"
                                                        text="#{ClaseRecurso2.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{ClaseRecurso2.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{ClaseRecurso2.botonProcesarFila2_action}"
                                                        binding="#{ClaseRecurso2.botonProcesarFila2}"
                                                        disabled="#{ClaseRecurso2.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila2"
                                                        imageURL="#{ClaseRecurso2.gestor.urlImagenProcesar}"
                                                        onClick="#{ClaseRecurso2.scriptAbrirVentanaProcesarFila2}"
                                                        rendered="#{ClaseRecurso2.asistente.comandoDisponible}"
                                                        text="#{ClaseRecurso2.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{ClaseRecurso2.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{ClaseRecurso2.gestor.mensajeCambiosPorConfirmar}"/>
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
                                                    actionExpression="#{ClaseRecurso2.botonAgregar1_action}"
                                                    binding="#{ClaseRecurso2.botonAgregar1}"
                                                    disabled="#{ClaseRecurso2.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{ClaseRecurso2.gestor.scriptAgregar}"
                                                    rendered="#{ClaseRecurso2.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ClaseRecurso2.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{ClaseRecurso2.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{ClaseRecurso2.listaFuncionEdicion1}"
                                                    converter="#{ClaseRecurso2.converterListaFuncionEdicion1}"
                                                    disabled="#{ClaseRecurso2.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{ClaseRecurso2.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{ClaseRecurso2.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{ClaseRecurso2.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{ClaseRecurso2.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ClaseRecurso2.botonEditar1_action}"
                                                    binding="#{ClaseRecurso2.botonEditar1}"
                                                    disabled="#{ClaseRecurso2.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{ClaseRecurso2.gestor.scriptEditar}"
                                                    rendered="#{ClaseRecurso2.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ClaseRecurso2.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{ClaseRecurso2.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ClaseRecurso2.botonEliminar1_action}"
                                                    binding="#{ClaseRecurso2.botonEliminar1}"
                                                    disabled="#{ClaseRecurso2.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{ClaseRecurso2.gestor.scriptEliminar}"
                                                    rendered="#{ClaseRecurso2.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ClaseRecurso2.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{ClaseRecurso2.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ClaseRecurso2.botonAplicar1_action}"
                                                    binding="#{ClaseRecurso2.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{ClaseRecurso2.gestor.scriptAplicar}"
                                                    rendered="#{ClaseRecurso2.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ClaseRecurso2.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{ClaseRecurso2.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ClaseRecurso2.botonDeshacer1_action}"
                                                    binding="#{ClaseRecurso2.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{ClaseRecurso2.gestor.scriptDeshacer}"
                                                    rendered="#{ClaseRecurso2.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ClaseRecurso2.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{ClaseRecurso2.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ClaseRecurso2.botonConfirmar1_action}"
                                                    binding="#{ClaseRecurso2.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{ClaseRecurso2.gestor.scriptConfirmar}"
                                                    rendered="#{ClaseRecurso2.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ClaseRecurso2.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{ClaseRecurso2.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ClaseRecurso2.botonDescartar1_action}"
                                                    binding="#{ClaseRecurso2.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{ClaseRecurso2.gestor.scriptDescartar}"
                                                    rendered="#{ClaseRecurso2.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ClaseRecurso2.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{ClaseRecurso2.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{ClaseRecurso2.listaFuncionAccion1}"
                                                    converter="#{ClaseRecurso2.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{ClaseRecurso2.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{ClaseRecurso2.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{ClaseRecurso2.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{ClaseRecurso2.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ClaseRecurso2.botonProcesar1_action}"
                                                    binding="#{ClaseRecurso2.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{ClaseRecurso2.gestor.scriptProcesar}"
                                                    rendered="#{ClaseRecurso2.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ClaseRecurso2.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{ClaseRecurso2.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ClaseRecurso2.botonRefrescar1_action}"
                                                    binding="#{ClaseRecurso2.botonRefrescar1}"
                                                    disabled="#{ClaseRecurso2.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{ClaseRecurso2.gestor.scriptRefrescar}"
                                                    rendered="#{ClaseRecurso2.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ClaseRecurso2.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{ClaseRecurso2.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ClaseRecurso2.botonReconsultar1_action}"
                                                    binding="#{ClaseRecurso2.botonReconsultar1}"
                                                    disabled="#{ClaseRecurso2.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{ClaseRecurso2.gestor.scriptReconsultar}"
                                                    rendered="#{ClaseRecurso2.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ClaseRecurso2.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{ClaseRecurso2.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ClaseRecurso2.botonRetornar1_action}"
                                                    binding="#{ClaseRecurso2.botonRetornar1}"
                                                    disabled="#{ClaseRecurso2.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{ClaseRecurso2.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{ClaseRecurso2.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ClaseRecurso2.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{ClaseRecurso2.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="4" 
                                                id="gridPanel125"
                                                rendered="#{ClaseRecurso2.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{ClaseRecurso2.imageHyperlink1_action}"
                                                    binding="#{ClaseRecurso2.imageHyperlink1}"
                                                    disabled="#{ClaseRecurso2.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{ClaseRecurso2.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{ClaseRecurso2.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.ClaseRecurso2_imageHyperlink1_toolTip}"/>
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{ClaseRecurso2.imageHyperlink2_action}"
                                                    binding="#{ClaseRecurso2.imageHyperlink2}"
                                                    disabled="#{ClaseRecurso2.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink2"
                                                    imageURL="#{ClaseRecurso2.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{ClaseRecurso2.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    text="Hyperlink2"
                                                    toolTip="#{bundle.ClaseRecurso2_imageHyperlink2_toolTip}"/>
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{ClaseRecurso2.imageHyperlink3_action}"
                                                    binding="#{ClaseRecurso2.imageHyperlink3}"
                                                    disabled="#{ClaseRecurso2.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink3"
                                                    imageURL="#{ClaseRecurso2.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{ClaseRecurso2.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    text="Hyperlink3"
                                                    toolTip="#{bundle.ClaseRecurso2_imageHyperlink3_toolTip}"/>
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{ClaseRecurso2.imageHyperlink4_action}"
                                                    binding="#{ClaseRecurso2.imageHyperlink4}"
                                                    disabled="#{ClaseRecurso2.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink4"
                                                    imageURL="#{ClaseRecurso2.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{ClaseRecurso2.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{ClaseRecurso2.gestor.designing}"
                                                    text="Hyperlink4"
                                                    toolTip="#{bundle.ClaseRecurso2_imageHyperlink4_toolTip}"/>
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
