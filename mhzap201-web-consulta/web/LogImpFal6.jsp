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
                    focus="#{LogImpFal6.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{LogImpFal6.gestor.preserveFocus}"
                    preserveScroll="#{LogImpFal6.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{LogImpFal6.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | campoIdLogImpFal1 campoCedula1 campoPrimerNombre1 campoSegundoNombre1 campoPrimerApellido1 campoSegundoApellido1 campoApellidoCasada1 campoDefuncion1 listaEsImportado1 campoObservacion1 campoFechaHoraTransaccion1 campoNombreArchivo1 campoCodigoArchivo1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | | , virtualForm3 | listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{LogImpFal6.breadcrumbs1}" 
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
                                                    rendered="#{LogImpFal6.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{LogImpFal6.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{LogImpFal6.gestor.mensajeDisponible}"
                                                    text="#{LogImpFal6.gestor.mensaje}"
                                                    url="#{LogImpFal6.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            id="gridPanel104"
                                            rendered="#{LogImpFal6.gestor.filaDisponible}"
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
                                                        actionExpression="#{LogImpFal6.botonIrAlPrimero1_action}"
                                                        binding="#{LogImpFal6.botonIrAlPrimero1}"
                                                        disabled="#{LogImpFal6.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero1"
                                                        imageURL="#{LogImpFal6.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{LogImpFal6.gestor.scriptIrAlPrimero}"
                                                        text="#{LogImpFal6.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{LogImpFal6.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpFal6.botonIrAlAnterior1_action}"
                                                        binding="#{LogImpFal6.botonIrAlAnterior1}"
                                                        disabled="#{LogImpFal6.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior1"
                                                        imageURL="#{LogImpFal6.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{LogImpFal6.gestor.scriptIrAlAnterior}"
                                                        text="#{LogImpFal6.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{LogImpFal6.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpFal6.botonIrAlSiguiente1_action}"
                                                        binding="#{LogImpFal6.botonIrAlSiguiente1}"
                                                        disabled="#{LogImpFal6.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente1"
                                                        imageURL="#{LogImpFal6.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{LogImpFal6.gestor.scriptIrAlSiguiente}"
                                                        text="#{LogImpFal6.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{LogImpFal6.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpFal6.botonIrAlUltimo1_action}"
                                                        binding="#{LogImpFal6.botonIrAlUltimo1}"
                                                        disabled="#{LogImpFal6.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo1"
                                                        imageURL="#{LogImpFal6.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{LogImpFal6.gestor.scriptIrAlUltimo}"
                                                        text="#{LogImpFal6.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{LogImpFal6.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpFal6.botonProcesarFila1_action}"
                                                        binding="#{LogImpFal6.botonProcesarFila1}"
                                                        disabled="#{LogImpFal6.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila1"
                                                        imageURL="#{LogImpFal6.gestor.urlImagenProcesar}"
                                                        onClick="#{LogImpFal6.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{LogImpFal6.asistente.comandoDisponible}"
                                                        text="#{LogImpFal6.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{LogImpFal6.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{LogImpFal6.gestor.tituloConsulta}"/>
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
                                                    binding="#{LogImpFal6.etiquetaIdentificacionFila1}"
                                                    id="etiquetaIdentificacionFila1"
                                                    text="#{LogImpFal6.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{LogImpFal6.gestor.i18n.toolTipEtiquetaIdentificacionFila}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel113"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoIdentificacionFila1"
                                                    style="font-weight: bold"
                                                    text="#{LogImpFal6.gestor.identificacionFila}"/>
                                                <webuijsf:image
                                                    id="imagenFilaProcesada1"
                                                    toolTip="#{LogImpFal6.gestor.toolTipImagenFilaProcesada}"
                                                    url="#{LogImpFal6.gestor.urlImagenFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPanel114"
                                                rendered="#{LogImpFal6.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpFal6.etiquetaDenominacionFilaMaestro1}"
                                                    id="etiquetaDenominacionFilaMaestro1"
                                                    text="?"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel115"
                                                rendered="#{LogImpFal6.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoDenominacionFilaMaestro1"
                                                    style="font-weight: bold"
                                                    text="#{LogImpFal6.gestor.denominacionFilaMaestro}"/>
                                                <webuijsf:image
                                                    id="imagenFilaMaestro1"
                                                    url="#{LogImpFal6.gestor.urlImagenMaestroFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdLogImpFal1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpFal6.labelIdLogImpFal1}"
                                                    id="labelIdLogImpFal1"
                                                    for="campoIdLogImpFal1"
                                                    toolTip="BundleParametros.id_log_imp_fal.log_imp_fal"
                                                    text="identificaci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdLogImpFal2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdLogImpFal1"
                                                    binding="#{LogImpFal6.campoIdLogImpFal1}"
                                                    converter="#{LogImpFal6.converterIdLogImpFal1}"
                                                    readOnly="true"
                                                    text="#{LogImpFal6.logImpFalDataProvider.value['id_log_imp_fal']}"
                                                    toolTip="BundleParametros.id_log_imp_fal.log_imp_fal"
                                                    validatorExpression="#{LogImpFal6.validatorIdLogImpFal1.validate}"/>
                                                <webuijsf:staticText id="campoIdLogImpFal1Texto1"
                                                    binding="#{LogImpFal6.campoIdLogImpFal1Texto1}"
                                                    text="#{LogImpFal6.logImpFalDataProvider.value['id_log_imp_fal']}"/>
                                                <webuijsf:message id="messageIdLogImpFal1"
                                                    for="campoIdLogImpFal1"/>
                                                <webuijsf:helpInline id="helpInlineIdLogImpFal1"
                                                    binding="#{LogImpFal6.helpInlineIdLogImpFal1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_log_imp_fal.log_imp_fal"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridCedula1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpFal6.labelCedula1}"
                                                    id="labelCedula1"
                                                    for="campoCedula1"
                                                    toolTip="BundleParametros.cedula.log_imp_fal"
                                                    text="c&#233;dula"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridCedula2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoCedula1"
                                                    binding="#{LogImpFal6.campoCedula1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpFal6.gestor.filaNoProcesada}"
                                                    text="#{LogImpFal6.logImpFalDataProvider.value['cedula']}"
                                                    toolTip="BundleParametros.cedula.log_imp_fal"
                                                    validatorExpression="#{LogImpFal6.validatorCedula1.validate}"/>
                                                <webuijsf:staticText id="campoCedula1Texto1"
                                                    binding="#{LogImpFal6.campoCedula1Texto1}"
                                                    text="#{LogImpFal6.logImpFalDataProvider.value['cedula']}"/>
                                                <webuijsf:message id="messageCedula1"
                                                    for="campoCedula1"/>
                                                <webuijsf:helpInline id="helpInlineCedula1"
                                                    binding="#{LogImpFal6.helpInlineCedula1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.cedula.log_imp_fal"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPrimerNombre1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpFal6.labelPrimerNombre1}"
                                                    id="labelPrimerNombre1"
                                                    for="campoPrimerNombre1"
                                                    toolTip="BundleParametros.primer_nombre.log_imp_fal"
                                                    text="primer nombre"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPrimerNombre2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoPrimerNombre1"
                                                    binding="#{LogImpFal6.campoPrimerNombre1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpFal6.gestor.filaNoProcesada}"
                                                    text="#{LogImpFal6.logImpFalDataProvider.value['primer_nombre']}"
                                                    toolTip="BundleParametros.primer_nombre.log_imp_fal"
                                                    validatorExpression="#{LogImpFal6.validatorPrimerNombre1.validate}"/>
                                                <webuijsf:staticText id="campoPrimerNombre1Texto1"
                                                    binding="#{LogImpFal6.campoPrimerNombre1Texto1}"
                                                    text="#{LogImpFal6.logImpFalDataProvider.value['primer_nombre']}"/>
                                                <webuijsf:message id="messagePrimerNombre1"
                                                    for="campoPrimerNombre1"/>
                                                <webuijsf:helpInline id="helpInlinePrimerNombre1"
                                                    binding="#{LogImpFal6.helpInlinePrimerNombre1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.primer_nombre.log_imp_fal"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridSegundoNombre1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpFal6.labelSegundoNombre1}"
                                                    id="labelSegundoNombre1"
                                                    for="campoSegundoNombre1"
                                                    toolTip="BundleParametros.segundo_nombre.log_imp_fal"
                                                    text="segundo nombre"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridSegundoNombre2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoSegundoNombre1"
                                                    binding="#{LogImpFal6.campoSegundoNombre1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpFal6.gestor.filaNoProcesada}"
                                                    text="#{LogImpFal6.logImpFalDataProvider.value['segundo_nombre']}"
                                                    toolTip="BundleParametros.segundo_nombre.log_imp_fal"
                                                    validatorExpression="#{LogImpFal6.validatorSegundoNombre1.validate}"/>
                                                <webuijsf:staticText id="campoSegundoNombre1Texto1"
                                                    binding="#{LogImpFal6.campoSegundoNombre1Texto1}"
                                                    text="#{LogImpFal6.logImpFalDataProvider.value['segundo_nombre']}"/>
                                                <webuijsf:message id="messageSegundoNombre1"
                                                    for="campoSegundoNombre1"/>
                                                <webuijsf:helpInline id="helpInlineSegundoNombre1"
                                                    binding="#{LogImpFal6.helpInlineSegundoNombre1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.segundo_nombre.log_imp_fal"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPrimerApellido1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpFal6.labelPrimerApellido1}"
                                                    id="labelPrimerApellido1"
                                                    for="campoPrimerApellido1"
                                                    toolTip="BundleParametros.primer_apellido.log_imp_fal"
                                                    text="primer apellido"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPrimerApellido2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoPrimerApellido1"
                                                    binding="#{LogImpFal6.campoPrimerApellido1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpFal6.gestor.filaNoProcesada}"
                                                    text="#{LogImpFal6.logImpFalDataProvider.value['primer_apellido']}"
                                                    toolTip="BundleParametros.primer_apellido.log_imp_fal"
                                                    validatorExpression="#{LogImpFal6.validatorPrimerApellido1.validate}"/>
                                                <webuijsf:staticText id="campoPrimerApellido1Texto1"
                                                    binding="#{LogImpFal6.campoPrimerApellido1Texto1}"
                                                    text="#{LogImpFal6.logImpFalDataProvider.value['primer_apellido']}"/>
                                                <webuijsf:message id="messagePrimerApellido1"
                                                    for="campoPrimerApellido1"/>
                                                <webuijsf:helpInline id="helpInlinePrimerApellido1"
                                                    binding="#{LogImpFal6.helpInlinePrimerApellido1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.primer_apellido.log_imp_fal"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridSegundoApellido1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpFal6.labelSegundoApellido1}"
                                                    id="labelSegundoApellido1"
                                                    for="campoSegundoApellido1"
                                                    toolTip="BundleParametros.segundo_apellido.log_imp_fal"
                                                    text="segundo apellido"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridSegundoApellido2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoSegundoApellido1"
                                                    binding="#{LogImpFal6.campoSegundoApellido1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpFal6.gestor.filaNoProcesada}"
                                                    text="#{LogImpFal6.logImpFalDataProvider.value['segundo_apellido']}"
                                                    toolTip="BundleParametros.segundo_apellido.log_imp_fal"
                                                    validatorExpression="#{LogImpFal6.validatorSegundoApellido1.validate}"/>
                                                <webuijsf:staticText id="campoSegundoApellido1Texto1"
                                                    binding="#{LogImpFal6.campoSegundoApellido1Texto1}"
                                                    text="#{LogImpFal6.logImpFalDataProvider.value['segundo_apellido']}"/>
                                                <webuijsf:message id="messageSegundoApellido1"
                                                    for="campoSegundoApellido1"/>
                                                <webuijsf:helpInline id="helpInlineSegundoApellido1"
                                                    binding="#{LogImpFal6.helpInlineSegundoApellido1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.segundo_apellido.log_imp_fal"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridApellidoCasada1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpFal6.labelApellidoCasada1}"
                                                    id="labelApellidoCasada1"
                                                    for="campoApellidoCasada1"
                                                    toolTip="BundleParametros.apellido_casada.log_imp_fal"
                                                    text="apellido casada"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridApellidoCasada2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoApellidoCasada1"
                                                    binding="#{LogImpFal6.campoApellidoCasada1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpFal6.gestor.filaNoProcesada}"
                                                    text="#{LogImpFal6.logImpFalDataProvider.value['apellido_casada']}"
                                                    toolTip="BundleParametros.apellido_casada.log_imp_fal"
                                                    validatorExpression="#{LogImpFal6.validatorApellidoCasada1.validate}"/>
                                                <webuijsf:staticText id="campoApellidoCasada1Texto1"
                                                    binding="#{LogImpFal6.campoApellidoCasada1Texto1}"
                                                    text="#{LogImpFal6.logImpFalDataProvider.value['apellido_casada']}"/>
                                                <webuijsf:message id="messageApellidoCasada1"
                                                    for="campoApellidoCasada1"/>
                                                <webuijsf:helpInline id="helpInlineApellidoCasada1"
                                                    binding="#{LogImpFal6.helpInlineApellidoCasada1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.apellido_casada.log_imp_fal"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridDefuncion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpFal6.labelDefuncion1}"
                                                    id="labelDefuncion1"
                                                    for="campoDefuncion1"
                                                    toolTip="BundleParametros.defuncion.log_imp_fal"
                                                    text="defunci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridDefuncion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoDefuncion1"
                                                    binding="#{LogImpFal6.campoDefuncion1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpFal6.gestor.filaNoProcesada}"
                                                    text="#{LogImpFal6.logImpFalDataProvider.value['defuncion']}"
                                                    toolTip="BundleParametros.defuncion.log_imp_fal"
                                                    validatorExpression="#{LogImpFal6.validatorDefuncion1.validate}"/>
                                                <webuijsf:staticText id="campoDefuncion1Texto1"
                                                    binding="#{LogImpFal6.campoDefuncion1Texto1}"
                                                    text="#{LogImpFal6.logImpFalDataProvider.value['defuncion']}"/>
                                                <webuijsf:message id="messageDefuncion1"
                                                    for="campoDefuncion1"/>
                                                <webuijsf:helpInline id="helpInlineDefuncion1"
                                                    binding="#{LogImpFal6.helpInlineDefuncion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.defuncion.log_imp_fal"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsImportado1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpFal6.labelEsImportado1}"
                                                    id="labelEsImportado1"
                                                    for="listaEsImportado1"
                                                    toolTip="BundleParametros.es_importado.log_imp_fal"
                                                    text="importado"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsImportado2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsImportado1"
                                                    binding="#{LogImpFal6.listaEsImportado1}"
                                                    converter="#{LogImpFal6.converterEsImportado1}"
                                                    disabled="#{LogImpFal6.gestor.filaNoProcesada}" required="true"
                                                    items="#{LogImpFal6.asistente.opcionesListaEsImportado1}"
                                                    selected="#{LogImpFal6.logImpFalDataProvider.value['es_importado']}"
                                                    toolTip="BundleParametros.es_importado.log_imp_fal"/>
                                                <webuijsf:staticText id="listaEsImportado1Texto1"
                                                    binding="#{LogImpFal6.listaEsImportado1Texto1}"/>
                                                <webuijsf:message id="messageEsImportado1"
                                                    for="listaEsImportado1"/>
                                                <webuijsf:helpInline id="helpInlineEsImportado1"
                                                    binding="#{LogImpFal6.helpInlineEsImportado1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_importado.log_imp_fal"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridObservacion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpFal6.labelObservacion1}"
                                                    id="labelObservacion1"
                                                    for="campoObservacion1"
                                                    toolTip="BundleParametros.observacion.log_imp_fal"
                                                    text="observaci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridObservacion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoObservacion1"
                                                    binding="#{LogImpFal6.campoObservacion1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpFal6.gestor.filaNoProcesada}"
                                                    text="#{LogImpFal6.logImpFalDataProvider.value['observacion']}"
                                                    toolTip="BundleParametros.observacion.log_imp_fal"
                                                    validatorExpression="#{LogImpFal6.validatorObservacion1.validate}"/>
                                                <webuijsf:staticText id="campoObservacion1Texto1"
                                                    binding="#{LogImpFal6.campoObservacion1Texto1}"
                                                    text="#{LogImpFal6.logImpFalDataProvider.value['observacion']}"/>
                                                <webuijsf:message id="messageObservacion1"
                                                    for="campoObservacion1"/>
                                                <webuijsf:helpInline id="helpInlineObservacion1"
                                                    binding="#{LogImpFal6.helpInlineObservacion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.observacion.log_imp_fal"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaHoraTransaccion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpFal6.labelFechaHoraTransaccion1}"
                                                    id="labelFechaHoraTransaccion1"
                                                    for="campoFechaHoraTransaccion1"
                                                    toolTip="BundleParametros.fecha_hora_transaccion.log_imp_fal"
                                                    text="fecha hora transacci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaHoraTransaccion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoFechaHoraTransaccion1"
                                                    binding="#{LogImpFal6.campoFechaHoraTransaccion1}"
                                                    converter="#{LogImpFal6.converterFechaHoraTransaccion1}"
                                                    readOnly="#{LogImpFal6.gestor.filaNoProcesada}" required="true"
                                                    text="#{LogImpFal6.logImpFalDataProvider.value['fecha_hora_transaccion']}"
                                                    toolTip="BundleParametros.fecha_hora_transaccion.log_imp_fal"/>
                                                <webuijsf:staticText id="campoFechaHoraTransaccion1Texto1"
                                                    binding="#{LogImpFal6.campoFechaHoraTransaccion1Texto1}"
                                                    converter="#{LogImpFal6.converterFechaHoraTransaccion1}"
                                                    text="#{LogImpFal6.logImpFalDataProvider.value['fecha_hora_transaccion']}"/>
                                                <webuijsf:message id="messageFechaHoraTransaccion1"
                                                    for="campoFechaHoraTransaccion1"/>
                                                <webuijsf:helpInline id="helpInlineFechaHoraTransaccion1"
                                                    binding="#{LogImpFal6.helpInlineFechaHoraTransaccion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_hora_transaccion.log_imp_fal"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNombreArchivo1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpFal6.labelNombreArchivo1}"
                                                    id="labelNombreArchivo1"
                                                    for="campoNombreArchivo1"
                                                    toolTip="BundleParametros.nombre_archivo.log_imp_fal"
                                                    text="nombre archivo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNombreArchivo2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoNombreArchivo1"
                                                    binding="#{LogImpFal6.campoNombreArchivo1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpFal6.gestor.filaNoProcesada}"
                                                    text="#{LogImpFal6.logImpFalDataProvider.value['nombre_archivo']}"
                                                    toolTip="BundleParametros.nombre_archivo.log_imp_fal"
                                                    validatorExpression="#{LogImpFal6.validatorNombreArchivo1.validate}"/>
                                                <webuijsf:staticText id="campoNombreArchivo1Texto1"
                                                    binding="#{LogImpFal6.campoNombreArchivo1Texto1}"
                                                    text="#{LogImpFal6.logImpFalDataProvider.value['nombre_archivo']}"/>
                                                <webuijsf:button id="campoNombreArchivo1Boton3"
                                                    binding="#{LogImpFal6.campoNombreArchivo1Boton3}"
                                                    onClick="#{LogImpFal6.asistente.scriptCampoNombreArchivo1Boton3}"
                                                    rendered="#{LogImpFal6.asistente.campoNombreArchivo1Boton3Rendered}"
                                                    text="#{LogImpFal6.asistente.textCampoNombreArchivo1Boton3}"
                                                    toolTip="#{LogImpFal6.asistente.toolTipCampoNombreArchivo1Boton3}"/>
                                                <webuijsf:message id="messageNombreArchivo1"
                                                    for="campoNombreArchivo1"/>
                                                <webuijsf:helpInline id="helpInlineNombreArchivo1"
                                                    binding="#{LogImpFal6.helpInlineNombreArchivo1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.nombre_archivo.log_imp_fal"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridCodigoArchivo1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpFal6.labelCodigoArchivo1}"
                                                    id="labelCodigoArchivo1"
                                                    for="campoCodigoArchivo1"
                                                    toolTip="BundleParametros.codigo_archivo.log_imp_fal"
                                                    text="c&#243;digo archivo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridCodigoArchivo2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoCodigoArchivo1"
                                                    binding="#{LogImpFal6.campoCodigoArchivo1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpFal6.gestor.filaNoProcesada}"
                                                    text="#{LogImpFal6.logImpFalDataProvider.value['codigo_archivo']}"
                                                    toolTip="BundleParametros.codigo_archivo.log_imp_fal"
                                                    validatorExpression="#{LogImpFal6.validatorCodigoArchivo1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoArchivo1Texto1"
                                                    binding="#{LogImpFal6.campoCodigoArchivo1Texto1}"
                                                    text="#{LogImpFal6.logImpFalDataProvider.value['codigo_archivo']}"/>
                                                <webuijsf:message id="messageCodigoArchivo1"
                                                    for="campoCodigoArchivo1"/>
                                                <webuijsf:helpInline id="helpInlineCodigoArchivo1"
                                                    binding="#{LogImpFal6.helpInlineCodigoArchivo1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.codigo_archivo.log_imp_fal"
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
                                                        actionExpression="#{LogImpFal6.botonIrAlPrimero2_action}"
                                                        binding="#{LogImpFal6.botonIrAlPrimero2}"
                                                        disabled="#{LogImpFal6.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero2"
                                                        imageURL="#{LogImpFal6.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{LogImpFal6.gestor.scriptIrAlPrimero}"
                                                        text="#{LogImpFal6.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{LogImpFal6.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpFal6.botonIrAlAnterior2_action}"
                                                        binding="#{LogImpFal6.botonIrAlAnterior2}"
                                                        disabled="#{LogImpFal6.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior2"
                                                        imageURL="#{LogImpFal6.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{LogImpFal6.gestor.scriptIrAlAnterior}"
                                                        text="#{LogImpFal6.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{LogImpFal6.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpFal6.botonIrAlSiguiente2_action}"
                                                        binding="#{LogImpFal6.botonIrAlSiguiente2}"
                                                        disabled="#{LogImpFal6.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente2"
                                                        imageURL="#{LogImpFal6.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{LogImpFal6.gestor.scriptIrAlSiguiente}"
                                                        text="#{LogImpFal6.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{LogImpFal6.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpFal6.botonIrAlUltimo2_action}"
                                                        binding="#{LogImpFal6.botonIrAlUltimo2}"
                                                        disabled="#{LogImpFal6.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo2"
                                                        imageURL="#{LogImpFal6.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{LogImpFal6.gestor.scriptIrAlUltimo}"
                                                        text="#{LogImpFal6.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{LogImpFal6.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpFal6.botonProcesarFila2_action}"
                                                        binding="#{LogImpFal6.botonProcesarFila2}"
                                                        disabled="#{LogImpFal6.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila2"
                                                        imageURL="#{LogImpFal6.gestor.urlImagenProcesar}"
                                                        onClick="#{LogImpFal6.scriptAbrirVentanaProcesarFila2}"
                                                        rendered="#{LogImpFal6.asistente.comandoDisponible}"
                                                        text="#{LogImpFal6.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{LogImpFal6.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{LogImpFal6.gestor.mensajeCambiosPorConfirmar}"/>
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
                                                    actionExpression="#{LogImpFal6.botonAgregar1_action}"
                                                    binding="#{LogImpFal6.botonAgregar1}"
                                                    disabled="#{LogImpFal6.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{LogImpFal6.gestor.scriptAgregar}"
                                                    rendered="#{LogImpFal6.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpFal6.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{LogImpFal6.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{LogImpFal6.listaFuncionEdicion1}"
                                                    converter="#{LogImpFal6.converterListaFuncionEdicion1}"
                                                    disabled="#{LogImpFal6.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{LogImpFal6.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{LogImpFal6.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{LogImpFal6.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{LogImpFal6.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpFal6.botonEditar1_action}"
                                                    binding="#{LogImpFal6.botonEditar1}"
                                                    disabled="#{LogImpFal6.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{LogImpFal6.gestor.scriptEditar}"
                                                    rendered="#{LogImpFal6.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpFal6.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{LogImpFal6.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpFal6.botonEliminar1_action}"
                                                    binding="#{LogImpFal6.botonEliminar1}"
                                                    disabled="#{LogImpFal6.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{LogImpFal6.gestor.scriptEliminar}"
                                                    rendered="#{LogImpFal6.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpFal6.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{LogImpFal6.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpFal6.botonAplicar1_action}"
                                                    binding="#{LogImpFal6.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{LogImpFal6.gestor.scriptAplicar}"
                                                    rendered="#{LogImpFal6.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpFal6.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{LogImpFal6.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpFal6.botonDeshacer1_action}"
                                                    binding="#{LogImpFal6.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{LogImpFal6.gestor.scriptDeshacer}"
                                                    rendered="#{LogImpFal6.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpFal6.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{LogImpFal6.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpFal6.botonConfirmar1_action}"
                                                    binding="#{LogImpFal6.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{LogImpFal6.gestor.scriptConfirmar}"
                                                    rendered="#{LogImpFal6.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpFal6.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{LogImpFal6.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpFal6.botonDescartar1_action}"
                                                    binding="#{LogImpFal6.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{LogImpFal6.gestor.scriptDescartar}"
                                                    rendered="#{LogImpFal6.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpFal6.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{LogImpFal6.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{LogImpFal6.listaFuncionAccion1}"
                                                    converter="#{LogImpFal6.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{LogImpFal6.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{LogImpFal6.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{LogImpFal6.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{LogImpFal6.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpFal6.botonProcesar1_action}"
                                                    binding="#{LogImpFal6.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{LogImpFal6.gestor.scriptProcesar}"
                                                    rendered="#{LogImpFal6.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpFal6.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{LogImpFal6.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpFal6.botonRefrescar1_action}"
                                                    binding="#{LogImpFal6.botonRefrescar1}"
                                                    disabled="#{LogImpFal6.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{LogImpFal6.gestor.scriptRefrescar}"
                                                    rendered="#{LogImpFal6.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpFal6.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{LogImpFal6.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpFal6.botonReconsultar1_action}"
                                                    binding="#{LogImpFal6.botonReconsultar1}"
                                                    disabled="#{LogImpFal6.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{LogImpFal6.gestor.scriptReconsultar}"
                                                    rendered="#{LogImpFal6.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpFal6.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{LogImpFal6.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpFal6.botonRetornar1_action}"
                                                    binding="#{LogImpFal6.botonRetornar1}"
                                                    disabled="#{LogImpFal6.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{LogImpFal6.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{LogImpFal6.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpFal6.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{LogImpFal6.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel125"
                                                rendered="#{LogImpFal6.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{LogImpFal6.imageHyperlink1_action}"
                                                    binding="#{LogImpFal6.imageHyperlink1}"
                                                    disabled="#{LogImpFal6.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{LogImpFal6.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{LogImpFal6.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{LogImpFal6.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.LogImpFal6_imageHyperlink1_toolTip}"/>
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
