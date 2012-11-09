<?xml version="1.0" encoding="UTF-8"?>
<!--
   Copyright (C) 2008, EGT Consultores, C.A.
   Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los términos
   de la licencia "GNU General Public License" publicada por la Fundación "Free Software Foundation".
   Este programa se distribuye con la esperanza de que pueda ser útil, pero SIN NINGUNA GARANTIA;
   vea la licencia "GNU General Public License" para obtener mas información.
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page binding="#{ElementoSegmentoPorConjuntoSegmento2.page1}" id="page1">
            <webuijsf:html binding="#{ElementoSegmentoPorConjuntoSegmento2.html1}" id="html1">
                <webuijsf:head binding="#{ElementoSegmentoPorConjuntoSegmento2.head1}" id="head1" title="#{ApplicationBean1.nombreAplicacion}">
                    <webuijsf:link binding="#{ElementoSegmentoPorConjuntoSegmento2.link1}" id="link1" url="/resources/stylesheet.css"/>
                    <webuijsf:script binding="#{ElementoSegmentoPorConjuntoSegmento2.script1}" id="script1" url="/resources/javascript1.js"/>
                </webuijsf:head>
                <webuijsf:body binding="#{ElementoSegmentoPorConjuntoSegmento2.body1}" id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}" onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}" onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}" styleClass="pdq-body-1">
                    <webuijsf:form binding="#{ElementoSegmentoPorConjuntoSegmento2.form1}" id="form1" virtualFormsConfig="virtualForm1 | campoIdElementoSegmento1 campoIdSegmento1 campoValorSegmento1 campoSignificadoSegmento1 listaFuncionEdicion1 | , virtualForm2 | | , virtualForm3 | listaFuncionEdicion1 | listaFuncionEdicion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonRefrescar1 botonAgregar1 botonDescartar1 botonRetornar1">
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
                                    <webuijsf:breadcrumbs binding="#{ElementoSegmentoPorConjuntoSegmento2.breadcrumbs1}" id="breadcrumbs1" styleClass="pdq-breadcrumbs-1"/>
                                </div>
                                <div class="pos-div-detalle">
                                    <h:panelGrid binding="#{ElementoSegmentoPorConjuntoSegmento2.gridPanel101}" id="gridPanel101">
                                        <h:panelGrid binding="#{ElementoSegmentoPorConjuntoSegmento2.gridPanel102}" id="gridPanel102">
                                            <h:panelGrid binding="#{ElementoSegmentoPorConjuntoSegmento2.gridPanel103}" columns="2" id="gridPanel103">
                                                <webuijsf:image binding="#{ElementoSegmentoPorConjuntoSegmento2.imagenMensaje1}" id="imagenMensaje1" url="#{ElementoSegmentoPorConjuntoSegmento2.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink align="middle" binding="#{ElementoSegmentoPorConjuntoSegmento2.hipervinculoMensaje1}"
                                                    id="hipervinculoMensaje1" text="#{ElementoSegmentoPorConjuntoSegmento2.gestor.mensaje}" url="#{ElementoSegmentoPorConjuntoSegmento2.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
<h:panelGrid id="gridPanel104" styleClass="pdq-grid-detalle-1" binding="#{ElementoSegmentoPorConjuntoSegmento2.gridPanel104}" rendered="#{ElementoSegmentoPorConjuntoSegmento2.gestor.filaDisponible}">
<h:panelGrid id="gridPanel201" styleClass="pdq-grid-detalle-cab">
<h:panelGrid id="gridPanel202" columns="2">
                                            <h:panelGrid binding="#{ElementoSegmentoPorConjuntoSegmento2.gridPanel105}" id="gridPanel105" styleClass="pdq-grid-detalle-botones">
                                                <h:panelGrid binding="#{ElementoSegmentoPorConjuntoSegmento2.gridPanel106}" columns="4" id="gridPanel106">
                                                    <webuijsf:button actionExpression="#{ElementoSegmentoPorConjuntoSegmento2.botonIrAlPrimero1_action}"
                                                        binding="#{ElementoSegmentoPorConjuntoSegmento2.botonIrAlPrimero1}"
                                                        disabled="#{ElementoSegmentoPorConjuntoSegmento2.gestor.loteSinFilas}" id="botonIrAlPrimero1"
                                                        imageURL="#{ElementoSegmentoPorConjuntoSegmento2.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{ElementoSegmentoPorConjuntoSegmento2.gestor.scriptIrAlPrimero}"
                                                        text="#{ElementoSegmentoPorConjuntoSegmento2.gestor.i18n.textoBotonIrAlPrimero}" toolTip="#{ElementoSegmentoPorConjuntoSegmento2.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button actionExpression="#{ElementoSegmentoPorConjuntoSegmento2.botonIrAlAnterior1_action}"
                                                        binding="#{ElementoSegmentoPorConjuntoSegmento2.botonIrAlAnterior1}"
                                                        disabled="#{ElementoSegmentoPorConjuntoSegmento2.gestor.loteSinFilas}" id="botonIrAlAnterior1"
                                                        imageURL="#{ElementoSegmentoPorConjuntoSegmento2.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{ElementoSegmentoPorConjuntoSegmento2.gestor.scriptIrAlAnterior}"
                                                        text="#{ElementoSegmentoPorConjuntoSegmento2.gestor.i18n.textoBotonIrAlAnterior}" toolTip="#{ElementoSegmentoPorConjuntoSegmento2.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button actionExpression="#{ElementoSegmentoPorConjuntoSegmento2.botonIrAlSiguiente1_action}"
                                                        binding="#{ElementoSegmentoPorConjuntoSegmento2.botonIrAlSiguiente1}"
                                                        disabled="#{ElementoSegmentoPorConjuntoSegmento2.gestor.loteSinFilas}" id="botonIrAlSiguiente1"
                                                        imageURL="#{ElementoSegmentoPorConjuntoSegmento2.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{ElementoSegmentoPorConjuntoSegmento2.gestor.scriptIrAlSiguiente}"
                                                        text="#{ElementoSegmentoPorConjuntoSegmento2.gestor.i18n.textoBotonIrAlSiguiente}" toolTip="#{ElementoSegmentoPorConjuntoSegmento2.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button actionExpression="#{ElementoSegmentoPorConjuntoSegmento2.botonIrAlUltimo1_action}"
                                                        binding="#{ElementoSegmentoPorConjuntoSegmento2.botonIrAlUltimo1}"
                                                        disabled="#{ElementoSegmentoPorConjuntoSegmento2.gestor.loteSinFilas}" id="botonIrAlUltimo1"
                                                        imageURL="#{ElementoSegmentoPorConjuntoSegmento2.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{ElementoSegmentoPorConjuntoSegmento2.gestor.scriptIrAlUltimo}"
                                                        text="#{ElementoSegmentoPorConjuntoSegmento2.gestor.i18n.textoBotonIrAlUltimo}" toolTip="#{ElementoSegmentoPorConjuntoSegmento2.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{ElementoSegmentoPorConjuntoSegmento2.gridPanel107}" id="gridPanel107" styleClass="pdq-grid-detalle-mensajes">
                                                <h:panelGrid binding="#{ElementoSegmentoPorConjuntoSegmento2.gridPanel108}" id="gridPanel108" styleClass="pdq-grid-detalle-mensajes-2">
                                                    <webuijsf:staticText binding="#{ElementoSegmentoPorConjuntoSegmento2.textoTituloConsulta1}"
                                                        id="textoTituloConsulta1" styleClass="pdq-text-titulo-1" text="#{ElementoSegmentoPorConjuntoSegmento2.gestor.tituloConsulta}"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
</h:panelGrid><!--gridPanel202-->
</h:panelGrid><!--gridPanel201-->
<h:panelGrid id="gridPanel203" columns="2">
                                            <h:panelGrid binding="#{ElementoSegmentoPorConjuntoSegmento2.gridPanel109}" id="gridPanel109" styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label binding="#{ElementoSegmentoPorConjuntoSegmento2.etiquetaIdentificacionFila1}"
                                                    id="etiquetaIdentificacionFila1"
                                                    text="#{ElementoSegmentoPorConjuntoSegmento2.gestor.i18n.textoEtiquetaIdentificacionFila}" toolTip="#{ElementoSegmentoPorConjuntoSegmento2.gestor.i18n.toolTipEtiquetaIdentificacionFila}"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{ElementoSegmentoPorConjuntoSegmento2.gridPanel110}" columns="5" id="gridPanel110" styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText binding="#{ElementoSegmentoPorConjuntoSegmento2.textoIdentificacionFila1}"
                                                    id="textoIdentificacionFila1" style="font-weight: bold" text="#{ElementoSegmentoPorConjuntoSegmento2.gestor.identificacionFila}"/>
                                                <webuijsf:image binding="#{ElementoSegmentoPorConjuntoSegmento2.imagenFilaProcesada1}" id="imagenFilaProcesada1"
                                                    toolTip="#{ElementoSegmentoPorConjuntoSegmento2.gestor.toolTipImagenFilaProcesada}" url="#{ElementoSegmentoPorConjuntoSegmento2.gestor.urlImagenFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{ElementoSegmentoPorConjuntoSegmento2.gridPanel111}" id="gridPanel111"
                                                rendered="#{ElementoSegmentoPorConjuntoSegmento2.gestor.paginaConsultaConMaestro}" styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label binding="#{ElementoSegmentoPorConjuntoSegmento2.labelIdConjuntoSegmento1}"
                                                    id="labelIdConjuntoSegmento1" text="conjunto segmento"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{ElementoSegmentoPorConjuntoSegmento2.gridPanel112}" columns="5" id="gridPanel112"
                                                rendered="#{ElementoSegmentoPorConjuntoSegmento2.gestor.paginaConsultaConMaestro}" styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText binding="#{ElementoSegmentoPorConjuntoSegmento2.textoDenominacionFilaMaestro1}"
                                                    id="textoDenominacionFilaMaestro1" style="font-weight: bold" text="#{ElementoSegmentoPorConjuntoSegmento2.gestor.denominacionFilaMaestro}"/>
                                                <webuijsf:image binding="#{ElementoSegmentoPorConjuntoSegmento2.imagenFilaMaestro1}" id="imagenFilaMaestro1" url="#{ElementoSegmentoPorConjuntoSegmento2.gestor.urlImagenMaestroFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{ElementoSegmentoPorConjuntoSegmento2.gridIdElementoSegmento1}" id="gridIdElementoSegmento1"
                                                rendered="false" styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label binding="#{ElementoSegmentoPorConjuntoSegmento2.labelIdElementoSegmento1}"
                                                    for="campoIdElementoSegmento1" id="labelIdElementoSegmento1" text="id"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{ElementoSegmentoPorConjuntoSegmento2.gridIdElementoSegmento2}" columns="5"
                                                id="gridIdElementoSegmento2" rendered="false" styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField binding="#{ElementoSegmentoPorConjuntoSegmento2.campoIdElementoSegmento1}"
                                                    converter="#{ElementoSegmentoPorConjuntoSegmento2.converterIdElementoSegmento1}"
                                                    id="campoIdElementoSegmento1" readOnly="#{ElementoSegmentoPorConjuntoSegmento2.gestor.filaNoProcesada}"
                                                    text="#{ElementoSegmentoPorConjuntoSegmento2.elementoSegmentoDataProvider.value['id_elemento_segmento']}" validatorExpression="#{ElementoSegmentoPorConjuntoSegmento2.validatorIdElementoSegmento1.validate}"/>
                                                <webuijsf:staticText binding="#{ElementoSegmentoPorConjuntoSegmento2.campoIdElementoSegmento1Texto1}" id="campoIdElementoSegmento1Texto1"/>
                                                <webuijsf:message binding="#{ElementoSegmentoPorConjuntoSegmento2.messageIdElementoSegmento1}"
                                                    for="campoIdElementoSegmento1" id="messageIdElementoSegmento1"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{ElementoSegmentoPorConjuntoSegmento2.gridIdSegmento1}" id="gridIdSegmento1" styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label binding="#{ElementoSegmentoPorConjuntoSegmento2.labelIdSegmento1}" for="campoIdSegmento1"
                                                    id="labelIdSegmento1" text="id segmento"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{ElementoSegmentoPorConjuntoSegmento2.gridIdSegmento2}" columns="5" id="gridIdSegmento2" styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField binding="#{ElementoSegmentoPorConjuntoSegmento2.campoIdSegmento1}"
                                                    converter="#{ElementoSegmentoPorConjuntoSegmento2.converterIdSegmento1}" id="campoIdSegmento1"
                                                    readOnly="#{ElementoSegmentoPorConjuntoSegmento2.gestor.filaNoProcesada}" required="true"
                                                    text="#{ElementoSegmentoPorConjuntoSegmento2.elementoSegmentoDataProvider.value['id_segmento']}" validatorExpression="#{ElementoSegmentoPorConjuntoSegmento2.validatorIdSegmento1.validate}"/>
                                                <webuijsf:staticText binding="#{ElementoSegmentoPorConjuntoSegmento2.campoIdSegmento1Texto1}" id="campoIdSegmento1Texto1"/>
                                                <webuijsf:message binding="#{ElementoSegmentoPorConjuntoSegmento2.messageIdSegmento1}" for="campoIdSegmento1" id="messageIdSegmento1"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{ElementoSegmentoPorConjuntoSegmento2.gridValorSegmento1}" id="gridValorSegmento1" styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label binding="#{ElementoSegmentoPorConjuntoSegmento2.labelValorSegmento1}" for="campoValorSegmento1"
                                                    id="labelValorSegmento1" text="valor segmento"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{ElementoSegmentoPorConjuntoSegmento2.gridValorSegmento2}" columns="5"
                                                id="gridValorSegmento2" styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea binding="#{ElementoSegmentoPorConjuntoSegmento2.campoValorSegmento1}" columns="100"
                                                    id="campoValorSegmento1" readOnly="#{ElementoSegmentoPorConjuntoSegmento2.gestor.filaNoProcesada}" rows="3"
                                                    text="#{ElementoSegmentoPorConjuntoSegmento2.elementoSegmentoDataProvider.value['valor_segmento']}" validatorExpression="#{ElementoSegmentoPorConjuntoSegmento2.validatorValorSegmento1.validate}"/>
                                                <webuijsf:staticText binding="#{ElementoSegmentoPorConjuntoSegmento2.campoValorSegmento1Texto1}" id="campoValorSegmento1Texto1"/>
                                                <webuijsf:message binding="#{ElementoSegmentoPorConjuntoSegmento2.messageValorSegmento1}"
                                                    for="campoValorSegmento1" id="messageValorSegmento1"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{ElementoSegmentoPorConjuntoSegmento2.gridSignificadoSegmento1}"
                                                id="gridSignificadoSegmento1" styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label binding="#{ElementoSegmentoPorConjuntoSegmento2.labelSignificadoSegmento1}"
                                                    for="campoSignificadoSegmento1" id="labelSignificadoSegmento1" text="significado segmento"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{ElementoSegmentoPorConjuntoSegmento2.gridSignificadoSegmento2}" columns="5"
                                                id="gridSignificadoSegmento2" styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea binding="#{ElementoSegmentoPorConjuntoSegmento2.campoSignificadoSegmento1}" columns="100"
                                                    id="campoSignificadoSegmento1" readOnly="#{ElementoSegmentoPorConjuntoSegmento2.gestor.filaNoProcesada}"
                                                    rows="3"
                                                    text="#{ElementoSegmentoPorConjuntoSegmento2.elementoSegmentoDataProvider.value['significado_segmento']}" validatorExpression="#{ElementoSegmentoPorConjuntoSegmento2.validatorSignificadoSegmento1.validate}"/>
                                                <webuijsf:staticText binding="#{ElementoSegmentoPorConjuntoSegmento2.campoSignificadoSegmento1Texto1}" id="campoSignificadoSegmento1Texto1"/>
                                                <webuijsf:message binding="#{ElementoSegmentoPorConjuntoSegmento2.messageSignificadoSegmento1}"
                                                    for="campoSignificadoSegmento1" id="messageSignificadoSegmento1"/>
                                            </h:panelGrid>
</h:panelGrid><!--gridPanel203-->
<h:panelGrid  id="gridPanel204" styleClass="pdq-grid-detalle-pie">
<h:panelGrid  id="gridPanel205" columns="2">
                                            <h:panelGrid binding="#{ElementoSegmentoPorConjuntoSegmento2.gridPanel113}" id="gridPanel113" styleClass="pdq-grid-detalle-botones">
                                                <h:panelGrid binding="#{ElementoSegmentoPorConjuntoSegmento2.gridPanel114}" columns="4" id="gridPanel114">
                                                    <webuijsf:button actionExpression="#{ElementoSegmentoPorConjuntoSegmento2.botonIrAlPrimero2_action}"
                                                        binding="#{ElementoSegmentoPorConjuntoSegmento2.botonIrAlPrimero2}"
                                                        disabled="#{ElementoSegmentoPorConjuntoSegmento2.gestor.loteSinFilas}" id="botonIrAlPrimero2"
                                                        imageURL="#{ElementoSegmentoPorConjuntoSegmento2.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{ElementoSegmentoPorConjuntoSegmento2.gestor.scriptIrAlPrimero}"
                                                        text="#{ElementoSegmentoPorConjuntoSegmento2.gestor.i18n.textoBotonIrAlPrimero}" toolTip="#{ElementoSegmentoPorConjuntoSegmento2.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button actionExpression="#{ElementoSegmentoPorConjuntoSegmento2.botonIrAlAnterior2_action}"
                                                        binding="#{ElementoSegmentoPorConjuntoSegmento2.botonIrAlAnterior2}"
                                                        disabled="#{ElementoSegmentoPorConjuntoSegmento2.gestor.loteSinFilas}" id="botonIrAlAnterior2"
                                                        imageURL="#{ElementoSegmentoPorConjuntoSegmento2.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{ElementoSegmentoPorConjuntoSegmento2.gestor.scriptIrAlAnterior}"
                                                        text="#{ElementoSegmentoPorConjuntoSegmento2.gestor.i18n.textoBotonIrAlAnterior}" toolTip="#{ElementoSegmentoPorConjuntoSegmento2.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button actionExpression="#{ElementoSegmentoPorConjuntoSegmento2.botonIrAlSiguiente2_action}"
                                                        binding="#{ElementoSegmentoPorConjuntoSegmento2.botonIrAlSiguiente2}"
                                                        disabled="#{ElementoSegmentoPorConjuntoSegmento2.gestor.loteSinFilas}" id="botonIrAlSiguiente2"
                                                        imageURL="#{ElementoSegmentoPorConjuntoSegmento2.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{ElementoSegmentoPorConjuntoSegmento2.gestor.scriptIrAlSiguiente}"
                                                        text="#{ElementoSegmentoPorConjuntoSegmento2.gestor.i18n.textoBotonIrAlSiguiente}" toolTip="#{ElementoSegmentoPorConjuntoSegmento2.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button actionExpression="#{ElementoSegmentoPorConjuntoSegmento2.botonIrAlUltimo2_action}"
                                                        binding="#{ElementoSegmentoPorConjuntoSegmento2.botonIrAlUltimo2}"
                                                        disabled="#{ElementoSegmentoPorConjuntoSegmento2.gestor.loteSinFilas}" id="botonIrAlUltimo2"
                                                        imageURL="#{ElementoSegmentoPorConjuntoSegmento2.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{ElementoSegmentoPorConjuntoSegmento2.gestor.scriptIrAlUltimo}"
                                                        text="#{ElementoSegmentoPorConjuntoSegmento2.gestor.i18n.textoBotonIrAlUltimo}" toolTip="#{ElementoSegmentoPorConjuntoSegmento2.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{ElementoSegmentoPorConjuntoSegmento2.gridPanel115}" id="gridPanel115" styleClass="pdq-grid-detalle-mensajes">
                                                <webuijsf:staticText binding="#{ElementoSegmentoPorConjuntoSegmento2.textoMensajeCambiosPorConfirmar1}"
                                                    id="textoMensajeCambiosPorConfirmar1" style="font-weight: bold" text="#{ElementoSegmentoPorConjuntoSegmento2.gestor.mensajeCambiosPorConfirmar}"/>
                                            </h:panelGrid>
</h:panelGrid><!--gridPanel205-->
</h:panelGrid><!--gridPanel204-->
</h:panelGrid><!--gridPanel104-->
                                        <h:panelGrid binding="#{ElementoSegmentoPorConjuntoSegmento2.gridPanel116}" id="gridPanel116">
                                            <h:panelGrid binding="#{ElementoSegmentoPorConjuntoSegmento2.gridPanel117}" id="gridPanel117">
                                                <webuijsf:anchor binding="#{ElementoSegmentoPorConjuntoSegmento2.anchor1}" id="anchor1"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{ElementoSegmentoPorConjuntoSegmento2.gridPanel118}" columns="10" id="gridPanel118">
                                                <webuijsf:button actionExpression="#{ElementoSegmentoPorConjuntoSegmento2.botonAgregar1_action}"
                                                    binding="#{ElementoSegmentoPorConjuntoSegmento2.botonAgregar1}"
                                                    disabled="#{ElementoSegmentoPorConjuntoSegmento2.gestor.funcionInsertInhabilitada}" id="botonAgregar1"
                                                    onClick="#{ElementoSegmentoPorConjuntoSegmento2.gestor.scriptAgregar}"
                                                    rendered="#{ElementoSegmentoPorConjuntoSegmento2.gestor.funcionInsertHabilitada}" styleClass="pdq-button-1"
                                                    text="#{ElementoSegmentoPorConjuntoSegmento2.gestor.i18n.textoBotonAgregar}" toolTip="#{ElementoSegmentoPorConjuntoSegmento2.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown binding="#{ElementoSegmentoPorConjuntoSegmento2.listaFuncionEdicion1}"
                                                    converter="#{ElementoSegmentoPorConjuntoSegmento2.converterListaFuncionEdicion1}"
                                                    disabled="#{ElementoSegmentoPorConjuntoSegmento2.gestor.loteConCambios}" id="listaFuncionEdicion1"
                                                    items="#{ElementoSegmentoPorConjuntoSegmento2.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{ElementoSegmentoPorConjuntoSegmento2.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{ElementoSegmentoPorConjuntoSegmento2.gestor.funcionEdicionSeleccionada}" toolTip="#{ElementoSegmentoPorConjuntoSegmento2.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button actionExpression="#{ElementoSegmentoPorConjuntoSegmento2.botonEditar1_action}"
                                                    binding="#{ElementoSegmentoPorConjuntoSegmento2.botonEditar1}"
                                                    disabled="#{ElementoSegmentoPorConjuntoSegmento2.gestor.funcionUpdateInhabilitada}" id="botonEditar1"
                                                    onClick="#{ElementoSegmentoPorConjuntoSegmento2.gestor.scriptEditar}"
                                                    rendered="#{ElementoSegmentoPorConjuntoSegmento2.gestor.funcionUpdateHabilitada}" styleClass="pdq-button-1"
                                                    text="#{ElementoSegmentoPorConjuntoSegmento2.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}" toolTip="#{ElementoSegmentoPorConjuntoSegmento2.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button actionExpression="#{ElementoSegmentoPorConjuntoSegmento2.botonEliminar1_action}"
                                                    binding="#{ElementoSegmentoPorConjuntoSegmento2.botonEliminar1}"
                                                    disabled="#{ElementoSegmentoPorConjuntoSegmento2.gestor.funcionDeleteInhabilitada}" id="botonEliminar1"
                                                    onClick="#{ElementoSegmentoPorConjuntoSegmento2.gestor.scriptEliminar}"
                                                    rendered="#{ElementoSegmentoPorConjuntoSegmento2.gestor.funcionDeleteHabilitada}" styleClass="pdq-button-1"
                                                    text="#{ElementoSegmentoPorConjuntoSegmento2.gestor.i18n.textoBotonEliminar}" toolTip="#{ElementoSegmentoPorConjuntoSegmento2.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button actionExpression="#{ElementoSegmentoPorConjuntoSegmento2.botonAplicar1_action}"
                                                    binding="#{ElementoSegmentoPorConjuntoSegmento2.botonAplicar1}" id="botonAplicar1"
                                                    onClick="#{ElementoSegmentoPorConjuntoSegmento2.gestor.scriptAplicar}"
                                                    rendered="#{ElementoSegmentoPorConjuntoSegmento2.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1" text="#{ElementoSegmentoPorConjuntoSegmento2.gestor.i18n.textoBotonAplicar}" toolTip="#{ElementoSegmentoPorConjuntoSegmento2.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button actionExpression="#{ElementoSegmentoPorConjuntoSegmento2.botonDeshacer1_action}"
                                                    binding="#{ElementoSegmentoPorConjuntoSegmento2.botonDeshacer1}" id="botonDeshacer1"
                                                    onClick="#{ElementoSegmentoPorConjuntoSegmento2.gestor.scriptDeshacer}"
                                                    rendered="#{ElementoSegmentoPorConjuntoSegmento2.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1" text="#{ElementoSegmentoPorConjuntoSegmento2.gestor.i18n.textoBotonDeshacer}" toolTip="#{ElementoSegmentoPorConjuntoSegmento2.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button actionExpression="#{ElementoSegmentoPorConjuntoSegmento2.botonConfirmar1_action}"
                                                    binding="#{ElementoSegmentoPorConjuntoSegmento2.botonConfirmar1}" id="botonConfirmar1"
                                                    onClick="#{ElementoSegmentoPorConjuntoSegmento2.gestor.scriptConfirmar}"
                                                    rendered="#{ElementoSegmentoPorConjuntoSegmento2.gestor.funcionCommitHabilitada}" styleClass="pdq-button-1"
                                                    text="#{ElementoSegmentoPorConjuntoSegmento2.gestor.i18n.textoBotonConfirmar}" toolTip="#{ElementoSegmentoPorConjuntoSegmento2.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button actionExpression="#{ElementoSegmentoPorConjuntoSegmento2.botonDescartar1_action}"
                                                    binding="#{ElementoSegmentoPorConjuntoSegmento2.botonDescartar1}" id="botonDescartar1"
                                                    onClick="#{ElementoSegmentoPorConjuntoSegmento2.gestor.scriptDescartar}"
                                                    rendered="#{ElementoSegmentoPorConjuntoSegmento2.gestor.funcionRevertHabilitada}" styleClass="pdq-button-1"
                                                    text="#{ElementoSegmentoPorConjuntoSegmento2.gestor.i18n.textoBotonDescartar}" toolTip="#{ElementoSegmentoPorConjuntoSegmento2.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:button actionExpression="#{ElementoSegmentoPorConjuntoSegmento2.botonRefrescar1_action}"
                                                    binding="#{ElementoSegmentoPorConjuntoSegmento2.botonRefrescar1}"
                                                    disabled="#{ElementoSegmentoPorConjuntoSegmento2.gestor.funcionSelectInhabilitada}" id="botonRefrescar1"
                                                    onClick="#{ElementoSegmentoPorConjuntoSegmento2.gestor.scriptRefrescar}"
                                                    rendered="#{ElementoSegmentoPorConjuntoSegmento2.gestor.funcionSelectHabilitada}" styleClass="pdq-button-1"
                                                    text="#{ElementoSegmentoPorConjuntoSegmento2.gestor.i18n.textoBotonRefrescar}" toolTip="#{ElementoSegmentoPorConjuntoSegmento2.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button actionExpression="#{ElementoSegmentoPorConjuntoSegmento2.botonRetornar1_action}"
                                                    binding="#{ElementoSegmentoPorConjuntoSegmento2.botonRetornar1}"
                                                    disabled="#{ElementoSegmentoPorConjuntoSegmento2.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1" onClick="#{ElementoSegmentoPorConjuntoSegmento2.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{ElementoSegmentoPorConjuntoSegmento2.gestor.funcionReturnVisible}" styleClass="pdq-button-1"
                                                    text="#{ElementoSegmentoPorConjuntoSegmento2.gestor.i18n.textoBotonRetornar}" toolTip="#{ElementoSegmentoPorConjuntoSegmento2.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{ElementoSegmentoPorConjuntoSegmento2.gridPanel119}" columns="1" id="gridPanel119">
                                                <webuijsf:imageHyperlink actionExpression="#{ElementoSegmentoPorConjuntoSegmento2.imageHyperlink1_action}"
                                                    binding="#{ElementoSegmentoPorConjuntoSegmento2.imageHyperlink1}"
                                                    disabled="#{ElementoSegmentoPorConjuntoSegmento2.gestor.funcionOpenLinkInhabilitada}" id="imageHyperlink1"
                                                    imageURL="#{ElementoSegmentoPorConjuntoSegmento2.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{ElementoSegmentoPorConjuntoSegmento2.gestor.scriptAbrirVinculo}"
                                                    rendered="#{ElementoSegmentoPorConjuntoSegmento2.gestor.designing}" styleClass="pdq-hyperlink-1"
                                                    text="Hyperlink1" toolTip="#{bundle.ElementoSegmentoPorConjuntoSegmento2_imageHyperlink1_toolTip}"/>
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
                        <webuijsf:anchor binding="#{ElementoSegmentoPorConjuntoSegmento2.anclaPie1}" id="anclaPie1"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
