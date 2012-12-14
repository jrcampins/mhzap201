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
                    focus="#{ObjecionElePen6.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{ObjecionElePen6.gestor.preserveFocus}"
                    preserveScroll="#{ObjecionElePen6.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{ObjecionElePen6.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | campoIdObjecionElePen1 campoIdPersona1 campoIdProveedorDatExt1 listaNumeroTipoObjElePen1 listaEsObjecionElePenInactiva1 campoFechaUltimaActualizacion1 campoNombreArchivoUltimaAct1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | | , virtualForm3 | listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{ObjecionElePen6.breadcrumbs1}" 
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
                                                    rendered="#{ObjecionElePen6.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{ObjecionElePen6.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{ObjecionElePen6.gestor.mensajeDisponible}"
                                                    text="#{ObjecionElePen6.gestor.mensaje}"
                                                    url="#{ObjecionElePen6.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            id="gridPanel104"
                                            rendered="#{ObjecionElePen6.gestor.filaDisponible}"
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
                                                        actionExpression="#{ObjecionElePen6.botonIrAlPrimero1_action}"
                                                        binding="#{ObjecionElePen6.botonIrAlPrimero1}"
                                                        disabled="#{ObjecionElePen6.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero1"
                                                        imageURL="#{ObjecionElePen6.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{ObjecionElePen6.gestor.scriptIrAlPrimero}"
                                                        text="#{ObjecionElePen6.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{ObjecionElePen6.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{ObjecionElePen6.botonIrAlAnterior1_action}"
                                                        binding="#{ObjecionElePen6.botonIrAlAnterior1}"
                                                        disabled="#{ObjecionElePen6.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior1"
                                                        imageURL="#{ObjecionElePen6.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{ObjecionElePen6.gestor.scriptIrAlAnterior}"
                                                        text="#{ObjecionElePen6.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{ObjecionElePen6.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{ObjecionElePen6.botonIrAlSiguiente1_action}"
                                                        binding="#{ObjecionElePen6.botonIrAlSiguiente1}"
                                                        disabled="#{ObjecionElePen6.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente1"
                                                        imageURL="#{ObjecionElePen6.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{ObjecionElePen6.gestor.scriptIrAlSiguiente}"
                                                        text="#{ObjecionElePen6.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{ObjecionElePen6.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{ObjecionElePen6.botonIrAlUltimo1_action}"
                                                        binding="#{ObjecionElePen6.botonIrAlUltimo1}"
                                                        disabled="#{ObjecionElePen6.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo1"
                                                        imageURL="#{ObjecionElePen6.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{ObjecionElePen6.gestor.scriptIrAlUltimo}"
                                                        text="#{ObjecionElePen6.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{ObjecionElePen6.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{ObjecionElePen6.botonProcesarFila1_action}"
                                                        binding="#{ObjecionElePen6.botonProcesarFila1}"
                                                        disabled="#{ObjecionElePen6.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila1"
                                                        imageURL="#{ObjecionElePen6.gestor.urlImagenProcesar}"
                                                        onClick="#{ObjecionElePen6.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{ObjecionElePen6.asistente.comandoDisponible}"
                                                        text="#{ObjecionElePen6.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{ObjecionElePen6.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{ObjecionElePen6.gestor.tituloConsulta}"/>
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
                                                    binding="#{ObjecionElePen6.etiquetaIdentificacionFila1}"
                                                    id="etiquetaIdentificacionFila1"
                                                    text="#{ObjecionElePen6.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{ObjecionElePen6.gestor.i18n.toolTipEtiquetaIdentificacionFila}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel113"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoIdentificacionFila1"
                                                    style="font-weight: bold"
                                                    text="#{ObjecionElePen6.gestor.identificacionFila}"/>
                                                <webuijsf:image
                                                    id="imagenFilaProcesada1"
                                                    toolTip="#{ObjecionElePen6.gestor.toolTipImagenFilaProcesada}"
                                                    url="#{ObjecionElePen6.gestor.urlImagenFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPanel114"
                                                rendered="#{ObjecionElePen6.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ObjecionElePen6.etiquetaDenominacionFilaMaestro1}"
                                                    id="etiquetaDenominacionFilaMaestro1"
                                                    text="?"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel115"
                                                rendered="#{ObjecionElePen6.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoDenominacionFilaMaestro1"
                                                    style="font-weight: bold"
                                                    text="#{ObjecionElePen6.gestor.denominacionFilaMaestro}"/>
                                                <webuijsf:image
                                                    id="imagenFilaMaestro1"
                                                    url="#{ObjecionElePen6.gestor.urlImagenMaestroFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdObjecionElePen1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ObjecionElePen6.labelIdObjecionElePen1}"
                                                    id="labelIdObjecionElePen1"
                                                    for="campoIdObjecionElePen1"
                                                    text="identificaci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdObjecionElePen2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdObjecionElePen1"
                                                    binding="#{ObjecionElePen6.campoIdObjecionElePen1}"
                                                    converter="#{ObjecionElePen6.converterIdObjecionElePen1}"
                                                    readOnly="true"
                                                    text="#{ObjecionElePen6.objecionElePenDataProvider.value['id_objecion_ele_pen']}"
                                                    toolTip="BundleParametros.id_objecion_ele_pen.objecion_ele_pen"
                                                    validatorExpression="#{ObjecionElePen6.validatorIdObjecionElePen1.validate}"/>
                                                <webuijsf:staticText id="campoIdObjecionElePen1Texto1"
                                                    binding="#{ObjecionElePen6.campoIdObjecionElePen1Texto1}"
                                                    text="#{ObjecionElePen6.objecionElePenDataProvider.value['id_objecion_ele_pen']}"/>
                                                <webuijsf:message id="messageIdObjecionElePen1"
                                                    for="campoIdObjecionElePen1"/>
                                                <webuijsf:helpInline id="helpInlineIdObjecionElePen1"
                                                    binding="#{ObjecionElePen6.helpInlineIdObjecionElePen1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_objecion_ele_pen.objecion_ele_pen"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdPersona1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ObjecionElePen6.labelIdPersona1}"
                                                    id="labelIdPersona1"
                                                    for="campoIdPersona1"
                                                    text="persona"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdPersona2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdPersona1"
                                                    binding="#{ObjecionElePen6.campoIdPersona1}"
                                                    readOnly="#{ObjecionElePen6.gestor.filaNoProcesada}" required="true"
                                                    text="#{ObjecionElePen6.asistente.textoCampoIdPersona1}"
                                                    toolTip="#{ObjecionElePen6.asistente.toolTipCampoIdPersona1}"
                                                    validatorExpression="#{ObjecionElePen6.campoIdPersona1_validate}"/>
                                                <webuijsf:staticText id="campoIdPersona1Texto1"
                                                    binding="#{ObjecionElePen6.campoIdPersona1Texto1}"
                                                    text="#{ObjecionElePen6.objecionElePenDataProvider.value['codigo_persona_1x1y3']}"/>
                                                <webuijsf:button id="campoIdPersona1Boton1"
                                                    binding="#{ObjecionElePen6.campoIdPersona1Boton1}"
                                                    onClick="#{ObjecionElePen6.asistente.scriptCampoIdPersona1Boton1}"/>
                                                <webuijsf:button id="campoIdPersona1Boton3"
                                                    binding="#{ObjecionElePen6.campoIdPersona1Boton3}"
                                                    onClick="#{ObjecionElePen6.asistente.scriptCampoIdPersona1Boton2}"
                                                    rendered="#{ObjecionElePen6.asistente.campoIdPersona1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdPersona1"
                                                    for="campoIdPersona1"/>
                                                <webuijsf:helpInline id="helpInlineIdPersona1"
                                                    binding="#{ObjecionElePen6.helpInlineIdPersona1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_persona.objecion_ele_pen"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdPersona3"
                                                rendered="#{ObjecionElePen6.asistente.campoIdPersona1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ObjecionElePen6.labelIdPersona2}"
                                                    id="labelIdPersona2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre persona"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdPersona4"
                                                rendered="#{ObjecionElePen6.asistente.campoIdPersona1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{ObjecionElePen6.campoIdPersona1Texto2}"
                                                    text="#{ObjecionElePen6.objecionElePenDataProvider.value['nombre_persona_1x1y4']}"
                                                    id="campoIdPersona1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{ObjecionElePen6.campoIdPersona1Boton2}"
                                                    id="campoIdPersona1Boton2"
                                                    onClick="#{ObjecionElePen6.asistente.scriptCampoIdPersona1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdProveedorDatExt1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ObjecionElePen6.labelIdProveedorDatExt1}"
                                                    id="labelIdProveedorDatExt1"
                                                    for="campoIdProveedorDatExt1"
                                                    text="proveedor datos externos"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdProveedorDatExt2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdProveedorDatExt1"
                                                    binding="#{ObjecionElePen6.campoIdProveedorDatExt1}"
                                                    readOnly="#{ObjecionElePen6.gestor.filaNoProcesada}" required="true"
                                                    text="#{ObjecionElePen6.asistente.textoCampoIdProveedorDatExt1}"
                                                    toolTip="#{ObjecionElePen6.asistente.toolTipCampoIdProveedorDatExt1}"
                                                    validatorExpression="#{ObjecionElePen6.campoIdProveedorDatExt1_validate}"/>
                                                <webuijsf:staticText id="campoIdProveedorDatExt1Texto1"
                                                    binding="#{ObjecionElePen6.campoIdProveedorDatExt1Texto1}"
                                                    text="#{ObjecionElePen6.objecionElePenDataProvider.value['codigo_proveedor_dat_ext_1x2y3']}"/>
                                                <webuijsf:button id="campoIdProveedorDatExt1Boton1"
                                                    binding="#{ObjecionElePen6.campoIdProveedorDatExt1Boton1}"
                                                    onClick="#{ObjecionElePen6.asistente.scriptCampoIdProveedorDatExt1Boton1}"/>
                                                <webuijsf:button id="campoIdProveedorDatExt1Boton3"
                                                    binding="#{ObjecionElePen6.campoIdProveedorDatExt1Boton3}"
                                                    onClick="#{ObjecionElePen6.asistente.scriptCampoIdProveedorDatExt1Boton2}"
                                                    rendered="#{ObjecionElePen6.asistente.campoIdProveedorDatExt1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdProveedorDatExt1"
                                                    for="campoIdProveedorDatExt1"/>
                                                <webuijsf:helpInline id="helpInlineIdProveedorDatExt1"
                                                    binding="#{ObjecionElePen6.helpInlineIdProveedorDatExt1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_proveedor_dat_ext.objecion_ele_pen"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdProveedorDatExt3"
                                                rendered="#{ObjecionElePen6.asistente.campoIdProveedorDatExt1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ObjecionElePen6.labelIdProveedorDatExt2}"
                                                    id="labelIdProveedorDatExt2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre proveedor datos externos"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdProveedorDatExt4"
                                                rendered="#{ObjecionElePen6.asistente.campoIdProveedorDatExt1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{ObjecionElePen6.campoIdProveedorDatExt1Texto2}"
                                                    text="#{ObjecionElePen6.objecionElePenDataProvider.value['nombre_proveedor_dat_ext_1x2y4']}"
                                                    id="campoIdProveedorDatExt1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{ObjecionElePen6.campoIdProveedorDatExt1Boton2}"
                                                    id="campoIdProveedorDatExt1Boton2"
                                                    onClick="#{ObjecionElePen6.asistente.scriptCampoIdProveedorDatExt1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroTipoObjElePen1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ObjecionElePen6.labelNumeroTipoObjElePen1}"
                                                    id="labelNumeroTipoObjElePen1"
                                                    for="listaNumeroTipoObjElePen1"
                                                    text="tipo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTipoObjElePen2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroTipoObjElePen1"
                                                    binding="#{ObjecionElePen6.listaNumeroTipoObjElePen1}"
                                                    converter="#{ObjecionElePen6.converterNumeroTipoObjElePen1}"
                                                    disabled="#{ObjecionElePen6.gestor.filaNoProcesada}" required="true"
                                                    items="#{ObjecionElePen6.asistente.opcionesListaNumeroTipoObjElePen1}"
                                                    selected="#{ObjecionElePen6.objecionElePenDataProvider.value['numero_tipo_obj_ele_pen']}"
                                                    toolTip="BundleParametros.numero_tipo_obj_ele_pen.objecion_ele_pen"/>
                                                <webuijsf:staticText id="listaNumeroTipoObjElePen1Texto1"
                                                    binding="#{ObjecionElePen6.listaNumeroTipoObjElePen1Texto1}"
                                                    text="#{ObjecionElePen6.objecionElePenDataProvider.value['codigo_tipo_obj_ele_pen_1x3y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoObjElePen1"
                                                    for="listaNumeroTipoObjElePen1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTipoObjElePen1"
                                                    binding="#{ObjecionElePen6.helpInlineNumeroTipoObjElePen1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_tipo_obj_ele_pen.objecion_ele_pen"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsObjecionElePenInactiva1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ObjecionElePen6.labelEsObjecionElePenInactiva1}"
                                                    id="labelEsObjecionElePenInactiva1"
                                                    for="listaEsObjecionElePenInactiva1"
                                                    text="inactiva"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsObjecionElePenInactiva2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsObjecionElePenInactiva1"
                                                    binding="#{ObjecionElePen6.listaEsObjecionElePenInactiva1}"
                                                    converter="#{ObjecionElePen6.converterEsObjecionElePenInactiva1}"
                                                    disabled="#{ObjecionElePen6.gestor.filaNoProcesada}" required="true"
                                                    items="#{ObjecionElePen6.asistente.opcionesListaEsObjecionElePenInactiva1}"
                                                    selected="#{ObjecionElePen6.objecionElePenDataProvider.value['es_objecion_ele_pen_inactiva']}"
                                                    toolTip="BundleParametros.es_objecion_ele_pen_inactiva.objecion_ele_pen"/>
                                                <webuijsf:staticText id="listaEsObjecionElePenInactiva1Texto1"
                                                    binding="#{ObjecionElePen6.listaEsObjecionElePenInactiva1Texto1}"/>
                                                <webuijsf:message id="messageEsObjecionElePenInactiva1"
                                                    for="listaEsObjecionElePenInactiva1"/>
                                                <webuijsf:helpInline id="helpInlineEsObjecionElePenInactiva1"
                                                    binding="#{ObjecionElePen6.helpInlineEsObjecionElePenInactiva1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_objecion_ele_pen_inactiva.objecion_ele_pen"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaUltimaActualizacion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ObjecionElePen6.labelFechaUltimaActualizacion1}"
                                                    id="labelFechaUltimaActualizacion1"
                                                    for="campoFechaUltimaActualizacion1"
                                                    text="fecha ultima actualizaci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaUltimaActualizacion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaUltimaActualizacion1"
                                                    binding="#{ObjecionElePen6.campoFechaUltimaActualizacion1}"
                                                    maxDate="#{ObjecionElePen6.gestor.defaultMaxDate}"
                                                    minDate="#{ObjecionElePen6.gestor.defaultMinDate}"
                                                    readOnly="#{ObjecionElePen6.gestor.filaNoProcesada}"
                                                    selectedDate="#{ObjecionElePen6.objecionElePenDataProvider.value['fecha_ultima_actualizacion']}"
                                                    toolTip="BundleParametros.fecha_ultima_actualizacion.objecion_ele_pen"/>
                                                <webuijsf:staticText id="campoFechaUltimaActualizacion1Texto1"
                                                    binding="#{ObjecionElePen6.campoFechaUltimaActualizacion1Texto1}"
                                                    converter="#{ObjecionElePen6.converterFechaUltimaActualizacion1}"
                                                    text="#{ObjecionElePen6.objecionElePenDataProvider.value['fecha_ultima_actualizacion']}"/>
                                                <webuijsf:message id="messageFechaUltimaActualizacion1"
                                                    for="campoFechaUltimaActualizacion1"/>
                                                <webuijsf:helpInline id="helpInlineFechaUltimaActualizacion1"
                                                    binding="#{ObjecionElePen6.helpInlineFechaUltimaActualizacion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_ultima_actualizacion.objecion_ele_pen"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNombreArchivoUltimaAct1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{ObjecionElePen6.labelNombreArchivoUltimaAct1}"
                                                    id="labelNombreArchivoUltimaAct1"
                                                    for="campoNombreArchivoUltimaAct1"
                                                    text="nombre archivo ultima actualizaci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNombreArchivoUltimaAct2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoNombreArchivoUltimaAct1"
                                                    binding="#{ObjecionElePen6.campoNombreArchivoUltimaAct1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{ObjecionElePen6.gestor.filaNoProcesada}"
                                                    text="#{ObjecionElePen6.objecionElePenDataProvider.value['nombre_archivo_ultima_act']}"
                                                    toolTip="BundleParametros.nombre_archivo_ultima_act.objecion_ele_pen"
                                                    validatorExpression="#{ObjecionElePen6.validatorNombreArchivoUltimaAct1.validate}"/>
                                                <webuijsf:staticText id="campoNombreArchivoUltimaAct1Texto1"
                                                    binding="#{ObjecionElePen6.campoNombreArchivoUltimaAct1Texto1}"
                                                    text="#{ObjecionElePen6.objecionElePenDataProvider.value['nombre_archivo_ultima_act']}"/>
                                                <webuijsf:button id="campoNombreArchivoUltimaAct1Boton3"
                                                    binding="#{ObjecionElePen6.campoNombreArchivoUltimaAct1Boton3}"
                                                    onClick="#{ObjecionElePen6.asistente.scriptCampoNombreArchivoUltimaAct1Boton3}"
                                                    rendered="#{ObjecionElePen6.asistente.campoNombreArchivoUltimaAct1Boton3Rendered}"
                                                    text="#{ObjecionElePen6.asistente.textCampoNombreArchivoUltimaAct1Boton3}"
                                                    toolTip="#{ObjecionElePen6.asistente.toolTipCampoNombreArchivoUltimaAct1Boton3}"/>
                                                <webuijsf:message id="messageNombreArchivoUltimaAct1"
                                                    for="campoNombreArchivoUltimaAct1"/>
                                                <webuijsf:helpInline id="helpInlineNombreArchivoUltimaAct1"
                                                    binding="#{ObjecionElePen6.helpInlineNombreArchivoUltimaAct1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.nombre_archivo_ultima_act.objecion_ele_pen"
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
                                                        actionExpression="#{ObjecionElePen6.botonIrAlPrimero2_action}"
                                                        binding="#{ObjecionElePen6.botonIrAlPrimero2}"
                                                        disabled="#{ObjecionElePen6.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero2"
                                                        imageURL="#{ObjecionElePen6.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{ObjecionElePen6.gestor.scriptIrAlPrimero}"
                                                        text="#{ObjecionElePen6.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{ObjecionElePen6.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{ObjecionElePen6.botonIrAlAnterior2_action}"
                                                        binding="#{ObjecionElePen6.botonIrAlAnterior2}"
                                                        disabled="#{ObjecionElePen6.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior2"
                                                        imageURL="#{ObjecionElePen6.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{ObjecionElePen6.gestor.scriptIrAlAnterior}"
                                                        text="#{ObjecionElePen6.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{ObjecionElePen6.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{ObjecionElePen6.botonIrAlSiguiente2_action}"
                                                        binding="#{ObjecionElePen6.botonIrAlSiguiente2}"
                                                        disabled="#{ObjecionElePen6.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente2"
                                                        imageURL="#{ObjecionElePen6.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{ObjecionElePen6.gestor.scriptIrAlSiguiente}"
                                                        text="#{ObjecionElePen6.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{ObjecionElePen6.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{ObjecionElePen6.botonIrAlUltimo2_action}"
                                                        binding="#{ObjecionElePen6.botonIrAlUltimo2}"
                                                        disabled="#{ObjecionElePen6.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo2"
                                                        imageURL="#{ObjecionElePen6.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{ObjecionElePen6.gestor.scriptIrAlUltimo}"
                                                        text="#{ObjecionElePen6.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{ObjecionElePen6.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{ObjecionElePen6.botonProcesarFila2_action}"
                                                        binding="#{ObjecionElePen6.botonProcesarFila2}"
                                                        disabled="#{ObjecionElePen6.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila2"
                                                        imageURL="#{ObjecionElePen6.gestor.urlImagenProcesar}"
                                                        onClick="#{ObjecionElePen6.scriptAbrirVentanaProcesarFila2}"
                                                        rendered="#{ObjecionElePen6.asistente.comandoDisponible}"
                                                        text="#{ObjecionElePen6.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{ObjecionElePen6.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{ObjecionElePen6.gestor.mensajeCambiosPorConfirmar}"/>
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
                                                    actionExpression="#{ObjecionElePen6.botonAgregar1_action}"
                                                    binding="#{ObjecionElePen6.botonAgregar1}"
                                                    disabled="#{ObjecionElePen6.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{ObjecionElePen6.gestor.scriptAgregar}"
                                                    rendered="#{ObjecionElePen6.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ObjecionElePen6.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{ObjecionElePen6.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{ObjecionElePen6.listaFuncionEdicion1}"
                                                    converter="#{ObjecionElePen6.converterListaFuncionEdicion1}"
                                                    disabled="#{ObjecionElePen6.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{ObjecionElePen6.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{ObjecionElePen6.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{ObjecionElePen6.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{ObjecionElePen6.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ObjecionElePen6.botonEditar1_action}"
                                                    binding="#{ObjecionElePen6.botonEditar1}"
                                                    disabled="#{ObjecionElePen6.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{ObjecionElePen6.gestor.scriptEditar}"
                                                    rendered="#{ObjecionElePen6.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ObjecionElePen6.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{ObjecionElePen6.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ObjecionElePen6.botonEliminar1_action}"
                                                    binding="#{ObjecionElePen6.botonEliminar1}"
                                                    disabled="#{ObjecionElePen6.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{ObjecionElePen6.gestor.scriptEliminar}"
                                                    rendered="#{ObjecionElePen6.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ObjecionElePen6.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{ObjecionElePen6.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ObjecionElePen6.botonAplicar1_action}"
                                                    binding="#{ObjecionElePen6.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{ObjecionElePen6.gestor.scriptAplicar}"
                                                    rendered="#{ObjecionElePen6.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ObjecionElePen6.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{ObjecionElePen6.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ObjecionElePen6.botonDeshacer1_action}"
                                                    binding="#{ObjecionElePen6.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{ObjecionElePen6.gestor.scriptDeshacer}"
                                                    rendered="#{ObjecionElePen6.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ObjecionElePen6.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{ObjecionElePen6.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ObjecionElePen6.botonConfirmar1_action}"
                                                    binding="#{ObjecionElePen6.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{ObjecionElePen6.gestor.scriptConfirmar}"
                                                    rendered="#{ObjecionElePen6.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ObjecionElePen6.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{ObjecionElePen6.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ObjecionElePen6.botonDescartar1_action}"
                                                    binding="#{ObjecionElePen6.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{ObjecionElePen6.gestor.scriptDescartar}"
                                                    rendered="#{ObjecionElePen6.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ObjecionElePen6.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{ObjecionElePen6.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{ObjecionElePen6.listaFuncionAccion1}"
                                                    converter="#{ObjecionElePen6.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{ObjecionElePen6.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{ObjecionElePen6.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{ObjecionElePen6.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{ObjecionElePen6.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ObjecionElePen6.botonProcesar1_action}"
                                                    binding="#{ObjecionElePen6.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{ObjecionElePen6.gestor.scriptProcesar}"
                                                    rendered="#{ObjecionElePen6.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ObjecionElePen6.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{ObjecionElePen6.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ObjecionElePen6.botonRefrescar1_action}"
                                                    binding="#{ObjecionElePen6.botonRefrescar1}"
                                                    disabled="#{ObjecionElePen6.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{ObjecionElePen6.gestor.scriptRefrescar}"
                                                    rendered="#{ObjecionElePen6.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ObjecionElePen6.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{ObjecionElePen6.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ObjecionElePen6.botonReconsultar1_action}"
                                                    binding="#{ObjecionElePen6.botonReconsultar1}"
                                                    disabled="#{ObjecionElePen6.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{ObjecionElePen6.gestor.scriptReconsultar}"
                                                    rendered="#{ObjecionElePen6.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ObjecionElePen6.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{ObjecionElePen6.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ObjecionElePen6.botonRetornar1_action}"
                                                    binding="#{ObjecionElePen6.botonRetornar1}"
                                                    disabled="#{ObjecionElePen6.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{ObjecionElePen6.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{ObjecionElePen6.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ObjecionElePen6.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{ObjecionElePen6.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel125"
                                                rendered="#{ObjecionElePen6.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{ObjecionElePen6.imageHyperlink1_action}"
                                                    binding="#{ObjecionElePen6.imageHyperlink1}"
                                                    disabled="#{ObjecionElePen6.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{ObjecionElePen6.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{ObjecionElePen6.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{ObjecionElePen6.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.ObjecionElePen6_imageHyperlink1_toolTip}"/>
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
