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
                    focus="#{Ubicacion2.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{Ubicacion2.gestor.preserveFocus}"
                    preserveScroll="#{Ubicacion2.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{Ubicacion2.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | campoIdUbicacion1 campoCodigoUbicacion1 campoNombreUbicacion1 campoIdUbicacionSuperior1 listaNumeroTipoArea1 campoCodigoUbicacionJupe1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | | , virtualForm3 | listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{Ubicacion2.breadcrumbs1}" 
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
                                                    rendered="#{Ubicacion2.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{Ubicacion2.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{Ubicacion2.gestor.mensajeDisponible}"
                                                    text="#{Ubicacion2.gestor.mensaje}"
                                                    url="#{Ubicacion2.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            id="gridPanel104"
                                            rendered="#{Ubicacion2.gestor.filaDisponible}"
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
                                                        actionExpression="#{Ubicacion2.botonIrAlPrimero1_action}"
                                                        binding="#{Ubicacion2.botonIrAlPrimero1}"
                                                        disabled="#{Ubicacion2.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero1"
                                                        imageURL="#{Ubicacion2.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{Ubicacion2.gestor.scriptIrAlPrimero}"
                                                        text="#{Ubicacion2.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{Ubicacion2.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Ubicacion2.botonIrAlAnterior1_action}"
                                                        binding="#{Ubicacion2.botonIrAlAnterior1}"
                                                        disabled="#{Ubicacion2.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior1"
                                                        imageURL="#{Ubicacion2.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{Ubicacion2.gestor.scriptIrAlAnterior}"
                                                        text="#{Ubicacion2.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{Ubicacion2.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Ubicacion2.botonIrAlSiguiente1_action}"
                                                        binding="#{Ubicacion2.botonIrAlSiguiente1}"
                                                        disabled="#{Ubicacion2.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente1"
                                                        imageURL="#{Ubicacion2.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{Ubicacion2.gestor.scriptIrAlSiguiente}"
                                                        text="#{Ubicacion2.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{Ubicacion2.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Ubicacion2.botonIrAlUltimo1_action}"
                                                        binding="#{Ubicacion2.botonIrAlUltimo1}"
                                                        disabled="#{Ubicacion2.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo1"
                                                        imageURL="#{Ubicacion2.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{Ubicacion2.gestor.scriptIrAlUltimo}"
                                                        text="#{Ubicacion2.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{Ubicacion2.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Ubicacion2.botonProcesarFila1_action}"
                                                        binding="#{Ubicacion2.botonProcesarFila1}"
                                                        disabled="#{Ubicacion2.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila1"
                                                        imageURL="#{Ubicacion2.gestor.urlImagenProcesar}"
                                                        onClick="#{Ubicacion2.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{Ubicacion2.asistente.comandoDisponible}"
                                                        text="#{Ubicacion2.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{Ubicacion2.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{Ubicacion2.gestor.tituloConsulta}"/>
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
                                                    binding="#{Ubicacion2.etiquetaIdentificacionFila1}"
                                                    id="etiquetaIdentificacionFila1"
                                                    text="#{Ubicacion2.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{Ubicacion2.gestor.i18n.toolTipEtiquetaIdentificacionFila}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel113"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoIdentificacionFila1"
                                                    style="font-weight: bold"
                                                    text="#{Ubicacion2.gestor.identificacionFila}"/>
                                                <webuijsf:image
                                                    id="imagenFilaProcesada1"
                                                    toolTip="#{Ubicacion2.gestor.toolTipImagenFilaProcesada}"
                                                    url="#{Ubicacion2.gestor.urlImagenFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPanel114"
                                                rendered="#{Ubicacion2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Ubicacion2.etiquetaDenominacionFilaMaestro1}"
                                                    id="etiquetaDenominacionFilaMaestro1"
                                                    text="?"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel115"
                                                rendered="#{Ubicacion2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoDenominacionFilaMaestro1"
                                                    style="font-weight: bold"
                                                    text="#{Ubicacion2.gestor.denominacionFilaMaestro}"/>
                                                <webuijsf:image
                                                    id="imagenFilaMaestro1"
                                                    url="#{Ubicacion2.gestor.urlImagenMaestroFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdUbicacion1" rendered="false"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Ubicacion2.labelIdUbicacion1}"
                                                    id="labelIdUbicacion1"
                                                    for="campoIdUbicacion1"
                                                    toolTip="BundleParametros.id_ubicacion.ubicacion"
                                                    text="identificaci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdUbicacion2" rendered="false"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdUbicacion1"
                                                    binding="#{Ubicacion2.campoIdUbicacion1}"
                                                    converter="#{Ubicacion2.converterIdUbicacion1}"
                                                    readOnly="#{Ubicacion2.gestor.filaNoProcesada}"
                                                    text="#{Ubicacion2.ubicacionDataProvider.value['id_ubicacion']}"
                                                    toolTip="BundleParametros.id_ubicacion.ubicacion"
                                                    validatorExpression="#{Ubicacion2.validatorIdUbicacion1.validate}"/>
                                                <webuijsf:staticText id="campoIdUbicacion1Texto1"
                                                    binding="#{Ubicacion2.campoIdUbicacion1Texto1}"
                                                    text="#{Ubicacion2.ubicacionDataProvider.value['id_ubicacion']}"/>
                                                <webuijsf:message id="messageIdUbicacion1"
                                                    for="campoIdUbicacion1"/>
                                                <webuijsf:helpInline id="helpInlineIdUbicacion1"
                                                    binding="#{Ubicacion2.helpInlineIdUbicacion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_ubicacion.ubicacion"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridCodigoUbicacion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Ubicacion2.labelCodigoUbicacion1}"
                                                    id="labelCodigoUbicacion1"
                                                    for="campoCodigoUbicacion1"
                                                    toolTip="BundleParametros.codigo_ubicacion.ubicacion"
                                                    text="c&#243;digo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridCodigoUbicacion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoCodigoUbicacion1"
                                                    binding="#{Ubicacion2.campoCodigoUbicacion1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{Ubicacion2.gestor.filaNoProcesada}" required="true"
                                                    text="#{Ubicacion2.ubicacionDataProvider.value['codigo_ubicacion']}"
                                                    toolTip="BundleParametros.codigo_ubicacion.ubicacion"
                                                    validatorExpression="#{Ubicacion2.validatorCodigoUbicacion1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoUbicacion1Texto1"
                                                    binding="#{Ubicacion2.campoCodigoUbicacion1Texto1}"
                                                    text="#{Ubicacion2.ubicacionDataProvider.value['codigo_ubicacion']}"/>
                                                <webuijsf:message id="messageCodigoUbicacion1"
                                                    for="campoCodigoUbicacion1"/>
                                                <webuijsf:helpInline id="helpInlineCodigoUbicacion1"
                                                    binding="#{Ubicacion2.helpInlineCodigoUbicacion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.codigo_ubicacion.ubicacion"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNombreUbicacion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Ubicacion2.labelNombreUbicacion1}"
                                                    id="labelNombreUbicacion1"
                                                    for="campoNombreUbicacion1"
                                                    toolTip="BundleParametros.nombre_ubicacion.ubicacion"
                                                    text="nombre"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNombreUbicacion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNombreUbicacion1"
                                                    binding="#{Ubicacion2.campoNombreUbicacion1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{Ubicacion2.gestor.filaNoProcesada}" required="true"
                                                    text="#{Ubicacion2.ubicacionDataProvider.value['nombre_ubicacion']}"
                                                    toolTip="BundleParametros.nombre_ubicacion.ubicacion"
                                                    validatorExpression="#{Ubicacion2.validatorNombreUbicacion1.validate}"/>
                                                <webuijsf:staticText id="campoNombreUbicacion1Texto1"
                                                    binding="#{Ubicacion2.campoNombreUbicacion1Texto1}"
                                                    text="#{Ubicacion2.ubicacionDataProvider.value['nombre_ubicacion']}"/>
                                                <webuijsf:message id="messageNombreUbicacion1"
                                                    for="campoNombreUbicacion1"/>
                                                <webuijsf:helpInline id="helpInlineNombreUbicacion1"
                                                    binding="#{Ubicacion2.helpInlineNombreUbicacion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.nombre_ubicacion.ubicacion"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdUbicacionSuperior1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Ubicacion2.labelIdUbicacionSuperior1}"
                                                    id="labelIdUbicacionSuperior1"
                                                    for="campoIdUbicacionSuperior1"
                                                    toolTip="BundleParametros.id_ubicacion_superior.ubicacion"
                                                    text="ubicaci&#243;n superior"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdUbicacionSuperior2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdUbicacionSuperior1"
                                                    binding="#{Ubicacion2.campoIdUbicacionSuperior1}"
                                                    readOnly="#{Ubicacion2.gestor.filaNoProcesada}"
                                                    text="#{Ubicacion2.asistente.textoCampoIdUbicacionSuperior1}"
                                                    toolTip="#{Ubicacion2.asistente.toolTipCampoIdUbicacionSuperior1}"
                                                    validatorExpression="#{Ubicacion2.campoIdUbicacionSuperior1_validate}"/>
                                                <webuijsf:staticText id="campoIdUbicacionSuperior1Texto1"
                                                    binding="#{Ubicacion2.campoIdUbicacionSuperior1Texto1}"
                                                    text="#{Ubicacion2.ubicacionDataProvider.value['codigo_ubicacion_1x1y3']}"/>
                                                <webuijsf:button id="campoIdUbicacionSuperior1Boton1"
                                                    binding="#{Ubicacion2.campoIdUbicacionSuperior1Boton1}"
                                                    onClick="#{Ubicacion2.asistente.scriptCampoIdUbicacionSuperior1Boton1}"/>
                                                <webuijsf:button id="campoIdUbicacionSuperior1Boton3"
                                                    binding="#{Ubicacion2.campoIdUbicacionSuperior1Boton3}"
                                                    onClick="#{Ubicacion2.asistente.scriptCampoIdUbicacionSuperior1Boton2}"
                                                    rendered="#{Ubicacion2.asistente.campoIdUbicacionSuperior1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdUbicacionSuperior1"
                                                    for="campoIdUbicacionSuperior1"/>
                                                <webuijsf:helpInline id="helpInlineIdUbicacionSuperior1"
                                                    binding="#{Ubicacion2.helpInlineIdUbicacionSuperior1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_ubicacion_superior.ubicacion"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdUbicacionSuperior3"
                                                rendered="#{Ubicacion2.asistente.campoIdUbicacionSuperior1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Ubicacion2.labelIdUbicacionSuperior2}"
                                                    id="labelIdUbicacionSuperior2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre ubicaci&#243;n superior"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdUbicacionSuperior4"
                                                rendered="#{Ubicacion2.asistente.campoIdUbicacionSuperior1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{Ubicacion2.campoIdUbicacionSuperior1Texto2}"
                                                    text="#{Ubicacion2.ubicacionDataProvider.value['nombre_ubicacion_1x1y4']}"
                                                    id="campoIdUbicacionSuperior1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{Ubicacion2.campoIdUbicacionSuperior1Boton2}"
                                                    id="campoIdUbicacionSuperior1Boton2"
                                                    onClick="#{Ubicacion2.asistente.scriptCampoIdUbicacionSuperior1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroTipoArea1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Ubicacion2.labelNumeroTipoArea1}"
                                                    id="labelNumeroTipoArea1"
                                                    for="listaNumeroTipoArea1"
                                                    toolTip="BundleParametros.numero_tipo_area.ubicacion"
                                                    text="tipo area"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTipoArea2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroTipoArea1"
                                                    binding="#{Ubicacion2.listaNumeroTipoArea1}"
                                                    converter="#{Ubicacion2.converterNumeroTipoArea1}"
                                                    disabled="#{Ubicacion2.gestor.filaNoProcesada}"
                                                    items="#{Ubicacion2.asistente.opcionesListaNumeroTipoArea1}"
                                                    selected="#{Ubicacion2.ubicacionDataProvider.value['numero_tipo_area']}"
                                                    toolTip="BundleParametros.numero_tipo_area.ubicacion"/>
                                                <webuijsf:staticText id="listaNumeroTipoArea1Texto1"
                                                    binding="#{Ubicacion2.listaNumeroTipoArea1Texto1}"
                                                    text="#{Ubicacion2.ubicacionDataProvider.value['codigo_tipo_area_1x4y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoArea1"
                                                    for="listaNumeroTipoArea1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTipoArea1"
                                                    binding="#{Ubicacion2.helpInlineNumeroTipoArea1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_tipo_area.ubicacion"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridCodigoUbicacionJupe1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Ubicacion2.labelCodigoUbicacionJupe1}"
                                                    id="labelCodigoUbicacionJupe1"
                                                    for="campoCodigoUbicacionJupe1"
                                                    toolTip="BundleParametros.codigo_ubicacion_jupe.ubicacion"
                                                    text="c&#243;digo ubicaci&#243;n jupe"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridCodigoUbicacionJupe2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoCodigoUbicacionJupe1"
                                                    binding="#{Ubicacion2.campoCodigoUbicacionJupe1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{Ubicacion2.gestor.filaNoProcesada}"
                                                    text="#{Ubicacion2.ubicacionDataProvider.value['codigo_ubicacion_jupe']}"
                                                    toolTip="BundleParametros.codigo_ubicacion_jupe.ubicacion"
                                                    validatorExpression="#{Ubicacion2.validatorCodigoUbicacionJupe1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoUbicacionJupe1Texto1"
                                                    binding="#{Ubicacion2.campoCodigoUbicacionJupe1Texto1}"
                                                    text="#{Ubicacion2.ubicacionDataProvider.value['codigo_ubicacion_jupe']}"/>
                                                <webuijsf:message id="messageCodigoUbicacionJupe1"
                                                    for="campoCodigoUbicacionJupe1"/>
                                                <webuijsf:helpInline id="helpInlineCodigoUbicacionJupe1"
                                                    binding="#{Ubicacion2.helpInlineCodigoUbicacionJupe1}"
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
                                                        actionExpression="#{Ubicacion2.botonIrAlPrimero2_action}"
                                                        binding="#{Ubicacion2.botonIrAlPrimero2}"
                                                        disabled="#{Ubicacion2.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero2"
                                                        imageURL="#{Ubicacion2.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{Ubicacion2.gestor.scriptIrAlPrimero}"
                                                        text="#{Ubicacion2.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{Ubicacion2.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Ubicacion2.botonIrAlAnterior2_action}"
                                                        binding="#{Ubicacion2.botonIrAlAnterior2}"
                                                        disabled="#{Ubicacion2.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior2"
                                                        imageURL="#{Ubicacion2.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{Ubicacion2.gestor.scriptIrAlAnterior}"
                                                        text="#{Ubicacion2.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{Ubicacion2.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Ubicacion2.botonIrAlSiguiente2_action}"
                                                        binding="#{Ubicacion2.botonIrAlSiguiente2}"
                                                        disabled="#{Ubicacion2.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente2"
                                                        imageURL="#{Ubicacion2.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{Ubicacion2.gestor.scriptIrAlSiguiente}"
                                                        text="#{Ubicacion2.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{Ubicacion2.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Ubicacion2.botonIrAlUltimo2_action}"
                                                        binding="#{Ubicacion2.botonIrAlUltimo2}"
                                                        disabled="#{Ubicacion2.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo2"
                                                        imageURL="#{Ubicacion2.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{Ubicacion2.gestor.scriptIrAlUltimo}"
                                                        text="#{Ubicacion2.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{Ubicacion2.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Ubicacion2.botonProcesarFila2_action}"
                                                        binding="#{Ubicacion2.botonProcesarFila2}"
                                                        disabled="#{Ubicacion2.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila2"
                                                        imageURL="#{Ubicacion2.gestor.urlImagenProcesar}"
                                                        onClick="#{Ubicacion2.scriptAbrirVentanaProcesarFila2}"
                                                        rendered="#{Ubicacion2.asistente.comandoDisponible}"
                                                        text="#{Ubicacion2.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{Ubicacion2.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{Ubicacion2.gestor.mensajeCambiosPorConfirmar}"/>
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
                                                    actionExpression="#{Ubicacion2.botonAgregar1_action}"
                                                    binding="#{Ubicacion2.botonAgregar1}"
                                                    disabled="#{Ubicacion2.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{Ubicacion2.gestor.scriptAgregar}"
                                                    rendered="#{Ubicacion2.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Ubicacion2.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{Ubicacion2.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{Ubicacion2.listaFuncionEdicion1}"
                                                    converter="#{Ubicacion2.converterListaFuncionEdicion1}"
                                                    disabled="#{Ubicacion2.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{Ubicacion2.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{Ubicacion2.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{Ubicacion2.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{Ubicacion2.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Ubicacion2.botonEditar1_action}"
                                                    binding="#{Ubicacion2.botonEditar1}"
                                                    disabled="#{Ubicacion2.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{Ubicacion2.gestor.scriptEditar}"
                                                    rendered="#{Ubicacion2.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Ubicacion2.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{Ubicacion2.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Ubicacion2.botonEliminar1_action}"
                                                    binding="#{Ubicacion2.botonEliminar1}"
                                                    disabled="#{Ubicacion2.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{Ubicacion2.gestor.scriptEliminar}"
                                                    rendered="#{Ubicacion2.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Ubicacion2.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{Ubicacion2.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Ubicacion2.botonAplicar1_action}"
                                                    binding="#{Ubicacion2.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{Ubicacion2.gestor.scriptAplicar}"
                                                    rendered="#{Ubicacion2.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Ubicacion2.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{Ubicacion2.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Ubicacion2.botonDeshacer1_action}"
                                                    binding="#{Ubicacion2.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{Ubicacion2.gestor.scriptDeshacer}"
                                                    rendered="#{Ubicacion2.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Ubicacion2.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{Ubicacion2.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Ubicacion2.botonConfirmar1_action}"
                                                    binding="#{Ubicacion2.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{Ubicacion2.gestor.scriptConfirmar}"
                                                    rendered="#{Ubicacion2.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Ubicacion2.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{Ubicacion2.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Ubicacion2.botonDescartar1_action}"
                                                    binding="#{Ubicacion2.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{Ubicacion2.gestor.scriptDescartar}"
                                                    rendered="#{Ubicacion2.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Ubicacion2.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{Ubicacion2.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{Ubicacion2.listaFuncionAccion1}"
                                                    converter="#{Ubicacion2.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{Ubicacion2.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{Ubicacion2.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{Ubicacion2.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{Ubicacion2.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Ubicacion2.botonProcesar1_action}"
                                                    binding="#{Ubicacion2.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{Ubicacion2.gestor.scriptProcesar}"
                                                    rendered="#{Ubicacion2.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Ubicacion2.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{Ubicacion2.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Ubicacion2.botonRefrescar1_action}"
                                                    binding="#{Ubicacion2.botonRefrescar1}"
                                                    disabled="#{Ubicacion2.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{Ubicacion2.gestor.scriptRefrescar}"
                                                    rendered="#{Ubicacion2.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Ubicacion2.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{Ubicacion2.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Ubicacion2.botonReconsultar1_action}"
                                                    binding="#{Ubicacion2.botonReconsultar1}"
                                                    disabled="#{Ubicacion2.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{Ubicacion2.gestor.scriptReconsultar}"
                                                    rendered="#{Ubicacion2.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Ubicacion2.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{Ubicacion2.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Ubicacion2.botonRetornar1_action}"
                                                    binding="#{Ubicacion2.botonRetornar1}"
                                                    disabled="#{Ubicacion2.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{Ubicacion2.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{Ubicacion2.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Ubicacion2.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{Ubicacion2.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel125"
                                                rendered="#{Ubicacion2.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{Ubicacion2.imageHyperlink1_action}"
                                                    binding="#{Ubicacion2.imageHyperlink1}"
                                                    disabled="#{Ubicacion2.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{Ubicacion2.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{Ubicacion2.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{Ubicacion2.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.Ubicacion2_imageHyperlink1_toolTip}"/>
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
