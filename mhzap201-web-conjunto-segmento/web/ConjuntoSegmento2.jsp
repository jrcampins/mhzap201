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
        <webuijsf:page binding="#{ConjuntoSegmento2.page1}" id="page1">
            <webuijsf:html binding="#{ConjuntoSegmento2.html1}" id="html1">
                <webuijsf:head binding="#{ConjuntoSegmento2.head1}" id="head1" title="#{ApplicationBean1.nombreAplicacion}">
                    <webuijsf:link binding="#{ConjuntoSegmento2.link1}" id="link1" url="/resources/stylesheet.css"/>
                    <webuijsf:script binding="#{ConjuntoSegmento2.script1}" id="script1" url="/resources/javascript1.js"/>
                </webuijsf:head>
                <webuijsf:body binding="#{ConjuntoSegmento2.body1}" id="body1" onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}" onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}" styleClass="pdq-body-1">
                    <webuijsf:form binding="#{ConjuntoSegmento2.form1}" id="form1" virtualFormsConfig="virtualForm1 | campoIdConjuntoSegmento1 campoCodigoConjuntoSegmento1 campoNombreConjuntoSegmento1 campoDescripcionConjuntoSegmento1 campoIdClaseRecurso1 listaFuncionEdicion1 | , virtualForm2 | | , virtualForm3 | listaFuncionEdicion1 | listaFuncionEdicion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonRefrescar1 botonAgregar1 botonDescartar1 botonRetornar1">
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
                                    <webuijsf:breadcrumbs binding="#{ConjuntoSegmento2.breadcrumbs1}" id="breadcrumbs1" styleClass="pdq-breadcrumbs-1"/>
                                </div>
                                <div class="pos-div-detalle">
                                    <h:panelGrid binding="#{ConjuntoSegmento2.gridPanel101}" id="gridPanel101">
                                        <h:panelGrid binding="#{ConjuntoSegmento2.gridPanel102}" id="gridPanel102">
                                            <h:panelGrid binding="#{ConjuntoSegmento2.gridPanel103}" columns="2" id="gridPanel103">
                                                <webuijsf:image binding="#{ConjuntoSegmento2.imagenMensaje1}" id="imagenMensaje1" url="#{ConjuntoSegmento2.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink align="middle" binding="#{ConjuntoSegmento2.hipervinculoMensaje1}"
                                                    id="hipervinculoMensaje1" text="#{ConjuntoSegmento2.gestor.mensaje}" url="#{ConjuntoSegmento2.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
<h:panelGrid id="gridPanel104" styleClass="pdq-grid-detalle-1" binding="#{ConjuntoSegmento2.gridPanel104}" rendered="#{ConjuntoSegmento2.gestor.filaDisponible}">
<h:panelGrid id="gridPanel201" styleClass="pdq-grid-detalle-cab">
<h:panelGrid id="gridPanel202" columns="2">
                                            <h:panelGrid binding="#{ConjuntoSegmento2.gridPanel105}" id="gridPanel105" styleClass="pdq-grid-detalle-botones">
                                                <h:panelGrid binding="#{ConjuntoSegmento2.gridPanel106}" columns="4" id="gridPanel106">
                                                    <webuijsf:button actionExpression="#{ConjuntoSegmento2.botonIrAlPrimero1_action}"
                                                        binding="#{ConjuntoSegmento2.botonIrAlPrimero1}" disabled="#{ConjuntoSegmento2.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero1" imageURL="#{ConjuntoSegmento2.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{ConjuntoSegmento2.gestor.scriptIrAlPrimero}"
                                                        text="#{ConjuntoSegmento2.gestor.i18n.textoBotonIrAlPrimero}" toolTip="#{ConjuntoSegmento2.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button actionExpression="#{ConjuntoSegmento2.botonIrAlAnterior1_action}"
                                                        binding="#{ConjuntoSegmento2.botonIrAlAnterior1}" disabled="#{ConjuntoSegmento2.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior1" imageURL="#{ConjuntoSegmento2.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{ConjuntoSegmento2.gestor.scriptIrAlAnterior}"
                                                        text="#{ConjuntoSegmento2.gestor.i18n.textoBotonIrAlAnterior}" toolTip="#{ConjuntoSegmento2.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button actionExpression="#{ConjuntoSegmento2.botonIrAlSiguiente1_action}"
                                                        binding="#{ConjuntoSegmento2.botonIrAlSiguiente1}" disabled="#{ConjuntoSegmento2.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente1" imageURL="#{ConjuntoSegmento2.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{ConjuntoSegmento2.gestor.scriptIrAlSiguiente}"
                                                        text="#{ConjuntoSegmento2.gestor.i18n.textoBotonIrAlSiguiente}" toolTip="#{ConjuntoSegmento2.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button actionExpression="#{ConjuntoSegmento2.botonIrAlUltimo1_action}"
                                                        binding="#{ConjuntoSegmento2.botonIrAlUltimo1}" disabled="#{ConjuntoSegmento2.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo1" imageURL="#{ConjuntoSegmento2.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{ConjuntoSegmento2.gestor.scriptIrAlUltimo}"
                                                        text="#{ConjuntoSegmento2.gestor.i18n.textoBotonIrAlUltimo}" toolTip="#{ConjuntoSegmento2.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{ConjuntoSegmento2.gridPanel107}" id="gridPanel107" styleClass="pdq-grid-detalle-mensajes">
                                                <h:panelGrid binding="#{ConjuntoSegmento2.gridPanel108}" id="gridPanel108" styleClass="pdq-grid-detalle-mensajes-2">
                                                    <webuijsf:staticText binding="#{ConjuntoSegmento2.textoTituloConsulta1}" id="textoTituloConsulta1"
                                                        styleClass="pdq-text-titulo-1" text="#{ConjuntoSegmento2.gestor.tituloConsulta}"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
</h:panelGrid><!--gridPanel202-->
</h:panelGrid><!--gridPanel201-->
<h:panelGrid id="gridPanel203" columns="2">
                                            <h:panelGrid binding="#{ConjuntoSegmento2.gridPanel109}" id="gridPanel109" styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label binding="#{ConjuntoSegmento2.etiquetaIdentificacionFila1}" id="etiquetaIdentificacionFila1"
                                                    text="#{ConjuntoSegmento2.gestor.i18n.textoEtiquetaIdentificacionFila}" toolTip="#{ConjuntoSegmento2.gestor.i18n.toolTipEtiquetaIdentificacionFila}"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{ConjuntoSegmento2.gridPanel110}" columns="5" id="gridPanel110" styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText binding="#{ConjuntoSegmento2.textoIdentificacionFila1}" id="textoIdentificacionFila1"
                                                    style="font-weight: bold" text="#{ConjuntoSegmento2.gestor.identificacionFila}"/>
                                                <webuijsf:image binding="#{ConjuntoSegmento2.imagenFilaProcesada1}" id="imagenFilaProcesada1"
                                                    toolTip="#{ConjuntoSegmento2.gestor.toolTipImagenFilaProcesada}" url="#{ConjuntoSegmento2.gestor.urlImagenFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{ConjuntoSegmento2.gridPanel111}" id="gridPanel111"
                                                rendered="#{ConjuntoSegmento2.gestor.paginaConsultaConMaestro}" styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label binding="#{ConjuntoSegmento2.etiquetaDenominacionFilaMaestro1}"
                                                    id="etiquetaDenominacionFilaMaestro1" text="?"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{ConjuntoSegmento2.gridPanel112}" columns="5" id="gridPanel112"
                                                rendered="#{ConjuntoSegmento2.gestor.paginaConsultaConMaestro}" styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText binding="#{ConjuntoSegmento2.textoDenominacionFilaMaestro1}"
                                                    id="textoDenominacionFilaMaestro1" style="font-weight: bold" text="#{ConjuntoSegmento2.gestor.denominacionFilaMaestro}"/>
                                                <webuijsf:image binding="#{ConjuntoSegmento2.imagenFilaMaestro1}" id="imagenFilaMaestro1" url="#{ConjuntoSegmento2.gestor.urlImagenMaestroFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{ConjuntoSegmento2.gridIdConjuntoSegmento1}" id="gridIdConjuntoSegmento1" rendered="false" styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label binding="#{ConjuntoSegmento2.labelIdConjuntoSegmento1}" for="campoIdConjuntoSegmento1"
                                                    id="labelIdConjuntoSegmento1" text="id"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{ConjuntoSegmento2.gridIdConjuntoSegmento2}" columns="5" id="gridIdConjuntoSegmento2"
                                                rendered="false" styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField binding="#{ConjuntoSegmento2.campoIdConjuntoSegmento1}"
                                                    converter="#{ConjuntoSegmento2.converterIdConjuntoSegmento1}" id="campoIdConjuntoSegmento1"
                                                    readOnly="#{ConjuntoSegmento2.gestor.filaNoProcesada}"
                                                    text="#{ConjuntoSegmento2.conjuntoSegmentoDataProvider.value['id_conjunto_segmento']}" validatorExpression="#{ConjuntoSegmento2.validatorIdConjuntoSegmento1.validate}"/>
                                                <webuijsf:staticText binding="#{ConjuntoSegmento2.campoIdConjuntoSegmento1Texto1}" id="campoIdConjuntoSegmento1Texto1"/>
                                                <webuijsf:message binding="#{ConjuntoSegmento2.messageIdConjuntoSegmento1}" for="campoIdConjuntoSegmento1" id="messageIdConjuntoSegmento1"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{ConjuntoSegmento2.gridCodigoConjuntoSegmento1}" id="gridCodigoConjuntoSegmento1" styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label binding="#{ConjuntoSegmento2.labelCodigoConjuntoSegmento1}" for="campoCodigoConjuntoSegmento1"
                                                    id="labelCodigoConjuntoSegmento1" text="codigo"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{ConjuntoSegmento2.gridCodigoConjuntoSegmento2}" columns="5" id="gridCodigoConjuntoSegmento2" styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField binding="#{ConjuntoSegmento2.campoCodigoConjuntoSegmento1}" columns="20"
                                                    id="campoCodigoConjuntoSegmento1" maxLength="30" readOnly="#{ConjuntoSegmento2.gestor.filaNoProcesada}"
                                                    required="true" text="#{ConjuntoSegmento2.conjuntoSegmentoDataProvider.value['codigo_conjunto_segmento']}" validatorExpression="#{ConjuntoSegmento2.validatorCodigoConjuntoSegmento1.validate}"/>
                                                <webuijsf:staticText binding="#{ConjuntoSegmento2.campoCodigoConjuntoSegmento1Texto1}" id="campoCodigoConjuntoSegmento1Texto1"/>
                                                <webuijsf:message binding="#{ConjuntoSegmento2.messageCodigoConjuntoSegmento1}"
                                                    for="campoCodigoConjuntoSegmento1" id="messageCodigoConjuntoSegmento1"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{ConjuntoSegmento2.gridNombreConjuntoSegmento1}" id="gridNombreConjuntoSegmento1" styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label binding="#{ConjuntoSegmento2.labelNombreConjuntoSegmento1}" for="campoNombreConjuntoSegmento1"
                                                    id="labelNombreConjuntoSegmento1" text="nombre"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{ConjuntoSegmento2.gridNombreConjuntoSegmento2}" columns="5" id="gridNombreConjuntoSegmento2" styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField binding="#{ConjuntoSegmento2.campoNombreConjuntoSegmento1}" columns="50"
                                                    id="campoNombreConjuntoSegmento1" maxLength="100" readOnly="#{ConjuntoSegmento2.gestor.filaNoProcesada}"
                                                    text="#{ConjuntoSegmento2.conjuntoSegmentoDataProvider.value['nombre_conjunto_segmento']}" validatorExpression="#{ConjuntoSegmento2.validatorNombreConjuntoSegmento1.validate}"/>
                                                <webuijsf:staticText binding="#{ConjuntoSegmento2.campoNombreConjuntoSegmento1Texto1}" id="campoNombreConjuntoSegmento1Texto1"/>
                                                <webuijsf:message binding="#{ConjuntoSegmento2.messageNombreConjuntoSegmento1}"
                                                    for="campoNombreConjuntoSegmento1" id="messageNombreConjuntoSegmento1"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{ConjuntoSegmento2.gridDescripcionConjuntoSegmento1}" id="gridDescripcionConjuntoSegmento1" styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label binding="#{ConjuntoSegmento2.labelDescripcionConjuntoSegmento1}"
                                                    for="campoDescripcionConjuntoSegmento1" id="labelDescripcionConjuntoSegmento1" text="descripcion"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{ConjuntoSegmento2.gridDescripcionConjuntoSegmento2}" columns="5"
                                                id="gridDescripcionConjuntoSegmento2" styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea binding="#{ConjuntoSegmento2.campoDescripcionConjuntoSegmento1}" columns="100"
                                                    id="campoDescripcionConjuntoSegmento1" readOnly="#{ConjuntoSegmento2.gestor.filaNoProcesada}" rows="3"
                                                    text="#{ConjuntoSegmento2.conjuntoSegmentoDataProvider.value['descripcion_conjunto_segmento']}" validatorExpression="#{ConjuntoSegmento2.validatorDescripcionConjuntoSegmento1.validate}"/>
                                                <webuijsf:staticText binding="#{ConjuntoSegmento2.campoDescripcionConjuntoSegmento1Texto1}" id="campoDescripcionConjuntoSegmento1Texto1"/>
                                                <webuijsf:message binding="#{ConjuntoSegmento2.messageDescripcionConjuntoSegmento1}"
                                                    for="campoDescripcionConjuntoSegmento1" id="messageDescripcionConjuntoSegmento1"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{ConjuntoSegmento2.gridIdClaseRecurso1}" id="gridIdClaseRecurso1" styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label binding="#{ConjuntoSegmento2.labelIdClaseRecurso1}" for="campoIdClaseRecurso1"
                                                    id="labelIdClaseRecurso1" text="clase recurso"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{ConjuntoSegmento2.gridIdClaseRecurso2}" columns="5" id="gridIdClaseRecurso2" styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField binding="#{ConjuntoSegmento2.campoIdClaseRecurso1}" id="campoIdClaseRecurso1"
                                                    readOnly="#{ConjuntoSegmento2.gestor.filaNoCreada}" required="true"
                                                    text="#{ConjuntoSegmento2.asistente.textoCampoIdClaseRecurso1}"
                                                    toolTip="#{ConjuntoSegmento2.asistente.toolTipCampoIdClaseRecurso1}" validatorExpression="#{ConjuntoSegmento2.campoIdClaseRecurso1_validate}"/>
                                                <webuijsf:staticText binding="#{ConjuntoSegmento2.campoIdClaseRecurso1Texto1}" id="campoIdClaseRecurso1Texto1" text="#{ConjuntoSegmento2.conjuntoSegmentoDataProvider.value['codigo_clase_recurso_1x1y3']}"/>
                                                <webuijsf:button binding="#{ConjuntoSegmento2.campoIdClaseRecurso1Boton1}" id="campoIdClaseRecurso1Boton1" onClick="#{ConjuntoSegmento2.asistente.scriptCampoIdClaseRecurso1Boton1}"/>
                                                <webuijsf:message binding="#{ConjuntoSegmento2.messageIdClaseRecurso1}" for="campoIdClaseRecurso1" id="messageIdClaseRecurso1"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{ConjuntoSegmento2.gridIdClaseRecurso3}" id="gridIdClaseRecurso3" styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label binding="#{ConjuntoSegmento2.labelIdClaseRecurso2}" id="labelIdClaseRecurso2"
                                                    styleClass="pdq-estilo-id-2" text="nombre clase recurso"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{ConjuntoSegmento2.gridIdClaseRecurso4}" columns="5" id="gridIdClaseRecurso4" styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText binding="#{ConjuntoSegmento2.campoIdClaseRecurso1Texto2}" id="campoIdClaseRecurso1Texto2" text="#{ConjuntoSegmento2.conjuntoSegmentoDataProvider.value['nombre_clase_recurso_1x1y4']}"/>
                                                <webuijsf:button binding="#{ConjuntoSegmento2.campoIdClaseRecurso1Boton2}" id="campoIdClaseRecurso1Boton2" onClick="#{ConjuntoSegmento2.asistente.scriptCampoIdClaseRecurso1Boton2}"/>
                                            </h:panelGrid>
</h:panelGrid><!--gridPanel203-->
<h:panelGrid  id="gridPanel204" styleClass="pdq-grid-detalle-pie">
<h:panelGrid  id="gridPanel205" columns="2">
                                            <h:panelGrid binding="#{ConjuntoSegmento2.gridPanel113}" id="gridPanel113" styleClass="pdq-grid-detalle-botones">
                                                <h:panelGrid binding="#{ConjuntoSegmento2.gridPanel114}" columns="4" id="gridPanel114">
                                                    <webuijsf:button actionExpression="#{ConjuntoSegmento2.botonIrAlPrimero2_action}"
                                                        binding="#{ConjuntoSegmento2.botonIrAlPrimero2}" disabled="#{ConjuntoSegmento2.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero2" imageURL="#{ConjuntoSegmento2.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{ConjuntoSegmento2.gestor.scriptIrAlPrimero}"
                                                        text="#{ConjuntoSegmento2.gestor.i18n.textoBotonIrAlPrimero}" toolTip="#{ConjuntoSegmento2.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button actionExpression="#{ConjuntoSegmento2.botonIrAlAnterior2_action}"
                                                        binding="#{ConjuntoSegmento2.botonIrAlAnterior2}" disabled="#{ConjuntoSegmento2.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior2" imageURL="#{ConjuntoSegmento2.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{ConjuntoSegmento2.gestor.scriptIrAlAnterior}"
                                                        text="#{ConjuntoSegmento2.gestor.i18n.textoBotonIrAlAnterior}" toolTip="#{ConjuntoSegmento2.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button actionExpression="#{ConjuntoSegmento2.botonIrAlSiguiente2_action}"
                                                        binding="#{ConjuntoSegmento2.botonIrAlSiguiente2}" disabled="#{ConjuntoSegmento2.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente2" imageURL="#{ConjuntoSegmento2.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{ConjuntoSegmento2.gestor.scriptIrAlSiguiente}"
                                                        text="#{ConjuntoSegmento2.gestor.i18n.textoBotonIrAlSiguiente}" toolTip="#{ConjuntoSegmento2.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button actionExpression="#{ConjuntoSegmento2.botonIrAlUltimo2_action}"
                                                        binding="#{ConjuntoSegmento2.botonIrAlUltimo2}" disabled="#{ConjuntoSegmento2.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo2" imageURL="#{ConjuntoSegmento2.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{ConjuntoSegmento2.gestor.scriptIrAlUltimo}"
                                                        text="#{ConjuntoSegmento2.gestor.i18n.textoBotonIrAlUltimo}" toolTip="#{ConjuntoSegmento2.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{ConjuntoSegmento2.gridPanel115}" id="gridPanel115" styleClass="pdq-grid-detalle-mensajes">
                                                <webuijsf:staticText binding="#{ConjuntoSegmento2.textoMensajeCambiosPorConfirmar1}"
                                                    id="textoMensajeCambiosPorConfirmar1" style="font-weight: bold" text="#{ConjuntoSegmento2.gestor.mensajeCambiosPorConfirmar}"/>
                                            </h:panelGrid>
</h:panelGrid><!--gridPanel205-->
</h:panelGrid><!--gridPanel204-->
</h:panelGrid><!--gridPanel104-->
                                        <h:panelGrid binding="#{ConjuntoSegmento2.gridPanel116}" id="gridPanel116">
                                            <h:panelGrid binding="#{ConjuntoSegmento2.gridPanel117}" id="gridPanel117">
                                                <webuijsf:anchor binding="#{ConjuntoSegmento2.anchor1}" id="anchor1"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{ConjuntoSegmento2.gridPanel118}" columns="10" id="gridPanel118">
                                                <webuijsf:button actionExpression="#{ConjuntoSegmento2.botonAgregar1_action}"
                                                    binding="#{ConjuntoSegmento2.botonAgregar1}"
                                                    disabled="#{ConjuntoSegmento2.gestor.funcionInsertInhabilitada}" id="botonAgregar1"
                                                    onClick="#{ConjuntoSegmento2.gestor.scriptAgregar}"
                                                    rendered="#{ConjuntoSegmento2.gestor.funcionInsertHabilitada}" styleClass="pdq-button-1"
                                                    text="#{ConjuntoSegmento2.gestor.i18n.textoBotonAgregar}" toolTip="#{ConjuntoSegmento2.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown binding="#{ConjuntoSegmento2.listaFuncionEdicion1}"
                                                    converter="#{ConjuntoSegmento2.converterListaFuncionEdicion1}"
                                                    disabled="#{ConjuntoSegmento2.gestor.loteConCambios}" id="listaFuncionEdicion1"
                                                    items="#{ConjuntoSegmento2.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{ConjuntoSegmento2.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{ConjuntoSegmento2.gestor.funcionEdicionSeleccionada}" toolTip="#{ConjuntoSegmento2.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button actionExpression="#{ConjuntoSegmento2.botonEditar1_action}"
                                                    binding="#{ConjuntoSegmento2.botonEditar1}" disabled="#{ConjuntoSegmento2.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1" onClick="#{ConjuntoSegmento2.gestor.scriptEditar}"
                                                    rendered="#{ConjuntoSegmento2.gestor.funcionUpdateHabilitada}" styleClass="pdq-button-1"
                                                    text="#{ConjuntoSegmento2.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}" toolTip="#{ConjuntoSegmento2.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button actionExpression="#{ConjuntoSegmento2.botonEliminar1_action}"
                                                    binding="#{ConjuntoSegmento2.botonEliminar1}"
                                                    disabled="#{ConjuntoSegmento2.gestor.funcionDeleteInhabilitada}" id="botonEliminar1"
                                                    onClick="#{ConjuntoSegmento2.gestor.scriptEliminar}"
                                                    rendered="#{ConjuntoSegmento2.gestor.funcionDeleteHabilitada}" styleClass="pdq-button-1"
                                                    text="#{ConjuntoSegmento2.gestor.i18n.textoBotonEliminar}" toolTip="#{ConjuntoSegmento2.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button actionExpression="#{ConjuntoSegmento2.botonAplicar1_action}"
                                                    binding="#{ConjuntoSegmento2.botonAplicar1}" id="botonAplicar1"
                                                    onClick="#{ConjuntoSegmento2.gestor.scriptAplicar}"
                                                    rendered="#{ConjuntoSegmento2.gestor.funcionCheckChangesHabilitada}" styleClass="pdq-button-1"
                                                    text="#{ConjuntoSegmento2.gestor.i18n.textoBotonAplicar}" toolTip="#{ConjuntoSegmento2.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button actionExpression="#{ConjuntoSegmento2.botonDeshacer1_action}"
                                                    binding="#{ConjuntoSegmento2.botonDeshacer1}" id="botonDeshacer1"
                                                    onClick="#{ConjuntoSegmento2.gestor.scriptDeshacer}"
                                                    rendered="#{ConjuntoSegmento2.gestor.funcionCancelUpdateHabilitada}" styleClass="pdq-button-1"
                                                    text="#{ConjuntoSegmento2.gestor.i18n.textoBotonDeshacer}" toolTip="#{ConjuntoSegmento2.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button actionExpression="#{ConjuntoSegmento2.botonConfirmar1_action}"
                                                    binding="#{ConjuntoSegmento2.botonConfirmar1}" id="botonConfirmar1"
                                                    onClick="#{ConjuntoSegmento2.gestor.scriptConfirmar}"
                                                    rendered="#{ConjuntoSegmento2.gestor.funcionCommitHabilitada}" styleClass="pdq-button-1"
                                                    text="#{ConjuntoSegmento2.gestor.i18n.textoBotonConfirmar}" toolTip="#{ConjuntoSegmento2.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button actionExpression="#{ConjuntoSegmento2.botonDescartar1_action}"
                                                    binding="#{ConjuntoSegmento2.botonDescartar1}" id="botonDescartar1"
                                                    onClick="#{ConjuntoSegmento2.gestor.scriptDescartar}"
                                                    rendered="#{ConjuntoSegmento2.gestor.funcionRevertHabilitada}" styleClass="pdq-button-1"
                                                    text="#{ConjuntoSegmento2.gestor.i18n.textoBotonDescartar}" toolTip="#{ConjuntoSegmento2.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:button actionExpression="#{ConjuntoSegmento2.botonRefrescar1_action}"
                                                    binding="#{ConjuntoSegmento2.botonRefrescar1}"
                                                    disabled="#{ConjuntoSegmento2.gestor.funcionSelectInhabilitada}" id="botonRefrescar1"
                                                    onClick="#{ConjuntoSegmento2.gestor.scriptRefrescar}"
                                                    rendered="#{ConjuntoSegmento2.gestor.funcionSelectHabilitada}" styleClass="pdq-button-1"
                                                    text="#{ConjuntoSegmento2.gestor.i18n.textoBotonRefrescar}" toolTip="#{ConjuntoSegmento2.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button actionExpression="#{ConjuntoSegmento2.botonRetornar1_action}"
                                                    binding="#{ConjuntoSegmento2.botonRetornar1}"
                                                    disabled="#{ConjuntoSegmento2.gestor.funcionReturnFilaEscogidaInhabilitada}" id="botonRetornar1"
                                                    onClick="#{ConjuntoSegmento2.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{ConjuntoSegmento2.gestor.funcionReturnVisible}" styleClass="pdq-button-1"
                                                    text="#{ConjuntoSegmento2.gestor.i18n.textoBotonRetornar}" toolTip="#{ConjuntoSegmento2.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{ConjuntoSegmento2.gridPanel119}" columns="2" id="gridPanel119">
                                                <webuijsf:imageHyperlink actionExpression="#{ConjuntoSegmento2.imageHyperlink1_action}"
                                                    binding="#{ConjuntoSegmento2.imageHyperlink1}"
                                                    disabled="#{ConjuntoSegmento2.gestor.funcionOpenLinkInhabilitada}" id="imageHyperlink1"
                                                    imageURL="#{ConjuntoSegmento2.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{ConjuntoSegmento2.gestor.scriptAbrirVinculo}" styleClass="pdq-hyperlink-1" text="Hyperlink1" toolTip="#{bundle.ConjuntoSegmento2_imageHyperlink1_toolTip}"/>
                                                <webuijsf:imageHyperlink actionExpression="#{ConjuntoSegmento2.imageHyperlink2_action}"
                                                    binding="#{ConjuntoSegmento2.imageHyperlink2}"
                                                    disabled="#{ConjuntoSegmento2.gestor.funcionOpenLinkInhabilitada}" id="imageHyperlink2"
                                                    imageURL="#{ConjuntoSegmento2.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{ConjuntoSegmento2.gestor.scriptAbrirVinculo}" rendered="#{ConjuntoSegmento2.gestor.designing}"
                                                    styleClass="pdq-hyperlink-1" text="Hyperlink2" toolTip="#{bundle.ConjuntoSegmento2_imageHyperlink2_toolTip}"/>
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
                        <webuijsf:anchor binding="#{ConjuntoSegmento2.anclaPie1}" id="anclaPie1"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
