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
                    focus="#{LogImpHog6.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{LogImpHog6.gestor.preserveFocus}"
                    preserveScroll="#{LogImpHog6.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{LogImpHog6.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | campoIdLogImpHog1 campoObservaciones1 campoLetraCi1 listaEsImportado1 campoObservacion1 campoFechaHoraTransaccion1 campoNombreArchivo1 campoCodigoArchivo1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | | , virtualForm3 | listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{LogImpHog6.breadcrumbs1}" 
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
                                                    rendered="#{LogImpHog6.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{LogImpHog6.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{LogImpHog6.gestor.mensajeDisponible}"
                                                    text="#{LogImpHog6.gestor.mensaje}"
                                                    url="#{LogImpHog6.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            id="gridPanel104"
                                            rendered="#{LogImpHog6.gestor.filaDisponible}"
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
                                                        actionExpression="#{LogImpHog6.botonIrAlPrimero1_action}"
                                                        binding="#{LogImpHog6.botonIrAlPrimero1}"
                                                        disabled="#{LogImpHog6.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero1"
                                                        imageURL="#{LogImpHog6.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{LogImpHog6.gestor.scriptIrAlPrimero}"
                                                        text="#{LogImpHog6.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{LogImpHog6.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpHog6.botonIrAlAnterior1_action}"
                                                        binding="#{LogImpHog6.botonIrAlAnterior1}"
                                                        disabled="#{LogImpHog6.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior1"
                                                        imageURL="#{LogImpHog6.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{LogImpHog6.gestor.scriptIrAlAnterior}"
                                                        text="#{LogImpHog6.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{LogImpHog6.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpHog6.botonIrAlSiguiente1_action}"
                                                        binding="#{LogImpHog6.botonIrAlSiguiente1}"
                                                        disabled="#{LogImpHog6.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente1"
                                                        imageURL="#{LogImpHog6.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{LogImpHog6.gestor.scriptIrAlSiguiente}"
                                                        text="#{LogImpHog6.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{LogImpHog6.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpHog6.botonIrAlUltimo1_action}"
                                                        binding="#{LogImpHog6.botonIrAlUltimo1}"
                                                        disabled="#{LogImpHog6.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo1"
                                                        imageURL="#{LogImpHog6.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{LogImpHog6.gestor.scriptIrAlUltimo}"
                                                        text="#{LogImpHog6.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{LogImpHog6.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpHog6.botonProcesarFila1_action}"
                                                        binding="#{LogImpHog6.botonProcesarFila1}"
                                                        disabled="#{LogImpHog6.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila1"
                                                        imageURL="#{LogImpHog6.gestor.urlImagenProcesar}"
                                                        onClick="#{LogImpHog6.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{LogImpHog6.asistente.comandoDisponible}"
                                                        text="#{LogImpHog6.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{LogImpHog6.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{LogImpHog6.gestor.tituloConsulta}"/>
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
                                                    binding="#{LogImpHog6.etiquetaIdentificacionFila1}"
                                                    id="etiquetaIdentificacionFila1"
                                                    text="#{LogImpHog6.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{LogImpHog6.gestor.i18n.toolTipEtiquetaIdentificacionFila}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel113"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoIdentificacionFila1"
                                                    style="font-weight: bold"
                                                    text="#{LogImpHog6.gestor.identificacionFila}"/>
                                                <webuijsf:image
                                                    id="imagenFilaProcesada1"
                                                    toolTip="#{LogImpHog6.gestor.toolTipImagenFilaProcesada}"
                                                    url="#{LogImpHog6.gestor.urlImagenFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPanel114"
                                                rendered="#{LogImpHog6.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHog6.etiquetaDenominacionFilaMaestro1}"
                                                    id="etiquetaDenominacionFilaMaestro1"
                                                    text="?"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel115"
                                                rendered="#{LogImpHog6.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoDenominacionFilaMaestro1"
                                                    style="font-weight: bold"
                                                    text="#{LogImpHog6.gestor.denominacionFilaMaestro}"/>
                                                <webuijsf:image
                                                    id="imagenFilaMaestro1"
                                                    url="#{LogImpHog6.gestor.urlImagenMaestroFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdLogImpHog1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHog6.labelIdLogImpHog1}"
                                                    id="labelIdLogImpHog1"
                                                    for="campoIdLogImpHog1"
                                                    text="identificaci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdLogImpHog2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdLogImpHog1"
                                                    binding="#{LogImpHog6.campoIdLogImpHog1}"
                                                    converter="#{LogImpHog6.converterIdLogImpHog1}"
                                                    readOnly="true"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['id_log_imp_hog']}"
                                                    toolTip="BundleParametros.id_log_imp_hog.log_imp_hog"
                                                    validatorExpression="#{LogImpHog6.validatorIdLogImpHog1.validate}"/>
                                                <webuijsf:staticText id="campoIdLogImpHog1Texto1"
                                                    binding="#{LogImpHog6.campoIdLogImpHog1Texto1}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['id_log_imp_hog']}"/>
                                                <webuijsf:message id="messageIdLogImpHog1"
                                                    for="campoIdLogImpHog1"/>
                                                <webuijsf:helpInline id="helpInlineIdLogImpHog1"
                                                    binding="#{LogImpHog6.helpInlineIdLogImpHog1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_log_imp_hog.log_imp_hog"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridObservaciones1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHog6.labelObservaciones1}"
                                                    id="labelObservaciones1"
                                                    for="campoObservaciones1"
                                                    text="observaciones"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridObservaciones2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoObservaciones1"
                                                    binding="#{LogImpHog6.campoObservaciones1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHog6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['observaciones']}"
                                                    toolTip="BundleParametros.observaciones.log_imp_hog"
                                                    validatorExpression="#{LogImpHog6.validatorObservaciones1.validate}"/>
                                                <webuijsf:staticText id="campoObservaciones1Texto1"
                                                    binding="#{LogImpHog6.campoObservaciones1Texto1}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['observaciones']}"/>
                                                <webuijsf:message id="messageObservaciones1"
                                                    for="campoObservaciones1"/>
                                                <webuijsf:helpInline id="helpInlineObservaciones1"
                                                    binding="#{LogImpHog6.helpInlineObservaciones1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.observaciones.log_imp_hog"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridLetraCi1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHog6.labelLetraCi1}"
                                                    id="labelLetraCi1"
                                                    for="campoLetraCi1"
                                                    text="letra ci"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridLetraCi2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoLetraCi1"
                                                    binding="#{LogImpHog6.campoLetraCi1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHog6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['letra_ci']}"
                                                    toolTip="BundleParametros.letra_ci.log_imp_hog"
                                                    validatorExpression="#{LogImpHog6.validatorLetraCi1.validate}"/>
                                                <webuijsf:staticText id="campoLetraCi1Texto1"
                                                    binding="#{LogImpHog6.campoLetraCi1Texto1}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['letra_ci']}"/>
                                                <webuijsf:message id="messageLetraCi1"
                                                    for="campoLetraCi1"/>
                                                <webuijsf:helpInline id="helpInlineLetraCi1"
                                                    binding="#{LogImpHog6.helpInlineLetraCi1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.letra_ci.log_imp_hog"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsImportado1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHog6.labelEsImportado1}"
                                                    id="labelEsImportado1"
                                                    for="listaEsImportado1"
                                                    text="importado"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsImportado2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsImportado1"
                                                    binding="#{LogImpHog6.listaEsImportado1}"
                                                    converter="#{LogImpHog6.converterEsImportado1}"
                                                    disabled="#{LogImpHog6.gestor.filaNoProcesada}" required="true"
                                                    items="#{LogImpHog6.asistente.opcionesListaEsImportado1}"
                                                    selected="#{LogImpHog6.logImpHogDataProvider.value['es_importado']}"
                                                    toolTip="BundleParametros.es_importado.log_imp_hog"/>
                                                <webuijsf:staticText id="listaEsImportado1Texto1"
                                                    binding="#{LogImpHog6.listaEsImportado1Texto1}"/>
                                                <webuijsf:message id="messageEsImportado1"
                                                    for="listaEsImportado1"/>
                                                <webuijsf:helpInline id="helpInlineEsImportado1"
                                                    binding="#{LogImpHog6.helpInlineEsImportado1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_importado.log_imp_hog"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridObservacion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHog6.labelObservacion1}"
                                                    id="labelObservacion1"
                                                    for="campoObservacion1"
                                                    text="observaci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridObservacion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoObservacion1"
                                                    binding="#{LogImpHog6.campoObservacion1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHog6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['observacion']}"
                                                    toolTip="BundleParametros.observacion.log_imp_hog"
                                                    validatorExpression="#{LogImpHog6.validatorObservacion1.validate}"/>
                                                <webuijsf:staticText id="campoObservacion1Texto1"
                                                    binding="#{LogImpHog6.campoObservacion1Texto1}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['observacion']}"/>
                                                <webuijsf:message id="messageObservacion1"
                                                    for="campoObservacion1"/>
                                                <webuijsf:helpInline id="helpInlineObservacion1"
                                                    binding="#{LogImpHog6.helpInlineObservacion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.observacion.log_imp_hog"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaHoraTransaccion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHog6.labelFechaHoraTransaccion1}"
                                                    id="labelFechaHoraTransaccion1"
                                                    for="campoFechaHoraTransaccion1"
                                                    text="fecha hora transacci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaHoraTransaccion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoFechaHoraTransaccion1"
                                                    binding="#{LogImpHog6.campoFechaHoraTransaccion1}"
                                                    converter="#{LogImpHog6.converterFechaHoraTransaccion1}"
                                                    readOnly="#{LogImpHog6.gestor.filaNoProcesada}" required="true"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['fecha_hora_transaccion']}"
                                                    toolTip="BundleParametros.fecha_hora_transaccion.log_imp_hog"/>
                                                <webuijsf:staticText id="campoFechaHoraTransaccion1Texto1"
                                                    binding="#{LogImpHog6.campoFechaHoraTransaccion1Texto1}"
                                                    converter="#{LogImpHog6.converterFechaHoraTransaccion1}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['fecha_hora_transaccion']}"/>
                                                <webuijsf:message id="messageFechaHoraTransaccion1"
                                                    for="campoFechaHoraTransaccion1"/>
                                                <webuijsf:helpInline id="helpInlineFechaHoraTransaccion1"
                                                    binding="#{LogImpHog6.helpInlineFechaHoraTransaccion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_hora_transaccion.log_imp_hog"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNombreArchivo1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHog6.labelNombreArchivo1}"
                                                    id="labelNombreArchivo1"
                                                    for="campoNombreArchivo1"
                                                    text="nombre archivo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNombreArchivo2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoNombreArchivo1"
                                                    binding="#{LogImpHog6.campoNombreArchivo1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHog6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['nombre_archivo']}"
                                                    toolTip="BundleParametros.nombre_archivo.log_imp_hog"
                                                    validatorExpression="#{LogImpHog6.validatorNombreArchivo1.validate}"/>
                                                <webuijsf:staticText id="campoNombreArchivo1Texto1"
                                                    binding="#{LogImpHog6.campoNombreArchivo1Texto1}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['nombre_archivo']}"/>
                                                <webuijsf:button id="campoNombreArchivo1Boton3"
                                                    binding="#{LogImpHog6.campoNombreArchivo1Boton3}"
                                                    onClick="#{LogImpHog6.asistente.scriptCampoNombreArchivo1Boton3}"
                                                    rendered="#{LogImpHog6.asistente.campoNombreArchivo1Boton3Rendered}"
                                                    text="#{LogImpHog6.asistente.textCampoNombreArchivo1Boton3}"
                                                    toolTip="#{LogImpHog6.asistente.toolTipCampoNombreArchivo1Boton3}"/>
                                                <webuijsf:message id="messageNombreArchivo1"
                                                    for="campoNombreArchivo1"/>
                                                <webuijsf:helpInline id="helpInlineNombreArchivo1"
                                                    binding="#{LogImpHog6.helpInlineNombreArchivo1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.nombre_archivo.log_imp_hog"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridCodigoArchivo1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHog6.labelCodigoArchivo1}"
                                                    id="labelCodigoArchivo1"
                                                    for="campoCodigoArchivo1"
                                                    text="c&#243;digo archivo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridCodigoArchivo2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoCodigoArchivo1"
                                                    binding="#{LogImpHog6.campoCodigoArchivo1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHog6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['codigo_archivo']}"
                                                    toolTip="BundleParametros.codigo_archivo.log_imp_hog"
                                                    validatorExpression="#{LogImpHog6.validatorCodigoArchivo1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoArchivo1Texto1"
                                                    binding="#{LogImpHog6.campoCodigoArchivo1Texto1}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['codigo_archivo']}"/>
                                                <webuijsf:message id="messageCodigoArchivo1"
                                                    for="campoCodigoArchivo1"/>
                                                <webuijsf:helpInline id="helpInlineCodigoArchivo1"
                                                    binding="#{LogImpHog6.helpInlineCodigoArchivo1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.codigo_archivo.log_imp_hog"
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
                                                        actionExpression="#{LogImpHog6.botonIrAlPrimero2_action}"
                                                        binding="#{LogImpHog6.botonIrAlPrimero2}"
                                                        disabled="#{LogImpHog6.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero2"
                                                        imageURL="#{LogImpHog6.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{LogImpHog6.gestor.scriptIrAlPrimero}"
                                                        text="#{LogImpHog6.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{LogImpHog6.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpHog6.botonIrAlAnterior2_action}"
                                                        binding="#{LogImpHog6.botonIrAlAnterior2}"
                                                        disabled="#{LogImpHog6.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior2"
                                                        imageURL="#{LogImpHog6.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{LogImpHog6.gestor.scriptIrAlAnterior}"
                                                        text="#{LogImpHog6.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{LogImpHog6.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpHog6.botonIrAlSiguiente2_action}"
                                                        binding="#{LogImpHog6.botonIrAlSiguiente2}"
                                                        disabled="#{LogImpHog6.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente2"
                                                        imageURL="#{LogImpHog6.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{LogImpHog6.gestor.scriptIrAlSiguiente}"
                                                        text="#{LogImpHog6.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{LogImpHog6.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpHog6.botonIrAlUltimo2_action}"
                                                        binding="#{LogImpHog6.botonIrAlUltimo2}"
                                                        disabled="#{LogImpHog6.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo2"
                                                        imageURL="#{LogImpHog6.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{LogImpHog6.gestor.scriptIrAlUltimo}"
                                                        text="#{LogImpHog6.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{LogImpHog6.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpHog6.botonProcesarFila2_action}"
                                                        binding="#{LogImpHog6.botonProcesarFila2}"
                                                        disabled="#{LogImpHog6.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila2"
                                                        imageURL="#{LogImpHog6.gestor.urlImagenProcesar}"
                                                        onClick="#{LogImpHog6.scriptAbrirVentanaProcesarFila2}"
                                                        rendered="#{LogImpHog6.asistente.comandoDisponible}"
                                                        text="#{LogImpHog6.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{LogImpHog6.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{LogImpHog6.gestor.mensajeCambiosPorConfirmar}"/>
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
                                                    actionExpression="#{LogImpHog6.botonAgregar1_action}"
                                                    binding="#{LogImpHog6.botonAgregar1}"
                                                    disabled="#{LogImpHog6.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{LogImpHog6.gestor.scriptAgregar}"
                                                    rendered="#{LogImpHog6.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpHog6.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{LogImpHog6.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{LogImpHog6.listaFuncionEdicion1}"
                                                    converter="#{LogImpHog6.converterListaFuncionEdicion1}"
                                                    disabled="#{LogImpHog6.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{LogImpHog6.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{LogImpHog6.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{LogImpHog6.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{LogImpHog6.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpHog6.botonEditar1_action}"
                                                    binding="#{LogImpHog6.botonEditar1}"
                                                    disabled="#{LogImpHog6.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{LogImpHog6.gestor.scriptEditar}"
                                                    rendered="#{LogImpHog6.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpHog6.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{LogImpHog6.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpHog6.botonEliminar1_action}"
                                                    binding="#{LogImpHog6.botonEliminar1}"
                                                    disabled="#{LogImpHog6.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{LogImpHog6.gestor.scriptEliminar}"
                                                    rendered="#{LogImpHog6.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpHog6.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{LogImpHog6.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpHog6.botonAplicar1_action}"
                                                    binding="#{LogImpHog6.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{LogImpHog6.gestor.scriptAplicar}"
                                                    rendered="#{LogImpHog6.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpHog6.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{LogImpHog6.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpHog6.botonDeshacer1_action}"
                                                    binding="#{LogImpHog6.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{LogImpHog6.gestor.scriptDeshacer}"
                                                    rendered="#{LogImpHog6.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpHog6.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{LogImpHog6.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpHog6.botonConfirmar1_action}"
                                                    binding="#{LogImpHog6.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{LogImpHog6.gestor.scriptConfirmar}"
                                                    rendered="#{LogImpHog6.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpHog6.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{LogImpHog6.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpHog6.botonDescartar1_action}"
                                                    binding="#{LogImpHog6.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{LogImpHog6.gestor.scriptDescartar}"
                                                    rendered="#{LogImpHog6.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpHog6.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{LogImpHog6.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{LogImpHog6.listaFuncionAccion1}"
                                                    converter="#{LogImpHog6.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{LogImpHog6.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{LogImpHog6.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{LogImpHog6.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{LogImpHog6.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpHog6.botonProcesar1_action}"
                                                    binding="#{LogImpHog6.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{LogImpHog6.gestor.scriptProcesar}"
                                                    rendered="#{LogImpHog6.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpHog6.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{LogImpHog6.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpHog6.botonRefrescar1_action}"
                                                    binding="#{LogImpHog6.botonRefrescar1}"
                                                    disabled="#{LogImpHog6.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{LogImpHog6.gestor.scriptRefrescar}"
                                                    rendered="#{LogImpHog6.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpHog6.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{LogImpHog6.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpHog6.botonReconsultar1_action}"
                                                    binding="#{LogImpHog6.botonReconsultar1}"
                                                    disabled="#{LogImpHog6.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{LogImpHog6.gestor.scriptReconsultar}"
                                                    rendered="#{LogImpHog6.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpHog6.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{LogImpHog6.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpHog6.botonRetornar1_action}"
                                                    binding="#{LogImpHog6.botonRetornar1}"
                                                    disabled="#{LogImpHog6.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{LogImpHog6.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{LogImpHog6.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpHog6.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{LogImpHog6.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel125"
                                                rendered="#{LogImpHog6.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{LogImpHog6.imageHyperlink1_action}"
                                                    binding="#{LogImpHog6.imageHyperlink1}"
                                                    disabled="#{LogImpHog6.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{LogImpHog6.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{LogImpHog6.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{LogImpHog6.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.LogImpHog6_imageHyperlink1_toolTip}"/>
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
