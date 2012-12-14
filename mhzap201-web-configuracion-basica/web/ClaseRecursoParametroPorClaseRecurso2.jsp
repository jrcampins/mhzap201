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
                    focus="#{ClaseRecursoParametroPorClaseRecurso2.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{ClaseRecursoParametroPorClaseRecurso2.gestor.preserveFocus}"
                    preserveScroll="#{ClaseRecursoParametroPorClaseRecurso2.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{ClaseRecursoParametroPorClaseRecurso2.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | campoIdClaseRecursoPar1 campoIdParametro1 listaNumeroTipoParametro1 listaNumeroTipoComparacion1 campoIdFuncionReferencia1 listaNumeroTipoValor1 campoIdListaValor1 campoIdClaseObjetoValor1 campoIdClaseRecursoValor1 campoValorMinimo1 campoValorMaximo1 campoValorOmision1 listaEsParametroOmisible1 listaEsParametroInmutable1 listaEsParametroSubmit1 listaEsParametroPrimordial1 listaEsParametroMaestro1 listaEsParametroSegmento1 listaEsParametroSinRastro1 listaEsParametroSincronizado1 campoOrdenPresentacion1 campoIdClaseRecursoSec1 listaEsReferenciaAlternativa1 listaNumeroTipoValorAlternativo1 campoIdFuncionReferenciaAlt1 campoIdListaValorAlternativa1 campoIdClaseObjetoValorAlt1 campoIdClaseRecursoValorAlt1 campoOrdenPaginaSeleccion1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | | , virtualForm3 | listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{ClaseRecursoParametroPorClaseRecurso2.breadcrumbs1}" 
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
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso2.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{ClaseRecursoParametroPorClaseRecurso2.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso2.gestor.mensajeDisponible}"
                                                    text="#{ClaseRecursoParametroPorClaseRecurso2.gestor.mensaje}"
                                                    url="#{ClaseRecursoParametroPorClaseRecurso2.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            id="gridPanel104"
                                            rendered="#{ClaseRecursoParametroPorClaseRecurso2.gestor.filaDisponible}"
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
                                                        actionExpression="#{ClaseRecursoParametroPorClaseRecurso2.botonIrAlPrimero1_action}"
                                                        binding="#{ClaseRecursoParametroPorClaseRecurso2.botonIrAlPrimero1}"
                                                        disabled="#{ClaseRecursoParametroPorClaseRecurso2.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero1"
                                                        imageURL="#{ClaseRecursoParametroPorClaseRecurso2.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{ClaseRecursoParametroPorClaseRecurso2.gestor.scriptIrAlPrimero}"
                                                        text="#{ClaseRecursoParametroPorClaseRecurso2.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{ClaseRecursoParametroPorClaseRecurso2.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{ClaseRecursoParametroPorClaseRecurso2.botonIrAlAnterior1_action}"
                                                        binding="#{ClaseRecursoParametroPorClaseRecurso2.botonIrAlAnterior1}"
                                                        disabled="#{ClaseRecursoParametroPorClaseRecurso2.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior1"
                                                        imageURL="#{ClaseRecursoParametroPorClaseRecurso2.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{ClaseRecursoParametroPorClaseRecurso2.gestor.scriptIrAlAnterior}"
                                                        text="#{ClaseRecursoParametroPorClaseRecurso2.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{ClaseRecursoParametroPorClaseRecurso2.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{ClaseRecursoParametroPorClaseRecurso2.botonIrAlSiguiente1_action}"
                                                        binding="#{ClaseRecursoParametroPorClaseRecurso2.botonIrAlSiguiente1}"
                                                        disabled="#{ClaseRecursoParametroPorClaseRecurso2.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente1"
                                                        imageURL="#{ClaseRecursoParametroPorClaseRecurso2.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{ClaseRecursoParametroPorClaseRecurso2.gestor.scriptIrAlSiguiente}"
                                                        text="#{ClaseRecursoParametroPorClaseRecurso2.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{ClaseRecursoParametroPorClaseRecurso2.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{ClaseRecursoParametroPorClaseRecurso2.botonIrAlUltimo1_action}"
                                                        binding="#{ClaseRecursoParametroPorClaseRecurso2.botonIrAlUltimo1}"
                                                        disabled="#{ClaseRecursoParametroPorClaseRecurso2.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo1"
                                                        imageURL="#{ClaseRecursoParametroPorClaseRecurso2.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{ClaseRecursoParametroPorClaseRecurso2.gestor.scriptIrAlUltimo}"
                                                        text="#{ClaseRecursoParametroPorClaseRecurso2.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{ClaseRecursoParametroPorClaseRecurso2.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{ClaseRecursoParametroPorClaseRecurso2.botonProcesarFila1_action}"
                                                        binding="#{ClaseRecursoParametroPorClaseRecurso2.botonProcesarFila1}"
                                                        disabled="#{ClaseRecursoParametroPorClaseRecurso2.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila1"
                                                        imageURL="#{ClaseRecursoParametroPorClaseRecurso2.gestor.urlImagenProcesar}"
                                                        onClick="#{ClaseRecursoParametroPorClaseRecurso2.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{ClaseRecursoParametroPorClaseRecurso2.asistente.comandoDisponible}"
                                                        text="#{ClaseRecursoParametroPorClaseRecurso2.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{ClaseRecursoParametroPorClaseRecurso2.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{ClaseRecursoParametroPorClaseRecurso2.gestor.tituloConsulta}"/>
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
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.etiquetaIdentificacionFila1}"
                                                    id="etiquetaIdentificacionFila1"
                                                    text="#{ClaseRecursoParametroPorClaseRecurso2.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{ClaseRecursoParametroPorClaseRecurso2.gestor.i18n.toolTipEtiquetaIdentificacionFila}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel113"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoIdentificacionFila1"
                                                    style="font-weight: bold"
                                                    text="#{ClaseRecursoParametroPorClaseRecurso2.gestor.identificacionFila}"/>
                                                <webuijsf:image
                                                    id="imagenFilaProcesada1"
                                                    toolTip="#{ClaseRecursoParametroPorClaseRecurso2.gestor.toolTipImagenFilaProcesada}"
                                                    url="#{ClaseRecursoParametroPorClaseRecurso2.gestor.urlImagenFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPanel114"
                                                rendered="#{ClaseRecursoParametroPorClaseRecurso2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.labelIdClaseRecurso1}"
                                                    id="labelIdClaseRecurso1"
                                                    text="clase recurso"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel115"
                                                rendered="#{ClaseRecursoParametroPorClaseRecurso2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoDenominacionFilaMaestro1"
                                                    style="font-weight: bold"
                                                    text="#{ClaseRecursoParametroPorClaseRecurso2.gestor.denominacionFilaMaestro}"/>
                                                <webuijsf:image
                                                    id="imagenFilaMaestro1"
                                                    url="#{ClaseRecursoParametroPorClaseRecurso2.gestor.urlImagenMaestroFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdClaseRecursoPar1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.labelIdClaseRecursoPar1}"
                                                    id="labelIdClaseRecursoPar1"
                                                    for="campoIdClaseRecursoPar1"
                                                    text="identificaci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdClaseRecursoPar2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdClaseRecursoPar1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.campoIdClaseRecursoPar1}"
                                                    converter="#{ClaseRecursoParametroPorClaseRecurso2.converterIdClaseRecursoPar1}"
                                                    readOnly="#{ClaseRecursoParametroPorClaseRecurso2.gestor.filaNoProcesada}" required="true"
                                                    text="#{ClaseRecursoParametroPorClaseRecurso2.claseRecursoParDataProvider.value['id_clase_recurso_par']}"
                                                    toolTip="BundleParametros.id_clase_recurso_par.clase_recurso_par"
                                                    validatorExpression="#{ClaseRecursoParametroPorClaseRecurso2.validatorIdClaseRecursoPar1.validate}"/>
                                                <webuijsf:staticText id="campoIdClaseRecursoPar1Texto1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.campoIdClaseRecursoPar1Texto1}"
                                                    text="#{ClaseRecursoParametroPorClaseRecurso2.claseRecursoParDataProvider.value['id_clase_recurso_par']}"/>
                                                <webuijsf:message id="messageIdClaseRecursoPar1"
                                                    for="campoIdClaseRecursoPar1"/>
                                                <webuijsf:helpInline id="helpInlineIdClaseRecursoPar1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.helpInlineIdClaseRecursoPar1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_clase_recurso_par.clase_recurso_par"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdParametro1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.labelIdParametro1}"
                                                    id="labelIdParametro1"
                                                    for="campoIdParametro1"
                                                    text="parametro"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdParametro2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdParametro1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.campoIdParametro1}"
                                                    readOnly="#{ClaseRecursoParametroPorClaseRecurso2.gestor.filaNoProcesada}" required="true"
                                                    text="#{ClaseRecursoParametroPorClaseRecurso2.asistente.textoCampoIdParametro1}"
                                                    toolTip="#{ClaseRecursoParametroPorClaseRecurso2.asistente.toolTipCampoIdParametro1}"
                                                    validatorExpression="#{ClaseRecursoParametroPorClaseRecurso2.campoIdParametro1_validate}"/>
                                                <webuijsf:staticText id="campoIdParametro1Texto1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.campoIdParametro1Texto1}"
                                                    text="#{ClaseRecursoParametroPorClaseRecurso2.claseRecursoParDataProvider.value['codigo_parametro_1x2y3']}"/>
                                                <webuijsf:button id="campoIdParametro1Boton1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.campoIdParametro1Boton1}"
                                                    onClick="#{ClaseRecursoParametroPorClaseRecurso2.asistente.scriptCampoIdParametro1Boton1}"/>
                                                <webuijsf:button id="campoIdParametro1Boton3"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.campoIdParametro1Boton3}"
                                                    onClick="#{ClaseRecursoParametroPorClaseRecurso2.asistente.scriptCampoIdParametro1Boton2}"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso2.asistente.campoIdParametro1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdParametro1"
                                                    for="campoIdParametro1"/>
                                                <webuijsf:helpInline id="helpInlineIdParametro1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.helpInlineIdParametro1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_parametro.clase_recurso_par"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdParametro3"
                                                rendered="#{ClaseRecursoParametroPorClaseRecurso2.asistente.campoIdParametro1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.labelIdParametro2}"
                                                    id="labelIdParametro2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre parametro"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdParametro4"
                                                rendered="#{ClaseRecursoParametroPorClaseRecurso2.asistente.campoIdParametro1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.campoIdParametro1Texto2}"
                                                    text="#{ClaseRecursoParametroPorClaseRecurso2.claseRecursoParDataProvider.value['nombre_parametro_1x2y4']}"
                                                    id="campoIdParametro1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.campoIdParametro1Boton2}"
                                                    id="campoIdParametro1Boton2"
                                                    onClick="#{ClaseRecursoParametroPorClaseRecurso2.asistente.scriptCampoIdParametro1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroTipoParametro1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.labelNumeroTipoParametro1}"
                                                    id="labelNumeroTipoParametro1"
                                                    for="listaNumeroTipoParametro1"
                                                    text="tipo parametro"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTipoParametro2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroTipoParametro1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.listaNumeroTipoParametro1}"
                                                    converter="#{ClaseRecursoParametroPorClaseRecurso2.converterNumeroTipoParametro1}"
                                                    disabled="#{ClaseRecursoParametroPorClaseRecurso2.gestor.filaNoProcesada}" required="true"
                                                    items="#{ClaseRecursoParametroPorClaseRecurso2.asistente.opcionesListaNumeroTipoParametro1}"
                                                    selected="#{ClaseRecursoParametroPorClaseRecurso2.claseRecursoParDataProvider.value['numero_tipo_parametro']}"
                                                    toolTip="BundleParametros.numero_tipo_parametro.clase_recurso_par"/>
                                                <webuijsf:staticText id="listaNumeroTipoParametro1Texto1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.listaNumeroTipoParametro1Texto1}"
                                                    text="#{ClaseRecursoParametroPorClaseRecurso2.claseRecursoParDataProvider.value['codigo_tipo_parametro_1x3y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoParametro1"
                                                    for="listaNumeroTipoParametro1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTipoParametro1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.helpInlineNumeroTipoParametro1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_tipo_parametro.clase_recurso_par"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroTipoComparacion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.labelNumeroTipoComparacion1}"
                                                    id="labelNumeroTipoComparacion1"
                                                    for="listaNumeroTipoComparacion1"
                                                    text="tipo comparaci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTipoComparacion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroTipoComparacion1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.listaNumeroTipoComparacion1}"
                                                    converter="#{ClaseRecursoParametroPorClaseRecurso2.converterNumeroTipoComparacion1}"
                                                    disabled="#{ClaseRecursoParametroPorClaseRecurso2.gestor.filaNoProcesada}"
                                                    items="#{ClaseRecursoParametroPorClaseRecurso2.asistente.opcionesListaNumeroTipoComparacion1}"
                                                    selected="#{ClaseRecursoParametroPorClaseRecurso2.claseRecursoParDataProvider.value['numero_tipo_comparacion']}"
                                                    toolTip="BundleParametros.numero_tipo_comparacion.clase_recurso_par"/>
                                                <webuijsf:staticText id="listaNumeroTipoComparacion1Texto1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.listaNumeroTipoComparacion1Texto1}"
                                                    text="#{ClaseRecursoParametroPorClaseRecurso2.claseRecursoParDataProvider.value['codigo_tipo_comparacion_1x4y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoComparacion1"
                                                    for="listaNumeroTipoComparacion1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTipoComparacion1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.helpInlineNumeroTipoComparacion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_tipo_comparacion.clase_recurso_par"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdFuncionReferencia1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.labelIdFuncionReferencia1}"
                                                    id="labelIdFuncionReferencia1"
                                                    for="campoIdFuncionReferencia1"
                                                    text="funci&#243;n referencia"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdFuncionReferencia2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdFuncionReferencia1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.campoIdFuncionReferencia1}"
                                                    readOnly="#{ClaseRecursoParametroPorClaseRecurso2.gestor.filaNoProcesada}"
                                                    text="#{ClaseRecursoParametroPorClaseRecurso2.asistente.textoCampoIdFuncionReferencia1}"
                                                    toolTip="#{ClaseRecursoParametroPorClaseRecurso2.asistente.toolTipCampoIdFuncionReferencia1}"
                                                    validatorExpression="#{ClaseRecursoParametroPorClaseRecurso2.campoIdFuncionReferencia1_validate}"/>
                                                <webuijsf:staticText id="campoIdFuncionReferencia1Texto1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.campoIdFuncionReferencia1Texto1}"
                                                    text="#{ClaseRecursoParametroPorClaseRecurso2.claseRecursoParDataProvider.value['codigo_funcion_1x5y3']}"/>
                                                <webuijsf:button id="campoIdFuncionReferencia1Boton1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.campoIdFuncionReferencia1Boton1}"
                                                    onClick="#{ClaseRecursoParametroPorClaseRecurso2.asistente.scriptCampoIdFuncionReferencia1Boton1}"/>
                                                <webuijsf:button id="campoIdFuncionReferencia1Boton3"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.campoIdFuncionReferencia1Boton3}"
                                                    onClick="#{ClaseRecursoParametroPorClaseRecurso2.asistente.scriptCampoIdFuncionReferencia1Boton2}"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso2.asistente.campoIdFuncionReferencia1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdFuncionReferencia1"
                                                    for="campoIdFuncionReferencia1"/>
                                                <webuijsf:helpInline id="helpInlineIdFuncionReferencia1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.helpInlineIdFuncionReferencia1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_funcion_referencia.clase_recurso_par"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdFuncionReferencia3"
                                                rendered="#{ClaseRecursoParametroPorClaseRecurso2.asistente.campoIdFuncionReferencia1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.labelIdFuncionReferencia2}"
                                                    id="labelIdFuncionReferencia2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre funci&#243;n referencia"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdFuncionReferencia4"
                                                rendered="#{ClaseRecursoParametroPorClaseRecurso2.asistente.campoIdFuncionReferencia1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.campoIdFuncionReferencia1Texto2}"
                                                    text="#{ClaseRecursoParametroPorClaseRecurso2.claseRecursoParDataProvider.value['nombre_funcion_1x5y4']}"
                                                    id="campoIdFuncionReferencia1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.campoIdFuncionReferencia1Boton2}"
                                                    id="campoIdFuncionReferencia1Boton2"
                                                    onClick="#{ClaseRecursoParametroPorClaseRecurso2.asistente.scriptCampoIdFuncionReferencia1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroTipoValor1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.labelNumeroTipoValor1}"
                                                    id="labelNumeroTipoValor1"
                                                    for="listaNumeroTipoValor1"
                                                    text="tipo valor"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTipoValor2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroTipoValor1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.listaNumeroTipoValor1}"
                                                    converter="#{ClaseRecursoParametroPorClaseRecurso2.converterNumeroTipoValor1}"
                                                    disabled="#{ClaseRecursoParametroPorClaseRecurso2.gestor.filaNoProcesada}" required="true"
                                                    items="#{ClaseRecursoParametroPorClaseRecurso2.asistente.opcionesListaNumeroTipoValor1}"
                                                    selected="#{ClaseRecursoParametroPorClaseRecurso2.claseRecursoParDataProvider.value['numero_tipo_valor']}"
                                                    toolTip="BundleParametros.numero_tipo_valor.clase_recurso_par"/>
                                                <webuijsf:staticText id="listaNumeroTipoValor1Texto1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.listaNumeroTipoValor1Texto1}"
                                                    text="#{ClaseRecursoParametroPorClaseRecurso2.claseRecursoParDataProvider.value['codigo_tipo_valor_1x6y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoValor1"
                                                    for="listaNumeroTipoValor1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTipoValor1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.helpInlineNumeroTipoValor1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_tipo_valor.clase_recurso_par"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdListaValor1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.labelIdListaValor1}"
                                                    id="labelIdListaValor1"
                                                    for="campoIdListaValor1"
                                                    text="identificaci&#243;n lista valor"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdListaValor2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdListaValor1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.campoIdListaValor1}"
                                                    converter="#{ClaseRecursoParametroPorClaseRecurso2.converterIdListaValor1}"
                                                    readOnly="#{ClaseRecursoParametroPorClaseRecurso2.gestor.filaNoProcesada}"
                                                    text="#{ClaseRecursoParametroPorClaseRecurso2.claseRecursoParDataProvider.value['id_lista_valor']}"
                                                    toolTip="BundleParametros.id_lista_valor.clase_recurso_par"
                                                    validatorExpression="#{ClaseRecursoParametroPorClaseRecurso2.validatorIdListaValor1.validate}"/>
                                                <webuijsf:staticText id="campoIdListaValor1Texto1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.campoIdListaValor1Texto1}"
                                                    text="#{ClaseRecursoParametroPorClaseRecurso2.claseRecursoParDataProvider.value['id_lista_valor']}"/>
                                                <webuijsf:message id="messageIdListaValor1"
                                                    for="campoIdListaValor1"/>
                                                <webuijsf:helpInline id="helpInlineIdListaValor1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.helpInlineIdListaValor1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_lista_valor.clase_recurso_par"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdClaseObjetoValor1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.labelIdClaseObjetoValor1}"
                                                    id="labelIdClaseObjetoValor1"
                                                    for="campoIdClaseObjetoValor1"
                                                    text="identificaci&#243;n clase objeto valor"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdClaseObjetoValor2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdClaseObjetoValor1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.campoIdClaseObjetoValor1}"
                                                    converter="#{ClaseRecursoParametroPorClaseRecurso2.converterIdClaseObjetoValor1}"
                                                    readOnly="#{ClaseRecursoParametroPorClaseRecurso2.gestor.filaNoProcesada}"
                                                    text="#{ClaseRecursoParametroPorClaseRecurso2.claseRecursoParDataProvider.value['id_clase_objeto_valor']}"
                                                    toolTip="BundleParametros.id_clase_objeto_valor.clase_recurso_par"
                                                    validatorExpression="#{ClaseRecursoParametroPorClaseRecurso2.validatorIdClaseObjetoValor1.validate}"/>
                                                <webuijsf:staticText id="campoIdClaseObjetoValor1Texto1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.campoIdClaseObjetoValor1Texto1}"
                                                    text="#{ClaseRecursoParametroPorClaseRecurso2.claseRecursoParDataProvider.value['id_clase_objeto_valor']}"/>
                                                <webuijsf:message id="messageIdClaseObjetoValor1"
                                                    for="campoIdClaseObjetoValor1"/>
                                                <webuijsf:helpInline id="helpInlineIdClaseObjetoValor1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.helpInlineIdClaseObjetoValor1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_clase_objeto_valor.clase_recurso_par"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdClaseRecursoValor1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.labelIdClaseRecursoValor1}"
                                                    id="labelIdClaseRecursoValor1"
                                                    for="campoIdClaseRecursoValor1"
                                                    text="clase recurso valor"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdClaseRecursoValor2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdClaseRecursoValor1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.campoIdClaseRecursoValor1}"
                                                    readOnly="#{ClaseRecursoParametroPorClaseRecurso2.gestor.filaNoProcesada}"
                                                    text="#{ClaseRecursoParametroPorClaseRecurso2.asistente.textoCampoIdClaseRecursoValor1}"
                                                    toolTip="#{ClaseRecursoParametroPorClaseRecurso2.asistente.toolTipCampoIdClaseRecursoValor1}"
                                                    validatorExpression="#{ClaseRecursoParametroPorClaseRecurso2.campoIdClaseRecursoValor1_validate}"/>
                                                <webuijsf:staticText id="campoIdClaseRecursoValor1Texto1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.campoIdClaseRecursoValor1Texto1}"
                                                    text="#{ClaseRecursoParametroPorClaseRecurso2.claseRecursoParDataProvider.value['codigo_clase_recurso_1x7y3']}"/>
                                                <webuijsf:button id="campoIdClaseRecursoValor1Boton1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.campoIdClaseRecursoValor1Boton1}"
                                                    onClick="#{ClaseRecursoParametroPorClaseRecurso2.asistente.scriptCampoIdClaseRecursoValor1Boton1}"/>
                                                <webuijsf:button id="campoIdClaseRecursoValor1Boton3"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.campoIdClaseRecursoValor1Boton3}"
                                                    onClick="#{ClaseRecursoParametroPorClaseRecurso2.asistente.scriptCampoIdClaseRecursoValor1Boton2}"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso2.asistente.campoIdClaseRecursoValor1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdClaseRecursoValor1"
                                                    for="campoIdClaseRecursoValor1"/>
                                                <webuijsf:helpInline id="helpInlineIdClaseRecursoValor1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.helpInlineIdClaseRecursoValor1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_clase_recurso_valor.clase_recurso_par"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdClaseRecursoValor3"
                                                rendered="#{ClaseRecursoParametroPorClaseRecurso2.asistente.campoIdClaseRecursoValor1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.labelIdClaseRecursoValor2}"
                                                    id="labelIdClaseRecursoValor2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre clase recurso valor"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdClaseRecursoValor4"
                                                rendered="#{ClaseRecursoParametroPorClaseRecurso2.asistente.campoIdClaseRecursoValor1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.campoIdClaseRecursoValor1Texto2}"
                                                    text="#{ClaseRecursoParametroPorClaseRecurso2.claseRecursoParDataProvider.value['nombre_clase_recurso_1x7y4']}"
                                                    id="campoIdClaseRecursoValor1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.campoIdClaseRecursoValor1Boton2}"
                                                    id="campoIdClaseRecursoValor1Boton2"
                                                    onClick="#{ClaseRecursoParametroPorClaseRecurso2.asistente.scriptCampoIdClaseRecursoValor1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridValorMinimo1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.labelValorMinimo1}"
                                                    id="labelValorMinimo1"
                                                    for="campoValorMinimo1"
                                                    text="valor minimo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridValorMinimo2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoValorMinimo1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.campoValorMinimo1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{ClaseRecursoParametroPorClaseRecurso2.gestor.filaNoProcesada}"
                                                    text="#{ClaseRecursoParametroPorClaseRecurso2.claseRecursoParDataProvider.value['valor_minimo']}"
                                                    toolTip="BundleParametros.valor_minimo.clase_recurso_par"
                                                    validatorExpression="#{ClaseRecursoParametroPorClaseRecurso2.validatorValorMinimo1.validate}"/>
                                                <webuijsf:staticText id="campoValorMinimo1Texto1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.campoValorMinimo1Texto1}"
                                                    text="#{ClaseRecursoParametroPorClaseRecurso2.claseRecursoParDataProvider.value['valor_minimo']}"/>
                                                <webuijsf:message id="messageValorMinimo1"
                                                    for="campoValorMinimo1"/>
                                                <webuijsf:helpInline id="helpInlineValorMinimo1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.helpInlineValorMinimo1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.valor_minimo.clase_recurso_par"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridValorMaximo1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.labelValorMaximo1}"
                                                    id="labelValorMaximo1"
                                                    for="campoValorMaximo1"
                                                    text="valor maximo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridValorMaximo2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoValorMaximo1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.campoValorMaximo1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{ClaseRecursoParametroPorClaseRecurso2.gestor.filaNoProcesada}"
                                                    text="#{ClaseRecursoParametroPorClaseRecurso2.claseRecursoParDataProvider.value['valor_maximo']}"
                                                    toolTip="BundleParametros.valor_maximo.clase_recurso_par"
                                                    validatorExpression="#{ClaseRecursoParametroPorClaseRecurso2.validatorValorMaximo1.validate}"/>
                                                <webuijsf:staticText id="campoValorMaximo1Texto1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.campoValorMaximo1Texto1}"
                                                    text="#{ClaseRecursoParametroPorClaseRecurso2.claseRecursoParDataProvider.value['valor_maximo']}"/>
                                                <webuijsf:message id="messageValorMaximo1"
                                                    for="campoValorMaximo1"/>
                                                <webuijsf:helpInline id="helpInlineValorMaximo1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.helpInlineValorMaximo1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.valor_maximo.clase_recurso_par"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridValorOmision1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.labelValorOmision1}"
                                                    id="labelValorOmision1"
                                                    for="campoValorOmision1"
                                                    text="valor omisi&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridValorOmision2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoValorOmision1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.campoValorOmision1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{ClaseRecursoParametroPorClaseRecurso2.gestor.filaNoProcesada}"
                                                    text="#{ClaseRecursoParametroPorClaseRecurso2.claseRecursoParDataProvider.value['valor_omision']}"
                                                    toolTip="BundleParametros.valor_omision.clase_recurso_par"
                                                    validatorExpression="#{ClaseRecursoParametroPorClaseRecurso2.validatorValorOmision1.validate}"/>
                                                <webuijsf:staticText id="campoValorOmision1Texto1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.campoValorOmision1Texto1}"
                                                    text="#{ClaseRecursoParametroPorClaseRecurso2.claseRecursoParDataProvider.value['valor_omision']}"/>
                                                <webuijsf:message id="messageValorOmision1"
                                                    for="campoValorOmision1"/>
                                                <webuijsf:helpInline id="helpInlineValorOmision1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.helpInlineValorOmision1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.valor_omision.clase_recurso_par"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsParametroOmisible1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.labelEsParametroOmisible1}"
                                                    id="labelEsParametroOmisible1"
                                                    for="listaEsParametroOmisible1"
                                                    text="parametro omisible"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsParametroOmisible2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsParametroOmisible1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.listaEsParametroOmisible1}"
                                                    converter="#{ClaseRecursoParametroPorClaseRecurso2.converterEsParametroOmisible1}"
                                                    disabled="#{ClaseRecursoParametroPorClaseRecurso2.gestor.filaNoProcesada}" required="true"
                                                    items="#{ClaseRecursoParametroPorClaseRecurso2.asistente.opcionesListaEsParametroOmisible1}"
                                                    selected="#{ClaseRecursoParametroPorClaseRecurso2.claseRecursoParDataProvider.value['es_parametro_omisible']}"
                                                    toolTip="BundleParametros.es_parametro_omisible.clase_recurso_par"/>
                                                <webuijsf:staticText id="listaEsParametroOmisible1Texto1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.listaEsParametroOmisible1Texto1}"/>
                                                <webuijsf:message id="messageEsParametroOmisible1"
                                                    for="listaEsParametroOmisible1"/>
                                                <webuijsf:helpInline id="helpInlineEsParametroOmisible1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.helpInlineEsParametroOmisible1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_parametro_omisible.clase_recurso_par"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsParametroInmutable1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.labelEsParametroInmutable1}"
                                                    id="labelEsParametroInmutable1"
                                                    for="listaEsParametroInmutable1"
                                                    text="parametro inmutable"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsParametroInmutable2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsParametroInmutable1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.listaEsParametroInmutable1}"
                                                    converter="#{ClaseRecursoParametroPorClaseRecurso2.converterEsParametroInmutable1}"
                                                    disabled="#{ClaseRecursoParametroPorClaseRecurso2.gestor.filaNoProcesada}" required="true"
                                                    items="#{ClaseRecursoParametroPorClaseRecurso2.asistente.opcionesListaEsParametroInmutable1}"
                                                    selected="#{ClaseRecursoParametroPorClaseRecurso2.claseRecursoParDataProvider.value['es_parametro_inmutable']}"
                                                    toolTip="BundleParametros.es_parametro_inmutable.clase_recurso_par"/>
                                                <webuijsf:staticText id="listaEsParametroInmutable1Texto1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.listaEsParametroInmutable1Texto1}"/>
                                                <webuijsf:message id="messageEsParametroInmutable1"
                                                    for="listaEsParametroInmutable1"/>
                                                <webuijsf:helpInline id="helpInlineEsParametroInmutable1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.helpInlineEsParametroInmutable1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_parametro_inmutable.clase_recurso_par"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsParametroSubmit1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.labelEsParametroSubmit1}"
                                                    id="labelEsParametroSubmit1"
                                                    for="listaEsParametroSubmit1"
                                                    text="parametro submit"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsParametroSubmit2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsParametroSubmit1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.listaEsParametroSubmit1}"
                                                    converter="#{ClaseRecursoParametroPorClaseRecurso2.converterEsParametroSubmit1}"
                                                    disabled="#{ClaseRecursoParametroPorClaseRecurso2.gestor.filaNoProcesada}" required="true"
                                                    items="#{ClaseRecursoParametroPorClaseRecurso2.asistente.opcionesListaEsParametroSubmit1}"
                                                    selected="#{ClaseRecursoParametroPorClaseRecurso2.claseRecursoParDataProvider.value['es_parametro_submit']}"
                                                    toolTip="BundleParametros.es_parametro_submit.clase_recurso_par"/>
                                                <webuijsf:staticText id="listaEsParametroSubmit1Texto1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.listaEsParametroSubmit1Texto1}"/>
                                                <webuijsf:message id="messageEsParametroSubmit1"
                                                    for="listaEsParametroSubmit1"/>
                                                <webuijsf:helpInline id="helpInlineEsParametroSubmit1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.helpInlineEsParametroSubmit1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_parametro_submit.clase_recurso_par"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsParametroPrimordial1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.labelEsParametroPrimordial1}"
                                                    id="labelEsParametroPrimordial1"
                                                    for="listaEsParametroPrimordial1"
                                                    text="parametro primordial"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsParametroPrimordial2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsParametroPrimordial1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.listaEsParametroPrimordial1}"
                                                    converter="#{ClaseRecursoParametroPorClaseRecurso2.converterEsParametroPrimordial1}"
                                                    disabled="#{ClaseRecursoParametroPorClaseRecurso2.gestor.filaNoProcesada}" required="true"
                                                    items="#{ClaseRecursoParametroPorClaseRecurso2.asistente.opcionesListaEsParametroPrimordial1}"
                                                    selected="#{ClaseRecursoParametroPorClaseRecurso2.claseRecursoParDataProvider.value['es_parametro_primordial']}"
                                                    toolTip="BundleParametros.es_parametro_primordial.clase_recurso_par"/>
                                                <webuijsf:staticText id="listaEsParametroPrimordial1Texto1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.listaEsParametroPrimordial1Texto1}"/>
                                                <webuijsf:message id="messageEsParametroPrimordial1"
                                                    for="listaEsParametroPrimordial1"/>
                                                <webuijsf:helpInline id="helpInlineEsParametroPrimordial1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.helpInlineEsParametroPrimordial1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_parametro_primordial.clase_recurso_par"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsParametroMaestro1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.labelEsParametroMaestro1}"
                                                    id="labelEsParametroMaestro1"
                                                    for="listaEsParametroMaestro1"
                                                    text="parametro maestro"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsParametroMaestro2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsParametroMaestro1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.listaEsParametroMaestro1}"
                                                    converter="#{ClaseRecursoParametroPorClaseRecurso2.converterEsParametroMaestro1}"
                                                    disabled="#{ClaseRecursoParametroPorClaseRecurso2.gestor.filaNoProcesada}" required="true"
                                                    items="#{ClaseRecursoParametroPorClaseRecurso2.asistente.opcionesListaEsParametroMaestro1}"
                                                    selected="#{ClaseRecursoParametroPorClaseRecurso2.claseRecursoParDataProvider.value['es_parametro_maestro']}"
                                                    toolTip="BundleParametros.es_parametro_maestro.clase_recurso_par"/>
                                                <webuijsf:staticText id="listaEsParametroMaestro1Texto1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.listaEsParametroMaestro1Texto1}"/>
                                                <webuijsf:message id="messageEsParametroMaestro1"
                                                    for="listaEsParametroMaestro1"/>
                                                <webuijsf:helpInline id="helpInlineEsParametroMaestro1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.helpInlineEsParametroMaestro1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_parametro_maestro.clase_recurso_par"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsParametroSegmento1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.labelEsParametroSegmento1}"
                                                    id="labelEsParametroSegmento1"
                                                    for="listaEsParametroSegmento1"
                                                    text="parametro segmento"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsParametroSegmento2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsParametroSegmento1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.listaEsParametroSegmento1}"
                                                    converter="#{ClaseRecursoParametroPorClaseRecurso2.converterEsParametroSegmento1}"
                                                    disabled="#{ClaseRecursoParametroPorClaseRecurso2.gestor.filaNoProcesada}" required="true"
                                                    items="#{ClaseRecursoParametroPorClaseRecurso2.asistente.opcionesListaEsParametroSegmento1}"
                                                    selected="#{ClaseRecursoParametroPorClaseRecurso2.claseRecursoParDataProvider.value['es_parametro_segmento']}"
                                                    toolTip="BundleParametros.es_parametro_segmento.clase_recurso_par"/>
                                                <webuijsf:staticText id="listaEsParametroSegmento1Texto1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.listaEsParametroSegmento1Texto1}"/>
                                                <webuijsf:message id="messageEsParametroSegmento1"
                                                    for="listaEsParametroSegmento1"/>
                                                <webuijsf:helpInline id="helpInlineEsParametroSegmento1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.helpInlineEsParametroSegmento1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_parametro_segmento.clase_recurso_par"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsParametroSinRastro1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.labelEsParametroSinRastro1}"
                                                    id="labelEsParametroSinRastro1"
                                                    for="listaEsParametroSinRastro1"
                                                    text="parametro sin rastro"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsParametroSinRastro2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsParametroSinRastro1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.listaEsParametroSinRastro1}"
                                                    converter="#{ClaseRecursoParametroPorClaseRecurso2.converterEsParametroSinRastro1}"
                                                    disabled="#{ClaseRecursoParametroPorClaseRecurso2.gestor.filaNoProcesada}" required="true"
                                                    items="#{ClaseRecursoParametroPorClaseRecurso2.asistente.opcionesListaEsParametroSinRastro1}"
                                                    selected="#{ClaseRecursoParametroPorClaseRecurso2.claseRecursoParDataProvider.value['es_parametro_sin_rastro']}"
                                                    toolTip="BundleParametros.es_parametro_sin_rastro.clase_recurso_par"/>
                                                <webuijsf:staticText id="listaEsParametroSinRastro1Texto1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.listaEsParametroSinRastro1Texto1}"/>
                                                <webuijsf:message id="messageEsParametroSinRastro1"
                                                    for="listaEsParametroSinRastro1"/>
                                                <webuijsf:helpInline id="helpInlineEsParametroSinRastro1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.helpInlineEsParametroSinRastro1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_parametro_sin_rastro.clase_recurso_par"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsParametroSincronizado1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.labelEsParametroSincronizado1}"
                                                    id="labelEsParametroSincronizado1"
                                                    for="listaEsParametroSincronizado1"
                                                    text="parametro sincronizado"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsParametroSincronizado2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsParametroSincronizado1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.listaEsParametroSincronizado1}"
                                                    converter="#{ClaseRecursoParametroPorClaseRecurso2.converterEsParametroSincronizado1}"
                                                    disabled="#{ClaseRecursoParametroPorClaseRecurso2.gestor.filaNoProcesada}" required="true"
                                                    items="#{ClaseRecursoParametroPorClaseRecurso2.asistente.opcionesListaEsParametroSincronizado1}"
                                                    selected="#{ClaseRecursoParametroPorClaseRecurso2.claseRecursoParDataProvider.value['es_parametro_sincronizado']}"
                                                    toolTip="BundleParametros.es_parametro_sincronizado.clase_recurso_par"/>
                                                <webuijsf:staticText id="listaEsParametroSincronizado1Texto1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.listaEsParametroSincronizado1Texto1}"/>
                                                <webuijsf:message id="messageEsParametroSincronizado1"
                                                    for="listaEsParametroSincronizado1"/>
                                                <webuijsf:helpInline id="helpInlineEsParametroSincronizado1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.helpInlineEsParametroSincronizado1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_parametro_sincronizado.clase_recurso_par"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridOrdenPresentacion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.labelOrdenPresentacion1}"
                                                    id="labelOrdenPresentacion1"
                                                    for="campoOrdenPresentacion1"
                                                    text="orden presentaci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridOrdenPresentacion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoOrdenPresentacion1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.campoOrdenPresentacion1}"
                                                    converter="#{ClaseRecursoParametroPorClaseRecurso2.converterOrdenPresentacion1}"
                                                    readOnly="#{ClaseRecursoParametroPorClaseRecurso2.gestor.filaNoProcesada}" required="true"
                                                    text="#{ClaseRecursoParametroPorClaseRecurso2.claseRecursoParDataProvider.value['orden_presentacion']}"
                                                    toolTip="BundleParametros.orden_presentacion.clase_recurso_par"
                                                    validatorExpression="#{ClaseRecursoParametroPorClaseRecurso2.validatorOrdenPresentacion1.validate}"/>
                                                <webuijsf:staticText id="campoOrdenPresentacion1Texto1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.campoOrdenPresentacion1Texto1}"
                                                    text="#{ClaseRecursoParametroPorClaseRecurso2.claseRecursoParDataProvider.value['orden_presentacion']}"/>
                                                <webuijsf:message id="messageOrdenPresentacion1"
                                                    for="campoOrdenPresentacion1"/>
                                                <webuijsf:helpInline id="helpInlineOrdenPresentacion1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.helpInlineOrdenPresentacion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.orden_presentacion.clase_recurso_par"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdClaseRecursoSec1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.labelIdClaseRecursoSec1}"
                                                    id="labelIdClaseRecursoSec1"
                                                    for="campoIdClaseRecursoSec1"
                                                    text="clase recurso sec"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdClaseRecursoSec2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdClaseRecursoSec1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.campoIdClaseRecursoSec1}"
                                                    readOnly="#{ClaseRecursoParametroPorClaseRecurso2.gestor.filaNoProcesada}"
                                                    text="#{ClaseRecursoParametroPorClaseRecurso2.asistente.textoCampoIdClaseRecursoSec1}"
                                                    toolTip="#{ClaseRecursoParametroPorClaseRecurso2.asistente.toolTipCampoIdClaseRecursoSec1}"
                                                    validatorExpression="#{ClaseRecursoParametroPorClaseRecurso2.campoIdClaseRecursoSec1_validate}"/>
                                                <webuijsf:staticText id="campoIdClaseRecursoSec1Texto1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.campoIdClaseRecursoSec1Texto1}"/>
                                                <webuijsf:button id="campoIdClaseRecursoSec1Boton1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.campoIdClaseRecursoSec1Boton1}"
                                                    onClick="#{ClaseRecursoParametroPorClaseRecurso2.asistente.scriptCampoIdClaseRecursoSec1Boton1}"/>
                                                <webuijsf:button id="campoIdClaseRecursoSec1Boton3"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.campoIdClaseRecursoSec1Boton3}"
                                                    onClick="#{ClaseRecursoParametroPorClaseRecurso2.asistente.scriptCampoIdClaseRecursoSec1Boton2}"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso2.asistente.campoIdClaseRecursoSec1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdClaseRecursoSec1"
                                                    for="campoIdClaseRecursoSec1"/>
                                                <webuijsf:helpInline id="helpInlineIdClaseRecursoSec1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.helpInlineIdClaseRecursoSec1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_clase_recurso_sec.clase_recurso_par"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdClaseRecursoSec3"
                                                rendered="#{ClaseRecursoParametroPorClaseRecurso2.asistente.campoIdClaseRecursoSec1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.labelIdClaseRecursoSec2}"
                                                    id="labelIdClaseRecursoSec2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre clase recurso sec"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdClaseRecursoSec4"
                                                rendered="#{ClaseRecursoParametroPorClaseRecurso2.asistente.campoIdClaseRecursoSec1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.campoIdClaseRecursoSec1Texto2}"
                                                    id="campoIdClaseRecursoSec1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.campoIdClaseRecursoSec1Boton2}"
                                                    id="campoIdClaseRecursoSec1Boton2"
                                                    onClick="#{ClaseRecursoParametroPorClaseRecurso2.asistente.scriptCampoIdClaseRecursoSec1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsReferenciaAlternativa1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.labelEsReferenciaAlternativa1}"
                                                    id="labelEsReferenciaAlternativa1"
                                                    for="listaEsReferenciaAlternativa1"
                                                    text="referencia alternativa"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsReferenciaAlternativa2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsReferenciaAlternativa1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.listaEsReferenciaAlternativa1}"
                                                    converter="#{ClaseRecursoParametroPorClaseRecurso2.converterEsReferenciaAlternativa1}"
                                                    disabled="#{ClaseRecursoParametroPorClaseRecurso2.gestor.filaNoProcesada}" required="true"
                                                    items="#{ClaseRecursoParametroPorClaseRecurso2.asistente.opcionesListaEsReferenciaAlternativa1}"
                                                    selected="#{ClaseRecursoParametroPorClaseRecurso2.claseRecursoParDataProvider.value['es_referencia_alternativa']}"
                                                    toolTip="BundleParametros.es_referencia_alternativa.clase_recurso_par"/>
                                                <webuijsf:staticText id="listaEsReferenciaAlternativa1Texto1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.listaEsReferenciaAlternativa1Texto1}"/>
                                                <webuijsf:message id="messageEsReferenciaAlternativa1"
                                                    for="listaEsReferenciaAlternativa1"/>
                                                <webuijsf:helpInline id="helpInlineEsReferenciaAlternativa1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.helpInlineEsReferenciaAlternativa1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_referencia_alternativa.clase_recurso_par"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroTipoValorAlternativo1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.labelNumeroTipoValorAlternativo1}"
                                                    id="labelNumeroTipoValorAlternativo1"
                                                    for="listaNumeroTipoValorAlternativo1"
                                                    text="tipo valor alternativo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTipoValorAlternativo2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroTipoValorAlternativo1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.listaNumeroTipoValorAlternativo1}"
                                                    converter="#{ClaseRecursoParametroPorClaseRecurso2.converterNumeroTipoValorAlternativo1}"
                                                    disabled="#{ClaseRecursoParametroPorClaseRecurso2.gestor.filaNoProcesada}"
                                                    items="#{ClaseRecursoParametroPorClaseRecurso2.asistente.opcionesListaNumeroTipoValorAlternativo1}"
                                                    selected="#{ClaseRecursoParametroPorClaseRecurso2.claseRecursoParDataProvider.value['numero_tipo_valor_alternativo']}"
                                                    toolTip="BundleParametros.numero_tipo_valor_alternativo.clase_recurso_par"/>
                                                <webuijsf:staticText id="listaNumeroTipoValorAlternativo1Texto1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.listaNumeroTipoValorAlternativo1Texto1}"
                                                    text="#{ClaseRecursoParametroPorClaseRecurso2.claseRecursoParDataProvider.value['codigo_tipo_valor_1x9y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoValorAlternativo1"
                                                    for="listaNumeroTipoValorAlternativo1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTipoValorAlternativo1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.helpInlineNumeroTipoValorAlternativo1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_tipo_valor_alternativo.clase_recurso_par"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdFuncionReferenciaAlt1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.labelIdFuncionReferenciaAlt1}"
                                                    id="labelIdFuncionReferenciaAlt1"
                                                    for="campoIdFuncionReferenciaAlt1"
                                                    text="identificaci&#243;n funci&#243;n referencia alt"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdFuncionReferenciaAlt2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdFuncionReferenciaAlt1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.campoIdFuncionReferenciaAlt1}"
                                                    converter="#{ClaseRecursoParametroPorClaseRecurso2.converterIdFuncionReferenciaAlt1}"
                                                    readOnly="#{ClaseRecursoParametroPorClaseRecurso2.gestor.filaNoProcesada}"
                                                    text="#{ClaseRecursoParametroPorClaseRecurso2.claseRecursoParDataProvider.value['id_funcion_referencia_alt']}"
                                                    toolTip="BundleParametros.id_funcion_referencia_alt.clase_recurso_par"
                                                    validatorExpression="#{ClaseRecursoParametroPorClaseRecurso2.validatorIdFuncionReferenciaAlt1.validate}"/>
                                                <webuijsf:staticText id="campoIdFuncionReferenciaAlt1Texto1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.campoIdFuncionReferenciaAlt1Texto1}"
                                                    text="#{ClaseRecursoParametroPorClaseRecurso2.claseRecursoParDataProvider.value['id_funcion_referencia_alt']}"/>
                                                <webuijsf:message id="messageIdFuncionReferenciaAlt1"
                                                    for="campoIdFuncionReferenciaAlt1"/>
                                                <webuijsf:helpInline id="helpInlineIdFuncionReferenciaAlt1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.helpInlineIdFuncionReferenciaAlt1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_funcion_referencia_alt.clase_recurso_par"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdListaValorAlternativa1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.labelIdListaValorAlternativa1}"
                                                    id="labelIdListaValorAlternativa1"
                                                    for="campoIdListaValorAlternativa1"
                                                    text="identificaci&#243;n lista valor alternativa"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdListaValorAlternativa2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdListaValorAlternativa1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.campoIdListaValorAlternativa1}"
                                                    converter="#{ClaseRecursoParametroPorClaseRecurso2.converterIdListaValorAlternativa1}"
                                                    readOnly="#{ClaseRecursoParametroPorClaseRecurso2.gestor.filaNoProcesada}"
                                                    text="#{ClaseRecursoParametroPorClaseRecurso2.claseRecursoParDataProvider.value['id_lista_valor_alternativa']}"
                                                    toolTip="BundleParametros.id_lista_valor_alternativa.clase_recurso_par"
                                                    validatorExpression="#{ClaseRecursoParametroPorClaseRecurso2.validatorIdListaValorAlternativa1.validate}"/>
                                                <webuijsf:staticText id="campoIdListaValorAlternativa1Texto1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.campoIdListaValorAlternativa1Texto1}"
                                                    text="#{ClaseRecursoParametroPorClaseRecurso2.claseRecursoParDataProvider.value['id_lista_valor_alternativa']}"/>
                                                <webuijsf:message id="messageIdListaValorAlternativa1"
                                                    for="campoIdListaValorAlternativa1"/>
                                                <webuijsf:helpInline id="helpInlineIdListaValorAlternativa1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.helpInlineIdListaValorAlternativa1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_lista_valor_alternativa.clase_recurso_par"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdClaseObjetoValorAlt1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.labelIdClaseObjetoValorAlt1}"
                                                    id="labelIdClaseObjetoValorAlt1"
                                                    for="campoIdClaseObjetoValorAlt1"
                                                    text="identificaci&#243;n clase objeto valor alt"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdClaseObjetoValorAlt2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdClaseObjetoValorAlt1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.campoIdClaseObjetoValorAlt1}"
                                                    converter="#{ClaseRecursoParametroPorClaseRecurso2.converterIdClaseObjetoValorAlt1}"
                                                    readOnly="#{ClaseRecursoParametroPorClaseRecurso2.gestor.filaNoProcesada}"
                                                    text="#{ClaseRecursoParametroPorClaseRecurso2.claseRecursoParDataProvider.value['id_clase_objeto_valor_alt']}"
                                                    toolTip="BundleParametros.id_clase_objeto_valor_alt.clase_recurso_par"
                                                    validatorExpression="#{ClaseRecursoParametroPorClaseRecurso2.validatorIdClaseObjetoValorAlt1.validate}"/>
                                                <webuijsf:staticText id="campoIdClaseObjetoValorAlt1Texto1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.campoIdClaseObjetoValorAlt1Texto1}"
                                                    text="#{ClaseRecursoParametroPorClaseRecurso2.claseRecursoParDataProvider.value['id_clase_objeto_valor_alt']}"/>
                                                <webuijsf:message id="messageIdClaseObjetoValorAlt1"
                                                    for="campoIdClaseObjetoValorAlt1"/>
                                                <webuijsf:helpInline id="helpInlineIdClaseObjetoValorAlt1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.helpInlineIdClaseObjetoValorAlt1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_clase_objeto_valor_alt.clase_recurso_par"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdClaseRecursoValorAlt1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.labelIdClaseRecursoValorAlt1}"
                                                    id="labelIdClaseRecursoValorAlt1"
                                                    for="campoIdClaseRecursoValorAlt1"
                                                    text="identificaci&#243;n clase recurso valor alt"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdClaseRecursoValorAlt2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdClaseRecursoValorAlt1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.campoIdClaseRecursoValorAlt1}"
                                                    converter="#{ClaseRecursoParametroPorClaseRecurso2.converterIdClaseRecursoValorAlt1}"
                                                    readOnly="#{ClaseRecursoParametroPorClaseRecurso2.gestor.filaNoProcesada}"
                                                    text="#{ClaseRecursoParametroPorClaseRecurso2.claseRecursoParDataProvider.value['id_clase_recurso_valor_alt']}"
                                                    toolTip="BundleParametros.id_clase_recurso_valor_alt.clase_recurso_par"
                                                    validatorExpression="#{ClaseRecursoParametroPorClaseRecurso2.validatorIdClaseRecursoValorAlt1.validate}"/>
                                                <webuijsf:staticText id="campoIdClaseRecursoValorAlt1Texto1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.campoIdClaseRecursoValorAlt1Texto1}"
                                                    text="#{ClaseRecursoParametroPorClaseRecurso2.claseRecursoParDataProvider.value['id_clase_recurso_valor_alt']}"/>
                                                <webuijsf:message id="messageIdClaseRecursoValorAlt1"
                                                    for="campoIdClaseRecursoValorAlt1"/>
                                                <webuijsf:helpInline id="helpInlineIdClaseRecursoValorAlt1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.helpInlineIdClaseRecursoValorAlt1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_clase_recurso_valor_alt.clase_recurso_par"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridOrdenPaginaSeleccion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.labelOrdenPaginaSeleccion1}"
                                                    id="labelOrdenPaginaSeleccion1"
                                                    for="campoOrdenPaginaSeleccion1"
                                                    text="orden p&#225;gina selecci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridOrdenPaginaSeleccion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoOrdenPaginaSeleccion1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.campoOrdenPaginaSeleccion1}"
                                                    converter="#{ClaseRecursoParametroPorClaseRecurso2.converterOrdenPaginaSeleccion1}"
                                                    readOnly="#{ClaseRecursoParametroPorClaseRecurso2.gestor.filaNoProcesada}" required="true"
                                                    text="#{ClaseRecursoParametroPorClaseRecurso2.claseRecursoParDataProvider.value['orden_pagina_seleccion']}"
                                                    toolTip="BundleParametros.orden_pagina_seleccion.clase_recurso_par"
                                                    validatorExpression="#{ClaseRecursoParametroPorClaseRecurso2.validatorOrdenPaginaSeleccion1.validate}"/>
                                                <webuijsf:staticText id="campoOrdenPaginaSeleccion1Texto1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.campoOrdenPaginaSeleccion1Texto1}"
                                                    text="#{ClaseRecursoParametroPorClaseRecurso2.claseRecursoParDataProvider.value['orden_pagina_seleccion']}"/>
                                                <webuijsf:message id="messageOrdenPaginaSeleccion1"
                                                    for="campoOrdenPaginaSeleccion1"/>
                                                <webuijsf:helpInline id="helpInlineOrdenPaginaSeleccion1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.helpInlineOrdenPaginaSeleccion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.orden_pagina_seleccion.clase_recurso_par"
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
                                                        actionExpression="#{ClaseRecursoParametroPorClaseRecurso2.botonIrAlPrimero2_action}"
                                                        binding="#{ClaseRecursoParametroPorClaseRecurso2.botonIrAlPrimero2}"
                                                        disabled="#{ClaseRecursoParametroPorClaseRecurso2.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero2"
                                                        imageURL="#{ClaseRecursoParametroPorClaseRecurso2.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{ClaseRecursoParametroPorClaseRecurso2.gestor.scriptIrAlPrimero}"
                                                        text="#{ClaseRecursoParametroPorClaseRecurso2.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{ClaseRecursoParametroPorClaseRecurso2.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{ClaseRecursoParametroPorClaseRecurso2.botonIrAlAnterior2_action}"
                                                        binding="#{ClaseRecursoParametroPorClaseRecurso2.botonIrAlAnterior2}"
                                                        disabled="#{ClaseRecursoParametroPorClaseRecurso2.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior2"
                                                        imageURL="#{ClaseRecursoParametroPorClaseRecurso2.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{ClaseRecursoParametroPorClaseRecurso2.gestor.scriptIrAlAnterior}"
                                                        text="#{ClaseRecursoParametroPorClaseRecurso2.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{ClaseRecursoParametroPorClaseRecurso2.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{ClaseRecursoParametroPorClaseRecurso2.botonIrAlSiguiente2_action}"
                                                        binding="#{ClaseRecursoParametroPorClaseRecurso2.botonIrAlSiguiente2}"
                                                        disabled="#{ClaseRecursoParametroPorClaseRecurso2.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente2"
                                                        imageURL="#{ClaseRecursoParametroPorClaseRecurso2.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{ClaseRecursoParametroPorClaseRecurso2.gestor.scriptIrAlSiguiente}"
                                                        text="#{ClaseRecursoParametroPorClaseRecurso2.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{ClaseRecursoParametroPorClaseRecurso2.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{ClaseRecursoParametroPorClaseRecurso2.botonIrAlUltimo2_action}"
                                                        binding="#{ClaseRecursoParametroPorClaseRecurso2.botonIrAlUltimo2}"
                                                        disabled="#{ClaseRecursoParametroPorClaseRecurso2.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo2"
                                                        imageURL="#{ClaseRecursoParametroPorClaseRecurso2.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{ClaseRecursoParametroPorClaseRecurso2.gestor.scriptIrAlUltimo}"
                                                        text="#{ClaseRecursoParametroPorClaseRecurso2.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{ClaseRecursoParametroPorClaseRecurso2.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{ClaseRecursoParametroPorClaseRecurso2.botonProcesarFila2_action}"
                                                        binding="#{ClaseRecursoParametroPorClaseRecurso2.botonProcesarFila2}"
                                                        disabled="#{ClaseRecursoParametroPorClaseRecurso2.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila2"
                                                        imageURL="#{ClaseRecursoParametroPorClaseRecurso2.gestor.urlImagenProcesar}"
                                                        onClick="#{ClaseRecursoParametroPorClaseRecurso2.scriptAbrirVentanaProcesarFila2}"
                                                        rendered="#{ClaseRecursoParametroPorClaseRecurso2.asistente.comandoDisponible}"
                                                        text="#{ClaseRecursoParametroPorClaseRecurso2.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{ClaseRecursoParametroPorClaseRecurso2.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{ClaseRecursoParametroPorClaseRecurso2.gestor.mensajeCambiosPorConfirmar}"/>
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
                                                    actionExpression="#{ClaseRecursoParametroPorClaseRecurso2.botonAgregar1_action}"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.botonAgregar1}"
                                                    disabled="#{ClaseRecursoParametroPorClaseRecurso2.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{ClaseRecursoParametroPorClaseRecurso2.gestor.scriptAgregar}"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso2.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ClaseRecursoParametroPorClaseRecurso2.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{ClaseRecursoParametroPorClaseRecurso2.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.listaFuncionEdicion1}"
                                                    converter="#{ClaseRecursoParametroPorClaseRecurso2.converterListaFuncionEdicion1}"
                                                    disabled="#{ClaseRecursoParametroPorClaseRecurso2.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{ClaseRecursoParametroPorClaseRecurso2.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso2.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{ClaseRecursoParametroPorClaseRecurso2.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{ClaseRecursoParametroPorClaseRecurso2.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ClaseRecursoParametroPorClaseRecurso2.botonEditar1_action}"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.botonEditar1}"
                                                    disabled="#{ClaseRecursoParametroPorClaseRecurso2.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{ClaseRecursoParametroPorClaseRecurso2.gestor.scriptEditar}"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso2.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ClaseRecursoParametroPorClaseRecurso2.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{ClaseRecursoParametroPorClaseRecurso2.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ClaseRecursoParametroPorClaseRecurso2.botonEliminar1_action}"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.botonEliminar1}"
                                                    disabled="#{ClaseRecursoParametroPorClaseRecurso2.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{ClaseRecursoParametroPorClaseRecurso2.gestor.scriptEliminar}"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso2.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ClaseRecursoParametroPorClaseRecurso2.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{ClaseRecursoParametroPorClaseRecurso2.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ClaseRecursoParametroPorClaseRecurso2.botonAplicar1_action}"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{ClaseRecursoParametroPorClaseRecurso2.gestor.scriptAplicar}"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso2.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ClaseRecursoParametroPorClaseRecurso2.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{ClaseRecursoParametroPorClaseRecurso2.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ClaseRecursoParametroPorClaseRecurso2.botonDeshacer1_action}"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{ClaseRecursoParametroPorClaseRecurso2.gestor.scriptDeshacer}"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso2.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ClaseRecursoParametroPorClaseRecurso2.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{ClaseRecursoParametroPorClaseRecurso2.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ClaseRecursoParametroPorClaseRecurso2.botonConfirmar1_action}"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{ClaseRecursoParametroPorClaseRecurso2.gestor.scriptConfirmar}"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso2.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ClaseRecursoParametroPorClaseRecurso2.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{ClaseRecursoParametroPorClaseRecurso2.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ClaseRecursoParametroPorClaseRecurso2.botonDescartar1_action}"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{ClaseRecursoParametroPorClaseRecurso2.gestor.scriptDescartar}"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso2.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ClaseRecursoParametroPorClaseRecurso2.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{ClaseRecursoParametroPorClaseRecurso2.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.listaFuncionAccion1}"
                                                    converter="#{ClaseRecursoParametroPorClaseRecurso2.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{ClaseRecursoParametroPorClaseRecurso2.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso2.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{ClaseRecursoParametroPorClaseRecurso2.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{ClaseRecursoParametroPorClaseRecurso2.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ClaseRecursoParametroPorClaseRecurso2.botonProcesar1_action}"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{ClaseRecursoParametroPorClaseRecurso2.gestor.scriptProcesar}"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso2.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ClaseRecursoParametroPorClaseRecurso2.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{ClaseRecursoParametroPorClaseRecurso2.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ClaseRecursoParametroPorClaseRecurso2.botonRefrescar1_action}"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.botonRefrescar1}"
                                                    disabled="#{ClaseRecursoParametroPorClaseRecurso2.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{ClaseRecursoParametroPorClaseRecurso2.gestor.scriptRefrescar}"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso2.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ClaseRecursoParametroPorClaseRecurso2.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{ClaseRecursoParametroPorClaseRecurso2.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ClaseRecursoParametroPorClaseRecurso2.botonReconsultar1_action}"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.botonReconsultar1}"
                                                    disabled="#{ClaseRecursoParametroPorClaseRecurso2.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{ClaseRecursoParametroPorClaseRecurso2.gestor.scriptReconsultar}"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso2.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ClaseRecursoParametroPorClaseRecurso2.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{ClaseRecursoParametroPorClaseRecurso2.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ClaseRecursoParametroPorClaseRecurso2.botonRetornar1_action}"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.botonRetornar1}"
                                                    disabled="#{ClaseRecursoParametroPorClaseRecurso2.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{ClaseRecursoParametroPorClaseRecurso2.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso2.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ClaseRecursoParametroPorClaseRecurso2.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{ClaseRecursoParametroPorClaseRecurso2.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="3" 
                                                id="gridPanel125"
                                                rendered="#{ClaseRecursoParametroPorClaseRecurso2.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{ClaseRecursoParametroPorClaseRecurso2.imageHyperlink1_action}"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.imageHyperlink1}"
                                                    disabled="#{ClaseRecursoParametroPorClaseRecurso2.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{ClaseRecursoParametroPorClaseRecurso2.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{ClaseRecursoParametroPorClaseRecurso2.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.ClaseRecursoParametroPorClaseRecurso2_imageHyperlink1_toolTip}"/>
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{ClaseRecursoParametroPorClaseRecurso2.imageHyperlink2_action}"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.imageHyperlink2}"
                                                    disabled="#{ClaseRecursoParametroPorClaseRecurso2.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink2"
                                                    imageURL="#{ClaseRecursoParametroPorClaseRecurso2.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{ClaseRecursoParametroPorClaseRecurso2.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    text="Hyperlink2"
                                                    toolTip="#{bundle.ClaseRecursoParametroPorClaseRecurso2_imageHyperlink2_toolTip}"/>
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{ClaseRecursoParametroPorClaseRecurso2.imageHyperlink3_action}"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso2.imageHyperlink3}"
                                                    disabled="#{ClaseRecursoParametroPorClaseRecurso2.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink3"
                                                    imageURL="#{ClaseRecursoParametroPorClaseRecurso2.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{ClaseRecursoParametroPorClaseRecurso2.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso2.gestor.designing}"
                                                    text="Hyperlink3"
                                                    toolTip="#{bundle.ClaseRecursoParametroPorClaseRecurso2_imageHyperlink3_toolTip}"/>
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
