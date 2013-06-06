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
                    focus="#{VisitaCenso2.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{VisitaCenso2.gestor.preserveFocus}"
                    preserveScroll="#{VisitaCenso2.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{VisitaCenso2.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | campoIdVisitaCenso1 campoIdPotencialBen1 campoIdFuncionarioCensista1 campoFechaVisita1 campoObservaciones1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | | , virtualForm3 | listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{VisitaCenso2.breadcrumbs1}" 
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
                                                    rendered="#{VisitaCenso2.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{VisitaCenso2.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{VisitaCenso2.gestor.mensajeDisponible}"
                                                    text="#{VisitaCenso2.gestor.mensaje}"
                                                    url="#{VisitaCenso2.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            id="gridPanel104"
                                            rendered="#{VisitaCenso2.gestor.filaDisponible}"
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
                                                        actionExpression="#{VisitaCenso2.botonIrAlPrimero1_action}"
                                                        binding="#{VisitaCenso2.botonIrAlPrimero1}"
                                                        disabled="#{VisitaCenso2.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero1"
                                                        imageURL="#{VisitaCenso2.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{VisitaCenso2.gestor.scriptIrAlPrimero}"
                                                        text="#{VisitaCenso2.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{VisitaCenso2.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{VisitaCenso2.botonIrAlAnterior1_action}"
                                                        binding="#{VisitaCenso2.botonIrAlAnterior1}"
                                                        disabled="#{VisitaCenso2.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior1"
                                                        imageURL="#{VisitaCenso2.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{VisitaCenso2.gestor.scriptIrAlAnterior}"
                                                        text="#{VisitaCenso2.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{VisitaCenso2.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{VisitaCenso2.botonIrAlSiguiente1_action}"
                                                        binding="#{VisitaCenso2.botonIrAlSiguiente1}"
                                                        disabled="#{VisitaCenso2.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente1"
                                                        imageURL="#{VisitaCenso2.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{VisitaCenso2.gestor.scriptIrAlSiguiente}"
                                                        text="#{VisitaCenso2.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{VisitaCenso2.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{VisitaCenso2.botonIrAlUltimo1_action}"
                                                        binding="#{VisitaCenso2.botonIrAlUltimo1}"
                                                        disabled="#{VisitaCenso2.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo1"
                                                        imageURL="#{VisitaCenso2.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{VisitaCenso2.gestor.scriptIrAlUltimo}"
                                                        text="#{VisitaCenso2.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{VisitaCenso2.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{VisitaCenso2.botonProcesarFila1_action}"
                                                        binding="#{VisitaCenso2.botonProcesarFila1}"
                                                        disabled="#{VisitaCenso2.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila1"
                                                        imageURL="#{VisitaCenso2.gestor.urlImagenProcesar}"
                                                        onClick="#{VisitaCenso2.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{VisitaCenso2.asistente.comandoDisponible}"
                                                        text="#{VisitaCenso2.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{VisitaCenso2.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{VisitaCenso2.gestor.tituloConsulta}"/>
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
                                                    binding="#{VisitaCenso2.etiquetaIdentificacionFila1}"
                                                    id="etiquetaIdentificacionFila1"
                                                    text="#{VisitaCenso2.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{VisitaCenso2.gestor.i18n.toolTipEtiquetaIdentificacionFila}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel113"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoIdentificacionFila1"
                                                    style="font-weight: bold"
                                                    text="#{VisitaCenso2.gestor.identificacionFila}"/>
                                                <webuijsf:image
                                                    id="imagenFilaProcesada1"
                                                    toolTip="#{VisitaCenso2.gestor.toolTipImagenFilaProcesada}"
                                                    url="#{VisitaCenso2.gestor.urlImagenFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPanel114"
                                                rendered="#{VisitaCenso2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{VisitaCenso2.etiquetaDenominacionFilaMaestro1}"
                                                    id="etiquetaDenominacionFilaMaestro1"
                                                    text="?"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel115"
                                                rendered="#{VisitaCenso2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoDenominacionFilaMaestro1"
                                                    style="font-weight: bold"
                                                    text="#{VisitaCenso2.gestor.denominacionFilaMaestro}"/>
                                                <webuijsf:image
                                                    id="imagenFilaMaestro1"
                                                    url="#{VisitaCenso2.gestor.urlImagenMaestroFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdVisitaCenso1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{VisitaCenso2.labelIdVisitaCenso1}"
                                                    id="labelIdVisitaCenso1"
                                                    for="campoIdVisitaCenso1"
                                                    toolTip="BundleParametros.id_visita_censo.visita_censo"
                                                    text="identificaci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdVisitaCenso2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdVisitaCenso1"
                                                    binding="#{VisitaCenso2.campoIdVisitaCenso1}"
                                                    converter="#{VisitaCenso2.converterIdVisitaCenso1}"
                                                    readOnly="true"
                                                    text="#{VisitaCenso2.visitaCensoDataProvider.value['id_visita_censo']}"
                                                    toolTip="BundleParametros.id_visita_censo.visita_censo"
                                                    validatorExpression="#{VisitaCenso2.validatorIdVisitaCenso1.validate}"/>
                                                <webuijsf:staticText id="campoIdVisitaCenso1Texto1"
                                                    binding="#{VisitaCenso2.campoIdVisitaCenso1Texto1}"
                                                    text="#{VisitaCenso2.visitaCensoDataProvider.value['id_visita_censo']}"/>
                                                <webuijsf:message id="messageIdVisitaCenso1"
                                                    for="campoIdVisitaCenso1"/>
                                                <webuijsf:helpInline id="helpInlineIdVisitaCenso1"
                                                    binding="#{VisitaCenso2.helpInlineIdVisitaCenso1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_visita_censo.visita_censo"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdPotencialBen1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{VisitaCenso2.labelIdPotencialBen1}"
                                                    id="labelIdPotencialBen1"
                                                    for="campoIdPotencialBen1"
                                                    toolTip="BundleParametros.id_potencial_ben.visita_censo"
                                                    text="potencial beneficiario"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdPotencialBen2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdPotencialBen1"
                                                    binding="#{VisitaCenso2.campoIdPotencialBen1}"
                                                    readOnly="#{VisitaCenso2.gestor.filaNoProcesada}" required="true"
                                                    text="#{VisitaCenso2.asistente.textoCampoIdPotencialBen1}"
                                                    toolTip="#{VisitaCenso2.asistente.toolTipCampoIdPotencialBen1}"
                                                    validatorExpression="#{VisitaCenso2.campoIdPotencialBen1_validate}"/>
                                                <webuijsf:staticText id="campoIdPotencialBen1Texto1"
                                                    binding="#{VisitaCenso2.campoIdPotencialBen1Texto1}"
                                                    text="#{VisitaCenso2.visitaCensoDataProvider.value['codigo_potencial_ben_1x1y3']}"/>
                                                <webuijsf:button id="campoIdPotencialBen1Boton1"
                                                    binding="#{VisitaCenso2.campoIdPotencialBen1Boton1}"
                                                    onClick="#{VisitaCenso2.asistente.scriptCampoIdPotencialBen1Boton1}"/>
                                                <webuijsf:button id="campoIdPotencialBen1Boton3"
                                                    binding="#{VisitaCenso2.campoIdPotencialBen1Boton3}"
                                                    onClick="#{VisitaCenso2.asistente.scriptCampoIdPotencialBen1Boton2}"
                                                    rendered="#{VisitaCenso2.asistente.campoIdPotencialBen1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdPotencialBen1"
                                                    for="campoIdPotencialBen1"/>
                                                <webuijsf:helpInline id="helpInlineIdPotencialBen1"
                                                    binding="#{VisitaCenso2.helpInlineIdPotencialBen1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_potencial_ben.visita_censo"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdPotencialBen3"
                                                rendered="#{VisitaCenso2.asistente.campoIdPotencialBen1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{VisitaCenso2.labelIdPotencialBen2}"
                                                    id="labelIdPotencialBen2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre potencial beneficiario"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdPotencialBen4"
                                                rendered="#{VisitaCenso2.asistente.campoIdPotencialBen1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{VisitaCenso2.campoIdPotencialBen1Texto2}"
                                                    text="#{VisitaCenso2.visitaCensoDataProvider.value['nombre_potencial_ben_1x1y4']}"
                                                    id="campoIdPotencialBen1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{VisitaCenso2.campoIdPotencialBen1Boton2}"
                                                    id="campoIdPotencialBen1Boton2"
                                                    onClick="#{VisitaCenso2.asistente.scriptCampoIdPotencialBen1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdFuncionarioCensista1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{VisitaCenso2.labelIdFuncionarioCensista1}"
                                                    id="labelIdFuncionarioCensista1"
                                                    for="campoIdFuncionarioCensista1"
                                                    toolTip="BundleParametros.id_funcionario_censista.visita_censo"
                                                    text="funcionario censista"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdFuncionarioCensista2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdFuncionarioCensista1"
                                                    binding="#{VisitaCenso2.campoIdFuncionarioCensista1}"
                                                    readOnly="#{VisitaCenso2.gestor.filaNoProcesada}" required="true"
                                                    text="#{VisitaCenso2.asistente.textoCampoIdFuncionarioCensista1}"
                                                    toolTip="#{VisitaCenso2.asistente.toolTipCampoIdFuncionarioCensista1}"
                                                    validatorExpression="#{VisitaCenso2.campoIdFuncionarioCensista1_validate}"/>
                                                <webuijsf:staticText id="campoIdFuncionarioCensista1Texto1"
                                                    binding="#{VisitaCenso2.campoIdFuncionarioCensista1Texto1}"
                                                    text="#{VisitaCenso2.visitaCensoDataProvider.value['codigo_funcionario_1x2y3']}"/>
                                                <webuijsf:button id="campoIdFuncionarioCensista1Boton1"
                                                    binding="#{VisitaCenso2.campoIdFuncionarioCensista1Boton1}"
                                                    onClick="#{VisitaCenso2.asistente.scriptCampoIdFuncionarioCensista1Boton1}"/>
                                                <webuijsf:button id="campoIdFuncionarioCensista1Boton3"
                                                    binding="#{VisitaCenso2.campoIdFuncionarioCensista1Boton3}"
                                                    onClick="#{VisitaCenso2.asistente.scriptCampoIdFuncionarioCensista1Boton2}"
                                                    rendered="#{VisitaCenso2.asistente.campoIdFuncionarioCensista1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdFuncionarioCensista1"
                                                    for="campoIdFuncionarioCensista1"/>
                                                <webuijsf:helpInline id="helpInlineIdFuncionarioCensista1"
                                                    binding="#{VisitaCenso2.helpInlineIdFuncionarioCensista1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_funcionario_censista.visita_censo"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdFuncionarioCensista3"
                                                rendered="#{VisitaCenso2.asistente.campoIdFuncionarioCensista1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{VisitaCenso2.labelIdFuncionarioCensista2}"
                                                    id="labelIdFuncionarioCensista2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre funcionario censista"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdFuncionarioCensista4"
                                                rendered="#{VisitaCenso2.asistente.campoIdFuncionarioCensista1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{VisitaCenso2.campoIdFuncionarioCensista1Texto2}"
                                                    text="#{VisitaCenso2.visitaCensoDataProvider.value['nombre_funcionario_1x2y4']}"
                                                    id="campoIdFuncionarioCensista1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{VisitaCenso2.campoIdFuncionarioCensista1Boton2}"
                                                    id="campoIdFuncionarioCensista1Boton2"
                                                    onClick="#{VisitaCenso2.asistente.scriptCampoIdFuncionarioCensista1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaVisita1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{VisitaCenso2.labelFechaVisita1}"
                                                    id="labelFechaVisita1"
                                                    for="campoFechaVisita1"
                                                    toolTip="BundleParametros.fecha_visita.visita_censo"
                                                    text="fecha visita"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaVisita2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaVisita1"
                                                    binding="#{VisitaCenso2.campoFechaVisita1}"
                                                    maxDate="#{VisitaCenso2.gestor.defaultMaxDate}"
                                                    minDate="#{VisitaCenso2.gestor.defaultMinDate}"
                                                    readOnly="#{VisitaCenso2.gestor.filaNoProcesada}" required="true"
                                                    selectedDate="#{VisitaCenso2.visitaCensoDataProvider.value['fecha_visita']}"
                                                    toolTip="BundleParametros.fecha_visita.visita_censo"/>
                                                <webuijsf:staticText id="campoFechaVisita1Texto1"
                                                    binding="#{VisitaCenso2.campoFechaVisita1Texto1}"
                                                    converter="#{VisitaCenso2.converterFechaVisita1}"
                                                    text="#{VisitaCenso2.visitaCensoDataProvider.value['fecha_visita']}"/>
                                                <webuijsf:message id="messageFechaVisita1"
                                                    for="campoFechaVisita1"/>
                                                <webuijsf:helpInline id="helpInlineFechaVisita1"
                                                    binding="#{VisitaCenso2.helpInlineFechaVisita1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_visita.visita_censo"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridObservaciones1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{VisitaCenso2.labelObservaciones1}"
                                                    id="labelObservaciones1"
                                                    for="campoObservaciones1"
                                                    toolTip="BundleParametros.observaciones.visita_censo"
                                                    text="observaciones"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridObservaciones2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoObservaciones1"
                                                    binding="#{VisitaCenso2.campoObservaciones1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{VisitaCenso2.gestor.filaNoProcesada}"
                                                    text="#{VisitaCenso2.visitaCensoDataProvider.value['observaciones']}"
                                                    toolTip="BundleParametros.observaciones.visita_censo"
                                                    validatorExpression="#{VisitaCenso2.validatorObservaciones1.validate}"/>
                                                <webuijsf:staticText id="campoObservaciones1Texto1"
                                                    binding="#{VisitaCenso2.campoObservaciones1Texto1}"
                                                    text="#{VisitaCenso2.visitaCensoDataProvider.value['observaciones']}"/>
                                                <webuijsf:message id="messageObservaciones1"
                                                    for="campoObservaciones1"/>
                                                <webuijsf:helpInline id="helpInlineObservaciones1"
                                                    binding="#{VisitaCenso2.helpInlineObservaciones1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.observaciones.visita_censo"
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
                                                        actionExpression="#{VisitaCenso2.botonIrAlPrimero2_action}"
                                                        binding="#{VisitaCenso2.botonIrAlPrimero2}"
                                                        disabled="#{VisitaCenso2.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero2"
                                                        imageURL="#{VisitaCenso2.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{VisitaCenso2.gestor.scriptIrAlPrimero}"
                                                        text="#{VisitaCenso2.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{VisitaCenso2.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{VisitaCenso2.botonIrAlAnterior2_action}"
                                                        binding="#{VisitaCenso2.botonIrAlAnterior2}"
                                                        disabled="#{VisitaCenso2.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior2"
                                                        imageURL="#{VisitaCenso2.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{VisitaCenso2.gestor.scriptIrAlAnterior}"
                                                        text="#{VisitaCenso2.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{VisitaCenso2.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{VisitaCenso2.botonIrAlSiguiente2_action}"
                                                        binding="#{VisitaCenso2.botonIrAlSiguiente2}"
                                                        disabled="#{VisitaCenso2.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente2"
                                                        imageURL="#{VisitaCenso2.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{VisitaCenso2.gestor.scriptIrAlSiguiente}"
                                                        text="#{VisitaCenso2.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{VisitaCenso2.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{VisitaCenso2.botonIrAlUltimo2_action}"
                                                        binding="#{VisitaCenso2.botonIrAlUltimo2}"
                                                        disabled="#{VisitaCenso2.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo2"
                                                        imageURL="#{VisitaCenso2.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{VisitaCenso2.gestor.scriptIrAlUltimo}"
                                                        text="#{VisitaCenso2.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{VisitaCenso2.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{VisitaCenso2.botonProcesarFila2_action}"
                                                        binding="#{VisitaCenso2.botonProcesarFila2}"
                                                        disabled="#{VisitaCenso2.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila2"
                                                        imageURL="#{VisitaCenso2.gestor.urlImagenProcesar}"
                                                        onClick="#{VisitaCenso2.scriptAbrirVentanaProcesarFila2}"
                                                        rendered="#{VisitaCenso2.asistente.comandoDisponible}"
                                                        text="#{VisitaCenso2.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{VisitaCenso2.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{VisitaCenso2.gestor.mensajeCambiosPorConfirmar}"/>
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
                                                    actionExpression="#{VisitaCenso2.botonAgregar1_action}"
                                                    binding="#{VisitaCenso2.botonAgregar1}"
                                                    disabled="#{VisitaCenso2.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{VisitaCenso2.gestor.scriptAgregar}"
                                                    rendered="#{VisitaCenso2.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{VisitaCenso2.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{VisitaCenso2.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{VisitaCenso2.listaFuncionEdicion1}"
                                                    converter="#{VisitaCenso2.converterListaFuncionEdicion1}"
                                                    disabled="#{VisitaCenso2.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{VisitaCenso2.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{VisitaCenso2.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{VisitaCenso2.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{VisitaCenso2.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{VisitaCenso2.botonEditar1_action}"
                                                    binding="#{VisitaCenso2.botonEditar1}"
                                                    disabled="#{VisitaCenso2.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{VisitaCenso2.gestor.scriptEditar}"
                                                    rendered="#{VisitaCenso2.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{VisitaCenso2.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{VisitaCenso2.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{VisitaCenso2.botonEliminar1_action}"
                                                    binding="#{VisitaCenso2.botonEliminar1}"
                                                    disabled="#{VisitaCenso2.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{VisitaCenso2.gestor.scriptEliminar}"
                                                    rendered="#{VisitaCenso2.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{VisitaCenso2.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{VisitaCenso2.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{VisitaCenso2.botonAplicar1_action}"
                                                    binding="#{VisitaCenso2.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{VisitaCenso2.gestor.scriptAplicar}"
                                                    rendered="#{VisitaCenso2.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{VisitaCenso2.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{VisitaCenso2.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{VisitaCenso2.botonDeshacer1_action}"
                                                    binding="#{VisitaCenso2.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{VisitaCenso2.gestor.scriptDeshacer}"
                                                    rendered="#{VisitaCenso2.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{VisitaCenso2.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{VisitaCenso2.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{VisitaCenso2.botonConfirmar1_action}"
                                                    binding="#{VisitaCenso2.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{VisitaCenso2.gestor.scriptConfirmar}"
                                                    rendered="#{VisitaCenso2.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{VisitaCenso2.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{VisitaCenso2.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{VisitaCenso2.botonDescartar1_action}"
                                                    binding="#{VisitaCenso2.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{VisitaCenso2.gestor.scriptDescartar}"
                                                    rendered="#{VisitaCenso2.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{VisitaCenso2.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{VisitaCenso2.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{VisitaCenso2.listaFuncionAccion1}"
                                                    converter="#{VisitaCenso2.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{VisitaCenso2.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{VisitaCenso2.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{VisitaCenso2.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{VisitaCenso2.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{VisitaCenso2.botonProcesar1_action}"
                                                    binding="#{VisitaCenso2.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{VisitaCenso2.gestor.scriptProcesar}"
                                                    rendered="#{VisitaCenso2.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{VisitaCenso2.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{VisitaCenso2.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{VisitaCenso2.botonRefrescar1_action}"
                                                    binding="#{VisitaCenso2.botonRefrescar1}"
                                                    disabled="#{VisitaCenso2.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{VisitaCenso2.gestor.scriptRefrescar}"
                                                    rendered="#{VisitaCenso2.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{VisitaCenso2.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{VisitaCenso2.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{VisitaCenso2.botonReconsultar1_action}"
                                                    binding="#{VisitaCenso2.botonReconsultar1}"
                                                    disabled="#{VisitaCenso2.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{VisitaCenso2.gestor.scriptReconsultar}"
                                                    rendered="#{VisitaCenso2.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{VisitaCenso2.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{VisitaCenso2.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{VisitaCenso2.botonRetornar1_action}"
                                                    binding="#{VisitaCenso2.botonRetornar1}"
                                                    disabled="#{VisitaCenso2.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{VisitaCenso2.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{VisitaCenso2.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{VisitaCenso2.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{VisitaCenso2.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel125"
                                                rendered="#{VisitaCenso2.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{VisitaCenso2.imageHyperlink1_action}"
                                                    binding="#{VisitaCenso2.imageHyperlink1}"
                                                    disabled="#{VisitaCenso2.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{VisitaCenso2.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{VisitaCenso2.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{VisitaCenso2.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.VisitaCenso2_imageHyperlink1_toolTip}"/>
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
