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
        <webuijsf:page id="page1">
            <webuijsf:html id="html1">
                <webuijsf:head id="head1" title="#{ApplicationBean1.nombreAplicacion}">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                    <webuijsf:script id="script1" url="/resources/javascript1.js"/>
                </webuijsf:head>
                <webuijsf:body id="body1" onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}" onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}" styleClass="pdq-body-1">
                    <webuijsf:form binding="#{GrupoProceso2.form1}" id="form1" virtualFormsConfig="virtualForm1 | campoIdGrupoProceso1 campoCodigoGrupoProceso1 campoNombreGrupoProceso1 campoDescripcionGrupoProceso1 campoIdRastroProceso1 listaNumeroCondicionEjeFun1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | | , virtualForm3 | listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonRefrescar1 botonAgregar1 botonDescartar1 botonRetornar1">
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
                                    <webuijsf:breadcrumbs binding="#{GrupoProceso2.breadcrumbs1}" id="breadcrumbs1" styleClass="pdq-breadcrumbs-1"/>
                                </div>
                                <div class="pos-div-detalle">
                                    <h:panelGrid id="gridPanel101">
                                        <h:panelGrid id="gridPanel102">
                                            <h:panelGrid columns="2" id="gridPanel103">
                                                <webuijsf:image id="imagenMensaje1" url="#{GrupoProceso2.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink align="middle" id="hipervinculoMensaje1" text="#{GrupoProceso2.gestor.mensaje}" url="#{GrupoProceso2.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
<h:panelGrid id="gridPanel104" styleClass="pdq-grid-detalle-1" rendered="#{GrupoProceso2.gestor.filaDisponible}">
<h:panelGrid id="gridPanel201" styleClass="pdq-grid-detalle-cab">
<h:panelGrid id="gridPanel202" columns="2">
                                            <h:panelGrid id="gridPanel105" styleClass="pdq-grid-detalle-botones">
                                                <h:panelGrid columns="4" id="gridPanel106">
                                                    <webuijsf:button actionExpression="#{GrupoProceso2.botonIrAlPrimero1_action}"
                                                        binding="#{GrupoProceso2.botonIrAlPrimero1}" disabled="#{GrupoProceso2.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero1" imageURL="#{GrupoProceso2.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{GrupoProceso2.gestor.scriptIrAlPrimero}"
                                                        text="#{GrupoProceso2.gestor.i18n.textoBotonIrAlPrimero}" toolTip="#{GrupoProceso2.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button actionExpression="#{GrupoProceso2.botonIrAlAnterior1_action}"
                                                        binding="#{GrupoProceso2.botonIrAlAnterior1}" disabled="#{GrupoProceso2.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior1" imageURL="#{GrupoProceso2.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{GrupoProceso2.gestor.scriptIrAlAnterior}"
                                                        text="#{GrupoProceso2.gestor.i18n.textoBotonIrAlAnterior}" toolTip="#{GrupoProceso2.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button actionExpression="#{GrupoProceso2.botonIrAlSiguiente1_action}"
                                                        binding="#{GrupoProceso2.botonIrAlSiguiente1}" disabled="#{GrupoProceso2.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente1" imageURL="#{GrupoProceso2.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{GrupoProceso2.gestor.scriptIrAlSiguiente}"
                                                        text="#{GrupoProceso2.gestor.i18n.textoBotonIrAlSiguiente}" toolTip="#{GrupoProceso2.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button actionExpression="#{GrupoProceso2.botonIrAlUltimo1_action}"
                                                        binding="#{GrupoProceso2.botonIrAlUltimo1}" disabled="#{GrupoProceso2.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo1" imageURL="#{GrupoProceso2.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{GrupoProceso2.gestor.scriptIrAlUltimo}"
                                                        text="#{GrupoProceso2.gestor.i18n.textoBotonIrAlUltimo}" toolTip="#{GrupoProceso2.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid id="gridPanel107" styleClass="pdq-grid-detalle-mensajes">
                                                <h:panelGrid id="gridPanel108" styleClass="pdq-grid-detalle-mensajes-2">
                                                    <webuijsf:staticText id="textoTituloConsulta1" styleClass="pdq-text-titulo-1" text="#{GrupoProceso2.gestor.tituloConsulta}"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
</h:panelGrid><!--gridPanel202-->
</h:panelGrid><!--gridPanel201-->
<h:panelGrid id="gridPanel203" columns="2">
                                            <h:panelGrid id="gridPanel109" styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label binding="#{GrupoProceso2.etiquetaIdentificacionFila1}" id="etiquetaIdentificacionFila1"
                                                    text="#{GrupoProceso2.gestor.i18n.textoEtiquetaIdentificacionFila}" toolTip="#{GrupoProceso2.gestor.i18n.toolTipEtiquetaIdentificacionFila}"/>
                                            </h:panelGrid>
                                            <h:panelGrid columns="5" id="gridPanel110" styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText id="textoIdentificacionFila1" style="font-weight: bold" text="#{GrupoProceso2.gestor.identificacionFila}"/>
                                                <webuijsf:image id="imagenFilaProcesada1" toolTip="#{GrupoProceso2.gestor.toolTipImagenFilaProcesada}" url="#{GrupoProceso2.gestor.urlImagenFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid id="gridPanel111" rendered="#{GrupoProceso2.gestor.paginaConsultaConMaestro}" styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label binding="#{GrupoProceso2.etiquetaDenominacionFilaMaestro1}"
                                                    id="etiquetaDenominacionFilaMaestro1" text="?"/>
                                            </h:panelGrid>
                                            <h:panelGrid columns="5" id="gridPanel112" rendered="#{GrupoProceso2.gestor.paginaConsultaConMaestro}" styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText id="textoDenominacionFilaMaestro1" style="font-weight: bold" text="#{GrupoProceso2.gestor.denominacionFilaMaestro}"/>
                                                <webuijsf:image id="imagenFilaMaestro1" url="#{GrupoProceso2.gestor.urlImagenMaestroFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid id="gridIdGrupoProceso1" styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label binding="#{GrupoProceso2.labelIdGrupoProceso1}" for="campoIdGrupoProceso1"
                                                    id="labelIdGrupoProceso1" text="id"/>
                                            </h:panelGrid>
                                            <h:panelGrid columns="5" id="gridIdGrupoProceso2" styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField binding="#{GrupoProceso2.campoIdGrupoProceso1}"
                                                    converter="#{GrupoProceso2.converterIdGrupoProceso1}" id="campoIdGrupoProceso1"
                                                    readOnly="#{GrupoProceso2.gestor.filaNoProcesada}"
                                                    text="#{GrupoProceso2.grupoProcesoDataProvider.value['id_grupo_proceso']}" validatorExpression="#{GrupoProceso2.validatorIdGrupoProceso1.validate}"/>
                                                <webuijsf:staticText binding="#{GrupoProceso2.campoIdGrupoProceso1Texto1}" id="campoIdGrupoProceso1Texto1"/>
                                                <webuijsf:message for="campoIdGrupoProceso1" id="messageIdGrupoProceso1"/>
                                                <webuijsf:helpInline binding="#{GrupoProceso2.helpInlineIdGrupoProceso1}" id="helpInlineIdGrupoProceso1"
                                                    styleClass="pdq-helpInline-field" text="BundleParametros.id_grupo_proceso" type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid id="gridCodigoGrupoProceso1" styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label binding="#{GrupoProceso2.labelCodigoGrupoProceso1}" for="campoCodigoGrupoProceso1"
                                                    id="labelCodigoGrupoProceso1" text="codigo"/>
                                            </h:panelGrid>
                                            <h:panelGrid columns="5" id="gridCodigoGrupoProceso2" styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField binding="#{GrupoProceso2.campoCodigoGrupoProceso1}" columns="20"
                                                    id="campoCodigoGrupoProceso1" maxLength="30" readOnly="#{GrupoProceso2.gestor.filaNoProcesada}"
                                                    required="true" text="#{GrupoProceso2.grupoProcesoDataProvider.value['codigo_grupo_proceso']}" validatorExpression="#{GrupoProceso2.validatorCodigoGrupoProceso1.validate}"/>
                                                <webuijsf:staticText binding="#{GrupoProceso2.campoCodigoGrupoProceso1Texto1}" id="campoCodigoGrupoProceso1Texto1"/>
                                                <webuijsf:message for="campoCodigoGrupoProceso1" id="messageCodigoGrupoProceso1"/>
                                                <webuijsf:helpInline binding="#{GrupoProceso2.helpInlineCodigoGrupoProceso1}" id="helpInlineCodigoGrupoProceso1"
                                                    styleClass="pdq-helpInline-field" text="BundleParametros.codigo_grupo_proceso" type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid id="gridNombreGrupoProceso1" styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label binding="#{GrupoProceso2.labelNombreGrupoProceso1}" for="campoNombreGrupoProceso1"
                                                    id="labelNombreGrupoProceso1" text="nombre"/>
                                            </h:panelGrid>
                                            <h:panelGrid columns="5" id="gridNombreGrupoProceso2" styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField binding="#{GrupoProceso2.campoNombreGrupoProceso1}" columns="50"
                                                    id="campoNombreGrupoProceso1" maxLength="100" readOnly="#{GrupoProceso2.gestor.filaNoProcesada}"
                                                    text="#{GrupoProceso2.grupoProcesoDataProvider.value['nombre_grupo_proceso']}" validatorExpression="#{GrupoProceso2.validatorNombreGrupoProceso1.validate}"/>
                                                <webuijsf:staticText binding="#{GrupoProceso2.campoNombreGrupoProceso1Texto1}" id="campoNombreGrupoProceso1Texto1"/>
                                                <webuijsf:message for="campoNombreGrupoProceso1" id="messageNombreGrupoProceso1"/>
                                                <webuijsf:helpInline binding="#{GrupoProceso2.helpInlineNombreGrupoProceso1}" id="helpInlineNombreGrupoProceso1"
                                                    styleClass="pdq-helpInline-field" text="BundleParametros.nombre_grupo_proceso" type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid id="gridDescripcionGrupoProceso1" styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label binding="#{GrupoProceso2.labelDescripcionGrupoProceso1}" for="campoDescripcionGrupoProceso1"
                                                    id="labelDescripcionGrupoProceso1" text="descripcion"/>
                                            </h:panelGrid>
                                            <h:panelGrid columns="5" id="gridDescripcionGrupoProceso2" styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea binding="#{GrupoProceso2.campoDescripcionGrupoProceso1}" columns="100"
                                                    id="campoDescripcionGrupoProceso1" readOnly="#{GrupoProceso2.gestor.filaNoProcesada}" rows="3"
                                                    text="#{GrupoProceso2.grupoProcesoDataProvider.value['descripcion_grupo_proceso']}" validatorExpression="#{GrupoProceso2.validatorDescripcionGrupoProceso1.validate}"/>
                                                <webuijsf:staticText binding="#{GrupoProceso2.campoDescripcionGrupoProceso1Texto1}" id="campoDescripcionGrupoProceso1Texto1"/>
                                                <webuijsf:message for="campoDescripcionGrupoProceso1" id="messageDescripcionGrupoProceso1"/>
                                                <webuijsf:helpInline binding="#{GrupoProceso2.helpInlineDescripcionGrupoProceso1}"
                                                    id="helpInlineDescripcionGrupoProceso1" styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.descripcion_grupo_proceso" type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid id="gridIdRastroProceso1" styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label binding="#{GrupoProceso2.labelIdRastroProceso1}" for="campoIdRastroProceso1"
                                                    id="labelIdRastroProceso1" text="ejecución"/>
                                            </h:panelGrid>
                                            <h:panelGrid columns="5" id="gridIdRastroProceso2" styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField binding="#{GrupoProceso2.campoIdRastroProceso1}"
                                                    converter="#{GrupoProceso2.converterIdRastroProceso1}" id="campoIdRastroProceso1"
                                                    readOnly="#{GrupoProceso2.gestor.filaNoProcesada}"
                                                    text="#{GrupoProceso2.grupoProcesoDataProvider.value['id_rastro_proceso']}" validatorExpression="#{GrupoProceso2.validatorIdRastroProceso1.validate}"/>
                                                <webuijsf:staticText binding="#{GrupoProceso2.campoIdRastroProceso1Texto1}" id="campoIdRastroProceso1Texto1"/>
                                                <webuijsf:message for="campoIdRastroProceso1" id="messageIdRastroProceso1"/>
                                                <webuijsf:helpInline binding="#{GrupoProceso2.helpInlineIdRastroProceso1}" id="helpInlineIdRastroProceso1"
                                                    styleClass="pdq-helpInline-field" text="BundleParametros.id_rastro_proceso" type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid id="gridNumeroCondicionEjeFun1" styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label binding="#{GrupoProceso2.labelNumeroCondicionEjeFun1}"
                                                    for="listaNumeroCondicionEjeFun1" id="labelNumeroCondicionEjeFun1" text="condición"/>
                                            </h:panelGrid>
                                            <h:panelGrid columns="5" id="gridNumeroCondicionEjeFun2" styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown binding="#{GrupoProceso2.listaNumeroCondicionEjeFun1}"
                                                    converter="#{GrupoProceso2.converterNumeroCondicionEjeFun1}"
                                                    disabled="#{GrupoProceso2.gestor.filaNoProcesada}" id="listaNumeroCondicionEjeFun1"
                                                    items="#{GrupoProceso2.asistente.opcionesListaNumeroCondicionEjeFun1}" selected="#{GrupoProceso2.grupoProcesoDataProvider.value['numero_condicion_eje_fun']}"/>
                                                <webuijsf:staticText binding="#{GrupoProceso2.listaNumeroCondicionEjeFun1Texto1}"
                                                    id="listaNumeroCondicionEjeFun1Texto1" text="#{GrupoProceso2.grupoProcesoDataProvider.value['codigo_condicion_eje_fun_1x1y2']}"/>
                                                <webuijsf:message for="listaNumeroCondicionEjeFun1" id="messageNumeroCondicionEjeFun1"/>
                                                <webuijsf:helpInline binding="#{GrupoProceso2.helpInlineNumeroCondicionEjeFun1}"
                                                    id="helpInlineNumeroCondicionEjeFun1" styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_condicion_eje_fun" type="field"/>
                                            </h:panelGrid>
</h:panelGrid><!--gridPanel203-->
<h:panelGrid  id="gridPanel204" styleClass="pdq-grid-detalle-pie">
<h:panelGrid  id="gridPanel205" columns="2">
                                            <h:panelGrid id="gridPanel113" styleClass="pdq-grid-detalle-botones">
                                                <h:panelGrid columns="4" id="gridPanel114">
                                                    <webuijsf:button actionExpression="#{GrupoProceso2.botonIrAlPrimero2_action}"
                                                        binding="#{GrupoProceso2.botonIrAlPrimero2}" disabled="#{GrupoProceso2.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero2" imageURL="#{GrupoProceso2.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{GrupoProceso2.gestor.scriptIrAlPrimero}"
                                                        text="#{GrupoProceso2.gestor.i18n.textoBotonIrAlPrimero}" toolTip="#{GrupoProceso2.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button actionExpression="#{GrupoProceso2.botonIrAlAnterior2_action}"
                                                        binding="#{GrupoProceso2.botonIrAlAnterior2}" disabled="#{GrupoProceso2.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior2" imageURL="#{GrupoProceso2.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{GrupoProceso2.gestor.scriptIrAlAnterior}"
                                                        text="#{GrupoProceso2.gestor.i18n.textoBotonIrAlAnterior}" toolTip="#{GrupoProceso2.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button actionExpression="#{GrupoProceso2.botonIrAlSiguiente2_action}"
                                                        binding="#{GrupoProceso2.botonIrAlSiguiente2}" disabled="#{GrupoProceso2.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente2" imageURL="#{GrupoProceso2.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{GrupoProceso2.gestor.scriptIrAlSiguiente}"
                                                        text="#{GrupoProceso2.gestor.i18n.textoBotonIrAlSiguiente}" toolTip="#{GrupoProceso2.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button actionExpression="#{GrupoProceso2.botonIrAlUltimo2_action}"
                                                        binding="#{GrupoProceso2.botonIrAlUltimo2}" disabled="#{GrupoProceso2.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo2" imageURL="#{GrupoProceso2.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{GrupoProceso2.gestor.scriptIrAlUltimo}"
                                                        text="#{GrupoProceso2.gestor.i18n.textoBotonIrAlUltimo}" toolTip="#{GrupoProceso2.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid id="gridPanel115" styleClass="pdq-grid-detalle-mensajes">
                                                <webuijsf:staticText id="textoMensajeCambiosPorConfirmar1" style="font-weight: bold" text="#{GrupoProceso2.gestor.mensajeCambiosPorConfirmar}"/>
                                            </h:panelGrid>
</h:panelGrid><!--gridPanel205-->
</h:panelGrid><!--gridPanel204-->
</h:panelGrid><!--gridPanel104-->
                                        <h:panelGrid id="gridPanel116">
                                            <h:panelGrid id="gridPanel117">
                                                <webuijsf:anchor id="anchor1"/>
                                            </h:panelGrid>
                                            <h:panelGrid columns="12" id="gridPanel118">
                                                <webuijsf:button actionExpression="#{GrupoProceso2.botonAgregar1_action}"
                                                    binding="#{GrupoProceso2.botonAgregar1}" disabled="#{GrupoProceso2.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1" onClick="#{GrupoProceso2.gestor.scriptAgregar}"
                                                    rendered="#{GrupoProceso2.gestor.funcionInsertHabilitada}" styleClass="pdq-button-1"
                                                    text="#{GrupoProceso2.gestor.i18n.textoBotonAgregar}" toolTip="#{GrupoProceso2.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown binding="#{GrupoProceso2.listaFuncionEdicion1}"
                                                    converter="#{GrupoProceso2.converterListaFuncionEdicion1}" disabled="#{GrupoProceso2.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1" items="#{GrupoProceso2.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{GrupoProceso2.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{GrupoProceso2.gestor.funcionEdicionSeleccionada}" toolTip="#{GrupoProceso2.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button actionExpression="#{GrupoProceso2.botonEditar1_action}" binding="#{GrupoProceso2.botonEditar1}"
                                                    disabled="#{GrupoProceso2.gestor.funcionUpdateInhabilitada}" id="botonEditar1"
                                                    onClick="#{GrupoProceso2.gestor.scriptEditar}" rendered="#{GrupoProceso2.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1" text="#{GrupoProceso2.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}" toolTip="#{GrupoProceso2.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button actionExpression="#{GrupoProceso2.botonEliminar1_action}"
                                                    binding="#{GrupoProceso2.botonEliminar1}" disabled="#{GrupoProceso2.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1" onClick="#{GrupoProceso2.gestor.scriptEliminar}"
                                                    rendered="#{GrupoProceso2.gestor.funcionDeleteHabilitada}" styleClass="pdq-button-1"
                                                    text="#{GrupoProceso2.gestor.i18n.textoBotonEliminar}" toolTip="#{GrupoProceso2.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button actionExpression="#{GrupoProceso2.botonAplicar1_action}"
                                                    binding="#{GrupoProceso2.botonAplicar1}" id="botonAplicar1" onClick="#{GrupoProceso2.gestor.scriptAplicar}"
                                                    rendered="#{GrupoProceso2.gestor.funcionCheckChangesHabilitada}" styleClass="pdq-button-1"
                                                    text="#{GrupoProceso2.gestor.i18n.textoBotonAplicar}" toolTip="#{GrupoProceso2.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button actionExpression="#{GrupoProceso2.botonDeshacer1_action}"
                                                    binding="#{GrupoProceso2.botonDeshacer1}" id="botonDeshacer1"
                                                    onClick="#{GrupoProceso2.gestor.scriptDeshacer}"
                                                    rendered="#{GrupoProceso2.gestor.funcionCancelUpdateHabilitada}" styleClass="pdq-button-1"
                                                    text="#{GrupoProceso2.gestor.i18n.textoBotonDeshacer}" toolTip="#{GrupoProceso2.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button actionExpression="#{GrupoProceso2.botonConfirmar1_action}"
                                                    binding="#{GrupoProceso2.botonConfirmar1}" id="botonConfirmar1"
                                                    onClick="#{GrupoProceso2.gestor.scriptConfirmar}" rendered="#{GrupoProceso2.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1" text="#{GrupoProceso2.gestor.i18n.textoBotonConfirmar}" toolTip="#{GrupoProceso2.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button actionExpression="#{GrupoProceso2.botonDescartar1_action}"
                                                    binding="#{GrupoProceso2.botonDescartar1}" id="botonDescartar1"
                                                    onClick="#{GrupoProceso2.gestor.scriptDescartar}" rendered="#{GrupoProceso2.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1" text="#{GrupoProceso2.gestor.i18n.textoBotonDescartar}" toolTip="#{GrupoProceso2.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown binding="#{GrupoProceso2.listaFuncionAccion1}"
                                                    converter="#{GrupoProceso2.converterListaFuncionAccion1}" id="listaFuncionAccion1"
                                                    items="#{GrupoProceso2.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{GrupoProceso2.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{GrupoProceso2.gestor.funcionAccionSeleccionada}" toolTip="#{GrupoProceso2.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button actionExpression="#{GrupoProceso2.botonProcesar1_action}"
                                                    binding="#{GrupoProceso2.botonProcesar1}" id="botonProcesar1"
                                                    onClick="#{GrupoProceso2.gestor.scriptProcesar}" rendered="#{GrupoProceso2.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1" text="#{GrupoProceso2.gestor.i18n.textoBotonProcesar}" toolTip="#{GrupoProceso2.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button actionExpression="#{GrupoProceso2.botonRefrescar1_action}"
                                                    binding="#{GrupoProceso2.botonRefrescar1}" disabled="#{GrupoProceso2.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1" onClick="#{GrupoProceso2.gestor.scriptRefrescar}"
                                                    rendered="#{GrupoProceso2.gestor.funcionSelectHabilitada}" styleClass="pdq-button-1"
                                                    text="#{GrupoProceso2.gestor.i18n.textoBotonRefrescar}" toolTip="#{GrupoProceso2.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button actionExpression="#{GrupoProceso2.botonRetornar1_action}"
                                                    binding="#{GrupoProceso2.botonRetornar1}"
                                                    disabled="#{GrupoProceso2.gestor.funcionReturnFilaEscogidaInhabilitada}" id="botonRetornar1"
                                                    onClick="#{GrupoProceso2.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{GrupoProceso2.gestor.funcionReturnVisible}" styleClass="pdq-button-1"
                                                    text="#{GrupoProceso2.gestor.i18n.textoBotonRetornar}" toolTip="#{GrupoProceso2.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid columns="1" id="gridPanel119">
                                                <webuijsf:imageHyperlink actionExpression="#{GrupoProceso2.imageHyperlink1_action}"
                                                    binding="#{GrupoProceso2.imageHyperlink1}" disabled="#{GrupoProceso2.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1" imageURL="#{GrupoProceso2.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{GrupoProceso2.gestor.scriptAbrirVinculo}" rendered="#{GrupoProceso2.gestor.designing}"
                                                    styleClass="pdq-hyperlink-1" text="Hyperlink1" toolTip="#{bundle.GrupoProceso2_imageHyperlink1_toolTip}"/>
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
