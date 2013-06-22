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
                    focus="#{LogImpPer6.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{LogImpPer6.gestor.preserveFocus}"
                    preserveScroll="#{LogImpPer6.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{LogImpPer6.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | campoIdLogImpPer1 campoP01a1 campoP01b1 campoP01c1 campoP01d1 campoP021 campoP031 campoP1041 campoP431 campoP45a1 campoP45b1 campoP44a1 campoP44b1 campoVar000011 campoVar000021 campoP461 campoP471 campoVar000301 campoP481 campoP491 campoP50a1 campoP50b1 campoP50c1 campoP511 campoVar000031 campoVar000041 campoP52d1 campoP52m1 campoP52a1 campoP53a1 campoP53b1 campoP53c1 campoP53z1 campoP541 campoP54e1 campoP561 campoP581 campoP58e1 campoP591 campoP601 campoP611 campoP621 campoP631 campoP641 campoP651 campoP65e1 campoP661 campoP66e1 campoP671 campoP681 campoP68e1 campoP731 campoP741 campoVar000061 campoVar000071 campoVar000081 campoVar000091 campoVar000101 campoVar000111 campoVar000311 campoVar000121 campoVar000131 campoP861 campoP871 campoP87e1 campoP881 campoP88e1 campoP911 campoVar000171 campoVar000181 campoVar000191 campoVar000201 campoVar000211 campoVar000221 campoVar000231 campoVar000241 campoVar000251 campoVar000261 campoVar000271 campoVar000281 campoP921 campoIcv1 campoFichaActiva1 listaEsImportado1 campoObservacion1 campoFechaHoraTransaccion1 campoNombreArchivo1 campoCodigoArchivo1 campoIdFichaPersona1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | | , virtualForm3 | listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{LogImpPer6.breadcrumbs1}" 
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
                                                    rendered="#{LogImpPer6.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{LogImpPer6.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{LogImpPer6.gestor.mensajeDisponible}"
                                                    text="#{LogImpPer6.gestor.mensaje}"
                                                    url="#{LogImpPer6.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            id="gridPanel104"
                                            rendered="#{LogImpPer6.gestor.filaDisponible}"
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
                                                        actionExpression="#{LogImpPer6.botonIrAlPrimero1_action}"
                                                        binding="#{LogImpPer6.botonIrAlPrimero1}"
                                                        disabled="#{LogImpPer6.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero1"
                                                        imageURL="#{LogImpPer6.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{LogImpPer6.gestor.scriptIrAlPrimero}"
                                                        text="#{LogImpPer6.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{LogImpPer6.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpPer6.botonIrAlAnterior1_action}"
                                                        binding="#{LogImpPer6.botonIrAlAnterior1}"
                                                        disabled="#{LogImpPer6.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior1"
                                                        imageURL="#{LogImpPer6.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{LogImpPer6.gestor.scriptIrAlAnterior}"
                                                        text="#{LogImpPer6.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{LogImpPer6.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpPer6.botonIrAlSiguiente1_action}"
                                                        binding="#{LogImpPer6.botonIrAlSiguiente1}"
                                                        disabled="#{LogImpPer6.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente1"
                                                        imageURL="#{LogImpPer6.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{LogImpPer6.gestor.scriptIrAlSiguiente}"
                                                        text="#{LogImpPer6.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{LogImpPer6.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpPer6.botonIrAlUltimo1_action}"
                                                        binding="#{LogImpPer6.botonIrAlUltimo1}"
                                                        disabled="#{LogImpPer6.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo1"
                                                        imageURL="#{LogImpPer6.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{LogImpPer6.gestor.scriptIrAlUltimo}"
                                                        text="#{LogImpPer6.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{LogImpPer6.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpPer6.botonProcesarFila1_action}"
                                                        binding="#{LogImpPer6.botonProcesarFila1}"
                                                        disabled="#{LogImpPer6.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila1"
                                                        imageURL="#{LogImpPer6.gestor.urlImagenProcesar}"
                                                        onClick="#{LogImpPer6.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{LogImpPer6.asistente.comandoDisponible}"
                                                        text="#{LogImpPer6.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{LogImpPer6.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{LogImpPer6.gestor.tituloConsulta}"/>
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
                                                    binding="#{LogImpPer6.etiquetaIdentificacionFila1}"
                                                    id="etiquetaIdentificacionFila1"
                                                    text="#{LogImpPer6.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{LogImpPer6.gestor.i18n.toolTipEtiquetaIdentificacionFila}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel113"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoIdentificacionFila1"
                                                    style="font-weight: bold"
                                                    text="#{LogImpPer6.gestor.identificacionFila}"/>
                                                <webuijsf:image
                                                    id="imagenFilaProcesada1"
                                                    toolTip="#{LogImpPer6.gestor.toolTipImagenFilaProcesada}"
                                                    url="#{LogImpPer6.gestor.urlImagenFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPanel114"
                                                rendered="#{LogImpPer6.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.etiquetaDenominacionFilaMaestro1}"
                                                    id="etiquetaDenominacionFilaMaestro1"
                                                    text="?"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel115"
                                                rendered="#{LogImpPer6.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoDenominacionFilaMaestro1"
                                                    style="font-weight: bold"
                                                    text="#{LogImpPer6.gestor.denominacionFilaMaestro}"/>
                                                <webuijsf:image
                                                    id="imagenFilaMaestro1"
                                                    url="#{LogImpPer6.gestor.urlImagenMaestroFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdLogImpPer1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelIdLogImpPer1}"
                                                    id="labelIdLogImpPer1"
                                                    for="campoIdLogImpPer1"
                                                    toolTip="BundleParametros.id_log_imp_per.log_imp_per"
                                                    text="identificaci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdLogImpPer2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdLogImpPer1"
                                                    binding="#{LogImpPer6.campoIdLogImpPer1}"
                                                    converter="#{LogImpPer6.converterIdLogImpPer1}"
                                                    readOnly="true"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['id_log_imp_per']}"
                                                    toolTip="BundleParametros.id_log_imp_per.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorIdLogImpPer1.validate}"/>
                                                <webuijsf:staticText id="campoIdLogImpPer1Texto1"
                                                    binding="#{LogImpPer6.campoIdLogImpPer1Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['id_log_imp_per']}"/>
                                                <webuijsf:message id="messageIdLogImpPer1"
                                                    for="campoIdLogImpPer1"/>
                                                <webuijsf:helpInline id="helpInlineIdLogImpPer1"
                                                    binding="#{LogImpPer6.helpInlineIdLogImpPer1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_log_imp_per.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP01a1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelP01a1}"
                                                    id="labelP01a1"
                                                    for="campoP01a1"
                                                    toolTip="BundleParametros.p01a.log_imp_per"
                                                    text="p01a"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP01a2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP01a1"
                                                    binding="#{LogImpPer6.campoP01a1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p01a']}"
                                                    toolTip="BundleParametros.p01a.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorP01a1.validate}"/>
                                                <webuijsf:staticText id="campoP01a1Texto1"
                                                    binding="#{LogImpPer6.campoP01a1Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p01a']}"/>
                                                <webuijsf:message id="messageP01a1"
                                                    for="campoP01a1"/>
                                                <webuijsf:helpInline id="helpInlineP01a1"
                                                    binding="#{LogImpPer6.helpInlineP01a1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p01a.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP01b1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelP01b1}"
                                                    id="labelP01b1"
                                                    for="campoP01b1"
                                                    toolTip="BundleParametros.p01b.log_imp_per"
                                                    text="p01b"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP01b2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP01b1"
                                                    binding="#{LogImpPer6.campoP01b1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p01b']}"
                                                    toolTip="BundleParametros.p01b.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorP01b1.validate}"/>
                                                <webuijsf:staticText id="campoP01b1Texto1"
                                                    binding="#{LogImpPer6.campoP01b1Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p01b']}"/>
                                                <webuijsf:message id="messageP01b1"
                                                    for="campoP01b1"/>
                                                <webuijsf:helpInline id="helpInlineP01b1"
                                                    binding="#{LogImpPer6.helpInlineP01b1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p01b.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP01c1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelP01c1}"
                                                    id="labelP01c1"
                                                    for="campoP01c1"
                                                    toolTip="BundleParametros.p01c.log_imp_per"
                                                    text="p01c"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP01c2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP01c1"
                                                    binding="#{LogImpPer6.campoP01c1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p01c']}"
                                                    toolTip="BundleParametros.p01c.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorP01c1.validate}"/>
                                                <webuijsf:staticText id="campoP01c1Texto1"
                                                    binding="#{LogImpPer6.campoP01c1Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p01c']}"/>
                                                <webuijsf:message id="messageP01c1"
                                                    for="campoP01c1"/>
                                                <webuijsf:helpInline id="helpInlineP01c1"
                                                    binding="#{LogImpPer6.helpInlineP01c1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p01c.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP01d1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelP01d1}"
                                                    id="labelP01d1"
                                                    for="campoP01d1"
                                                    toolTip="BundleParametros.p01d.log_imp_per"
                                                    text="p01d"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP01d2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP01d1"
                                                    binding="#{LogImpPer6.campoP01d1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p01d']}"
                                                    toolTip="BundleParametros.p01d.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorP01d1.validate}"/>
                                                <webuijsf:staticText id="campoP01d1Texto1"
                                                    binding="#{LogImpPer6.campoP01d1Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p01d']}"/>
                                                <webuijsf:message id="messageP01d1"
                                                    for="campoP01d1"/>
                                                <webuijsf:helpInline id="helpInlineP01d1"
                                                    binding="#{LogImpPer6.helpInlineP01d1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p01d.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP021"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelP021}"
                                                    id="labelP021"
                                                    for="campoP021"
                                                    toolTip="BundleParametros.p02.log_imp_per"
                                                    text="p02"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP022"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP021"
                                                    binding="#{LogImpPer6.campoP021}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p02']}"
                                                    toolTip="BundleParametros.p02.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorP021.validate}"/>
                                                <webuijsf:staticText id="campoP021Texto1"
                                                    binding="#{LogImpPer6.campoP021Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p02']}"/>
                                                <webuijsf:message id="messageP021"
                                                    for="campoP021"/>
                                                <webuijsf:helpInline id="helpInlineP021"
                                                    binding="#{LogImpPer6.helpInlineP021}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p02.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP031"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelP031}"
                                                    id="labelP031"
                                                    for="campoP031"
                                                    toolTip="BundleParametros.p03.log_imp_per"
                                                    text="p03"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP032"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP031"
                                                    binding="#{LogImpPer6.campoP031}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p03']}"
                                                    toolTip="BundleParametros.p03.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorP031.validate}"/>
                                                <webuijsf:staticText id="campoP031Texto1"
                                                    binding="#{LogImpPer6.campoP031Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p03']}"/>
                                                <webuijsf:message id="messageP031"
                                                    for="campoP031"/>
                                                <webuijsf:helpInline id="helpInlineP031"
                                                    binding="#{LogImpPer6.helpInlineP031}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p03.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP1041"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelP1041}"
                                                    id="labelP1041"
                                                    for="campoP1041"
                                                    toolTip="BundleParametros.p104.log_imp_per"
                                                    text="p104"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP1042"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP1041"
                                                    binding="#{LogImpPer6.campoP1041}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p104']}"
                                                    toolTip="BundleParametros.p104.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorP1041.validate}"/>
                                                <webuijsf:staticText id="campoP1041Texto1"
                                                    binding="#{LogImpPer6.campoP1041Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p104']}"/>
                                                <webuijsf:message id="messageP1041"
                                                    for="campoP1041"/>
                                                <webuijsf:helpInline id="helpInlineP1041"
                                                    binding="#{LogImpPer6.helpInlineP1041}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p104.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP431"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelP431}"
                                                    id="labelP431"
                                                    for="campoP431"
                                                    toolTip="BundleParametros.p43.log_imp_per"
                                                    text="p43"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP432"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP431"
                                                    binding="#{LogImpPer6.campoP431}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p43']}"
                                                    toolTip="BundleParametros.p43.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorP431.validate}"/>
                                                <webuijsf:staticText id="campoP431Texto1"
                                                    binding="#{LogImpPer6.campoP431Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p43']}"/>
                                                <webuijsf:message id="messageP431"
                                                    for="campoP431"/>
                                                <webuijsf:helpInline id="helpInlineP431"
                                                    binding="#{LogImpPer6.helpInlineP431}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p43.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP45a1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelP45a1}"
                                                    id="labelP45a1"
                                                    for="campoP45a1"
                                                    toolTip="BundleParametros.p45a.log_imp_per"
                                                    text="p45a"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP45a2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP45a1"
                                                    binding="#{LogImpPer6.campoP45a1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p45a']}"
                                                    toolTip="BundleParametros.p45a.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorP45a1.validate}"/>
                                                <webuijsf:staticText id="campoP45a1Texto1"
                                                    binding="#{LogImpPer6.campoP45a1Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p45a']}"/>
                                                <webuijsf:message id="messageP45a1"
                                                    for="campoP45a1"/>
                                                <webuijsf:helpInline id="helpInlineP45a1"
                                                    binding="#{LogImpPer6.helpInlineP45a1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p45a.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP45b1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelP45b1}"
                                                    id="labelP45b1"
                                                    for="campoP45b1"
                                                    toolTip="BundleParametros.p45b.log_imp_per"
                                                    text="p45b"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP45b2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP45b1"
                                                    binding="#{LogImpPer6.campoP45b1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p45b']}"
                                                    toolTip="BundleParametros.p45b.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorP45b1.validate}"/>
                                                <webuijsf:staticText id="campoP45b1Texto1"
                                                    binding="#{LogImpPer6.campoP45b1Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p45b']}"/>
                                                <webuijsf:message id="messageP45b1"
                                                    for="campoP45b1"/>
                                                <webuijsf:helpInline id="helpInlineP45b1"
                                                    binding="#{LogImpPer6.helpInlineP45b1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p45b.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP44a1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelP44a1}"
                                                    id="labelP44a1"
                                                    for="campoP44a1"
                                                    toolTip="BundleParametros.p44a.log_imp_per"
                                                    text="p44a"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP44a2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP44a1"
                                                    binding="#{LogImpPer6.campoP44a1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p44a']}"
                                                    toolTip="BundleParametros.p44a.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorP44a1.validate}"/>
                                                <webuijsf:staticText id="campoP44a1Texto1"
                                                    binding="#{LogImpPer6.campoP44a1Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p44a']}"/>
                                                <webuijsf:message id="messageP44a1"
                                                    for="campoP44a1"/>
                                                <webuijsf:helpInline id="helpInlineP44a1"
                                                    binding="#{LogImpPer6.helpInlineP44a1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p44a.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP44b1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelP44b1}"
                                                    id="labelP44b1"
                                                    for="campoP44b1"
                                                    toolTip="BundleParametros.p44b.log_imp_per"
                                                    text="p44b"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP44b2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP44b1"
                                                    binding="#{LogImpPer6.campoP44b1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p44b']}"
                                                    toolTip="BundleParametros.p44b.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorP44b1.validate}"/>
                                                <webuijsf:staticText id="campoP44b1Texto1"
                                                    binding="#{LogImpPer6.campoP44b1Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p44b']}"/>
                                                <webuijsf:message id="messageP44b1"
                                                    for="campoP44b1"/>
                                                <webuijsf:helpInline id="helpInlineP44b1"
                                                    binding="#{LogImpPer6.helpInlineP44b1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p44b.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridVar000011"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelVar000011}"
                                                    id="labelVar000011"
                                                    for="campoVar000011"
                                                    toolTip="BundleParametros.var00001.log_imp_per"
                                                    text="var00001"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridVar000012"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoVar000011"
                                                    binding="#{LogImpPer6.campoVar000011}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['var00001']}"
                                                    toolTip="BundleParametros.var00001.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorVar000011.validate}"/>
                                                <webuijsf:staticText id="campoVar000011Texto1"
                                                    binding="#{LogImpPer6.campoVar000011Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['var00001']}"/>
                                                <webuijsf:message id="messageVar000011"
                                                    for="campoVar000011"/>
                                                <webuijsf:helpInline id="helpInlineVar000011"
                                                    binding="#{LogImpPer6.helpInlineVar000011}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.var00001.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridVar000021"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelVar000021}"
                                                    id="labelVar000021"
                                                    for="campoVar000021"
                                                    toolTip="BundleParametros.var00002.log_imp_per"
                                                    text="var00002"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridVar000022"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoVar000021"
                                                    binding="#{LogImpPer6.campoVar000021}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['var00002']}"
                                                    toolTip="BundleParametros.var00002.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorVar000021.validate}"/>
                                                <webuijsf:staticText id="campoVar000021Texto1"
                                                    binding="#{LogImpPer6.campoVar000021Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['var00002']}"/>
                                                <webuijsf:message id="messageVar000021"
                                                    for="campoVar000021"/>
                                                <webuijsf:helpInline id="helpInlineVar000021"
                                                    binding="#{LogImpPer6.helpInlineVar000021}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.var00002.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP461"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelP461}"
                                                    id="labelP461"
                                                    for="campoP461"
                                                    toolTip="BundleParametros.p46.log_imp_per"
                                                    text="p46"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP462"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP461"
                                                    binding="#{LogImpPer6.campoP461}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p46']}"
                                                    toolTip="BundleParametros.p46.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorP461.validate}"/>
                                                <webuijsf:staticText id="campoP461Texto1"
                                                    binding="#{LogImpPer6.campoP461Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p46']}"/>
                                                <webuijsf:message id="messageP461"
                                                    for="campoP461"/>
                                                <webuijsf:helpInline id="helpInlineP461"
                                                    binding="#{LogImpPer6.helpInlineP461}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p46.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP471"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelP471}"
                                                    id="labelP471"
                                                    for="campoP471"
                                                    toolTip="BundleParametros.p47.log_imp_per"
                                                    text="p47"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP472"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP471"
                                                    binding="#{LogImpPer6.campoP471}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p47']}"
                                                    toolTip="BundleParametros.p47.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorP471.validate}"/>
                                                <webuijsf:staticText id="campoP471Texto1"
                                                    binding="#{LogImpPer6.campoP471Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p47']}"/>
                                                <webuijsf:message id="messageP471"
                                                    for="campoP471"/>
                                                <webuijsf:helpInline id="helpInlineP471"
                                                    binding="#{LogImpPer6.helpInlineP471}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p47.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridVar000301"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelVar000301}"
                                                    id="labelVar000301"
                                                    for="campoVar000301"
                                                    toolTip="BundleParametros.var00030.log_imp_per"
                                                    text="var00030"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridVar000302"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoVar000301"
                                                    binding="#{LogImpPer6.campoVar000301}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['var00030']}"
                                                    toolTip="BundleParametros.var00030.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorVar000301.validate}"/>
                                                <webuijsf:staticText id="campoVar000301Texto1"
                                                    binding="#{LogImpPer6.campoVar000301Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['var00030']}"/>
                                                <webuijsf:message id="messageVar000301"
                                                    for="campoVar000301"/>
                                                <webuijsf:helpInline id="helpInlineVar000301"
                                                    binding="#{LogImpPer6.helpInlineVar000301}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.var00030.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP481"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelP481}"
                                                    id="labelP481"
                                                    for="campoP481"
                                                    toolTip="BundleParametros.p48.log_imp_per"
                                                    text="p48"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP482"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP481"
                                                    binding="#{LogImpPer6.campoP481}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p48']}"
                                                    toolTip="BundleParametros.p48.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorP481.validate}"/>
                                                <webuijsf:staticText id="campoP481Texto1"
                                                    binding="#{LogImpPer6.campoP481Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p48']}"/>
                                                <webuijsf:message id="messageP481"
                                                    for="campoP481"/>
                                                <webuijsf:helpInline id="helpInlineP481"
                                                    binding="#{LogImpPer6.helpInlineP481}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p48.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP491"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelP491}"
                                                    id="labelP491"
                                                    for="campoP491"
                                                    toolTip="BundleParametros.p49.log_imp_per"
                                                    text="p49"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP492"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP491"
                                                    binding="#{LogImpPer6.campoP491}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p49']}"
                                                    toolTip="BundleParametros.p49.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorP491.validate}"/>
                                                <webuijsf:staticText id="campoP491Texto1"
                                                    binding="#{LogImpPer6.campoP491Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p49']}"/>
                                                <webuijsf:message id="messageP491"
                                                    for="campoP491"/>
                                                <webuijsf:helpInline id="helpInlineP491"
                                                    binding="#{LogImpPer6.helpInlineP491}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p49.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP50a1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelP50a1}"
                                                    id="labelP50a1"
                                                    for="campoP50a1"
                                                    toolTip="BundleParametros.p50a.log_imp_per"
                                                    text="p50a"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP50a2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP50a1"
                                                    binding="#{LogImpPer6.campoP50a1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p50a']}"
                                                    toolTip="BundleParametros.p50a.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorP50a1.validate}"/>
                                                <webuijsf:staticText id="campoP50a1Texto1"
                                                    binding="#{LogImpPer6.campoP50a1Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p50a']}"/>
                                                <webuijsf:message id="messageP50a1"
                                                    for="campoP50a1"/>
                                                <webuijsf:helpInline id="helpInlineP50a1"
                                                    binding="#{LogImpPer6.helpInlineP50a1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p50a.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP50b1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelP50b1}"
                                                    id="labelP50b1"
                                                    for="campoP50b1"
                                                    toolTip="BundleParametros.p50b.log_imp_per"
                                                    text="p50b"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP50b2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP50b1"
                                                    binding="#{LogImpPer6.campoP50b1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p50b']}"
                                                    toolTip="BundleParametros.p50b.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorP50b1.validate}"/>
                                                <webuijsf:staticText id="campoP50b1Texto1"
                                                    binding="#{LogImpPer6.campoP50b1Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p50b']}"/>
                                                <webuijsf:message id="messageP50b1"
                                                    for="campoP50b1"/>
                                                <webuijsf:helpInline id="helpInlineP50b1"
                                                    binding="#{LogImpPer6.helpInlineP50b1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p50b.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP50c1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelP50c1}"
                                                    id="labelP50c1"
                                                    for="campoP50c1"
                                                    toolTip="BundleParametros.p50c.log_imp_per"
                                                    text="p50c"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP50c2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP50c1"
                                                    binding="#{LogImpPer6.campoP50c1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p50c']}"
                                                    toolTip="BundleParametros.p50c.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorP50c1.validate}"/>
                                                <webuijsf:staticText id="campoP50c1Texto1"
                                                    binding="#{LogImpPer6.campoP50c1Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p50c']}"/>
                                                <webuijsf:message id="messageP50c1"
                                                    for="campoP50c1"/>
                                                <webuijsf:helpInline id="helpInlineP50c1"
                                                    binding="#{LogImpPer6.helpInlineP50c1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p50c.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP511"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelP511}"
                                                    id="labelP511"
                                                    for="campoP511"
                                                    toolTip="BundleParametros.p51.log_imp_per"
                                                    text="p51"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP512"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP511"
                                                    binding="#{LogImpPer6.campoP511}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p51']}"
                                                    toolTip="BundleParametros.p51.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorP511.validate}"/>
                                                <webuijsf:staticText id="campoP511Texto1"
                                                    binding="#{LogImpPer6.campoP511Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p51']}"/>
                                                <webuijsf:message id="messageP511"
                                                    for="campoP511"/>
                                                <webuijsf:helpInline id="helpInlineP511"
                                                    binding="#{LogImpPer6.helpInlineP511}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p51.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridVar000031"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelVar000031}"
                                                    id="labelVar000031"
                                                    for="campoVar000031"
                                                    toolTip="BundleParametros.var00003.log_imp_per"
                                                    text="var00003"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridVar000032"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoVar000031"
                                                    binding="#{LogImpPer6.campoVar000031}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['var00003']}"
                                                    toolTip="BundleParametros.var00003.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorVar000031.validate}"/>
                                                <webuijsf:staticText id="campoVar000031Texto1"
                                                    binding="#{LogImpPer6.campoVar000031Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['var00003']}"/>
                                                <webuijsf:message id="messageVar000031"
                                                    for="campoVar000031"/>
                                                <webuijsf:helpInline id="helpInlineVar000031"
                                                    binding="#{LogImpPer6.helpInlineVar000031}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.var00003.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridVar000041"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelVar000041}"
                                                    id="labelVar000041"
                                                    for="campoVar000041"
                                                    toolTip="BundleParametros.var00004.log_imp_per"
                                                    text="var00004"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridVar000042"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoVar000041"
                                                    binding="#{LogImpPer6.campoVar000041}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['var00004']}"
                                                    toolTip="BundleParametros.var00004.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorVar000041.validate}"/>
                                                <webuijsf:staticText id="campoVar000041Texto1"
                                                    binding="#{LogImpPer6.campoVar000041Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['var00004']}"/>
                                                <webuijsf:message id="messageVar000041"
                                                    for="campoVar000041"/>
                                                <webuijsf:helpInline id="helpInlineVar000041"
                                                    binding="#{LogImpPer6.helpInlineVar000041}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.var00004.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP52d1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelP52d1}"
                                                    id="labelP52d1"
                                                    for="campoP52d1"
                                                    toolTip="BundleParametros.p52d.log_imp_per"
                                                    text="p52d"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP52d2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP52d1"
                                                    binding="#{LogImpPer6.campoP52d1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p52d']}"
                                                    toolTip="BundleParametros.p52d.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorP52d1.validate}"/>
                                                <webuijsf:staticText id="campoP52d1Texto1"
                                                    binding="#{LogImpPer6.campoP52d1Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p52d']}"/>
                                                <webuijsf:message id="messageP52d1"
                                                    for="campoP52d1"/>
                                                <webuijsf:helpInline id="helpInlineP52d1"
                                                    binding="#{LogImpPer6.helpInlineP52d1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p52d.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP52m1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelP52m1}"
                                                    id="labelP52m1"
                                                    for="campoP52m1"
                                                    toolTip="BundleParametros.p52m.log_imp_per"
                                                    text="p52m"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP52m2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP52m1"
                                                    binding="#{LogImpPer6.campoP52m1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p52m']}"
                                                    toolTip="BundleParametros.p52m.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorP52m1.validate}"/>
                                                <webuijsf:staticText id="campoP52m1Texto1"
                                                    binding="#{LogImpPer6.campoP52m1Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p52m']}"/>
                                                <webuijsf:message id="messageP52m1"
                                                    for="campoP52m1"/>
                                                <webuijsf:helpInline id="helpInlineP52m1"
                                                    binding="#{LogImpPer6.helpInlineP52m1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p52m.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP52a1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelP52a1}"
                                                    id="labelP52a1"
                                                    for="campoP52a1"
                                                    toolTip="BundleParametros.p52a.log_imp_per"
                                                    text="p52a"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP52a2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP52a1"
                                                    binding="#{LogImpPer6.campoP52a1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p52a']}"
                                                    toolTip="BundleParametros.p52a.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorP52a1.validate}"/>
                                                <webuijsf:staticText id="campoP52a1Texto1"
                                                    binding="#{LogImpPer6.campoP52a1Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p52a']}"/>
                                                <webuijsf:message id="messageP52a1"
                                                    for="campoP52a1"/>
                                                <webuijsf:helpInline id="helpInlineP52a1"
                                                    binding="#{LogImpPer6.helpInlineP52a1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p52a.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP53a1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelP53a1}"
                                                    id="labelP53a1"
                                                    for="campoP53a1"
                                                    toolTip="BundleParametros.p53a.log_imp_per"
                                                    text="p53a"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP53a2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP53a1"
                                                    binding="#{LogImpPer6.campoP53a1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p53a']}"
                                                    toolTip="BundleParametros.p53a.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorP53a1.validate}"/>
                                                <webuijsf:staticText id="campoP53a1Texto1"
                                                    binding="#{LogImpPer6.campoP53a1Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p53a']}"/>
                                                <webuijsf:message id="messageP53a1"
                                                    for="campoP53a1"/>
                                                <webuijsf:helpInline id="helpInlineP53a1"
                                                    binding="#{LogImpPer6.helpInlineP53a1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p53a.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP53b1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelP53b1}"
                                                    id="labelP53b1"
                                                    for="campoP53b1"
                                                    toolTip="BundleParametros.p53b.log_imp_per"
                                                    text="p53b"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP53b2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP53b1"
                                                    binding="#{LogImpPer6.campoP53b1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p53b']}"
                                                    toolTip="BundleParametros.p53b.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorP53b1.validate}"/>
                                                <webuijsf:staticText id="campoP53b1Texto1"
                                                    binding="#{LogImpPer6.campoP53b1Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p53b']}"/>
                                                <webuijsf:message id="messageP53b1"
                                                    for="campoP53b1"/>
                                                <webuijsf:helpInline id="helpInlineP53b1"
                                                    binding="#{LogImpPer6.helpInlineP53b1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p53b.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP53c1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelP53c1}"
                                                    id="labelP53c1"
                                                    for="campoP53c1"
                                                    toolTip="BundleParametros.p53c.log_imp_per"
                                                    text="p53c"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP53c2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP53c1"
                                                    binding="#{LogImpPer6.campoP53c1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p53c']}"
                                                    toolTip="BundleParametros.p53c.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorP53c1.validate}"/>
                                                <webuijsf:staticText id="campoP53c1Texto1"
                                                    binding="#{LogImpPer6.campoP53c1Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p53c']}"/>
                                                <webuijsf:message id="messageP53c1"
                                                    for="campoP53c1"/>
                                                <webuijsf:helpInline id="helpInlineP53c1"
                                                    binding="#{LogImpPer6.helpInlineP53c1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p53c.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP53z1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelP53z1}"
                                                    id="labelP53z1"
                                                    for="campoP53z1"
                                                    toolTip="BundleParametros.p53z.log_imp_per"
                                                    text="p53z"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP53z2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP53z1"
                                                    binding="#{LogImpPer6.campoP53z1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p53z']}"
                                                    toolTip="BundleParametros.p53z.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorP53z1.validate}"/>
                                                <webuijsf:staticText id="campoP53z1Texto1"
                                                    binding="#{LogImpPer6.campoP53z1Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p53z']}"/>
                                                <webuijsf:message id="messageP53z1"
                                                    for="campoP53z1"/>
                                                <webuijsf:helpInline id="helpInlineP53z1"
                                                    binding="#{LogImpPer6.helpInlineP53z1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p53z.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP541"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelP541}"
                                                    id="labelP541"
                                                    for="campoP541"
                                                    toolTip="BundleParametros.p54.log_imp_per"
                                                    text="p54"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP542"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP541"
                                                    binding="#{LogImpPer6.campoP541}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p54']}"
                                                    toolTip="BundleParametros.p54.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorP541.validate}"/>
                                                <webuijsf:staticText id="campoP541Texto1"
                                                    binding="#{LogImpPer6.campoP541Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p54']}"/>
                                                <webuijsf:message id="messageP541"
                                                    for="campoP541"/>
                                                <webuijsf:helpInline id="helpInlineP541"
                                                    binding="#{LogImpPer6.helpInlineP541}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p54.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP54e1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelP54e1}"
                                                    id="labelP54e1"
                                                    for="campoP54e1"
                                                    toolTip="BundleParametros.p54e.log_imp_per"
                                                    text="p54e"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP54e2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP54e1"
                                                    binding="#{LogImpPer6.campoP54e1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p54e']}"
                                                    toolTip="BundleParametros.p54e.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorP54e1.validate}"/>
                                                <webuijsf:staticText id="campoP54e1Texto1"
                                                    binding="#{LogImpPer6.campoP54e1Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p54e']}"/>
                                                <webuijsf:message id="messageP54e1"
                                                    for="campoP54e1"/>
                                                <webuijsf:helpInline id="helpInlineP54e1"
                                                    binding="#{LogImpPer6.helpInlineP54e1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p54e.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP561"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelP561}"
                                                    id="labelP561"
                                                    for="campoP561"
                                                    toolTip="BundleParametros.p56.log_imp_per"
                                                    text="p56"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP562"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP561"
                                                    binding="#{LogImpPer6.campoP561}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p56']}"
                                                    toolTip="BundleParametros.p56.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorP561.validate}"/>
                                                <webuijsf:staticText id="campoP561Texto1"
                                                    binding="#{LogImpPer6.campoP561Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p56']}"/>
                                                <webuijsf:message id="messageP561"
                                                    for="campoP561"/>
                                                <webuijsf:helpInline id="helpInlineP561"
                                                    binding="#{LogImpPer6.helpInlineP561}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p56.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP581"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelP581}"
                                                    id="labelP581"
                                                    for="campoP581"
                                                    toolTip="BundleParametros.p58.log_imp_per"
                                                    text="p58"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP582"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP581"
                                                    binding="#{LogImpPer6.campoP581}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p58']}"
                                                    toolTip="BundleParametros.p58.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorP581.validate}"/>
                                                <webuijsf:staticText id="campoP581Texto1"
                                                    binding="#{LogImpPer6.campoP581Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p58']}"/>
                                                <webuijsf:message id="messageP581"
                                                    for="campoP581"/>
                                                <webuijsf:helpInline id="helpInlineP581"
                                                    binding="#{LogImpPer6.helpInlineP581}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p58.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP58e1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelP58e1}"
                                                    id="labelP58e1"
                                                    for="campoP58e1"
                                                    toolTip="BundleParametros.p58e.log_imp_per"
                                                    text="p58e"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP58e2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP58e1"
                                                    binding="#{LogImpPer6.campoP58e1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p58e']}"
                                                    toolTip="BundleParametros.p58e.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorP58e1.validate}"/>
                                                <webuijsf:staticText id="campoP58e1Texto1"
                                                    binding="#{LogImpPer6.campoP58e1Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p58e']}"/>
                                                <webuijsf:message id="messageP58e1"
                                                    for="campoP58e1"/>
                                                <webuijsf:helpInline id="helpInlineP58e1"
                                                    binding="#{LogImpPer6.helpInlineP58e1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p58e.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP591"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelP591}"
                                                    id="labelP591"
                                                    for="campoP591"
                                                    toolTip="BundleParametros.p59.log_imp_per"
                                                    text="p59"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP592"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP591"
                                                    binding="#{LogImpPer6.campoP591}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p59']}"
                                                    toolTip="BundleParametros.p59.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorP591.validate}"/>
                                                <webuijsf:staticText id="campoP591Texto1"
                                                    binding="#{LogImpPer6.campoP591Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p59']}"/>
                                                <webuijsf:message id="messageP591"
                                                    for="campoP591"/>
                                                <webuijsf:helpInline id="helpInlineP591"
                                                    binding="#{LogImpPer6.helpInlineP591}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p59.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP601"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelP601}"
                                                    id="labelP601"
                                                    for="campoP601"
                                                    toolTip="BundleParametros.p60.log_imp_per"
                                                    text="p60"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP602"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP601"
                                                    binding="#{LogImpPer6.campoP601}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p60']}"
                                                    toolTip="BundleParametros.p60.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorP601.validate}"/>
                                                <webuijsf:staticText id="campoP601Texto1"
                                                    binding="#{LogImpPer6.campoP601Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p60']}"/>
                                                <webuijsf:message id="messageP601"
                                                    for="campoP601"/>
                                                <webuijsf:helpInline id="helpInlineP601"
                                                    binding="#{LogImpPer6.helpInlineP601}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p60.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP611"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelP611}"
                                                    id="labelP611"
                                                    for="campoP611"
                                                    toolTip="BundleParametros.p61.log_imp_per"
                                                    text="p61"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP612"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP611"
                                                    binding="#{LogImpPer6.campoP611}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p61']}"
                                                    toolTip="BundleParametros.p61.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorP611.validate}"/>
                                                <webuijsf:staticText id="campoP611Texto1"
                                                    binding="#{LogImpPer6.campoP611Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p61']}"/>
                                                <webuijsf:message id="messageP611"
                                                    for="campoP611"/>
                                                <webuijsf:helpInline id="helpInlineP611"
                                                    binding="#{LogImpPer6.helpInlineP611}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p61.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP621"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelP621}"
                                                    id="labelP621"
                                                    for="campoP621"
                                                    toolTip="BundleParametros.p62.log_imp_per"
                                                    text="p62"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP622"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP621"
                                                    binding="#{LogImpPer6.campoP621}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p62']}"
                                                    toolTip="BundleParametros.p62.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorP621.validate}"/>
                                                <webuijsf:staticText id="campoP621Texto1"
                                                    binding="#{LogImpPer6.campoP621Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p62']}"/>
                                                <webuijsf:message id="messageP621"
                                                    for="campoP621"/>
                                                <webuijsf:helpInline id="helpInlineP621"
                                                    binding="#{LogImpPer6.helpInlineP621}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p62.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP631"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelP631}"
                                                    id="labelP631"
                                                    for="campoP631"
                                                    toolTip="BundleParametros.p63.log_imp_per"
                                                    text="p63"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP632"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP631"
                                                    binding="#{LogImpPer6.campoP631}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p63']}"
                                                    toolTip="BundleParametros.p63.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorP631.validate}"/>
                                                <webuijsf:staticText id="campoP631Texto1"
                                                    binding="#{LogImpPer6.campoP631Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p63']}"/>
                                                <webuijsf:message id="messageP631"
                                                    for="campoP631"/>
                                                <webuijsf:helpInline id="helpInlineP631"
                                                    binding="#{LogImpPer6.helpInlineP631}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p63.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP641"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelP641}"
                                                    id="labelP641"
                                                    for="campoP641"
                                                    toolTip="BundleParametros.p64.log_imp_per"
                                                    text="p64"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP642"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP641"
                                                    binding="#{LogImpPer6.campoP641}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p64']}"
                                                    toolTip="BundleParametros.p64.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorP641.validate}"/>
                                                <webuijsf:staticText id="campoP641Texto1"
                                                    binding="#{LogImpPer6.campoP641Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p64']}"/>
                                                <webuijsf:message id="messageP641"
                                                    for="campoP641"/>
                                                <webuijsf:helpInline id="helpInlineP641"
                                                    binding="#{LogImpPer6.helpInlineP641}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p64.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP651"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelP651}"
                                                    id="labelP651"
                                                    for="campoP651"
                                                    toolTip="BundleParametros.p65.log_imp_per"
                                                    text="p65"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP652"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP651"
                                                    binding="#{LogImpPer6.campoP651}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p65']}"
                                                    toolTip="BundleParametros.p65.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorP651.validate}"/>
                                                <webuijsf:staticText id="campoP651Texto1"
                                                    binding="#{LogImpPer6.campoP651Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p65']}"/>
                                                <webuijsf:message id="messageP651"
                                                    for="campoP651"/>
                                                <webuijsf:helpInline id="helpInlineP651"
                                                    binding="#{LogImpPer6.helpInlineP651}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p65.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP65e1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelP65e1}"
                                                    id="labelP65e1"
                                                    for="campoP65e1"
                                                    toolTip="BundleParametros.p65e.log_imp_per"
                                                    text="p65e"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP65e2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP65e1"
                                                    binding="#{LogImpPer6.campoP65e1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p65e']}"
                                                    toolTip="BundleParametros.p65e.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorP65e1.validate}"/>
                                                <webuijsf:staticText id="campoP65e1Texto1"
                                                    binding="#{LogImpPer6.campoP65e1Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p65e']}"/>
                                                <webuijsf:message id="messageP65e1"
                                                    for="campoP65e1"/>
                                                <webuijsf:helpInline id="helpInlineP65e1"
                                                    binding="#{LogImpPer6.helpInlineP65e1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p65e.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP661"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelP661}"
                                                    id="labelP661"
                                                    for="campoP661"
                                                    toolTip="BundleParametros.p66.log_imp_per"
                                                    text="p66"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP662"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP661"
                                                    binding="#{LogImpPer6.campoP661}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p66']}"
                                                    toolTip="BundleParametros.p66.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorP661.validate}"/>
                                                <webuijsf:staticText id="campoP661Texto1"
                                                    binding="#{LogImpPer6.campoP661Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p66']}"/>
                                                <webuijsf:message id="messageP661"
                                                    for="campoP661"/>
                                                <webuijsf:helpInline id="helpInlineP661"
                                                    binding="#{LogImpPer6.helpInlineP661}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p66.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP66e1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelP66e1}"
                                                    id="labelP66e1"
                                                    for="campoP66e1"
                                                    toolTip="BundleParametros.p66e.log_imp_per"
                                                    text="p66e"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP66e2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP66e1"
                                                    binding="#{LogImpPer6.campoP66e1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p66e']}"
                                                    toolTip="BundleParametros.p66e.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorP66e1.validate}"/>
                                                <webuijsf:staticText id="campoP66e1Texto1"
                                                    binding="#{LogImpPer6.campoP66e1Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p66e']}"/>
                                                <webuijsf:message id="messageP66e1"
                                                    for="campoP66e1"/>
                                                <webuijsf:helpInline id="helpInlineP66e1"
                                                    binding="#{LogImpPer6.helpInlineP66e1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p66e.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP671"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelP671}"
                                                    id="labelP671"
                                                    for="campoP671"
                                                    toolTip="BundleParametros.p67.log_imp_per"
                                                    text="p67"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP672"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP671"
                                                    binding="#{LogImpPer6.campoP671}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p67']}"
                                                    toolTip="BundleParametros.p67.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorP671.validate}"/>
                                                <webuijsf:staticText id="campoP671Texto1"
                                                    binding="#{LogImpPer6.campoP671Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p67']}"/>
                                                <webuijsf:message id="messageP671"
                                                    for="campoP671"/>
                                                <webuijsf:helpInline id="helpInlineP671"
                                                    binding="#{LogImpPer6.helpInlineP671}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p67.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP681"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelP681}"
                                                    id="labelP681"
                                                    for="campoP681"
                                                    toolTip="BundleParametros.p68.log_imp_per"
                                                    text="p68"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP682"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP681"
                                                    binding="#{LogImpPer6.campoP681}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p68']}"
                                                    toolTip="BundleParametros.p68.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorP681.validate}"/>
                                                <webuijsf:staticText id="campoP681Texto1"
                                                    binding="#{LogImpPer6.campoP681Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p68']}"/>
                                                <webuijsf:message id="messageP681"
                                                    for="campoP681"/>
                                                <webuijsf:helpInline id="helpInlineP681"
                                                    binding="#{LogImpPer6.helpInlineP681}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p68.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP68e1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelP68e1}"
                                                    id="labelP68e1"
                                                    for="campoP68e1"
                                                    toolTip="BundleParametros.p68e.log_imp_per"
                                                    text="p68e"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP68e2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP68e1"
                                                    binding="#{LogImpPer6.campoP68e1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p68e']}"
                                                    toolTip="BundleParametros.p68e.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorP68e1.validate}"/>
                                                <webuijsf:staticText id="campoP68e1Texto1"
                                                    binding="#{LogImpPer6.campoP68e1Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p68e']}"/>
                                                <webuijsf:message id="messageP68e1"
                                                    for="campoP68e1"/>
                                                <webuijsf:helpInline id="helpInlineP68e1"
                                                    binding="#{LogImpPer6.helpInlineP68e1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p68e.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP731"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelP731}"
                                                    id="labelP731"
                                                    for="campoP731"
                                                    toolTip="BundleParametros.p73.log_imp_per"
                                                    text="p73"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP732"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP731"
                                                    binding="#{LogImpPer6.campoP731}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p73']}"
                                                    toolTip="BundleParametros.p73.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorP731.validate}"/>
                                                <webuijsf:staticText id="campoP731Texto1"
                                                    binding="#{LogImpPer6.campoP731Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p73']}"/>
                                                <webuijsf:message id="messageP731"
                                                    for="campoP731"/>
                                                <webuijsf:helpInline id="helpInlineP731"
                                                    binding="#{LogImpPer6.helpInlineP731}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p73.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP741"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelP741}"
                                                    id="labelP741"
                                                    for="campoP741"
                                                    toolTip="BundleParametros.p74.log_imp_per"
                                                    text="p74"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP742"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP741"
                                                    binding="#{LogImpPer6.campoP741}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p74']}"
                                                    toolTip="BundleParametros.p74.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorP741.validate}"/>
                                                <webuijsf:staticText id="campoP741Texto1"
                                                    binding="#{LogImpPer6.campoP741Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p74']}"/>
                                                <webuijsf:message id="messageP741"
                                                    for="campoP741"/>
                                                <webuijsf:helpInline id="helpInlineP741"
                                                    binding="#{LogImpPer6.helpInlineP741}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p74.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridVar000061"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelVar000061}"
                                                    id="labelVar000061"
                                                    for="campoVar000061"
                                                    toolTip="BundleParametros.var00006.log_imp_per"
                                                    text="var00006"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridVar000062"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoVar000061"
                                                    binding="#{LogImpPer6.campoVar000061}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['var00006']}"
                                                    toolTip="BundleParametros.var00006.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorVar000061.validate}"/>
                                                <webuijsf:staticText id="campoVar000061Texto1"
                                                    binding="#{LogImpPer6.campoVar000061Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['var00006']}"/>
                                                <webuijsf:message id="messageVar000061"
                                                    for="campoVar000061"/>
                                                <webuijsf:helpInline id="helpInlineVar000061"
                                                    binding="#{LogImpPer6.helpInlineVar000061}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.var00006.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridVar000071"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelVar000071}"
                                                    id="labelVar000071"
                                                    for="campoVar000071"
                                                    toolTip="BundleParametros.var00007.log_imp_per"
                                                    text="var00007"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridVar000072"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoVar000071"
                                                    binding="#{LogImpPer6.campoVar000071}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['var00007']}"
                                                    toolTip="BundleParametros.var00007.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorVar000071.validate}"/>
                                                <webuijsf:staticText id="campoVar000071Texto1"
                                                    binding="#{LogImpPer6.campoVar000071Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['var00007']}"/>
                                                <webuijsf:message id="messageVar000071"
                                                    for="campoVar000071"/>
                                                <webuijsf:helpInline id="helpInlineVar000071"
                                                    binding="#{LogImpPer6.helpInlineVar000071}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.var00007.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridVar000081"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelVar000081}"
                                                    id="labelVar000081"
                                                    for="campoVar000081"
                                                    toolTip="BundleParametros.var00008.log_imp_per"
                                                    text="var00008"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridVar000082"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoVar000081"
                                                    binding="#{LogImpPer6.campoVar000081}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['var00008']}"
                                                    toolTip="BundleParametros.var00008.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorVar000081.validate}"/>
                                                <webuijsf:staticText id="campoVar000081Texto1"
                                                    binding="#{LogImpPer6.campoVar000081Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['var00008']}"/>
                                                <webuijsf:message id="messageVar000081"
                                                    for="campoVar000081"/>
                                                <webuijsf:helpInline id="helpInlineVar000081"
                                                    binding="#{LogImpPer6.helpInlineVar000081}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.var00008.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridVar000091"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelVar000091}"
                                                    id="labelVar000091"
                                                    for="campoVar000091"
                                                    toolTip="BundleParametros.var00009.log_imp_per"
                                                    text="var00009"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridVar000092"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoVar000091"
                                                    binding="#{LogImpPer6.campoVar000091}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['var00009']}"
                                                    toolTip="BundleParametros.var00009.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorVar000091.validate}"/>
                                                <webuijsf:staticText id="campoVar000091Texto1"
                                                    binding="#{LogImpPer6.campoVar000091Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['var00009']}"/>
                                                <webuijsf:message id="messageVar000091"
                                                    for="campoVar000091"/>
                                                <webuijsf:helpInline id="helpInlineVar000091"
                                                    binding="#{LogImpPer6.helpInlineVar000091}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.var00009.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridVar000101"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelVar000101}"
                                                    id="labelVar000101"
                                                    for="campoVar000101"
                                                    toolTip="BundleParametros.var00010.log_imp_per"
                                                    text="var00010"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridVar000102"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoVar000101"
                                                    binding="#{LogImpPer6.campoVar000101}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['var00010']}"
                                                    toolTip="BundleParametros.var00010.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorVar000101.validate}"/>
                                                <webuijsf:staticText id="campoVar000101Texto1"
                                                    binding="#{LogImpPer6.campoVar000101Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['var00010']}"/>
                                                <webuijsf:message id="messageVar000101"
                                                    for="campoVar000101"/>
                                                <webuijsf:helpInline id="helpInlineVar000101"
                                                    binding="#{LogImpPer6.helpInlineVar000101}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.var00010.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridVar000111"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelVar000111}"
                                                    id="labelVar000111"
                                                    for="campoVar000111"
                                                    toolTip="BundleParametros.var00011.log_imp_per"
                                                    text="var00011"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridVar000112"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoVar000111"
                                                    binding="#{LogImpPer6.campoVar000111}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['var00011']}"
                                                    toolTip="BundleParametros.var00011.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorVar000111.validate}"/>
                                                <webuijsf:staticText id="campoVar000111Texto1"
                                                    binding="#{LogImpPer6.campoVar000111Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['var00011']}"/>
                                                <webuijsf:message id="messageVar000111"
                                                    for="campoVar000111"/>
                                                <webuijsf:helpInline id="helpInlineVar000111"
                                                    binding="#{LogImpPer6.helpInlineVar000111}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.var00011.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridVar000311"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelVar000311}"
                                                    id="labelVar000311"
                                                    for="campoVar000311"
                                                    toolTip="BundleParametros.var00031.log_imp_per"
                                                    text="var00031"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridVar000312"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoVar000311"
                                                    binding="#{LogImpPer6.campoVar000311}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['var00031']}"
                                                    toolTip="BundleParametros.var00031.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorVar000311.validate}"/>
                                                <webuijsf:staticText id="campoVar000311Texto1"
                                                    binding="#{LogImpPer6.campoVar000311Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['var00031']}"/>
                                                <webuijsf:message id="messageVar000311"
                                                    for="campoVar000311"/>
                                                <webuijsf:helpInline id="helpInlineVar000311"
                                                    binding="#{LogImpPer6.helpInlineVar000311}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.var00031.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridVar000121"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelVar000121}"
                                                    id="labelVar000121"
                                                    for="campoVar000121"
                                                    toolTip="BundleParametros.var00012.log_imp_per"
                                                    text="var00012"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridVar000122"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoVar000121"
                                                    binding="#{LogImpPer6.campoVar000121}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['var00012']}"
                                                    toolTip="BundleParametros.var00012.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorVar000121.validate}"/>
                                                <webuijsf:staticText id="campoVar000121Texto1"
                                                    binding="#{LogImpPer6.campoVar000121Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['var00012']}"/>
                                                <webuijsf:message id="messageVar000121"
                                                    for="campoVar000121"/>
                                                <webuijsf:helpInline id="helpInlineVar000121"
                                                    binding="#{LogImpPer6.helpInlineVar000121}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.var00012.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridVar000131"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelVar000131}"
                                                    id="labelVar000131"
                                                    for="campoVar000131"
                                                    toolTip="BundleParametros.var00013.log_imp_per"
                                                    text="var00013"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridVar000132"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoVar000131"
                                                    binding="#{LogImpPer6.campoVar000131}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['var00013']}"
                                                    toolTip="BundleParametros.var00013.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorVar000131.validate}"/>
                                                <webuijsf:staticText id="campoVar000131Texto1"
                                                    binding="#{LogImpPer6.campoVar000131Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['var00013']}"/>
                                                <webuijsf:message id="messageVar000131"
                                                    for="campoVar000131"/>
                                                <webuijsf:helpInline id="helpInlineVar000131"
                                                    binding="#{LogImpPer6.helpInlineVar000131}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.var00013.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP861"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelP861}"
                                                    id="labelP861"
                                                    for="campoP861"
                                                    toolTip="BundleParametros.p86.log_imp_per"
                                                    text="p86"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP862"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP861"
                                                    binding="#{LogImpPer6.campoP861}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p86']}"
                                                    toolTip="BundleParametros.p86.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorP861.validate}"/>
                                                <webuijsf:staticText id="campoP861Texto1"
                                                    binding="#{LogImpPer6.campoP861Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p86']}"/>
                                                <webuijsf:message id="messageP861"
                                                    for="campoP861"/>
                                                <webuijsf:helpInline id="helpInlineP861"
                                                    binding="#{LogImpPer6.helpInlineP861}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p86.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP871"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelP871}"
                                                    id="labelP871"
                                                    for="campoP871"
                                                    toolTip="BundleParametros.p87.log_imp_per"
                                                    text="p87"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP872"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP871"
                                                    binding="#{LogImpPer6.campoP871}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p87']}"
                                                    toolTip="BundleParametros.p87.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorP871.validate}"/>
                                                <webuijsf:staticText id="campoP871Texto1"
                                                    binding="#{LogImpPer6.campoP871Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p87']}"/>
                                                <webuijsf:message id="messageP871"
                                                    for="campoP871"/>
                                                <webuijsf:helpInline id="helpInlineP871"
                                                    binding="#{LogImpPer6.helpInlineP871}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p87.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP87e1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelP87e1}"
                                                    id="labelP87e1"
                                                    for="campoP87e1"
                                                    toolTip="BundleParametros.p87e.log_imp_per"
                                                    text="p87e"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP87e2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP87e1"
                                                    binding="#{LogImpPer6.campoP87e1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p87e']}"
                                                    toolTip="BundleParametros.p87e.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorP87e1.validate}"/>
                                                <webuijsf:staticText id="campoP87e1Texto1"
                                                    binding="#{LogImpPer6.campoP87e1Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p87e']}"/>
                                                <webuijsf:message id="messageP87e1"
                                                    for="campoP87e1"/>
                                                <webuijsf:helpInline id="helpInlineP87e1"
                                                    binding="#{LogImpPer6.helpInlineP87e1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p87e.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP881"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelP881}"
                                                    id="labelP881"
                                                    for="campoP881"
                                                    toolTip="BundleParametros.p88.log_imp_per"
                                                    text="p88"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP882"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP881"
                                                    binding="#{LogImpPer6.campoP881}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p88']}"
                                                    toolTip="BundleParametros.p88.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorP881.validate}"/>
                                                <webuijsf:staticText id="campoP881Texto1"
                                                    binding="#{LogImpPer6.campoP881Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p88']}"/>
                                                <webuijsf:message id="messageP881"
                                                    for="campoP881"/>
                                                <webuijsf:helpInline id="helpInlineP881"
                                                    binding="#{LogImpPer6.helpInlineP881}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p88.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP88e1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelP88e1}"
                                                    id="labelP88e1"
                                                    for="campoP88e1"
                                                    toolTip="BundleParametros.p88e.log_imp_per"
                                                    text="p88e"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP88e2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP88e1"
                                                    binding="#{LogImpPer6.campoP88e1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p88e']}"
                                                    toolTip="BundleParametros.p88e.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorP88e1.validate}"/>
                                                <webuijsf:staticText id="campoP88e1Texto1"
                                                    binding="#{LogImpPer6.campoP88e1Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p88e']}"/>
                                                <webuijsf:message id="messageP88e1"
                                                    for="campoP88e1"/>
                                                <webuijsf:helpInline id="helpInlineP88e1"
                                                    binding="#{LogImpPer6.helpInlineP88e1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p88e.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP911"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelP911}"
                                                    id="labelP911"
                                                    for="campoP911"
                                                    toolTip="BundleParametros.p91.log_imp_per"
                                                    text="p91"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP912"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP911"
                                                    binding="#{LogImpPer6.campoP911}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p91']}"
                                                    toolTip="BundleParametros.p91.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorP911.validate}"/>
                                                <webuijsf:staticText id="campoP911Texto1"
                                                    binding="#{LogImpPer6.campoP911Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p91']}"/>
                                                <webuijsf:message id="messageP911"
                                                    for="campoP911"/>
                                                <webuijsf:helpInline id="helpInlineP911"
                                                    binding="#{LogImpPer6.helpInlineP911}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p91.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridVar000171"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelVar000171}"
                                                    id="labelVar000171"
                                                    for="campoVar000171"
                                                    toolTip="BundleParametros.var00017.log_imp_per"
                                                    text="var00017"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridVar000172"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoVar000171"
                                                    binding="#{LogImpPer6.campoVar000171}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['var00017']}"
                                                    toolTip="BundleParametros.var00017.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorVar000171.validate}"/>
                                                <webuijsf:staticText id="campoVar000171Texto1"
                                                    binding="#{LogImpPer6.campoVar000171Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['var00017']}"/>
                                                <webuijsf:message id="messageVar000171"
                                                    for="campoVar000171"/>
                                                <webuijsf:helpInline id="helpInlineVar000171"
                                                    binding="#{LogImpPer6.helpInlineVar000171}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.var00017.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridVar000181"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelVar000181}"
                                                    id="labelVar000181"
                                                    for="campoVar000181"
                                                    toolTip="BundleParametros.var00018.log_imp_per"
                                                    text="var00018"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridVar000182"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoVar000181"
                                                    binding="#{LogImpPer6.campoVar000181}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['var00018']}"
                                                    toolTip="BundleParametros.var00018.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorVar000181.validate}"/>
                                                <webuijsf:staticText id="campoVar000181Texto1"
                                                    binding="#{LogImpPer6.campoVar000181Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['var00018']}"/>
                                                <webuijsf:message id="messageVar000181"
                                                    for="campoVar000181"/>
                                                <webuijsf:helpInline id="helpInlineVar000181"
                                                    binding="#{LogImpPer6.helpInlineVar000181}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.var00018.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridVar000191"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelVar000191}"
                                                    id="labelVar000191"
                                                    for="campoVar000191"
                                                    toolTip="BundleParametros.var00019.log_imp_per"
                                                    text="var00019"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridVar000192"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoVar000191"
                                                    binding="#{LogImpPer6.campoVar000191}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['var00019']}"
                                                    toolTip="BundleParametros.var00019.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorVar000191.validate}"/>
                                                <webuijsf:staticText id="campoVar000191Texto1"
                                                    binding="#{LogImpPer6.campoVar000191Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['var00019']}"/>
                                                <webuijsf:message id="messageVar000191"
                                                    for="campoVar000191"/>
                                                <webuijsf:helpInline id="helpInlineVar000191"
                                                    binding="#{LogImpPer6.helpInlineVar000191}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.var00019.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridVar000201"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelVar000201}"
                                                    id="labelVar000201"
                                                    for="campoVar000201"
                                                    toolTip="BundleParametros.var00020.log_imp_per"
                                                    text="var00020"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridVar000202"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoVar000201"
                                                    binding="#{LogImpPer6.campoVar000201}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['var00020']}"
                                                    toolTip="BundleParametros.var00020.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorVar000201.validate}"/>
                                                <webuijsf:staticText id="campoVar000201Texto1"
                                                    binding="#{LogImpPer6.campoVar000201Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['var00020']}"/>
                                                <webuijsf:message id="messageVar000201"
                                                    for="campoVar000201"/>
                                                <webuijsf:helpInline id="helpInlineVar000201"
                                                    binding="#{LogImpPer6.helpInlineVar000201}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.var00020.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridVar000211"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelVar000211}"
                                                    id="labelVar000211"
                                                    for="campoVar000211"
                                                    toolTip="BundleParametros.var00021.log_imp_per"
                                                    text="var00021"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridVar000212"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoVar000211"
                                                    binding="#{LogImpPer6.campoVar000211}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['var00021']}"
                                                    toolTip="BundleParametros.var00021.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorVar000211.validate}"/>
                                                <webuijsf:staticText id="campoVar000211Texto1"
                                                    binding="#{LogImpPer6.campoVar000211Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['var00021']}"/>
                                                <webuijsf:message id="messageVar000211"
                                                    for="campoVar000211"/>
                                                <webuijsf:helpInline id="helpInlineVar000211"
                                                    binding="#{LogImpPer6.helpInlineVar000211}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.var00021.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridVar000221"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelVar000221}"
                                                    id="labelVar000221"
                                                    for="campoVar000221"
                                                    toolTip="BundleParametros.var00022.log_imp_per"
                                                    text="var00022"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridVar000222"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoVar000221"
                                                    binding="#{LogImpPer6.campoVar000221}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['var00022']}"
                                                    toolTip="BundleParametros.var00022.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorVar000221.validate}"/>
                                                <webuijsf:staticText id="campoVar000221Texto1"
                                                    binding="#{LogImpPer6.campoVar000221Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['var00022']}"/>
                                                <webuijsf:message id="messageVar000221"
                                                    for="campoVar000221"/>
                                                <webuijsf:helpInline id="helpInlineVar000221"
                                                    binding="#{LogImpPer6.helpInlineVar000221}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.var00022.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridVar000231"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelVar000231}"
                                                    id="labelVar000231"
                                                    for="campoVar000231"
                                                    toolTip="BundleParametros.var00023.log_imp_per"
                                                    text="var00023"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridVar000232"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoVar000231"
                                                    binding="#{LogImpPer6.campoVar000231}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['var00023']}"
                                                    toolTip="BundleParametros.var00023.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorVar000231.validate}"/>
                                                <webuijsf:staticText id="campoVar000231Texto1"
                                                    binding="#{LogImpPer6.campoVar000231Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['var00023']}"/>
                                                <webuijsf:message id="messageVar000231"
                                                    for="campoVar000231"/>
                                                <webuijsf:helpInline id="helpInlineVar000231"
                                                    binding="#{LogImpPer6.helpInlineVar000231}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.var00023.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridVar000241"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelVar000241}"
                                                    id="labelVar000241"
                                                    for="campoVar000241"
                                                    toolTip="BundleParametros.var00024.log_imp_per"
                                                    text="var00024"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridVar000242"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoVar000241"
                                                    binding="#{LogImpPer6.campoVar000241}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['var00024']}"
                                                    toolTip="BundleParametros.var00024.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorVar000241.validate}"/>
                                                <webuijsf:staticText id="campoVar000241Texto1"
                                                    binding="#{LogImpPer6.campoVar000241Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['var00024']}"/>
                                                <webuijsf:message id="messageVar000241"
                                                    for="campoVar000241"/>
                                                <webuijsf:helpInline id="helpInlineVar000241"
                                                    binding="#{LogImpPer6.helpInlineVar000241}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.var00024.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridVar000251"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelVar000251}"
                                                    id="labelVar000251"
                                                    for="campoVar000251"
                                                    toolTip="BundleParametros.var00025.log_imp_per"
                                                    text="var00025"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridVar000252"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoVar000251"
                                                    binding="#{LogImpPer6.campoVar000251}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['var00025']}"
                                                    toolTip="BundleParametros.var00025.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorVar000251.validate}"/>
                                                <webuijsf:staticText id="campoVar000251Texto1"
                                                    binding="#{LogImpPer6.campoVar000251Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['var00025']}"/>
                                                <webuijsf:message id="messageVar000251"
                                                    for="campoVar000251"/>
                                                <webuijsf:helpInline id="helpInlineVar000251"
                                                    binding="#{LogImpPer6.helpInlineVar000251}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.var00025.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridVar000261"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelVar000261}"
                                                    id="labelVar000261"
                                                    for="campoVar000261"
                                                    toolTip="BundleParametros.var00026.log_imp_per"
                                                    text="var00026"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridVar000262"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoVar000261"
                                                    binding="#{LogImpPer6.campoVar000261}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['var00026']}"
                                                    toolTip="BundleParametros.var00026.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorVar000261.validate}"/>
                                                <webuijsf:staticText id="campoVar000261Texto1"
                                                    binding="#{LogImpPer6.campoVar000261Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['var00026']}"/>
                                                <webuijsf:message id="messageVar000261"
                                                    for="campoVar000261"/>
                                                <webuijsf:helpInline id="helpInlineVar000261"
                                                    binding="#{LogImpPer6.helpInlineVar000261}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.var00026.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridVar000271"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelVar000271}"
                                                    id="labelVar000271"
                                                    for="campoVar000271"
                                                    toolTip="BundleParametros.var00027.log_imp_per"
                                                    text="var00027"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridVar000272"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoVar000271"
                                                    binding="#{LogImpPer6.campoVar000271}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['var00027']}"
                                                    toolTip="BundleParametros.var00027.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorVar000271.validate}"/>
                                                <webuijsf:staticText id="campoVar000271Texto1"
                                                    binding="#{LogImpPer6.campoVar000271Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['var00027']}"/>
                                                <webuijsf:message id="messageVar000271"
                                                    for="campoVar000271"/>
                                                <webuijsf:helpInline id="helpInlineVar000271"
                                                    binding="#{LogImpPer6.helpInlineVar000271}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.var00027.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridVar000281"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelVar000281}"
                                                    id="labelVar000281"
                                                    for="campoVar000281"
                                                    toolTip="BundleParametros.var00028.log_imp_per"
                                                    text="var00028"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridVar000282"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoVar000281"
                                                    binding="#{LogImpPer6.campoVar000281}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['var00028']}"
                                                    toolTip="BundleParametros.var00028.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorVar000281.validate}"/>
                                                <webuijsf:staticText id="campoVar000281Texto1"
                                                    binding="#{LogImpPer6.campoVar000281Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['var00028']}"/>
                                                <webuijsf:message id="messageVar000281"
                                                    for="campoVar000281"/>
                                                <webuijsf:helpInline id="helpInlineVar000281"
                                                    binding="#{LogImpPer6.helpInlineVar000281}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.var00028.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP921"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelP921}"
                                                    id="labelP921"
                                                    for="campoP921"
                                                    toolTip="BundleParametros.p92.log_imp_per"
                                                    text="p92"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP922"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP921"
                                                    binding="#{LogImpPer6.campoP921}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p92']}"
                                                    toolTip="BundleParametros.p92.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorP921.validate}"/>
                                                <webuijsf:staticText id="campoP921Texto1"
                                                    binding="#{LogImpPer6.campoP921Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['p92']}"/>
                                                <webuijsf:message id="messageP921"
                                                    for="campoP921"/>
                                                <webuijsf:helpInline id="helpInlineP921"
                                                    binding="#{LogImpPer6.helpInlineP921}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p92.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIcv1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelIcv1}"
                                                    id="labelIcv1"
                                                    for="campoIcv1"
                                                    toolTip="BundleParametros.icv.log_imp_per"
                                                    text="icv"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIcv2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoIcv1"
                                                    binding="#{LogImpPer6.campoIcv1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['icv']}"
                                                    toolTip="BundleParametros.icv.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorIcv1.validate}"/>
                                                <webuijsf:staticText id="campoIcv1Texto1"
                                                    binding="#{LogImpPer6.campoIcv1Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['icv']}"/>
                                                <webuijsf:message id="messageIcv1"
                                                    for="campoIcv1"/>
                                                <webuijsf:helpInline id="helpInlineIcv1"
                                                    binding="#{LogImpPer6.helpInlineIcv1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.icv.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFichaActiva1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelFichaActiva1}"
                                                    id="labelFichaActiva1"
                                                    for="campoFichaActiva1"
                                                    toolTip="BundleParametros.ficha_activa.log_imp_per"
                                                    text="ficha activa"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFichaActiva2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoFichaActiva1"
                                                    binding="#{LogImpPer6.campoFichaActiva1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['ficha_activa']}"
                                                    toolTip="BundleParametros.ficha_activa.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorFichaActiva1.validate}"/>
                                                <webuijsf:staticText id="campoFichaActiva1Texto1"
                                                    binding="#{LogImpPer6.campoFichaActiva1Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['ficha_activa']}"/>
                                                <webuijsf:message id="messageFichaActiva1"
                                                    for="campoFichaActiva1"/>
                                                <webuijsf:helpInline id="helpInlineFichaActiva1"
                                                    binding="#{LogImpPer6.helpInlineFichaActiva1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.ficha_activa.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsImportado1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelEsImportado1}"
                                                    id="labelEsImportado1"
                                                    for="listaEsImportado1"
                                                    toolTip="BundleParametros.es_importado.log_imp_per"
                                                    text="importado"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsImportado2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsImportado1"
                                                    binding="#{LogImpPer6.listaEsImportado1}"
                                                    converter="#{LogImpPer6.converterEsImportado1}"
                                                    disabled="#{LogImpPer6.gestor.filaNoProcesada}" required="true"
                                                    items="#{LogImpPer6.asistente.opcionesListaEsImportado1}"
                                                    selected="#{LogImpPer6.logImpPerDataProvider.value['es_importado']}"
                                                    toolTip="BundleParametros.es_importado.log_imp_per"/>
                                                <webuijsf:staticText id="listaEsImportado1Texto1"
                                                    binding="#{LogImpPer6.listaEsImportado1Texto1}"/>
                                                <webuijsf:message id="messageEsImportado1"
                                                    for="listaEsImportado1"/>
                                                <webuijsf:helpInline id="helpInlineEsImportado1"
                                                    binding="#{LogImpPer6.helpInlineEsImportado1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_importado.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridObservacion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelObservacion1}"
                                                    id="labelObservacion1"
                                                    for="campoObservacion1"
                                                    toolTip="BundleParametros.observacion.log_imp_per"
                                                    text="observaci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridObservacion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoObservacion1"
                                                    binding="#{LogImpPer6.campoObservacion1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['observacion']}"
                                                    toolTip="BundleParametros.observacion.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorObservacion1.validate}"/>
                                                <webuijsf:staticText id="campoObservacion1Texto1"
                                                    binding="#{LogImpPer6.campoObservacion1Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['observacion']}"/>
                                                <webuijsf:message id="messageObservacion1"
                                                    for="campoObservacion1"/>
                                                <webuijsf:helpInline id="helpInlineObservacion1"
                                                    binding="#{LogImpPer6.helpInlineObservacion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.observacion.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaHoraTransaccion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelFechaHoraTransaccion1}"
                                                    id="labelFechaHoraTransaccion1"
                                                    for="campoFechaHoraTransaccion1"
                                                    toolTip="BundleParametros.fecha_hora_transaccion.log_imp_per"
                                                    text="fecha hora transacci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaHoraTransaccion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoFechaHoraTransaccion1"
                                                    binding="#{LogImpPer6.campoFechaHoraTransaccion1}"
                                                    converter="#{LogImpPer6.converterFechaHoraTransaccion1}"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}" required="true"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['fecha_hora_transaccion']}"
                                                    toolTip="BundleParametros.fecha_hora_transaccion.log_imp_per"/>
                                                <webuijsf:staticText id="campoFechaHoraTransaccion1Texto1"
                                                    binding="#{LogImpPer6.campoFechaHoraTransaccion1Texto1}"
                                                    converter="#{LogImpPer6.converterFechaHoraTransaccion1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['fecha_hora_transaccion']}"/>
                                                <webuijsf:message id="messageFechaHoraTransaccion1"
                                                    for="campoFechaHoraTransaccion1"/>
                                                <webuijsf:helpInline id="helpInlineFechaHoraTransaccion1"
                                                    binding="#{LogImpPer6.helpInlineFechaHoraTransaccion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_hora_transaccion.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNombreArchivo1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelNombreArchivo1}"
                                                    id="labelNombreArchivo1"
                                                    for="campoNombreArchivo1"
                                                    toolTip="BundleParametros.nombre_archivo.log_imp_per"
                                                    text="nombre archivo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNombreArchivo2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoNombreArchivo1"
                                                    binding="#{LogImpPer6.campoNombreArchivo1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['nombre_archivo']}"
                                                    toolTip="BundleParametros.nombre_archivo.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorNombreArchivo1.validate}"/>
                                                <webuijsf:staticText id="campoNombreArchivo1Texto1"
                                                    binding="#{LogImpPer6.campoNombreArchivo1Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['nombre_archivo']}"/>
                                                <webuijsf:button id="campoNombreArchivo1Boton3"
                                                    binding="#{LogImpPer6.campoNombreArchivo1Boton3}"
                                                    onClick="#{LogImpPer6.asistente.scriptCampoNombreArchivo1Boton3}"
                                                    rendered="#{LogImpPer6.asistente.campoNombreArchivo1Boton3Rendered}"
                                                    text="#{LogImpPer6.asistente.textCampoNombreArchivo1Boton3}"
                                                    toolTip="#{LogImpPer6.asistente.toolTipCampoNombreArchivo1Boton3}"/>
                                                <webuijsf:message id="messageNombreArchivo1"
                                                    for="campoNombreArchivo1"/>
                                                <webuijsf:helpInline id="helpInlineNombreArchivo1"
                                                    binding="#{LogImpPer6.helpInlineNombreArchivo1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.nombre_archivo.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridCodigoArchivo1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelCodigoArchivo1}"
                                                    id="labelCodigoArchivo1"
                                                    for="campoCodigoArchivo1"
                                                    toolTip="BundleParametros.codigo_archivo.log_imp_per"
                                                    text="c&#243;digo archivo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridCodigoArchivo2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoCodigoArchivo1"
                                                    binding="#{LogImpPer6.campoCodigoArchivo1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['codigo_archivo']}"
                                                    toolTip="BundleParametros.codigo_archivo.log_imp_per"
                                                    validatorExpression="#{LogImpPer6.validatorCodigoArchivo1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoArchivo1Texto1"
                                                    binding="#{LogImpPer6.campoCodigoArchivo1Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['codigo_archivo']}"/>
                                                <webuijsf:message id="messageCodigoArchivo1"
                                                    for="campoCodigoArchivo1"/>
                                                <webuijsf:helpInline id="helpInlineCodigoArchivo1"
                                                    binding="#{LogImpPer6.helpInlineCodigoArchivo1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.codigo_archivo.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdFichaPersona1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelIdFichaPersona1}"
                                                    id="labelIdFichaPersona1"
                                                    for="campoIdFichaPersona1"
                                                    toolTip="BundleParametros.id_ficha_persona.log_imp_per"
                                                    text="ficha persona"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdFichaPersona2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdFichaPersona1"
                                                    binding="#{LogImpPer6.campoIdFichaPersona1}"
                                                    readOnly="#{LogImpPer6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPer6.asistente.textoCampoIdFichaPersona1}"
                                                    toolTip="#{LogImpPer6.asistente.toolTipCampoIdFichaPersona1}"
                                                    validatorExpression="#{LogImpPer6.campoIdFichaPersona1_validate}"/>
                                                <webuijsf:staticText id="campoIdFichaPersona1Texto1"
                                                    binding="#{LogImpPer6.campoIdFichaPersona1Texto1}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['codigo_ficha_persona_1x1y3']}"/>
                                                <webuijsf:button id="campoIdFichaPersona1Boton1"
                                                    binding="#{LogImpPer6.campoIdFichaPersona1Boton1}"
                                                    onClick="#{LogImpPer6.asistente.scriptCampoIdFichaPersona1Boton1}"/>
                                                <webuijsf:button id="campoIdFichaPersona1Boton3"
                                                    binding="#{LogImpPer6.campoIdFichaPersona1Boton3}"
                                                    onClick="#{LogImpPer6.asistente.scriptCampoIdFichaPersona1Boton2}"
                                                    rendered="#{LogImpPer6.asistente.campoIdFichaPersona1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdFichaPersona1"
                                                    for="campoIdFichaPersona1"/>
                                                <webuijsf:helpInline id="helpInlineIdFichaPersona1"
                                                    binding="#{LogImpPer6.helpInlineIdFichaPersona1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_ficha_persona.log_imp_per"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdFichaPersona3"
                                                rendered="#{LogImpPer6.asistente.campoIdFichaPersona1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPer6.labelIdFichaPersona2}"
                                                    id="labelIdFichaPersona2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre ficha persona"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdFichaPersona4"
                                                rendered="#{LogImpPer6.asistente.campoIdFichaPersona1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{LogImpPer6.campoIdFichaPersona1Texto2}"
                                                    text="#{LogImpPer6.logImpPerDataProvider.value['nombre_ficha_persona_1x1y4']}"
                                                    id="campoIdFichaPersona1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{LogImpPer6.campoIdFichaPersona1Boton2}"
                                                    id="campoIdFichaPersona1Boton2"
                                                    onClick="#{LogImpPer6.asistente.scriptCampoIdFichaPersona1Boton2}"/>
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
                                                        actionExpression="#{LogImpPer6.botonIrAlPrimero2_action}"
                                                        binding="#{LogImpPer6.botonIrAlPrimero2}"
                                                        disabled="#{LogImpPer6.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero2"
                                                        imageURL="#{LogImpPer6.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{LogImpPer6.gestor.scriptIrAlPrimero}"
                                                        text="#{LogImpPer6.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{LogImpPer6.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpPer6.botonIrAlAnterior2_action}"
                                                        binding="#{LogImpPer6.botonIrAlAnterior2}"
                                                        disabled="#{LogImpPer6.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior2"
                                                        imageURL="#{LogImpPer6.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{LogImpPer6.gestor.scriptIrAlAnterior}"
                                                        text="#{LogImpPer6.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{LogImpPer6.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpPer6.botonIrAlSiguiente2_action}"
                                                        binding="#{LogImpPer6.botonIrAlSiguiente2}"
                                                        disabled="#{LogImpPer6.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente2"
                                                        imageURL="#{LogImpPer6.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{LogImpPer6.gestor.scriptIrAlSiguiente}"
                                                        text="#{LogImpPer6.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{LogImpPer6.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpPer6.botonIrAlUltimo2_action}"
                                                        binding="#{LogImpPer6.botonIrAlUltimo2}"
                                                        disabled="#{LogImpPer6.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo2"
                                                        imageURL="#{LogImpPer6.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{LogImpPer6.gestor.scriptIrAlUltimo}"
                                                        text="#{LogImpPer6.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{LogImpPer6.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpPer6.botonProcesarFila2_action}"
                                                        binding="#{LogImpPer6.botonProcesarFila2}"
                                                        disabled="#{LogImpPer6.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila2"
                                                        imageURL="#{LogImpPer6.gestor.urlImagenProcesar}"
                                                        onClick="#{LogImpPer6.scriptAbrirVentanaProcesarFila2}"
                                                        rendered="#{LogImpPer6.asistente.comandoDisponible}"
                                                        text="#{LogImpPer6.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{LogImpPer6.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{LogImpPer6.gestor.mensajeCambiosPorConfirmar}"/>
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
                                                    actionExpression="#{LogImpPer6.botonAgregar1_action}"
                                                    binding="#{LogImpPer6.botonAgregar1}"
                                                    disabled="#{LogImpPer6.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{LogImpPer6.gestor.scriptAgregar}"
                                                    rendered="#{LogImpPer6.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPer6.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{LogImpPer6.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{LogImpPer6.listaFuncionEdicion1}"
                                                    converter="#{LogImpPer6.converterListaFuncionEdicion1}"
                                                    disabled="#{LogImpPer6.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{LogImpPer6.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{LogImpPer6.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{LogImpPer6.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{LogImpPer6.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPer6.botonEditar1_action}"
                                                    binding="#{LogImpPer6.botonEditar1}"
                                                    disabled="#{LogImpPer6.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{LogImpPer6.gestor.scriptEditar}"
                                                    rendered="#{LogImpPer6.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPer6.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{LogImpPer6.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPer6.botonEliminar1_action}"
                                                    binding="#{LogImpPer6.botonEliminar1}"
                                                    disabled="#{LogImpPer6.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{LogImpPer6.gestor.scriptEliminar}"
                                                    rendered="#{LogImpPer6.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPer6.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{LogImpPer6.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPer6.botonAplicar1_action}"
                                                    binding="#{LogImpPer6.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{LogImpPer6.gestor.scriptAplicar}"
                                                    rendered="#{LogImpPer6.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPer6.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{LogImpPer6.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPer6.botonDeshacer1_action}"
                                                    binding="#{LogImpPer6.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{LogImpPer6.gestor.scriptDeshacer}"
                                                    rendered="#{LogImpPer6.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPer6.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{LogImpPer6.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPer6.botonConfirmar1_action}"
                                                    binding="#{LogImpPer6.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{LogImpPer6.gestor.scriptConfirmar}"
                                                    rendered="#{LogImpPer6.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPer6.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{LogImpPer6.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPer6.botonDescartar1_action}"
                                                    binding="#{LogImpPer6.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{LogImpPer6.gestor.scriptDescartar}"
                                                    rendered="#{LogImpPer6.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPer6.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{LogImpPer6.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{LogImpPer6.listaFuncionAccion1}"
                                                    converter="#{LogImpPer6.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{LogImpPer6.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{LogImpPer6.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{LogImpPer6.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{LogImpPer6.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPer6.botonProcesar1_action}"
                                                    binding="#{LogImpPer6.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{LogImpPer6.gestor.scriptProcesar}"
                                                    rendered="#{LogImpPer6.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPer6.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{LogImpPer6.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPer6.botonRefrescar1_action}"
                                                    binding="#{LogImpPer6.botonRefrescar1}"
                                                    disabled="#{LogImpPer6.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{LogImpPer6.gestor.scriptRefrescar}"
                                                    rendered="#{LogImpPer6.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPer6.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{LogImpPer6.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPer6.botonReconsultar1_action}"
                                                    binding="#{LogImpPer6.botonReconsultar1}"
                                                    disabled="#{LogImpPer6.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{LogImpPer6.gestor.scriptReconsultar}"
                                                    rendered="#{LogImpPer6.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPer6.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{LogImpPer6.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPer6.botonRetornar1_action}"
                                                    binding="#{LogImpPer6.botonRetornar1}"
                                                    disabled="#{LogImpPer6.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{LogImpPer6.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{LogImpPer6.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPer6.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{LogImpPer6.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel125"
                                                rendered="#{LogImpPer6.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{LogImpPer6.imageHyperlink1_action}"
                                                    binding="#{LogImpPer6.imageHyperlink1}"
                                                    disabled="#{LogImpPer6.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{LogImpPer6.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{LogImpPer6.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{LogImpPer6.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.LogImpPer6_imageHyperlink1_toolTip}"/>
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
