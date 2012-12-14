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
                    focus="#{OpcionMenu2.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{OpcionMenu2.gestor.preserveFocus}"
                    preserveScroll="#{OpcionMenu2.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{OpcionMenu2.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | campoIdOpcionMenu1 campoCodigoOpcionMenu1 campoNombreOpcionMenu1 campoDescripcionOpcionMenu1 campoUrlOpcionMenu1 campoIdAplicacion1 campoIdPagina1 campoIdOpcionMenuSuperior1 listaEsOpcionMenuInactiva1 listaEsOpcionMenuSincronizada1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | | , virtualForm3 | listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{OpcionMenu2.breadcrumbs1}" 
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
                                                    rendered="#{OpcionMenu2.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{OpcionMenu2.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{OpcionMenu2.gestor.mensajeDisponible}"
                                                    text="#{OpcionMenu2.gestor.mensaje}"
                                                    url="#{OpcionMenu2.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            id="gridPanel104"
                                            rendered="#{OpcionMenu2.gestor.filaDisponible}"
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
                                                        actionExpression="#{OpcionMenu2.botonIrAlPrimero1_action}"
                                                        binding="#{OpcionMenu2.botonIrAlPrimero1}"
                                                        disabled="#{OpcionMenu2.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero1"
                                                        imageURL="#{OpcionMenu2.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{OpcionMenu2.gestor.scriptIrAlPrimero}"
                                                        text="#{OpcionMenu2.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{OpcionMenu2.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{OpcionMenu2.botonIrAlAnterior1_action}"
                                                        binding="#{OpcionMenu2.botonIrAlAnterior1}"
                                                        disabled="#{OpcionMenu2.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior1"
                                                        imageURL="#{OpcionMenu2.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{OpcionMenu2.gestor.scriptIrAlAnterior}"
                                                        text="#{OpcionMenu2.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{OpcionMenu2.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{OpcionMenu2.botonIrAlSiguiente1_action}"
                                                        binding="#{OpcionMenu2.botonIrAlSiguiente1}"
                                                        disabled="#{OpcionMenu2.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente1"
                                                        imageURL="#{OpcionMenu2.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{OpcionMenu2.gestor.scriptIrAlSiguiente}"
                                                        text="#{OpcionMenu2.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{OpcionMenu2.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{OpcionMenu2.botonIrAlUltimo1_action}"
                                                        binding="#{OpcionMenu2.botonIrAlUltimo1}"
                                                        disabled="#{OpcionMenu2.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo1"
                                                        imageURL="#{OpcionMenu2.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{OpcionMenu2.gestor.scriptIrAlUltimo}"
                                                        text="#{OpcionMenu2.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{OpcionMenu2.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{OpcionMenu2.botonProcesarFila1_action}"
                                                        binding="#{OpcionMenu2.botonProcesarFila1}"
                                                        disabled="#{OpcionMenu2.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila1"
                                                        imageURL="#{OpcionMenu2.gestor.urlImagenProcesar}"
                                                        onClick="#{OpcionMenu2.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{OpcionMenu2.asistente.comandoDisponible}"
                                                        text="#{OpcionMenu2.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{OpcionMenu2.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{OpcionMenu2.gestor.tituloConsulta}"/>
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
                                                    binding="#{OpcionMenu2.etiquetaIdentificacionFila1}"
                                                    id="etiquetaIdentificacionFila1"
                                                    text="#{OpcionMenu2.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{OpcionMenu2.gestor.i18n.toolTipEtiquetaIdentificacionFila}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel113"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoIdentificacionFila1"
                                                    style="font-weight: bold"
                                                    text="#{OpcionMenu2.gestor.identificacionFila}"/>
                                                <webuijsf:image
                                                    id="imagenFilaProcesada1"
                                                    toolTip="#{OpcionMenu2.gestor.toolTipImagenFilaProcesada}"
                                                    url="#{OpcionMenu2.gestor.urlImagenFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPanel114"
                                                rendered="#{OpcionMenu2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{OpcionMenu2.etiquetaDenominacionFilaMaestro1}"
                                                    id="etiquetaDenominacionFilaMaestro1"
                                                    text="?"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel115"
                                                rendered="#{OpcionMenu2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoDenominacionFilaMaestro1"
                                                    style="font-weight: bold"
                                                    text="#{OpcionMenu2.gestor.denominacionFilaMaestro}"/>
                                                <webuijsf:image
                                                    id="imagenFilaMaestro1"
                                                    url="#{OpcionMenu2.gestor.urlImagenMaestroFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdOpcionMenu1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{OpcionMenu2.labelIdOpcionMenu1}"
                                                    id="labelIdOpcionMenu1"
                                                    for="campoIdOpcionMenu1"
                                                    text="identificaci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdOpcionMenu2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdOpcionMenu1"
                                                    binding="#{OpcionMenu2.campoIdOpcionMenu1}"
                                                    converter="#{OpcionMenu2.converterIdOpcionMenu1}"
                                                    readOnly="#{OpcionMenu2.gestor.filaNoProcesada}" required="true"
                                                    text="#{OpcionMenu2.opcionMenuDataProvider.value['id_opcion_menu']}"
                                                    toolTip="BundleParametros.id_opcion_menu.opcion_menu"
                                                    validatorExpression="#{OpcionMenu2.validatorIdOpcionMenu1.validate}"/>
                                                <webuijsf:staticText id="campoIdOpcionMenu1Texto1"
                                                    binding="#{OpcionMenu2.campoIdOpcionMenu1Texto1}"
                                                    text="#{OpcionMenu2.opcionMenuDataProvider.value['id_opcion_menu']}"/>
                                                <webuijsf:message id="messageIdOpcionMenu1"
                                                    for="campoIdOpcionMenu1"/>
                                                <webuijsf:helpInline id="helpInlineIdOpcionMenu1"
                                                    binding="#{OpcionMenu2.helpInlineIdOpcionMenu1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_opcion_menu.opcion_menu"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridCodigoOpcionMenu1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{OpcionMenu2.labelCodigoOpcionMenu1}"
                                                    id="labelCodigoOpcionMenu1"
                                                    for="campoCodigoOpcionMenu1"
                                                    text="c&#243;digo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridCodigoOpcionMenu2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoCodigoOpcionMenu1"
                                                    binding="#{OpcionMenu2.campoCodigoOpcionMenu1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{OpcionMenu2.gestor.filaNoProcesada}" required="true"
                                                    text="#{OpcionMenu2.opcionMenuDataProvider.value['codigo_opcion_menu']}"
                                                    toolTip="BundleParametros.codigo_opcion_menu.opcion_menu"
                                                    validatorExpression="#{OpcionMenu2.validatorCodigoOpcionMenu1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoOpcionMenu1Texto1"
                                                    binding="#{OpcionMenu2.campoCodigoOpcionMenu1Texto1}"
                                                    text="#{OpcionMenu2.opcionMenuDataProvider.value['codigo_opcion_menu']}"/>
                                                <webuijsf:message id="messageCodigoOpcionMenu1"
                                                    for="campoCodigoOpcionMenu1"/>
                                                <webuijsf:helpInline id="helpInlineCodigoOpcionMenu1"
                                                    binding="#{OpcionMenu2.helpInlineCodigoOpcionMenu1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.codigo_opcion_menu.opcion_menu"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNombreOpcionMenu1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{OpcionMenu2.labelNombreOpcionMenu1}"
                                                    id="labelNombreOpcionMenu1"
                                                    for="campoNombreOpcionMenu1"
                                                    text="nombre"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNombreOpcionMenu2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNombreOpcionMenu1"
                                                    binding="#{OpcionMenu2.campoNombreOpcionMenu1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{OpcionMenu2.gestor.filaNoProcesada}"
                                                    text="#{OpcionMenu2.opcionMenuDataProvider.value['nombre_opcion_menu']}"
                                                    toolTip="BundleParametros.nombre_opcion_menu.opcion_menu"
                                                    validatorExpression="#{OpcionMenu2.validatorNombreOpcionMenu1.validate}"/>
                                                <webuijsf:staticText id="campoNombreOpcionMenu1Texto1"
                                                    binding="#{OpcionMenu2.campoNombreOpcionMenu1Texto1}"
                                                    text="#{OpcionMenu2.opcionMenuDataProvider.value['nombre_opcion_menu']}"/>
                                                <webuijsf:message id="messageNombreOpcionMenu1"
                                                    for="campoNombreOpcionMenu1"/>
                                                <webuijsf:helpInline id="helpInlineNombreOpcionMenu1"
                                                    binding="#{OpcionMenu2.helpInlineNombreOpcionMenu1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.nombre_opcion_menu.opcion_menu"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridDescripcionOpcionMenu1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{OpcionMenu2.labelDescripcionOpcionMenu1}"
                                                    id="labelDescripcionOpcionMenu1"
                                                    for="campoDescripcionOpcionMenu1"
                                                    text="descripci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridDescripcionOpcionMenu2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoDescripcionOpcionMenu1"
                                                    binding="#{OpcionMenu2.campoDescripcionOpcionMenu1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{OpcionMenu2.gestor.filaNoProcesada}"
                                                    text="#{OpcionMenu2.opcionMenuDataProvider.value['descripcion_opcion_menu']}"
                                                    toolTip="BundleParametros.descripcion_opcion_menu.opcion_menu"
                                                    validatorExpression="#{OpcionMenu2.validatorDescripcionOpcionMenu1.validate}"/>
                                                <webuijsf:staticText id="campoDescripcionOpcionMenu1Texto1"
                                                    binding="#{OpcionMenu2.campoDescripcionOpcionMenu1Texto1}"
                                                    text="#{OpcionMenu2.opcionMenuDataProvider.value['descripcion_opcion_menu']}"/>
                                                <webuijsf:message id="messageDescripcionOpcionMenu1"
                                                    for="campoDescripcionOpcionMenu1"/>
                                                <webuijsf:helpInline id="helpInlineDescripcionOpcionMenu1"
                                                    binding="#{OpcionMenu2.helpInlineDescripcionOpcionMenu1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.descripcion_opcion_menu.opcion_menu"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridUrlOpcionMenu1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{OpcionMenu2.labelUrlOpcionMenu1}"
                                                    id="labelUrlOpcionMenu1"
                                                    for="campoUrlOpcionMenu1"
                                                    text="url"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridUrlOpcionMenu2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoUrlOpcionMenu1"
                                                    binding="#{OpcionMenu2.campoUrlOpcionMenu1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{OpcionMenu2.gestor.filaNoProcesada}"
                                                    text="#{OpcionMenu2.opcionMenuDataProvider.value['url_opcion_menu']}"
                                                    toolTip="BundleParametros.url_opcion_menu.opcion_menu"
                                                    validatorExpression="#{OpcionMenu2.validatorUrlOpcionMenu1.validate}"/>
                                                <webuijsf:staticText id="campoUrlOpcionMenu1Texto1"
                                                    binding="#{OpcionMenu2.campoUrlOpcionMenu1Texto1}"
                                                    text="#{OpcionMenu2.opcionMenuDataProvider.value['url_opcion_menu']}"/>
                                                <webuijsf:message id="messageUrlOpcionMenu1"
                                                    for="campoUrlOpcionMenu1"/>
                                                <webuijsf:helpInline id="helpInlineUrlOpcionMenu1"
                                                    binding="#{OpcionMenu2.helpInlineUrlOpcionMenu1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.url_opcion_menu.opcion_menu"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdAplicacion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{OpcionMenu2.labelIdAplicacion1}"
                                                    id="labelIdAplicacion1"
                                                    for="campoIdAplicacion1"
                                                    text="aplicaci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdAplicacion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdAplicacion1"
                                                    binding="#{OpcionMenu2.campoIdAplicacion1}"
                                                    readOnly="#{OpcionMenu2.gestor.filaNoProcesada}"
                                                    text="#{OpcionMenu2.asistente.textoCampoIdAplicacion1}"
                                                    toolTip="#{OpcionMenu2.asistente.toolTipCampoIdAplicacion1}"
                                                    validatorExpression="#{OpcionMenu2.campoIdAplicacion1_validate}"/>
                                                <webuijsf:staticText id="campoIdAplicacion1Texto1"
                                                    binding="#{OpcionMenu2.campoIdAplicacion1Texto1}"
                                                    text="#{OpcionMenu2.opcionMenuDataProvider.value['codigo_aplicacion_1x1y3']}"/>
                                                <webuijsf:button id="campoIdAplicacion1Boton1"
                                                    binding="#{OpcionMenu2.campoIdAplicacion1Boton1}"
                                                    onClick="#{OpcionMenu2.asistente.scriptCampoIdAplicacion1Boton1}"/>
                                                <webuijsf:button id="campoIdAplicacion1Boton3"
                                                    binding="#{OpcionMenu2.campoIdAplicacion1Boton3}"
                                                    onClick="#{OpcionMenu2.asistente.scriptCampoIdAplicacion1Boton2}"
                                                    rendered="#{OpcionMenu2.asistente.campoIdAplicacion1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdAplicacion1"
                                                    for="campoIdAplicacion1"/>
                                                <webuijsf:helpInline id="helpInlineIdAplicacion1"
                                                    binding="#{OpcionMenu2.helpInlineIdAplicacion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_aplicacion.opcion_menu"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdAplicacion3"
                                                rendered="#{OpcionMenu2.asistente.campoIdAplicacion1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{OpcionMenu2.labelIdAplicacion2}"
                                                    id="labelIdAplicacion2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre aplicaci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdAplicacion4"
                                                rendered="#{OpcionMenu2.asistente.campoIdAplicacion1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{OpcionMenu2.campoIdAplicacion1Texto2}"
                                                    text="#{OpcionMenu2.opcionMenuDataProvider.value['nombre_aplicacion_1x1y4']}"
                                                    id="campoIdAplicacion1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{OpcionMenu2.campoIdAplicacion1Boton2}"
                                                    id="campoIdAplicacion1Boton2"
                                                    onClick="#{OpcionMenu2.asistente.scriptCampoIdAplicacion1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdPagina1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{OpcionMenu2.labelIdPagina1}"
                                                    id="labelIdPagina1"
                                                    for="campoIdPagina1"
                                                    text="p&#225;gina"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdPagina2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdPagina1"
                                                    binding="#{OpcionMenu2.campoIdPagina1}"
                                                    readOnly="#{OpcionMenu2.gestor.filaNoProcesada}"
                                                    text="#{OpcionMenu2.asistente.textoCampoIdPagina1}"
                                                    toolTip="#{OpcionMenu2.asistente.toolTipCampoIdPagina1}"
                                                    validatorExpression="#{OpcionMenu2.campoIdPagina1_validate}"/>
                                                <webuijsf:staticText id="campoIdPagina1Texto1"
                                                    binding="#{OpcionMenu2.campoIdPagina1Texto1}"
                                                    text="#{OpcionMenu2.opcionMenuDataProvider.value['codigo_pagina_1x2y3']}"/>
                                                <webuijsf:button id="campoIdPagina1Boton1"
                                                    binding="#{OpcionMenu2.campoIdPagina1Boton1}"
                                                    onClick="#{OpcionMenu2.asistente.scriptCampoIdPagina1Boton1}"/>
                                                <webuijsf:button id="campoIdPagina1Boton3"
                                                    binding="#{OpcionMenu2.campoIdPagina1Boton3}"
                                                    onClick="#{OpcionMenu2.asistente.scriptCampoIdPagina1Boton2}"
                                                    rendered="#{OpcionMenu2.asistente.campoIdPagina1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdPagina1"
                                                    for="campoIdPagina1"/>
                                                <webuijsf:helpInline id="helpInlineIdPagina1"
                                                    binding="#{OpcionMenu2.helpInlineIdPagina1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_pagina.opcion_menu"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdPagina3"
                                                rendered="#{OpcionMenu2.asistente.campoIdPagina1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{OpcionMenu2.labelIdPagina2}"
                                                    id="labelIdPagina2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre p&#225;gina"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdPagina4"
                                                rendered="#{OpcionMenu2.asistente.campoIdPagina1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{OpcionMenu2.campoIdPagina1Texto2}"
                                                    text="#{OpcionMenu2.opcionMenuDataProvider.value['nombre_pagina_1x2y4']}"
                                                    id="campoIdPagina1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{OpcionMenu2.campoIdPagina1Boton2}"
                                                    id="campoIdPagina1Boton2"
                                                    onClick="#{OpcionMenu2.asistente.scriptCampoIdPagina1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdOpcionMenuSuperior1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{OpcionMenu2.labelIdOpcionMenuSuperior1}"
                                                    id="labelIdOpcionMenuSuperior1"
                                                    for="campoIdOpcionMenuSuperior1"
                                                    text="opci&#243;n men&#250; superior"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdOpcionMenuSuperior2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdOpcionMenuSuperior1"
                                                    binding="#{OpcionMenu2.campoIdOpcionMenuSuperior1}"
                                                    readOnly="#{OpcionMenu2.gestor.filaNoProcesada}"
                                                    text="#{OpcionMenu2.asistente.textoCampoIdOpcionMenuSuperior1}"
                                                    toolTip="#{OpcionMenu2.asistente.toolTipCampoIdOpcionMenuSuperior1}"
                                                    validatorExpression="#{OpcionMenu2.campoIdOpcionMenuSuperior1_validate}"/>
                                                <webuijsf:staticText id="campoIdOpcionMenuSuperior1Texto1"
                                                    binding="#{OpcionMenu2.campoIdOpcionMenuSuperior1Texto1}"
                                                    text="#{OpcionMenu2.opcionMenuDataProvider.value['codigo_opcion_menu_1x3y3']}"/>
                                                <webuijsf:button id="campoIdOpcionMenuSuperior1Boton1"
                                                    binding="#{OpcionMenu2.campoIdOpcionMenuSuperior1Boton1}"
                                                    onClick="#{OpcionMenu2.asistente.scriptCampoIdOpcionMenuSuperior1Boton1}"/>
                                                <webuijsf:button id="campoIdOpcionMenuSuperior1Boton3"
                                                    binding="#{OpcionMenu2.campoIdOpcionMenuSuperior1Boton3}"
                                                    onClick="#{OpcionMenu2.asistente.scriptCampoIdOpcionMenuSuperior1Boton2}"
                                                    rendered="#{OpcionMenu2.asistente.campoIdOpcionMenuSuperior1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdOpcionMenuSuperior1"
                                                    for="campoIdOpcionMenuSuperior1"/>
                                                <webuijsf:helpInline id="helpInlineIdOpcionMenuSuperior1"
                                                    binding="#{OpcionMenu2.helpInlineIdOpcionMenuSuperior1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_opcion_menu_superior.opcion_menu"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdOpcionMenuSuperior3"
                                                rendered="#{OpcionMenu2.asistente.campoIdOpcionMenuSuperior1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{OpcionMenu2.labelIdOpcionMenuSuperior2}"
                                                    id="labelIdOpcionMenuSuperior2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre opci&#243;n men&#250; superior"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdOpcionMenuSuperior4"
                                                rendered="#{OpcionMenu2.asistente.campoIdOpcionMenuSuperior1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{OpcionMenu2.campoIdOpcionMenuSuperior1Texto2}"
                                                    text="#{OpcionMenu2.opcionMenuDataProvider.value['nombre_opcion_menu_1x3y4']}"
                                                    id="campoIdOpcionMenuSuperior1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{OpcionMenu2.campoIdOpcionMenuSuperior1Boton2}"
                                                    id="campoIdOpcionMenuSuperior1Boton2"
                                                    onClick="#{OpcionMenu2.asistente.scriptCampoIdOpcionMenuSuperior1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsOpcionMenuInactiva1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{OpcionMenu2.labelEsOpcionMenuInactiva1}"
                                                    id="labelEsOpcionMenuInactiva1"
                                                    for="listaEsOpcionMenuInactiva1"
                                                    text="inactiva"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsOpcionMenuInactiva2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsOpcionMenuInactiva1"
                                                    binding="#{OpcionMenu2.listaEsOpcionMenuInactiva1}"
                                                    converter="#{OpcionMenu2.converterEsOpcionMenuInactiva1}"
                                                    disabled="true"
                                                    items="#{OpcionMenu2.asistente.opcionesListaEsOpcionMenuInactiva1}"
                                                    selected="#{OpcionMenu2.opcionMenuDataProvider.value['es_opcion_menu_inactiva']}"
                                                    toolTip="BundleParametros.es_opcion_menu_inactiva.opcion_menu"/>
                                                <webuijsf:staticText id="listaEsOpcionMenuInactiva1Texto1"
                                                    binding="#{OpcionMenu2.listaEsOpcionMenuInactiva1Texto1}"/>
                                                <webuijsf:message id="messageEsOpcionMenuInactiva1"
                                                    for="listaEsOpcionMenuInactiva1"/>
                                                <webuijsf:helpInline id="helpInlineEsOpcionMenuInactiva1"
                                                    binding="#{OpcionMenu2.helpInlineEsOpcionMenuInactiva1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_opcion_menu_inactiva.opcion_menu"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsOpcionMenuSincronizada1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{OpcionMenu2.labelEsOpcionMenuSincronizada1}"
                                                    id="labelEsOpcionMenuSincronizada1"
                                                    for="listaEsOpcionMenuSincronizada1"
                                                    text="sincronizada"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsOpcionMenuSincronizada2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsOpcionMenuSincronizada1"
                                                    binding="#{OpcionMenu2.listaEsOpcionMenuSincronizada1}"
                                                    converter="#{OpcionMenu2.converterEsOpcionMenuSincronizada1}"
                                                    disabled="#{OpcionMenu2.gestor.filaNoProcesada}" required="true"
                                                    items="#{OpcionMenu2.asistente.opcionesListaEsOpcionMenuSincronizada1}"
                                                    selected="#{OpcionMenu2.opcionMenuDataProvider.value['es_opcion_menu_sincronizada']}"
                                                    toolTip="BundleParametros.es_opcion_menu_sincronizada.opcion_menu"/>
                                                <webuijsf:staticText id="listaEsOpcionMenuSincronizada1Texto1"
                                                    binding="#{OpcionMenu2.listaEsOpcionMenuSincronizada1Texto1}"/>
                                                <webuijsf:message id="messageEsOpcionMenuSincronizada1"
                                                    for="listaEsOpcionMenuSincronizada1"/>
                                                <webuijsf:helpInline id="helpInlineEsOpcionMenuSincronizada1"
                                                    binding="#{OpcionMenu2.helpInlineEsOpcionMenuSincronizada1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_opcion_menu_sincronizada.opcion_menu"
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
                                                        actionExpression="#{OpcionMenu2.botonIrAlPrimero2_action}"
                                                        binding="#{OpcionMenu2.botonIrAlPrimero2}"
                                                        disabled="#{OpcionMenu2.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero2"
                                                        imageURL="#{OpcionMenu2.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{OpcionMenu2.gestor.scriptIrAlPrimero}"
                                                        text="#{OpcionMenu2.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{OpcionMenu2.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{OpcionMenu2.botonIrAlAnterior2_action}"
                                                        binding="#{OpcionMenu2.botonIrAlAnterior2}"
                                                        disabled="#{OpcionMenu2.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior2"
                                                        imageURL="#{OpcionMenu2.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{OpcionMenu2.gestor.scriptIrAlAnterior}"
                                                        text="#{OpcionMenu2.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{OpcionMenu2.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{OpcionMenu2.botonIrAlSiguiente2_action}"
                                                        binding="#{OpcionMenu2.botonIrAlSiguiente2}"
                                                        disabled="#{OpcionMenu2.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente2"
                                                        imageURL="#{OpcionMenu2.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{OpcionMenu2.gestor.scriptIrAlSiguiente}"
                                                        text="#{OpcionMenu2.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{OpcionMenu2.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{OpcionMenu2.botonIrAlUltimo2_action}"
                                                        binding="#{OpcionMenu2.botonIrAlUltimo2}"
                                                        disabled="#{OpcionMenu2.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo2"
                                                        imageURL="#{OpcionMenu2.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{OpcionMenu2.gestor.scriptIrAlUltimo}"
                                                        text="#{OpcionMenu2.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{OpcionMenu2.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{OpcionMenu2.botonProcesarFila2_action}"
                                                        binding="#{OpcionMenu2.botonProcesarFila2}"
                                                        disabled="#{OpcionMenu2.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila2"
                                                        imageURL="#{OpcionMenu2.gestor.urlImagenProcesar}"
                                                        onClick="#{OpcionMenu2.scriptAbrirVentanaProcesarFila2}"
                                                        rendered="#{OpcionMenu2.asistente.comandoDisponible}"
                                                        text="#{OpcionMenu2.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{OpcionMenu2.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{OpcionMenu2.gestor.mensajeCambiosPorConfirmar}"/>
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
                                                    actionExpression="#{OpcionMenu2.botonAgregar1_action}"
                                                    binding="#{OpcionMenu2.botonAgregar1}"
                                                    disabled="#{OpcionMenu2.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{OpcionMenu2.gestor.scriptAgregar}"
                                                    rendered="#{OpcionMenu2.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{OpcionMenu2.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{OpcionMenu2.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{OpcionMenu2.listaFuncionEdicion1}"
                                                    converter="#{OpcionMenu2.converterListaFuncionEdicion1}"
                                                    disabled="#{OpcionMenu2.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{OpcionMenu2.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{OpcionMenu2.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{OpcionMenu2.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{OpcionMenu2.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{OpcionMenu2.botonEditar1_action}"
                                                    binding="#{OpcionMenu2.botonEditar1}"
                                                    disabled="#{OpcionMenu2.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{OpcionMenu2.gestor.scriptEditar}"
                                                    rendered="#{OpcionMenu2.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{OpcionMenu2.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{OpcionMenu2.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{OpcionMenu2.botonEliminar1_action}"
                                                    binding="#{OpcionMenu2.botonEliminar1}"
                                                    disabled="#{OpcionMenu2.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{OpcionMenu2.gestor.scriptEliminar}"
                                                    rendered="#{OpcionMenu2.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{OpcionMenu2.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{OpcionMenu2.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{OpcionMenu2.botonAplicar1_action}"
                                                    binding="#{OpcionMenu2.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{OpcionMenu2.gestor.scriptAplicar}"
                                                    rendered="#{OpcionMenu2.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{OpcionMenu2.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{OpcionMenu2.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{OpcionMenu2.botonDeshacer1_action}"
                                                    binding="#{OpcionMenu2.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{OpcionMenu2.gestor.scriptDeshacer}"
                                                    rendered="#{OpcionMenu2.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{OpcionMenu2.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{OpcionMenu2.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{OpcionMenu2.botonConfirmar1_action}"
                                                    binding="#{OpcionMenu2.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{OpcionMenu2.gestor.scriptConfirmar}"
                                                    rendered="#{OpcionMenu2.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{OpcionMenu2.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{OpcionMenu2.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{OpcionMenu2.botonDescartar1_action}"
                                                    binding="#{OpcionMenu2.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{OpcionMenu2.gestor.scriptDescartar}"
                                                    rendered="#{OpcionMenu2.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{OpcionMenu2.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{OpcionMenu2.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{OpcionMenu2.listaFuncionAccion1}"
                                                    converter="#{OpcionMenu2.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{OpcionMenu2.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{OpcionMenu2.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{OpcionMenu2.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{OpcionMenu2.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{OpcionMenu2.botonProcesar1_action}"
                                                    binding="#{OpcionMenu2.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{OpcionMenu2.gestor.scriptProcesar}"
                                                    rendered="#{OpcionMenu2.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{OpcionMenu2.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{OpcionMenu2.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{OpcionMenu2.botonRefrescar1_action}"
                                                    binding="#{OpcionMenu2.botonRefrescar1}"
                                                    disabled="#{OpcionMenu2.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{OpcionMenu2.gestor.scriptRefrescar}"
                                                    rendered="#{OpcionMenu2.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{OpcionMenu2.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{OpcionMenu2.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{OpcionMenu2.botonReconsultar1_action}"
                                                    binding="#{OpcionMenu2.botonReconsultar1}"
                                                    disabled="#{OpcionMenu2.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{OpcionMenu2.gestor.scriptReconsultar}"
                                                    rendered="#{OpcionMenu2.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{OpcionMenu2.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{OpcionMenu2.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{OpcionMenu2.botonRetornar1_action}"
                                                    binding="#{OpcionMenu2.botonRetornar1}"
                                                    disabled="#{OpcionMenu2.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{OpcionMenu2.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{OpcionMenu2.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{OpcionMenu2.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{OpcionMenu2.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel125"
                                                rendered="#{OpcionMenu2.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{OpcionMenu2.imageHyperlink1_action}"
                                                    binding="#{OpcionMenu2.imageHyperlink1}"
                                                    disabled="#{OpcionMenu2.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{OpcionMenu2.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{OpcionMenu2.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{OpcionMenu2.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.OpcionMenu2_imageHyperlink1_toolTip}"/>
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
