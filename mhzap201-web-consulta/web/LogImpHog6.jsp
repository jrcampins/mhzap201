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
                        virtualFormsConfig="virtualForm1 | campoIdLogImpHog1 campoP20d1 campoP20m1 campoP20a1 campoP171 campoP181 campoVar000011 campoP191 campoObservaciones1 campoUtm1 campoGps1 campoOrden1 campoCoordx1 campoP01a1 campoP01b1 campoP01c1 campoP01d1 campoP021 campoP031 campoP041 campoP051 campoP061 campoP081 campoP071 campoP091 campoP141 campoP151 campoP161 campoP241 campoP251 campoP261 campoP271 campoP27e1 campoP28a1 campoP28b1 campoP291 campoP301 campoP311 campoP321 campoP331 campoP341 campoP351 campoP361 campoP371 campoNroCelular1 campoP381 campoNroLineaBaja1 campoP3911 campoP3921 campoP3931 campoP3941 campoP3951 campoP3961 campoP3971 campoP42n1 campoP42ci1 campoLetraCi1 campoP431 campoVar000021 campoVar000031 campoVar000041 campoP1041 listaEsImportado1 campoObservacion1 campoFechaHoraTransaccion1 campoNombreArchivo1 campoCodigoArchivo1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | | , virtualForm3 | listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                                id="gridP20d1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHog6.labelP20d1}"
                                                    id="labelP20d1"
                                                    for="campoP20d1"
                                                    text="p20d"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP20d2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP20d1"
                                                    binding="#{LogImpHog6.campoP20d1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHog6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p20d']}"
                                                    toolTip="BundleParametros.p20d.log_imp_hog"
                                                    validatorExpression="#{LogImpHog6.validatorP20d1.validate}"/>
                                                <webuijsf:staticText id="campoP20d1Texto1"
                                                    binding="#{LogImpHog6.campoP20d1Texto1}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p20d']}"/>
                                                <webuijsf:message id="messageP20d1"
                                                    for="campoP20d1"/>
                                                <webuijsf:helpInline id="helpInlineP20d1"
                                                    binding="#{LogImpHog6.helpInlineP20d1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p20d.log_imp_hog"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP20m1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHog6.labelP20m1}"
                                                    id="labelP20m1"
                                                    for="campoP20m1"
                                                    text="p20m"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP20m2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP20m1"
                                                    binding="#{LogImpHog6.campoP20m1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHog6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p20m']}"
                                                    toolTip="BundleParametros.p20m.log_imp_hog"
                                                    validatorExpression="#{LogImpHog6.validatorP20m1.validate}"/>
                                                <webuijsf:staticText id="campoP20m1Texto1"
                                                    binding="#{LogImpHog6.campoP20m1Texto1}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p20m']}"/>
                                                <webuijsf:message id="messageP20m1"
                                                    for="campoP20m1"/>
                                                <webuijsf:helpInline id="helpInlineP20m1"
                                                    binding="#{LogImpHog6.helpInlineP20m1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p20m.log_imp_hog"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP20a1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHog6.labelP20a1}"
                                                    id="labelP20a1"
                                                    for="campoP20a1"
                                                    text="p20a"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP20a2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP20a1"
                                                    binding="#{LogImpHog6.campoP20a1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHog6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p20a']}"
                                                    toolTip="BundleParametros.p20a.log_imp_hog"
                                                    validatorExpression="#{LogImpHog6.validatorP20a1.validate}"/>
                                                <webuijsf:staticText id="campoP20a1Texto1"
                                                    binding="#{LogImpHog6.campoP20a1Texto1}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p20a']}"/>
                                                <webuijsf:message id="messageP20a1"
                                                    for="campoP20a1"/>
                                                <webuijsf:helpInline id="helpInlineP20a1"
                                                    binding="#{LogImpHog6.helpInlineP20a1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p20a.log_imp_hog"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP171"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHog6.labelP171}"
                                                    id="labelP171"
                                                    for="campoP171"
                                                    text="p17"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP172"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP171"
                                                    binding="#{LogImpHog6.campoP171}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHog6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p17']}"
                                                    toolTip="BundleParametros.p17.log_imp_hog"
                                                    validatorExpression="#{LogImpHog6.validatorP171.validate}"/>
                                                <webuijsf:staticText id="campoP171Texto1"
                                                    binding="#{LogImpHog6.campoP171Texto1}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p17']}"/>
                                                <webuijsf:message id="messageP171"
                                                    for="campoP171"/>
                                                <webuijsf:helpInline id="helpInlineP171"
                                                    binding="#{LogImpHog6.helpInlineP171}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p17.log_imp_hog"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP181"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHog6.labelP181}"
                                                    id="labelP181"
                                                    for="campoP181"
                                                    text="p18"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP182"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP181"
                                                    binding="#{LogImpHog6.campoP181}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHog6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p18']}"
                                                    toolTip="BundleParametros.p18.log_imp_hog"
                                                    validatorExpression="#{LogImpHog6.validatorP181.validate}"/>
                                                <webuijsf:staticText id="campoP181Texto1"
                                                    binding="#{LogImpHog6.campoP181Texto1}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p18']}"/>
                                                <webuijsf:message id="messageP181"
                                                    for="campoP181"/>
                                                <webuijsf:helpInline id="helpInlineP181"
                                                    binding="#{LogImpHog6.helpInlineP181}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p18.log_imp_hog"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridVar000011"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHog6.labelVar000011}"
                                                    id="labelVar000011"
                                                    for="campoVar000011"
                                                    text="var00001"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridVar000012"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoVar000011"
                                                    binding="#{LogImpHog6.campoVar000011}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHog6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['var00001']}"
                                                    toolTip="BundleParametros.var00001.log_imp_hog"
                                                    validatorExpression="#{LogImpHog6.validatorVar000011.validate}"/>
                                                <webuijsf:staticText id="campoVar000011Texto1"
                                                    binding="#{LogImpHog6.campoVar000011Texto1}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['var00001']}"/>
                                                <webuijsf:message id="messageVar000011"
                                                    for="campoVar000011"/>
                                                <webuijsf:helpInline id="helpInlineVar000011"
                                                    binding="#{LogImpHog6.helpInlineVar000011}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.var00001.log_imp_hog"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP191"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHog6.labelP191}"
                                                    id="labelP191"
                                                    for="campoP191"
                                                    text="p19"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP192"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP191"
                                                    binding="#{LogImpHog6.campoP191}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHog6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p19']}"
                                                    toolTip="BundleParametros.p19.log_imp_hog"
                                                    validatorExpression="#{LogImpHog6.validatorP191.validate}"/>
                                                <webuijsf:staticText id="campoP191Texto1"
                                                    binding="#{LogImpHog6.campoP191Texto1}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p19']}"/>
                                                <webuijsf:message id="messageP191"
                                                    for="campoP191"/>
                                                <webuijsf:helpInline id="helpInlineP191"
                                                    binding="#{LogImpHog6.helpInlineP191}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p19.log_imp_hog"
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
                                                id="gridUtm1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHog6.labelUtm1}"
                                                    id="labelUtm1"
                                                    for="campoUtm1"
                                                    text="utm"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridUtm2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoUtm1"
                                                    binding="#{LogImpHog6.campoUtm1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHog6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['utm']}"
                                                    toolTip="BundleParametros.utm.log_imp_hog"
                                                    validatorExpression="#{LogImpHog6.validatorUtm1.validate}"/>
                                                <webuijsf:staticText id="campoUtm1Texto1"
                                                    binding="#{LogImpHog6.campoUtm1Texto1}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['utm']}"/>
                                                <webuijsf:message id="messageUtm1"
                                                    for="campoUtm1"/>
                                                <webuijsf:helpInline id="helpInlineUtm1"
                                                    binding="#{LogImpHog6.helpInlineUtm1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.utm.log_imp_hog"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridGps1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHog6.labelGps1}"
                                                    id="labelGps1"
                                                    for="campoGps1"
                                                    text="gps"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridGps2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoGps1"
                                                    binding="#{LogImpHog6.campoGps1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHog6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['gps']}"
                                                    toolTip="BundleParametros.gps.log_imp_hog"
                                                    validatorExpression="#{LogImpHog6.validatorGps1.validate}"/>
                                                <webuijsf:staticText id="campoGps1Texto1"
                                                    binding="#{LogImpHog6.campoGps1Texto1}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['gps']}"/>
                                                <webuijsf:message id="messageGps1"
                                                    for="campoGps1"/>
                                                <webuijsf:helpInline id="helpInlineGps1"
                                                    binding="#{LogImpHog6.helpInlineGps1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.gps.log_imp_hog"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridOrden1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHog6.labelOrden1}"
                                                    id="labelOrden1"
                                                    for="campoOrden1"
                                                    text="orden"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridOrden2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoOrden1"
                                                    binding="#{LogImpHog6.campoOrden1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHog6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['orden']}"
                                                    toolTip="BundleParametros.orden.log_imp_hog"
                                                    validatorExpression="#{LogImpHog6.validatorOrden1.validate}"/>
                                                <webuijsf:staticText id="campoOrden1Texto1"
                                                    binding="#{LogImpHog6.campoOrden1Texto1}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['orden']}"/>
                                                <webuijsf:message id="messageOrden1"
                                                    for="campoOrden1"/>
                                                <webuijsf:helpInline id="helpInlineOrden1"
                                                    binding="#{LogImpHog6.helpInlineOrden1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.orden.log_imp_hog"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridCoordx1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHog6.labelCoordx1}"
                                                    id="labelCoordx1"
                                                    for="campoCoordx1"
                                                    text="coordx"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridCoordx2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoCoordx1"
                                                    binding="#{LogImpHog6.campoCoordx1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHog6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['coordx']}"
                                                    toolTip="BundleParametros.coordx.log_imp_hog"
                                                    validatorExpression="#{LogImpHog6.validatorCoordx1.validate}"/>
                                                <webuijsf:staticText id="campoCoordx1Texto1"
                                                    binding="#{LogImpHog6.campoCoordx1Texto1}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['coordx']}"/>
                                                <webuijsf:message id="messageCoordx1"
                                                    for="campoCoordx1"/>
                                                <webuijsf:helpInline id="helpInlineCoordx1"
                                                    binding="#{LogImpHog6.helpInlineCoordx1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.coordx.log_imp_hog"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP01a1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHog6.labelP01a1}"
                                                    id="labelP01a1"
                                                    for="campoP01a1"
                                                    text="p01a"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP01a2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP01a1"
                                                    binding="#{LogImpHog6.campoP01a1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHog6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p01a']}"
                                                    toolTip="BundleParametros.p01a.log_imp_hog"
                                                    validatorExpression="#{LogImpHog6.validatorP01a1.validate}"/>
                                                <webuijsf:staticText id="campoP01a1Texto1"
                                                    binding="#{LogImpHog6.campoP01a1Texto1}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p01a']}"/>
                                                <webuijsf:message id="messageP01a1"
                                                    for="campoP01a1"/>
                                                <webuijsf:helpInline id="helpInlineP01a1"
                                                    binding="#{LogImpHog6.helpInlineP01a1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p01a.log_imp_hog"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP01b1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHog6.labelP01b1}"
                                                    id="labelP01b1"
                                                    for="campoP01b1"
                                                    text="p01b"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP01b2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP01b1"
                                                    binding="#{LogImpHog6.campoP01b1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHog6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p01b']}"
                                                    toolTip="BundleParametros.p01b.log_imp_hog"
                                                    validatorExpression="#{LogImpHog6.validatorP01b1.validate}"/>
                                                <webuijsf:staticText id="campoP01b1Texto1"
                                                    binding="#{LogImpHog6.campoP01b1Texto1}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p01b']}"/>
                                                <webuijsf:message id="messageP01b1"
                                                    for="campoP01b1"/>
                                                <webuijsf:helpInline id="helpInlineP01b1"
                                                    binding="#{LogImpHog6.helpInlineP01b1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p01b.log_imp_hog"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP01c1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHog6.labelP01c1}"
                                                    id="labelP01c1"
                                                    for="campoP01c1"
                                                    text="p01c"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP01c2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP01c1"
                                                    binding="#{LogImpHog6.campoP01c1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHog6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p01c']}"
                                                    toolTip="BundleParametros.p01c.log_imp_hog"
                                                    validatorExpression="#{LogImpHog6.validatorP01c1.validate}"/>
                                                <webuijsf:staticText id="campoP01c1Texto1"
                                                    binding="#{LogImpHog6.campoP01c1Texto1}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p01c']}"/>
                                                <webuijsf:message id="messageP01c1"
                                                    for="campoP01c1"/>
                                                <webuijsf:helpInline id="helpInlineP01c1"
                                                    binding="#{LogImpHog6.helpInlineP01c1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p01c.log_imp_hog"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP01d1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHog6.labelP01d1}"
                                                    id="labelP01d1"
                                                    for="campoP01d1"
                                                    text="p01d"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP01d2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP01d1"
                                                    binding="#{LogImpHog6.campoP01d1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHog6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p01d']}"
                                                    toolTip="BundleParametros.p01d.log_imp_hog"
                                                    validatorExpression="#{LogImpHog6.validatorP01d1.validate}"/>
                                                <webuijsf:staticText id="campoP01d1Texto1"
                                                    binding="#{LogImpHog6.campoP01d1Texto1}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p01d']}"/>
                                                <webuijsf:message id="messageP01d1"
                                                    for="campoP01d1"/>
                                                <webuijsf:helpInline id="helpInlineP01d1"
                                                    binding="#{LogImpHog6.helpInlineP01d1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p01d.log_imp_hog"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP021"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHog6.labelP021}"
                                                    id="labelP021"
                                                    for="campoP021"
                                                    text="p02"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP022"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP021"
                                                    binding="#{LogImpHog6.campoP021}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHog6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p02']}"
                                                    toolTip="BundleParametros.p02.log_imp_hog"
                                                    validatorExpression="#{LogImpHog6.validatorP021.validate}"/>
                                                <webuijsf:staticText id="campoP021Texto1"
                                                    binding="#{LogImpHog6.campoP021Texto1}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p02']}"/>
                                                <webuijsf:message id="messageP021"
                                                    for="campoP021"/>
                                                <webuijsf:helpInline id="helpInlineP021"
                                                    binding="#{LogImpHog6.helpInlineP021}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p02.log_imp_hog"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP031"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHog6.labelP031}"
                                                    id="labelP031"
                                                    for="campoP031"
                                                    text="p03"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP032"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP031"
                                                    binding="#{LogImpHog6.campoP031}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHog6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p03']}"
                                                    toolTip="BundleParametros.p03.log_imp_hog"
                                                    validatorExpression="#{LogImpHog6.validatorP031.validate}"/>
                                                <webuijsf:staticText id="campoP031Texto1"
                                                    binding="#{LogImpHog6.campoP031Texto1}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p03']}"/>
                                                <webuijsf:message id="messageP031"
                                                    for="campoP031"/>
                                                <webuijsf:helpInline id="helpInlineP031"
                                                    binding="#{LogImpHog6.helpInlineP031}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p03.log_imp_hog"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP041"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHog6.labelP041}"
                                                    id="labelP041"
                                                    for="campoP041"
                                                    text="p04"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP042"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP041"
                                                    binding="#{LogImpHog6.campoP041}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHog6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p04']}"
                                                    toolTip="BundleParametros.p04.log_imp_hog"
                                                    validatorExpression="#{LogImpHog6.validatorP041.validate}"/>
                                                <webuijsf:staticText id="campoP041Texto1"
                                                    binding="#{LogImpHog6.campoP041Texto1}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p04']}"/>
                                                <webuijsf:message id="messageP041"
                                                    for="campoP041"/>
                                                <webuijsf:helpInline id="helpInlineP041"
                                                    binding="#{LogImpHog6.helpInlineP041}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p04.log_imp_hog"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP051"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHog6.labelP051}"
                                                    id="labelP051"
                                                    for="campoP051"
                                                    text="p05"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP052"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP051"
                                                    binding="#{LogImpHog6.campoP051}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHog6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p05']}"
                                                    toolTip="BundleParametros.p05.log_imp_hog"
                                                    validatorExpression="#{LogImpHog6.validatorP051.validate}"/>
                                                <webuijsf:staticText id="campoP051Texto1"
                                                    binding="#{LogImpHog6.campoP051Texto1}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p05']}"/>
                                                <webuijsf:message id="messageP051"
                                                    for="campoP051"/>
                                                <webuijsf:helpInline id="helpInlineP051"
                                                    binding="#{LogImpHog6.helpInlineP051}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p05.log_imp_hog"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP061"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHog6.labelP061}"
                                                    id="labelP061"
                                                    for="campoP061"
                                                    text="p06"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP062"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP061"
                                                    binding="#{LogImpHog6.campoP061}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHog6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p06']}"
                                                    toolTip="BundleParametros.p06.log_imp_hog"
                                                    validatorExpression="#{LogImpHog6.validatorP061.validate}"/>
                                                <webuijsf:staticText id="campoP061Texto1"
                                                    binding="#{LogImpHog6.campoP061Texto1}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p06']}"/>
                                                <webuijsf:message id="messageP061"
                                                    for="campoP061"/>
                                                <webuijsf:helpInline id="helpInlineP061"
                                                    binding="#{LogImpHog6.helpInlineP061}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p06.log_imp_hog"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP081"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHog6.labelP081}"
                                                    id="labelP081"
                                                    for="campoP081"
                                                    text="p08"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP082"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP081"
                                                    binding="#{LogImpHog6.campoP081}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHog6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p08']}"
                                                    toolTip="BundleParametros.p08.log_imp_hog"
                                                    validatorExpression="#{LogImpHog6.validatorP081.validate}"/>
                                                <webuijsf:staticText id="campoP081Texto1"
                                                    binding="#{LogImpHog6.campoP081Texto1}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p08']}"/>
                                                <webuijsf:message id="messageP081"
                                                    for="campoP081"/>
                                                <webuijsf:helpInline id="helpInlineP081"
                                                    binding="#{LogImpHog6.helpInlineP081}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p08.log_imp_hog"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP071"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHog6.labelP071}"
                                                    id="labelP071"
                                                    for="campoP071"
                                                    text="p07"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP072"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP071"
                                                    binding="#{LogImpHog6.campoP071}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHog6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p07']}"
                                                    toolTip="BundleParametros.p07.log_imp_hog"
                                                    validatorExpression="#{LogImpHog6.validatorP071.validate}"/>
                                                <webuijsf:staticText id="campoP071Texto1"
                                                    binding="#{LogImpHog6.campoP071Texto1}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p07']}"/>
                                                <webuijsf:message id="messageP071"
                                                    for="campoP071"/>
                                                <webuijsf:helpInline id="helpInlineP071"
                                                    binding="#{LogImpHog6.helpInlineP071}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p07.log_imp_hog"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP091"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHog6.labelP091}"
                                                    id="labelP091"
                                                    for="campoP091"
                                                    text="p09"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP092"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP091"
                                                    binding="#{LogImpHog6.campoP091}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHog6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p09']}"
                                                    toolTip="BundleParametros.p09.log_imp_hog"
                                                    validatorExpression="#{LogImpHog6.validatorP091.validate}"/>
                                                <webuijsf:staticText id="campoP091Texto1"
                                                    binding="#{LogImpHog6.campoP091Texto1}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p09']}"/>
                                                <webuijsf:message id="messageP091"
                                                    for="campoP091"/>
                                                <webuijsf:helpInline id="helpInlineP091"
                                                    binding="#{LogImpHog6.helpInlineP091}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p09.log_imp_hog"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP141"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHog6.labelP141}"
                                                    id="labelP141"
                                                    for="campoP141"
                                                    text="p14"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP142"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP141"
                                                    binding="#{LogImpHog6.campoP141}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHog6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p14']}"
                                                    toolTip="BundleParametros.p14.log_imp_hog"
                                                    validatorExpression="#{LogImpHog6.validatorP141.validate}"/>
                                                <webuijsf:staticText id="campoP141Texto1"
                                                    binding="#{LogImpHog6.campoP141Texto1}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p14']}"/>
                                                <webuijsf:message id="messageP141"
                                                    for="campoP141"/>
                                                <webuijsf:helpInline id="helpInlineP141"
                                                    binding="#{LogImpHog6.helpInlineP141}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p14.log_imp_hog"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP151"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHog6.labelP151}"
                                                    id="labelP151"
                                                    for="campoP151"
                                                    text="p15"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP152"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP151"
                                                    binding="#{LogImpHog6.campoP151}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHog6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p15']}"
                                                    toolTip="BundleParametros.p15.log_imp_hog"
                                                    validatorExpression="#{LogImpHog6.validatorP151.validate}"/>
                                                <webuijsf:staticText id="campoP151Texto1"
                                                    binding="#{LogImpHog6.campoP151Texto1}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p15']}"/>
                                                <webuijsf:message id="messageP151"
                                                    for="campoP151"/>
                                                <webuijsf:helpInline id="helpInlineP151"
                                                    binding="#{LogImpHog6.helpInlineP151}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p15.log_imp_hog"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP161"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHog6.labelP161}"
                                                    id="labelP161"
                                                    for="campoP161"
                                                    text="p16"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP162"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP161"
                                                    binding="#{LogImpHog6.campoP161}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHog6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p16']}"
                                                    toolTip="BundleParametros.p16.log_imp_hog"
                                                    validatorExpression="#{LogImpHog6.validatorP161.validate}"/>
                                                <webuijsf:staticText id="campoP161Texto1"
                                                    binding="#{LogImpHog6.campoP161Texto1}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p16']}"/>
                                                <webuijsf:message id="messageP161"
                                                    for="campoP161"/>
                                                <webuijsf:helpInline id="helpInlineP161"
                                                    binding="#{LogImpHog6.helpInlineP161}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p16.log_imp_hog"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP241"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHog6.labelP241}"
                                                    id="labelP241"
                                                    for="campoP241"
                                                    text="p24"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP242"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP241"
                                                    binding="#{LogImpHog6.campoP241}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHog6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p24']}"
                                                    toolTip="BundleParametros.p24.log_imp_hog"
                                                    validatorExpression="#{LogImpHog6.validatorP241.validate}"/>
                                                <webuijsf:staticText id="campoP241Texto1"
                                                    binding="#{LogImpHog6.campoP241Texto1}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p24']}"/>
                                                <webuijsf:message id="messageP241"
                                                    for="campoP241"/>
                                                <webuijsf:helpInline id="helpInlineP241"
                                                    binding="#{LogImpHog6.helpInlineP241}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p24.log_imp_hog"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP251"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHog6.labelP251}"
                                                    id="labelP251"
                                                    for="campoP251"
                                                    text="p25"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP252"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP251"
                                                    binding="#{LogImpHog6.campoP251}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHog6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p25']}"
                                                    toolTip="BundleParametros.p25.log_imp_hog"
                                                    validatorExpression="#{LogImpHog6.validatorP251.validate}"/>
                                                <webuijsf:staticText id="campoP251Texto1"
                                                    binding="#{LogImpHog6.campoP251Texto1}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p25']}"/>
                                                <webuijsf:message id="messageP251"
                                                    for="campoP251"/>
                                                <webuijsf:helpInline id="helpInlineP251"
                                                    binding="#{LogImpHog6.helpInlineP251}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p25.log_imp_hog"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP261"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHog6.labelP261}"
                                                    id="labelP261"
                                                    for="campoP261"
                                                    text="p26"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP262"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP261"
                                                    binding="#{LogImpHog6.campoP261}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHog6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p26']}"
                                                    toolTip="BundleParametros.p26.log_imp_hog"
                                                    validatorExpression="#{LogImpHog6.validatorP261.validate}"/>
                                                <webuijsf:staticText id="campoP261Texto1"
                                                    binding="#{LogImpHog6.campoP261Texto1}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p26']}"/>
                                                <webuijsf:message id="messageP261"
                                                    for="campoP261"/>
                                                <webuijsf:helpInline id="helpInlineP261"
                                                    binding="#{LogImpHog6.helpInlineP261}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p26.log_imp_hog"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP271"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHog6.labelP271}"
                                                    id="labelP271"
                                                    for="campoP271"
                                                    text="p27"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP272"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP271"
                                                    binding="#{LogImpHog6.campoP271}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHog6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p27']}"
                                                    toolTip="BundleParametros.p27.log_imp_hog"
                                                    validatorExpression="#{LogImpHog6.validatorP271.validate}"/>
                                                <webuijsf:staticText id="campoP271Texto1"
                                                    binding="#{LogImpHog6.campoP271Texto1}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p27']}"/>
                                                <webuijsf:message id="messageP271"
                                                    for="campoP271"/>
                                                <webuijsf:helpInline id="helpInlineP271"
                                                    binding="#{LogImpHog6.helpInlineP271}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p27.log_imp_hog"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP27e1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHog6.labelP27e1}"
                                                    id="labelP27e1"
                                                    for="campoP27e1"
                                                    text="p27e"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP27e2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP27e1"
                                                    binding="#{LogImpHog6.campoP27e1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHog6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p27e']}"
                                                    toolTip="BundleParametros.p27e.log_imp_hog"
                                                    validatorExpression="#{LogImpHog6.validatorP27e1.validate}"/>
                                                <webuijsf:staticText id="campoP27e1Texto1"
                                                    binding="#{LogImpHog6.campoP27e1Texto1}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p27e']}"/>
                                                <webuijsf:message id="messageP27e1"
                                                    for="campoP27e1"/>
                                                <webuijsf:helpInline id="helpInlineP27e1"
                                                    binding="#{LogImpHog6.helpInlineP27e1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p27e.log_imp_hog"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP28a1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHog6.labelP28a1}"
                                                    id="labelP28a1"
                                                    for="campoP28a1"
                                                    text="p28a"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP28a2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP28a1"
                                                    binding="#{LogImpHog6.campoP28a1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHog6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p28a']}"
                                                    toolTip="BundleParametros.p28a.log_imp_hog"
                                                    validatorExpression="#{LogImpHog6.validatorP28a1.validate}"/>
                                                <webuijsf:staticText id="campoP28a1Texto1"
                                                    binding="#{LogImpHog6.campoP28a1Texto1}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p28a']}"/>
                                                <webuijsf:message id="messageP28a1"
                                                    for="campoP28a1"/>
                                                <webuijsf:helpInline id="helpInlineP28a1"
                                                    binding="#{LogImpHog6.helpInlineP28a1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p28a.log_imp_hog"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP28b1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHog6.labelP28b1}"
                                                    id="labelP28b1"
                                                    for="campoP28b1"
                                                    text="p28b"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP28b2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP28b1"
                                                    binding="#{LogImpHog6.campoP28b1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHog6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p28b']}"
                                                    toolTip="BundleParametros.p28b.log_imp_hog"
                                                    validatorExpression="#{LogImpHog6.validatorP28b1.validate}"/>
                                                <webuijsf:staticText id="campoP28b1Texto1"
                                                    binding="#{LogImpHog6.campoP28b1Texto1}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p28b']}"/>
                                                <webuijsf:message id="messageP28b1"
                                                    for="campoP28b1"/>
                                                <webuijsf:helpInline id="helpInlineP28b1"
                                                    binding="#{LogImpHog6.helpInlineP28b1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p28b.log_imp_hog"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP291"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHog6.labelP291}"
                                                    id="labelP291"
                                                    for="campoP291"
                                                    text="p29"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP292"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP291"
                                                    binding="#{LogImpHog6.campoP291}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHog6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p29']}"
                                                    toolTip="BundleParametros.p29.log_imp_hog"
                                                    validatorExpression="#{LogImpHog6.validatorP291.validate}"/>
                                                <webuijsf:staticText id="campoP291Texto1"
                                                    binding="#{LogImpHog6.campoP291Texto1}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p29']}"/>
                                                <webuijsf:message id="messageP291"
                                                    for="campoP291"/>
                                                <webuijsf:helpInline id="helpInlineP291"
                                                    binding="#{LogImpHog6.helpInlineP291}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p29.log_imp_hog"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP301"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHog6.labelP301}"
                                                    id="labelP301"
                                                    for="campoP301"
                                                    text="p30"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP302"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP301"
                                                    binding="#{LogImpHog6.campoP301}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHog6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p30']}"
                                                    toolTip="BundleParametros.p30.log_imp_hog"
                                                    validatorExpression="#{LogImpHog6.validatorP301.validate}"/>
                                                <webuijsf:staticText id="campoP301Texto1"
                                                    binding="#{LogImpHog6.campoP301Texto1}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p30']}"/>
                                                <webuijsf:message id="messageP301"
                                                    for="campoP301"/>
                                                <webuijsf:helpInline id="helpInlineP301"
                                                    binding="#{LogImpHog6.helpInlineP301}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p30.log_imp_hog"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP311"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHog6.labelP311}"
                                                    id="labelP311"
                                                    for="campoP311"
                                                    text="p31"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP312"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP311"
                                                    binding="#{LogImpHog6.campoP311}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHog6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p31']}"
                                                    toolTip="BundleParametros.p31.log_imp_hog"
                                                    validatorExpression="#{LogImpHog6.validatorP311.validate}"/>
                                                <webuijsf:staticText id="campoP311Texto1"
                                                    binding="#{LogImpHog6.campoP311Texto1}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p31']}"/>
                                                <webuijsf:message id="messageP311"
                                                    for="campoP311"/>
                                                <webuijsf:helpInline id="helpInlineP311"
                                                    binding="#{LogImpHog6.helpInlineP311}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p31.log_imp_hog"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP321"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHog6.labelP321}"
                                                    id="labelP321"
                                                    for="campoP321"
                                                    text="p32"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP322"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP321"
                                                    binding="#{LogImpHog6.campoP321}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHog6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p32']}"
                                                    toolTip="BundleParametros.p32.log_imp_hog"
                                                    validatorExpression="#{LogImpHog6.validatorP321.validate}"/>
                                                <webuijsf:staticText id="campoP321Texto1"
                                                    binding="#{LogImpHog6.campoP321Texto1}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p32']}"/>
                                                <webuijsf:message id="messageP321"
                                                    for="campoP321"/>
                                                <webuijsf:helpInline id="helpInlineP321"
                                                    binding="#{LogImpHog6.helpInlineP321}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p32.log_imp_hog"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP331"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHog6.labelP331}"
                                                    id="labelP331"
                                                    for="campoP331"
                                                    text="p33"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP332"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP331"
                                                    binding="#{LogImpHog6.campoP331}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHog6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p33']}"
                                                    toolTip="BundleParametros.p33.log_imp_hog"
                                                    validatorExpression="#{LogImpHog6.validatorP331.validate}"/>
                                                <webuijsf:staticText id="campoP331Texto1"
                                                    binding="#{LogImpHog6.campoP331Texto1}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p33']}"/>
                                                <webuijsf:message id="messageP331"
                                                    for="campoP331"/>
                                                <webuijsf:helpInline id="helpInlineP331"
                                                    binding="#{LogImpHog6.helpInlineP331}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p33.log_imp_hog"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP341"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHog6.labelP341}"
                                                    id="labelP341"
                                                    for="campoP341"
                                                    text="p34"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP342"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP341"
                                                    binding="#{LogImpHog6.campoP341}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHog6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p34']}"
                                                    toolTip="BundleParametros.p34.log_imp_hog"
                                                    validatorExpression="#{LogImpHog6.validatorP341.validate}"/>
                                                <webuijsf:staticText id="campoP341Texto1"
                                                    binding="#{LogImpHog6.campoP341Texto1}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p34']}"/>
                                                <webuijsf:message id="messageP341"
                                                    for="campoP341"/>
                                                <webuijsf:helpInline id="helpInlineP341"
                                                    binding="#{LogImpHog6.helpInlineP341}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p34.log_imp_hog"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP351"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHog6.labelP351}"
                                                    id="labelP351"
                                                    for="campoP351"
                                                    text="p35"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP352"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP351"
                                                    binding="#{LogImpHog6.campoP351}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHog6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p35']}"
                                                    toolTip="BundleParametros.p35.log_imp_hog"
                                                    validatorExpression="#{LogImpHog6.validatorP351.validate}"/>
                                                <webuijsf:staticText id="campoP351Texto1"
                                                    binding="#{LogImpHog6.campoP351Texto1}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p35']}"/>
                                                <webuijsf:message id="messageP351"
                                                    for="campoP351"/>
                                                <webuijsf:helpInline id="helpInlineP351"
                                                    binding="#{LogImpHog6.helpInlineP351}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p35.log_imp_hog"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP361"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHog6.labelP361}"
                                                    id="labelP361"
                                                    for="campoP361"
                                                    text="p36"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP362"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP361"
                                                    binding="#{LogImpHog6.campoP361}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHog6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p36']}"
                                                    toolTip="BundleParametros.p36.log_imp_hog"
                                                    validatorExpression="#{LogImpHog6.validatorP361.validate}"/>
                                                <webuijsf:staticText id="campoP361Texto1"
                                                    binding="#{LogImpHog6.campoP361Texto1}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p36']}"/>
                                                <webuijsf:message id="messageP361"
                                                    for="campoP361"/>
                                                <webuijsf:helpInline id="helpInlineP361"
                                                    binding="#{LogImpHog6.helpInlineP361}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p36.log_imp_hog"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP371"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHog6.labelP371}"
                                                    id="labelP371"
                                                    for="campoP371"
                                                    text="p37"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP372"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP371"
                                                    binding="#{LogImpHog6.campoP371}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHog6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p37']}"
                                                    toolTip="BundleParametros.p37.log_imp_hog"
                                                    validatorExpression="#{LogImpHog6.validatorP371.validate}"/>
                                                <webuijsf:staticText id="campoP371Texto1"
                                                    binding="#{LogImpHog6.campoP371Texto1}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p37']}"/>
                                                <webuijsf:message id="messageP371"
                                                    for="campoP371"/>
                                                <webuijsf:helpInline id="helpInlineP371"
                                                    binding="#{LogImpHog6.helpInlineP371}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p37.log_imp_hog"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNroCelular1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHog6.labelNroCelular1}"
                                                    id="labelNroCelular1"
                                                    for="campoNroCelular1"
                                                    text="nro celular"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNroCelular2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoNroCelular1"
                                                    binding="#{LogImpHog6.campoNroCelular1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHog6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['nro_celular']}"
                                                    toolTip="BundleParametros.nro_celular.log_imp_hog"
                                                    validatorExpression="#{LogImpHog6.validatorNroCelular1.validate}"/>
                                                <webuijsf:staticText id="campoNroCelular1Texto1"
                                                    binding="#{LogImpHog6.campoNroCelular1Texto1}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['nro_celular']}"/>
                                                <webuijsf:message id="messageNroCelular1"
                                                    for="campoNroCelular1"/>
                                                <webuijsf:helpInline id="helpInlineNroCelular1"
                                                    binding="#{LogImpHog6.helpInlineNroCelular1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.nro_celular.log_imp_hog"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP381"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHog6.labelP381}"
                                                    id="labelP381"
                                                    for="campoP381"
                                                    text="p38"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP382"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP381"
                                                    binding="#{LogImpHog6.campoP381}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHog6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p38']}"
                                                    toolTip="BundleParametros.p38.log_imp_hog"
                                                    validatorExpression="#{LogImpHog6.validatorP381.validate}"/>
                                                <webuijsf:staticText id="campoP381Texto1"
                                                    binding="#{LogImpHog6.campoP381Texto1}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p38']}"/>
                                                <webuijsf:message id="messageP381"
                                                    for="campoP381"/>
                                                <webuijsf:helpInline id="helpInlineP381"
                                                    binding="#{LogImpHog6.helpInlineP381}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p38.log_imp_hog"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNroLineaBaja1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHog6.labelNroLineaBaja1}"
                                                    id="labelNroLineaBaja1"
                                                    for="campoNroLineaBaja1"
                                                    text="nro linea baja"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNroLineaBaja2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoNroLineaBaja1"
                                                    binding="#{LogImpHog6.campoNroLineaBaja1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHog6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['nro_linea_baja']}"
                                                    toolTip="BundleParametros.nro_linea_baja.log_imp_hog"
                                                    validatorExpression="#{LogImpHog6.validatorNroLineaBaja1.validate}"/>
                                                <webuijsf:staticText id="campoNroLineaBaja1Texto1"
                                                    binding="#{LogImpHog6.campoNroLineaBaja1Texto1}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['nro_linea_baja']}"/>
                                                <webuijsf:message id="messageNroLineaBaja1"
                                                    for="campoNroLineaBaja1"/>
                                                <webuijsf:helpInline id="helpInlineNroLineaBaja1"
                                                    binding="#{LogImpHog6.helpInlineNroLineaBaja1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.nro_linea_baja.log_imp_hog"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP3911"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHog6.labelP3911}"
                                                    id="labelP3911"
                                                    for="campoP3911"
                                                    text="p391"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP3912"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP3911"
                                                    binding="#{LogImpHog6.campoP3911}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHog6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p391']}"
                                                    toolTip="BundleParametros.p391.log_imp_hog"
                                                    validatorExpression="#{LogImpHog6.validatorP3911.validate}"/>
                                                <webuijsf:staticText id="campoP3911Texto1"
                                                    binding="#{LogImpHog6.campoP3911Texto1}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p391']}"/>
                                                <webuijsf:message id="messageP3911"
                                                    for="campoP3911"/>
                                                <webuijsf:helpInline id="helpInlineP3911"
                                                    binding="#{LogImpHog6.helpInlineP3911}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p391.log_imp_hog"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP3921"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHog6.labelP3921}"
                                                    id="labelP3921"
                                                    for="campoP3921"
                                                    text="p392"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP3922"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP3921"
                                                    binding="#{LogImpHog6.campoP3921}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHog6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p392']}"
                                                    toolTip="BundleParametros.p392.log_imp_hog"
                                                    validatorExpression="#{LogImpHog6.validatorP3921.validate}"/>
                                                <webuijsf:staticText id="campoP3921Texto1"
                                                    binding="#{LogImpHog6.campoP3921Texto1}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p392']}"/>
                                                <webuijsf:message id="messageP3921"
                                                    for="campoP3921"/>
                                                <webuijsf:helpInline id="helpInlineP3921"
                                                    binding="#{LogImpHog6.helpInlineP3921}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p392.log_imp_hog"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP3931"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHog6.labelP3931}"
                                                    id="labelP3931"
                                                    for="campoP3931"
                                                    text="p393"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP3932"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP3931"
                                                    binding="#{LogImpHog6.campoP3931}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHog6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p393']}"
                                                    toolTip="BundleParametros.p393.log_imp_hog"
                                                    validatorExpression="#{LogImpHog6.validatorP3931.validate}"/>
                                                <webuijsf:staticText id="campoP3931Texto1"
                                                    binding="#{LogImpHog6.campoP3931Texto1}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p393']}"/>
                                                <webuijsf:message id="messageP3931"
                                                    for="campoP3931"/>
                                                <webuijsf:helpInline id="helpInlineP3931"
                                                    binding="#{LogImpHog6.helpInlineP3931}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p393.log_imp_hog"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP3941"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHog6.labelP3941}"
                                                    id="labelP3941"
                                                    for="campoP3941"
                                                    text="p394"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP3942"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP3941"
                                                    binding="#{LogImpHog6.campoP3941}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHog6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p394']}"
                                                    toolTip="BundleParametros.p394.log_imp_hog"
                                                    validatorExpression="#{LogImpHog6.validatorP3941.validate}"/>
                                                <webuijsf:staticText id="campoP3941Texto1"
                                                    binding="#{LogImpHog6.campoP3941Texto1}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p394']}"/>
                                                <webuijsf:message id="messageP3941"
                                                    for="campoP3941"/>
                                                <webuijsf:helpInline id="helpInlineP3941"
                                                    binding="#{LogImpHog6.helpInlineP3941}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p394.log_imp_hog"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP3951"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHog6.labelP3951}"
                                                    id="labelP3951"
                                                    for="campoP3951"
                                                    text="p395"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP3952"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP3951"
                                                    binding="#{LogImpHog6.campoP3951}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHog6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p395']}"
                                                    toolTip="BundleParametros.p395.log_imp_hog"
                                                    validatorExpression="#{LogImpHog6.validatorP3951.validate}"/>
                                                <webuijsf:staticText id="campoP3951Texto1"
                                                    binding="#{LogImpHog6.campoP3951Texto1}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p395']}"/>
                                                <webuijsf:message id="messageP3951"
                                                    for="campoP3951"/>
                                                <webuijsf:helpInline id="helpInlineP3951"
                                                    binding="#{LogImpHog6.helpInlineP3951}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p395.log_imp_hog"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP3961"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHog6.labelP3961}"
                                                    id="labelP3961"
                                                    for="campoP3961"
                                                    text="p396"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP3962"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP3961"
                                                    binding="#{LogImpHog6.campoP3961}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHog6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p396']}"
                                                    toolTip="BundleParametros.p396.log_imp_hog"
                                                    validatorExpression="#{LogImpHog6.validatorP3961.validate}"/>
                                                <webuijsf:staticText id="campoP3961Texto1"
                                                    binding="#{LogImpHog6.campoP3961Texto1}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p396']}"/>
                                                <webuijsf:message id="messageP3961"
                                                    for="campoP3961"/>
                                                <webuijsf:helpInline id="helpInlineP3961"
                                                    binding="#{LogImpHog6.helpInlineP3961}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p396.log_imp_hog"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP3971"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHog6.labelP3971}"
                                                    id="labelP3971"
                                                    for="campoP3971"
                                                    text="p397"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP3972"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP3971"
                                                    binding="#{LogImpHog6.campoP3971}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHog6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p397']}"
                                                    toolTip="BundleParametros.p397.log_imp_hog"
                                                    validatorExpression="#{LogImpHog6.validatorP3971.validate}"/>
                                                <webuijsf:staticText id="campoP3971Texto1"
                                                    binding="#{LogImpHog6.campoP3971Texto1}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p397']}"/>
                                                <webuijsf:message id="messageP3971"
                                                    for="campoP3971"/>
                                                <webuijsf:helpInline id="helpInlineP3971"
                                                    binding="#{LogImpHog6.helpInlineP3971}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p397.log_imp_hog"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP42n1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHog6.labelP42n1}"
                                                    id="labelP42n1"
                                                    for="campoP42n1"
                                                    text="p42n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP42n2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP42n1"
                                                    binding="#{LogImpHog6.campoP42n1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHog6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p42n']}"
                                                    toolTip="BundleParametros.p42n.log_imp_hog"
                                                    validatorExpression="#{LogImpHog6.validatorP42n1.validate}"/>
                                                <webuijsf:staticText id="campoP42n1Texto1"
                                                    binding="#{LogImpHog6.campoP42n1Texto1}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p42n']}"/>
                                                <webuijsf:message id="messageP42n1"
                                                    for="campoP42n1"/>
                                                <webuijsf:helpInline id="helpInlineP42n1"
                                                    binding="#{LogImpHog6.helpInlineP42n1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p42n.log_imp_hog"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP42ci1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHog6.labelP42ci1}"
                                                    id="labelP42ci1"
                                                    for="campoP42ci1"
                                                    text="p42ci"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP42ci2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP42ci1"
                                                    binding="#{LogImpHog6.campoP42ci1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHog6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p42ci']}"
                                                    toolTip="BundleParametros.p42ci.log_imp_hog"
                                                    validatorExpression="#{LogImpHog6.validatorP42ci1.validate}"/>
                                                <webuijsf:staticText id="campoP42ci1Texto1"
                                                    binding="#{LogImpHog6.campoP42ci1Texto1}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p42ci']}"/>
                                                <webuijsf:message id="messageP42ci1"
                                                    for="campoP42ci1"/>
                                                <webuijsf:helpInline id="helpInlineP42ci1"
                                                    binding="#{LogImpHog6.helpInlineP42ci1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p42ci.log_imp_hog"
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
                                                id="gridP431"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHog6.labelP431}"
                                                    id="labelP431"
                                                    for="campoP431"
                                                    text="p43"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP432"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP431"
                                                    binding="#{LogImpHog6.campoP431}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHog6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p43']}"
                                                    toolTip="BundleParametros.p43.log_imp_hog"
                                                    validatorExpression="#{LogImpHog6.validatorP431.validate}"/>
                                                <webuijsf:staticText id="campoP431Texto1"
                                                    binding="#{LogImpHog6.campoP431Texto1}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p43']}"/>
                                                <webuijsf:message id="messageP431"
                                                    for="campoP431"/>
                                                <webuijsf:helpInline id="helpInlineP431"
                                                    binding="#{LogImpHog6.helpInlineP431}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p43.log_imp_hog"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridVar000021"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHog6.labelVar000021}"
                                                    id="labelVar000021"
                                                    for="campoVar000021"
                                                    text="var00002"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridVar000022"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoVar000021"
                                                    binding="#{LogImpHog6.campoVar000021}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHog6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['var00002']}"
                                                    toolTip="BundleParametros.var00002.log_imp_hog"
                                                    validatorExpression="#{LogImpHog6.validatorVar000021.validate}"/>
                                                <webuijsf:staticText id="campoVar000021Texto1"
                                                    binding="#{LogImpHog6.campoVar000021Texto1}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['var00002']}"/>
                                                <webuijsf:message id="messageVar000021"
                                                    for="campoVar000021"/>
                                                <webuijsf:helpInline id="helpInlineVar000021"
                                                    binding="#{LogImpHog6.helpInlineVar000021}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.var00002.log_imp_hog"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridVar000031"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHog6.labelVar000031}"
                                                    id="labelVar000031"
                                                    for="campoVar000031"
                                                    text="var00003"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridVar000032"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoVar000031"
                                                    binding="#{LogImpHog6.campoVar000031}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHog6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['var00003']}"
                                                    toolTip="BundleParametros.var00003.log_imp_hog"
                                                    validatorExpression="#{LogImpHog6.validatorVar000031.validate}"/>
                                                <webuijsf:staticText id="campoVar000031Texto1"
                                                    binding="#{LogImpHog6.campoVar000031Texto1}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['var00003']}"/>
                                                <webuijsf:message id="messageVar000031"
                                                    for="campoVar000031"/>
                                                <webuijsf:helpInline id="helpInlineVar000031"
                                                    binding="#{LogImpHog6.helpInlineVar000031}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.var00003.log_imp_hog"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridVar000041"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHog6.labelVar000041}"
                                                    id="labelVar000041"
                                                    for="campoVar000041"
                                                    text="var00004"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridVar000042"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoVar000041"
                                                    binding="#{LogImpHog6.campoVar000041}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHog6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['var00004']}"
                                                    toolTip="BundleParametros.var00004.log_imp_hog"
                                                    validatorExpression="#{LogImpHog6.validatorVar000041.validate}"/>
                                                <webuijsf:staticText id="campoVar000041Texto1"
                                                    binding="#{LogImpHog6.campoVar000041Texto1}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['var00004']}"/>
                                                <webuijsf:message id="messageVar000041"
                                                    for="campoVar000041"/>
                                                <webuijsf:helpInline id="helpInlineVar000041"
                                                    binding="#{LogImpHog6.helpInlineVar000041}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.var00004.log_imp_hog"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridP1041"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpHog6.labelP1041}"
                                                    id="labelP1041"
                                                    for="campoP1041"
                                                    text="p104"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridP1042"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoP1041"
                                                    binding="#{LogImpHog6.campoP1041}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpHog6.gestor.filaNoProcesada}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p104']}"
                                                    toolTip="BundleParametros.p104.log_imp_hog"
                                                    validatorExpression="#{LogImpHog6.validatorP1041.validate}"/>
                                                <webuijsf:staticText id="campoP1041Texto1"
                                                    binding="#{LogImpHog6.campoP1041Texto1}"
                                                    text="#{LogImpHog6.logImpHogDataProvider.value['p104']}"/>
                                                <webuijsf:message id="messageP1041"
                                                    for="campoP1041"/>
                                                <webuijsf:helpInline id="helpInlineP1041"
                                                    binding="#{LogImpHog6.helpInlineP1041}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.p104.log_imp_hog"
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
