<?xml version="1.0" encoding="UTF-8"?>
<!--
   Copyright (C) 2010, EGT Consultores, C.A.
   Este archivo fue totalmente generado utilizando herramientas de software de EGT Consultores, C.A.
   En consecuencia, partes del archivo podrian ser similares o hasta iguales a las de archivos de
   programas de otros clientes, generados por las mismas herramientas; por lo tanto, esta similitud
   no podra ser considerada como violacion del copyright.
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
                    focus="#{EtniaIndigena6.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{EtniaIndigena6.gestor.preserveFocus}"
                    preserveScroll="#{EtniaIndigena6.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{EtniaIndigena6.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | campoIdEtniaIndigena1 campoCodigoEtniaIndigena1 campoNombreEtniaIndigena1 campoDescripcionEtniaIndigena1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | | , virtualForm3 | listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{EtniaIndigena6.breadcrumbs1}" 
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
                                                    rendered="#{EtniaIndigena6.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{EtniaIndigena6.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{EtniaIndigena6.gestor.mensajeDisponible}"
                                                    text="#{EtniaIndigena6.gestor.mensaje}"
                                                    url="#{EtniaIndigena6.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            id="gridPanel104"
                                            rendered="#{EtniaIndigena6.gestor.filaDisponible}"
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
                                                        actionExpression="#{EtniaIndigena6.botonIrAlPrimero1_action}"
                                                        binding="#{EtniaIndigena6.botonIrAlPrimero1}"
                                                        disabled="#{EtniaIndigena6.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero1"
                                                        imageURL="#{EtniaIndigena6.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{EtniaIndigena6.gestor.scriptIrAlPrimero}"
                                                        text="#{EtniaIndigena6.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{EtniaIndigena6.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{EtniaIndigena6.botonIrAlAnterior1_action}"
                                                        binding="#{EtniaIndigena6.botonIrAlAnterior1}"
                                                        disabled="#{EtniaIndigena6.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior1"
                                                        imageURL="#{EtniaIndigena6.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{EtniaIndigena6.gestor.scriptIrAlAnterior}"
                                                        text="#{EtniaIndigena6.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{EtniaIndigena6.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{EtniaIndigena6.botonIrAlSiguiente1_action}"
                                                        binding="#{EtniaIndigena6.botonIrAlSiguiente1}"
                                                        disabled="#{EtniaIndigena6.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente1"
                                                        imageURL="#{EtniaIndigena6.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{EtniaIndigena6.gestor.scriptIrAlSiguiente}"
                                                        text="#{EtniaIndigena6.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{EtniaIndigena6.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{EtniaIndigena6.botonIrAlUltimo1_action}"
                                                        binding="#{EtniaIndigena6.botonIrAlUltimo1}"
                                                        disabled="#{EtniaIndigena6.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo1"
                                                        imageURL="#{EtniaIndigena6.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{EtniaIndigena6.gestor.scriptIrAlUltimo}"
                                                        text="#{EtniaIndigena6.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{EtniaIndigena6.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{EtniaIndigena6.botonProcesarFila1_action}"
                                                        binding="#{EtniaIndigena6.botonProcesarFila1}"
                                                        disabled="#{EtniaIndigena6.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila1"
                                                        imageURL="#{EtniaIndigena6.gestor.urlImagenProcesar}"
                                                        onClick="#{EtniaIndigena6.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{EtniaIndigena6.asistente.comandoDisponible}"
                                                        text="#{EtniaIndigena6.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{EtniaIndigena6.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{EtniaIndigena6.gestor.tituloConsulta}"/>
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
                                                    binding="#{EtniaIndigena6.etiquetaIdentificacionFila1}"
                                                    id="etiquetaIdentificacionFila1"
                                                    text="#{EtniaIndigena6.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{EtniaIndigena6.gestor.i18n.toolTipEtiquetaIdentificacionFila}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel113"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoIdentificacionFila1"
                                                    style="font-weight: bold"
                                                    text="#{EtniaIndigena6.gestor.identificacionFila}"/>
                                                <webuijsf:image
                                                    id="imagenFilaProcesada1"
                                                    toolTip="#{EtniaIndigena6.gestor.toolTipImagenFilaProcesada}"
                                                    url="#{EtniaIndigena6.gestor.urlImagenFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPanel114"
                                                rendered="#{EtniaIndigena6.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{EtniaIndigena6.etiquetaDenominacionFilaMaestro1}"
                                                    id="etiquetaDenominacionFilaMaestro1"
                                                    text="?"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel115"
                                                rendered="#{EtniaIndigena6.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoDenominacionFilaMaestro1"
                                                    style="font-weight: bold"
                                                    text="#{EtniaIndigena6.gestor.denominacionFilaMaestro}"/>
                                                <webuijsf:image
                                                    id="imagenFilaMaestro1"
                                                    url="#{EtniaIndigena6.gestor.urlImagenMaestroFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdEtniaIndigena1" rendered="false"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{EtniaIndigena6.labelIdEtniaIndigena1}"
                                                    id="labelIdEtniaIndigena1"
                                                    for="campoIdEtniaIndigena1"
                                                    text="identificaci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdEtniaIndigena2" rendered="false"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdEtniaIndigena1"
                                                    binding="#{EtniaIndigena6.campoIdEtniaIndigena1}"
                                                    converter="#{EtniaIndigena6.converterIdEtniaIndigena1}"
                                                    readOnly="#{EtniaIndigena6.gestor.filaNoProcesada}"
                                                    text="#{EtniaIndigena6.etniaIndigenaDataProvider.value['id_etnia_indigena']}"
                                                    toolTip="BundleParametros.id_etnia_indigena.etnia_indigena"
                                                    validatorExpression="#{EtniaIndigena6.validatorIdEtniaIndigena1.validate}"/>
                                                <webuijsf:staticText id="campoIdEtniaIndigena1Texto1"
                                                    binding="#{EtniaIndigena6.campoIdEtniaIndigena1Texto1}"
                                                    text="#{EtniaIndigena6.etniaIndigenaDataProvider.value['id_etnia_indigena']}"/>
                                                <webuijsf:message id="messageIdEtniaIndigena1"
                                                    for="campoIdEtniaIndigena1"/>
                                                <webuijsf:helpInline id="helpInlineIdEtniaIndigena1"
                                                    binding="#{EtniaIndigena6.helpInlineIdEtniaIndigena1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_etnia_indigena.etnia_indigena"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridCodigoEtniaIndigena1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{EtniaIndigena6.labelCodigoEtniaIndigena1}"
                                                    id="labelCodigoEtniaIndigena1"
                                                    for="campoCodigoEtniaIndigena1"
                                                    text="c&#243;digo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridCodigoEtniaIndigena2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoCodigoEtniaIndigena1"
                                                    binding="#{EtniaIndigena6.campoCodigoEtniaIndigena1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{EtniaIndigena6.gestor.filaNoProcesada}" required="true"
                                                    text="#{EtniaIndigena6.etniaIndigenaDataProvider.value['codigo_etnia_indigena']}"
                                                    toolTip="BundleParametros.codigo_etnia_indigena.etnia_indigena"
                                                    validatorExpression="#{EtniaIndigena6.validatorCodigoEtniaIndigena1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoEtniaIndigena1Texto1"
                                                    binding="#{EtniaIndigena6.campoCodigoEtniaIndigena1Texto1}"
                                                    text="#{EtniaIndigena6.etniaIndigenaDataProvider.value['codigo_etnia_indigena']}"/>
                                                <webuijsf:message id="messageCodigoEtniaIndigena1"
                                                    for="campoCodigoEtniaIndigena1"/>
                                                <webuijsf:helpInline id="helpInlineCodigoEtniaIndigena1"
                                                    binding="#{EtniaIndigena6.helpInlineCodigoEtniaIndigena1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.codigo_etnia_indigena.etnia_indigena"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNombreEtniaIndigena1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{EtniaIndigena6.labelNombreEtniaIndigena1}"
                                                    id="labelNombreEtniaIndigena1"
                                                    for="campoNombreEtniaIndigena1"
                                                    text="nombre"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNombreEtniaIndigena2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNombreEtniaIndigena1"
                                                    binding="#{EtniaIndigena6.campoNombreEtniaIndigena1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{EtniaIndigena6.gestor.filaNoProcesada}"
                                                    text="#{EtniaIndigena6.etniaIndigenaDataProvider.value['nombre_etnia_indigena']}"
                                                    toolTip="BundleParametros.nombre_etnia_indigena.etnia_indigena"
                                                    validatorExpression="#{EtniaIndigena6.validatorNombreEtniaIndigena1.validate}"/>
                                                <webuijsf:staticText id="campoNombreEtniaIndigena1Texto1"
                                                    binding="#{EtniaIndigena6.campoNombreEtniaIndigena1Texto1}"
                                                    text="#{EtniaIndigena6.etniaIndigenaDataProvider.value['nombre_etnia_indigena']}"/>
                                                <webuijsf:message id="messageNombreEtniaIndigena1"
                                                    for="campoNombreEtniaIndigena1"/>
                                                <webuijsf:helpInline id="helpInlineNombreEtniaIndigena1"
                                                    binding="#{EtniaIndigena6.helpInlineNombreEtniaIndigena1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.nombre_etnia_indigena.etnia_indigena"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridDescripcionEtniaIndigena1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{EtniaIndigena6.labelDescripcionEtniaIndigena1}"
                                                    id="labelDescripcionEtniaIndigena1"
                                                    for="campoDescripcionEtniaIndigena1"
                                                    text="descripci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridDescripcionEtniaIndigena2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoDescripcionEtniaIndigena1"
                                                    binding="#{EtniaIndigena6.campoDescripcionEtniaIndigena1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{EtniaIndigena6.gestor.filaNoProcesada}"
                                                    text="#{EtniaIndigena6.etniaIndigenaDataProvider.value['descripcion_etnia_indigena']}"
                                                    toolTip="BundleParametros.descripcion_etnia_indigena.etnia_indigena"
                                                    validatorExpression="#{EtniaIndigena6.validatorDescripcionEtniaIndigena1.validate}"/>
                                                <webuijsf:staticText id="campoDescripcionEtniaIndigena1Texto1"
                                                    binding="#{EtniaIndigena6.campoDescripcionEtniaIndigena1Texto1}"
                                                    text="#{EtniaIndigena6.etniaIndigenaDataProvider.value['descripcion_etnia_indigena']}"/>
                                                <webuijsf:message id="messageDescripcionEtniaIndigena1"
                                                    for="campoDescripcionEtniaIndigena1"/>
                                                <webuijsf:helpInline id="helpInlineDescripcionEtniaIndigena1"
                                                    binding="#{EtniaIndigena6.helpInlineDescripcionEtniaIndigena1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.descripcion_etnia_indigena.etnia_indigena"
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
                                                        actionExpression="#{EtniaIndigena6.botonIrAlPrimero2_action}"
                                                        binding="#{EtniaIndigena6.botonIrAlPrimero2}"
                                                        disabled="#{EtniaIndigena6.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero2"
                                                        imageURL="#{EtniaIndigena6.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{EtniaIndigena6.gestor.scriptIrAlPrimero}"
                                                        text="#{EtniaIndigena6.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{EtniaIndigena6.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{EtniaIndigena6.botonIrAlAnterior2_action}"
                                                        binding="#{EtniaIndigena6.botonIrAlAnterior2}"
                                                        disabled="#{EtniaIndigena6.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior2"
                                                        imageURL="#{EtniaIndigena6.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{EtniaIndigena6.gestor.scriptIrAlAnterior}"
                                                        text="#{EtniaIndigena6.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{EtniaIndigena6.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{EtniaIndigena6.botonIrAlSiguiente2_action}"
                                                        binding="#{EtniaIndigena6.botonIrAlSiguiente2}"
                                                        disabled="#{EtniaIndigena6.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente2"
                                                        imageURL="#{EtniaIndigena6.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{EtniaIndigena6.gestor.scriptIrAlSiguiente}"
                                                        text="#{EtniaIndigena6.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{EtniaIndigena6.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{EtniaIndigena6.botonIrAlUltimo2_action}"
                                                        binding="#{EtniaIndigena6.botonIrAlUltimo2}"
                                                        disabled="#{EtniaIndigena6.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo2"
                                                        imageURL="#{EtniaIndigena6.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{EtniaIndigena6.gestor.scriptIrAlUltimo}"
                                                        text="#{EtniaIndigena6.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{EtniaIndigena6.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{EtniaIndigena6.botonProcesarFila2_action}"
                                                        binding="#{EtniaIndigena6.botonProcesarFila2}"
                                                        disabled="#{EtniaIndigena6.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila2"
                                                        imageURL="#{EtniaIndigena6.gestor.urlImagenProcesar}"
                                                        onClick="#{EtniaIndigena6.scriptAbrirVentanaProcesarFila2}"
                                                        rendered="#{EtniaIndigena6.asistente.comandoDisponible}"
                                                        text="#{EtniaIndigena6.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{EtniaIndigena6.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{EtniaIndigena6.gestor.mensajeCambiosPorConfirmar}"/>
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
                                                    actionExpression="#{EtniaIndigena6.botonAgregar1_action}"
                                                    binding="#{EtniaIndigena6.botonAgregar1}"
                                                    disabled="#{EtniaIndigena6.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{EtniaIndigena6.gestor.scriptAgregar}"
                                                    rendered="#{EtniaIndigena6.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{EtniaIndigena6.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{EtniaIndigena6.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{EtniaIndigena6.listaFuncionEdicion1}"
                                                    converter="#{EtniaIndigena6.converterListaFuncionEdicion1}"
                                                    disabled="#{EtniaIndigena6.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{EtniaIndigena6.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{EtniaIndigena6.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{EtniaIndigena6.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{EtniaIndigena6.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{EtniaIndigena6.botonEditar1_action}"
                                                    binding="#{EtniaIndigena6.botonEditar1}"
                                                    disabled="#{EtniaIndigena6.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{EtniaIndigena6.gestor.scriptEditar}"
                                                    rendered="#{EtniaIndigena6.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{EtniaIndigena6.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{EtniaIndigena6.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{EtniaIndigena6.botonEliminar1_action}"
                                                    binding="#{EtniaIndigena6.botonEliminar1}"
                                                    disabled="#{EtniaIndigena6.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{EtniaIndigena6.gestor.scriptEliminar}"
                                                    rendered="#{EtniaIndigena6.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{EtniaIndigena6.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{EtniaIndigena6.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{EtniaIndigena6.botonAplicar1_action}"
                                                    binding="#{EtniaIndigena6.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{EtniaIndigena6.gestor.scriptAplicar}"
                                                    rendered="#{EtniaIndigena6.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{EtniaIndigena6.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{EtniaIndigena6.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{EtniaIndigena6.botonDeshacer1_action}"
                                                    binding="#{EtniaIndigena6.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{EtniaIndigena6.gestor.scriptDeshacer}"
                                                    rendered="#{EtniaIndigena6.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{EtniaIndigena6.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{EtniaIndigena6.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{EtniaIndigena6.botonConfirmar1_action}"
                                                    binding="#{EtniaIndigena6.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{EtniaIndigena6.gestor.scriptConfirmar}"
                                                    rendered="#{EtniaIndigena6.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{EtniaIndigena6.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{EtniaIndigena6.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{EtniaIndigena6.botonDescartar1_action}"
                                                    binding="#{EtniaIndigena6.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{EtniaIndigena6.gestor.scriptDescartar}"
                                                    rendered="#{EtniaIndigena6.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{EtniaIndigena6.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{EtniaIndigena6.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{EtniaIndigena6.listaFuncionAccion1}"
                                                    converter="#{EtniaIndigena6.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{EtniaIndigena6.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{EtniaIndigena6.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{EtniaIndigena6.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{EtniaIndigena6.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{EtniaIndigena6.botonProcesar1_action}"
                                                    binding="#{EtniaIndigena6.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{EtniaIndigena6.gestor.scriptProcesar}"
                                                    rendered="#{EtniaIndigena6.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{EtniaIndigena6.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{EtniaIndigena6.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{EtniaIndigena6.botonRefrescar1_action}"
                                                    binding="#{EtniaIndigena6.botonRefrescar1}"
                                                    disabled="#{EtniaIndigena6.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{EtniaIndigena6.gestor.scriptRefrescar}"
                                                    rendered="#{EtniaIndigena6.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{EtniaIndigena6.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{EtniaIndigena6.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{EtniaIndigena6.botonReconsultar1_action}"
                                                    binding="#{EtniaIndigena6.botonReconsultar1}"
                                                    disabled="#{EtniaIndigena6.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{EtniaIndigena6.gestor.scriptReconsultar}"
                                                    rendered="#{EtniaIndigena6.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{EtniaIndigena6.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{EtniaIndigena6.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{EtniaIndigena6.botonRetornar1_action}"
                                                    binding="#{EtniaIndigena6.botonRetornar1}"
                                                    disabled="#{EtniaIndigena6.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{EtniaIndigena6.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{EtniaIndigena6.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{EtniaIndigena6.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{EtniaIndigena6.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel125"
                                                rendered="#{EtniaIndigena6.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{EtniaIndigena6.imageHyperlink1_action}"
                                                    binding="#{EtniaIndigena6.imageHyperlink1}"
                                                    disabled="#{EtniaIndigena6.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{EtniaIndigena6.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{EtniaIndigena6.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{EtniaIndigena6.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.EtniaIndigena6_imageHyperlink1_toolTip}"/>
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
