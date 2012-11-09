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
                    focus="#{ArchivoDatosExt2.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{ArchivoDatosExt2.gestor.preserveFocus}"
                    preserveScroll="#{ArchivoDatosExt2.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{ArchivoDatosExt2.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | campoIdArchivoDatosExt1 campoCodigoArchivoDatosExt1 campoNombreArchivoDatosExt1 campoIdProveedorDatExt1 listaNumeroTipoArcDatExt1 listaEsArchivoDatosExtImportado1 campoFechaHoraUltimaCarga1 campoIdUsuarioUltimaCarga1 campoFechaHoraUltimaImportacion1 campoIdUsuarioUltimaImportacion1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | | , virtualForm3 | listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{ArchivoDatosExt2.breadcrumbs1}" 
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
                                                    rendered="#{ArchivoDatosExt2.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{ArchivoDatosExt2.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{ArchivoDatosExt2.gestor.mensajeDisponible}"
                                                    text="#{ArchivoDatosExt2.gestor.mensaje}"
                                                    url="#{ArchivoDatosExt2.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            id="gridPanel104"
                                            rendered="#{ArchivoDatosExt2.gestor.filaDisponible}"
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
                                                        actionExpression="#{ArchivoDatosExt2.botonIrAlPrimero1_action}"
                                                        binding="#{ArchivoDatosExt2.botonIrAlPrimero1}"
                                                        disabled="#{ArchivoDatosExt2.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero1"
                                                        imageURL="#{ArchivoDatosExt2.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{ArchivoDatosExt2.gestor.scriptIrAlPrimero}"
                                                        text="#{ArchivoDatosExt2.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{ArchivoDatosExt2.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{ArchivoDatosExt2.botonIrAlAnterior1_action}"
                                                        binding="#{ArchivoDatosExt2.botonIrAlAnterior1}"
                                                        disabled="#{ArchivoDatosExt2.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior1"
                                                        imageURL="#{ArchivoDatosExt2.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{ArchivoDatosExt2.gestor.scriptIrAlAnterior}"
                                                        text="#{ArchivoDatosExt2.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{ArchivoDatosExt2.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{ArchivoDatosExt2.botonIrAlSiguiente1_action}"
                                                        binding="#{ArchivoDatosExt2.botonIrAlSiguiente1}"
                                                        disabled="#{ArchivoDatosExt2.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente1"
                                                        imageURL="#{ArchivoDatosExt2.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{ArchivoDatosExt2.gestor.scriptIrAlSiguiente}"
                                                        text="#{ArchivoDatosExt2.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{ArchivoDatosExt2.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{ArchivoDatosExt2.botonIrAlUltimo1_action}"
                                                        binding="#{ArchivoDatosExt2.botonIrAlUltimo1}"
                                                        disabled="#{ArchivoDatosExt2.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo1"
                                                        imageURL="#{ArchivoDatosExt2.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{ArchivoDatosExt2.gestor.scriptIrAlUltimo}"
                                                        text="#{ArchivoDatosExt2.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{ArchivoDatosExt2.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{ArchivoDatosExt2.botonProcesarFila1_action}"
                                                        binding="#{ArchivoDatosExt2.botonProcesarFila1}"
                                                        disabled="#{ArchivoDatosExt2.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila1"
                                                        imageURL="#{ArchivoDatosExt2.gestor.urlImagenProcesar}"
                                                        onClick="#{ArchivoDatosExt2.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{ArchivoDatosExt2.asistente.comandoDisponible}"
                                                        text="#{ArchivoDatosExt2.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{ArchivoDatosExt2.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{ArchivoDatosExt2.gestor.tituloConsulta}"/>
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
                                                    binding="#{ArchivoDatosExt2.etiquetaIdentificacionFila1}"
                                                    id="etiquetaIdentificacionFila1"
                                                    text="#{ArchivoDatosExt2.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{ArchivoDatosExt2.gestor.i18n.toolTipEtiquetaIdentificacionFila}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel113"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoIdentificacionFila1"
                                                    style="font-weight: bold"
                                                    text="#{ArchivoDatosExt2.gestor.identificacionFila}"/>
                                                <webuijsf:image
                                                    id="imagenFilaProcesada1"
                                                    toolTip="#{ArchivoDatosExt2.gestor.toolTipImagenFilaProcesada}"
                                                    url="#{ArchivoDatosExt2.gestor.urlImagenFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPanel114"
                                                rendered="#{ArchivoDatosExt2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ArchivoDatosExt2.etiquetaDenominacionFilaMaestro1}"
                                                    id="etiquetaDenominacionFilaMaestro1"
                                                    text="?"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel115"
                                                rendered="#{ArchivoDatosExt2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoDenominacionFilaMaestro1"
                                                    style="font-weight: bold"
                                                    text="#{ArchivoDatosExt2.gestor.denominacionFilaMaestro}"/>
                                                <webuijsf:image
                                                    id="imagenFilaMaestro1"
                                                    url="#{ArchivoDatosExt2.gestor.urlImagenMaestroFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdArchivoDatosExt1" rendered="false"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ArchivoDatosExt2.labelIdArchivoDatosExt1}"
                                                    id="labelIdArchivoDatosExt1"
                                                    for="campoIdArchivoDatosExt1"
                                                    text="id"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdArchivoDatosExt2" rendered="false"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdArchivoDatosExt1"
                                                    binding="#{ArchivoDatosExt2.campoIdArchivoDatosExt1}"
                                                    converter="#{ArchivoDatosExt2.converterIdArchivoDatosExt1}"
                                                    readOnly="#{ArchivoDatosExt2.gestor.filaNoProcesada}"
                                                    text="#{ArchivoDatosExt2.archivoDatosExtDataProvider.value['id_archivo_datos_ext']}"
                                                    toolTip="BundleParametros.id_archivo_datos_ext.archivo_datos_ext"
                                                    validatorExpression="#{ArchivoDatosExt2.validatorIdArchivoDatosExt1.validate}"/>
                                                <webuijsf:staticText id="campoIdArchivoDatosExt1Texto1"
                                                    binding="#{ArchivoDatosExt2.campoIdArchivoDatosExt1Texto1}"
                                                    text="#{ArchivoDatosExt2.archivoDatosExtDataProvider.value['id_archivo_datos_ext']}"/>
                                                <webuijsf:message id="messageIdArchivoDatosExt1"
                                                    for="campoIdArchivoDatosExt1"/>
                                                <webuijsf:helpInline id="helpInlineIdArchivoDatosExt1"
                                                    binding="#{ArchivoDatosExt2.helpInlineIdArchivoDatosExt1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_archivo_datos_ext.archivo_datos_ext"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridCodigoArchivoDatosExt1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ArchivoDatosExt2.labelCodigoArchivoDatosExt1}"
                                                    id="labelCodigoArchivoDatosExt1"
                                                    for="campoCodigoArchivoDatosExt1"
                                                    text="codigo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridCodigoArchivoDatosExt2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoCodigoArchivoDatosExt1"
                                                    binding="#{ArchivoDatosExt2.campoCodigoArchivoDatosExt1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{ArchivoDatosExt2.gestor.filaNoCreada}" required="true"
                                                    text="#{ArchivoDatosExt2.archivoDatosExtDataProvider.value['codigo_archivo_datos_ext']}"
                                                    toolTip="BundleParametros.codigo_archivo_datos_ext.archivo_datos_ext"
                                                    validatorExpression="#{ArchivoDatosExt2.validatorCodigoArchivoDatosExt1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoArchivoDatosExt1Texto1"
                                                    binding="#{ArchivoDatosExt2.campoCodigoArchivoDatosExt1Texto1}"
                                                    text="#{ArchivoDatosExt2.archivoDatosExtDataProvider.value['codigo_archivo_datos_ext']}"/>
                                                <webuijsf:message id="messageCodigoArchivoDatosExt1"
                                                    for="campoCodigoArchivoDatosExt1"/>
                                                <webuijsf:helpInline id="helpInlineCodigoArchivoDatosExt1"
                                                    binding="#{ArchivoDatosExt2.helpInlineCodigoArchivoDatosExt1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.codigo_archivo_datos_ext.archivo_datos_ext"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNombreArchivoDatosExt1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ArchivoDatosExt2.labelNombreArchivoDatosExt1}"
                                                    id="labelNombreArchivoDatosExt1"
                                                    for="campoNombreArchivoDatosExt1"
                                                    text="nombre"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNombreArchivoDatosExt2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNombreArchivoDatosExt1"
                                                    binding="#{ArchivoDatosExt2.campoNombreArchivoDatosExt1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="true"
                                                    text="#{ArchivoDatosExt2.archivoDatosExtDataProvider.value['nombre_archivo_datos_ext']}"
                                                    toolTip="BundleParametros.nombre_archivo_datos_ext.archivo_datos_ext"
                                                    validatorExpression="#{ArchivoDatosExt2.validatorNombreArchivoDatosExt1.validate}"/>
                                                <webuijsf:staticText id="campoNombreArchivoDatosExt1Texto1"
                                                    binding="#{ArchivoDatosExt2.campoNombreArchivoDatosExt1Texto1}"
                                                    text="#{ArchivoDatosExt2.archivoDatosExtDataProvider.value['nombre_archivo_datos_ext']}"/>
                                                <webuijsf:button id="campoNombreArchivoDatosExt1Boton3"
                                                    binding="#{ArchivoDatosExt2.campoNombreArchivoDatosExt1Boton3}"
                                                    onClick="#{ArchivoDatosExt2.asistente.scriptCampoNombreArchivoDatosExt1Boton3}"
                                                    rendered="#{ArchivoDatosExt2.asistente.campoNombreArchivoDatosExt1Boton3Rendered}"
                                                    text="#{ArchivoDatosExt2.asistente.textCampoNombreArchivoDatosExt1Boton3}"
                                                    toolTip="#{ArchivoDatosExt2.asistente.toolTipCampoNombreArchivoDatosExt1Boton3}"/>
                                                <webuijsf:message id="messageNombreArchivoDatosExt1"
                                                    for="campoNombreArchivoDatosExt1"/>
                                                <webuijsf:helpInline id="helpInlineNombreArchivoDatosExt1"
                                                    binding="#{ArchivoDatosExt2.helpInlineNombreArchivoDatosExt1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.nombre_archivo_datos_ext.archivo_datos_ext"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdProveedorDatExt1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ArchivoDatosExt2.labelIdProveedorDatExt1}"
                                                    id="labelIdProveedorDatExt1"
                                                    for="campoIdProveedorDatExt1"
                                                    text="proveedor dat ext"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdProveedorDatExt2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdProveedorDatExt1"
                                                    binding="#{ArchivoDatosExt2.campoIdProveedorDatExt1}"
                                                    readOnly="#{ArchivoDatosExt2.gestor.filaNoProcesada}" required="true"
                                                    text="#{ArchivoDatosExt2.asistente.textoCampoIdProveedorDatExt1}"
                                                    toolTip="#{ArchivoDatosExt2.asistente.toolTipCampoIdProveedorDatExt1}"
                                                    validatorExpression="#{ArchivoDatosExt2.campoIdProveedorDatExt1_validate}"/>
                                                <webuijsf:staticText id="campoIdProveedorDatExt1Texto1"
                                                    binding="#{ArchivoDatosExt2.campoIdProveedorDatExt1Texto1}"
                                                    text="#{ArchivoDatosExt2.archivoDatosExtDataProvider.value['codigo_proveedor_dat_ext_1x1y3']}"/>
                                                <webuijsf:button id="campoIdProveedorDatExt1Boton1"
                                                    binding="#{ArchivoDatosExt2.campoIdProveedorDatExt1Boton1}"
                                                    onClick="#{ArchivoDatosExt2.asistente.scriptCampoIdProveedorDatExt1Boton1}"/>
                                                <webuijsf:button id="campoIdProveedorDatExt1Boton3"
                                                    binding="#{ArchivoDatosExt2.campoIdProveedorDatExt1Boton3}"
                                                    onClick="#{ArchivoDatosExt2.asistente.scriptCampoIdProveedorDatExt1Boton2}"
                                                    rendered="#{ArchivoDatosExt2.asistente.campoIdProveedorDatExt1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdProveedorDatExt1"
                                                    for="campoIdProveedorDatExt1"/>
                                                <webuijsf:helpInline id="helpInlineIdProveedorDatExt1"
                                                    binding="#{ArchivoDatosExt2.helpInlineIdProveedorDatExt1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_proveedor_dat_ext.archivo_datos_ext"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdProveedorDatExt3"
                                                rendered="#{ArchivoDatosExt2.asistente.campoIdProveedorDatExt1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ArchivoDatosExt2.labelIdProveedorDatExt2}"
                                                    id="labelIdProveedorDatExt2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre proveedor dat ext"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdProveedorDatExt4"
                                                rendered="#{ArchivoDatosExt2.asistente.campoIdProveedorDatExt1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{ArchivoDatosExt2.campoIdProveedorDatExt1Texto2}"
                                                    text="#{ArchivoDatosExt2.archivoDatosExtDataProvider.value['nombre_proveedor_dat_ext_1x1y4']}"
                                                    id="campoIdProveedorDatExt1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{ArchivoDatosExt2.campoIdProveedorDatExt1Boton2}"
                                                    id="campoIdProveedorDatExt1Boton2"
                                                    onClick="#{ArchivoDatosExt2.asistente.scriptCampoIdProveedorDatExt1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroTipoArcDatExt1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ArchivoDatosExt2.labelNumeroTipoArcDatExt1}"
                                                    id="labelNumeroTipoArcDatExt1"
                                                    for="listaNumeroTipoArcDatExt1"
                                                    text="tipo arc dat ext"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTipoArcDatExt2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroTipoArcDatExt1"
                                                    binding="#{ArchivoDatosExt2.listaNumeroTipoArcDatExt1}"
                                                    converter="#{ArchivoDatosExt2.converterNumeroTipoArcDatExt1}"
                                                    disabled="#{ArchivoDatosExt2.gestor.filaNoProcesada}" required="true"
                                                    items="#{ArchivoDatosExt2.asistente.opcionesListaNumeroTipoArcDatExt1}"
                                                    selected="#{ArchivoDatosExt2.archivoDatosExtDataProvider.value['numero_tipo_arc_dat_ext']}"
                                                    toolTip="BundleParametros.numero_tipo_arc_dat_ext.archivo_datos_ext"/>
                                                <webuijsf:staticText id="listaNumeroTipoArcDatExt1Texto1"
                                                    binding="#{ArchivoDatosExt2.listaNumeroTipoArcDatExt1Texto1}"
                                                    text="#{ArchivoDatosExt2.archivoDatosExtDataProvider.value['codigo_tipo_arc_dat_ext_1x2y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoArcDatExt1"
                                                    for="listaNumeroTipoArcDatExt1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTipoArcDatExt1"
                                                    binding="#{ArchivoDatosExt2.helpInlineNumeroTipoArcDatExt1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_tipo_arc_dat_ext.archivo_datos_ext"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsArchivoDatosExtImportado1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ArchivoDatosExt2.labelEsArchivoDatosExtImportado1}"
                                                    id="labelEsArchivoDatosExtImportado1"
                                                    for="listaEsArchivoDatosExtImportado1"
                                                    text="importado"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsArchivoDatosExtImportado2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsArchivoDatosExtImportado1"
                                                    binding="#{ArchivoDatosExt2.listaEsArchivoDatosExtImportado1}"
                                                    converter="#{ArchivoDatosExt2.converterEsArchivoDatosExtImportado1}"
                                                    disabled="true"
                                                    items="#{ArchivoDatosExt2.asistente.opcionesListaEsArchivoDatosExtImportado1}"
                                                    selected="#{ArchivoDatosExt2.archivoDatosExtDataProvider.value['es_archivo_datos_ext_importado']}"
                                                    toolTip="BundleParametros.es_archivo_datos_ext_importado.archivo_datos_ext"/>
                                                <webuijsf:staticText id="listaEsArchivoDatosExtImportado1Texto1"
                                                    binding="#{ArchivoDatosExt2.listaEsArchivoDatosExtImportado1Texto1}"/>
                                                <webuijsf:message id="messageEsArchivoDatosExtImportado1"
                                                    for="listaEsArchivoDatosExtImportado1"/>
                                                <webuijsf:helpInline id="helpInlineEsArchivoDatosExtImportado1"
                                                    binding="#{ArchivoDatosExt2.helpInlineEsArchivoDatosExtImportado1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_archivo_datos_ext_importado.archivo_datos_ext"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaHoraUltimaCarga1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ArchivoDatosExt2.labelFechaHoraUltimaCarga1}"
                                                    id="labelFechaHoraUltimaCarga1"
                                                    for="campoFechaHoraUltimaCarga1"
                                                    text="fecha hora ultima carga"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaHoraUltimaCarga2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoFechaHoraUltimaCarga1"
                                                    binding="#{ArchivoDatosExt2.campoFechaHoraUltimaCarga1}"
                                                    converter="#{ArchivoDatosExt2.converterFechaHoraUltimaCarga1}"
                                                    readOnly="true"
                                                    text="#{ArchivoDatosExt2.archivoDatosExtDataProvider.value['fecha_hora_ultima_carga']}"
                                                    toolTip="BundleParametros.fecha_hora_ultima_carga.archivo_datos_ext"/>
                                                <webuijsf:staticText id="campoFechaHoraUltimaCarga1Texto1"
                                                    binding="#{ArchivoDatosExt2.campoFechaHoraUltimaCarga1Texto1}"
                                                    converter="#{ArchivoDatosExt2.converterFechaHoraUltimaCarga1}"
                                                    text="#{ArchivoDatosExt2.archivoDatosExtDataProvider.value['fecha_hora_ultima_carga']}"/>
                                                <webuijsf:message id="messageFechaHoraUltimaCarga1"
                                                    for="campoFechaHoraUltimaCarga1"/>
                                                <webuijsf:helpInline id="helpInlineFechaHoraUltimaCarga1"
                                                    binding="#{ArchivoDatosExt2.helpInlineFechaHoraUltimaCarga1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_hora_ultima_carga.archivo_datos_ext"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdUsuarioUltimaCarga1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ArchivoDatosExt2.labelIdUsuarioUltimaCarga1}"
                                                    id="labelIdUsuarioUltimaCarga1"
                                                    for="campoIdUsuarioUltimaCarga1"
                                                    text="usuario ultima carga"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdUsuarioUltimaCarga2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdUsuarioUltimaCarga1"
                                                    binding="#{ArchivoDatosExt2.campoIdUsuarioUltimaCarga1}"
                                                    readOnly="true"
                                                    text="#{ArchivoDatosExt2.asistente.textoCampoIdUsuarioUltimaCarga1}"
                                                    toolTip="#{ArchivoDatosExt2.asistente.toolTipCampoIdUsuarioUltimaCarga1}"
                                                    validatorExpression="#{ArchivoDatosExt2.campoIdUsuarioUltimaCarga1_validate}"/>
                                                <webuijsf:staticText id="campoIdUsuarioUltimaCarga1Texto1"
                                                    binding="#{ArchivoDatosExt2.campoIdUsuarioUltimaCarga1Texto1}"
                                                    text="#{ArchivoDatosExt2.archivoDatosExtDataProvider.value['codigo_usuario_1x3y3']}"/>
                                                <webuijsf:button id="campoIdUsuarioUltimaCarga1Boton1"
                                                    binding="#{ArchivoDatosExt2.campoIdUsuarioUltimaCarga1Boton1}"
                                                    onClick="#{ArchivoDatosExt2.asistente.scriptCampoIdUsuarioUltimaCarga1Boton1}"/>
                                                <webuijsf:button id="campoIdUsuarioUltimaCarga1Boton3"
                                                    binding="#{ArchivoDatosExt2.campoIdUsuarioUltimaCarga1Boton3}"
                                                    onClick="#{ArchivoDatosExt2.asistente.scriptCampoIdUsuarioUltimaCarga1Boton2}"
                                                    rendered="#{ArchivoDatosExt2.asistente.campoIdUsuarioUltimaCarga1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdUsuarioUltimaCarga1"
                                                    for="campoIdUsuarioUltimaCarga1"/>
                                                <webuijsf:helpInline id="helpInlineIdUsuarioUltimaCarga1"
                                                    binding="#{ArchivoDatosExt2.helpInlineIdUsuarioUltimaCarga1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_usuario_ultima_carga.archivo_datos_ext"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdUsuarioUltimaCarga3"
                                                rendered="#{ArchivoDatosExt2.asistente.campoIdUsuarioUltimaCarga1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ArchivoDatosExt2.labelIdUsuarioUltimaCarga2}"
                                                    id="labelIdUsuarioUltimaCarga2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre usuario ultima carga"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdUsuarioUltimaCarga4"
                                                rendered="#{ArchivoDatosExt2.asistente.campoIdUsuarioUltimaCarga1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{ArchivoDatosExt2.campoIdUsuarioUltimaCarga1Texto2}"
                                                    text="#{ArchivoDatosExt2.archivoDatosExtDataProvider.value['nombre_usuario_1x3y4']}"
                                                    id="campoIdUsuarioUltimaCarga1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{ArchivoDatosExt2.campoIdUsuarioUltimaCarga1Boton2}"
                                                    id="campoIdUsuarioUltimaCarga1Boton2"
                                                    onClick="#{ArchivoDatosExt2.asistente.scriptCampoIdUsuarioUltimaCarga1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaHoraUltimaImportacion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ArchivoDatosExt2.labelFechaHoraUltimaImportacion1}"
                                                    id="labelFechaHoraUltimaImportacion1"
                                                    for="campoFechaHoraUltimaImportacion1"
                                                    text="fecha hora ultima importacion"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaHoraUltimaImportacion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoFechaHoraUltimaImportacion1"
                                                    binding="#{ArchivoDatosExt2.campoFechaHoraUltimaImportacion1}"
                                                    converter="#{ArchivoDatosExt2.converterFechaHoraUltimaImportacion1}"
                                                    readOnly="true"
                                                    text="#{ArchivoDatosExt2.archivoDatosExtDataProvider.value['fecha_hora_ultima_importacion']}"
                                                    toolTip="BundleParametros.fecha_hora_ultima_importacion.archivo_datos_ext"/>
                                                <webuijsf:staticText id="campoFechaHoraUltimaImportacion1Texto1"
                                                    binding="#{ArchivoDatosExt2.campoFechaHoraUltimaImportacion1Texto1}"
                                                    converter="#{ArchivoDatosExt2.converterFechaHoraUltimaImportacion1}"
                                                    text="#{ArchivoDatosExt2.archivoDatosExtDataProvider.value['fecha_hora_ultima_importacion']}"/>
                                                <webuijsf:message id="messageFechaHoraUltimaImportacion1"
                                                    for="campoFechaHoraUltimaImportacion1"/>
                                                <webuijsf:helpInline id="helpInlineFechaHoraUltimaImportacion1"
                                                    binding="#{ArchivoDatosExt2.helpInlineFechaHoraUltimaImportacion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_hora_ultima_importacion.archivo_datos_ext"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdUsuarioUltimaImportacion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ArchivoDatosExt2.labelIdUsuarioUltimaImportacion1}"
                                                    id="labelIdUsuarioUltimaImportacion1"
                                                    for="campoIdUsuarioUltimaImportacion1"
                                                    text="usuario ultima importacion"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdUsuarioUltimaImportacion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdUsuarioUltimaImportacion1"
                                                    binding="#{ArchivoDatosExt2.campoIdUsuarioUltimaImportacion1}"
                                                    readOnly="true"
                                                    text="#{ArchivoDatosExt2.asistente.textoCampoIdUsuarioUltimaImportacion1}"
                                                    toolTip="#{ArchivoDatosExt2.asistente.toolTipCampoIdUsuarioUltimaImportacion1}"
                                                    validatorExpression="#{ArchivoDatosExt2.campoIdUsuarioUltimaImportacion1_validate}"/>
                                                <webuijsf:staticText id="campoIdUsuarioUltimaImportacion1Texto1"
                                                    binding="#{ArchivoDatosExt2.campoIdUsuarioUltimaImportacion1Texto1}"
                                                    text="#{ArchivoDatosExt2.archivoDatosExtDataProvider.value['codigo_usuario_1x4y3']}"/>
                                                <webuijsf:button id="campoIdUsuarioUltimaImportacion1Boton1"
                                                    binding="#{ArchivoDatosExt2.campoIdUsuarioUltimaImportacion1Boton1}"
                                                    onClick="#{ArchivoDatosExt2.asistente.scriptCampoIdUsuarioUltimaImportacion1Boton1}"/>
                                                <webuijsf:button id="campoIdUsuarioUltimaImportacion1Boton3"
                                                    binding="#{ArchivoDatosExt2.campoIdUsuarioUltimaImportacion1Boton3}"
                                                    onClick="#{ArchivoDatosExt2.asistente.scriptCampoIdUsuarioUltimaImportacion1Boton2}"
                                                    rendered="#{ArchivoDatosExt2.asistente.campoIdUsuarioUltimaImportacion1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdUsuarioUltimaImportacion1"
                                                    for="campoIdUsuarioUltimaImportacion1"/>
                                                <webuijsf:helpInline id="helpInlineIdUsuarioUltimaImportacion1"
                                                    binding="#{ArchivoDatosExt2.helpInlineIdUsuarioUltimaImportacion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_usuario_ultima_importacion.archivo_datos_ext"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdUsuarioUltimaImportacion3"
                                                rendered="#{ArchivoDatosExt2.asistente.campoIdUsuarioUltimaImportacion1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ArchivoDatosExt2.labelIdUsuarioUltimaImportacion2}"
                                                    id="labelIdUsuarioUltimaImportacion2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre usuario ultima importacion"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdUsuarioUltimaImportacion4"
                                                rendered="#{ArchivoDatosExt2.asistente.campoIdUsuarioUltimaImportacion1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{ArchivoDatosExt2.campoIdUsuarioUltimaImportacion1Texto2}"
                                                    text="#{ArchivoDatosExt2.archivoDatosExtDataProvider.value['nombre_usuario_1x4y4']}"
                                                    id="campoIdUsuarioUltimaImportacion1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{ArchivoDatosExt2.campoIdUsuarioUltimaImportacion1Boton2}"
                                                    id="campoIdUsuarioUltimaImportacion1Boton2"
                                                    onClick="#{ArchivoDatosExt2.asistente.scriptCampoIdUsuarioUltimaImportacion1Boton2}"/>
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
                                                        actionExpression="#{ArchivoDatosExt2.botonIrAlPrimero2_action}"
                                                        binding="#{ArchivoDatosExt2.botonIrAlPrimero2}"
                                                        disabled="#{ArchivoDatosExt2.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero2"
                                                        imageURL="#{ArchivoDatosExt2.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{ArchivoDatosExt2.gestor.scriptIrAlPrimero}"
                                                        text="#{ArchivoDatosExt2.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{ArchivoDatosExt2.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{ArchivoDatosExt2.botonIrAlAnterior2_action}"
                                                        binding="#{ArchivoDatosExt2.botonIrAlAnterior2}"
                                                        disabled="#{ArchivoDatosExt2.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior2"
                                                        imageURL="#{ArchivoDatosExt2.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{ArchivoDatosExt2.gestor.scriptIrAlAnterior}"
                                                        text="#{ArchivoDatosExt2.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{ArchivoDatosExt2.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{ArchivoDatosExt2.botonIrAlSiguiente2_action}"
                                                        binding="#{ArchivoDatosExt2.botonIrAlSiguiente2}"
                                                        disabled="#{ArchivoDatosExt2.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente2"
                                                        imageURL="#{ArchivoDatosExt2.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{ArchivoDatosExt2.gestor.scriptIrAlSiguiente}"
                                                        text="#{ArchivoDatosExt2.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{ArchivoDatosExt2.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{ArchivoDatosExt2.botonIrAlUltimo2_action}"
                                                        binding="#{ArchivoDatosExt2.botonIrAlUltimo2}"
                                                        disabled="#{ArchivoDatosExt2.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo2"
                                                        imageURL="#{ArchivoDatosExt2.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{ArchivoDatosExt2.gestor.scriptIrAlUltimo}"
                                                        text="#{ArchivoDatosExt2.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{ArchivoDatosExt2.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{ArchivoDatosExt2.botonProcesarFila2_action}"
                                                        binding="#{ArchivoDatosExt2.botonProcesarFila2}"
                                                        disabled="#{ArchivoDatosExt2.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila2"
                                                        imageURL="#{ArchivoDatosExt2.gestor.urlImagenProcesar}"
                                                        onClick="#{ArchivoDatosExt2.scriptAbrirVentanaProcesarFila2}"
                                                        rendered="#{ArchivoDatosExt2.asistente.comandoDisponible}"
                                                        text="#{ArchivoDatosExt2.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{ArchivoDatosExt2.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{ArchivoDatosExt2.gestor.mensajeCambiosPorConfirmar}"/>
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
                                                    actionExpression="#{ArchivoDatosExt2.botonAgregar1_action}"
                                                    binding="#{ArchivoDatosExt2.botonAgregar1}"
                                                    disabled="#{ArchivoDatosExt2.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{ArchivoDatosExt2.gestor.scriptAgregar}"
                                                    rendered="#{ArchivoDatosExt2.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ArchivoDatosExt2.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{ArchivoDatosExt2.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{ArchivoDatosExt2.listaFuncionEdicion1}"
                                                    converter="#{ArchivoDatosExt2.converterListaFuncionEdicion1}"
                                                    disabled="#{ArchivoDatosExt2.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{ArchivoDatosExt2.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{ArchivoDatosExt2.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{ArchivoDatosExt2.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{ArchivoDatosExt2.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ArchivoDatosExt2.botonEditar1_action}"
                                                    binding="#{ArchivoDatosExt2.botonEditar1}"
                                                    disabled="#{ArchivoDatosExt2.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{ArchivoDatosExt2.gestor.scriptEditar}"
                                                    rendered="#{ArchivoDatosExt2.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ArchivoDatosExt2.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{ArchivoDatosExt2.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ArchivoDatosExt2.botonEliminar1_action}"
                                                    binding="#{ArchivoDatosExt2.botonEliminar1}"
                                                    disabled="#{ArchivoDatosExt2.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{ArchivoDatosExt2.gestor.scriptEliminar}"
                                                    rendered="#{ArchivoDatosExt2.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ArchivoDatosExt2.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{ArchivoDatosExt2.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ArchivoDatosExt2.botonAplicar1_action}"
                                                    binding="#{ArchivoDatosExt2.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{ArchivoDatosExt2.gestor.scriptAplicar}"
                                                    rendered="#{ArchivoDatosExt2.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ArchivoDatosExt2.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{ArchivoDatosExt2.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ArchivoDatosExt2.botonDeshacer1_action}"
                                                    binding="#{ArchivoDatosExt2.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{ArchivoDatosExt2.gestor.scriptDeshacer}"
                                                    rendered="#{ArchivoDatosExt2.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ArchivoDatosExt2.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{ArchivoDatosExt2.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ArchivoDatosExt2.botonConfirmar1_action}"
                                                    binding="#{ArchivoDatosExt2.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{ArchivoDatosExt2.gestor.scriptConfirmar}"
                                                    rendered="#{ArchivoDatosExt2.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ArchivoDatosExt2.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{ArchivoDatosExt2.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ArchivoDatosExt2.botonDescartar1_action}"
                                                    binding="#{ArchivoDatosExt2.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{ArchivoDatosExt2.gestor.scriptDescartar}"
                                                    rendered="#{ArchivoDatosExt2.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ArchivoDatosExt2.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{ArchivoDatosExt2.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{ArchivoDatosExt2.listaFuncionAccion1}"
                                                    converter="#{ArchivoDatosExt2.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{ArchivoDatosExt2.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{ArchivoDatosExt2.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{ArchivoDatosExt2.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{ArchivoDatosExt2.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ArchivoDatosExt2.botonProcesar1_action}"
                                                    binding="#{ArchivoDatosExt2.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{ArchivoDatosExt2.gestor.scriptProcesar}"
                                                    rendered="#{ArchivoDatosExt2.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ArchivoDatosExt2.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{ArchivoDatosExt2.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ArchivoDatosExt2.botonRefrescar1_action}"
                                                    binding="#{ArchivoDatosExt2.botonRefrescar1}"
                                                    disabled="#{ArchivoDatosExt2.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{ArchivoDatosExt2.gestor.scriptRefrescar}"
                                                    rendered="#{ArchivoDatosExt2.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ArchivoDatosExt2.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{ArchivoDatosExt2.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ArchivoDatosExt2.botonReconsultar1_action}"
                                                    binding="#{ArchivoDatosExt2.botonReconsultar1}"
                                                    disabled="#{ArchivoDatosExt2.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{ArchivoDatosExt2.gestor.scriptReconsultar}"
                                                    rendered="#{ArchivoDatosExt2.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ArchivoDatosExt2.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{ArchivoDatosExt2.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ArchivoDatosExt2.botonRetornar1_action}"
                                                    binding="#{ArchivoDatosExt2.botonRetornar1}"
                                                    disabled="#{ArchivoDatosExt2.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{ArchivoDatosExt2.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{ArchivoDatosExt2.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ArchivoDatosExt2.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{ArchivoDatosExt2.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel125"
                                                rendered="#{ArchivoDatosExt2.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{ArchivoDatosExt2.imageHyperlink1_action}"
                                                    binding="#{ArchivoDatosExt2.imageHyperlink1}"
                                                    disabled="#{ArchivoDatosExt2.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{ArchivoDatosExt2.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{ArchivoDatosExt2.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{ArchivoDatosExt2.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.ArchivoDatosExt2_imageHyperlink1_toolTip}"/>
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
