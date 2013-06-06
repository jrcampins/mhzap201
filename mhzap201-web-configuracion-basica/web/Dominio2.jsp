<?xml version="1.0" encoding="UTF-8"?>
<!--
   Copyright (C) 2008, EGT Consultores, C.A.
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
                    focus="#{Dominio2.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{Dominio2.gestor.preserveFocus}"
                    preserveScroll="#{Dominio2.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{Dominio2.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | campoIdDominio1 campoCodigoDominio1 campoNombreDominio1 campoDescripcionDominio1 campoNombreTabla1 listaNumeroTipoDominio1 campoIdClaseRecurso1 campoIdFuncionSeleccion1 campoIdDominioSegmento1 campoIdPaquete1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | | , virtualForm3 | listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{Dominio2.breadcrumbs1}" 
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
                                                    rendered="#{Dominio2.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{Dominio2.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{Dominio2.gestor.mensajeDisponible}"
                                                    text="#{Dominio2.gestor.mensaje}"
                                                    url="#{Dominio2.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            id="gridPanel104"
                                            rendered="#{Dominio2.gestor.filaDisponible}"
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
                                                        actionExpression="#{Dominio2.botonIrAlPrimero1_action}"
                                                        binding="#{Dominio2.botonIrAlPrimero1}"
                                                        disabled="#{Dominio2.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero1"
                                                        imageURL="#{Dominio2.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{Dominio2.gestor.scriptIrAlPrimero}"
                                                        text="#{Dominio2.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{Dominio2.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Dominio2.botonIrAlAnterior1_action}"
                                                        binding="#{Dominio2.botonIrAlAnterior1}"
                                                        disabled="#{Dominio2.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior1"
                                                        imageURL="#{Dominio2.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{Dominio2.gestor.scriptIrAlAnterior}"
                                                        text="#{Dominio2.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{Dominio2.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Dominio2.botonIrAlSiguiente1_action}"
                                                        binding="#{Dominio2.botonIrAlSiguiente1}"
                                                        disabled="#{Dominio2.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente1"
                                                        imageURL="#{Dominio2.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{Dominio2.gestor.scriptIrAlSiguiente}"
                                                        text="#{Dominio2.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{Dominio2.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Dominio2.botonIrAlUltimo1_action}"
                                                        binding="#{Dominio2.botonIrAlUltimo1}"
                                                        disabled="#{Dominio2.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo1"
                                                        imageURL="#{Dominio2.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{Dominio2.gestor.scriptIrAlUltimo}"
                                                        text="#{Dominio2.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{Dominio2.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Dominio2.botonProcesarFila1_action}"
                                                        binding="#{Dominio2.botonProcesarFila1}"
                                                        disabled="#{Dominio2.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila1"
                                                        imageURL="#{Dominio2.gestor.urlImagenProcesar}"
                                                        onClick="#{Dominio2.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{Dominio2.asistente.comandoDisponible}"
                                                        text="#{Dominio2.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{Dominio2.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{Dominio2.gestor.tituloConsulta}"/>
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
                                                    binding="#{Dominio2.etiquetaIdentificacionFila1}"
                                                    id="etiquetaIdentificacionFila1"
                                                    text="#{Dominio2.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{Dominio2.gestor.i18n.toolTipEtiquetaIdentificacionFila}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel113"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoIdentificacionFila1"
                                                    style="font-weight: bold"
                                                    text="#{Dominio2.gestor.identificacionFila}"/>
                                                <webuijsf:image
                                                    id="imagenFilaProcesada1"
                                                    toolTip="#{Dominio2.gestor.toolTipImagenFilaProcesada}"
                                                    url="#{Dominio2.gestor.urlImagenFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPanel114"
                                                rendered="#{Dominio2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Dominio2.etiquetaDenominacionFilaMaestro1}"
                                                    id="etiquetaDenominacionFilaMaestro1"
                                                    text="?"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel115"
                                                rendered="#{Dominio2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoDenominacionFilaMaestro1"
                                                    style="font-weight: bold"
                                                    text="#{Dominio2.gestor.denominacionFilaMaestro}"/>
                                                <webuijsf:image
                                                    id="imagenFilaMaestro1"
                                                    url="#{Dominio2.gestor.urlImagenMaestroFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdDominio1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Dominio2.labelIdDominio1}"
                                                    id="labelIdDominio1"
                                                    for="campoIdDominio1"
                                                    toolTip="BundleParametros.id_dominio.dominio"
                                                    text="identificaci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdDominio2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdDominio1"
                                                    binding="#{Dominio2.campoIdDominio1}"
                                                    converter="#{Dominio2.converterIdDominio1}"
                                                    readOnly="#{Dominio2.gestor.filaNoProcesada}" required="true"
                                                    text="#{Dominio2.dominioDataProvider.value['id_dominio']}"
                                                    toolTip="BundleParametros.id_dominio.dominio"
                                                    validatorExpression="#{Dominio2.validatorIdDominio1.validate}"/>
                                                <webuijsf:staticText id="campoIdDominio1Texto1"
                                                    binding="#{Dominio2.campoIdDominio1Texto1}"
                                                    text="#{Dominio2.dominioDataProvider.value['id_dominio']}"/>
                                                <webuijsf:message id="messageIdDominio1"
                                                    for="campoIdDominio1"/>
                                                <webuijsf:helpInline id="helpInlineIdDominio1"
                                                    binding="#{Dominio2.helpInlineIdDominio1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_dominio.dominio"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridCodigoDominio1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Dominio2.labelCodigoDominio1}"
                                                    id="labelCodigoDominio1"
                                                    for="campoCodigoDominio1"
                                                    toolTip="BundleParametros.codigo_dominio.dominio"
                                                    text="c&#243;digo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridCodigoDominio2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoCodigoDominio1"
                                                    binding="#{Dominio2.campoCodigoDominio1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{Dominio2.gestor.filaNoProcesada}" required="true"
                                                    text="#{Dominio2.dominioDataProvider.value['codigo_dominio']}"
                                                    toolTip="BundleParametros.codigo_dominio.dominio"
                                                    validatorExpression="#{Dominio2.validatorCodigoDominio1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoDominio1Texto1"
                                                    binding="#{Dominio2.campoCodigoDominio1Texto1}"
                                                    text="#{Dominio2.dominioDataProvider.value['codigo_dominio']}"/>
                                                <webuijsf:message id="messageCodigoDominio1"
                                                    for="campoCodigoDominio1"/>
                                                <webuijsf:helpInline id="helpInlineCodigoDominio1"
                                                    binding="#{Dominio2.helpInlineCodigoDominio1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.codigo_dominio.dominio"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNombreDominio1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Dominio2.labelNombreDominio1}"
                                                    id="labelNombreDominio1"
                                                    for="campoNombreDominio1"
                                                    toolTip="BundleParametros.nombre_dominio.dominio"
                                                    text="nombre"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNombreDominio2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNombreDominio1"
                                                    binding="#{Dominio2.campoNombreDominio1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{Dominio2.gestor.filaNoProcesada}"
                                                    text="#{Dominio2.dominioDataProvider.value['nombre_dominio']}"
                                                    toolTip="BundleParametros.nombre_dominio.dominio"
                                                    validatorExpression="#{Dominio2.validatorNombreDominio1.validate}"/>
                                                <webuijsf:staticText id="campoNombreDominio1Texto1"
                                                    binding="#{Dominio2.campoNombreDominio1Texto1}"
                                                    text="#{Dominio2.dominioDataProvider.value['nombre_dominio']}"/>
                                                <webuijsf:message id="messageNombreDominio1"
                                                    for="campoNombreDominio1"/>
                                                <webuijsf:helpInline id="helpInlineNombreDominio1"
                                                    binding="#{Dominio2.helpInlineNombreDominio1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.nombre_dominio.dominio"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridDescripcionDominio1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Dominio2.labelDescripcionDominio1}"
                                                    id="labelDescripcionDominio1"
                                                    for="campoDescripcionDominio1"
                                                    toolTip="BundleParametros.descripcion_dominio.dominio"
                                                    text="descripci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridDescripcionDominio2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoDescripcionDominio1"
                                                    binding="#{Dominio2.campoDescripcionDominio1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{Dominio2.gestor.filaNoProcesada}"
                                                    text="#{Dominio2.dominioDataProvider.value['descripcion_dominio']}"
                                                    toolTip="BundleParametros.descripcion_dominio.dominio"
                                                    validatorExpression="#{Dominio2.validatorDescripcionDominio1.validate}"/>
                                                <webuijsf:staticText id="campoDescripcionDominio1Texto1"
                                                    binding="#{Dominio2.campoDescripcionDominio1Texto1}"
                                                    text="#{Dominio2.dominioDataProvider.value['descripcion_dominio']}"/>
                                                <webuijsf:message id="messageDescripcionDominio1"
                                                    for="campoDescripcionDominio1"/>
                                                <webuijsf:helpInline id="helpInlineDescripcionDominio1"
                                                    binding="#{Dominio2.helpInlineDescripcionDominio1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.descripcion_dominio.dominio"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNombreTabla1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Dominio2.labelNombreTabla1}"
                                                    id="labelNombreTabla1"
                                                    for="campoNombreTabla1"
                                                    toolTip="BundleParametros.nombre_tabla.dominio"
                                                    text="nombre tabla"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNombreTabla2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNombreTabla1"
                                                    binding="#{Dominio2.campoNombreTabla1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{Dominio2.gestor.filaNoProcesada}"
                                                    text="#{Dominio2.dominioDataProvider.value['nombre_tabla']}"
                                                    toolTip="BundleParametros.nombre_tabla.dominio"
                                                    validatorExpression="#{Dominio2.validatorNombreTabla1.validate}"/>
                                                <webuijsf:staticText id="campoNombreTabla1Texto1"
                                                    binding="#{Dominio2.campoNombreTabla1Texto1}"
                                                    text="#{Dominio2.dominioDataProvider.value['nombre_tabla']}"/>
                                                <webuijsf:message id="messageNombreTabla1"
                                                    for="campoNombreTabla1"/>
                                                <webuijsf:helpInline id="helpInlineNombreTabla1"
                                                    binding="#{Dominio2.helpInlineNombreTabla1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.nombre_tabla.dominio"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroTipoDominio1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Dominio2.labelNumeroTipoDominio1}"
                                                    id="labelNumeroTipoDominio1"
                                                    for="listaNumeroTipoDominio1"
                                                    toolTip="BundleParametros.numero_tipo_dominio.dominio"
                                                    text="tipo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTipoDominio2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroTipoDominio1"
                                                    binding="#{Dominio2.listaNumeroTipoDominio1}"
                                                    converter="#{Dominio2.converterNumeroTipoDominio1}"
                                                    disabled="#{Dominio2.gestor.filaNoProcesada}" required="true"
                                                    items="#{Dominio2.asistente.opcionesListaNumeroTipoDominio1}"
                                                    selected="#{Dominio2.dominioDataProvider.value['numero_tipo_dominio']}"
                                                    toolTip="BundleParametros.numero_tipo_dominio.dominio"/>
                                                <webuijsf:staticText id="listaNumeroTipoDominio1Texto1"
                                                    binding="#{Dominio2.listaNumeroTipoDominio1Texto1}"
                                                    text="#{Dominio2.dominioDataProvider.value['codigo_tipo_dominio_1x1y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoDominio1"
                                                    for="listaNumeroTipoDominio1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTipoDominio1"
                                                    binding="#{Dominio2.helpInlineNumeroTipoDominio1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_tipo_dominio.dominio"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdClaseRecurso1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Dominio2.labelIdClaseRecurso1}"
                                                    id="labelIdClaseRecurso1"
                                                    for="campoIdClaseRecurso1"
                                                    toolTip="BundleParametros.id_clase_recurso.dominio"
                                                    text="clase recurso"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdClaseRecurso2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdClaseRecurso1"
                                                    binding="#{Dominio2.campoIdClaseRecurso1}"
                                                    readOnly="#{Dominio2.gestor.filaNoProcesada}" required="true"
                                                    text="#{Dominio2.asistente.textoCampoIdClaseRecurso1}"
                                                    toolTip="#{Dominio2.asistente.toolTipCampoIdClaseRecurso1}"
                                                    validatorExpression="#{Dominio2.campoIdClaseRecurso1_validate}"/>
                                                <webuijsf:staticText id="campoIdClaseRecurso1Texto1"
                                                    binding="#{Dominio2.campoIdClaseRecurso1Texto1}"
                                                    text="#{Dominio2.dominioDataProvider.value['codigo_clase_recurso_1x2y3']}"/>
                                                <webuijsf:button id="campoIdClaseRecurso1Boton1"
                                                    binding="#{Dominio2.campoIdClaseRecurso1Boton1}"
                                                    onClick="#{Dominio2.asistente.scriptCampoIdClaseRecurso1Boton1}"/>
                                                <webuijsf:button id="campoIdClaseRecurso1Boton3"
                                                    binding="#{Dominio2.campoIdClaseRecurso1Boton3}"
                                                    onClick="#{Dominio2.asistente.scriptCampoIdClaseRecurso1Boton2}"
                                                    rendered="#{Dominio2.asistente.campoIdClaseRecurso1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdClaseRecurso1"
                                                    for="campoIdClaseRecurso1"/>
                                                <webuijsf:helpInline id="helpInlineIdClaseRecurso1"
                                                    binding="#{Dominio2.helpInlineIdClaseRecurso1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_clase_recurso.dominio"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdClaseRecurso3"
                                                rendered="#{Dominio2.asistente.campoIdClaseRecurso1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Dominio2.labelIdClaseRecurso2}"
                                                    id="labelIdClaseRecurso2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre clase recurso"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdClaseRecurso4"
                                                rendered="#{Dominio2.asistente.campoIdClaseRecurso1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{Dominio2.campoIdClaseRecurso1Texto2}"
                                                    text="#{Dominio2.dominioDataProvider.value['nombre_clase_recurso_1x2y4']}"
                                                    id="campoIdClaseRecurso1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{Dominio2.campoIdClaseRecurso1Boton2}"
                                                    id="campoIdClaseRecurso1Boton2"
                                                    onClick="#{Dominio2.asistente.scriptCampoIdClaseRecurso1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdFuncionSeleccion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Dominio2.labelIdFuncionSeleccion1}"
                                                    id="labelIdFuncionSeleccion1"
                                                    for="campoIdFuncionSeleccion1"
                                                    toolTip="BundleParametros.id_funcion_seleccion.dominio"
                                                    text="funci&#243;n selecci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdFuncionSeleccion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdFuncionSeleccion1"
                                                    binding="#{Dominio2.campoIdFuncionSeleccion1}"
                                                    readOnly="#{Dominio2.gestor.filaNoProcesada}"
                                                    text="#{Dominio2.asistente.textoCampoIdFuncionSeleccion1}"
                                                    toolTip="#{Dominio2.asistente.toolTipCampoIdFuncionSeleccion1}"
                                                    validatorExpression="#{Dominio2.campoIdFuncionSeleccion1_validate}"/>
                                                <webuijsf:staticText id="campoIdFuncionSeleccion1Texto1"
                                                    binding="#{Dominio2.campoIdFuncionSeleccion1Texto1}"
                                                    text="#{Dominio2.dominioDataProvider.value['codigo_funcion_1x3y3']}"/>
                                                <webuijsf:button id="campoIdFuncionSeleccion1Boton1"
                                                    binding="#{Dominio2.campoIdFuncionSeleccion1Boton1}"
                                                    onClick="#{Dominio2.asistente.scriptCampoIdFuncionSeleccion1Boton1}"/>
                                                <webuijsf:button id="campoIdFuncionSeleccion1Boton3"
                                                    binding="#{Dominio2.campoIdFuncionSeleccion1Boton3}"
                                                    onClick="#{Dominio2.asistente.scriptCampoIdFuncionSeleccion1Boton2}"
                                                    rendered="#{Dominio2.asistente.campoIdFuncionSeleccion1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdFuncionSeleccion1"
                                                    for="campoIdFuncionSeleccion1"/>
                                                <webuijsf:helpInline id="helpInlineIdFuncionSeleccion1"
                                                    binding="#{Dominio2.helpInlineIdFuncionSeleccion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_funcion_seleccion.dominio"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdFuncionSeleccion3"
                                                rendered="#{Dominio2.asistente.campoIdFuncionSeleccion1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Dominio2.labelIdFuncionSeleccion2}"
                                                    id="labelIdFuncionSeleccion2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre funci&#243;n selecci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdFuncionSeleccion4"
                                                rendered="#{Dominio2.asistente.campoIdFuncionSeleccion1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{Dominio2.campoIdFuncionSeleccion1Texto2}"
                                                    text="#{Dominio2.dominioDataProvider.value['nombre_funcion_1x3y4']}"
                                                    id="campoIdFuncionSeleccion1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{Dominio2.campoIdFuncionSeleccion1Boton2}"
                                                    id="campoIdFuncionSeleccion1Boton2"
                                                    onClick="#{Dominio2.asistente.scriptCampoIdFuncionSeleccion1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdDominioSegmento1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Dominio2.labelIdDominioSegmento1}"
                                                    id="labelIdDominioSegmento1"
                                                    for="campoIdDominioSegmento1"
                                                    toolTip="BundleParametros.id_dominio_segmento.dominio"
                                                    text="dominio segmento"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdDominioSegmento2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdDominioSegmento1"
                                                    binding="#{Dominio2.campoIdDominioSegmento1}"
                                                    readOnly="#{Dominio2.gestor.filaNoProcesada}"
                                                    text="#{Dominio2.asistente.textoCampoIdDominioSegmento1}"
                                                    toolTip="#{Dominio2.asistente.toolTipCampoIdDominioSegmento1}"
                                                    validatorExpression="#{Dominio2.campoIdDominioSegmento1_validate}"/>
                                                <webuijsf:staticText id="campoIdDominioSegmento1Texto1"
                                                    binding="#{Dominio2.campoIdDominioSegmento1Texto1}"
                                                    text="#{Dominio2.dominioDataProvider.value['codigo_dominio_1x4y3']}"/>
                                                <webuijsf:button id="campoIdDominioSegmento1Boton1"
                                                    binding="#{Dominio2.campoIdDominioSegmento1Boton1}"
                                                    onClick="#{Dominio2.asistente.scriptCampoIdDominioSegmento1Boton1}"/>
                                                <webuijsf:button id="campoIdDominioSegmento1Boton3"
                                                    binding="#{Dominio2.campoIdDominioSegmento1Boton3}"
                                                    onClick="#{Dominio2.asistente.scriptCampoIdDominioSegmento1Boton2}"
                                                    rendered="#{Dominio2.asistente.campoIdDominioSegmento1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdDominioSegmento1"
                                                    for="campoIdDominioSegmento1"/>
                                                <webuijsf:helpInline id="helpInlineIdDominioSegmento1"
                                                    binding="#{Dominio2.helpInlineIdDominioSegmento1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_dominio_segmento.dominio"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdDominioSegmento3"
                                                rendered="#{Dominio2.asistente.campoIdDominioSegmento1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Dominio2.labelIdDominioSegmento2}"
                                                    id="labelIdDominioSegmento2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre dominio segmento"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdDominioSegmento4"
                                                rendered="#{Dominio2.asistente.campoIdDominioSegmento1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{Dominio2.campoIdDominioSegmento1Texto2}"
                                                    text="#{Dominio2.dominioDataProvider.value['nombre_dominio_1x4y4']}"
                                                    id="campoIdDominioSegmento1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{Dominio2.campoIdDominioSegmento1Boton2}"
                                                    id="campoIdDominioSegmento1Boton2"
                                                    onClick="#{Dominio2.asistente.scriptCampoIdDominioSegmento1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdPaquete1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Dominio2.labelIdPaquete1}"
                                                    id="labelIdPaquete1"
                                                    for="campoIdPaquete1"
                                                    toolTip="BundleParametros.id_paquete.dominio"
                                                    text="paquete"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdPaquete2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdPaquete1"
                                                    binding="#{Dominio2.campoIdPaquete1}"
                                                    readOnly="#{Dominio2.gestor.filaNoProcesada}"
                                                    text="#{Dominio2.asistente.textoCampoIdPaquete1}"
                                                    toolTip="#{Dominio2.asistente.toolTipCampoIdPaquete1}"
                                                    validatorExpression="#{Dominio2.campoIdPaquete1_validate}"/>
                                                <webuijsf:staticText id="campoIdPaquete1Texto1"
                                                    binding="#{Dominio2.campoIdPaquete1Texto1}"
                                                    text="#{Dominio2.dominioDataProvider.value['codigo_paquete_1x5y3']}"/>
                                                <webuijsf:button id="campoIdPaquete1Boton1"
                                                    binding="#{Dominio2.campoIdPaquete1Boton1}"
                                                    onClick="#{Dominio2.asistente.scriptCampoIdPaquete1Boton1}"/>
                                                <webuijsf:button id="campoIdPaquete1Boton3"
                                                    binding="#{Dominio2.campoIdPaquete1Boton3}"
                                                    onClick="#{Dominio2.asistente.scriptCampoIdPaquete1Boton2}"
                                                    rendered="#{Dominio2.asistente.campoIdPaquete1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdPaquete1"
                                                    for="campoIdPaquete1"/>
                                                <webuijsf:helpInline id="helpInlineIdPaquete1"
                                                    binding="#{Dominio2.helpInlineIdPaquete1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_paquete.dominio"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdPaquete3"
                                                rendered="#{Dominio2.asistente.campoIdPaquete1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Dominio2.labelIdPaquete2}"
                                                    id="labelIdPaquete2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre paquete"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdPaquete4"
                                                rendered="#{Dominio2.asistente.campoIdPaquete1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{Dominio2.campoIdPaquete1Texto2}"
                                                    id="campoIdPaquete1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{Dominio2.campoIdPaquete1Boton2}"
                                                    id="campoIdPaquete1Boton2"
                                                    onClick="#{Dominio2.asistente.scriptCampoIdPaquete1Boton2}"/>
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
                                                        actionExpression="#{Dominio2.botonIrAlPrimero2_action}"
                                                        binding="#{Dominio2.botonIrAlPrimero2}"
                                                        disabled="#{Dominio2.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero2"
                                                        imageURL="#{Dominio2.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{Dominio2.gestor.scriptIrAlPrimero}"
                                                        text="#{Dominio2.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{Dominio2.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Dominio2.botonIrAlAnterior2_action}"
                                                        binding="#{Dominio2.botonIrAlAnterior2}"
                                                        disabled="#{Dominio2.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior2"
                                                        imageURL="#{Dominio2.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{Dominio2.gestor.scriptIrAlAnterior}"
                                                        text="#{Dominio2.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{Dominio2.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Dominio2.botonIrAlSiguiente2_action}"
                                                        binding="#{Dominio2.botonIrAlSiguiente2}"
                                                        disabled="#{Dominio2.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente2"
                                                        imageURL="#{Dominio2.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{Dominio2.gestor.scriptIrAlSiguiente}"
                                                        text="#{Dominio2.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{Dominio2.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Dominio2.botonIrAlUltimo2_action}"
                                                        binding="#{Dominio2.botonIrAlUltimo2}"
                                                        disabled="#{Dominio2.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo2"
                                                        imageURL="#{Dominio2.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{Dominio2.gestor.scriptIrAlUltimo}"
                                                        text="#{Dominio2.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{Dominio2.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Dominio2.botonProcesarFila2_action}"
                                                        binding="#{Dominio2.botonProcesarFila2}"
                                                        disabled="#{Dominio2.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila2"
                                                        imageURL="#{Dominio2.gestor.urlImagenProcesar}"
                                                        onClick="#{Dominio2.scriptAbrirVentanaProcesarFila2}"
                                                        rendered="#{Dominio2.asistente.comandoDisponible}"
                                                        text="#{Dominio2.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{Dominio2.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{Dominio2.gestor.mensajeCambiosPorConfirmar}"/>
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
                                                    actionExpression="#{Dominio2.botonAgregar1_action}"
                                                    binding="#{Dominio2.botonAgregar1}"
                                                    disabled="#{Dominio2.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{Dominio2.gestor.scriptAgregar}"
                                                    rendered="#{Dominio2.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Dominio2.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{Dominio2.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{Dominio2.listaFuncionEdicion1}"
                                                    converter="#{Dominio2.converterListaFuncionEdicion1}"
                                                    disabled="#{Dominio2.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{Dominio2.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{Dominio2.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{Dominio2.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{Dominio2.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Dominio2.botonEditar1_action}"
                                                    binding="#{Dominio2.botonEditar1}"
                                                    disabled="#{Dominio2.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{Dominio2.gestor.scriptEditar}"
                                                    rendered="#{Dominio2.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Dominio2.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{Dominio2.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Dominio2.botonEliminar1_action}"
                                                    binding="#{Dominio2.botonEliminar1}"
                                                    disabled="#{Dominio2.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{Dominio2.gestor.scriptEliminar}"
                                                    rendered="#{Dominio2.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Dominio2.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{Dominio2.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Dominio2.botonAplicar1_action}"
                                                    binding="#{Dominio2.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{Dominio2.gestor.scriptAplicar}"
                                                    rendered="#{Dominio2.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Dominio2.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{Dominio2.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Dominio2.botonDeshacer1_action}"
                                                    binding="#{Dominio2.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{Dominio2.gestor.scriptDeshacer}"
                                                    rendered="#{Dominio2.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Dominio2.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{Dominio2.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Dominio2.botonConfirmar1_action}"
                                                    binding="#{Dominio2.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{Dominio2.gestor.scriptConfirmar}"
                                                    rendered="#{Dominio2.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Dominio2.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{Dominio2.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Dominio2.botonDescartar1_action}"
                                                    binding="#{Dominio2.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{Dominio2.gestor.scriptDescartar}"
                                                    rendered="#{Dominio2.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Dominio2.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{Dominio2.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{Dominio2.listaFuncionAccion1}"
                                                    converter="#{Dominio2.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{Dominio2.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{Dominio2.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{Dominio2.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{Dominio2.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Dominio2.botonProcesar1_action}"
                                                    binding="#{Dominio2.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{Dominio2.gestor.scriptProcesar}"
                                                    rendered="#{Dominio2.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Dominio2.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{Dominio2.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Dominio2.botonRefrescar1_action}"
                                                    binding="#{Dominio2.botonRefrescar1}"
                                                    disabled="#{Dominio2.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{Dominio2.gestor.scriptRefrescar}"
                                                    rendered="#{Dominio2.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Dominio2.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{Dominio2.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Dominio2.botonReconsultar1_action}"
                                                    binding="#{Dominio2.botonReconsultar1}"
                                                    disabled="#{Dominio2.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{Dominio2.gestor.scriptReconsultar}"
                                                    rendered="#{Dominio2.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Dominio2.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{Dominio2.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Dominio2.botonRetornar1_action}"
                                                    binding="#{Dominio2.botonRetornar1}"
                                                    disabled="#{Dominio2.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{Dominio2.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{Dominio2.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Dominio2.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{Dominio2.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="4" 
                                                id="gridPanel125"
                                                rendered="#{Dominio2.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{Dominio2.imageHyperlink1_action}"
                                                    binding="#{Dominio2.imageHyperlink1}"
                                                    disabled="#{Dominio2.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{Dominio2.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{Dominio2.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.Dominio2_imageHyperlink1_toolTip}"/>
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{Dominio2.imageHyperlink2_action}"
                                                    binding="#{Dominio2.imageHyperlink2}"
                                                    disabled="#{Dominio2.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink2"
                                                    imageURL="#{Dominio2.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{Dominio2.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    text="Hyperlink2"
                                                    toolTip="#{bundle.Dominio2_imageHyperlink2_toolTip}"/>
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{Dominio2.imageHyperlink3_action}"
                                                    binding="#{Dominio2.imageHyperlink3}"
                                                    disabled="#{Dominio2.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink3"
                                                    imageURL="#{Dominio2.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{Dominio2.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    text="Hyperlink3"
                                                    toolTip="#{bundle.Dominio2_imageHyperlink3_toolTip}"/>
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{Dominio2.imageHyperlink4_action}"
                                                    binding="#{Dominio2.imageHyperlink4}"
                                                    disabled="#{Dominio2.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink4"
                                                    imageURL="#{Dominio2.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{Dominio2.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{Dominio2.gestor.designing}"
                                                    text="Hyperlink4"
                                                    toolTip="#{bundle.Dominio2_imageHyperlink4_toolTip}"/>
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
