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
                    focus="#{ProveedorDatExt2.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{ProveedorDatExt2.gestor.preserveFocus}"
                    preserveScroll="#{ProveedorDatExt2.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{ProveedorDatExt2.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | campoIdProveedorDatExt1 campoCodigoProveedorDatExt1 campoNombreProveedorDatExt1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | | , virtualForm3 | listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{ProveedorDatExt2.breadcrumbs1}" 
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
                                                    rendered="#{ProveedorDatExt2.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{ProveedorDatExt2.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{ProveedorDatExt2.gestor.mensajeDisponible}"
                                                    text="#{ProveedorDatExt2.gestor.mensaje}"
                                                    url="#{ProveedorDatExt2.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            id="gridPanel104"
                                            rendered="#{ProveedorDatExt2.gestor.filaDisponible}"
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
                                                        actionExpression="#{ProveedorDatExt2.botonIrAlPrimero1_action}"
                                                        binding="#{ProveedorDatExt2.botonIrAlPrimero1}"
                                                        disabled="#{ProveedorDatExt2.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero1"
                                                        imageURL="#{ProveedorDatExt2.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{ProveedorDatExt2.gestor.scriptIrAlPrimero}"
                                                        text="#{ProveedorDatExt2.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{ProveedorDatExt2.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{ProveedorDatExt2.botonIrAlAnterior1_action}"
                                                        binding="#{ProveedorDatExt2.botonIrAlAnterior1}"
                                                        disabled="#{ProveedorDatExt2.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior1"
                                                        imageURL="#{ProveedorDatExt2.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{ProveedorDatExt2.gestor.scriptIrAlAnterior}"
                                                        text="#{ProveedorDatExt2.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{ProveedorDatExt2.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{ProveedorDatExt2.botonIrAlSiguiente1_action}"
                                                        binding="#{ProveedorDatExt2.botonIrAlSiguiente1}"
                                                        disabled="#{ProveedorDatExt2.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente1"
                                                        imageURL="#{ProveedorDatExt2.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{ProveedorDatExt2.gestor.scriptIrAlSiguiente}"
                                                        text="#{ProveedorDatExt2.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{ProveedorDatExt2.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{ProveedorDatExt2.botonIrAlUltimo1_action}"
                                                        binding="#{ProveedorDatExt2.botonIrAlUltimo1}"
                                                        disabled="#{ProveedorDatExt2.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo1"
                                                        imageURL="#{ProveedorDatExt2.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{ProveedorDatExt2.gestor.scriptIrAlUltimo}"
                                                        text="#{ProveedorDatExt2.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{ProveedorDatExt2.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{ProveedorDatExt2.botonProcesarFila1_action}"
                                                        binding="#{ProveedorDatExt2.botonProcesarFila1}"
                                                        disabled="#{ProveedorDatExt2.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila1"
                                                        imageURL="#{ProveedorDatExt2.gestor.urlImagenProcesar}"
                                                        onClick="#{ProveedorDatExt2.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{ProveedorDatExt2.asistente.comandoDisponible}"
                                                        text="#{ProveedorDatExt2.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{ProveedorDatExt2.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{ProveedorDatExt2.gestor.tituloConsulta}"/>
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
                                                    binding="#{ProveedorDatExt2.etiquetaIdentificacionFila1}"
                                                    id="etiquetaIdentificacionFila1"
                                                    text="#{ProveedorDatExt2.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{ProveedorDatExt2.gestor.i18n.toolTipEtiquetaIdentificacionFila}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel113"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoIdentificacionFila1"
                                                    style="font-weight: bold"
                                                    text="#{ProveedorDatExt2.gestor.identificacionFila}"/>
                                                <webuijsf:image
                                                    id="imagenFilaProcesada1"
                                                    toolTip="#{ProveedorDatExt2.gestor.toolTipImagenFilaProcesada}"
                                                    url="#{ProveedorDatExt2.gestor.urlImagenFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPanel114"
                                                rendered="#{ProveedorDatExt2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ProveedorDatExt2.etiquetaDenominacionFilaMaestro1}"
                                                    id="etiquetaDenominacionFilaMaestro1"
                                                    text="?"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel115"
                                                rendered="#{ProveedorDatExt2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoDenominacionFilaMaestro1"
                                                    style="font-weight: bold"
                                                    text="#{ProveedorDatExt2.gestor.denominacionFilaMaestro}"/>
                                                <webuijsf:image
                                                    id="imagenFilaMaestro1"
                                                    url="#{ProveedorDatExt2.gestor.urlImagenMaestroFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdProveedorDatExt1" rendered="false"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ProveedorDatExt2.labelIdProveedorDatExt1}"
                                                    id="labelIdProveedorDatExt1"
                                                    for="campoIdProveedorDatExt1"
                                                    text="id"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdProveedorDatExt2" rendered="false"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdProveedorDatExt1"
                                                    binding="#{ProveedorDatExt2.campoIdProveedorDatExt1}"
                                                    converter="#{ProveedorDatExt2.converterIdProveedorDatExt1}"
                                                    readOnly="#{ProveedorDatExt2.gestor.filaNoProcesada}"
                                                    text="#{ProveedorDatExt2.proveedorDatExtDataProvider.value['id_proveedor_dat_ext']}"
                                                    toolTip="BundleParametros.id_proveedor_dat_ext.proveedor_dat_ext"
                                                    validatorExpression="#{ProveedorDatExt2.validatorIdProveedorDatExt1.validate}"/>
                                                <webuijsf:staticText id="campoIdProveedorDatExt1Texto1"
                                                    binding="#{ProveedorDatExt2.campoIdProveedorDatExt1Texto1}"
                                                    text="#{ProveedorDatExt2.proveedorDatExtDataProvider.value['id_proveedor_dat_ext']}"/>
                                                <webuijsf:message id="messageIdProveedorDatExt1"
                                                    for="campoIdProveedorDatExt1"/>
                                                <webuijsf:helpInline id="helpInlineIdProveedorDatExt1"
                                                    binding="#{ProveedorDatExt2.helpInlineIdProveedorDatExt1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_proveedor_dat_ext.proveedor_dat_ext"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridCodigoProveedorDatExt1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ProveedorDatExt2.labelCodigoProveedorDatExt1}"
                                                    id="labelCodigoProveedorDatExt1"
                                                    for="campoCodigoProveedorDatExt1"
                                                    text="codigo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridCodigoProveedorDatExt2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoCodigoProveedorDatExt1"
                                                    binding="#{ProveedorDatExt2.campoCodigoProveedorDatExt1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{ProveedorDatExt2.gestor.filaNoProcesada}" required="true"
                                                    text="#{ProveedorDatExt2.proveedorDatExtDataProvider.value['codigo_proveedor_dat_ext']}"
                                                    toolTip="BundleParametros.codigo_proveedor_dat_ext.proveedor_dat_ext"
                                                    validatorExpression="#{ProveedorDatExt2.validatorCodigoProveedorDatExt1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoProveedorDatExt1Texto1"
                                                    binding="#{ProveedorDatExt2.campoCodigoProveedorDatExt1Texto1}"
                                                    text="#{ProveedorDatExt2.proveedorDatExtDataProvider.value['codigo_proveedor_dat_ext']}"/>
                                                <webuijsf:message id="messageCodigoProveedorDatExt1"
                                                    for="campoCodigoProveedorDatExt1"/>
                                                <webuijsf:helpInline id="helpInlineCodigoProveedorDatExt1"
                                                    binding="#{ProveedorDatExt2.helpInlineCodigoProveedorDatExt1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.codigo_proveedor_dat_ext.proveedor_dat_ext"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNombreProveedorDatExt1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ProveedorDatExt2.labelNombreProveedorDatExt1}"
                                                    id="labelNombreProveedorDatExt1"
                                                    for="campoNombreProveedorDatExt1"
                                                    text="nombre"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNombreProveedorDatExt2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNombreProveedorDatExt1"
                                                    binding="#{ProveedorDatExt2.campoNombreProveedorDatExt1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{ProveedorDatExt2.gestor.filaNoProcesada}" required="true"
                                                    text="#{ProveedorDatExt2.proveedorDatExtDataProvider.value['nombre_proveedor_dat_ext']}"
                                                    toolTip="BundleParametros.nombre_proveedor_dat_ext.proveedor_dat_ext"
                                                    validatorExpression="#{ProveedorDatExt2.validatorNombreProveedorDatExt1.validate}"/>
                                                <webuijsf:staticText id="campoNombreProveedorDatExt1Texto1"
                                                    binding="#{ProveedorDatExt2.campoNombreProveedorDatExt1Texto1}"
                                                    text="#{ProveedorDatExt2.proveedorDatExtDataProvider.value['nombre_proveedor_dat_ext']}"/>
                                                <webuijsf:message id="messageNombreProveedorDatExt1"
                                                    for="campoNombreProveedorDatExt1"/>
                                                <webuijsf:helpInline id="helpInlineNombreProveedorDatExt1"
                                                    binding="#{ProveedorDatExt2.helpInlineNombreProveedorDatExt1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.nombre_proveedor_dat_ext.proveedor_dat_ext"
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
                                                        actionExpression="#{ProveedorDatExt2.botonIrAlPrimero2_action}"
                                                        binding="#{ProveedorDatExt2.botonIrAlPrimero2}"
                                                        disabled="#{ProveedorDatExt2.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero2"
                                                        imageURL="#{ProveedorDatExt2.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{ProveedorDatExt2.gestor.scriptIrAlPrimero}"
                                                        text="#{ProveedorDatExt2.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{ProveedorDatExt2.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{ProveedorDatExt2.botonIrAlAnterior2_action}"
                                                        binding="#{ProveedorDatExt2.botonIrAlAnterior2}"
                                                        disabled="#{ProveedorDatExt2.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior2"
                                                        imageURL="#{ProveedorDatExt2.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{ProveedorDatExt2.gestor.scriptIrAlAnterior}"
                                                        text="#{ProveedorDatExt2.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{ProveedorDatExt2.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{ProveedorDatExt2.botonIrAlSiguiente2_action}"
                                                        binding="#{ProveedorDatExt2.botonIrAlSiguiente2}"
                                                        disabled="#{ProveedorDatExt2.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente2"
                                                        imageURL="#{ProveedorDatExt2.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{ProveedorDatExt2.gestor.scriptIrAlSiguiente}"
                                                        text="#{ProveedorDatExt2.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{ProveedorDatExt2.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{ProveedorDatExt2.botonIrAlUltimo2_action}"
                                                        binding="#{ProveedorDatExt2.botonIrAlUltimo2}"
                                                        disabled="#{ProveedorDatExt2.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo2"
                                                        imageURL="#{ProveedorDatExt2.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{ProveedorDatExt2.gestor.scriptIrAlUltimo}"
                                                        text="#{ProveedorDatExt2.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{ProveedorDatExt2.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{ProveedorDatExt2.botonProcesarFila2_action}"
                                                        binding="#{ProveedorDatExt2.botonProcesarFila2}"
                                                        disabled="#{ProveedorDatExt2.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila2"
                                                        imageURL="#{ProveedorDatExt2.gestor.urlImagenProcesar}"
                                                        onClick="#{ProveedorDatExt2.scriptAbrirVentanaProcesarFila2}"
                                                        rendered="#{ProveedorDatExt2.asistente.comandoDisponible}"
                                                        text="#{ProveedorDatExt2.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{ProveedorDatExt2.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{ProveedorDatExt2.gestor.mensajeCambiosPorConfirmar}"/>
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
                                                    actionExpression="#{ProveedorDatExt2.botonAgregar1_action}"
                                                    binding="#{ProveedorDatExt2.botonAgregar1}"
                                                    disabled="#{ProveedorDatExt2.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{ProveedorDatExt2.gestor.scriptAgregar}"
                                                    rendered="#{ProveedorDatExt2.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ProveedorDatExt2.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{ProveedorDatExt2.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{ProveedorDatExt2.listaFuncionEdicion1}"
                                                    converter="#{ProveedorDatExt2.converterListaFuncionEdicion1}"
                                                    disabled="#{ProveedorDatExt2.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{ProveedorDatExt2.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{ProveedorDatExt2.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{ProveedorDatExt2.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{ProveedorDatExt2.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ProveedorDatExt2.botonEditar1_action}"
                                                    binding="#{ProveedorDatExt2.botonEditar1}"
                                                    disabled="#{ProveedorDatExt2.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{ProveedorDatExt2.gestor.scriptEditar}"
                                                    rendered="#{ProveedorDatExt2.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ProveedorDatExt2.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{ProveedorDatExt2.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ProveedorDatExt2.botonEliminar1_action}"
                                                    binding="#{ProveedorDatExt2.botonEliminar1}"
                                                    disabled="#{ProveedorDatExt2.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{ProveedorDatExt2.gestor.scriptEliminar}"
                                                    rendered="#{ProveedorDatExt2.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ProveedorDatExt2.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{ProveedorDatExt2.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ProveedorDatExt2.botonAplicar1_action}"
                                                    binding="#{ProveedorDatExt2.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{ProveedorDatExt2.gestor.scriptAplicar}"
                                                    rendered="#{ProveedorDatExt2.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ProveedorDatExt2.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{ProveedorDatExt2.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ProveedorDatExt2.botonDeshacer1_action}"
                                                    binding="#{ProveedorDatExt2.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{ProveedorDatExt2.gestor.scriptDeshacer}"
                                                    rendered="#{ProveedorDatExt2.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ProveedorDatExt2.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{ProveedorDatExt2.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ProveedorDatExt2.botonConfirmar1_action}"
                                                    binding="#{ProveedorDatExt2.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{ProveedorDatExt2.gestor.scriptConfirmar}"
                                                    rendered="#{ProveedorDatExt2.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ProveedorDatExt2.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{ProveedorDatExt2.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ProveedorDatExt2.botonDescartar1_action}"
                                                    binding="#{ProveedorDatExt2.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{ProveedorDatExt2.gestor.scriptDescartar}"
                                                    rendered="#{ProveedorDatExt2.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ProveedorDatExt2.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{ProveedorDatExt2.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{ProveedorDatExt2.listaFuncionAccion1}"
                                                    converter="#{ProveedorDatExt2.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{ProveedorDatExt2.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{ProveedorDatExt2.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{ProveedorDatExt2.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{ProveedorDatExt2.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ProveedorDatExt2.botonProcesar1_action}"
                                                    binding="#{ProveedorDatExt2.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{ProveedorDatExt2.gestor.scriptProcesar}"
                                                    rendered="#{ProveedorDatExt2.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ProveedorDatExt2.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{ProveedorDatExt2.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ProveedorDatExt2.botonRefrescar1_action}"
                                                    binding="#{ProveedorDatExt2.botonRefrescar1}"
                                                    disabled="#{ProveedorDatExt2.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{ProveedorDatExt2.gestor.scriptRefrescar}"
                                                    rendered="#{ProveedorDatExt2.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ProveedorDatExt2.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{ProveedorDatExt2.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ProveedorDatExt2.botonReconsultar1_action}"
                                                    binding="#{ProveedorDatExt2.botonReconsultar1}"
                                                    disabled="#{ProveedorDatExt2.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{ProveedorDatExt2.gestor.scriptReconsultar}"
                                                    rendered="#{ProveedorDatExt2.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ProveedorDatExt2.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{ProveedorDatExt2.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ProveedorDatExt2.botonRetornar1_action}"
                                                    binding="#{ProveedorDatExt2.botonRetornar1}"
                                                    disabled="#{ProveedorDatExt2.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{ProveedorDatExt2.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{ProveedorDatExt2.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ProveedorDatExt2.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{ProveedorDatExt2.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel125"
                                                rendered="#{ProveedorDatExt2.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{ProveedorDatExt2.imageHyperlink1_action}"
                                                    binding="#{ProveedorDatExt2.imageHyperlink1}"
                                                    disabled="#{ProveedorDatExt2.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{ProveedorDatExt2.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{ProveedorDatExt2.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{ProveedorDatExt2.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.ProveedorDatExt2_imageHyperlink1_toolTip}"/>
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
