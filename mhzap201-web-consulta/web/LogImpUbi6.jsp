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
                    focus="#{LogImpUbi6.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{LogImpUbi6.gestor.preserveFocus}"
                    preserveScroll="#{LogImpUbi6.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{LogImpUbi6.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | campoIdLogImpUbi1 campoCodigo1 campoUbicacion1 campoTipoUbicacion1 campoTipoArea1 campoCodigoUbicacionSuperior1 listaEsImportado1 campoObservacion1 campoFechaHoraTransaccion1 campoNombreArchivo1 campoCodigoArchivo1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | | , virtualForm3 | listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{LogImpUbi6.breadcrumbs1}" 
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
                                                    rendered="#{LogImpUbi6.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{LogImpUbi6.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{LogImpUbi6.gestor.mensajeDisponible}"
                                                    text="#{LogImpUbi6.gestor.mensaje}"
                                                    url="#{LogImpUbi6.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            id="gridPanel104"
                                            rendered="#{LogImpUbi6.gestor.filaDisponible}"
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
                                                        actionExpression="#{LogImpUbi6.botonIrAlPrimero1_action}"
                                                        binding="#{LogImpUbi6.botonIrAlPrimero1}"
                                                        disabled="#{LogImpUbi6.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero1"
                                                        imageURL="#{LogImpUbi6.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{LogImpUbi6.gestor.scriptIrAlPrimero}"
                                                        text="#{LogImpUbi6.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{LogImpUbi6.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpUbi6.botonIrAlAnterior1_action}"
                                                        binding="#{LogImpUbi6.botonIrAlAnterior1}"
                                                        disabled="#{LogImpUbi6.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior1"
                                                        imageURL="#{LogImpUbi6.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{LogImpUbi6.gestor.scriptIrAlAnterior}"
                                                        text="#{LogImpUbi6.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{LogImpUbi6.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpUbi6.botonIrAlSiguiente1_action}"
                                                        binding="#{LogImpUbi6.botonIrAlSiguiente1}"
                                                        disabled="#{LogImpUbi6.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente1"
                                                        imageURL="#{LogImpUbi6.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{LogImpUbi6.gestor.scriptIrAlSiguiente}"
                                                        text="#{LogImpUbi6.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{LogImpUbi6.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpUbi6.botonIrAlUltimo1_action}"
                                                        binding="#{LogImpUbi6.botonIrAlUltimo1}"
                                                        disabled="#{LogImpUbi6.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo1"
                                                        imageURL="#{LogImpUbi6.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{LogImpUbi6.gestor.scriptIrAlUltimo}"
                                                        text="#{LogImpUbi6.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{LogImpUbi6.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpUbi6.botonProcesarFila1_action}"
                                                        binding="#{LogImpUbi6.botonProcesarFila1}"
                                                        disabled="#{LogImpUbi6.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila1"
                                                        imageURL="#{LogImpUbi6.gestor.urlImagenProcesar}"
                                                        onClick="#{LogImpUbi6.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{LogImpUbi6.asistente.comandoDisponible}"
                                                        text="#{LogImpUbi6.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{LogImpUbi6.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{LogImpUbi6.gestor.tituloConsulta}"/>
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
                                                    binding="#{LogImpUbi6.etiquetaIdentificacionFila1}"
                                                    id="etiquetaIdentificacionFila1"
                                                    text="#{LogImpUbi6.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{LogImpUbi6.gestor.i18n.toolTipEtiquetaIdentificacionFila}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel113"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoIdentificacionFila1"
                                                    style="font-weight: bold"
                                                    text="#{LogImpUbi6.gestor.identificacionFila}"/>
                                                <webuijsf:image
                                                    id="imagenFilaProcesada1"
                                                    toolTip="#{LogImpUbi6.gestor.toolTipImagenFilaProcesada}"
                                                    url="#{LogImpUbi6.gestor.urlImagenFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPanel114"
                                                rendered="#{LogImpUbi6.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpUbi6.etiquetaDenominacionFilaMaestro1}"
                                                    id="etiquetaDenominacionFilaMaestro1"
                                                    text="?"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel115"
                                                rendered="#{LogImpUbi6.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoDenominacionFilaMaestro1"
                                                    style="font-weight: bold"
                                                    text="#{LogImpUbi6.gestor.denominacionFilaMaestro}"/>
                                                <webuijsf:image
                                                    id="imagenFilaMaestro1"
                                                    url="#{LogImpUbi6.gestor.urlImagenMaestroFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdLogImpUbi1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpUbi6.labelIdLogImpUbi1}"
                                                    id="labelIdLogImpUbi1"
                                                    for="campoIdLogImpUbi1"
                                                    text="identificaci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdLogImpUbi2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdLogImpUbi1"
                                                    binding="#{LogImpUbi6.campoIdLogImpUbi1}"
                                                    converter="#{LogImpUbi6.converterIdLogImpUbi1}"
                                                    readOnly="true"
                                                    text="#{LogImpUbi6.logImpUbiDataProvider.value['id_log_imp_ubi']}"
                                                    toolTip="BundleParametros.id_log_imp_ubi.log_imp_ubi"
                                                    validatorExpression="#{LogImpUbi6.validatorIdLogImpUbi1.validate}"/>
                                                <webuijsf:staticText id="campoIdLogImpUbi1Texto1"
                                                    binding="#{LogImpUbi6.campoIdLogImpUbi1Texto1}"
                                                    text="#{LogImpUbi6.logImpUbiDataProvider.value['id_log_imp_ubi']}"/>
                                                <webuijsf:message id="messageIdLogImpUbi1"
                                                    for="campoIdLogImpUbi1"/>
                                                <webuijsf:helpInline id="helpInlineIdLogImpUbi1"
                                                    binding="#{LogImpUbi6.helpInlineIdLogImpUbi1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_log_imp_ubi.log_imp_ubi"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridCodigo1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpUbi6.labelCodigo1}"
                                                    id="labelCodigo1"
                                                    for="campoCodigo1"
                                                    text="c&#243;digo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridCodigo2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoCodigo1"
                                                    binding="#{LogImpUbi6.campoCodigo1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpUbi6.gestor.filaNoProcesada}"
                                                    text="#{LogImpUbi6.logImpUbiDataProvider.value['codigo']}"
                                                    toolTip="BundleParametros.codigo.log_imp_ubi"
                                                    validatorExpression="#{LogImpUbi6.validatorCodigo1.validate}"/>
                                                <webuijsf:staticText id="campoCodigo1Texto1"
                                                    binding="#{LogImpUbi6.campoCodigo1Texto1}"
                                                    text="#{LogImpUbi6.logImpUbiDataProvider.value['codigo']}"/>
                                                <webuijsf:message id="messageCodigo1"
                                                    for="campoCodigo1"/>
                                                <webuijsf:helpInline id="helpInlineCodigo1"
                                                    binding="#{LogImpUbi6.helpInlineCodigo1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.codigo.log_imp_ubi"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridUbicacion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpUbi6.labelUbicacion1}"
                                                    id="labelUbicacion1"
                                                    for="campoUbicacion1"
                                                    text="ubicaci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridUbicacion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoUbicacion1"
                                                    binding="#{LogImpUbi6.campoUbicacion1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpUbi6.gestor.filaNoProcesada}"
                                                    text="#{LogImpUbi6.logImpUbiDataProvider.value['ubicacion']}"
                                                    toolTip="BundleParametros.ubicacion.log_imp_ubi"
                                                    validatorExpression="#{LogImpUbi6.validatorUbicacion1.validate}"/>
                                                <webuijsf:staticText id="campoUbicacion1Texto1"
                                                    binding="#{LogImpUbi6.campoUbicacion1Texto1}"
                                                    text="#{LogImpUbi6.logImpUbiDataProvider.value['ubicacion']}"/>
                                                <webuijsf:message id="messageUbicacion1"
                                                    for="campoUbicacion1"/>
                                                <webuijsf:helpInline id="helpInlineUbicacion1"
                                                    binding="#{LogImpUbi6.helpInlineUbicacion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.ubicacion.log_imp_ubi"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridTipoUbicacion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpUbi6.labelTipoUbicacion1}"
                                                    id="labelTipoUbicacion1"
                                                    for="campoTipoUbicacion1"
                                                    text="tipo ubicaci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridTipoUbicacion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoTipoUbicacion1"
                                                    binding="#{LogImpUbi6.campoTipoUbicacion1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpUbi6.gestor.filaNoProcesada}"
                                                    text="#{LogImpUbi6.logImpUbiDataProvider.value['tipo_ubicacion']}"
                                                    toolTip="BundleParametros.tipo_ubicacion.log_imp_ubi"
                                                    validatorExpression="#{LogImpUbi6.validatorTipoUbicacion1.validate}"/>
                                                <webuijsf:staticText id="campoTipoUbicacion1Texto1"
                                                    binding="#{LogImpUbi6.campoTipoUbicacion1Texto1}"
                                                    text="#{LogImpUbi6.logImpUbiDataProvider.value['tipo_ubicacion']}"/>
                                                <webuijsf:message id="messageTipoUbicacion1"
                                                    for="campoTipoUbicacion1"/>
                                                <webuijsf:helpInline id="helpInlineTipoUbicacion1"
                                                    binding="#{LogImpUbi6.helpInlineTipoUbicacion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.tipo_ubicacion.log_imp_ubi"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridTipoArea1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpUbi6.labelTipoArea1}"
                                                    id="labelTipoArea1"
                                                    for="campoTipoArea1"
                                                    text="tipo area"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridTipoArea2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoTipoArea1"
                                                    binding="#{LogImpUbi6.campoTipoArea1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpUbi6.gestor.filaNoProcesada}"
                                                    text="#{LogImpUbi6.logImpUbiDataProvider.value['tipo_area']}"
                                                    toolTip="BundleParametros.tipo_area.log_imp_ubi"
                                                    validatorExpression="#{LogImpUbi6.validatorTipoArea1.validate}"/>
                                                <webuijsf:staticText id="campoTipoArea1Texto1"
                                                    binding="#{LogImpUbi6.campoTipoArea1Texto1}"
                                                    text="#{LogImpUbi6.logImpUbiDataProvider.value['tipo_area']}"/>
                                                <webuijsf:message id="messageTipoArea1"
                                                    for="campoTipoArea1"/>
                                                <webuijsf:helpInline id="helpInlineTipoArea1"
                                                    binding="#{LogImpUbi6.helpInlineTipoArea1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.tipo_area.log_imp_ubi"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridCodigoUbicacionSuperior1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpUbi6.labelCodigoUbicacionSuperior1}"
                                                    id="labelCodigoUbicacionSuperior1"
                                                    for="campoCodigoUbicacionSuperior1"
                                                    text="c&#243;digo ubicaci&#243;n superior"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridCodigoUbicacionSuperior2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoCodigoUbicacionSuperior1"
                                                    binding="#{LogImpUbi6.campoCodigoUbicacionSuperior1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpUbi6.gestor.filaNoProcesada}"
                                                    text="#{LogImpUbi6.logImpUbiDataProvider.value['codigo_ubicacion_superior']}"
                                                    toolTip="BundleParametros.codigo_ubicacion_superior.log_imp_ubi"
                                                    validatorExpression="#{LogImpUbi6.validatorCodigoUbicacionSuperior1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoUbicacionSuperior1Texto1"
                                                    binding="#{LogImpUbi6.campoCodigoUbicacionSuperior1Texto1}"
                                                    text="#{LogImpUbi6.logImpUbiDataProvider.value['codigo_ubicacion_superior']}"/>
                                                <webuijsf:message id="messageCodigoUbicacionSuperior1"
                                                    for="campoCodigoUbicacionSuperior1"/>
                                                <webuijsf:helpInline id="helpInlineCodigoUbicacionSuperior1"
                                                    binding="#{LogImpUbi6.helpInlineCodigoUbicacionSuperior1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.codigo_ubicacion_superior.log_imp_ubi"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsImportado1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpUbi6.labelEsImportado1}"
                                                    id="labelEsImportado1"
                                                    for="listaEsImportado1"
                                                    text="importado"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsImportado2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsImportado1"
                                                    binding="#{LogImpUbi6.listaEsImportado1}"
                                                    converter="#{LogImpUbi6.converterEsImportado1}"
                                                    disabled="#{LogImpUbi6.gestor.filaNoProcesada}" required="true"
                                                    items="#{LogImpUbi6.asistente.opcionesListaEsImportado1}"
                                                    selected="#{LogImpUbi6.logImpUbiDataProvider.value['es_importado']}"
                                                    toolTip="BundleParametros.es_importado.log_imp_ubi"/>
                                                <webuijsf:staticText id="listaEsImportado1Texto1"
                                                    binding="#{LogImpUbi6.listaEsImportado1Texto1}"/>
                                                <webuijsf:message id="messageEsImportado1"
                                                    for="listaEsImportado1"/>
                                                <webuijsf:helpInline id="helpInlineEsImportado1"
                                                    binding="#{LogImpUbi6.helpInlineEsImportado1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_importado.log_imp_ubi"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridObservacion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpUbi6.labelObservacion1}"
                                                    id="labelObservacion1"
                                                    for="campoObservacion1"
                                                    text="observaci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridObservacion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoObservacion1"
                                                    binding="#{LogImpUbi6.campoObservacion1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpUbi6.gestor.filaNoProcesada}"
                                                    text="#{LogImpUbi6.logImpUbiDataProvider.value['observacion']}"
                                                    toolTip="BundleParametros.observacion.log_imp_ubi"
                                                    validatorExpression="#{LogImpUbi6.validatorObservacion1.validate}"/>
                                                <webuijsf:staticText id="campoObservacion1Texto1"
                                                    binding="#{LogImpUbi6.campoObservacion1Texto1}"
                                                    text="#{LogImpUbi6.logImpUbiDataProvider.value['observacion']}"/>
                                                <webuijsf:message id="messageObservacion1"
                                                    for="campoObservacion1"/>
                                                <webuijsf:helpInline id="helpInlineObservacion1"
                                                    binding="#{LogImpUbi6.helpInlineObservacion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.observacion.log_imp_ubi"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaHoraTransaccion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpUbi6.labelFechaHoraTransaccion1}"
                                                    id="labelFechaHoraTransaccion1"
                                                    for="campoFechaHoraTransaccion1"
                                                    text="fecha hora transacci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaHoraTransaccion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoFechaHoraTransaccion1"
                                                    binding="#{LogImpUbi6.campoFechaHoraTransaccion1}"
                                                    converter="#{LogImpUbi6.converterFechaHoraTransaccion1}"
                                                    readOnly="#{LogImpUbi6.gestor.filaNoProcesada}" required="true"
                                                    text="#{LogImpUbi6.logImpUbiDataProvider.value['fecha_hora_transaccion']}"
                                                    toolTip="BundleParametros.fecha_hora_transaccion.log_imp_ubi"/>
                                                <webuijsf:staticText id="campoFechaHoraTransaccion1Texto1"
                                                    binding="#{LogImpUbi6.campoFechaHoraTransaccion1Texto1}"
                                                    converter="#{LogImpUbi6.converterFechaHoraTransaccion1}"
                                                    text="#{LogImpUbi6.logImpUbiDataProvider.value['fecha_hora_transaccion']}"/>
                                                <webuijsf:message id="messageFechaHoraTransaccion1"
                                                    for="campoFechaHoraTransaccion1"/>
                                                <webuijsf:helpInline id="helpInlineFechaHoraTransaccion1"
                                                    binding="#{LogImpUbi6.helpInlineFechaHoraTransaccion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_hora_transaccion.log_imp_ubi"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNombreArchivo1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpUbi6.labelNombreArchivo1}"
                                                    id="labelNombreArchivo1"
                                                    for="campoNombreArchivo1"
                                                    text="nombre archivo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNombreArchivo2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoNombreArchivo1"
                                                    binding="#{LogImpUbi6.campoNombreArchivo1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpUbi6.gestor.filaNoProcesada}"
                                                    text="#{LogImpUbi6.logImpUbiDataProvider.value['nombre_archivo']}"
                                                    toolTip="BundleParametros.nombre_archivo.log_imp_ubi"
                                                    validatorExpression="#{LogImpUbi6.validatorNombreArchivo1.validate}"/>
                                                <webuijsf:staticText id="campoNombreArchivo1Texto1"
                                                    binding="#{LogImpUbi6.campoNombreArchivo1Texto1}"
                                                    text="#{LogImpUbi6.logImpUbiDataProvider.value['nombre_archivo']}"/>
                                                <webuijsf:button id="campoNombreArchivo1Boton3"
                                                    binding="#{LogImpUbi6.campoNombreArchivo1Boton3}"
                                                    onClick="#{LogImpUbi6.asistente.scriptCampoNombreArchivo1Boton3}"
                                                    rendered="#{LogImpUbi6.asistente.campoNombreArchivo1Boton3Rendered}"
                                                    text="#{LogImpUbi6.asistente.textCampoNombreArchivo1Boton3}"
                                                    toolTip="#{LogImpUbi6.asistente.toolTipCampoNombreArchivo1Boton3}"/>
                                                <webuijsf:message id="messageNombreArchivo1"
                                                    for="campoNombreArchivo1"/>
                                                <webuijsf:helpInline id="helpInlineNombreArchivo1"
                                                    binding="#{LogImpUbi6.helpInlineNombreArchivo1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.nombre_archivo.log_imp_ubi"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridCodigoArchivo1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpUbi6.labelCodigoArchivo1}"
                                                    id="labelCodigoArchivo1"
                                                    for="campoCodigoArchivo1"
                                                    text="c&#243;digo archivo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridCodigoArchivo2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoCodigoArchivo1"
                                                    binding="#{LogImpUbi6.campoCodigoArchivo1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpUbi6.gestor.filaNoProcesada}"
                                                    text="#{LogImpUbi6.logImpUbiDataProvider.value['codigo_archivo']}"
                                                    toolTip="BundleParametros.codigo_archivo.log_imp_ubi"
                                                    validatorExpression="#{LogImpUbi6.validatorCodigoArchivo1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoArchivo1Texto1"
                                                    binding="#{LogImpUbi6.campoCodigoArchivo1Texto1}"
                                                    text="#{LogImpUbi6.logImpUbiDataProvider.value['codigo_archivo']}"/>
                                                <webuijsf:message id="messageCodigoArchivo1"
                                                    for="campoCodigoArchivo1"/>
                                                <webuijsf:helpInline id="helpInlineCodigoArchivo1"
                                                    binding="#{LogImpUbi6.helpInlineCodigoArchivo1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.codigo_archivo.log_imp_ubi"
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
                                                        actionExpression="#{LogImpUbi6.botonIrAlPrimero2_action}"
                                                        binding="#{LogImpUbi6.botonIrAlPrimero2}"
                                                        disabled="#{LogImpUbi6.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero2"
                                                        imageURL="#{LogImpUbi6.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{LogImpUbi6.gestor.scriptIrAlPrimero}"
                                                        text="#{LogImpUbi6.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{LogImpUbi6.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpUbi6.botonIrAlAnterior2_action}"
                                                        binding="#{LogImpUbi6.botonIrAlAnterior2}"
                                                        disabled="#{LogImpUbi6.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior2"
                                                        imageURL="#{LogImpUbi6.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{LogImpUbi6.gestor.scriptIrAlAnterior}"
                                                        text="#{LogImpUbi6.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{LogImpUbi6.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpUbi6.botonIrAlSiguiente2_action}"
                                                        binding="#{LogImpUbi6.botonIrAlSiguiente2}"
                                                        disabled="#{LogImpUbi6.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente2"
                                                        imageURL="#{LogImpUbi6.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{LogImpUbi6.gestor.scriptIrAlSiguiente}"
                                                        text="#{LogImpUbi6.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{LogImpUbi6.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpUbi6.botonIrAlUltimo2_action}"
                                                        binding="#{LogImpUbi6.botonIrAlUltimo2}"
                                                        disabled="#{LogImpUbi6.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo2"
                                                        imageURL="#{LogImpUbi6.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{LogImpUbi6.gestor.scriptIrAlUltimo}"
                                                        text="#{LogImpUbi6.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{LogImpUbi6.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpUbi6.botonProcesarFila2_action}"
                                                        binding="#{LogImpUbi6.botonProcesarFila2}"
                                                        disabled="#{LogImpUbi6.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila2"
                                                        imageURL="#{LogImpUbi6.gestor.urlImagenProcesar}"
                                                        onClick="#{LogImpUbi6.scriptAbrirVentanaProcesarFila2}"
                                                        rendered="#{LogImpUbi6.asistente.comandoDisponible}"
                                                        text="#{LogImpUbi6.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{LogImpUbi6.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{LogImpUbi6.gestor.mensajeCambiosPorConfirmar}"/>
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
                                                    actionExpression="#{LogImpUbi6.botonAgregar1_action}"
                                                    binding="#{LogImpUbi6.botonAgregar1}"
                                                    disabled="#{LogImpUbi6.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{LogImpUbi6.gestor.scriptAgregar}"
                                                    rendered="#{LogImpUbi6.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpUbi6.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{LogImpUbi6.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{LogImpUbi6.listaFuncionEdicion1}"
                                                    converter="#{LogImpUbi6.converterListaFuncionEdicion1}"
                                                    disabled="#{LogImpUbi6.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{LogImpUbi6.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{LogImpUbi6.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{LogImpUbi6.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{LogImpUbi6.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpUbi6.botonEditar1_action}"
                                                    binding="#{LogImpUbi6.botonEditar1}"
                                                    disabled="#{LogImpUbi6.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{LogImpUbi6.gestor.scriptEditar}"
                                                    rendered="#{LogImpUbi6.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpUbi6.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{LogImpUbi6.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpUbi6.botonEliminar1_action}"
                                                    binding="#{LogImpUbi6.botonEliminar1}"
                                                    disabled="#{LogImpUbi6.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{LogImpUbi6.gestor.scriptEliminar}"
                                                    rendered="#{LogImpUbi6.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpUbi6.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{LogImpUbi6.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpUbi6.botonAplicar1_action}"
                                                    binding="#{LogImpUbi6.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{LogImpUbi6.gestor.scriptAplicar}"
                                                    rendered="#{LogImpUbi6.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpUbi6.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{LogImpUbi6.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpUbi6.botonDeshacer1_action}"
                                                    binding="#{LogImpUbi6.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{LogImpUbi6.gestor.scriptDeshacer}"
                                                    rendered="#{LogImpUbi6.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpUbi6.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{LogImpUbi6.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpUbi6.botonConfirmar1_action}"
                                                    binding="#{LogImpUbi6.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{LogImpUbi6.gestor.scriptConfirmar}"
                                                    rendered="#{LogImpUbi6.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpUbi6.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{LogImpUbi6.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpUbi6.botonDescartar1_action}"
                                                    binding="#{LogImpUbi6.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{LogImpUbi6.gestor.scriptDescartar}"
                                                    rendered="#{LogImpUbi6.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpUbi6.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{LogImpUbi6.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{LogImpUbi6.listaFuncionAccion1}"
                                                    converter="#{LogImpUbi6.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{LogImpUbi6.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{LogImpUbi6.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{LogImpUbi6.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{LogImpUbi6.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpUbi6.botonProcesar1_action}"
                                                    binding="#{LogImpUbi6.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{LogImpUbi6.gestor.scriptProcesar}"
                                                    rendered="#{LogImpUbi6.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpUbi6.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{LogImpUbi6.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpUbi6.botonRefrescar1_action}"
                                                    binding="#{LogImpUbi6.botonRefrescar1}"
                                                    disabled="#{LogImpUbi6.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{LogImpUbi6.gestor.scriptRefrescar}"
                                                    rendered="#{LogImpUbi6.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpUbi6.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{LogImpUbi6.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpUbi6.botonReconsultar1_action}"
                                                    binding="#{LogImpUbi6.botonReconsultar1}"
                                                    disabled="#{LogImpUbi6.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{LogImpUbi6.gestor.scriptReconsultar}"
                                                    rendered="#{LogImpUbi6.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpUbi6.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{LogImpUbi6.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpUbi6.botonRetornar1_action}"
                                                    binding="#{LogImpUbi6.botonRetornar1}"
                                                    disabled="#{LogImpUbi6.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{LogImpUbi6.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{LogImpUbi6.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpUbi6.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{LogImpUbi6.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel125"
                                                rendered="#{LogImpUbi6.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{LogImpUbi6.imageHyperlink1_action}"
                                                    binding="#{LogImpUbi6.imageHyperlink1}"
                                                    disabled="#{LogImpUbi6.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{LogImpUbi6.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{LogImpUbi6.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{LogImpUbi6.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.LogImpUbi6_imageHyperlink1_toolTip}"/>
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
