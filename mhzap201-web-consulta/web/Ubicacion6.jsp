<?xml version="1.0" encoding="UTF-8"?>
<!--
   Copyright (C) 2009, EGT Consultores, C.A.
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
                    focus="#{Ubicacion6.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{Ubicacion6.gestor.preserveFocus}"
                    preserveScroll="#{Ubicacion6.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{Ubicacion6.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | campoIdUbicacion1 campoCodigoUbicacion1 campoNombreUbicacion1 campoIdUbicacionSuperior1 listaNumeroTipoNodo1 listaNumeroNivelUbicacion1 campoSecuenciaUbicacion1 campoClaveUbicacion1 listaNumeroTipoArea1 campoCodigoUbicacionJupe1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | | , virtualForm3 | listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{Ubicacion6.breadcrumbs1}" 
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
                                                    rendered="#{Ubicacion6.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{Ubicacion6.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{Ubicacion6.gestor.mensajeDisponible}"
                                                    text="#{Ubicacion6.gestor.mensaje}"
                                                    url="#{Ubicacion6.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            id="gridPanel104"
                                            rendered="#{Ubicacion6.gestor.filaDisponible}"
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
                                                        actionExpression="#{Ubicacion6.botonIrAlPrimero1_action}"
                                                        binding="#{Ubicacion6.botonIrAlPrimero1}"
                                                        disabled="#{Ubicacion6.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero1"
                                                        imageURL="#{Ubicacion6.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{Ubicacion6.gestor.scriptIrAlPrimero}"
                                                        text="#{Ubicacion6.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{Ubicacion6.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Ubicacion6.botonIrAlAnterior1_action}"
                                                        binding="#{Ubicacion6.botonIrAlAnterior1}"
                                                        disabled="#{Ubicacion6.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior1"
                                                        imageURL="#{Ubicacion6.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{Ubicacion6.gestor.scriptIrAlAnterior}"
                                                        text="#{Ubicacion6.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{Ubicacion6.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Ubicacion6.botonIrAlSiguiente1_action}"
                                                        binding="#{Ubicacion6.botonIrAlSiguiente1}"
                                                        disabled="#{Ubicacion6.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente1"
                                                        imageURL="#{Ubicacion6.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{Ubicacion6.gestor.scriptIrAlSiguiente}"
                                                        text="#{Ubicacion6.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{Ubicacion6.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Ubicacion6.botonIrAlUltimo1_action}"
                                                        binding="#{Ubicacion6.botonIrAlUltimo1}"
                                                        disabled="#{Ubicacion6.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo1"
                                                        imageURL="#{Ubicacion6.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{Ubicacion6.gestor.scriptIrAlUltimo}"
                                                        text="#{Ubicacion6.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{Ubicacion6.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Ubicacion6.botonProcesarFila1_action}"
                                                        binding="#{Ubicacion6.botonProcesarFila1}"
                                                        disabled="#{Ubicacion6.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila1"
                                                        imageURL="#{Ubicacion6.gestor.urlImagenProcesar}"
                                                        onClick="#{Ubicacion6.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{Ubicacion6.asistente.comandoDisponible}"
                                                        text="#{Ubicacion6.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{Ubicacion6.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{Ubicacion6.gestor.tituloConsulta}"/>
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
                                                    binding="#{Ubicacion6.etiquetaIdentificacionFila1}"
                                                    id="etiquetaIdentificacionFila1"
                                                    text="#{Ubicacion6.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{Ubicacion6.gestor.i18n.toolTipEtiquetaIdentificacionFila}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel113"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoIdentificacionFila1"
                                                    style="font-weight: bold"
                                                    text="#{Ubicacion6.gestor.identificacionFila}"/>
                                                <webuijsf:image
                                                    id="imagenFilaProcesada1"
                                                    toolTip="#{Ubicacion6.gestor.toolTipImagenFilaProcesada}"
                                                    url="#{Ubicacion6.gestor.urlImagenFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPanel114"
                                                rendered="#{Ubicacion6.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Ubicacion6.etiquetaDenominacionFilaMaestro1}"
                                                    id="etiquetaDenominacionFilaMaestro1"
                                                    text="?"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel115"
                                                rendered="#{Ubicacion6.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoDenominacionFilaMaestro1"
                                                    style="font-weight: bold"
                                                    text="#{Ubicacion6.gestor.denominacionFilaMaestro}"/>
                                                <webuijsf:image
                                                    id="imagenFilaMaestro1"
                                                    url="#{Ubicacion6.gestor.urlImagenMaestroFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdUbicacion1" rendered="false"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Ubicacion6.labelIdUbicacion1}"
                                                    id="labelIdUbicacion1"
                                                    for="campoIdUbicacion1"
                                                    text="identificaci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdUbicacion2" rendered="false"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdUbicacion1"
                                                    binding="#{Ubicacion6.campoIdUbicacion1}"
                                                    converter="#{Ubicacion6.converterIdUbicacion1}"
                                                    readOnly="#{Ubicacion6.gestor.filaNoProcesada}"
                                                    text="#{Ubicacion6.ubicacionDataProvider.value['id_ubicacion']}"
                                                    toolTip="BundleParametros.id_ubicacion.ubicacion"
                                                    validatorExpression="#{Ubicacion6.validatorIdUbicacion1.validate}"/>
                                                <webuijsf:staticText id="campoIdUbicacion1Texto1"
                                                    binding="#{Ubicacion6.campoIdUbicacion1Texto1}"
                                                    text="#{Ubicacion6.ubicacionDataProvider.value['id_ubicacion']}"/>
                                                <webuijsf:message id="messageIdUbicacion1"
                                                    for="campoIdUbicacion1"/>
                                                <webuijsf:helpInline id="helpInlineIdUbicacion1"
                                                    binding="#{Ubicacion6.helpInlineIdUbicacion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_ubicacion.ubicacion"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridCodigoUbicacion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Ubicacion6.labelCodigoUbicacion1}"
                                                    id="labelCodigoUbicacion1"
                                                    for="campoCodigoUbicacion1"
                                                    text="c&#243;digo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridCodigoUbicacion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoCodigoUbicacion1"
                                                    binding="#{Ubicacion6.campoCodigoUbicacion1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{Ubicacion6.gestor.filaNoProcesada}" required="true"
                                                    text="#{Ubicacion6.ubicacionDataProvider.value['codigo_ubicacion']}"
                                                    toolTip="BundleParametros.codigo_ubicacion.ubicacion"
                                                    validatorExpression="#{Ubicacion6.validatorCodigoUbicacion1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoUbicacion1Texto1"
                                                    binding="#{Ubicacion6.campoCodigoUbicacion1Texto1}"
                                                    text="#{Ubicacion6.ubicacionDataProvider.value['codigo_ubicacion']}"/>
                                                <webuijsf:message id="messageCodigoUbicacion1"
                                                    for="campoCodigoUbicacion1"/>
                                                <webuijsf:helpInline id="helpInlineCodigoUbicacion1"
                                                    binding="#{Ubicacion6.helpInlineCodigoUbicacion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.codigo_ubicacion.ubicacion"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNombreUbicacion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Ubicacion6.labelNombreUbicacion1}"
                                                    id="labelNombreUbicacion1"
                                                    for="campoNombreUbicacion1"
                                                    text="nombre"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNombreUbicacion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNombreUbicacion1"
                                                    binding="#{Ubicacion6.campoNombreUbicacion1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{Ubicacion6.gestor.filaNoProcesada}" required="true"
                                                    text="#{Ubicacion6.ubicacionDataProvider.value['nombre_ubicacion']}"
                                                    toolTip="BundleParametros.nombre_ubicacion.ubicacion"
                                                    validatorExpression="#{Ubicacion6.validatorNombreUbicacion1.validate}"/>
                                                <webuijsf:staticText id="campoNombreUbicacion1Texto1"
                                                    binding="#{Ubicacion6.campoNombreUbicacion1Texto1}"
                                                    text="#{Ubicacion6.ubicacionDataProvider.value['nombre_ubicacion']}"/>
                                                <webuijsf:message id="messageNombreUbicacion1"
                                                    for="campoNombreUbicacion1"/>
                                                <webuijsf:helpInline id="helpInlineNombreUbicacion1"
                                                    binding="#{Ubicacion6.helpInlineNombreUbicacion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.nombre_ubicacion.ubicacion"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdUbicacionSuperior1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Ubicacion6.labelIdUbicacionSuperior1}"
                                                    id="labelIdUbicacionSuperior1"
                                                    for="campoIdUbicacionSuperior1"
                                                    text="ubicaci&#243;n superior"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdUbicacionSuperior2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdUbicacionSuperior1"
                                                    binding="#{Ubicacion6.campoIdUbicacionSuperior1}"
                                                    readOnly="#{Ubicacion6.gestor.filaNoProcesada}"
                                                    text="#{Ubicacion6.asistente.textoCampoIdUbicacionSuperior1}"
                                                    toolTip="#{Ubicacion6.asistente.toolTipCampoIdUbicacionSuperior1}"
                                                    validatorExpression="#{Ubicacion6.campoIdUbicacionSuperior1_validate}"/>
                                                <webuijsf:staticText id="campoIdUbicacionSuperior1Texto1"
                                                    binding="#{Ubicacion6.campoIdUbicacionSuperior1Texto1}"
                                                    text="#{Ubicacion6.ubicacionDataProvider.value['codigo_ubicacion_1x1y3']}"/>
                                                <webuijsf:button id="campoIdUbicacionSuperior1Boton1"
                                                    binding="#{Ubicacion6.campoIdUbicacionSuperior1Boton1}"
                                                    onClick="#{Ubicacion6.asistente.scriptCampoIdUbicacionSuperior1Boton1}"/>
                                                <webuijsf:button id="campoIdUbicacionSuperior1Boton3"
                                                    binding="#{Ubicacion6.campoIdUbicacionSuperior1Boton3}"
                                                    onClick="#{Ubicacion6.asistente.scriptCampoIdUbicacionSuperior1Boton2}"
                                                    rendered="#{Ubicacion6.asistente.campoIdUbicacionSuperior1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdUbicacionSuperior1"
                                                    for="campoIdUbicacionSuperior1"/>
                                                <webuijsf:helpInline id="helpInlineIdUbicacionSuperior1"
                                                    binding="#{Ubicacion6.helpInlineIdUbicacionSuperior1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_ubicacion_superior.ubicacion"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdUbicacionSuperior3"
                                                rendered="#{Ubicacion6.asistente.campoIdUbicacionSuperior1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Ubicacion6.labelIdUbicacionSuperior2}"
                                                    id="labelIdUbicacionSuperior2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre ubicaci&#243;n superior"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdUbicacionSuperior4"
                                                rendered="#{Ubicacion6.asistente.campoIdUbicacionSuperior1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{Ubicacion6.campoIdUbicacionSuperior1Texto2}"
                                                    text="#{Ubicacion6.ubicacionDataProvider.value['nombre_ubicacion_1x1y4']}"
                                                    id="campoIdUbicacionSuperior1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{Ubicacion6.campoIdUbicacionSuperior1Boton2}"
                                                    id="campoIdUbicacionSuperior1Boton2"
                                                    onClick="#{Ubicacion6.asistente.scriptCampoIdUbicacionSuperior1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroTipoNodo1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Ubicacion6.labelNumeroTipoNodo1}"
                                                    id="labelNumeroTipoNodo1"
                                                    for="listaNumeroTipoNodo1"
                                                    text="tipo nodo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTipoNodo2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroTipoNodo1"
                                                    binding="#{Ubicacion6.listaNumeroTipoNodo1}"
                                                    converter="#{Ubicacion6.converterNumeroTipoNodo1}"
                                                    disabled="#{Ubicacion6.gestor.filaNoProcesada}"
                                                    items="#{Ubicacion6.asistente.opcionesListaNumeroTipoNodo1}"
                                                    selected="#{Ubicacion6.ubicacionDataProvider.value['numero_tipo_nodo']}"
                                                    toolTip="BundleParametros.numero_tipo_nodo.ubicacion"/>
                                                <webuijsf:staticText id="listaNumeroTipoNodo1Texto1"
                                                    binding="#{Ubicacion6.listaNumeroTipoNodo1Texto1}"
                                                    text="#{Ubicacion6.ubicacionDataProvider.value['codigo_tipo_nodo_1x2y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoNodo1"
                                                    for="listaNumeroTipoNodo1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTipoNodo1"
                                                    binding="#{Ubicacion6.helpInlineNumeroTipoNodo1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_tipo_nodo.ubicacion"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroNivelUbicacion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Ubicacion6.labelNumeroNivelUbicacion1}"
                                                    id="labelNumeroNivelUbicacion1"
                                                    for="listaNumeroNivelUbicacion1"
                                                    text="nivel"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroNivelUbicacion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroNivelUbicacion1"
                                                    binding="#{Ubicacion6.listaNumeroNivelUbicacion1}"
                                                    converter="#{Ubicacion6.converterNumeroNivelUbicacion1}"
                                                    disabled="#{Ubicacion6.gestor.filaNoProcesada}"
                                                    items="#{Ubicacion6.asistente.opcionesListaNumeroNivelUbicacion1}"
                                                    selected="#{Ubicacion6.ubicacionDataProvider.value['numero_nivel_ubicacion']}"
                                                    toolTip="BundleParametros.numero_nivel_ubicacion.ubicacion"/>
                                                <webuijsf:staticText id="listaNumeroNivelUbicacion1Texto1"
                                                    binding="#{Ubicacion6.listaNumeroNivelUbicacion1Texto1}"
                                                    text="#{Ubicacion6.ubicacionDataProvider.value['codigo_nivel_ubicacion_1x3y2']}"/>
                                                <webuijsf:message id="messageNumeroNivelUbicacion1"
                                                    for="listaNumeroNivelUbicacion1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroNivelUbicacion1"
                                                    binding="#{Ubicacion6.helpInlineNumeroNivelUbicacion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_nivel_ubicacion.ubicacion"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridSecuenciaUbicacion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Ubicacion6.labelSecuenciaUbicacion1}"
                                                    id="labelSecuenciaUbicacion1"
                                                    for="campoSecuenciaUbicacion1"
                                                    text="secuencia"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridSecuenciaUbicacion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoSecuenciaUbicacion1"
                                                    binding="#{Ubicacion6.campoSecuenciaUbicacion1}"
                                                    converter="#{Ubicacion6.converterSecuenciaUbicacion1}"
                                                    readOnly="#{Ubicacion6.gestor.filaNoProcesada}"
                                                    text="#{Ubicacion6.ubicacionDataProvider.value['secuencia_ubicacion']}"
                                                    toolTip="BundleParametros.secuencia_ubicacion.ubicacion"
                                                    validatorExpression="#{Ubicacion6.validatorSecuenciaUbicacion1.validate}"/>
                                                <webuijsf:staticText id="campoSecuenciaUbicacion1Texto1"
                                                    binding="#{Ubicacion6.campoSecuenciaUbicacion1Texto1}"
                                                    text="#{Ubicacion6.ubicacionDataProvider.value['secuencia_ubicacion']}"/>
                                                <webuijsf:message id="messageSecuenciaUbicacion1"
                                                    for="campoSecuenciaUbicacion1"/>
                                                <webuijsf:helpInline id="helpInlineSecuenciaUbicacion1"
                                                    binding="#{Ubicacion6.helpInlineSecuenciaUbicacion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.secuencia_ubicacion.ubicacion"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridClaveUbicacion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Ubicacion6.labelClaveUbicacion1}"
                                                    id="labelClaveUbicacion1"
                                                    for="campoClaveUbicacion1"
                                                    text="clave"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridClaveUbicacion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoClaveUbicacion1"
                                                    binding="#{Ubicacion6.campoClaveUbicacion1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{Ubicacion6.gestor.filaNoProcesada}"
                                                    text="#{Ubicacion6.ubicacionDataProvider.value['clave_ubicacion']}"
                                                    toolTip="BundleParametros.clave_ubicacion.ubicacion"
                                                    validatorExpression="#{Ubicacion6.validatorClaveUbicacion1.validate}"/>
                                                <webuijsf:staticText id="campoClaveUbicacion1Texto1"
                                                    binding="#{Ubicacion6.campoClaveUbicacion1Texto1}"
                                                    text="#{Ubicacion6.ubicacionDataProvider.value['clave_ubicacion']}"/>
                                                <webuijsf:message id="messageClaveUbicacion1"
                                                    for="campoClaveUbicacion1"/>
                                                <webuijsf:helpInline id="helpInlineClaveUbicacion1"
                                                    binding="#{Ubicacion6.helpInlineClaveUbicacion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.clave_ubicacion.ubicacion"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroTipoArea1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Ubicacion6.labelNumeroTipoArea1}"
                                                    id="labelNumeroTipoArea1"
                                                    for="listaNumeroTipoArea1"
                                                    text="tipo area"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTipoArea2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroTipoArea1"
                                                    binding="#{Ubicacion6.listaNumeroTipoArea1}"
                                                    converter="#{Ubicacion6.converterNumeroTipoArea1}"
                                                    disabled="#{Ubicacion6.gestor.filaNoProcesada}"
                                                    items="#{Ubicacion6.asistente.opcionesListaNumeroTipoArea1}"
                                                    selected="#{Ubicacion6.ubicacionDataProvider.value['numero_tipo_area']}"
                                                    toolTip="BundleParametros.numero_tipo_area.ubicacion"/>
                                                <webuijsf:staticText id="listaNumeroTipoArea1Texto1"
                                                    binding="#{Ubicacion6.listaNumeroTipoArea1Texto1}"
                                                    text="#{Ubicacion6.ubicacionDataProvider.value['codigo_tipo_area_1x4y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoArea1"
                                                    for="listaNumeroTipoArea1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTipoArea1"
                                                    binding="#{Ubicacion6.helpInlineNumeroTipoArea1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_tipo_area.ubicacion"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridCodigoUbicacionJupe1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Ubicacion6.labelCodigoUbicacionJupe1}"
                                                    id="labelCodigoUbicacionJupe1"
                                                    for="campoCodigoUbicacionJupe1"
                                                    text="c&#243;digo ubicaci&#243;n jupe"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridCodigoUbicacionJupe2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoCodigoUbicacionJupe1"
                                                    binding="#{Ubicacion6.campoCodigoUbicacionJupe1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{Ubicacion6.gestor.filaNoProcesada}"
                                                    text="#{Ubicacion6.ubicacionDataProvider.value['codigo_ubicacion_jupe']}"
                                                    toolTip="BundleParametros.codigo_ubicacion_jupe.ubicacion"
                                                    validatorExpression="#{Ubicacion6.validatorCodigoUbicacionJupe1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoUbicacionJupe1Texto1"
                                                    binding="#{Ubicacion6.campoCodigoUbicacionJupe1Texto1}"
                                                    text="#{Ubicacion6.ubicacionDataProvider.value['codigo_ubicacion_jupe']}"/>
                                                <webuijsf:message id="messageCodigoUbicacionJupe1"
                                                    for="campoCodigoUbicacionJupe1"/>
                                                <webuijsf:helpInline id="helpInlineCodigoUbicacionJupe1"
                                                    binding="#{Ubicacion6.helpInlineCodigoUbicacionJupe1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.codigo_ubicacion_jupe.ubicacion"
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
                                                        actionExpression="#{Ubicacion6.botonIrAlPrimero2_action}"
                                                        binding="#{Ubicacion6.botonIrAlPrimero2}"
                                                        disabled="#{Ubicacion6.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero2"
                                                        imageURL="#{Ubicacion6.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{Ubicacion6.gestor.scriptIrAlPrimero}"
                                                        text="#{Ubicacion6.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{Ubicacion6.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Ubicacion6.botonIrAlAnterior2_action}"
                                                        binding="#{Ubicacion6.botonIrAlAnterior2}"
                                                        disabled="#{Ubicacion6.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior2"
                                                        imageURL="#{Ubicacion6.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{Ubicacion6.gestor.scriptIrAlAnterior}"
                                                        text="#{Ubicacion6.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{Ubicacion6.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Ubicacion6.botonIrAlSiguiente2_action}"
                                                        binding="#{Ubicacion6.botonIrAlSiguiente2}"
                                                        disabled="#{Ubicacion6.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente2"
                                                        imageURL="#{Ubicacion6.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{Ubicacion6.gestor.scriptIrAlSiguiente}"
                                                        text="#{Ubicacion6.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{Ubicacion6.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Ubicacion6.botonIrAlUltimo2_action}"
                                                        binding="#{Ubicacion6.botonIrAlUltimo2}"
                                                        disabled="#{Ubicacion6.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo2"
                                                        imageURL="#{Ubicacion6.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{Ubicacion6.gestor.scriptIrAlUltimo}"
                                                        text="#{Ubicacion6.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{Ubicacion6.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Ubicacion6.botonProcesarFila2_action}"
                                                        binding="#{Ubicacion6.botonProcesarFila2}"
                                                        disabled="#{Ubicacion6.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila2"
                                                        imageURL="#{Ubicacion6.gestor.urlImagenProcesar}"
                                                        onClick="#{Ubicacion6.scriptAbrirVentanaProcesarFila2}"
                                                        rendered="#{Ubicacion6.asistente.comandoDisponible}"
                                                        text="#{Ubicacion6.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{Ubicacion6.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{Ubicacion6.gestor.mensajeCambiosPorConfirmar}"/>
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
                                                    actionExpression="#{Ubicacion6.botonAgregar1_action}"
                                                    binding="#{Ubicacion6.botonAgregar1}"
                                                    disabled="#{Ubicacion6.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{Ubicacion6.gestor.scriptAgregar}"
                                                    rendered="#{Ubicacion6.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Ubicacion6.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{Ubicacion6.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{Ubicacion6.listaFuncionEdicion1}"
                                                    converter="#{Ubicacion6.converterListaFuncionEdicion1}"
                                                    disabled="#{Ubicacion6.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{Ubicacion6.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{Ubicacion6.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{Ubicacion6.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{Ubicacion6.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Ubicacion6.botonEditar1_action}"
                                                    binding="#{Ubicacion6.botonEditar1}"
                                                    disabled="#{Ubicacion6.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{Ubicacion6.gestor.scriptEditar}"
                                                    rendered="#{Ubicacion6.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Ubicacion6.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{Ubicacion6.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Ubicacion6.botonEliminar1_action}"
                                                    binding="#{Ubicacion6.botonEliminar1}"
                                                    disabled="#{Ubicacion6.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{Ubicacion6.gestor.scriptEliminar}"
                                                    rendered="#{Ubicacion6.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Ubicacion6.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{Ubicacion6.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Ubicacion6.botonAplicar1_action}"
                                                    binding="#{Ubicacion6.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{Ubicacion6.gestor.scriptAplicar}"
                                                    rendered="#{Ubicacion6.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Ubicacion6.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{Ubicacion6.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Ubicacion6.botonDeshacer1_action}"
                                                    binding="#{Ubicacion6.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{Ubicacion6.gestor.scriptDeshacer}"
                                                    rendered="#{Ubicacion6.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Ubicacion6.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{Ubicacion6.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Ubicacion6.botonConfirmar1_action}"
                                                    binding="#{Ubicacion6.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{Ubicacion6.gestor.scriptConfirmar}"
                                                    rendered="#{Ubicacion6.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Ubicacion6.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{Ubicacion6.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Ubicacion6.botonDescartar1_action}"
                                                    binding="#{Ubicacion6.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{Ubicacion6.gestor.scriptDescartar}"
                                                    rendered="#{Ubicacion6.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Ubicacion6.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{Ubicacion6.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{Ubicacion6.listaFuncionAccion1}"
                                                    converter="#{Ubicacion6.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{Ubicacion6.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{Ubicacion6.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{Ubicacion6.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{Ubicacion6.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Ubicacion6.botonProcesar1_action}"
                                                    binding="#{Ubicacion6.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{Ubicacion6.gestor.scriptProcesar}"
                                                    rendered="#{Ubicacion6.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Ubicacion6.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{Ubicacion6.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Ubicacion6.botonRefrescar1_action}"
                                                    binding="#{Ubicacion6.botonRefrescar1}"
                                                    disabled="#{Ubicacion6.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{Ubicacion6.gestor.scriptRefrescar}"
                                                    rendered="#{Ubicacion6.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Ubicacion6.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{Ubicacion6.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Ubicacion6.botonReconsultar1_action}"
                                                    binding="#{Ubicacion6.botonReconsultar1}"
                                                    disabled="#{Ubicacion6.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{Ubicacion6.gestor.scriptReconsultar}"
                                                    rendered="#{Ubicacion6.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Ubicacion6.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{Ubicacion6.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Ubicacion6.botonRetornar1_action}"
                                                    binding="#{Ubicacion6.botonRetornar1}"
                                                    disabled="#{Ubicacion6.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{Ubicacion6.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{Ubicacion6.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Ubicacion6.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{Ubicacion6.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel125"
                                                rendered="#{Ubicacion6.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{Ubicacion6.imageHyperlink1_action}"
                                                    binding="#{Ubicacion6.imageHyperlink1}"
                                                    disabled="#{Ubicacion6.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{Ubicacion6.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{Ubicacion6.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{Ubicacion6.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.Ubicacion6_imageHyperlink1_toolTip}"/>
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
