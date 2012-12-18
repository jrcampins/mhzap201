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
                    focus="#{LogProImpArcExt6.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{LogProImpArcExt6.gestor.preserveFocus}"
                    preserveScroll="#{LogProImpArcExt6.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{LogProImpArcExt6.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | campoIdLogProImpArcExt1 campoIdArchivoDatosExt1 campoCodigoTipoArcDatExt1 listaNumeroTipoArcDatExt1 campoNombreProveedorDatExt1 campoCodigoProveedorDatExt1 campoCodigoArchivoDatosExt1 campoRutaArchivoDatosExt1 listaEsImportado1 campoObservacion1 campoFechaHoraTransaccion1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | | , virtualForm3 | listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{LogProImpArcExt6.breadcrumbs1}" 
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
                                                    rendered="#{LogProImpArcExt6.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{LogProImpArcExt6.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{LogProImpArcExt6.gestor.mensajeDisponible}"
                                                    text="#{LogProImpArcExt6.gestor.mensaje}"
                                                    url="#{LogProImpArcExt6.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            id="gridPanel104"
                                            rendered="#{LogProImpArcExt6.gestor.filaDisponible}"
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
                                                        actionExpression="#{LogProImpArcExt6.botonIrAlPrimero1_action}"
                                                        binding="#{LogProImpArcExt6.botonIrAlPrimero1}"
                                                        disabled="#{LogProImpArcExt6.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero1"
                                                        imageURL="#{LogProImpArcExt6.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{LogProImpArcExt6.gestor.scriptIrAlPrimero}"
                                                        text="#{LogProImpArcExt6.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{LogProImpArcExt6.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogProImpArcExt6.botonIrAlAnterior1_action}"
                                                        binding="#{LogProImpArcExt6.botonIrAlAnterior1}"
                                                        disabled="#{LogProImpArcExt6.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior1"
                                                        imageURL="#{LogProImpArcExt6.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{LogProImpArcExt6.gestor.scriptIrAlAnterior}"
                                                        text="#{LogProImpArcExt6.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{LogProImpArcExt6.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogProImpArcExt6.botonIrAlSiguiente1_action}"
                                                        binding="#{LogProImpArcExt6.botonIrAlSiguiente1}"
                                                        disabled="#{LogProImpArcExt6.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente1"
                                                        imageURL="#{LogProImpArcExt6.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{LogProImpArcExt6.gestor.scriptIrAlSiguiente}"
                                                        text="#{LogProImpArcExt6.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{LogProImpArcExt6.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogProImpArcExt6.botonIrAlUltimo1_action}"
                                                        binding="#{LogProImpArcExt6.botonIrAlUltimo1}"
                                                        disabled="#{LogProImpArcExt6.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo1"
                                                        imageURL="#{LogProImpArcExt6.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{LogProImpArcExt6.gestor.scriptIrAlUltimo}"
                                                        text="#{LogProImpArcExt6.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{LogProImpArcExt6.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogProImpArcExt6.botonProcesarFila1_action}"
                                                        binding="#{LogProImpArcExt6.botonProcesarFila1}"
                                                        disabled="#{LogProImpArcExt6.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila1"
                                                        imageURL="#{LogProImpArcExt6.gestor.urlImagenProcesar}"
                                                        onClick="#{LogProImpArcExt6.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{LogProImpArcExt6.asistente.comandoDisponible}"
                                                        text="#{LogProImpArcExt6.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{LogProImpArcExt6.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{LogProImpArcExt6.gestor.tituloConsulta}"/>
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
                                                    binding="#{LogProImpArcExt6.etiquetaIdentificacionFila1}"
                                                    id="etiquetaIdentificacionFila1"
                                                    text="#{LogProImpArcExt6.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{LogProImpArcExt6.gestor.i18n.toolTipEtiquetaIdentificacionFila}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel113"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoIdentificacionFila1"
                                                    style="font-weight: bold"
                                                    text="#{LogProImpArcExt6.gestor.identificacionFila}"/>
                                                <webuijsf:image
                                                    id="imagenFilaProcesada1"
                                                    toolTip="#{LogProImpArcExt6.gestor.toolTipImagenFilaProcesada}"
                                                    url="#{LogProImpArcExt6.gestor.urlImagenFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPanel114"
                                                rendered="#{LogProImpArcExt6.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProImpArcExt6.etiquetaDenominacionFilaMaestro1}"
                                                    id="etiquetaDenominacionFilaMaestro1"
                                                    text="?"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel115"
                                                rendered="#{LogProImpArcExt6.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoDenominacionFilaMaestro1"
                                                    style="font-weight: bold"
                                                    text="#{LogProImpArcExt6.gestor.denominacionFilaMaestro}"/>
                                                <webuijsf:image
                                                    id="imagenFilaMaestro1"
                                                    url="#{LogProImpArcExt6.gestor.urlImagenMaestroFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdLogProImpArcExt1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProImpArcExt6.labelIdLogProImpArcExt1}"
                                                    id="labelIdLogProImpArcExt1"
                                                    for="campoIdLogProImpArcExt1"
                                                    text="identificaci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdLogProImpArcExt2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdLogProImpArcExt1"
                                                    binding="#{LogProImpArcExt6.campoIdLogProImpArcExt1}"
                                                    converter="#{LogProImpArcExt6.converterIdLogProImpArcExt1}"
                                                    readOnly="true"
                                                    text="#{LogProImpArcExt6.logProImpArcExtDataProvider.value['id_log_pro_imp_arc_ext']}"
                                                    toolTip="BundleParametros.id_log_pro_imp_arc_ext.log_pro_imp_arc_ext"
                                                    validatorExpression="#{LogProImpArcExt6.validatorIdLogProImpArcExt1.validate}"/>
                                                <webuijsf:staticText id="campoIdLogProImpArcExt1Texto1"
                                                    binding="#{LogProImpArcExt6.campoIdLogProImpArcExt1Texto1}"
                                                    text="#{LogProImpArcExt6.logProImpArcExtDataProvider.value['id_log_pro_imp_arc_ext']}"/>
                                                <webuijsf:message id="messageIdLogProImpArcExt1"
                                                    for="campoIdLogProImpArcExt1"/>
                                                <webuijsf:helpInline id="helpInlineIdLogProImpArcExt1"
                                                    binding="#{LogProImpArcExt6.helpInlineIdLogProImpArcExt1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_log_pro_imp_arc_ext.log_pro_imp_arc_ext"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdArchivoDatosExt1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProImpArcExt6.labelIdArchivoDatosExt1}"
                                                    id="labelIdArchivoDatosExt1"
                                                    for="campoIdArchivoDatosExt1"
                                                    text="archivo datos externos"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdArchivoDatosExt2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdArchivoDatosExt1"
                                                    binding="#{LogProImpArcExt6.campoIdArchivoDatosExt1}"
                                                    readOnly="#{LogProImpArcExt6.gestor.filaNoProcesada}"
                                                    text="#{LogProImpArcExt6.asistente.textoCampoIdArchivoDatosExt1}"
                                                    toolTip="#{LogProImpArcExt6.asistente.toolTipCampoIdArchivoDatosExt1}"
                                                    validatorExpression="#{LogProImpArcExt6.campoIdArchivoDatosExt1_validate}"/>
                                                <webuijsf:staticText id="campoIdArchivoDatosExt1Texto1"
                                                    binding="#{LogProImpArcExt6.campoIdArchivoDatosExt1Texto1}"
                                                    text="#{LogProImpArcExt6.logProImpArcExtDataProvider.value['codigo_archivo_datos_ext_1x1y3']}"/>
                                                <webuijsf:button id="campoIdArchivoDatosExt1Boton1"
                                                    binding="#{LogProImpArcExt6.campoIdArchivoDatosExt1Boton1}"
                                                    onClick="#{LogProImpArcExt6.asistente.scriptCampoIdArchivoDatosExt1Boton1}"/>
                                                <webuijsf:button id="campoIdArchivoDatosExt1Boton3"
                                                    binding="#{LogProImpArcExt6.campoIdArchivoDatosExt1Boton3}"
                                                    onClick="#{LogProImpArcExt6.asistente.scriptCampoIdArchivoDatosExt1Boton2}"
                                                    rendered="#{LogProImpArcExt6.asistente.campoIdArchivoDatosExt1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdArchivoDatosExt1"
                                                    for="campoIdArchivoDatosExt1"/>
                                                <webuijsf:helpInline id="helpInlineIdArchivoDatosExt1"
                                                    binding="#{LogProImpArcExt6.helpInlineIdArchivoDatosExt1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_archivo_datos_ext.log_pro_imp_arc_ext"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdArchivoDatosExt3"
                                                rendered="#{LogProImpArcExt6.asistente.campoIdArchivoDatosExt1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProImpArcExt6.labelIdArchivoDatosExt2}"
                                                    id="labelIdArchivoDatosExt2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre archivo datos externos"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdArchivoDatosExt4"
                                                rendered="#{LogProImpArcExt6.asistente.campoIdArchivoDatosExt1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{LogProImpArcExt6.campoIdArchivoDatosExt1Texto2}"
                                                    text="#{LogProImpArcExt6.logProImpArcExtDataProvider.value['nombre_archivo_datos_ext_1x1y4']}"
                                                    id="campoIdArchivoDatosExt1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{LogProImpArcExt6.campoIdArchivoDatosExt1Boton2}"
                                                    id="campoIdArchivoDatosExt1Boton2"
                                                    onClick="#{LogProImpArcExt6.asistente.scriptCampoIdArchivoDatosExt1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridCodigoTipoArcDatExt1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProImpArcExt6.labelCodigoTipoArcDatExt1}"
                                                    id="labelCodigoTipoArcDatExt1"
                                                    for="campoCodigoTipoArcDatExt1"
                                                    text="c&#243;digo tipo archivo datos externos"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridCodigoTipoArcDatExt2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoCodigoTipoArcDatExt1"
                                                    binding="#{LogProImpArcExt6.campoCodigoTipoArcDatExt1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogProImpArcExt6.gestor.filaNoProcesada}"
                                                    text="#{LogProImpArcExt6.logProImpArcExtDataProvider.value['codigo_tipo_arc_dat_ext']}"
                                                    toolTip="BundleParametros.codigo_tipo_arc_dat_ext.log_pro_imp_arc_ext"
                                                    validatorExpression="#{LogProImpArcExt6.validatorCodigoTipoArcDatExt1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoTipoArcDatExt1Texto1"
                                                    binding="#{LogProImpArcExt6.campoCodigoTipoArcDatExt1Texto1}"
                                                    text="#{LogProImpArcExt6.logProImpArcExtDataProvider.value['codigo_tipo_arc_dat_ext']}"/>
                                                <webuijsf:message id="messageCodigoTipoArcDatExt1"
                                                    for="campoCodigoTipoArcDatExt1"/>
                                                <webuijsf:helpInline id="helpInlineCodigoTipoArcDatExt1"
                                                    binding="#{LogProImpArcExt6.helpInlineCodigoTipoArcDatExt1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.codigo_tipo_arc_dat_ext.log_pro_imp_arc_ext"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroTipoArcDatExt1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProImpArcExt6.labelNumeroTipoArcDatExt1}"
                                                    id="labelNumeroTipoArcDatExt1"
                                                    for="listaNumeroTipoArcDatExt1"
                                                    text="tipo archivo datos externos"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTipoArcDatExt2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroTipoArcDatExt1"
                                                    binding="#{LogProImpArcExt6.listaNumeroTipoArcDatExt1}"
                                                    converter="#{LogProImpArcExt6.converterNumeroTipoArcDatExt1}"
                                                    disabled="#{LogProImpArcExt6.gestor.filaNoProcesada}"
                                                    items="#{LogProImpArcExt6.asistente.opcionesListaNumeroTipoArcDatExt1}"
                                                    selected="#{LogProImpArcExt6.logProImpArcExtDataProvider.value['numero_tipo_arc_dat_ext']}"
                                                    toolTip="BundleParametros.numero_tipo_arc_dat_ext.log_pro_imp_arc_ext"/>
                                                <webuijsf:staticText id="listaNumeroTipoArcDatExt1Texto1"
                                                    binding="#{LogProImpArcExt6.listaNumeroTipoArcDatExt1Texto1}"
                                                    text="#{LogProImpArcExt6.logProImpArcExtDataProvider.value['codigo_tipo_arc_dat_ext_1x2y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoArcDatExt1"
                                                    for="listaNumeroTipoArcDatExt1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTipoArcDatExt1"
                                                    binding="#{LogProImpArcExt6.helpInlineNumeroTipoArcDatExt1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_tipo_arc_dat_ext.log_pro_imp_arc_ext"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNombreProveedorDatExt1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProImpArcExt6.labelNombreProveedorDatExt1}"
                                                    id="labelNombreProveedorDatExt1"
                                                    for="campoNombreProveedorDatExt1"
                                                    text="nombre proveedor datos externos"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNombreProveedorDatExt2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoNombreProveedorDatExt1"
                                                    binding="#{LogProImpArcExt6.campoNombreProveedorDatExt1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogProImpArcExt6.gestor.filaNoProcesada}"
                                                    text="#{LogProImpArcExt6.logProImpArcExtDataProvider.value['nombre_proveedor_dat_ext']}"
                                                    toolTip="BundleParametros.nombre_proveedor_dat_ext.log_pro_imp_arc_ext"
                                                    validatorExpression="#{LogProImpArcExt6.validatorNombreProveedorDatExt1.validate}"/>
                                                <webuijsf:staticText id="campoNombreProveedorDatExt1Texto1"
                                                    binding="#{LogProImpArcExt6.campoNombreProveedorDatExt1Texto1}"
                                                    text="#{LogProImpArcExt6.logProImpArcExtDataProvider.value['nombre_proveedor_dat_ext']}"/>
                                                <webuijsf:message id="messageNombreProveedorDatExt1"
                                                    for="campoNombreProveedorDatExt1"/>
                                                <webuijsf:helpInline id="helpInlineNombreProveedorDatExt1"
                                                    binding="#{LogProImpArcExt6.helpInlineNombreProveedorDatExt1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.nombre_proveedor_dat_ext.log_pro_imp_arc_ext"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridCodigoProveedorDatExt1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProImpArcExt6.labelCodigoProveedorDatExt1}"
                                                    id="labelCodigoProveedorDatExt1"
                                                    for="campoCodigoProveedorDatExt1"
                                                    text="c&#243;digo proveedor datos externos"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridCodigoProveedorDatExt2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoCodigoProveedorDatExt1"
                                                    binding="#{LogProImpArcExt6.campoCodigoProveedorDatExt1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogProImpArcExt6.gestor.filaNoProcesada}"
                                                    text="#{LogProImpArcExt6.logProImpArcExtDataProvider.value['codigo_proveedor_dat_ext']}"
                                                    toolTip="BundleParametros.codigo_proveedor_dat_ext.log_pro_imp_arc_ext"
                                                    validatorExpression="#{LogProImpArcExt6.validatorCodigoProveedorDatExt1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoProveedorDatExt1Texto1"
                                                    binding="#{LogProImpArcExt6.campoCodigoProveedorDatExt1Texto1}"
                                                    text="#{LogProImpArcExt6.logProImpArcExtDataProvider.value['codigo_proveedor_dat_ext']}"/>
                                                <webuijsf:message id="messageCodigoProveedorDatExt1"
                                                    for="campoCodigoProveedorDatExt1"/>
                                                <webuijsf:helpInline id="helpInlineCodigoProveedorDatExt1"
                                                    binding="#{LogProImpArcExt6.helpInlineCodigoProveedorDatExt1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.codigo_proveedor_dat_ext.log_pro_imp_arc_ext"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridCodigoArchivoDatosExt1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProImpArcExt6.labelCodigoArchivoDatosExt1}"
                                                    id="labelCodigoArchivoDatosExt1"
                                                    for="campoCodigoArchivoDatosExt1"
                                                    text="c&#243;digo archivo datos externos"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridCodigoArchivoDatosExt2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoCodigoArchivoDatosExt1"
                                                    binding="#{LogProImpArcExt6.campoCodigoArchivoDatosExt1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogProImpArcExt6.gestor.filaNoProcesada}"
                                                    text="#{LogProImpArcExt6.logProImpArcExtDataProvider.value['codigo_archivo_datos_ext']}"
                                                    toolTip="BundleParametros.codigo_archivo_datos_ext.log_pro_imp_arc_ext"
                                                    validatorExpression="#{LogProImpArcExt6.validatorCodigoArchivoDatosExt1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoArchivoDatosExt1Texto1"
                                                    binding="#{LogProImpArcExt6.campoCodigoArchivoDatosExt1Texto1}"
                                                    text="#{LogProImpArcExt6.logProImpArcExtDataProvider.value['codigo_archivo_datos_ext']}"/>
                                                <webuijsf:message id="messageCodigoArchivoDatosExt1"
                                                    for="campoCodigoArchivoDatosExt1"/>
                                                <webuijsf:helpInline id="helpInlineCodigoArchivoDatosExt1"
                                                    binding="#{LogProImpArcExt6.helpInlineCodigoArchivoDatosExt1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.codigo_archivo_datos_ext.log_pro_imp_arc_ext"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridRutaArchivoDatosExt1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProImpArcExt6.labelRutaArchivoDatosExt1}"
                                                    id="labelRutaArchivoDatosExt1"
                                                    for="campoRutaArchivoDatosExt1"
                                                    text="ruta archivo datos externos"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridRutaArchivoDatosExt2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoRutaArchivoDatosExt1"
                                                    binding="#{LogProImpArcExt6.campoRutaArchivoDatosExt1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogProImpArcExt6.gestor.filaNoProcesada}"
                                                    text="#{LogProImpArcExt6.logProImpArcExtDataProvider.value['ruta_archivo_datos_ext']}"
                                                    toolTip="BundleParametros.ruta_archivo_datos_ext.log_pro_imp_arc_ext"
                                                    validatorExpression="#{LogProImpArcExt6.validatorRutaArchivoDatosExt1.validate}"/>
                                                <webuijsf:staticText id="campoRutaArchivoDatosExt1Texto1"
                                                    binding="#{LogProImpArcExt6.campoRutaArchivoDatosExt1Texto1}"
                                                    text="#{LogProImpArcExt6.logProImpArcExtDataProvider.value['ruta_archivo_datos_ext']}"/>
                                                <webuijsf:message id="messageRutaArchivoDatosExt1"
                                                    for="campoRutaArchivoDatosExt1"/>
                                                <webuijsf:helpInline id="helpInlineRutaArchivoDatosExt1"
                                                    binding="#{LogProImpArcExt6.helpInlineRutaArchivoDatosExt1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.ruta_archivo_datos_ext.log_pro_imp_arc_ext"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsImportado1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProImpArcExt6.labelEsImportado1}"
                                                    id="labelEsImportado1"
                                                    for="listaEsImportado1"
                                                    text="importado"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsImportado2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsImportado1"
                                                    binding="#{LogProImpArcExt6.listaEsImportado1}"
                                                    converter="#{LogProImpArcExt6.converterEsImportado1}"
                                                    disabled="#{LogProImpArcExt6.gestor.filaNoProcesada}" required="true"
                                                    items="#{LogProImpArcExt6.asistente.opcionesListaEsImportado1}"
                                                    selected="#{LogProImpArcExt6.logProImpArcExtDataProvider.value['es_importado']}"
                                                    toolTip="BundleParametros.es_importado.log_pro_imp_arc_ext"/>
                                                <webuijsf:staticText id="listaEsImportado1Texto1"
                                                    binding="#{LogProImpArcExt6.listaEsImportado1Texto1}"/>
                                                <webuijsf:message id="messageEsImportado1"
                                                    for="listaEsImportado1"/>
                                                <webuijsf:helpInline id="helpInlineEsImportado1"
                                                    binding="#{LogProImpArcExt6.helpInlineEsImportado1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_importado.log_pro_imp_arc_ext"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridObservacion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProImpArcExt6.labelObservacion1}"
                                                    id="labelObservacion1"
                                                    for="campoObservacion1"
                                                    text="observaci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridObservacion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoObservacion1"
                                                    binding="#{LogProImpArcExt6.campoObservacion1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogProImpArcExt6.gestor.filaNoProcesada}"
                                                    text="#{LogProImpArcExt6.logProImpArcExtDataProvider.value['observacion']}"
                                                    toolTip="BundleParametros.observacion.log_pro_imp_arc_ext"
                                                    validatorExpression="#{LogProImpArcExt6.validatorObservacion1.validate}"/>
                                                <webuijsf:staticText id="campoObservacion1Texto1"
                                                    binding="#{LogProImpArcExt6.campoObservacion1Texto1}"
                                                    text="#{LogProImpArcExt6.logProImpArcExtDataProvider.value['observacion']}"/>
                                                <webuijsf:message id="messageObservacion1"
                                                    for="campoObservacion1"/>
                                                <webuijsf:helpInline id="helpInlineObservacion1"
                                                    binding="#{LogProImpArcExt6.helpInlineObservacion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.observacion.log_pro_imp_arc_ext"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaHoraTransaccion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProImpArcExt6.labelFechaHoraTransaccion1}"
                                                    id="labelFechaHoraTransaccion1"
                                                    for="campoFechaHoraTransaccion1"
                                                    text="fecha hora transacci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaHoraTransaccion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoFechaHoraTransaccion1"
                                                    binding="#{LogProImpArcExt6.campoFechaHoraTransaccion1}"
                                                    converter="#{LogProImpArcExt6.converterFechaHoraTransaccion1}"
                                                    readOnly="#{LogProImpArcExt6.gestor.filaNoProcesada}" required="true"
                                                    text="#{LogProImpArcExt6.logProImpArcExtDataProvider.value['fecha_hora_transaccion']}"
                                                    toolTip="BundleParametros.fecha_hora_transaccion.log_pro_imp_arc_ext"/>
                                                <webuijsf:staticText id="campoFechaHoraTransaccion1Texto1"
                                                    binding="#{LogProImpArcExt6.campoFechaHoraTransaccion1Texto1}"
                                                    converter="#{LogProImpArcExt6.converterFechaHoraTransaccion1}"
                                                    text="#{LogProImpArcExt6.logProImpArcExtDataProvider.value['fecha_hora_transaccion']}"/>
                                                <webuijsf:message id="messageFechaHoraTransaccion1"
                                                    for="campoFechaHoraTransaccion1"/>
                                                <webuijsf:helpInline id="helpInlineFechaHoraTransaccion1"
                                                    binding="#{LogProImpArcExt6.helpInlineFechaHoraTransaccion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_hora_transaccion.log_pro_imp_arc_ext"
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
                                                        actionExpression="#{LogProImpArcExt6.botonIrAlPrimero2_action}"
                                                        binding="#{LogProImpArcExt6.botonIrAlPrimero2}"
                                                        disabled="#{LogProImpArcExt6.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero2"
                                                        imageURL="#{LogProImpArcExt6.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{LogProImpArcExt6.gestor.scriptIrAlPrimero}"
                                                        text="#{LogProImpArcExt6.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{LogProImpArcExt6.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogProImpArcExt6.botonIrAlAnterior2_action}"
                                                        binding="#{LogProImpArcExt6.botonIrAlAnterior2}"
                                                        disabled="#{LogProImpArcExt6.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior2"
                                                        imageURL="#{LogProImpArcExt6.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{LogProImpArcExt6.gestor.scriptIrAlAnterior}"
                                                        text="#{LogProImpArcExt6.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{LogProImpArcExt6.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogProImpArcExt6.botonIrAlSiguiente2_action}"
                                                        binding="#{LogProImpArcExt6.botonIrAlSiguiente2}"
                                                        disabled="#{LogProImpArcExt6.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente2"
                                                        imageURL="#{LogProImpArcExt6.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{LogProImpArcExt6.gestor.scriptIrAlSiguiente}"
                                                        text="#{LogProImpArcExt6.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{LogProImpArcExt6.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogProImpArcExt6.botonIrAlUltimo2_action}"
                                                        binding="#{LogProImpArcExt6.botonIrAlUltimo2}"
                                                        disabled="#{LogProImpArcExt6.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo2"
                                                        imageURL="#{LogProImpArcExt6.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{LogProImpArcExt6.gestor.scriptIrAlUltimo}"
                                                        text="#{LogProImpArcExt6.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{LogProImpArcExt6.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogProImpArcExt6.botonProcesarFila2_action}"
                                                        binding="#{LogProImpArcExt6.botonProcesarFila2}"
                                                        disabled="#{LogProImpArcExt6.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila2"
                                                        imageURL="#{LogProImpArcExt6.gestor.urlImagenProcesar}"
                                                        onClick="#{LogProImpArcExt6.scriptAbrirVentanaProcesarFila2}"
                                                        rendered="#{LogProImpArcExt6.asistente.comandoDisponible}"
                                                        text="#{LogProImpArcExt6.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{LogProImpArcExt6.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{LogProImpArcExt6.gestor.mensajeCambiosPorConfirmar}"/>
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
                                                    actionExpression="#{LogProImpArcExt6.botonAgregar1_action}"
                                                    binding="#{LogProImpArcExt6.botonAgregar1}"
                                                    disabled="#{LogProImpArcExt6.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{LogProImpArcExt6.gestor.scriptAgregar}"
                                                    rendered="#{LogProImpArcExt6.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProImpArcExt6.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{LogProImpArcExt6.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{LogProImpArcExt6.listaFuncionEdicion1}"
                                                    converter="#{LogProImpArcExt6.converterListaFuncionEdicion1}"
                                                    disabled="#{LogProImpArcExt6.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{LogProImpArcExt6.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{LogProImpArcExt6.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{LogProImpArcExt6.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{LogProImpArcExt6.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProImpArcExt6.botonEditar1_action}"
                                                    binding="#{LogProImpArcExt6.botonEditar1}"
                                                    disabled="#{LogProImpArcExt6.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{LogProImpArcExt6.gestor.scriptEditar}"
                                                    rendered="#{LogProImpArcExt6.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProImpArcExt6.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{LogProImpArcExt6.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProImpArcExt6.botonEliminar1_action}"
                                                    binding="#{LogProImpArcExt6.botonEliminar1}"
                                                    disabled="#{LogProImpArcExt6.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{LogProImpArcExt6.gestor.scriptEliminar}"
                                                    rendered="#{LogProImpArcExt6.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProImpArcExt6.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{LogProImpArcExt6.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProImpArcExt6.botonAplicar1_action}"
                                                    binding="#{LogProImpArcExt6.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{LogProImpArcExt6.gestor.scriptAplicar}"
                                                    rendered="#{LogProImpArcExt6.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProImpArcExt6.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{LogProImpArcExt6.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProImpArcExt6.botonDeshacer1_action}"
                                                    binding="#{LogProImpArcExt6.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{LogProImpArcExt6.gestor.scriptDeshacer}"
                                                    rendered="#{LogProImpArcExt6.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProImpArcExt6.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{LogProImpArcExt6.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProImpArcExt6.botonConfirmar1_action}"
                                                    binding="#{LogProImpArcExt6.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{LogProImpArcExt6.gestor.scriptConfirmar}"
                                                    rendered="#{LogProImpArcExt6.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProImpArcExt6.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{LogProImpArcExt6.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProImpArcExt6.botonDescartar1_action}"
                                                    binding="#{LogProImpArcExt6.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{LogProImpArcExt6.gestor.scriptDescartar}"
                                                    rendered="#{LogProImpArcExt6.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProImpArcExt6.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{LogProImpArcExt6.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{LogProImpArcExt6.listaFuncionAccion1}"
                                                    converter="#{LogProImpArcExt6.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{LogProImpArcExt6.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{LogProImpArcExt6.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{LogProImpArcExt6.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{LogProImpArcExt6.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProImpArcExt6.botonProcesar1_action}"
                                                    binding="#{LogProImpArcExt6.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{LogProImpArcExt6.gestor.scriptProcesar}"
                                                    rendered="#{LogProImpArcExt6.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProImpArcExt6.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{LogProImpArcExt6.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProImpArcExt6.botonRefrescar1_action}"
                                                    binding="#{LogProImpArcExt6.botonRefrescar1}"
                                                    disabled="#{LogProImpArcExt6.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{LogProImpArcExt6.gestor.scriptRefrescar}"
                                                    rendered="#{LogProImpArcExt6.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProImpArcExt6.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{LogProImpArcExt6.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProImpArcExt6.botonReconsultar1_action}"
                                                    binding="#{LogProImpArcExt6.botonReconsultar1}"
                                                    disabled="#{LogProImpArcExt6.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{LogProImpArcExt6.gestor.scriptReconsultar}"
                                                    rendered="#{LogProImpArcExt6.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProImpArcExt6.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{LogProImpArcExt6.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProImpArcExt6.botonRetornar1_action}"
                                                    binding="#{LogProImpArcExt6.botonRetornar1}"
                                                    disabled="#{LogProImpArcExt6.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{LogProImpArcExt6.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{LogProImpArcExt6.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProImpArcExt6.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{LogProImpArcExt6.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel125"
                                                rendered="#{LogProImpArcExt6.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{LogProImpArcExt6.imageHyperlink1_action}"
                                                    binding="#{LogProImpArcExt6.imageHyperlink1}"
                                                    disabled="#{LogProImpArcExt6.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{LogProImpArcExt6.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{LogProImpArcExt6.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{LogProImpArcExt6.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.LogProImpArcExt6_imageHyperlink1_toolTip}"/>
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
