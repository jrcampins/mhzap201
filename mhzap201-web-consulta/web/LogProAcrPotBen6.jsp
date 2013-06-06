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
                    focus="#{LogProAcrPotBen6.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{LogProAcrPotBen6.gestor.preserveFocus}"
                    preserveScroll="#{LogProAcrPotBen6.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{LogProAcrPotBen6.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | campoIdLogProAcrPotBen1 campoIdPotencialBen1 campoNombrePotencialBen1 campoCodigoPotencialBen1 campoFechaRegistroPotBen1 campoIdPersona1 campoNombrePersona1 campoCodigoPersona1 campoIdDepartamento1 campoIdDistrito1 campoIdBarrio1 campoIdFichaPersona1 campoCodigoFichaPersona1 campoNombreFichaPersona1 campoIdFichaHogar1 campoCodigoFichaHogar1 campoIndiceCalidadVida1 listaEsProcesado1 campoObservacion1 campoFechaHoraTransaccion1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | | , virtualForm3 | listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{LogProAcrPotBen6.breadcrumbs1}" 
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
                                                    rendered="#{LogProAcrPotBen6.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{LogProAcrPotBen6.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{LogProAcrPotBen6.gestor.mensajeDisponible}"
                                                    text="#{LogProAcrPotBen6.gestor.mensaje}"
                                                    url="#{LogProAcrPotBen6.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            id="gridPanel104"
                                            rendered="#{LogProAcrPotBen6.gestor.filaDisponible}"
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
                                                        actionExpression="#{LogProAcrPotBen6.botonIrAlPrimero1_action}"
                                                        binding="#{LogProAcrPotBen6.botonIrAlPrimero1}"
                                                        disabled="#{LogProAcrPotBen6.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero1"
                                                        imageURL="#{LogProAcrPotBen6.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{LogProAcrPotBen6.gestor.scriptIrAlPrimero}"
                                                        text="#{LogProAcrPotBen6.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{LogProAcrPotBen6.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogProAcrPotBen6.botonIrAlAnterior1_action}"
                                                        binding="#{LogProAcrPotBen6.botonIrAlAnterior1}"
                                                        disabled="#{LogProAcrPotBen6.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior1"
                                                        imageURL="#{LogProAcrPotBen6.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{LogProAcrPotBen6.gestor.scriptIrAlAnterior}"
                                                        text="#{LogProAcrPotBen6.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{LogProAcrPotBen6.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogProAcrPotBen6.botonIrAlSiguiente1_action}"
                                                        binding="#{LogProAcrPotBen6.botonIrAlSiguiente1}"
                                                        disabled="#{LogProAcrPotBen6.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente1"
                                                        imageURL="#{LogProAcrPotBen6.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{LogProAcrPotBen6.gestor.scriptIrAlSiguiente}"
                                                        text="#{LogProAcrPotBen6.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{LogProAcrPotBen6.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogProAcrPotBen6.botonIrAlUltimo1_action}"
                                                        binding="#{LogProAcrPotBen6.botonIrAlUltimo1}"
                                                        disabled="#{LogProAcrPotBen6.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo1"
                                                        imageURL="#{LogProAcrPotBen6.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{LogProAcrPotBen6.gestor.scriptIrAlUltimo}"
                                                        text="#{LogProAcrPotBen6.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{LogProAcrPotBen6.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogProAcrPotBen6.botonProcesarFila1_action}"
                                                        binding="#{LogProAcrPotBen6.botonProcesarFila1}"
                                                        disabled="#{LogProAcrPotBen6.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila1"
                                                        imageURL="#{LogProAcrPotBen6.gestor.urlImagenProcesar}"
                                                        onClick="#{LogProAcrPotBen6.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{LogProAcrPotBen6.asistente.comandoDisponible}"
                                                        text="#{LogProAcrPotBen6.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{LogProAcrPotBen6.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{LogProAcrPotBen6.gestor.tituloConsulta}"/>
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
                                                    binding="#{LogProAcrPotBen6.etiquetaIdentificacionFila1}"
                                                    id="etiquetaIdentificacionFila1"
                                                    text="#{LogProAcrPotBen6.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{LogProAcrPotBen6.gestor.i18n.toolTipEtiquetaIdentificacionFila}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel113"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoIdentificacionFila1"
                                                    style="font-weight: bold"
                                                    text="#{LogProAcrPotBen6.gestor.identificacionFila}"/>
                                                <webuijsf:image
                                                    id="imagenFilaProcesada1"
                                                    toolTip="#{LogProAcrPotBen6.gestor.toolTipImagenFilaProcesada}"
                                                    url="#{LogProAcrPotBen6.gestor.urlImagenFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPanel114"
                                                rendered="#{LogProAcrPotBen6.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProAcrPotBen6.etiquetaDenominacionFilaMaestro1}"
                                                    id="etiquetaDenominacionFilaMaestro1"
                                                    text="?"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel115"
                                                rendered="#{LogProAcrPotBen6.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoDenominacionFilaMaestro1"
                                                    style="font-weight: bold"
                                                    text="#{LogProAcrPotBen6.gestor.denominacionFilaMaestro}"/>
                                                <webuijsf:image
                                                    id="imagenFilaMaestro1"
                                                    url="#{LogProAcrPotBen6.gestor.urlImagenMaestroFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdLogProAcrPotBen1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProAcrPotBen6.labelIdLogProAcrPotBen1}"
                                                    id="labelIdLogProAcrPotBen1"
                                                    for="campoIdLogProAcrPotBen1"
                                                    toolTip="BundleParametros.id_log_pro_acr_pot_ben.log_pro_acr_pot_ben"
                                                    text="identificaci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdLogProAcrPotBen2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdLogProAcrPotBen1"
                                                    binding="#{LogProAcrPotBen6.campoIdLogProAcrPotBen1}"
                                                    converter="#{LogProAcrPotBen6.converterIdLogProAcrPotBen1}"
                                                    readOnly="true"
                                                    text="#{LogProAcrPotBen6.logProAcrPotBenDataProvider.value['id_log_pro_acr_pot_ben']}"
                                                    toolTip="BundleParametros.id_log_pro_acr_pot_ben.log_pro_acr_pot_ben"
                                                    validatorExpression="#{LogProAcrPotBen6.validatorIdLogProAcrPotBen1.validate}"/>
                                                <webuijsf:staticText id="campoIdLogProAcrPotBen1Texto1"
                                                    binding="#{LogProAcrPotBen6.campoIdLogProAcrPotBen1Texto1}"
                                                    text="#{LogProAcrPotBen6.logProAcrPotBenDataProvider.value['id_log_pro_acr_pot_ben']}"/>
                                                <webuijsf:message id="messageIdLogProAcrPotBen1"
                                                    for="campoIdLogProAcrPotBen1"/>
                                                <webuijsf:helpInline id="helpInlineIdLogProAcrPotBen1"
                                                    binding="#{LogProAcrPotBen6.helpInlineIdLogProAcrPotBen1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_log_pro_acr_pot_ben.log_pro_acr_pot_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdPotencialBen1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProAcrPotBen6.labelIdPotencialBen1}"
                                                    id="labelIdPotencialBen1"
                                                    for="campoIdPotencialBen1"
                                                    toolTip="BundleParametros.id_potencial_ben.log_pro_acr_pot_ben"
                                                    text="potencial beneficiario"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdPotencialBen2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdPotencialBen1"
                                                    binding="#{LogProAcrPotBen6.campoIdPotencialBen1}"
                                                    readOnly="#{LogProAcrPotBen6.gestor.filaNoProcesada}"
                                                    text="#{LogProAcrPotBen6.asistente.textoCampoIdPotencialBen1}"
                                                    toolTip="#{LogProAcrPotBen6.asistente.toolTipCampoIdPotencialBen1}"
                                                    validatorExpression="#{LogProAcrPotBen6.campoIdPotencialBen1_validate}"/>
                                                <webuijsf:staticText id="campoIdPotencialBen1Texto1"
                                                    binding="#{LogProAcrPotBen6.campoIdPotencialBen1Texto1}"
                                                    text="#{LogProAcrPotBen6.logProAcrPotBenDataProvider.value['codigo_potencial_ben_1x1y3']}"/>
                                                <webuijsf:button id="campoIdPotencialBen1Boton1"
                                                    binding="#{LogProAcrPotBen6.campoIdPotencialBen1Boton1}"
                                                    onClick="#{LogProAcrPotBen6.asistente.scriptCampoIdPotencialBen1Boton1}"/>
                                                <webuijsf:button id="campoIdPotencialBen1Boton3"
                                                    binding="#{LogProAcrPotBen6.campoIdPotencialBen1Boton3}"
                                                    onClick="#{LogProAcrPotBen6.asistente.scriptCampoIdPotencialBen1Boton2}"
                                                    rendered="#{LogProAcrPotBen6.asistente.campoIdPotencialBen1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdPotencialBen1"
                                                    for="campoIdPotencialBen1"/>
                                                <webuijsf:helpInline id="helpInlineIdPotencialBen1"
                                                    binding="#{LogProAcrPotBen6.helpInlineIdPotencialBen1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_potencial_ben.log_pro_acr_pot_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdPotencialBen3"
                                                rendered="#{LogProAcrPotBen6.asistente.campoIdPotencialBen1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProAcrPotBen6.labelIdPotencialBen2}"
                                                    id="labelIdPotencialBen2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre potencial beneficiario"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdPotencialBen4"
                                                rendered="#{LogProAcrPotBen6.asistente.campoIdPotencialBen1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{LogProAcrPotBen6.campoIdPotencialBen1Texto2}"
                                                    text="#{LogProAcrPotBen6.logProAcrPotBenDataProvider.value['nombre_potencial_ben_1x1y4']}"
                                                    id="campoIdPotencialBen1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{LogProAcrPotBen6.campoIdPotencialBen1Boton2}"
                                                    id="campoIdPotencialBen1Boton2"
                                                    onClick="#{LogProAcrPotBen6.asistente.scriptCampoIdPotencialBen1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNombrePotencialBen1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProAcrPotBen6.labelNombrePotencialBen1}"
                                                    id="labelNombrePotencialBen1"
                                                    for="campoNombrePotencialBen1"
                                                    toolTip="BundleParametros.nombre_potencial_ben.log_pro_acr_pot_ben"
                                                    text="nombre potencial beneficiario"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNombrePotencialBen2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNombrePotencialBen1"
                                                    binding="#{LogProAcrPotBen6.campoNombrePotencialBen1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{LogProAcrPotBen6.gestor.filaNoProcesada}"
                                                    text="#{LogProAcrPotBen6.logProAcrPotBenDataProvider.value['nombre_potencial_ben']}"
                                                    toolTip="BundleParametros.nombre_potencial_ben.log_pro_acr_pot_ben"
                                                    validatorExpression="#{LogProAcrPotBen6.validatorNombrePotencialBen1.validate}"/>
                                                <webuijsf:staticText id="campoNombrePotencialBen1Texto1"
                                                    binding="#{LogProAcrPotBen6.campoNombrePotencialBen1Texto1}"
                                                    text="#{LogProAcrPotBen6.logProAcrPotBenDataProvider.value['nombre_potencial_ben']}"/>
                                                <webuijsf:message id="messageNombrePotencialBen1"
                                                    for="campoNombrePotencialBen1"/>
                                                <webuijsf:helpInline id="helpInlineNombrePotencialBen1"
                                                    binding="#{LogProAcrPotBen6.helpInlineNombrePotencialBen1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.nombre_potencial_ben.log_pro_acr_pot_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridCodigoPotencialBen1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProAcrPotBen6.labelCodigoPotencialBen1}"
                                                    id="labelCodigoPotencialBen1"
                                                    for="campoCodigoPotencialBen1"
                                                    toolTip="BundleParametros.codigo_potencial_ben.log_pro_acr_pot_ben"
                                                    text="c&#243;digo potencial beneficiario"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridCodigoPotencialBen2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoCodigoPotencialBen1"
                                                    binding="#{LogProAcrPotBen6.campoCodigoPotencialBen1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{LogProAcrPotBen6.gestor.filaNoProcesada}"
                                                    text="#{LogProAcrPotBen6.logProAcrPotBenDataProvider.value['codigo_potencial_ben']}"
                                                    toolTip="BundleParametros.codigo_potencial_ben.log_pro_acr_pot_ben"
                                                    validatorExpression="#{LogProAcrPotBen6.validatorCodigoPotencialBen1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoPotencialBen1Texto1"
                                                    binding="#{LogProAcrPotBen6.campoCodigoPotencialBen1Texto1}"
                                                    text="#{LogProAcrPotBen6.logProAcrPotBenDataProvider.value['codigo_potencial_ben']}"/>
                                                <webuijsf:message id="messageCodigoPotencialBen1"
                                                    for="campoCodigoPotencialBen1"/>
                                                <webuijsf:helpInline id="helpInlineCodigoPotencialBen1"
                                                    binding="#{LogProAcrPotBen6.helpInlineCodigoPotencialBen1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.codigo_potencial_ben.log_pro_acr_pot_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaRegistroPotBen1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProAcrPotBen6.labelFechaRegistroPotBen1}"
                                                    id="labelFechaRegistroPotBen1"
                                                    for="campoFechaRegistroPotBen1"
                                                    toolTip="BundleParametros.fecha_registro_pot_ben.log_pro_acr_pot_ben"
                                                    text="fecha registro potencial beneficiario"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaRegistroPotBen2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaRegistroPotBen1"
                                                    binding="#{LogProAcrPotBen6.campoFechaRegistroPotBen1}"
                                                    maxDate="#{LogProAcrPotBen6.gestor.defaultMaxDate}"
                                                    minDate="#{LogProAcrPotBen6.gestor.defaultMinDate}"
                                                    readOnly="#{LogProAcrPotBen6.gestor.filaNoProcesada}"
                                                    selectedDate="#{LogProAcrPotBen6.logProAcrPotBenDataProvider.value['fecha_registro_pot_ben']}"
                                                    toolTip="BundleParametros.fecha_registro_pot_ben.log_pro_acr_pot_ben"/>
                                                <webuijsf:staticText id="campoFechaRegistroPotBen1Texto1"
                                                    binding="#{LogProAcrPotBen6.campoFechaRegistroPotBen1Texto1}"
                                                    converter="#{LogProAcrPotBen6.converterFechaRegistroPotBen1}"
                                                    text="#{LogProAcrPotBen6.logProAcrPotBenDataProvider.value['fecha_registro_pot_ben']}"/>
                                                <webuijsf:message id="messageFechaRegistroPotBen1"
                                                    for="campoFechaRegistroPotBen1"/>
                                                <webuijsf:helpInline id="helpInlineFechaRegistroPotBen1"
                                                    binding="#{LogProAcrPotBen6.helpInlineFechaRegistroPotBen1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_registro_pot_ben.log_pro_acr_pot_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdPersona1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProAcrPotBen6.labelIdPersona1}"
                                                    id="labelIdPersona1"
                                                    for="campoIdPersona1"
                                                    toolTip="BundleParametros.id_persona.log_pro_acr_pot_ben"
                                                    text="persona"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdPersona2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdPersona1"
                                                    binding="#{LogProAcrPotBen6.campoIdPersona1}"
                                                    readOnly="#{LogProAcrPotBen6.gestor.filaNoProcesada}"
                                                    text="#{LogProAcrPotBen6.asistente.textoCampoIdPersona1}"
                                                    toolTip="#{LogProAcrPotBen6.asistente.toolTipCampoIdPersona1}"
                                                    validatorExpression="#{LogProAcrPotBen6.campoIdPersona1_validate}"/>
                                                <webuijsf:staticText id="campoIdPersona1Texto1"
                                                    binding="#{LogProAcrPotBen6.campoIdPersona1Texto1}"
                                                    text="#{LogProAcrPotBen6.logProAcrPotBenDataProvider.value['codigo_persona_1x2y3']}"/>
                                                <webuijsf:button id="campoIdPersona1Boton1"
                                                    binding="#{LogProAcrPotBen6.campoIdPersona1Boton1}"
                                                    onClick="#{LogProAcrPotBen6.asistente.scriptCampoIdPersona1Boton1}"/>
                                                <webuijsf:button id="campoIdPersona1Boton3"
                                                    binding="#{LogProAcrPotBen6.campoIdPersona1Boton3}"
                                                    onClick="#{LogProAcrPotBen6.asistente.scriptCampoIdPersona1Boton2}"
                                                    rendered="#{LogProAcrPotBen6.asistente.campoIdPersona1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdPersona1"
                                                    for="campoIdPersona1"/>
                                                <webuijsf:helpInline id="helpInlineIdPersona1"
                                                    binding="#{LogProAcrPotBen6.helpInlineIdPersona1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_persona.log_pro_acr_pot_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdPersona3"
                                                rendered="#{LogProAcrPotBen6.asistente.campoIdPersona1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProAcrPotBen6.labelIdPersona2}"
                                                    id="labelIdPersona2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre persona"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdPersona4"
                                                rendered="#{LogProAcrPotBen6.asistente.campoIdPersona1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{LogProAcrPotBen6.campoIdPersona1Texto2}"
                                                    text="#{LogProAcrPotBen6.logProAcrPotBenDataProvider.value['nombre_persona_1x2y4']}"
                                                    id="campoIdPersona1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{LogProAcrPotBen6.campoIdPersona1Boton2}"
                                                    id="campoIdPersona1Boton2"
                                                    onClick="#{LogProAcrPotBen6.asistente.scriptCampoIdPersona1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNombrePersona1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProAcrPotBen6.labelNombrePersona1}"
                                                    id="labelNombrePersona1"
                                                    for="campoNombrePersona1"
                                                    toolTip="BundleParametros.nombre_persona.log_pro_acr_pot_ben"
                                                    text="nombre persona"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNombrePersona2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNombrePersona1"
                                                    binding="#{LogProAcrPotBen6.campoNombrePersona1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{LogProAcrPotBen6.gestor.filaNoProcesada}"
                                                    text="#{LogProAcrPotBen6.logProAcrPotBenDataProvider.value['nombre_persona']}"
                                                    toolTip="BundleParametros.nombre_persona.log_pro_acr_pot_ben"
                                                    validatorExpression="#{LogProAcrPotBen6.validatorNombrePersona1.validate}"/>
                                                <webuijsf:staticText id="campoNombrePersona1Texto1"
                                                    binding="#{LogProAcrPotBen6.campoNombrePersona1Texto1}"
                                                    text="#{LogProAcrPotBen6.logProAcrPotBenDataProvider.value['nombre_persona']}"/>
                                                <webuijsf:message id="messageNombrePersona1"
                                                    for="campoNombrePersona1"/>
                                                <webuijsf:helpInline id="helpInlineNombrePersona1"
                                                    binding="#{LogProAcrPotBen6.helpInlineNombrePersona1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.nombre_persona.log_pro_acr_pot_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridCodigoPersona1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProAcrPotBen6.labelCodigoPersona1}"
                                                    id="labelCodigoPersona1"
                                                    for="campoCodigoPersona1"
                                                    toolTip="BundleParametros.codigo_persona.log_pro_acr_pot_ben"
                                                    text="c&#243;digo persona"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridCodigoPersona2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoCodigoPersona1"
                                                    binding="#{LogProAcrPotBen6.campoCodigoPersona1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{LogProAcrPotBen6.gestor.filaNoProcesada}"
                                                    text="#{LogProAcrPotBen6.logProAcrPotBenDataProvider.value['codigo_persona']}"
                                                    toolTip="BundleParametros.codigo_persona.log_pro_acr_pot_ben"
                                                    validatorExpression="#{LogProAcrPotBen6.validatorCodigoPersona1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoPersona1Texto1"
                                                    binding="#{LogProAcrPotBen6.campoCodigoPersona1Texto1}"
                                                    text="#{LogProAcrPotBen6.logProAcrPotBenDataProvider.value['codigo_persona']}"/>
                                                <webuijsf:message id="messageCodigoPersona1"
                                                    for="campoCodigoPersona1"/>
                                                <webuijsf:helpInline id="helpInlineCodigoPersona1"
                                                    binding="#{LogProAcrPotBen6.helpInlineCodigoPersona1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.codigo_persona.log_pro_acr_pot_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdDepartamento1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProAcrPotBen6.labelIdDepartamento1}"
                                                    id="labelIdDepartamento1"
                                                    for="campoIdDepartamento1"
                                                    toolTip="BundleParametros.id_departamento.log_pro_acr_pot_ben"
                                                    text="departamento"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdDepartamento2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdDepartamento1"
                                                    binding="#{LogProAcrPotBen6.campoIdDepartamento1}"
                                                    readOnly="#{LogProAcrPotBen6.gestor.filaNoProcesada}"
                                                    text="#{LogProAcrPotBen6.asistente.textoCampoIdDepartamento1}"
                                                    toolTip="#{LogProAcrPotBen6.asistente.toolTipCampoIdDepartamento1}"
                                                    validatorExpression="#{LogProAcrPotBen6.campoIdDepartamento1_validate}"/>
                                                <webuijsf:staticText id="campoIdDepartamento1Texto1"
                                                    binding="#{LogProAcrPotBen6.campoIdDepartamento1Texto1}"
                                                    text="#{LogProAcrPotBen6.logProAcrPotBenDataProvider.value['codigo_ubicacion_1x3y3']}"/>
                                                <webuijsf:button id="campoIdDepartamento1Boton1"
                                                    binding="#{LogProAcrPotBen6.campoIdDepartamento1Boton1}"
                                                    onClick="#{LogProAcrPotBen6.asistente.scriptCampoIdDepartamento1Boton1}"/>
                                                <webuijsf:button id="campoIdDepartamento1Boton3"
                                                    binding="#{LogProAcrPotBen6.campoIdDepartamento1Boton3}"
                                                    onClick="#{LogProAcrPotBen6.asistente.scriptCampoIdDepartamento1Boton2}"
                                                    rendered="#{LogProAcrPotBen6.asistente.campoIdDepartamento1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdDepartamento1"
                                                    for="campoIdDepartamento1"/>
                                                <webuijsf:helpInline id="helpInlineIdDepartamento1"
                                                    binding="#{LogProAcrPotBen6.helpInlineIdDepartamento1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_departamento.log_pro_acr_pot_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdDepartamento3"
                                                rendered="#{LogProAcrPotBen6.asistente.campoIdDepartamento1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProAcrPotBen6.labelIdDepartamento2}"
                                                    id="labelIdDepartamento2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre departamento"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdDepartamento4"
                                                rendered="#{LogProAcrPotBen6.asistente.campoIdDepartamento1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{LogProAcrPotBen6.campoIdDepartamento1Texto2}"
                                                    text="#{LogProAcrPotBen6.logProAcrPotBenDataProvider.value['nombre_ubicacion_1x3y4']}"
                                                    id="campoIdDepartamento1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{LogProAcrPotBen6.campoIdDepartamento1Boton2}"
                                                    id="campoIdDepartamento1Boton2"
                                                    onClick="#{LogProAcrPotBen6.asistente.scriptCampoIdDepartamento1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdDistrito1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProAcrPotBen6.labelIdDistrito1}"
                                                    id="labelIdDistrito1"
                                                    for="campoIdDistrito1"
                                                    toolTip="BundleParametros.id_distrito.log_pro_acr_pot_ben"
                                                    text="distrito"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdDistrito2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdDistrito1"
                                                    binding="#{LogProAcrPotBen6.campoIdDistrito1}"
                                                    readOnly="#{LogProAcrPotBen6.gestor.filaNoProcesada}"
                                                    text="#{LogProAcrPotBen6.asistente.textoCampoIdDistrito1}"
                                                    toolTip="#{LogProAcrPotBen6.asistente.toolTipCampoIdDistrito1}"
                                                    validatorExpression="#{LogProAcrPotBen6.campoIdDistrito1_validate}"/>
                                                <webuijsf:staticText id="campoIdDistrito1Texto1"
                                                    binding="#{LogProAcrPotBen6.campoIdDistrito1Texto1}"
                                                    text="#{LogProAcrPotBen6.logProAcrPotBenDataProvider.value['codigo_ubicacion_1x4y3']}"/>
                                                <webuijsf:button id="campoIdDistrito1Boton1"
                                                    binding="#{LogProAcrPotBen6.campoIdDistrito1Boton1}"
                                                    onClick="#{LogProAcrPotBen6.asistente.scriptCampoIdDistrito1Boton1}"/>
                                                <webuijsf:button id="campoIdDistrito1Boton3"
                                                    binding="#{LogProAcrPotBen6.campoIdDistrito1Boton3}"
                                                    onClick="#{LogProAcrPotBen6.asistente.scriptCampoIdDistrito1Boton2}"
                                                    rendered="#{LogProAcrPotBen6.asistente.campoIdDistrito1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdDistrito1"
                                                    for="campoIdDistrito1"/>
                                                <webuijsf:helpInline id="helpInlineIdDistrito1"
                                                    binding="#{LogProAcrPotBen6.helpInlineIdDistrito1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_distrito.log_pro_acr_pot_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdDistrito3"
                                                rendered="#{LogProAcrPotBen6.asistente.campoIdDistrito1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProAcrPotBen6.labelIdDistrito2}"
                                                    id="labelIdDistrito2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre distrito"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdDistrito4"
                                                rendered="#{LogProAcrPotBen6.asistente.campoIdDistrito1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{LogProAcrPotBen6.campoIdDistrito1Texto2}"
                                                    text="#{LogProAcrPotBen6.logProAcrPotBenDataProvider.value['nombre_ubicacion_1x4y4']}"
                                                    id="campoIdDistrito1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{LogProAcrPotBen6.campoIdDistrito1Boton2}"
                                                    id="campoIdDistrito1Boton2"
                                                    onClick="#{LogProAcrPotBen6.asistente.scriptCampoIdDistrito1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdBarrio1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProAcrPotBen6.labelIdBarrio1}"
                                                    id="labelIdBarrio1"
                                                    for="campoIdBarrio1"
                                                    toolTip="BundleParametros.id_barrio.log_pro_acr_pot_ben"
                                                    text="barrio"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdBarrio2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdBarrio1"
                                                    binding="#{LogProAcrPotBen6.campoIdBarrio1}"
                                                    readOnly="#{LogProAcrPotBen6.gestor.filaNoProcesada}"
                                                    text="#{LogProAcrPotBen6.asistente.textoCampoIdBarrio1}"
                                                    toolTip="#{LogProAcrPotBen6.asistente.toolTipCampoIdBarrio1}"
                                                    validatorExpression="#{LogProAcrPotBen6.campoIdBarrio1_validate}"/>
                                                <webuijsf:staticText id="campoIdBarrio1Texto1"
                                                    binding="#{LogProAcrPotBen6.campoIdBarrio1Texto1}"
                                                    text="#{LogProAcrPotBen6.logProAcrPotBenDataProvider.value['codigo_ubicacion_1x5y3']}"/>
                                                <webuijsf:button id="campoIdBarrio1Boton1"
                                                    binding="#{LogProAcrPotBen6.campoIdBarrio1Boton1}"
                                                    onClick="#{LogProAcrPotBen6.asistente.scriptCampoIdBarrio1Boton1}"/>
                                                <webuijsf:button id="campoIdBarrio1Boton3"
                                                    binding="#{LogProAcrPotBen6.campoIdBarrio1Boton3}"
                                                    onClick="#{LogProAcrPotBen6.asistente.scriptCampoIdBarrio1Boton2}"
                                                    rendered="#{LogProAcrPotBen6.asistente.campoIdBarrio1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdBarrio1"
                                                    for="campoIdBarrio1"/>
                                                <webuijsf:helpInline id="helpInlineIdBarrio1"
                                                    binding="#{LogProAcrPotBen6.helpInlineIdBarrio1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_barrio.log_pro_acr_pot_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdBarrio3"
                                                rendered="#{LogProAcrPotBen6.asistente.campoIdBarrio1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProAcrPotBen6.labelIdBarrio2}"
                                                    id="labelIdBarrio2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre barrio"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdBarrio4"
                                                rendered="#{LogProAcrPotBen6.asistente.campoIdBarrio1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{LogProAcrPotBen6.campoIdBarrio1Texto2}"
                                                    text="#{LogProAcrPotBen6.logProAcrPotBenDataProvider.value['nombre_ubicacion_1x5y4']}"
                                                    id="campoIdBarrio1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{LogProAcrPotBen6.campoIdBarrio1Boton2}"
                                                    id="campoIdBarrio1Boton2"
                                                    onClick="#{LogProAcrPotBen6.asistente.scriptCampoIdBarrio1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdFichaPersona1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProAcrPotBen6.labelIdFichaPersona1}"
                                                    id="labelIdFichaPersona1"
                                                    for="campoIdFichaPersona1"
                                                    toolTip="BundleParametros.id_ficha_persona.log_pro_acr_pot_ben"
                                                    text="ficha persona"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdFichaPersona2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdFichaPersona1"
                                                    binding="#{LogProAcrPotBen6.campoIdFichaPersona1}"
                                                    readOnly="#{LogProAcrPotBen6.gestor.filaNoProcesada}"
                                                    text="#{LogProAcrPotBen6.asistente.textoCampoIdFichaPersona1}"
                                                    toolTip="#{LogProAcrPotBen6.asistente.toolTipCampoIdFichaPersona1}"
                                                    validatorExpression="#{LogProAcrPotBen6.campoIdFichaPersona1_validate}"/>
                                                <webuijsf:staticText id="campoIdFichaPersona1Texto1"
                                                    binding="#{LogProAcrPotBen6.campoIdFichaPersona1Texto1}"
                                                    text="#{LogProAcrPotBen6.logProAcrPotBenDataProvider.value['codigo_ficha_persona_1x6y3']}"/>
                                                <webuijsf:button id="campoIdFichaPersona1Boton1"
                                                    binding="#{LogProAcrPotBen6.campoIdFichaPersona1Boton1}"
                                                    onClick="#{LogProAcrPotBen6.asistente.scriptCampoIdFichaPersona1Boton1}"/>
                                                <webuijsf:button id="campoIdFichaPersona1Boton3"
                                                    binding="#{LogProAcrPotBen6.campoIdFichaPersona1Boton3}"
                                                    onClick="#{LogProAcrPotBen6.asistente.scriptCampoIdFichaPersona1Boton2}"
                                                    rendered="#{LogProAcrPotBen6.asistente.campoIdFichaPersona1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdFichaPersona1"
                                                    for="campoIdFichaPersona1"/>
                                                <webuijsf:helpInline id="helpInlineIdFichaPersona1"
                                                    binding="#{LogProAcrPotBen6.helpInlineIdFichaPersona1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_ficha_persona.log_pro_acr_pot_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdFichaPersona3"
                                                rendered="#{LogProAcrPotBen6.asistente.campoIdFichaPersona1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProAcrPotBen6.labelIdFichaPersona2}"
                                                    id="labelIdFichaPersona2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre ficha persona"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdFichaPersona4"
                                                rendered="#{LogProAcrPotBen6.asistente.campoIdFichaPersona1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{LogProAcrPotBen6.campoIdFichaPersona1Texto2}"
                                                    text="#{LogProAcrPotBen6.logProAcrPotBenDataProvider.value['nombre_ficha_persona_1x6y4']}"
                                                    id="campoIdFichaPersona1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{LogProAcrPotBen6.campoIdFichaPersona1Boton2}"
                                                    id="campoIdFichaPersona1Boton2"
                                                    onClick="#{LogProAcrPotBen6.asistente.scriptCampoIdFichaPersona1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridCodigoFichaPersona1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProAcrPotBen6.labelCodigoFichaPersona1}"
                                                    id="labelCodigoFichaPersona1"
                                                    for="campoCodigoFichaPersona1"
                                                    toolTip="BundleParametros.codigo_ficha_persona.log_pro_acr_pot_ben"
                                                    text="c&#243;digo ficha persona"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridCodigoFichaPersona2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoCodigoFichaPersona1"
                                                    binding="#{LogProAcrPotBen6.campoCodigoFichaPersona1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{LogProAcrPotBen6.gestor.filaNoProcesada}"
                                                    text="#{LogProAcrPotBen6.logProAcrPotBenDataProvider.value['codigo_ficha_persona']}"
                                                    toolTip="BundleParametros.codigo_ficha_persona.log_pro_acr_pot_ben"
                                                    validatorExpression="#{LogProAcrPotBen6.validatorCodigoFichaPersona1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoFichaPersona1Texto1"
                                                    binding="#{LogProAcrPotBen6.campoCodigoFichaPersona1Texto1}"
                                                    text="#{LogProAcrPotBen6.logProAcrPotBenDataProvider.value['codigo_ficha_persona']}"/>
                                                <webuijsf:message id="messageCodigoFichaPersona1"
                                                    for="campoCodigoFichaPersona1"/>
                                                <webuijsf:helpInline id="helpInlineCodigoFichaPersona1"
                                                    binding="#{LogProAcrPotBen6.helpInlineCodigoFichaPersona1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.codigo_ficha_persona.log_pro_acr_pot_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNombreFichaPersona1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProAcrPotBen6.labelNombreFichaPersona1}"
                                                    id="labelNombreFichaPersona1"
                                                    for="campoNombreFichaPersona1"
                                                    toolTip="BundleParametros.nombre_ficha_persona.log_pro_acr_pot_ben"
                                                    text="nombre ficha persona"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNombreFichaPersona2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNombreFichaPersona1"
                                                    binding="#{LogProAcrPotBen6.campoNombreFichaPersona1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{LogProAcrPotBen6.gestor.filaNoProcesada}"
                                                    text="#{LogProAcrPotBen6.logProAcrPotBenDataProvider.value['nombre_ficha_persona']}"
                                                    toolTip="BundleParametros.nombre_ficha_persona.log_pro_acr_pot_ben"
                                                    validatorExpression="#{LogProAcrPotBen6.validatorNombreFichaPersona1.validate}"/>
                                                <webuijsf:staticText id="campoNombreFichaPersona1Texto1"
                                                    binding="#{LogProAcrPotBen6.campoNombreFichaPersona1Texto1}"
                                                    text="#{LogProAcrPotBen6.logProAcrPotBenDataProvider.value['nombre_ficha_persona']}"/>
                                                <webuijsf:message id="messageNombreFichaPersona1"
                                                    for="campoNombreFichaPersona1"/>
                                                <webuijsf:helpInline id="helpInlineNombreFichaPersona1"
                                                    binding="#{LogProAcrPotBen6.helpInlineNombreFichaPersona1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.nombre_ficha_persona.log_pro_acr_pot_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdFichaHogar1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProAcrPotBen6.labelIdFichaHogar1}"
                                                    id="labelIdFichaHogar1"
                                                    for="campoIdFichaHogar1"
                                                    toolTip="BundleParametros.id_ficha_hogar.log_pro_acr_pot_ben"
                                                    text="ficha hogar"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdFichaHogar2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdFichaHogar1"
                                                    binding="#{LogProAcrPotBen6.campoIdFichaHogar1}"
                                                    readOnly="#{LogProAcrPotBen6.gestor.filaNoProcesada}"
                                                    text="#{LogProAcrPotBen6.asistente.textoCampoIdFichaHogar1}"
                                                    toolTip="#{LogProAcrPotBen6.asistente.toolTipCampoIdFichaHogar1}"
                                                    validatorExpression="#{LogProAcrPotBen6.campoIdFichaHogar1_validate}"/>
                                                <webuijsf:staticText id="campoIdFichaHogar1Texto1"
                                                    binding="#{LogProAcrPotBen6.campoIdFichaHogar1Texto1}"
                                                    text="#{LogProAcrPotBen6.logProAcrPotBenDataProvider.value['codigo_ficha_hogar_1x7y3']}"/>
                                                <webuijsf:button id="campoIdFichaHogar1Boton1"
                                                    binding="#{LogProAcrPotBen6.campoIdFichaHogar1Boton1}"
                                                    onClick="#{LogProAcrPotBen6.asistente.scriptCampoIdFichaHogar1Boton1}"/>
                                                <webuijsf:button id="campoIdFichaHogar1Boton3"
                                                    binding="#{LogProAcrPotBen6.campoIdFichaHogar1Boton3}"
                                                    onClick="#{LogProAcrPotBen6.asistente.scriptCampoIdFichaHogar1Boton2}"
                                                    rendered="#{LogProAcrPotBen6.asistente.campoIdFichaHogar1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdFichaHogar1"
                                                    for="campoIdFichaHogar1"/>
                                                <webuijsf:helpInline id="helpInlineIdFichaHogar1"
                                                    binding="#{LogProAcrPotBen6.helpInlineIdFichaHogar1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_ficha_hogar.log_pro_acr_pot_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdFichaHogar3"
                                                rendered="#{LogProAcrPotBen6.asistente.campoIdFichaHogar1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProAcrPotBen6.labelIdFichaHogar2}"
                                                    id="labelIdFichaHogar2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre ficha hogar"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdFichaHogar4"
                                                rendered="#{LogProAcrPotBen6.asistente.campoIdFichaHogar1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{LogProAcrPotBen6.campoIdFichaHogar1Texto2}"
                                                    id="campoIdFichaHogar1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{LogProAcrPotBen6.campoIdFichaHogar1Boton2}"
                                                    id="campoIdFichaHogar1Boton2"
                                                    onClick="#{LogProAcrPotBen6.asistente.scriptCampoIdFichaHogar1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridCodigoFichaHogar1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProAcrPotBen6.labelCodigoFichaHogar1}"
                                                    id="labelCodigoFichaHogar1"
                                                    for="campoCodigoFichaHogar1"
                                                    toolTip="BundleParametros.codigo_ficha_hogar.log_pro_acr_pot_ben"
                                                    text="c&#243;digo ficha hogar"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridCodigoFichaHogar2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoCodigoFichaHogar1"
                                                    binding="#{LogProAcrPotBen6.campoCodigoFichaHogar1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{LogProAcrPotBen6.gestor.filaNoProcesada}"
                                                    text="#{LogProAcrPotBen6.logProAcrPotBenDataProvider.value['codigo_ficha_hogar']}"
                                                    toolTip="BundleParametros.codigo_ficha_hogar.log_pro_acr_pot_ben"
                                                    validatorExpression="#{LogProAcrPotBen6.validatorCodigoFichaHogar1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoFichaHogar1Texto1"
                                                    binding="#{LogProAcrPotBen6.campoCodigoFichaHogar1Texto1}"
                                                    text="#{LogProAcrPotBen6.logProAcrPotBenDataProvider.value['codigo_ficha_hogar']}"/>
                                                <webuijsf:message id="messageCodigoFichaHogar1"
                                                    for="campoCodigoFichaHogar1"/>
                                                <webuijsf:helpInline id="helpInlineCodigoFichaHogar1"
                                                    binding="#{LogProAcrPotBen6.helpInlineCodigoFichaHogar1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.codigo_ficha_hogar.log_pro_acr_pot_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIndiceCalidadVida1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProAcrPotBen6.labelIndiceCalidadVida1}"
                                                    id="labelIndiceCalidadVida1"
                                                    for="campoIndiceCalidadVida1"
                                                    toolTip="BundleParametros.indice_calidad_vida.log_pro_acr_pot_ben"
                                                    text="indice calidad vida"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIndiceCalidadVida2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIndiceCalidadVida1"
                                                    binding="#{LogProAcrPotBen6.campoIndiceCalidadVida1}"
                                                    converter="#{LogProAcrPotBen6.converterIndiceCalidadVida1}"
                                                    readOnly="#{LogProAcrPotBen6.gestor.filaNoProcesada}"
                                                    text="#{LogProAcrPotBen6.logProAcrPotBenDataProvider.value['indice_calidad_vida']}"
                                                    toolTip="BundleParametros.indice_calidad_vida.log_pro_acr_pot_ben"
                                                    validatorExpression="#{LogProAcrPotBen6.validatorIndiceCalidadVida1.validate}"/>
                                                <webuijsf:staticText id="campoIndiceCalidadVida1Texto1"
                                                    binding="#{LogProAcrPotBen6.campoIndiceCalidadVida1Texto1}"
                                                    converter="#{LogProAcrPotBen6.converterIndiceCalidadVida1}"
                                                    text="#{LogProAcrPotBen6.logProAcrPotBenDataProvider.value['indice_calidad_vida']}"/>
                                                <webuijsf:message id="messageIndiceCalidadVida1"
                                                    for="campoIndiceCalidadVida1"/>
                                                <webuijsf:helpInline id="helpInlineIndiceCalidadVida1"
                                                    binding="#{LogProAcrPotBen6.helpInlineIndiceCalidadVida1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.indice_calidad_vida.log_pro_acr_pot_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsProcesado1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProAcrPotBen6.labelEsProcesado1}"
                                                    id="labelEsProcesado1"
                                                    for="listaEsProcesado1"
                                                    toolTip="BundleParametros.es_procesado.log_pro_acr_pot_ben"
                                                    text="procesado"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsProcesado2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsProcesado1"
                                                    binding="#{LogProAcrPotBen6.listaEsProcesado1}"
                                                    converter="#{LogProAcrPotBen6.converterEsProcesado1}"
                                                    disabled="#{LogProAcrPotBen6.gestor.filaNoProcesada}" required="true"
                                                    items="#{LogProAcrPotBen6.asistente.opcionesListaEsProcesado1}"
                                                    selected="#{LogProAcrPotBen6.logProAcrPotBenDataProvider.value['es_procesado']}"
                                                    toolTip="BundleParametros.es_procesado.log_pro_acr_pot_ben"/>
                                                <webuijsf:staticText id="listaEsProcesado1Texto1"
                                                    binding="#{LogProAcrPotBen6.listaEsProcesado1Texto1}"/>
                                                <webuijsf:message id="messageEsProcesado1"
                                                    for="listaEsProcesado1"/>
                                                <webuijsf:helpInline id="helpInlineEsProcesado1"
                                                    binding="#{LogProAcrPotBen6.helpInlineEsProcesado1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_procesado.log_pro_acr_pot_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridObservacion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProAcrPotBen6.labelObservacion1}"
                                                    id="labelObservacion1"
                                                    for="campoObservacion1"
                                                    toolTip="BundleParametros.observacion.log_pro_acr_pot_ben"
                                                    text="observaci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridObservacion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoObservacion1"
                                                    binding="#{LogProAcrPotBen6.campoObservacion1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogProAcrPotBen6.gestor.filaNoProcesada}"
                                                    text="#{LogProAcrPotBen6.logProAcrPotBenDataProvider.value['observacion']}"
                                                    toolTip="BundleParametros.observacion.log_pro_acr_pot_ben"
                                                    validatorExpression="#{LogProAcrPotBen6.validatorObservacion1.validate}"/>
                                                <webuijsf:staticText id="campoObservacion1Texto1"
                                                    binding="#{LogProAcrPotBen6.campoObservacion1Texto1}"
                                                    text="#{LogProAcrPotBen6.logProAcrPotBenDataProvider.value['observacion']}"/>
                                                <webuijsf:message id="messageObservacion1"
                                                    for="campoObservacion1"/>
                                                <webuijsf:helpInline id="helpInlineObservacion1"
                                                    binding="#{LogProAcrPotBen6.helpInlineObservacion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.observacion.log_pro_acr_pot_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaHoraTransaccion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProAcrPotBen6.labelFechaHoraTransaccion1}"
                                                    id="labelFechaHoraTransaccion1"
                                                    for="campoFechaHoraTransaccion1"
                                                    toolTip="BundleParametros.fecha_hora_transaccion.log_pro_acr_pot_ben"
                                                    text="fecha hora transacci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaHoraTransaccion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoFechaHoraTransaccion1"
                                                    binding="#{LogProAcrPotBen6.campoFechaHoraTransaccion1}"
                                                    converter="#{LogProAcrPotBen6.converterFechaHoraTransaccion1}"
                                                    readOnly="#{LogProAcrPotBen6.gestor.filaNoProcesada}" required="true"
                                                    text="#{LogProAcrPotBen6.logProAcrPotBenDataProvider.value['fecha_hora_transaccion']}"
                                                    toolTip="BundleParametros.fecha_hora_transaccion.log_pro_acr_pot_ben"/>
                                                <webuijsf:staticText id="campoFechaHoraTransaccion1Texto1"
                                                    binding="#{LogProAcrPotBen6.campoFechaHoraTransaccion1Texto1}"
                                                    converter="#{LogProAcrPotBen6.converterFechaHoraTransaccion1}"
                                                    text="#{LogProAcrPotBen6.logProAcrPotBenDataProvider.value['fecha_hora_transaccion']}"/>
                                                <webuijsf:message id="messageFechaHoraTransaccion1"
                                                    for="campoFechaHoraTransaccion1"/>
                                                <webuijsf:helpInline id="helpInlineFechaHoraTransaccion1"
                                                    binding="#{LogProAcrPotBen6.helpInlineFechaHoraTransaccion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_hora_transaccion.log_pro_acr_pot_ben"
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
                                                        actionExpression="#{LogProAcrPotBen6.botonIrAlPrimero2_action}"
                                                        binding="#{LogProAcrPotBen6.botonIrAlPrimero2}"
                                                        disabled="#{LogProAcrPotBen6.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero2"
                                                        imageURL="#{LogProAcrPotBen6.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{LogProAcrPotBen6.gestor.scriptIrAlPrimero}"
                                                        text="#{LogProAcrPotBen6.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{LogProAcrPotBen6.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogProAcrPotBen6.botonIrAlAnterior2_action}"
                                                        binding="#{LogProAcrPotBen6.botonIrAlAnterior2}"
                                                        disabled="#{LogProAcrPotBen6.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior2"
                                                        imageURL="#{LogProAcrPotBen6.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{LogProAcrPotBen6.gestor.scriptIrAlAnterior}"
                                                        text="#{LogProAcrPotBen6.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{LogProAcrPotBen6.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogProAcrPotBen6.botonIrAlSiguiente2_action}"
                                                        binding="#{LogProAcrPotBen6.botonIrAlSiguiente2}"
                                                        disabled="#{LogProAcrPotBen6.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente2"
                                                        imageURL="#{LogProAcrPotBen6.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{LogProAcrPotBen6.gestor.scriptIrAlSiguiente}"
                                                        text="#{LogProAcrPotBen6.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{LogProAcrPotBen6.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogProAcrPotBen6.botonIrAlUltimo2_action}"
                                                        binding="#{LogProAcrPotBen6.botonIrAlUltimo2}"
                                                        disabled="#{LogProAcrPotBen6.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo2"
                                                        imageURL="#{LogProAcrPotBen6.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{LogProAcrPotBen6.gestor.scriptIrAlUltimo}"
                                                        text="#{LogProAcrPotBen6.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{LogProAcrPotBen6.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogProAcrPotBen6.botonProcesarFila2_action}"
                                                        binding="#{LogProAcrPotBen6.botonProcesarFila2}"
                                                        disabled="#{LogProAcrPotBen6.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila2"
                                                        imageURL="#{LogProAcrPotBen6.gestor.urlImagenProcesar}"
                                                        onClick="#{LogProAcrPotBen6.scriptAbrirVentanaProcesarFila2}"
                                                        rendered="#{LogProAcrPotBen6.asistente.comandoDisponible}"
                                                        text="#{LogProAcrPotBen6.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{LogProAcrPotBen6.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{LogProAcrPotBen6.gestor.mensajeCambiosPorConfirmar}"/>
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
                                                    actionExpression="#{LogProAcrPotBen6.botonAgregar1_action}"
                                                    binding="#{LogProAcrPotBen6.botonAgregar1}"
                                                    disabled="#{LogProAcrPotBen6.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{LogProAcrPotBen6.gestor.scriptAgregar}"
                                                    rendered="#{LogProAcrPotBen6.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProAcrPotBen6.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{LogProAcrPotBen6.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{LogProAcrPotBen6.listaFuncionEdicion1}"
                                                    converter="#{LogProAcrPotBen6.converterListaFuncionEdicion1}"
                                                    disabled="#{LogProAcrPotBen6.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{LogProAcrPotBen6.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{LogProAcrPotBen6.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{LogProAcrPotBen6.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{LogProAcrPotBen6.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProAcrPotBen6.botonEditar1_action}"
                                                    binding="#{LogProAcrPotBen6.botonEditar1}"
                                                    disabled="#{LogProAcrPotBen6.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{LogProAcrPotBen6.gestor.scriptEditar}"
                                                    rendered="#{LogProAcrPotBen6.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProAcrPotBen6.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{LogProAcrPotBen6.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProAcrPotBen6.botonEliminar1_action}"
                                                    binding="#{LogProAcrPotBen6.botonEliminar1}"
                                                    disabled="#{LogProAcrPotBen6.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{LogProAcrPotBen6.gestor.scriptEliminar}"
                                                    rendered="#{LogProAcrPotBen6.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProAcrPotBen6.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{LogProAcrPotBen6.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProAcrPotBen6.botonAplicar1_action}"
                                                    binding="#{LogProAcrPotBen6.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{LogProAcrPotBen6.gestor.scriptAplicar}"
                                                    rendered="#{LogProAcrPotBen6.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProAcrPotBen6.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{LogProAcrPotBen6.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProAcrPotBen6.botonDeshacer1_action}"
                                                    binding="#{LogProAcrPotBen6.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{LogProAcrPotBen6.gestor.scriptDeshacer}"
                                                    rendered="#{LogProAcrPotBen6.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProAcrPotBen6.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{LogProAcrPotBen6.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProAcrPotBen6.botonConfirmar1_action}"
                                                    binding="#{LogProAcrPotBen6.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{LogProAcrPotBen6.gestor.scriptConfirmar}"
                                                    rendered="#{LogProAcrPotBen6.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProAcrPotBen6.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{LogProAcrPotBen6.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProAcrPotBen6.botonDescartar1_action}"
                                                    binding="#{LogProAcrPotBen6.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{LogProAcrPotBen6.gestor.scriptDescartar}"
                                                    rendered="#{LogProAcrPotBen6.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProAcrPotBen6.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{LogProAcrPotBen6.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{LogProAcrPotBen6.listaFuncionAccion1}"
                                                    converter="#{LogProAcrPotBen6.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{LogProAcrPotBen6.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{LogProAcrPotBen6.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{LogProAcrPotBen6.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{LogProAcrPotBen6.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProAcrPotBen6.botonProcesar1_action}"
                                                    binding="#{LogProAcrPotBen6.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{LogProAcrPotBen6.gestor.scriptProcesar}"
                                                    rendered="#{LogProAcrPotBen6.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProAcrPotBen6.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{LogProAcrPotBen6.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProAcrPotBen6.botonRefrescar1_action}"
                                                    binding="#{LogProAcrPotBen6.botonRefrescar1}"
                                                    disabled="#{LogProAcrPotBen6.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{LogProAcrPotBen6.gestor.scriptRefrescar}"
                                                    rendered="#{LogProAcrPotBen6.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProAcrPotBen6.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{LogProAcrPotBen6.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProAcrPotBen6.botonReconsultar1_action}"
                                                    binding="#{LogProAcrPotBen6.botonReconsultar1}"
                                                    disabled="#{LogProAcrPotBen6.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{LogProAcrPotBen6.gestor.scriptReconsultar}"
                                                    rendered="#{LogProAcrPotBen6.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProAcrPotBen6.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{LogProAcrPotBen6.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProAcrPotBen6.botonRetornar1_action}"
                                                    binding="#{LogProAcrPotBen6.botonRetornar1}"
                                                    disabled="#{LogProAcrPotBen6.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{LogProAcrPotBen6.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{LogProAcrPotBen6.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProAcrPotBen6.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{LogProAcrPotBen6.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel125"
                                                rendered="#{LogProAcrPotBen6.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{LogProAcrPotBen6.imageHyperlink1_action}"
                                                    binding="#{LogProAcrPotBen6.imageHyperlink1}"
                                                    disabled="#{LogProAcrPotBen6.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{LogProAcrPotBen6.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{LogProAcrPotBen6.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{LogProAcrPotBen6.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.LogProAcrPotBen6_imageHyperlink1_toolTip}"/>
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
