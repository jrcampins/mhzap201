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
                    focus="#{LogImpCen6.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{LogImpCen6.gestor.preserveFocus}"
                    preserveScroll="#{LogImpCen6.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{LogImpCen6.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | campoIdLogImpCen1 campoOrden1 campoBarrio1 campoDireccion1 campoTelefono1 campoPrimerNombre1 campoSegundoNombre1 campoPrimerApellido1 campoSegundoApellido1 campoEdadALaFecha1 campoSexo1 campoParentesco1 campoCedula1 campoNombreJefeHogar1 campoCedulaJefeHogar1 campoIcv1 campoValidado1 campoObservaciones1 campoFuncionario1 campoCausaInvalidacion1 listaEsImportado1 campoObservacion1 campoFechaHoraTransaccion1 campoNombreArchivo1 campoCodigoArchivo1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | | , virtualForm3 | listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{LogImpCen6.breadcrumbs1}" 
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
                                                    rendered="#{LogImpCen6.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{LogImpCen6.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{LogImpCen6.gestor.mensajeDisponible}"
                                                    text="#{LogImpCen6.gestor.mensaje}"
                                                    url="#{LogImpCen6.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            id="gridPanel104"
                                            rendered="#{LogImpCen6.gestor.filaDisponible}"
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
                                                        actionExpression="#{LogImpCen6.botonIrAlPrimero1_action}"
                                                        binding="#{LogImpCen6.botonIrAlPrimero1}"
                                                        disabled="#{LogImpCen6.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero1"
                                                        imageURL="#{LogImpCen6.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{LogImpCen6.gestor.scriptIrAlPrimero}"
                                                        text="#{LogImpCen6.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{LogImpCen6.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpCen6.botonIrAlAnterior1_action}"
                                                        binding="#{LogImpCen6.botonIrAlAnterior1}"
                                                        disabled="#{LogImpCen6.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior1"
                                                        imageURL="#{LogImpCen6.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{LogImpCen6.gestor.scriptIrAlAnterior}"
                                                        text="#{LogImpCen6.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{LogImpCen6.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpCen6.botonIrAlSiguiente1_action}"
                                                        binding="#{LogImpCen6.botonIrAlSiguiente1}"
                                                        disabled="#{LogImpCen6.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente1"
                                                        imageURL="#{LogImpCen6.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{LogImpCen6.gestor.scriptIrAlSiguiente}"
                                                        text="#{LogImpCen6.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{LogImpCen6.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpCen6.botonIrAlUltimo1_action}"
                                                        binding="#{LogImpCen6.botonIrAlUltimo1}"
                                                        disabled="#{LogImpCen6.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo1"
                                                        imageURL="#{LogImpCen6.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{LogImpCen6.gestor.scriptIrAlUltimo}"
                                                        text="#{LogImpCen6.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{LogImpCen6.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpCen6.botonProcesarFila1_action}"
                                                        binding="#{LogImpCen6.botonProcesarFila1}"
                                                        disabled="#{LogImpCen6.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila1"
                                                        imageURL="#{LogImpCen6.gestor.urlImagenProcesar}"
                                                        onClick="#{LogImpCen6.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{LogImpCen6.asistente.comandoDisponible}"
                                                        text="#{LogImpCen6.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{LogImpCen6.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{LogImpCen6.gestor.tituloConsulta}"/>
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
                                                    binding="#{LogImpCen6.etiquetaIdentificacionFila1}"
                                                    id="etiquetaIdentificacionFila1"
                                                    text="#{LogImpCen6.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{LogImpCen6.gestor.i18n.toolTipEtiquetaIdentificacionFila}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel113"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoIdentificacionFila1"
                                                    style="font-weight: bold"
                                                    text="#{LogImpCen6.gestor.identificacionFila}"/>
                                                <webuijsf:image
                                                    id="imagenFilaProcesada1"
                                                    toolTip="#{LogImpCen6.gestor.toolTipImagenFilaProcesada}"
                                                    url="#{LogImpCen6.gestor.urlImagenFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPanel114"
                                                rendered="#{LogImpCen6.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpCen6.etiquetaDenominacionFilaMaestro1}"
                                                    id="etiquetaDenominacionFilaMaestro1"
                                                    text="?"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel115"
                                                rendered="#{LogImpCen6.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoDenominacionFilaMaestro1"
                                                    style="font-weight: bold"
                                                    text="#{LogImpCen6.gestor.denominacionFilaMaestro}"/>
                                                <webuijsf:image
                                                    id="imagenFilaMaestro1"
                                                    url="#{LogImpCen6.gestor.urlImagenMaestroFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdLogImpCen1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpCen6.labelIdLogImpCen1}"
                                                    id="labelIdLogImpCen1"
                                                    for="campoIdLogImpCen1"
                                                    text="identificaci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdLogImpCen2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdLogImpCen1"
                                                    binding="#{LogImpCen6.campoIdLogImpCen1}"
                                                    converter="#{LogImpCen6.converterIdLogImpCen1}"
                                                    readOnly="true"
                                                    text="#{LogImpCen6.logImpCenDataProvider.value['id_log_imp_cen']}"
                                                    toolTip="BundleParametros.id_log_imp_cen.log_imp_cen"
                                                    validatorExpression="#{LogImpCen6.validatorIdLogImpCen1.validate}"/>
                                                <webuijsf:staticText id="campoIdLogImpCen1Texto1"
                                                    binding="#{LogImpCen6.campoIdLogImpCen1Texto1}"
                                                    text="#{LogImpCen6.logImpCenDataProvider.value['id_log_imp_cen']}"/>
                                                <webuijsf:message id="messageIdLogImpCen1"
                                                    for="campoIdLogImpCen1"/>
                                                <webuijsf:helpInline id="helpInlineIdLogImpCen1"
                                                    binding="#{LogImpCen6.helpInlineIdLogImpCen1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_log_imp_cen.log_imp_cen"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridOrden1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpCen6.labelOrden1}"
                                                    id="labelOrden1"
                                                    for="campoOrden1"
                                                    text="orden"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridOrden2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoOrden1"
                                                    binding="#{LogImpCen6.campoOrden1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpCen6.gestor.filaNoProcesada}"
                                                    text="#{LogImpCen6.logImpCenDataProvider.value['orden']}"
                                                    toolTip="BundleParametros.orden.log_imp_cen"
                                                    validatorExpression="#{LogImpCen6.validatorOrden1.validate}"/>
                                                <webuijsf:staticText id="campoOrden1Texto1"
                                                    binding="#{LogImpCen6.campoOrden1Texto1}"
                                                    text="#{LogImpCen6.logImpCenDataProvider.value['orden']}"/>
                                                <webuijsf:message id="messageOrden1"
                                                    for="campoOrden1"/>
                                                <webuijsf:helpInline id="helpInlineOrden1"
                                                    binding="#{LogImpCen6.helpInlineOrden1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.orden.log_imp_cen"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridBarrio1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpCen6.labelBarrio1}"
                                                    id="labelBarrio1"
                                                    for="campoBarrio1"
                                                    text="barrio"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridBarrio2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoBarrio1"
                                                    binding="#{LogImpCen6.campoBarrio1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpCen6.gestor.filaNoProcesada}"
                                                    text="#{LogImpCen6.logImpCenDataProvider.value['barrio']}"
                                                    toolTip="BundleParametros.barrio.log_imp_cen"
                                                    validatorExpression="#{LogImpCen6.validatorBarrio1.validate}"/>
                                                <webuijsf:staticText id="campoBarrio1Texto1"
                                                    binding="#{LogImpCen6.campoBarrio1Texto1}"
                                                    text="#{LogImpCen6.logImpCenDataProvider.value['barrio']}"/>
                                                <webuijsf:message id="messageBarrio1"
                                                    for="campoBarrio1"/>
                                                <webuijsf:helpInline id="helpInlineBarrio1"
                                                    binding="#{LogImpCen6.helpInlineBarrio1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.barrio.log_imp_cen"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridDireccion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpCen6.labelDireccion1}"
                                                    id="labelDireccion1"
                                                    for="campoDireccion1"
                                                    text="direcci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridDireccion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoDireccion1"
                                                    binding="#{LogImpCen6.campoDireccion1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpCen6.gestor.filaNoProcesada}"
                                                    text="#{LogImpCen6.logImpCenDataProvider.value['direccion']}"
                                                    toolTip="BundleParametros.direccion.log_imp_cen"
                                                    validatorExpression="#{LogImpCen6.validatorDireccion1.validate}"/>
                                                <webuijsf:staticText id="campoDireccion1Texto1"
                                                    binding="#{LogImpCen6.campoDireccion1Texto1}"
                                                    text="#{LogImpCen6.logImpCenDataProvider.value['direccion']}"/>
                                                <webuijsf:message id="messageDireccion1"
                                                    for="campoDireccion1"/>
                                                <webuijsf:helpInline id="helpInlineDireccion1"
                                                    binding="#{LogImpCen6.helpInlineDireccion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.direccion.log_imp_cen"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridTelefono1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpCen6.labelTelefono1}"
                                                    id="labelTelefono1"
                                                    for="campoTelefono1"
                                                    text="tel&#233;fono"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridTelefono2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoTelefono1"
                                                    binding="#{LogImpCen6.campoTelefono1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpCen6.gestor.filaNoProcesada}"
                                                    text="#{LogImpCen6.logImpCenDataProvider.value['telefono']}"
                                                    toolTip="BundleParametros.telefono.log_imp_cen"
                                                    validatorExpression="#{LogImpCen6.validatorTelefono1.validate}"/>
                                                <webuijsf:staticText id="campoTelefono1Texto1"
                                                    binding="#{LogImpCen6.campoTelefono1Texto1}"
                                                    text="#{LogImpCen6.logImpCenDataProvider.value['telefono']}"/>
                                                <webuijsf:message id="messageTelefono1"
                                                    for="campoTelefono1"/>
                                                <webuijsf:helpInline id="helpInlineTelefono1"
                                                    binding="#{LogImpCen6.helpInlineTelefono1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.telefono.log_imp_cen"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPrimerNombre1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpCen6.labelPrimerNombre1}"
                                                    id="labelPrimerNombre1"
                                                    for="campoPrimerNombre1"
                                                    text="primer nombre"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPrimerNombre2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoPrimerNombre1"
                                                    binding="#{LogImpCen6.campoPrimerNombre1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpCen6.gestor.filaNoProcesada}"
                                                    text="#{LogImpCen6.logImpCenDataProvider.value['primer_nombre']}"
                                                    toolTip="BundleParametros.primer_nombre.log_imp_cen"
                                                    validatorExpression="#{LogImpCen6.validatorPrimerNombre1.validate}"/>
                                                <webuijsf:staticText id="campoPrimerNombre1Texto1"
                                                    binding="#{LogImpCen6.campoPrimerNombre1Texto1}"
                                                    text="#{LogImpCen6.logImpCenDataProvider.value['primer_nombre']}"/>
                                                <webuijsf:message id="messagePrimerNombre1"
                                                    for="campoPrimerNombre1"/>
                                                <webuijsf:helpInline id="helpInlinePrimerNombre1"
                                                    binding="#{LogImpCen6.helpInlinePrimerNombre1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.primer_nombre.log_imp_cen"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridSegundoNombre1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpCen6.labelSegundoNombre1}"
                                                    id="labelSegundoNombre1"
                                                    for="campoSegundoNombre1"
                                                    text="segundo nombre"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridSegundoNombre2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoSegundoNombre1"
                                                    binding="#{LogImpCen6.campoSegundoNombre1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpCen6.gestor.filaNoProcesada}"
                                                    text="#{LogImpCen6.logImpCenDataProvider.value['segundo_nombre']}"
                                                    toolTip="BundleParametros.segundo_nombre.log_imp_cen"
                                                    validatorExpression="#{LogImpCen6.validatorSegundoNombre1.validate}"/>
                                                <webuijsf:staticText id="campoSegundoNombre1Texto1"
                                                    binding="#{LogImpCen6.campoSegundoNombre1Texto1}"
                                                    text="#{LogImpCen6.logImpCenDataProvider.value['segundo_nombre']}"/>
                                                <webuijsf:message id="messageSegundoNombre1"
                                                    for="campoSegundoNombre1"/>
                                                <webuijsf:helpInline id="helpInlineSegundoNombre1"
                                                    binding="#{LogImpCen6.helpInlineSegundoNombre1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.segundo_nombre.log_imp_cen"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPrimerApellido1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpCen6.labelPrimerApellido1}"
                                                    id="labelPrimerApellido1"
                                                    for="campoPrimerApellido1"
                                                    text="primer apellido"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPrimerApellido2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoPrimerApellido1"
                                                    binding="#{LogImpCen6.campoPrimerApellido1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpCen6.gestor.filaNoProcesada}"
                                                    text="#{LogImpCen6.logImpCenDataProvider.value['primer_apellido']}"
                                                    toolTip="BundleParametros.primer_apellido.log_imp_cen"
                                                    validatorExpression="#{LogImpCen6.validatorPrimerApellido1.validate}"/>
                                                <webuijsf:staticText id="campoPrimerApellido1Texto1"
                                                    binding="#{LogImpCen6.campoPrimerApellido1Texto1}"
                                                    text="#{LogImpCen6.logImpCenDataProvider.value['primer_apellido']}"/>
                                                <webuijsf:message id="messagePrimerApellido1"
                                                    for="campoPrimerApellido1"/>
                                                <webuijsf:helpInline id="helpInlinePrimerApellido1"
                                                    binding="#{LogImpCen6.helpInlinePrimerApellido1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.primer_apellido.log_imp_cen"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridSegundoApellido1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpCen6.labelSegundoApellido1}"
                                                    id="labelSegundoApellido1"
                                                    for="campoSegundoApellido1"
                                                    text="segundo apellido"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridSegundoApellido2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoSegundoApellido1"
                                                    binding="#{LogImpCen6.campoSegundoApellido1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpCen6.gestor.filaNoProcesada}"
                                                    text="#{LogImpCen6.logImpCenDataProvider.value['segundo_apellido']}"
                                                    toolTip="BundleParametros.segundo_apellido.log_imp_cen"
                                                    validatorExpression="#{LogImpCen6.validatorSegundoApellido1.validate}"/>
                                                <webuijsf:staticText id="campoSegundoApellido1Texto1"
                                                    binding="#{LogImpCen6.campoSegundoApellido1Texto1}"
                                                    text="#{LogImpCen6.logImpCenDataProvider.value['segundo_apellido']}"/>
                                                <webuijsf:message id="messageSegundoApellido1"
                                                    for="campoSegundoApellido1"/>
                                                <webuijsf:helpInline id="helpInlineSegundoApellido1"
                                                    binding="#{LogImpCen6.helpInlineSegundoApellido1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.segundo_apellido.log_imp_cen"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEdadALaFecha1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpCen6.labelEdadALaFecha1}"
                                                    id="labelEdadALaFecha1"
                                                    for="campoEdadALaFecha1"
                                                    text="edad a la fecha"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEdadALaFecha2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoEdadALaFecha1"
                                                    binding="#{LogImpCen6.campoEdadALaFecha1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpCen6.gestor.filaNoProcesada}"
                                                    text="#{LogImpCen6.logImpCenDataProvider.value['edad_a_la_fecha']}"
                                                    toolTip="BundleParametros.edad_a_la_fecha.log_imp_cen"
                                                    validatorExpression="#{LogImpCen6.validatorEdadALaFecha1.validate}"/>
                                                <webuijsf:staticText id="campoEdadALaFecha1Texto1"
                                                    binding="#{LogImpCen6.campoEdadALaFecha1Texto1}"
                                                    text="#{LogImpCen6.logImpCenDataProvider.value['edad_a_la_fecha']}"/>
                                                <webuijsf:message id="messageEdadALaFecha1"
                                                    for="campoEdadALaFecha1"/>
                                                <webuijsf:helpInline id="helpInlineEdadALaFecha1"
                                                    binding="#{LogImpCen6.helpInlineEdadALaFecha1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.edad_a_la_fecha.log_imp_cen"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridSexo1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpCen6.labelSexo1}"
                                                    id="labelSexo1"
                                                    for="campoSexo1"
                                                    text="sexo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridSexo2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoSexo1"
                                                    binding="#{LogImpCen6.campoSexo1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpCen6.gestor.filaNoProcesada}"
                                                    text="#{LogImpCen6.logImpCenDataProvider.value['sexo']}"
                                                    toolTip="BundleParametros.sexo.log_imp_cen"
                                                    validatorExpression="#{LogImpCen6.validatorSexo1.validate}"/>
                                                <webuijsf:staticText id="campoSexo1Texto1"
                                                    binding="#{LogImpCen6.campoSexo1Texto1}"
                                                    text="#{LogImpCen6.logImpCenDataProvider.value['sexo']}"/>
                                                <webuijsf:message id="messageSexo1"
                                                    for="campoSexo1"/>
                                                <webuijsf:helpInline id="helpInlineSexo1"
                                                    binding="#{LogImpCen6.helpInlineSexo1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.sexo.log_imp_cen"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridParentesco1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpCen6.labelParentesco1}"
                                                    id="labelParentesco1"
                                                    for="campoParentesco1"
                                                    text="parentesco"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridParentesco2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoParentesco1"
                                                    binding="#{LogImpCen6.campoParentesco1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpCen6.gestor.filaNoProcesada}"
                                                    text="#{LogImpCen6.logImpCenDataProvider.value['parentesco']}"
                                                    toolTip="BundleParametros.parentesco.log_imp_cen"
                                                    validatorExpression="#{LogImpCen6.validatorParentesco1.validate}"/>
                                                <webuijsf:staticText id="campoParentesco1Texto1"
                                                    binding="#{LogImpCen6.campoParentesco1Texto1}"
                                                    text="#{LogImpCen6.logImpCenDataProvider.value['parentesco']}"/>
                                                <webuijsf:message id="messageParentesco1"
                                                    for="campoParentesco1"/>
                                                <webuijsf:helpInline id="helpInlineParentesco1"
                                                    binding="#{LogImpCen6.helpInlineParentesco1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.parentesco.log_imp_cen"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridCedula1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpCen6.labelCedula1}"
                                                    id="labelCedula1"
                                                    for="campoCedula1"
                                                    text="c&#233;dula"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridCedula2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoCedula1"
                                                    binding="#{LogImpCen6.campoCedula1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpCen6.gestor.filaNoProcesada}"
                                                    text="#{LogImpCen6.logImpCenDataProvider.value['cedula']}"
                                                    toolTip="BundleParametros.cedula.log_imp_cen"
                                                    validatorExpression="#{LogImpCen6.validatorCedula1.validate}"/>
                                                <webuijsf:staticText id="campoCedula1Texto1"
                                                    binding="#{LogImpCen6.campoCedula1Texto1}"
                                                    text="#{LogImpCen6.logImpCenDataProvider.value['cedula']}"/>
                                                <webuijsf:message id="messageCedula1"
                                                    for="campoCedula1"/>
                                                <webuijsf:helpInline id="helpInlineCedula1"
                                                    binding="#{LogImpCen6.helpInlineCedula1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.cedula.log_imp_cen"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNombreJefeHogar1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpCen6.labelNombreJefeHogar1}"
                                                    id="labelNombreJefeHogar1"
                                                    for="campoNombreJefeHogar1"
                                                    text="nombre jefe hogar"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNombreJefeHogar2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoNombreJefeHogar1"
                                                    binding="#{LogImpCen6.campoNombreJefeHogar1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpCen6.gestor.filaNoProcesada}"
                                                    text="#{LogImpCen6.logImpCenDataProvider.value['nombre_jefe_hogar']}"
                                                    toolTip="BundleParametros.nombre_jefe_hogar.log_imp_cen"
                                                    validatorExpression="#{LogImpCen6.validatorNombreJefeHogar1.validate}"/>
                                                <webuijsf:staticText id="campoNombreJefeHogar1Texto1"
                                                    binding="#{LogImpCen6.campoNombreJefeHogar1Texto1}"
                                                    text="#{LogImpCen6.logImpCenDataProvider.value['nombre_jefe_hogar']}"/>
                                                <webuijsf:message id="messageNombreJefeHogar1"
                                                    for="campoNombreJefeHogar1"/>
                                                <webuijsf:helpInline id="helpInlineNombreJefeHogar1"
                                                    binding="#{LogImpCen6.helpInlineNombreJefeHogar1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.nombre_jefe_hogar.log_imp_cen"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridCedulaJefeHogar1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpCen6.labelCedulaJefeHogar1}"
                                                    id="labelCedulaJefeHogar1"
                                                    for="campoCedulaJefeHogar1"
                                                    text="c&#233;dula jefe hogar"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridCedulaJefeHogar2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoCedulaJefeHogar1"
                                                    binding="#{LogImpCen6.campoCedulaJefeHogar1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpCen6.gestor.filaNoProcesada}"
                                                    text="#{LogImpCen6.logImpCenDataProvider.value['cedula_jefe_hogar']}"
                                                    toolTip="BundleParametros.cedula_jefe_hogar.log_imp_cen"
                                                    validatorExpression="#{LogImpCen6.validatorCedulaJefeHogar1.validate}"/>
                                                <webuijsf:staticText id="campoCedulaJefeHogar1Texto1"
                                                    binding="#{LogImpCen6.campoCedulaJefeHogar1Texto1}"
                                                    text="#{LogImpCen6.logImpCenDataProvider.value['cedula_jefe_hogar']}"/>
                                                <webuijsf:message id="messageCedulaJefeHogar1"
                                                    for="campoCedulaJefeHogar1"/>
                                                <webuijsf:helpInline id="helpInlineCedulaJefeHogar1"
                                                    binding="#{LogImpCen6.helpInlineCedulaJefeHogar1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.cedula_jefe_hogar.log_imp_cen"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIcv1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpCen6.labelIcv1}"
                                                    id="labelIcv1"
                                                    for="campoIcv1"
                                                    text="icv"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIcv2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoIcv1"
                                                    binding="#{LogImpCen6.campoIcv1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpCen6.gestor.filaNoProcesada}"
                                                    text="#{LogImpCen6.logImpCenDataProvider.value['icv']}"
                                                    toolTip="BundleParametros.icv.log_imp_cen"
                                                    validatorExpression="#{LogImpCen6.validatorIcv1.validate}"/>
                                                <webuijsf:staticText id="campoIcv1Texto1"
                                                    binding="#{LogImpCen6.campoIcv1Texto1}"
                                                    text="#{LogImpCen6.logImpCenDataProvider.value['icv']}"/>
                                                <webuijsf:message id="messageIcv1"
                                                    for="campoIcv1"/>
                                                <webuijsf:helpInline id="helpInlineIcv1"
                                                    binding="#{LogImpCen6.helpInlineIcv1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.icv.log_imp_cen"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridValidado1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpCen6.labelValidado1}"
                                                    id="labelValidado1"
                                                    for="campoValidado1"
                                                    text="validado"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridValidado2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoValidado1"
                                                    binding="#{LogImpCen6.campoValidado1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpCen6.gestor.filaNoProcesada}"
                                                    text="#{LogImpCen6.logImpCenDataProvider.value['validado']}"
                                                    toolTip="BundleParametros.validado.log_imp_cen"
                                                    validatorExpression="#{LogImpCen6.validatorValidado1.validate}"/>
                                                <webuijsf:staticText id="campoValidado1Texto1"
                                                    binding="#{LogImpCen6.campoValidado1Texto1}"
                                                    text="#{LogImpCen6.logImpCenDataProvider.value['validado']}"/>
                                                <webuijsf:message id="messageValidado1"
                                                    for="campoValidado1"/>
                                                <webuijsf:helpInline id="helpInlineValidado1"
                                                    binding="#{LogImpCen6.helpInlineValidado1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.validado.log_imp_cen"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridObservaciones1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpCen6.labelObservaciones1}"
                                                    id="labelObservaciones1"
                                                    for="campoObservaciones1"
                                                    text="observaciones"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridObservaciones2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoObservaciones1"
                                                    binding="#{LogImpCen6.campoObservaciones1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpCen6.gestor.filaNoProcesada}"
                                                    text="#{LogImpCen6.logImpCenDataProvider.value['observaciones']}"
                                                    toolTip="BundleParametros.observaciones.log_imp_cen"
                                                    validatorExpression="#{LogImpCen6.validatorObservaciones1.validate}"/>
                                                <webuijsf:staticText id="campoObservaciones1Texto1"
                                                    binding="#{LogImpCen6.campoObservaciones1Texto1}"
                                                    text="#{LogImpCen6.logImpCenDataProvider.value['observaciones']}"/>
                                                <webuijsf:message id="messageObservaciones1"
                                                    for="campoObservaciones1"/>
                                                <webuijsf:helpInline id="helpInlineObservaciones1"
                                                    binding="#{LogImpCen6.helpInlineObservaciones1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.observaciones.log_imp_cen"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFuncionario1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpCen6.labelFuncionario1}"
                                                    id="labelFuncionario1"
                                                    for="campoFuncionario1"
                                                    text="funcionario"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFuncionario2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoFuncionario1"
                                                    binding="#{LogImpCen6.campoFuncionario1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpCen6.gestor.filaNoProcesada}"
                                                    text="#{LogImpCen6.logImpCenDataProvider.value['funcionario']}"
                                                    toolTip="BundleParametros.funcionario.log_imp_cen"
                                                    validatorExpression="#{LogImpCen6.validatorFuncionario1.validate}"/>
                                                <webuijsf:staticText id="campoFuncionario1Texto1"
                                                    binding="#{LogImpCen6.campoFuncionario1Texto1}"
                                                    text="#{LogImpCen6.logImpCenDataProvider.value['funcionario']}"/>
                                                <webuijsf:message id="messageFuncionario1"
                                                    for="campoFuncionario1"/>
                                                <webuijsf:helpInline id="helpInlineFuncionario1"
                                                    binding="#{LogImpCen6.helpInlineFuncionario1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.funcionario.log_imp_cen"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridCausaInvalidacion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpCen6.labelCausaInvalidacion1}"
                                                    id="labelCausaInvalidacion1"
                                                    for="campoCausaInvalidacion1"
                                                    text="causa invalidaci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridCausaInvalidacion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoCausaInvalidacion1"
                                                    binding="#{LogImpCen6.campoCausaInvalidacion1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpCen6.gestor.filaNoProcesada}"
                                                    text="#{LogImpCen6.logImpCenDataProvider.value['causa_invalidacion']}"
                                                    toolTip="BundleParametros.causa_invalidacion.log_imp_cen"
                                                    validatorExpression="#{LogImpCen6.validatorCausaInvalidacion1.validate}"/>
                                                <webuijsf:staticText id="campoCausaInvalidacion1Texto1"
                                                    binding="#{LogImpCen6.campoCausaInvalidacion1Texto1}"
                                                    text="#{LogImpCen6.logImpCenDataProvider.value['causa_invalidacion']}"/>
                                                <webuijsf:message id="messageCausaInvalidacion1"
                                                    for="campoCausaInvalidacion1"/>
                                                <webuijsf:helpInline id="helpInlineCausaInvalidacion1"
                                                    binding="#{LogImpCen6.helpInlineCausaInvalidacion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.causa_invalidacion.log_imp_cen"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsImportado1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpCen6.labelEsImportado1}"
                                                    id="labelEsImportado1"
                                                    for="listaEsImportado1"
                                                    text="importado"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsImportado2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsImportado1"
                                                    binding="#{LogImpCen6.listaEsImportado1}"
                                                    converter="#{LogImpCen6.converterEsImportado1}"
                                                    disabled="#{LogImpCen6.gestor.filaNoProcesada}" required="true"
                                                    items="#{LogImpCen6.asistente.opcionesListaEsImportado1}"
                                                    selected="#{LogImpCen6.logImpCenDataProvider.value['es_importado']}"
                                                    toolTip="BundleParametros.es_importado.log_imp_cen"/>
                                                <webuijsf:staticText id="listaEsImportado1Texto1"
                                                    binding="#{LogImpCen6.listaEsImportado1Texto1}"/>
                                                <webuijsf:message id="messageEsImportado1"
                                                    for="listaEsImportado1"/>
                                                <webuijsf:helpInline id="helpInlineEsImportado1"
                                                    binding="#{LogImpCen6.helpInlineEsImportado1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_importado.log_imp_cen"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridObservacion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpCen6.labelObservacion1}"
                                                    id="labelObservacion1"
                                                    for="campoObservacion1"
                                                    text="observaci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridObservacion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoObservacion1"
                                                    binding="#{LogImpCen6.campoObservacion1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpCen6.gestor.filaNoProcesada}"
                                                    text="#{LogImpCen6.logImpCenDataProvider.value['observacion']}"
                                                    toolTip="BundleParametros.observacion.log_imp_cen"
                                                    validatorExpression="#{LogImpCen6.validatorObservacion1.validate}"/>
                                                <webuijsf:staticText id="campoObservacion1Texto1"
                                                    binding="#{LogImpCen6.campoObservacion1Texto1}"
                                                    text="#{LogImpCen6.logImpCenDataProvider.value['observacion']}"/>
                                                <webuijsf:message id="messageObservacion1"
                                                    for="campoObservacion1"/>
                                                <webuijsf:helpInline id="helpInlineObservacion1"
                                                    binding="#{LogImpCen6.helpInlineObservacion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.observacion.log_imp_cen"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaHoraTransaccion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpCen6.labelFechaHoraTransaccion1}"
                                                    id="labelFechaHoraTransaccion1"
                                                    for="campoFechaHoraTransaccion1"
                                                    text="fecha hora transacci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaHoraTransaccion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoFechaHoraTransaccion1"
                                                    binding="#{LogImpCen6.campoFechaHoraTransaccion1}"
                                                    converter="#{LogImpCen6.converterFechaHoraTransaccion1}"
                                                    readOnly="#{LogImpCen6.gestor.filaNoProcesada}" required="true"
                                                    text="#{LogImpCen6.logImpCenDataProvider.value['fecha_hora_transaccion']}"
                                                    toolTip="BundleParametros.fecha_hora_transaccion.log_imp_cen"/>
                                                <webuijsf:staticText id="campoFechaHoraTransaccion1Texto1"
                                                    binding="#{LogImpCen6.campoFechaHoraTransaccion1Texto1}"
                                                    converter="#{LogImpCen6.converterFechaHoraTransaccion1}"
                                                    text="#{LogImpCen6.logImpCenDataProvider.value['fecha_hora_transaccion']}"/>
                                                <webuijsf:message id="messageFechaHoraTransaccion1"
                                                    for="campoFechaHoraTransaccion1"/>
                                                <webuijsf:helpInline id="helpInlineFechaHoraTransaccion1"
                                                    binding="#{LogImpCen6.helpInlineFechaHoraTransaccion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_hora_transaccion.log_imp_cen"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNombreArchivo1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpCen6.labelNombreArchivo1}"
                                                    id="labelNombreArchivo1"
                                                    for="campoNombreArchivo1"
                                                    text="nombre archivo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNombreArchivo2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoNombreArchivo1"
                                                    binding="#{LogImpCen6.campoNombreArchivo1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpCen6.gestor.filaNoProcesada}"
                                                    text="#{LogImpCen6.logImpCenDataProvider.value['nombre_archivo']}"
                                                    toolTip="BundleParametros.nombre_archivo.log_imp_cen"
                                                    validatorExpression="#{LogImpCen6.validatorNombreArchivo1.validate}"/>
                                                <webuijsf:staticText id="campoNombreArchivo1Texto1"
                                                    binding="#{LogImpCen6.campoNombreArchivo1Texto1}"
                                                    text="#{LogImpCen6.logImpCenDataProvider.value['nombre_archivo']}"/>
                                                <webuijsf:button id="campoNombreArchivo1Boton3"
                                                    binding="#{LogImpCen6.campoNombreArchivo1Boton3}"
                                                    onClick="#{LogImpCen6.asistente.scriptCampoNombreArchivo1Boton3}"
                                                    rendered="#{LogImpCen6.asistente.campoNombreArchivo1Boton3Rendered}"
                                                    text="#{LogImpCen6.asistente.textCampoNombreArchivo1Boton3}"
                                                    toolTip="#{LogImpCen6.asistente.toolTipCampoNombreArchivo1Boton3}"/>
                                                <webuijsf:message id="messageNombreArchivo1"
                                                    for="campoNombreArchivo1"/>
                                                <webuijsf:helpInline id="helpInlineNombreArchivo1"
                                                    binding="#{LogImpCen6.helpInlineNombreArchivo1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.nombre_archivo.log_imp_cen"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridCodigoArchivo1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpCen6.labelCodigoArchivo1}"
                                                    id="labelCodigoArchivo1"
                                                    for="campoCodigoArchivo1"
                                                    text="c&#243;digo archivo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridCodigoArchivo2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoCodigoArchivo1"
                                                    binding="#{LogImpCen6.campoCodigoArchivo1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpCen6.gestor.filaNoProcesada}"
                                                    text="#{LogImpCen6.logImpCenDataProvider.value['codigo_archivo']}"
                                                    toolTip="BundleParametros.codigo_archivo.log_imp_cen"
                                                    validatorExpression="#{LogImpCen6.validatorCodigoArchivo1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoArchivo1Texto1"
                                                    binding="#{LogImpCen6.campoCodigoArchivo1Texto1}"
                                                    text="#{LogImpCen6.logImpCenDataProvider.value['codigo_archivo']}"/>
                                                <webuijsf:message id="messageCodigoArchivo1"
                                                    for="campoCodigoArchivo1"/>
                                                <webuijsf:helpInline id="helpInlineCodigoArchivo1"
                                                    binding="#{LogImpCen6.helpInlineCodigoArchivo1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.codigo_archivo.log_imp_cen"
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
                                                        actionExpression="#{LogImpCen6.botonIrAlPrimero2_action}"
                                                        binding="#{LogImpCen6.botonIrAlPrimero2}"
                                                        disabled="#{LogImpCen6.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero2"
                                                        imageURL="#{LogImpCen6.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{LogImpCen6.gestor.scriptIrAlPrimero}"
                                                        text="#{LogImpCen6.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{LogImpCen6.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpCen6.botonIrAlAnterior2_action}"
                                                        binding="#{LogImpCen6.botonIrAlAnterior2}"
                                                        disabled="#{LogImpCen6.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior2"
                                                        imageURL="#{LogImpCen6.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{LogImpCen6.gestor.scriptIrAlAnterior}"
                                                        text="#{LogImpCen6.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{LogImpCen6.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpCen6.botonIrAlSiguiente2_action}"
                                                        binding="#{LogImpCen6.botonIrAlSiguiente2}"
                                                        disabled="#{LogImpCen6.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente2"
                                                        imageURL="#{LogImpCen6.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{LogImpCen6.gestor.scriptIrAlSiguiente}"
                                                        text="#{LogImpCen6.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{LogImpCen6.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpCen6.botonIrAlUltimo2_action}"
                                                        binding="#{LogImpCen6.botonIrAlUltimo2}"
                                                        disabled="#{LogImpCen6.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo2"
                                                        imageURL="#{LogImpCen6.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{LogImpCen6.gestor.scriptIrAlUltimo}"
                                                        text="#{LogImpCen6.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{LogImpCen6.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpCen6.botonProcesarFila2_action}"
                                                        binding="#{LogImpCen6.botonProcesarFila2}"
                                                        disabled="#{LogImpCen6.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila2"
                                                        imageURL="#{LogImpCen6.gestor.urlImagenProcesar}"
                                                        onClick="#{LogImpCen6.scriptAbrirVentanaProcesarFila2}"
                                                        rendered="#{LogImpCen6.asistente.comandoDisponible}"
                                                        text="#{LogImpCen6.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{LogImpCen6.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{LogImpCen6.gestor.mensajeCambiosPorConfirmar}"/>
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
                                                    actionExpression="#{LogImpCen6.botonAgregar1_action}"
                                                    binding="#{LogImpCen6.botonAgregar1}"
                                                    disabled="#{LogImpCen6.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{LogImpCen6.gestor.scriptAgregar}"
                                                    rendered="#{LogImpCen6.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpCen6.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{LogImpCen6.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{LogImpCen6.listaFuncionEdicion1}"
                                                    converter="#{LogImpCen6.converterListaFuncionEdicion1}"
                                                    disabled="#{LogImpCen6.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{LogImpCen6.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{LogImpCen6.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{LogImpCen6.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{LogImpCen6.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpCen6.botonEditar1_action}"
                                                    binding="#{LogImpCen6.botonEditar1}"
                                                    disabled="#{LogImpCen6.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{LogImpCen6.gestor.scriptEditar}"
                                                    rendered="#{LogImpCen6.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpCen6.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{LogImpCen6.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpCen6.botonEliminar1_action}"
                                                    binding="#{LogImpCen6.botonEliminar1}"
                                                    disabled="#{LogImpCen6.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{LogImpCen6.gestor.scriptEliminar}"
                                                    rendered="#{LogImpCen6.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpCen6.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{LogImpCen6.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpCen6.botonAplicar1_action}"
                                                    binding="#{LogImpCen6.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{LogImpCen6.gestor.scriptAplicar}"
                                                    rendered="#{LogImpCen6.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpCen6.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{LogImpCen6.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpCen6.botonDeshacer1_action}"
                                                    binding="#{LogImpCen6.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{LogImpCen6.gestor.scriptDeshacer}"
                                                    rendered="#{LogImpCen6.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpCen6.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{LogImpCen6.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpCen6.botonConfirmar1_action}"
                                                    binding="#{LogImpCen6.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{LogImpCen6.gestor.scriptConfirmar}"
                                                    rendered="#{LogImpCen6.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpCen6.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{LogImpCen6.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpCen6.botonDescartar1_action}"
                                                    binding="#{LogImpCen6.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{LogImpCen6.gestor.scriptDescartar}"
                                                    rendered="#{LogImpCen6.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpCen6.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{LogImpCen6.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{LogImpCen6.listaFuncionAccion1}"
                                                    converter="#{LogImpCen6.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{LogImpCen6.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{LogImpCen6.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{LogImpCen6.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{LogImpCen6.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpCen6.botonProcesar1_action}"
                                                    binding="#{LogImpCen6.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{LogImpCen6.gestor.scriptProcesar}"
                                                    rendered="#{LogImpCen6.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpCen6.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{LogImpCen6.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpCen6.botonRefrescar1_action}"
                                                    binding="#{LogImpCen6.botonRefrescar1}"
                                                    disabled="#{LogImpCen6.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{LogImpCen6.gestor.scriptRefrescar}"
                                                    rendered="#{LogImpCen6.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpCen6.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{LogImpCen6.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpCen6.botonReconsultar1_action}"
                                                    binding="#{LogImpCen6.botonReconsultar1}"
                                                    disabled="#{LogImpCen6.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{LogImpCen6.gestor.scriptReconsultar}"
                                                    rendered="#{LogImpCen6.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpCen6.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{LogImpCen6.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpCen6.botonRetornar1_action}"
                                                    binding="#{LogImpCen6.botonRetornar1}"
                                                    disabled="#{LogImpCen6.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{LogImpCen6.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{LogImpCen6.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpCen6.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{LogImpCen6.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel125"
                                                rendered="#{LogImpCen6.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{LogImpCen6.imageHyperlink1_action}"
                                                    binding="#{LogImpCen6.imageHyperlink1}"
                                                    disabled="#{LogImpCen6.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{LogImpCen6.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{LogImpCen6.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{LogImpCen6.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.LogImpCen6_imageHyperlink1_toolTip}"/>
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
